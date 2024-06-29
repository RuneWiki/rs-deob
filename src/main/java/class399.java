import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class399 extends class32 {

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V", line = 3)
    public class399(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(FI)V", line = 7)
    public final void method2421(float arg0, int arg1) {
        if (arg1 != -2062917296) {
            return;
        }
        int var3 = Float.floatToRawIntBits(arg0);
        this.field472[this.field456++] = (byte) var3;
        this.field472[this.field456++] = (byte) (var3 >> 8);
        this.field472[this.field456++] = (byte) (var3 >> 16);
        this.field472[this.field456++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(FI)V", line = 23)
    public final void method2422(float arg0, int arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        if (arg1 != 22553) {
            this.method2421(0.37010893F, 111);
        }
        this.field472[this.field456++] = (byte) (var3 >> 24);
        this.field472[this.field456++] = (byte) (var3 >> 16);
        this.field472[this.field456++] = (byte) (var3 >> 8);
        this.field472[this.field456++] = (byte) var3;
    }
}
