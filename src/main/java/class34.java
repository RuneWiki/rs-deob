import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class34 extends class106 {

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Z")
    public volatile boolean field707 = true;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lti;")
    public class207 field705;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Ld;")
    public class34 field706;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()Ld;")
    public abstract class34 method250();

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()Ld;")
    public abstract class34 method251();

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([III)V")
    public final void method252(int[] arg0, int arg1, int arg2) {
        if (this.field707) {
            this.method253(arg0, arg1, arg2);
        } else {
            this.method255(arg2);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "([III)V")
    public abstract void method253(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "()I")
    public int method254() {
        return 255;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public abstract void method255(int arg0);

    @OriginalMember(owner = "client!d", name = "d", descriptor = "()I")
    public abstract int method256();
}
