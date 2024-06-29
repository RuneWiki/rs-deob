import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class97 extends class6 {

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "Lqp;")
    public static class466 field1464 = new class466("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "[I")
    public static int[] field1473 = new int[8];

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "Ljava/lang/String;")
    public String field1469;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V")
    public final void method710(int arg0) {
        if (arg0 == -9237) {
            ++field1475;
            super.field115 = super.field115 & Long.MIN_VALUE | 500L + class246.method1483(5957);
            class445.field6560.method2127((byte) -122, this);
        }
    }

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "(I)I")
    public final int method711(int arg0) {
        ++field1470;
        int var2 = 110 / ((arg0 - -58) / 47);
        return (int) (super.field3615 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public final void method712(byte arg0) {
        super.field115 |= Long.MIN_VALUE;
        if (arg0 > -83) {
            this.field1468 = 106;
        }
        ++field1465;
        if (this.method715(80) == 0L) {
            class518.field7648.method2127((byte) -109, this);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method713(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class269.method1611((byte) -84, arg4, arg6, arg3, arg5, 0, arg2, arg0, arg7, arg8);
        int var9 = -91 % ((55 - arg1) / 57);
        ++field1467;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)I")
    public final int method714(byte arg0) {
        ++field1474;
        int var2 = -113 % ((arg0 - -41) / 62);
        return (int) super.field3615;
    }

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "(I)J")
    public final long method715(int arg0) {
        ++field1466;
        return arg0 < 44 ? -128L : Long.MAX_VALUE & super.field115;
    }

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "(I)V")
    public static void method716(int arg0) {
        field1464 = null;
        field1473 = null;
        if (arg0 != 6709) {
            method716(-89);
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(II)V")
    public class97(int arg0, int arg1) {
        super.field3615 = (long) arg0 << 32 | (long) arg1;
    }
}
