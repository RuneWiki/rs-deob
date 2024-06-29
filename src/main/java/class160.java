import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class160 extends class228 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IF)V")
    public final void method990(int arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field3040[this.field3029++] = (byte) (var3 >> 24);
        this.field3040[this.field3029++] = (byte) (var3 >> 16);
        this.field3040[this.field3029++] = (byte) (var3 >> 8);
        if (arg0 == 13302) {
            this.field3040[this.field3029++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
    public class160(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(FB)V")
    public final void method991(float arg0, byte arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        this.field3040[this.field3029++] = (byte) var3;
        if (arg1 == -57) {
            this.field3040[this.field3029++] = (byte) (var3 >> 8);
            this.field3040[this.field3029++] = (byte) (var3 >> 16);
            this.field3040[this.field3029++] = (byte) (var3 >> 24);
        }
    }
}
