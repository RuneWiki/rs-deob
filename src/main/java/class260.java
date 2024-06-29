import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class260 {

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lgn;")
    public class729 field3829;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[[B")
    public static byte[][] field3824 = new byte[50][];

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
    public static int[] field3825 = new int[5];

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Z")
    public static final boolean method1691(int arg0, int arg1) {
        if (arg1 <= 125) {
            field3824 = null;
        }
        field3830++;
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method1692(boolean arg0) {
        field3825 = null;
        field3824 = null;
        if (!arg0) {
            field3824 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)V")
    public final void method1693(int arg0, int arg1) {
        field3827++;
        if (this.method129(-1, arg1) != 3) {
            this.method128(arg1, (byte) 122);
        }
        int var3 = -127 / (-arg0 / 36);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
    public abstract int method129(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method126(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)V")
    public abstract void method128(int arg0, byte arg1);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)I")
    public abstract int method123(int arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public static final void method1694(int arg0) {
        field3826++;
        for (int var1 = 0; var1 < class715.field9911; var1++) {
            class481.field6754[var1] = null;
        }
        class715.field9911 = 0;
        int var2 = 0;
        if (arg0 != 9016) {
            field3824 = null;
        }
        while (class562.field7990 > var2) {
            for (int var42 = 0; var42 < class81.field902; var42++) {
                for (int var43 = 0; var43 < class48.field615; var43++) {
                    class46 var44 = class767.field10562[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field593 > 0) {
                            var44.field593 = (short) (var44.field593 * -1);
                        }
                        if (var44.field588 > 0) {
                            var44.field588 = (short) (var44.field588 * -1);
                        }
                    }
                }
            }
            var2++;
        }
        for (int var3 = 0; var3 < class562.field7990; var3++) {
            for (int var4 = 0; var4 < class81.field902; var4++) {
                for (int var5 = 0; var5 < class48.field615; var5++) {
                    class46 var6 = class767.field10562[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class767.field10562[0][var5][var4] != null && class767.field10562[0][var5][var4].field583 != null;
                        if (var6.field588 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class46 var12 = class767.field10562[var3][var5][var4 - 1];
                            int var13 = class411.field5572[var3].method1904(var4, (byte) -128, var5);
                            while (var8 > 0 && var12 != null && var12.field588 < 0 && var6.field588 == var12.field588 && var6.field579 == var12.field579 && class411.field5572[var3].method1904(var8 - 1, (byte) 113, var5) == var13 && ((var8 - 1) <= 0 || class411.field5572[var3].method1904(var8 - 2, (byte) -128, var5) == var13)) {
                                var8--;
                                var12 = class767.field10562[var3][var5][var8 - 1];
                            }
                            for (class46 var14 = class767.field10562[var3][var5][var4 + 1]; var9 < class48.field615 && var14 != null && var14.field588 < 0 && var6.field588 == var14.field588 && var6.field579 == var14.field579 && var13 == class411.field5572[var3].method1904(var9 + 1, (byte) -126, var5) && (var9 + 1 >= class48.field615 || class411.field5572[var3].method1904(var9 + 2, (byte) 96, var5) == var13); var14 = class767.field10562[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class411.field5572[var7 ? var3 + 1 : var3].method1904(var8, (byte) -126, var5);
                            int var17 = var6.field588 * var15 + var16;
                            int var18 = class411.field5572[var7 ? var3 + 1 : var3].method1904(var9 + 1, (byte) 2, var5);
                            int var19 = var6.field588 * var15 + var18;
                            int var20 = var5 << class645.field9018;
                            int var21 = var8 << class645.field9018;
                            int var22 = (var9 << class645.field9018) + class109.field1611;
                            class481.field6754[class715.field9911++] = new class478(1, var3, var6.field579 + var20, var20 - -var6.field579, var6.field579 + var20, var6.field579 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class767.field10562[var23][var5][var24].field588 = (short) (class767.field10562[var23][var5][var24].field588 * -1);
                                }
                            }
                        }
                        if (var6.field593 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class46 var29 = class767.field10562[var3][var5 - 1][var4];
                            int var30 = class411.field5572[var3].method1904(var4, (byte) 99, var5);
                            while (var25 > 0 && var29 != null && var29.field593 < 0 && var6.field593 == var29.field593 && var6.field584 == var29.field584 && class411.field5572[var3].method1904(var4, (byte) 119, var25 - 1) == var30 && (var25 - 1 <= 0 || class411.field5572[var3].method1904(var4, (byte) -123, var25 - 2) == var30)) {
                                var25--;
                                var29 = class767.field10562[var3][var25 - 1][var4];
                            }
                            for (class46 var31 = class767.field10562[var3][var5 + 1][var4]; var26 < class81.field902 && var31 != null && var31.field593 < 0 && var6.field593 == var31.field593 && var6.field584 == var31.field584 && class411.field5572[var3].method1904(var4, (byte) -123, var26 + 1) == var30 && (var26 + 1 >= class81.field902 || var30 == class411.field5572[var3].method1904(var4, (byte) 109, var26 + 2)); var31 = class767.field10562[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class411.field5572[var7 ? var3 + 1 : var3].method1904(var4, (byte) 21, var25);
                            int var34 = var6.field593 * var32 + var33;
                            int var35 = class411.field5572[var7 ? var3 + 1 : var3].method1904(var4, (byte) 13, var26 + 1);
                            int var36 = var35 + (var6.field593 * var32);
                            int var37 = var25 << class645.field9018;
                            int var38 = (var26 << class645.field9018) + class109.field1611;
                            int var39 = var4 << class645.field9018;
                            class481.field6754[class715.field9911++] = new class478(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field584 + var39, var6.field584 + var39, var6.field584 + var39, var6.field584 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class767.field10562[var40][var41][var4].field593 = (short) (class767.field10562[var40][var41][var4].field593 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class479.field6739 = true;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lgn;)V")
    public class260(class729 arg0) {
        this.field3829 = arg0;
        this.field3828 = this.method123(4377);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILgn;)V")
    public class260(int arg0, class729 arg1) {
        this.field3829 = arg1;
        this.field3828 = arg0;
    }
}
