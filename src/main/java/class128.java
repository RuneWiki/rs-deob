import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class128 extends class260 {

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    private int field2364 = 0;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    private int field2375 = 10;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    private int field2373 = 2048;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "Loh;")
    public static class263 field2369 = class253.method1681(-126, "welle:");

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "[I")
    private int[] field2366;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "[I")
    public static int[] field2370;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "[I")
    private int[] field2374;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        ++field2376;
        this.method836((byte) 80);
        if (arg0 <= 81) {
            method834(-103, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field2365;
        if (arg1 != 255) {
            this.field2364 = 58;
        }
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            int var4 = class275.field4825[arg0];
            if (this.field2364 != 0) {
                for (int var5 = 0; var5 < class49.field1052; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class70.field1409[var5];
                    int var9 = this.field2364;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var8 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field2375 < ~var10; ++var10) {
                        if (var6 >= this.field2374[var10] && ~var6 > ~this.field2374[var10 - -1]) {
                            if (~var6 > ~this.field2366[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field2375 < ~var12; ++var12) {
                    if (~var4 <= ~this.field2374[var12] && ~var4 > ~this.field2374[var12 + 1]) {
                        if (~this.field2366[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class149.method978(var3, 0, class49.field1052, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class128() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLsi;)V")
    public static final void method831(byte arg0, class194 arg1) {
        ++field2371;
        if (arg1.field3469.length - arg1.field3497 >= 1) {
            int var2 = arg1.method1301(-8317);
            if (~var2 <= -1 && var2 <= 7) {
                byte var3;
                if (var2 != 7) {
                    if (~var2 != -7) {
                        if (~var2 != -6) {
                            if (var2 != 4) {
                                if (var2 != 3) {
                                    if (var2 == 2) {
                                        var3 = 22;
                                    } else if (~var2 == -2) {
                                        var3 = 23;
                                    } else {
                                        var3 = 19;
                                    }
                                } else {
                                    var3 = 23;
                                }
                            } else {
                                var3 = 24;
                            }
                        } else {
                            var3 = 28;
                        }
                    } else {
                        var3 = 28;
                    }
                } else {
                    var3 = 29;
                }
                if (~(arg1.field3469.length + -arg1.field3497) <= ~var3) {
                    class183.field3310 = arg1.method1301(-8317);
                    if (~class183.field3310 > -2) {
                        class183.field3310 = 1;
                    } else if (class183.field3310 > 4) {
                        class183.field3310 = 4;
                    }
                    class159.method1043((byte) 56, ~arg1.method1301(-8317) == -2);
                    class7.field135 = ~arg1.method1301(-8317) == -2;
                    class146.field2670 = arg1.method1301(-8317) == 1;
                    class101.field1930 = ~arg1.method1301(-8317) == -2;
                    class159.field2896 = arg1.method1301(-8317) == 1;
                    class1.field9 = arg1.method1301(-8317) == 1;
                    class107.field2028 = ~arg1.method1301(-8317) == -2;
                    class125.field2322 = arg1.method1301(-8317) == 1;
                    class277.field4853 = arg1.method1301(-8317);
                    if (class277.field4853 > 2) {
                        class277.field4853 = 2;
                    }
                    if (var2 < 2) {
                        class126.field2331 = ~arg1.method1301(-8317) == -2;
                        arg1.method1301(-8317);
                    } else {
                        class126.field2331 = arg1.method1301(-8317) == 1;
                    }
                    class17.field394 = ~arg1.method1301(-8317) == -2;
                    class187.field3372 = ~arg1.method1301(-8317) == -2;
                    class126.field2335 = arg1.method1301(-8317);
                    if (~class126.field2335 < -3) {
                        class126.field2335 = 2;
                    }
                    class60.field1239 = class126.field2335;
                    class253.field4397 = ~arg1.method1301(-8317) == -2;
                    class265.field4632 = arg1.method1301(-8317);
                    if (~class265.field4632 < -128) {
                        class265.field4632 = 127;
                    }
                    class95.field1866 = arg1.method1301(-8317);
                    class214.field3798 = arg1.method1301(-8317);
                    if (~class214.field3798 < -128) {
                        class214.field3798 = 127;
                    }
                    int var4 = -91 % ((arg0 - -22) / 36);
                    if (~var2 <= -2) {
                        class2.field51 = arg1.method1294((byte) 3);
                        class64.field1292 = arg1.method1294((byte) 3);
                    }
                    if (var2 >= 3 && var2 < 6) {
                        arg1.method1301(-8317);
                    }
                    if (~var2 <= -5) {
                        arg1.method1301(-8317);
                    }
                    if (~var2 <= -6) {
                        class232.field4061 = arg1.method1266(4);
                    }
                    if (var2 >= 6) {
                        class107.field2027 = arg1.method1301(-8317);
                    }
                    if (var2 >= 7) {
                        class245.field4319 = ~arg1.method1301(-8317) == -2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2364 = arg2.method1301(-8317);
                }
            } else {
                this.field2373 = arg2.method1294((byte) 3);
            }
        } else {
            this.field2375 = arg2.method1301(-8317);
        }
        if (arg1 == 5701) {
            ++field2372;
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
    public static final void method832(int arg0) {
        class75.field1543 = null;
        class232.field4062 = null;
        class232.field4052 = null;
        class275.field4821 = null;
        client.field2763 = null;
        class255.field4448 = null;
        class35.field821 = null;
        ++field2367;
        class181.field3291 = null;
        if (arg0 != 2) {
            method834(-98, (byte) 105);
        }
        class86.field1727 = null;
        class103.field1967 = null;
        class86.field1730 = null;
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V")
    public static void method833(int arg0) {
        field2369 = null;
        if (arg0 != 10) {
            method832(11);
        }
        field2370 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)V")
    public static final void method834(int arg0, byte arg1) {
        ++field2377;
        if (arg0 != -1) {
            if (class166.method1090((byte) 124, arg0)) {
                class21[] var2 = class164.field2974[arg0];
                int var3 = 0;
                int var4 = -89 % ((-38 - arg1) / 60);
                while (~var3 > ~var2.length) {
                    class21 var5 = var2[var3];
                    if (var5.field474 != null) {
                        class116 var6 = new class116();
                        var6.field2166 = var5;
                        var6.field2173 = var5.field474;
                        class219.method1495(2000000, var6, 16383);
                    }
                    ++var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lbi;ILfg;Ldg;IIII)V")
    public static final void method835(class90 arg0, int arg1, class12 arg2, class137 arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2378;
        class255 var8 = new class255();
        var8.field4450 = arg5;
        var8.field4447 = arg4 * 128;
        var8.field4452 = arg1 * 128;
        if (arg2 == null) {
            if (arg0 == null) {
                if (arg3 != null) {
                    var8.field4451 = arg3;
                    var8.field4437 = (arg3.method898(87) + arg1) * 128;
                    var8.field4439 = 128 * (arg3.method898(101) + arg4);
                    var8.field4453 = class145.method959(arg3, 98);
                    var8.field4440 = arg3.field2530 * 128;
                    class232.field4057.method33(var8, arg3.field2508.method1755(1), -123);
                }
            } else {
                var8.field4443 = arg0;
                class204 var9 = arg0.field1787;
                if (var9.field3691 != null) {
                    var8.field4429 = true;
                    var9 = var9.method1407((byte) -31);
                }
                if (var9 != null) {
                    var8.field4437 = (var9.field3694 + arg1) * 128;
                    var8.field4439 = (var9.field3694 + arg4) * 128;
                    var8.field4453 = class48.method307(-120, arg0);
                    var8.field4440 = var9.field3689 * 128;
                }
                class234.field4083.method1883(var8, (byte) -3);
            }
        } else {
            var8.field4435 = arg2.field280;
            var8.field4446 = arg2.field296;
            var8.field4456 = arg2.field269;
            var8.field4440 = arg2.field301 * 128;
            var8.field4453 = arg2.field289;
            var8.field4433 = arg2;
            int var10 = arg2.field329;
            int var11 = arg2.field308;
            if (~arg6 == -2 || ~arg6 == -4) {
                var11 = arg2.field329;
                var10 = arg2.field308;
            }
            var8.field4437 = (arg1 + var10) * 128;
            var8.field4439 = (arg4 + var11) * 128;
            if (arg2.field328 != null) {
                var8.field4429 = true;
                var8.method1693(-111);
            }
            if (var8.field4446 != null) {
                var8.field4441 = (int) ((double) (-var8.field4435 + var8.field4456) * Math.random()) + var8.field4435;
            }
            class49.field1061.method1883(var8, (byte) -3);
        }
        if (arg7 >= -50) {
            method833(-75);
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V")
    private final void method836(byte arg0) {
        int var2 = 0;
        int var3 = 4096 / this.field2375;
        ++field2368;
        this.field2366 = new int[this.field2375 + 1];
        int var4 = this.field2373 * var3 >> 12;
        this.field2374 = new int[this.field2375 + 1];
        if (arg0 == 80) {
            for (int var5 = 0; ~this.field2375 < ~var5; ++var5) {
                this.field2374[var5] = var2;
                this.field2366[var5] = var2 + var4;
                var2 += var3;
            }
            this.field2374[this.field2375] = 4096;
            this.field2366[this.field2375] = this.field2366[0] + 4096;
        }
    }
}
