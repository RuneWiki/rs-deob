import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public abstract class class152 extends class331 {

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public static int field1875 = 20;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
    public static int field1884 = 0;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field1880 = 0;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "[[Z")
    public static boolean[][] field1876 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "Lwj;")
    public static class223 field1881 = new class223();

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "Lth;")
    public static class355 field1879;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "[I")
    public static int[] field1874;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1885++;
        if (arg3 != 1) {
            method922(-83, -38, -97);
        }
        for (int var6 = arg2; var6 <= arg4; var6++) {
            for (int var7 = arg5; var7 <= arg1; var7++) {
                if (class193.field2775[var6][var7] == arg0 && class123.field1507[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(IIZ)V")
    public static final void method921(int arg0, int arg1, boolean arg2) {
        field1883++;
        class180 var3 = class311.field4398[arg1][arg0];
        if (var3 != null) {
            class85.field969 = var3.field2457;
            class223.field3134 = var3.field2463;
            class439.field6281 = var3.field2454;
        }
        class181.method1220(-1);
        if (!arg2) {
            method924((byte) 24, 121);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)V")
    public static final void method922(int arg0, int arg1, int arg2) {
        field1882++;
        class20 var3 = class369.method2351((byte) 126, arg2, arg1);
        var3.method146(119);
        var3.field252 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V")
    public static void method923(boolean arg0) {
        field1874 = null;
        field1876 = null;
        field1881 = null;
        field1879 = null;
        if (arg0) {
            field1884 = -18;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)Ljj;")
    public static final class60 method924(byte arg0, int arg1) {
        if (arg0 != 58) {
            field1876 = null;
        }
        field1878++;
        if (arg1 == 0) {
            if ((double) class308.field4355 == 3.0D) {
                return class11.field143;
            }
            if ((double) class308.field4355 == 4.0D) {
                return class302.field4256;
            }
            if ((double) class308.field4355 == 6.0D) {
                return class279.field3952;
            }
            if ((double) class308.field4355 >= 8.0D) {
                return class325.field4626;
            }
        } else if (arg1 == 1) {
            if ((double) class308.field4355 == 3.0D) {
                return class279.field3952;
            }
            if ((double) class308.field4355 == 4.0D) {
                return class325.field4626;
            }
            if ((double) class308.field4355 == 6.0D) {
                return class382.field5364;
            }
            if ((double) class308.field4355 >= 8.0D) {
                return class232.field3266;
            }
        } else if (arg1 == 2) {
            if ((double) class308.field4355 == 3.0D) {
                return class382.field5364;
            }
            if ((double) class308.field4355 == 4.0D) {
                return class232.field3266;
            }
            if ((double) class308.field4355 == 6.0D) {
                return class210.field2994;
            }
            if ((double) class308.field4355 >= 8.0D) {
                return class148.field1820;
            }
        }
        return null;
    }

    static {
        new class362("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }
}
