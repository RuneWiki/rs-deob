import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class340 extends class255 {

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public int field5312;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "[B")
    public byte[] field5313;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public int field5311;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public int field5310;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "Z")
    public boolean field5314;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lrl;)Ljf;", line = 4)
    public final class340 method2360(class309 arg0) {
        this.field5313 = arg0.method2111(-1280199728, this.field5313);
        this.field5312 = arg0.method2110(98, this.field5312);
        if (this.field5311 == this.field5310) {
            this.field5311 = this.field5310 = arg0.method2112(89, this.field5311);
        } else {
            this.field5311 = arg0.method2112(80, this.field5311);
            this.field5310 = arg0.method2112(108, this.field5310);
            if (this.field5311 == this.field5310) {
                this.field5311--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class340(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5312 = arg0;
        this.field5313 = arg1;
        this.field5311 = arg2;
        this.field5310 = arg3;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class340(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5312 = arg0;
        this.field5313 = arg1;
        this.field5311 = arg2;
        this.field5310 = arg3;
        this.field5314 = arg4;
    }
}
