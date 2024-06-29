import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class86 extends class162 {

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "[B")
    public byte[] field1402;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Z")
    public boolean field1399;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lah;)Lbe;")
    public final class86 method680(class106 arg0) {
        this.field1402 = arg0.method793(90, this.field1402);
        this.field1401 = arg0.method791(true, this.field1401);
        if (this.field1403 == this.field1400) {
            this.field1400 = this.field1403 = arg0.method792(this.field1400, 6);
        } else {
            this.field1400 = arg0.method792(this.field1400, 6);
            this.field1403 = arg0.method792(this.field1403, 6);
            if (this.field1403 == this.field1400) {
                this.field1400--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I[BII)V")
    public class86(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1401 = arg0;
        this.field1402 = arg1;
        this.field1400 = arg2;
        this.field1403 = arg3;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I[BIIZ)V")
    public class86(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1401 = arg0;
        this.field1402 = arg1;
        this.field1400 = arg2;
        this.field1403 = arg3;
        this.field1399 = arg4;
    }
}
