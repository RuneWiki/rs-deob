import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class181 extends class496 {

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[[I")
    public int[][] field2776;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[Z")
    public boolean[] field2777;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[I")
    public int[] field2779;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "[I")
    public int[] field2780;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Loda;")
    public static class559 field2783 = new class559("stellardawn", 1);

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lnj;")
    public static class487 field2784 = new class487("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "[[Z")
    public static boolean[][] field2786;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1207(int arg0) {
        field2784 = null;
        field2783 = null;
        int var1 = -78 % ((arg0 - 43) / 54);
        field2786 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ldda;Ldda;I)I")
    public static final int method1208(class597 arg0, class597 arg1, int arg2) {
        field2778++;
        if (arg2 != -2) {
            field2785 = -108;
        }
        int var3 = 0;
        if (arg0.method3491(127, class94.field1171)) {
            var3++;
        }
        if (arg0.method3491(104, class297.field4346)) {
            var3++;
        }
        if (arg0.method3491(114, class264.field3927)) {
            var3++;
        }
        if (arg1.method3491(115, class94.field1171)) {
            var3++;
        }
        if (arg1.method3491(108, class297.field4346)) {
            var3++;
        }
        if (arg1.method3491(123, class264.field3927)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I[B)V")
    public class181(int arg0, byte[] arg1) {
        this.field2781 = arg0;
        class428 var3 = new class428(arg1);
        this.field2775 = var3.method2561((byte) -73);
        this.field2776 = new int[this.field2775][];
        this.field2777 = new boolean[this.field2775];
        this.field2779 = new int[this.field2775];
        this.field2780 = new int[this.field2775];
        for (int var4 = 0; var4 < this.field2775; var4++) {
            this.field2779[var4] = var3.method2561((byte) 127);
        }
        for (int var5 = 0; var5 < this.field2775; var5++) {
            this.field2777[var5] = var3.method2561((byte) 124) == 1;
        }
        for (int var6 = 0; var6 < this.field2775; var6++) {
            this.field2780[var6] = var3.method2620(53);
        }
        for (int var7 = 0; var7 < this.field2775; var7++) {
            this.field2776[var7] = new int[var3.method2561((byte) -81)];
        }
        for (int var8 = 0; var8 < this.field2775; var8++) {
            for (int var9 = 0; var9 < this.field2776[var8].length; var9++) {
                this.field2776[var8][var9] = var3.method2561((byte) -33);
            }
        }
    }
}
