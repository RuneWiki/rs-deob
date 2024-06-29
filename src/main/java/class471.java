import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class471 {

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "[I")
    public static int[] field6762 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field6763 = 0;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "[I")
    public static int[] field6766 = new int[256];

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "Lgq;")
    public static class761 field6761 = new class761();

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lnha;BII)Ljea;", line = 7)
    public static final class236 method2773(class501 arg0, byte arg1, int arg2, int arg3) {
        field6764++;
        int var4 = arg0.field7063 | arg3 << 10;
        if (arg1 <= 89) {
            field6766 = null;
        }
        class236 var5 = (class236) class190.field2493.method3597((long) var4 << 16, 2087);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class27.field446.method3836(class27.field446.method3824(var4, (byte) -59), true);
        if (var6 == null) {
            int var9 = arg0.field7063 | arg2 + 65536 << 10;
            class236 var10 = (class236) class190.field2493.method3597((long) var9 << 16, 2087);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class27.field446.method3836(class27.field446.method3824(var9, (byte) -59), true);
            if (var11 == null) {
                int var14 = arg0.field7063 | 0x3FFFC00;
                class236 var15 = (class236) class190.field2493.method3597((long) var14 << 16, 2087);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class27.field446.method3836(class27.field446.method3824(var14, (byte) -59), true);
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class236 var17;
                    try {
                        var17 = class458.method2683(true, var16);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field3046 = arg0;
                    class190.field2493.method3599(var17, 100, (long) var14 << 16);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class236 var12;
                try {
                    var12 = class458.method2683(true, var11);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field3046 = arg0;
                class190.field2493.method3599(var12, 100, (long) var9 << 16);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class236 var7;
            try {
                var7 = class458.method2683(true, var6);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field3046 = arg0;
            class190.field2493.method3599(var7, 100, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IBIIII)V", line = 92)
    public static final void method2774(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field6765++;
        int var6 = 0;
        int var7 = arg3;
        if (arg1 < 7) {
            return;
        }
        int var8 = arg0 * arg0;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class284.method1709(class15.field220[arg4], arg2 + arg0, -8251, arg2 - arg0, arg5);
        int var20 = (arg3 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var7--;
            var20 -= var15;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg2 + var6;
            int var24 = arg2 - var6;
            class284.method1709(class15.field220[var21], var23, -8251, var24, arg5);
            class284.method1709(class15.field220[var22], var23, -8251, var24, arg5);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V", line = 179)
    public static void method2775(byte arg0) {
        field6766 = null;
        field6761 = null;
        field6762 = null;
        if (arg0 != -125) {
            field6763 = 22;
        }
    }
}
