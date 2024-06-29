import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class42 extends class62 {

    @OriginalMember(owner = "client!di", name = "x", descriptor = "Leg;")
    public static class37 field660 = class174.method1167("Verbindung zum Update)2Server hergestellt)3", 102);

    @OriginalMember(owner = "client!di", name = "D", descriptor = "Leg;")
    public static class37 field666 = class174.method1167("um", -21);

    @OriginalMember(owner = "client!di", name = "y", descriptor = "[B")
    public static byte[] field661 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!di", name = "E", descriptor = "[I")
    public static int[] field667 = new int[50];

    @OriginalMember(owner = "client!di", name = "z", descriptor = "B")
    public byte field662;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "Leg;")
    public class37 field668;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "Leg;")
    public class37 field669;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Leg;IZ)V")
    public static final void method277(class37 arg0, int arg1, boolean arg2) {
        class37 var3 = arg0.method251((byte) -79);
        if (arg1 != -1) {
            return;
        }
        field664++;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class45.field704; var6++) {
            class241 var9 = class9.method52(true, var6);
            if ((!arg2 || var9.field4276) && var9.field4290 == -1 && var9.field4305 == -1 && var9.field4351 == 0 && var9.field4325.method251((byte) -83).method220(var3, (byte) 87) != -1) {
                if (var5 >= 250) {
                    class73.field1157 = null;
                    class288.field5069 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class73.field1157 = var4;
        class127.field2128 = 0;
        class288.field5069 = var5;
        class37[] var7 = new class37[class288.field5069];
        for (int var8 = 0; var8 < class288.field5069; var8++) {
            var7[var8] = class9.method52(true, var4[var8]).field4325;
        }
        class102.method684(6388, var7, class73.field1157);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method278(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field663++;
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg1 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (var9 != 0) {
            int var13 = class76.field1192[var9];
            var11 = -arg4 * var13 >> 16;
            int var14 = class76.field1189[var9];
            var12 = arg4 * var14 >> 16;
        }
        int var15 = 25 / ((-arg5 - 52) / 62);
        if (var8 != 0) {
            int var16 = class76.field1189[var8];
            int var17 = class76.field1192[var8];
            var10 = var12 * var17 >> 16;
            var12 = var12 * var16 >> 16;
        }
        class117.field1990 = arg3;
        class137.field2338 = arg6 - var11;
        class159.field2655 = arg1;
        class213.field3683 = arg0 - var10;
        class200.field3403 = arg7 - var12;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lva;Z)Ljh;")
    public static final class58 method279(class187 arg0, boolean arg1) {
        field659++;
        if (!arg1) {
            field666 = null;
        }
        return new class58(arg0.method1276((byte) -112), arg0.method1276((byte) 51), arg0.method1276((byte) 98), arg0.method1276((byte) -123), arg0.method1248((byte) -120), arg0.method1248((byte) -97), arg0.method1268(255));
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public static void method280(boolean arg0) {
        field660 = null;
        if (!arg0) {
            field661 = null;
            field667 = null;
            field666 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)Z")
    public static final boolean method281(byte arg0) throws IOException {
        field658++;
        if (class187.field3190 == null) {
            return false;
        }
        int var1 = class187.field3190.method430(false);
        if (var1 == 0) {
            return false;
        }
        if (class215.field3718 == -1) {
            class187.field3190.method425(1, arg0 ^ 0xEE2, class213.field3680.field3175, 0);
            class213.field3680.field3169 = 0;
            class215.field3718 = class213.field3680.method1700((byte) -97);
            var1--;
            class182.field3044 = class41.field654[class215.field3718];
        }
        if (class182.field3044 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class187.field3190.method425(1, 3714, class213.field3680.field3175, 0);
            class182.field3044 = class213.field3680.field3175[0] & 0xFF;
            var1--;
        }
        if (class182.field3044 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class187.field3190.method425(2, 3714, class213.field3680.field3175, 0);
            var1 -= 2;
            class213.field3680.field3169 = 0;
            class182.field3044 = class213.field3680.method1244(false);
        }
        if (var1 < class182.field3044) {
            return false;
        }
        class213.field3680.field3169 = 0;
        class187.field3190.method425(class182.field3044, 3714, class213.field3680.field3175, 0);
        class85.field1345 = class288.field5090;
        class109.field1772 = 0;
        class288.field5090 = class151.field2536;
        class151.field2536 = class215.field3718;
        if (class215.field3718 == 2) {
            long var2 = class213.field3680.method1295(37);
            int var4 = class213.field3680.method1244(false);
            int var5 = class213.field3680.method1268(255);
            boolean var6 = true;
            if (var2 < 0L) {
                var2 &= Long.MAX_VALUE;
                var6 = false;
            }
            class37 var7 = class179.field2989;
            if (var4 > 0) {
                var7 = class213.field3680.method1253(74);
            }
            class37 var8 = class35.method201(var2, arg0 ^ 0x62).method227(-98);
            for (int var9 = 0; var9 < class242.field4363; var9++) {
                if (class58.field941[var9] == var2) {
                    if (class77.field1203[var9] != var4) {
                        class77.field1203[var9] = var4;
                        if (var4 > 0) {
                            class274.method1839((byte) -95, 5, class179.field2989, class156.method1061((byte) -66, new class37[] { var8, class18.field248 }));
                        }
                        if (var4 == 0) {
                            class274.method1839((byte) -103, 5, class179.field2989, class156.method1061((byte) 117, new class37[] { var8, class260.field4601 }));
                        }
                    }
                    class174.field2911[var9] = var7;
                    class213.field3681[var9] = var5;
                    var8 = null;
                    class119.field2013[var9] = var6;
                    break;
                }
            }
            boolean var10 = false;
            if (var8 != null && class242.field4363 < 200) {
                class58.field941[class242.field4363] = var2;
                class22.field289[class242.field4363] = var8;
                class77.field1203[class242.field4363] = var4;
                class174.field2911[class242.field4363] = var7;
                class213.field3681[class242.field4363] = var5;
                class119.field2013[class242.field4363] = var6;
                class242.field4363++;
            }
            int var11 = class242.field4363;
            class218.field3750 = class221.field3804;
            while (var11 > 0) {
                boolean var12 = true;
                var11--;
                for (int var13 = 0; var13 < var11; var13++) {
                    if (class77.field1203[var13] != class74.field1164 && class77.field1203[var13 + 1] == class74.field1164 || class77.field1203[var13] == 0 && class77.field1203[var13 + 1] != 0) {
                        var12 = false;
                        int var14 = class77.field1203[var13];
                        class77.field1203[var13] = class77.field1203[var13 + 1];
                        class77.field1203[var13 + 1] = var14;
                        class37 var15 = class174.field2911[var13];
                        class174.field2911[var13] = class174.field2911[var13 + 1];
                        class174.field2911[var13 + 1] = var15;
                        class37 var16 = class22.field289[var13];
                        class22.field289[var13] = class22.field289[var13 + 1];
                        class22.field289[var13 + 1] = var16;
                        long var17 = class58.field941[var13];
                        class58.field941[var13] = class58.field941[var13 + 1];
                        class58.field941[var13 + 1] = var17;
                        int var19 = class213.field3681[var13];
                        class213.field3681[var13] = class213.field3681[var13 + 1];
                        class213.field3681[var13 + 1] = var19;
                        boolean var20 = class119.field2013[var13];
                        class119.field2013[var13] = class119.field2013[var13 + 1];
                        class119.field2013[var13 + 1] = var20;
                    }
                }
                if (var12) {
                    break;
                }
            }
            class215.field3718 = -1;
            return true;
        } else if (class215.field3718 == 238) {
            int var21 = class213.field3680.method1260(-4);
            int var22 = class213.field3680.method1286(arg0 - 88);
            int var23 = class213.field3680.method1286(arg0 ^ 0x68);
            if (class184.method1233(var23, arg0 ^ 0x61)) {
                class55.method361(var22, var21, -99);
            }
            class215.field3718 = -1;
            return true;
        } else if (class215.field3718 == 124) {
            int var24 = class213.field3680.method1286(8);
            int var25 = class213.field3680.method1244(false);
            class25.field355 = var24;
            class10.field166 = var25;
            class256.method1744(19044);
            class215.field3718 = -1;
            return true;
        } else if (class215.field3718 == 138) {
            int var26 = class213.field3680.method1286(arg0 ^ 0x68);
            if (var26 == 65535) {
                var26 = -1;
            }
            class10.method69(var26, (byte) 78);
            class215.field3718 = -1;
            return true;
        } else if (class215.field3718 == 162) {
            int var27 = class213.field3680.method1263(true);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = class213.field3680.method1287(-1126);
            class48.method316((byte) -117, var27, var28);
            class215.field3718 = -1;
            return true;
        } else if (class215.field3718 == 151) {
            long var29 = class213.field3680.method1295(60);
            class213.field3680.method1269(arg0 + 159);
            long var31 = class213.field3680.method1295(arg0 ^ 0xF);
            long var33 = (long) class213.field3680.method1244(false);
            long var35 = (long) class213.field3680.method1248((byte) -117);
            int var37 = class213.field3680.method1268(255);
            long var38 = (var33 << 32) + var35;
            boolean var40 = false;
            int var41 = 0;
            label1111: while (true) {
                if (var41 >= 100) {
                    if (var37 <= 1) {
                        if ((!class96.field1505 || class203.field3474) && !class171.field2880) {
                            for (int var42 = 0; var42 < class62.field1028; var42++) {
                                if (class68.field1068[var42] == var29) {
                                    var40 = true;
                                    break label1111;
                                }
                            }
                        } else {
                            var40 = true;
                        }
                    }
                    break;
                }
                if (class181.field3025[var41] == var38) {
                    var40 = true;
                    break;
                }
                var41++;
            }
            if (!var40 && class77.field1205 == 0) {
                class181.field3025[class154.field2583] = var38;
                class154.field2583 = (class154.field2583 + 1) % 100;
                class37 var43 = class183.method1225(class176.method1176(class213.field3680, 10310).method252(arg0 ^ 0x62));
                if (var37 == 2 || var37 == 3) {
                    class252.method1721(class35.method201(var31, 2).method227(-98), 9, var43, arg0 + 18, class156.method1061((byte) 118, new class37[] { class257.field4574, class35.method201(var29, arg0 ^ 0x62).method227(-98) }));
                } else if (var37 == 1) {
                    class252.method1721(class35.method201(var31, 2).method227(-98), 9, var43, 102, class156.method1061((byte) 52, new class37[] { class85.field1343, class35.method201(var29, 2).method227(-98) }));
                } else {
                    class252.method1721(class35.method201(var31, 2).method227(-98), 9, var43, 112, class35.method201(var29, 2).method227(-98));
                }
            }
            class215.field3718 = -1;
            return true;
        } else if (class215.field3718 == 206) {
            class289.method1937(true, class182.field3044, class177.field2957, class213.field3680);
            class215.field3718 = -1;
            return true;
        } else if (class215.field3718 == 25) {
            int var44 = class213.field3680.method1244(false);
            int var45 = class213.field3680.method1282(255);
            int var46 = class213.field3680.method1290((byte) 90);
            if (var44 == 65535) {
                var44 = -1;
            }
            if (class184.method1233(var45, 1)) {
                class288.method1929(var44, 2, var46, (byte) -82);
            }
            class215.field3718 = -1;
            return true;
        } else if (class215.field3718 == 120) {
            int var47 = class213.field3680.method1290((byte) 90);
            int var48 = class213.field3680.method1244(false);
            if (var47 < -70000) {
                var48 += 32768;
            }
            class237 var49;
            if (var47 >= 0) {
                var49 = class156.method1066(-108, var47);
            } else {
                var49 = null;
            }
            while (class213.field3680.field3169 < class182.field3044) {
                int var50 = class213.field3680.method1246(true);
                int var51 = class213.field3680.method1244(false);
                int var52 = 0;
                if (var51 != 0) {
                    var52 = class213.field3680.method1268(255);
                    if (var52 == 255) {
                        var52 = class213.field3680.method1290((byte) 90);
                    }
                }
                if (var49 != null && var50 >= 0 && var50 < var49.field4094.length) {
                    var49.field4094[var50] = var51;
                    var49.field4123[var50] = var52;
                }
                class219.method1534(arg0 - 13306, var52, var50, var48, var51 - 1);
            }
            if (var49 != null) {
                class121.method856(24665, var49);
            }
            class191.method1317((byte) 73);
            class180.field2994[class96.method626(class20.field267++, 31)] = class96.method626(var48, 32767);
            class215.field3718 = -1;
            return true;
        } else if (class215.field3718 == 75) {
            if (class182.field3044 == 0) {
                class200.field3399 = class62.field1009;
            } else {
                class200.field3399 = class213.field3680.method1253(-79);
            }
            class215.field3718 = -1;
            return true;
        } else if (class215.field3718 == 143) {
            class62.field1028 = class182.field3044 / 8;
            for (int var53 = 0; var53 < class62.field1028; var53++) {
                class68.field1068[var53] = class213.field3680.method1295(89);
                class244.field4399[var53] = class35.method201(class68.field1068[var53], 2);
            }
            class218.field3750 = class221.field3804;
            class215.field3718 = -1;
            return true;
        } else if (class215.field3718 == 80) {
            class191.method1317((byte) 73);
            class243.field4370 = class213.field3680.method1268(255);
            class215.field3718 = -1;
            class280.field4950 = class221.field3804;
            return true;
        } else {
            if (arg0 != 96) {
                method280(false);
            }
            if (class215.field3718 == 220) {
                long var54 = class213.field3680.method1295(arg0 - 16);
                long var56 = (long) class213.field3680.method1244(false);
                long var58 = (long) class213.field3680.method1248((byte) 54);
                boolean var60 = false;
                long var61 = (var56 << 32) + var58;
                int var63 = class213.field3680.method1268(255);
                int var64 = 0;
                label1151: while (true) {
                    if (var64 >= 100) {
                        if (var63 <= 1) {
                            if ((!class96.field1505 || class203.field3474) && !class171.field2880) {
                                for (int var65 = 0; var65 < class62.field1028; var65++) {
                                    if (class68.field1068[var65] == var54) {
                                        var60 = true;
                                        break label1151;
                                    }
                                }
                            } else {
                                var60 = true;
                            }
                        }
                        break;
                    }
                    if (class181.field3025[var64] == var61) {
                        var60 = true;
                        break;
                    }
                    var64++;
                }
                if (!var60 && class77.field1205 == 0) {
                    class181.field3025[class154.field2583] = var61;
                    class154.field2583 = (class154.field2583 + 1) % 100;
                    class37 var66 = class183.method1225(class176.method1176(class213.field3680, 10310).method252(2));
                    if (var63 == 2 || var63 == 3) {
                        class274.method1839((byte) -43, 7, class156.method1061((byte) -59, new class37[] { class257.field4574, class35.method201(var54, 2).method227(-98) }), var66);
                    } else if (var63 == 1) {
                        class274.method1839((byte) -66, 7, class156.method1061((byte) -88, new class37[] { class85.field1343, class35.method201(var54, 2).method227(arg0 ^ 0xFFFFFFFE) }), var66);
                    } else {
                        class274.method1839((byte) -111, 3, class35.method201(var54, 2).method227(-98), var66);
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 60 || class215.field3718 == 115 || class215.field3718 == 73 || class215.field3718 == 9 || class215.field3718 == 156 || class215.field3718 == 34 || class215.field3718 == 31 || class215.field3718 == 110 || class215.field3718 == 189 || class215.field3718 == 192 || class215.field3718 == 215 || class215.field3718 == 22) {
                class181.method1196(-73);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 242) {
                class96.field1501 = class213.field3680.method1286(arg0 - 88) * 30;
                class215.field3718 = -1;
                class280.field4950 = class221.field3804;
                return true;
            } else if (class215.field3718 == 125) {
                class133.method947(true, arg0 ^ 0x16);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 181) {
                int var67 = class213.field3680.method1277(65280);
                int var68 = class213.field3680.method1286(8);
                int var69 = class213.field3680.method1286(8);
                if (class184.method1233(var69, 1)) {
                    class275.method1857(var68, (byte) 102, var67);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 84) {
                int var70 = class213.field3680.method1277(65280);
                int var71 = class213.field3680.method1277(arg0 + 65184);
                int var72 = class213.field3680.method1286(8);
                if (class184.method1233(var72, arg0 - 95)) {
                    class190 var73 = (class190) class120.field2022.method992((byte) 125, (long) var71);
                    class190 var74 = (class190) class120.field2022.method992((byte) 125, (long) var70);
                    if (var74 != null) {
                        class256.method1746(var74, var73 == null || var73.field3259 != var74.field3259, (byte) 76);
                    }
                    if (var73 != null) {
                        var73.method441(16773377);
                        class120.field2022.method986(var73, (long) var70, -1);
                    }
                    class237 var75 = class156.method1066(-102, var71);
                    if (var75 != null) {
                        class121.method856(24665, var75);
                    }
                    class237 var76 = class156.method1066(-81, var70);
                    if (var76 != null) {
                        class121.method856(24665, var76);
                        class272.method1823(arg0 - 18, true, var76);
                    }
                    if (class234.field4044 != -1) {
                        class175.method1175(-499336730, class234.field4044, 1);
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 88) {
                int var77 = class213.field3680.method1244(false);
                class204.method1421(var77, (byte) 42);
                class180.field2994[class96.method626(class20.field267++, 31)] = class96.method626(var77, 32767);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 224) {
                long var78 = class213.field3680.method1295(112);
                int var80 = class213.field3680.method1244(false);
                boolean var81 = false;
                if ((var78 & Long.MIN_VALUE) != 0L) {
                    var81 = true;
                }
                byte var82 = class213.field3680.method1269(arg0 + 159);
                if (var81) {
                    if (class260.field4594 == 0) {
                        class215.field3718 = -1;
                        return true;
                    }
                    long var83 = var78 & Long.MAX_VALUE;
                    boolean var85 = false;
                    int var86;
                    for (var86 = 0; var86 < class260.field4594 && (class281.field4955[var86].field1027 != var83 || class281.field4955[var86].field665 != var80); var86++) {
                    }
                    if (var86 < class260.field4594) {
                        while (var86 < class260.field4594 - 1) {
                            class281.field4955[var86] = class281.field4955[var86 + 1];
                            var86++;
                        }
                        class260.field4594--;
                        class281.field4955[class260.field4594] = null;
                    }
                } else {
                    class37 var87 = class213.field3680.method1253(-98);
                    class42 var88 = new class42();
                    var88.field1027 = var78;
                    var88.field668 = class35.method201(var88.field1027, 2);
                    var88.field662 = var82;
                    var88.field669 = var87;
                    var88.field665 = var80;
                    int var89;
                    for (var89 = class260.field4594 - 1; var89 >= 0; var89--) {
                        int var90 = class281.field4955[var89].field668.method221((byte) -113, var88.field668);
                        if (var90 == 0) {
                            class281.field4955[var89].field665 = var80;
                            class281.field4955[var89].field662 = var82;
                            class281.field4955[var89].field669 = var87;
                            class105.field1631 = class221.field3804;
                            class215.field3718 = -1;
                            if (class10.field165 == var78) {
                                class239.field4257 = var82;
                            }
                            return true;
                        }
                        if (var90 < 0) {
                            break;
                        }
                    }
                    if (class281.field4955.length <= class260.field4594) {
                        class215.field3718 = -1;
                        return true;
                    }
                    for (int var91 = class260.field4594 - 1; var91 > var89; var91--) {
                        class281.field4955[var91 + 1] = class281.field4955[var91];
                    }
                    if (class260.field4594 == 0) {
                        class281.field4955 = new class42[100];
                    }
                    class281.field4955[var89 + 1] = var88;
                    class260.field4594++;
                    if (class10.field165 == var78) {
                        class239.field4257 = var82;
                    }
                }
                class215.field3718 = -1;
                class105.field1631 = class221.field3804;
                return true;
            } else if (class215.field3718 == 15) {
                int var92 = class213.field3680.method1268(255);
                int var93 = class213.field3680.method1268(arg0 + 159);
                int var94 = class213.field3680.method1268(255);
                int var95 = class213.field3680.method1268(255);
                int var96 = class213.field3680.method1244(false);
                class69.field1102[var92] = true;
                class241.field4308[var92] = var93;
                class286.field5051[var92] = var94;
                class225.field3873[var92] = var95;
                class115.field1964[var92] = var96;
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 35) {
                class37 var97 = class213.field3680.method1253(30);
                if (var97.method233((byte) 112, class44.field681)) {
                    class37 var133 = var97.method247(0, var97.method220(class31.field459, (byte) 103), arg0 ^ 0x60);
                    long var134 = var133.method217((byte) -102);
                    boolean var136 = false;
                    for (int var137 = 0; var137 < class62.field1028; var137++) {
                        if (class68.field1068[var137] == var134) {
                            var136 = true;
                            break;
                        }
                    }
                    if (!var136 && class77.field1205 == 0) {
                        class274.method1839((byte) -78, 4, var133, class146.field2485);
                    }
                } else if (var97.method233((byte) 103, class111.field1849)) {
                    class37 var127 = var97.method247(0, var97.method220(class31.field459, (byte) 82), arg0 ^ 0x60);
                    long var128 = var127.method217((byte) -102);
                    boolean var130 = false;
                    for (int var131 = 0; var131 < class62.field1028; var131++) {
                        if (class68.field1068[var131] == var128) {
                            var130 = true;
                            break;
                        }
                    }
                    if (!var130 && class77.field1205 == 0) {
                        class37 var132 = var97.method247(var97.method220(class31.field459, (byte) 76) + 1, var97.method222((byte) 104) + -9, 0);
                        class274.method1839((byte) -102, 8, var127, var132);
                    }
                } else if (var97.method233((byte) 125, class118.field2009)) {
                    class37 var98 = var97.method247(0, var97.method220(class31.field459, (byte) 93), 0);
                    long var99 = var98.method217((byte) -102);
                    boolean var101 = false;
                    for (int var102 = 0; var102 < class62.field1028; var102++) {
                        if (class68.field1068[var102] == var99) {
                            var101 = true;
                            break;
                        }
                    }
                    if (!var101 && class77.field1205 == 0) {
                        class274.method1839((byte) -128, 10, var98, class179.field2989);
                    }
                } else if (var97.method233((byte) 114, class203.field3477)) {
                    class37 var126 = var97.method247(0, var97.method220(class203.field3477, (byte) 118), 0);
                    class274.method1839((byte) -59, 11, class179.field2989, var126);
                } else if (var97.method233((byte) 98, class80.field1253)) {
                    class37 var125 = var97.method247(0, var97.method220(class80.field1253, (byte) 125), arg0 ^ 0x60);
                    if (class77.field1205 == 0) {
                        class274.method1839((byte) -89, 12, class179.field2989, var125);
                    }
                } else if (var97.method233((byte) 99, class167.field2768)) {
                    class37 var103 = var97.method247(0, var97.method220(class167.field2768, (byte) 126), arg0 - 96);
                    if (class77.field1205 == 0) {
                        class274.method1839((byte) -127, 13, class179.field2989, var103);
                    }
                } else if (var97.method233((byte) 126, class119.field2015)) {
                    class37 var120 = var97.method247(0, var97.method220(class31.field459, (byte) 118), 0);
                    boolean var121 = false;
                    long var122 = var120.method217((byte) -102);
                    for (int var124 = 0; var124 < class62.field1028; var124++) {
                        if (class68.field1068[var124] == var122) {
                            var121 = true;
                            break;
                        }
                    }
                    if (!var121 && class77.field1205 == 0) {
                        class274.method1839((byte) -79, 14, var120, class179.field2989);
                    }
                } else if (var97.method233((byte) 106, class159.field2660)) {
                    class37 var104 = var97.method247(0, var97.method220(class31.field459, (byte) 101), 0);
                    long var105 = var104.method217((byte) -102);
                    boolean var107 = false;
                    for (int var108 = 0; var108 < class62.field1028; var108++) {
                        if (class68.field1068[var108] == var105) {
                            var107 = true;
                            break;
                        }
                    }
                    if (!var107 && class77.field1205 == 0) {
                        class274.method1839((byte) -101, 15, var104, class179.field2989);
                    }
                } else if (var97.method233((byte) 93, class25.field359)) {
                    class37 var109 = var97.method247(0, var97.method220(class31.field459, (byte) 96), 0);
                    long var110 = var109.method217((byte) -102);
                    boolean var112 = false;
                    for (int var113 = 0; var113 < class62.field1028; var113++) {
                        if (class68.field1068[var113] == var110) {
                            var112 = true;
                            break;
                        }
                    }
                    if (!var112 && class77.field1205 == 0) {
                        class274.method1839((byte) -108, 16, var109, class179.field2989);
                    }
                } else if (var97.method233((byte) 127, class47.field744)) {
                    class37 var114 = var97.method247(0, var97.method220(class31.field459, (byte) 116), arg0 ^ 0x60);
                    boolean var115 = false;
                    long var116 = var114.method217((byte) -102);
                    for (int var118 = 0; var118 < class62.field1028; var118++) {
                        if (class68.field1068[var118] == var116) {
                            var115 = true;
                            break;
                        }
                    }
                    if (!var115 && class77.field1205 == 0) {
                        class37 var119 = var97.method247(var97.method220(class31.field459, (byte) 76) + 1, var97.method222((byte) 116) + -9, 0);
                        class274.method1839((byte) -55, 21, var114, var119);
                    }
                } else {
                    class274.method1839((byte) -90, 0, class179.field2989, var97);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 209) {
                int var138 = class213.field3680.method1260(-4);
                int var139 = class213.field3680.method1282(arg0 + 159);
                class87.method582(var139, var138, (byte) -110);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 237) {
                int var140 = class213.field3680.method1278(true);
                int var141 = class213.field3680.method1244(false);
                class87.method582(var141, var140, (byte) -117);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 14) {
                int var142 = class213.field3680.method1260(-4);
                int var143 = class213.field3680.method1255(false);
                int var144 = var143 >> 2;
                int var145 = var142 >> 14 & 0x3FFF;
                int var146 = var143 & 0x3;
                int var147 = var142 & 0x3FFF;
                int var148 = var142 >> 28 & 0x3;
                int var149 = class108.field1724[var144];
                int var150 = class213.field3680.method1286(8);
                if (var150 == 65535) {
                    var150 = -1;
                }
                int var151 = var145 - class40.field642;
                int var152 = var147 - class144.field2456;
                class289.method1940(var152, (byte) -118, var146, var150, var144, var151, var149, var148);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 155) {
                class9.method55((byte) 126);
                class191.method1317((byte) 73);
                class215.field3718 = -1;
                class117.field1995 += 32;
                return true;
            } else if (class215.field3718 == 244) {
                for (int var153 = 0; var153 < class98.field1526.length; var153++) {
                    if (class98.field1526[var153] != null) {
                        class98.field1526[var153].field1800 = -1;
                    }
                }
                for (int var154 = 0; var154 < class55.field833.length; var154++) {
                    if (class55.field833[var154] != null) {
                        class55.field833[var154].field1800 = -1;
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 185) {
                int var155 = class213.field3680.method1244(false);
                class37 var156 = class213.field3680.method1253(arg0 ^ 0xFFFFFFDC);
                int var157 = class213.field3680.method1263(true);
                if (class184.method1233(var155, arg0 - 95)) {
                    class129.method916(var157, var156, false);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 69) {
                class148.field2505 = class213.field3680.method1278(true);
                class168.field2816 = class213.field3680.method1278(true);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 203) {
                class105.field1631 = class221.field3804;
                long var158 = class213.field3680.method1295(arg0 - 8);
                if (var158 == 0L) {
                    class281.field4955 = null;
                    class260.field4594 = 0;
                    class63.field1038 = null;
                    class81.field1278 = null;
                    class215.field3718 = -1;
                    return true;
                }
                long var160 = class213.field3680.method1295(arg0 ^ 0x27);
                class81.field1278 = class35.method201(var160, 2);
                class63.field1038 = class35.method201(var158, 2);
                class131.field2191 = class213.field3680.method1269(arg0 ^ 0x9F);
                int var162 = class213.field3680.method1268(255);
                if (var162 == 255) {
                    class215.field3718 = -1;
                    return true;
                }
                class260.field4594 = var162;
                class42[] var163 = new class42[100];
                for (int var164 = 0; var164 < class260.field4594; var164++) {
                    var163[var164] = new class42();
                    var163[var164].field1027 = class213.field3680.method1295(112);
                    var163[var164].field668 = class35.method201(var163[var164].field1027, 2);
                    var163[var164].field665 = class213.field3680.method1244(false);
                    var163[var164].field662 = class213.field3680.method1269(255);
                    var163[var164].field669 = class213.field3680.method1253(-67);
                    if (class10.field165 == var163[var164].field1027) {
                        class239.field4257 = var163[var164].field662;
                    }
                }
                boolean var165 = false;
                int var166 = class260.field4594;
                while (var166 > 0) {
                    boolean var167 = true;
                    var166--;
                    for (int var168 = 0; var168 < var166; var168++) {
                        if (var163[var168].field668.method221((byte) 78, var163[var168 + 1].field668) > 0) {
                            var167 = false;
                            class42 var169 = var163[var168];
                            var163[var168] = var163[var168 + 1];
                            var163[var168 + 1] = var169;
                        }
                    }
                    if (var167) {
                        break;
                    }
                }
                class281.field4955 = var163;
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 205) {
                int var170 = class213.field3680.method1260(-4);
                class237 var171 = class156.method1066(-103, var170);
                for (int var172 = 0; var172 < var171.field4094.length; var172++) {
                    var171.field4094[var172] = -1;
                    var171.field4094[var172] = 0;
                }
                class121.method856(24665, var171);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 91) {
                for (int var173 = 0; var173 < class153.field2571.length; var173++) {
                    if (class52.field806[var173] != class153.field2571[var173]) {
                        class153.field2571[var173] = class52.field806[var173];
                        class86.method568(13695, var173);
                        class215.field3715[class96.method626(class117.field1995++, 31)] = var173;
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 79) {
                int var174 = class213.field3680.method1271(-3608);
                class187.field3198 = class177.field2957.method1436((byte) 79, var174);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 57) {
                int var175 = class213.field3680.method1260(-4);
                int var176 = class213.field3680.method1244(false);
                if (class184.method1233(var176, arg0 - 95)) {
                    int var177 = 0;
                    if (class82.field1285.field3217 != null) {
                        var177 = class82.field1285.field3217.method1904((byte) 66);
                    }
                    class288.method1929(var177, 3, var175, (byte) -82);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 85) {
                int var178 = class213.field3680.method1282(255);
                byte var179 = class213.field3680.method1270(0);
                class153.method1046(var178, (byte) -32, var179);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 26) {
                class288.field5082 = class213.field3680.method1268(arg0 ^ 0x9F);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 21) {
                int var180 = class213.field3680.method1244(false);
                int var181 = class213.field3680.method1290((byte) 90);
                if (class184.method1233(var180, 1)) {
                    class190 var182 = (class190) class120.field2022.method992((byte) 125, (long) var181);
                    if (var182 != null) {
                        class256.method1746(var182, true, (byte) 76);
                    }
                    if (class224.field3840 != null) {
                        class121.method856(24665, class224.field3840);
                        class224.field3840 = null;
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 253) {
                int var183 = class213.field3680.method1290((byte) 90);
                int var184 = class213.field3680.method1263(true);
                int var185 = class213.field3680.method1277(65280);
                if (var184 == 65535) {
                    var184 = -1;
                }
                int var186 = class213.field3680.method1282(255);
                if (class184.method1233(var186, arg0 ^ 0x61)) {
                    class237 var187 = class156.method1066(-94, var185);
                    if (var187.field4129) {
                        class198.method1380(var185, var183, var184, (byte) 65);
                        class241 var188 = class9.method52(true, var184);
                        class289.method1938(8, var188.field4352, var188.field4343, var185, var188.field4289);
                        class62.method440(var188.field4348, false, var188.field4339, var188.field4330, var185);
                    } else if (var184 == -1) {
                        class215.field3718 = -1;
                        var187.field4119 = 0;
                        return true;
                    } else {
                        class241 var189 = class9.method52(true, var184);
                        var187.field4085 = var184;
                        var187.field4119 = 4;
                        var187.field4107 = var189.field4343;
                        var187.field4192 = var189.field4352 * 100 / var183;
                        var187.field4145 = var189.field4289;
                        class121.method856(24665, var187);
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 90) {
                int var190 = class213.field3680.method1277(65280);
                int var191 = class213.field3680.method1286(8);
                int var192 = class213.field3680.method1263(true);
                if (class184.method1233(var192, 1)) {
                    class223.method1553(var191, var190, 96);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 249) {
                int var193 = class213.field3680.method1263(true);
                int var194 = class213.field3680.method1263(true);
                class37 var195 = class213.field3680.method1253(-93);
                if (class184.method1233(var194, 1)) {
                    class129.method916(var193, var195, false);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 102) {
                class241.method1658(0);
                class215.field3718 = -1;
                return false;
            } else if (class215.field3718 == 93) {
                class133.method947(false, 96);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 204) {
                int var196 = class213.field3680.method1276((byte) 37);
                int var197 = class213.field3680.method1282(255);
                int var198 = class213.field3680.method1260(arg0 - 100);
                if (class184.method1233(var197, 1)) {
                    class152.method1038(var196, var198, (byte) -66);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 148) {
                int var199 = class213.field3680.method1268(255);
                int var200 = class213.field3680.method1268(255);
                int var201 = class213.field3680.method1244(false);
                int var202 = class213.field3680.method1268(255);
                int var203 = class213.field3680.method1268(255);
                class236.method1616(var199, var200, var203, (byte) -126, var201, var202);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 193) {
                long var204 = class213.field3680.method1295(arg0 ^ 0x1A);
                long var206 = (long) class213.field3680.method1244(false);
                boolean var208 = false;
                long var209 = (long) class213.field3680.method1248((byte) 101);
                int var211 = class213.field3680.method1268(255);
                int var212 = class213.field3680.method1244(false);
                long var213 = (var206 << 32) + var209;
                int var215 = 0;
                label1309: while (true) {
                    if (var215 >= 100) {
                        if (var211 <= 1) {
                            for (int var216 = 0; var216 < class62.field1028; var216++) {
                                if (class68.field1068[var216] == var204) {
                                    var208 = true;
                                    break label1309;
                                }
                            }
                        }
                        break;
                    }
                    if (class181.field3025[var215] == var213) {
                        var208 = true;
                        break;
                    }
                    var215++;
                }
                if (!var208 && class77.field1205 == 0) {
                    class181.field3025[class154.field2583] = var213;
                    class154.field2583 = (class154.field2583 + 1) % 100;
                    class37 var217 = class1.method2(var212, (byte) -81).method175(class213.field3680, 1);
                    if (var211 == 2) {
                        class102.method686(var212, class156.method1061((byte) -65, new class37[] { class257.field4574, class35.method201(var204, arg0 ^ 0x62).method227(-98) }), (byte) 51, (class37) null, 18, var217);
                    } else if (var211 == 1) {
                        class102.method686(var212, class156.method1061((byte) -128, new class37[] { class85.field1343, class35.method201(var204, 2).method227(-98) }), (byte) 51, (class37) null, 18, var217);
                    } else {
                        class102.method686(var212, class35.method201(var204, 2).method227(-98), (byte) 51, (class37) null, 18, var217);
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 118) {
                if (class234.field4044 != -1) {
                    class175.method1175(-499336730, class234.field4044, 0);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 140) {
                int var218 = class213.field3680.method1263(true);
                int var219 = class213.field3680.method1260(-4);
                int var220 = class213.field3680.method1257(-2);
                int var221 = class213.field3680.method1276((byte) 68);
                if (class184.method1233(var218, 1)) {
                    class227.method1579(var219, var221, (byte) -119, var220);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 177) {
                int var222 = class213.field3680.method1268(arg0 ^ 0x9F);
                int var223 = class213.field3680.method1268(255);
                int var224 = class213.field3680.method1244(false);
                int var225 = class213.field3680.method1268(arg0 + 159);
                int var226 = class213.field3680.method1268(255);
                class241.method1653(var224, var225, 100, var226, var222, true, var223);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 76) {
                int var227 = class213.field3680.method1268(255);
                if (class213.field3680.method1268(255) == 0) {
                    class22.field284[var227] = new class225();
                } else {
                    class213.field3680.field3169--;
                    class22.field284[var227] = new class225(class213.field3680);
                }
                class215.field3718 = -1;
                class8.field143 = class221.field3804;
                return true;
            } else if (class215.field3718 == 225) {
                int var228 = class213.field3680.method1260(arg0 ^ 0xFFFFFF9C);
                int var229 = class213.field3680.method1244(false);
                int var230 = class213.field3680.method1244(false);
                int var231 = class213.field3680.method1263(true);
                if (var228 >> 30 != 0) {
                    int var240 = (var228 >> 14 & 0x3FFF) - class40.field642;
                    int var241 = (var228 & 0x3EF2291D) >> 28;
                    int var242 = (var228 & 0x3FFF) - class144.field2456;
                    if (var240 >= 0 && var242 >= 0 && var240 < 104 && var242 < 104) {
                        int var243 = var240 * 128 + 64;
                        int var244 = var242 * 128 + 64;
                        class113 var245 = new class113(var231, var241, var243, var244, class262.method1768(var241, var243, var244, (byte) -93) - var230, var229, class72.field1146);
                        class281.field4956.method1574(new class268(var245), 0);
                    }
                } else if ((var228 >> 29) != 0) {
                    int var236 = var228 & 0xFFFF;
                    class163 var237 = class55.field833[var236];
                    if (var237 != null) {
                        var237.field1814 = var231;
                        var237.field1769 = 0;
                        var237.field1811 = var230;
                        var237.field1773 = 0;
                        var237.field1821 = class72.field1146 + var229;
                        if (class72.field1146 < var237.field1821) {
                            var237.field1773 = -1;
                        }
                        if (var237.field1814 == 65535) {
                            var237.field1814 = -1;
                        }
                        if (var237.field1814 != -1 && class72.field1146 == var237.field1821) {
                            int var238 = class79.method536(-73, var237.field1814).field3947;
                            if (var238 != -1) {
                                class2 var239 = class186.method1242(0, var238);
                                if (var239 != null && var239.field24 != null) {
                                    class182.method1201(var237.field1799, var239, 255, var237.field1793, false, 0);
                                }
                            }
                        }
                    }
                } else if (var228 >> 28 != 0) {
                    int var232 = var228 & 0xFFFF;
                    class188 var233;
                    if (class116.field1986 == var232) {
                        var233 = class82.field1285;
                    } else {
                        var233 = class98.field1526[var232];
                    }
                    if (var233 != null) {
                        var233.field1811 = var230;
                        var233.field1814 = var231;
                        if (var233.field1814 == 65535) {
                            var233.field1814 = -1;
                        }
                        var233.field1773 = 0;
                        var233.field1769 = 0;
                        var233.field1821 = class72.field1146 + var229;
                        if (var233.field1821 > class72.field1146) {
                            var233.field1773 = -1;
                        }
                        if (var233.field1814 != -1 && class72.field1146 == var233.field1821) {
                            int var234 = class79.method536(-64, var233.field1814).field3947;
                            if (var234 != -1) {
                                class2 var235 = class186.method1242(0, var234);
                                if (var235 != null && var235.field24 != null) {
                                    class182.method1201(var233.field1799, var235, arg0 + 159, var233.field1793, class82.field1285 == var233, 0);
                                }
                            }
                        }
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 247) {
                int var246 = class213.field3680.method1278(true);
                int var247 = class213.field3680.method1250(8);
                int var248 = class213.field3680.method1250(arg0 ^ 0x4);
                class237.field4140 = var246 >> 1;
                class82.field1285.method1301(var248, var247, (var246 & 0x1) == 1, 4484);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 66) {
                int var249 = class213.field3680.method1286(8);
                int var250 = class213.field3680.method1244(false);
                int var251 = class213.field3680.method1244(false);
                int var252 = class213.field3680.method1271(-3608);
                if (class184.method1233(var249, 1)) {
                    class288.method1929(var251 << 16 | var250, 7, var252, (byte) -82);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 70) {
                long var253 = class213.field3680.method1295(60);
                int var255 = class213.field3680.method1244(false);
                class37 var256 = class1.method2(var255, (byte) 70).method175(class213.field3680, 1);
                class102.method686(var255, class35.method201(var253, 2).method227(-98), (byte) 51, (class37) null, 19, var256);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 213) {
                class272.method1824((byte) -103);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 250) {
                int var257 = class213.field3680.method1244(false);
                int var258 = class213.field3680.method1268(255);
                if (var257 == 65535) {
                    var257 = -1;
                }
                int var259 = class213.field3680.method1244(false);
                class79.method534(var258, (byte) 111, var259, var257);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 190) {
                int var260 = class213.field3680.method1244(false);
                int var261 = class213.field3680.method1282(255);
                if (var261 == 65535) {
                    var261 = -1;
                }
                int var262 = class213.field3680.method1290((byte) 90);
                if (class184.method1233(var260, 1)) {
                    class288.method1929(var261, 1, var262, (byte) -82);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 131) {
                class69.field1093 = class213.field3680.method1268(255);
                class215.field3718 = -1;
                class218.field3750 = class221.field3804;
                return true;
            } else if (class215.field3718 == 103) {
                int var263 = class213.field3680.method1268(255);
                class134 var264 = new class134();
                int var265 = var263 >> 6;
                var264.field2331 = var263 & 0x3F;
                var264.field2319 = class213.field3680.method1268(255);
                if (var264.field2319 >= 0 && var264.field2319 < class89.field1425.length) {
                    if (var264.field2331 == 1 || var264.field2331 == 10) {
                        var264.field2335 = class213.field3680.method1244(false);
                        class213.field3680.field3169 += 3;
                    } else if (var264.field2331 >= 2 && var264.field2331 <= 6) {
                        if (var264.field2331 == 2) {
                            var264.field2317 = 64;
                            var264.field2328 = 64;
                        }
                        if (var264.field2331 == 3) {
                            var264.field2328 = 0;
                            var264.field2317 = 64;
                        }
                        if (var264.field2331 == 4) {
                            var264.field2317 = 64;
                            var264.field2328 = 128;
                        }
                        if (var264.field2331 == 5) {
                            var264.field2317 = 0;
                            var264.field2328 = 64;
                        }
                        if (var264.field2331 == 6) {
                            var264.field2328 = 64;
                            var264.field2317 = 128;
                        }
                        var264.field2331 = 2;
                        var264.field2330 = class213.field3680.method1244(false);
                        var264.field2324 = class213.field3680.method1244(false);
                        var264.field2334 = class213.field3680.method1268(arg0 ^ 0x9F);
                    }
                    var264.field2326 = class213.field3680.method1244(false);
                    if (var264.field2326 == 65535) {
                        var264.field2326 = -1;
                    }
                    class61.field1001[var265] = var264;
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 168) {
                long var266 = class213.field3680.method1295(66);
                class37 var268 = class183.method1225(class176.method1176(class213.field3680, 10310).method252(arg0 ^ 0x62));
                class274.method1839((byte) -69, 6, class35.method201(var266, 2).method227(-98), var268);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 43) {
                long var269 = class213.field3680.method1295(54);
                class213.field3680.method1269(255);
                long var271 = class213.field3680.method1295(74);
                long var273 = (long) class213.field3680.method1244(false);
                long var275 = (long) class213.field3680.method1248((byte) -123);
                int var277 = class213.field3680.method1268(255);
                int var278 = class213.field3680.method1244(false);
                long var279 = (var273 << 32) + var275;
                boolean var281 = false;
                int var282 = 0;
                label1342: while (true) {
                    if (var282 >= 100) {
                        if (var277 <= 1) {
                            for (int var283 = 0; var283 < class62.field1028; var283++) {
                                if (class68.field1068[var283] == var269) {
                                    var281 = true;
                                    break label1342;
                                }
                            }
                        }
                        break;
                    }
                    if (class181.field3025[var282] == var279) {
                        var281 = true;
                        break;
                    }
                    var282++;
                }
                if (!var281 && class77.field1205 == 0) {
                    class181.field3025[class154.field2583] = var279;
                    class154.field2583 = (class154.field2583 + 1) % 100;
                    class37 var284 = class1.method2(var278, (byte) 120).method175(class213.field3680, arg0 ^ 0x61);
                    if (var277 == 2 || var277 == 3) {
                        class102.method686(var278, class156.method1061((byte) 90, new class37[] { class257.field4574, class35.method201(var269, 2).method227(-98) }), (byte) 51, class35.method201(var271, 2).method227(-98), 20, var284);
                    } else if (var277 == 1) {
                        class102.method686(var278, class156.method1061((byte) 98, new class37[] { class85.field1343, class35.method201(var269, 2).method227(-98) }), (byte) 51, class35.method201(var271, 2).method227(arg0 - 194), 20, var284);
                    } else {
                        class102.method686(var278, class35.method201(var269, 2).method227(-98), (byte) 51, class35.method201(var271, 2).method227(-98), 20, var284);
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 236) {
                int var285 = class213.field3680.method1290((byte) 90);
                int var286 = class213.field3680.method1244(false);
                if (var285 < -70000) {
                    var286 += 32768;
                }
                class237 var287;
                if (var285 < 0) {
                    var287 = null;
                } else {
                    var287 = class156.method1066(arg0 - 173, var285);
                }
                if (var287 != null) {
                    for (int var288 = 0; var288 < var287.field4094.length; var288++) {
                        var287.field4094[var288] = 0;
                        var287.field4123[var288] = 0;
                    }
                }
                class121.method853(3, var286);
                int var289 = class213.field3680.method1244(false);
                for (int var290 = 0; var290 < var289; var290++) {
                    int var291 = class213.field3680.method1268(255);
                    if (var291 == 255) {
                        var291 = class213.field3680.method1260(-4);
                    }
                    int var292 = class213.field3680.method1286(8);
                    if (var287 != null && var290 < var287.field4094.length) {
                        var287.field4094[var290] = var292;
                        var287.field4123[var290] = var291;
                    }
                    class219.method1534(-13210, var291, var290, var286, var292 - 1);
                }
                if (var287 != null) {
                    class121.method856(arg0 + 24569, var287);
                }
                class191.method1317((byte) 73);
                class180.field2994[class96.method626(31, class20.field267++)] = class96.method626(32767, var286);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 241) {
                int var293 = class213.field3680.method1278(true);
                int var294 = class213.field3680.method1268(255);
                class37 var295 = class213.field3680.method1253(8);
                if (var294 >= 1 && var294 <= 8) {
                    if (var295.method256(true, class82.field1287)) {
                        var295 = null;
                    }
                    class268.field4687[var294 - 1] = var295;
                    class50.field781[var294 - 1] = var293 == 0;
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 128) {
                byte[] var296 = new byte[class182.field3044];
                class213.field3680.method1703(var296, 0, class182.field3044, 0);
                class37 var297 = class80.method545(class182.field3044, 0, var296, (byte) -19);
                if (class71.field1114 == null && (class207.field3500 == 3 || !class207.field3506.startsWith("win") || class5.field85)) {
                    class234.method1608(var297, 4, true);
                } else {
                    class179.field2988 = true;
                    class144.field2462 = var297;
                    class123.field2070 = class177.field2957.method1424(16, new String(var297.method261((byte) -6), "ISO-8859-1"));
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 183) {
                class73.field1159 = 0;
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 201) {
                class86.method570(false);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 44) {
                int var298 = class213.field3680.method1282(arg0 + 159);
                int var299 = class213.field3680.method1255(false);
                int var300 = class213.field3680.method1286(8);
                if (class184.method1233(var298, 1)) {
                    class275.method1857(var300, (byte) 31, var299);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 119) {
                class197.method1370(class213.field3680.method1253(9), (byte) 50);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 106) {
                int var301 = class213.field3680.method1244(false);
                int var302 = class213.field3680.method1286(8);
                int var303 = class213.field3680.method1278(true);
                class163 var304 = class55.field833[var301];
                if (var304 != null) {
                    class241.method1651(var304, -119, var302, var303);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 221) {
                int var305 = class213.field3680.method1286(8);
                int var306 = class213.field3680.method1263(true);
                int var307 = class213.field3680.method1263(true);
                int var308 = class213.field3680.method1277(65280);
                if (class184.method1233(var305, 1)) {
                    class282.method1896((var307 << 16) + var306, var308, 30707);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 227) {
                class168.field2816 = class213.field3680.method1255(false);
                class148.field2505 = class213.field3680.method1278(true);
                while (class213.field3680.field3169 < class182.field3044) {
                    class215.field3718 = class213.field3680.method1268(255);
                    class181.method1196(-117);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 154) {
                int var309 = class213.field3680.method1263(true);
                int var310 = class213.field3680.method1277(65280);
                class37 var311 = class213.field3680.method1253(96);
                if (class184.method1233(var309, 1)) {
                    class132.method946(var311, 3, var310);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 197) {
                class191.method1317((byte) 73);
                class230.field3943 = class213.field3680.method1276((byte) 121);
                class280.field4950 = class221.field3804;
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 202) {
                class148.field2505 = class213.field3680.method1250(22);
                class168.field2816 = class213.field3680.method1255(false);
                for (int var312 = class148.field2505; var312 < class148.field2505 + 8; var312++) {
                    for (int var314 = class168.field2816; var314 < class168.field2816 + 8; var314++) {
                        if (class210.field3621[class237.field4140][var312][var314] != null) {
                            class210.field3621[class237.field4140][var312][var314] = null;
                            class50.method324(var314, var312, (byte) 21);
                        }
                    }
                }
                for (class81 var313 = (class81) class140.field2402.method1566(arg0 - 99); var313 != null; var313 = (class81) class140.field2402.method1570(arg0 - 93)) {
                    if (var313.field1261 >= class148.field2505 && var313.field1261 < class148.field2505 + 8 && class168.field2816 <= var313.field1272 && class168.field2816 + 8 > var313.field1272 && class237.field4140 == var313.field1260) {
                        var313.field1263 = 0;
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 191) {
                int var315 = class213.field3680.method1282(255);
                if (var315 == 65535) {
                    var315 = -1;
                }
                int var316 = class213.field3680.method1271(arg0 - 3704);
                int var317 = class213.field3680.method1263(true);
                int var318 = class213.field3680.method1290((byte) 90);
                int var319 = class213.field3680.method1282(arg0 ^ 0x9F);
                if (var319 == 65535) {
                    var319 = -1;
                }
                if (class184.method1233(var317, 1)) {
                    for (int var320 = var319; var320 <= var315; var320++) {
                        long var321 = ((long) var318 << 32) + (long) var320;
                        class62 var323 = class179.field2984.method992((byte) 125, var321);
                        if (var323 != null) {
                            var323.method441(16773377);
                        }
                        class179.field2984.method986(new class120(var316), var321, -1);
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 230) {
                int var324 = class213.field3680.method1244(false);
                int var325 = class213.field3680.method1244(false);
                int var326 = class213.field3680.method1250(21);
                if (class184.method1233(var324, 1)) {
                    if (var326 == 2) {
                        class119.method845(18327);
                    }
                    class234.field4044 = var325;
                    class214.method1521(var325, true);
                    class58.method413(-1025659988, false);
                    class202.method1405(13046, class234.field4044);
                    for (int var327 = 0; var327 < 100; var327++) {
                        class154.field2597[var327] = true;
                    }
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 23) {
                class259.method1754(false, class213.field3680);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 141) {
                int var328 = class213.field3680.method1282(255);
                int var329 = class213.field3680.method1250(arg0 - 86);
                int var330 = class213.field3680.method1244(false);
                int var331 = class213.field3680.method1277(arg0 ^ 0xFF60);
                if (class184.method1233(var328, arg0 - 95)) {
                    class190 var332 = (class190) class120.field2022.method992((byte) 125, (long) var331);
                    if (var332 != null) {
                        class256.method1746(var332, var332.field3259 != var330, (byte) 76);
                    }
                    class246.method1695(var331, false, var330, var329);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 173) {
                int var333 = class213.field3680.method1263(true);
                int var334 = class213.field3680.method1260(-4);
                class153.method1046(var333, (byte) -33, var334);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 99) {
                int var335 = class213.field3680.method1286(arg0 - 88);
                int var336 = class213.field3680.method1286(8);
                int var337 = class213.field3680.method1260(arg0 - 100);
                int var338 = class213.field3680.method1282(255);
                int var339 = class213.field3680.method1263(true);
                if (class184.method1233(var338, 1)) {
                    class289.method1938(arg0 ^ 0x68, var339, var335, var337, var336);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 187) {
                class36.method210(111);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 144) {
                int var340 = class213.field3680.method1244(false);
                class37 var341 = class213.field3680.method1253(-107);
                Object[] var342 = new Object[var341.method222((byte) -40) + 1];
                for (int var343 = var341.method222((byte) -128) - 1; var343 >= 0; var343--) {
                    if (var341.method215((byte) -52, var343) == 115) {
                        var342[var343 + 1] = class213.field3680.method1253(-97);
                    } else {
                        var342[var343 + 1] = Integer.valueOf(class213.field3680.method1290((byte) 90));
                    }
                }
                var342[0] = Integer.valueOf(class213.field3680.method1290((byte) 90));
                if (class184.method1233(var340, 1)) {
                    class85 var344 = new class85();
                    var344.field1339 = var342;
                    class274.method1841(var344, arg0 - 4);
                }
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 72) {
                class5.field90 = class213.field3680.method1268(255);
                class93.field1467 = class213.field3680.method1268(255);
                class254.field4517 = class213.field3680.method1268(arg0 + 159);
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 89) {
                class191.method1317((byte) 73);
                int var345 = class213.field3680.method1260(-4);
                int var346 = class213.field3680.method1268(255);
                int var347 = class213.field3680.method1268(255);
                class148.field2508[var347] = var345;
                class158.field2628[var347] = var346;
                class264.field4640[var347] = 1;
                for (int var348 = 0; var348 < 98; var348++) {
                    if (var345 >= class123.field2065[var348]) {
                        class264.field4640[var347] = var348 + 2;
                    }
                }
                class94.field1481[class96.method626(class80.field1240++, 31)] = var347;
                class215.field3718 = -1;
                return true;
            } else if (class215.field3718 == 41) {
                int var349 = class213.field3680.method1260(arg0 ^ 0xFFFFFF9C);
                int var350 = class213.field3680.method1244(false);
                int var351 = class213.field3680.method1255(false);
                if (class184.method1233(var350, 1)) {
                    class131.method938(77, var351, var349);
                }
                class215.field3718 = -1;
                return true;
            } else {
                class200.method1392(58, "T1 - " + class215.field3718 + "," + class288.field5090 + "," + class85.field1345 + " - " + class182.field3044, (Throwable) null);
                class241.method1658(0);
                return true;
            }
        }
    }
}
