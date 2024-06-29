import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class451 {

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "Lsv;")
    public static class570 field6194 = new class570(70, -1);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "Lac;")
    public static class743 field6195;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III[FIBFI[FIFI)V", line = 3)
    public static final void method2652(int arg0, int arg1, int arg2, float[] arg3, int arg4, byte arg5, float arg6, int arg7, float[] arg8, int arg9, float arg10, int arg11) {
        int var12 = arg2 - arg9;
        int var13 = arg1 - arg11;
        int var14 = arg0 - arg4;
        field6192++;
        float var15 = arg8[2] * (float) var12 + arg8[1] * (float) var14 + arg8[0] * (float) var13;
        if (arg5 >= -42) {
            return;
        }
        float var16 = arg8[5] * (float) var12 + arg8[3] * (float) var13 + arg8[4] * (float) var14;
        float var17 = arg8[8] * (float) var12 + arg8[7] * (float) var14 + arg8[6] * (float) var13;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg10 != 1.0F) {
            var18 = arg10 * var18;
        }
        float var19 = var16 + arg6 + 0.5F;
        if (arg7 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg7 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg7 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg3[0] = var18;
        arg3[1] = var19;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lha;IIILsea;I)V", line = 55)
    public static final void method2653(class475 arg0, int arg1, int arg2, int arg3, class416 arg4, int arg5) {
        field6191++;
        class309 var6 = class309.field4401.method654(arg4.field5775, -31772);
        if (arg1 >= -33) {
            method2656(-102, 114, (byte) -69);
        }
        if (var6.field4399 == -1) {
            return;
        }
        int var7;
        if (arg4.field5720) {
            int var8 = arg4.field5757 + arg3;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class85 var9 = var6.method1898(var7, arg0, arg4.field5715, 262144);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field5776;
        int var11 = arg4.field5734;
        if ((var7 & 0x1) == 1) {
            var11 = arg4.field5776;
            var10 = arg4.field5734;
        }
        int var12 = var9.method11();
        int var13 = var9.method14();
        if (var6.field4405) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field4400 == 0) {
            var9.method755(arg5, arg2 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method758(arg5, arg2 - ((var11 - 1) * 4), var12, var13, 0, var6.field4400 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!lo", name = "toString", descriptor = "()Ljava/lang/String;", line = 110)
    public final String toString() {
        field6189++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V", line = 122)
    public static void method2654(boolean arg0) {
        field6195 = null;
        if (!arg0) {
            field6195 = null;
        }
        field6194 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII[BB)V", line = 134)
    public static final void method2655(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5) {
        field6193++;
        if (arg1 <= arg2) {
            return;
        }
        int var6 = arg0 + arg2;
        int var7 = arg1 - arg2 >> 2;
        if (arg5 != 68) {
            field6194 = null;
        }
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg1 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIB)Z", line = 167)
    public static final boolean method2656(int arg0, int arg1, byte arg2) {
        field6190++;
        if (arg2 > -12) {
            return false;
        } else {
            return (arg1 & 0x21) != 0;
        }
    }
}
