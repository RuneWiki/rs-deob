import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class35 extends class273 {

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "I")
    private int field797 = 4;

    @OriginalMember(owner = "client!vk", name = "ab", descriptor = "I")
    private int field801 = 4;

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "Ljd;")
    public static class86 field798 = class122.method868("0", true);

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "I")
    public static int field800 = 0;

    @OriginalMember(owner = "client!vk", name = "bb", descriptor = "Ljd;")
    public static class86 field802 = class122.method868("Bitte warten Sie)3)3)3", true);

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!vk", name = "cb", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!vk", name = "db", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "[[[I")
    public static int[][][] field796;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -7420) {
            return null;
        } else {
            ++field795;
            int[] var3 = super.field4800.method1224(arg1, 0);
            if (super.field4800.field3160) {
                int var4 = class176.field3200 / this.field801;
                int var5 = class96.field1896 / this.field797;
                int[] var7;
                if (~var5 < -1) {
                    int var6 = arg1 % var5;
                    var7 = this.method1863(arg0 ^ 7332, 0, class96.field1896 * var6 / var5);
                } else {
                    var7 = this.method1863(arg0 ^ 7332, 0, 0);
                }
                for (int var8 = 0; ~class176.field3200 < ~var8; ++var8) {
                    if (~var4 >= -1) {
                        var3[var8] = var7[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class176.field3200 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class35() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lbj;ILv;Lbj;)V")
    public static final void method267(class151 arg0, int arg1, class146 arg2, class151 arg3) {
        class209.field3778 = arg0;
        class151.field2826 = arg2;
        ++field804;
        class133.field2532 = arg3;
        if (arg1 != 667) {
            method269((class33) null, -84);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        ++field793;
        int var3 = 74 % ((arg1 - 12) / 58);
        int[][] var4 = super.field4787.method1657(arg0, (byte) -121);
        if (super.field4787.field4355) {
            int var5 = class96.field1896 / this.field797;
            int var6 = class176.field3200 / this.field801;
            int[][] var7;
            if (var5 <= 0) {
                var7 = this.method1859(0, 0, 3);
            } else {
                int var8 = arg0 % var5;
                var7 = this.method1859(class96.field1896 * var8 / var5, 0, 3);
            }
            int[] var9 = var7[1];
            int[] var10 = var7[0];
            int[] var11 = var7[2];
            int[] var12 = var4[1];
            int[] var13 = var4[0];
            int[] var14 = var4[2];
            for (int var15 = 0; class176.field3200 > var15; ++var15) {
                int var17;
                if (~var6 < -1) {
                    int var16 = var15 % var6;
                    var17 = class176.field3200 * var16 / var6;
                } else {
                    var17 = 0;
                }
                var13[var15] = var10[var17];
                var12[var15] = var9[var17];
                var14[var15] = var11[var17];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field797 = arg1.method1408((byte) -85);
            }
        } else {
            this.field801 = arg1.method1408((byte) -100);
        }
        if (arg2 >= -16) {
            this.method31(50, 20);
        }
        ++field794;
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V")
    public static void method268(int arg0) {
        field802 = null;
        if (arg0 != 1) {
            method269((class33) null, 77);
        }
        field796 = null;
        field798 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lbl;I)V")
    public static final void method269(class33 arg0, int arg1) {
        int var2 = -class236.field4265 + arg0.field747;
        int var3 = arg0.field740 * arg1 - -(arg0.method240((byte) 25) * 64);
        ++field803;
        int var4 = arg0.field728 * 128 + 64 * arg0.method240((byte) 97);
        arg0.field721 = 0;
        arg0.field676 += (-arg0.field676 + var3) / var2;
        arg0.field685 += (var4 - arg0.field685) / var2;
        if (~arg0.field674 == -1) {
            arg0.field716 = 1024;
        }
        if (arg0.field674 == 1) {
            arg0.field716 = 1536;
        }
        if (arg0.field674 == 2) {
            arg0.field716 = 0;
        }
        if (arg0.field674 == 3) {
            arg0.field716 = 512;
        }
    }
}
