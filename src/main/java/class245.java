import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class class245 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public int field3529;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field3531 = 0;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "Laq;")
    public static class141 field3536;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
    public static void method1549(boolean arg0) {
        if (!arg0) {
            field3537 = -124;
        }
        field3536 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIB)V")
    public static final void method1550(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 39) {
            method1555(116, 0, -104, 125, 13, null, 10, -40, true, null, 34, -54, 53, null, 75);
        }
        field3535++;
        if (class56.field668.field6840 != 0 && arg3 != 0 && class359.field4885 < 50 && arg0 != -1) {
            class378.field5206[class359.field4885++] = new class300((byte) 1, arg0, arg3, arg2, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
    public static final boolean method1551(int arg0, int arg1, int arg2) {
        field3533++;
        if (arg1 != -1) {
            field3531 = 115;
        }
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZZIII)V")
    public static final void method1552(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class187.method1288(class348.field4775.length - 1, arg1, 57, 0, arg0, arg4, arg3);
        field3528++;
        class336.field4650 = 0;
        if (arg2 != 315) {
            method1551(-15, 33, -4);
        }
        class418.field5656 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public static final void method1553(byte arg0) {
        if (arg0 != 110) {
            method1554(null, 72, true, null);
        }
        class487.field6924 = true;
        field3530++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([BIZLjava/lang/String;)I")
    public static final int method1554(byte[] arg0, int arg1, boolean arg2, String arg3) {
        field3534++;
        int var4 = arg1;
        if (!arg2) {
            method1551(101, -86, -113);
        }
        int var5 = arg3.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class601.method3547(-1449, arg3.charAt(var6));
            int var8 = var5 > (var6 + 1) ? class601.method3547(-1449, arg3.charAt(var6 + 1)) : -1;
            int var9 = var5 <= (var6 + 2) ? -1 : class601.method3547(-1449, arg3.charAt(var6 + 2));
            int var10 = var5 <= (var6 + 3) ? -1 : class601.method3547(-1449, arg3.charAt(var6 + 3));
            arg0[arg1++] = (byte) class473.method2847(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg0[arg1++] = (byte) class473.method2847(class37.method245(var8, 15) << 4, var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg0[arg1++] = (byte) class473.method2847(class37.method245(var9 << 6, 192), var10);
        }
        return arg1 - var4;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIII[IIIZLvba;III[II)I")
    public static final int method1555(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, boolean arg8, class37 arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var36 = 0; var36 < 128; var36++) {
                class507.field7198[var15][var36] = 0;
                class476.field6739[var15][var36] = 99999999;
            }
        }
        field3532++;
        boolean var16;
        if (arg14 == 1) {
            var16 = class100.method762(arg0, arg9, arg6, arg4, arg3, arg10, (byte) -25, arg2, arg11, arg1, arg12);
        } else if (arg14 == 2) {
            var16 = class458.method2776(arg12, arg0, 31516, arg11, arg9, arg10, arg2, arg3, arg1, arg6, arg4);
        } else {
            var16 = class392.method2332(arg14, arg4, arg0, arg9, arg10, arg12, -28421, arg2, arg1, arg6, arg11, arg3);
        }
        int var17 = arg12 - 64;
        int var18 = arg4 - 64;
        int var19 = class330.field4554;
        int var20 = class37.field455;
        if (!var16) {
            if (!arg8) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg3 - var23; var24 <= (arg3 + var23); var24++) {
                for (int var25 = arg1 - var23; var25 <= (arg1 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class476.field6739[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg3 > var24) {
                            var28 = arg3 - var24;
                        } else if (arg6 + arg3 - 1 < var24) {
                            var28 = var24 + 1 - (arg3 + arg6);
                        }
                        int var29 = 0;
                        if (arg1 > var25) {
                            var29 = arg1 - var25;
                        } else if (arg1 + arg11 - 1 < var25) {
                            var29 = var25 - arg11 - (arg1 - 1);
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var21 > var30 || var21 == var30 && class476.field6739[var26][var27] < var22) {
                            var19 = var24;
                            var20 = var25;
                            var22 = class476.field6739[var26][var27];
                            var21 = var30;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg12 == var19 && arg4 == var20) {
            return 0;
        }
        byte var31 = 0;
        int var32 = 111 % ((-arg7 - 55) / 58);
        class513.field7320[var31] = var19;
        int var38 = var31 + 1;
        class59.field745[var31] = var20;
        int var33;
        int var34 = var33 = class507.field7198[var19 - var17][var20 - var18];
        while (arg12 != var19 || arg4 != var20) {
            if (var33 != var34) {
                var33 = var34;
                class513.field7320[var38] = var19;
                class59.field745[var38++] = var20;
            }
            if ((var34 & 0x1) != 0) {
                var20++;
            } else if ((var34 & 0x4) != 0) {
                var20--;
            }
            if ((var34 & 0x2) != 0) {
                var19++;
            } else if ((var34 & 0x8) != 0) {
                var19--;
            }
            var34 = class507.field7198[var19 - var17][var20 - var18];
        }
        int var35 = 0;
        while ((var38--) > 0) {
            arg5[var35] = class513.field7320[var38];
            arg13[var35++] = class59.field745[var38];
            if (arg5.length <= var35) {
                break;
            }
        }
        return var35;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(III)V")
    public class245(int arg0, int arg1, int arg2) {
        this.field3526 = arg0;
        this.field3527 = arg2;
        this.field3529 = arg1;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BII)V")
    public abstract void method1352(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(III)V")
    public abstract void method1351(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBI)V")
    public abstract void method1350(int arg0, byte arg1, int arg2);

    static {
        new class572("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field3536 = new class141(3);
    }
}
