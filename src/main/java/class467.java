import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class467 extends class377 {

    @OriginalMember(owner = "client!eaa", name = "A", descriptor = "Z")
    public static boolean field5786 = false;

    @OriginalMember(owner = "client!eaa", name = "E", descriptor = "Ldr;")
    public static class675 field5790 = new class675(86, 0);

    @OriginalMember(owner = "client!eaa", name = "I", descriptor = "Ljava/lang/String;")
    public static String field5794 = null;

    @OriginalMember(owner = "client!eaa", name = "J", descriptor = "I")
    public static int field5795 = 0;

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!eaa", name = "B", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!eaa", name = "C", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!eaa", name = "D", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!eaa", name = "F", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!eaa", name = "G", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IILji;)V", line = 3)
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field5788;
        if (~arg0 == -1) {
            super.field4853 = arg2.method3097((byte) 12) == 1;
        }
        int var4 = 75 / ((arg1 - 13) / 55);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IB)[[I", line = 17)
    public final int[][] method23(int arg0, byte arg1) {
        ++field5791;
        int[][] var3 = super.field4850.method2566(-27346, arg0);
        int var4 = -80 / ((31 - arg1) / 42);
        if (super.field4850.field5843) {
            int[][] var5 = this.method2173(1, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class528.field6661; ++var12) {
                var9[var12] = -var6[var12] + 4096;
                var10[var12] = 4096 - var7[var12];
                var11[var12] = 4096 - var8[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "(I)V", line = 63)
    public static void method2545(int arg0) {
        if (arg0 < -68) {
            field5790 = null;
            field5794 = null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V", line = 74)
    public class467() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lpp;[III)V", line = 80)
    public static final void method2546(class365 arg0, int[] arg1, int arg2, int arg3) {
        if (arg0.field448 != null) {
            boolean var4 = true;
            for (int var5 = 0; arg0.field448.length > var5; ++var5) {
                if (arg0.field448[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field447 != -1) {
                class207 var6 = class11.field110.method1141(arg0.field447, (byte) 112);
                int var7 = var6.field2451;
                if (~var7 == -2) {
                    arg0.field407 = 0;
                    arg0.field489 = 0;
                    arg0.field466 = 1;
                    arg0.field478 = 0;
                    arg0.field472 = arg2;
                    class526.method2841(-305539927, arg0.field8010, var6, class67.field815 == arg0, arg0.field8018, arg0.field478, arg0.field8011);
                }
                if (var7 == 2) {
                    arg0.field489 = 0;
                }
            }
        }
        ++field5789;
        boolean var8 = true;
        for (int var9 = arg3; ~arg1.length < ~var9; ++var9) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg0.field448 == null || ~arg0.field448[var9] == 0 || ~class11.field110.method1141(arg1[var9], (byte) -62).field2425 <= ~class11.field110.method1141(arg0.field448[var9], (byte) -89).field2425) {
                arg0.field448 = arg1;
                arg0.field472 = arg2;
                break;
            }
        }
        if (var8) {
            arg0.field472 = arg2;
            arg0.field448 = arg1;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)I", line = 159)
    public static final int method2547(byte arg0, int arg1) {
        ++field5792;
        if (arg0 != -115) {
            method2545(-90);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZII)V", line = 178)
    public static final void method2548(boolean arg0, int arg1, int arg2) {
        ++field5785;
        if (arg0) {
            method2548(false, -49, 84);
        }
        class243 var3 = class546.method2926(arg2, 12, !arg0);
        var3.method1457(73);
        var3.field3132 = arg1;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)[I", line = 193)
    public final int[] method88(int arg0, int arg1) {
        ++field5787;
        int var3 = -34 % ((5 - arg1) / 53);
        int[] var4 = super.field4842.method2772(arg0, (byte) -112);
        if (super.field4842.field6354) {
            int[] var5 = this.method2174(0, arg0, (byte) 108);
            for (int var6 = 0; class528.field6661 > var6; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }
}
