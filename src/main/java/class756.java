import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class756 extends class512 {

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "Lfu;")
    public class411 field10228;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "Ltq;")
    public static class654 field10226 = new class654("", 10);

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
    public static int field10227;

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
    public static int field10229;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "(B)V")
    public static final void method4144(byte arg0) {
        field10229++;
        class2 var1 = null;
        try {
            var1 = class248.method1545("2", (byte) 105);
            int var2 = 34 % ((-arg0 - 64) / 51);
            class254 var3 = new class254((class249.field3294 * 6) + 3);
            var3.method1725(1, 85);
            var3.method1733(class249.field3294, -32466);
            for (int var4 = 0; var4 < class138.field1865.length; var4++) {
                if (class679.field9091[var4]) {
                    var3.method1733(var4, -32466);
                    var3.method1686(-83, class138.field1865[var4]);
                }
            }
            var1.method8(var3.field3725, 0, var3.field3789, 29620);
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method6(88);
            }
        } catch (Exception var5) {
        }
        class15.field149 = class401.method2440(false);
        class303.field4255 = false;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IFII[FII[FIII)V")
    public static final void method4145(int arg0, float arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, float[] arg7, int arg8, int arg9, int arg10) {
        field10227++;
        int var11 = arg3 - arg2;
        int var12 = arg0 - arg5;
        int var13 = arg9 - arg6;
        float var14 = arg7[2] * (float) var11 + arg7[0] * (float) var13 + arg7[1] * (float) var12;
        float var15 = arg7[5] * (float) var11 + arg7[4] * (float) var12 + arg7[3] * (float) var13;
        float var16 = arg7[8] * (float) var11 + arg7[arg10] * (float) var13 + arg7[7] * (float) var12;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var15 / var17)) / 3.1415927F + arg1 + 0.5F;
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg4[1] = var19;
        arg4[0] = var18;
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Llf;II[B)V")
    public class756(class250 arg0, int arg1, int arg2, byte[] arg3) {
        this.field10228 = class596.method3340(arg1, arg3, 6406, 3553, arg2, 6406, false, arg0);
        this.field10228.method2708((byte) -126, false, false);
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
    public static void method4146(boolean arg0) {
        field10226 = null;
        if (arg0) {
            method4144((byte) -100);
        }
    }
}
