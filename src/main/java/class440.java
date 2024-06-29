import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class440 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field5535 = 0;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Ldr;")
    public static class675 field5537 = new class675(51, 2);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "J")
    public static long field5534;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
    public static int[] field5536;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLe;Ljava/awt/Canvas;B)Loa;", line = 12)
    public static final class650 method2415(boolean arg0, class498 arg1, Canvas arg2, byte arg3) {
        field5538++;
        if (arg3 != 2) {
            method2416(-35);
        }
        return arg0 ? new class475(arg2, arg1) : new class150(arg2, arg1);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 27)
    public static void method2416(int arg0) {
        field5537 = null;
        if (arg0 == 0) {
            field5536 = null;
        }
    }
}
