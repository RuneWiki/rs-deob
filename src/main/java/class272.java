import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class272 extends class334 {

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "[I")
    private int[] field4338;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "[I")
    private int[] field4329;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lsd;")
    private class202 field4328;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Lsd;")
    private class202 field4339;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "Lsd;")
    private class202 field4336;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "[Lsd;")
    private class202[] field4343;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lbi;")
    public static class104 field4334 = new class104(83, 3);

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "[I")
    public static int[] field4342 = new int[250];

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "Lss;")
    public static class213 field4340 = new class213(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "F")
    public static float field4341;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIBLl;ZLmn;D)[I")
    public final int[] method1837(int arg0, int arg1, byte arg2, class199 arg3, boolean arg4, class162 arg5, double arg6) {
        class162.field2351 = arg5;
        class380.field5841 = arg3;
        field4331++;
        for (int var9 = 0; var9 < this.field4343.length; var9++) {
            this.field4343[var9].method1142(arg2 - 29, arg0, arg1);
        }
        if (arg2 != -95) {
            this.field4328 = null;
        }
        class57.method438(arg2 ^ 0xFFFFFF5E, arg6);
        class454.method2856(true, arg1, arg0);
        int[] var10 = new int[arg0 * arg1 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4339.field3071) {
                int[] var18 = this.field4339.method41(var12, true);
                var16 = var18;
                var15 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field4339.method44(-1, var12);
                var15 = var14[2];
                var16 = var14[1];
                var17 = var14[0];
            }
            if (arg4) {
                var11 = var12;
            }
            int[] var19;
            if (this.field4336.field3071) {
                var19 = this.field4336.method41(var12, true);
            } else {
                var19 = this.field4336.method44(-1, var12)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
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
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class498.field7494[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class498.field7494[var21];
                int var26 = class498.field7494[var23];
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
                var10[var11++] = (var27 << 24) + (var24 << 8) + (var25 << 16) + var26;
                if (arg4) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field4343.length; var13++) {
            this.field4343[var13].method1147((byte) -67);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLl;IIIZLmn;D)[I")
    public final int[] method1838(boolean arg0, class199 arg1, int arg2, int arg3, int arg4, boolean arg5, class162 arg6, double arg7) {
        class162.field2351 = arg6;
        field4335++;
        class380.field5841 = arg1;
        for (int var10 = 0; var10 < this.field4343.length; var10++) {
            this.field4343[var10].method1142(63, arg4, arg3);
        }
        class57.method438(255, arg7);
        class454.method2856(true, arg3, arg4);
        int[] var11 = new int[arg3 * arg4];
        byte var12;
        int var13;
        int var14;
        if (arg5) {
            var12 = -1;
            var13 = arg3 - 1;
            var14 = -1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg3;
        }
        int var15 = 0;
        for (int var16 = arg2; var16 < arg4; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4339.field3071) {
                int[] var22 = this.field4339.method41(var16, true);
                var21 = var22;
                var20 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field4339.method44(-1, var16);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            if (arg0) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class498.field7494[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class498.field7494[var25];
                int var29 = class498.field7494[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg0) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4343.length; var17++) {
            this.field4343[var17].method1147((byte) -79);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
    public static void method1839(boolean arg0) {
        if (!arg0) {
            field4341 = 0.22131923F;
        }
        field4342 = null;
        field4340 = null;
        field4334 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1840(byte[] arg0, int arg1) {
        field4330++;
        class208 var2 = new class208(arg0);
        int var3 = var2.method1445(70);
        int var4 = var2.method1436((byte) 96);
        if (var4 < 0 || !(class289.field4572 == 0 || class289.field4572 >= var4)) {
            throw new RuntimeException();
        } else if (~var3 == arg1) {
            byte[] var7 = new byte[var4];
            var2.method1471(var4, true, var7, 0);
            return var7;
        } else {
            int var5 = var2.method1436((byte) 99);
            if (var5 < 0 || class289.field4572 != 0 && class289.field4572 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class461.method2896(var6, var5, arg0, var4, 9);
            } else {
                class240.field3909.method1869((byte) 10, var2, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILl;Lmn;)Z")
    public final boolean method1841(int arg0, class199 arg1, class162 arg2) {
        field4333++;
        if (class502.field7527 >= 0) {
            for (int var4 = 0; var4 < this.field4329.length; var4++) {
                if (!arg2.method993(class502.field7527, 1939, this.field4329[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4329.length; var5++) {
                if (!arg2.method1012(this.field4329[var5], true)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4338.length; var6++) {
            if (!arg1.method1364((byte) 53, this.field4338[var6])) {
                return false;
            }
        }
        int var7 = -115 / ((arg0 - 3) / 62);
        return true;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)I")
    public static int method1842(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lmn;ZILl;II)[F")
    public final float[] method1843(class162 arg0, boolean arg1, int arg2, class199 arg3, int arg4, int arg5) {
        field4332++;
        class380.field5841 = arg3;
        class162.field2351 = arg0;
        for (int var7 = 0; var7 < this.field4343.length; var7++) {
            this.field4343[var7].method1142(arg2 - 128, arg5, arg4);
        }
        class454.method2856(true, arg4, arg5);
        float[] var8 = new float[arg4 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4339.field3071) {
                int[] var16 = this.field4339.method41(var10, true);
                var15 = var16;
                var14 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field4339.method44(-1, var10);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field4336.field3071) {
                var17 = this.field4336.method41(var10, true);
            } else {
                var17 = this.field4336.method44(-1, var10)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field4328.field3071) {
                var18 = this.field4328.method41(var10, true);
            } else {
                var18 = this.field4328.method44(~arg2, var10)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var11 = arg2; var11 < this.field4343.length; var11++) {
            this.field4343[var11].method1147((byte) -112);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class272() {
        this.field4338 = new int[0];
        this.field4329 = new int[0];
        this.field4328 = new class188(0);
        this.field4328.field3066 = 1;
        this.field4339 = new class188();
        this.field4339.field3066 = 1;
        this.field4336 = new class188();
        this.field4343 = new class202[] { this.field4339, this.field4336, this.field4328 };
        this.field4336.field3066 = 1;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lhw;)V")
    public class272(class208 arg0) {
        int var2 = arg0.method1445(38);
        int var3 = 0;
        int var4 = 0;
        this.field4343 = new class202[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class202 var16 = class75.method542(0, arg0);
            if (var16.method1378(true) >= 0) {
                var3++;
            }
            if (var16.method1145(0) >= 0) {
                var4++;
            }
            int var17 = var16.field3065.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1445(24);
            }
            this.field4343[var6] = var16;
        }
        this.field4329 = new int[var3];
        int var7 = 0;
        this.field4338 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class202 var11 = this.field4343[var9];
            int var12 = var11.field3065.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3065[var13] = this.field4343[var5[var9][var13]];
            }
            int var14 = var11.method1378(true);
            int var15 = var11.method1145(0);
            if (var14 > 0) {
                this.field4329[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4338[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4339 = this.field4343[arg0.method1445(107)];
        this.field4336 = this.field4343[arg0.method1445(-128)];
        this.field4328 = this.field4343[arg0.method1445(53)];
        Object var10 = null;
    }
}
