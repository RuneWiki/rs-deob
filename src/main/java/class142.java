import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class142 extends class185 {

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "[B")
    public byte[] field2670;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Z")
    public boolean field2674;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lce;)Loc;")
    public final class142 method901(class26 arg0) {
        this.field2670 = arg0.method202(1491, this.field2670);
        this.field2672 = arg0.method199(this.field2672, 86);
        if (this.field2673 == this.field2671) {
            this.field2673 = this.field2671 = arg0.method200(false, this.field2673);
        } else {
            this.field2673 = arg0.method200(false, this.field2673);
            this.field2671 = arg0.method200(false, this.field2671);
            if (this.field2673 == this.field2671) {
                this.field2673--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I[BII)V")
    public class142(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2672 = arg0;
        this.field2670 = arg1;
        this.field2673 = arg2;
        this.field2671 = arg3;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class142(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2672 = arg0;
        this.field2670 = arg1;
        this.field2673 = arg2;
        this.field2671 = arg3;
        this.field2674 = arg4;
    }
}
