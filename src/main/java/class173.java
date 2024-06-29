import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class173 extends class130 {

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Z")
    public volatile boolean field3303 = true;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Ltb;")
    public class173 field3302;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lwg;")
    public class205 field3301;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()I")
    public abstract int method313();

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
    public abstract void method327(int arg0);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([III)V")
    public final void method1191(int[] arg0, int arg1, int arg2) {
        if (this.field3303) {
            this.method311(arg0, arg1, arg2);
        } else {
            this.method327(arg2);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()I")
    public int method330() {
        return 255;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()Ltb;")
    public abstract class173 method304();

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "()Ltb;")
    public abstract class173 method312();

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "([III)V")
    public abstract void method311(int[] arg0, int arg1, int arg2);
}
