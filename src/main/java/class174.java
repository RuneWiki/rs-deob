import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class174 extends class198 {

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "[B")
    public byte[] field2641;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Z")
    public boolean field2640;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lug;)Lhe;", line = 3)
    public final class174 method1204(class330 arg0) {
        this.field2641 = arg0.method1949(this.field2641, (byte) 110);
        this.field2642 = arg0.method1951((byte) 46, this.field2642);
        if (this.field2643 == this.field2639) {
            this.field2643 = this.field2639 = arg0.method1946(this.field2643, 1011);
        } else {
            this.field2643 = arg0.method1946(this.field2643, 1011);
            this.field2639 = arg0.method1946(this.field2639, 1011);
            if (this.field2643 == this.field2639) {
                this.field2643--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class174(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2642 = arg0;
        this.field2641 = arg1;
        this.field2643 = arg2;
        this.field2639 = arg3;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class174(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2642 = arg0;
        this.field2641 = arg1;
        this.field2643 = arg2;
        this.field2639 = arg3;
        this.field2640 = arg4;
    }
}
