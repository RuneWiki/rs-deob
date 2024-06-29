import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class45 {

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field574 = -1;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Ljava/lang/String;")
    public static String field575 = "Loading title screen - ";

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Z")
    public static boolean field572 = false;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)Lpe;")
    public static final class245 method338(int arg0, byte arg1) {
        field573++;
        class245 var2 = (class245) class94.field1460.method1428((long) arg0, (byte) -112);
        if (arg1 <= 6) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class77.field1085.method807((byte) 91, arg0, 3);
            class245 var4 = new class245();
            if (var3 != null) {
                var4.method1656(-128, new class25(var3));
            }
            class94.field1460.method1424((long) arg0, var4, -2003648287);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILhc;ILef;II)V")
    public static final void method339(int arg0, int arg1, class229 arg2, int arg3, class214 arg4, int arg5, int arg6) {
        field570++;
        if (arg2 == null) {
            return;
        }
        int var7 = arg0 * arg0 + arg6 * arg6;
        int var8 = class68.field957 + class29.field392 & 0x7FF;
        int var9 = Math.max(arg4.field3473 / 2, arg4.field3369 / 2) + 10;
        if (var7 > (var9 * var9)) {
            return;
        }
        if (arg1 < 20) {
            method341(-24);
        }
        int var10 = class171.field2675[var8];
        int var11 = class171.field2680[var8];
        int var12 = var10 * 256 / (class116.field1721 + 256);
        int var13 = var11 * 256 / (class116.field1721 + 256);
        int var14 = arg0 * var13 - arg6 * var12 >> 16;
        int var15 = arg0 * var12 + arg6 * var13 >> 16;
        ((class12) arg2).method72(var15 + arg3 + (arg4.field3473 / 2) - (arg2.field3714 / 2), arg4.field3369 / 2 + arg5 + -var14 + -(arg2.field3707 / 2), arg4.field3394, arg4.field3496);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
    public static final void method340(int arg0, int arg1) {
        field571++;
        if (arg0 == -1 || arg1 != -25149 || !class3.field33[arg0]) {
            return;
        }
        class143.field2099.method831((byte) -90, arg0);
        if (class104.field1608[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class104.field1608[arg0].length; var3++) {
            if (class104.field1608[arg0][var3] != null) {
                if (class104.field1608[arg0][var3].field3447 == 2) {
                    var2 = false;
                } else {
                    class104.field1608[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class104.field1608[arg0] = null;
        }
        class3.field33[arg0] = false;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method341(int arg0) {
        field575 = null;
        if (arg0 != -5984) {
            method342(32, -36, 50, -30, (class219) null, -69L, (class219) null, (class219) null);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIILhi;JLhi;Lhi;)V")
    public static final void method342(int arg0, int arg1, int arg2, int arg3, class219 arg4, long arg5, class219 arg6, class219 arg7) {
        class59 var9 = new class59();
        var9.field833 = arg4;
        var9.field825 = arg1 * 128 + 64;
        var9.field824 = arg2 * 128 + 64;
        var9.field826 = arg3;
        var9.field837 = arg5;
        var9.field830 = arg6;
        var9.field823 = arg7;
        int var10 = 0;
        class49 var11 = class90.field1382[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field639; var12++) {
                class284 var13 = var11.field643[var12];
                if ((var13.field4497 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4500.method363();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field832 = -var10;
        if (class90.field1382[arg0][arg1][arg2] == null) {
            class90.field1382[arg0][arg1][arg2] = new class49(arg0, arg1, arg2);
        }
        class90.field1382[arg0][arg1][arg2].field630 = var9;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static final void method343(byte arg0) {
        field578++;
        if (class215.field3510 > 1) {
            class261.field4210 = class141.field2067;
            class215.field3510--;
        }
        if (class59.field831 > 0) {
            class59.field831--;
        }
        if (class186.field2927) {
            class186.field2927 = false;
            class103.method681((byte) -107);
            return;
        }
        for (int var1 = 0; var1 < 100 && class104.method685((byte) -96); var1++) {
        }
        if (class203.field3182 != 30) {
            return;
        }
        class25.method164(-31290, class13.field165, 133);
        Object var2 = class176.field2746.field741;
        synchronized (class176.field2746.field741) {
            if (!class161.field2500) {
                class176.field2746.field751 = 0;
            } else if (class173.field2720 != 0 || class176.field2746.field751 >= 40) {
                class72.field1012++;
                class13.field165.method892(33, (byte) -102);
                class13.field165.method184(0, 100);
                int var3 = class13.field165.field349;
                int var4 = 0;
                for (int var5 = 0; var5 < class176.field2746.field751 && class13.field165.field349 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class176.field2746.field753[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class176.field2746.field752[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class176.field2746.field753[var5] == -1 && class176.field2746.field752[var5] == -1) {
                        var7 = true;
                        var6 = -1;
                        var8 = -1;
                    }
                    if (class264.field4257 != var8 || class151.field2245 != var6) {
                        int var9 = var6 - class151.field2245;
                        int var10 = var8 - class264.field4257;
                        class151.field2245 = var6;
                        class264.field4257 = var8;
                        if (class140.field2057 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class13.field165.method223(-1720191288, (class140.field2057 << 12) + (var10 << 6) + var9);
                            class140.field2057 = 0;
                        } else if (class140.field2057 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class13.field165.method184(class140.field2057 + 128, 118);
                            class13.field165.method223(-1720191288, (var10 << 8) + var9);
                            class140.field2057 = 0;
                        } else if (class140.field2057 < 32) {
                            class13.field165.method184(class140.field2057 + 192, 82);
                            if (var7) {
                                class13.field165.method166(Integer.MIN_VALUE, -3);
                            } else {
                                class13.field165.method166(var8 | var6 << 16, -3);
                            }
                            class140.field2057 = 0;
                        } else {
                            class13.field165.method223(-1720191288, class140.field2057 + 57344);
                            if (var7) {
                                class13.field165.method166(Integer.MIN_VALUE, -3);
                            } else {
                                class13.field165.method166(var8 | var6 << 16, -3);
                            }
                            class140.field2057 = 0;
                        }
                    } else if (class140.field2057 < 2047) {
                        class140.field2057++;
                    }
                }
                class13.field165.method211(-2, class13.field165.field349 - var3);
                if (class176.field2746.field751 <= var4) {
                    class176.field2746.field751 = 0;
                } else {
                    class176.field2746.field751 -= var4;
                    for (int var11 = 0; var11 < class176.field2746.field751; var11++) {
                        class176.field2746.field752[var11] = class176.field2746.field752[var11 + var4];
                        class176.field2746.field753[var11] = class176.field2746.field753[var4 + var11];
                    }
                }
            }
            if (arg0 <= 32) {
                field575 = null;
            }
        }
        if (class173.field2720 != 0) {
            class238.field3808++;
            long var12 = (class136.field2035 - class237.field3798) / 50L;
            class237.field3798 = class136.field2035;
            int var14 = class145.field2140;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var15 = class59.field836;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (class173.field2720 == 2) {
                var16 = 1;
            }
            class13.field165.method892(27, (byte) -109);
            int var17 = (int) var12;
            class13.field165.method221(0, var16 << 15 | var17);
            class13.field165.method167(var15 | var14 << 16, -1246958456);
        }
        if (class97.field1500 > 0) {
            class97.field1500--;
        }
        if (class264.field4251) {
            for (int var18 = 0; var18 < class52.field724; var18++) {
                int var19 = class278.field4412[var18];
                if (var19 == 98 || var19 == 99 || var19 == 96 || var19 == 97) {
                    class199.field3123 = true;
                    break;
                }
            }
        } else if (class123.field1844[96] || class123.field1844[97] || class123.field1844[98] || class123.field1844[99]) {
            class199.field3123 = true;
        }
        if (class199.field3123 && class97.field1500 <= 0) {
            class3.field32++;
            class199.field3123 = false;
            class97.field1500 = 20;
            class13.field165.method892(3, (byte) -82);
            class13.field165.method223(-1720191288, class39.field530);
            class13.field165.method223(-1720191288, class29.field392);
        }
        if (class270.field4301 && !class103.field1598) {
            class103.field1598 = true;
            class13.field165.method892(202, (byte) -112);
            class13.field165.method184(1, 98);
            class16.field191++;
        }
        if (!class270.field4301 && class103.field1598) {
            class103.field1598 = false;
            class16.field191++;
            class13.field165.method892(202, (byte) -112);
            class13.field165.method184(0, 84);
        }
        if (!class21.field256) {
            class258.field4167++;
            class13.field165.method892(67, (byte) -97);
            class13.field165.method166(class153.method1015(126), -3);
            class21.field256 = true;
        }
        class254.method1710(0);
        if (class203.field3182 != 30) {
            return;
        }
        class19.method133(true);
        class164.method1132((byte) -6);
        class6.method38(255);
        class108.field1659++;
        if (class108.field1659 > 750) {
            class103.method681((byte) -107);
            return;
        }
        class211.method1429((byte) -81);
        class246.method1661(-111);
        class240.method1627(false);
        if (class72.field1015 != null) {
            class108.method703((byte) -39);
        }
        for (int var20 = class8.method51(true, (byte) 81); var20 != -1; var20 = class8.method51(false, (byte) 90)) {
            class124.method844(var20, 97);
            class247.field3954[class224.method1526(class216.field3529++, 31)] = var20;
        }
        for (class287 var21 = class170.method1189(false); var21 != null; var21 = class170.method1189(false)) {
            int var22 = var21.method1911(255);
            int var23 = var21.method1919((byte) 119);
            if (var22 == 1) {
                class252.field4024[var23] = var21.field4547;
                class214.field3392[class224.method1526(class94.field1458++, 31)] = var23;
            } else if (var22 == 2) {
                class31.field415[var23] = var21.field4554;
                class271.field4306[class224.method1526(class175.field2741++, 31)] = var23;
            } else if (var22 == 3) {
                class214 var44 = class206.method1403((byte) 7, var23);
                if (!var21.field4554.equals(var44.field3343)) {
                    var44.field3343 = var21.field4554;
                    class55.method397(0, var44);
                }
            } else if (var22 == 4) {
                class214 var24 = class206.method1403((byte) 7, var23);
                int var25 = var21.field4547;
                int var26 = var21.field4549;
                int var27 = var21.field4550;
                if (var24.field3404 != var25 || var24.field3366 != var26 || var24.field3367 != var27) {
                    var24.field3367 = var27;
                    var24.field3404 = var25;
                    var24.field3366 = var26;
                    class55.method397(0, var24);
                }
            } else if (var22 == 5) {
                class214 var28 = class206.method1403((byte) 7, var23);
                if (var21.field4547 != var28.field3501 || var21.field4547 == -1) {
                    var28.field3408 = 0;
                    var28.field3376 = 0;
                    var28.field3498 = 1;
                    var28.field3501 = var21.field4547;
                    class55.method397(0, var28);
                }
            } else if (var22 == 6) {
                int var29 = var21.field4547;
                int var30 = (var29 & 0x7E53) >> 10;
                int var31 = (var29 & 0x3E4) >> 5;
                class214 var32 = class206.method1403((byte) 7, var23);
                int var33 = var29 & 0x1F;
                int var34 = (var30 << 19) + (var31 << 11) + (var33 << 3);
                if (var32.field3374 != var34) {
                    var32.field3374 = var34;
                    class55.method397(0, var32);
                }
            } else if (var22 == 7) {
                class214 var35 = class206.method1403((byte) 7, var23);
                boolean var36 = var21.field4547 == 1;
                if (var35.field3358 != var36) {
                    var35.field3358 = var36;
                    class55.method397(0, var35);
                }
            } else if (var22 == 8) {
                class214 var37 = class206.method1403((byte) 7, var23);
                if (var21.field4547 != var37.field3400 || var21.field4549 != var37.field3442 || var21.field4550 != var37.field3483) {
                    var37.field3442 = var21.field4549;
                    var37.field3400 = var21.field4547;
                    var37.field3483 = var21.field4550;
                    if (var37.field3491 != -1) {
                        if (var37.field3497 > 0) {
                            var37.field3483 = var37.field3483 * 32 / var37.field3497;
                        } else if (var37.field3426 > 0) {
                            var37.field3483 = var37.field3483 * 32 / var37.field3426;
                        }
                    }
                    class55.method397(0, var37);
                }
            } else if (var22 == 9) {
                class214 var43 = class206.method1403((byte) 7, var23);
                if (var21.field4547 != var43.field3491 || var21.field4549 != var43.field3398) {
                    var43.field3398 = var21.field4549;
                    var43.field3491 = var21.field4547;
                    class55.method397(0, var43);
                }
            } else if (var22 == 10) {
                class214 var38 = class206.method1403((byte) 7, var23);
                if (var21.field4547 != var38.field3406 || var21.field4549 != var38.field3427 || var21.field4550 != var38.field3387) {
                    var38.field3387 = var21.field4550;
                    var38.field3406 = var21.field4547;
                    var38.field3427 = var21.field4549;
                    class55.method397(0, var38);
                }
            } else if (var22 == 11) {
                class214 var39 = class206.method1403((byte) 7, var23);
                var39.field3388 = 0;
                var39.field3418 = var39.field3452 = var21.field4549;
                var39.field3479 = 0;
                var39.field3373 = var39.field3469 = var21.field4547;
                class55.method397(0, var39);
            } else if (var22 == 12) {
                class214 var41 = class206.method1403((byte) 7, var23);
                int var42 = var21.field4547;
                if (var41 != null && var41.field3447 == 0) {
                    if (var42 > (var41.field3378 - var41.field3369)) {
                        var42 = var41.field3378 - var41.field3369;
                    }
                    if (var42 < 0) {
                        var42 = 0;
                    }
                    if (var41.field3455 != var42) {
                        var41.field3455 = var42;
                        class55.method397(0, var41);
                    }
                }
            } else if (var22 == 13) {
                class214 var40 = class206.method1403((byte) 7, var23);
                var40.field3437 = var21.field4547;
            }
        }
        if (class147.field2157 != 0) {
            class118.field1740 += 20;
            if (class118.field1740 >= 400) {
                class147.field2157 = 0;
            }
        }
        class80.field1166++;
        if (class262.field4229 != null) {
            class152.field2251++;
            if (class152.field2251 >= 15) {
                class55.method397(0, class262.field4229);
                class262.field4229 = null;
            }
        }
        if (class251.field4016 != null) {
            class55.method397(0, class251.field4016);
            if (class153.field2278 + 5 < class31.field416 || class31.field416 < (class153.field2278 - 5) || (class62.field852 + 5) < class141.field2074 || class141.field2074 < class62.field852 - 5) {
                class129.field1889 = true;
            }
            class73.field1034++;
            if (class106.field1638 == 0) {
                if (class129.field1889 && class73.field1034 >= 5) {
                    if (class251.field4016 == class194.field3056 && class251.field4020 != class2.field17) {
                        class214 var45 = class251.field4016;
                        byte var46 = 0;
                        class98.field1516++;
                        if (class111.field1683 == 1 && var45.field3390 == 206) {
                            var46 = 1;
                        }
                        if (var45.field3341[class2.field17] <= 0) {
                            var46 = 0;
                        }
                        if (client.method1038(var45).method495((byte) 28)) {
                            int var47 = class251.field4020;
                            int var48 = class2.field17;
                            var45.field3341[var48] = var45.field3341[var47];
                            var45.field3441[var48] = var45.field3441[var47];
                            var45.field3341[var47] = -1;
                            var45.field3441[var47] = 0;
                        } else if (var46 == 1) {
                            int var49 = class251.field4020;
                            int var50 = class2.field17;
                            while (var49 != var50) {
                                if (var49 > var50) {
                                    var45.method1455(4, var49, var49 - 1);
                                    var49--;
                                } else if (var49 < var50) {
                                    var45.method1455(4, var49, var49 + 1);
                                    var49++;
                                }
                            }
                        } else {
                            var45.method1455(4, class251.field4020, class2.field17);
                        }
                        class13.field165.method892(230, (byte) -68);
                        class13.field165.method223(-1720191288, class2.field17);
                        class13.field165.method178(128, class251.field4020);
                        class13.field165.method210(class251.field4016.field3474, (byte) 72);
                        class13.field165.method184(var46, 118);
                    }
                } else if ((class190.field3017 == 1 || class90.method606(4626, class245.field3920 - 1)) && class245.field3920 > 2) {
                    class95.method632(102);
                } else if (class245.field3920 > 0) {
                    class73.method497((byte) 38);
                }
                class251.field4016 = null;
                class173.field2720 = 0;
                class152.field2251 = 10;
            }
        }
        class214 var51 = class56.field787;
        class136.field2036 = null;
        class154.field2293 = false;
        class86.field1365 = false;
        class56.field787 = null;
        class214 var52 = class257.field4149;
        class52.field724 = 0;
        class257.field4149 = null;
        while (class172.method1216(-26170) && class52.field724 < 128) {
            class278.field4412[class52.field724] = class194.field3061;
            class271.field4312[class52.field724] = class141.field2069;
            class52.field724++;
        }
        class72.field1015 = null;
        if (class242.field3880 != -1) {
            class264.method1807(0, 0, class242.field3880, 0, 0, -91, class135.field1960, class98.field1510);
        }
        class141.field2067++;
        while (true) {
            class142 var53;
            class214 var54;
            class214 var55;
            do {
                var53 = (class142) class21.field254.method344((byte) -5);
                if (var53 == null) {
                    while (true) {
                        class142 var56;
                        class214 var57;
                        class214 var58;
                        do {
                            var56 = (class142) class200.field3127.method344((byte) -5);
                            if (var56 == null) {
                                while (true) {
                                    class142 var59;
                                    class214 var60;
                                    class214 var61;
                                    do {
                                        var59 = (class142) class175.field2735.method344((byte) -5);
                                        if (var59 == null) {
                                            if (class72.field1015 == null) {
                                                class62.field859 = 0;
                                            }
                                            if (class243.field3885 != null) {
                                                class44.method331(-2);
                                            }
                                            if (class280.field4438 > 0 && class123.field1844[82] && class123.field1844[81] && class232.field3728 != 0) {
                                                int var62 = class276.field4398 - class232.field3728;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class257.method1767(class149.field2227.field1257[0] + class126.field1869, var62, class149.field2227.field1272[0] + class246.field3943, 29102);
                                            }
                                            if (class280.field4438 > 0 && class123.field1844[82] && class123.field1844[81]) {
                                                if (class139.field2050 != -1) {
                                                    class257.method1767(class139.field2050 + class126.field1869, class276.field4398, client.field2314 + class246.field3943, 29102);
                                                }
                                                class130.field1909 = 0;
                                                class73.field1041 = 0;
                                            } else if (class73.field1041 == 2) {
                                                if (class139.field2050 != -1) {
                                                    class51.field706++;
                                                    class13.field165.method892(162, (byte) -66);
                                                    class13.field165.method178(128, class126.field1869 + class139.field2050);
                                                    class13.field165.method222(class154.field2296, 15786);
                                                    class13.field165.method223(-1720191288, class50.field668);
                                                    class13.field165.method193((byte) 92, class246.field3943 + client.field2314);
                                                    class147.field2157 = 1;
                                                    class118.field1740 = 0;
                                                    class38.field513 = class59.field836;
                                                    class272.field4322 = class145.field2140;
                                                }
                                                class73.field1041 = 0;
                                            } else if (class130.field1909 == 2) {
                                                if (class139.field2050 != -1) {
                                                    class192.field3033++;
                                                    class13.field165.method892(215, (byte) -113);
                                                    class13.field165.method223(-1720191288, client.field2314 + class246.field3943);
                                                    class13.field165.method221(0, class139.field2050 + class126.field1869);
                                                    class147.field2157 = 1;
                                                    class118.field1740 = 0;
                                                    class272.field4322 = class145.field2140;
                                                    class38.field513 = class59.field836;
                                                }
                                                class130.field1909 = 0;
                                            } else if (class139.field2050 != -1 && class73.field1041 == 0 && class130.field1909 == 0) {
                                                boolean var63 = class283.method1894((byte) 114, class149.field2227.field1272[0], true, 0, 0, 0, client.field2314, class139.field2050, 0, 0, class149.field2227.field1257[0], 0);
                                                if (var63) {
                                                    class272.field4322 = class145.field2140;
                                                    class147.field2157 = 1;
                                                    class118.field1740 = 0;
                                                    class38.field513 = class59.field836;
                                                }
                                            }
                                            class139.field2050 = -1;
                                            class200.method1378(-6640);
                                            if (class56.field787 != var51) {
                                                if (var51 != null) {
                                                    class55.method397(0, var51);
                                                }
                                                if (class56.field787 != null) {
                                                    class55.method397(0, class56.field787);
                                                }
                                            }
                                            if (class257.field4149 != var52 && class82.field1218 == class136.field1968) {
                                                if (var52 != null) {
                                                    class55.method397(0, var52);
                                                }
                                                if (class257.field4149 != null) {
                                                    class55.method397(0, class257.field4149);
                                                }
                                            }
                                            if (class257.field4149 == null) {
                                                if (class136.field1968 > 0) {
                                                    class136.field1968--;
                                                }
                                            } else if (class82.field1218 > class136.field1968) {
                                                class136.field1968++;
                                                if (class82.field1218 == class136.field1968) {
                                                    class55.method397(0, class257.field4149);
                                                }
                                            }
                                            if (class278.field4414 == 1) {
                                                class40.method317((byte) -60);
                                            } else if (class278.field4414 == 2) {
                                                class212.method1432(-26);
                                            } else {
                                                class164.method1125(2);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class91.field1394[var64]++;
                                            }
                                            int var65 = class79.method551(8);
                                            int var66 = class21.method151((byte) 76);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class59.field831 = 250;
                                                class5.field71++;
                                                class57.method416(0, 14500);
                                                class13.field165.method892(53, (byte) -72);
                                            }
                                            if (class243.field3888 != null && class243.field3888.field3247 == 1) {
                                                if (class243.field3888.field3249 != null) {
                                                    class224.method1525(class246.field3942, class35.field446, 1);
                                                }
                                                class246.field3942 = null;
                                                class35.field446 = false;
                                                class243.field3888 = null;
                                            }
                                            class4.field62++;
                                            class28.field385++;
                                            class126.field1872++;
                                            if (class126.field1872 > 500) {
                                                class126.field1872 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x1) == 1) {
                                                    class41.field556 += class120.field1754;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class194.field3049 += class34.field444;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class72.field1026 += class240.field3851;
                                                }
                                            }
                                            if (class41.field556 < -50) {
                                                class120.field1754 = 2;
                                            }
                                            if (class194.field3049 < -55) {
                                                class34.field444 = 2;
                                            }
                                            if (class72.field1026 < -40) {
                                                class240.field3851 = 1;
                                            }
                                            if (class41.field556 > 50) {
                                                class120.field1754 = -2;
                                            }
                                            if (class72.field1026 > 40) {
                                                class240.field3851 = -1;
                                            }
                                            if (class194.field3049 > 55) {
                                                class34.field444 = -2;
                                            }
                                            if (class28.field385 > 500) {
                                                class28.field385 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class68.field957 += class52.field719;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class116.field1721 += class87.field1370;
                                                }
                                            }
                                            if (class116.field1721 < -20) {
                                                class87.field1370 = 1;
                                            }
                                            if (class116.field1721 > 10) {
                                                class87.field1370 = -1;
                                            }
                                            if (class68.field957 < -60) {
                                                class52.field719 = 2;
                                            }
                                            if (class68.field957 > 60) {
                                                class52.field719 = -2;
                                            }
                                            if (class4.field62 > 50) {
                                                class13.field165.method892(40, (byte) -127);
                                                class168.field2612++;
                                            }
                                            if (class228.field3698) {
                                                class94.method628((byte) -53);
                                                class228.field3698 = false;
                                            }
                                            try {
                                                if (class240.field3833 != null && class13.field165.field349 > 0) {
                                                    class240.field3833.method1843(-111, class13.field165.field339, class13.field165.field349, 0);
                                                    class13.field165.field349 = 0;
                                                    class4.field62 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var69) {
                                                class103.method681((byte) -107);
                                                return;
                                            }
                                        }
                                        var60 = var59.field2079;
                                        if (var60.field3471 < 0) {
                                            break;
                                        }
                                        var61 = class206.method1403((byte) 7, var60.field3477);
                                    } while (var61 == null || var61.field3357 == null || var60.field3471 >= var61.field3357.length || var61.field3357[var60.field3471] != var60);
                                    class202.method1390(var59, (byte) -81);
                                }
                            }
                            var57 = var56.field2079;
                            if (var57.field3471 < 0) {
                                break;
                            }
                            var58 = class206.method1403((byte) 7, var57.field3477);
                        } while (var58 == null || var58.field3357 == null || var58.field3357.length <= var57.field3471 || var58.field3357[var57.field3471] != var57);
                        class202.method1390(var56, (byte) -120);
                    }
                }
                var54 = var53.field2079;
                if (var54.field3471 < 0) {
                    break;
                }
                var55 = class206.method1403((byte) 7, var54.field3477);
            } while (var55 == null || var55.field3357 == null || var54.field3471 >= var55.field3357.length || var55.field3357[var54.field3471] != var54);
            class202.method1390(var53, (byte) 80);
        }
    }
}
