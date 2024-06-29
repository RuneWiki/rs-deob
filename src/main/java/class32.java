import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class32 extends class222 {

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
    private int field568 = 1024;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    private int field565 = 2048;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    private int field571 = 3072;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "[I")
    public static int[] field567 = new int[128];

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "[Lnj;")
    public static class82[] field560;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        ++field566;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3842 = ~arg0.method1446(5350) == -2;
                }
            } else {
                this.field571 = arg0.method1487(83);
            }
        } else {
            this.field568 = arg0.method1487(11);
        }
        if (arg1) {
            method286(72);
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
    private static final void method285(int arg0) {
        class103.field1834 = null;
        ++field569;
        class203.field3479 = null;
        class255.field4530 = null;
        class233.field4006 = null;
        class135.field2392 = null;
        class72.field1191 = null;
        class162.field2925 = null;
        class226.field3889 = null;
        if (arg0 != -105) {
            field560 = null;
        }
        class216.field3683 = null;
        class228.field3924 = null;
        class117.field2098 = null;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method3((class216) null, false, -117);
        }
        int[][] var3 = super.field3834.method627(4103, arg0);
        ++field563;
        if (super.field3834.field1486) {
            int[][] var4 = this.method1531(arg0, 0, arg1 ^ 111);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class13.field253 < ~var11; ++var11) {
                var7[var11] = this.field568 - -(var5[var11] * this.field565 >> 12);
                var9[var11] = (var8[var11] * this.field565 >> 12) + this.field568;
                var10[var11] = this.field568 - -(var6[var11] * this.field565 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
    public static void method286(int arg0) {
        if (arg0 != -13900) {
            method289((byte) 91);
        }
        field567 = null;
        field560 = null;
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)V")
    public static final void method287(byte arg0) {
        class125.field2261 = 0L;
        if (arg0 != -105) {
            field567 = null;
        }
        ++field564;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class32() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        int var2 = 83 % ((arg0 - 57) / 51);
        this.field565 = this.field571 - this.field568;
        ++field559;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field558;
        int[] var3 = super.field3844.method22(0, arg1);
        if (arg0 < 35) {
            this.field568 = -76;
        }
        if (super.field3844.field61) {
            int[] var4 = this.method1537((byte) 78, 0, arg1);
            for (int var5 = 0; var5 < class13.field253; ++var5) {
                var3[var5] = this.field568 - -(var4[var5] * this.field565 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(B)V")
    public static final void method289(byte arg0) {
        ++field562;
        class84.method630(3, false);
        class204.field3484 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class238.field4106.length; ++var2) {
            if (class95.field1642[var2] != -1 && class238.field4106[var2] == null) {
                class238.field4106[var2] = class84.field1467.method571(class95.field1642[var2], 0, 123);
                if (class238.field4106[var2] == null) {
                    ++class204.field3484;
                    var1 = false;
                }
            }
            if (~class119.field2134[var2] != 0 && class75.field1329[var2] == null) {
                class75.field1329[var2] = class84.field1467.method572(107, class119.field2134[var2], class117.field2097[var2], 0);
                if (class75.field1329[var2] == null) {
                    ++class204.field3484;
                    var1 = false;
                }
            }
            if (class208.field3557 != null && class223.field3846[var2] == null && class208.field3557[var2] != -1) {
                class223.field3846[var2] = class84.field1467.method572(110, class208.field3557[var2], class117.field2097[var2], 0);
                if (class223.field3846[var2] == null) {
                    var1 = false;
                    ++class204.field3484;
                }
            }
        }
        if (class37.field618 != null && class113.field1999.method562(class186.method1288(new class98[] { class37.field618.field2763, class249.field4375 }, 31618), -1)) {
            if (class113.field1999.method566(class186.method1288(new class98[] { class37.field618.field2763, class249.field4375 }, 31618), -5384)) {
                class26.field510 = class54.method402(false, class113.field1999, class186.method1288(new class98[] { class37.field618.field2763, class249.field4375 }, 31618));
            } else {
                var1 = false;
                ++class204.field3484;
            }
        } else {
            class26.field510 = null;
        }
        if (!var1) {
            class76.field1347 = 1;
        } else {
            class138.field2443 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~class238.field4106.length < ~var4; ++var4) {
                byte[] var19 = class75.field1329[var4];
                if (var19 != null) {
                    int var20 = (class49.field812[var4] >> 8) * 64 + -class189.field3277;
                    int var21 = (class49.field812[var4] & 255) * 64 + -class182.field3143;
                    if (class28.field531) {
                        var21 = 10;
                        var20 = 10;
                    }
                    var3 &= class88.method657(false, var19, var20, var21);
                }
            }
            if (!var3) {
                class76.field1347 = 2;
            } else {
                if (class76.field1347 != 0) {
                    class92.method680(true, class186.method1288(new class98[] { class106.field1909, class253.field4431 }, 31618), true);
                }
                class115.method867(68);
                class192.method1326(2);
                class45.method360();
                for (int var5 = 0; var5 < 4; ++var5) {
                    class110.field1961[var5].method518((byte) 54);
                }
                if (arg0 > -127) {
                    field567 = null;
                }
                for (int var6 = 0; var6 < 4; ++var6) {
                    for (int var17 = 0; ~var17 > -105; ++var17) {
                        for (int var18 = 0; ~var18 > -105; ++var18) {
                            class138.field2461[var6][var17][var18] = 0;
                        }
                    }
                }
                class150.method1109(false, (byte) 67);
                class115.method867(41);
                System.gc();
                class84.method630(3, true);
                class69.method477(107, false);
                if (!class28.field531) {
                    class108.method822((byte) 106, false);
                    class84.method630(3, true);
                    class202.method1370(false, false);
                    if (class223.field3846 != null) {
                        class16.method137(20153);
                    }
                }
                if (class28.field531) {
                    class36.method299(false, 0);
                    class84.method630(3, true);
                    class28.method272(false, false);
                }
                class192.method1326(2);
                class84.method630(3, true);
                class90.method662((byte) 78, false, class110.field1961);
                class84.method630(3, true);
                int var7 = class88.field1552;
                if (~class265.field4640 > ~var7) {
                    var7 = class265.field4640;
                }
                if (~(class265.field4640 + -1) < ~var7) {
                    int var8 = class265.field4640 + -1;
                }
                if (class181.method1249((byte) 62)) {
                    class223.method1541(0);
                } else {
                    class223.method1541(class88.field1552);
                }
                method285(-105);
                for (int var9 = 0; ~var9 > -105; ++var9) {
                    for (int var16 = 0; ~var16 > -105; ++var16) {
                        class43.method344(var16, 1, var9);
                    }
                }
                class220.method1524(3409);
                class115.method867(51);
                class242.method1671((byte) -123);
                class192.method1326(2);
                if (class72.field1195 != null && class46.field774 != null && ~class249.field4370 == -26) {
                    class237.field4084.method490(149, -109);
                    class237.field4084.method1456(1057001181, -23438);
                    ++class232.field3985;
                }
                if (!class28.field531) {
                    int var10 = (class118.field2124 + -6) / 8;
                    int var11 = (class191.field3316 + -6) / 8;
                    int var12 = (class118.field2124 - -6) / 8;
                    int var13 = (class191.field3316 + 6) / 8;
                    for (int var14 = var10 + -1; var14 <= var12 + 1; ++var14) {
                        for (int var15 = var11 + -1; var15 <= var13 + 1; ++var15) {
                            if (var14 < var10 || var12 < var14 || var15 < var11 || ~var13 > ~var15) {
                                class84.field1467.method565(class186.method1288(new class98[] { class208.field3565, class125.method930(25904, var14), class111.field1980, class125.method930(25904, var15) }, 31618), (byte) -87);
                                class84.field1467.method565(class186.method1288(new class98[] { class221.field3806, class125.method930(25904, var14), class111.field1980, class125.method930(25904, var15) }, 31618), (byte) -87);
                            }
                        }
                    }
                }
                if (~class249.field4370 != -29) {
                    class220.method1521(30, 0);
                    if (class46.field774 != null) {
                        class237.field4084.method490(201, -67);
                    }
                } else {
                    class220.method1521(10, 0);
                }
                class115.method867(76);
                class111.method836(84);
            }
        }
    }
}
