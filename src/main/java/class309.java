import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class309 {

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Lmh;")
    public static class128 field5243 = class22.method156(126, "Clientscript error in: ");

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lmh;")
    public static class128 field5239 = class22.method156(127, "blinken2:");

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field5249 = 0;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "[I")
    public static int[] field5251 = new int[500];

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Lmh;")
    public static class128 field5254 = class22.method156(125, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Lkh;")
    public static class13 field5248;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Lbj;")
    public static class51 field5250;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Z", line = 10)
    public static final boolean method2103(int arg0, int arg1) {
        field5244++;
        class140 var2 = class105.method647(arg1, false);
        if (var2 == null) {
            return false;
        } else if (class270.field4676 == 1 || class270.field4676 == 2 || class236.field4057 == 2) {
            byte[] var3 = var2.field2401.method825(-24750);
            class241.field4137 = new String(var3, 0, var3.length);
            class105.field1793 = var2.field2397;
            if (class236.field4057 != 0) {
                class203.field3592 = class105.field1793 + 50000;
                class303.field5127 = class105.field1793 + 40000;
                class53.field1028 = class303.field5127;
            }
            return true;
        } else {
            class128 var4 = class169.field2946;
            if (~class236.field4057 != arg0) {
                var4 = class28.method177((byte) -92, new class128[] { class240.field4109, class257.method1811(var2.field2397 + 7000, (byte) -116) });
            }
            class128 var5 = class169.field2946;
            if (class221.field3890 != null) {
                var5 = class28.method177((byte) -103, new class128[] { class6.field123, class221.field3890 });
            }
            class128 var6 = class28.method177((byte) -61, new class128[] { client.field4149, var2.field2401, var4, class140.field2406, class257.method1811(class77.field1417, (byte) 91), class47.field952, class257.method1811(class36.field743, (byte) -115), var5, class118.field1990, class289.field4949 ? class116.field1963 : class178.field3138, class260.field4509, class266.field4606 ? class116.field1963 : class178.field3138, class293.field5021, class268.field4645 ? class116.field1963 : class178.field3138 });
            try {
                class139.field2385.getAppletContext().showDocument(var6.method841(false), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZII)V", line = 58)
    public static final void method2104(int arg0, boolean arg1, int arg2, int arg3) {
        field5253++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class10.field356 = arg0;
        class12.field389 = arg2;
        class195.field3424 = arg1;
        if (arg3 != 5304) {
            field5245 = -121;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V", line = 80)
    public static final void method2105(int arg0, byte arg1, int arg2) {
        if (arg1 <= 91) {
            field5248 = (class13) null;
        }
        field5241++;
        if (class133.method890(false, arg0)) {
            class313.method2134(arg2, true, class200.field3508[arg0]);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lmh;IZII)V", line = 97)
    public static final void method2106(class128 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class10 var5 = class271.method1908(arg1, arg3, arg2);
        field5240++;
        if (var5 == null) {
            return;
        }
        if (var5.field308 != null) {
            class102 var6 = new class102();
            var6.field1743 = var5.field308;
            var6.field1747 = arg0;
            var6.field1738 = var5;
            var6.field1742 = arg4;
            class249.method1739(var6, -71);
        }
        boolean var7 = true;
        if (var5.field222 > 0) {
            var7 = class74.method492(-48, var5);
        }
        if (!var7 || !class196.method1373(-1, arg4 - 1, client.method1657(var5))) {
            return;
        }
        if (arg4 == 1) {
            class71.field1320.method570(203, -1);
            class288.field4926++;
            class71.field1320.method1337(-70, arg1);
            class71.field1320.method1324(arg3, 15803);
        }
        if (arg4 == 2) {
            class71.field1320.method570(150, -1);
            class151.field2598++;
            class71.field1320.method1337(-121, arg1);
            class71.field1320.method1324(arg3, 15803);
        }
        if (arg4 == 3) {
            class249.field4302++;
            class71.field1320.method570(23, -1);
            class71.field1320.method1337(-122, arg1);
            class71.field1320.method1324(arg3, 15803);
        }
        if (arg4 == 4) {
            class196.field3444++;
            class71.field1320.method570(71, -1);
            class71.field1320.method1337(-127, arg1);
            class71.field1320.method1324(arg3, 15803);
        }
        if (arg2) {
            return;
        }
        if (arg4 == 5) {
            class79.field1431++;
            class71.field1320.method570(155, -1);
            class71.field1320.method1337(-97, arg1);
            class71.field1320.method1324(arg3, 15803);
        }
        if (arg4 == 6) {
            class162.field2766++;
            class71.field1320.method570(160, -1);
            class71.field1320.method1337(-102, arg1);
            class71.field1320.method1324(arg3, 15803);
        }
        if (arg4 == 7) {
            class71.field1320.method570(106, -1);
            class71.field1320.method1337(-77, arg1);
            class301.field5109++;
            class71.field1320.method1324(arg3, 15803);
        }
        if (arg4 == 8) {
            class71.field1320.method570(156, -1);
            class71.field1320.method1337(-77, arg1);
            class62.field1169++;
            class71.field1320.method1324(arg3, 15803);
        }
        if (arg4 == 9) {
            class71.field1320.method570(162, -1);
            class71.field1320.method1337(-86, arg1);
            class211.field3743++;
            class71.field1320.method1324(arg3, 15803);
        }
        if (arg4 == 10) {
            class249.field4303++;
            class71.field1320.method570(204, -1);
            class71.field1320.method1337(-43, arg1);
            class71.field1320.method1324(arg3, 15803);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lmh;ZI)V", line = 241)
    public static final void method2107(class128 arg0, boolean arg1, int arg2) {
        field5252++;
        if (arg2 != -23465) {
            field5249 = -110;
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class132.field2292.method2081(arg0, 250);
        int var6 = var3 + 6;
        int var7 = class132.field2292.method2071(arg0, 250) * 13;
        if (class247.field4247) {
            class269.method1878(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 + var3, 0);
            class269.method1871(var4 - var3, var6 - var3, var3 + var5 + var3, var3 + var7 + var3, 16777215);
        } else {
            class213.method1464(var4 - var3, var6 - var3, var3 + var5 + var3, var3 + var7 + var3, 0);
            class213.method1463(var4 - var3, -var3 + var6, var3 + var3 + var5, var3 + var3 + var7, 16777215);
        }
        class132.field2292.method2075(arg0, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class118.method710(var6 - var3, var7 - -var3 + var3, var3 + var3 + var5, (byte) -125, var4 - var3);
        if (!arg1) {
            class90.method561(var5, var6, 29485, var4, var7);
        } else if (class247.field4247) {
            class247.method1684();
        } else {
            try {
                Graphics var8 = class203.field3589.getGraphics();
                class4.field76.method148(0, 128, 0, var8);
            } catch (Exception var10) {
                class203.field3589.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZB)V", line = 303)
    public static final void method2108(boolean arg0, byte arg1) {
        field5247++;
        for (int var2 = 0; var2 < class37.field749; var2++) {
            long var3 = (long) class39.field839[var2] << 32 | 0x20000000L;
            class115 var5 = class201.field3560[class39.field839[var2]];
            if (var5 != null && var5.method122(false) && arg0 == var5.field1934.field3676 && var5.field1934.method1425(0)) {
                int var6 = var5.field478 >> 7;
                int var7 = var5.field418 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.method118(-1) == 1 && (var5.field478 & 0x7F) == 64 && (var5.field418 & 0x7F) == 64) {
                        if (class260.field4514[var6][var7] == class167.field2873) {
                            continue;
                        }
                        class260.field4514[var6][var7] = class167.field2873;
                    }
                    if (!var5.field1934.field3653) {
                        var3 |= Long.MIN_VALUE;
                    }
                    var5.field415 = class64.method427(var5.field478, var5.field418, class133.field2315, (byte) 96);
                    class252.method1791(class133.field2315, var5.field478, var5.field418, var5.field415, var5.method118(-1) * 64 - 4, var5, var5.field460, var3, var5.field445);
                }
            }
        }
        if (arg1 != 7) {
            method2103(-82, -23);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V", line = 366)
    public static void method2109(boolean arg0) {
        field5250 = null;
        field5239 = null;
        field5248 = null;
        if (!arg0) {
            field5254 = null;
            field5243 = null;
            field5251 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I")
    public abstract int method161(int arg0);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method159(byte arg0, Component arg1);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method160(int arg0, Component arg1);
}
