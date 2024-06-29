import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class17 extends class425 {

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "Ljm;")
    public class162 field225 = new class162();

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "Lvf;")
    public class154 field226 = new class154();

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "Lfl;")
    private class387 field221;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "J")
    public static long field215 = 0L;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lle;")
    public static class65 field217 = new class65(64);

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)Z")
    public static final boolean method94(boolean arg0) {
        if (!arg0) {
            return false;
        }
        field216++;
        if (class95.field1316) {
            try {
                class9.method49(class122.field1839.field1086, "showVideoAd", -128);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lrg;ILjava/lang/String;)I")
    public static final int method95(class366 arg0, int arg1, String arg2) {
        field218++;
        if (arg1 != 1048575) {
            method102(true, (class58) null, (class108) null);
        }
        int var3 = arg0.field5048;
        byte[] var4 = class393.method2440(false, arg2);
        arg0.method2284((byte) 125, var4.length);
        arg0.field5048 += class129.field1951.method317(1, arg0.field5076, 0, var4, arg0.field5048, var4.length);
        return arg0.field5048 - var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII[ILil;)V")
    private final void method96(int arg0, int arg1, int arg2, int arg3, int[] arg4, class266 arg5) {
        if (arg1 != 262144) {
            this.field226 = null;
        }
        field219++;
        if ((this.field221.field5380[arg5.field3651] & 0x4) != 0 && arg5.field3655 < 0) {
            int var7 = this.field221.field5352[arg5.field3651] / class231.field3248;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field3661) / var7;
                if (var8 > arg3) {
                    arg5.field3661 += arg3 * var7;
                    break;
                }
                arg5.field3653.method106(arg4, arg2, var8);
                arg5.field3661 += var7 * var8 - 1048576;
                arg2 += var8;
                arg3 -= var8;
                int var9 = class231.field3248 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class148 var11 = arg5.field3653;
                if (this.field221.field5338[arg5.field3651] == 0) {
                    arg5.field3653 = class148.method1086(arg5.field3650, var11.method1107(), var11.method1088(), var11.method1078());
                } else {
                    arg5.field3653 = class148.method1086(arg5.field3650, var11.method1107(), 0, var11.method1078());
                    this.field221.method2411(arg5.field3635.field1843[arg5.field3658] < 0, arg5, (byte) -112);
                    arg5.field3653.method1077(var9, var11.method1088());
                }
                if (arg5.field3635.field1843[arg5.field3658] < 0) {
                    arg5.field3653.method1097(-1);
                }
                var11.method1091(var9);
                var11.method106(arg4, arg2, arg0 - arg2);
                if (var11.method1092()) {
                    this.field226.method1127(var11);
                }
            }
        }
        arg5.field3653.method106(arg4, arg2, arg3);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public final void method97(int arg0) {
        this.field226.method97(arg0);
        field228++;
        for (class266 var2 = (class266) this.field225.method1173(0); var2 != null; var2 = (class266) this.field225.method1165(true)) {
            if (!this.field221.method2388(var2, 2515)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3657) {
                        this.method98(var2, (byte) 18, var3);
                        var2.field3657 -= var3;
                        break;
                    }
                    this.method98(var2, (byte) 95, var2.field3657);
                    var3 -= var2.field3657;
                } while (!this.field221.method2392((int[]) null, 0, var3, var2, (byte) 122));
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lil;BI)V")
    private final void method98(class266 arg0, byte arg1, int arg2) {
        field229++;
        if ((this.field221.field5380[arg0.field3651] & 0x4) != 0 && arg0.field3655 < 0) {
            int var4 = this.field221.field5352[arg0.field3651] / class231.field3248;
            int var5 = (var4 + 1048575 - arg0.field3661) / var4;
            arg0.field3661 = arg2 * var4 + arg0.field3661 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field221.field5338[arg0.field3651] == 0) {
                    arg0.field3653 = class148.method1086(arg0.field3650, arg0.field3653.method1107(), arg0.field3653.method1088(), arg0.field3653.method1078());
                } else {
                    arg0.field3653 = class148.method1086(arg0.field3650, arg0.field3653.method1107(), 0, arg0.field3653.method1078());
                    this.field221.method2411(arg0.field3635.field1843[arg0.field3658] < 0, arg0, (byte) -111);
                }
                if (arg0.field3635.field1843[arg0.field3658] < 0) {
                    arg0.field3653.method1097(-1);
                }
                arg2 = arg0.field3661 / var4;
            }
        }
        arg0.field3653.method97(arg2);
        if (arg1 <= 13) {
            this.field221 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public static final void method99(byte arg0) {
        field230++;
        class352 var1 = (class352) class155.field2207.method1173(0);
        if (arg0 <= 45) {
            method99((byte) -108);
        }
        while (var1 != null) {
            if (var1.field4725 > 0) {
                var1.field4725--;
            }
            if (var1.field4725 != 0) {
                if (var1.field4732 > 0) {
                    var1.field4732--;
                }
                if (var1.field4732 == 0 && var1.field4739 >= 1 && var1.field4738 >= 1 && class11.field107 - 2 >= var1.field4739 && var1.field4738 <= (class264.field3620 - 2) && (var1.field4729 < 0 || class451.method2816(78, var1.field4728, var1.field4729))) {
                    class19.method116(var1.field4729, var1.field4739, var1.field4726, var1.field4730, var1.field4738, (byte) 61, var1.field4731, var1.field4728, -1);
                    var1.field4732 = -1;
                    if (var1.field4734 == var1.field4729 && var1.field4734 == -1) {
                        var1.method1884(false);
                    } else if (var1.field4734 == var1.field4729 && var1.field4740 == var1.field4726 && var1.field4728 == var1.field4727) {
                        var1.method1884(false);
                    }
                }
            } else if (var1.field4734 < 0 || class451.method2816(86, var1.field4727, var1.field4734)) {
                class19.method116(var1.field4734, var1.field4739, var1.field4740, var1.field4730, var1.field4738, (byte) 61, var1.field4731, var1.field4727, -1);
                var1.method1884(false);
            }
            var1 = (class352) class155.field2207.method1165(true);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()Lrb;")
    public final class425 method100() {
        field224++;
        class266 var1 = (class266) this.field225.method1173(0);
        if (var1 == null) {
            return null;
        } else if (var1.field3653 == null) {
            return this.method105();
        } else {
            return var1.field3653;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public static void method101(int arg0) {
        field217 = null;
        if (arg0 != -1) {
            method95((class366) null, 61, (String) null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLea;Lvg;)V")
    public static final void method102(boolean arg0, class58 arg1, class108 arg2) {
        field223++;
        boolean var3 = class14.method81(arg2.field1621 | 0xFF000000, arg1, 29037, arg2.field1636 ? class359.field4970.field5874 : null, arg2.field1575, arg2.field1624, arg2.field1622, arg2.field1554) == null;
        if (var3) {
            class120.field1824.method1162(116, new class54(arg2.field1575, arg2.field1554, arg2.field1622, arg2.field1621 | 0xFF000000, arg2.field1624, arg2.field1636));
        }
        if (!arg0) {
            method104(-15, -21, -120, -26);
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "()I")
    public final int method103() {
        field222++;
        return 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)V")
    public static final void method104(int arg0, int arg1, int arg2, int arg3) {
        if (class124.field1876 != null) {
            class124.field1876[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "()Lrb;")
    public final class425 method105() {
        field220++;
        class266 var1;
        do {
            var1 = (class266) this.field225.method1165(true);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3653 == null);
        return var1.field3653;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([III)V")
    public final void method106(int[] arg0, int arg1, int arg2) {
        field227++;
        this.field226.method106(arg0, arg1, arg2);
        for (class266 var4 = (class266) this.field225.method1173(0); var4 != null; var4 = (class266) this.field225.method1165(true)) {
            if (!this.field221.method2388(var4, 2515)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field3657 >= var6) {
                        this.method96(var5 + var6, 262144, var5, var6, arg0, var4);
                        var4.field3657 -= var6;
                        break;
                    }
                    this.method96(var5 + var6, 262144, var5, var4.field3657, arg0, var4);
                    var6 -= var4.field3657;
                    var5 += var4.field3657;
                } while (!this.field221.method2392(arg0, var5, var6, var4, (byte) 127));
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lfl;)V")
    public class17(class387 arg0) {
        this.field221 = arg0;
    }
}
