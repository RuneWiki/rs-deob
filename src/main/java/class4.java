import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class4 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
    public static int[] field40 = new int[25];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field38 = 7759444;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lja;")
    private static class62 field51 = class30.method243(43, "This world is full)3");

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lja;")
    public static class62 field50 = class30.method243(43, "blinken3:");

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lja;")
    private static class62 field45 = class30.method243(43, "Username: ");

    @OriginalMember(owner = "client!a", name = "p", descriptor = "[Lja;")
    public static class62[] field53 = new class62[5];

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lja;")
    public static class62 field49 = field45;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Lja;")
    public static class62 field55 = class30.method243(43, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lja;")
    public static class62 field46 = field51;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "[[B")
    private static byte[][] field59 = new byte[1000][];

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Lc;")
    public static class18 field58 = new class18(30);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Lid;")
    public static class60 field54;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "[I")
    public static int[] field52;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBILqd;I)V")
    public static final void method14(int arg0, byte arg1, int arg2, class115 arg3, int arg4) {
        field47++;
        if (class40.field936 == arg3 || class128.field2889 >= 400) {
            return;
        }
        class62 var5;
        if (arg3.field2630 == 0) {
            var5 = class70.method594(new class62[] { arg3.field2653, class56.method386((byte) 51, class40.field936.field2641, arg3.field2641), class96.field2247, class120.field2763, class31.method249(true, arg3.field2641), class10.field249 }, 1229);
        } else {
            var5 = class70.method594(new class62[] { arg3.field2653, class96.field2247, class50.field1152, class31.method249(true, arg3.field2630), class10.field249 }, 1229);
        }
        if (class68.field1692 == 1) {
            class102.field2370++;
            class135.method1079((byte) -113, class70.method594(new class62[] { class60.field1459, class34.field805, var5 }, 1229), class35.field827, arg0, arg2, arg4, 4);
        } else if (!class90.field2145) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (field53[var6] != null) {
                    class121.field2776++;
                    short var7 = 0;
                    int var8 = 0;
                    if (field53[var6].method461(25064, class26.field619)) {
                        if (class40.field936.field2641 < arg3.field2641) {
                            var7 = 2000;
                        }
                        if (class40.field936.field2655 != 0 && arg3.field2655 != 0) {
                            if (class40.field936.field2655 == arg3.field2655) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class18.field414[var6]) {
                        var7 = 2000;
                    }
                    if (var6 == 0) {
                        var8 = var7 + 30;
                    }
                    if (var6 == 1) {
                        var8 = var7 + 24;
                    }
                    if (var6 == 2) {
                        var8 = var7 + 18;
                    }
                    if (var6 == 3) {
                        var8 = var7 + 25;
                    }
                    if (var6 == 4) {
                        var8 = var7 + 3;
                    }
                    class135.method1079((byte) -113, class70.method594(new class62[] { class149.field3523, var5 }, 1229), field53[var6], arg0, arg2, arg4, var8);
                }
            }
        } else if ((class52.field1201 & 0x8) == 8) {
            class135.method1079((byte) -113, class70.method594(new class62[] { class27.field678, class34.field805, var5 }, 1229), class124.field2835, arg0, arg2, arg4, 28);
            class119.field2717++;
        }
        if (arg1 >= -43) {
            return;
        }
        for (int var9 = 0; var9 < class128.field2889; var9++) {
            if (class146.field3437[var9] == 31) {
                class60.field1479[var9] = class70.method594(new class62[] { class149.field3523, var5 }, 1229);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method15(int arg0) {
        field50 = null;
        field55 = null;
        if (arg0 != 32105) {
            method15(19);
        }
        field40 = null;
        field51 = null;
        field58 = null;
        field46 = null;
        field45 = null;
        field49 = null;
        field52 = null;
        field59 = null;
        field54 = null;
        field53 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method16(int arg0, int arg1) {
        if (arg0 != -25626) {
            method19(-60, -94, 102, -73, -93);
        }
        field48++;
        if (arg1 == 100 && class155.field3601 > 0) {
            byte[] var2 = field59[--class155.field3601];
            field59[class155.field3601] = null;
            return var2;
        } else if (arg1 == 5000 && class68.field1694 > 0) {
            byte[] var3 = class75.field1861[--class68.field1694];
            class75.field1861[class68.field1694] = null;
            return var3;
        } else if (arg1 == 30000 && class12.field290 > 0) {
            byte[] var4 = class146.field3434[--class12.field290];
            class146.field3434[class12.field290] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method17(byte arg0) {
        field43++;
        if (!class90.field2145) {
            return;
        }
        class54 var1 = class68.method533((byte) -82, class119.field2732, class79.field1915);
        if (var1 != null && var1.field1307 != null) {
            class113 var2 = new class113();
            var2.field2610 = var1;
            var2.field2601 = var1.field1307;
            class124.method976(var2, -109);
        }
        if (arg0 > -87) {
            field60 = 2;
        }
        class90.field2145 = false;
        client.method163(var1, -76);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBI)I")
    public static final int method18(int arg0, int arg1, byte arg2, int arg3) {
        field57++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else {
            int var5 = -15 % ((87 - arg2) / 35);
            return var4 == 2 ? 7 - arg3 : arg1;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
    public static final void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -23707) {
            return;
        }
        field42++;
        for (int var5 = 0; var5 < class102.field2371; var5++) {
            if (class130.field2979[var5] + class13.field313[var5] > arg1 && class13.field313[var5] < arg1 + arg2 && class34.field824[var5] + class111.field2558[var5] > arg3 && class34.field824[var5] < arg3 + arg4) {
                class18.field416[var5] = true;
            }
        }
    }
}
