import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class89 extends class255 {

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "[B")
    public byte[] field1305;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "Z")
    public boolean field1303;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lrb;)Lfj;")
    public final class89 method552(class6 arg0) {
        this.field1305 = arg0.method20(false, this.field1305);
        this.field1306 = arg0.method24(-91, this.field1306);
        if (this.field1304 == this.field1302) {
            this.field1304 = this.field1302 = arg0.method21(5, this.field1304);
        } else {
            this.field1304 = arg0.method21(5, this.field1304);
            this.field1302 = arg0.method21(5, this.field1302);
            if (this.field1304 == this.field1302) {
                this.field1304--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I[BII)V")
    public class89(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1306 = arg0;
        this.field1305 = arg1;
        this.field1304 = arg2;
        this.field1302 = arg3;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I[BIIZ)V")
    public class89(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1306 = arg0;
        this.field1305 = arg1;
        this.field1304 = arg2;
        this.field1302 = arg3;
        this.field1303 = arg4;
    }
}
