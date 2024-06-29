import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class132 extends class25 {

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    private int field2400;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "Lp;")
    private static class164 field2399;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method223(Component arg0) throws Exception {
        field2399.method1165(124, arg0, class66.field1271, class214.field3883);
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public final void method228(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2399.method1164(25478, this.field2400, arg0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
    public final void method216() {
        field2399.method1163((byte) 18, this.field2400);
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()I")
    public final int method221() {
        return field2399.method1161((byte) 121, this.field2400);
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()V")
    public static void method886() {
        field2399 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
    public final void method213() {
        field2399.method1162(this.field2400, super.field636);
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()V")
    public final void method224() {
        field2399.method1160(false, this.field2400);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lmc;I)V")
    public class132(class134 arg0, int arg1) {
        field2399 = arg0.method896(82);
        this.field2400 = arg1;
    }
}
