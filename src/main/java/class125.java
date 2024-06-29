import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class125 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lub;")
    public static class227 field2238 = class257.method1749("m-Ochte mit Ihnen handeln)3", 17263);

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field2242 = 3;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lub;")
    public static class227 field2239 = class257.method1749("Hidden)2", 17263);

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lub;")
    public static class227 field2236 = class257.method1749("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 17263);

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lub;")
    private static class227 field2243 = class257.method1749("Loading fonts )2 ", 17263);

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Lub;")
    public static class227 field2248 = field2243;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Z")
    public static boolean field2247 = false;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lta;")
    public static class105 field2249 = null;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Ln;")
    public static class138 field2245;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILub;)Z")
    public static final boolean method769(int arg0, class227 arg1) {
        field2233++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 <= 82) {
            field2236 = null;
        }
        while (var2 < class86.field1485) {
            if (arg1.method1522(class249.field4321[var2], (byte) -56)) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)Lub;")
    public static final class227 method770(int arg0, byte arg1) {
        int var2 = 58 / ((11 - arg1) / 45);
        field2237++;
        return class213.field3607[arg0].method1521((byte) 106) > 0 ? class76.method445((byte) 31, new class227[] { class37.field611[arg0], class147.field2549, class213.field3607[arg0] }) : class37.field611[arg0];
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z")
    public static final boolean method771(int arg0, int arg1) {
        field2246++;
        if (arg1 == -28023) {
            return (arg0 & 0x26010F) >> 21 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static final void method772(int arg0) {
        field2235++;
        class7.field150.method1728(true);
        if (arg0 == -1595657136) {
            class96.field1681.method1728(true);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static void method773(int arg0) {
        field2239 = null;
        field2248 = null;
        field2238 = null;
        field2249 = null;
        field2243 = null;
        field2245 = null;
        int var1 = 101 % ((-arg0 - 36) / 53);
        field2236 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILta;ZII)V")
    public static final void method774(int arg0, class105 arg1, boolean arg2, int arg3, int arg4) {
        field2232++;
        int var5 = arg1.field1952;
        if (arg3 != 12345678) {
            field2247 = true;
        }
        int var6 = arg1.field1977;
        if (arg1.field1852 == 0) {
            arg1.field1952 = arg1.field1945;
        } else if (arg1.field1852 == 1) {
            arg1.field1952 = arg0 - arg1.field1945;
        } else if (arg1.field1852 == 2) {
            arg1.field1952 = arg1.field1945 * arg0 >> 14;
        } else if (arg1.field1852 == 3) {
            if (arg1.field1829 == 2) {
                arg1.field1952 = (arg1.field1945 - 1) * arg1.field1906 + arg1.field1945 * 32;
            } else if (arg1.field1829 == 7) {
                arg1.field1952 = (arg1.field1945 - 1) * arg1.field1906 + arg1.field1945 * 12;
            }
        }
        if (arg1.field1938 == 0) {
            arg1.field1977 = arg1.field1943;
        } else if (arg1.field1938 == 1) {
            arg1.field1977 = arg4 - arg1.field1943;
        } else if (arg1.field1938 == 2) {
            arg1.field1977 = arg1.field1943 * arg4 >> 14;
        } else if (arg1.field1938 == 3) {
            if (arg1.field1829 == 2) {
                arg1.field1977 = (arg1.field1943 - 1) * arg1.field1899 + arg1.field1943 * 32;
            } else if (arg1.field1829 == 7) {
                arg1.field1977 = arg1.field1943 * 115 + ((arg1.field1943 - 1) * arg1.field1899);
            }
        }
        if (arg1.field1938 == 4) {
            arg1.field1977 = arg1.field1952 * arg1.field1918 / arg1.field1869;
        }
        if (arg1.field1852 == 4) {
            arg1.field1952 = arg1.field1977 * arg1.field1869 / arg1.field1918;
        }
        if (class50.field882 && (client.method494(arg1) != 0 || arg1.field1829 == 0)) {
            if (arg1.field1952 < 5 && arg1.field1977 < 5) {
                arg1.field1977 = 5;
                arg1.field1952 = 5;
            } else {
                if (arg1.field1977 <= 0) {
                    arg1.field1977 = 5;
                }
                if (arg1.field1952 <= 0) {
                    arg1.field1952 = 5;
                }
            }
        }
        if (arg1.field1975 == 1337) {
            class79.field1384 = arg1;
        }
        if (arg2 && arg1.field1885 != null && arg1.field1977 != var6 || arg1.field1952 != var5) {
            class34 var7 = new class34();
            var7.field583 = arg1;
            var7.field568 = arg1.field1885;
            class15.field281.method1272(5664, var7);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII)I")
    public static final int method775(byte arg0, int arg1, int arg2) {
        field2241++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg0 > -87) {
            method773(117);
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 2048 - arg2 & 0x7FF;
        field2244++;
        if (arg6 < 97) {
            method771(33, -62);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = arg7;
        if (var8 != 0) {
            int var13 = class62.field1136[var8];
            var10 = -arg7 * var13 >> 16;
            int var14 = class62.field1143[var8];
            var12 = arg7 * var14 >> 16;
        }
        if (var11 != 0) {
            int var15 = class62.field1143[var11];
            int var16 = class62.field1136[var11];
            var9 = var12 * var16 >> 16;
            var12 = var12 * var15 >> 16;
        }
        class25.field422 = arg1 - var10;
        class103.field1812 = arg2;
        class88.field1527 = arg0 - var12;
        class161.field2724 = arg3;
        class184.field3135 = arg5 - var9;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)Lhe;")
    public static final class230 method777(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2012; var4++) {
            class230 var5 = var3.field2021[var4];
            if ((var5.field4029 >> 29 & 0x3L) == 2L && var5.field4032 == arg1 && var5.field4025 == arg2) {
                class145.method913(var5);
                return var5;
            }
        }
        return null;
    }
}
