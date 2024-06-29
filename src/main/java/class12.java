import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 extends class86 {

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "[I")
    public int[] field190;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "[Z")
    public boolean[] field197;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "[[I")
    public int[][] field194;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "[I")
    public int[] field192;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "[I")
    public static int[] field189 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "Lph;")
    public static class438 field199;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "Lqg;")
    public static class307 field198;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public static void method97(int arg0) {
        field199 = null;
        field198 = null;
        if (arg0 != -23195) {
            field198 = null;
        }
        field189 = null;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(I[B)V")
    public class12(int arg0, byte[] arg1) {
        this.field195 = arg0;
        class156 var3 = new class156(arg1);
        this.field191 = var3.method941((byte) 123);
        this.field190 = new int[this.field191];
        this.field197 = new boolean[this.field191];
        this.field194 = new int[this.field191][];
        this.field192 = new int[this.field191];
        for (int var4 = 0; var4 < this.field191; var4++) {
            this.field192[var4] = var3.method941((byte) 125);
        }
        for (int var5 = 0; var5 < this.field191; var5++) {
            this.field197[var5] = var3.method941((byte) 126) == 1;
        }
        for (int var6 = 0; var6 < this.field191; var6++) {
            this.field190[var6] = var3.method993((byte) -75);
        }
        for (int var7 = 0; var7 < this.field191; var7++) {
            this.field194[var7] = new int[var3.method941((byte) 123)];
        }
        for (int var8 = 0; var8 < this.field191; var8++) {
            for (int var9 = 0; var9 < this.field194[var8].length; var9++) {
                this.field194[var8][var9] = var3.method941((byte) 126);
            }
        }
    }

    static {
        new class194("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field199 = new class438("WTI", 5);
    }
}
