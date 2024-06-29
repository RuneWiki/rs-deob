import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class245 extends class242 {

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
    public class245(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(FI)V")
    public final void method1607(float arg0, int arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        if (arg1 == -11107) {
            this.field3188[this.field3211++] = (byte) (var3 >> 24);
            this.field3188[this.field3211++] = (byte) (var3 >> 16);
            this.field3188[this.field3211++] = (byte) (var3 >> 8);
            this.field3188[this.field3211++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(FI)V")
    public final void method1608(float arg0, int arg1) {
        if (arg1 != 922092592) {
            return;
        }
        int var3 = Float.floatToRawIntBits(arg0);
        this.field3188[this.field3211++] = (byte) var3;
        this.field3188[this.field3211++] = (byte) (var3 >> 8);
        this.field3188[this.field3211++] = (byte) (var3 >> 16);
        this.field3188[this.field3211++] = (byte) (var3 >> 24);
    }
}
