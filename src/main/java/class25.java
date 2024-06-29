import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class25 extends class252 {

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "Ljava/lang/String;")
    public static String field458 = "glow3:";

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
    public static boolean field457 = false;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "F")
    public static float field452;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Ljava/lang/String;")
    public String field451;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "[I")
    public int[] field466;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "[I")
    public int[] field467;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "[Li;")
    public class58[] field453;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "[Ljava/lang/String;")
    public String[] field464;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIIZIILha;ILai;)Lha;")
    public static final class32 method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, class32 arg11, int arg12, class91 arg13) {
        long var14 = ((long) arg2 << 48) + ((long) ((arg10 << 16) + (arg4 << 24) + arg0) + ((long) arg12 << 32));
        class32 var16 = (class32) class123.field1949.method1879(8887, var14);
        field454++;
        if (var16 == null) {
            byte var17;
            if (arg0 == 1) {
                var17 = 9;
            } else if (arg0 == 2) {
                var17 = 12;
            } else if (arg0 == 3) {
                var17 = 15;
            } else if (arg0 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[][] var19 = new int[var18][var17];
            int[] var20 = new int[] { 64, 96, 128 };
            class201 var21 = new class201(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int var22 = var21.method1409(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var20[var23];
                int var31 = var20[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg5 + (class136.field2191[var33] * var30) >> 16;
                    int var35 = class136.field2193[var33] * var31 + arg6 >> 16;
                    var19[var23][var32] = var21.method1409(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                short var27 = (short) (((arg2 & 0x7F) * var25 + (arg12 & 0x7F) * var26 & 0x7F00) + ((arg2 & 0x380) * var25 + (arg12 & 0x380) * var26 & 0x38000) + ((arg2 & 0xFC00) * var25 + (arg12 & 0xFC00) * var26 & 0xFC0000) >> 8);
                byte var28 = (byte) (arg4 * var25 + arg10 * var26 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var21.method1401(var22, var19[0][(var29 + 1) % var17], var19[0][var29], (byte) 1, var27, var28);
                    } else {
                        var21.method1401(var19[var24 - 1][var29], var19[var24 - 1][(var29 + 1) % var17], var19[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var21.method1401(var19[var24 - 1][var29], var19[var24][(var29 + 1) % var17], var19[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var21.method1391(64, 768, -50, -10, -50);
            class123.field1949.method1883(var14, 108, var16);
        }
        int var36 = arg0 * 64 - 1;
        int var37 = var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg11.method26();
        int var41 = -var36;
        if (arg8) {
            if (arg9 > 1664 || arg9 < 384) {
                var41 -= 128;
            }
            if (arg9 > 640 && arg9 < 1408) {
                var39 = var36 + 128;
            }
            if (arg9 > 1152 && arg9 < 1920) {
                var37 = var36 + 128;
            }
            if (arg9 > 128 && arg9 < 896) {
                var38 -= 128;
            }
        }
        if (var38 > var40) {
            var40 = var38;
        }
        int var42 = arg11.method34();
        class294 var43 = null;
        if (arg3 < 107) {
            field457 = true;
        }
        int var44 = arg11.method51();
        if (var44 < var41) {
            var44 = var41;
        }
        int var45 = arg11.method46();
        if (var45 > var39) {
            var45 = var39;
        }
        if (var37 < var42) {
            var42 = var37;
        }
        if (arg13 != null) {
            int var46 = arg13.field1434[arg7];
            var43 = class215.method1476((byte) 47, var46 >> 16);
            arg7 = var46 & 0xFFFF;
        }
        class32 var47;
        if (var43 == null) {
            var47 = var16.method25(true, true, true);
            var47.method47((var42 - var40) / 2, 128, (var45 - var44) / 2);
            var47.method19((var40 + var42) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method25(!var43.method2024(arg7, 0), !var43.method2023(arg7, 0), true);
            var47.method47((var42 - var40) / 2, 128, (var45 - var44) / 2);
            var47.method19((var40 + var42) / 2, 0, (var44 + var45) / 2);
            var47.method243(var43, arg7);
        }
        if (arg9 != 0) {
            var47.method32(arg9);
        }
        class3 var48 = (class3) var47;
        if (arg1 != class60.method387(-18796, arg6 + var44, arg5 + var40, class214.field3389) || arg1 != class60.method387(-18796, arg6 + var45, arg5 - -var42, class214.field3389)) {
            for (int var49 = 0; var49 < var48.field37; var49++) {
                var48.field40[var49] += class60.method387(-18796, var48.field10[var49] + arg6, var48.field36[var49] + arg5, class214.field3389) - arg1;
            }
            var48.field4 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)Lhg;")
    public static final class190 method200(int arg0, byte arg1) {
        field463++;
        class190 var2 = (class190) class255.field4210.method1879(arg1 + 8824, (long) arg0);
        if (arg1 != 63) {
            method200(-105, (byte) 81);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class217.field3416.method1156(arg0, 0, (byte) -16);
        class190 var4 = new class190(var3);
        var4.method516(class197.field3174, (int[]) null);
        class255.field4210.method1883((long) arg0, arg1 - 139, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static final void method201(boolean arg0) {
        field461++;
        for (class27 var1 = (class27) class127.field2023.method1553(arg0); var1 != null; var1 = (class27) class127.field2023.method1551(0)) {
            class98 var2 = var1.field487;
            if (class214.field3389 != var2.field1548 || var2.field1547) {
                var1.method952((byte) 86);
            } else if (var2.field1562 <= class274.field4472) {
                var2.method697(class61.field883, -3553);
                if (var2.field1547) {
                    var1.method952((byte) 50);
                } else {
                    class137.method949(var2.field1548, var2.field1557, var2.field1550, var2.field1543, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
    public static void method202(int arg0) {
        if (arg0 < -88) {
            field458 = null;
        }
    }
}
