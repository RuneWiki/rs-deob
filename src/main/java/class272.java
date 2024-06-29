import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class272 extends class280 {

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "[B")
    public byte[] field3957;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public int field3960;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public int field3956;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Z")
    public boolean field3958;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lof;)Lbg;", line = 6)
    public final class272 method1859(class370 arg0) {
        this.field3957 = arg0.method2376(this.field3957, (byte) 16);
        this.field3959 = arg0.method2372(this.field3959, -99);
        if (this.field3960 == this.field3956) {
            this.field3960 = this.field3956 = arg0.method2374(-115, this.field3960);
        } else {
            this.field3960 = arg0.method2374(-124, this.field3960);
            this.field3956 = arg0.method2374(-86, this.field3956);
            if (this.field3960 == this.field3956) {
                this.field3960--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class272(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3959 = arg0;
        this.field3957 = arg1;
        this.field3960 = arg2;
        this.field3956 = arg3;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class272(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3959 = arg0;
        this.field3957 = arg1;
        this.field3960 = arg2;
        this.field3956 = arg3;
        this.field3958 = arg4;
    }
}
