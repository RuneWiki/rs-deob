import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class160 extends class45 {

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    private int field2556;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    private int field2543;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    private int field2541;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    private int field2560;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public int field2557;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    private int field2549;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    private int field2542;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2548 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2547 = " from your friend list first.";

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "Z")
    public static boolean field2561 = true;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "[[B")
    public static byte[][] field2546;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIZIIII)V", line = 9)
    public static final void method1245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        if (class6.field55.method1634(-1) == 2) {
            class271.method2036((byte) -123, arg1, arg7, arg9, arg4, arg6, arg0, arg10, arg3, arg2, arg8);
        } else if (class6.field55.method1634(-1) > 2) {
            class124.method972(arg2, arg3, arg6, arg1, class6.field55.method1634(-1), arg9, arg4, arg10, arg0, arg7, -125, arg8);
        } else {
            class237.method1814(arg8, arg7, arg6, 1, arg9, arg4, arg0, arg2, arg1, arg10, arg3);
        }
        if (arg5 == 19324) {
            field2544++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Z", line = 41)
    public final boolean method1246(int arg0, int arg1, int arg2) {
        field2554++;
        if (arg1 == 2) {
            return this.field2550 <= arg0 && this.field2553 >= arg0 && arg2 >= this.field2557 && arg2 <= this.field2545;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)Z", line = 63)
    public final boolean method1247(int arg0, int arg1, byte arg2) {
        if (arg2 == 22) {
            field2552++;
            return this.field2556 <= arg0 && this.field2543 >= arg0 && this.field2549 <= arg1 && this.field2541 >= arg1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V", line = 79)
    public static final void method1248(int arg0, int arg1, int arg2) {
        field2558++;
        class129.field2187 = new class332(arg2);
        class180.field2878 = new class332(arg1);
        if (arg0 > -81) {
            field2547 = (String) null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI[II)V", line = 91)
    public final void method1249(boolean arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = arg3 + this.field2550 - this.field2556;
        if (arg0) {
            arg2[0] = this.field2542;
            arg2[2] = arg1 + this.field2557 - this.field2549;
            field2551++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBI)Z", line = 106)
    public final boolean method1250(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = -81 % ((arg2 + 17) / 59);
        field2555++;
        return this.field2560 == arg0 && this.field2556 <= arg3 && arg3 <= this.field2543 && arg1 >= this.field2549 && arg1 <= this.field2541;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI[II)V", line = 128)
    public final void method1251(byte arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 == -87) {
            field2559++;
            arg2[2] = arg3 + this.field2549 - this.field2557;
            arg2[0] = this.field2560;
            arg2[1] = -this.field2550 - (-this.field2556 - arg1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 141)
    public static void method1252(boolean arg0) {
        field2547 = null;
        if (arg0) {
            field2546 = (byte[][]) ((byte[][]) null);
        }
        field2548 = null;
        field2546 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 151)
    public class160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2556 = arg2;
        this.field2553 = arg8;
        this.field2543 = arg4;
        this.field2541 = arg5;
        this.field2560 = arg0;
        this.field2557 = arg7;
        this.field2549 = arg3;
        this.field2545 = arg9;
        this.field2542 = arg1;
        this.field2550 = arg6;
    }
}
