import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 extends class110 {

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "[B")
    public byte[] field872;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lce;)Lfd;", line = 8)
    public final class35 method313(class18 arg0) {
        this.field872 = arg0.method173(this.field872, -1);
        this.field870 = arg0.method168(-28582, this.field870);
        if (this.field873 == this.field871) {
            this.field871 = this.field873 = arg0.method170(this.field871, 7);
        } else {
            this.field871 = arg0.method170(this.field871, 7);
            this.field873 = arg0.method170(this.field873, 7);
            if (this.field873 == this.field871) {
                this.field871--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I[BII)V", line = 24)
    public class35(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field870 = arg0;
        this.field872 = arg1;
        this.field871 = arg2;
        this.field873 = arg3;
    }
}
