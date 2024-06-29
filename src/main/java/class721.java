import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class721 {

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field10004 = 0;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field10003;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field10006;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "J")
    public static long field10005;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIII)V")
    public static final void method4050(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class540.field7565; var5++) {
            Rectangle var6 = class686.field9382[var5];
            if (var6.x + var6.width > arg4 && var6.x < arg0 + arg4 && arg3 < var6.y + var6.height && var6.y < arg3 + arg1) {
                class583.field8210[var5] = true;
            }
        }
        field10002++;
        class189.method1186(arg3 + arg1, arg0 + arg4, (byte) -111, arg4, arg3);
        if (arg2 != -17012) {
            method4051(-123);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public static final void method4051(int arg0) {
        field10003++;
        if (arg0 != -19310) {
            return;
        }
        if (class268.field3824 != null) {
            class268.field3824.method3990((byte) 118);
        }
        if (class461.field6497 == null) {
            return;
        }
        while (true) {
            try {
                class461.field6497.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }
}
