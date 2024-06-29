import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class143 {

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public int field2179;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "J")
    public static volatile long field2173 = 0L;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field2177 = 0;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[[B")
    public static byte[][] field2172 = new byte[1000][];

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "[C")
    public static char[] field2183 = new char[128];

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "[I")
    public static int[] field2194 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public int field2175;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "Lp;")
    public class292 field2197;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
    public int[] field2174;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[I")
    public int[] field2176;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[I")
    public int[] field2182;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "[I")
    public int[] field2184;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "[I")
    public int[] field2186;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "[I")
    public int[] field2190;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "[Lp;")
    public class292[] field2196;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[[I")
    public int[][] field2171;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "[[I")
    public int[][] field2180;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "[[I")
    public static int[][] field2195;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[[S")
    public static short[][] field2170;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "[[[I")
    public static int[][][] field2192;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method959(byte arg0) {
        field2194 = null;
        if (arg0 != 93) {
            method961((short[]) null, (byte) -94, (String[]) null);
        }
        field2170 = null;
        field2192 = null;
        field2183 = null;
        field2172 = null;
        field2195 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static final void method960(boolean arg0) {
        field2188++;
        class281.field4450.method1898((byte) 41);
        if (!arg0) {
            method961((short[]) null, (byte) 62, (String[]) null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([SB[Ljava/lang/String;)V")
    public static final void method961(short[] arg0, byte arg1, String[] arg2) {
        if (arg1 >= -122) {
            field2195 = null;
        }
        class139.method939(arg0, arg2.length - 1, 0, 7300, arg2);
        field2191++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    public static final void method962(int arg0, int arg1) {
        if (arg1 != -14575) {
            field2173 = 57L;
        }
        class244.field3971.method1897(true, arg0);
        field2189++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
    public static final void method963(int arg0, int arg1, int arg2, int arg3, int arg4) {
        client.field2435.field1535 = 0;
        field2178++;
        client.field2435.method654((byte) -117, 20);
        client.field2435.method654((byte) -97, arg3);
        client.field2435.method654((byte) -101, arg0);
        client.field2435.method634(arg2, 104);
        client.field2435.method634(arg4, arg1 ^ 0x22);
        class171.field2677 = -3;
        class47.field688 = 0;
        class255.field4087 = 1;
        class15.field234 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLhc;)I")
    public static final int method964(byte arg0, class235 arg1) {
        field2193++;
        if (arg0 != -20) {
            field2183 = null;
        }
        int var2 = 0;
        if (arg1.method1613(false, class173.field2729)) {
            var2++;
        }
        if (arg1.method1613(false, class111.field1813)) {
            var2++;
        }
        if (arg1.method1613(false, class72.field1170)) {
            var2++;
        }
        if (arg1.method1613(false, class60.field1026)) {
            var2++;
        }
        if (arg1.method1613(false, class231.field3679)) {
            var2++;
        }
        if (arg1.method1613(false, class239.field3881)) {
            var2++;
        }
        if (arg1.method1613(false, class95.field1616)) {
            var2++;
        }
        if (arg1.method1613(false, class229.field3647)) {
            var2++;
        }
        if (arg1.method1613(false, class34.field509)) {
            var2++;
        }
        if (arg1.method1613(false, class61.field1051)) {
            var2++;
        }
        if (arg1.method1613(false, class40.field581)) {
            var2++;
        }
        if (arg1.method1613(false, class203.field3166)) {
            var2++;
        }
        if (arg1.method1613(false, class5.field69)) {
            var2++;
        }
        if (arg1.method1613(false, class48.field696)) {
            var2++;
        }
        if (arg1.method1613(false, class204.field3182)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BB)V")
    private final void method965(byte[] arg0, byte arg1) {
        class88 var3 = new class88(class261.method1770(arg0, (byte) 109));
        field2187++;
        int var4 = var3.method633(89);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        int var5 = 0;
        if (var4 < 6) {
            this.field2185 = 0;
        } else {
            this.field2185 = var3.method641(-1);
        }
        if (arg1 != 115) {
            return;
        }
        int var6 = var3.method633(80);
        int var7 = -1;
        this.field2198 = var3.method645(arg1 + 11481);
        this.field2174 = new int[this.field2198];
        for (int var8 = 0; var8 < this.field2198; var8++) {
            this.field2174[var8] = var5 += var3.method645(11596);
            if (this.field2174[var8] > var7) {
                var7 = this.field2174[var8];
            }
        }
        this.field2175 = var7 + 1;
        this.field2176 = new int[this.field2175];
        this.field2186 = new int[this.field2175];
        this.field2190 = new int[this.field2175];
        this.field2182 = new int[this.field2175];
        this.field2171 = new int[this.field2175][];
        if (var6 != 0) {
            this.field2184 = new int[this.field2175];
            for (int var9 = 0; var9 < this.field2175; var9++) {
                this.field2184[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field2198; var10++) {
                this.field2184[this.field2174[var10]] = var3.method641(-1);
            }
            this.field2197 = new class292(this.field2184);
        }
        for (int var11 = 0; var11 < this.field2198; var11++) {
            this.field2182[this.field2174[var11]] = var3.method641(-1);
        }
        for (int var12 = 0; var12 < this.field2198; var12++) {
            this.field2176[this.field2174[var12]] = var3.method641(-1);
        }
        for (int var13 = 0; var13 < this.field2198; var13++) {
            this.field2186[this.field2174[var13]] = var3.method645(11596);
        }
        for (int var14 = 0; var14 < this.field2198; var14++) {
            int var21 = 0;
            int var22 = this.field2174[var14];
            int var23 = -1;
            int var24 = this.field2186[var22];
            this.field2171[var22] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field2171[var22][var25] = var21 += var3.method645(arg1 + 11481);
                if (var23 < var26) {
                    var23 = var26;
                }
            }
            this.field2190[var22] = var23 + 1;
            if ((var23 + 1) == var24) {
                this.field2171[var22] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2180 = new int[var7 + 1][];
        this.field2196 = new class292[var7 + 1];
        for (int var15 = 0; var15 < this.field2198; var15++) {
            int var16 = this.field2174[var15];
            int var17 = this.field2186[var16];
            this.field2180[var16] = new int[this.field2190[var16]];
            for (int var18 = 0; var18 < this.field2190[var16]; var18++) {
                this.field2180[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field2171[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field2171[var16][var19];
                }
                this.field2180[var16][var20] = var3.method641(-1);
            }
            this.field2196[var16] = new class292(this.field2180[var16]);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
    public static final void method966(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 95 % ((arg1 - 67) / 48);
        class140.method945((byte) -111, false);
        class94.field1598 = arg3;
        field2181++;
        class200.field3137 = arg0;
        class280.method1884(arg2, (byte) 105);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "([BI)V")
    public class143(byte[] arg0, int arg1) {
        this.field2179 = class69.method503(arg0.length, arg0, 0);
        if (this.field2179 != arg1) {
            throw new RuntimeException();
        }
        this.method965(arg0, (byte) 115);
    }
}
