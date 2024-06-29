import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class122 extends class55 {

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "Lid;")
    public static class149 field2149 = class60.method382("Hidden)2", (byte) 93);

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "Lnc;")
    public static class85 field2152 = new class85(512);

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "Lid;")
    private static class149 field2154 = class60.method382("Attack", (byte) 104);

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "Lid;")
    public static class149 field2159 = class60.method382("Chargement des polices )2 ", (byte) 6);

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field2155 = -1;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "Lid;")
    public static class149 field2160 = field2154;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lid;")
    public static class149 field2158 = class60.method382("Chargement en cours)3 Veuillez patienter)3", (byte) 62);

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lid;")
    public static class149 field2157 = class60.method382("Spielwelt erstellt)3", (byte) 7);

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "B")
    public byte field2143;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Lgd;")
    public class74 field2146;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "[I")
    public static int[] field2153;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)[B")
    public final byte[] method352(int arg0) {
        ++field2145;
        if (!super.field987 && this.field2146.field1340 >= this.field2146.field1321.length + -this.field2143) {
            if (arg0 != 0) {
                this.method352(61);
            }
            return this.field2146.field1321;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILaj;III)V")
    public static final void method861(int arg0, class47 arg1, int arg2, int arg3, int arg4) {
        class279.method1923(64);
        class72.method461(arg0, arg4, arg1.field722 + arg0, arg1.field727 + arg4);
        if (arg3 != 32) {
            field2149 = null;
        }
        if (class62.field1109 != 2 && class62.field1109 != 5 && class164.field3051 != null) {
            int var5 = class55.field985 - -class184.field3320 & 2047;
            int var6 = -(class77.field1449.field2340 / 32) + 464;
            int var7 = class77.field1449.field2347 / 32 + 48;
            ((class46) class164.field3051).method284(arg0, arg4, arg1.field722, arg1.field727, var7, var6, var5, class232.field4093 + 256, arg1.field712, arg1.field870);
            if (class199.field3614 != null) {
                for (int var8 = 0; ~class199.field3614.field4965 < ~var8; ++var8) {
                    if (class199.field3614.method1915(var8, (byte) -103)) {
                        int var9 = (class199.field3614.field4970[var8] + -class125.field2199) * 4 + -(class77.field1449.field2347 / 32) + 2;
                        int var10 = class235.field4123[var5];
                        int var11 = var10 * 256 / (class232.field4093 + 256);
                        int var12 = (class199.field3614.field4969[var8] + -class115.field1969) * 4 + 2 + -(class77.field1449.field2340 / 32);
                        int var13 = class235.field4118[var5];
                        int var14 = var13 * 256 / (class232.field4093 - -256);
                        int var15 = var9 * var14 + var11 * var12 >> 16;
                        class160 var16 = class188.field3364;
                        int var17 = var12 * var14 + -(var9 * var11) >> 16;
                        if (~class199.field3614.method1916(var8, (byte) 102) == -2) {
                            var16 = class6.field73;
                        }
                        if (class199.field3614.method1916(var8, (byte) 108) == 2) {
                            var16 = class173.field3180;
                        }
                        int var18 = var16.method1152(class199.field3614.field4967[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg1.field722 <= var19 && arg1.field722 >= var19 && -arg1.field727 <= var17 && arg1.field727 >= var17) {
                            int var20 = 16777215;
                            if (class199.field3614.field4959[var8] != -1) {
                                var20 = class199.field3614.field4959[var8];
                            }
                            class72.method454(arg1.field712, arg1.field870);
                            var16.method1163(class199.field3614.field4967[var8], arg0 + var19 - -(arg1.field722 / 2), arg1.field727 / 2 + (arg4 - var17), var18, 50, var20, 0, 256, 1, 0, 0);
                            class72.method469();
                        }
                    }
                }
            }
            for (int var21 = 0; class208.field3727 > var21; ++var21) {
                int var56 = class167.field3099[var21] * 4 + 2 - class77.field1449.field2347 / 32;
                int var57 = class273.field4913[var21] * 4 + (2 - class77.field1449.field2340 / 32);
                class268 var58 = class108.method755(11525, class23.field332[var21]);
                if (var58.field4767 != null) {
                    var58 = var58.method1863((byte) -84);
                    if (var58 == null || var58.field4772 == -1) {
                        continue;
                    }
                }
                class257.method1775(arg1, arg0, class24.field357[var58.field4772], true, var56, arg4, var57);
            }
            for (int var22 = 0; var22 < 104; ++var22) {
                for (int var52 = 0; var52 < 104; ++var52) {
                    class157 var53 = class83.field1515[class277.field4948][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 + -(class77.field1449.field2347 / 32);
                        int var55 = var52 * 4 + 2 + -(class77.field1449.field2340 / 32);
                        class257.method1775(arg1, arg0, class206.field3708[0], true, var54, arg4, var55);
                    }
                }
            }
            for (int var23 = 0; class182.field3281 > var23; ++var23) {
                class20 var48 = class38.field572[class110.field1906[var23]];
                if (var48 != null && var48.method117((byte) 62)) {
                    class59 var49 = var48.field296;
                    if (var49 != null && var49.field1046 != null) {
                        var49 = var49.method374(-1);
                    }
                    if (var49 != null && var49.field1069 && var49.field1070) {
                        int var50 = var48.field2347 / 32 - class77.field1449.field2347 / 32;
                        int var51 = var48.field2340 / 32 + -(class77.field1449.field2340 / 32);
                        if (~var49.field1031 == 0) {
                            class257.method1775(arg1, arg0, class206.field3708[1], true, var50, arg4, var51);
                        } else {
                            class257.method1775(arg1, arg0, class24.field357[var49.field1031], true, var50, arg4, var51);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class253.field4432; ++var24) {
                class127 var38 = class107.field1851[class251.field4407[var24]];
                if (var38 != null && var38.method117((byte) 62)) {
                    int var39 = var38.field2347 / 32 + -(class77.field1449.field2347 / 32);
                    int var40 = var38.field2340 / 32 - class77.field1449.field2340 / 32;
                    boolean var41 = false;
                    long var42 = var38.field2243.method1023((byte) -16);
                    for (int var44 = 0; class49.field892 > var44; ++var44) {
                        if (~class87.field1589[var44] == ~var42 && ~class64.field1139[var44] != -1) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; ~class101.field1773 < ~var46; ++var46) {
                        if (~class245.field4305[var46].field1148 == ~var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (~class77.field1449.field2238 != -1 && ~var38.field2238 != -1 && class77.field1449.field2238 == var38.field2238) {
                        var47 = true;
                    }
                    if (!var41) {
                        if (!var45) {
                            if (var47) {
                                class257.method1775(arg1, arg0, class206.field3708[4], true, var39, arg4, var40);
                            } else {
                                class257.method1775(arg1, arg0, class206.field3708[2], true, var39, arg4, var40);
                            }
                        } else {
                            class257.method1775(arg1, arg0, class206.field3708[5], true, var39, arg4, var40);
                        }
                    } else {
                        class257.method1775(arg1, arg0, class206.field3708[3], true, var39, arg4, var40);
                    }
                }
            }
            int var25 = 0;
            class180[] var26 = class189.field3396;
            while (~var26.length < ~var25) {
                class180 var29 = var26[var25];
                if (var29 != null && ~var29.field3248 != -1 && class118.field2022 % 20 < 10) {
                    if (~var29.field3248 == -2 && var29.field3239 >= 0 && ~class38.field572.length < ~var29.field3239) {
                        class20 var30 = class38.field572[var29.field3239];
                        if (var30 != null) {
                            int var31 = var30.field2347 / 32 + -(class77.field1449.field2347 / 32);
                            int var32 = var30.field2340 / 32 + -(class77.field1449.field2340 / 32);
                            class11.method60(arg1, var31, var32, arg4, arg0, var29.field3253, 20);
                        }
                    }
                    if (var29.field3248 == 2) {
                        int var33 = (-class115.field1969 + var29.field3243) * 4 - -2 - class77.field1449.field2340 / 32;
                        int var34 = (var29.field3247 - class125.field2199) * 4 + 2 - class77.field1449.field2347 / 32;
                        class11.method60(arg1, var34, var33, arg4, arg0, var29.field3253, 20);
                    }
                    if (~var29.field3248 == -11 && ~var29.field3239 <= -1 && var29.field3239 < class107.field1851.length) {
                        class127 var35 = class107.field1851[var29.field3239];
                        if (var35 != null) {
                            int var36 = var35.field2340 / 32 - class77.field1449.field2340 / 32;
                            int var37 = var35.field2347 / 32 - class77.field1449.field2347 / 32;
                            class11.method60(arg1, var37, var36, arg4, arg0, var29.field3253, arg3 ^ 52);
                        }
                    }
                }
                ++var25;
            }
            if (~class210.field3748 != -1) {
                int var27 = class210.field3748 * 4 - (-2 - -(class77.field1449.field2347 / 32));
                int var28 = class141.field2598 * 4 + 2 + -(class77.field1449.field2340 / 32);
                class257.method1775(arg1, arg0, class253.field4439, true, var27, arg4, var28);
            }
            class72.method459(arg0 - (-(arg1.field722 / 2) - -1), arg1.field727 / 2 + arg4 + -1, 3, 3, 16777215);
        } else {
            class72.method447(arg0, arg4, 0, arg1.field712, arg1.field870);
        }
        class216.field3819[arg2] = true;
        ++field2144;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Z")
    public static final boolean method862(int arg0, int arg1) {
        class208 var2 = class255.method1757(arg0, -54);
        ++field2147;
        if (var2 == null) {
            return false;
        } else {
            if (arg1 != 32) {
                field2153 = null;
            }
            if (~class29.field427 != -2 && class29.field427 != 2 && ~class236.field4132 != -3) {
                class149 var4 = class138.field2524;
                if (class236.field4132 != 0) {
                    var4 = class237.method1603(new class149[] { class109.field1891, class211.method1434(var2.field3721 + 7000, true) }, -118);
                }
                class149 var5 = class138.field2524;
                if (class159.field2927 != null) {
                    var5 = class237.method1603(new class149[] { class269.field4850, class159.field2927 }, -106);
                }
                class149 var6 = class237.method1603(new class149[] { class156.field2875, var2.field3728, var4, class191.field3432, class211.method1434(class39.field588, true), class86.field1576, class211.method1434(class216.field3807, true), var5, class61.field1094, client.field2846 ? class62.field1122 : class242.field4260, class109.field1892, class82.field1504 ? class62.field1122 : class242.field4260, class150.field2745, class279.field4987 ? class62.field1122 : class242.field4260 }, -96);
                try {
                    class140.field2578.getAppletContext().showDocument(var6.method1063(-8320), "_self");
                    return true;
                } catch (Exception var7) {
                    return false;
                }
            } else {
                byte[] var3 = var2.field3728.method1040(false);
                class44.field673 = new String(var3, 0, var3.length);
                class147.field2652 = var2.field3721;
                if (class236.field4132 != 0) {
                    class184.field3321 = class147.field2652 + 40000;
                    class169.field3130 = class147.field2652 + 50000;
                    class32.field469 = class184.field3321;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)I")
    public final int method348(byte arg0) {
        ++field2148;
        if (this.field2146 == null) {
            return 0;
        } else {
            if (arg0 != -52) {
                field2157 = null;
            }
            return this.field2146.field1340 * 100 / (this.field2146.field1321.length + -this.field2143);
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public static void method863(int arg0) {
        field2158 = null;
        field2157 = null;
        field2149 = null;
        field2153 = null;
        if (arg0 > 22) {
            field2152 = null;
            field2154 = null;
            field2159 = null;
            field2160 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IJZI)Lid;")
    public static final class149 method864(int arg0, long arg1, boolean arg2, int arg3) {
        ++field2150;
        if (~arg3 <= -3 && ~arg3 >= -37) {
            long var5 = arg1 / (long) arg3;
            int var7 = 1;
            while (~var5 != -1L) {
                var5 /= (long) arg3;
                ++var7;
            }
            int var8 = var7;
            if (~arg1 > -1L || arg2) {
                var8 = var7 + 1;
            }
            byte[] var9 = new byte[var8];
            if (~arg1 > -1L) {
                var9[0] = 45;
            } else if (arg2) {
                var9[0] = 43;
            }
            for (int var10 = arg0; ~var7 < ~var10; ++var10) {
                int var12 = (int) (arg1 % (long) arg3);
                arg1 /= (long) arg3;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -10) {
                    var12 += 39;
                }
                var9[-var10 - 1 + var8] = (byte) (var12 + 48);
            }
            class149 var11 = new class149();
            var11.field2694 = var9;
            var11.field2670 = var8;
            return var11;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }
}
