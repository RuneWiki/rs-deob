import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NUXITFPR")
public class class31 extends class20 {

    @OriginalMember(owner = "NUXITFPR", name = "x", descriptor = "I")
    private int field1146 = -184;

    @OriginalMember(owner = "NUXITFPR", name = "y", descriptor = "I")
    private int field1147 = 859;

    @OriginalMember(owner = "NUXITFPR", name = "z", descriptor = "B")
    private byte field1148 = -126;

    @OriginalMember(owner = "NUXITFPR", name = "A", descriptor = "Z")
    private boolean field1149 = false;

    @OriginalMember(owner = "NUXITFPR", name = "B", descriptor = "Z")
    private boolean field1150 = true;

    @OriginalMember(owner = "NUXITFPR", name = "C", descriptor = "B")
    private byte field1151 = 43;

    @OriginalMember(owner = "NUXITFPR", name = "D", descriptor = "Z")
    private boolean field1152 = false;

    @OriginalMember(owner = "NUXITFPR", name = "E", descriptor = "I")
    private int field1153 = -300;

    @OriginalMember(owner = "NUXITFPR", name = "F", descriptor = "Z")
    private boolean field1154 = false;

    @OriginalMember(owner = "NUXITFPR", name = "G", descriptor = "[I")
    public int[] field1155;

    @OriginalMember(owner = "NUXITFPR", name = "L", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "NUXITFPR", name = "H", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "NUXITFPR", name = "M", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "NUXITFPR", name = "I", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "NUXITFPR", name = "K", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "NUXITFPR", name = "J", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "NUXITFPR", name = "<init>", descriptor = "(II)V")
    public class31(int arg0, int arg1) {
        this.field1155 = new int[arg0 * arg1];
        this.field1156 = this.field1160 = arg0;
        this.field1157 = this.field1161 = arg1;
        this.field1158 = this.field1159 = 0;
    }

    @OriginalMember(owner = "NUXITFPR", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class31(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1156 = var3.getWidth(arg1);
            this.field1157 = var3.getHeight(arg1);
            this.field1160 = this.field1156;
            this.field1161 = this.field1157;
            this.field1158 = 0;
            this.field1159 = 0;
            this.field1155 = new int[this.field1157 * this.field1156];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1156, this.field1157, this.field1155, 0, this.field1156);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "<init>", descriptor = "(LDTIATKJO;Ljava/lang/String;I)V")
    public class31(class8 arg0, String arg1, int arg2) {
        class14 var4 = new class14(-527, arg0.method168(arg1 + ".dat", null));
        class14 var5 = new class14(-527, arg0.method168("index.dat", null));
        var5.field769 = var4.method204();
        this.field1160 = var5.method204();
        this.field1161 = var5.method204();
        int var6 = var5.method202();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method206();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field769 += 2;
            var4.field769 += var5.method204() * var5.method204();
            var5.field769++;
        }
        this.field1158 = var5.method202();
        this.field1159 = var5.method202();
        this.field1156 = var5.method204();
        this.field1157 = var5.method204();
        int var10 = var5.method202();
        int var11 = this.field1157 * this.field1156;
        this.field1155 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1155[var12] = var7[var4.method202()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1156; var13++) {
                for (int var14 = 0; var14 < this.field1157; var14++) {
                    this.field1155[this.field1156 * var14 + var13] = var7[var4.method202()];
                }
            }
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "(B)V")
    public void method371(byte arg0) {
        class20.method283(this.field1156, this.field1157, (byte) -31, this.field1155);
        if (arg0 != -56) {
            this.field1154 = !this.field1154;
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "(IIII)V")
    public void method372(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 43 / arg2;
        for (int var6 = 0; var6 < this.field1155.length; var6++) {
            int var7 = this.field1155[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg1 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg3 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var7 & 0xFF;
                int var13 = arg0 + var12;
                if (var13 < 1) {
                    var13 = 1;
                } else if (var13 > 255) {
                    var13 = 255;
                }
                this.field1155[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "c", descriptor = "(I)V")
    public void method373(int arg0) {
        int[] var2 = new int[this.field1161 * this.field1160];
        for (int var3 = 0; var3 < this.field1157; var3++) {
            for (int var5 = 0; var5 < this.field1156; var5++) {
                var2[(this.field1159 + var3) * this.field1160 + this.field1158 + var5] = this.field1155[this.field1156 * var3 + var5];
            }
        }
        this.field1155 = var2;
        this.field1156 = this.field1160;
        this.field1157 = this.field1161;
        int var4 = 67 / arg0;
        this.field1158 = 0;
        this.field1159 = 0;
    }

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "(III)V")
    public void method374(int arg0, int arg1, int arg2) {
        int var4 = this.field1158 + arg1;
        int var5 = this.field1159 + arg0;
        int var6 = class20.field933 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1157;
        int var9 = this.field1156;
        int var10 = class20.field933 - var9;
        int var11 = 0;
        if (arg2 <= 0) {
            return;
        }
        if (var5 < class20.field935) {
            int var12 = class20.field935 - var5;
            var8 -= var12;
            var5 = class20.field935;
            var7 += var9 * var12;
            var6 += class20.field933 * var12;
        }
        if (var5 + var8 > class20.field936) {
            var8 -= var5 + var8 - class20.field936;
        }
        if (var4 < class20.field937) {
            int var13 = class20.field937 - var4;
            var9 -= var13;
            var4 = class20.field937;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class20.field938) {
            int var14 = var4 + var9 - class20.field938;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method375(var11, this.field1155, class20.field932, var9, var7, var6, var10, this.field1148, var8);
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "(I[I[IIIIIBI)V")
    private void method375(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        int var10 = -(arg3 >> 2);
        int var11 = -(arg3 & 0x3);
        for (int var12 = -arg8; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg2[arg5++] = arg1[arg4++];
                arg2[arg5++] = arg1[arg4++];
                arg2[arg5++] = arg1[arg4++];
                arg2[arg5++] = arg1[arg4++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg2[arg5++] = arg1[arg4++];
            }
            arg5 += arg6;
            arg4 += arg0;
        }
        if (this.field1148 != arg7) {
            this.field1147 = 114;
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "(IZI)V")
    public void method376(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return;
        }
        int var4 = this.field1158 + arg2;
        int var5 = this.field1159 + arg0;
        int var6 = class20.field933 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1157;
        int var9 = this.field1156;
        int var10 = class20.field933 - var9;
        int var11 = 0;
        if (var5 < class20.field935) {
            int var12 = class20.field935 - var5;
            var8 -= var12;
            var5 = class20.field935;
            var7 += var9 * var12;
            var6 += class20.field933 * var12;
        }
        if (var5 + var8 > class20.field936) {
            var8 -= var5 + var8 - class20.field936;
        }
        if (var4 < class20.field937) {
            int var13 = class20.field937 - var4;
            var9 -= var13;
            var4 = class20.field937;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class20.field938) {
            int var14 = var4 + var9 - class20.field938;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method377(class20.field932, this.field1155, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method377(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "(IIIZ)V")
    public void method378(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = this.field1158 + arg0;
        if (arg3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = this.field1159 + arg2;
        int var8 = class20.field933 * var7 + var5;
        int var9 = 0;
        int var10 = this.field1157;
        int var11 = this.field1156;
        int var12 = class20.field933 - var11;
        int var13 = 0;
        if (var7 < class20.field935) {
            int var14 = class20.field935 - var7;
            var10 -= var14;
            var7 = class20.field935;
            var9 += var11 * var14;
            var8 += class20.field933 * var14;
        }
        if (var7 + var10 > class20.field936) {
            var10 -= var7 + var10 - class20.field936;
        }
        if (var5 < class20.field937) {
            int var15 = class20.field937 - var5;
            var11 -= var15;
            var5 = class20.field937;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class20.field938) {
            int var16 = var5 + var11 - class20.field938;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method379(var13, (byte) 5, class20.field932, var11, var12, 0, arg1, var10, this.field1155, var9, var8);
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "(IB[IIIIII[III)V")
    private void method379(int arg0, byte arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = 256 - arg6;
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = arg8[arg9++];
                if (var15 == 0) {
                    arg10++;
                } else {
                    int var16 = arg2[arg10];
                    arg2[arg10++] = ((var15 & 0xFF00FF) * arg6 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg6 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg10 += arg4;
            arg9 += arg0;
        }
        if (arg1 != 5) {
            this.field1147 = 0;
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "([IIIIIZIIII[I)V")
    public void method380(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        if (!arg5) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg2 / 2;
            int var14 = -arg7 / 2;
            int var15 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
            int var17 = arg9 * var15 >> 8;
            int var18 = arg9 * var16 >> 8;
            int var19 = (arg1 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg3 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class20.field933 * arg4 + arg6;
            for (int var22 = 0; var22 < arg7; var22++) {
                int var23 = arg10[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg0[var22]; var27 < 0; var27++) {
                    class20.field932[var24++] = this.field1155[(var25 >> 16) + (var26 >> 16) * this.field1156];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class20.field933;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "(IIDIIIIII)V")
    public void method381(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 != -20448) {
            return;
        }
        try {
            int var11 = -arg3 / 2;
            int var12 = -arg5 / 2;
            int var13 = (int) (Math.sin(arg2) * 65536.0D);
            int var14 = (int) (Math.cos(arg2) * 65536.0D);
            int var15 = arg4 * var13 >> 8;
            int var16 = arg4 * var14 >> 8;
            int var17 = (arg6 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg0 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class20.field933 * arg1 + arg8;
            for (int var20 = 0; var20 < arg5; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg3; var24 < 0; var24++) {
                    int var25 = this.field1155[(var22 >> 16) + (var23 >> 16) * this.field1156];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class20.field932[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class20.field933;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "(ILKZTQXFDC;ZI)V")
    public void method382(int arg0, class23 arg1, boolean arg2, int arg3) {
        int var5 = this.field1158 + arg0;
        int var6 = this.field1159 + arg3;
        int var7 = class20.field933 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1157;
        int var10 = this.field1156;
        int var11 = class20.field933 - var10;
        int var12 = 0;
        if (var6 < class20.field935) {
            int var13 = class20.field935 - var6;
            var9 -= var13;
            var6 = class20.field935;
            var8 += var10 * var13;
            var7 += class20.field933 * var13;
        }
        if (var6 + var9 > class20.field936) {
            var9 -= var6 + var9 - class20.field936;
        }
        if (var5 < class20.field937) {
            int var14 = class20.field937 - var5;
            var10 -= var14;
            var5 = class20.field937;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class20.field938) {
            int var15 = var5 + var10 - class20.field938;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method383(var11, var12, this.field1155, var7, class20.field932, var8, arg1.field977, var10, var9, 14034, 0);
            if (arg2) {
                this.field1147 = -440;
            }
        }
    }

    @OriginalMember(owner = "NUXITFPR", name = "a", descriptor = "(II[II[II[BIIII)V")
    private void method383(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg7 >> 2);
        if (arg9 != 14034) {
            this.field1146 = -138;
        }
        int var13 = -(arg7 & 0x3);
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg2[arg5++];
                if (var18 != 0 && arg6[arg3] == 0) {
                    arg4[arg3++] = var18;
                } else {
                    arg3++;
                }
                int var19 = arg2[arg5++];
                if (var19 != 0 && arg6[arg3] == 0) {
                    arg4[arg3++] = var19;
                } else {
                    arg3++;
                }
                int var20 = arg2[arg5++];
                if (var20 != 0 && arg6[arg3] == 0) {
                    arg4[arg3++] = var20;
                } else {
                    arg3++;
                }
                int var21 = arg2[arg5++];
                if (var21 != 0 && arg6[arg3] == 0) {
                    arg4[arg3++] = var21;
                } else {
                    arg3++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg2[arg5++];
                if (var17 != 0 && arg6[arg3] == 0) {
                    arg4[arg3++] = var17;
                } else {
                    arg3++;
                }
            }
            arg3 += arg0;
            arg5 += arg1;
        }
    }
}
