import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class735 extends class610 {

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public int field9912;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "[B")
    public byte[] field9908;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public int field9910;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public int field9909;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Z")
    public boolean field9911;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lpe;)Lob;")
    public final class735 method4052(class609 arg0) {
        this.field9908 = arg0.method3464(this.field9908, 1);
        this.field9912 = arg0.method3462(this.field9912, (byte) -85);
        if (this.field9910 == this.field9909) {
            this.field9910 = this.field9909 = arg0.method3467(-114, this.field9910);
        } else {
            this.field9910 = arg0.method3467(-83, this.field9910);
            this.field9909 = arg0.method3467(-80, this.field9909);
            if (this.field9910 == this.field9909) {
                this.field9910--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I[BII)V")
    public class735(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field9912 = arg0;
        this.field9908 = arg1;
        this.field9910 = arg2;
        this.field9909 = arg3;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I[BIIZ)V")
    public class735(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field9912 = arg0;
        this.field9908 = arg1;
        this.field9910 = arg2;
        this.field9909 = arg3;
        this.field9911 = arg4;
    }
}
