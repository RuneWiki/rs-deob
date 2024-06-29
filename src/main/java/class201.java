import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class201 extends class142 {

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public int field2939;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "[B")
    public byte[] field2936;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public int field2938;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Z")
    public boolean field2937;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Len;)Lhk;", line = 5)
    public final class201 method1524(class249 arg0) {
        this.field2936 = arg0.method1796(this.field2936, -126);
        this.field2939 = arg0.method1797(this.field2939, -128);
        if (this.field2938 == this.field2935) {
            this.field2935 = this.field2938 = arg0.method1793(this.field2935, (byte) -127);
        } else {
            this.field2935 = arg0.method1793(this.field2935, (byte) -127);
            this.field2938 = arg0.method1793(this.field2938, (byte) -122);
            if (this.field2938 == this.field2935) {
                this.field2935--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class201(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2939 = arg0;
        this.field2936 = arg1;
        this.field2935 = arg2;
        this.field2938 = arg3;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class201(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2939 = arg0;
        this.field2936 = arg1;
        this.field2935 = arg2;
        this.field2938 = arg3;
        this.field2937 = arg4;
    }
}
