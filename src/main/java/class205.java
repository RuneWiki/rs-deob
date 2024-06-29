import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class205 extends class633 {

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public static int field2871 = 0;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2869 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "B")
    public byte field2867;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "Lac;")
    public class501 field2870;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)[B", line = 6)
    public final byte[] method572(int arg0) {
        ++field2865;
        if (arg0 <= 103) {
            return null;
        } else if (!super.field8762 && ~this.field2870.field6892 <= ~(this.field2870.field6855.length - this.field2867)) {
            return this.field2870.field6855;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)V", line = 26)
    public static void method1332(int arg0) {
        if (arg0 != 0) {
            field2869 = null;
        }
        field2869 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I", line = 37)
    public final int method569(byte arg0) {
        ++field2866;
        if (this.field2870 == null) {
            return 0;
        } else {
            int var2 = 90 / ((-67 - arg0) / 49);
            return this.field2870.field6892 * 100 / (this.field2870.field6855.length + -this.field2867);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILmw;I)V", line = 54)
    public static final void method1333(int arg0, class455 arg1, int arg2) {
        ++field2872;
        class58.field654 = false;
        class356.field4729 = 0;
        if (arg2 > -112) {
            method1333(-64, (class455) null, 60);
        }
        class546.method3076(-1, arg1);
        class261.method1597(arg1, -86);
        if (class58.field654) {
            System.out.println("---endgpp---");
        }
        if (~arg1.field6892 != ~arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field6892 + " psize:" + arg0);
        }
    }
}
