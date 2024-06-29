import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class132 {

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Ltl;")
    public static class59 field2181 = class85.method639("M", 9588);

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Ltl;")
    public static class59 field2179 = class85.method639("www)2wtrc", 9588);

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "Ltl;")
    public static class59 field2196 = class85.method639("Ladevorgang )2 bitte warten Sie)3", 9588);

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Ltl;")
    public static class59 field2183 = class85.method639("<br>", 9588);

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Ltl;")
    public static class59 field2186 = class85.method639("leuchten3:", 9588);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public int field2175;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public int field2182;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Lnb;")
    public class148 field2185;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[I")
    public int[] field2177;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[I")
    public int[] field2178;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "[I")
    public int[] field2180;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "[I")
    public int[] field2188;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "[I")
    public int[] field2189;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "[I")
    public int[] field2195;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "[Lnb;")
    public class148[] field2184;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "[[B")
    public static byte[][] field2193;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "[[I")
    public int[][] field2187;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "[[I")
    public int[][] field2192;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILma;)V", line = 7)
    public static final void method965(int arg0, int arg1, int arg2, class263 arg3) {
        field2190++;
        if (class301.field5145 != null || class85.field1336 || arg3 == null || class11.method80(9697, arg3) == null) {
            return;
        }
        class301.field5145 = arg3;
        if (arg2 >= -75) {
            method966(60);
        }
        class211.field3435 = class11.method80(9697, arg3);
        class114.field1863 = false;
        class62.field952 = arg0;
        class264.field4555 = arg1;
        class279.field4785 = 0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 32)
    public static final void method966(int arg0) {
        if (arg0 >= -120) {
            method969(55);
        }
        for (class297 var1 = (class297) class190.field3181.method692(64); var1 != null; var1 = (class297) class190.field3181.method693((byte) 106)) {
            int var2 = var1.field5089;
            if (class253.method1764(var2, 0)) {
                class263[] var3 = class239.field3986[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field4542;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field4932;
                    class263 var7 = class247.method1738(false, var6);
                    if (var7 != null) {
                        class140.method1019(var7, (byte) -80);
                    }
                }
            }
        }
        field2176++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z[B)V", line = 96)
    private final void method967(boolean arg0, byte[] arg1) {
        field2174++;
        class170 var3 = new class170(class68.method565(arg1, -1));
        int var4 = var3.method1221(106);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field2182 = 0;
        } else {
            this.field2182 = var3.method1233((byte) -77);
        }
        int var5 = -1;
        int var6 = 0;
        int var7 = var3.method1221(88);
        this.field2175 = var3.method1214(-18254);
        this.field2195 = new int[this.field2175];
        for (int var8 = 0; var8 < this.field2175; var8++) {
            this.field2195[var8] = var6 += var3.method1214(-18254);
            if (var5 < this.field2195[var8]) {
                var5 = this.field2195[var8];
            }
        }
        this.field2191 = var5 + 1;
        this.field2177 = new int[this.field2191];
        this.field2178 = new int[this.field2191];
        this.field2188 = new int[this.field2191];
        this.field2192 = new int[this.field2191][];
        if (!arg0) {
            this.field2191 = 115;
        }
        this.field2180 = new int[this.field2191];
        if (var7 != 0) {
            this.field2189 = new int[this.field2191];
            for (int var9 = 0; var9 < this.field2191; var9++) {
                this.field2189[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field2175; var10++) {
                this.field2189[this.field2195[var10]] = var3.method1233((byte) -77);
            }
            this.field2185 = new class148(this.field2189);
        }
        for (int var11 = 0; var11 < this.field2175; var11++) {
            this.field2180[this.field2195[var11]] = var3.method1233((byte) -77);
        }
        for (int var12 = 0; var12 < this.field2175; var12++) {
            this.field2178[this.field2195[var12]] = var3.method1233((byte) -77);
        }
        for (int var13 = 0; var13 < this.field2175; var13++) {
            this.field2177[this.field2195[var13]] = var3.method1214(-18254);
        }
        for (int var14 = 0; var14 < this.field2175; var14++) {
            int var15 = this.field2195[var14];
            int var16 = 0;
            int var17 = this.field2177[var15];
            this.field2192[var15] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field2192[var15][var19] = var16 += var3.method1214(-18254);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field2188[var15] = var18 + 1;
            if ((var18 + 1) == var17) {
                this.field2192[var15] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field2184 = new class148[var5 + 1];
        this.field2187 = new int[var5 + 1][];
        for (int var21 = 0; var21 < this.field2175; var21++) {
            int var22 = this.field2195[var21];
            int var23 = this.field2177[var22];
            this.field2187[var22] = new int[this.field2188[var22]];
            for (int var24 = 0; var24 < this.field2188[var22]; var24++) {
                this.field2187[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field2192[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field2192[var22][var25];
                }
                this.field2187[var22][var26] = var3.method1233((byte) -77);
            }
            this.field2184[var22] = new class148(this.field2187[var22]);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILwk;)V", line = 288)
    public static final void method968(int arg0, class105 arg1) {
        field2173++;
        int var2 = arg1.field1780 - class30.field420;
        if (arg0 >= -43) {
            return;
        }
        int var3 = arg1.field1722 * 128 + (arg1.method776(true) * 64);
        int var4 = arg1.field1757 * 128 + (arg1.method776(true) * 64);
        arg1.field1769 += (var4 - arg1.field1769) / var2;
        if (arg1.field1764 == 0) {
            arg1.field1750 = 1024;
        }
        if (arg1.field1764 == 1) {
            arg1.field1750 = 1536;
        }
        if (arg1.field1764 == 2) {
            arg1.field1750 = 0;
        }
        if (arg1.field1764 == 3) {
            arg1.field1750 = 512;
        }
        arg1.field1775 = 0;
        arg1.field1774 += (var3 - arg1.field1774) / var2;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 327)
    public static void method969(int arg0) {
        field2183 = null;
        if (arg0 != 0) {
            return;
        }
        field2181 = null;
        field2179 = null;
        field2196 = null;
        field2193 = (byte[][]) null;
        field2186 = null;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([BI)V", line = 368)
    public class132(byte[] arg0, int arg1) {
        this.field2198 = class232.method1618(-1255, arg0.length, arg0);
        if (this.field2198 != arg1) {
            throw new RuntimeException();
        }
        this.method967(true, arg0);
    }
}
