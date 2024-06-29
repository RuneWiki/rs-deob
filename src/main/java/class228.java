import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class228 extends class20 {

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    private int field3524;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    private int field3541;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    private int field3538;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    private int field3529;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3523 = 64;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "J")
    public static long field3536 = 0L;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3535 = "skill: ";

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "[I")
    public static int[] field3537 = new int[128];

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Z")
    public static boolean field3534 = true;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Luc;")
    public static class190 field3527;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Llb;")
    public static class211 field3530;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "[Lsd;")
    public static class27[] field3528;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIBZ[Lal;IIII[BI)V", line = 9)
    public static final void method1618(int arg0, int arg1, byte arg2, boolean arg3, class323[] arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        int var11 = -1;
        class35 var12 = new class35(arg9);
        while (true) {
            int var13 = var12.method283(-3);
            if (var13 == 0) {
                field3521++;
                if (arg2 != -70) {
                    method1620((byte) 67);
                }
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method241(arg2 ^ 0xFFFFFFBA);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFDC) >> 6;
                int var18 = var14 >> 12;
                int var19 = var12.method273(arg2 ^ 0xFFFF00BA);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg0 == var18 && arg6 <= var17 && (arg6 + 8) > var17 && arg7 <= var16 && arg7 + 8 > var16) {
                    class101 var22 = class281.method1984(var11, false);
                    int var23 = arg10 + method1623(var22.field1524, var21, var17 & 0x7, var16 & 0x7, 25436, arg8, var22.field1533);
                    int var24 = class111.method881(false, arg8, var22.field1524, var22.field1533, var21, var17 & 0x7, var16 & 0x7) + arg5;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class323 var25 = null;
                        if (!arg3) {
                            int var26 = arg1;
                            if ((class208.field3272[1][var23][var24] & 0x2) == 2) {
                                var26 = arg1 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg4[var26];
                            }
                        }
                        class324.method2230(var11, arg3, var20, !arg3, var25, arg8 + var21 & 0x3, arg1, arg2 ^ 0xFFFFFFC0, var23, var24, arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V", line = 95)
    public final void method139(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field3535 = (String) null;
        }
        field3522++;
        int var4 = this.field3538 * arg1 >> 12;
        int var5 = this.field3524 * arg1 >> 12;
        int var6 = this.field3541 * arg0 >> 12;
        int var7 = this.field3529 * arg0 >> 12;
        class312.method2152(this.field224, var4, var5, var6, var7, (byte) 77);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V", line = 113)
    public static final void method1619(int arg0, int arg1) {
        field3540++;
        class193.field3086.method1429((byte) 127, arg0);
        class81.field1127.method1429((byte) 127, arg0);
        if (arg1 > -113) {
            method1623(-65, 59, -26, 27, 30, 28, 91);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 125)
    public static void method1620(byte arg0) {
        if (arg0 != -98) {
            field3527 = (class190) null;
        }
        field3530 = null;
        field3535 = null;
        field3527 = null;
        field3537 = null;
        field3528 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBI)V", line = 139)
    public final void method143(int arg0, byte arg1, int arg2) {
        field3531++;
        if (arg1 >= -52) {
            field3527 = (class190) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(BII)V", line = 153)
    public static final void method1621(byte arg0, int arg1, int arg2) {
        int var3 = -46 % ((arg0 - 18) / 53);
        for (int var4 = 0; var4 < class62.field934; var4++) {
            class319 var5 = class116.method904((byte) 89, var4);
            if (var5 != null) {
                int var6 = var5.field4966;
                if (var6 >= 0 && !class56.field829.method1737(0, var6)) {
                    var6 = -1;
                }
                int var10;
                if (var5.field4979 >= 0) {
                    int var7 = var5.field4979;
                    int var8 = (var7 & 0x7F) + arg2;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg1 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var10 = class56.field832[class28.method191(-116, 96, var9)];
                } else if (var6 >= 0) {
                    var10 = class56.field832[class28.method191(-103, 96, class56.field829.method1744(-65536, var6))];
                } else if (var5.field4977 == -1) {
                    var10 = -1;
                } else {
                    int var11 = var5.field4977;
                    int var12 = (var11 & 0x7F) + arg2;
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 127) {
                        var12 = 127;
                    }
                    int var13 = (var11 & 0x380) + ((var11 + arg1 & 0xFC00) + var12);
                    var10 = class56.field832[class28.method191(-110, 96, var13)];
                }
                class279.field4294[var4 + 1] = var10;
            }
        }
        field3525++;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIIIII)V", line = 225)
    public class228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3524 = arg0;
        this.field3541 = arg3;
        this.field3538 = arg2;
        this.field3529 = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BII)V", line = 238)
    public final void method144(byte arg0, int arg1, int arg2) {
        field3533++;
        if (arg0 <= 116) {
            method1619(-40, 94);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)I", line = 251)
    public static final int method1622(int arg0, boolean arg1) {
        if (arg1) {
            field3526++;
            return arg0 & 0x7F;
        } else {
            return -90;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIII)I", line = 283)
    private static final int method1623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg0;
            arg0 = var7;
        }
        int var8 = arg5 & 0x3;
        field3532++;
        if (arg4 != 25436) {
            return 30;
        } else if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg6;
        } else {
            return 1 + 7 - arg0 - arg3;
        }
    }
}
