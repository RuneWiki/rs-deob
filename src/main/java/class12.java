import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class12 extends class176 {

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "[B")
    public byte[] field293;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field279 = 0;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "Lgg;")
    private static class63 field285 = class116.method911(43, "Select");

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Lgg;")
    public static class63 field286 = class116.method911(43, "sl_button");

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Lgg;")
    private static class63 field288 = class116.method911(43, "FULL");

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "Lgg;")
    public static class63 field292 = field285;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lgg;")
    public static class63 field282 = field288;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static volatile int field278 = 0;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Lgg;")
    private static class63 field291 = class116.method911(43, "Please wait)3)3)3");

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "Lgg;")
    public static class63 field290 = class116.method911(43, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "Lgg;")
    public static class63 field295 = class116.method911(43, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "Lgg;")
    public static class63 field296 = class116.method911(43, "Clientscript error in: ");

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Lgg;")
    public static class63 field284 = field291;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static void method147(int arg0) {
        field285 = null;
        field290 = null;
        field284 = null;
        field288 = null;
        field292 = null;
        field286 = null;
        field282 = null;
        field296 = null;
        field295 = null;
        field291 = null;
        if (arg0 != 3) {
            field286 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIII[Lie;[B)V")
    public static final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class79[] arg8, byte[] arg9) {
        int var10 = -60 % ((-arg0 - 57) / 38);
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg3 + var11 > 0 && arg3 + var11 < 103 && arg4 + var16 > 0 && arg4 + var16 < 103) {
                    arg8[arg5].field1909[arg3 + var11][arg4 + var16] = class110.method881(arg8[arg5].field1909[arg3 + var11][arg4 + var16], -16777217);
                }
            }
        }
        field283++;
        class3 var12 = new class3(arg9);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg1 == var13 && var14 >= arg2 && arg2 + 8 > var14 && var15 >= arg7 && arg7 + 8 > var15) {
                        class38.method359(arg4 + class187.method1230(var15 & 0x7, arg6, 7, var14 & 0x7), arg6, 0, 0, arg5, class11.method143(var15 & 0x7, var14 & 0x7, (byte) -125, arg6) + arg3, 4, var12);
                    } else {
                        class38.method359(-1, 0, 0, 0, 0, -1, 4, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([B)V")
    public class12(byte[] arg0) {
        this.field293 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)Lff;")
    public static final class54 method149(int arg0, int arg1, int arg2) {
        field280++;
        if (arg2 != 12226) {
            method148(-86, 111, 57, -57, 87, 109, 124, -13, null, null);
        }
        class54 var3 = class59.method555(arg1, arg2 ^ 0x526F);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field1368 == null || arg0 >= var3.field1368.length) {
            return null;
        } else {
            return var3.field1368[arg0];
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLth;Lth;)V")
    public static final void method150(byte arg0, class179 arg1, class179 arg2) {
        if (class196.field3940 == null) {
            class196.field3940 = class57.method550(class166.field3410, class153.field3210, class110.field2479, 662);
        }
        if (class186.field3754 == null) {
            class186.field3754 = class37.method348(class110.field2479, 98, class153.field3210, class169.field3490);
        }
        field294++;
        if (class165.field3386 == null) {
            class165.field3386 = class37.method348(class110.field2479, 56, class153.field3210, class68.field1707);
        }
        if (class166.field3401 == null) {
            class166.field3401 = class37.method348(class110.field2479, 67, class153.field3210, class121.field2689);
        }
        class178.method1191(0, 23, 765, 480, 0);
        class178.method1188(0, 0, 125, 23, 12425273, 9135624);
        class178.method1188(125, 0, 640, 23, 5197647, 2697513);
        arg1.method647(class161.field3325, 62, 15, 0, -1);
        if (class166.field3401 != null) {
            class166.field3401[1].method1083(140, 1);
            arg2.method644(class176.field3623, 152, 10, 16777215, -1);
            class166.field3401[0].method1083(140, 12);
            arg2.method644(class124.field2755, 152, 21, 16777215, -1);
        }
        if (class165.field3386 != null) {
            short var3 = 390;
            short var4 = 500;
            short var5 = 610;
            short var6 = 280;
            if (class104.field2388[0] == 0 && class177.field3630[0] == 0) {
                class165.field3386[2].method1083(var6, 4);
            } else {
                class165.field3386[0].method1083(var6, 4);
            }
            if (class104.field2388[0] == 0 && class177.field3630[0] == 1) {
                class165.field3386[3].method1083(var6 + 15, 4);
            } else {
                class165.field3386[1].method1083(var6 + 15, 4);
            }
            arg1.method644(class116.field2591, var6 + 32, 17, 16777215, -1);
            if (class104.field2388[0] == 1 && class177.field3630[0] == 0) {
                class165.field3386[2].method1083(var3, 4);
            } else {
                class165.field3386[0].method1083(var3, 4);
            }
            if (class104.field2388[0] == 1 && class177.field3630[0] == 1) {
                class165.field3386[3].method1083(var3 + 15, 4);
            } else {
                class165.field3386[1].method1083(var3 + 15, 4);
            }
            arg1.method644(class147.field3109, var3 + 32, 17, 16777215, -1);
            if (class104.field2388[0] == 2 && class177.field3630[0] == 0) {
                class165.field3386[2].method1083(var4, 4);
            } else {
                class165.field3386[0].method1083(var4, 4);
            }
            if (class104.field2388[0] == 2 && class177.field3630[0] == 1) {
                class165.field3386[3].method1083(var4 + 15, 4);
            } else {
                class165.field3386[1].method1083(var4 + 15, 4);
            }
            arg1.method644(class191.field3887, var4 + 32, 17, 16777215, -1);
            if (class104.field2388[0] == 3 && class177.field3630[0] == 0) {
                class165.field3386[2].method1083(var5, 4);
            } else {
                class165.field3386[0].method1083(var5, 4);
            }
            if (class104.field2388[0] == 3 && class177.field3630[0] == 1) {
                class165.field3386[3].method1083(var5 + 15, 4);
            } else {
                class165.field3386[1].method1083(var5 + 15, 4);
            }
            arg1.method644(class89.field2096, var5 + 32, 17, 16777215, -1);
        }
        class178.method1191(708, 4, 50, 16, 0);
        if (arg0 >= -18) {
            field288 = null;
        }
        arg2.method647(class103.field2374, 733, 16, 16777215, -1);
        class56.field1489 = -1;
        if (class196.field3940 == null) {
            return;
        }
        byte var7 = 19;
        byte var8 = 88;
        int var9 = 765 / (var8 + 1);
        int var10 = 480 / (var7 + 1);
        int var11;
        int var12;
        do {
            var11 = var9;
            var12 = var10;
            if (class9.field182 <= (var9 - 1) * var10) {
                var9--;
            }
            if (class9.field182 <= (var10 - 1) * var9) {
                var10--;
            }
            if ((var10 - 1) * var9 >= class9.field182) {
                var10--;
            }
        } while (var10 != var12 || var9 != var11);
        int var13 = (480 - var7 * var10) / (var10 + 1);
        int var14 = (765 - var8 * var9) / (var9 + 1);
        if (var13 > 5) {
            var13 = 5;
        }
        if (var14 > 5) {
            var14 = 5;
        }
        int var15 = (765 - var8 * var9 - (var9 + -1) * var14) / 2;
        int var16 = var15;
        int var17 = 0;
        int var18 = (480 - (var10 - 1) * var13 - var7 * var10) / 2;
        int var19 = var18 + 23;
        for (int var20 = 0; var20 < class9.field182; var20++) {
            class69 var21 = class47.field1111[var20];
            boolean var22 = true;
            class63 var23 = class175.method1162((byte) -126, var21.field1727);
            if (var21.field1727 == -1) {
                var22 = false;
                var23 = class64.field1641;
            } else if (var21.field1727 > 1980) {
                var23 = field282;
                var22 = false;
            }
            if (class100.field2365 >= var16 && class188.field3794 >= var19 && class100.field2365 < var8 + var16 && var7 + var19 > class188.field3794 && var22) {
                class56.field1489 = var20;
                class196.field3940[var21.field1728 ? 1 : 0].method1323(var16, var19, 128, 16777215);
            } else {
                class196.field3940[var21.field1728 ? 1 : 0].method1314(var16, var19);
            }
            if (class186.field3754 != null) {
                class186.field3754[var21.field1720 + (var21.field1728 ? 8 : 0)].method1083(var16 + 29, var19);
            }
            arg1.method647(class175.method1162((byte) -126, var21.field1722), var16 + 15, var19 - -(var7 / 2) + 5, 0, -1);
            arg2.method647(var23, var16 + 60, var19 - -(var7 / 2) - -5, 268435455, -1);
            var19 += var13 + var7;
            var17++;
            if (var17 >= var10) {
                var16 += var14 + var8;
                var19 = var18 + 23;
                var17 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static final void method151(byte arg0) {
        class163.field3366 = null;
        int var1 = 36 / ((arg0 - 20) / 41);
        field281++;
        class60.field1521 = null;
        class85.field2014 = null;
        class190.field3868 = null;
        class190.field3875 = null;
        class110.field2486 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lrg;IIIIII)V")
    public static final void method152(class160 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field3313.length;
        for (int var8 = 0; var8 < var7; var8++) {
            int var21 = arg0.field3313[var8] - class138.field2971;
            int var22 = arg0.field3298[var8] - class103.field2373;
            int var23 = arg0.field3293[var8] - class14.field344;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field3309 != null) {
                class160.field3299[var8] = var24;
                class160.field3306[var8] = var27;
                class160.field3304[var8] = var28;
            }
            class160.field3295[var8] = (var24 << 9) / var28 + class25.field565;
            class160.field3310[var8] = (var27 << 9) / var28 + class25.field578;
        }
        class25.field562 = 0;
        int var9 = arg0.field3300.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var11 = arg0.field3300[var10];
            int var12 = arg0.field3301[var10];
            int var13 = arg0.field3307[var10];
            int var14 = class160.field3295[var11];
            int var15 = class160.field3295[var12];
            int var16 = class160.field3295[var13];
            int var17 = class160.field3310[var11];
            int var18 = class160.field3310[var12];
            int var19 = class160.field3310[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class139.field2984 && class180.method1194(class181.field3673, class30.field772, var17, var18, var19, var14, var15, var16)) {
                    class198.field3960 = arg5;
                    class18.field425 = arg6;
                }
                class25.field577 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class25.field581 || var15 > class25.field581 || var16 > class25.field581) {
                    class25.field577 = true;
                }
                if (arg0.field3309 == null || arg0.field3309[var10] == -1) {
                    if (arg0.field3297[var10] != 12345678) {
                        class25.method246(var17, var18, var19, var14, var15, var16, arg0.field3297[var10], arg0.field3303[var10], arg0.field3308[var10]);
                    }
                } else if (class18.field430) {
                    int var20 = class25.field569.method1254(12411, arg0.field3309[var10]);
                    class25.method246(var17, var18, var19, var14, var15, var16, class153.method1067(var20, arg0.field3297[var10]), class153.method1067(var20, arg0.field3303[var10]), class153.method1067(var20, arg0.field3308[var10]));
                } else if (arg0.field3292) {
                    class25.method250(var17, var18, var19, var14, var15, var16, arg0.field3297[var10], arg0.field3303[var10], arg0.field3308[var10], class160.field3299[0], class160.field3299[1], class160.field3299[3], class160.field3306[0], class160.field3306[1], class160.field3306[3], class160.field3304[0], class160.field3304[1], class160.field3304[3], arg0.field3309[var10]);
                } else {
                    class25.method250(var17, var18, var19, var14, var15, var16, arg0.field3297[var10], arg0.field3303[var10], arg0.field3308[var10], class160.field3299[var11], class160.field3299[var12], class160.field3299[var13], class160.field3306[var11], class160.field3306[var12], class160.field3306[var13], class160.field3304[var11], class160.field3304[var12], class160.field3304[var13], arg0.field3309[var10]);
                }
            }
        }
    }
}
