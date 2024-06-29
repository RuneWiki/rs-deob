import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class103 extends class245 {

    @OriginalMember(owner = "client!oda", name = "K", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!oda", name = "J", descriptor = "Lgp;")
    private static class45 field1692;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 5)
    public final void method984(Component arg0) throws Exception {
        field1692.method537(arg0, class3.field23, 23151, class41.field581);
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "()V", line = 8)
    public final void method985() {
        field1692.method540(true, this.field1693);
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "()I", line = 11)
    public final int method986() {
        return field1692.method538(this.field1693, 0);
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lk;I)V", line = 13)
    public class103(class525 arg0, int arg1) {
        field1692 = (class45) arg0.method3179(-16);
        this.field1693 = arg1;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "()V", line = 18)
    public final void method987() {
        field1692.method539(this.field1693, super.field3891);
    }

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "()V", line = 21)
    public static void method988() {
        field1692 = null;
    }

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "()V", line = 24)
    public final void method989() {
        field1692.method541(this.field1693, (byte) 19);
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(I)V", line = 27)
    public final void method990(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1692.method536(arg0, this.field1693, 65536);
        }
    }
}
