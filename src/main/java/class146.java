import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class146 extends class97 {

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public int field2025;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "J")
    public static long field2031 = 0L;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field2029 = 0;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lwl;")
    public static class452 field2026 = new class452(26, 8);

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field2032 = 0;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Lga;")
    public static class217 field2023;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Ltb;")
    public static class290 field2028;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ldr;)V")
    public static final void method913(class261 arg0) {
        for (int var1 = class382.field5579; var1 < class56.field750; var1++) {
            for (int var2 = 0; var2 < class275.field4206; var2++) {
                for (int var3 = 0; var3 < class265.field4044; var3++) {
                    class13 var4 = class277.field4216[var1][var2][var3];
                    if (var4 != null) {
                        class233 var5 = var4.field167;
                        class233 var6 = var4.field163;
                        if (var5 != null && var5.method112(true)) {
                            class398.method2501(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method112(true)) {
                                class398.method2501(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method117(false, 0, var5, 0, 0, 0, arg0);
                                var6.method116((byte) -62);
                            }
                            var5.method116((byte) -92);
                        }
                        for (class466 var7 = var4.field151; var7 != null; var7 = var7.field6853) {
                            class141 var9 = var7.field6862;
                            if (var9 != null && var9.method112(true)) {
                                class398.method2501(arg0, var9, var1, var2, var3, var9.field1890 + 1 - var9.field1895, var9.field1889 - var9.field1901 + 1);
                                var9.method116((byte) -125);
                            }
                        }
                        class316 var8 = var4.field166;
                        if (var8 != null && var8.method112(true)) {
                            class458.method2840(arg0, var8, var1, var2, var3);
                            var8.method116((byte) -64);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)Z")
    public static final boolean method914(byte arg0, int arg1) {
        if (arg0 >= -76) {
            return false;
        } else {
            field2027++;
            return (arg1 & -arg1) == arg1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public static void method915(byte arg0) {
        field2026 = null;
        field2028 = null;
        field2023 = null;
        if (arg0 > -111) {
            method914((byte) -61, -30);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILwn;BI)V")
    public static final void method916(int arg0, class155 arg1, byte arg2, int arg3) {
        if (arg1.field1955 == arg0 && arg0 != -1) {
            class379 var4 = class98.method629(arg0, (byte) -115);
            int var5 = var4.field5531;
            if (var5 == 1) {
                arg1.field1928 = 0;
                arg1.field1948 = 0;
                arg1.field1941 = 1;
                arg1.field1962 = 0;
                arg1.field1935 = arg3;
                class251.method1528(false, arg1.field1928, arg1.field1892, arg1.field1900, var4, arg1.field1902, (byte) -118);
            }
            if (var5 == 2) {
                arg1.field1948 = 0;
            }
        } else if (arg0 == -1 || arg1.field1955 == -1 || class98.method629(arg0, (byte) -115).field5536 >= class98.method629(arg1.field1955, (byte) -115).field5536) {
            arg1.field2014 = arg1.field2013;
            arg1.field1955 = arg0;
            arg1.field1948 = 0;
            arg1.field1935 = arg3;
            arg1.field1962 = 0;
            arg1.field1928 = 0;
            arg1.field1941 = 1;
            if (arg1.field1955 != -1) {
                class251.method1528(false, arg1.field1928, arg1.field1892, arg1.field1900, class98.method629(arg1.field1955, (byte) -115), arg1.field1902, (byte) -118);
            }
        }
        if (arg2 > -14) {
            method913((class261) null);
        }
        field2024++;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V")
    public class146(int arg0, int arg1) {
        this.field2022 = arg1;
        this.field2025 = arg0;
    }
}
