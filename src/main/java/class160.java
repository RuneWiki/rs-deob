import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class160 extends class103 {

    @OriginalMember(owner = "client!qa", name = "nb", descriptor = "[[[Lof;")
    public static class145[][][] field2985 = new class145[4][104][104];

    @OriginalMember(owner = "client!qa", name = "rb", descriptor = "Lrd;")
    private static class173 field2989 = class133.method843("Free world", -106);

    @OriginalMember(owner = "client!qa", name = "pb", descriptor = "Lrd;")
    public static class173 field2987 = field2989;

    @OriginalMember(owner = "client!qa", name = "sb", descriptor = "Lrd;")
    public static class173 field2990 = class133.method843("Verbindung abgebrochen)3", -81);

    @OriginalMember(owner = "client!qa", name = "lb", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!qa", name = "mb", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!qa", name = "qb", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!qa", name = "kb", descriptor = "La;")
    public static class1 field2982;

    @OriginalMember(owner = "client!qa", name = "ob", descriptor = "Lab;")
    public static class3 field2986;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
    public static void method1046(int arg0) {
        field2990 = null;
        field2986 = null;
        if (arg0 > -95) {
            method1046(-80);
        }
        field2982 = null;
        field2989 = null;
        field2985 = null;
        field2987 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLbc;)V")
    public static final void method1047(byte arg0, class14 arg1) {
        ++field2983;
        class98.field1789 = arg1;
        class98.field1794 = class98.field1789.method138(16, true);
        if (arg0 >= -72) {
            field2982 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2984;
        if (class212.method1389(arg7 + 1677, arg3)) {
            if (arg7 != -1791) {
                field2990 = null;
            }
            class148.method976(arg1, arg0, -1, arg7 + 1708, arg2, class63.field1232[arg3], arg5, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        if (arg0 < 112) {
            field2990 = null;
        }
        ++field2988;
        int[][] var3 = super.field731.method1340(63, arg1);
        if (super.field731.field3925 && this.method640(121)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field1906 * super.field1906;
            for (int var8 = 0; ~var8 > ~class117.field2173; ++var8) {
                int var9 = super.field1901[var7 - -(var8 % super.field1917)];
                var6[var8] = class209.method1383(var9 << 4, 4080);
                var4[var8] = class209.method1383(4080, var9 >> 4);
                var5[var8] = class209.method1383(4080, var9 >> 12);
            }
        }
        return var3;
    }
}
