import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class770 extends InputStream {

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field10592 = 0;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "[I")
    public static int[] field10594 = new int[8];

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "B")
    public static byte field10595;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field10589;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field10590;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field10591;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field10593;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 7)
    public static void method4270(int arg0) {
        field10594 = null;
        int var1 = -65 % ((52 - arg0) / 55);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIII)Z", line = 22)
    public static final boolean method4271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10590++;
        if (arg4 != 30000) {
            method4270(-81);
        }
        int var7 = arg1 + arg5;
        int var8 = arg2 + arg3;
        int var9 = arg0 + arg6;
        if (!class774.method4301(var8, arg5, arg6, 127, var9, var9, var8, arg5, var7, var8)) {
            return false;
        } else if (class774.method4301(var8, arg5, arg6, 127, arg6, var9, var8, var7, var7, var8)) {
            if (arg5 >= class637.field8739) {
                if (!class774.method4301(arg2, var7, var9, 127, arg6, var9, var8, var7, var7, var8)) {
                    return false;
                }
                if (!class774.method4301(arg2, var7, var9, 127, arg6, arg6, var8, var7, var7, arg2)) {
                    return false;
                }
            } else if (!class774.method4301(arg2, arg5, var9, 127, arg6, var9, var8, arg5, arg5, var8)) {
                return false;
            } else if (!class774.method4301(arg2, arg5, var9, 127, arg6, arg6, var8, arg5, arg5, arg2)) {
                return false;
            }
            if (arg6 < class743.field10349) {
                if (!class774.method4301(arg2, arg5, arg6, arg4 ^ 0x754F, arg6, arg6, var8, arg5, var7, var8)) {
                    return false;
                }
                if (!class774.method4301(arg2, arg5, arg6, 127, arg6, arg6, var8, var7, var7, arg2)) {
                    return false;
                }
            } else if (!class774.method4301(arg2, arg5, var9, 127, var9, var9, var8, arg5, var7, var8)) {
                return false;
            } else if (!class774.method4301(arg2, arg5, var9, 127, var9, var9, var8, var7, var7, arg2)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fl", name = "read", descriptor = "()I", line = 96)
    public final int read() {
        field10593++;
        class594.method3405(30000L, 16711680);
        return -1;
    }
}
