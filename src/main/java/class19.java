import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 extends class262 {

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "[B")
    public byte[] field511;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Z")
    public boolean field512;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljg;)Lhe;")
    public final class19 method151(class163 arg0) {
        this.field511 = arg0.method1186(87, this.field511);
        this.field514 = arg0.method1185(this.field514, (byte) -105);
        if (this.field515 == this.field513) {
            this.field513 = this.field515 = arg0.method1180(50, this.field513);
        } else {
            this.field513 = arg0.method1180(50, this.field513);
            this.field515 = arg0.method1180(50, this.field515);
            if (this.field515 == this.field513) {
                this.field513--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I[BII)V")
    public class19(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field514 = arg0;
        this.field511 = arg1;
        this.field513 = arg2;
        this.field515 = arg3;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I[BIIZ)V")
    public class19(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field514 = arg0;
        this.field511 = arg1;
        this.field513 = arg2;
        this.field515 = arg3;
        this.field512 = arg4;
    }
}
