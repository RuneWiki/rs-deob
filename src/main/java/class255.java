import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class255 extends class250 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(FZ)V", line = 5)
    public final void method1441(float arg0, boolean arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        if (arg1) {
            this.method1441(-1.4092135F, true);
        }
        this.field3406[this.field3389++] = (byte) var3;
        this.field3406[this.field3389++] = (byte) (var3 >> 8);
        this.field3406[this.field3389++] = (byte) (var3 >> 16);
        this.field3406[this.field3389++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IF)V", line = 20)
    public final void method1442(int arg0, float arg1) {
        if (arg0 > -126) {
            return;
        }
        int var3 = Float.floatToRawIntBits(arg1);
        this.field3406[this.field3389++] = (byte) (var3 >> 24);
        this.field3406[this.field3389++] = (byte) (var3 >> 16);
        this.field3406[this.field3389++] = (byte) (var3 >> 8);
        this.field3406[this.field3389++] = (byte) var3;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(I)V", line = 34)
    public class255(int arg0) {
        super(arg0);
    }
}
