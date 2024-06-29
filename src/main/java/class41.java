import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class41 {

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Lqm;")
    public static class291 field613 = null;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "[I")
    public static int[] field619 = new int[2048];

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[Lck;")
    public static class163[] field632 = new class163[14];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Laj;")
    public static class151 field629;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[I")
    public static int[] field607;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "[[I")
    public static int[][] field630;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static final void method243(byte arg0) {
        field623++;
        if (arg0 >= 80 && class26.field458 == 30) {
            class240.method1719(25, 31136);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class256 var20 = new class256(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class90.field1498[var21][arg1][arg2] == null) {
                    class90.field1498[var21][arg1][arg2] = new class174(var21, arg1, arg2);
                }
            }
            class90.field1498[arg0][arg1][arg2].field2818 = var20;
        } else if (arg3 == 1) {
            class256 var22 = new class256(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class90.field1498[var23][arg1][arg2] == null) {
                    class90.field1498[var23][arg1][arg2] = new class174(var23, arg1, arg2);
                }
            }
            class90.field1498[arg0][arg1][arg2].field2818 = var22;
        } else {
            class52 var24 = new class52(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class90.field1498[var25][arg1][arg2] == null) {
                    class90.field1498[var25][arg1][arg2] = new class174(var25, arg1, arg2);
                }
            }
            class90.field1498[arg0][arg1][arg2].field2808 = var24;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method245(int arg0) {
        field607 = null;
        field630 = null;
        field629 = null;
        field613 = null;
        field632 = null;
        field619 = null;
        int var1 = 64 / ((arg0 + 38) / 52);
    }
}
