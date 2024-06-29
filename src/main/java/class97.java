import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class97 extends class171 {

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Lok;")
    public class146 field1580;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lok;")
    public static class146 field1572 = class235.method1724(-12908, ",Mcran)2titre ouvert");

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Lok;")
    private static class146 field1574 = class235.method1724(-12908, "Prepared sound engine");

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Lok;")
    public static class146 field1573 = field1574;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "[I")
    public static int[] field1575 = new int[100];

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI[[F[[FIIB[IZLhi;[[II[[I[[FIIIIZ[ZBZ)V", line = 7)
    public static final void method670(boolean arg0, int arg1, float[][] arg2, float[][] arg3, int arg4, int arg5, byte arg6, int[] arg7, boolean arg8, class286 arg9, int[][] arg10, int arg11, int[][] arg12, float[][] arg13, int arg14, int arg15, int arg16, int arg17, boolean arg18, boolean[] arg19, byte arg20, boolean arg21) {
        int var22 = (arg11 << 8) + (arg21 ? 255 : 0);
        int var23 = (arg4 << 8) + (arg0 ? 255 : 0);
        field1576++;
        int var24 = (arg18 ? 255 : 0) + (arg17 << 8);
        int var25 = (arg14 << 8) + (arg8 ? 255 : 0);
        if (arg6 >= -127) {
            return;
        }
        int[] var26 = new int[arg7.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg7[var27 + var27];
            int var29 = arg7[var27 + var27 + 1];
            int[][] var30 = arg10 == null || arg19 == null || !arg19[var27] ? arg12 : arg10;
            var26[var27] = class235.method1722(var22, arg13, var25, false, var23, arg16, var24, var28, 1, arg20, arg10, var29, (float) arg1, arg2, arg9, arg5, var30, arg3);
        }
        arg9.method2054(arg15, arg16, arg5, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V", line = 71)
    public static final void method671(int arg0) {
        field1579++;
        if (arg0 != -21512) {
            method672((byte) 74, (class146) null);
        }
        for (class268 var1 = (class268) class64.field1105.method1251(58); var1 != null; var1 = (class268) class64.field1105.method1253(arg0 + 21604)) {
            class46 var2 = var1.field4617;
            if (class203.field3387 != var2.field815 || class203.field3385 > var2.field809) {
                var1.method1325(-2935);
            } else if (var2.field776 <= class203.field3385) {
                if (var2.field785 > 0) {
                    class282 var3 = class173.field2906[var2.field785 - 1];
                    if (var3 != null && var3.field5409 >= 0 && var3.field5409 < 13312 && var3.field5380 >= 0 && var3.field5380 < 13312) {
                        var2.method322(class19.method141(var3.field5409, var2.field815, var3.field5380, 121) - var2.field813, class203.field3385, var3.field5380, -20126, var3.field5409);
                    }
                }
                if (var2.field785 < 0) {
                    int var4 = -var2.field785 - 1;
                    class234 var5;
                    if (class161.field2730 == var4) {
                        var5 = class102.field1639;
                    } else {
                        var5 = class75.field1215[var4];
                    }
                    if (var5 != null && var5.field5409 >= 0 && var5.field5409 < 13312 && var5.field5380 >= 0 && var5.field5380 < 13312) {
                        var2.method322(class19.method141(var5.field5409, var2.field815, var5.field5380, 119) - var2.field813, class203.field3385, var5.field5380, -20126, var5.field5409);
                    }
                }
                var2.method318(21264, class214.field3534);
                class85.method598(class203.field3387, (int) var2.field811, (int) var2.field795, (int) var2.field806, 60, var2, var2.field789, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLok;)Lok;", line = 136)
    public static final class146 method672(byte arg0, class146 arg1) {
        field1577++;
        if (arg0 != 75) {
            method672((byte) -17, (class146) null);
        }
        int var2 = class17.method131((byte) -65, arg1);
        return var2 == -1 ? class44.field762 : class135.field2255.field4805[var2].method1126(arg0 ^ 0xFFFFFFC1, class264.field4522, class166.field2811);
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 155)
    public class97() {
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lok;)V", line = 157)
    public class97(class146 arg0) {
        this.field1580 = arg0;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 166)
    public static void method673(int arg0) {
        field1572 = null;
        field1573 = null;
        int var1 = -110 / ((25 - arg0) / 59);
        field1574 = null;
        field1575 = null;
    }
}
