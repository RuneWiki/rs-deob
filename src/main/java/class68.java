import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class68 extends class129 implements class324 {

    @OriginalMember(owner = "client!ds", name = "ab", descriptor = "Z")
    private boolean field1062 = false;

    @OriginalMember(owner = "client!ds", name = "U", descriptor = "Llm;")
    public class205 field1056;

    @OriginalMember(owner = "client!ds", name = "Y", descriptor = "Z")
    private boolean field1060;

    @OriginalMember(owner = "client!ds", name = "S", descriptor = "I")
    public static int field1054 = -1;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ds", name = "N", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ds", name = "O", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ds", name = "P", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ds", name = "Q", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ds", name = "R", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ds", name = "T", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ds", name = "V", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ds", name = "W", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ds", name = "X", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ds", name = "Z", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ds", name = "bb", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ds", name = "cb", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ds", name = "M", descriptor = "Lro;")
    private class522 field1048;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method594(int arg0, int arg1, int arg2, class543 arg3) {
        ++field1055;
        class282 var5 = this.field1056.method1471(-2615, 131072, false, false, arg3);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 != 1) {
                this.method601((byte) -126);
            }
            class121 var6 = arg3.method342();
            var6.method845(super.field3923 - -super.field1778, super.field3922, super.field1779 + super.field3916);
            return !class100.field1447 ? var5.method496(arg1, arg0, var6, false, 0) : var5.method538(arg1, arg0, var6, false, 0, class680.field9660);
        }
    }

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "(I)I")
    public final int method595(int arg0) {
        if (arg0 != 32767) {
            field1054 = -113;
        }
        ++field1061;
        return this.field1056.method1467(arg0 + -32768);
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(Z)V")
    public static final void method596(boolean arg0) {
        if (arg0) {
            method605(41, 69);
        }
        class79.method649(-19704, 11);
        ++field1057;
        class710.method3971(true);
        System.gc();
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lha;Z)V")
    public final void method597(class543 arg0, boolean arg1) {
        this.field1056.method1461(105, arg0);
        if (!arg1) {
            ++field1064;
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V")
    public final void method598(byte arg0) {
        if (arg0 >= -9) {
            this.method599((byte) 83);
        }
        ++field1044;
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)I")
    public final int method599(byte arg0) {
        ++field1038;
        if (arg0 >= -4) {
            this.field1056 = null;
        }
        return this.field1056.method1464(0);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field1063;
        if (~class243.field3580.field7989.method3577(arg6) != -1 && arg4 != 0 && class279.field3914 < 50 && ~arg5 != 0) {
            class585.field8346[class279.field3914++] = new class105((byte) 1, arg5, arg4, arg3, arg2, arg1, arg0, (class280) null);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)I")
    public final int method601(byte arg0) {
        ++field1058;
        if (arg0 < 86) {
            this.method598((byte) -115);
        }
        return this.field1056.field3063;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(BLha;)Lro;")
    public final class522 method602(byte arg0, class543 arg1) {
        if (arg0 >= -114) {
            field1054 = 103;
        }
        ++field1051;
        return this.field1048;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)I")
    public static final int method603(int arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            method596(true);
        }
        ++field1043;
        double var3 = Math.log((double) arg2) / Math.log(2.0D);
        double var5 = Math.log((double) arg0) / Math.log(2.0D);
        double var7 = var5 + (var3 - var5) * Math.random();
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)I")
    public final int method604(byte arg0) {
        ++field1050;
        if (arg0 != 94) {
            this.method598((byte) 98);
        }
        return this.field1056.field3068;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)I")
    public static final int method605(int arg0, int arg1) {
        ++field1041;
        int var2 = -4 % ((arg1 - -20) / 59);
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)I")
    public final int method606(int arg0) {
        ++field1046;
        return arg0 > -32 ? 26 : this.field1056.field3091;
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(B)Z")
    public final boolean method607(byte arg0) {
        ++field1049;
        int var2 = -30 / ((27 - arg0) / 62);
        return false;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lha;I)V")
    public final void method608(class543 arg0, int arg1) {
        this.field1056.method1468(arg0, -89);
        int var3 = 107 / ((68 - arg1) / 32);
        ++field1059;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)I")
    public static final int method609(int arg0, byte arg1) {
        int var8 = arg0 - 1;
        ++field1052;
        int var2 = var8 | var8 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = -11 % ((arg1 - -74) / 51);
        int var7 = var5 | var5 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(BLha;)V")
    public final void method610(byte arg0, class543 arg1) {
        ++field1039;
        class282 var3 = this.field1056.method1471(-2615, 262144, true, false, arg1);
        if (arg0 < 51) {
            method596(true);
        }
        if (var3 != null) {
            int var4 = super.field3923 >> 9;
            int var5 = super.field3916 >> 9;
            class121 var6 = arg1.method342();
            var6.method845(super.field3923, super.field3922, super.field3916);
            this.field1056.method1466(var5, var4, var3, false, arg1, -1, var5, var4, var6);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Z")
    public final boolean method611(int arg0) {
        if (arg0 != 15795) {
            return false;
        } else {
            ++field1047;
            return this.field1056.method1470(-12);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZILla;Ljava/awt/Canvas;Ld;)Lha;")
    public static final class543 method612(int arg0, boolean arg1, int arg2, class423 arg3, Canvas arg4, class267 arg5) {
        ++field1040;
        int var6 = 0;
        int var7 = 0;
        if (arg4 != null) {
            Dimension var8 = arg4.getSize();
            var6 = var8.width;
            var7 = var8.height;
        }
        if (arg1) {
            method605(-34, 40);
        }
        return class543.method3270(var6, arg0, true, arg4, arg3, var7, arg5, arg2);
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lha;Lrq;IIIIIZIIIII)V")
    public class68(class543 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field1056 = new class205(arg0, arg1, arg10, arg11, super.field3920, arg3, this, arg7, arg12);
        this.field1060 = arg1.field6903 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLha;)Lqs;")
    public final class603 method613(byte arg0, class543 arg1) {
        ++field1045;
        class282 var3 = this.field1056.method1471(-2615, 2048, true, false, arg1);
        if (arg0 <= 76) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            class121 var4 = arg1.method342();
            var4.method845(super.field1778 + super.field3923, super.field3922, super.field1779 + super.field3916);
            class603 var5 = class6.method26(this.field1060, -94, 1);
            int var6 = super.field3923 >> 9;
            int var7 = super.field3916 >> 9;
            this.field1056.method1466(var7, var6, var3, true, arg1, -1, var7, var6, var4);
            if (class100.field1447) {
                var3.method503(var4, var5.field8543[0], class680.field9660, 0);
            } else {
                var3.method533(var4, var5.field8543[0], 0);
            }
            if (this.field1056.field3096 != null) {
                class458 var8 = this.field1056.field3096.method127();
                if (class100.field1447) {
                    arg1.method216(var8, class680.field9660);
                } else {
                    arg1.method214(var8);
                }
            }
            this.field1062 = var3.method497() || this.field1056.field3096 != null;
            if (this.field1048 != null) {
                class745.method4158(super.field3922, super.field3916, var3, super.field3923, -86, this.field1048);
            } else {
                this.field1048 = class222.method1551(var3, super.field3923, super.field3922, super.field3916, 34);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "(B)Z")
    public final boolean method614(byte arg0) {
        ++field1053;
        int var2 = 108 / ((-38 - arg0) / 63);
        return this.field1062;
    }
}
