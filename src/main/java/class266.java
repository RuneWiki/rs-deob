import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class266 extends class247 {

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public int field4143;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[B")
    public byte[] field4145;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public int field4146;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Z")
    public boolean field4144;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lak;)Lid;", line = 9)
    public final class266 method1870(class153 arg0) {
        this.field4145 = arg0.method1150(this.field4145, 73);
        this.field4143 = arg0.method1151(this.field4143, 14);
        if (this.field4147 == this.field4146) {
            this.field4147 = this.field4146 = arg0.method1154(this.field4147, -108);
        } else {
            this.field4147 = arg0.method1154(this.field4147, -79);
            this.field4146 = arg0.method1154(this.field4146, -87);
            if (this.field4147 == this.field4146) {
                this.field4147--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class266(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4143 = arg0;
        this.field4145 = arg1;
        this.field4147 = arg2;
        this.field4146 = arg3;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class266(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4143 = arg0;
        this.field4145 = arg1;
        this.field4147 = arg2;
        this.field4146 = arg3;
        this.field4144 = arg4;
    }
}
