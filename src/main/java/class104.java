import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class104 extends class236 {

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(I)V")
    public class104(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZF)V")
    public final void method575(boolean arg0, float arg1) {
        if (arg0) {
            return;
        }
        int var3 = Float.floatToRawIntBits(arg1);
        this.field3364[this.field3320++] = (byte) var3;
        this.field3364[this.field3320++] = (byte) (var3 >> 8);
        this.field3364[this.field3320++] = (byte) (var3 >> 16);
        this.field3364[this.field3320++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IF)V")
    public final void method576(int arg0, float arg1) {
        if (arg0 != 239332760) {
            this.method576(-35, 0.4742597F);
        }
        int var3 = Float.floatToRawIntBits(arg1);
        this.field3364[this.field3320++] = (byte) (var3 >> 24);
        this.field3364[this.field3320++] = (byte) (var3 >> 16);
        this.field3364[this.field3320++] = (byte) (var3 >> 8);
        this.field3364[this.field3320++] = (byte) var3;
    }
}
