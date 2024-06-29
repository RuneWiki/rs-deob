import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class15 extends Exception {

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "[I")
    public static int[] field155 = new int[5];

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V", line = 4)
    public static void method61(int arg0) {
        field155 = null;
        if (arg0 != 128) {
            method61(-54);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "([Ljava/lang/Object;ZII[I)V", line = 16)
    public static final void method62(Object[] arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        field154++;
        if (arg3 > arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg2; var10 < arg3; var10++) {
                if (((var10 & var9) + var7) > arg4[var10]) {
                    int var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method62(arg0, false, arg2, var6 - 1, arg4);
            method62(arg0, false, var6 + 1, arg3, arg4);
        }
        if (arg1) {
            method62(null, false, 61, -115, null);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;B)V", line = 76)
    public static final void method63(String arg0, File arg1, byte arg2) {
        class232.field3128.put(arg0, arg1);
        if (arg2 != -122) {
            method61(4);
        }
        field153++;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIBII[IIIIIIIZ[ILeo;)I", line = 93)
    public static final int method64(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, int[] arg13, class340 arg14) {
        field152++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class391.field5073[var15][var35] = 0;
                class384.field4800[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg11 == 1) {
            var16 = class235.method1561(arg10, -127, arg8, arg1, arg14, arg0, arg4, arg3, arg7, arg6, arg9);
        } else if (arg11 == 2) {
            var16 = class791.method4331(arg10, arg6, arg0, arg14, arg3, arg9, arg1, 126, arg7, arg4, arg8);
        } else {
            var16 = class403.method2353(arg11, arg9, arg7, arg6, arg0, arg10, arg4, arg3, arg8, -93, arg1, arg14);
        }
        int var17 = arg0 - 64;
        int var18 = arg6 - 64;
        int var19 = class317.field3948;
        int var20 = class425.field5594;
        if (!var16) {
            if (!arg12) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg7 - var23; var24 <= (arg7 + var23); var24++) {
                for (int var25 = arg10 - var23; var25 <= (arg10 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class384.field4800[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg7 > var24) {
                            var28 = arg7 - var24;
                        } else if (arg7 + arg9 - 1 < var24) {
                            var28 = var24 - (arg7 + arg9 - 1);
                        }
                        int var29 = 0;
                        if (var25 < arg10) {
                            var29 = arg10 - var25;
                        } else if (var25 > arg10 + arg8 - 1) {
                            var29 = var25 + 1 - arg10 - arg8;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class384.field4800[var26][var27]) {
                            var19 = var24;
                            var20 = var25;
                            var21 = var30;
                            var22 = class384.field4800[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var19 && arg6 == var20) {
            return 0;
        }
        byte var31 = 0;
        if (arg2 <= 52) {
            field155 = null;
        }
        class195.field2707[var31] = var19;
        int var37 = var31 + 1;
        class57.field763[var31] = var20;
        int var32;
        int var33 = var32 = class391.field5073[var19 - var17][var20 - var18];
        while (arg0 != var19 || arg6 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class195.field2707[var37] = var19;
                class57.field763[var37++] = var20;
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
            var33 = class391.field5073[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg5[var34] = class195.field2707[var37];
            arg13[var34++] = class57.field763[var37];
            if (arg5.length <= var34) {
                break;
            }
        }
        return var34;
    }
}
