import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class307 extends class206 {

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Z")
    public volatile boolean field5241 = true;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public int field5238;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Ls;")
    public class257 field5239;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Loj;")
    public class307 field5240;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "([III)V", line = 4)
    public final void method2103(int[] arg0, int arg1, int arg2) {
        if (this.field5241) {
            this.method998(arg0, arg1, arg2);
        } else {
            this.method977(arg2);
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "()I", line = 19)
    public int method1370() {
        return 255;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([III)V")
    public abstract void method998(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()I")
    public abstract int method971();

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    public abstract void method977(int arg0);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()Loj;")
    public abstract class307 method967();

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "()Loj;")
    public abstract class307 method972();
}
