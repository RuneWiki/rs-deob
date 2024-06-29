import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class42 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lbr;")
    private static class223 field619 = new class223(16);

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field623 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field625 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[B")
    private static byte[] field624 = new byte[1];

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[S")
    private static short[] field626 = new short[1];

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ltc;")
    public static class196 field622 = new class196();

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "F")
    public static float field628;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "F")
    public static float field629;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Ljd;")
    public static class125 field618;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Lbr;")
    private static class223 field642;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Laf;")
    public static class249 field630;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lqj;")
    public static class296 field620;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[B")
    private static byte[] field633;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "[B")
    private static byte[] field635;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[B")
    private static byte[] field636;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "[B")
    private static byte[] field644;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "[B")
    private static byte[] field651;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "[I")
    private static int[] field640;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[S")
    private static short[] field639;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[S")
    private static short[] field643;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[[[B")
    public static byte[][][] field627;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "[[[Lre;")
    private static class357[][][] field637;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Laa;IIIIIII[S[BZ)V")
    private static final void method287(class281 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1785(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field640[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1785(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class250.method1553(field640[arg6], arg1, false, arg3, var12, arg0, field621, arg5, arg7 >> 6 & 0x3, var11, arg2, field627, arg4);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class369 var18 = class310.method1961(arg8[var16] & 0xFFFF, (byte) 35);
                if (var18.field5206 == -1) {
                    int var19 = -3355444;
                    if (var18.field5221 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method1810(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1771(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1810(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method1771(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method1810(arg1, arg2, arg4, -1, 0);
                            arg0.method1771(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1810(var14, arg2, arg4, -1, 0);
                            arg0.method1771(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1810(var14, arg2, arg4, -1, 0);
                            arg0.method1771(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method1810(arg1, arg2, arg4, -1, 0);
                            arg0.method1771(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method1771(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1771(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1771(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method1771(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method1771(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method1771(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field649 = arg0 - field641;
        field631 = arg1 - field650;
        field638 = arg2 - field641;
        field647 = arg3 - field650;
        field645 = arg4;
        field634 = arg5;
        field632 = arg6;
        field652 = arg7;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Laa;IIII[S[B)V")
    private static final void method289(class281 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class369 var8 = class310.method1961(arg5[var7] & 0xFFFF, (byte) 35);
            int var9 = var8.field5206;
            if (var9 != -1) {
                class139 var10 = class387.method2531(var9, (byte) -10);
                class130 var11 = var10.method955(0, arg0, var8.field5214 ? arg6[var7] >> 6 & 0x3 : 0, var8.field5184 ? var8.field5193 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method874() >> 2;
                    int var13 = arg4 * var11.method877() >> 2;
                    if (var10.field1980) {
                        int var14 = var8.field5215;
                        int var15 = var8.field5200;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field1977 == 0) {
                            var11.method872(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method807(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field1977 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Lad;")
    public static final class244 method290(int arg0, int arg1) {
        class244 var2 = new class244();
        for (class125 var3 = (class125) field619.method1413(30381); var3 != null; var3 = (class125) field619.method1420((byte) 110)) {
            if (var3.field1757 && var3.method836(3, arg1, arg0)) {
                var2.method1530(var3, true);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Ljd;")
    public static final class125 method291(int arg0) {
        return (class125) field619.method1412((byte) -54, (long) arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lsr;III)I")
    private static final int method292(class136 arg0, int arg1, int arg2, int arg3) {
        class6 var4 = class364.method2340(true, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field103;
        if (var5 >= 0 && arg0.method607(false, var5).field2317) {
            var5 = -1;
        }
        int var9;
        if (var4.field90 >= 0) {
            int var6 = var4.field90;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class293.field4057[class77.method549(class346.method2220(96, -97, var8), 127) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class293.field4057[class77.method549(class346.method2220(96, -8, arg0.method607(false, var5).field2303), 127) & 0xFFFF] | 0xFF000000;
        } else if (var4.field107 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field107;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class293.field4057[class77.method549(class346.method2220(96, 85, var12), 127) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
    public static void method293() {
        field618 = null;
        field620 = null;
        field619 = null;
        field627 = null;
        field626 = null;
        field624 = null;
        field630 = null;
        field622 = null;
        field640 = null;
        field633 = null;
        field644 = null;
        field639 = null;
        field636 = null;
        field651 = null;
        field643 = null;
        field635 = null;
        field642 = null;
        field637 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Laa;IIII)V")
    private static final void method294(class281 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field638 - field649;
        int var6 = field631 - field647;
        if (field638 < field648) {
            var5++;
        }
        if (field631 < field646) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field645;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field645;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field649 + var7;
                if (var52 >= 0 && var52 < field648) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field652 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field652 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field647 + var53;
                            int var58 = field648 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field646) {
                                var59 = (field644[var58] & 0xFF) << 16 | field639[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field636[var58] & 0xFF;
                                var61 = field643[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field618.field1747 != -1) {
                                    var62 = field618.field1747 | 0xFF000000;
                                } else if ((field649 + var7 & 0x4) == (field631 + var53 & 0x4)) {
                                    var62 = field640[class229.field3066 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1785(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method287(arg0, var49, var54, var51, var56, var59, var60, field651[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class302 var63 = (class302) field642.method1412((byte) -54, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method287(arg0, var49, var54, var51, var56, var59, var60, field651[var58], var63.field4176, var63.field4175, true);
                                }
                            } else {
                                field626[0] = (short) (var61 - 1);
                                field624[0] = field635[var58];
                                method287(arg0, var49, var54, var51, var56, var59, var60, field651[var58], field626, field624, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field652 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field652 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field618.field1747 != -1) {
                            var68 = field618.field1747 | 0xFF000000;
                        } else if ((field649 + var7 & 0x4) == (field631 + var64 & 0x4)) {
                            var68 = field640[class229.field3066 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1785(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field645;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field645;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field649 + var8;
                if (var41 >= 0 && var41 < field648) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field652 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field652 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field647 + var42;
                            if (var46 >= 0 && var46 < field646) {
                                int var47 = field643[field648 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method289(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class302 var48 = (class302) field642.method1412((byte) -54, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method289(arg0, var38, var43, var40, var45, var48.field4176, var48.field4175);
                                    }
                                } else {
                                    field626[0] = (short) (var47 - 1);
                                    field624[0] = field635[field648 * var46 + var41];
                                    method289(arg0, var38, var43, var40, var45, field626, field624);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field649 >> 6;
        int var10 = field647 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field638 >> 6;
        int var12 = field631 >> 6;
        if (var11 >= field637[0].length) {
            var11 = field637[0].length - 1;
        }
        if (var12 >= field637[0][0].length) {
            var12 = field637[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class357 var28 = field637[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field641 >> 6) + var14) * 64;
                        int var30 = ((field650 >> 6) + var27) * 64;
                        for (class85 var31 = (class85) var28.method2307(false); var31 != null; var31 = (class85) var28.method2311(-5116)) {
                            int var32 = var31.field1304 + var29 - field641 - field649;
                            int var33 = var31.field1308 + var30 - field650 - field647;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field645;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field645;
                            int var36 = field652 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field652 - (arg2 * var33 + arg4 >> 16);
                            method287(arg0, var34, var36, var35 - var34, var37 - var36, var31.field1305, var31.field1307 & 0xFF, var31.field1306, var31.field1303, var31.field1309, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class357 var17 = field637[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field641 >> 6) + var15) * 64;
                        int var19 = ((field650 >> 6) + var16) * 64;
                        for (class85 var20 = (class85) var17.method2307(false); var20 != null; var20 = (class85) var17.method2311(-5116)) {
                            int var21 = var20.field1304 + var18 - field641 - field649;
                            int var22 = var20.field1308 + var19 - field650 - field647;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field645;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field645;
                            int var25 = field652 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field652 - (arg2 * var22 + arg4 >> 16);
                            method289(arg0, var23, var25, var24 - var23, var26 - var25, var20.field1303, var20.field1309);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Laa;Leb;IIII[I[I)V")
    private static final void method295(class281 arg0, class371 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2429(0);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2429(0);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field633[field648 * arg5 + arg4] = (byte) var11;
                    field636[field648 * arg5 + arg4] = 0;
                } else {
                    field636[field648 * arg5 + arg4] = (byte) var11;
                    field651[field648 * arg5 + arg4] = 0;
                    field633[field648 * arg5 + arg4] = arg1.method2418(-21337);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2429(0);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2429(0);
                var18 = arg1.method2429(0);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2429(0);
            }
            if (var15 == 0) {
                field633[field648 * arg5 + arg4] = (byte) var16;
                field636[field648 * arg5 + arg4] = (byte) var17;
                field651[field648 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field643[field648 * arg5 + arg4] = (short) (arg1.method2403((byte) 53) + 1);
                    field635[field648 * arg5 + arg4] = arg1.method2418(-21337);
                } else if (var19 > 1) {
                    field643[field648 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2403((byte) 117);
                        var21[var22] = arg1.method2418(-21337);
                    }
                    field642.method1419((long) (arg4 << 16 | arg5), 34, new class302(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2403((byte) 121);
                        var24[var25] = arg1.method2418(-21337);
                    }
                }
                if (field637[var15 - 1][arg2 - (field641 >> 6)][arg3 - (field650 >> 6)] == null) {
                    field637[var15 - 1][arg2 - (field641 >> 6)][arg3 - (field650 >> 6)] = new class357();
                }
                class85 var26 = new class85(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field637[var15 - 1][arg2 - (field641 >> 6)][arg3 - (field650 >> 6)].method2310(var26, -12918);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Laa;IIII)Ltc;")
    private static final class196 method296(class281 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class173 var5 = (class173) field622.method1312((byte) 25); var5 != null; var5 = (class173) field622.method1304(-35)) {
            method305(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field622;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()V")
    public static final void method297() {
        field633 = new byte[field648 * field646];
        field636 = new byte[field648 * field646];
        field651 = new byte[field648 * field646];
        field643 = new short[field648 * field646];
        field635 = new byte[field648 * field646];
        field642 = new class223(1024);
        field637 = new class357[3][field648 >> 6][field646 >> 6];
        field640 = new int[class249.field3452 + 1];
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()V")
    public static final void method298() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field630.field3449; var1++) {
            boolean var2 = field618.method833(field630.field3443[var1] >> 14 & 0x3FFF, var0, field630.field3443[var1] >> 28 & 0x3, false, field630.field3443[var1] & 0x3FFF);
            if (var2) {
                class173 var3 = new class173(field630.field3444[var1]);
                var3.field2457 = var0[1] - field641;
                var3.field2466 = var0[2] - field650;
                field622.method1301(50, var3);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "()V")
    public static final void method299() {
        field633 = null;
        field644 = null;
        field639 = null;
        field636 = null;
        field651 = null;
        field643 = null;
        field635 = null;
        field642 = null;
        field637 = null;
        field640 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lqj;)V")
    public static final void method300(class296 arg0) {
        field620 = arg0;
        field619.method1418((byte) -118);
        int var1 = field620.method1914(-1, "details");
        int[] var2 = field620.method1912(var1, 18197);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class125 var4 = class138.method951(var1, var2[var3], -10164, field620);
            field619.method1419((long) var4.field1763, 92, var4);
        }
        class396.method2566(true, false, -16653);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Ljd;")
    public static final class125 method301(int arg0, int arg1) {
        for (class125 var2 = (class125) field619.method1413(30381); var2 != null; var2 = (class125) field619.method1420((byte) 90)) {
            if (var2.field1757 && var2.method836(3, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Laa;II)V")
    public static final void method302(class281 arg0, int arg1, int arg2) {
        class371 var3 = new class371(field620.method1892(field618.field1766, false, "area"));
        int var4 = var3.method2429(0);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2429(0);
        }
        int var7 = var3.method2429(0);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2429(0);
        }
        while (true) {
            while (var3.field5273 < var3.field5258.length) {
                if (var3.method2429(0) == 0) {
                    int var22 = var3.method2429(0);
                    int var23 = var3.method2429(0);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field641;
                            int var27 = var23 * 64 + var25 - field650;
                            method295(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2429(0);
                    int var29 = var3.method2429(0);
                    int var30 = var3.method2429(0);
                    int var31 = var3.method2429(0);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field641;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field650;
                            method295(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field644 = new byte[field648 * field646];
            field639 = new short[field648 * field646];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field648 * field646];
                for (int var13 = 0; var13 < field637[var11].length; var13++) {
                    for (int var19 = 0; var19 < field637[var11][0].length; var19++) {
                        class357 var20 = field637[var11][var13][var19];
                        if (var20 != null) {
                            for (class85 var21 = (class85) var20.method2307(false); var21 != null; var21 = (class85) var20.method2311(-5116)) {
                                var12[(var19 * 64 + var21.field1308) * field648 + var13 * 64 + var21.field1304] = (byte) var21.field1305;
                            }
                        }
                    }
                }
                method303(var12, field644, field639, arg1, arg2);
                for (int var14 = 0; var14 < field637[var11].length; var14++) {
                    for (int var15 = 0; var15 < field637[var11][0].length; var15++) {
                        class357 var16 = field637[var11][var14][var15];
                        if (var16 != null) {
                            for (class85 var17 = (class85) var16.method2307(false); var17 != null; var17 = (class85) var16.method2311(-5116)) {
                                int var18 = (var15 * 64 + var17.field1308) * field648 + var14 * 64 + var17.field1304;
                                var17.field1305 = (field644[var18] & 0xFF) << 16 | field639[var18] & 0xFFFF;
                                if (var17.field1305 != 0) {
                                    var17.field1305 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method303(field633, field644, field639, arg1, arg2);
            field633 = null;
            method306();
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([B[B[SII)V")
    private static final void method303(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field646];
        int[] var6 = new int[field646];
        int[] var7 = new int[field646];
        int[] var8 = new int[field646];
        int[] var9 = new int[field646];
        for (int var10 = -5; var10 < field648; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field646; var13++) {
                int var10002;
                if (var11 < field648) {
                    int var28 = arg0[field648 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class170 var29 = class223.method1415(var28 - 1, (byte) -88);
                        var5[var13] += var29.field2415;
                        var6[var13] += var29.field2422;
                        var7[var13] += var29.field2421;
                        var8[var13] += var29.field2419;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field648 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class170 var31 = class223.method1415(var30 - 1, (byte) -88);
                        var5[var13] -= var31.field2415;
                        var6[var13] -= var31.field2422;
                        var7[var13] -= var31.field2421;
                        var8[var13] -= var31.field2419;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field646; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field646) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field648 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field648 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class40.method282(var15 / var18, false, var16 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field648 * var19 + var10;
                            int var27 = class293.field4057[class77.method549(class383.method2506(96, (byte) -90, var25), 127) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lsr;II)V")
    public static final void method304(class136 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class249.field3452; var3++) {
            field640[var3 + 1] = method292(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Laa;Lne;IIII)V")
    private static final void method305(class281 arg0, class173 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field2460 = ((arg1.field2457 - field649) * arg2 + arg4 >> 16) + field645;
        arg1.field2459 = field652 - ((arg1.field2466 - field647) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "()V")
    private static final void method306() {
        for (int var0 = 0; var0 < field648; var0++) {
            for (int var11 = 0; var11 < field646; var11++) {
                int var12 = field643[field648 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class302 var13 = (class302) field642.method1412((byte) -54, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field4176.length; var14++) {
                                class369 var15 = class310.method1961(var13.field4176[var14] & 0xFFFF, (byte) 35);
                                int var16 = var15.field5225;
                                if (var15.field5202 != null) {
                                    class369 var17 = var15.method2373((byte) 0);
                                    if (var17 != null) {
                                        var16 = var17.field5225;
                                    }
                                }
                                if (var16 != -1) {
                                    class173 var18 = new class173(var16);
                                    var18.field2457 = var0;
                                    var18.field2466 = var11;
                                    field622.method1301(50, var18);
                                }
                            }
                        }
                    } else {
                        class369 var19 = class310.method1961(var12 - 1, (byte) 35);
                        int var20 = var19.field5225;
                        if (var19.field5202 != null) {
                            class369 var21 = var19.method2373((byte) 0);
                            if (var21 != null) {
                                var20 = var21.field5225;
                            }
                        }
                        if (var20 != -1) {
                            class173 var22 = new class173(var20);
                            var22.field2457 = var0;
                            var22.field2466 = var11;
                            field622.method1301(50, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field637[0].length; var2++) {
                for (int var3 = 0; var3 < field637[0][0].length; var3++) {
                    class357 var4 = field637[var1][var2][var3];
                    if (var4 != null) {
                        for (class85 var5 = (class85) var4.method2307(false); var5 != null; var5 = (class85) var4.method2311(-5116)) {
                            if (var5.field1303 != null) {
                                for (int var6 = 0; var6 < var5.field1303.length; var6++) {
                                    class369 var7 = class310.method1961(var5.field1303[var6] & 0xFFFF, (byte) 35);
                                    int var8 = var7.field5225;
                                    if (var7.field5202 != null) {
                                        class369 var9 = var7.method2373((byte) 0);
                                        if (var9 != null) {
                                            var8 = var9.field5225;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class173 var10 = new class173(var8);
                                        var10.field2457 = ((field641 >> 6) + var2) * 64 + var5.field1304 - field641;
                                        var10.field2466 = ((field650 >> 6) + var3) * 64 + var5.field1308 - field650;
                                        field622.method1301(50, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Laa;)V")
    public static final void method307(class281 arg0) {
        int var1 = field638 - field649;
        int var2 = field631 - field647;
        int var3 = (field632 - field645 << 16) / var1;
        int var4 = (field652 - field634 << 16) / var2;
        method294(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Laa;)Ltc;")
    public static final class196 method308(class281 arg0) {
        int var1 = field638 - field649;
        int var2 = field631 - field647;
        int var3 = (field632 - field645 << 16) / var1;
        int var4 = (field652 - field634 << 16) / var2;
        return method296(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static final void method309(int arg0) {
        field618 = (class125) field619.method1412((byte) -54, (long) arg0);
    }
}
