import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class124 {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lda;")
    public static class275 field2213 = class255.method1672(109, " ");

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lda;")
    private static class275 field2209 = class255.method1672(113, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lda;")
    public static class275 field2211 = field2209;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[I")
    public static int[] field2214 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2222 = 0;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lda;")
    public static class275 field2220 = class255.method1672(107, " weitere Optionen");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lda;")
    public static class275 field2208 = class255.method1672(113, "<col=ffffff>");

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lda;")
    private static class275 field2216 = class255.method1672(99, "glow1:");

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lda;")
    public static class275 field2215 = field2216;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lda;")
    public static class275 field2219 = field2216;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lrj;")
    public static class13 field2217;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
    public static int[] field2218;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static final void method896(int arg0) {
        field2212++;
        class22.method135(false, -23);
        class169.field2947 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class248.field4369.length; var2++) {
            if (class86.field1458[var2] != -1 && class248.field4369[var2] == null) {
                class248.field4369[var2] = class188.field3251.method775(class86.field1458[var2], 0, arg0 - 12607);
                if (class248.field4369[var2] == null) {
                    class169.field2947++;
                    var1 = false;
                }
            }
            if (class160.field2809[var2] != -1 && class115.field2045[var2] == null) {
                class115.field2045[var2] = class188.field3251.method778(6716, class39.field647[var2], class160.field2809[var2], 0);
                if (class115.field2045[var2] == null) {
                    var1 = false;
                    class169.field2947++;
                }
            }
            if (class160.field2811 != null && class120.field2152[var2] == null && class160.field2811[var2] != -1) {
                class120.field2152[var2] = class188.field3251.method778(6716, class39.field647[var2], class160.field2811[var2], 0);
                if (class120.field2152[var2] == null) {
                    class169.field2947++;
                    var1 = false;
                }
            }
        }
        if (class142.field2504 == null) {
            if (class138.field2418 == null || !class271.field4707.method768(false, class197.method1291(new class275[] { class138.field2418.field3814, class249.field4399 }, arg0 ^ 0x5AD7))) {
                class142.field2504 = new class65(0);
            } else if (class271.field4707.method758(class197.method1291(new class275[] { class138.field2418.field3814, class249.field4399 }, -30025), arg0 + 12319)) {
                class142.field2504 = class84.method555(120, class271.field4707, class197.method1291(new class275[] { class138.field2418.field3814, class249.field4399 }, -30025));
            } else {
                var1 = false;
                class169.field2947++;
            }
        }
        if (!var1) {
            class51.field856 = 1;
            return;
        }
        class18.field257 = 0;
        boolean var3 = true;
        if (arg0 != -12192) {
            method899((byte) 114);
        }
        for (int var4 = 0; var4 < class248.field4369.length; var4++) {
            byte[] var20 = class115.field2045[var4];
            if (var20 != null) {
                int var21 = (class61.field1031[var4] >> 8) * 64 - class16.field237;
                int var22 = (class61.field1031[var4] & 0xFF) * 64 - class234.field4083;
                if (class139.field2428) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class245.method1606(0, var22, var20, var21);
            }
        }
        if (!var3) {
            class51.field856 = 2;
            return;
        }
        if (class51.field856 != 0) {
            class102.method731(true, 87, class197.method1291(new class275[] { class237.field4123, class33.field489 }, -30025));
        }
        class160.method1116(true);
        boolean var5 = false;
        class109.method806((byte) 28);
        class44.method262(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class173.field3003[var6].method868(21744);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class72.field1168[var7][var18][var19] = 0;
                }
            }
        }
        class214.method1375(false, -8291);
        class160.method1116(true);
        System.gc();
        class22.method135(true, -126);
        class84.method557(false, 62);
        if (!class139.field2428) {
            class184.method1227(false, -18643);
            class22.method135(true, -70);
            class203.method1328(-52, false);
            if (class120.field2152 != null) {
                class115.method840(63);
            }
        }
        if (class139.field2428) {
            class151.method1071(false, false);
            class22.method135(true, -31);
            class233.method1517(false, -83);
        }
        class109.method806((byte) 28);
        class22.method135(true, -111);
        client.method639(false, -31, class173.field3003);
        class22.method135(true, -87);
        int var8 = class240.field4223;
        if (var8 > class159.field2790) {
            var8 = class159.field2790;
        }
        if (class159.field2790 - 1 > var8) {
            int var9 = class159.field2790 - 1;
        }
        if (class262.method1714(-1)) {
            class9.method35(0);
        } else {
            class9.method35(class240.field4223);
        }
        class171.method1170(10231);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class5.method20(var17, arg0 + 5836, var10);
            }
        }
        class77.method503(120);
        class160.method1116(true);
        class42.method249((byte) -28);
        class109.method806((byte) 28);
        if (class165.field2870 != null && class52.field866 != null && class200.field3427 == 25) {
            class1.field12++;
            class149.field2597.method526((byte) -57, 77);
            class149.field2597.method586(arg0 ^ 0xFFFFD079, 1057001181);
        }
        if (!class139.field2428) {
            int var11 = (class54.field921 - 6) / 8;
            int var12 = (class66.field1085 - 6) / 8;
            int var13 = (class54.field921 + 6) / 8;
            int var14 = (class66.field1085 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= var13 + 1; var15++) {
                for (int var16 = var12 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var13 < var15 || var16 < var12 || var16 > var14) {
                        class188.field3251.method771(class197.method1291(new class275[] { class39.field644, class250.method1644(var15, (byte) -115), class96.field1637, class250.method1644(var16, (byte) -115) }, -30025), (byte) 74);
                        class188.field3251.method771(class197.method1291(new class275[] { class247.field4361, class250.method1644(var15, (byte) -115), class96.field1637, class250.method1644(var16, (byte) -115) }, arg0 ^ 0x5AD7), (byte) 122);
                    }
                }
            }
        }
        if (class200.field3427 == 28) {
            class265.method1746((byte) -52, 10);
        } else {
            class265.method1746((byte) -52, 30);
            if (class52.field866 != null) {
                class149.field2597.method526((byte) -71, 114);
            }
        }
        class160.method1116(true);
        class77.method504((byte) -27);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lhk;B)Lhk;")
    public abstract class191 method897(class191 arg0, byte arg1);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Lda;")
    public static final class275 method898(int arg0, int arg1, int arg2) {
        field2210++;
        int var3 = arg2 - arg0;
        if (arg1 < 96) {
            field2218 = null;
        }
        if (var3 < -9) {
            return class155.field2709;
        } else if (var3 < -6) {
            return class267.field4641;
        } else if (var3 < -3) {
            return class35.field574;
        } else if (var3 < 0) {
            return class232.field4062;
        } else if (var3 > 9) {
            return class89.field1506;
        } else if (var3 > 6) {
            return class51.field838;
        } else if (var3 > 3) {
            return class97.field1651;
        } else if (var3 > 0) {
            return class59.field999;
        } else {
            return class203.field3450;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method899(byte arg0) {
        field2211 = null;
        field2216 = null;
        field2220 = null;
        field2219 = null;
        field2217 = null;
        field2218 = null;
        field2215 = null;
        field2208 = null;
        field2209 = null;
        field2214 = null;
        int var1 = -106 / ((arg0 + 18) / 53);
        field2213 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Lnk;")
    public static final class89 method900(int arg0, byte arg1) {
        field2221++;
        if (arg0 == 0) {
            return new class106();
        } else if (arg0 == 1) {
            return new class50();
        } else if (arg0 == 2) {
            return new class78();
        } else if (arg0 == 3) {
            return new class82();
        } else if (arg0 == 4) {
            return new class70();
        } else if (arg0 == 5) {
            return new class236();
        } else if (arg0 == 6) {
            return new class273();
        } else if (arg0 == 7) {
            return new class49();
        } else if (arg0 == 8) {
            return new class61();
        } else if (arg0 == 9) {
            return new class166();
        } else if (arg0 == 10) {
            return new class76();
        } else if (arg0 == 11) {
            return new class56();
        } else if (arg0 == 12) {
            return new class97();
        } else if (arg0 == 13) {
            return new class230();
        } else if (arg0 == 14) {
            return new class244();
        } else if (arg0 == 15) {
            return new class41();
        } else if (arg0 == 16) {
            return new class59();
        } else if (arg0 == 17) {
            return new class77();
        } else if (arg0 == 18) {
            return new class5();
        } else if (arg0 == 19) {
            return new class152();
        } else if (arg0 == 20) {
            return new class157();
        } else if (arg0 == 21) {
            return new class144();
        } else if (arg0 == 22) {
            return new class218();
        } else if (arg0 == 23) {
            return new class277();
        } else if (arg0 == 24) {
            return new class258();
        } else if (arg0 == 25) {
            return new class40();
        } else if (arg0 == 26) {
            return new class168();
        } else if (arg0 == 27) {
            return new class160();
        } else if (arg0 == 28) {
            return new class199();
        } else if (arg0 == 29) {
            return new class145();
        } else if (arg0 == 30) {
            return new class60();
        } else if (arg0 == 31) {
            return new class114();
        } else if (arg0 == 32) {
            return new class72();
        } else if (arg0 == 33) {
            return new class122();
        } else if (arg0 == 34) {
            return new class210();
        } else if (arg0 == 35) {
            return new class212();
        } else if (arg0 == 36) {
            return new class224();
        } else if (arg0 == 37) {
            return new class115();
        } else if (arg0 == 38) {
            return new class150();
        } else if (arg0 == 39) {
            return new class12();
        } else {
            if (arg1 != -13) {
                field2214 = null;
            }
            return null;
        }
    }
}
