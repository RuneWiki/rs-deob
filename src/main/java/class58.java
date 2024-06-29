import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 {

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "Lwd;")
    public static class150 field1497 = class2.method9(true, "blinken2:");

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lwd;")
    public static class150 field1487 = class2.method9(true, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lwd;")
    public static class150 field1492 = class2.method9(true, "(U2");

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Lwd;")
    public static class150 field1501 = class2.method9(true, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lwd;")
    private static class150 field1493 = class2.method9(true, "Examine");

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1498 = 0;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Lwd;")
    public static class150 field1505 = field1493;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lcb;")
    public static class17 field1496;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Le;")
    public class29 field1499;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
    public static boolean field1490;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "[[I")
    public static int[][] field1495;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "[[Lva;")
    public static class141[][] field1500;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)Z")
    public static final boolean method445(byte arg0, int arg1) {
        field1489++;
        if (!class145.method1090(arg0 - 79, arg1)) {
            return false;
        }
        boolean var2 = false;
        class141[] var3 = field1500[arg1];
        if (arg0 != -31) {
            field1492 = null;
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            class141 var5 = var3[var4];
            if (var5 != null && var5.field3354 == 6) {
                if (var5.field3306 != -1 || var5.field3399 != -1) {
                    boolean var6 = class121.method884(0, var5);
                    int var7;
                    if (var6) {
                        var7 = var5.field3399;
                    } else {
                        var7 = var5.field3306;
                    }
                    if (var7 != -1) {
                        class49 var8 = class111.method785(var7, 22969);
                        var5.field3328 += class128.field3030;
                        label57: while (true) {
                            do {
                                do {
                                    if (var8.field1298[var5.field3410] >= var5.field3328) {
                                        break label57;
                                    }
                                    var2 = true;
                                    var5.field3328 -= var8.field1298[var5.field3410];
                                    var5.field3410++;
                                } while (var8.field1308.length > var5.field3410);
                                var5.field3410 -= var8.field1306;
                            } while (var5.field3410 >= 0 && var5.field3410 < var8.field1308.length);
                            var5.field3410 = 0;
                        }
                    }
                }
                if (var5.field3301 != 0 && !var5.field3370) {
                    var2 = true;
                    int var9 = var5.field3301 >> 16;
                    int var10 = class128.field3030 * var9;
                    var5.field3375 = var5.field3375 + var10 & 0x7FF;
                    int var11 = var5.field3301 << 16 >> 16;
                    int var12 = class128.field3030 * var11;
                    var5.field3404 = var5.field3404 + var12 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static final void method446(byte arg0) {
        if (class97.field2225) {
            class41.method294(arg0 ^ 0xA7F);
            class97.field2225 = false;
            class147.method1101(arg0 - 35);
            class66.field1685 = true;
            class16.field418 = true;
            class82.field1972 = true;
            class40.field1067 = true;
        }
        class49.method363(true);
        field1486++;
        if (class145.field3517 && class12.field305 == 1) {
            class82.field1972 = true;
        }
        if (class118.field2702 != -1) {
            boolean var1 = method445((byte) -31, class118.field2702);
            if (var1) {
                class82.field1972 = true;
            }
        }
        if (class103.field2330 == 2) {
            class82.field1972 = true;
        }
        if (class113.field2608 == 2) {
            class82.field1972 = true;
        }
        if (class82.field1972) {
            class82.field1972 = false;
            class32.method259(-7);
        }
        if (class66.field1688 == -1) {
            class142.field3447.field3309 = class146.field3529 - class99.field2253 - 77;
            if (class111.field2557 > 17 && class111.field2557 < 560 && class113.field2602 > 332) {
                class88.method620(0, -1, class111.field2557 - 17, 77, class113.field2602 - 357, class142.field3447, 463, class146.field3529, (byte) -125);
            }
            int var2 = class146.field3529 - class142.field3447.field3309 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class146.field3529 - 77) {
                var2 = class146.field3529 - 77;
            }
            if (class99.field2253 != var2) {
                class99.field2253 = var2;
                class40.field1067 = true;
            }
        }
        if (class66.field1688 == -1 && class46.field1251 == 3) {
            class142.field3447.field3309 = class119.field2769;
            int var3 = class21.field575 * 14 + 7;
            if (class111.field2557 > 17 && class111.field2557 < 560 && class113.field2602 > 332) {
                class88.method620(0, -1, class111.field2557 - 17, 77, class113.field2602 - 357, class142.field3447, 463, var3, (byte) -123);
            }
            int var4 = class142.field3447.field3309;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > var3 - 77) {
                var4 = var3 - 77;
            }
            if (class119.field2769 != var4) {
                class40.field1067 = true;
                class119.field2769 = var4;
            }
        }
        if (class66.field1688 != -1) {
            boolean var5 = method445((byte) -31, class66.field1688);
            if (var5) {
                class40.field1067 = true;
            }
        }
        if (class103.field2330 == 3) {
            class40.field1067 = true;
        }
        if (class113.field2608 == 3) {
            class40.field1067 = true;
        }
        if (class113.field2634 != null) {
            class40.field1067 = true;
        }
        if (arg0 != -82) {
            return;
        }
        if (class145.field3517 && class12.field305 == 2) {
            class40.field1067 = true;
        }
        if (class40.field1067) {
            class40.field1067 = false;
            class134.method999((byte) 124);
        }
        class86.method616((byte) -105);
        if (class133.field3122 != -1) {
            class66.field1685 = true;
        }
        if (class66.field1685) {
            if (class133.field3122 != -1 && class24.field695 == class133.field3122) {
                class133.field3122 = -1;
                class143.field3451.method965(true, 248);
                class42.field1118++;
                class143.field3451.method1126(31159, class24.field695);
            }
            class66.field1685 = false;
            class18.field487 = true;
            class94.method663(class11.field280 % 20 >= 10 ? class133.field3122 : -1, class24.field695, class118.field2702 == -1, 6366, class42.field1111);
        }
        if (class16.field418) {
            class16.field418 = false;
            class18.field487 = true;
            class38.method283(class134.field3149, class135.field3183, class6.field151, class22.field646, (byte) -120);
        }
        class23.method187(true, class17.field466, class46.field1244.field2939, class46.field1244.field3000, class128.field3030);
        class128.field3030 = 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method447(boolean arg0, int arg1, Object arg2) {
        field1488++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class150.method1180((byte) -106, var3) : var3;
        } else if (arg2 instanceof class142) {
            class142 var4 = (class142) arg2;
            return var4.method506(-9056);
        } else {
            if (arg1 != -4) {
                field1498 = 9;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method448(int arg0) {
        field1492 = null;
        field1505 = null;
        field1495 = null;
        field1501 = null;
        field1493 = null;
        field1496 = null;
        if (arg0 < 45) {
            method447(false, -40, null);
        }
        field1487 = null;
        field1497 = null;
        field1500 = null;
    }
}
