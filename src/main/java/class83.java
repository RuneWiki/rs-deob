import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 extends class92 {

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public int field2073;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "[B")
    public byte[] field2071;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "Z")
    public boolean field2070;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lke;)Lm;")
    public final class83 method694(class74 arg0) {
        this.field2071 = arg0.method567(32, this.field2071);
        this.field2073 = arg0.method566(this.field2073, -8752);
        if (this.field2074 == this.field2072) {
            this.field2074 = this.field2072 = arg0.method565(this.field2074, 3850);
        } else {
            this.field2074 = arg0.method565(this.field2074, 3850);
            this.field2072 = arg0.method565(this.field2072, 3850);
            if (this.field2074 == this.field2072) {
                this.field2074--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I[BII)V")
    public class83(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2073 = arg0;
        this.field2071 = arg1;
        this.field2074 = arg2;
        this.field2072 = arg3;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I[BIIZ)V")
    public class83(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2073 = arg0;
        this.field2071 = arg1;
        this.field2074 = arg2;
        this.field2072 = arg3;
        this.field2070 = arg4;
    }
}
