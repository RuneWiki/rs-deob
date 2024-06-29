import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class761 extends class392 {

    @OriginalMember(owner = "client!mp", name = "E", descriptor = "[I")
    private int[] field10621;

    @OriginalMember(owner = "client!mp", name = "x", descriptor = "[I")
    private int[] field10614;

    @OriginalMember(owner = "client!mp", name = "z", descriptor = "Ldt;")
    private class243 field10616;

    @OriginalMember(owner = "client!mp", name = "H", descriptor = "Ldt;")
    private class243 field10623;

    @OriginalMember(owner = "client!mp", name = "y", descriptor = "Ldt;")
    private class243 field10615;

    @OriginalMember(owner = "client!mp", name = "B", descriptor = "[Ldt;")
    private class243[] field10618;

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "Lea;")
    public static class547 field10612 = new class547(91, 10);

    @OriginalMember(owner = "client!mp", name = "D", descriptor = "Lqc;")
    public static class743 field10620 = new class743();

    @OriginalMember(owner = "client!mp", name = "J", descriptor = "I")
    public static int field10625 = 1;

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "I")
    public static int field10613;

    @OriginalMember(owner = "client!mp", name = "A", descriptor = "I")
    public static int field10617;

    @OriginalMember(owner = "client!mp", name = "C", descriptor = "I")
    public static int field10619;

    @OriginalMember(owner = "client!mp", name = "G", descriptor = "I")
    public static int field10622;

    @OriginalMember(owner = "client!mp", name = "I", descriptor = "I")
    public static int field10624;

    @OriginalMember(owner = "client!mp", name = "O", descriptor = "I")
    public static int field10629;

    @OriginalMember(owner = "client!mp", name = "K", descriptor = "Lem;")
    public static class227 field10626;

    @OriginalMember(owner = "client!mp", name = "L", descriptor = "Lni;")
    public static class522 field10627;

    @OriginalMember(owner = "client!mp", name = "M", descriptor = "Lnh;")
    public static class747 field10628;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILni;Ld;)Z")
    public final boolean method4231(int arg0, class522 arg1, class152 arg2) {
        field10617++;
        if (class626.field8756 < 0) {
            for (int var4 = 0; var4 < this.field10621.length; var4++) {
                if (!arg1.method2882(-117, this.field10621[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field10621.length; var5++) {
                if (!arg1.method2891(this.field10621[var5], class626.field8756, -6329)) {
                    return false;
                }
            }
        }
        for (int var6 = arg0; var6 < this.field10614.length; var6++) {
            if (!arg2.method922(43, this.field10614[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ld;Lni;BIIZ)[F")
    public final float[] method4232(class152 arg0, class522 arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        class729.field10175 = arg0;
        class211.field2530 = arg1;
        field10622++;
        int var7 = -119 / ((arg2 - 30) / 45);
        for (int var8 = 0; var8 < this.field10618.length; var8++) {
            this.field10618[var8].method1460(arg4, arg3, -256);
        }
        class639.method3594(true, arg3, arg4);
        float[] var9 = new float[arg3 * 4 * arg4];
        int var10 = 0;
        for (int var11 = 0; var11 < arg4; var11++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field10623.field3159) {
                int[] var13 = this.field10623.method5(255, var11);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field10623.method2(-94, var11);
                var15 = var17[2];
                var16 = var17[1];
                var14 = var17[0];
            }
            int[] var18;
            if (this.field10615.field3159) {
                var18 = this.field10615.method5(255, var11);
            } else {
                var18 = this.field10615.method2(-119, var11)[0];
            }
            int[] var19;
            if (this.field10616.field3159) {
                var19 = this.field10616.method5(255, var11);
            } else {
                var19 = this.field10616.method2(-115, var11)[0];
            }
            if (arg5) {
                var10 = var11 << 2;
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                float var21 = (float) var18[var20] / 4096.0F;
                if ((var21 < 0.0F)) {
                    var21 = 0.0F;
                } else if (var21 > 1.0F) {
                    var21 = 1.0F;
                }
                float var22 = ((float) var19[var20] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var9[var10++] = (float) var14[var20] * var22;
                var9[var10++] = (float) var16[var20] * var22;
                var9[var10++] = (float) var15[var20] * var22;
                var9[var10++] = var21;
                if (arg5) {
                    var10 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var12 = 0; var12 < this.field10618.length; var12++) {
            this.field10618[var12].method1456(1002);
        }
        return var9;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZLd;DZLni;IB)[I")
    public final int[] method4233(int arg0, boolean arg1, class152 arg2, double arg3, boolean arg4, class522 arg5, int arg6, byte arg7) {
        class211.field2530 = arg5;
        class729.field10175 = arg2;
        field10624++;
        for (int var10 = 0; var10 < this.field10618.length; var10++) {
            this.field10618[var10].method1460(arg0, arg6, -256);
        }
        class112.method749(arg3, 0);
        class639.method3594(true, arg6, arg0);
        int[] var11 = new int[arg0 * arg6];
        int var12;
        byte var13;
        int var14;
        if (arg1) {
            var12 = -1;
            var13 = -1;
            var14 = arg6 - 1;
        } else {
            var13 = 1;
            var14 = 0;
            var12 = arg6;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg4) {
                var15 = var16;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field10623.field3159) {
                int[] var23 = this.field10623.method5(255, var16);
                var22 = var23;
                var21 = var23;
                var20 = var23;
            } else {
                int[][] var19 = this.field10623.method2(-91, var16);
                var20 = var19[0];
                var21 = var19[2];
                var22 = var19[1];
            }
            for (int var24 = var14; var24 != var12; var24 += var13) {
                int var25 = var20[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var22[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = var21[var24] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class415.field5859[var25];
                int var29 = class415.field5859[var26];
                int var30 = class415.field5859[var27];
                int var31 = (var28 << 16) - (-(var29 << 8) - var30);
                if (var31 != 0) {
                    var31 |= 0xFF000000;
                }
                var11[var15++] = var31;
                if (arg4) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field10618.length; var17++) {
            this.field10618[var17].method1456(1002);
        }
        int var18 = 84 / ((arg7 - 52) / 51);
        return var11;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public static void method4234(byte arg0) {
        if (arg0 != 37) {
            field10629 = 43;
        }
        field10612 = null;
        field10620 = null;
        field10628 = null;
        field10627 = null;
        field10626 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZDILd;Lni;BI)[I")
    public final int[] method4235(boolean arg0, double arg1, int arg2, class152 arg3, class522 arg4, byte arg5, int arg6) {
        class211.field2530 = arg4;
        class729.field10175 = arg3;
        field10613++;
        for (int var9 = 0; var9 < this.field10618.length; var9++) {
            this.field10618[var9].method1460(arg2, arg6, arg5 ^ 0xFFFFFF4F);
        }
        class112.method749(arg1, arg5 - 79);
        class639.method3594(true, arg6, arg2);
        int[] var10 = new int[arg2 * arg6];
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field10623.field3159) {
                int[] var18 = this.field10623.method5(255, var12);
                var15 = var18;
                var16 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field10623.method2(-106, var12);
                var15 = var14[0];
                var16 = var14[1];
                var17 = var14[2];
            }
            if (arg0) {
                var11 = var12;
            }
            int[] var19;
            if (this.field10615.field3159) {
                var19 = this.field10615.method5(255, var12);
            } else {
                var19 = this.field10615.method2(-118, var12)[0];
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class415.field5859[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class415.field5859[var21];
                int var26 = class415.field5859[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var27 << 24) + var26 + (var24 << 8) + (var25 << 16);
                if (arg0) {
                    var11 += arg6 - 1;
                }
            }
        }
        if (arg5 != 79) {
            field10620 = null;
        }
        for (int var13 = 0; var13 < this.field10618.length; var13++) {
            this.field10618[var13].method1456(1002);
        }
        return var10;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lji;I)Lwd;")
    public static final class275 method4236(class611 arg0, int arg1) {
        if (arg1 < 79) {
            field10620 = null;
        }
        field10619++;
        int var2 = arg0.method3402((byte) 127);
        return new class275(var2);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
    public class761() {
        this.field10621 = new int[0];
        this.field10614 = new int[0];
        this.field10616 = new class726(0);
        this.field10616.field3158 = 1;
        this.field10623 = new class726();
        this.field10623.field3158 = 1;
        this.field10615 = new class726();
        this.field10618 = new class243[] { this.field10623, this.field10615, this.field10616 };
        this.field10615.field3158 = 1;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lji;)V")
    public class761(class611 arg0) {
        int var2 = arg0.method3428((byte) -113);
        int var3 = 0;
        int var4 = 0;
        this.field10618 = new class243[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class243 var16 = class634.method3568((byte) -71, arg0);
            if (var16.method1459((byte) -127) >= 0) {
                var3++;
            }
            if (var16.method1455(16) >= 0) {
                var4++;
            }
            int var17 = var16.field3152.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method3428((byte) 116);
            }
            this.field10618[var6] = var16;
        }
        this.field10621 = new int[var3];
        int var7 = 0;
        this.field10614 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class243 var11 = this.field10618[var9];
            int var12 = var11.field3152.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3152[var13] = this.field10618[var5[var9][var13]];
            }
            int var14 = var11.method1459((byte) -124);
            int var15 = var11.method1455(62);
            if (var14 > 0) {
                this.field10621[var7++] = var14;
            }
            if (var15 > 0) {
                this.field10614[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field10623 = this.field10618[arg0.method3428((byte) -123)];
        this.field10615 = this.field10618[arg0.method3428((byte) -109)];
        Object var10 = null;
        this.field10616 = this.field10618[arg0.method3428((byte) -124)];
    }
}
