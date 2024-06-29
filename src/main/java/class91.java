import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class91 extends class62 {

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "[B")
    public byte[] field1761;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Z")
    public boolean field1763;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lji;)Lsa;")
    public final class91 method598(class87 arg0) {
        this.field1761 = arg0.method569(this.field1761, -32768);
        this.field1759 = arg0.method570(this.field1759, -32768);
        if (this.field1762 == this.field1760) {
            this.field1760 = this.field1762 = arg0.method566(this.field1760, (byte) -128);
        } else {
            this.field1760 = arg0.method566(this.field1760, (byte) -128);
            this.field1762 = arg0.method566(this.field1762, (byte) -128);
            if (this.field1762 == this.field1760) {
                this.field1760--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(I[BII)V")
    public class91(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1759 = arg0;
        this.field1761 = arg1;
        this.field1760 = arg2;
        this.field1762 = arg3;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(I[BIIZ)V")
    public class91(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1759 = arg0;
        this.field1761 = arg1;
        this.field1760 = arg2;
        this.field1762 = arg3;
        this.field1763 = arg4;
    }
}
