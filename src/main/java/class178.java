import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class178 extends class257 {

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "[B")
    public byte[] field2857;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field2858;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Z")
    public boolean field2860;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Loj;)Lti;")
    public final class178 method1303(class177 arg0) {
        this.field2857 = arg0.method1302(this.field2857, (byte) -94);
        this.field2859 = arg0.method1299(-106, this.field2859);
        if (this.field2858 == this.field2856) {
            this.field2858 = this.field2856 = arg0.method1298(-2037606398, this.field2858);
        } else {
            this.field2858 = arg0.method1298(-2037606398, this.field2858);
            this.field2856 = arg0.method1298(-2037606398, this.field2856);
            if (this.field2858 == this.field2856) {
                this.field2858--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I[BII)V")
    public class178(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2859 = arg0;
        this.field2857 = arg1;
        this.field2858 = arg2;
        this.field2856 = arg3;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I[BIIZ)V")
    public class178(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2859 = arg0;
        this.field2857 = arg1;
        this.field2858 = arg2;
        this.field2856 = arg3;
        this.field2860 = arg4;
    }
}
