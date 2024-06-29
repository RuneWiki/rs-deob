import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public abstract class class5 {

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "Z")
    private boolean field54;

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "Z")
    private boolean field47;

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "I")
    public static int field48 = -1;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "Lr;")
    public static class33 field57 = class29.method192("Furnace", (byte) 126);

    @OriginalMember(owner = "mapview!c", name = "t", descriptor = "I")
    public static int field61 = 0;

    @OriginalMember(owner = "mapview!c", name = "u", descriptor = "Z")
    public static boolean field62 = false;

    @OriginalMember(owner = "mapview!c", name = "r", descriptor = "Lr;")
    public static class33 field59 = class29.method192("underlay)3dat", (byte) 126);

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "Lr;")
    public static class33 field55 = class29.method192("labels)3dat", (byte) 126);

    @OriginalMember(owner = "mapview!c", name = "w", descriptor = "Lr;")
    public static class33 field64 = class29.method192("Switch to ", (byte) 126);

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "Lr;")
    public static class33 field56 = class29.method192("Prev page", (byte) 126);

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "mapview!c", name = "v", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "Lqa;")
    private class32 field43;

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "[I")
    public int[] field51;

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "[I")
    private int[] field52;

    @OriginalMember(owner = "mapview!c", name = "q", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "mapview!c", name = "s", descriptor = "[I")
    private int[] field60;

    @OriginalMember(owner = "mapview!c", name = "x", descriptor = "[I")
    public static int[] field65;

    @OriginalMember(owner = "mapview!c", name = "y", descriptor = "[I")
    private int[] field66;

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "[Lqa;")
    private class32[] field50;

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "[Ljava/lang/Object;")
    public Object[] field46;

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "[[I")
    private int[][] field45;

    @OriginalMember(owner = "mapview!c", name = "z", descriptor = "[[I")
    private int[][] field67;

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field53;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(III)[B", line = 4)
    public final byte[] method28(int arg0, int arg1, int arg2) {
        return arg1 == -1 ? this.method33(arg0, arg2, 101, null) : (byte[]) null;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)I", line = 24)
    public static final int method29(int arg0) {
        int var1 = -73 % ((arg0 + 39) / 47);
        if (class4.field37 == null) {
            return 0;
        } else if (class4.field37.field481 == null) {
            return class25.field273[class4.field37.field480 & 0xFF];
        } else {
            return class25.field273[class4.field37.field481[class26.field396] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I[II)Z", line = 44)
    private final boolean method30(int arg0, int[] arg1, int arg2) {
        if (this.field46[arg2] == null) {
            return false;
        }
        int var4 = this.field66[arg2];
        int[] var5 = this.field67[arg2];
        Object[] var6 = this.field53[arg2];
        boolean var7 = true;
        for (int var8 = arg0; var8 < var4; var8++) {
            if (var6[var5[var8]] == null) {
                var7 = false;
                break;
            }
        }
        if (var7) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = class17.method102(0, this.field46[arg2], false);
        } else {
            var9 = class17.method102(0, this.field46[arg2], true);
            class20 var10 = new class20(var9);
            var10.method132(var10.field205.length, 5, arg1, -1);
        }
        byte[] var11;
        try {
            var11 = class33.method210(0, var9);
        } catch (RuntimeException var28) {
            throw class8.method51(var28, "T3 - " + (arg1 != null) + "," + arg2 + "," + var9.length + "," + class35.method242(var9, 0, var9.length) + "," + class35.method242(var9, 0, var9.length - 2) + "," + this.field52[arg2] + "," + this.field44);
        }
        if (this.field54) {
            this.field46[arg2] = null;
        }
        if (var4 <= 1) {
            var6[var5[0]] = class12.method85(false, var11, (byte) 68);
        } else {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            int var15 = var29 - var4 * var14 * 4;
            class20 var16 = new class20(var11);
            var16.field206 = var15;
            int[] var17 = new int[var4];
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var16.method128(3);
                    var17[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var17[var22]];
                var17[var22] = 0;
            }
            var16.field206 = var15;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var16.method128(3);
                    class34.method234(var11, var23, var21[var26], var17[var26], var25);
                    var23 += var25;
                    var17[var26] += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                var6[var5[var27]] = class12.method85(false, var21[var27], (byte) 97);
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Lr;II)I", line = 202)
    public final int method31(class33 arg0, int arg1, int arg2) {
        class33 var4 = arg0.method228((byte) 36);
        return arg2 == -2 ? this.field50[arg1].method206((byte) -89, var4.method221(85)) : 83;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Lr;Lr;B)[B", line = 219)
    public final byte[] method32(class33 arg0, class33 arg1, byte arg2) {
        class33 var4 = arg1.method228((byte) 36);
        class33 var5 = arg0.method228((byte) 36);
        int var6 = this.field43.method206((byte) -89, var4.method221(-95));
        int var7 = 92 / ((arg2 - 30) / 33);
        int var8 = this.field50[var6].method206((byte) -89, var5.method221(-40));
        return this.method28(var6, -1, var8);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(III[I)[B", line = 241)
    private final byte[] method33(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 < 0 || this.field53.length <= arg0 || this.field53[arg0] == null || arg1 < 0 || arg1 >= this.field53[arg0].length) {
            return null;
        }
        if (this.field53[arg0][arg1] == null) {
            boolean var5 = this.method30(0, arg3, arg0);
            if (!var5) {
                this.method36(arg0, false);
                boolean var6 = this.method30(0, arg3, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class17.method102(0, this.field53[arg0][arg1], false);
        if (this.field47) {
            this.field53[arg0][arg1] = null;
        }
        return arg2 <= 94 ? (byte[]) null : var7;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B)V", line = 281)
    public static void method34(byte arg0) {
        field57 = null;
        field59 = null;
        field65 = null;
        field56 = null;
        if (arg0 < -23) {
            field55 = null;
            field64 = null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(ZLr;)I", line = 307)
    public final int method35(boolean arg0, class33 arg1) {
        if (arg0) {
            field49 = -20;
        }
        class33 var3 = arg1.method228((byte) 36);
        return this.field43.method206((byte) -89, var3.method221(125));
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IZ)V", line = 331)
    private final void method36(int arg0, boolean arg1) {
        if (arg1) {
            this.field45 = null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([BB)V", line = 363)
    public final void method37(byte[] arg0, byte arg1) {
        this.field44 = class35.method242(arg0, 0, arg0.length);
        class20 var3 = new class20(class33.method210(0, arg0));
        int var4 = var3.method133(23789);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method133(23789);
        this.field63 = var3.method129(2);
        if (arg1 <= 0) {
            return;
        }
        int var6 = 0;
        this.field51 = new int[this.field63];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field63; var8++) {
            this.field51[var8] = var6 += var3.method129(2);
            if (var7 < this.field51[var8]) {
                var7 = this.field51[var8];
            }
        }
        this.field66 = new int[var7 + 1];
        this.field53 = new Object[var7 + 1][];
        this.field60 = new int[var7 + 1];
        this.field46 = new Object[var7 + 1];
        this.field52 = new int[var7 + 1];
        this.field67 = new int[var7 + 1][];
        if (var5 != 0) {
            this.field58 = new int[var7 + 1];
            for (int var9 = 0; var9 < this.field63; var9++) {
                this.field58[this.field51[var9]] = var3.method128(3);
            }
            this.field43 = new class32(this.field58);
        }
        for (int var10 = 0; var10 < this.field63; var10++) {
            this.field52[this.field51[var10]] = var3.method128(3);
        }
        for (int var11 = 0; var11 < this.field63; var11++) {
            this.field60[this.field51[var11]] = var3.method128(3);
        }
        for (int var12 = 0; var12 < this.field63; var12++) {
            this.field66[this.field51[var12]] = var3.method129(2);
        }
        for (int var13 = 0; var13 < this.field63; var13++) {
            int var14 = 0;
            int var15 = -1;
            int var16 = this.field51[var13];
            int var17 = this.field66[var16];
            this.field67[var16] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                int var19 = this.field67[var16][var18] = var14 += var3.method129(2);
                if (var19 > var15) {
                    var15 = var19;
                }
            }
            this.field53[var16] = new Object[var15 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field50 = new class32[var7 + 1];
        this.field45 = new int[var7 + 1][];
        for (int var20 = 0; var20 < this.field63; var20++) {
            int var21 = this.field51[var20];
            int var22 = this.field66[var21];
            this.field45[var21] = new int[this.field53[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field45[var21][this.field67[var21][var23]] = var3.method128(3);
            }
            this.field50[var21] = new class32(this.field45[var21]);
        }
    }

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "(ZZ)V", line = 523)
    public class5(boolean arg0, boolean arg1) {
        this.field54 = arg0;
        this.field47 = arg1;
    }
}
