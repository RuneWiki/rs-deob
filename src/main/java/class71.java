import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class71 {

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public int field1020;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Lch;")
    public static class151 field1019 = new class151("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Lrc;")
    public static class108 field1031 = new class108(0, 6);

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field1032 = 0;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lhk;")
    public class91 field1016;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "[I")
    public int[] field1017;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "[I")
    public int[] field1021;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "[I")
    public int[] field1024;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "[I")
    public int[] field1027;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "[I")
    public int[] field1028;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "[I")
    public int[] field1029;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "[Lhk;")
    public class91[] field1030;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[[I")
    public int[][] field1018;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "[[I")
    public int[][] field1025;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([BI)V", line = 24)
    public class71(byte[] arg0, int arg1) {
        this.field1020 = class349.method2163(arg0, arg0.length, false);
        if (this.field1020 != arg1) {
            throw new RuntimeException();
        }
        this.method644((byte) -127, arg0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 44)
    public static void method643(byte arg0) {
        field1019 = null;
        field1031 = null;
        int var1 = 53 % ((arg0 - 73) / 48);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B[B)V", line = 54)
    private final void method644(byte arg0, byte[] arg1) {
        field1023++;
        class161 var3 = new class161(class118.method921(arg1, true));
        int var4 = var3.method1172((byte) 80);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1026 = var3.method1168(255);
        } else {
            this.field1026 = 0;
        }
        int var5 = var3.method1172((byte) -110);
        this.field1022 = var3.method1134(-16848);
        int var6 = 0;
        int var7 = -1;
        this.field1028 = new int[this.field1022];
        for (int var8 = 0; var8 < this.field1022; var8++) {
            this.field1028[var8] = var6 += var3.method1134(-16848);
            if (var7 < this.field1028[var8]) {
                var7 = this.field1028[var8];
            }
        }
        if (arg0 >= -124) {
            this.field1029 = null;
        }
        this.field1015 = var7 + 1;
        this.field1017 = new int[this.field1015];
        this.field1029 = new int[this.field1015];
        this.field1021 = new int[this.field1015];
        this.field1027 = new int[this.field1015];
        this.field1018 = new int[this.field1015][];
        if (var5 != 0) {
            this.field1024 = new int[this.field1015];
            for (int var9 = 0; var9 < this.field1015; var9++) {
                this.field1024[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1022; var10++) {
                this.field1024[this.field1028[var10]] = var3.method1168(255);
            }
            this.field1016 = new class91(this.field1024);
        }
        for (int var11 = 0; var11 < this.field1022; var11++) {
            this.field1029[this.field1028[var11]] = var3.method1168(255);
        }
        for (int var12 = 0; var12 < this.field1022; var12++) {
            this.field1021[this.field1028[var12]] = var3.method1168(255);
        }
        for (int var13 = 0; var13 < this.field1022; var13++) {
            this.field1027[this.field1028[var13]] = var3.method1134(-16848);
        }
        for (int var14 = 0; var14 < this.field1022; var14++) {
            int var21 = this.field1028[var14];
            int var22 = 0;
            int var23 = this.field1027[var21];
            this.field1018[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field1018[var21][var25] = var22 += var3.method1134(-16848);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field1017[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field1018[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1025 = new int[var7 + 1][];
        this.field1030 = new class91[var7 + 1];
        for (int var15 = 0; var15 < this.field1022; var15++) {
            int var16 = this.field1028[var15];
            int var17 = this.field1027[var16];
            this.field1025[var16] = new int[this.field1017[var16]];
            for (int var18 = 0; var18 < this.field1017[var16]; var18++) {
                this.field1025[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1018[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1018[var16][var19];
                }
                this.field1025[var16][var20] = var3.method1168(255);
            }
            this.field1030[var16] = new class91(this.field1025[var16]);
        }
    }
}
