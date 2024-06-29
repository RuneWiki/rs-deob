import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class22 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Ljp;")
    public static class55 field245 = new class55(14, -2);

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "J")
    public static long field252 = -1L;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "F")
    public static float field251;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field249;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field253;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Z")
    public static boolean field250;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method135(int arg0) {
        if (arg0 != 96) {
            method137(84, -12, -64, -32, null, 58, 99, 66, false, 74, -67, -123, null, null, 39);
        }
        field245 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(FIIIIIIII[F)V")
    public static final void method136(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float[] arg9) {
        int var10 = arg8 - arg5;
        int var11 = arg6 - arg2;
        field248++;
        int var12 = arg7 - arg3;
        float var13 = arg9[2] * (float) var11 + arg9[0] * (float) var10 + arg9[1] * (float) var12;
        float var14 = arg9[5] * (float) var11 + arg9[3] * (float) var10 + arg9[4] * (float) var12;
        float var15 = arg9[8] * (float) var11 + arg9[6] * (float) var10 + arg9[7] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        if (arg4 < 20) {
            method135(-110);
        }
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg0 + 0.5F;
        if (arg1 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg1 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg1 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class6.field79 = var17;
        class305.field4680 = var18;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII[IIIIZIIILuh;[II)I")
    public static final int method137(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, class407 arg12, int[] arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class454.field6755[var15][var35] = 0;
                class125.field1878[var15][var35] = 99999999;
            }
        }
        field247++;
        boolean var16;
        if (arg14 == 1) {
            var16 = class344.method2210(arg0, arg1, arg10, arg7, arg11, arg3, arg5, 110, arg6, arg2, arg12);
        } else if (arg14 == 2) {
            var16 = class132.method966(-109, arg0, arg1, arg6, arg11, arg3, arg7, arg2, arg10, arg5, arg12);
        } else {
            var16 = class110.method855((byte) 117, arg3, arg12, arg11, arg5, arg6, arg0, arg2, arg7, arg14, arg1, arg10);
        }
        int var17 = arg5 - 64;
        int var18 = arg1 - 64;
        int var19 = class57.field880;
        int var20 = class128.field1916;
        if (!var16) {
            if (!arg8) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class125.field1878[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg2) {
                            var28 = arg2 - var24;
                        } else if ((arg2 + arg7 - 1) < var24) {
                            var28 = var24 - (arg2 - 1) - arg7;
                        }
                        int var29 = 0;
                        if (var25 < arg3) {
                            var29 = arg3 - var25;
                        } else if (arg3 + arg11 - 1 < var25) {
                            var29 = var25 + 1 - arg3 - arg11;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && class125.field1878[var26][var27] < var22) {
                            var21 = var30;
                            var20 = var25;
                            var22 = class125.field1878[var26][var27];
                            var19 = var24;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg5 == var19 && arg1 == var20) {
            return 0;
        }
        byte var31 = 0;
        class63.field996[var31] = var19;
        if (arg9 != 99999999) {
            method136(0.4855754F, 112, 94, -14, -44, -109, -114, -120, -66, null);
        }
        int var37 = var31 + 1;
        class200.field3104[var31] = var20;
        int var32;
        int var33 = var32 = class454.field6755[var19 - var17][var20 - var18];
        while (arg5 != var19 || arg1 != var20) {
            if (var32 != var33) {
                class63.field996[var37] = var19;
                var32 = var33;
                class200.field3104[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class454.field6755[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg13[var34] = class63.field996[var37];
            arg4[var34++] = class200.field3104[var37];
            if (var34 >= arg13.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static final void method138(int arg0) {
        field246++;
        if (class66.field1042 == 2) {
            class360.field5314 = 96;
        } else {
            try {
                Method var1 = (field253 == null ? (field253 = method139("java.lang.Runtime")) : field253).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class360.field5314 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 <= 30) {
            field245 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method139(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
