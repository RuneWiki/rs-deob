import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class200 extends class381 {

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "Z")
    public boolean field2853;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "[I")
    public static int[] field2849 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "[I")
    public static int[] field2855 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 3)
    public static void method1412(int arg0) {
        field2855 = null;
        field2849 = null;
        if (arg0 <= 34) {
            field2849 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lsb;BZ)V", line = 31)
    public static final void method1413(class362 arg0, byte arg1, boolean arg2) {
        field2850++;
        class434 var3 = arg0.method2280(113);
        if (arg0.field5009 == 0) {
            arg0.field5001 = 0;
            class269.field3616 = -1;
            class59.field932 = 0;
            return;
        }
        if (arg0.field4980 != -1 && arg0.field4934 == 0) {
            class209 var4 = class288.method1819(arg0.field4980, (byte) 105);
            if (arg0.field4999 > 0 && var4.field2912 == 0) {
                class59.field932 = 0;
                arg0.field5001++;
                class269.field3616 = -1;
                return;
            }
            if (arg0.field4999 <= 0 && var4.field2901 == 0) {
                arg0.field5001++;
                class269.field3616 = -1;
                class59.field932 = 0;
                return;
            }
        }
        if (arg0.field4974 != -1 && arg0.field4933 <= class414.field5793) {
            class282 var5 = class71.method613(arg0.field4974, (byte) -105);
            if (var5.field3768 && var5.field3765 != -1) {
                class209 var6 = class288.method1819(var5.field3765, (byte) 105);
                if (arg0.field4999 > 0 && var6.field2912 == 0) {
                    class269.field3616 = -1;
                    arg0.field5001++;
                    class59.field932 = 0;
                    return;
                }
                if (arg0.field4999 <= 0 && var6.field2901 == 0) {
                    class269.field3616 = -1;
                    class59.field932 = 0;
                    arg0.field5001++;
                    return;
                }
            }
        }
        int var7 = arg0.field3176;
        int var8 = arg0.field3167;
        int var9 = arg0.field5005[arg0.field5009 - 1] * 128 + arg0.method2146(-128) * 64;
        int var10 = arg0.field4998[arg0.field5009 - 1] * 128 + (arg0.method2146(115) * 64);
        if (!arg2 && (var9 - var7 > 256 || var9 - var7 < -256 || var10 - var8 > 256 || (var10 - var8) < -256)) {
            class59.field932 = 0;
            arg0.field3167 = var10;
            arg0.field3176 = var9;
            class269.field3616 = -1;
            return;
        }
        if (var9 <= var7) {
            if (var9 < var7) {
                if (var8 < var10) {
                    arg0.method2270(6953, 6144);
                } else if (var10 >= var8) {
                    arg0.method2270(6953, 4096);
                } else {
                    arg0.method2270(6953, 2048);
                }
            } else if (var8 < var10) {
                arg0.method2270(6953, 8192);
            } else if (var8 > var10) {
                arg0.method2270(6953, 0);
            }
        } else if (var8 < var10) {
            arg0.method2270(6953, 10240);
        } else if (var10 < var8) {
            arg0.method2270(6953, 14336);
        } else {
            arg0.method2270(6953, 12288);
        }
        int var11 = 4;
        boolean var12 = true;
        if (arg0 instanceof class127) {
            var12 = ((class127) arg0).field1784.field176;
        }
        if (var12) {
            int var13 = arg0.field4948 - arg0.field4977.field4361;
            if (var13 != 0 && arg0.field4988 == -1 && arg0.field4953 != 0) {
                var11 = 2;
            }
            if (!arg2 && arg0.field5009 > 2) {
                var11 = 6;
            }
            if (!arg2 && arg0.field5009 > 3) {
                var11 = 8;
            }
        } else {
            if (!arg2 && arg0.field5009 > 1) {
                var11 = 6;
            }
            if (!arg2 && arg0.field5009 > 2) {
                var11 = 8;
            }
        }
        if (arg0.field5001 > 0 && arg0.field5009 > 1) {
            arg0.field5001--;
            var11 = 8;
        }
        byte var14 = arg0.field5006[arg0.field5009 - 1];
        if (var14 == 2) {
            var11 <<= 0x1;
        } else if (var14 == 0) {
            var11 >>= 0x1;
        }
        if (arg1 >= -81) {
            method1413((class362) null, (byte) -14, false);
        }
        class59.field932 = 0;
        if (var3.field6158 != -1) {
            int var15 = var11 << 7;
            if (arg0.field5009 == 1) {
                int var16 = arg0.field5011 * arg0.field5011;
                int var17 = (arg0.field3176 <= var9 ? var9 - arg0.field3176 : -var9 + arg0.field3176) << 7;
                int var18 = (arg0.field3167 <= var10 ? var10 - arg0.field3167 : -var10 + arg0.field3167) << 7;
                int var19 = var17 > var18 ? var17 : var18;
                int var20 = var19 * 2 * var3.field6158;
                if (var16 > var20) {
                    arg0.field5011 /= 2;
                } else if (var19 < var16 / 2) {
                    arg0.field5011 -= var3.field6158;
                    if (arg0.field5011 < 0) {
                        arg0.field5011 = 0;
                    }
                } else if (var15 > arg0.field5011) {
                    arg0.field5011 += var3.field6158;
                    if (arg0.field5011 > var15) {
                        arg0.field5011 = var15;
                    }
                }
            } else if (var15 > arg0.field5011) {
                arg0.field5011 += var3.field6158;
                if (arg0.field5011 > var15) {
                    arg0.field5011 = var15;
                }
            } else if (arg0.field5011 > 0) {
                arg0.field5011 -= var3.field6158;
                if (arg0.field5011 < 0) {
                    arg0.field5011 = 0;
                }
            }
            var11 = arg0.field5011 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var7 < var9) {
            class59.field932 |= 0x4;
            arg0.field3176 += var11;
            if (arg0.field3176 > var9) {
                arg0.field3176 = var9;
            }
        } else if (var7 > var9) {
            class59.field932 |= 0x8;
            arg0.field3176 -= var11;
            if (arg0.field3176 < var9) {
                arg0.field3176 = var9;
            }
        }
        if (var8 < var10) {
            class59.field932 |= 0x1;
            arg0.field3167 += var11;
            if (var10 < arg0.field3167) {
                arg0.field3167 = var10;
            }
        } else if (var10 < var8) {
            arg0.field3167 -= var11;
            class59.field932 |= 0x2;
            if (arg0.field3167 < var10) {
                arg0.field3167 = var10;
            }
        }
        if (arg0.field3176 == var9 && arg0.field3167 == var10) {
            if (arg0.field4999 > 0) {
                arg0.field4999--;
            }
            arg0.field5009--;
        }
        if (var11 < 8) {
            class269.field3616 = var14;
        } else {
            class269.field3616 = 2;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(IIIIIZ)V", line = 337)
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2852 = arg4;
        this.field2856 = arg2;
        this.field2847 = arg1;
        this.field2853 = arg5;
        this.field2851 = arg0;
        this.field2854 = arg3;
    }
}
