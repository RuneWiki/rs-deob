import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class193 {

    @OriginalMember(owner = "client!en", name = "e", descriptor = "Z")
    public static boolean field2811 = false;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "Len;")
    public class193 field2815;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "Len;")
    public class193 field2816;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Z")
    public static boolean field2808;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "[Lfb;")
    public static class252[] field2814;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIIIIIFII)[[I", line = 7)
    public static final int[][] method1388(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8) {
        class253 var9 = new class253();
        var9.field3772 = arg0;
        var9.field3783 = (int) (arg6 * 4096.0F);
        var9.field3786 = arg4;
        field2813++;
        var9.field3780 = arg2;
        var9.field3776 = arg5;
        var9.method22(-117);
        int[][] var10 = new int[arg8][arg1];
        class252.method1849(arg1, arg8, true);
        for (int var11 = arg7; var11 < arg8; var11++) {
            var9.method1854(true, var11, var10[var11]);
        }
        return var10;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 35)
    public final void method1389(int arg0) {
        if (arg0 != 4096) {
            method1391(-23, 60, -46, 100, -98, 106, 81, 21);
        }
        field2812++;
        if (this.field2816 != null) {
            this.field2816.field2815 = this.field2815;
            this.field2815.field2816 = this.field2816;
            this.field2816 = null;
            this.field2815 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 52)
    public static void method1390(int arg0) {
        field2814 = null;
        if (arg0 != 4096) {
            method1390(-6);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIII)V", line = 62)
    public static final void method1391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2809++;
        if (arg5 == arg7) {
            class185.method1285(arg3, arg5, (byte) -128, arg2, arg1, arg4, arg0);
            return;
        }
        if (arg6 > -88) {
            field2808 = true;
        }
        if ((arg3 - arg5) >= class355.field5452 && class348.field5378 >= (arg3 + arg5) && arg2 - arg7 >= class326.field4901 && arg2 + arg7 <= class261.field3911) {
            class185.method1287(arg4, arg7, -1, arg0, arg2, arg1, arg3, arg5);
        } else {
            class57.method457(arg4, arg2, (byte) -125, arg1, arg7, arg0, arg3, arg5);
        }
    }
}
