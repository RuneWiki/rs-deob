import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class9 extends class95 {

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "[[B")
    public static byte[][] field112 = new byte[1000][];

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "[I")
    public static int[] field117 = new int[2];

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "Lsf;")
    public static class108 field106 = class140.method973(255, " )4 ");

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "Lsf;")
    public static class108 field103 = class140.method973(255, "<br>");

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "[[I")
    public static int[][] field113 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field109 = 0;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "Lsf;")
    private static class108 field118 = class140.method973(255, "Allocated memory");

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "Lsf;")
    public static class108 field108 = field118;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "Lsf;")
    private static class108 field116 = class140.method973(255, "wave:");

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "Lsf;")
    public static class108 field110 = field116;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lsf;")
    public static class108 field111 = field116;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "Lvc;")
    public static class193 field114;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)I", line = 7)
    public static final int method47(int arg0, int arg1, int arg2) {
        field107++;
        if (arg1 >= -4) {
            return -65;
        }
        int var3 = class169.method1175(arg2 + 91923, arg0 + 45365, 4, (byte) 101) + (class169.method1175(arg2 + 37821, arg0 - -10294, 2, (byte) -47) - 128 >> 1) + (class169.method1175(arg2, arg0, 1, (byte) -117) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BS)Z", line = 29)
    public static final boolean method48(byte arg0, short arg1) {
        field102++;
        if (arg0 != -34) {
            return false;
        } else if (arg1 == 16 || arg1 == 14 || arg1 == 8 || arg1 == 59 || arg1 == 20 || arg1 == 39 || arg1 == 42 || arg1 == 35) {
            return true;
        } else if (arg1 == 34 || arg1 == 21 || arg1 == 1006 || arg1 == 1001) {
            return true;
        } else if (arg1 == 43 || arg1 == 38 || arg1 == 50 || arg1 == 18 || arg1 == 37) {
            return true;
        } else {
            return arg1 == 48 || arg1 == 3 || arg1 == 11 || arg1 == 36 || arg1 == 6 || arg1 == 12;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V", line = 66)
    public static void method49(int arg0) {
        field111 = null;
        field112 = (byte[][]) null;
        field117 = null;
        field116 = null;
        field118 = null;
        int var1 = 66 / ((-arg0 - 1) / 50);
        field106 = null;
        field110 = null;
        field103 = null;
        field114 = null;
        field113 = (int[][]) null;
        field108 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 144)
    public static final void method51(int arg0, Component arg1) {
        arg1.removeKeyListener(class229.field3987);
        arg1.removeFocusListener(class229.field3987);
        field119++;
        if (arg0 == -1611) {
            class206.field3693 = -1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)Z")
    public abstract boolean method50(int arg0);

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method52(int arg0);
}
