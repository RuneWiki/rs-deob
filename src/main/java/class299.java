import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class299 extends class366 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BF)V")
    public final void method1823(byte arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field5076[this.field5048++] = (byte) (var3 >> 24);
        this.field5076[this.field5048++] = (byte) (var3 >> 16);
        if (arg0 >= -63) {
            this.method1824(-0.25052348F, 44);
        }
        this.field5076[this.field5048++] = (byte) (var3 >> 8);
        this.field5076[this.field5048++] = (byte) var3;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I)V")
    public class299(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(FI)V")
    public final void method1824(float arg0, int arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        this.field5076[this.field5048++] = (byte) var3;
        this.field5076[this.field5048++] = (byte) (var3 >> 8);
        if (arg1 != 10330) {
            this.method1823((byte) 33, -0.38481128F);
        }
        this.field5076[this.field5048++] = (byte) (var3 >> 16);
        this.field5076[this.field5048++] = (byte) (var3 >> 24);
    }
}
