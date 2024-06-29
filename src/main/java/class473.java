import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class473 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lpg;")
    public static class492 field6910;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[Z")
    public static boolean[] field6909;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZ)V")
    public static final void method2839(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2840((byte) 61);
        }
        if (class135.field1961 < class135.field1966) {
            class135.field1961 = (float) ((double) class135.field1961 / 30.0D + (double) class135.field1961);
            if (class135.field1961 > class135.field1966) {
                class135.field1961 = class135.field1966;
            }
            class504.method3016((byte) -69);
            class135.field1964 = (int) class135.field1961 >> 1;
            class135.field1958 = class483.method2887(0, class135.field1964);
        } else if (class135.field1961 > class135.field1966) {
            class135.field1961 = (float) ((double) class135.field1961 - (double) class135.field1961 / 30.0D);
            if (class135.field1961 < class135.field1966) {
                class135.field1961 = class135.field1966;
            }
            class504.method3016((byte) -33);
            class135.field1964 = (int) class135.field1961 >> 1;
            class135.field1958 = class483.method2887(0, class135.field1964);
        }
        field6912++;
        if (class145.field2089 != -1 && class276.field3835 != -1) {
            int var3 = class145.field2089 - class277.field3839;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class276.field3835 - class501.field7487;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class277.field3839 += var3;
            class501.field7487 += var4;
            if (var3 == 0 && var4 == 0) {
                class276.field3835 = -1;
                class145.field2089 = -1;
            }
            class504.method3016((byte) -110);
        }
        if (class56.field756 <= 0) {
            class13.field207 = -1;
            class80.field1072 = -1;
        } else {
            class480.field7013--;
            if (class480.field7013 == 0) {
                class56.field756--;
                class480.field7013 = 100;
            }
        }
        if (!class508.field7560 || class178.field2537 == null) {
            return;
        }
        for (class204 var5 = (class204) class178.field2537.method1970(64); var5 != null; var5 = (class204) class178.field2537.method1960(24)) {
            class24 var6 = class135.field1953.method356(-1, var5.field2867.field65);
            if (var5.method1416(arg1, arg0, true)) {
                if (var6.field368 != null) {
                    if (var6.field368[4] != null) {
                        class294.method1898(-1, var6.field393, (long) var5.field2867.field65, false, -1, true, var6.field368[4], var6.field383, 0, -1, 1002);
                    }
                    if (var6.field368[3] != null) {
                        class294.method1898(-1, var6.field393, (long) var5.field2867.field65, false, -1, true, var6.field368[3], var6.field383, 0, -1, 1010);
                    }
                    if (var6.field368[2] != null) {
                        class294.method1898(-1, var6.field393, (long) var5.field2867.field65, false, -1, true, var6.field368[2], var6.field383, 0, -1, 1001);
                    }
                    if (var6.field368[1] != null) {
                        class294.method1898(-1, var6.field393, (long) var5.field2867.field65, false, -1, true, var6.field368[1], var6.field383, 0, -1, 1011);
                    }
                    if (var6.field368[0] != null) {
                        class294.method1898(-1, var6.field393, (long) var5.field2867.field65, false, -1, true, var6.field368[0], var6.field383, 0, -1, 1012);
                    }
                }
                if (!var5.field2867.field71) {
                    var5.field2867.field71 = true;
                    class291.method1882(class454.field6669, var5.field2867.field65, var6.field393);
                }
                if (var5.field2867.field71) {
                    class291.method1882(class368.field5660, var5.field2867.field65, var6.field393);
                }
            } else if (var5.field2867.field71) {
                var5.field2867.field71 = false;
                class291.method1882(class41.field625, var5.field2867.field65, var6.field393);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method2840(byte arg0) {
        if (arg0 != 19) {
            method2839(-14, -24, true);
        }
        field6910 = null;
        field6909 = null;
    }

    static {
        new class375("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field6910 = new class492(5, 14);
    }
}
