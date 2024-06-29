import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[Lvc;")
    public static class137[] field613 = new class137[5];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lvc;")
    private static class137 field612 = class45.method325("Hidden", -46);

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lvc;")
    private static class137 field624 = class45.method325("Close", -46);

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Lvc;")
    public static class137 field626 = field624;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lvc;")
    private static class137 field614 = class45.method325("Invalid username or password)3", -46);

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field628 = 0;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lvc;")
    public static class137 field629 = field614;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "Lvc;")
    public static class137 field633 = field612;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "[I")
    public static int[] field631 = new int[2000];

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Lvc;")
    public static class137 field630 = class45.method325("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", -46);

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field634 = 0;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lnb;")
    public static class88 field622;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Loa;")
    public static class93 field620;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[[[B")
    public static byte[][][] field615;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILme;)I")
    public static final int method218(int arg0, class85 arg1) {
        field617++;
        class120 var2 = (class120) class61.field1315.method867(((long) arg1.field1910 << 32) + ((long) arg1.field1920), false);
        if (var2 == null) {
            if (arg0 != 14485) {
                field622 = null;
            }
            return arg1.field1913;
        } else {
            return var2.field2811;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZJ)V")
    public static final void method219(boolean arg0, long arg1) {
        if (!arg0) {
            field622 = null;
        }
        field621++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class104.method756(arg1 - 1L, (byte) 96);
            class104.method756(1L, (byte) 111);
        } else {
            class104.method756(arg1, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static final void method220(int arg0) {
        field618++;
        if (class143.field3362 == null) {
            return;
        }
        if (arg0 != 2000) {
            method221(-50);
        }
        if (class142.field3352 >= 0) {
            if (class47.field1055 > 0) {
                class12.field259 += class60.field1295;
                class143.field3362.method156(27, class142.field3352, class12.field259);
                class47.field1055--;
                if (class47.field1055 == 0) {
                    class143.field3362.method158((byte) 116);
                    class47.field1055 = 20;
                    class142.field3352 = -1;
                }
            }
        } else if (class47.field1055 > 0) {
            class47.field1055--;
            if (class47.field1055 == 0) {
                if (class12.field273 == null) {
                    class143.field3362.method154(false, 256);
                } else {
                    class143.field3362.method154(false, class121.field2816);
                    class142.field3352 = class121.field2816;
                    class143.field3362.method159(17, class127.field2999, class121.field2816, class12.field273);
                    class12.field273 = null;
                }
                class12.field259 = 0;
            }
        }
        class143.field3362.method160(31);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method221(int arg0) {
        field633 = null;
        field622 = null;
        if (arg0 != 0) {
            method222(32, 3, 17, -75, -18, 90, 21);
        }
        field612 = null;
        field620 = null;
        field614 = null;
        field630 = null;
        field631 = null;
        field629 = null;
        field615 = null;
        field626 = null;
        field613 = null;
        field624 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field625++;
        if (!class125.method936(arg6, (byte) 72)) {
            return false;
        }
        class46.field1023 = null;
        boolean var7 = class44.method309(-1, class36.field795[arg6], arg5, arg2, 0, arg3, arg0, (byte) -127, 0, arg1);
        if (class46.field1023 != null) {
            class44.method309(-1412584499, class46.field1023, arg5, arg2, class126.field2947, arg3, arg0, (byte) -127, class39.field870, arg1);
        }
        if (arg4 != -9037) {
            field631 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lme;")
    public static final class85 method223(int arg0, int arg1, int arg2) {
        field616++;
        class85 var3 = class142.method1093(256, arg2);
        if (arg0 == -1) {
            return var3;
        } else {
            if (arg1 != 31229) {
                field613 = null;
            }
            return var3 == null || var3.field1980 == null || arg0 >= var3.field1980.length ? null : var3.field1980[arg0];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
    public static final int method224(int arg0, int arg1) {
        if (arg0 == 7470) {
            field632++;
            return (int) (Math.log((double) arg1 * 0.00390625D) * 868.5889638065036D + 0.5D);
        } else {
            return 115;
        }
    }
}
