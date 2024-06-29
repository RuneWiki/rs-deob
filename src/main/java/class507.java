import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class507 {

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7573 = new String[] { method3819(method3818("`#d\u0003(")), method3819(method3818("ux&A")), method3819(method3818("~xdl}")), method3819(method3818("\u007f}")), method3819(method3818("~xdY:Hy8D;|%")) };

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field7569 = 0;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field7571;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eu", name = "a", descriptor = "Ljava/lang/Class;")
    public static Class field7572;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lha;II)Z")
    public static final boolean method3816(class63 arg0, int arg1, int arg2) {
        try {
            field7570++;
            int var3 = (class126.field1823 - 104) / 2;
            int var4 = (class169.field2725 - 104) / 2;
            boolean var5 = true;
            for (int var6 = var3; var6 < var3 + 104; var6++) {
                for (int var7 = var4; var7 < (var4 + 104); var7++) {
                    for (int var8 = arg2; var8 <= 3; var8++) {
                        if (class223.method1962(var8, 116, arg2, var7, var6)) {
                            int var9 = var8;
                            if (class541.method4028(var7, var6, (byte) 113)) {
                                var9 = var8 - 1;
                            }
                            if (var9 >= 0) {
                                var5 &= class365.method3015(var9, arg1 ^ 0x4, var6, var7);
                            }
                        }
                    }
                }
            }
            if (!var5) {
                return false;
            }
            int[] var10 = new int[262144];
            if (arg1 != 4) {
                field7569 = 126;
            }
            for (int var11 = 0; var11 < var10.length; var11++) {
                var10[var11] = -16777216;
            }
            class30.field320 = arg0.method665(512, 512, 125, 0, var10, 512);
            class591.method4339((byte) 114);
            int var12 = (int) (Math.random() * 20.0D) + ((((int) (Math.random() * 20.0D) - 10) + 238 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8)) + 238 - 10 | 0xFF000000;
            int var13 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
            int var14 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
            boolean[][] var15 = new boolean[class588.field8516 + 1 + 2][class588.field8516 + 3];
            for (int var16 = var3; var16 < var3 + 104; var16 += class588.field8516) {
                for (int var17 = var4; var17 < var4 + 104; var17 += class588.field8516) {
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = var16;
                    if (var16 > 0) {
                        var20 = var16 - 1;
                        var18 += 4;
                    }
                    int var21 = var17;
                    if (var17 > 0) {
                        var21 = var17 - 1;
                    }
                    int var22 = class588.field8516 + var16;
                    if (var22 < 104) {
                        var22++;
                    }
                    int var23 = var17 + class588.field8516;
                    if (var23 < 104) {
                        var23++;
                        var19 += 4;
                    }
                    arg0.method221(0, 0, class588.field8516 * 4 + var18, class588.field8516 * 4 + var19);
                    arg0.method182(-16777216);
                    for (int var24 = arg2; var24 <= 3; var24++) {
                        for (int var25 = 0; var25 <= class588.field8516; var25++) {
                            for (int var26 = 0; var26 <= class588.field8516; var26++) {
                                var15[var25][var26] = class223.method1962(var24, 41, arg2, var21 + var26, var20 + var25);
                            }
                        }
                        class493.field7420[var24].method710(0, 0, 1024, var20, var21, var22, var23, var15);
                        if (!class636.field9123) {
                            for (int var27 = -4; var27 < class588.field8516; var27++) {
                                for (int var28 = -4; var28 < class588.field8516; var28++) {
                                    int var29 = var16 + var27;
                                    int var30 = var17 + var28;
                                    if (var3 <= var29 && var30 >= var4 && class223.method1962(var24, 68, arg2, var30, var29)) {
                                        int var31 = var24;
                                        if (class541.method4028(var30, var29, (byte) 113)) {
                                            var31 = var24 - 1;
                                        }
                                        if (var31 >= 0) {
                                            class465.method3591(var27 * 4 + var18, var29, var30, arg0, var31, (class588.field8516 - var28) * 4 + var19 - 4, 4, var13, var12);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class636.field9123) {
                        class580 var32 = class297.field4841[arg2];
                        for (int var33 = 0; var33 < class588.field8516; var33++) {
                            for (int var34 = 0; var34 < class588.field8516; var34++) {
                                int var35 = var16 + var33;
                                int var36 = var17 + var34;
                                int var37 = var32.field8355[var35 - var32.field8345][var36 - var32.field8356];
                                if ((var37 & 0x40240000) != 0) {
                                    arg0.method664((class588.field8516 - var34) * 4 + var19 - 4, -1713569622, 4, var33 * 4 + var18, 4, true);
                                } else if ((var37 & 0x800000) != 0) {
                                    arg0.method658(4, 27174, var18 + (var33 * 4), (-var34 + class588.field8516) * 4 + var19 - 4, -1713569622);
                                } else if ((var37 & 0x2000000) != 0) {
                                    arg0.method662(-1713569622, (byte) 125, 4, var33 * 4 + var18 + 3, var19 - -((-var34 + class588.field8516) * 4) - 4);
                                } else if ((var37 & 0x8000000) != 0) {
                                    arg0.method658(4, 27174, var33 * 4 + var18, (-var34 + class588.field8516) * 4 + var19 - 1, -1713569622);
                                } else if ((var37 & 0x20000000) != 0) {
                                    arg0.method662(-1713569622, (byte) 60, 4, var33 * 4 + var18, var19 - (-((-var34 + class588.field8516) * 4) - -4));
                                }
                            }
                        }
                    }
                    arg0.method242(var18, var19, class588.field8516 * 4, class588.field8516 * 4, var14, 2);
                    class30.field320.method8(((var16 - var3) * 4) + 48, 464 - ((var17 - var4) * 4 + class588.field8516 * 4), class588.field8516 * 4, class588.field8516 * 4, var18, var19);
                }
            }
            arg0.method227();
            arg0.method182(-16777215);
            class30.method318(-110);
            class54.field693 = 0;
            class20.field203.method3224(false);
            if (!class636.field9123) {
                for (int var38 = var3; var38 < (var3 + 104); var38++) {
                    for (int var39 = var4; var39 < (var4 + 104); var39++) {
                        for (int var40 = arg2; var40 <= (arg2 + 1) && var40 <= 3; var40++) {
                            if (class223.method1962(var40, 59, arg2, var39, var38)) {
                                class3 var41 = (class3) class605.method4422(var40, var38, var39);
                                if (var41 == null) {
                                    var41 = (class3) class59.method614(var40, var38, var39, field7572 == null ? (field7572 = method3817(field7573[3])) : field7572);
                                }
                                if (var41 == null) {
                                    var41 = (class3) class244.method2102(var40, var38, var39);
                                }
                                if (var41 == null) {
                                    var41 = (class3) class479.method3658(var40, var38, var39);
                                }
                                if (var41 != null) {
                                    class362 var42 = class370.field5999.method4002(-35, var41.method32((byte) -95));
                                    if (!var42.field5888 || class115.field1686) {
                                        int var43 = var42.field5864;
                                        if (var42.field5873 != null) {
                                            for (int var44 = 0; var44 < var42.field5873.length; var44++) {
                                                if (var42.field5873[var44] != -1) {
                                                    class362 var45 = class370.field5999.method4002(-10, var42.field5873[var44]);
                                                    if (var45.field5864 >= 0) {
                                                        var43 = var45.field5864;
                                                    }
                                                }
                                            }
                                        }
                                        if (var43 >= 0) {
                                            boolean var46 = false;
                                            if (var43 >= 0) {
                                                class209 var47 = class362.field5915.method2325(arg1 ^ 0xFFFFFFFA, var43);
                                                if (var47 != null && var47.field3280) {
                                                    var46 = true;
                                                }
                                            }
                                            int var48 = var38;
                                            int var49 = var39;
                                            if (var46) {
                                                int[][] var50 = class297.field4841[var40].field8355;
                                                int var51 = class297.field4841[var40].field8345;
                                                int var52 = class297.field4841[var40].field8356;
                                                for (int var53 = 0; var53 < 10; var53++) {
                                                    int var54 = (int) (Math.random() * 4.0D);
                                                    if (var54 == 0 && var3 < var48 && var48 > (var38 - 3) && (var50[var48 - var51 - 1][var49 - var52] & 0x2C0108) == 0) {
                                                        var48--;
                                                    }
                                                    if (var54 == 1 && var48 < (var3 + 104 - 1) && var48 < (var38 + 3) && (var50[var48 + 1 - var51][var49 - var52] & 0x2C0180) == 0) {
                                                        var48++;
                                                    }
                                                    if (var54 == 2 && var4 < var49 && var49 > (var39 - 3) && (var50[var48 - var51][var49 - var52 - 1] & 0x2C0102) == 0) {
                                                        var49--;
                                                    }
                                                    if (var54 == 3 && var49 < (var4 + 104 - 1) && var49 < var39 + 3 && (var50[var48 - var51][var49 - (var52 - 1)] & 0x2C0120) == 0) {
                                                        var49++;
                                                    }
                                                }
                                            }
                                            class523.field7729[class54.field693] = var42.field5855;
                                            class433.field6807[class54.field693] = var48;
                                            class98.field1447[class54.field693] = var49;
                                            class54.field693++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class620.field8960 != null) {
                    class672.field9530.field717 = 1;
                    class362.field5915.method2327(64, 1024, 78);
                    for (int var55 = 0; var55 < class620.field8960.field8571; var55++) {
                        int var56 = class620.field8960.field8570[var55];
                        if ((var56 >> 28) == class438.field6846.field9975) {
                            int var57 = ((var56 & 0xFFFF9A6) >> 14) - class397.field6289;
                            int var58 = (var56 & 0x3FFF) - class141.field2011;
                            if (var57 >= 0 && class126.field1823 > var57 && var58 >= 0 && var58 < class169.field2725) {
                                class20.field203.method3220(new class272(var55), arg1 ^ 0x4);
                            } else {
                                class209 var59 = class362.field5915.method2325(-2, class620.field8960.field8568[var55]);
                                if (var59.field3276 != null && var59.field3307 + var57 >= 0 && class126.field1823 > (var59.field3308 + var57) && (var58 + var59.field3303) >= 0 && (var58 + var59.field3268) < class169.field2725) {
                                    class20.field203.method3220(new class272(var55), 0);
                                }
                            }
                        }
                    }
                    class362.field5915.method2327(64, 128, arg1 + 97);
                    class672.field9530.field717 = 2;
                    class672.field9530.method608(false);
                }
            }
            return true;
        } catch (RuntimeException var61) {
            throw class590.method4333(var61, field7573[2] + (arg0 == null ? field7573[1] : field7573[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field7571++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7573[4] + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3817(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3818(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3819(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 74;
                    break;
                case 3:
                    var10005 = 45;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
