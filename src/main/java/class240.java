import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class240 implements class653 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "Lkda;")
    public static class353 field3751 = new class353();

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "[I")
    public static int[] field3755 = new int[3];

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Ldg;")
    public static class376 field3754 = new class376(24, 7);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)Z", line = 3)
    public static final boolean method1640(int arg0) throws IOException {
        field3750++;
        if (class274.field4181 == null) {
            return false;
        }
        if (class312.field4616 == null) {
            if (class389.field5774) {
                if (!class274.field4181.method2233(1, arg0 ^ 0x3488)) {
                    return false;
                }
                class274.field4181.method2231(-93, 1, class523.field7392.field9796, 0);
                class500.field7082 = 0;
                class389.field5774 = false;
                class514.field7265++;
            }
            class523.field7392.field9761 = 0;
            if (class523.field7392.method318(-7976)) {
                if (!class274.field4181.method2233(1, 13)) {
                    return false;
                }
                class274.field4181.method2231(-111, 1, class523.field7392.field9796, 1);
                class514.field7265++;
                class500.field7082 = 0;
            }
            class389.field5774 = true;
            class664[] var1 = class26.method315(255);
            int var2 = class523.field7392.method310((byte) 93);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class523.field7392.field9761);
            }
            class312.field4616 = var1[var2];
            class418.field6098 = class312.field4616.field9372;
        }
        if (class418.field6098 == -1) {
            if (!class274.field4181.method2233(1, 13)) {
                return false;
            }
            class274.field4181.method2231(arg0 ^ 0xFFFFCB55, 1, class523.field7392.field9796, 0);
            class418.field6098 = class523.field7392.field9796[0] & 0xFF;
            class500.field7082 = 0;
            class514.field7265++;
        }
        if (class418.field6098 == -2) {
            if (!class274.field4181.method2233(2, 13)) {
                return false;
            }
            class274.field4181.method2231(-87, 2, class523.field7392.field9796, 0);
            class523.field7392.field9761 = 0;
            class418.field6098 = class523.field7392.method3847((byte) 118);
            class500.field7082 = 0;
            class514.field7265 += 2;
        }
        if (class418.field6098 > 0) {
            if (!class274.field4181.method2233(class418.field6098, 13)) {
                return false;
            }
            class523.field7392.field9761 = 0;
            class274.field4181.method2231(-51, class418.field6098, class523.field7392.field9796, 0);
            class514.field7265 += class418.field6098;
            class500.field7082 = 0;
        }
        class164.field2361 = class139.field2017;
        class139.field2017 = class550.field7778;
        class550.field7778 = class312.field4616;
        if (class312.field4616 == class270.field4048) {
            int var3 = class523.field7392.method3859((byte) 76);
            if (var3 == 65535) {
                var3 = -1;
            }
            int var4 = class523.field7392.method3851((byte) 30);
            int var5 = class523.field7392.method3826(false);
            class236.method1611(var4, var5, arg0 + 17422, var3);
            class312.field4616 = null;
            return true;
        } else if (class373.field5325 == class312.field4616) {
            int var6 = class523.field7392.method3873(255);
            int var7 = class523.field7392.method3818((byte) 84);
            int var8 = class523.field7392.method3859((byte) 76);
            if (var8 == 65535) {
                var8 = -1;
            }
            class228.method1541(var8, var6, 56, var7);
            class312.field4616 = null;
            return true;
        } else if (class502.field7108 == class312.field4616) {
            int var9 = class523.field7392.method3847((byte) 118);
            int var10 = class523.field7392.method3841((byte) -58);
            int var11 = class523.field7392.method3855(-2);
            if (var11 == 65535) {
                var11 = -1;
            }
            if (class569.method3236(arg0 ^ 0xFFFFF8EF, var9)) {
                class299.method1928(2, var10, var11, (byte) 15, -1);
            }
            class312.field4616 = null;
            return true;
        } else if (class484.field6874 == class312.field4616) {
            int var12 = class523.field7392.method3847((byte) 118);
            int var13 = class523.field7392.method3826(false);
            boolean var14 = (var13 & 0x1) == 1;
            while (class523.field7392.field9761 < class418.field6098) {
                int var15 = class523.field7392.method3815(-32768);
                int var16 = class523.field7392.method3847((byte) 118);
                int var17 = 0;
                if (var16 != 0) {
                    var17 = class523.field7392.method3826(false);
                    if (var17 == 255) {
                        var17 = class523.field7392.method3880(8);
                    }
                }
                class452.method2674(var16 - 1, (byte) 108, var12, var15, var14, var17);
            }
            class632.field8837[class689.method3797(class216.field3035++, 31)] = var12;
            class312.field4616 = null;
            return true;
        } else if (class633.field8925 == class312.field4616) {
            if (class554.field7847 != null) {
                class134.method983(class287.field4270.field3718, -1, false, -1, false);
            }
            byte[] var18 = new byte[class418.field6098];
            class523.field7392.method322(var18, 0, class418.field6098, (byte) -40);
            String var19 = class126.method949(0, (byte) -87, class418.field6098, var18);
            class255.method1703(class368.field5267, arg0 ^ 0x3487, var19, class328.field4859 == 1, true);
            class312.field4616 = null;
            return true;
        } else if (class661.field9345 == class312.field4616) {
            class523.field7392.field9761 += 28;
            if (class523.field7392.method3825((byte) -94)) {
                class289.method1844(class523.field7392, true, class523.field7392.field9761 - 28);
            }
            class312.field4616 = null;
            return true;
        } else if (class361.field5175 == class312.field4616) {
            int var20 = class523.field7392.method3847((byte) 118);
            if (class569.method3236(-13206, var20)) {
                class112.method872((byte) -79);
            }
            class312.field4616 = null;
            return true;
        } else if (class355.field5103 == class312.field4616) {
            while (class523.field7392.field9761 < class418.field6098) {
                boolean var31 = class523.field7392.method3826(false) == 1;
                String var32 = class523.field7392.method3836(false);
                String var33 = class523.field7392.method3836(false);
                int var34 = class523.field7392.method3847((byte) 118);
                int var35 = class523.field7392.method3826(false);
                String var36 = "";
                boolean var37 = false;
                if (var34 > 0) {
                    var36 = class523.field7392.method3836(false);
                    var37 = class523.field7392.method3826(false) == 1;
                }
                for (int var38 = 0; var38 < class142.field2091; var38++) {
                    if (var31) {
                        if (var33.equals(class124.field1865[var38])) {
                            class124.field1865[var38] = var32;
                            class668.field9444[var38] = var33;
                            var32 = null;
                            break;
                        }
                    } else if (var32.equals(class124.field1865[var38])) {
                        if (class182.field2580[var38] != var34) {
                            boolean var39 = true;
                            for (class330 var40 = (class330) class600.field8482.method2417(false); var40 != null; var40 = (class330) class600.field8482.method2414(true)) {
                                if (var40.field4881.equals(var32)) {
                                    if (var34 != 0 && var40.field4879 == 0) {
                                        var39 = false;
                                        var40.method3414(arg0 - 13445);
                                    } else if (var34 == 0 && var40.field4879 != 0) {
                                        var39 = false;
                                        var40.method3414(0);
                                    }
                                }
                            }
                            if (var39) {
                                class600.field8482.method2413(new class330(var32, var34), (byte) 120);
                            }
                            class182.field2580[var38] = var34;
                        }
                        class668.field9444[var38] = var33;
                        class303.field4516[var38] = var36;
                        class421.field6139[var38] = var35;
                        var32 = null;
                        class700.field9895[var38] = var37;
                        break;
                    }
                }
                if (var32 != null && class142.field2091 < 200) {
                    class124.field1865[class142.field2091] = var32;
                    class668.field9444[class142.field2091] = var33;
                    class182.field2580[class142.field2091] = var34;
                    class303.field4516[class142.field2091] = var36;
                    class421.field6139[class142.field2091] = var35;
                    class700.field9895[class142.field2091] = var37;
                    class142.field2091++;
                }
            }
            class248.field3862 = 2;
            class264.field4013 = class363.field5184;
            boolean var21 = false;
            int var22 = class142.field2091;
            while (var22 > 0) {
                var22--;
                boolean var23 = true;
                for (int var24 = 0; var24 < var22; var24++) {
                    if (class182.field2580[var24] != class228.field3284.field4938 && class182.field2580[var24 + 1] == class228.field3284.field4938 || class182.field2580[var24] == 0 && class182.field2580[var24 + 1] != 0) {
                        int var25 = class182.field2580[var24];
                        class182.field2580[var24] = class182.field2580[var24 + 1];
                        class182.field2580[var24 + 1] = var25;
                        String var26 = class303.field4516[var24];
                        class303.field4516[var24] = class303.field4516[var24 + 1];
                        class303.field4516[var24 + 1] = var26;
                        String var27 = class124.field1865[var24];
                        class124.field1865[var24] = class124.field1865[var24 + 1];
                        class124.field1865[var24 + 1] = var27;
                        String var28 = class668.field9444[var24];
                        class668.field9444[var24] = class668.field9444[var24 + 1];
                        class668.field9444[var24 + 1] = var28;
                        int var29 = class421.field6139[var24];
                        class421.field6139[var24] = class421.field6139[var24 + 1];
                        class421.field6139[var24 + 1] = var29;
                        boolean var30 = class700.field9895[var24];
                        class700.field9895[var24] = class700.field9895[var24 + 1];
                        class700.field9895[var24 + 1] = var30;
                        var23 = false;
                    }
                }
                if (var23) {
                    break;
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class302.field4506) {
            int var41 = class523.field7392.method3847((byte) 118);
            if (var41 == 65535) {
                var41 = -1;
            }
            int var42 = class523.field7392.method3826(false);
            int var43 = class523.field7392.method3847((byte) 118);
            int var44 = class523.field7392.method3826(false);
            class89.method767(-35, var43, false, var44, var42, var41);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class206.field2894) {
            int var45 = class523.field7392.method3855(-2);
            int var46 = class523.field7392.method3858(true);
            int var47 = class523.field7392.method3847((byte) 118);
            if (var47 == 65535) {
                var47 = -1;
            }
            int var48 = class523.field7392.method3841((byte) -125);
            int var49 = class523.field7392.method3859((byte) 76);
            if (var49 == 65535) {
                var49 = -1;
            }
            if (class569.method3236(-13206, var45)) {
                for (int var50 = var49; var50 <= var47; var50++) {
                    long var51 = ((long) var48 << 32) + ((long) var50);
                    class132 var53 = (class132) class219.field3065.method1405(var51, (byte) -63);
                    class132 var54;
                    if (var53 != null) {
                        var54 = new class132(var46, var53.field1952);
                        var53.method3678(arg0 - 13446);
                    } else if (var50 == -1) {
                        var54 = new class132(var46, class534.method3038(-84, var48).field935.field1952);
                    } else {
                        var54 = new class132(var46, -1);
                    }
                    class219.field3065.method1403((byte) -18, var54, var51);
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class503.field7113 == class312.field4616) {
            String var55 = class523.field7392.method3836(false);
            int var56 = class523.field7392.method3859((byte) 76);
            if (var56 == 65535) {
                var56 = -1;
            }
            int var57 = class523.field7392.method3851((byte) 30);
            int var58 = class523.field7392.method3818((byte) 127);
            if (var58 >= 1 && var58 <= 8) {
                if (var55.equalsIgnoreCase("null")) {
                    var55 = null;
                }
                class674.field9525[var58 - 1] = var55;
                class345.field5037[var58 - 1] = var56;
                class641.field9048[var58 - 1] = var57 == 0;
            }
            class312.field4616 = null;
            return true;
        } else if (class87.field1466 == class312.field4616) {
            int var59 = class523.field7392.method3847((byte) 118);
            int var60 = class523.field7392.method3826(false);
            int var61 = class523.field7392.method3826(false);
            int var62 = class523.field7392.method3847((byte) 118) << 2;
            int var63 = class523.field7392.method3826(false);
            int var64 = class523.field7392.method3826(false);
            if (class569.method3236(-13206, var59)) {
                class226.method1486(var64, var63, arg0 - 27653, var62, var60, var61);
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class158.field2272) {
            class332.method2087(class263.field3994, false);
            class312.field4616 = null;
            return true;
        } else if (class356.field5112 == class312.field4616) {
            int var65 = class523.field7392.method3841((byte) -33);
            int var66 = class523.field7392.method3855(-2);
            int var67 = class523.field7392.method3848(-1333735960);
            if (class569.method3236(-13206, var67)) {
                class600.method3393(var66, var65, (byte) -7);
            }
            class312.field4616 = null;
            return true;
        } else if (class566.field7977 == class312.field4616) {
            boolean var68 = class523.field7392.method3826(false) == 1;
            String var69 = class523.field7392.method3836(false);
            String var70 = var69;
            if (var68) {
                var70 = class523.field7392.method3836(false);
            }
            int var71 = class523.field7392.method3826(false);
            boolean var72 = false;
            if (var71 <= 1) {
                if (!(!class70.field1249 || class379.field5373) || class100.field1554) {
                    var72 = true;
                } else if (var71 <= 1 && class534.method3041(-15788, var70)) {
                    var72 = true;
                }
            }
            if (!var72 && class499.field7078 == 0) {
                String var73 = class648.method3595(-2, class532.method3034(-13, class523.field7392));
                if (var71 == 2) {
                    class304.method1942(0, (byte) 126, var69, "<img=1>" + var69, "<img=1>" + var70, var73, 24, null, -1);
                } else if (var71 == 1) {
                    class304.method1942(0, (byte) 108, var69, "<img=0>" + var69, "<img=0>" + var70, var73, 24, null, -1);
                } else {
                    class304.method1942(0, (byte) 123, var69, var69, var70, var73, 24, null, -1);
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class310.field4591) {
            String var74 = class523.field7392.method3836(false);
            int var75 = class523.field7392.method3847((byte) 118);
            int var76 = class523.field7392.method3813((byte) 88);
            if (class569.method3236(arg0 ^ 0xFFFFF8EF, var75)) {
                class94.method776(11788, var76, var74);
            }
            class312.field4616 = null;
            return true;
        } else if (class423.field6156 == class312.field4616) {
            int var77 = class523.field7392.method3847((byte) 118);
            int var78 = class523.field7392.method3880(8);
            if (class569.method3236(-13206, var77)) {
                class320 var79 = (class320) class654.field9178.method1405((long) var78, (byte) -25);
                if (var79 != null) {
                    class224.method1484(false, true, true, var79);
                }
                if (class37.field634 != null) {
                    class563.method3215(true, class37.field634);
                    class37.field634 = null;
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class177.field2520) {
            int var80 = class523.field7392.method3880(arg0 - 13437);
            int var81 = class523.field7392.method3855(-2);
            int var82 = class523.field7392.method3848(-1333735960);
            if (class569.method3236(arg0 ^ 0xFFFFF8EF, var82)) {
                class642.method3580(26394, var81, var80);
            }
            class312.field4616 = null;
            return true;
        } else if (class43.field697 == class312.field4616) {
            boolean var83 = class523.field7392.method3826(false) == 1;
            String var84 = class523.field7392.method3836(false);
            String var85 = var84;
            if (var83) {
                var85 = class523.field7392.method3836(false);
            }
            long var86 = class523.field7392.method3854((byte) -12);
            long var88 = (long) class523.field7392.method3847((byte) 118);
            long var90 = (long) class523.field7392.method3873(255);
            int var92 = class523.field7392.method3826(false);
            long var93 = (var88 << 32) + var90;
            boolean var95 = false;
            int var96 = 0;
            while (true) {
                if (var96 >= 100) {
                    if (var92 <= 1) {
                        if (!(!class70.field1249 || class379.field5373) || class100.field1554) {
                            var95 = true;
                        } else if (class534.method3041(-15788, var85)) {
                            var95 = true;
                        }
                    }
                    break;
                }
                if (class181.field2561[var96] == var93) {
                    var95 = true;
                    break;
                }
                var96++;
            }
            if (!var95 && class499.field7078 == 0) {
                class181.field2561[class489.field6942] = var93;
                class489.field6942 = (class489.field6942 + 1) % 100;
                String var97 = class648.method3595(arg0 - 13326, class532.method3034(arg0 ^ 0xFFFFCB5A, class523.field7392));
                if (var92 == 2 || var92 == 3) {
                    class304.method1942(0, (byte) 108, var84, "<img=1>" + var84, "<img=1>" + var85, var97, 9, class369.method2237(var86, true), -1);
                } else if (var92 == 1) {
                    class304.method1942(0, (byte) 100, var84, "<img=0>" + var84, "<img=0>" + var85, var97, 9, class369.method2237(var86, true), -1);
                } else {
                    class304.method1942(0, (byte) 122, var84, var84, var85, var97, 9, class369.method2237(var86, true), -1);
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class24.field329) {
            int var98 = class523.field7392.method3826(false);
            boolean var99 = (var98 & 0x1) == 1;
            String var100 = class523.field7392.method3836(false);
            String var101 = class523.field7392.method3836(false);
            if (var101.equals("")) {
                var101 = var100;
            }
            String var102 = class523.field7392.method3836(false);
            String var103 = class523.field7392.method3836(false);
            if (var103.equals("")) {
                var103 = var102;
            }
            if (var99) {
                for (int var104 = 0; var104 < class363.field5180; var104++) {
                    if (class172.field2443[var104].equals(var103)) {
                        class98.field1547[var104] = var100;
                        class172.field2443[var104] = var101;
                        class484.field6879[var104] = var102;
                        class591.field8280[var104] = var103;
                        break;
                    }
                }
            } else {
                class98.field1547[class363.field5180] = var100;
                class172.field2443[class363.field5180] = var101;
                class484.field6879[class363.field5180] = var102;
                class591.field8280[class363.field5180] = var103;
                class42.field688[class363.field5180] = class689.method3797(var98, 2) == 2;
                class363.field5180++;
            }
            class312.field4616 = null;
            class264.field4013 = class363.field5184;
            return true;
        } else if (class492.field7003 == class312.field4616) {
            class568.field7982 = class523.field7392.method3819((byte) -61) << 3;
            class191.field2761 = class523.field7392.method3851((byte) 30);
            class421.field6132 = class523.field7392.method3819((byte) -126) << 3;
            class312.field4616 = null;
            return true;
        } else if (class654.field9180 == class312.field4616) {
            class332.method2087(class203.field2872, false);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class249.field3863) {
            class332.method2087(class595.field8419, false);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class14.field116) {
            class332.method2079(-28824, true);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class274.field4180) {
            class213.field2960 = class523.field7392.method3826(false);
            class24.field331 = class363.field5184;
            class312.field4616 = null;
            return true;
        } else if (class376.field5353 == class312.field4616) {
            class191.field2761 = class523.field7392.method3826(false);
            class421.field6132 = class523.field7392.method3838(false) << 3;
            class568.field7982 = class523.field7392.method3844(124) << 3;
            for (class44 var105 = (class44) class22.field296.method1407(21); var105 != null; var105 = (class44) class22.field296.method1413(true)) {
                int var107 = (int) (var105.field9386 >> 28 & 0x3L);
                int var108 = (int) (var105.field9386 & 0x3FFFL);
                int var109 = var108 - class109.field1672;
                int var110 = (int) (var105.field9386 >> 14 & 0x3FFFL);
                int var111 = var110 - class203.field2874;
                if (class191.field2761 == var107 && var109 >= class568.field7982 && (class568.field7982 + 8) > var109 && var111 >= class421.field6132 && var111 < (class421.field6132 + 8)) {
                    var105.method3678(arg0 ^ 0xFFFFCB7A);
                    if (var109 >= 0 && var111 >= 0 && class199.field2812 > var109 && var111 < class232.field3611) {
                        class443.method2627(var111, class191.field2761, var109, arg0 - 41867);
                    }
                }
            }
            for (class697 var106 = (class697) class302.field4494.method472((byte) -87); var106 != null; var106 = (class697) class302.field4494.method482(116)) {
                if (class568.field7982 <= var106.field9870 && (class568.field7982 + 8) > var106.field9870 && var106.field9874 >= class421.field6132 && var106.field9874 < class421.field6132 + 8 && class191.field2761 == var106.field9859) {
                    var106.field9862 = 0;
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class411.field5993 == class312.field4616) {
            boolean var112 = class523.field7392.method3826(false) == 1;
            String var113 = class523.field7392.method3836(false);
            String var114 = var113;
            if (var112) {
                var114 = class523.field7392.method3836(false);
            }
            long var115 = class523.field7392.method3854((byte) -12);
            long var117 = (long) class523.field7392.method3847((byte) 118);
            long var119 = (long) class523.field7392.method3873(255);
            int var121 = class523.field7392.method3826(false);
            int var122 = class523.field7392.method3847((byte) 118);
            long var123 = (var117 << 32) + var119;
            boolean var125 = false;
            int var126 = 0;
            while (true) {
                if (var126 >= 100) {
                    if (var121 <= 1 && class534.method3041(-15788, var114)) {
                        var125 = true;
                    }
                    break;
                }
                if (class181.field2561[var126] == var123) {
                    var125 = true;
                    break;
                }
                var126++;
            }
            if (!var125 && class499.field7078 == 0) {
                class181.field2561[class489.field6942] = var123;
                class489.field6942 = (class489.field6942 + 1) % 100;
                String var127 = class452.field6508.method361(arg0 ^ 0xFFFFCB0A, var122).method1631(-25808, class523.field7392);
                if (var121 == 2) {
                    class304.method1942(0, (byte) 114, var113, "<img=1>" + var113, "<img=1>" + var114, var127, 20, class369.method2237(var115, true), var122);
                } else if (var121 == 1) {
                    class304.method1942(0, (byte) 116, var113, "<img=0>" + var113, "<img=0>" + var114, var127, 20, class369.method2237(var115, true), var122);
                } else {
                    class304.method1942(0, (byte) 108, var113, var113, var114, var127, 20, class369.method2237(var115, true), var122);
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class666.field9400 == class312.field4616) {
            class332.method2087(class486.field6915, false);
            class312.field4616 = null;
            return true;
        } else if (class632.field8836 == class312.field4616) {
            class80.method730(class523.field7392.method3836(false), arg0 ^ 0xFFFFCB04);
            class312.field4616 = null;
            return true;
        } else if (class56.field1088 == class312.field4616) {
            class312.field4616 = null;
            return false;
        } else if (class312.field4616 == class293.field4320) {
            class581.field8187 = class523.field7392.method3826(false);
            class312.field4616 = null;
            return true;
        } else if (class318.field4689 == class312.field4616) {
            int var128 = class523.field7392.method3847((byte) 118);
            class491 var129;
            if (class99.field1551 == var128) {
                var129 = class648.field9106;
            } else {
                var129 = class141.field2087[var128];
            }
            if (var129 == null) {
                class312.field4616 = null;
                return true;
            }
            int var130 = class523.field7392.method3847((byte) 118);
            int var131 = class523.field7392.method3826(false);
            boolean var132 = (var130 & 0x8000) != 0;
            if (var129.field6981 != null && var129.field6993 != null) {
                boolean var133 = false;
                if (var131 <= 1) {
                    if (!var132 && !(!class70.field1249 || class379.field5373) || class100.field1554) {
                        var133 = true;
                    } else if (class534.method3041(-15788, var129.field6981)) {
                        var133 = true;
                    }
                }
                if (!var133 && class499.field7078 == 0) {
                    int var134 = -1;
                    String var135;
                    if (var132) {
                        var130 &= 0x7FFF;
                        class233 var136 = class389.method2395(false, class523.field7392);
                        var134 = var136.field3623;
                        var135 = var136.field3622.method1631(-25808, class523.field7392);
                    } else {
                        var135 = class648.method3595(118, class532.method3034(-128, class523.field7392));
                    }
                    var129.field6234 = var135.trim();
                    var129.field6190 = var130 & 0xFF;
                    var129.field6208 = 150;
                    var129.field6168 = var130 >> 8;
                    int var137;
                    if (var131 == 1 || var131 == 2) {
                        var137 = var132 ? 17 : 1;
                    } else {
                        var137 = var132 ? 17 : 2;
                    }
                    if (var131 == 2) {
                        class304.method1942(0, (byte) 113, var129.field6949, "<img=1>" + var129.method2845(true, -14345), "<img=1>" + var129.method2848(false, (byte) 94), var135, var137, null, var134);
                    } else if (var131 == 1) {
                        class304.method1942(0, (byte) 104, var129.field6949, "<img=0>" + var129.method2845(true, -14345), "<img=0>" + var129.method2848(false, (byte) 39), var135, var137, null, var134);
                    } else {
                        class304.method1942(0, (byte) 101, var129.field6949, var129.method2845(true, arg0 ^ 0xFFFFF372), var129.method2848(false, (byte) 70), var135, var137, null, var134);
                    }
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class164.field2360) {
            boolean var138 = class523.field7392.method3826(false) == 1;
            String var139 = class523.field7392.method3836(false);
            String var140 = var139;
            if (var138) {
                var140 = class523.field7392.method3836(false);
            }
            long var141 = (long) class523.field7392.method3847((byte) 118);
            long var143 = (long) class523.field7392.method3873(255);
            int var145 = class523.field7392.method3826(false);
            int var146 = class523.field7392.method3847((byte) 118);
            long var147 = (var141 << 32) + var143;
            boolean var149 = false;
            int var150 = 0;
            while (true) {
                if (var150 >= 100) {
                    if (var145 <= 1 && class534.method3041(-15788, var140)) {
                        var149 = true;
                    }
                    break;
                }
                if (class181.field2561[var150] == var147) {
                    var149 = true;
                    break;
                }
                var150++;
            }
            if (!var149 && class499.field7078 == 0) {
                class181.field2561[class489.field6942] = var147;
                class489.field6942 = (class489.field6942 + 1) % 100;
                String var151 = class452.field6508.method361(-116, var146).method1631(-25808, class523.field7392);
                if (var145 == 2) {
                    class304.method1942(0, (byte) 127, var139, "<img=1>" + var139, "<img=1>" + var140, var151, 18, null, var146);
                } else if (var145 == 1) {
                    class304.method1942(0, (byte) 109, var139, "<img=0>" + var139, "<img=0>" + var140, var151, 18, null, var146);
                } else {
                    class304.method1942(0, (byte) 116, var139, var139, var140, var151, 18, null, var146);
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class635.field8985 == class312.field4616) {
            int var152 = class523.field7392.method3859((byte) 76);
            int var153 = class523.field7392.method3855(arg0 - 13447);
            int var154 = class523.field7392.method3880(8);
            if (class569.method3236(-13206, var152)) {
                class81.method735(var153, var154, 62);
            }
            class312.field4616 = null;
            return true;
        } else if (class591.field8276 == class312.field4616) {
            int var155 = class523.field7392.method3847((byte) 118);
            if (class569.method3236(-13206, var155)) {
                class374.method2257((byte) 96);
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class159.field2286) {
            class264.field4013 = class363.field5184;
            class248.field3862 = 1;
            class312.field4616 = null;
            return true;
        } else if (class519.field7317 == class312.field4616) {
            int var156 = class523.field7392.method3847((byte) 118);
            int var157 = class523.field7392.method3880(8);
            int var158 = class523.field7392.method3847((byte) 118);
            int var159 = class523.field7392.method3847((byte) 118);
            int var160 = class523.field7392.method3848(-1333735960);
            if (class569.method3236(-13206, var156)) {
                class559.method3196(var160, var157, var159, var158, 75);
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class23.field310) {
            int var161 = class523.field7392.method3855(-2);
            int var162 = class523.field7392.method3841((byte) -100);
            if (class569.method3236(-13206, var161)) {
                if (var162 == -1) {
                    class666.field9399 = -1;
                    class563.field7927 = -1;
                } else {
                    int var163 = (var162 & 0xFFFE507) >> 14;
                    int var164 = var162 & 0x3FFF;
                    int var165 = var163 - class109.field1672;
                    int var166 = var164 - class203.field2874;
                    if (var165 < 0) {
                        var165 = 0;
                    } else if (class199.field2812 <= var165) {
                        var165 = class199.field2812;
                    }
                    if (var166 < 0) {
                        var166 = 0;
                    } else if (var166 >= class232.field3611) {
                        var166 = class232.field3611;
                    }
                    class563.field7927 = (var165 << 9) + 256;
                    class666.field9399 = (var166 << 9) + 256;
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class399.field5892 == class312.field4616) {
            int var167 = class523.field7392.method3859((byte) 76);
            byte var168 = class523.field7392.method3844(124);
            class61.field1163.method1735(-3538, var167, var168);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class143.field2111) {
            boolean var169 = class523.field7392.method3826(false) == 1;
            String var170 = class523.field7392.method3836(false);
            String var171 = var170;
            if (var169) {
                var171 = class523.field7392.method3836(false);
            }
            int var172 = class523.field7392.method3826(false);
            int var173 = class523.field7392.method3847((byte) 118);
            boolean var174 = false;
            if (var172 <= 1 && class534.method3041(-15788, var171)) {
                var174 = true;
            }
            if (!var174 && class499.field7078 == 0) {
                String var175 = class452.field6508.method361(-117, var173).method1631(-25808, class523.field7392);
                if (var172 == 2) {
                    class304.method1942(0, (byte) 108, var170, "<img=1>" + var170, "<img=1>" + var171, var175, 25, null, var173);
                } else if (var172 == 1) {
                    class304.method1942(0, (byte) 117, var170, "<img=0>" + var170, "<img=0>" + var171, var175, 25, null, var173);
                } else {
                    class304.method1942(0, (byte) 116, var170, var170, var171, var175, 25, null, var173);
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class136.field1988) {
            int var176 = class523.field7392.method3880(arg0 ^ 0x348D);
            class573.field8063 = class368.field5267.method15(true, var176);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class132.field1955) {
            int var177 = class523.field7392.method3814(false);
            int var178 = class523.field7392.method3880(arg0 - 13437);
            int var179 = class523.field7392.method3834(27622);
            int var180 = class523.field7392.method3859((byte) 76);
            if (class569.method3236(-13206, var180)) {
                class704.method3922(var179, var177, 47, var178);
            }
            class312.field4616 = null;
            return true;
        } else if (class329.field4863 == class312.field4616) {
            class231.field3605 = class523.field7392.method3842(arg0 - 13447);
            class70.field1249 = class523.field7392.method3826(false) == 1;
            class312.field4616 = null;
            return true;
        } else if (class523.field7389 == class312.field4616) {
            boolean var181 = class523.field7392.method3826(false) == 1;
            String var182 = class523.field7392.method3836(false);
            String var183 = var182;
            if (var181) {
                var183 = class523.field7392.method3836(false);
            }
            long var184 = (long) class523.field7392.method3847((byte) 118);
            long var186 = (long) class523.field7392.method3873(255);
            int var188 = class523.field7392.method3826(false);
            long var189 = (var184 << 32) + var186;
            boolean var191 = false;
            int var192 = 0;
            while (true) {
                if (var192 >= 100) {
                    if (var188 <= 1) {
                        if (!(!class70.field1249 || class379.field5373) || class100.field1554) {
                            var191 = true;
                        } else if (class534.method3041(-15788, var183)) {
                            var191 = true;
                        }
                    }
                    break;
                }
                if (class181.field2561[var192] == var189) {
                    var191 = true;
                    break;
                }
                var192++;
            }
            if (!var191 && class499.field7078 == 0) {
                class181.field2561[class489.field6942] = var189;
                class489.field6942 = (class489.field6942 + 1) % 100;
                String var193 = class648.method3595(arg0 - 13331, class532.method3034(arg0 ^ 0xFFFFCB0C, class523.field7392));
                if (var188 == 2) {
                    class304.method1942(0, (byte) 110, var182, "<img=1>" + var182, "<img=1>" + var183, var193, 7, null, -1);
                } else if (var188 == 1) {
                    class304.method1942(0, (byte) 100, var182, "<img=0>" + var182, "<img=0>" + var183, var193, 7, null, -1);
                } else {
                    class304.method1942(0, (byte) 106, var182, var182, var183, var193, 3, null, -1);
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class581.field8182 == class312.field4616) {
            int var194 = class523.field7392.method3847((byte) 118);
            int var195 = class523.field7392.method3848(arg0 ^ 0xB080F96D);
            String var196 = class523.field7392.method3836(false);
            if (class569.method3236(-13206, var195)) {
                class409.method2473(0, var194, var196);
            }
            class312.field4616 = null;
            return true;
        } else if (class97.field1527 == class312.field4616) {
            int var197 = class523.field7392.method3847((byte) 118);
            int var198 = class523.field7392.method3826(false);
            int var199 = class523.field7392.method3826(false);
            int var200 = class523.field7392.method3847((byte) 118) << 2;
            int var201 = class523.field7392.method3826(false);
            int var202 = class523.field7392.method3826(false);
            if (class569.method3236(-13206, var197)) {
                class529.method3026(512, var199, var201, var200, var202, true, var198);
            }
            class312.field4616 = null;
            return true;
        } else if (class665.field9383 == class312.field4616) {
            int var203 = class523.field7392.method3859((byte) 76);
            int var204 = class523.field7392.method3880(8);
            class61.field1163.method1731(var204, (byte) 65, var203);
            class312.field4616 = null;
            return true;
        } else if (class671.field9488 == class312.field4616) {
            int var205 = class523.field7392.method3848(-1333735960);
            if (var205 == 65535) {
                var205 = -1;
            }
            int var206 = class523.field7392.method3818((byte) 92);
            int var207 = var206 >> 2;
            int var208 = var206 & 0x3;
            int var209 = class700.field9893[var207];
            int var210 = class523.field7392.method3841((byte) -84);
            int var211 = (var210 & 0x399023A4) >> 28;
            int var212 = var210 >> 14 & 0x3FFF;
            int var213 = var210 & 0x3FFF;
            int var214 = var212 - class109.field1672;
            int var215 = var213 - class203.field2874;
            class181.method1222(arg0 - 32337, var207, var214, var209, var211, var215, var205, var208);
            class312.field4616 = null;
            return true;
        } else if (class547.field7691 == class312.field4616) {
            class421.field6132 = class523.field7392.method3827((byte) -102) << 3;
            class568.field7982 = class523.field7392.method3819((byte) -97) << 3;
            class191.field2761 = class523.field7392.method3826(false);
            while (class523.field7392.field9761 < class418.field6098) {
                class264 var216 = class248.method1669(-34)[class523.field7392.method3826(false)];
                class332.method2087(var216, false);
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class310.field4594) {
            int var217 = class523.field7392.method3848(-1333735960);
            int var218 = class523.field7392.method3826(false);
            boolean var219 = (var218 & 0x1) == 1;
            class672.method3728(0, var217, var219);
            class632.field8837[class689.method3797(class216.field3035++, 31)] = var217;
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class139.field2044) {
            int var220 = class523.field7392.method3815(-32768);
            int var221 = class523.field7392.method3880(8);
            int var222 = class523.field7392.method3826(false);
            String var223 = "";
            String var224 = var223;
            if ((var222 & 0x1) != 0) {
                var223 = class523.field7392.method3836(false);
                if ((var222 & 0x2) == 0) {
                    var224 = var223;
                } else {
                    var224 = class523.field7392.method3836(false);
                }
            }
            String var225 = class523.field7392.method3836(false);
            if (var220 == 99) {
                class262.method1723(true, var225);
            } else if (var224.equals("") || !class534.method3041(-15788, var224)) {
                class376.method2265(var220, var221, var224, var223, (byte) -121, var223, var225);
            } else {
                class312.field4616 = null;
                return true;
            }
            class312.field4616 = null;
            return true;
        } else if (class559.field7885 == class312.field4616) {
            int var226 = class523.field7392.method3841((byte) -48);
            int var227 = class523.field7392.method3847((byte) 118);
            int var228 = class523.field7392.method3847((byte) 118);
            if (var228 == 65535) {
                var228 = -1;
            }
            if (class569.method3236(-13206, var227)) {
                class299.method1928(1, var226, var228, (byte) 15, -1);
            }
            class312.field4616 = null;
            return true;
        } else if (class578.field8149 == class312.field4616) {
            int var229 = class523.field7392.method3813((byte) 89);
            int var230 = class523.field7392.method3859((byte) 76);
            int var231 = class523.field7392.method3813((byte) 107);
            if (class569.method3236(-13206, var230)) {
                class320 var232 = (class320) class654.field9178.method1405((long) var229, (byte) -112);
                class320 var233 = (class320) class654.field9178.method1405((long) var231, (byte) -51);
                if (var233 != null) {
                    class224.method1484(false, var232 == null || var232.field4703 != var233.field4703, true, var233);
                }
                if (var232 != null) {
                    var232.method3678(-1);
                    class654.field9178.method1403((byte) -18, var232, (long) var231);
                }
                class49 var234 = class534.method3038(-118, var229);
                if (var234 != null) {
                    class563.method3215(true, var234);
                }
                class49 var235 = class534.method3038(-125, var231);
                if (var235 != null) {
                    class563.method3215(true, var235);
                    class391.method2407(0, var235, true);
                }
                if (class100.field1556 != -1) {
                    class483.method2815(1, class100.field1556, -2064);
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class279.field4211) {
            class88.method764(0, false);
            class312.field4616 = null;
            return false;
        } else if (class682.field9619 == class312.field4616) {
            boolean var236 = class523.field7392.method3826(false) == 1;
            byte[] var237 = new byte[class418.field6098 - 1];
            class523.field7392.method3876((byte) 127, var237, 0, class418.field6098 - 1);
            class98.method801(var237, var236, (byte) 122);
            class312.field4616 = null;
            return true;
        } else if (class521.field7340 == class312.field4616) {
            int var238 = class523.field7392.method3847((byte) 118);
            int[] var239 = new int[4];
            for (int var240 = 0; var240 < 4; var240++) {
                var239[var240] = class523.field7392.method3847((byte) 118);
            }
            int var241 = class523.field7392.method3869(-128);
            class16 var242 = (class16) class189.field2723.method1405((long) var238, (byte) -128);
            if (var242 != null) {
                class590.method3339(var242.field174, var239, var241, true);
            }
            class312.field4616 = null;
            return true;
        } else if (class352.field5073 == class312.field4616) {
            int var243 = class523.field7392.method3880(8);
            int var244 = class523.field7392.method3826(false);
            int var245 = class523.field7392.method3847((byte) 118);
            if (class569.method3236(arg0 - 26651, var245)) {
                class16.method92(var243, var244, (byte) 125);
            }
            class312.field4616 = null;
            return true;
        } else if (class517.field7290 == class312.field4616) {
            int var246 = class523.field7392.method3859((byte) 76);
            int var247 = class523.field7392.method3855(arg0 ^ 0xFFFFCB7B);
            int var248 = class523.field7392.method3848(-1333735960);
            if (class569.method3236(-13206, var247)) {
                class59.method631(3, var248, 0, var246);
            }
            class312.field4616 = null;
            return true;
        } else if (arg0 != 13445) {
            return false;
        } else if (class508.field7173 == class312.field4616) {
            int var249 = class523.field7392.method3859((byte) 76);
            int var250 = class523.field7392.method3847((byte) 118);
            int var251 = class523.field7392.method3880(8);
            if (class569.method3236(-13206, var250)) {
                class268.method1752(var251, var249, 0);
            }
            class312.field4616 = null;
            return true;
        } else if (class344.field5031 == class312.field4616) {
            class88.method764(arg0 ^ 0x3485, class315.field4671);
            class312.field4616 = null;
            return false;
        } else if (class599.field8474 == class312.field4616) {
            class44.field704 = class523.field7392.method3814(false);
            class312.field4616 = null;
            class24.field331 = class363.field5184;
            return true;
        } else if (class395.field5860 == class312.field4616) {
            class332.method2087(class8.field77, false);
            class312.field4616 = null;
            return true;
        } else if (class374.field5329 == class312.field4616) {
            int var252 = class523.field7392.method3855(-2);
            int var253 = class523.field7392.method3880(arg0 ^ 0x348D);
            int var254 = class523.field7392.method3847((byte) 118);
            if (var254 == 65535) {
                var254 = -1;
            }
            if (class569.method3236(arg0 ^ 0xFFFFF8EF, var252)) {
                class50.method572(89, var254, var253);
            }
            class312.field4616 = null;
            return true;
        } else if (class321.field4715 == class312.field4616) {
            int var255 = class523.field7392.method3855(-2);
            int var256 = class523.field7392.method3813((byte) 38);
            int var257 = class523.field7392.method3859((byte) 76);
            if (var257 == 65535) {
                var257 = -1;
            }
            int var258 = class523.field7392.method3880(arg0 - 13437);
            if (class569.method3236(-13206, var255)) {
                class424.method2543(var256, var257, -10812, var258);
                class186 var259 = class41.field682.method2228(var257, 0);
                class559.method3196(var259.field2669, var256, var259.field2605, var259.field2646, 72);
                class545.method3086(var259.field2657, var256, var259.field2660, var259.field2666, (byte) 97);
            }
            class312.field4616 = null;
            return true;
        } else if (class599.field8475 == class312.field4616) {
            class332.method2087(class360.field5174, false);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class219.field3059) {
            int var260 = class523.field7392.method3848(-1333735960);
            int var261 = class523.field7392.method3841((byte) -53);
            int var262 = class523.field7392.method3855(arg0 ^ 0xFFFFCB7B);
            int var263 = class523.field7392.method3813((byte) 47);
            if (class569.method3236(-13206, var260)) {
                class299.method1928(5, var261, var262, (byte) 15, var263);
            }
            class312.field4616 = null;
            return true;
        } else if (class327.field4851 == class312.field4616) {
            class594.field8401 = class363.field5184;
            if (class418.field6098 == 0) {
                class88.field1480 = null;
                class564.field7965 = null;
                class165.field2366 = null;
                class433.field6341 = 0;
                class312.field4616 = null;
                return true;
            }
            class88.field1480 = class523.field7392.method3836(false);
            boolean var264 = class523.field7392.method3826(false) == 1;
            if (var264) {
                class523.field7392.method3836(false);
            }
            long var265 = class523.field7392.method3854((byte) -12);
            class165.field2366 = class477.method2797(var265, 12095);
            class677.field9578 = class523.field7392.method3827((byte) 89);
            int var267 = class523.field7392.method3826(false);
            if (var267 == 255) {
                class312.field4616 = null;
                return true;
            }
            class433.field6341 = var267;
            class119[] var268 = new class119[100];
            for (int var269 = 0; var269 < class433.field6341; var269++) {
                var268[var269] = new class119();
                var268[var269].field1803 = class523.field7392.method3836(false);
                boolean var275 = class523.field7392.method3826(false) == 1;
                if (var275) {
                    var268[var269].field1800 = class523.field7392.method3836(false);
                } else {
                    var268[var269].field1800 = var268[var269].field1803;
                }
                var268[var269].field1808 = class563.method3220((byte) 88, var268[var269].field1800);
                var268[var269].field1798 = class523.field7392.method3847((byte) 118);
                var268[var269].field1806 = class523.field7392.method3827((byte) 117);
                var268[var269].field1801 = class523.field7392.method3836(false);
                if (var268[var269].field1800.equals(class648.field9106.field6981)) {
                    class227.field3190 = var268[var269].field1806;
                }
            }
            boolean var270 = false;
            int var271 = class433.field6341;
            while (var271 > 0) {
                var271--;
                boolean var272 = true;
                for (int var273 = 0; var273 < var271; var273++) {
                    if (var268[var273].field1808.compareTo(var268[var273 + 1].field1808) > 0) {
                        class119 var274 = var268[var273];
                        var268[var273] = var268[var273 + 1];
                        var268[var273 + 1] = var274;
                        var272 = false;
                    }
                }
                if (var272) {
                    break;
                }
            }
            class312.field4616 = null;
            class564.field7965 = var268;
            return true;
        } else if (class67.field1227 == class312.field4616) {
            class332.method2079(-28824, false);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class169.field2430) {
            int var276 = class523.field7392.method3847((byte) 118);
            if (var276 == 65535) {
                var276 = -1;
            }
            int var277 = class523.field7392.method3826(false);
            int var278 = class523.field7392.method3847((byte) 118);
            int var279 = class523.field7392.method3826(false);
            class50.method569(var276, var277, var278, (byte) -38, var279);
            class312.field4616 = null;
            return true;
        } else if (class97.field1534 == class312.field4616) {
            class310.field4595 = class523.field7392.method3818((byte) 112);
            class399.field5900 = class523.field7392.method3826(false);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class203.field2873) {
            String var280 = class523.field7392.method3836(false);
            int var281 = class523.field7392.method3847((byte) 118);
            String var282 = class452.field6508.method361(-114, var281).method1631(-25808, class523.field7392);
            class304.method1942(0, (byte) 116, var280, var280, var280, var282, 19, null, var281);
            class312.field4616 = null;
            return true;
        } else if (class520.field7334 == class312.field4616) {
            int var283 = class523.field7392.method3848(-1333735960);
            int var284 = class523.field7392.method3869(-128);
            int var285 = class523.field7392.method3813((byte) 101);
            int var286 = class523.field7392.method3848(-1333735960);
            if (class569.method3236(-13206, var283)) {
                class320 var287 = (class320) class654.field9178.method1405((long) var285, (byte) -15);
                if (var287 != null) {
                    class224.method1484(false, var287.field4703 != var286, true, var287);
                }
                class665.method3676(var284, 56, var285, false, var286);
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class289.field4298) {
            for (int var288 = 0; var288 < class141.field2087.length; var288++) {
                if (class141.field2087[var288] != null) {
                    class141.field2087[var288].field6259 = null;
                    class141.field2087[var288].field6218 = -1;
                }
            }
            for (int var289 = 0; var289 < class428.field6288; var289++) {
                class261.field3968[var289].field174.field6259 = null;
                class261.field3968[var289].field174.field6218 = -1;
            }
            class312.field4616 = null;
            return true;
        } else if (class633.field8942 == class312.field4616) {
            class332.method2087(class153.field2208, false);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class223.field3140) {
            class66.method669(false);
            class312.field4616 = null;
            return false;
        } else if (class312.field4616 == class123.field1854) {
            int var290 = class523.field7392.method3847((byte) 118);
            if (var290 == 65535) {
                var290 = -1;
            }
            int var291 = class523.field7392.method3826(false);
            int var292 = class523.field7392.method3847((byte) 118);
            int var293 = class523.field7392.method3826(false);
            class89.method767(arg0 - 13480, var292, true, var293, var291, var290);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class17.field187) {
            int var294 = class523.field7392.method3813((byte) 121);
            int var295 = class523.field7392.method3847((byte) 118);
            if (class569.method3236(arg0 - 26651, var295)) {
                class299.method1928(5, var294, class99.field1551, (byte) 15, 0);
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class111.field1686) {
            class332.method2087(class382.field5391, false);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class221.field3096) {
            int var296 = class523.field7392.method3847((byte) 118);
            int var297 = class523.field7392.method3826(false);
            boolean var298 = (var297 & 0x1) == 1;
            class235.method1609(var298, var296, 0);
            int var299 = class523.field7392.method3847((byte) 118);
            for (int var300 = 0; var300 < var299; var300++) {
                int var301 = class523.field7392.method3851((byte) 30);
                if (var301 == 255) {
                    var301 = class523.field7392.method3841((byte) -128);
                }
                int var302 = class523.field7392.method3855(-2);
                class452.method2674(var302 - 1, (byte) 108, var296, var300, var298, var301);
            }
            class632.field8837[class689.method3797(class216.field3035++, 31)] = var296;
            class312.field4616 = null;
            return true;
        } else if (class46.field711 == class312.field4616) {
            class332.method2087(class150.field2173, false);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class19.field221) {
            class119.method912(arg0 ^ 0xFFFFCB7A);
            class312.field4616 = null;
            return false;
        } else if (class523.field7391 == class312.field4616) {
            int var303 = class523.field7392.method3847((byte) 118);
            int var304 = class523.field7392.method3847((byte) 118);
            int var305 = class523.field7392.method3847((byte) 118);
            int var306 = class523.field7392.method3847((byte) 118);
            if (class569.method3236(-13206, var303) && class181.field2558[var304] != null) {
                for (int var307 = var305; var307 < var306; var307++) {
                    int var308 = class523.field7392.method3873(255);
                    if (class181.field2558[var304].length > var307 && class181.field2558[var304][var307] != null) {
                        class181.field2558[var304][var307].field956 = var308;
                    }
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class550.field7728 == class312.field4616) {
            class332.method2087(class462.field6647, false);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class234.field3636) {
            int var309 = class523.field7392.method3880(8);
            int var310 = class523.field7392.method3847((byte) 118);
            int var311 = class523.field7392.method3859((byte) 76);
            int var312 = class523.field7392.method3855(-2);
            if (class569.method3236(arg0 ^ 0xFFFFF8EF, var310)) {
                class663.method3666(var309, (byte) -93, (var311 << 16) + var312);
            }
            class312.field4616 = null;
            return true;
        } else if (class368.field5264 == class312.field4616) {
            int var313 = class523.field7392.method3847((byte) 118);
            String var314 = class523.field7392.method3836(false);
            Object[] var315 = new Object[var314.length() + 1];
            for (int var316 = var314.length() - 1; var316 >= 0; var316--) {
                if (var314.charAt(var316) == 's') {
                    var315[var316 + 1] = class523.field7392.method3836(false);
                } else {
                    var315[var316 + 1] = Integer.valueOf(class523.field7392.method3880(8));
                }
            }
            var315[0] = Integer.valueOf(class523.field7392.method3880(arg0 - 13437));
            if (class569.method3236(-13206, var313)) {
                class14 var317 = new class14();
                var317.field122 = var315;
                class220.method1443(var317);
            }
            class312.field4616 = null;
            return true;
        } else if (class658.field9229 == class312.field4616) {
            class332.method2087(class466.field6707, false);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class208.field2923) {
            int var318 = class523.field7392.method3855(arg0 ^ 0xFFFFCB7B);
            int var319 = class523.field7392.method3848(-1333735960);
            int var320 = class523.field7392.method3858(true);
            int var321 = class523.field7392.method3848(arg0 ^ 0xB080F96D);
            int var322 = class523.field7392.method3848(-1333735960);
            if (class569.method3236(-13206, var321)) {
                class299.method1928(7, var320, var319 << 16 | var322, (byte) 15, var318);
            }
            class312.field4616 = null;
            return true;
        } else if (class69.field1244 == class312.field4616) {
            int var323 = class523.field7392.method3813((byte) 115);
            int var324 = class523.field7392.method3826(false);
            int var325 = class523.field7392.method3851((byte) 30);
            class633.field8945[var325] = var323;
            class221.field3103[var325] = var324;
            class415.field6020[var325] = 1;
            int var326 = class326.field4817[var325] - 1;
            for (int var327 = 0; var327 < var326; var327++) {
                if (var323 >= class287.field4271[var327]) {
                    class415.field6020[var325] = var327 + 2;
                }
            }
            class520.field7328[class689.method3797(class310.field4597++, 31)] = var325;
            class312.field4616 = null;
            return true;
        } else if (class673.field9518 == class312.field4616) {
            if (class204.method1356(class420.field6113, (byte) -110)) {
                class593.field8378 = (int) ((float) class523.field7392.method3847((byte) 118) * 2.5F);
            } else {
                class593.field8378 = class523.field7392.method3847((byte) 118) * 30;
            }
            class24.field331 = class363.field5184;
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class169.field2432) {
            String var328 = class523.field7392.method3836(false);
            String var329 = class648.method3595(123, class532.method3034(-107, class523.field7392));
            class376.method2265(6, 0, var328, var328, (byte) -121, var328, var329);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class248.field3858) {
            class391.field5794 = class177.method1203(class523.field7392.method3826(false), (byte) -2);
            class312.field4616 = null;
            return true;
        } else if (class563.field7930 == class312.field4616) {
            int var330 = class523.field7392.method3855(-2);
            int var331 = class523.field7392.method3859((byte) 76);
            int var332 = class523.field7392.method3848(arg0 ^ 0xB080F96D);
            int var333 = class523.field7392.method3826(false);
            int var334 = class523.field7392.method3813((byte) 111);
            boolean var335 = (var333 & 0x80) != 0;
            if ((var334 >> 30) != 0) {
                int var336 = var334 >> 28 & 0x3;
                int var337 = ((var334 & 0xFFFC1E9) >> 14) - class109.field1672;
                int var338 = (var334 & 0x3FFF) - class203.field2874;
                if (var337 >= 0 && var338 >= 0 && class199.field2812 > var337 && class232.field3611 > var338) {
                    int var339 = var337 * 512 + 256;
                    int var340 = var338 * 512 + 256;
                    int var341 = var336;
                    if (var336 < 3 && class261.method1718(var338, 1, var337)) {
                        var341 = var336 + 1;
                    }
                    class236 var342 = new class236(var330, 0, class564.field7962, var336, var341, var339, class674.method3748(var339, var336, 103, var340) - var331, var340, var337, var337, var338, var338, var333 & 0x7);
                    class436.field6378.method474(new class420(var342), 6);
                }
            } else if (var334 >> 29 != 0) {
                int var343 = var334 & 0xFFFF;
                class16 var344 = (class16) class189.field2723.method1405((long) var343, (byte) -35);
                if (var344 != null) {
                    if (var330 == 65535) {
                        var330 = -1;
                    }
                    class577 var345 = var344.field174;
                    boolean var346 = true;
                    int var347 = var335 ? var345.field6172 : var345.field6227;
                    if (var330 != -1 && var347 != -1) {
                        if (var330 == var347) {
                            class309 var352 = class86.field1411.method1475((byte) -74, var330);
                            if (var352.field4584 && var352.field4566 != -1) {
                                class30 var353 = class188.field2708.method2140(var352.field4566, arg0 ^ 0x34FB);
                                int var354 = var353.field461;
                                if (var354 == 0 || var354 == 2) {
                                    var346 = false;
                                } else if (var354 == 1) {
                                    var346 = true;
                                }
                            }
                        } else {
                            class309 var348 = class86.field1411.method1475((byte) -74, var330);
                            class309 var349 = class86.field1411.method1475((byte) -74, var347);
                            if (var348.field4566 != -1 && var349.field4566 != -1) {
                                class30 var350 = class188.field2708.method2140(var348.field4566, 123);
                                class30 var351 = class188.field2708.method2140(var349.field4566, 126);
                                if (var351.field462 > var350.field462) {
                                    var346 = false;
                                }
                            }
                        }
                    }
                    if (var346) {
                        if (var335) {
                            var345.field6250 = 1;
                            var345.field6258 = var331;
                            var345.field6174 = class564.field7962 + var332;
                            var345.field6172 = var330;
                            var345.field6200 = 0;
                            var345.field6232 = var333 & 0x7;
                            var345.field6239 = 0;
                            if (class564.field7962 < var345.field6174) {
                                var345.field6200 = -1;
                            }
                            if (var345.field6172 != -1 && class564.field7962 == var345.field6174) {
                                int var357 = class86.field1411.method1475((byte) -74, var345.field6172).field4566;
                                if (var357 != -1) {
                                    class30 var358 = class188.field2708.method2140(var357, 127);
                                    if (var358 != null && var358.field456 != null) {
                                        class603.method3399(var358, var345.field3024, 0, false, -70, var345.field3029, var345.field3019);
                                    }
                                }
                            }
                        } else {
                            var345.field6193 = 0;
                            var345.field6177 = var331;
                            var345.field6176 = var333 & 0x7;
                            var345.field6192 = 0;
                            var345.field6227 = var330;
                            var345.field6164 = 1;
                            var345.field6188 = class564.field7962 + var332;
                            if (class564.field7962 < var345.field6188) {
                                var345.field6192 = -1;
                            }
                            if (var345.field6227 != -1 && class564.field7962 == var345.field6188) {
                                int var355 = class86.field1411.method1475((byte) -74, var345.field6227).field4566;
                                if (var355 != -1) {
                                    class30 var356 = class188.field2708.method2140(var355, 127);
                                    if (var356 != null && var356.field456 != null) {
                                        class603.method3399(var356, var345.field3024, 0, false, -86, var345.field3029, var345.field3019);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var334 >> 28 != 0) {
                int var359 = var334 & 0xFFFF;
                class491 var360;
                if (class99.field1551 == var359) {
                    var360 = class648.field9106;
                } else {
                    var360 = class141.field2087[var359];
                }
                if (var360 != null) {
                    if (var330 == 65535) {
                        var330 = -1;
                    }
                    boolean var361 = true;
                    int var362 = var335 ? var360.field6172 : var360.field6227;
                    if (var330 != -1 && var362 != -1) {
                        if (var330 == var362) {
                            class309 var363 = class86.field1411.method1475((byte) -74, var330);
                            if (var363.field4584 && var363.field4566 != -1) {
                                class30 var364 = class188.field2708.method2140(var363.field4566, 127);
                                int var365 = var364.field461;
                                if (var365 == 0 || var365 == 2) {
                                    var361 = false;
                                } else if (var365 == 1) {
                                    var361 = true;
                                }
                            }
                        } else {
                            class309 var366 = class86.field1411.method1475((byte) -74, var330);
                            class309 var367 = class86.field1411.method1475((byte) -74, var362);
                            if (var366.field4566 != -1 && var367.field4566 != -1) {
                                class30 var368 = class188.field2708.method2140(var366.field4566, 126);
                                class30 var369 = class188.field2708.method2140(var367.field4566, arg0 ^ 0x34FE);
                                if (var368.field462 < var369.field462) {
                                    var361 = false;
                                }
                            }
                        }
                    }
                    if (var361) {
                        if (var335) {
                            var360.field6200 = 0;
                            var360.field6172 = var330;
                            var360.field6239 = 0;
                            var360.field6174 = class564.field7962 + var332;
                            var360.field6232 = var333 & 0x7;
                            var360.field6258 = var331;
                            var360.field6250 = 1;
                            if (var360.field6172 == 65535) {
                                var360.field6172 = -1;
                            }
                            if (class564.field7962 < var360.field6174) {
                                var360.field6200 = -1;
                            }
                            if (var360.field6172 != -1 && class564.field7962 == var360.field6174) {
                                int var370 = class86.field1411.method1475((byte) -74, var360.field6172).field4566;
                                if (var370 != -1) {
                                    class30 var371 = class188.field2708.method2140(var370, arg0 ^ 0x34F8);
                                    if (var371 != null && var371.field456 != null) {
                                        class603.method3399(var371, var360.field3024, 0, class648.field9106 == var360, arg0 - 13541, var360.field3029, var360.field3019);
                                    }
                                }
                            }
                        } else {
                            var360.field6193 = 0;
                            var360.field6192 = 0;
                            var360.field6177 = var331;
                            var360.field6176 = var333 & 0x7;
                            var360.field6188 = class564.field7962 + var332;
                            var360.field6227 = var330;
                            var360.field6164 = 1;
                            if (class564.field7962 < var360.field6188) {
                                var360.field6192 = -1;
                            }
                            if (var360.field6227 == 65535) {
                                var360.field6227 = -1;
                            }
                            if (var360.field6227 != -1 && class564.field7962 == var360.field6188) {
                                int var372 = class86.field1411.method1475((byte) -74, var360.field6227).field4566;
                                if (var372 != -1) {
                                    class30 var373 = class188.field2708.method2140(var372, 124);
                                    if (var373 != null && var373.field456 != null) {
                                        class603.method3399(var373, var360.field3024, 0, class648.field9106 == var360, arg0 - 13536, var360.field3029, var360.field3019);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class134.field1972) {
            class332.method2087(class488.field6934, false);
            class312.field4616 = null;
            return true;
        } else if (class592.field8301 == class312.field4616) {
            if (class100.field1556 != -1) {
                class483.method2815(0, class100.field1556, -2064);
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class21.field286) {
            class61.field1163.method1732(false);
            class674.field9522 += 32;
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class26.field388) {
            int var374 = class523.field7392.method3859((byte) 76);
            int var375 = class523.field7392.method3859((byte) 76);
            String var376 = class523.field7392.method3836(false);
            if (class569.method3236(-13206, var375)) {
                class409.method2473(0, var374, var376);
            }
            class312.field4616 = null;
            return true;
        } else if (class662.field9359 == class312.field4616) {
            class363.field5180 = class523.field7392.method3826(false);
            for (int var377 = 0; var377 < class363.field5180; var377++) {
                class98.field1547[var377] = class523.field7392.method3836(false);
                class172.field2443[var377] = class523.field7392.method3836(false);
                if (class172.field2443[var377].equals("")) {
                    class172.field2443[var377] = class98.field1547[var377];
                }
                class484.field6879[var377] = class523.field7392.method3836(false);
                class591.field8280[var377] = class523.field7392.method3836(false);
                if (class591.field8280[var377].equals("")) {
                    class591.field8280[var377] = class484.field6879[var377];
                }
                class42.field688[var377] = false;
            }
            class264.field4013 = class363.field5184;
            class312.field4616 = null;
            return true;
        } else if (class540.field7558 == class312.field4616) {
            int var378 = class523.field7392.method3813((byte) 116);
            int var379 = class523.field7392.method3845(-2);
            int var380 = class523.field7392.method3855(-2);
            if (class569.method3236(-13206, var380)) {
                class112.method869((byte) -24, var379, var378);
            }
            class312.field4616 = null;
            return true;
        } else if (class40.field655 == class312.field4616) {
            class332.method2087(class294.field4325, false);
            class312.field4616 = null;
            return true;
        } else if (class83.field1377 == class312.field4616) {
            int var381 = class523.field7392.method3855(-2);
            int var382 = class523.field7392.method3869(arg0 ^ 0xFFFFCB05);
            class61.field1163.method1731(var382, (byte) -68, var381);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class311.field4613) {
            class264.field4011 = class418.field6098 > 2 ? class523.field7392.method3836(false) : class274.field4142.method1804(7175, class512.field7203);
            class696.field9826 = class418.field6098 <= 0 ? -1 : class523.field7392.method3847((byte) 118);
            if (class696.field9826 == 65535) {
                class696.field9826 = -1;
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class109.field1674) {
            int var383 = class523.field7392.method3847((byte) 118);
            int var384 = class523.field7392.method3826(false);
            if (class569.method3236(-13206, var383)) {
                class332.field4921 = var384;
            }
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class139.field2045) {
            String var385 = class523.field7392.method3836(false);
            boolean var386 = class523.field7392.method3826(false) == 1;
            String var387;
            if (var386) {
                var387 = class523.field7392.method3836(false);
            } else {
                var387 = var385;
            }
            int var388 = class523.field7392.method3847((byte) 118);
            byte var389 = class523.field7392.method3827((byte) -80);
            boolean var390 = false;
            if (var389 == -128) {
                var390 = true;
            }
            if (var390) {
                if (class433.field6341 == 0) {
                    class312.field4616 = null;
                    return true;
                }
                boolean var396 = false;
                int var397;
                for (var397 = 0; class433.field6341 > var397 && (!class564.field7965[var397].field1800.equals(var387) || class564.field7965[var397].field1798 != var388); var397++) {
                }
                if (var397 < class433.field6341) {
                    while (class433.field6341 - 1 > var397) {
                        class564.field7965[var397] = class564.field7965[var397 + 1];
                        var397++;
                    }
                    class433.field6341--;
                    class564.field7965[class433.field6341] = null;
                }
            } else {
                String var391 = class523.field7392.method3836(false);
                class119 var392 = new class119();
                var392.field1800 = var387;
                var392.field1803 = var385;
                var392.field1808 = class563.method3220((byte) 86, var392.field1800);
                var392.field1806 = var389;
                var392.field1798 = var388;
                var392.field1801 = var391;
                int var393;
                for (var393 = class433.field6341 - 1; var393 >= 0; var393--) {
                    int var394 = class564.field7965[var393].field1808.compareTo(var392.field1808);
                    if (var394 == 0) {
                        class564.field7965[var393].field1798 = var388;
                        class564.field7965[var393].field1806 = var389;
                        class564.field7965[var393].field1801 = var391;
                        if (var387.equals(class648.field9106.field6981)) {
                            class227.field3190 = var389;
                        }
                        class594.field8401 = class363.field5184;
                        class312.field4616 = null;
                        return true;
                    }
                    if (var394 < 0) {
                        break;
                    }
                }
                if (class433.field6341 >= class564.field7965.length) {
                    class312.field4616 = null;
                    return true;
                }
                for (int var395 = class433.field6341 - 1; var395 > var393; var395--) {
                    class564.field7965[var395 + 1] = class564.field7965[var395];
                }
                if (class433.field6341 == 0) {
                    class564.field7965 = new class119[100];
                }
                class564.field7965[var393 + 1] = var392;
                class433.field6341++;
                if (var387.equals(class648.field9106.field6981)) {
                    class227.field3190 = var389;
                }
            }
            class312.field4616 = null;
            class594.field8401 = class363.field5184;
            return true;
        } else if (class83.field1374 == class312.field4616) {
            class181.method1221(-127, class418.field6098, class523.field7392);
            class312.field4616 = null;
            return true;
        } else if (class86.field1409 == class312.field4616) {
            int var398 = class523.field7392.method3859((byte) 76);
            int var399 = class523.field7392.method3847((byte) 118);
            int var400 = class523.field7392.method3880(8);
            int var401 = class523.field7392.method3859((byte) 76);
            if (var401 == 65535) {
                var401 = -1;
            }
            int var402 = class523.field7392.method3848(arg0 ^ 0xB080F96D);
            if (var402 == 65535) {
                var402 = -1;
            }
            if (class569.method3236(-13206, var398)) {
                for (int var403 = var402; var403 <= var401; var403++) {
                    long var404 = ((long) var400 << 32) + (long) var403;
                    class132 var406 = (class132) class219.field3065.method1405(var404, (byte) -41);
                    class132 var407;
                    if (var406 != null) {
                        var407 = new class132(var406.field1943, var399);
                        var406.method3678(-1);
                    } else if (var403 == -1) {
                        var407 = new class132(class534.method3038(arg0 ^ 0xFFFFCB26, var400).field935.field1943, var399);
                    } else {
                        var407 = new class132(0, var399);
                    }
                    class219.field3065.method1403((byte) -18, var407, var404);
                }
            }
            class312.field4616 = null;
            return true;
        } else if (class563.field7929 == class312.field4616) {
            byte var408 = class523.field7392.method3827((byte) 30);
            int var409 = class523.field7392.method3855(-2);
            int var410 = class523.field7392.method3859((byte) 76);
            if (class569.method3236(-13206, var409)) {
                class268.method1752(var408, var410, 0);
            }
            class312.field4616 = null;
            return true;
        } else if (class648.field9104 == class312.field4616) {
            class332.method2087(class577.field8128, false);
            class312.field4616 = null;
            return true;
        } else if (class77.field1331 == class312.field4616) {
            class537.method3052(false);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class236.field3648) {
            int var411 = class523.field7392.method3847((byte) 118);
            int var412 = class523.field7392.method3826(false);
            int var413 = class523.field7392.method3826(false);
            int var414 = class523.field7392.method3826(false);
            int var415 = class523.field7392.method3826(false);
            int var416 = class523.field7392.method3847((byte) 118);
            if (class569.method3236(-13206, var411)) {
                class598.field8449[var412] = true;
                class499.field7074[var412] = var413;
                class316.field4676[var412] = var414;
                class32.field505[var412] = var415;
                class271.field4079[var412] = var416;
            }
            class312.field4616 = null;
            return true;
        } else if (class319.field4700 == class312.field4616) {
            int var417 = class523.field7392.method3858(true);
            int var418 = class523.field7392.method3859((byte) 76);
            class61.field1163.method1735(arg0 - 16983, var418, var417);
            class312.field4616 = null;
            return true;
        } else if (class648.field9105 == class312.field4616) {
            int var419 = class523.field7392.method3826(false);
            int var420 = class523.field7392.method3826(false);
            if (var419 == 255) {
                var420 = -1;
                var419 = -1;
            }
            class316.method1995(arg0 + 16560, var420, var419);
            class312.field4616 = null;
            return true;
        } else if (class312.field4616 == class31.field488) {
            class40.method455(102, class418.field6098, class368.field5267, class523.field7392);
            class312.field4616 = null;
            return true;
        } else if (class491.field6969 == class312.field4616) {
            int var421 = class523.field7392.method3826(false);
            if (class523.field7392.method3826(false) == 0) {
                class145.field2123[var421] = new class199();
            } else {
                class523.field7392.field9761--;
                class145.field2123[var421] = new class199(class523.field7392);
            }
            class312.field4616 = null;
            class681.field9608 = class363.field5184;
            return true;
        } else if (class312.field4616 == class311.field4610) {
            class332.method2087(class360.field5168, false);
            class312.field4616 = null;
            return true;
        } else if (class84.field1391 == class312.field4616) {
            int var422 = class523.field7392.method3826(false);
            int var423 = var422 >> 5;
            int var424 = var422 & 0x1F;
            if (var424 == 0) {
                class601.field8496[var423] = null;
                class312.field4616 = null;
                return true;
            }
            class390 var425 = new class390();
            var425.field5787 = var424;
            var425.field5788 = class523.field7392.method3826(false);
            if (var425.field5788 >= 0 && class498.field7055.length > var425.field5788) {
                if (var425.field5787 == 1 || var425.field5787 == 10) {
                    var425.field5786 = class523.field7392.method3847((byte) 118);
                    class523.field7392.field9761 += 6;
                } else if (var425.field5787 >= 2 && var425.field5787 <= 6) {
                    if (var425.field5787 == 2) {
                        var425.field5791 = 256;
                        var425.field5785 = 256;
                    }
                    if (var425.field5787 == 3) {
                        var425.field5785 = 256;
                        var425.field5791 = 0;
                    }
                    if (var425.field5787 == 4) {
                        var425.field5785 = 256;
                        var425.field5791 = 512;
                    }
                    if (var425.field5787 == 5) {
                        var425.field5791 = 256;
                        var425.field5785 = 0;
                    }
                    if (var425.field5787 == 6) {
                        var425.field5785 = 512;
                        var425.field5791 = 256;
                    }
                    var425.field5787 = 2;
                    var425.field5784 = class523.field7392.method3826(false);
                    var425.field5791 += class523.field7392.method3847((byte) 118) - class109.field1672 << 9;
                    var425.field5785 += class523.field7392.method3847((byte) 118) - class203.field2874 << 9;
                    var425.field5778 = class523.field7392.method3826(false) << 2;
                    var425.field5777 = class523.field7392.method3847((byte) 118);
                }
                var425.field5789 = class523.field7392.method3847((byte) 118);
                if (var425.field5789 == 65535) {
                    var425.field5789 = -1;
                }
                class601.field8496[var423] = var425;
            }
            class312.field4616 = null;
            return true;
        } else if (class548.field7710 == class312.field4616) {
            int var426 = class523.field7392.method3880(8);
            int var427 = class523.field7392.method3847((byte) 118);
            if (class569.method3236(-13206, var427)) {
                class299.method1928(3, var426, -1, (byte) 15, -1);
            }
            class312.field4616 = null;
            return true;
        } else if (class87.field1468 == class312.field4616) {
            int var428 = class523.field7392.method3848(-1333735960);
            int var429 = class523.field7392.method3855(-2);
            int var430 = class523.field7392.method3818((byte) 83);
            if (class569.method3236(-13206, var429)) {
                if (var430 == 2) {
                    class528.method3025((byte) -120);
                }
                class100.field1556 = var428;
                class394.method2433(var428, 1);
                class433.method2580((byte) 7, false);
                class220.method1451(class100.field1556);
                for (int var431 = 0; var431 < 100; var431++) {
                    class508.field7177[var431] = true;
                }
            }
            class312.field4616 = null;
            return true;
        } else {
            class699.method3896(94, null, "T1 - " + (class312.field4616 == null ? -1 : class312.field4616.method3674((byte) 93)) + "," + (class139.field2017 == null ? -1 : class139.field2017.method3674((byte) 64)) + "," + (class164.field2361 == null ? -1 : class164.field2361.method3674((byte) 24)) + " - " + class418.field6098);
            class88.method764(0, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)Lrw;", line = 3330)
    public final class703 method351(byte arg0) {
        field3753++;
        return arg0 < 73 ? null : class573.field8065;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)I", line = 3341)
    public static final int method1641(byte arg0) {
        if (arg0 > -39) {
            method1642((byte) -107);
        }
        field3752++;
        return 19;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V", line = 3358)
    public static void method1642(byte arg0) {
        field3754 = null;
        field3755 = null;
        if (arg0 == 49) {
            field3751 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V", line = 3369)
    public class240(int arg0) {
        this.field3749 = arg0;
    }
}
