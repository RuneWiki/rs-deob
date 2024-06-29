import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class177 extends class179 {

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "[B")
    public byte[] field3271;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Z")
    public boolean field3273;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljd;)Lqc;")
    public final class177 method1148(class102 arg0) {
        this.field3271 = arg0.method626(this.field3271, 32768);
        this.field3272 = arg0.method627(-115, this.field3272);
        if (this.field3275 == this.field3274) {
            this.field3274 = this.field3275 = arg0.method633(this.field3274, (byte) 111);
        } else {
            this.field3274 = arg0.method633(this.field3274, (byte) 97);
            this.field3275 = arg0.method633(this.field3275, (byte) -61);
            if (this.field3275 == this.field3274) {
                this.field3274--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I[BII)V")
    public class177(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3272 = arg0;
        this.field3271 = arg1;
        this.field3274 = arg2;
        this.field3275 = arg3;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class177(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3272 = arg0;
        this.field3271 = arg1;
        this.field3274 = arg2;
        this.field3275 = arg3;
        this.field3273 = arg4;
    }
}
