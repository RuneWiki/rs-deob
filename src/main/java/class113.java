import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class113 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2545 = 0;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2546 = -1;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[J")
    public static long[] field2548 = new long[32];

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2552 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lp;")
    public static class104 field2542;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Ljava/awt/Image;")
    public static Image field2544;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIILsf;)Li;")
    public static final class56 method864(boolean arg0, int arg1, int arg2, class131 arg3) {
        if (!arg0) {
            method865(-59, -76, 84, null, null, null, 42, -70, -42, 96, -121);
        }
        field2547++;
        return class100.method765(arg3, 13, arg2, arg1) ? class60.method451((byte) 57) : null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III[BLbe;[Lda;IIIII)V")
    public static final void method865(int arg0, int arg1, int arg2, byte[] arg3, class13 arg4, class23[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2551++;
        class86 var11 = new class86(arg3);
        int var12 = -1;
        while (true) {
            int var13 = var11.method636((byte) 109);
            if (var13 == 0) {
                if (arg6 != 0) {
                    field2546 = -120;
                    return;
                }
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method636((byte) 109);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var11.method646(-15447);
                int var19 = var14 >> 12;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg2 == var19 && arg10 <= var17 && var17 < arg10 + 8 && arg1 <= var16 && arg1 + 8 > var16) {
                    class94 var22 = class147.method1185(arg6 - 2, var12);
                    int var23 = arg8 + class152.method1208(var16 & 0x7, var21, arg9, var17 & 0x7, var22.field2166, (byte) 0, var22.field2195);
                    int var24 = arg7 + class154.method1221(var21, var22.field2195, (byte) -115, var22.field2166, arg9, var16 & 0x7, var17 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg0;
                        class23 var26 = null;
                        if ((class110.field2485[1][var23][var24] & 0x2) == 2) {
                            var25 = arg0 - 1;
                        }
                        if (var25 >= 0) {
                            var26 = arg5[var25];
                        }
                        class104.method780(var12, var24, arg6 - 3570, arg9 + var21 & 0x3, var26, arg4, var23, var20, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method866(int arg0) {
        if (arg0 != 21155) {
            field2544 = null;
        }
        field2550++;
        for (class16 var1 = (class16) class90.field2048.method920((byte) 110); var1 != null; var1 = (class16) class90.field2048.method932(-6)) {
            if (var1.field295 > 0) {
                var1.field295--;
            }
            if (var1.field295 != 0) {
                if (var1.field300 > 0) {
                    var1.field300--;
                }
                if (var1.field300 == 0 && var1.field296 >= 1 && var1.field287 >= 1 && var1.field296 <= 102 && var1.field287 <= 102 && (var1.field286 < 0 || class155.method1222(-21879, var1.field292, var1.field286))) {
                    class93.method729(var1.field292, var1.field301, var1.field286, var1.field287, var1.field296, var1.field306, 3, var1.field293);
                    var1.field300 = -1;
                    if (var1.field290 == var1.field286 && var1.field290 == -1) {
                        var1.method172(arg0 ^ 0xFFFFA73D);
                    } else if (var1.field290 == var1.field286 && var1.field293 == var1.field289 && var1.field292 == var1.field291) {
                        var1.method172(-2658);
                    }
                }
            } else if (var1.field290 < 0 || class155.method1222(-21879, var1.field291, var1.field290)) {
                class93.method729(var1.field291, var1.field301, var1.field290, var1.field287, var1.field296, var1.field306, 3, var1.field289);
                var1.method172(-2658);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)[B")
    public abstract byte[] method554(int arg0);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public static void method867(int arg0) {
        field2548 = null;
        field2544 = null;
        field2542 = null;
        if (arg0 != -1) {
            method865(-75, -19, -119, null, null, null, -73, -48, -12, 119, -37);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[B)V")
    public abstract void method553(int arg0, byte[] arg1);
}
