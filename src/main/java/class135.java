import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class135 {

    @OriginalMember(owner = "client!me", name = "i", descriptor = "[S")
    public static short[] field2493 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Ldc;")
    private static class37 field2494 = class185.method1233((byte) 86, "Choose Option");

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field2502 = 0;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field2495 = 0;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Ldc;")
    public static class37 field2486 = class185.method1233((byte) 86, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field2504 = -1;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Ldc;")
    public static class37 field2505 = field2494;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BZ)V")
    public abstract void method933(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Z")
    public static final boolean method934(int arg0, int arg1) {
        field2488++;
        int var2 = 16 / ((arg1 + 58) / 50);
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILwa;I)Lqh;")
    public static final class182 method935(int arg0, class238 arg1, int arg2) {
        field2485++;
        if (arg2 != 0) {
            field2493 = null;
        }
        return class128.method906(arg1, arg0, arg2 ^ 0x3) ? class191.method1273(-92) : null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)[B")
    public abstract byte[] method936(int arg0);

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static final void method937(int arg0) {
        class60.field1112.method93(0);
        class75.field1331.method1183((byte) 126);
        if (arg0 <= 81) {
            method942(null, (byte) -81, -24);
        }
        class205.field3812.method1183((byte) 79);
        field2498++;
        class88.field1530.method1183((byte) -52);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILci;[B)V")
    public static final void method938(int arg0, int arg1, class32 arg2, byte[] arg3) {
        class83 var4 = new class83();
        var4.field1476 = arg3;
        var4.field1066 = arg1;
        var4.field1465 = arg2;
        field2492++;
        var4.field1473 = arg0;
        class203 var5 = class160.field3015;
        synchronized (class160.field3015) {
            class160.field3015.method1340(49, var4);
        }
        class231.method1494((byte) -126);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)Lc;")
    public static final class23 method939(byte arg0, int arg1) {
        if (arg0 <= 87) {
            return null;
        }
        field2499++;
        if (arg1 == 0) {
            return new class113();
        } else if (arg1 == 1) {
            return new class228();
        } else if (arg1 == 2) {
            return new class193();
        } else if (arg1 == 3) {
            return new class61();
        } else if (arg1 == 4) {
            return new class103();
        } else if (arg1 == 5) {
            return new class92();
        } else if (arg1 == 6) {
            return new class245();
        } else if (arg1 == 7) {
            return new class230();
        } else if (arg1 == 8) {
            return new class192();
        } else if (arg1 == 9) {
            return new class157();
        } else if (arg1 == 10) {
            return new class75();
        } else if (arg1 == 11) {
            return new class31();
        } else if (arg1 == 12) {
            return new class161();
        } else if (arg1 == 13) {
            return new class76();
        } else if (arg1 == 14) {
            return new class34();
        } else if (arg1 == 15) {
            return new class242();
        } else if (arg1 == 16) {
            return new class145();
        } else if (arg1 == 17) {
            return new class5();
        } else if (arg1 == 18) {
            return new class211();
        } else if (arg1 == 19) {
            return new class10();
        } else if (arg1 == 20) {
            return new class177();
        } else if (arg1 == 21) {
            return new class155();
        } else if (arg1 == 22) {
            return new class159();
        } else if (arg1 == 23) {
            return new class84();
        } else if (arg1 == 24) {
            return new class56();
        } else if (arg1 == 25) {
            return new class91();
        } else if (arg1 == 26) {
            return new class196();
        } else if (arg1 == 27) {
            return new class95();
        } else if (arg1 == 28) {
            return new class79();
        } else if (arg1 == 29) {
            return new class243();
        } else if (arg1 == 30) {
            return new class227();
        } else if (arg1 == 31) {
            return new class129();
        } else if (arg1 == 32) {
            return new class80();
        } else if (arg1 == 33) {
            return new class199();
        } else if (arg1 == 34) {
            return new class78();
        } else if (arg1 == 35) {
            return new class38();
        } else if (arg1 == 36) {
            return new class195();
        } else if (arg1 == 37) {
            return new class41();
        } else if (arg1 == 38) {
            return new class8();
        } else if (arg1 == 39) {
            return new class151();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public static void method940(int arg0) {
        if (arg0 >= -47) {
            method938(35, 65, null, null);
        }
        field2486 = null;
        field2493 = null;
        field2494 = null;
        field2505 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)Z")
    public static final boolean method941(int arg0, int arg1, int arg2) {
        if (arg0 == 13417) {
            field2500++;
            return (arg1 >> arg2 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lce;BI)Ldc;")
    public static final class37 method942(class28 arg0, byte arg1, int arg2) {
        field2487++;
        try {
            class37 var3 = new class37();
            if (arg1 != -26) {
                field2496 = 90;
            }
            var3.field733 = arg0.method186((byte) 63);
            if (var3.field733 > arg2) {
                var3.field733 = arg2;
            }
            var3.field743 = new byte[var3.field733];
            arg0.field526 += class149.field2816.method1568(var3.field733, var3.field743, 0, arg0.field526, 41, arg0.field502);
            return var3;
        } catch (Exception var4) {
            return class240.field4406;
        }
    }
}
