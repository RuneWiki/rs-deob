import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class68 {

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    private int field38 = 4096;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "[[[I")
    public static int[][][] field42 = new int[2][][];

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    public static volatile int field43 = 0;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "Lhc;")
    public static class235 field41;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "Lhc;")
    public static class235 field44;

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class5() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method33((class268) null, -79, -86, 67);
        }
        ++field39;
        if (arg1 == 0) {
            this.field38 = arg0.method1445(false);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)V")
    public static final void method29(int arg0, int arg1) {
        class89 var2 = class194.field2682[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class89 var4 = class194.field2682[var3][arg0][arg1] = class194.field2682[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field1229;
                for (int var5 = 0; var5 < var4.field1240; ++var5) {
                    class198 var6 = var4.field1226[var5];
                    if ((var6.field2753 >> 29 & 3L) == 2L && var6.field2746 == arg0 && var6.field2748 == arg1) {
                        --var6.field2764;
                    }
                }
            }
        }
        if (class194.field2682[0][arg0][arg1] == null) {
            class194.field2682[0][arg0][arg1] = new class89(0, arg0, arg1);
        }
        class194.field2682[0][arg0][arg1].field1249 = var2;
        class194.field2682[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)I")
    public static final int method30(int arg0, int arg1) {
        ++field37;
        if (arg1 != 23974) {
            method29(67, -65);
        }
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V")
    public static void method31(int arg0) {
        field42 = null;
        if (arg0 < -82) {
            field44 = null;
            field41 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        int[] var3 = super.field917.method1920(arg0, true);
        ++field40;
        if (arg1 >= -118) {
            method33((class268) null, 3, 8, -87);
        }
        if (super.field917.field4474) {
            int[] var4 = this.method423(0, (byte) -54, arg0 - 1 & class17.field184);
            int[] var5 = this.method423(0, (byte) -54, arg0);
            int[] var6 = this.method423(0, (byte) -54, class17.field184 & arg0 + 1);
            for (int var7 = 0; ~var7 > ~class89.field1248; ++var7) {
                int var8 = (var5[class173.field2411 & var7 + 1] - var5[class173.field2411 & var7 + -1]) * this.field38;
                int var9 = (var6[var7] + -var4[var7]) * this.field38;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lsa;III)V")
    public static final void method33(class268 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class127.field1802) {
            class89 var4 = class194.field2682[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1237 != null && var4.field1237.field328.method1774()) {
                arg0.method1773(var4.field1237.field328, 128, 0, 0, true);
            }
        }
        if (arg3 < class127.field1802) {
            class89 var5 = class194.field2682[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1237 != null && var5.field1237.field328.method1774()) {
                arg0.method1773(var5.field1237.field328, 0, 0, 128, true);
            }
        }
        if (arg2 < class127.field1802 && arg3 < class234.field3531) {
            class89 var6 = class194.field2682[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1237 != null && var6.field1237.field328.method1774()) {
                arg0.method1773(var6.field1237.field328, 128, 0, 128, true);
            }
        }
        if (arg2 < class127.field1802 && arg3 > 0) {
            class89 var7 = class194.field2682[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1237 != null && var7.field1237.field328.method1774()) {
                arg0.method1773(var7.field1237.field328, 128, 0, -128, true);
            }
        }
    }
}
