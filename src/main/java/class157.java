import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class157 extends class194 {

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "Lqk;")
    public static class207 field2784 = class24.method212(255, "(U3");

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "Ldk;")
    public static class275 field2763 = new class275(16);

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "Lqk;")
    public static class207 field2788 = class24.method212(255, "(R");

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "Ldd;")
    public static class132 field2786 = new class132();

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public int field2766;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public int field2767;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Lwi;")
    public class133 field2760;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Lme;")
    public class222 field2761;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "Lph;")
    public class77 field2768;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "Luk;")
    public class97 field2769;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "[[I")
    public static int[][] field2790;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static final void method1146(int arg0) {
        field2773++;
        if (class176.method1261((byte) 86) != 2) {
            return;
        }
        byte var1 = (byte) (class89.field1609 - 4 & 0xFF);
        int var2 = class89.field1609 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class16.field256[var3][var2][var16] = var1;
            }
        }
        if (class93.field1645 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class232.field4245[var4] = -1000000;
            class19.field320[var4] = 1000000;
            class207.field3687[var4] = 0;
            class20.field327[var4] = 1000000;
            class121.field2097[var4] = 0;
        }
        if (class132.field2290 == 1) {
            if ((class271.field4791[class93.field1645][class202.field3565.field5104 >> 7][class202.field3565.field5072 >> 7] & 0x4) != 0) {
                class106.method763(0, class82.field1498, class202.field3565.field5072 >> 7, false, class202.field3565.field5104 >> 7, (byte) 124);
            }
            if (class228.field4186 < 310) {
                int var5 = class111.field1939 >> 7;
                int var6 = class209.field3702 >> 7;
                int var7 = class202.field3565.field5072 >> 7;
                int var8 = class202.field3565.field5104 >> 7;
                int var9;
                if (var7 > var5) {
                    var9 = var7 - var5;
                } else {
                    var9 = var5 - var7;
                }
                int var10;
                if (var8 <= var6) {
                    var10 = var6 - var8;
                } else {
                    var10 = var8 - var6;
                }
                if (var9 >= var10) {
                    int var11 = 32768;
                    int var12 = var10 * 65536 / var9;
                    while (var5 != var7) {
                        if (var7 > var5) {
                            var5++;
                        } else if (var5 > var7) {
                            var5--;
                        }
                        if ((class271.field4791[class93.field1645][var6][var5] & 0x4) != 0) {
                            class106.method763(1, class82.field1498, var5, false, var6, (byte) 126);
                            break;
                        }
                        var11 += var12;
                        if (var11 >= 65536) {
                            var11 -= 65536;
                            if (var6 < var8) {
                                var6++;
                            } else if (var8 < var6) {
                                var6--;
                            }
                            if ((class271.field4791[class93.field1645][var6][var5] & 0x4) != 0) {
                                class106.method763(1, class82.field1498, var5, false, var6, (byte) 126);
                                break;
                            }
                        }
                    }
                } else {
                    int var13 = var9 * 65536 / var10;
                    int var14 = 32768;
                    while (var6 != var8) {
                        if (var8 > var6) {
                            var6++;
                        } else if (var6 > var8) {
                            var6--;
                        }
                        if ((class271.field4791[class93.field1645][var6][var5] & 0x4) != 0) {
                            class106.method763(1, class82.field1498, var5, false, var6, (byte) 127);
                            break;
                        }
                        var14 += var13;
                        if (var14 >= 65536) {
                            if (var7 > var5) {
                                var5++;
                            } else if (var7 < var5) {
                                var5--;
                            }
                            var14 -= 65536;
                            if ((class271.field4791[class93.field1645][var6][var5] & 0x4) != 0) {
                                class106.method763(1, class82.field1498, var5, false, var6, (byte) 125);
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            int var15 = class22.method139(class209.field3702, class111.field1939, 23979, class93.field1645);
            if (var15 - class196.field3443 < 800 && (class271.field4791[class93.field1645][class209.field3702 >> 7][class111.field1939 >> 7] & 0x4) != 0) {
                class106.method763(1, class82.field1498, class111.field1939 >> 7, false, class209.field3702 >> 7, (byte) 124);
            }
        }
        if (arg0 >= -5) {
            field2787 = 65;
        }
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
    public static void method1147(int arg0) {
        field2788 = null;
        field2784 = null;
        field2790 = null;
        if (arg0 == 0) {
            field2763 = null;
            field2786 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
    public static final void method1148(int arg0) {
        field2782++;
        class69.field1236.method1390((byte) 123);
        class194.field3415.method1390((byte) 127);
        class250.field4522.method1390((byte) 110);
        if (arg0 > -1) {
            method1150(5, (byte) 30);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BII)Ltk;")
    public static final class51 method1149(byte arg0, int arg1, int arg2) {
        if (arg0 >= -68) {
            return null;
        }
        field2785++;
        class51 var3 = new class51();
        for (class254 var4 = (class254) field2786.method922((byte) 44); var4 != null; var4 = (class254) field2786.method928(-48)) {
            if (var4.field4547 && var4.method1767(arg2, arg1, -1)) {
                var3.method389(false, var4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)V")
    public static final void method1150(int arg0, byte arg1) {
        field2775++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class85.field1551[arg0];
        if (arg1 <= 96) {
            return;
        }
        int var3 = class82.field1494[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        long var4 = class282.field4960[arg0];
        int var6 = (int) class282.field4960[arg0];
        int var7 = class199.field3505[arg0];
        if (var3 == 49 && class260.method1809(var7, var4, (byte) 103, var2)) {
            class261.field4645.method767(4, (byte) 100);
            class117.field2029++;
            class261.field4645.method1085(class13.field176, (byte) 23);
            class261.field4645.method1042(class180.field3231 + var7, -124);
            class261.field4645.method1042(var2 + class21.field349, -120);
            class261.field4645.method1083(false, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class261.field4645.method1083(false, class231.field4236);
        }
        if (var3 == 36) {
            class260.method1809(var7, var4, (byte) 103, var2);
            class261.field4645.method767(194, (byte) 35);
            class261.field4645.method1083(false, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class105.field1862++;
            class261.field4645.method1061(var2 + class21.field349, false);
            class261.field4645.method1042(class180.field3231 + var7, -125);
        }
        if (var3 == 30 && class89.field1605 == null) {
            class237.method1687(var2, 217, var7);
            class89.field1605 = class108.method782((byte) -66, var2, var7);
            class82.method614((byte) 46, class89.field1605);
        }
        if (var3 == 12) {
            class250.field4517++;
            class261.field4645.method767(90, (byte) 79);
            class261.field4645.method1042(class231.field4236, -115);
            class261.field4645.method1085(class13.field176, (byte) 96);
            class261.field4645.method1033((byte) 16, var2);
            class261.field4645.method1063(-99, var7);
        }
        if (var3 == 20) {
            class52.field1001++;
            boolean var8 = class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 0, var2, 0, 0, false, var7, 0, 0, 2);
            if (!var8) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
            }
            class22.field377 = 0;
            class204.field3599 = class121.field2092;
            class13.field193 = class47.field939;
            class178.field3209 = 2;
            class261.field4645.method767(135, (byte) 120);
            class261.field4645.method1042(var6, -108);
            class261.field4645.method1033((byte) 16, class147.field2538);
            class261.field4645.method1085(class70.field1243, (byte) 78);
            class261.field4645.method1061(var2 + class21.field349, false);
            class261.field4645.method1033((byte) 16, class180.field3231 + var7);
            class261.field4645.method1033((byte) 16, class45.field911);
        }
        if (var3 == 4) {
            class213.field3779++;
            class261.field4645.method767(115, (byte) 101);
            class261.field4645.method1033((byte) 16, var2);
            class261.field4645.method1033((byte) 16, var6);
            class261.field4645.method1063(-99, var7);
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 55);
            class190.field3358 = var2;
        }
        if (var3 == 17) {
            class14 var10 = class169.field2953[var6];
            if (var10 != null) {
                class288.field5144++;
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var10.field5022[0], 0, 0, false, var10.field5074[0], 0, 1, 2);
                class204.field3599 = class121.field2092;
                class178.field3209 = 2;
                class13.field193 = class47.field939;
                class22.field377 = 0;
                class261.field4645.method767(104, (byte) 27);
                class261.field4645.method1033((byte) 16, var6);
            }
        }
        if (var3 == 28) {
            boolean var11 = class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 0, var2, 0, 0, false, var7, 0, 0, 2);
            class15.field247++;
            if (!var11) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
            }
            class22.field377 = 0;
            class178.field3209 = 2;
            class204.field3599 = class121.field2092;
            class13.field193 = class47.field939;
            class261.field4645.method767(130, (byte) 117);
            class261.field4645.method1042(class180.field3231 + var7, -115);
            class261.field4645.method1051(class13.field176, -73);
            class261.field4645.method1083(false, var2 + class21.field349);
            class261.field4645.method1083(false, var6);
            class261.field4645.method1061(class231.field4236, false);
        }
        if (var3 == 13) {
            class256 var13 = class79.field1449[var6];
            if (var13 != null) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var13.field5022[0], 0, 0, false, var13.field5074[0], 0, 1, 2);
                class22.field377 = 0;
                class13.field193 = class47.field939;
                class265.field4689++;
                class204.field3599 = class121.field2092;
                class178.field3209 = 2;
                class261.field4645.method767(246, (byte) 99);
                class261.field4645.method1061(var6, false);
            }
        }
        if (var3 == 25) {
            class219.method1553(33);
            class220 var14 = class233.method1667(var7, 14);
            class34.field680 = 1;
            class147.field2538 = var2;
            class45.field911 = var6;
            class70.field1243 = var7;
            class82.method614((byte) 109, var14);
            class235.field4336 = class105.method757(false, new class207[] { class190.field3351, class117.method829(var6, (byte) 51).field3057, class232.field4256 });
            if (class235.field4336 == null) {
                class235.field4336 = class150.field2628;
            }
            return;
        }
        if (var3 == 50) {
            class261.field4645.method767(111, (byte) 44);
            class126.field2185++;
            class261.field4645.method1068(var7, 111);
            class261.field4645.method1083(false, var6);
            class261.field4645.method1083(false, var2);
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 78);
            class190.field3358 = var2;
        }
        if (var3 == 48) {
            class100.field1798++;
            if (class171.field3035 == 1) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
            } else {
                boolean var15 = class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 0, var2, 0, 0, false, var7, 0, 0, 2);
                if (!var15) {
                    class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
                }
            }
            class204.field3599 = class121.field2092;
            class13.field193 = class47.field939;
            class22.field377 = 0;
            class178.field3209 = 2;
            class261.field4645.method767(202, (byte) 51);
            class261.field4645.method1061(class180.field3231 + var7, false);
            class261.field4645.method1042(class21.field349 + var2, -106);
            class261.field4645.method1061(var6, false);
        }
        if (var3 == 58) {
            class220 var17 = class233.method1667(var7, 98);
            boolean var18 = true;
            if (var17.field3960 > 0) {
                var18 = class3.method13(var17, 250);
            }
            if (var18) {
                class263.field4679++;
                class261.field4645.method767(38, (byte) 119);
                class261.field4645.method1068(var7, 120);
            }
        }
        if (var3 == 31) {
            class137.field2373++;
            if (class171.field3035 == 1) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
            } else {
                boolean var19 = class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 0, var2, 0, 0, false, var7, 0, 0, 2);
                if (!var19) {
                    class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
                }
            }
            class13.field193 = class47.field939;
            class178.field3209 = 2;
            class204.field3599 = class121.field2092;
            class22.field377 = 0;
            class261.field4645.method767(51, (byte) 61);
            class261.field4645.method1061(var6, false);
            class261.field4645.method1061(class21.field349 + var2, false);
            class261.field4645.method1042(var7 + class180.field3231, -119);
        }
        if (var3 == 57) {
            class256 var21 = class79.field1449[var6];
            if (var21 != null) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var21.field5022[0], 0, 0, false, var21.field5074[0], 0, 1, 2);
                class22.field377 = 0;
                class13.field193 = class47.field939;
                class204.field3599 = class121.field2092;
                class178.field3209 = 2;
                class271.field4785++;
                class261.field4645.method767(147, (byte) 106);
                class261.field4645.method1061(var6, false);
            }
        }
        if (var3 == 1) {
            class261.field4645.method767(161, (byte) 109);
            class261.field4645.method1033((byte) 16, var2);
            class261.field4645.method1033((byte) 16, var6);
            class240.field4377++;
            class261.field4645.method1063(-99, var7);
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 14);
            class190.field3358 = var2;
        }
        if (var3 == 1001) {
            class13.field193 = class47.field939;
            class22.field377 = 0;
            class204.field3599 = class121.field2092;
            class178.field3209 = 2;
            class256 var22 = class79.field1449[var6];
            if (var22 != null) {
                class72 var23 = var22.field4581;
                if (var23.field1293 != null) {
                    var23 = var23.method517(-114);
                }
                if (var23 != null) {
                    class30.field617++;
                    class261.field4645.method767(183, (byte) 49);
                    class261.field4645.method1083(false, var23.field1336);
                }
            }
        }
        if (var3 == 15) {
            class243.field4413++;
            class261.field4645.method767(206, (byte) 83);
            class261.field4645.method1061(var6, false);
            class261.field4645.method1051(var7, 77);
            class261.field4645.method1061(var2, false);
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 87);
            class190.field3358 = var2;
        }
        if (var3 == 1007) {
            class13.field193 = class47.field939;
            class279.field4898++;
            class178.field3209 = 2;
            class204.field3599 = class121.field2092;
            class22.field377 = 0;
            class261.field4645.method767(37, (byte) 25);
            class261.field4645.method1033((byte) 16, var6);
        }
        if (var3 == 14) {
            class147.field2513++;
            class261.field4645.method767(255, (byte) 89);
            class261.field4645.method1042(var2, -114);
            class261.field4645.method1042(var6, -119);
            class261.field4645.method1051(var7, -43);
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 66);
            class190.field3358 = var2;
        }
        if (var3 == 6) {
            class256 var24 = class79.field1449[var6];
            if (var24 != null) {
                class56.field1049++;
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var24.field5022[0], 0, 0, false, var24.field5074[0], 0, 1, 2);
                class22.field377 = 0;
                class178.field3209 = 2;
                class13.field193 = class47.field939;
                class204.field3599 = class121.field2092;
                class261.field4645.method767(165, (byte) 46);
                class261.field4645.method1042(var6, -118);
            }
        }
        if (var3 == 1005) {
            class220 var25 = class233.method1667(var7, 121);
            if (var25 == null || var25.field3939[var2] < 100000) {
                class2.field30++;
                class261.field4645.method767(12, (byte) 29);
                class261.field4645.method1061(var6, false);
            } else {
                class71.method511(23692, class100.field1800, 0, class105.method757(false, new class207[] { class262.method1815(var25.field3939[var2], (byte) -115), class209.field3707, class117.method829(var6, (byte) 66).field3057 }));
            }
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 97);
            class190.field3358 = var2;
        }
        if (var3 == 10) {
            class261.field4645.method767(152, (byte) 102);
            class261.field4645.method1042(var6, -120);
            class269.field4764++;
            class261.field4645.method1063(-67, var7);
            class261.field4645.method1083(false, var2);
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 37);
            class190.field3358 = var2;
        }
        if (var3 == 41) {
            if (class171.field3035 == 1) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
            } else {
                boolean var26 = class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 0, var2, 0, 0, false, var7, 0, 0, 2);
                if (!var26) {
                    class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
                }
            }
            class13.field193 = class47.field939;
            class22.field377 = 0;
            class4.field70++;
            class204.field3599 = class121.field2092;
            class178.field3209 = 2;
            class261.field4645.method767(216, (byte) 53);
            class261.field4645.method1083(false, var2 + class21.field349);
            class261.field4645.method1033((byte) 16, var6);
            class261.field4645.method1042(class180.field3231 + var7, -120);
        }
        if (var3 == 24) {
            class14 var28 = class169.field2953[var6];
            if (var28 != null) {
                class151.field2651++;
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var28.field5022[0], 0, 0, false, var28.field5074[0], 0, 1, 2);
                class13.field193 = class47.field939;
                class22.field377 = 0;
                class204.field3599 = class121.field2092;
                class178.field3209 = 2;
                class261.field4645.method767(162, (byte) 123);
                class261.field4645.method1068(class70.field1243, 121);
                class261.field4645.method1061(var6, false);
                class261.field4645.method1042(class45.field911, -103);
                class261.field4645.method1033((byte) 16, class147.field2538);
            }
        }
        if (var3 == 39) {
            class14 var29 = class169.field2953[var6];
            if (var29 != null) {
                class244.field4429++;
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var29.field5022[0], 0, 0, false, var29.field5074[0], 0, 1, 2);
                class22.field377 = 0;
                class178.field3209 = 2;
                class204.field3599 = class121.field2092;
                class13.field193 = class47.field939;
                class261.field4645.method767(192, (byte) 113);
                class261.field4645.method1042(var6, -121);
            }
        }
        if (var3 == 42) {
            class261.field4645.method767(38, (byte) 80);
            class263.field4679++;
            class261.field4645.method1068(var7, 120);
            class220 var30 = class233.method1667(var7, 122);
            if (var30.field3976 != null && var30.field3976[0][0] == 5) {
                int var31 = var30.field3976[0][1];
                if (class83.field1535[var31] != var30.field3943[0]) {
                    class83.field1535[var31] = var30.field3943[0];
                    class140.method968(var31, 9);
                }
            }
        }
        if (var3 == 16) {
            class261.field4645.method767(27, (byte) 99);
            class261.field4645.method1085(var7, (byte) 26);
            class261.field4645.method1061(var6, false);
            class261.field4645.method1061(var2, false);
            class14.field212 = 0;
            class22.field409++;
            class41.field816 = class233.method1667(var7, 52);
            class190.field3358 = var2;
        }
        if (var3 == 3) {
            if (class171.field3035 == 1) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
            } else {
                boolean var32 = class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 0, var2, 0, 0, false, var7, 0, 0, 2);
                if (!var32) {
                    class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
                }
            }
            class204.field3599 = class121.field2092;
            class28.field563++;
            class22.field377 = 0;
            class13.field193 = class47.field939;
            class178.field3209 = 2;
            class261.field4645.method767(11, (byte) 124);
            class261.field4645.method1042(class180.field3231 + var7, -118);
            class261.field4645.method1061(var6, false);
            class261.field4645.method1033((byte) 16, class21.field349 + var2);
        }
        if (var3 == 21) {
            class14 var34 = class169.field2953[var6];
            if (var34 != null) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var34.field5022[0], 0, 0, false, var34.field5074[0], 0, 1, 2);
                class13.field193 = class47.field939;
                class204.field3599 = class121.field2092;
                class49.field967++;
                class22.field377 = 0;
                class178.field3209 = 2;
                class261.field4645.method767(169, (byte) 103);
                class261.field4645.method1042(var6, -108);
            }
        }
        if (var3 == 44) {
            class14 var35 = class169.field2953[var6];
            if (var35 != null) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var35.field5022[0], 0, 0, false, var35.field5074[0], 0, 1, 2);
                class13.field193 = class47.field939;
                class22.field377 = 0;
                class204.field3599 = class121.field2092;
                class178.field3209 = 2;
                class1.field22++;
                class261.field4645.method767(79, (byte) 123);
                class261.field4645.method1042(var6, -97);
            }
        }
        if (var3 == 51) {
            class261.field4645.method767(123, (byte) 47);
            class261.field4645.method1083(false, var2);
            class261.field4645.method1063(-106, var7);
            class262.field4675++;
            class261.field4645.method1061(var6, false);
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 18);
            class190.field3358 = var2;
        }
        if (var3 == 46) {
            class265.field4700++;
            class261.field4645.method767(33, (byte) 113);
            class261.field4645.method1033((byte) 16, var6);
            class261.field4645.method1051(var7, 72);
            class261.field4645.method1033((byte) 16, var2);
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 122);
            class190.field3358 = var2;
        }
        if (var3 == 19) {
            class41.field817++;
            class261.field4645.method767(159, (byte) 86);
            class261.field4645.method1083(false, var2);
            class261.field4645.method1083(false, var6);
            class261.field4645.method1051(var7, 55);
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 117);
            class190.field3358 = var2;
        }
        if (var3 == 37) {
            if (class171.field3035 == 1) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
            } else {
                boolean var36 = class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 0, var2, 0, 0, false, var7, 0, 0, 2);
                if (!var36) {
                    class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var2, 0, 0, false, var7, 0, 1, 2);
                }
            }
            class282.field4957++;
            class13.field193 = class47.field939;
            class22.field377 = 0;
            class178.field3209 = 2;
            class204.field3599 = class121.field2092;
            class261.field4645.method767(64, (byte) 49);
            class261.field4645.method1042(class180.field3231 + var7, -126);
            class261.field4645.method1042(var6, -103);
            class261.field4645.method1083(false, class21.field349 + var2);
        }
        if (var3 == 11) {
            class256 var38 = class79.field1449[var6];
            if (var38 != null) {
                class186.field3288++;
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var38.field5022[0], 0, 0, false, var38.field5074[0], 0, 1, 2);
                class204.field3599 = class121.field2092;
                class22.field377 = 0;
                class178.field3209 = 2;
                class13.field193 = class47.field939;
                class261.field4645.method767(85, (byte) 43);
                class261.field4645.method1061(class45.field911, false);
                class261.field4645.method1051(class70.field1243, -41);
                class261.field4645.method1033((byte) 16, var6);
                class261.field4645.method1061(class147.field2538, false);
            }
        }
        if (var3 == 47) {
            class1.field21++;
            class260.method1809(var7, var4, (byte) 103, var2);
            class261.field4645.method767(176, (byte) 109);
            class261.field4645.method1033((byte) 16, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class261.field4645.method1042(class21.field349 + var2, -116);
            class261.field4645.method1042(class180.field3231 + var7, -118);
        }
        if (var3 == 22) {
            if (var6 == 0) {
                class67.field1200 = 1;
                class224.method1584(class93.field1645, var2, var7);
            } else if (class123.field2134 > 0 && class165.field2920[82] && class165.field2920[81]) {
                class133.method935(class180.field3231 + var7, class93.field1645, class21.field349 + var2, true);
            } else {
                class261.field4645.method767(97, (byte) 22);
                class246.field4466++;
                class261.field4645.method1033((byte) 16, class21.field349 + var2);
                class261.field4645.method1083(false, class180.field3231 + var7);
            }
        }
        if (var3 == 18) {
            class14 var39 = class169.field2953[var6];
            if (var39 != null) {
                class5.field72++;
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var39.field5022[0], 0, 0, false, var39.field5074[0], 0, 1, 2);
                class178.field3209 = 2;
                class204.field3599 = class121.field2092;
                class13.field193 = class47.field939;
                class22.field377 = 0;
                class261.field4645.method767(195, (byte) 125);
                class261.field4645.method1083(false, var6);
            }
        }
        if (var3 == 59) {
            class260.method1809(var7, var4, (byte) 103, var2);
            class174.field3128++;
            class261.field4645.method767(180, (byte) 91);
            class261.field4645.method1042((int) (var4 >>> 32) & Integer.MAX_VALUE, -98);
            class261.field4645.method1083(false, class180.field3231 + var7);
            class261.field4645.method1061(var2 + class21.field349, false);
        }
        if (var3 == 26) {
            class232.method1661(true);
        }
        if (var3 == 32) {
            class14 var40 = class169.field2953[var6];
            if (var40 != null) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var40.field5022[0], 0, 0, false, var40.field5074[0], 0, 1, 2);
                class162.field2869++;
                class204.field3599 = class121.field2092;
                class178.field3209 = 2;
                class22.field377 = 0;
                class13.field193 = class47.field939;
                class261.field4645.method767(46, (byte) 38);
                class261.field4645.method1042(class231.field4236, -108);
                class261.field4645.method1063(-70, class13.field176);
                class261.field4645.method1083(false, var6);
            }
        }
        if (var3 == 5 || var3 == 1002) {
            class67.method488(class12.field167[arg0], var7, 22763, var6, var2);
        }
        if (var3 == 1006) {
            class13.field193 = class47.field939;
            class204.field3599 = class121.field2092;
            class2.field30++;
            class178.field3209 = 2;
            class22.field377 = 0;
            class261.field4645.method767(12, (byte) 72);
            class261.field4645.method1061(var6, false);
        }
        if (var3 == 9) {
            class220 var41 = class108.method782((byte) -55, var2, var7);
            if (var41 != null) {
                class219.method1553(-118);
                class117 var42 = client.method1112(var41);
                class185.method1298(var2, 0, var7, var41.field3902, var42.field2034, var42.method837(1), var41.field4015);
                class34.field680 = 0;
                class49.field969 = class234.method1670((byte) -112, var41);
                if (class49.field969 == null) {
                    class49.field969 = class138.field2387;
                }
                if (!var41.field4010) {
                    class243.field4422 = class105.method757(false, new class207[] { class133.field2298, var41.field3918, class232.field4256 });
                    return;
                }
                class243.field4422 = class105.method757(false, new class207[] { var41.field3980, class232.field4256 });
            }
            return;
        }
        if (var3 == 23) {
            if (var6 == 0) {
                class81.field1476 = 1;
                class224.method1584(class93.field1645, var2, var7);
            } else if (var6 == 1) {
                class237.field4368++;
                class261.field4645.method767(168, (byte) 51);
                class261.field4645.method1033((byte) 16, class180.field3231 + var7);
                class261.field4645.method1085(class13.field176, (byte) 112);
                class261.field4645.method1083(false, class231.field4236);
                class261.field4645.method1033((byte) 16, class21.field349 + var2);
            }
        }
        if (var3 == 7) {
            class49.field955++;
            class261.field4645.method767(92, (byte) 58);
            class261.field4645.method1033((byte) 16, class231.field4236);
            class261.field4645.method1083(false, var2);
            class261.field4645.method1061(var6, false);
            class261.field4645.method1085(var7, (byte) 72);
            class261.field4645.method1063(-99, class13.field176);
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 13);
            class190.field3358 = var2;
        }
        if (var3 == 33) {
            class14 var43 = class169.field2953[var6];
            if (var43 != null) {
                class71.field1261++;
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var43.field5022[0], 0, 0, false, var43.field5074[0], 0, 1, 2);
                class13.field193 = class47.field939;
                class178.field3209 = 2;
                class204.field3599 = class121.field2092;
                class22.field377 = 0;
                class261.field4645.method767(70, (byte) 100);
                class261.field4645.method1033((byte) 16, var6);
            }
        }
        if (var3 == 29) {
            if (var6 == 0) {
                class224.method1584(class93.field1645, var2, var7);
            } else if (var6 == 1) {
                if (class123.field2134 > 0 && class165.field2920[82] && class165.field2920[81]) {
                    class133.method935(class180.field3231 + var7, class93.field1645, class21.field349 + var2, true);
                } else if (class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 0, var2, 0, 0, true, var7, 0, 0, 1)) {
                    class261.field4645.method1041(true, class95.field1688);
                    class261.field4645.method1041(true, class44.field874);
                    class261.field4645.method1083(false, class266.field4711);
                    class261.field4645.method1041(true, 57);
                    class261.field4645.method1041(true, class70.field1254);
                    class261.field4645.method1041(true, class225.field4098);
                    class261.field4645.method1041(true, 89);
                    class261.field4645.method1083(false, class202.field3565.field5104);
                    class261.field4645.method1083(false, class202.field3565.field5072);
                    class261.field4645.method1041(true, class140.field2423);
                    class261.field4645.method1041(true, 63);
                }
            }
        }
        if (var3 == 60 && class260.method1809(var7, var4, (byte) 103, var2)) {
            class261.field4645.method767(23, (byte) 28);
            class256.field4582++;
            class261.field4645.method1085(class70.field1243, (byte) 9);
            class261.field4645.method1061(class180.field3231 + var7, false);
            class261.field4645.method1033((byte) 16, class147.field2538);
            class261.field4645.method1033((byte) 16, class45.field911);
            class261.field4645.method1061(Integer.MAX_VALUE & (int) (var4 >>> 32), false);
            class261.field4645.method1061(var2 + class21.field349, false);
        }
        if (var3 == 1004) {
            class155.field2723++;
            class260.method1809(var7, var4, (byte) 103, var2);
            class261.field4645.method767(61, (byte) 36);
            class261.field4645.method1083(false, class180.field3231 + var7);
            class261.field4645.method1033((byte) 16, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class261.field4645.method1033((byte) 16, class21.field349 + var2);
        }
        if (var3 == 35) {
            class261.field4645.method767(145, (byte) 73);
            class261.field4645.method1085(class70.field1243, (byte) 84);
            class261.field4645.method1085(var7, (byte) 98);
            class261.field4645.method1042(var2, -111);
            class277.field4864++;
            class261.field4645.method1061(class147.field2538, false);
            class261.field4645.method1061(class45.field911, false);
            class261.field4645.method1042(var6, -122);
            class14.field212 = 0;
            class41.field816 = class233.method1667(var7, 67);
            class190.field3358 = var2;
        }
        if (var3 == 40) {
            class256 var44 = class79.field1449[var6];
            if (var44 != null) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var44.field5022[0], 0, 0, false, var44.field5074[0], 0, 1, 2);
                class204.field3599 = class121.field2092;
                class178.field3209 = 2;
                class13.field193 = class47.field939;
                class22.field377 = 0;
                class261.field4645.method767(232, (byte) 99);
                class261.field4645.method1061(var6, false);
                class209.field3708++;
            }
        }
        if (var3 == 38) {
            class14 var45 = class169.field2953[var6];
            if (var45 != null) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var45.field5022[0], 0, 0, false, var45.field5074[0], 0, 1, 2);
                class204.field3599 = class121.field2092;
                class207.field3666++;
                class13.field193 = class47.field939;
                class22.field377 = 0;
                class178.field3209 = 2;
                class261.field4645.method767(224, (byte) 69);
                class261.field4645.method1042(var6, -101);
            }
        }
        if (var3 == 2) {
            class14 var46 = class169.field2953[var6];
            if (var46 != null) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var46.field5022[0], 0, 0, false, var46.field5074[0], 0, 1, 2);
                class262.field4672++;
                class178.field3209 = 2;
                class204.field3599 = class121.field2092;
                class22.field377 = 0;
                class13.field193 = class47.field939;
                class261.field4645.method767(204, (byte) 40);
                class261.field4645.method1083(false, var6);
            }
        }
        if (var3 == 34) {
            class256 var47 = class79.field1449[var6];
            if (var47 != null) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var47.field5022[0], 0, 0, false, var47.field5074[0], 0, 1, 2);
                class178.field3209 = 2;
                class22.field377 = 0;
                class13.field193 = class47.field939;
                class12.field175++;
                class204.field3599 = class121.field2092;
                class261.field4645.method767(119, (byte) 20);
                class261.field4645.method1033((byte) 16, class231.field4236);
                class261.field4645.method1061(var6, false);
                class261.field4645.method1068(class13.field176, 120);
            }
        }
        if (var3 == 43) {
            class256 var48 = class79.field1449[var6];
            if (var48 != null) {
                class33.field666++;
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var48.field5022[0], 0, 0, false, var48.field5074[0], 0, 1, 2);
                class204.field3599 = class121.field2092;
                class22.field377 = 0;
                class178.field3209 = 2;
                class13.field193 = class47.field939;
                class261.field4645.method767(173, (byte) 25);
                class261.field4645.method1083(false, var6);
            }
        }
        if (var3 == 45) {
            class263.field4679++;
            class261.field4645.method767(38, (byte) 34);
            class261.field4645.method1068(var7, 121);
            class220 var49 = class233.method1667(var7, 44);
            if (var49.field3976 != null && var49.field3976[0][0] == 5) {
                int var50 = var49.field3976[0][1];
                class83.field1535[var50] = 1 - class83.field1535[var50];
                class140.method968(var50, 9);
            }
        }
        if (var3 == 8) {
            class260.method1809(var7, var4, (byte) 103, var2);
            class59.field1086++;
            class261.field4645.method767(137, (byte) 39);
            class261.field4645.method1061(class21.field349 + var2, false);
            class261.field4645.method1061(var7 + class180.field3231, false);
            class261.field4645.method1061(Integer.MAX_VALUE & (int) (var4 >>> 32), false);
        }
        if (class34.field680 != 0) {
            class34.field680 = 0;
            class82.method614((byte) 86, class233.method1667(class70.field1243, 85));
        }
        if (class4.field71) {
            class219.method1553(3);
        }
        if (class41.field816 != null && class14.field212 == 0) {
            class82.method614((byte) 53, class41.field816);
        }
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V")
    public static final void method1151(int arg0) {
        field2783++;
        int var1 = 0;
        if (arg0 != 28756) {
            return;
        }
        while (var1 < class160.field2842) {
            class179 var2 = class25.method214(var1, (byte) -118);
            if (var2 != null && var2.field3223 == 0) {
                class85.field1543[var1] = 0;
                class83.field1535[var1] = 0;
            }
            var1++;
        }
        field2763 = new class275(16);
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
    public final void method1152(int arg0) {
        this.field2761 = null;
        this.field2769 = null;
        this.field2760 = null;
        field2776++;
        if (arg0 < 5) {
            method1148(-72);
        }
        this.field2768 = null;
    }
}
