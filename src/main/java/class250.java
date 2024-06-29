import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class250 extends class43 {

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public int field3292;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "[Z")
    public boolean[] field3290;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "[I")
    public int[] field3288;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "[I")
    public int[] field3285;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "[[I")
    public int[][] field3284;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "[[S")
    public static short[][] field3289;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static void method1624(int arg0) {
        field3289 = null;
        int var1 = -78 / ((arg0 - 76) / 49);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    public static final void method1625(int arg0) {
        field3293++;
        for (int var1 = 0; var1 < 5; var1++) {
            class310.field4187[var1] = false;
        }
        int var2 = -14 % ((arg0 - 93) / 32);
        class255.field3313 = 0;
        class320.field4294 = 1;
        client.field6059 = 0;
        class258.field3339 = -1;
        class234.field3086 = -1;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I[B)V")
    public class250(int arg0, byte[] arg1) {
        this.field3291 = arg0;
        class242 var3 = new class242(arg1);
        this.field3292 = var3.method1563(-128);
        this.field3290 = new boolean[this.field3292];
        this.field3288 = new int[this.field3292];
        this.field3285 = new int[this.field3292];
        this.field3284 = new int[this.field3292][];
        for (int var4 = 0; var4 < this.field3292; var4++) {
            this.field3285[var4] = var3.method1563(-128);
        }
        for (int var5 = 0; var5 < this.field3292; var5++) {
            this.field3290[var5] = var3.method1563(-128) == 1;
        }
        for (int var6 = 0; var6 < this.field3292; var6++) {
            this.field3288[var6] = var3.method1587((byte) -102);
        }
        for (int var7 = 0; var7 < this.field3292; var7++) {
            this.field3284[var7] = new int[var3.method1563(-128)];
        }
        for (int var8 = 0; var8 < this.field3292; var8++) {
            for (int var9 = 0; var9 < this.field3284[var8].length; var9++) {
                this.field3284[var8][var9] = var3.method1563(-128);
            }
        }
    }

    static {
        new class72("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field3289 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    }
}
