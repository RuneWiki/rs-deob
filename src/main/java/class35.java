import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 extends class26 {

    @OriginalMember(owner = "client!fd", name = "sb", descriptor = "[[B")
    public static byte[][] field699 = new byte[50][];

    @OriginalMember(owner = "client!fd", name = "rb", descriptor = "Llc;")
    public static class69 field698 = class69.method470((byte) -105, "Jul");

    @OriginalMember(owner = "client!fd", name = "qb", descriptor = "Llc;")
    public static class69 field697 = class69.method470((byte) -125, "@red@Offline");

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "Llc;")
    public static class69 field689 = class69.method470((byte) -112, " is already on your friend list");

    @OriginalMember(owner = "client!fd", name = "vb", descriptor = "Lfe;")
    public static class36 field702 = new class36(10);

    @OriginalMember(owner = "client!fd", name = "xb", descriptor = "Llc;")
    public static class69 field704 = class69.method470((byte) -127, "System update in: ");

    @OriginalMember(owner = "client!fd", name = "zb", descriptor = "Llc;")
    public static class69 field706 = class69.method470((byte) -108, "Enter amount:");

    @OriginalMember(owner = "client!fd", name = "yb", descriptor = "Llc;")
    public static class69 field705 = class69.method470((byte) -104, "Loaded title screen");

    @OriginalMember(owner = "client!fd", name = "Cb", descriptor = "Z")
    public static boolean field709 = false;

    @OriginalMember(owner = "client!fd", name = "Bb", descriptor = "I")
    public static int field708 = 0;

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!fd", name = "kb", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!fd", name = "lb", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!fd", name = "nb", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!fd", name = "ob", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!fd", name = "pb", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!fd", name = "tb", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!fd", name = "ub", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!fd", name = "wb", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!fd", name = "Ab", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!fd", name = "Db", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!fd", name = "mb", descriptor = "Lcc;")
    public static class16 field693;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(Z)V")
    public static void method213(boolean arg0) {
        field704 = null;
        field697 = null;
        field698 = null;
        field693 = null;
        field702 = null;
        field699 = null;
        field706 = null;
        field705 = null;
        if (arg0) {
            field689 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
    public static final void method214(int arg0, int arg1) {
        if (arg1 == -3) {
            class55.method347(class98.field2142, -114, class9.field184);
        } else if (arg1 == -2) {
            class55.method347(class49.field992, 44, class104.field2260);
        } else if (arg1 == -1) {
            class55.method347(class2.field16, arg0 ^ 0xFFFFFFB5, class9.field184);
        } else if (arg1 == 3) {
            class55.method347(class49.field992, 35, class2.field11);
        } else if (arg1 == 4) {
            class55.method347(class27.field578, -117, class3.field67);
        } else if (arg1 == 5) {
            class55.method347(class50.field1031, 39, class71.field1593);
        } else if (arg1 == 6) {
            class55.method347(class122.field2636, -112, class4.field77);
        } else if (arg1 == 7) {
            class55.method347(class108.field2372, -111, class120.field2567);
        } else if (arg1 == 8) {
            class55.method347(class16.field302, -117, class107.field2328);
        } else if (arg1 == 9) {
            class55.method347(class4.field78, 106, class42.field835);
        } else if (arg1 == 10) {
            class55.method347(class16.field302, 98, class47.field988);
        } else if (arg1 == 12) {
            class55.method347(class83.field1866, arg0 - 109, class89.field1943);
        } else if (arg1 == 13) {
            class55.method347(class4.field92, arg0 + 84, class9.field184);
        } else if (arg1 == 14) {
            class55.method347(class29.field610, 74, class80.field1825);
        } else if (arg1 == 16) {
            class55.method347(class30.field628, 52, class80.field1825);
        } else if (arg1 == 17) {
            class55.method347(class19.field430, -122, class108.field2371);
        } else if (arg1 == 18) {
            class55.method347(class57.field1206, 44, class114.field2464);
        } else if (arg1 == 20) {
            class55.method347(class39.field775, -128, class9.field184);
        } else if (arg1 == 22) {
            class55.method347(class89.field1945, -126, class36.field731);
        } else if (arg1 == 23) {
            class55.method347(class61.field1252, 71, class80.field1825);
        } else if (arg1 == 24) {
            class55.method347(class57.field1199, -126, class98.field2146);
        } else if (arg1 == 25) {
            class55.method347(class127.field2737, arg0 + 105, class9.field184);
        } else if (arg1 == 26) {
            class55.method347(class3.field23, -115, class104.field2255);
        } else {
            class55.method347(class46.method305(arg0 + 20028, new class69[] { class9.field192, class106.method791(arg1, (byte) -126) }), 107, class9.field184);
        }
        field692++;
        if (arg0 == -3) {
            class89.method626(10, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Graphics;B)V")
    public static final void method215(Graphics arg0, byte arg1) {
        if (arg1 <= 8) {
            method217((byte) 127);
        }
        field690++;
        class93.field2020.method69(arg0, 357, true, 17);
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
    public static final void method216(int arg0) {
        field688++;
        if (!class10.field198) {
            return;
        }
        class55.field1157 = null;
        class114.field2483 = null;
        class120.field2571 = null;
        class92.field2007 = null;
        int var1 = -81 % ((arg0 - 44) / 38);
        class78.field1766 = null;
        class82.field1848 = null;
        class110.field2417 = null;
        class51.field1101 = null;
        class4.field91 = null;
        class33.field655 = null;
        class90.field1964 = null;
        class127.field2736 = null;
        class119.field2555 = null;
        class25.field551 = null;
        class96.field2128 = null;
        client.field387 = null;
        class77.field1734 = null;
        class17.field335 = null;
        class11.field234 = null;
        class67.field1397 = null;
        class96.field2131 = null;
        class22.field461 = null;
        class93.method663(10, true);
        class68.field1481.method441((byte) -55, true);
        class10.field198 = false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static final void method217(byte arg0) {
        int var1 = -51 % ((-arg0 - 40) / 49);
        int var2 = -1;
        if (class76.field1696 == 0 && class60.field1248 == 0) {
            class23.method149(109, class74.field1666, class122.field2669, 16, 0, class101.field2193);
            class80.field1817++;
        }
        for (int var3 = 0; var3 < class44.field924; var3++) {
            int var4 = class44.field910[var3];
            int var5 = var4 & 0x7F;
            int var6 = var4 >> 7 & 0x7F;
            int var7 = var4 >> 14 & 0x7FFF;
            int var8 = var4 >> 29 & 0x3;
            if (var2 != var4) {
                var2 = var4;
                if (var8 == 2 && class120.field2562.method990(class71.field1588, var5, var6, var4) >= 0) {
                    class121 var9 = class110.method821(var7, 724);
                    if (var9.field2628 != null) {
                        var9 = var9.method891(0);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (class76.field1696 == 1) {
                        class23.method149(82, var6, class46.method305(20025, new class69[] { class13.field261, class50.field1083, class92.field2008, var9.field2623 }), 38, var4, var5);
                        class102.field2214++;
                    } else if (class60.field1248 != 1) {
                        class73.field1640++;
                        class69[] var10 = var9.field2605;
                        if (class79.field1798) {
                            var10 = class110.method822(var10, 5410);
                        }
                        if (var10 != null) {
                            for (int var11 = 4; var11 >= 0; var11--) {
                                if (var10[var11] != null) {
                                    class6.field109++;
                                    short var12 = 0;
                                    if (var11 == 0) {
                                        var12 = 43;
                                    }
                                    if (var11 == 1) {
                                        var12 = 53;
                                    }
                                    if (var11 == 2) {
                                        var12 = 42;
                                    }
                                    if (var11 == 3) {
                                        var12 = 20;
                                    }
                                    if (var11 == 4) {
                                        var12 = 1002;
                                    }
                                    class23.method149(95, var6, class46.method305(20025, new class69[] { var10[var11], class106.field2308, var9.field2623 }), var12, var4, var5);
                                }
                            }
                        }
                        class23.method149(77, var6, class46.method305(20025, new class69[] { class60.field1243, var9.field2623 }), 1006, var9.field2604 << 14, var5);
                    } else if ((class127.field2743 & 0x4) == 4) {
                        class23.method149(118, var6, class46.method305(20025, new class69[] { class101.field2186, class106.field2308, var9.field2623 }), 28, var4, var5);
                        class92.field2003++;
                    }
                }
                if (var8 == 1) {
                    class72 var13 = class112.field2434[var7];
                    if (var13.field1616.field1471 == 1 && (var13.field1058 & 0x7F) == 64 && (var13.field1065 & 0x7F) == 64) {
                        for (int var14 = 0; var14 < class62.field1284; var14++) {
                            class72 var17 = class112.field2434[class70.field1569[var14]];
                            if (var17 != null && var13 != var17 && var17.field1616.field1471 == 1 && var13.field1058 == var17.field1058 && var13.field1065 == var17.field1065) {
                                class62.method379(class70.field1569[var14], (byte) -83, var6, var5, var17.field1616);
                            }
                        }
                        for (int var15 = 0; var15 < class27.field585; var15++) {
                            class60 var16 = class123.field2682[class92.field2013[var15]];
                            if (var16 != null && var13.field1058 == var16.field1058 && var13.field1065 == var16.field1065) {
                                class27.method173(55, class92.field2013[var15], var16, var5, var6);
                            }
                        }
                    }
                    class62.method379(var7, (byte) 35, var6, var5, var13.field1616);
                }
                if (var8 == 0) {
                    class60 var18 = class123.field2682[var7];
                    if ((var18.field1058 & 0x7F) == 64 && (var18.field1065 & 0x7F) == 64) {
                        for (int var19 = 0; var19 < class62.field1284; var19++) {
                            class72 var22 = class112.field2434[class70.field1569[var19]];
                            if (var22 != null && var22.field1616.field1471 == 1 && var18.field1058 == var22.field1058 && var18.field1065 == var22.field1065) {
                                class62.method379(class70.field1569[var19], (byte) -80, var6, var5, var22.field1616);
                            }
                        }
                        for (int var20 = 0; var20 < class27.field585; var20++) {
                            class60 var21 = class123.field2682[class92.field2013[var20]];
                            if (var21 != null && var18 != var21 && var18.field1058 == var21.field1058 && var18.field1065 == var21.field1065) {
                                class27.method173(12, class92.field2013[var20], var21, var5, var6);
                            }
                        }
                    }
                    class27.method173(24, var7, var18, var5, var6);
                }
                if (var8 == 3) {
                    class80 var23 = class92.field2014[class71.field1588][var5][var6];
                    if (var23 != null) {
                        for (class35 var24 = (class35) var23.method582(false); var24 != null; var24 = (class35) var23.method585(1)) {
                            class108 var25 = class9.method47(64, var24.field687);
                            if (class76.field1696 == 1) {
                                class42.field825++;
                                class23.method149(102, var6, class46.method305(20025, new class69[] { class13.field261, class50.field1083, class25.field550, var25.field2397 }), 12, var24.field687, var5);
                            } else if (class60.field1248 != 1) {
                                class33.field658++;
                                class69[] var26 = var25.field2386;
                                if (class79.field1798) {
                                    var26 = class110.method822(var26, 5410);
                                }
                                for (int var27 = 4; var27 >= 0; var27--) {
                                    if (var26 != null && var26[var27] != null) {
                                        class23.field482++;
                                        byte var28 = 0;
                                        if (var27 == 0) {
                                            var28 = 47;
                                        }
                                        if (var27 == 1) {
                                            var28 = 1;
                                        }
                                        if (var27 == 2) {
                                            var28 = 50;
                                        }
                                        if (var27 == 3) {
                                            var28 = 23;
                                        }
                                        if (var27 == 4) {
                                            var28 = 31;
                                        }
                                        class23.method149(-116, var6, class46.method305(20025, new class69[] { var26[var27], class16.field317, var25.field2397 }), var28, var24.field687, var5);
                                    } else if (var27 == 2) {
                                        class23.method149(123, var6, class46.method305(20025, new class69[] { class122.field2650, var25.field2397 }), 50, var24.field687, var5);
                                        class26.field558++;
                                    }
                                }
                                class23.method149(-111, var6, class46.method305(20025, new class69[] { class89.field1939, var25.field2397 }), 1004, var24.field687, var5);
                            } else if ((class127.field2743 & 0x1) == 1) {
                                class51.field1112++;
                                class23.method149(-63, var6, class46.method305(20025, new class69[] { class101.field2186, class16.field317, var25.field2397 }), 40, var24.field687, var5);
                            }
                        }
                    }
                }
            }
        }
        field695++;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(Z)Lhb;")
    public final class44 method144(boolean arg0) {
        field701++;
        if (!arg0) {
            this.method144(true);
        }
        return class9.method47(64, this.field687).method812(this.field694, 9995, true);
    }
}
