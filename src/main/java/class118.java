import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class118 extends class37 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BF)V", line = 5)
    public final void method997(byte arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field578[this.field565++] = (byte) (var3 >> 24);
        if (arg0 != -75) {
            this.method998((byte) -71, -0.7106005F);
        }
        this.field578[this.field565++] = (byte) (var3 >> 16);
        this.field578[this.field565++] = (byte) (var3 >> 8);
        this.field578[this.field565++] = (byte) var3;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(BF)V", line = 20)
    public final void method998(byte arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field578[this.field565++] = (byte) var3;
        int var4 = 110 / ((6 - arg0) / 54);
        this.field578[this.field565++] = (byte) (var3 >> 8);
        this.field578[this.field565++] = (byte) (var3 >> 16);
        this.field578[this.field565++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(I)V", line = 32)
    public class118(int arg0) {
        super(arg0);
    }
}
