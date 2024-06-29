import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class120 extends class169 {

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    private int field1813;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "Lmd;")
    private static class215 field1812;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()I", line = 3)
    public final int method22() {
        return field1812.method1418(-126, this.field1813);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "()V", line = 6)
    public final void method21() {
        field1812.method1420(this.field1813, 51);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 9)
    public final void method20(Component arg0) throws Exception {
        field1812.method1417(class37.field591, arg0, (byte) 46, class138.field2049);
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V", line = 13)
    public final void method24(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field1812.method1415(arg0, this.field1813, (byte) -120);
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "()V", line = 19)
    public final void method23() {
        field1812.method1419(this.field1813, this.field2594);
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "()V", line = 22)
    public static void method798() {
        field1812 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lhf;I)V", line = 25)
    public class120(class154 arg0, int arg1) {
        field1812 = arg0.method982(11);
        this.field1813 = arg1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V", line = 30)
    public final void method25() {
        field1812.method1416(31869, this.field1813);
    }
}
