import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class64 extends class183 {

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "[B")
    public byte[] field1199;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "Z")
    public boolean field1198;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lhl;)Lcd;", line = 3)
    public final class64 method519(class61 arg0) {
        this.field1199 = arg0.method510(this.field1199, 15402);
        this.field1201 = arg0.method508(this.field1201, (byte) -69);
        if (this.field1202 == this.field1200) {
            this.field1200 = this.field1202 = arg0.method507(this.field1200, (byte) 36);
        } else {
            this.field1200 = arg0.method507(this.field1200, (byte) 36);
            this.field1202 = arg0.method507(this.field1202, (byte) 36);
            if (this.field1202 == this.field1200) {
                this.field1200--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class64(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1201 = arg0;
        this.field1199 = arg1;
        this.field1200 = arg2;
        this.field1202 = arg3;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class64(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1201 = arg0;
        this.field1199 = arg1;
        this.field1200 = arg2;
        this.field1202 = arg3;
        this.field1198 = arg4;
    }
}
