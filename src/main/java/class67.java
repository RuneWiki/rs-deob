import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class67 extends class436 {

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    private int field1045 = 4096;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "Z")
    private boolean field1054 = true;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field1043 = 0;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "[S")
    public static short[] field1046 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "[I")
    public static int[] field1055 = new int[250];

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    public static int field1056 = 0;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field1047;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
    public static final void method455(int arg0, boolean arg1) {
        if (arg0 <= -123) {
            for (class398 var2 = (class398) class140.field1993.method1312((byte) 25); var2 != null; var2 = (class398) class140.field1993.method1304(-51)) {
                if (var2.field5799 != null) {
                    class252.field3467.method852(var2.field5799);
                    var2.field5799 = null;
                }
                if (var2.field5820 != null) {
                    class252.field3467.method852(var2.field5820);
                    var2.field5820 = null;
                }
                var2.method2459(198);
            }
            ++field1050;
            if (arg1) {
                for (class398 var3 = (class398) class286.field3939.method1312((byte) 25); var3 != null; var3 = (class398) class286.field3939.method1304(-66)) {
                    if (var3.field5799 != null) {
                        class252.field3467.method852(var3.field5799);
                        var3.field5799 = null;
                    }
                    var3.method2459(198);
                }
                for (class398 var4 = (class398) class307.field4212.method1413(30381); var4 != null; var4 = (class398) class307.field4212.method1420((byte) 94)) {
                    if (var4.field5799 != null) {
                        class252.field3467.method852(var4.field5799);
                        var4.field5799 = null;
                    }
                    var4.method2459(198);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static void method456(boolean arg0) {
        field1046 = null;
        field1055 = null;
        field1047 = null;
        if (arg0) {
            method455(31, false);
        }
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)Z")
    public static final boolean method457(int arg0) {
        if (arg0 != 31862) {
            method455(-88, true);
        }
        ++field1052;
        return ~class16.field205 != -1 ? true : class60.field845;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 != 34) {
            method457(-38);
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field1054 = ~arg2.method2429(0) == -2;
            }
        } else {
            this.field1045 = arg2.method2403((byte) 51);
        }
        ++field1049;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILkq;Ljava/awt/Component;)Lwe;")
    public static final class233 method458(int arg0, int arg1, int arg2, class351 arg3, Component arg4) {
        ++field1048;
        if (~class327.field4473 == -1) {
            throw new IllegalStateException();
        } else if (~arg2 <= -1 && arg2 < 2) {
            if (~arg1 > -257) {
                arg1 = 256;
            }
            try {
                class233 var5 = (class233) Class.forName("rd").newInstance();
                var5.field3165 = new int[(!class31.field488 ? 1 : 2) * 256];
                var5.field3179 = arg1;
                var5.method1215(arg4);
                var5.field3171 = (arg1 & -1024) + 1024;
                if (~var5.field3171 < -16385) {
                    var5.field3171 = 16384;
                }
                var5.method1217(var5.field3171);
                if (class270.field3679 > 0 && class209.field2821 == null) {
                    class209.field2821 = new class181();
                    class209.field2821.field2529 = arg3;
                    arg3.method2261(class270.field3679, 29171, class209.field2821);
                }
                if (class209.field2821 != null) {
                    if (class209.field2821.field2534[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class209.field2821.field2534[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class201 var6 = new class201(arg3, arg2);
                    var6.field3165 = new int[(class31.field488 ? 2 : 1) * 256];
                    if (arg0 != 1) {
                        return null;
                    } else {
                        var6.field3179 = arg1;
                        var6.method1215(arg4);
                        var6.field3171 = 16384;
                        var6.method1217(var6.field3171);
                        if (~class270.field3679 < -1 && class209.field2821 == null) {
                            class209.field2821 = new class181();
                            class209.field2821.field2529 = arg3;
                            arg3.method2261(class270.field3679, arg0 ^ 29170, class209.field2821);
                        }
                        if (class209.field2821 != null) {
                            if (class209.field2821.field2534[arg2] != null) {
                                throw new IllegalArgumentException();
                            }
                            class209.field2821.field2534[arg2] = var6;
                        }
                        return var6;
                    }
                } catch (Throwable var7) {
                    return new class233();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V")
    public static final void method459(int arg0) {
        ++field1053;
        if (!class398.field5824) {
            class366.field5124 = true;
            if (arg0 == 735) {
                class398.field5824 = true;
                if (!class188.field2609) {
                    class220.field2891 += (-24.0F - class220.field2891) / 2.0F;
                } else {
                    class6.field98 = (float) (-128 & (int) class6.field98 + -65);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
    public static final void method460(boolean arg0) {
        ++field1044;
        if (~class326.field4452 < -2) {
            --class326.field4452;
            class9.field133 = class441.field6398;
        }
        if (class346.field4846 > 0) {
            --class346.field4846;
        }
        if (class28.field439) {
            class28.field439 = false;
            class374.method2447((byte) -10);
        } else {
            if (!class349.field4882) {
                class77.method552(89);
            }
            for (int var1 = 0; ~var1 > -101 && class61.method409((byte) -57); ++var1) {
            }
            if (class79.field1220 == 30) {
                class313.method1986(class442.field6400, 55, (byte) 122);
                Object var2 = class60.field851.field3601;
                synchronized (class60.field851.field3601) {
                    if (!class354.field4962) {
                        class60.field851.field3607 = 0;
                    } else if (~class383.field5452 != -1 || class60.field851.field3607 >= 40) {
                        ++class109.field1613;
                        class442.field6400.method158((byte) 7, 179);
                        class442.field6400.method2396(0, 12450);
                        int var3 = class442.field6400.field5273;
                        int var4 = 0;
                        for (int var5 = 0; class60.field851.field3607 > var5 && ~(class442.field6400.field5273 - var3) > -241; ++var5) {
                            ++var4;
                            int var6 = class60.field851.field3605[var5];
                            if (~var6 > -1) {
                                var6 = 0;
                            } else if (~var6 < -65535) {
                                var6 = 65534;
                            }
                            int var7 = class60.field851.field3606[var5];
                            if (var7 < 0) {
                                var7 = 0;
                            } else if (var7 > 65534) {
                                var7 = 65534;
                            }
                            boolean var8 = false;
                            if (~class60.field851.field3605[var5] == 0 && class60.field851.field3606[var5] == -1) {
                                var7 = -1;
                                var8 = true;
                                var6 = -1;
                            }
                            if (~class105.field1579 == ~var7 && ~class25.field345 == ~var6) {
                                if (~class358.field5044 > -2048) {
                                    ++class358.field5044;
                                }
                            } else {
                                int var9 = -class105.field1579 + var7;
                                class105.field1579 = var7;
                                int var10 = -class25.field345 + var6;
                                class25.field345 = var6;
                                if (class358.field5044 < 8 && ~var9 <= 31 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                                    var10 += 32;
                                    var9 += 32;
                                    class442.field6400.method2416(22064, (class358.field5044 << 12) + ((var9 << 6) - -var10));
                                    class358.field5044 = 0;
                                } else if (~class358.field5044 > -33 && var9 >= -128 && var9 <= 127 && ~var10 <= 127 && ~var10 >= -128) {
                                    var9 += 128;
                                    class442.field6400.method2396(class358.field5044 + 128, 12450);
                                    var10 += 128;
                                    class442.field6400.method2416(22064, (var9 << 8) + var10);
                                    class358.field5044 = 0;
                                } else if (class358.field5044 < 32) {
                                    class442.field6400.method2396(192 - -class358.field5044, 12450);
                                    if (var8) {
                                        class442.field6400.method2386(Integer.MIN_VALUE, 19324);
                                    } else {
                                        class442.field6400.method2386(var6 << 16 | var7, 19324);
                                    }
                                    class358.field5044 = 0;
                                } else {
                                    class442.field6400.method2416(22064, class358.field5044 + 57344);
                                    if (!var8) {
                                        class442.field6400.method2386(var7 | var6 << 16, 19324);
                                    } else {
                                        class442.field6400.method2386(Integer.MIN_VALUE, 19324);
                                    }
                                    class358.field5044 = 0;
                                }
                            }
                        }
                        class442.field6400.method2390(-var3 + class442.field6400.field5273, 109);
                        if (class60.field851.field3607 > var4) {
                            class60.field851.field3607 -= var4;
                            for (int var11 = 0; ~class60.field851.field3607 < ~var11; ++var11) {
                                class60.field851.field3606[var11] = class60.field851.field3606[var4 + var11];
                                class60.field851.field3605[var11] = class60.field851.field3605[var4 + var11];
                            }
                        } else {
                            class60.field851.field3607 = 0;
                        }
                    }
                }
                if (~class383.field5452 != -1) {
                    long var12 = (-class441.field6381 + class300.field4146) / 50L;
                    class441.field6381 = class300.field4146;
                    if (var12 > 32767L) {
                        var12 = 32767L;
                    }
                    int var14 = class361.field5073;
                    if (~var14 > -1) {
                        var14 = 0;
                    } else if (var14 > 65535) {
                        var14 = 65535;
                    }
                    int var15 = class349.field4879;
                    if (var15 >= 0) {
                        if (var15 > 65535) {
                            var15 = 65535;
                        }
                    } else {
                        var15 = 0;
                    }
                    byte var16 = 0;
                    if (class383.field5452 == 2) {
                        var16 = 1;
                    }
                    int var17 = (int) var12;
                    ++class309.field4236;
                    class442.field6400.method158((byte) 7, 147);
                    class442.field6400.method2407(var15 | var14 << 16, 30);
                    class442.field6400.method2416(22064, var17 | var16 << 15);
                }
                if (~class260.field3561 < -1) {
                    --class260.field3561;
                }
                if (class366.field5124 && class260.field3561 <= 0) {
                    class366.field5124 = false;
                    ++class324.field4435;
                    class260.field3561 = 20;
                    class442.field6400.method158((byte) 7, 167);
                    class442.field6400.method2428((int) class6.field98 >> 3, -77);
                    class442.field6400.method2416(22064, (int) class140.field2007 >> 3);
                }
                if (class182.field2540 && !class315.field4351) {
                    class315.field4351 = true;
                    ++class394.field5769;
                    class442.field6400.method158((byte) 7, 122);
                    class442.field6400.method2396(1, 12450);
                }
                if (!class182.field2540 && class315.field4351) {
                    class315.field4351 = false;
                    ++class394.field5769;
                    class442.field6400.method158((byte) 7, 122);
                    class442.field6400.method2396(0, 12450);
                }
                if (!class249.field3451) {
                    class442.field6400.method158((byte) 7, 153);
                    ++class3.field40;
                    class442.field6400.method2377(class223.method1424((byte) -101), -1530088296);
                    class249.field3451 = true;
                }
                if (class5.field79 != null) {
                    if (~class123.field1731 == -3) {
                        class289.method1867(10526);
                    } else if (class123.field1731 == 3) {
                        class258.method1585(-1);
                    }
                }
                if (class398.field5824) {
                    class398.field5824 = false;
                } else {
                    class220.field2891 /= 2.0F;
                }
                if (!class350.field4884) {
                    class10.field143 /= 2.0F;
                } else {
                    class350.field4884 = false;
                }
                class32.method242(false);
                if (class79.field1220 == 30) {
                    class341.method2198(3);
                    class109.method734((byte) 113);
                    class204.method1336((byte) 25);
                    ++class308.field4231;
                    if (~class308.field4231 < -751) {
                        class374.method2447((byte) -10);
                    } else {
                        class48.method336((byte) 96);
                        class73.method488(true);
                        class13.method75((byte) 68);
                        for (int var18 = class192.method1274((byte) 122, true); var18 != -1; var18 = class192.method1274((byte) 30, false)) {
                            class333.method2069(-2, var18);
                            class354.field4986[class318.method2028(31, class163.field2298++)] = var18;
                        }
                        for (class399 var19 = class8.method55(83); var19 != null; var19 = class8.method55(118)) {
                            int var20 = var19.method2580((byte) 8);
                            int var21 = var19.method2584(76);
                            if (var20 == 1) {
                                class220.field2890[var21] = var19.field5842;
                                class27.field435 |= class137.field1958[var21];
                                class395.field5778[class318.method2028(class234.field3189++, 31)] = var21;
                            } else if (~var20 == -3) {
                                class97.field1505[var21] = var19.field5834;
                                class450.field6533[class318.method2028(class300.field4160++, 31)] = var21;
                            } else if (~var20 != -4) {
                                if (~var20 != -5) {
                                    if (~var20 == -6) {
                                        class383 var22 = class290.method1869((byte) 44, var21);
                                        if (var19.field5842 != var22.field5551 || var19.field5842 == -1) {
                                            var22.field5426 = 0;
                                            var22.field5446 = 0;
                                            var22.field5544 = 1;
                                            var22.field5551 = var19.field5842;
                                            class86.method596(14459, var22);
                                        }
                                    } else if (~var20 == -7) {
                                        int var23 = var19.field5842;
                                        int var24 = (32492 & var23) >> 10;
                                        int var25 = (var23 & 1009) >> 5;
                                        int var26 = var23 & 31;
                                        int var27 = (var24 << 19) + (var26 << 3) - -(var25 << 11);
                                        class383 var28 = class290.method1869((byte) 26, var21);
                                        if (var28.field5468 != var27) {
                                            var28.field5468 = var27;
                                            class86.method596(14459, var28);
                                        }
                                    } else if (var20 == 7) {
                                        class383 var29 = class290.method1869((byte) 36, var21);
                                        boolean var30 = ~var19.field5842 == -2;
                                        if (var29.field5444 == !var30) {
                                            var29.field5444 = var30;
                                            class86.method596(14459, var29);
                                        }
                                    } else if (var20 != 8) {
                                        if (var20 == 9) {
                                            class383 var31 = class290.method1869((byte) 82, var21);
                                            if (var19.field5842 != var31.field5569 || ~var19.field5829 != ~var31.field5571) {
                                                var31.field5571 = var19.field5829;
                                                var31.field5569 = var19.field5842;
                                                class86.method596(14459, var31);
                                            }
                                        } else if (var20 != 10) {
                                            if (var20 == 11) {
                                                class383 var32 = class290.method1869((byte) 30, var21);
                                                var32.field5428 = var32.field5581 = var19.field5829;
                                                var32.field5546 = 0;
                                                var32.field5470 = var32.field5439 = var19.field5842;
                                                var32.field5471 = 0;
                                                class86.method596(14459, var32);
                                            } else if (var20 == 12) {
                                                class383 var33 = class290.method1869((byte) 24, var21);
                                                int var34 = var19.field5842;
                                                if (var33 != null && var33.field5488 == 0) {
                                                    if (~var34 < ~(-var33.field5491 + var33.field5590)) {
                                                        var34 = -var33.field5491 + var33.field5590;
                                                    }
                                                    if (var34 < 0) {
                                                        var34 = 0;
                                                    }
                                                    if (~var33.field5434 != ~var34) {
                                                        var33.field5434 = var34;
                                                        class86.method596(14459, var33);
                                                    }
                                                }
                                            } else if (~var20 != -14) {
                                                if (~var20 != -15) {
                                                    if (~var20 == -16) {
                                                        class184.field2575 = var19.field5829;
                                                        class46.field714 = true;
                                                        class394.field5764 = var19.field5842;
                                                    }
                                                } else {
                                                    class383 var35 = class290.method1869((byte) 56, var21);
                                                    var35.field5423 = var19.field5842;
                                                }
                                            } else {
                                                class383 var36 = class290.method1869((byte) 61, var21);
                                                var36.field5515 = var19.field5842;
                                            }
                                        } else {
                                            class383 var37 = class290.method1869((byte) 65, var21);
                                            if (~var19.field5842 != ~var37.field5432 || ~var19.field5829 != ~var37.field5588 || ~var19.field5837 != ~var37.field5479) {
                                                var37.field5432 = var19.field5842;
                                                var37.field5479 = var19.field5837;
                                                var37.field5588 = var19.field5829;
                                                class86.method596(14459, var37);
                                            }
                                        }
                                    } else {
                                        class383 var38 = class290.method1869((byte) 4, var21);
                                        if (~var19.field5842 != ~var38.field5585 || var19.field5829 != var38.field5603 || var19.field5837 != var38.field5504) {
                                            var38.field5603 = var19.field5829;
                                            var38.field5585 = var19.field5842;
                                            var38.field5504 = var19.field5837;
                                            if (var38.field5569 != -1) {
                                                if (~var38.field5521 < -1) {
                                                    var38.field5504 = var38.field5504 * 32 / var38.field5521;
                                                } else if (var38.field5493 > 0) {
                                                    var38.field5504 = var38.field5504 * 32 / var38.field5493;
                                                }
                                            }
                                            class86.method596(14459, var38);
                                        }
                                    }
                                } else {
                                    class383 var39 = class290.method1869((byte) 106, var21);
                                    int var40 = var19.field5842;
                                    int var41 = var19.field5829;
                                    int var42 = var19.field5837;
                                    if (var39.field5457 != var40 || var39.field5554 != var41 || var39.field5437 != var42) {
                                        var39.field5554 = var41;
                                        var39.field5457 = var40;
                                        var39.field5437 = var42;
                                        class86.method596(14459, var39);
                                    }
                                }
                            } else {
                                class383 var43 = class290.method1869((byte) 20, var21);
                                if (!var19.field5834.equals(var43.field5445)) {
                                    var43.field5445 = var19.field5834;
                                    class86.method596(14459, var43);
                                }
                            }
                        }
                        ++class63.field980;
                        if (class204.field2764 != 0) {
                            class369.field5234 += 20;
                            if (~class369.field5234 <= -401) {
                                class204.field2764 = 0;
                            }
                        }
                        if (class15.field173 != null) {
                            ++class437.field6273;
                            if (~class437.field6273 <= -16) {
                                class86.method596(14459, class15.field173);
                                class15.field173 = null;
                            }
                        }
                        class383 var44 = class75.field1168;
                        class383 var45 = class393.field5754;
                        class75.field1168 = null;
                        class259.field3551 = false;
                        class182.field2558 = arg0;
                        class327.field4472 = null;
                        class393.field5754 = null;
                        class327.field4459 = 0;
                        while (class258.method1594((byte) -117) && class327.field4459 < 128) {
                            if (class8.method59(23191) && (class215.field2859 == '`' || class215.field2859 == 167)) {
                                if (class64.method430(0)) {
                                    class168.method1136((byte) -17);
                                } else {
                                    class53.method357(100);
                                }
                            } else {
                                class123.field1724[class327.field4459] = class243.field3356;
                                class327.field4471[class327.field4459] = class215.field2859;
                                ++class327.field4459;
                            }
                        }
                        if (class64.method430(0)) {
                            class169.method1143((byte) 116);
                        }
                        class245.field3389 = null;
                        class123.method820(-1, (class383) null, -1, -8018);
                        class236.method1489(-1, (class383) null, -1, -106);
                        class269.method1657((byte) -73);
                        ++class441.field6398;
                        if (class223.field3010) {
                            class442.field6400.method158((byte) 7, 166);
                            ++class173.field2455;
                            class442.field6400.method2377(class298.field4129 << 28 | class20.field272 << 14 | class280.field3846, -1530088296);
                            class223.field3010 = false;
                        }
                        while (true) {
                            class410 var46;
                            class383 var47;
                            class383 var48;
                            do {
                                var46 = (class410) class405.field5884.method1314((byte) -123);
                                if (var46 == null) {
                                    while (true) {
                                        class410 var49;
                                        class383 var50;
                                        class383 var51;
                                        do {
                                            var49 = (class410) class209.field2814.method1314((byte) -128);
                                            if (var49 == null) {
                                                while (true) {
                                                    class410 var52;
                                                    class383 var53;
                                                    class383 var54;
                                                    do {
                                                        var52 = (class410) class5.field76.method1314((byte) -123);
                                                        if (var52 == null) {
                                                            if (class245.field3389 == null) {
                                                                class299.field4145 = 0;
                                                            }
                                                            if (class142.field2046 != null) {
                                                                class36.method261((byte) 109);
                                                            }
                                                            if (class204.field2771 > 0 && class293.field4056[82] && class293.field4056[81] && ~class107.field1586 != -1) {
                                                                int var55 = -class107.field1586 + class265.field3617;
                                                                if (var55 >= 0) {
                                                                    if (~var55 < -4) {
                                                                        var55 = 3;
                                                                    }
                                                                } else {
                                                                    var55 = 0;
                                                                }
                                                                class99.method701(class354.field4981 - -class307.field4211.field944[0], false, class307.field4211.field956[0] + class449.field6509, var55);
                                                            }
                                                            class272.method1678((byte) -96);
                                                            if (class145.field2106 != null) {
                                                                class86.method596(14459, class145.field2106);
                                                                ++class6.field92;
                                                                if (~class349.field4883 < ~(class427.field6126 + 5) || class427.field6126 + -5 > class349.field4883 || ~class162.field2269 < ~(class298.field4131 + 5) || class162.field2269 < class298.field4131 + -5) {
                                                                    class376.field5359 = true;
                                                                }
                                                                if (class409.field5938 == 0) {
                                                                    if (class376.field5359 && ~class6.field92 <= -6) {
                                                                        if (class286.field3947 == class145.field2106 && ~class437.field6288 != ~class192.field2671) {
                                                                            class383 var56 = class145.field2106;
                                                                            byte var57 = 0;
                                                                            if (class209.field2819 == 1 && ~var56.field5480 == -207) {
                                                                                var57 = 1;
                                                                            }
                                                                            if (~var56.field5564[class192.field2671] >= -1) {
                                                                                var57 = 0;
                                                                            }
                                                                            if (var57 == 1) {
                                                                                int var58 = class437.field6288;
                                                                                int var59 = class192.field2671;
                                                                                while (var58 != var59) {
                                                                                    if (~var59 > ~var58) {
                                                                                        var56.method2500(-1, var58, var58 - 1);
                                                                                        --var58;
                                                                                    } else if (~var59 < ~var58) {
                                                                                        var56.method2500(-1, var58, var58 + 1);
                                                                                        ++var58;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var56.method2500(-1, class437.field6288, class192.field2671);
                                                                            }
                                                                            ++class423.field6073;
                                                                            class442.field6400.method158((byte) 7, 37);
                                                                            class442.field6400.method2386(class145.field2106.field5507, 19324);
                                                                            class442.field6400.method2416(22064, class192.field2671);
                                                                            class442.field6400.method2438(69, class437.field6288);
                                                                            class442.field6400.method2384(var57, true);
                                                                        }
                                                                    } else if ((class202.field2757 == 1 || class298.method1926((byte) -71)) && ~class390.field5740 < -3) {
                                                                        class235.method1483((byte) -111, class162.field2269, class349.field4883);
                                                                    } else if (class265.method1645(true)) {
                                                                        class406.method2610((byte) 90);
                                                                    }
                                                                    class383.field5452 = 0;
                                                                    class437.field6273 = 10;
                                                                    class145.field2106 = null;
                                                                }
                                                            }
                                                            if (class75.field1168 != var44) {
                                                                if (var44 != null) {
                                                                    class86.method596(14459, var44);
                                                                }
                                                                if (class75.field1168 != null) {
                                                                    class86.method596(14459, class75.field1168);
                                                                }
                                                            }
                                                            if (class393.field5754 != var45 && class86.field1318 == class71.field1102) {
                                                                if (var45 != null) {
                                                                    class86.method596(14459, var45);
                                                                }
                                                                if (class393.field5754 != null) {
                                                                    class86.method596(14459, class393.field5754);
                                                                }
                                                            }
                                                            if (class393.field5754 != null) {
                                                                if (~class86.field1318 < ~class71.field1102) {
                                                                    ++class71.field1102;
                                                                    if (~class86.field1318 == ~class71.field1102) {
                                                                        class86.method596(14459, class393.field5754);
                                                                    }
                                                                }
                                                            } else if (class71.field1102 > 0) {
                                                                --class71.field1102;
                                                            }
                                                            for (int var60 = 0; var60 < 5; ++var60) {
                                                                int var10002 = class261.field3572[var60]++;
                                                            }
                                                            int var61 = class299.method1932((byte) -124);
                                                            int var62 = class157.method1056((byte) -128);
                                                            if (var61 > 15000 && var62 > 15000) {
                                                                class346.field4846 = 250;
                                                                class144.method992(14500, 75);
                                                                ++class222.field2979;
                                                                class442.field6400.method158((byte) 7, 13);
                                                            }
                                                            if (class27.field435 && class224.method1425(-26805) - 60000L > class371.field5253) {
                                                                class412.method2637(0);
                                                            }
                                                            ++class144.field2096;
                                                            if (class144.field2096 > 500) {
                                                                class144.field2096 = 0;
                                                                int var63 = (int) (8.0D * Math.random());
                                                                if ((var63 & 4) == 4) {
                                                                    class337.field4598 += class254.field3485;
                                                                }
                                                                if (~(var63 & 2) == -3) {
                                                                    class140.field1982 += class142.field2026;
                                                                }
                                                                if ((1 & var63) == 1) {
                                                                    class429.field6167 += class310.field4245;
                                                                }
                                                            }
                                                            if (class429.field6167 < -50) {
                                                                class310.field4245 = 2;
                                                            }
                                                            if (class429.field6167 > 50) {
                                                                class310.field4245 = -2;
                                                            }
                                                            if (~class140.field1982 > 54) {
                                                                class142.field2026 = 2;
                                                            }
                                                            if (class140.field1982 > 55) {
                                                                class142.field2026 = -2;
                                                            }
                                                            if (class337.field4598 < -40) {
                                                                class254.field3485 = 1;
                                                            }
                                                            if (~class337.field4598 < -41) {
                                                                class254.field3485 = -1;
                                                            }
                                                            ++class225.field3022;
                                                            if (class225.field3022 > 500) {
                                                                class225.field3022 = 0;
                                                                int var64 = (int) (Math.random() * 8.0D);
                                                                if ((2 & var64) == 2) {
                                                                    class23.field312 += class390.field5734;
                                                                }
                                                                if (~(1 & var64) == -2) {
                                                                    class390.field5737 += class23.field309;
                                                                }
                                                            }
                                                            if (~class390.field5737 > 59) {
                                                                class23.field309 = 2;
                                                            }
                                                            if (~class390.field5737 < -61) {
                                                                class23.field309 = -2;
                                                            }
                                                            if (~class23.field312 > 19) {
                                                                class390.field5734 = 1;
                                                            }
                                                            ++class207.field2806;
                                                            if (class23.field312 > 10) {
                                                                class390.field5734 = -1;
                                                            }
                                                            if (class207.field2806 > 50) {
                                                                class442.field6400.method158((byte) 7, 185);
                                                                ++class423.field6087;
                                                            }
                                                            if (class142.field2057) {
                                                                class65.method444((byte) 114);
                                                                class142.field2057 = false;
                                                            }
                                                            try {
                                                                if (class199.field2749 != null && ~class442.field6400.field5273 < -1) {
                                                                    class199.field2749.method1579(0, 5000, class442.field6400.field5258, class442.field6400.field5273);
                                                                    class207.field2806 = 0;
                                                                    class442.field6400.field5273 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var65) {
                                                                class374.method2447((byte) -10);
                                                                return;
                                                            }
                                                        }
                                                        var53 = var52.field5946;
                                                        if (~var53.field5545 > -1) {
                                                            break;
                                                        }
                                                        var54 = class290.method1869((byte) 27, var53.field5538);
                                                    } while (var54 == null || var54.field5465 == null || ~var53.field5545 <= ~var54.field5465.length || var54.field5465[var53.field5545] != var53);
                                                    class111.method738(var52);
                                                }
                                            }
                                            var50 = var49.field5946;
                                            if (~var50.field5545 > -1) {
                                                break;
                                            }
                                            var51 = class290.method1869((byte) 8, var50.field5538);
                                        } while (var51 == null || var51.field5465 == null || ~var50.field5545 <= ~var51.field5465.length || var51.field5465[var50.field5545] != var50);
                                        class111.method738(var49);
                                    }
                                }
                                var47 = var46.field5946;
                                if (var47.field5545 < 0) {
                                    break;
                                }
                                var48 = class290.method1869((byte) 43, var47.field5538);
                            } while (var48 == null || var48.field5465 == null || var47.field5545 >= var48.field5465.length || var48.field5465[var47.field5545] != var47);
                            class111.method738(var46);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class67() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)[[I")
    public final int[][] method85(int arg0, int arg1) {
        ++field1051;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950) {
            int[] var4 = this.method2729(0, arg0 ^ -13348, class190.field2634 & arg1 + -1);
            int[] var5 = this.method2729(0, 0, arg1);
            int[] var6 = this.method2729(0, arg0 + 13348, class190.field2634 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class43.field653 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1045;
                int var12 = (var5[var10 + 1 & class278.field3758] + -var5[var10 + -1 & class278.field3758]) * this.field1045;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var11 / var17;
                    var20 = var12 / var17;
                    var19 = 16777216 / var17;
                }
                if (this.field1054) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = 2048 - -(var18 >> 1);
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        if (arg0 != -13348) {
            field1047 = null;
        }
        return var3;
    }
}
