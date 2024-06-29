import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class295 extends class191 {

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public int field4665;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "[B")
    public byte[] field4669;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public int field4666;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "Z")
    public boolean field4668;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lre;)Lik;")
    public final class295 method1969(class266 arg0) {
        this.field4669 = arg0.method1696((byte) 110, this.field4669);
        this.field4665 = arg0.method1701(false, this.field4665);
        if (this.field4667 == this.field4666) {
            this.field4666 = this.field4667 = arg0.method1694(27074, this.field4666);
        } else {
            this.field4666 = arg0.method1694(27074, this.field4666);
            this.field4667 = arg0.method1694(27074, this.field4667);
            if (this.field4667 == this.field4666) {
                this.field4666--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I[BII)V")
    public class295(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4665 = arg0;
        this.field4669 = arg1;
        this.field4666 = arg2;
        this.field4667 = arg3;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I[BIIZ)V")
    public class295(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4665 = arg0;
        this.field4669 = arg1;
        this.field4666 = arg2;
        this.field4667 = arg3;
        this.field4668 = arg4;
    }
}
