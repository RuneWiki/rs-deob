import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class24 extends class63 {

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "[B")
    public byte[] field578;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
    public boolean field576;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lsb;)Lcb;")
    public final class24 method162(class196 arg0) {
        this.field578 = arg0.method1316(this.field578, 14);
        this.field577 = arg0.method1314(-24981, this.field577);
        if (this.field575 == this.field574) {
            this.field575 = this.field574 = arg0.method1315(this.field575, 108);
        } else {
            this.field575 = arg0.method1315(this.field575, 67);
            this.field574 = arg0.method1315(this.field574, 88);
            if (this.field575 == this.field574) {
                this.field575--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I[BII)V")
    public class24(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field577 = arg0;
        this.field578 = arg1;
        this.field575 = arg2;
        this.field574 = arg3;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I[BIIZ)V")
    public class24(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field577 = arg0;
        this.field578 = arg1;
        this.field575 = arg2;
        this.field574 = arg3;
        this.field576 = arg4;
    }
}
