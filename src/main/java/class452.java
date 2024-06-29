import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class452 extends class496 {

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public int field6655;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "[B")
    public byte[] field6656;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public int field6654;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public int field6658;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "Z")
    public boolean field6657;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lec;)Lck;")
    public final class452 method2666(class157 arg0) {
        this.field6656 = arg0.method1048(-10001, this.field6656);
        this.field6655 = arg0.method1045(false, this.field6655);
        if (this.field6658 == this.field6654) {
            this.field6654 = this.field6658 = arg0.method1042(this.field6654, 6);
        } else {
            this.field6654 = arg0.method1042(this.field6654, 6);
            this.field6658 = arg0.method1042(this.field6658, 6);
            if (this.field6658 == this.field6654) {
                this.field6654--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I[BII)V")
    public class452(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field6655 = arg0;
        this.field6656 = arg1;
        this.field6654 = arg2;
        this.field6658 = arg3;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I[BIIZ)V")
    public class452(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field6655 = arg0;
        this.field6656 = arg1;
        this.field6654 = arg2;
        this.field6658 = arg3;
        this.field6657 = arg4;
    }
}
