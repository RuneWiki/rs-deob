import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class244 extends class67 {

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    private int field4073;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "Lll;")
    private static class220 field4074;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "()V", line = 3)
    public static void method1731() {
        field4074 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()V", line = 6)
    public final void method551() {
        field4074.method1527(this.field4073, this.field1024);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 9)
    public final void method548(Component arg0) throws Exception {
        field4074.method1526(arg0, class84.field1322, class274.field4723, false);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "()I", line = 12)
    public final int method554() {
        return field4074.method1524((byte) 127, this.field4073);
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "()V", line = 15)
    public final void method562() {
        field4074.method1528(this.field4073, (byte) 127);
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 20)
    public final void method560(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field4074.method1525(this.field4073, (byte) -99, arg0);
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "()V", line = 26)
    public final void method559() {
        field4074.method1529(this.field4073, (byte) -64);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lim;I)V", line = 28)
    public class244(class175 arg0, int arg1) {
        field4074 = arg0.method1302(0);
        this.field4073 = arg1;
    }
}
