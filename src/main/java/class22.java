import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class22 extends class127 {

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field334 = -1;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field339 = 0;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "S")
    public static short field341 = 32767;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "Lph;")
    public static class203 field335;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field340;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method175(int arg0, String arg1, int arg2) {
        field337++;
        if (arg0 != -23731) {
            method180((char) 65425, -46);
        }
        return class197.method1346(true, (byte) 70, arg2, arg1);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLsb;II)Lwf;")
    public static final class17 method177(boolean arg0, class124 arg1, int arg2, int arg3) {
        field333++;
        if (class113.method833(arg3, arg1, arg2, 100)) {
            return arg0 ? class134.method955(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZ)V")
    public static final void method178(int arg0, boolean arg1) {
        if (arg1) {
            method178(-59, true);
        }
        field336++;
        class23 var2 = class91.method694(arg0, 9, 118);
        var2.method183(-90);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public static void method179(int arg0) {
        if (arg0 < 112) {
            method175(-26, (String) null, -94);
        }
        field335 = null;
        field340 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(CI)Z")
    public static final boolean method180(char arg0, int arg1) {
        field338++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            if (arg1 != -21001) {
                method181(5, false, -47, -51, 71);
            }
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZIII)V")
    public static final void method181(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field344++;
        if (arg1) {
            field335 = null;
        }
        class23 var5 = class91.method694(arg0, 4, 125);
        var5.method190(0);
        var5.field361 = arg4;
        var5.field349 = arg2;
        var5.field346 = arg3;
    }
}
