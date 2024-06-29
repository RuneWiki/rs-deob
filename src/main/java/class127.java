import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class127 {

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2088 = 0;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Ltl;")
    private static class59 field2085 = class85.method639("Allocating memory", 9588);

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "Ltl;")
    public static class59 field2090 = class85.method639("Okay", 9588);

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Ltl;")
    public static class59 field2089 = field2085;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIBI)I", line = 4)
    public static final int method931(int arg0, int arg1, byte arg2, int arg3) {
        field2082++;
        if (arg0 == arg1) {
            return arg0;
        }
        int var4 = 128 - arg3;
        int var5 = ((-16711936 & arg0) >>> 7) * var4 + ((arg1 & -16711936) >>> 7) * arg3 & 0xFF00FF00;
        if (arg2 == 28) {
            int var6 = (arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg3 & 0xFF00FF00;
            return (var6 >> 7) + var5;
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Lli;", line = 26)
    public static final class85 method932(int arg0, int arg1) {
        class85 var2 = (class85) class145.field2373.method1006((long) arg0, 1);
        field2083++;
        if (arg1 != 24058) {
            return (class85) null;
        } else if (var2 == null) {
            byte[] var3;
            if (arg0 < 32768) {
                var3 = class71.field1102.method2042(0, arg0, (byte) -125);
            } else {
                var3 = class189.field3170.method2042(0, arg0 & 0x7FFF, (byte) -123);
            }
            class85 var4 = new class85();
            if (var3 != null) {
                var4.method638(new class170(var3), -1);
            }
            if (arg0 >= 32768) {
                var4.method634((byte) 72);
            }
            class145.field2373.method1008(var4, (long) arg0, 0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 63)
    public static void method933(int arg0) {
        field2085 = null;
        field2090 = null;
        if (arg0 != -8657) {
            method936(-127, 43, (class263) null);
        }
        field2089 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLs;)V", line = 79)
    public static final void method934(byte arg0, class170 arg1) {
        field2081++;
        if ((arg1.field2758.length - arg1.field2787) < 1) {
            return;
        }
        int var2 = arg1.method1221(91);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg1.field2758.length - arg1.field2787) < var3) {
            return;
        }
        class128.field2092 = arg1.method1221(118);
        if (class128.field2092 < 1) {
            class128.field2092 = 1;
        } else if (class128.field2092 > 4) {
            class128.field2092 = 4;
        }
        class20.method135(arg1.method1221(71) == 1, 14304);
        class228.field3683 = arg1.method1221(98) == 1;
        class198.field3288 = arg1.method1221(81) == 1;
        class131.field2163 = arg1.method1221(77) == 1;
        class300.field5124 = arg1.method1221(71) == 1;
        class94.field1452 = arg1.method1221(75) == 1;
        class67.field1036 = arg1.method1221(98) == 1;
        class266.field4584 = arg1.method1221(115) == 1;
        class268.field4658 = arg1.method1221(91);
        if (class268.field4658 > 2) {
            class268.field4658 = 2;
        }
        if (var2 < 2) {
            class308.field5243 = arg1.method1221(74) == 1;
            arg1.method1221(74);
        } else {
            class308.field5243 = arg1.method1221(108) == 1;
        }
        class193.field3216 = arg1.method1221(102) == 1;
        class148.field2429 = arg1.method1221(127) == 1;
        class227.field3666 = arg1.method1221(127);
        if (class227.field3666 > 2) {
            class227.field3666 = 2;
        }
        class146.field2386 = arg1.method1221(114) == 1;
        class228.field3686 = arg1.method1221(99);
        if (class228.field3686 > 127) {
            class228.field3686 = 127;
        }
        class99.field1600 = arg1.method1221(94);
        class191.field3198 = arg1.method1221(95);
        if (class191.field3198 > 127) {
            class191.field3198 = 127;
        }
        if (var2 >= 1) {
            class308.field5207 = arg1.method1214(-18254);
            class81.field1283 = arg1.method1214(-18254);
        }
        int var4 = -53 / ((arg0 + 4) / 59);
        if (var2 >= 3 && var2 < 6) {
            arg1.method1221(91);
        }
        if (var2 >= 4) {
            arg1.method1221(104);
        }
        if (var2 >= 5) {
            class303.field5158 = arg1.method1233((byte) -77);
        }
        if (var2 >= 6) {
            class262.field4362 = arg1.method1221(95);
        }
        if (var2 >= 7) {
            class184.field3078 = arg1.method1221(105) == 1;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lme;II)Lhi;", line = 209)
    public static final class189 method935(class295 arg0, int arg1, int arg2) {
        field2086++;
        if (class96.method727(arg2, (byte) -17, arg0)) {
            if (arg1 != -7) {
                method934((byte) 118, (class170) null);
            }
            return class314.method2165(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILma;)Ltl;", line = 233)
    public static final class59 method936(int arg0, int arg1, class263 arg2) {
        int var3 = -57 / ((-arg0 - 69) / 41);
        field2084++;
        if (!class44.method314(client.method278(arg2), arg1, 1) && arg2.field4480 == null) {
            return null;
        } else if (arg2.field4403 == null || arg1 >= arg2.field4403.length || arg2.field4403[arg1] == null || arg2.field4403[arg1].method452(255).method495(-127) == 0) {
            return class39.field592 ? class233.method1630(new class59[] { class59.field875, class81.method619((byte) -67, arg1) }, -2883) : null;
        } else {
            return arg2.field4403[arg1];
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 254)
    public static final void method937(byte arg0) {
        class9.field123.method1482((byte) 30);
        class124.field2053.method1482((byte) 30);
        field2091++;
        if (arg0 != 65) {
            field2090 = (class59) null;
        }
    }
}
