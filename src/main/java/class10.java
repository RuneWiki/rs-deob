import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DUMEPGRH")
public class class10 extends class53 {

    @OriginalMember(owner = "DUMEPGRH", name = "A", descriptor = "Z")
    private boolean field624 = true;

    @OriginalMember(owner = "DUMEPGRH", name = "C", descriptor = "Z")
    private boolean field626 = true;

    @OriginalMember(owner = "DUMEPGRH", name = "D", descriptor = "I")
    private int field627 = -44238;

    @OriginalMember(owner = "DUMEPGRH", name = "E", descriptor = "Z")
    private boolean field628 = true;

    @OriginalMember(owner = "DUMEPGRH", name = "G", descriptor = "Z")
    private boolean field630 = true;

    @OriginalMember(owner = "DUMEPGRH", name = "H", descriptor = "[I")
    public int[] field631;

    @OriginalMember(owner = "DUMEPGRH", name = "M", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "DUMEPGRH", name = "I", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "DUMEPGRH", name = "N", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "DUMEPGRH", name = "J", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "DUMEPGRH", name = "L", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "DUMEPGRH", name = "K", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "DUMEPGRH", name = "B", descriptor = "I")
    private static int field625;

    @OriginalMember(owner = "DUMEPGRH", name = "F", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "DUMEPGRH", name = "<init>", descriptor = "(II)V")
    public class10(int arg0, int arg1) {
        this.field631 = new int[arg0 * arg1];
        this.field632 = this.field636 = arg0;
        this.field633 = this.field637 = arg1;
        this.field634 = this.field635 = 0;
    }

    @OriginalMember(owner = "DUMEPGRH", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class10(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field632 = var3.getWidth(arg1);
            this.field633 = var3.getHeight(arg1);
            this.field636 = this.field632;
            this.field637 = this.field633;
            this.field634 = 0;
            this.field635 = 0;
            this.field631 = new int[this.field633 * this.field632];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field632, this.field633, this.field631, 0, this.field632);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "<init>", descriptor = "(LSPZBTZXL;Ljava/lang/String;I)V")
    public class10(class51 arg0, String arg1, int arg2) {
        class34 var4 = new class34(arg0.method515(arg1 + ".dat", null), field625);
        class34 var5 = new class34(arg0.method515("index.dat", null), field625);
        var5.field1073 = var4.method404();
        this.field636 = var5.method404();
        this.field637 = var5.method404();
        int var6 = var5.method402();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method406();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1073 += 2;
            var4.field1073 += var5.method404() * var5.method404();
            var5.field1073++;
        }
        this.field634 = var5.method402();
        this.field635 = var5.method402();
        this.field632 = var5.method404();
        this.field633 = var5.method404();
        int var10 = var5.method402();
        int var11 = this.field633 * this.field632;
        this.field631 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field631[var12] = var7[var4.method402()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field632; var13++) {
                for (int var14 = 0; var14 < this.field633; var14++) {
                    this.field631[this.field632 * var14 + var13] = var7[var4.method402()];
                }
            }
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "b", descriptor = "(Z)V")
    public void method214(boolean arg0) {
        class53.method516(this.field632, this.field631, this.field633, 6);
        if (arg0) {
            this.field627 = -143;
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "a", descriptor = "(IIII)V")
    public void method215(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field631.length; var5++) {
            int var6 = this.field631[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg1 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg0 + var9;
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
                this.field631[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg3 != 7547) {
            this.field627 = -327;
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "b", descriptor = "(I)V")
    public void method216(int arg0) {
        int[] var2 = new int[this.field637 * this.field636];
        for (int var3 = 0; var3 < this.field633; var3++) {
            for (int var4 = 0; var4 < this.field632; var4++) {
                var2[(this.field635 + var3) * this.field636 + this.field634 + var4] = this.field631[this.field632 * var3 + var4];
            }
        }
        this.field631 = var2;
        this.field632 = this.field636;
        this.field633 = this.field637;
        this.field634 = 0;
        this.field635 = 0;
        if (arg0 <= 0) {
            this.field627 = 365;
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "a", descriptor = "(ZII)V")
    public void method217(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return;
        }
        int var4 = this.field634 + arg1;
        int var5 = this.field635 + arg2;
        int var6 = class53.field1348 * var5 + var4;
        int var7 = 0;
        int var8 = this.field633;
        int var9 = this.field632;
        int var10 = class53.field1348 - var9;
        int var11 = 0;
        if (var5 < class53.field1350) {
            int var12 = class53.field1350 - var5;
            var8 -= var12;
            var5 = class53.field1350;
            var7 += var9 * var12;
            var6 += class53.field1348 * var12;
        }
        if (var5 + var8 > class53.field1351) {
            var8 -= var5 + var8 - class53.field1351;
        }
        if (var4 < class53.field1352) {
            int var13 = class53.field1352 - var4;
            var9 -= var13;
            var4 = class53.field1352;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class53.field1353) {
            int var14 = var4 + var9 - class53.field1353;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method218(false, var11, var10, var7, var6, var9, var8, class53.field1347, this.field631);
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "a", descriptor = "(ZIIIIII[I[I)V")
    private void method218(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg7[arg4++] = arg8[arg3++];
                arg7[arg4++] = arg8[arg3++];
                arg7[arg4++] = arg8[arg3++];
                arg7[arg4++] = arg8[arg3++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg7[arg4++] = arg8[arg3++];
            }
            arg4 += arg2;
            arg3 += arg1;
        }
        if (arg0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "a", descriptor = "(III)V")
    public void method219(int arg0, int arg1, int arg2) {
        int var4 = this.field634 + arg2;
        int var5 = this.field635 + arg1;
        int var6 = class53.field1348 * var5 + var4;
        int var7 = 0;
        int var8 = this.field633;
        int var9 = this.field632;
        int var10 = class53.field1348 - var9;
        int var11 = 0;
        if (arg0 <= 0) {
            this.field626 = !this.field626;
        }
        if (var5 < class53.field1350) {
            int var12 = class53.field1350 - var5;
            var8 -= var12;
            var5 = class53.field1350;
            var7 += var9 * var12;
            var6 += class53.field1348 * var12;
        }
        if (var5 + var8 > class53.field1351) {
            var8 -= var5 + var8 - class53.field1351;
        }
        if (var4 < class53.field1352) {
            int var13 = class53.field1352 - var4;
            var9 -= var13;
            var4 = class53.field1352;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class53.field1353) {
            int var14 = var4 + var9 - class53.field1353;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method220(class53.field1347, this.field631, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method220(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "DUMEPGRH", name = "b", descriptor = "(IIII)V")
    public void method221(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field634 + arg0;
        int var6 = this.field635 + arg3;
        int var7 = class53.field1348 * var6 + var5;
        int var8 = 0;
        int var9 = this.field633;
        int var10 = this.field632;
        int var11 = class53.field1348 - var10;
        int var12 = 0;
        if (var6 < class53.field1350) {
            int var13 = class53.field1350 - var6;
            var9 -= var13;
            var6 = class53.field1350;
            var8 += var10 * var13;
            var7 += class53.field1348 * var13;
        }
        if (var6 + var9 > class53.field1351) {
            var9 -= var6 + var9 - class53.field1351;
        }
        if (var5 < class53.field1352) {
            int var14 = class53.field1352 - var5;
            var10 -= var14;
            var5 = class53.field1352;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class53.field1353) {
            int var15 = var5 + var10 - class53.field1353;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return;
        }
        this.method222(this.field631, var7, var10, var8, var11, var12, this.field629, var9, 0, arg2, class53.field1347);
        if (arg1 != -7063) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "a", descriptor = "([IIIIIIIIII[I)V")
    private void method222(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg9;
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var15 = -arg2; var15 < 0; var15++) {
                int var16 = arg0[arg3++];
                if (var16 == 0) {
                    arg1++;
                } else {
                    int var17 = arg10[arg1];
                    arg10[arg1++] = ((var16 & 0xFF00FF) * arg9 + (var17 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var16 & 0xFF00) * arg9 + (var17 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg1 += arg4;
            arg3 += arg5;
        }
        if (arg6 != 0) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "a", descriptor = "(IIIIII[III[II)V")
    public void method223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int[] arg9, int arg10) {
        if (arg0 != -40142) {
            field625 = -16;
        }
        try {
            int var12 = -arg7 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
            int var16 = arg10 * var14 >> 8;
            int var17 = arg10 * var15 >> 8;
            int var18 = (arg4 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg5 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class53.field1348 * arg8 + arg1;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg6[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg9[var21]; var26 < 0; var26++) {
                    class53.field1347[var23++] = this.field631[(var24 >> 16) + (var25 >> 16) * this.field632];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class53.field1348;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "a", descriptor = "(IIIIIIDII)V")
    public void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7, int arg8) {
        if (arg2 != 4) {
            return;
        }
        try {
            int var11 = -arg8 / 2;
            int var12 = -arg1 / 2;
            int var13 = (int) (Math.sin(arg6) * 65536.0D);
            int var14 = (int) (Math.cos(arg6) * 65536.0D);
            int var15 = arg5 * var13 >> 8;
            int var16 = arg5 * var14 >> 8;
            int var17 = (arg0 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg7 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class53.field1348 * arg3 + arg4;
            for (int var20 = 0; var20 < arg1; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg8; var24 < 0; var24++) {
                    int var25 = this.field631[(var22 >> 16) + (var23 >> 16) * this.field632];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class53.field1347[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class53.field1348;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "a", descriptor = "(IILLKEIRLLI;Z)V")
    public void method225(int arg0, int arg1, class35 arg2, boolean arg3) {
        int var5 = this.field634 + arg1;
        int var6 = this.field635 + arg0;
        int var7 = class53.field1348 * var6 + var5;
        int var8 = 0;
        int var9 = this.field633;
        int var10 = this.field632;
        int var11 = class53.field1348 - var10;
        int var12 = 0;
        if (var6 < class53.field1350) {
            int var13 = class53.field1350 - var6;
            var9 -= var13;
            var6 = class53.field1350;
            var8 += var10 * var13;
            var7 += class53.field1348 * var13;
        }
        if (var6 + var9 > class53.field1351) {
            var9 -= var6 + var9 - class53.field1351;
        }
        if (var5 < class53.field1352) {
            int var14 = class53.field1352 - var5;
            var10 -= var14;
            var5 = class53.field1352;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class53.field1353) {
            int var15 = var5 + var10 - class53.field1353;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return;
        }
        this.method226(false, 0, var10, var8, var11, var7, this.field631, class53.field1347, var9, var12, arg2.field1091);
        if (!arg3) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
    }

    @OriginalMember(owner = "DUMEPGRH", name = "a", descriptor = "(ZIIIII[I[III[B)V")
    private void method226(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8, int arg9, byte[] arg10) {
        if (arg0) {
            return;
        }
        int var12 = -(arg2 >> 2);
        int var13 = -(arg2 & 0x3);
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg6[arg3++];
                if (var18 != 0 && arg10[arg5] == 0) {
                    arg7[arg5++] = var18;
                } else {
                    arg5++;
                }
                int var19 = arg6[arg3++];
                if (var19 != 0 && arg10[arg5] == 0) {
                    arg7[arg5++] = var19;
                } else {
                    arg5++;
                }
                int var20 = arg6[arg3++];
                if (var20 != 0 && arg10[arg5] == 0) {
                    arg7[arg5++] = var20;
                } else {
                    arg5++;
                }
                int var21 = arg6[arg3++];
                if (var21 != 0 && arg10[arg5] == 0) {
                    arg7[arg5++] = var21;
                } else {
                    arg5++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg6[arg3++];
                if (var17 != 0 && arg10[arg5] == 0) {
                    arg7[arg5++] = var17;
                } else {
                    arg5++;
                }
            }
            arg5 += arg4;
            arg3 += arg9;
        }
    }
}
