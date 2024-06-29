import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class101 extends class89 {

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public int field2183;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "[B")
    public byte[] field2181;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public int field2182;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ltd;)Lra;")
    public final class101 method716(class114 arg0) {
        this.field2181 = arg0.method825(this.field2181, 0);
        this.field2183 = arg0.method824(-128, this.field2183);
        if (this.field2182 == this.field2180) {
            this.field2182 = this.field2180 = arg0.method823(this.field2182, 127);
        } else {
            this.field2182 = arg0.method823(this.field2182, 127);
            this.field2180 = arg0.method823(this.field2180, 127);
            if (this.field2182 == this.field2180) {
                this.field2182--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I[BII)V")
    public class101(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2183 = arg0;
        this.field2181 = arg1;
        this.field2182 = arg2;
        this.field2180 = arg3;
    }
}
