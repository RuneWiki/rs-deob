import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class214 extends class185 {

    @OriginalMember(owner = "client!ol", name = "fb", descriptor = "I")
    private int field3213 = -1;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field3191 = 0;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "[[B")
    public static byte[][] field3194 = new byte[50][];

    @OriginalMember(owner = "client!ol", name = "X", descriptor = "Ljava/lang/String;")
    public static String field3205 = "flash1:";

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "Ljava/lang/String;")
    public static String field3204 = "M";

    @OriginalMember(owner = "client!ol", name = "db", descriptor = "I")
    public static int field3211 = 0;

    @OriginalMember(owner = "client!ol", name = "cb", descriptor = "I")
    public static int field3210 = 0;

    @OriginalMember(owner = "client!ol", name = "gb", descriptor = "[I")
    public static int[] field3214 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ol", name = "Z", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ol", name = "ab", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ol", name = "bb", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ol", name = "eb", descriptor = "Lpf;")
    public static class294 field3212;

    @OriginalMember(owner = "client!ol", name = "Y", descriptor = "Laj;")
    public static class48 field3206;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "[I")
    public int[] field3199;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)[[I")
    public int[][] method39(boolean arg0, int arg1) {
        int[][] var3 = super.field2802.method753(1, arg1);
        if (!arg0) {
            this.field3199 = null;
        }
        if (super.field2802.field1807 && this.method1369(127)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int var6 = (~class130.field1933 != ~this.field3200 ? this.field3200 * arg1 / class130.field1933 : arg1) * this.field3202;
            int[] var7 = var3[2];
            if (class174.field2648 == this.field3202) {
                for (int var8 = 0; ~var8 > ~class174.field2648; ++var8) {
                    int var9 = this.field3199[var6++];
                    var7[var8] = class94.method598(var9 << 4, 4080);
                    var4[var8] = class94.method598(4080, var9 >> 4);
                    var5[var8] = class94.method598(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~class174.field2648 < ~var10; ++var10) {
                    int var11 = this.field3202 * var10 / class174.field2648;
                    int var12 = this.field3199[var6 + var11];
                    var7[var10] = class94.method598(var12, 255) << 4;
                    var4[var10] = class94.method598(4080, var12 >> 4);
                    var5[var10] = class94.method598(var12, 16711680) >> 12;
                }
            }
        }
        ++field3197;
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)V")
    public static void method1366(byte arg0) {
        field3214 = null;
        field3205 = null;
        if (arg0 <= 14) {
            method1366((byte) 101);
        }
        field3204 = null;
        field3206 = null;
        field3194 = null;
        field3212 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IC)Z")
    public static final boolean method1367(int arg0, char arg1) {
        if (arg0 <= 42) {
            field3212 = null;
        }
        ++field3198;
        return ~arg1 <= -66 && ~arg1 >= -91 || arg1 >= 'a' && ~arg1 >= -123;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)I")
    public static final int method1368(int arg0, int arg1) {
        int var7 = arg1 - 1;
        ++field3208;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 >= -112) {
            method1372(47L, -64);
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "(I)Z")
    public final boolean method1369(int arg0) {
        ++field3193;
        if (this.field3199 != null) {
            return true;
        } else {
            if (arg0 <= 111) {
                field3212 = null;
            }
            if (~this.field3213 <= -1) {
                class201 var2 = class80.field1290 >= 0 ? class273.method1808(class80.field1290, this.field3213, class176.field2690, true) : class190.method1192(class176.field2690, true, this.field3213);
                var2.method1276();
                this.field3202 = var2.field3473;
                this.field3200 = var2.field3464;
                this.field3199 = var2.field3047;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZIIZIII)V")
    public static final void method1370(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 2) {
            field3211 = -64;
        }
        if (arg5 > arg2) {
            int var7 = (arg2 + arg5) / 2;
            int var8 = arg2;
            class266 var9 = class52.field844[var7];
            class52.field844[var7] = class52.field844[arg5];
            class52.field844[arg5] = var9;
            for (int var10 = arg2; arg5 > var10; ++var10) {
                if (class210.method1348(class52.field844[var10], -102, arg4, arg3, arg1, var9, arg0) <= 0) {
                    class266 var11 = class52.field844[var10];
                    class52.field844[var10] = class52.field844[var8];
                    class52.field844[var8++] = var11;
                }
            }
            class52.field844[arg5] = class52.field844[var8];
            class52.field844[var8] = var9;
            method1370(arg0, arg1, arg2, arg3, arg4, var8 + -1, 2);
            method1370(arg0, arg1, var8 - -1, arg3, arg4, arg5, 2);
        }
        ++field3203;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class214() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == arg6 && ~arg1 == ~arg4 && arg0 == arg2 && ~arg7 == ~arg8) {
            class33.method218((byte) 52, arg1, arg2, arg5, arg9, arg8);
        } else {
            int var10 = arg5;
            int var11 = arg1;
            int var12 = arg5 * 3;
            int var13 = arg1 * 3;
            int var14 = arg4 * 3;
            int var15 = arg6 * 3;
            int var16 = arg0 * 3;
            int var17 = arg7 * 3;
            int var18 = -var16 - arg5 + arg2 + var15;
            int var19 = var17 - var14 + -var14 + var13;
            int var20 = var16 - var15 + -var15 + var12;
            int var21 = arg8 - var17 - -var14 - arg1;
            int var22 = -var12 + var15;
            int var23 = -var13 + var14;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var21 * var26;
                int var28 = var18 * var26;
                int var29 = var20 * var25;
                int var30 = var19 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var30 + var32 >> 12) + arg1;
                int var34 = arg5 - -(var28 + var29 + var31 >> 12);
                class33.method218((byte) 92, var11, var34, var10, arg9, var33);
                var11 = var33;
                var10 = var34;
            }
        }
        ++field3207;
        if (arg3 > -17) {
            field3212 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(JI)V")
    public static final void method1372(long arg0, int arg1) {
        ++field3195;
        class196.field2979.field3748 = 0;
        class196.field2979.method1568(21, (byte) 49);
        class196.field2979.method1610(791715792, arg0);
        class234.field3523 = 0;
        class61.field970 = -3;
        class110.field1708 = 0;
        class163.field2501 = 1;
        if (arg1 != 23824) {
            field3210 = -96;
        }
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)I")
    public final int method1148(int arg0) {
        ++field3201;
        if (arg0 != 0) {
            this.field3199 = null;
        }
        return this.field3213;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
    public final void method162(byte arg0) {
        super.method162(arg0);
        ++field3192;
        this.field3199 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg2 != -6357) {
            this.method39(true, 10);
        }
        ++field3209;
        if (arg0 == 0) {
            this.field3213 = arg1.method1575(false);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLrl;Z)V")
    public static final void method1373(byte arg0, class164 arg1, boolean arg2) {
        ++field3196;
        if (arg2) {
            int var3 = class180.field2748;
            int var4 = var3 * 956 / 503;
            class174.field2646.method1283((-var4 + class77.field1245) / 2, 0, var4, var3);
            class149.field2162.method1118(class77.field1245 / 2 + -(class149.field2162.field3887 / 2), 18);
        }
        arg1.method1037(class72.field1150, class77.field1245 / 2, class180.field2748 / 2 - 26, 16777215, -1);
        int var5 = class180.field2748 / 2 + -18;
        class111.method701(class77.field1245 / 2 + -152, var5, 304, 34, 9179409);
        class111.method701(class77.field1245 / 2 - 151, var5 - -1, 302, 32, 0);
        class111.method702(class77.field1245 / 2 + -150, var5 + 2, class253.field3833 * 3, 30, 9179409);
        class111.method702(class77.field1245 / 2 + class253.field3833 * 3 + -150, var5 + 2, -(class253.field3833 * 3) + 300, 30, 0);
        if (arg0 <= 87) {
            field3211 = 25;
        }
        arg1.method1037(class77.field1246, class77.field1245 / 2, class180.field2748 / 2 + 4, 16777215, -1);
    }
}
