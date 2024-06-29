import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class222 extends class84 {

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public int field4072;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "[B")
    public byte[] field4070;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Z")
    public boolean field4071;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lse;)Lme;")
    public final class222 method1578(class204 arg0) {
        this.field4070 = arg0.method1411(this.field4070, (byte) -121);
        this.field4072 = arg0.method1414(this.field4072, -61);
        if (this.field4074 == this.field4073) {
            this.field4074 = this.field4073 = arg0.method1408(-14174, this.field4074);
        } else {
            this.field4074 = arg0.method1408(-14174, this.field4074);
            this.field4073 = arg0.method1408(-14174, this.field4073);
            if (this.field4074 == this.field4073) {
                this.field4074--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I[BII)V")
    public class222(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4072 = arg0;
        this.field4070 = arg1;
        this.field4074 = arg2;
        this.field4073 = arg3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I[BIIZ)V")
    public class222(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4072 = arg0;
        this.field4070 = arg1;
        this.field4074 = arg2;
        this.field4073 = arg3;
        this.field4071 = arg4;
    }
}
