import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class91 extends class31 {

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[B")
    public byte[] field1302;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Z")
    public boolean field1300;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lna;)Lwc;")
    public final class91 method646(class23 arg0) {
        this.field1302 = arg0.method158(this.field1302, (byte) 102);
        this.field1301 = arg0.method159(this.field1301, 14);
        if (this.field1304 == this.field1303) {
            this.field1303 = this.field1304 = arg0.method156(22056, this.field1303);
        } else {
            this.field1303 = arg0.method156(22056, this.field1303);
            this.field1304 = arg0.method156(22056, this.field1304);
            if (this.field1304 == this.field1303) {
                this.field1303--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I[BII)V")
    public class91(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1301 = arg0;
        this.field1302 = arg1;
        this.field1303 = arg2;
        this.field1304 = arg3;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class91(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1301 = arg0;
        this.field1302 = arg1;
        this.field1303 = arg2;
        this.field1304 = arg3;
        this.field1300 = arg4;
    }
}
