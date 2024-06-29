import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class18 extends class71 {

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "Ljava/lang/String;")
    public static String field238 = " is already on your ignore list.";

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "Ljava/lang/String;")
    public static String field254 = "red:";

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "[I")
    public static int[] field246 = new int[1000];

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "Lmf;")
    public static class53 field253;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZIIZ)V", line = 5)
    public static final void method116(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class299.method2090(2, arg2, class266.field4196.length - 1, arg0, arg4, arg1, 0);
        if (arg3 == -1) {
            field236++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V", line = 31)
    public static final void method117(byte arg0) {
        class48.method339(false, -12095);
        class329.field5109 = 0;
        field250++;
        boolean var1 = true;
        for (int var2 = 0; var2 < class187.field3037.length; var2++) {
            if (class101.field1552[var2] != -1 && class187.field3037[var2] == null) {
                class187.field3037[var2] = class239.field3775.method250(true, class101.field1552[var2], 0);
                if (class187.field3037[var2] == null) {
                    var1 = false;
                    class329.field5109++;
                }
            }
            if (class266.field4195[var2] != -1 && class237.field3750[var2] == null) {
                class237.field3750[var2] = class239.field3775.method267(0, class249.field3964[var2], true, class266.field4195[var2]);
                if (class237.field3750[var2] == null) {
                    var1 = false;
                    class329.field5109++;
                }
            }
            if (class186.field2991) {
                if (class20.field304[var2] != -1 && class105.field1596[var2] == null) {
                    class105.field1596[var2] = class239.field3775.method250(true, class20.field304[var2], 0);
                    if (class105.field1596[var2] == null) {
                        var1 = false;
                        class329.field5109++;
                    }
                }
                if (class84.field1273[var2] != -1 && class71.field909[var2] == null) {
                    class71.field909[var2] = class239.field3775.method250(true, class84.field1273[var2], 0);
                    if (class71.field909[var2] == null) {
                        class329.field5109++;
                        var1 = false;
                    }
                }
            }
            if (class139.field2083 != null && class81.field1240[var2] == null && class139.field2083[var2] != -1) {
                class81.field1240[var2] = class239.field3775.method267(0, class249.field3964[var2], true, class139.field2083[var2]);
                if (class81.field1240[var2] == null) {
                    var1 = false;
                    class329.field5109++;
                }
            }
        }
        if (class329.field5128 == null) {
            if (class175.field2795 == null || !class42.field588.method269(113, class175.field2795.field4926 + "_labels")) {
                class329.field5128 = new class315(0);
            } else if (class42.field588.method260(-21568, class175.field2795.field4926 + "_labels")) {
                class329.field5128 = class81.method598(0, class42.field588, class175.field2795.field4926 + "_labels");
            } else {
                var1 = false;
                class329.field5109++;
            }
        }
        if (!var1) {
            class282.field4456 = 1;
            return;
        }
        boolean var3 = true;
        class295.field4634 = 0;
        for (int var4 = 0; var4 < class187.field3037.length; var4++) {
            byte[] var5 = class237.field3750[var4];
            if (var5 != null) {
                int var6 = (class327.field5096[var4] >> 8) * 64 - class181.field2925;
                int var7 = (class327.field5096[var4] & 0xFF) * 64 - class24.field351;
                if (class247.field3928) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class26.method179(0, var7, var5, var6);
            }
            if (class186.field2991) {
                byte[] var8 = class71.field909[var4];
                if (var8 != null) {
                    int var9 = (class327.field5096[var4] & 0xFF) * 64 - class24.field351;
                    int var10 = (class327.field5096[var4] >> 8) * 64 - class181.field2925;
                    if (class247.field3928) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class26.method179(0, var9, var8, var10);
                }
            }
        }
        if (!var3) {
            class282.field4456 = 2;
            return;
        }
        if (class282.field4456 != 0) {
            class303.method2126(true, class288.field4533 + "<br>(100%)", -112);
        }
        class40.method279(25259);
        class204.method1501(0);
        boolean var11 = false;
        if (class186.field2991 && class63.field831) {
            for (int var12 = 0; var12 < class187.field3037.length; var12++) {
                if (class71.field909[var12] != null || class105.field1596[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class324.method2258(4, 104, 104, class186.field2991 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class50.field685[var13].method442((byte) 115);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class81.field1229[var14][var15][var16] = 0;
                }
            }
        }
        class194.method1424(false, 85);
        if (class186.field2991) {
            class32.field442.method849();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class32.field444[var17][var18].field2341 = true;
                }
            }
        }
        if (class186.field2991) {
            class47.method322();
        }
        if (class186.field2991) {
            class176.method1237(22989);
        }
        class40.method279(25259);
        System.gc();
        if (arg0 > -90) {
            return;
        }
        class48.method339(true, -12095);
        class321.method2247(false, 104);
        if (!class247.field3928) {
            class188.method1327((byte) -3, false);
            class48.method339(true, -12095);
            if (class186.field2991) {
                int var19 = class13.field159.field1969[0] >> 3;
                int var20 = class13.field159.field2006[0] >> 3;
                class121.method845(var20, var19, false);
            }
            class112.method777((byte) -79, false);
            if (class81.field1240 != null) {
                class20.method133((byte) -88);
            }
        }
        if (class247.field3928) {
            class40.method275(1, false);
            class48.method339(true, -12095);
            if (class186.field2991) {
                int var21 = class13.field159.field1969[0] >> 3;
                int var22 = class13.field159.field2006[0] >> 3;
                class121.method845(var22, var21, false);
            }
            client.method1898(false, (byte) 98);
        }
        class204.method1501(0);
        class48.method339(true, -12095);
        class251.method1777(false, class247.field3928 ? class114.field1704 : (int[][][]) null, (byte) -117, class50.field685);
        if (class186.field2991) {
            class47.method326();
        }
        class48.method339(true, -12095);
        int var23 = class8.field94;
        if (var23 > class148.field2209) {
            var23 = class148.field2209;
        }
        if (var23 < class148.field2209 - 1) {
            int var24 = class148.field2209 - 1;
        }
        if (class152.method1062(118)) {
            class16.method109(0);
        } else {
            class16.method109(class8.field94);
        }
        class341.method2354(true);
        if (class186.field2991 && var11) {
            class225.method1646(true);
            class321.method2247(true, 104);
            if (!class247.field3928) {
                class188.method1327((byte) -3, true);
                class48.method339(true, -12095);
                class112.method777((byte) -59, true);
            }
            if (class247.field3928) {
                class40.method275(1, true);
                class48.method339(true, -12095);
                client.method1898(true, (byte) 100);
            }
            class204.method1501(0);
            class48.method339(true, -12095);
            class251.method1777(true, class247.field3928 ? class114.field1704 : (int[][][]) null, (byte) 28, class50.field685);
            class48.method339(true, -12095);
            class341.method2354(true);
            class225.method1646(false);
        }
        if (class186.field2991) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class32.field444[var25][var26].method1066(class84.field1282[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class90.method651(var28, var27, 94);
            }
        }
        class79.method581(112);
        class40.method279(25259);
        class221.method1610(116);
        class204.method1501(0);
        class8.field88 = false;
        if (class186.field2991) {
            class146.method1024(true, 4486);
        }
        if (class161.field2635 != null && class69.field901 != null && class144.field2159 == 25) {
            class12.field132++;
            class21.field313.method1541(-117, 30);
            class21.field313.method1350(1057001181, -89);
        }
        if (!class247.field3928) {
            int var29 = (class31.field437 - 6) / 8;
            int var30 = (class31.field437 + 6) / 8;
            int var31 = (class336.field5209 + 6) / 8;
            int var32 = (class336.field5209 - 6) / 8;
            for (int var33 = var29 - 1; var33 <= var30 + 1; var33++) {
                for (int var34 = var32 - 1; var34 <= (var31 + 1); var34++) {
                    if (var29 > var33 || var33 > var30 || var32 > var34 || var31 < var34) {
                        class239.field3775.method254("m" + var33 + "_" + var34, false);
                        class239.field3775.method254("l" + var33 + "_" + var34, false);
                    }
                }
            }
        }
        if (class144.field2159 == 28) {
            class173.method1180(10, 65280);
        } else {
            class173.method1180(30, 65280);
            if (class69.field901 != null) {
                class21.field313.method1541(-94, 213);
            }
        }
        class63.method423((byte) 95);
        class40.method279(25259);
        class170.method1167((byte) -105);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 534)
    public static final void method118(int arg0) {
        field243++;
        if (arg0 != 0) {
            return;
        }
        for (class125 var1 = (class125) class119.field1831.method1807((byte) 25); var1 != null; var1 = (class125) class119.field1831.method1808(18051)) {
            if (var1.field1874 > 0) {
                var1.field1874--;
            }
            if (var1.field1874 != 0) {
                if (var1.field1862 > 0) {
                    var1.field1862--;
                }
                if (var1.field1862 == 0 && var1.field1865 >= 1 && var1.field1872 >= 1 && var1.field1865 <= 102 && var1.field1872 <= 102 && (var1.field1860 < 0 || class102.method722(var1.field1860, false, var1.field1866))) {
                    class320.method2241(var1.field1875, var1.field1866, var1.field1860, var1.field1859, var1.field1865, (byte) 115, var1.field1870, var1.field1872);
                    var1.field1862 = -1;
                    if (var1.field1864 == var1.field1860 && var1.field1864 == -1) {
                        var1.method465((byte) -122);
                    } else if (var1.field1864 == var1.field1860 && var1.field1870 == var1.field1869 && var1.field1873 == var1.field1866) {
                        var1.method465((byte) -122);
                    }
                }
            } else if (var1.field1864 < 0 || class102.method722(var1.field1864, false, var1.field1873)) {
                class320.method2241(var1.field1875, var1.field1873, var1.field1864, var1.field1859, var1.field1865, (byte) 115, var1.field1869, var1.field1872);
                var1.method465((byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)I", line = 597)
    public static final int method119(int arg0, boolean arg1) {
        field257++;
        if (!arg1) {
            method119(110, true);
        }
        return arg0 == 16711935 ? -1 : class58.method405(arg0, -1);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 616)
    public static void method120(int arg0) {
        if (arg0 == 4) {
            field246 = null;
            field253 = null;
            field254 = null;
            field238 = null;
        }
    }
}
