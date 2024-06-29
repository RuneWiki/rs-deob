import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class364 extends class463 implements class55 {

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "Z")
    private boolean field5034;

    @OriginalMember(owner = "client!hr", name = "O", descriptor = "B")
    private byte field5049;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "B")
    private byte field5040;

    @OriginalMember(owner = "client!hr", name = "Q", descriptor = "B")
    private byte field5051;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "Z")
    private boolean field5033;

    @OriginalMember(owner = "client!hr", name = "db", descriptor = "S")
    private short field5064;

    @OriginalMember(owner = "client!hr", name = "V", descriptor = "Z")
    private boolean field5056;

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "Lc;")
    private class121 field5041;

    @OriginalMember(owner = "client!hr", name = "R", descriptor = "Lj;")
    private class378 field5052;

    @OriginalMember(owner = "client!hr", name = "U", descriptor = "[I")
    public static int[] field5055 = new int[2048];

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!hr", name = "H", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!hr", name = "S", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!hr", name = "T", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!hr", name = "W", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!hr", name = "Y", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!hr", name = "Z", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!hr", name = "ab", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!hr", name = "cb", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "Lvh;")
    public static class240 field5047;

    @OriginalMember(owner = "client!hr", name = "bb", descriptor = "Lep;")
    public static class288 field5062;

    @OriginalMember(owner = "client!hr", name = "X", descriptor = "[Lna;")
    public static class35[] field5058;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILqa;)V")
    public final void method356(int arg0, class162 arg1) {
        ++field5039;
        if (arg0 < 100) {
            this.method356(98, (class162) null);
        }
        Object var3 = null;
        class378 var5;
        if (this.field5052 == null && this.field5056) {
            class60 var4 = this.method2049(88, 262144, arg1, true);
            var5 = var4 != null ? var4.field801 : null;
        } else {
            var5 = this.field5052;
            this.field5052 = null;
        }
        if (var5 != null) {
            class174.method1075(var5, this.field5051, super.field6735, super.field6725, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILwo;ILqa;I)V")
    public static final void method2048(int arg0, class522 arg1, int arg2, class162 arg3, int arg4) {
        class496.field7297.method3076((byte) -89);
        ++field5061;
        if (!class59.field797) {
            int var5 = -111 % ((arg2 - -21) / 44);
            for (class92 var6 = (class92) arg1.method3072((byte) 102); var6 != null; var6 = (class92) arg1.method3066(2)) {
                class191 var7 = class481.field7031.method850((byte) 78, var6.field1236);
                if (class300.method1712(4096, var7)) {
                    boolean var8 = class205.method1246(arg4, arg0, arg3, -122, var7, var6);
                    if (var8) {
                        class506.method2972(var6, arg3, -10772, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V")
    public final void method361(int arg0) {
        ++field5043;
        int var2 = 23 % ((arg0 - -36) / 36);
        if (this.field5041 != null) {
            this.field5041.method796();
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lqa;I)Lip;")
    public final class498 method402(class162 arg0, int arg1) {
        ++field5037;
        if (this.field5041 == null) {
            return null;
        } else {
            class415 var3 = arg0.method539();
            var3.method340(super.field6735 - -super.field6719, super.field6723, super.field6731 + super.field6725);
            class498 var4 = null;
            if (this.field5033) {
                var4 = class227.method1338(0, 1);
            }
            this.field5041.method781(var3, var4 == null ? null : var4.field7332[0], 0);
            if (arg1 != 16562) {
                field5059 = -100;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(ILqa;)V")
    public final void method357(int arg0, class162 arg1) {
        ++field5060;
        if (arg0 < 41) {
            this.method355(-106);
        }
        Object var3 = null;
        class378 var5;
        if (this.field5052 == null && this.field5056) {
            class60 var4 = this.method2049(102, 262144, arg1, true);
            var5 = var4 != null ? var4.field801 : null;
        } else {
            var5 = this.field5052;
            this.field5052 = null;
        }
        if (var5 != null) {
            class114.method731(var5, this.field5051, super.field6735, super.field6725, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I")
    public final int method355(int arg0) {
        if (arg0 != 13599) {
            return 27;
        } else {
            ++field5046;
            return this.field5040;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILqa;)Lc;")
    public final class121 method358(int arg0, int arg1, class162 arg2) {
        if (arg0 != 4586) {
            return null;
        } else {
            ++field5057;
            return this.method2053(arg1, (byte) 26, arg2);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILqa;Z)Ltt;")
    private final class60 method2049(int arg0, int arg1, class162 arg2, boolean arg3) {
        ++field5035;
        class132 var5 = class82.field1154.method2121(65535 & this.field5064, true);
        if (arg0 < 29) {
            return null;
        } else {
            class35 var6;
            class35 var7;
            if (!this.field5034) {
                if (~this.field5051 <= -4) {
                    var6 = null;
                } else {
                    var6 = class19.field195[this.field5051 + 1];
                }
                var7 = class19.field195[this.field5051];
            } else {
                var7 = field5058[this.field5051];
                var6 = class19.field195[0];
            }
            return var5.method860(super.field6735, var7, super.field6723, this.field5040, arg2, this.field5049, 7, arg3, super.field6725, var6, arg1);
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)Z")
    public final boolean method360(int arg0) {
        if (arg0 <= 34) {
            return false;
        } else {
            ++field5054;
            return this.field5056;
        }
    }

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)I")
    public final int method1837(int arg0) {
        ++field5036;
        if (arg0 > -53) {
            return -20;
        } else {
            return this.field5041 != null ? this.field5041.method771() : 0;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)I")
    public final int method354(byte arg0) {
        ++field5045;
        int var2 = 86 / ((61 - arg0) / 53);
        return 65535 & this.field5064;
    }

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "(I)V")
    public static void method2050(int arg0) {
        field5047 = null;
        field5055 = null;
        field5062 = null;
        field5058 = null;
        if (arg0 != 0) {
            method2048(70, (class522) null, 122, (class162) null, -46);
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)I")
    public final int method359(byte arg0) {
        ++field5053;
        if (arg0 != -8) {
            this.method361(111);
        }
        return this.field5049;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(ILqa;)V")
    public final void method400(int arg0, class162 arg1) {
        int var3 = -74 % ((-29 - arg0) / 33);
        ++field5048;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(CB)Z")
    public static final boolean method2051(char arg0, byte arg1) {
        ++field5063;
        if ((~arg0 >= -1 || ~arg0 <= -129) && (arg0 < 160 || arg0 > 255)) {
            if (arg0 != 0) {
                char[] var2 = class281.field3798;
                for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
            }
            if (arg1 != -57) {
                field5055 = null;
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lqa;Lpk;IIIIZIIIII)V")
    public class364(class162 arg0, class132 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class336.method1867((byte) 125, arg11, arg10));
        super.field6735 = arg3;
        this.field5034 = arg6;
        this.field5049 = (byte) arg11;
        this.field5040 = (byte) arg10;
        this.field5051 = (byte) arg2;
        this.field5033 = arg1.field1850 != 0 && !arg6;
        this.field5064 = (short) arg1.field1866;
        super.field6725 = arg5;
        this.field5056 = arg0.method485() && arg1.field1891 && !this.field5034 && class437.field6374.method1765(class278.field3761, (byte) -101) != 0;
        class60 var13 = this.method2049(106, 2048, arg0, this.field5056);
        if (var13 != null) {
            this.field5041 = var13.field803;
            this.field5052 = var13.field801;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILm;ILjava/awt/Canvas;)Lqa;")
    public static final class162 method2052(int arg0, class126 arg1, int arg2, Canvas arg3) {
        int var4 = 101 % ((67 - arg0) / 53);
        ++field5042;
        return new class70(arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 24130) {
            this.field5033 = true;
        }
        ++field5038;
        class121 var5 = this.method2053(131072, (byte) 26, arg0);
        if (var5 != null) {
            class415 var6 = arg0.method539();
            var6.method340(super.field6735, super.field6723, super.field6725);
            return var5.method777(arg1, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBLqa;)Lc;")
    private final class121 method2053(int arg0, byte arg1, class162 arg2) {
        ++field5050;
        if (arg1 != 26) {
            this.method359((byte) -59);
        }
        if (this.field5041 != null && arg2.method472(this.field5041.method775(), arg0) == 0) {
            return this.field5041;
        } else {
            class60 var4 = this.method2049(108, arg0, arg2, false);
            return var4 != null ? var4.field803 : null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLvh;Lvh;)I")
    public static final int method2054(byte arg0, class240 arg1, class240 arg2) {
        ++field5044;
        if (arg0 != 63) {
            field5062 = null;
        }
        int var3 = 0;
        if (arg1.method1412(class316.field4390, arg0 ^ 62)) {
            ++var3;
        }
        if (arg1.method1412(class483.field7100, 1)) {
            ++var3;
        }
        if (arg1.method1412(class171.field2448, 1)) {
            ++var3;
        }
        if (arg2.method1412(class316.field4390, arg0 ^ 62)) {
            ++var3;
        }
        if (arg2.method1412(class483.field7100, 1)) {
            ++var3;
        }
        if (arg2.method1412(class171.field2448, arg0 ^ 62)) {
            ++var3;
        }
        return var3;
    }

    static {
        new class83((String) null, "geschickt werden.", (String) null, (String) null);
    }
}
