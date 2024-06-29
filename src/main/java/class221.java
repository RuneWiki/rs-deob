import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class221 extends class595 {

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "[B")
    public byte[] field3235;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "Z")
    public boolean field3237;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Ltd;)Lrea;", line = 5)
    public final class221 method1516(class480 arg0) {
        this.field3235 = arg0.method2754(-128, this.field3235);
        this.field3238 = arg0.method2752(14, this.field3238);
        if (this.field3239 == this.field3236) {
            this.field3239 = this.field3236 = arg0.method2751(this.field3239, (byte) 122);
        } else {
            this.field3239 = arg0.method2751(this.field3239, (byte) 74);
            this.field3236 = arg0.method2751(this.field3236, (byte) 93);
            if (this.field3239 == this.field3236) {
                this.field3239--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class221(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3238 = arg0;
        this.field3235 = arg1;
        this.field3239 = arg2;
        this.field3236 = arg3;
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class221(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3238 = arg0;
        this.field3235 = arg1;
        this.field3239 = arg2;
        this.field3236 = arg3;
        this.field3237 = arg4;
    }
}
