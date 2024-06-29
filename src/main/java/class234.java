import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class234 {

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public static int field3147 = 2;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "Lgda;")
    public static class53 field3148 = new class53(30, 7);

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "Lbg;")
    public static class464 field3152 = new class464();

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "[I")
    public static int[] field3153 = new int[5];

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "Lfp;")
    public static class323 field3146;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3151;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)V", line = 6)
    public static final void method1503(int arg0, int arg1) {
        field3149++;
        class592 var2 = class682.method3825(-652872096, arg1, arg0);
        var2.method3350(0);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V", line = 20)
    public static final void method1504(int arg0) {
        field3150++;
        if (arg0 <= 98) {
            return;
        }
        for (int var1 = 0; var1 < class651.field8948.length; var1++) {
            for (int var2 = 0; var2 < class651.field8948[0].length; var2++) {
                for (int var3 = 0; var3 < class651.field8948[0][0].length; var3++) {
                    class651.field8948[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V", line = 57)
    public static void method1505(int arg0) {
        field3151 = null;
        if (arg0 != 0) {
            method1504(89);
        }
        field3146 = null;
        field3148 = null;
        field3152 = null;
        field3153 = null;
    }
}
