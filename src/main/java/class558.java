import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class558 extends class244 {

    @OriginalMember(owner = "client!pt", name = "X", descriptor = "[Ljava/lang/String;")
    private static final String[] field8132 = new String[] { method4116(method4115("pe1K")), method4116(method4115("ndsa3")), method4116(method4115("e>s\tf")), method4116(method4115("ndsc3")), method4116(method4115(">,>Hw#v;A}xvc\u0019")), method4116(method4115("ndse3")), method4116(method4115("ndsf3")) };

    @OriginalMember(owner = "client!pt", name = "S", descriptor = "Z")
    public static boolean field8130 = false;

    @OriginalMember(owner = "client!pt", name = "U", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!pt", name = "W", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!pt", name = "V", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!pt", name = "T", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Luo;I)Ljava/lang/String;", line = 3)
    public static final String method4112(class603 arg0, int arg1) {
        try {
            if (arg1 != 256) {
                field8130 = false;
            }
            ++field8131;
            return arg0.field8710 + field8132[4];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8132[3] + (arg0 != null ? field8132[2] : field8132[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLhga;Lhga;)V", line = 15)
    public static final void method4113(byte arg0, class182 arg1, class182 arg2) {
        try {
            if (arg2.field2895 != null) {
                arg2.method1715(-20685);
            }
            if (arg0 == 29) {
                ++field8129;
                arg2.field2895 = arg1.field2895;
                arg2.field2896 = arg1;
                arg2.field2895.field2896 = arg2;
                arg2.field2896.field2895 = arg2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8132[6] + arg0 + ',' + (arg1 != null ? field8132[2] : field8132[0]) + ',' + (arg2 != null ? field8132[2] : field8132[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BIIILffa;I)V", line = 36)
    public static final void method4114(byte arg0, int arg1, int arg2, int arg3, class195 arg4, int arg5) {
        try {
            ++field8128;
            if (arg4.field3103 != -1 || arg4.field3083 != null) {
                int var6 = 0;
                int var7 = arg4.field3096 * class623.field8996.field6367.method4796(true) >> 8;
                if (arg1 > arg4.field3109) {
                    var6 += -arg4.field3109 + arg1;
                } else if (~arg1 > ~arg4.field3094) {
                    var6 += arg4.field3094 - arg1;
                }
                if (arg5 <= arg4.field3082) {
                    if (~arg5 > ~arg4.field3110) {
                        var6 += -arg5 + arg4.field3110;
                    }
                } else {
                    var6 += arg5 - arg4.field3082;
                }
                if (~arg4.field3099 != -1 && arg4.field3099 >= var6 + -256 && class623.field8996.field6367.method4796(true) != 0 && arg4.field3097 == arg2) {
                    var6 -= 256;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    int var8 = -arg4.field3095 + arg4.field3099;
                    if (var8 < 0) {
                        var8 = arg4.field3099;
                    }
                    int var9 = var7;
                    int var10 = var6 - arg4.field3095;
                    if (arg0 < 62) {
                        method4114((byte) 18, 12, -15, 30, (class195) null, 29);
                    }
                    if (~var10 < -1 && var8 > 0) {
                        var9 = (-var10 + var8) * var7 / var8;
                    }
                    class438.field6846.method804(true);
                    int var11 = 8192;
                    int var12 = (arg4.field3109 + arg4.field3094) / 2 - arg1;
                    int var13 = (arg4.field3110 + arg4.field3082) / 2 + -arg5;
                    if (var12 != 0 || ~var13 != -1) {
                        int var14 = -4096 + (-class728.field10661 - (int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D)) & 16383;
                        if (var14 > 8192) {
                            var14 = -var14 + 16384;
                        }
                        int var15;
                        if (var6 <= 0) {
                            var15 = 8192;
                        } else if (~var6 > -4097) {
                            var15 = 8192 - -(var6 * 8192 / 4096);
                        } else {
                            var15 = 16384;
                        }
                        var11 = (-var15 + 16384 >> 1) + var14 * var15 / 8192;
                    }
                    if (arg4.field3081 != null) {
                        arg4.field3081.method4899(var9);
                        arg4.field3081.method4916(var11);
                    } else if (~arg4.field3103 <= -1) {
                        int var16 = arg4.field3092 == 256 && arg4.field3107 == 256 ? 256 : class287.method2430((byte) 71, arg4.field3107, arg4.field3092);
                        if (!arg4.field3088) {
                            class602 var17 = class602.method4411(class551.field8080, arg4.field3103, 0);
                            if (var17 != null) {
                                class357 var18 = var17.method4410().method2957(class275.field4407);
                                class675 var19 = class675.method4913(var18, var16, var9 << 6, var11);
                                var19.method4909(-1);
                                class476.field7253.method2596(var19);
                                arg4.field3081 = var19;
                            }
                        } else {
                            if (arg4.field3080 == null) {
                                arg4.field3080 = class306.method2633(class289.field4651, arg4.field3103);
                            }
                            if (arg4.field3080 != null) {
                                if (arg4.field3104 == null) {
                                    arg4.field3104 = arg4.field3080.method2631(new int[] { 22050 });
                                }
                                if (arg4.field3104 != null) {
                                    class675 var20 = class675.method4913(arg4.field3104, var16, var9 << 6, var11);
                                    var20.method4909(-1);
                                    class476.field7253.method2596(var20);
                                    arg4.field3081 = var20;
                                }
                            }
                        }
                    }
                    if (arg4.field3101 != null) {
                        arg4.field3101.method4899(var9);
                        arg4.field3101.method4916(var11);
                        if (!arg4.field3101.method4170(-116)) {
                            arg4.field3101 = null;
                            arg4.field3084 = null;
                            arg4.field3090 = null;
                        }
                    } else {
                        if (arg4.field3083 != null && ~(arg4.field3111 -= arg3) >= -1) {
                            int var21 = arg4.field3092 == 256 && ~arg4.field3107 == -257 ? 256 : (int) ((double) (-arg4.field3107 + arg4.field3092) * Math.random()) + arg4.field3107;
                            if (arg4.field3098) {
                                if (arg4.field3084 == null) {
                                    int var22 = (int) (Math.random() * (double) arg4.field3083.length);
                                    arg4.field3084 = class306.method2633(class289.field4651, arg4.field3083[var22]);
                                }
                                if (arg4.field3084 != null) {
                                    if (arg4.field3090 == null) {
                                        arg4.field3090 = arg4.field3084.method2631(new int[] { 22050 });
                                    }
                                    if (arg4.field3090 != null) {
                                        class675 var23 = class675.method4913(arg4.field3090, var21, var9 << 6, var11);
                                        var23.method4909(0);
                                        class476.field7253.method2596(var23);
                                        arg4.field3101 = var23;
                                        arg4.field3111 = arg4.field3105 + (int) (Math.random() * (double) (-arg4.field3105 + arg4.field3100));
                                        return;
                                    }
                                }
                                return;
                            }
                            int var24 = (int) ((double) arg4.field3083.length * Math.random());
                            class602 var25 = class602.method4411(class551.field8080, arg4.field3083[var24], 0);
                            if (var25 != null) {
                                class357 var26 = var25.method4410().method2957(class275.field4407);
                                class675 var27 = class675.method4913(var26, var21, var9 << 6, var11);
                                var27.method4909(0);
                                class476.field7253.method2596(var27);
                                arg4.field3101 = var27;
                                arg4.field3111 = arg4.field3105 + (int) ((double) (arg4.field3100 - arg4.field3105) * Math.random());
                                return;
                            }
                        }
                    }
                } else {
                    if (arg4.field3081 != null) {
                        class476.field7253.method2594(arg4.field3081);
                        arg4.field3080 = null;
                        arg4.field3081 = null;
                        arg4.field3104 = null;
                    }
                    if (arg4.field3101 != null) {
                        class476.field7253.method2594(arg4.field3101);
                        arg4.field3101 = null;
                        arg4.field3084 = null;
                        arg4.field3090 = null;
                    }
                }
            }
        } catch (RuntimeException var29) {
            throw class590.method4333(var29, field8132[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8132[2] : field8132[0]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)[[I", line = 308)
    public final int[][] method122(int arg0, int arg1) {
        try {
            if (arg0 != -3093) {
                return null;
            } else {
                ++field8127;
                int[][] var3 = super.field3599.method1580(arg1, (byte) -51);
                if (super.field3599.field2743 && this.method2106((byte) 39)) {
                    int[] var4 = var3[0];
                    int[] var5 = var3[1];
                    int[] var6 = var3[2];
                    int var7 = arg1 % super.field3760 * super.field3760;
                    for (int var8 = 0; var8 < class449.field6969; ++var8) {
                        int var9 = super.field3761[var8 % super.field3763 + var7];
                        var6[var8] = class292.method2485(4080, var9 << 4);
                        var5[var8] = class292.method2485(65280, var9) >> 4;
                        var4[var8] = class292.method2485(var9 >> 12, 4080);
                    }
                }
                return var3;
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field8132[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4115(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4116(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
