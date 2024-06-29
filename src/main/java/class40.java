import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class40 extends class44 {

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    private int field918;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "Loh;")
    private static class261 field917;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()I")
    public final int method328() {
        return field917.method1780(this.field918, (byte) 51);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method329(Component arg0) throws Exception {
        field917.method1783((byte) 103, class65.field1277, class24.field590, arg0);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
    public final void method330() {
        field917.method1781(this.field918, super.field971);
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
    public static void method331() {
        field917 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
    public final void method332() {
        field917.method1785(this.field918, (byte) -76);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public final void method333(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field917.method1784(false, this.field918, arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()V")
    public final void method334() {
        field917.method1782(this.field918, (byte) -122);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lof;I)V")
    public class40(class254 arg0, int arg1) {
        field917 = arg0.method1712(80);
        this.field918 = arg1;
    }
}
