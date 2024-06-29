import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class193 extends class189 {

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "Lgg;")
    public static class63 field3903 = class116.method911(43, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!vd", name = "pb", descriptor = "Lgg;")
    public static class63 field3912 = class116.method911(43, ":assistreq:");

    @OriginalMember(owner = "client!vd", name = "lb", descriptor = "Lgg;")
    private static class63 field3908 = class116.method911(43, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!vd", name = "mb", descriptor = "Lgg;")
    public static class63 field3909 = field3908;

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!vd", name = "jb", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!vd", name = "nb", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!vd", name = "ob", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!vd", name = "kb", descriptor = "[Lrc;")
    public static class156[] field3907;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field3825.method681(arg1, (byte) -55);
            if (super.field3825.field1840) {
                int var4 = class21.field496[arg1];
                for (int var5 = 0; ~class54.field1430 < ~var5; ++var5) {
                    var3[var5] = this.method1267((byte) -106, var4, class35.field825[var5]) % 4096;
                }
            }
            ++field3905;
            return var3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(BII)I")
    private final int method1267(byte arg0, int arg1, int arg2) {
        ++field3904;
        int var4 = arg1 * 57 + arg2;
        if (arg0 > -74) {
            return -22;
        } else {
            int var5 = var4 ^ var4 << 1;
            return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
    public static void method1268(byte arg0) {
        field3907 = null;
        field3909 = null;
        field3908 = null;
        field3912 = null;
        if (arg0 < 56) {
            field3908 = null;
        }
        field3903 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class121 var8 = new class121();
        var8.field2674 = arg2 / 128;
        var8.field2688 = arg3 / 128;
        var8.field2659 = arg4 / 128;
        var8.field2664 = arg5 / 128;
        var8.field2663 = arg1;
        var8.field2680 = arg2;
        var8.field2669 = arg3;
        var8.field2658 = arg4;
        var8.field2657 = arg5;
        var8.field2672 = arg6;
        var8.field2676 = arg7;
        class165.field3394[arg0][class165.field3390[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public static final void method1270(int arg0) {
        if (arg0 != -5018) {
            field3908 = null;
        }
        for (int var1 = -1; ~var1 > ~class34.field813; ++var1) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class177.field3641[var1];
            }
            class62 var6 = class33.field806[var5];
            if (var6 != null && var6.field1147 > 0) {
                --var6.field1147;
                if (var6.field1147 == 0) {
                    var6.field1151 = null;
                }
            }
        }
        for (int var2 = 0; class29.field695 > var2; ++var2) {
            int var3 = class142.field3045[var2];
            class6 var4 = class55.field1458[var3];
            if (var4 != null && var4.field1147 > 0) {
                --var4.field1147;
                if (~var4.field1147 == -1) {
                    var4.field1151 = null;
                }
            }
        }
        ++field3911;
    }
}
