import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class127 extends class60 implements class116 {

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "Z")
    private boolean field1551;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "Z")
    private boolean field1546;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "B")
    private byte field1552;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "B")
    private byte field1558;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "S")
    private short field1557;

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "Z")
    private boolean field1564;

    @OriginalMember(owner = "client!ao", name = "W", descriptor = "Z")
    private boolean field1574;

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "Lph;")
    private class125 field1570;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "Lqh;")
    private class352 field1566;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "Lec;")
    public static class40 field1554 = new class40("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ao", name = "V", descriptor = "Luo;")
    public static class418 field1573;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "Z")
    public static boolean field1559;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(ILoj;)Lmg;")
    public final class451 method19(int arg0, class280 arg1) {
        ++field1548;
        if (this.field1566 == null) {
            return null;
        } else {
            class327 var3 = arg1.method1456();
            if (arg0 <= 95) {
                this.field1558 = -39;
            }
            var3.method553(super.field749, super.field748, super.field750);
            class451 var4 = null;
            if (this.field1564) {
                var4 = class134.method638(762096108, 1);
            }
            this.field1566.method1716(var3, var4 != null ? var4.field6379[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method603(String arg0, boolean arg1) {
        ++field1550;
        if (arg0 == null) {
            return false;
        } else if (!arg1) {
            return true;
        } else {
            for (int var2 = 0; class414.field5907 > var2; ++var2) {
                if (arg0.equalsIgnoreCase(class283.field4121[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class308.field4526[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILoj;)V")
    public final void method20(int arg0, class280 arg1) {
        ++field1561;
        if (arg0 != 5744) {
            this.field1546 = false;
        }
        Object var3 = null;
        class125 var5;
        if (this.field1570 == null && this.field1574) {
            class324 var4 = this.method604(arg1, true, 131072, -5732);
            var5 = var4 != null ? var4.field4676 : null;
        } else {
            var5 = this.field1570;
            this.field1570 = null;
        }
        if (var5 != null) {
            class47.method249(var5, this.field1552, super.field749, super.field750, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)I")
    public final int method26(byte arg0) {
        if (arg0 != 73) {
            method607(72, 80, -72, 47, 47, 59, 47);
        }
        ++field1555;
        return 22;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)Z")
    public final boolean method33(int arg0) {
        ++field1560;
        if (arg0 != 1957) {
            this.field1570 = null;
        }
        return this.field1551;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Loj;ZII)Lpr;")
    private final class324 method604(class280 arg0, boolean arg1, int arg2, int arg3) {
        ++field1565;
        if (arg3 != -5732) {
            return null;
        } else {
            class415 var5 = class173.field2084.method2297(arg3 ^ -5714, 65535 & this.field1557);
            class443 var6;
            class443 var7;
            if (this.field1546) {
                var6 = class361.field5208[this.field1552];
                var7 = class443.field6329[0];
            } else {
                if (this.field1552 < 3) {
                    var7 = class443.field6329[this.field1552 + 1];
                } else {
                    var7 = null;
                }
                var6 = class443.field6329[this.field1552];
            }
            return var5.method2466(var6, var7, 22, arg1, this.field1558, super.field749, (byte) 102, super.field748, super.field750, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)Z")
    public final boolean method22(int arg0) {
        if (arg0 >= -32) {
            return true;
        } else {
            ++field1547;
            return this.field1574;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILoj;B)Lqh;")
    public final class352 method21(int arg0, class280 arg1, byte arg2) {
        if (arg2 != -98) {
            return null;
        } else {
            ++field1567;
            return this.method606(arg1, 114, arg0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        ++field1571;
        if (this.field1566 != null) {
            this.field1566.method1722();
        }
        if (arg0 <= 41) {
            this.field1552 = -126;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILoj;II)Z")
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        if (arg3 != -6085) {
            this.method23(-127, 118, false, (class78) null, 13, (byte) 54, (class280) null);
        }
        ++field1563;
        class352 var5 = this.method606(arg1, 115, 65536);
        if (var5 != null) {
            class327 var6 = arg1.method1456();
            var6.method553(super.field749, super.field748, super.field750);
            return var5.method1695(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "(I)V")
    public static void method605(int arg0) {
        field1573 = null;
        field1554 = null;
        if (arg0 != 0) {
            field1554 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Loj;II)Lqh;")
    private final class352 method606(class280 arg0, int arg1, int arg2) {
        if (arg1 < 112) {
            this.method18(-75, (class280) null);
        }
        ++field1549;
        if (this.field1566 != null && arg0.method1473(this.field1566.method1719(), arg2) == 0) {
            return this.field1566;
        } else {
            class324 var4 = this.method604(arg0, false, arg2, -5732);
            return var4 == null ? null : var4.field4681;
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
    public final void method32(int arg0) {
        ++field1556;
        this.field1551 = false;
        if (this.field1566 != null) {
            this.field1566.method1732(this.field1566.method1719() & -32769);
        }
        if (arg0 != -2) {
            field1559 = true;
        }
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(ILoj;)V")
    public final void method27(int arg0, class280 arg1) {
        ++field1545;
        if (arg0 != 0) {
            this.field1551 = false;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)I")
    public final int method16(boolean arg0) {
        ++field1553;
        return arg0 ? -44 : 65535 & this.field1557;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZLa;IBLoj;)V")
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        if (arg5 != -65) {
            this.method19(-119, (class280) null);
        }
        if (arg3 instanceof class127) {
            class127 var8 = (class127) arg3;
            if (this.field1566 != null && var8.field1566 != null) {
                this.field1566.method1745(var8.field1566, arg0, arg1, arg4, arg2);
            }
        }
        ++field1569;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(ILoj;)V")
    public final void method18(int arg0, class280 arg1) {
        int var3 = -115 / ((62 - arg0) / 63);
        ++field1568;
        Object var4 = null;
        class125 var6;
        if (this.field1570 == null && this.field1574) {
            class324 var5 = this.method604(arg1, true, 131072, -5732);
            var6 = var5 == null ? null : var5.field4676;
        } else {
            var6 = this.field1570;
            this.field1570 = null;
        }
        if (var6 != null) {
            class200.method1098(var6, this.field1552, super.field749, super.field750, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Loj;Lcu;IIIIZIZ)V")
    public class127(class280 arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field5944, arg1.field5988);
        super.field750 = (short) arg5;
        this.field1551 = arg8;
        super.field749 = (short) arg3;
        this.field1546 = arg6;
        this.field1552 = (byte) arg2;
        this.field1558 = (byte) arg7;
        this.field1557 = (short) arg1.field5918;
        this.field1564 = ~arg1.field5990 != -1 && !arg6;
        this.field1574 = arg0.method1474() && arg1.field5960 && !this.field1546 && class427.field6166 != 0;
        int var10 = 1024;
        if (this.field1551) {
            var10 |= 32768;
        }
        class324 var11 = this.method604(arg0, this.field1574, var10, -5732);
        if (var11 != null) {
            this.field1570 = var11.field4676;
            this.field1566 = var11.field4681;
            if (this.field1551) {
                this.field1566 = this.field1566.method1749((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)I")
    public final int method31(byte arg0) {
        ++field1572;
        int var2 = 54 / ((arg0 - -23) / 35);
        return this.field1558;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
    public static final void method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1562;
        class369.method2235(arg3, 98);
        if (arg1 > -111) {
            method605(109);
        }
        int var7 = 0;
        int var8 = -arg6 + arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class240.field3303[arg4];
        int var16 = -var8 + arg5;
        class270.method1633(var15, var16, arg0, -arg3 + arg5, 105);
        int var17 = arg5 + var8;
        class270.method1633(var15, var17, arg2, var16, 106);
        class270.method1633(var15, arg3 + arg5, arg0, var17, 119);
        while (~var7 > ~var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && ~var11 <= -2) {
                class88.field1096[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                var10 -= var9 << 1;
                if (~var8 < ~var9) {
                    int[] var18 = class240.field3303[arg4 + var9];
                    int[] var19 = class240.field3303[arg4 - var9];
                    int var20 = class88.field1096[var9];
                    int var21 = arg5 + var7;
                    int var22 = -var7 + arg5;
                    int var23 = arg5 - -var20;
                    int var24 = -var20 + arg5;
                    class270.method1633(var18, var24, arg0, var22, 110);
                    class270.method1633(var18, var23, arg2, var24, 106);
                    class270.method1633(var18, var21, arg0, var23, 105);
                    class270.method1633(var19, var24, arg0, var22, 109);
                    class270.method1633(var19, var23, arg2, var24, 103);
                    class270.method1633(var19, var21, arg0, var23, 104);
                } else {
                    int[] var25 = class240.field3303[arg4 - -var9];
                    int[] var26 = class240.field3303[-var9 + arg4];
                    int var27 = arg5 + var7;
                    int var28 = -var7 + arg5;
                    class270.method1633(var25, var27, arg0, var28, 126);
                    class270.method1633(var26, var27, arg0, var28, 106);
                }
            }
            int[] var29 = class240.field3303[arg4 + var7];
            int[] var30 = class240.field3303[arg4 - var7];
            int var31 = arg5 + var9;
            int var32 = -var9 + arg5;
            if (~var8 < ~var7) {
                int var33 = var11 < var7 ? class88.field1096[var7] : var11;
                int var34 = arg5 + var33;
                int var35 = -var33 + arg5;
                class270.method1633(var29, var35, arg0, var32, 112);
                class270.method1633(var29, var34, arg2, var35, 124);
                class270.method1633(var29, var31, arg0, var34, 127);
                class270.method1633(var30, var35, arg0, var32, 126);
                class270.method1633(var30, var34, arg2, var35, 98);
                class270.method1633(var30, var31, arg0, var34, 112);
            } else {
                class270.method1633(var29, var31, arg0, var32, 90);
                class270.method1633(var30, var31, arg0, var32, 112);
            }
        }
    }
}
