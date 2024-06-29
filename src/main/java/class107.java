import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class107 extends class203 {

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    private final int field1897;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    private final int field1887;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    private final int field1891;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    private final int field1896;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "Ljd;")
    public static class85 field1883 = class221.method1499("Suche nach Updates )2 ", (byte) -122);

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "[B")
    public static byte[] field1885 = new byte[520];

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "D")
    public static double field1893 = -1.0D;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "Ljd;")
    private static class85 field1894 = class221.method1499("Allocated memory", (byte) -89);

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "Ljd;")
    public static class85 field1890 = field1894;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "Lb;")
    public static class81 field1882;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
    public final void method739(int arg0, int arg1, int arg2) {
        ++field1895;
        if (arg0 != 20241) {
            method741(-33);
        }
        int var4 = this.field1897 * arg1 >> 12;
        int var5 = this.field1891 * arg1 >> 12;
        int var6 = this.field1896 * arg2 >> 12;
        int var7 = this.field1887 * arg2 >> 12;
        class218.method1486(var7, super.field3550, var5, var6, super.field3539, var4, (byte) -70);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    public static void method740(byte arg0) {
        field1885 = null;
        field1894 = null;
        if (arg0 != 98) {
            field1885 = null;
        }
        field1882 = null;
        field1890 = null;
        field1883 = null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public static final void method741(int arg0) {
        ++field1889;
        int var1 = class180.field3092.method75(class202.field3532);
        for (int var2 = 0; ~var2 > ~class115.field2058; ++var2) {
            int var6 = class180.field3092.method75(class154.method1012(-126, var2));
            if (~var6 < ~var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class194.field3315;
        int var4 = -(var1 / 2) + class151.field2551;
        if (var4 - -var1 > class154.field2664) {
            var4 = -var1 + class154.field2664;
        }
        if (~var4 > -1) {
            var4 = 0;
        }
        if (arg0 != -15179) {
            field1882 = null;
        }
        int var5 = class115.field2058 * 15 + 21;
        if (~(var3 + var5) < ~class154.field2662) {
            var3 = -var5 + class154.field2662;
        }
        if (~var3 > -1) {
            var3 = 0;
        }
        if (class203.field3541 == 1) {
            if (class19.field278 == class151.field2551 && class194.field3315 == class152.field2604) {
                class102.field1812 = var4;
                class134.field2334 = var1;
                class230.field3978 = var3;
                class150.field2544 = class115.field2058 * 15 - -22;
                class203.field3541 = 0;
                class52.field902 = true;
                return;
            }
        } else {
            if (~class99.field1784 != ~class151.field2551 || ~class194.field3315 != ~class175.field3008) {
                class152.field2604 = class175.field3008;
                class19.field278 = class99.field1784;
                class203.field3541 = 1;
                return;
            }
            class102.field1812 = var4;
            class230.field3978 = var3;
            class52.field902 = true;
            class150.field2544 = class115.field2058 * 15 + 22;
            class203.field3541 = 0;
            class134.field2334 = var1;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBI)V")
    public final void method742(int arg0, byte arg1, int arg2) {
        ++field1888;
        if (arg1 != -53) {
            field1894 = null;
        }
        int var4 = this.field1897 * arg2 >> 12;
        int var5 = this.field1896 * arg0 >> 12;
        int var6 = this.field1891 * arg2 >> 12;
        int var7 = this.field1887 * arg0 >> 12;
        class213.method1464(var5, var6, super.field3536, var7, false, var4);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V")
    public static final void method743(boolean arg0, int arg1) {
        ++field1886;
        class2.field17 = arg0;
        if (arg1 != 6238) {
            field1882 = null;
        }
        if (class2.field17) {
            int var2 = class189.field3249.method1670(arg1 + 2000369962);
            int var3 = class189.field3249.method1694((byte) -100);
            class189.field3249.method488(8);
            for (int var4 = 0; ~var4 > -5; ++var4) {
                for (int var22 = 0; ~var22 > -14; ++var22) {
                    for (int var23 = 0; var23 < 13; ++var23) {
                        int var24 = class189.field3249.method490(arg1 ^ 6238, 1);
                        if (~var24 != -2) {
                            class74.field1386[var4][var22][var23] = -1;
                        } else {
                            class74.field1386[var4][var22][var23] = class189.field3249.method490(class197.method1346(arg1, 6238), 26);
                        }
                    }
                }
            }
            class189.field3249.method487(-94);
            int var5 = (-class189.field3249.field4224 + class85.field1593) / 16;
            class148.field2507 = new int[var5][4];
            for (int var6 = 0; ~var6 > ~var5; ++var6) {
                for (int var21 = 0; ~var21 > -5; ++var21) {
                    class148.field2507[var6][var21] = class189.field3249.method1664(121);
                }
            }
            int var7 = class189.field3249.method1716(2);
            int var8 = class189.field3249.method1683(-2);
            int var9 = class189.field3249.method1694((byte) -100);
            class256.field4570 = new byte[var5][];
            class130.field2279 = new int[var5];
            class79.field1459 = null;
            class187.field3221 = new int[var5];
            class194.field3314 = new byte[var5][];
            class94.field1719 = new int[var5];
            class269.field4780 = null;
            int var10 = 0;
            for (int var11 = 0; ~var11 > -5; ++var11) {
                for (int var12 = 0; ~var12 > -14; ++var12) {
                    for (int var13 = 0; var13 < 13; ++var13) {
                        int var14 = class74.field1386[var11][var12][var13];
                        if (~var14 != 0) {
                            int var15 = 2047 & var14 >> 3;
                            int var16 = var14 >> 14 & 1023;
                            int var17 = (var16 / 8 << 8) + var15 / 8;
                            for (int var18 = 0; var18 < var10; ++var18) {
                                if (class94.field1719[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (~var17 != 0) {
                                class94.field1719[var10] = var17;
                                int var19 = (var17 & 65440) >> 8;
                                int var20 = var17 & 255;
                                class130.field2279[var10] = class36.field555.method482(-69, class172.method1150(new class85[] { class106.field1850, class68.method451(var19, -12572), class144.field2471, class68.method451(var20, -12572) }, class197.method1346(arg1, 6238)));
                                class187.field3221[var10] = class36.field555.method482(-124, class172.method1150(new class85[] { class264.field4724, class68.method451(var19, -12572), class144.field2471, class68.method451(var20, -12572) }, 0));
                                ++var10;
                            }
                        }
                    }
                }
            }
            class185.method1278(var8, var2, false, var9, 1, var7, var3);
        } else {
            int var25 = class189.field3249.method1670(2000376200);
            int var26 = class189.field3249.method1683(-2);
            int var27 = class189.field3249.method1697(65280);
            int var28 = class189.field3249.method1678(false);
            int var29 = class189.field3249.method1697(65280);
            int var30 = (-class189.field3249.field4224 + class85.field1593) / 16;
            class148.field2507 = new int[var30][4];
            for (int var31 = 0; ~var31 > ~var30; ++var31) {
                for (int var37 = 0; ~var37 > -5; ++var37) {
                    class148.field2507[var31][var37] = class189.field3249.method1707((byte) -71);
                }
            }
            class187.field3221 = new int[var30];
            class79.field1459 = null;
            class94.field1719 = new int[var30];
            class130.field2279 = new int[var30];
            class194.field3314 = new byte[var30][];
            class256.field4570 = new byte[var30][];
            boolean var32 = false;
            if ((~(var25 / 8) == -49 || var25 / 8 == 49) && ~(var29 / 8) == -49) {
                var32 = true;
            }
            class269.field4780 = null;
            int var33 = 0;
            if (~(var25 / 8) == -49 && ~(var29 / 8) == -149) {
                var32 = true;
            }
            for (int var34 = (var25 - 6) / 8; ~((var25 + 6) / 8) <= ~var34; ++var34) {
                for (int var35 = (var29 + -6) / 8; var35 <= (var29 + 6) / 8; ++var35) {
                    int var36 = (var34 << 8) - -var35;
                    if (!var32 || ~var35 != -50 && ~var35 != -150 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class94.field1719[var33] = var36;
                        class130.field2279[var33] = class36.field555.method482(-84, class172.method1150(new class85[] { class106.field1850, class68.method451(var34, -12572), class144.field2471, class68.method451(var35, -12572) }, 0));
                        class187.field3221[var33] = class36.field555.method482(-60, class172.method1150(new class85[] { class264.field4724, class68.method451(var34, -12572), class144.field2471, class68.method451(var35, class197.method1346(arg1, -10566)) }, arg1 + -6238));
                    } else {
                        class94.field1719[var33] = var36;
                        class130.field2279[var33] = -1;
                        class187.field3221[var33] = -1;
                    }
                    ++var33;
                }
            }
            class185.method1278(var25, var26, false, var27, 1, var28, var29);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZII)V")
    public final void method744(boolean arg0, int arg1, int arg2) {
        int var4 = this.field1897 * arg2 >> 12;
        ++field1884;
        int var5 = this.field1891 * arg2 >> 12;
        if (!arg0) {
            method741(25);
        }
        int var6 = this.field1896 * arg1 >> 12;
        int var7 = this.field1887 * arg1 >> 12;
        class189.method1298(5000, var5, super.field3536, super.field3550, var7, var4, var6, super.field3539);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIIIIII)V")
    public class107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1897 = arg0;
        this.field1887 = arg3;
        this.field1891 = arg2;
        this.field1896 = arg1;
    }
}
