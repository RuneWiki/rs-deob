import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class555 extends class243 {

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
    public int field7724;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "[B")
    public byte[] field7722;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
    public int field7723;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
    public int field7725;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "Z")
    public boolean field7726;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lui;)Loaa;", line = 8)
    public final class555 method3059(class642 arg0) {
        this.field7722 = arg0.method3590(false, this.field7722);
        this.field7724 = arg0.method3587(this.field7724, -55);
        if (this.field7725 == this.field7723) {
            this.field7723 = this.field7725 = arg0.method3589((byte) -99, this.field7723);
        } else {
            this.field7723 = arg0.method3589((byte) -111, this.field7723);
            this.field7725 = arg0.method3589((byte) -111, this.field7725);
            if (this.field7725 == this.field7723) {
                this.field7723--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class555(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field7724 = arg0;
        this.field7722 = arg1;
        this.field7723 = arg2;
        this.field7725 = arg3;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class555(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field7724 = arg0;
        this.field7722 = arg1;
        this.field7723 = arg2;
        this.field7725 = arg3;
        this.field7726 = arg4;
    }
}
