import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class338 extends class366 {

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "[I")
    private int[] field4897;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "[I")
    private int[] field4895;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "Lqn;")
    private class40 field4898;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "Lqn;")
    private class40 field4893;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "Lqn;")
    private class40 field4889;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "[Lqn;")
    private class40[] field4890;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field4892 = 0;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "Z")
    public static boolean field4903 = false;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "Ldj;")
    public static class191 field4904 = new class191(64);

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "Lt;")
    public static class400 field4896;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILbk;Ltj;)Z", line = 6)
    public final boolean method2226(int arg0, class211 arg1, class108 arg2) {
        field4902++;
        if (class357.field5167 <= 0) {
            for (int var4 = 0; var4 < this.field4895.length; var4++) {
                if (!arg2.method660(this.field4895[var4], (byte) 75)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4895.length; var5++) {
                if (!arg2.method661(class357.field5167, false, this.field4895[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = arg0; var6 < this.field4897.length; var6++) {
            if (!arg1.method1471(-31571, this.field4897[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIBZLtj;Lbk;)[F", line = 74)
    public final float[] method2227(int arg0, int arg1, byte arg2, boolean arg3, class108 arg4, class211 arg5) {
        class166.field2373 = arg5;
        field4900++;
        class94.field1200 = arg4;
        for (int var7 = 0; var7 < this.field4890.length; var7++) {
            this.field4890[var7].method260(arg0, true, arg1);
        }
        class397.method2492((byte) -30, arg1, arg0);
        float[] var8 = new float[arg0 * arg1 * 4];
        int var9 = 0;
        int var10 = 0;
        if (arg2 < 17) {
            method2229(77);
        }
        while (arg0 > var10) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4893.field550) {
                int[] var16 = this.field4893.method44((byte) -113, var10);
                var13 = var16;
                var14 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field4893.method112(1, var10);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field4889.field550) {
                var17 = this.field4889.method44((byte) -66, var10);
            } else {
                var17 = this.field4889.method112(1, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field4898.field550) {
                var18 = this.field4898.method44((byte) -24, var10);
            } else {
                var18 = this.field4898.method112(1, var10)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
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
                if (arg3) {
                    var9 += (arg1 << 2) - 4;
                }
            }
            var10++;
        }
        for (int var11 = 0; var11 < this.field4890.length; var11++) {
            this.field4890[var11].method264((byte) 71);
        }
        return var8;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZZZDILtj;Lbk;)[I", line = 184)
    public final int[] method2228(int arg0, boolean arg1, boolean arg2, boolean arg3, double arg4, int arg5, class108 arg6, class211 arg7) {
        class166.field2373 = arg7;
        class94.field1200 = arg6;
        if (!arg3) {
            return null;
        }
        field4891++;
        for (int var10 = 0; var10 < this.field4890.length; var10++) {
            this.field4890[var10].method260(arg0, true, arg5);
        }
        class261.method1801(arg4, false);
        class397.method2492((byte) -107, arg5, arg0);
        int[] var11 = new int[arg0 * arg5];
        byte var12;
        int var13;
        int var14;
        if (arg1) {
            var12 = -1;
            var13 = -1;
            var14 = arg5 - 1;
        } else {
            var14 = 0;
            var13 = arg5;
            var12 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4893.field550) {
                int[] var22 = this.field4893.method44((byte) -110, var16);
                var21 = var22;
                var20 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field4893.method112(1, var16);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            if (arg2) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class451.field6466[var24];
                int var28 = class451.field6466[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class451.field6466[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg2) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4890.length; var17++) {
            this.field4890[var17].method264((byte) 71);
        }
        return var11;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 319)
    public class338() {
        this.field4897 = new int[0];
        this.field4895 = new int[0];
        this.field4898 = new class434(0);
        this.field4898.field549 = 1;
        this.field4893 = new class434();
        this.field4893.field549 = 1;
        this.field4889 = new class434();
        this.field4890 = new class40[] { this.field4893, this.field4889, this.field4898 };
        this.field4889.field549 = 1;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Llf;)V", line = 338)
    public class338(class130 arg0) {
        int var2 = arg0.method837(true);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field4890 = new class40[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class40 var16 = class363.method2353(arg0, true);
            if (var16.method262((byte) -112) >= 0) {
                var3++;
            }
            if (var16.method267(28891) >= 0) {
                var4++;
            }
            int var17 = var16.field553.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method837(true);
            }
            this.field4890[var6] = var16;
        }
        this.field4895 = new int[var3];
        this.field4897 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class40 var11 = this.field4890[var9];
            int var12 = var11.field553.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field553[var13] = this.field4890[var5[var9][var13]];
            }
            int var14 = var11.method262((byte) -118);
            int var15 = var11.method267(28891);
            if (var14 > 0) {
                this.field4895[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4897[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4893 = this.field4890[arg0.method837(true)];
        this.field4889 = this.field4890[arg0.method837(true)];
        this.field4898 = this.field4890[arg0.method837(true)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 427)
    public static void method2229(int arg0) {
        field4896 = null;
        field4904 = null;
        if (arg0 > -85) {
            field4901 = -48;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V", line = 442)
    public static final void method2230(int arg0, int arg1) {
        field4899++;
        class15 var2 = class332.field4822;
        synchronized (class332.field4822) {
            if (arg0 != -1) {
                return;
            }
            class332.field4822.method91(4, arg1);
        }
        class15 var3 = class258.field3826;
        synchronized (class258.field3826) {
            class258.field3826.method91(4, arg1);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZDLtj;ILbk;I)[I", line = 458)
    public final int[] method2231(int arg0, boolean arg1, double arg2, class108 arg3, int arg4, class211 arg5, int arg6) {
        class94.field1200 = arg3;
        field4894++;
        class166.field2373 = arg5;
        for (int var9 = 0; var9 < this.field4890.length; var9++) {
            this.field4890[var9].method260(arg6, true, arg4);
        }
        class261.method1801(arg2, false);
        class397.method2492((byte) -98, arg4, arg6);
        int[] var10 = new int[arg4 * arg6 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4893.field550) {
                int[] var14 = this.field4893.method44((byte) -123, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field4893.method112(1, var12);
                var17 = var18[2];
                var15 = var18[0];
                var16 = var18[1];
            }
            int[] var19;
            if (this.field4889.field550) {
                var19 = this.field4889.method44((byte) -31, var12);
            } else {
                var19 = this.field4889.method112(1, var12)[0];
            }
            if (arg1) {
                var11 = var12;
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
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
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class451.field6466[var21];
                int var25 = class451.field6466[var22];
                int var26 = class451.field6466[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
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
                var10[var11++] = (var24 << 16) + (var25 << 8) + (var27 << 24) + var26;
                if (arg1) {
                    var11 += arg4 - 1;
                }
            }
        }
        if (arg0 != 76928226) {
            method2230(38, -91);
        }
        for (int var13 = 0; var13 < this.field4890.length; var13++) {
            this.field4890[var13].method264((byte) 71);
        }
        return var10;
    }
}
