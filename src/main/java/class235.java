import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class235 {

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lgh;")
    public static class388 field3629 = null;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field3628 = 1338;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "Lh;")
    public static class474 field3626;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static void method1542(int arg0) {
        if (arg0 != 1542) {
            field3628 = 48;
        }
        field3626 = null;
        field3629 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIB)V")
    public static final void method1543(int arg0, int arg1, int arg2, byte arg3) {
        field3625++;
        class335.field5062.method1862((byte) -115, arg2);
        class335.field5062.method1853(arg0, 14);
        if (arg3 > 7) {
            class335.field5062.method1853(arg1, 84);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/awt/Canvas;BILl;)Lza;")
    public static final class288 method1544(Canvas arg0, byte arg1, int arg2, class16 arg3) {
        if (arg1 == 34) {
            field3627++;
            return new class167(arg2, arg0, arg3);
        } else {
            return null;
        }
    }
}
