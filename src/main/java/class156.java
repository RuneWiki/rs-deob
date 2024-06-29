import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class156 extends class137 {

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Ltl;")
    public static class59 field2544 = class85.method639("Mem:", 9588);

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field2548 = 0;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "Ltl;")
    private static class59 field2556 = class85.method639("RuneScape is loading )2 please wait)3)3)3", 9588);

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "[S")
    public static short[] field2554 = new short[256];

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Ltl;")
    public static class59 field2552 = field2556;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "Ltl;")
    public class59 field2558;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "[I")
    public int[] field2545;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "[I")
    public int[] field2549;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "[I")
    public static int[] field2557;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "[Ltl;")
    public class59[] field2555;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "[Leh;")
    public class94[] field2559;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lwk;B)V", line = 9)
    public static final void method1111(class105 arg0, byte arg1) {
        field2546++;
        if (arg0.field1778 == 0) {
            return;
        }
        if (arg0.field1772 != -1 && arg0.field1772 < 32768) {
            class23 var2 = class23.field311[arg0.field1772];
            if (var2 != null) {
                int var3 = arg0.field1774 - var2.field1774;
                int var4 = arg0.field1769 - var2.field1769;
                if (var3 != 0 || var4 != 0) {
                    arg0.field1750 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field1772 >= 32768) {
            int var5 = arg0.field1772 - 32768;
            if (class155.field2537 == var5) {
                var5 = 2047;
            }
            class102 var6 = class211.field3438[var5];
            if (var6 != null) {
                int var7 = arg0.field1769 - var6.field1769;
                int var8 = arg0.field1774 - var6.field1774;
                if (var8 != 0 || var7 != 0) {
                    arg0.field1750 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field1742 != 0 || arg0.field1743 != 0) && (arg0.field1790 == 0 || arg0.field1775 > 0)) {
            int var9 = arg0.field1774 + (arg0.method776(true) * 64) - ((-class197.field3249 + arg0.field1742 + -class197.field3249) * 64) - 64;
            int var10 = arg0.field1769 + ((arg0.method776(true) - 1) * 64) - ((-class187.field3135 - class187.field3135 + arg0.field1743) * 64);
            if (var9 != 0 || var10 != 0) {
                arg0.field1750 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field1742 = 0;
            arg0.field1743 = 0;
        }
        int var11 = arg0.field1750 - arg0.field1765 & 0x7FF;
        if (arg1 != 59) {
            return;
        }
        if (var11 == 0) {
            arg0.field1782 = 0;
            return;
        }
        arg0.field1782++;
        if (var11 > 1024) {
            boolean var12 = true;
            arg0.field1765 -= arg0.field1778;
            if (var11 < arg0.field1778 || var11 > (2048 - arg0.field1778)) {
                var12 = false;
                arg0.field1765 = arg0.field1750;
            }
            if (arg0.field1767 == arg0.field1720 && (arg0.field1782 > 25 || var12)) {
                if (arg0.field1751 == -1) {
                    arg0.field1767 = arg0.field1763;
                } else {
                    arg0.field1767 = arg0.field1751;
                }
            }
        } else {
            arg0.field1765 += arg0.field1778;
            boolean var13 = true;
            if (arg0.field1778 > var11 || var11 > (2048 - arg0.field1778)) {
                var13 = false;
                arg0.field1765 = arg0.field1750;
            }
            if (arg0.field1767 == arg0.field1720 && (arg0.field1782 > 25 || var13)) {
                if (arg0.field1771 == -1) {
                    arg0.field1767 = arg0.field1763;
                } else {
                    arg0.field1767 = arg0.field1771;
                }
            }
        }
        arg0.field1765 &= 0x7FF;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V", line = 136)
    public static void method1112(int arg0) {
        field2544 = null;
        if (arg0 != -13466) {
            method1113(15, (byte) -62);
        }
        field2554 = null;
        field2552 = null;
        field2557 = null;
        field2556 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Ltl;", line = 174)
    public static final class59 method1113(int arg0, byte arg1) {
        if (arg1 < 121) {
            return (class59) null;
        }
        class59 var2 = class81.method619((byte) -93, arg0);
        for (int var3 = var2.method495(-113) - 3; var3 > 0; var3 -= 3) {
            var2 = class233.method1630(new class59[] { var2.method473(var3, 0, (byte) 112), class71.field1116, var2.method497(var3, (byte) 60) }, -2883);
        }
        field2560++;
        if (var2.method495(-113) <= 9) {
            return var2.method495(54) > 6 ? class233.method1630(new class59[] { class234.field3891, var2.method473(var2.method495(15) - 4, 0, (byte) 101), class140.field2334, class294.field5019, var2, class163.field2656 }, -2883) : class233.method1630(new class59[] { class88.field1391, var2, class268.field4655 }, -2883);
        } else {
            return class233.method1630(new class59[] { class251.field4188, var2.method473(var2.method495(107) - 8, 0, (byte) 77), class116.field1914, class294.field5019, var2, class163.field2656 }, -2883);
        }
    }
}
