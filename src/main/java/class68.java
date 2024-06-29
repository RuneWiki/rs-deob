import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class68 extends class34 {

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    private int field1125 = 12288;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    private int field1126 = 0;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    private int field1121 = 0;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    private int field1128 = 2048;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    private int field1122 = 4096;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    private int field1133 = 2048;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    private int field1132 = 8192;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "Z")
    public static boolean field1119 = false;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)Z")
    private final boolean method537(int arg0, int arg1, int arg2) {
        int var4 = (arg0 - arg2) * this.field1125 >> 12;
        int var5 = class21.field356[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1125;
        ++field1136;
        int var7 = (var6 << 12) / this.field1132;
        if (arg1 <= 19) {
            return true;
        } else {
            int var8 = this.field1122 * var7 >> 12;
            return ~(arg2 - -arg0) > ~var8 && -var8 < arg0 + arg2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)Z")
    public static final boolean method538(byte arg0) {
        ++field1123;
        class156 var1 = class156.field2281;
        synchronized (class156.field2281) {
            if (~class64.field1074 == ~class128.field1890) {
                return false;
            } else {
                class22.field365 = class54.field861[class128.field1890];
                class249.field3867 = class216.field3315[class128.field1890];
                class128.field1890 = 127 & class128.field1890 + 1;
                int var3 = -13 % ((-44 - arg0) / 63);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(III)Z")
    private final boolean method539(int arg0, int arg1, int arg2) {
        int var4 = (arg0 + arg1) * this.field1125 >> 12;
        int var5 = class21.field356[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1125;
        int var7 = (var6 << 12) / this.field1132;
        ++field1124;
        if (arg2 != 0) {
            return true;
        } else {
            int var8 = this.field1122 * var7 >> 12;
            return ~(-arg1 + arg0) > ~var8 && arg0 - arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIII)V")
    public static final void method540(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field1118;
        if (class176.method1165(arg3, -31001)) {
            class127.method882(arg0, (byte) -89, class275.field4236[arg3], arg4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)V")
    public static final void method541(byte arg0) {
        ++field1120;
        class151.field2206.method940(73);
        class181.field2629.method940(18);
        if (arg0 <= 104) {
            field1119 = true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field1129;
        if (arg0 <= 75) {
            this.field1122 = -23;
        }
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int var4 = class199.field2985[arg1] - 2048;
            for (int var5 = 0; ~var5 > ~class226.field3527; ++var5) {
                int var6 = class112.field1716[var5] + -2048;
                int var7 = this.field1126 + var6;
                int var8 = this.field1121 + var4;
                int var9 = this.field1133 + var6;
                int var10 = ~var8 <= 2047 ? var8 : var8 + 4096;
                int var11 = var10 <= 2048 ? var10 : var10 + -4096;
                int var12 = var7 < -2048 ? var7 - -4096 : var7;
                int var13 = this.field1128 + var4;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var12 > 2048 ? var12 - 4096 : var12;
                int var16 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var17 = ~var9 > 2047 ? var9 - -4096 : var9;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method537(var11, 60, var18) && !this.method539(var16, var15, 0) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class68() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(B)V")
    public static final void method542(byte arg0) {
        int var1 = 33 / ((40 - arg0) / 52);
        class286.field4383.method944(65535);
        ++field1127;
        class12.field183.method944(65535);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)Lje;")
    public static final class34 method543(int arg0, byte arg1) {
        if (arg1 >= -55) {
            method543(-61, (byte) 82);
        }
        ++field1130;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (arg0 != 8) {
                                            if (~arg0 != -10) {
                                                if (arg0 != 10) {
                                                    if (~arg0 != -12) {
                                                        if (~arg0 != -13) {
                                                            if (arg0 != 13) {
                                                                if (~arg0 != -15) {
                                                                    if (arg0 != 15) {
                                                                        if (arg0 != 16) {
                                                                            if (arg0 != 17) {
                                                                                if (arg0 != 18) {
                                                                                    if (~arg0 != -20) {
                                                                                        if (~arg0 != -21) {
                                                                                            if (~arg0 != -22) {
                                                                                                if (~arg0 != -23) {
                                                                                                    if (~arg0 != -24) {
                                                                                                        if (~arg0 != -25) {
                                                                                                            if (~arg0 != -26) {
                                                                                                                if (~arg0 != -27) {
                                                                                                                    if (arg0 != 27) {
                                                                                                                        if (~arg0 != -29) {
                                                                                                                            if (arg0 != 29) {
                                                                                                                                if (~arg0 != -31) {
                                                                                                                                    if (~arg0 != -32) {
                                                                                                                                        if (~arg0 != -33) {
                                                                                                                                            if (~arg0 != -34) {
                                                                                                                                                if (~arg0 != -35) {
                                                                                                                                                    if (~arg0 != -36) {
                                                                                                                                                        if (arg0 != 36) {
                                                                                                                                                            if (arg0 != 37) {
                                                                                                                                                                if (~arg0 != -39) {
                                                                                                                                                                    return arg0 == 39 ? new class32() : null;
                                                                                                                                                                } else {
                                                                                                                                                                    return new class213();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class68();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class175();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class197();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class185();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class5();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class191();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class166();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class168();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class292();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class17();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class231();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class171();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class56();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class217();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class206();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class124();
                                                                                                }
                                                                                            } else {
                                                                                                return new class214();
                                                                                            }
                                                                                        } else {
                                                                                            return new class273();
                                                                                        }
                                                                                    } else {
                                                                                        return new class7();
                                                                                    }
                                                                                } else {
                                                                                    return new class258();
                                                                                }
                                                                            } else {
                                                                                return new class215();
                                                                            }
                                                                        } else {
                                                                            return new class278();
                                                                        }
                                                                    } else {
                                                                        return new class241();
                                                                    }
                                                                } else {
                                                                    return new class103();
                                                                }
                                                            } else {
                                                                return new class12();
                                                            }
                                                        } else {
                                                            return new class102();
                                                        }
                                                    } else {
                                                        return new class262();
                                                    }
                                                } else {
                                                    return new class202();
                                                }
                                            } else {
                                                return new class117();
                                            }
                                        } else {
                                            return new class277();
                                        }
                                    } else {
                                        return new class13();
                                    }
                                } else {
                                    return new class47();
                                }
                            } else {
                                return new class265();
                            }
                        } else {
                            return new class163();
                        }
                    } else {
                        return new class115();
                    }
                } else {
                    return new class3();
                }
            } else {
                return new class295();
            }
        } else {
            return new class42();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg0 != 6) {
            method542((byte) 115);
        }
        ++field1134;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field1132 = arg2.method423(-126);
                                }
                            } else {
                                this.field1122 = arg2.method423(-123);
                            }
                        } else {
                            this.field1125 = arg2.method423(101);
                        }
                    } else {
                        this.field1128 = arg2.method423(arg0 + 85);
                    }
                } else {
                    this.field1126 = arg2.method423(-92);
                }
            } else {
                this.field1121 = arg2.method423(arg0 + -84);
            }
        } else {
            this.field1133 = arg2.method423(arg0 + 84);
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        int var2 = -107 % ((arg0 - -2) / 43);
        ++field1131;
        class189.method1255((byte) 54);
    }
}
