import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class116 extends class168 {

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "[B")
    public byte[] field2068;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    public int field2070;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "Z")
    public boolean field2066;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lng;)Lwq;", line = 8)
    public final class116 method955(class229 arg0) {
        this.field2068 = arg0.method1515(this.field2068, false);
        this.field2067 = arg0.method1516(14, this.field2067);
        if (this.field2070 == this.field2069) {
            this.field2069 = this.field2070 = arg0.method1517(this.field2069, true);
        } else {
            this.field2069 = arg0.method1517(this.field2069, true);
            this.field2070 = arg0.method1517(this.field2070, true);
            if (this.field2070 == this.field2069) {
                this.field2069--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class116(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2067 = arg0;
        this.field2068 = arg1;
        this.field2069 = arg2;
        this.field2070 = arg3;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class116(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2067 = arg0;
        this.field2068 = arg1;
        this.field2069 = arg2;
        this.field2070 = arg3;
        this.field2066 = arg4;
    }
}
