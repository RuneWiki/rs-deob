import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class224 extends class195 {

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "[B")
    public byte[] field3920;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public int field3918;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public int field3919;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Z")
    public boolean field3917;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lnh;)Ldk;")
    public final class224 method1538(class270 arg0) {
        this.field3920 = arg0.method1824(79, this.field3920);
        this.field3921 = arg0.method1822(this.field3921, (byte) -91);
        if (this.field3919 == this.field3918) {
            this.field3918 = this.field3919 = arg0.method1823(this.field3918, 116);
        } else {
            this.field3918 = arg0.method1823(this.field3918, 113);
            this.field3919 = arg0.method1823(this.field3919, 126);
            if (this.field3919 == this.field3918) {
                this.field3918--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I[BII)V")
    public class224(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3921 = arg0;
        this.field3920 = arg1;
        this.field3918 = arg2;
        this.field3919 = arg3;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I[BIIZ)V")
    public class224(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3921 = arg0;
        this.field3920 = arg1;
        this.field3918 = arg2;
        this.field3919 = arg3;
        this.field3917 = arg4;
    }
}
