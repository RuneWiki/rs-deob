import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class256 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[Lhf;")
    private class139[] field4212;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field4221 = 0;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[[S")
    public static short[][] field4224 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lqi;")
    public static class131 field4218;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lsi;")
    public static class204 field4217;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Lne;")
    public static final class52 method1808(byte arg0, int arg1) {
        class52 var2 = (class52) class115.field1666.method1553((long) arg1, (byte) -86);
        field4222++;
        if (var2 != null) {
            return var2;
        } else if (arg0 == 17) {
            byte[] var3 = class222.field3562.method643(arg1, 3, false);
            class52 var4 = new class52();
            if (var3 != null) {
                var4.method398(new class152(var3), -32);
            }
            class115.field1666.method1551(var4, 0, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[B)I")
    public static final int method1809(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != 255) {
            method1810((byte) -55);
        }
        field4214++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class268.field4330[(var4 ^ arg3[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Lce;")
    public static final class223 method1810(byte arg0) {
        field4215++;
        if (class161.field2637 < class169.field2725.length) {
            return class169.field2725[class161.field2637++];
        } else {
            if (arg0 > -10) {
                method1815((class86) null, 59, 57, -103);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
    public static final void method1811(int arg0, boolean arg1) {
        field4220++;
        if (class38.field533 == arg0) {
            return;
        }
        if (class38.field533 == 0) {
            class245.method1762(-83);
        }
        if (arg0 == 40) {
            class62.method451(-81);
        }
        if (!arg1) {
            method1808((byte) -120, -100);
        }
        if (arg0 != 40 && class171.field2759 != null) {
            class171.field2759.method728((byte) 109);
            class171.field2759 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class143.field2315 = 0;
            class200.field3211 = 1;
            class264.field4289 = 1;
            class286.field4549 = 0;
            class10.field96 = 0;
            class82.method597(true, -74);
        }
        if (arg0 == 25 || arg0 == 10) {
            class83.method604(-94);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 5) {
            class282.method1930(4, class90.field1337);
        } else {
            class209.method1527(-59);
        }
        boolean var3 = class38.field533 == 5 || class38.field533 == 10 || class38.field533 == 28;
        if (var2 != var3) {
            if (var2) {
                class92.field1372 = class230.field3714;
                if (class241.field3845 == 0) {
                    class59.method425(-125, 2);
                } else {
                    class80.method585(2, class230.field3714, class81.field1173, false, 255, 0, true);
                }
                class280.field4465.method1508(false, 128);
            } else {
                class59.method425(-125, 2);
                class280.field4465.method1508(true, 128);
            }
        }
        class38.field533 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static final void method1812(byte arg0) {
        for (class23 var1 = (class23) class297.field4694.method1384(2); var1 != null; var1 = (class23) class297.field4694.method1388((byte) 85)) {
            if (var1.field272) {
                var1.method169(false);
            }
        }
        field4216++;
        for (class23 var2 = (class23) class178.field2877.method1384(2); var2 != null; var2 = (class23) class178.field2877.method1388((byte) 103)) {
            if (var2.field272) {
                var2.method169(false);
            }
        }
        int var3 = 60 % ((-arg0 - 22) / 37);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1813(int arg0) {
        field4218 = null;
        field4224 = null;
        if (arg0 == 30232) {
            field4217 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)Lef;")
    public static final class221 method1814(int arg0, int arg1, byte arg2) {
        field4211++;
        class221 var3 = new class221();
        if (arg2 < 16) {
            method1813(13);
        }
        for (class222 var4 = (class222) class149.field2425.method1033(-9843); var4 != null; var4 = (class222) class149.field2425.method1031((byte) -7)) {
            if (var4.field3557 && var4.method1592(arg1, (byte) 103, arg0)) {
                var3.method1584(var4, (byte) 125);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Llc;III)Lak;")
    public static final class140 method1815(class86 arg0, int arg1, int arg2, int arg3) {
        field4213++;
        if (class156.method1155(arg2, arg0, 92, arg3)) {
            if (arg1 <= 79) {
                method1810((byte) -7);
            }
            return class156.method1158(-126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
    public class256(int arg0) {
        this.field4212 = new class139[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class139 var3 = this.field4212[var2] = new class139();
            var3.field2250 = var3;
            var3.field2249 = var3;
        }
    }
}
