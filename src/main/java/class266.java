import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class266 extends class29 {

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "Ljo;")
    public class226 field3945;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "Ljg;")
    public class281 field3953;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public static int field3941 = 0;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    public static int field3951 = 0;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "Lbn;")
    public static class160 field3944 = new class160(46, 3);

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field3955 = 0;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public int field3949;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public int field3950;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public int field3952;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V")
    public static void method1831(int arg0) {
        if (arg0 > 106) {
            field3944 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(BI)Z")
    public static final boolean method1832(byte arg0, int arg1) {
        field3947++;
        if (arg0 != 119) {
            method1831(20);
        }
        return arg1 == 13 || arg1 == 2 || arg1 == 1004 || arg1 == 57 || arg1 == 50;
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
    public final void method1833(int arg0) {
        this.field3943 = this.field3945.field3376;
        this.field3952 = this.field3945.field3379;
        field3939++;
        this.field3949 = this.field3945.field3382;
        if (this.field3945.field3377 != null) {
            this.field3945.field3377.method829(this.field3953.field4127, this.field3953.field4138, this.field3953.field4135, class120.field1612);
        }
        this.field3950 = class120.field1612[0];
        this.field3948 = class120.field1612[arg0];
    }

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "(I)V")
    public static final void method1834(int arg0) {
        class15.method216((byte) 125, class157.field2113);
        field3942++;
        class195.field2743++;
        if (class76.field968 && class237.field3529) {
            int var1 = class223.field3295.method411(0);
            int var2 = class223.field3295.method415(-98);
            int var3 = var1 - class133.field1834;
            if (arg0 <= -23) {
                int var4 = var2 - class155.field2082;
                if (class195.field2743 > class157.field2113.field3234) {
                    int var5 = var3 - class309.field4558;
                    int var6 = var4 - class375.field5472;
                    if (var5 > class157.field2113.field3299 || var5 < -class157.field2113.field3299 || var6 > class157.field2113.field3299 || -class157.field2113.field3299 > var6) {
                        class322.field4760 = true;
                    }
                }
                if (class44.field589 > var3) {
                    var3 = class44.field589;
                }
                if (class30.field420 > var4) {
                    var4 = class30.field420;
                }
                if (var3 + class157.field2113.field3233 > class44.field589 + class42.field567.field3233) {
                    var3 = class42.field567.field3233 + class44.field589 - class157.field2113.field3233;
                }
                if (var4 + class157.field2113.field3352 > class30.field420 + class42.field567.field3352) {
                    var4 = class30.field420 + class42.field567.field3352 - class157.field2113.field3352;
                }
                int var7 = var3 - (class44.field589 - class42.field567.field3214);
                int var8 = class42.field567.field3307 + var4 - class30.field420;
                if (class157.field2113.field3229 != null && class322.field4760) {
                    class288 var9 = new class288();
                    var9.field4218 = class157.field2113.field3229;
                    var9.field4222 = var8;
                    var9.field4220 = var7;
                    var9.field4217 = class157.field2113;
                    class107.method762(var9);
                }
                if (!class223.field3295.method413(-1)) {
                    if (class322.field4760) {
                        if (class157.field2113.field3206 != null) {
                            class288 var10 = new class288();
                            var10.field4217 = class157.field2113;
                            var10.field4224 = class3.field33;
                            var10.field4220 = var7;
                            var10.field4222 = var8;
                            var10.field4218 = class157.field2113.field3206;
                            class107.method762(var10);
                        }
                        if (class3.field33 != null && client.method1813(class157.field2113) != null) {
                            class416.method2582(class157.field2113, class3.field33, 0);
                        }
                    } else if ((class24.field332 == 1 || class358.method2277(-3497)) && class237.field3532 > 2) {
                        class60.method455(class375.field5472 + class155.field2082, class309.field4558 + class133.field1834, 2, (byte) 0);
                    } else if (class373.method2370((byte) -108)) {
                        class60.method455(class375.field5472 + class155.field2082, class309.field4558 + class133.field1834, 0, (byte) 0);
                    }
                    class157.field2113 = null;
                }
            }
        } else if (class195.field2743 > 1) {
            class157.field2113 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILva;Lva;IIIIIZ)V")
    public static final void method1835(int arg0, int arg1, class58 arg2, class58 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field3954++;
        int var10 = arg2.method275((byte) 119);
        if (var10 == -1) {
            return;
        }
        if (!arg9) {
            field3955 = -126;
        }
        Object var11 = null;
        class285 var12 = (class285) class450.field6642.method2310((byte) -125, (long) var10);
        if (var12 == null) {
            class144[] var13 = class144.method993(class257.field3813, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class74.field942.method100(var13[0], true);
            class450.field6642.method2299(true, var12, (long) var10);
        }
        class33.method315(arg3.method446(10) * 64, arg6 >> 1, arg7 >> 1, (byte) 40, arg3.field4954, arg8, arg3.field4951, 0, arg4, arg3.field4960);
        int var14 = class18.field296[0] + arg0 - 18;
        int var15 = arg1 / 4 * 18 + var14;
        int var16 = class18.field296[1] + arg5 - 54 - 16;
        int var17 = arg1 % 4 * 18 + var16;
        var12.method1915(var15, var17);
        if (arg2 == arg3) {
            class74.field942.method88(18, var15 - 1, -256, 18, var17 - 1, -122);
        }
        class463 var18 = class383.method2425(-1);
        var18.field6834 = var17 + 16;
        var18.field6831 = var15 + 16;
        var18.field6829 = var17;
        var18.field6832 = var15;
        var18.field6828 = arg2;
        class184.field2596.method2024(10, var18);
    }

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "(I)V")
    public static final void method1836(int arg0) {
        field3940++;
        if (class243.field3603 > 0) {
            class243.field3603--;
        }
        if (class15.field246 > 1) {
            class15.field246--;
            class131.field1789 = class26.field384;
        }
        if (class417.field6025) {
            class417.field6025 = false;
            class346.method2239(19858);
            return;
        }
        if (!class286.field4210) {
            class423.method2608((byte) -81);
        }
        for (int var1 = 0; var1 < 100 && class188.method1288(false); var1++) {
        }
        if (class120.field1610 != 30) {
            return;
        }
        class311.method2064(class25.field341.method1071(84), 79, class159.field2132);
        if (class408.field5874 == null) {
            if (class43.method364(-16756) >= class167.field2198) {
                class408.field5874 = class67.field893.method1852(0, class304.field4445);
            }
        } else if (class408.field5874.field5771 != -1) {
            class257.method1773((byte) -10, class226.field3392);
            class159.field2132.method1750((byte) 0, class408.field5874.field5771);
            class408.field5874 = null;
            class167.field2198 = class43.method364(-16756) + 30000L;
        }
        if (class78.field986 != null || class147.field1991 < (class43.method364(-16756) - 2000L)) {
            boolean var2 = false;
            int var3 = class159.field2132.field3762;
            for (class436 var4 = (class436) class38.field538.method2478(1603); var4 != null && (class159.field2132.field3762 - var3) < 240; var4 = (class436) class38.field538.method2486((byte) -82)) {
                var4.method1820(-25246);
                int var5 = var4.method2440(-1);
                if (var5 < 0) {
                    var5 = 0;
                } else if (var5 > 65534) {
                    var5 = 65534;
                }
                int var6 = var4.method2437((byte) 26);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                boolean var7 = false;
                if (var4.method2440(-1) == -1 && var4.method2437((byte) 26) == -1) {
                    var5 = -1;
                    var7 = true;
                    var6 = -1;
                }
                if (class408.field5870 != var6 || class214.field3021 != var5) {
                    if (!var2) {
                        class99.field1224++;
                        class257.method1773((byte) -10, class432.field6290);
                        class159.field2132.method1727(-128, 0);
                        var2 = true;
                        var3 = class159.field2132.field3762;
                    }
                    int var8 = var6 - class408.field5870;
                    class408.field5870 = var6;
                    int var9 = var5 - class214.field3021;
                    class214.field3021 = var5;
                    int var10 = (int) ((var4.method2436((byte) 74) - class147.field1991) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var8 += 32;
                        var9 += 32;
                        class159.field2132.method1750((byte) 0, (var8 << 6) + (var10 << 12) + var9);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        var9 += 128;
                        class159.field2132.method1727(-128, var10 + 128);
                        var8 += 128;
                        class159.field2132.method1750((byte) 0, (var8 << 8) + var9);
                    } else if (var10 < 32) {
                        class159.field2132.method1727(-128, var10 + 192);
                        if (var7) {
                            class159.field2132.method1721(25153, Integer.MIN_VALUE);
                        } else {
                            class159.field2132.method1721(25153, var6 | var5 << 16);
                        }
                    } else {
                        class159.field2132.method1750((byte) 0, var10 + 57344);
                        if (var7) {
                            class159.field2132.method1721(25153, Integer.MIN_VALUE);
                        } else {
                            class159.field2132.method1721(25153, var6 | var5 << 16);
                        }
                    }
                    class147.field1991 = var4.method2436((byte) 74);
                }
            }
            if (var2) {
                class159.field2132.method1753(class159.field2132.field3762 - var3, (byte) 38);
            }
        }
        if (class78.field986 != null) {
            long var11 = (class78.field986.method2436((byte) 74) - class141.field1929) / 50L;
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            class141.field1929 = class78.field986.method2436((byte) 74);
            int var13 = class78.field986.method2440(-1);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = class78.field986.method2437((byte) 26);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (class78.field986.method2441(-3) == 2) {
                var15 = 1;
            }
            int var16 = (int) var11;
            class141.field1919++;
            class257.method1773((byte) -10, class124.field1643);
            class159.field2132.method1761(var14 | var13 << 16, 29912);
            class159.field2132.method1707(var15 << 15 | var16, -70);
        }
        if (class34.field480 > 0) {
            int var17 = 0;
            for (int var18 = 0; var18 < class34.field480; var18++) {
                if (class33.field474[var18].method2457(-85)) {
                    var17++;
                }
            }
            if (var17 > 0) {
                class189.field2635++;
                class257.method1773((byte) -10, class145.field1970);
                if (var17 > 75) {
                    var17 = 75;
                }
                class159.field2132.method1727(-128, var17 * 3);
                for (int var19 = 0; var19 < class34.field480; var19++) {
                    class408 var20 = class33.field474[var19];
                    if (var20.method2457(-109)) {
                        long var21 = (var20.method2460(0) - class450.field6569) / 50L;
                        if (var21 > 65535L) {
                            var21 = 65535L;
                        }
                        class450.field6569 = var20.method2460(0);
                        class159.field2132.method1727(-128, var20.method2459(-1));
                        class159.field2132.method1750((byte) 0, (int) var21);
                    }
                }
            }
        }
        if (class76.field966 > 0) {
            class76.field966--;
        }
        if (class373.field5455 && class76.field966 <= 0) {
            class76.field966 = 20;
            class453.field6677++;
            class373.field5455 = false;
            class257.method1773((byte) -10, class236.field3524);
            class159.field2132.method1707((int) class170.field2220 >> 3, -103);
            class159.field2132.method1744((byte) -108, (int) class1.field19 >> 3);
        }
        if (class129.field1722 && !class336.field4964) {
            class336.field4964 = true;
            class137.field1874++;
            class257.method1773((byte) -10, class157.field2116);
            class159.field2132.method1727(-128, 1);
        }
        if (!class129.field1722 && class336.field4964) {
            class336.field4964 = false;
            class137.field1874++;
            class257.method1773((byte) -10, class157.field2116);
            class159.field2132.method1727(-128, 0);
        }
        if (!class175.field2399) {
            class372.field5434++;
            class257.method1773((byte) -10, class32.field445);
            class159.field2132.method1721(25153, class347.method2243((byte) 112));
            class175.field2399 = true;
        }
        if (class178.field2530 != null) {
            if (class28.field402 == 2) {
                class265.method1830(-126);
            } else if (class28.field402 == 3) {
                class213.method1459(false);
            }
        }
        if (class106.field1427) {
            class106.field1427 = false;
        } else {
            class164.field2166 /= 2.0F;
        }
        if (class242.field3594) {
            class242.field3594 = false;
        } else {
            class299.field4361 /= 2.0F;
        }
        if (arg0 >= -58) {
            field3955 = -84;
        }
        class37.method338(1);
        if (class120.field1610 != 30) {
            return;
        }
        class166.method1101(8407);
        class90.method607((byte) -30);
        class274.method1871(-1834799352);
        class184.field2595++;
        if (class184.field2595 > 750) {
            class346.method2239(19858);
            return;
        }
        class77.method540((byte) -91);
        class370.method2354(-26981);
        class320.method2110(113);
        for (int var23 = class165.method1092(true, 17838); var23 != -1; var23 = class165.method1092(false, 17838)) {
            class400.method2498(var23, 5);
            class75.field959[class386.method2438(31, class109.field1477++)] = var23;
        }
        for (class125 var24 = class13.method200((byte) 106); var24 != null; var24 = class13.method200((byte) 124)) {
            int var25 = var24.method844(64);
            int var26 = var24.method842((byte) 109);
            if (var25 == 1) {
                class447.field6540[var26] = var24.field1657;
                class270.field4008 |= class36.field512[var26];
                class169.field2213[class386.method2438(31, class164.field2172++)] = var26;
            } else if (var25 == 2) {
                class110.field1488[var26] = var24.field1655;
                class72.field938[class386.method2438(31, class188.field2631++)] = var26;
            } else if (var25 == 3) {
                class223 var27 = class432.method2655((byte) -79, var26);
                if (!var24.field1655.equals(var27.field3354)) {
                    var27.field3354 = var24.field1655;
                    class15.method216((byte) 125, var27);
                }
            } else if (var25 == 4) {
                class223 var45 = class432.method2655((byte) -87, var26);
                int var46 = var24.field1657;
                int var47 = var24.field1654;
                int var48 = var24.field1653;
                if (var45.field3337 != var46 || var45.field3343 != var47 || var45.field3239 != var48) {
                    var45.field3337 = var46;
                    var45.field3343 = var47;
                    var45.field3239 = var48;
                    class15.method216((byte) 123, var45);
                }
            } else if (var25 == 5) {
                class223 var28 = class432.method2655((byte) -119, var26);
                if (var24.field1657 != var28.field3242 || var24.field1657 == -1) {
                    var28.field3289 = 0;
                    var28.field3344 = 1;
                    var28.field3242 = var24.field1657;
                    var28.field3287 = 0;
                    class15.method216((byte) 122, var28);
                }
            } else if (var25 == 6) {
                int var29 = var24.field1657;
                int var30 = (var29 & 0x7F1C) >> 10;
                int var31 = var29 >> 5 & 0x1F;
                int var32 = var29 & 0x1F;
                int var33 = (var32 << 3) + (var30 << 19) + (var31 << 11);
                class223 var34 = class432.method2655((byte) -96, var26);
                if (var34.field3300 != var33) {
                    var34.field3300 = var33;
                    class15.method216((byte) 123, var34);
                }
            } else if (var25 == 7) {
                class223 var43 = class432.method2655((byte) -94, var26);
                boolean var44 = var24.field1657 == 1;
                if (var43.field3315 != var44) {
                    var43.field3315 = var44;
                    class15.method216((byte) 127, var43);
                }
            } else if (var25 == 8) {
                class223 var35 = class432.method2655((byte) -86, var26);
                if (var24.field1657 != var35.field3204 || var24.field1654 != var35.field3213 || var24.field1653 != var35.field3353) {
                    var35.field3213 = var24.field1654;
                    var35.field3353 = var24.field1653;
                    var35.field3204 = var24.field1657;
                    if (var35.field3363 != -1) {
                        if (var35.field3326 > 0) {
                            var35.field3353 = var35.field3353 * 32 / var35.field3326;
                        } else if (var35.field3358 > 0) {
                            var35.field3353 = var35.field3353 * 32 / var35.field3358;
                        }
                    }
                    class15.method216((byte) 123, var35);
                }
            } else if (var25 == 9) {
                class223 var36 = class432.method2655((byte) -107, var26);
                if (var24.field1657 != var36.field3363 || var24.field1654 != var36.field3328) {
                    var36.field3328 = var24.field1654;
                    var36.field3363 = var24.field1657;
                    class15.method216((byte) 122, var36);
                }
            } else if (var25 == 10) {
                class223 var42 = class432.method2655((byte) -103, var26);
                if (var24.field1657 != var42.field3316 || var24.field1654 != var42.field3252 || var24.field1653 != var42.field3317) {
                    var42.field3316 = var24.field1657;
                    var42.field3317 = var24.field1653;
                    var42.field3252 = var24.field1654;
                    class15.method216((byte) 125, var42);
                }
            } else if (var25 == 11) {
                class223 var37 = class432.method2655((byte) -69, var26);
                var37.field3288 = var37.field3220 = var24.field1657;
                var37.field3222 = 0;
                var37.field3362 = var37.field3301 = var24.field1654;
                var37.field3278 = 0;
                class15.method216((byte) 125, var37);
            } else if (var25 == 12) {
                class223 var40 = class432.method2655((byte) -92, var26);
                int var41 = var24.field1657;
                if (var40 != null && var40.field3216 == 0) {
                    if (var40.field3318 - var40.field3352 < var41) {
                        var41 = var40.field3318 - var40.field3352;
                    }
                    if (var41 < 0) {
                        var41 = 0;
                    }
                    if (var40.field3307 != var41) {
                        var40.field3307 = var41;
                        class15.method216((byte) 124, var40);
                    }
                }
            } else if (var25 == 14) {
                class223 var39 = class432.method2655((byte) -113, var26);
                var39.field3210 = var24.field1657;
            } else if (var25 == 15) {
                class247.field3647 = var24.field1654;
                class36.field516 = var24.field1657;
                class441.field6418 = true;
            } else if (var25 == 16) {
                class223 var38 = class432.method2655((byte) -78, var26);
                var38.field3226 = var24.field1657;
            }
        }
        class286.field4180++;
        if (class309.field4559 != 0) {
            class31.field435 += 20;
            if (class31.field435 >= 400) {
                class309.field4559 = 0;
            }
        }
        if (class296.field4306 != null) {
            class148.field2007++;
            if (class148.field2007 >= 15) {
                class15.method216((byte) 125, class296.field4306);
                class296.field4306 = null;
            }
        }
        class418.field6031 = null;
        class76.field968 = false;
        class3.field33 = null;
        class237.field3529 = false;
        class278.method1887(-1, -1, -97, (class223) null);
        class51.method394(1, -1, (class223) null, -1);
        class93.method630(0);
        class26.field384++;
        if (class388.field5673) {
            class257.method1773((byte) -10, class242.field3596);
            class3.field36++;
            class159.field2132.method1761(class14.field230 << 14 | class359.field5223 << 28 | class25.field352, 29912);
            class388.field5673 = false;
        }
        while (true) {
            class288 var49;
            class223 var50;
            class223 var51;
            do {
                var49 = (class288) class22.field315.method2476(-29642);
                if (var49 == null) {
                    while (true) {
                        class288 var52;
                        class223 var53;
                        class223 var54;
                        do {
                            var52 = (class288) class409.field5883.method2476(-29642);
                            if (var52 == null) {
                                while (true) {
                                    class288 var55;
                                    class223 var56;
                                    class223 var57;
                                    do {
                                        var55 = (class288) class166.field2188.method2476(-29642);
                                        if (var55 == null) {
                                            if (class418.field6031 == null) {
                                                class196.field2780 = 0;
                                            }
                                            if (class157.field2113 != null) {
                                                method1834(-59);
                                            }
                                            if (class42.field564 > 0 && class436.field6368.method256(-90, 82) && class436.field6368.method256(-83, 81) && class52.field655 != 0) {
                                                int var58 = class187.field2619.field4960 - class52.field655;
                                                if (var58 < 0) {
                                                    var58 = 0;
                                                } else if (var58 > 3) {
                                                    var58 = 3;
                                                }
                                                class387.method2447((byte) 122, class187.field2619.field793[0] + class28.field399, var58, class187.field2619.field784[0] + class134.field1846);
                                            }
                                            class443.method2717(true);
                                            for (int var59 = 0; var59 < 5; var59++) {
                                                int var10002 = class51.field645[var59]++;
                                            }
                                            if (class270.field4008 && class265.field3923 < class43.method364(-16756) - 60000L) {
                                                class387.method2445(-22716);
                                            }
                                            class209.field2943++;
                                            if (class209.field2943 > 500) {
                                                class209.field2943 = 0;
                                                int var60 = (int) (Math.random() * 8.0D);
                                                if ((var60 & 0x2) == 2) {
                                                    class119.field1596 += class115.field1561;
                                                }
                                                if ((var60 & 0x1) == 1) {
                                                    class402.field5806 += class286.field4211;
                                                }
                                                if ((var60 & 0x4) == 4) {
                                                    class146.field1977 += class326.field4804;
                                                }
                                            }
                                            if (class402.field5806 < -50) {
                                                class286.field4211 = 2;
                                            }
                                            if (class119.field1596 < -55) {
                                                class115.field1561 = 2;
                                            }
                                            if (class402.field5806 > 50) {
                                                class286.field4211 = -2;
                                            }
                                            if (class146.field1977 < -40) {
                                                class326.field4804 = 1;
                                            }
                                            if (class119.field1596 > 55) {
                                                class115.field1561 = -2;
                                            }
                                            class393.field5717++;
                                            if (class146.field1977 > 40) {
                                                class326.field4804 = -1;
                                            }
                                            if (class393.field5717 > 500) {
                                                class393.field5717 = 0;
                                                int var61 = (int) (Math.random() * 8.0D);
                                                if ((var61 & 0x1) == 1) {
                                                    class303.field4429 += class93.field1158;
                                                }
                                                if ((var61 & 0x2) == 2) {
                                                    class30.field422 += class451.field6663;
                                                }
                                            }
                                            if (class303.field4429 < -60) {
                                                class93.field1158 = 2;
                                            }
                                            if (class30.field422 < -20) {
                                                class451.field6663 = 1;
                                            }
                                            if (class303.field4429 > 60) {
                                                class93.field1158 = -2;
                                            }
                                            class466.field6857++;
                                            if (class30.field422 > 10) {
                                                class451.field6663 = -1;
                                            }
                                            if (class466.field6857 > 50) {
                                                class257.method1773((byte) -10, class373.field5454);
                                                class18.field289++;
                                            }
                                            if (class153.field2072) {
                                                class274.method1873((byte) 75);
                                                class153.field2072 = false;
                                            }
                                            try {
                                                if (class72.field933 != null && class159.field2132.field3762 > 0) {
                                                    class72.field933.method2694(class159.field2132.field3762, 1, class159.field2132.field3764, 0);
                                                    class466.field6857 = 0;
                                                    class159.field2132.field3762 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var62) {
                                                class346.method2239(19858);
                                                return;
                                            }
                                        }
                                        var56 = var55.field4217;
                                        if (var56.field3270 < 0) {
                                            break;
                                        }
                                        var57 = class432.method2655((byte) -125, var56.field3319);
                                    } while (var57 == null || var57.field3340 == null || var56.field3270 >= var57.field3340.length || var57.field3340[var56.field3270] != var56);
                                    class107.method762(var55);
                                }
                            }
                            var53 = var52.field4217;
                            if (var53.field3270 < 0) {
                                break;
                            }
                            var54 = class432.method2655((byte) -127, var53.field3319);
                        } while (var54 == null || var54.field3340 == null || var54.field3340.length <= var53.field3270 || var54.field3340[var53.field3270] != var53);
                        class107.method762(var52);
                    }
                }
                var50 = var49.field4217;
                if (var50.field3270 < 0) {
                    break;
                }
                var51 = class432.method2655((byte) -64, var50.field3319);
            } while (var51 == null || var51.field3340 == null || var50.field3270 >= var51.field3340.length || var51.field3340[var50.field3270] != var50);
            class107.method762(var49);
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljo;Ldj;)V")
    public class266(class226 arg0, class314 arg1) {
        this.field3945 = arg0;
        this.field3953 = class152.method1041(0, arg0.field3387);
        this.method1833(2);
    }
}
