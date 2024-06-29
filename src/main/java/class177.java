import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class177 extends class134 {

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Z")
    public volatile boolean field2725 = true;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Lga;")
    public class177 field2727;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lbl;")
    public class34 field2726;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()I")
    public abstract int method162();

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()Lga;")
    public abstract class177 method160();

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([III)V")
    public final void method1261(int[] arg0, int arg1, int arg2) {
        if (this.field2725) {
            this.method178(arg0, arg1, arg2);
        } else {
            this.method156(arg2);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()Lga;")
    public abstract class177 method152();

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public abstract void method156(int arg0);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "([III)V")
    public abstract void method178(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()I")
    public int method866() {
        return 255;
    }
}
