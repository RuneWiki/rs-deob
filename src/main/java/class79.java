import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class79 extends class306 {

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "[B")
    public byte[] field1141;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "Z")
    public boolean field1137;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lnm;)Lfv;")
    public final class79 method676(class333 arg0) {
        this.field1141 = arg0.method2104(this.field1141, -15);
        this.field1139 = arg0.method2106(14, this.field1139);
        if (this.field1140 == this.field1138) {
            this.field1138 = this.field1140 = arg0.method2107((byte) -72, this.field1138);
        } else {
            this.field1138 = arg0.method2107((byte) -114, this.field1138);
            this.field1140 = arg0.method2107((byte) -21, this.field1140);
            if (this.field1140 == this.field1138) {
                this.field1138--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(I[BII)V")
    public class79(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1139 = arg0;
        this.field1141 = arg1;
        this.field1138 = arg2;
        this.field1140 = arg3;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(I[BIIZ)V")
    public class79(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1139 = arg0;
        this.field1141 = arg1;
        this.field1138 = arg2;
        this.field1140 = arg3;
        this.field1137 = arg4;
    }
}
