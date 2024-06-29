import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class175 extends class204 {

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public static int field2671 = 0;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    public static int field2674;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kv", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field2675;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "[Lff;")
    public static class9[] field2672;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZIII)V")
    public static final void method1256(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            return;
        }
        for (int var5 = 0; var5 < class73.field1232; var5++) {
            Rectangle var6 = class135.field2072[var5];
            if (arg3 < (var6.x + var6.width) && var6.x < arg0 + arg3 && arg2 < var6.y + var6.height && var6.y < (arg2 + arg4)) {
                class482.field7076[var5] = true;
            }
        }
        field2674++;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
    public static void method1257(boolean arg0) {
        if (!arg0) {
            method1257(true);
        }
        field2672 = null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lsd;I)V")
    public static final void method1258(class61 arg0, int arg1) {
        if (arg1 != -10220) {
            method1258(null, -106);
        }
        class25.field444 = arg0;
        field2673++;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILqa;I)Z")
    public static final boolean method1259(int arg0, class162 arg1, int arg2) {
        field2670++;
        int var3 = (class237.field3436 - 104) / 2;
        int var4 = (class83.field1366 - 104) / arg2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg0; var52 <= 3; var52++) {
                    if (class110.method813(58, var6, arg0, var51, var52)) {
                        int var53 = var52;
                        if (class72.method606(var6, var51, (byte) -83)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class111.method821(var6, var53, var51, (byte) 54);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class162.field2440 = arg1.method527(var7, 0, 512, 512, 512);
        class29.method241((byte) -89);
        int var9 = -(-((int) (Math.random() * 20.0D)) + (-((int) (Math.random() * 20.0D) + 238 - 10 << 8) - ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - 238)) - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class403.field5907][class403.field5907];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class403.field5907) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class403.field5907) {
                arg1.method509(0, 0, class403.field5907 * 4, class403.field5907 * 4);
                arg1.method436(-16777216);
                for (int var37 = arg0; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class403.field5907; var44++) {
                        for (int var50 = 0; var50 < class403.field5907; var50++) {
                            var12[var44][var50] = class110.method813(6, var13 + var44, arg0, var36 + var50, var37);
                        }
                    }
                    class145.field2135[var37].method285(0, 0, 1024, var13, var36, class403.field5907 + var13, class403.field5907 + var36, var12);
                    if (!class438.field6394) {
                        for (int var45 = -4; var45 < class403.field5907; var45++) {
                            for (int var46 = -4; var46 < class403.field5907; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var48 >= var4 && class110.method813(63, var47, arg0, var48, var37)) {
                                    int var49 = var37;
                                    if (class72.method606(var47, var48, (byte) -50)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class264.method1692(var9, 31519, var47, var45 * 4, (class403.field5907 - var46) * 4 - 4, arg1, var48, var49, var10);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class438.field6394) {
                    class133 var38 = class255.field3679[arg0];
                    for (int var39 = 0; var39 < class403.field5907; var39++) {
                        for (int var40 = 0; var40 < class403.field5907; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field2047[var41 - var38.field2050][var42 - var38.field2052];
                            if ((var43 & 0x40240000) != 0) {
                                arg1.method1175(4, 8, var39 * 4, -1713569622, 4, (class403.field5907 - var40) * 4 - 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg1.method1173(arg2 ^ 0xFFFFFF82, var39 * 4, -1713569622, 4, (class403.field5907 - var40) * 4 - 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg1.method1169(arg2 - 29111, -1713569622, 4, var39 * 4 + 3, (-var40 + class403.field5907) * 4 + -4);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg1.method1173(-119, var39 * 4, -1713569622, 4, (class403.field5907 - var40) * 4 - 1);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg1.method1169(arg2 - 29111, -1713569622, 4, var39 * 4, (class403.field5907 - var40) * 4 - 4);
                            }
                        }
                    }
                }
                arg1.method471(0, 0, class403.field5907 * 4, class403.field5907 * 4, var11, 2);
                class162.field2440.method143(((var13 - var3) * 4) + 48, -((-var4 + var36) * 4) + 464 + -(class403.field5907 * 4), class403.field5907 * 4, class403.field5907 * 4, 0, 0);
            }
        }
        arg1.method492();
        arg1.method436(-16777215);
        class67.method582(-25099);
        class324.field4962 = 0;
        class523.field7691.method2264(58);
        if (!class438.field6394) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg0; var21 <= (arg0 + 1) && var21 <= 3; var21++) {
                        if (class110.method813(-122, var14, arg0, var20, var21)) {
                            class232 var22 = (class232) class358.method2310(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class232) class51.method372(var21, var14, var20, field2675 == null ? (field2675 = method1260("rq")) : field2675);
                            }
                            if (var22 == null) {
                                var22 = (class232) class396.method2468(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class232) class7.method52(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class510 var23 = class246.field3567.method609(110, var22.method379((byte) -96));
                                if (!var23.field7455 || class22.field394) {
                                    int var24 = var23.field7533;
                                    if (var23.field7497 != null) {
                                        for (int var25 = 0; var25 < var23.field7497.length; var25++) {
                                            if (var23.field7497[var25] != -1) {
                                                class510 var26 = class246.field3567.method609(119, var23.field7497[var25]);
                                                if (var26.field7533 >= 0) {
                                                    var24 = var26.field7533;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class210 var28 = class495.field7209.method1835(arg2 ^ 0x26, var24);
                                            if (var28 != null && var28.field3038) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class255.field3679[var21].field2047;
                                            int var32 = class255.field3679[var21].field2050;
                                            int var33 = class255.field3679[var21].field2052;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < (var3 + 104 - 1) && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 103) > var30 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class207.field2984[class324.field4962] = var23.field7483;
                                        class522.field7671[class324.field4962] = var29;
                                        class225.field3264[class324.field4962] = var30;
                                        class324.field4962++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class518.field7617 != null) {
                class200.field2917.field1398 = 1;
                class495.field7209.method1834((byte) -3, 1024, 64);
                for (int var15 = 0; var15 < class518.field7617.field5748; var15++) {
                    int var16 = class518.field7617.field5749[var15];
                    if (var16 >> 28 == class95.field1558.field5538) {
                        int var17 = ((var16 & 0xFFFF837) >> 14) - class483.field7082;
                        int var18 = (var16 & 0x3FFF) - class465.field6840;
                        if (var17 >= 0 && var17 < class237.field3436 && var18 >= 0 && class83.field1366 > var18) {
                            class523.field7691.method2270(arg2 - 2, new class242(var15));
                        } else {
                            class210 var19 = class495.field7209.method1835(36, class518.field7617.field5750[var15]);
                            if (var19.field3035 != null && (var19.field3045 + var17) >= 0 && (var19.field3040 + var17) < class237.field3436 && (var18 + var19.field3030) >= 0 && class83.field1366 > var19.field3031 + var18) {
                                class523.field7691.method2270(0, new class242(var15));
                            }
                        }
                    }
                }
                class495.field7209.method1834((byte) -3, 128, 64);
                class200.field2917.field1398 = 2;
                class200.field2917.method663(0);
            }
        }
        return true;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1260(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
