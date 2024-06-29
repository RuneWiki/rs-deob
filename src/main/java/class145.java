import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class145 extends class67 {

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    private int field2975;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "[[I")
    public int[][] field2974;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "[Z")
    private boolean[] field2981;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "[I")
    public int[] field2982;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Led;")
    private static class43 field2972 = class191.method1219("Please contact customer support)3", false);

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field2977 = 0;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "Led;")
    public static class43 field2985 = class191.method1219("Spiel)2Engine wird gestartet)3)3)3", false);

    @OriginalMember(owner = "client!q", name = "A", descriptor = "[[I")
    public static int[][] field2978 = new int[104][104];

    @OriginalMember(owner = "client!q", name = "J", descriptor = "Led;")
    public static class43 field2987 = field2972;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "Led;")
    public static class43 field2983 = class191.method1219("Anmelde)2Limit -Uberschritten)3", false);

    @OriginalMember(owner = "client!q", name = "C", descriptor = "[Lph;")
    public static class144[] field2980 = new class144[6];

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "[Ltg;")
    public static class179[] field2973;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public static final int method915(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field2988++;
        if (arg1 != -16431) {
            field2978 = null;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
    public static void method916(int arg0) {
        field2973 = null;
        field2978 = null;
        field2985 = null;
        int var1 = 101 / ((arg0 - 21) / 56);
        field2987 = null;
        field2980 = null;
        field2972 = null;
        field2983 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([IIII)I")
    public static final int method917(int[] arg0, int arg1, int arg2, int arg3) {
        field2984++;
        if (arg3 != 0) {
            method919(-127, 10, false);
        }
        return arg0[0] * arg1 + arg0[1] * arg2;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static final void method918(byte arg0) {
        field2986++;
        class57.field1122 = 0;
        if (arg0 < 23) {
            return;
        }
        int var1 = (class67.field1348.field2347 >> 7) + class170.field3393;
        int var2 = (class67.field1348.field2328 >> 7) + class83.field1641;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class57.field1122 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class57.field1122 = 1;
        }
        if (class57.field1122 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class57.field1122 = 0;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I[B)V")
    public class145(int arg0, byte[] arg1) {
        this.field2976 = arg0;
        class89 var3 = new class89(arg1);
        this.field2975 = var3.method538((byte) -83);
        this.field2974 = new int[this.field2975][];
        this.field2981 = new boolean[this.field2975];
        this.field2982 = new int[this.field2975];
        for (int var4 = 0; var4 < this.field2975; var4++) {
            this.field2982[var4] = var3.method538((byte) -35);
        }
        for (int var5 = 0; var5 < this.field2975; var5++) {
            this.field2981[var5] = var3.method538((byte) -76) == 1;
        }
        for (int var6 = 0; var6 < this.field2975; var6++) {
            this.field2974[var6] = new int[var3.method538((byte) -85)];
        }
        for (int var7 = 0; var7 < this.field2975; var7++) {
            for (int var8 = 0; var8 < this.field2974[var7].length; var8++) {
                this.field2974[var7][var8] = var3.method538((byte) 110);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method919(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method917(null, -113, 82, -21);
        }
        field2979++;
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }
}
