import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class60 extends class276 {

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IF)V")
    public final void method373(int arg0, float arg1) {
        if (arg0 > -105) {
            this.method374(-0.7491902F, (byte) -65);
        }
        int var3 = Float.floatToRawIntBits(arg1);
        this.field4064[this.field4021++] = (byte) var3;
        this.field4064[this.field4021++] = (byte) (var3 >> 8);
        this.field4064[this.field4021++] = (byte) (var3 >> 16);
        this.field4064[this.field4021++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
    public class60(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(FB)V")
    public final void method374(float arg0, byte arg1) {
        if (arg1 > -42) {
            this.method374(-2.35302F, (byte) -98);
        }
        int var3 = Float.floatToRawIntBits(arg0);
        this.field4064[this.field4021++] = (byte) (var3 >> 24);
        this.field4064[this.field4021++] = (byte) (var3 >> 16);
        this.field4064[this.field4021++] = (byte) (var3 >> 8);
        this.field4064[this.field4021++] = (byte) var3;
    }
}
