import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class139 extends class64 {

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
    private int field2585 = -1;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "Lsg;")
    public static class169 field2577 = class165.method1060("Ein kostenloses Spielkonto erstellen)3", 1536);

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "[[[I")
    public static int[][][] field2588 = new int[4][105][105];

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "Lsg;")
    private static class169 field2581 = class165.method1060("Enter your username (V password)3", 1536);

    @OriginalMember(owner = "client!pd", name = "qb", descriptor = "Lsg;")
    public static class169 field2590 = field2581;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "Lsg;")
    public static class169 field2583 = class165.method1060("(Y", 1536);

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "Lsg;")
    public static class169 field2584 = class165.method1060("RuneScape wird geladen )2 bitte warten)3)3)3", 1536);

    @OriginalMember(owner = "client!pd", name = "rb", descriptor = "Lsg;")
    private static class169 field2591 = class165.method1060("Your ignore list is full)3 Max of 100 users)3", 1536);

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "Lsg;")
    public static class169 field2580 = field2591;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public int field2575;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!pd", name = "pb", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "[I")
    public int[] field2578;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)V")
    public static void method928(int arg0) {
        field2590 = null;
        field2580 = null;
        field2577 = null;
        if (arg0 != 1825402948) {
            method928(22);
        }
        field2583 = null;
        field2591 = null;
        field2588 = null;
        field2581 = null;
        field2584 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Loa;BI)Lsg;")
    public static final class169 method929(class127 arg0, byte arg1, int arg2) {
        if (arg1 != 52) {
            return null;
        } else {
            ++field2587;
            try {
                class169 var3 = new class169();
                var3.field3253 = arg0.method812(true);
                if (arg2 < var3.field3253) {
                    var3.field3253 = arg2;
                }
                var3.field3248 = new byte[var3.field3253];
                arg0.field2346 += class69.field1297.method434(var3.field3248, arg0.field2325, 0, false, var3.field3253, arg0.field2346);
                return var3;
            } catch (Exception var4) {
                return class91.field1672;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I")
    public final int method397(int arg0) {
        ++field2576;
        int var2 = -59 / ((arg0 - 62) / 45);
        return this.field2585;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[[I")
    public int[][] method59(byte arg0, int arg1) {
        ++field2582;
        int[][] var3 = super.field1195.method177(1193, arg1);
        if (super.field1195.field532 && this.method930(arg0 + 145)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = (class103.field1895 != this.field2575 ? this.field2575 * arg1 / class103.field1895 : arg1) * this.field2586;
            if (class147.field2715 == this.field2586) {
                for (int var8 = 0; var8 < class147.field2715; ++var8) {
                    int var9 = this.field2578[var7++];
                    var6[var8] = class150.method984(var9 << 4, 4080);
                    var4[var8] = class150.method984(var9, 65280) >> 4;
                    var5[var8] = class150.method984(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~class147.field2715 < ~var10; ++var10) {
                    int var11 = this.field2586 * var10 / class147.field2715;
                    int var12 = this.field2578[var7 + var11];
                    var6[var10] = class150.method984(255, var12) << 4;
                    var4[var10] = class150.method984(var12, 65280) >> 4;
                    var5[var10] = class150.method984(4080, var12 >> 12);
                }
            }
        }
        if (arg0 != -40) {
            this.method397(47);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2585 = arg1.method785(true);
        }
        int var4 = -106 % ((-60 - arg0) / 36);
        ++field2579;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class139() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "(I)Z")
    public final boolean method930(int arg0) {
        if (arg0 <= 56) {
            method928(15);
        }
        ++field2589;
        if (this.field2578 != null) {
            return true;
        } else if (this.field2585 >= 0) {
            class18 var2 = class163.method1051(this.field2585, 0, class135.field2530);
            var2.method112();
            this.field2578 = var2.field408;
            this.field2575 = var2.field413;
            this.field2586 = var2.field409;
            return true;
        } else {
            return false;
        }
    }
}
