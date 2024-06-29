import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class50 extends class254 {

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Z")
    public volatile boolean field745 = true;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Loc;")
    public class125 field744;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lfb;")
    public class50 field742;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()Lfb;")
    public abstract class50 method276();

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()I")
    public abstract int method278();

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()Lfb;")
    public abstract class50 method283();

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([III)V")
    public abstract void method277(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "([III)V")
    public final void method340(int[] arg0, int arg1, int arg2) {
        if (this.field745) {
            this.method277(arg0, arg1, arg2);
        } else {
            this.method281(arg2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "()I")
    public int method341() {
        return 255;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public abstract void method281(int arg0);
}
