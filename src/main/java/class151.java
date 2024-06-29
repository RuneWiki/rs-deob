import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class151 extends class451 {

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1976 = " is already on your friend list.";

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1979;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "[I")
    public static int[] field1980;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1978;

    static {
        new class353(64);
        field1979 = "Loading fonts - ";
        field1980 = new int[5];
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZCLjava/lang/String;)I", line = 5)
    public static final int method984(boolean arg0, char arg1, String arg2) {
        field1978++;
        int var3 = 0;
        int var4 = arg2.length();
        int var5 = 0;
        if (!arg0) {
            field1976 = null;
        }
        while (var4 > var5) {
            if (arg1 == arg2.charAt(var5)) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Z", line = 33)
    public static final boolean method985(int arg0) {
        field1973++;
        return class24.field428 == arg0 ? class413.field6182.method2284(1000000) : true;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 49)
    public static void method986(byte arg0) {
        field1979 = null;
        field1980 = null;
        field1976 = null;
        int var1 = -48 % (arg0 / 39);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZZ)V", line = 62)
    public static final void method987(boolean arg0, boolean arg1) {
        if (!arg1) {
            method988(43, 85, -100, 78, 104, 95, 46);
        }
        field1975++;
        class54.field806 = arg0;
        if (!class54.field806) {
            int var27 = class114.field1556.method1694(-1);
            int var28 = class114.field1556.method1685(8104);
            int var29 = class114.field1556.method1697(-37);
            boolean var30 = class114.field1556.method1674((byte) -120) == 1;
            int var31 = (class413.field6176 - class114.field1556.field3915) / 16;
            class29.field497 = new int[var31][4];
            for (int var32 = 0; var32 < var31; var32++) {
                for (int var41 = 0; var41 < 4; var41++) {
                    class29.field497[var32][var41] = class114.field1556.method1666(-2);
                }
            }
            int var33 = class114.field1556.method1674((byte) 35);
            int var34 = class114.field1556.method1685(8104);
            int var35 = class114.field1556.method1685(8104);
            class222.method1378(4, var29);
            class106.field1417 = new int[var31];
            class60.field861 = new int[var31];
            class79.field1085 = null;
            class407.field6104 = new byte[var31][];
            class100.field1352 = new int[var31];
            class240.field3383 = new byte[var31][];
            class191.field2658 = new int[var31];
            class340.field5008 = null;
            class176.field2298 = new int[var31];
            class387.field5785 = new byte[var31][];
            class300.field4292 = new byte[var31][];
            boolean var36 = false;
            if (((var27 / 8) == 48 || (var27 / 8) == 49) && var35 / 8 == 48) {
                var36 = true;
            }
            int var37 = 0;
            if ((var27 / 8) == 48 && var35 / 8 == 148) {
                var36 = true;
            }
            for (int var38 = (var27 - (class324.field4652 >> 4)) / 8; var38 <= ((class324.field4652 >> 4) + var27) / 8; var38++) {
                for (int var39 = (var35 - (class336.field4964 >> 4)) / 8; var39 <= ((class336.field4964 >> 4) + var35) / 8; var39++) {
                    int var40 = (var38 << 8) + var39;
                    if (var36 && var39 == 49 || var39 == 149 || var39 == 147 || var38 == 50 || !(var38 != 49 || var39 != 47)) {
                        class106.field1417[var37] = var40;
                        class100.field1352[var37] = -1;
                        class60.field861[var37] = -1;
                        class191.field2658[var37] = -1;
                        class176.field2298[var37] = -1;
                    } else {
                        class106.field1417[var37] = var40;
                        class100.field1352[var37] = class285.field4163.method1467(97, "m" + var38 + "_" + var39);
                        class60.field861[var37] = class285.field4163.method1467(115, "l" + var38 + "_" + var39);
                        class191.field2658[var37] = class285.field4163.method1467(98, "um" + var38 + "_" + var39);
                        class176.field2298[var37] = class285.field4163.method1467(124, "ul" + var38 + "_" + var39);
                    }
                    var37++;
                }
            }
            class78.method495(false, var35, var30, var27, var28, var33, 24, var34);
            return;
        }
        boolean var2 = class114.field1556.method1665(14684) == 1;
        int var3 = class114.field1556.method1685(8104);
        int var4 = class114.field1556.method1674((byte) -103);
        int var5 = class114.field1556.method1694(-1);
        int var6 = class114.field1556.method1705(false);
        int var7 = class114.field1556.method1702(4095);
        int var8 = class114.field1556.method1685(8104);
        class222.method1378(4, var4);
        class114.field1556.method761(115);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var24 = 0; var24 < class324.field4652 >> 3; var24++) {
                for (int var25 = 0; var25 < (class336.field4964 >> 3); var25++) {
                    int var26 = class114.field1556.method763(1, false);
                    if (var26 == 1) {
                        class445.field6484[var9][var24][var25] = class114.field1556.method763(26, !arg1);
                    } else {
                        class445.field6484[var9][var24][var25] = -1;
                    }
                }
            }
        }
        class114.field1556.method755(320);
        int var10 = (class413.field6176 - class114.field1556.field3915) / 16;
        class29.field497 = new int[var10][4];
        for (int var11 = 0; var11 < var10; var11++) {
            for (int var23 = 0; var23 < 4; var23++) {
                class29.field497[var11][var23] = class114.field1556.method1666(-2);
            }
        }
        class176.field2298 = new int[var10];
        class106.field1417 = new int[var10];
        class79.field1085 = null;
        class300.field4292 = new byte[var10][];
        class407.field6104 = new byte[var10][];
        class340.field5008 = null;
        class100.field1352 = new int[var10];
        class191.field2658 = new int[var10];
        class60.field861 = new int[var10];
        class240.field3383 = new byte[var10][];
        class387.field5785 = new byte[var10][];
        int var12 = 0;
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < (class324.field4652 >> 3); var14++) {
                for (int var15 = 0; var15 < (class336.field4964 >> 3); var15++) {
                    int var16 = class445.field6484[var13][var14][var15];
                    if (var16 != -1) {
                        int var17 = (var16 & 0xFFDB81) >> 14;
                        int var18 = var16 >> 3 & 0x7FF;
                        int var19 = (var17 / 8 << 8) + var18 / 8;
                        for (int var20 = 0; var20 < var12; var20++) {
                            if (class106.field1417[var20] == var19) {
                                var19 = -1;
                                break;
                            }
                        }
                        if (var19 != -1) {
                            class106.field1417[var12] = var19;
                            int var21 = var19 >> 8 & 0xFF;
                            int var22 = var19 & 0xFF;
                            class100.field1352[var12] = class285.field4163.method1467(118, "m" + var21 + "_" + var22);
                            class60.field861[var12] = class285.field4163.method1467(109, "l" + var21 + "_" + var22);
                            class191.field2658[var12] = class285.field4163.method1467(101, "um" + var21 + "_" + var22);
                            class176.field2298[var12] = class285.field4163.method1467(122, "ul" + var21 + "_" + var22);
                            var12++;
                        }
                    }
                }
            }
        }
        class78.method495(false, var3, var2, var8, var6, var7, 24, var5);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIII)V", line = 323)
    public static final void method988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1974++;
        class277.method1767(arg0, (byte) -103);
        int var7 = 0;
        int var8 = arg0 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class227.field3201[arg2];
        int var16 = arg3 - var8;
        class370.method2440(var16, var15, arg5, arg3 - arg0, 87);
        int var17 = arg3 + var8;
        class370.method2440(var17, var15, arg1, var16, 73);
        class370.method2440(arg3 + arg0, var15, arg5, var17, 86);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class348.field5172[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class227.field3201[arg2 + var9];
                    int[] var19 = class227.field3201[arg2 - var9];
                    int var20 = class348.field5172[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class370.method2440(var24, var18, arg5, var22, 87);
                    class370.method2440(var23, var18, arg1, var24, arg4 - 877265099);
                    class370.method2440(var21, var18, arg5, var23, arg4 ^ 0x344A0112);
                    class370.method2440(var24, var19, arg5, var22, arg4 - 877265106);
                    class370.method2440(var23, var19, arg1, var24, 116);
                    class370.method2440(var21, var19, arg5, var23, 121);
                } else {
                    int[] var25 = class227.field3201[arg2 + var9];
                    int[] var26 = class227.field3201[arg2 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class370.method2440(var27, var25, arg5, var28, 100);
                    class370.method2440(var27, var26, arg5, var28, 119);
                }
            }
            int[] var29 = class227.field3201[arg2 + var7];
            int[] var30 = class227.field3201[arg2 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var7 >= var8) {
                class370.method2440(var31, var29, arg5, var32, 59);
                class370.method2440(var31, var30, arg5, var32, 72);
            } else {
                int var33 = var11 < var7 ? class348.field5172[var7] : var11;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class370.method2440(var35, var29, arg5, var32, 91);
                class370.method2440(var34, var29, arg1, var35, 73);
                class370.method2440(var31, var29, arg5, var34, 62);
                class370.method2440(var35, var30, arg5, var32, 102);
                class370.method2440(var34, var30, arg1, var35, 57);
                class370.method2440(var31, var30, arg5, var34, 76);
            }
        }
        if (arg4 != 877265224) {
            method984(false, '\u000f', (String) null);
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)J", line = 451)
    public static final long method989(int arg0) {
        if (arg0 != -5) {
            method986((byte) -22);
        }
        field1977++;
        return class232.field3272.method42(30786);
    }
}
