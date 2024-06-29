import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class149 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[I")
    public static int[] field2376 = new int[32];

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lvj;")
    public static class123 field2381 = new class123();

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lgi;Lgi;BLgi;Lrd;)Z")
    public static final boolean method1007(class164 arg0, class164 arg1, byte arg2, class164 arg3, class288 arg4) {
        if (arg2 != -77) {
            method1013(77, false);
        }
        class310.field5019 = arg3;
        class46.field675 = arg1;
        class91.field1454 = arg4;
        class234.field3667 = arg0;
        field2379++;
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method1008(int arg0) {
        class242.field3801.method1873(arg0 - 33870);
        field2374++;
        if (arg0 != 26469) {
            method1009(101, 105, 35, (byte[]) null, (byte) -69, (String) null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III[BBLjava/lang/String;)I")
    public static final int method1009(int arg0, int arg1, int arg2, byte[] arg3, byte arg4, String arg5) {
        field2375++;
        int var6 = arg2 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg0 + var7] = -97;
            } else {
                arg3[arg0 + var7] = 63;
            }
        }
        if (arg4 != -123) {
            method1008(72);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static final void method1010(byte arg0) {
        field2377++;
        if (arg0 > -96) {
            method1012(-122);
        }
        class91.field1454.method1972((byte) -89);
        class88.field1378 = 1;
        class298.field4859 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZILwa;IZZII)Lrk;")
    public static final class292 method1011(int arg0, boolean arg1, int arg2, class280 arg3, int arg4, boolean arg5, boolean arg6, int arg7, int arg8) {
        field2380++;
        class158 var9 = class107.method754(-20563, arg7);
        if (arg2 > 1 && var9.field2586 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg2 >= var9.field2552[var11] && var9.field2552[var11] != 0) {
                    var10 = var9.field2586[var11];
                }
            }
            if (var10 != -1) {
                var9 = class107.method754(arg4 ^ 0xFFFFAFAD, var10);
            }
        }
        class3 var12 = var9.method1069(arg3, (byte) 38);
        if (var12 == null) {
            return null;
        }
        class67 var13 = null;
        if (~var9.field2525 != arg4) {
            var13 = (class67) method1011(0, true, 10, arg3, 0, false, true, var9.field2562, 1);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2548 != -1) {
            var13 = (class67) method1011(arg0, false, arg2, arg3, 0, false, true, var9.field2541, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class94.field1495;
        int var15 = class94.field1497;
        int var16 = class94.field1496;
        int[] var17 = new int[4];
        class94.method657(var17);
        class67 var18 = new class67(36, 32);
        class94.method682(var18.field1082, 36, 32);
        class136.method945();
        class136.method941(16, 16);
        class136.field2200 = false;
        int var19 = var9.field2591;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg8 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class136.field2191[var9.field2545] * var19 >> 16;
        int var21 = class136.field2193[var9.field2545] * var19 >> 16;
        var12.method20(0, var9.field2585, var9.field2520, var9.field2545, var9.field2553, (var20 + var9.field2566) - (var12.method22() / 2), var21 - -var9.field2566, -1L);
        if (arg8 >= 1) {
            var18.method455(1);
            if (arg8 >= 2) {
                var18.method455(16777215);
            }
            class94.method682(var18.field1082, 36, 32);
        }
        if (arg0 != 0) {
            var18.method459(arg0);
        }
        if (var9.field2525 != -1) {
            var13.method451(0, 0);
        } else if (var9.field2548 != -1) {
            class94.method682(var13.field1082, 36, 32);
            var18.method451(0, 0);
            var18 = var13;
        }
        if (arg5 && (var9.field2539 == 1 || arg2 != 1) && arg2 != -1) {
            class146.field2344.method505(class46.method305((byte) 91, arg2), 0, 9, 16776960, 1);
        }
        class94.method682(var14, var16, var15);
        class94.method659(var17);
        class136.method945();
        class136.field2200 = true;
        return var18;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method1012(int arg0) {
        field2381 = null;
        if (arg0 <= 88) {
            field2376 = null;
        }
        field2376 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
    public static final void method1013(int arg0, boolean arg1) {
        field2378++;
        class291 var2 = class61.method389(arg0, 2, 0);
        var2.method2010(0);
        if (!arg1) {
            field2381 = null;
        }
    }
}
