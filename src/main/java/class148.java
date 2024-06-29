import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class148 extends class297 {

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Z")
    public volatile boolean field2142 = true;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Ldh;")
    public class125 field2144;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Loj;")
    public class148 field2145;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()I", line = 5)
    public int method696() {
        return 255;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([III)V", line = 11)
    public final void method936(int[] arg0, int arg1, int arg2) {
        if (this.field2142) {
            this.method271(arg0, arg1, arg2);
        } else {
            this.method274(arg2);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()I")
    public abstract int method272();

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "()Loj;")
    public abstract class148 method270();

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "()Loj;")
    public abstract class148 method279();

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public abstract void method274(int arg0);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "([III)V")
    public abstract void method271(int[] arg0, int arg1, int arg2);
}
