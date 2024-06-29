import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class13 extends class49 {

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "[B")
    public byte[] field209;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Z")
    public boolean field210;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ltk;)Lig;")
    public final class13 method92(class79 arg0) {
        this.field209 = arg0.method573((byte) -90, this.field209);
        this.field207 = arg0.method574((byte) -60, this.field207);
        if (this.field208 == this.field206) {
            this.field206 = this.field208 = arg0.method572((byte) 117, this.field206);
        } else {
            this.field206 = arg0.method572((byte) 118, this.field206);
            this.field208 = arg0.method572((byte) 123, this.field208);
            if (this.field208 == this.field206) {
                this.field206--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I[BII)V")
    public class13(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field207 = arg0;
        this.field209 = arg1;
        this.field206 = arg2;
        this.field208 = arg3;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I[BIIZ)V")
    public class13(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field207 = arg0;
        this.field209 = arg1;
        this.field206 = arg2;
        this.field208 = arg3;
        this.field210 = arg4;
    }
}
