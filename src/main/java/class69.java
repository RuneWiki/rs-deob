import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class69 {

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lo;")
    public class132 field1318 = new class132();

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1321 = -1;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "[Loe;")
    public static class137[] field1327 = new class137[1000];

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Lo;")
    private class132 field1330;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILrh;I)V")
    public static final void method401(int arg0, int arg1, class167 arg2, int arg3) {
        field1328++;
        if (arg2.field3099 == 1) {
            class198.method1277(arg2.field3014, -117, class170.field3242, arg2.field3069, (short) 10, 0, 0L);
            class182.field3490++;
        }
        if (arg2.field3099 == 2 && !class209.field4013) {
            class184 var4 = class7.method40(arg2, -18531);
            if (var4 != null) {
                class198.method1277(var4, -91, class144.method884(0, new class184[] { class58.field1074, arg2.field3036 }), arg2.field3069, (short) 7, -1, 0L);
                class94.field1718++;
            }
        }
        if (arg0 != 441) {
            field1327 = null;
        }
        if (arg2.field3099 == 3) {
            class198.method1277(class191.field3730, -35, class170.field3242, arg2.field3069, (short) 6, 0, 0L);
            class99.field1856++;
        }
        if (arg2.field3099 == 4) {
            class198.method1277(arg2.field3014, arg0 - 518, class170.field3242, arg2.field3069, (short) 4, 0, 0L);
            class40.field752++;
        }
        if (arg2.field3099 == 5) {
            class198.method1277(arg2.field3014, -49, class170.field3242, arg2.field3069, (short) 33, 0, 0L);
            class83.field1478++;
        }
        if (arg2.field3099 == 6 && class50.field925 == null) {
            class198.method1277(arg2.field3014, -36, class170.field3242, arg2.field3069, (short) 13, -1, 0L);
            class85.field1575++;
        }
        if (arg2.field3061 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field3089; var6++) {
                for (int var7 = 0; var7 < arg2.field3045; var7++) {
                    int var8 = (arg2.field3020 + 32) * var7;
                    int var9 = (arg2.field3115 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field3085[var5];
                        var9 += arg2.field3012[var5];
                    }
                    if (var8 <= arg3 && var9 <= arg1 && arg3 < var8 + 32 && arg1 < var9 + 32) {
                        class200.field3878 = var5;
                        class44.field845 = arg2;
                        if (arg2.field3130[var5] > 0) {
                            class122 var10 = class60.method336(arg2.field3130[var5] - 1, 10);
                            if (class187.field3610 == 1 && class9.method50(false, class188.method1191((byte) -104, arg2))) {
                                if (class7.field133 != arg2.field3069 || class12.field219 != var5) {
                                    class10.field184++;
                                    class198.method1277(class7.field127, -104, class144.method884(0, new class184[] { class150.field2689, class200.field3881, var10.field2233 }), arg2.field3069, (short) 18, var5, (long) var10.field2203);
                                }
                            } else if (!class209.field4013 || !class9.method50(false, class188.method1191((byte) -53, arg2))) {
                                class151.field2720++;
                                class184[] var11 = var10.field2232;
                                if (class100.field1861) {
                                    var11 = class111.method684(var11, (byte) 67);
                                }
                                if (class9.method50(false, class188.method1191((byte) -42, arg2))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class32.field553++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 2;
                                            } else {
                                                var13 = 57;
                                            }
                                            class198.method1277(var11[var12], -60, class144.method884(0, new class184[] { class26.field476, var10.field2233 }), arg2.field3069, var13, var5, (long) var10.field2203);
                                        } else if (var12 == 4) {
                                            class198.method1277(class184.field3533, arg0 ^ 0xFFFFFE2C, class144.method884(arg0 - 441, new class184[] { class26.field476, var10.field2233 }), arg2.field3069, (short) 57, var5, (long) var10.field2203);
                                            class131.field2376++;
                                        }
                                    }
                                }
                                if (class94.method541(-1, class188.method1191((byte) -106, arg2))) {
                                    class198.method1277(class7.field127, -59, class144.method884(0, new class184[] { class26.field476, var10.field2233 }), arg2.field3069, (short) 47, var5, (long) var10.field2203);
                                    class5.field85++;
                                }
                                if (class9.method50(false, class188.method1191((byte) -75, arg2)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 58;
                                            }
                                            class49.field908++;
                                            if (var14 == 1) {
                                                var15 = 12;
                                            }
                                            if (var14 == 2) {
                                                var15 = 44;
                                            }
                                            class198.method1277(var11[var14], -37, class144.method884(0, new class184[] { class26.field476, var10.field2233 }), arg2.field3069, var15, var5, (long) var10.field2203);
                                        }
                                    }
                                }
                                class184[] var16 = arg2.field3044;
                                if (class100.field1861) {
                                    var16 = class111.method684(var16, (byte) 67);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class161.field2899++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 46;
                                            }
                                            if (var17 == 1) {
                                                var18 = 3;
                                            }
                                            if (var17 == 2) {
                                                var18 = 21;
                                            }
                                            if (var17 == 3) {
                                                var18 = 51;
                                            }
                                            if (var17 == 4) {
                                                var18 = 45;
                                            }
                                            class198.method1277(var16[var17], -87, class144.method884(0, new class184[] { class26.field476, var10.field2233 }), arg2.field3069, var18, var5, (long) var10.field2203);
                                        }
                                    }
                                }
                                class198.method1277(class11.field198, arg0 - 560, class144.method884(0, new class184[] { class26.field476, var10.field2233 }), arg2.field3069, (short) 1006, var5, (long) var10.field2203);
                            } else if ((class106.field1920 & 0x10) == 16) {
                                class198.method1277(class14.field270, arg0 ^ 0xFFFFFE4A, class144.method884(0, new class184[] { class84.field1553, class200.field3881, var10.field2233 }), arg2.field3069, (short) 22, var5, (long) var10.field2203);
                                class21.field402++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field3106) {
            return;
        }
        if (!class209.field4013) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class184 var23 = class16.method99(true, arg2, var19);
                if (var23 != null) {
                    class79.field1425++;
                    class198.method1277(var23, -84, arg2.field3119, arg2.field3069, (short) 1003, arg2.field2989, (long) (var19 + 1));
                }
            }
            class184 var20 = class7.method40(arg2, -18531);
            if (var20 != null) {
                class198.method1277(var20, -96, arg2.field3119, arg2.field3069, (short) 7, arg2.field2989, 0L);
                class94.field1718++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class184 var22 = class16.method99(true, arg2, var21);
                if (var22 != null) {
                    class198.method1277(var22, -117, arg2.field3119, arg2.field3069, (short) 26, arg2.field2989, (long) (var21 + 1));
                    class79.field1425++;
                }
            }
            if (class5.method36((byte) -121, class188.method1191((byte) -49, arg2))) {
                class85.field1575++;
                class198.method1277(class134.field2440, arg0 ^ 0xFFFFFE55, class170.field3242, arg2.field3069, (short) 13, arg2.field2989, 0L);
                return;
            }
            return;
        }
        if (class161.method974(class188.method1191((byte) -101, arg2), 3) && (class106.field1920 & 0x20) == 32) {
            class198.method1277(class14.field270, -11, class144.method884(0, new class184[] { class84.field1553, class38.field723, arg2.field3119 }), arg2.field3069, (short) 24, arg2.field2989, 0L);
            class212.field4102++;
            return;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILo;)V")
    public final void method402(int arg0, class132 arg1) {
        if (arg1.field2398 != null) {
            arg1.method797((byte) -96);
        }
        field1319++;
        arg1.field2397 = this.field1318;
        if (arg0 != 16777215) {
            method413(-116);
        }
        arg1.field2398 = this.field1318.field2398;
        arg1.field2398.field2397 = arg1;
        arg1.field2397.field2398 = arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLo;)V")
    public final void method403(boolean arg0, class132 arg1) {
        field1316++;
        if (arg1.field2398 != null) {
            arg1.method797((byte) -112);
        }
        arg1.field2398 = this.field1318;
        arg1.field2397 = this.field1318.field2397;
        arg1.field2398.field2397 = arg1;
        arg1.field2397.field2398 = arg1;
        if (!arg0) {
            this.field1330 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)Lo;")
    public final class132 method404(boolean arg0) {
        class132 var2 = this.field1318.field2397;
        if (arg0) {
            return null;
        }
        field1324++;
        if (this.field1318 == var2) {
            this.field1330 = null;
            return null;
        } else {
            this.field1330 = var2.field2397;
            return var2;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLtg;I)V")
    public static final void method405(boolean arg0, class184 arg1, int arg2) {
        field1329++;
        int var3 = class182.field3517.method1369(arg1, 250);
        byte var4 = 4;
        if (arg2 != 32549) {
            field1321 = -30;
        }
        int var5 = class182.field3517.method1341(arg1, 250) * 13;
        int var6 = var4 + 6;
        int var7 = var4 + 6;
        class4.method27(var6 - var4, -var4 + var7, var3 + var4 + var4, var4 + var5 + var4, 0);
        class4.method18(var6 - var4, -var4 + var7, var3 + var4 + var4, var5 - (-var4 + -var4), 16777215);
        class182.field3517.method1355(arg1, var6, var7, var3, var5, 16777215, -1, 1, 1, 0);
        class74.method439(arg2 - 1455, var4 + var4 + var5, var7 - var4, var3 - -var4 + var4, var6 - var4);
        if (!arg0) {
            class25.method166(var3, var5, var6, var7, 21157);
            return;
        }
        try {
            Graphics var8 = class129.field2344.getGraphics();
            class168.field3139.method440(arg2 ^ 0x7F46, 0, var8, 0);
        } catch (Exception var9) {
            class129.field2344.repaint();
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lo;Lo;I)V")
    public final void method406(class132 arg0, class132 arg1, int arg2) {
        if (arg2 != 0) {
            field1323 = 56;
        }
        if (arg0.field2398 != null) {
            arg0.method797((byte) -101);
        }
        arg0.field2398 = arg1.field2398;
        field1315++;
        arg0.field2397 = arg1;
        arg0.field2398.field2397 = arg0;
        arg0.field2397.field2398 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public final void method407(int arg0) {
        field1331++;
        if (arg0 != 2) {
            field1327 = null;
        }
        while (true) {
            class132 var2 = this.field1318.field2397;
            if (this.field1318 == var2) {
                return;
            }
            var2.method797((byte) -125);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Lo;")
    public final class132 method408(int arg0) {
        if (arg0 != 2) {
            this.method411((byte) -5);
        }
        field1325++;
        class132 var2 = this.field1330;
        if (this.field1318 == var2) {
            this.field1330 = null;
            return null;
        } else {
            this.field1330 = var2.field2398;
            return var2;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static final void method409(byte arg0) {
        field1317++;
        class180.field3431 = 0;
        class87.field1610 = 0;
        class38.method226(-76);
        class169.method1050((byte) -10);
        class206.method1306(76);
        class125.method758(0);
        int var1 = 0;
        if (arg0 <= 75) {
            field1321 = -103;
        }
        while (var1 < class180.field3431) {
            int var3 = class49.field910[var1];
            if (class161.field2903 != class57.field1024[var3].field609) {
                class57.field1024[var3] = null;
            }
            var1++;
        }
        if (class111.field2014 != class21.field394.field1834) {
            throw new RuntimeException("gpp1 pos:" + class21.field394.field1834 + " psize:" + class111.field2014);
        }
        for (int var2 = 0; var2 < class26.field466; var2++) {
            if (class57.field1024[class200.field3880[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class26.field466);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILvb;B)Lsc;")
    public static final class171 method410(int arg0, int arg1, class197 arg2, byte arg3) {
        if (arg3 < 100) {
            method401(-17, -1, null, 84);
        }
        field1320++;
        return class94.method542(arg2, 59, arg1, arg0) ? class154.method935(-109) : null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)Lo;")
    public final class132 method411(byte arg0) {
        field1326++;
        if (arg0 != -48) {
            return null;
        }
        class132 var2 = this.field1318.field2397;
        if (this.field1318 == var2) {
            return null;
        } else {
            var2.method797((byte) -95);
            return var2;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)Lo;")
    public final class132 method412(boolean arg0) {
        if (!arg0) {
            this.method404(true);
        }
        field1322++;
        class132 var2 = this.field1318.field2398;
        if (this.field1318 == var2) {
            this.field1330 = null;
            return null;
        } else {
            this.field1330 = var2.field2398;
            return var2;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public static void method413(int arg0) {
        field1327 = null;
        if (arg0 > -64) {
            field1321 = -118;
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)Lo;")
    public final class132 method414(int arg0) {
        class132 var2 = this.field1330;
        field1332++;
        if (this.field1318 == var2) {
            this.field1330 = null;
            return null;
        }
        if (arg0 >= -118) {
            field1321 = 13;
        }
        this.field1330 = var2.field2397;
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class69() {
        this.field1318.field2398 = this.field1318;
        this.field1318.field2397 = this.field1318;
    }
}
