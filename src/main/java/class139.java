import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class139 extends class81 {

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "[B")
    public byte[] field3257;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Z")
    public boolean field3256;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lcf;)Lu;")
    public final class139 method1144(class21 arg0) {
        this.field3257 = arg0.method180(14, this.field3257);
        this.field3259 = arg0.method176(this.field3259, (byte) -124);
        if (this.field3258 == this.field3255) {
            this.field3255 = this.field3258 = arg0.method175(this.field3255, true);
        } else {
            this.field3255 = arg0.method175(this.field3255, true);
            this.field3258 = arg0.method175(this.field3258, true);
            if (this.field3258 == this.field3255) {
                this.field3255--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(I[BII)V")
    public class139(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3259 = arg0;
        this.field3257 = arg1;
        this.field3255 = arg2;
        this.field3258 = arg3;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(I[BIIZ)V")
    public class139(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3259 = arg0;
        this.field3257 = arg1;
        this.field3255 = arg2;
        this.field3258 = arg3;
        this.field3256 = arg4;
    }
}
