import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class176 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[J")
    public static long[] field2808 = new long[100];

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    public static int[] field2811 = new int[14];

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2812;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field2814;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2813;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1285(int arg0, String arg1, int arg2) {
        field2809++;
        class449 var3 = class611.method3463(arg0, (byte) -113, arg2);
        var3.method2615((byte) -70);
        var3.field6473 = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBIIIIILr;I)V")
    public static final void method1286(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class98 arg7, int arg8) {
        if (arg1 > -25) {
            return;
        }
        field2812++;
        class394 var9 = (class394) class454.method2636(arg5, arg0, arg6);
        if (var9 != null) {
            class119 var10 = class14.field224.method2834(0, var9.method903(92));
            int var11 = var9.method904(-15140) & 0x3;
            int var12 = var9.method907(false);
            if (var10.field1934 == -1) {
                int var13 = arg2;
                if (var10.field1903 > 0) {
                    var13 = arg3;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg7.method750(arg8, 24708, arg4, 4, var13);
                    } else if (var11 == 1) {
                        arg7.method773(arg8, 128, 4, var13, arg4);
                    } else if (var11 == 2) {
                        arg7.method750(arg8, 24708, arg4 + 3, 4, var13);
                    } else if (var11 == 3) {
                        arg7.method773(arg8 + 3, 128, 4, var13, arg4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg7.method792(1, (byte) -88, 1, arg8, var13, arg4);
                    } else if (var11 == 1) {
                        arg7.method792(1, (byte) -88, 1, arg8, var13, arg4 + 3);
                    } else if (var11 == 2) {
                        arg7.method792(1, (byte) -88, 1, arg8 + 3, var13, arg4 + 3);
                    } else if (var11 == 3) {
                        arg7.method792(1, (byte) -88, 1, arg8 + 3, var13, arg4);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg7.method773(arg8, 128, 4, var13, arg4);
                    } else if (var11 == 1) {
                        arg7.method750(arg8, 24708, arg4 + 3, 4, var13);
                    } else if (var11 == 2) {
                        arg7.method773(arg8 + 3, 128, 4, var13, arg4);
                    } else if (var11 == 3) {
                        arg7.method750(arg8, 24708, arg4, 4, var13);
                    }
                }
            } else {
                class289.method1769(arg8, arg7, arg4, var11, var10, 0);
            }
        }
        class394 var14 = (class394) class31.method286(arg5, arg0, arg6, field2814 == null ? (field2814 = method1289("sw")) : field2814);
        if (var14 != null) {
            class119 var15 = class14.field224.method2834(0, var14.method903(115));
            int var16 = var14.method904(-15140) & 0x3;
            int var17 = var14.method907(false);
            if (var15.field1934 != -1) {
                class289.method1769(arg8, arg7, arg4, var16, var15, 0);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field1903 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg7.method813(arg4 + 3, var18, arg8 + 3, 99, arg8, arg4);
                } else {
                    arg7.method813(arg4 + 3, var18, arg8, 88, arg8 + 3, arg4);
                }
            }
        }
        class394 var19 = (class394) class415.method2469(arg5, arg0, arg6);
        if (var19 == null) {
            return;
        }
        class119 var20 = class14.field224.method2834(0, var19.method903(81));
        int var21 = var19.method904(-15140) & 0x3;
        if (var20.field1934 != -1) {
            class289.method1769(arg8, arg7, arg4, var21, var20, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1287(int arg0, int arg1, byte arg2) {
        int var3 = -8 % ((arg2 - 73) / 36);
        field2810++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method1288(int arg0) {
        field2808 = null;
        int var1 = 31 % ((42 - arg0) / 39);
        field2811 = null;
        field2813 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1289(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
