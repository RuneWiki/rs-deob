import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class216 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Z")
    public static boolean field3467 = false;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[Lie;")
    public static class50[] field3471 = new class50[32768];

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lok;")
    private static class41 field3469 = class137.method956("Loading world list data", 45);

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lok;")
    public static class41 field3468 = field3469;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field3474 = 0;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[[I")
    public static int[][] field3470 = new int[5][5000];

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lmh;")
    public static class65 field3473;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 11)
    public static void method1559(byte arg0) {
        field3471 = null;
        field3469 = null;
        if (arg0 != -52) {
            field3470 = (int[][]) ((int[][]) null);
        }
        field3473 = null;
        field3468 = null;
        field3470 = (int[][]) null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILbc;IIIBI)V", line = 27)
    public static final void method1560(int arg0, class302 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != 101) {
            field3469 = (class41) null;
        }
        field3472++;
        int var7 = arg4 * arg4 + arg6 * arg6;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg1.field4936 / 2, arg1.field4949 / 2);
        if (var8 * var8 >= var7) {
            class305.method2106(false, arg1, arg2, arg0, arg4, class75.field1125[arg3], arg6);
            return;
        }
        int var9 = class8.field101 + class136.field2032 & 0x7FF;
        var8 -= 10;
        int var10 = class31.field455[var9];
        int var11 = var10 * 256 / (class136.field2038 + 256);
        int var12 = class31.field450[var9];
        int var13 = var12 * 256 / (class136.field2038 + 256);
        int var14 = arg4 * var11 - (arg6 * var13) >> 16;
        int var15 = arg4 * var13 + arg6 * var11 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        if (class166.field2625) {
            ((class17) class271.field4388[arg3]).method89(240, 240, (arg1.field4936 / 2 + arg2 + var18) * 16, (arg1.field4949 / 2 + arg0 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class72) class271.field4388[arg3]).method527(arg2 + var18 - (-(arg1.field4936 / 2) - -10), arg1.field4949 / 2 + arg0 + -10 + -var19, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V", line = 93)
    public static final void method1561(int arg0, int arg1, int arg2) {
        class285.field4642.method844(arg1 - 6, 241);
        if (arg1 != 2) {
            field3470 = (int[][]) ((int[][]) null);
        }
        field3475++;
        class285.field4642.method795((byte) -30, arg0);
        class285.field4642.method760(false, arg2);
        class69.field1036++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 107)
    public static final void method1562(int arg0) {
        field3466++;
        class175.field2849++;
        class285.field4642.method844(arg0 - 210, arg0);
        for (class187 var1 = (class187) class113.field1658.method609(119); var1 != null; var1 = (class187) class113.field1658.method616(arg0 ^ 0xB6)) {
            if (var1.field3053 == 0) {
                class206.method1457(var1, (byte) 19, true);
            }
        }
        if (class109.field1526 != null) {
            class18.method91(28515, class109.field1526);
            class109.field1526 = null;
        }
    }
}
