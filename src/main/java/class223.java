import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class223 {

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3268 = new String[200];

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field3267 = 0;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field3272 = -1;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "[Z")
    public static boolean[] field3274 = new boolean[5];

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public int field3281;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Ltj;")
    public class74 field3282;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
    public int[] field3262;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "[I")
    public int[] field3265;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "[I")
    public int[] field3275;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "[I")
    public int[] field3276;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "[I")
    public int[] field3280;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[I")
    public int[] field3284;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "[Ltj;")
    public class74[] field3277;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "[[I")
    public int[][] field3279;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "[[I")
    public int[][] field3285;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "[[[Lf;")
    public static class313[][][] field3286;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZIII)V")
    public static final void method1548(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3283++;
        class279 var5 = class111.method844(arg4, 4, -1780180960);
        var5.method1928(arg1);
        var5.field4505 = arg3;
        var5.field4489 = arg2;
        var5.field4488 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)I")
    public static final int method1549(int arg0, int arg1, int arg2) {
        field3263++;
        int var3 = arg2;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([BI)V")
    private final void method1550(byte[] arg0, int arg1) {
        field3271++;
        class53 var3 = new class53(class203.method1432((byte) 125, arg0));
        int var4 = var3.method366(arg1 ^ 0xFFFFBF87);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        int var5 = 0;
        if (var4 < 6) {
            this.field3278 = 0;
        } else {
            this.field3278 = var3.method340(-128);
        }
        int var6 = var3.method366(-16505);
        this.field3273 = var3.method331(-20);
        this.field3280 = new int[this.field3273];
        int var7 = -1;
        for (int var8 = arg1; var8 < this.field3273; var8++) {
            this.field3280[var8] = var5 += var3.method331(-121);
            if (this.field3280[var8] > var7) {
                var7 = this.field3280[var8];
            }
        }
        this.field3281 = var7 + 1;
        this.field3285 = new int[this.field3281][];
        this.field3276 = new int[this.field3281];
        this.field3265 = new int[this.field3281];
        this.field3284 = new int[this.field3281];
        this.field3275 = new int[this.field3281];
        if (var6 != 0) {
            this.field3262 = new int[this.field3281];
            for (int var9 = 0; var9 < this.field3281; var9++) {
                this.field3262[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3273; var10++) {
                this.field3262[this.field3280[var10]] = var3.method340(-118);
            }
            this.field3282 = new class74(this.field3262);
        }
        for (int var11 = 0; var11 < this.field3273; var11++) {
            this.field3275[this.field3280[var11]] = var3.method340(-104);
        }
        for (int var12 = 0; var12 < this.field3273; var12++) {
            this.field3284[this.field3280[var12]] = var3.method340(-95);
        }
        for (int var13 = 0; var13 < this.field3273; var13++) {
            this.field3265[this.field3280[var13]] = var3.method331(-121);
        }
        for (int var14 = 0; var14 < this.field3273; var14++) {
            int var21 = this.field3280[var14];
            int var22 = 0;
            int var23 = -1;
            int var24 = this.field3265[var21];
            this.field3285[var21] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field3285[var21][var25] = var22 += var3.method331(-119);
                if (var26 > var23) {
                    var23 = var26;
                }
            }
            this.field3276[var21] = var23 + 1;
            if (var23 + 1 == var24) {
                this.field3285[var21] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3277 = new class74[var7 + 1];
        this.field3279 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field3273; var15++) {
            int var16 = this.field3280[var15];
            int var17 = this.field3265[var16];
            this.field3279[var16] = new int[this.field3276[var16]];
            for (int var18 = 0; var18 < this.field3276[var16]; var18++) {
                this.field3279[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3285[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3285[var16][var19];
                }
                this.field3279[var16][var20] = var3.method340(-83);
            }
            this.field3277[var16] = new class74(this.field3279[var16]);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method1551(boolean arg0) {
        field3268 = null;
        field3286 = null;
        field3274 = null;
        if (arg0) {
            field3286 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([BI)V")
    public class223(byte[] arg0, int arg1) {
        this.field3269 = class147.method1089(arg0, arg0.length, 0);
        if (this.field3269 != arg1) {
            throw new RuntimeException();
        }
        this.method1550(arg0, 0);
    }
}
