import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class177 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field2768 = 0;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Lre;")
    public static class228 field2767 = null;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field2770 = 0;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field2772 = 0;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[Z")
    public static boolean[] field2771;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lqf;BZ)V")
    public static final void method1198(class251 arg0, byte arg1, boolean arg2) {
        field2769++;
        int var3 = (int) arg0.field2603;
        if (arg1 >= -63) {
            method1201(79, (class60) null, -32, 25, 6);
        }
        int var4 = arg0.field4041;
        arg0.method1123(0);
        if (arg2) {
            class66.method488(false, var4);
        }
        class52.method384(360698992, var4);
        class228 var5 = class84.method596((byte) 35, var3);
        if (var5 != null) {
            class82.method591(var5, false);
        }
        int var6 = class128.field2018;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class122.method842(class146.field2319[var7], (byte) -103)) {
                class277.method1868(var7, -2632);
            }
        }
        if (class128.field2018 == 1) {
            class47.field687 = false;
            class95.method711(239, class157.field2446, class286.field4520, class190.field2951, class141.field2150);
        } else {
            class95.method711(239, class157.field2446, class286.field4520, class190.field2951, class141.field2150);
            int var8 = class228.field3517.method1674(class89.field1563);
            for (int var9 = 0; var9 < class128.field2018; var9++) {
                int var10 = class228.field3517.method1674(class179.method1214(var9, -1));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class141.field2150 = var8 + 8;
            class190.field2951 = class128.field2018 * 15 + (class180.field2798 ? 26 : 22);
        }
        if (class75.field1236 != -1) {
            class151.method1018(-81, 1, class75.field1236);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static final void method1199(boolean arg0) {
        field2774++;
        int var1 = class87.field1457;
        int var2 = class103.field1717;
        if (!arg0) {
            method1201(-91, (class60) null, -33, 115, -95);
        }
        int var3 = class266.field4249 - class29.field409 - var1;
        int var4 = client.field2439 - class79.field1310 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            Container var6;
            if (class39.field547 != null) {
                var6 = class39.field547;
            } else if (class47.field685 == null) {
                var6 = class179.field2788.field479;
            } else {
                var6 = class47.field685;
            }
            int var7 = 0;
            if (class47.field685 == var6) {
                Insets var8 = class47.field685.getInsets();
                var5 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var6.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var5, var7, var1, client.field2439);
            }
            if (var2 > 0) {
                var9.fillRect(var5, var7, class266.field4249, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class266.field4249 + var5 - var3, var7, var3, client.field2439);
            }
            if (var4 > 0) {
                var9.fillRect(var5, client.field2439 + var7 - var4, class266.field4249, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIILre;IILed;)V")
    public static final void method1200(byte arg0, int arg1, int arg2, class228 arg3, int arg4, int arg5, class186 arg6) {
        field2766++;
        if (arg6 == null) {
            return;
        }
        int var7 = (int) class16.field244 + class103.field1732 & 0x7FF;
        int var8 = Math.max(arg3.field3574 / 2, arg3.field3625 / 2) + 10;
        int var9 = arg2 * arg2 + arg4 * arg4;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class195.field3091[var7];
        int var11 = var10 * 256 / (class77.field1265 + 256);
        int var12 = class195.field3089[var7];
        int var13 = var12 * 256 / (class77.field1265 + 256);
        int var14 = arg2 * var11 + arg4 * var13 >> 16;
        int var15 = -51 % ((arg0 + 41) / 57);
        int var16 = arg2 * var13 - arg4 * var11 >> 16;
        ((class276) arg6).method1862(arg3.field3574 / 2 + arg5 + var14 - (arg6.field2869 / 2), arg3.field3625 / 2 + -var16 + arg1 + -(arg6.field2877 / 2), arg3.field3589, arg3.field3544);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILja;III)V")
    public static final void method1201(int arg0, class60 arg1, int arg2, int arg3, int arg4) {
        field2775++;
        if (class128.field2018 >= 400) {
            return;
        }
        if (arg1.field1020 != null) {
            arg1 = arg1.method459(true);
        }
        if (arg1 == null || !arg1.field985) {
            return;
        }
        String var5 = arg1.field1003;
        if (arg0 < 21) {
            return;
        }
        if (arg1.field980 != 0) {
            String var6 = class167.field2613 == 1 ? class208.field3235 : class210.field3270;
            var5 = var5 + class84.method598(arg1.field980, class283.field4473.field3821, -1) + " (" + var6 + arg1.field980 + ")";
        }
        if (class73.field1227 == 1) {
            class117.method825(class140.field2139, -1, class137.field2109, arg3, (long) arg4, (short) 35, class243.field3951 + " -> <col=ffff00>" + var5, arg2);
            class250.field4035++;
        } else if (class122.field1960) {
            class200 var14 = class4.field31 == -1 ? null : class250.method1716(class4.field31, (byte) 81);
            if ((class170.field2644 & 0x2) != 0 && var14 == null || arg1.method452(-109, var14.field3132, class4.field31) != var14.field3132) {
                class117.method825(class258.field4123, -1, class37.field518, arg3, (long) arg4, (short) 8, class190.field2950 + " -> <col=ffff00>" + var5, arg2);
                class149.field2355++;
            }
        } else {
            String[] var7 = arg1.field1018;
            if (class165.field2589) {
                var7 = class100.method730(0, var7);
            }
            class271.field4360++;
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class167.field2613 != 0 || !var7[var8].equalsIgnoreCase(class286.field4534))) {
                        class125.field1978++;
                        int var9 = -1;
                        byte var10 = 0;
                        if (arg1.field1041 == var8) {
                            var9 = arg1.field1007;
                        }
                        if (arg1.field1015 == var8) {
                            var9 = arg1.field997;
                        }
                        if (var8 == 0) {
                            var10 = 29;
                        }
                        if (var8 == 1) {
                            var10 = 6;
                        }
                        if (var8 == 2) {
                            var10 = 51;
                        }
                        if (var8 == 3) {
                            var10 = 59;
                        }
                        if (var8 == 4) {
                            var10 = 7;
                        }
                        class117.method825(var9, -1, var7[var8], arg3, (long) arg4, var10, "<col=ffff00>" + var5, arg2);
                    }
                }
            }
            if (class167.field2613 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class286.field4534)) {
                        class10.field177++;
                        short var12 = 0;
                        if (class283.field4473.field3821 < arg1.field980) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 29;
                        }
                        if (var11 == 1) {
                            var13 = 6;
                        }
                        if (var11 == 2) {
                            var13 = 51;
                        }
                        if (var11 == 3) {
                            var13 = 59;
                        }
                        if (var11 == 4) {
                            var13 = 7;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class117.method825(arg1.field1019, -1, var7[var11], arg3, (long) arg4, var13, "<col=ffff00>" + var5, arg2);
                    }
                }
            }
            class117.method825(class34.field504, -1, class113.field1851, arg3, (long) arg4, (short) 1001, "<col=ffff00>" + var5, arg2);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1202(int arg0) {
        field2771 = null;
        if (arg0 != -4) {
            field2767 = null;
        }
        field2767 = null;
    }
}
