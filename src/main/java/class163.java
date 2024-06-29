import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class163 extends class192 {

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field2645 = 0;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "Z")
    public static boolean field2648 = false;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field2649 = 0;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "B")
    public byte field2652;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "F")
    public static float field2650;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "Lug;")
    public static class253 field2643;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lvl;")
    public class6 field2651;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "[Luj;")
    public static class169[] field2644;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)[B", line = 6)
    public final byte[] method603(boolean arg0) {
        if (!arg0) {
            return (byte[]) null;
        }
        field2653++;
        if (this.field3055 || (this.field2651.field115.length - this.field2652) > this.field2651.field111) {
            throw new RuntimeException();
        }
        return this.field2651.field115;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V", line = 43)
    public static void method1211(byte arg0) {
        field2644 = null;
        if (arg0 != 78) {
            method1211((byte) 91);
        }
        field2643 = null;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)I", line = 56)
    public final int method598(byte arg0) {
        if (arg0 >= -57) {
            this.method598((byte) -84);
        }
        field2647++;
        return this.field2651 == null ? 0 : this.field2651.field111 * 100 / (this.field2651.field115.length - this.field2652);
    }
}
