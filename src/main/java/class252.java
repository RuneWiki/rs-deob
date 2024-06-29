import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class252 extends class144 {

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    private int field3641 = 3072;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    private int field3646 = 1024;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    private int field3643 = 2048;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "Z")
    public static boolean field3647 = false;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "[J")
    public static long[] field3648 = new long[1000];

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field3653 = 0;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "[I")
    public static int[] field3639;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "[[Z")
    public static boolean[][] field3642;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "[[[B")
    public static byte[][][] field3644;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field3640;
        if (arg1 != 255) {
            this.method9(118, (class216) null, -71);
        }
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int[] var4 = this.method934(-18877, 0, arg0);
            for (int var5 = 0; var5 < class104.field1411; ++var5) {
                var3[var5] = (var4[var5] * this.field3643 >> 12) + this.field3646;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        ++field3652;
        int[][] var3 = super.field2053.method1542(arg0 + 81, arg1);
        if (super.field2053.field3408) {
            int[][] var4 = this.method927(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class104.field1411; ++var11) {
                var8[var11] = (var5[var11] * this.field3643 >> 12) + this.field3646;
                var9[var11] = this.field3646 - -(var6[var11] * this.field3643 >> 12);
                var10[var11] = (var7[var11] * this.field3643 >> 12) + this.field3646;
            }
        }
        return arg0 != 5 ? null : var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field3649;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field2059 = ~arg1.method1407(arg2 ^ 20707) == -2;
                }
            } else {
                this.field3641 = arg1.method1380(true);
            }
        } else {
            this.field3646 = arg1.method1380(true);
        }
        if (arg2 != 20630) {
            method1619(true, 8, (class166) null);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZILe;)V")
    public static final void method1619(boolean arg0, int arg1, class166 arg2) {
        ++field3655;
        int var3 = arg2.field2395;
        int var4 = (int) arg2.field4489;
        arg2.method1935(103);
        if (arg0) {
            class188.method1235(-9708, var3);
        }
        class165.method1082(0, var3);
        class82 var5 = class182.method1187((byte) -41, var4);
        int var6 = -2 % ((62 - arg1) / 35);
        if (var5 != null) {
            class255.method1632(16711680, var5);
        }
        int var7 = class112.field1496;
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            if (class285.method1902(class190.field2749[var8], false)) {
                class32.method202(1, var8);
            }
        }
        if (class112.field1496 == 1) {
            class177.field2518 = false;
            class9.method66(class267.field3901, class76.field911, class263.field3814, -35, class221.field3134);
        } else {
            class9.method66(class267.field3901, class76.field911, class263.field3814, -35, class221.field3134);
            int var9 = class248.field3614.method539(class164.field2349);
            for (int var10 = 0; var10 < class112.field1496; ++var10) {
                int var11 = class248.field3614.method539(class59.method368(var10, (byte) -127));
                if (var11 > var9) {
                    var9 = var11;
                }
            }
            class267.field3901 = var9 - -8;
            class76.field911 = class112.field1496 * 15 + (class154.field2226 ? 26 : 22);
        }
        if (class123.field1776 != -1) {
            class200.method1290(1, class123.field1776, 24826);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lbc;I)V")
    public static final void method1620(class282 arg0, int arg1) {
        class159.field2304 = arg0.method1844("runes", 114);
        ++field3645;
        if (arg1 != 9319) {
            field3644 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        ++field3651;
        if (arg0 >= -109) {
            field3644 = null;
        }
        this.field3643 = this.field3641 - this.field3646;
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V")
    public static void method1621(int arg0) {
        field3639 = null;
        field3648 = null;
        field3642 = null;
        if (arg0 != 1024) {
            field3653 = -23;
        }
        field3644 = null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class252() {
        super(1, false);
    }
}
