import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class42 extends class204 {

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "[B")
    public byte[] field650;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Z")
    public boolean field653;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lhd;)Lji;")
    public final class42 method244(class11 arg0) {
        this.field650 = arg0.method64(this.field650, false);
        this.field652 = arg0.method62((byte) -81, this.field652);
        if (this.field654 == this.field651) {
            this.field651 = this.field654 = arg0.method61(this.field651, (byte) 125);
        } else {
            this.field651 = arg0.method61(this.field651, (byte) 57);
            this.field654 = arg0.method61(this.field654, (byte) 73);
            if (this.field654 == this.field651) {
                this.field651--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I[BII)V")
    public class42(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field652 = arg0;
        this.field650 = arg1;
        this.field651 = arg2;
        this.field654 = arg3;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I[BIIZ)V")
    public class42(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field652 = arg0;
        this.field650 = arg1;
        this.field651 = arg2;
        this.field654 = arg3;
        this.field653 = arg4;
    }
}
