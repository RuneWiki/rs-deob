import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class28 {

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public int field621 = -1;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Z")
    public static boolean field620 = false;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lrc;")
    private static class105 field623 = class43.method374("scroll:", 0);

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "B")
    public static byte field627 = 0;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "[[B")
    public static byte[][] field626 = new byte[50][];

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lrc;")
    private static class105 field630 = class43.method374("Unable to connect)3", 0);

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lrc;")
    public static class105 field631 = class43.method374("titlebox", 0);

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field628 = 0;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Lrc;")
    public static class105 field634 = class43.method374("mod_icons", 0);

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Lrc;")
    public static class105 field642 = field630;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field638 = 0;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Z")
    public static boolean field629 = false;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field625 = 0;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "Lrc;")
    public static class105 field646 = class43.method374("Lade Freunde)2Liste)3)3)3", 0);

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Lrc;")
    public static class105 field647 = field623;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Lrc;")
    public static class105 field645 = field630;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lte;")
    public static class119 field618;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lvd;")
    public class130 field635;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Lfc;")
    public static class34 field637;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "[I")
    public int[] field640;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lrc;")
    public class105[] field624;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[Leb;")
    public static class27[] field622;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIIIIIII)V", line = 15)
    public static final void method266(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field619++;
        if (arg1 >= 1 && arg3 >= 1 && arg1 <= 102 && arg3 <= 102) {
            if (class109.field2520 && class73.field1619 != arg4) {
                return;
            }
            int var8 = 0;
            if (arg7 == 0) {
                var8 = class130.field3161.method499(arg4, arg1, arg3);
            }
            if (arg7 == 1) {
                var8 = class130.field3161.method524(arg4, arg1, arg3);
            }
            boolean var9 = true;
            boolean var10 = false;
            if (arg7 == 2) {
                var8 = class130.field3161.method532(arg4, arg1, arg3);
            }
            if (arg7 == 3) {
                var8 = class130.field3161.method503(arg4, arg1, arg3);
            }
            boolean var11 = false;
            if (var8 != 0) {
                int var12 = var8 >> 14 & 0x7FFF;
                int var13 = class130.field3161.method494(arg4, arg1, arg3, var8);
                int var14 = var13 >> 6 & 0x3;
                int var15 = var13 & 0x1F;
                if (arg7 == 0) {
                    class130.field3161.method531(arg4, arg1, arg3);
                    class121 var16 = class12.method149(var12, (byte) 62);
                    if (var16.field2931) {
                        class116.field2717[arg4].method908(var14, -1, var16.field2960, arg3, var15, arg1);
                    }
                }
                if (arg7 == 1) {
                    class130.field3161.method501(arg4, arg1, arg3);
                }
                if (arg7 == 2) {
                    class130.field3161.method493(arg4, arg1, arg3);
                    class121 var17 = class12.method149(var12, (byte) 62);
                    if (var17.field2906 + arg1 > 103 || arg3 + var17.field2906 > 103 || arg1 + var17.field2912 > 103 || var17.field2912 + arg3 > 103) {
                        return;
                    }
                    if (var17.field2931) {
                        class116.field2717[arg4].method904(var17.field2912, arg3, var14, var17.field2906, var17.field2960, arg1, !arg0);
                    }
                }
                if (arg7 == 3) {
                    class130.field3161.method538(arg4, arg1, arg3);
                    class121 var18 = class12.method149(var12, (byte) 62);
                    if (var18.field2931 && var18.field2948 == 1) {
                        class116.field2717[arg4].method898(arg3, arg1, (byte) -77);
                    }
                }
            }
            if (arg2 >= 0) {
                int var19 = arg4;
                if (arg4 < 3 && (class57.field1185[1][arg1][arg3] & 0x2) == 2) {
                    var19 = arg4 + 1;
                }
                class16.method177(var19, class116.field2717[arg4], arg5, arg3, arg4, arg6, (byte) -65, class130.field3161, arg1, arg2);
            }
        }
        if (arg0) {
            method270(null, -97, -60, 82);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 119)
    public static final void method267(byte arg0) {
        field641++;
        class89.field2044.method602((byte) -70);
        if (arg0 <= 121) {
            field637 = null;
        }
        class1.field1.method602((byte) -70);
        class116.field2702.method602((byte) -70);
        class127.field3082.method602((byte) -70);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILpb;Lpb;)V", line = 148)
    public static final void method268(int arg0, class92 arg1, class92 arg2) {
        if (arg0 <= 113) {
            method268(30, null, null);
        }
        field643++;
        class57.field1190 = arg2;
        class17.field366 = arg1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I", line = 188)
    public static final int method269(boolean arg0) {
        if (!arg0) {
            field646 = null;
        }
        field639++;
        return class113.field2645++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lpb;III)Lme;", line = 201)
    public static final class77 method270(class92 arg0, int arg1, int arg2, int arg3) {
        field644++;
        if (class58.method466(arg3, arg1, (byte) 62, arg0)) {
            return arg2 == 0 ? class102.method815(false) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 226)
    public static final void method271(byte arg0) {
        class123.field3026 = new class3();
        if (arg0 >= -109) {
            method266(false, 16, -39, -39, 25, -73, 81, 112);
        }
        field636++;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V", line = 246)
    public static void method272(byte arg0) {
        field645 = null;
        field630 = null;
        int var1 = 0 % ((62 - arg0) / 51);
        field618 = null;
        field647 = null;
        field626 = null;
        field642 = null;
        field634 = null;
        field646 = null;
        field622 = null;
        field623 = null;
        field631 = null;
        field637 = null;
    }
}
