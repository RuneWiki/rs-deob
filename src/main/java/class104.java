import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class104 extends class114 {

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field1934 = 0;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "Lia;")
    public static class257 field1935 = class28.method234(111, "www)2wtrc");

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "[J")
    public static long[] field1938 = new long[32];

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field1940 = 0;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "[I")
    public static int[] field1941 = new int[256];

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Lia;")
    public static class257 field1942;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "[Lak;")
    public static class190[] field1943;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method752(byte arg0);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZ)V")
    public static final void method753(byte arg0, boolean arg1) {
        field1937++;
        for (int var2 = 0; var2 < class140.field2487; var2++) {
            class197 var3 = class92.field1758[class199.field3412[var2]];
            long var4 = (long) class199.field3412[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method1236(0) && arg1 == var3.field3322.field3339 && var3.field3322.method1323(1)) {
                int var6 = var3.field4177 >> 7;
                int var7 = var3.field4143 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field4128 == 1 && (var3.field4177 & 0x7F) == 64 && (var3.field4143 & 0x7F) == 64) {
                        if (class185.field3223[var6][var7] == class15.field328) {
                            continue;
                        }
                        class185.field3223[var6][var7] = class15.field328;
                    }
                    if (!var3.field3322.field3374) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field4121 = class109.method803(class189.field3261, var3.field4128 * 64 + var3.field4143 - 64, (byte) 113, (var3.field4128 - 1) * 64 + var3.field4177);
                    class246.method1614(class189.field3261, var3.field4177, var3.field4143, var3.field4121, var3.field4128 * 64 + 60 - 64, var3, var3.field4118, var4, var3.field4142);
                }
            }
        }
        if (arg0 != 59) {
            method757(-10, (class180) null, 103, -1, 117);
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V")
    public static final void method754(int arg0, int arg1) {
        field1939++;
        if (class31.method258(arg0, 0)) {
            class177.method1192(arg1, class28.field539[arg0], true);
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)Z")
    public abstract boolean method755(byte arg0);

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
    public static void method756(int arg0) {
        if (arg0 < 3) {
            method754(80, 55);
        }
        field1938 = null;
        field1941 = null;
        field1943 = null;
        field1935 = null;
        field1942 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILib;III)V")
    public static final void method757(int arg0, class180 arg1, int arg2, int arg3, int arg4) {
        field1936++;
        if (class137.field2441 == arg1 || class199.field3407 >= 400) {
            return;
        }
        class257 var5;
        if (arg1.field3121 == 0) {
            var5 = class233.method1528(new class257[] { arg1.field3140, class159.method1109(class137.field2441.field3115, 3, arg1.field3115), field1942, class156.field2737, class111.method808(10, arg1.field3115), class79.field1550 }, 0);
        } else {
            var5 = class233.method1528(new class257[] { arg1.field3140, field1942, class78.field1496, class111.method808(10, arg1.field3121), class79.field1550 }, 0);
        }
        if (class31.field611 == 1) {
            class159.field2794++;
            class95.method694(class233.method1528(new class257[] { class181.field3142, class115.field2078, var5 }, 0), class200.field3414, arg4, 27360, arg3, (short) 33, (long) arg2);
        } else if (!class257.field4404) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class111.field2040[var6] != null) {
                    short var7 = 0;
                    if (class87.field1675 == 0 && class111.field2040[var6].method1681((byte) 113, class117.field2103)) {
                        if (arg1.field3115 > class137.field2441.field3115) {
                            var7 = 2000;
                        }
                        if (class137.field2441.field3120 != 0 && arg1.field3120 != 0) {
                            if (class137.field2441.field3120 == arg1.field3120) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class124.field2223[var6]) {
                        var7 = 2000;
                    }
                    class37.field737++;
                    boolean var8 = false;
                    short var9 = class90.field1720[var6];
                    short var10 = (short) (var7 + var9);
                    class95.method694(class233.method1528(new class257[] { class30.field572, var5 }, 0), class111.field2040[var6], arg4, 27360, arg3, var10, (long) arg2);
                }
            }
        } else if ((class76.field1491 & 0x8) == 8) {
            class39.field784++;
            class95.method694(class233.method1528(new class257[] { class72.field1405, class115.field2078, var5 }, 0), class181.field3143, arg4, 27360, arg3, (short) 58, (long) arg2);
        }
        if (arg0 != 7) {
            return;
        }
        for (int var11 = 0; var11 < class199.field3407; var11++) {
            if (class32.field616[var11] == 3) {
                class92.field1757[var11] = class233.method1528(new class257[] { class30.field572, var5 }, 0);
                return;
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1941[var0] = var1;
        }
        field1942 = class28.method234(116, " (X");
        field1944 = 0;
    }
}
