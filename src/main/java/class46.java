import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class46 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lrb;")
    private static class143 field618 = new class143(16);

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field624 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field622 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lek;")
    public static class205 field625 = new class205();

    @OriginalMember(owner = "client!di", name = "k", descriptor = "F")
    public static float field627;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "F")
    public static float field629;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Luc;")
    public static class13 field626;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Lpm;")
    public static class242 field628;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Llc;")
    public static class270 field617;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "[I")
    public static int[] field644;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[[[B")
    public static byte[][][] field632;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "[[[B")
    public static byte[][][] field635;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "[[[B")
    public static byte[][][] field636;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "[[[B")
    public static byte[][][] field637;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "[[[B")
    public static byte[][][] field643;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "[[[I")
    public static int[][][] field631;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "[[[I")
    public static int[][][] field639;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method274(int arg0) {
        field628 = (class242) field618.method1073(-1, (long) arg0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field630 = arg0;
        field638 = arg1;
        field641 = arg2;
        field633 = arg3;
        field634 = arg4;
        field642 = arg5;
        field645 = arg6;
        field640 = arg7;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Llc;)V")
    public static final void method276(class270 arg0) {
        field617 = arg0;
        field618.method1072(0);
        int var1 = field617.method1884("details", (byte) 122);
        int[] var2 = field617.method1866((byte) -69, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field618.method1074((byte) 39, class261.method1789(-32251, new class53(field617.method1868(var2[var3], var1, 1)), var2[var3]), (long) var2[var3]);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lhc;)V")
    public static final void method277(class53 arg0) {
        while (arg0.field735 < arg0.field758.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method366(-16505) == 1) {
                var1 = true;
                var2 = arg0.method366(-16505);
                var3 = arg0.method366(-16505);
            }
            int var4 = arg0.method366(-16505);
            int var5 = arg0.method366(-16505);
            int var6 = var4 * 64 - field623;
            int var7 = field620 - (var5 * 64 - field621) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field619 && var7 < field620) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method335((byte) 26);
                            if (var12 != 0) {
                                if (field635[var8][var9] == null) {
                                    field635[var8][var9] = new byte[4096];
                                }
                                field635[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method335((byte) 26);
                                if (field643[var8][var9] == null) {
                                    field643[var8][var9] = new byte[4096];
                                }
                                field643[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method335((byte) 26);
                    if (var15 != 0) {
                        arg0.field735++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
    public static final void method278(int arg0, int arg1) {
        for (int var2 = 0; var2 < class191.field2830; var2++) {
            class308 var3 = class155.method1138((byte) -88, var2);
            if (var3 != null) {
                int var4 = var3.field4955;
                if (var4 >= 0 && !class244.field3600.method532(var4, 114)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field4965 >= 0) {
                    int var5 = var3.field4965;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class244.field3595[class236.method1625(96, 326386215, var7)];
                } else if (var4 >= 0) {
                    var8 = class244.field3595[class236.method1625(96, 326386215, class244.field3600.method531(var4, -8362))];
                } else if (var3.field4962 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field4962;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class244.field3595[class236.method1625(96, 326386215, var11)];
                }
                field644[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()V")
    public static final void method279() {
        for (int var0 = 0; var0 < field626.field149; var0++) {
            if (field626.field157[var0] != null) {
                field625.method1453(94, field626.field157[var0]);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)V")
    private static final void method280(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field641 - field630;
        int var5 = field633 - field638;
        if (field641 < field619) {
            var4++;
        }
        if (field633 < field620) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var34 = arg0 * var6 + arg2 >> 16;
            int var35 = (var6 + 1) * arg0 + arg2 >> 16;
            int var36 = var35 - var34;
            if (var36 > 0) {
                int var37 = field630 + var6 >> 6;
                if (var37 >= 0 && var37 <= field631.length - 1) {
                    int[][] var38 = field631[var37];
                    byte[][] var39 = field637[var37];
                    byte[][] var40 = field636[var37];
                    byte[][] var41 = field635[var37];
                    byte[][] var42 = field643[var37];
                    byte[][] var43 = field632[var37];
                    int var44 = field634 + var34;
                    int var45 = field634 + var35;
                    for (int var46 = 0; var46 < var5; var46++) {
                        int var47 = arg1 * var46 + arg3 >> 16;
                        int var48 = (var46 + 1) * arg1 + arg3 >> 16;
                        int var49 = var48 - var47;
                        if (var49 > 0) {
                            int var50 = field642 + var47;
                            int var51 = field642 + var48;
                            int var52 = field638 + var46 >> 6;
                            int var53 = field638 + var46 & 0x3F;
                            int var54 = field630 + var6 & 0x3F;
                            int var55 = (var53 << 6) + var54;
                            int var56;
                            if (var52 < 0 || var52 > var38.length - 1 || var38[var52] == null) {
                                if (field628.field3547 != -1) {
                                    var56 = field628.field3547;
                                } else if ((field638 + var46 & 0x4) == (field630 + var6 & 0x4)) {
                                    var56 = field644[class160.field2484 + 1];
                                } else {
                                    var56 = 4936552;
                                }
                                if (var52 < 0 || var52 > var38.length - 1) {
                                    if (var56 == 0) {
                                        var56 = 1;
                                    }
                                    class130.method996(var44, var50, var36, var49, var56);
                                    continue;
                                }
                            } else {
                                var56 = var38[var52][var55];
                            }
                            if (var56 == 0) {
                                var56 = 1;
                            }
                            int var57 = var39[var52] == null ? 0 : field644[var39[var52][var55] & 0xFF];
                            int var58 = var41[var52] == null ? 0 : field644[var41[var52][var55] & 0xFF];
                            if (var57 == 0 && var58 == 0) {
                                class130.method996(var44, var50, var36, var49, var56);
                            } else {
                                if (var57 != 0) {
                                    if (var57 == -1) {
                                        var57 = 1;
                                    }
                                    byte var59 = var40[var52] == null ? 0 : var40[var52][var55];
                                    int var60 = var59 & 0xFC;
                                    if (var60 == 0 || var36 <= 1 || var49 <= 1) {
                                        class130.method996(var44, var50, var36, var49, var57);
                                    } else {
                                        method291(class130.field2164, var44, var50, var56, var57, var36, var49, var60 >> 2, var59 & 0x3, true);
                                    }
                                }
                                if (var58 != 0) {
                                    if (var58 == -1) {
                                        var58 = var56;
                                    }
                                    byte var61 = var42[var52][var55];
                                    int var62 = var61 & 0xFC;
                                    if (var62 == 0 || var36 <= 1 || var49 <= 1) {
                                        class130.method996(var44, var50, var36, var49, var58);
                                    }
                                    method291(class130.field2164, var44, var50, 0, var58, var36, var49, var62 >> 2, var61 & 0x3, var57 == 0);
                                }
                            }
                            if (var43[var52] != null) {
                                int var63 = var43[var52][var55] & 0xFF;
                                if (var63 != 0) {
                                    int var64;
                                    if (var36 == 1) {
                                        var64 = var44;
                                    } else {
                                        var64 = var45 - 1;
                                    }
                                    int var65;
                                    if (var49 == 1) {
                                        var65 = var50;
                                    } else {
                                        var65 = var51 - 1;
                                    }
                                    int var66 = 13421772;
                                    if (var63 >= 5 && var63 <= 8 || var63 >= 13 && var63 <= 16 || var63 >= 21 && var63 <= 24 || var63 == 27 || var63 == 28) {
                                        var66 = 13369344;
                                        var63 -= 4;
                                    }
                                    if (var63 == 1) {
                                        class130.method998(var44, var50, var49, var66);
                                    } else if (var63 == 2) {
                                        class130.method1001(var44, var50, var36, var66);
                                    } else if (var63 == 3) {
                                        class130.method998(var64, var50, var49, var66);
                                    } else if (var63 == 4) {
                                        class130.method1001(var44, var65, var36, var66);
                                    } else if (var63 == 9) {
                                        class130.method998(var44, var50, var49, 16777215);
                                        class130.method1001(var44, var50, var36, var66);
                                    } else if (var63 == 10) {
                                        class130.method998(var64, var50, var49, 16777215);
                                        class130.method1001(var44, var50, var36, var66);
                                    } else if (var63 == 11) {
                                        class130.method998(var64, var50, var49, 16777215);
                                        class130.method1001(var44, var65, var36, var66);
                                    } else if (var63 == 12) {
                                        class130.method998(var44, var50, var49, 16777215);
                                        class130.method1001(var44, var65, var36, var66);
                                    } else if (var63 == 17) {
                                        class130.method1001(var44, var50, 1, var66);
                                    } else if (var63 == 18) {
                                        class130.method1001(var64, var50, 1, var66);
                                    } else if (var63 == 19) {
                                        class130.method1001(var64, var65, 1, var66);
                                    } else if (var63 == 20) {
                                        class130.method1001(var44, var65, 1, var66);
                                    } else if (var63 == 25) {
                                        for (int var67 = 0; var67 < var49; var67++) {
                                            class130.method1001(var44 + var67, var65 - var67, 1, var66);
                                        }
                                    } else if (var63 == 26) {
                                        for (int var68 = 0; var68 < var49; var68++) {
                                            class130.method1001(var44 + var68, var50 + var68, 1, var66);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var69 = field634 + var34;
                    var10000 = field634 + var35;
                    for (int var71 = 0; var71 < var5; var71++) {
                        int var72 = (arg1 * var71 + arg3 >> 16) + field642;
                        int var73 = ((var71 + 1) * arg1 + arg3 >> 16) + field642;
                        int var74 = var73 - var72;
                        int var75;
                        if (field628.field3547 != -1) {
                            var75 = field628.field3547;
                        } else if ((field638 + var71 & 0x4) == (field630 + var6 & 0x4)) {
                            var75 = field644[class160.field2484 + 1];
                        } else {
                            var75 = 4936552;
                        }
                        if (var75 == 0) {
                            var75 = 1;
                        }
                        class130.method996(var69, var72, var36, var74, var75);
                    }
                }
            }
        }
        for (int var7 = -2; var7 < var4 + 2; var7++) {
            int var8 = arg0 * var7 + arg2 >> 16;
            int var9 = (var7 + 1) * arg0 + arg2 >> 16;
            int var10 = var9 - var8;
            if (var10 > 0) {
                int var11 = field634 + var8;
                var10000 = field634 + var9;
                int var13 = field630 + var7 >> 6;
                if (var13 >= 0 && var13 <= field639.length - 1) {
                    int[][] var14 = field639[var13];
                    for (int var15 = -2; var15 < var5 + 2; var15++) {
                        int var16 = arg1 * var15 + arg3 >> 16;
                        int var17 = (var15 + 1) * arg1 + arg3 >> 16;
                        int var18 = var17 - var16;
                        if (var18 > 0) {
                            int var19 = field642 + var16;
                            var10000 = field642 + var17;
                            int var21 = field638 + var15 >> 6;
                            if (var21 >= 0 && var21 <= var14.length - 1) {
                                int var22 = ((field638 + var15 & 0x3F) << 6) + (field630 + var7 & 0x3F);
                                if (var14[var21] != null) {
                                    int var23 = var14[var21][var22];
                                    int var24 = var23 & 0x1FFF;
                                    if (var24 != 0) {
                                        class163 var25 = class149.method1111(var24 - 1, 14924);
                                        int var26 = var23 >> 13 & 0x3;
                                        boolean var27 = (var23 >> 15 & 0x1) == 1;
                                        class176 var28 = var25.method1179(false, var27, var26);
                                        if (var28 != null) {
                                            int var29 = var28.field2258 * var10 / 4;
                                            int var30 = var28.field2255 * var18 / 4;
                                            if (var25.field2529) {
                                                int var31 = var23 >> 16 & 0xF;
                                                int var32 = var23 >> 20 & 0xF;
                                                if ((var26 & 0x1) == 1) {
                                                    int var33 = var31;
                                                    var31 = var32;
                                                    var32 = var33;
                                                }
                                                var29 = var10 * var31;
                                                var30 = var18 * var32;
                                            }
                                            if (var29 != 0 && var30 != 0) {
                                                if (var25.field2525 == 0) {
                                                    var28.method1263(var11, var19 + var18 - var30, var29, var30);
                                                } else {
                                                    var28.method1253(var11, var19 + var18 - var30, var29, var30, var25.field2525);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()Lie;")
    public static final class2 method281() {
        int var0 = field641 - field630;
        int var1 = field633 - field638;
        int var2 = (field645 - field634 << 16) / var0;
        int var3 = (field640 - field642 << 16) / var1;
        return method288(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "()V")
    public static void method282() {
        field617 = null;
        field618 = null;
        field628 = null;
        field626 = null;
        field625 = null;
        field631 = null;
        field637 = null;
        field636 = null;
        field635 = null;
        field643 = null;
        field632 = null;
        field639 = null;
        field644 = null;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "()V")
    public static final void method283() {
        int var0 = field641 - field630;
        int var1 = field633 - field638;
        int var2 = (field645 - field634 << 16) / var0;
        int var3 = (field640 - field642 << 16) / var1;
        method280(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lhc;Z)V")
    public static final void method284(class53 arg0, boolean arg1) {
        while (arg0.field735 < arg0.field758.length) {
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            if (arg0.method366(-16505) == 1) {
                var2 = true;
                var3 = arg0.method366(-16505);
                var4 = arg0.method366(-16505);
            }
            int var5 = arg0.method366(-16505);
            int var6 = arg0.method366(-16505);
            int var7 = var5 * 64 - field623;
            int var8 = field620 - (var6 * 64 - field621) - 1;
            if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field619 && var8 < field620) {
                int var9 = var7 >> 6;
                int var10 = var8 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                            int var13 = arg0.method366(-16505);
                            if (var13 != 0) {
                                if ((var13 & 0x1) == 1) {
                                    int var14 = arg0.method366(-16505);
                                    if (field632[var9][var10] == null) {
                                        field632[var9][var10] = new byte[4096];
                                    }
                                    field632[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                }
                                if ((var13 & 0x2) == 2) {
                                    int var15 = arg0.method362(-4);
                                    if (field639[var9][var10] == null) {
                                        field639[var9][var10] = new int[4096];
                                    }
                                    field639[var9][var10][(63 - var12 << 6) + var11] = var15;
                                }
                                if ((var13 & 0x4) == 4) {
                                    int var16 = arg0.method331(-77);
                                    int var17 = arg0.method366(-16505);
                                    int var22 = var16 - 1;
                                    class93 var18 = class48.method297(false, var22);
                                    if (var18.field1528 != null) {
                                        var18 = var18.method710(0);
                                        if (var18 == null || var18.field1571 == -1) {
                                            continue;
                                        }
                                    }
                                    if ((!var18.field1556 || arg1) && var18.field1571 != -1) {
                                        class159 var19 = new class159();
                                        var19.field2466 = var18.field1571;
                                        var19.field2473 = var17;
                                        var19.field2476 = var9 * 64 + var11;
                                        var19.field2469 = var10 * 64 + (64 - var12);
                                        field625.method1453(61, var19);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < (var2 ? 64 : 4096); var20++) {
                    int var21 = arg0.method366(-16505);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field735++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field735 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field735 += 3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Lhc;)V")
    public static final void method285(class53 arg0) {
        while (arg0.field735 < arg0.field758.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method366(-16505) == 1) {
                var1 = true;
                var2 = arg0.method366(-16505);
                var3 = arg0.method366(-16505);
            }
            int var4 = arg0.method366(-16505);
            int var5 = arg0.method366(-16505);
            int var6 = var4 * 64 - field623;
            int var7 = field620 - (var5 * 64 - field621) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field619 && var7 < field620) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method335((byte) 26);
                            if (var12 != 0) {
                                if (field637[var8][var9] == null) {
                                    field637[var8][var9] = new byte[4096];
                                }
                                field637[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method335((byte) 26);
                                if (field636[var8][var9] == null) {
                                    field636[var8][var9] = new byte[4096];
                                }
                                field636[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method335((byte) 26);
                    if (var15 != 0) {
                        arg0.field735++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)Lek;")
    public static final class205 method286(int arg0, int arg1) {
        class205 var2 = new class205();
        for (class242 var3 = (class242) field618.method1071(-126); var3 != null; var3 = (class242) field618.method1069(-123)) {
            if (var3.field3546 && var3.method1662(arg1, -21089, arg0)) {
                var2.method1453(-104, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lhf;IIII)V")
    private static final void method287(class159 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field2468 = ((arg0.field2476 - field630) * arg1 + arg3 >> 16) + field634;
        arg0.field2474 = ((arg0.field2469 - field638) * arg2 + arg4 >> 16) + field642;
        class66 var5 = class206.method1458(arg0.field2466, 22464);
        if (var5.field993 != -1) {
            class138 var6 = var5.method499(false, true, false);
            if (var6 != null) {
                if (arg0.field2468 - (var6.field2258 + 1 >> 1) <= field645 && (var6.field2258 + 1 >> 1) + arg0.field2468 >= field634 && arg0.field2474 - (var6.field2255 + 1 >> 1) <= field640 && (var6.field2255 + 1 >> 1) + arg0.field2474 >= field642) {
                    arg0.field2465 = false;
                    return;
                }
                arg0.field2465 = true;
                return;
            }
        }
        if (arg0.field2476 >= field630 && arg0.field2476 <= field641 && arg0.field2469 >= field638 && arg0.field2469 <= field633) {
            arg0.field2465 = false;
        } else {
            arg0.field2465 = true;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(IIII)Lie;")
    private static final class2 method288(int arg0, int arg1, int arg2, int arg3) {
        class2 var4 = new class2();
        for (class159 var5 = (class159) field625.method1450(false); var5 != null; var5 = (class159) field625.method1448(false)) {
            method287(var5, arg0, arg1, arg2, arg3);
            var4.method13(32, var5);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field626.field149; var7++) {
            class159 var8 = field626.field157[var7];
            boolean var9 = field628.method1656((byte) -108, field626.field156[var7] & 0x3FFF, field626.field156[var7] >> 28 & 0x3, field626.field156[var7] >> 14 & 0x3FFF, var6);
            if (var9) {
                var8.field2476 = var6[1] - field623;
                var8.field2469 = field620 - (var6[2] - field621) - 1;
                method287(var8, arg0, arg1, arg2, arg3);
                var4.method13(32, var8);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Lpm;")
    public static final class242 method289(int arg0) {
        return (class242) field618.method1073(-1, (long) arg0);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)Lpm;")
    public static final class242 method290(int arg0, int arg1) {
        for (class242 var2 = (class242) field618.method1071(-128); var2 != null; var2 = (class242) field618.method1069(-123)) {
            if (var2.field3546 && var2.method1662(arg1, -21089, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([IIIIIIIIIZ)V")
    private static final void method291(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class130.field2166) {
            return;
        }
        if (arg1 < class130.field2163) {
            var10 = class130.field2163;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class130.field2163) {
            return;
        }
        if (var11 > class130.field2166) {
            var11 = class130.field2166;
        }
        int var12 = arg2;
        if (arg2 >= class130.field2161) {
            return;
        }
        if (arg2 < class130.field2160) {
            var12 = class130.field2160;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class130.field2160) {
            return;
        }
        if (var13 > class130.field2161) {
            var13 = class130.field2161;
        }
        int var14 = class130.field2159 * var12 + var10;
        int var15 = class130.field2159 + var10 - var11;
        int var16 = var10 - arg1;
        int var17 = var11 - arg1;
        int var18 = var12 - arg2;
        int var19 = var13 - arg2;
        int var20 = arg5 - var17;
        int var21 = arg5 - var16;
        int var22 = arg6 - var19;
        int var23 = arg6 - var18;
        if (arg7 == 9) {
            arg7 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 1) {
            if (arg8 == 0) {
                for (int var24 = var18; var24 < var19; var24++) {
                    for (int var25 = var16; var25 < var17; var25++) {
                        if (var25 <= var24) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var26 = var23 - 1; var26 >= var22; var26--) {
                    for (int var27 = var16; var27 < var17; var27++) {
                        if (var27 <= var26) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var28 = var18; var28 < var19; var28++) {
                    for (int var29 = var16; var29 < var17; var29++) {
                        if (var29 >= var28) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var30 = var23 - 1; var30 >= var22; var30--) {
                    for (int var31 = var16; var31 < var17; var31++) {
                        if (var31 >= var30) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 2) {
            if (arg8 == 0) {
                for (int var32 = var23 - 1; var32 >= var22; var32--) {
                    for (int var33 = var16; var33 < var17; var33++) {
                        if (var33 <= var32 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var34 = var18; var34 < var19; var34++) {
                    for (int var35 = var16; var35 < var17; var35++) {
                        if (var14 >= 0 && var14 < arg0.length) {
                            if (var35 >= var34 << 1) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        } else {
                            var14++;
                        }
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var36 = var18; var36 < var19; var36++) {
                    for (int var37 = var21 - 1; var37 >= var20; var37--) {
                        if (var37 <= var36 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var38 = var23 - 1; var38 >= var22; var38--) {
                    for (int var39 = var21 - 1; var39 >= var20; var39--) {
                        if (var39 >= var38 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 3) {
            if (arg8 == 0) {
                for (int var40 = var23 - 1; var40 >= var22; var40--) {
                    for (int var41 = var21 - 1; var41 >= var20; var41--) {
                        if (var41 <= var40 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var42 = var23 - 1; var42 >= var22; var42--) {
                    for (int var43 = var16; var43 < var17; var43++) {
                        if (var43 >= var42 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var44 = var18; var44 < var19; var44++) {
                    for (int var45 = var16; var45 < var17; var45++) {
                        if (var45 <= var44 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var46 = var18; var46 < var19; var46++) {
                    for (int var47 = var21 - 1; var47 >= var20; var47--) {
                        if (var47 >= var46 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 4) {
            if (arg8 == 0) {
                for (int var48 = var23 - 1; var48 >= var22; var48--) {
                    for (int var49 = var16; var49 < var17; var49++) {
                        if (var49 >= var48 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var50 = var18; var50 < var19; var50++) {
                    for (int var51 = var16; var51 < var17; var51++) {
                        if (var51 <= var50 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var52 = var18; var52 < var19; var52++) {
                    for (int var53 = var21 - 1; var53 >= var20; var53--) {
                        if (var53 >= var52 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var54 = var23 - 1; var54 >= var22; var54--) {
                    for (int var55 = var21 - 1; var55 >= var20; var55--) {
                        if (var55 <= var54 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg8 == 0) {
                    for (int var64 = var18; var64 < var19; var64++) {
                        for (int var65 = var16; var65 < var17; var65++) {
                            if (var65 <= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var66 = var18; var66 < var19; var66++) {
                        for (int var67 = var16; var67 < var17; var67++) {
                            if (var66 <= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var68 = var18; var68 < var19; var68++) {
                        for (int var69 = var16; var69 < var17; var69++) {
                            if (var69 >= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var70 = var18; var70 < var19; var70++) {
                        for (int var71 = var16; var71 < var17; var71++) {
                            if (var70 >= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg8 == 0) {
                    for (int var72 = var18; var72 < var19; var72++) {
                        for (int var73 = var16; var73 < var17; var73++) {
                            if (var73 <= var72 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var74 = var23 - 1; var74 >= var22; var74--) {
                        for (int var75 = var16; var75 < var17; var75++) {
                            if (var75 <= var74 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var76 = var23 - 1; var76 >= var22; var76--) {
                        for (int var77 = var21 - 1; var77 >= var20; var77--) {
                            if (var77 <= var76 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var78 = var18; var78 < var19; var78++) {
                        for (int var79 = var21 - 1; var79 >= var20; var79--) {
                            if (var79 <= var78 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg8 == 0) {
                    for (int var80 = var18; var80 < var19; var80++) {
                        for (int var81 = var16; var81 < var17; var81++) {
                            if (var81 >= var80 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var82 = var23 - 1; var82 >= var22; var82--) {
                        for (int var83 = var16; var83 < var17; var83++) {
                            if (var83 >= var82 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var84 = var23 - 1; var84 >= var22; var84--) {
                        for (int var85 = var21 - 1; var85 >= var20; var85--) {
                            if (var85 >= var84 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var86 = var18; var86 < var19; var86++) {
                        for (int var87 = var21 - 1; var87 >= var20; var87--) {
                            if (var87 >= var86 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var56 = var23 - 1; var56 >= var22; var56--) {
                for (int var57 = var21 - 1; var57 >= var20; var57--) {
                    if (var57 >= var56 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 1) {
            for (int var58 = var23 - 1; var58 >= var22; var58--) {
                for (int var59 = var16; var59 < var17; var59++) {
                    if (var59 <= var58 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 2) {
            for (int var60 = var18; var60 < var19; var60++) {
                for (int var61 = var16; var61 < var17; var61++) {
                    if (var61 >= var60 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 3) {
            for (int var62 = var18; var62 < var19; var62++) {
                for (int var63 = var21 - 1; var63 >= var20; var63--) {
                    if (var63 <= var62 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        }
    }
}
