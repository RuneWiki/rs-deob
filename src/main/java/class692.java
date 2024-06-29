import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class692 {

    @OriginalMember(owner = "client!jja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9684 = new String[] { method4942(method4941("\u001fv\b\u0005")), method4942(method4941("\u001bi\u0005G\u001bY")), method4942(method4941("\n-JG'")), method4942(method4941("\u001bi\u0005G\u001eY")), method4942(method4941("\u001bi\u0005G\u0018Y")), method4942(method4941("%2DDz")), method4942(method4941("\u001es\u0001\u0007)\u001f")), method4942(method4941("Q.D")), method4942(method4941("Qj\u0014S")), method4942(method4941("\u001bi\u0005G\u0019Y")), method4942(method4941("Mj\t\u000eg@=")), method4942(method4941("Mj\t\u000egA=")), method4942(method4941("\u0018m\u0012\u0006`")) };

    @OriginalMember(owner = "client!jja", name = "d", descriptor = "Lsb;")
    public static class261 field9676 = new class261(61, -2);

    @OriginalMember(owner = "client!jja", name = "h", descriptor = "Llf;")
    public static class260 field9681 = new class260(13, 7);

    @OriginalMember(owner = "client!jja", name = "g", descriptor = "[I")
    public static int[] field9682 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!jja", name = "c", descriptor = "I")
    public static int field9683 = 0;

    @OriginalMember(owner = "client!jja", name = "f", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!jja", name = "b", descriptor = "I")
    public static int field9679;

    @OriginalMember(owner = "client!jja", name = "e", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)V")
    public static final void method4937(int arg0) {
        try {
            field9678++;
            class72 var1 = null;
            try {
                if (arg0 != 30908) {
                    return;
                }
                var1 = class188.method1578("2", -7);
                class711 var2 = new class711(class383.field5586 * 6 + 3);
                var2.method5114(255, 1);
                var2.method5138((byte) -124, class383.field5586);
                for (int var3 = 0; var3 < class247.field3527.length; var3++) {
                    if (class290.field4098[var3]) {
                        var2.method5138((byte) -119, var3);
                        var2.method5127(class247.field3527[var3], 26108);
                    }
                }
                var1.method752(var2.field9945, var2.field9996, 0, 0);
            } catch (Exception var6) {
            }
            try {
                if (var1 != null) {
                    var1.method757(arg0 - 30908);
                }
            } catch (Exception var5) {
            }
            class291.field4101 = class614.method4531(arg0 - 30960);
            class204.field2995 = false;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9684[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(B)V")
    public static void method4938(byte arg0) {
        try {
            field9681 = null;
            if (arg0 >= -18) {
                field9682 = null;
            }
            field9682 = null;
            field9676 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9684[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lob;B)Z")
    public static final boolean method4939(class779 arg0, byte arg1) throws IOException {
        try {
            field9677++;
            class28 var2 = arg0.field11096;
            class476 var3 = arg0.field11099;
            if (var2 == null) {
                return false;
            }
            if (arg0.field11112 == null) {
                if (arg0.field11102) {
                    if (!var2.method316(arg1 - 106, 1)) {
                        return false;
                    }
                    var2.method313(0, -28221, 1, arg0.field11099.field9996);
                    arg0.field11102 = false;
                    arg0.field11109++;
                    arg0.field11106 = 0;
                }
                var3.field9945 = 0;
                if (var3.method3685(-7450)) {
                    if (!var2.method316(-116, 1)) {
                        return false;
                    }
                    var2.method313(1, -28221, 1, arg0.field11099.field9996);
                    arg0.field11106 = 0;
                    arg0.field11109++;
                }
                arg0.field11102 = true;
                class261[] var4 = class324.method2565((byte) -67);
                int var5 = var3.method3684(118);
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(field9684[12] + var5 + field9684[8] + var3.field9945);
                }
                arg0.field11112 = var4[var5];
                arg0.field11105 = arg0.field11112.field3707;
            }
            if (arg0.field11105 == -1) {
                if (!var2.method316(-104, 1)) {
                    return false;
                }
                var2.method313(0, -28221, 1, var3.field9996);
                arg0.field11109++;
                arg0.field11106 = 0;
                arg0.field11105 = var3.field9996[0] & 0xFF;
            }
            if (arg0.field11105 == -2) {
                if (!var2.method316(arg1 - 106, 2)) {
                    return false;
                }
                var2.method313(0, -28221, 2, var3.field9996);
                var3.field9945 = 0;
                arg0.field11105 = var3.method5116((byte) -106);
                arg0.field11109 += 2;
                arg0.field11106 = 0;
            }
            if (arg0.field11105 > 0) {
                if (!var2.method316(-104, arg0.field11105)) {
                    return false;
                }
                var3.field9945 = 0;
                var2.method313(0, arg1 - 28220, arg0.field11105, var3.field9996);
                arg0.field11106 = 0;
                arg0.field11109 += arg0.field11105;
            }
            arg0.field11113 = arg0.field11103;
            arg0.field11103 = arg0.field11111;
            arg0.field11111 = arg0.field11112;
            if (class572.field8282 == arg0.field11112) {
                int var6 = var3.method5119(75);
                int var7 = var3.method5120((byte) 51);
                int var8 = var3.method5116((byte) -114);
                int var9 = var3.method5116((byte) -120);
                int var10 = var3.method5146(-31933);
                int var11 = var3.method5132((byte) 16);
                int var12 = var11 & 0x7;
                int var13 = (var11 & 0x78) >> 3;
                if (var13 == 15) {
                    var13 = -1;
                }
                if (var7 >> 30 != 0) {
                    int var14 = var7 >> 28 & 0x3;
                    int var15 = ((var7 & 0xFFFDAD5) >> 14) - class537.field7895;
                    int var16 = (var7 & 0x3FFF) - class655.field9286;
                    if (var15 >= 0 && var16 >= 0 && class625.field8929 > var15 && var16 < class14.field187) {
                        int var17 = var15 * 512 + 256;
                        int var18 = var16 * 512 + 256;
                        int var19 = var14;
                        if (var14 < 3 && class23.method275(1, var15, var16)) {
                            var19 = var14 + 1;
                        }
                        class242 var20 = new class242(var9, var10, var14, var19, var17, class100.method977(arg1, var18, var14, var17) - var8, var18, var15, var15, var16, var16, var12, false);
                        class463.field6759.method3984(new class617(var20), 0);
                    }
                } else if ((var7 >> 29) != 0) {
                    int var35 = var7 & 0xFFFF;
                    class527 var36 = (class527) class479.field7063.method3693(false, (long) var35);
                    if (var36 != null) {
                        class717 var37 = var36.field7672;
                        if (var9 == 65535) {
                            var9 = -1;
                        }
                        class453 var38 = var37.field2230[var6];
                        boolean var39 = true;
                        int var40 = var38.field6627;
                        if (var9 != -1 && var40 != -1) {
                            if (var9 == var40) {
                                class595 var41 = class11.field153.method3479(var9, 125);
                                if (var41.field8546 && var41.field8565 != -1) {
                                    class437 var42 = class10.field132.method1889(var41.field8565, true);
                                    int var43 = var42.field6439;
                                    if (var43 == 0 || var43 == 2) {
                                        var39 = false;
                                    } else if (var43 == 1) {
                                        var39 = true;
                                    }
                                }
                            } else {
                                class595 var44 = class11.field153.method3479(var9, 103);
                                class595 var45 = class11.field153.method3479(var40, 110);
                                if (var44.field8565 != -1 && var45.field8565 != -1) {
                                    class437 var46 = class10.field132.method1889(var44.field8565, true);
                                    class437 var47 = class10.field132.method1889(var45.field8565, true);
                                    if (var47.field6442 > var46.field6442) {
                                        var39 = false;
                                    }
                                }
                            }
                        }
                        if (var39) {
                            var38.field6630 = var8;
                            var38.field6627 = var9;
                            var38.field6629 = var13;
                            if (var9 == -1) {
                                var38.field6631.method840(-1, false);
                            } else {
                                class595 var48 = class11.field153.method3479(var9, 115);
                                int var49 = var48.field8546 ? 0 : 2;
                                var38.field6631.method847(var48.field8565, var49, false, var10, (byte) -19);
                            }
                        }
                    }
                } else if (var7 >> 28 != 0) {
                    int var21 = var7 & 0xFFFF;
                    class339 var22;
                    if (class241.field3470 == var21) {
                        var22 = class203.field2988;
                    } else {
                        var22 = class748.field10666[var21];
                    }
                    if (var22 != null) {
                        class453 var23 = var22.field2230[var6];
                        if (var9 == 65535) {
                            var9 = -1;
                        }
                        boolean var24 = true;
                        int var25 = var23.field6627;
                        if (var9 != -1 && var25 != -1) {
                            if (var9 == var25) {
                                class595 var26 = class11.field153.method3479(var9, 115);
                                if (var26.field8546 && var26.field8565 != -1) {
                                    class437 var27 = class10.field132.method1889(var26.field8565, true);
                                    int var28 = var27.field6439;
                                    if (var28 == 0 || var28 == 2) {
                                        var24 = false;
                                    } else if (var28 == 1) {
                                        var24 = true;
                                    }
                                }
                            } else {
                                class595 var29 = class11.field153.method3479(var9, 125);
                                class595 var30 = class11.field153.method3479(var25, 122);
                                if (var29.field8565 != -1 && var30.field8565 != -1) {
                                    class437 var31 = class10.field132.method1889(var29.field8565, true);
                                    class437 var32 = class10.field132.method1889(var30.field8565, true);
                                    if (var32.field6442 > var31.field6442) {
                                        var24 = false;
                                    }
                                }
                            }
                        }
                        if (var24) {
                            var23.field6629 = var13;
                            var23.field6630 = var8;
                            var23.field6627 = var9;
                            var23.field6633 = var12;
                            if (var9 == -1) {
                                var23.field6631.method840(-1, false);
                            } else {
                                class595 var33 = class11.field153.method3479(var9, 105);
                                int var34 = var33.field8546 ? 0 : 2;
                                var23.field6631.method847(var33.field8565, var34, false, var10, (byte) -19);
                            }
                        }
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (class238.field3442 == arg0.field11112) {
                int var50 = var3.method5116((byte) -120);
                class758.method5498(false);
                class531.method4019(var50, 124);
                arg0.field11112 = null;
                return true;
            } else if (class293.field4118 == arg0.field11112) {
                int var51 = var3.method5116((byte) -107);
                int var52 = var3.method5128(0);
                boolean var53 = (var52 & 0x1) == 1;
                while (var3.field9945 < arg0.field11105) {
                    int var54 = var3.method5090(-113);
                    int var55 = var3.method5116((byte) -128);
                    int var56 = 0;
                    if (var55 != 0) {
                        var56 = var3.method5128(0);
                        if (var56 == 255) {
                            var56 = var3.method5113(18443);
                        }
                    }
                    class195.method1693(var55 - 1, var53, var56, var54, -103, var51);
                }
                class539.field7926[class434.method3377(class681.field9571++, 31)] = var51;
                arg0.field11112 = null;
                return true;
            } else if (class539.field7923 == arg0.field11112) {
                int var57 = var3.method5116((byte) -109);
                int var58 = var3.method5128(arg1 + 1);
                boolean var59 = (var58 & 0x1) == 1;
                class572.method4259(var59, var57, -121);
                int var60 = var3.method5116((byte) -106);
                for (int var61 = 0; var61 < var60; var61++) {
                    int var62 = var3.method5119(91);
                    if (var62 == 255) {
                        var62 = var3.method5149(18547);
                    }
                    int var63 = var3.method5116((byte) -118);
                    class195.method1693(var63 - 1, var59, var62, var61, arg1 - 74, var57);
                }
                class539.field7926[class434.method3377(31, class681.field9571++)] = var57;
                arg0.field11112 = null;
                return true;
            } else if (class590.field8493 == arg0.field11112) {
                arg0.field11112 = null;
                return false;
            } else if (class231.field3341 == arg0.field11112) {
                int var64 = var3.method5128(0);
                int var65 = var3.method5103((byte) 123);
                if (var65 == 65535) {
                    var65 = -1;
                }
                int var66 = var3.method5134(arg1 ^ 0x48C7);
                String var67 = var3.method5144(-16414);
                if (var66 >= 1 && var66 <= 8) {
                    if (var67.equalsIgnoreCase(field9684[0])) {
                        var67 = null;
                    }
                    class787.field11367[var66 - 1] = var67;
                    class190.field2523[var66 - 1] = var65;
                    class281.field3963[var66 - 1] = var64 == 0;
                }
                arg0.field11112 = null;
                return true;
            } else if (class761.field10861 == arg0.field11112) {
                int var68 = var3.method5130(false);
                class758.method5498(false);
                arg0.field11112 = null;
                if (var68 == -1) {
                    class301.field4188 = -1;
                    class171.field2267 = -1;
                } else {
                    int var69 = (var68 & 0xFFFE36B) >> 14;
                    int var70 = var69 - class537.field7895;
                    int var71 = var68 & 0x3FFF;
                    if (var70 < 0) {
                        var70 = 0;
                    } else if (class625.field8929 <= var70) {
                        var70 = class625.field8929;
                    }
                    int var72 = var71 - class655.field9286;
                    if (var72 < 0) {
                        var72 = 0;
                    } else if (var72 >= class14.field187) {
                        var72 = class14.field187;
                    }
                    class171.field2267 = (var70 << 9) + 256;
                    class301.field4188 = (var72 << 9) + 256;
                }
                return true;
            } else if (class74.field1067 == arg0.field11112) {
                boolean var73 = var3.method5128(0) == 1;
                String var74 = var3.method5144(-16414);
                String var75 = var74;
                if (var73) {
                    var75 = var3.method5144(-16414);
                }
                long var76 = (long) var3.method5116((byte) -128);
                long var78 = (long) var3.method5085(true);
                int var80 = var3.method5128(0);
                long var81 = (var76 << 32) + var78;
                boolean var83 = false;
                int var84 = 0;
                while (true) {
                    if (var84 >= 100) {
                        if (var80 <= 1) {
                            if (!(!class608.field8721 || class359.field5224) || class90.field1260) {
                                var83 = true;
                            } else if (class553.method4133(var75, 0)) {
                                var83 = true;
                            }
                        }
                        break;
                    }
                    if (class353.field5112[var84] == var81) {
                        var83 = true;
                        break;
                    }
                    var84++;
                }
                if (!var83 && class725.field10314 == 0) {
                    class353.field5112[class779.field11092] = var81;
                    class779.field11092 = (class779.field11092 + 1) % 100;
                    String var85 = class747.method5409(class590.method4356(var3, 32767), (byte) -123);
                    if (var80 == 2) {
                        class405.method3173(var74, 7, field9684[10] + var75, var85, (byte) -67, null, field9684[10] + var74, -1, 0);
                    } else if (var80 == 1) {
                        class405.method3173(var74, 7, field9684[11] + var75, var85, (byte) -86, null, field9684[11] + var74, -1, 0);
                    } else {
                        class405.method3173(var74, 3, var75, var85, (byte) -110, null, var74, -1, 0);
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (class330.field4510 == arg0.field11112) {
                class344.field5010 = class522.field7612;
                boolean var86 = var3.method5128(0) == 1;
                class442 var87 = new class442(var3);
                class26 var88;
                if (var86) {
                    var88 = class30.field382;
                } else {
                    var88 = class713.field10112;
                }
                var87.method3442((byte) 125, var88);
                arg0.field11112 = null;
                return true;
            } else if (class76.field1084 == arg0.field11112) {
                class626.method4595((byte) 5, class720.field10253);
                arg0.field11112 = null;
                return true;
            } else if (class98.field1328 == arg0.field11112) {
                int var89 = var3.method5149(arg1 + 18548);
                class758.method5498(false);
                class509 var90 = (class509) class104.field1375.method3693(false, (long) var89);
                if (var90 != null) {
                    class394.method3082(var90, true, false, -4438);
                }
                if (class500.field7302 != null) {
                    class97.method959(class500.field7302, -1);
                    class500.field7302 = null;
                }
                arg0.field11112 = null;
                return true;
            } else if (class791.field11508 == arg0.field11112) {
                int var91 = var3.method5113(18443);
                int var92 = var3.method5101(false);
                class758.method5498(false);
                class558.method4177(var91, arg1 ^ 0x1549, var92);
                arg0.field11112 = null;
                return true;
            } else if (class429.field6215 == arg0.field11112) {
                class138.field1788 = var3.method5128(~arg1);
                class391.field5715 = var3.method5119(126);
                arg0.field11112 = null;
                return true;
            } else if (class487.field7137 == arg0.field11112) {
                class734.field10459.method3776(arg1 + 30112);
                arg0.field11112 = null;
                class202.field2983 += 32;
                return true;
            } else if (class553.field8066 == arg0.field11112) {
                int var93 = var3.method5116((byte) -128);
                if (var93 == 65535) {
                    var93 = -1;
                }
                int var94 = var3.method5128(0);
                int var95 = var3.method5116((byte) -123);
                int var96 = var3.method5128(0);
                class241.method1991(var95, (byte) -17, true, var93, var94, 256, var96);
                arg0.field11112 = null;
                return true;
            } else if (class683.field9579 == arg0.field11112) {
                int var97 = var3.method5134(-18632);
                int var98 = var3.method5103((byte) 93);
                class734.field10459.method3777(15802, var97, var98);
                arg0.field11112 = null;
                return true;
            } else if (class684.field9591 == arg0.field11112) {
                class626.method4595((byte) 5, field9681);
                arg0.field11112 = null;
                return true;
            } else if (class442.field6532 == arg0.field11112) {
                while (var3.field9945 < arg0.field11105) {
                    boolean var99 = var3.method5128(0) == 1;
                    String var100 = var3.method5144(arg1 ^ 0x401D);
                    String var101 = var3.method5144(-16414);
                    int var102 = var3.method5116((byte) -128);
                    int var103 = var3.method5128(0);
                    String var104 = "";
                    boolean var105 = false;
                    if (var102 > 0) {
                        var104 = var3.method5144(-16414);
                        var105 = var3.method5128(~arg1) == 1;
                    }
                    for (int var106 = 0; var106 < class210.field3062; var106++) {
                        if (var99) {
                            if (var101.equals(class591.field8497[var106])) {
                                class591.field8497[var106] = var100;
                                var100 = null;
                                class653.field9272[var106] = var101;
                                break;
                            }
                        } else if (var100.equals(class591.field8497[var106])) {
                            if (class336.field4867[var106] != var102) {
                                boolean var107 = true;
                                for (class129 var108 = (class129) class107.field1412.method3617(false); var108 != null; var108 = (class129) class107.field1412.method3612(3)) {
                                    if (var108.field1610.equals(var100)) {
                                        if (var102 != 0 && var108.field1606 == 0) {
                                            var108.method4736(0);
                                            var107 = false;
                                        } else if (var102 == 0 && var108.field1606 != 0) {
                                            var108.method4736(0);
                                            var107 = false;
                                        }
                                    }
                                }
                                if (var107) {
                                    class107.field1412.method3618(new class129(var100, var102), 41);
                                }
                                class336.field4867[var106] = var102;
                            }
                            class653.field9272[var106] = var101;
                            class147.field1895[var106] = var104;
                            class302.field4205[var106] = var103;
                            class653.field9275[var106] = var105;
                            var100 = null;
                            break;
                        }
                    }
                    if (var100 != null && class210.field3062 < 200) {
                        class591.field8497[class210.field3062] = var100;
                        class653.field9272[class210.field3062] = var101;
                        class336.field4867[class210.field3062] = var102;
                        class147.field1895[class210.field3062] = var104;
                        class302.field4205[class210.field3062] = var103;
                        class653.field9275[class210.field3062] = var105;
                        class210.field3062++;
                    }
                }
                class391.field5712 = class522.field7612;
                class502.field7330 = 2;
                boolean var109 = false;
                int var110 = class210.field3062;
                while (var110 > 0) {
                    boolean var111 = true;
                    var110--;
                    for (int var112 = 0; var112 < var110; var112++) {
                        if (class336.field4867[var112] != class467.field6812.field11524 && class336.field4867[var112 + 1] == class467.field6812.field11524 || class336.field4867[var112] == 0 && class336.field4867[var112 + 1] != 0) {
                            int var113 = class336.field4867[var112];
                            class336.field4867[var112] = class336.field4867[var112 + 1];
                            class336.field4867[var112 + 1] = var113;
                            String var114 = class147.field1895[var112];
                            class147.field1895[var112] = class147.field1895[var112 + 1];
                            class147.field1895[var112 + 1] = var114;
                            String var115 = class591.field8497[var112];
                            class591.field8497[var112] = class591.field8497[var112 + 1];
                            class591.field8497[var112 + 1] = var115;
                            String var116 = class653.field9272[var112];
                            class653.field9272[var112] = class653.field9272[var112 + 1];
                            class653.field9272[var112 + 1] = var116;
                            int var117 = class302.field4205[var112];
                            class302.field4205[var112] = class302.field4205[var112 + 1];
                            class302.field4205[var112 + 1] = var117;
                            boolean var118 = class653.field9275[var112];
                            class653.field9275[var112] = class653.field9275[var112 + 1];
                            var111 = false;
                            class653.field9275[var112 + 1] = var118;
                        }
                    }
                    if (var111) {
                        break;
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (arg1 != -1) {
                return false;
            } else if (class691.field9671 == arg0.field11112) {
                int var119 = var3.method5132((byte) 16);
                class758.method5498(false);
                arg0.field11112 = null;
                class440.field6490 = var119;
                return true;
            } else if (class430.field6240 == arg0.field11112) {
                class626.method4595((byte) 5, class507.field7432);
                arg0.field11112 = null;
                return true;
            } else if (class741.field10532 == arg0.field11112) {
                int var120 = var3.method5132((byte) 16);
                int var121 = var120 >> 2;
                int var122 = var120 & 0x3;
                int var123 = class118.field1501[var121];
                int var124 = var3.method5140((byte) -2);
                if (var124 == 65535) {
                    var124 = -1;
                }
                int var125 = var3.method5149(18547);
                int var126 = var125 >> 28 & 0x3;
                int var127 = var125 >> 14 & 0x3FFF;
                int var128 = var125 & 0x3FFF;
                int var129 = var127 - class537.field7895;
                int var130 = var128 - class655.field9286;
                class490.method3774(var129, var124, var126, var121, var123, var130, (byte) 80, var122);
                arg0.field11112 = null;
                return true;
            } else if (class390.field5688 == arg0.field11112) {
                int var131 = var3.method5113(18443);
                int var132 = var3.method5146(-31933);
                class758.method5498(false);
                if (var132 == 65535) {
                    var132 = -1;
                }
                class802.method5782(var131, var132, 35);
                arg0.field11112 = null;
                return true;
            } else if (class474.field6951 == arg0.field11112) {
                int[] var133 = new int[4];
                for (int var134 = 0; var134 < 4; var134++) {
                    var133[var134] = var3.method5116((byte) -106);
                }
                int var135 = var3.method5134(-18632);
                int var136 = var3.method5146(-31933);
                class527 var137 = (class527) class479.field7063.method3693(false, (long) var136);
                if (var137 != null) {
                    class688.method4920(var133, var137.field7672, var135, true, 1);
                }
                arg0.field11112 = null;
                return true;
            } else if (class210.field3049 == arg0.field11112) {
                class418.field6024 = var3.method5112(128);
                if (class418.field6024 == 0 || class418.field6024 == 1) {
                    class723.field10285 = true;
                }
                arg0.field11112 = null;
                return true;
            } else if (class415.field5986 == arg0.field11112) {
                int var138 = var3.method5134(arg1 - 18631);
                int var139 = var3.method5134(-18632);
                if (var139 == 255) {
                    var138 = -1;
                    var139 = -1;
                }
                class437.method3412(var139, var138, 9476);
                arg0.field11112 = null;
                return true;
            } else if (class26.field316 == arg0.field11112) {
                class322.field4394 = class678.method4861(var3.method5128(0), (byte) -40);
                arg0.field11112 = null;
                return true;
            } else if (class354.field5128 == arg0.field11112) {
                int var140 = var3.method5116((byte) -120);
                class339 var141;
                if (class241.field3470 == var140) {
                    var141 = class203.field2988;
                } else {
                    var141 = class748.field10666[var140];
                }
                if (var141 == null) {
                    arg0.field11112 = null;
                    return true;
                }
                int var142 = var3.method5116((byte) -123);
                int var143 = var3.method5128(0);
                boolean var144 = (var142 & 0x8000) != 0;
                if (var141.field4905 != null && var141.field4901 != null) {
                    boolean var145 = false;
                    if (var143 <= 1) {
                        if (!var144 && (class608.field8721 && !class359.field5224 || class90.field1260)) {
                            var145 = true;
                        } else if (class553.method4133(var141.field4905, 0)) {
                            var145 = true;
                        }
                    }
                    if (!var145 && class725.field10314 == 0) {
                        int var146 = -1;
                        String var148;
                        if (var144) {
                            var142 &= 0x7FFF;
                            class745 var147 = class423.method3288(var3, 50);
                            var146 = var147.field10574;
                            var148 = var147.field10571.method5171(var3, (byte) 2);
                        } else {
                            var148 = class747.method5409(class590.method4356(var3, 32767), (byte) -124);
                        }
                        var141.field2170 = var148.trim();
                        var141.field2205 = var142 >> 8;
                        var141.field2222 = 150;
                        var141.field2175 = var142 & 0xFF;
                        int var149;
                        if (var143 == 1 || var143 == 2) {
                            var149 = var144 ? 17 : 1;
                        } else {
                            var149 = var144 ? 17 : 2;
                        }
                        if (var143 == 2) {
                            class405.method3173(var141.field4941, var149, field9684[10] + var141.method2719(~arg1, false), var148, (byte) -77, null, field9684[10] + var141.method2717(true, -1), var146, 0);
                        } else if (var143 == 1) {
                            class405.method3173(var141.field4941, var149, field9684[11] + var141.method2719(arg1 + 1, false), var148, (byte) -109, null, field9684[11] + var141.method2717(true, -1), var146, 0);
                        } else {
                            class405.method3173(var141.field4941, var149, var141.method2719(~arg1, false), var148, (byte) -90, null, var141.method2717(true, -1), var146, 0);
                        }
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (class375.field5478 == arg0.field11112) {
                int var150 = var3.method5146(-31933);
                int var151 = var3.method5128(~arg1);
                class758.method5498(false);
                if (var151 == 2) {
                    class122.method1101(12);
                }
                class572.field8291 = var150;
                class463.method3557(arg1 + 86, var150);
                class273.method2240(16664, false);
                class158.method1326(class572.field8291);
                for (int var152 = 0; var152 < 100; var152++) {
                    class752.field10742[var152] = true;
                }
                arg0.field11112 = null;
                return true;
            } else if (class446.field6564 == arg0.field11112) {
                class677.method4854(1236953956);
                arg0.field11112 = null;
                return false;
            } else if (class108.field1417 == arg0.field11112) {
                int var153 = var3.method5120((byte) 51);
                int var154 = var3.method5103((byte) 82);
                class758.method5498(false);
                class785.method5653(var153, (byte) 7, var154);
                arg0.field11112 = null;
                return true;
            } else if (class471.field6892 == arg0.field11112) {
                byte var155 = var3.method5131((byte) 102);
                int var156 = var3.method5119(89);
                class758.method5498(false);
                class602.method4445(-118, var155, var156);
                arg0.field11112 = null;
                return true;
            } else if (class100.field1350 == arg0.field11112) {
                int var157 = var3.method5113(18443);
                class758.method5498(false);
                class783.method5642(var157, 5, 4, class241.field3470, 0);
                arg0.field11112 = null;
                return true;
            } else if (class410.field5917 == arg0.field11112) {
                class222.method1865((byte) 28);
                arg0.field11112 = null;
                return true;
            } else if (class294.field4138 == arg0.field11112) {
                int var158 = var3.method5090(-57);
                int var159 = var3.method5113(18443);
                int var160 = var3.method5128(0);
                String var161 = "";
                String var162 = var161;
                if ((var160 & 0x1) != 0) {
                    var161 = var3.method5144(-16414);
                    if ((var160 & 0x2) == 0) {
                        var162 = var161;
                    } else {
                        var162 = var3.method5144(arg1 ^ 0x401D);
                    }
                }
                String var163 = var3.method5144(-16414);
                if (var158 == 99) {
                    class11.method74(var163, (byte) -26);
                } else if (var158 == 98) {
                    class441.method3434(var163, -101);
                } else if (var162.equals("") || !class553.method4133(var162, 0)) {
                    class459.method3533(var161, (byte) 55, var161, var162, var159, var163, var158);
                } else {
                    arg0.field11112 = null;
                    return true;
                }
                arg0.field11112 = null;
                return true;
            } else if (class255.field3645 == arg0.field11112) {
                int var164 = var3.method5116((byte) -128);
                int var165 = var3.method5116((byte) -125);
                class758.method5498(false);
                class527.method4003(var165, var164, (byte) 59, 0);
                arg0.field11112 = null;
                return true;
            } else if (class474.field6947 == arg0.field11112) {
                class325.field4448 = var3.method5128(0) == 1;
                arg0.field11112 = null;
                return true;
            } else if (class229.field3316 == arg0.field11112) {
                class626.method4595((byte) 5, class444.field6551);
                arg0.field11112 = null;
                return true;
            } else if (class694.field9702 == arg0.field11112) {
                String var166 = var3.method5144(-16414);
                String var167 = class747.method5409(class590.method4356(var3, 32767), (byte) -77);
                class459.method3533(var166, (byte) 55, var166, var166, 0, var167, 6);
                arg0.field11112 = null;
                return true;
            } else if (class489.field7163 == arg0.field11112) {
                int var168 = var3.method5116((byte) -110);
                if (var168 == 65535) {
                    var168 = -1;
                }
                int var169 = var3.method5128(arg1 + 1);
                int var170 = var3.method5116((byte) -121);
                int var171 = var3.method5128(0);
                int var172 = var3.method5116((byte) -123);
                class241.method1991(var170, (byte) -101, false, var168, var169, var172, var171);
                arg0.field11112 = null;
                return true;
            } else if (class397.field5757 == arg0.field11112) {
                boolean var173 = var3.method5119(87) == 1;
                class758.method5498(false);
                arg0.field11112 = null;
                class152.field1947 = var173;
                return true;
            } else if (class480.field7072 == arg0.field11112) {
                int var174 = var3.method5116((byte) -117);
                long var175 = var3.method5147((byte) 90);
                if (class254.field3637 == null) {
                    class254.field3637 = new Object[class272.field3853.field1214];
                }
                class254.field3637[var174] = Long.valueOf(var175);
                class379.field5541[class434.method3377(class604.field8656++, 31)] = var174;
                arg0.field11112 = null;
                return true;
            } else if (class312.field4287 == arg0.field11112) {
                int var177 = var3.method5146(-31933);
                int var178 = var3.method5120((byte) 51);
                int var179 = var3.method5116((byte) -124);
                int var180 = var3.method5116((byte) -122);
                class758.method5498(false);
                class783.method5642(var178, 7, 4, var179 | var180 << 16, var177);
                arg0.field11112 = null;
                return true;
            } else if (class127.field1597 == arg0.field11112) {
                class794.method5727(-1, class24.field285);
                arg0.field11112 = null;
                return false;
            } else if (class309.field4266 == arg0.field11112) {
                int var181 = var3.method5140((byte) -2);
                if (var181 == 65535) {
                    var181 = -1;
                }
                int var182 = var3.method5120((byte) 51);
                int var183 = var3.method5120((byte) 51);
                class758.method5498(false);
                class640.method4674(var181, (byte) 16, var183, var182);
                class371 var184 = class153.field1955.method3237(var181, 0);
                class327.method2581(var184.field5415, var184.field5392, true, var183, var184.field5438);
                class379.method2998(var184.field5429, var184.field5407, var184.field5376, var183, (byte) -117);
                arg0.field11112 = null;
                return true;
            } else if (class659.field9337 == arg0.field11112) {
                int var185 = var3.method5103((byte) 69);
                int var186 = var3.method5149(arg1 + 18548);
                class734.field10459.method3775(arg1 + 101, var185, var186);
                arg0.field11112 = null;
                return true;
            } else if (class228.field3310 == arg0.field11112) {
                class626.method4595((byte) 5, class208.field3033);
                arg0.field11112 = null;
                return true;
            } else if (class80.field1122 == arg0.field11112) {
                int var187 = var3.method5116((byte) -112);
                int var188 = var3.method5128(arg1 + 1);
                boolean var189 = (var188 & 0x1) == 1;
                class691.method4932((byte) 125, var189, var187);
                class539.field7926[class434.method3377(31, class681.field9571++)] = var187;
                arg0.field11112 = null;
                return true;
            } else if (class580.field8390 == arg0.field11112) {
                int var190 = var3.method5120((byte) 51);
                int var191 = var3.method5149(18547);
                int var192 = var3.method5116((byte) -120);
                class758.method5498(false);
                class783.method5642(var191, 5, arg1 + 5, var192, var190);
                arg0.field11112 = null;
                return true;
            } else if (class522.field7613 == arg0.field11112) {
                int var193 = var3.method5130(false);
                if (class713.field10024 != var193) {
                    class713.field10024 = var193;
                    class158.method1337(class8.field100, -1, -1);
                }
                arg0.field11112 = null;
                return true;
            } else if (class722.field10281 == arg0.field11112) {
                int var194 = var3.method5132((byte) 16);
                int var195 = var3.method5116((byte) -128);
                int var196 = var3.method5149(18547);
                int var197 = var3.method5116((byte) -115);
                class758.method5498(false);
                class87.method866(var196, var195, 108, var197, var194);
                arg0.field11112 = null;
                return true;
            } else if (class63.field968 == arg0.field11112) {
                int var198 = var3.method5103((byte) 60);
                byte var199 = var3.method5088(arg1 - 16995);
                class734.field10459.method3775(-38, var198, var199);
                arg0.field11112 = null;
                return true;
            } else if (class699.field9793 == arg0.field11112) {
                class626.method4595((byte) 5, class592.field8526);
                arg0.field11112 = null;
                return true;
            } else if (class449.field6576 == arg0.field11112) {
                class626.method4595((byte) 5, class97.field1306);
                arg0.field11112 = null;
                return true;
            } else if (class621.field8844 == arg0.field11112) {
                class344.field5010 = class522.field7612;
                boolean var200 = var3.method5128(0) == 1;
                if (arg0.field11105 != 1) {
                    if (var200) {
                        class30.field382 = new class26(var3);
                    } else {
                        class713.field10112 = new class26(var3);
                    }
                    arg0.field11112 = null;
                    return true;
                }
                if (var200) {
                    class30.field382 = null;
                } else {
                    class713.field10112 = null;
                }
                arg0.field11112 = null;
                return true;
            } else if (class459.field6688 == arg0.field11112) {
                int var201 = var3.method5149(18547);
                int var202 = var3.method5140((byte) -2);
                class758.method5498(false);
                class798.method5752(var201, arg1 ^ 0x76, var202);
                arg0.field11112 = null;
                return true;
            } else if (class71.field1038 == arg0.field11112) {
                class626.method4595((byte) 5, class382.field5572);
                arg0.field11112 = null;
                return true;
            } else if (class385.field5621 == arg0.field11112) {
                String var203 = var3.method5144(-16414);
                int var204 = var3.method5113(arg1 ^ 0xFFFFB7F4);
                class758.method5498(false);
                class74.method767(var203, var204, 30626);
                arg0.field11112 = null;
                return true;
            } else if (class562.field8207 == arg0.field11112) {
                int var205 = var3.method5146(arg1 - 31932);
                if (var205 == 65535) {
                    var205 = -1;
                }
                int var206 = var3.method5130(false);
                class758.method5498(false);
                class783.method5642(var206, 1, 4, var205, -1);
                arg0.field11112 = null;
                return true;
            } else if (class466.field6783 == arg0.field11112) {
                var3.field9945 += 28;
                if (var3.method5099(4)) {
                    class82.method808(arg1 ^ 0xFFFFFFE7, var3, var3.field9945 - 28);
                }
                arg0.field11112 = null;
                return true;
            } else if (class462.field6738 == arg0.field11112) {
                class273.field3875 = var3.method5087((byte) -26);
                class190.field2522 = class522.field7612;
                arg0.field11112 = null;
                return true;
            } else if (class621.field8838 == arg0.field11112) {
                int var207 = var3.method5103((byte) 67);
                if (var207 == 65535) {
                    var207 = -1;
                }
                int var208 = var3.method5140((byte) -2);
                if (var208 == 65535) {
                    var208 = -1;
                }
                int var209 = var3.method5149(18547);
                int var210 = var3.method5103((byte) 75);
                class758.method5498(false);
                for (int var211 = var208; var211 <= var207; var211++) {
                    long var212 = ((long) var209 << 32) + ((long) var211);
                    class135 var214 = (class135) class184.field2379.method3693(false, var212);
                    class135 var215;
                    if (var214 != null) {
                        var215 = new class135(var214.field1739, var210);
                        var214.method4294(0);
                    } else if (var211 == -1) {
                        var215 = new class135(class435.method3389(var209, (byte) -114).field11269.field1739, var210);
                    } else {
                        var215 = new class135(0, var210);
                    }
                    class184.field2379.method3691(var215, var212, -1);
                }
                arg0.field11112 = null;
                return true;
            } else if (class182.field2360 == arg0.field11112) {
                String var216 = var3.method5144(arg1 - 16413);
                int var217 = var3.method5116((byte) -111);
                class758.method5498(false);
                class212.method1787(false, var216, var217);
                arg0.field11112 = null;
                return true;
            } else if (class1.field3 == arg0.field11112) {
                field9683 = var3.method5128(0);
                for (int var218 = 0; var218 < field9683; var218++) {
                    class49.field710[var218] = var3.method5144(-16414);
                    class599.field8597[var218] = var3.method5144(-16414);
                    if (class599.field8597[var218].equals("")) {
                        class599.field8597[var218] = class49.field710[var218];
                    }
                    class180.field2342[var218] = var3.method5144(-16414);
                    class46.field657[var218] = var3.method5144(-16414);
                    if (class46.field657[var218].equals("")) {
                        class46.field657[var218] = class180.field2342[var218];
                    }
                    class412.field5930[var218] = false;
                }
                arg0.field11112 = null;
                class391.field5712 = class522.field7612;
                return true;
            } else if (class714.field10141 == arg0.field11112) {
                arg0.field11112 = null;
                class254.field3637 = null;
                return true;
            } else if (class486.field7129 == arg0.field11112) {
                String var219 = var3.method5144(-16414);
                int var220 = var3.method5116((byte) -105);
                String var221 = class591.field8501.method4619(var220, -380).method5171(var3, (byte) 2);
                class405.method3173(var219, 19, var219, var221, (byte) -117, null, var219, var220, 0);
                arg0.field11112 = null;
                return true;
            } else if (class224.field3260 == arg0.field11112) {
                class794.method5727(-1, false);
                arg0.field11112 = null;
                return false;
            } else if (class405.field5880 == arg0.field11112) {
                class367.method2915(var3.method5144(-16414), 3);
                arg0.field11112 = null;
                return true;
            } else if (class269.field3815 == arg0.field11112) {
                int var222 = var3.method5113(arg1 + 18444);
                int var223 = var3.method5140((byte) -2);
                int var224 = var3.method5103((byte) 71);
                class758.method5498(false);
                class802.method5783(var222, (byte) -126, (var224 << 16) + var223);
                arg0.field11112 = null;
                return true;
            } else if (class10.field130 == arg0.field11112) {
                int var225 = var3.method5116((byte) -116);
                if (var225 == 65535) {
                    var225 = -1;
                }
                int var226 = var3.method5128(0);
                int var227 = var3.method5116((byte) -107);
                int var228 = var3.method5128(0);
                int var229 = var3.method5116((byte) -123);
                class336.method2699(var229, var225, var228, var227, var226, true);
                arg0.field11112 = null;
                return true;
            } else if (class279.field3935 == arg0.field11112) {
                int var230 = var3.method5132((byte) 16);
                int var231 = var3.method5149(18547);
                int var232 = var3.method5140((byte) -2);
                class758.method5498(false);
                class509 var233 = (class509) class104.field1375.method3693(false, (long) var231);
                if (var233 != null) {
                    class394.method3082(var233, var233.field7472 != var232, false, -4438);
                }
                class699.method5036(var231, false, var232, (byte) 124, var230);
                arg0.field11112 = null;
                return true;
            } else if (class114.field1468 == arg0.field11112) {
                int var234 = var3.method5120((byte) 51);
                int var235 = var3.method5146(-31933);
                class758.method5498(false);
                class357.method2860(var234, var235, 25);
                arg0.field11112 = null;
                return true;
            } else if (class551.field8043 == arg0.field11112) {
                class240.field3461 = var3.method5102(arg1 - 347036063);
                class608.field8721 = var3.method5128(0) == 1;
                arg0.field11112 = null;
                return true;
            } else if (class13.field173 == arg0.field11112) {
                boolean var236 = var3.method5128(0) == 1;
                String var237 = var3.method5144(-16414);
                String var238 = var237;
                if (var236) {
                    var238 = var3.method5144(-16414);
                }
                int var239 = var3.method5128(0);
                int var240 = var3.method5116((byte) -125);
                boolean var241 = false;
                if (var239 <= 1 && class553.method4133(var238, 0)) {
                    var241 = true;
                }
                if (!var241 && class725.field10314 == 0) {
                    String var242 = class591.field8501.method4619(var240, arg1 ^ 0x17B).method5171(var3, (byte) 2);
                    if (var239 == 2) {
                        class405.method3173(var237, 25, field9684[10] + var238, var242, (byte) -72, null, field9684[10] + var237, var240, 0);
                    } else if (var239 == 1) {
                        class405.method3173(var237, 25, field9684[11] + var238, var242, (byte) -96, null, field9684[11] + var237, var240, 0);
                    } else {
                        class405.method3173(var237, 25, var238, var242, (byte) -126, null, var237, var240, 0);
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (class412.field5928 == arg0.field11112) {
                boolean var243 = var3.method5128(~arg1) == 1;
                String var244 = var3.method5144(arg1 - 16413);
                String var245 = var244;
                if (var243) {
                    var245 = var3.method5144(-16414);
                }
                long var246 = var3.method5147((byte) 117);
                long var248 = (long) var3.method5116((byte) -120);
                long var250 = (long) var3.method5085(true);
                int var252 = var3.method5128(0);
                long var253 = (var248 << 32) + var250;
                boolean var255 = false;
                int var256 = 0;
                while (true) {
                    if (var256 >= 100) {
                        if (var252 <= 1) {
                            if (!(!class608.field8721 || class359.field5224) || class90.field1260) {
                                var255 = true;
                            } else if (class553.method4133(var245, 0)) {
                                var255 = true;
                            }
                        }
                        break;
                    }
                    if (class353.field5112[var256] == var253) {
                        var255 = true;
                        break;
                    }
                    var256++;
                }
                if (!var255 && class725.field10314 == 0) {
                    class353.field5112[class779.field11092] = var253;
                    class779.field11092 = (class779.field11092 + 1) % 100;
                    String var257 = class747.method5409(class590.method4356(var3, 32767), (byte) -102);
                    if (var252 == 2 || var252 == 3) {
                        class405.method3173(var244, 9, field9684[10] + var245, var257, (byte) -89, class98.method966(var246, arg1 + 6), field9684[10] + var244, -1, 0);
                    } else if (var252 == 1) {
                        class405.method3173(var244, 9, field9684[11] + var245, var257, (byte) -108, class98.method966(var246, arg1 + 6), field9684[11] + var244, -1, 0);
                    } else {
                        class405.method3173(var244, 9, var245, var257, (byte) -68, class98.method966(var246, arg1 ^ 0xFFFFFFFA), var244, -1, 0);
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (class272.field3849 == arg0.field11112) {
                class301.method2409((byte) -1);
                arg0.field11112 = null;
                return true;
            } else if (class678.field9525 == arg0.field11112) {
                int var258 = var3.method5116((byte) -122);
                int var259 = var3.method5116((byte) -126);
                int var260 = var3.method5116((byte) -107);
                class758.method5498(false);
                if (class9.field117[var258] != null) {
                    for (int var261 = var259; var261 < var260; var261++) {
                        int var262 = var3.method5085(true);
                        if (class9.field117[var258].length > var261 && class9.field117[var258][var261] != null) {
                            class9.field117[var258][var261].field11271 = var262;
                        }
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (class232.field3356 == arg0.field11112) {
                class462.method3552((byte) -5);
                arg0.field11112 = null;
                return false;
            } else if (class182.field2359 == arg0.field11112) {
                byte var263 = var3.method5112(128);
                int var264 = var3.method5116((byte) -113);
                class758.method5498(false);
                class357.method2860(var263, var264, 25);
                arg0.field11112 = null;
                return true;
            } else if (class669.field9425 == arg0.field11112) {
                for (int var265 = 0; var265 < class748.field10666.length; var265++) {
                    if (class748.field10666[var265] != null) {
                        class748.field10666[var265].field2194 = null;
                        class748.field10666[var265].field2228.method840(-1, false);
                    }
                }
                for (int var266 = 0; var266 < class715.field10182; var266++) {
                    class677.field9494[var266].field7672.field2194 = null;
                    class677.field9494[var266].field7672.field2228.method840(-1, false);
                }
                arg0.field11112 = null;
                return true;
            } else if (class424.field6120 == arg0.field11112) {
                int var267 = var3.method5116((byte) -111);
                if (var267 == 65535) {
                    var267 = -1;
                }
                int var268 = var3.method5128(arg1 + 1);
                int var269 = var3.method5128(0);
                class360.method2873(-126, var269, var268, var267);
                arg0.field11112 = null;
                return true;
            } else if (class311.field4277 == arg0.field11112) {
                int var270 = var3.method5123(13370);
                int var271 = var3.method5103((byte) 89);
                if (var271 == 65535) {
                    var271 = -1;
                }
                int var272 = var3.method5134(-18632);
                class161.method1355(var272, 102, var271, var270);
                arg0.field11112 = null;
                return true;
            } else if (class201.field2964 == arg0.field11112) {
                class736.field10488 = var3.method5128(arg1 + 1);
                class184.field2378 = var3.method5088(-16996) << 3;
                class12.field165 = var3.method5125((byte) 99) << 3;
                arg0.field11112 = null;
                return true;
            } else if (class301.field4191 == arg0.field11112) {
                class586.field8459 = class522.field7612;
                boolean var273 = var3.method5128(arg1 + 1) == 1;
                if (arg0.field11105 != 1) {
                    if (var273) {
                        class343.field4995 = new class286(var3);
                    } else {
                        class611.field8751 = new class286(var3);
                    }
                    arg0.field11112 = null;
                    return true;
                }
                if (var273) {
                    class343.field4995 = null;
                } else {
                    class611.field8751 = null;
                }
                arg0.field11112 = null;
                return true;
            } else if (class74.field1063 == arg0.field11112) {
                int var274 = var3.method5113(18443);
                class465.field6780 = class651.field9249.method1565(3, var274);
                arg0.field11112 = null;
                return true;
            } else if (class5.field65 == arg0.field11112) {
                boolean var275 = var3.method5128(~arg1) == 1;
                String var276 = var3.method5144(-16414);
                long var277 = (long) var3.method5116((byte) -119);
                long var279 = (long) var3.method5085(true);
                int var281 = var3.method5128(0);
                int var282 = var3.method5116((byte) -117);
                long var283 = (var277 << 32) + var279;
                boolean var285 = false;
                Object var286 = null;
                class26 var287 = var275 ? class30.field382 : class713.field10112;
                if (var287 == null) {
                    var285 = true;
                } else {
                    label2491: {
                        for (int var288 = 0; var288 < 100; var288++) {
                            if (class353.field5112[var288] == var283) {
                                var285 = true;
                                break label2491;
                            }
                        }
                        if (var281 <= 1 && class553.method4133(var276, 0)) {
                            var285 = true;
                        }
                    }
                }
                if (!var285 && class725.field10314 == 0) {
                    class353.field5112[class779.field11092] = var283;
                    class779.field11092 = (class779.field11092 + 1) % 100;
                    String var289 = class591.field8501.method4619(var282, -380).method5171(var3, (byte) 2);
                    int var290 = var275 ? 42 : 45;
                    if (var281 == 2 || var281 == 3) {
                        class405.method3173(var276, var290, field9684[10] + var276, var289, (byte) -117, var287.field317, field9684[10] + var276, var282, 0);
                    } else if (var281 == 1) {
                        class405.method3173(var276, var290, field9684[11] + var276, var289, (byte) -87, var287.field317, field9684[11] + var276, var282, 0);
                    } else {
                        class405.method3173(var276, var290, var276, var289, (byte) -104, var287.field317, var276, var282, 0);
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (field9676 == arg0.field11112) {
                String var291 = var3.method5144(arg1 - 16413);
                int var292 = var3.method5116((byte) -126);
                class758.method5498(false);
                class212.method1787(false, var291, var292);
                arg0.field11112 = null;
                return true;
            } else if (class299.field4172 == arg0.field11112) {
                int var293 = var3.method5130(false);
                boolean var294 = var3.method5134(-18632) == 1;
                if (var294 != class765.field10918 || class134.field1675 != var293) {
                    class765.field10918 = var294;
                    class134.field1675 = var293;
                    class158.method1337(class49.field707, -1, -1);
                }
                arg0.field11112 = null;
                return true;
            } else if (class640.field9086 == arg0.field11112) {
                int var295 = var3.method5128(0);
                if (var3.method5128(0) == 0) {
                    class375.field5484[var295] = new class180();
                } else {
                    var3.field9945--;
                    class375.field5484[var295] = new class180(var3);
                }
                class239.field3454 = class522.field7612;
                arg0.field11112 = null;
                return true;
            } else if (class659.field9334 == arg0.field11112) {
                class765.method5531(arg1, class651.field9249, var3, arg0.field11105);
                arg0.field11112 = null;
                return true;
            } else if (class271.field3833 == arg0.field11112) {
                int var296 = var3.method5149(arg1 + 18548);
                int var297 = var3.method5132((byte) 16);
                int var298 = var3.method5132((byte) 16);
                class193.field2538[var298] = var296;
                class235.field3396[var298] = var297;
                class357.field5192[var298] = 1;
                int var299 = class663.field9371[var298] - 1;
                for (int var300 = 0; var300 < var299; var300++) {
                    if (class236.field3417[var300] <= var296) {
                        class357.field5192[var298] = var300 + 2;
                    }
                }
                class8.field98[class434.method3377(class355.field5162++, 31)] = var298;
                arg0.field11112 = null;
                return true;
            } else if (class530.field7695 == arg0.field11112) {
                boolean var301 = var3.method5128(arg1 + 1) == 1;
                String var302 = var3.method5144(-16414);
                String var303 = var302;
                if (var301) {
                    var303 = var3.method5144(arg1 - 16413);
                }
                int var304 = var3.method5128(0);
                boolean var305 = false;
                if (var304 <= 1) {
                    if (!(!class608.field8721 || class359.field5224) || class90.field1260) {
                        var305 = true;
                    } else if (var304 <= 1 && class553.method4133(var303, 0)) {
                        var305 = true;
                    }
                }
                if (!var305 && class725.field10314 == 0) {
                    String var306 = class747.method5409(class590.method4356(var3, 32767), (byte) -82);
                    if (var304 == 2) {
                        class405.method3173(var302, 24, field9684[10] + var303, var306, (byte) -90, null, field9684[10] + var302, -1, 0);
                    } else if (var304 == 1) {
                        class405.method3173(var302, 24, field9684[11] + var303, var306, (byte) -126, null, field9684[11] + var302, -1, 0);
                    } else {
                        class405.method3173(var302, 24, var303, var306, (byte) -68, null, var302, -1, 0);
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (class228.field3306 == arg0.field11112) {
                class255.field3663 = arg0.field11105 > 2 ? var3.method5144(-16414) : class537.field7856.method4068((byte) -71, class405.field5883);
                class495.field7273 = arg0.field11105 <= 0 ? -1 : var3.method5116((byte) -125);
                arg0.field11112 = null;
                if (class495.field7273 == 65535) {
                    class495.field7273 = -1;
                }
                return true;
            } else if (class21.field258 == arg0.field11112) {
                int var307 = var3.method5128(~arg1);
                int var308 = var3.method5132((byte) 16);
                int var309 = var3.method5116((byte) -125);
                int var310 = var3.method5119(106);
                int var311 = var3.method5128(arg1 + 1);
                class758.method5498(false);
                class318.field4350[var307] = true;
                class369.field5345[var307] = var311;
                class786.field11358[var307] = var310;
                class387.field5645[var307] = var308;
                class312.field4290[var307] = var309;
                arg0.field11112 = null;
                return true;
            } else if (class493.field7254 == arg0.field11112) {
                arg0.field11112 = null;
                class254.field3637 = new Object[class272.field3853.field1214];
                return true;
            } else if (class99.field1334 == arg0.field11112) {
                class626.method4595((byte) 5, class660.field9367);
                arg0.field11112 = null;
                return true;
            } else if (class155.field1971 == arg0.field11112) {
                if (class321.field4374 != null) {
                    class585.method4331(-1, -1, class451.field6612.field9129.method1595(3), true, false);
                }
                byte[] var312 = new byte[arg0.field11105];
                var3.method3687(var312, arg0.field11105, 0, -19);
                String var313 = class201.method1728(0, arg0.field11105, -11887, var312);
                String var314 = field9684[6];
                if (!class104.field1371 || class599.method4417(var313, 1, (byte) -89, var314, class651.field9249).field4486 == 2) {
                    class12.method81(class651.field9249, true, var314, arg1 ^ 0xFFFFFFCA, class451.field6612.field9134.method4717(3) == 1, var313);
                }
                arg0.field11112 = null;
                return true;
            } else if (class607.field8697 == arg0.field11112) {
                boolean var315 = var3.method5128(0) == 1;
                String var316 = var3.method5144(-16414);
                String var317 = var316;
                if (var315) {
                    var317 = var3.method5144(arg1 ^ 0x401D);
                }
                long var318 = (long) var3.method5116((byte) -117);
                long var320 = (long) var3.method5085(true);
                int var322 = var3.method5128(0);
                int var323 = var3.method5116((byte) -115);
                long var324 = (var318 << 32) + var320;
                boolean var326 = false;
                int var327 = 0;
                while (true) {
                    if (var327 >= 100) {
                        if (var322 <= 1 && class553.method4133(var317, 0)) {
                            var326 = true;
                        }
                        break;
                    }
                    if (class353.field5112[var327] == var324) {
                        var326 = true;
                        break;
                    }
                    var327++;
                }
                if (!var326 && class725.field10314 == 0) {
                    class353.field5112[class779.field11092] = var324;
                    class779.field11092 = (class779.field11092 + 1) % 100;
                    String var328 = class591.field8501.method4619(var323, arg1 - 379).method5171(var3, (byte) 2);
                    if (var322 == 2) {
                        class405.method3173(var316, 18, field9684[10] + var317, var328, (byte) -103, null, field9684[10] + var316, var323, 0);
                    } else if (var322 == 1) {
                        class405.method3173(var316, 18, field9684[11] + var317, var328, (byte) -82, null, field9684[11] + var316, var323, 0);
                    } else {
                        class405.method3173(var316, 18, var317, var328, (byte) -75, null, var316, var323, 0);
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (class277.field3909 == arg0.field11112) {
                int var329 = var3.method5140((byte) -2);
                if (var329 == 65535) {
                    var329 = -1;
                }
                int var330 = var3.method5120((byte) 51);
                class758.method5498(false);
                class783.method5642(var330, 2, 4, var329, -1);
                arg0.field11112 = null;
                return true;
            } else if (class635.field9003 == arg0.field11112) {
                int var331 = var3.method5120((byte) 51);
                int var332 = var3.method5140((byte) -2);
                if (var332 == 65535) {
                    var332 = -1;
                }
                int var333 = var3.method5113(18443);
                int var334 = var3.method5103((byte) 92);
                class758.method5498(false);
                if (var334 == 65535) {
                    var334 = -1;
                }
                for (int var335 = var332; var335 <= var334; var335++) {
                    long var336 = ((long) var333 << 32) + ((long) var335);
                    class135 var338 = (class135) class184.field2379.method3693(false, var336);
                    class135 var339;
                    if (var338 != null) {
                        var339 = new class135(var331, var338.field1742);
                        var338.method4294(0);
                    } else if (var335 == -1) {
                        var339 = new class135(var331, class435.method3389(var333, (byte) -124).field11269.field1742);
                    } else {
                        var339 = new class135(var331, -1);
                    }
                    class184.field2379.method3691(var339, var336, arg1);
                }
                arg0.field11112 = null;
                return true;
            } else if (class390.field5678 == arg0.field11112) {
                String var340 = var3.method5144(arg1 - 16413);
                Object[] var341 = new Object[var340.length() + 1];
                for (int var342 = var340.length() - 1; var342 >= 0; var342--) {
                    if (var340.charAt(var342) == 's') {
                        var341[var342 + 1] = var3.method5144(-16414);
                    } else {
                        var341[var342 + 1] = Integer.valueOf(var3.method5113(18443));
                    }
                }
                var341[0] = Integer.valueOf(var3.method5113(class52.method560(arg1, -18444)));
                class758.method5498(false);
                class618 var343 = new class618();
                var343.field8812 = var341;
                class158.method1334(var343);
                arg0.field11112 = null;
                return true;
            } else if (class740.field10521 == arg0.field11112) {
                class341.field4968 = class522.field7612;
                if (arg0.field11105 == 0) {
                    class322.field4393 = 0;
                    arg0.field11112 = null;
                    class625.field8931 = null;
                    class219.field3189 = null;
                    class274.field3881 = null;
                    return true;
                }
                class274.field3881 = var3.method5144(-16414);
                boolean var344 = var3.method5128(0) == 1;
                if (var344) {
                    var3.method5144(-16414);
                }
                long var345 = var3.method5147((byte) 80);
                class219.field3189 = class626.method4599((byte) -104, var345);
                class145.field1876 = var3.method5125((byte) 101);
                int var347 = var3.method5128(0);
                if (var347 == 255) {
                    arg0.field11112 = null;
                    return true;
                }
                class322.field4393 = var347;
                class359[] var348 = new class359[100];
                for (int var349 = 0; var349 < class322.field4393; var349++) {
                    var348[var349] = new class359();
                    var348[var349].field5215 = var3.method5144(-16414);
                    boolean var350 = var3.method5128(~arg1) == 1;
                    if (var350) {
                        var348[var349].field5218 = var3.method5144(-16414);
                    } else {
                        var348[var349].field5218 = var348[var349].field5215;
                    }
                    var348[var349].field5221 = class492.method3797(0, var348[var349].field5218);
                    var348[var349].field5222 = var3.method5116((byte) -108);
                    var348[var349].field5220 = var3.method5125((byte) 127);
                    var348[var349].field5219 = var3.method5144(-16414);
                    if (var348[var349].field5218.equals(class203.field2988.field4905)) {
                        class167.field2134 = var348[var349].field5220;
                    }
                }
                boolean var351 = false;
                int var352 = class322.field4393;
                while (var352 > 0) {
                    boolean var353 = true;
                    var352--;
                    for (int var354 = 0; var354 < var352; var354++) {
                        if (var348[var354].field5221.compareTo(var348[var354 + 1].field5221) > 0) {
                            class359 var355 = var348[var354];
                            var348[var354] = var348[var354 + 1];
                            var353 = false;
                            var348[var354 + 1] = var355;
                        }
                    }
                    if (var353) {
                        break;
                    }
                }
                arg0.field11112 = null;
                class625.field8931 = var348;
                return true;
            } else if (class502.field7328 == arg0.field11112) {
                String var356 = var3.method5144(-16414);
                boolean var357 = var3.method5128(0) == 1;
                String var358;
                if (var357) {
                    var358 = var3.method5144(arg1 - 16413);
                } else {
                    var358 = var356;
                }
                int var359 = var3.method5116((byte) -105);
                byte var360 = var3.method5125((byte) 124);
                boolean var361 = false;
                if (var360 == -128) {
                    var361 = true;
                }
                if (var361) {
                    if (class322.field4393 == 0) {
                        arg0.field11112 = null;
                        return true;
                    }
                    boolean var367 = false;
                    int var368;
                    for (var368 = 0; class322.field4393 > var368 && (!class625.field8931[var368].field5218.equals(var358) || var359 != class625.field8931[var368].field5222); var368++) {
                    }
                    if (class322.field4393 > var368) {
                        while (class322.field4393 - 1 > var368) {
                            class625.field8931[var368] = class625.field8931[var368 + 1];
                            var368++;
                        }
                        class322.field4393--;
                        class625.field8931[class322.field4393] = null;
                    }
                } else {
                    String var362 = var3.method5144(-16414);
                    class359 var363 = new class359();
                    var363.field5218 = var358;
                    var363.field5215 = var356;
                    var363.field5221 = class492.method3797(0, var363.field5218);
                    var363.field5220 = var360;
                    var363.field5219 = var362;
                    var363.field5222 = var359;
                    int var364;
                    for (var364 = class322.field4393 - 1; var364 >= 0; var364--) {
                        int var365 = class625.field8931[var364].field5221.compareTo(var363.field5221);
                        if (var365 == 0) {
                            class625.field8931[var364].field5222 = var359;
                            class625.field8931[var364].field5220 = var360;
                            class625.field8931[var364].field5219 = var362;
                            if (var358.equals(class203.field2988.field4905)) {
                                class167.field2134 = var360;
                            }
                            class341.field4968 = class522.field7612;
                            arg0.field11112 = null;
                            return true;
                        }
                        if (var365 < 0) {
                            break;
                        }
                    }
                    if (class322.field4393 >= class625.field8931.length) {
                        arg0.field11112 = null;
                        return true;
                    }
                    for (int var366 = class322.field4393 - 1; var366 > var364; var366--) {
                        class625.field8931[var366 + 1] = class625.field8931[var366];
                    }
                    if (class322.field4393 == 0) {
                        class625.field8931 = new class359[100];
                    }
                    class625.field8931[var364 + 1] = var363;
                    class322.field4393++;
                    if (var358.equals(class203.field2988.field4905)) {
                        class167.field2134 = var360;
                    }
                }
                class341.field4968 = class522.field7612;
                arg0.field11112 = null;
                return true;
            } else if (class732.field10449 == arg0.field11112) {
                boolean var369 = var3.method5128(0) == 1;
                byte[] var370 = new byte[arg0.field11105 - 1];
                var3.method5117(arg0.field11105 - 1, 0, var370, -124);
                class488.method3756(var369, false, var370);
                arg0.field11112 = null;
                return true;
            } else if (class403.field5870 == arg0.field11112) {
                class626.method4595((byte) 5, class648.field9207);
                arg0.field11112 = null;
                return true;
            } else if (class169.field2158 == arg0.field11112) {
                class12.field165 = var3.method5088(arg1 - 16995) << 3;
                class736.field10488 = var3.method5132((byte) 16);
                class184.field2378 = var3.method5088(-16996) << 3;
                while (arg0.field11105 > var3.field9945) {
                    class260 var371 = class722.method5225(true)[var3.method5128(0)];
                    class626.method4595((byte) 5, var371);
                }
                arg0.field11112 = null;
                return true;
            } else if (class715.field10175 == arg0.field11112) {
                int var372 = var3.method5103((byte) 98);
                class758.method5498(false);
                class482.method3723((byte) 19, var372);
                arg0.field11112 = null;
                return true;
            } else if (class294.field4141 == arg0.field11112) {
                class626.method4595((byte) 5, class444.field6549);
                arg0.field11112 = null;
                return true;
            } else if (class112.field1452 == arg0.field11112) {
                if (class572.field8291 != -1) {
                    class149.method1270(0, class572.field8291, -22202);
                }
                arg0.field11112 = null;
                return true;
            } else if (class602.field8632 == arg0.field11112) {
                class626.method4595((byte) 5, class288.field4073);
                arg0.field11112 = null;
                return true;
            } else if (class452.field6621 == arg0.field11112) {
                int var373 = var3.method5113(18443);
                class758.method5498(false);
                class783.method5642(var373, 3, 4, -1, -1);
                arg0.field11112 = null;
                return true;
            } else if (class121.field1531 == arg0.field11112) {
                int var374 = var3.method5113(18443);
                int var375 = var3.method5113(arg1 + 18444);
                class274 var376 = class375.method2969((byte) 1, class96.field1302, arg0.field11100);
                var376.field3885.method5127(var374, 26108);
                var376.field3885.method5127(var375, 26108);
                arg0.method5608(var376, arg1 + 29868);
                arg0.field11112 = null;
                return true;
            } else if (class605.field8678 == arg0.field11112) {
                if (class322.method2551(class559.field8139, -7)) {
                    class179.field2331 = (int) ((float) var3.method5116((byte) -115) * 2.5F);
                } else {
                    class179.field2331 = var3.method5116((byte) -115) * 30;
                }
                arg0.field11112 = null;
                class190.field2522 = class522.field7612;
                return true;
            } else if (class487.field7152 == arg0.field11112) {
                class586.field8459 = class522.field7612;
                boolean var377 = var3.method5128(0) == 1;
                class15 var378 = new class15(var3);
                class286 var379;
                if (var377) {
                    var379 = class343.field4995;
                } else {
                    var379 = class611.field8751;
                }
                var378.method102(var379, true);
                arg0.field11112 = null;
                return true;
            } else if (class736.field10484 == arg0.field11112) {
                int var380 = var3.method5103((byte) 87);
                int var381 = var3.method5132((byte) 16);
                class758.method5498(false);
                class756.method5484(var380, -1, true, var381);
                arg0.field11112 = null;
                return true;
            } else if (class61.field937 == arg0.field11112) {
                class345.field5028 = var3.method5128(0);
                arg0.field11112 = null;
                return true;
            } else if (class663.field9376 == arg0.field11112) {
                boolean var382 = var3.method5128(~arg1) == 1;
                String var383 = var3.method5144(-16414);
                long var384 = (long) var3.method5116((byte) -107);
                long var386 = (long) var3.method5085(true);
                int var388 = var3.method5128(0);
                long var389 = (var384 << 32) + var386;
                boolean var391 = false;
                Object var392 = null;
                class26 var393 = var382 ? class30.field382 : class713.field10112;
                if (var393 == null) {
                    var391 = true;
                } else {
                    label2517: {
                        for (int var394 = 0; var394 < 100; var394++) {
                            if (class353.field5112[var394] == var389) {
                                var391 = true;
                                break label2517;
                            }
                        }
                        if (var388 <= 1) {
                            if (!(!class608.field8721 || class359.field5224) || class90.field1260) {
                                var391 = true;
                            } else if (class553.method4133(var383, 0)) {
                                var391 = true;
                            }
                        }
                    }
                }
                if (!var391 && class725.field10314 == 0) {
                    class353.field5112[class779.field11092] = var389;
                    class779.field11092 = (class779.field11092 + 1) % 100;
                    String var395 = class747.method5409(class590.method4356(var3, 32767), (byte) -41);
                    int var396 = var382 ? 41 : 44;
                    if (var388 == 2 || var388 == 3) {
                        class405.method3173(var383, var396, field9684[10] + var383, var395, (byte) -126, var393.field317, field9684[10] + var383, -1, 0);
                    } else if (var388 == 1) {
                        class405.method3173(var383, var396, field9684[11] + var383, var395, (byte) -86, var393.field317, field9684[11] + var383, -1, 0);
                    } else {
                        class405.method3173(var383, var396, var383, var395, (byte) -97, var393.field317, var383, -1, 0);
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (class309.field4257 == arg0.field11112) {
                int var397 = var3.method5128(0);
                int var398 = var397 >> 5;
                int var399 = var397 & 0x1F;
                if (var399 == 0) {
                    class99.field1336[var398] = null;
                    arg0.field11112 = null;
                    return true;
                }
                class337 var400 = new class337();
                var400.field4876 = var399;
                var400.field4874 = var3.method5128(0);
                if (var400.field4874 >= 0 && class41.field624.length > var400.field4874) {
                    if (var400.field4876 == 1 || var400.field4876 == 10) {
                        var400.field4877 = var3.method5116((byte) -124);
                        var3.field9945 += 6;
                    } else if (var400.field4876 >= 2 && var400.field4876 <= 6) {
                        if (var400.field4876 == 2) {
                            var400.field4887 = 256;
                            var400.field4879 = 256;
                        }
                        if (var400.field4876 == 3) {
                            var400.field4887 = 256;
                            var400.field4879 = 0;
                        }
                        if (var400.field4876 == 4) {
                            var400.field4887 = 256;
                            var400.field4879 = 512;
                        }
                        if (var400.field4876 == 5) {
                            var400.field4887 = 0;
                            var400.field4879 = 256;
                        }
                        if (var400.field4876 == 6) {
                            var400.field4887 = 512;
                            var400.field4879 = 256;
                        }
                        var400.field4876 = 2;
                        var400.field4873 = var3.method5128(~arg1);
                        var400.field4879 += var3.method5116((byte) -105) - class537.field7895 << 9;
                        var400.field4887 += var3.method5116((byte) -113) - class655.field9286 << 9;
                        var400.field4875 = var3.method5128(0) << 2;
                        var400.field4878 = var3.method5116((byte) -121);
                    }
                    var400.field4882 = var3.method5116((byte) -109);
                    if (var400.field4882 == 65535) {
                        var400.field4882 = -1;
                    }
                    class99.field1336[var398] = var400;
                }
                arg0.field11112 = null;
                return true;
            } else if (class14.field188 == arg0.field11112) {
                class294.method2374(0, var3, arg0.field11105);
                arg0.field11112 = null;
                return true;
            } else if (class344.field4999 == arg0.field11112) {
                int var401 = var3.method5103((byte) 85);
                int var402 = var3.method5120((byte) 51);
                class734.field10459.method3777(arg1 ^ 0xFFFFC245, var402, var401);
                arg0.field11112 = null;
                return true;
            } else if (class553.field8062 == arg0.field11112) {
                int var403 = var3.method5116((byte) -113);
                String var404 = var3.method5144(arg1 - 16413);
                if (class254.field3637 == null) {
                    class254.field3637 = new Object[class272.field3853.field1214];
                }
                class254.field3637[var403] = var404;
                class379.field5541[class434.method3377(class604.field8656++, 31)] = var403;
                arg0.field11112 = null;
                return true;
            } else if (class747.field10628 == arg0.field11112) {
                class736.field10488 = var3.method5134(arg1 - 18631);
                class184.field2378 = var3.method5112(128) << 3;
                class12.field165 = var3.method5125((byte) -29) << 3;
                for (class413 var405 = (class413) class414.field5965.method3696(0); var405 != null; var405 = (class413) class414.field5965.method3697(-88)) {
                    int var406 = (int) (var405.field8378 >> 28 & 0x3L);
                    int var407 = (int) (var405.field8378 & 0x3FFFL);
                    int var408 = var407 - class537.field7895;
                    int var409 = (int) (var405.field8378 >> 14 & 0x3FFFL);
                    int var410 = var409 - class655.field9286;
                    if (class736.field10488 == var406 && var408 >= class184.field2378 && var408 < class184.field2378 + 8 && var410 >= class12.field165 && (class12.field165 + 8) > var410) {
                        var405.method4294(~arg1);
                        if (var408 >= 0 && var410 >= 0 && class625.field8929 > var408 && class14.field187 > var410) {
                            class757.method5489(var410, (byte) -100, class736.field10488, var408);
                        }
                    }
                }
                for (class224 var411 = (class224) class486.field7127.method3977((byte) -117); var411 != null; var411 = (class224) class486.field7127.method3987(0)) {
                    if (var411.field3248 >= class184.field2378 && var411.field3248 < (class184.field2378 + 8) && var411.field3247 >= class12.field165 && var411.field3247 < (class12.field165 + 8) && class736.field10488 == var411.field3256) {
                        var411.field3259 = true;
                    }
                }
                for (class224 var412 = (class224) class631.field8964.method3977((byte) -99); var412 != null; var412 = (class224) class631.field8964.method3987(0)) {
                    if (class184.field2378 <= var412.field3248 && var412.field3248 < (class184.field2378 + 8) && class12.field165 <= var412.field3247 && var412.field3247 < (class12.field165 + 8) && class736.field10488 == var412.field3256) {
                        var412.field3259 = true;
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (class278.field3928 == arg0.field11112) {
                int var413 = var3.method5130(false);
                int var414 = var3.method5128(0);
                class758.method5498(false);
                class35.method358((byte) -37, var414, var413);
                arg0.field11112 = null;
                return true;
            } else if (class532.field7704 == arg0.field11112) {
                int var415 = var3.method5116((byte) -118);
                int var416 = var3.method5113(18443);
                if (class254.field3637 == null) {
                    class254.field3637 = new Object[class272.field3853.field1214];
                }
                class254.field3637[var415] = Integer.valueOf(var416);
                class379.field5541[class434.method3377(class604.field8656++, 31)] = var415;
                arg0.field11112 = null;
                return true;
            } else if (class239.field3450 == arg0.field11112) {
                class626.method4595((byte) 5, class279.field3939);
                arg0.field11112 = null;
                return true;
            } else if (class410.field5919 == arg0.field11112) {
                int var417 = var3.method5149(18547);
                int var418 = var3.method5101(false);
                int var419 = var3.method5101(false);
                class758.method5498(false);
                class433.method3372(var417, -102, var418, var419);
                arg0.field11112 = null;
                return true;
            } else if (class677.field9493 == arg0.field11112) {
                class758.method5498(false);
                class169.method1420(34);
                arg0.field11112 = null;
                return true;
            } else if (class430.field6241 == arg0.field11112) {
                int var420 = var3.method5116((byte) -121);
                byte var421 = var3.method5125((byte) -117);
                if (class254.field3637 == null) {
                    class254.field3637 = new Object[class272.field3853.field1214];
                }
                class254.field3637[var420] = Integer.valueOf(var421);
                class379.field5541[class434.method3377(class604.field8656++, 31)] = var420;
                arg0.field11112 = null;
                return true;
            } else if (class290.field4092 == arg0.field11112) {
                int var422 = var3.method5130(false);
                int var423 = var3.method5116((byte) -119);
                int var424 = var3.method5140((byte) -2);
                int var425 = var3.method5128(0);
                class758.method5498(false);
                class590.method4354(var424, var423, (byte) 97, var422, var425);
                arg0.field11112 = null;
                return true;
            } else if (class620.field8827 == arg0.field11112) {
                class391.field5712 = class522.field7612;
                arg0.field11112 = null;
                class502.field7330 = 1;
                return true;
            } else if (class47.field689 == arg0.field11112) {
                int var426 = var3.method5116((byte) -108);
                String var427 = var3.method5144(-16414);
                boolean var428 = var3.method5128(0) == 1;
                class596.field8570 = var428;
                class176.field2306 = class467.field6812;
                class778.method5599(var426, arg1 ^ 0xFFFF9FDC, var427);
                Object var429 = null;
                class699.method5035(15, 31754);
                arg0.field11112 = null;
                return false;
            } else if (class225.field3272 == arg0.field11112) {
                int var430 = var3.method5113(18443);
                int var431 = var3.method5140((byte) -2);
                class758.method5498(false);
                class303.method2435(var430, var431, (byte) 124);
                arg0.field11112 = null;
                return true;
            } else if (class622.field8860 == arg0.field11112) {
                int var432 = var3.method5116((byte) -124);
                int var433 = var3.method5149(18547);
                int var434 = var3.method5146(-31933);
                int var435 = var3.method5146(-31933);
                class758.method5498(false);
                class327.method2581(var432, var434, true, var433, var435);
                arg0.field11112 = null;
                return true;
            } else if (class248.field3558 == arg0.field11112) {
                int var436 = var3.method5128(0);
                boolean var437 = (var436 & 0x1) == 1;
                String var438 = var3.method5144(-16414);
                String var439 = var3.method5144(arg1 - 16413);
                if (var439.equals("")) {
                    var439 = var438;
                }
                String var440 = var3.method5144(-16414);
                String var441 = var3.method5144(-16414);
                if (var441.equals("")) {
                    var441 = var440;
                }
                if (var437) {
                    for (int var442 = 0; var442 < field9683; var442++) {
                        if (class599.field8597[var442].equals(var441)) {
                            class49.field710[var442] = var438;
                            class599.field8597[var442] = var439;
                            class180.field2342[var442] = var440;
                            class46.field657[var442] = var441;
                            break;
                        }
                    }
                } else {
                    class49.field710[field9683] = var438;
                    class599.field8597[field9683] = var439;
                    class180.field2342[field9683] = var440;
                    class46.field657[field9683] = var441;
                    class412.field5930[field9683] = class434.method3377(var436, 2) == 2;
                    field9683++;
                }
                class391.field5712 = class522.field7612;
                arg0.field11112 = null;
                return true;
            } else if (class384.field5612 == arg0.field11112) {
                int var443 = var3.method5132((byte) 16);
                int var444 = var3.method5134(arg1 - 18631);
                int var445 = var3.method5128(0);
                int var446 = var3.method5116((byte) -108) << 2;
                int var447 = var3.method5134(-18632);
                class758.method5498(false);
                class574.method4270(var447, var444, 16383, var443, var445, var446);
                arg0.field11112 = null;
                return true;
            } else if (class10.field131 == arg0.field11112) {
                class758.method5498(false);
                class323.method2557(0);
                arg0.field11112 = null;
                return true;
            } else if (class441.field6512 == arg0.field11112) {
                int var448 = var3.method5116((byte) -120);
                int var449 = var3.method5113(18443);
                class758.method5498(false);
                class337.method2712(12, var449, var448);
                arg0.field11112 = null;
                return true;
            } else if (class767.field10959 == arg0.field11112) {
                boolean var450 = var3.method5128(arg1 + 1) == 1;
                String var451 = var3.method5144(-16414);
                String var452 = var451;
                if (var450) {
                    var452 = var3.method5144(-16414);
                }
                long var453 = var3.method5147((byte) 110);
                long var455 = (long) var3.method5116((byte) -121);
                long var457 = (long) var3.method5085(true);
                int var459 = var3.method5128(0);
                int var460 = var3.method5116((byte) -106);
                long var461 = (var455 << 32) + var457;
                boolean var463 = false;
                int var464 = 0;
                while (true) {
                    if (var464 >= 100) {
                        if (var459 <= 1 && class553.method4133(var452, 0)) {
                            var463 = true;
                        }
                        break;
                    }
                    if (class353.field5112[var464] == var461) {
                        var463 = true;
                        break;
                    }
                    var464++;
                }
                if (!var463 && class725.field10314 == 0) {
                    class353.field5112[class779.field11092] = var461;
                    class779.field11092 = (class779.field11092 + 1) % 100;
                    String var465 = class591.field8501.method4619(var460, arg1 ^ 0x17B).method5171(var3, (byte) 2);
                    if (var459 == 2) {
                        class405.method3173(var451, 20, field9684[10] + var452, var465, (byte) -104, class98.method966(var453, arg1 + 6), field9684[10] + var451, var460, 0);
                    } else if (var459 == 1) {
                        class405.method3173(var451, 20, field9684[11] + var452, var465, (byte) -79, class98.method966(var453, 5), field9684[11] + var451, var460, 0);
                    } else {
                        class405.method3173(var451, 20, var452, var465, (byte) -91, class98.method966(var453, 5), var451, var460, 0);
                    }
                }
                arg0.field11112 = null;
                return true;
            } else if (class50.field715 == arg0.field11112) {
                class350.field5073 = var3.method5128(0);
                class190.field2522 = class522.field7612;
                arg0.field11112 = null;
                return true;
            } else if (class247.field3536 == arg0.field11112) {
                class626.method4595((byte) 5, class592.field8525);
                arg0.field11112 = null;
                return true;
            } else if (class117.field1481 == arg0.field11112) {
                int var466 = var3.method5130(false);
                int var467 = var3.method5120((byte) 51);
                class758.method5498(false);
                class509 var468 = (class509) class104.field1375.method3693(false, (long) var467);
                class509 var469 = (class509) class104.field1375.method3693(false, (long) var466);
                if (var469 != null) {
                    class394.method3082(var469, var468 == null || var468.field7472 != var469.field7472, false, -4438);
                }
                if (var468 != null) {
                    var468.method4294(0);
                    class104.field1375.method3691(var468, (long) var466, arg1);
                }
                class782 var470 = class435.method3389(var467, (byte) -120);
                if (var470 != null) {
                    class97.method959(var470, -1);
                }
                class782 var471 = class435.method3389(var466, (byte) -124);
                if (var471 != null) {
                    class97.method959(var471, arg1);
                    class530.method4011(true, false, var471);
                }
                if (class572.field8291 != -1) {
                    class149.method1270(1, class572.field8291, arg1 ^ 0x56B9);
                }
                arg0.field11112 = null;
                return true;
            } else if (class51.field725 == arg0.field11112) {
                int var472 = var3.method5116((byte) -115) << 2;
                int var473 = var3.method5128(0);
                int var474 = var3.method5132((byte) 16);
                int var475 = var3.method5119(117);
                int var476 = var3.method5132((byte) 16);
                class758.method5498(false);
                class115.method1060(var475, var473, 2, true, var474, var476, var472);
                arg0.field11112 = null;
                return true;
            } else if (class156.field1973 == arg0.field11112) {
                if (class321.field4374 != null) {
                    class585.method4331(-1, -1, class451.field6612.field9129.method1595(arg1 ^ 0xFFFFFFFC), true, false);
                }
                byte[] var477 = new byte[arg0.field11105];
                var3.method3687(var477, arg0.field11105, 0, arg1 ^ 0x78);
                String var478 = class201.method1728(0, arg0.field11105, -11887, var477);
                class8.method57(var478, true, true, class651.field9249, class451.field6612.field9134.method4717(3) == 1);
                arg0.field11112 = null;
                return true;
            } else if (class378.field5521 == arg0.field11112) {
                class626.method4595((byte) 5, class409.field5913);
                arg0.field11112 = null;
                return true;
            } else {
                class162.method1374(null, field9684[5] + (arg0.field11112 == null ? -1 : arg0.field11112.method2169(-12884)) + "," + (arg0.field11103 == null ? -1 : arg0.field11103.method2169(-12884)) + "," + (arg0.field11113 == null ? -1 : arg0.field11113.method2169(arg1 - 12883)) + field9684[7] + arg0.field11105, (byte) -93);
                class794.method5727(-1, false);
                return true;
            }
        } catch (RuntimeException var480) {
            throw class665.method4799(var480, field9684[9] + (arg0 == null ? field9684[0] : field9684[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(ILlga;I)Lcd;")
    public static final class161 method4940(int arg0, class47 arg1, int arg2) {
        try {
            field9679++;
            byte[] var3 = arg1.method520((byte) 108, arg0);
            if (var3 == null) {
                return null;
            } else {
                if (arg2 != 3) {
                    method4937(-38);
                }
                return new class161(var3);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9684[1] + arg0 + ',' + (arg1 == null ? field9684[0] : field9684[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4941(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4942(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 113;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
