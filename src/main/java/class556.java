import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class556 extends class297 {

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    private int field7675 = 4096;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    private int field7679 = 0;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "Lwq;")
    public static class169 field7676 = new class169(1);

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "Lkn;")
    public static class737 field7680 = new class737(12, 7);

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "Ltr;")
    public static class296 field7682 = new class296();

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "Luh;")
    public static class168 field7683 = new class168();

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field7684 = 0;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "[I")
    public static int[] field7685 = new int[13];

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class556() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg2 != 31015) {
            this.field7675 = -15;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field4178 = arg0.method1535(arg2 + -30760) == 1;
                }
            } else {
                this.field7675 = arg0.method1478(arg2 + 842366929);
            }
        } else {
            this.field7679 = arg0.method1478(arg2 + 842366929);
        }
        ++field7677;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(II)[[I")
    public final int[][] method18(int arg0, int arg1) {
        if (arg1 != -1564599039) {
            method3199(true);
        }
        ++field7673;
        int[][] var3 = super.field4166.method2180(-117, arg0);
        if (super.field4166.field4849) {
            int[][] var4 = this.method1948((byte) -88, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class525.field7275 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field7679) {
                    var8[var11] = this.field7679;
                } else if (var12 <= this.field7675) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field7675;
                }
                if (this.field7679 > var13) {
                    var9[var11] = this.field7679;
                } else if (~this.field7675 <= ~var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field7675;
                }
                if (~var14 <= ~this.field7679) {
                    if (~this.field7675 <= ~var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field7675;
                    }
                } else {
                    var10[var11] = this.field7679;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    public static void method3198(int arg0) {
        field7680 = null;
        field7685 = null;
        field7676 = null;
        field7682 = null;
        field7683 = null;
        if (arg0 < 32) {
            method3198(58);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
    public static final void method3199(boolean arg0) {
        ++field7674;
        int var1 = 0;
        if (!arg0) {
            method3199(false);
        }
        while (~var1 > ~class738.field9939) {
            int var2 = class737.field9925[var1];
            class751 var3 = (class751) class86.field1546.method1465((long) var2, -6008);
            if (var3 != null) {
                class9 var4 = var3.field10510;
                class346.method2179(false, var4.field126.field4716, var4);
            }
            ++var1;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field7681;
        int[] var3 = super.field4165.method127(arg1 ^ arg1, arg0);
        if (super.field4165.field266) {
            int[] var4 = this.method1951(arg0, 633706337, 0);
            for (int var5 = 0; var5 < class525.field7275; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field7679) {
                    var3[var5] = this.field7679;
                } else if (var6 > this.field7675) {
                    var3[var5] = this.field7675;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }
}
