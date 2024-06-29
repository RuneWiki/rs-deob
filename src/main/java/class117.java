import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 extends class119 {

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public int field2714;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "[B")
    public byte[] field2711;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Z")
    public boolean field2713;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lbc;)Lqf;")
    public final class117 method902(class11 arg0) {
        this.field2711 = arg0.method90(this.field2711, 22);
        this.field2714 = arg0.method89(this.field2714, (byte) -99);
        if (this.field2712 == this.field2710) {
            this.field2710 = this.field2712 = arg0.method85((byte) -128, this.field2710);
        } else {
            this.field2710 = arg0.method85((byte) -127, this.field2710);
            this.field2712 = arg0.method85((byte) -127, this.field2712);
            if (this.field2712 == this.field2710) {
                this.field2710--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I[BII)V")
    public class117(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2714 = arg0;
        this.field2711 = arg1;
        this.field2710 = arg2;
        this.field2712 = arg3;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I[BIIZ)V")
    public class117(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2714 = arg0;
        this.field2711 = arg1;
        this.field2710 = arg2;
        this.field2712 = arg3;
        this.field2713 = arg4;
    }
}
