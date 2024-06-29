import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class22 extends class320 {

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "Z")
    public boolean field347 = false;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "Z")
    public boolean field340 = false;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
    public int field349 = -1;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "[Lug;")
    public static class25[] field337 = new class25[2048];

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "Ljava/util/Calendar;")
    public static Calendar field346 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "[J")
    public static long[] field350 = new long[32];

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "[[B")
    public static byte[][] field336;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIIII)Z", line = 6)
    public static final boolean method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)V", line = 42)
    public static final void method234(int arg0, int arg1) {
        class138 var2 = class149.method1242(arg0, 0, 6);
        field341++;
        if (arg1 < -107) {
            var2.method1152(125);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V", line = 58)
    public static void method235(boolean arg0) {
        field336 = (byte[][]) null;
        field337 = null;
        if (arg0) {
            field346 = null;
            field350 = null;
        }
    }
}
