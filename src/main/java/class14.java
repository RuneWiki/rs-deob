import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 {

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public int field314 = -1;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field319 = 0;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Liba;")
    public static class211 field318 = new class211(38, 7);

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "[I")
    public static int[] field325 = new int[13];

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public int field323;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ds", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field326;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "[Lps;")
    public static class5[] field324;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method101(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BII)Lwg;", line = 4)
    public static final class516 method95(byte arg0, int arg1, int arg2) {
        field310++;
        class516 var3 = new class516();
        var3.field7229 = arg1 + 1 + 5;
        var3.field7242 = -1;
        var3.field7241 = arg2 + 1 + 5;
        var3.field7247 = -1;
        var3.field7243 = new int[var3.field7229][var3.field7241];
        if (arg0 <= 25) {
            field324 = null;
        }
        var3.method2907((byte) -58);
        return var3;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILr;Z)Lvba;", line = 25)
    public static final class374 method96(int arg0, int arg1, class98 arg2, boolean arg3) {
        field322++;
        if (arg1 == -1) {
            return null;
        }
        if (class148.field2097 != null) {
            for (int var4 = 0; var4 < class148.field2097.length; var4++) {
                if (class148.field2097[var4] == arg1) {
                    return class153.field2157[var4];
                }
            }
        }
        class374 var5 = (class374) class66.field1043.method3901((long) arg1, -78);
        if (var5 != null) {
            if (arg3 && var5.field5523 == null) {
                class606 var6 = class40.method230(class235.field3097, arg1, arg0 ^ 0x72);
                if (var6 == null) {
                    return null;
                }
                var5.field5523 = var6;
            }
            return var5;
        }
        class616[] var7 = class616.method3518(class109.field1625, arg1);
        if (var7 == null) {
            return null;
        }
        if (arg0 != 4) {
            method95((byte) 14, 101, -107);
        }
        class606 var8 = class40.method230(class235.field3097, arg1, 117);
        if (var8 == null) {
            return null;
        }
        class374 var9;
        if (arg3) {
            var9 = new class374(arg2.method684(var8, var7, true), var8);
        } else {
            var9 = new class374(arg2.method684(var8, var7, true));
        }
        class66.field1043.method3894(var9, (byte) 60, (long) arg1);
        return var9;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)V", line = 93)
    public static final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field320++;
        if (arg4 > arg2) {
            for (int var5 = arg2; var5 < arg4; var5++) {
                class565.field8253[var5][arg0] = arg3;
            }
        } else {
            for (int var6 = arg4; var6 < arg2; var6++) {
                class565.field8253[var6][arg0] = arg3;
            }
        }
        if (arg1 != 0) {
            field319 = -84;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIII[I[IIIIILwg;ZIIB)I", line = 132)
    public static final int method98(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, class516 arg10, boolean arg11, int arg12, int arg13, byte arg14) {
        field316++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var36 = 0; var36 < 128; var36++) {
                class369.field5475[var15][var36] = 0;
                class263.field3413[var15][var36] = 99999999;
            }
        }
        boolean var16;
        if (arg9 == 1) {
            var16 = class73.method426(arg7, arg13, arg1, arg6, arg10, arg12, arg0, arg8, arg3, -38, arg2);
        } else if (arg9 == 2) {
            var16 = class364.method2232(arg0, arg7, arg10, arg3, arg12, arg13, arg8, arg1, 48, arg2, arg6);
        } else {
            var16 = class572.method3288(arg13, arg1, arg9, 28265, arg0, arg12, arg7, arg8, arg6, arg2, arg3, arg10);
        }
        int var17 = arg6 - 64;
        int var18 = arg3 - 64;
        int var19 = class597.field8645;
        int var20 = class264.field3452;
        if (!var16) {
            if (!arg11) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg13 - var23; var24 <= (arg13 + var23); var24++) {
                for (int var25 = arg12 - var23; var25 <= (arg12 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class263.field3413[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg13 > var24) {
                            var28 = arg13 - var24;
                        } else if ((arg8 + arg13 - 1) < var24) {
                            var28 = var24 + 1 - arg8 - arg13;
                        }
                        int var29 = 0;
                        if (var25 < arg12) {
                            var29 = arg12 - var25;
                        } else if (arg12 + arg0 - 1 < var25) {
                            var29 = var25 + 1 - arg0 - arg12;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && var22 > class263.field3413[var26][var27]) {
                            var21 = var30;
                            var19 = var24;
                            var20 = var25;
                            var22 = class263.field3413[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg6 == var19 && arg3 == var20) {
            return 0;
        }
        byte var31 = 0;
        class618.field8964[var31] = var19;
        int var38 = var31 + 1;
        class390.field5889[var31] = var20;
        int var32;
        int var33 = var32 = class369.field5475[var19 - var17][var20 - var18];
        while (arg6 != var19 || arg3 != var20) {
            if (var32 != var33) {
                class618.field8964[var38] = var19;
                var32 = var33;
                class390.field5889[var38++] = var20;
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
            var33 = class369.field5475[var19 - var17][var20 - var18];
        }
        int var34 = 88 % ((-arg14 - 67) / 49);
        int var35 = 0;
        while (var38-- > 0) {
            arg5[var35] = class618.field8964[var38];
            arg4[var35++] = class390.field5889[var38];
            if (var35 >= arg5.length) {
                break;
            }
        }
        return var35;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 314)
    public static final void method99(int arg0) {
        field308++;
        try {
            if (arg0 >= -95) {
                field319 = -125;
            }
            Method var1 = (field326 == null ? (field326 = method101("java.lang.Runtime")) : field326).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class318.field4624 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V", line = 342)
    public static void method100(boolean arg0) {
        field324 = null;
        field318 = null;
        field325 = null;
        if (!arg0) {
            field318 = null;
        }
    }
}
