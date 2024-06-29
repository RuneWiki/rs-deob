import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class class528 extends class578 {

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "Z")
    public volatile boolean field7676 = true;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public int field7677;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Ljn;")
    public class528 field7674;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Lvw;")
    public class630 field7675;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "()I", line = 8)
    public int method938() {
        return 255;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([III)V", line = 20)
    public final void method4006(int[] arg0, int arg1, int arg2) {
        if (this.field7676) {
            this.method927(arg0, arg1, arg2);
        } else {
            this.method937(arg2);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "([III)V")
    public abstract void method927(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "()Ljn;")
    public abstract class528 method931();

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "()I")
    public abstract int method917();

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "()Ljn;")
    public abstract class528 method919();

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public abstract void method937(int arg0);
}
