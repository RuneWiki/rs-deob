import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class2 extends class159 {

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "[B")
    public byte[] field26;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "Z")
    public boolean field29;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lgp;)Lar;")
    public final class2 method18(class405 arg0) {
        this.field26 = arg0.method2542(6440, this.field26);
        this.field28 = arg0.method2541(this.field28, (byte) 127);
        if (this.field30 == this.field27) {
            this.field30 = this.field27 = arg0.method2544(this.field30, (byte) -18);
        } else {
            this.field30 = arg0.method2544(this.field30, (byte) -7);
            this.field27 = arg0.method2544(this.field27, (byte) -20);
            if (this.field30 == this.field27) {
                this.field30--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I[BII)V")
    public class2(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field28 = arg0;
        this.field26 = arg1;
        this.field30 = arg2;
        this.field27 = arg3;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I[BIIZ)V")
    public class2(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field28 = arg0;
        this.field26 = arg1;
        this.field30 = arg2;
        this.field27 = arg3;
        this.field29 = arg4;
    }
}
