import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class137 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lje;")
    public static class67 field3088 = class85.method592(255, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field3087 = 0;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lje;")
    private static class67 field3089 = class85.method592(255, "Attack");

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lje;")
    public static class67 field3094 = class85.method592(255, "rect_debug=");

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lje;")
    public static class67 field3095 = class85.method592(255, "(Z");

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lje;")
    public static class67 field3085 = field3089;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lje;")
    private static class67 field3097 = class85.method592(255, "Login limit exceeded)3");

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lje;")
    public static class67 field3093 = field3097;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field3099 = 0;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Lje;")
    public static class67 field3096 = class85.method592(255, ")4l");

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Lje;")
    public static class67 field3102 = class85.method592(255, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lqd;")
    public static class115 field3090;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BILfd;I)Lqb;")
    public static final class113 method1042(byte arg0, int arg1, class40 arg2, int arg3) {
        field3100++;
        if (class150.method1149(arg2, -80, arg1, arg3)) {
            if (arg0 < 106) {
                field3099 = -108;
            }
            return class140.method1059((byte) 100);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method1043(byte arg0) {
        field3096 = null;
        field3085 = null;
        field3094 = null;
        field3090 = null;
        field3097 = null;
        field3089 = null;
        field3088 = null;
        field3095 = null;
        if (arg0 == 28) {
            field3093 = null;
            field3102 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3103++;
        if (arg0 < arg4 || arg5 < 1 || arg0 > 102 || arg5 > 102) {
            return;
        }
        if (class41.field773 && class128.field2817 != arg3) {
            return;
        }
        int var8 = 0;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg7 == 0) {
            var8 = class134.field3044.method347(arg3, arg0, arg5);
        }
        if (arg7 == 1) {
            var8 = class134.field3044.method361(arg3, arg0, arg5);
        }
        if (arg7 == 2) {
            var8 = class134.field3044.method366(arg3, arg0, arg5);
        }
        if (arg7 == 3) {
            var8 = class134.field3044.method352(arg3, arg0, arg5);
        }
        if (var8 != 0) {
            int var12 = var8 >> 14 & 0x7FFF;
            int var13 = class134.field3044.method371(arg3, arg0, arg5, var8);
            int var14 = var13 & 0x1F;
            int var15 = var13 >> 6 & 0x3;
            if (arg7 == 0) {
                class134.field3044.method368(arg3, arg0, arg5);
                class47 var16 = class130.method993(var12, (byte) 111);
                if (var16.field894 != 0) {
                    class86.field1900[arg3].method208(var14, arg5, var15, arg0, (byte) -111, var16.field918);
                }
            }
            if (arg7 == 1) {
                class134.field3044.method328(arg3, arg0, arg5);
            }
            if (arg7 == 2) {
                class134.field3044.method362(arg3, arg0, arg5);
                class47 var17 = class130.method993(var12, (byte) 124);
                if (var17.field875 + arg0 > 103 || arg5 + var17.field875 > 103 || arg0 + var17.field931 > 103 || var17.field931 + arg5 > 103) {
                    return;
                }
                if (var17.field894 != 0) {
                    class86.field1900[arg3].method210(var17.field931, arg0, var15, arg4 - 2, arg5, var17.field875, var17.field918);
                }
            }
            if (arg7 == 3) {
                class134.field3044.method359(arg3, arg0, arg5);
                class47 var18 = class130.method993(var12, (byte) 110);
                if (var18.field894 == 1) {
                    class86.field1900[arg3].method221(-262145, arg5, arg0);
                }
            }
        }
        if (arg1 < 0) {
            return;
        }
        int var19 = arg3;
        if (arg3 < 3 && (class82.field1809[1][arg0][arg5] & 0x2) == 2) {
            var19 = arg3 + 1;
        }
        class49.method313(arg5, arg2, arg1, arg6, var19, arg3, class86.field1900[arg3], class134.field3044, arg4 ^ 0xFFFFFFF2, arg0);
        return;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZII)I")
    public static final int method1045(boolean arg0, int arg1, int arg2) {
        field3091++;
        class117 var3 = (class117) class79.field1705.method1119(28254, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field2637.length > arg1) {
            return arg0 ? var3.field2637[arg1] : 111;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
    public static final boolean method1046(int arg0, int arg1) {
        field3101++;
        if (arg0 != -25905) {
            field3097 = null;
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZLkc;)I")
    public static final int method1047(int arg0, boolean arg1, class72 arg2) {
        field3098++;
        if (arg2.field1547 == null || arg0 >= arg2.field1547.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field1547[arg0];
            int var4 = 0;
            if (!arg1) {
                method1046(-52, 37);
            }
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                byte var8 = 0;
                int var9 = var3[var4++];
                if (var9 == 0) {
                    return var5;
                }
                if (var9 == 1) {
                    var7 = class135.field3068[var3[var4++]];
                }
                if (var9 == 2) {
                    var7 = class49.field944[var3[var4++]];
                }
                if (var9 == 3) {
                    var7 = class134.field3011[var3[var4++]];
                }
                if (var9 == 15) {
                    var8 = 1;
                }
                if (var9 == 16) {
                    var8 = 2;
                }
                if (var9 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class72 var12 = class67.method467((byte) -13, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class123.method961(var13, 1658).field2309 || class112.field2523)) {
                        for (int var14 = 0; var14 < var12.field1581.length; var14++) {
                            if (var13 + 1 == var12.field1581[var14]) {
                                var7 += var12.field1482[var14];
                            }
                        }
                    }
                }
                if (var9 == 5) {
                    var7 = class42.field804[var3[var4++]];
                }
                if (var9 == 17) {
                    var8 = 3;
                }
                if (var9 == 6) {
                    var7 = class56.field1117[class49.field944[var3[var4++]] - 1];
                }
                if (var9 == 7) {
                    var7 = class42.field804[var3[var4++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var7 = class37.field667.field1822;
                }
                if (var9 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class105.field2399[var15]) {
                            var7 += class49.field944[var15];
                        }
                    }
                }
                if (var9 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class72 var18 = class67.method467((byte) -13, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class123.method961(var19, 1658).field2309 || class112.field2523)) {
                        for (int var20 = 0; var20 < var18.field1581.length; var20++) {
                            if (var19 + 1 == var18.field1581[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var7 = class66.field1293;
                }
                if (var9 == 12) {
                    var7 = class2.field20;
                }
                if (var9 == 13) {
                    int var21 = class42.field804[var3[var4++]];
                    int var22 = var3[var4++];
                    var7 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var23 = var3[var4++];
                    var7 = class60.method415(var23, (byte) 15);
                }
                if (var9 == 18) {
                    var7 = (class37.field667.field2957 >> 7) + class130.field2863;
                }
                if (var9 == 19) {
                    var7 = (class37.field667.field2963 >> 7) + class35.field647;
                }
                if (var9 == 20) {
                    var7 = var3[var4++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var5 += var7;
                    }
                    if (var6 == 1) {
                        var5 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var5 /= var7;
                    }
                    if (var6 == 3) {
                        var5 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }
}
