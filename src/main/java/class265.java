import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class265 extends class144 {

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    private int field3828 = 4096;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    public static int field3827 = -1;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "[[[B")
    public static byte[][][] field3829;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        int[] var3 = super.field2069.method425(true, arg0);
        ++field3825;
        if (arg1 != 255) {
            this.method9(96, (class216) null, -28);
        }
        if (super.field2069.field820) {
            int[] var4 = this.method934(arg1 ^ -18756, 0, class166.field2391 & arg0 - 1);
            int[] var5 = this.method934(arg1 ^ -18756, 0, arg0);
            int[] var6 = this.method934(arg1 + -19132, 0, class166.field2391 & arg0 + 1);
            for (int var7 = 0; class104.field1411 > var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field3828;
                int var9 = (var5[var7 + 1 & class112.field1487] + -var5[var7 + -1 & class112.field1487]) * this.field3828;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V")
    public static void method1692(int arg0) {
        if (arg0 < 1) {
            field3827 = 1;
        }
        field3829 = null;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class265() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1693(String arg0, int arg1) {
        ++field3830;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg1);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg0 == 0) {
            this.field3828 = arg1.method1380(true);
        }
        if (arg2 == 20630) {
            ++field3826;
        }
    }
}
