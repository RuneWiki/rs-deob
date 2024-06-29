import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class298 extends class661 {

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[B")
    public byte[] field3910;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Z")
    public boolean field3911;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lifa;)Lwb;", line = 4)
    public final class298 method1691(class388 arg0) {
        this.field3910 = arg0.method2122((byte) -44, this.field3910);
        this.field3912 = arg0.method2126(false, this.field3912);
        if (this.field3913 == this.field3909) {
            this.field3909 = this.field3913 = arg0.method2124(this.field3909, -105);
        } else {
            this.field3909 = arg0.method2124(this.field3909, -123);
            this.field3913 = arg0.method2124(this.field3913, 67);
            if (this.field3913 == this.field3909) {
                this.field3909--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class298(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3912 = arg0;
        this.field3910 = arg1;
        this.field3909 = arg2;
        this.field3913 = arg3;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class298(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3912 = arg0;
        this.field3910 = arg1;
        this.field3909 = arg2;
        this.field3913 = arg3;
        this.field3911 = arg4;
    }
}
