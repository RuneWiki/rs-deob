import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class131 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field2293 = 0;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field2299 = -1;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lda;")
    public static class22 field2295;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLsf;IIII)V")
    public static final void method924(byte arg0, class60 arg1, int arg2, int arg3, int arg4, int arg5) {
        field2297++;
        if (arg1.field1112 == -1 && arg1.field1091 == null) {
            return;
        }
        int var6 = 0;
        if (arg1.field1093 < arg3) {
            var6 += arg3 - arg1.field1093;
        } else if (arg3 < arg1.field1100) {
            var6 += arg1.field1100 - arg3;
        }
        if (arg1.field1095 < arg5) {
            var6 += arg5 - arg1.field1095;
        } else if (arg5 < arg1.field1099) {
            var6 += arg1.field1099 - arg5;
        }
        if (arg1.field1106 == 0 || (var6 - 64) > arg1.field1106 || class203.field3379 == 0 || arg1.field1098 != arg4) {
            if (arg1.field1102 != null) {
                class174.field2907.method80(arg1.field1102);
                arg1.field1102 = null;
            }
            if (arg1.field1110 != null) {
                class174.field2907.method80(arg1.field1110);
                arg1.field1110 = null;
            }
            return;
        }
        var6 -= 64;
        int var7 = 11 % ((arg0 + 69) / 39);
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field1106 - var6) * class203.field3379 / arg1.field1106;
        if (arg1.field1102 != null) {
            arg1.field1102.method205(var8);
        } else if (arg1.field1112 >= 0) {
            class218 var9 = class218.method1496(class124.field2181, arg1.field1112, 0);
            if (var9 != null) {
                class107 var10 = var9.method1499().method800(class166.field2818);
                class23 var11 = class23.method201(var10, 100, var8);
                var11.method208(-1);
                class174.field2907.method74(var11);
                arg1.field1102 = var11;
            }
        }
        if (arg1.field1110 != null) {
            arg1.field1110.method205(var8);
            if (arg1.field1110.method269(true)) {
                return;
            }
            arg1.field1110 = null;
        } else if (arg1.field1091 != null && (arg1.field1097 -= arg2) <= 0) {
            int var12 = (int) (Math.random() * (double) arg1.field1091.length);
            class218 var13 = class218.method1496(class124.field2181, arg1.field1091[var12], 0);
            if (var13 != null) {
                class107 var14 = var13.method1499().method800(class166.field2818);
                class23 var15 = class23.method201(var14, 100, var8);
                var15.method208(0);
                class174.field2907.method74(var15);
                arg1.field1110 = var15;
                arg1.field1097 = (int) ((double) (arg1.field1108 - arg1.field1104) * Math.random()) + arg1.field1104;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
    public static final void method925(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 17444) {
            return;
        }
        field2298++;
        class224.field3773 = arg3;
        class100.field1855 = arg4;
        class177.field2953 = arg1;
        class97.field1816 = arg0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI)Lij;")
    public static final class50 method926(int arg0, byte arg1, int arg2) {
        field2294++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return class101.field1859;
        } else if (var3 < -6) {
            return class256.field4458;
        } else {
            if (arg1 <= 12) {
                field2299 = -26;
            }
            if (var3 < -3) {
                return class254.field4396;
            } else if (var3 < 0) {
                return class133.field2318;
            } else if (var3 > 9) {
                return class127.field2227;
            } else if (var3 > 6) {
                return class82.field1486;
            } else if (var3 > 3) {
                return class29.field613;
            } else if (var3 > 0) {
                return class194.field3224;
            } else {
                return class206.field3417;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method927(int arg0) {
        int var1 = -93 / ((arg0 + 27) / 51);
        field2295 = null;
    }
}
