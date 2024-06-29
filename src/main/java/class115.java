import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class115 extends class273 {

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Z")
    public volatile boolean field1626 = true;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Lnh;")
    public class115 field1627;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lf;")
    public class246 field1625;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()I", line = 6)
    public int method456() {
        return 255;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([III)V", line = 10)
    public final void method763(int[] arg0, int arg1, int arg2) {
        if (this.field1626) {
            this.method445(arg0, arg1, arg2);
        } else {
            this.method446(arg2);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "([III)V")
    public abstract void method445(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()Lnh;")
    public abstract class115 method482();

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
    public abstract void method446(int arg0);

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "()Lnh;")
    public abstract class115 method461();

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "()I")
    public abstract int method452();
}
