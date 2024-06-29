import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class169 extends class212 {

    @OriginalMember(owner = "client!kj", name = "db", descriptor = "Lsc;")
    private static class181 field2842 = class149.method967(255, "wishes to trade with you)3");

    @OriginalMember(owner = "client!kj", name = "bb", descriptor = "Lsc;")
    public static class181 field2840 = field2842;

    @OriginalMember(owner = "client!kj", name = "gb", descriptor = "Lak;")
    public static class152 field2845 = new class152(64);

    @OriginalMember(owner = "client!kj", name = "ib", descriptor = "Lsc;")
    private static class181 field2847 = class149.method967(255, " has logged out)3");

    @OriginalMember(owner = "client!kj", name = "hb", descriptor = "Lsc;")
    public static class181 field2846 = field2847;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!kj", name = "eb", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!kj", name = "fb", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!kj", name = "cb", descriptor = "Ljb;")
    public static class11 field2841;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILog;II)V")
    public static final void method1116(int arg0, int arg1, int arg2, class264 arg3, int arg4, int arg5) {
        ++field2843;
        if (~arg3.field4610 != 0 || arg3.field4608 != null) {
            int var6 = 0;
            if (arg3.field4588 >= arg0) {
                if (~arg3.field4589 < ~arg0) {
                    var6 += -arg0 + arg3.field4589;
                }
            } else {
                var6 += -arg3.field4588 + arg0;
            }
            if (arg1 <= arg3.field4599) {
                if (~arg3.field4596 < ~arg1) {
                    var6 += arg3.field4596 - arg1;
                }
            } else {
                var6 += -arg3.field4599 + arg1;
            }
            if (~arg3.field4590 != -1 && var6 + -64 <= arg3.field4590 && class55.field849 != 0 && ~arg3.field4611 == ~arg5) {
                var6 -= 64;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var7 = (-var6 + arg3.field4590) * class55.field849 / arg3.field4590;
                if (arg3.field4606 == null) {
                    if (arg3.field4610 >= 0) {
                        class103 var8 = class103.method695(class264.field4600, arg3.field4610, 0);
                        if (var8 != null) {
                            class150 var9 = var8.method692().method972(class247.field4315);
                            class154 var10 = class154.method1012(var9, 100, var7);
                            var10.method1018(-1);
                            class90.field1420.method702(var10);
                            arg3.field4606 = var10;
                        }
                    }
                } else {
                    arg3.field4606.method1007(var7);
                }
                if (arg3.field4604 != null) {
                    arg3.field4604.method1007(var7);
                    if (!arg3.field4604.method287(124)) {
                        arg3.field4604 = null;
                    }
                } else if (arg3.field4608 != null && ~(arg3.field4612 -= arg4) >= -1) {
                    int var11 = (int) (Math.random() * (double) arg3.field4608.length);
                    class103 var12 = class103.method695(class264.field4600, arg3.field4608[var11], 0);
                    if (var12 != null) {
                        class150 var13 = var12.method692().method972(class247.field4315);
                        class154 var14 = class154.method1012(var13, 100, var7);
                        var14.method1018(0);
                        class90.field1420.method702(var14);
                        arg3.field4604 = var14;
                        arg3.field4612 = (int) ((double) (-arg3.field4615 + arg3.field4587) * Math.random()) + arg3.field4615;
                    }
                }
                if (arg2 != -31552) {
                    method1118(true, -40);
                }
            } else {
                if (arg3.field4606 != null) {
                    class90.field1420.method696(arg3.field4606);
                    arg3.field4606 = null;
                }
                if (arg3.field4604 != null) {
                    class90.field1420.method696(arg3.field4604);
                    arg3.field4604 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V")
    public static void method1117(int arg0) {
        field2840 = null;
        field2842 = null;
        field2845 = null;
        field2841 = null;
        field2847 = null;
        field2846 = null;
        if (arg0 != -1901392735) {
            method1122(25);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)V")
    public static final void method1118(boolean arg0, int arg1) {
        ++field2833;
        if (arg1 == 1476442030) {
            byte var2 = 4;
            byte[][] var3 = class184.field3266;
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                class4.method36((byte) 18);
                for (int var5 = 0; ~var5 > -14; ++var5) {
                    for (int var6 = 0; ~var6 > -14; ++var6) {
                        boolean var7 = false;
                        int var8 = class27.field466[var4][var5][var6];
                        if (~var8 != 0) {
                            int var9 = (56318880 & var8) >> 24;
                            if (!arg0 || var9 == 0) {
                                int var10 = var8 >> 1 & 3;
                                int var11 = (16773830 & var8) >> 14;
                                int var12 = 2047 & var8 >> 3;
                                int var13 = (var11 / 8 << 8) + var12 / 8;
                                for (int var14 = 0; class78.field1264.length > var14; ++var14) {
                                    if (~class78.field1264[var14] == ~var13 && var3[var14] != null) {
                                        class106.method711((7 & var12) * 8, class109.field1784, var4, -123, (7 & var11) * 8, var3[var14], arg0, var10, var6 * 8, var9, var5 * 8);
                                        var7 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (!var7) {
                            class19.method175(var4, 8, 8, var5 * 8, var6 * 8, arg1 ^ -1476442076);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)Lsc;")
    public static final class181 method1119(byte arg0, int arg1) {
        int var2 = 6 / ((arg0 - -41) / 61);
        ++field2834;
        return class198.method1346(false, 10, (byte) -2, arg1);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Ljb;I)V")
    public static final void method1120(class11 arg0, int arg1) {
        ++field2838;
        class85.field1360 = arg0;
        class8.field136 = class85.field1360.method102(arg1, arg1 ^ -23083);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 < 25) {
            field2845 = null;
        }
        ++field2839;
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int[][] var4 = this.method1410(arg0, 0, (byte) -68);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class26.field452 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljb;Ljb;I)V")
    public static final void method1121(class11 arg0, class11 arg1, int arg2) {
        class108.field1766 = arg0;
        ++field2836;
        class51.field810 = arg1;
        if (arg2 != 25994) {
            field2845 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class169() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V")
    public static final void method1122(int arg0) {
        int var1 = class114.field1853.method1677(class38.field594);
        int var2 = 0;
        if (arg0 > 106) {
            while (~class131.field2177 < ~var2) {
                int var6 = class114.field1853.method1677(class106.method713(var2, (byte) -58));
                if (~var6 < ~var1) {
                    var1 = var6;
                }
                ++var2;
            }
            var1 += 8;
            ++field2835;
            int var3 = class131.field2177 * 15 + 21;
            int var4 = -(var1 / 2) + class58.field878;
            int var5 = class26.field458;
            if (~(var4 - -var1) < ~class143.field2321) {
                var4 = -var1 + class143.field2321;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            if (~(var3 + var5) < ~class41.field620) {
                var5 = -var3 + class41.field620;
            }
            if (~var5 > -1) {
                var5 = 0;
            }
            if (~class94.field1492 == -2) {
                if (~class58.field878 == ~class263.field4578 && class26.field458 == class162.field2775) {
                    class33.field534 = true;
                    class8.field154 = var4;
                    class94.field1492 = 0;
                    class265.field4621 = class131.field2177 * 15 + 22;
                    class64.field1002 = var1;
                    class250.field4360 = var5;
                    return;
                }
            } else {
                if (~class58.field878 == ~class235.field4093 && class93.field1478 == class26.field458) {
                    class265.field4621 = class131.field2177 * 15 - -22;
                    class33.field534 = true;
                    class94.field1492 = 0;
                    class64.field1002 = var1;
                    class250.field4360 = var5;
                    class8.field154 = var4;
                    return;
                }
                class162.field2775 = class93.field1478;
                class263.field4578 = class235.field4093;
                class94.field1492 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "(I)Lth;")
    public static final class258 method1123(int arg0) {
        ++field2844;
        try {
            return arg0 != 100 ? null : (class258) Class.forName("kh").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
