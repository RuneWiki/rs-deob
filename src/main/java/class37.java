import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OMAKLDKI")
public class class37 extends class8 {

    @OriginalMember(owner = "client!OMAKLDKI", name = "w", descriptor = "I")
    private int field1135 = 6;

    @OriginalMember(owner = "client!OMAKLDKI", name = "x", descriptor = "Z")
    private boolean field1136 = true;

    @OriginalMember(owner = "client!OMAKLDKI", name = "y", descriptor = "Z")
    private boolean field1137 = false;

    @OriginalMember(owner = "client!OMAKLDKI", name = "z", descriptor = "I")
    private int field1138 = -653;

    @OriginalMember(owner = "client!OMAKLDKI", name = "A", descriptor = "B")
    private byte field1139 = 9;

    @OriginalMember(owner = "client!OMAKLDKI", name = "B", descriptor = "I")
    private int field1140 = 726;

    @OriginalMember(owner = "client!OMAKLDKI", name = "C", descriptor = "B")
    private byte field1141 = 0;

    @OriginalMember(owner = "client!OMAKLDKI", name = "D", descriptor = "Z")
    private boolean field1142 = true;

    @OriginalMember(owner = "client!OMAKLDKI", name = "E", descriptor = "B")
    private byte field1143 = 5;

    @OriginalMember(owner = "client!OMAKLDKI", name = "F", descriptor = "Z")
    private boolean field1144 = true;

    @OriginalMember(owner = "client!OMAKLDKI", name = "G", descriptor = "I")
    private int field1145 = -22770;

    @OriginalMember(owner = "client!OMAKLDKI", name = "H", descriptor = "[I")
    public int[] field1146;

    @OriginalMember(owner = "client!OMAKLDKI", name = "M", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "client!OMAKLDKI", name = "I", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "client!OMAKLDKI", name = "N", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!OMAKLDKI", name = "J", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!OMAKLDKI", name = "L", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!OMAKLDKI", name = "K", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!OMAKLDKI", name = "<init>", descriptor = "(II)V")
    public class37(int arg0, int arg1) {
        this.field1146 = new int[arg0 * arg1];
        this.field1147 = this.field1151 = arg0;
        this.field1148 = this.field1152 = arg1;
        this.field1149 = this.field1150 = 0;
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class37(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1147 = var3.getWidth(arg1);
            this.field1148 = var3.getHeight(arg1);
            this.field1151 = this.field1147;
            this.field1152 = this.field1148;
            this.field1149 = 0;
            this.field1150 = 0;
            this.field1146 = new int[this.field1148 * this.field1147];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1147, this.field1148, this.field1146, 0, this.field1147);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "<init>", descriptor = "(LWEMOPWVJ;Ljava/lang/String;I)V")
    public class37(class62 arg0, String arg1, int arg2) {
        class52 var4 = new class52(arg0.method559(arg1 + ".dat", null), true);
        class52 var5 = new class52(arg0.method559("index.dat", null), true);
        var5.field1434 = var4.method463();
        this.field1151 = var5.method463();
        this.field1152 = var5.method463();
        int var6 = var5.method461();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method465();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1434 += 2;
            var4.field1434 += var5.method463() * var5.method463();
            var5.field1434++;
        }
        this.field1149 = var5.method461();
        this.field1150 = var5.method461();
        this.field1147 = var5.method463();
        this.field1148 = var5.method463();
        int var10 = var5.method461();
        int var11 = this.field1148 * this.field1147;
        this.field1146 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1146[var12] = var7[var4.method461()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1147; var13++) {
                for (int var14 = 0; var14 < this.field1148; var14++) {
                    this.field1146[this.field1147 * var14 + var13] = var7[var4.method461()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "c", descriptor = "(I)V")
    public void method346(int arg0) {
        if (arg0 < 0) {
            class8.method159(this.field1146, this.field1147, this.field1148, false);
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(IIII)V")
    public void method347(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 0) {
            this.field1137 = !this.field1137;
        }
        for (int var5 = 0; var5 < this.field1146.length; var5++) {
            int var6 = this.field1146[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg3 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg1 + var9;
                if (var10 < 1) {
                    var10 = 1;
                } else if (var10 > 255) {
                    var10 = 255;
                }
                int var11 = var6 & 0xFF;
                int var12 = arg0 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field1146[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "d", descriptor = "(I)V")
    public void method348(int arg0) {
        int[] var2 = new int[this.field1152 * this.field1151];
        for (int var3 = 0; var3 < this.field1148; var3++) {
            for (int var4 = 0; var4 < this.field1147; var4++) {
                var2[(this.field1150 + var3) * this.field1151 + this.field1149 + var4] = this.field1146[this.field1147 * var3 + var4];
            }
        }
        this.field1146 = var2;
        this.field1147 = this.field1151;
        this.field1148 = this.field1152;
        if (arg0 <= 0) {
            this.field1135 = 41;
        }
        this.field1149 = 0;
        this.field1150 = 0;
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(III)V")
    public void method349(int arg0, int arg1, int arg2) {
        int var4 = this.field1149 + arg1;
        int var5 = this.field1150 + arg2;
        int var6 = class8.field582 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1148;
        int var9 = this.field1147;
        int var10 = class8.field582 - var9;
        int var11 = 0;
        if (var5 < class8.field584) {
            int var12 = class8.field584 - var5;
            var8 -= var12;
            var5 = class8.field584;
            var7 += var9 * var12;
            var6 += class8.field582 * var12;
        }
        if (var5 + var8 > class8.field585) {
            var8 -= var5 + var8 - class8.field585;
        }
        if (var4 < class8.field586) {
            int var13 = class8.field586 - var4;
            var9 -= var13;
            var4 = class8.field586;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class8.field587) {
            int var14 = var4 + var9 - class8.field587;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 <= 0 || var8 <= 0) {
            return;
        }
        this.method350(var6, var10, var7, var11, this.field1146, -750, var8, var9, class8.field581);
        if (arg0 < 8 || arg0 > 8) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(IIII[IIII[I)V")
    private void method350(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg7 >> 2);
        if (arg5 >= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = -(arg7 & 0x3);
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg8[arg0++] = arg4[arg2++];
                arg8[arg0++] = arg4[arg2++];
                arg8[arg0++] = arg4[arg2++];
                arg8[arg0++] = arg4[arg2++];
            }
            for (int var15 = var12; var15 < 0; var15++) {
                arg8[arg0++] = arg4[arg2++];
            }
            arg0 += arg1;
            arg2 += arg3;
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(IIB)V")
    public void method351(int arg0, int arg1, byte arg2) {
        int var4 = this.field1149 + arg1;
        int var5 = this.field1150 + arg0;
        if (arg2 == 0) {
            boolean var6 = false;
        } else {
            this.field1145 = -302;
        }
        int var7 = class8.field582 * var5 + var4;
        int var8 = 0;
        int var9 = this.field1148;
        int var10 = this.field1147;
        int var11 = class8.field582 - var10;
        int var12 = 0;
        if (var5 < class8.field584) {
            int var13 = class8.field584 - var5;
            var9 -= var13;
            var5 = class8.field584;
            var8 += var10 * var13;
            var7 += class8.field582 * var13;
        }
        if (var5 + var9 > class8.field585) {
            var9 -= var5 + var9 - class8.field585;
        }
        if (var4 < class8.field586) {
            int var14 = class8.field586 - var4;
            var10 -= var14;
            var4 = class8.field586;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class8.field587) {
            int var15 = var4 + var10 - class8.field587;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method352(class8.field581, this.field1146, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method352(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                int var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var16;
                }
                int var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var17;
                }
                int var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var18;
                }
                int var19 = arg1[arg3++];
                if (var19 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var19;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "b", descriptor = "(IIII)V")
    public void method353(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1149 + arg2;
        int var6 = this.field1150 + arg1;
        int var7 = class8.field582 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1148;
        int var10 = this.field1147;
        int var11 = class8.field582 - var10;
        int var12 = 0;
        if (var6 < class8.field584) {
            int var13 = class8.field584 - var6;
            var9 -= var13;
            var6 = class8.field584;
            var8 += var10 * var13;
            var7 += class8.field582 * var13;
        }
        if (var6 + var9 > class8.field585) {
            var9 -= var6 + var9 - class8.field585;
        }
        if (var5 < class8.field586) {
            int var14 = class8.field586 - var5;
            var10 -= var14;
            var5 = class8.field586;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class8.field587) {
            int var15 = var5 + var10 - class8.field587;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method354(var10, var7, class8.field581, 0, var8, this.field1138, var9, var12, arg3, var11, this.field1146);
            if (arg0 == 36640) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(II[IIIIIIII[I)V")
    private void method354(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg8;
        if (arg5 >= 0) {
            return;
        }
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg0; var14 < 0; var14++) {
                int var15 = arg10[arg4++];
                if (var15 == 0) {
                    arg1++;
                } else {
                    int var16 = arg2[arg1];
                    arg2[arg1++] = ((var15 & 0xFF00FF) * arg8 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg8 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg1 += arg9;
            arg4 += arg7;
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(III[IIII[IIII)V")
    public void method355(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg2 != 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg0 / 2;
            int var14 = -arg8 / 2;
            int var15 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var17 = arg9 * var15 >> 8;
            int var18 = arg9 * var16 >> 8;
            int var19 = (arg4 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg10 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class8.field582 * arg1 + arg5;
            for (int var22 = 0; var22 < arg8; var22++) {
                int var23 = arg7[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg3[var22]; var27 < 0; var27++) {
                    class8.field581[var24++] = this.field1146[(var25 >> 16) + (var26 >> 16) * this.field1147];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class8.field582;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(ZIIIIIDII)V")
    public void method356(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7, int arg8) {
        if (!arg0) {
            this.field1145 = 253;
        }
        try {
            int var11 = -arg4 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin(arg6) * 65536.0D);
            int var14 = (int) (Math.cos(arg6) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg1 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class8.field582 * arg8 + arg2;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg4; var24 < 0; var24++) {
                    int var25 = this.field1146[(var22 >> 16) + (var23 >> 16) * this.field1147];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class8.field581[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class8.field582;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(ZIILZXDQRRNS;)V")
    public void method357(boolean arg0, int arg1, int arg2, class72 arg3) {
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field1149 + arg2;
        int var7 = this.field1150 + arg1;
        int var8 = class8.field582 * var7 + var6;
        int var9 = 0;
        int var10 = this.field1148;
        int var11 = this.field1147;
        int var12 = class8.field582 - var11;
        int var13 = 0;
        if (var7 < class8.field584) {
            int var14 = class8.field584 - var7;
            var10 -= var14;
            var7 = class8.field584;
            var9 += var11 * var14;
            var8 += class8.field582 * var14;
        }
        if (var7 + var10 > class8.field585) {
            var10 -= var7 + var10 - class8.field585;
        }
        if (var6 < class8.field586) {
            int var15 = class8.field586 - var6;
            var11 -= var15;
            var6 = class8.field586;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > class8.field587) {
            int var16 = var6 + var11 - class8.field587;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method358(class8.field581, 0, (byte) 5, var8, var10, arg3.field1725, var11, var9, this.field1146, var13, var12);
        }
    }

    @OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "([IIBII[BII[III)V")
    private void method358(int[] arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (this.field1143 != arg2) {
            this.field1137 = !this.field1137;
        }
        int var12 = -(arg6 >> 2);
        int var13 = -(arg6 & 0x3);
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg8[arg7++];
                if (var18 != 0 && arg5[arg3] == 0) {
                    arg0[arg3++] = var18;
                } else {
                    arg3++;
                }
                int var19 = arg8[arg7++];
                if (var19 != 0 && arg5[arg3] == 0) {
                    arg0[arg3++] = var19;
                } else {
                    arg3++;
                }
                int var20 = arg8[arg7++];
                if (var20 != 0 && arg5[arg3] == 0) {
                    arg0[arg3++] = var20;
                } else {
                    arg3++;
                }
                int var21 = arg8[arg7++];
                if (var21 != 0 && arg5[arg3] == 0) {
                    arg0[arg3++] = var21;
                } else {
                    arg3++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg8[arg7++];
                if (var17 != 0 && arg5[arg3] == 0) {
                    arg0[arg3++] = var17;
                } else {
                    arg3++;
                }
            }
            arg3 += arg10;
            arg7 += arg9;
        }
    }
}
