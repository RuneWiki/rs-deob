import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class155 {

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    private int field2258 = 0;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    private int field2260 = 128;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    private int field2250 = -1;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Z")
    public boolean field2264 = false;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    private int field2269 = 128;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    private int field2272 = 0;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    private int field2273 = 0;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public int field2271 = -1;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "B")
    public byte field2270 = 0;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lra;")
    public static class70 field2251 = new class70(0, 2, 2, 1);

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Lrb;")
    public static class234 field2265 = null;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "F")
    public static float field2275;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    private int field2255;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Las;")
    public class104 field2261;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Lm;")
    public static class126 field2276;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "[S")
    private short[] field2257;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "[S")
    private short[] field2259;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "[S")
    private short[] field2263;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "[S")
    private short[] field2268;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lqa;IIIILpp;I)Lc;", line = 11)
    public final class121 method1063(class162 arg0, int arg1, int arg2, int arg3, int arg4, class267 arg5, int arg6) {
        field2254++;
        int var8 = 85 / ((arg2 + 10) / 55);
        return this.method1065(0, (byte) 5, arg5, 16384, arg4, null, arg0, false, 0, arg1, arg3, null, arg6, 0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lmd;B)V", line = 24)
    public final void method1064(class379 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2238(255);
            if (var3 == 0) {
                if (arg1 > -25) {
                    method1067(-117);
                }
                field2249++;
                return;
            }
            this.method1069(arg0, var3, 13808);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBLpp;IILna;Lqa;ZIIILna;II)Lc;", line = 46)
    private final class121 method1065(int arg0, byte arg1, class267 arg2, int arg3, int arg4, class35 arg5, class162 arg6, boolean arg7, int arg8, int arg9, int arg10, class35 arg11, int arg12, int arg13) {
        field2262++;
        int var15 = arg9;
        class5 var16 = this.field2271 == -1 || arg10 == -1 ? null : arg2.method1601(this.field2271, (byte) -127);
        boolean var17 = arg7 & this.field2270 != 0;
        if (var16 != null) {
            var15 = arg9 | var16.method32(arg10, false, -1, arg4);
        }
        if (arg3 != 16384) {
            return null;
        }
        if (var17) {
            var15 |= this.field2270 == 3 ? 7 : 2;
        }
        if (this.field2269 != 128) {
            var15 |= 0x2;
        }
        if (this.field2260 != 128 || this.field2258 != 0) {
            var15 |= 0x5;
        }
        class236 var18 = this.field2261.field1533;
        class121 var19;
        synchronized (this.field2261.field1533) {
            var19 = (class121) this.field2261.field1533.method1456((long) (this.field2252 |= arg6.field2378 << 29), arg3 ^ 0x407C);
        }
        if (var19 == null || arg6.method564(var19.method854(), var15) != 0) {
            if (var19 != null) {
                var15 = arg6.method565(var15, var19.method854());
            }
            int var20 = var15;
            if (this.field2259 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field2257 != null) {
                var20 |= 0x8000;
            }
            class118 var21 = class116.method798(this.field2261.field1532, 0, this.field2255, (byte) -77);
            if (var21 == null) {
                return null;
            }
            if (var21.field1734 < 13) {
                var21.method824(arg3 ^ 0xFFFFD1A0, 0);
            }
            var19 = arg6.method531(var21, var20, this.field2261.field1534, this.field2272 + 64, this.field2273 + 850);
            if (this.field2259 != null) {
                for (int var22 = 0; var22 < this.field2259.length; var22++) {
                    var19.method865(this.field2259[var22], this.field2268[var22]);
                }
            }
            if (this.field2257 != null) {
                for (int var23 = 0; var23 < this.field2257.length; var23++) {
                    var19.method872(this.field2257[var23], this.field2263[var23]);
                }
            }
            var19.method860(var15);
            class236 var24 = this.field2261.field1533;
            synchronized (this.field2261.field1533) {
                this.field2261.field1533.method1462(var19, (long) (this.field2252 |= arg6.field2378 << 29), -56);
            }
        }
        class121 var25 = var16 == null ? var19.method863(arg1, var15, true) : var16.method30(arg1, var19, var15, (byte) 89, arg10, arg12, arg4, 0);
        if (this.field2260 != 128 || this.field2269 != 128) {
            var25.method882(this.field2260, this.field2269, this.field2260);
        }
        if (this.field2258 != 0) {
            if (this.field2258 == 90) {
                var25.method838(4096);
            }
            if (this.field2258 == 180) {
                var25.method838(8192);
            }
            if (this.field2258 == 270) {
                var25.method838(12288);
            }
        }
        if (var17) {
            var25.method839(this.field2270, this.field2250, arg5, arg11, arg13, arg8, arg0);
        }
        var25.method860(arg9);
        return var25;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZILna;IILqa;IILpp;Lna;II)Lc;", line = 165)
    public final class121 method1066(int arg0, boolean arg1, int arg2, class35 arg3, int arg4, int arg5, class162 arg6, int arg7, int arg8, class267 arg9, class35 arg10, int arg11, int arg12) {
        if (arg2 == -129) {
            field2267++;
            return this.method1065(arg7, (byte) 2, arg9, 16384, arg11, arg10, arg6, arg1, arg4, arg8, arg5, arg3, arg0, arg12);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 186)
    public static final void method1067(int arg0) {
        class112.field1609.method1458((byte) -62);
        if (arg0 != 22966) {
            field2251 = null;
        }
        field2274++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 205)
    public static void method1068(byte arg0) {
        field2251 = null;
        field2276 = null;
        field2265 = null;
        if (arg0 != -9) {
            method1068((byte) 31);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lmd;II)V", line = 221)
    private final void method1069(class379 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2255 = arg0.method2212((byte) 83);
        } else if (arg1 == 2) {
            this.field2271 = arg0.method2212((byte) 83);
        } else if (arg1 == 4) {
            this.field2260 = arg0.method2212((byte) 83);
        } else if (arg1 == 5) {
            this.field2269 = arg0.method2212((byte) 83);
        } else if (arg1 == 6) {
            this.field2258 = arg0.method2212((byte) 83);
        } else if (arg1 == 7) {
            this.field2272 = arg0.method2238(255);
        } else if (arg1 == 8) {
            this.field2273 = arg0.method2238(255);
        } else if (arg1 == 9) {
            this.field2250 = 8224;
            this.field2270 = 3;
        } else if (arg1 == 10) {
            this.field2264 = true;
        } else if (arg1 == 11) {
            this.field2270 = 1;
        } else if (arg1 == 12) {
            this.field2270 = 4;
        } else if (arg1 == 13) {
            this.field2270 = 5;
        } else if (arg1 == 14) {
            this.field2270 = 2;
            this.field2250 = arg0.method2238(255) * 256;
        } else if (arg1 == 15) {
            this.field2270 = 3;
            this.field2250 = arg0.method2212((byte) 83);
        } else if (arg1 == 16) {
            this.field2270 = 3;
            this.field2250 = arg0.method2232((byte) 124);
        } else if (arg1 == 40) {
            int var4 = arg0.method2238(255);
            this.field2259 = new short[var4];
            this.field2268 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2259[var5] = (short) arg0.method2212((byte) 83);
                this.field2268[var5] = (short) arg0.method2212((byte) 83);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method2238(255);
            this.field2257 = new short[var6];
            this.field2263 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2257[var7] = (short) arg0.method2212((byte) 83);
                this.field2263[var7] = (short) arg0.method2212((byte) 83);
            }
        }
        field2253++;
        if (arg2 != 13808) {
            this.method1070(null, -96, 76, -122, -86, null, 86);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Lqa;IIIILpp;I)Lc;", line = 346)
    public final class121 method1070(class162 arg0, int arg1, int arg2, int arg3, int arg4, class267 arg5, int arg6) {
        if (arg2 != -1) {
            field2266 = 17;
        }
        field2256++;
        return this.method1065(0, (byte) 2, arg5, 16384, arg1, null, arg0, false, 0, arg3, arg6, null, arg4, 0);
    }
}
