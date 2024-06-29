import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class62 extends class192 {

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "[B")
    public byte[] field1262;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "Z")
    public boolean field1261;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lbc;)Lgf;")
    public final class62 method388(class14 arg0) {
        this.field1262 = arg0.method60(this.field1262, 3673);
        this.field1258 = arg0.method57(-11339, this.field1258);
        if (this.field1260 == this.field1259) {
            this.field1260 = this.field1259 = arg0.method58(-21957, this.field1260);
        } else {
            this.field1260 = arg0.method58(-21957, this.field1260);
            this.field1259 = arg0.method58(-21957, this.field1259);
            if (this.field1260 == this.field1259) {
                this.field1260--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I[BII)V")
    public class62(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1258 = arg0;
        this.field1262 = arg1;
        this.field1260 = arg2;
        this.field1259 = arg3;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I[BIIZ)V")
    public class62(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1258 = arg0;
        this.field1262 = arg1;
        this.field1260 = arg2;
        this.field1259 = arg3;
        this.field1261 = arg4;
    }
}
