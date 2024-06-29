import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class240 extends class236 {

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Z")
    public volatile boolean field4258 = true;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public int field4257;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lfa;")
    public class162 field4259;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Loa;")
    public class240 field4256;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([III)V")
    public abstract void method183(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Loa;")
    public abstract class240 method182();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public abstract void method187(int arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()I")
    public abstract int method185();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "([III)V")
    public final void method1696(int[] arg0, int arg1, int arg2) {
        if (this.field4258) {
            this.method183(arg0, arg1, arg2);
        } else {
            this.method187(arg2);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Loa;")
    public abstract class240 method179();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()I")
    public int method397() {
        return 255;
    }
}
