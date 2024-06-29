import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class450 extends class86 {

    @OriginalMember(owner = "client!av", name = "Q", descriptor = "I")
    private int field6736;

    @OriginalMember(owner = "client!av", name = "P", descriptor = "Lol;")
    private static class186 field6735;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "()V", line = 3)
    public final void method680() {
        field6735.method1300(this.field6736, 124);
    }

    @OriginalMember(owner = "client!av", name = "e", descriptor = "()V", line = 6)
    public static void method2685() {
        field6735 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 9)
    public final void method671(Component arg0) throws Exception {
        field6735.method1298(class320.field4899, class256.field3725, arg0, 9089);
    }

    @OriginalMember(owner = "client!av", name = "e", descriptor = "(I)V", line = 14)
    public final void method674(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field6735.method1297(-23023, arg0, this.field6736);
        }
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "()I", line = 20)
    public final int method677() {
        return field6735.method1299(27, this.field6736);
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lli;I)V", line = 22)
    public class450(class293 arg0, int arg1) {
        field6735 = arg0.method1864(-34009168);
        this.field6736 = arg1;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "()V", line = 27)
    public final void method676() {
        field6735.method1295(this.field6736, super.field1489);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "()V", line = 30)
    public final void method672() {
        field6735.method1296(-117, this.field6736);
    }
}
