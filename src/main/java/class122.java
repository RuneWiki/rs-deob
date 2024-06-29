import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class122 extends class109 {

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Lsm;")
    public static class178 field1674 = new class178();

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "Lvh;")
    public static class62 field1686 = new class62(16);

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "Ljava/lang/String;")
    public String field1684;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "Ljava/lang/String;")
    public String field1685;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Lmm;", line = 6)
    public final class285 method782(byte arg0) {
        if (arg0 > -111) {
            return (class285) null;
        } else {
            field1676++;
            return class251.field3979[this.field1494];
        }
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V", line = 19)
    public static final void method783(int arg0) {
        class143.method1025(false, arg0 + 27591);
        class36.field420 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class316.field4951.length; var2++) {
            if (class185.field2787[var2] != -1 && class316.field4951[var2] == null) {
                class316.field4951[var2] = class102.field1380.method100(class185.field2787[var2], 0, (byte) -107);
                if (class316.field4951[var2] == null) {
                    class36.field420++;
                    var1 = false;
                }
            }
            if (class253.field4009[var2] != -1 && class256.field4049[var2] == null) {
                class256.field4049[var2] = class102.field1380.method96(class312.field4893[var2], 0, -2, class253.field4009[var2]);
                if (class256.field4049[var2] == null) {
                    class36.field420++;
                    var1 = false;
                }
            }
            if (class272.field4317) {
                if (class203.field3090[var2] != -1 && class108.field1490[var2] == null) {
                    class108.field1490[var2] = class102.field1380.method100(class203.field3090[var2], 0, (byte) -107);
                    if (class108.field1490[var2] == null) {
                        var1 = false;
                        class36.field420++;
                    }
                }
                if (class84.field1098[var2] != -1 && class119.field1658[var2] == null) {
                    class119.field1658[var2] = class102.field1380.method100(class84.field1098[var2], 0, (byte) -107);
                    if (class119.field1658[var2] == null) {
                        class36.field420++;
                        var1 = false;
                    }
                }
            }
            if (class128.field1874 != null && class67.field834[var2] == null && class128.field1874[var2] != -1) {
                class67.field834[var2] = class102.field1380.method96(class312.field4893[var2], 0, -2, class128.field1874[var2]);
                if (class67.field834[var2] == null) {
                    class36.field420++;
                    var1 = false;
                }
            }
        }
        field1677++;
        if (class117.field1639 == null) {
            if (class322.field5005 == null || !class308.field4782.method105(-101, class322.field5005.field3232 + "_labels")) {
                class117.field1639 = new class301(0);
            } else if (class308.field4782.method99(class322.field5005.field3232 + "_labels", (byte) -115)) {
                class117.field1639 = class277.method1981(class322.field5005.field3232 + "_labels", class308.field4782, class33.field387, -94);
            } else {
                var1 = false;
                class36.field420++;
            }
        }
        if (!var1) {
            class333.field5331 = 1;
            return;
        }
        boolean var3 = true;
        class65.field779 = 0;
        for (int var4 = 0; var4 < class316.field4951.length; var4++) {
            byte[] var5 = class256.field4049[var4];
            if (var5 != null) {
                int var6 = (class218.field3277[var4] & 0xFF) * 64 - class16.field160;
                int var7 = (class218.field3277[var4] >> 8) * 64 - class322.field4999;
                if (class307.field4775) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class132.method905(var6, var7, 112, var5);
            }
            if (class272.field4317) {
                byte[] var8 = class119.field1658[var4];
                if (var8 != null) {
                    int var9 = (class218.field3277[var4] >> 8) * 64 - class322.field4999;
                    int var10 = (class218.field3277[var4] & 0xFF) * 64 - class16.field160;
                    if (class307.field4775) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class132.method905(var10, var9, 102, var8);
                }
            }
        }
        if (!var3) {
            class333.field5331 = 2;
            return;
        }
        if (class333.field5331 != 0) {
            class305.method2152(true, class174.field2628 + "<br>(100%)", -9223);
        }
        class108.method698(-121);
        boolean var11 = false;
        class145.method1073((byte) -102);
        if (arg0 != -27592) {
            field1674 = (class178) null;
        }
        if (class272.field4317 && class76.field993) {
            for (int var12 = 0; var12 < class316.field4951.length; var12++) {
                if (class119.field1658[var12] != null || class108.field1490[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class237.method1640(4, 104, 104, class272.field4317 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class247.field3914[var13].method1851(15850);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class225.field3398[var14][var15][var16] = 0;
                }
            }
        }
        class304.method2145(false, (byte) 8);
        if (class272.field4317) {
            class358.field5677.method1904();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class358.field5675[var17][var18].field3122 = true;
                }
            }
        }
        if (class272.field4317) {
            class195.method1355();
        }
        if (class272.field4317) {
            class226.method1570(true);
        }
        class108.method698(-109);
        System.gc();
        class143.method1025(true, -1);
        class52.method312(4, false);
        if (!class307.field4775) {
            class49.method305((byte) 51, false);
            class143.method1025(true, -1);
            if (class272.field4317) {
                int var19 = class11.field113.field3747[0] >> 3;
                int var20 = class11.field113.field3786[0] >> 3;
                class128.method872(var19, var20, (byte) 103);
            }
            class142.method996((byte) 126, false);
            if (class67.field834 != null) {
                class333.method2304(arg0 ^ 0x6BF6);
            }
        }
        if (class307.field4775) {
            class211.method1471(-6150, false);
            class143.method1025(true, -1);
            if (class272.field4317) {
                int var21 = class11.field113.field3786[0] >> 3;
                int var22 = class11.field113.field3747[0] >> 3;
                class128.method872(var22, var21, (byte) 103);
            }
            class258.method1820(-78, false);
        }
        class145.method1073((byte) -74);
        class143.method1025(true, arg0 + 27591);
        class33.method231(class247.field3914, 115, false, class307.field4775 ? class184.field2766 : (int[][][]) null);
        if (class272.field4317) {
            class195.method1354();
        }
        class143.method1025(true, arg0 + 27591);
        int var23 = class303.field4731;
        if (class219.field3290 < var23) {
            var23 = class219.field3290;
        }
        if (class219.field3290 - 1 > var23) {
            int var24 = class219.field3290 - 1;
        }
        if (class103.method653(-29308)) {
            class295.method2096(0);
        } else {
            class295.method2096(class303.field4731);
        }
        class115.method743((byte) 94);
        if (class272.field4317 && var11) {
            class271.method1920(true);
            class52.method312(4, true);
            if (!class307.field4775) {
                class49.method305((byte) 51, true);
                class143.method1025(true, -1);
                class142.method996((byte) 91, true);
            }
            if (class307.field4775) {
                class211.method1471(arg0 ^ 0x73C2, true);
                class143.method1025(true, -1);
                class258.method1820(arg0 ^ 0x6BB7, true);
            }
            class145.method1073((byte) -123);
            class143.method1025(true, arg0 + 27591);
            class33.method231(class247.field3914, 127, true, class307.field4775 ? class184.field2766 : (int[][][]) null);
            class143.method1025(true, -1);
            class115.method743((byte) 69);
            class271.method1920(false);
        }
        if (class272.field4317) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class358.field5675[var25][var26].method1442(class72.field902[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class130.method893(var27, var28, -99999999);
            }
        }
        class168.method1191((byte) -101);
        class108.method698(-120);
        class293.method2084((byte) 100);
        class145.method1073((byte) -113);
        class41.field449 = false;
        if (class272.field4317) {
            class38.method242(arg0 + 27719, true);
        }
        if (class231.field3498 != null && class147.field2352 != null && client.field4443 == 25) {
            class328.field5282.method304(54, arg0 ^ 0xFFFFD94E);
            class328.field5282.method1052(1057001181, false);
            class163.field2507++;
        }
        if (!class307.field4775) {
            int var29 = (class344.field5466 + 6) / 8;
            int var30 = (class84.field1099 + 6) / 8;
            int var31 = (class84.field1099 - 6) / 8;
            int var32 = (class344.field5466 - 6) / 8;
            for (int var33 = var31 - 1; var33 <= (var30 + 1); var33++) {
                for (int var34 = var32 - 1; var34 <= (var29 + 1); var34++) {
                    if (var33 < var31 || var33 > var30 || var32 > var34 || var34 > var29) {
                        class102.field1380.method104("m" + var33 + "_" + var34, -81);
                        class102.field1380.method104("l" + var33 + "_" + var34, 86);
                    }
                }
            }
        }
        if (client.field4443 == 28) {
            class219.method1525((byte) 61, 10);
        } else {
            class219.method1525((byte) 78, 30);
            if (class147.field2352 != null) {
                class328.field5282.method304(29, 19830);
            }
        }
        class179.method1236(arg0 + 33655);
        class108.method698(-96);
        class227.method1577(-8588);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lnk;Z)V", line = 525)
    public static final void method784(class16 arg0, boolean arg1) {
        class84.field1090 = arg0;
        field1679++;
        class234.field3575 = class84.field1090.method110(!arg1, 4);
        if (!arg1) {
            field1674 = (class178) null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lwf;IIZ)V", line = 537)
    public static final void method785(class67 arg0, int arg1, int arg2, boolean arg3) {
        field1682++;
        if (arg0.field3807 == arg1 && arg1 != -1) {
            class111 var4 = class289.method2067((byte) -27, arg1);
            int var5 = var4.field1542;
            if (var5 == 1) {
                arg0.field3717 = 1;
                arg0.field3740 = 0;
                arg0.field3739 = 0;
                arg0.field3796 = arg2;
                arg0.field3738 = 0;
                class313.method2210(var4, arg0.field3738, 50, arg0.field3763, class11.field113 == arg0, arg0.field3767);
            }
            if (var5 == 2) {
                arg0.field3739 = 0;
            }
        } else if (arg1 == -1 || arg0.field3807 == -1 || class289.method2067((byte) -26, arg1).field1521 >= class289.method2067((byte) -116, arg0.field3807).field1521) {
            arg0.field3717 = 1;
            arg0.field3802 = arg0.field3789;
            arg0.field3738 = 0;
            arg0.field3740 = 0;
            arg0.field3796 = arg2;
            arg0.field3739 = 0;
            arg0.field3807 = arg1;
            if (arg0.field3807 != -1) {
                class313.method2210(class289.method2067((byte) -112, arg0.field3807), arg0.field3738, 50, arg0.field3763, class11.field113 == arg0, arg0.field3767);
            }
        }
        if (!arg3) {
            method784((class16) null, true);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 589)
    public static final int method786(boolean arg0, String arg1) {
        if (!arg0) {
            field1686 = (class62) null;
        }
        field1680++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class95.field1313; var2++) {
            if (arg1.equalsIgnoreCase(class235.field3618[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I", line = 623)
    public static final int method787(int arg0, int arg1) {
        if (arg0 <= 98) {
            field1683 = 58;
        }
        field1681++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)V", line = 635)
    public static void method788(int arg0) {
        field1686 = null;
        if (arg0 != 0) {
            field1674 = (class178) null;
        }
        field1674 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V", line = 648)
    public static final void method789(byte arg0) {
        if (arg0 > -42) {
            field1683 = -114;
        }
        field1673++;
        class49.field557.method378(0);
    }
}
