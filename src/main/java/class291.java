import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class291 {

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field4568 = 0;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lan;")
    public static class337 field4564 = new class337();

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field4570 = 0;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field4571 = 0;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Ldh;")
    public static class179 field4573 = new class179(50);

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[I")
    public static int[] field4575 = new int[14];

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Z")
    public static boolean field4572;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILlc;Llc;)I", line = 4)
    public static final int method2071(int arg0, class175 arg1, class175 arg2) {
        field4567++;
        int var3 = 0;
        if (arg2.method1194(class149.field2064, (byte) 126)) {
            var3++;
        }
        if (arg2.method1194(class175.field2524, (byte) 126)) {
            var3++;
        }
        if (arg2.method1194(class313.field4843, (byte) 126)) {
            var3++;
        }
        if (arg0 != 28404) {
            return 41;
        }
        if (arg1.method1194(class149.field2064, (byte) 126)) {
            var3++;
        }
        if (arg1.method1194(class175.field2524, (byte) 126)) {
            var3++;
        }
        if (arg1.method1194(class313.field4843, (byte) 126)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 42)
    public static final void method2072(int arg0) {
        class191.field2761 = 0;
        field4569++;
        int var1 = -16 / ((88 - arg0) / 37);
        int var2 = (class118.field1664.field2392 >> 7) + class142.field1992;
        int var3 = (class118.field1664.field2357 >> 7) + class118.field1668;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class191.field2761 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class191.field2761 = 1;
        }
        if (class191.field2761 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class191.field2761 = 0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)I", line = 71)
    public static final int method2073(int arg0, byte arg1) {
        int var2 = arg0 & 0x3F;
        if (arg1 != 1) {
            method2074(-57);
        }
        int var3 = (arg0 & 0xF2) >> 6;
        field4566++;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 127)
    public static void method2074(int arg0) {
        if (arg0 == -9536) {
            field4573 = null;
            field4564 = null;
            field4575 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([BII)I", line = 141)
    public static final int method2075(byte[] arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2075((byte[]) null, 74, -88);
        }
        field4565++;
        return class285.method2038(0, (byte) -121, arg2, arg0);
    }
}
