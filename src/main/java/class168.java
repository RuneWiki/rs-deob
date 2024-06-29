import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class168 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "[I")
    public static int[] field2700 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2705 = new String[100];

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1154(boolean arg0) {
        if (arg0) {
            field2705 = (String[]) null;
        }
        field2700 = null;
        field2705 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 63)
    public static final void method1155(byte arg0) {
        if (arg0 >= -42) {
            method1154(false);
        }
        field2704++;
        if (class246.field3904 != -1) {
            class173.method1181((byte) -110, class246.field3904);
        }
        for (int var1 = 0; var1 < class140.field2086; var1++) {
            if (class284.field4485[var1]) {
                class237.field3748[var1] = true;
            }
            class314.field4894[var1] = class284.field4485[var1];
            class284.field4485[var1] = false;
        }
        if (class186.field2991) {
            class26.field383 = true;
        }
        class139.field2078 = -1;
        class290.field4576 = null;
        class90.field1378 = -1;
        class318.field4928 = class48.field648;
        if (class246.field3904 != -1) {
            class140.field2086 = 0;
            class264.method1886((byte) -84);
        }
        if (class186.field2991) {
            class344.method2372();
        } else {
            class216.method1590();
        }
        class274.field4353 = 0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIIIII)V", line = 111)
    public static final void method1156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2698++;
        if (arg2 >= class224.field3575 && class231.field3697 >= arg2 && arg9 >= class224.field3575 && class231.field3697 >= arg9 && arg1 >= class224.field3575 && arg1 <= class231.field3697 && arg4 >= class224.field3575 && class231.field3697 >= arg4 && class233.field3721 <= arg0 && class235.field3735 >= arg0 && class233.field3721 <= arg7 && class235.field3735 >= arg7 && class233.field3721 <= arg5 && arg5 <= class235.field3735 && arg6 >= class233.field3721 && class235.field3735 >= arg6) {
            class198.method1445(arg2, arg9, arg7, arg0, arg5, arg1, arg6, arg4, true, arg8);
        } else {
            class44.method299(arg2, arg9, arg4, arg6, arg7, arg8, (byte) 73, arg5, arg1, arg0);
        }
        if (arg3 != 1792) {
            field2701 = 14;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I", line = 139)
    public static final int method1157(int arg0, int arg1) {
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 <= 17) {
            return -66;
        } else {
            field2706++;
            int var3 = arg1 * 6 - 61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }
}
