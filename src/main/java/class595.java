import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class595 extends class330 {

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!ip", name = "J", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!ip", name = "H", descriptor = "Lho;")
    public static class318 field8361;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "Z")
    public static boolean field8359;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "([Loq;II)V")
    public static final void method3468(class230[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class230 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field3471;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field3471 > (var7 & 1) + var6) {
                    class230 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method3468(arg0, arg1, var4 - 1);
            method3468(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)[[I")
    public final int[][] method537(int arg0, int arg1) {
        ++field8357;
        if (arg0 != 0) {
            return null;
        } else {
            int[][] var3 = super.field4621.method1597(arg1, true);
            if (super.field4621.field3510) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class80.field901 < ~var7; ++var7) {
                    this.method3471(var7, (byte) -1, arg1);
                    int[][] var8 = this.method2082(class544.field7577, 0, 124);
                    var4[var7] = var8[0][class313.field4504];
                    var5[var7] = var8[1][class313.field4504];
                    var6[var7] = var8[2][class313.field4504];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            super.field4636 = ~arg0.method3013(2) == -2;
        }
        int var4 = 40 / ((-41 - arg2) / 42);
        ++field8362;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
    public static void method3469(int arg0) {
        field8361 = null;
        int var1 = 107 / ((arg0 - -78) / 38);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)I")
    public static final int method3470(boolean arg0) {
        ++field8363;
        class473 var1 = class111.field1332;
        boolean var2 = arg0;
        if (class688.field9602.field8517.method2604((byte) -98) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class713.method4003((class283) null, -86, (class101) null, 0, 0, var3);
        }
        long var4 = class683.method3903((byte) 4);
        for (int var6 = 0; ~var6 > -10001; ++var6) {
            var1.method215(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class683.method3903((byte) 4) - var4);
        var1.method2822(100, 100, 0, 1, 0, -16777216);
        if (var2) {
            var1.method2821((byte) 76);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
    public class595() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field8358;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            field8361 = null;
        }
        if (super.field4630.field5704) {
            for (int var4 = 0; class80.field901 > var4; ++var4) {
                this.method3471(var4, (byte) -1, arg0);
                int[] var5 = this.method2084(0, class544.field7577, (byte) -109);
                var3[var4] = var5[class313.field4504];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)V")
    private final void method3471(int arg0, byte arg1, int arg2) {
        ++field8356;
        int var4 = class404.field5705[arg0];
        int var5 = class300.field4352[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class544.field7577 = arg2;
            class313.field4504 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class313.field4504 = arg2;
            class544.field7577 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class544.field7577 = arg0;
            class313.field4504 = -arg2 + class80.field901;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class544.field7577 = class291.field4285 - arg2;
            class313.field4504 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class313.field4504 = -arg0 + class80.field901;
            class544.field7577 = -arg2 + class291.field4285;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class313.field4504 = -arg2 + class80.field901;
            class544.field7577 = -arg0 + class291.field4285;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class313.field4504 = arg2;
            class544.field7577 = -arg0 + class291.field4285;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class313.field4504 = -arg0 + class80.field901;
            class544.field7577 = arg2;
        }
        if (arg1 != -1) {
            method3468((class230[]) null, 64, 26);
        }
        class544.field7577 &= class385.field5505;
        class313.field4504 &= class639.field8988;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(III)I")
    public static final int method3472(int arg0, int arg1, int arg2) {
        ++field8360;
        int var3 = (arg2 & 127) * arg1 >> 7;
        if (arg0 != 10) {
            field8359 = true;
        }
        if (~var3 > -3) {
            var3 = 2;
        } else if (~var3 < -127) {
            var3 = 126;
        }
        return (65408 & arg2) - -var3;
    }
}
