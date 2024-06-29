import java.awt.event.ActionEvent;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class119 extends InputStream {

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "Z")
    public static boolean field2015 = false;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "Ldb;")
    public static class298 field2014 = new class298(106, 4);

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/Object;BLii;)V")
    public static final void method928(Object arg0, byte arg1, class519 arg2) {
        field2019++;
        if (arg2.field6925 == null) {
            return;
        }
        if (arg1 != -60) {
            field2015 = true;
        }
        for (int var3 = 0; var3 < 50 && arg2.field6925.peekEvent() != null; var3++) {
            class486.method2722(arg1 ^ 0xFFFFFFC4, 1L);
        }
        try {
            if (arg0 != null) {
                arg2.field6925.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!hw", name = "read", descriptor = "()I")
    public final int read() {
        class486.method2722(0, 30000L);
        field2018++;
        return -1;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)V")
    public static final void method929(int arg0, int arg1, int arg2) {
        if (arg0 != 17559) {
            method929(115, -37, 39);
        }
        field2020++;
        class382 var3 = class396.method2276(-29, 16, arg1);
        var3.method2232(-95);
        var3.field5099 = arg2;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
    public static final int method930(String arg0, String arg1, int arg2, int arg3) {
        field2017++;
        int var4 = arg1.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || var7 - var9 < var5) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class161.method1122(var22, -31);
            var9 = class161.method1122(var24, -123);
            char var26 = class577.method3158(arg2, var22, 220);
            char var27 = class577.method3158(arg2, var24, 220);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class386.method2245(arg2, (byte) 116, var28) - class386.method2245(arg2, (byte) 63, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class386.method2245(arg2, (byte) 26, var20) - class386.method2245(arg2, (byte) 68, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (~var12 != arg3) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class386.method2245(arg2, (byte) 76, var14) - class386.method2245(arg2, (byte) 57, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
    public static void method931(byte arg0) {
        field2014 = null;
        int var1 = -45 / ((arg0 + 33) / 36);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIILwh;)V")
    public static final void method932(int arg0, int arg1, int arg2, int arg3, class136 arg4) {
        class24 var5 = class457.method2610(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field2211 = (arg1 << class348.field4782) + class16.field256;
        arg4.field2218 = arg3;
        arg4.field2215 = (arg2 << class348.field4782) + class16.field256;
        for (class684 var7 = var5.field409; var7 != null; var7 = var7.field9618) {
            if (var7.field9619.field8613) {
                int var8 = var7.field9619.method729(false);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field2218 += var6;
            arg4.field2213 = true;
        } else if (var5.field422 != null) {
            arg4.field2218 -= var5.field422.field8195;
        }
        var5.field403 = arg4;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIZIIILed;IIIII[I[I)I")
    public static final int method933(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, class661 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, int[] arg14) {
        field2022++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class77.field1210[var15][var35] = 0;
                class526.field7006[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg8 == 1) {
            var16 = class109.method811(arg2, arg12, arg5, arg7, arg11, arg9, arg4, arg10, false, arg0, arg1);
        } else if (arg8 == 2) {
            var16 = class19.method190(arg12, arg7, arg10, 0, arg1, arg5, arg2, arg4, arg11, arg0, arg9);
        } else {
            var16 = class360.method2136(arg12, arg11, arg10, arg7, arg0, arg1, arg8, (byte) 40, arg5, arg9, arg2, arg4);
        }
        int var17 = arg0 - 64;
        int var18 = arg4 - 64;
        int var19 = class160.field2542;
        int var20 = class689.field9702;
        if (!var16) {
            if (!arg3) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg10 - var23; var25 <= arg10 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class526.field7006[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg2 > var24) {
                            var28 = arg2 - var24;
                        } else if (var24 > arg2 + arg1 - 1) {
                            var28 = var24 + 1 - arg1 - arg2;
                        }
                        int var29 = 0;
                        if (var25 < arg10) {
                            var29 = arg10 - var25;
                        } else if ((arg11 + arg10 - 1) < var25) {
                            var29 = var25 + 1 - arg10 - arg11;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && class526.field7006[var26][var27] < var22) {
                            var21 = var30;
                            var20 = var25;
                            var22 = class526.field7006[var26][var27];
                            var19 = var24;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg6 != 2) {
            method929(75, 116, 18);
        }
        if (arg0 == var19 && arg4 == var20) {
            return 0;
        }
        byte var31 = 0;
        class255.field3541[var31] = var19;
        int var37 = var31 + 1;
        class445.field6092[var31] = var20;
        int var32;
        int var33 = var32 = class77.field1210[var19 - var17][var20 - var18];
        while (arg0 != var19 || arg4 != var20) {
            if (var32 != var33) {
                class255.field3541[var37] = var19;
                var32 = var33;
                class445.field6092[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class77.field1210[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg14[var34] = class255.field3541[var37];
            arg13[var34++] = class445.field6092[var37];
            if (arg14.length <= var34) {
                break;
            }
        }
        return var34;
    }
}
