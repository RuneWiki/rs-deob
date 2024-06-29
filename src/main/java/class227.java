import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class227 extends class19 {

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public int field3961;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "[B")
    public byte[] field3960;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public int field3963;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Z")
    public boolean field3962;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lhf;)Lck;", line = 5)
    public final class227 method1559(class191 arg0) {
        this.field3960 = arg0.method1279(44, this.field3960);
        this.field3961 = arg0.method1285(18430, this.field3961);
        if (this.field3964 == this.field3963) {
            this.field3963 = this.field3964 = arg0.method1281(this.field3963, 0);
        } else {
            this.field3963 = arg0.method1281(this.field3963, 0);
            this.field3964 = arg0.method1281(this.field3964, 0);
            if (this.field3964 == this.field3963) {
                this.field3963--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class227(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3961 = arg0;
        this.field3960 = arg1;
        this.field3963 = arg2;
        this.field3964 = arg3;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class227(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3961 = arg0;
        this.field3960 = arg1;
        this.field3963 = arg2;
        this.field3964 = arg3;
        this.field3962 = arg4;
    }
}
