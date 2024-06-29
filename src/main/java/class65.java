import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class65 extends class53 {

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    private int field1026;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "Lai;")
    private static class125 field1027;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "()I", line = 5)
    public final int method391() {
        return field1027.method858((byte) 118, this.field1026);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()V", line = 8)
    public final void method383() {
        field1027.method854(this.field1026, this.field839);
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "()V", line = 11)
    public static void method488() {
        field1027 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 14)
    public final void method398(Component arg0) throws Exception {
        field1027.method856(class168.field2603, (byte) -39, arg0, class26.field395);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()V", line = 17)
    public final void method385() {
        field1027.method853(this.field1026, 28544);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lll;I)V", line = 19)
    public class65(class156 arg0, int arg1) {
        field1027 = arg0.method1063((byte) 99);
        this.field1026 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 24)
    public final void method384(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field1027.method857(this.field1026, 25349, arg0);
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "()V", line = 30)
    public final void method394() {
        field1027.method855((byte) 20, this.field1026);
    }
}
