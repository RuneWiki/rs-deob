import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JONKABPT")
public class class37 extends class35 {

    @OriginalMember(owner = "JONKABPT", name = "z", descriptor = "Z")
    private boolean field1165 = true;

    @OriginalMember(owner = "JONKABPT", name = "A", descriptor = "I")
    private int field1166 = -609;

    @OriginalMember(owner = "JONKABPT", name = "B", descriptor = "B")
    private byte field1167 = 5;

    @OriginalMember(owner = "JONKABPT", name = "C", descriptor = "B")
    private byte field1168 = 4;

    @OriginalMember(owner = "JONKABPT", name = "D", descriptor = "Z")
    private boolean field1169 = false;

    @OriginalMember(owner = "JONKABPT", name = "E", descriptor = "Z")
    private boolean field1170 = true;

    @OriginalMember(owner = "JONKABPT", name = "F", descriptor = "I")
    private int field1171 = -49833;

    @OriginalMember(owner = "JONKABPT", name = "H", descriptor = "[I")
    public int[] field1173;

    @OriginalMember(owner = "JONKABPT", name = "M", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "JONKABPT", name = "I", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "JONKABPT", name = "N", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "JONKABPT", name = "J", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "JONKABPT", name = "L", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "JONKABPT", name = "K", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "JONKABPT", name = "G", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "JONKABPT", name = "<init>", descriptor = "(II)V")
    public class37(int arg0, int arg1) {
        this.field1173 = new int[arg0 * arg1];
        this.field1174 = this.field1178 = arg0;
        this.field1175 = this.field1179 = arg1;
        this.field1176 = this.field1177 = 0;
    }

    @OriginalMember(owner = "JONKABPT", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class37(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1174 = var3.getWidth(arg1);
            this.field1175 = var3.getHeight(arg1);
            this.field1178 = this.field1174;
            this.field1179 = this.field1175;
            this.field1176 = 0;
            this.field1177 = 0;
            this.field1173 = new int[this.field1175 * this.field1174];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1174, this.field1175, this.field1173, 0, this.field1174);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "JONKABPT", name = "<init>", descriptor = "(LEAXVDNXA;Ljava/lang/String;I)V")
    public class37(class12 arg0, String arg1, int arg2) {
        class5 var4 = new class5(2, arg0.method255(arg1 + ".dat", null));
        class5 var5 = new class5(2, arg0.method255("index.dat", null));
        var5.field123 = var4.method46();
        this.field1178 = var5.method46();
        this.field1179 = var5.method46();
        int var6 = var5.method44();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method48();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field123 += 2;
            var4.field123 += var5.method46() * var5.method46();
            var5.field123++;
        }
        this.field1176 = var5.method44();
        this.field1177 = var5.method44();
        this.field1174 = var5.method46();
        this.field1175 = var5.method46();
        int var10 = var5.method44();
        int var11 = this.field1175 * this.field1174;
        this.field1173 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1173[var12] = var7[var4.method44()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1174; var13++) {
                for (int var14 = 0; var14 < this.field1175; var14++) {
                    this.field1173[this.field1174 * var14 + var13] = var7[var4.method44()];
                }
            }
        }
    }

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "(Z)V")
    public void method424(boolean arg0) {
        if (!arg0) {
            this.field1165 = !this.field1165;
        }
        class35.method412(this.field1175, -8228, this.field1174, this.field1173);
    }

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "(IIII)V")
    public void method425(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1173.length; var5++) {
            int var6 = this.field1173[var5];
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
                this.field1173[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "JONKABPT", name = "b", descriptor = "(I)V")
    public void method426(int arg0) {
        int[] var2 = new int[this.field1179 * this.field1178];
        for (int var3 = 0; var3 < this.field1175; var3++) {
            for (int var4 = 0; var4 < this.field1174; var4++) {
                var2[(this.field1177 + var3) * this.field1178 + this.field1176 + var4] = this.field1173[this.field1174 * var3 + var4];
            }
        }
        this.field1173 = var2;
        this.field1174 = this.field1178;
        this.field1175 = this.field1179;
        this.field1176 = 0;
        if (arg0 != 0) {
            this.field1172 = -44;
        }
        this.field1177 = 0;
    }

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "(III)V")
    public void method427(int arg0, int arg1, int arg2) {
        int var4 = this.field1176 + arg1;
        int var5 = this.field1177 + arg0;
        int var6 = class35.field1130 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1175;
        int var9 = this.field1174;
        int var10 = class35.field1130 - var9;
        int var11 = 0;
        while (arg2 >= 0) {
            this.field1172 = 181;
        }
        if (var5 < class35.field1132) {
            int var12 = class35.field1132 - var5;
            var8 -= var12;
            var5 = class35.field1132;
            var7 += var9 * var12;
            var6 += class35.field1130 * var12;
        }
        if (var5 + var8 > class35.field1133) {
            var8 -= var5 + var8 - class35.field1133;
        }
        if (var4 < class35.field1134) {
            int var13 = class35.field1134 - var4;
            var9 -= var13;
            var4 = class35.field1134;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class35.field1135) {
            int var14 = var4 + var9 - class35.field1135;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method428(var9, class35.field1129, var7, 0, this.field1173, var10, var8, var11, var6);
        }
    }

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "(I[III[IIIII)V")
    private void method428(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 0) {
            this.field1165 = !this.field1165;
        }
        int var10 = -(arg0 >> 2);
        int var11 = -(arg0 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg1[arg8++] = arg4[arg2++];
                arg1[arg8++] = arg4[arg2++];
                arg1[arg8++] = arg4[arg2++];
                arg1[arg8++] = arg4[arg2++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg1[arg8++] = arg4[arg2++];
            }
            arg8 += arg5;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "(IIZ)V")
    public void method429(int arg0, int arg1, boolean arg2) {
        int var4 = this.field1176 + arg1;
        if (arg2) {
            this.field1172 = 430;
        }
        int var5 = this.field1177 + arg0;
        int var6 = class35.field1130 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1175;
        int var9 = this.field1174;
        int var10 = class35.field1130 - var9;
        int var11 = 0;
        if (var5 < class35.field1132) {
            int var12 = class35.field1132 - var5;
            var8 -= var12;
            var5 = class35.field1132;
            var7 += var9 * var12;
            var6 += class35.field1130 * var12;
        }
        if (var5 + var8 > class35.field1133) {
            var8 -= var5 + var8 - class35.field1133;
        }
        if (var4 < class35.field1134) {
            int var13 = class35.field1134 - var4;
            var9 -= var13;
            var4 = class35.field1134;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class35.field1135) {
            int var14 = var4 + var9 - class35.field1135;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method430(class35.field1129, this.field1173, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method430(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "(IBII)V")
    public void method431(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = this.field1176 + arg2;
        int var6 = this.field1177 + arg0;
        int var7 = class35.field1130 * var6 + var5;
        int var8 = 0;
        if (arg1 != -81) {
            return;
        }
        int var9 = this.field1175;
        int var10 = this.field1174;
        int var11 = class35.field1130 - var10;
        int var12 = 0;
        if (var6 < class35.field1132) {
            int var13 = class35.field1132 - var6;
            var9 -= var13;
            var6 = class35.field1132;
            var8 += var10 * var13;
            var7 += class35.field1130 * var13;
        }
        if (var6 + var9 > class35.field1133) {
            var9 -= var6 + var9 - class35.field1133;
        }
        if (var5 < class35.field1134) {
            int var14 = class35.field1134 - var5;
            var10 -= var14;
            var5 = class35.field1134;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class35.field1135) {
            int var15 = var5 + var10 - class35.field1135;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method432(var8, var12, 0, var10, arg3, class35.field1129, var9, this.field1173, var11, -734, var7);
        }
    }

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "(IIIII[II[IIII)V")
    private void method432(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg4;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = arg7[arg0++];
                if (var15 == 0) {
                    arg10++;
                } else {
                    int var16 = arg5[arg10];
                    arg5[arg10++] = ((var15 & 0xFF00FF) * arg4 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg4 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg10 += arg8;
            arg0 += arg1;
        }
        if (arg9 >= 0) {
            this.field1165 = !this.field1165;
        }
    }

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "([II[IIIBIIIII)V")
    public void method433(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg5 != 41) {
            this.field1166 = -112;
        }
        try {
            int var12 = -arg7 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
            int var16 = arg1 * var14 >> 8;
            int var17 = arg1 * var15 >> 8;
            int var18 = (arg4 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg10 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class35.field1130 * arg8 + arg6;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg0[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg2[var21]; var26 < 0; var26++) {
                    class35.field1129[var23++] = this.field1173[(var24 >> 16) + (var25 >> 16) * this.field1174];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class35.field1130;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "(IIIIIIIDI)V")
    public void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7, int arg8) {
        if (arg8 != 0) {
            this.field1170 = !this.field1170;
        }
        try {
            int var11 = -arg1 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin(arg7) * 65536.0D);
            int var14 = (int) (Math.cos(arg7) * 65536.0D);
            int var15 = arg4 * var13 >> 8;
            int var16 = arg4 * var14 >> 8;
            int var17 = (arg5 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg2 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class35.field1130 * arg0 + arg6;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg1; var24 < 0; var24++) {
                    int var25 = this.field1173[(var22 >> 16) + (var23 >> 16) * this.field1174];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class35.field1129[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class35.field1130;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "(LJQZFCGYF;III)V")
    public void method435(class38 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1176 + arg1;
        int var6 = this.field1177 + arg3;
        int var7 = class35.field1130 * var6 + var5;
        int var8 = 0;
        while (arg2 >= 0) {
            this.field1165 = !this.field1165;
        }
        int var9 = this.field1175;
        int var10 = this.field1174;
        int var11 = class35.field1130 - var10;
        int var12 = 0;
        if (var6 < class35.field1132) {
            int var13 = class35.field1132 - var6;
            var9 -= var13;
            var6 = class35.field1132;
            var8 += var10 * var13;
            var7 += class35.field1130 * var13;
        }
        if (var6 + var9 > class35.field1133) {
            var9 -= var6 + var9 - class35.field1133;
        }
        if (var5 < class35.field1134) {
            int var14 = class35.field1134 - var5;
            var10 -= var14;
            var5 = class35.field1134;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class35.field1135) {
            int var15 = var5 + var10 - class35.field1135;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method436(var7, arg0.field1184, 0, var9, this.field1173, class35.field1129, (byte) 0, var10, var8, var12, var11);
        }
    }

    @OriginalMember(owner = "JONKABPT", name = "a", descriptor = "(I[BII[I[IBIIII)V")
    private void method436(int arg0, byte[] arg1, int arg2, int arg3, int[] arg4, int[] arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg7 >> 2);
        int var13 = -(arg7 & 0x3);
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg4[arg8++];
                if (var18 != 0 && arg1[arg0] == 0) {
                    arg5[arg0++] = var18;
                } else {
                    arg0++;
                }
                int var19 = arg4[arg8++];
                if (var19 != 0 && arg1[arg0] == 0) {
                    arg5[arg0++] = var19;
                } else {
                    arg0++;
                }
                int var20 = arg4[arg8++];
                if (var20 != 0 && arg1[arg0] == 0) {
                    arg5[arg0++] = var20;
                } else {
                    arg0++;
                }
                int var21 = arg4[arg8++];
                if (var21 != 0 && arg1[arg0] == 0) {
                    arg5[arg0++] = var21;
                } else {
                    arg0++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg4[arg8++];
                if (var17 != 0 && arg1[arg0] == 0) {
                    arg5[arg0++] = var17;
                } else {
                    arg0++;
                }
            }
            arg0 += arg10;
            arg8 += arg9;
        }
        if (arg6 != 0) {
            this.field1166 = 484;
        }
    }
}
