import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class29 extends class119 {

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "Lai;")
    public static class10 field432 = class44.method278("Startseite auf (WSpielkonto wiederherstellen(W)3", -84);

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[[B")
    public static byte[][] field431 = new byte[250][];

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "Lai;")
    private static class10 field433 = class44.method278("Connection lost)3", 99);

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "Lai;")
    public static class10 field436 = field433;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "Ldd;")
    public static class34 field435 = new class34(200);

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "Z")
    public static boolean field437;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lka;B[Ll;IIII[BIII)V")
    public static final void method182(class92 arg0, byte arg1, class100[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        field428++;
        class114 var11 = new class114(arg7);
        int var12 = -1;
        while (true) {
            int var13 = var11.method804((byte) -76);
            if (var13 == 0) {
                if (arg1 > -4) {
                    method182(null, (byte) -110, null, -37, 119, -113, -38, null, -86, -123, 4);
                    return;
                }
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method804((byte) -40);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method767(true);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg8 == var18 && var17 >= arg5 && var17 < arg5 + 8 && arg6 <= var16 && var16 < arg6 + 8) {
                    class47 var22 = class184.method1189(var12, 6);
                    int var23 = arg4 + class54.method375(var17 & 0x7, var16 & 0x7, arg3, var22.field792, var22.field804, var21, 118);
                    int var24 = arg9 + class30.method197(var22.field804, var21, var22.field792, -2, var17 & 0x7, arg3, var16 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg10;
                        if ((class185.field3527[1][var23][var24] & 0x2) == 2) {
                            var25 = arg10 - 1;
                        }
                        class100 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg2[var25];
                        }
                        class47.method290(arg0, arg3 + var21 & 0x3, (byte) 33, var26, var24, arg10, var12, var20, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(Z)Lbf;")
    public static final class17 method183(boolean arg0) {
        field429++;
        class17 var1 = new class17();
        var1.field257 = class100.field1857[0];
        var1.field255 = class18.field263[0];
        var1.field256 = class184.field3500;
        var1.field261 = class145.field2781[0];
        var1.field260 = class144.field2754;
        int var2 = var1.field261 * var1.field257;
        byte[] var3 = class189.field3615[0];
        var1.field259 = class87.field1547[0];
        var1.field258 = new int[var2];
        int var4 = 0;
        if (arg0) {
            return null;
        }
        while (var2 > var4) {
            var1.field258[var4] = class140.field2639[class123.method861(var3[var4], 255)];
            var4++;
        }
        class56.method383(-98);
        return var1;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static void method184(int arg0) {
        field433 = null;
        field435 = null;
        field432 = null;
        if (arg0 != 0) {
            field435 = null;
        }
        field436 = null;
        field431 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILth;)V")
    public static final void method185(int arg0, class180 arg1) {
        field434++;
        if (class25.field384 == 1) {
            short var2 = 280;
            if (var2 <= class172.field3330 && class172.field3330 <= var2 + 14 && class5.field58 >= 4 && class5.field58 <= 18) {
                class206.method1332(0, -4174, 0);
                return;
            }
            if (class172.field3330 >= var2 + 15 && class172.field3330 <= var2 + 80 && class5.field58 >= 4 && class5.field58 <= 18) {
                class206.method1332(1, -4174, 0);
                return;
            }
            short var3 = 390;
            if (class172.field3330 >= var3 && var3 + 14 >= class172.field3330 && class5.field58 >= 4 && class5.field58 <= 18) {
                class206.method1332(0, -4174, 1);
                return;
            }
            if (class172.field3330 >= var3 + 15 && var3 + 80 >= class172.field3330 && class5.field58 >= 4 && class5.field58 <= 18) {
                class206.method1332(1, -4174, 1);
                return;
            }
            short var4 = 500;
            if (class172.field3330 >= var4 && class172.field3330 <= var4 + 14 && class5.field58 >= 4 && class5.field58 <= 18) {
                class206.method1332(0, -4174, 2);
                return;
            }
            if (var4 + 15 <= class172.field3330 && var4 + 80 >= class172.field3330 && class5.field58 >= 4 && class5.field58 <= 18) {
                class206.method1332(1, -4174, 2);
                return;
            }
            short var5 = 610;
            if (class172.field3330 >= var5 && class172.field3330 <= var5 + 14 && class5.field58 >= 4 && class5.field58 <= 18) {
                class206.method1332(0, -4174, 3);
                return;
            }
            if (class172.field3330 >= var5 + 15 && class172.field3330 <= var5 + 80 && class5.field58 >= 4 && class5.field58 <= 18) {
                class206.method1332(1, -4174, 3);
                return;
            }
            if (class172.field3330 >= 708 && class5.field58 >= 4 && class172.field3330 <= 758 && class5.field58 <= 20) {
                class153.field2937 = false;
                class146.field2791.method97(0, 0);
                class195.field3704.method97(382, 0);
                class126.field2407.method1134(382 - class126.field2407.field3341 / 2, 18);
                return;
            }
            if (class154.field2969 != -1) {
                class35 var6 = class40.field673[class154.field2969];
                if (class25.field377 == var6.field547) {
                    byte[] var7 = class67.method440(0, new class10[] { var6.field542, class129.field2443 }).method45((byte) 118);
                    class11.field179 = new String(var7, 0, var7.length);
                    if (class128.field2427 != 0) {
                        class186.field3546 = 43594;
                        class133.field2494 = 43594;
                        class128.field2427 = 0;
                        class146.field2785 = 443;
                    }
                    class191.field3630 = var6.field541;
                    class153.field2937 = false;
                    class146.field2791.method97(0, 0);
                    class195.field3704.method97(382, 0);
                    class126.field2407.method1134(382 - class126.field2407.field3341 / 2, 18);
                    return;
                }
                class10 var8 = class67.method440(0, new class10[] { class129.field2447, var6.field542, class129.field2443, class10.field131, class19.field284, class119.method846(0, class126.field2406 ? 1 : 0), class153.field2938, class119.method846(0, class114.field2175), class120.field2308, class119.method846(0, class75.field1305) });
                try {
                    arg1.getAppletContext().showDocument(var8.method63((byte) 97), "_self");
                } catch (Exception var9) {
                }
            }
        }
        if (arg0 <= 70) {
            field433 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class29() {
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
    public class29(int arg0) {
        this.field430 = arg0;
    }
}
