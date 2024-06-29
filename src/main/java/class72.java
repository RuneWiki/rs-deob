import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class72 extends class114 {

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "[B")
    public byte[] field1208;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public int field1212;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Z")
    public boolean field1211;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lac;)Ltd;")
    public final class72 method503(class135 arg0) {
        this.field1208 = arg0.method916(9599, this.field1208);
        this.field1209 = arg0.method914(this.field1209, (byte) -91);
        if (this.field1212 == this.field1210) {
            this.field1210 = this.field1212 = arg0.method912(this.field1210, 127);
        } else {
            this.field1210 = arg0.method912(this.field1210, 125);
            this.field1212 = arg0.method912(this.field1212, 121);
            if (this.field1212 == this.field1210) {
                this.field1210--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I[BII)V")
    public class72(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1209 = arg0;
        this.field1208 = arg1;
        this.field1210 = arg2;
        this.field1212 = arg3;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I[BIIZ)V")
    public class72(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1209 = arg0;
        this.field1208 = arg1;
        this.field1210 = arg2;
        this.field1212 = arg3;
        this.field1211 = arg4;
    }
}
