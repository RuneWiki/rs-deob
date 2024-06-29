import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class397 {

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "Lvk;")
    private class56 field5893 = new class56(256);

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "Lvk;")
    private class56 field5903 = new class56(256);

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "Llm;")
    private class347 field5894;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "Llm;")
    private class347 field5896;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "[J")
    public static long[] field5895 = new long[256];

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "S")
    public static short field5907;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "Lcr;")
    public static class189 field5905;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "Lar;")
    public static class47 field5909;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "Llm;")
    public static class347 field5911;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "[I")
    public static int[] field5908;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "[I")
    public static int[] field5912;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "([III)Lig;")
    public final class13 method2548(int[] arg0, int arg1, int arg2) {
        field5898++;
        if (this.field5894.method2268((byte) 67) == 1) {
            return this.method2550(843426860, arg2, 0, arg0);
        }
        int var4 = 4 / ((arg1 + 13) / 38);
        if (this.field5894.method2272(63, arg2) != 1) {
            throw new RuntimeException();
        }
        return this.method2550(843426860, 0, arg2, arg0);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I[IB)Lig;")
    public final class13 method2549(int arg0, int[] arg1, byte arg2) {
        field5906++;
        if (arg2 != 60) {
            method2554(59, 111);
        }
        if (this.field5896.method2268((byte) 67) == 1) {
            return this.method2557(arg0, 0, 80, arg1);
        } else if (this.field5896.method2272(112, arg0) == 1) {
            return this.method2557(0, arg0, arg2 ^ 0x77, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III[I)Lig;")
    private final class13 method2550(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 != 843426860) {
            return null;
        }
        field5891++;
        int var5 = arg1 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFFC);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class13 var9 = (class13) this.field5903.method384(var7, true);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class285 var10 = class285.method1959(this.field5894, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class13 var11 = var10.method1958();
            this.field5903.method381(true, var11, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field209.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "([Ljava/lang/Object;[IZ)V")
    public static final void method2551(Object[] arg0, int[] arg1, boolean arg2) {
        class319.method2150(0, -1, arg1, arg0, arg1.length - 1);
        if (!arg2) {
            field5895 = null;
        }
        field5902++;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lnj;I)V")
    public static final void method2552(class228 arg0, int arg1) {
        field5892++;
        if (arg0.field3040.length - arg0.field3029 < 1) {
            return;
        }
        int var2 = arg0.method1348(-112);
        if (var2 < 0 || var2 > 14) {
            return;
        }
        byte var3;
        if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg0.field3040.length - arg0.field3029 < var3) {
            return;
        }
        class416.field6106 = arg0.method1348(-126);
        if (class416.field6106 < 1) {
            class416.field6106 = 1;
        } else if (class416.field6106 > 4) {
            class416.field6106 = 4;
        }
        class44.method316(arg0.method1348(-125) == 1, true);
        class93.field1342 = arg0.method1348(-88) == 1;
        class42.field584 = arg0.method1348(-106) == 1;
        class411.field6069 = arg0.method1348(-97) == 1;
        class416.field6114 = arg0.method1348(-96) == 1 ? 1 : 0;
        class166.field2240 = arg0.method1348(-118) == 1;
        class431.field6338 = arg0.method1348(arg1 ^ 0x75) == 1;
        class120.field1678 = arg0.method1348(-101) == 1;
        class423.field6238 = arg0.method1348(-98);
        if (class423.field6238 > 2) {
            class423.field6238 = 2;
        }
        if (var2 >= 2) {
            class211.field2801 = arg0.method1348(-116) == 1;
        } else {
            class211.field2801 = arg0.method1348(-118) == 1;
            arg0.method1348(-106);
        }
        class213.field2853 = arg0.method1348(arg1 - 98) == 1;
        class339.field4891 = arg0.method1348(-89) == 1;
        class286.field4145 = arg0.method1348(-122);
        if (class286.field4145 > 2) {
            class286.field4145 = 2;
        }
        class115.field1611 = class286.field4145;
        class299.field4384 = arg0.method1348(-110) == 1;
        class359.field5186 = arg0.method1348(arg1 - 102);
        if (class359.field5186 > 127) {
            class359.field5186 = 127;
        }
        class400.field5969 = arg0.method1348(-128);
        class156.field2123 = arg0.method1348(-117);
        if (class156.field2123 > 127) {
            class156.field2123 = 127;
        }
        if (var2 >= 1) {
            class406.field6030 = arg0.method1343(arg1 ^ 0xFFFFFF0E);
            class122.field1692 = arg0.method1343(255);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1348(arg1 ^ 0x6A);
        }
        if (var2 >= 4) {
            int var4 = arg0.method1348(arg1 - 84);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class134.field1867 < 96) {
                var4 = 0;
            }
            class377.method2448(var4, (byte) -2);
        }
        if (var2 >= 5) {
            class71.field1022 = arg0.method1344((byte) 79);
        }
        int var5 = 0;
        if (var2 >= 6) {
            class11.field171 = var5 = arg0.method1348(-126);
        }
        if (class11.field171 != 1 && class11.field171 != 2) {
            class11.field171 = 2;
        }
        if (var2 >= 7) {
            class275.field3987 = arg0.method1348(-97) == 1;
        }
        if (var2 >= 8) {
            class184.field2496 = arg0.method1348(arg1 ^ 0x70) == 1;
        }
        if (var2 >= 9) {
            class365.field5288 = arg0.method1348(-99);
        }
        if (class365.field5288 < 0 || class365.field5288 > 3) {
            class365.field5288 = 0;
        }
        if (var2 >= 10) {
            class324.field4753 = arg0.method1348(-117) != 0;
        }
        if (var2 >= 11) {
            class434.field6387 = arg0.method1348(-98) != 0;
        }
        if (var2 >= 12) {
            class416.field6114 = arg0.method1348(-119);
        }
        if (class416.field6114 < 0 || class416.field6114 > 2) {
            class416.field6114 = 1;
        }
        if (var2 >= 13) {
            class275.field3984 = arg0.method1348(-116) == 1;
        }
        if (~var2 <= arg1) {
            class196.field2622 = arg0.method1348(-127);
        } else if (var5 == 0) {
            class196.field2622 = 2;
        } else {
            class196.field2622 = 1;
        }
        if (class196.field2622 < 0 || class196.field2622 > 3) {
            class196.field2622 = 2;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
    public static void method2553(boolean arg0) {
        if (!arg0) {
            field5909 = null;
        }
        field5912 = null;
        field5909 = null;
        field5895 = null;
        field5905 = null;
        field5911 = null;
        field5908 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Leb;")
    public static final class382 method2554(int arg0, int arg1) {
        field5897++;
        class162[] var2 = class380.field5529;
        synchronized (class380.field5529) {
            if (arg1 != 0) {
                method2556((byte) 92, (class212) null);
            }
            class382 var3;
            if (class380.field5529.length <= arg0 || class380.field5529[arg0].method1002(arg1 ^ 0xFFFFA0C8)) {
                var3 = new class382();
                var3.field5543 = new class330[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field5543[var4] = new class330();
                }
            } else {
                var3 = (class382) class380.field5529[arg0].method999(-1);
                var3.method686(125);
                int var10002 = class92.field1298[arg0]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2555(int arg0, String arg1) {
        field5899++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class106.method712(arg0 - 2294, arg1.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class106.method712(-11, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        if (arg0 != 2289) {
            method2553(false);
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class45.method325(var7, (byte) -121)) {
                char var8 = class16.method101(var7, -12020);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLdr;)Ljava/lang/String;")
    public static final String method2556(byte arg0, class212 arg1) {
        field5901++;
        if (arg0 <= 108) {
            return null;
        } else if (arg1.field2838 == null || arg1.field2838.length() <= 0) {
            return arg1.field2841;
        } else {
            return arg1.field2841 + class159.field2149 + arg1.field2838;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(III[I)Lig;")
    private final class13 method2557(int arg0, int arg1, int arg2, int[] arg3) {
        field5900++;
        if (arg2 <= 60) {
            field5905 = null;
        }
        int var5 = (arg1 >>> 12 | arg1 << 4 & 0xFFF7) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class13 var9 = (class13) this.field5903.method384(var7, true);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class370 var10 = (class370) this.field5893.method384(var7, true);
            if (var10 == null) {
                var10 = class370.method2405(this.field5896, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field5893.method381(true, var10, var7);
            }
            class13 var11 = var10.method2401(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method322(11);
                this.field5903.method381(true, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Llm;Llm;)V")
    public class397(class347 arg0, class347 arg1) {
        this.field5894 = arg0;
        this.field5896 = arg1;
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
            field5895[var0] = var1;
        }
        field5907 = 1;
        field5905 = new class189(64);
        field5909 = new class47();
        field5914 = 0;
    }
}
