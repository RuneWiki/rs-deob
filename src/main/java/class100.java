import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class100 extends class176 {

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field2346 = 2;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field2359 = 0;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Z")
    public static boolean field2360 = true;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Lch;")
    public static class29 field2351 = new class29(64);

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    public static int field2365 = 0;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "Lgg;")
    public static class63 field2364 = class116.method911(43, "jlv");

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public int field2356;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "[I")
    public int[] field2353;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "[I")
    public int[] field2361;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "[I")
    public int[] field2362;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "[I")
    public static int[] field2363;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "[Lje;")
    public class87[] field2347;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "[Lje;")
    public class87[] field2354;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "[[[B")
    public byte[][][] field2345;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static final void method838(int arg0) {
        class110.field2484 = new class78(32);
        if (arg0 != 5) {
            field2360 = false;
        }
        field2349++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZ)V")
    public static final void method839(int arg0, int arg1, boolean arg2) {
        field2352++;
        if (arg2 && class109.field2464 == 2) {
            class10.method132((class138.field2952 - class3.field110 << 7) + class65.field1649, 671674313, class97.field2304 * 2, (class21.field492 - class38.field921 << 7) + class188.field3799);
            if (class138.field2956 > -1 && class173.field3571 % 20 < 10) {
                class111.field2506[0].method1320(class138.field2956 + arg1 - 12, arg0 + -28 + class186.field3751);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
    public static final void method840(int arg0) {
        field2355++;
        int var1 = 75 % ((15 - arg0) / 57);
        if (class198.field3964 && class158.field3274 != class112.field2528) {
            class165.method1118(class140.field3023, class3.field72.field1164[0], class3.field72.field1117[0], class158.field3270, class112.field2528, (byte) 118);
        } else if (class23.field543 != class112.field2528) {
            class23.field543 = class112.field2528;
            class132.method968(class112.field2528, 0);
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public static void method841(int arg0) {
        field2364 = null;
        field2363 = null;
        if (arg0 != 16777215) {
            method844(null, 20, null);
        }
        field2351 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILff;)V")
    public static final void method842(int arg0, int arg1, int arg2, class54 arg3) {
        field2348++;
        if (class19.field442 != 0 && class19.field442 != 3) {
            return;
        }
        int var4 = arg0 - arg3.field1302 / 2;
        int var5 = arg1 - arg3.field1435 / 2;
        int var6 = class68.field1710 + class121.field2690 & 0x7FF;
        int var7 = class25.field576[var6];
        if (arg2 < 98) {
            field2364 = null;
        }
        int var8 = (class199.field3977 + 256) * var7 >> 8;
        int var9 = class25.field571[var6];
        int var10 = (class199.field3977 + 256) * var9 >> 8;
        int var11 = var5 * var8 - var4 * var10 >> 11;
        int var12 = var5 * var10 + var4 * var8 >> 11;
        int var13 = class3.field72.field1141 + var12 >> 7;
        int var14 = class3.field72.field1144 - var11 >> 7;
        boolean var15 = class162.method1105(0, class3.field72.field1117[0], 0, 0, 0, 1, var13, class3.field72.field1164[0], var14, true, (byte) -70, 0);
        if (!var15) {
            return;
        }
        class141.field3031.method66(2, var4);
        class141.field3031.method66(2, var5);
        class141.field3031.method62(class68.field1710, (byte) 97);
        class141.field3031.method66(2, 57);
        class141.field3031.method66(2, class121.field2690);
        class141.field3031.method66(2, class199.field3977);
        class141.field3031.method66(2, 89);
        class141.field3031.method62(class3.field72.field1141, (byte) -75);
        class141.field3031.method62(class3.field72.field1144, (byte) -100);
        class141.field3031.method66(2, class150.field3151);
        class141.field3031.method66(2, 63);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILgg;Lgg;)V")
    public static final void method843(byte arg0, int arg1, class63 arg2, class63 arg3) {
        class150.method1056(arg3, 9213, arg1, null, arg2);
        if (arg0 >= -83) {
            method842(67, 38, 24, null);
        }
        field2357++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lth;ILth;)V")
    public static final void method844(class179 arg0, int arg1, class179 arg2) {
        field2358++;
        if (class88.field2081) {
            class12.method150((byte) -81, arg2, arg0);
            return;
        }
        if (class136.field2932 == 0 || class136.field2932 == 5) {
            byte var3 = 20;
            arg2.method647(class68.field1714, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class178.method1186(230, var4, 304, 34, 9179409);
            class178.method1186(231, var4 + 1, 302, 32, 0);
            class178.method1191(232, var4 + 2, class116.field2592 * 3, 30, 9179409);
            class178.method1191(class116.field2592 * 3 + 232, var4 - -2, 300 - class116.field2592 * 3, 30, 0);
            arg2.method647(class153.field3207, 382, 276 - var3, 16777215, -1);
        }
        if (class136.field2932 == 20) {
            class88.field2070.method1083(382 - class88.field2070.field3254 / 2, -(class88.field2070.field3255 / 2) + 271);
            short var5 = 211;
            arg2.method647(class153.field3212, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg2.method647(class153.field3204, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg2.method647(class153.field3209, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg2.method644(class89.method772((byte) 126, new class63[] { class189.field3834, class70.method660(class153.field3201) }), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg2.method644(class89.method772((byte) 101, new class63[] { class85.field2009, class153.field3205.method586(70) }), 274, var28, 16777215, 0);
            int var30 = var28 + 15;
        }
        if (class136.field2932 == 10) {
            class88.field2070.method1083(202, 171);
            if (class77.field1881 == 0) {
                short var15 = 251;
                arg2.method647(class60.field1527, 382, var15, 16776960, 0);
                short var16 = 302;
                int var37 = var15 + 30;
                short var17 = 291;
                class131.field2858.method1083(var16 - 73, var17 + -20);
                arg2.method648(class91.field2126, var16 - 73, var17 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var18 = 462;
                class131.field2858.method1083(var18 - 73, var17 + -20);
                arg2.method648(class13.field303, var18 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class77.field1881 == 2) {
                short var6 = 211;
                arg2.method647(class153.field3212, 382, var6, 16776960, 0);
                int var27 = var6 + 15;
                arg2.method647(class153.field3204, 382, var27, 16776960, 0);
                int var29 = var27 + 15;
                arg2.method647(class153.field3209, 382, var29, 16776960, 0);
                int var31 = var29 + 15;
                int var32 = var31 + 10;
                boolean var7;
                if (class138.field2964 == 0 && class173.field3571 % 40 < 20 && class144.field3080) {
                    var7 = true;
                } else {
                    var7 = false;
                }
                short var8 = 302;
                short var9 = 321;
                arg2.method644(class89.method772((byte) 83, new class63[] { class189.field3834, class70.method660(class153.field3201), var7 ? class196.field3947 : class153.field3210 }), 272, var32, 16777215, 0);
                var27 = var32 + 15;
                boolean var10;
                if (class138.field2964 == 1 && class173.field3571 % 40 < 20 && class144.field3080) {
                    var10 = true;
                } else {
                    var10 = false;
                }
                arg2.method644(class89.method772((byte) 107, new class63[] { class85.field2009, class153.field3205.method586(114), var10 ? class196.field3947 : class153.field3210 }), 274, var27, 16777215, 0);
                var27 += 15;
                class131.field2858.method1083(var8 - 73, var9 + -20);
                arg2.method647(class118.field2633, var8, var9 + 5, 16777215, 0);
                short var11 = 462;
                class131.field2858.method1083(var11 - 73, var9 - 20);
                arg2.method647(class103.field2374, var11, var9 + 5, 16777215, 0);
            } else if (class77.field1881 == 3) {
                arg2.method647(class106.field2413, 382, 211, 16776960, 0);
                short var12 = 236;
                arg2.method647(class9.field218, 382, var12, 16777215, 0);
                short var13 = 321;
                short var14 = 382;
                int var33 = var12 + 15;
                arg2.method647(class130.field2835, 382, var33, 16777215, 0);
                int var34 = var33 + 15;
                arg2.method647(class177.field3629, 382, var34, 16777215, 0);
                int var35 = var34 + 15;
                arg2.method647(class83.field1970, 382, var35, 16777215, 0);
                class131.field2858.method1083(var14 - 73, var13 - 20);
                arg2.method647(class103.field2374, var14, var13 + 5, 16777215, 0);
                int var36 = var35 + 15;
            }
        }
        if (class51.field1248 != 1) {
            if (class106.field2421 > 0) {
                class28.method273(true, class106.field2421);
                class106.field2421 = 0;
            }
            class184.method1215((byte) 92);
        }
        class136.field2936[class190.field3871 ? 1 : 0].method1083(725, 463);
        if (class136.field2932 > 5 && class59.field1518 != 2 && class22.field512 == 0) {
            if (class83.field1977 == null) {
                class83.field1977 = class163.method1108((byte) 109, class153.field3210, class12.field286, class110.field2479);
            } else {
                byte var19 = 5;
                short var20 = 463;
                class83.field1977.method1083(var19, var20);
                byte var21 = 35;
                byte var22 = 100;
                arg2.method647(class89.method772((byte) 63, new class63[] { class116.field2604, class63.field1609, class175.method1162((byte) -126, class105.field2408) }), var19 + var22 / 2, var21 / 2 + -2 + var20, 16777215, 0);
                if (class110.field2483 == null) {
                    arg0.method647(class47.field1125, var19 + var22 / 2, var20 - -(var21 / 2) - -12, 16777215, 0);
                } else {
                    arg0.method647(class134.field2892, var22 / 2 + var19, var21 / 2 + (var20 - -12), 16777215, 0);
                }
            }
        }
        if (arg1 < 108) {
            field2364 = null;
        }
    }
}
