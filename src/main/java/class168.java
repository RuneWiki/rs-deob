import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class168 extends class152 {

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public int field3037;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "[B")
    public byte[] field3035;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public int field3036;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Z")
    public boolean field3034;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljj;)Lpd;")
    public final class168 method1189(class108 arg0) {
        this.field3035 = arg0.method731(this.field3035, (byte) -128);
        this.field3037 = arg0.method729(this.field3037, 14);
        if (this.field3036 == this.field3033) {
            this.field3033 = this.field3036 = arg0.method730(this.field3033, 32768);
        } else {
            this.field3033 = arg0.method730(this.field3033, 32768);
            this.field3036 = arg0.method730(this.field3036, 32768);
            if (this.field3036 == this.field3033) {
                this.field3033--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[BII)V")
    public class168(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3037 = arg0;
        this.field3035 = arg1;
        this.field3033 = arg2;
        this.field3036 = arg3;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[BIIZ)V")
    public class168(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3037 = arg0;
        this.field3035 = arg1;
        this.field3033 = arg2;
        this.field3036 = arg3;
        this.field3034 = arg4;
    }
}
