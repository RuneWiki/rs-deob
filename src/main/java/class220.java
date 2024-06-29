import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class220 extends class62 {

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public int field3348;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "[B")
    public byte[] field3351;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Z")
    public boolean field3350;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lka;)Lsf;", line = 9)
    public final class220 method1547(class200 arg0) {
        this.field3351 = arg0.method1374(this.field3351, 6);
        this.field3348 = arg0.method1368((byte) 112, this.field3348);
        if (this.field3349 == this.field3347) {
            this.field3349 = this.field3347 = arg0.method1367(this.field3349, 14);
        } else {
            this.field3349 = arg0.method1367(this.field3349, 14);
            this.field3347 = arg0.method1367(this.field3347, 14);
            if (this.field3349 == this.field3347) {
                this.field3349--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class220(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3348 = arg0;
        this.field3351 = arg1;
        this.field3349 = arg2;
        this.field3347 = arg3;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class220(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3348 = arg0;
        this.field3351 = arg1;
        this.field3349 = arg2;
        this.field3347 = arg3;
        this.field3350 = arg4;
    }
}
