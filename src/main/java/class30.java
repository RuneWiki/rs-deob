import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class30 extends class424 {

    @OriginalMember(owner = "client!he", name = "M", descriptor = "[I")
    public static int[] field411 = new int[5];

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field413 = 0;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "[Lcp;")
    public static class399[] field417 = new class399[5];

    @OriginalMember(owner = "client!he", name = "R", descriptor = "Z")
    public static boolean field416 = false;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "[I")
    public static int[] field418 = new int[4096];

    @OriginalMember(owner = "client!he", name = "U", descriptor = "Ltn;")
    public static class109 field419;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "Lij;")
    public static class316 field412;

    static {
        for (int var0 = 0; var0 < field417.length; var0++) {
            field417[var0] = new class399();
        }
        field419 = new class109(32);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lea;III)V", line = 6)
    public static final void method281(class58 arg0, int arg1, int arg2, int arg3) {
        field414++;
        if (arg1 < 0 || arg3 < 0 || class95.field1313 == 0 || class290.field3939 == 0) {
            return;
        }
        arg0.method194(class42.field547, class13.field113, class95.field1313, class290.field3939);
        arg0.method227(class80.field1122, class71.field996, class95.field1313, class290.field3939);
        class309 var4 = arg0.method220();
        var4.method1872(class86.field1210, class422.field5844, class442.field6202, class174.field2481, class352.field4736, class448.field6351);
        arg0.method168(var4);
        if (class82.field1130 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method258();
            int var8 = (arg1 - class42.field547) * var7 / class95.field1313;
            int var9 = (arg3 - class13.field113) * var7 / class290.field3939;
            int var10 = arg0.method253();
            int var11 = (arg1 - class42.field547) * var10 / class95.field1313;
            int var12 = (arg3 - class13.field113) * var10 / class290.field3939;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method1857(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method1857(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class11.field107 && class264.field3620 > var22) {
                    int var23 = class343.field4623;
                    if (var23 < 3 && (class302.field4122[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class82.field1130[var23].method331(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + ((class359.field4970.method1285(-102) - 1) * 64) >> 7;
                        var6 = (class359.field4970.method1285(arg2 - 102) - 1) * 64 + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class213.field2980 && (class277.field3780 & 0x40) != 0) {
                    class108 var24 = class451.method2815(class217.field3045, class34.field467, (byte) -53);
                    if (var24 == null) {
                        class429.method2645(4);
                    } else {
                        class46.method379(class302.field4121, 30, var5, true, 0L, var6, class438.field6183, " ->");
                    }
                } else {
                    if (class133.field1986 == 1) {
                        class46.method379(class312.field4234.method2313((byte) -99, class445.field6241), 50, var5, true, 0L, var6, -1, "");
                    }
                    class100.field1387++;
                    class46.method379(class302.field4123, 13, var5, true, 0L, var6, -1, "");
                }
            }
        }
        class399 var25 = class345.field4667;
        class450 var26 = (class450) var25.method2480(7904);
        if (arg2 != -2) {
            field417 = null;
        }
        while (var26 != null) {
            if (var26.method2809(arg2 + 10284, arg3, arg1, arg0) && class343.field4623 == var26.field6455) {
                label416: {
                    if (var26.field6458 instanceof class423) {
                        class423 var27 = (class423) var26.field6458;
                        int var28 = var27.method1285(-89);
                        if ((var28 & 0x1) == 0 && (var27.field40 & 0x7F) == 0 && (var27.field44 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field40 & 0x7F) == 64 && (var27.field44 & 0x7F) == 64) {
                            int var29 = var27.field40 - ((var27.method1285(-91) - 1) * 64);
                            int var30 = var27.field44 - (var27.method1285(arg2 - 108) - 1) * 64;
                            for (int var31 = 0; var31 < class53.field674; var31++) {
                                class419 var36 = class428.field5951[class228.field3187[var31]];
                                if (var36 != null && class246.field3467 != var36.field2592 && var36.field2600) {
                                    int var37 = var36.field40 + 64 - (var36.field5807.field3278 * 64);
                                    int var38 = var36.field44 + 64 - (var36.field5807.field3278 * 64);
                                    if (var29 <= var37 && var36.field5807.field3278 <= var27.method1285(-81) - (var37 - var29 >> 7) && var38 >= var30 && var36.field5807.field3278 <= var27.method1285(-82) - (var38 - var30 >> 7)) {
                                        class237.method1551(true, var36);
                                        var36.field2592 = class246.field3467;
                                    }
                                }
                            }
                            for (int var32 = 0; var32 < class11.field86; var32++) {
                                class423 var33 = class87.field1227[class18.field243[var32]];
                                if (var33 != null && class246.field3467 != var33.field2592 && var27 != var33 && var33.field2600) {
                                    int var34 = var33.field40 + 64 - (var33.method1285(arg2 - 120) * 64);
                                    int var35 = var33.field44 - (var33.method1285(arg2 ^ 0x47) * 64 - 64);
                                    if (var34 >= var29 && var33.method1285(-93) <= (var27.method1285(-121) - (var34 - var29 >> 7)) && var35 >= var30 && var33.method1285(-111) <= var27.method1285(-87) - (var35 - var30 >> 7)) {
                                        class157.method1140(11532, var33);
                                        var33.field2592 = class246.field3467;
                                    }
                                }
                            }
                        }
                        if (class246.field3467 == var27.field2592) {
                            break label416;
                        }
                        class157.method1140(arg2 ^ 0xFFFFD2F2, var27);
                        var27.field2592 = class246.field3467;
                    }
                    if (var26.field6458 instanceof class419) {
                        class419 var39 = (class419) var26.field6458;
                        if (var39.field5807 != null) {
                            if ((var39.field5807.field3278 & 0x1) == 0 && (var39.field40 & 0x7F) == 0 && (var39.field44 & 0x7F) == 0 || (var39.field5807.field3278 & 0x1) == 1 && (var39.field40 & 0x7F) == 64 && (var39.field44 & 0x7F) == 64) {
                                int var40 = var39.field40 - (var39.field5807.field3278 - 1) * 64;
                                int var41 = var39.field44 - ((var39.field5807.field3278 - 1) * 64);
                                for (int var42 = 0; var42 < class53.field674; var42++) {
                                    class419 var47 = class428.field5951[class228.field3187[var42]];
                                    if (var47 != null && class246.field3467 != var47.field2592 && var39 != var47 && var47.field2600) {
                                        int var48 = var47.field40 - (var47.field5807.field3278 * 64 - 64);
                                        int var49 = 64 - (var47.field5807.field3278 * 64 - var47.field44);
                                        if (var40 <= var48 && var39.field5807.field3278 - (var48 - var40 >> 7) >= var47.field5807.field3278 && var41 <= var49 && var47.field5807.field3278 <= (var39.field5807.field3278 - (var49 - var41 >> 7))) {
                                            class237.method1551(true, var47);
                                            var47.field2592 = class246.field3467;
                                        }
                                    }
                                }
                                for (int var43 = 0; var43 < class11.field86; var43++) {
                                    class423 var44 = class87.field1227[class18.field243[var43]];
                                    if (var44 != null && class246.field3467 != var44.field2592 && var44.field2600) {
                                        int var45 = var44.field40 - (var44.method1285(-82) - 1) * 64;
                                        int var46 = var44.field44 - (var44.method1285(-72) * 64 - 64);
                                        if (var40 <= var45 && var44.method1285(-82) <= (var39.field5807.field3278 - (var45 - var40 >> 7)) && var41 <= var46 && var44.method1285(-87) <= (var39.field5807.field3278 - (var46 - var41 >> 7))) {
                                            class157.method1140(11532, var44);
                                            var44.field2592 = class246.field3467;
                                        }
                                    }
                                }
                            }
                            if (class246.field3467 == var39.field2592) {
                                break label416;
                            }
                            class237.method1551(true, var39);
                            var39.field2592 = class246.field3467;
                        }
                    }
                    if (var26.field6458 instanceof class241) {
                        class119 var50 = (class119) class417.field5771.method837((byte) -72, (long) (var26.field6454 | var26.field6455 << 28 | var26.field6459 << 14));
                        if (var50 != null) {
                            for (class278 var51 = (class278) var50.field1805.method1163((byte) 33); var51 != null; var51 = (class278) var50.field1805.method1171(arg2 + 2)) {
                                class14 var52 = class367.method2308(false, var51.field3795);
                                if (class213.field2980) {
                                    class200 var57 = class428.field5955 == -1 ? null : class405.method2504(class428.field5955, (byte) -122);
                                    if ((class277.field3780 & 0x1) != 0 && (var57 == null || var52.method73(class428.field5955, (byte) -38, var57.field2876) != var57.field2876)) {
                                        class46.method379(class302.field4121, 9, var26.field6454, true, (long) var51.field3795, var26.field6459, class438.field6183, class119.field1816 + " -> <col=ff9040>" + var52.field191);
                                        class123.field1851++;
                                    }
                                } else {
                                    String[] var53 = var52.field142;
                                    for (int var54 = 4; var54 >= 0; var54--) {
                                        if (var53 != null && var53[var54] != null) {
                                            byte var55 = 0;
                                            int var56 = class274.field3749;
                                            if (var54 == 0) {
                                                var55 = 11;
                                            }
                                            if (var54 == 1) {
                                                var55 = 45;
                                            }
                                            if (var54 == 2) {
                                                var55 = 22;
                                            }
                                            if (var54 == 3) {
                                                var55 = 51;
                                            }
                                            if (var52.field174 == var54) {
                                                var56 = var52.field188;
                                            }
                                            if (var54 == 4) {
                                                var55 = 12;
                                            }
                                            if (var52.field171 == var54) {
                                                var56 = var52.field169;
                                            }
                                            class46.method379(var53[var54], var55, var26.field6454, true, (long) var51.field3795, var26.field6459, var56, "<col=ff9040>" + var52.field191);
                                            class276.field3760++;
                                        }
                                    }
                                    class152.field2187++;
                                    class46.method379(class352.field4743.method2313((byte) -81, class445.field6241), 1008, var26.field6454, true, (long) var51.field3795, var26.field6459, class380.field5245, "<col=ff9040>" + var52.field191);
                                }
                            }
                        }
                    }
                    if (var26.field6458 instanceof class223) {
                        class223 var58 = (class223) var26.field6458;
                        class447 var59 = class133.method996((byte) -19, var58.method711(true));
                        if (var59.field6307 != null) {
                            var59 = var59.method2772(36);
                        }
                        if (var59 != null) {
                            if (class213.field2980) {
                                class200 var60 = class428.field5955 == -1 ? null : class405.method2504(class428.field5955, (byte) -87);
                                if ((class277.field3780 & 0x4) != 0 && (var60 == null || var59.method2763(class428.field5955, var60.field2876, false) != var60.field2876)) {
                                    class41.field535++;
                                    class46.method379(class302.field4121, 59, var26.field6454, true, class174.method1239(var26.field6454, var58, var26.field6459, 55), var26.field6459, class438.field6183, class119.field1816 + " -> <col=00ffff>" + var59.field6295);
                                }
                            } else {
                                String[] var61 = var59.field6305;
                                if (var61 != null) {
                                    for (int var62 = 4; var62 >= 0; var62--) {
                                        if (var61[var62] != null) {
                                            short var63 = 0;
                                            if (var62 == 0) {
                                                var63 = 21;
                                            }
                                            int var64 = class274.field3749;
                                            if (var62 == 1) {
                                                var63 = 60;
                                            }
                                            if (var62 == 2) {
                                                var63 = 58;
                                            }
                                            if (var62 == 3) {
                                                var63 = 3;
                                            }
                                            if (var59.field6261 == var62) {
                                                var64 = var59.field6269;
                                            }
                                            if (var62 == 4) {
                                                var63 = 1001;
                                            }
                                            if (var59.field6299 == var62) {
                                                var64 = var59.field6324;
                                            }
                                            class138.field2034++;
                                            class46.method379(var61[var62], var63, var26.field6454, true, class174.method1239(var26.field6454, var58, var26.field6459, 107), var26.field6459, var64, "<col=00ffff>" + var59.field6295);
                                        }
                                    }
                                }
                                class408.field5678++;
                                class46.method379(class352.field4743.method2313((byte) -115, class445.field6241), 1011, var26.field6454, true, (long) var59.field6323, var26.field6459, class380.field5245, "<col=00ffff>" + var59.field6295);
                            }
                        }
                    }
                }
            }
            var26 = (class450) var25.method2482(50);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IB)[I", line = 443)
    public final int[] method43(int arg0, byte arg1) {
        if (arg1 == -10) {
            field410++;
            return class332.field4478;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V", line = 460)
    public static void method282(int arg0) {
        if (arg0 != -1103503449) {
            method281((class58) null, 94, -48, -32);
        }
        field418 = null;
        field417 = null;
        field411 = null;
        field419 = null;
        field412 = null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 479)
    public class30() {
        super(0, true);
    }
}
