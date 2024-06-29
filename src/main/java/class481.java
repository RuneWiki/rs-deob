import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class481 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
    public static boolean field6989 = false;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lqv;")
    public static class316 field6988 = new class316(108, -1);

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lqt;")
    public static class459 field6990 = new class459(28, 3);

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6991;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method2842(byte arg0) {
        if (arg0 > -90) {
            field6988 = null;
        }
        field6990 = null;
        field6988 = null;
        field6991 = null;
    }
}
