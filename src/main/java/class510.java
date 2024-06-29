import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class510 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "[Z")
    public boolean[] field7331 = new boolean[16];

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "[[I")
    public int[][] field7332 = new int[6][258];

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "[B")
    public byte[] field7338 = new byte[256];

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "[B")
    public byte[] field7341 = new byte[4096];

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "[I")
    public int[] field7339 = new int[257];

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "[Z")
    public boolean[] field7340 = new boolean[256];

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "[[I")
    public int[][] field7343 = new int[6][258];

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public int field7347 = 0;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "[[B")
    public byte[][] field7350 = new byte[6][258];

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "[[I")
    public int[][] field7352 = new int[6][258];

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "[I")
    public int[] field7356 = new int[6];

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public int field7355 = 0;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "[I")
    public int[] field7357 = new int[16];

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "[B")
    public byte[] field7346 = new byte[18002];

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "[B")
    public byte[] field7335 = new byte[18002];

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "[I")
    public int[] field7361 = new int[256];

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "Lap;")
    public static class335 field7364 = new class335("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "[[I")
    public static int[][] field7365 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "B")
    public byte field7354;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public int field7333;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public int field7334;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public int field7337;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public int field7342;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public int field7344;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public int field7345;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public int field7349;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
    public int field7351;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public int field7353;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
    public int field7359;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public int field7360;

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
    public int field7362;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
    public int field7363;

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "[B")
    public byte[] field7336;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "[B")
    public byte[] field7358;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "[Ll;")
    public static class16[] field7366;

    static {
        new class335("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field7368 = 0;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lya;I)V", line = 75)
    public static final void method3050(class38 arg0, int arg1) {
        field7348++;
        if (arg1 != 6) {
            field7364 = null;
        }
        if (class533.field7841 != class23.field336.field2676 && class125.field1664 != null && class46.method451(-1, arg0, class23.field336.field2676)) {
            class533.field7841 = class23.field336.field2676;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 127)
    public static void method3051(byte arg0) {
        field7366 = null;
        if (arg0 > -31) {
            method3050(null, -57);
        }
        field7364 = null;
        field7365 = null;
    }
}
