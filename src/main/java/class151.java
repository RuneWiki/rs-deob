import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class151 {

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field2127 = 0;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "Lbg;")
    public static class324 field2132 = new class324(74, -1);

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "Lsl;")
    public static class318 field2146 = new class318(71, 2);

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "Lbg;")
    public static class324 field2147 = new class324(63, 4);

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "Lud;")
    public class27 field2137;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "Lqj;")
    public static class351 field2145;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "[I")
    public int[] field2126;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "[I")
    public int[] field2129;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "[I")
    public int[] field2130;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "[I")
    public int[] field2135;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "[I")
    public int[] field2142;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "[I")
    public int[] field2148;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "[Lud;")
    public class27[] field2141;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "[[I")
    public int[][] field2133;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "[[I")
    public int[][] field2134;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "([BI)V")
    private final void method1088(byte[] arg0, int arg1) {
        field2144++;
        class65 var3 = new class65(class251.method1633(arg0, false));
        int var4 = var3.method577(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field2139 = var3.method616((byte) 125);
        } else {
            this.field2139 = 0;
        }
        int var5 = var3.method577(255);
        this.field2128 = var3.method623((byte) -58);
        int var6 = 0;
        this.field2135 = new int[this.field2128];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field2128; var8++) {
            this.field2135[var8] = var6 += var3.method623((byte) -62);
            if (var7 < this.field2135[var8]) {
                var7 = this.field2135[var8];
            }
        }
        this.field2138 = arg1 + var7;
        this.field2129 = new int[this.field2138];
        this.field2148 = new int[this.field2138];
        this.field2130 = new int[this.field2138];
        this.field2126 = new int[this.field2138];
        this.field2133 = new int[this.field2138][];
        if (var5 != 0) {
            this.field2142 = new int[this.field2138];
            for (int var9 = 0; var9 < this.field2138; var9++) {
                this.field2142[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field2128; var10++) {
                this.field2142[this.field2135[var10]] = var3.method616((byte) 88);
            }
            this.field2137 = new class27(this.field2142);
        }
        for (int var11 = 0; var11 < this.field2128; var11++) {
            this.field2130[this.field2135[var11]] = var3.method616((byte) 112);
        }
        for (int var12 = 0; var12 < this.field2128; var12++) {
            this.field2129[this.field2135[var12]] = var3.method616((byte) 108);
        }
        for (int var13 = 0; var13 < this.field2128; var13++) {
            this.field2126[this.field2135[var13]] = var3.method623((byte) 105);
        }
        for (int var14 = 0; var14 < this.field2128; var14++) {
            int var21 = this.field2135[var14];
            int var22 = 0;
            int var23 = this.field2126[var21];
            int var24 = -1;
            this.field2133[var21] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field2133[var21][var25] = var22 += var3.method623((byte) 85);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field2148[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field2133[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field2141 = new class27[var7 + 1];
        this.field2134 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field2128; var15++) {
            int var16 = this.field2135[var15];
            int var17 = this.field2126[var16];
            this.field2134[var16] = new int[this.field2148[var16]];
            for (int var18 = 0; var18 < this.field2148[var16]; var18++) {
                this.field2134[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field2133[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field2133[var16][var19];
                }
                this.field2134[var16][var20] = var3.method616((byte) 91);
            }
            this.field2141[var16] = new class27(this.field2134[var16]);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZI)V")
    public static final void method1089(boolean arg0, int arg1) {
        if (class430.field6323 == null || arg1 > class430.field6323.length) {
            class430.field6323 = new int[arg1];
        }
        field2143++;
        if (arg0) {
            field2146 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
    public static void method1090(int arg0) {
        field2145 = null;
        field2147 = null;
        field2132 = null;
        field2146 = null;
        if (arg0 != -14932) {
            field2145 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "([BI)V")
    public class151(byte[] arg0, int arg1) {
        this.field2136 = class24.method202((byte) 54, arg0.length, arg0);
        if (this.field2136 != arg1) {
            throw new RuntimeException();
        }
        this.method1088(arg0, 1);
    }
}
