import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class199 extends class521 {

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    public int field2909;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "[B")
    public byte[] field2908;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "I")
    public int field2911;

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
    public int field2910;

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "Z")
    public boolean field2912;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ldl;)Lbv;")
    public final class199 method1362(class44 arg0) {
        this.field2908 = arg0.method333(false, this.field2908);
        this.field2909 = arg0.method336(-19134, this.field2909);
        if (this.field2911 == this.field2910) {
            this.field2911 = this.field2910 = arg0.method335((byte) -111, this.field2911);
        } else {
            this.field2911 = arg0.method335((byte) -111, this.field2911);
            this.field2910 = arg0.method335((byte) -111, this.field2910);
            if (this.field2911 == this.field2910) {
                this.field2911--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I[BII)V")
    public class199(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2909 = arg0;
        this.field2908 = arg1;
        this.field2911 = arg2;
        this.field2910 = arg3;
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I[BIIZ)V")
    public class199(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2909 = arg0;
        this.field2908 = arg1;
        this.field2911 = arg2;
        this.field2910 = arg3;
        this.field2912 = arg4;
    }
}
