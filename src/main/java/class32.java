import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class32 extends class224 {

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "[B")
    public byte[] field482;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Z")
    public boolean field486;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lk;)Lhb;", line = 5)
    public final class32 method217(class221 arg0) {
        this.field482 = arg0.method1453((byte) 124, this.field482);
        this.field484 = arg0.method1451(this.field484, -1981);
        if (this.field485 == this.field483) {
            this.field485 = this.field483 = arg0.method1454(this.field485, 25934);
        } else {
            this.field485 = arg0.method1454(this.field485, 25934);
            this.field483 = arg0.method1454(this.field483, 25934);
            if (this.field485 == this.field483) {
                this.field485--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class32(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field484 = arg0;
        this.field482 = arg1;
        this.field485 = arg2;
        this.field483 = arg3;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class32(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field484 = arg0;
        this.field482 = arg1;
        this.field485 = arg2;
        this.field483 = arg3;
        this.field486 = arg4;
    }
}
