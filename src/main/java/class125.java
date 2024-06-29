import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class125 {

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Leh;")
    private class94 field2065 = new class94(256);

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Leh;")
    private class94 field2076 = new class94(256);

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Lme;")
    private class295 field2069;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "Lme;")
    private class295 field2062;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Ltl;")
    public static class59 field2064 = class85.method639("Update)2Liste geladen)3", 9588);

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field2071 = -1;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Ltl;")
    public static class59 field2073 = class85.method639("Loading world list data", 9588);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)Lgd;", line = 5)
    public static final class156 method921(int arg0, boolean arg1) {
        field2070++;
        class156 var2 = (class156) class234.field3890.method1006((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        if (arg1) {
            field2071 = 37;
        }
        byte[] var3 = class234.field3897.method2042(arg0, 0, (byte) -123);
        if (var3 == null) {
            return null;
        }
        class156 var4 = new class156();
        class170 var5 = new class170(var3);
        var5.field2787 = var5.field2758.length - 2;
        int var6 = var5.method1214(-18254);
        int var7 = var5.field2758.length - var6 - 12 - 2;
        var5.field2787 = var7;
        int var8 = var5.method1233((byte) -77);
        var4.field2553 = var5.method1214(-18254);
        var4.field2551 = var5.method1214(-18254);
        var4.field2550 = var5.method1214(-18254);
        var4.field2547 = var5.method1214(-18254);
        int var9 = var5.method1221(109);
        if (var9 > 0) {
            var4.field2559 = new class94[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1214(-18254);
                class94 var12 = new class94(class43.method293(true, var11));
                var4.field2559[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1233((byte) -77);
                    int var14 = var5.method1233((byte) -77);
                    var12.method694(new class174(var14), (byte) -90, (long) var13);
                }
            }
        }
        var5.field2787 = 0;
        var4.field2558 = var5.method1239(-1);
        int var15 = 0;
        var4.field2545 = new int[var8];
        var4.field2549 = new int[var8];
        var4.field2555 = new class59[var8];
        while (var7 > var5.field2787) {
            int var16 = var5.method1214(-18254);
            if (var16 == 3) {
                var4.field2555[var15] = var5.method1250(arg1);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field2549[var15] = var5.method1221(110);
            } else {
                var4.field2549[var15] = var5.method1233((byte) -77);
            }
            var4.field2545[var15++] = var16;
        }
        class234.field3890.method1008(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z", line = 107)
    public static final boolean method922(byte arg0) {
        field2066++;
        int var1 = -36 % ((arg0 + 58) / 63);
        return class55.field815 ? true : class199.field3298;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([IIIB)Luc;", line = 121)
    private final class107 method923(int[] arg0, int arg1, int arg2, byte arg3) {
        field2061++;
        int var5 = arg2 ^ ((arg1 & 0x80000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class107 var9 = (class107) this.field2076.method685(var7, 128);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class144 var10 = class144.method1049(this.field2069, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            if (arg3 != 77) {
                this.field2076 = (class94) null;
            }
            class107 var11 = var10.method1048();
            this.field2076.method694(var11, (byte) -90, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field1796.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIII)V", line = 161)
    public static final void method924(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2068++;
        int var9 = arg8 - arg6;
        int var10 = (arg4 - arg5 << 16) / var9;
        if (arg3 == 2076831952) {
            int var11 = arg7 - arg2;
            int var12 = (arg0 - arg1 << 16) / var11;
            class153.method1098(0, arg8, var10, arg1, -7, arg5, 0, var12, arg6, arg2, arg7);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)Z", line = 181)
    public static final boolean method925(boolean arg0, int arg1) {
        field2074++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg0) {
            return arg1 < 129 || arg1 > 159;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III[I)Luc;", line = 205)
    private final class107 method926(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = arg2 ^ (arg0 >>> 12 | (arg0 & 0x40000FFF) << 4);
        field2063++;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class107 var9 = (class107) this.field2076.method685(var7, 128);
        if (arg1 != 5256) {
            return (class107) null;
        } else if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class181 var10 = (class181) this.field2065.method685(var7, 128);
            if (var10 == null) {
                var10 = class181.method1347(this.field2062, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field2065.method694(var10, (byte) -90, var7);
            }
            class107 var11 = var10.method1343(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method2000(arg1 ^ 0x14F0);
                this.field2076.method694(var11, (byte) -90, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 254)
    public static void method927(int arg0) {
        field2064 = null;
        if (arg0 > 23) {
            field2073 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II[I)Luc;", line = 267)
    public final class107 method928(int arg0, int arg1, int[] arg2) {
        if (arg1 != -1734) {
            return (class107) null;
        }
        field2075++;
        if (this.field2062.method2048(-23643) == 1) {
            return this.method926(0, arg1 + 6990, arg0, arg2);
        } else if (this.field2062.method2040(arg0, (byte) -97) == 1) {
            return this.method926(arg0, 5256, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI[I)Luc;", line = 298)
    public final class107 method929(boolean arg0, int arg1, int[] arg2) {
        if (arg0) {
            field2073 = (class59) null;
        }
        field2067++;
        if (this.field2069.method2048(-23643) == 1) {
            return this.method923(arg2, 0, arg1, (byte) 77);
        } else if (this.field2069.method2040(arg1, (byte) -97) == 1) {
            return this.method923(arg2, arg1, 0, (byte) 77);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)I", line = 317)
    public static final int method930(byte arg0) {
        field2072++;
        if (arg0 != -59) {
            field2071 = 82;
        }
        return 2;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lme;Lme;)V", line = 344)
    public class125(class295 arg0, class295 arg1) {
        this.field2069 = arg0;
        this.field2062 = arg1;
    }
}
