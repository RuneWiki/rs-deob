import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class99 {

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lfa;")
    private class156 field1326 = new class156(128);

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lfa;")
    public class156 field1332 = new class156(64);

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Lfs;")
    private class387 field1324;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lfs;")
    public class387 field1322;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Lbg;")
    public static class324 field1333 = new class324(105, -2);

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field1335 = -1;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "F")
    public static float field1334;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static final void method836(int arg0) {
        class326.field4576.method293(((float) class478.field7044.field3330 * 0.1F + 0.7F) * 1.1523438F);
        field1331++;
        class326.field4576.method305(class368.field5474, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        if (arg0 <= -97) {
            class326.field4576.method368(class51.field571, -1, 256);
            class326.field4576.method359(class162.field2294);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)Lnf;")
    public final class405 method837(int arg0, byte arg1) {
        if (arg1 != -41) {
            return null;
        }
        field1323++;
        class156 var3 = this.field1326;
        class405 var4;
        synchronized (this.field1326) {
            var4 = (class405) this.field1326.method1115((long) arg0, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1324.method2363(arg0, 36, arg1 + 164);
        class405 var6 = new class405();
        var6.field5999 = arg0;
        var6.field6002 = this;
        if (var5 != null) {
            var6.method2487(new class65(var5), arg1 ^ 0xFFFFFFC5);
        }
        var6.method2484((byte) 45);
        class156 var7 = this.field1326;
        synchronized (this.field1326) {
            this.field1326.method1107(1, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[BZIII)V")
    public static final void method838(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1337++;
        if (arg4 >= arg3) {
            return;
        }
        int var6 = arg4 + arg5;
        int var7 = arg3 - arg4 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg3 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg2) {
                            return;
                        } else {
                            field1330 = 54;
                            return;
                        }
                    }
                    arg1[var6++] = 1;
                }
            }
            arg1[var6++] = 1;
            arg1[var6++] = 1;
            arg1[var6++] = 1;
            arg1[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method839(byte arg0) {
        field1333 = null;
        if (arg0 != -16) {
            field1333 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public final void method840(int arg0) {
        class156 var2 = this.field1326;
        synchronized (this.field1326) {
            this.field1326.method1105(false);
        }
        field1329++;
        if (arg0 <= -84) {
            class156 var3 = this.field1332;
            synchronized (this.field1332) {
                this.field1332.method1105(false);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)V")
    public final void method841(int arg0, byte arg1) {
        field1321++;
        class156 var3 = this.field1326;
        synchronized (this.field1326) {
            this.field1326.method1116(arg0, -50);
        }
        class156 var4 = this.field1332;
        synchronized (this.field1332) {
            this.field1332.method1116(arg0, -50);
        }
        if (arg1 <= 42) {
            this.method841(-29, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lya;I)V")
    public static final void method842(class38 arg0, int arg1) {
        field1327++;
        int var2 = class389.field5748;
        int var3 = class429.field6318;
        int var4 = class22.field244;
        int var5 = class518.field7624 - 3;
        byte var6 = 20;
        if (class516.field7597 == null || class124.field1818 == null) {
            if (class240.field3533.method2384(-1, class485.field7134) && class240.field3533.method2384(arg1 - 4, class346.field4819)) {
                class516.field7597 = arg0.method389(class218.method1488(class240.field3533, class485.field7134, 0), true);
                class218 var7 = class218.method1488(class240.field3533, class346.field4819, 0);
                class124.field1818 = arg0.method389(var7, true);
                var7.method1486();
                class473.field6977 = arg0.method389(var7, true);
            } else {
                arg0.method386(var2, var3, var4, var6, class11.field130 | 255 - class296.field4248 << 24, 1);
            }
        }
        if (class516.field7597 != null && class124.field1818 != null) {
            int var8 = (var4 - (class124.field1818.method110() * 2)) / class516.field7597.method110();
            for (int var9 = 0; var9 < var8; var9++) {
                class516.field7597.method111(var2 + class124.field1818.method110() + class516.field7597.method110() * var9, var3);
            }
            class124.field1818.method111(var2, var3);
            class473.field6977.method111(var2 + var4 - class473.field6977.method110(), var3);
        }
        class466.field6840.method1958(-1, class462.field6803 | -16777216, class192.field2804.method2031(true, class377.field5585), var3 + 14, arg1 + var2, 0);
        arg0.method386(var2, var3 + var6, var4, var5 - var6, class11.field130 | 255 - class296.field4248 << 24, 1);
        int var10 = class104.field1460.method1268((byte) 58);
        int var11 = class104.field1460.method1280(3045);
        int var12 = 0;
        for (class97 var13 = (class97) class498.field7394.method1018(arg1 + 46); var13 != null; var13 = (class97) class498.field7394.method1022((byte) -112)) {
            int var30 = (class291.field4175 - var12 - 1) * 16 + var3 + var6 + 13;
            var12++;
            if (var2 < var10 && (var2 + var4) > var10 && (var30 - 13) < var11 && var11 < var30 + 4 && var13.field1304) {
                arg0.method386(var2, var30 - 12, var4, 16, 255 - class493.field7217 << 24 | class102.field1434, 1);
            }
        }
        if ((class253.field3737 == null || class448.field6607 == null || class250.field3681 == null) && class240.field3533.method2384(-1, class339.field4707) && class240.field3533.method2384(-1, class484.field7120) && class240.field3533.method2384(-1, class270.field3994)) {
            class218 var14 = class218.method1488(class240.field3533, class484.field7120, 0);
            class448.field6607 = arg0.method389(var14, true);
            var14.method1486();
            class467.field6906 = arg0.method389(var14, true);
            class253.field3737 = arg0.method389(class218.method1488(class240.field3533, class339.field4707, 0), true);
            class218 var15 = class218.method1488(class240.field3533, class270.field3994, 0);
            class250.field3681 = arg0.method389(var15, true);
            var15.method1486();
            class441.field6545 = arg0.method389(var15, true);
        }
        if (class253.field3737 != null && class448.field6607 != null && class250.field3681 != null) {
            int var16 = (var4 - (class250.field3681.method110() * 2)) / class253.field3737.method110();
            for (int var17 = 0; var17 < var16; var17++) {
                class253.field3737.method111(class250.field3681.method110() + var2 + (var17 * class253.field3737.method110()), var5 + var3 + -class253.field3737.method126());
            }
            int var18 = (var5 - class250.field3681.method126() - var6) / class448.field6607.method126();
            for (int var19 = 0; var19 < var18; var19++) {
                class448.field6607.method111(var2, var3 + var6 + (class448.field6607.method126() * var19));
                class467.field6906.method111(var2 + var4 - class467.field6906.method110(), var3 - (-var6 + -(class448.field6607.method126() * var19)));
            }
            class250.field3681.method111(var2, var3 + var5 - class250.field3681.method126());
            class441.field6545.method111(var4 + var2 - class250.field3681.method110(), var3 + (var5 - class250.field3681.method126()));
        }
        int var20 = 0;
        for (class97 var21 = (class97) class498.field7394.method1018(arg1 + 76); var21 != null; var21 = (class97) class498.field7394.method1022((byte) -112)) {
            int var22 = (class291.field4175 - var20 - 1) * 16 + var3 + var6 + 13;
            int var23 = class462.field6803 | 0xFF000000;
            if (var2 < var10 && (var2 + var4) > var10 && var11 > (var22 - 13) && var22 + 4 > var11 && var21.field1304) {
                var23 = class258.field3806 | 0xFF000000;
            }
            int[] var24 = null;
            if (class293.method1857(var21.field1307, arg1 ^ 0x3)) {
                var24 = class270.field3995.method6(22883, (int) var21.field1308).field923;
            } else if (var21.field1299 != -1) {
                var24 = class270.field3995.method6(22883, var21.field1299).field923;
            } else if (class478.method2889(var21.field1307, (byte) 78)) {
                class461 var27 = class250.field3690[(int) var21.field1308];
                if (var27 != null) {
                    class100 var28 = var27.field6790;
                    if (var28.field1364 != null) {
                        var28 = var28.method848(false, class253.field3739);
                    }
                    if (var28 != null) {
                        var24 = var28.field1404;
                    }
                }
            } else if (class9.method58(arg1 ^ 0xFFFFFF86, var21.field1307)) {
                Object var25 = null;
                class222 var26;
                if (var21.field1307 == 1010) {
                    var26 = class384.field5645.method786((int) var21.field1308, 0);
                } else {
                    var26 = class384.field5645.method786((int) (var21.field1308 >>> 32 & 0x7FFFFFFFL), 0);
                }
                if (var26.field3233 != null) {
                    var26 = var26.method1509(class253.field3739, (byte) 115);
                }
                if (var26 != null) {
                    var24 = var26.field3245;
                }
            }
            String var29 = class87.method768(-104, var21);
            if (var24 != null) {
                var29 = var29 + class213.method1463(var24, 124);
            }
            class466.field6840.method1957((byte) -101, class517.field7617, 0, class436.field6393, var23, var29, var2 + 3, var22);
            var20++;
            if (var21.field1298) {
                class370.field5496.method111(class387.field5731.method1969(-1, var29) + var2 + 5, var22 + -12);
            }
        }
        class113.method914(class22.field244, class518.field7624, class429.field6318, 0, class389.field5748);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method843(String arg0, int arg1) {
        field1328++;
        if (!class453.field6671) {
            return;
        }
        boolean var2 = false;
        if (arg1 >= -95) {
            method836(33);
        }
        int var3 = class75.field1027;
        int[] var4 = class334.field4634;
        for (int var5 = 0; var5 < var3; var5++) {
            class364 var6 = class384.field5647[var4[var5]];
            if (var6 != null && class435.field6375 != var6 && var6.field5074 != null && var6.field5074.equalsIgnoreCase(arg0)) {
                class32.method258(-76, class425.field6284);
                class400.field5936++;
                class472.field6970.method600(-1276441384, class404.field5977);
                class472.field6970.method583((byte) -73, var4[var5]);
                class472.field6970.method611((byte) 67, class412.field6116);
                class472.field6970.method611((byte) 67, class219.field3149);
                class472.field6970.method582((byte) 23, 0);
                class139.method1044(0, var6.field1778[0], var6.field1777[0], var6.method963((byte) 127), true, var6.method963((byte) 127), 0, -2, 115);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class407.method2497((byte) -99, class504.field7474.method2031(true, class377.field5585) + arg0);
        }
        if (class453.field6671) {
            class235.method1568((byte) 104);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI)V")
    public final void method844(int arg0, boolean arg1, int arg2) {
        this.field1326 = new class156(arg2);
        field1336++;
        this.field1332 = new class156(arg0);
        if (arg1) {
            this.field1322 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public final void method845(int arg0) {
        class156 var2 = this.field1326;
        synchronized (this.field1326) {
            this.field1326.method1119(arg0 ^ 0x677E);
        }
        if (arg0 != 26406) {
            this.method837(-61, (byte) 61);
        }
        field1325++;
        class156 var3 = this.field1332;
        synchronized (this.field1332) {
            this.field1332.method1119(arg0 - 26298);
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljk;ILfs;Lfs;)V")
    public class99(class446 arg0, int arg1, class387 arg2, class387 arg3) {
        this.field1324 = arg2;
        this.field1322 = arg3;
        this.field1324.method2367(36, 28724);
    }
}
