import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class167 extends class53 {

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "[B")
    public byte[] field3074;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public int field3078;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public int field3076;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Z")
    public boolean field3077;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lb;)Lqa;")
    public final class167 method1257(class58 arg0) {
        this.field3074 = arg0.method404(this.field3074, 14);
        this.field3075 = arg0.method403((byte) 126, this.field3075);
        if (this.field3078 == this.field3076) {
            this.field3078 = this.field3076 = arg0.method405(this.field3078, (byte) -81);
        } else {
            this.field3078 = arg0.method405(this.field3078, (byte) 100);
            this.field3076 = arg0.method405(this.field3076, (byte) 96);
            if (this.field3078 == this.field3076) {
                this.field3078--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I[BII)V")
    public class167(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3075 = arg0;
        this.field3074 = arg1;
        this.field3078 = arg2;
        this.field3076 = arg3;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I[BIIZ)V")
    public class167(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3075 = arg0;
        this.field3074 = arg1;
        this.field3078 = arg2;
        this.field3076 = arg3;
        this.field3077 = arg4;
    }
}
