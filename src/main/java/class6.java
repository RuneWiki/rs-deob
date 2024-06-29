import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public abstract class class6 {

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "Z")
    private boolean field47;

    @OriginalMember(owner = "mapview!ca", name = "w", descriptor = "Z")
    private boolean field58;

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "Lt;")
    public static class31 field44 = class14.method84(120, "Silk Trader");

    @OriginalMember(owner = "mapview!ca", name = "o", descriptor = "Lt;")
    public static class31 field50 = class14.method84(112, "Cookery Shop");

    @OriginalMember(owner = "mapview!ca", name = "r", descriptor = "Lt;")
    public static class31 field53 = class14.method84(126, "switch to ");

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Lj;")
    public static class18 field39 = new class18();

    @OriginalMember(owner = "mapview!ca", name = "s", descriptor = "[I")
    public static int[] field54 = new int[256];

    @OriginalMember(owner = "mapview!ca", name = "u", descriptor = "Lt;")
    public static class31 field56;

    @OriginalMember(owner = "mapview!ca", name = "v", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "mapview!ca", name = "x", descriptor = "Lt;")
    public static class31 field59;

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "Lba;")
    private class4 field42;

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "[I")
    public int[] field40;

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "[I")
    private int[] field43;

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "[I")
    private int[] field46;

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "[I")
    private int[] field48;

    @OriginalMember(owner = "mapview!ca", name = "q", descriptor = "[I")
    private int[] field52;

    @OriginalMember(owner = "mapview!ca", name = "t", descriptor = "[Lt;")
    public static class31[] field55;

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "[Lba;")
    private class4[] field45;

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "[[B")
    public byte[][] field41;

    @OriginalMember(owner = "mapview!ca", name = "n", descriptor = "[[I")
    private int[][] field49;

    @OriginalMember(owner = "mapview!ca", name = "p", descriptor = "[[I")
    private int[][] field51;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "[[[B")
    private byte[][][] field36;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IBI)[B", line = 27)
    public final byte[] method26(int arg0, byte arg1, int arg2) {
        if (arg1 != -66) {
            this.field38 = -1;
        }
        return this.method34(arg2, arg0, null, (byte) -67);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "([IIB)Z", line = 39)
    private final boolean method27(int[] arg0, int arg1, byte arg2) {
        if (this.field41[arg1] == null) {
            return false;
        }
        int var4 = this.field43[arg1];
        boolean var5 = true;
        int[] var6 = this.field49[arg1];
        byte[][] var7 = this.field36[arg1];
        for (int var8 = 0; var8 < var4; var8++) {
            if (var7[var6[var8]] == null) {
                var5 = false;
                break;
            }
        }
        if (var5) {
            return true;
        }
        byte[] var9;
        if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
            var9 = this.field41[arg1];
        } else {
            var9 = new byte[this.field41[arg1].length];
            class9.method51(this.field41[arg1], 0, var9, 0, var9.length);
            class19 var10 = new class19(var9);
            var10.method117(arg0, 5, var10.field168.length, (byte) -108);
        }
        byte[] var11;
        try {
            var11 = class28.method175(-45, var9);
        } catch (RuntimeException var26) {
            throw class31.method195(var26, "T3 - " + (arg0 != null) + "," + arg1 + "," + var9.length + "," + class33.method209(-127, var9, var9.length) + "," + class33.method209(-124, var9, var9.length - 2) + "," + this.field52[arg1] + "," + this.field38);
        }
        if (this.field47) {
            this.field41[arg1] = null;
        }
        if (var4 <= 1) {
            var7[var6[0]] = var11;
        } else {
            int var13 = var11.length;
            int var27 = var13 - 1;
            int var14 = var11[var27] & 0xFF;
            class19 var15 = new class19(var11);
            int var16 = var27 - var4 * var14 * 4;
            int[] var17 = new int[var4];
            var15.field164 = var16;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var15.method109((byte) -45);
                    var17[var20] += var19;
                }
            }
            for (int var21 = 0; var21 < var4; var21++) {
                if (var7[var6[var21]] == null) {
                    var7[var6[var21]] = new byte[var17[var21]];
                }
                var17[var21] = 0;
            }
            var15.field164 = var16;
            int var22 = 0;
            for (int var23 = 0; var23 < var14; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var4; var25++) {
                    var24 += var15.method109((byte) -45);
                    class9.method51(var11, var22, var7[var6[var25]], var17[var25], var24);
                    var22 += var24;
                    var17[var25] += var24;
                }
            }
        }
        return arg2 <= -4;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "([BI)V", line = 179)
    public final void method28(byte[] arg0, int arg1) {
        this.field38 = class33.method209(-122, arg0, arg0.length);
        class19 var3 = new class19(class28.method175(-30, arg0));
        int var4 = var3.method110((byte) -73);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method110((byte) -73);
        this.field37 = var3.method105(125);
        int var6 = 0;
        int var7 = -1;
        this.field40 = new int[this.field37];
        for (int var8 = 0; var8 < this.field37; var8++) {
            this.field40[var8] = var6 += var3.method105(-121);
            if (this.field40[var8] > var7) {
                var7 = this.field40[var8];
            }
        }
        this.field49 = new int[var7 + 1][];
        this.field52 = new int[arg1 + var7];
        this.field36 = new byte[var7 + 1][][];
        this.field43 = new int[var7 + 1];
        this.field41 = new byte[var7 + 1][];
        this.field48 = new int[var7 + 1];
        if (var5 != 0) {
            this.field46 = new int[var7 + 1];
            for (int var9 = 0; var9 < this.field37; var9++) {
                this.field46[this.field40[var9]] = var3.method109((byte) -45);
            }
            this.field42 = new class4(this.field46);
        }
        for (int var10 = 0; var10 < this.field37; var10++) {
            this.field52[this.field40[var10]] = var3.method109((byte) -45);
        }
        for (int var11 = 0; var11 < this.field37; var11++) {
            this.field48[this.field40[var11]] = var3.method109((byte) -45);
        }
        for (int var12 = 0; var12 < this.field37; var12++) {
            this.field43[this.field40[var12]] = var3.method105(class11.method62(arg1, 122));
        }
        for (int var13 = 0; var13 < this.field37; var13++) {
            int var14 = 0;
            int var15 = this.field40[var13];
            int var16 = -1;
            int var17 = this.field43[var15];
            this.field49[var15] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                int var19 = this.field49[var15][var18] = var14 += var3.method105(-19);
                if (var19 > var16) {
                    var16 = var19;
                }
            }
            this.field36[var15] = new byte[var16 + 1][];
        }
        if (var5 == 0) {
            return;
        }
        this.field45 = new class4[var7 + 1];
        this.field51 = new int[var7 + 1][];
        for (int var20 = 0; var20 < this.field37; var20++) {
            int var21 = this.field40[var20];
            int var22 = this.field43[var21];
            this.field51[var21] = new int[this.field36[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field51[var21][this.field49[var21][var23]] = var3.method109((byte) -45);
            }
            this.field45[var21] = new class4(this.field51[var21]);
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(BI)Lt;", line = 328)
    public static final class31 method29(byte arg0, int arg1) {
        int var2 = 111 / ((arg0 + 75) / 51);
        return class27.method171(127, arg1, 10, false);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I[B)V", line = 338)
    public static final void method30(int arg0, byte[] arg1) {
        class19 var2 = new class19(arg1);
        var2.field164 = arg1.length - 2;
        class34.field367 = var2.method105(arg0 - 74);
        class20.field182 = new int[class34.field367];
        class18.field159 = new int[class34.field367];
        class33.field351 = new byte[class34.field367][];
        class24.field208 = new int[class34.field367];
        class12.field92 = new int[class34.field367];
        var2.field164 = arg1.length - class34.field367 * 8 - 7;
        class34.field355 = var2.method105(125);
        class26.field303 = var2.method105(arg0 ^ 0x7E);
        int var3 = (var2.method110((byte) -73) & 0xFF) + 1;
        for (int var4 = 0; var4 < class34.field367; var4++) {
            class12.field92[var4] = var2.method105(arg0 + 124);
        }
        for (int var5 = 0; var5 < class34.field367; var5++) {
            class20.field182[var5] = var2.method105(126);
        }
        for (int var6 = arg0; var6 < class34.field367; var6++) {
            class24.field208[var6] = var2.method105(arg0 - 99);
        }
        for (int var7 = 0; var7 < class34.field367; var7++) {
            class18.field159[var7] = var2.method105(123);
        }
        var2.field164 = arg1.length + 3 - var3 * 3 - class34.field367 * 8 - 7;
        class22.field194 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class22.field194[var8] = var2.method106(99);
            if (class22.field194[var8] == 0) {
                class22.field194[var8] = 1;
            }
        }
        var2.field164 = 0;
        for (int var9 = 0; var9 < class34.field367; var9++) {
            int var10 = class18.field159[var9];
            int var11 = class24.field208[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class33.field351[var9] = var13;
            int var14 = var2.method110((byte) -73);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method113((byte) 39);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var10; var17++) {
                        var13[var11 * var17 + var16] = var2.method113((byte) 39);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Z)V", line = 455)
    public static void method31(boolean arg0) {
        field39 = null;
        field56 = null;
        field50 = null;
        field55 = null;
        field59 = null;
        field54 = null;
        field53 = null;
        if (arg0) {
            field50 = null;
        }
        field44 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Lt;Z)I", line = 481)
    public final int method32(class31 arg0, boolean arg1) {
        class31 var3 = arg0.method193(-5015);
        return arg1 ? this.field42.method17((byte) -88, var3.method184(false)) : -117;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Lt;Lt;Z)[B", line = 500)
    public final byte[] method33(class31 arg0, class31 arg1, boolean arg2) {
        class31 var4 = arg0.method193(-5015);
        class31 var5 = arg1.method193(-5015);
        int var6 = this.field42.method17((byte) -49, var4.method184(false));
        if (!arg2) {
            this.method36(87, true, null);
        }
        int var7 = this.field45[var6].method17((byte) -53, var5.method184(!arg2));
        return this.method26(var7, (byte) -66, var6);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(II[IB)[B", line = 520)
    private final byte[] method34(int arg0, int arg1, int[] arg2, byte arg3) {
        if (arg0 < 0 || arg0 >= this.field36.length || this.field36[arg0] == null || arg1 < 0 || arg1 >= this.field36[arg0].length) {
            return null;
        }
        if (this.field36[arg0][arg1] == null) {
            boolean var5 = this.method27(arg2, arg0, (byte) -65);
            if (!var5) {
                this.method35(true, arg0);
                boolean var6 = this.method27(arg2, arg0, (byte) -89);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = this.field36[arg0][arg1];
        if (this.field58) {
            this.field36[arg0][arg1] = null;
        }
        if (arg3 > -9) {
            this.field58 = false;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(ZI)V", line = 556)
    private final void method35(boolean arg0, int arg1) {
        if (!arg0) {
            this.field52 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field54[var0] = var1;
        }
        field56 = class14.method84(109, "Overview");
        field57 = 0;
        field59 = class14.method84(121, "Farming shop");
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IZLt;)I", line = 593)
    public final int method36(int arg0, boolean arg1, class31 arg2) {
        if (arg1) {
            this.method28(null, 81);
        }
        class31 var4 = arg2.method193(-5015);
        return this.field45[arg0].method17((byte) -50, var4.method184(false));
    }

    @OriginalMember(owner = "mapview!ca", name = "<init>", descriptor = "(ZZ)V", line = 663)
    public class6(boolean arg0, boolean arg1) {
        this.field47 = arg0;
        this.field58 = arg1;
    }
}
