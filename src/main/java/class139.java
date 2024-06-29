import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class139 {

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Lfca;")
    public static class661 field1833 = new class661();

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "B")
    public byte field1831;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "Ljava/lang/String;")
    public String field1829;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Ljava/lang/String;")
    public String field1832;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Ljava/lang/String;")
    public String field1835;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "Ljava/lang/String;")
    public String field1836;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 17)
    public static final void method796(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class141.field1854 = true;
        class516.field6577 = class398.field5275.method893() > 0;
        class230.field3104 = arg15;
        class454.field5914 = arg1 >> class88.field1221;
        class309.field3875 = arg3 >> class88.field1221;
        class602.field7656 = arg1;
        class82.field1172 = arg3;
        class459.field5998 = arg2;
        class141.field1853 = class454.field5914 - class76.field1069;
        if (class141.field1853 < 0) {
            class474.field6172 = -class141.field1853;
            class141.field1853 = 0;
        } else {
            class474.field6172 = 0;
        }
        class61.field804 = class309.field3875 - class76.field1069;
        if (class61.field804 < 0) {
            class337.field4107 = -class61.field804;
            class61.field804 = 0;
        } else {
            class337.field4107 = 0;
        }
        class70.field957 = class76.field1069 + class454.field5914;
        if (class70.field957 > class330.field4039) {
            class70.field957 = class330.field4039;
        }
        class24.field206 = class76.field1069 + class309.field3875;
        if (class24.field206 > class559.field7102) {
            class24.field206 = class559.field7102;
        }
        boolean[][] var19 = class145.field1873;
        boolean[][] var20 = class56.field726;
        if (class230.field3104) {
            for (int var21 = 0; var21 < class76.field1069 + class76.field1069 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class76.field1069 + class76.field1069 + 2; var24++) {
                    if (var24 > 1) {
                        class19.field176[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class454.field5914 + var21 - class76.field1069;
                    int var26 = class309.field3875 + var24 - class76.field1069;
                    if (var25 >= 0 && var26 >= 0 && var25 < class330.field4039 && var26 < class559.field7102) {
                        int var27 = var25 << class88.field1221;
                        int var28 = var26 << class88.field1221;
                        int var29 = class383.field4790[class383.field4790.length - 1].method2060(var26, -92, var25) - (0x3E8 << class88.field1221 - 7);
                        int var30 = class735.field9973 == null ? class383.field4790[0].method2060(var26, -104, var25) + class722.field9480 : class735.field9973[0].method2060(var26, -99, var25) + class722.field9480;
                        var23 = arg16 >= 0 ? class398.field5275.method969(var27, var29, var28, var27, var30, var28, arg16) : class398.field5275.method978(var27, var29, var28, var27, var30, var28);
                        class56.field726[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class56.field726[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class19.field176[var24 - 1] & class19.field176[var24] & var22 & var23;
                        class145.field1873[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class19.field176[class76.field1069 + class76.field1069] = var22;
                class19.field176[class76.field1069 + class76.field1069 + 1] = var23;
            }
            if (arg16 >= 0) {
                class141.field1854 = false;
            } else {
                class370.field4536 = arg5;
                class376.field4595 = arg6;
                class299.field3790 = arg7;
                class661.field8631 = arg8;
                class30.field272 = arg9;
                class315.method1839(arg10, (byte) -72, class398.field5275);
            }
        } else {
            if (class714.field9406 == null) {
                class714.field9406 = new boolean[class330.field4039 + class330.field4039 + 1][class559.field7102 + class330.field4039 + 1];
            }
            for (int var32 = 0; var32 < class714.field9406.length; var32++) {
                for (int var42 = 0; var42 < class714.field9406[0].length; var42++) {
                    class714.field9406[var32][var42] = true;
                }
            }
            class56.field726 = class714.field9406;
            class145.field1873 = class714.field9406;
            class141.field1853 = 0;
            class61.field804 = 0;
            class70.field957 = class330.field4039;
            class24.field206 = class559.field7102;
            class141.field1854 = false;
        }
        class335.method1932(0, class398.field5275);
        if (!class108.field1468.field10645) {
            class151 var33 = class108.field1468.field10644;
            for (class266 var34 = (class266) var33.method857(-117); var34 != null; var34 = (class266) var33.method864(true)) {
                var34.method3306(false);
                class57.method348(var34, 18);
            }
        }
        if (class516.field6577) {
            for (int var35 = 0; var35 < class451.field5892; var35++) {
                class491.field6306[var35].method4011(arg14, (byte) -54, arg0);
            }
        }
        if (class70.field955) {
            class303.field3820 = class398.field5275.method916();
            class398.field5275.method924(class497.field6360);
            int var36 = (class497.field6360[2] - class497.field6360[0]) / class106.field1448;
            for (int var37 = 0; var37 < class106.field1448 - 1; var37++) {
                class309.field3868[var37] = (var37 + 1) * var36 + class45.field507[var37];
            }
            for (int var38 = 0; var38 < class166.field2206.length; var38++) {
                class166.field2206[var38].method3834();
            }
        }
        if (class324.field4002 != null) {
            if (class70.field955) {
                class490.method2736(0);
            }
            class395.method2290(true);
            class398.field5275.method952(-1, 1583160, 40, 127);
            class590.method3171(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class70.field955) {
                class78.method482();
            }
            class398.field5275.method918();
            class395.method2290(false);
        }
        class590.method3171(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class70.field955) {
            for (int var39 = 0; var39 < class78.field1121; var39++) {
                class787.field10783[var39] = class301.field3804[var39];
            }
            class490.method2736(0);
            for (int var40 = 0; var40 < class166.field2206.length; var40++) {
                class166.field2206[var40].method3834();
            }
        }
        if (class70.field955) {
            class78.method482();
            for (int var41 = 0; var41 < class78.field1121; var41++) {
                class301.field3804[var41] = class787.field10783[var41];
            }
            if (class514.field6556 == 2) {
                int var10002;
                if (class634.field8053[0] < class634.field8053[1]) {
                    if (class45.field507[0] + class309.field3868[0] > class497.field6360[0]) {
                        var10002 = class45.field507[0]++;
                    }
                } else if (class634.field8053[0] > class634.field8053[1] && class45.field507[0] + class309.field3868[0] < class497.field6360[2]) {
                    var10002 = class45.field507[0]--;
                }
            }
        }
        if (!class230.field3104) {
            class145.field1873 = var19;
            class56.field726 = var20;
        }
        class495.method2754();
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 296)
    public static void method797(int arg0) {
        field1833 = null;
        if (arg0 != 1) {
            field1833 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIIII)V", line = 307)
    public static final void method798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1830++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg4 - arg7;
        int var12 = arg2 - arg7;
        int var13 = arg4 * arg4;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        if (arg1 >= -4) {
            method797(27);
        }
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class207.field2840[arg0];
        class54.method333(arg6 - var11, var39, 7, arg6 - arg4, arg3);
        class54.method333(arg6 + var11, var39, 7, arg6 - var11, arg5);
        class54.method333(arg4 + arg6, var39, 7, arg6 + var11, arg3);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg0 - var9;
            int var42 = arg0 + var9;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg6 + var10;
                int var46 = arg6 - var10;
                class54.method333(var46, class207.field2840[var41], 7, var44, arg3);
                class54.method333(var45, class207.field2840[var41], 7, var46, arg5);
                class54.method333(var43, class207.field2840[var41], 7, var45, arg3);
                class54.method333(var46, class207.field2840[var42], 7, var44, arg3);
                class54.method333(var45, class207.field2840[var42], 7, var46, arg5);
                class54.method333(var43, class207.field2840[var42], 7, var45, arg3);
            } else {
                class54.method333(var43, class207.field2840[var41], 7, var44, arg3);
                class54.method333(var43, class207.field2840[var42], 7, var44, arg3);
            }
        }
    }
}
