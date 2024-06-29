import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class726 extends class243 {

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    private int field10132;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field10135 = 0;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "[I")
    public static int[] field10138 = new int[5];

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field10130;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field10131;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field10133;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field10134;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field10137;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field10139;

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V", line = 9)
    public class726() {
        this(4096);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Loi;I)I", line = 13)
    public static final int method4071(class74 arg0, int arg1) {
        ++field10137;
        if (~arg0.field872 == -1) {
            return 0;
        } else {
            if (~arg0.field809 != arg1) {
                class74 var2 = null;
                if (~arg0.field809 > -32769) {
                    class706 var3 = (class706) class681.field9475.method2552((long) arg0.field809, arg1 + -1);
                    if (var3 != null) {
                        var2 = var3.field9890;
                    }
                } else if (~arg0.field809 <= -32769) {
                    var2 = class361.field4793[arg0.field809 + -32768];
                }
                if (var2 != null) {
                    int var4 = -var2.field2170 + arg0.field2170;
                    int var5 = -var2.field2165 + arg0.field2165;
                    if (~var4 != -1 || var5 != 0) {
                        arg0.method551(16383 & (int) (2607.5945876176133D * Math.atan2((double) var4, (double) var5)), -8193);
                    }
                }
            }
            if (!(arg0 instanceof class83)) {
                if (arg0 instanceof class215) {
                    class215 var6 = (class215) arg0;
                    if (var6.field2602 != -1 && (var6.field895 == 0 || ~var6.field894 < -1)) {
                        int var7 = var6.field2170 - (-class99.field1313 + var6.field2602 + -class99.field1313) * 256;
                        int var8 = var6.field2165 - (var6.field2593 - class133.field1704 + -class133.field1704) * 256;
                        if (~var7 != -1 || var8 != 0) {
                            var6.method551((int) (2607.5945876176133D * Math.atan2((double) var7, (double) var8)) & 16383, arg1 ^ -8193);
                        }
                        var6.field2602 = -1;
                    }
                }
            } else {
                class83 var9 = (class83) arg0;
                if (var9.field1112 != -1 && (var9.field895 == 0 || ~var9.field894 < -1)) {
                    var9.method551(var9.field1112, -8193);
                    var9.field1112 = -1;
                }
            }
            return arg0.method542((byte) -39);
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 90)
    public static void method4072(int arg0) {
        if (arg0 > 126) {
            field10138 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I)V", line = 100)
    public class726(int arg0) {
        super(0, true);
        this.field10132 = 4096;
        this.field10132 = arg0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[I", line = 111)
    public final int[] method5(int arg0, int arg1) {
        ++field10139;
        if (arg0 != 255) {
            method4073((byte) 117);
        }
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            class373.method2196(var3, 0, class687.field9628, this.field10132);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILji;B)V", line = 134)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 > -92) {
            field10138 = null;
        }
        if (~arg0 == -1) {
            this.field10132 = (arg1.method3428((byte) -110) << 12) / 255;
        }
        ++field10133;
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V", line = 161)
    public static final void method4073(byte arg0) {
        if (~class361.field4790 == -2 || ~class361.field4790 == -4 || ~class361.field4790 != ~class104.field1393 && (class361.field4790 == 0 || class104.field1393 == 0)) {
            class84.field1169 = 0;
            class12.field79 = 0;
            class681.field9475.method2556(-67);
        }
        ++field10136;
        int var1 = 103 % ((arg0 - -6) / 46);
        class104.field1393 = class361.field4790;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[Ljava/lang/String;)V", line = 182)
    public static final void method4074(byte arg0, String[] arg1) {
        ++field10130;
        if (~arg1.length >= -2) {
            class704.field9878 = class704.field9878 + arg1[0];
            class304.field4125 += arg1[0].length();
        } else {
            for (int var2 = 0; var2 < arg1.length; ++var2) {
                if (arg1[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg1[var2].substring(6));
                    } catch (Exception var5) {
                    }
                    class392.method2288("Pausing for " + var3 + " seconds...", 101);
                    class239.field3132 = var2 - -1;
                    class690.field9663 = arg1;
                    class304.field4128 = class538.method2963(-47) - -((long) (var3 * 1000));
                    return;
                }
                class704.field9878 = arg1[var2];
                class46.method277(false, false);
            }
        }
        int var4 = -6 / ((arg0 - -10) / 41);
    }
}
