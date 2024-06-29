import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class22 {

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "[I")
    public static int[] field198 = new int[32];

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field197 = -1;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Lhu;")
    public static class131 field200;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "[B")
    public static byte[] field203;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public static final void method99(int arg0) {
        field202++;
        class752 var1 = (class752) class572.field8135.method1719(65280);
        if (arg0 < 18) {
            return;
        }
        while (var1 != null) {
            if (var1.field10518 > 0) {
                var1.field10518--;
            }
            if (var1.field10518 != 0) {
                if (var1.field10509 > 0) {
                    var1.field10509--;
                }
                if (var1.field10509 == 0 && var1.field10512 >= 1 && var1.field10517 >= 1 && class489.field6976 - 2 >= var1.field10512 && class153.field1677 - 2 >= var1.field10517 && (var1.field10522 < 0 || class655.method3714(var1.field10522, -5, var1.field10519))) {
                    class210.method1250(var1.field10512, var1.field10517, var1.field10515, var1.field10519, var1.field10521, -1, var1.field10514, (byte) -24, var1.field10522);
                    var1.field10509 = -1;
                    if (var1.field10522 == var1.field10510 && var1.field10510 == -1) {
                        var1.method864(12983);
                    } else if (var1.field10522 == var1.field10510 && var1.field10521 == var1.field10520 && var1.field10523 == var1.field10519) {
                        var1.method864(12983);
                    }
                }
            } else if (var1.field10510 < 0 || class655.method3714(var1.field10510, -5, var1.field10523)) {
                class210.method1250(var1.field10512, var1.field10517, var1.field10515, var1.field10523, var1.field10520, -1, var1.field10514, (byte) -24, var1.field10510);
                var1.method864(12983);
            }
            var1 = (class752) class572.field8135.method1723(-20665);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIII)V")
    public static final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field201++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg4 * arg4;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class223.method1297(class408.field5585[arg1], -7, arg2 - arg4, arg0, arg2 + arg4);
        int var20 = (arg5 - 1) * var15;
        if (arg3 > -105) {
            field204 = 38;
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var21 = arg1 - var7;
            int var22 = arg1 + var7;
            int var23 = arg2 + var6;
            int var24 = arg2 - var6;
            class223.method1297(class408.field5585[var21], -7, var24, arg0, var23);
            class223.method1297(class408.field5585[var22], -7, var24, arg0, var23);
        }
    }

    @OriginalMember(owner = "client!qo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field199++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public static void method101(int arg0) {
        field200 = null;
        field198 = null;
        field203 = null;
        if (arg0 != -17422) {
            field200 = null;
        }
    }
}
