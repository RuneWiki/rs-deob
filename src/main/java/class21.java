import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class21 {

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    private int field276 = 0;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    private int field282 = -1;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Lld;")
    private class105 field278 = new class105();

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Z")
    public boolean field286 = false;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[[I")
    private int[][] field274;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lse;")
    private class154[] field275;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public final void method128(byte arg0) {
        for (int var2 = 0; var2 < this.field280; var2++) {
            this.field274[var2] = null;
        }
        if (arg0 != -84) {
            this.field280 = 112;
        }
        field281++;
        this.field275 = null;
        this.field274 = null;
        this.field278.method645(0);
        this.field278 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field279++;
        int var7 = class239.field3187;
        client.field2460 = 0;
        int[] var8 = class265.field3502;
        for (int var9 = 0; var9 < class202.field2734 + var7; var9++) {
            class429 var32 = null;
            class86 var33;
            if (var7 <= var9) {
                var33 = class221.field2941[class412.field5638[var9 - var7]];
                var32 = ((class121) var33).field1780;
                if (var32.field5824 != null) {
                    var32 = var32.method2531(class38.field562, 103);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class413.field5644[var8[var9]];
            }
            if (var33.field1189 >= 0 && (class67.field911 == var33.field1145 || class233.field3103.field6502 == var33.field6502)) {
                class424.method2505(var33.method540(arg3 ^ 0x62), true, var33, arg5, arg1 >> 1, arg2, arg4 >> 1);
                if (class168.field2324[0] >= 0) {
                    if (var33.field1161 != null && (var9 >= var7 || class42.field597 == 0 || class42.field597 == 3 || class42.field597 == 1 && class104.method631(0, ((class487) var33).field6742)) && class405.field5559 > client.field2460) {
                        class405.field5550[client.field2460] = class392.field5448.method2145(var33.field1161, 13938) / 2;
                        class405.field5546[client.field2460] = class168.field2324[0];
                        class405.field5564[client.field2460] = class168.field2324[1];
                        class405.field5551[client.field2460] = var33.field1162;
                        class405.field5553[client.field2460] = var33.field1140;
                        class405.field5557[client.field2460] = var33.field1186;
                        class405.field5556[client.field2460] = var33.field1161;
                        client.field2460++;
                    }
                    class139 var34 = class36.field549[0];
                    int var35 = arg6 + class168.field2324[1] - Math.max(class392.field5448.field4772, var34.method771());
                    if (!var33.field1170 && class70.field968 < var33.field1149) {
                        class139 var36 = class36.field549[1];
                        boolean var37 = true;
                        int var38;
                        if (var33 instanceof class121) {
                            var38 = var32.field5835;
                            if (var38 == -1) {
                                var38 = var33.method549(arg3 - 97).field3766;
                            }
                        } else {
                            var38 = var33.method549(-113).field3766;
                        }
                        if (var38 != -1) {
                            class139[] var39 = (class139[]) class276.field3642.method493((byte) 19, (long) var38);
                            if (var39 == null) {
                                class325[] var40 = class325.method1823(class473.field6525, var38, 0);
                                if (var40 != null) {
                                    var39 = new class139[var40.length];
                                    for (int var41 = 0; var41 < var40.length; var41++) {
                                        var39[var41] = class98.field1432.method2050(var40[var41], true);
                                    }
                                    class276.field3642.method505((long) var38, var39, 78);
                                }
                            }
                            if (var39 != null && var39.length == 2) {
                                var34 = var39[0];
                                var36 = var39[1];
                            }
                        }
                        int var42 = arg0 + class168.field2324[0] - (var34.method775() >> 1);
                        var34.method836(var42, var35);
                        int var43 = var34.method775() * var33.field1180 / 255;
                        if (var33.field1180 > 0 && var43 < 2) {
                            var43 = 2;
                        }
                        class98.field1432.method1969(var42, var35, var42 + var43, var35 + var34.method771());
                        var36.method836(var42, var35);
                        class98.field1432.method1981(arg0, arg6, arg0 + arg1, arg6 - -arg4);
                    }
                    var35 -= 2;
                    if (!var33.field1170) {
                        if (class70.field968 < var33.field1166) {
                            class139 var44 = class177.field2405[var33.field1123 ? 2 : 0];
                            class139 var45 = class177.field2405[var33.field1123 ? 3 : 1];
                            boolean var46 = true;
                            int var47;
                            if (var33 instanceof class121) {
                                var47 = var32.field5859;
                                if (var47 == -1) {
                                    var47 = var33.method549(-108).field3748;
                                }
                            } else {
                                var47 = var33.method549(-93).field3748;
                            }
                            if (var47 != -1) {
                                class139[] var48 = (class139[]) class196.field2675.method493((byte) 19, (long) var47);
                                if (var48 == null) {
                                    class325[] var49 = class325.method1823(class473.field6525, var47, 0);
                                    if (var49 != null) {
                                        var48 = new class139[var49.length];
                                        for (int var50 = 0; var50 < var49.length; var50++) {
                                            var48[var50] = class98.field1432.method2050(var49[var50], true);
                                        }
                                        class196.field2675.method505((long) var47, var48, 69);
                                    }
                                }
                                if (var48 != null && var48.length == 4) {
                                    var45 = var48[var33.field1123 ? 3 : 1];
                                    var44 = var48[var33.field1123 ? 2 : 0];
                                }
                            }
                            int var51 = var33.field1166 - class70.field968;
                            int var54;
                            if (var51 > var33.field1113) {
                                int var52 = var51 - var33.field1113;
                                int var53 = var33.field1131 == 0 ? 0 : (var33.field1168 - var52) / var33.field1131 * var33.field1131;
                                var54 = var44.method775() * var53 / var33.field1168;
                            } else {
                                var54 = var44.method775();
                            }
                            int var55 = var44.method771();
                            var35 -= var55;
                            int var56 = class168.field2324[0] + arg0 - (var44.method775() >> 1);
                            var44.method836(var56, var35);
                            class98.field1432.method1969(var56, var35, var54 + var56, var35 - -var55);
                            var45.method836(var56, var35);
                            var35 -= 2;
                            class98.field1432.method1981(arg0, arg6, arg0 + arg1, arg6 - -arg4);
                        }
                        if (var9 < var7) {
                            class487 var57 = (class487) var33;
                            if (var57.field6767 != -1) {
                                var35 -= 25;
                                class208.field2816[var57.field6767].method836(class168.field2324[0] + arg0 - 12, var35);
                                var35 -= 2;
                            }
                            if (var57.field6778 != -1) {
                                var35 -= 25;
                                class99.field1442[var57.field6778].method836(arg0 + class168.field2324[0] - 12, var35);
                                var35 -= 2;
                            }
                        } else if (var32.field5869 >= 0 && var32.field5869 < class99.field1442.length) {
                            class139 var58 = class99.field1442[var32.field5869];
                            var35 -= 25;
                            var58.method836(arg0 - ((var58.method775() >> 1) - class168.field2324[0]), var35);
                            var35 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class487)) {
                        int var59 = 0;
                        class409[] var60 = class88.field1295;
                        for (int var61 = 0; var61 < var60.length; var61++) {
                            class409 var63 = var60[var61];
                            if (var63 != null && var63.field5598 == 1 && class412.field5638[var9 - var7] == var63.field5597) {
                                class139 var64 = class191.field2597[var63.field5611];
                                if (var64.method771() > var59) {
                                    var59 = var64.method771();
                                }
                                if ((class70.field968 % 20) < 10) {
                                    var64.method836(class168.field2324[0] + arg0 - 12, var35 - var64.method771());
                                }
                            }
                        }
                        if (var59 > 0) {
                            var10000 = var35 - (var59 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var65 = 0;
                        class409[] var66 = class88.field1295;
                        for (int var67 = 0; var67 < var66.length; var67++) {
                            class409 var69 = var66[var67];
                            if (var69 != null && var69.field5598 == 10 && var8[var9] == var69.field5597) {
                                class139 var70 = class191.field2597[var69.field5611];
                                if (var65 < var70.method771()) {
                                    var65 = var70.method771();
                                }
                                var70.method836(class168.field2324[0] + arg0 - 12, -var70.method771() + var35);
                            }
                        }
                        if (var65 > 0) {
                            var10000 = var35 - (var65 + 2);
                        }
                    }
                    for (int var71 = 0; var71 < 4; var71++) {
                        if (var33.field1176[var71] > class70.field968) {
                            int var72 = var33.method540(-74) / 2;
                            class424.method2505(var72, true, var33, arg5, arg1 >> 1, arg2, arg4 >> 1);
                            if (class168.field2324[0] > -1) {
                                if (var71 == 1) {
                                    class168.field2324[1] -= 20;
                                }
                                if (var71 == 2) {
                                    class168.field2324[1] -= 10;
                                    class168.field2324[0] -= 15;
                                }
                                if (var71 == 3) {
                                    class168.field2324[0] += 15;
                                    class168.field2324[1] -= 10;
                                }
                                class444.field6040[var33.field1121[var71]].method836(class168.field2324[0] + arg0 - 12, arg6 - -class168.field2324[1] + -12);
                                class490.field6832.method2127(Integer.toString(var33.field1141[var71]), 0, true, class168.field2324[1] + arg6 + 3, -1, arg0 - -class168.field2324[0] + -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class132.field1938; var10++) {
            int var28 = class7.field93[var10];
            class86 var29;
            if (var28 >= 2048) {
                var29 = class221.field2941[var28 - 2048];
            } else {
                var29 = class413.field5644[var28];
            }
            int var30 = class130.field1919[var10];
            class86 var31;
            if (var30 < 2048) {
                var31 = class413.field5644[var30];
            } else {
                var31 = class221.field2941[var30 - 2048];
            }
            class39.method279(var31, arg6, arg0, var29, (byte) -50, arg5, arg1, arg4, --var29.field1171, arg2);
        }
        int var11 = class392.field5448.field4782 + class392.field5448.field4772 + arg3;
        for (int var12 = 0; var12 < client.field2460; var12++) {
            int var13 = class405.field5546[var12];
            int var14 = class405.field5564[var12];
            int var15 = class405.field5550[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (var14 + 2 > class405.field5564[var27] + -var11 && var14 - var11 < class405.field5564[var27] + 2 && class405.field5550[var27] + class405.field5546[var27] > -var15 + var13 && var13 + var15 > class405.field5546[var27] + -class405.field5550[var27] && class405.field5564[var27] - var11 < var14) {
                        var14 = class405.field5564[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class405.field5564[var12] = var14;
            String var17 = class405.field5556[var12];
            if (class484.field6698 == 0) {
                int var18 = 16776960;
                if (class405.field5551[var12] < 6) {
                    var18 = class471.field6496[class405.field5551[var12]];
                }
                if (class405.field5551[var12] == 6) {
                    var18 = (class67.field911 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class405.field5551[var12] == 7) {
                    var18 = class67.field911 % 20 >= 10 ? 65535 : 255;
                }
                if (class405.field5551[var12] == 8) {
                    var18 = (class67.field911 % 20) < 10 ? 45056 : 8454016;
                }
                if (class405.field5551[var12] == 9) {
                    int var19 = 150 - class405.field5557[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - ((var19 - 50) * 327680);
                    } else if (var19 < 150) {
                        var18 = ((var19 - 100) * 5) + 65280;
                    }
                }
                if (class405.field5551[var12] == 10) {
                    int var20 = 150 - class405.field5557[var12];
                    if (var20 < 50) {
                        var18 = (var20 * 5) + 16711680;
                    } else if (var20 < 100) {
                        var18 = 33095935 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var18 = (var20 * 327680) + 255 - (var20 + -100) * 5 - 32768000;
                    }
                }
                if (class405.field5551[var12] == 11) {
                    int var21 = 150 - class405.field5557[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = var21 * 327685 + 65280 - 16384250;
                    } else if (var21 < 150) {
                        var18 = 32768000 + 16777215 - var21 * 327680;
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class405.field5553[var12] == 0) {
                    class93.field1366.method2127(var17, -16777216, true, arg6 + var14, var22, arg0 + var13);
                }
                if (class405.field5553[var12] == 1) {
                    class93.field1366.method2131(var22, class67.field911, var17, arg6 + var14, -16777216, arg3 - 8388610, arg0 + var13);
                }
                if (class405.field5553[var12] == 2) {
                    class93.field1366.method2117(var22, -16777216, var17, arg3, arg6 + var14, arg0 + var13, class67.field911);
                }
                if (class405.field5553[var12] == 3) {
                    class93.field1366.method2122(class67.field911, (byte) -127, -16777216, arg0 + var13, -class405.field5557[var12] + 150, var17, var22, arg6 + var14);
                }
                if (class405.field5553[var12] == 4) {
                    int var23 = (150 - class405.field5557[var12]) * (class392.field5448.method2145(var17, 13938) + 100) / 150;
                    class98.field1432.method1969(arg0 + var13 - 50, arg6, arg0 + var13 + 50, arg6 - -arg4);
                    class93.field1366.method2124(arg0 + var13 + 50 - var23, -16777216, arg6 + var14, var22, (byte) -105, var17);
                    class98.field1432.method1981(arg0, arg6, arg0 + arg1, arg6 - -arg4);
                }
                if (class405.field5553[var12] == 5) {
                    int var24 = 150 - class405.field5557[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class392.field5448.field4782 + class392.field5448.field4772;
                    class98.field1432.method1969(arg0, arg6 + var14 - var26 - 1, arg0 - -arg1, arg6 + var14 + 5);
                    class93.field1366.method2127(var17, -16777216, true, arg6 + var25 + var14, var22, arg0 + var13);
                    class98.field1432.method1981(arg0, arg6, arg0 + arg1, arg4 + arg6);
                }
            } else {
                class93.field1366.method2127(var17, -16777216, true, arg6 + var14, -256, arg0 + var13);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
    public final int[] method130(int arg0, int arg1) {
        field283++;
        int var3 = -87 % ((-arg1 - 47) / 47);
        if (this.field280 == this.field273) {
            this.field286 = this.field275[arg0] == null;
            this.field275[arg0] = class338.field4549;
            return this.field274[arg0];
        } else if (this.field280 == 1) {
            this.field286 = this.field282 != arg0;
            this.field282 = arg0;
            return this.field274[0];
        } else {
            class154 var4 = this.field275[arg0];
            if (var4 == null) {
                this.field286 = true;
                if (this.field276 >= this.field280) {
                    class154 var5 = (class154) this.field278.method649(18947);
                    var4 = new class154(arg0, var5.field2158);
                    this.field275[var5.field2157] = null;
                    var5.method2614((byte) -92);
                } else {
                    var4 = new class154(arg0, this.field276);
                    this.field276++;
                }
                this.field275[arg0] = var4;
            } else {
                this.field286 = false;
            }
            this.field278.method646(109, var4);
            return this.field274[var4.field2158];
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)Lmr;")
    public static final class86 method131(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= -80) {
            field284 = 122;
        }
        field272++;
        class491 var4 = class289.field3897[arg0][arg1][arg3];
        if (var4 == null) {
            return null;
        }
        class86 var5 = null;
        int var6 = -1;
        for (class309 var7 = var4.field6845; var7 != null; var7 = var7.field4084) {
            class471 var8 = var7.field4091;
            if (var8 instanceof class86) {
                class86 var9 = (class86) var8;
                int var10 = (var9.method545(false) - 1) * 64 + 60;
                int var11 = var9.field6501 - var10 >> 7;
                int var12 = var9.field6507 - var10 >> 7;
                int var13 = var9.field6501 + var10 >> 7;
                int var14 = var9.field6507 + var10 >> 7;
                if (arg1 >= var11 && var12 <= arg3 && arg1 <= var13 && var14 >= arg3) {
                    int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg3);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)[[I")
    public final int[][] method132(int arg0) {
        field277++;
        if (this.field280 != this.field273) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field280; var2++) {
            this.field275[var2] = class338.field4549;
        }
        return this.field274;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)I")
    public static int method133(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
    public class21(int arg0, int arg1, int arg2) {
        this.field280 = arg0;
        this.field273 = arg1;
        this.field274 = new int[this.field280][arg2];
        this.field275 = new class154[this.field273];
    }

    static {
        new class206("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }
}
