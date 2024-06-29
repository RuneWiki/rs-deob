import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class111 extends class341 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(FI)V", line = 5)
    public final void method826(float arg0, int arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        this.field5042[this.field5049++] = (byte) (var3 >> 24);
        this.field5042[this.field5049++] = (byte) (var3 >> 16);
        this.field5042[this.field5049++] = (byte) (var3 >> 8);
        this.field5042[this.field5049++] = (byte) var3;
        if (arg1 == 2107956560) {
            ;
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(I)V", line = 18)
    public class111(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IF)V", line = 24)
    public final void method827(int arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field5042[this.field5049++] = (byte) var3;
        this.field5042[this.field5049++] = (byte) (var3 >> 8);
        if (arg0 == 1300078504) {
            this.field5042[this.field5049++] = (byte) (var3 >> 16);
            this.field5042[this.field5049++] = (byte) (var3 >> 24);
        }
    }
}
