import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class73 extends class209 {

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "[B")
    public byte[] field1091;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Z")
    public boolean field1092;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ldd;)Lb;", line = 7)
    public final class73 method520(class3 arg0) {
        this.field1091 = arg0.method17(this.field1091, (byte) -126);
        this.field1094 = arg0.method21(this.field1094, 106);
        if (this.field1095 == this.field1093) {
            this.field1095 = this.field1093 = arg0.method22(19142, this.field1095);
        } else {
            this.field1095 = arg0.method22(19142, this.field1095);
            this.field1093 = arg0.method22(19142, this.field1093);
            if (this.field1095 == this.field1093) {
                this.field1095--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class73(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1094 = arg0;
        this.field1091 = arg1;
        this.field1095 = arg2;
        this.field1093 = arg3;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class73(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1094 = arg0;
        this.field1091 = arg1;
        this.field1095 = arg2;
        this.field1093 = arg3;
        this.field1092 = arg4;
    }
}
