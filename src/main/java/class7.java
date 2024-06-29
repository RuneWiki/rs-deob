import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Lgu;")
    private static class412 field78 = new class412(16);

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field83 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "[B")
    private static byte[] field84 = new byte[1];

    @OriginalMember(owner = "client!il", name = "o", descriptor = "[S")
    private static short[] field88 = new short[1];

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field85 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "Loe;")
    public static class137 field89 = new class137();

    @OriginalMember(owner = "client!il", name = "r", descriptor = "F")
    public static float field91;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "F")
    public static float field92;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Lr;")
    private static class124 field79;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lov;")
    public static class126 field82;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Lcu;")
    public static class149 field86;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Lrt;")
    public static class154 field74;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Lcq;")
    private static class329 field76;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lul;")
    public static class406 field81;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "Lgu;")
    private static class412 field114;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "Lqr;")
    public static class48 field80;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Lip;")
    public static class501 field77;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lfm;")
    public static class518 field75;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "[B")
    private static byte[] field101;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "[B")
    private static byte[] field105;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "[B")
    private static byte[] field107;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "[B")
    private static byte[] field96;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "[B")
    private static byte[] field97;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[I")
    private static int[] field95;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "[S")
    private static short[] field109;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "[S")
    private static short[] field110;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "[[[B")
    public static byte[][][] field87;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "[[[Lks;")
    private static class305[][][] field100;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lya;Lkn;IIII)V")
    private static final void method36(class38 arg0, class523 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field7646 = ((arg1.field7643 - field112) * arg2 + arg4 >> 16) + field94;
        arg1.field7644 = field98 - ((arg1.field7647 - field99) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lga;III)I")
    private static final int method37(class279 arg0, int arg1, int arg2, int arg3) {
        class300 var4 = field76.method2089(arg1, (byte) 37);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4547;
        if (var5 >= 0 && arg0.method584(true, var5).field4259) {
            var5 = -1;
        }
        int var9;
        if (var4.field4566 >= 0) {
            int var6 = var4.field4566;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class390.field5846[class186.method1236(false, class10.method71(96, 127, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class390.field5846[class186.method1236(false, class10.method71(96, 127, arg0.method584(true, var5).field4263)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4554 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4554;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class390.field5846[class186.method1236(false, class10.method71(96, 127, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lya;II)V")
    public static final void method38(class38 arg0, int arg1, int arg2) {
        class217 var3 = new class217(field81.method2550("area", field80.field606, true));
        int var4 = var3.method1515((byte) 127);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1515((byte) 121);
        }
        int var7 = var3.method1515((byte) 127);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1515((byte) 122);
        }
        while (true) {
            while (var3.field3556 < var3.field3572.length) {
                if (var3.method1515((byte) 126) == 0) {
                    int var22 = var3.method1515((byte) 123);
                    int var23 = var3.method1515((byte) 122);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field106;
                            int var27 = var23 * 64 + var25 - field103;
                            method53(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1515((byte) 121);
                    int var29 = var3.method1515((byte) 127);
                    int var30 = var3.method1515((byte) 122);
                    int var31 = var3.method1515((byte) 123);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field106;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field103;
                            method53(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field101 = new byte[field108 * field104];
            field110 = new short[field108 * field104];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field108 * field104];
                for (int var13 = 0; var13 < field100[var11].length; var13++) {
                    for (int var19 = 0; var19 < field100[var11][0].length; var19++) {
                        class305 var20 = field100[var11][var13][var19];
                        if (var20 != null) {
                            for (class252 var21 = (class252) var20.method1958(102); var21 != null; var21 = (class252) var20.method1961(-40)) {
                                var12[(var19 * 64 + var21.field3901) * field108 + var13 * 64 + var21.field3900] = (byte) var21.field3898;
                            }
                        }
                    }
                }
                method51(var12, field101, field110, arg1, arg2);
                for (int var14 = 0; var14 < field100[var11].length; var14++) {
                    for (int var15 = 0; var15 < field100[var11][0].length; var15++) {
                        class305 var16 = field100[var11][var14][var15];
                        if (var16 != null) {
                            for (class252 var17 = (class252) var16.method1958(39); var17 != null; var17 = (class252) var16.method1961(-55)) {
                                int var18 = (var15 * 64 + var17.field3901) * field108 + var14 * 64 + var17.field3900;
                                var17.field3898 = (field101[var18] & 0xFF) << 16 | field110[var18] & 0xFFFF;
                                if (var17.field3898 != 0) {
                                    var17.field3898 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method51(field97, field101, field110, arg1, arg2);
            field97 = null;
            method40();
            return;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V")
    public static final void method39() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field86.field2238; var1++) {
            boolean var2 = field80.method480(field86.field2237[var1] >> 28 & 0x3, 16542, var0, field86.field2237[var1] & 0x3FFF, field86.field2237[var1] >> 14 & 0x3FFF);
            if (var2) {
                class523 var3 = new class523(field86.field2239[var1]);
                var3.field7643 = var0[1] - field106;
                var3.field7647 = var0[2] - field103;
                field89.method994(var3, -3610);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()V")
    private static final void method40() {
        for (int var0 = 0; var0 < field108; var0++) {
            for (int var11 = 0; var11 < field104; var11++) {
                int var12 = field109[field108 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class499 var13 = (class499) field114.method2585((byte) 114, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field7162.length; var14++) {
                                class69 var15 = field77.method2973(-127, var13.field7162[var14] & 0xFFFF);
                                int var16 = var15.field903;
                                if (var15.field906 != null) {
                                    class69 var17 = var15.method604((byte) -15, field82);
                                    if (var17 != null) {
                                        var16 = var17.field903;
                                    }
                                }
                                if (var16 != -1) {
                                    class523 var18 = new class523(var16);
                                    var18.field7643 = var0;
                                    var18.field7647 = var11;
                                    field89.method994(var18, -3610);
                                }
                            }
                        }
                    } else {
                        class69 var19 = field77.method2973(-123, var12 - 1);
                        int var20 = var19.field903;
                        if (var19.field906 != null) {
                            class69 var21 = var19.method604((byte) -15, field82);
                            if (var21 != null) {
                                var20 = var21.field903;
                            }
                        }
                        if (var20 != -1) {
                            class523 var22 = new class523(var20);
                            var22.field7643 = var0;
                            var22.field7647 = var11;
                            field89.method994(var22, -3610);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field100[0].length; var2++) {
                for (int var3 = 0; var3 < field100[0][0].length; var3++) {
                    class305 var4 = field100[var1][var2][var3];
                    if (var4 != null) {
                        for (class252 var5 = (class252) var4.method1958(115); var5 != null; var5 = (class252) var4.method1961(-109)) {
                            if (var5.field3897 != null) {
                                for (int var6 = 0; var6 < var5.field3897.length; var6++) {
                                    class69 var7 = field77.method2973(-119, var5.field3897[var6] & 0xFFFF);
                                    int var8 = var7.field903;
                                    if (var7.field906 != null) {
                                        class69 var9 = var7.method604((byte) -15, field82);
                                        if (var9 != null) {
                                            var8 = var9.field903;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class523 var10 = new class523(var8);
                                        var10.field7643 = ((field106 >> 6) + var2) * 64 + var5.field3900 - field106;
                                        var10.field7647 = ((field103 >> 6) + var3) * 64 + var5.field3901 - field103;
                                        field89.method994(var10, -3610);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lul;Lcq;Lr;Lip;Lfm;Lrt;Lov;)V")
    public static final void method41(class406 arg0, class329 arg1, class124 arg2, class501 arg3, class518 arg4, class154 arg5, class126 arg6) {
        field81 = arg0;
        field76 = arg1;
        field79 = arg2;
        field77 = arg3;
        field75 = arg4;
        field74 = arg5;
        field82 = arg6;
        field78.method2588(-126);
        int var7 = field81.method2537("details", 87);
        int[] var8 = field81.method2540(-116, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class48 var10 = class8.method59(field81, var8[var9], var7, 74);
                field78.method2591((long) var10.field611, var10, (byte) -123);
            }
        }
        class257.method1714((byte) -104, true, false);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static final void method42(int arg0) {
        field80 = (class48) field78.method2585((byte) 114, (long) arg0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Lsu;")
    public static final class143 method43(int arg0, int arg1) {
        class143 var2 = new class143();
        for (class48 var3 = (class48) field78.method2592(123); var3 != null; var3 = (class48) field78.method2589(-1)) {
            if (var3.field615 && var3.method481(arg1, arg0, (byte) -34)) {
                var2.method1021(var3, -81);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lya;IIII)Loe;")
    private static final class137 method44(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class523 var5 = (class523) field89.method1004((byte) -108); var5 != null; var5 = (class523) field89.method996(1)) {
            method36(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field89;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)Lqr;")
    public static final class48 method45(int arg0, int arg1) {
        for (class48 var2 = (class48) field78.method2592(119); var2 != null; var2 = (class48) field78.method2589(-1)) {
            if (var2.field615 && var2.method481(arg1, arg0, (byte) -34)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "()V")
    public static final void method46() {
        field97 = new byte[field108 * field104];
        field105 = new byte[field108 * field104];
        field107 = new byte[field108 * field104];
        field109 = new short[field108 * field104];
        field96 = new byte[field108 * field104];
        field114 = new class412(1024);
        field100 = new class305[3][field108 >> 6][field104 >> 6];
        field95 = new int[field76.field4947 + 1];
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lya;)V")
    public static final void method47(class38 arg0) {
        int var1 = field102 - field112;
        int var2 = field93 - field99;
        int var3 = (field111 - field94 << 16) / var1;
        int var4 = (field98 - field113 << 16) / var2;
        method48(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Lya;IIII)V")
    private static final void method48(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field102 - field112;
        int var6 = field93 - field99;
        if (field102 < field108) {
            var5++;
        }
        if (field93 < field104) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field94;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field94;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field112 + var7;
                if (var52 >= 0 && var52 < field108) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field98 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field98 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field99 + var53;
                            int var58 = field108 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field104) {
                                var59 = (field101[var58] & 0xFF) << 16 | field110[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field105[var58] & 0xFF;
                                var61 = field109[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field80.field610 != -1) {
                                    var62 = field80.field610 | 0xFF000000;
                                } else if ((field93 + var53 & 0x4) == (field112 + var7 & 0x4)) {
                                    var62 = field95[field76.field4951 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method284(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method55(arg0, var49, var54, var51, var56, var59, var60, field107[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class499 var63 = (class499) field114.method2585((byte) 114, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method55(arg0, var49, var54, var51, var56, var59, var60, field107[var58], var63.field7162, var63.field7163, true);
                                }
                            } else {
                                field88[0] = (short) (var61 - 1);
                                field84[0] = field96[var58];
                                method55(arg0, var49, var54, var51, var56, var59, var60, field107[var58], field88, field84, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field98 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field98 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field80.field610 != -1) {
                            var68 = field80.field610 | 0xFF000000;
                        } else if ((field93 + var64 & 0x4) == (field112 + var7 & 0x4)) {
                            var68 = field95[field76.field4951 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method284(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field94;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field94;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field112 + var8;
                if (var41 >= 0 && var41 < field108) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field98 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field98 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field99 + var42;
                            if (var46 >= 0 && var46 < field104) {
                                int var47 = field109[field108 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method54(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class499 var48 = (class499) field114.method2585((byte) 114, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method54(arg0, var38, var43, var40, var45, var48.field7162, var48.field7163);
                                    }
                                } else {
                                    field88[0] = (short) (var47 - 1);
                                    field84[0] = field96[field108 * var46 + var41];
                                    method54(arg0, var38, var43, var40, var45, field88, field84);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field112 >> 6;
        int var10 = field99 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field102 >> 6;
        int var12 = field93 >> 6;
        if (var11 >= field100[0].length) {
            var11 = field100[0].length - 1;
        }
        if (var12 >= field100[0][0].length) {
            var12 = field100[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class305 var28 = field100[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field106 >> 6) + var14) * 64;
                        int var30 = ((field103 >> 6) + var27) * 64;
                        for (class252 var31 = (class252) var28.method1958(29); var31 != null; var31 = (class252) var28.method1961(102)) {
                            int var32 = var31.field3900 + var29 - field106 - field112;
                            int var33 = var31.field3901 + var30 - field103 - field99;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field94;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field94;
                            int var36 = field98 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field98 - (arg2 * var33 + arg4 >> 16);
                            method55(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3898, var31.field3896 & 0xFF, var31.field3899, var31.field3897, var31.field3895, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class305 var17 = field100[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field106 >> 6) + var15) * 64;
                        int var19 = ((field103 >> 6) + var16) * 64;
                        for (class252 var20 = (class252) var17.method1958(121); var20 != null; var20 = (class252) var17.method1961(-39)) {
                            int var21 = var20.field3900 + var18 - field106 - field112;
                            int var22 = var20.field3901 + var19 - field103 - field99;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field94;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field94;
                            int var25 = field98 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field98 - (arg2 * var22 + arg4 >> 16);
                            method54(arg0, var23, var25, var24 - var23, var26 - var25, var20.field3897, var20.field3895);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Lya;)Loe;")
    public static final class137 method49(class38 arg0) {
        int var1 = field102 - field112;
        int var2 = field93 - field99;
        int var3 = (field111 - field94 << 16) / var1;
        int var4 = (field98 - field113 << 16) / var2;
        return method44(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "()V")
    public static void method50() {
        field76 = null;
        field79 = null;
        field77 = null;
        field75 = null;
        field74 = null;
        field82 = null;
        field80 = null;
        field81 = null;
        field78 = null;
        field87 = null;
        field88 = null;
        field84 = null;
        field86 = null;
        field89 = null;
        field95 = null;
        field97 = null;
        field101 = null;
        field110 = null;
        field105 = null;
        field107 = null;
        field109 = null;
        field96 = null;
        field114 = null;
        field100 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([B[B[SII)V")
    private static final void method51(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field104];
        int[] var6 = new int[field104];
        int[] var7 = new int[field104];
        int[] var8 = new int[field104];
        int[] var9 = new int[field104];
        for (int var10 = -5; var10 < field108; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field104; var13++) {
                int var10002;
                if (var11 < field108) {
                    int var28 = arg0[field108 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class63 var29 = field79.method919(1, var28 - 1);
                        var5[var13] += var29.field770;
                        var6[var13] += var29.field769;
                        var7[var13] += var29.field777;
                        var8[var13] += var29.field775;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field108 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class63 var31 = field79.method919(1, var30 - 1);
                        var5[var13] -= var31.field770;
                        var6[var13] -= var31.field769;
                        var7[var13] -= var31.field777;
                        var8[var13] -= var31.field775;
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
                for (int var19 = -5; var19 < field104; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field104) {
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
                        if ((arg0[field108 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field108 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class485.method2901(var15 / var18, var14 * 256 / var17, var16 / var18, (byte) -122);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field108 * var19 + var10;
                            int var27 = class390.field5846[class186.method1236(false, class42.method396(false, var25, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "()V")
    public static final void method52() {
        field97 = null;
        field101 = null;
        field110 = null;
        field105 = null;
        field107 = null;
        field109 = null;
        field96 = null;
        field114 = null;
        field100 = null;
        field95 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lya;Lhp;IIII[I[I)V")
    private static final void method53(class38 arg0, class217 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1515((byte) 125);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1515((byte) 123);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field97[field108 * arg5 + arg4] = (byte) var11;
                    field105[field108 * arg5 + arg4] = 0;
                } else {
                    field105[field108 * arg5 + arg4] = (byte) var11;
                    field107[field108 * arg5 + arg4] = 0;
                    field97[field108 * arg5 + arg4] = arg1.method1565(true);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1515((byte) 125);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1515((byte) 123);
                var18 = arg1.method1515((byte) 124);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1515((byte) 121);
            }
            if (var15 == 0) {
                field97[field108 * arg5 + arg4] = (byte) var16;
                field105[field108 * arg5 + arg4] = (byte) var17;
                field107[field108 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field109[field108 * arg5 + arg4] = (short) (arg1.method1511(116) + 1);
                    field96[field108 * arg5 + arg4] = arg1.method1565(true);
                } else if (var19 > 1) {
                    field109[field108 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1511(-28);
                        var21[var22] = arg1.method1565(true);
                    }
                    field114.method2591((long) (arg4 << 16 | arg5), new class499(var20, var21), (byte) -114);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1511(-80);
                        var24[var25] = arg1.method1565(true);
                    }
                }
                if (field100[var15 - 1][arg2 - (field106 >> 6)][arg3 - (field103 >> 6)] == null) {
                    field100[var15 - 1][arg2 - (field106 >> 6)][arg3 - (field103 >> 6)] = new class305();
                }
                class252 var26 = new class252(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field100[var15 - 1][arg2 - (field106 >> 6)][arg3 - (field103 >> 6)].method1957(-81, var26);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lya;IIII[S[B)V")
    private static final void method54(class38 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class69 var8 = field77.method2973(-128, arg5[var7] & 0xFFFF);
            int var9 = var8.field900;
            if (var9 != -1) {
                class373 var10 = field74.method1062(68, var9);
                class16 var11 = var10.method2333(var8.field918 ? arg6[var7] >> 6 & 0x3 : 0, -1545209261, arg0, var8.field899 ? var8.field973 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method129() >> 2;
                    int var13 = arg4 * var11.method139() >> 2;
                    if (var10.field5551) {
                        int var14 = var8.field941;
                        int var15 = var8.field927;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field5548 == 0) {
                            var11.method126(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method135(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field5548 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lya;IIIIIII[S[BZ)V")
    private static final void method55(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method284(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field95[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method284(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class106.method823(var11, arg5, var12, arg1, arg3, (byte) -105, arg7 >> 6 & 0x3, field87, field90, arg2, field95[arg6], arg0, arg4);
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
                class69 var18 = field77.method2973(-125, arg8[var16] & 0xFFFF);
                if (var18.field900 == -1) {
                    int var19 = -3355444;
                    if (var18.field922 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method369(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method304(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method369(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method304(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method369(arg1, arg2, arg4, -1, 0);
                            arg0.method304(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method369(var14, arg2, arg4, -1, 0);
                            arg0.method304(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method369(var14, arg2, arg4, -1, 0);
                            arg0.method304(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method369(arg1, arg2, arg4, -1, 0);
                            arg0.method304(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method304(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method304(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method304(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method304(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method304(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method304(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Lqr;")
    public static final class48 method56(int arg0) {
        return (class48) field78.method2585((byte) 114, (long) arg0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lga;II)V")
    public static final void method57(class279 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field76.field4947; var3++) {
            field95[var3 + 1] = method37(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field112 = arg0 - field106;
        field93 = arg1 - field103;
        field102 = arg2 - field106;
        field99 = arg3 - field103;
        field94 = arg4;
        field113 = arg5;
        field111 = arg6;
        field98 = arg7;
    }
}
