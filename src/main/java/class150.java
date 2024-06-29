import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class150 extends class204 {

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "[B")
    public byte[] field2877;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "Z")
    public boolean field2880;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lwb;)Lqe;")
    public final class150 method1026(class201 arg0) {
        this.field2877 = arg0.method1306(15120, this.field2877);
        this.field2879 = arg0.method1307(this.field2879, -1);
        if (this.field2878 == this.field2876) {
            this.field2876 = this.field2878 = arg0.method1308(this.field2876, (byte) -3);
        } else {
            this.field2876 = arg0.method1308(this.field2876, (byte) -3);
            this.field2878 = arg0.method1308(this.field2878, (byte) -3);
            if (this.field2878 == this.field2876) {
                this.field2876--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BII)V")
    public class150(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2879 = arg0;
        this.field2877 = arg1;
        this.field2876 = arg2;
        this.field2878 = arg3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BIIZ)V")
    public class150(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2879 = arg0;
        this.field2877 = arg1;
        this.field2876 = arg2;
        this.field2878 = arg3;
        this.field2880 = arg4;
    }
}
