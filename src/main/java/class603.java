import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class603 extends class674 {

    @OriginalMember(owner = "client!rn", name = "ib", descriptor = "Z")
    public boolean field8700 = false;

    @OriginalMember(owner = "client!rn", name = "bb", descriptor = "Z")
    public boolean field8693 = false;

    @OriginalMember(owner = "client!rn", name = "rb", descriptor = "Z")
    public boolean field8709 = false;

    @OriginalMember(owner = "client!rn", name = "tb", descriptor = "Z")
    public boolean field8711 = false;

    @OriginalMember(owner = "client!rn", name = "zb", descriptor = "Z")
    public boolean field8717 = false;

    @OriginalMember(owner = "client!rn", name = "jb", descriptor = "Lvg;")
    public static class622 field8701 = new class622(43, -2);

    @OriginalMember(owner = "client!rn", name = "yb", descriptor = "Z")
    public static boolean field8716 = false;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!rn", name = "cb", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!rn", name = "eb", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!rn", name = "fb", descriptor = "I")
    public static int field8697;

    @OriginalMember(owner = "client!rn", name = "gb", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!rn", name = "hb", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!rn", name = "kb", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!rn", name = "mb", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!rn", name = "nb", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!rn", name = "ob", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!rn", name = "pb", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!rn", name = "qb", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!rn", name = "sb", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!rn", name = "ub", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!rn", name = "vb", descriptor = "I")
    public int field8713;

    @OriginalMember(owner = "client!rn", name = "wb", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!rn", name = "xb", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!rn", name = "Ab", descriptor = "I")
    public static int field8718;

    @OriginalMember(owner = "client!rn", name = "Bb", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!rn", name = "Cb", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!rn", name = "Db", descriptor = "[I")
    public static int[] field8721;

    @OriginalMember(owner = "client!rn", name = "lb", descriptor = "[[[B")
    public static byte[][][] field8703;

    @OriginalMember(owner = "client!rn", name = "db", descriptor = "[[[Lms;")
    public static class44[][][] field8695;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 6)
    public final void method3425(int arg0) {
        int var2 = -117 % ((arg0 - 62) / 34);
        ++field8704;
        this.method3436(true, (byte) -98);
        super.field9496 = false;
        super.field9482 = false;
        super.field9484 = false;
        super.field9503 = 0;
        super.field9506 = false;
        super.field9497 = false;
        super.field9493 = super.field9492 = 0;
        super.field9468 = false;
        super.field9465 = false;
        super.field9487 = false;
        super.field9491 = false;
        super.field9467 = false;
        super.field9480 = true;
        super.field9478 = super.field9485 = 0;
        class403.method2486((byte) 100, 0);
        super.field9473 = false;
        super.field9481 = 0;
        super.field9475 = true;
        this.method3435(-94);
        this.method3429(1, 2);
        super.field9466 = 2;
        class614.method3500(103);
        class456.method2668(255);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V", line = 41)
    public final void method3426(byte arg0) {
        ++field8698;
        this.method3436(true, (byte) -81);
        super.field9478 = super.field9485 = 0;
        super.field9482 = true;
        super.field9503 = 1;
        super.field9497 = true;
        super.field9506 = true;
        super.field9484 = true;
        super.field9487 = true;
        super.field9480 = true;
        super.field9493 = super.field9492 = 1;
        super.field9465 = true;
        super.field9468 = true;
        super.field9496 = false;
        super.field9467 = true;
        super.field9491 = false;
        if (class190.field2576 > 95) {
            class403.method2486((byte) 92, 1);
        } else {
            class403.method2486((byte) 120, 0);
        }
        super.field9473 = false;
        super.field9475 = true;
        super.field9481 = 0;
        this.method3435(-109);
        if (arg0 <= 7) {
            this.method3431((byte) -21, 108);
        }
        this.method3429(1, 1);
        super.field9466 = 3;
        class614.method3500(57);
        class456.method2668(255);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)I", line = 85)
    public final int method3427(int arg0, int arg1) {
        int var3 = -25 % ((48 - arg1) / 44);
        ++field8705;
        if (this.field8693) {
            return 0;
        } else if (!this.method3439(arg0, false)) {
            return 1;
        } else {
            return super.field9482 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(II)Z", line = 101)
    public static final boolean method3428(int arg0, int arg1) {
        if (arg0 != 500) {
            return true;
        } else {
            ++field8714;
            return ~arg1 == -16 || ~arg1 == -47 || ~arg1 == -1009 || ~arg1 == -3 || ~arg1 == -24;
        }
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(II)V", line = 114)
    public final void method3429(int arg0, int arg1) {
        class239.field3144 = true;
        super.field9489 = arg1;
        if (arg0 != 1) {
            this.method3437(true, 25);
        }
        class139.field2021 = null;
        ++field8707;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V", line = 129)
    public static void method3430(int arg0) {
        field8721 = null;
        field8703 = null;
        field8701 = null;
        if (arg0 != -17) {
            method3430(77);
        }
        field8695 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)Z", line = 143)
    public final boolean method3431(byte arg0, int arg1) {
        ++field8694;
        if (arg0 >= -112) {
            field8701 = null;
        }
        return ~arg1 == -1 ? super.field9472 : true;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I", line = 159)
    private final int method3432(int arg0, int arg1, int arg2) {
        int var4 = 4 % ((-77 - arg2) / 48);
        ++field8715;
        byte var5;
        if (~arg0 < -20001) {
            var5 = 4;
            this.method3441((byte) 93);
        } else if (~arg0 < -10001) {
            this.method3426((byte) 31);
            var5 = 3;
        } else if (arg0 > 5000) {
            var5 = 2;
            this.method3425(103);
        } else {
            var5 = 1;
            this.method3433(19771, true);
        }
        if (class62.field996 != arg1) {
            super.field9483 = arg1;
            class409.method2509(512, arg1);
        }
        this.method3442(class61.field978, 115);
        return var5;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(IZ)V", line = 204)
    public final void method3433(int arg0, boolean arg1) {
        ++field8696;
        this.method3436(false, (byte) -111);
        super.field9482 = false;
        super.field9480 = !class478.field6840.equals(class518.field7269);
        super.field9467 = false;
        super.field9478 = super.field9485 = 0;
        super.field9497 = false;
        super.field9484 = false;
        super.field9491 = false;
        super.field9465 = false;
        super.field9487 = false;
        super.field9496 = false;
        super.field9506 = false;
        super.field9503 = 0;
        if (arg0 == 19771) {
            super.field9468 = false;
            super.field9493 = super.field9492 = 0;
            class403.method2486((byte) 90, 0);
            super.field9481 = 0;
            super.field9475 = false;
            super.field9473 = false;
            this.method3435(-70);
            this.method3429(arg0 ^ 19770, 2);
            super.field9466 = 1;
            if (arg1) {
                class614.method3500(-117);
            }
            class456.method2668(arg0 + -19516);
        }
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)I", line = 243)
    public final int method3434(int arg0) {
        ++field8708;
        boolean var2 = false;
        boolean var3 = false;
        if (arg0 != 1) {
            this.method3433(-128, true);
        }
        boolean var4 = false;
        if (class61.field978.field3004 && !class61.field978.field2983) {
            if (class226.field2996.startsWith("win")) {
                var3 = true;
                if (!class226.field2984.startsWith("amd64") && !class226.field2984.startsWith("x86_64")) {
                    var2 = true;
                }
                var4 = true;
            } else {
                var3 = true;
            }
        }
        if (this.field8717) {
            var3 = false;
        }
        if (this.field8709) {
            var2 = false;
        }
        if (this.field8711) {
            var4 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method3438(true);
        } else {
            int var5 = -1;
            int var6 = -1;
            int var7 = -1;
            if (var2) {
                try {
                    var5 = class388.method2394(true, 1000, 2);
                } catch (Exception var16) {
                }
            }
            if (var4) {
                try {
                    var7 = class388.method2394(true, 1000, 3);
                    if (class62.field996 == 3) {
                        class658 var8 = class332.field4821.method683();
                        long var9 = 281474976710655L & var8.field9400;
                        int var11 = var8.field9401;
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
                    var6 = class388.method2394(true, 1000, 1);
                } catch (Exception var14) {
                }
            }
            if (var5 == -1 && var6 == -1 && var7 == -1) {
                return this.method3438(true);
            } else {
                int var12 = (int) ((float) var7 * 1.1F);
                int var13 = (int) ((float) var6 * 1.1F);
                if (~var5 < ~var12 && ~var13 > ~var5) {
                    return this.method3443(arg0 + 1916, var5);
                } else {
                    return var13 >= var12 ? this.method3432(var13, 1, -125) : this.method3432(var12, 3, arg0 ^ -128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lew;)V", line = 1055)
    public class603(class226 arg0) {
        super.field9466 = 3;
        super.field9501 = 3;
        this.method3436(true, (byte) -116);
        super.field9496 = false;
        super.field9507 = 127;
        super.field9479 = 127;
        super.field9467 = true;
        super.field9471 = 127;
        super.field9480 = true;
        super.field9490 = 0;
        super.field9487 = true;
        super.field9493 = 2;
        super.field9497 = true;
        super.field9478 = 0;
        super.field9485 = 0;
        super.field9492 = 0;
        super.field9484 = true;
        super.field9506 = true;
        super.field9486 = 127;
        super.field9495 = 127;
        super.field9503 = 1;
        super.field9468 = true;
        super.field9505 = 0;
        super.field9504 = true;
        super.field9482 = true;
        super.field9491 = true;
        if (class190.field2576 < 96) {
            class403.method2486((byte) 96, 0);
        } else {
            class403.method2486((byte) 111, 2);
        }
        super.field9476 = class318.field4624 == 1 ? 2 : 4;
        super.field9481 = 0;
        super.field9494 = false;
        super.field9475 = true;
        super.field9489 = 0;
        super.field9508 = true;
        super.field9483 = 2;
        super.field9474 = 2;
        super.field9498 = 0;
        super.field9499 = false;
        super.field9473 = false;
        class568 var2 = null;
        try {
            class254 var3 = arg0.method1416(true, 114, "");
            while (~var3.field3311 == -1) {
                class687.method3846(1L, -88);
            }
            if (var3.field3311 == 1) {
                var2 = (class568) var3.field3307;
                byte[] var4 = new byte[(int) var2.method3272(false)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method3269(var4.length + -var5, var4, (byte) -14, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method3440((byte) -19, new class540(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method3271((byte) -117);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V", line = 421)
    private final void method3435(int arg0) {
        ++field8699;
        if (~class318.field4624 >= -2) {
            super.field9476 = 2;
        } else {
            super.field9476 = 4;
        }
        if (arg0 > -35) {
            method3430(34);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZB)V", line = 444)
    public final void method3436(boolean arg0, byte arg1) {
        ++field8706;
        if (arg1 <= -79) {
            super.field9472 = arg0;
            if (class60.field965 != null) {
                class60.field965.method2594(!this.method3439(class62.field996, false), (byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)I", line = 459)
    public final int method3437(boolean arg0, int arg1) {
        ++field8720;
        if (arg0) {
            return -51;
        } else if (class614.method3503(arg1, !arg0) && !class497.method2834((byte) 114, class264.field3451)) {
            return ~class190.field2576 > -97 && class500.method2854((byte) 125, arg1) && ~super.field9489 == -1 ? 1 : super.field9489;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)I", line = 483)
    private final int method3438(boolean arg0) {
        if (!arg0) {
            return -72;
        } else {
            ++field8718;
            byte var2;
            if (class190.field2576 < 96) {
                var2 = 1;
                this.method3433(19771, true);
            } else {
                int var3 = class658.method3711((byte) -97);
                if (var3 <= 100) {
                    this.method3441((byte) 80);
                    var2 = 4;
                } else if (var3 <= 500) {
                    var2 = 3;
                    this.method3426((byte) 19);
                } else if (var3 <= 1000) {
                    var2 = 2;
                    this.method3425(118);
                } else {
                    this.method3433(19771, true);
                    var2 = 1;
                }
            }
            if (class62.field996 != 0) {
                super.field9483 = 0;
                class409.method2509(512, 0);
            }
            this.method3442(class61.field978, 123);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(IZ)Z", line = 551)
    public final boolean method3439(int arg0, boolean arg1) {
        ++field8710;
        if (arg1) {
            field8721 = null;
        }
        return ~arg0 == -1 && !this.field8700 ? super.field9472 : true;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLgk;)V", line = 567)
    private final void method3440(byte arg0, class540 arg1) {
        ++field8697;
        if (arg1.field7952.length + -arg1.field7956 >= 1) {
            int var3 = arg1.method3115(29871);
            if (var3 >= 0 && var3 <= 22) {
                byte var4;
                if (~var3 == -23) {
                    var4 = 45;
                } else if (var3 == 21) {
                    var4 = 44;
                } else if (var3 != 20) {
                    if (~var3 != -20) {
                        if (var3 != 18) {
                            if (~var3 == -18) {
                                var4 = 40;
                            } else if (~var3 == -17) {
                                var4 = 38;
                            } else if (var3 != 15) {
                                if (var3 == 14) {
                                    var4 = 36;
                                } else if (~var3 != -14) {
                                    if (~var3 != -13) {
                                        if (~var3 == -12) {
                                            var4 = 33;
                                        } else if (var3 == 10) {
                                            var4 = 32;
                                        } else if (var3 != 9) {
                                            if (~var3 == -9) {
                                                var4 = 30;
                                            } else if (var3 == 7) {
                                                var4 = 29;
                                            } else if (~var3 == -7) {
                                                var4 = 28;
                                            } else if (var3 != 5) {
                                                if (~var3 == -5) {
                                                    var4 = 24;
                                                } else if (var3 != 3) {
                                                    if (~var3 == -3) {
                                                        var4 = 22;
                                                    } else if (~var3 != -2) {
                                                        var4 = 19;
                                                    } else {
                                                        var4 = 23;
                                                    }
                                                } else {
                                                    var4 = 23;
                                                }
                                            } else {
                                                var4 = 28;
                                            }
                                        } else {
                                            var4 = 31;
                                        }
                                    } else {
                                        var4 = 34;
                                    }
                                } else {
                                    var4 = 35;
                                }
                            } else {
                                var4 = 37;
                            }
                        } else {
                            var4 = 41;
                        }
                    } else {
                        var4 = 42;
                    }
                } else {
                    var4 = 43;
                }
                if (arg1.field7952.length + -arg1.field7956 >= var4) {
                    super.field9501 = arg1.method3115(29871);
                    if (super.field9501 >= 1) {
                        if (~super.field9501 < -5) {
                            super.field9501 = 4;
                        }
                    } else {
                        super.field9501 = 1;
                    }
                    this.method3436(arg1.method3115(29871) == 1, (byte) -127);
                    super.field9482 = ~arg1.method3115(29871) == -2;
                    super.field9480 = ~arg1.method3115(29871) == -2;
                    super.field9484 = arg1.method3115(arg0 ^ -29886) == 1;
                    super.field9503 = arg1.method3115(29871) != 1 ? 0 : 1;
                    super.field9467 = arg1.method3115(arg0 ^ -29886) == 1;
                    super.field9497 = ~arg1.method3115(29871) == -2;
                    super.field9506 = ~arg1.method3115(29871) == -2;
                    super.field9493 = arg1.method3115(29871);
                    if (~super.field9493 < -3) {
                        super.field9493 = 2;
                    }
                    if (var3 >= 17) {
                        super.field9492 = arg1.method3115(29871);
                    }
                    if (arg0 == -19) {
                        if (var3 >= 2) {
                            super.field9468 = ~arg1.method3115(arg0 ^ -29886) == -2;
                            if (~var3 <= -18) {
                                super.field9496 = ~arg1.method3115(arg0 ^ -29886) == -2;
                            }
                        } else {
                            super.field9468 = ~arg1.method3115(arg0 + 29890) == -2;
                            arg1.method3115(29871);
                        }
                        super.field9491 = arg1.method3115(29871) == 1;
                        super.field9487 = ~arg1.method3115(29871) == -2;
                        super.field9478 = arg1.method3115(29871);
                        if (super.field9478 > 2) {
                            super.field9478 = 2;
                        }
                        super.field9485 = super.field9478;
                        super.field9504 = ~arg1.method3115(arg0 + 29890) == -2;
                        super.field9495 = arg1.method3115(29871);
                        if (~super.field9495 < -128) {
                            super.field9495 = 127;
                        }
                        if (~var3 <= -21) {
                            super.field9479 = arg1.method3115(arg0 ^ -29886);
                            if (~super.field9479 < -128) {
                                super.field9479 = 127;
                            }
                        } else {
                            super.field9479 = super.field9495;
                        }
                        super.field9471 = arg1.method3115(29871);
                        super.field9507 = arg1.method3115(29871);
                        if (~super.field9507 < -128) {
                            super.field9507 = 127;
                        }
                        if (~var3 > -22) {
                            super.field9486 = super.field9471;
                        } else {
                            super.field9486 = arg1.method3115(29871);
                            if (~super.field9486 < -128) {
                                super.field9486 = 127;
                            }
                        }
                        if (var3 >= 1) {
                            super.field9505 = arg1.method3169(26488);
                            super.field9490 = arg1.method3169(26488);
                        }
                        if (var3 >= 3 && ~var3 > -7) {
                            arg1.method3115(29871);
                        }
                        if (~var3 <= -5) {
                            int var5 = arg1.method3115(29871);
                            if (var5 < 0 || ~var5 < -3) {
                                var5 = 0;
                            }
                            if (class190.field2576 < 96) {
                                var5 = 0;
                            }
                            class403.method2486((byte) 76, var5);
                        }
                        if (~var3 <= -6) {
                            super.field9498 = arg1.method3160(false);
                        }
                        int var6 = 0;
                        if (var3 >= 6) {
                            super.field9474 = var6 = arg1.method3115(29871);
                        }
                        if (super.field9474 != 1 && super.field9474 != 2) {
                            super.field9474 = 2;
                        }
                        if (~var3 <= -8) {
                            super.field9494 = arg1.method3115(29871) == 1;
                        }
                        if (var3 >= 8) {
                            super.field9499 = ~arg1.method3115(29871) == -2;
                        }
                        if (var3 >= 9) {
                            super.field9481 = arg1.method3115(29871);
                        }
                        if (~super.field9481 > -1 || ~super.field9481 < ~class236.method1450(class190.field2576, arg0 + 102)) {
                            super.field9481 = 0;
                        }
                        if (~var3 <= -11) {
                            super.field9473 = ~arg1.method3115(arg0 + 29890) != -1;
                        }
                        if (~var3 <= -12) {
                            super.field9508 = ~arg1.method3115(29871) != -1;
                        }
                        if (var3 >= 12) {
                            super.field9503 = arg1.method3115(29871);
                        }
                        if (super.field9503 < 0 || super.field9503 > 2) {
                            super.field9503 = 1;
                        }
                        if (var3 >= 13) {
                            super.field9475 = arg1.method3115(29871) == 1;
                        }
                        if (~var3 <= -15) {
                            super.field9483 = arg1.method3115(29871);
                        } else if (var6 == 0) {
                            super.field9483 = 2;
                        } else {
                            super.field9483 = 1;
                        }
                        if (super.field9483 < 0 || super.field9483 > 5) {
                            super.field9483 = 2;
                        }
                        if (~var3 <= -16) {
                            super.field9476 = arg1.method3115(arg0 ^ -29886);
                            if (super.field9476 < 0 || ~super.field9476 < -5) {
                                super.field9476 = class318.field4624 != 1 ? 4 : 2;
                            }
                        }
                        if (~var3 <= -17) {
                            super.field9465 = arg1.method3115(29871) == 1;
                            try {
                                if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                    super.field9465 = false;
                                }
                            } catch (Throwable var7) {
                            }
                        }
                        if (~var3 > -18 && super.field9483 == 0) {
                            super.field9483 = 2;
                        }
                        if (~var3 <= -19) {
                            super.field9466 = arg1.method3115(29871);
                            if (~super.field9466 > -1 || super.field9466 > 4) {
                                super.field9466 = 0;
                            }
                        }
                        if (var3 < 19) {
                            if (super.field9466 != 1 && ~super.field9466 != -3) {
                                if (super.field9466 == 3) {
                                    super.field9489 = 1;
                                } else {
                                    super.field9489 = 0;
                                }
                            } else {
                                super.field9489 = 2;
                            }
                        } else {
                            super.field9489 = arg1.method3115(29871);
                        }
                        if (~var3 <= -23) {
                            super.field9502 = arg1.method3115(29871);
                        }
                        if (~super.field9483 == -1 && ~class190.field2576 > -97 && super.field9466 != 1 && super.field9466 != 0) {
                            this.method3433(19771, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(B)V", line = 916)
    public final void method3441(byte arg0) {
        this.method3436(true, (byte) -87);
        ++field8719;
        super.field9496 = true;
        super.field9493 = super.field9492 = 2;
        super.field9506 = true;
        super.field9491 = true;
        super.field9503 = 1;
        super.field9482 = true;
        super.field9465 = true;
        super.field9478 = super.field9485 = 0;
        super.field9497 = true;
        super.field9487 = true;
        super.field9467 = true;
        super.field9484 = true;
        super.field9468 = true;
        super.field9480 = true;
        if (class190.field2576 > 95) {
            class403.method2486((byte) 92, 2);
        } else {
            class403.method2486((byte) 120, 0);
        }
        if (arg0 <= 61) {
            this.method3429(-42, -64);
        }
        super.field9473 = false;
        super.field9481 = 0;
        super.field9475 = true;
        this.method3435(-75);
        this.method3429(1, 0);
        super.field9466 = 4;
        class614.method3500(-119);
        class456.method2668(255);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lew;I)V", line = 957)
    public final void method3442(class226 arg0, int arg1) {
        ++field8692;
        class568 var3 = null;
        try {
            class254 var4 = arg0.method1416(true, 119, "");
            while (~var4.field3311 == -1) {
                class687.method3846(1L, -32);
            }
            if (arg1 < 103) {
                return;
            }
            if (var4.field3311 == 1) {
                var3 = (class568) var4.field3307;
                class540 var5 = new class540(class415.method2528(-1));
                this.method3787(72, var5);
                var3.method3273(0, var5.field7956, var5.field7952, true);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method3271((byte) -76);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(II)I", line = 1009)
    private final int method3443(int arg0, int arg1) {
        ++field8712;
        byte var3;
        if (arg1 <= 12000) {
            if (arg1 > 5000) {
                this.method3426((byte) 15);
                var3 = 3;
            } else if (~arg1 >= -2001) {
                var3 = 1;
                this.method3433(19771, true);
            } else {
                this.method3425(97);
                var3 = 2;
            }
        } else {
            this.method3441((byte) 81);
            var3 = 4;
        }
        if (~class62.field996 != -3) {
            super.field9483 = 2;
            class409.method2509(arg0 + -1405, 2);
        }
        this.method3442(class61.field978, arg0 + -1794);
        return arg0 != 1917 ? -24 : var3;
    }
}
