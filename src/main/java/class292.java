import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class292 {

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public int field4692;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4695 = new String[] { method2493(method2492("\"@,\u0014n")), method2493(method2492("7\u001bnV")), method2493(method2492("4\u0003,\u0006z7\u0007v\u0004;")), method2493(method2492("4\u0003,};")), method2493(method2492("4\u0003,x;")), method2493(method2492("4\u0003,\u007f;")), method2493(method2492("4\u0003,y;")), method2493(method2492("4\u0003,~;")), method2493(method2492("4\u0003,|;")), method2493(method2492("4\u0003,N|\n\u001apS}>F")), method2493(method2492("4\u0003,r;")), method2493(method2492("\r88\u001a")) };

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "[Lom;")
    public static class394[] field4690 = new class394[75];

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Lvn;")
    public static class330 field4694 = new class330(20, 8);

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lrda;)V")
    public static final void method2484(class693 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class693 var2 = null;
            for (class693 var3 = class42.field476[var1]; var3 != null; var3 = var3.field9987) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class42.field476[var1] = var3.field9987;
                    } else {
                        var2.field9987 = var3.field9987;
                    }
                    class540.field7961 = true;
                    return;
                }
                var2 = var3;
            }
            class693 var4 = null;
            for (class693 var5 = class50.field608[var1]; var5 != null; var5 = var5.field9987) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class50.field608[var1] = var5.field9987;
                    } else {
                        var4.field9987 = var5.field9987;
                    }
                    class540.field7961 = true;
                    return;
                }
                var4 = var5;
            }
            class693 var6 = null;
            for (class693 var7 = class570.field8262[var1]; var7 != null; var7 = var7.field9987) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class570.field8262[var1] = var7.field9987;
                    } else {
                        var6.field9987 = var7.field9987;
                    }
                    class540.field7961 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)I")
    public static int method2485(int arg0, int arg1) {
        try {
            return arg0 & arg1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4695[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)I")
    public static final int method2486(int arg0, int arg1) {
        try {
            field4693++;
            return arg0 == 2 ? arg1 >>> 8 : -93;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4695[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([ILip;BI)V")
    public static final void method2487(int[] arg0, class738 arg1, byte arg2, int arg3) {
        try {
            field4687++;
            if (arg1.field1194 != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < arg1.field1194.length; var5++) {
                    if (arg0[var5] != arg1.field1194[var5]) {
                        var4 = false;
                        break;
                    }
                }
                if (var4 && arg1.field1167 != -1) {
                    class210 var6 = class397.field6293.method2058(arg1.field1167, (byte) -28);
                    int var7 = var6.field3338;
                    if (var7 == 1) {
                        arg1.field1164 = 0;
                        arg1.field1119 = 1;
                        arg1.field1131 = 0;
                        arg1.field1186 = arg3;
                        arg1.field1125 = 0;
                        if (!arg1.field1120) {
                            class531.method3967(-74, var6, arg1.field1125, arg1);
                        }
                    }
                    if (var7 == 2) {
                        arg1.field1131 = 0;
                    }
                }
            }
            boolean var8 = true;
            for (int var9 = 0; var9 < arg0.length; var9++) {
                if (arg0[var9] != -1) {
                    var8 = false;
                }
                if (arg1.field1194 == null || arg1.field1194[var9] == -1 || class397.field6293.method2058(arg0[var9], (byte) 120).field3333 >= class397.field6293.method2058(arg1.field1194[var9], (byte) -39).field3333) {
                    arg1.field1194 = arg0;
                    arg1.field1186 = arg3;
                    break;
                }
            }
            if (arg2 != 17) {
                method2487(null, null, (byte) 33, -71);
            }
            if (var8) {
                arg1.field1194 = arg0;
                arg1.field1186 = arg3;
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field4695[4] + (arg0 == null ? field4695[1] : field4695[0]) + ',' + (arg1 == null ? field4695[1] : field4695[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public static final void method2488(byte arg0) {
        try {
            for (class670 var1 = (class670) class700.field10071.method735(0); var1 != null; var1 = (class670) class700.field10071.method734((byte) -50)) {
                if (var1.field9518.method3060(true)) {
                    class650.method4741(var1.field9523, (byte) 106);
                } else {
                    var1.field9518.method1810((byte) -112);
                    try {
                        var1.field9518.method3071(true);
                    } catch (Exception var6) {
                        class622.method4544(var6, field4695[11] + var1.field9523, true);
                        class650.method4741(var1.field9523, (byte) 98);
                    }
                    if (!var1.field9515 && !var1.field9522) {
                        class755 var3 = var1.field9518.method3069((byte) -69);
                        if (var3 != null) {
                            class739 var4 = var3.method5463(-87);
                            if (var4 != null) {
                                var4.method5374(1, var1.field9519);
                                class476.field7253.method2596(var4);
                                var1.field9515 = true;
                            }
                        }
                    }
                }
            }
            field4691++;
            if (arg0 != 32) {
                method2488((byte) -74);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4695[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIBFI[FIIII[F)V")
    public static final void method2489(int arg0, int arg1, byte arg2, float arg3, int arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10) {
        try {
            int var21 = arg1 - arg8;
            int var22 = arg4 - arg0;
            int var23 = arg9 - arg6;
            field4689++;
            float var11 = arg5[2] * (float) var23 + arg5[1] * (float) var21 + arg5[0] * (float) var22;
            float var12 = arg5[5] * (float) var23 + arg5[4] * (float) var21 + arg5[3] * (float) var22;
            float var13 = arg5[8] * (float) var23 + arg5[7] * (float) var21 + arg5[6] * (float) var22;
            float var14 = (float) Math.sqrt((double) (var13 * var13 + var11 * var11 + var12 * var12));
            float var15 = (float) Math.atan2((double) var11, (double) var13) / 6.2831855F + 0.5F;
            float var16 = (float) Math.asin((double) (var12 / var14)) / 3.1415927F + arg3 + 0.5F;
            if (arg7 == 1) {
                float var17 = var15;
                var15 = -var16;
                var16 = var17;
            } else if (arg7 == 2) {
                var15 = -var15;
                var16 = -var16;
            } else if (arg7 == 3) {
                float var18 = var15;
                var15 = var16;
                var16 = -var18;
            }
            arg10[0] = var15;
            arg10[1] = var16;
            if (arg2 != -20) {
                method2488((byte) 0);
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field4695[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field4695[1] : field4695[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field4695[1] : field4695[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
    public static void method2490(int arg0) {
        try {
            field4690 = null;
            int var1 = 63 / ((arg0 - 63) / 57);
            field4694 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4695[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field4686++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4695[9] + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class292(String arg0, int arg1) {
        try {
            this.field4692 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4695[2] + (arg0 == null ? field4695[1] : field4695[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)I")
    public final int method2491(int arg0) {
        try {
            if (arg0 < 23) {
                this.toString();
            }
            field4688++;
            return this.field4692;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4695[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2492(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2493(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
