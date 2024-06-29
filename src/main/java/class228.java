import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class228 extends class53 {

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "Z")
    private boolean field3824 = true;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    private int field3830 = 4096;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public static int field3828 = 1;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "Z")
    public static boolean field3831 = false;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 4)
    public class228() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)V", line = 13)
    public static final void method1665(byte arg0, int arg1) {
        field3823++;
        if (arg1 == -1 || !class218.field3721[arg1]) {
            return;
        }
        class198.field3331.method1895(arg1, (byte) -44);
        if (class249.field4198[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class249.field4198[arg1].length; var3++) {
            if (class249.field4198[arg1][var3] != null) {
                if (class249.field4198[arg1][var3].field4441 == 2) {
                    var2 = false;
                } else {
                    class249.field4198[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class249.field4198[arg1] = null;
        }
        if (arg0 < 15) {
            field3831 = true;
        }
        class218.field3721[arg1] = false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([BB)Ldc;", line = 65)
    public static final class101 method1666(byte[] arg0, byte arg1) {
        field3826++;
        if (arg0 == null) {
            return null;
        } else {
            class33 var2 = new class33(arg0, class85.field1404, class232.field3934, class210.field3590, class287.field4936, class42.field687);
            class235.method1713(0);
            int var3 = 21 / ((58 - arg1) / 50);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[[I", line = 87)
    public final int[][] method66(int arg0, int arg1) {
        field3827++;
        int var3 = -55 / ((76 - arg1) / 42);
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int[] var5 = this.method391(0, 0, class3.field31 & arg0 - 1);
            int[] var6 = this.method391(0, 0, arg0);
            int[] var7 = this.method391(0, 0, arg0 + 1 & class3.field31);
            int[] var8 = var4[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            for (int var11 = 0; var11 < class269.field4644; var11++) {
                int var12 = (var7[var11] - var5[var11]) * this.field3830;
                int var13 = (var6[class157.field2697 & var11 + 1] - var6[var11 - 1 & class157.field2697]) * this.field3830;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 + var17 + 4096) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (var18 == 0) {
                    var19 = 0;
                    var21 = 0;
                    var20 = 0;
                } else {
                    var19 = var13 / var18;
                    var20 = var12 / var18;
                    var21 = 16777216 / var18;
                }
                if (this.field3824) {
                    var20 = (var20 >> 1) + 2048;
                    var21 = (var21 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var10[var11] = var19;
                var9[var11] = var20;
                var8[var11] = var21;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIII)V", line = 169)
    public static final void method1667(int arg0, int arg1, int arg2, int arg3) {
        class85.field1409 = new class242[arg0][arg1][arg2];
        class60.field1058 = new int[arg0][arg1 + 1][arg2 + 1];
        class170.field2856 = new class38[4][];
        class258.method1844(false);
        class150.field2573 = arg1;
        class262.field4440 = arg2;
        class154.field2641 = new int[arg0][arg1 + 1][arg2 + 1];
        class301.method2069();
        class260.field4359 = arg3;
        class7.field84 = new boolean[class260.field4359 + class260.field4359 + 1][class260.field4359 + class260.field4359 + 1];
        class147.field2554 = new boolean[class260.field4359 + class260.field4359 + 2][class260.field4359 + class260.field4359 + 2];
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILja;Z)V", line = 188)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (!arg2) {
            method1665((byte) -78, 8);
        }
        if (arg0 == 0) {
            this.field3830 = arg1.method485((byte) -2);
        } else if (arg0 == 1) {
            this.field3824 = arg1.method501(0) == 1;
        }
        field3829++;
    }
}
