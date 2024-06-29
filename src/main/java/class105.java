import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 extends class122 {

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "[B")
    public byte[] field2642;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Z")
    public boolean field2640;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lnd;)Lpa;", line = 7)
    public final class105 method938(class94 arg0) {
        this.field2642 = arg0.method796(-309476240, this.field2642);
        this.field2643 = arg0.method794(-9141, this.field2643);
        if (this.field2644 == this.field2641) {
            this.field2644 = this.field2641 = arg0.method798(this.field2644, false);
        } else {
            this.field2644 = arg0.method798(this.field2644, false);
            this.field2641 = arg0.method798(this.field2641, false);
            if (this.field2644 == this.field2641) {
                this.field2644--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class105(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2643 = arg0;
        this.field2642 = arg1;
        this.field2644 = arg2;
        this.field2641 = arg3;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class105(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2643 = arg0;
        this.field2642 = arg1;
        this.field2644 = arg2;
        this.field2641 = arg3;
        this.field2640 = arg4;
    }
}
