import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class468 extends class222 {

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lce;I)Lce;")
    public final class202 method1380(class202 arg0, int arg1) {
        if (arg1 < 12) {
            this.method1380(null, 31);
        }
        return new class529(arg0.method1039(0), arg0.field2843);
    }
}
