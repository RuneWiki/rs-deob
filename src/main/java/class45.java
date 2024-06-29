import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class45 extends class289 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(FI)V")
    public final void method414(float arg0, int arg1) {
        int var3 = 91 % ((arg1 + 76) / 35);
        int var4 = Float.floatToRawIntBits(arg0);
        this.field3882[this.field3938++] = (byte) (var4 >> 24);
        this.field3882[this.field3938++] = (byte) (var4 >> 16);
        this.field3882[this.field3938++] = (byte) (var4 >> 8);
        this.field3882[this.field3938++] = (byte) var4;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(I)V")
    public class45(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(FZ)V")
    public final void method415(float arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        int var3 = Float.floatToRawIntBits(arg0);
        this.field3882[this.field3938++] = (byte) var3;
        this.field3882[this.field3938++] = (byte) (var3 >> 8);
        this.field3882[this.field3938++] = (byte) (var3 >> 16);
        this.field3882[this.field3938++] = (byte) (var3 >> 24);
    }
}
