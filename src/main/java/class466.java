import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class466 {

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "Z")
    private boolean field6851 = true;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    private int field6856 = -1;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "[Llj;")
    private class41[] field6855;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    private int field6847;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    private int field6854;

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
    private int field6863;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    private int field6860;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "Llj;")
    private class41 field6859;

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "[Llj;")
    private class41[] field6861;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "Lhb;")
    public static class250 field6862 = new class250(18, 2);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
    private int field6853;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    private int field6857;

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "Lf;")
    private class404 field6858;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILqa;)Z")
    public final boolean method2809(int arg0, int arg1, class129 arg2) {
        if (this.field6856 != arg0) {
            this.field6856 = arg0;
            int var4 = class124.method788(arg0, -116);
            if (var4 > arg0) {
                var4 = class342.method2014((byte) -29, arg0);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field6853 != var4) {
                this.field6853 = var4;
                this.field6858 = null;
            }
            if (this.field6855 != null) {
                this.field6857 = 0;
                int[] var5 = new int[this.field6855.length];
                for (int var6 = 0; var6 < this.field6855.length; var6++) {
                    class41 var7 = this.field6855[var6];
                    if (var7.method260(this.field6854, this.field6860, this.field6847, this.field6856)) {
                        var5[this.field6857] = var7.field608;
                        this.field6861[this.field6857++] = var7;
                    }
                }
                class78.method456(113, this.field6861, this.field6857 - 1, var5, 0);
            }
            this.field6851 = true;
        }
        if (arg1 != 0) {
            method2814(true, null);
        }
        field6849++;
        boolean var8 = false;
        if (this.field6851) {
            this.field6851 = false;
            for (int var9 = this.field6857 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field6861[var9].method261(arg2, this.field6859);
                this.field6851 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lgk;I)V")
    public static final void method2810(class463 arg0, int arg1) {
        field6852++;
        if (class104.field1430 == null) {
            class143 var2 = new class143();
            byte[] var3 = var2.method996(128, 128, -2122510324, 16);
            class104.field1430 = class28.method191(false, false, var3);
        }
        if (class112.field1542 == null) {
            class135 var4 = new class135();
            byte[] var5 = var4.method944(16, 128, 128, 28);
            class112.field1542 = class28.method191(false, false, var5);
        }
        int var6 = 78 / ((arg1 + 58) / 44);
        class298 var7 = arg0.field6691;
        if (var7.method1789(27446) && class114.field1564 == null) {
            byte[] var8 = class34.method225(-14866, 128, 0.5F, 0.6F, 8, 128, 16.0F, 16, 4.0F, new class219(419684), 4.0F);
            class114.field1564 = class28.method191(false, false, var8);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    public final void method2811(int arg0) {
        field6846++;
        if (this.field6855 != null) {
            for (int var2 = 0; var2 < this.field6855.length; var2++) {
                this.field6855[var2].method263();
            }
        }
        if (arg0 != 0) {
            this.field6860 = 64;
        }
        this.field6858 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lfs;ZLqa;)I")
    public static final int method2812(class286 arg0, boolean arg1, class129 arg2) {
        field6850++;
        if (arg0.field3648 != -1) {
            return arg0.field3648;
        }
        if (arg0.field3638 != -1) {
            class499 var3 = arg2.field1765.method460(-26282, arg2.method890() ? arg0.field3638 : arg0.field3642);
            if (!var3.field7335) {
                return var3.field7344;
            }
        }
        return arg1 ? 10 : arg0.field3655;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
    public static final void method2813(byte arg0) {
        field6865++;
        int var1 = class421.field5647.method651(true, class520.field7690);
        if (arg0 != 0) {
            return;
        }
        if (var1 == 0) {
            class478.field6978 = null;
            class386.method2303(0, arg0 ^ 0xFFFFFF80);
        } else if (var1 == 1) {
            class505.method3009((byte) 12, (byte) 0);
            class386.method2303(512, -128);
            if (class8.field76 != null) {
                class365.method2141(0);
            }
        } else {
            class505.method3009((byte) 12, (byte) (class398.field5291 - 4 & 0xFF));
            class386.method2303(2, arg0 - 128);
        }
        class306.field3935 = class366.field4715;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLgf;)V")
    public static final void method2814(boolean arg0, class395 arg1) {
        if (arg0) {
            field6862 = null;
        }
        field6864++;
        int var2 = arg1.field5228 - class264.field3353;
        int var3 = arg1.field5158 * 128 + arg1.method2342(10804) * 64;
        int var4 = arg1.field5154 * 128 + (arg1.method2342(10804) * 64);
        arg1.field6241 += (var4 - arg1.field6241) / var2;
        arg1.field5245 = 0;
        arg1.field6239 += (var3 - arg1.field6239) / var2;
        if (arg1.field5187 == 0) {
            arg1.method2341(true, 8192);
        }
        if (arg1.field5187 == 1) {
            arg1.method2341(true, 12288);
        }
        if (arg1.field5187 == 2) {
            arg1.method2341(!arg0, 0);
        }
        if (arg1.field5187 == 3) {
            arg1.method2341(true, 4096);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
    public static void method2815(boolean arg0) {
        field6862 = null;
        if (arg0) {
            method2816(-99, 0.072007276F, 36, -0.7375858F, 58, -38, -119, 1.0170548F);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IFIFIIIF)[F")
    public static final float[] method2816(int arg0, float arg1, int arg2, float arg3, int arg4, int arg5, int arg6, float arg7) {
        field6848++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
        var8[8] = var10;
        float var12 = 1.0F - var10;
        var8[1] = 0.0F;
        var8[0] = var10;
        var8[7] = 0.0F;
        var8[arg5] = var11;
        var8[3] = 0.0F;
        var8[5] = 0.0F;
        var8[4] = 1.0F;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg6 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg4 * arg4));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg0 / var19;
                var14 = (float) (-arg4) / var19;
            }
            var13[3] = -var16 * var18;
            var13[4] = var15;
            var13[0] = var14 * var14 * var17 + var15;
            var13[1] = var16 * var18;
            var13[7] = -var14 * var18;
            var13[6] = var14 * var16 * var17;
            var13[5] = var14 * var18;
            var13[8] = var16 * var16 * var17 + var15;
            var13[2] = var14 * var16 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[6] *= arg3;
        var9[0] *= arg1;
        var9[2] *= arg1;
        var9[4] *= arg7;
        var9[3] *= arg7;
        var9[8] *= arg3;
        var9[5] *= arg7;
        var9[1] *= arg1;
        var9[7] *= arg3;
        return var9;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIIILqa;Z)V")
    public final void method2817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class129 arg8, boolean arg9) {
        field6845++;
        int var11 = arg5 + arg7 & 0x3FFF;
        if (this.field6863 == -1) {
            arg8.method861(arg1, arg0, arg2, arg3, arg6, 0);
        } else {
            class499 var12 = class362.field4668.method460(-26282, this.field6863);
            if (this.field6858 == null && class362.field4668.method461(this.field6863, false)) {
                int[] var13 = var12.field7349 ? class362.field4668.method458(0.7F, this.field6853, this.field6853, (byte) 0, false, this.field6863) : class362.field4668.method457(this.field6853, false, 0.7F, 12071, this.field6863, this.field6853);
                this.field6858 = arg8.method921(var13, 0, this.field6853, this.field6853, this.field6853);
            }
            if (!var12.field7349) {
                arg8.method861(arg1, arg0, arg2, arg3, arg6, 0);
            }
            if (this.field6858 != null) {
                int var14 = var12.field7349 ? 0 : 1;
                int var15 = arg3 * arg4 / -4096;
                int var16;
                for (var16 = arg3 * var11 / 4096 + (arg2 - arg3) / 2; var16 > arg3; var16 -= arg3) {
                }
                while (var16 < 0) {
                    var16 += arg3;
                }
                while (arg3 < var15) {
                    var15 -= arg3;
                }
                while (var15 < 0) {
                    var15 += arg3;
                }
                for (int var17 = var16 - arg3; var17 < arg2; var17 += arg3) {
                    for (int var18 = var15 - arg3; var18 < arg3; var18 += arg3) {
                        this.field6858.method356(arg1 + var17, arg0 + var18, arg3, arg3, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field6857 - 1; var19 >= 0; var19--) {
            this.field6861[var19].method259(arg8, arg1, arg0, arg2, arg3, arg4, var11);
        }
        if (!arg9) {
            this.field6856 = 19;
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I[Llj;IIII)V")
    public class466(int arg0, class41[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6855 = arg1;
        this.field6847 = arg5;
        this.field6854 = arg3;
        this.field6863 = arg0;
        this.field6860 = arg4;
        if (arg1 == null) {
            this.field6859 = null;
            this.field6861 = null;
        } else {
            this.field6861 = new class41[arg1.length];
            this.field6859 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
