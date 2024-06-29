import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class256 extends class42 {

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    private int field3945;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "Lea;")
    private static class101 field3944;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "()V")
    public static void method1599() {
        field3944 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()I")
    public final int method234() {
        return field3944.method641(this.field3945, 10815);
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V")
    public final void method242(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3944.method646(arg0, this.field3945, 14018);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method243(Component arg0) throws Exception {
        field3944.method644(class278.field4229, (byte) 82, arg0, class81.field1082);
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "()V")
    public final void method237() {
        field3944.method645((byte) -36, this.field3945);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "()V")
    public final void method236() {
        field3944.method643(this.field3945, -124);
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "()V")
    public final void method239() {
        field3944.method642(this.field3945, super.field520);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lsc;I)V")
    public class256(class239 arg0, int arg1) {
        field3944 = arg0.method1446(-31623);
        this.field3945 = arg1;
    }
}
