import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class97 extends class371 implements class210 {

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "Lgk;")
    public class374 field1369;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "Z")
    private boolean field1376;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field1357 = 0;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field1363 = 0;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "[I")
    public static int[] field1378 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Lch;")
    public static class151 field1358 = new class151("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "Lcn;")
    public static class382 field1365;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "Ltl;")
    public static class82 field1377;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 != 16805) {
            this.method84(-55);
        }
        ++field1370;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)I")
    public final int method83(byte arg0) {
        if (arg0 < 70) {
            this.method83((byte) 31);
        }
        ++field1362;
        return this.field1369.field5172;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)Z")
    public final boolean method82(byte arg0) {
        if (arg0 <= 89) {
            this.method86(true, (class89) null);
        }
        ++field1375;
        return this.field1369.method2279((byte) -97);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lvc;I)Lep;")
    public final class309 method69(class89 arg0, int arg1) {
        ++field1372;
        class468 var3 = this.field1369.method2288(-1, arg0, true, 1024, super.field5112, super.field5113, false);
        if (arg1 != 10228) {
            this.method83((byte) 1);
        }
        if (var3 == null) {
            return null;
        } else {
            class257 var4 = arg0.method306();
            var4.method96(super.field5113 + super.field5105, super.field5110, super.field5112 - -super.field5115);
            class309 var5 = null;
            if (this.field1376) {
                var5 = class163.method1205((byte) 40, 1);
            }
            if (this.field1369.field5163 == null) {
                var3.method1592(var4, var5 == null ? null : var5.field4383[0], 0);
            } else {
                class404 var6 = this.field1369.field5163.method896();
                arg0.method384(var3, var6, var4, var5 != null ? var5.field4383[0] : null, 0);
            }
            this.field1369.method2283(arg0, super.field5112 >> 7, super.field5113 >> 7, super.field5113 >> 7, super.field5112 >> 7, true, var3, (byte) -127);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lvc;B)V")
    public final void method85(class89 arg0, byte arg1) {
        if (arg1 == -24) {
            ++field1366;
            this.field1369.method2281(arg0, 131072);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILvc;II)Z")
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field1356;
            class468 var5 = this.field1369.method2288(~arg0, arg1, false, 65536, super.field5112, super.field5113, false);
            if (var5 == null) {
                return false;
            } else {
                class257 var6 = arg1.method306();
                var6.method96(super.field5113 + super.field5105, super.field5110, super.field5115 + super.field5112);
                return var5.method1593(arg2, arg3, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Z")
    public static final boolean method801(int arg0, int arg1) {
        ++field1371;
        class21 var2 = class406.method2432(arg0 + -109, arg1);
        if (var2 == null) {
            return false;
        } else if (~class65.field961 != arg0) {
            class41.field552 = var2.field220;
            class379.field5212 = var2.field228;
            if (class480.field6799 != class389.field5379) {
                class442.field6290 = class379.field5212 + 50000;
                class167.field2427 = class379.field5212 + 40000;
                class239.field3494 = class167.field2427;
            }
            return true;
        } else {
            String var3 = "";
            if (class480.field6799 != class389.field5379) {
                var3 = ":" + (var2.field228 + 7000);
            }
            String var4 = "";
            if (class114.field1604 != null) {
                var4 = "/p=" + class114.field1604;
            }
            String var5 = "http://" + var2.field220 + var3 + "/l=" + class66.field967 + "/a=" + class96.field1351 + var4 + "/j" + (!class352.field4847 ? "0" : "1") + ",o" + (class259.field3692 ? "1" : "0") + ",a2";
            try {
                class204.field2997.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
    public final int method80(int arg0) {
        if (arg0 != 10143) {
            field1365 = null;
        }
        ++field1364;
        return this.field1369.field5156;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BILvc;)Ln;")
    public final class468 method76(byte arg0, int arg1, class89 arg2) {
        ++field1373;
        if (arg0 != -106) {
            this.method69((class89) null, 42);
        }
        return this.field1369.method2288(arg0 ^ 105, arg2, false, arg1, 0, 0, false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLvc;)V")
    public final void method78(boolean arg0, class89 arg1) {
        if (!arg0) {
            this.method84(78);
        }
        this.field1369.method2278(arg1, 4);
        ++field1367;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lvc;IIILoj;Lae;III)V")
    public static final void method802(class89 arg0, int arg1, int arg2, int arg3, class405 arg4, class172 arg5, int arg6, int arg7, int arg8) {
        if (arg8 != 0) {
            field1378 = null;
        }
        ++field1368;
        class76 var9 = class53.field788.method2321(arg7, true);
        if (var9 != null && var9.field1091 && var9.method674(31590, class416.field5691)) {
            if (var9.field1111 != null) {
                int[] var10 = new int[var9.field1111.length];
                for (int var11 = 0; var10.length / 2 > var11; ++var11) {
                    int var13;
                    if (class390.field5393 != 4) {
                        var13 = (int) class91.field1281 + class462.field6529 & 16383;
                    } else {
                        var13 = 16383 & (int) class91.field1281;
                    }
                    int var14 = class319.field4501[var13];
                    int var15 = class319.field4504[var13];
                    if (~class390.field5393 != -5) {
                        var15 = var15 * 256 / (class20.field216 + 256);
                        var14 = var14 * 256 / (class20.field216 - -256);
                    }
                    var10[var11 * 2] = arg5.field2554 / 2 + arg2 - -((var9.field1111[var11 * 2] * 4 + arg1) * var15 + (var9.field1111[var11 * 2 + 1] * 4 + arg3) * var14 >> 15);
                    var10[var11 * 2 + 1] = -((arg3 - -(var9.field1111[var11 * 2 + 1] * 4)) * var15 - (var9.field1111[var11 * 2] * 4 + arg1) * var14 >> 15) + arg6 - -(arg5.field2579 / 2);
                }
                class72.method646(arg0, var10, var9.field1110, arg5.field2575, arg5.field2485);
                for (int var12 = 0; var10.length / 2 - 1 > var12; ++var12) {
                    arg0.method304(var10[var12 * 2], var10[var12 * 2 - -1], var10[var12 * 2 - -2], var10[var12 * 2 + 2 + 1], var9.field1093, 1, arg4, arg2, arg6);
                }
                arg0.method304(var10[var10.length - 2], var10[var10.length + -1], var10[0], var10[1], var9.field1093, 1, arg4, arg2, arg6);
            }
            class417 var16 = null;
            if (var9.field1086 != -1) {
                var16 = var9.method668(-24659, false, arg0);
                if (var16 != null) {
                    class110.method873((byte) 125, arg1, arg4, arg6, var16, arg3, arg2, arg5);
                }
            }
            if (var9.field1102 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method1287();
                }
                class199 var18 = class411.field5629;
                class194 var19 = class473.field6660;
                if (~var9.field1120 == -2) {
                    var19 = class293.field4144;
                    var18 = class189.field2830;
                }
                if (var9.field1120 == 2) {
                    var18 = class408.field5584;
                    var19 = class402.field5516;
                }
                class196.method1366(var18, arg5, var17, var19, arg3, arg1, arg4, arg2, (byte) 65, arg6, var9.field1126, var9.field1102);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lvc;Lnm;IIIIIZIIIIII)V")
    public class97(class89 arg0, class267 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class21.method154(arg11, arg12, 44));
        this.field1369 = new class374(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field1376 = ~arg1.field3902 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZLvc;)V")
    public final void method86(boolean arg0, class89 arg1) {
        ++field1360;
        class468 var3 = this.field1369.method2288(-1, arg1, true, 131072, super.field5112, super.field5113, arg0);
        if (var3 != null) {
            this.field1369.method2283(arg1, super.field5112 >> 7, super.field5113 >> 7, super.field5113 >> 7, super.field5112 >> 7, false, var3, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)I")
    public final int method803(int arg0) {
        ++field1361;
        return arg0 != -15823 ? 116 : this.field1369.method2282(-119);
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
    public static void method804(int arg0) {
        field1378 = null;
        field1377 = null;
        if (arg0 == -8892) {
            field1365 = null;
            field1358 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
    public final int method71(byte arg0) {
        if (arg0 < 81) {
            field1363 = 75;
        }
        ++field1359;
        return this.field1369.field5171;
    }
}
