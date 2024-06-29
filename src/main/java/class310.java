import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class310 extends class154 {

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field5005 = 0;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "Z")
    public static boolean field5009 = false;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "[[I")
    public static int[][] field5008 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "Lch;")
    public static class306 field5010 = new class306(5000);

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "[I")
    public static int[] field5018 = new int[100];

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "[Lkb;")
    public static class55[] field5021 = new class55[4];

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "[I")
    public static int[] field5022 = new int[2500];

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "Ljava/lang/String;")
    public static String field5020 = "scroll:";

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public int field5015;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "Lgi;")
    public static class164 field5019;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "Lki;")
    public class64 field5011;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "[B")
    public byte[] field5014;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "[I")
    public static int[] field5024;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)V")
    public static final void method2100(int arg0) {
        class48.method314(1, class265.field4313);
        int var1 = (class145.field2327 >> 3) + (class123.field1960 >> 10);
        ++field5006;
        byte var2 = 0;
        int var3 = (class135.field2184 >> 10) - -(class75.field1211 >> 3);
        int var4 = 64 / ((arg0 - 17) / 33);
        byte var5 = 8;
        byte var6 = 8;
        byte var7 = 18;
        class236.field3705 = new int[var7];
        class172.field2865 = new int[var7];
        class139.field2234 = new int[var7];
        class304.field4955 = new int[var7][4];
        class197.field3176 = new byte[var7][];
        class251.field4125 = new byte[var7][];
        class295.field4819 = new int[var7];
        class33.field544 = new int[var7];
        class122.field1938 = new int[var7];
        class158.field2563 = new byte[var7][];
        int var8 = 0;
        for (int var9 = (var3 + -6) / 8; ~((var3 + 6) / 8) <= ~var9; ++var9) {
            for (int var11 = (var1 + -6) / 8; ~var11 >= ~((var1 + 6) / 8); ++var11) {
                int var12 = (var9 << 8) + var11;
                class122.field1938[var8] = var12;
                class236.field3705[var8] = class175.field2919.method1160("m" + var9 + "_" + var11, -1);
                class33.field544[var8] = class175.field2919.method1160("l" + var9 + "_" + var11, -1);
                class295.field4819[var8] = class175.field2919.method1160("n" + var9 + "_" + var11, -1);
                class139.field2234[var8] = class175.field2919.method1160("um" + var9 + "_" + var11, -1);
                class172.field2865[var8] = class175.field2919.method1160("ul" + var9 + "_" + var11, -1);
                if (class295.field4819[var8] == -1) {
                    class236.field3705[var8] = -1;
                    class33.field544[var8] = -1;
                    class139.field2234[var8] = -1;
                    class172.field2865[var8] = -1;
                }
                ++var8;
            }
        }
        for (int var10 = var8; var10 < class295.field4819.length; ++var10) {
            class295.field4819[var10] = -1;
            class236.field3705[var10] = -1;
            class33.field544[var10] = -1;
            class139.field2234[var10] = -1;
            class172.field2865[var10] = -1;
        }
        class93.method655(var2, var3, true, var5, false, var6, var1, 102);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILwa;IIZ)Lrk;")
    public static final class292 method2101(int arg0, int arg1, int arg2, class280 arg3, int arg4, int arg5, boolean arg6) {
        ++field5013;
        int var8 = (arg2 << 17) + ((arg6 ? 65536 : 0) + arg4 - -(arg5 << 19));
        long var9 = (long) arg1 * 3147483667L - -((long) var8 * 3849834839L);
        class292 var11 = (class292) class254.field4198.method1879(8887, var9);
        if (var11 != null) {
            return var11;
        } else {
            class136.field2203 = false;
            class292 var12 = class149.method1011(arg5, false, arg1, arg3, 0, arg6, false, arg4, arg2);
            if (var12 != null && !class136.field2203) {
                class254.field4198.method1883(var9, arg0 ^ 765, var12);
            }
            if (arg0 != 741) {
                field5009 = false;
            }
            return var12;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)[B")
    public final byte[] method1045(boolean arg0) {
        ++field5004;
        if (!arg0) {
            method2102(-42);
        }
        if (super.field2461) {
            throw new RuntimeException();
        } else {
            return this.field5014;
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)I")
    public final int method1043(int arg0) {
        if (arg0 != -12007) {
            method2104((byte) 25, -102, 6, -54, 6, -32, -1, -83);
        }
        ++field5012;
        return super.field2461 ? 0 : 100;
    }

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "(I)V")
    public static void method2102(int arg0) {
        field5022 = null;
        field5020 = null;
        field5021 = null;
        field5008 = null;
        field5024 = null;
        field5010 = null;
        field5019 = null;
        if (arg0 > -21) {
            method2101(12, 16, 23, (class280) null, -96, 66, true);
        }
        field5018 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
    public static final void method2103(int arg0, int arg1) {
        ++field5007;
        if (arg1 != 8) {
            field5017 = -71;
        }
        class257.field4232.method1880(-99, arg0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method2104(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5016;
        int var8 = arg2 + arg4;
        int var9 = -arg4 + arg3;
        int var10 = arg4 + arg6;
        for (int var11 = arg2; ~var8 < ~var11; ++var11) {
            class309.method2096(arg1, arg5, (byte) -117, class232.field3629[var11], arg6);
        }
        for (int var12 = arg3; ~var9 > ~var12; --var12) {
            class309.method2096(arg1, arg5, (byte) -117, class232.field3629[var12], arg6);
        }
        if (arg0 != 70) {
            method2103(85, 118);
        }
        int var13 = -arg4 + arg5;
        for (int var14 = var8; var9 >= var14; ++var14) {
            int[] var15 = class232.field3629[var14];
            class309.method2096(arg1, var10, (byte) -117, var15, arg6);
            class309.method2096(arg7, var13, (byte) -117, var15, var10);
            class309.method2096(arg1, arg5, (byte) -117, var15, var13);
        }
    }
}
