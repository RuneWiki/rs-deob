import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class391 extends class492 {

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public int field5943;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "[B")
    public byte[] field5941;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public int field5940;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public int field5939;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Z")
    public boolean field5942;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lkn;)Llf;")
    public final class391 method2497(class239 arg0) {
        this.field5941 = arg0.method1671(this.field5941, -19152);
        this.field5943 = arg0.method1673((byte) 79, this.field5943);
        if (this.field5940 == this.field5939) {
            this.field5940 = this.field5939 = arg0.method1674(this.field5940, 0);
        } else {
            this.field5940 = arg0.method1674(this.field5940, 0);
            this.field5939 = arg0.method1674(this.field5939, 0);
            if (this.field5940 == this.field5939) {
                this.field5940--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I[BII)V")
    public class391(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5943 = arg0;
        this.field5941 = arg1;
        this.field5940 = arg2;
        this.field5939 = arg3;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I[BIIZ)V")
    public class391(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5943 = arg0;
        this.field5941 = arg1;
        this.field5940 = arg2;
        this.field5939 = arg3;
        this.field5942 = arg4;
    }
}
