import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class402 extends class425 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(FI)V")
    public final void method2376(float arg0, int arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        this.field5886[this.field5830++] = (byte) var3;
        if (arg1 <= -124) {
            this.field5886[this.field5830++] = (byte) (var3 >> 8);
            this.field5886[this.field5830++] = (byte) (var3 >> 16);
            this.field5886[this.field5830++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(FB)V")
    public final void method2377(float arg0, byte arg1) {
        if (arg1 != 70) {
            return;
        }
        int var3 = Float.floatToRawIntBits(arg0);
        this.field5886[this.field5830++] = (byte) (var3 >> 24);
        this.field5886[this.field5830++] = (byte) (var3 >> 16);
        this.field5886[this.field5830++] = (byte) (var3 >> 8);
        this.field5886[this.field5830++] = (byte) var3;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V")
    public class402(int arg0) {
        super(arg0);
    }
}
