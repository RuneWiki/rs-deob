import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class595 extends class494 {

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "[I")
    public static int[] field8437 = new int[50];

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field8439;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field8438;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIII)V")
    public static final void method3468(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg1 >= -91) {
            return;
        }
        while (var5 < class196.field2983) {
            Rectangle var6 = class184.field2816[var5];
            if ((var6.x + var6.width) > arg0 && (arg0 + arg3) > var6.x && arg2 < var6.y + var6.height && var6.y < (arg2 + arg4)) {
                class50.field715[var5] = true;
            }
            var5++;
        }
        field8441++;
        class497.method2963(arg2 + arg4, arg0 + arg3, (byte) 1, arg2, arg0);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
    public static void method3469(int arg0) {
        field8437 = null;
        if (arg0 == 0) {
            field8438 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)I")
    public static final int method3470(int arg0, int arg1) {
        if (arg0 <= 10) {
            field8439 = -5;
        }
        field8440++;
        return arg1 & 0xFF;
    }
}
