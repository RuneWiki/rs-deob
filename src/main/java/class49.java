import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class49 extends class256 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BF)V", line = 5)
    public final void method388(byte arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field3764[this.field3762++] = (byte) var3;
        if (arg0 == 56) {
            this.field3764[this.field3762++] = (byte) (var3 >> 8);
            this.field3764[this.field3762++] = (byte) (var3 >> 16);
            this.field3764[this.field3762++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IF)V", line = 20)
    public final void method389(int arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field3764[this.field3762++] = (byte) (var3 >> 24);
        this.field3764[this.field3762++] = (byte) (var3 >> 16);
        this.field3764[this.field3762++] = (byte) (var3 >> 8);
        int var4 = -69 % ((-arg0 - 19) / 33);
        this.field3764[this.field3762++] = (byte) var3;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I)V", line = 32)
    public class49(int arg0) {
        super(arg0);
    }
}
