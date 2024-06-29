import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class77 extends class504 {

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "[B")
    public byte[] field962;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Z")
    public boolean field960;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lvp;)Ljj;")
    public final class77 method444(class126 arg0) {
        this.field962 = arg0.method761(this.field962, -21046);
        this.field961 = arg0.method760(this.field961, 2);
        if (this.field964 == this.field963) {
            this.field964 = this.field963 = arg0.method763(false, this.field964);
        } else {
            this.field964 = arg0.method763(false, this.field964);
            this.field963 = arg0.method763(false, this.field963);
            if (this.field964 == this.field963) {
                this.field964--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I[BII)V")
    public class77(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field961 = arg0;
        this.field962 = arg1;
        this.field964 = arg2;
        this.field963 = arg3;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I[BIIZ)V")
    public class77(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field961 = arg0;
        this.field962 = arg1;
        this.field964 = arg2;
        this.field963 = arg3;
        this.field960 = arg4;
    }
}
