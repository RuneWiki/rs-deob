import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class412 extends class425 {

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Z")
    public volatile boolean field5901 = true;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public int field5902;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lqq;")
    public class280 field5900;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lkb;")
    public class412 field5899;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()I", line = 7)
    public int method1692() {
        return 255;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([III)V", line = 13)
    public final void method2606(int[] arg0, int arg1, int arg2) {
        if (this.field5901) {
            this.method724(arg0, arg1, arg2);
        } else {
            this.method722(arg2);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V")
    public abstract void method724(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public abstract void method722(int arg0);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()Lkb;")
    public abstract class412 method725();

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
    public abstract int method720();

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()Lkb;")
    public abstract class412 method727();
}
