import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class462 extends class320 {

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public int field6920;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public int field6912;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    private int field6913;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public int field6910;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "F")
    public float field6916;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    private int field6915;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Lpi;")
    public static class342 field6917 = new class342("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Lrn;")
    public static class174 field6927;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "J")
    public static long field6919;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "Z")
    public static boolean field6925;

    static {
        new class342("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field6927 = new class174(38, 3);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ICI)C", line = 7)
    public static final char method2743(int arg0, char arg1, int arg2) {
        field6923++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 != -242) {
            return (char) 65431;
        } else if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)I", line = 96)
    public final int method2744(int arg0) {
        field6911++;
        return arg0 == -254 ? this.field6910 : 43;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Lrl;", line = 109)
    public static final class506 method2745(int arg0, int arg1, int arg2) {
        class429 var3 = class380.field5761[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6380;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)I", line = 116)
    public final int method2746(byte arg0) {
        if (arg0 > -6) {
            method2743(103, '$', 104);
        }
        field6922++;
        return this.field6912;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIII)I", line = 127)
    public static final int method2747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6914++;
        if (arg2 != -29432) {
            method2743(-69, (char) 65515, -115);
        }
        if (class88.field1546 == null) {
            return 0;
        }
        if (arg5 < 3) {
            int var6 = arg4 >> 7;
            int var7 = arg0 >> 7;
            if (arg1 < 0 || arg3 < 0 || (class33.field662 - 1) < arg1 || arg3 > (class121.field1966 - 1)) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class33.field662 - 1 < var6 || var7 > (class121.field1966 - 1)) {
                return 0;
            }
            boolean var8 = (class260.field3784[1][arg4 >> 7][arg0 >> 7] & 0x2) != 0;
            if ((arg4 & 0x7F) == 0) {
                boolean var9 = (class260.field3784[1][var6 - 1][arg0 >> 7] & 0x2) != 0;
                boolean var10 = (class260.field3784[1][var6][arg0 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class260.field3784[1][arg1][arg3] & 0x2) != 0;
                }
            }
            if ((arg0 & 0x7F) == 0) {
                boolean var11 = (class260.field3784[1][arg4 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class260.field3784[1][arg4 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class260.field3784[1][arg1][arg3] & 0x2) != 0;
                }
            }
            if (var8) {
                arg5++;
            }
        }
        return class88.field1546[arg5].method371(arg4, arg0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)F", line = 186)
    public final float method2748(boolean arg0) {
        field6918++;
        if (!arg0) {
            method2747(124, 94, 73, 22, -77, -27);
        }
        return this.field6916;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)I", line = 199)
    public final int method2749(byte arg0) {
        if (arg0 >= -60) {
            method2747(37, -26, -104, 4, 90, 43);
        }
        field6924++;
        return this.field6915;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)I", line = 213)
    public final int method2750(boolean arg0) {
        field6926++;
        if (!arg0) {
            field6919 = 61L;
        }
        return this.field6913;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIIF)V", line = 223)
    public class462(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6920 = arg0;
        this.field6912 = arg1;
        this.field6913 = arg4;
        this.field6910 = arg2;
        this.field6916 = arg5;
        this.field6915 = arg3;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 237)
    public static void method2751(int arg0) {
        field6917 = null;
        field6927 = null;
        if (arg0 >= -81) {
            method2747(102, 50, 4, -106, -96, 88);
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)I", line = 254)
    public final int method2752(int arg0) {
        field6921++;
        if (arg0 != -25273) {
            field6917 = null;
        }
        return this.field6920;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(FZ)V")
    public abstract void method1411(float arg0, boolean arg1);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBII)V")
    public abstract void method1413(int arg0, byte arg1, int arg2, int arg3);
}
