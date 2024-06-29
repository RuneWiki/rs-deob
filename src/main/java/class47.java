import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class47 extends class196 {

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "I")
    private int field748 = 585;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "[[I")
    public static int[][] field744 = new int[5][5000];

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "Z")
    public static boolean field745 = false;

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "Ldf;")
    private static class51 field751 = class46.method233("Loaded fonts", 100);

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "Ldf;")
    public static class51 field740 = field751;

    @OriginalMember(owner = "client!ej", name = "eb", descriptor = "I")
    public static int field754 = 1;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!ej", name = "db", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "Lu;")
    public static class111 field746;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "Lja;")
    public static class55 field747;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BII)I")
    public static final int method240(byte arg0, int arg1, int arg2) {
        int var3 = arg2 >> 31 & arg1 + -1;
        ++field743;
        return arg0 < 94 ? 27 : ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 10565) {
            method241((byte) -4);
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int var4 = class161.field2639[arg0];
            for (int var5 = 0; ~var5 > ~class49.field767; ++var5) {
                int var6 = class211.field3510[var5];
                if (this.field748 < var6 && ~var6 > ~(-this.field748 + 4096) && ~(-this.field748 + 2048) > ~var4 && var4 < this.field748 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field748);
                    var3[var5] = 4096 - var10;
                } else if (~(2048 - this.field748) > ~var6 && var6 < this.field748 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field748;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field748 + 2048);
                } else if (var4 >= this.field748 && 4096 - this.field748 >= var4) {
                    if (var6 >= this.field748 && var6 <= -this.field748 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field748 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field748;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field748 + 2048);
                }
            }
        }
        ++field742;
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(B)V")
    public static void method241(byte arg0) {
        field747 = null;
        field751 = null;
        if (arg0 != -122) {
            method245(81, -7, 63, 118);
        }
        field740 = null;
        field744 = null;
        field746 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBLu;I)Lg;")
    public static final class254 method242(int arg0, byte arg1, class111 arg2, int arg3) {
        if (arg1 != -24) {
            method244(-108, 17, -34);
        }
        ++field749;
        return !class69.method480(arg0, 57, arg3, arg2) ? null : class11.method56(0);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class47() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V")
    public static final void method243(int arg0, byte arg1) {
        ++field752;
        if (arg1 != 77) {
            field754 = 97;
        }
        class257.field4495.method1348(0, arg0);
        class30.field428.method1348(arg1 + -77, arg0);
        class79.field1260.method1348(0, arg0);
        class29.field421.method1348(0, arg0);
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(III)I")
    public static final int method244(int arg0, int arg1, int arg2) {
        ++field753;
        int var3 = arg0;
        while (~arg2 < -2) {
            if ((1 & arg2) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 1;
        }
        if (~arg2 == -2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)V")
    public static final void method245(int arg0, int arg1, int arg2, int arg3) {
        ++field750;
        if (~class261.field4551 != -1 && arg3 != 0 && class218.field3792 < 50 && ~arg2 != 0) {
            class192.field3226[class218.field3792] = arg2;
            class7.field76[class218.field3792] = arg3;
            class228.field3977[class218.field3792] = arg1;
            class145.field2426[class218.field3792] = null;
            class209.field3487[class218.field3792] = 0;
            ++class218.field3792;
        }
        if (arg0 != -30361) {
            field740 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field741;
        if (arg2 != 82) {
            this.method44(-12, (class121) null, (byte) 98);
        }
        if (arg0 == 0) {
            this.field748 = arg1.method876(false);
        }
    }
}
