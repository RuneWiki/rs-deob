import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class261 {

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[I")
    public static int[] field4099 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lpe;")
    public static class277 field4100 = new class277(5000);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Lcd;")
    public static class136 field4101;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field4097;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIJ)Z", line = 5)
    public static final boolean method1873(int arg0, int arg1, int arg2, long arg3) {
        class124 var5 = class83.field1138[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1775 != null && var5.field1775.field1364 == arg3) {
            return true;
        } else if (var5.field1779 != null && var5.field1779.field4373 == arg3) {
            return true;
        } else if (var5.field1788 != null && var5.field1788.field2200 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1798; var6++) {
                if (var5.field1783[var6].field4122 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)Lq;", line = 33)
    public static final class193 method1874(boolean arg0, int arg1) {
        field4096++;
        class193 var2 = (class193) class229.field3586.method1351((long) arg1, 63);
        if (var2 != null) {
            return var2;
        }
        class193 var3 = class170.method1277(arg1, class213.field3352, class172.field2829, (byte) 47, arg0);
        if (var3 != null) {
            class229.field3586.method1347(var3, (long) arg1, (byte) -127);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 56)
    public static final void method1875(int arg0) {
        class126.method919(132, false);
        boolean var1 = true;
        field4098++;
        class335.field5224 = 0;
        for (int var2 = 0; var2 < class293.field4540.length; var2++) {
            if (class277.field4288[var2] != -1 && class293.field4540[var2] == null) {
                class293.field4540[var2] = class290.field4476.method1813(0, class277.field4288[var2], true);
                if (class293.field4540[var2] == null) {
                    class335.field5224++;
                    var1 = false;
                }
            }
            if (class117.field1620[var2] != -1 && class206.field3269[var2] == null) {
                class206.field3269[var2] = class290.field4476.method1838(class117.field1620[var2], 0, class81.field1111[var2], (byte) -66);
                if (class206.field3269[var2] == null) {
                    var1 = false;
                    class335.field5224++;
                }
            }
            if (class109.field1458) {
                if (class249.field3928[var2] != -1 && class174.field2857[var2] == null) {
                    class174.field2857[var2] = class290.field4476.method1813(0, class249.field3928[var2], true);
                    if (class174.field2857[var2] == null) {
                        var1 = false;
                        class335.field5224++;
                    }
                }
                if (class333.field5188[var2] != -1 && class181.field2933[var2] == null) {
                    class181.field2933[var2] = class290.field4476.method1813(0, class333.field5188[var2], true);
                    if (class181.field2933[var2] == null) {
                        var1 = false;
                        class335.field5224++;
                    }
                }
            }
            if (class215.field3392 != null && class251.field3946[var2] == null && class215.field3392[var2] != -1) {
                class251.field3946[var2] = class290.field4476.method1838(class215.field3392[var2], 0, class81.field1111[var2], (byte) -112);
                if (class251.field3946[var2] == null) {
                    var1 = false;
                    class335.field5224++;
                }
            }
        }
        if (class84.field1151 == null) {
            if (class48.field630 == null || !class23.field354.method1833(class48.field630.field4569 + "_labels", -1)) {
                class84.field1151 = new class275(0);
            } else if (class23.field354.method1822(class48.field630.field4569 + "_labels", true)) {
                class84.field1151 = class246.method1768(class48.field630.field4569 + "_labels", (byte) -126, class23.field354);
            } else {
                var1 = false;
                class335.field5224++;
            }
        }
        if (!var1) {
            class64.field929 = 1;
            return;
        }
        boolean var3 = true;
        class46.field608 = 0;
        for (int var4 = 0; var4 < class293.field4540.length; var4++) {
            byte[] var5 = class206.field3269[var4];
            if (var5 != null) {
                int var6 = (class232.field3616[var4] >> 8) * 64 - class326.field5108;
                int var7 = (class232.field3616[var4] & 0xFF) * 64 - class198.field3168;
                if (class248.field3909) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class345.method2382(var6, var7, 110, var5);
            }
            if (class109.field1458) {
                byte[] var8 = class181.field2933[var4];
                if (var8 != null) {
                    int var9 = (class232.field3616[var4] >> 8) * 64 - class326.field5108;
                    int var10 = (class232.field3616[var4] & 0xFF) * 64 - class198.field3168;
                    if (class248.field3909) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class345.method2382(var9, var10, 74, var8);
                }
            }
        }
        if (!var3) {
            class64.field929 = 2;
            return;
        }
        boolean var11 = false;
        if (class64.field929 != 0) {
            class36.method312((byte) -103, true, class126.field1819 + "<br>(100%)");
        }
        class50.method373((byte) 97);
        class283.method2005(26549);
        if (class109.field1458 && class71.field985) {
            for (int var12 = 0; var12 < class293.field4540.length; var12++) {
                if (class181.field2933[var12] != null || class174.field2857[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class110.method787(4, 104, 104, class109.field1458 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class134.field1970[var13].method1481(true);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class134.field1969[var14][var15][var16] = 0;
                }
            }
        }
        class193.method1432(false, -81);
        if (class109.field1458) {
            class8.field158.method1494();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class8.field161[var17][var18].field4410 = true;
                }
            }
        }
        if (class109.field1458) {
            class176.method1309();
        }
        if (class109.field1458) {
            class335.method2330(-78);
        }
        class50.method373((byte) 92);
        System.gc();
        class126.method919(132, true);
        class301.method2085(-75, false);
        if (!class248.field3909) {
            class207.method1527(false, 90);
            class126.method919(132, true);
            if (class109.field1458) {
                int var19 = class146.field2310.field4675[0] >> 3;
                int var20 = class146.field2310.field4708[0] >> 3;
                class244.method1752(var19, (byte) -59, var20);
            }
            class144.method1072(false, -1);
            if (class251.field3946 != null) {
                class2.method9(-67);
            }
        }
        if (class248.field3909) {
            class225.method1651(false, 16377);
            class126.method919(132, true);
            if (class109.field1458) {
                int var21 = class146.field2310.field4708[0] >> 3;
                int var22 = class146.field2310.field4675[0] >> 3;
                class244.method1752(var22, (byte) -86, var21);
            }
            class144.method1073((byte) 120, false);
        }
        class283.method2005(26549);
        class126.method919(132, true);
        class60.method500(97, class134.field1970, false, class248.field3909 ? class339.field5298 : (int[][][]) null);
        if (class109.field1458) {
            class176.method1299();
        }
        class126.method919(132, true);
        int var23 = class85.field1154;
        if (var23 > class154.field2392) {
            var23 = class154.field2392;
        }
        if (var23 < (class154.field2392 - 1)) {
            int var24 = class154.field2392 - 1;
        }
        if (class154.method1119((byte) 16)) {
            class135.method984(0);
        } else {
            class135.method984(class85.field1154);
        }
        class147.method1085(-1);
        if (class109.field1458 && var11) {
            class316.method2208(true);
            class301.method2085(-114, true);
            if (!class248.field3909) {
                class207.method1527(true, 80);
                class126.method919(132, true);
                class144.method1072(true, -1);
            }
            if (class248.field3909) {
                class225.method1651(true, 16377);
                class126.method919(132, true);
                class144.method1073((byte) 97, true);
            }
            class283.method2005(26549);
            class126.method919(132, true);
            class60.method500(101, class134.field1970, true, class248.field3909 ? class339.field5298 : (int[][][]) null);
            class126.method919(132, true);
            class147.method1085(-1);
            class316.method2208(false);
        }
        if (class109.field1458) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class8.field161[var25][var26].method2018(class172.field2843[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class68.method537(-117, var28, var27);
            }
        }
        class119.method856(false);
        class50.method373((byte) 113);
        if (arg0 <= 88) {
            field4101 = (class136) null;
        }
        class345.method2381((byte) -57);
        class283.method2005(26549);
        class164.field2659 = false;
        if (class109.field1458) {
            class276.method1938(true, (byte) 119);
        }
        if (class184.field2976 != null && class275.field4247 != null && class105.field1388 == 25) {
            class56.field782++;
            class183.field2965.method1947((byte) 94, 185);
            class183.field2965.method34(1057001181, 294335144);
        }
        if (!class248.field3909) {
            int var29 = (class78.field1052 + 6) / 8;
            int var30 = (class78.field1052 - 6) / 8;
            int var31 = (class257.field4057 - 6) / 8;
            int var32 = (class257.field4057 + 6) / 8;
            for (int var33 = var30 - 1; var33 <= var29 + 1; var33++) {
                for (int var34 = var31 - 1; var34 <= var32 + 1; var34++) {
                    if (var33 < var30 || var33 > var29 || var31 > var34 || var32 < var34) {
                        class290.field4476.method1828((byte) -121, "m" + var33 + "_" + var34);
                        class290.field4476.method1828((byte) -101, "l" + var33 + "_" + var34);
                    }
                }
            }
        }
        if (class105.field1388 == 28) {
            class68.method538(-124, 10);
        } else {
            class68.method538(-109, 30);
            if (class275.field4247 != null) {
                class183.field2965.method1947((byte) 96, 41);
            }
        }
        class181.method1330(69);
        class50.method373((byte) 108);
        class231.method1667(-58);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 557)
    public static void method1876(boolean arg0) {
        field4101 = null;
        field4100 = null;
        if (arg0) {
            field4099 = null;
            field4097 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 570)
    public static final void method1877(byte arg0) {
        field4104++;
        if ((class163.field2650 < class92.field1232)) {
            class163.field2650 = (float) ((double) class163.field2650 / 30.0D + (double) class163.field2650);
            if (class163.field2650 > class92.field1232) {
                class163.field2650 = class92.field1232;
            }
            class310.method2146(5);
        } else if (class92.field1232 < class163.field2650) {
            class163.field2650 = (float) ((double) class163.field2650 - (double) class163.field2650 / 30.0D);
            if (class92.field1232 > class163.field2650) {
                class163.field2650 = class92.field1232;
            }
            class310.method2146(5);
        }
        int var1 = 13 / ((-arg0 - 3) / 53);
        if (class275.field4241 == -1 || class198.field3167 == -1) {
            return;
        }
        int var2 = class275.field4241 - class322.field5081;
        int var3 = class198.field3167 - class191.field3045;
        if (var3 < 2 || var3 > 2) {
            var3 >>= 0x4;
        }
        class191.field3045 += var3;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class322.field5081 += var2;
        if (var2 == 0 && var3 == 0) {
            class275.field4241 = -1;
            class198.field3167 = -1;
        }
        class310.method2146(5);
    }
}
