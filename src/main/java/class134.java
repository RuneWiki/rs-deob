import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class134 extends class123 {

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
    private int field2418 = 4096;

    @OriginalMember(owner = "client!hf", name = "jb", descriptor = "I")
    private int field2429 = 0;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    public static int field2419 = 0;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "Leb;")
    private static class230 field2422 = class68.method589(0, "Continue");

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "Leb;")
    public static class230 field2417 = field2422;

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "I")
    public static int field2423 = 0;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!hf", name = "fb", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!hf", name = "gb", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!hf", name = "hb", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!hf", name = "ib", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "Lkk;")
    public static class223 field2421;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
    public static void method1042(int arg0) {
        if (arg0 != 1) {
            field2423 = 63;
        }
        field2422 = null;
        field2421 = null;
        field2417 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int var3 = 16 / ((arg1 - -24) / 57);
        ++field2426;
        int[] var4 = super.field2160.method1323((byte) 44, arg0);
        if (super.field2160.field3243) {
            int[] var5 = this.method965(0, arg0, (byte) 18);
            for (int var6 = 0; class140.field2505 > var6; ++var6) {
                int var7 = var5[var6];
                if (var7 >= this.field2429) {
                    if (var7 > this.field2418) {
                        var4[var6] = this.field2418;
                    } else {
                        var4[var6] = var7;
                    }
                } else {
                    var4[var6] = this.field2429;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class134() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BILka;I)V")
    public static final void method1043(byte arg0, int arg1, class245 arg2, int arg3) {
        ++field2424;
        if (~arg2.field4301 == -2) {
            class160.method1208(class89.field1580, 0L, arg0 ^ 6634, arg2.field4343, arg2.field4362, 0, (short) 1);
            ++class121.field2135;
        }
        if (arg2.field4301 == 2 && !class184.field3231) {
            class230 var4 = class60.method507((byte) -128, arg2);
            if (var4 != null) {
                class160.method1208(class173.method1267((byte) 59, new class230[] { class76.field1378, arg2.field4211 }), 0L, -6600, var4, arg2.field4362, -1, (short) 28);
                ++class89.field1581;
            }
        }
        if (~arg2.field4301 == -4) {
            ++class59.field1129;
            class160.method1208(class89.field1580, 0L, arg0 ^ 6634, class259.field4579, arg2.field4362, 0, (short) 18);
        }
        if (~arg2.field4301 == -5) {
            class160.method1208(class89.field1580, 0L, -6600, arg2.field4343, arg2.field4362, 0, (short) 29);
            ++class240.field4141;
        }
        if (arg2.field4301 == 5) {
            ++class254.field4529;
            class160.method1208(class89.field1580, 0L, -6600, arg2.field4343, arg2.field4362, 0, (short) 47);
        }
        if (arg0 == -46) {
            if (arg2.field4301 == 6 && class265.field4706 == null) {
                class160.method1208(class89.field1580, 0L, -6600, arg2.field4343, arg2.field4362, -1, (short) 36);
                ++class275.field4827;
            }
            if (~arg2.field4306 == -3) {
                int var5 = 0;
                for (int var6 = 0; arg2.field4266 > var6; ++var6) {
                    for (int var7 = 0; var7 < arg2.field4251; ++var7) {
                        int var8 = (32 - -arg2.field4344) * var7;
                        int var9 = (arg2.field4367 + 32) * var6;
                        if (var5 < 20) {
                            var9 += arg2.field4292[var5];
                            var8 += arg2.field4255[var5];
                        }
                        if (~var8 >= ~arg1 && var9 <= arg3 && ~arg1 > ~(var8 + 32) && arg3 < var9 + 32) {
                            class190.field3352 = var5;
                            class192.field3413 = arg2;
                            if (~arg2.field4331[var5] < -1) {
                                class12 var10 = class214.method1484(arg2.field4331[var5] + -1, -1);
                                if (~class196.field3513 == -2 && class44.method383(client.method1167(arg2), -86)) {
                                    if (~class35.field659 != ~arg2.field4362 || class225.field3891 != var5) {
                                        ++class183.field3198;
                                        class160.method1208(class173.method1267((byte) 59, new class230[] { class153.field2730, class191.field3365, var10.field191 }), (long) var10.field175, -6600, class275.field4832, arg2.field4362, var5, (short) 14);
                                    }
                                } else if (class184.field3231 && class44.method383(client.method1167(arg2), -53)) {
                                    if ((class138.field2475 & 16) == 16) {
                                        ++class153.field2734;
                                        class160.method1208(class173.method1267((byte) 59, new class230[] { class44.field792, class191.field3365, var10.field191 }), (long) var10.field175, -6600, class68.field1275, arg2.field4362, var5, (short) 5);
                                    }
                                } else {
                                    ++class223.field3815;
                                    class230[] var11 = var10.field221;
                                    if (class214.field3718) {
                                        var11 = class173.method1265(arg0 ^ -1479, var11);
                                    }
                                    if (class44.method383(client.method1167(arg2), -60)) {
                                        for (int var12 = 4; var12 >= 3; --var12) {
                                            if (var11 != null && var11[var12] != null) {
                                                ++class1.field9;
                                                byte var13;
                                                if (~var12 == -4) {
                                                    var13 = 7;
                                                } else {
                                                    var13 = 25;
                                                }
                                                class160.method1208(class173.method1267((byte) 59, new class230[] { class88.field1542, var10.field191 }), (long) var10.field175, -6600, var11[var12], arg2.field4362, var5, var13);
                                            } else if (~var12 == -5) {
                                                ++class171.field3027;
                                                class160.method1208(class173.method1267((byte) 59, new class230[] { class88.field1542, var10.field191 }), (long) var10.field175, arg0 ^ 6634, class58.field1099, arg2.field4362, var5, (short) 25);
                                            }
                                        }
                                    }
                                    if (class61.method519(0, client.method1167(arg2))) {
                                        class160.method1208(class173.method1267((byte) 59, new class230[] { class88.field1542, var10.field191 }), (long) var10.field175, -6600, class275.field4832, arg2.field4362, var5, (short) 33);
                                        ++class140.field2510;
                                    }
                                    if (class44.method383(client.method1167(arg2), arg0 + -17) && var11 != null) {
                                        for (int var14 = 2; ~var14 <= -1; --var14) {
                                            if (var11[var14] != null) {
                                                byte var15 = 0;
                                                ++class264.field4698;
                                                if (var14 == 0) {
                                                    var15 = 44;
                                                }
                                                if (~var14 == -2) {
                                                    var15 = 46;
                                                }
                                                if (~var14 == -3) {
                                                    var15 = 26;
                                                }
                                                class160.method1208(class173.method1267((byte) 59, new class230[] { class88.field1542, var10.field191 }), (long) var10.field175, -6600, var11[var14], arg2.field4362, var5, var15);
                                            }
                                        }
                                    }
                                    class230[] var16 = arg2.field4336;
                                    if (class214.field3718) {
                                        var16 = class173.method1265(arg0 ^ -1479, var16);
                                    }
                                    if (var16 != null) {
                                        for (int var17 = 4; var17 >= 0; --var17) {
                                            if (var16[var17] != null) {
                                                ++class85.field1502;
                                                byte var18 = 0;
                                                if (~var17 == -1) {
                                                    var18 = 31;
                                                }
                                                if (~var17 == -2) {
                                                    var18 = 30;
                                                }
                                                if (var17 == 2) {
                                                    var18 = 23;
                                                }
                                                if (var17 == 3) {
                                                    var18 = 45;
                                                }
                                                if (var17 == 4) {
                                                    var18 = 22;
                                                }
                                                class160.method1208(class173.method1267((byte) 59, new class230[] { class88.field1542, var10.field191 }), (long) var10.field175, arg0 ^ 6634, var16[var17], arg2.field4362, var5, var18);
                                            }
                                        }
                                    }
                                    class160.method1208(class173.method1267((byte) 59, new class230[] { class88.field1542, var10.field191 }), (long) var10.field175, arg0 ^ 6634, class177.field3117, arg2.field4362, var5, (short) 1003);
                                }
                            }
                        }
                        ++var5;
                    }
                }
            }
            if (arg2.field4216) {
                if (!class184.field3231) {
                    for (int var19 = 9; var19 >= 5; --var19) {
                        class230 var23 = class78.method651(var19, arg2, (byte) 91);
                        if (var23 != null) {
                            ++class144.field2590;
                            class160.method1208(arg2.field4364, (long) (var19 + 1), -6600, var23, arg2.field4362, arg2.field4313, (short) 1001);
                        }
                    }
                    class230 var20 = class60.method507((byte) -122, arg2);
                    if (var20 != null) {
                        class160.method1208(arg2.field4364, 0L, arg0 + -6554, var20, arg2.field4362, arg2.field4313, (short) 28);
                        ++class89.field1581;
                    }
                    for (int var21 = 4; ~var21 <= -1; --var21) {
                        class230 var22 = class78.method651(var21, arg2, (byte) 91);
                        if (var22 != null) {
                            class160.method1208(arg2.field4364, (long) (var21 + 1), -6600, var22, arg2.field4362, arg2.field4313, (short) 24);
                            ++class144.field2590;
                        }
                    }
                    if (class101.method858(true, client.method1167(arg2))) {
                        ++class275.field4827;
                        class160.method1208(class89.field1580, 0L, arg0 ^ 6634, field2417, arg2.field4362, arg2.field4313, (short) 36);
                        return;
                    }
                    return;
                }
                if (class144.method1099(client.method1167(arg2), arg0 ^ -46) && ~(32 & class138.field2475) == -33) {
                    class160.method1208(class173.method1267((byte) 59, new class230[] { class44.field792, class128.field2268, arg2.field4364 }), 0L, -6600, class68.field1275, arg2.field4362, arg2.field4313, (short) 42);
                    ++class117.field2094;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(II)I")
    public static final int method1044(int arg0, int arg1) {
        ++field2427;
        if (arg0 != 25) {
            return -112;
        } else {
            class100 var2 = class172.method1264(false, arg1);
            int var3 = var2.field1853;
            int var4 = var2.field1850;
            int var5 = var2.field1856;
            int var6 = class99.field1831[var5 - var4];
            return class99.field1838[var3] >> var4 & var6;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg2 != 1876195788) {
            this.method4(-24, (byte) 57);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2147 = arg1.method200(arg2 + -1876195533) == 1;
                }
            } else {
                this.field2418 = arg1.method161(4);
            }
        } else {
            this.field2429 = arg1.method161(4);
        }
        ++field2420;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        int[][] var3 = super.field2152.method1106(arg0, arg1 ^ -32410);
        ++field2428;
        if (super.field2152.field2616) {
            int[][] var4 = this.method960(0, arg0, (byte) -112);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class140.field2505; ++var11) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var10[var11];
                if (this.field2429 > var12) {
                    var6[var11] = this.field2429;
                } else if (this.field2418 >= var12) {
                    var6[var11] = var12;
                } else {
                    var6[var11] = this.field2418;
                }
                if (~var13 <= ~this.field2429) {
                    if (~this.field2418 <= ~var13) {
                        var8[var11] = var13;
                    } else {
                        var8[var11] = this.field2418;
                    }
                } else {
                    var8[var11] = this.field2429;
                }
                if (this.field2429 <= var14) {
                    if (~var14 < ~this.field2418) {
                        var9[var11] = this.field2418;
                    } else {
                        var9[var11] = var14;
                    }
                } else {
                    var9[var11] = this.field2429;
                }
            }
        }
        if (arg1 != 26080) {
            this.field2429 = -42;
        }
        return var3;
    }
}
