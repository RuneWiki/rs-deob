import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class73 extends class288 {

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
    public int[] field877;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "[[I")
    public int[][] field874;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "[Z")
    public boolean[] field870;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "[I")
    public int[] field876;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lrc;")
    public static class9 field875 = new class9(64);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field880 = 0;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Lac;")
    public static class127 field878;

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I[B)V")
    public class73(int arg0, byte[] arg1) {
        this.field879 = arg0;
        class216 var3 = new class216(arg1);
        this.field873 = var3.method1407(115);
        this.field877 = new int[this.field873];
        this.field874 = new int[this.field873][];
        this.field870 = new boolean[this.field873];
        this.field876 = new int[this.field873];
        for (int var4 = 0; var4 < this.field873; var4++) {
            this.field876[var4] = var3.method1407(120);
        }
        for (int var5 = 0; var5 < this.field873; var5++) {
            this.field870[var5] = var3.method1407(108) == 1;
        }
        for (int var6 = 0; var6 < this.field873; var6++) {
            this.field877[var6] = var3.method1380(true);
        }
        for (int var7 = 0; var7 < this.field873; var7++) {
            this.field874[var7] = new int[var3.method1407(108)];
        }
        for (int var8 = 0; var8 < this.field873; var8++) {
            for (int var9 = 0; var9 < this.field874[var8].length; var9++) {
                this.field874[var8][var9] = var3.method1407(104);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([BB)V")
    public static final void method451(byte[] arg0, byte arg1) {
        field871++;
        class216 var2 = new class216(arg0);
        var2.field3021 = arg0.length - 2;
        class133.field1921 = var2.method1380(true);
        class296.field4677 = new int[class133.field1921];
        class151.field2192 = new boolean[class133.field1921];
        class233.field3367 = new int[class133.field1921];
        class273.field4041 = new int[class133.field1921];
        class255.field3682 = new byte[class133.field1921][];
        class91.field1236 = new int[class133.field1921];
        class277.field4210 = new byte[class133.field1921][];
        var2.field3021 = arg0.length - class133.field1921 * 8 - 7;
        class238.field3435 = var2.method1380(true);
        class118.field1660 = var2.method1380(true);
        int var3 = (var2.method1407(117) & 0xFF) + 1;
        for (int var4 = 0; var4 < class133.field1921; var4++) {
            class233.field3367[var4] = var2.method1380(true);
        }
        for (int var5 = 0; var5 < class133.field1921; var5++) {
            class273.field4041[var5] = var2.method1380(true);
        }
        for (int var6 = 0; var6 < class133.field1921; var6++) {
            class296.field4677[var6] = var2.method1380(true);
        }
        for (int var7 = 0; var7 < class133.field1921; var7++) {
            class91.field1236[var7] = var2.method1380(true);
        }
        var2.field3021 = arg0.length - (var3 - 1) * 3 - (class133.field1921 * 8) - 7;
        class165.field2367 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class165.field2367[var8] = var2.method1382(-124);
            if (class165.field2367[var8] == 0) {
                class165.field2367[var8] = 1;
            }
        }
        var2.field3021 = 0;
        int var9 = 0;
        if (arg1 != 93) {
            field880 = -34;
        }
        while (var9 < class133.field1921) {
            int var10 = class296.field4677[var9];
            int var11 = class91.field1236[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class277.field4210[var9] = var14;
            boolean var15 = false;
            class255.field3682[var9] = var13;
            int var16 = var2.method1407(arg1 ^ 0x22);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var14[var17] = var2.method1355(true);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var13[var18] = var2.method1355(true);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label99: while (true) {
                    if (var10 <= var20) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var10 <= var21) {
                                break label99;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var13[var21 + (var10 * var22)] = var2.method1355(true);
                                var15 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var14[var20 + (var10 * var24)] = var2.method1355(true);
                    }
                    var20++;
                }
            }
            class151.field2192[var9] = var15;
            var9++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(CI)Z")
    public static final boolean method452(char arg0, int arg1) {
        field872++;
        if (arg1 != -20346) {
            method451((byte[]) null, (byte) -18);
        }
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            int var2 = 0;
            char[] var3 = class120.field1715;
            while (var2 < var3.length) {
                char var4 = var3[var2];
                if (arg0 == var4) {
                    return true;
                }
                var2++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V")
    public static void method453(byte arg0) {
        if (arg0 == 110) {
            field875 = null;
            field878 = null;
        }
    }
}
