import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class202 extends class249 {

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "[B")
    public byte[] field3316;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Z")
    public boolean field3313;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lea;)Lph;")
    public final class202 method1339(class61 arg0) {
        this.field3316 = arg0.method386((byte) 127, this.field3316);
        this.field3317 = arg0.method381(2, this.field3317);
        if (this.field3315 == this.field3314) {
            this.field3315 = this.field3314 = arg0.method385((byte) -102, this.field3315);
        } else {
            this.field3315 = arg0.method385((byte) -99, this.field3315);
            this.field3314 = arg0.method385((byte) -60, this.field3314);
            if (this.field3315 == this.field3314) {
                this.field3315--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I[BII)V")
    public class202(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3317 = arg0;
        this.field3316 = arg1;
        this.field3315 = arg2;
        this.field3314 = arg3;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I[BIIZ)V")
    public class202(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3317 = arg0;
        this.field3316 = arg1;
        this.field3315 = arg2;
        this.field3314 = arg3;
        this.field3313 = arg4;
    }
}
