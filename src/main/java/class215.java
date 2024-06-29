import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class215 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[B")
    private byte[] field3056;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Ldv;")
    public static class566 field3054 = new class566(62, -1);

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Lej;")
    public static class104 field3066 = new class104("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lcba;")
    public static class471 field3069 = new class471(74, 1);

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Lej;")
    public static class104 field3073 = new class104("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public int field3049;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lwv;")
    public class30 field3061;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[I")
    public int[] field3051;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[I")
    public int[] field3057;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "[I")
    public int[] field3059;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
    public int[] field3063;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "[I")
    public int[] field3065;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "[I")
    public int[] field3067;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "[I")
    public static int[] field3072;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[Lwv;")
    public class30[] field3052;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field3070;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[[B")
    public byte[][] field3050;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[[I")
    public int[][] field3058;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "[[I")
    public int[][] field3060;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method1399(int arg0) {
        if (arg0 != 6) {
            method1399(-61);
        }
        field3070 = null;
        field3073 = null;
        field3072 = null;
        field3054 = null;
        field3066 = null;
        field3069 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([BI)V")
    private final void method1400(byte[] arg0, int arg1) {
        field3064++;
        class11 var3 = new class11(class142.method936(arg0, -121));
        int var4 = var3.method110((byte) 64);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3049 = 0;
        } else {
            this.field3049 = var3.method119(-70);
        }
        int var5 = var3.method110((byte) 66);
        boolean var6 = (var5 & 0x1) != 0;
        this.field3068 = var3.method93((byte) 81);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        int var9 = -1;
        this.field3065 = new int[this.field3068];
        int var10 = 0;
        if (arg1 != -30902) {
            return;
        }
        while (var10 < this.field3068) {
            this.field3065[var10] = var8 += var3.method93((byte) 75);
            if (this.field3065[var10] > var9) {
                var9 = this.field3065[var10];
            }
            var10++;
        }
        this.field3062 = var9 + 1;
        this.field3058 = new int[this.field3062][];
        this.field3051 = new int[this.field3062];
        if (var7) {
            this.field3050 = new byte[this.field3062][];
        }
        this.field3059 = new int[this.field3062];
        this.field3067 = new int[this.field3062];
        this.field3057 = new int[this.field3062];
        if (var6) {
            this.field3063 = new int[this.field3062];
            for (int var11 = 0; var11 < this.field3062; var11++) {
                this.field3063[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field3068; var12++) {
                this.field3063[this.field3065[var12]] = var3.method119(arg1 + 30847);
            }
            this.field3061 = new class30(this.field3063);
        }
        for (int var13 = 0; var13 < this.field3068; var13++) {
            this.field3057[this.field3065[var13]] = var3.method119(arg1 + 30846);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field3068; var14++) {
                byte[] var15 = new byte[64];
                var3.method75(0, 64, (byte) 105, var15);
                this.field3050[this.field3065[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field3068; var16++) {
            this.field3067[this.field3065[var16]] = var3.method119(class133.method898(arg1, 30941));
        }
        for (int var17 = 0; var17 < this.field3068; var17++) {
            this.field3051[this.field3065[var17]] = var3.method93((byte) 103);
        }
        for (int var18 = 0; var18 < this.field3068; var18++) {
            int var25 = this.field3065[var18];
            int var26 = 0;
            int var27 = this.field3051[var25];
            this.field3058[var25] = new int[var27];
            int var28 = -1;
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field3058[var25][var29] = var26 += var3.method93((byte) 76);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field3059[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field3058[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field3060 = new int[var9 + 1][];
        this.field3052 = new class30[var9 + 1];
        for (int var19 = 0; var19 < this.field3068; var19++) {
            int var20 = this.field3065[var19];
            int var21 = this.field3051[var20];
            this.field3060[var20] = new int[this.field3059[var20]];
            for (int var22 = 0; var22 < this.field3059[var20]; var22++) {
                this.field3060[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field3058[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field3058[var20][var23];
                }
                this.field3060[var20][var24] = var3.method119(class133.method898(arg1, 30916));
            }
            this.field3052[var20] = new class30(this.field3060[var20]);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([BI[B)V")
    public class215(byte[] arg0, int arg1, byte[] arg2) {
        this.field3053 = class23.method263(arg0, 125, arg0.length);
        if (this.field3053 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field3056 = class219.method1417(0, arg0.length, false, arg0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field3056[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method1400(arg0, -30902);
    }
}
