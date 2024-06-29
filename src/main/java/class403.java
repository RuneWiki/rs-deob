import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class403 extends class468 implements class534 {

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "Z")
    private boolean field5724;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "B")
    private byte field5745;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "B")
    private byte field5732;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "S")
    private short field5743;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "B")
    private byte field5733;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "Z")
    private boolean field5734;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "Z")
    private boolean field5725;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "Z")
    private boolean field5748;

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "Lia;")
    private class424 field5756;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "Lka;")
    public class336 field5751;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field5727 = 500;

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
    public static int field5755 = 0;

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "Lbd;")
    public static class44 field5740 = new class44("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "F")
    public static float field5737;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!wm", name = "W", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "Lem;")
    private class154 field5744;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "Lci;")
    public static class320 field5752;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILqa;I)Lka;")
    public final class336 method550(int arg0, class167 arg1, int arg2) {
        ++field5726;
        if (arg0 != -14322) {
            method2407(47, -46, -89, 68, -6, 65, 48, -29);
        }
        return this.method2408((byte) 113, arg2, arg1);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lqa;I)V")
    public final void method551(class167 arg0, int arg1) {
        ++field5730;
        Object var3 = null;
        class424 var5;
        if (this.field5756 == null && this.field5748) {
            class335 var4 = this.method2409(true, arg0, (byte) -103, 262144);
            var5 = var4 == null ? null : var4.field4962;
        } else {
            var5 = this.field5756;
            this.field5756 = null;
        }
        if (arg1 >= 62) {
            if (var5 != null) {
                class359.method2231(var5, this.field5732, super.field6793, super.field6799, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        ++field5758;
        class336 var5 = this.method2408((byte) -19, 131072, arg3);
        if (arg2 <= 42) {
            this.field5751 = null;
        }
        if (var5 != null) {
            class15 var6 = arg3.method312();
            var6.method47(super.field6793, super.field6791, super.field6799);
            return var5.method1131(arg1, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
    public final void method549(boolean arg0) {
        this.field5724 = arg0;
        ++field5750;
        if (this.field5751 != null) {
            this.field5751.method1133(this.field5751.method1166() & -65537);
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(Lqa;B)Lem;")
    public final class154 method562(class167 arg0, byte arg1) {
        ++field5749;
        if (this.field5744 == null) {
            this.field5744 = class332.method2104(super.field6791, this.method2408((byte) -36, 0, arg0), super.field6799, super.field6793, 126);
        }
        if (arg1 >= -117) {
            this.method561((byte) 35);
        }
        return this.field5744;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)I")
    public final int method561(byte arg0) {
        ++field5757;
        if (arg0 != -85) {
            this.method2408((byte) 75, -36, (class167) null);
        }
        return 65535 & this.field5743;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)I")
    public final int method560(int arg0) {
        ++field5753;
        if (arg0 != -29863) {
            this.method553(-4, -110, -122, (class167) null);
        }
        return this.field5733;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lqa;B)V")
    public final void method552(class167 arg0, byte arg1) {
        if (arg1 > -119) {
            this.method552((class167) null, (byte) -57);
        }
        ++field5754;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5747;
        int var8 = 0;
        if (arg6 != -2133273151) {
            field5740 = null;
        }
        int var9 = arg3;
        int var10 = 0;
        int var11 = -arg1 + arg5;
        int var12 = -arg1 + arg3;
        int var13 = arg5 * arg5;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 - -var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 + -1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg3 + -1) * var27;
        int var37 = var30;
        if (~class424.field5996 >= ~arg0 && class333.field4936 >= arg0) {
            int[] var38 = class271.field4078[arg0];
            int var39 = class252.method1631(class176.field2630, class465.field6763, -arg5 + arg4, -97);
            int var40 = class252.method1631(class176.field2630, class465.field6763, arg4 + arg5, -125);
            int var41 = class252.method1631(class176.field2630, class465.field6763, -var11 + arg4, -60);
            int var42 = class252.method1631(class176.field2630, class465.field6763, arg4 - -var11, arg6 + 2133273070);
            class479.method2839(var41, var39, var38, arg6 + 2133273213, arg2);
            class479.method2839(var42, var41, var38, 126, arg7);
            class479.method2839(var40, var42, var38, 76, arg2);
        }
        int var43 = (var12 + -1) * var29;
        while (var9 > 0) {
            boolean var44 = ~var12 <= ~var9;
            if (~var23 > -1) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    ++var8;
                }
            }
            if (var44) {
                if (~var25 > -1) {
                    while (~var25 > -1) {
                        var25 += var33;
                        var26 += var37;
                        ++var10;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    ++var10;
                }
                var25 += -var43;
                var26 += -var34;
                var34 -= var29;
                var43 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                ++var8;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var36 -= var27;
            --var9;
            int var45 = -var9 + arg0;
            int var46 = arg0 + var9;
            if (class424.field5996 <= var46 && var45 <= class333.field4936) {
                int var47 = class252.method1631(class176.field2630, class465.field6763, arg4 - -var8, -92);
                int var48 = class252.method1631(class176.field2630, class465.field6763, -var8 + arg4, arg6 ^ 2133273105);
                if (!var44) {
                    if (~class424.field5996 >= ~var45) {
                        class479.method2839(var47, var48, class271.field4078[var45], 73, arg2);
                    }
                    if (class333.field4936 >= var46) {
                        class479.method2839(var47, var48, class271.field4078[var46], 67, arg2);
                    }
                } else {
                    int var49 = class252.method1631(class176.field2630, class465.field6763, arg4 + var10, arg6 ^ 2133273192);
                    int var50 = class252.method1631(class176.field2630, class465.field6763, -var10 + arg4, arg6 ^ 2133273094);
                    if (~class424.field5996 >= ~var45) {
                        int[] var51 = class271.field4078[var45];
                        class479.method2839(var50, var48, var51, 91, arg2);
                        class479.method2839(var49, var50, var51, 122, arg7);
                        class479.method2839(var47, var49, var51, 103, arg2);
                    }
                    if (class333.field4936 >= var46) {
                        int[] var52 = class271.field4078[var46];
                        class479.method2839(var50, var48, var52, 125, arg2);
                        class479.method2839(var49, var50, var52, 106, arg7);
                        class479.method2839(var47, var49, var52, arg6 ^ -2133273157, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)I")
    public final int method559(byte arg0) {
        ++field5731;
        if (arg0 <= 3) {
            this.method553(108, -80, 18, (class167) null);
        }
        return this.field5745;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BILqa;)Lka;")
    private final class336 method2408(byte arg0, int arg1, class167 arg2) {
        ++field5739;
        if (this.field5751 != null && ~arg2.method252(this.field5751.method1166(), arg1) == -1) {
            return this.field5751;
        } else {
            int var4 = 50 / ((53 - arg0) / 35);
            class335 var5 = this.method2409(false, arg2, (byte) -103, arg1);
            return var5 != null ? var5.field4960 : null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZLqa;BI)Lso;")
    private final class335 method2409(boolean arg0, class167 arg1, byte arg2, int arg3) {
        if (arg2 != -103) {
            field5755 = 76;
        }
        ++field5741;
        class261 var5 = class277.field4139.method569((byte) 55, 65535 & this.field5743);
        class24 var6;
        class24 var7;
        if (!this.field5725) {
            if (~this.field5732 > -4) {
                var6 = class393.field5594[this.field5732 + 1];
            } else {
                var6 = null;
            }
            var7 = class393.field5594[this.field5732];
        } else {
            var7 = class477.field6942[this.field5732];
            var6 = class393.field5594[0];
        }
        return var5.method1691(var6, arg1, arg2 ^ -96, super.field6793, var7, this.field5745, arg3, super.field6791, super.field6799, arg0, this.field5733);
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(B)V")
    public static void method2410(byte arg0) {
        field5740 = null;
        field5752 = null;
        if (arg0 > -57) {
            field5740 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLqa;)V")
    public final void method557(byte arg0, class167 arg1) {
        int var3 = 50 % ((13 - arg0) / 59);
        ++field5746;
        Object var4 = null;
        class424 var6;
        if (this.field5756 == null && this.field5748) {
            class335 var5 = this.method2409(true, arg1, (byte) -103, 262144);
            var6 = var5 != null ? var5.field4962 : null;
        } else {
            var6 = this.field5756;
            this.field5756 = null;
        }
        if (var6 != null) {
            class354.method2211(var6, this.field5732, super.field6793, super.field6799, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)Z")
    public final boolean method556(int arg0) {
        if (arg0 != -1) {
            method2411(-18, (String) null);
        }
        ++field5728;
        return this.field5724;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public final void method548(int arg0) {
        if (this.field5751 != null) {
            this.field5751.method1162();
        }
        ++field5736;
        int var2 = -90 % ((arg0 - -37) / 34);
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lqa;Lku;IIIIZIIZ)V")
    public class403(class167 arg0, class261 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class69.method542(false, arg7, arg8));
        this.field5724 = arg9;
        super.field6793 = arg3;
        this.field5745 = (byte) arg7;
        this.field5732 = (byte) arg2;
        this.field5743 = (short) arg1.field3882;
        this.field5733 = (byte) arg8;
        this.field5734 = arg1.field3872 != 0 && !arg6;
        super.field6799 = arg5;
        this.field5725 = arg6;
        this.field5748 = arg0.method346() && arg1.field3929 && !this.field5725 && ~class220.field3371.method1213((byte) -35, class74.field1211) != -1;
        int var11 = 2048;
        if (this.field5724) {
            var11 |= 65536;
        }
        class335 var12 = this.method2409(this.field5748, arg0, (byte) -103, var11);
        if (var12 != null) {
            this.field5756 = var12.field4962;
            this.field5751 = var12.field4960;
            if (this.field5724) {
                this.field5751 = this.field5751.method1154((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)Z")
    public final boolean method547(int arg0) {
        ++field5729;
        int var2 = -78 / ((-73 - arg0) / 39);
        return this.field5748;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2411(int arg0, String arg1) {
        ++field5738;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class274.method1769(0, arg1);
            if (var2 != null) {
                for (int var3 = arg0; ~var3 > ~class8.field71; ++var3) {
                    String var4 = class440.field6273[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class274.method1769(0, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class8.field71;
                        for (int var6 = var3; ~var6 > ~class8.field71; ++var6) {
                            class440.field6273[var6] = class440.field6273[var6 + 1];
                            class277.field4129[var6] = class277.field4129[var6 + 1];
                            class350.field5133[var6] = class350.field5133[var6 - -1];
                            class98.field1540[var6] = class98.field1540[var6 + 1];
                            class313.field4670[var6] = class313.field4670[var6 + 1];
                        }
                        class196.field2864 = class426.field6113;
                        ++class304.field4508;
                        class228.method1528(true, class242.field3636);
                        class276.field4124.method3048(-2034159384, class132.method966(arg1, 10240));
                        class276.field4124.method3057((byte) -28, arg1);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILqa;)Lnj;")
    public final class166 method554(int arg0, class167 arg1) {
        ++field5735;
        if (this.field5751 == null) {
            return null;
        } else {
            class15 var3 = arg1.method312();
            var3.method47(super.field6793, super.field6791, super.field6799);
            class166 var4 = null;
            if (this.field5734) {
                var4 = class392.method2363(arg0 + 3317, 1);
            }
            this.field5751.method1142(var3, var4 == null ? null : var4.field2497[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIILqa;ZLee;Z)V")
    public final void method558(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, class487 arg5, boolean arg6) {
        ++field5742;
        if (arg5 instanceof class403) {
            class403 var8 = (class403) arg5;
            if (this.field5751 != null && var8.field5751 != null) {
                this.field5751.method1157(var8.field5751, arg2, arg0, arg1, arg6);
            }
        } else if (arg5 instanceof class497) {
            class497 var9 = (class497) arg5;
            if (this.field5751 != null && var9.field7198 != null) {
                this.field5751.method1157(var9.field7198, arg2, arg0, arg1, arg6);
            }
        }
        if (arg4) {
            method2411(-55, (String) null);
        }
    }
}
