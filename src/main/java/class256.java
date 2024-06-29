import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class256 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field3896 = 0;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Ldh;")
    public static class179 field3897 = new class179(500);

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3898 = "Hidden";

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZB[Lhm;III[BIIII)V", line = 13)
    public static final void method1857(boolean arg0, byte arg1, class22[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        field3895++;
        if (arg1 != -14) {
            return;
        }
        class107 var11 = new class107(arg6);
        int var12 = -1;
        while (true) {
            int var13 = var11.method664((byte) 123);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method643(-14205);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 12;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 & 0x3F;
                int var19 = var11.method661(-1);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg3 == var16 && arg5 <= var17 && var17 < (arg5 + 8) && arg10 <= var18 && var18 < (arg10 + 8)) {
                    class238 var22 = class142.method951(var12, arg1 ^ 0xFFFF96D1);
                    int var23 = arg9 + class285.method2034(var21, arg7, 1, var22.field3532, var22.field3489, var17 & 0x7, var18 & 0x7);
                    int var24 = arg8 + class136.method907(var22.field3532, var17 & 0x7, var21, var18 & 0x7, var22.field3489, arg7, arg1 + 15);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class22 var25 = null;
                        if (!arg0) {
                            int var26 = arg4;
                            if ((class264.field4163[1][var23][var24] & 0x2) == 2) {
                                var26 = arg4 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg2[var26];
                            }
                        }
                        class91.method532(var20, arg7 + var21 & 0x3, arg0, arg4, !arg0, arg4, var25, var23, arg1 ^ 0xFFFFFFF1, var12, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)J", line = 115)
    public static final long method1858(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        return var3 == null || var3.field3196 == null ? 0L : var3.field3196.field2339;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 194)
    public static void method1859(int arg0) {
        field3897 = null;
        field3898 = null;
        if (arg0 <= 122) {
            field3896 = -74;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I", line = 241)
    public static final int method1860(int arg0, int arg1) {
        if (arg0 >= -72) {
            method1858(49, 6, -29);
        }
        field3894++;
        return arg1 & 0x7F;
    }
}
