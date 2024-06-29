import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class158 {

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lid;")
    public static class92 field3040 = new class92(64);

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Li;")
    public static class88 field3047 = class208.method1425(105, "p12_full");

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Li;")
    private static class88 field3042 = class208.method1425(105, "Attack");

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Li;")
    public static class88 field3043 = field3042;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Li;")
    private static class88 field3049 = class208.method1425(105, "Ok");

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Li;")
    public static class88 field3045 = field3049;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Li;")
    public static class88 field3050 = class208.method1425(105, "Einloggen");

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static volatile int field3046 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Lnb;")
    public static class144 field3041;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIII)V")
    public static final void method1066(boolean arg0, int arg1, int arg2, int arg3) {
        class174 var4 = class36.method238(arg3, arg1, arg0);
        if (var4 != null && var4.field3449 != null) {
            class39 var5 = new class39();
            var5.field678 = var4;
            var5.field681 = var4.field3449;
            class200.method1375(var5, -876775538);
        }
        class10.field145 = arg0;
        client.field569 = arg3;
        class115.field2086 = arg2;
        field3039++;
        class16.field249 = arg1;
        class200.method1373(65280, var4);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method1067(int arg0) {
        field3043 = null;
        field3047 = null;
        field3042 = null;
        field3040 = null;
        field3049 = null;
        field3045 = null;
        field3050 = null;
        if (arg0 == -28116) {
            field3041 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)I")
    public static final int method1068(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        field3038++;
        if (arg0 != -22364) {
            method1067(51);
        }
        return (arg3 >> 5 << 7) + (arg1 >> 2 << 10) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIZ)I")
    public static final int method1069(boolean arg0, int arg1, boolean arg2) {
        int var3 = arg1;
        field3048++;
        if (arg0) {
            var3 = class208.field3945 + class203.field3878 + arg1;
        }
        if (arg2) {
            var3 += class231.field4335 + class220.field4159;
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
    public static final void method1070(int arg0, int arg1) {
        field3044++;
        class127.method869((byte) 127);
        class8.method44((byte) 78);
        int var2 = class106.method734(arg1, (byte) -104).field4290;
        if (arg0 != 64) {
            field3043 = null;
        }
        if (var2 == 0) {
            return;
        }
        int var3 = class113.field2052[arg1];
        if (var2 == 1) {
            class175.field3530 = var3;
            if (class175.field3530 == 1) {
                class173.method1226(0.9F);
            }
            if (class175.field3530 == 2) {
                class173.method1226(0.8F);
            }
            if (class175.field3530 == 3) {
                class173.method1226(0.7F);
            }
            if (class175.field3530 == 4) {
                class173.method1226(0.6F);
            }
            class204.method1401((byte) -97);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class65.field1183 != var4) {
                if (class65.field1183 == 0 && class2.field25 != -1) {
                    class53.method388(0, class99.field1816, (byte) -124, false, class2.field25, var4);
                    class110.field2014 = false;
                } else if (var4 == 0) {
                    class1.method5(31818);
                    class110.field2014 = false;
                } else {
                    class103.method714(arg0 - 186, var4);
                }
                class65.field1183 = var4;
            }
        }
        if (var2 == 6) {
            class137.field2550 = var3;
        }
        if (var2 == 9) {
            class155.field2993 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class119.field2174 = 127;
            }
            if (var3 == 1) {
                class119.field2174 = 96;
            }
            if (var3 == 2) {
                class119.field2174 = 64;
            }
            if (var3 == 3) {
                class119.field2174 = 32;
            }
            if (var3 == 4) {
                class119.field2174 = 0;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class223.field4213 = 127;
            }
            if (var3 == 1) {
                class223.field4213 = 96;
            }
            if (var3 == 2) {
                class223.field4213 = 64;
            }
            if (var3 == 3) {
                class223.field4213 = 32;
            }
            if (var3 == 4) {
                class223.field4213 = 0;
            }
        }
        if (var2 == 5) {
            class203.field3861 = var3;
        }
    }
}
