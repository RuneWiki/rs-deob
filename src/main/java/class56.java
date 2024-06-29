import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class56 extends class203 {

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "[B")
    public byte[] field812;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Z")
    public boolean field810;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lvo;)Leg;", line = 6)
    public final class56 method374(class28 arg0) {
        this.field812 = arg0.method221(this.field812, 0);
        this.field811 = arg0.method222(this.field811, true);
        if (this.field809 == this.field808) {
            this.field808 = this.field809 = arg0.method225(this.field808, (byte) 78);
        } else {
            this.field808 = arg0.method225(this.field808, (byte) 98);
            this.field809 = arg0.method225(this.field809, (byte) 127);
            if (this.field809 == this.field808) {
                this.field808--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field811 = arg0;
        this.field812 = arg1;
        this.field808 = arg2;
        this.field809 = arg3;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field811 = arg0;
        this.field812 = arg1;
        this.field808 = arg2;
        this.field809 = arg3;
        this.field810 = arg4;
    }
}
