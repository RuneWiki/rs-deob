import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class189 {

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field3161 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Ltl;")
    public static class59 field3156 = class85.method639(": ", 9588);

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Ltl;")
    public static class59 field3164 = class85.method639(" weitere Optionen", 9588);

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "Ltl;")
    public static class59 field3172 = class85.method639("p11_full", 9588);

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public int field3165;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "Lme;")
    public static class295 field3170;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Ltl;")
    public static class59 field3159;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lme;Lme;I)V", line = 6)
    public static final void method1396(class295 arg0, class295 arg1, int arg2) {
        class293.field5004 = arg1;
        field3166++;
        class287.field4940 = arg0;
        if (arg2 != 255) {
            method1399(6);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLtl;)V", line = 42)
    public static final void method1397(boolean arg0, class59 arg1) {
        field3169++;
        for (class270 var2 = (class270) class129.field2134.method536(2); var2 != null; var2 = (class270) class129.field2134.method533(24)) {
            if (var2.field4692.method453(arg1, (byte) -72)) {
                class53.field788 = var2;
                return;
            }
        }
        if (arg0) {
            method1396((class295) null, (class295) null, -63);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZIIIIII)V", line = 71)
    public static final void method1398(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3163++;
        class128.field2100 = 0;
        if (arg0) {
            field3158 = 111;
        }
        for (int var7 = -1; var7 < class29.field385 + class185.field3107; var7++) {
            class105 var8;
            if (var7 == -1) {
                var8 = class286.field4920;
            } else if (var7 >= class29.field385) {
                var8 = class23.field311[class232.field3816[var7 - class29.field385]];
            } else {
                var8 = class211.field3438[class243.field4060[var7]];
            }
            if (var8 != null && var8.method149((byte) 104)) {
                if (var8 instanceof class23) {
                    class119 var9 = ((class23) var8).field314;
                    if (var9.field1958 != null) {
                        var9 = var9.method890(958);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class29.field385) {
                    class119 var15 = ((class23) var8).field314;
                    if (var15.field1958 != null) {
                        var15 = var15.method890(958);
                    }
                    if (var15.field1981 >= 0 && class154.field2509.length > var15.field1981) {
                        int var16;
                        if (var15.field1938 == -1) {
                            var16 = var8.method791(-6683) + 15;
                        } else {
                            var16 = var15.field1938 + 15;
                        }
                        class93.method678(arg5, arg4, arg6 >> 1, true, var8, var16, arg3 >> 1);
                        if (class13.field181 > -1) {
                            class154.field2509[var15.field1981].method337(class13.field181 + arg1 - 12, arg2 + -30 + class292.field4992);
                        }
                    }
                    int var17 = 0;
                    class71[] var18 = class200.field3318;
                    while (var17 < var18.length) {
                        class71 var19 = var18[var17];
                        if (var19 != null && var19.field1107 == 1 && class232.field3816[var7 - class29.field385] == var19.field1118 && (class30.field420 % 20) < 10) {
                            int var20;
                            if (var15.field1938 == -1) {
                                var20 = var8.method791(-6683) + 15;
                            } else {
                                var20 = var15.field1938 + 15;
                            }
                            class93.method678(arg5, arg4, arg6 >> 1, true, var8, var20, arg3 >> 1);
                            if (class13.field181 > -1) {
                                class291.field4976[var19.field1105].method337(arg1 + class13.field181 - 12, class292.field4992 + arg2 - 28);
                            }
                        }
                        var17++;
                    }
                } else {
                    class102 var10 = (class102) var8;
                    int var11 = 30;
                    if (var10.field1672 != -1 || var10.field1657 != -1) {
                        class93.method678(arg5, arg4, arg6 >> 1, true, var8, var8.method791(-6683) + 15, arg3 >> 1);
                        if (class13.field181 > -1) {
                            if (var10.field1672 != -1) {
                                class26.field353[var10.field1672].method337(class13.field181 + arg1 - 12, -var11 + class292.field4992 + arg2);
                                var11 += 25;
                            }
                            if (var10.field1657 != -1) {
                                class154.field2509[var10.field1657].method337(class13.field181 + arg1 - 12, arg2 - var11 + class292.field4992);
                                var11 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class71[] var12 = class200.field3318;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            class71 var14 = var12[var13];
                            if (var14 != null && var14.field1107 == 10 && class243.field4060[var7] == var14.field1118) {
                                class93.method678(arg5, arg4, arg6 >> 1, true, var8, var8.method791(-6683) + 15, arg3 >> 1);
                                if (class13.field181 > -1) {
                                    class291.field4976[var14.field1105].method337(arg1 - (12 - class13.field181), class292.field4992 + arg2 + -var11);
                                }
                            }
                        }
                    }
                }
                if (var8.field1762 != null && (class29.field385 <= var7 || class286.field4914 == 0 || class286.field4914 == 3 || class286.field4914 == 1 && class59.method454(-1801, ((class102) var8).field1663))) {
                    class93.method678(arg5, arg4, arg6 >> 1, true, var8, var8.method791(-6683), arg3 >> 1);
                    if (class13.field181 > -1 && class128.field2100 < class59.field879) {
                        class59.field927[class128.field2100] = class251.field4187.method705(var8.field1762) / 2;
                        class59.field902[class128.field2100] = class251.field4187.field1496;
                        class59.field923[class128.field2100] = class13.field181;
                        class59.field896[class128.field2100] = class292.field4992;
                        class59.field899[class128.field2100] = var8.field1728;
                        class59.field878[class128.field2100] = var8.field1724;
                        class59.field892[class128.field2100] = var8.field1784;
                        class59.field877[class128.field2100] = var8.field1762;
                        class128.field2100++;
                    }
                }
                if (var8.field1727 > class30.field420) {
                    class260 var21 = class177.field2903[0];
                    class260 var22 = class177.field2903[1];
                    int var26;
                    if (var8 instanceof class23) {
                        class23 var23 = (class23) var8;
                        class260[] var24 = (class260[]) ((class260[]) class169.field2722.method1483((byte) -74, (long) var23.field314.field1932));
                        if (var24 == null) {
                            var24 = class19.method125(class34.field502, -29269, 0, var23.field314.field1932);
                            if (var24 != null) {
                                class169.field2722.method1488((long) var23.field314.field1932, var24, 25838);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var21 = var24[0];
                            var22 = var24[1];
                        }
                        class119 var25 = var23.field314;
                        if (var25.field1938 == -1) {
                            var26 = var8.method791(-6683);
                        } else {
                            var26 = var25.field1938;
                        }
                    } else {
                        var26 = var8.method791(-6683);
                    }
                    class93.method678(arg5, arg4, arg6 >> 1, true, var8, var26 + var21.field4337 + 10, arg3 >> 1);
                    if (class13.field181 > -1) {
                        int var27 = class13.field181 + arg1 - (var21.field4342 >> 1);
                        int var28 = arg2 - (3 - class292.field4992);
                        var21.method337(var27, var28);
                        int var29 = var8.field1735 * var21.field4342 / 255;
                        int var30 = var21.field4337;
                        if (class55.field815) {
                            class240.method1684(var27, var28, var27 + var29, var28 - -var30);
                        } else {
                            class272.method1902(var27, var28, var27 + var29, var28 + var30);
                        }
                        var22.method337(var27, var28);
                        if (class55.field815) {
                            class240.method1689(arg1, arg2, arg1 + arg3, arg2 + arg6);
                        } else {
                            class272.method1901(arg1, arg2, arg1 + arg3, arg2 + arg6);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field1740[var31] > class30.field420) {
                        int var32;
                        if ((var8 instanceof class23)) {
                            class23 var33 = (class23) var8;
                            class119 var34 = var33.field314;
                            if (var34.field1938 == -1) {
                                var32 = var8.method791(-6683) / 2;
                            } else {
                                var32 = var34.field1938 / 2;
                            }
                        } else {
                            var32 = var8.method791(-6683) / 2;
                        }
                        class93.method678(arg5, arg4, arg6 >> 1, true, var8, var32, arg3 >> 1);
                        if (class13.field181 > -1) {
                            if (var31 == 1) {
                                class292.field4992 -= 20;
                            }
                            if (var31 == 2) {
                                class292.field4992 -= 10;
                                class13.field181 -= 15;
                            }
                            if (var31 == 3) {
                                class292.field4992 -= 10;
                                class13.field181 += 15;
                            }
                            class249.field4143[var8.field1791[var31]].method337(class13.field181 + arg1 - 12, class292.field4992 + arg2 + -12);
                            class178.field2923.method697(class81.method619((byte) -94, var8.field1785[var31]), class13.field181 + arg1 - 1, class292.field4992 + arg2 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class128.field2100; var35++) {
            int var36 = class59.field896[var35];
            int var37 = class59.field923[var35];
            int var38 = class59.field902[var35];
            boolean var39 = true;
            int var40 = class59.field927[var35];
            while (var39) {
                var39 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (var36 + 2 > class59.field896[var41] - class59.field902[var41] && class59.field896[var41] + 2 > var36 - var38 && (var37 - var40) < (class59.field923[var41] + class59.field927[var41]) && var37 + var40 > class59.field923[var41] + -class59.field927[var41] && (class59.field896[var41] - class59.field902[var41]) < var36) {
                        var39 = true;
                        var36 = class59.field896[var41] - class59.field902[var41];
                    }
                }
            }
            class13.field181 = class59.field923[var35];
            class292.field4992 = class59.field896[var35] = var36;
            class59 var42 = class59.field877[var35];
            if (class50.field765 == 0) {
                int var43 = 16776960;
                if (class59.field899[var35] < 6) {
                    var43 = class187.field3130[class59.field899[var35]];
                }
                if (class59.field899[var35] == 6) {
                    var43 = (class178.field2914 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class59.field899[var35] == 7) {
                    var43 = class178.field2914 % 20 >= 10 ? 65535 : 255;
                }
                if (class59.field899[var35] == 8) {
                    var43 = (class178.field2914 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class59.field899[var35] == 9) {
                    int var44 = 150 - class59.field892[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 + 16384000 - (var44 * 327680);
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class59.field899[var35] == 10) {
                    int var45 = 150 - class59.field892[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16384000 + 16711935 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 + 755 - (var45 * 5) - 32768000;
                    }
                }
                if (class59.field899[var35] == 11) {
                    int var46 = 150 - class59.field892[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 - (var46 - 100) * 327680;
                    }
                }
                if (class59.field878[var35] == 0) {
                    class251.field4187.method697(var42, class13.field181 + arg1, class292.field4992 + arg2, var43, 0);
                }
                if (class59.field878[var35] == 1) {
                    class251.field4187.method719(var42, arg1 + class13.field181, arg2 - -class292.field4992, var43, 0, class178.field2914);
                }
                if (class59.field878[var35] == 2) {
                    class251.field4187.method721(var42, arg1 + class13.field181, class292.field4992 + arg2, var43, 0, class178.field2914);
                }
                if (class59.field878[var35] == 3) {
                    class251.field4187.method715(var42, arg1 + class13.field181, class292.field4992 + arg2, var43, 0, class178.field2914, 150 - class59.field892[var35]);
                }
                if (class59.field878[var35] == 4) {
                    int var47 = (150 - class59.field892[var35]) * (class251.field4187.method705(var42) + 100) / 150;
                    if (class55.field815) {
                        class240.method1684(arg1 + class13.field181 - 50, arg2, class13.field181 + arg1 + 50, arg2 + arg6);
                    } else {
                        class272.method1902(class13.field181 + arg1 - 50, arg2, class13.field181 + arg1 + 50, arg2 - -arg6);
                    }
                    class251.field4187.method720(var42, arg1 - (-class13.field181 - 50) - var47, arg2 - -class292.field4992, var43, 0);
                    if (class55.field815) {
                        class240.method1689(arg1, arg2, arg1 + arg3, arg2 + arg6);
                    } else {
                        class272.method1901(arg1, arg2, arg1 + arg3, arg2 - -arg6);
                    }
                }
                if (class59.field878[var35] == 5) {
                    int var48 = 150 - class59.field892[var35];
                    if (class55.field815) {
                        class240.method1684(arg1, class292.field4992 + arg2 - class251.field4187.field1496 - 1, arg1 + arg3, class292.field4992 + arg2 + 5);
                    } else {
                        class272.method1902(arg1, class292.field4992 + arg2 - class251.field4187.field1496 - 1, arg1 + arg3, arg2 + class292.field4992 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class251.field4187.method697(var42, class13.field181 + arg1, class292.field4992 + arg2 + var49, var43, 0);
                    if (class55.field815) {
                        class240.method1689(arg1, arg2, arg1 + arg3, arg2 + arg6);
                    } else {
                        class272.method1901(arg1, arg2, arg1 + arg3, arg2 + arg6);
                    }
                }
            } else {
                class251.field4187.method697(var42, arg1 + class13.field181, class292.field4992 + arg2, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 554)
    public static void method1399(int arg0) {
        int var1 = 52 / ((arg0 + 5) / 60);
        field3172 = null;
        field3170 = null;
        field3156 = null;
        field3159 = null;
        field3164 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
    public abstract void method38(int arg0, int arg1);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
    public abstract void method39(int arg0, int arg1, int arg2);
}
