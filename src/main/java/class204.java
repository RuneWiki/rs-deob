import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class204 extends class399 {

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Ljj;")
    public static class398 field2670 = new class398(49, 4);

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "J")
    public static long field2681 = 0L;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "F")
    public static float field2677;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Luk;")
    public class204 field2668;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Luk;")
    public class204 field2671;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Lps;")
    public static class610 field2673;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "[I")
    public static int[] field2679;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([J[IB)V")
    public static final void method1278(long[] arg0, int[] arg1, byte arg2) {
        if (arg2 > -85) {
            method1284(-44);
        }
        class95.method527(13, arg0, arg1, arg0.length - 1, 0);
        field2678++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1279(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2672++;
        int var6 = arg2 - arg1;
        int var7 = arg3 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class420.method2438(false, arg3, arg0, arg1, arg4);
            }
        } else if (var7 == 0) {
            class609.method3357(arg4, arg2, arg1, false, arg0);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class398.field5676) {
                var10 = (class398.field5676 * var8 >> 12) + var9;
                var11 = class398.field5676;
            } else if (class298.field3995 < arg2) {
                var11 = class298.field3995;
                var10 = var9 + (class298.field3995 * var8 >> 12);
            } else {
                var11 = arg2;
                var10 = arg3;
            }
            if (arg5 >= -47) {
                field2679 = null;
            }
            int var12;
            int var13;
            if (arg1 < class398.field5676) {
                var12 = var9 + (class398.field5676 * var8 >> 12);
                var13 = class398.field5676;
            } else if (class298.field3995 >= arg1) {
                var13 = arg1;
                var12 = arg0;
            } else {
                var12 = (class298.field3995 * var8 >> 12) + var9;
                var13 = class298.field3995;
            }
            if (class609.field8313 > var10) {
                var11 = (class609.field8313 - var9 << 12) / var8;
                var10 = class609.field8313;
            } else if (class19.field169 < var10) {
                var11 = (class19.field169 - var9 << 12) / var8;
                var10 = class19.field169;
            }
            if (var12 < class609.field8313) {
                var13 = (class609.field8313 - var9 << 12) / var8;
                var12 = class609.field8313;
            } else if (var12 > class19.field169) {
                var13 = (class19.field169 - var9 << 12) / var8;
                var12 = class19.field169;
            }
            class673.method3721(var10, var11, arg4, var12, -9797, var13);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
    public static final void method1280(int arg0, int arg1) {
        field2674++;
        class19 var2 = class364.method2236(1248116640, arg1, 14);
        int var3 = -94 % ((arg0 - 74) / 41);
        var2.method104(10);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method1281(int arg0) {
        field2670 = null;
        if (arg0 == 0) {
            field2679 = null;
            field2673 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public final void method1282(int arg0) {
        field2676++;
        if (this.field2671 == null) {
            return;
        }
        this.field2671.field2668 = this.field2668;
        this.field2668.field2671 = this.field2671;
        this.field2671 = null;
        this.field2668 = null;
        if (arg0 > -17) {
            method1283(-116);
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
    public static final void method1283(int arg0) {
        class253.field3491.field1745 = 0;
        field2675++;
        class412.field5780 = 0;
        class365.field5243 = 0;
        class164.field2068.field1745 = 0;
        class253.field3494 = null;
        class308.field4138 = null;
        class99.field1210 = null;
        class143.field1819 = null;
        class161.field2037 = 0;
        class559.method3125(888113385);
        if (arg0 <= 114) {
            return;
        }
        class98.method540(53);
        for (int var1 = 0; var1 < 2048; var1++) {
            class292.field3912[var1] = null;
        }
        class596.field8164 = null;
        for (int var2 = 0; var2 < class327.field4786; var2++) {
            class676 var4 = class42.field541[var2].field8702;
            if (var4 != null) {
                var4.field430 = -1;
            }
        }
        class523.method2982(true);
        class42.field546 = 1;
        class676.method3739(-22149, 10);
        for (int var3 = 0; var3 < 100; var3++) {
            class200.field2630[var3] = true;
        }
        class252.method1579((byte) -102);
        class46.field626 = 0L;
        class335.field4940 = null;
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)Ljava/lang/String;")
    public static final String method1284(int arg0) {
        field2669++;
        if (arg0 != -21195) {
            method1278(null, null, (byte) 3);
        }
        return class483.field6542 || class468.field6362 == null ? "" : class468.field6362.field904;
    }
}
