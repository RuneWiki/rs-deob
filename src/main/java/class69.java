import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class69 {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[I")
    public static int[] field1721 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lgg;")
    public static class63 field1724 = class116.method911(43, "mod_icons");

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Lgg;")
    public static class63 field1725 = class116.method911(43, "::noclip");

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lqd;")
    public static class148 field1729 = new class148();

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lgg;")
    private static class63 field1730 = class116.method911(43, "shake:");

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lgg;")
    public static class63 field1731 = field1730;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field1733 = 0;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lgg;")
    public static class63 field1732 = field1730;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
    public static int[] field1734 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public int field1720;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lgg;")
    public class63 field1719;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Z")
    public boolean field1728;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
    public static final Object method631(byte[] arg0, boolean arg1, byte arg2) {
        if (arg2 <= 48) {
            return null;
        }
        field1726++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class8.field178) {
            try {
                class202 var3 = (class202) Class.forName("wg").getDeclaredConstructor().newInstance();
                var3.method1331(-103, arg0);
                return var3;
            } catch (Throwable var4) {
                class8.field178 = true;
            }
        }
        return arg1 ? class39.method361(arg0, 103) : arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method632(byte arg0) {
        field1725 = null;
        field1734 = null;
        field1731 = null;
        field1721 = null;
        field1732 = null;
        field1729 = null;
        field1730 = null;
        if (arg0 >= -18) {
            method632((byte) 99);
        }
        field1724 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILff;IB)V")
    public static final void method633(int arg0, class54 arg1, int arg2, byte arg3) {
        if (arg1.field1436 == 1) {
            class27.field615++;
            class78.method698((short) 21, arg1.field1323, arg1.field1400, -26415, 0, 0L, class151.field3175);
        }
        field1723++;
        if (arg1.field1436 == 2 && !class181.field3680) {
            class63 var4 = class79.method707((byte) -122, arg1);
            if (var4 != null) {
                class118.field2638++;
                class78.method698((short) 33, arg1.field1323, var4, arg3 ^ 0xFFFF98C3, -1, 0L, class89.method772((byte) 101, new class63[] { class109.field2466, arg1.field1334 }));
            }
        }
        if (arg3 != 18) {
            method634(124, -128, 91, null);
        }
        if (arg1.field1436 == 3) {
            class130.field2837++;
            class78.method698((short) 6, arg1.field1323, class43.field1039, -26415, 0, 0L, class151.field3175);
        }
        if (arg1.field1436 == 4) {
            class91.field2120++;
            class78.method698((short) 38, arg1.field1323, arg1.field1400, arg3 - 26433, 0, 0L, class151.field3175);
        }
        if (arg1.field1436 == 5) {
            class196.field3942++;
            class78.method698((short) 40, arg1.field1323, arg1.field1400, -26415, 0, 0L, class151.field3175);
        }
        if (arg1.field1436 == 6 && class198.field3967 == null) {
            class78.method698((short) 16, arg1.field1323, arg1.field1400, -26415, -1, 0L, class151.field3175);
            class198.field3961++;
        }
        if (arg1.field1432 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field1435; var6++) {
                for (int var7 = 0; var7 < arg1.field1302; var7++) {
                    int var8 = (arg1.field1325 + 32) * var7;
                    int var9 = (arg1.field1329 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg1.field1423[var5];
                        var8 += arg1.field1343[var5];
                    }
                    if (var8 <= arg0 && arg2 >= var9 && var8 + 32 > arg0 && var9 + 32 > arg2) {
                        class13.field307 = arg1;
                        class14.field336 = var5;
                        if (arg1.field1324[var5] > 0) {
                            class93 var10 = class59.method554(arg1.field1324[var5] - 1, arg3 ^ 0x3415);
                            if (class184.field3729 == 1 && class77.method691(-123, class10.method136((byte) -94, arg1))) {
                                if (class123.field2710 != arg1.field1323 || class90.field2114 != var5) {
                                    class78.method698((short) 25, arg1.field1323, class28.field669, arg3 - 26433, var5, (long) var10.field2192, class89.method772((byte) 30, new class63[] { class62.field1554, class30.field744, var10.field2202 }));
                                    class78.field1904++;
                                }
                            } else if (!class181.field3680 || !class77.method691(arg3 ^ 0xFFFFFF91, class10.method136((byte) -97, arg1))) {
                                class41.field958++;
                                class63[] var11 = var10.field2213;
                                if (class131.field2849) {
                                    var11 = class116.method913(var11, arg3 + 12834);
                                }
                                if (class77.method691(arg3 ^ 0xFFFFFFA0, class10.method136((byte) -120, arg1))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 30;
                                            } else {
                                                var13 = 9;
                                            }
                                            class94.field2249++;
                                            class78.method698(var13, arg1.field1323, var11[var12], -26415, var5, (long) var10.field2192, class89.method772((byte) 78, new class63[] { class103.field2379, var10.field2202 }));
                                        } else if (var12 == 4) {
                                            class181.field3676++;
                                            class78.method698((short) 9, arg1.field1323, class141.field3032, -26415, var5, (long) var10.field2192, class89.method772((byte) 124, new class63[] { class103.field2379, var10.field2202 }));
                                        }
                                    }
                                }
                                if (class134.method979(class10.method136((byte) -128, arg1), 110)) {
                                    class199.field3984++;
                                    class78.method698((short) 18, arg1.field1323, class28.field669, -26415, var5, (long) var10.field2192, class89.method772((byte) 109, new class63[] { class103.field2379, var10.field2202 }));
                                }
                                if (class77.method691(arg3 - 110, class10.method136((byte) -96, arg1)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            class105.field2409++;
                                            if (var14 == 0) {
                                                var15 = 41;
                                            }
                                            if (var14 == 1) {
                                                var15 = 37;
                                            }
                                            if (var14 == 2) {
                                                var15 = 47;
                                            }
                                            class78.method698(var15, arg1.field1323, var11[var14], -26415, var5, (long) var10.field2192, class89.method772((byte) 93, new class63[] { class103.field2379, var10.field2202 }));
                                        }
                                    }
                                }
                                class63[] var16 = arg1.field1359;
                                if (class131.field2849) {
                                    var16 = class116.method913(var16, 12852);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class50.field1207++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 23;
                                            }
                                            if (var17 == 1) {
                                                var18 = 46;
                                            }
                                            if (var17 == 2) {
                                                var18 = 31;
                                            }
                                            if (var17 == 3) {
                                                var18 = 20;
                                            }
                                            if (var17 == 4) {
                                                var18 = 1;
                                            }
                                            class78.method698(var18, arg1.field1323, var16[var17], -26415, var5, (long) var10.field2192, class89.method772((byte) 121, new class63[] { class103.field2379, var10.field2202 }));
                                        }
                                    }
                                }
                                class78.method698((short) 1002, arg1.field1323, class88.field2065, -26415, var5, (long) var10.field2192, class89.method772((byte) 34, new class63[] { class103.field2379, var10.field2202 }));
                            } else if ((class167.field3452 & 0x10) == 16) {
                                class154.field3218++;
                                class78.method698((short) 35, arg1.field1323, class106.field2420, -26415, var5, (long) var10.field2192, class89.method772((byte) 42, new class63[] { class24.field547, class30.field744, var10.field2202 }));
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg1.field1336) {
            return;
        }
        if (!class181.field3680) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class63 var23 = class96.method830(var19, (byte) -110, arg1);
                if (var23 != null) {
                    class186.field3763++;
                    class78.method698((short) 1003, arg1.field1323, var23, -26415, arg1.field1408, (long) (var19 + 1), arg1.field1381);
                }
            }
            class63 var20 = class79.method707((byte) -122, arg1);
            if (var20 != null) {
                class118.field2638++;
                class78.method698((short) 33, arg1.field1323, var20, arg3 - 26433, arg1.field1408, 0L, arg1.field1381);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class63 var22 = class96.method830(var21, (byte) -110, arg1);
                if (var22 != null) {
                    class186.field3763++;
                    class78.method698((short) 49, arg1.field1323, var22, arg3 - 26433, arg1.field1408, (long) (var21 + 1), arg1.field1381);
                }
            }
            if (class75.method687(class10.method136((byte) -127, arg1), 0)) {
                class198.field3961++;
                class78.method698((short) 16, arg1.field1323, class75.field1862, -26415, arg1.field1408, 0L, class151.field3175);
                return;
            }
            return;
        }
        if (class5.method88(class10.method136((byte) -98, arg1), false) && (class167.field3452 & 0x20) == 32) {
            class19.field469++;
            class78.method698((short) 11, arg1.field1323, class106.field2420, arg3 - 26433, arg1.field1408, 0L, class89.method772((byte) 73, new class63[] { class24.field547, class34.field815, arg1.field1381 }));
            return;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[[[I)V")
    public static final void method634(int arg0, int arg1, int arg2, int[][][] arg3) {
        class168.field3469 = arg0;
        class199.field3979 = arg1;
        class13.field298 = arg2;
        class148.field3117 = new class96[arg0][arg1][arg2];
        class38.field923 = new int[arg0][arg1 + 1][arg2 + 1];
        class97.field2310 = arg3;
        class169.method1144();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Lwb;")
    public static final class200 method635(int arg0) {
        if (arg0 != -9448) {
            return null;
        }
        field1717++;
        class200 var1 = new class200();
        var1.field3989 = class153.field3202;
        var1.field3993 = class60.field1521[0];
        var1.field3992 = class190.field3868[0];
        var1.field3988 = class190.field3875[0];
        var1.field3990 = class163.field3366[0];
        var1.field3991 = class28.field658;
        int var2 = var1.field3992 * var1.field3988;
        byte[] var3 = class85.field2014[0];
        var1.field3994 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field3994[var4] = class110.field2486[class110.method881(var3[var4], 255)];
        }
        class12.method151((byte) 101);
        return var1;
    }
}
