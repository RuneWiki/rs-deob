import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class500 extends class634 {

    @OriginalMember(owner = "client!pga", name = "u", descriptor = "I")
    public int field6237 = (int) (class321.method1854(-122) / 1000L);

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "Ljava/lang/String;")
    public String field6236;

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "S")
    public short field6233;

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "Lws;")
    public static class333 field6235 = new class333();

    @OriginalMember(owner = "client!pga", name = "w", descriptor = "Z")
    public static boolean field6239 = false;

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!pga", name = "v", descriptor = "[I")
    public static int[] field6238;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method2723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6234++;
        if (arg5 >= -79) {
            return false;
        } else if (arg7 < (arg0 + arg1) && arg1 < (arg4 + arg7)) {
            return arg3 < arg8 + arg2 && arg3 + arg6 > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(B)V")
    public static void method2724(byte arg0) {
        field6235 = null;
        int var1 = 36 % ((arg0 + 38) / 52);
        field6238 = null;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lpv;III)V")
    public static final void method2725(class66 arg0, int arg1, int arg2, int arg3) {
        long var4 = class189.field2250[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field794 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field797[arg0.field794++] = class370.field4785[var8 - 1].field8960;
            var6 += 16L;
        }
        for (int var9 = arg0.field794; var9 < 4; var9++) {
            arg0.field797[var9] = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class500(String arg0, int arg1) {
        this.field6236 = arg0;
        this.field6233 = (short) arg1;
    }
}
