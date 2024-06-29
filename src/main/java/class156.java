import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class156 extends class188 {

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "[B")
    public byte[] field2813;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Z")
    public boolean field2814;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lfm;)Loj;", line = 8)
    public final class156 method1140(class315 arg0) {
        this.field2813 = arg0.method2199(0, this.field2813);
        this.field2812 = arg0.method2198(this.field2812, false);
        if (this.field2816 == this.field2815) {
            this.field2815 = this.field2816 = arg0.method2197(this.field2815, (byte) 72);
        } else {
            this.field2815 = arg0.method2197(this.field2815, (byte) 112);
            this.field2816 = arg0.method2197(this.field2816, (byte) 88);
            if (this.field2816 == this.field2815) {
                this.field2815--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class156(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2812 = arg0;
        this.field2813 = arg1;
        this.field2815 = arg2;
        this.field2816 = arg3;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class156(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2812 = arg0;
        this.field2813 = arg1;
        this.field2815 = arg2;
        this.field2816 = arg3;
        this.field2814 = arg4;
    }
}
