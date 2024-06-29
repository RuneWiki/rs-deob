import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class443 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Ldl;")
    public static class725 field5805 = new class725(1);

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Luw;")
    public static class208 field5806 = new class208(110, 2);

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lrn;")
    public static class633 field5808 = new class633(73, 7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field5809;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2547(boolean arg0) {
        field5806 = null;
        field5809 = null;
        if (!arg0) {
            field5808 = null;
        }
        field5805 = null;
        field5808 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 17)
    public static final void method2548(int arg0) {
        field5804++;
        if (arg0 == 110 && !class783.field10719) {
            class436.field5733 += (24.0F - class436.field5733) / 2.0F;
            class783.field10719 = true;
            class650.field8286 = true;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I", line = 35)
    public static final int method2549(int arg0, int arg1, int arg2) {
        field5807++;
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (arg0 != 126) {
            field5805 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }
}
