import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class110 extends class64 {

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "Z")
    private boolean field2324 = true;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "Z")
    private boolean field2327 = true;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "Lcd;")
    public static class23 field2328 = class54.method414(":assist:", -1);

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "[I")
    public static int[] field2330 = new int[25];

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "Lsa;")
    public static class162 field2332 = new class162(64);

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "Lcd;")
    public static class23 field2338 = class54.method414("gleiten:", -1);

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "Lcd;")
    private static class23 field2336 = class54.method414(" is already on your friend list)3", -1);

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "Lcd;")
    public static class23 field2339 = field2336;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "Lcd;")
    public static class23 field2341 = class54.method414(":tradereq:", -1);

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "[Z")
    public static boolean[] field2340 = new boolean[112];

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "[[[B")
    public static byte[][][] field2337;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLje;)V")
    public static final void method710(boolean arg0, class85 arg1) {
        ++field2331;
        if (!arg0) {
            if (~class43.field911 == -2) {
                short var2 = 280;
                if (~var2 >= ~class65.field1535 && ~class65.field1535 >= ~(var2 + 14) && class43.field912 >= 4 && ~class43.field912 >= -19) {
                    class199.method1306(4, 0, 0);
                    return;
                }
                if (class65.field1535 >= var2 - -15 && ~(var2 - -80) <= ~class65.field1535 && ~class43.field912 <= -5 && ~class43.field912 >= -19) {
                    class199.method1306(4, 1, 0);
                    return;
                }
                short var3 = 390;
                if (~class65.field1535 <= ~var3 && ~(var3 + 14) <= ~class65.field1535 && ~class43.field912 <= -5 && ~class43.field912 >= -19) {
                    class199.method1306(4, 0, 1);
                    return;
                }
                if (var3 + 15 <= class65.field1535 && ~(var3 + 80) <= ~class65.field1535 && ~class43.field912 <= -5 && class43.field912 <= 18) {
                    class199.method1306(4, 1, 1);
                    return;
                }
                short var4 = 500;
                if (class65.field1535 >= var4 && var4 + 14 >= class65.field1535 && class43.field912 >= 4 && ~class43.field912 >= -19) {
                    class199.method1306(4, 0, 2);
                    return;
                }
                if (~(var4 - -15) >= ~class65.field1535 && ~class65.field1535 >= ~(var4 + 80) && class43.field912 >= 4 && class43.field912 <= 18) {
                    class199.method1306(4, 1, 2);
                    return;
                }
                short var5 = 610;
                if (var5 <= class65.field1535 && class65.field1535 <= var5 + 14 && ~class43.field912 <= -5 && class43.field912 <= 18) {
                    class199.method1306(4, 0, 3);
                    return;
                }
                if (~(var5 + 15) >= ~class65.field1535 && class65.field1535 <= var5 + 80 && class43.field912 >= 4 && class43.field912 <= 18) {
                    class199.method1306(4, 1, 3);
                    return;
                }
                if (~class65.field1535 <= -709 && ~class43.field912 <= -5 && ~class65.field1535 >= -759 && ~class43.field912 >= -21) {
                    class151.field3026 = false;
                    class183.field3606.method293(0, 0);
                    class202.field3995.method293(382, 0);
                    class163.field3267.method836(-(class163.field3267.field2706 / 2) + 382, 18);
                    return;
                }
                if (~class70.field1628 != 0) {
                    class21 var6 = class159.field3188[class70.field1628];
                    if (!class186.field3635 == !var6.field431) {
                        byte[] var7 = class3.method14(!arg0, new class23[] { var6.field439, class201.field3973 }).method162((byte) 20);
                        class96.field2019 = new String(var7, 0, var7.length);
                        class13.field295 = var6.field449;
                        class151.field3026 = false;
                        if (class199.field3894 != 0) {
                            class199.field3894 = 0;
                            class179.field3553 = 43594;
                            class66.field1557 = 43594;
                            class114.field2392 = 443;
                        }
                        class183.field3606.method293(0, 0);
                        class202.field3995.method293(382, 0);
                        class163.field3267.method836(-(class163.field3267.field2706 / 2) + 382, 18);
                        return;
                    }
                    class23 var8 = class3.method14(true, new class23[] { class178.field3528, var6.field439, class201.field3973, class66.field1553, class107.field2291, class184.method1132(-1, class193.field3810 ? 1 : 0), class58.field1360, class184.method1132(-1, class124.field2552), class129.field2694, class184.method1132(-1, class68.field1585) });
                    try {
                        arg1.getAppletContext().showDocument(var8.method172((byte) 97), "_self");
                        return;
                    } catch (Exception var9) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILkh;)Loe;")
    public static final class130 method711(int arg0, int arg1, int arg2, class97 arg3) {
        ++field2335;
        if (!class124.method765(arg2, arg1, (byte) 56, arg3)) {
            return null;
        } else {
            if (arg0 >= -113) {
                field2337 = null;
            }
            return class10.method62(29);
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
    public static void method712(int arg0) {
        field2340 = null;
        field2337 = null;
        field2339 = null;
        field2338 = null;
        field2332 = null;
        field2336 = null;
        field2341 = null;
        field2330 = null;
        if (arg0 != -24251) {
            method712(-25);
        }
        field2328 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)Lmh;")
    public static final class115 method713(int arg0, int arg1, int arg2, int arg3) {
        ++field2326;
        class115 var4 = new class115();
        var4.field2408 = arg0;
        var4.field2400 = arg2;
        class31.field665.method262((long) arg1, -114, var4);
        class1.method1(arg0, 100);
        class159.method976(arg0, 0);
        class47 var5 = class113.method725((byte) 102, arg1);
        if (var5 != null) {
            class3.method12(var5, false);
        }
        if (class72.field1644 != null) {
            class3.method12(class72.field1644, false);
            class72.field1644 = null;
        }
        class49.field1171 = 0;
        class134.field2786 = false;
        class109.method709((byte) -30, class134.field2789, class119.field2489, class179.field3552, class189.field3698);
        if (arg3 > -18) {
            return null;
        } else {
            if (class119.field2450 != -1) {
                class162.method991(class119.field2450, 1, (byte) 12);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -9421) {
            this.method37((byte) -45, 16, (class189) null);
        }
        ++field2325;
        int[] var3 = super.field1513.method1033(-62, arg0);
        if (super.field1513.field3368) {
            int[] var4 = this.method479(-1, !this.field2327 ? arg0 : class81.field1760 - arg0, 0);
            if (!this.field2324) {
                class93.method610(var4, 0, var3, 0, class168.field3367);
            } else {
                for (int var5 = 0; class168.field3367 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class163.field3266];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IIII)Z")
    public static final boolean method714(int arg0, int arg1, int arg2, int arg3) {
        ++field2333;
        int var4 = (536863524 & arg1) >> 14;
        int var5 = class205.field4041.method802(class59.field1385, arg0, arg3, arg1);
        if (var5 == -1) {
            return false;
        } else if (arg2 <= 71) {
            return true;
        } else {
            int var6 = 31 & var5;
            int var7 = 3 & var5 >> 6;
            if (var6 != 10 && ~var6 != -12 && ~var6 != -23) {
                class186.method1147(0, (byte) -115, true, var6 + 1, class134.field2790.field219[0], 0, arg0, var7, 0, 2, arg3, class134.field2790.field230[0]);
            } else {
                class104 var8 = class65.method486(var4, (byte) -66);
                int var9;
                int var10;
                if (var7 != 0 && ~var7 != -3) {
                    var9 = var8.field2205;
                    var10 = var8.field2232;
                } else {
                    var10 = var8.field2205;
                    var9 = var8.field2232;
                }
                int var11 = var8.field2258;
                if (var7 != 0) {
                    var11 = (var11 << var7 & 15) - -(var11 >> 4 - var7);
                }
                class186.method1147(var11, (byte) 109, true, 0, class134.field2790.field219[0], var10, arg0, 0, var9, 2, arg3, class134.field2790.field230[0]);
            }
            class154.field3088 = class43.field912;
            class100.field2112 = 0;
            class57.field1330 = 2;
            class180.field3569 = class65.field1535;
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        ++field2334;
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (super.field1508.field2757) {
            int[][] var4 = this.method482(0, !this.field2327 ? arg0 : -arg0 + class81.field1760, (byte) -128);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            if (!this.field2324) {
                for (int var11 = 0; ~var11 > ~class168.field3367; ++var11) {
                    var9[var11] = var5[var11];
                    var8[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; var12 < class168.field3367; ++var12) {
                    var9[var12] = var5[-var12 + class163.field3266];
                    var8[var12] = var6[class163.field3266 - var12];
                    var10[var12] = var7[-var12 + class163.field3266];
                }
            }
        }
        if (!arg1) {
            field2339 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class110() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        ++field2329;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field1510 = ~arg2.method1202(-117) == -2;
                }
            } else {
                this.field2327 = ~arg2.method1202(-30) == -2;
            }
        } else {
            this.field2324 = ~arg2.method1202(111) == -2;
        }
        int var5 = 54 / ((arg0 - 7) / 43);
    }
}
