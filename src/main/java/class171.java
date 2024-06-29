import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class171 extends class110 {

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "[B")
    public byte[] field2999;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Z")
    public boolean field3001;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lff;)Lei;")
    public final class171 method1191(class18 arg0) {
        this.field2999 = arg0.method141((byte) 75, this.field2999);
        this.field3003 = arg0.method136(-30345, this.field3003);
        if (this.field3002 == this.field3000) {
            this.field3002 = this.field3000 = arg0.method139(1, this.field3002);
        } else {
            this.field3002 = arg0.method139(1, this.field3002);
            this.field3000 = arg0.method139(1, this.field3000);
            if (this.field3002 == this.field3000) {
                this.field3002--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I[BII)V")
    public class171(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3003 = arg0;
        this.field2999 = arg1;
        this.field3002 = arg2;
        this.field3000 = arg3;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I[BIIZ)V")
    public class171(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3003 = arg0;
        this.field2999 = arg1;
        this.field3002 = arg2;
        this.field3000 = arg3;
        this.field3001 = arg4;
    }
}
