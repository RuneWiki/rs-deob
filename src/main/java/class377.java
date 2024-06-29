import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class377 {

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5754 = new String[] { method3043(method3042("Zop+<")), method3043(method3042("Zop,<")), method3043(method3042("[k2\u0002")), method3043(method3042("N0p@i")), method3043(method3042("Zop*<")), method3043(method3042("Zop-<")), method3043(method3042("Zop/<")) };

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "F")
    public static float field5748 = 0.0F;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "Z")
    public static boolean field5750;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lcn;B)V", line = 5)
    public static final void method3037(class541 arg0, byte arg1) {
        try {
            field5747++;
            if (class728.field10555) {
                class23.field271++;
                if (arg0.field8094 != null) {
                    class541 var2 = class211.method1854(class173.field2406, class729.field10569, false);
                    if (var2 != null) {
                        class86 var3 = new class86();
                        var3.field959 = arg0;
                        var3.field970 = var2;
                        var3.field957 = arg0.field8094;
                        class782.method5663(var3);
                    }
                }
                class280 var4 = class610.method4508(class752.field10947, class279.field4190, (byte) -87);
                var4.field4197.method1412(true, arg0.field8034);
                var4.field4197.method1418((byte) -118, class729.field10569);
                var4.field4197.method1406(arg0.field7999, 380332136);
                var4.field4197.method1456(class173.field2406, 696591768);
                var4.field4197.method1440(arg0.field8100, (byte) -35);
                var4.field4197.method1446(class547.field8162, (byte) 98);
                class106.method934((byte) 53, var4);
                int var5 = -117 / ((34 - arg1) / 52);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5754[6] + (arg0 == null ? field5754[2] : field5754[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;ZZLjava/lang/String;ZI)V", line = 49)
    public static final void method3038(int arg0, String arg1, boolean arg2, boolean arg3, String arg4, boolean arg5, int arg6) {
        try {
            class411.field6075.field6927 = 1;
            field5751++;
            String var20 = arg4.toLowerCase();
            short[] var7 = new short[16];
            int var8 = -1;
            String var9 = null;
            if (arg3) {
                method3041(-72, 41);
            }
            if (arg6 != -1) {
                class181 var10 = class566.field8395.method3413((byte) -34, arg6);
                if (var10 == null || var10.method1585(-116) != arg2) {
                    return;
                }
                if (var10.method1585(-116)) {
                    var9 = var10.field2507;
                } else {
                    var8 = var10.field2506;
                }
            }
            int var11 = 0;
            for (int var12 = 0; var12 < class540.field7920.field9873; var12++) {
                class530 var13 = class540.field7920.method5000(var12, (byte) 66);
                if ((!arg5 || var13.field7719) && var13.field7756 == -1 && var13.field7793 == -1 && var13.field7742 == -1 && var13.field7727 == 0 && var13.field7775.toLowerCase().indexOf(var20) != -1) {
                    if (arg6 != -1) {
                        if (arg2) {
                            if (!arg1.equals(var13.method4000(var9, 104, arg6))) {
                                continue;
                            }
                        } else if (arg0 != var13.method3999(84, arg6, var8)) {
                            continue;
                        }
                    }
                    if (var11 >= 250) {
                        class757.field10990 = null;
                        class174.field2412 = -1;
                        return;
                    }
                    if (var7.length <= var11) {
                        short[] var14 = new short[var7.length * 2];
                        for (int var15 = 0; var15 < var11; var15++) {
                            var14[var15] = var7[var15];
                        }
                        var7 = var14;
                    }
                    var7[var11++] = (short) var12;
                }
            }
            class674.field9782 = 0;
            class174.field2412 = var11;
            class757.field10990 = var7;
            String[] var16 = new String[class174.field2412];
            for (int var17 = 0; var17 < class174.field2412; var17++) {
                var16[var17] = class540.field7920.method5000(var7[var17], (byte) 59).field7775;
            }
            class422.method3261(var16, -1, class757.field10990);
            class411.field6075.method3642((byte) -88);
            class411.field6075.field6927 = 2;
        } catch (RuntimeException var19) {
            throw class759.method5498(var19, field5754[1] + arg0 + ',' + (arg1 == null ? field5754[2] : field5754[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field5754[2] : field5754[3]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 161)
    public static final String method3039(int arg0, boolean arg1, int arg2) {
        try {
            if (arg2 < 53) {
                return null;
            } else {
                field5749++;
                return arg1 && arg0 >= 0 ? class235.method2007(true, arg1, arg0, 10) : Integer.toString(arg0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5754[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILdja;IBII[III[IIIIZI)I", line = 182)
    public static final int method3040(int arg0, class324 arg1, int arg2, byte arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
        try {
            for (int var15 = 0; var15 < 128; var15++) {
                for (int var16 = 0; var16 < 128; var16++) {
                    class36.field415[var15][var16] = 0;
                    class751.field10933[var15][var16] = 99999999;
                }
            }
            field5752++;
            if (arg3 != 79) {
                return -66;
            }
            boolean var17;
            if (arg7 == 1) {
                var17 = class132.method1138(arg1, arg11, arg3 - 10, arg10, arg2, arg8, arg14, arg12, arg5, arg0, arg4);
            } else if (arg7 == 2) {
                var17 = class132.method1137(arg5, arg14, arg4, arg1, (byte) -25, arg0, arg2, arg10, arg8, arg11, arg12);
            } else {
                var17 = class108.method951(arg2, arg11, arg1, arg14, arg12, arg4, 1, arg7, arg0, arg10, arg8, arg5);
            }
            int var18 = arg14 - 64;
            int var19 = arg0 - 64;
            int var20 = class650.field9410;
            int var21 = class534.field7819;
            if (!var17) {
                if (!arg13) {
                    return -1;
                }
                int var22 = Integer.MAX_VALUE;
                int var23 = Integer.MAX_VALUE;
                byte var24 = 10;
                for (int var25 = arg11 - var24; var25 <= (arg11 + var24); var25++) {
                    for (int var26 = arg2 - var24; var26 <= arg2 + var24; var26++) {
                        int var27 = var25 - var18;
                        int var28 = var26 - var19;
                        if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class751.field10933[var27][var28] < 100) {
                            int var29 = 0;
                            if (arg11 > var25) {
                                var29 = arg11 - var25;
                            } else if (var25 > (arg11 + arg12 - 1)) {
                                var29 = -arg11 - arg12 - (-1 - var25);
                            }
                            int var30 = 0;
                            if (arg2 > var26) {
                                var30 = arg2 - var26;
                            } else if (arg2 + arg5 - 1 < var26) {
                                var30 = var26 + 1 - arg2 - arg5;
                            }
                            int var31 = var29 * var29 + var30 * var30;
                            if (var22 > var31 || var22 == var31 && class751.field10933[var27][var28] < var23) {
                                var21 = var26;
                                var20 = var25;
                                var22 = var31;
                                var23 = class751.field10933[var27][var28];
                            }
                        }
                    }
                }
                if (var22 == Integer.MAX_VALUE) {
                    return -1;
                }
            }
            if (arg14 == var20 && arg0 == var21) {
                return 0;
            }
            byte var32 = 0;
            class282.field4222[var32] = var20;
            int var39 = var32 + 1;
            class314.field4967[var32] = var21;
            int var33;
            int var34 = var33 = class36.field415[var20 - var18][var21 - var19];
            while (arg14 != var20 || var21 != arg0) {
                if (var34 != var33) {
                    class282.field4222[var39] = var20;
                    var33 = var34;
                    class314.field4967[var39++] = var21;
                }
                if ((var34 & 0x2) != 0) {
                    var20++;
                } else if ((var34 & 0x8) != 0) {
                    var20--;
                }
                if ((var34 & 0x1) != 0) {
                    var21++;
                } else if ((var34 & 0x4) != 0) {
                    var21--;
                }
                var34 = class36.field415[var20 - var18][var21 - var19];
            }
            int var35 = 0;
            while ((var39--) > 0) {
                arg9[var35] = class282.field4222[var39];
                arg6[var35++] = class314.field4967[var39];
                if (arg9.length <= var35) {
                    break;
                }
            }
            return var35;
        } catch (RuntimeException var37) {
            throw class759.method5498(var37, field5754[4] + arg0 + ',' + (arg1 == null ? field5754[2] : field5754[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field5754[2] : field5754[3]) + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field5754[2] : field5754[3]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)V", line = 358)
    public static final void method3041(int arg0, int arg1) {
        try {
            field5746++;
            class429.field6309 = arg1;
            class591.field8684 = arg0;
            class28.method193(class76.field872.equals(""), true, 1, "", class76.field872);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5754[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3042(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3043(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
