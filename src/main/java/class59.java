import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class59 extends class170 {

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "[B")
    public byte[] field781;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Z")
    public boolean field779;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lrf;)Leb;", line = 8)
    public final class59 method337(class83 arg0) {
        this.field781 = arg0.method472(73, this.field781);
        this.field780 = arg0.method469(109, this.field780);
        if (this.field783 == this.field782) {
            this.field782 = this.field783 = arg0.method471(this.field782, false);
        } else {
            this.field782 = arg0.method471(this.field782, false);
            this.field783 = arg0.method471(this.field783, false);
            if (this.field783 == this.field782) {
                this.field782--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class59(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field780 = arg0;
        this.field781 = arg1;
        this.field782 = arg2;
        this.field783 = arg3;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class59(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field780 = arg0;
        this.field781 = arg1;
        this.field782 = arg2;
        this.field783 = arg3;
        this.field779 = arg4;
    }
}
