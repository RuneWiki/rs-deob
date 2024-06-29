import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class84 implements class243 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 3)
    public final void method161(int arg0) {
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "()V", line = 5)
    public final void method162() {
        if (class116.field1970) {
            class47.method321(false);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "()I", line = 10)
    public final int method163() {
        return 0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V", line = 15)
    public final void method164() {
        if (class116.field1970) {
            class47.method321(true);
        }
    }
}
