import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class79 extends class475 {

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "[B")
    public byte[] field1305;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Z")
    public boolean field1301;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lvf;)Lrm;", line = 3)
    public final class79 method706(class54 arg0) {
        this.field1305 = arg0.method352(this.field1305, (byte) 32);
        this.field1304 = arg0.method351(70, this.field1304);
        if (this.field1303 == this.field1302) {
            this.field1303 = this.field1302 = arg0.method354(this.field1303, -5107);
        } else {
            this.field1303 = arg0.method354(this.field1303, -5107);
            this.field1302 = arg0.method354(this.field1302, -5107);
            if (this.field1303 == this.field1302) {
                this.field1303--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class79(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1304 = arg0;
        this.field1305 = arg1;
        this.field1303 = arg2;
        this.field1302 = arg3;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class79(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1304 = arg0;
        this.field1305 = arg1;
        this.field1303 = arg2;
        this.field1302 = arg3;
        this.field1301 = arg4;
    }
}
