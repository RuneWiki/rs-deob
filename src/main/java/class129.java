import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class129 extends class11 {

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    private int field2052;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "Luj;")
    private static class142 field2051;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()V", line = 3)
    public final void method88() {
        field2051.method1087(121, this.field2052);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()V", line = 6)
    public final void method84() {
        field2051.method1084(this.field2052, this.field201);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 9)
    public final void method100(Component arg0) throws Exception {
        field2051.method1083(-12005, arg0, class213.field3404, class141.field2238);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()I", line = 12)
    public final int method94() {
        return field2051.method1086(this.field2052, -12250);
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "()V", line = 16)
    public static void method963() {
        field2051 = null;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()V", line = 19)
    public final void method103() {
        field2051.method1085((byte) 127, this.field2052);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 22)
    public final void method98(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field2051.method1088(arg0, this.field2052, (byte) 44);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Loj;I)V", line = 28)
    public class129(class325 arg0, int arg1) {
        field2051 = arg0.method2229((byte) 33);
        this.field2052 = arg1;
    }
}
