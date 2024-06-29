import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class31 extends class130 {

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Lsd;")
    public static class166 field575 = class135.method935("Bitte geben Sie Ihren Benutzenamen ein)3", 0);

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field576 = 0;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field573 = 0;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field578 = 0;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Lsd;")
    private static class166 field572 = class135.method935("Cancel", 0);

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lsd;")
    public static class166 field570 = class135.method935("Verbindung konnte nicht hergestellt werden)3", 0);

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Lsd;")
    public static class166 field569 = field572;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "B")
    public byte field583;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Lsd;")
    public class166 field582;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "[S")
    public static short[] field568;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public static void method231(int arg0) {
        field570 = null;
        field569 = null;
        int var1 = 18 / ((arg0 + 18) / 46);
        field568 = null;
        field572 = null;
        field575 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIIII)V")
    public static final void method232(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field580++;
        if (class4.field73 == 0 && !class179.field3393) {
            class72.method571(0, arg3 - arg2, class47.field865, class196.field3891, 39, arg1 - arg4, false);
            class154.field2965++;
        }
        int var5 = -1;
        int var6 = 0;
        if (!arg0) {
            return;
        }
        while (var6 < class126.field2481) {
            int var7 = class126.field2492[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                label294: {
                    var5 = var7;
                    if (var10 == 2 && class131.field2556.method576(class165.field3130, var8, var9, var7) >= 0) {
                        class145 var12 = class170.method1185((byte) 110, var11);
                        if (var12.field2813 != null) {
                            var12 = var12.method993(-11016);
                        }
                        if (var12 == null) {
                            break label294;
                        }
                        if (class4.field73 == 1) {
                            class72.method571(var7, var8, class72.field1426, class22.method148(new class166[] { class135.field2651, class99.field1887, var12.field2834 }, 0), 25, var9, !arg0);
                            class90.field1769++;
                        } else if (!class179.field3393) {
                            class69.field1401++;
                            class166[] var13 = var12.field2871;
                            if (class138.field2684) {
                                var13 = class167.method1164(var13, 5);
                            }
                            if (var13 != null) {
                                for (int var14 = 4; var14 >= 0; var14--) {
                                    if (var13[var14] != null) {
                                        short var15 = 0;
                                        class47.field880++;
                                        if (var14 == 0) {
                                            var15 = 17;
                                        }
                                        if (var14 == 1) {
                                            var15 = 42;
                                        }
                                        if (var14 == 2) {
                                            var15 = 28;
                                        }
                                        if (var14 == 3) {
                                            var15 = 57;
                                        }
                                        if (var14 == 4) {
                                            var15 = 1005;
                                        }
                                        class72.method571(var7, var8, var13[var14], class22.method148(new class166[] { class41.field742, var12.field2834 }, 0), var15, var9, !arg0);
                                    }
                                }
                            }
                            class72.method571(var12.field2856 << 14, var8, class4.field79, class22.method148(new class166[] { class41.field742, var12.field2834 }, 0), 1001, var9, false);
                        } else if ((class49.field911 & 0x4) == 4) {
                            class72.method571(var7, var8, class102.field1988, class22.method148(new class166[] { class43.field759, class99.field1887, var12.field2834 }, 0), 49, var9, false);
                            class125.field2449++;
                        }
                    }
                    if (var10 == 1) {
                        class154 var16 = class124.field2434[var11];
                        if (var16.field2958.field1562 == 1 && (var16.field3526 & 0x7F) == 64 && (var16.field3513 & 0x7F) == 64) {
                            for (int var17 = 0; var17 < class98.field1880; var17++) {
                                class154 var20 = class124.field2434[class58.field1186[var17]];
                                if (var20 != null && var16 != var20 && var20.field2958.field1562 == 1 && var16.field3526 == var20.field3526 && var16.field3513 == var20.field3513) {
                                    class114.method832(var8, (byte) 82, var20.field2958, class58.field1186[var17], var9);
                                }
                            }
                            for (int var18 = 0; var18 < class6.field131; var18++) {
                                class123 var19 = class182.field3451[class53.field967[var18]];
                                if (var19 != null && var16.field3526 == var19.field3526 && var16.field3513 == var19.field3513) {
                                    class27.method200(var19, (byte) 126, var8, var9, class53.field967[var18]);
                                }
                            }
                        }
                        class114.method832(var8, (byte) 52, var16.field2958, var11, var9);
                    }
                    if (var10 == 0) {
                        class123 var21 = class182.field3451[var11];
                        if ((var21.field3526 & 0x7F) == 64 && (var21.field3513 & 0x7F) == 64) {
                            for (int var22 = 0; var22 < class98.field1880; var22++) {
                                class154 var25 = class124.field2434[class58.field1186[var22]];
                                if (var25 != null && var25.field2958.field1562 == 1 && var21.field3526 == var25.field3526 && var21.field3513 == var25.field3513) {
                                    class114.method832(var8, (byte) -124, var25.field2958, class58.field1186[var22], var9);
                                }
                            }
                            for (int var23 = 0; var23 < class6.field131; var23++) {
                                class123 var24 = class182.field3451[class53.field967[var23]];
                                if (var24 != null && var21 != var24 && var21.field3526 == var24.field3526 && var21.field3513 == var24.field3513) {
                                    class27.method200(var24, (byte) 126, var8, var9, class53.field967[var23]);
                                }
                            }
                        }
                        class27.method200(var21, (byte) 126, var8, var9, var11);
                    }
                    if (var10 == 3) {
                        class165 var26 = class111.field2144[class165.field3130][var8][var9];
                        if (var26 != null) {
                            for (class34 var27 = (class34) var26.method1111(-92); var27 != null; var27 = (class34) var26.method1106(!arg0)) {
                                class57 var28 = class3.method19(var27.field642, true);
                                if (class4.field73 == 1) {
                                    class139.field2714++;
                                    class72.method571(var27.field642, var8, class72.field1426, class22.method148(new class166[] { class135.field2651, class159.field3035, var28.field1122 }, 0), 19, var9, false);
                                } else if (!class179.field3393) {
                                    class30.field559++;
                                    class166[] var29 = var28.field1123;
                                    if (class138.field2684) {
                                        var29 = class167.method1164(var29, 5);
                                    }
                                    for (int var30 = 4; var30 >= 0; var30--) {
                                        if (var29 != null && var29[var30] != null) {
                                            class30.field567++;
                                            byte var31 = 0;
                                            if (var30 == 0) {
                                                var31 = 37;
                                            }
                                            if (var30 == 1) {
                                                var31 = 20;
                                            }
                                            if (var30 == 2) {
                                                var31 = 8;
                                            }
                                            if (var30 == 3) {
                                                var31 = 5;
                                            }
                                            if (var30 == 4) {
                                                var31 = 12;
                                            }
                                            class72.method571(var27.field642, var8, var29[var30], class22.method148(new class166[] { class35.field662, var28.field1122 }, 0), var31, var9, false);
                                        } else if (var30 == 2) {
                                            class194.field3855++;
                                            class72.method571(var27.field642, var8, class180.field3404, class22.method148(new class166[] { class35.field662, var28.field1122 }, 0), 8, var9, false);
                                        }
                                    }
                                    class72.method571(var27.field642, var8, class4.field79, class22.method148(new class166[] { class35.field662, var28.field1122 }, 0), 1006, var9, false);
                                } else if ((class49.field911 & 0x1) == 1) {
                                    class54.field1019++;
                                    class72.method571(var27.field642, var8, class102.field1988, class22.method148(new class166[] { class43.field759, class159.field3035, var28.field1122 }, 0), 58, var9, !arg0);
                                }
                            }
                        }
                    }
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
    public static final void method233(int arg0, int arg1) {
        class85.field1697 += arg1 * 128;
        short var2 = 256;
        field579++;
        if (class85.field1697 > class41.field743.length) {
            class85.field1697 -= class41.field743.length;
            int var3 = (int) (Math.random() * 12.0D);
            class132.method927(class53.field984[var3], (byte) -117);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class19.field341[var4 + var5] - class41.field743[class85.field1697 + var4 & class41.field743.length + -1] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class19.field341[var4++] = var27;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class19.field341[var24 + var25] = 255;
                } else {
                    class19.field341[var24 + var25] = 0;
                }
            }
        }
        if (class153.field2947 > 0) {
            class153.field2947 -= arg1 * 4;
        }
        if (class86.field1717 > 0) {
            class86.field1717 -= arg1 * 4;
        }
        if (class86.field1717 == 0 && class153.field2947 == 0) {
            int var9 = (int) (Math.random() * (double) (2000 / arg1));
            if (var9 == 0) {
                class86.field1717 = 1024;
            }
            if (var9 == 1) {
                class153.field2947 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg1; var10++) {
            class195.field3861[var10] = class195.field3861[var10 + arg1];
        }
        for (int var11 = var2 - arg1; var11 < var2; var11++) {
            class195.field3861[var11] = (int) (Math.sin((double) class177.field3348 / 14.0D) * 16.0D + Math.sin((double) class177.field3348 / 15.0D) * 14.0D + Math.sin((double) class177.field3348 / 16.0D) * 12.0D);
            class177.field3348++;
        }
        int var12 = ((class49.field910 & 0x1) + arg1) / 2;
        class62.field1281 += arg1;
        if (var12 <= arg0) {
            return;
        }
        for (int var13 = 0; var13 < class62.field1281 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class19.field341[(var23 << 7) + var22] = 192;
        }
        class62.field1281 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = var14 * 128;
            int var20 = 0;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var20 += class19.field341[var12 + var21 + var19];
                }
                if (var21 - var12 - 1 >= 0) {
                    var20 -= class19.field341[var21 + var19 - var12 - 1];
                }
                if (var21 >= 0) {
                    class2.field23[var19 + var21] = var20 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var12 + var17 < var2) {
                    var16 += class2.field23[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class2.field23[var15 + var18 - (var12 + 1) * 128];
                }
                if (var17 >= 0) {
                    class19.field341[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
    public static final void method234(int arg0, boolean arg1) {
        field577++;
        if (arg0 != -1832) {
            return;
        }
        class53.field970 = arg1;
        if (!class53.field970) {
            int var2 = class179.field3377.method398((byte) 27);
            int var3 = class179.field3377.method427((byte) -113);
            int var4 = class179.field3377.method393((byte) 25);
            int var5 = (class19.field335 - class179.field3377.field1000) / 16;
            class100.field1911 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class100.field1911[var6][var14] = class179.field3377.method395(-2);
                }
            }
            int var7 = class179.field3377.method405(2);
            int var8 = class179.field3377.method423((byte) -90);
            class92.field1796 = new int[var5];
            boolean var9 = false;
            class135.field2616 = new int[var5];
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            class196.field3876 = new byte[var5][];
            class193.field3784 = new byte[var5][];
            if (var2 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            class170.field3278 = new int[var5];
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class92.field1796[var10] = var13;
                        class170.field3278[var10] = class138.field2693.method363(class22.method148(new class166[] { class34.field645, class174.method1192(false, var11), class47.field878, class174.method1192(false, var12) }, 0), 0);
                        class135.field2616[var10] = class138.field2693.method363(class22.method148(new class166[] { class99.field1895, class174.method1192(false, var11), class47.field878, class174.method1192(false, var12) }, 0), arg0 + 1832);
                        var10++;
                    }
                }
            }
            class59.method504(var7, (byte) -39, var4, var3, var2, var8);
            return;
        }
        int var15 = class179.field3377.method427((byte) -115);
        int var16 = class179.field3377.method427((byte) -110);
        int var17 = class179.field3377.method423((byte) -90);
        int var18 = class179.field3377.method398((byte) 26);
        class179.field3377.method703((byte) 67);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class179.field3377.method708(8, 1);
                    if (var37 == 1) {
                        class179.field3394[var19][var35][var36] = class179.field3377.method708(8, 26);
                    } else {
                        class179.field3394[var19][var35][var36] = -1;
                    }
                }
            }
        }
        class179.field3377.method711((byte) 103);
        int var20 = (class19.field335 - class179.field3377.field1000) / 16;
        class100.field1911 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class100.field1911[var21][var34] = class179.field3377.method419(-4);
            }
        }
        int var22 = class179.field3377.method424((byte) -66);
        class92.field1796 = new int[var20];
        class170.field3278 = new int[var20];
        class196.field3876 = new byte[var20][];
        class135.field2616 = new int[var20];
        class193.field3784 = new byte[var20][];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class179.field3394[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 14 & 0x3FF;
                        int var29 = var27 >> 3 & 0x7FF;
                        int var30 = (var28 / 8 << 8) + var29 / 8;
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class92.field1796[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            class92.field1796[var23] = var30;
                            int var32 = var30 & 0xFF;
                            int var33 = var30 >> 8 & 0xFF;
                            class170.field3278[var23] = class138.field2693.method363(class22.method148(new class166[] { class34.field645, class174.method1192(false, var33), class47.field878, class174.method1192(false, var32) }, 0), 0);
                            class135.field2616[var23] = class138.field2693.method363(class22.method148(new class166[] { class99.field1895, class174.method1192(false, var33), class47.field878, class174.method1192(false, var32) }, 0), 0);
                            var23++;
                        }
                    }
                }
            }
        }
        class59.method504(var18, (byte) -39, var22, var15, var17, var16);
    }
}
