import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class160 extends class161 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(FI)V")
    public final void method1131(float arg0, int arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        this.field2262[this.field2298++] = (byte) (var3 >> 24);
        this.field2262[this.field2298++] = (byte) (var3 >> 16);
        this.field2262[this.field2298++] = (byte) (var3 >> 8);
        if (arg1 <= -107) {
            this.field2262[this.field2298++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V")
    public class160(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BF)V")
    public final void method1132(byte arg0, float arg1) {
        if (arg0 != 87) {
            return;
        }
        int var3 = Float.floatToRawIntBits(arg1);
        this.field2262[this.field2298++] = (byte) var3;
        this.field2262[this.field2298++] = (byte) (var3 >> 8);
        this.field2262[this.field2298++] = (byte) (var3 >> 16);
        this.field2262[this.field2298++] = (byte) (var3 >> 24);
    }
}
