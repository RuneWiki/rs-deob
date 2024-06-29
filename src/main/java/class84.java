import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class84 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lhe;")
    private static class372 field1173 = new class372(16);

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field1183 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "[S")
    private static short[] field1184 = new short[1];

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field1182 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "[B")
    private static byte[] field1187 = new byte[1];

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lada;")
    public static class164 field1180 = new class164();

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "F")
    public static float field1178;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "F")
    public static float field1179;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Luaa;")
    public static class118 field1175;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Ljj;")
    public static class120 field1177;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Lvf;")
    public static class152 field1181;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Ltfa;")
    private static class34 field1171;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "Lhe;")
    private static class372 field1205;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lvd;")
    public static class39 field1169;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lhl;")
    private static class530 field1170;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lvi;")
    public static class541 field1176;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lmk;")
    public static class56 field1172;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lsha;")
    public static class730 field1174;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "[B")
    private static byte[] field1188;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "[B")
    private static byte[] field1196;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "[B")
    private static byte[] field1197;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "[B")
    private static byte[] field1200;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "[B")
    private static byte[] field1207;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "[I")
    private static int[] field1193;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "[S")
    private static short[] field1206;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "[S")
    private static short[] field1208;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[[[B")
    public static byte[][][] field1185;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "[[[Leia;")
    private static class243[][][] field1194;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V", line = 6)
    public static final void method668() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field1181.field2354; var1++) {
            boolean var2 = field1177.method873(field1181.field2353[var1] >> 28 & 0x3, -87, field1181.field2353[var1] & 0x3FFF, field1181.field2353[var1] >> 14 & 0x3FFF, var0);
            if (var2) {
                class622 var3 = new class622(field1181.field2348[var1]);
                var3.field8732 = var0[1] - field1201;
                var3.field8735 = var0[2] - field1190;
                field1180.method1203(var3, (byte) 98);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lha;Ltl;IIII)V", line = 27)
    private static final void method669(class60 arg0, class622 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field8730 = ((arg1.field8732 - field1192) * arg2 + arg4 >> 16) + field1199;
        arg1.field8728 = field1191 - ((arg1.field8735 - field1203) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()V", line = 35)
    public static void method670() {
        field1170 = null;
        field1171 = null;
        field1172 = null;
        field1175 = null;
        field1174 = null;
        field1176 = null;
        field1177 = null;
        field1169 = null;
        field1173 = null;
        field1185 = null;
        field1184 = null;
        field1187 = null;
        field1181 = null;
        field1180 = null;
        field1193 = null;
        field1207 = null;
        field1200 = null;
        field1208 = null;
        field1196 = null;
        field1188 = null;
        field1206 = null;
        field1197 = null;
        field1205 = null;
        field1194 = null;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()V", line = 61)
    public static final void method671() {
        field1207 = null;
        field1200 = null;
        field1208 = null;
        field1196 = null;
        field1188 = null;
        field1206 = null;
        field1197 = null;
        field1205 = null;
        field1194 = null;
        field1193 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Ljj;", line = 74)
    public static final class120 method672(int arg0) {
        return (class120) field1173.method2287((long) arg0, (byte) -117);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lvd;Lhl;Ltfa;Lmk;Luaa;Lsha;Lvi;)V", line = 78)
    public static final void method673(class39 arg0, class530 arg1, class34 arg2, class56 arg3, class118 arg4, class730 arg5, class541 arg6) {
        field1169 = arg0;
        field1170 = arg1;
        field1171 = arg2;
        field1172 = arg3;
        field1175 = arg4;
        field1174 = arg5;
        field1176 = arg6;
        field1173.method2289(1393);
        int var7 = field1169.method217("details", (byte) -93);
        int[] var8 = field1169.method223(98, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class120 var10 = class159.method1168(var8[var9], var7, field1169, -120);
                field1173.method2278((byte) -32, (long) var10.field1641, var10);
            }
        }
        class184.method1301(true, false, -22433);
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "()V", line = 108)
    public static final void method674() {
        field1207 = new byte[field1204 * field1198];
        field1196 = new byte[field1204 * field1198];
        field1188 = new byte[field1204 * field1198];
        field1206 = new short[field1204 * field1198];
        field1197 = new byte[field1204 * field1198];
        field1205 = new class372(1024);
        field1194 = new class243[3][field1204 >> 6][field1198 >> 6];
        field1193 = new int[field1170.field7558 + 1];
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lha;IIII)Lada;", line = 120)
    private static final class164 method675(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class622 var5 = (class622) field1180.method1195(0); var5 != null; var5 = (class622) field1180.method1201(2)) {
            method669(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field1180;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V", line = 131)
    public static final void method676(int arg0) {
        field1177 = (class120) field1173.method2287((long) arg0, (byte) -117);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 135)
    private static final void method677(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method516(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field1193[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method516(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class208.method1404(field1186, var12, -6925, field1185, field1193[arg6], arg7 >> 6 & 0x3, arg3, arg2, arg0, var11, arg4, arg5, arg1);
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
                class211 var18 = field1172.method388(arg8[var16] & 0xFFFF, 100);
                if (var18.field3132 == -1) {
                    int var19 = -3355444;
                    if (var18.field3113 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method458(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method497(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method458(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method497(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method458(arg1, arg2, arg4, -1, 0);
                            arg0.method497(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method458(var14, arg2, arg4, -1, 0);
                            arg0.method497(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method458(var14, arg2, arg4, -1, 0);
                            arg0.method497(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method458(arg1, arg2, arg4, -1, 0);
                            arg0.method497(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method497(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method497(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method497(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method497(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method497(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method497(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ld;III)I", line = 297)
    private static final int method678(class151 arg0, int arg1, int arg2, int arg3) {
        class456 var4 = field1170.method3096(arg1, (byte) 28);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field6728;
        if (var5 >= 0 && arg0.method1124((byte) 101, var5).field4184) {
            var5 = -1;
        }
        int var9;
        if (var4.field6721 >= 0) {
            int var6 = var4.field6721;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class9.field141[class139.method982(class548.method3204(96, var8, (byte) -46), -16614) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class9.field141[class139.method982(class548.method3204(96, arg0.method1124((byte) 37, var5).field4175, (byte) -40), -16614) & 0xFFFF] | 0xFF000000;
        } else if (var4.field6713 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field6713;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class9.field141[class139.method982(class548.method3204(96, var12, (byte) -14), -16614) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Lha;IIII)V", line = 355)
    private static final void method679(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field1202 - field1192;
        int var6 = field1209 - field1203;
        if (field1202 < field1204) {
            var5++;
        }
        if (field1209 < field1198) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field1199;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field1199;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field1192 + var7;
                if (var52 >= 0 && var52 < field1204) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field1191 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field1191 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field1203 + var53;
                            int var58 = field1204 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field1198) {
                                var59 = (field1200[var58] & 0xFF) << 16 | field1208[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field1196[var58] & 0xFF;
                                var61 = field1206[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field1177.field1633 != -1) {
                                    var62 = field1177.field1633 | 0xFF000000;
                                } else if ((field1209 + var53 & 0x4) == (field1192 + var7 & 0x4)) {
                                    var62 = field1193[field1170.field7560 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method516(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method677(arg0, var49, var54, var51, var56, var59, var60, field1188[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class52 var63 = (class52) field1205.method2287((long) (var52 << 16 | var57), (byte) -117);
                                if (var63 != null) {
                                    method677(arg0, var49, var54, var51, var56, var59, var60, field1188[var58], var63.field746, var63.field745, true);
                                }
                            } else {
                                field1184[0] = (short) (var61 - 1);
                                field1187[0] = field1197[var58];
                                method677(arg0, var49, var54, var51, var56, var59, var60, field1188[var58], field1184, field1187, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field1191 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field1191 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field1177.field1633 != -1) {
                            var68 = field1177.field1633 | 0xFF000000;
                        } else if ((field1209 + var64 & 0x4) == (field1192 + var7 & 0x4)) {
                            var68 = field1193[field1170.field7560 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method516(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field1199;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field1199;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field1192 + var8;
                if (var41 >= 0 && var41 < field1204) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field1191 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field1191 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field1203 + var42;
                            if (var46 >= 0 && var46 < field1198) {
                                int var47 = field1206[field1204 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method685(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class52 var48 = (class52) field1205.method2287((long) (var41 << 16 | var46), (byte) -117);
                                    if (var48 != null) {
                                        method685(arg0, var38, var43, var40, var45, var48.field746, var48.field745);
                                    }
                                } else {
                                    field1184[0] = (short) (var47 - 1);
                                    field1187[0] = field1197[field1204 * var46 + var41];
                                    method685(arg0, var38, var43, var40, var45, field1184, field1187);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field1192 >> 6;
        int var10 = field1203 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field1202 >> 6;
        int var12 = field1209 >> 6;
        if (var11 >= field1194[0].length) {
            var11 = field1194[0].length - 1;
        }
        if (var12 >= field1194[0][0].length) {
            var12 = field1194[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class243 var28 = field1194[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field1201 >> 6) + var14) * 64;
                        int var30 = ((field1190 >> 6) + var27) * 64;
                        for (class23 var31 = (class23) var28.method1615((byte) 57); var31 != null; var31 = (class23) var28.method1625(-117)) {
                            int var32 = var31.field243 + var29 - field1201 - field1192;
                            int var33 = var31.field240 + var30 - field1190 - field1203;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field1199;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field1199;
                            int var36 = field1191 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field1191 - (arg2 * var33 + arg4 >> 16);
                            method677(arg0, var34, var36, var35 - var34, var37 - var36, var31.field239, var31.field244 & 0xFF, var31.field241, var31.field242, var31.field238, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class243 var17 = field1194[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field1201 >> 6) + var15) * 64;
                        int var19 = ((field1190 >> 6) + var16) * 64;
                        for (class23 var20 = (class23) var17.method1615((byte) 83); var20 != null; var20 = (class23) var17.method1625(-93)) {
                            int var21 = var20.field243 + var18 - field1201 - field1192;
                            int var22 = var20.field240 + var19 - field1190 - field1203;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field1199;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field1199;
                            int var25 = field1191 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field1191 - (arg2 * var22 + arg4 >> 16);
                            method685(arg0, var23, var25, var24 - var23, var26 - var25, var20.field242, var20.field238);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([B[B[SII)V", line = 698)
    private static final void method680(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field1198];
        int[] var6 = new int[field1198];
        int[] var7 = new int[field1198];
        int[] var8 = new int[field1198];
        int[] var9 = new int[field1198];
        for (int var10 = -5; var10 < field1204; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field1198; var13++) {
                int var10002;
                if (var11 < field1204) {
                    int var28 = arg0[field1204 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class707 var29 = field1171.method173(var28 - 1, 126);
                        var5[var13] += var29.field9954;
                        var6[var13] += var29.field9950;
                        var7[var13] += var29.field9957;
                        var8[var13] += var29.field9961;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field1204 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class707 var31 = field1171.method173(var30 - 1, 126);
                        var5[var13] -= var31.field9954;
                        var6[var13] -= var31.field9950;
                        var7[var13] -= var31.field9957;
                        var8[var13] -= var31.field9961;
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
                for (int var19 = -5; var19 < field1198; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field1198) {
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
                        if ((arg0[field1204 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field1204 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class248.method1645(var14 * 256 / var17, -193, var16 / var18, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field1204 * var19 + var10;
                            int var27 = class9.field141[class139.method982(class164.method1199(var25, 96, 65408), -16614) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Ljj;", line = 843)
    public static final class120 method681(int arg0, int arg1) {
        for (class120 var2 = (class120) field1173.method2283(false); var2 != null; var2 = (class120) field1173.method2282((byte) 11)) {
            if (var2.field1651 && var2.method870((byte) 87, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lha;II)V", line = 858)
    public static final void method682(class60 arg0, int arg1, int arg2) {
        class645 var3 = new class645(field1169.method233(-91, field1177.field1654, "area"));
        int var4 = var3.method3745(-6314);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method3745(-6314);
        }
        int var7 = var3.method3745(-6314);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method3745(-6314);
        }
        while (true) {
            while (var3.field9084 < var3.field9068.length) {
                if (var3.method3745(-6314) == 0) {
                    int var22 = var3.method3745(-6314);
                    int var23 = var3.method3745(-6314);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field1201;
                            int var27 = var23 * 64 + var25 - field1190;
                            method686(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method3745(-6314);
                    int var29 = var3.method3745(-6314);
                    int var30 = var3.method3745(-6314);
                    int var31 = var3.method3745(-6314);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field1201;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field1190;
                            method686(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field1200 = new byte[field1204 * field1198];
            field1208 = new short[field1204 * field1198];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field1204 * field1198];
                for (int var13 = 0; var13 < field1194[var11].length; var13++) {
                    for (int var19 = 0; var19 < field1194[var11][0].length; var19++) {
                        class243 var20 = field1194[var11][var13][var19];
                        if (var20 != null) {
                            for (class23 var21 = (class23) var20.method1615((byte) 76); var21 != null; var21 = (class23) var20.method1625(-103)) {
                                var12[(var19 * 64 + var21.field240) * field1204 + var13 * 64 + var21.field243] = (byte) var21.field239;
                            }
                        }
                    }
                }
                method680(var12, field1200, field1208, arg1, arg2);
                for (int var14 = 0; var14 < field1194[var11].length; var14++) {
                    for (int var15 = 0; var15 < field1194[var11][0].length; var15++) {
                        class243 var16 = field1194[var11][var14][var15];
                        if (var16 != null) {
                            for (class23 var17 = (class23) var16.method1615((byte) 69); var17 != null; var17 = (class23) var16.method1625(-84)) {
                                int var18 = (var15 * 64 + var17.field240) * field1204 + var14 * 64 + var17.field243;
                                var17.field239 = (field1200[var18] & 0xFF) << 16 | field1208[var18] & 0xFFFF;
                                if (var17.field239 != 0) {
                                    var17.field239 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method680(field1207, field1200, field1208, arg1, arg2);
            field1207 = null;
            method691();
            return;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lha;)V", line = 1038)
    public static final void method683(class60 arg0) {
        int var1 = field1202 - field1192;
        int var2 = field1209 - field1203;
        int var3 = (field1189 - field1199 << 16) / var1;
        int var4 = (field1191 - field1195 << 16) / var2;
        method679(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ld;II)V", line = 1051)
    public static final void method684(class151 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field1170.field7558; var3++) {
            field1193[var3 + 1] = method678(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 1060)
    private static final void method685(class60 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class211 var8 = field1172.method388(arg5[var7] & 0xFFFF, 100);
            int var9 = var8.field3132;
            if (var9 != -1) {
                class643 var10 = field1174.method4122(var9, (byte) 58);
                class536 var11 = var10.method3685(arg0, (byte) 82, var8.field3124 ? arg6[var7] >> 6 & 0x3 : 0, var8.field3103 ? var8.field3144 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1504() >> 2;
                    int var13 = arg4 * var11.method1514() >> 2;
                    if (var10.field9022) {
                        int var14 = var8.field3164;
                        int var15 = var8.field3152;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field9023 == 0) {
                            var11.method3149(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method3144(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field9023 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lha;Lrg;IIII[I[I)V", line = 1119)
    private static final void method686(class60 arg0, class645 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method3745(-6314);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method3745(-6314);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field1207[field1204 * arg5 + arg4] = (byte) var11;
                    field1196[field1204 * arg5 + arg4] = 0;
                } else {
                    field1196[field1204 * arg5 + arg4] = (byte) var11;
                    field1188[field1204 * arg5 + arg4] = 0;
                    field1207[field1204 * arg5 + arg4] = arg1.method3743(true);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method3745(-6314);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method3745(-6314);
                var18 = arg1.method3745(-6314);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method3745(-6314);
            }
            if (var15 == 0) {
                field1207[field1204 * arg5 + arg4] = (byte) var16;
                field1196[field1204 * arg5 + arg4] = (byte) var17;
                field1188[field1204 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field1206[field1204 * arg5 + arg4] = (short) (arg1.method3712((byte) 52) + 1);
                    field1197[field1204 * arg5 + arg4] = arg1.method3743(true);
                } else if (var19 > 1) {
                    field1206[field1204 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method3712((byte) -110);
                        var21[var22] = arg1.method3743(true);
                    }
                    field1205.method2278((byte) -67, (long) (arg4 << 16 | arg5), new class52(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method3712((byte) -119);
                        var24[var25] = arg1.method3743(true);
                    }
                }
                if (field1194[var15 - 1][arg2 - (field1201 >> 6)][arg3 - (field1190 >> 6)] == null) {
                    field1194[var15 - 1][arg2 - (field1201 >> 6)][arg3 - (field1190 >> 6)] = new class243();
                }
                class23 var26 = new class23(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field1194[var15 - 1][arg2 - (field1201 >> 6)][arg3 - (field1190 >> 6)].method1616(22437, var26);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIII)V", line = 1253)
    public static final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1192 = arg0 - field1201;
        field1209 = arg1 - field1190;
        field1202 = arg2 - field1201;
        field1203 = arg3 - field1190;
        field1199 = arg4;
        field1195 = arg5;
        field1189 = arg6;
        field1191 = arg7;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Lha;)Lada;", line = 1265)
    public static final class164 method688(class60 arg0) {
        int var1 = field1202 - field1192;
        int var2 = field1209 - field1203;
        int var3 = (field1189 - field1199 << 16) / var1;
        int var4 = (field1191 - field1195 << 16) / var2;
        return method675(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)Lre;", line = 1276)
    public static final class603 method689(int arg0, int arg1) {
        class603 var2 = new class603();
        for (class120 var3 = (class120) field1173.method2283(false); var3 != null; var3 = (class120) field1173.method2282((byte) 42)) {
            if (var3.field1651 && var3.method870((byte) 87, arg1, arg0)) {
                var2.method3505(var3, 4);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lha;Ltl;Lfo;)V", line = 1291)
    public static final void method690(class60 arg0, class622 arg1, class519 arg2) {
        if (arg2.field7419 == null) {
            return;
        }
        int[] var3 = new int[arg2.field7419.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field7419[var4 * 2] + arg1.field8732;
            int var22 = arg2.field7419[var4 * 2 + 1] + arg1.field8735;
            var3[var4 * 2] = (field1189 - field1199) * (var21 - field1192) / (field1202 - field1192) + field1199;
            var3[var4 * 2 + 1] = field1191 - (var22 - field1203) * (field1191 - field1195) / (field1209 - field1203);
        }
        class65.method573(arg0, var3, arg2.field7399);
        if (arg2.field7398 > 0) {
            for (int var5 = 0; var5 < var3.length / 2 - 1; var5++) {
                int var13 = var3[var5 * 2];
                int var14 = var3[var5 * 2 + 1];
                int var15 = var3[(var5 + 1) * 2];
                int var16 = var3[(var5 + 1) * 2 + 1];
                if (var15 < var13) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var16 < var14) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg0.method522(var13, var14, var15, var16, arg2.field7447[arg2.field7441[var5] & 0xFF], 1, arg2.field7398, arg2.field7404, arg2.field7430);
            }
            int var6 = var3[var3.length - 2];
            int var7 = var3[var3.length - 1];
            int var8 = var3[0];
            int var9 = var3[1];
            if (var8 < var6) {
                int var10 = var6;
                int var11 = var7;
                var6 = var8;
                var7 = var9;
                var8 = var10;
                var9 = var11;
            } else if (var6 == var8 && var9 < var7) {
                int var12 = var7;
                var7 = var9;
                var9 = var12;
            }
            arg0.method522(var6, var7, var8, var9, arg2.field7447[arg2.field7441[arg2.field7441.length - 1] & 0xFF], 1, arg2.field7398, arg2.field7404, arg2.field7430);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method506(var3[var20 * 2 + 1], var3[(var20 + 1) * 2 + 1], (byte) 87, var3[var20 * 2], arg2.field7447[arg2.field7441[var20] & 0xFF], var3[(var20 + 1) * 2]);
        }
        arg0.method506(var3[var3.length - 1], var3[1], (byte) 70, var3[var3.length - 2], arg2.field7447[arg2.field7441[arg2.field7441.length - 1] & 0xFF], var3[0]);
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "()V", line = 1401)
    private static final void method691() {
        for (int var0 = 0; var0 < field1204; var0++) {
            for (int var11 = 0; var11 < field1198; var11++) {
                int var12 = field1206[field1204 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class52 var13 = (class52) field1205.method2287((long) (var0 << 16 | var11), (byte) -117);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field746.length; var14++) {
                                class211 var15 = field1172.method388(var13.field746[var14] & 0xFFFF, 100);
                                int var16 = var15.field3118;
                                if (var15.field3172 != null) {
                                    class211 var17 = var15.method1442((byte) -43, field1176);
                                    if (var17 != null) {
                                        var16 = var17.field3118;
                                    }
                                }
                                if (var16 != -1) {
                                    class622 var18 = new class622(var16);
                                    var18.field8732 = var0;
                                    var18.field8735 = var11;
                                    field1180.method1203(var18, (byte) 126);
                                }
                            }
                        }
                    } else {
                        class211 var19 = field1172.method388(var12 - 1, 100);
                        int var20 = var19.field3118;
                        if (var19.field3172 != null) {
                            class211 var21 = var19.method1442((byte) -114, field1176);
                            if (var21 != null) {
                                var20 = var21.field3118;
                            }
                        }
                        if (var20 != -1) {
                            class622 var22 = new class622(var20);
                            var22.field8732 = var0;
                            var22.field8735 = var11;
                            field1180.method1203(var22, (byte) -87);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field1194[0].length; var2++) {
                for (int var3 = 0; var3 < field1194[0][0].length; var3++) {
                    class243 var4 = field1194[var1][var2][var3];
                    if (var4 != null) {
                        for (class23 var5 = (class23) var4.method1615((byte) 76); var5 != null; var5 = (class23) var4.method1625(-35)) {
                            if (var5.field242 != null) {
                                for (int var6 = 0; var6 < var5.field242.length; var6++) {
                                    class211 var7 = field1172.method388(var5.field242[var6] & 0xFFFF, 100);
                                    int var8 = var7.field3118;
                                    if (var7.field3172 != null) {
                                        class211 var9 = var7.method1442((byte) -66, field1176);
                                        if (var9 != null) {
                                            var8 = var9.field3118;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class622 var10 = new class622(var8);
                                        var10.field8732 = ((field1201 >> 6) + var2) * 64 + var5.field243 - field1201;
                                        var10.field8735 = ((field1190 >> 6) + var3) * 64 + var5.field240 - field1190;
                                        field1180.method1203(var10, (byte) -36);
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
