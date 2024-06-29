import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class143 extends class28 {

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Lqe;")
    private static class179 field2594 = class206.method1380("Loading title screen )2 ", (byte) -128);

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "[Z")
    public static boolean[] field2592 = new boolean[100];

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "[I")
    public static int[] field2606 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Lqe;")
    public static class179 field2595 = field2594;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "Lqe;")
    public static class179 field2610 = class206.method1380("Fps:", (byte) -128);

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "Lqe;")
    public static class179 field2602 = class206.method1380("sl_arrows", (byte) -126);

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field2608 = 0;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "Lqe;")
    private static class179 field2609 = class206.method1380("Loaded wordpack", (byte) -127);

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Lqe;")
    public static class179 field2600 = field2609;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public int field2590;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public int field2598;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public int field2607;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "Lae;")
    public static class6 field2599;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Lid;")
    public static class91 field2596;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "[I")
    public static int[] field2605;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "[I")
    public static int[] field2611;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    public abstract void method799(int arg0, int arg1);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIBII)V")
    public static final void method900(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2597++;
        for (int var5 = 0; var5 < class160.field2907; var5++) {
            if (arg4 < class99.field1845[var5] + class84.field1636[var5] && arg4 + arg0 > class99.field1845[var5] && class15.field401[var5] + class116.field2185[var5] > arg3 && class116.field2185[var5] < arg1 + arg3) {
                field2592[var5] = true;
            }
        }
        int var6 = 53 / ((arg2 + 11) / 51);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
    public abstract void method794(int arg0, int arg1);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2604++;
        if (arg6 < 128 || arg0 < 128 || arg6 > 13056 || arg0 > 13056) {
            class174.field3122 = -1;
            class71.field1415 = -1;
            return;
        }
        int var8 = class202.method1341(125, arg6, class49.field1038, arg0) - arg2;
        int var9 = var8 - class225.field4177;
        int var10 = class27.field600[class18.field480];
        int var11 = arg0 - class198.field3700;
        int var12 = class27.field612[class18.field480];
        int var13 = arg6 - class22.field538;
        int var14 = class27.field612[class61.field1300];
        int var15 = class27.field600[class61.field1300];
        int var16 = var11 * var14 + var13 * var15 >> 16;
        int var17 = var11 * var15 - var13 * var14 >> 16;
        int var19 = var9 * var10 - var12 * var17 >> 16;
        int var20 = var9 * var12 + var10 * var17 >> 16;
        if (var20 >= 50) {
            class71.field1415 = (var19 << 9) / var20 + arg3;
            class174.field3122 = arg4 + (var16 << 9) / var20;
        } else {
            class71.field1415 = -1;
            class174.field3122 = -1;
        }
        if (arg5 != 1220876233) {
            field2605 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)V")
    public abstract void method801(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public abstract void method803(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V")
    public abstract void method817(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIIII)V")
    public final void method902(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field2590 << 3;
        if (arg0 != -29324) {
            this.method805(62, 114, 73, 8, -69, 89);
        }
        field2593++;
        int var7 = this.field2603 << 3;
        int var8 = (arg4 << 4) + (var7 & 0xF);
        int var9 = (arg1 << 4) + (var6 & 0xF);
        this.method805(var7, var6, var8, var9, arg3, arg2);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method903(int arg0) {
        field2609 = null;
        field2602 = null;
        field2599 = null;
        field2594 = null;
        field2610 = null;
        field2592 = null;
        field2605 = null;
        field2611 = null;
        field2606 = null;
        field2595 = null;
        field2596 = null;
        field2600 = null;
        if (arg0 != -26912) {
            method901(68, -67, 75, -1, 97, -36, -113, 47);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIII)V")
    public abstract void method818(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
    public abstract void method805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
