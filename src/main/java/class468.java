import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class468 extends class381 {

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    private int field6743;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    private int field6735;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    private int field6725;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    private int field6729;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    private int field6726;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public int field6737;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public int field6728;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public int field6731;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public int field6727;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field6730 = 0;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Ljava/lang/String;")
    public static String field6738;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ldj;II)V")
    public static final void method2697(class453 arg0, int arg1, int arg2) {
        if (class621.field8991) {
            class621.field8991 = false;
            arg1 = 0;
        }
        field6741++;
        if (class540.field7911 == null || !class540.field7911.method2661((byte) 32, arg0)) {
            class540.field7911 = arg0;
            class157.field2238 = class60.method371(false);
            class629.field9108 = arg1;
            class230.field3050 = arg1;
            if (class230.field3050 == 0) {
                class375.method2319(5);
            } else {
                class541.field8025 = class129.field1858;
                class187.field2530 = class508.field7178;
                class365.field5357 = class19.field378;
                class379.field5707 = class477.field6832;
                class680.field9610 = class221.field2938;
                class162.field2297 = class629.field9109;
                class319.field4628 = class274.field3590;
                class305.field4521 = class158.field2242;
                class229.field3044 = class45.field684;
                class313.field4590 = class644.field9279;
            }
        }
        if (arg2 < 122) {
            method2706((byte) -111, -125);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IC)C")
    public static final char method2698(int arg0, char arg1) {
        field6724++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            if (arg0 > -23) {
                method2698(62, '_');
            }
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method2699(byte arg0) {
        field6738 = null;
        int var1 = -117 % ((arg0 - 44) / 44);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IC)Z")
    public static final boolean method2700(int arg0, char arg1) {
        field6732++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            if (arg0 != 376) {
                field6730 = -127;
            }
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)Z")
    public final boolean method2701(int arg0, int arg1, int arg2) {
        if (arg0 != -28440) {
            this.field6743 = 109;
        }
        field6742++;
        return this.field6728 <= arg1 && this.field6737 >= arg1 && this.field6727 <= arg2 && this.field6731 >= arg2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)Z")
    public final boolean method2702(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == -6636) {
            field6723++;
            return this.field6725 == arg2 && this.field6743 <= arg0 && arg0 <= this.field6726 && this.field6729 <= arg1 && this.field6735 >= arg1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([IIIZ)V")
    public final void method2703(int[] arg0, int arg1, int arg2, boolean arg3) {
        arg0[0] = this.field6725;
        if (!arg3) {
            method2697(null, -41, -36);
        }
        arg0[1] = this.field6743 + arg1 - this.field6728;
        arg0[2] = arg2 + this.field6729 - this.field6727;
        field6739++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI[II)V")
    public final void method2704(byte arg0, int arg1, int[] arg2, int arg3) {
        arg2[0] = 0;
        arg2[2] = this.field6727 + arg1 - this.field6729;
        field6733++;
        arg2[1] = this.field6728 + arg3 - this.field6743;
        if (arg0 != 27) {
            this.method2705(false, -36, 82);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZII)Z")
    public final boolean method2705(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field6731 = -113;
        }
        field6734++;
        return this.field6743 <= arg1 && this.field6726 >= arg1 && arg2 >= this.field6729 && this.field6735 >= arg2;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field6743 = arg1;
        this.field6735 = arg4;
        this.field6725 = arg0;
        this.field6729 = arg2;
        this.field6726 = arg3;
        this.field6737 = arg7;
        this.field6728 = arg5;
        this.field6731 = arg8;
        this.field6727 = arg6;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)[B")
    public static final byte[] method2706(byte arg0, int arg1) {
        if (arg0 != -56) {
            return null;
        }
        field6736++;
        class64 var2 = (class64) class48.field763.method3720(-86, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class339.method2095(true, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class64(var3);
            class48.field763.method3716(var2, (byte) -24, (long) arg1);
        }
        return var2.field1007;
    }
}
