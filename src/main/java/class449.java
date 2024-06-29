import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class449 {

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "Z")
    public static boolean field6546 = false;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "[I")
    public static int[] field6547 = new int[13];

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "Llc;")
    public static class385 field6542 = new class385();

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BZ)V")
    public static final void method2794(byte arg0, boolean arg1) {
        field6543++;
        class39.field497 = arg1;
        class392.field5881 = !class117.method852(true);
        int var2 = 14 % ((arg0 + 50) / 35);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static final void method2795(int arg0) {
        field6541++;
        class196.field3181.method335((byte) -56);
        if (arg0 != 1764384615) {
            method2796(22, (class149) null, -4, 103);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILup;II)J")
    public static final long method2796(int arg0, class149 arg1, int arg2, int arg3) {
        field6544++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class127 var10 = class137.method1003(arg1.method197(true), -30796);
        long var11 = (long) (arg3 | 0x800000 << 7 | arg0 | arg1.method195(3076) << 14 | arg1.method183((byte) 1) << 20);
        if (var10.field2021 == 0) {
            var11 |= var8;
        }
        if (var10.field1994 == 1) {
            var11 |= var4;
        }
        if (var10.field1942) {
            var11 |= var6;
        }
        if (arg2 != -15620) {
            field6542 = null;
        }
        return var11 | (long) arg1.method197(true) << 32;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public static void method2797(byte arg0) {
        field6547 = null;
        field6542 = null;
        int var1 = -24 % ((arg0 + 38) / 63);
    }
}
