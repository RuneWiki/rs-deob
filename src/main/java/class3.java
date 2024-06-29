import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class176 {

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "[Z")
    public boolean[] field43;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "[I")
    public int[] field38;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "[I")
    public int[] field36;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "[[I")
    public int[][] field41;

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "[I")
    public static int[] field37;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "[C")
    public static char[] field44;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "[Ldba;")
    public static class78[] field46;

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "[I")
    public static int[] field45;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "[I")
    public static int[] field34;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static final void method13(int arg0) {
        class244.field3410 = arg0;
        for (int var1 = 0; var1 < class332.field4447; var1++) {
            for (int var2 = 0; var2 < class34.field624; var2++) {
                if (class356.field4807[arg0][var1][var2] == null) {
                    class356.field4807[arg0][var1][var2] = new class622(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public static void method14(int arg0) {
        field46 = null;
        field44 = null;
        field37 = null;
        field45 = null;
        if (arg0 >= 59) {
            field34 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I[B)V")
    public class3(int arg0, byte[] arg1) {
        this.field42 = arg0;
        class11 var3 = new class11(arg1);
        this.field35 = var3.method110((byte) 64);
        this.field43 = new boolean[this.field35];
        this.field38 = new int[this.field35];
        this.field36 = new int[this.field35];
        this.field41 = new int[this.field35][];
        for (int var4 = 0; var4 < this.field35; var4++) {
            this.field38[var4] = var3.method110((byte) 77);
        }
        for (int var5 = 0; var5 < this.field35; var5++) {
            this.field43[var5] = var3.method110((byte) 62) == 1;
        }
        for (int var6 = 0; var6 < this.field35; var6++) {
            this.field36[var6] = var3.method93((byte) 82);
        }
        for (int var7 = 0; var7 < this.field35; var7++) {
            this.field41[var7] = new int[var3.method110((byte) 29)];
        }
        for (int var8 = 0; var8 < this.field35; var8++) {
            for (int var9 = 0; var9 < this.field41[var8].length; var9++) {
                this.field41[var8][var9] = var3.method110((byte) 117);
            }
        }
    }

    static {
        new class104("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field37 = new int[4096];
        field44 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };
        field46 = new class78[14];
        field45 = new int[] { 1, 2, 4, 8 };
    }
}
