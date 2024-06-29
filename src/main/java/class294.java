import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class294 {

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Lsh;")
    public static class472 field4425 = new class472(95, 2);

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field4429 = -1;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Z")
    public static boolean field4430 = false;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Lul;")
    public class294 field4424;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lul;")
    public class294 field4426;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V")
    public static final void method1846(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4428++;
        int var5 = 127 % ((arg1 - 29) / 60);
        int var6 = 0;
        int var7 = arg3;
        int var8 = -arg3;
        class345.method2125(false, class49.field723[arg4], arg2 - arg3, arg2 + arg3, arg0);
        int var9 = -1;
        while (var6 < var7) {
            var9 += 2;
            var6++;
            var8 += var9;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int[] var10 = class49.field723[arg4 + var7];
                int[] var11 = class49.field723[arg4 - var7];
                int var12 = arg2 + var6;
                int var13 = arg2 - var6;
                class345.method2125(false, var10, var13, var12, arg0);
                class345.method2125(false, var11, var13, var12, arg0);
            }
            int var14 = arg2 + var7;
            int var15 = arg2 - var7;
            int[] var16 = class49.field723[arg4 + var6];
            int[] var17 = class49.field723[arg4 - var6];
            class345.method2125(false, var16, var15, var14, arg0);
            class345.method2125(false, var17, var15, var14, arg0);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
    public final void method1847(boolean arg0) {
        field4423++;
        if (this.field4424 == null) {
            return;
        }
        this.field4424.field4426 = this.field4426;
        if (!arg0) {
            this.field4424 = null;
        }
        this.field4426.field4424 = this.field4424;
        this.field4426 = null;
        this.field4424 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lbg;ZI)V")
    public static final void method1848(class257 arg0, boolean arg1, int arg2) {
        field4422++;
        if (class186.field2817 >= 400 || class472.field6622 == arg0) {
            return;
        }
        String var9;
        if (arg0.field3831 == 0) {
            boolean var3 = true;
            if (class472.field6622.field3812 != -1 && arg0.field3812 != -1) {
                int var4 = arg0.field3840 >= class472.field6622.field3840 ? arg0.field3840 : class472.field6622.field3840;
                int var5 = arg0.field3812 > class472.field6622.field3812 ? class472.field6622.field3812 : arg0.field3812;
                int var6 = var4 * 10 / 100 + var5 + 5;
                int var7 = class472.field6622.field3840 - arg0.field3840;
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var7 > var6) {
                    var3 = false;
                }
            }
            String var8 = class77.field1088 == class124.field1710 ? class260.field3864.method2036(class4.field85, (byte) -21) : class425.field6076.method2036(class4.field85, (byte) -21);
            if (arg0.field3830 > arg0.field3840) {
                var9 = arg0.method1693(true, (byte) -67) + (var3 ? class341.method2093(class472.field6622.field3840, arg0.field3840, (byte) 127) : "<col=ffffff>") + " (" + var8 + arg0.field3840 + "+" + (arg0.field3830 - arg0.field3840) + ")";
            } else {
                var9 = arg0.method1693(true, (byte) -67) + (var3 ? class341.method2093(class472.field6622.field3840, arg0.field3840, (byte) 127) : "<col=ffffff>") + " (" + var8 + arg0.field3840 + ")";
            }
        } else {
            var9 = arg0.method1693(true, (byte) -67) + " (" + class252.field3625.method2036(class4.field85, (byte) -21) + arg0.field3831 + ")";
        }
        if (class432.field6152) {
            if (!arg1 && (class197.field2960 & 0x8) != 0) {
                class344.method2117((long) arg0.field4609, 5, true, class186.field2830, class357.field5428 + " -> <col=ffffff>" + var9, class184.field2803, -8, 0, -1, false, 0);
                class371.field5594++;
            }
        } else if (arg1) {
            class344.method2117(0L, -1, false, -1, "", "<col=cccccc>" + var9, -8, 0, 0, true, 0);
        } else {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (class163.field2267[var10] != null) {
                    short var11 = 0;
                    if (class13.field195 == class124.field1710 && class163.field2267[var10].equalsIgnoreCase(class99.field1405.method2036(class4.field85, (byte) -21))) {
                        if (class472.field6622.field3840 < arg0.field3840) {
                            var11 = 2000;
                        }
                        if (class472.field6622.field3822 != 0 && arg0.field3822 != 0) {
                            if (class472.field6622.field3822 == arg0.field3822) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (class432.field6132[var10]) {
                        var11 = 2000;
                    }
                    short var12 = (short) (class310.field4686[var10] + var11);
                    int var13 = class447.field6336[var10] == -1 ? class162.field2235 : class447.field6336[var10];
                    class126.field1724++;
                    class344.method2117((long) arg0.field4609, var12, true, var13, "<col=ffffff>" + var9, class163.field2267[var10], -8, 0, -1, false, 0);
                }
            }
        }
        if (arg2 > -71) {
            field4429 = 31;
        }
        if (arg1) {
            return;
        }
        for (class146 var14 = (class146) class451.field6377.method2456(32101); var14 != null; var14 = (class146) class451.field6377.method2461(301)) {
            if (var14.field2056 == 51) {
                var14.field2064 = "<col=ffffff>" + var9;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)Z")
    public static final boolean method1849(byte arg0, int arg1, int arg2) {
        field4427++;
        if (!class166.field2335) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        int var5 = 61 % ((arg0 + 16) / 47);
        if (class467.field6572[var3] == null || class467.field6572[var3][var4] == null) {
            return false;
        }
        class178 var6 = class467.field6572[var3][var4];
        if (arg1 == -1 && var6.field2655 == 0) {
            for (class146 var7 = (class146) class451.field6377.method2456(32101); var7 != null; var7 = (class146) class451.field6377.method2461(301)) {
                if (var7.field2056 == 46 || var7.field2056 == 1006 || var7.field2056 == 30 || var7.field2056 == 50 || var7.field2056 == 13) {
                    for (class178 var8 = class493.method2885(var7.field2058, 65535); var8 != null; var8 = class28.method241(-1, var8)) {
                        if (var6.field2631 == var8.field2631) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class146 var9 = (class146) class451.field6377.method2456(32101); var9 != null; var9 = (class146) class451.field6377.method2461(301)) {
                if (var9.field2061 == arg1 && var6.field2631 == var9.field2058 && (var9.field2056 == 46 || var9.field2056 == 1006 || var9.field2056 == 30 || var9.field2056 == 50 || var9.field2056 == 13)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1850(int arg0, byte[] arg1) {
        field4431++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        class149.method1007(arg1, 0, var2, 0, arg1.length);
        if (arg0 != 2) {
            field4430 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V")
    public static void method1851(boolean arg0) {
        field4425 = null;
        if (arg0) {
            field4429 = -20;
        }
    }
}
