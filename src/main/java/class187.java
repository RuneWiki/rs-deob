import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class187 extends class193 {

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "[B")
    public byte[] field2942;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public int field2943;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Z")
    public boolean field2944;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lhm;)Lrk;", line = 8)
    public final class187 method1358(class22 arg0) {
        this.field2942 = arg0.method220(this.field2942, 14);
        this.field2940 = arg0.method221(this.field2940, (byte) -79);
        if (this.field2943 == this.field2941) {
            this.field2941 = this.field2943 = arg0.method218(88, this.field2941);
        } else {
            this.field2941 = arg0.method218(60, this.field2941);
            this.field2943 = arg0.method218(125, this.field2943);
            if (this.field2943 == this.field2941) {
                this.field2941--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class187(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2940 = arg0;
        this.field2942 = arg1;
        this.field2941 = arg2;
        this.field2943 = arg3;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class187(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2940 = arg0;
        this.field2942 = arg1;
        this.field2941 = arg2;
        this.field2943 = arg3;
        this.field2944 = arg4;
    }
}
