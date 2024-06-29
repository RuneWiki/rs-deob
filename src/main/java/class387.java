import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class387 extends class241 {

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "[B")
    public byte[] field5150;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public int field5154;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Z")
    public boolean field5152;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lpf;)Lep;", line = 4)
    public final class387 method2215(class538 arg0) {
        this.field5150 = arg0.method3158(this.field5150, false);
        this.field5151 = arg0.method3160(this.field5151, (byte) -89);
        if (this.field5154 == this.field5153) {
            this.field5153 = this.field5154 = arg0.method3159(this.field5153, -12655);
        } else {
            this.field5153 = arg0.method3159(this.field5153, -12655);
            this.field5154 = arg0.method3159(this.field5154, -12655);
            if (this.field5154 == this.field5153) {
                this.field5153--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(I[BII)V", line = 24)
    public class387(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5151 = arg0;
        this.field5150 = arg1;
        this.field5153 = arg2;
        this.field5154 = arg3;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class387(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5151 = arg0;
        this.field5150 = arg1;
        this.field5153 = arg2;
        this.field5154 = arg3;
        this.field5152 = arg4;
    }
}
