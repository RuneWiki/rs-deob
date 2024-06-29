import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class94 extends class509 {

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "[[Z")
    public static boolean[][] field1396;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "Lwf;")
    public static class88 field1399;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Lrm;")
    public static class281 field1394;

    static {
        new class475("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field1396 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };
        field1397 = 0;
        field1398 = 0;
        field1399 = new class88();
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V", line = 5)
    public static void method545(int arg0) {
        if (arg0 == 1) {
            field1399 = null;
            field1394 = null;
            field1396 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljd;Lfl;)V", line = 17)
    public static final void method546(class152 arg0, class518 arg1) {
        if (!arg1.field7560) {
            return;
        }
        short var2 = arg1.field7568;
        short var3 = arg1.field7565;
        byte var4 = arg1.field7549;
        byte var5 = arg1.field7553;
        int var6 = (var2 << class192.field2815) + class143.field2134;
        int var7 = (var3 << class192.field2815) + class143.field2134;
        class518[][] var8 = class108.field1553[var4];
        float var9;
        if (class86.field1324 == class31.field335) {
            class271.field3941.method1021(class307.field4415[0].method202(var6, var7), class152.method990(var2, var3), class275.method1801(var2, var3), class46.method288(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class271.field3941.method1039(3000.0F, var9 * 1.5F);
        if (arg1.field7566) {
            if (class209.field3029) {
                if (var4 > 0) {
                    class518 var10 = class108.field1553[var4 - 1][var2][var3];
                    if (var10 != null && var10.field7560) {
                        return;
                    }
                }
                if (var2 <= class381.field5776 && var2 > class14.field173) {
                    class518 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field7560 && (var11.field7566 || (arg1.field7567 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class381.field5776 && var2 < class147.field2175 - 1) {
                    class518 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field7560 && (var12.field7566 || (arg1.field7567 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class346.field4983 && var3 > class23.field237) {
                    class518 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field7560 && (var13.field7566 || (arg1.field7567 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class346.field4983 && var3 < class18.field193 - 1) {
                    class518 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field7560 && (var14.field7566 || (arg1.field7567 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class209.field3029 = true;
            }
            arg1.field7566 = false;
            if (arg1.field7571 != null) {
                class518 var15 = arg1.field7571;
                class271.field3941.method1039(3000.0F, (201.5F - (float) (var15.field7553 + 1) * 50.0F) * 1.5F);
                if (!class186.method1279(var15.field7553, var2, var3)) {
                    class86.field1324[var15.field7553].method204(var2, var3);
                }
                class364 var16 = var15.field7559;
                if (var16 != null) {
                    if (class420.field6326) {
                        if ((var16.field5574 & arg1.field7554) == 0) {
                            class23.method147(arg0, var4, var2, var3);
                        } else {
                            class51.method317(arg0, var16.field5574, var5, var2, var3);
                        }
                        class271.field3941.method1068(arg0.field2259, arg0.field2265);
                    }
                    var16.method12(125, class271.field3941);
                }
                for (class284 var17 = var15.field7569; var17 != null; var17 = var17.field4087) {
                    class117 var18 = var17.field4083;
                    if (var18 != null) {
                        if (class420.field6326) {
                            class23.method147(arg0, var4, var2, var3);
                            class271.field3941.method1068(arg0.field2259, arg0.field2265);
                        }
                        var18.method12(121, class271.field3941);
                    }
                }
                class271.field3941.method1039(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class186.method1279(var5, var2, var3);
            if (var19) {
                class86.field1324[var5].method204(var2, var3);
                class185 var20 = arg1.field7550;
                if (var20 != null && var20.field2748) {
                    if (var20.field2750) {
                        class271.field3941.method1039(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class420.field6326) {
                        class23.method147(arg0, var4, var2, var3);
                        class271.field3941.method1068(arg0.field2259, arg0.field2265);
                    }
                    class405 var21 = var20.method12(127, class271.field3941);
                    if (var21 != null) {
                        var21.field6109 = var20;
                        var21.field6110 = var4;
                        var21.field6117 = var2;
                        var21.field6112 = var3;
                        class118.field1784.method1878(2, var21);
                    }
                    if (var20.field2750) {
                        class271.field3941.method1039(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class364 var24 = arg1.field7559;
            class522 var25 = arg1.field7551;
            if (var24 != null || var25 != null) {
                if (class381.field5776 == var2) {
                    var22++;
                } else if (class381.field5776 < var2) {
                    var22 += 2;
                }
                if (class346.field4983 == var3) {
                    var22 += 3;
                } else if (class346.field4983 > var3) {
                    var22 += 6;
                }
                var23 = class370.field5660[var22];
                arg1.field7554 = class221.field3281[var22];
            }
            if (var24 != null) {
                if ((var24.field5574 & class515.field7517[var22]) == 0) {
                    arg1.field7555 = 0;
                } else if (var24.field5574 == 16) {
                    arg1.field7555 = 3;
                    arg1.field7556 = class322.field4616[var22];
                    arg1.field7572 = (byte) (3 - arg1.field7556);
                } else if (var24.field5574 == 32) {
                    arg1.field7555 = 6;
                    arg1.field7556 = class24.field260[var22];
                    arg1.field7572 = (byte) (6 - arg1.field7556);
                } else if (var24.field5574 == 64) {
                    arg1.field7555 = 12;
                    arg1.field7556 = class457.field6761[var22];
                    arg1.field7572 = (byte) (12 - arg1.field7556);
                } else {
                    arg1.field7555 = 9;
                    arg1.field7556 = class233.field3457[var22];
                    arg1.field7572 = (byte) (9 - arg1.field7556);
                }
                if ((var24.field5574 & var23) != 0 && !class461.method2775(var5, var2, var3, var24.field5574)) {
                    if (class420.field6326) {
                        class23.method147(arg0, var4, var2, var3);
                        class271.field3941.method1068(arg0.field2259, arg0.field2265);
                    }
                    class405 var26 = var24.method12(123, class271.field3941);
                    if (var26 != null) {
                        var26.field6109 = var24;
                        var26.field6110 = var4;
                        var26.field6117 = var2;
                        var26.field6112 = var3;
                        class118.field1784.method1878(2, var26);
                    }
                }
                class364 var27 = arg1.field7570;
                if (var27 != null && (var27.field5574 & var23) != 0 && !class461.method2775(var5, var2, var3, var27.field5574)) {
                    if (class420.field6326) {
                        class23.method147(arg0, var4, var2, var3);
                        class271.field3941.method1068(arg0.field2259, arg0.field2265);
                    }
                    class405 var28 = var27.method12(126, class271.field3941);
                    if (var28 != null) {
                        var28.field6109 = var27;
                        var28.field6110 = var4;
                        var28.field6117 = var2;
                        var28.field6112 = var3;
                        class118.field1784.method1878(2, var28);
                    }
                }
            }
            if (var25 != null && !class336.method2047(var5, var2, var3, var25.method1177((byte) 104))) {
                class522 var29 = arg1.field7552;
                class271.field3941.method1039(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field7729 & var23) != 0) {
                    if (class420.field6326) {
                        class23.method147(arg0, var4, var2, var3);
                        class271.field3941.method1068(arg0.field2259, arg0.field2265);
                    }
                    class405 var30 = var25.method12(124, class271.field3941);
                    if (var30 != null) {
                        var30.field6109 = var25;
                        var30.field6110 = var4;
                        var30.field6117 = var2;
                        var30.field6112 = var3;
                        class118.field1784.method1878(2, var30);
                    }
                } else if (var25.field7729 == 256) {
                    int var31 = var25.field7731 - class45.field722;
                    int var32 = var25.field7734 - class170.field2527;
                    int var33 = var25.field7737;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class420.field6326) {
                        class23.method147(arg0, var4, var2, var3);
                        class271.field3941.method1068(arg0.field2259, arg0.field2265);
                    }
                    if (var35 < var34) {
                        class405 var36 = var25.method12(123, class271.field3941);
                        if (var36 != null) {
                            var36.field6109 = var25;
                            var36.field6110 = var4;
                            var36.field6117 = var2;
                            var36.field6112 = var3;
                            class118.field1784.method1878(2, var36);
                        }
                    } else if (var29 != null) {
                        class405 var37 = var29.method12(124, class271.field3941);
                        if (var37 != null) {
                            var37.field6109 = var29;
                            var37.field6110 = var4;
                            var37.field6117 = var2;
                            var37.field6112 = var3;
                            class118.field1784.method1878(2, var37);
                        }
                    }
                }
                class271.field3941.method1039(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class185 var38 = arg1.field7550;
                if (var38 != null && !var38.field2748) {
                    if (var38.field2750) {
                        class271.field3941.method1039(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class420.field6326) {
                        class23.method147(arg0, var4, var2, var3);
                        class271.field3941.method1068(arg0.field2259, arg0.field2265);
                    }
                    class405 var39 = var38.method12(127, class271.field3941);
                    if (var39 != null) {
                        var39.field6109 = var38;
                        var39.field6110 = var4;
                        var39.field6117 = var2;
                        var39.field6112 = var3;
                        class118.field1784.method1878(2, var39);
                    }
                    if (var38.field2750) {
                        class271.field3941.method1039(3000.0F, var9 * 1.5F);
                    }
                }
                class18 var40 = arg1.field7563;
                if (var40 != null && !var40.field190) {
                    if (class420.field6326) {
                        class23.method147(arg0, var4, var2, var3);
                        class271.field3941.method1068(arg0.field2259, arg0.field2265);
                    }
                    class405 var41 = var40.method12(124, class271.field3941);
                    if (var41 != null) {
                        var41.field6109 = var40;
                        var41.field6110 = var4;
                        var41.field6117 = var2;
                        var41.field6112 = var3;
                        class118.field1784.method1878(2, var41);
                    }
                }
            }
            byte var42 = arg1.field7567;
            if (var42 != 0) {
                if (var2 < class381.field5776 && (var42 & 0x4) != 0) {
                    class518 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field7560) {
                        class42.field640.method946(-98, var43);
                    }
                }
                if (var3 < class346.field4983 && (var42 & 0x2) != 0) {
                    class518 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field7560) {
                        class42.field640.method946(-102, var44);
                    }
                }
                if (var2 > class381.field5776 && (var42 & 0x1) != 0) {
                    class518 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field7560) {
                        class42.field640.method946(-104, var45);
                    }
                }
                if (var3 > class346.field4983 && (var42 & 0x8) != 0) {
                    class518 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field7560) {
                        class42.field640.method946(-88, var46);
                    }
                }
            }
        }
        if (arg1.field7555 != 0) {
            boolean var47 = true;
            for (class284 var48 = arg1.field7569; var48 != null; var48 = var48.field4087) {
                if (class337.field4744 != var48.field4083.field1773 && (var48.field4080 & arg1.field7555) == arg1.field7556) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class364 var49 = arg1.field7559;
                if (!class461.method2775(var5, var2, var3, var49.field5574)) {
                    if (class420.field6326) {
                        label682: {
                            if (var49.field5574 >= 16) {
                                int var50 = var2 - class381.field5776;
                                int var51 = var3 - class346.field4983;
                                if (var49.field5574 == 16) {
                                    int var52 = var50 - class143.field2134;
                                    int var53 = class143.field2134 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class484.field7096) {
                                        class23.method147(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field5574 == 32) {
                                    int var54 = class143.field2134 + var50;
                                    int var55 = class143.field2134 + var51;
                                    if (var55 < -var54 && var2 < class361.field5554 && var3 < class484.field7096) {
                                        class23.method147(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field5574 == 64) {
                                    int var56 = class143.field2134 + var50;
                                    int var57 = var51 - class143.field2134;
                                    if (var57 > var56 && var2 < class361.field5554 && var3 > 0) {
                                        class23.method147(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field5574 == 128) {
                                    int var58 = var50 - class143.field2134;
                                    int var59 = var51 - class143.field2134;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class23.method147(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class23.method147(arg0, var4, var2, var3);
                        }
                        class271.field3941.method1068(arg0.field2259, arg0.field2265);
                    }
                    class405 var60 = var49.method12(123, class271.field3941);
                    if (var60 != null) {
                        var60.field6109 = var49;
                        var60.field6110 = var4;
                        var60.field6117 = var2;
                        var60.field6112 = var3;
                        class118.field1784.method1878(2, var60);
                    }
                }
                arg1.field7555 = 0;
            }
        }
        if (arg1.field7557) {
            try {
                arg1.field7557 = false;
                int var61 = 0;
                label625: for (class284 var62 = arg1.field7569; var62 != null; var62 = var62.field4087) {
                    class117 var63 = var62.field4083;
                    if (class337.field4744 != var63.field1773) {
                        for (int var64 = var63.field1762; var64 <= var63.field1770; var64++) {
                            for (int var65 = var63.field1771; var65 <= var63.field1765; var65++) {
                                class518 var66 = var8[var64][var65];
                                if (var66.field7566) {
                                    arg1.field7557 = true;
                                    continue label625;
                                }
                                if (var66.field7555 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field1762) {
                                        var67++;
                                    }
                                    if (var64 < var63.field1770) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field1771) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field1765) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field7555) == arg1.field7572) {
                                        arg1.field7557 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class381.field5776 - var63.field1762;
                        int var69 = var63.field1770 - class381.field5776;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class346.field4983 - var63.field1771;
                        int var71 = var63.field1765 - class346.field4983;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field2264[var61] = var63;
                        arg0.field2263[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class117 var75 = arg0.field2264[var74];
                        if (class337.field4744 != var75.field1773) {
                            int var76 = arg0.field2263[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field1763 - class45.field722;
                                int var78 = var75.field1769 - class170.field2527;
                                int var79 = arg0.field2264[var73].field1763 - class45.field722;
                                int var80 = arg0.field2264[var73].field1769 - class170.field2527;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class117 var81 = arg0.field2264[var73];
                    var81.field1773 = class337.field4744;
                    if (!class30.method174(var5, var81.field1762, var81.field1770, var81.field1771, var81.field1765, var81.method283(16490))) {
                        if (class420.field6326) {
                            if (var81.field1761 == 0) {
                                class114.method759(arg0, var4, var81.field1762, var81.field1771, var81.field1770, var81.field1765);
                            } else {
                                class23.method147(arg0, var4, var2, var3);
                                int var82 = var2 - class381.field5776;
                                int var83 = var3 - class346.field4983;
                                if (var81.field1761 == 2) {
                                    if (var83 > -var82) {
                                        class323.method2006(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class323.method2006(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class323.method2006(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class323.method2006(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class271.field3941.method1068(arg0.field2259, arg0.field2265);
                        }
                        class405 var84 = var81.method12(123, class271.field3941);
                        if (var84 != null) {
                            var84.field6109 = var81;
                            var84.field6110 = var4;
                            var84.field6117 = var81.field1762;
                            var84.field6112 = var81.field1771;
                            class118.field1784.method1878(2, var84);
                        }
                    }
                    for (int var85 = var81.field1762; var85 <= var81.field1770; var85++) {
                        for (int var86 = var81.field1771; var86 <= var81.field1765; var86++) {
                            class518 var87 = var8[var85][var86];
                            if (var87.field7555 != 0) {
                                class42.field640.method946(-74, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field7560) {
                                class42.field640.method946(-75, var87);
                            }
                        }
                    }
                }
                if (arg1.field7557) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field7557 = false;
            }
        }
        if (arg1.field7564 != null && (byte) (class80.field1219 & 0xFF) == arg1.field7562) {
            class389 var88 = arg1.field7564;
            int var89 = class86.field1324[var4].method201(var2, var3);
            int var90;
            if (var4 < class208.field2979 - 1) {
                var90 = class86.field1324[var4].method201(var2, var3) - class86.field1324[var4 + 1].method201(var2, var3);
            } else {
                var90 = 0x8 << class192.field2815;
            }
            class34.field354.method908(var6, var89, var7, arg0.field2261);
            int var91 = arg0.field2261[2];
            class34.field354.method908(var6, var89 - var90, var7, arg0.field2261);
            int var92 = arg0.field2261[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class85.field1314;
            int var96 = class85.field1314 + var94;
            var88.field5875 = var95;
            var88.field5874 = var96;
            var88.field5873 = true;
            class271.field3941.method1095(var88);
        }
        if (!arg1.field7560) {
            return;
        }
        if (arg1.field7555 != 0) {
            return;
        }
        if (var2 <= class381.field5776 && var2 > class14.field173) {
            class518 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field7560) {
                return;
            }
        }
        if (var2 >= class381.field5776 && var2 < class147.field2175 - 1) {
            class518 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field7560) {
                return;
            }
        }
        if (var3 <= class346.field4983 && var3 > class23.field237) {
            class518 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field7560) {
                return;
            }
        }
        if (var3 >= class346.field4983 && var3 < class18.field193 - 1) {
            class518 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field7560) {
                return;
            }
        }
        arg1.field7560 = false;
        class98.field1439--;
        class18 var101 = arg1.field7563;
        if (var101 != null && var101.field190) {
            if (class420.field6326) {
                class23.method147(arg0, var4, var2, var3);
                class271.field3941.method1068(arg0.field2259, arg0.field2265);
            }
            class405 var102 = var101.method12(124, class271.field3941);
            if (var102 != null) {
                var102.field6109 = var101;
                var102.field6110 = var4;
                var102.field6117 = var2;
                var102.field6112 = var3;
                class118.field1784.method1878(2, var102);
            }
        }
        if (arg1.field7554 != 0) {
            class522 var103 = arg1.field7551;
            if (var103 != null && !class336.method2047(var5, var2, var3, var103.method1177((byte) 95))) {
                if ((var103.field7729 & arg1.field7554) != 0) {
                    if (class420.field6326) {
                        class23.method147(arg0, var4, var2, var3);
                        class271.field3941.method1068(arg0.field2259, arg0.field2265);
                    }
                    class405 var104 = var103.method12(121, class271.field3941);
                    if (var104 != null) {
                        var104.field6109 = var103;
                        var104.field6110 = var4;
                        var104.field6117 = var2;
                        var104.field6112 = var3;
                        class118.field1784.method1878(2, var104);
                    }
                } else if (var103.field7729 == 256) {
                    int var105 = var103.field7731 - class45.field722;
                    int var106 = var103.field7734 - class170.field2527;
                    int var107 = var103.field7737;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class420.field6326) {
                        class23.method147(arg0, var4, var2, var3);
                        class271.field3941.method1068(arg0.field2259, arg0.field2265);
                    }
                    class522 var110 = arg1.field7552;
                    if (var109 > var108) {
                        class405 var111 = var103.method12(125, class271.field3941);
                        if (var111 != null) {
                            var111.field6109 = var103;
                            var111.field6110 = var4;
                            var111.field6117 = var2;
                            var111.field6112 = var3;
                            class118.field1784.method1878(2, var111);
                        }
                    } else if (var110 != null) {
                        class405 var112 = var110.method12(121, class271.field3941);
                        if (var112 != null) {
                            var112.field6109 = var110;
                            var112.field6110 = var4;
                            var112.field6117 = var2;
                            var112.field6112 = var3;
                            class118.field1784.method1878(2, var112);
                        }
                    }
                }
            }
            class364 var113 = arg1.field7559;
            class364 var114 = arg1.field7570;
            if (var114 != null && (var114.field5574 & arg1.field7554) != 0 && !class461.method2775(var5, var2, var3, var114.field5574)) {
                if (class420.field6326) {
                    class51.method317(arg0, var114.field5574, var4, var2, var3);
                    class271.field3941.method1068(arg0.field2259, arg0.field2265);
                }
                class405 var115 = var114.method12(125, class271.field3941);
                if (var115 != null) {
                    var115.field6109 = var114;
                    var115.field6110 = var4;
                    var115.field6117 = var2;
                    var115.field6112 = var3;
                    class118.field1784.method1878(2, var115);
                }
            }
            if (var113 != null && (var113.field5574 & arg1.field7554) != 0 && !class461.method2775(var5, var2, var3, var113.field5574)) {
                if (class420.field6326) {
                    class51.method317(arg0, var113.field5574, var4, var2, var3);
                    class271.field3941.method1068(arg0.field2259, arg0.field2265);
                }
                class405 var116 = var113.method12(126, class271.field3941);
                if (var116 != null) {
                    var116.field6109 = var113;
                    var116.field6110 = var4;
                    var116.field6117 = var2;
                    var116.field6112 = var3;
                    class118.field1784.method1878(2, var116);
                }
            }
        }
        if (var4 < class208.field2979 - 1) {
            class518 var117 = class108.field1553[var4 + 1][var2][var3];
            if (var117 != null && var117.field7560) {
                class42.field640.method953(var117, (byte) -91);
            }
        }
        if (var2 < class381.field5776) {
            class518 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field7560) {
                class42.field640.method946(-116, var118);
            }
        }
        if (var3 < class346.field4983) {
            class518 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field7560) {
                class42.field640.method946(-77, var119);
            }
        }
        if (var2 > class381.field5776) {
            class518 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field7560) {
                class42.field640.method946(-88, var120);
            }
        }
        if (var3 > class346.field4983) {
            class518 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field7560) {
                class42.field640.method946(-80, var121);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V", line = 1136)
    public static final void method547(int arg0) {
        field1395++;
        if (class242.field3573 == 5) {
            class242.field3573 = 6;
            if (arg0 != -20380) {
                method546(null, null);
            }
        }
    }
}
