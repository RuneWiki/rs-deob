import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class149 extends class320 {

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2443 = "Discard";

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "Z")
    public static boolean field2444 = false;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "Lcn;")
    public static class37 field2435 = new class37(512);

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "Lcn;")
    private class37 field2437;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "[I")
    public static int[] field2447;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "[[B")
    public static byte[][] field2448;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V", line = 6)
    public static void method1236(byte arg0) {
        field2447 = null;
        field2435 = null;
        field2443 = null;
        field2448 = (byte[][]) null;
        int var1 = 54 % ((arg0 - 15) / 32);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBLug;)V", line = 18)
    private final void method1237(int arg0, byte arg1, class25 arg2) {
        field2442++;
        if (arg1 != -75) {
            this.field2437 = (class37) null;
        }
        if (arg0 != 249) {
            return;
        }
        int var4 = arg2.method281(60);
        if (this.field2437 == null) {
            int var5 = class261.method1918(var4, 22);
            this.field2437 = new class37(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method281(-128) == 1;
            int var8 = arg2.method265(true);
            class172 var9;
            if (var7) {
                var9 = new class126(arg2.method297((byte) -85));
            } else {
                var9 = new class164(arg2.method262((byte) 29));
            }
            this.field2437.method375(var9, (long) var8, arg1 - 5);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 63)
    public final String method1238(int arg0, int arg1, String arg2) {
        field2445++;
        if (this.field2437 == null) {
            return arg2;
        } else if (arg1 < 105) {
            return (String) null;
        } else {
            class126 var4 = (class126) this.field2437.method370((byte) -120, (long) arg0);
            return var4 == null ? arg2 : var4.field2105;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(III)I", line = 86)
    public final int method1239(int arg0, int arg1, int arg2) {
        field2441++;
        if (this.field2437 == null) {
            return arg2;
        }
        if (arg0 != 152739632) {
            this.method1238(28, 29, (String) null);
        }
        class164 var4 = (class164) this.field2437.method370((byte) -120, (long) arg1);
        return var4 == null ? arg2 : var4.field2610;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)I", line = 106)
    public static final int method1240(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field2436++;
        if (arg0 <= 7) {
            method1243((class93) null, -32, -15, 31, false, -21, (class52) null, 92, 94, -109, true, 117, -21, -80);
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIII)V", line = 133)
    public static final void method1241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class100 var7 = new class100();
        var7.field1516 = arg1 / 128;
        var7.field1515 = arg2 / 128;
        var7.field1517 = arg3 / 128;
        var7.field1504 = arg4 / 128;
        var7.field1499 = arg0;
        var7.field1501 = arg1;
        var7.field1500 = arg2;
        var7.field1507 = arg3;
        var7.field1505 = arg4;
        var7.field1502 = arg5;
        var7.field1511 = arg6;
        class4.field57[class304.field4729++] = var7;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(III)Le;", line = 150)
    public static final class138 method1242(int arg0, int arg1, int arg2) {
        class138 var3 = (class138) class296.field4598.method370((byte) -120, (long) arg2 << 32 | (long) arg0);
        if (arg1 != 0) {
            field2444 = false;
        }
        field2440++;
        if (var3 == null) {
            var3 = new class138(arg2, arg0);
            class296.field4598.method375(var3, var3.field2734, 95);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lbg;IIIZILhm;IIIZIII)Lhm;", line = 175)
    public static final class52 method1243(class93 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class52 arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12, int arg13) {
        field2439++;
        long var14 = ((long) arg2 << 32) + ((long) arg11 << 48) + (long) ((arg5 << 24) + (arg7 << 16) + arg3);
        class52 var16 = (class52) class362.field5734.method654(71, var14);
        if (var16 == null) {
            byte var17;
            if (arg3 == 1) {
                var17 = 9;
            } else if (arg3 == 2) {
                var17 = 12;
            } else if (arg3 == 3) {
                var17 = 15;
            } else if (arg3 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class40 var20 = new class40(var17 * var18 + 1, var18 * 2 * var17 + -var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method409(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class107.field1604[var27] * var24 + arg9 >> 16;
                    int var29 = class107.field1605[var27] * var25 + arg8 >> 16;
                    var21[var23][var26] = var20.method409(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg5 * var31 + arg7 * var32 >> 8);
                short var34 = (short) (((arg2 & 0x380) * var32 + (arg11 & 0x380) * var31 & 0x38000) + ((arg2 & 0x7F) * var32 + (arg11 & 0x7F) * var31 & 0x7F00) + ((arg2 & 0xFC00) * var32 + (arg11 & 0xFC00) * var31 & 0xFC0000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method397(var22, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method397(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method397(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method410(64, 768, -50, -10, -50);
            class362.field5734.method652(74, var16, var14);
        }
        int var36 = arg3 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        if (arg10) {
            if (arg13 > 1664 || arg13 < 384) {
                var38 -= 128;
            }
            if (arg13 > 640 && arg13 < 1408) {
                var39 = var36 + 128;
            }
            if (arg13 > 128 && arg13 < 896) {
                var37 -= 128;
            }
            if (arg13 > 1152 && arg13 < 1920) {
                var40 = var36 + 128;
            }
        }
        int var41 = arg6.method488();
        if (var37 > var41) {
            var41 = var37;
        }
        int var42 = arg6.method502();
        if (var40 < var42) {
            var42 = var40;
        }
        int var43 = arg6.method489();
        class162 var44 = null;
        if (arg4) {
            return (class52) null;
        }
        int var45 = arg6.method503();
        if (var39 < var45) {
            var45 = var39;
        }
        if (var43 < var38) {
            var43 = var38;
        }
        if (arg0 != null) {
            int var46 = arg0.field1428[arg12];
            var44 = class178.method1396(var46 >> 16, 0);
            arg12 = var46 & 0xFFFF;
        }
        class52 var47;
        if (var44 == null) {
            var47 = var16.method513(true, true, true);
            var47.method511((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method515((var41 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method513(!var44.method1299(arg12, 18329), !var44.method1298(arg12, 32), true);
            var47.method511((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method515((var41 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method510(var44, arg12);
        }
        if (arg13 != 0) {
            var47.method491(arg13);
        }
        if (class240.field3737) {
            class56 var50 = (class56) var47;
            if (class193.method1469(arg8 + var43, arg9 + var41, (byte) -47, class119.field1826) != arg1 || class193.method1469(arg8 + var45, arg9 + var42, (byte) -47, class119.field1826) != arg1) {
                for (int var51 = 0; var51 < var50.field846; var51++) {
                    var50.field857[var51] += class193.method1469(var50.field842[var51] + arg8, var50.field844[var51] + arg9, (byte) -47, class119.field1826) - arg1;
                }
                var50.field834.field1396 = false;
                var50.field837.field2213 = false;
            }
        } else {
            class124 var48 = (class124) var47;
            if (arg1 != class193.method1469(arg8 + var43, arg9 + var41, (byte) -47, class119.field1826) || class193.method1469(arg8 + var45, arg9 + var42, (byte) -47, class119.field1826) != arg1) {
                for (int var49 = 0; var49 < var48.field1994; var49++) {
                    var48.field1984[var49] += class193.method1469(var48.field2023[var49] + arg8, var48.field2003[var49] + arg9, (byte) -47, class119.field1826) - arg1;
                }
                var48.field1982 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILug;)V", line = 399)
    public final void method1244(int arg0, class25 arg1) {
        if (arg0 > -19) {
            return;
        }
        field2446++;
        while (true) {
            int var3 = arg1.method281(102);
            if (var3 == 0) {
                return;
            }
            this.method1237(var3, (byte) -75, arg1);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 422)
    public static final void method1245(boolean arg0) {
        field2438++;
        try {
            if (class42.field671 == 1) {
                int var1 = class128.field2122.method149((byte) -87);
                if (var1 > 0 && class128.field2122.method133(4)) {
                    int var2 = var1 - class37.field573;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class128.field2122.method153(var2, (byte) -11);
                    return;
                }
                class128.field2122.method148(true);
                class128.field2122.method143(true);
                class261.field4008 = null;
                class226.field3524 = null;
                if (class337.field5185 == null) {
                    class42.field671 = 0;
                } else {
                    class42.field671 = 2;
                }
            }
            if (!arg0) {
                method1243((class93) null, -43, 7, 15, false, -92, (class52) null, -40, 37, -73, false, -127, -44, 103);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class128.field2122.method148(true);
            class226.field3524 = null;
            class42.field671 = 0;
            class261.field4008 = null;
            class337.field5185 = null;
        }
    }
}
