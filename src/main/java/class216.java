import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class216 extends class73 {

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "[B")
    public byte[] field3963;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public int field3960;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Z")
    public boolean field3961;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lca;)Lce;")
    public final class216 method1486(class82 arg0) {
        this.field3963 = arg0.method469(this.field3963, (byte) -97);
        this.field3964 = arg0.method471(this.field3964, 14);
        if (this.field3962 == this.field3960) {
            this.field3962 = this.field3960 = arg0.method473(this.field3962, 6);
        } else {
            this.field3962 = arg0.method473(this.field3962, 6);
            this.field3960 = arg0.method473(this.field3960, 6);
            if (this.field3962 == this.field3960) {
                this.field3962--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I[BII)V")
    public class216(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3964 = arg0;
        this.field3963 = arg1;
        this.field3962 = arg2;
        this.field3960 = arg3;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I[BIIZ)V")
    public class216(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3964 = arg0;
        this.field3963 = arg1;
        this.field3962 = arg2;
        this.field3960 = arg3;
        this.field3961 = arg4;
    }
}
