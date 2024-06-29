import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class133 {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3142 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lad;")
    public static class5 field3141 = new class5();

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Leb;")
    public static class31 field3150 = new class31(64);

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lqf;")
    public static class117 field3156 = class72.method514(107, "<)4col>");

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Z")
    public static boolean field3158 = true;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lp;")
    public static class104 field3155;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Lr;")
    public static class118 field3157;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lha;")
    public static class50 field3147;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[Lr;")
    public static class118[] field3146;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "[Lr;")
    public static class118[] field3154;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static final void method1027(int arg0) {
        field3143++;
        boolean var1 = true;
        class153.method1218(0, false);
        class26.field521 = 0;
        int var2 = 0;
        if (arg0 != -7213) {
            method1030(null, -62, null);
        }
        while (class34.field718.length > var2) {
            if (class100.field2412[var2] != -1 && class34.field718[var2] == null) {
                class34.field718[var2] = field3147.method458(false, 0, class100.field2412[var2]);
                if (class34.field718[var2] == null) {
                    class26.field521++;
                    var1 = false;
                }
            }
            if (class53.field1093[var2] != -1 && class58.field1174[var2] == null) {
                class58.field1174[var2] = field3147.method459(0, class124.field2935[var2], class53.field1093[var2], 0);
                if (class58.field1174[var2] == null) {
                    var1 = false;
                    class26.field521++;
                }
            }
            var2++;
        }
        if (!var1) {
            class112.field2626 = 1;
            return;
        }
        class96.field2343 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class34.field718.length; var4++) {
            byte[] var56 = class58.field1174[var4];
            if (var56 != null) {
                int var57 = (class18.field283[var4] >> 8) * 64 - field3153;
                int var58 = (class18.field283[var4] & 0xFF) * 64 - class19.field312;
                if (class52.field1075) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class79.method623(arg0 + 7190, var57, var58, var56);
            }
        }
        if (!var3) {
            class112.field2626 = 2;
            return;
        }
        if (class112.field2626 != 0) {
            class119.method955(class76.field1659, true, class36.field778, arg0 + 7216);
        }
        class120.method964(1);
        class91.method718(-126);
        class120.method964(1);
        class19.field311.method863();
        class120.method964(arg0 ^ 0xFFFFE3D2);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class107.field2550[var5].method1051(18580);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class73.field1606[var6][var54][var55] = 0;
                }
            }
        }
        class120.method964(1);
        class77.method605(true);
        int var7 = class34.field718.length;
        class70.method491(55);
        class153.method1218(0, true);
        if (!class52.field1075) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class18.field283[var8] >> 8) * 64 - field3153;
                int var18 = (class18.field283[var8] & 0xFF) * 64 - class19.field312;
                byte[] var19 = class34.field718[var8];
                if (var19 != null) {
                    class120.method964(1);
                    class26.method200(var17, 22335, var19, var18, class107.field2550, (class94.field2284 - 6) * 8, (class3.field35 - 6) * 8);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class18.field283[var9] & 0xFF) * 64 - class19.field312;
                byte[] var15 = class34.field718[var9];
                int var16 = (class18.field283[var9] >> 8) * 64 - field3153;
                if (var15 == null && class94.field2284 < 800) {
                    class120.method964(1);
                    class81.method636(var16, 64, (byte) 81, 64, var14);
                }
            }
            class153.method1218(0, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class58.field1174[var10];
                if (var11 != null) {
                    int var12 = (class18.field283[var10] >> 8) * 64 - field3153;
                    int var13 = (class18.field283[var10] & 0xFF) * 64 - class19.field312;
                    class120.method964(arg0 ^ 0xFFFFE3D2);
                    class143.method1163(var12, -21078, var11, class19.field311, var13, class107.field2550);
                }
            }
        }
        if (class52.field1075) {
            for (int var20 = 0; var20 < 4; var20++) {
                class120.method964(1);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class149.field3707[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 24 & 0x3;
                            int var39 = var36 >> 1 & 0x3;
                            int var40 = var36 >> 3 & 0x7FF;
                            int var41 = var36 >> 14 & 0x3FF;
                            int var42 = (var41 / 8 << 8) + var40 / 8;
                            for (int var43 = 0; var43 < class18.field283.length; var43++) {
                                if (class18.field283[var43] == var42 && class34.field718[var43] != null) {
                                    var37 = true;
                                    class45.method309(class107.field2550, (var41 & 0x7) * 8, (var40 & 0x7) * 8, var34 * 8, var35 * 8, var20, true, var38, var39, class34.field718[var43]);
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class114.method891(-121, var35 * 8, var34 * 8, var20);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class149.field3707[0][var21][var32];
                    if (var33 == -1) {
                        class81.method636(var21 * 8, 8, (byte) 106, 8, var32 * 8);
                    }
                }
            }
            class153.method1218(0, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class120.method964(1);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class149.field3707[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class18.field283.length; var31++) {
                                if (class18.field283[var31] == var30 && class58.field1174[var31] != null) {
                                    class32.method257(var22, var23 * 8, var27, (var28 & 0x7) * 8, (var29 & 0x7) * 8, arg0 + 7213, class58.field1174[var31], class19.field311, var24 * 8, class107.field2550, var26);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class153.method1218(0, true);
        class91.method718(-120);
        class120.method964(1);
        method1030(class107.field2550, arg0 ^ 0x7E04, class19.field311);
        class153.method1218(0, true);
        int var44 = class21.field362;
        if (class140.field3344 < var44) {
            var44 = class140.field3344;
        }
        if (var44 < class140.field3344 - 1) {
            int var45 = class140.field3344 - 1;
        }
        if (class20.field334) {
            class19.field311.method842(class21.field362);
        } else {
            class19.field311.method842(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class67.method477(1, var53, var46);
            }
        }
        class120.method964(1);
        class62.method428(23868);
        class58.field1176.method250((byte) -54);
        if (class90.field2195 != null) {
            class152.field3735++;
            class99.field2373.method961(97, -1198);
            class99.field2373.method600(1057001181, arg0 ^ 0x6B1E);
        }
        if (!class52.field1075) {
            int var47 = (class3.field35 - 6) / 8;
            int var48 = (class3.field35 + 6) / 8;
            int var49 = (class94.field2284 + 6) / 8;
            int var50 = (class94.field2284 - 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var50 - 1; var52 <= var49 + 1; var52++) {
                    if (var47 > var51 || var48 < var51 || var52 < var50 || var52 > var49) {
                        field3147.method450((byte) -124, class73.method530((byte) -83, new class117[] { client.field396, class79.method614(15591, var51), class89.field2060, class79.method614(arg0 + 22804, var52) }));
                        field3147.method450((byte) -124, class73.method530((byte) -83, new class117[] { class101.field2436, class79.method614(arg0 + 22804, var51), class89.field2060, class79.method614(15591, var52) }));
                    }
                }
            }
        }
        if (class135.field3227 == -1) {
            class62.method430(30, (byte) -47);
        } else {
            class62.method430(35, (byte) -47);
        }
        class120.method964(1);
        class77.method565(arg0 ^ 0x85A4D4F8);
        class99.field2373.method961(31, -1198);
        class139.method1083(true);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Z")
    public static final boolean method1028(int arg0) {
        field3149++;
        if (arg0 != 13) {
            method1027(59);
        }
        long var1 = class122.method977(false);
        int var3 = (int) (var1 - class48.field1013);
        class48.field1013 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class126.field2992 += var3;
        if (class58.field1182 == 0 && class117.field2828 == 0 && class58.field1175 == 0 && class36.field750 == 0) {
            return true;
        } else if (class126.field2977 == null) {
            return false;
        } else {
            try {
                if (class126.field2992 > 30000) {
                    throw new IOException();
                }
                while (class117.field2828 < 20 && class36.field750 > 0) {
                    class26 var4 = (class26) class71.field1514.method1222(arg0 - 13);
                    class77 var5 = new class77(4);
                    var5.method571(1, -11124);
                    var5.method568((int) var4.field1495, 990);
                    class126.field2977.method736((byte) 42, var5.field1748, 4, 0);
                    class48.field966.method1219(var4, (byte) 124, var4.field1495);
                    class117.field2828++;
                    class36.field750--;
                }
                while (class58.field1182 < 20 && class58.field1175 > 0) {
                    class26 var6 = (class26) class150.field3721.method639((byte) 47);
                    class77 var7 = new class77(4);
                    var7.method571(0, -11124);
                    var7.method568((int) var6.field1495, 990);
                    class126.field2977.method736((byte) 42, var7.field1748, 4, 0);
                    var6.method185(arg0 - 123);
                    class35.field726.method1219(var6, (byte) 30, var6.field1495);
                    class58.field1175--;
                    class58.field1182++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class126.field2977.method731(arg0 - 13);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class126.field2992 = 0;
                    byte var10 = 0;
                    if (class103.field2496 == null) {
                        var10 = 8;
                    } else if (class68.field1420 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class140.field3336.field1691;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class126.field2977.method729(var11, class140.field3336.field1691, (byte) 122, class140.field3336.field1748);
                        if (class34.field716 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class140.field3336.field1748[class140.field3336.field1691 + var12] = (byte) class138.method1074(class140.field3336.field1748[class140.field3336.field1691 + var12], class34.field716);
                            }
                        }
                        class140.field3336.field1691 += var11;
                        if (class140.field3336.field1691 < var10) {
                            break;
                        }
                        if (class103.field2496 == null) {
                            class140.field3336.field1691 = 0;
                            int var13 = class140.field3336.method570((byte) 123);
                            int var14 = class140.field3336.method597(121);
                            long var15 = (long) ((var13 << 16) + var14);
                            int var17 = class140.field3336.method570((byte) 123);
                            int var18 = class140.field3336.method554((byte) 74);
                            class26 var19 = (class26) class48.field966.method1221(16, var15);
                            class82.field1875 = true;
                            if (var19 == null) {
                                var19 = (class26) class35.field726.method1221(87, var15);
                                class82.field1875 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var17 == 0 ? 5 : 9;
                            class103.field2496 = var19;
                            class146.field3575 = new class77(var18 + var20 + class103.field2496.field509);
                            class146.field3575.method571(var17, arg0 ^ 0xFFFFD481);
                            class146.field3575.method600(var18, arg0 ^ 0xFFFF88C0);
                            class140.field3336.field1691 = 0;
                            class68.field1420 = 8;
                        } else if (class68.field1420 == 0) {
                            if (class140.field3336.field1748[0] == -1) {
                                class68.field1420 = 1;
                                class140.field3336.field1691 = 0;
                            } else {
                                class103.field2496 = null;
                            }
                        }
                    } else {
                        int var21 = class146.field3575.field1748.length - class103.field2496.field509;
                        int var22 = 512 - class68.field1420;
                        if (var22 > var21 - class146.field3575.field1691) {
                            var22 = var21 - class146.field3575.field1691;
                        }
                        if (var9 < var22) {
                            var22 = var9;
                        }
                        class126.field2977.method729(var22, class146.field3575.field1691, (byte) 124, class146.field3575.field1748);
                        if (class34.field716 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class146.field3575.field1748[class146.field3575.field1691 + var23] = (byte) class138.method1074(class146.field3575.field1748[class146.field3575.field1691 + var23], class34.field716);
                            }
                        }
                        class146.field3575.field1691 += var22;
                        class68.field1420 += var22;
                        if (class146.field3575.field1691 == var21) {
                            if (class103.field2496.field1495 == 16711935L) {
                                class77.field1716 = class146.field3575;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class50 var26 = class77.field1689[var25];
                                    if (var26 != null) {
                                        class77.field1716.field1691 = var25 * 8 + 5;
                                        int var27 = class77.field1716.method554((byte) 96);
                                        int var28 = class77.field1716.method554((byte) 83);
                                        var26.method378(-103, var28, var27);
                                    }
                                }
                            } else {
                                class69.field1439.reset();
                                class69.field1439.update(class146.field3575.field1748, 0, var21);
                                int var24 = (int) class69.field1439.getValue();
                                if (class103.field2496.field508 != var24) {
                                    try {
                                        class126.field2977.method738(1);
                                    } catch (Exception var30) {
                                    }
                                    class15.field205++;
                                    class126.field2977 = null;
                                    class34.field716 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class15.field205 = 0;
                                class129.field3072 = 0;
                                class103.field2496.field512.method377((class103.field2496.field1495 & 0xFF0000L) == 16711680L, class146.field3575.field1748, class82.field1875, (int) (class103.field2496.field1495 & 0xFFFFL), 123);
                            }
                            class103.field2496.method495(-105);
                            class146.field3575 = null;
                            if (class82.field1875) {
                                class117.field2828--;
                            } else {
                                class58.field1182--;
                            }
                            class68.field1420 = 0;
                            class103.field2496 = null;
                        } else {
                            if (class68.field1420 != 512) {
                                break;
                            }
                            class68.field1420 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class126.field2977.method738(1);
                } catch (Exception var29) {
                }
                class129.field3072++;
                class126.field2977 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljb;ILjb;)V")
    public static final void method1029(class64 arg0, int arg1, class64 arg2) {
        class85.field1928 = arg0;
        field3151++;
        class141.field3357 = arg2;
        if (arg1 == -105) {
            class35.field742 = class141.field3357.method440(3, false);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([Ltd;ILqb;)V")
    private static final void method1030(class135[] arg0, int arg1, class113 arg2) {
        field3144++;
        int var3 = 0;
        if (arg1 != -25129) {
            field3154 = null;
        }
        while (var3 < 4) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class73.field1606[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class73.field1606[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method1041(arg1 ^ 0xFFDF9DD7, var110, var111);
                        }
                    }
                }
            }
            var3++;
        }
        class16.field257 += (int) (Math.random() * 5.0D) - 2;
        class16.field223 += (int) (Math.random() * 5.0D) - 2;
        if (class16.field257 < -16) {
            class16.field257 = -16;
        }
        if (class16.field257 > 16) {
            class16.field257 = 16;
        }
        if (class16.field223 < -8) {
            class16.field223 = -8;
        }
        if (class16.field223 > 8) {
            class16.field223 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class16.field258[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class64.field1306[var4][var101 + 1][var50] - class64.field1306[var4][var101 - 1][var50];
                    int var103 = class64.field1306[var4][var101][var50 + 1] - class64.field1306[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var105 * -50 + var106 * -10 + var107 * -50) / var49 + 96;
                    int var109 = (var47[var101][var50 - 1] >> 2) + ((var47[var101 - 1][var50] >> 2) - (-(var47[var101 + 1][var50] >> 3) - (var47[var101][var50 + 1] >> 3) - (var47[var101][var50] >> 1)));
                    class48.field1009[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class23.field459[var51] = 0;
                class77.field1713[var51] = 0;
                class31.field673[var51] = 0;
                class41.field809[var51] = 0;
                class20.field335[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class68.field1419[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class29 var97 = class91.method727((byte) 118, var96 - 1);
                            class23.field459[var55] += var97.field574;
                            class77.field1713[var55] += var97.field568;
                            class31.field673[var55] += var97.field578;
                            class41.field809[var55] += var97.field572;
                            var10002 = class20.field335[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class68.field1419[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class29 var100 = class91.method727((byte) 118, var99 - 1);
                            class23.field459[var55] -= var100.field574;
                            class77.field1713[var55] -= var100.field568;
                            class31.field673[var55] -= var100.field578;
                            class41.field809[var55] -= var100.field572;
                            var10002 = class20.field335[var55]--;
                        }
                    }
                }
                if (var52 >= 1 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; var61++) {
                        int var62 = var61 + 5;
                        int var63 = var61 - 5;
                        if (var62 >= 0 && var62 < 104) {
                            var59 += class41.field809[var62];
                            var57 += class23.field459[var62];
                            var56 += class77.field1713[var62];
                            var60 += class20.field335[var62];
                            var58 += class31.field673[var62];
                        }
                        if (var63 >= 0 && var63 < 104) {
                            var57 -= class23.field459[var63];
                            var59 -= class41.field809[var63];
                            var56 -= class77.field1713[var63];
                            var60 -= class20.field335[var63];
                            var58 -= class31.field673[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class20.field334 || (class73.field1606[0][var52][var61] & 0x2) != 0 || (class73.field1606[var4][var52][var61] & 0x10) == 0 && class114.method887(var4, (byte) 33, var52, var61) == class67.field1399)) {
                            if (class21.field362 > var4) {
                                class21.field362 = var4;
                            }
                            int var64 = class68.field1419[var4][var52][var61] & 0xFF;
                            int var65 = class147.field3598[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class64.field1306[var4][var52 + 1][var61 + 1];
                                int var67 = class64.field1306[var4][var52][var61];
                                int var68 = class64.field1306[var4][var52 + 1][var61];
                                int var69 = class64.field1306[var4][var52][var61 + 1];
                                int var70 = class48.field1009[var52][var61];
                                int var71 = class48.field1009[var52 + 1][var61];
                                int var72 = class48.field1009[var52 + 1][var61 + 1];
                                int var73 = class48.field1009[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var56 / var60;
                                    int var77 = var57 * 256 / var59;
                                    int var78 = var58 / var60;
                                    var74 = class148.method1185(var78, var77, var76, (byte) -90);
                                    int var79 = class16.field257 + var78;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = class16.field223 + var77 & 0xFF;
                                    var75 = class148.method1185(var79, var80, var76, (byte) 104);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class121.field2884[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class70.method493(var65 - 1, 4).field1644) {
                                        var81 = false;
                                    }
                                    if (var81 && var67 == var68 && var66 == var67 && var67 == var69) {
                                        class32.field696[var4][var52][var61] = class96.method763(class32.field696[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class12.field181[class42.method299((byte) -112, 96, var75)];
                                }
                                if (var65 == 0) {
                                    arg2.method871(var4, var52, var61, 0, 0, -1, var67, var68, var66, var69, class42.method299((byte) -97, var70, var74), class42.method299((byte) -123, var71, var74), class42.method299((byte) -105, var72, var74), class42.method299((byte) -103, var73, var74), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class121.field2884[var4][var52][var61] + 1;
                                    byte var84 = class45.field883[var4][var52][var61];
                                    class75 var85 = class70.method493(var65 - 1, 4);
                                    int var86 = var85.field1642;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class12.field179.method379(var86, (byte) -15);
                                        var88 = -1;
                                    } else if (var85.field1626 == 16711935) {
                                        var88 = -2;
                                        var87 = -2;
                                        var86 = -1;
                                    } else {
                                        var88 = class148.method1185(var85.field1632, var85.field1650, var85.field1637, (byte) -99);
                                        int var89 = class16.field257 + var85.field1632;
                                        int var90 = class16.field223 + var85.field1650 & 0xFF;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var87 = class148.method1185(var89, var90, var85.field1637, (byte) 100);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class12.field181[class79.method617(7371, var87, 96)];
                                    }
                                    if (var85.field1630 != -1) {
                                        int var92 = var85.field1638 + class16.field223 & 0xFF;
                                        int var93 = class16.field257 + var85.field1622;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class148.method1185(var93, var92, var85.field1621, (byte) -111);
                                        var91 = class12.field181[class79.method617(7371, var94, 96)];
                                    }
                                    arg2.method871(var4, var52, var61, var83, var84, var86, var67, var68, var66, var69, class42.method299((byte) -118, var70, var74), class42.method299((byte) -107, var71, var74), class42.method299((byte) -122, var72, var74), class42.method299((byte) -115, var73, var74), class79.method617(7371, var88, var70), class79.method617(7371, var88, var71), class79.method617(7371, var88, var72), class79.method617(7371, var88, var73), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method837(var4, var54, var53, class114.method887(var4, (byte) -96, var54, var53));
                }
            }
            class68.field1419[var4] = null;
            class147.field3598[var4] = null;
            class121.field2884[var4] = null;
            class45.field883[var4] = null;
            class16.field258[var4] = null;
        }
        arg2.method850(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class73.field1606[1][var5][var46] & 0x2) == 2) {
                    arg2.method881(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var7 <<= 0x3;
                var6 <<= 0x3;
                var8 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class32.field696[var10][var12][var11] & var6) != 0) {
                            int var13 = var11;
                            int var14 = var10;
                            int var15;
                            for (var15 = var11; var15 < 104 && (class32.field696[var10][var12][var15 + 1] & var6) != 0; var15++) {
                            }
                            while (var13 > 0 && (var6 & class32.field696[var10][var12][var13 - 1]) != 0) {
                                var13--;
                            }
                            int var16 = var10;
                            label353: while (var14 > 0) {
                                for (int var17 = var13; var17 <= var15; var17++) {
                                    if ((var6 & class32.field696[var14 - 1][var12][var17]) == 0) {
                                        break label353;
                                    }
                                }
                                var14--;
                            }
                            label342: while (var16 < var9) {
                                for (int var18 = var13; var18 <= var15; var18++) {
                                    if ((class32.field696[var16 + 1][var12][var18] & var6) == 0) {
                                        break label342;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var16 + 1 - var14) * (var15 + 1 - var13);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class64.field1306[var16][var12][var13] - var20;
                                int var22 = class64.field1306[var14][var12][var13];
                                class113.method862(var9, 1, var12 * 128, var12 * 128, var13 * 128, var15 * 128 + 128, var21, var22);
                                for (int var23 = var14; var23 <= var16; var23++) {
                                    for (int var24 = var13; var24 <= var15; var24++) {
                                        class32.field696[var23][var12][var24] = class16.method135(class32.field696[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class32.field696[var10][var12][var11]) != 0) {
                            int var25 = var12;
                            int var26;
                            for (var26 = var12; var26 < 104 && (var7 & class32.field696[var10][var26 + 1][var11]) != 0; var26++) {
                            }
                            int var27 = var10;
                            int var28 = var10;
                            while (var25 > 0 && (class32.field696[var10][var25 - 1][var11] & var7) != 0) {
                                var25--;
                            }
                            label407: while (var27 > 0) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((var7 & class32.field696[var27 - 1][var29][var11]) == 0) {
                                        break label407;
                                    }
                                }
                                var27--;
                            }
                            label396: while (var28 < var9) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((var7 & class32.field696[var28 + 1][var30][var11]) == 0) {
                                        break label396;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var28 + 1 - var27) * (var26 + 1 - var25);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class64.field1306[var28][var25][var11] - var32;
                                int var34 = class64.field1306[var27][var25][var11];
                                class113.method862(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class32.field696[var35][var36][var11] = class16.method135(class32.field696[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class32.field696[var10][var12][var11]) != 0) {
                            int var37 = var11;
                            int var38 = var12;
                            while (var37 > 0 && (var8 & class32.field696[var10][var12][var37 - 1]) != 0) {
                                var37--;
                            }
                            int var39 = var11;
                            int var40 = var12;
                            while (var39 < 104 && (var8 & class32.field696[var10][var12][var39 + 1]) != 0) {
                                var39++;
                            }
                            label461: while (var40 > 0) {
                                for (int var41 = var37; var41 <= var39; var41++) {
                                    if ((class32.field696[var10][var40 - 1][var41] & var8) == 0) {
                                        break label461;
                                    }
                                }
                                var40--;
                            }
                            label450: while (var38 < 104) {
                                for (int var42 = var37; var42 <= var39; var42++) {
                                    if ((class32.field696[var10][var38 + 1][var42] & var8) == 0) {
                                        break label450;
                                    }
                                }
                                var38++;
                            }
                            if ((var39 + 1 - var37) * (-var40 + 1 + var38) >= 4) {
                                int var43 = class64.field1306[var10][var40][var37];
                                class113.method862(var9, 4, var40 * 128, var38 * 128 + 128, var37 * 128, var39 * 128 + 128, var43, var43);
                                for (int var44 = var40; var44 <= var38; var44++) {
                                    for (int var45 = var37; var45 <= var39; var45++) {
                                        class32.field696[var10][var44][var45] = class16.method135(class32.field696[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILmf;)Z")
    public static final boolean method1031(int arg0, class89 arg1) {
        field3148++;
        int var2 = arg1.field2136;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class18.field286++;
            class139.method1081(0, 13, class73.method530((byte) -83, new class117[] { class70.field1491, class67.field1401[var2] }), 0, class101.field2446, true, 0);
            class139.method1081(0, 11, class73.method530((byte) -83, new class117[] { class70.field1491, class67.field1401[var2] }), 0, class95.field2302, true, 0);
            class53.field1099++;
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class139.method1081(0, 22, class73.method530((byte) -83, new class117[] { class70.field1491, arg1.field2118 }), 0, class101.field2446, true, 0);
            class153.field3777++;
            return true;
        } else {
            int var3 = 113 % ((arg0 + 57) / 48);
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public static void method1032(int arg0) {
        field3155 = null;
        field3157 = null;
        field3146 = null;
        field3141 = null;
        field3156 = null;
        field3147 = null;
        field3154 = null;
        if (arg0 != 27250) {
            field3158 = false;
        }
        field3150 = null;
    }
}
