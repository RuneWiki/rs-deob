import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class105 extends class32 {

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "[B")
    public byte[] field1217;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "Z")
    public boolean field1216;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lwu;)Lps;")
    public final class105 method930(class391 arg0) {
        this.field1217 = arg0.method3104(-26498, this.field1217);
        this.field1213 = arg0.method3109((byte) -90, this.field1213);
        if (this.field1215 == this.field1214) {
            this.field1214 = this.field1215 = arg0.method3106(0, this.field1214);
        } else {
            this.field1214 = arg0.method3106(0, this.field1214);
            this.field1215 = arg0.method3106(0, this.field1215);
            if (this.field1215 == this.field1214) {
                this.field1214--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I[BII)V")
    public class105(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1213 = arg0;
        this.field1217 = arg1;
        this.field1214 = arg2;
        this.field1215 = arg3;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I[BIIZ)V")
    public class105(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1213 = arg0;
        this.field1217 = arg1;
        this.field1214 = arg2;
        this.field1215 = arg3;
        this.field1216 = arg4;
    }
}
