import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class class50 extends class264 {

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "Z")
    public volatile boolean field627 = true;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "Lvs;")
    public class461 field629;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "Lar;")
    public class50 field630;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)V")
    public abstract void method286(int arg0);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([III)V")
    public final void method390(int[] arg0, int arg1, int arg2) {
        if (this.field627) {
            this.method277(arg0, arg1, arg2);
        } else {
            this.method286(arg2);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "()I")
    public int method391() {
        return 255;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "()Lar;")
    public abstract class50 method283();

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "([III)V")
    public abstract void method277(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "()Lar;")
    public abstract class50 method281();

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "()I")
    public abstract int method284();
}
