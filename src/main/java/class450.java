import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class450 {

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Luw;")
    public static class208 field5873 = new class208(28, 3);

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Luw;")
    public static class208 field5875 = new class208(115, 16);

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Ltq;")
    public static class536 field5877 = new class536(8);

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field5878 = 0;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "[B")
    public byte[] field5880;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "[S")
    public short[] field5870;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "[S")
    public short[] field5871;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "[S")
    public short[] field5874;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public static void method2565(int arg0) {
        if (arg0 == -16193) {
            field5875 = null;
            field5873 = null;
            field5877 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    public static final void method2566(int arg0) {
        if (arg0 != 28) {
            field5875 = null;
        }
        field5876++;
        if (class784.field10739) {
            return;
        }
        class229.method1474(class137.field1810, 7);
        if (class324.field4002 != null) {
            class229.method1474(class324.field4002, 7);
        }
        class784.field10739 = true;
    }
}
