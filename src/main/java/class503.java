import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class503 extends class642 {

    @OriginalMember(owner = "client!ur", name = "nb", descriptor = "Z")
    public boolean field6268 = false;

    @OriginalMember(owner = "client!ur", name = "mb", descriptor = "Z")
    public boolean field6267 = false;

    @OriginalMember(owner = "client!ur", name = "wb", descriptor = "Z")
    public boolean field6277 = false;

    @OriginalMember(owner = "client!ur", name = "xb", descriptor = "Z")
    public boolean field6278 = false;

    @OriginalMember(owner = "client!ur", name = "vb", descriptor = "Z")
    public boolean field6276 = false;

    @OriginalMember(owner = "client!ur", name = "db", descriptor = "Lnh;")
    public static class699 field6258 = new class699(1);

    @OriginalMember(owner = "client!ur", name = "cb", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!ur", name = "eb", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!ur", name = "fb", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!ur", name = "gb", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!ur", name = "hb", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!ur", name = "ib", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!ur", name = "jb", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!ur", name = "kb", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!ur", name = "lb", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!ur", name = "ob", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!ur", name = "pb", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!ur", name = "qb", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!ur", name = "rb", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!ur", name = "sb", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!ur", name = "tb", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!ur", name = "ub", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!ur", name = "yb", descriptor = "I")
    public int field6279;

    @OriginalMember(owner = "client!ur", name = "zb", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!ur", name = "Ab", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Lji;B)V", line = 5)
    private final void method2731(class572 arg0, byte arg1) {
        ++field6275;
        if (~(arg0.field7318.length - arg0.field7313) <= -2) {
            int var3 = arg0.method3097((byte) 12);
            if (~var3 <= -1 && ~var3 >= -23) {
                if (arg1 != 56) {
                    this.field6278 = false;
                }
                byte var4;
                if (var3 != 22) {
                    if (~var3 == -22) {
                        var4 = 44;
                    } else if (var3 != 20) {
                        if (var3 != 19) {
                            if (~var3 == -19) {
                                var4 = 41;
                            } else if (var3 != 17) {
                                if (var3 != 16) {
                                    if (var3 == 15) {
                                        var4 = 37;
                                    } else if (var3 != 14) {
                                        if (~var3 == -14) {
                                            var4 = 35;
                                        } else if (var3 == 12) {
                                            var4 = 34;
                                        } else if (~var3 != -12) {
                                            if (var3 == 10) {
                                                var4 = 32;
                                            } else if (~var3 != -10) {
                                                if (~var3 == -9) {
                                                    var4 = 30;
                                                } else if (var3 != 7) {
                                                    if (~var3 != -7) {
                                                        if (var3 != 5) {
                                                            if (var3 != 4) {
                                                                if (var3 != 3) {
                                                                    if (~var3 == -3) {
                                                                        var4 = 22;
                                                                    } else if (~var3 == -2) {
                                                                        var4 = 23;
                                                                    } else {
                                                                        var4 = 19;
                                                                    }
                                                                } else {
                                                                    var4 = 23;
                                                                }
                                                            } else {
                                                                var4 = 24;
                                                            }
                                                        } else {
                                                            var4 = 28;
                                                        }
                                                    } else {
                                                        var4 = 28;
                                                    }
                                                } else {
                                                    var4 = 29;
                                                }
                                            } else {
                                                var4 = 31;
                                            }
                                        } else {
                                            var4 = 33;
                                        }
                                    } else {
                                        var4 = 36;
                                    }
                                } else {
                                    var4 = 38;
                                }
                            } else {
                                var4 = 40;
                            }
                        } else {
                            var4 = 42;
                        }
                    } else {
                        var4 = 43;
                    }
                } else {
                    var4 = 45;
                }
                if (~(arg0.field7318.length + -arg0.field7313) <= ~var4) {
                    super.field8711 = arg0.method3097((byte) 12);
                    if (~super.field8711 > -2) {
                        super.field8711 = 1;
                    } else if (super.field8711 > 4) {
                        super.field8711 = 4;
                    }
                    this.method2735(arg0.method3097((byte) 12) == 1, 122);
                    super.field8716 = ~arg0.method3097((byte) 12) == -2;
                    super.field8679 = ~arg0.method3097((byte) 12) == -2;
                    super.field8722 = ~arg0.method3097((byte) 12) == -2;
                    super.field8718 = ~arg0.method3097((byte) 12) == -2 ? 1 : 0;
                    super.field8699 = ~arg0.method3097((byte) 12) == -2;
                    super.field8709 = arg0.method3097((byte) 12) == 1;
                    super.field8712 = arg0.method3097((byte) 12) == 1;
                    super.field8707 = arg0.method3097((byte) 12);
                    if (super.field8707 > 2) {
                        super.field8707 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field8686 = arg0.method3097((byte) 12);
                    }
                    if (var3 >= 2) {
                        super.field8683 = arg0.method3097((byte) 12) == 1;
                        if (var3 >= 17) {
                            super.field8704 = arg0.method3097((byte) 12) == 1;
                        }
                    } else {
                        super.field8683 = ~arg0.method3097((byte) 12) == -2;
                        arg0.method3097((byte) 12);
                    }
                    super.field8698 = ~arg0.method3097((byte) 12) == -2;
                    super.field8700 = ~arg0.method3097((byte) 12) == -2;
                    super.field8678 = arg0.method3097((byte) 12);
                    if (super.field8678 > 2) {
                        super.field8678 = 2;
                    }
                    super.field8721 = super.field8678;
                    super.field8714 = ~arg0.method3097((byte) 12) == -2;
                    super.field8689 = arg0.method3097((byte) 12);
                    if (~super.field8689 < -128) {
                        super.field8689 = 127;
                    }
                    if (~var3 <= -21) {
                        super.field8681 = arg0.method3097((byte) 12);
                        if (~super.field8681 < -128) {
                            super.field8681 = 127;
                        }
                    } else {
                        super.field8681 = super.field8689;
                    }
                    super.field8684 = arg0.method3097((byte) 12);
                    super.field8701 = arg0.method3097((byte) 12);
                    if (super.field8701 > 127) {
                        super.field8701 = 127;
                    }
                    if (~var3 > -22) {
                        super.field8702 = super.field8684;
                    } else {
                        super.field8702 = arg0.method3097((byte) 12);
                        if (~super.field8702 < -128) {
                            super.field8702 = 127;
                        }
                    }
                    if (var3 >= 1) {
                        super.field8706 = arg0.method3031(-1);
                        super.field8690 = arg0.method3031(-1);
                    }
                    if (~var3 <= -4 && var3 < 6) {
                        arg0.method3097((byte) 12);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method3097((byte) 12);
                        if (var5 < 0 || var5 > 2) {
                            var5 = 0;
                        }
                        if (class357.field4610 < 96) {
                            var5 = 0;
                        }
                        class242.method1451(var5, true);
                    }
                    if (~var3 <= -6) {
                        super.field8708 = arg0.method3064(arg1 ^ -2031091520);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field8697 = var6 = arg0.method3097((byte) 12);
                    }
                    if (~super.field8697 != -2 && super.field8697 != 2) {
                        super.field8697 = 2;
                    }
                    if (var3 >= 7) {
                        super.field8713 = ~arg0.method3097((byte) 12) == -2;
                    }
                    if (~var3 <= -9) {
                        super.field8695 = ~arg0.method3097((byte) 12) == -2;
                    }
                    if (var3 >= 9) {
                        super.field8696 = arg0.method3097((byte) 12);
                    }
                    if (super.field8696 < 0 || ~super.field8696 < ~class530.method2860(class357.field4610, arg1 ^ 5946)) {
                        super.field8696 = 0;
                    }
                    if (var3 >= 10) {
                        super.field8703 = arg0.method3097((byte) 12) != 0;
                    }
                    if (~var3 <= -12) {
                        super.field8692 = ~arg0.method3097((byte) 12) != -1;
                    }
                    if (~var3 <= -13) {
                        super.field8718 = arg0.method3097((byte) 12);
                    }
                    if (super.field8718 < 0 || super.field8718 > 2) {
                        super.field8718 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field8717 = arg0.method3097((byte) 12) == 1;
                    }
                    if (var3 >= 14) {
                        super.field8688 = arg0.method3097((byte) 12);
                    } else if (var6 != 0) {
                        super.field8688 = 1;
                    } else {
                        super.field8688 = 2;
                    }
                    if (super.field8688 < 0 || ~super.field8688 < -6) {
                        super.field8688 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field8677 = arg0.method3097((byte) 12);
                        if (~super.field8677 > -1 || super.field8677 > 4) {
                            super.field8677 = ~class552.field6914 == -2 ? 2 : 4;
                        }
                    }
                    if (var3 >= 16) {
                        super.field8685 = arg0.method3097((byte) 12) == 1;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field8685 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (~var3 > -18 && ~super.field8688 == -1) {
                        super.field8688 = 2;
                    }
                    if (~var3 <= -19) {
                        super.field8687 = arg0.method3097((byte) 12);
                        if (super.field8687 < 0 || super.field8687 > 4) {
                            super.field8687 = 0;
                        }
                    }
                    if (var3 >= 19) {
                        super.field8682 = arg0.method3097((byte) 12);
                    } else if (~super.field8687 != -2 && ~super.field8687 != -3) {
                        if (super.field8687 != 3) {
                            super.field8682 = 0;
                        } else {
                            super.field8682 = 1;
                        }
                    } else {
                        super.field8682 = 2;
                    }
                    if (var3 >= 22) {
                        super.field8694 = arg0.method3097((byte) 12);
                    }
                    if (~super.field8688 == -1 && class357.field4610 < 96 && ~super.field8687 != -2 && ~super.field8687 != -1) {
                        this.method2737((byte) 58);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)Z", line = 351)
    public final boolean method2732(byte arg0, int arg1) {
        int var3 = 54 % ((arg0 - -61) / 34);
        ++field6272;
        return ~arg1 != -1 ? true : super.field8723;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)I", line = 366)
    public final int method2733(byte arg0) {
        ++field6259;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class386.field4955.field5919 && !class386.field4955.field5925) {
            if (!class476.field5927.startsWith("win")) {
                var3 = true;
            } else {
                var3 = true;
                if (!class476.field5920.startsWith("amd64") && !class476.field5920.startsWith("x86_64")) {
                    var2 = true;
                }
                var4 = true;
            }
        }
        if (this.field6278) {
            var3 = false;
        }
        if (this.field6267) {
            var4 = false;
        }
        if (this.field6277) {
            var2 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method2739((byte) -47);
        } else if (arg0 <= 118) {
            return -93;
        } else {
            int var5 = -1;
            int var6 = -1;
            if (var2) {
                try {
                    var5 = class179.method1064(1000, 2, (byte) -71);
                } catch (Exception var16) {
                }
            }
            int var7 = -1;
            if (var4) {
                try {
                    var7 = class179.method1064(1000, 3, (byte) -71);
                    if (~class628.field8526 == -4) {
                        class379 var8 = class309.field3898.method317();
                        long var9 = 281474976710655L & var8.field4864;
                        int var11 = var8.field4869;
                        if (~var11 != -4319) {
                            if (var11 == 4098) {
                                var3 &= var9 >= 60129613779L;
                            }
                        } else {
                            var3 &= var9 >= 64425238954L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class179.method1064(1000, 1, (byte) -71);
                } catch (Exception var14) {
                }
            }
            if (var5 == -1 && var6 == -1 && var7 == -1) {
                return this.method2739((byte) -24);
            } else {
                int var12 = (int) ((float) var7 * 1.1F);
                int var13 = (int) ((float) var6 * 1.1F);
                if (~var12 > ~var5 && ~var13 > ~var5) {
                    return this.method2734(var5, -48);
                } else {
                    return ~var12 < ~var13 ? this.method2742(3, true, var12) : this.method2742(1, true, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I", line = 537)
    private final int method2734(int arg0, int arg1) {
        int var3 = -30 % ((50 - arg1) / 55);
        ++field6270;
        byte var4;
        if (arg0 <= 12000) {
            if (~arg0 < -5001) {
                var4 = 3;
                this.method2747(100);
            } else if (~arg0 < -2001) {
                this.method2741(-117);
                var4 = 2;
            } else {
                var4 = 1;
                this.method2737((byte) 77);
            }
        } else {
            var4 = 4;
            this.method2738(1);
        }
        if (class628.field8526 != 2) {
            super.field8688 = 2;
            class364.method2114(2, 112);
        }
        this.method2749(class386.field4955, -85);
        return var4;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)V", line = 582)
    public final void method2735(boolean arg0, int arg1) {
        if (arg1 >= 82) {
            ++field6260;
            super.field8723 = arg0;
            if (class232.field3017 != null) {
                class232.field3017.method2353(-119, !this.method2744(class628.field8526, 4));
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)I", line = 597)
    public final int method2736(int arg0, int arg1) {
        if (arg0 >= -41) {
            return -2;
        } else {
            ++field6257;
            if (class396.method2239(arg1, false) && !class398.method2252(class470.field5804, 2)) {
                return class357.field4610 < 96 && class213.method1242(arg1, -5) && super.field8682 == 0 ? 1 : super.field8682;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)V", line = 617)
    public final void method2737(byte arg0) {
        ++field6263;
        this.method2735(false, 124);
        super.field8698 = false;
        super.field8685 = false;
        super.field8707 = super.field8686 = 0;
        super.field8678 = super.field8721 = 0;
        int var2 = -4 % ((-14 - arg0) / 60);
        super.field8704 = false;
        super.field8722 = false;
        super.field8700 = false;
        super.field8712 = false;
        super.field8679 = false;
        super.field8718 = 0;
        super.field8709 = false;
        super.field8699 = false;
        super.field8716 = false;
        super.field8683 = false;
        class242.method1451(0, true);
        super.field8703 = false;
        super.field8696 = 0;
        super.field8717 = false;
        this.method2740(false);
        this.method2745(2, (byte) -48);
        super.field8687 = 1;
        class305.method1816((byte) 2);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 651)
    public final void method2738(int arg0) {
        ++field6264;
        this.method2735(true, 108);
        super.field8722 = true;
        super.field8704 = true;
        super.field8678 = super.field8721 = 0;
        super.field8683 = true;
        super.field8679 = true;
        super.field8700 = true;
        super.field8712 = true;
        super.field8716 = true;
        super.field8698 = true;
        super.field8699 = true;
        super.field8718 = arg0;
        super.field8707 = super.field8686 = 2;
        super.field8685 = true;
        super.field8709 = true;
        if (~class357.field4610 < -96) {
            class242.method1451(2, true);
        } else {
            class242.method1451(0, true);
        }
        super.field8703 = false;
        super.field8717 = true;
        super.field8696 = 0;
        this.method2740(false);
        this.method2745(0, (byte) -97);
        super.field8687 = 4;
        class305.method1816((byte) 2);
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(B)I", line = 690)
    private final int method2739(byte arg0) {
        ++field6273;
        byte var3;
        if (class357.field4610 >= 96) {
            int var2 = class141.method889(-61);
            if (~var2 >= -101) {
                this.method2738(1);
                var3 = 4;
            } else if (~var2 >= -501) {
                var3 = 3;
                this.method2747(-72);
            } else if (var2 <= 1000) {
                var3 = 2;
                this.method2741(-92);
            } else {
                var3 = 1;
                this.method2737((byte) -97);
            }
        } else {
            this.method2737((byte) 90);
            var3 = 1;
        }
        if (class628.field8526 != 0) {
            super.field8688 = 0;
            class364.method2114(0, 103);
        }
        this.method2749(class386.field4955, -68);
        return arg0 >= -21 ? -17 : var3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V", line = 752)
    private final void method2740(boolean arg0) {
        ++field6261;
        if (!arg0) {
            if (class552.field6914 > 1) {
                super.field8677 = 4;
            } else {
                super.field8677 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V", line = 775)
    public final void method2741(int arg0) {
        ++field6262;
        this.method2735(true, 105);
        super.field8709 = false;
        super.field8683 = false;
        if (arg0 < -6) {
            super.field8700 = false;
            super.field8722 = false;
            super.field8716 = false;
            super.field8678 = super.field8721 = 0;
            super.field8679 = true;
            super.field8685 = false;
            super.field8712 = false;
            super.field8718 = 0;
            super.field8698 = false;
            super.field8707 = super.field8686 = 0;
            super.field8704 = false;
            super.field8699 = false;
            class242.method1451(0, true);
            super.field8696 = 0;
            super.field8717 = true;
            super.field8703 = false;
            this.method2740(false);
            this.method2745(2, (byte) 84);
            super.field8687 = 2;
            class305.method1816((byte) 2);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZI)I", line = 811)
    private final int method2742(int arg0, boolean arg1, int arg2) {
        ++field6280;
        if (!arg1) {
            this.method2749((class476) null, -69);
        }
        byte var4;
        if (~arg2 >= -20001) {
            if (arg2 <= 10000) {
                if (arg2 > 5000) {
                    this.method2741(-9);
                    var4 = 2;
                } else {
                    this.method2737((byte) -81);
                    var4 = 1;
                }
            } else {
                this.method2747(-99);
                var4 = 3;
            }
        } else {
            this.method2738(1);
            var4 = 4;
        }
        if (~class628.field8526 != ~arg0) {
            super.field8688 = arg0;
            class364.method2114(arg0, 123);
        }
        this.method2749(class386.field4955, -58);
        return var4;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)V", line = 861)
    public static void method2743(boolean arg0) {
        if (arg0) {
            method2748(0.96071434F, 1.4778153F, -62, -0.23997991F);
        }
        field6258 = null;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lqj;)V", line = 1035)
    public class503(class476 arg0) {
        super.field8687 = 3;
        super.field8711 = 3;
        this.method2735(true, 112);
        super.field8684 = 127;
        super.field8699 = true;
        super.field8718 = 1;
        super.field8690 = 0;
        super.field8700 = true;
        super.field8706 = 0;
        super.field8678 = 0;
        super.field8689 = 127;
        super.field8698 = true;
        super.field8712 = true;
        super.field8707 = 2;
        super.field8681 = 127;
        super.field8716 = true;
        super.field8679 = true;
        super.field8686 = 0;
        super.field8683 = true;
        super.field8702 = 127;
        super.field8722 = true;
        super.field8721 = 0;
        super.field8704 = false;
        super.field8701 = 127;
        super.field8714 = true;
        super.field8709 = true;
        if (class357.field4610 < 96) {
            class242.method1451(0, true);
        } else {
            class242.method1451(2, true);
        }
        super.field8695 = false;
        super.field8692 = true;
        super.field8717 = true;
        super.field8713 = false;
        super.field8697 = 2;
        super.field8703 = false;
        super.field8682 = 0;
        super.field8696 = 0;
        super.field8677 = ~class552.field6914 == -2 ? 2 : 4;
        super.field8708 = 0;
        super.field8688 = 2;
        class448 var2 = null;
        try {
            class218 var3 = arg0.method2596((byte) 110, true, "");
            while (var3.field2546 == 0) {
                class700.method3867(29279, 1L);
            }
            if (~var3.field2546 == -2) {
                var2 = (class448) var3.field2547;
                byte[] var4 = new byte[(int) var2.method2447(1)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method2448((byte) 122, var5, var4, var4.length + -var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method2731(new class572(var4), (byte) 56);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2451(true);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(II)Z", line = 878)
    public final boolean method2744(int arg0, int arg1) {
        if (arg1 != 4) {
            this.field6276 = true;
        }
        ++field6265;
        return ~arg0 == -1 && !this.field6276 ? super.field8723 : true;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IB)V", line = 898)
    public final void method2745(int arg0, byte arg1) {
        int var3 = 123 / ((14 - arg1) / 34);
        class167.field1964 = null;
        ++field6269;
        class36.field537 = true;
        super.field8682 = arg0;
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(II)I", line = 914)
    public final int method2746(int arg0, int arg1) {
        ++field6271;
        if (this.field6268) {
            return 0;
        } else {
            int var3 = 77 / ((arg0 - 54) / 36);
            if (!this.method2744(arg1, 4)) {
                return 1;
            } else {
                return super.field8716 ? 2 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V", line = 935)
    public final void method2747(int arg0) {
        this.method2735(true, 105);
        ++field6281;
        super.field8709 = true;
        super.field8716 = true;
        super.field8685 = true;
        super.field8678 = super.field8721 = 0;
        super.field8700 = true;
        super.field8707 = super.field8686 = 1;
        super.field8698 = false;
        super.field8712 = true;
        super.field8683 = true;
        super.field8704 = false;
        super.field8699 = true;
        super.field8718 = 1;
        super.field8722 = true;
        super.field8679 = true;
        if (~class357.field4610 >= -96) {
            class242.method1451(0, true);
        } else {
            class242.method1451(1, true);
        }
        int var2 = 127 % ((30 - arg0) / 49);
        super.field8703 = false;
        super.field8717 = true;
        super.field8696 = 0;
        this.method2740(false);
        this.method2745(1, (byte) -114);
        super.field8687 = 3;
        class305.method1816((byte) 2);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(FFIF)F", line = 973)
    public static final float method2748(float arg0, float arg1, int arg2, float arg3) {
        if (arg2 < 120) {
            field6258 = null;
        }
        ++field6266;
        return (-arg3 + arg0) * arg1 + arg3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lqj;I)V", line = 986)
    public final void method2749(class476 arg0, int arg1) {
        ++field6274;
        class448 var3 = null;
        if (arg1 > -52) {
            this.field6267 = true;
        }
        try {
            class218 var4 = arg0.method2596((byte) 112, true, "");
            while (~var4.field2546 == -1) {
                class700.method3867(29279, 1L);
            }
            if (~var4.field2546 == -2) {
                var3 = (class448) var4.field2547;
                class572 var5 = new class572(class510.method2781(true));
                this.method3596(var5, (byte) 71);
                var3.method2449(var5.field7318, var5.field7313, (byte) 27, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method2451(true);
            }
        } catch (Exception var6) {
        }
    }
}
