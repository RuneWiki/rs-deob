import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class212 extends class271 {

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Lsc;")
    public class246 field3608;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field3606 = 0;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "Lwa;")
    public static class75 field3612 = class66.method560("scrollbar", false);

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "Lwa;")
    public static class75 field3614 = class66.method560("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", false);

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "Lvb;")
    public static class50 field3613 = null;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "[I")
    public static int[] field3610;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZIIZIZI)Lbh;", line = 11)
    public static final class258 method1563(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        field3609++;
        class278 var8 = class199.method1475(arg7, (byte) 109);
        if (arg2 > 1 && var8.field4767 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg2 >= var8.field4796[var10] && var8.field4796[var10] != 0) {
                    var9 = var8.field4767[var10];
                }
            }
            if (var9 != -1) {
                var8 = class199.method1475(var9, (byte) 126);
            }
        }
        class208 var11 = var8.method1979(-107);
        if (var11 == null) {
            return null;
        }
        class181 var12 = null;
        if (var8.field4800 != -1) {
            var12 = (class181) method1563(true, arg1, 10, 1, false, 0, true, var8.field4795);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4776 != -1) {
            var12 = (class181) method1563(true, true, arg2, arg3, false, arg5, false, var8.field4772);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class44.field721;
        int var14 = class44.field717;
        int var15 = class44.field716;
        int[] var16 = new int[4];
        class44.method301(var16);
        class181 var17 = new class181(36, 32);
        class44.method298(var17.field3029, 36, 32);
        class21.method134();
        class21.method142(16, 16);
        int var18 = var8.field4820;
        class21.field280 = false;
        if (arg6) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg3 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class21.field288[var8.field4808] * var18 >> 16;
        int var20 = class21.field286[var8.field4808] * var18 >> 16;
        var11.method408(0, var8.field4762, var8.field4761, var8.field4808, var8.field4802, var19 + var8.field4780 - (var11.method443() / 2), var8.field4780 + var20);
        if (arg3 >= 1) {
            var17.method1331(1);
            if (arg3 >= 2) {
                var17.method1331(16777215);
            }
            class44.method298(var17.field3029, 36, 32);
        }
        if (arg5 != 0) {
            var17.method1329(arg5);
        }
        if (var8.field4800 != -1) {
            var12.method157(0, 0);
        } else if (var8.field4776 != -1) {
            class44.method298(var12.field3029, 36, 32);
            var17.method157(0, 0);
            var17 = var12;
        }
        if (arg4 && (var8.field4779 == 1 || arg2 != 1) && arg2 != -1) {
            class269.field4645.method784(class195.method1459(0, arg2), 0, 9, 16776960, 1);
        }
        class44.method298(var13, var14, var15);
        class44.method294(var16);
        class21.method134();
        class21.field280 = arg1;
        return arg0 ? var17 : new class277(var17);
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lsc;)V", line = 134)
    public class212(class246 arg0) {
        this.field3608 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V", line = 143)
    public static void method1564(int arg0) {
        field3612 = null;
        field3614 = null;
        if (arg0 == 16118) {
            field3610 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z", line = 155)
    public static final boolean method1565(int arg0, int arg1) {
        if (arg0 != -27287) {
            method1563(true, false, -110, 36, true, -65, false, 8);
        }
        field3604++;
        return (arg1 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lcl;IIIII)Ljava/awt/Frame;", line = 171)
    public static final Frame method1566(class124 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3611++;
        if (!arg0.method936((byte) -97)) {
            return null;
        }
        if (arg3 == arg4) {
            class89[] var6 = class176.method1298((byte) 122, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1474 == arg5 && var6[var8].field1464 == arg1 && (arg2 == 0 || var6[var8].field1481 == arg2) && (!var7 || arg3 < var6[var8].field1463)) {
                    var7 = true;
                    arg3 = var6[var8].field1463;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class77 var9 = arg0.method934(arg3, arg1, 1818742992, arg5, arg2);
        while (var9.field1330 == 0) {
            class235.method1708(92, 10L);
        }
        Frame var10 = (Frame) var9.field1329;
        if (var10 == null) {
            return null;
        } else if (var9.field1330 == 2) {
            class39.method264(arg0, var10, (byte) 16);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIII[Lre;III)V", line = 247)
    public static final void method1567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class262[] arg6, int arg7, int arg8, int arg9) {
        class222.method1638(arg0, arg9, arg7, arg1);
        for (int var10 = 0; var10 < arg6.length; var10++) {
            class262 var11 = arg6[var10];
            if (var11 != null && (var11.field4446 == arg2 || arg2 == -1412584499 && class270.field4675 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class217.field3716[class273.field4720] = var11.field4521 + arg3;
                    class157.field2698[class273.field4720] = var11.field4439 + arg4;
                    class120.field2024[class273.field4720] = var11.field4531;
                    class172.field2909[class273.field4720] = var11.field4517;
                    var12 = class273.field4720++;
                } else {
                    var12 = arg5;
                }
                var11.field4411 = class143.field2463;
                var11.field4489 = var12;
                if (!var11.field4540 || !client.method1737(var11)) {
                    if (var11.field4462 > 0) {
                        class230.method1683(var11, -81);
                    }
                    int var13 = var11.field4439 + arg4;
                    int var14 = var11.field4521 + arg3;
                    int var15 = var11.field4386;
                    if (class214.field3662 && (client.method1734(var11) != 0 || var11.field4441 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class270.field4675 == var11) {
                        if (arg2 != -1412584499 && !var11.field4426) {
                            class206.field3486 = arg3;
                            class65.field1126 = arg6;
                            class125.field2144 = arg4;
                            continue;
                        }
                        if (!var11.field4426) {
                            var15 = 128;
                        }
                        if (class285.field4916 && class260.field4356) {
                            int var16 = class66.field1135;
                            int var17 = var16 - class25.field328;
                            if (class93.field1516 > var17) {
                                var17 = class93.field1516;
                            }
                            if (class93.field1516 + class126.field2175.field4531 < var11.field4531 + var17) {
                                var17 = class93.field1516 + class126.field2175.field4531 - var11.field4531;
                            }
                            int var18 = class26.field351;
                            int var19 = var18 - class87.field1438;
                            var14 = var17;
                            if (var19 < class9.field118) {
                                var19 = class9.field118;
                            }
                            if (var19 + var11.field4517 > class9.field118 + class126.field2175.field4517) {
                                var19 = class9.field118 + class126.field2175.field4517 - var11.field4517;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field4441 == 2) {
                        var20 = arg7;
                        var21 = arg1;
                        var22 = arg0;
                        var23 = arg9;
                    } else {
                        var23 = arg9 >= var13 ? arg9 : var13;
                        var22 = arg0 < var14 ? var14 : arg0;
                        int var24 = var14 + var11.field4531;
                        int var25 = var13 + var11.field4517;
                        if (var11.field4441 == 9) {
                            var25++;
                            var24++;
                        }
                        var20 = var24 >= arg7 ? arg7 : var24;
                        var21 = var25 >= arg1 ? arg1 : var25;
                    }
                    if (!var11.field4540 || var20 > var22 && var23 < var21) {
                        if (var11.field4462 != 0) {
                            if (var11.field4462 == 1337 || var11.field4462 == 1403) {
                                class39.field618 = var14;
                                class61.field1069 = var13;
                                class176.field2960 = var11;
                                class59.method472(var11.field4531, var13, var11.field4462 == 1403, var11.field4517, var14, -125);
                                class222.method1638(arg0, arg9, arg7, arg1);
                                continue;
                            }
                            if (var11.field4462 == 1338) {
                                if (var11.method1866(-2)) {
                                    class244.method1770(var12, var13, var14, var11, (byte) -93);
                                    class222.method1638(arg0, arg9, arg7, arg1);
                                }
                                continue;
                            }
                            if (var11.field4462 == 1339) {
                                if (var11.method1866(-2)) {
                                    class64.method551(var12, var13, -17679, var14, var11);
                                    class222.method1638(arg0, arg9, arg7, arg1);
                                }
                                continue;
                            }
                            if (var11.field4462 == 1400) {
                                class189.method1426(var14, var11.field4531, var11.field4517, 104, var13);
                                class226.field3815[var12] = true;
                                class219.field3743[var12] = true;
                                class222.method1638(arg0, arg9, arg7, arg1);
                                continue;
                            }
                            if (var11.field4462 == 1401) {
                                class155.method1177(var11.field4517, var14, var13, var11.field4531, -71);
                                class226.field3815[var12] = true;
                                class219.field3743[var12] = true;
                                class222.method1638(arg0, arg9, arg7, arg1);
                                continue;
                            }
                            if (var11.field4462 == 1402) {
                                continue;
                            }
                            if (var11.field4462 == 1404) {
                                class286.method2014(class3.field28, var14, var13, 115, var11, class132.field2280, var11.field4517, var11.field4531);
                                class226.field3815[var12] = true;
                                class219.field3743[var12] = true;
                                continue;
                            }
                            if (var11.field4462 == 1405) {
                                if (!class73.field1228) {
                                    continue;
                                }
                                int var26 = var13 + 15;
                                int var27 = var11.field4531 + var14;
                                class269.field4654.method788(class66.method562((byte) 115, new class75[] { class17.field235, class67.method565(101, class61.field1082) }), var27, var26, 16776960, -1);
                                int var123 = var26 + 15;
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var30 = 16776960;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class269.field4654.method788(class66.method562((byte) 127, new class75[] { class200.field3378, class67.method565(116, var29), class41.field634 }), var27, var123, var30, -1);
                                var26 = var123 + 15;
                                int var31 = (class119.field2007 + class119.field2005 + class119.field2008) / 1024;
                                int var32 = 16776960;
                                if (var31 > 65536) {
                                    var32 = 16711680;
                                }
                                class269.field4654.method788(class66.method562((byte) -102, new class75[] { class39.field617, class67.method565(101, var31), class41.field634 }), var27, var26, var32, -1);
                                var26 += 15;
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 27; var37++) {
                                    var34 += class175.field2940[var37].method1410((byte) 107);
                                    var35 += class175.field2940[var37].method1412(-3);
                                    var36 += class175.field2940[var37].method1409(0);
                                }
                                int var38 = var36 * 100 / var34;
                                int var39 = var35 * 10000 / var34;
                                class75 var40 = class66.method562((byte) -42, new class75[] { class274.field4723, class166.method1233((long) var39, true, 2, 0, (byte) -29), class202.field3425, class67.method565(51, var38), class258.field4321 });
                                class132.field2280.method788(var40, var27, var26, var33, -1);
                                class226.field3815[var12] = true;
                                var26 += 12;
                                class219.field3743[var12] = true;
                                continue;
                            }
                        }
                        if (!class153.field2625) {
                            if (var11.field4441 == 0 && var11.field4456 && class152.field2623 >= var22 && class217.field3708 >= var23 && var20 > class152.field2623 && var21 > class217.field3708 && !class214.field3662) {
                                class99.field1646[0] = 1006;
                                class126.field2188 = 1;
                                class272.field4692[0] = class155.field2652;
                                class94.field1521[0] = class121.field2037;
                            }
                            if (var22 <= class152.field2623 && class217.field3708 >= var23 && var20 > class152.field2623 && var21 > class217.field3708) {
                                class25.method169(-92, var11, class152.field2623 - var14, class217.field3708 - var13);
                            }
                        }
                        if (var11.field4441 == 0) {
                            if (!var11.field4540 && client.method1737(var11) && class61.field1065 != var11) {
                                continue;
                            }
                            if (!var11.field4540) {
                                if (var11.field4501 > (var11.field4384 - var11.field4517)) {
                                    var11.field4501 = var11.field4384 - var11.field4517;
                                }
                                if (var11.field4501 < 0) {
                                    var11.field4501 = 0;
                                }
                            }
                            method1567(var22, var21, var11.field4418, var14 - var11.field4430, var13 - var11.field4501, var12, arg6, var20, -115, var23);
                            if (var11.field4532 != null) {
                                method1567(var22, var21, var11.field4418, var14 - var11.field4430, -var11.field4501 + var13, var12, var11.field4532, var20, -106, var23);
                            }
                            class93 var41 = (class93) class73.field1224.method1007((long) var11.field4418, -17004);
                            if (var41 != null) {
                                if (var41.field1519 == 0 && !class153.field2625 && var22 <= class152.field2623 && class217.field3708 >= var23 && var20 > class152.field2623 && class217.field3708 < var21 && !class214.field3662) {
                                    class99.field1646[0] = 1006;
                                    class126.field2188 = 1;
                                    class272.field4692[0] = class155.field2652;
                                    class94.field1521[0] = class121.field2037;
                                }
                                class79.method674(var22, var12, var41.field1518, (byte) 117, var13, var23, var14, var20, var21);
                            }
                            class222.method1638(arg0, arg9, arg7, arg1);
                        }
                        if (class218.field3727[var12] || class85.field1392 > 1) {
                            if (var11.field4441 == 0 && !var11.field4540 && var11.field4384 > var11.field4517) {
                                class79.method675(var13, 33, var11.field4517, var11.field4501, var11.field4384, var11.field4531 + var14);
                            }
                            if (var11.field4441 != 1) {
                                if (var11.field4441 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var11.field4408; var43++) {
                                        for (int var44 = 0; var44 < var11.field4429; var44++) {
                                            int var45 = (var11.field4387 + 32) * var43 + var13;
                                            int var46 = (var11.field4490 + 32) * var44 + var14;
                                            if (var42 < 20) {
                                                var45 += var11.field4476[var42];
                                                var46 += var11.field4388[var42];
                                            }
                                            if (var11.field4410[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var11.field4410[var42] - 1;
                                                if (var46 + 32 > arg0 && var46 < arg7 && (var45 + 32) > arg9 && var45 < arg1 || class299.field5120 == var11 && class272.field4701 == var42) {
                                                    class258 var50;
                                                    if (class13.field176 == 1 && class281.field4846 == var42 && class158.field2715 == var11.field4418) {
                                                        var50 = class219.method1598(42, var11.field4496[var42], var49, 0, var11.field4432, 2);
                                                    } else {
                                                        var50 = class219.method1598(117, var11.field4496[var42], var49, 3153952, var11.field4432, 1);
                                                    }
                                                    if (class21.field292) {
                                                        class226.field3815[var12] = true;
                                                    }
                                                    if (var50 == null) {
                                                        class291.method2027(var11, 14580);
                                                    } else if (class299.field5120 == var11 && class272.field4701 == var42) {
                                                        int var51 = class66.field1135 - class266.field4588;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        int var52 = class26.field351 - class90.field1483;
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (class170.field2860 < 5) {
                                                            var52 = 0;
                                                            var51 = 0;
                                                        }
                                                        var50.method154(var46 + var51, var45 - -var52, 128);
                                                        if (arg2 != -1) {
                                                            int var53 = class222.field3775;
                                                            int var54 = class222.field3774;
                                                            class262 var55 = arg6[arg2 & 0xFFFF];
                                                            if ((var45 + var52) < var53 && var55.field4501 > 0) {
                                                                int var56 = (var53 - var52 - var45) * class250.field4208 / 3;
                                                                if (var56 > (class250.field4208 * 10)) {
                                                                    var56 = class250.field4208 * 10;
                                                                }
                                                                if (var56 > var55.field4501) {
                                                                    var56 = var55.field4501;
                                                                }
                                                                class90.field1483 += var56;
                                                                var55.field4501 -= var56;
                                                                class291.method2027(var55, 14580);
                                                            }
                                                            if (var54 < (var45 + var52 + 32) && var55.field4501 < (var55.field4384 - var55.field4517)) {
                                                                int var57 = (var45 + var52 + 32 - var54) * class250.field4208 / 3;
                                                                if (class250.field4208 * 10 < var57) {
                                                                    var57 = class250.field4208 * 10;
                                                                }
                                                                if (var57 > (var55.field4384 - var55.field4501 - var55.field4517)) {
                                                                    var57 = var55.field4384 - var55.field4501 - var55.field4517;
                                                                }
                                                                var55.field4501 += var57;
                                                                class90.field1483 -= var57;
                                                                class291.method2027(var55, 14580);
                                                            }
                                                        }
                                                    } else if (class54.field896 == var11 && class310.field5291 == var42) {
                                                        var50.method154(var46, var45, 128);
                                                    } else {
                                                        var50.method157(var46, var45);
                                                    }
                                                }
                                            } else if (var11.field4416 != null && var42 < 20) {
                                                class258 var58 = var11.method1864(0, var42);
                                                if (var58 != null) {
                                                    var58.method157(var46, var45);
                                                } else if (class166.field2808) {
                                                    class291.method2027(var11, 14580);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var11.field4441 == 3) {
                                    int var121;
                                    if (class133.method1032(var11, 4)) {
                                        var121 = var11.field4528;
                                        if (class61.field1065 == var11 && var11.field4492 != 0) {
                                            var121 = var11.field4492;
                                        }
                                    } else {
                                        var121 = var11.field4497;
                                        if (class61.field1065 == var11 && var11.field4420 != 0) {
                                            var121 = var11.field4420;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field4469) {
                                            class222.method1632(var14, var13, var11.field4531, var11.field4517, var121);
                                        } else {
                                            class222.method1640(var14, var13, var11.field4531, var11.field4517, var121);
                                        }
                                    } else if (var11.field4469) {
                                        class222.method1641(var14, var13, var11.field4531, var11.field4517, var121, 256 - (var15 & 0xFF));
                                    } else {
                                        class222.method1630(var14, var13, var11.field4531, var11.field4517, var121, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field4441 == 4) {
                                    class101 var117 = var11.method1872(0, class24.field316);
                                    if (var117 != null) {
                                        class75 var118 = var11.field4396;
                                        int var119;
                                        if (class133.method1032(var11, 4)) {
                                            var119 = var11.field4528;
                                            if (class61.field1065 == var11 && var11.field4492 != 0) {
                                                var119 = var11.field4492;
                                            }
                                            if (var11.field4520.method640(1) > 0) {
                                                var118 = var11.field4520;
                                            }
                                        } else {
                                            var119 = var11.field4497;
                                            if (class61.field1065 == var11 && var11.field4420 != 0) {
                                                var119 = var11.field4420;
                                            }
                                        }
                                        if (var11.field4540 && var11.field4445 != -1) {
                                            class278 var120 = class199.method1475(var11.field4445, (byte) 109);
                                            var118 = var120.field4770;
                                            if (var118 == null) {
                                                var118 = class290.field4976;
                                            }
                                            if ((var120.field4779 == 1 || var11.field4495 != 1) && var11.field4495 != -1) {
                                                var118 = class66.method562((byte) 118, new class75[] { class98.field1631, var118, class138.field2361, class109.method856(var11.field4495, 97) });
                                            }
                                        }
                                        if (class286.field4929 == var11) {
                                            var119 = var11.field4497;
                                            var118 = class67.field1177;
                                        }
                                        if (!var11.field4540) {
                                            var118 = class237.method1723((byte) -59, var11, var118);
                                        }
                                        var117.method780(var118, var14, var13, var11.field4531, var11.field4517, var119, var11.field4453 ? 0 : -1, var11.field4454, var11.field4431, var11.field4413);
                                    } else if (class166.field2808) {
                                        class291.method2027(var11, 14580);
                                    }
                                } else if (var11.field4441 == 5) {
                                    if (var11.field4540) {
                                        class258 var103;
                                        if (var11.field4445 == -1) {
                                            var103 = var11.method1868(false, false);
                                        } else {
                                            var103 = class219.method1598(63, var11.field4495, var11.field4445, var11.field4422, var11.field4432, var11.field4523);
                                        }
                                        if (var103 != null) {
                                            int var104 = var103.field4325;
                                            int var105 = var103.field4335;
                                            if (var11.field4419) {
                                                int var107 = (var104 + var11.field4531 - 1) / var104;
                                                int var108 = (var105 + var11.field4517 - 1) / var105;
                                                class222.method1631(var14, var13, var14 + var11.field4531, var13 - -var11.field4517);
                                                boolean var109 = class242.method1767(var103.field4318, false);
                                                class277 var110 = (class277) var103;
                                                boolean var111 = class242.method1767(var103.field4320, false);
                                                if (var109 && var111) {
                                                    if (var15 == 0) {
                                                        var110.method1969(var14, var13, var107, var108);
                                                    } else {
                                                        var110.method1968(var14, var13, 256 - (var15 & 0xFF), var107, var108);
                                                    }
                                                } else if (var109) {
                                                    for (int var115 = 0; var115 < var108; var115++) {
                                                        if (var15 == 0) {
                                                            var110.method1969(var14, var105 * var115 + var13, var107, 1);
                                                        } else {
                                                            var110.method1968(var14, var13 + (var105 * var115), 256 - (var15 & 0xFF), var107, 1);
                                                        }
                                                    }
                                                } else if (var111) {
                                                    for (int var112 = 0; var112 < var107; var112++) {
                                                        if (var15 == 0) {
                                                            var110.method1969(var14 + (var104 * var112), var13, 1, var108);
                                                        } else {
                                                            var110.method1968(var104 * var112 + var14, var13, 256 - (var15 & 0xFF), 1, var108);
                                                        }
                                                    }
                                                } else {
                                                    for (int var113 = 0; var113 < var107; var113++) {
                                                        for (int var114 = 0; var114 < var108; var114++) {
                                                            if (var15 == 0) {
                                                                var103.method157(var104 * var113 + var14, var105 * var114 + var13);
                                                            } else {
                                                                var103.method154(var14 + (var104 * var113), var105 * var114 + var13, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                }
                                                class222.method1638(arg0, arg9, arg7, arg1);
                                            } else {
                                                int var106 = var11.field4531 * 4096 / var104;
                                                if (var11.field4480 != 0) {
                                                    var103.method1841(var14 + (var11.field4531 / 2), -30524, var11.field4480, var106, var11.field4517 / 2 + var13);
                                                } else if (var15 != 0) {
                                                    var103.method153(var14, var13, var11.field4531, var11.field4517, 256 - (var15 & 0xFF));
                                                } else if (var11.field4531 == var104 && var11.field4517 == var105) {
                                                    var103.method157(var14, var13);
                                                } else {
                                                    var103.method1340(var14, var13, var11.field4531, var11.field4517);
                                                }
                                            }
                                        } else if (class166.field2808) {
                                            class291.method2027(var11, 14580);
                                        }
                                    } else {
                                        class258 var116 = var11.method1868(class133.method1032(var11, 4), false);
                                        if (var116 != null) {
                                            var116.method157(var14, var13);
                                        } else if (class166.field2808) {
                                            class291.method2027(var11, 14580);
                                        }
                                    }
                                } else if (var11.field4441 == 6) {
                                    boolean var86 = class133.method1032(var11, 4);
                                    int var87;
                                    if (var86) {
                                        var87 = var11.field4493;
                                    } else {
                                        var87 = var11.field4447;
                                    }
                                    int var88 = 0;
                                    class234 var89 = null;
                                    if (var11.field4445 != -1) {
                                        class278 var94 = class199.method1475(var11.field4445, (byte) -52);
                                        if (var94 != null) {
                                            class278 var95 = var94.method1975(var11.field4495, false);
                                            class28 var96 = var87 == -1 ? null : class302.method2082(var87, 95);
                                            var89 = var95.method1982(-41, var96, var11.field4505, 1);
                                            if (var89 == null) {
                                                class291.method2027(var11, 14580);
                                            } else {
                                                var88 = -var89.method443() / 2;
                                            }
                                        }
                                    } else if (var11.field4467 == 5) {
                                        if (var11.field4535 == -1) {
                                            var89 = class306.field5231.method1642(-1, (class28) null, -1, (class28) null, Integer.MIN_VALUE);
                                        } else {
                                            int var90 = var11.field4535 & 0x7FF;
                                            if (class88.field1460 == var90) {
                                                var90 = 2047;
                                            }
                                            class96 var91 = class169.field2842[var90];
                                            class28 var92 = var87 == -1 ? null : class302.method2082(var87, 22);
                                            if (var91 != null && (int) var91.field1561.method630(-126) << 11 == (var11.field4535 & 0xFFFFF800)) {
                                                var89 = var91.field1564.method1642(var11.field4505, var92, 0, (class28) null, Integer.MIN_VALUE);
                                            }
                                        }
                                    } else if (var87 == -1) {
                                        var89 = var11.method1875(var86, (class28) null, 97, -1, class279.field4831.field1564);
                                        if (var89 == null && class166.field2808) {
                                            class291.method2027(var11, 14580);
                                        }
                                    } else {
                                        class28 var93 = class302.method2082(var87, 27);
                                        var89 = var11.method1875(var86, var93, 77, var11.field4505, class279.field4831.field1564);
                                        if (var89 == null && class166.field2808) {
                                            class291.method2027(var11, 14580);
                                        }
                                    }
                                    if (var89 != null) {
                                        int var97;
                                        if (var11.field4381 <= 0) {
                                            var97 = 256;
                                        } else {
                                            var97 = (var11.field4531 << 8) / var11.field4381;
                                        }
                                        int var98;
                                        if (var11.field4414 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field4517 << 8) / var11.field4414;
                                        }
                                        int var99 = var11.field4531 / 2 + (var11.field4488 * var97 >> 8) + var14;
                                        int var100 = var11.field4517 / 2 + var13 + (var11.field4417 * var98 >> 8);
                                        if (var11.field4397) {
                                            class47.method322(var99, var100, var11.field4463, var11.field4457, var97, var98);
                                        } else {
                                            class47.method341(var99, var100, var97, var98);
                                            class47.method332((float) var11.field4404, (float) var11.field4457 * 1.5F);
                                        }
                                        class47.method334();
                                        class47.method335(true);
                                        class47.method320(false);
                                        class29.method196(-42);
                                        if (class214.field3640) {
                                            class222.method1633();
                                            class47.method339();
                                            class222.method1638(arg0, arg9, arg7, arg1);
                                            class214.field3640 = false;
                                        }
                                        if (var11.field4461) {
                                            class47.method345();
                                        }
                                        int var101 = class21.field286[var11.field4477] * var11.field4463 >> 16;
                                        int var102 = class21.field288[var11.field4477] * var11.field4463 >> 16;
                                        if (var11.field4540) {
                                            var89.method408(0, var11.field4390, var11.field4395, var11.field4477, var11.field4392, var11.field4536 + var88 + var102, var11.field4536 + var101);
                                        } else {
                                            var89.method408(0, var11.field4390, 0, var11.field4477, 0, var102, var101);
                                        }
                                        if (var11.field4461) {
                                            class47.method325();
                                        }
                                    }
                                } else {
                                    if (var11.field4441 == 7) {
                                        class101 var59 = var11.method1872(0, class24.field316);
                                        if (var59 == null) {
                                            if (class166.field2808) {
                                                class291.method2027(var11, 14580);
                                            }
                                            continue;
                                        }
                                        int var60 = 0;
                                        for (int var61 = 0; var61 < var11.field4408; var61++) {
                                            for (int var62 = 0; var62 < var11.field4429; var62++) {
                                                if (var11.field4410[var60] > 0) {
                                                    class278 var63 = class199.method1475(var11.field4410[var60] - 1, (byte) -37);
                                                    class75 var64;
                                                    if (var63.field4779 != 1 && var11.field4496[var60] == 1) {
                                                        var64 = class66.method562((byte) 118, new class75[] { class98.field1631, var63.field4770, class211.field3593 });
                                                    } else {
                                                        var64 = class66.method562((byte) 117, new class75[] { class98.field1631, var63.field4770, class138.field2361, class109.method856(var11.field4496[var60], 59) });
                                                    }
                                                    int var65 = (var11.field4490 + 115) * var62 + var14;
                                                    int var66 = (var11.field4387 + 12) * var61 + var13;
                                                    if (var11.field4454 == 0) {
                                                        var59.method784(var64, var65, var66, var11.field4497, var11.field4453 ? 0 : -1);
                                                    } else if (var11.field4454 == 1) {
                                                        var59.method774(var64, var65 + 57, var66, var11.field4497, var11.field4453 ? 0 : -1);
                                                    } else {
                                                        var59.method788(var64, var65 + 115 - 1, var66, var11.field4497, var11.field4453 ? 0 : -1);
                                                    }
                                                }
                                                var60++;
                                            }
                                        }
                                    }
                                    if (var11.field4441 == 8 && class168.field2835 == var11 && class270.field4673 == class219.field3735) {
                                        int var67 = 0;
                                        int var68 = 0;
                                        class75 var69 = var11.field4396;
                                        class101 var70 = class269.field4654;
                                        class75 var71 = class237.method1723((byte) -93, var11, var69);
                                        while (var71.method640(1) > 0) {
                                            int var72 = var71.method657((byte) -106, class195.field3276);
                                            class75 var73;
                                            if (var72 == -1) {
                                                var73 = var71;
                                                var71 = class121.field2037;
                                            } else {
                                                var73 = var71.method661(79, 0, var72);
                                                var71 = var71.method650(0, var72 + 4);
                                            }
                                            int var74 = var70.method779(var73);
                                            if (var74 > var67) {
                                                var67 = var74;
                                            }
                                            var68 += var70.field1672 + 1;
                                        }
                                        var68 += 7;
                                        var67 += 6;
                                        int var75 = var13 - (-var11.field4517 - 5);
                                        int var76 = var14 + var11.field4531 - var67 - 5;
                                        if ((var14 + 5) > var76) {
                                            var76 = var14 + 5;
                                        }
                                        if (arg1 < var68 + var75) {
                                            var75 = arg1 - var68;
                                        }
                                        if ((var67 + var76) > arg7) {
                                            var76 = arg7 - var67;
                                        }
                                        class222.method1632(var76, var75, var67, var68, 16777120);
                                        class222.method1640(var76, var75, var67, var68, 0);
                                        int var77 = var70.field1672 + var75 + 2;
                                        class75 var78 = var11.field4396;
                                        class75 var79 = class237.method1723((byte) -30, var11, var78);
                                        while (var79.method640(1) > 0) {
                                            int var80 = var79.method657((byte) -23, class195.field3276);
                                            class75 var81;
                                            if (var80 == -1) {
                                                var81 = var79;
                                                var79 = class121.field2037;
                                            } else {
                                                var81 = var79.method661(91, 0, var80);
                                                var79 = var79.method650(0, var80 + 4);
                                            }
                                            var70.method784(var81, var76 + 3, var77, 0, -1);
                                            var77 += var70.field1672 + 1;
                                        }
                                    }
                                    if (var11.field4441 == 9) {
                                        int var82;
                                        int var83;
                                        int var84;
                                        int var85;
                                        if (var11.field4421) {
                                            var82 = var13;
                                            var83 = var11.field4517 + var13;
                                            var84 = var14;
                                            var85 = var11.field4531 + var14;
                                        } else {
                                            var82 = var11.field4517 + var13;
                                            var83 = var13;
                                            var85 = var14 + var11.field4531;
                                            var84 = var14;
                                        }
                                        if (var11.field4473 == 1) {
                                            class222.method1629(var84, var83, var85, var82, var11.field4497);
                                        } else {
                                            class222.method1628(var84, var83, var85, var82, var11.field4497, var11.field4473);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field3607++;
        int var122 = 50 / ((arg8 + 38) / 61);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIZ)V", line = 1360)
    public static final void method1568(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3605++;
        if (class99.field1642 == 1) {
            class24.field306[class89.field1468 / 100].method157(class213.field3624 - 8, class213.field3625 + -8);
        }
        if (!arg4) {
            field3614 = (class75) null;
        }
        if (class99.field1642 == 2) {
            class24.field306[class89.field1468 / 100 + 4].method157(class213.field3624 - 8, class213.field3625 + -8);
        }
        class102.method802((byte) -128);
    }
}
