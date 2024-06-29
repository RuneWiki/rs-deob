import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class78 extends class137 {

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "[B")
    public static byte[] field1255 = new byte[520];

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lrg;")
    public class248 field1251;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lrg;")
    public class248 field1264;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1254;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Ljava/lang/String;")
    public String field1258;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Z")
    public boolean field1259;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "[Ljava/lang/Object;")
    public Object[] field1265;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public static void method565(byte arg0) {
        field1254 = null;
        field1255 = null;
        int var1 = -77 % ((-arg0 - 43) / 32);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lgi;Lgi;IZI)Lwk;")
    public static final class294 method566(class164 arg0, class164 arg1, int arg2, boolean arg3, int arg4) {
        field1261++;
        boolean var5 = true;
        int[] var6 = arg0.method1162(0, arg2);
        if (arg4 >= -108) {
            method568((class125) null, (class119) null, 97, -38, 106);
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method1139(var6[var7], (byte) 123, arg2);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg1.method1139(var9, (byte) -99, 0);
                } else {
                    var10 = arg1.method1139(0, (byte) 112, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class294(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIIZ)V")
    public static final void method567(boolean arg0, int arg1, int arg2, boolean arg3) {
        field1257++;
        int var10002;
        for (int var4 = 0; var4 < class91.field1439; var4++) {
            class104 var22 = class131.field2113[class34.field556[var4]];
            if (var22 != null && var22.method104(-32447) && var22.field1645.method1638(637)) {
                int var23 = var22.method101(false);
                if (arg0) {
                    if (!var22.field1645.field3797) {
                        continue;
                    }
                } else if (var22.field1645.field3773 != arg3 || arg2 != 0 && arg2 != var23) {
                    continue;
                }
                if (var23 == 1) {
                    if ((var22.field994 & 0x7F) == 64 && (var22.field929 & 0x7F) == 64) {
                        int var24 = var22.field994 >> 7;
                        int var25 = var22.field929 >> 7;
                        if (var24 >= 0 && var24 < 104 && var25 >= 0 && var25 < 104) {
                            var10002 = class144.field2319[var24][var25]++;
                        }
                    }
                } else if (((var23 & 0x1) != 0 || (var22.field994 & 0x7F) == 0 && (var22.field929 & 0x7F) == 0) && ((var23 & 0x1) != 1 || (var22.field994 & 0x7F) == 64 && (var22.field929 & 0x7F) == 64)) {
                    int var26 = var22.field994 - var23 * 64 >> 7;
                    int var27 = var22.field929 - (var23 * 64) >> 7;
                    int var28 = var22.method101(false) + var26;
                    int var29 = var27 + var22.method101(false);
                    if (var29 > 104) {
                        var29 = 104;
                    }
                    if (var28 > 104) {
                        var28 = 104;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                    for (int var30 = var26; var30 < var28; var30++) {
                        for (int var31 = var27; var31 < var29; var31++) {
                            var10002 = class144.field2319[var30][var31]++;
                        }
                    }
                }
            }
        }
        int var5 = 74 % ((arg1 - 22) / 56);
        label202: for (int var6 = 0; var6 < class91.field1439; var6++) {
            class104 var7 = class131.field2113[class34.field556[var6]];
            long var8 = (long) class34.field556[var6] << 32 | 0x20000000L;
            if (var7 != null && var7.method104(-32447) && var7.field1645.method1638(637)) {
                int var10 = var7.method101(false);
                if (arg0) {
                    if (!var7.field1645.field3797) {
                        continue;
                    }
                } else if (arg3 != var7.field1645.field3773 || arg2 != 0 && arg2 != var10) {
                    continue;
                }
                var7.field958 = true;
                if (var10 == 1) {
                    if ((var7.field994 & 0x7F) == 64 && (var7.field929 & 0x7F) == 64) {
                        int var11 = var7.field929 >> 7;
                        int var12 = var7.field994 >> 7;
                        if (var12 < 0 || var12 >= 104 || var11 < 0 || var11 >= 104) {
                            continue;
                        }
                        if (class144.field2319[var12][var11] > 1) {
                            var10002 = class144.field2319[var12][var11]--;
                            continue;
                        }
                    }
                } else if ((var10 & 0x1) == 0 && (var7.field994 & 0x7F) == 0 && (var7.field929 & 0x7F) == 0 || (var10 & 0x1) == 1 && (var7.field994 & 0x7F) == 64 && (var7.field929 & 0x7F) == 64) {
                    int var13 = var7.field994 - (var10 * 64) >> 7;
                    int var14 = var10 + var13;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var15 = var7.field929 - (var10 * 64) >> 7;
                    boolean var16 = true;
                    if (var14 > 104) {
                        var14 = 104;
                    }
                    int var17 = var10 + var15;
                    if (var17 > 104) {
                        var17 = 104;
                    }
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    for (int var18 = var13; var18 < var14; var18++) {
                        for (int var21 = var15; var21 < var17; var21++) {
                            if (class144.field2319[var18][var21] <= 1) {
                                var16 = false;
                                break;
                            }
                        }
                    }
                    if (var16) {
                        int var19 = var13;
                        while (true) {
                            if (var14 <= var19) {
                                continue label202;
                            }
                            for (int var20 = var15; var20 < var17; var20++) {
                                var10002 = class144.field2319[var19][var20]--;
                            }
                            var19++;
                        }
                    }
                }
                if (!var7.field1645.field3834) {
                    var8 |= Long.MIN_VALUE;
                }
                var7.field958 = false;
                var7.field964 = class60.method387(-18796, var7.field929, var7.field994, class214.field3389);
                class137.method949(class214.field3389, var7.field994, var7.field929, var7.field964, var10 * 64 + 60 - 64, var7, var7.field954, var8, var7.field948);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lcj;Lth;III)V")
    public static final void method568(class125 arg0, class119 arg1, int arg2, int arg3, int arg4) {
        field1250++;
        if (arg0.field2000 != null) {
            boolean var5 = false;
            int[] var6 = new int[arg0.field2000.length];
            for (int var7 = 0; var7 < (var6.length / 2); var7++) {
                int var12 = arg0.field2000[var7 * 2] + arg1.field1883;
                int var13 = arg1.field1886 - arg0.field2000[var7 * 2 + 1];
                int var14 = var6[var7 * 2] = (class262.field4293 - class262.field4285) * (var12 - class262.field4290) / (class262.field4280 - class262.field4290) + class262.field4285;
                int var15 = var6[var7 * 2 + 1] = (var13 - class262.field4294) * (class262.field4279 - class262.field4291) / (class262.field4281 - class262.field4294) + class262.field4291;
                if (class262.field4285 < var14 && var14 < class262.field4293 && var15 > class262.field4291 && class262.field4279 > var15) {
                    var5 = true;
                }
            }
            if (!var5) {
                return;
            }
            class160.method1099(var6, arg0.field2012, arg0.field2012 >>> 24);
            for (int var8 = 0; var8 < (var6.length / 2 - 1); var8++) {
                class94.method656(var6[var8 * 2], var6[var8 * 2 + 1], var6[(var8 + 1) * 2], var6[(var8 + 1) * 2 + 1], arg0.field2005, arg0.field2005 >>> 24);
            }
            class94.method656(var6[var6.length - 2], var6[var6.length - 1], var6[0], var6[1], arg0.field2005, arg0.field2005 >>> 24);
        } else if (arg1.field1884) {
            return;
        }
        class51 var9 = new class51(arg1);
        class2 var10 = null;
        if (arg0.field1982 != -1) {
            if (arg1.field1893 && arg0.field2008 != -1) {
                var10 = (class2) arg0.method864(95, true, true);
            } else {
                var10 = (class2) arg0.method864(117, false, true);
            }
            if (var10 != null) {
                if (class108.field1685 > 0 && (class66.field1081 != -1 && class66.field1081 == arg1.field1877 || class4.field104 != -1 && class4.field104 == arg0.field1983)) {
                    int var11;
                    if (client.field2660 > 50) {
                        var11 = (100 - client.field2660) * 3;
                    } else {
                        var11 = client.field2660 * 3;
                    }
                    class94.method658(arg1.field1876, arg1.field1875, var10.field3179 / 2 + 7, 16776960, var11);
                    class94.method658(arg1.field1876, arg1.field1875, var10.field3179 / 2 + 5, 16776960, var11);
                    class94.method658(arg1.field1876, arg1.field1875, var10.field3179 / 2 + 3, 16776960, var11);
                    class94.method658(arg1.field1876, arg1.field1875, var10.field3179 / 2 + 1, 16776960, var11);
                    class94.method658(arg1.field1876, arg1.field1875, var10.field3179 / 2, 16776960, var11);
                }
                var10.method13(arg1.field1876 - (var10.field3179 >> 1), -(var10.field3181 >> 1) + arg1.field1875);
                var9.field747 = arg1.field1875 + arg2 - (var10.field3181 >> 1);
                var9.field741 = (var10.field3181 >> 1) + arg1.field1875 + arg2;
                var9.field740 = arg1.field1876 + arg4 - (var10.field3179 >> 1);
                var9.field745 = (var10.field3179 >> 1) + arg4 + arg1.field1876;
            }
        }
        if (arg0.field1999 != null) {
            if (var10 == null) {
                class308.method2094(arg1, arg4, arg0, 0, (byte) -44, arg2, true, var9);
            } else {
                class308.method2094(arg1, arg4, arg0, (var10.field3181 >> 1) + 5, (byte) -44, arg2, false, var9);
            }
        }
        if (var9.method326(class287.field4640, 121, class55.field797) && arg0.field1993 != null) {
            if (arg0.field1993[4] != null) {
                class205.method1420(arg0.field1993[4], (long) arg1.field1877, 125, arg0.field1983, 0, -1, arg0.field2001, (short) 1006);
            }
            if (arg0.field1993[3] != null) {
                class205.method1420(arg0.field1993[3], (long) arg1.field1877, 126, arg0.field1983, 0, -1, arg0.field2001, (short) 1011);
            }
            if (arg0.field1993[2] != null) {
                class205.method1420(arg0.field1993[2], (long) arg1.field1877, 119, arg0.field1983, 0, -1, arg0.field2001, (short) 1009);
            }
            if (arg0.field1993[1] != null) {
                class205.method1420(arg0.field1993[1], (long) arg1.field1877, 118, arg0.field1983, 0, -1, arg0.field2001, (short) 1003);
            }
            if (arg0.field1993[0] != null) {
                class205.method1420(arg0.field1993[0], (long) arg1.field1877, 115, arg0.field1983, 0, -1, arg0.field2001, (short) 1001);
            }
        }
        class102.field1621.method1554(5257, var9);
        if (arg3 != -3) {
            method565((byte) -63);
        }
    }
}
