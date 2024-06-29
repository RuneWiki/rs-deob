import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class564 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lsq;")
    public static class161 field8148 = new class161(8, 1);

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Z")
    public static boolean field8151 = false;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "J")
    public static long field8155 = -1L;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field8156 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    public static int[] field8152;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILjava/lang/Class;)Lna;", line = 4)
    public static final class43 method3296(int arg0, int arg1, int arg2, Class arg3) {
        class433 var4 = class281.field3808[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class182 var5 = var4.field6218; var5 != null; var5 = var5.field2226) {
            class43 var6 = var5.field2227;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field769 == arg1 && var6.field768 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZBIIILga;[III[IIIIII)I", line = 30)
    public static final int method3297(boolean arg0, byte arg1, int arg2, int arg3, int arg4, class370 arg5, int[] arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class674.field9680[var15][var35] = 0;
                class180.field2218[var15][var35] = 99999999;
            }
        }
        field8150++;
        boolean var16;
        if (arg4 == 1) {
            var16 = class401.method2426(-105, arg2, arg14, arg7, arg11, arg13, arg8, arg10, arg3, arg12, arg5);
        } else if (arg4 == 2) {
            var16 = class597.method3456(arg7, arg12, arg3, arg2, arg10, arg13, arg11, arg8, arg5, (byte) 84, arg14);
        } else {
            var16 = class190.method1175(1310982144, arg7, arg3, arg13, arg2, arg14, arg4, arg10, arg5, arg8, arg11, arg12);
        }
        int var17 = arg10 - 64;
        int var18 = arg7 - 64;
        int var19 = class295.field3984;
        int var20 = class195.field2365;
        if (!var16) {
            if (!arg0) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= (arg2 + var23); var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class180.field2218[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg2 > var24) {
                            var28 = arg2 - var24;
                        } else if (var24 > arg2 + arg14 - 1) {
                            var28 = 1 - (arg2 + arg14 - var24);
                        }
                        int var29 = 0;
                        if (arg3 > var25) {
                            var29 = arg3 - var25;
                        } else if ((arg3 + arg8 - 1) < var25) {
                            var29 = var25 + 1 - arg8 - arg3;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class180.field2218[var26][var27]) {
                            var22 = class180.field2218[var26][var27];
                            var19 = var24;
                            var20 = var25;
                            var21 = var30;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg10 == var19 && arg7 == var20) {
            return 0;
        }
        byte var31 = 0;
        class665.field9413[var31] = var19;
        int var37 = var31 + 1;
        class62.field997[var31] = var20;
        int var32;
        int var33 = var32 = class674.field9680[var19 - var17][var20 - var18];
        if (arg1 > -7) {
            field8151 = false;
        }
        while (arg10 != var19 || arg7 != var20) {
            if (var32 != var33) {
                class665.field9413[var37] = var19;
                var32 = var33;
                class62.field997[var37++] = var20;
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
            var33 = class674.field9680[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg6[var34] = class665.field9413[var37];
            arg9[var34++] = class62.field997[var37];
            if (var34 >= arg6.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)I", line = 211)
    public final int method3298(boolean arg0, int arg1, int arg2) {
        field8147++;
        int var4 = arg1 < class467.field6533 ? class467.field6533 : arg1;
        if (class81.field1167 == this) {
            return 0;
        } else if (class33.field669 == this) {
            return var4 - arg2;
        } else {
            if (arg0) {
                field8152 = null;
            }
            return class323.field4274 == this ? (var4 - arg2) / 2 : 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 234)
    public static void method3299(boolean arg0) {
        if (arg0) {
            method3300(68, null);
        }
        field8148 = null;
        field8152 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILrda;)V", line = 245)
    public static final void method3300(int arg0, class613 arg1) {
        field8146++;
        class58 var2 = (class58) class362.field4820.method3678((long) arg1.field2664, arg0 ^ 0x7B);
        if (var2 != null) {
            if (var2.field906 != null) {
                class399.field5624.method1805(var2.field906);
                var2.field906 = null;
            }
            var2.method3045(true);
        }
        if (arg0 != -1) {
            field8148 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V", line = 272)
    public static final void method3301(int arg0, int arg1) {
        class415.field5866.method2777(arg1, 119);
        if (arg0 != -1) {
            field8151 = false;
        }
        field8145++;
    }

    @OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;", line = 284)
    public final String toString() {
        field8149++;
        throw new IllegalStateException();
    }
}
