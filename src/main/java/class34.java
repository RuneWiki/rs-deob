import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class34 extends class149 {

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "[B")
    public byte[] field476;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "Z")
    public boolean field475;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljd;)Lph;", line = 3)
    public final class34 method251(class93 arg0) {
        this.field476 = arg0.method633(24, this.field476);
        this.field478 = arg0.method636(126, this.field478);
        if (this.field479 == this.field477) {
            this.field479 = this.field477 = arg0.method634(this.field479, -14085);
        } else {
            this.field479 = arg0.method634(this.field479, -14085);
            this.field477 = arg0.method634(this.field477, -14085);
            if (this.field479 == this.field477) {
                this.field479--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class34(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field478 = arg0;
        this.field476 = arg1;
        this.field479 = arg2;
        this.field477 = arg3;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class34(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field478 = arg0;
        this.field476 = arg1;
        this.field479 = arg2;
        this.field477 = arg3;
        this.field475 = arg4;
    }
}
