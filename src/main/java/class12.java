import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 {

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public int field295 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field285 = 0;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lwd;")
    public static class150 field289 = class2.method9(true, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field286 = 0;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lwd;")
    public static class150 field299 = class2.method9(true, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lwd;")
    public static class150 field287 = class2.method9(true, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lwd;")
    public static class150 field293 = class2.method9(true, "bevor Sie die (WRegelversto-8 melden(W Option benutzen");

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lwd;")
    public static class150 field306 = class2.method9(true, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Le;")
    public class29 field296;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lff;")
    public static class42 field290;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method77(int arg0) {
        try {
            Graphics var1 = class142.field3439.getGraphics();
            class70.field1780.method287(var1, true, 4, arg0);
        } catch (Exception var2) {
            class142.field3439.repaint();
        }
        field288++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static final void method78(boolean arg0) {
        field298++;
        if (!arg0) {
            method79((byte) -49);
        }
        class50.field1351.method546(-98);
        class101.field2298.method803(0, 0);
        class60.method454();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method79(byte arg0) {
        if (arg0 > -55) {
            method77(0);
        }
        field293 = null;
        field306 = null;
        field299 = null;
        field290 = null;
        field287 = null;
        field289 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public static final void method80(byte arg0) {
        field304++;
        int var1 = -1;
        if (class130.field3060 == 0 && !class90.field2095) {
            class68.method521(0, 55, class73.field1815, false, class111.field2557, class43.field1167, class113.field2602);
            class17.field442++;
        }
        for (int var2 = 0; var2 < class13.field338; var2++) {
            int var3 = class13.field355[var2];
            int var4 = var3 >> 29 & 0x3;
            int var5 = var3 & 0x7F;
            int var6 = var3 >> 7 & 0x7F;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var4 == 2 && class111.field2548.method904(class17.field466, var5, var6, var3) >= 0) {
                    class61 var8 = class20.method145(var7, (byte) -51);
                    if (var8.field1560 != null) {
                        var8 = var8.method479((byte) 28);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class130.field3060 == 1) {
                        class68.method521(var3, 5, class9.field214, false, var5, class111.method786((byte) 61, new class150[] { class78.field1923, class70.field1762, var8.field1605 }), var6);
                        class101.field2303++;
                    } else if (!class90.field2095) {
                        class74.field1856++;
                        class150[] var9 = var8.field1569;
                        if (class25.field742) {
                            var9 = class35.method266(5, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 24;
                                    }
                                    if (var10 == 1) {
                                        var11 = 40;
                                    }
                                    class125.field2882++;
                                    if (var10 == 2) {
                                        var11 = 11;
                                    }
                                    if (var10 == 3) {
                                        var11 = 19;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1003;
                                    }
                                    class68.method521(var3, var11, var9[var10], false, var5, class111.method786((byte) 87, new class150[] { class111.field2576, var8.field1605 }), var6);
                                }
                            }
                        }
                        class68.method521(var8.field1578 << 14, 1004, class58.field1505, false, var5, class111.method786((byte) -107, new class150[] { class111.field2576, var8.field1605 }), var6);
                    } else if ((class56.field1466 & 0x4) == 4) {
                        client.field609++;
                        class68.method521(var3, 43, class80.field1937, false, var5, class111.method786((byte) -106, new class150[] { class68.field1727, class70.field1762, var8.field1605 }), var6);
                    }
                }
                if (var4 == 1) {
                    class18 var12 = class37.field1013[var7];
                    if (var12.field478.field2725 == 1 && (var12.field3000 & 0x7F) == 64 && (var12.field2939 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class133.field3128; var13++) {
                            class18 var16 = class37.field1013[class101.field2309[var13]];
                            if (var16 != null && var12 != var16 && var16.field478.field2725 == 1 && var12.field3000 == var16.field3000 && var12.field2939 == var16.field2939) {
                                class106.method734(var5, var6, class101.field2309[var13], (byte) 101, var16.field478);
                            }
                        }
                        for (int var14 = 0; var14 < class109.field2533; var14++) {
                            class111 var15 = class137.field3217[class61.field1574[var14]];
                            if (var15 != null && var12.field3000 == var15.field3000 && var12.field2939 == var15.field2939) {
                                class146.method1093(false, class61.field1574[var14], var5, var15, var6);
                            }
                        }
                    }
                    class106.method734(var5, var6, var7, (byte) 106, var12.field478);
                }
                if (var4 == 0) {
                    class111 var17 = class137.field3217[var7];
                    if ((var17.field3000 & 0x7F) == 64 && (var17.field2939 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class133.field3128; var18++) {
                            class18 var21 = class37.field1013[class101.field2309[var18]];
                            if (var21 != null && var21.field478.field2725 == 1 && var17.field3000 == var21.field3000 && var17.field2939 == var21.field2939) {
                                class106.method734(var5, var6, class101.field2309[var18], (byte) 116, var21.field478);
                            }
                        }
                        for (int var19 = 0; var19 < class109.field2533; var19++) {
                            class111 var20 = class137.field3217[class61.field1574[var19]];
                            if (var20 != null && var17 != var20 && var17.field3000 == var20.field3000 && var17.field2939 == var20.field2939) {
                                class146.method1093(false, class61.field1574[var19], var5, var20, var6);
                            }
                        }
                    }
                    class146.method1093(false, var7, var5, var17, var6);
                }
                if (var4 == 3) {
                    class103 var22 = class50.field1339[class17.field466][var5][var6];
                    if (var22 != null) {
                        for (class23 var23 = (class23) var22.method710(128); var23 != null; var23 = (class23) var22.method705(18834)) {
                            class21 var24 = class4.method26((byte) 101, var23.field659);
                            if (class130.field3060 == 1) {
                                class68.method521(var23.field659, 35, class9.field214, false, var5, class111.method786((byte) -119, new class150[] { class78.field1923, class61.field1541, var24.field558 }), var6);
                                class69.field1738++;
                            } else if (!class90.field2095) {
                                class128.field3039++;
                                class150[] var25 = var24.field582;
                                if (class25.field742) {
                                    var25 = class35.method266(5, var25);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class4.field80++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 8;
                                        }
                                        if (var26 == 1) {
                                            var27 = 30;
                                        }
                                        if (var26 == 2) {
                                            var27 = 41;
                                        }
                                        if (var26 == 3) {
                                            var27 = 2;
                                        }
                                        if (var26 == 4) {
                                            var27 = 12;
                                        }
                                        class68.method521(var23.field659, var27, var25[var26], false, var5, class111.method786((byte) -127, new class150[] { class56.field1463, var24.field558 }), var6);
                                    } else if (var26 == 2) {
                                        class105.field2370++;
                                        class68.method521(var23.field659, 41, class104.field2351, false, var5, class111.method786((byte) 107, new class150[] { class56.field1463, var24.field558 }), var6);
                                    }
                                }
                                class68.method521(var23.field659, 1006, class58.field1505, false, var5, class111.method786((byte) 115, new class150[] { class56.field1463, var24.field558 }), var6);
                            } else if ((class56.field1466 & 0x1) == 1) {
                                class66.field1670++;
                                class68.method521(var23.field659, 13, class80.field1937, false, var5, class111.method786((byte) -125, new class150[] { class68.field1727, class61.field1541, var24.field558 }), var6);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 < 79) {
            field287 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
    public static final int method81(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        field301++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg1 != 20957) {
            field286 = -82;
        }
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
