import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class344 extends class421 {

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "Lsh;")
    public static class48 field5002 = new class48("RC", 1);

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public int field4997;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
    public int field4998;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public int field5000;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!ts", name = "A", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "J")
    public long field5008;

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "[I")
    public static int[] field5007;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)I")
    public final int method2157(int arg0) {
        field5006++;
        if (arg0 < 104) {
            this.field5008 = -61L;
        }
        return this.field4997;
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)I")
    public static final int method2158(int arg0) {
        field4999++;
        if ((double) class395.field5615 == 3.0D) {
            return 37;
        } else if ((double) class395.field5615 == 4.0D) {
            return 50;
        } else {
            int var1 = -23 % ((arg0 + 31) / 50);
            if ((double) class395.field5615 == 6.0D) {
                return 75;
            } else if ((double) class395.field5615 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
    public final int method2159(int arg0) {
        if (arg0 > -74) {
            this.field5000 = -26;
        }
        field5005++;
        return this.field5000;
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V")
    public static void method2160(int arg0) {
        if (arg0 != -1) {
            field5007 = null;
        }
        field5007 = null;
        field5002 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILbd;Lbd;Z)I")
    public static final int method2161(int arg0, int arg1, class42 arg2, class42 arg3, boolean arg4) {
        field5004++;
        if (arg1 == 1) {
            int var5 = arg3.field4618;
            int var6 = arg2.field4618;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class180.method1105(class326.field4711, -85, arg2.method285((byte) 64).field4307, arg3.method285((byte) 56).field4307);
        } else if (arg1 != 3) {
            if (arg0 <= 115) {
                method2163((class477) null, 35);
            }
            if (arg1 == 4) {
                if (arg3.method2036(true)) {
                    return arg2.method2036(true) ? 0 : 1;
                } else if (arg2.method2036(true)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 5) {
                if (arg3.method2043(-1)) {
                    return arg2.method2043(-1) ? 0 : 1;
                } else if (arg2.method2043(-1)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 6) {
                if (arg3.method2038(4)) {
                    return arg2.method2038(4) ? 0 : 1;
                } else if (arg2.method2038(4)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 7) {
                if (arg3.method2042(24972)) {
                    return arg2.method2042(24972) ? 0 : 1;
                } else if (arg2.method2042(24972)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 8) {
                int var7 = arg3.field622;
                int var8 = arg2.field622;
                if (arg4) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg3.field620 - arg2.field620;
            }
        } else if (arg3.field618.equals("-")) {
            if (arg2.field618.equals("-")) {
                return 0;
            } else if (arg4) {
                return -1;
            } else {
                return 1;
            }
        } else if (arg2.field618.equals("-")) {
            return arg4 ? 1 : -1;
        } else {
            return class180.method1105(class326.field4711, -66, arg2.field618, arg3.field618);
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)I")
    public final int method2162(boolean arg0) {
        field5003++;
        if (!arg0) {
            field5002 = null;
        }
        return this.field4998;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lql;I)V")
    public static final void method2163(class477 arg0, int arg1) {
        arg0.field6694 = null;
        if (arg1 != -1) {
            method2160(-34);
        }
        field5001++;
        int var2 = arg0.field6696.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field6696[var3].field1258 = false;
        }
        class225[] var4 = class171.field2487;
        synchronized (class171.field2487) {
            if (var2 < class171.field2487.length && class200.field2920[var2] < 200) {
                class171.field2487[var2].method1444(arg0, (byte) 111);
                int var10002 = class200.field2920[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(Z)J")
    public final long method2164(boolean arg0) {
        field5009++;
        return arg0 ? this.field5008 : -119L;
    }
}
