import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class318 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lna;")
    public static class26 field5439 = class69.method505("Shift)2click ENABLED(Q", (byte) -120);

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lna;")
    public static class26 field5441 = class69.method505("Cache:", (byte) -125);

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[[S")
    public static short[][] field5440 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Z")
    public static boolean field5443 = false;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lbe;")
    public static class297 field5445;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIILth;IJZ)Z", line = 3)
    public static final boolean method2207(int arg0, int arg1, int arg2, int arg3, int arg4, class86 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class95.method715(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 38)
    public static void method2208(int arg0) {
        field5445 = null;
        if (arg0 != 5157) {
            field5439 = (class26) null;
        }
        field5441 = null;
        field5439 = null;
        field5440 = (short[][]) null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILbe;)V", line = 51)
    public static final void method2209(int arg0, class297 arg1) {
        if (class323.field5553 == arg1.field5007) {
            class2.field21[arg1.field5103] = true;
        }
        int var2 = -100 / ((arg0 - 55) / 52);
        field5444++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIILmj;)V", line = 110)
    public static final void method2210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class228 arg6) {
        field5438++;
        boolean var7 = true;
        long var8 = 0L;
        if (arg4 == 0) {
            var8 = class107.method760(arg3, arg2, arg1);
        } else if (arg4 == 1) {
            var8 = class295.method2075(arg3, arg2, arg1);
        } else if (arg4 == 2) {
            var8 = class132.method890(arg3, arg2, arg1);
        } else if (arg4 == 3) {
            var8 = class55.method403(arg3, arg2, arg1);
        }
        boolean var10 = false;
        int var11 = ((int) var8 & 0x7EBD8) >> 14;
        if (arg0 >= -94) {
            return;
        }
        boolean var12 = false;
        int var13 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
        class78 var14 = class104.method750(4, var13);
        if (var14.method557(28933)) {
            class319.method2212(arg2, var14, (byte) -73, arg1, arg3);
        }
        int var15 = ((int) var8 & 0x3EB4AC) >> 20;
        if (var8 == 0L) {
            return;
        }
        class86 var16 = null;
        class86 var17 = null;
        if (arg4 == 0) {
            class267 var18 = class32.method251(arg3, arg2, arg1);
            if (var18 != null) {
                var16 = var18.field4409;
                var17 = var18.field4412;
            }
            if (var14.field1239 != 0) {
                arg6.method1520(var15, var14.field1179, -104, arg1, var11, arg2);
            }
        } else if (arg4 == 1) {
            class164 var21 = class160.method1090(arg3, arg2, arg1);
            if (var21 != null) {
                var16 = var21.field2550;
                var17 = var21.field2544;
            }
        } else if (arg4 == 2) {
            class39 var19 = class211.method1412(arg3, arg2, arg1);
            if (var19 != null) {
                var16 = var19.field632;
            }
            if (var14.field1239 != 0 && var14.field1171 + arg2 < 104 && (var14.field1171 + arg1) < 104 && var14.field1178 + arg2 < 104 && (var14.field1178 + arg1) < 104) {
                arg6.method1537(20851, arg2, var14.field1171, var14.field1179, var15, var14.field1178, arg1);
            }
        } else if (arg4 == 3) {
            class137 var20 = class80.method569(arg3, arg2, arg1);
            if (var20 != null) {
                var16 = var20.field2095;
            }
            if (var14.field1239 == 1) {
                arg6.method1534(arg1, (byte) -73, arg2);
            }
        }
        if (!class255.field4184 || !var14.field1196) {
            return;
        }
        if (var11 == 2) {
            if (var16 instanceof class109) {
                ((class109) var16).method772(-1);
            } else {
                class321.method2233(var14, (byte) -76, 0, var15 + 4, 0, var11, arg2, arg1, arg5);
            }
            if (var17 instanceof class109) {
                ((class109) var17).method772(-1);
            } else {
                class321.method2233(var14, (byte) -100, 0, var15 + 1 & 0x3, 0, var11, arg2, arg1, arg5);
            }
        } else if (var11 == 5) {
            if (var16 instanceof class109) {
                ((class109) var16).method772(-1);
            } else {
                class321.method2233(var14, (byte) -119, class293.field4879[var15] * 8, var15, class236.field3738[var15] * 8, 4, arg2, arg1, arg5);
            }
        } else if (var11 == 6) {
            if (var16 instanceof class109) {
                ((class109) var16).method772(-1);
            } else {
                class321.method2233(var14, (byte) -28, class59.field964[var15] * 8, var15 + 4, class283.field4740[var15] * 8, 4, arg2, arg1, arg5);
            }
        } else if (var11 == 7) {
            if (var16 instanceof class109) {
                ((class109) var16).method772(-1);
            } else {
                class321.method2233(var14, (byte) -120, 0, (var15 + 2 & 0x3) + 4, 0, 4, arg2, arg1, arg5);
            }
        } else if (var11 == 8) {
            if ((var16 instanceof class109)) {
                ((class109) var16).method772(-1);
            } else {
                class321.method2233(var14, (byte) -45, class59.field964[var15] * 8, var15 + 4, class283.field4740[var15] * 8, 4, arg2, arg1, arg5);
            }
            if (var17 instanceof class109) {
                ((class109) var17).method772(-1);
            } else {
                class321.method2233(var14, (byte) -24, class59.field964[var15] * 8, (var15 + 2 & 0x3) + 4, class283.field4740[var15] * 8, 4, arg2, arg1, arg5);
            }
        } else if (var11 == 11) {
            if (var16 instanceof class109) {
                ((class109) var16).method772(-1);
            } else {
                class321.method2233(var14, (byte) -115, 0, var15 + 4, 0, 10, arg2, arg1, arg5);
            }
        } else if (var16 instanceof class109) {
            ((class109) var16).method772(-1);
        } else {
            class321.method2233(var14, (byte) -113, 0, var15, 0, var11, arg2, arg1, arg5);
        }
    }
}
