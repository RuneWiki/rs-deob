import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class207 extends class276 {

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "J")
    public long field3269;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "[F")
    public static float[] field3265 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "D")
    public static double field3267 = -1.0D;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "[[Z")
    public static boolean[][] field3268 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V", line = 4)
    public static final void method1355(String arg0, byte arg1, String arg2, int arg3) {
        int var4 = -4 % ((arg1 + 63) / 37);
        class111.field1965 = arg3;
        field3266++;
        class150.field2406 = 2;
        class147.method1069(true, arg0, arg2);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lza;IILec;I)V", line = 16)
    public static final void method1356(class491 arg0, int arg1, int arg2, class68 arg3, int arg4) {
        field3270++;
        class448 var5 = arg3.method449(true, arg0);
        if (var5 == null) {
            return;
        }
        arg0.method829(arg2, arg4, arg3.field1009 + arg2, arg3.field1081 + arg4);
        if (class333.field5246 == 2 || class333.field5246 == 5 || class137.field2314 == null) {
            arg0.method825(-16777216, var5, arg2, arg4);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class190.field2963 == 4) {
                var7 = class535.field7865;
                var6 = 4096;
                var9 = (int) (-class88.field1483) & 0x3FFF;
                var8 = class296.field4782;
            } else {
                var6 = 4096 - (class435.field6507 * 16);
                var7 = class302.field4850.field4714;
                var8 = class302.field4850.field4716;
                var9 = (int) (-class88.field1483) + class227.field3959 & 0x3FFF;
            }
            int var10 = var8 / 32 + 208 + 48 - (class217.field3775 * 2);
            int var11 = class277.field4548 * 4 + 48 - (var7 / 32 + ((class277.field4548 - 104) * 2));
            class137.field2314.method1037((float) arg3.field1009 / 2.0F + (float) arg2, (float) arg3.field1081 / 2.0F + (float) arg4, (float) var10, (float) var11, var6, var9 << 2, var5, arg2, arg4);
            for (class22 var12 = (class22) class448.field6680.method2538(-3); var12 != null; var12 = (class22) class448.field6680.method2535((byte) -58)) {
                int var58 = var12.field238;
                int var59 = ((class15.field172.field1252[var58] & 0xFFFD8CE) >> 14) - class16.field181;
                int var60 = (class15.field172.field1252[var58] & 0x3FFF) - class455.field6794;
                int var61 = var59 * 4 + 2 - (var8 / 32);
                int var62 = var60 * 4 + 2 - (var7 / 32);
                class175.method1182(var62, arg4, arg2, arg0, (byte) -73, var61, arg3, var5, class15.field172.field1254[var58]);
            }
            for (int var13 = 0; var13 < class209.field3305; var13++) {
                int var55 = class495.field7233[var13] * 4 + 2 - var8 / 32;
                int var56 = class463.field6887[var13] * 4 + 2 - var7 / 32;
                class39 var57 = class61.field928.method791(class121.field2133[var13], true);
                if (var57.field575 != null) {
                    var57 = var57.method296(-1008, class327.field5160);
                    if (var57 == null || var57.field656 == -1) {
                        continue;
                    }
                }
                class175.method1182(var56, arg4, arg2, arg0, (byte) -128, var55, arg3, var5, var57.field656);
            }
            for (class279 var14 = (class279) class244.field4176.method2518(19); var14 != null; var14 = (class279) class244.field4176.method2524(0)) {
                int var50 = (int) (var14.field4542 >> 28 & 0x3L);
                if (class482.field7087 == var50) {
                    int var51 = (int) (var14.field4542 & 0x3FFFL) - class16.field181;
                    int var52 = (int) (var14.field4542 >> 14 & 0x3FFFL) - class455.field6794;
                    int var53 = var51 * 4 - (var8 / 32 - 2);
                    int var54 = var52 * 4 + 2 - var7 / 32;
                    class340.method2147(arg2, var53, arg4, class144.field2351[0], var5, var54, 2, arg3);
                }
            }
            for (int var15 = 0; var15 < class86.field1471; var15++) {
                class505 var45 = (class505) class147.field2396.method2516((long) class371.field5734[var15], -1);
                if (var45 != null) {
                    class265 var46 = var45.field7355;
                    if (var46.method1771(false) && class302.field4850.field4720 == var46.field4720) {
                        class510 var47 = var46.field4430;
                        if (var47 != null && var47.field7448 != null) {
                            var47 = var47.method3000(1, class327.field5160);
                        }
                        if (var47 != null && var47.field7473 && var47.field7457) {
                            int var48 = var46.field4716 / 32 - (var8 / 32);
                            int var49 = var46.field4714 / 32 - (var7 / 32);
                            if (var47.field7426 == -1) {
                                class340.method2147(arg2, var48, arg4, class144.field2351[1], var5, var49, 2, arg3);
                            } else {
                                class175.method1182(var49, arg4, arg2, arg0, (byte) 92, var48, arg3, var5, var47.field7426);
                            }
                        }
                    }
                }
            }
            int var16 = class151.field2425;
            int[] var17 = class45.field734;
            for (int var18 = 0; var18 < var16; var18++) {
                class166 var37 = class435.field6489[var17[var18]];
                if (var37 != null && var37.method1137(false) && class302.field4850 != var37 && class302.field4850.field4720 == var37.field4720) {
                    int var38 = var37.field4716 / 32 - (var8 / 32);
                    int var39 = var37.field4714 / 32 - (var7 / 32);
                    boolean var40 = false;
                    for (int var41 = 0; var41 < class139.field2317; var41++) {
                        if (var37.field2652.equals(class485.field7122[var41]) && class305.field4875[var41] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    for (int var43 = 0; var43 < class12.field136; var43++) {
                        if (var37.field2652.equals(class236.field4084[var43].field6600)) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    if (class302.field4850.field2634 != 0 && var37.field2634 != 0 && class302.field4850.field2634 == var37.field2634) {
                        var44 = true;
                    }
                    if (var37.field2649) {
                        class340.method2147(arg2, var38, arg4, class144.field2351[6], var5, var39, 2, arg3);
                    } else if (var40) {
                        class340.method2147(arg2, var38, arg4, class144.field2351[3], var5, var39, 2, arg3);
                    } else if (var42) {
                        class340.method2147(arg2, var38, arg4, class144.field2351[5], var5, var39, 2, arg3);
                    } else if (var44) {
                        class340.method2147(arg2, var38, arg4, class144.field2351[4], var5, var39, 2, arg3);
                    } else {
                        class340.method2147(arg2, var38, arg4, class144.field2351[2], var5, var39, 2, arg3);
                    }
                }
            }
            class475[] var19 = class413.field6289;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class475 var23 = var19[var20];
                if (var23 != null && var23.field7032 != 0 && class504.field7348 % 20 < 10) {
                    if (var23.field7032 == 1) {
                        class505 var24 = (class505) class147.field2396.method2516((long) var23.field7037, -1);
                        if (var24 != null) {
                            class265 var25 = var24.field7355;
                            int var26 = var25.field4716 / 32 - (var8 / 32);
                            int var27 = var25.field4714 / 32 - var7 / 32;
                            class362.method2315(arg3, false, arg2, arg4, 360000L, var5, var23.field7029, var27, var26);
                        }
                    }
                    if (var23.field7032 == 2) {
                        int var28 = var23.field7034 / 32 - (var8 / 32);
                        int var29 = var23.field7035 / 32 - (var7 / 32);
                        long var30 = (long) (var23.field7028 << 5);
                        long var32 = var30 * var30;
                        class362.method2315(arg3, false, arg2, arg4, var32, var5, var23.field7029, var29, var28);
                    }
                    if (var23.field7032 == 10 && var23.field7037 >= 0 && class435.field6489.length > var23.field7037) {
                        class166 var34 = class435.field6489[var23.field7037];
                        if (var34 != null) {
                            int var35 = var34.field4716 / 32 - (var8 / 32);
                            int var36 = var34.field4714 / 32 - (var7 / 32);
                            class362.method2315(arg3, false, arg2, arg4, 360000L, var5, var23.field7029, var36, var35);
                        }
                    }
                }
            }
            if (class190.field2963 != 4) {
                if (class314.field4946 != 0) {
                    int var21 = class314.field4946 * 4 - ((var8 / 32) - (class302.field4850.method1143(arg1 + -29106) * 2 + -2) - 2);
                    int var22 = class420.field6346 * 4 + (class302.field4850.method1143(0) * 2) + 2 - (var7 / 32) - 2;
                    class340.method2147(arg2, var21, arg4, class202.field3201[class192.field2991 ? 1 : 0], var5, var22, 2, arg3);
                }
                arg0.method2864(arg3.field1081 / 2 + arg4 - 1, (byte) 13, 3, arg3.field1009 / 2 + (arg2 - 1), 3, -1);
            }
        }
        if (arg1 != 29106) {
            method1355(null, (byte) -4, null, 101);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 328)
    public static void method1357(int arg0) {
        field3265 = null;
        if (arg0 == -18741) {
            field3268 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 351)
    public class207() {
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(J)V", line = 353)
    public class207(long arg0) {
        this.field3269 = arg0;
    }
}
