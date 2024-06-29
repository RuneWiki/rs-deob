import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class86 {

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1299 = null;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Z")
    public static boolean field1301 = false;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "[Z")
    public static boolean[] field1304 = new boolean[5];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljh;IIB)V", line = 10)
    public static final void method587(class207 arg0, int arg1, int arg2, byte arg3) {
        field1302++;
        if (arg0.field3202 == 1) {
            client.field2042++;
            class85.method584(0L, (short) 11, arg0.field3250, (byte) -110, "", 0, arg0.field3256, -1);
        }
        if (arg0.field3202 == 2 && !class120.field1841) {
            String var4 = class71.method510(arg0, -107);
            if (var4 != null) {
                class85.method584(0L, (short) 40, arg0.field3250, (byte) -118, "<col=00ff00>" + arg0.field3136, -1, var4, -1);
                class275.field4231++;
            }
        }
        if (arg0.field3202 == 3) {
            class117.field1816++;
            class85.method584(0L, (short) 48, arg0.field3250, (byte) -109, "", 0, class246.field3855, -1);
        }
        if (arg0.field3202 == 4) {
            class85.method584(0L, (short) 47, arg0.field3250, (byte) -116, "", 0, arg0.field3256, -1);
            class226.field3616++;
        }
        if (arg0.field3202 == 5) {
            class233.field3746++;
            class85.method584(0L, (short) 17, arg0.field3250, (byte) -115, "", 0, arg0.field3256, -1);
        }
        if (arg3 >= -29) {
            method590(51);
        }
        if (arg0.field3202 == 6 && class108.field1674 == null) {
            class85.method584(0L, (short) 10, arg0.field3250, (byte) -118, "", -1, arg0.field3256, -1);
            class298.field4579++;
        }
        if (arg0.field3273 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field3132; var6++) {
                for (int var7 = 0; var7 < arg0.field3264; var7++) {
                    int var8 = (arg0.field3134 + 32) * var7;
                    int var9 = (arg0.field3217 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field3304[var5];
                        var8 += arg0.field3230[var5];
                    }
                    if (var8 <= arg2 && arg1 >= var9 && arg2 < (var8 + 32) && var9 + 32 > arg1) {
                        class7.field72 = var5;
                        class249.field3915 = arg0;
                        if (arg0.field3301[var5] > 0) {
                            class108 var10 = client.method888(arg0);
                            class291 var11 = class160.method1106(arg0.field3301[var5] - 1, 53);
                            if (class81.field1199 == 1 && var10.method737((byte) -53)) {
                                if (class83.field1259 != arg0.field3250 || class203.field3061 != var5) {
                                    class85.method584((long) var11.field4480, (short) 45, arg0.field3250, (byte) -113, field1299 + " -> <col=ff9040>" + var11.field4468, var5, class82.field1217, -1);
                                    class4.field42++;
                                }
                            } else if (class120.field1841 && var10.method737((byte) -27)) {
                                class280 var12 = class133.field2097 == -1 ? null : class27.method209(11, class133.field2097);
                                if ((class310.field4920 & 0x10) != 0 && (var12 == null || var11.method1893(var12.field4315, (byte) -115, class133.field2097) != var12.field4315)) {
                                    class85.method584((long) var11.field4480, (short) 31, arg0.field3250, (byte) -125, class302.field4663 + " -> <col=ff9040>" + var11.field4468, var5, class227.field3638, class139.field2150);
                                    class80.field1183++;
                                }
                            } else {
                                class330.field5108++;
                                String[] var13 = var11.field4431;
                                if (class30.field375) {
                                    var13 = class288.method1876(var13, (byte) 114);
                                }
                                if (var10.method737((byte) -117)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class320.field5011++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 18;
                                            } else {
                                                var15 = 15;
                                            }
                                            class85.method584((long) var11.field4480, var15, arg0.field3250, (byte) -125, "<col=ff9040>" + var11.field4468, var5, var13[var14], -1);
                                        }
                                    }
                                }
                                if (var10.method729(-1)) {
                                    class85.method584((long) var11.field4480, (short) 12, arg0.field3250, (byte) -121, "<col=ff9040>" + var11.field4468, var5, class82.field1217, class165.field2545);
                                    class318.field4993++;
                                }
                                if (var10.method737((byte) -27) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class126.field1971++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 58;
                                            }
                                            if (var16 == 1) {
                                                var17 = 29;
                                            }
                                            if (var16 == 2) {
                                                var17 = 8;
                                            }
                                            class85.method584((long) var11.field4480, var17, arg0.field3250, (byte) -109, "<col=ff9040>" + var11.field4468, var5, var13[var16], -1);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field3268;
                                if (class30.field375) {
                                    var18 = class288.method1876(var18, (byte) 122);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class168.field2574++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 19;
                                            }
                                            if (var19 == 1) {
                                                var20 = 20;
                                            }
                                            if (var19 == 2) {
                                                var20 = 26;
                                            }
                                            if (var19 == 3) {
                                                var20 = 5;
                                            }
                                            if (var19 == 4) {
                                                var20 = 2;
                                            }
                                            class85.method584((long) var11.field4480, var20, arg0.field3250, (byte) -123, "<col=ff9040>" + var11.field4468, var5, var18[var19], -1);
                                        }
                                    }
                                }
                                class85.method584((long) var11.field4480, (short) 1005, arg0.field3250, (byte) -120, "<col=ff9040>" + var11.field4468, var5, class280.field4326, class261.field4044);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field3267) {
            return;
        }
        if (!class120.field1841) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class196.method1325(99, arg0, var21);
                if (var22 != null) {
                    class222.field3525++;
                    class85.method584((long) (var21 + 1), (short) 1001, arg0.field3250, (byte) -122, arg0.field3124, arg0.field3283, var22, class261.method1738(false, arg0, var21));
                }
            }
            String var23 = class71.method510(arg0, -115);
            if (var23 != null) {
                class85.method584(0L, (short) 40, arg0.field3250, (byte) -121, arg0.field3124, arg0.field3283, var23, -1);
                class275.field4231++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class196.method1325(125, arg0, var24);
                if (var25 != null) {
                    class222.field3525++;
                    class85.method584((long) (var24 + 1), (short) 7, arg0.field3250, (byte) -116, arg0.field3124, arg0.field3283, var25, class261.method1738(false, arg0, var24));
                }
            }
            if (client.method888(arg0).method730(true)) {
                class298.field4579++;
                if (arg0.field3205 == null) {
                    class85.method584(0L, (short) 10, arg0.field3250, (byte) -120, "", arg0.field3283, class220.field3498, -1);
                } else {
                    class85.method584(0L, (short) 10, arg0.field3250, (byte) -117, "", arg0.field3283, arg0.field3205, -1);
                }
            }
        } else if (client.method888(arg0).method731(true) && (class310.field4920 & 0x20) != 0) {
            class85.method584(0L, (short) 1, arg0.field3250, (byte) -111, class302.field4663 + " -> " + arg0.field3124, arg0.field3283, class227.field3638, class139.field2150);
            class133.field2092++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 325)
    public static void method588(int arg0) {
        int var1 = -46 % ((47 - arg0) / 54);
        field1304 = null;
        field1299 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I", line = 340)
    public static final int method589(int arg0, int arg1) {
        field1300++;
        if (arg0 < 0) {
            return 0;
        }
        class15 var2 = (class15) class247.field3868.method1558((long) arg0, false);
        if (arg1 != 2656) {
            return 20;
        } else if (var2 == null) {
            return class61.method412(-44, arg0).field967;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field154.length; var4++) {
                if (var2.field154[var4] == -1) {
                    var3++;
                }
            }
            return var3 + (class61.method412(79, arg0).field967 - var2.field154.length);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)I", line = 381)
    public static final int method590(int arg0) {
        field1297++;
        return arg0 == 4 ? 15 : 26;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V", line = 414)
    public static final void method591(int arg0, int arg1, int arg2) {
        field1303++;
        if (arg1 > -115) {
            return;
        }
        class61.field852[arg2] = arg0;
        class36 var3 = (class36) class211.field3345.method1558((long) arg2, false);
        if (var3 == null) {
            class36 var4 = new class36(4611686018427387905L);
            class211.field3345.method1550(var4, (long) arg2, (byte) 73);
        } else if (var3.field454 != 4611686018427387905L) {
            var3.field454 = class195.method1322(123) + 500L | 0x4000000000000000L;
        }
    }
}
