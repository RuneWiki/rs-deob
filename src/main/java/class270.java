import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class class270 extends class544 {

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "Z")
    public volatile boolean field3508 = true;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "Lvv;")
    public class270 field3506;

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "Lkq;")
    public class508 field3505;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "([III)V", line = 4)
    public final void method1508(int[] arg0, int arg1, int arg2) {
        if (this.field3508) {
            this.method799(arg0, arg1, arg2);
        } else {
            this.method804(arg2);
        }
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "()I", line = 15)
    public int method1509() {
        return 255;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
    public abstract void method804(int arg0);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "()Lvv;")
    public abstract class270 method806();

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "()Lvv;")
    public abstract class270 method801();

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "([III)V")
    public abstract void method799(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "()I")
    public abstract int method800();
}
