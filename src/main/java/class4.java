import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 implements class70 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 3)
    public final void method14(int arg0) {
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V", line = 5)
    public final void method15() {
        if (class162.field2241) {
            class250.method1819(true);
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()I", line = 10)
    public final int method16() {
        return 0;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()V", line = 13)
    public final void method17() {
        if (class162.field2241) {
            class250.method1819(false);
        }
    }
}
