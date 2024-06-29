import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class157 {

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "Z")
    public boolean field2280 = false;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    private int field2283 = 0;

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
    public int field2290 = -1;

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
    private int field2286 = -1;

    @OriginalMember(owner = "client!hga", name = "r", descriptor = "I")
    private int field2292 = 128;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    private int field2278 = 128;

    @OriginalMember(owner = "client!hga", name = "s", descriptor = "I")
    private int field2293 = 0;

    @OriginalMember(owner = "client!hga", name = "u", descriptor = "B")
    public byte field2295 = 0;

    @OriginalMember(owner = "client!hga", name = "v", descriptor = "I")
    private int field2296 = 0;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2277 = 503;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "I")
    private int field2288;

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!hga", name = "w", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "Lom;")
    public class341 field2281;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "[S")
    private short[] field2279;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "[S")
    private short[] field2287;

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "[S")
    private short[] field2291;

    @OriginalMember(owner = "client!hga", name = "t", descriptor = "[S")
    private short[] field2294;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILnu;ILr;IZI)Lda;")
    public final class55 method1110(int arg0, class549 arg1, int arg2, class166 arg3, int arg4, boolean arg5, int arg6) {
        field2276++;
        if (arg5) {
            this.field2294 = null;
        }
        return this.method1112(arg6, null, arg4, arg1, arg0, 126, 0, (byte) 2, null, 0, arg3, arg2, 0, false);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILac;)V")
    public final void method1111(int arg0, class501 arg1) {
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.method1111(19, null);
                }
                field2285++;
                return;
            }
            this.method1114(753287421, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILi;ILnu;IIIBLi;ILr;IIZ)Lda;")
    private final class55 method1112(int arg0, class37 arg1, int arg2, class549 arg3, int arg4, int arg5, int arg6, byte arg7, class37 arg8, int arg9, class166 arg10, int arg11, int arg12, boolean arg13) {
        field2282++;
        int var15 = arg0;
        class403 var16 = this.field2290 == -1 || arg11 == -1 ? null : arg3.method3090(87, this.field2290);
        boolean var17 = arg13 & this.field2295 != 0;
        int var18 = 86 / ((4 - arg5) / 56);
        if (var16 != null) {
            var15 = arg0 | var16.method2353(arg11, arg2, false, 42);
        }
        if (var17) {
            var15 |= this.field2295 == 3 ? 7 : 2;
        }
        if (this.field2292 != 128) {
            var15 |= 0x2;
        }
        if (this.field2278 != 128 || this.field2283 != 0) {
            var15 |= 0x5;
        }
        class663 var19 = this.field2281.field4580;
        class55 var20;
        synchronized (this.field2281.field4580) {
            var20 = (class55) this.field2281.field4580.method3747((byte) -66, (long) (this.field2284 |= arg10.field2427 << 29));
        }
        if (var20 == null || arg10.method134(var20.method422(), var15) != 0) {
            if (var20 != null) {
                var15 = arg10.method114(var15, var20.method422());
            }
            int var21 = var15;
            if (this.field2291 != null) {
                var21 = var15 | 0x4000;
            }
            if (this.field2279 != null) {
                var21 |= 0x8000;
            }
            class270 var22 = class29.method282(0, (byte) 125, this.field2288, this.field2281.field4571);
            if (var22 == null) {
                return null;
            }
            if (var22.field3661 < 13) {
                var22.method1639((byte) -17, 2);
            }
            var20 = arg10.method106(var22, var21, this.field2281.field4582, this.field2293 + 64, this.field2296 + 850);
            if (this.field2291 != null) {
                for (int var23 = 0; var23 < this.field2291.length; var23++) {
                    var20.method439(this.field2291[var23], this.field2287[var23]);
                }
            }
            if (this.field2279 != null) {
                for (int var24 = 0; var24 < this.field2279.length; var24++) {
                    var20.method443(this.field2279[var24], this.field2294[var24]);
                }
            }
            var20.method452(var15);
            class663 var25 = this.field2281.field4580;
            synchronized (this.field2281.field4580) {
                this.field2281.field4580.method3748((long) (this.field2284 |= arg10.field2427 << 29), var20, 12537);
            }
        }
        class55 var26 = var16 == null ? var20.method462(arg7, var15, true) : var16.method2356(arg7, arg11, arg2, var15, var20, 0, arg4, (byte) -124);
        if (this.field2278 != 128 || this.field2292 != 128) {
            var26.method425(this.field2278, this.field2292, this.field2278);
        }
        if (this.field2283 != 0) {
            if (this.field2283 == 90) {
                var26.method444(4096);
            }
            if (this.field2283 == 180) {
                var26.method444(8192);
            }
            if (this.field2283 == 270) {
                var26.method444(12288);
            }
        }
        if (var17) {
            var26.method435(this.field2295, this.field2286, arg1, arg8, arg6, arg9, arg12);
        }
        var26.method452(arg0);
        return var26;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lnu;ILr;IIII)Lda;")
    public final class55 method1113(class549 arg0, int arg1, class166 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 < 102) {
            this.method1113(null, 37, null, -27, 55, 97, -90);
        }
        field2297++;
        return this.method1112(arg5, null, arg4, arg0, arg3, 75, 0, (byte) 5, null, 0, arg2, arg1, 0, false);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IILac;)V")
    private final void method1114(int arg0, int arg1, class501 arg2) {
        if (arg1 == 1) {
            this.field2288 = arg2.method2845(-1);
        } else if (arg1 == 2) {
            this.field2290 = arg2.method2845(arg0 ^ 0xD319BF02);
        } else if (arg1 == 4) {
            this.field2278 = arg2.method2845(-1);
        } else if (arg1 == 5) {
            this.field2292 = arg2.method2845(-1);
        } else if (arg1 == 6) {
            this.field2283 = arg2.method2845(arg0 - 753287422);
        } else if (arg1 == 7) {
            this.field2293 = arg2.method2874((byte) -75);
        } else if (arg1 == 8) {
            this.field2296 = arg2.method2874((byte) -75);
        } else if (arg1 == 9) {
            this.field2286 = 8224;
            this.field2295 = 3;
        } else if (arg1 == 10) {
            this.field2280 = true;
        } else if (arg1 == 11) {
            this.field2295 = 1;
        } else if (arg1 == 12) {
            this.field2295 = 4;
        } else if (arg1 == 13) {
            this.field2295 = 5;
        } else if (arg1 == 14) {
            this.field2295 = 2;
            this.field2286 = arg2.method2874((byte) -75) * 256;
        } else if (arg1 == 15) {
            this.field2295 = 3;
            this.field2286 = arg2.method2845(-1);
        } else if (arg1 == 16) {
            this.field2295 = 3;
            this.field2286 = arg2.method2840(false);
        } else if (arg1 == 40) {
            int var6 = arg2.method2874((byte) -75);
            this.field2287 = new short[var6];
            this.field2291 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2291[var7] = (short) arg2.method2845(arg0 - 753287422);
                this.field2287[var7] = (short) arg2.method2845(-1);
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method2874((byte) -75);
            this.field2279 = new short[var4];
            this.field2294 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2279[var5] = (short) arg2.method2845(-1);
                this.field2294[var5] = (short) arg2.method2845(-1);
            }
        }
        field2275++;
        if (arg0 != 753287421) {
            this.field2283 = 0;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Li;IIIILi;IZLr;Lnu;IBI)Lda;")
    public final class55 method1115(class37 arg0, int arg1, int arg2, int arg3, int arg4, class37 arg5, int arg6, boolean arg7, class166 arg8, class549 arg9, int arg10, byte arg11, int arg12) {
        field2289++;
        if (arg11 != 2) {
            this.field2294 = null;
        }
        return this.method1112(arg6, arg5, arg2, arg9, arg3, 60, arg4, (byte) 2, arg0, arg1, arg8, arg10, arg12, arg7);
    }
}
