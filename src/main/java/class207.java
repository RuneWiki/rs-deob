import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class207 {

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field3225 = 0;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Llf;")
    public static class211 field3234 = new class211(50);

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field3241 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field3237 = 0;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public int field3224;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Ldl;")
    public static class123 field3223;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "[B")
    public byte[] field3235;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "[B")
    public byte[] field3239;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "[[B")
    public static byte[][] field3240;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIC)I")
    public static final int method1406(int arg0, int arg1, char arg2) {
        field3243++;
        int var3 = arg2 << 4;
        if (arg0 != 32519) {
            return 76;
        }
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method1407(int arg0) {
        field3240 = null;
        if (arg0 < 56) {
            field3223 = null;
        }
        field3223 = null;
        field3234 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
    public static final void method1408(int arg0, int arg1) {
        field3229++;
        class287 var2 = class261.method1786(arg0, false, 2);
        var2.method1912((byte) -52);
        if (arg1 != 0) {
            field3223 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIZIIBIIII)Z")
    public static final boolean method1409(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        field3227++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class50.field695[var12][var31] = 0;
                class238.field3811[var12][var31] = 99999999;
            }
        }
        class50.field695[arg2][arg8] = 99;
        class238.field3811[arg2][arg8] = 0;
        int var13 = arg2;
        int var14 = arg8;
        boolean var15 = false;
        byte var16 = 0;
        int var17 = 0;
        if (arg7 < 84) {
            method1406(124, -104, (char) 65442);
        }
        class137.field2040[var16] = arg2;
        int var32 = var16 + 1;
        class172.field2697[var16] = arg8;
        int[][] var18 = class290.field4574[class276.field4398].field1125;
        while (var32 != var17) {
            var14 = class172.field2697[var17];
            var13 = class137.field2040[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg6 == var13 && arg9 == var14) {
                var15 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class290.field4574[class276.field4398].method538(arg0, arg11 - 1, (byte) -43, 1, var14, arg6, arg9, var13)) {
                    var15 = true;
                    break;
                }
                if (arg11 < 10 && class290.field4574[class276.field4398].method543(arg0, var14, arg6, arg11 - 1, var13, 1, 1, arg9)) {
                    var15 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg10 != 0 && class290.field4574[class276.field4398].method549(arg6, arg1, 1, var13, arg10, arg5, var14, arg9, 126)) {
                var15 = true;
                break;
            }
            int var30 = class238.field3811[var13][var14] + 1;
            if (var13 > 0 && class50.field695[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class137.field2040[var32] = var13 - 1;
                class172.field2697[var32] = var14;
                class50.field695[var13 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class238.field3811[var13 - 1][var14] = var30;
            }
            if (var13 < 103 && class50.field695[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class137.field2040[var32] = var13 + 1;
                class172.field2697[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class50.field695[var13 + 1][var14] = 8;
                class238.field3811[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class50.field695[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class137.field2040[var32] = var13;
                class172.field2697[var32] = var14 - 1;
                class50.field695[var13][var14 - 1] = 1;
                class238.field3811[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && class50.field695[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class137.field2040[var32] = var13;
                class172.field2697[var32] = var14 + 1;
                class50.field695[var13][var14 + 1] = 4;
                class238.field3811[var13][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 > 0 && class50.field695[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class137.field2040[var32] = var13 - 1;
                class172.field2697[var32] = var14 - 1;
                class50.field695[var13 - 1][var14 - 1] = 3;
                class238.field3811[var13 - 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 103 && var14 > 0 && class50.field695[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class137.field2040[var32] = var13 + 1;
                class172.field2697[var32] = var14 - 1;
                class50.field695[var13 + 1][var14 - 1] = 9;
                class238.field3811[var13 + 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 < 103 && class50.field695[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class137.field2040[var32] = var13 - 1;
                class172.field2697[var32] = var14 + 1;
                class50.field695[var13 - 1][var14 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class238.field3811[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 103 && var14 < 103 && class50.field695[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class137.field2040[var32] = var13 + 1;
                class172.field2697[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class50.field695[var13 + 1][var14 + 1] = 12;
                class238.field3811[var13 + 1][var14 + 1] = var30;
            }
        }
        class177.field2768 = 0;
        if (!var15) {
            if (!arg4) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg6 - var21; var22 <= arg6 + var21; var22++) {
                for (int var23 = arg9 - var21; var23 <= arg9 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class238.field3811[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (arg9 > var23) {
                            var25 = arg9 - var23;
                        } else if (arg9 + arg10 - 1 < var23) {
                            var25 = 1 - (arg9 + arg10 - var23);
                        }
                        if (arg6 > var22) {
                            var24 = arg6 - var22;
                        } else if (arg6 + arg5 - 1 < var22) {
                            var24 = var22 + 1 - arg6 - arg5;
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var26 < var19 || var19 == var26 && var20 > class238.field3811[var22][var23]) {
                            var19 = var26;
                            var13 = var22;
                            var14 = var23;
                            var20 = class238.field3811[var22][var23];
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg2 == var13 && arg8 == var14) {
                return false;
            }
            class177.field2768 = 1;
        }
        byte var27 = 0;
        class137.field2040[var27] = var13;
        int var33 = var27 + 1;
        class172.field2697[var27] = var14;
        int var28;
        int var29 = var28 = class50.field695[var13][var14];
        while (arg2 != var13 || arg8 != var14) {
            if (var28 != var29) {
                class137.field2040[var33] = var13;
                var28 = var29;
                class172.field2697[var33++] = var14;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            var29 = class50.field695[var13][var14];
        }
        if (var33 > 0) {
            class78.method525(arg3, var33, (byte) -4);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1410(Throwable arg0, int arg1) throws IOException {
        field3236++;
        if (arg1 != 4095) {
            return null;
        }
        String var2;
        if ((arg0 instanceof class64)) {
            class64 var3 = (class64) arg0;
            arg0 = var3.field904;
            var2 = var3.field895 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBIILef;)V")
    public static final void method1411(int arg0, byte arg1, int arg2, int arg3, class214 arg4) {
        if (class10.field138 < 3) {
            ((class12) class64.field903).method78(arg3, arg0, arg4.field3473, arg4.field3369, class64.field903.field3712 / 2, class64.field903.field3713 / 2, class29.field392, 256, arg4.field3394, arg4.field3496);
        } else {
            class127.method877(arg3, arg0, 0, arg4.field3394, arg4.field3496);
        }
        field3242++;
        if (arg1 < -19) {
            class80.field1162[arg2] = true;
        }
    }
}
