import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class93 extends class43 {

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "Z")
    private boolean field1637 = true;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Z")
    private boolean field1636 = true;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Lmb;")
    public static class132 field1634 = class166.method1092("::autoshadow on", 112);

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field1639 = 500;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "Z")
    public static boolean field1640 = false;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lmb;")
    public static class132 field1638 = class166.method1092("Startseite auf (WSpielkonto wiederherstellen(W)3", 123);

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "Lmb;")
    private static class132 field1642 = class166.method1092("Attack", 121);

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "Lmb;")
    public static class132 field1647 = class166.method1092("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 115);

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lmb;")
    public static class132 field1641 = field1642;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "[I")
    public static int[] field1633;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        ++field1644;
        if (arg0 != -1893) {
            field1647 = null;
        }
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        if (super.field764.field3960) {
            int[][] var4 = this.method301(!this.field1637 ? arg1 : -arg1 + class185.field3423, (byte) -64, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (!this.field1636) {
                for (int var11 = 0; var11 < class131.field2427; ++var11) {
                    var8[var11] = var6[var11];
                    var10[var11] = var5[var11];
                    var9[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class131.field2427; ++var12) {
                    var8[var12] = var6[-var12 + class90.field1593];
                    var10[var12] = var5[-var12 + class90.field1593];
                    var9[var12] = var7[-var12 + class90.field1593];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)V")
    public static final void method575(boolean arg0) {
        boolean var1 = true;
        ++field1643;
        class160.method1037(50, arg0);
        class97.field1862 = 0;
        for (int var2 = 0; ~class67.field1106.length < ~var2; ++var2) {
            if (~class14.field181[var2] != 0 && class67.field1106[var2] == null) {
                class67.field1106[var2] = class168.field3077.method1079(class14.field181[var2], 119, 0);
                if (class67.field1106[var2] == null) {
                    ++class97.field1862;
                    var1 = false;
                }
            }
            if (class102.field1923[var2] != -1 && class135.field2534[var2] == null) {
                class135.field2534[var2] = class168.field3077.method1078(class65.field1075[var2], 0, -18128, class102.field1923[var2]);
                if (class135.field2534[var2] == null) {
                    var1 = false;
                    ++class97.field1862;
                }
            }
        }
        if (!var1) {
            class46.field790 = 1;
        } else {
            class37.field613 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~var4 > ~class67.field1106.length; ++var4) {
                byte[] var54 = class135.field2534[var4];
                if (var54 != null) {
                    int var55 = (class92.field1629[var4] >> 8) * 64 + -class129.field2389;
                    int var56 = (class92.field1629[var4] & 255) * 64 + -class168.field3082;
                    if (class84.field1469) {
                        var56 = 10;
                        var55 = 10;
                    }
                    var3 &= class134.method917(var56, -53, var54, var55);
                }
            }
            if (!var3) {
                class46.field790 = 2;
            } else {
                if (~class46.field790 != -1) {
                    class195.method1240(class187.method1197(new class132[] { class21.field309, class136.field2557 }, -107), true, 250);
                }
                class10.method50((byte) -24);
                class17.method89(107);
                class10.method50((byte) -24);
                class23.method154();
                class10.method50((byte) -24);
                System.gc();
                for (int var5 = 0; var5 < 4; ++var5) {
                    class182.field3351[var5].method1305(true);
                }
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    for (int var52 = 0; ~var52 > -105; ++var52) {
                        for (int var53 = 0; ~var53 > -105; ++var53) {
                            class148.field2722[var6][var52][var53] = 0;
                        }
                    }
                }
                class10.method50((byte) -24);
                class48.method319((byte) 93);
                int var7 = class67.field1106.length;
                class23.method151((byte) -120);
                class160.method1037(50, true);
                if (!class84.field1469) {
                    for (int var8 = 0; ~var8 > ~var7; ++var8) {
                        int var18 = (class92.field1629[var8] & 255) * 64 + -class168.field3082;
                        byte[] var19 = class67.field1106[var8];
                        int var20 = (class92.field1629[var8] >> 8) * 64 + -class129.field2389;
                        if (var19 != null) {
                            class10.method50((byte) -24);
                            class200.method1263(class70.field1162 * 8 + -48, class22.field318 * 8 + -48, var20, 122, var18, var19, class182.field3351);
                        }
                    }
                    for (int var9 = 0; var9 < var7; ++var9) {
                        int var14 = (class92.field1629[var9] >> 8) * 64 + -class129.field2389;
                        int var15 = (class92.field1629[var9] & 255) * 64 + -class168.field3082;
                        byte[] var16 = class67.field1106[var9];
                        if (var16 == null && class22.field318 < 800) {
                            class10.method50((byte) -24);
                            for (int var17 = 0; var17 < 4; ++var17) {
                                class238.method1506(var17, 64, var14, 64, var15, -111);
                            }
                        }
                    }
                    class160.method1037(50, true);
                    for (int var10 = 0; var7 > var10; ++var10) {
                        byte[] var11 = class135.field2534[var10];
                        if (var11 != null) {
                            int var12 = (class92.field1629[var10] >> 8) * 64 - class129.field2389;
                            int var13 = (class92.field1629[var10] & 255) * 64 + -class168.field3082;
                            class10.method50((byte) -24);
                            class222.method1394(var13, (byte) -109, var12, class182.field3351, var11);
                        }
                    }
                }
                if (class84.field1469) {
                    for (int var21 = 0; ~var21 > -5; ++var21) {
                        class10.method50((byte) -24);
                        for (int var32 = 0; ~var32 > -14; ++var32) {
                            for (int var33 = 0; ~var33 > -14; ++var33) {
                                int var34 = class216.field3946[var21][var32][var33];
                                boolean var35 = false;
                                if (~var34 != 0) {
                                    int var36 = 3 & var34 >> 24;
                                    int var37 = var34 >> 1 & 3;
                                    int var38 = (16763684 & var34) >> 14;
                                    int var39 = (16382 & var34) >> 3;
                                    int var40 = (var38 / 8 << 8) + var39 / 8;
                                    for (int var41 = 0; var41 < class92.field1629.length; ++var41) {
                                        if (class92.field1629[var41] == var40 && class67.field1106[var41] != null) {
                                            var35 = true;
                                            class169.method1107(class182.field3351, (var39 & 7) * 8, var32 * 8, var33 * 8, var37, 4, class67.field1106[var41], var36, (var38 & 7) * 8, var21);
                                            break;
                                        }
                                    }
                                }
                                if (!var35) {
                                    class238.method1506(var21, 8, var32 * 8, 8, var33 * 8, -115);
                                }
                            }
                        }
                    }
                    class160.method1037(50, true);
                    for (int var22 = 0; var22 < 4; ++var22) {
                        class10.method50((byte) -24);
                        for (int var23 = 0; ~var23 > -14; ++var23) {
                            for (int var24 = 0; var24 < 13; ++var24) {
                                int var25 = class216.field3946[var22][var23][var24];
                                if (var25 != -1) {
                                    int var26 = (58745941 & var25) >> 24;
                                    int var27 = 3 & var25 >> 1;
                                    int var28 = (16766907 & var25) >> 14;
                                    int var29 = (var25 & 16383) >> 3;
                                    int var30 = (var28 / 8 << 8) + var29 / 8;
                                    for (int var31 = 0; ~class92.field1629.length < ~var31; ++var31) {
                                        if (~class92.field1629[var31] == ~var30 && class135.field2534[var31] != null) {
                                            class106.method655(var26, (var28 & 7) * 8, var22, var24 * 8, var27, (byte) -126, class182.field3351, (7 & var29) * 8, var23 * 8, class135.field2534[var31]);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class160.method1037(50, true);
                class17.method89(107);
                class10.method50((byte) -24);
                class90.method560(class182.field3351, 4);
                class160.method1037(50, true);
                int var42 = class57.field968;
                if (class139.field2615 < var42) {
                    var42 = class139.field2615;
                }
                if (class139.field2615 + -1 > var42) {
                    int var43 = class139.field2615 + -1;
                }
                if (!class66.field1096) {
                    class15.method81(0);
                } else {
                    class15.method81(class57.field968);
                }
                for (int var44 = 0; var44 < 104; ++var44) {
                    for (int var51 = 0; ~var51 > -105; ++var51) {
                        class158.method1025(var51, var44, !arg0);
                    }
                }
                class10.method50((byte) -24);
                class145.method977((byte) 58);
                class17.method89(105);
                if (class125.field2322 != null) {
                    class64.field1054.method660(222, 3);
                    class64.field1054.method726((byte) 96, 1057001181);
                    ++class184.field3380;
                }
                if (!class84.field1469) {
                    int var45 = (class70.field1162 - -6) / 8;
                    int var46 = (class70.field1162 - 6) / 8;
                    int var47 = (class22.field318 + 6) / 8;
                    int var48 = (class22.field318 + -6) / 8;
                    for (int var49 = var46 + -1; ~var49 >= ~(var45 + 1); ++var49) {
                        for (int var50 = var48 - 1; var50 <= var47 + 1; ++var50) {
                            if (var46 > var49 || var45 < var49 || var48 > var50 || ~var47 > ~var50) {
                                class168.field3077.method1077(class187.method1197(new class132[] { class108.field2039, class132.method889(var49, (byte) 126), class149.field2735, class132.method889(var50, (byte) 106) }, -70), 0);
                                class168.field3077.method1077(class187.method1197(new class132[] { class162.field2928, class132.method889(var49, (byte) 111), class149.field2735, class132.method889(var50, (byte) 98) }, -109), 0);
                            }
                        }
                    }
                }
                class2.method6(30, (byte) 44);
                class10.method50((byte) -24);
                class88.method552(3310);
                class64.field1054.method660(176, 3);
                class133.method912(0);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        int[] var3 = super.field768.method1123(arg1, arg0);
        ++field1635;
        if (super.field768.field3219) {
            int[] var4 = this.method300(125, 0, this.field1637 ? class185.field3423 - arg0 : arg0);
            if (!this.field1636) {
                class80.method492(var4, 0, var3, 0, class131.field2427);
            } else {
                for (int var5 = 0; ~class131.field2427 < ~var5; ++var5) {
                    var3[var5] = var4[class90.field1593 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class93() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field1645;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field746 = ~arg2.method716(arg1 + -1235) == -2;
                }
            } else {
                this.field1637 = ~arg2.method716(arg1 ^ 1363) == -2;
            }
        } else {
            this.field1636 = ~arg2.method716(arg1 ^ 1363) == -2;
        }
        if (arg1 != -73) {
            this.field1636 = true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
    public static void method576(int arg0) {
        field1634 = null;
        field1641 = null;
        field1642 = null;
        field1647 = null;
        field1638 = null;
        if (arg0 != -1) {
            field1634 = null;
        }
        field1633 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lii;I)Z")
    public static final boolean method577(class96 arg0, int arg1) {
        ++field1646;
        if (arg1 != -1) {
            method577((class96) null, 49);
        }
        if (class191.field3555) {
            if (~class170.method1113(arg0, (byte) -50) != -1) {
                return false;
            }
            if (~arg0.field1760 == -1) {
                return false;
            }
        }
        return arg0.field1806;
    }
}
