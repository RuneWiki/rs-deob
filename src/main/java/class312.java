import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class312 extends class83 {

    @OriginalMember(owner = "client!jf", name = "lb", descriptor = "I")
    public static volatile int field5295 = 0;

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "I")
    public static int field5292 = 0;

    @OriginalMember(owner = "client!jf", name = "ob", descriptor = "I")
    public static int field5298 = 0;

    @OriginalMember(owner = "client!jf", name = "pb", descriptor = "[I")
    public static int[] field5299 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!jf", name = "mb", descriptor = "I")
    public static int field5296 = 0;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!jf", name = "kb", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!jf", name = "nb", descriptor = "Lgb;")
    public static class213 field5297;

    @OriginalMember(owner = "client!jf", name = "qb", descriptor = "Lgb;")
    public static class213 field5300;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(B)V", line = 4)
    public static void method2165(byte arg0) {
        field5299 = null;
        field5300 = null;
        if (arg0 != 66) {
            field5292 = 58;
        }
        field5297 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)[[I", line = 27)
    public final int[][] method101(int arg0, byte arg1) {
        int var3 = -27 / ((1 - arg1) / 37);
        field5294++;
        int[][] var4 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765 && this.method600(-115)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = arg0 % this.field1396 * this.field1396;
            for (int var9 = 0; var9 < class190.field3362; var9++) {
                int var10 = this.field1398[var9 % this.field1392 + var8];
                var7[var9] = class2.method15(255, var10) << 4;
                var6[var9] = class2.method15(65280, var10) >> 4;
                var5[var9] = class2.method15(var10 >> 12, 4080);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILs;)Loh;", line = 71)
    public static final class258 method2166(int arg0, int arg1, class171 arg2) {
        field5293++;
        if (!class202.method1344(client.method354(arg2), true, arg0) && arg2.field2953 == null) {
            return null;
        }
        int var3 = 117 % ((arg1 + 54) / 42);
        if (arg2.field3029 == null || arg2.field3029.length <= arg0 || arg2.field3029[arg0] == null || arg2.field3029[arg0].method1817((byte) -48).method1816(false) == 0) {
            return class166.field2823 ? class100.method755(-6, new class258[] { class130.field2291, class218.method1481(-76, arg0) }) : null;
        } else {
            return arg2.field3029[arg0];
        }
    }
}
