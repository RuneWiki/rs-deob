import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class145 {

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    private int field2490 = 0;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    private int field2487 = 128;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    private int field2489 = 0;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Z")
    public boolean field2499 = false;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public int field2501 = -1;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    private int field2497 = 128;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    private int field2495 = 0;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Lbc;")
    public static class201 field2503 = new class201(16);

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field2508 = 0;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public int field2488;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    private int field2498;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "[S")
    private short[] field2500;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "[S")
    private short[] field2502;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "[S")
    private short[] field2505;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "[S")
    private short[] field2507;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static final void method910(byte arg0) {
        field2496++;
        while (class32.field512.method665(class179.field3073, 7) >= 27) {
            int var1 = class32.field512.method660(15, true);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class220.field3715[var1] == null) {
                class220.field3715[var1] = new class195();
                var2 = true;
            }
            class195 var3 = class220.field3715[var1];
            class146.field2517[class71.field1254++] = var1;
            var3.field73 = class253.field4393;
            int var4 = class133.field2308[class32.field512.method660(3, true)];
            if (var2) {
                var3.field94 = var3.field106 = var4;
            }
            var3.field3315 = class59.method362(-32544, class32.field512.method660(14, true));
            int var5 = class32.field512.method660(1, true);
            if (var5 == 1) {
                class131.field2293[class147.field2572++] = var1;
            }
            int var6 = class32.field512.method660(1, true);
            int var7 = class32.field512.method660(5, true);
            int var8 = class32.field512.method660(5, true);
            var3.field67 = var3.field3315.field2540;
            var3.field105 = var3.field3315.field2577;
            var3.field64 = var3.field3315.field2547;
            var3.field81 = var3.field3315.field2531;
            var3.field45 = var3.field3315.field2542;
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.field63 = var3.field3315.field2523;
            var3.field100 = var3.field3315.field2557;
            var3.field55 = var3.field3315.field2561;
            if (var3.field81 == 0) {
                var3.field106 = 0;
            }
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field61 = var3.field3315.field2567;
            var3.method18(class216.field3639.field49[0] + var8, class216.field3639.field78[0] - -var7, var6 == 1, 96);
            if (var3.field3315.method930((byte) 99)) {
                class187.method1188(var3, var3.field78[0], 3319, (class225) null, var3.field49[0], 0, class64.field1171, (class45) null);
            }
        }
        class32.field512.method662(-117);
        if (arg0 != -4) {
            method917(-79);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public static final int method911(int arg0, int arg1) {
        if (arg0 == 0) {
            field2509++;
            return arg1 & 0x7F;
        } else {
            return 109;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLnj;)V")
    public final void method912(byte arg0, class226 arg1) {
        while (true) {
            int var3 = arg1.method1471(arg0 + 235);
            if (var3 == 0) {
                field2486++;
                if (arg0 != 20) {
                    this.field2507 = null;
                    return;
                }
                return;
            }
            this.method916(var3, (byte) 67, arg1);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lhe;)V")
    public static final void method913(class230 arg0) {
        for (int var1 = arg0.field4032; var1 <= arg0.field4020; var1++) {
            for (int var2 = arg0.field4025; var2 <= arg0.field4015; var2++) {
                class108 var3 = class261.field4539[arg0.field4022][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2012; var4++) {
                        if (var3.field2021[var4] == arg0) {
                            var3.field2012--;
                            for (int var5 = var4; var5 < var3.field2012; var5++) {
                                var3.field2021[var5] = var3.field2021[var5 + 1];
                                var3.field2017[var5] = var3.field2017[var5 + 1];
                            }
                            var3.field2021[var3.field2012] = null;
                            break;
                        }
                    }
                    var3.field2014 = 0;
                    for (int var6 = 0; var6 < var3.field2012; var6++) {
                        var3.field2014 |= var3.field2017[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)Lbf;")
    public final class48 method914(int arg0, int arg1) {
        field2494++;
        class48 var3 = (class48) class96.field1681.method1735((long) this.field2488, (byte) -69);
        if (var3 == null) {
            class93 var4 = class93.method572(class161.field2708, this.field2498, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2505 != null) {
                for (int var5 = 0; var5 < this.field2505.length; var5++) {
                    var4.method553(this.field2505[var5], this.field2507[var5]);
                }
            }
            if (this.field2502 != null) {
                for (int var6 = 0; var6 < this.field2502.length; var6++) {
                    var4.method549(this.field2502[var6], this.field2500[var6]);
                }
            }
            var3 = var4.method560(this.field2495 + 64, this.field2490 + 850, -30, -50, -30);
            class96.field1681.method1730(var3, (long) this.field2488, (byte) 58);
        }
        class48 var7;
        if (this.field2501 == -1 || arg1 == -1) {
            var7 = var3.method273(true, true);
        } else {
            var7 = class25.method127(true, this.field2501).method299(var3, arg1, 104);
        }
        if (this.field2497 != arg0 || this.field2487 != 128) {
            var7.method286(this.field2497, this.field2487, this.field2497);
        }
        if (this.field2489 != 0) {
            if (this.field2489 == 90) {
                var7.method267();
            }
            if (this.field2489 == 180) {
                var7.method280();
            }
            if (this.field2489 == 270) {
                var7.method285();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Lgb;")
    public static final class46 method915(int arg0) {
        if (arg0 != 28277) {
            method917(84);
        }
        field2492++;
        class209 var1 = new class209(class161.field2727, class241.field4197, class58.field1068[0], class176.field2934[0], class177.field2982[0], class214.field3613[0], class26.field427[0], class63.field1153);
        class57.method350((byte) -122);
        return var1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBLnj;)V")
    private final void method916(int arg0, byte arg1, class226 arg2) {
        if (arg1 != 67) {
            this.field2489 = -38;
        }
        field2504++;
        if (arg0 == 1) {
            this.field2498 = arg2.method1447(0);
        } else if (arg0 == 2) {
            this.field2501 = arg2.method1447(0);
        } else if (arg0 == 4) {
            this.field2497 = arg2.method1447(0);
        } else if (arg0 == 5) {
            this.field2487 = arg2.method1447(0);
        } else if (arg0 == 6) {
            this.field2489 = arg2.method1447(0);
        } else if (arg0 == 7) {
            this.field2495 = arg2.method1471(255);
        } else if (arg0 == 8) {
            this.field2490 = arg2.method1471(255);
        } else if (arg0 == 9) {
            this.field2499 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method1471(arg1 ^ 0xBC);
            this.field2507 = new short[var4];
            this.field2505 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2505[var5] = (short) arg2.method1447(0);
                this.field2507[var5] = (short) arg2.method1447(0);
            }
            return;
        } else if (arg0 == 41) {
            int var6 = arg2.method1471(255);
            this.field2500 = new short[var6];
            this.field2502 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2502[var7] = (short) arg2.method1447(0);
                this.field2500[var7] = (short) arg2.method1447(0);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static void method917(int arg0) {
        field2503 = null;
        if (arg0 != -2) {
            method915(95);
        }
    }
}
