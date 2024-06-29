import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class174 extends class207 {

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Z")
    public volatile boolean field3179 = true;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lk;")
    public class174 field3178;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lvh;")
    public class262 field3181;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()I")
    public abstract int method302();

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([III)V")
    public final void method1238(int[] arg0, int arg1, int arg2) {
        if (this.field3179) {
            this.method281(arg0, arg1, arg2);
        } else {
            this.method277(arg2);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()I")
    public int method1239() {
        return 255;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "([III)V")
    public abstract void method281(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "c", descriptor = "()Lk;")
    public abstract class174 method283();

    @OriginalMember(owner = "client!k", name = "d", descriptor = "()Lk;")
    public abstract class174 method276();

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
    public abstract void method277(int arg0);
}
