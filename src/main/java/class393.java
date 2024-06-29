import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class393 extends class489 {

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public int field5742;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "[B")
    public byte[] field5741;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public int field5745;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public int field5743;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "Z")
    public boolean field5744;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lr;)Lgu;")
    public final class393 method2337(class115 arg0) {
        this.field5741 = arg0.method824(52, this.field5741);
        this.field5742 = arg0.method825(true, this.field5742);
        if (this.field5745 == this.field5743) {
            this.field5745 = this.field5743 = arg0.method821(this.field5745, (byte) 87);
        } else {
            this.field5745 = arg0.method821(this.field5745, (byte) 87);
            this.field5743 = arg0.method821(this.field5743, (byte) 87);
            if (this.field5745 == this.field5743) {
                this.field5745--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(I[BII)V")
    public class393(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5742 = arg0;
        this.field5741 = arg1;
        this.field5745 = arg2;
        this.field5743 = arg3;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(I[BIIZ)V")
    public class393(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5742 = arg0;
        this.field5741 = arg1;
        this.field5745 = arg2;
        this.field5743 = arg3;
        this.field5744 = arg4;
    }
}
