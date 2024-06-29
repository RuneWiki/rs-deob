import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class51 extends class67 {

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "Z")
    public volatile boolean field937 = true;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "Lef;")
    public class51 field936;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "Lgb;")
    public class69 field935;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([III)V")
    public abstract void method379(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()Lef;")
    public abstract class51 method380();

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "([III)V")
    public final void method381(int[] arg0, int arg1, int arg2) {
        if (this.field937) {
            this.method379(arg0, arg1, arg2);
        } else {
            this.method384(arg2);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()I")
    public int method382() {
        return 255;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()I")
    public abstract int method383();

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public abstract void method384(int arg0);

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()Lef;")
    public abstract class51 method385();
}
