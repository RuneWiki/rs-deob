import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class31 extends class361 {

    @OriginalMember(owner = "client!i", name = "y", descriptor = "Ldu;")
    public static class242 field364 = new class242(6, 7);

    @OriginalMember(owner = "client!i", name = "D", descriptor = "Leh;")
    public static class246 field369 = new class246(49, 1);

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method187(byte arg0, String arg1) {
        field366++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var9 = arg1.charAt(var4);
            if (var9 == '<' || var9 == '>') {
                var3 += 3;
            }
        }
        int var5 = 111 / ((-arg0 - 65) / 54);
        StringBuffer var6 = new StringBuffer(var2 + var3);
        for (int var7 = 0; var7 < var2; var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 == '<') {
                var6.append("<lt>");
            } else if (var8 == '>') {
                var6.append("<gt>");
            } else {
                var6.append(var8);
            }
        }
        return var6.toString();
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method188(byte arg0) {
        if (arg0 != 96) {
            field364 = null;
        }
        field369 = null;
        field364 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILhm;Lul;Lta;IIILjava/lang/String;IIILla;)V")
    public static final void method189(int arg0, class150 arg1, class411 arg2, class145 arg3, int arg4, int arg5, int arg6, String arg7, int arg8, int arg9, int arg10, class319 arg11) {
        field363++;
        int var12;
        if (class504.field7461 == 4) {
            var12 = (int) class153.field2204 & 0x3FFF;
        } else {
            var12 = (int) class153.field2204 + class460.field6441 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field2113 / 2, arg1.field2033 / 2) + 10;
        int var14 = arg0 * arg0 + arg6 * arg6;
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class95.field1242[var12];
        int var16 = class95.field1241[var12];
        if (class504.field7461 != 4) {
            var16 = var16 * 256 / (class98.field1304 + 256);
            var15 = var15 * 256 / (class98.field1304 + 256);
        }
        int var17 = arg0 * var16 + arg6 * var15 >> 15;
        if (arg9 != -25396) {
            return;
        }
        int var18 = arg6 * var16 - (arg0 * var15) >> 15;
        int var19 = arg2.method2435((byte) 114, 100, arg7, null);
        int var20 = var17 - var19 / 2;
        int var21 = arg2.method2437(arg7, 92, null, 0, 100);
        if ((-arg1.field2113) <= var20 && arg1.field2113 >= var20 && var18 >= -arg1.field2033 && var18 <= arg1.field2033) {
            arg11.method1922(50, 0, arg1.field2033 / 2 + arg8 - arg5 - var18 - var21, 0, 1, arg10, arg3, arg1.field2113 / 2 + arg4 + var20, arg8, 0, var19, null, arg4, null, arg7, -2);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)Lfp;")
    public static final class216 method190(byte arg0) {
        field368++;
        if (class245.field3560 == null || class55.field702 == null) {
            return null;
        }
        if (arg0 >= -109) {
            method191(null, 48, null, null, -28, -52);
        }
        for (class216 var1 = (class216) class55.field702.method880((byte) -21); var1 != null; var1 = (class216) class55.field702.method880((byte) -73)) {
            class156 var2 = class245.field3553.method1316((byte) -68, var1.field3126);
            if (var2 != null && var2.field2314 && var2.method1004(false, class245.field3548)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lza;ILfp;Ljd;II)Z")
    public static final boolean method191(class290 arg0, int arg1, class216 arg2, class156 arg3, int arg4, int arg5) {
        field362++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field2310 != null) {
            var6 = (arg2.field3122 + arg3.field2328 - class245.field3572) * (class245.field3585 - class245.field3566) / (class245.field3577 - class245.field3572) + class245.field3566;
            var9 = class245.field3568 - ((arg3.field2335 + arg2.field3121 - class245.field3579) * (class245.field3568 - class245.field3573) / (class245.field3581 - class245.field3579));
            var8 = class245.field3568 - (arg3.field2330 + arg2.field3121 - class245.field3579) * (class245.field3568 - class245.field3573) / (class245.field3581 - class245.field3579);
            var7 = (arg2.field3122 + arg3.field2329 - class245.field3572) * (class245.field3585 - class245.field3566) / (class245.field3577 - class245.field3572) + class245.field3566;
        }
        class24 var10 = null;
        int var11 = 0;
        int var12 = 0;
        if (arg4 != 27271) {
            field367 = -7;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg3.field2334 != -1) {
            if (arg2.field3129 && arg3.field2324 != -1) {
                var10 = arg3.method1005(true, true, arg0);
            } else {
                var10 = arg3.method1005(false, true, arg0);
            }
            if (var10 != null) {
                var11 = arg2.field3127 - (var10.method145() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg2.field3127 + (var10.method145() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg2.field3130 - (var10.method157() + 1 >> 1);
                var14 = arg2.field3130 + (var10.method157() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class11 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg3.field2308 != null) {
            var15 = class473.method2734(-2, arg3.field2343);
            if (var15 != null) {
                var16 = class498.field7057.method2436(arg3.field2308, false, class286.field4188, null, null);
                int var23 = arg2.field3130;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method64() / 2;
                } else {
                    var17 = var23 - ((var10.method157() >> 1) + var16 * var15.method66());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class286.field4188[var24];
                    if (var24 < var16 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method65(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg5 + arg2.field3127 - (var18 / 2);
                var20 = var18 / 2 + arg2.field3127 + arg5;
                if (var19 < var6) {
                    var6 = var19;
                }
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = arg1 + var17;
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = var17 + var15.method66() * var16 + arg1;
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class245.field3566 > var7 || class245.field3585 < var6 || var9 < class245.field3573 || class245.field3568 < var8) {
            return true;
        }
        if (arg3.field2310 != null) {
            int[] var27 = new int[arg3.field2310.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg3.field2310[var28 * 2] + arg2.field3122;
                int var31 = arg3.field2310[var28 * 2 + 1] + arg2.field3121;
                var27[var28 * 2] = (var30 - class245.field3572) * (class245.field3585 - class245.field3566) / (class245.field3577 - class245.field3572) + class245.field3566;
                var27[var28 * 2 + 1] = class245.field3568 - ((var31 - class245.field3579) * (class245.field3568 - class245.field3573) / (class245.field3581 - class245.field3579));
            }
            class490.method2832(arg0, var27, arg3.field2341);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg0.method1797(true, var27[var29 * 2 + 1 + 2], var27[var29 * 2], var27[var29 * 2 + 1], var27[(var29 + 1) * 2], arg3.field2317);
            }
            arg0.method1797(true, var27[1], var27[var27.length - 2], var27[var27.length - 1], var27[0], arg3.field2317);
        }
        if (var10 != null) {
            if (class367.field5246 > 0 && (class205.field2969 != -1 && class205.field2969 == arg2.field3126 || class163.field2416 != -1 && class163.field2416 == arg3.field2332)) {
                int var32;
                if (class515.field7594 > 50) {
                    var32 = (100 - class515.field7594) * 2;
                } else {
                    var32 = class515.field7594 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg0.method1799(var33, arg2.field3130, (byte) -73, arg2.field3127, var10.method146() / 2 + 7);
                arg0.method1799(var33, arg2.field3130, (byte) 107, arg2.field3127, var10.method146() / 2 + 5);
                arg0.method1799(var33, arg2.field3130, (byte) -19, arg2.field3127, var10.method146() / 2 + 3);
                arg0.method1799(var33, arg2.field3130, (byte) -83, arg2.field3127, var10.method146() / 2 + 1);
                arg0.method1799(var33, arg2.field3130, (byte) 110, arg2.field3127, var10.method146() / 2);
            }
            var10.method151(arg2.field3127 - (var10.method145() >> 1), arg2.field3130 + -(var10.method157() >> 1));
        }
        if (arg3.field2308 != null && var15 != null) {
            class26.method170(var18, var17, true, arg2, var15, var16, arg0, arg3);
        }
        if (arg3.field2334 != -1 || arg3.field2308 != null) {
            class369 var34 = new class369(arg2);
            var34.field5255 = var13;
            var34.field5256 = var19;
            var34.field5259 = var12;
            var34.field5266 = var14;
            var34.field5263 = var22;
            var34.field5257 = var11;
            var34.field5262 = var20;
            var34.field5261 = var21;
            class382.field5382.method2657(8492, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILoi;Loi;)I")
    public static final int method192(int arg0, class53 arg1, class53 arg2) {
        field365++;
        int var3 = 0;
        if (arg2.method424(0, class340.field4929)) {
            var3++;
        }
        if (arg2.method424(0, class168.field2455)) {
            var3++;
        }
        if (arg2.method424(0, class483.field6731)) {
            var3++;
        }
        if (arg1.method424(arg0 ^ arg0, class340.field4929)) {
            var3++;
        }
        if (arg1.method424(0, class168.field2455)) {
            var3++;
        }
        if (arg1.method424(0, class483.field6731)) {
            var3++;
        }
        return var3;
    }
}
