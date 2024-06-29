import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class248 extends class283 {

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "[B")
    public byte[] field3941;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public int field3944;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "Z")
    public boolean field3943;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ln;)Lqj;")
    public final class248 method1656(class233 arg0) {
        this.field3941 = arg0.method1571(this.field3941, -127);
        this.field3940 = arg0.method1574(this.field3940, 120);
        if (this.field3944 == this.field3942) {
            this.field3944 = this.field3942 = arg0.method1570((byte) -71, this.field3944);
        } else {
            this.field3944 = arg0.method1570((byte) 116, this.field3944);
            this.field3942 = arg0.method1570((byte) 114, this.field3942);
            if (this.field3944 == this.field3942) {
                this.field3944--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[BII)V")
    public class248(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3940 = arg0;
        this.field3941 = arg1;
        this.field3944 = arg2;
        this.field3942 = arg3;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[BIIZ)V")
    public class248(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3940 = arg0;
        this.field3941 = arg1;
        this.field3944 = arg2;
        this.field3942 = arg3;
        this.field3943 = arg4;
    }
}
