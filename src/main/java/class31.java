import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public abstract class class31 {

    @OriginalMember(owner = "mapview!pa", name = "r", descriptor = "Z")
    private boolean field385;

    @OriginalMember(owner = "mapview!pa", name = "v", descriptor = "Z")
    private boolean field389;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "Lt;")
    public static class35 field368 = class3.method28(false, "???");

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "Lt;")
    public static class35 field372 = class3.method28(false, "Platelegs Shop");

    @OriginalMember(owner = "mapview!pa", name = "q", descriptor = "Lt;")
    public static class35 field384 = class3.method28(false, "Combat Training");

    @OriginalMember(owner = "mapview!pa", name = "s", descriptor = "Lt;")
    public static class35 field386 = class3.method28(false, "Fishing Shop");

    @OriginalMember(owner = "mapview!pa", name = "n", descriptor = "I")
    public static int field381 = 0;

    @OriginalMember(owner = "mapview!pa", name = "x", descriptor = "Lt;")
    public static class35 field391 = class3.method28(false, "Shield Shop");

    @OriginalMember(owner = "mapview!pa", name = "z", descriptor = "Li;")
    public static class17 field393 = new class17();

    @OriginalMember(owner = "mapview!pa", name = "A", descriptor = "Lt;")
    public static class35 field394 = class3.method28(false, "Transportation");

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "mapview!pa", name = "p", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "mapview!pa", name = "t", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "mapview!pa", name = "y", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "Lha;")
    private class16 field370;

    @OriginalMember(owner = "mapview!pa", name = "o", descriptor = "[B")
    public static byte[] field382;

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "[I")
    private int[] field371;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "[I")
    public int[] field373;

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "[I")
    private int[] field377;

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "[I")
    private int[] field378;

    @OriginalMember(owner = "mapview!pa", name = "u", descriptor = "[I")
    private int[] field388;

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "[Lha;")
    private class16[] field376;

    @OriginalMember(owner = "mapview!pa", name = "w", descriptor = "[[B")
    public byte[][] field390;

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "[[I")
    private int[][] field369;

    @OriginalMember(owner = "mapview!pa", name = "l", descriptor = "[[I")
    private int[][] field379;

    @OriginalMember(owner = "mapview!pa", name = "m", descriptor = "[[[B")
    private byte[][][] field380;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(B[B)V", line = 27)
    public final void method170(byte arg0, byte[] arg1) {
        this.field383 = class8.method58((byte) 17, arg1.length, arg1);
        class18 var3 = new class18(class13.method89(arg1, (byte) 63));
        int var4 = var3.method110(arg0 + 179);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method110(109);
        if (arg0 != -81) {
            this.method173(null, -36);
        }
        this.field375 = var3.method113((byte) 125);
        this.field373 = new int[this.field375];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field375; var8++) {
            this.field373[var8] = var6 += var3.method113((byte) 117);
            if (var7 < this.field373[var8]) {
                var7 = this.field373[var8];
            }
        }
        this.field378 = new int[var7 + 1];
        this.field369 = new int[var7 + 1][];
        this.field390 = new byte[var7 + 1][];
        this.field380 = new byte[var7 + 1][][];
        this.field377 = new int[var7 + 1];
        this.field371 = new int[var7 + 1];
        if (var5 != 0) {
            this.field388 = new int[var7 + 1];
            for (int var9 = 0; var9 < this.field375; var9++) {
                this.field388[this.field373[var9]] = var3.method109((byte) 58);
            }
            this.field370 = new class16(this.field388);
        }
        for (int var10 = 0; var10 < this.field375; var10++) {
            this.field378[this.field373[var10]] = var3.method109((byte) 23);
        }
        for (int var11 = 0; var11 < this.field375; var11++) {
            this.field371[this.field373[var11]] = var3.method109((byte) -101);
        }
        for (int var12 = 0; var12 < this.field375; var12++) {
            this.field377[this.field373[var12]] = var3.method113((byte) 117);
        }
        for (int var13 = 0; var13 < this.field375; var13++) {
            int var14 = 0;
            int var15 = this.field373[var13];
            int var16 = this.field377[var15];
            this.field369[var15] = new int[var16];
            int var17 = -1;
            for (int var18 = 0; var18 < var16; var18++) {
                int var19 = this.field369[var15][var18] = var14 += var3.method113((byte) 121);
                if (var19 > var17) {
                    var17 = var19;
                }
            }
            this.field380[var15] = new byte[var17 + 1][];
        }
        if (var5 == 0) {
            return;
        }
        this.field379 = new int[var7 + 1][];
        this.field376 = new class16[var7 + 1];
        for (int var20 = 0; var20 < this.field375; var20++) {
            int var21 = this.field373[var20];
            int var22 = this.field377[var21];
            this.field379[var21] = new int[this.field380[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field379[var21][this.field369[var21][var23]] = var3.method109((byte) -112);
            }
            this.field376[var21] = new class16(this.field379[var21]);
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(BI[II)[B", line = 171)
    private final byte[] method171(byte arg0, int arg1, int[] arg2, int arg3) {
        if (arg1 < 0 || arg1 >= this.field380.length || this.field380[arg1] == null || arg3 < 0 || arg3 >= this.field380[arg1].length) {
            return null;
        } else if (arg0 <= 105) {
            return (byte[]) null;
        } else {
            if (this.field380[arg1][arg3] == null) {
                boolean var5 = this.method178(arg2, (byte) 95, arg1);
                if (!var5) {
                    this.method172(arg1, false);
                    boolean var6 = this.method178(arg2, (byte) 95, arg1);
                    if (!var6) {
                        return null;
                    }
                }
            }
            byte[] var7 = this.field380[arg1][arg3];
            if (this.field385) {
                this.field380[arg1][arg3] = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IZ)V", line = 211)
    private final void method172(int arg0, boolean arg1) {
        if (arg1) {
            this.field378 = null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Lt;I)I", line = 223)
    public final int method173(class35 arg0, int arg1) {
        class35 var3 = arg0.method204((byte) 11);
        if (arg1 != -31939) {
            this.field377 = null;
        }
        return this.field370.method98(var3.method225(1), (byte) -101);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(ZLpa;Lt;Lt;)Lma;", line = 235)
    public static final class25 method174(boolean arg0, class31 arg1, class35 arg2, class35 arg3) {
        if (arg0) {
            int var4 = arg1.method173(arg3, -31939);
            int var5 = arg1.method176(var4, true, arg2);
            return class34.method201(42, var4, arg1, var5);
        } else {
            return (class25) null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(III)[B", line = 250)
    public final byte[] method175(int arg0, int arg1, int arg2) {
        return arg2 >= -105 ? (byte[]) null : this.method171((byte) 123, arg1, null, arg0);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IZLt;)I", line = 260)
    public final int method176(int arg0, boolean arg1, class35 arg2) {
        class35 var4 = arg2.method204((byte) 11);
        if (!arg1) {
            method181(false);
        }
        return this.field376[arg0].method98(var4.method225(1), (byte) -77);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(II)I", line = 272)
    public static int method177(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "([IBI)Z", line = 285)
    private final boolean method178(int[] arg0, byte arg1, int arg2) {
        if (this.field390[arg2] == null) {
            return false;
        }
        int var4 = this.field377[arg2];
        int[] var5 = this.field369[arg2];
        boolean var6 = true;
        byte[][] var7 = this.field380[arg2];
        if (arg1 != 95) {
            return true;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            if (var7[var5[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var9;
        if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
            var9 = this.field390[arg2];
        } else {
            var9 = new byte[this.field390[arg2].length];
            class14.method90(this.field390[arg2], 0, var9, 0, var9.length);
            class18 var10 = new class18(var9);
            var10.method104(arg0, var10.field204.length, arg1 ^ 0xC928C777, 5);
        }
        byte[] var11;
        try {
            var11 = class13.method89(var9, (byte) 108);
        } catch (RuntimeException var26) {
            throw class7.method52(var26, "T3 - " + (arg0 != null) + "," + arg2 + "," + var9.length + "," + class8.method58((byte) 17, var9.length, var9) + "," + class8.method58((byte) 17, var9.length - 2, var9) + "," + this.field378[arg2] + "," + this.field383);
        }
        if (this.field389) {
            this.field390[arg2] = null;
        }
        if (var4 <= 1) {
            var7[var5[0]] = var11;
        } else {
            int var13 = var11.length;
            int[] var14 = new int[var4];
            int var27 = var13 - 1;
            int var15 = var11[var27] & 0xFF;
            int var16 = var27 - var15 * 4 * var4;
            class18 var17 = new class18(var11);
            var17.field203 = var16;
            for (int var18 = 0; var18 < var15; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var17.method109((byte) -106);
                    var14[var20] += var19;
                }
            }
            for (int var21 = 0; var21 < var4; var21++) {
                if (var7[var5[var21]] == null) {
                    var7[var5[var21]] = new byte[var14[var21]];
                }
                var14[var21] = 0;
            }
            var17.field203 = var16;
            int var22 = 0;
            for (int var23 = 0; var23 < var15; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var4; var25++) {
                    var24 += var17.method109((byte) 73);
                    class14.method90(var11, var22, var7[var5[var25]], var14[var25], var24);
                    var22 += var24;
                    var14[var25] += var24;
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(BIZI)Lt;", line = 475)
    public static final class35 method179(byte arg0, int arg1, boolean arg2, int arg3) {
        int var4 = 1;
        if (arg3 < 1 || arg3 > 36) {
            arg3 = 10;
        }
        int var5 = arg1 / arg3;
        int var6 = -56 / ((arg0 - 29) / 58);
        while (var5 != 0) {
            var4++;
            var5 /= arg3;
        }
        int var7 = var4;
        if (arg1 < 0 || arg2) {
            var7 = var4 + 1;
        }
        byte[] var8 = new byte[var7];
        if (arg1 < 0) {
            var8[0] = 45;
        } else if (arg2) {
            var8[0] = 43;
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = arg1 % arg3;
            arg1 /= arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var8[var7 - var9 - 1] = (byte) (var10 + 48);
        }
        class35 var11 = new class35();
        var11.field434 = var7;
        var11.field433 = var8;
        return var11;
    }

    @OriginalMember(owner = "mapview!pa", name = "<init>", descriptor = "(ZZ)V", line = 542)
    public class31(boolean arg0, boolean arg1) {
        this.field385 = arg1;
        this.field389 = arg0;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Lt;BLt;)[B", line = 553)
    public final byte[] method180(class35 arg0, byte arg1, class35 arg2) {
        class35 var4 = arg2.method204((byte) 11);
        class35 var5 = arg0.method204((byte) 11);
        if (arg1 >= -87) {
            return (byte[]) null;
        } else {
            int var6 = this.field370.method98(var4.method225(1), (byte) -71);
            int var7 = this.field376[var6].method98(var5.method225(1), (byte) -73);
            return this.method175(var7, var6, -110);
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Z)V", line = 577)
    public static void method181(boolean arg0) {
        field372 = null;
        if (arg0) {
            field392 = 36;
        }
        field393 = null;
        field384 = null;
        field382 = null;
        field391 = null;
        field368 = null;
        field386 = null;
        field394 = null;
    }
}
