import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class356 {

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public int field5161;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5145 = "Discard";

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field5146 = 0;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "[I")
    public static int[] field5156 = new int[200];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public int field5150;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public int field5154;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public int field5159;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "Lkj;")
    public class235 field5158;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "[I")
    public int[] field5142;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
    public int[] field5144;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "[I")
    public int[] field5147;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "[I")
    public int[] field5148;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[I")
    public int[] field5149;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "[I")
    public int[] field5157;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[Lkj;")
    public class235[] field5153;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[[I")
    public int[][] field5143;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "[[I")
    public int[][] field5160;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Llm;B)V")
    public static final void method2334(class347 arg0, byte arg1) {
        class142.field1924 = arg0;
        field5152++;
        if (arg1 <= 100) {
            field5145 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method2335(int arg0) {
        if (arg0 == -10380) {
            field5156 = null;
            field5145 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I[B)V")
    private final void method2336(int arg0, byte[] arg1) {
        field5141++;
        class228 var3 = new class228(class38.method275(arg1, (byte) -8));
        int var4 = var3.method1348(-120);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field5150 = var3.method1344((byte) 44);
        } else {
            this.field5150 = 0;
        }
        int var5 = var3.method1348(-93);
        this.field5159 = var3.method1343(255);
        int var6 = 0;
        int var7 = -1;
        this.field5147 = new int[this.field5159];
        for (int var8 = 0; var8 < this.field5159; var8++) {
            this.field5147[var8] = var6 += var3.method1343(arg0 + 255);
            if (this.field5147[var8] > var7) {
                var7 = this.field5147[var8];
            }
        }
        this.field5154 = var7 + 1;
        this.field5144 = new int[this.field5154];
        this.field5149 = new int[this.field5154];
        this.field5143 = new int[this.field5154][];
        this.field5148 = new int[this.field5154];
        this.field5142 = new int[this.field5154];
        if (var5 != 0) {
            this.field5157 = new int[this.field5154];
            for (int var9 = 0; var9 < this.field5154; var9++) {
                this.field5157[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field5159; var10++) {
                this.field5157[this.field5147[var10]] = var3.method1344((byte) 47);
            }
            this.field5158 = new class235(this.field5157);
        }
        for (int var11 = arg0; var11 < this.field5159; var11++) {
            this.field5144[this.field5147[var11]] = var3.method1344((byte) 89);
        }
        for (int var12 = 0; var12 < this.field5159; var12++) {
            this.field5148[this.field5147[var12]] = var3.method1344((byte) 45);
        }
        for (int var13 = 0; var13 < this.field5159; var13++) {
            this.field5142[this.field5147[var13]] = var3.method1343(255);
        }
        for (int var14 = 0; var14 < this.field5159; var14++) {
            int var21 = this.field5147[var14];
            int var22 = 0;
            int var23 = this.field5142[var21];
            this.field5143[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field5143[var21][var25] = var22 += var3.method1343(255);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field5149[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field5143[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field5153 = new class235[var7 + 1];
        this.field5160 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field5159; var15++) {
            int var16 = this.field5147[var15];
            int var17 = this.field5142[var16];
            this.field5160[var16] = new int[this.field5149[var16]];
            for (int var18 = 0; var18 < this.field5149[var16]; var18++) {
                this.field5160[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field5143[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field5143[var16][var19];
                }
                this.field5160[var16][var20] = var3.method1344((byte) 52);
            }
            this.field5153[var16] = new class235(this.field5160[var16]);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static final void method2337(byte arg0) {
        class189 var1 = class125.field1762;
        synchronized (class125.field1762) {
            class125.field1762.method1141(256);
            int var2 = -119 % ((37 - arg0) / 59);
        }
        field5151++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    public static final void method2338(int arg0, int arg1) {
        class276.field3994 = arg0;
        field5155++;
        if (arg1 != 0) {
            method2334((class347) null, (byte) 98);
        }
        class237.field3160.method1141(256);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "([BI)V")
    public class356(byte[] arg0, int arg1) {
        this.field5161 = class17.method109((byte) -99, arg0, arg0.length);
        if (this.field5161 != arg1) {
            throw new RuntimeException();
        }
        this.method2336(0, arg0);
    }
}
