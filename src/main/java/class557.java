import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class557 extends class646 {

    @OriginalMember(owner = "client!qw", name = "J", descriptor = "I")
    private int field8143 = 2048;

    @OriginalMember(owner = "client!qw", name = "W", descriptor = "I")
    private int field8155 = 1024;

    @OriginalMember(owner = "client!qw", name = "L", descriptor = "I")
    private int field8144 = 3072;

    @OriginalMember(owner = "client!qw", name = "N", descriptor = "I")
    public static int field8146 = -1;

    @OriginalMember(owner = "client!qw", name = "M", descriptor = "[I")
    public static int[] field8145 = new int[2];

    @OriginalMember(owner = "client!qw", name = "S", descriptor = "I")
    public static int field8151 = 0;

    @OriginalMember(owner = "client!qw", name = "O", descriptor = "[I")
    public static int[] field8147 = new int[5];

    @OriginalMember(owner = "client!qw", name = "I", descriptor = "Lau;")
    public static class692 field8142 = new class692();

    @OriginalMember(owner = "client!qw", name = "P", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!qw", name = "Q", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!qw", name = "R", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!qw", name = "T", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!qw", name = "U", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!qw", name = "V", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!qw", name = "X", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!qw", name = "Y", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!qw", name = "Z", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V", line = 4)
    public class557() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)V", line = 7)
    public final void method422(int arg0) {
        if (arg0 == -1) {
            ++field8150;
            this.field8143 = -this.field8155 + this.field8144;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILjava/lang/String;)V", line = 26)
    public static final void method3261(int arg0, String arg1) {
        ++field8157;
        System.out.println("Error: " + class435.method2553(arg0 ^ arg0, arg1, "\n", "%0a"));
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(II)V", line = 35)
    public static final void method3262(int arg0, int arg1) {
        ++field8149;
        if (arg1 < 0 || ~arg1 < -3) {
            arg1 = 0;
        }
        class201.field3102 = arg1;
        class358.field5000 = new class635[class522.field7696[class201.field3102] + 1];
        if (arg0 != 12816) {
            field8145 = null;
        }
        class73.field1157 = 0;
        class435.field6260 = 0;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lek;IB)V", line = 52)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg2 >= 7) {
            ++field8148;
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        super.field9160 = arg0.method2705(-109) == 1;
                    }
                } else {
                    this.field8144 = arg0.method2755((byte) -78);
                }
            } else {
                this.field8155 = arg0.method2755((byte) -83);
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "(I)V", line = 97)
    public static final void method3263(int arg0) throws IOException {
        if (arg0 <= 29) {
            method3265(true, (class345) null);
        }
        if (class256.field3696 != null && ~class29.field404 < -1) {
            int var1 = 0;
            while (true) {
                class699 var2 = (class699) class33.field471.method3905(-123);
                if (var2 == null) {
                    class437.field6284 += var1;
                    class510.field7592 = 0;
                    break;
                }
                class256.field3696.method922(var2.field9908.field6719, 0, var2.field9901, (byte) 110);
                var1 += var2.field9901;
                class29.field404 -= var2.field9901;
                var2.method2549((byte) -65);
                var2.field9908.method2738(-11866);
                var2.method3932(-1);
            }
        }
        ++field8158;
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(IB)[I", line = 132)
    public final int[] method424(int arg0, byte arg1) {
        ++field8156;
        if (arg1 != -120) {
            this.field8143 = -43;
        }
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            int[] var4 = this.method3628(false, 0, arg0);
            for (int var5 = 0; var5 < class89.field1330; ++var5) {
                var3[var5] = (var4[var5] * this.field8143 >> 12) + this.field8155;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lek;II)V", line = 165)
    public static final void method3264(class465 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method3265(true, (class345) null);
        }
        ++field8154;
        if (class347.field4908 != null) {
            try {
                class347.field4908.method2579(-42, 0L);
                class347.field4908.method2576(24, arg0.field6719, (byte) 80, arg1);
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ZLvo;)V", line = 193)
    public static final void method3265(boolean arg0, class345 arg1) {
        ++field8152;
        class676.field9630 = 0;
        class7.field74 = 0;
        if (arg0) {
            field8147 = null;
        }
        class18.field268 = new class565();
        class117.field1867 = new class32[1024];
        class358.field5000 = new class635[class522.field7696[class201.field3102] + 1];
        class435.field6260 = 0;
        class73.field1157 = 0;
        class363.method2179(arg1, -103);
        class254.method1621(arg1, -51);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V", line = 213)
    public static void method3266(byte arg0) {
        field8145 = null;
        field8142 = null;
        if (arg0 == -4) {
            field8147 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(II)[[I", line = 237)
    public final int[][] method298(int arg0, int arg1) {
        ++field8153;
        if (arg0 != -12424) {
            this.field8143 = -50;
        }
        int[][] var3 = super.field9164.method1002(91, arg1);
        if (super.field9164.field2082) {
            int[][] var4 = this.method3626(arg0 ^ -12537, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class89.field1330 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field8143 >> 12) + this.field8155;
                var9[var11] = (var6[var11] * this.field8143 >> 12) + this.field8155;
                var10[var11] = (var7[var11] * this.field8143 >> 12) + this.field8155;
            }
        }
        return var3;
    }
}
