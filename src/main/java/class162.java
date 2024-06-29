import jaclib.memory.Buffer;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class162 extends class459 implements class159 {

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    private int field2058;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Luv;")
    public static class3 field2063 = new class3(49, 4);

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Z")
    public static boolean field2064 = false;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Z")
    public static boolean field2065 = false;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I")
    public final int method865(int arg0) {
        ++field2062;
        return arg0 != 17124 ? 79 : this.field2058;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[BII)V")
    public final void method866(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method2660(false, arg1, arg3);
        if (arg0 != -3211) {
            field2063 = null;
        }
        ++field2059;
        this.field2058 = arg2;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
    public final void method877(byte arg0) {
        super.field6551.method1927(false, this);
        if (arg0 != -11) {
            this.method865(13);
        }
        ++field2060;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Luq;ILjaclib/memory/Buffer;IZ)V")
    public class162(class313 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2058 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
    public static void method878(byte arg0) {
        int var1 = 0 % ((-53 - arg0) / 48);
        field2063 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)I")
    public final int method868(byte arg0) {
        ++field2056;
        if (arg0 <= 44) {
            field2064 = true;
        }
        return super.field6550;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)J")
    public final long method867(int arg0) {
        ++field2057;
        if (arg0 != 6271) {
            field2064 = true;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Luq;I[BIZ)V")
    public class162(class313 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2058 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V")
    public static final void method879(byte arg0) {
        if (~class327.field4494 < -2) {
            class411.field5646 = class591.field8533;
            --class327.field4494;
        }
        ++field2061;
        if (class170.field2155) {
            class170.field2155 = false;
            class2.method5((byte) 70);
        } else {
            if (!class264.field3373) {
                class534.method2976(1073741824);
            }
            if (arg0 > -98) {
                field2065 = true;
            }
            for (int var1 = 0; var1 < 100 && class9.method35(1); ++var1) {
            }
            if (~class630.field9188 == -10) {
                class386.method2334((byte) -80, class526.field7317.method7(true), class272.field3457);
                if (class341.field4741 != null) {
                    if (class341.field4741.field3991 != -1) {
                        class118.method650(true, class121.field1527);
                        class272.field3457.method3042(class341.field4741.field3991, -120);
                        class341.field4741 = null;
                        class151.field1993 = class348.method2175(-123) + 30000L;
                    }
                } else if (class348.method2175(-119) >= class151.field1993) {
                    class341.field4741 = class640.field9293.method227(class78.field1058.field3700, 3);
                }
                class7 var2 = (class7) class644.field9336.method3188((byte) -100);
                if (var2 != null || -2000L + class348.method2175(-127) > class404.field5551) {
                    boolean var3 = false;
                    int var4 = class272.field3457.field7707;
                    for (class7 var5 = (class7) class211.field2722.method3188((byte) -100); var5 != null && class272.field3457.field7707 - var4 < 240; var5 = (class7) class211.field2722.method3182((byte) -121)) {
                        var5.method589(-8880);
                        int var6 = var5.method32(32679);
                        if (var6 >= -1) {
                            if (var6 > 65534) {
                                var6 = 65534;
                            }
                        } else {
                            var6 = -1;
                        }
                        int var7 = var5.method27(2);
                        if (~var7 > 0) {
                            var7 = -1;
                        } else if (~var7 < -65535) {
                            var7 = 65534;
                        }
                        if (class124.field1545 != var7 || ~class304.field3928 != ~var6) {
                            if (!var3) {
                                ++class501.field6951;
                                class118.method650(true, class194.field2514);
                                class272.field3457.method3060(0, -25098);
                                var4 = class272.field3457.field7707;
                                var3 = true;
                            }
                            int var8 = -class124.field1545 + var7;
                            class124.field1545 = var7;
                            int var9 = var6 - class304.field3928;
                            class304.field3928 = var6;
                            int var10 = (int) ((var5.method31(0) - class404.field5551) / 20L);
                            if (~var10 > -9 && var8 >= -32 && var8 <= 31 && var9 >= -32 && ~var9 >= -32) {
                                var8 += 32;
                                var9 += 32;
                                class272.field3457.method3042((var10 << 12) - -(var8 << 6) + var9, 116);
                            } else if (var10 < 32 && ~var8 <= 127 && ~var8 >= -128 && ~var9 <= 127 && ~var9 >= -128) {
                                var8 += 128;
                                var9 += 128;
                                class272.field3457.method3060(var10 + 128, -25098);
                                class272.field3457.method3042((var8 << 8) + var9, 120);
                            } else if (~var10 > -33) {
                                class272.field3457.method3060(var10 + 192, -25098);
                                if (var7 != 1 && var6 != -1) {
                                    class272.field3457.method3071(-35, var6 << 16 | var7);
                                } else {
                                    class272.field3457.method3071(-84, Integer.MIN_VALUE);
                                }
                            } else {
                                class272.field3457.method3042(var10 + 57344, -128);
                                if (var7 != 1 && ~var6 != 0) {
                                    class272.field3457.method3071(-48, var6 << 16 | var7);
                                } else {
                                    class272.field3457.method3071(-83, Integer.MIN_VALUE);
                                }
                            }
                            class404.field5551 = var5.method31(0);
                        }
                    }
                    if (var3) {
                        class272.field3457.method3084((byte) -125, -var4 + class272.field3457.field7707);
                    }
                }
                if (var2 != null) {
                    long var11 = (var2.method31(0) + -class431.field5867) / 50L;
                    class431.field5867 = var2.method31(0);
                    if (~var11 < -32768L) {
                        var11 = 32767L;
                    }
                    int var13 = var2.method32(32679);
                    if (~var13 > -1) {
                        var13 = 0;
                    } else if (var13 > 65535) {
                        var13 = 65535;
                    }
                    int var14 = var2.method27(2);
                    if (var14 >= 0) {
                        if (var14 > 65535) {
                            var14 = 65535;
                        }
                    } else {
                        var14 = 0;
                    }
                    byte var15 = 0;
                    if (~var2.method29((byte) -65) == -3) {
                        var15 = 1;
                    }
                    class118.method650(true, class623.field8997);
                    ++class31.field486;
                    int var16 = (int) var11;
                    class272.field3457.method3042(var16 | var15 << 15, 114);
                    class272.field3457.method3071(-53, var13 << 16 | var14);
                }
                if (~class90.field1222 < -1) {
                    class118.method650(true, class291.field3779);
                    ++class227.field2902;
                    class272.field3457.method3060(class90.field1222 * 3, -25098);
                    for (int var17 = 0; class90.field1222 > var17; ++var17) {
                        class129 var18 = class151.field1994[var17];
                        long var19 = (var18.method690(-31826) + -class108.field1407) / 50L;
                        if (var19 > 65535L) {
                            var19 = 65535L;
                        }
                        class108.field1407 = var18.method690(-31826);
                        class272.field3457.method3060(var18.method693((byte) -108), -25098);
                        class272.field3457.method3042((int) var19, -83);
                    }
                }
                if (class402.field5501 > 0) {
                    --class402.field5501;
                }
                if (class194.field2524 && ~class402.field5501 >= -1) {
                    class402.field5501 = 20;
                    ++class130.field1598;
                    class194.field2524 = false;
                    class118.method650(true, class383.field5351);
                    class272.field3457.method3082((int) class521.field7250 >> 3, 128);
                    class272.field3457.method3082((int) class568.field7951 >> 3, 128);
                }
                if (class70.field921 && !class293.field3815) {
                    ++class501.field6949;
                    class293.field3815 = true;
                    class118.method650(true, class81.field1103);
                    class272.field3457.method3060(1, -25098);
                }
                if (!class70.field921 && class293.field3815) {
                    class293.field3815 = false;
                    ++class501.field6949;
                    class118.method650(true, class81.field1103);
                    class272.field3457.method3060(0, -25098);
                }
                if (!class372.field5181) {
                    class118.method650(true, class621.field8947);
                    ++class483.field6756;
                    class272.field3457.method3060(0, -25098);
                    int var21 = class272.field3457.field7707;
                    class551 var22 = new class551(class4.method10((byte) 65));
                    class501.field6954.method3157(49, var22);
                    class272.field3457.method3063(var22.field7693, 957, 0, var22.field7707);
                    class272.field3457.method3084((byte) -113, class272.field3457.field7707 - var21);
                    class372.field5181 = true;
                }
                if (class199.field2605 != null) {
                    if (~class621.field8952 != -3) {
                        if (~class621.field8952 == -4) {
                            class65.method372((byte) 69);
                        }
                    } else {
                        class488.method2747((byte) -4);
                    }
                }
                if (!class455.field6438) {
                    class628.field9169 /= 2.0F;
                } else {
                    class455.field6438 = false;
                }
                if (field2064) {
                    field2064 = false;
                } else {
                    class418.field5711 /= 2.0F;
                }
                class516.method2867(false);
                if (~class630.field9188 == -10) {
                    class235.method1484(false);
                    class623.method3594(8084);
                    class436.method2535(0);
                    class452.method2631(-31790);
                    ++class189.field2446;
                    if (class189.field2446 > 750) {
                        class2.method5((byte) 70);
                    } else {
                        class402.method2406(false);
                        class505.method2822(false);
                        class33.method189(-1396164368);
                        for (int var23 = class257.field3191.method2358(-105, true); ~var23 != 0; var23 = class257.field3191.method2358(-106, false)) {
                            class123.method665(10391, var23);
                            class69.field911[class143.method783(class130.field1605++, 31)] = var23;
                        }
                        for (class632 var24 = class418.method2478((byte) 125); var24 != null; var24 = class418.method2478((byte) 117)) {
                            int var25 = var24.method3650(101);
                            int var26 = var24.method3651(0);
                            if (~var25 != -2) {
                                if (var25 != 2) {
                                    if (~var25 == -4) {
                                        class447 var27 = class609.method3486(var26, 983030160);
                                        if (!var24.field9204.equals(var27.field6191)) {
                                            var27.field6191 = var24.field9204;
                                            class90.method501(var27, -1);
                                        }
                                    } else if (~var25 != -5) {
                                        if (~var25 != -6) {
                                            if (var25 == 6) {
                                                int var28 = var24.field9198;
                                                int var29 = (32050 & var28) >> 10;
                                                int var30 = (1021 & var28) >> 5;
                                                int var31 = var28 & 31;
                                                int var32 = (var29 << 19) + (var31 << 3) - -(var30 << 11);
                                                class447 var33 = class609.method3486(var26, 983030160);
                                                if (~var33.field6200 != ~var32) {
                                                    var33.field6200 = var32;
                                                    class90.method501(var33, -1);
                                                }
                                            } else if (var25 != 7) {
                                                if (~var25 != -9) {
                                                    if (var25 == 9) {
                                                        class447 var34 = class609.method3486(var26, 983030160);
                                                        if (~var24.field9198 != ~var34.field6263 || ~var24.field9197 != ~var34.field6324) {
                                                            var34.field6263 = var24.field9198;
                                                            var34.field6324 = var24.field9197;
                                                            class90.method501(var34, -1);
                                                        }
                                                    } else if (var25 == 10) {
                                                        class447 var35 = class609.method3486(var26, 983030160);
                                                        if (~var24.field9198 != ~var35.field6195 || var24.field9197 != var35.field6337 || var24.field9203 != var35.field6321) {
                                                            var35.field6195 = var24.field9198;
                                                            var35.field6337 = var24.field9197;
                                                            var35.field6321 = var24.field9203;
                                                            class90.method501(var35, -1);
                                                        }
                                                    } else if (~var25 == -12) {
                                                        class447 var36 = class609.method3486(var26, 983030160);
                                                        var36.field6270 = var36.field6276 = var24.field9197;
                                                        var36.field6335 = var36.field6236 = var24.field9198;
                                                        var36.field6307 = 0;
                                                        var36.field6243 = 0;
                                                        class90.method501(var36, -1);
                                                    } else if (~var25 != -13) {
                                                        if (var25 == 14) {
                                                            class447 var37 = class609.method3486(var26, 983030160);
                                                            var37.field6266 = var24.field9198;
                                                        } else if (var25 == 15) {
                                                            class457.field6527 = true;
                                                            class64.field868 = var24.field9197;
                                                            class281.field3673 = var24.field9198;
                                                        } else if (~var25 == -17) {
                                                            class447 var38 = class609.method3486(var26, 983030160);
                                                            var38.field6182 = var24.field9198;
                                                        }
                                                    } else {
                                                        class447 var39 = class609.method3486(var26, 983030160);
                                                        int var40 = var24.field9198;
                                                        if (var39 != null && var39.field6336 == 0) {
                                                            if (-var39.field6218 + var39.field6309 < var40) {
                                                                var40 = -var39.field6218 + var39.field6309;
                                                            }
                                                            if (~var40 > -1) {
                                                                var40 = 0;
                                                            }
                                                            if (var39.field6280 != var40) {
                                                                var39.field6280 = var40;
                                                                class90.method501(var39, -1);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    class447 var41 = class609.method3486(var26, 983030160);
                                                    if (~var24.field9198 != ~var41.field6333 || ~var24.field9197 != ~var41.field6305 || var24.field9203 != var41.field6174) {
                                                        var41.field6174 = var24.field9203;
                                                        var41.field6333 = var24.field9198;
                                                        var41.field6305 = var24.field9197;
                                                        if (~var41.field6263 != 0) {
                                                            if (var41.field6295 <= 0) {
                                                                if (~var41.field6215 < -1) {
                                                                    var41.field6174 = var41.field6174 * 32 / var41.field6215;
                                                                }
                                                            } else {
                                                                var41.field6174 = var41.field6174 * 32 / var41.field6295;
                                                            }
                                                        }
                                                        class90.method501(var41, -1);
                                                    }
                                                }
                                            } else {
                                                class447 var42 = class609.method3486(var26, 983030160);
                                                boolean var43 = ~var24.field9198 == -2;
                                                if (var42.field6250 == !var43) {
                                                    var42.field6250 = var43;
                                                    class90.method501(var42, -1);
                                                }
                                            }
                                        } else {
                                            class447 var44 = class609.method3486(var26, 983030160);
                                            if (~var24.field9198 != ~var44.field6259 || ~var24.field9198 == 0) {
                                                var44.field6212 = 0;
                                                var44.field6259 = var24.field9198;
                                                var44.field6184 = 0;
                                                var44.field6234 = 1;
                                                class90.method501(var44, -1);
                                            }
                                        }
                                    } else {
                                        class447 var45 = class609.method3486(var26, 983030160);
                                        int var46 = var24.field9198;
                                        int var47 = var24.field9197;
                                        int var48 = var24.field9203;
                                        if (var45.field6308 != var46 || var45.field6193 != var47 || ~var45.field6197 != ~var48) {
                                            var45.field6197 = var48;
                                            var45.field6308 = var46;
                                            var45.field6193 = var47;
                                            class90.method501(var45, -1);
                                        }
                                    }
                                } else {
                                    class45.field644[var26] = var24.field9204;
                                    class450.field6365[class143.method783(class157.field2044++, 31)] = var26;
                                }
                            } else {
                                class121.field1528[var26] = var24.field9198;
                                class184.field2351 |= class36.field553[var26];
                                class166.field2100[class143.method783(31, class375.field5228++)] = var26;
                            }
                        }
                        if (class237.field3044 != 0) {
                            class409.field5609 += 20;
                            if (class409.field5609 >= 400) {
                                class237.field3044 = 0;
                            }
                        }
                        ++class153.field1999;
                        if (class273.field3465 != null) {
                            ++class580.field8073;
                            if (class580.field8073 >= 15) {
                                class90.method501(class273.field3465, -1);
                                class273.field3465 = null;
                            }
                        }
                        class475.field6702 = false;
                        class103.field1353 = null;
                        class516.field7207 = null;
                        class495.field6900 = false;
                        class445.method2588(-1, -1, (class447) null, (byte) -87);
                        class367.method2253(5, -1, -1, (class447) null);
                        if (!class280.field3669) {
                            class48.field659 = -1;
                        }
                        class450.method2620(127);
                        ++class591.field8533;
                        if (class187.field2415) {
                            class118.method650(true, class432.field5881);
                            ++class190.field2448;
                            class272.field3457.method3092(class406.field5577 | class194.field2522 << 28 | class405.field5560 << 14, -125);
                            class187.field2415 = false;
                        }
                        while (true) {
                            class9 var49;
                            class447 var50;
                            class447 var51;
                            do {
                                var49 = (class9) class445.field6147.method3184(-5295);
                                if (var49 == null) {
                                    while (true) {
                                        class9 var52;
                                        class447 var53;
                                        class447 var54;
                                        do {
                                            var52 = (class9) class104.field1366.method3184(-5295);
                                            if (var52 == null) {
                                                while (true) {
                                                    class9 var55;
                                                    class447 var56;
                                                    class447 var57;
                                                    do {
                                                        var55 = (class9) class225.field2879.method3184(-5295);
                                                        if (var55 == null) {
                                                            if (class516.field7207 == null) {
                                                                class538.field7521 = 0;
                                                            }
                                                            if (class15.field162 != null) {
                                                                class320.method1994(0);
                                                            }
                                                            if (~class615.field8876 < -1 && class634.field9227.method2004((byte) 114, 82) && class634.field9227.method2004((byte) 124, 81) && ~class562.field7861 != -1) {
                                                                int var58 = class147.field1899.field6358 - class562.field7861;
                                                                if (var58 >= 0) {
                                                                    if (var58 > 3) {
                                                                        var58 = 3;
                                                                    }
                                                                } else {
                                                                    var58 = 0;
                                                                }
                                                                class141.method761(class147.field1899.field419[0] + class525.field7310, class147.field1899.field417[0] + class58.field786, 69, var58);
                                                            }
                                                            class370.method2265(false);
                                                            for (int var59 = 0; var59 < 5; ++var59) {
                                                                int var10002 = class641.field9305[var59]++;
                                                            }
                                                            if (class184.field2351 && -60000L + class348.method2175(-123) > class335.field4686) {
                                                                class23.method138(1);
                                                            }
                                                            for (class575 var60 = (class575) class434.field5902.method1876((byte) -107); var60 != null; var60 = (class575) class434.field5902.method1877(0)) {
                                                                if (~(class348.method2175(-120) / 1000L - 5L) < ~((long) var60.field8022)) {
                                                                    if (~var60.field8026 < -1) {
                                                                        class392.method2365(var60.field8023 + class362.field5069.method2157(class245.field3103, 4074), (byte) -70, 0, "", 5, "");
                                                                    }
                                                                    if (~var60.field8026 == -1) {
                                                                        class392.method2365(var60.field8023 + class566.field7924.method2157(class245.field3103, 4074), (byte) -93, 0, "", 5, "");
                                                                    }
                                                                    var60.method3394(false);
                                                                }
                                                            }
                                                            ++class94.field1249;
                                                            if (class94.field1249 > 500) {
                                                                class94.field1249 = 0;
                                                                int var61 = (int) (8.0D * Math.random());
                                                                if ((2 & var61) == 2) {
                                                                    class585.field8464 += class636.field9248;
                                                                }
                                                                if ((4 & var61) == 4) {
                                                                    class491.field6868 += class392.field5442;
                                                                }
                                                                if (~(1 & var61) == -2) {
                                                                    class83.field1134 += class550.field7640;
                                                                }
                                                            }
                                                            if (class83.field1134 < -50) {
                                                                class550.field7640 = 2;
                                                            }
                                                            if (~class585.field8464 > 54) {
                                                                class636.field9248 = 2;
                                                            }
                                                            if (class83.field1134 > 50) {
                                                                class550.field7640 = -2;
                                                            }
                                                            if (class585.field8464 > 55) {
                                                                class636.field9248 = -2;
                                                            }
                                                            if (~class491.field6868 > 39) {
                                                                class392.field5442 = 1;
                                                            }
                                                            if (class491.field6868 > 40) {
                                                                class392.field5442 = -1;
                                                            }
                                                            ++class508.field7082;
                                                            if (class508.field7082 > 500) {
                                                                class508.field7082 = 0;
                                                                int var62 = (int) (8.0D * Math.random());
                                                                if (~(2 & var62) == -3) {
                                                                    class54.field728 += class594.field8573;
                                                                }
                                                                if ((1 & var62) == 1) {
                                                                    class374.field5212 += class176.field2272;
                                                                }
                                                            }
                                                            if (class374.field5212 < -60) {
                                                                class176.field2272 = 2;
                                                            }
                                                            if (~class374.field5212 < -61) {
                                                                class176.field2272 = -2;
                                                            }
                                                            if (~class54.field728 > 19) {
                                                                class594.field8573 = 1;
                                                            }
                                                            if (class54.field728 > 10) {
                                                                class594.field8573 = -1;
                                                            }
                                                            ++class426.field5796;
                                                            if (~class426.field5796 < -51) {
                                                                class118.method650(true, class45.field637);
                                                                ++class275.field3578;
                                                            }
                                                            if (class634.field9232) {
                                                                class117.method641(-1);
                                                                class634.field9232 = false;
                                                            }
                                                            try {
                                                                if (class96.field1294 != null && ~class272.field3457.field7707 < -1) {
                                                                    class491.field6866 += class272.field3457.field7707;
                                                                    class96.field1294.method3265(class272.field3457.field7707, 0, (byte) 105, class272.field3457.field7693);
                                                                    class272.field3457.field7707 = 0;
                                                                    class426.field5796 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var63) {
                                                                class2.method5((byte) 70);
                                                                return;
                                                            }
                                                        }
                                                        var56 = var55.field77;
                                                        if (~var56.field6317 > -1) {
                                                            break;
                                                        }
                                                        var57 = class609.method3486(var56.field6244, 983030160);
                                                    } while (var57 == null || var57.field6194 == null || var57.field6194.length <= var56.field6317 || var57.field6194[var56.field6317] != var56);
                                                    class218.method1408(var55);
                                                }
                                            }
                                            var53 = var52.field77;
                                            if (~var53.field6317 > -1) {
                                                break;
                                            }
                                            var54 = class609.method3486(var53.field6244, 983030160);
                                        } while (var54 == null || var54.field6194 == null || ~var54.field6194.length >= ~var53.field6317 || var54.field6194[var53.field6317] != var53);
                                        class218.method1408(var52);
                                    }
                                }
                                var50 = var49.field77;
                                if (~var50.field6317 > -1) {
                                    break;
                                }
                                var51 = class609.method3486(var50.field6244, 983030160);
                            } while (var51 == null || var51.field6194 == null || ~var51.field6194.length >= ~var50.field6317 || var51.field6194[var50.field6317] != var50);
                            class218.method1408(var49);
                        }
                    }
                }
            }
        }
    }
}
