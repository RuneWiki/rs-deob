import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class32 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Z")
    public static boolean field487;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field485++;
        class218 var10 = null;
        class218 var11 = (class218) class256.field4571.method110(64);
        if (arg6 != -14) {
            return;
        }
        while (var11 != null) {
            if (var11.field3819 == arg9 && var11.field3830 == arg5 && var11.field3826 == arg3 && var11.field3821 == arg1) {
                var10 = var11;
                break;
            }
            var11 = (class218) class256.field4571.method117((byte) 102);
        }
        if (var10 == null) {
            var10 = new class218();
            var10.field3826 = arg3;
            var10.field3821 = arg1;
            var10.field3819 = arg9;
            var10.field3830 = arg5;
            class218.method1485(var10, true);
            class256.field4571.method116((byte) -121, var10);
        }
        var10.field3825 = arg4;
        var10.field3824 = arg7;
        var10.field3831 = arg0;
        var10.field3829 = arg2;
        var10.field3839 = arg8;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static final void method220(int arg0) {
        field491++;
        int var1 = class230.field3978;
        if (arg0 <= 44) {
            return;
        }
        int var2 = class134.field2334;
        int var3 = class102.field1812;
        int var4 = 6116423;
        int var5 = class150.field2544;
        class179.method1222(var3, var1, var2, var5, var4);
        class179.method1222(var3 + 1, var1 + 1, var2 - 2, 16, 0);
        class179.method1217(var3 + 1, var1 + 18, var2 - 2, var5 + -19, 0);
        class180.field3092.method67(class202.field3532, var3 + 3, var1 - -14, var4, -1);
        int var6 = class245.field4195;
        int var7 = class106.field1851;
        for (int var8 = 0; var8 < class115.field2058; var8++) {
            int var9 = (class115.field2058 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var3 < var6 && (var3 + var2) > var6 && var7 > var9 - 13 && var7 < (var9 + 3)) {
                var10 = 16776960;
            }
            class180.field3092.method67(class154.method1012(-123, var8), var3 + 3, var9, var10, 0);
        }
        class239.method1628(100, class102.field1812, class230.field3978, class150.field2544, class134.field2334);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Lqc;")
    public static final class61 method221(int arg0, int arg1) {
        field489++;
        class61 var2 = (class61) class94.field1715.method1269((long) arg1, (byte) 81);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class134.field2337.method464(-1, class56.method375(arg1, arg0 + 674548103), class5.method22(arg1, -41));
        class61 var4 = new class61();
        var4.field1125 = arg1;
        if (arg0 != 11649) {
            return null;
        }
        if (var3 != null) {
            var4.method414(new class247(var3), -112);
        }
        var4.method409((byte) 18);
        if (var4.field1133 != -1) {
            var4.method411(method221(11649, var4.field1123), method221(11649, var4.field1133), 127);
        }
        if (var4.field1138 != -1) {
            var4.method402(method221(arg0, var4.field1117), method221(arg0, var4.field1138), true);
        }
        if (!class182.field3106 && var4.field1152) {
            var4.field1129 = 0;
            var4.field1151 = null;
            var4.field1106 = class36.field554;
            var4.field1127 = null;
            var4.field1118 = false;
        }
        class94.field1715.method1271(arg0 ^ 0xFFFFEEB6, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjd;ILjd;Ljd;I)V")
    public static final void method222(int arg0, class85 arg1, int arg2, class85 arg3, class85 arg4, int arg5) {
        field490++;
        if (arg2 != -100) {
            method221(-20, -27);
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class116.field2074[var6] = class116.field2074[var6 - 1];
            class233.field4024[var6] = class233.field4024[var6 - 1];
            class256.field4560[var6] = class256.field4560[var6 - 1];
            class24.field355[var6] = class24.field355[var6 - 1];
            class261.field4610[var6] = class261.field4610[var6 - 1];
        }
        class203.field3535 = class43.field755;
        class213.field3750++;
        class233.field4024[0] = arg3;
        class116.field2074[0] = arg5;
        class261.field4610[0] = arg0;
        class256.field4560[0] = arg4;
        class24.field355[0] = arg1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public static final void method223(boolean arg0) {
        if (!arg0) {
            method224(-101);
        }
        for (int var1 = 0; var1 < class127.field2229; var1++) {
            int var10002 = class193.field3304[var1]--;
            if (class193.field3304[var1] >= -10) {
                class89 var3 = class40.field638[var1];
                if (var3 == null) {
                    var3 = class89.method660(class79.field1449, class108.field1917[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class193.field3304[var1] += var3.method658();
                    class40.field638[var1] = var3;
                }
                if (class193.field3304[var1] < 0) {
                    int var10;
                    if (class167.field2871[var1] == 0) {
                        var10 = class85.field1565;
                    } else {
                        int var4 = (class167.field2871[var1] & 0xFF) * 128;
                        int var5 = (class167.field2871[var1] & 0xFFB2AC) >> 16;
                        int var6 = var5 * 128 + 64 - class22.field308.field1042;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class167.field2871[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class22.field308.field1027;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var9 > var4) {
                            class193.field3304[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class182.field3109 / var4;
                    }
                    if (var10 > 0) {
                        class126 var11 = var3.method657().method855(class221.field3882);
                        class238 var12 = class238.method1598(var11, 100, var10);
                        var12.method1602(class59.field1071[var1] - 1);
                        class247.field4249.method951(var12);
                    }
                    class193.field3304[var1] = -100;
                }
            } else {
                class127.field2229--;
                for (int var2 = var1; var2 < class127.field2229; var2++) {
                    class108.field1917[var2] = class108.field1917[var2 + 1];
                    class40.field638[var2] = class40.field638[var2 + 1];
                    class59.field1071[var2] = class59.field1071[var2 + 1];
                    class193.field3304[var2] = class193.field3304[var2 + 1];
                    class167.field2871[var2] = class167.field2871[var2 + 1];
                }
                var1--;
            }
        }
        if (class203.field3549 && !class27.method190((byte) 64)) {
            if (class270.field4793 != 0 && class2.field24 != -1) {
                class132.method887(class213.field3744, false, 27750, class2.field24, class270.field4793, 0);
            }
            class203.field3549 = false;
        } else if (class270.field4793 != 0 && class2.field24 != -1 && !class27.method190((byte) 84)) {
            class57.field993++;
            class207.field3618.method483(-24260, 150);
            class207.field3618.method1715(class2.field24, (byte) -115);
            class2.field24 = -1;
        }
        field484++;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static final void method224(int arg0) {
        field486++;
        if (!class12.field193) {
            return;
        }
        class255 var1 = class67.method449(class105.field1849, (byte) 89, class206.field3606);
        if (var1 != null && var1.field4503 != null) {
            class5 var2 = new class5();
            var2.field67 = var1.field4503;
            var2.field58 = var1;
            class127.method863(arg0 - 83, var2);
        }
        class12.field193 = false;
        class16.method120((byte) -97, var1);
        if (arg0 != 1) {
            method221(57, -4);
        }
    }
}
