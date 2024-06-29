import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class261 extends class175 {

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    private int field4541 = 4096;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    private int field4544 = 4096;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    private int field4550 = 4096;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "Lij;")
    public static class50 field4545 = null;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "Lij;")
    private static class50 field4552 = class78.method578(123, "slide:");

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "Lij;")
    public static class50 field4551 = field4552;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "Lij;")
    public static class50 field4548 = field4552;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "Lod;")
    public static class127 field4547 = new class127(64);

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        ++field4543;
        if (arg1 != -20740) {
            field4548 = null;
        }
        int[][] var3 = super.field2920.method117(arg0, (byte) -99);
        if (super.field2920.field356) {
            int[][] var4 = this.method1206(0, arg0, (byte) 50);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class211.field3514; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var8[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var6[var11] = this.field4550 * var12 >> 12;
                    var9[var11] = this.field4541 * var13 >> 12;
                    var10[var11] = this.field4544 * var14 >> 12;
                } else {
                    var6[var11] = this.field4550;
                    var9[var11] = this.field4541;
                    var10[var11] = this.field4544;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V")
    public static final void method1756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4549;
        if (class48.field861 == 1) {
            class99.field1832[class237.field4011 / 100].method673(class2.field34 + -8, class258.field4497 + -8);
        }
        if (~class48.field861 == -3) {
            class99.field1832[4 - -(class237.field4011 / 100)].method673(class2.field34 + -8, class258.field4497 - 8);
        }
        if (arg0 < -61) {
            class2.method4(1252);
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V")
    public static final void method1757(byte arg0) {
        ++field4542;
        int var1 = -2 / ((arg0 - 9) / 63);
        for (class203 var2 = (class203) class227.field3824.method689(1001); var2 != null; var2 = (class203) class227.field3824.method688(-64)) {
            if (~var2.field3385 < -1) {
                --var2.field3385;
            }
            if (var2.field3385 != 0) {
                if (var2.field3371 > 0) {
                    --var2.field3371;
                }
                if (~var2.field3371 == -1 && var2.field3366 >= 1 && var2.field3373 >= 1 && var2.field3366 <= 102 && var2.field3373 <= 102 && (~var2.field3382 > -1 || class2.method13(var2.field3382, var2.field3384, 2))) {
                    class76.method572(var2.field3367, var2.field3369, var2.field3373, var2.field3366, var2.field3384, 3, var2.field3376, var2.field3382);
                    var2.field3371 = -1;
                    if (~var2.field3382 == ~var2.field3370 && var2.field3370 == -1) {
                        var2.method267(-1);
                    } else if (var2.field3382 == var2.field3370 && ~var2.field3372 == ~var2.field3369 && ~var2.field3384 == ~var2.field3380) {
                        var2.method267(-31);
                    }
                }
            } else if (var2.field3370 < 0 || class2.method13(var2.field3370, var2.field3380, 2)) {
                class76.method572(var2.field3367, var2.field3372, var2.field3373, var2.field3366, var2.field3380, 3, var2.field3376, var2.field3370);
                var2.method267(4);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4544 = arg2.method1441(-88);
                }
            } else {
                this.field4541 = arg2.method1441(125);
            }
        } else {
            this.field4550 = arg2.method1441(-14);
        }
        ++field4546;
        if (!arg0) {
            field4545 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class261() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)V")
    public static void method1758(byte arg0) {
        field4551 = null;
        field4547 = null;
        field4552 = null;
        if (arg0 < 18) {
            field4551 = null;
        }
        field4548 = null;
        field4545 = null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V")
    public static final void method1759(boolean arg0) {
        class46.field836 = null;
        if (!arg0) {
            method1759(false);
        }
        class20.field421 = null;
        ++field4540;
        class164.field2805 = null;
        class2.field27 = null;
        class114.field1996 = null;
        class31.field628 = null;
    }
}
