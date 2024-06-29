import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class230 extends class104 {

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "Ljava/lang/String;")
    private String field3355 = "null";

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "Ldh;")
    public static class179 field3359 = new class179(100);

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3363 = null;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "Lsg;")
    public static class42 field3365 = new class42();

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "C")
    public char field3345;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "C")
    public char field3349;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    private int field3350;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "Llb;")
    private class224 field3348;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Llb;")
    public class224 field3352;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "[[B")
    public static byte[][] field3361;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILp;)V", line = 15)
    public final void method1616(int arg0, class107 arg1) {
        if (arg0 <= 63) {
            method1622(51);
        }
        field3353++;
        while (true) {
            int var3 = arg1.method661(-1);
            if (var3 == 0) {
                return;
            }
            this.method1623(arg1, (byte) -110, var3);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 37)
    public final boolean method1617(int arg0, String arg1) {
        field3351++;
        if (this.field3352 == null) {
            return false;
        }
        if (this.field3348 == null) {
            this.method1618((byte) -75);
        }
        class181 var3 = (class181) this.field3348.method1537(class316.method2205(arg1, (byte) -127), arg0 - 38092);
        if (arg0 != 15384) {
            field3359 = (class179) null;
        }
        while (var3 != null) {
            if (var3.field2621.equals(arg1)) {
                return true;
            }
            var3 = (class181) this.field3348.method1538(-1);
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V", line = 67)
    private final void method1618(byte arg0) {
        this.field3348 = new class224(this.field3352.method1535(true));
        for (class31 var2 = (class31) this.field3352.method1540(-122); var2 != null; var2 = (class31) this.field3352.method1544(127)) {
            class181 var3 = new class181(var2.field388, (int) var2.field5065);
            this.field3348.method1541(false, var3, class316.method2205(var2.field388, (byte) -126));
        }
        if (arg0 > -69) {
            field3361 = (byte[][]) ((byte[][]) null);
        }
        field3360++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)I", line = 89)
    public final int method1619(int arg0, int arg1) {
        field3347++;
        if (this.field3352 == null) {
            return this.field3350;
        }
        class172 var3 = (class172) this.field3352.method1537((long) arg1, -22708);
        if (var3 == null) {
            return this.field3350;
        } else {
            if (arg0 != -11) {
                this.method1617(-36, (String) null);
            }
            return var3.field2483;
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V", line = 110)
    public static final void method1620(int arg0) {
        field3358++;
        if (arg0 != 5) {
            field3364 = -20;
        }
        class270.field4255.method1237((byte) 31);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBILcc;I)V", line = 123)
    public static final void method1621(int arg0, byte arg1, int arg2, class263 arg3, int arg4) {
        if (arg1 != 117) {
            return;
        }
        field3354++;
        class239.method1713(31532);
        if (class250.field3787) {
            class306.method2149(arg0, arg2, arg0 + arg3.field3989, arg2 - -arg3.field4096);
        } else {
            class144.method972(arg0, arg2, arg3.field3989 + arg0, arg3.field4096 + arg2);
        }
        if (class68.field894 != 2 && class68.field894 != 5 && class191.field2730 != null) {
            int var5 = class118.field1664.field2392 / 32 + 48;
            int var6 = 464 - (class118.field1664.field2357 / 32);
            int var7 = (int) class280.field4344 + class227.field3248 & 0x7FF;
            if (class250.field3787) {
                ((class202) class191.field2730).method1383(arg0, arg2, arg3.field3989, arg3.field4096, var5, var6, var7, class196.field2807 + 256, (class202) arg3.method1892(19709, false));
            } else {
                ((class189) class191.field2730).method1317(arg0, arg2, arg3.field3989, arg3.field4096, var5, var6, var7, class196.field2807 + 256, arg3.field4015, arg3.field4101);
            }
            if (class27.field352 != null) {
                for (int var8 = 0; var8 < class27.field352.field4249; var8++) {
                    if (class27.field352.method1958((byte) 64, var8)) {
                        int var9 = ((class27.field352.field4243[var8] & 0x3FFF) - class118.field1668) * 4 + 2 - (class118.field1664.field2357 / 32);
                        int var10 = ((class27.field352.field4243[var8] >> 14 & 0x3FFF) - class142.field1992) * 4 + 2 - class118.field1664.field2392 / 32;
                        int var11 = class215.field3024[var7];
                        int var12 = var11 * 256 / (class196.field2807 + 256);
                        int var13 = class215.field3017[var7];
                        int var14 = var13 * 256 / (class196.field2807 + 256);
                        class11 var15 = class276.field4292;
                        int var16 = var9 * var14 - (var10 * var12) >> 16;
                        if (class27.field352.method1961((byte) 124, var8) == 1) {
                            var15 = class179.field2601;
                        }
                        int var17 = var9 * var12 + var10 * var14 >> 16;
                        if (class27.field352.method1961((byte) 118, var8) == 2) {
                            var15 = class88.field1097;
                        }
                        int var18 = var15.method63(class27.field352.field4251[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= -arg3.field3989 && arg3.field3989 >= var19 && -arg3.field4096 <= var16 && var16 <= arg3.field4096) {
                            int var20 = 16777215;
                            if (class27.field352.field4241[var8] != -1) {
                                var20 = class27.field352.field4241[var8];
                            }
                            if (class250.field3787) {
                                class306.method2152((class202) arg3.method1892(19709, false));
                            } else {
                                class144.method978(arg3.field4015, arg3.field4101);
                            }
                            var15.method79(class27.field352.field4251[var8], arg0 + var19 + (arg3.field3989 / 2), arg3.field4096 / 2 + arg2 - var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class250.field3787) {
                                class306.method2155();
                            } else {
                                class144.method956();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class284.field4455; var21++) {
                int var22 = class318.field4887[var21] * 4 + 2 - (class118.field1664.field2392 / 32);
                int var23 = class232.field3394[var21] * 4 + 2 - (class118.field1664.field2357 / 32);
                class238 var24 = class142.method951(class137.field1918[var21], 26915);
                if (var24.field3525 != null) {
                    var24 = var24.method1706(true);
                    if (var24 == null || var24.field3547 == -1) {
                        continue;
                    }
                }
                class321.method2235(arg3, var22, arg1 ^ 0x77, class295.field4606[var24.field3547], arg2, arg0, var23);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class337 var27 = class269.field4239[class138.field1940][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class118.field1664.field2392 / 32);
                        int var29 = var26 * 4 + 2 - (class118.field1664.field2357 / 32);
                        class321.method2235(arg3, var28, arg1 ^ 0x77, class289.field4529[0], arg2, arg0, var29);
                    }
                }
            }
            for (int var30 = 0; var30 < class127.field1735; var30++) {
                class184 var31 = class223.field3159[class269.field4238[var30]];
                if (var31 != null && var31.method744(8)) {
                    class282 var32 = var31.field2657;
                    if (var32 != null && var32.field4401 != null) {
                        var32 = var32.method2021((byte) 22);
                    }
                    if (var32 != null && var32.field4437 && var32.field4435) {
                        int var33 = var31.field2392 / 32 - (class118.field1664.field2392 / 32);
                        int var34 = var31.field2357 / 32 - (class118.field1664.field2357 / 32);
                        if (var32.field4383 == -1) {
                            class321.method2235(arg3, var33, arg1 - 115, class289.field4529[1], arg2, arg0, var34);
                        } else {
                            class321.method2235(arg3, var33, 2, class295.field4606[var32.field4383], arg2, arg0, var34);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class204.field2864; var35++) {
                class109 var36 = class328.field5009[class180.field2612[var35]];
                if (var36 != null && var36.method744(8)) {
                    int var37 = var36.field2392 / 32 - (class118.field1664.field2392 / 32);
                    boolean var38 = false;
                    int var39 = var36.field2357 / 32 - (class118.field1664.field2357 / 32);
                    long var40 = class48.method285((byte) -90, var36.field1496);
                    for (int var42 = 0; var42 < class74.field954; var42++) {
                        if (class233.field3398[var42] == var40 && class132.field1816[var42] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class72.field913; var44++) {
                        if (class170.field2394[var44].field5065 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class118.field1664.field1504 != 0 && var36.field1504 != 0 && class118.field1664.field1504 == var36.field1504) {
                        var45 = true;
                    }
                    if (var38) {
                        class321.method2235(arg3, var37, 2, class289.field4529[3], arg2, arg0, var39);
                    } else if (var43) {
                        class321.method2235(arg3, var37, arg1 - 115, class289.field4529[5], arg2, arg0, var39);
                    } else if (var45) {
                        class321.method2235(arg3, var37, 2, class289.field4529[4], arg2, arg0, var39);
                    } else {
                        class321.method2235(arg3, var37, 2, class289.field4529[2], arg2, arg0, var39);
                    }
                }
            }
            class219[] var46 = class167.field2328;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class219 var48 = var46[var47];
                if (var48 != null && var48.field3079 != 0 && (class38.field463 % 20) < 10) {
                    if (var48.field3079 == 1 && var48.field3077 >= 0 && var48.field3077 < class223.field3159.length) {
                        class184 var49 = class223.field3159[var48.field3077];
                        if (var49 != null) {
                            int var50 = var49.field2392 / 32 - (class118.field1664.field2392 / 32);
                            int var51 = var49.field2357 / 32 - (class118.field1664.field2357 / 32);
                            class7.method23(arg2, arg3, var48.field3075, var51, arg0, var50, 360000, (byte) -79);
                        }
                    }
                    if (var48.field3079 == 2) {
                        int var52 = (var48.field3081 - class142.field1992) * 4 + 2 - (class118.field1664.field2392 / 32);
                        int var53 = var48.field3074 * 4;
                        int var54 = var53 * var53;
                        int var55 = (var48.field3083 - class118.field1668) * 4 + 2 - class118.field1664.field2357 / 32;
                        class7.method23(arg2, arg3, var48.field3075, var55, arg0, var52, var54, (byte) -79);
                    }
                    if (var48.field3079 == 10 && var48.field3077 >= 0 && var48.field3077 < class328.field5009.length) {
                        class109 var56 = class328.field5009[var48.field3077];
                        if (var56 != null) {
                            int var57 = var56.field2357 / 32 - (class118.field1664.field2357 / 32);
                            int var58 = var56.field2392 / 32 - (class118.field1664.field2392 / 32);
                            class7.method23(arg2, arg3, var48.field3075, var57, arg0, var58, 360000, (byte) -79);
                        }
                    }
                }
            }
            if (class110.field1538 != 0) {
                int var59 = class110.field1538 * 4 + (class118.field1664.method748(false) * 2 - 2) + 2 - (class118.field1664.field2392 / 32);
                int var60 = class185.field2669 * 4 + (class118.field1664.method748(false) * 2) - ((class118.field1664.field2357 / 32) + 2 - 2);
                class321.method2235(arg3, var59, 2, class5.field82, arg2, arg0, var60);
            }
            if (class250.field3787) {
                class306.method2154(arg3.field3989 / 2 + arg0 - 1, arg3.field4096 / 2 + arg2 - 1, 3, 3, 16777215);
            } else {
                class144.method977(arg3.field3989 / 2 + (arg0 - 1), arg3.field4096 / 2 + (arg2 - 1), 3, 3, 16777215);
            }
        } else if (class250.field3787) {
            class91 var61 = arg3.method1892(19709, false);
            if (var61 != null) {
                var61.method531(arg0, arg2);
            }
        } else {
            class144.method957(arg0, arg2, 0, arg3.field4015, arg3.field4101);
        }
        class211.field2985[arg4] = true;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V", line = 472)
    public static void method1622(int arg0) {
        field3359 = null;
        if (arg0 != 0) {
            method1620(73);
        }
        field3363 = null;
        field3365 = null;
        field3361 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lp;BI)V", line = 485)
    private final void method1623(class107 arg0, byte arg1, int arg2) {
        field3344++;
        if (arg2 == 1) {
            this.field3345 = class236.method1678(arg0.method679(-3), -1);
        } else if (arg2 == 2) {
            this.field3349 = class236.method1678(arg0.method679(-3), -1);
        } else if (arg2 == 3) {
            this.field3355 = arg0.method628(false);
        } else if (arg2 == 4) {
            this.field3350 = arg0.method676(true);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method624(14612);
            this.field3352 = new class224(class258.method1873(var4, 832520144));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method676(true);
                class332 var7;
                if (arg2 == 5) {
                    var7 = new class31(arg0.method628(false));
                } else {
                    var7 = new class172(arg0.method676(true));
                }
                this.field3352.method1541(false, var7, (long) var6);
            }
        }
        if (arg1 >= -50) {
            field3359 = (class179) null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)Z", line = 538)
    public final boolean method1624(int arg0, int arg1) {
        if (arg1 != 12885) {
            return true;
        }
        field3356++;
        if (this.field3352 == null) {
            return false;
        }
        if (this.field3348 == null) {
            this.method1625((byte) 61);
        }
        class172 var3 = (class172) this.field3348.method1537((long) arg0, -22708);
        return var3 != null;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V", line = 563)
    private final void method1625(byte arg0) {
        field3357++;
        this.field3348 = new class224(this.field3352.method1535(true));
        if (arg0 <= 30) {
            this.method1624(-59, -99);
        }
        for (class172 var2 = (class172) this.field3352.method1540(-123); var2 != null; var2 = (class172) this.field3352.method1544(127)) {
            class172 var3 = new class172((int) var2.field5065);
            this.field3348.method1541(false, var3, (long) var2.field2483);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(BI)Ljava/lang/String;", line = 588)
    public final String method1626(byte arg0, int arg1) {
        field3346++;
        if (this.field3352 == null) {
            return this.field3355;
        }
        if (arg0 != 119) {
            this.method1625((byte) -83);
        }
        class31 var3 = (class31) this.field3352.method1537((long) arg1, -22708);
        return var3 == null ? this.field3355 : var3.field388;
    }
}
