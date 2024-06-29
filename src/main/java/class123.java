import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class123 extends class508 {

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "[B")
    public byte[] field1521;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Z")
    public boolean field1522;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lri;)Lmr;")
    public final class123 method708(class93 arg0) {
        this.field1521 = arg0.method562(true, this.field1521);
        this.field1523 = arg0.method559(4864, this.field1523);
        if (this.field1525 == this.field1524) {
            this.field1524 = this.field1525 = arg0.method565(6, this.field1524);
        } else {
            this.field1524 = arg0.method565(6, this.field1524);
            this.field1525 = arg0.method565(6, this.field1525);
            if (this.field1525 == this.field1524) {
                this.field1524--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(I[BII)V")
    public class123(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1523 = arg0;
        this.field1521 = arg1;
        this.field1524 = arg2;
        this.field1525 = arg3;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(I[BIIZ)V")
    public class123(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1523 = arg0;
        this.field1521 = arg1;
        this.field1524 = arg2;
        this.field1525 = arg3;
        this.field1522 = arg4;
    }
}
