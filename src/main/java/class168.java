import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class168 extends class474 {

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "[B")
    public byte[] field2691;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public int field2690;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public int field2688;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Z")
    public boolean field2689;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lsn;)Lmg;")
    public final class168 method1154(class495 arg0) {
        this.field2691 = arg0.method2912(this.field2691, 4747);
        this.field2687 = arg0.method2908(this.field2687, false);
        if (this.field2690 == this.field2688) {
            this.field2690 = this.field2688 = arg0.method2909(this.field2690, (byte) -127);
        } else {
            this.field2690 = arg0.method2909(this.field2690, (byte) -116);
            this.field2688 = arg0.method2909(this.field2688, (byte) 88);
            if (this.field2690 == this.field2688) {
                this.field2690--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I[BII)V")
    public class168(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2687 = arg0;
        this.field2691 = arg1;
        this.field2690 = arg2;
        this.field2688 = arg3;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I[BIIZ)V")
    public class168(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2687 = arg0;
        this.field2691 = arg1;
        this.field2690 = arg2;
        this.field2688 = arg3;
        this.field2689 = arg4;
    }
}
