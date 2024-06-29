import jaclib.memory.Buffer;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class296 extends class279 implements class9 {

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lqu;")
    public static class364 field4331 = new class364(79, 8);

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Lqc;")
    public static class325 field4337 = new class325(4);

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Los;ILjaclib/memory/Buffer;)V")
    public class296(class468 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field4334 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZILjava/util/Random;)I")
    public static final int method1832(boolean arg0, int arg1, Random arg2) {
        ++field4336;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class154.method899(arg1, 91)) {
            return (int) (((long) arg2.nextInt() & 4294967295L) * (long) arg1 >> 32);
        } else {
            if (arg0) {
                field4338 = 84;
            }
            int var3 = -((int) (4294967296L % (long) arg1)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (~var3 >= ~var4);
            return class481.method2919(-125, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Los;I[BI)V")
    public class296(class468 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4334 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI[BI)V")
    public final void method44(byte arg0, int arg1, byte[] arg2, int arg3) {
        this.method1757(arg2, arg1);
        int var5 = 39 % ((arg0 - 38) / 47);
        ++field4335;
        this.field4334 = arg3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        if (arg0 != 3497) {
            field4338 = -84;
        }
        ++field4330;
        return 0;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    public static void method1833(int arg0) {
        if (arg0 != -23453) {
            field4338 = -50;
        }
        field4331 = null;
        field4337 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIB)V")
    public static final void method1834(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = class94.field1158.field280 * arg0 >> 8;
        ++field4328;
        if (var4 != 0 && ~arg2 != 0) {
            class255.method1610(false, var4, 0, arg2, 0, class11.field103);
            class579.field8531 = true;
        }
        if (arg3 != -9) {
            method1836(false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIFI[FIIIFIIFI)V")
    public static final void method1835(int arg0, int arg1, float arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, float arg8, int arg9, int arg10, float arg11, int arg12) {
        int var13 = arg7 - arg12;
        int var14 = arg5 - arg0;
        ++field4329;
        int var15 = arg6 - arg9;
        float var16 = arg4[2] * (float) var15 + arg4[arg3] * (float) var14 + arg4[1] * (float) var13;
        float var17 = arg4[5] * (float) var15 + arg4[4] * (float) var13 + arg4[3] * (float) var14;
        float var18 = arg4[8] * (float) var15 + arg4[6] * (float) var14 + arg4[7] * (float) var13;
        float var19;
        float var20;
        if (~arg10 != -1) {
            if (~arg10 == -2) {
                var19 = arg11 + var16 + 0.5F;
                var20 = arg2 + var18 + 0.5F;
            } else if (arg10 != 2) {
                if (~arg10 != -4) {
                    if (arg10 == 4) {
                        var20 = -var17 + arg8 + 0.5F;
                        var19 = arg2 + var18 + 0.5F;
                    } else {
                        var20 = -var17 + arg8 + 0.5F;
                        var19 = -var18 + arg2 + 0.5F;
                    }
                } else {
                    var20 = -var17 + arg8 + 0.5F;
                    var19 = arg11 + var16 + 0.5F;
                }
            } else {
                var19 = -var16 + arg11 + 0.5F;
                var20 = -var17 + arg8 + 0.5F;
            }
        } else {
            var20 = -var18 + arg2 + 0.5F;
            var19 = arg11 + var16 + 0.5F;
        }
        if (arg1 == 1) {
            float var21 = var19;
            var19 = -var20;
            var20 = var21;
        } else if (arg1 != 2) {
            if (arg1 == 3) {
                float var22 = var19;
                var19 = var20;
                var20 = -var22;
            }
        } else {
            var19 = -var19;
            var20 = -var20;
        }
        class94.field1165 = var19;
        class396.field5746 = var20;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)I")
    public final int method47(boolean arg0) {
        ++field4333;
        if (!arg0) {
            method1833(5);
        }
        return this.field4334;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)J")
    public final long method46(int arg0) {
        ++field4332;
        if (arg0 != -22678) {
            method1836(true);
        }
        return super.field4146.getAddress();
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)V")
    public static final void method1836(boolean arg0) {
        if (arg0) {
            class526.field7777 = class32.field330;
            class235.field3455 = class287.field4219;
        } else {
            class526.field7777 = class387.field5663;
            class235.field3455 = class562.field8337;
        }
        class487.field7383 = class526.field7777.length;
    }
}
