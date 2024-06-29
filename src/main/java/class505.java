import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class505 extends class656 {

    @OriginalMember(owner = "client!is", name = "k", descriptor = "[B")
    public byte[] field6755;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "Loha;")
    public static class743 field6754;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
    public static final void method2837(byte arg0) {
        field6753++;
        int var1 = 0;
        if (class411.field5711.field3902.method3070(true) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class411.field5711.field3868.method1851(true) == 0) {
            var1 |= 0x40;
        }
        class587.method3209(91, var1);
        class462.field6333.method2010(var1, 84);
        class77.field948.method1176(36, var1);
        class292.field4177.method2354(5, var1);
        class226.field3216.method3928(var1, -1);
        class432.method2491(var1, 127);
        if (arg0 <= 77) {
            field6754 = null;
        }
        class88.method676(-15286, var1);
        class752.method4215(123, var1);
        class291.method1803(-194034494, var1);
        class436.method2508((byte) 122);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I[B[BIIIIII)V")
    public static final void method2838(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6756++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg5 <= 100) {
            return;
        }
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg1[var10001] = (byte) (arg1[var10001] - arg2[arg3++]);
                int var14 = arg6++;
                arg1[var14] = (byte) (arg1[var14] - arg2[arg3++]);
                int var15 = arg6++;
                arg1[var15] = (byte) (arg1[var15] - arg2[arg3++]);
                int var16 = arg6++;
                arg1[var16] = (byte) (arg1[var16] - arg2[arg3++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg1[var10001] = (byte) (arg1[var10001] - arg2[arg3++]);
            }
            arg6 += arg8;
            arg3 += arg4;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lvfa;BZII)V")
    public static final void method2839(class672 arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field6758++;
        int var5 = arg0.field9287;
        if (arg0.field9196 == 0) {
            arg0.field9287 = arg0.field9261;
        } else if (arg0.field9196 == 1) {
            arg0.field9287 = arg3 - arg0.field9261;
        } else if (arg0.field9196 == 2) {
            arg0.field9287 = arg0.field9261 * arg3 >> 14;
        }
        int var6 = arg0.field9178;
        if (arg0.field9257 == 0) {
            arg0.field9178 = arg0.field9173;
        } else if (arg0.field9257 == 1) {
            arg0.field9178 = arg4 - arg0.field9173;
        } else if (arg0.field9257 == 2) {
            arg0.field9178 = arg0.field9173 * arg4 >> 14;
        }
        if (arg0.field9196 == 4) {
            arg0.field9287 = arg0.field9178 * arg0.field9161 / arg0.field9171;
        }
        if (arg0.field9257 == 4) {
            arg0.field9178 = arg0.field9287 * arg0.field9171 / arg0.field9161;
        }
        if (class320.field4567 && (client.method1875(arg0).field3004 != 0 || arg0.field9239 == 0)) {
            if (arg0.field9178 < 5 && arg0.field9287 < 5) {
                arg0.field9178 = 5;
                arg0.field9287 = 5;
            } else {
                if (arg0.field9178 <= 0) {
                    arg0.field9178 = 5;
                }
                if (arg0.field9287 <= 0) {
                    arg0.field9287 = 5;
                }
            }
        }
        if (class336.field4764 == arg0.field9160) {
            class577.field7570 = arg0;
        }
        if (arg1 != 13) {
            method2839(null, (byte) -98, false, -127, -24);
        }
        if (arg2 && arg0.field9188 != null && arg0.field9287 != var5 || arg0.field9178 != var6) {
            class309 var7 = new class309();
            var7.field4435 = arg0;
            var7.field4439 = arg0.field9188;
            class358.field5005.method11(var7, -104);
        }
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(Z)V")
    public static final void method2840(boolean arg0) {
        if (class568.field7464 == 1 || class568.field7464 == 3 || class568.field7464 != class186.field2816 && (class568.field7464 == 0 || class186.field2816 == 0)) {
            class243.field3403 = 0;
            class306.field4404 = 0;
            class390.field5470.method2138(-1);
        }
        if (!arg0) {
            field6757++;
            class186.field2816 = class568.field7464;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static void method2841(int arg0) {
        if (arg0 != 1) {
            field6754 = null;
        }
        field6754 = null;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "([B)V")
    public class505(byte[] arg0) {
        this.field6755 = arg0;
    }
}
