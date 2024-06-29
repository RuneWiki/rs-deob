import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class190 {

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
    public static int[] field3045 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field3044 = -1;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field3048 = 0;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "[I")
    public static int[] field3051 = new int[14];

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Lml;")
    public static class17 field3043;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lml;")
    public static class17 field3046;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method1495(int arg0, byte arg1) {
        class86.method693(arg1 ^ 0xFFFFFFAF);
        field3049++;
        class204.method1561(false);
        int var2 = class201.method1544(arg0, (byte) -49).field237;
        if (var2 == 0) {
            return;
        }
        int var3 = class66.field1178[arg0];
        if (var2 == 9) {
            class204.field3222 = var3;
        }
        if (var2 == 6) {
            class329.field5228 = var3;
        }
        if (var2 == 5) {
            class86.field1458 = var3;
        }
        if (arg1 != 19) {
            method1496((byte) -18);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V", line = 45)
    public static void method1496(byte arg0) {
        field3051 = null;
        if (arg0 != 14) {
            field3050 = -127;
        }
        field3046 = null;
        field3045 = null;
        field3043 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIB)I")
    public abstract int method36(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public abstract void method37(byte arg0);

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)J")
    public abstract long method39(byte arg0);
}
