import java.awt.Component;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class10 {

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public int field177 = 0;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field164 = 0;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lha;")
    public static class46 field173 = class271.method1828("loc", -46);

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Z")
    public static boolean field176 = false;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Llk;")
    public static class164 field174;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lhi;")
    public static class24 field169;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[I")
    public static int[] field167;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "[[[B")
    public static byte[][][] field171;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "[[[I")
    public static int[][][] field175;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([Lha;III)Lha;")
    public static final class46 method49(class46[] arg0, int arg1, int arg2, int arg3) {
        field166++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class42.field720;
            }
            var4 += arg0[arg2 + var5].field762;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg3 != 16) {
            return null;
        }
        for (int var8 = 0; var8 < arg1; var8++) {
            class46 var10 = arg0[arg2 + var8];
            class104.method782(var10.field768, 0, var6, var7, var10.field762);
            var7 += var10.field762;
        }
        class46 var9 = new class46();
        var9.field768 = var6;
        var9.field762 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBLwe;)V")
    private final void method50(int arg0, byte arg1, class75 arg2) {
        if (arg0 == 5) {
            this.field177 = arg2.method545((byte) -112);
        }
        int var4 = 17 / ((arg1 + 3) / 39);
        field165++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lwe;Z)V")
    public final void method51(class75 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method558(1);
            if (var3 == 0) {
                field168++;
                if (arg1) {
                    method54((Component) null, (byte) -11);
                    return;
                }
                return;
            }
            this.method50(var3, (byte) -80, arg0);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)I")
    public static final int method52(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)[B")
    public static final byte[] method53(int arg0, int arg1) {
        field179++;
        if (arg0 != 0) {
            method49((class46[]) null, -93, -114, -125);
        }
        class142 var2 = (class142) class51.field883.method1364((long) arg1, -21987);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class98.method761(var4, false, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class142(var3);
            class51.field883.method1366(true, var2, (long) arg1);
        }
        return var2.field2590;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method54(Component arg0, byte arg1) {
        field172++;
        Method var2 = class9.field161;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        if (arg1 != -19) {
            field176 = true;
        }
        arg0.addKeyListener(class48.field830);
        arg0.addFocusListener(class48.field830);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method55(byte arg0) {
        field174 = null;
        field173 = null;
        field175 = null;
        if (arg0 < -123) {
            field171 = null;
            field167 = null;
            field169 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public static final boolean method56(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field170++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class112.field2120[var12][var31] = 0;
                class247.field4370[var12][var31] = 99999999;
            }
        }
        class112.field2120[arg1][arg10] = 99;
        class247.field4370[arg1][arg10] = 0;
        int var13 = arg1;
        int var14 = arg10;
        byte var15 = 0;
        int var16 = 0;
        boolean var17 = false;
        class162.field2877[var15] = arg1;
        int var32 = var15 + 1;
        class96.field1794[var15] = arg10;
        int[][] var18 = class183.field3282[class135.field2450].field2718;
        while (var32 != var16) {
            var13 = class162.field2877[var16];
            var14 = class96.field1794[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg6 == var13 && arg0 == var14) {
                var17 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class183.field3282[class135.field2450].method1127(arg6, false, arg9 - 1, 1, var13, arg0, arg3, var14)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class183.field3282[class135.field2450].method1121((byte) -114, arg0, var13, var14, arg9 - 1, arg3, arg6, 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg8 != 0 && class183.field3282[class135.field2450].method1117(arg8, arg11, arg7, 1, false, var13, arg0, arg6, var14)) {
                var17 = true;
                break;
            }
            int var30 = class247.field4370[var13][var14] + 1;
            if (var13 > 0 && class112.field2120[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class162.field2877[var32] = var13 - 1;
                class96.field1794[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class112.field2120[var13 - 1][var14] = 2;
                class247.field4370[var13 - 1][var14] = var30;
            }
            if (var13 < 103 && class112.field2120[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class162.field2877[var32] = var13 + 1;
                class96.field1794[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class112.field2120[var13 + 1][var14] = 8;
                class247.field4370[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class112.field2120[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class162.field2877[var32] = var13;
                class96.field1794[var32] = var14 - 1;
                class112.field2120[var13][var14 - 1] = 1;
                class247.field4370[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && class112.field2120[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class162.field2877[var32] = var13;
                class96.field1794[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class112.field2120[var13][var14 + 1] = 4;
                class247.field4370[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class112.field2120[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class162.field2877[var32] = var13 - 1;
                class96.field1794[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class112.field2120[var13 - 1][var14 - 1] = 3;
                class247.field4370[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 103 && var14 > 0 && class112.field2120[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class162.field2877[var32] = var13 + 1;
                class96.field1794[var32] = var14 - 1;
                class112.field2120[var13 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class247.field4370[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 103 && class112.field2120[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class162.field2877[var32] = var13 - 1;
                class96.field1794[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class112.field2120[var13 - 1][var14 + 1] = 6;
                class247.field4370[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 103 && var14 < 103 && class112.field2120[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class162.field2877[var32] = var13 + 1;
                class96.field1794[var32] = var14 + 1;
                class112.field2120[var13 + 1][var14 + 1] = 12;
                class247.field4370[var13 + 1][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class200.field3575 = arg4;
        if (!var17) {
            if (!arg2) {
                return false;
            }
            int var19 = 100;
            byte var20 = 10;
            int var21 = 1000;
            for (int var22 = arg6 - var20; var22 <= arg6 + var20; var22++) {
                for (int var23 = arg0 - var20; var23 <= (arg0 + var20); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class247.field4370[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg6 > var22) {
                            var24 = arg6 - var22;
                        } else if (arg6 - (1 - arg11) < var22) {
                            var24 = var22 + 1 - arg6 - arg11;
                        }
                        int var25 = 0;
                        if (var23 < arg0) {
                            var25 = arg0 - var23;
                        } else if (var23 > arg0 - (1 - arg8)) {
                            var25 = var23 + 1 - arg0 - arg8;
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var21 > var26 || var21 == var26 && class247.field4370[var22][var23] < var19) {
                            var13 = var22;
                            var21 = var26;
                            var14 = var23;
                            var19 = class247.field4370[var22][var23];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg1 == var13 && arg10 == var14) {
                return false;
            }
            class200.field3575 = 1;
        }
        byte var27 = 0;
        class162.field2877[var27] = var13;
        int var33 = var27 + 1;
        class96.field1794[var27] = var14;
        int var28;
        int var29 = var28 = class112.field2120[var13][var14];
        while (arg1 != var13 || arg10 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class162.field2877[var33] = var13;
                class96.field1794[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class112.field2120[var13][var14];
        }
        if (var33 > 0) {
            class148.method1096(arg5, var33, (byte) 56);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
