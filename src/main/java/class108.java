import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class108 extends class328 implements class380 {

    @OriginalMember(owner = "client!qfa", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field1262 = new String[] { method955(method954("v\\<\ru/")), method955(method954("|\u0014s\rI")), method955(method954("iO1O")), method955(method954("v\\<\rq/")), method955(method954("v\\<\rv/")), method955(method954("v\\<\rw/")), method955(method954("v\\<\r\bnT4W\n/")), method955(method954("v\\<\rp/")) };

    @OriginalMember(owner = "client!qfa", name = "E", descriptor = "I")
    public static int field1254 = -1;

    @OriginalMember(owner = "client!qfa", name = "B", descriptor = "Lwia;")
    public static class790 field1256 = new class790(22, 4);

    @OriginalMember(owner = "client!qfa", name = "y", descriptor = "Lvha;")
    public static class713 field1258 = new class713(13, 3);

    @OriginalMember(owner = "client!qfa", name = "A", descriptor = "Leg;")
    public static class118 field1261 = new class118(0, 0);

    @OriginalMember(owner = "client!qfa", name = "w", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!qfa", name = "v", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!qfa", name = "D", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!qfa", name = "u", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!qfa", name = "x", descriptor = "Lfs;")
    public static class581 field1255;

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "[Ltq;")
    public static class654[] field1259;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V", line = 13)
    public static final void method949(byte arg0) {
        try {
            ++field1252;
            if (class381.field5783 != null) {
                if (arg0 >= 121) {
                    class381.field5783 = null;
                    class728.method5312(class348.field5390, class259.field3999, class80.field903, (byte) 80, class662.field9570);
                }
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1262[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lrda;IZ[[I)V", line = 28)
    public class108(class690 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class215.field3276, class157.field1952, arg1 * 6 * arg1, arg2);
        try {
            super.field5165.method2467(12, this);
            if (arg2) {
                for (int var5 = 0; ~var5 > -7; ++var5) {
                    this.method2775(arg3[var5], var5 + 34069, (byte) -5, arg1, arg1);
                }
            } else {
                for (int var6 = 0; var6 < 6; ++var6) {
                    OpenGL.glTexImage2Di(var6 + 34069, 0, this.method2773(-96), arg1, arg1, 0, class311.method2626((byte) -117, super.field5179), super.field5165.field10112, arg3[var6], 0);
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1262[6] + (arg0 != null ? field1262[1] : field1262[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1262[1] : field1262[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V", line = 66)
    public static void method950(int arg0) {
        try {
            if (arg0 != -32541) {
                method953(77, 71, (byte) -54, (class726) null, -48);
            }
            field1259 = null;
            field1256 = null;
            field1261 = null;
            field1258 = null;
            field1255 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1262[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IILdja;IIIIIIIII)Z", line = 84)
    public static final boolean method951(int arg0, int arg1, class324 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            ++field1260;
            int var12 = arg3;
            int var13 = arg8;
            byte var14 = 64;
            byte var15 = 64;
            int var16 = arg3 - var14;
            int var17 = -var15 + arg8;
            class36.field415[var14][var15] = 99;
            if (arg6 != 1) {
                return true;
            } else {
                class751.field10933[var14][var15] = 0;
                byte var18 = 0;
                class282.field4222[var18] = arg3;
                int var19 = 0;
                int var37 = var18 + 1;
                class314.field4967[var18] = arg8;
                int[][] var20 = arg2.field5117;
                while (true) {
                    label346: while (true) {
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        int var26;
                        do {
                            do {
                                do {
                                    label323: do {
                                        if (var37 == var19) {
                                            class534.field7819 = var13;
                                            class650.field9410 = var12;
                                            return false;
                                        }
                                        var13 = class314.field4967[var19];
                                        var12 = class282.field4222[var19];
                                        var21 = -var17 + var13;
                                        var19 = var19 + 1 & 4095;
                                        var22 = -var16 + var12;
                                        var23 = var12 - arg2.field5114;
                                        var24 = -arg2.field5097 + var13;
                                        if (~arg10 != 3) {
                                            if (~arg10 != 2) {
                                                if (~arg10 != 1) {
                                                    if (~arg10 != 0) {
                                                        if (arg10 != 0 && ~arg10 != -2 && arg10 != 2 && arg10 != 3 && ~arg10 != -10) {
                                                            if (arg2.method2748(arg5, (byte) 119, var12, arg10, arg1, var13, arg0, arg7)) {
                                                                class534.field7819 = var13;
                                                                class650.field9410 = var12;
                                                                return true;
                                                            }
                                                        } else if (arg2.method2750(var13, arg7, -83, var12, arg1, arg5, arg0, arg10)) {
                                                            class650.field9410 = var12;
                                                            class534.field7819 = var13;
                                                            return true;
                                                        }
                                                    } else if (arg2.method2735(arg7, arg1, true, arg4, arg11, var13, arg0, arg9, var12)) {
                                                        class650.field9410 = var12;
                                                        class534.field7819 = var13;
                                                        return true;
                                                    }
                                                } else if (arg2.method2747(arg7, arg0, var13, arg1, (byte) 68, arg9, arg11, var12, arg4, arg7)) {
                                                    class650.field9410 = var12;
                                                    class534.field7819 = var13;
                                                    return true;
                                                }
                                            } else if (class39.method264(arg1, arg0, arg7, var12, arg4, arg11, 0, arg7, var13)) {
                                                class650.field9410 = var12;
                                                class534.field7819 = var13;
                                                return true;
                                            }
                                        } else if (~arg1 == ~var12 && ~arg0 == ~var13) {
                                            class650.field9410 = var12;
                                            class534.field7819 = var13;
                                            return true;
                                        }
                                        var26 = class751.field10933[var22][var21] + 1;
                                        if (var22 > 0 && ~class36.field415[var22 - 1][var21] == -1 && ~(var20[var23 - 1][var24] & 1134821376) == -1 && ~(1310982144 & var20[var23 + -1][arg7 + var24 + -1]) == -1) {
                                            int var27 = 1;
                                            while (true) {
                                                if (~(arg7 + -1) >= ~var27) {
                                                    class282.field4222[var37] = var12 - 1;
                                                    class314.field4967[var37] = var13;
                                                    class36.field415[var22 - 1][var21] = 2;
                                                    var37 = var37 + 1 & 4095;
                                                    class751.field10933[var22 + -1][var21] = var26;
                                                    break;
                                                }
                                                if ((1336147968 & var20[var23 + -1][var24 + var27]) != 0) {
                                                    break;
                                                }
                                                ++var27;
                                            }
                                        }
                                        if (~var22 > ~(-arg7 + 128) && class36.field415[var22 + 1][var21] == 0 && (1625554944 & var20[arg7 + var23][var24]) == 0 && (var20[arg7 + var23][-1 + (var24 - -arg7)] & 2015625216) == 0) {
                                            int var28 = 1;
                                            while (true) {
                                                if (var28 >= arg7 + -1) {
                                                    class282.field4222[var37] = var12 + 1;
                                                    class314.field4967[var37] = var13;
                                                    class36.field415[var22 - -1][var21] = 8;
                                                    var37 = 4095 & var37 + 1;
                                                    class751.field10933[var22 + 1][var21] = var26;
                                                    break;
                                                }
                                                if (~(2028208128 & var20[arg7 + var23][var24 + var28]) != -1) {
                                                    break;
                                                }
                                                ++var28;
                                            }
                                        }
                                        if (var21 > 0 && ~class36.field415[var22][var21 + -1] == -1 && (var20[var23][var24 + -1] & 1134821376) == 0 && (var20[arg7 + -1 + var23][var24 + -1] & 1625554944) == 0) {
                                            int var29 = 1;
                                            while (true) {
                                                if (var29 >= arg7 + -1) {
                                                    class282.field4222[var37] = var12;
                                                    class314.field4967[var37] = var13 + -1;
                                                    class36.field415[var22][var21 - 1] = 1;
                                                    var37 = var37 + 1 & 4095;
                                                    class751.field10933[var22][var21 + -1] = var26;
                                                    break;
                                                }
                                                if ((var20[var23 + var29][-1 + var24] & 1675886592) != 0) {
                                                    break;
                                                }
                                                ++var29;
                                            }
                                        }
                                        if (~var21 > ~(128 - arg7) && ~class36.field415[var22][1 + var21] == -1 && (var20[var23][arg7 + var24] & 1310982144) == 0 && ~(var20[var23 - (-arg7 + 1)][var24 - -arg7] & 2015625216) == -1) {
                                            int var30 = 1;
                                            while (true) {
                                                if (~(arg7 + -1) >= ~var30) {
                                                    class282.field4222[var37] = var12;
                                                    class314.field4967[var37] = var13 + 1;
                                                    var37 = var37 - -1 & 4095;
                                                    class36.field415[var22][var21 - -1] = 4;
                                                    class751.field10933[var22][var21 + 1] = var26;
                                                    break;
                                                }
                                                if ((2116288512 & var20[var23 + var30][arg7 + var24]) != 0) {
                                                    break;
                                                }
                                                ++var30;
                                            }
                                        }
                                        if (~var22 < -1 && ~var21 < -1 && ~class36.field415[var22 + -1][var21 + -1] == -1 && (1134821376 & var20[var23 - 1][var24 + -1]) == 0) {
                                            int var31 = 1;
                                            while (true) {
                                                if (~arg7 >= ~var31) {
                                                    class282.field4222[var37] = var12 + -1;
                                                    class314.field4967[var37] = var13 + -1;
                                                    var37 = 4095 & var37 + 1;
                                                    class36.field415[var22 - 1][var21 - 1] = 3;
                                                    class751.field10933[var22 - 1][var21 + -1] = var26;
                                                    break;
                                                }
                                                if ((1336147968 & var20[var23 + -1][var24 + -1 - -var31]) != 0 || (1675886592 & var20[var23 - (1 - var31)][var24 + -1]) != 0) {
                                                    break;
                                                }
                                                ++var31;
                                            }
                                        }
                                        if (~var22 > ~(-arg7 + 128) && var21 > 0 && class36.field415[var22 + 1][var21 + -1] == 0 && ~(var20[arg7 + var23][var24 - 1] & 1625554944) == -1) {
                                            int var32 = 1;
                                            while (true) {
                                                if (arg7 <= var32) {
                                                    class282.field4222[var37] = var12 - -1;
                                                    class314.field4967[var37] = var13 + -1;
                                                    class36.field415[var22 - -1][var21 + -1] = 9;
                                                    var37 = 4095 & var37 + 1;
                                                    class751.field10933[var22 + 1][var21 - 1] = var26;
                                                    break;
                                                }
                                                if (~(2028208128 & var20[arg7 + var23][var24 + -1 + var32]) != -1 || (var20[var23 - -var32][var24 + -1] & 1675886592) != 0) {
                                                    break;
                                                }
                                                ++var32;
                                            }
                                        }
                                        if (var22 > 0 && ~(-arg7 + 128) < ~var21 && ~class36.field415[var22 - 1][var21 + 1] == -1 && (1310982144 & var20[var23 + -1][arg7 + var24]) == 0) {
                                            for (int var33 = 1; var33 < arg7; ++var33) {
                                                if ((var20[var23 + -1][var24 - -var33] & 1336147968) != 0 || (var20[var23 + -1 - -var33][arg7 + var24] & 2116288512) != 0) {
                                                    continue label323;
                                                }
                                            }
                                            class282.field4222[var37] = var12 + -1;
                                            class314.field4967[var37] = var13 + 1;
                                            class36.field415[var22 + -1][var21 - -1] = 6;
                                            var37 = 4095 & var37 + 1;
                                            class751.field10933[var22 - 1][var21 + 1] = var26;
                                        }
                                    } while (~var22 <= ~(128 - arg7));
                                } while (var21 >= -arg7 + 128);
                            } while (class36.field415[var22 + 1][var21 - -1] != 0);
                        } while (~(var20[arg7 + var23][arg7 + var24] & 2015625216) != -1);
                        for (int var34 = 1; var34 < arg7; ++var34) {
                            if ((var20[var23 + var34][arg7 + var24] & 2116288512) != 0 || (2028208128 & var20[arg7 + var23][var24 - -var34]) != 0) {
                                continue label346;
                            }
                        }
                        class282.field4222[var37] = var12 - -1;
                        class314.field4967[var37] = var13 - -1;
                        class36.field415[var22 + 1][var21 + 1] = 12;
                        var37 = var37 + 1 & 4095;
                        class751.field10933[var22 - -1][var21 - -1] = var26;
                    }
                }
            }
        } catch (RuntimeException var36) {
            throw class759.method5498(var36, field1262[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1262[1] : field1262[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIIIILsg;ILha;I)V", line = 531)
    public static final void method952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class417 arg8, int arg9, class66 arg10, int arg11) {
        try {
            if (arg2 < arg7 && arg7 < arg2 - -arg3 && arg5 > arg9 + -13 && ~arg5 > ~(arg9 + 3) && arg8.field6142) {
                arg6 = arg4;
            }
            ++field1257;
            int[] var12 = null;
            if (!class83.method713(arg8.field6146, -50)) {
                if (arg8.field6145 != -1) {
                    var12 = class540.field7920.method5000(arg8.field6145, (byte) 126).field7734;
                } else if (!class473.method3592((byte) 125, arg8.field6146)) {
                    if (class31.method207(arg8.field6146, false)) {
                        Object var13 = null;
                        class198 var14;
                        if (~arg8.field6146 == -1004) {
                            var14 = class417.field6144.method3030(arg0, (int) arg8.field6137);
                        } else {
                            var14 = class417.field6144.method3030(0, (int) (2147483647L & arg8.field6137 >>> 32));
                        }
                        if (var14.field3017 != null) {
                            var14 = var14.method1764(class276.field4168, -174);
                        }
                        if (var14 != null) {
                            var12 = var14.field3065;
                        }
                    }
                } else {
                    class383 var15 = (class383) class207.field3184.method977((long) ((int) arg8.field6137), 1);
                    if (var15 != null) {
                        class612 var16 = var15.field5799;
                        class496 var17 = var16.field8947;
                        if (var17.field7110 != null) {
                            var17 = var17.method3742(-1, class276.field4168);
                        }
                        if (var17 != null) {
                            var12 = var17.field7130;
                        }
                    }
                }
            } else {
                var12 = class540.field7920.method5000((int) arg8.field6137, (byte) 118).field7734;
            }
            String var18 = class270.method2237(-68, arg8);
            if (var12 != null) {
                var18 = var18 + class584.method4361(13271, var12);
            }
            class269.field4100.method605(73, var18, class749.field10906, class106.field1221, arg2 + 3, arg0, arg9, arg6);
            if (arg8.field6148) {
                class604.field8852.method4347(arg2 + (5 - -class475.field6895.method4322(256, var18)), arg9 + -12);
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field1262[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field1262[1] : field1262[2]) + ',' + arg9 + ',' + (arg10 != null ? field1262[1] : field1262[2]) + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIBLic;I)V", line = 604)
    public static final void method953(int arg0, int arg1, byte arg2, class726 arg3, int arg4) {
        try {
            ++field1253;
            int var5 = -47 % ((-15 - arg4) / 39);
            int var6 = arg3.field3859[0];
            int var7 = arg3.field3863[0];
            if (var6 >= 0 && class648.field9378 > var6 && ~var7 <= -1 && var7 < class659.field9506) {
                if (~arg0 <= -1 && arg0 < class648.field9378 && arg1 >= 0 && ~arg1 > ~class659.field9506) {
                    int var8 = class377.method3040(var7, class429.field6298[arg3.field6200], arg1, (byte) 79, 0, 0, class660.field9543, arg3.method2101(31463), -4, class85.field953, 0, arg0, 0, true, var6);
                    if (~var8 <= -2) {
                        if (~var8 >= -4) {
                            for (int var9 = 0; var8 + -1 > var9; ++var9) {
                                arg3.method5293(true, arg2, class85.field953[var9], class660.field9543[var9]);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field1262[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1262[1] : field1262[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method954(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method955(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
