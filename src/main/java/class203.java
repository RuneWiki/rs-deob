import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class203 extends class85 {

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "[B")
    public byte[] field3926;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Z")
    public boolean field3928;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfa;)Lvf;")
    public final class203 method1329(class52 arg0) {
        this.field3926 = arg0.method312(this.field3926, 95);
        this.field3927 = arg0.method311(this.field3927, 0);
        if (this.field3925 == this.field3924) {
            this.field3924 = this.field3925 = arg0.method310(1, this.field3924);
        } else {
            this.field3924 = arg0.method310(1, this.field3924);
            this.field3925 = arg0.method310(1, this.field3925);
            if (this.field3925 == this.field3924) {
                this.field3924--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I[BII)V")
    public class203(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3927 = arg0;
        this.field3926 = arg1;
        this.field3924 = arg2;
        this.field3925 = arg3;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I[BIIZ)V")
    public class203(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3927 = arg0;
        this.field3926 = arg1;
        this.field3924 = arg2;
        this.field3925 = arg3;
        this.field3928 = arg4;
    }
}
