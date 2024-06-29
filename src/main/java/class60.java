import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 extends class16 {

    @OriginalMember(owner = "client!id", name = "T", descriptor = "Z")
    public boolean field1207 = false;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "Lje;")
    public static class67 field1195 = class85.method592(255, "::gc");

    @OriginalMember(owner = "client!id", name = "K", descriptor = "Lje;")
    public static class67 field1199 = class85.method592(255, "<col=ffb000>");

    @OriginalMember(owner = "client!id", name = "L", descriptor = "Lje;")
    private static class67 field1200 = class85.method592(255, "shake:");

    @OriginalMember(owner = "client!id", name = "D", descriptor = "Lje;")
    public static class67 field1193 = field1200;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "Lje;")
    public static class67 field1197 = field1200;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field1196 = 0;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "Lje;")
    private static class67 field1206 = class85.method592(255, "Loaded update list");

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Lje;")
    public static class67 field1191 = field1206;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "Lcd;")
    public static class19 field1203 = new class19();

    @OriginalMember(owner = "client!id", name = "V", descriptor = "Lac;")
    public static class4 field1209 = new class4();

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I")
    public static final int method415(int arg0, byte arg1) {
        if (arg1 < 14) {
            return 38;
        }
        field1205++;
        class64 var2 = class80.method573(arg0, -15618);
        int var3 = var2.field1261;
        int var4 = var2.field1264;
        int var5 = var2.field1256;
        int var6 = class2.field5[var5 - var4];
        return var6 & class42.field804[var3] >> var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILkc;II)V")
    public static final void method416(int arg0, class72 arg1, int arg2, int arg3) {
        field1202++;
        if (arg1.field1512 == 1) {
            class84.field1863++;
            class56.method396(arg1.field1508, 0, class52.field1030, 0, 46, (byte) -94, arg1.field1456);
        }
        if (arg1.field1512 == 2 && !class38.field691) {
            class67 var4 = class34.method217(arg1, -4);
            if (var4 != null) {
                class144.field3324++;
                class56.method396(arg1.field1508, -1, class49.method314(new class67[] { class103.field2319, arg1.field1505 }, 0), 0, 36, (byte) -121, var4);
            }
        }
        if (arg1.field1512 == 3) {
            class134.field3043++;
            class56.method396(arg1.field1508, 0, class52.field1030, 0, 13, (byte) -89, class16.field279);
        }
        if (arg1.field1512 == 4) {
            class114.field2582++;
            class56.method396(arg1.field1508, 0, class52.field1030, 0, 38, (byte) -126, arg1.field1456);
        }
        if (arg1.field1512 == 5) {
            class56.method396(arg1.field1508, 0, class52.field1030, 0, 5, (byte) -65, arg1.field1456);
            class112.field2553++;
        }
        int var5 = 92 / ((16 - arg2) / 50);
        if (arg1.field1512 == 6 && class68.field1384 == null) {
            class56.method396(arg1.field1508, -1, class52.field1030, 0, 11, (byte) -96, arg1.field1456);
            class38.field690++;
        }
        if (arg1.field1546 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.field1523; var7++) {
                for (int var8 = 0; var8 < arg1.field1576; var8++) {
                    int var9 = (arg1.field1579 + 32) * var7;
                    int var10 = (arg1.field1478 + 32) * var8;
                    if (var6 < 20) {
                        var10 += arg1.field1474[var6];
                        var9 += arg1.field1562[var6];
                    }
                    if (arg3 >= var10 && arg0 >= var9 && arg3 < var10 + 32 && var9 + 32 > arg0) {
                        class122.field2734 = arg1;
                        class122.field2727 = var6;
                        if (arg1.field1581[var6] > 0) {
                            class103 var11 = class123.method961(arg1.field1581[var6] - 1, 1658);
                            if (class134.field3027 == 1 && class79.method562(class140.method1063(arg1, (byte) -86), 116)) {
                                if (class89.field1975 != arg1.field1508 || class135.field3053 != var6) {
                                    class31.field548++;
                                    class56.method396(arg1.field1508, var6, class49.method314(new class67[] { class3.field41, class101.field2270, var11.field2302 }, 0), var11.field2317, 16, (byte) -88, class86.field1901);
                                }
                            } else if (!class38.field691 || !class79.method562(class140.method1063(arg1, (byte) -92), -121)) {
                                class126.field2759++;
                                class67[] var12 = var11.field2303;
                                if (class16.field298) {
                                    var12 = client.method151(true, var12);
                                }
                                if (class79.method562(class140.method1063(arg1, (byte) -67), -86)) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != null && var12[var13] != null) {
                                            byte var14;
                                            if (var13 == 3) {
                                                var14 = 41;
                                            } else {
                                                var14 = 18;
                                            }
                                            class23.field423++;
                                            class56.method396(arg1.field1508, var6, class49.method314(new class67[] { class135.field3051, var11.field2302 }, 0), var11.field2317, var14, (byte) -63, var12[var13]);
                                        } else if (var13 == 4) {
                                            class56.method396(arg1.field1508, var6, class49.method314(new class67[] { class135.field3051, var11.field2302 }, 0), var11.field2317, 18, (byte) -124, class98.field2184);
                                            class128.field2813++;
                                        }
                                    }
                                }
                                if (class71.method516(class140.method1063(arg1, (byte) -86), (byte) 41)) {
                                    class56.method396(arg1.field1508, var6, class49.method314(new class67[] { class135.field3051, var11.field2302 }, 0), var11.field2317, 37, (byte) -115, class86.field1901);
                                    class101.field2283++;
                                }
                                if (class79.method562(class140.method1063(arg1, (byte) -109), -87) && var12 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var12[var15] != null) {
                                            class131.field2873++;
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 28;
                                            }
                                            if (var15 == 1) {
                                                var16 = 14;
                                            }
                                            if (var15 == 2) {
                                                var16 = 34;
                                            }
                                            class56.method396(arg1.field1508, var6, class49.method314(new class67[] { class135.field3051, var11.field2302 }, 0), var11.field2317, var16, (byte) -102, var12[var15]);
                                        }
                                    }
                                }
                                class67[] var17 = arg1.field1533;
                                if (class16.field298) {
                                    var17 = client.method151(true, var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            class42.field803++;
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 32;
                                            }
                                            if (var18 == 1) {
                                                var19 = 6;
                                            }
                                            if (var18 == 2) {
                                                var19 = 9;
                                            }
                                            if (var18 == 3) {
                                                var19 = 51;
                                            }
                                            if (var18 == 4) {
                                                var19 = 21;
                                            }
                                            class56.method396(arg1.field1508, var6, class49.method314(new class67[] { class135.field3051, var11.field2302 }, 0), var11.field2317, var19, (byte) -103, var17[var18]);
                                        }
                                    }
                                }
                                class56.method396(arg1.field1508, var6, class49.method314(new class67[] { class135.field3051, var11.field2302 }, 0), var11.field2317, 1003, (byte) -121, class134.field3010);
                            } else if ((class116.field2622 & 0x10) == 16) {
                                class29.field522++;
                                class56.method396(arg1.field1508, var6, class49.method314(new class67[] { class142.field3255, class101.field2270, var11.field2302 }, 0), var11.field2317, 33, (byte) -101, class41.field777);
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg1.field1485) {
            return;
        }
        if (class38.field691) {
            if (class15.method107(class140.method1063(arg1, (byte) -92), (byte) 69) && (class116.field2622 & 0x20) == 32) {
                class56.method396(arg1.field1508, arg1.field1540, class49.method314(new class67[] { class142.field3255, class140.field3157, arg1.field1534 }, 0), 0, 43, (byte) -73, class41.field777);
                class35.field659++;
                return;
            }
            return;
        }
        for (int var20 = 9; var20 >= 5; var20--) {
            class67 var24 = class145.method1122(-1, arg1, var20);
            if (var24 != null) {
                class12.field227++;
                class56.method396(arg1.field1508, arg1.field1540, arg1.field1534, var20 + 1, 1004, (byte) -98, var24);
            }
        }
        class67 var21 = class34.method217(arg1, -4);
        if (var21 != null) {
            class144.field3324++;
            class56.method396(arg1.field1508, arg1.field1540, arg1.field1534, 0, 36, (byte) -66, var21);
        }
        for (int var22 = 4; var22 >= 0; var22--) {
            class67 var23 = class145.method1122(-1, arg1, var22);
            if (var23 != null) {
                class12.field227++;
                class56.method396(arg1.field1508, arg1.field1540, arg1.field1534, var22 + 1, 10, (byte) -69, var23);
            }
        }
        if (class144.method1109(class140.method1063(arg1, (byte) -108), (byte) -19)) {
            class38.field690++;
            class56.method396(arg1.field1508, arg1.field1540, class52.field1030, 0, 11, (byte) -98, class47.field879);
            return;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILkc;)Z")
    public static final boolean method417(int arg0, class72 arg1) {
        field1194++;
        if (class81.field1794) {
            if (class140.method1063(arg1, (byte) -117) != 0) {
                return false;
            }
            if (arg1.field1546 == 0) {
                return false;
            }
        }
        return arg0 == 0 ? arg1.field1557 : false;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/Object;ILq;)V")
    public static final void method418(Object arg0, int arg1, class111 arg2) {
        field1192++;
        if (arg2.field2509 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2509.peekEvent() != null; var3++) {
            class104.method822(-112, 1L);
        }
        if (arg0 != null) {
            arg2.field2509.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
        if (arg1 != 9) {
            field1209 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public static void method419(int arg0) {
        field1209 = null;
        field1197 = null;
        field1191 = null;
        if (arg0 != 0) {
            field1206 = null;
        }
        field1200 = null;
        field1195 = null;
        field1199 = null;
        field1203 = null;
        field1206 = null;
        field1193 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lje;")
    public static final class67 method420(int arg0, int arg1) {
        if (arg1 != 28498) {
            field1209 = null;
        }
        field1208++;
        return class37.method234(10, 135, arg0, false);
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public static final void method421(int arg0) {
        if (arg0 != 38) {
            method417(-117, null);
        }
        field1190++;
        if (class14.field251 > 0) {
            class123.method962(126);
        } else {
            class27.method181(40, arg0 - 143);
            class154.field3515 = class104.field2367;
            class104.field2367 = null;
        }
    }
}
