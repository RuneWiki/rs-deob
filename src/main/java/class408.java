import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class408 {

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field6085 = 0;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "Lvg;")
    public static class622 field6078 = new class622(93, 6);

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "Z")
    public static boolean field6089 = false;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "Z")
    public static boolean field6088 = false;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "[B")
    public byte[] field6087;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "[S")
    public short[] field6080;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "[S")
    public short[] field6082;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "[S")
    public short[] field6083;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method2501(String arg0, byte arg1, int arg2) {
        field6077++;
        class549.method3206(0);
        class221.method1389((byte) -33);
        class189.method1249((byte) 66);
        if (arg1 < 5) {
            method2505(45, -104, -71, (byte) 118);
        }
        class4.method14(arg2, 25474, arg0);
        class4.method12(false);
        class584.method3346(class332.field4821, (byte) 125);
        class502.method2862(class332.field4821, -109);
        class27.method176(class595.field8616, class332.field4821, (byte) -83);
        class565.method3259(-28871);
        class339.method2097((byte) -124, class97.field1481);
        class12.method83((byte) -57);
        class614.method3500(-120);
        if (class264.field3451 == 3) {
            class322.method2003(0, 4);
        } else if (class264.field3451 == 7) {
            class322.method2003(0, 8);
        } else if (class264.field3451 == 10) {
            class322.method2003(0, 11);
        } else if (class264.field3451 == 1 || class264.field3451 == 2) {
            class197.method1291(1760);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public static void method2502(int arg0) {
        if (arg0 != -36056599) {
            field6088 = false;
        }
        field6078 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBI[IIIII)Z")
    public static final boolean method2503(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 105 / ((arg1 - 10) / 36);
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg0 > class76.field1228) {
            arg0 = class76.field1228;
        }
        field6081++;
        if (arg0 <= arg2) {
            return true;
        }
        int var9 = arg2 + arg4 - 1;
        int var10 = arg0 - arg2 >> 2;
        int var11 = arg2 * arg5 + arg7;
        if (class432.field6277 == 1) {
            class56.field890 += var10;
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var17 = arg0 - arg2 & 0x3;
                    while (true) {
                        var17--;
                        if (var17 < 0) {
                            return true;
                        }
                        var9++;
                        if (arg3[var9] > var11) {
                            arg3[var9] = var11;
                        }
                        var11 += arg5;
                    }
                }
                var9++;
                if (var11 < arg3[var9]) {
                    arg3[var9] = var11;
                }
                int var18 = arg5 + var11;
                var9++;
                if (arg3[var9] > var18) {
                    arg3[var9] = var18;
                }
                int var19 = arg5 + var18;
                var9++;
                if (arg3[var9] > var19) {
                    arg3[var9] = var19;
                }
                int var20 = arg5 + var19;
                var9++;
                if (arg3[var9] > var20) {
                    arg3[var9] = var20;
                }
                var11 = arg5 + var20;
            }
        } else {
            int var12 = var11 - 38400;
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var13 = arg0 - arg2 & 0x3;
                    while (true) {
                        var13--;
                        if (var13 < 0) {
                            return true;
                        }
                        var9++;
                        if (arg3[var9] > var12) {
                            return false;
                        }
                        var12 += arg5;
                    }
                }
                var9++;
                if (arg3[var9] > var12) {
                    return false;
                }
                int var14 = arg5 + var12;
                var9++;
                if (arg3[var9] > var14) {
                    return false;
                }
                int var15 = arg5 + var14;
                var9++;
                if (var15 < arg3[var9]) {
                    return false;
                }
                int var16 = arg5 + var15;
                var9++;
                if (var16 < arg3[var9]) {
                    return false;
                }
                var12 = arg5 + var16;
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2504(String arg0, int arg1, String arg2, int arg3, int arg4, String arg5, String arg6, String arg7, int arg8) {
        field6084++;
        class154 var9 = class401.field6039[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class401.field6039[var10] = class401.field6039[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class154(arg4, arg1, arg7, arg2, arg0, arg6, arg3, arg5);
        } else {
            var9.method1097(arg3, arg4, (byte) -2, arg7, arg5, arg0, arg6, arg2, arg1);
        }
        class432.field6270 = class351.field5215;
        class394.field5963++;
        class401.field6039[arg8] = var9;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIB)V")
    public static final void method2505(int arg0, int arg1, int arg2, byte arg3) {
        field6086++;
        int var4 = arg2 + class397.field6005;
        int var5 = arg1 + class403.field6049;
        if (class603.field8695 == null || arg2 < 0 || arg1 < 0 || class72.field1144 <= arg2 || arg1 >= class668.field9444 || !class335.field4872.method3439(class62.field996, false) && class321.field4681.field7905 != arg0) {
            return;
        }
        long var6 = (long) (var4 | arg0 << 28 | var5 << 14);
        class668 var8 = (class668) class86.field1336.method2002((byte) -109, var6);
        if (var8 == null) {
            class47.method278(arg0, arg2, arg1);
            return;
        }
        class678 var9 = (class678) var8.field9445.method1904(false);
        if (var9 == null) {
            class47.method278(arg0, arg2, arg1);
            return;
        }
        if (arg3 < 28) {
            method2502(-41);
        }
        class417 var10 = (class417) class47.method278(arg0, arg2, arg1);
        if (var10 == null) {
            var10 = new class417(arg2 << 9, class178.field2480[arg0].method3822(arg1, arg2, 0), arg1 << 9, arg0, arg0);
        } else {
            var10.field6160 = var10.field6165 = -1;
        }
        var10.field6156 = var9.field9594;
        var10.field6173 = var9.field9595;
        label61: while (true) {
            class678 var11 = (class678) var8.field9445.method1901(123);
            if (var11 == null) {
                break;
            }
            if (var10.field6156 != var11.field9594) {
                var10.field6160 = var11.field9594;
                var10.field6155 = var11.field9595;
                while (true) {
                    class678 var12 = (class678) var8.field9445.method1901(105);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field6156 != var12.field9594 && var10.field6160 != var12.field9594) {
                        var10.field6165 = var12.field9594;
                        var10.field6168 = var12.field9595;
                    }
                }
            }
        }
        int var13 = class504.method2870((byte) -128, (arg1 << 9) + 256, (arg2 << 9) + 256, arg0);
        var10.field7905 = (byte) arg0;
        var10.field6176 = 0;
        var10.field7900 = (byte) arg0;
        var10.field7895 = arg2 << 9;
        var10.field7894 = var13;
        var10.field7896 = arg1 << 9;
        if (class125.method898(98, arg2, arg1)) {
            var10.field7900++;
        }
        class621.method3580(arg0, arg2, arg1, var13, var10);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method2506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6079++;
        if (arg5 != 4005) {
            method2506(108, 19, 35, -12, 36, 107, 54, 122, 3);
        }
        if ((arg6 + arg8) > arg0 && arg6 < arg0 + arg2) {
            return arg7 < (arg3 + arg4) && arg3 < arg1 + arg7;
        } else {
            return false;
        }
    }
}
