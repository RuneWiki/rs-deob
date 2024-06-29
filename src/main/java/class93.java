import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class93 {

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Llc;")
    private static class69 field2023 = class69.method470((byte) -128, "Loading)3)3)3 ");

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2022 = 0;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Llc;")
    public static class69 field2027 = class69.method470((byte) -120, "From");

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "[I")
    public static int[] field2032 = new int[128];

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "[Llc;")
    public static class69[] field2037 = new class69[100];

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Llc;")
    public static class69 field2035 = class69.method470((byte) -115, "q8_full");

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field2039 = 0;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Llc;")
    public static class69 field2030 = class69.method470((byte) -102, "*6nin your message centre)3");

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "Llc;")
    public static class69 field2043 = class69.method470((byte) -118, "Hide");

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "Llc;")
    public static class69 field2045 = class69.method470((byte) -110, "*6n*6nRecovery Questions Last Set:*6n@gre@");

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Llc;")
    public static class69 field2028 = class69.method470((byte) -125, "shake:");

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "Llc;")
    public static class69 field2046 = field2023;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field2044 = 0;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "Llc;")
    public static class69 field2048 = class69.method470((byte) -112, "Oct");

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Loa;")
    public static class85 field2020;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[I")
    public static int[] field2029;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "[I")
    public static int[] field2036;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lda;")
    public static class20[] field2019;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZIILkc;II)V")
    public static final synchronized void method651(int arg0, int arg1, boolean arg2, int arg3, int arg4, class63 arg5, int arg6, int arg7) {
        if (arg7 < 102) {
            method653(-100, (byte) 91);
        }
        class125.field2704 = arg6;
        class78.field1763 = arg3;
        class67.field1394 = -1;
        field2031++;
        class25.field546 = arg2;
        class107.field2337 = arg4;
        class107.field2320 = arg1;
        class90.field1970 = arg0;
        class90.field1967 = arg5;
        class83.field1872 = true;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final synchronized void method652(int arg0) {
        field2042++;
        class22.method143(true);
        class83.field1872 = false;
        class90.field1967 = null;
        if (arg0 >= -70) {
            field2035 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
    public static final void method653(int arg0, byte arg1) {
        field2024++;
        if (arg0 == -1 || !class70.field1547[arg0]) {
            return;
        }
        class71.field1575.method395(0, arg0);
        if (class106.field2310[arg0] == null || arg1 <= 31) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class106.field2310[arg0].length; var3++) {
            if (class106.field2310[arg0][var3] != null) {
                if (class106.field2310[arg0][var3].field171 == 2) {
                    var2 = false;
                } else {
                    class106.field2310[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class106.field2310[arg0] = null;
        }
        class70.field1547[arg0] = false;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    private static final void method654(int arg0, int arg1) {
        field2018++;
        int[] var2 = class121.field2612.field439;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class43.field856[arg0][var21][var5] & 0x18) == 0) {
                    class120.field2562.method988(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class43.field856[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class120.field2562.method988(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class121.field2612.method130();
        if (arg1 != 104) {
            field2022 = 47;
        }
        int var6 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var7 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) - 10 + 238 << 8) + 238 - 10;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class43.field856[arg0][var19][var8] & 0x18) == 0) {
                    class91.method641(120, var8, var19, var7, var6, arg0);
                }
                if (arg0 < 3 && (class43.field856[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class91.method641(103, var8, var19, var7, var6, arg0 + 1);
                }
            }
        }
        class81.field1835 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class120.field2562.method956(class71.field1588, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class110.method821(var12, 724).field2624;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class91.field1997[class71.field1588].field2662;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var9 - 3 < var14 && (var16[var14 - 1][var15] & 0x1280108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x1280180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x1280102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x1280120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class72.field1605[class81.field1835] = class55.field1165[var13];
                        class42.field834[class81.field1835] = var14;
                        class16.field316[class81.field1835] = var15;
                        class81.field1835++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static final synchronized void method655(int arg0) {
        class121.method887(3);
        field2041++;
        if (arg0 > -41) {
            field2045 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIZLkc;II)V")
    public static final synchronized void method656(int arg0, int arg1, int arg2, boolean arg3, class63 arg4, int arg5, int arg6) {
        class78.field1763 = arg2;
        class90.field1967 = arg4;
        class67.field1394 = -1;
        class83.field1872 = true;
        class25.field546 = arg3;
        class107.field2337 = arg5;
        class125.field2704 = -1;
        if (arg6 > -94) {
            field2035 = null;
        }
        class107.field2320 = arg0;
        class90.field1970 = arg1;
        field2034++;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public static final void method657(int arg0) {
        field2038++;
        if (arg0 != -10302) {
            field2043 = null;
        }
        if (class13.field264 && class71.field1588 != class103.field2228) {
            class47.method314(class46.field974.field1097[0], class125.field2694, class46.field974.field1041[0], class90.field1955, (byte) -46, class71.field1588);
        } else if (class71.field1588 != class51.field1126) {
            class51.field1126 = class71.field1588;
            method654(class71.field1588, 104);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static final synchronized void method658(byte arg0) {
        if (arg0 != 120) {
            return;
        }
        field2026++;
        if (class83.field1872) {
            byte[] var1 = class66.method432(class90.field1967, (byte) -128, class90.field1970, class78.field1763, class107.field2320);
            if (var1 != null) {
                if (class125.field2704 >= 0) {
                    class30.method190(class107.field2337, class125.field2704, var1, (byte) -26, class25.field546);
                } else if (class67.field1394 < 0) {
                    class40.method241(class25.field546, var1, 12416, class107.field2337);
                } else {
                    class72.method508(var1, class67.field1394, -1202723376, class107.field2337, class25.field546);
                }
                class83.field1872 = false;
                class90.field1967 = null;
            }
        }
        class10.method64(16);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public static final void method659(byte arg0) {
        if (arg0 != -92) {
            method656(10, 102, 123, true, null, -49, -85);
        }
        field2025++;
        class101.field2194 = true;
        class75.method533((byte) -126);
        if (class2.field9) {
            class82.field1861.method299(class49.field1007, 239, 40, 0);
            class82.field1861.method299(class46.method305(20025, new class69[] { class49.field1015, client.field406 }), 239, 60, 128);
        } else if (class62.field1277 == 1) {
            class82.field1861.method299(class35.field706, 239, 40, 0);
            class82.field1861.method299(class46.method305(20025, new class69[] { class49.field1009, client.field406 }), 239, 60, 128);
        } else if (class62.field1277 == 2) {
            class82.field1861.method299(class112.field2431, 239, 40, 0);
            class82.field1861.method299(class46.method305(20025, new class69[] { class49.field1009, client.field406 }), 239, 60, 128);
        } else if (class62.field1277 == 3) {
            if (class49.field1017 != class49.field1009) {
                class107.method800(-28608, class49.field1009);
                class49.field1017 = class49.field1009;
            }
            class45 var1 = class119.field2552;
            class95.method719(0, 0, 463, 77);
            for (int var2 = 0; var2 < class115.field2496; var2++) {
                int var3 = var2 * 14 + 18 - class79.field1796;
                if (var3 > 0 && var3 < 110) {
                    var1.method299(field2037[var2], 239, var3, 0);
                }
            }
            class95.method724();
            if (class115.field2496 > 5) {
                class16.method92(class115.field2496 * 14 + 7, 77, 127, 0, 463, class79.field1796);
            }
            if (class49.field1009.method487((byte) -94) == 0) {
                class82.field1861.method299(class55.field1167, 239, 40, 255);
            } else if (class115.field2496 == 0) {
                class82.field1861.method299(class104.field2269, 239, 40, 0);
            }
            var1.method299(class46.method305(arg0 + 20117, new class69[] { class49.field1009, client.field406 }), 239, 90, 0);
            class95.method725(0, 77, 479, 0);
        } else if (class6.field115 != null) {
            class82.field1861.method299(class6.field115, 239, 40, 0);
            class82.field1861.method299(class64.field1344, 239, 60, 128);
        } else if (class60.field1244 != -1) {
            boolean var18 = class4.method17(2, 0, -1, 479, false, 0, class60.field1244, 96, 0);
            if (!var18) {
                class35.field709 = true;
            }
        } else if (class46.field968 == -1) {
            class45 var4 = class119.field2552;
            int var5 = 0;
            class95.method719(0, 0, 463, 77);
            for (int var6 = 0; var6 < 100; var6++) {
                if (class36.field722[var6] != null) {
                    int var8 = class72.field1603[var6];
                    class69 var9 = class10.field214[var6];
                    byte var10 = 0;
                    int var11 = class47.field986 + 70 - var5 * 14;
                    if (var9 != null && var9.method490(126, class47.field989)) {
                        var10 = 1;
                        var9 = var9.method486(5, (byte) -102);
                    }
                    if (var9 != null && var9.method490(126, class9.field191)) {
                        var9 = var9.method486(5, (byte) -102);
                        var10 = 2;
                    }
                    if (var8 == 0) {
                        var5++;
                        if (var11 > 0 && var11 < 110) {
                            var4.method291(class36.field722[var6], 4, var11, 0);
                        }
                    }
                    if ((var8 == 1 || var8 == 2) && (var8 == 1 || class92.field2005 == 0 || class92.field2005 == 1 && class72.method511(false, var9))) {
                        if (var11 > 0 && var11 < 110) {
                            int var12 = 4;
                            if (var10 == 1) {
                                class69.field1540[0].method80(var12, var11 - 12);
                                var12 += 14;
                            }
                            if (var10 == 2) {
                                class69.field1540[1].method80(var12, var11 - 12);
                                var12 += 14;
                            }
                            var4.method291(class46.method305(arg0 + 20117, new class69[] { var9, class9.field145 }), var12, var11, 0);
                            int var13 = var12 + var4.method298(var9) + 8;
                            var4.method291(class36.field722[var6], var13, var11, 255);
                        }
                        var5++;
                    }
                    if ((var8 == 3 || var8 == 7) && class121.field2627 == 0 && (var8 == 7 || class17.field323 == 0 || class17.field323 == 1 && class72.method511(false, var9))) {
                        var5++;
                        if (var11 > 0 && var11 < 110) {
                            byte var14 = 4;
                            var4.method291(field2027, var14, var11, 0);
                            int var15 = var14 + var4.method298(class120.field2560);
                            if (var10 == 1) {
                                class69.field1540[0].method80(var15, var11 - 12);
                                var15 += 14;
                            }
                            if (var10 == 2) {
                                class69.field1540[1].method80(var15, var11 - 12);
                                var15 += 14;
                            }
                            var4.method291(class46.method305(20025, new class69[] { var9, class9.field145 }), var15, var11, 0);
                            int var16 = var15 + var4.method298(var9) + 8;
                            var4.method291(class36.field722[var6], var16, var11, 8388608);
                        }
                    }
                    if (var8 == 4 && (class110.field2421 == 0 || class110.field2421 == 1 && class72.method511(false, var9))) {
                        var5++;
                        if (var11 > 0 && var11 < 110) {
                            var4.method291(class46.method305(20025, new class69[] { var9, class43.field860, class36.field722[var6] }), 4, var11, 8388736);
                        }
                    }
                    if (var8 == 5 && class121.field2627 == 0 && class17.field323 < 2) {
                        if (var11 > 0 && var11 < 110) {
                            var4.method291(class36.field722[var6], 4, var11, 8388608);
                        }
                        var5++;
                    }
                    if (var8 == 6 && class121.field2627 == 0 && class17.field323 < 2) {
                        var5++;
                        if (var11 > 0 && var11 < 110) {
                            var4.method291(class46.method305(arg0 + 20117, new class69[] { class107.field2329, var9, class9.field145 }), 4, var11, 0);
                            var4.method291(class36.field722[var6], var4.method298(class46.method305(20025, new class69[] { class107.field2329, var9 })) + 12, var11, 8388608);
                        }
                    }
                    if (var8 == 8 && (class110.field2421 == 0 || class110.field2421 == 1 && class72.method511(false, var9))) {
                        if (var11 > 0 && var11 < 110) {
                            var4.method291(class46.method305(20025, new class69[] { var9, class43.field860, class36.field722[var6] }), 4, var11, 8270336);
                        }
                        var5++;
                    }
                }
            }
            class95.method724();
            class89.field1947 = var5 * 14 + 7;
            if (class89.field1947 < 78) {
                class89.field1947 = 78;
            }
            class16.method92(class89.field1947, 77, arg0 ^ 0xFFFFFFDF, 0, 463, class89.field1947 - class47.field986 - 77);
            class69 var7;
            if (class46.field974 == null || class46.field974.field1222 == null) {
                var7 = class71.field1585;
            } else {
                var7 = class46.field974.field1222;
            }
            var4.method291(class46.method305(20025, new class69[] { var7, class9.field145 }), 4, 90, 0);
            var4.method291(class46.method305(20025, new class69[] { class49.field1002, client.field406 }), var4.method298(class46.method305(20025, new class69[] { var7, class83.field1881 })) + 6, 90, 255);
            class95.method725(0, 77, 479, 0);
        } else {
            boolean var17 = class4.method17(3, 0, -1, 479, false, 0, class46.field968, 96, 0);
            if (!var17) {
                class35.field709 = true;
            }
        }
        if (class127.field2738 && class77.field1718 == 2) {
            class23.method156(-13309);
        }
        class35.method215(class24.field509, (byte) 79);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLkc;ILlc;Llc;II)V")
    public static final synchronized void method660(int arg0, boolean arg1, class63 arg2, int arg3, class69 arg4, class69 arg5, int arg6, int arg7) {
        field2047++;
        int var8 = arg2.method400(arg4, (byte) 92);
        if (arg6 == -2) {
            int var9 = arg2.method390(var8, arg5, 104);
            method651(arg7, var9, arg1, var8, arg0, arg2, arg3, arg6 ^ 0xFFFFFF86);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Llb;")
    public static final class68 method661(int arg0, int arg1) {
        class68 var2 = (class68) class11.field227.method224((long) arg1, (byte) 123);
        if (arg0 != 9) {
            field2027 = null;
        }
        field2033++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class92.field2006.method394(9, arg1, (byte) -106);
        class68 var4 = new class68();
        var4.field1458 = arg1;
        if (var3 != null) {
            var4.method449(0, new class94(var3));
        }
        var4.method450(true);
        class11.field227.method221(var4, true, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method662(boolean arg0) {
        field2036 = null;
        field2046 = null;
        field2048 = null;
        if (!arg0) {
            method651(-68, -106, true, -74, 20, null, 122, 89);
        }
        field2035 = null;
        field2043 = null;
        field2019 = null;
        field2027 = null;
        field2029 = null;
        field2020 = null;
        field2023 = null;
        field2045 = null;
        field2037 = null;
        field2028 = null;
        field2030 = null;
        field2032 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method663(int arg0, boolean arg1) {
        field2021++;
        class115.method842(arg0, arg1);
        class90.field1967 = null;
        class83.field1872 = false;
    }
}
