import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 extends class137 {

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "[B")
    public byte[] field1092;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "Z")
    public boolean field1088;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lp;)Lgf;")
    public final class48 method408(class104 arg0) {
        this.field1092 = arg0.method837(0, this.field1092);
        this.field1090 = arg0.method839(this.field1090, (byte) -61);
        if (this.field1091 == this.field1089) {
            this.field1091 = this.field1089 = arg0.method835((byte) -103, this.field1091);
        } else {
            this.field1091 = arg0.method835((byte) -103, this.field1091);
            this.field1089 = arg0.method835((byte) -103, this.field1089);
            if (this.field1091 == this.field1089) {
                this.field1091--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I[BII)V")
    public class48(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1090 = arg0;
        this.field1092 = arg1;
        this.field1091 = arg2;
        this.field1089 = arg3;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I[BIIZ)V")
    public class48(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1090 = arg0;
        this.field1092 = arg1;
        this.field1091 = arg2;
        this.field1089 = arg3;
        this.field1088 = arg4;
    }
}
