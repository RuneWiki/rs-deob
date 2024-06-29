import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class590 extends class289 {

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    private int field7691;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Lbs;")
    private static class688 field7690;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()I", line = 3)
    public final int method1423() {
        return field7690.method1364(this.field7691, 23707);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V", line = 6)
    public final void method1420(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field7690.method1362((byte) 27, arg0, this.field7691);
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "()V", line = 12)
    public static void method3217() {
        field7690 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 16)
    public final void method1422(Component arg0) throws Exception {
        field7690.method1366(class27.field430, arg0, class405.field5646, -122);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V", line = 19)
    public final void method1421() {
        field7690.method1365(this.field7691, (byte) -14);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()V", line = 22)
    public final void method1425() {
        field7690.method1361(this.field7691, 16);
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "()V", line = 25)
    public final void method1424() {
        field7690.method1363(this.field7691, super.field4106);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lkk;I)V", line = 28)
    public class590(class192 arg0, int arg1) {
        field7690 = (class688) arg0.method1317((byte) -46);
        this.field7691 = arg1;
    }
}
