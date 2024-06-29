import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class95 extends OutputStream {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lqk;")
    private static class207 field1691 = class24.method212(255, "glow3:");

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lqk;")
    public static class207 field1692 = class24.method212(255, "::noclip");

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lqk;")
    public static class207 field1689 = field1691;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lqk;")
    public static class207 field1694 = field1691;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lqk;")
    public static class207 field1693 = class24.method212(255, "brillant2:");

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[I")
    public static int[] field1690;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method684(byte arg0) {
        field1691 = null;
        field1693 = null;
        field1689 = null;
        field1692 = null;
        field1694 = null;
        if (arg0 == 90) {
            field1690 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method685(int arg0) {
        class159.field2809 = null;
        field1687++;
        if (arg0 > -45) {
            return;
        }
        class73.method531(0, -1, class31.field625, 0, 0, class165.field2915, 0, 30442, class244.field4428);
        if (class159.field2809 != null) {
            class79.method598(class159.field2809, class269.field4762, class31.field625, -1412584499, class244.field4428, 0, (byte) 90, 0, class68.field1206, class154.field2673.field4042);
            class159.field2809 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1695++;
        throw new IOException();
    }
}
