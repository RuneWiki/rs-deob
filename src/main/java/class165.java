import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class165 extends class443 {

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2240 = "Loading - please wait.";

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "Z")
    public static boolean field2244 = false;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "Lso;")
    public static class238 field2241;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lfb;I)Lwf;")
    public static final class303 method1111(class341 arg0, int arg1) {
        if (arg1 == -1) {
            field2243++;
            return new class303(arg0.method2212(-2), arg0.method2212(-2), arg0.method2212(arg1 - 1), arg0.method2212(-2), arg0.method2249(32767), arg0.method2249(32767), arg0.method2233((byte) 104));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
    public static final void method1112() {
        class379.field5552 = 0;
        label191: for (int var0 = 0; var0 < class199.field2754; var0++) {
            class321 var1 = class114.field1489[var0];
            if (class384.field5619 != null) {
                for (int var2 = 0; var2 < class384.field5619.length; var2++) {
                    if (class384.field5619[var2] != -1000000 && (var1.field4765 <= class384.field5619[var2] || var1.field4767 <= class384.field5619[var2]) && (var1.field4766 <= class47.field710[var2] || var1.field4787 <= class47.field710[var2]) && (var1.field4766 >= class241.field3373[var2] || var1.field4787 >= class241.field3373[var2]) && (var1.field4778 <= class428.field6227[var2] || var1.field4774 <= class428.field6227[var2]) && (var1.field4778 >= class21.field394[var2] || var1.field4774 >= class21.field394[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field4769 == 1) {
                int var3 = var1.field4777 + class251.field3687 - class167.field2261;
                if (var3 >= 0 && var3 <= class251.field3687 + class251.field3687) {
                    int var4 = var1.field4783 + class251.field3687 - class437.field6352;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4764 + class251.field3687 - class437.field6352;
                    if (var5 > class251.field3687 + class251.field3687) {
                        var5 = class251.field3687 + class251.field3687;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class277.field4069[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class193.field2684 - var1.field4766;
                        if (var7 > 32) {
                            var1.field4784 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4784 = 2;
                            var7 = -var7;
                        }
                        var1.field4781 = (var1.field4778 - class447.field6430 << 8) / var7;
                        var1.field4788 = (var1.field4774 - class447.field6430 << 8) / var7;
                        var1.field4779 = (var1.field4765 - class217.field3029 << 8) / var7;
                        var1.field4782 = (var1.field4767 - class217.field3029 << 8) / var7;
                        class242.field3396[class379.field5552++] = var1;
                    }
                }
            } else if (var1.field4769 == 2) {
                int var8 = var1.field4783 + class251.field3687 - class437.field6352;
                if (var8 >= 0 && var8 <= class251.field3687 + class251.field3687) {
                    int var9 = var1.field4777 + class251.field3687 - class167.field2261;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4762 + class251.field3687 - class167.field2261;
                    if (var10 > class251.field3687 + class251.field3687) {
                        var10 = class251.field3687 + class251.field3687;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class277.field4069[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class447.field6430 - var1.field4778;
                        if (var12 > 32) {
                            var1.field4784 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4784 = 4;
                            var12 = -var12;
                        }
                        var1.field4763 = (var1.field4766 - class193.field2684 << 8) / var12;
                        var1.field4789 = (var1.field4787 - class193.field2684 << 8) / var12;
                        var1.field4779 = (var1.field4765 - class217.field3029 << 8) / var12;
                        var1.field4782 = (var1.field4767 - class217.field3029 << 8) / var12;
                        class242.field3396[class379.field5552++] = var1;
                    }
                }
            } else if (var1.field4769 == 4) {
                int var13 = var1.field4765 - class217.field3029;
                if (var13 > 128) {
                    int var14 = var1.field4783 + class251.field3687 - class437.field6352;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4764 + class251.field3687 - class437.field6352;
                    if (var15 > class251.field3687 + class251.field3687) {
                        var15 = class251.field3687 + class251.field3687;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4777 + class251.field3687 - class167.field2261;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4762 + class251.field3687 - class167.field2261;
                        if (var17 > class251.field3687 + class251.field3687) {
                            var17 = class251.field3687 + class251.field3687;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class277.field4069[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4784 = 5;
                            var1.field4763 = (var1.field4766 - class193.field2684 << 8) / var13;
                            var1.field4789 = (var1.field4787 - class193.field2684 << 8) / var13;
                            var1.field4781 = (var1.field4778 - class447.field6430 << 8) / var13;
                            var1.field4788 = (var1.field4774 - class447.field6430 << 8) / var13;
                            class242.field3396[class379.field5552++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V")
    public static void method1113(int arg0) {
        field2240 = null;
        field2241 = null;
        int var1 = -89 / ((-arg0 - 29) / 43);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[I[ILqc;[I)V")
    public static final void method1114(int arg0, int[] arg1, int[] arg2, class163 arg3, int[] arg4) {
        field2238++;
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg3.field2120.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field2120[var9] = null;
                    } else {
                        class233 var10 = class73.method597(var6, -1);
                        int var11 = var10.field3239;
                        class239 var12 = arg3.field2120[var9];
                        if (var12 != null) {
                            if (var12.field3350 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field2120[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3353 = 0;
                                    var12.field3351 = 1;
                                    var12.field3355 = var8;
                                    var12.field3349 = 0;
                                    var12.field3354 = 0;
                                    class379.method2476(0, false, false, arg3.field5930, var10, arg3.field5921);
                                } else if (var11 == 2) {
                                    var12.field3353 = 0;
                                }
                            } else if (var10.field3250 >= class73.method597(var12.field3350, -1).field3250) {
                                var12 = arg3.field2120[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class239 var13 = arg3.field2120[var9] = new class239();
                            var13.field3353 = 0;
                            var13.field3350 = var6;
                            var13.field3351 = 1;
                            var13.field3349 = 0;
                            var13.field3354 = 0;
                            var13.field3355 = var8;
                            class379.method2476(0, false, false, arg3.field5930, var10, arg3.field5921);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg0 > -69) {
            method1115((String) null, (byte) 17);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method1115(String arg0, byte arg1) {
        field2239++;
        int var2 = arg0.length();
        if (arg1 < 72) {
            method1116(-60, (boolean[]) null, 55, 41, (class298) null, (byte[][]) null, (byte[][]) null, (class149) null, -119, -40, 33, (class21) null, -60, (byte[][]) null);
        }
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[ZIILtj;[[B[[BLpc;IIILa;I[[B)V")
    public static final void method1116(int arg0, boolean[] arg1, int arg2, int arg3, class298 arg4, byte[][] arg5, byte[][] arg6, class149 arg7, int arg8, int arg9, int arg10, class21 arg11, int arg12, byte[][] arg13) {
        field2242++;
        if (arg11 != null && arg7 != null || arg7 != null && arg3 == 12 || arg11 != null && arg3 == 0) {
            boolean[] var14 = arg11 != null && arg11.field378 ? class234.field3257[arg3] : class334.field4936[arg3];
            if (arg2 > 0) {
                if (arg8 > 0) {
                    int var15 = arg13[arg8 - 1][arg2 - 1] & 0xFF;
                    if (var15 > 0) {
                        class21 var16 = class269.method1794(-18176, var15 - 1);
                        if (var16.field387 != -1 && var16.field378) {
                            byte var17 = arg5[arg8 - 1][arg2 - 1];
                            int var18 = arg6[arg8 - 1][arg2 - 1] * 2 + 4 & 0x7;
                            int var19 = class362.method2383(0, var16, arg4);
                            if (class389.field5698[var17][var18]) {
                                class166.field2251[0] = var16.field387;
                                class242.field3403[0] = var19;
                                class85.field1172[0] = arg4.method479() ? var16.field391 : var16.field389;
                                class204.field2817[0] = var16.field375;
                                class273.field4013[0] = var16.field380;
                                class266.field3952[0] = 256;
                            }
                        }
                    }
                }
                if ((arg12 - 1) > arg8) {
                    int var20 = arg13[arg8 + 1][arg2 - 1] & 0xFF;
                    if (var20 > 0) {
                        class21 var21 = class269.method1794(-18176, var20 - 1);
                        if (var21.field387 != -1 && var21.field378) {
                            byte var22 = arg5[arg8 + 1][arg2 - 1];
                            int var23 = (arg6[arg8 + 1][arg2 - 1] * 2) + 6 & 0x7;
                            int var24 = class362.method2383(0, var21, arg4);
                            if (class389.field5698[var22][var23]) {
                                class166.field2251[2] = var21.field387;
                                class242.field3403[2] = var24;
                                class85.field1172[2] = arg4.method479() ? var21.field391 : var21.field389;
                                class204.field2817[2] = var21.field375;
                                class273.field4013[2] = var21.field380;
                                class266.field3952[2] = 512;
                            }
                        }
                    }
                }
            }
            if ((arg0 - 1) > arg2) {
                if (arg8 > 0) {
                    int var25 = arg13[arg8 - 1][arg2 + 1] & 0xFF;
                    if (var25 > 0) {
                        class21 var26 = class269.method1794(-18176, var25 - 1);
                        if (var26.field387 != -1 && var26.field378) {
                            byte var27 = arg5[arg8 - 1][arg2 + 1];
                            int var28 = arg6[arg8 - 1][arg2 + 1] * 2 + 2 & 0x7;
                            int var29 = class362.method2383(0, var26, arg4);
                            if (class389.field5698[var27][var28]) {
                                class166.field2251[6] = var26.field387;
                                class242.field3403[6] = var29;
                                class85.field1172[6] = arg4.method479() ? var26.field391 : var26.field389;
                                class204.field2817[6] = var26.field375;
                                class273.field4013[6] = var26.field380;
                                class266.field3952[6] = 64;
                            }
                        }
                    }
                }
                if (arg8 < (arg12 - 1)) {
                    int var30 = arg13[arg8 + 1][arg2 + 1] & 0xFF;
                    if (var30 > 0) {
                        class21 var31 = class269.method1794(-18176, var30 - 1);
                        if (var31.field387 != -1 && var31.field378) {
                            byte var32 = arg5[arg8 + 1][arg2 + 1];
                            int var33 = arg6[arg8 + 1][arg2 + 1] * 2 & 0x7;
                            int var34 = class362.method2383(0, var31, arg4);
                            if (class389.field5698[var32][var33]) {
                                class166.field2251[4] = var31.field387;
                                class242.field3403[4] = var34;
                                class85.field1172[4] = arg4.method479() ? var31.field391 : var31.field389;
                                class204.field2817[4] = var31.field375;
                                class273.field4013[4] = var31.field380;
                                class266.field3952[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg2 > 0) {
                int var35 = arg13[arg8][arg2 - 1] & 0xFF;
                if (var35 > 0) {
                    class21 var36 = class269.method1794(-18176, var35 - 1);
                    if (var36.field387 != -1) {
                        byte var37 = arg5[arg8][arg2 - 1];
                        byte var38 = arg6[arg8][arg2 - 1];
                        if (var36.field378) {
                            int var39 = 2;
                            int var40 = var38 * 2 + 4;
                            int var41 = class362.method2383(0, var36, arg4);
                            for (int var42 = 0; var42 < 3; var42++) {
                                var39 &= 0x7;
                                var40 &= 0x7;
                                if (class389.field5698[var37][var40] && class273.field4013[var39] <= var36.field380) {
                                    class166.field2251[var39] = var36.field387;
                                    class242.field3403[var39] = var41;
                                    class85.field1172[var39] = arg4.method479() ? var36.field391 : var36.field389;
                                    class204.field2817[var39] = var36.field375;
                                    if (class273.field4013[var39] == var36.field380) {
                                        class266.field3952[var39] = class258.method1708(class266.field3952[var39], 32);
                                    } else {
                                        class266.field3952[var39] = 32;
                                    }
                                    class273.field4013[var39] = var36.field380;
                                }
                                var40++;
                                var39--;
                            }
                            if (!var14[arg9 & 0x3]) {
                                arg1[0] = class234.field3257[var37][class394.method2529(var38 + 2, 3)];
                            }
                        } else if (!var14[arg9 & 0x3]) {
                            arg1[0] = class334.field4936[var37][class394.method2529(var38 + 2, 3)];
                        }
                    }
                }
            }
            if (arg2 < (arg0 - 1)) {
                int var43 = arg13[arg8][arg2 + 1] & 0xFF;
                if (var43 > 0) {
                    class21 var44 = class269.method1794(-18176, var43 - 1);
                    if (var44.field387 != -1) {
                        byte var45 = arg5[arg8][arg2 + 1];
                        byte var46 = arg6[arg8][arg2 + 1];
                        if (var44.field378) {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class362.method2383(0, var44, arg4);
                            for (int var50 = 0; var50 < 3; var50++) {
                                var48 &= 0x7;
                                var47 &= 0x7;
                                if (class389.field5698[var45][var48] && class273.field4013[var47] <= var44.field380) {
                                    class166.field2251[var47] = var44.field387;
                                    class242.field3403[var47] = var49;
                                    class85.field1172[var47] = arg4.method479() ? var44.field391 : var44.field389;
                                    class204.field2817[var47] = var44.field375;
                                    if (class273.field4013[var47] == var44.field380) {
                                        class266.field3952[var47] = class258.method1708(class266.field3952[var47], 16);
                                    } else {
                                        class266.field3952[var47] = 16;
                                    }
                                    class273.field4013[var47] = var44.field380;
                                }
                                var47++;
                                var48--;
                            }
                            if (!var14[arg9 + 2 & 0x3]) {
                                arg1[2] = class234.field3257[var45][class394.method2529(3, var46)];
                            }
                        } else if (!var14[arg9 + 2 & 0x3]) {
                            arg1[2] = class334.field4936[var45][class394.method2529(var46, 3)];
                        }
                    }
                }
            }
            if (arg8 > 0) {
                int var51 = arg13[arg8 - 1][arg2] & 0xFF;
                if (var51 > 0) {
                    class21 var52 = class269.method1794(-18176, var51 - 1);
                    if (var52.field387 != -1) {
                        byte var53 = arg5[arg8 - 1][arg2];
                        byte var54 = arg6[arg8 - 1][arg2];
                        if (var52.field378) {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class362.method2383(0, var52, arg4);
                            for (int var58 = 0; var58 < 3; var58++) {
                                var55 &= 0x7;
                                var56 &= 0x7;
                                if (class389.field5698[var53][var56] && class273.field4013[var55] <= var52.field380) {
                                    class166.field2251[var55] = var52.field387;
                                    class242.field3403[var55] = var57;
                                    class85.field1172[var55] = arg4.method479() ? var52.field391 : var52.field389;
                                    class204.field2817[var55] = var52.field375;
                                    if (class273.field4013[var55] == var52.field380) {
                                        class266.field3952[var55] = class258.method1708(class266.field3952[var55], 8);
                                    } else {
                                        class266.field3952[var55] = 8;
                                    }
                                    class273.field4013[var55] = var52.field380;
                                }
                                var56--;
                                var55++;
                            }
                            if (!var14[arg9 + 3 & 0x3]) {
                                arg1[3] = class234.field3257[var53][class394.method2529(var54 + 1, 3)];
                            }
                        } else if (!var14[arg9 + 3 & 0x3]) {
                            arg1[3] = class334.field4936[var53][class394.method2529(3, var54 + 1)];
                        }
                    }
                }
            }
            if (arg8 < (arg12 - 1)) {
                int var59 = arg13[arg8 + 1][arg2] & 0xFF;
                if (var59 > 0) {
                    class21 var60 = class269.method1794(-18176, var59 - 1);
                    if (var60.field387 != -1) {
                        byte var61 = arg5[arg8 + 1][arg2];
                        byte var62 = arg6[arg8 + 1][arg2];
                        if (var60.field378) {
                            int var63 = 4;
                            int var64 = var62 * 2 + 6;
                            int var65 = class362.method2383(0, var60, arg4);
                            for (int var66 = 0; var66 < 3; var66++) {
                                var63 &= 0x7;
                                var64 &= 0x7;
                                if (class389.field5698[var61][var64] && class273.field4013[var63] <= var60.field380) {
                                    class166.field2251[var63] = var60.field387;
                                    class242.field3403[var63] = var65;
                                    class85.field1172[var63] = arg4.method479() ? var60.field391 : var60.field389;
                                    class204.field2817[var63] = var60.field375;
                                    if (class273.field4013[var63] == var60.field380) {
                                        class266.field3952[var63] = class258.method1708(class266.field3952[var63], 4);
                                    } else {
                                        class266.field3952[var63] = 4;
                                    }
                                    class273.field4013[var63] = var60.field380;
                                }
                                var63--;
                                var64++;
                            }
                            if (!var14[arg9 + 1 & 0x3]) {
                                arg1[1] = class234.field3257[var61][class394.method2529(3, var62 + 3)];
                            }
                        } else if (!var14[arg9 + 1 & 0x3]) {
                            arg1[1] = class334.field4936[var61][class394.method2529(var62 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg10 < 105) {
            method1116(-58, (boolean[]) null, -94, -58, (class298) null, (byte[][]) null, (byte[][]) null, (class149) null, -113, -8, 65, (class21) null, -96, (byte[][]) null);
        }
        if (arg11 == null) {
            return;
        }
        int var67 = class362.method2383(0, arg11, arg4);
        if (!arg11.field378) {
            return;
        }
        for (int var68 = 0; var68 < 8; var68++) {
            int var69 = var68 - (arg9 * 2) & 0x7;
            if (class389.field5698[arg3][var68] && arg11.field380 >= class273.field4013[var69]) {
                class166.field2251[var69] = arg11.field387;
                class242.field3403[var69] = var67;
                class85.field1172[var69] = arg4.method479() ? arg11.field391 : arg11.field389;
                class204.field2817[var69] = arg11.field375;
                if (class273.field4013[var69] == arg11.field380) {
                    class266.field3952[var69] = class258.method1708(class266.field3952[var69], 2);
                } else {
                    class266.field3952[var69] = 2;
                }
                class273.field4013[var69] = arg11.field380;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)V")
    public static final void method1117(byte arg0) {
        field2237++;
        class90.field1227.method366(-116);
        int var1 = 12 / ((arg0 + 66) / 45);
    }
}
