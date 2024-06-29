import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class275 {

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lcb;")
    public static class243 field4351 = null;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[Z")
    public static boolean[] field4352 = new boolean[100];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II[[[Lwi;IZI)Z")
    public static final boolean method1855(int arg0, int arg1, class134[][][] arg2, int arg3, boolean arg4, int arg5) {
        byte var6 = arg4 ? 1 : (byte) (class209.field3423 & 0xFF);
        field4350++;
        if (class227.field3766[class250.field3980][arg1][arg3] == var6) {
            return false;
        } else if ((class201.field3198[class250.field3980][arg1][arg3] & 0x4) == 0) {
            return false;
        } else {
            if (arg0 != 5373952) {
                field4351 = null;
            }
            byte var7 = 0;
            class238.field3866[var7] = arg1;
            int var8 = 0;
            int var31 = var7 + 1;
            class148.field2387[var7] = arg3;
            class227.field3766[class250.field3980][arg1][arg3] = var6;
            while (var31 != var8) {
                int var9 = class238.field3866[var8] & 0xFFFF;
                int var10 = class238.field3866[var8] >> 24 & 0xFF;
                boolean var11 = false;
                boolean var12 = false;
                int var13 = class238.field3866[var8] >> 16 & 0xFF;
                int var14 = class148.field2387[var8] & 0xFFFF;
                if ((class201.field3198[class250.field3980][var9][var14] & 0x4) == 0) {
                    var12 = true;
                }
                int var15 = class148.field2387[var8] >> 16 & 0xFF;
                label229: for (int var16 = class250.field3980 + 1; var16 <= 3; var16++) {
                    if ((class201.field3198[var16][var9][var14] & 0x8) == 0) {
                        if (var12 && arg2[var16][var9][var14] != null) {
                            if (arg2[var16][var9][var14].field2133 != null) {
                                int var19 = class84.method602((byte) 29, var13);
                                if (arg2[var16][var9][var14].field2133.field3772 == var19 || arg2[var16][var9][var14].field2133.field3778 == var19) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var20 = class84.method602((byte) -121, var10);
                                    if (arg2[var16][var9][var14].field2133.field3772 == var20 || arg2[var16][var9][var14].field2133.field3778 == var20) {
                                        continue;
                                    }
                                }
                                if (var15 != 0) {
                                    int var21 = class84.method602((byte) 76, var15);
                                    if (arg2[var16][var9][var14].field2133.field3772 == var21 || arg2[var16][var9][var14].field2133.field3778 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var9][var14].field2153 != null) {
                                for (int var22 = 0; var22 < arg2[var16][var9][var14].field2151; var22++) {
                                    int var23 = (int) (arg2[var16][var9][var14].field2153[var22].field4574 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg2[var16][var9][var14].field2153[var22].field4574 >> 20 & 0x3L);
                                    int var25 = var24 << 6 | var23;
                                    if (var13 == var25 || var10 != 0 && var10 == var25 || var15 != 0 && var15 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        class134 var26 = arg2[var16][var9][var14];
                        var11 = true;
                        if (var26 != null && var26.field2151 > 0) {
                            for (int var27 = 0; var27 < var26.field2151; var27++) {
                                class289 var28 = var26.field2153[var27];
                                if (var28.field4573 != var28.field4567 || var28.field4575 != var28.field4571) {
                                    for (int var29 = var28.field4567; var29 <= var28.field4573; var29++) {
                                        for (int var30 = var28.field4575; var30 <= var28.field4571; var30++) {
                                            class227.field3766[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class227.field3766[var16][var9][var14] = var6;
                    }
                }
                if (var11) {
                    if (class39.field741[arg5] < class124.field2012[class250.field3980 + 1][var9][var14]) {
                        class39.field741[arg5] = class124.field2012[class250.field3980 + 1][var9][var14];
                    }
                    int var17 = var9 << 7;
                    int var18 = var14 << 7;
                    if (var17 < class129.field2083[arg5]) {
                        class129.field2083[arg5] = var17;
                    } else if (class5.field67[arg5] < var17) {
                        class5.field67[arg5] = var17;
                    }
                    if (class32.field501[arg5] > var18) {
                        class32.field501[arg5] = var18;
                    } else if (var18 > class29.field471[arg5]) {
                        class29.field471[arg5] = var18;
                    }
                }
                var8 = var8 + 1 & 0xFFF;
                if (!var12) {
                    if (var9 >= 1 && class227.field3766[class250.field3980][var9 - 1][var14] != var6) {
                        class238.field3866[var31] = class220.method1495(class220.method1495(1179648, var9 - 1), -754974720);
                        class148.field2387[var31] = class220.method1495(var14, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class227.field3766[class250.field3980][var9 - 1][var14] = var6;
                    }
                    var14++;
                    if (var14 < 104) {
                        if (var9 - 1 >= 0 && class227.field3766[class250.field3980][var9 - 1][var14] != var6 && (class201.field3198[class250.field3980][var9][var14] & 0x4) == 0 && (class201.field3198[class250.field3980][var9 - 1][var14 - 1] & 0x4) == 0) {
                            class238.field3866[var31] = class220.method1495(1375731712, class220.method1495(var9 - 1, 1179648));
                            class148.field2387[var31] = class220.method1495(1245184, var14);
                            class227.field3766[class250.field3980][var9 - 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class227.field3766[class250.field3980][var9][var14] != var6) {
                            class238.field3866[var31] = class220.method1495(class220.method1495(5373952, var9), 318767104);
                            class148.field2387[var31] = class220.method1495(var14, 5439488);
                            class227.field3766[class250.field3980][var9][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class227.field3766[class250.field3980][var9 + 1][var14] != var6 && (class201.field3198[class250.field3980][var9][var14] & 0x4) == 0 && (class201.field3198[class250.field3980][var9 + 1][var14 - 1] & 0x4) == 0) {
                            class238.field3866[var31] = class220.method1495(-1845493760, class220.method1495(5373952, var9 + 1));
                            class148.field2387[var31] = class220.method1495(var14, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class227.field3766[class250.field3980][var9 + 1][var14] = var6;
                        }
                    }
                    var14--;
                    if (var9 + 1 < 104 && class227.field3766[class250.field3980][var9 + 1][var14] != var6) {
                        class238.field3866[var31] = class220.method1495(1392508928, class220.method1495(9568256, var9 + 1));
                        class148.field2387[var31] = class220.method1495(9633792, var14);
                        var31 = var31 + 1 & 0xFFF;
                        class227.field3766[class250.field3980][var9 + 1][var14] = var6;
                    }
                    var14--;
                    if (var14 >= 0) {
                        if ((var9 - 1) >= 0 && class227.field3766[class250.field3980][var9 - 1][var14] != var6 && (class201.field3198[class250.field3980][var9][var14] & 0x4) == 0 && (class201.field3198[class250.field3980][var9 - 1][var14 + 1] & 0x4) == 0) {
                            class238.field3866[var31] = class220.method1495(class220.method1495(13762560, var9 - 1), 301989888);
                            class148.field2387[var31] = class220.method1495(var14, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class227.field3766[class250.field3980][var9 - 1][var14] = var6;
                        }
                        if (class227.field3766[class250.field3980][var9][var14] != var6) {
                            class238.field3866[var31] = class220.method1495(-1828716544, class220.method1495(13762560, var9));
                            class148.field2387[var31] = class220.method1495(13828096, var14);
                            class227.field3766[class250.field3980][var9][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class227.field3766[class250.field3980][var9 + 1][var14] != var6 && (class201.field3198[class250.field3980][var9][var14] & 0x4) == 0 && (class201.field3198[class250.field3980][var9 + 1][var14 + 1] & 0x4) == 0) {
                            class238.field3866[var31] = class220.method1495(-771751936, class220.method1495(9568256, var9 + 1));
                            class148.field2387[var31] = class220.method1495(var14, 9633792);
                            class227.field3766[class250.field3980][var9 + 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class39.field741[arg5] != -1000000) {
                class39.field741[arg5] += 10;
                class129.field2083[arg5] -= 50;
                class5.field67[arg5] += 50;
                class29.field471[arg5] += 50;
                class32.field501[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1856(int arg0, int arg1) {
        field4347++;
        if (arg1 == 100 && class23.field387 > 0) {
            byte[] var2 = class9.field120[--class23.field387];
            class9.field120[class23.field387] = null;
            return var2;
        } else if (arg0 != 9568256) {
            return null;
        } else if (arg1 == 5000 && class132.field2106 > 0) {
            byte[] var3 = class190.field3078[--class132.field2106];
            class190.field3078[class132.field2106] = null;
            return var3;
        } else if (arg1 == 30000 && class111.field1843 > 0) {
            byte[] var4 = class84.field1308[--class111.field1843];
            class84.field1308[class111.field1843] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;BI)I")
    public static final int method1857(String arg0, byte arg1, int arg2) {
        if (arg1 > -34) {
            method1859((byte) 57);
        }
        field4349++;
        return method1858(true, 87, arg0, arg2);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZILjava/lang/String;I)I")
    public static final int method1858(boolean arg0, int arg1, String arg2, int arg3) {
        field4355++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg1 == 87) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg2.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg2.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg0) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    throw new NumberFormatException();
                }
                if (arg3 <= var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg3 * var6 + var11;
                if (var10 / arg3 != var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            if (!var5) {
                throw new NumberFormatException();
            }
            return var6;
        } else {
            return 29;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static void method1859(byte arg0) {
        field4351 = null;
        if (arg0 >= 51) {
            field4352 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public static final void method1860(int arg0, int arg1, int arg2) {
        field4354++;
        int var3 = -8 / ((arg1 + 42) / 53);
        if (class231.field3798 != arg2) {
            class176.field2776 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class176.field2776[var4] = (var4 << 12) / arg2;
            }
            class231.field3798 = arg2;
            class287.field4537 = arg2 - 1;
            class152.field2460 = arg2 == 64 ? 2048 : 4096;
        }
        if (class259.field4118 == arg0) {
            return;
        }
        if (class231.field3798 == arg0) {
            class182.field2864 = class176.field2776;
        } else {
            class182.field2864 = new int[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                class182.field2864[var5] = (var5 << 12) / arg0;
            }
        }
        class92.field1523 = arg0 - 1;
        class259.field4118 = arg0;
    }
}
