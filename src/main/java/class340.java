import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class340 extends class211 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(FI)V")
    public final void method2186(float arg0, int arg1) {
        if (arg1 != 21090) {
            return;
        }
        int var3 = Float.floatToRawIntBits(arg0);
        this.field2867[this.field2888++] = (byte) (var3 >> 24);
        this.field2867[this.field2888++] = (byte) (var3 >> 16);
        this.field2867[this.field2888++] = (byte) (var3 >> 8);
        this.field2867[this.field2888++] = (byte) var3;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
    public class340(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(FI)V")
    public final void method2187(float arg0, int arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        this.field2867[this.field2888++] = (byte) var3;
        if (arg1 == -16092) {
            this.field2867[this.field2888++] = (byte) (var3 >> 8);
            this.field2867[this.field2888++] = (byte) (var3 >> 16);
            this.field2867[this.field2888++] = (byte) (var3 >> 24);
        }
    }
}
