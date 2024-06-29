import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class186 {

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "[J")
    public static long[] field2606 = new long[256];

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method1270(byte arg0, int arg1) {
        field2603++;
        if (arg1 == 100 && class267.field3976 > 0) {
            byte[] var2 = class320.field4718[--class267.field3976];
            class320.field4718[class267.field3976] = null;
            return var2;
        } else if (arg1 == 5000 && class455.field6734 > 0) {
            byte[] var3 = class464.field6837[--class455.field6734];
            class464.field6837[class455.field6734] = null;
            return var3;
        } else if (arg1 == 30000 && class336.field4965 > 0) {
            byte[] var4 = class365.field5267[--class336.field4965];
            class365.field5267[class336.field4965] = null;
            return var4;
        } else if (arg0 > -109) {
            return null;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public static void method1271(byte arg0) {
        field2606 = null;
        if (arg0 > -95) {
            method1273(true, 61, 19, 124);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static final void method1272(int arg0) {
        field2604++;
        if (arg0 >= -76) {
            method1271((byte) -2);
        }
        class443.field6436.method2307(86);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZIII)I")
    public static final int method1273(boolean arg0, int arg1, int arg2, int arg3) {
        field2602++;
        class243 var4 = class46.method378(arg1, arg0, false);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = arg2;
            for (int var6 = 0; var6 < var4.field3607.length; var6++) {
                if (var4.field3599[var6] == arg3) {
                    var5 += var4.field3607[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IB)V")
    public static final void method1274(int arg0, byte arg1) {
        field2607++;
        if (arg1 == 17) {
            class363 var2 = class264.field3902;
            synchronized (class264.field3902) {
                class264.field3902.method2300(arg0, true);
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Log;")
    public static final class369 method1275(int arg0, int arg1, int arg2) {
        if (class178.field2530[arg0][arg1][arg2] == null) {
            boolean var3 = class178.field2530[0][arg1][arg2] != null && class178.field2530[0][arg1][arg2].field5351 != null;
            if (var3 && arg0 >= class204.field2870 - 1) {
                return null;
            }
            class202.method1391(arg0, arg1, arg2);
        }
        return class178.field2530[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)V")
    public static final void method1276(byte arg0) {
        if (arg0 == -78) {
            class306.method2044();
            field2605++;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2606[var0] = var1;
        }
        field2608 = 0;
    }
}
