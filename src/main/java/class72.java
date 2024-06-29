import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class72 extends class316 {

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "Ldk;")
    private static class37 field1022;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()I", line = 3)
    public final int method298() {
        return field1022.method203(-1651, this.field1023);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 6)
    public final void method300(Component arg0) throws Exception {
        field1022.method198(-9403, class44.field553, class338.field5275, arg0);
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "()V", line = 9)
    public final void method301() {
        field1022.method202(this.field1023, (byte) -128);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()V", line = 12)
    public final void method296() {
        field1022.method200(this.field1023, (byte) 13);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 15)
    public final void method299(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field1022.method201(arg0, -22641, this.field1023);
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "()V", line = 22)
    public static void method486() {
        field1022 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V", line = 25)
    public final void method297() {
        field1022.method199(this.field1023, this.field4905);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljh;I)V", line = 28)
    public class72(class124 arg0, int arg1) {
        field1022 = arg0.method905(-4602);
        this.field1023 = arg1;
    }
}
