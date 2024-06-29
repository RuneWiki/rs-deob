import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class4 extends class456 {

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "[I")
    public static int[] field76 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "Lfa;")
    public static class371 field82;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Lo;")
    public static class332 field83;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "Lct;")
    public static class285 field84;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "[I")
    public static int[] field87;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "Ljb;")
    public static class350 field80;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILje;IB)V")
    public static final void method30(int arg0, class178 arg1, int arg2, byte arg3) {
        if (arg3 != -16) {
            field86 = 64;
        }
        if (arg1.field2579 != 0) {
            if (~arg1.field2579 == -2) {
                arg1.field2648 = (arg0 - arg1.field2589) / 2 + arg1.field2615;
            } else if (arg1.field2579 == 2) {
                arg1.field2648 = -arg1.field2589 + arg0 + -arg1.field2615;
            } else if (arg1.field2579 == 3) {
                arg1.field2648 = arg1.field2615 * arg0 >> 14;
            } else if (~arg1.field2579 != -5) {
                arg1.field2648 = -arg1.field2589 + arg0 + -(arg1.field2615 * arg0 >> 14);
            } else {
                arg1.field2648 = (arg0 - arg1.field2589) / 2 - -(arg1.field2615 * arg0 >> 14);
            }
        } else {
            arg1.field2648 = arg1.field2615;
        }
        ++field81;
        if (~arg1.field2581 == -1) {
            arg1.field2593 = arg1.field2518;
        } else if (arg1.field2581 == 1) {
            arg1.field2593 = (arg2 - arg1.field2595) / 2 - -arg1.field2518;
        } else if (~arg1.field2581 == -3) {
            arg1.field2593 = -arg1.field2595 + arg2 - arg1.field2518;
        } else if (~arg1.field2581 == -4) {
            arg1.field2593 = arg1.field2518 * arg2 >> 14;
        } else if (arg1.field2581 == 4) {
            arg1.field2593 = (arg2 - arg1.field2595) / 2 - -(arg1.field2518 * arg2 >> 14);
        } else {
            arg1.field2593 = arg2 - (arg1.field2518 * arg2 >> 14) + -arg1.field2595;
        }
        if (class365.field5528) {
            if (~client.method2777(arg1).field2506 == -1 && ~arg1.field2655 != -1) {
                return;
            }
            if (~arg1.field2593 > -1) {
                arg1.field2593 = 0;
            } else if (~(arg1.field2595 + arg1.field2593) < ~arg2) {
                arg1.field2593 = arg2 - arg1.field2595;
            }
            if (~arg1.field2648 > -1) {
                arg1.field2648 = 0;
                return;
            }
            if (~(arg1.field2648 + arg1.field2589) < ~arg0) {
                arg1.field2648 = -arg1.field2589 + arg0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
    public static final void method31(byte arg0) {
        ++field79;
        if (class147.field2072 > 0) {
            class38.method295(79);
        } else {
            class82.field1161 = class27.field335;
            class27.field335 = null;
            class144.method987((byte) 29, 40);
            if (arg0 < 51) {
                field80 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIBIIII)V")
    public static final void method32(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field77;
        int var7 = arg1 + arg6;
        int var8 = -arg1 + arg4;
        for (int var9 = arg6; ~var7 < ~var9; ++var9) {
            class345.method2125(false, class49.field723[var9], arg0, arg5, arg3);
        }
        int var10 = -arg1 + arg5;
        if (arg2 > -60) {
            field85 = -77;
        }
        for (int var11 = arg4; var8 < var11; --var11) {
            class345.method2125(false, class49.field723[var11], arg0, arg5, arg3);
        }
        int var12 = arg0 - -arg1;
        for (int var13 = var7; ~var13 >= ~var8; ++var13) {
            int[] var14 = class49.field723[var13];
            class345.method2125(false, var14, arg0, var12, arg3);
            class345.method2125(false, var14, var10, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field78;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            int[][] var4 = this.method2709(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class156.field2169 < ~var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        if (arg0 != -1) {
            method32(56, 35, (byte) -11, 11, 84, -126, -126);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V")
    public static void method34(int arg0) {
        field80 = null;
        int var1 = -111 % ((-31 - arg0) / 44);
        field82 = null;
        field87 = null;
        field84 = null;
        field83 = null;
        field76 = null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class4() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method35(int arg0, String arg1) {
        ++field75;
        if (arg1 != null) {
            if ((class157.field2190 < 100 || class419.field6026) && ~class157.field2190 > -201) {
                String var2 = class226.method1463(-1, arg1);
                if (var2 != null) {
                    for (int var3 = 0; var3 < class157.field2190; ++var3) {
                        String var8 = class226.method1463(-1, class42.field570[var3]);
                        if (var8 != null && var8.equals(var2)) {
                            class453.method2696(126, arg1 + class180.field2678.method2036(field85, (byte) -21));
                            return;
                        }
                        if (class310.field4681[var3] != null) {
                            String var9 = class226.method1463(-1, class310.field4681[var3]);
                            if (var9 != null && var9.equals(var2)) {
                                class453.method2696(127, arg1 + class180.field2678.method2036(field85, (byte) -21));
                                return;
                            }
                        }
                    }
                    int var4 = 12 % ((-55 - arg0) / 38);
                    for (int var5 = 0; var5 < class330.field4951; ++var5) {
                        String var6 = class226.method1463(-1, class436.field6168[var5]);
                        if (var6 != null && var6.equals(var2)) {
                            class453.method2696(126, class322.field4846.method2036(field85, (byte) -21) + arg1 + class58.field810.method2036(field85, (byte) -21));
                            return;
                        }
                        if (class68.field930[var5] != null) {
                            String var7 = class226.method1463(-1, class68.field930[var5]);
                            if (var7 != null && var7.equals(var2)) {
                                class453.method2696(125, class322.field4846.method2036(field85, (byte) -21) + arg1 + class58.field810.method2036(field85, (byte) -21));
                                return;
                            }
                        }
                    }
                    if (class226.method1463(-1, class472.field6622.field3839).equals(var2)) {
                        class453.method2696(-45, class124.field1708.method2036(field85, (byte) -21));
                    } else {
                        class378.method2320(class68.field919, (byte) 119);
                        ++class426.field6083;
                        class230.field3390.method2619((byte) 3, class330.method2021((byte) 113, arg1));
                        class230.field3390.method2597(arg1, (byte) -107);
                    }
                }
            } else {
                class453.method2696(-96, class478.field6713.method2036(field85, (byte) -21));
            }
        }
    }

    static {
        new class332(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field82 = new class371(16);
        field83 = new class332("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");
        field85 = 0;
        field84 = new class285(78, 8);
        field86 = 503;
        field87 = new int[50];
    }
}
