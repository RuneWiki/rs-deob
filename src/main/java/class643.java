import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class643 extends class601 {

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    private int field8556 = 4096;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    private int field8562 = 4096;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    private int field8561 = 4096;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "Lro;")
    public static class2 field8560 = new class2();

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Ljava/lang/String;")
    public static String field8558;

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class643() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IZ)[[I")
    public final int[][] method7(int arg0, boolean arg1) {
        ++field8557;
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769) {
            int[][] var4 = this.method3268(arg0, 0, 65535);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class171.field2624; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field8561 * var12 >> 12;
                    var9[var11] = this.field8556 * var13 >> 12;
                    var10[var11] = this.field8562 * var14 >> 12;
                } else {
                    var8[var11] = this.field8561;
                    var9[var11] = this.field8556;
                    var10[var11] = this.field8562;
                }
            }
        }
        if (!arg1) {
            method3528(-68, -51, false, 105);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
    public static void method3526(int arg0) {
        if (arg0 != 4096) {
            field8560 = null;
        }
        field8558 = null;
        field8560 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I")
    public static final int method3527(int arg0, int arg1) {
        int var2 = -119 % ((arg0 - 45) / 32);
        ++field8554;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIZI)I")
    public static final int method3528(int arg0, int arg1, boolean arg2, int arg3) {
        ++field8553;
        if (~class178.field2687 > -101) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class744.field10370 + arg3;
            if (!arg2) {
                field8558 = null;
            }
            int var7 = -class744.field10371 + arg0;
            for (class630 var8 = (class630) class744.field10345.method21(2); var8 != null; var8 = (class630) class744.field10345.method9(-128)) {
                if (~var8.field8387 == ~arg1) {
                    int var9 = var8.field8396;
                    int var10 = var8.field8390;
                    int var11 = class744.field10371 + var10 | class744.field10370 + var9 << 14;
                    int var12 = (var6 - var9) * (-var9 + var6) + (-var10 + var7) * (-var10 + var7);
                    if (var4 < 0 || var5 > var12) {
                        var4 = var11;
                        var5 = var12;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z[B)Ljava/lang/String;")
    public static final String method3529(boolean arg0, byte[] arg1) {
        ++field8555;
        if (!arg0) {
            method3527(113, -123);
        }
        return class318.method1930(0, arg1.length, arg1, -63);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        ++field8559;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field8562 = arg0.method3807(-1);
                }
            } else {
                this.field8556 = arg0.method3807(arg1 + 60);
            }
        } else {
            this.field8561 = arg0.method3807(-1);
        }
        if (arg1 != -61) {
            this.method7(-95, false);
        }
    }
}
