import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class527 {

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field7785 = 0;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field7788 = 0;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "Lhb;")
    public static class250 field7790;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "[Lqt;")
    public static class295[] field7791;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Lv;")
    public static class455 field7784;

    static {
        new class169("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field7790 = new class250(2, -1);
        field7791 = new class295[32768];
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3117(int arg0) {
        class35.method229(false, (byte) 99);
        field7789++;
        class402.field5387 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class511.field7530.length; var2++) {
            if (class43.field625[var2] != -1 && class511.field7530[var2] == null) {
                class511.field7530[var2] = class354.field4551.method1313((byte) -123, class43.field625[var2], 0);
                if (class511.field7530[var2] == null) {
                    class402.field5387++;
                    var1 = false;
                }
            }
            if (class391.field5132[var2] != -1 && class523.field7763[var2] == null) {
                class523.field7763[var2] = class354.field4551.method1321((byte) -27, class391.field5132[var2], 0, class223.field2871[var2]);
                if (class523.field7763[var2] == null) {
                    var1 = false;
                    class402.field5387++;
                }
            }
            if (class368.field4740[var2] != -1 && class163.field2114[var2] == null) {
                class163.field2114[var2] = class354.field4551.method1313((byte) -121, class368.field4740[var2], 0);
                if (class163.field2114[var2] == null) {
                    var1 = false;
                    class402.field5387++;
                }
            }
            if (class235.field3062[var2] != -1 && class121.field1696[var2] == null) {
                class121.field1696[var2] = class354.field4551.method1313((byte) -108, class235.field3062[var2], 0);
                if (class121.field1696[var2] == null) {
                    class402.field5387++;
                    var1 = false;
                }
            }
            if (class104.field1432 != null && class13.field236[var2] == null && class104.field1432[var2] != -1) {
                class13.field236[var2] = class354.field4551.method1321((byte) -27, class104.field1432[var2], 0, class223.field2871[var2]);
                if (class13.field236[var2] == null) {
                    var1 = false;
                    class402.field5387++;
                }
            }
        }
        if (class28.field475 == null) {
            if (class94.field1311 == null || !class236.field3075.method1293(class94.field1311.field4172 + "_staticelements", -24433)) {
                class28.field475 = new class67(0);
            } else if (class236.field3075.method1303(class94.field1311.field4172 + "_staticelements", -24051)) {
                class28.field475 = class286.method1735(class94.field1311.field4172 + "_staticelements", class459.field6421, class236.field3075, -8);
            } else {
                var1 = false;
                class402.field5387++;
            }
        }
        if (!var1) {
            class141.field1874 = 1;
            return;
        }
        boolean var3 = true;
        class207.field2691 = 0;
        for (int var4 = 0; var4 < class511.field7530.length; var4++) {
            byte[] var20 = class523.field7763[var4];
            if (var20 != null) {
                int var21 = (class194.field2507[var4] >> 8) * 64 - class35.field545;
                int var22 = (class194.field2507[var4] & 0xFF) * 64 - class336.field4299;
                if (class377.field4896 != 0) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class339.method1999(class118.field1647, var22, var21, (byte) 0, var20, class200.field2594);
            }
            byte[] var23 = class121.field1696[var4];
            if (var23 != null) {
                int var24 = (class194.field2507[var4] >> 8) * 64 - class35.field545;
                int var25 = (class194.field2507[var4] & 0xFF) * 64 - class336.field4299;
                if (class377.field4896 != 0) {
                    var25 = 10;
                    var24 = 10;
                }
                var3 &= class339.method1999(class118.field1647, var25, var24, (byte) 0, var23, class200.field2594);
            }
        }
        if (!var3) {
            class141.field1874 = 2;
            return;
        }
        if (class141.field1874 != 0) {
            class322.method1923(class43.field635, true, class331.field4251.method1127(class379.field4920, false) + "<br>(100%)", -125);
        }
        class100.method679(16384);
        class312.method1859(5);
        boolean var5 = false;
        if (class512.field7538.method898() && class421.field5647.field7708) {
            for (int var6 = 0; var6 < class511.field7530.length; var6++) {
                if (class121.field1696[var6] != null || class163.field2114[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class421.field5647.field7714) {
            var7 = class460.field6429[class40.field588];
        } else {
            var7 = class64.field812[class40.field588];
        }
        if (class512.field7538.method850()) {
            var7++;
        }
        class342.method2015(7, 4, class200.field2594, class118.field1647, var7, var5, class512.field7538.method843() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class171.field2215[var8].method1374(-5);
        }
        class391.method2330(-83);
        class321.method1917(false, 8);
        class511.method3050((byte) -30);
        class11.field190 = null;
        class100.method679(16384);
        System.gc();
        class35.method229(true, (byte) 99);
        class121.method771((byte) -95);
        field7785 = class421.field5647.method3097((byte) 116, class520.field7690);
        class282.field3600 = class472.field6899 >= 96;
        class72.field899 = class421.field5647.field7708;
        class367.field4718 = class421.field5647.method3102(class520.field7690, (byte) 48);
        class428.field5867 = !class421.field5647.field7696;
        int var9 = -21 / ((arg0 + 78) / 43);
        class306.field3945 = class421.field5647.method648(-65, class520.field7690) ? -1 : class473.field6914;
        class291.field3727 = class421.field5647.field7697;
        class349.field4470 = class520.field7690 == 1 || class421.field5647.field7722;
        class204.field2671 = new class381(4, class200.field2594, class118.field1647, false);
        if (class377.field4896 == 0) {
            class288.method1747(class511.field7530, class204.field2671, 64);
        } else {
            class71.method406(true, class511.field7530, class204.field2671);
        }
        class481.method2883(class200.field2594 >> 4, class118.field1647 >> 4, false);
        class163.method1084(true);
        if (var5) {
            class105.method699(true);
            class471.field6888 = new class381(1, class200.field2594, class118.field1647, true);
            if (class377.field4896 == 0) {
                class288.method1747(class163.field2114, class471.field6888, 64);
                class35.method229(true, (byte) 99);
            } else {
                class71.method406(true, class163.field2114, class471.field6888);
                class35.method229(true, (byte) 99);
            }
            class471.field6888.method1407(class204.field2671.field2824[0], -1, 0);
            class471.field6888.method1416(null, null, class512.field7538, -128);
            class105.method699(false);
        }
        class204.field2671.method1416(class171.field2215, var5 ? class471.field6888.field2824 : null, class512.field7538, -128);
        if (class377.field4896 == 0) {
            class35.method229(true, (byte) 99);
            class125.method791(64, class204.field2671, class523.field7763);
            if (class13.field236 != null) {
                class169.method1125(-134825722);
            }
        } else {
            class35.method229(true, (byte) 99);
            class56.method324(-30620, class523.field7763, class204.field2671);
        }
        class312.method1859(5);
        class35.method229(true, (byte) 99);
        class204.field2671.method1411(var5 ? class283.field3620[0] : null, null, 30142, class512.field7538);
        class204.field2671.method2214((byte) -89, class512.field7538);
        class35.method229(true, (byte) 99);
        if (var5) {
            class105.method699(true);
            class35.method229(true, (byte) 99);
            if (class377.field4896 == 0) {
                class125.method791(64, class471.field6888, class121.field1696);
            } else {
                class56.method324(-30620, class121.field1696, class471.field6888);
            }
            class312.method1859(5);
            class35.method229(true, (byte) 99);
            class471.field6888.method1411(null, class405.field5436[0], 30142, class512.field7538);
            class471.field6888.method2214((byte) -126, class512.field7538);
            class35.method229(true, (byte) 99);
            class105.method699(false);
        }
        class186.method1232((byte) -128);
        int var10 = class204.field2671.field4960;
        if (var10 > class366.field4715) {
            var10 = class366.field4715;
        }
        if (var10 < (class366.field4715 - 1)) {
            var10 = class366.field4715 - 1;
        }
        if (class421.field5647.method648(-83, class520.field7690)) {
            class256.method1601(0);
        } else {
            class256.method1601(var10);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class200.field2594; var18++) {
                for (int var19 = 0; var19 < class118.field1647; var19++) {
                    class94.method640(var19, -81, var18, var11);
                }
            }
        }
        class466.method2813((byte) 0);
        class100.method679(16384);
        class292.method1759(62);
        class312.method1859(5);
        class237.field3088 = false;
        class499.method2987(122);
        if (class516.field7590 != null && class286.field3643 != null && class65.field821 == 25) {
            class282.field3605++;
            class420.method2472((byte) -101, class364.field4691);
            class319.field4112.method572(-105, 1057001181);
        }
        if (class377.field4896 == 0) {
            int var12 = (class53.field719 - (class200.field2594 >> 4)) / 8;
            int var13 = ((class200.field2594 >> 4) + class53.field719) / 8;
            int var14 = (class415.field5529 - (class118.field1647 >> 4)) / 8;
            int var15 = ((class118.field1647 >> 4) + class415.field5529) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                    if (var12 > var16 || var13 < var16 || var14 > var17 || var17 > var15) {
                        class354.field4551.method1305("m" + var16 + "_" + var17, 4);
                        class354.field4551.method1305("l" + var16 + "_" + var17, 4);
                    }
                }
            }
        }
        if (class65.field821 == 28) {
            class294.method1767(10, (byte) -78);
        } else {
            class294.method1767(30, (byte) -95);
            if (class286.field3643 != null) {
                class420.method2472((byte) -101, class29.field496);
            }
        }
        class393.method2338(16776831);
        class100.method679(16384);
        class324.method1927(0);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIZIZ)I", line = 464)
    public static final int method3118(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field7783++;
        class378 var5 = class188.method1235(arg2, (byte) -123, arg3);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = arg1; var7 < var5.field4901.length; var7++) {
            if (var5.field4901[var7] >= 0 && var5.field4901[var7] < class89.field1238.field306) {
                class497 var8 = class89.field1238.method111(var5.field4901[var7], 72);
                int var9 = var8.method2966(class495.field7242.method1837(11, arg0).field7035, true, arg0);
                if (arg4) {
                    var6 += var5.field4905[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)[B", line = 509)
    public static final synchronized byte[] method3119(int arg0, int arg1) {
        field7787++;
        if (arg1 == 100 && class138.field1844 > 0) {
            byte[] var2 = class240.field3105[--class138.field1844];
            class240.field3105[class138.field1844] = null;
            return var2;
        }
        if (arg0 < 70) {
            field7784 = null;
        }
        if (arg1 == 5000 && class252.field3201 > 0) {
            byte[] var3 = class32.field526[--class252.field3201];
            class32.field526[class252.field3201] = null;
            return var3;
        } else if (arg1 == 30000 && class355.field4565 > 0) {
            byte[] var4 = class186.field2436[--class355.field4565];
            class186.field2436[class355.field4565] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 546)
    public static void method3120(int arg0) {
        field7791 = null;
        field7784 = null;
        if (arg0 != -1410962812) {
            method3120(-49);
        }
        field7790 = null;
    }
}
