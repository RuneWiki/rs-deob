import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 extends class12 {

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    private int field178 = 0;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    private int field180 = 0;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    private int field192 = 20;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    private int field191 = 1365;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field187 = 0;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "Ltg;")
    private static class184 field183 = class135.method812("Loading config )2 ", 3);

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field182 = 0;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "Ltg;")
    public static class184 field176 = field183;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "Ltg;")
    public static class184 field189 = class135.method812("hint_mapedge", 3);

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "Z")
    public static boolean field190 = false;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Lnd;")
    public static class127 field179 = new class127(128);

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)V")
    public static final void method58(byte arg0) {
        class196.method1244(false, 32);
        boolean var1 = true;
        class117.field2120 = 0;
        for (int var2 = 0; var2 < class63.field1186.length; ++var2) {
            if (class68.field1313[var2] != -1 && class63.field1186[var2] == null) {
                class63.field1186[var2] = class17.field324.method1249((byte) 61, 0, class68.field1313[var2]);
                if (class63.field1186[var2] == null) {
                    ++class117.field2120;
                    var1 = false;
                }
            }
            if (class115.field2086[var2] != -1 && class39.field742[var2] == null) {
                class39.field742[var2] = class17.field324.method1253(-27905, class197.field3825[var2], 0, class115.field2086[var2]);
                if (class39.field742[var2] == null) {
                    ++class117.field2120;
                    var1 = false;
                }
            }
        }
        if (arg0 == 58) {
            ++field181;
            if (!var1) {
                class195.field3789 = 1;
            } else {
                class122.field2224 = 0;
                boolean var3 = true;
                for (int var4 = 0; ~class63.field1186.length < ~var4; ++var4) {
                    byte[] var56 = class39.field742[var4];
                    if (var56 != null) {
                        int var57 = (class105.field1919[var4] >> 8) * 64 + -class57.field1020;
                        int var58 = (class105.field1919[var4] & 255) * 64 + -class129.field2331;
                        if (class40.field749) {
                            var58 = 10;
                            var57 = 10;
                        }
                        var3 &= class74.method434(0, var58, var56, var57);
                    }
                }
                if (!var3) {
                    class195.field3789 = 2;
                } else {
                    if (class195.field3789 != 0) {
                        class69.method405(true, class144.method884(arg0 ^ 58, new class184[] { class81.field1460, class12.field227 }), 32549);
                    }
                    class91.method530(-77);
                    class11.method71((byte) 122);
                    class91.method530(99);
                    class186.method1180();
                    class91.method530(29);
                    System.gc();
                    for (int var5 = 0; ~var5 > -5; ++var5) {
                        class159.field2883[var5].method379((byte) -67);
                    }
                    for (int var6 = 0; var6 < 4; ++var6) {
                        for (int var54 = 0; ~var54 > -105; ++var54) {
                            for (int var55 = 0; ~var55 > -105; ++var55) {
                                class46.field878[var6][var54][var55] = 0;
                            }
                        }
                    }
                    class91.method530(73);
                    class130.method790((byte) 65);
                    int var7 = class63.field1186.length;
                    class3.method13(1);
                    class196.method1244(true, arg0 + -26);
                    if (!class40.field749) {
                        for (int var8 = 0; var8 < var7; ++var8) {
                            int var17 = (class105.field1919[var8] >> 8) * 64 - class57.field1020;
                            int var18 = (255 & class105.field1919[var8]) * 64 + -class129.field2331;
                            byte[] var19 = class63.field1186[var8];
                            if (var19 != null) {
                                class91.method530(118);
                                class144.method882(class38.field715 * 8 - 48, class159.field2883, var19, 127, var17, var18, class111.field2019 * 8 + -48);
                            }
                        }
                        for (int var9 = 0; var9 < var7; ++var9) {
                            int var14 = (class105.field1919[var9] >> 8) * 64 + -class57.field1020;
                            int var15 = (255 & class105.field1919[var9]) * 64 + -class129.field2331;
                            byte[] var16 = class63.field1186[var9];
                            if (var16 == null && class111.field2019 < 800) {
                                class91.method530(125);
                                class182.method1130((byte) 111, 64, var15, var14, 64);
                            }
                        }
                        class196.method1244(true, 32);
                        for (int var10 = 0; var7 > var10; ++var10) {
                            byte[] var11 = class39.field742[var10];
                            if (var11 != null) {
                                int var12 = (class105.field1919[var10] >> 8) * 64 + -class57.field1020;
                                int var13 = (class105.field1919[var10] & 255) * 64 + -class129.field2331;
                                class91.method530(90);
                                class55.method298(var12, class159.field2883, var11, var13, arg0 + -56);
                            }
                        }
                    }
                    if (class40.field749) {
                        for (int var20 = 0; ~var20 > -5; ++var20) {
                            class91.method530(-112);
                            for (int var34 = 0; ~var34 > -14; ++var34) {
                                for (int var35 = 0; ~var35 > -14; ++var35) {
                                    boolean var36 = false;
                                    int var37 = class119.field2148[var20][var34][var35];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = (var37 & 7) >> 1;
                                        int var40 = (16763863 & var37) >> 14;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; ~class105.field1919.length < ~var43; ++var43) {
                                            if (~class105.field1919[var43] == ~var42 && class63.field1186[var43] != null) {
                                                class202.method1289((7 & var40) * 8, var35 * 8, var34 * 8, class63.field1186[var43], class159.field2883, var20, var39, arg0 ^ 13590, var38, (var41 & 7) * 8);
                                                var36 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var36) {
                                        class136.method823(var35 * 8, var34 * 8, var20, (byte) 56);
                                    }
                                }
                            }
                        }
                        for (int var21 = 0; ~var21 > -14; ++var21) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = class119.field2148[0][var21][var32];
                                if (var33 == -1) {
                                    class182.method1130((byte) -21, 8, var32 * 8, var21 * 8, 8);
                                }
                            }
                        }
                        class196.method1244(true, arg0 + -26);
                        for (int var22 = 0; var22 < 4; ++var22) {
                            class91.method530(97);
                            for (int var23 = 0; var23 < 13; ++var23) {
                                for (int var24 = 0; ~var24 > -14; ++var24) {
                                    int var25 = class119.field2148[var22][var23][var24];
                                    if (~var25 != 0) {
                                        int var26 = (6 & var25) >> 1;
                                        int var27 = var25 >> 14 & 1023;
                                        int var28 = var25 >> 24 & 3;
                                        int var29 = var25 >> 3 & 2047;
                                        int var30 = (var27 / 8 << 8) - -(var29 / 8);
                                        for (int var31 = 0; class105.field1919.length > var31; ++var31) {
                                            if (~class105.field1919[var31] == ~var30 && class39.field742[var31] != null) {
                                                class118.method715(var28, class39.field742[var31], false, var24 * 8, var26, var23 * 8, (7 & var29) * 8, (7 & var27) * 8, var22, class159.field2883);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    class196.method1244(true, 32);
                    class11.method71((byte) 97);
                    class91.method530(-108);
                    class88.method524(arg0 ^ -59, class159.field2883);
                    class196.method1244(true, arg0 + -26);
                    int var44 = class60.field1124;
                    if (class47.field892 < var44) {
                        var44 = class47.field892;
                    }
                    if (var44 < class47.field892 + -1) {
                        int var45 = class47.field892 - 1;
                    }
                    if (!class55.field970) {
                        class151.method927(0);
                    } else {
                        class151.method927(class60.field1124);
                    }
                    for (int var46 = 0; var46 < 104; ++var46) {
                        for (int var53 = 0; ~var53 > -105; ++var53) {
                            class136.method820(var46, var53, 0);
                        }
                    }
                    class91.method530(-95);
                    class202.method1294((byte) 12);
                    class11.method71((byte) 73);
                    if (class43.field827 != null) {
                        class117.field2122.method106(244, arg0 ^ 125);
                        ++class157.field2808;
                        class117.field2122.method580(1057001181, false);
                    }
                    if (!class40.field749) {
                        int var47 = (class38.field715 - -6) / 8;
                        int var48 = (class38.field715 - 6) / 8;
                        int var49 = (class111.field2019 + 6) / 8;
                        int var50 = (class111.field2019 + -6) / 8;
                        for (int var51 = var48 - 1; var51 <= var47 + 1; ++var51) {
                            for (int var52 = var50 + -1; ~var52 >= ~(var49 + 1); ++var52) {
                                if (var48 > var51 || ~var47 > ~var51 || ~var50 < ~var52 || ~var52 < ~var49) {
                                    class17.field324.method1255(class144.method884(0, new class184[] { class55.field974, class170.method1060(var51, -127), class54.field963, class170.method1060(var52, arg0 + -178) }), false);
                                    class17.field324.method1255(class144.method884(arg0 + -58, new class184[] { class106.field1929, class170.method1060(var51, -118), class54.field963, class170.method1060(var52, -109) }), false);
                                }
                            }
                        }
                    }
                    class161.method972(30, (byte) 117);
                    class91.method530(arg0 ^ -75);
                    class60.method330((byte) 92);
                    class117.field2122.method106(142, -124);
                    class108.method675(-116);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field177;
        if (arg2) {
            this.field180 = -5;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field178 = arg0.method611(false);
                    }
                } else {
                    this.field180 = arg0.method611(arg2);
                }
            } else {
                this.field192 = arg0.method611(arg2);
            }
        } else {
            this.field191 = arg0.method611(false);
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(III)Z")
    public static final boolean method60(int arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            return false;
        } else {
            ++field185;
            if (~arg1 == -12) {
                arg1 = 10;
            }
            if (~arg1 <= -6 && ~arg1 >= -9) {
                arg1 = 4;
            }
            class58 var3 = class14.method88(73, arg0);
            return var3.method321(0, arg1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)I")
    public static int method61(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field188;
        if (arg1 != 17) {
            this.field180 = 16;
        }
        int[] var3 = super.field224.method7((byte) 109, arg0);
        if (super.field224.field53) {
            for (int var4 = 0; var4 < class201.field3889; ++var4) {
                int var5 = (class131.field2381[var4] << 12) / this.field191 + this.field180;
                int var6 = var5;
                int var7 = var5;
                int var8 = var5 * var5 >> 12;
                int var9 = 0;
                int var10 = (class37.field698[arg0] << 12) / this.field191 - -this.field178;
                int var11 = var10 * var10 >> 12;
                int var12 = var10;
                int var13 = var10;
                while (~(var8 - -var11) > -16385 && ~this.field192 < ~var9) {
                    ++var9;
                    var12 = (var7 * var12 >> 12) * 2 + var13;
                    var7 = var8 - var11 + var6;
                    var8 = var7 * var7 >> 12;
                    var11 = var12 * var12 >> 12;
                }
                var3[var4] = ~var9 <= ~(this.field192 + -1) ? 0 : (var9 << 12) / this.field192;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class10() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V")
    public static void method63(int arg0) {
        field179 = null;
        field189 = null;
        if (arg0 == -2064200148) {
            field176 = null;
            field183 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lvb;IB)Luc;")
    public static final class189 method64(class197 arg0, int arg1, byte arg2) {
        ++field186;
        byte[] var3 = arg0.method1259(arg1, 20980);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 != -118) {
                method64((class197) null, -102, (byte) -14);
            }
            return new class189(var3);
        }
    }
}
