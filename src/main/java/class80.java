import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 {

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1808 = 0;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1809 = 0;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lp;")
    public static class104 field1810 = new class104(64);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lqc;")
    public static class114 field1814;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 3)
    public static final void method687(int arg0) {
        try {
            Graphics var1 = class140.field3523.getGraphics();
            class116.field3065.method129(var1, 553, 205, (byte) -126);
            if (arg0 != 14366) {
                field1808 = -106;
            }
        } catch (Exception var2) {
            class140.field3523.repaint();
        }
        field1807++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZZ)I", line = 27)
    public static final int method688(int arg0, boolean arg1, boolean arg2) {
        int var3 = 0;
        field1806++;
        if (arg0 <= 22) {
            return -20;
        }
        if (arg2) {
            var3 += class34.field900 + class113.field2968;
        }
        if (arg1) {
            var3 += class70.field1651 + class1.field6;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 61)
    public static void method689(int arg0) {
        field1810 = null;
        field1814 = null;
        int var1 = -109 / ((1 - arg0) / 53);
    }
}
