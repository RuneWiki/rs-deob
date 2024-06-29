import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class class136 extends class253 {

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "Z")
    public volatile boolean field2376 = true;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public int field2377;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "Ldg;")
    public class136 field2374;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "Lk;")
    public class174 field2375;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([III)V")
    public final void method904(int[] arg0, int arg1, int arg2) {
        if (this.field2376) {
            this.method775(arg0, arg1, arg2);
        } else {
            this.method795(arg2);
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
    public abstract void method795(int arg0);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()Ldg;")
    public abstract class136 method780();

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()Ldg;")
    public abstract class136 method791();

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "()I")
    public int method905() {
        return 255;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()I")
    public abstract int method764();

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "([III)V")
    public abstract void method775(int[] arg0, int arg1, int arg2);
}
