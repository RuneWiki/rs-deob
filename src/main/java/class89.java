import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class89 implements Runnable {

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "[[B")
    public static byte[][] field2182 = new byte[250][];

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2185 = 0;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2183 = 256;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "La;")
    public static class1 field2177 = class113.method934(-11538, "System)2Update in: ");

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "La;")
    public static class1 field2184 = class113.method934(-11538, "(U");

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2178 = 0;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2192 = 0;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "La;")
    public static class1 field2186 = class113.method934(-11538, "null");

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "La;")
    private static class1 field2176 = class113.method934(-11538, "Please remove ");

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "La;")
    public static class1 field2175 = field2176;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "La;")
    public static class1 field2181 = field2176;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field2191 = -1;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Le;")
    public static class25 field2190;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[[I")
    public static int[][] field2173;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILa;La;)V", line = 5)
    public static final void method761(int arg0, int arg1, class1 arg2, class1 arg3) {
        field2172++;
        if (class86.field2169 == -1) {
            class105.field2640 = true;
        }
        if (arg1 == 0 && class98.field2424 != -1) {
            class122.field3053 = 0;
            class64.field1608 = arg2;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class132.field3239[var4] = class132.field3239[var4 - 1];
            class128.field3133[var4] = class128.field3133[var4 - 1];
            class80.field2037[var4] = class80.field2037[var4 - 1];
        }
        class132.field3239[0] = arg1;
        class128.field3133[0] = arg3;
        if (arg0 >= 60) {
            class80.field2037[0] = arg2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "run", descriptor = "()V", line = 60)
    public final void run() {
        field2174++;
        try {
            while (true) {
                class92 var1 = class62.field1550;
                class57 var2;
                synchronized (class62.field1550) {
                    var2 = (class57) class62.field1550.method805((byte) -90);
                }
                if (var2 == null) {
                    class86.method756(100L, 113);
                    Object var3 = class5.field214;
                    synchronized (class5.field214) {
                        if (class8.field308 <= 1) {
                            class8.field308 = 0;
                            class5.field214.notifyAll();
                            return;
                        }
                        class8.field308--;
                    }
                } else {
                    if (var2.field1467 == 0) {
                        var2.field1472.method911(var2.field1457, 1862596560, var2.field1457.length, (int) var2.field2076);
                        class92 var5 = class62.field1550;
                        synchronized (class62.field1550) {
                            var2.method742(-1);
                        }
                    } else if (var2.field1467 == 1) {
                        var2.field1457 = var2.field1472.method909((int) var2.field2076, (byte) -111);
                        class92 var4 = class62.field1550;
                        synchronized (class62.field1550) {
                            class95.field2374.method807(var2, 115);
                        }
                    }
                    Object var6 = class5.field214;
                    synchronized (class5.field214) {
                        if (class8.field308 <= 1) {
                            class8.field308 = 0;
                            class5.field214.notifyAll();
                            return;
                        }
                        class8.field308 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class11.method215(null, (byte) -127, var17);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 140)
    public static void method762(int arg0) {
        field2177 = null;
        field2190 = null;
        field2176 = null;
        field2182 = null;
        if (arg0 != -1) {
            return;
        }
        field2184 = null;
        field2175 = null;
        field2181 = null;
        field2173 = null;
        field2186 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lta;", line = 169)
    public static final class115 method763(int arg0, int arg1) {
        field2189++;
        class115 var2 = (class115) class39.field1067.method264((long) arg0, (byte) 100);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class53.field1408.method218(arg0, 112, arg1);
        class115 var4 = new class115();
        var4.field2886 = arg0;
        if (var3 != null) {
            var4.method955(new class8(var3), -1);
        }
        var4.method945(29216);
        if (var4.field2841 != -1) {
            var4.method956(method763(var4.field2841, 10), false, method763(var4.field2846, 10));
        }
        if (!class95.field2387 && var4.field2883) {
            var4.field2833 = null;
            var4.field2857 = 0;
            var4.field2838 = null;
            var4.field2830 = class59.field1504;
        }
        class39.field1067.method263(arg1 - 7218, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILnb;)V", line = 207)
    public static final void method764(int arg0, class80 arg1) {
        field2180++;
        arg1.field1954 = arg1.field2003;
        if (arg1.field1986 == 0) {
            arg1.field1951 = 0;
            return;
        }
        if (arg1.field2018 != -1 && arg1.field1999 == 0) {
            class47 var2 = class4.method104(arg1.field2018, 2);
            if (arg1.field1971 > 0 && var2.field1229 == 0) {
                arg1.field1951++;
                return;
            }
            if (arg1.field1971 <= 0 && var2.field1235 == 0) {
                arg1.field1951++;
                return;
            }
        }
        int var3 = arg1.field1975;
        int var4 = arg1.field1965[arg1.field1986 - 1] * 128 + arg1.field1973 * 64;
        int var5 = arg1.field1966;
        int var6 = arg1.field2012[arg1.field1986 - 1] * 128 + arg1.field1973 * 64;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg1.field1975 = var4;
            arg1.field1966 = var6;
            return;
        }
        if (var3 < var4) {
            if (var5 < var6) {
                arg1.field1957 = 1280;
            } else if (var6 < var5) {
                arg1.field1957 = 1792;
            } else {
                arg1.field1957 = 1536;
            }
        } else if (var3 <= var4) {
            if (var6 > var5) {
                arg1.field1957 = 1024;
            } else if (var6 < var5) {
                arg1.field1957 = 0;
            }
        } else if (var5 < var6) {
            arg1.field1957 = 768;
        } else if (var6 < var5) {
            arg1.field1957 = 256;
        } else {
            arg1.field1957 = 512;
        }
        int var7 = arg1.field1956;
        int var8 = 4;
        if (arg1.field1995 != arg1.field1957 && arg1.field2014 == -1 && arg1.field1990 != 0) {
            var8 = 2;
        }
        if (arg1.field1986 > 2) {
            var8 = 6;
        }
        if (arg1.field1986 > 3) {
            var8 = 8;
        }
        int var9 = arg1.field1957 - arg1.field1995 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (~var9 <= arg0 && var9 <= 256) {
            var7 = arg1.field2008;
        } else if (var9 >= 256 && var9 < 768) {
            var7 = arg1.field2009;
        } else if (var9 >= -768 && var9 <= -256) {
            var7 = arg1.field1952;
        }
        if (var7 == -1) {
            var7 = arg1.field2008;
        }
        arg1.field1954 = var7;
        if (arg1.field1951 > 0 && arg1.field1986 > 1) {
            arg1.field1951--;
            var8 = 8;
        }
        if (arg1.field1949[arg1.field1986 - 1]) {
            var8 <<= 0x1;
        }
        if (var5 < var6) {
            arg1.field1966 += var8;
            if (arg1.field1966 > var6) {
                arg1.field1966 = var6;
            }
        } else if (var5 > var6) {
            arg1.field1966 -= var8;
            if (arg1.field1966 < var6) {
                arg1.field1966 = var6;
            }
        }
        if (var8 >= 8 && arg1.field2008 == arg1.field1954 && arg1.field1959 != -1) {
            arg1.field1954 = arg1.field1959;
        }
        if (var3 < var4) {
            arg1.field1975 += var8;
            if (var4 < arg1.field1975) {
                arg1.field1975 = var4;
            }
        } else if (var4 < var3) {
            arg1.field1975 -= var8;
            if (var4 > arg1.field1975) {
                arg1.field1975 = var4;
            }
        }
        if (arg1.field1975 == var4 && arg1.field1966 == var6) {
            if (arg1.field1971 > 0) {
                arg1.field1971--;
            }
            arg1.field1986--;
        }
    }
}
