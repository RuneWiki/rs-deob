import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class305 extends class333 {

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "[B")
    public byte[] field3899;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Z")
    public boolean field3902;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lav;)Ljc;", line = 9)
    public final class305 method1793(class453 arg0) {
        this.field3899 = arg0.method2702((byte) 127, this.field3899);
        this.field3901 = arg0.method2699(this.field3901, 8);
        if (this.field3900 == this.field3898) {
            this.field3898 = this.field3900 = arg0.method2701(this.field3898, (byte) -118);
        } else {
            this.field3898 = arg0.method2701(this.field3898, (byte) -65);
            this.field3900 = arg0.method2701(this.field3900, (byte) -67);
            if (this.field3900 == this.field3898) {
                this.field3898--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class305(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3901 = arg0;
        this.field3899 = arg1;
        this.field3898 = arg2;
        this.field3900 = arg3;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class305(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3901 = arg0;
        this.field3899 = arg1;
        this.field3898 = arg2;
        this.field3900 = arg3;
        this.field3902 = arg4;
    }
}
