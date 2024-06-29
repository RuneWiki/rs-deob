import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class96 extends class200 {

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    private int field1692 = -1;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "Lid;")
    public static class149 field1687 = class60.method382("vert:", (byte) 81);

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "[S")
    public static short[] field1693 = new short[256];

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field1690 = 0;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "Lid;")
    private static class149 field1689 = class60.method382("cyan:", (byte) 2);

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "Lid;")
    public static class149 field1696 = class60.method382(")2", (byte) 85);

    @OriginalMember(owner = "client!la", name = "jb", descriptor = "[I")
    public static int[] field1703 = new int[8];

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "Lid;")
    public static class149 field1699 = field1689;

    @OriginalMember(owner = "client!la", name = "ib", descriptor = "Lid;")
    public static class149 field1702 = class60.method382(" <col=ffffff>", (byte) 47);

    @OriginalMember(owner = "client!la", name = "X", descriptor = "Lid;")
    public static class149 field1691 = field1689;

    @OriginalMember(owner = "client!la", name = "nb", descriptor = "[I")
    public static int[] field1707 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!la", name = "N", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!la", name = "gb", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!la", name = "hb", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!la", name = "kb", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!la", name = "lb", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "client!la", name = "mb", descriptor = "[I")
    public int[] field1706;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Lnf;")
    public static final class158 method695(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4056;
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)V")
    public static final void method696(int arg0) {
        class259.field4552.method1290((byte) 43);
        ++field1686;
        if (arg0 != -4802) {
            method701(100, 47);
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)V")
    public static final void method697(int arg0, int arg1) {
        ++field1688;
        class129.field2285 = arg1;
        class65.field1159 = -1;
        class106.field1840 = arg0;
        class197.method1346(98);
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)Z")
    public final boolean method698(int arg0) {
        if (arg0 != -21347) {
            this.field1692 = -49;
        }
        ++field1694;
        if (this.field1706 != null) {
            return true;
        } else if (~this.field1692 <= -1) {
            class46 var2 = ~class177.field3231 <= -1 ? class249.method1729(-121, class64.field1152, class177.field3231, this.field1692) : class255.method1759(arg0 + 21293, this.field1692, class64.field1152);
            var2.method269();
            this.field1682 = var2.field3398;
            this.field1705 = var2.field3399;
            this.field1706 = var2.field693;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(I)V")
    public static void method699(int arg0) {
        field1696 = null;
        field1699 = null;
        field1691 = null;
        field1702 = null;
        field1693 = null;
        field1707 = null;
        field1703 = null;
        field1687 = null;
        if (arg0 != 8) {
            field1687 = null;
        }
        field1689 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field1692 = arg0.method485(-2386);
        }
        ++field1684;
        if (!arg1) {
            method697(-118, -55);
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)I")
    public final int method700(byte arg0) {
        int var2 = 53 / ((arg0 - -11) / 59);
        ++field1697;
        return this.field1692;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)[[I")
    public int[][] method24(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field3632.method965(arg1, 54);
            if (super.field3632.field2550 && this.method698(-21347)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = this.field1705 * (class276.field4934 == this.field1682 ? arg1 : this.field1682 * arg1 / class276.field4934);
                if (~class137.field2515 != ~this.field1705) {
                    for (int var8 = 0; class137.field2515 > var8; ++var8) {
                        int var9 = this.field1705 * var8 / class137.field2515;
                        int var10 = this.field1706[var7 + var9];
                        var6[var8] = class136.method953(var10 << 4, 4080);
                        var5[var8] = class136.method953(var10 >> 4, 4080);
                        var4[var8] = class136.method953(16711680, var10) >> 12;
                    }
                } else {
                    for (int var11 = 0; class137.field2515 > var11; ++var11) {
                        int var12 = this.field1706[var7++];
                        var6[var11] = class136.method953(255, var12) << 4;
                        var5[var11] = class136.method953(var12, 65280) >> 4;
                        var4[var11] = class136.method953(var12 >> 12, 4080);
                    }
                }
            }
            ++field1701;
            return var3;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(II)Lbf;")
    public static final class200 method701(int arg0, int arg1) {
        if (arg0 >= -111) {
            return null;
        } else {
            ++field1683;
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (arg1 != 6) {
                                        if (~arg1 != -8) {
                                            if (arg1 != 8) {
                                                if (arg1 != 9) {
                                                    if (arg1 != 10) {
                                                        if (arg1 != 11) {
                                                            if (~arg1 != -13) {
                                                                if (arg1 != 13) {
                                                                    if (~arg1 != -15) {
                                                                        if (~arg1 != -16) {
                                                                            if (arg1 != 16) {
                                                                                if (~arg1 != -18) {
                                                                                    if (~arg1 != -19) {
                                                                                        if (arg1 != 19) {
                                                                                            if (arg1 != 20) {
                                                                                                if (~arg1 != -22) {
                                                                                                    if (~arg1 != -23) {
                                                                                                        if (~arg1 != -24) {
                                                                                                            if (arg1 != 24) {
                                                                                                                if (arg1 != 25) {
                                                                                                                    if (arg1 != 26) {
                                                                                                                        if (~arg1 != -28) {
                                                                                                                            if (~arg1 != -29) {
                                                                                                                                if (arg1 != 29) {
                                                                                                                                    if (arg1 != 30) {
                                                                                                                                        if (~arg1 != -32) {
                                                                                                                                            if (arg1 != 32) {
                                                                                                                                                if (~arg1 != -34) {
                                                                                                                                                    if (arg1 != 34) {
                                                                                                                                                        if (~arg1 != -36) {
                                                                                                                                                            if (arg1 != 36) {
                                                                                                                                                                if (~arg1 != -38) {
                                                                                                                                                                    if (arg1 != 38) {
                                                                                                                                                                        return arg1 == 39 ? new class96() : null;
                                                                                                                                                                    } else {
                                                                                                                                                                        return new class232();
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return new class154();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class14();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class41();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class35();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class102();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class146();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class253();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class70();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class233();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class26();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class73();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class101();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class34();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class141();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class5();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class285();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class151();
                                                                                                }
                                                                                            } else {
                                                                                                return new class62();
                                                                                            }
                                                                                        } else {
                                                                                            return new class44();
                                                                                        }
                                                                                    } else {
                                                                                        return new class213();
                                                                                    }
                                                                                } else {
                                                                                    return new class97();
                                                                                }
                                                                            } else {
                                                                                return new class191();
                                                                            }
                                                                        } else {
                                                                            return new class183();
                                                                        }
                                                                    } else {
                                                                        return new class91();
                                                                    }
                                                                } else {
                                                                    return new class112();
                                                                }
                                                            } else {
                                                                return new class54();
                                                            }
                                                        } else {
                                                            return new class237();
                                                        }
                                                    } else {
                                                        return new class128();
                                                    }
                                                } else {
                                                    return new class186();
                                                }
                                            } else {
                                                return new class145();
                                            }
                                        } else {
                                            return new class246();
                                        }
                                    } else {
                                        return new class95();
                                    }
                                } else {
                                    return new class193();
                                }
                            } else {
                                return new class118();
                            }
                        } else {
                            return new class275();
                        }
                    } else {
                        return new class248();
                    }
                } else {
                    return new class124();
                }
            } else {
                return new class66();
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIII)V")
    public static final void method702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class141.method987(2, -arg2 + arg1, class15.field220[arg4], arg1 - -arg2, arg0);
        ++field1700;
        int var6 = 0;
        if (arg5 < 88) {
            method695(67, 105, -115);
        }
        int var7 = arg3;
        int var8 = arg2 * arg2;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = arg3 << 1;
        int var12 = var8 << 1;
        int var13 = -((var11 + -1) * var12) + var9;
        int var14 = (1 - var11) * var8 + var10;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) + -3) * var12;
        int var19 = (var6 - -1) * var16;
        int var20 = (arg3 + -1) * var15;
        while (~var7 < -1) {
            if (~var14 > -1) {
                while (var14 < 0) {
                    var14 += var17;
                    ++var6;
                    var17 += var16;
                    var13 += var19;
                    var19 += var16;
                }
            }
            --var7;
            int var21 = -var7 + arg4;
            int var22 = arg4 + var7;
            if (~var13 > -1) {
                ++var6;
                var13 += var19;
                var14 += var17;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var18;
            var14 += -var20;
            var18 -= var15;
            int var23 = arg1 - -var6;
            int var24 = -var6 + arg1;
            var20 -= var15;
            class141.method987(2, var24, class15.field220[var21], var23, arg0);
            class141.method987(2, var24, class15.field220[var22], var23, arg0);
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V")
    public final void method88(byte arg0) {
        ++field1698;
        int var2 = 50 / ((arg0 - -21) / 49);
        super.method88((byte) 106);
        this.field1706 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIZZZ)V")
    public static final void method703(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (arg5) {
            field1689 = null;
        }
        if (arg2 > arg0) {
            int var7 = (arg0 + arg2) / 2;
            int var8 = arg0;
            class208 var9 = class108.field1877[var7];
            class108.field1877[var7] = class108.field1877[arg2];
            class108.field1877[arg2] = var9;
            for (int var10 = arg0; arg2 > var10; ++var10) {
                if (class256.method1768(arg4, var9, arg1, arg6, arg3, class108.field1877[var10], (byte) -64) <= 0) {
                    class208 var11 = class108.field1877[var10];
                    class108.field1877[var10] = class108.field1877[var8];
                    class108.field1877[var8++] = var11;
                }
            }
            class108.field1877[arg2] = class108.field1877[var8];
            class108.field1877[var8] = var9;
            method703(arg0, arg1, var8 - 1, arg3, arg4, arg5, arg6);
            method703(var8 + 1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
        ++field1685;
    }
}
