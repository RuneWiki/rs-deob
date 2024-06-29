import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class362 extends class265 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(FB)V")
    public final void method2375(float arg0, byte arg1) {
        if (arg1 != -30) {
            this.method2375(1.1401689F, (byte) -113);
        }
        int var3 = Float.floatToRawIntBits(arg0);
        this.field3879[this.field3915++] = (byte) var3;
        this.field3879[this.field3915++] = (byte) (var3 >> 8);
        this.field3879[this.field3915++] = (byte) (var3 >> 16);
        this.field3879[this.field3915++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(FB)V")
    public final void method2376(float arg0, byte arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        this.field3879[this.field3915++] = (byte) (var3 >> 24);
        if (arg1 == 126) {
            this.field3879[this.field3915++] = (byte) (var3 >> 16);
            this.field3879[this.field3915++] = (byte) (var3 >> 8);
            this.field3879[this.field3915++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
    public class362(int arg0) {
        super(arg0);
    }
}
