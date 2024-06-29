import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class53 extends class663 {

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "[B")
    public byte[] field696;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "Z")
    public boolean field699;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lau;)Lmda;", line = 6)
    public final class53 method302(class445 arg0) {
        this.field696 = arg0.method2558(111, this.field696);
        this.field698 = arg0.method2554(105, this.field698);
        if (this.field700 == this.field697) {
            this.field697 = this.field700 = arg0.method2559(this.field697, -23441);
        } else {
            this.field697 = arg0.method2559(this.field697, -23441);
            this.field700 = arg0.method2559(this.field700, -23441);
            if (this.field700 == this.field697) {
                this.field697--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(I[BII)V", line = 24)
    public class53(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field698 = arg0;
        this.field696 = arg1;
        this.field697 = arg2;
        this.field700 = arg3;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(I[BIIZ)V", line = 30)
    public class53(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field698 = arg0;
        this.field696 = arg1;
        this.field697 = arg2;
        this.field700 = arg3;
        this.field699 = arg4;
    }
}
