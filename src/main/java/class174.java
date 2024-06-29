import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class174 extends class87 {

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "[B")
    public byte[] field3180;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "Z")
    public boolean field3179;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ldj;)Lk;")
    public final class174 method1271(class182 arg0) {
        this.field3180 = arg0.method1330(this.field3180, false);
        this.field3178 = arg0.method1326((byte) 120, this.field3178);
        if (this.field3177 == this.field3176) {
            this.field3176 = this.field3177 = arg0.method1329(this.field3176, (byte) -3);
        } else {
            this.field3176 = arg0.method1329(this.field3176, (byte) -125);
            this.field3177 = arg0.method1329(this.field3177, (byte) -107);
            if (this.field3177 == this.field3176) {
                this.field3176--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I[BII)V")
    public class174(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3178 = arg0;
        this.field3180 = arg1;
        this.field3176 = arg2;
        this.field3177 = arg3;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I[BIIZ)V")
    public class174(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3178 = arg0;
        this.field3180 = arg1;
        this.field3176 = arg2;
        this.field3177 = arg3;
        this.field3179 = arg4;
    }
}
