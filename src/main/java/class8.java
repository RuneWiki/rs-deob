import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class8 {

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lha;")
    public static class46 field135 = class271.method1828("hint_mapmarkers", -46);

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lpi;")
    public static class181 field123;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lsa;")
    public class230 field131;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lrc;")
    public static class9 field130;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[B")
    public static byte[] field126;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[I")
    public int[] field121;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[I")
    public int[] field124;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "[I")
    public int[] field133;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "[I")
    public int[] field134;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "[I")
    public int[] field139;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "[I")
    public int[] field141;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[Lkg;")
    public static class21[] field127;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[Lsa;")
    public class230[] field137;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "[[I")
    public int[][] field128;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "[[I")
    public int[][] field132;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[[S")
    public static short[][] field122;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[B)V")
    private final void method33(int arg0, byte[] arg1) {
        class75 var3 = new class75(class61.method415((byte) -90, arg1));
        int var4 = var3.method558(1);
        field136++;
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field140 = 0;
        } else {
            this.field140 = var3.method562((byte) -71);
        }
        int var5 = var3.method558(1);
        this.field125 = var3.method545((byte) -112);
        this.field139 = new int[this.field125];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field125; var8++) {
            this.field139[var8] = var6 += var3.method545((byte) -84);
            if (this.field139[var8] > var7) {
                var7 = this.field139[var8];
            }
        }
        this.field138 = var7 + 1;
        this.field121 = new int[this.field138];
        this.field124 = new int[this.field138];
        this.field132 = new int[this.field138][];
        this.field141 = new int[this.field138];
        this.field134 = new int[this.field138];
        if (var5 != 0) {
            this.field133 = new int[this.field138];
            for (int var9 = 0; var9 < this.field138; var9++) {
                this.field133[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field125; var10++) {
                this.field133[this.field139[var10]] = var3.method562((byte) -71);
            }
            this.field131 = new class230(this.field133);
        }
        int var11 = -86 / ((-arg0 - 34) / 43);
        for (int var12 = 0; var12 < this.field125; var12++) {
            this.field124[this.field139[var12]] = var3.method562((byte) -71);
        }
        for (int var13 = 0; var13 < this.field125; var13++) {
            this.field141[this.field139[var13]] = var3.method562((byte) -71);
        }
        for (int var14 = 0; var14 < this.field125; var14++) {
            this.field121[this.field139[var14]] = var3.method545((byte) 92);
        }
        for (int var15 = 0; var15 < this.field125; var15++) {
            int var22 = 0;
            int var23 = this.field139[var15];
            int var24 = this.field121[var23];
            int var25 = -1;
            this.field132[var23] = new int[var24];
            for (int var26 = 0; var26 < var24; var26++) {
                int var27 = this.field132[var23][var26] = var22 += var3.method545((byte) -58);
                if (var25 < var27) {
                    var25 = var27;
                }
            }
            this.field134[var23] = var25 + 1;
            if ((var25 + 1) == var24) {
                this.field132[var23] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field128 = new int[var7 + 1][];
        this.field137 = new class230[var7 + 1];
        for (int var16 = 0; var16 < this.field125; var16++) {
            int var17 = this.field139[var16];
            int var18 = this.field121[var17];
            this.field128[var17] = new int[this.field134[var17]];
            for (int var19 = 0; var19 < this.field134[var17]; var19++) {
                this.field128[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field132[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field132[var17][var20];
                }
                this.field128[var17][var21] = var3.method562((byte) -71);
            }
            this.field137[var17] = new class230(this.field128[var17]);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method34(int arg0) {
        if (arg0 != -7) {
            field122 = null;
        }
        field126 = null;
        field127 = null;
        field130 = null;
        field135 = null;
        field123 = null;
        field122 = null;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "([BI)V")
    public class8(byte[] arg0, int arg1) {
        this.field129 = class168.method1193(arg0.length, arg0, -49);
        if (this.field129 != arg1) {
            throw new RuntimeException();
        }
        this.method33(-124, arg0);
    }
}
