import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BFUTXOBU")
public class class4 extends class36 {

    @OriginalMember(owner = "BFUTXOBU", name = "z", descriptor = "I")
    private int field33 = 641;

    @OriginalMember(owner = "BFUTXOBU", name = "A", descriptor = "B")
    private byte field34 = -77;

    @OriginalMember(owner = "BFUTXOBU", name = "B", descriptor = "Z")
    private boolean field35 = true;

    @OriginalMember(owner = "BFUTXOBU", name = "C", descriptor = "I")
    private int field36 = -592;

    @OriginalMember(owner = "BFUTXOBU", name = "D", descriptor = "B")
    private byte field37 = -22;

    @OriginalMember(owner = "BFUTXOBU", name = "E", descriptor = "I")
    private int field38 = 34;

    @OriginalMember(owner = "BFUTXOBU", name = "F", descriptor = "Z")
    private boolean field39 = false;

    @OriginalMember(owner = "BFUTXOBU", name = "G", descriptor = "I")
    private int field40 = -979;

    @OriginalMember(owner = "BFUTXOBU", name = "H", descriptor = "[I")
    public int[] field41;

    @OriginalMember(owner = "BFUTXOBU", name = "M", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "BFUTXOBU", name = "I", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "BFUTXOBU", name = "N", descriptor = "I")
    public int field47;

    @OriginalMember(owner = "BFUTXOBU", name = "J", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "BFUTXOBU", name = "L", descriptor = "I")
    public int field45;

    @OriginalMember(owner = "BFUTXOBU", name = "K", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "BFUTXOBU", name = "<init>", descriptor = "(II)V")
    public class4(int arg0, int arg1) {
        this.field41 = new int[arg0 * arg1];
        this.field42 = this.field46 = arg0;
        this.field43 = this.field47 = arg1;
        this.field44 = this.field45 = 0;
    }

    @OriginalMember(owner = "BFUTXOBU", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class4(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field42 = var3.getWidth(arg1);
            this.field43 = var3.getHeight(arg1);
            this.field46 = this.field42;
            this.field47 = this.field43;
            this.field44 = 0;
            this.field45 = 0;
            this.field41 = new int[this.field43 * this.field42];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field42, this.field43, this.field41, 0, this.field42);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "<init>", descriptor = "(LXMRRKSSB;Ljava/lang/String;I)V")
    public class4(class60 arg0, String arg1, int arg2) {
        class62 var4 = new class62(arg0.method465(arg1 + ".dat", null), 49938);
        class62 var5 = new class62(arg0.method465("index.dat", null), 49938);
        var5.field1542 = var4.method480();
        this.field46 = var5.method480();
        this.field47 = var5.method480();
        int var6 = var5.method478();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method482();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1542 += 2;
            var4.field1542 += var5.method480() * var5.method480();
            var5.field1542++;
        }
        this.field44 = var5.method478();
        this.field45 = var5.method478();
        this.field42 = var5.method480();
        this.field43 = var5.method480();
        int var10 = var5.method478();
        int var11 = this.field43 * this.field42;
        this.field41 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field41[var12] = var7[var4.method478()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field42; var13++) {
                for (int var14 = 0; var14 < this.field43; var14++) {
                    this.field41[this.field42 * var14 + var13] = var7[var4.method478()];
                }
            }
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "b", descriptor = "(Z)V")
    public void method8(boolean arg0) {
        class36.method339(this.field43, this.field42, this.field41, 0);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "a", descriptor = "(IIII)V")
    public void method9(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field41.length; var5++) {
            int var6 = this.field41[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg0 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg3 + var9;
                if (var10 < 1) {
                    var10 = 1;
                } else if (var10 > 255) {
                    var10 = 255;
                }
                int var11 = var6 & 0xFF;
                int var12 = arg2 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field41[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "b", descriptor = "(B)V")
    public void method10(byte arg0) {
        int[] var2 = new int[this.field47 * this.field46];
        for (int var3 = 0; var3 < this.field43; var3++) {
            for (int var6 = 0; var6 < this.field42; var6++) {
                var2[(this.field45 + var3) * this.field46 + this.field44 + var6] = this.field41[this.field42 * var3 + var6];
            }
        }
        if (arg0 == 4) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field41 = var2;
        this.field42 = this.field46;
        this.field43 = this.field47;
        this.field44 = 0;
        this.field45 = 0;
    }

    @OriginalMember(owner = "BFUTXOBU", name = "a", descriptor = "(III)V")
    public void method11(int arg0, int arg1, int arg2) {
        int var4 = this.field44 + arg1;
        int var5 = this.field45 + arg2;
        int var6 = 94 / arg0;
        int var7 = class36.field1089 * var5 + var4;
        int var8 = 0;
        int var9 = this.field43;
        int var10 = this.field42;
        int var11 = class36.field1089 - var10;
        int var12 = 0;
        if (var5 < class36.field1091) {
            int var13 = class36.field1091 - var5;
            var9 -= var13;
            var5 = class36.field1091;
            var8 += var10 * var13;
            var7 += class36.field1089 * var13;
        }
        if (var5 + var9 > class36.field1092) {
            var9 -= var5 + var9 - class36.field1092;
        }
        if (var4 < class36.field1093) {
            int var14 = class36.field1093 - var4;
            var10 -= var14;
            var4 = class36.field1093;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class36.field1094) {
            int var15 = var4 + var10 - class36.field1094;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method12(class36.field1088, this.field41, var8, var10, var11, var12, this.field34, var9, var7);
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "a", descriptor = "([I[IIIIIBII)V")
    private void method12(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        int var10 = -(arg3 >> 2);
        int var11 = -(arg3 & 0x3);
        if (arg6 != -77) {
            this.field39 = !this.field39;
        }
        for (int var12 = -arg7; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg0[arg8++] = arg1[arg2++];
                arg0[arg8++] = arg1[arg2++];
                arg0[arg8++] = arg1[arg2++];
                arg0[arg8++] = arg1[arg2++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg0[arg8++] = arg1[arg2++];
            }
            arg8 += arg4;
            arg2 += arg5;
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "b", descriptor = "(III)V")
    public void method13(int arg0, int arg1, int arg2) {
        if (arg0 != -41075) {
            return;
        }
        int var4 = this.field44 + arg2;
        int var5 = this.field45 + arg1;
        int var6 = class36.field1089 * var5 + var4;
        int var7 = 0;
        int var8 = this.field43;
        int var9 = this.field42;
        int var10 = class36.field1089 - var9;
        int var11 = 0;
        if (var5 < class36.field1091) {
            int var12 = class36.field1091 - var5;
            var8 -= var12;
            var5 = class36.field1091;
            var7 += var9 * var12;
            var6 += class36.field1089 * var12;
        }
        if (var5 + var8 > class36.field1092) {
            var8 -= var5 + var8 - class36.field1092;
        }
        if (var4 < class36.field1093) {
            int var13 = class36.field1093 - var4;
            var9 -= var13;
            var4 = class36.field1093;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class36.field1094) {
            int var14 = var4 + var9 - class36.field1094;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method14(class36.field1088, this.field41, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method14(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "BFUTXOBU", name = "a", descriptor = "(IIIZ)V")
    public void method15(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = this.field44 + arg1;
        if (!arg3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = this.field45 + arg2;
        int var8 = class36.field1089 * var7 + var5;
        int var9 = 0;
        int var10 = this.field43;
        int var11 = this.field42;
        int var12 = class36.field1089 - var11;
        int var13 = 0;
        if (var7 < class36.field1091) {
            int var14 = class36.field1091 - var7;
            var10 -= var14;
            var7 = class36.field1091;
            var9 += var11 * var14;
            var8 += class36.field1089 * var14;
        }
        if (var7 + var10 > class36.field1092) {
            var10 -= var7 + var10 - class36.field1092;
        }
        if (var5 < class36.field1093) {
            int var15 = class36.field1093 - var5;
            var11 -= var15;
            var5 = class36.field1093;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class36.field1094) {
            int var16 = var5 + var11 - class36.field1094;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method16(var13, var11, this.field36, var10, this.field41, var9, 0, arg0, class36.field1088, var12, var8);
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "a", descriptor = "(IIII[IIII[III)V")
    private void method16(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = 256 - arg7;
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = arg4[arg5++];
                if (var15 == 0) {
                    arg10++;
                } else {
                    int var16 = arg8[arg10];
                    arg8[arg10++] = ((var15 & 0xFF00FF) * arg7 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg7 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg10 += arg9;
            arg5 += arg0;
        }
        if (arg2 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "a", descriptor = "([I[IIIIIIIIII)V")
    public void method17(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg6 < 4 || arg6 > 4) {
            this.field36 = -204;
        }
        try {
            int var12 = -arg10 / 2;
            int var13 = -arg2 / 2;
            int var14 = (int) (Math.sin((double) arg5 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg5 / 326.11D) * 65536.0D);
            int var16 = arg9 * var14 >> 8;
            int var17 = arg9 * var15 >> 8;
            int var18 = (arg4 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg8 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class36.field1089 * arg3 + arg7;
            for (int var21 = 0; var21 < arg2; var21++) {
                int var22 = arg0[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg1[var21]; var26 < 0; var26++) {
                    class36.field1088[var23++] = this.field41[(var24 >> 16) + (var25 >> 16) * this.field42];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class36.field1089;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "a", descriptor = "(IIIDIIIII)V")
    public void method18(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var11 = 69 / arg0;
        try {
            int var12 = -arg5 / 2;
            int var13 = -arg2 / 2;
            int var14 = (int) (Math.sin(arg3) * 65536.0D);
            int var15 = (int) (Math.cos(arg3) * 65536.0D);
            int var16 = arg4 * var14 >> 8;
            int var17 = arg4 * var15 >> 8;
            int var18 = (arg6 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg7 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class36.field1089 * arg8 + arg1;
            for (int var21 = 0; var21 < arg2; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg5; var25 < 0; var25++) {
                    int var26 = this.field41[(var23 >> 16) + (var24 >> 16) * this.field42];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class36.field1088[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class36.field1089;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "a", descriptor = "(ILYPWLUGYN;II)V")
    public void method19(int arg0, class66 arg1, int arg2, int arg3) {
        if (arg0 >= 0) {
            return;
        }
        int var5 = this.field44 + arg3;
        int var6 = this.field45 + arg2;
        int var7 = class36.field1089 * var6 + var5;
        int var8 = 0;
        int var9 = this.field43;
        int var10 = this.field42;
        int var11 = class36.field1089 - var10;
        int var12 = 0;
        if (var6 < class36.field1091) {
            int var13 = class36.field1091 - var6;
            var9 -= var13;
            var6 = class36.field1091;
            var8 += var10 * var13;
            var7 += class36.field1089 * var13;
        }
        if (var6 + var9 > class36.field1092) {
            var9 -= var6 + var9 - class36.field1092;
        }
        if (var5 < class36.field1093) {
            int var14 = class36.field1093 - var5;
            var10 -= var14;
            var5 = class36.field1093;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class36.field1094) {
            int var15 = var5 + var10 - class36.field1094;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method20(var7, 0, var9, arg1.field1597, 0, class36.field1088, var10, var12, var11, var8, this.field41);
        }
    }

    @OriginalMember(owner = "BFUTXOBU", name = "a", descriptor = "(III[BI[IIIII[I)V")
    private void method20(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        if (arg1 != 0) {
            this.field33 = 313;
        }
        int var12 = -(arg6 >> 2);
        int var13 = -(arg6 & 0x3);
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg10[arg9++];
                if (var18 != 0 && arg3[arg0] == 0) {
                    arg5[arg0++] = var18;
                } else {
                    arg0++;
                }
                int var19 = arg10[arg9++];
                if (var19 != 0 && arg3[arg0] == 0) {
                    arg5[arg0++] = var19;
                } else {
                    arg0++;
                }
                int var20 = arg10[arg9++];
                if (var20 != 0 && arg3[arg0] == 0) {
                    arg5[arg0++] = var20;
                } else {
                    arg0++;
                }
                int var21 = arg10[arg9++];
                if (var21 != 0 && arg3[arg0] == 0) {
                    arg5[arg0++] = var21;
                } else {
                    arg0++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg10[arg9++];
                if (var17 != 0 && arg3[arg0] == 0) {
                    arg5[arg0++] = var17;
                } else {
                    arg0++;
                }
            }
            arg0 += arg8;
            arg9 += arg7;
        }
    }
}
