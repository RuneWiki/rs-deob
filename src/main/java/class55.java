import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class55 extends class89 {

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    private int field788;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "Lwb;")
    private static class86 field787;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "()I", line = 3)
    public final int method373() {
        return field787.method640(-27547, this.field788);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "()V", line = 6)
    public final void method374() {
        field787.method637(this.field788, this.field1521);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 9)
    public final void method375(Component arg0) throws Exception {
        field787.method635(class222.field3657, false, class255.field4264, arg0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()V", line = 13)
    public final void method376() {
        field787.method639(this.field788, 10637);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 16)
    public final void method377(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field787.method636(-17575, arg0, this.field788);
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "()V", line = 22)
    public final void method378() {
        field787.method638(this.field788, (byte) -89);
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "()V", line = 25)
    public static void method379() {
        field787 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lwe;I)V", line = 28)
    public class55(class92 arg0, int arg1) {
        field787 = arg0.method691(1);
        this.field788 = arg1;
    }
}
