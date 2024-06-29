import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class4 extends class239 {

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "[B")
    public byte[] field34;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "Z")
    public boolean field33;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljda;)Lar;", line = 8)
    public final class4 method10(class275 arg0) {
        this.field34 = arg0.method1772((byte) -21, this.field34);
        this.field35 = arg0.method1771((byte) 40, this.field35);
        if (this.field32 == this.field31) {
            this.field32 = this.field31 = arg0.method1775((byte) -128, this.field32);
        } else {
            this.field32 = arg0.method1775((byte) -128, this.field32);
            this.field31 = arg0.method1775((byte) -128, this.field31);
            if (this.field32 == this.field31) {
                this.field32--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class4(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field35 = arg0;
        this.field34 = arg1;
        this.field32 = arg2;
        this.field31 = arg3;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class4(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field35 = arg0;
        this.field34 = arg1;
        this.field32 = arg2;
        this.field31 = arg3;
        this.field33 = arg4;
    }
}
