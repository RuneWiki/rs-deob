import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class164 {

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    private int field2271 = 128;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    private int field2279 = 0;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    private int field2284 = 0;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    private int field2283 = 128;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
    private int field2286 = 0;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    private int field2282 = -1;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "Z")
    public boolean field2267 = false;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public int field2276 = -1;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "B")
    public byte field2269 = 0;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "[I")
    public static int[] field2280 = new int[50];

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "I")
    private int field2287;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "I")
    public int field2293;

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "Loq;")
    public class362 field2273;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "Lda;")
    public static class61 field2272;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "[J")
    public static long[] field2270;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "[S")
    private short[] field2266;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "[S")
    private short[] field2268;

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "[S")
    private short[] field2289;

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "[S")
    private short[] field2290;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)Z")
    public static final boolean method1143(int arg0, int arg1, int arg2) {
        field2285++;
        if (class66.method617(arg2, arg0, (byte) 56)) {
            return ~(arg0 & 0x9000) != arg1 | class667.method3751(-1, arg2, arg0) | class22.method141(arg0, arg2, (byte) -28) ? true : ((arg0 & 0x2000) != 0 | class745.method4142(arg2, arg0, (byte) 102) | class751.method4180(arg2, -45, arg0)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BIILru;IILha;)Lka;")
    public final class474 method1144(byte arg0, int arg1, int arg2, class195 arg3, int arg4, int arg5, class60 arg6) {
        if (arg0 != 5) {
            this.field2283 = -18;
        }
        field2288++;
        return this.method1147(arg4, (byte) 5, null, arg1, 0, arg2, false, 0, null, arg5, arg3, arg6, 0, (byte) 73);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIILha;Lru;I)Lka;")
    public final class474 method1145(int arg0, int arg1, int arg2, int arg3, class60 arg4, class195 arg5, int arg6) {
        field2278++;
        return arg1 == -8013 ? this.method1147(arg6, (byte) 2, null, arg3, 0, arg0, false, 0, null, arg2, arg5, arg4, 0, (byte) 93) : null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Z")
    public static final boolean method1146(int arg0) {
        if (arg0 >= -83) {
            return true;
        } else {
            field2291++;
            return class159.field2181 > 0;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBLs;IIIZILs;ILru;Lha;IB)Lka;")
    private final class474 method1147(int arg0, byte arg1, class282 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class282 arg8, int arg9, class195 arg10, class60 arg11, int arg12, byte arg13) {
        field2294++;
        int var15 = arg9;
        class56 var16 = this.field2276 == -1 || arg5 == -1 ? null : arg10.method1299((byte) -116, this.field2276);
        boolean var17 = arg6 & this.field2269 != 0;
        if (var16 != null) {
            var15 = arg9 | var16.method416(arg5, arg0, (byte) -90, false);
        }
        if (var17) {
            var15 |= this.field2269 == 3 ? 7 : 2;
        }
        if (this.field2271 != 128) {
            var15 |= 0x2;
        }
        if (this.field2283 != 128 || this.field2286 != 0) {
            var15 |= 0x5;
        }
        class534 var18 = this.field2273.field4677;
        class474 var19;
        synchronized (this.field2273.field4677) {
            var19 = (class474) this.field2273.field4677.method3079((long) (this.field2293 |= arg11.field831 << 29), 0);
        }
        if (var19 == null || arg11.method542(var19.method272(), var15) != 0) {
            if (var19 != null) {
                var15 = arg11.method484(var15, var19.method272());
            }
            int var20 = var15;
            if (this.field2290 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field2289 != null) {
                var20 |= 0x8000;
            }
            class714 var21 = class637.method3572(this.field2273.field4672, this.field2287, 4, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field9927 < 13) {
                var21.method3989(2, -110);
            }
            var19 = arg11.method540(var21, var20, this.field2273.field4679, this.field2279 + 64, this.field2284 + 850);
            if (this.field2290 != null) {
                for (int var22 = 0; var22 < this.field2290.length; var22++) {
                    var19.method251(this.field2290[var22], this.field2268[var22]);
                }
            }
            if (this.field2289 != null) {
                for (int var23 = 0; var23 < this.field2289.length; var23++) {
                    var19.method293(this.field2289[var23], this.field2266[var23]);
                }
            }
            var19.method266(var15);
            class534 var24 = this.field2273.field4677;
            synchronized (this.field2273.field4677) {
                this.field2273.field4677.method3077((byte) -109, (long) (this.field2293 |= arg11.field831 << 29), var19);
            }
        }
        class474 var25 = var16 == null ? var19.method273(arg1, var15, true) : var16.method413(arg0, var19, arg1, arg5, var15, arg3, 0, (byte) 103);
        if (this.field2283 != 128 || this.field2271 != 128) {
            var25.method259(this.field2283, this.field2271, this.field2283);
        }
        if (this.field2286 != 0) {
            if (this.field2286 == 90) {
                var25.method270(4096);
            }
            if (this.field2286 == 180) {
                var25.method270(8192);
            }
            if (this.field2286 == 270) {
                var25.method270(12288);
            }
        }
        if (var17) {
            var25.method277(this.field2269, this.field2282, arg8, arg2, arg12, arg4, arg7);
        }
        var25.method266(arg9);
        if (arg13 <= 71) {
            this.field2266 = null;
        }
        return var25;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lsl;I)V")
    public final void method1148(class461 arg0, int arg1) {
        field2292++;
        if (arg1 != 0) {
            field2275 = 47;
        }
        while (true) {
            int var3 = arg0.method2600((byte) -124);
            if (var3 == 0) {
                return;
            }
            this.method1149(var3, 18008, arg0);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IILsl;)V")
    private final void method1149(int arg0, int arg1, class461 arg2) {
        field2281++;
        if (arg0 == 1) {
            this.field2287 = arg2.method2566(-2);
        } else if (arg0 == 2) {
            this.field2276 = arg2.method2566(-2);
        } else if (arg0 == 4) {
            this.field2283 = arg2.method2566(-2);
        } else if (arg0 == 5) {
            this.field2271 = arg2.method2566(-2);
        } else if (arg0 == 6) {
            this.field2286 = arg2.method2566(-2);
        } else if (arg0 == 7) {
            this.field2279 = arg2.method2600((byte) -124);
        } else if (arg0 == 8) {
            this.field2284 = arg2.method2600((byte) -128);
        } else if (arg0 == 9) {
            this.field2269 = 3;
            this.field2282 = 8224;
        } else if (arg0 == 10) {
            this.field2267 = true;
        } else if (arg0 == 11) {
            this.field2269 = 1;
        } else if (arg0 == 12) {
            this.field2269 = 4;
        } else if (arg0 == 13) {
            this.field2269 = 5;
        } else if (arg0 == 14) {
            this.field2269 = 2;
            this.field2282 = arg2.method2600((byte) -126) * 256;
        } else if (arg0 == 15) {
            this.field2269 = 3;
            this.field2282 = arg2.method2566(-2);
        } else if (arg0 == 16) {
            this.field2269 = 3;
            this.field2282 = arg2.method2622(-539564808);
        } else if (arg0 == 40) {
            int var4 = arg2.method2600((byte) -127);
            this.field2268 = new short[var4];
            this.field2290 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2290[var5] = (short) arg2.method2566(-2);
                this.field2268[var5] = (short) arg2.method2566(-2);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method2600((byte) -125);
            this.field2289 = new short[var6];
            this.field2266 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2289[var7] = (short) arg2.method2566(arg1 - 18010);
                this.field2266[var7] = (short) arg2.method2566(-2);
            }
        }
        if (arg1 != 18008) {
            this.field2290 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IILs;BIILru;IILs;IZLha;)Lka;")
    public final class474 method1150(int arg0, int arg1, class282 arg2, byte arg3, int arg4, int arg5, class195 arg6, int arg7, int arg8, class282 arg9, int arg10, boolean arg11, class60 arg12) {
        field2277++;
        if (arg3 != 2) {
            this.method1149(-126, -81, null);
        }
        return this.method1147(arg10, (byte) 2, arg9, arg5, arg0, arg7, arg11, arg8, arg2, arg4, arg6, arg12, arg1, (byte) 91);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
    public static void method1151(boolean arg0) {
        field2272 = null;
        field2280 = null;
        if (arg0) {
            field2270 = null;
        }
    }
}
