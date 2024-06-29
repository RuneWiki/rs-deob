import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class108 {

    @OriginalMember(owner = "client!jha", name = "l", descriptor = "Lsi;")
    public static class769 field1547 = new class769(4);

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!jha", name = "d", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!jha", name = "e", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!jha", name = "f", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!jha", name = "g", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!jha", name = "i", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!jha", name = "j", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!jha", name = "m", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!jha", name = "n", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!jha", name = "h", descriptor = "Liia;")
    public class538 field1543;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V")
    public static void method863(int arg0) {
        if (arg0 == 2015625216) {
            field1547 = null;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)[Lhk;")
    public static final class153[] method864(byte arg0) {
        field1539++;
        if (arg0 >= -100) {
            method863(-58);
        }
        return new class153[] { class684.field9683, class421.field5844, class687.field9712, class343.field4874, class324.field4599, class185.field2808, class269.field3785, class386.field5402, class703.field9850, class584.field8400, class87.field1298, class48.field676, class435.field6061, class7.field91 };
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILol;)V")
    public final void method865(int arg0, class431 arg1) {
        field1546++;
        if (arg0 != -32680) {
            method864((byte) -59);
        }
        while (true) {
            int var3 = arg1.method2557(14929);
            if (var3 == 0) {
                return;
            }
            this.method870(arg1, (byte) 103, var3);
        }
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(B)Z")
    public static final boolean method866(byte arg0) {
        field1537++;
        if (arg0 > -62) {
            field1547 = null;
        }
        return class141.field2306 >= 1;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIBIIIIIILkn;I)Z")
    public static final boolean method867(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class340 arg9, int arg10) {
        field1542++;
        int var11 = arg4;
        if (arg2 < 25) {
            field1547 = null;
        }
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg4 - var13;
        int var16 = arg7 - var14;
        class663.field9341[var13][var14] = 99;
        class336.field4774[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class249.field3576[var17] = arg4;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class368.field5196[var10001] = arg7;
        int[][] var19 = arg9.field4822;
        while (var26 != var18) {
            var11 = class249.field3576[var18];
            var12 = class368.field5196[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg9.field4824;
            int var23 = var12 - arg9.field4837;
            if (arg3 == -4) {
                if (arg8 == var11 && arg6 == var12) {
                    class510.field7006 = var11;
                    class6.field85 = var12;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class68.method660(arg8, true, arg6, var12, arg5, arg10, 2, var11, 2)) {
                    class6.field85 = var12;
                    class510.field7006 = var11;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg9.method2078(2, 89, 2, var12, var11, arg10, arg5, arg6, arg0, arg8)) {
                    class6.field85 = var12;
                    class510.field7006 = var11;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg9.method2090(2, var11, arg5, arg10, true, arg6, arg0, arg8, var12)) {
                    class510.field7006 = var11;
                    class6.field85 = var12;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg9.method2094(2, -96, arg3, arg6, arg1, arg8, var11, var12)) {
                    class6.field85 = var12;
                    class510.field7006 = var11;
                    return true;
                }
            } else if (arg9.method2077(var12, arg3, arg1, 2, arg8, arg6, -25, var11)) {
                class510.field7006 = var11;
                class6.field85 = var12;
                return true;
            }
            int var25 = class336.field4774[var21][var20] + 1;
            if (var21 > 0 && class663.field9341[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class249.field3576[var26] = var11 - 1;
                class368.field5196[var26] = var12;
                class663.field9341[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class336.field4774[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class663.field9341[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class249.field3576[var26] = var11 + 1;
                class368.field5196[var26] = var12;
                class663.field9341[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class336.field4774[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class663.field9341[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class249.field3576[var26] = var11;
                class368.field5196[var26] = var12 - 1;
                class663.field9341[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class336.field4774[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class663.field9341[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class249.field3576[var26] = var11;
                class368.field5196[var26] = var12 + 1;
                class663.field9341[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class336.field4774[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class663.field9341[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class249.field3576[var26] = var11 - 1;
                class368.field5196[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class663.field9341[var21 - 1][var20 - 1] = 3;
                class336.field4774[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class663.field9341[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class249.field3576[var26] = var11 + 1;
                class368.field5196[var26] = var12 - 1;
                class663.field9341[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class336.field4774[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class663.field9341[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class249.field3576[var26] = var11 - 1;
                class368.field5196[var26] = var12 + 1;
                class663.field9341[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class336.field4774[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class663.field9341[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class249.field3576[var26] = var11 + 1;
                class368.field5196[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class663.field9341[var21 + 1][var20 + 1] = 12;
                class336.field4774[var21 + 1][var20 + 1] = var25;
            }
        }
        class510.field7006 = var11;
        class6.field85 = var12;
        return false;
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(I)Lde;")
    public final synchronized class418 method868(int arg0) {
        if (arg0 != 6877) {
            this.method868(-121);
        }
        field1545++;
        class418 var2 = (class418) this.field1543.field7481.method2882((long) this.field1536, (byte) -128);
        if (var2 != null) {
            return var2;
        }
        class418 var3 = class418.method2468(this.field1543.field7475, this.field1536, 0);
        if (var3 != null) {
            this.field1543.field7481.method2890(arg0 ^ 0xFFFFF9A8, (long) this.field1536, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Z)V")
    public static final void method869(boolean arg0) {
        class75.method690(arg0, 11);
        field1538++;
        class406.method2401((byte) 120);
        System.gc();
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lol;BI)V")
    private final void method870(class431 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field1536 = arg0.method2565((byte) -124);
        } else if (arg2 == 2) {
            this.field1548 = arg0.method2557(14929);
            this.field1540 = arg0.method2557(14929);
        }
        if (arg1 > 101) {
            field1549++;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method871(String arg0, int arg1) {
        field1541++;
        if (arg1 <= 14) {
            field1547 = null;
        }
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class147.method1160(-124, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class381.field5340; var3++) {
            String var4 = class586.field8428[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class147.method1160(-121, var4);
            if (var5 != null && var5.equals(var2)) {
                class381.field5340--;
                for (int var6 = var3; var6 < class381.field5340; var6++) {
                    class586.field8428[var6] = class586.field8428[var6 + 1];
                    class713.field9952[var6] = class713.field9952[var6 + 1];
                    class276.field3930[var6] = class276.field3930[var6 + 1];
                    class322.field4583[var6] = class322.field4583[var6 + 1];
                    class724.field10090[var6] = class724.field10090[var6 + 1];
                    class729.field10167[var6] = class729.field10167[var6 + 1];
                }
                class454.field6217++;
                class732.field10182 = class745.field10359;
                class302 var7 = class582.method3419(class657.field9272, (byte) 127, class626.field8901);
                var7.field4341.method2524(false, class389.method2339(arg0, true));
                var7.field4341.method2566(-2, arg0);
                class501.method2928(0, var7);
                return;
            }
        }
    }
}
