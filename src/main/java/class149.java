import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class149 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Loa;")
    public class149 field1886;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lib;")
    public class247 field1891;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "[I")
    public static int[] field1893 = new int[4096];

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field1899 = new String[100];

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field1901 = 0;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[J")
    public static long[] field1897 = new long[256];

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field1894 = -1;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lal;")
    public static class369 field1883;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "[I")
    public static int[] field1898;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[Lvd;")
    public static class4[] field1890;

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
            field1897[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Z", line = 12)
    public static final boolean method794(boolean arg0) {
        for (int var1 = class27.field257; var1 < class366.field5129; var1++) {
            class96[][] var2 = class176.field2209[var1];
            for (int var3 = -class430.field6316; var3 <= 0; var3++) {
                int var4 = class98.field1164 + var3;
                int var5 = class98.field1164 - var3;
                if (var4 >= class231.field3183 || var5 < class105.field1290) {
                    for (int var6 = -class430.field6316; var6 <= 0; var6++) {
                        int var7 = class419.field6103 + var6;
                        int var8 = class419.field6103 - var6;
                        if (var4 >= class231.field3183) {
                            if (var7 >= class312.field4193) {
                                class96 var9 = var2[var4][var7];
                                if (var9 != null && var9.field1131) {
                                    class244.field3325 = arg0;
                                    class211.field2862.method1079(0, var9);
                                    class211.field2862.method1076((byte) 28);
                                }
                            }
                            if (var8 < class207.field2797) {
                                class96 var10 = var2[var4][var8];
                                if (var10 != null && var10.field1131) {
                                    class244.field3325 = arg0;
                                    class211.field2862.method1079(0, var10);
                                    class211.field2862.method1076((byte) 98);
                                }
                            }
                        }
                        if (var5 < class105.field1290) {
                            if (var7 >= class312.field4193) {
                                class96 var11 = var2[var5][var7];
                                if (var11 != null && var11.field1131) {
                                    class244.field3325 = arg0;
                                    class211.field2862.method1079(0, var11);
                                    class211.field2862.method1076((byte) 70);
                                }
                            }
                            if (var8 < class207.field2797) {
                                class96 var12 = var2[var5][var8];
                                if (var12 != null && var12.field1131) {
                                    class244.field3325 = arg0;
                                    class211.field2862.method1079(0, var12);
                                    class211.field2862.method1076((byte) -19);
                                }
                            }
                        }
                        if (class140.field1798 == 0) {
                            if (class160.field2064) {
                                class211.field2862.method1081(24, (byte) 80);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 126)
    public static void method795(byte arg0) {
        field1890 = null;
        field1898 = null;
        field1899 = null;
        field1893 = null;
        field1883 = null;
        if (arg0 != -42) {
            method799((byte) -120);
        }
        field1897 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)I", line = 142)
    public static final int method796(int arg0, int arg1, int arg2, int arg3) {
        field1902++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            if (arg2 != 8919) {
                field1890 = null;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLam;Lam;)V", line = 167)
    public static final void method797(boolean arg0, class286 arg1, class286 arg2) {
        class184.field2347 = arg1;
        if (!arg0) {
            class244.field3322 = arg2;
            field1895++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZZ)V", line = 180)
    public static final void method798(boolean arg0, boolean arg1) {
        class357.method2176(class333.field4423, class272.field3680, class337.field4496, arg0, 119);
        field1887++;
        if (arg1) {
            field1883 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V", line = 197)
    public static final void method799(byte arg0) {
        field1885++;
        for (class173 var1 = (class173) class156.field1973.method983((byte) 106); var1 != null; var1 = (class173) class156.field1973.method983((byte) 106)) {
            class210.method1142((byte) 120, var1);
        }
        if (arg0 != 62) {
            return;
        }
        client.method1405();
        client.method1413();
        client.method1418();
        client.method1424();
        client.method1412();
        client.method1426();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z[J[I)V", line = 225)
    public static final void method800(boolean arg0, long[] arg1, int[] arg2) {
        if (!arg0) {
            class111.method594(arg2, arg1, 0, true, arg1.length - 1);
            field1889++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(II)V", line = 250)
    public class149(int arg0, int arg1) {
        this.field1884 = arg0;
        this.field1896 = arg1;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Loa;I)V", line = 261)
    public class149(class149 arg0, int arg1) {
        this.field1886 = arg0;
        this.field1891 = this.field1886.field1891;
        this.field1896 = this.field1886.field1896 + arg1;
        this.field1884 = this.field1886.field1884;
    }
}
