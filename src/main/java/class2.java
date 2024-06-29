import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field22 = 0;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ld;ILjava/awt/Canvas;I)Lha;")
    public static final class66 method12(class159 arg0, int arg1, Canvas arg2, int arg3) {
        field23++;
        return arg3 > -21 ? null : new class280(arg2, arg0, arg1);
    }
}
