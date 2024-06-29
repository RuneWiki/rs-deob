import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class169 {

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Lak;")
    public static class29 field2672 = new class29();

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "Lck;")
    private static class119 field2677 = class298.method1987((byte) 7, "Use");

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Lck;")
    public static class119 field2678 = field2677;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Lpi;")
    public static class73 field2680 = new class73(128);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public int field2658;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public int field2659;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public int field2660;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field2668;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public int field2669;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public int field2679;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lva;")
    public static class36 field2681;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 5)
    public static void method1067(int arg0) {
        field2672 = null;
        field2678 = null;
        field2681 = null;
        field2680 = null;
        field2677 = null;
        if (arg0 != 7) {
            field2678 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Lck;", line = 34)
    public static final class119 method1068(int arg0, int arg1, int arg2) {
        field2662++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return class177.field2821;
        } else if (var3 < -6) {
            return class13.field207;
        } else if (var3 < -3) {
            return class270.field4454;
        } else if (var3 >= 0) {
            if (arg2 != -23736) {
                field2678 = (class119) null;
            }
            if (var3 > 9) {
                return class2.field24;
            } else if (var3 > 6) {
                return class67.field1047;
            } else if (var3 <= 3) {
                return var3 <= 0 ? class49.field740 : class5.field136;
            } else {
                return class227.field3627;
            }
        } else {
            return class208.field3318;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 76)
    public static final void method1069(int arg0) {
        field2666++;
        if (class233.field3760 != null) {
            class233.field3760.method1629(-80);
        }
        if (arg0 != -21771) {
            method1068(28, -7, -36);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V", line = 91)
    public static final void method1070(int arg0) {
        field2663++;
        if (class69.field1087 == 203) {
            class22.field333.method68((byte) -125);
            class22.field333.method33(true);
            class22.field333.method23(arg0 - 244);
            class22.field333.method54(31935);
            class22.field333.method22((byte) -83);
            class22.field333.method58(255);
            class22.field333.method63((byte) 1);
            class22.field333.method22((byte) -122);
            class22.field333.method24(false);
            int var1 = class22.field333.method63((byte) 1);
            if (class262.field4259 != var1) {
            }
        }
        if (class69.field1087 == 34) {
            int var2 = class22.field333.method15((byte) 99);
            int var3 = class22.field333.method15((byte) 122);
            int var4 = class22.field333.method58(arg0 ^ 0x57);
            int var5 = (var4 & 0x7) + class250.field4037;
            int var6 = ((var4 & 0x78) >> 4) + class246.field3983;
            if (var6 >= 0 && var5 >= 0 && var6 < 104 && var5 < 104) {
                class256 var7 = new class256();
                var7.field4111 = var3;
                var7.field4117 = var2;
                if (class240.field3841[class10.field189][var6][var5] == null) {
                    class240.field3841[class10.field189][var6][var5] = new class156();
                }
                class240.field3841[class10.field189][var6][var5].method999(new class155(var7), (byte) -108);
                class54.method400(var6, var5, arg0 + 9639);
            }
        } else if (class69.field1087 == 29) {
            int var8 = class22.field333.method64((byte) -105);
            int var9 = (var8 >> 4 & 0x7) + class246.field3983;
            int var10 = class250.field4037 + (var8 & 0x7);
            int var11 = class22.field333.method63((byte) 1);
            int var12 = class22.field333.method64((byte) -113);
            int var13 = (var12 & 0xFD) >> 4;
            int var14 = class22.field333.method64((byte) 114);
            int var15 = var12 & 0x7;
            if (var11 == 65535) {
                var11 = -1;
            }
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                int var16 = var13 + 1;
                if (class124.field1917.field4963[0] >= (var9 - var16) && class124.field1917.field4963[0] <= (var9 + var16) && class124.field1917.field4973[0] >= (var10 - var16) && class124.field1917.field4973[0] <= var10 + var16 && class184.field2916 != 0 && var15 > 0 && class74.field1154 < 50 && var11 != -1) {
                    class220.field3535[class74.field1154] = var11;
                    class134.field2152[class74.field1154] = var15;
                    class262.field4250[class74.field1154] = var14;
                    class249.field4023[class74.field1154] = null;
                    class272.field4471[class74.field1154] = (var9 << 16) + (var10 << 8) + var13;
                    class74.field1154++;
                }
            }
        } else if (class69.field1087 == 80) {
            int var17 = class22.field333.method64((byte) -126);
            int var18 = (var17 >> 4 & 0x7) + class246.field3983;
            int var19 = class250.field4037 + (var17 & 0x7);
            int var20 = class22.field333.method63((byte) 1);
            int var21 = class22.field333.method63((byte) 1);
            int var22 = class22.field333.method63((byte) 1);
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                class156 var23 = class240.field3841[class10.field189][var18][var19];
                if (var23 != null) {
                    for (class155 var24 = (class155) var23.method995(arg0 + 1836596768); var24 != null; var24 = (class155) var23.method996(0)) {
                        class256 var25 = var24.field2476;
                        if ((var20 & 0x7FFF) == var25.field4117 && var25.field4111 == var21) {
                            var25.field4111 = var22;
                            break;
                        }
                    }
                    class54.method400(var18, var19, 9807);
                }
            }
        } else if (class69.field1087 == 66) {
            int var26 = class22.field333.method64((byte) -83);
            int var27 = var26 >> 2;
            int var28 = var26 & 0x3;
            int var29 = class56.field888[var27];
            int var30 = class22.field333.method45((byte) -126);
            int var31 = (var30 & 0x7) + class250.field4037;
            int var32 = (var30 >> 4 & 0x7) + class246.field3983;
            if (var32 >= 0 && var31 >= 0 && var32 < 104 && var31 < 104) {
                class49.method370(var29, var32, 0, var28, var27, class10.field189, var31, -1, (byte) -26, -1);
            }
        } else if (class69.field1087 == 254) {
            int var33 = class22.field333.method64((byte) -82);
            int var34 = (var33 >> 4 & 0xF) + class246.field3983 * 2;
            int var35 = class250.field4037 * 2 + (var33 & 0xF);
            int var36 = class22.field333.method24(false) + var34;
            int var37 = var35 + class22.field333.method24(false);
            int var38 = class22.field333.method59((byte) -68);
            int var39 = class22.field333.method63((byte) 1);
            int var40 = class22.field333.method64((byte) 111) * 4;
            int var41 = class22.field333.method64((byte) -97) * 4;
            int var42 = class22.field333.method63((byte) 1);
            int var43 = class22.field333.method63((byte) 1);
            int var44 = class22.field333.method64((byte) 11);
            int var45 = class22.field333.method64((byte) -108);
            if (var34 >= 0 && var35 >= 0 && var34 < 208 && var35 < 208 && var36 >= 0 && var37 >= 0 && var36 < 208 && var37 < 208 && var39 != 65535) {
                int var46 = var34 * 64;
                int var47 = var35 * 64;
                int var48 = var36 * 64;
                int var49 = var37 * 64;
                class118 var50 = new class118(var39, class10.field189, var46, var47, class207.method1304(class10.field189, (byte) 87, var46, var47) - var40, class1.field15 + var42, class1.field15 + var43, var44, var45, var38, var41);
                var50.method746(class1.field15 + var42, var48, 16383, var49, class207.method1304(class10.field189, (byte) 85, var48, var49) - var41);
                class147.field2355.method999(new class9(var50), (byte) -108);
            }
        } else if (class69.field1087 == 224) {
            int var51 = class22.field333.method45((byte) -126);
            int var52 = (var51 & 0x7) + class250.field4037;
            int var53 = class246.field3983 + (var51 >> 4 & 0x7);
            int var54 = class22.field333.method23(-66);
            int var55 = class22.field333.method58(arg0 ^ 0x57);
            int var56 = var55 >> 2;
            int var57 = class56.field888[var56];
            int var58 = var55 & 0x3;
            if (var53 >= 0 && var52 >= 0 && var53 < 104 && var52 < 104) {
                class49.method370(var57, var53, 0, var58, var56, class10.field189, var52, -1, (byte) -17, var54);
            }
        } else if (class69.field1087 == 170) {
            int var100 = class22.field333.method68((byte) -121);
            int var101 = ((var100 & 0x75) >> 4) + class246.field3983;
            int var102 = class250.field4037 + (var100 & 0x7);
            int var103 = class22.field333.method54(31935);
            int var104 = class22.field333.method54(31935);
            int var105 = class22.field333.method23(-13);
            if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104 && class262.field4259 != var103) {
                class256 var106 = new class256();
                var106.field4117 = var104;
                var106.field4111 = var105;
                if (class240.field3841[class10.field189][var101][var102] == null) {
                    class240.field3841[class10.field189][var101][var102] = new class156();
                }
                class240.field3841[class10.field189][var101][var102].method999(new class155(var106), (byte) -108);
                class54.method400(var101, var102, 9807);
            }
        } else if (class69.field1087 == arg0) {
            int var82 = class22.field333.method64((byte) -84);
            int var83 = class246.field3983 + (var82 >> 4 & 0x7);
            int var84 = class250.field4037 + (var82 & 0x7);
            int var85 = var83 + class22.field333.method24(false);
            int var86 = var84 + class22.field333.method24(false);
            int var87 = class22.field333.method59((byte) -68);
            int var88 = class22.field333.method63((byte) 1);
            int var89 = class22.field333.method64((byte) 21) * 4;
            int var90 = class22.field333.method64((byte) 7) * 4;
            int var91 = class22.field333.method63((byte) 1);
            int var92 = class22.field333.method63((byte) 1);
            int var93 = class22.field333.method64((byte) -128);
            int var94 = class22.field333.method64((byte) -115);
            if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var88 != 65535) {
                int var95 = var84 * 128 + 64;
                int var96 = var83 * 128 + 64;
                int var97 = var85 * 128 + 64;
                class118 var98 = new class118(var88, class10.field189, var96, var95, class207.method1304(class10.field189, (byte) 94, var96, var95) - var89, class1.field15 + var91, var92 + class1.field15, var93, var94, var87, var90);
                int var99 = var86 * 128 + 64;
                var98.method746(var91 + class1.field15, var97, 16383, var99, class207.method1304(class10.field189, (byte) 118, var97, var99) - var90);
                class147.field2355.method999(new class9(var98), (byte) -108);
            }
        } else if (class69.field1087 == 21) {
            int var59 = class22.field333.method45((byte) -126);
            int var60 = class246.field3983 + (var59 >> 4 & 0x7);
            int var61 = (var59 & 0x7) + class250.field4037;
            int var62 = class22.field333.method64((byte) 69);
            int var63 = var62 & 0x3;
            int var64 = var62 >> 2;
            int var65 = class56.field888[var64];
            int var66 = class22.field333.method23(-45);
            if (var66 == 65535) {
                var66 = -1;
            }
            class281.method1864(var64, var66, var63, var60, true, var65, class10.field189, var61);
        } else if (class69.field1087 == 55) {
            int var76 = class22.field333.method23(-55);
            int var77 = class22.field333.method64((byte) 111);
            int var78 = (var77 >> 4 & 0x7) + class246.field3983;
            int var79 = class250.field4037 + (var77 & 0x7);
            if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                class156 var80 = class240.field3841[class10.field189][var78][var79];
                if (var80 != null) {
                    for (class155 var81 = (class155) var80.method995(1836596936); var81 != null; var81 = (class155) var80.method996(0)) {
                        if ((var76 & 0x7FFF) == var81.field2476.field4117) {
                            var81.method552((byte) 100);
                            break;
                        }
                    }
                    if (var80.method995(1836596936) == null) {
                        class240.field3841[class10.field189][var78][var79] = null;
                    }
                    class54.method400(var78, var79, arg0 + 9639);
                }
            }
        } else if (class69.field1087 == 36) {
            int var67 = class22.field333.method64((byte) 46);
            int var68 = (var67 & 0x7) + class250.field4037;
            int var69 = ((var67 & 0x7C) >> 4) + class246.field3983;
            int var70 = class22.field333.method63((byte) 1);
            int var71 = class22.field333.method64((byte) -128);
            int var72 = class22.field333.method63((byte) 1);
            if (var69 >= 0 && var68 >= 0 && var69 < 104 && var68 < 104) {
                int var73 = var68 * 128 + 64;
                int var74 = var69 * 128 + 64;
                class42 var75 = new class42(var70, class10.field189, var74, var73, class207.method1304(class10.field189, (byte) 101, var74, var73) - var71, var72, class1.field15);
                class10.field182.method999(new class71(var75), (byte) -108);
            }
        }
    }
}
