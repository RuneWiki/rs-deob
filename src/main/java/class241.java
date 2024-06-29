import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public abstract class class241 extends class134 {

    @OriginalMember(owner = "client!eia", name = "m", descriptor = "Z")
    public volatile boolean field2877 = true;

    @OriginalMember(owner = "client!eia", name = "j", descriptor = "I")
    public int field2874;

    @OriginalMember(owner = "client!eia", name = "k", descriptor = "Lhw;")
    public class130 field2875;

    @OriginalMember(owner = "client!eia", name = "l", descriptor = "Leia;")
    public class241 field2876;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "()Leia;")
    public abstract class241 method681();

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "([III)V")
    public abstract void method659(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "()I")
    public abstract int method669();

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "()I")
    public int method640() {
        return 255;
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "([III)V")
    public final void method1415(int[] arg0, int arg1, int arg2) {
        if (this.field2877) {
            this.method659(arg0, arg1, arg2);
        } else {
            this.method649(arg2);
        }
    }

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "()Leia;")
    public abstract class241 method678();

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
    public abstract void method649(int arg0);
}
