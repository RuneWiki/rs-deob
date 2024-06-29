import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class184 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2846 = "glow1:";

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lre;")
    public static class228 field2847 = null;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method1244(byte arg0) {
        field2847 = null;
        field2846 = null;
        if (arg0 != 31) {
            method1245(false, true, -34, false, 40, 31, 86);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZZIZIII)V")
    public static final void method1245(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg1) {
            method1245(false, true, 35, true, -69, -78, 9);
        }
        if (arg2 > arg5) {
            int var7 = (arg5 + arg2) / 2;
            int var8 = arg5;
            class284 var9 = class185.field2865[var7];
            class185.field2865[var7] = class185.field2865[arg2];
            class185.field2865[arg2] = var9;
            for (int var10 = arg5; var10 < arg2; var10++) {
                if (class269.method1811(class185.field2865[var10], arg4, true, arg3, arg6, arg0, var9) <= 0) {
                    class284 var11 = class185.field2865[var10];
                    class185.field2865[var10] = class185.field2865[var8];
                    class185.field2865[var8++] = var11;
                }
            }
            class185.field2865[arg2] = class185.field2865[var8];
            class185.field2865[var8] = var9;
            method1245(arg0, false, var8 - 1, arg3, arg4, arg5, arg6);
            method1245(arg0, false, arg2, arg3, arg4, var8 + 1, arg6);
        }
        field2848++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILhc;II)Led;")
    public static final class186 method1246(int arg0, class235 arg1, int arg2, int arg3) {
        field2850++;
        if (class212.method1440(arg0, arg1, arg3, 41)) {
            if (arg2 >= -6) {
                method1245(true, true, 57, false, 105, 37, -124);
            }
            return class293.method1960(-13810);
        } else {
            return null;
        }
    }
}
