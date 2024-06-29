import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class71 extends Canvas {

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field1097;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Z")
    public static boolean field1089 = false;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Lna;")
    public static class26 field1088 = class69.method505("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", (byte) -128);

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field1093 = 0;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "Lna;")
    private static class26 field1098 = class69.method505("flash2:", (byte) -128);

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lna;")
    public static class26 field1095 = field1098;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "Lna;")
    public static class26 field1100 = field1098;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "Lna;")
    public static class26 field1099 = class69.method505("Annuler", (byte) -121);

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V", line = 6)
    public static final void method508(int arg0, int arg1) {
        int var2 = 81 % ((39 - arg1) / 41);
        field1086++;
        class120 var3 = class293.method2059(4, 6, arg0);
        var3.method823(true);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)Z", line = 18)
    public static final boolean method509(int arg0, int arg1) {
        field1087++;
        if (class259.field4226[arg0]) {
            return true;
        } else if (class240.field3884.method1873(-99, arg0)) {
            int var2 = class240.field3884.method1898(arg0, (byte) 94);
            if (var2 == 0) {
                class259.field4226[arg0] = true;
                return true;
            }
            if (class86.field1416[arg0] == null) {
                class86.field1416[arg0] = new class297[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class86.field1416[arg0][var3] == null) {
                    byte[] var4 = class240.field3884.method1889(arg0, (byte) -122, var3);
                    if (var4 != null) {
                        class297 var5 = class86.field1416[arg0][var3] = new class297();
                        var5.field5088 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method2101(arg1 ^ 0xFFFFFF97, new class82(var4));
                        } else {
                            var5.method2092(-115, new class82(var4));
                        }
                    }
                }
            }
            class259.field4226[arg0] = true;
            if (arg1 != 104) {
                method510(100);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 77)
    public static final void method510(int arg0) {
        field1094++;
        int var1 = 0;
        if (arg0 >= -46) {
            method512(95, -37, -27, (class228[]) null, -59, (byte) -121, (byte[]) null, -69, -50, -72, false);
        }
        while (var1 < class28.field474) {
            int var2 = class168.field2599[var1];
            class159 var3 = class268.field4427[var2];
            int var4 = class300.field5157.method642((byte) -43);
            if ((var4 & 0x10) != 0) {
                var4 += class300.field5157.method642((byte) -43) << 8;
            }
            class7.method43(var4, var2, (byte) -79, var3);
            var1++;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 114)
    public static void method511(byte arg0) {
        field1088 = null;
        field1099 = null;
        field1098 = null;
        if (arg0 >= -69) {
            field1089 = false;
        }
        field1100 = null;
        field1095 = null;
    }

    @OriginalMember(owner = "client!tm", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 128)
    public final void update(Graphics arg0) {
        this.field1097.update(arg0);
        field1090++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III[Lmj;IB[BIIIZ)V", line = 140)
    public static final void method512(int arg0, int arg1, int arg2, class228[] arg3, int arg4, byte arg5, byte[] arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field1096++;
        if (!arg10) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg1 + var11 > 0 && arg1 + var11 < 103 && (arg4 + var12) > 0 && (arg4 + var12) < 103) {
                        arg3[arg2].field3605[arg1 + var11][arg4 + var12] = class4.method23(arg3[arg2].field3605[arg1 + var11][arg4 + var12], -16777217);
                    }
                }
            }
        }
        if (arg5 >= -91) {
            field1100 = (class26) null;
        }
        byte var13;
        if (arg10) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class82 var14 = new class82(arg6);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg7 == var15 && arg9 <= var16 && arg9 + 8 > var16 && arg8 <= var17 && var17 < arg8 + 8) {
                        class216.method1449(0, 0, arg10, var14, class240.method1654(arg0, (byte) -117, var16 & 0x7, var17 & 0x7) + arg4, class96.method717(arg0, true, var17 & 0x7, var16 & 0x7) + arg1, (byte) 63, arg0, arg2);
                    } else {
                        class216.method1449(0, 0, arg10, var14, -1, -1, (byte) 123, 0, 0);
                    }
                }
            }
        }
        while (var14.field1280.length > var14.field1301) {
            int var18 = var14.method642((byte) -74);
            if (var18 != 129) {
                var14.field1301--;
                break;
            }
            for (int var19 = 0; var19 < 4; var19++) {
                byte var20 = var14.method599(false);
                if (var20 == 0) {
                    if (var19 <= arg7) {
                        int var28 = arg1 + 7;
                        int var29 = arg1;
                        int var30 = arg4 + 7;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 >= 104) {
                            var28 = 104;
                        }
                        int var31 = arg4;
                        if (arg4 < 0) {
                            var31 = 0;
                        } else if (arg4 >= 104) {
                            var31 = 104;
                        }
                        if (arg1 < 0) {
                            var29 = 0;
                        } else if (arg1 >= 104) {
                            var29 = 104;
                        }
                        while (var28 > var29) {
                            while (var31 < var30) {
                                class157.field2449[arg2][var29][var31] = 0;
                                var31++;
                            }
                            var29++;
                        }
                    }
                } else if (var20 == 1) {
                    for (int var21 = 0; var21 < 64; var21 += 4) {
                        for (int var22 = 0; var22 < 64; var22 += 4) {
                            byte var23 = var14.method599(false);
                            if (var19 <= arg7) {
                                for (int var24 = var21; var24 < (var21 + 4); var24++) {
                                    for (int var25 = var22; var25 < var22 + 4; var25++) {
                                        if (var24 >= arg9 && var24 < (arg9 + 8) && var25 >= arg8 && (arg8 + 8) > arg8) {
                                            int var26 = arg1 + class96.method717(arg0, true, var25 & 0x7, var24 & 0x7);
                                            int var27 = class240.method1654(arg0, (byte) -97, var24 & 0x7, var25 & 0x7) + arg4;
                                            if (var26 >= 0 && var26 < 104 && var27 >= 0 && var27 < 104) {
                                                class157.field2449[arg2][var26][var27] = var23;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (var20 == 2) {
                }
            }
        }
        boolean var32 = false;
        if (class255.field4184 && !arg10) {
            class218 var33 = null;
            label217: while (true) {
                int var35;
                label210: do {
                    while (var14.field1280.length > var14.field1301) {
                        int var34 = var14.method642((byte) -33);
                        if (var34 != 0) {
                            if (var34 != 1) {
                                throw new IllegalStateException();
                            }
                            var35 = var14.method642((byte) -71);
                            continue label210;
                        }
                        var33 = new class218(var14);
                    }
                    if (var33 == null) {
                        var33 = new class218();
                    }
                    class79.field1248[arg1 >> 3][arg4 >> 3] = var33;
                    break label217;
                } while (var35 <= 0);
                for (int var36 = 0; var36 < var35; var36++) {
                    class215 var37 = new class215(var14);
                    if (var37.field3365 == 31) {
                        class117 var38 = class138.method925(1001, var14.method576(1));
                        var37.method1437((byte) 123, var38.field1833, var38.field1846, var38.field1837, var38.field1845);
                    }
                    int var39 = var37.field3362 >> 7;
                    int var40 = var37.field3369 >> 7;
                    if (var37.field3363 == arg7 && var39 >= arg9 && arg9 + 8 > var39 && arg8 <= var40 && (arg8 + 8) > var40) {
                        int var41 = class301.method2119(arg0, var37.field3362 & 0x3FF, (byte) -83, var37.field3369 & 0x3FF) + (arg1 << 7);
                        int var42 = class230.method1552(var37.field3362 & 0x3FF, arg0, false, var37.field3369 & 0x3FF) + (arg4 << 7);
                        var37.field3362 = var41;
                        var37.field3369 = var42;
                        int var43 = var37.field3362 >> 7;
                        int var44 = var37.field3369 >> 7;
                        if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                            var37.field3352 = (class92.field1492[1][var43][var44] & 0x2) != 0;
                            var37.field3354 = class229.field3635[var37.field3363][var43][var44] - var37.field3354;
                            class226.method1501(var37);
                        }
                    }
                }
            }
        }
        if (var32) {
            return;
        }
        int var45 = arg1 + 7;
        int var46 = arg4 + 7;
        for (int var47 = arg1; var47 < var45; var47++) {
            for (int var48 = arg4; var48 < var46; var48++) {
                class157.field2449[arg2][var47][var48] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 480)
    public final void paint(Graphics arg0) {
        this.field1097.paint(arg0);
        field1092++;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 495)
    public class71(Component arg0) {
        this.field1097 = arg0;
    }
}
