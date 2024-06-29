import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class292 extends class446 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(FB)V")
    public final void method1841(float arg0, byte arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        this.field6316[this.field6315++] = (byte) var3;
        this.field6316[this.field6315++] = (byte) (var3 >> 8);
        this.field6316[this.field6315++] = (byte) (var3 >> 16);
        this.field6316[this.field6315++] = (byte) (var3 >> 24);
        int var4 = 98 / ((2 - arg1) / 52);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BF)V")
    public final void method1842(byte arg0, float arg1) {
        if (arg0 != -64) {
            return;
        }
        int var3 = Float.floatToRawIntBits(arg1);
        this.field6316[this.field6315++] = (byte) (var3 >> 24);
        this.field6316[this.field6315++] = (byte) (var3 >> 16);
        this.field6316[this.field6315++] = (byte) (var3 >> 8);
        this.field6316[this.field6315++] = (byte) var3;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
    public class292(int arg0) {
        super(arg0);
    }
}
