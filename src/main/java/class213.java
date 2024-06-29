import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class213 extends class69 {

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public int field4030;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "[B")
    public byte[] field4033;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public int field4031;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "Z")
    public boolean field4032;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lqe;)Ltf;")
    public final class213 method1455(class179 arg0) {
        this.field4033 = arg0.method1280((byte) -115, this.field4033);
        this.field4030 = arg0.method1282(this.field4030, 65);
        if (this.field4034 == this.field4031) {
            this.field4034 = this.field4031 = arg0.method1281(this.field4034, -104);
        } else {
            this.field4034 = arg0.method1281(this.field4034, -113);
            this.field4031 = arg0.method1281(this.field4031, -111);
            if (this.field4034 == this.field4031) {
                this.field4034--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I[BII)V")
    public class213(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4030 = arg0;
        this.field4033 = arg1;
        this.field4034 = arg2;
        this.field4031 = arg3;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I[BIIZ)V")
    public class213(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4030 = arg0;
        this.field4033 = arg1;
        this.field4034 = arg2;
        this.field4031 = arg3;
        this.field4032 = arg4;
    }
}
