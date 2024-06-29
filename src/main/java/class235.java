import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class235 extends class49 {

    @OriginalMember(owner = "client!fi", name = "oc", descriptor = "B")
    private byte field3731 = 0;

    @OriginalMember(owner = "client!fi", name = "Ac", descriptor = "I")
    public int field3743 = 255;

    @OriginalMember(owner = "client!fi", name = "qc", descriptor = "I")
    public int field3733 = -1;

    @OriginalMember(owner = "client!fi", name = "pc", descriptor = "Z")
    public boolean field3732 = false;

    @OriginalMember(owner = "client!fi", name = "vc", descriptor = "I")
    public int field3738 = -1;

    @OriginalMember(owner = "client!fi", name = "Gc", descriptor = "I")
    public int field3749 = 0;

    @OriginalMember(owner = "client!fi", name = "Lc", descriptor = "I")
    public int field3754 = -1;

    @OriginalMember(owner = "client!fi", name = "Hc", descriptor = "I")
    public int field3750 = -1;

    @OriginalMember(owner = "client!fi", name = "xc", descriptor = "I")
    public int field3740 = 0;

    @OriginalMember(owner = "client!fi", name = "Mc", descriptor = "I")
    public int field3755 = -1;

    @OriginalMember(owner = "client!fi", name = "Ec", descriptor = "I")
    public int field3747 = 0;

    @OriginalMember(owner = "client!fi", name = "Jc", descriptor = "I")
    public int field3752 = 0;

    @OriginalMember(owner = "client!fi", name = "Oc", descriptor = "I")
    public int field3757 = -1;

    @OriginalMember(owner = "client!fi", name = "wc", descriptor = "I")
    public int field3739 = -1;

    @OriginalMember(owner = "client!fi", name = "Rc", descriptor = "I")
    public int field3760 = 0;

    @OriginalMember(owner = "client!fi", name = "Bc", descriptor = "Z")
    public static boolean field3744 = true;

    @OriginalMember(owner = "client!fi", name = "Ic", descriptor = "Leg;")
    public static class272 field3751 = new class272(16);

    @OriginalMember(owner = "client!fi", name = "Qc", descriptor = "I")
    public static int field3759 = 0;

    @OriginalMember(owner = "client!fi", name = "nc", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!fi", name = "rc", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!fi", name = "tc", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!fi", name = "uc", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!fi", name = "yc", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!fi", name = "zc", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!fi", name = "Cc", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!fi", name = "Fc", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!fi", name = "Kc", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!fi", name = "Pc", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!fi", name = "Sc", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!fi", name = "Dc", descriptor = "Lsf;")
    public class95 field3746;

    @OriginalMember(owner = "client!fi", name = "sc", descriptor = "Ljava/lang/String;")
    public String field3735;

    @OriginalMember(owner = "client!fi", name = "Nc", descriptor = "[Lol;")
    public static class209[] field3756;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)I")
    public final int method390(int arg0) {
        ++field3758;
        int var2 = -51 / ((arg0 - -42) / 40);
        return super.field631;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Z")
    public final boolean method376(int arg0) {
        ++field3736;
        if (arg0 != -11127) {
            this.field3733 = 79;
        }
        return this.field3746 != null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILqc;IIIIIILue;IIIIIII)V")
    private final void method1548(int arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class13 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        int var17 = arg11 * arg11 - -(arg7 * arg7);
        ++field3745;
        if (arg6 != 0) {
            this.field3731 = -86;
        }
        if (var17 >= 16 && ~arg2 <= ~var17) {
            int var18 = 2047 & (int) (325.949D * Math.atan2((double) arg11, (double) arg7));
            class13 var19 = class258.method1692(arg0, super.field613, var18, -10, super.field614, super.field643, arg8);
            if (var19 != null) {
                var19.method85(0, arg4, arg10, arg3, arg15, arg9, arg5, arg12, -1L, arg13, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3742;
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
    public static void method1549(int arg0) {
        field3756 = null;
        field3751 = null;
        if (arg0 != 64) {
            field3751 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lhi;B)V")
    public final void method1550(class264 arg0, byte arg1) {
        arg0.field4195 = 0;
        ++field3737;
        int var3 = arg0.method1779(arg1 + -82);
        int var4 = var3 & 1;
        int var5 = super.method385((byte) -117);
        this.method389(((59 & var3) >> 3) - -1, (byte) 98);
        this.field3731 = (byte) ((247 & var3) >> 6);
        int var6 = -1;
        super.field614 += 64 * (-var5 + this.method385((byte) 115));
        int[] var7 = new int[12];
        super.field613 += 64 * (this.method385((byte) -54) + -var5);
        this.field3755 = arg0.method1767(arg1 ^ 16711686);
        boolean var8 = (var3 & 4) != 0;
        this.field3750 = arg0.method1767(16711680);
        this.field3749 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg0.method1779(-53);
            if (~var10 == -1) {
                var7[var9] = 0;
            } else {
                int var11 = arg0.method1779(arg1 ^ -128);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && ~var12 == -65536) {
                    var6 = arg0.method1777(-107);
                    this.field3749 = arg0.method1779(-51);
                    break;
                }
                if (var12 >= 32768) {
                    int var25 = class129.field2166[var12 - 32768];
                    var7[var9] = class45.method348(var25, 1073741824);
                    int var26 = class64.method514(var25, 0).field3394;
                    if (var26 != 0) {
                        this.field3749 = var26;
                    }
                } else {
                    var7[var9] = class45.method348(Integer.MIN_VALUE, var12 + -256);
                }
            }
        }
        int[] var13 = new int[5];
        if (arg1 != 6) {
            field3756 = null;
        }
        for (int var14 = 0; ~var14 > -6; ++var14) {
            int var24 = arg0.method1779(-62);
            if (var24 < 0 || ~class119.field2015[var14].length >= ~var24) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        super.field631 = arg0.method1777(-102);
        long var15 = arg0.method1740((byte) 127);
        this.field3735 = class94.method659(var15, (byte) -103);
        this.field3760 = arg0.method1779(arg1 + -78);
        if (var8) {
            this.field3747 = arg0.method1777(-99);
            this.field3739 = -1;
            this.field3740 = this.field3760;
        } else {
            this.field3747 = 0;
            this.field3740 = arg0.method1779(arg1 ^ -127);
            this.field3739 = arg0.method1779(-122);
            if (this.field3739 == 255) {
                this.field3739 = -1;
            }
        }
        int var17 = this.field3752;
        this.field3752 = arg0.method1779(arg1 ^ -85);
        if (~this.field3752 == -1) {
            class198.method1333(this, false);
        } else {
            int var18 = this.field3754;
            int var19 = this.field3738;
            int var20 = this.field3733;
            int var21 = this.field3757;
            int var22 = this.field3743;
            this.field3754 = arg0.method1777(-89);
            this.field3733 = arg0.method1777(-91);
            this.field3738 = arg0.method1777(-48);
            this.field3757 = arg0.method1777(-86);
            this.field3743 = arg0.method1779(arg1 ^ -49);
            if (this.field3752 != var17 || this.field3754 != var18 || this.field3733 != var20 || this.field3738 != var19 || this.field3757 != var21 || ~this.field3743 != ~var22) {
                class73.method562(arg1 + -15085, this);
            }
        }
        if (this.field3746 == null) {
            this.field3746 = new class95();
        }
        int var23 = this.field3746.field1438;
        this.field3746.method676(Integer.MIN_VALUE, var13, ~var4 == -2, super.field631, var7, var6);
        if (var6 != var23) {
            super.field614 = super.field610[0] * 128 + this.method385((byte) 71) * 64;
            super.field613 = super.field692[0] * 128 - -(64 * this.method385((byte) -61));
        }
        if (super.field669 != null) {
            super.field669.method30();
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)I")
    public final int method385(byte arg0) {
        ++field3734;
        if (this.field3746 != null && this.field3746.field1438 != -1) {
            return class104.method741((byte) -128, this.field3746.field1438).field4262;
        } else {
            int var2 = -40 % ((11 - arg0) / 60);
            return super.method385((byte) 112);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIIIJILqc;)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class4 arg10) {
        ++field3730;
        if (this.field3746 != null) {
            class21 var13 = ~super.field672 != 0 && super.field642 == 0 ? class267.method1812((byte) 89, super.field672) : null;
            class21 var14 = ~super.field659 == 0 || this.field3732 || ~super.field659 == ~this.method375(0).field2862 && var13 != null ? null : class267.method1812((byte) 89, super.field659);
            class13 var15 = this.field3746.method675(var14, super.field681, super.field609, var13, super.field658, (byte) 121, true, super.field667, super.field668, super.field654, super.field623);
            int var16 = class225.method1490((byte) -89);
            if (~class284.field4546 != -1 && ~var16 > -51) {
                int var17 = -var16 + 50;
                while (var17 > class289.field4624) {
                    class234.field3727[class289.field4624] = new byte[102400];
                    ++class289.field4624;
                }
                while (class289.field4624 > var17) {
                    --class289.field4624;
                    class234.field3727[class289.field4624] = null;
                }
            }
            if (var15 != null) {
                super.field677 = var15.method88();
                if (class22.field270 && (~this.field3746.field1438 == 0 || class104.method741((byte) -96, this.field3746.field1438).field4285)) {
                    class13 var18 = class200.method1347(160, super.field613, var14 != null ? super.field609 : super.field681, 0, 1, var14 == null ? var13 : var14, 6, 240, var15, super.field643, super.field614, super.field616, arg0, 0);
                    var18.method85(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class4) null);
                }
                if (class197.field3179 == this) {
                    for (int var19 = class293.field4649.length + -1; ~var19 <= -1; --var19) {
                        class115 var20 = class293.field4649[var19];
                        if (var20 != null && var20.field1972 != -1) {
                            if (var20.field1967 == 1 && ~var20.field1960 <= -1 && class198.field3193.length > var20.field1960) {
                                class275 var21 = class198.field3193[var20.field1960];
                                if (var21 != null) {
                                    int var22 = var21.field614 / 32 + -(class197.field3179.field614 / 32);
                                    int var23 = var21.field613 / 32 + -(class197.field3179.field613 / 32);
                                    this.method1548(var20.field1972, (class4) null, 360000, arg3, arg1, arg6, 0, var23, var15, arg5, arg2, var22, arg7, arg9, arg0, arg4);
                                }
                            }
                            if (~var20.field1967 == -3) {
                                int var24 = (-class296.field4685 + var20.field1963) * 4 - class197.field3179.field614 / 32 + 2;
                                int var25 = (-class93.field1321 + var20.field1973) * 4 + -(class197.field3179.field613 / 32) + 2;
                                int var26 = var20.field1975 * 4;
                                int var27 = var26 * var26;
                                this.method1548(var20.field1972, (class4) null, var27, arg3, arg1, arg6, 0, var25, var15, arg5, arg2, var24, arg7, arg9, arg0, arg4);
                            }
                            if (~var20.field1967 == -11 && ~var20.field1960 <= -1 && ~class260.field4141.length < ~var20.field1960) {
                                class235 var28 = class260.field4141[var20.field1960];
                                if (var28 != null) {
                                    int var29 = var28.field613 / 32 + -(class197.field3179.field613 / 32);
                                    int var30 = var28.field614 / 32 - class197.field3179.field614 / 32;
                                    this.method1548(var20.field1972, (class4) null, 360000, arg3, arg1, arg6, 0, var29, var15, arg5, arg2, var30, arg7, arg9, arg0, arg4);
                                }
                            }
                        }
                    }
                }
                this.method388((byte) 106, var15);
                this.method378(arg0, var15, (byte) -73);
                class13 var31 = null;
                if (!this.field3732 && ~super.field634 != 0 && ~super.field694 != 0) {
                    class66 var32 = class271.method1826(super.field634, (byte) 102);
                    var31 = var32.method526(super.field694, super.field686, false, super.field615);
                    if (var31 != null) {
                        var31.method76(0, -super.field661, 0);
                        if (var32.field927) {
                            if (class179.field2895 != 0) {
                                var31.method91(class179.field2895);
                            }
                            if (class102.field1541 != 0) {
                                var31.method93(class102.field1541);
                            }
                            if (class222.field3533 != 0) {
                                var31.method76(0, class222.field3533, 0);
                            }
                        }
                    }
                }
                class13 var33 = null;
                if (!this.field3732 && super.field688 != null) {
                    if (~class9.field141 <= ~super.field630) {
                        super.field688 = null;
                    }
                    if (~super.field674 >= ~class9.field141 && class9.field141 < super.field630) {
                        if (!(super.field688 instanceof class287)) {
                            var33 = (class13) super.field688;
                        } else {
                            var33 = (class13) ((class287) super.field688).method1921((byte) 48);
                        }
                        var33.method76(-super.field614 + super.field622, super.field646 - super.field643, super.field662 - super.field613);
                        if (super.field691 == 512) {
                            var33.method92();
                        } else if (~super.field691 == -1025) {
                            var33.method97();
                        } else if (super.field691 == 1536) {
                            var33.method90();
                        }
                    }
                }
                if (var31 != null) {
                    var15 = ((class90) var15).method642(var31);
                }
                if (var33 != null) {
                    var15 = ((class90) var15).method642(var33);
                }
                var15.field169 = true;
                var15.method85(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field669);
                if (var33 != null) {
                    if (super.field691 == 512) {
                        var33.method90();
                    } else if (super.field691 == 1024) {
                        var33.method97();
                    } else if (super.field691 == 1536) {
                        var33.method92();
                    }
                    var33.method76(-super.field622 + super.field614, -super.field646 + super.field643, -super.field662 + super.field613);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZZI)V")
    public final void method1551(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field3741;
        super.method379(arg3, (byte) -94, this.method385((byte) 116), arg1, arg0);
        if (arg2) {
            this.method1551(-71, false, true, 48);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()I")
    public final int method88() {
        ++field3748;
        return super.field677;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method1552(byte arg0) {
        ++field3753;
        String var2 = this.field3735;
        if (class39.field476 != null) {
            var2 = class39.field476[this.field3731] + var2;
        }
        if (arg0 > -96) {
            this.field3731 = -33;
        }
        if (class92.field1311 != null) {
            var2 = var2 + class92.field1311[this.field3731];
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V")
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3761;
    }
}
