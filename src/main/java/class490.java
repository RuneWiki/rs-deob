import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class490 extends class632 {

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public int field6920;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "[B")
    public byte[] field6918;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public int field6917;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public int field6916;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "Z")
    public boolean field6919;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lbia;)Lnp;")
    public final class490 method2923(class498 arg0) {
        this.field6918 = arg0.method2966(true, this.field6918);
        this.field6920 = arg0.method2968(this.field6920, 14);
        if (this.field6917 == this.field6916) {
            this.field6917 = this.field6916 = arg0.method2970(10, this.field6917);
        } else {
            this.field6917 = arg0.method2970(10, this.field6917);
            this.field6916 = arg0.method2970(10, this.field6916);
            if (this.field6917 == this.field6916) {
                this.field6917--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(I[BII)V")
    public class490(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field6920 = arg0;
        this.field6918 = arg1;
        this.field6917 = arg2;
        this.field6916 = arg3;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(I[BIIZ)V")
    public class490(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field6920 = arg0;
        this.field6918 = arg1;
        this.field6917 = arg2;
        this.field6916 = arg3;
        this.field6919 = arg4;
    }
}
