import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Ljd;")
    public static class92 field315 = class202.method1325((byte) 90, ":clan:");

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Ljd;")
    public static class92 field314 = class202.method1325((byte) 90, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method45(byte arg0, String arg1) throws ClassNotFoundException {
        if (arg0 > -21) {
            field315 = null;
        }
        field316++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(La;IBI)V")
    public static final void method46(class1 arg0, int arg1, byte arg2, int arg3) {
        field310++;
        if (class137.field2750 != 0 && class137.field2750 != 3) {
            return;
        }
        int var4 = arg1 - arg0.field28 / 2;
        int var5 = class9.field327 + class172.field3338 & 0x7FF;
        int var6 = 99 / ((arg2 + 20) / 61);
        int var7 = class194.field3787[var5];
        int var8 = (class127.field2565 + 256) * var7 >> 8;
        int var9 = arg3 - arg0.field96 / 2;
        int var10 = class194.field3803[var5];
        int var11 = (class127.field2565 + 256) * var10 >> 8;
        int var12 = var4 * var8 + var9 * var11 >> 11;
        int var13 = var4 * var11 - var8 * var9 >> 11;
        int var14 = class15.field423.field208 - var13 >> 7;
        int var15 = class15.field423.field246 + var12 >> 7;
        boolean var16 = class186.method1206(class15.field423.field233[0], 0, (byte) 125, class15.field423.field198[0], var15, 0, true, 0, 0, 0, var14, 1);
        if (!var16) {
            return;
        }
        class99.field2000.method428(var9, 94);
        class99.field2000.method428(var4, 107);
        class99.field2000.method458(class9.field327, 9345);
        class99.field2000.method428(57, 120);
        class99.field2000.method428(class172.field3338, 113);
        class99.field2000.method428(class127.field2565, 96);
        class99.field2000.method428(89, 111);
        class99.field2000.method458(class15.field423.field246, 9345);
        class99.field2000.method458(class15.field423.field208, 9345);
        class99.field2000.method428(class111.field2270, 116);
        class99.field2000.method428(63, 127);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lld;")
    public static final class111 method47(int arg0, int arg1) {
        field317++;
        class111 var2 = (class111) class73.field1548.method930(-93, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class195.field3814.method899((byte) 87, 5, arg0);
        class111 var4 = new class111();
        if (arg1 != -3791) {
            method47(13, -10);
        }
        if (var3 != null) {
            var4.method755((byte) 125, new class70(var3));
        }
        class73.field1548.method927(arg1 + 28535, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method48(byte arg0) {
        field315 = null;
        field314 = null;
        if (arg0 >= -5) {
            method48((byte) 119);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
    public static final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class59.field1235 == 0 && !class95.field1918) {
            class174.field3369++;
            class44.method275((byte) -110, (short) 11, arg1 - arg4, 0L, class3.field189, arg3 - arg2, class213.field4123);
        }
        long var5 = -1L;
        for (int var7 = 0; var7 < class38.field858; var7++) {
            long var8 = class38.field867[var7];
            int var10 = (int) var8 & 0x7F;
            int var11 = (int) var8 >> 29 & 0x3;
            int var12 = (int) var8 >> 7 & 0x7F;
            int var13 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            if (var5 != var8) {
                var5 = var8;
                if (var11 == 2 && class88.method589(class81.field1639, var10, var12, var8)) {
                    class214 var14 = class126.method846(0, var13);
                    if (var14.field4134 != null) {
                        var14 = var14.method1391((byte) 118);
                    }
                    if (var14 == null) {
                        continue;
                    }
                    if (class59.field1235 == 1) {
                        class98.field1989++;
                        class44.method275((byte) -110, (short) 2, var10, var8, class77.method529(-3, new class92[] { class1.field6, class158.field3144, var14.field4166 }), var12, class25.field581);
                    } else if (!class95.field1918) {
                        class76.field1582++;
                        class92[] var15 = var14.field4188;
                        if (class119.field2416) {
                            var15 = class166.method1078(90, var15);
                        }
                        if (var15 != null) {
                            for (int var16 = 4; var16 >= 0; var16--) {
                                if (var15[var16] != null) {
                                    class32.field723++;
                                    short var17 = 0;
                                    if (var16 == 0) {
                                        var17 = 43;
                                    }
                                    if (var16 == 1) {
                                        var17 = 44;
                                    }
                                    if (var16 == 2) {
                                        var17 = 4;
                                    }
                                    if (var16 == 3) {
                                        var17 = 23;
                                    }
                                    if (var16 == 4) {
                                        var17 = 1004;
                                    }
                                    class44.method275((byte) -110, var17, var10, var8, class77.method529(-3, new class92[] { class127.field2571, var14.field4166 }), var12, var15[var16]);
                                }
                            }
                        }
                        class44.method275((byte) -110, (short) 1001, var10, (long) var14.field4192, class77.method529(-3, new class92[] { class127.field2571, var14.field4166 }), var12, class54.field1129);
                    } else if ((class42.field921 & 0x4) == 4) {
                        class44.method275((byte) -110, (short) 36, var10, var8, class77.method529(-3, new class92[] { class33.field746, class158.field3144, var14.field4166 }), var12, class124.field2527);
                        class132.field2636++;
                    }
                }
                if (var11 == 1) {
                    class129 var18 = class107.field2187[var13];
                    if (var18.field2592.field1963 == 1 && (var18.field246 & 0x7F) == 64 && (var18.field208 & 0x7F) == 64) {
                        for (int var19 = 0; var19 < class96.field1928; var19++) {
                            class129 var22 = class107.field2187[class39.field893[var19]];
                            if (var22 != null && var18 != var22 && var22.field2592.field1963 == 1 && var18.field246 == var22.field246 && var18.field208 == var22.field208) {
                                class204.method1333((byte) -83, var12, class39.field893[var19], var22.field2592, var10);
                            }
                        }
                        for (int var20 = 0; var20 < class140.field2811; var20++) {
                            class91 var21 = class172.field3347[class190.field3678[var20]];
                            if (var21 != null && var18.field246 == var21.field246 && var18.field208 == var21.field208) {
                                class176.method1157(var10, true, class190.field3678[var20], var12, var21);
                            }
                        }
                    }
                    class204.method1333((byte) -83, var12, var13, var18.field2592, var10);
                }
                if (var11 == 0) {
                    class91 var23 = class172.field3347[var13];
                    if ((var23.field246 & 0x7F) == 64 && (var23.field208 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < class96.field1928; var24++) {
                            class129 var27 = class107.field2187[class39.field893[var24]];
                            if (var27 != null && var27.field2592.field1963 == 1 && var23.field246 == var27.field246 && var23.field208 == var27.field208) {
                                class204.method1333((byte) -83, var12, class39.field893[var24], var27.field2592, var10);
                            }
                        }
                        for (int var25 = 0; var25 < class140.field2811; var25++) {
                            class91 var26 = class172.field3347[class190.field3678[var25]];
                            if (var26 != null && var23 != var26 && var23.field246 == var26.field246 && var23.field208 == var26.field208) {
                                class176.method1157(var10, true, class190.field3678[var25], var12, var26);
                            }
                        }
                    }
                    class176.method1157(var10, true, var13, var12, var23);
                }
                if (var11 == 3) {
                    class18 var28 = class136.field2725[class81.field1639][var10][var12];
                    if (var28 != null) {
                        for (class87 var29 = (class87) var28.method104(false); var29 != null; var29 = (class87) var28.method107(93)) {
                            class107 var30 = class92.method626((byte) 59, var29.field1725);
                            if (class59.field1235 == 1) {
                                class34.field782++;
                                class44.method275((byte) -110, (short) 32, var10, (long) var29.field1725, class77.method529(-3, new class92[] { class1.field6, class121.field2450, var30.field2162 }), var12, class25.field581);
                            } else if (!class95.field1918) {
                                class92[] var31 = var30.field2161;
                                if (class119.field2416) {
                                    var31 = class166.method1078(24, var31);
                                }
                                class113.field2282++;
                                for (int var32 = 4; var32 >= 0; var32--) {
                                    if (var31 != null && var31[var32] != null) {
                                        byte var33 = 0;
                                        if (var32 == 0) {
                                            var33 = 45;
                                        }
                                        class198.field3877++;
                                        if (var32 == 1) {
                                            var33 = 25;
                                        }
                                        if (var32 == 2) {
                                            var33 = 7;
                                        }
                                        if (var32 == 3) {
                                            var33 = 6;
                                        }
                                        if (var32 == 4) {
                                            var33 = 50;
                                        }
                                        class44.method275((byte) -110, var33, var10, (long) var29.field1725, class77.method529(~arg0, new class92[] { class51.field1079, var30.field2162 }), var12, var31[var32]);
                                    } else if (var32 == 2) {
                                        class44.method275((byte) -110, (short) 7, var10, (long) var29.field1725, class77.method529(-3, new class92[] { class51.field1079, var30.field2162 }), var12, class176.field3397);
                                        class123.field2468++;
                                    }
                                }
                                class44.method275((byte) -110, (short) 1002, var10, (long) var29.field1725, class77.method529(~arg0, new class92[] { class51.field1079, var30.field2162 }), var12, class54.field1129);
                            } else if ((class42.field921 & 0x1) == 1) {
                                class44.method275((byte) -110, (short) 8, var10, (long) var29.field1725, class77.method529(-3, new class92[] { class33.field746, class121.field2450, var30.field2162 }), var12, class124.field2527);
                                class87.field1718++;
                            }
                        }
                    }
                }
            }
        }
        field309++;
        if (arg0 != 2) {
            method48((byte) 34);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V")
    public static final void method50(boolean arg0, int arg1) {
        if (!arg0) {
            method46(null, -62, (byte) -37, -123);
        }
        field308++;
        if (arg1 == -3) {
            class94.method663(class69.field1390, class131.field2634, (byte) 85, class2.field158);
        } else if (arg1 == -2) {
            class94.method663(class69.field1400, class69.field1395, (byte) 122, class157.field3119);
        } else if (arg1 == -1) {
            class94.method663(class69.field1406, class208.field3997, (byte) 118, class2.field149);
        } else if (arg1 == 3) {
            class94.method663(class69.field1403, class69.field1404, (byte) 68, class49.field1076);
        } else if (arg1 == 4) {
            class94.method663(class69.field1420, class107.field2183, (byte) 63, class153.field3041);
        } else if (arg1 == 5) {
            class94.method663(class69.field1409, class159.field3168, (byte) 107, class119.field2412);
        } else if (arg1 == 6) {
            class94.method663(class69.field1431, class118.field2393, (byte) 67, class86.field1706);
        } else if (arg1 == 7) {
            class94.method663(class69.field1412, class49.field1063, (byte) 126, class189.field3602);
        } else if (arg1 == 8) {
            class94.method663(class69.field1392, class137.field2758, (byte) 96, class126.field2554);
        } else if (arg1 == 9) {
            class94.method663(class69.field1425, class102.field2103, (byte) 70, class146.field2900);
        } else if (arg1 == 10) {
            class94.method663(class69.field1396, class137.field2755, (byte) 92, class202.field3916);
        } else if (arg1 == 11) {
            class94.method663(class69.field1393, class188.field3560, (byte) 63, class140.field2809);
        } else if (arg1 == 12) {
            class94.method663(class69.field1407, class77.field1594, (byte) 123, class211.field4089);
        } else if (arg1 == 13) {
            class94.method663(class69.field1416, class120.field2427, (byte) 72, class2.field164);
        } else if (arg1 == 14) {
            class94.method663(class69.field1415, class104.field2138, (byte) 110, class72.field1530);
        } else if (arg1 == 16) {
            class94.method663(class69.field1429, class119.field2417, (byte) 111, class28.field628);
        } else if (arg1 == 17) {
            class94.method663(class69.field1394, class43.field974, (byte) 94, class196.field3830);
        } else if (arg1 == 18) {
            class94.method663(class69.field1408, class70.field1499, (byte) 97, class39.field879);
        } else if (arg1 == 19) {
            class94.method663(class189.field3597, class2.field150, (byte) 59, class159.field3156);
        } else if (arg1 == 20) {
            class94.method663(class69.field1428, class127.field2573, (byte) 60, class2.field162);
        } else if (arg1 == 22) {
            class94.method663(class69.field1417, class117.field2363, (byte) 105, class120.field2425);
        } else if (arg1 == 23) {
            class94.method663(class69.field1421, class35.field818, (byte) 87, class72.field1527);
        } else if (arg1 == 24) {
            class94.method663(class69.field1389, class68.field1386, (byte) 69, class130.field2610);
        } else if (arg1 == 25) {
            class94.method663(class69.field1427, class147.field2929, (byte) 127, class2.field156);
        } else if (arg1 == 26) {
            class94.method663(class69.field1410, class3.field188, (byte) 85, class120.field2423);
        } else if (arg1 == 27) {
            class94.method663(class69.field1432, class69.field1424, (byte) 79, class60.field1247);
        } else {
            class94.method663(class69.field1423, class175.field3374, (byte) 118, class2.field154);
        }
        class213.method1385((byte) 71, 10);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class7() {
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Laf;)V")
    public class7(class7 arg0) {
        this.field307 = arg0.field307;
        this.field313 = arg0.field313;
        this.field306 = arg0.field306;
        this.field312 = arg0.field312;
    }
}
