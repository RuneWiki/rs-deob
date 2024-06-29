import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class120 extends class137 {

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public int field2655;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "[B")
    public byte[] field2656;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public int field2653;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "Z")
    public boolean field2654;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lpf;)Lnc;")
    public final class120 method925(class141 arg0) {
        this.field2656 = arg0.method1016(12020, this.field2656);
        this.field2655 = arg0.method1013(this.field2655, (byte) 28);
        if (this.field2653 == this.field2652) {
            this.field2653 = this.field2652 = arg0.method1017(6, this.field2653);
        } else {
            this.field2653 = arg0.method1017(6, this.field2653);
            this.field2652 = arg0.method1017(6, this.field2652);
            if (this.field2653 == this.field2652) {
                this.field2653--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I[BII)V")
    public class120(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2655 = arg0;
        this.field2656 = arg1;
        this.field2653 = arg2;
        this.field2652 = arg3;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class120(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2655 = arg0;
        this.field2656 = arg1;
        this.field2653 = arg2;
        this.field2652 = arg3;
        this.field2654 = arg4;
    }
}
