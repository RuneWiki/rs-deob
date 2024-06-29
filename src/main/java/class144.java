import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class144 extends class106 {

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[B")
    public byte[] field2263;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public int field2264;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Z")
    public boolean field2265;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lrd;)Loc;", line = 7)
    public final class144 method1095(class173 arg0) {
        this.field2263 = arg0.method1277(0, this.field2263);
        this.field2266 = arg0.method1280(-1, this.field2266);
        if (this.field2264 == this.field2262) {
            this.field2264 = this.field2262 = arg0.method1283((byte) -118, this.field2264);
        } else {
            this.field2264 = arg0.method1283((byte) 119, this.field2264);
            this.field2262 = arg0.method1283((byte) 75, this.field2262);
            if (this.field2264 == this.field2262) {
                this.field2264--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class144(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2266 = arg0;
        this.field2263 = arg1;
        this.field2264 = arg2;
        this.field2262 = arg3;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class144(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2266 = arg0;
        this.field2263 = arg1;
        this.field2264 = arg2;
        this.field2262 = arg3;
        this.field2265 = arg4;
    }
}
