import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class212 extends class26 {

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public int field3845;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "[B")
    public byte[] field3843;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public int field3847;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "Z")
    public boolean field3844;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lcg;)Lsh;")
    public final class212 method1497(class165 arg0) {
        this.field3843 = arg0.method1143(this.field3843, -118);
        this.field3845 = arg0.method1141(true, this.field3845);
        if (this.field3847 == this.field3846) {
            this.field3846 = this.field3847 = arg0.method1138(this.field3846, 39);
        } else {
            this.field3846 = arg0.method1138(this.field3846, 6);
            this.field3847 = arg0.method1138(this.field3847, 99);
            if (this.field3847 == this.field3846) {
                this.field3846--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I[BII)V")
    public class212(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3845 = arg0;
        this.field3843 = arg1;
        this.field3846 = arg2;
        this.field3847 = arg3;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I[BIIZ)V")
    public class212(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3845 = arg0;
        this.field3843 = arg1;
        this.field3846 = arg2;
        this.field3847 = arg3;
        this.field3844 = arg4;
    }
}
