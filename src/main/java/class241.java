import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class241 extends class589 {

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[B")
    public byte[] field3374;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field3378;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Z")
    public boolean field3375;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Luw;)Lfc;", line = 3)
    public final class241 method1484(class386 arg0) {
        this.field3374 = arg0.method2243(this.field3374, 4);
        this.field3377 = arg0.method2240(this.field3377, 6);
        if (this.field3378 == this.field3376) {
            this.field3376 = this.field3378 = arg0.method2242(6, this.field3376);
        } else {
            this.field3376 = arg0.method2242(6, this.field3376);
            this.field3378 = arg0.method2242(6, this.field3378);
            if (this.field3378 == this.field3376) {
                this.field3376--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class241(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3377 = arg0;
        this.field3374 = arg1;
        this.field3376 = arg2;
        this.field3378 = arg3;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class241(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3377 = arg0;
        this.field3374 = arg1;
        this.field3376 = arg2;
        this.field3378 = arg3;
        this.field3375 = arg4;
    }
}
