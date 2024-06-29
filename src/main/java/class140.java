import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class140 extends class198 {

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "[B")
    public byte[] field2683;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public int field2679;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public int field2682;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Z")
    public boolean field2681;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltg;)Loa;")
    public final class140 method896(class196 arg0) {
        this.field2683 = arg0.method1318(this.field2683, 32767);
        this.field2680 = arg0.method1319(6, this.field2680);
        if (this.field2682 == this.field2679) {
            this.field2679 = this.field2682 = arg0.method1321(this.field2679, 6);
        } else {
            this.field2679 = arg0.method1321(this.field2679, 6);
            this.field2682 = arg0.method1321(this.field2682, 6);
            if (this.field2682 == this.field2679) {
                this.field2679--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I[BII)V")
    public class140(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2680 = arg0;
        this.field2683 = arg1;
        this.field2679 = arg2;
        this.field2682 = arg3;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I[BIIZ)V")
    public class140(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2680 = arg0;
        this.field2683 = arg1;
        this.field2679 = arg2;
        this.field2682 = arg3;
        this.field2681 = arg4;
    }
}
