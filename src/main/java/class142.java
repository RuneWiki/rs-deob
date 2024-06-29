import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class142 extends class135 {

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "[B")
    public byte[] field2426;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public int field2427;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "Z")
    public boolean field2428;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lfl;)Lbk;")
    public final class142 method1000(class287 arg0) {
        this.field2426 = arg0.method1919(28159, this.field2426);
        this.field2425 = arg0.method1918((byte) 22, this.field2425);
        if (this.field2427 == this.field2424) {
            this.field2424 = this.field2427 = arg0.method1922(-101, this.field2424);
        } else {
            this.field2424 = arg0.method1922(-104, this.field2424);
            this.field2427 = arg0.method1922(-83, this.field2427);
            if (this.field2427 == this.field2424) {
                this.field2424--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(I[BII)V")
    public class142(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2425 = arg0;
        this.field2426 = arg1;
        this.field2424 = arg2;
        this.field2427 = arg3;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(I[BIIZ)V")
    public class142(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2425 = arg0;
        this.field2426 = arg1;
        this.field2424 = arg2;
        this.field2427 = arg3;
        this.field2428 = arg4;
    }
}
