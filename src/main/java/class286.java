import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class286 extends class98 {

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public int field4901;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "[B")
    public byte[] field4900;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public int field4899;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public int field4902;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Z")
    public boolean field4903;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lg;)Lbe;", line = 8)
    public final class286 method1981(class151 arg0) {
        this.field4900 = arg0.method1094((byte) -85, this.field4900);
        this.field4901 = arg0.method1095(this.field4901, (byte) 81);
        if (this.field4902 == this.field4899) {
            this.field4899 = this.field4902 = arg0.method1099(89, this.field4899);
        } else {
            this.field4899 = arg0.method1099(89, this.field4899);
            this.field4902 = arg0.method1099(101, this.field4902);
            if (this.field4902 == this.field4899) {
                this.field4899--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class286(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4901 = arg0;
        this.field4900 = arg1;
        this.field4899 = arg2;
        this.field4902 = arg3;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class286(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4901 = arg0;
        this.field4900 = arg1;
        this.field4899 = arg2;
        this.field4902 = arg3;
        this.field4903 = arg4;
    }
}
