import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class235 extends class43 {

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    private int field4233 = -1;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "Lmb;")
    public static class132 field4235 = class166.method1092("(Y<)4col>", 117);

    @OriginalMember(owner = "client!wa", name = "lb", descriptor = "Lmb;")
    private static class132 field4250 = class166.method1092("Starting 3d library", 120);

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "Lmb;")
    public static class132 field4247 = field4250;

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "Lkg;")
    public static class115 field4241 = new class115(64);

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    private int field4232;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
    private int field4244;

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!wa", name = "mb", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!wa", name = "nb", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "[I")
    private int[] field4238;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class235() {
        super(0, false);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        if (arg0 != -1893) {
            this.method1487(116);
        }
        ++field4245;
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        if (super.field764.field3960 && this.method1487(-1)) {
            int var4 = this.field4244 * (class42.field689 == this.field4232 ? arg1 : this.field4232 * arg1 / class42.field689);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class131.field2427 != this.field4244) {
                for (int var8 = 0; var8 < class131.field2427; ++var8) {
                    int var9 = this.field4244 * var8 / class131.field2427;
                    int var10 = this.field4238[var4 + var9];
                    var6[var8] = class75.method450(255, var10) << 4;
                    var7[var8] = class75.method450(65280, var10) >> 4;
                    var5[var8] = class75.method450(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class131.field2427; ++var11) {
                    int var12 = this.field4238[var4++];
                    var6[var11] = class75.method450(var12, 255) << 4;
                    var7[var11] = class75.method450(65280, var12) >> 4;
                    var5[var11] = class75.method450(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lii;I)V")
    public static final void method1486(class96 arg0, int arg1) {
        ++field4240;
        int var2 = ~arg0.field1744 != -1 ? arg0.field1744 : arg0.field1830;
        int var3 = arg0.field1833 != 0 ? arg0.field1833 : arg0.field1740;
        class164.method1058(arg0.field1794, arg1 + 853962521, var2, var3, class97.field1866[arg0.field1794 >> 16]);
        if (arg0.field1770 != null) {
            class164.method1058(arg0.field1794, 853933806, var2, var3, arg0.field1770);
        }
        if (arg1 != -28715) {
            field4247 = null;
        }
        class73 var4 = (class73) class55.field927.method806(-1, (long) arg0.field1794);
        if (var4 != null) {
            class167.method1097(var3, 69, var4.field1216, var2);
        }
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)Z")
    private final boolean method1487(int arg0) {
        ++field4234;
        if (this.field4238 != null) {
            return true;
        } else if (arg0 >= ~this.field4233) {
            int var2 = class131.field2427;
            int var3 = class42.field689;
            int var4 = class96.field1745.method485(this.field4233, (byte) 116) ? 64 : 128;
            this.field4238 = class96.field1745.method490(this.field4233, 117);
            this.field4244 = var4;
            this.field4232 = var4;
            class12.method59((byte) 19, var2, var3);
            return this.field4238 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public final void method295(int arg0) {
        super.method295(-123);
        int var2 = 90 / ((8 - arg0) / 38);
        ++field4246;
        this.field4238 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIBII)V")
    public static final void method1488(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field4252;
        class196.field3641 = -1;
        class210.field3862 = -1;
        class56.field953 = class113.field2188 * arg0 / arg1;
        if (arg2 >= -6) {
            method1486((class96) null, 8);
        }
        class157.field2858 = class192.field3586 * arg3 / arg4;
        class31.method222(124);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V")
    public static void method1489(byte arg0) {
        field4235 = null;
        field4250 = null;
        field4247 = null;
        field4241 = null;
        int var1 = 93 % ((arg0 - 13) / 56);
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)I")
    public final int method297(int arg0) {
        if (arg0 != -1) {
            this.field4233 = 77;
        }
        ++field4242;
        return this.field4233;
    }

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)V")
    public static final void method1490(int arg0) {
        ++field4249;
        if (arg0 >= -89) {
            method1486((class96) null, -66);
        }
        try {
            if (class17.field255 == 0) {
                if (class166.field3027 != null) {
                    class166.field3027.method423(true);
                    class166.field3027 = null;
                }
                class17.field255 = 1;
                class48.field820 = false;
                class184.field3384 = 0;
                class136.field2563 = null;
            }
            if (class17.field255 == 1) {
                if (class136.field2563 == null) {
                    class136.field2563 = class189.field3482.method507(field4236, class236.field4261, (byte) -64);
                }
                if (~class136.field2563.field2264 == -3) {
                    throw new IOException();
                }
                if (class136.field2563.field2264 == 1) {
                    class166.field3027 = new class68((Socket) class136.field2563.field2269, class189.field3482);
                    class17.field255 = 2;
                    class136.field2563 = null;
                }
            }
            if (~class17.field255 == -3) {
                long var1 = class81.field1370 = class152.field2780.method867(-27410);
                int var3 = (int) (var1 >> 16 & 31L);
                class64.field1054.field2133 = 0;
                class64.field1054.method747(14, (byte) -77);
                class64.field1054.method747(var3, (byte) -41);
                class166.field3027.method419(-97, class64.field1054.field2157, 0, 2);
                class118.field2241.field2133 = 0;
                class17.field255 = 3;
            }
            if (class17.field255 == 3) {
                if (class105.field1970 != null) {
                    class105.field1970.method948(0);
                }
                if (class194.field3609 != null) {
                    class194.field3609.method948(0);
                }
                int var4 = class166.field3027.method420(true);
                if (class105.field1970 != null) {
                    class105.field1970.method948(0);
                }
                if (class194.field3609 != null) {
                    class194.field3609.method948(0);
                }
                if (var4 != 0) {
                    class58.method386(-19422, var4);
                    return;
                }
                class118.field2241.field2133 = 0;
                class17.field255 = 4;
            }
            if (~class17.field255 == -5) {
                if (~class118.field2241.field2133 > -9) {
                    int var5 = class166.field3027.method424(5000);
                    if (8 - class118.field2241.field2133 < var5) {
                        var5 = -class118.field2241.field2133 + 8;
                    }
                    if (var5 > 0) {
                        class166.field3027.method418(class118.field2241.field2157, (byte) 103, class118.field2241.field2133, var5);
                        class118.field2241.field2133 += var5;
                    }
                }
                if (~class118.field2241.field2133 == -9) {
                    class118.field2241.field2133 = 0;
                    class105.field1968 = class118.field2241.method762((byte) -124);
                    class17.field255 = 5;
                }
            }
            if (~class17.field255 == -6) {
                class64.field1054.field2133 = 0;
                int[] var6 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (Math.random() * 9.9999999E7D), (int) (class105.field1968 >> 32), (int) class105.field1968 };
                class64.field1054.method747(10, (byte) -32);
                class64.field1054.method726((byte) -77, var6[0]);
                class64.field1054.method726((byte) -71, var6[1]);
                class64.field1054.method726((byte) 126, var6[2]);
                class64.field1054.method726((byte) 104, var6[3]);
                class64.field1054.method709(-27341, class152.field2780.method867(-27410));
                class64.field1054.method722(class152.field2785, -1607065512);
                class64.field1054.method721(class92.field1626, 74, class213.field3900);
                class63.field1049.field2133 = 0;
                if (~class95.field1666 == -41) {
                    class63.field1049.method747(18, (byte) -95);
                } else {
                    class63.field1049.method747(16, (byte) -57);
                }
                class63.field1049.method747(129 + class64.field1054.field2133 + class172.method1124(class72.field1202, (byte) 15), (byte) -127);
                class63.field1049.method726((byte) -54, 496);
                class63.field1049.method747(class66.field1096 ? 1 : 0, (byte) -98);
                class241.method1539(class63.field1049, (byte) 25);
                class63.field1049.method722(class72.field1202, -1607065512);
                class63.field1049.method726((byte) 107, class192.field3587);
                class63.field1049.method726((byte) 103, class55.field943.field3003);
                class63.field1049.method726((byte) -48, class161.field2926.field3003);
                class63.field1049.method726((byte) -14, class172.field3220.field3003);
                class63.field1049.method726((byte) 92, class192.field3581.field3003);
                class63.field1049.method726((byte) -16, class139.field2600.field3003);
                class63.field1049.method726((byte) -114, class168.field3077.field3003);
                class63.field1049.method726((byte) 91, class69.field1161.field3003);
                class63.field1049.method726((byte) 92, class139.field2616.field3003);
                class63.field1049.method726((byte) 105, class65.field1068.field3003);
                class63.field1049.method726((byte) -114, class110.field2094.field3003);
                class63.field1049.method726((byte) 88, class62.field1043.field3003);
                class63.field1049.method726((byte) 125, class171.field3196.field3003);
                class63.field1049.method726((byte) 113, class200.field3690.field3003);
                class63.field1049.method726((byte) -28, class94.field1654.field3003);
                class63.field1049.method726((byte) -93, class71.field1199.field3003);
                class63.field1049.method726((byte) -31, class77.field1323.field3003);
                class63.field1049.method726((byte) 94, class101.field1888.field3003);
                class63.field1049.method726((byte) -40, class230.field4144.field3003);
                class63.field1049.method726((byte) -23, class105.field1959.field3003);
                class63.field1049.method726((byte) 87, class215.field3940.field3003);
                class63.field1049.method726((byte) -120, class61.field1031.field3003);
                class63.field1049.method726((byte) -46, class168.field3079.field3003);
                class63.field1049.method726((byte) 99, class227.field4110.field3003);
                class63.field1049.method726((byte) 103, class230.field4152.field3003);
                class63.field1049.method742((byte) -100, 0, class64.field1054.field2133, class64.field1054.field2157);
                class166.field3027.method419(-83, class63.field1049.field2157, 0, class63.field1049.field2133);
                class64.field1054.method657(-112, var6);
                for (int var7 = 0; var7 < 4; ++var7) {
                    var6[var7] += 50;
                }
                class118.field2241.method657(-126, var6);
                class17.field255 = 6;
            }
            if (~class17.field255 == -7 && class166.field3027.method424(5000) > 0) {
                int var8 = class166.field3027.method420(true);
                if (~var8 == -22 && ~class95.field1666 == -21) {
                    class17.field255 = 7;
                } else if (var8 == 2) {
                    class17.field255 = 9;
                } else {
                    if (var8 == 15 && class95.field1666 == 40) {
                        class112.method737(0);
                        return;
                    }
                    if (~var8 != -24 || class74.field1232 >= 1) {
                        class58.method386(-19422, var8);
                        return;
                    }
                    ++class74.field1232;
                    class17.field255 = 0;
                }
            }
            if (~class17.field255 == -8 && class166.field3027.method424(5000) > 0) {
                class156.field2850 = 180 + 60 * class166.field3027.method420(true);
                class17.field255 = 8;
            }
            if (~class17.field255 == -9) {
                class184.field3384 = 0;
                class48.method321(class187.method1197(new class132[] { class132.method889(class156.field2850 / 60, (byte) 101), class210.field3868 }, -84), class150.field2754, (byte) 38, class33.field506);
                if (~(--class156.field2850) >= -1) {
                    class17.field255 = 0;
                }
            } else {
                if (~class17.field255 == -10 && class166.field3027.method424(5000) >= 9) {
                    class169.field3148 = class166.field3027.method420(true);
                    class237.field4290 = class166.field3027.method420(true);
                    class93.field1640 = ~class166.field3027.method420(true) == -2;
                    class65.field1069 = class166.field3027.method420(true);
                    class65.field1069 <<= 8;
                    class65.field1069 += class166.field3027.method420(true);
                    class154.field2806 = class166.field3027.method420(true);
                    class166.field3027.method418(class118.field2241.field2157, (byte) 127, 0, 1);
                    class118.field2241.field2133 = 0;
                    class173.field3235 = class118.field2241.method652(-80);
                    class166.field3027.method418(class118.field2241.field2157, (byte) 108, 0, 2);
                    class118.field2241.field2133 = 0;
                    class39.field630 = class118.field2241.method739(-14);
                    class17.field255 = 10;
                }
                if (class17.field255 == 10) {
                    if (~class166.field3027.method424(5000) <= ~class39.field630) {
                        class118.field2241.field2133 = 0;
                        class166.field3027.method418(class118.field2241.field2157, (byte) 105, 0, class39.field630);
                        class34.method247((byte) -93);
                        class70.field1162 = -1;
                        class165.method1086(false, (byte) 122);
                        class173.field3235 = -1;
                    }
                } else {
                    ++class184.field3384;
                    if (~class184.field3384 < -2001) {
                        if (class74.field1232 < 1) {
                            if (~class6.field61 == ~field4236) {
                                field4236 = class113.field2191;
                            } else {
                                field4236 = class6.field61;
                            }
                            class17.field255 = 0;
                            ++class74.field1232;
                        } else {
                            class58.method386(-19422, -3);
                        }
                    }
                }
            }
        } catch (IOException var9) {
            if (class74.field1232 < 1) {
                if (class6.field61 == field4236) {
                    field4236 = class113.field2191;
                } else {
                    field4236 = class6.field61;
                }
                class17.field255 = 0;
                ++class74.field1232;
            } else {
                class58.method386(-19422, -2);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1491(int arg0, int arg1, int arg2, int arg3) {
        if (!class145.method973(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class136.method928(var4 + 1, class78.field1364[arg0][arg1][arg2] + arg3, var5 + 1) && class136.method928(var4 + 128 - 1, class78.field1364[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class136.method928(var4 + 128 - 1, class78.field1364[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class136.method928(var4 + 1, class78.field1364[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[Lii;)V")
    public static final void method1492(int arg0, int arg1, class96[] arg2) {
        for (int var3 = 0; arg2.length > var3; ++var3) {
            class96 var5 = arg2[var3];
            if (var5 != null) {
                if (var5.field1760 == 0) {
                    if (var5.field1770 != null) {
                        method1492(arg0, -11, var5.field1770);
                    }
                    class73 var6 = (class73) class55.field927.method806(-1, (long) var5.field1794);
                    if (var6 != null) {
                        class231.method1469(var6.field1216, arg0, 2345);
                    }
                }
                if (arg0 == 0 && var5.field1762 != null) {
                    class123 var7 = new class123();
                    var7.field2299 = var5;
                    var7.field2310 = var5.field1762;
                    class155.method1010(var7, 200000);
                }
                if (arg0 == 1 && var5.field1756 != null) {
                    if (var5.field1743 >= 0) {
                        class96 var8 = class158.method1029((byte) -99, var5.field1794);
                        if (var8 == null || var8.field1770 == null || var8.field1770.length <= var5.field1743 || var8.field1770[var5.field1743] != var5) {
                            continue;
                        }
                    }
                    class123 var9 = new class123();
                    var9.field2310 = var5.field1756;
                    var9.field2299 = var5;
                    class155.method1010(var9, 200000);
                }
            }
        }
        int var4 = -58 % ((arg1 - 49) / 39);
        ++field4237;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field4239;
        if (~arg0 == -1) {
            this.field4233 = arg2.method739(arg1 ^ 51);
        }
        if (arg1 != -73) {
            method1488(85, 13, (byte) 13, -55, -58);
        }
    }
}
