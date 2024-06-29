import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class245 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "[J")
    public static long[] field3605 = new long[200];

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    public static int[] field3608 = new int[32];

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3609 = "Drop";

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    public static int[] field3607;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1687(int arg0, byte[] arg1) {
        field3612++;
        if (arg0 == 11301) {
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class117.method880(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V")
    public static final void method1688(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class208.field3085 != arg0 && arg2 != 0 && class43.field571 < 50 && arg1 != -1) {
            class158.field2463[class43.field571] = arg1;
            class55.field810[class43.field571] = arg2;
            class252.field3798[class43.field571] = arg4;
            class261.field4035[class43.field571] = null;
            class101.field1714[class43.field571] = 0;
            class125.field2117[class43.field571] = arg3;
            class43.field571++;
        }
        field3606++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIILff;IJIIII)Z")
    public static final boolean method1689(int arg0, int arg1, int arg2, int arg3, class4 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class1.method1(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1690(Component arg0, int arg1) {
        arg0.addMouseListener(class199.field2924);
        arg0.addMouseMotionListener(class199.field2924);
        int var2 = 40 % ((arg1 + 23) / 43);
        arg0.addFocusListener(class199.field2924);
        field3604++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lhc;B)Lja;")
    public static final class113 method1691(class53 arg0, byte arg1) {
        if (arg1 == -28) {
            field3610++;
            return new class113(arg0.method337(99), arg0.method337(86), arg0.method337(73), arg0.method337(arg1 + 126), arg0.method362(-4), arg0.method362(-4), arg0.method366(-16505));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method1692(int arg0) {
        field3605 = null;
        field3607 = null;
        field3608 = null;
        if (arg0 <= 108) {
            method1692(-70);
        }
        field3609 = null;
    }
}
