import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class302 {

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "[B")
    public byte[] field30;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "Z")
    public boolean field29;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lpea;)Lft;")
    public final class4 method12(class680 arg0) {
        this.field30 = arg0.method3754((byte) 109, this.field30);
        this.field32 = arg0.method3753((byte) -79, this.field32);
        if (this.field33 == this.field31) {
            this.field31 = this.field33 = arg0.method3756(this.field31, 6);
        } else {
            this.field31 = arg0.method3756(this.field31, 6);
            this.field33 = arg0.method3756(this.field33, 6);
            if (this.field33 == this.field31) {
                this.field31--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(I[BII)V")
    public class4(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field32 = arg0;
        this.field30 = arg1;
        this.field31 = arg2;
        this.field33 = arg3;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(I[BIIZ)V")
    public class4(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field32 = arg0;
        this.field30 = arg1;
        this.field31 = arg2;
        this.field33 = arg3;
        this.field29 = arg4;
    }
}
