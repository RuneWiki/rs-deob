import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class137 extends class259 {

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "Lsg;")
    private static class30 field2673 = class167.method1221((byte) 33, "Unable to find ");

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "Lsg;")
    public static class30 field2671 = field2673;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "Lsg;")
    public static class30 field2678 = class167.method1221((byte) 33, " loggt sich ein)3");

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "[I")
    public static int[] field2674 = new int[256];

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "Z")
    public static boolean field2680;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class137() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "(I)[Lgj;")
    public static final class192[] method1030(int arg0) {
        ++field2672;
        class192[] var1 = new class192[class23.field435];
        for (int var2 = 0; ~var2 > ~class23.field435; ++var2) {
            var1[var2] = new class192(class190.field3464, class273.field4774, class142.field2752[var2], class37.field895[var2], class62.field1329[var2], class2.field33[var2], class222.field3992[var2], class191.field3475);
        }
        class175.method1285((byte) 53);
        if (arg0 != 13588) {
            method1031((byte) -94, -58, -121);
        }
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        ++field2669;
        if (arg1 != -1586849108) {
            field2680 = true;
        }
        if (arg0 == 0) {
            super.field4588 = ~arg2.method63((byte) 125) == -2;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        int var3 = -82 / ((arg0 - -48) / 42);
        ++field2675;
        int[][] var4 = super.field4568.method241(66, arg1);
        if (super.field4568.field564) {
            int[][] var5 = this.method1795(arg1, 2, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var5[2];
            for (int var12 = 0; ~var12 > ~class223.field3999; ++var12) {
                var8[var12] = -var6[var12] + 4096;
                var9[var12] = -var7[var12] + 4096;
                var10[var12] = -var11[var12] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BII)V")
    public static final void method1031(byte arg0, int arg1, int arg2) {
        ++field2676;
        int var3 = arg2--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class195.field3509[arg2];
        int var5 = class132.field2594[arg2];
        if (arg0 < -123) {
            if (~arg1 == -1) {
                class196.field3553.method1267(129, -9);
                class196.field3553.method76(5305, var3 + 3 + var3);
                ++class100.field2045;
            }
            if (~arg1 == -2) {
                class196.field3553.method1267(230, -9);
                class196.field3553.method76(5305, var3 - -14 + var3 + 3);
                ++class6.field87;
            }
            if (arg1 == 2) {
                class196.field3553.method1267(128, -9);
                class196.field3553.method76(5305, var3 + 3 + var3);
                ++class247.field4396;
            }
            class196.field3553.method68(-1, !class41.field1016[82] ? 0 : 1);
            class196.field3553.method71(class22.field421 + var4, 255);
            class210.field3771 = class195.field3509[0];
            class173.field3239 = class132.field2594[0];
            for (int var6 = 1; ~var3 < ~var6; ++var6) {
                --arg2;
                class196.field3553.method47(class195.field3509[arg2] - var4, (byte) -75);
                class196.field3553.method68(-1, class132.field2594[arg2] + -var5);
            }
            class196.field3553.method87(-55174520, class196.field3547 + var5);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(IB)Lsg;")
    public static final class30 method1032(int arg0, byte arg1) {
        ++field2668;
        if (arg1 != 23) {
            method1034(87);
        }
        if (~arg0 > -100001) {
            return class160.method1188(new class30[] { class67.field1467, class73.method675(-82, arg0), class121.field2381 }, 0);
        } else {
            return arg0 < 10000000 ? class160.method1188(new class30[] { class231.field4106, class73.method675(arg1 ^ 27, arg0 / 1000), class124.field2424, class121.field2381 }, 0) : class160.method1188(new class30[] { class74.field1653, class73.method675(125, arg0 / 1000000), class204.field3639, class121.field2381 }, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        int[] var3 = super.field4581.method1841(18, arg0);
        if (arg1) {
            field2671 = null;
        }
        if (super.field4581.field4729) {
            int[] var4 = this.method1799(0, arg0, 117);
            for (int var5 = 0; ~class223.field3999 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        ++field2679;
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "(I)V")
    public static void method1033(int arg0) {
        field2673 = null;
        field2678 = null;
        if (arg0 < 118) {
            field2673 = null;
        }
        field2671 = null;
        field2674 = null;
    }

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "(I)V")
    public static final void method1034(int arg0) {
        if (!class94.field1890) {
            class30.field602[0] = 1007;
            class52.field1165 = 1;
            if (~class93.field1864 == -1) {
                if (class63.field1344 == 0) {
                    class219.field3960 = class104.field2095;
                    class5.field77 = class23.field440;
                } else {
                    class219.field3960 = class183.field3365;
                    class5.field77 = class32.field817;
                }
            } else {
                class5.field77 = class197.field3571;
                class219.field3960 = class273.field4793;
            }
            class167.field3078[0] = class22.field416;
            class48.field1088[0] = class55.field1203;
        }
        if (~class196.field3548 != 0) {
            class277.method1872((byte) 76, class196.field3548);
        }
        for (int var1 = 0; ~var1 > ~class80.field1731; ++var1) {
            if (class14.field288[var1]) {
                class210.field3769[var1] = true;
            }
            class195.field3508[var1] = class14.field288[var1];
            class14.field288[var1] = false;
        }
        class147.field2814 = class133.field2617;
        class78.field1695 = null;
        class150.field2846 = -1;
        ++field2670;
        class168.field3135 = -1;
        if (~class196.field3548 != 0) {
            class80.field1731 = 0;
            class17.method172(0, false, -1, 0, class238.field4238, 0, class15.field324, class196.field3548, 0);
        }
        class188.method1363();
        class120.method918((byte) -26);
        if (!class94.field1890) {
            if (class150.field2846 != -1) {
                class190.method1382(class168.field3135, class150.field2846, arg0 + -23);
            }
        } else {
            class102.method827(11303);
        }
        if (~class126.field2461 == -4) {
            for (int var2 = 0; ~class80.field1731 < ~var2; ++var2) {
                if (!class195.field3508[var2]) {
                    if (class210.field3769[var2]) {
                        class188.method1359(class9.field170[var2], class14.field296[var2], class256.field4509[var2], class110.field2211[var2], 16711680, 128);
                    }
                } else {
                    class188.method1359(class9.field170[var2], class14.field296[var2], class256.field4509[var2], class110.field2211[var2], 16711935, 128);
                }
            }
        }
        class101.method821(class247.field4394.field1336, arg0 + -5740, class195.field3517, class247.field4394.field1360, class159.field2998);
        class195.field3517 = 0;
        if (arg0 != 25) {
            method1033(13);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((1 & var1) == 1) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field2674[var0] = var1;
        }
        field2680 = false;
    }
}
