import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class63 extends class78 {

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "Leb;")
    private static class247 field1076;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "()V")
    public static void method472() {
        field1076 = null;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()I")
    public final int method473() {
        return field1076.method1704(8987, this.field1077);
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()V")
    public final void method474() {
        field1076.method1705(this.field1077, (byte) 120);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()V")
    public final void method475() {
        field1076.method1706(this.field1077, super.field1281);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public final void method476(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1076.method1703(this.field1077, 13169, arg0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method477(Component arg0) throws Exception {
        field1076.method1702(false, class186.field2873, arg0, class7.field160);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
    public final void method478() {
        field1076.method1707(this.field1077, (byte) 124);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lna;I)V")
    public class63(class32 arg0, int arg1) {
        field1076 = arg0.method253((byte) -125);
        this.field1077 = arg1;
    }
}
