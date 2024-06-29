import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class229 {

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "[Z")
    public static boolean[] field3276 = new boolean[100];

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Z")
    public static boolean field3275 = false;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public int field3281;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "Lfh;")
    public static class140 field3278;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "Lfh;")
    public static class140 field3287;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "Lgf;")
    public class182 field3282;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "[I")
    public int[] field3274;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "[I")
    public int[] field3279;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "[I")
    public int[] field3285;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "[I")
    public int[] field3292;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "[I")
    public int[] field3294;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "[I")
    public int[] field3295;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "[Lgf;")
    public class182[] field3290;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "[[I")
    public int[][] field3277;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "[[I")
    public int[][] field3284;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)Ljf;", line = 16)
    public static final class265 method1640(byte arg0) {
        field3291++;
        try {
            return new class246();
        } catch (Throwable var4) {
            try {
                if (arg0 > -123) {
                    field3278 = (class140) null;
                }
                return (class265) Class.forName("hf").getDeclaredConstructor().newInstance();
            } catch (Throwable var3) {
                return new class31();
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V", line = 39)
    public static final void method1641(int arg0, byte arg1) {
        field3283++;
        if (arg1 >= 103) {
            class321.field4713.method2258((byte) 86);
            class321.field4713 = new class327(arg0);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V", line = 51)
    public static void method1642(boolean arg0) {
        field3287 = null;
        if (arg0) {
            field3278 = null;
            field3276 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([BI)V", line = 75)
    private final void method1643(byte[] arg0, int arg1) {
        class299 var3 = new class299(class170.method1257(true, arg0));
        int var4 = var3.method2096((byte) -122);
        field3286++;
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3280 = var3.method2062(-25795);
        } else {
            this.field3280 = 0;
        }
        int var5 = 0;
        int var6 = var3.method2096((byte) -122);
        this.field3281 = var3.method2083((byte) -116);
        int var7 = -1;
        this.field3294 = new int[this.field3281];
        for (int var8 = 0; var8 < this.field3281; var8++) {
            this.field3294[var8] = var5 += var3.method2083((byte) -84);
            if (var7 < this.field3294[var8]) {
                var7 = this.field3294[var8];
            }
        }
        this.field3296 = var7 + 1;
        this.field3285 = new int[this.field3296];
        this.field3279 = new int[this.field3296];
        this.field3277 = new int[this.field3296][];
        this.field3274 = new int[this.field3296];
        this.field3295 = new int[this.field3296];
        if (var6 != 0) {
            this.field3292 = new int[this.field3296];
            for (int var9 = 0; var9 < this.field3296; var9++) {
                this.field3292[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3281; var10++) {
                this.field3292[this.field3294[var10]] = var3.method2062(-25795);
            }
            this.field3282 = new class182(this.field3292);
        }
        for (int var11 = 0; var11 < this.field3281; var11++) {
            this.field3279[this.field3294[var11]] = var3.method2062(-25795);
        }
        for (int var12 = 0; var12 < this.field3281; var12++) {
            this.field3295[this.field3294[var12]] = var3.method2062(-25795);
        }
        for (int var13 = 0; var13 < this.field3281; var13++) {
            this.field3285[this.field3294[var13]] = var3.method2083((byte) -119);
        }
        int var14 = 0;
        if (arg1 >= -86) {
            method1640((byte) 60);
        }
        while (this.field3281 > var14) {
            int var15 = 0;
            int var16 = -1;
            int var17 = this.field3294[var14];
            int var18 = this.field3285[var17];
            this.field3277[var17] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field3277[var17][var19] = var15 += var3.method2083((byte) -51);
                if (var20 > var16) {
                    var16 = var20;
                }
            }
            this.field3274[var17] = var16 + 1;
            if (var16 + 1 == var18) {
                this.field3277[var17] = null;
            }
            var14++;
        }
        if (var6 == 0) {
            return;
        }
        this.field3284 = new int[var7 + 1][];
        this.field3290 = new class182[var7 + 1];
        for (int var21 = 0; var21 < this.field3281; var21++) {
            int var22 = this.field3294[var21];
            int var23 = this.field3285[var22];
            this.field3284[var22] = new int[this.field3274[var22]];
            for (int var24 = 0; var24 < this.field3274[var22]; var24++) {
                this.field3284[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field3277[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field3277[var22][var25];
                }
                this.field3284[var22][var26] = var3.method2062(-25795);
            }
            this.field3290[var22] = new class182(this.field3284[var22]);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "([BI)V", line = 261)
    public class229(byte[] arg0, int arg1) {
        this.field3293 = class166.method1241(arg0.length, 0, arg0);
        if (this.field3293 != arg1) {
            throw new RuntimeException();
        }
        this.method1643(arg0, -113);
    }
}
