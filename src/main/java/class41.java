import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class41 extends class385 {

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
    public class41(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IF)V")
    public final void method228(int arg0, float arg1) {
        if (arg0 != -1839018424) {
            this.method229(1.28527F, -14);
        }
        int var3 = Float.floatToRawIntBits(arg1);
        this.field5685[this.field5666++] = (byte) var3;
        this.field5685[this.field5666++] = (byte) (var3 >> 8);
        this.field5685[this.field5666++] = (byte) (var3 >> 16);
        this.field5685[this.field5666++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(FI)V")
    public final void method229(float arg0, int arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        this.field5685[this.field5666++] = (byte) (var3 >> 24);
        this.field5685[this.field5666++] = (byte) (var3 >> 16);
        int var4 = -106 / ((-arg1 - 83) / 33);
        this.field5685[this.field5666++] = (byte) (var3 >> 8);
        this.field5685[this.field5666++] = (byte) var3;
    }
}
