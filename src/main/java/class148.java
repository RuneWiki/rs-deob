import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class148 extends class371 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(FI)V", line = 6)
    public final void method1017(float arg0, int arg1) {
        if (arg1 != -14822) {
            return;
        }
        int var3 = Float.floatToRawIntBits(arg0);
        this.field5258[this.field5273++] = (byte) var3;
        this.field5258[this.field5273++] = (byte) (var3 >> 8);
        this.field5258[this.field5273++] = (byte) (var3 >> 16);
        this.field5258[this.field5273++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I)V", line = 19)
    public class148(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IF)V", line = 24)
    public final void method1018(int arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field5258[this.field5273++] = (byte) (var3 >> 24);
        this.field5258[this.field5273++] = (byte) (var3 >> 16);
        this.field5258[this.field5273++] = (byte) (var3 >> 8);
        if (arg0 == -12641) {
            this.field5258[this.field5273++] = (byte) var3;
        }
    }
}
