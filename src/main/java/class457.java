import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class457 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field6335 = 328;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Ltt;")
    public static class100 field6339;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "Lbr;")
    public static class416 field6338;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "Lsea;")
    public static class727 field6340;

    @OriginalMember(owner = "client!ss", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6336++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static void method2706(int arg0) {
        field6339 = null;
        field6338 = null;
        if (arg0 != 21160) {
            method2708(-16, 27, (byte) -98);
        }
        field6340 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)[I")
    public static final int[] method2707(byte arg0, int arg1) {
        field6337++;
        int[] var2 = new int[3];
        class109.method822((byte) -120, class139.method1074(arg1, -101));
        if (arg0 < 62) {
            return null;
        } else {
            var2[0] = class295.field4285.get(5);
            var2[1] = class295.field4285.get(2);
            var2[2] = class295.field4285.get(1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB)V")
    public static final void method2708(int arg0, int arg1, byte arg2) {
        field6341++;
        class16 var3 = class94.method753(19, arg2 ^ 0x3322, (long) arg1 << 32 | (long) arg0);
        var3.method118(arg2 ^ 0x22E06FAD);
        if (arg2 != 85) {
            field6340 = null;
        }
    }
}
