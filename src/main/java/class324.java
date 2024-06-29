import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class324 extends class331 {

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    private int field5066;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "Lgi;")
    private static class231 field5067;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 3)
    public final void method1854(Component arg0) throws Exception {
        field5067.method1670(class297.field4778, arg0, class52.field774, true);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 7)
    public final void method1852(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field5067.method1674(-13823, this.field5066, arg0);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "()V", line = 13)
    public final void method1855() {
        field5067.method1675(-14550, this.field5066);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "()V", line = 16)
    public final void method1857() {
        field5067.method1671(this.field5066, (byte) -86);
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "()V", line = 19)
    public static void method2278() {
        field5067 = null;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "()I", line = 22)
    public final int method1856() {
        return field5067.method1672(-25043, this.field5066);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lbk;I)V", line = 25)
    public class324(class69 arg0, int arg1) {
        field5067 = arg0.method547(true);
        this.field5066 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()V", line = 30)
    public final void method1853() {
        field5067.method1673(this.field5066, this.field5140);
    }
}
