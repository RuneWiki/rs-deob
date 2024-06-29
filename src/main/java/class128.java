import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class128 {

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Lge;")
    private class235 field2358 = new class235(256);

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Lge;")
    private class235 field2360 = new class235(256);

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "Lpi;")
    private class181 field2355;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "Lpi;")
    private class181 field2348;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "[I")
    public static int[] field2346 = new int[1000];

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Lha;")
    public static class46 field2357 = class271.method1828("Musik)2Engine vorbereitet)3", -46);

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Ljj;")
    public static class25 field2350 = null;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method989(int arg0) {
        field2346 = null;
        field2357 = null;
        field2350 = null;
        if (arg0 >= -2) {
            field2346 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III[I)Ldk;")
    private final class224 method990(int arg0, int arg1, int arg2, int[] arg3) {
        field2353++;
        int var5 = arg2 ^ (arg0 & 0xFFF << 4 | arg0 >>> 12);
        if (arg1 != 1312474148) {
            method991((byte) 116, 73);
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class224 var9 = (class224) this.field2360.method1601(102, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class204 var10 = (class204) this.field2358.method1601(arg1 ^ 0xB1C53B8A, var7);
            if (var10 == null) {
                var10 = class204.method1441(this.field2348, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field2358.method1597(var7, (byte) -126, var10);
            }
            class224 var11 = var10.method1440(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method501(0);
                this.field2360.method1597(var7, (byte) -126, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
    public static final void method991(byte arg0, int arg1) {
        if (arg0 < 19) {
            field2359 = -65;
        }
        for (class176 var2 = (class176) class51.field893.method1592(false); var2 != null; var2 = (class176) class51.field893.method1591(89)) {
            if ((var2.field1195 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method501(0);
            }
        }
        field2352++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[IB)Ldk;")
    public final class224 method992(int arg0, int[] arg1, byte arg2) {
        field2351++;
        if (this.field2355.method1301(true) == 1) {
            return this.method995(0, arg0, arg2 ^ 0x24, arg1);
        } else if (this.field2355.method1327(false, arg0) == 1) {
            return this.method995(arg0, 0, arg2 - 36, arg1);
        } else {
            if (arg2 != 44) {
                this.method994((byte) -79, -70, (int[]) null);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z")
    public static final boolean method993(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class63.field1062; var3++) {
            class249 var4 = class131.field2413[var3];
            if (var4.field4399 == 1) {
                int var5 = var4.field4408 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4396 * var5 >> 8) + var4.field4397;
                    int var7 = (var4.field4401 * var5 >> 8) + var4.field4394;
                    int var8 = (var4.field4400 * var5 >> 8) + var4.field4406;
                    int var9 = (var4.field4403 * var5 >> 8) + var4.field4405;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4399 == 2) {
                int var10 = arg0 - var4.field4408;
                if (var10 > 0) {
                    int var11 = (var4.field4396 * var10 >> 8) + var4.field4397;
                    int var12 = (var4.field4401 * var10 >> 8) + var4.field4394;
                    int var13 = (var4.field4400 * var10 >> 8) + var4.field4406;
                    int var14 = (var4.field4403 * var10 >> 8) + var4.field4405;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4399 == 3) {
                int var15 = var4.field4397 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4393 * var15 >> 8) + var4.field4408;
                    int var17 = (var4.field4392 * var15 >> 8) + var4.field4409;
                    int var18 = (var4.field4400 * var15 >> 8) + var4.field4406;
                    int var19 = (var4.field4403 * var15 >> 8) + var4.field4405;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4399 == 4) {
                int var20 = arg2 - var4.field4397;
                if (var20 > 0) {
                    int var21 = (var4.field4393 * var20 >> 8) + var4.field4408;
                    int var22 = (var4.field4392 * var20 >> 8) + var4.field4409;
                    int var23 = (var4.field4400 * var20 >> 8) + var4.field4406;
                    int var24 = (var4.field4403 * var20 >> 8) + var4.field4405;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4399 == 5) {
                int var25 = arg1 - var4.field4406;
                if (var25 > 0) {
                    int var26 = (var4.field4393 * var25 >> 8) + var4.field4408;
                    int var27 = (var4.field4392 * var25 >> 8) + var4.field4409;
                    int var28 = (var4.field4396 * var25 >> 8) + var4.field4397;
                    int var29 = (var4.field4401 * var25 >> 8) + var4.field4394;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI[I)Ldk;")
    public final class224 method994(byte arg0, int arg1, int[] arg2) {
        field2349++;
        int var4 = 97 % ((-arg0 - 9) / 32);
        if (this.field2348.method1301(true) == 1) {
            return this.method990(0, 1312474148, arg1, arg2);
        } else if (this.field2348.method1327(false, arg1) == 1) {
            return this.method990(arg1, 1312474148, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(III[I)Ldk;")
    private final class224 method995(int arg0, int arg1, int arg2, int[] arg3) {
        field2356++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFFE) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class224 var9 = (class224) this.field2360.method1601(-72, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            if (arg2 != 8) {
                method996(-25);
            }
            class44 var10 = class44.method295(this.field2355, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class224 var11 = var10.method296();
            this.field2360.method1597(var7, (byte) -126, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field3920.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public static final void method996(int arg0) {
        class264.field4590 = class61.field1016;
        class230.field4009 = class178.field3202;
        class148.field2660 = class268.field4632;
        class151.field2694 = class178.field3196;
        class185.field3300 = class203.field3632;
        class100.field1845 = class238.field4235;
        class3.field48 = class154.field2736;
        field2354++;
        class274.field4790 = class176.field3162;
        class17.field247 = class120.field2260;
        class92.field1718 = class139.field2494;
        class181.field3256 = class32.field605;
        class51.field892 = class240.field4276;
        class202.field3622 = class194.field3476;
        class162.field2879 = class111.field2104;
        class269.field4642 = class106.field1964;
        class50.field878 = class265.field4599;
        class98.field1818 = class239.field4259;
        class187.field3346 = class102.field1861;
        class233.field4057 = class82.field1585;
        class74.field1321 = class176.field3168;
        class218.field3849 = class76.field1416;
        class246.field4362 = class249.field4388;
        class6.field106 = class272.field4761;
        class14.field215 = class158.field2813;
        class212.field3773 = class40.field695;
        class46.field787 = class106.field1959;
        class97.field1804 = class202.field3626;
        class225.field3941 = class74.field1344;
        class63.field1074 = class106.field1954;
        class214.field3802 = class50.field865;
        class185.field3297 = class162.field2873;
        class58.field969 = class105.field1889;
        class47.field821 = class85.field1630;
        class7.field119 = class106.field1962;
        class229.field3996 = class86.field1640;
        class106.field1917 = class166.field2939;
        class52.field912 = class210.field3745;
        class52.field895 = class83.field1601;
        class203.field3635 = class82.field1574;
        class34.field623 = class155.field2759;
        class267.field4617 = class207.field3718;
        class105.field1881 = class155.field2752;
        class260.field4539 = class23.field336;
        class42.field706 = class184.field3289;
        class116.field2196 = class176.field3161;
        class218.field3847 = class76.field1416;
        class260.field4542 = class23.field336;
        class239.field4263 = class144.field2619;
        class13.field207 = class139.field2491;
        class160.field2827 = class4.field73;
        class183.field3286 = class243.field4313;
        class166.field2928 = class126.field2310;
        class119.field2245 = class130.field2383;
        class28.field556 = class178.field3197;
        class100.field1842 = class84.field1607;
        class30.field578 = class49.field850;
        class38.field666 = class244.field4342;
        class89.field1687 = class87.field1653;
        class119.field2237 = class206.field3694;
        class267.field4627 = class252.field4440;
        class215.field3814 = class237.field4184;
        class275.field4807 = class20.field270;
        class194.field3482 = class23.field338;
        class210.field3757 = class170.field3033;
        class186.field3335 = class6.field105;
        class180.field3221 = class270.field4705;
        class206.field3690 = class122.field2271;
        class196.field3506 = class80.field1518;
        class53.field920 = class271.field4734;
        class168.field2957 = class218.field3854;
        class225.field3942 = class5.field89;
        class105.field1895 = class200.field3572;
        class20.field274 = class115.field2173;
        class229.field3993 = class73.field1307;
        class141.field2542 = class146.field2632;
        class50.field873 = class50.field872;
        class60.field1003 = class42.field705;
        class197.field3514 = class232.field4025;
        class80.field1519 = class23.field339;
        class142.field2595 = class137.field2472;
        class180.field3209 = class263.field4575;
        class162.field2861 = class202.field3628;
        class56.field945 = class188.field3354;
        if (arg0 != 65535) {
            method989(18);
        }
        class257.field4481 = class239.field4260;
        class26.field522 = class277.field4830;
        class97.field1803 = class202.field3626;
        class242.field4300 = class239.field4262;
        class107.field1985 = class168.field2952;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lpi;Lpi;)V")
    public class128(class181 arg0, class181 arg1) {
        this.field2355 = arg0;
        this.field2348 = arg1;
    }
}
