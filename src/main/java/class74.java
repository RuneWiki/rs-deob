import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class74 {

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "[Llo;")
    public static class528[] field1099 = new class528[14];

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Llt;")
    public static class475 field1091 = new class475("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field1106 = 0;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Lfb;")
    public class474 field1100;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
    public int[] field1088;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
    public int[] field1089;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "[I")
    public int[] field1092;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "[I")
    public int[] field1096;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "[I")
    public int[] field1097;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "[I")
    public int[] field1104;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "[Lfb;")
    public class474[] field1098;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "[[I")
    public int[][] field1093;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "[[I")
    public int[][] field1102;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([BI)V", line = 4)
    private final void method421(byte[] arg0, int arg1) {
        field1087++;
        class209 var3 = new class209(class142.method941(arg0, arg1 ^ 0x3C));
        int var4 = var3.method1428(32122);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1095 = var3.method1452(65280);
        } else {
            this.field1095 = 0;
        }
        int var5 = var3.method1428(32122);
        this.field1094 = var3.method1450((byte) 122);
        int var6 = 0;
        int var7 = -1;
        this.field1096 = new int[this.field1094];
        for (int var8 = 0; var8 < this.field1094; var8++) {
            this.field1096[var8] = var6 += var3.method1450((byte) 84);
            if (var7 < this.field1096[var8]) {
                var7 = this.field1096[var8];
            }
        }
        this.field1103 = var7 + 1;
        this.field1102 = new int[this.field1103][];
        this.field1092 = new int[this.field1103];
        this.field1097 = new int[this.field1103];
        this.field1088 = new int[this.field1103];
        this.field1089 = new int[this.field1103];
        if (var5 != 0) {
            this.field1104 = new int[this.field1103];
            for (int var9 = 0; var9 < this.field1103; var9++) {
                this.field1104[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1094; var10++) {
                this.field1104[this.field1096[var10]] = var3.method1452(65280);
            }
            this.field1100 = new class474(this.field1104);
        }
        for (int var11 = 0; var11 < this.field1094; var11++) {
            this.field1092[this.field1096[var11]] = var3.method1452(65280);
        }
        for (int var12 = 0; var12 < this.field1094; var12++) {
            this.field1088[this.field1096[var12]] = var3.method1452(65280);
        }
        for (int var13 = 0; var13 < this.field1094; var13++) {
            this.field1097[this.field1096[var13]] = var3.method1450((byte) 26);
        }
        for (int var14 = arg1; var14 < this.field1094; var14++) {
            int var21 = this.field1096[var14];
            int var22 = this.field1097[var21];
            int var23 = 0;
            int var24 = -1;
            this.field1102[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field1102[var21][var25] = var23 += var3.method1450((byte) 105);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field1089[var21] = var24 + 1;
            if ((var24 + 1) == var22) {
                this.field1102[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1093 = new int[var7 + 1][];
        this.field1098 = new class474[var7 + 1];
        for (int var15 = 0; var15 < this.field1094; var15++) {
            int var16 = this.field1096[var15];
            int var17 = this.field1097[var16];
            this.field1093[var16] = new int[this.field1089[var16]];
            for (int var18 = 0; var18 < this.field1089[var16]; var18++) {
                this.field1093[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1102[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1102[var16][var19];
                }
                this.field1093[var16][var20] = var3.method1452(65280);
            }
            this.field1098[var16] = new class474(this.field1093[var16]);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 184)
    public static final void method422(int arg0) {
        field1101++;
        class49.field797 = true;
        if (arg0 != 0) {
            method422(-16);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 201)
    public static void method423(byte arg0) {
        field1099 = null;
        field1091 = null;
        if (arg0 != 120) {
            method422(-1);
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([BI)V", line = 227)
    public class74(byte[] arg0, int arg1) {
        this.field1090 = class64.method377(arg0.length, arg0, -1);
        if (this.field1090 != arg1) {
            throw new RuntimeException();
        }
        this.method421(arg0, 0);
    }
}
