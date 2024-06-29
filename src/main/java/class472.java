import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class472 extends class179 {

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V", line = 3)
    public class472(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZF)V", line = 7)
    public final void method2787(boolean arg0, float arg1) {
        if (!arg0) {
            return;
        }
        int var3 = Float.floatToRawIntBits(arg1);
        this.field2159[this.field2206++] = (byte) var3;
        this.field2159[this.field2206++] = (byte) (var3 >> 8);
        this.field2159[this.field2206++] = (byte) (var3 >> 16);
        this.field2159[this.field2206++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(FI)V", line = 24)
    public final void method2788(float arg0, int arg1) {
        if (arg1 != -1327473512) {
            this.method2787(false, 1.14206F);
        }
        int var3 = Float.floatToRawIntBits(arg0);
        this.field2159[this.field2206++] = (byte) (var3 >> 24);
        this.field2159[this.field2206++] = (byte) (var3 >> 16);
        this.field2159[this.field2206++] = (byte) (var3 >> 8);
        this.field2159[this.field2206++] = (byte) var3;
    }
}
