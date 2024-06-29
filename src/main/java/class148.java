import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class148 extends class183 {

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public int field2055;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "[B")
    public byte[] field2054;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "Z")
    public boolean field2057;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lpp;)Lct;", line = 10)
    public final class148 method1051(class396 arg0) {
        this.field2054 = arg0.method2227(21096, this.field2054);
        this.field2055 = arg0.method2230(this.field2055, (byte) 26);
        if (this.field2058 == this.field2056) {
            this.field2056 = this.field2058 = arg0.method2226(this.field2056, (byte) 57);
        } else {
            this.field2056 = arg0.method2226(this.field2056, (byte) 57);
            this.field2058 = arg0.method2226(this.field2058, (byte) 57);
            if (this.field2058 == this.field2056) {
                this.field2056--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class148(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2055 = arg0;
        this.field2054 = arg1;
        this.field2056 = arg2;
        this.field2058 = arg3;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class148(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2055 = arg0;
        this.field2054 = arg1;
        this.field2056 = arg2;
        this.field2058 = arg3;
        this.field2057 = arg4;
    }
}
