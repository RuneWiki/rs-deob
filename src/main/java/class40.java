import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ODBDSPMH")
public class class40 extends class26 {

    @OriginalMember(owner = "ODBDSPMH", name = "x", descriptor = "Z")
    private boolean field1170 = true;

    @OriginalMember(owner = "ODBDSPMH", name = "y", descriptor = "I")
    private int field1171 = 6821;

    @OriginalMember(owner = "ODBDSPMH", name = "z", descriptor = "Z")
    private boolean field1172 = true;

    @OriginalMember(owner = "ODBDSPMH", name = "A", descriptor = "Z")
    private boolean field1173 = true;

    @OriginalMember(owner = "ODBDSPMH", name = "B", descriptor = "Z")
    private boolean field1174 = false;

    @OriginalMember(owner = "ODBDSPMH", name = "C", descriptor = "[I")
    public int[] field1175;

    @OriginalMember(owner = "ODBDSPMH", name = "H", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "ODBDSPMH", name = "D", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "ODBDSPMH", name = "I", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "ODBDSPMH", name = "E", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "ODBDSPMH", name = "G", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "ODBDSPMH", name = "F", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "ODBDSPMH", name = "<init>", descriptor = "(II)V")
    public class40(int arg0, int arg1) {
        this.field1175 = new int[arg0 * arg1];
        this.field1176 = this.field1180 = arg0;
        this.field1177 = this.field1181 = arg1;
        this.field1178 = this.field1179 = 0;
    }

    @OriginalMember(owner = "ODBDSPMH", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class40(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1176 = var3.getWidth(arg1);
            this.field1177 = var3.getHeight(arg1);
            this.field1180 = this.field1176;
            this.field1181 = this.field1177;
            this.field1178 = 0;
            this.field1179 = 0;
            this.field1175 = new int[this.field1177 * this.field1176];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1176, this.field1177, this.field1175, 0, this.field1176);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "<init>", descriptor = "(LBBMKAXRK;Ljava/lang/String;I)V")
    public class40(class6 arg0, String arg1, int arg2) {
        class17 var4 = new class17(arg0.method30(arg1 + ".dat", null), -26583);
        class17 var5 = new class17(arg0.method30("index.dat", null), -26583);
        var5.field779 = var4.method226();
        this.field1180 = var5.method226();
        this.field1181 = var5.method226();
        int var6 = var5.method224();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method228();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field779 += 2;
            var4.field779 += var5.method226() * var5.method226();
            var5.field779++;
        }
        this.field1178 = var5.method224();
        this.field1179 = var5.method224();
        this.field1176 = var5.method226();
        this.field1177 = var5.method226();
        int var10 = var5.method224();
        int var11 = this.field1177 * this.field1176;
        this.field1175 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1175[var12] = var7[var4.method224()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field1176; var13++) {
                    for (int var14 = 0; var14 < this.field1177; var14++) {
                        this.field1175[this.field1176 * var14 + var13] = var7[var4.method224()];
                    }
                }
            }
            if (class30.field987) {
            }
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "b", descriptor = "(B)V")
    public void method399(byte arg0) {
        if (arg0 == 58) {
            class26.method310(this.field1177, this.field1175, this.field1171, this.field1176);
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "a", descriptor = "(IIII)V")
    public void method400(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1175.length; var5++) {
            int var6 = this.field1175[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg1 + var7;
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
                int var12 = arg0 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field1175[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg2 != -35373) {
            this.field1173 = !this.field1173;
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "b", descriptor = "(I)V")
    public void method401(int arg0) {
        int[] var2 = new int[this.field1181 * this.field1180];
        for (int var3 = 0; var3 < this.field1177; var3++) {
            for (int var4 = 0; var4 < this.field1176; var4++) {
                var2[(this.field1179 + var3) * this.field1180 + this.field1178 + var4] = this.field1175[this.field1176 * var3 + var4];
            }
        }
        if (arg0 >= 0) {
            return;
        }
        this.field1175 = var2;
        this.field1176 = this.field1180;
        this.field1177 = this.field1181;
        this.field1178 = 0;
        this.field1179 = 0;
    }

    @OriginalMember(owner = "ODBDSPMH", name = "a", descriptor = "(III)V")
    public void method402(int arg0, int arg1, int arg2) {
        int var4 = this.field1178 + arg1;
        int var5 = this.field1179 + arg0;
        int var6 = class26.field877 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1177;
        int var9 = this.field1176;
        int var10 = class26.field877 - var9;
        int var11 = 0;
        if (var5 < class26.field879) {
            int var12 = class26.field879 - var5;
            var8 -= var12;
            var5 = class26.field879;
            var7 += var9 * var12;
            var6 += class26.field877 * var12;
        }
        if (var5 + var8 > class26.field880) {
            var8 -= var5 + var8 - class26.field880;
        }
        if (var4 < class26.field881) {
            int var13 = class26.field881 - var4;
            var9 -= var13;
            var4 = class26.field881;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class26.field882) {
            int var14 = var4 + var9 - class26.field882;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method403(this.field1175, var8, this.field1170, class26.field876, var6, var10, var7, var11, var9);
            if (arg2 > 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "a", descriptor = "([IIZ[IIIIII)V")
    private void method403(int[] arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg2) {
            return;
        }
        int var10 = -(arg8 >> 2);
        int var11 = -(arg8 & 0x3);
        for (int var12 = -arg1; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg3[arg4++] = arg0[arg6++];
                arg3[arg4++] = arg0[arg6++];
                arg3[arg4++] = arg0[arg6++];
                arg3[arg4++] = arg0[arg6++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg3[arg4++] = arg0[arg6++];
            }
            arg4 += arg5;
            arg6 += arg7;
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "b", descriptor = "(III)V")
    public void method404(int arg0, int arg1, int arg2) {
        int var4 = this.field1178 + arg0;
        int var5 = this.field1179 + arg2;
        int var6 = 13 / arg1;
        int var7 = class26.field877 * var5 + var4;
        int var8 = 0;
        int var9 = this.field1177;
        int var10 = this.field1176;
        int var11 = class26.field877 - var10;
        int var12 = 0;
        if (var5 < class26.field879) {
            int var13 = class26.field879 - var5;
            var9 -= var13;
            var5 = class26.field879;
            var8 += var10 * var13;
            var7 += class26.field877 * var13;
        }
        if (var5 + var9 > class26.field880) {
            var9 -= var5 + var9 - class26.field880;
        }
        if (var4 < class26.field881) {
            int var14 = class26.field881 - var4;
            var10 -= var14;
            var4 = class26.field881;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class26.field882) {
            int var15 = var4 + var10 - class26.field882;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method405(class26.field876, this.field1175, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method405(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "ODBDSPMH", name = "b", descriptor = "(IIII)V")
    public void method406(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1178 + arg1;
        int var6 = this.field1179 + arg2;
        if (arg3 < 3 || arg3 > 3) {
            return;
        }
        int var7 = class26.field877 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1177;
        int var10 = this.field1176;
        int var11 = class26.field877 - var10;
        int var12 = 0;
        if (var6 < class26.field879) {
            int var13 = class26.field879 - var6;
            var9 -= var13;
            var6 = class26.field879;
            var8 += var10 * var13;
            var7 += class26.field877 * var13;
        }
        if (var6 + var9 > class26.field880) {
            var9 -= var6 + var9 - class26.field880;
        }
        if (var5 < class26.field881) {
            int var14 = class26.field881 - var5;
            var10 -= var14;
            var5 = class26.field881;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class26.field882) {
            int var15 = var5 + var10 - class26.field882;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method407(var12, (byte) 2, var7, 0, class26.field876, arg0, this.field1175, var10, var11, var9, var8);
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "a", descriptor = "(IBII[II[IIIII)V")
    private void method407(int arg0, byte arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg5;
        if (arg1 == 2) {
            boolean var13 = false;
        } else {
            this.field1172 = !this.field1172;
        }
        for (int var14 = -arg9; var14 < 0; var14++) {
            for (int var15 = -arg7; var15 < 0; var15++) {
                int var16 = arg6[arg10++];
                if (var16 == 0) {
                    arg2++;
                } else {
                    int var17 = arg4[arg2];
                    arg4[arg2++] = ((var16 & 0xFF00FF) * arg5 + (var17 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var16 & 0xFF00) * arg5 + (var17 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg8;
            arg10 += arg0;
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "a", descriptor = "(IIIII[II[IIII)V")
    public void method408(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg8 != 0) {
            this.field1174 = !this.field1174;
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
            int var16 = arg0 * var14 >> 8;
            int var17 = arg0 * var15 >> 8;
            int var18 = (arg4 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg10 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class26.field877 * arg6 + arg9;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg5[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg7[var21]; var26 < 0; var26++) {
                    class26.field876[var23++] = this.field1175[(var24 >> 16) + (var25 >> 16) * this.field1176];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class26.field877;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "a", descriptor = "(IIIDIIIII)V")
    public void method409(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 != 0) {
            this.field1171 = 372;
        }
        try {
            int var11 = -arg8 / 2;
            int var12 = -arg2 / 2;
            int var13 = (int) (Math.sin(arg3) * 65536.0D);
            int var14 = (int) (Math.cos(arg3) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg1 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class26.field877 * arg6 + arg0;
            for (int var20 = 0; var20 < arg2; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg8; var24 < 0; var24++) {
                    int var25 = this.field1175[(var22 >> 16) + (var23 >> 16) * this.field1176];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class26.field876[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class26.field877;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "a", descriptor = "(IILFCRLGSQA;I)V")
    public void method410(int arg0, int arg1, class19 arg2, int arg3) {
        int var5 = this.field1178 + arg1;
        int var6 = this.field1179 + arg3;
        int var7 = class26.field877 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1177;
        int var10 = this.field1176;
        int var11 = class26.field877 - var10;
        int var12 = 0;
        if (arg0 != 41457) {
            this.field1172 = !this.field1172;
        }
        if (var6 < class26.field879) {
            int var13 = class26.field879 - var6;
            var9 -= var13;
            var6 = class26.field879;
            var8 += var10 * var13;
            var7 += class26.field877 * var13;
        }
        if (var6 + var9 > class26.field880) {
            var9 -= var6 + var9 - class26.field880;
        }
        if (var5 < class26.field881) {
            int var14 = class26.field881 - var5;
            var10 -= var14;
            var5 = class26.field881;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class26.field882) {
            int var15 = var5 + var10 - class26.field882;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method411(var8, 0, -528, var9, var7, arg2.field798, var11, var12, class26.field876, var10, this.field1175);
        }
    }

    @OriginalMember(owner = "ODBDSPMH", name = "a", descriptor = "(IIIII[BII[II[I)V")
    private void method411(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int[] arg8, int arg9, int[] arg10) {
        int var12 = -(arg9 >> 2);
        int var13 = -(arg9 & 0x3);
        if (arg2 >= 0) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        for (int var15 = -arg3; var15 < 0; var15++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg10[arg0++];
                if (var19 != 0 && arg5[arg4] == 0) {
                    arg8[arg4++] = var19;
                } else {
                    arg4++;
                }
                int var20 = arg10[arg0++];
                if (var20 != 0 && arg5[arg4] == 0) {
                    arg8[arg4++] = var20;
                } else {
                    arg4++;
                }
                int var21 = arg10[arg0++];
                if (var21 != 0 && arg5[arg4] == 0) {
                    arg8[arg4++] = var21;
                } else {
                    arg4++;
                }
                int var22 = arg10[arg0++];
                if (var22 != 0 && arg5[arg4] == 0) {
                    arg8[arg4++] = var22;
                } else {
                    arg4++;
                }
            }
            for (int var17 = var13; var17 < 0; var17++) {
                int var18 = arg10[arg0++];
                if (var18 != 0 && arg5[arg4] == 0) {
                    arg8[arg4++] = var18;
                } else {
                    arg4++;
                }
            }
            arg4 += arg6;
            arg0 += arg7;
        }
    }
}
