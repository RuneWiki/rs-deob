import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class436 extends class378 {

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public int field6267;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "[B")
    public byte[] field6268;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public int field6271;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public int field6270;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "Z")
    public boolean field6269;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lj;)Ljk;")
    public final class436 method2593(class292 arg0) {
        this.field6268 = arg0.method1839(0, this.field6268);
        this.field6267 = arg0.method1837(false, this.field6267);
        if (this.field6271 == this.field6270) {
            this.field6271 = this.field6270 = arg0.method1838((byte) -72, this.field6271);
        } else {
            this.field6271 = arg0.method1838((byte) -86, this.field6271);
            this.field6270 = arg0.method1838((byte) -121, this.field6270);
            if (this.field6271 == this.field6270) {
                this.field6271--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I[BII)V")
    public class436(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field6267 = arg0;
        this.field6268 = arg1;
        this.field6271 = arg2;
        this.field6270 = arg3;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I[BIIZ)V")
    public class436(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field6267 = arg0;
        this.field6268 = arg1;
        this.field6271 = arg2;
        this.field6270 = arg3;
        this.field6269 = arg4;
    }
}
