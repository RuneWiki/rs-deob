import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DLNMSHLT")
public class class12 extends class19 {

    @OriginalMember(owner = "DLNMSHLT", name = "x", descriptor = "Z")
    private boolean field612 = false;

    @OriginalMember(owner = "DLNMSHLT", name = "y", descriptor = "Z")
    private boolean field613 = true;

    @OriginalMember(owner = "DLNMSHLT", name = "z", descriptor = "I")
    private int field614 = -673;

    @OriginalMember(owner = "DLNMSHLT", name = "A", descriptor = "I")
    private int field615 = 3;

    @OriginalMember(owner = "DLNMSHLT", name = "B", descriptor = "I")
    private int field616 = -876;

    @OriginalMember(owner = "DLNMSHLT", name = "C", descriptor = "Z")
    private boolean field617 = true;

    @OriginalMember(owner = "DLNMSHLT", name = "D", descriptor = "Z")
    private boolean field618 = false;

    @OriginalMember(owner = "DLNMSHLT", name = "E", descriptor = "I")
    private int field619 = 4;

    @OriginalMember(owner = "DLNMSHLT", name = "F", descriptor = "[I")
    public int[] field620;

    @OriginalMember(owner = "DLNMSHLT", name = "K", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "DLNMSHLT", name = "G", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "DLNMSHLT", name = "L", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "DLNMSHLT", name = "H", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "DLNMSHLT", name = "J", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "DLNMSHLT", name = "I", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "DLNMSHLT", name = "<init>", descriptor = "(II)V")
    public class12(int arg0, int arg1) {
        this.field620 = new int[arg0 * arg1];
        this.field621 = this.field625 = arg0;
        this.field622 = this.field626 = arg1;
        this.field623 = this.field624 = 0;
    }

    @OriginalMember(owner = "DLNMSHLT", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class12(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field621 = var3.getWidth(arg1);
            this.field622 = var3.getHeight(arg1);
            this.field625 = this.field621;
            this.field626 = this.field622;
            this.field623 = 0;
            this.field624 = 0;
            this.field620 = new int[this.field622 * this.field621];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field621, this.field622, this.field620, 0, this.field621);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "<init>", descriptor = "(LHRXSNEYZ;Ljava/lang/String;I)V")
    public class12(class26 arg0, String arg1, int arg2) {
        class31 var4 = new class31(arg0.method289(arg1 + ".dat", null), 8);
        class31 var5 = new class31(arg0.method289("index.dat", null), 8);
        var5.field901 = var4.method308();
        this.field625 = var5.method308();
        this.field626 = var5.method308();
        int var6 = var5.method306();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method310();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field901 += 2;
            var4.field901 += var5.method308() * var5.method308();
            var5.field901++;
        }
        this.field623 = var5.method306();
        this.field624 = var5.method306();
        this.field621 = var5.method308();
        this.field622 = var5.method308();
        int var10 = var5.method306();
        int var11 = this.field622 * this.field621;
        this.field620 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field620[var12] = var7[var4.method306()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field621; var13++) {
                for (int var14 = 0; var14 < this.field622; var14++) {
                    this.field620[this.field621 * var14 + var13] = var7[var4.method306()];
                }
            }
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "c", descriptor = "(Z)V")
    public void method200(boolean arg0) {
        if (arg0) {
            class19.method230(this.field620, this.field621, this.field622, 334);
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "a", descriptor = "(IIII)V")
    public void method201(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field613 = !this.field613;
        }
        for (int var5 = 0; var5 < this.field620.length; var5++) {
            int var6 = this.field620[var5];
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
                int var12 = arg3 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field620[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "d", descriptor = "(Z)V")
    public void method202(boolean arg0) {
        if (!arg0) {
            return;
        }
        int[] var2 = new int[this.field626 * this.field625];
        for (int var3 = 0; var3 < this.field622; var3++) {
            for (int var4 = 0; var4 < this.field621; var4++) {
                var2[(this.field624 + var3) * this.field625 + this.field623 + var4] = this.field620[this.field621 * var3 + var4];
            }
        }
        this.field620 = var2;
        this.field621 = this.field625;
        this.field622 = this.field626;
        this.field623 = 0;
        this.field624 = 0;
    }

    @OriginalMember(owner = "DLNMSHLT", name = "a", descriptor = "(IIZ)V")
    public void method203(int arg0, int arg1, boolean arg2) {
        int var4 = this.field623 + arg0;
        int var5 = this.field624 + arg1;
        int var6 = class19.field685 * var5 + var4;
        int var7 = 0;
        if (arg2) {
            this.field619 = 162;
        }
        int var8 = this.field622;
        int var9 = this.field621;
        int var10 = class19.field685 - var9;
        int var11 = 0;
        if (var5 < class19.field687) {
            int var12 = class19.field687 - var5;
            var8 -= var12;
            var5 = class19.field687;
            var7 += var9 * var12;
            var6 += class19.field685 * var12;
        }
        if (var5 + var8 > class19.field688) {
            var8 -= var5 + var8 - class19.field688;
        }
        if (var4 < class19.field689) {
            int var13 = class19.field689 - var4;
            var9 -= var13;
            var4 = class19.field689;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class19.field690) {
            int var14 = var4 + var9 - class19.field690;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method204(var10, class19.field684, var11, -106, var7, var6, var8, var9, this.field620);
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "a", descriptor = "(I[IIIIIII[I)V")
    private void method204(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        if (arg3 >= 0) {
            return;
        }
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg1[arg5++] = arg8[arg4++];
                arg1[arg5++] = arg8[arg4++];
                arg1[arg5++] = arg8[arg4++];
                arg1[arg5++] = arg8[arg4++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg1[arg5++] = arg8[arg4++];
            }
            arg5 += arg0;
            arg4 += arg2;
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "a", descriptor = "(IIB)V")
    public void method205(int arg0, int arg1, byte arg2) {
        if (arg2 != 122) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = this.field623 + arg1;
        int var6 = this.field624 + arg0;
        int var7 = class19.field685 * var6 + var5;
        int var8 = 0;
        int var9 = this.field622;
        int var10 = this.field621;
        int var11 = class19.field685 - var10;
        int var12 = 0;
        if (var6 < class19.field687) {
            int var13 = class19.field687 - var6;
            var9 -= var13;
            var6 = class19.field687;
            var8 += var10 * var13;
            var7 += class19.field685 * var13;
        }
        if (var6 + var9 > class19.field688) {
            var9 -= var6 + var9 - class19.field688;
        }
        if (var5 < class19.field689) {
            int var14 = class19.field689 - var5;
            var10 -= var14;
            var5 = class19.field689;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class19.field690) {
            int var15 = var5 + var10 - class19.field690;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method206(class19.field684, this.field620, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method206(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "DLNMSHLT", name = "b", descriptor = "(IIII)V")
    public void method207(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field623 + arg0;
        int var6 = this.field624 + arg1;
        if (arg3 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = class19.field685 * var6 + var5;
        int var9 = 0;
        int var10 = this.field622;
        int var11 = this.field621;
        int var12 = class19.field685 - var11;
        int var13 = 0;
        if (var6 < class19.field687) {
            int var14 = class19.field687 - var6;
            var10 -= var14;
            var6 = class19.field687;
            var9 += var11 * var14;
            var8 += class19.field685 * var14;
        }
        if (var6 + var10 > class19.field688) {
            var10 -= var6 + var10 - class19.field688;
        }
        if (var5 < class19.field689) {
            int var15 = class19.field689 - var5;
            var11 -= var15;
            var5 = class19.field689;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class19.field690) {
            int var16 = var5 + var11 - class19.field690;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method208(class19.field684, 0, var10, var12, this.field620, arg2, var9, 0, var8, var11, var13);
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "a", descriptor = "([IIII[IIIIIII)V")
    private void method208(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg5;
        if (arg7 != 0) {
            return;
        }
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var14 = -arg9; var14 < 0; var14++) {
                int var15 = arg4[arg6++];
                if (var15 == 0) {
                    arg8++;
                } else {
                    int var16 = arg0[arg8];
                    arg0[arg8++] = ((var15 & 0xFF00FF) * arg5 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg5 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg8 += arg3;
            arg6 += arg10;
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "a", descriptor = "(I[IIIIII[IIII)V")
    public void method209(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        while (arg4 >= 0) {
            this.field612 = !this.field612;
        }
        try {
            int var12 = -arg8 / 2;
            int var13 = -arg2 / 2;
            int var14 = (int) (Math.sin((double) arg10 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg10 / 326.11D) * 65536.0D);
            int var16 = arg6 * var14 >> 8;
            int var17 = arg6 * var15 >> 8;
            int var18 = (arg0 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg5 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class19.field685 * arg3 + arg9;
            for (int var21 = 0; var21 < arg2; var21++) {
                int var22 = arg7[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg1[var21]; var26 < 0; var26++) {
                    class19.field684[var23++] = this.field620[(var24 >> 16) + (var25 >> 16) * this.field621];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class19.field685;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "a", descriptor = "(DIIIIIIII)V")
    public void method210(double arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 < 0 || arg5 > 0) {
            this.field618 = !this.field618;
        }
        try {
            int var11 = -arg1 / 2;
            int var12 = -arg4 / 2;
            int var13 = (int) (Math.sin(arg0) * 65536.0D);
            int var14 = (int) (Math.cos(arg0) * 65536.0D);
            int var15 = arg3 * var13 >> 8;
            int var16 = arg3 * var14 >> 8;
            int var17 = (arg6 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg2 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class19.field685 * arg7 + arg8;
            for (int var20 = 0; var20 < arg4; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg1; var24 < 0; var24++) {
                    int var25 = this.field620[(var22 >> 16) + (var23 >> 16) * this.field621];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class19.field684[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class19.field685;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "a", descriptor = "(LYAPSNHGU;III)V")
    public void method211(class71 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field623 + arg1;
        int var6 = this.field624 + arg3;
        int var7 = class19.field685 * var6 + var5;
        int var8 = 0;
        if (arg2 < 1 || arg2 > 1) {
            return;
        }
        int var9 = this.field622;
        int var10 = this.field621;
        int var11 = class19.field685 - var10;
        int var12 = 0;
        if (var6 < class19.field687) {
            int var13 = class19.field687 - var6;
            var9 -= var13;
            var6 = class19.field687;
            var8 += var10 * var13;
            var7 += class19.field685 * var13;
        }
        if (var6 + var9 > class19.field688) {
            var9 -= var6 + var9 - class19.field688;
        }
        if (var5 < class19.field689) {
            int var14 = class19.field689 - var5;
            var10 -= var14;
            var5 = class19.field689;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class19.field690) {
            int var15 = var5 + var10 - class19.field690;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method212(class19.field684, var10, 0, var8, var9, arg0.field1727, var11, true, this.field620, var7, var12);
        }
    }

    @OriginalMember(owner = "DLNMSHLT", name = "a", descriptor = "([IIIII[BIZ[III)V")
    private void method212(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, boolean arg7, int[] arg8, int arg9, int arg10) {
        int var12 = -(arg1 >> 2);
        int var13 = -(arg1 & 0x3);
        if (!arg7) {
            return;
        }
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg8[arg3++];
                if (var18 != 0 && arg5[arg9] == 0) {
                    arg0[arg9++] = var18;
                } else {
                    arg9++;
                }
                int var19 = arg8[arg3++];
                if (var19 != 0 && arg5[arg9] == 0) {
                    arg0[arg9++] = var19;
                } else {
                    arg9++;
                }
                int var20 = arg8[arg3++];
                if (var20 != 0 && arg5[arg9] == 0) {
                    arg0[arg9++] = var20;
                } else {
                    arg9++;
                }
                int var21 = arg8[arg3++];
                if (var21 != 0 && arg5[arg9] == 0) {
                    arg0[arg9++] = var21;
                } else {
                    arg9++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg8[arg3++];
                if (var17 != 0 && arg5[arg9] == 0) {
                    arg0[arg9++] = var17;
                } else {
                    arg9++;
                }
            }
            arg9 += arg6;
            arg3 += arg10;
        }
    }
}
