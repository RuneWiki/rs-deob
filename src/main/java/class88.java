import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class88 extends InputStream {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lvv;")
    public static class313 field1481 = new class313(47, 6);

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "F")
    public static float field1483;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method620(byte arg0) {
        field1481 = null;
        if (arg0 != -93) {
            method620((byte) 37);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)Z")
    public static final boolean method621(int arg0, int arg1, int arg2) {
        field1482++;
        if (arg2 == -123) {
            return class105.method724(arg0, (byte) 85, arg1) | (arg0 & 0x70000) != 0 || class163.method1122(arg0, 16619, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "read", descriptor = "()I")
    public final int read() {
        class444.method2667(-28210, 30000L);
        field1480++;
        return -1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIBI[ILir;IIIIIZ[II)I")
    public static final int method622(int arg0, int arg1, int arg2, byte arg3, int arg4, int[] arg5, class251 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, int[] arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class330.field5195[var15][var35] = 0;
                class71.field1218[var15][var35] = 99999999;
            }
        }
        if (arg3 > -40) {
            return -112;
        }
        field1485++;
        boolean var16;
        if (arg10 == 1) {
            var16 = class77.method553(arg6, arg11, arg4, arg9, arg0, arg1, arg7, arg2, (byte) 73, arg14, arg8);
        } else if (arg10 == 2) {
            var16 = class322.method2035(arg2, arg14, arg4, arg8, arg7, arg1, arg6, arg0, 4735, arg11, arg9);
        } else {
            var16 = class308.method1962(arg14, arg4, arg7, arg10, arg9, arg11, arg2, arg8, arg0, arg6, (byte) 125, arg1);
        }
        int var17 = arg7 - 64;
        int var18 = arg8 - 64;
        int var19 = class347.field5458;
        int var20 = class452.field6743;
        if (!var16) {
            if (!arg12) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg4 - var23; var24 <= (arg4 + var23); var24++) {
                for (int var25 = arg1 - var23; var25 <= arg1 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class71.field1218[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg4 > var24) {
                            var28 = arg4 - var24;
                        } else if ((arg4 + arg11 - 1) < var24) {
                            var28 = var24 + 1 - arg4 - arg11;
                        }
                        int var29 = 0;
                        if (arg1 > var25) {
                            var29 = arg1 - var25;
                        } else if (var25 > (arg1 + arg14 - 1)) {
                            var29 = var25 + 1 - arg1 - arg14;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && class71.field1218[var26][var27] < var22) {
                            var22 = class71.field1218[var26][var27];
                            var21 = var30;
                            var20 = var25;
                            var19 = var24;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg7 == var19 && arg8 == var20) {
            return 0;
        }
        byte var31 = 0;
        class194.field3041[var31] = var19;
        int var37 = var31 + 1;
        class82.field1443[var31] = var20;
        int var32;
        int var33 = var32 = class330.field5195[var19 - var17][var20 - var18];
        while (arg7 != var19 || arg8 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class194.field3041[var37] = var19;
                class82.field1443[var37++] = var20;
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
            var33 = class330.field5195[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg5[var34] = class194.field3041[var37];
            arg13[var34++] = class82.field1443[var37];
            if (arg5.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(CI)Z")
    public static final boolean method623(char arg0, int arg1) {
        if (arg1 != 90) {
            field1481 = null;
        }
        field1484++;
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    static {
        new class306("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field1483 = 0.0F;
    }
}
