import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class690 extends class504 {

    @OriginalMember(owner = "client!au", name = "i", descriptor = "Lqw;")
    public static class71 field9709 = new class71(3, 5);

    @OriginalMember(owner = "client!au", name = "r", descriptor = "F")
    public static float field9718;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field9714;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "I")
    public static int field9720;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "I")
    public int field9727;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    public int field9729;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "J")
    public static long field9730;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "[I")
    public int[] field9710;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "[I")
    public int[] field9712;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "[I")
    public static int[] field9713;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "[I")
    public int[] field9716;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "[Lsa;")
    public class192[] field9715;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "[Lsa;")
    public class192[] field9719;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "[Z")
    public static boolean[] field9711;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "[[[B")
    public byte[][][] field9723;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lgba;Lgba;I)V")
    public static final void method3831(class625 arg0, class625 arg1, int arg2) {
        field9724++;
        class32.field511++;
        class402 var3 = class390.method2252(class563.field7462, -127, class262.field3644);
        var3.field5354.method1982(arg0.field8327, (byte) 63);
        var3.field5354.method2031((byte) 54, arg0.field8403);
        var3.field5354.method2031((byte) 54, arg0.field8418);
        var3.field5354.method2021(1326408496, arg1.field8403);
        var3.field5354.method1983(arg1.field8327, -30995);
        var3.field5354.method2003(arg1.field8418, 16777216);
        class36.method278(0, var3);
        int var4 = -86 / ((arg2 + 8) / 58);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)I")
    public static final int method3832(boolean arg0, int arg1) {
        if (arg0) {
            return 88;
        } else {
            field9717++;
            return arg1 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIZI)I")
    public static final int method3833(int arg0, int arg1, boolean arg2, int arg3) {
        field9725++;
        class521 var4 = class265.method1620(arg0, arg2, false);
        if (var4 == null) {
            return 0;
        } else if (arg3 == 0) {
            return arg1 >= 0 && var4.field6958.length > arg1 ? var4.field6958[arg1] : 0;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lfg;B)Ljava/lang/String;")
    public static final String method3834(class117 arg0, byte arg1) {
        if (arg1 != -106) {
            field9711 = null;
        }
        field9720++;
        return arg0.field1994 == null || arg0.field1994.length() <= 0 ? arg0.field2001 : arg0.field2001 + class72.field1096.method546(class516.field6892, (byte) -35) + arg0.field1994;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3835(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -1) {
            field9730 = -56L;
        }
        if (class600.field7959 <= arg7 && class366.field4956 >= arg1 && class310.field4279 <= arg5 && arg4 <= class442.field6058) {
            class145.method1050(arg3 + 1, arg2, arg4, arg6, arg1, arg5, arg7, arg0);
        } else {
            class636.method3514(arg1, arg6, arg5, arg7, arg0, arg4, -110, arg2);
        }
        field9722++;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
    public static final void method3836(byte arg0) {
        if (class23.field388 != null) {
            class299[] var1 = class23.field388;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class299 var3 = var1[var2];
                var3.method1828((byte) 127);
            }
        }
        field9721++;
        if (arg0 >= -3) {
            field9730 = 78L;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
    public static final void method3837(int arg0, int arg1) {
        int var2 = 94 / ((66 - arg1) / 35);
        class48.field690.method3740((byte) 60, arg0);
        field9726++;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public static void method3838(int arg0) {
        if (arg0 != 5430) {
            method3837(16, 68);
        }
        field9713 = null;
        field9709 = null;
        field9711 = null;
    }
}
