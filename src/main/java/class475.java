import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class475 {

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "Ljd;")
    public static class408 field6949 = new class408(15, 0, 1, 0);

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "S")
    public static short field6951 = 205;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "F")
    public static float field6948;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "[Lf;")
    public static class404[] field6950;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
    public static void method2854(byte arg0) {
        field6950 = null;
        int var1 = 2 % ((arg0 - 44) / 45);
        field6949 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIII)V")
    public static final void method2855(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; var5 < class5.field43; var5++) {
            Rectangle var6 = class486.field7058[var5];
            if ((var6.x + var6.width) > arg2 && var6.x < arg2 + arg4 && arg1 < (var6.y + var6.height) && var6.y < (arg0 + arg1)) {
                class76.field967[var5] = true;
            }
        }
        field6947++;
    }
}
