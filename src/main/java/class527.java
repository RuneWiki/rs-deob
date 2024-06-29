import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class527 extends class148 {

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
    private int field7797 = 0;

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
    private int field7793 = 10;

    @OriginalMember(owner = "client!lr", name = "Y", descriptor = "I")
    private int field7804 = 2048;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    public static int field7789 = 2;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!lr", name = "W", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "[I")
    private int[] field7791;

    @OriginalMember(owner = "client!lr", name = "X", descriptor = "[I")
    private int[] field7803;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(JIBI)V")
    public static final void method3110(long arg0, int arg1, byte arg2, int arg3) {
        ++field7794;
        int var5 = 31 & (int) arg0 >> 14;
        int var6 = 3 & (int) arg0 >> 20;
        if (arg2 < 74) {
            method3111(31, 84, -54);
        }
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (~var5 != -11 && ~var5 != -12 && ~var5 != -23) {
            class343.method2105(arg1, 0, arg3, 0, (byte) 119, true, 0, var6, var5);
        } else {
            class519 var8 = class252.field3743.method2686(var7, (byte) 115);
            int var9;
            int var10;
            if (~var6 != -1 && ~var6 != -3) {
                var9 = var8.field7648;
                var10 = var8.field7614;
            } else {
                var9 = var8.field7614;
                var10 = var8.field7648;
            }
            int var11 = var8.field7627;
            if (~var6 != -1) {
                var11 = (var11 << var6 & 15) - -(var11 >> -var6 + 4);
            }
            class343.method2105(arg1, var9, arg3, var10, (byte) 109, true, var11, 0, 0);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)V")
    public static final void method3111(int arg0, int arg1, int arg2) {
        ++field7798;
        class234 var3 = class491.field7281[arg1][arg0];
        if (var3 != null) {
            class449.field6690 = var3.field3469;
            class484.field7092 = var3.field3474;
            class217.field3180 = var3.field3484;
        }
        class437.method2622(-591);
        int var4 = 28 % ((-62 - arg2) / 40);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
    public class527() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIILuo;)V")
    public static final void method3112(int arg0, int arg1, int arg2, int arg3, int arg4, class404 arg5) {
        int var6 = -67 / ((arg1 - 17) / 40);
        ++field7796;
        if (~arg5.field6098 != 0 || arg5.field6095 != null) {
            int var7 = 0;
            int var8 = class426.field6401.field996 * arg5.field6105 >> 8;
            if (~arg4 >= ~arg5.field6087) {
                if (~arg4 > ~arg5.field6104) {
                    var7 += -arg4 + arg5.field6104;
                }
            } else {
                var7 += -arg5.field6087 + arg4;
            }
            if (~arg0 >= ~arg5.field6097) {
                if (~arg0 > ~arg5.field6102) {
                    var7 += -arg0 + arg5.field6102;
                }
            } else {
                var7 += arg0 - arg5.field6097;
            }
            if (arg5.field6089 != 0 && arg5.field6089 >= var7 + -64 && ~class426.field6401.field996 != -1 && ~arg5.field6101 == ~arg3) {
                var7 -= 64;
                if (var7 < 0) {
                    var7 = 0;
                }
                int var9 = (-var7 + arg5.field6089) * var8 / arg5.field6089;
                if (arg5.field6085 != null) {
                    arg5.field6085.method592(var9);
                } else if (~arg5.field6098 <= -1) {
                    class488 var10 = class488.method2896(class65.field976, arg5.field6098, 0);
                    if (var10 != null) {
                        class319 var11 = var10.method2898().method1989(class158.field2320);
                        class97 var12 = class97.method596(var11, 100, var9);
                        var12.method588(-1);
                        class366.field5591.method1792(var12);
                        arg5.field6085 = var12;
                    }
                }
                if (arg5.field6093 != null) {
                    arg5.field6093.method592(var9);
                    if (!arg5.field6093.method2050(1)) {
                        arg5.field6093 = null;
                        return;
                    }
                } else {
                    if (arg5.field6095 == null || (arg5.field6099 -= arg2) > 0) {
                        return;
                    }
                    int var13 = (int) ((double) arg5.field6095.length * Math.random());
                    class488 var14 = class488.method2896(class65.field976, arg5.field6095[var13], 0);
                    if (var14 == null) {
                        return;
                    }
                    class319 var15 = var14.method2898().method1989(class158.field2320);
                    class97 var16 = class97.method596(var15, 100, var9);
                    var16.method588(0);
                    class366.field5591.method1792(var16);
                    arg5.field6093 = var16;
                    arg5.field6099 = (int) (Math.random() * (double) (-arg5.field6090 + arg5.field6088)) + arg5.field6090;
                }
            } else {
                if (arg5.field6085 != null) {
                    class366.field5591.method1794(arg5.field6085);
                    arg5.field6085 = null;
                }
                if (arg5.field6093 != null) {
                    class366.field5591.method1794(arg5.field6093);
                    arg5.field6093 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        this.method3113((byte) -124);
        if (arg0 != -1285532468) {
            this.method25(-10, -59);
        }
        ++field7795;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field7797 = arg1.method1428(32122);
                }
            } else {
                this.field7804 = arg1.method1450((byte) 54);
            }
        } else {
            this.field7793 = arg1.method1428(32122);
        }
        int var5 = -26 / ((arg2 - -88) / 33);
        ++field7799;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        if (arg0 >= -65) {
            return null;
        } else {
            ++field7800;
            int[] var3 = super.field2193.method497(arg1, false);
            if (super.field2193.field1312) {
                int var4 = class456.field6752[arg1];
                if (this.field7797 != 0) {
                    for (int var5 = 0; ~class320.field4579 < ~var5; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class517.field7539[var5];
                        int var9 = this.field7797;
                        if (var9 != 1) {
                            if (var9 != 2) {
                                if (~var9 == -4) {
                                    var6 = (-var4 + var8 >> 1) + 2048;
                                }
                            } else {
                                var6 = (var4 - (4096 - var8) >> 1) + 2048;
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; ~var10 > ~this.field7793; ++var10) {
                            if (~var6 <= ~this.field7791[var10] && var6 < this.field7791[var10 + 1]) {
                                if (this.field7803[var10] > var6) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; ~var12 > ~this.field7793; ++var12) {
                        if (~this.field7791[var12] >= ~var4 && var4 < this.field7791[var12 + 1]) {
                            if (~this.field7803[var12] < ~var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class520.method3074(var3, 0, class320.field4579, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(B)V")
    private final void method3113(byte arg0) {
        ++field7801;
        this.field7791 = new int[this.field7793 - -1];
        int var2 = 0;
        this.field7803 = new int[this.field7793 + 1];
        if (arg0 > -48) {
            method3112(-25, 84, -47, -6, -112, (class404) null);
        }
        int var3 = 4096 / this.field7793;
        int var4 = this.field7804 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field7793; ++var5) {
            this.field7791[var5] = var2;
            this.field7803[var5] = var2 + var4;
            var2 += var3;
        }
        this.field7791[this.field7793] = 4096;
        this.field7803[this.field7793] = this.field7803[0] + 4096;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
    public static final void method3114(int arg0) {
        class8.field114 = null;
        class62.field947 = null;
        class179.field2637 = null;
        ++field7790;
        class423.field6361 = null;
        class202.field2920 = null;
        class28.field289 = null;
        if (arg0 != 1999147020) {
            field7789 = -55;
        }
        class307.field4412 = null;
        class133.field2040 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7792;
        if (arg0 != 65280) {
            field7789 = -47;
        }
        int var7 = class74.field1105;
        int[] var8 = class272.field3948;
        class503.field7380 = 0;
        for (int var9 = 0; class402.field6044 + var7 > var9; ++var9) {
            class342 var32 = null;
            class129 var33;
            if (var9 < var7) {
                var33 = class44.field707[var8[var9]];
            } else {
                var33 = class193.field2821[class378.field5766[-var7 + var9]];
                var32 = ((class167) var33).field2472;
                if (var32.field4938 != null) {
                    var32 = var32.method2094(12, class49.field796);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (~var33.field1913 <= -1 && (~class465.field6883 == ~var33.field1964 || class500.field7365.field1768 == var33.field1768)) {
                class26.method160(arg6 >> 1, arg0 + -65280, var33.method853((byte) -122), arg2 >> 1, var33, arg5, arg3);
                if (~class158.field2321[0] <= -1) {
                    if (var33.field1944 != null && (var7 <= var9 || class157.field2291 == 0 || ~class157.field2291 == -4 || ~class157.field2291 == -2 && class39.method235((byte) 109, ((class239) var33).field3548)) && ~class503.field7380 > ~class349.field5069) {
                        class349.field5126[class503.field7380] = class163.field2401.method1797(false, var33.field1944) / 2;
                        class349.field5054[class503.field7380] = class158.field2321[0];
                        class349.field5058[class503.field7380] = class158.field2321[1];
                        class349.field5024[class503.field7380] = var33.field1926;
                        class349.field5070[class503.field7380] = var33.field1932;
                        class349.field5137[class503.field7380] = var33.field1914;
                        class349.field5099[class503.field7380] = var33.field1944;
                        ++class503.field7380;
                    }
                    int var34 = arg1 - -class158.field2321[1];
                    int var45;
                    if (!var33.field1990 && ~class317.field4559 > ~var33.field1958) {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (~var7 < ~var9) {
                            class239 var37 = class44.field707[var8[var9]];
                            var38 = var33.method845(0).field1229;
                            if (var37.field3525) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field4914;
                            if (var38 == -1) {
                                var38 = var33.method845(0).field1229;
                            }
                        }
                        class529[] var39 = class87.field1334;
                        if (~var38 != 0) {
                            class529[] var40 = (class529[]) class333.field4698.method1536((long) var38, 0);
                            if (var40 == null) {
                                class408[] var41 = class408.method2460(class6.field81, var38, 0);
                                if (var41 != null) {
                                    var40 = new class529[var41.length];
                                    for (int var42 = 0; ~var41.length < ~var42; ++var42) {
                                        var40[var42] = class348.field5015.method1030(var41[var42], true);
                                    }
                                    class333.field4698.method1542(var40, (byte) 112, (long) var38);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (~var36 <= ~var39.length) {
                            var36 = 1;
                        }
                        class529 var43 = var39[0];
                        class529 var44 = var39[var36];
                        var45 = var34 - Math.max(class163.field2401.field3980, var43.method103());
                        int var46 = arg4 - (-class158.field2321[0] - -(var43.method108() >> 1));
                        int var47 = var43.method108() * var33.field1930 / 255;
                        if (var33.field1930 > 0 && ~var47 > -3) {
                            var47 = 2;
                        }
                        var43.method3121(var46, var45);
                        class348.field5015.method1069(var46, var45, var46 + var47, var43.method103() + var45);
                        var44.method3121(var46, var45);
                        class348.field5015.method1098(arg4, arg1, arg4 + arg6, arg1 + arg2);
                    } else {
                        var45 = var34 - Math.max(class163.field2401.field3980, class87.field1334[0].method103());
                    }
                    var45 -= 2;
                    if (!var33.field1990) {
                        if (var33.field1953 > class317.field4559) {
                            class529 var48 = class164.field2419[!var33.field1907 ? 0 : 2];
                            class529 var49 = class164.field2419[var33.field1907 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class167) {
                                var51 = var32.field4893;
                                if (~var51 == 0) {
                                    var51 = var33.method845(0).field1238;
                                }
                            } else {
                                var51 = var33.method845(arg0 ^ 65280).field1238;
                            }
                            if (~var51 != 0) {
                                class529[] var52 = (class529[]) class148.field2202.method1536((long) var51, 0);
                                if (var52 == null) {
                                    class408[] var53 = class408.method2460(class6.field81, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class529[var53.length];
                                        for (int var54 = 0; ~var53.length < ~var54; ++var54) {
                                            var52[var54] = class348.field5015.method1030(var53[var54], true);
                                        }
                                        class148.field2202.method1542(var52, (byte) 112, (long) var51);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[!var33.field1907 ? 1 : 3];
                                    var48 = var52[var33.field1907 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field1953 - class317.field4559;
                            int var56;
                            if (~var55 >= ~var33.field1951) {
                                var56 = var48.method108();
                            } else {
                                int var57 = var55 - var33.field1951;
                                int var58 = var33.field1921 != 0 ? (var33.field1920 - var57) / var33.field1921 * var33.field1921 : 0;
                                var56 = var48.method108() * var58 / var33.field1920;
                            }
                            int var59 = var48.method103();
                            var45 -= var59;
                            int var60 = class158.field2321[0] + arg4 + -(var48.method108() >> 1);
                            var48.method3121(var60, var45);
                            class348.field5015.method1069(var60, var45, var60 - -var56, var45 + var59);
                            var49.method3121(var60, var45);
                            var45 -= 2;
                            class348.field5015.method1098(arg4, arg1, arg4 + arg6, arg1 - -arg2);
                        }
                        if (~var9 > ~var7) {
                            class239 var61 = (class239) var33;
                            if (~var61.field3510 != 0) {
                                var45 -= 25;
                                class485.field7149[var61.field3510].method3121(arg4 - 12 + class158.field2321[0], var45);
                                var45 -= 2;
                            }
                            if (var61.field3513 != -1) {
                                var45 -= 25;
                                class495.field7328[var61.field3513].method3121(arg4 - -class158.field2321[0] + -12, var45);
                                var45 -= 2;
                            }
                        } else if (~var32.field4896 <= -1 && ~class495.field7328.length < ~var32.field4896) {
                            var45 -= 25;
                            class529 var62 = class495.field7328[var32.field4896];
                            var62.method3121(class158.field2321[0] + arg4 - (var62.method108() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (var33 instanceof class239) {
                        if (var9 >= 0) {
                            int var63 = 0;
                            class308[] var64 = class409.field6169;
                            for (int var65 = 0; var64.length > var65; ++var65) {
                                class308 var67 = var64[var65];
                                if (var67 != null && var67.field4436 == 10 && ~var8[var9] == ~var67.field4443) {
                                    class529 var68 = class250.field3711[var67.field4434];
                                    if (~var68.method103() < ~var63) {
                                        var63 = var68.method103();
                                    }
                                    var68.method3121(arg4 + -12 + class158.field2321[0], var45 - var68.method103());
                                }
                            }
                            if (~var63 < -1) {
                                var10000 = var45 - (var63 + 2);
                            }
                        }
                    } else {
                        int var69 = 0;
                        class308[] var70 = class409.field6169;
                        for (int var71 = 0; ~var70.length < ~var71; ++var71) {
                            class308 var75 = var70[var71];
                            if (var75 != null && var75.field4436 == 1 && ~class378.field5766[-var7 + var9] == ~var75.field4443) {
                                class529 var76 = class250.field3711[var75.field4434];
                                if (~var69 > ~var76.method103()) {
                                    var69 = var76.method103();
                                }
                                if (class317.field4559 % 20 < 10) {
                                    var76.method3121(class158.field2321[0] + arg4 + -12, var45 + -var76.method103());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var73 = 0; ~var73 > -5; ++var73) {
                        if (~class317.field4559 > ~var33.field1933[var73]) {
                            int var74 = var33.method853((byte) -105) / 2;
                            class26.method160(arg6 >> 1, 0, var74, arg2 >> 1, var33, arg5, arg3);
                            if (class158.field2321[0] > -1) {
                                if (var73 == 1) {
                                    class158.field2321[1] -= 20;
                                }
                                if (~var73 == -3) {
                                    class158.field2321[0] -= 15;
                                    class158.field2321[1] -= 10;
                                }
                                if (var73 == 3) {
                                    class158.field2321[1] -= 10;
                                    class158.field2321[0] += 15;
                                }
                                class423.field6358[var33.field1919[var73]].method3121(class158.field2321[0] + arg4 + -12, arg1 + -12 + class158.field2321[1]);
                                class47.field761.method2915(-1, 0, arg4 + -1 + class158.field2321[0], class158.field2321[1] + arg1 - -3, Integer.toString(var33.field1934[var73]), true);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; ~class68.field1040 < ~var10; ++var10) {
            int var28 = class420.field6323[var10];
            class129 var29;
            if (~var28 <= -2049) {
                var29 = class193.field2821[var28 - 2048];
            } else {
                var29 = class44.field707[var28];
            }
            int var30 = class159.field2350[var10];
            class129 var31;
            if (var30 >= 2048) {
                var31 = class193.field2821[var30 + -2048];
            } else {
                var31 = class44.field707[var30];
            }
            class211.method1481(var31, arg1, arg5, --var29.field1918, arg3, 127, arg2, var29, arg4, arg6);
        }
        int var11 = class163.field2401.field3980 - -2 + class163.field2401.field3988;
        for (int var12 = 0; ~class503.field7380 < ~var12; ++var12) {
            int var13 = class349.field5054[var12];
            int var14 = class349.field5058[var12];
            int var15 = class349.field5126[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; ++var27) {
                    if (~(class349.field5058[var27] - var11) > ~(var14 + 2) && class349.field5058[var27] + 2 > -var11 + var14 && ~(class349.field5126[var27] + class349.field5054[var27]) < ~(-var15 + var13) && class349.field5054[var27] + -class349.field5126[var27] < var13 - -var15 && ~(class349.field5058[var27] + -var11) > ~var14) {
                        var16 = true;
                        var14 = class349.field5058[var27] + -var11;
                    }
                }
            }
            class349.field5058[var12] = var14;
            String var17 = class349.field5099[var12];
            if (~class314.field4471 == -1) {
                int var18 = 16776960;
                if (class349.field5024[var12] < 6) {
                    var18 = class357.field5475[class349.field5024[var12]];
                }
                if (class349.field5024[var12] == 6) {
                    var18 = class465.field6883 % 20 < 10 ? 16711680 : 16776960;
                }
                if (~class349.field5024[var12] == -8) {
                    var18 = class465.field6883 % 20 >= 10 ? 65535 : 255;
                }
                if (~class349.field5024[var12] == -9) {
                    var18 = ~(class465.field6883 % 20) <= -11 ? 8454016 : 45056;
                }
                if (class349.field5024[var12] == 9) {
                    int var19 = -class349.field5137[var12] + 150;
                    if (~var19 > -51) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (~var19 <= -101) {
                        if (~var19 > -151) {
                            var18 = var19 * 5 + -500 + 65280;
                        }
                    } else {
                        var18 = -(var19 * 327680) - -16384000 + 16776960;
                    }
                }
                if (class349.field5024[var12] == 10) {
                    int var20 = -class349.field5137[var12] + 150;
                    if (var20 >= 50) {
                        if (~var20 > -101) {
                            var18 = 16384000 - (var20 * 327680 - 16711935);
                        } else if (~var20 > -151) {
                            var18 = var20 * 327680 + -32768000 + 255 + 500 + -(var20 * 5);
                        }
                    } else {
                        var18 = 16711680 - -(var20 * 5);
                    }
                }
                if (class349.field5024[var12] == 11) {
                    int var21 = 150 - class349.field5137[var12];
                    if (~var21 > -51) {
                        var18 = -(var21 * 327685) + 16777215;
                    } else if (var21 >= 100) {
                        if (~var21 > -151) {
                            var18 = 16777215 - var21 * 327680 + 32768000;
                        }
                    } else {
                        var18 = -16318970 - -(var21 * 327685);
                    }
                }
                int var22 = var18 | -16777216;
                if (~class349.field5070[var12] == -1) {
                    class294.field4202.method2915(var22, -16777216, arg4 + var13, arg1 + var14, var17, true);
                }
                if (class349.field5070[var12] == 1) {
                    class294.field4202.method2906(-16777216, -61, arg4 - -var13, arg1 + var14, class465.field6883, var17, var22);
                }
                if (~class349.field5070[var12] == -3) {
                    class294.field4202.method2901(-16777216, class465.field6883, var22, -89, arg4 + var13, arg1 + var14, var17);
                }
                if (class349.field5070[var12] == 3) {
                    class294.field4202.method2908(arg4 + var13, -16777216, var22, arg0 ^ 65280, -class349.field5137[var12] + 150, var17, class465.field6883, arg1 - -var14);
                }
                if (class349.field5070[var12] == 4) {
                    int var23 = (-class349.field5137[var12] + 150) * (class163.field2401.method1797(false, var17) - -100) / 150;
                    class348.field5015.method1069(arg4 + -50 - -var13, arg1, arg4 + var13 + 50, arg1 + arg2);
                    class294.field4202.method2899(var13 + 50 + arg4 + -var23, arg1 + var14, -16777216, var17, -16777216, var22);
                    class348.field5015.method1098(arg4, arg1, arg4 + arg6, arg1 + arg2);
                }
                if (~class349.field5070[var12] == -6) {
                    int var24 = -class349.field5137[var12] + 150;
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 + -25;
                    } else if (var24 > 125) {
                        var25 = var24 + -125;
                    }
                    int var26 = class163.field2401.field3988 + class163.field2401.field3980;
                    class348.field5015.method1069(arg4, arg1 - var26 + -1 + var14, arg4 - -arg6, arg1 + var14 + 5);
                    class294.field4202.method2915(var22, -16777216, arg4 + var13, arg1 - (-var14 - var25), var17, true);
                    class348.field5015.method1098(arg4, arg1, arg4 + arg6, arg1 + arg2);
                }
            } else {
                class294.field4202.method2915(-256, -16777216, arg4 - -var13, arg1 - -var14, var17, true);
            }
        }
    }
}
