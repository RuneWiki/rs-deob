import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ch")
public abstract class class29 {

    @OriginalMember(owner = "ch", name = "l", descriptor = "Llf;")
    private static class109 field628 = class35.method275("To play on this world move to a free area first)3", 2);

    @OriginalMember(owner = "ch", name = "d", descriptor = "Llf;")
    public static class109 field620 = class35.method275("au", 2);

    @OriginalMember(owner = "ch", name = "e", descriptor = "Llf;")
    public static class109 field621 = class35.method275(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 2);

    @OriginalMember(owner = "ch", name = "b", descriptor = "Llf;")
    public static class109 field618 = class35.method275("::autoshadow on", 2);

    @OriginalMember(owner = "ch", name = "o", descriptor = "I")
    public static int field631 = 0;

    @OriginalMember(owner = "ch", name = "n", descriptor = "Llf;")
    public static class109 field630 = class35.method275("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", 2);

    @OriginalMember(owner = "ch", name = "r", descriptor = "Llf;")
    public static class109 field634 = field628;

    @OriginalMember(owner = "ch", name = "k", descriptor = "Llf;")
    public static class109 field627 = class35.method275(" (X", 2);

    @OriginalMember(owner = "ch", name = "s", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "ch", name = "a", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "ch", name = "f", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "ch", name = "h", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "ch", name = "j", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "ch", name = "m", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "ch", name = "p", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "ch", name = "q", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "ch", name = "c", descriptor = "Lsc;")
    public static class169 field619;

    @OriginalMember(owner = "ch", name = "i", descriptor = "Lbg;")
    public static class18 field625;

    @OriginalMember(owner = "ch", name = "g", descriptor = "[[[I")
    public static int[][][] field623;

    @OriginalMember(owner = "ch", name = "a", descriptor = "(I)V")
    public static void method233(int arg0) {
        field620 = null;
        field623 = null;
        field618 = null;
        field627 = null;
        field630 = null;
        field634 = null;
        field619 = null;
        field628 = null;
        if (arg0 == 0) {
            field625 = null;
            field621 = null;
        }
    }

    @OriginalMember(owner = "ch", name = "a", descriptor = "(III)V")
    public abstract void method234(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "ch", name = "a", descriptor = "(IB[Llf;I)Llf;")
    public static final class109 method235(int arg0, byte arg1, class109[] arg2, int arg3) {
        field626++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg2[arg3 + var5] == null) {
                arg2[arg3 + var5] = class106.field2113;
            }
            var4 += arg2[arg3 + var5].field2176;
        }
        if (arg1 != 53) {
            field624 = -100;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class109 var10 = arg2[arg3 + var8];
            class122.method878(var10.field2182, 0, var6, var7, var10.field2176);
            var7 += var10.field2176;
        }
        class109 var9 = new class109();
        var9.field2176 = var4;
        var9.field2182 = var6;
        return var9;
    }

    @OriginalMember(owner = "ch", name = "a", descriptor = "(IIB)V")
    public abstract void method236(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "ch", name = "b", descriptor = "(III)I")
    public static final int method237(int arg0, int arg1, int arg2) {
        field629++;
        if (arg1 <= 91) {
            method237(-109, 104, -117);
        }
        class106 var3 = (class106) class76.field1466.method337((long) arg2, (byte) -110);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field2096.length > arg0) {
            return var3.field2096[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "ch", name = "a", descriptor = "(IIIIIIILja;)V")
    public static final void method238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class86 arg7) {
        field633++;
        if (arg5 >= 0 && arg5 < 104 && arg4 >= 0 && arg4 < 104) {
            class88.field1827[arg0][arg5][arg4] = 0;
            while (true) {
                int var8 = arg7.method598((byte) 104);
                if (var8 == 0) {
                    if (arg0 == 0) {
                        class184.field3448[0][arg5][arg4] = -class102.method734(arg2 + arg4 + 556238, (byte) 3, arg5 + arg6 + 932731) * 8;
                    } else {
                        class184.field3448[arg0][arg5][arg4] = class184.field3448[arg0 - 1][arg5][arg4] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg7.method598((byte) 82);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg0 == 0) {
                        class184.field3448[0][arg5][arg4] = -var9 * 8;
                    } else {
                        class184.field3448[arg0][arg5][arg4] = class184.field3448[arg0 - 1][arg5][arg4] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class142.field2745[arg0][arg5][arg4] = arg7.method584(3);
                    class9.field123[arg0][arg5][arg4] = (byte) ((var8 - 2) / 4);
                    class106.field2110[arg0][arg5][arg4] = (byte) class170.method1140(var8 + arg3 - 2, 3);
                } else if (var8 <= 81) {
                    class88.field1827[arg0][arg5][arg4] = (byte) (var8 - 49);
                } else {
                    class88.field1836[arg0][arg5][arg4] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg7.method598((byte) 120);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg7.method598((byte) 109);
                    break;
                }
                if (var10 <= 49) {
                    arg7.method598((byte) 111);
                }
            }
        }
        if (arg1 <= 119) {
            field634 = null;
        }
    }

    @OriginalMember(owner = "ch", name = "c", descriptor = "(III)V")
    public abstract void method239(int arg0, int arg1, int arg2);
}
