import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public abstract class class34 {

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "Z")
    private boolean field430;

    @OriginalMember(owner = "mapview!t", name = "i", descriptor = "Z")
    private boolean field431;

    @OriginalMember(owner = "mapview!t", name = "o", descriptor = "[[B")
    public static byte[][] field437 = new byte[250][];

    @OriginalMember(owner = "mapview!t", name = "q", descriptor = "Lj;")
    public static class17 field439 = class30.method190(-90, "mapfunction");

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "mapview!t", name = "k", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "mapview!t", name = "m", descriptor = "La;")
    private class1 field435;

    @OriginalMember(owner = "mapview!t", name = "p", descriptor = "Z")
    public static boolean field438;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "[I")
    public int[] field423;

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "[I")
    private int[] field424;

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "[I")
    private int[] field425;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "[I")
    private int[] field426;

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "[I")
    private int[] field428;

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "[La;")
    private class1[] field427;

    @OriginalMember(owner = "mapview!t", name = "r", descriptor = "[[B")
    public byte[][] field440;

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "[[I")
    private int[][] field432;

    @OriginalMember(owner = "mapview!t", name = "n", descriptor = "[[I")
    private int[][] field436;

    @OriginalMember(owner = "mapview!t", name = "l", descriptor = "[[[B")
    private byte[][][] field434;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(III)[B", line = 9)
    public final byte[] method225(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field433 = -38;
        }
        return this.method236(null, arg2, arg1, 0);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)V", line = 36)
    public static final void method226(int arg0) {
        class23 var1 = class28.field364;
        synchronized (class28.field364) {
            class11.field219 = class26.field338;
            if (class26.field335 < arg0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class33.field420[var2] = false;
                }
                class26.field335 = class12.field228;
            } else {
                while (class26.field335 != class12.field228) {
                    int var3 = class18.field273[class12.field228];
                    class12.field228 = class12.field228 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class33.field420[var3] = true;
                    } else {
                        class33.field420[~var3] = false;
                    }
                }
            }
            class26.field338 = class24.field319;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ILj;)I", line = 74)
    public final int method227(int arg0, class17 arg1) {
        class17 var3 = arg1.method133(32);
        int var4 = -31 % ((arg0 - 47) / 41);
        return this.field435.method23(-29060, var3.method122(-248));
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II)Lj;", line = 107)
    public static final class17 method228(int arg0, int arg1) {
        if (arg0 != 10) {
            method231(true);
        }
        return class2.method26(10, false, arg1, (byte) 110);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IZ)V", line = 117)
    private final void method229(int arg0, boolean arg1) {
        if (!arg1) {
            this.field427 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ILj;Lj;)[B", line = 136)
    public final byte[] method230(int arg0, class17 arg1, class17 arg2) {
        class17 var4 = arg2.method133(32);
        if (arg0 == 10646) {
            class17 var5 = arg1.method133(32);
            int var6 = this.field435.method23(-29060, var4.method122(-248));
            int var7 = this.field427[var6].method23(-29060, var5.method122(-248));
            return this.method225(arg0 - 10646, var6, var7);
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Z)V", line = 151)
    public static void method231(boolean arg0) {
        field439 = null;
        field437 = null;
        if (arg0) {
            field439 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Lj;IB)I", line = 162)
    public final int method232(class17 arg0, int arg1, byte arg2) {
        class17 var4 = arg0.method133(32);
        int var5 = 108 / ((-arg2 - 1) / 48);
        return this.field427[arg1].method23(-29060, var4.method122(-248));
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Z[B)V", line = 178)
    public final void method233(boolean arg0, byte[] arg1) {
        this.field429 = class4.method42(arg1.length, arg1, 0);
        class33 var3 = new class33(class16.method109((byte) -27, arg1));
        int var4 = var3.method212(-118);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method212(-128);
        int var6 = 0;
        int var7 = -1;
        this.field433 = var3.method218(810291624);
        this.field423 = new int[this.field433];
        for (int var8 = 0; var8 < this.field433; var8++) {
            this.field423[var8] = var6 += var3.method218(810291624);
            if (var7 < this.field423[var8]) {
                var7 = this.field423[var8];
            }
        }
        this.field440 = new byte[var7 + 1][];
        this.field425 = new int[var7 + 1];
        this.field434 = new byte[var7 + 1][][];
        this.field428 = new int[var7 + 1];
        this.field432 = new int[var7 + 1][];
        this.field426 = new int[var7 + 1];
        if (var5 != 0) {
            this.field424 = new int[var7 + 1];
            for (int var9 = 0; var9 < this.field433; var9++) {
                this.field424[this.field423[var9]] = var3.method219(0);
            }
            this.field435 = new class1(this.field424);
        }
        for (int var10 = 0; var10 < this.field433; var10++) {
            this.field426[this.field423[var10]] = var3.method219(0);
        }
        for (int var11 = 0; var11 < this.field433; var11++) {
            this.field425[this.field423[var11]] = var3.method219(0);
        }
        if (!arg0) {
            return;
        }
        for (int var12 = 0; var12 < this.field433; var12++) {
            this.field428[this.field423[var12]] = var3.method218(810291624);
        }
        for (int var13 = 0; var13 < this.field433; var13++) {
            int var14 = 0;
            int var15 = this.field423[var13];
            int var16 = this.field428[var15];
            this.field432[var15] = new int[var16];
            int var17 = -1;
            for (int var18 = 0; var18 < var16; var18++) {
                int var19 = this.field432[var15][var18] = var14 += var3.method218(810291624);
                if (var19 > var17) {
                    var17 = var19;
                }
            }
            this.field434[var15] = new byte[var17 + 1][];
        }
        if (var5 == 0) {
            return;
        }
        this.field427 = new class1[var7 + 1];
        this.field436 = new int[var7 + 1][];
        for (int var20 = 0; var20 < this.field433; var20++) {
            int var21 = this.field423[var20];
            int var22 = this.field428[var21];
            this.field436[var21] = new int[this.field434[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field436[var21][this.field432[var21][var23]] = var3.method219(0);
            }
            this.field427[var21] = new class1(this.field436[var21]);
        }
    }

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "(ZZ)V", line = 318)
    public class34(boolean arg0, boolean arg1) {
        this.field430 = arg0;
        this.field431 = arg1;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)Lfa;", line = 328)
    public static final class10 method234(int arg0) {
        if (arg0 != 13461) {
            method226(-88);
        }
        class10 var1 = new class10(class29.field375, mapview.field2, class26.field334, class31.field396, class33.field415);
        class3.method28(11793);
        return var1;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B[II)Z", line = 345)
    private final boolean method235(byte arg0, int[] arg1, int arg2) {
        if (this.field440[arg2] == null) {
            return false;
        }
        int var4 = this.field428[arg2];
        int[] var5 = this.field432[arg2];
        boolean var6 = true;
        byte[][] var7 = this.field434[arg2];
        for (int var8 = 0; var8 < var4; var8++) {
            if (var7[var5[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        int var9 = 54 / ((-arg0 - 81) / 36);
        byte[] var10;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var10 = this.field440[arg2];
        } else {
            var10 = new byte[this.field440[arg2].length];
            class14.method102(this.field440[arg2], 0, var10, 0, var10.length);
            class33 var11 = new class33(var10);
            var11.method213(arg1, -1902385208, 5, var11.field418.length);
        }
        byte[] var12;
        try {
            var12 = class16.method109((byte) -27, var10);
        } catch (RuntimeException var27) {
            throw class24.method163(var27, "T3 - " + (arg1 != null) + "," + arg2 + "," + var10.length + "," + class4.method42(var10.length, var10, 0) + "," + class4.method42(var10.length - 2, var10, 0) + "," + this.field426[arg2] + "," + this.field429);
        }
        if (this.field430) {
            this.field440[arg2] = null;
        }
        if (var4 > 1) {
            int var14 = var12.length;
            int var28 = var14 - 1;
            int var15 = var12[var28] & 0xFF;
            int[] var16 = new int[var4];
            class33 var17 = new class33(var12);
            int var18 = var28 - var15 * 4 * var4;
            var17.field410 = var18;
            for (int var19 = 0; var19 < var15; var19++) {
                int var20 = 0;
                for (int var21 = 0; var21 < var4; var21++) {
                    var20 += var17.method219(0);
                    var16[var21] += var20;
                }
            }
            for (int var22 = 0; var22 < var4; var22++) {
                if (var7[var5[var22]] == null) {
                    var7[var5[var22]] = new byte[var16[var22]];
                }
                var16[var22] = 0;
            }
            var17.field410 = var18;
            int var23 = 0;
            for (int var24 = 0; var24 < var15; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var17.method219(0);
                    class14.method102(var12, var23, var7[var5[var26]], var16[var26], var25);
                    var23 += var25;
                    var16[var26] += var25;
                }
            }
        } else {
            var7[var5[0]] = var12;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "([IIII)[B", line = 487)
    private final byte[] method236(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 > arg2 || arg2 >= this.field434.length || this.field434[arg2] == null || arg1 < 0 || this.field434[arg2].length <= arg1) {
            return null;
        }
        if (this.field434[arg2][arg1] == null) {
            boolean var5 = this.method235((byte) -125, arg0, arg2);
            if (!var5) {
                this.method229(arg2, true);
                boolean var6 = this.method235((byte) -15, arg0, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = this.field434[arg2][arg1];
        if (this.field431) {
            this.field434[arg2][arg1] = null;
        }
        return var7;
    }
}
