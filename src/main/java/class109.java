import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 extends class19 {

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "[B")
    public byte[] field2588;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Z")
    public boolean field2587;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lvb;)Lpe;")
    public final class109 method866(class148 arg0) {
        this.field2588 = arg0.method1126(127, this.field2588);
        this.field2586 = arg0.method1125(this.field2586, true);
        if (this.field2589 == this.field2585) {
            this.field2585 = this.field2589 = arg0.method1124((byte) -85, this.field2585);
        } else {
            this.field2585 = arg0.method1124((byte) -56, this.field2585);
            this.field2589 = arg0.method1124((byte) -116, this.field2589);
            if (this.field2589 == this.field2585) {
                this.field2585--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I[BII)V")
    public class109(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2586 = arg0;
        this.field2588 = arg1;
        this.field2585 = arg2;
        this.field2589 = arg3;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I[BIIZ)V")
    public class109(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2586 = arg0;
        this.field2588 = arg1;
        this.field2585 = arg2;
        this.field2589 = arg3;
        this.field2587 = arg4;
    }
}
