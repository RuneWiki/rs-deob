import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class151 extends class34 {

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "Z")
    public volatile boolean field2754 = true;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Lmh;")
    public class151 field2752;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Lwb;")
    public class26 field2751;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()Lmh;")
    public abstract class151 method137();

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()I")
    public int method869() {
        return 255;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()I")
    public abstract int method163();

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([III)V")
    public final void method1045(int[] arg0, int arg1, int arg2) {
        if (this.field2754) {
            this.method153(arg0, arg1, arg2);
        } else {
            this.method133(arg2);
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "()Lmh;")
    public abstract class151 method148();

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([III)V")
    public abstract void method153(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    public abstract void method133(int arg0);
}
