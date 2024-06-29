import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class690 extends class450 {

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public int field9713;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[B")
    public byte[] field9711;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public int field9715;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public int field9712;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Z")
    public boolean field9714;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lew;)Lcj;")
    public final class690 method3873(class490 arg0) {
        this.field9711 = arg0.method2949((byte) 125, this.field9711);
        this.field9713 = arg0.method2945(-317471986, this.field9713);
        if (this.field9715 == this.field9712) {
            this.field9715 = this.field9712 = arg0.method2947(this.field9715, 1076572976);
        } else {
            this.field9715 = arg0.method2947(this.field9715, 1076572976);
            this.field9712 = arg0.method2947(this.field9712, 1076572976);
            if (this.field9715 == this.field9712) {
                this.field9715--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I[BII)V")
    public class690(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field9713 = arg0;
        this.field9711 = arg1;
        this.field9715 = arg2;
        this.field9712 = arg3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I[BIIZ)V")
    public class690(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field9713 = arg0;
        this.field9711 = arg1;
        this.field9715 = arg2;
        this.field9712 = arg3;
        this.field9714 = arg4;
    }
}
