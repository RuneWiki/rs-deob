import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class119 extends class71 {

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "[B")
    public byte[] field2808;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "Z")
    public boolean field2807;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lia;)Lte;", line = 8)
    public final class119 method908(class48 arg0) {
        this.field2808 = arg0.method368(true, this.field2808);
        this.field2811 = arg0.method375(false, this.field2811);
        if (this.field2810 == this.field2809) {
            this.field2809 = this.field2810 = arg0.method373(this.field2809, (byte) -15);
        } else {
            this.field2809 = arg0.method373(this.field2809, (byte) -15);
            this.field2810 = arg0.method373(this.field2810, (byte) -15);
            if (this.field2810 == this.field2809) {
                this.field2809--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class119(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2811 = arg0;
        this.field2808 = arg1;
        this.field2809 = arg2;
        this.field2810 = arg3;
    }
}
