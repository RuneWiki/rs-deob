import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class232 extends class67 {

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    private int field3982 = 0;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    private int field3991 = -32768;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "Z")
    private boolean field4001 = false;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Z")
    private boolean field3974 = false;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    private int field4014 = 0;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    private int field3992;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    private int field3997;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    private int field3988;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public int field3989;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public int field3984;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    private int field3987;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    private int field3976;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    private int field3990;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "Lie;")
    private class2 field3999;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "J")
    public static long field3975 = 0L;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field4011 = 0;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "Z")
    public static boolean field4013 = true;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "D")
    private double field3980;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "D")
    public double field3981;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "D")
    public double field3986;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "D")
    private double field3996;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "D")
    private double field4003;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "D")
    private double field4005;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "D")
    public double field4010;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "D")
    private double field4016;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    private int field4004;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Ldk;")
    private class193 field3977;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "Lpe;")
    public static class237 field3995;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "[[Lpe;")
    public static class237[][] field4000;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
    public static final int method1597(int arg0) {
        field3993++;
        if (arg0 <= 32) {
            method1599(106);
        }
        if (class180.field3000) {
            return 0;
        } else if (class72.method492(-2001)) {
            return class198.field3366 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)Lbl;")
    private final class253 method1598(byte arg0) {
        if (arg0 != -91) {
            this.field4014 = 63;
        }
        field3985++;
        class231 var2 = class79.method536(-55, this.field3976);
        class253 var3 = var2.method1593(this.field3982, -28023);
        if (var3 == null) {
            return null;
        } else {
            var3.method1467(this.field4004);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static void method1599(int arg0) {
        if (arg0 != 0) {
            method1597(27);
        }
        field3995 = null;
        field4000 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
    public final void method1600(int arg0, int arg1) {
        this.field4010 += (double) arg1 * this.field3996;
        this.field4001 = true;
        this.field3981 += (double) arg1 * this.field4005;
        this.field3986 += this.field4016 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field4003;
        this.field4003 += (double) arg1 * this.field4016;
        field3998++;
        this.field4012 = (int) (Math.atan2(this.field4005, this.field3996) * 325.949D) - arg0 & 0x7FF;
        this.field4004 = (int) (Math.atan2(this.field4003, this.field3980) * 325.949D) & 0x7FF;
        if (this.field3999 == null) {
            return;
        }
        this.field4014 += arg1;
        while (true) {
            do {
                do {
                    if (this.field3999.field46[this.field3982] >= this.field4014) {
                        return;
                    }
                    this.field4014 -= this.field3999.field46[this.field3982];
                    this.field3982++;
                } while (this.field3982 < this.field3999.field24.length);
                this.field3982 -= this.field3999.field47;
            } while (this.field3982 >= 0 && this.field3999.field24.length > this.field3982);
            this.field3982 = 0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLbl;)V")
    private final void method1601(byte arg0, class253 arg1) {
        field3978++;
        if (arg0 > -65) {
            this.field3996 = -0.21491180288110195D;
        }
        class209 var3 = (class209) arg1;
        if ((this.field3977 == null || this.field3977.field3289) && (var3.field3545 != null || var3.field3536 != null)) {
            this.field3977 = new class193(class72.field1146, 1, 1);
        }
        if (this.field3977 != null) {
            this.field3977.method1331(var3.field3545, var3.field3536, false, var3.field3558, var3.field3540, var3.field3534);
        }
        this.field3974 = true;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIIII)V")
    public final void method1602(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3983++;
        if (!this.field4001) {
            double var6 = (double) (arg0 - this.field3992);
            double var8 = (double) (arg4 - this.field3990);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3986 = (double) this.field3988;
            this.field3981 = (double) this.field3987 * var6 / var10 + (double) this.field3992;
            this.field4010 = (double) this.field3987 * var8 / var10 + (double) this.field3990;
        }
        double var12 = (double) (this.field3984 + 1 - arg2);
        this.field3996 = ((double) arg4 - this.field4010) / var12;
        this.field4005 = ((double) arg0 - this.field3981) / var12;
        this.field3980 = Math.sqrt(this.field4005 * this.field4005 + this.field3996 * this.field3996);
        int var14 = 91 / ((35 - arg1) / 38);
        if (!this.field4001) {
            this.field4003 = -this.field3980 * Math.tan((double) this.field3997 * 0.02454369D);
        }
        this.field4016 = ((double) arg3 - this.field3986 - this.field4003 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3994++;
        if (!this.field3974) {
            class253 var6 = this.method1598((byte) -91);
            if (var6 == null) {
                return;
            }
            this.method1601((byte) -93, var6);
        }
        if (this.field3977 != null) {
            this.field3977.method1332(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public static final void method1603(int arg0) {
        if (arg0 > -112) {
            method1597(-118);
        }
        class286.field5043.method1403(45);
        field4015++;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()I")
    public final int method308() {
        field4007++;
        return this.field3991;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIJILdk;)V")
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class193 arg10) {
        class253 var13 = this.method1598((byte) -91);
        field4008++;
        if (var13 != null) {
            this.method1601((byte) -108, var13);
            var13.method313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3977);
            this.field3991 = var13.method308();
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4009 = arg5;
        this.field4001 = false;
        this.field3992 = arg2;
        this.field3997 = arg7;
        this.field3988 = arg4;
        this.field3989 = arg9;
        this.field3973 = arg1;
        this.field3984 = arg6;
        this.field3987 = arg8;
        this.field3976 = arg0;
        this.field3990 = arg3;
        this.field4006 = arg10;
        int var12 = class79.method536(117, this.field3976).field3947;
        if (var12 == -1) {
            this.field3999 = null;
        } else {
            this.field3999 = class186.method1242(0, var12);
        }
    }
}
