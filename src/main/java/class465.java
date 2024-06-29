import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class465 extends class83 {

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
    public int field6447;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "[B")
    public byte[] field6451;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "I")
    public int field6449;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public int field6448;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "Z")
    public boolean field6450;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lwp;)Ljn;", line = 7)
    public final class465 method2743(class109 arg0) {
        this.field6451 = arg0.method676((byte) 127, this.field6451);
        this.field6447 = arg0.method675(this.field6447, -113);
        if (this.field6449 == this.field6448) {
            this.field6449 = this.field6448 = arg0.method677(false, this.field6449);
        } else {
            this.field6449 = arg0.method677(false, this.field6449);
            this.field6448 = arg0.method677(false, this.field6448);
            if (this.field6449 == this.field6448) {
                this.field6449--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class465(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field6447 = arg0;
        this.field6451 = arg1;
        this.field6449 = arg2;
        this.field6448 = arg3;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class465(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field6447 = arg0;
        this.field6451 = arg1;
        this.field6449 = arg2;
        this.field6448 = arg3;
        this.field6450 = arg4;
    }
}
