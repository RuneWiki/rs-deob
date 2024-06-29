import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class148 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lqc;")
    public static class99 field2045 = new class99(64);

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[I")
    public static int[] field2049 = new int[128];

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2048 = "Loaded update list";

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "[C")
    public static char[] field2055 = new char[128];

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Z")
    public static boolean field2054 = false;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2052 = null;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field2051 = 0;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lqc;")
    public static class99 field2053 = new class99(64);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "[Lpn;")
    public static class170[] field2056;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 12)
    public static void method1072(int arg0) {
        field2053 = null;
        field2045 = null;
        field2049 = null;
        field2048 = null;
        field2056 = null;
        if (arg0 > -34) {
            method1073(-51);
        }
        field2055 = null;
        field2052 = null;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 28)
    public static final void method1073(int arg0) {
        field2040++;
        if (arg0 != 0) {
            return;
        }
        for (class238 var1 = (class238) class53.field706.method1335(1); var1 != null; var1 = (class238) class53.field706.method1336(3)) {
            if (var1.field3375 == -1) {
                var1.field3376 = 0;
                class63.method421(25127, var1);
            } else {
                var1.method1274((byte) -26);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZIIZLfa;BLfa;)I", line = 64)
    public static final int method1074(boolean arg0, int arg1, int arg2, boolean arg3, class259 arg4, byte arg5, class259 arg6) {
        field2042++;
        int var7 = class74.method550(arg4, arg6, arg2, (byte) 110, arg0);
        if (var7 == 0) {
            if (arg5 >= -17) {
                field2049 = (int[]) null;
            }
            if (arg1 == -1) {
                return 0;
            } else {
                int var8 = class74.method550(arg4, arg6, arg1, (byte) 110, arg3);
                return arg3 ? -var8 : var8;
            }
        } else if (arg0) {
            return -var7;
        } else {
            return var7;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V", line = 99)
    public static final void method1075(byte arg0) {
        if (class181.field2431 != null) {
            class85 var1 = new class85();
            for (int var2 = 0; var2 < 13; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    class181.field2431[var2][var3] = var1;
                }
            }
        }
        field2043++;
        if (arg0 > -66) {
            method1075((byte) 5);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILkm;)V", line = 132)
    public static final void method1076(int arg0, class133 arg1) {
        field2047++;
        class179.field2404 = arg1;
        if (arg0 > -15) {
            method1072(99);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([Ljava/lang/Object;Z[J)V", line = 143)
    public static final void method1077(Object[] arg0, boolean arg1, long[] arg2) {
        class337.method2336(0, (byte) -99, arg2, arg2.length - 1, arg0);
        field2041++;
        if (arg1) {
            method1076(75, (class133) null);
        }
    }
}
