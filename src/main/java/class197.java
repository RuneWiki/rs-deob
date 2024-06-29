import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class197 extends class167 {

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "Le;")
    public static class191 field3518 = class54.method368("m-Ochte mit Ihnen handeln)3", 2047);

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "Z")
    public static boolean field3523 = false;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public static int field3517 = 0;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    public static int field3515 = 0;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    public static int field3514 = 0;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public int field3511;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    public int field3521;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "Lng;")
    public static class121 field3513;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "Le;")
    public class191 field3512;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "[I")
    public int[] field3519;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "[I")
    public int[] field3520;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "[Le;")
    public class191[] field3527;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "[Lwd;")
    public class97[] field3524;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
    public static final void method1387() {
        for (int var0 = 0; var0 < class240.field4271; var0++) {
            for (int var4 = 0; var4 < class217.field3821; var4++) {
                for (int var5 = 0; var5 < class85.field1406; var5++) {
                    class201.field3608[var0][var4][var5] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class137.field2305; var1++) {
            class99.field1588[var1] = null;
        }
        class137.field2305 = 0;
        for (int var2 = 0; var2 < class179.field3068; var2++) {
            class33.field573[var2] = null;
        }
        class179.field3068 = 0;
        for (int var3 = 0; var3 < class232.field4147.length; var3++) {
            class232.field4147[var3] = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public static void method1388(byte arg0) {
        if (arg0 == -11) {
            field3513 = null;
            field3518 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)J")
    public static final long method1389(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3550; var4++) {
            class12 var5 = var3.field3549[var4];
            if ((var5.field136 >> 29 & 0x3L) == 2L && var5.field152 == arg1 && var5.field144 == arg2) {
                return var5.field136;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z[BIIIIIII[Lai;B)V")
    public static final void method1390(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class220[] arg9, byte arg10) {
        byte var11;
        if (arg0) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (arg10 != 18) {
            field3515 = -124;
        }
        if (!arg0) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((arg6 + var12) > 0 && (arg6 + var12) < 103 && arg2 + var13 > 0 && arg2 + var13 < 103) {
                        arg9[arg3].field3873[arg6 + var12][arg2 + var13] = class167.method1128(arg9[arg3].field3873[arg6 + var12][arg2 + var13], -16777217);
                    }
                }
            }
        }
        field3525++;
        class225 var14 = new class225(arg1);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg4 == var15 && arg7 <= var16 && var16 < arg7 + 8 && var17 >= arg5 && arg5 + 8 > var17) {
                        class102.method637(arg2 + class216.method1470(-2465, var16 & 0x7, arg8, var17 & 0x7), 0, arg3, arg0, 0, 0, class215.method1465(arg8, (byte) -118, var16 & 0x7, var17 & 0x7) + arg6, var14, arg8);
                    } else {
                        class102.method637(-1, 0, 0, arg0, arg10 - 18, 0, -1, var14, 0);
                    }
                }
            }
        }
    }
}
