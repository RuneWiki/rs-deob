import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class class19 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field323 = -1;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lma;")
    private static class5 field324 = class12.method119("You can(Wt add yourself to your own ignore list)3", (byte) 104);

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lma;")
    public static class5 field329 = class12.method119(")1j", (byte) 125);

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lma;")
    public static class5 field327 = class12.method119("Versteckt", (byte) 124);

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
    public static int[] field330 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Lma;")
    public static class5 field325 = field324;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V", line = 5)
    public static final void method155() {
        class174.field2666 = 0;
        label194: for (int var0 = 0; var0 < class272.field4658; var0++) {
            class152 var1 = class106.field1569[var0];
            if (class218.field3517 != null) {
                for (int var2 = 0; var2 < class218.field3517.length; var2++) {
                    if (class218.field3517[var2] != -1000000 && (var1.field2220 <= class218.field3517[var2] || var1.field2215 <= class218.field3517[var2]) && (var1.field2223 <= class33.field511[var2] || var1.field2218 <= class33.field511[var2]) && (var1.field2223 >= class257.field4405[var2] || var1.field2218 >= class257.field4405[var2]) && (var1.field2229 <= class62.field976[var2] || var1.field2230 <= class62.field976[var2]) && (var1.field2229 >= class282.field4781[var2] || var1.field2230 >= class282.field4781[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field2221 == 1) {
                int var3 = var1.field2228 + class147.field2137 - class195.field3038;
                if (var3 >= 0 && var3 <= class147.field2137 + class147.field2137) {
                    int var4 = var1.field2224 + class147.field2137 - class103.field1537;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2236 + class147.field2137 - class103.field1537;
                    if (var5 > class147.field2137 + class147.field2137) {
                        var5 = class147.field2137 + class147.field2137;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class251.field4166[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class211.field3365 - var1.field2223;
                        if (var7 > 32) {
                            var1.field2205 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2205 = 2;
                            var7 = -var7;
                        }
                        var1.field2208 = (var1.field2229 - class57.field898 << 8) / var7;
                        var1.field2211 = (var1.field2230 - class57.field898 << 8) / var7;
                        var1.field2232 = (var1.field2220 - class67.field1038 << 8) / var7;
                        var1.field2203 = (var1.field2215 - class67.field1038 << 8) / var7;
                        class47.field721[class174.field2666++] = var1;
                    }
                }
            } else if (var1.field2221 == 2) {
                int var8 = var1.field2224 + class147.field2137 - class103.field1537;
                if (var8 >= 0 && var8 <= class147.field2137 + class147.field2137) {
                    int var9 = var1.field2228 + class147.field2137 - class195.field3038;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2234 + class147.field2137 - class195.field3038;
                    if (var10 > class147.field2137 + class147.field2137) {
                        var10 = class147.field2137 + class147.field2137;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class251.field4166[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class57.field898 - var1.field2229;
                        if (var12 > 32) {
                            var1.field2205 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2205 = 4;
                            var12 = -var12;
                        }
                        var1.field2206 = (var1.field2223 - class211.field3365 << 8) / var12;
                        var1.field2219 = (var1.field2218 - class211.field3365 << 8) / var12;
                        var1.field2232 = (var1.field2220 - class67.field1038 << 8) / var12;
                        var1.field2203 = (var1.field2215 - class67.field1038 << 8) / var12;
                        class47.field721[class174.field2666++] = var1;
                    }
                }
            } else if (var1.field2221 == 4) {
                int var13 = var1.field2220 - class67.field1038;
                if (var13 > 128) {
                    int var14 = var1.field2224 + class147.field2137 - class103.field1537;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2236 + class147.field2137 - class103.field1537;
                    if (var15 > class147.field2137 + class147.field2137) {
                        var15 = class147.field2137 + class147.field2137;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2228 + class147.field2137 - class195.field3038;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2234 + class147.field2137 - class195.field3038;
                        if (var17 > class147.field2137 + class147.field2137) {
                            var17 = class147.field2137 + class147.field2137;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class251.field4166[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2205 = 5;
                            var1.field2206 = (var1.field2223 - class211.field3365 << 8) / var13;
                            var1.field2219 = (var1.field2218 - class211.field3365 << 8) / var13;
                            var1.field2208 = (var1.field2229 - class57.field898 << 8) / var13;
                            var1.field2211 = (var1.field2230 - class57.field898 << 8) / var13;
                            class47.field721[class174.field2666++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLii;)Lji;", line = 228)
    public static final class246 method156(byte arg0, class221 arg1) {
        field326++;
        if (arg0 != -106) {
            field330 = (int[]) null;
        }
        return new class246(arg1.method1505(arg0 + 200), arg1.method1505(113), arg1.method1505(-1), arg1.method1505(-6), arg1.method1497(3610), arg1.method1497(arg0 ^ 0xFFFFF18C), arg1.method1509(true));
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBIIIIII)V", line = 244)
    public static final void method158(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field328++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = arg4 - arg7;
        int var11 = 0;
        int var12 = arg6 - arg7;
        int var13 = arg6 * arg6;
        int var14 = arg4 * arg4;
        int var15 = var10 * var10;
        int var16 = var13 << 1;
        int var17 = var12 * var12;
        int var18 = var17 << 1;
        int var19 = var15 << 1;
        int var20 = arg6 << 1;
        int var21 = var14 << 1;
        int var22 = var12 << 1;
        int var23 = var13 - (var20 - 1) * var21;
        int var24 = (1 - var20) * var14 + var16;
        int var25 = (1 - var22) * var15 + var18;
        int var26 = var13 << 2;
        int var27 = var15 << 2;
        int var28 = var17 - ((var22 - 1) * var19);
        int var29 = 24 % ((arg1 + 87) / 33);
        int var30 = var14 << 2;
        int var31 = var17 << 2;
        int var32 = (var20 - 3) * var21;
        int var33 = var18 * 3;
        int var34 = (var22 - 3) * var19;
        int var35 = var26;
        int var36 = var16 * 3;
        int var37 = var31;
        int var38 = (var12 - 1) * var27;
        int var39 = (arg6 - 1) * var30;
        int[] var40 = class137.field2032[arg5];
        class239.method1690(arg3 - arg4, 23267, arg3 - var10, var40, arg2);
        class239.method1690(arg3 - var10, 23267, arg3 + var10, var40, arg0);
        class239.method1690(arg3 + var10, 23267, arg3 + arg4, var40, arg2);
        while (var9 > 0) {
            boolean var41 = var9 <= var12;
            if (var41) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var11++;
                        var28 += var37;
                        var25 += var33;
                        var33 += var31;
                        var37 += var31;
                    }
                }
                if (var28 < 0) {
                    var28 += var37;
                    var11++;
                    var37 += var31;
                    var25 += var33;
                    var33 += var31;
                }
                var28 += -var34;
                var25 += -var38;
                var38 -= var27;
                var34 -= var27;
            }
            var9--;
            int var42 = arg5 - var9;
            if (var24 < 0) {
                while (var24 < 0) {
                    var8++;
                    var23 += var35;
                    var24 += var36;
                    var35 += var26;
                    var36 += var26;
                }
            }
            if (var23 < 0) {
                var8++;
                var23 += var35;
                var24 += var36;
                var36 += var26;
                var35 += var26;
            }
            var24 += -var39;
            var39 -= var30;
            int var43 = arg5 + var9;
            int var44 = arg3 + var8;
            var23 += -var32;
            int var45 = arg3 - var8;
            var32 -= var30;
            if (var41) {
                int var46 = arg3 + var11;
                int var47 = arg3 - var11;
                class239.method1690(var45, 23267, var47, class137.field2032[var42], arg2);
                class239.method1690(var47, 23267, var46, class137.field2032[var42], arg0);
                class239.method1690(var46, 23267, var44, class137.field2032[var42], arg2);
                class239.method1690(var45, 23267, var47, class137.field2032[var43], arg2);
                class239.method1690(var47, 23267, var46, class137.field2032[var43], arg0);
                class239.method1690(var46, 23267, var44, class137.field2032[var43], arg2);
            } else {
                class239.method1690(var45, 23267, var44, class137.field2032[var42], arg2);
                class239.method1690(var45, 23267, var44, class137.field2032[var43], arg2);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 412)
    public static void method159(int arg0) {
        field327 = null;
        field324 = null;
        field325 = null;
        field330 = null;
        field329 = null;
        if (arg0 != 166) {
            field323 = -63;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 429)
    public static final void method160(int arg0) {
        field322++;
        if (!class251.field4162) {
            class104.field1554[0] = 1003;
            if (class179.field2721 != 0) {
                class51.field808 = class151.field2198;
                class176.field2683 = class200.field3179;
            } else if (class139.field2059 == 0) {
                class51.field808 = class18.field308;
                class176.field2683 = class271.field4636;
            } else {
                class176.field2683 = class104.field1545;
                class51.field808 = class289.field4915;
            }
            class118.field1786[0] = class262.field4472;
            class20.field344[0] = class250.field4145;
            class282.field4794 = 1;
        }
        if (class255.field4354 != -1) {
            class288.method1939(class255.field4354, arg0 ^ 0x6726);
        }
        for (int var1 = 0; var1 < class188.field2947; var1++) {
            if (class296.field4975[var1]) {
                class52.field822[var1] = true;
            }
            class48.field736[var1] = class296.field4975[var1];
            class296.field4975[var1] = false;
        }
        class235.field3888 = null;
        class16.field300 = -1;
        class294.field4960 = -1;
        class14.field259 = class50.field784;
        class40.field605 = true;
        if (class255.field4354 != -1) {
            class188.field2947 = 0;
            class40.method283(0, 0, class156.field2314, 0, class255.field4354, class255.field4362, 0, -1, arg0 ^ 0xC4);
        }
        if (arg0 != 253) {
            return;
        }
        class124.method819();
        class200.method1315((byte) 117);
        if (class251.field4162) {
            class155.method997(true);
        } else if (class294.field4960 != -1) {
            class156.method999(class294.field4960, 1372, class16.field300);
        }
        if (class161.field2462 == 3) {
            for (int var2 = 0; var2 < class188.field2947; var2++) {
                if (class48.field736[var2]) {
                    class124.method830(class218.field3510[var2], class14.field257[var2], class177.field2701[var2], class102.field1523[var2], 16711935, 128);
                } else if (class52.field822[var2]) {
                    class124.method830(class218.field3510[var2], class14.field257[var2], class177.field2701[var2], class102.field1523[var2], 16711680, 128);
                }
            }
        }
        class66.method469(0, class151.field2183.field178, class151.field2183.field211, class282.field4788, class276.field4701);
        class282.field4788 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(La;I)La;")
    public abstract class249 method157(class249 arg0, int arg1);
}
