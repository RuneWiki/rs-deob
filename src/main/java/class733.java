import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class733 extends class288 {

    @OriginalMember(owner = "client!dka", name = "G", descriptor = "I")
    private int field10115;

    @OriginalMember(owner = "client!dka", name = "K", descriptor = "Lfq;")
    private static class147 field10116;

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 3)
    public final void method1907(Component arg0) throws Exception {
        field10116.method975(124, class568.field8013, arg0, class223.field3174);
    }

    @OriginalMember(owner = "client!dka", name = "d", descriptor = "(I)V", line = 6)
    public final void method1914(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field10116.method979(2, this.field10115, arg0);
        }
    }

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "()I", line = 12)
    public final int method1910() {
        return field10116.method976((byte) 55, this.field10115);
    }

    @OriginalMember(owner = "client!dka", name = "e", descriptor = "()V", line = 15)
    public static void method4074() {
        field10116 = null;
    }

    @OriginalMember(owner = "client!dka", name = "c", descriptor = "()V", line = 18)
    public final void method1911() {
        field10116.method978(this.field10115, super.field4218);
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "()V", line = 21)
    public final void method1901() {
        field10116.method977(-22127, this.field10115);
    }

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lvt;I)V", line = 24)
    public class733(class768 arg0, int arg1) {
        field10116 = (class147) arg0.method4229(true);
        this.field10115 = arg1;
    }

    @OriginalMember(owner = "client!dka", name = "d", descriptor = "()V", line = 30)
    public final void method1912() {
        field10116.method980(this.field10115, 0);
    }
}
