import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class131 extends class87 {

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[B")
    public byte[] field1873;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Z")
    public boolean field1876;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lkh;)Lla;")
    public final class131 method836(class13 arg0) {
        this.field1873 = arg0.method77(this.field1873, 22);
        this.field1872 = arg0.method74(this.field1872, 12318);
        if (this.field1875 == this.field1874) {
            this.field1875 = this.field1874 = arg0.method75(6, this.field1875);
        } else {
            this.field1875 = arg0.method75(6, this.field1875);
            this.field1874 = arg0.method75(6, this.field1874);
            if (this.field1875 == this.field1874) {
                this.field1875--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I[BII)V")
    public class131(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1872 = arg0;
        this.field1873 = arg1;
        this.field1875 = arg2;
        this.field1874 = arg3;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I[BIIZ)V")
    public class131(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1872 = arg0;
        this.field1873 = arg1;
        this.field1875 = arg2;
        this.field1874 = arg3;
        this.field1876 = arg4;
    }
}
