import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class465 extends class1 {

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public int field6460;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "[B")
    public byte[] field6457;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public int field6459;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "Z")
    public boolean field6456;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lmn;)Lks;", line = 5)
    public final class465 method2752(class388 arg0) {
        this.field6457 = arg0.method2458(this.field6457, -86);
        this.field6460 = arg0.method2457(this.field6460, (byte) 82);
        if (this.field6459 == this.field6458) {
            this.field6459 = this.field6458 = arg0.method2459((byte) -128, this.field6459);
        } else {
            this.field6459 = arg0.method2459((byte) -112, this.field6459);
            this.field6458 = arg0.method2459((byte) -101, this.field6458);
            if (this.field6459 == this.field6458) {
                this.field6459--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class465(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field6460 = arg0;
        this.field6457 = arg1;
        this.field6459 = arg2;
        this.field6458 = arg3;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class465(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field6460 = arg0;
        this.field6457 = arg1;
        this.field6459 = arg2;
        this.field6458 = arg3;
        this.field6456 = arg4;
    }
}
