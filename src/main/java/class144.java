import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class144 extends class154 {

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
    private int field2446 = 0;

    @OriginalMember(owner = "client!uj", name = "lb", descriptor = "I")
    private int field2455 = 0;

    @OriginalMember(owner = "client!uj", name = "wb", descriptor = "I")
    private int field2466 = 0;

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "Lbf;")
    public static class202 field2448 = new class202(50);

    @OriginalMember(owner = "client!uj", name = "xb", descriptor = "Z")
    public static boolean field2467 = true;

    @OriginalMember(owner = "client!uj", name = "rb", descriptor = "Leg;")
    private static class37 field2461 = class174.method1167("skill: ", 114);

    @OriginalMember(owner = "client!uj", name = "ub", descriptor = "Leg;")
    public static class37 field2464 = field2461;

    @OriginalMember(owner = "client!uj", name = "yb", descriptor = "Leg;")
    public static class37 field2468 = class174.method1167("M", 125);

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    private int field2444;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
    private int field2447;

    @OriginalMember(owner = "client!uj", name = "fb", descriptor = "I")
    private int field2449;

    @OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!uj", name = "hb", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!uj", name = "ib", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!uj", name = "jb", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!uj", name = "kb", descriptor = "I")
    private int field2454;

    @OriginalMember(owner = "client!uj", name = "mb", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!uj", name = "nb", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!uj", name = "ob", descriptor = "I")
    private int field2458;

    @OriginalMember(owner = "client!uj", name = "pb", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!uj", name = "qb", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!uj", name = "tb", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!uj", name = "vb", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!uj", name = "sb", descriptor = "Leg;")
    public static class37 field2462;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZILjl;Ljl;)V")
    public static final void method1002(boolean arg0, int arg1, class101 arg2, class101 arg3) {
        class49.field770 = arg0;
        ++field2460;
        class197.field3357 = arg2;
        if (arg1 == 12285) {
            class68.field1076 = arg3;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V")
    private final void method1003(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 24608) {
            this.field2449 = -18;
        }
        ++field2445;
        int var5 = ~arg2 >= -2049 ? (arg0 + 4096) * arg2 >> 12 : -(arg0 * arg2 >> 12) + arg2 - -arg0;
        if (var5 > 0) {
            int var6 = arg1 * 6;
            int var7 = arg2 + arg2 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var11 = var8 * var5 >> 12;
            int var12 = var6 - (var9 << 12);
            int var13 = var11 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (~var9 == -1) {
                this.field2459 = var14;
                this.field2449 = var7;
                this.field2444 = var5;
                return;
            }
            if (~var9 == -2) {
                this.field2444 = var15;
                this.field2459 = var5;
                this.field2449 = var7;
                return;
            }
            if (~var9 == -3) {
                this.field2444 = var7;
                this.field2459 = var5;
                this.field2449 = var14;
                return;
            }
            if (~var9 == -4) {
                this.field2449 = var5;
                this.field2444 = var7;
                this.field2459 = var15;
                return;
            }
            if (~var9 == -5) {
                this.field2444 = var14;
                this.field2459 = var7;
                this.field2449 = var5;
                return;
            }
            if (var9 == 5) {
                this.field2444 = var5;
                this.field2459 = var7;
                this.field2449 = var15;
                return;
            }
        } else {
            this.field2444 = this.field2459 = this.field2449 = arg2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 != -14015) {
            method1009(true, (class37) null, true);
        }
        ++field2453;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field2455 = (arg0.method1269(255) << 12) / 100;
                }
            } else {
                this.field2466 = (arg0.method1269(255) << 12) / 100;
            }
        } else {
            this.field2446 = arg0.method1276((byte) -104);
        }
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
    public static void method1004(int arg0) {
        field2468 = null;
        int var1 = -18 / ((-8 - arg0) / 56);
        field2464 = null;
        field2462 = null;
        field2448 = null;
        field2461 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        if (arg0 != 115) {
            method1006(-22, 51, (class37[]) null, (byte) -74);
        }
        ++field2443;
        int[][] var3 = super.field2585.method1532(arg1, -90);
        if (super.field2585.field3761) {
            int[][] var4 = this.method1054(0, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class227.field3898; ++var11) {
                this.method1007(var5[var11], 122, var6[var11], var7[var11]);
                this.field2458 += this.field2466;
                if (this.field2458 < 0) {
                    this.field2458 = 0;
                }
                this.field2454 += this.field2455;
                if (this.field2458 > 4096) {
                    this.field2458 = 4096;
                }
                if (~this.field2454 > -1) {
                    this.field2454 = 0;
                }
                for (this.field2447 += this.field2446; this.field2447 < 0; this.field2447 += 4096) {
                }
                if (this.field2454 > 4096) {
                    this.field2454 = 4096;
                }
                while (~this.field2447 < -4097) {
                    this.field2447 -= 4096;
                }
                this.method1003(this.field2458, this.field2447, this.field2454, arg0 + 24493);
                var8[var11] = this.field2444;
                var9[var11] = this.field2459;
                var10[var11] = this.field2449;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
    public static final void method1005(boolean arg0) {
        ++field2441;
        class187.field3184.method1409(83);
        if (arg0) {
            field2467 = false;
        }
        class273.field4790.method1409(81);
        class160.field2669.method1409(115);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class144() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[Leg;B)Leg;")
    public static final class37 method1006(int arg0, int arg1, class37[] arg2, byte arg3) {
        int var4 = 0;
        for (int var5 = 0; arg0 > var5; ++var5) {
            if (arg2[arg1 - -var5] == null) {
                arg2[arg1 + var5] = class96.field1498;
            }
            var4 += arg2[arg1 + var5].field576;
        }
        ++field2442;
        byte[] var6 = new byte[var4];
        int var7 = 0;
        int var8 = 0;
        if (arg3 != -6) {
            method1006(120, -21, (class37[]) null, (byte) -103);
        }
        while (~var8 > ~arg0) {
            class37 var10 = arg2[arg1 + var8];
            class54.method355(var10.field599, 0, var6, var7, var10.field576);
            var7 += var10.field576;
            ++var8;
        }
        class37 var9 = new class37();
        var9.field599 = var6;
        var9.field576 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIII)V")
    private final void method1007(int arg0, int arg1, int arg2, int arg3) {
        ++field2452;
        int var5 = arg2 <= arg0 ? arg0 : arg2;
        int var6 = var5 < arg3 ? arg3 : var5;
        int var7 = arg0 <= arg2 ? arg0 : arg2;
        int var8 = ~var7 < ~arg3 ? arg3 : var7;
        if (arg1 <= 121) {
            method1004(49);
        }
        this.field2454 = (var8 - -var6) / 2;
        int var9 = -var8 + var6;
        if (~var9 >= -1) {
            this.field2447 = 0;
        } else {
            int var10 = (-arg2 + var6 << 12) / var9;
            int var11 = (var6 - arg3 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (~arg2 != ~var6) {
                if (~arg0 != ~var6) {
                    this.field2447 = ~arg2 != ~var8 ? -var10 + 20480 : var12 + 12288;
                } else {
                    this.field2447 = arg3 == var8 ? var10 + 4096 : -var11 + 12288;
                }
            } else {
                this.field2447 = arg0 == var8 ? var11 + 20480 : -var12 + 4096;
            }
            this.field2447 /= 6;
        }
        if (~this.field2454 < -1 && this.field2454 < 4096) {
            this.field2458 = (var9 << 12) / (this.field2454 > 2048 ? -(this.field2454 * 2) + 8192 : this.field2454 * 2);
        } else {
            this.field2458 = 0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)V")
    public static final void method1008(int arg0, long arg1) {
        if (arg0 < 74) {
            field2463 = -39;
        }
        ++field2465;
        if (arg1 > 0L) {
            if (~(arg1 % 10L) == -1L) {
                class133.method958(arg1 + -1L, -1);
                class133.method958(1L, -1);
            } else {
                class133.method958(arg1, -1);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLeg;Z)V")
    public static final void method1009(boolean arg0, class37 arg1, boolean arg2) {
        class37 var3 = arg1.method251((byte) -88);
        ++field2457;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class172.field2885 : class242.field4358);
        int var8 = var6;
        if (!arg2) {
            while (~var7 < ~var8) {
                class30 var11 = class1.method2(var8, (byte) 96);
                if (var11.field434 && var11.method179((byte) -96).method251((byte) -30).method220(var3, (byte) 118) != -1) {
                    if (var5 >= 50) {
                        class73.field1157 = null;
                        class288.field5069 = -1;
                        return;
                    }
                    if (var4.length <= var5) {
                        short[] var12 = new short[var4.length * 2];
                        for (int var13 = 0; ~var5 < ~var13; ++var13) {
                            var12[var13] = var4[var13];
                        }
                        var4 = var12;
                    }
                    var4[var5++] = (short) var8;
                }
                ++var8;
            }
            class288.field5069 = var5;
            class73.field1157 = var4;
            class37[] var9 = new class37[class288.field5069];
            class127.field2128 = 0;
            for (int var10 = 0; var10 < class288.field5069; ++var10) {
                var9[var10] = class1.method2(var4[var10], (byte) -97).method179((byte) -96);
            }
            class102.method684(6388, var9, class73.field1157);
        }
    }
}
