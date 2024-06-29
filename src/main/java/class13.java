import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public abstract class class13 {

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "Z")
    private boolean field110;

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "Z")
    private boolean field113;

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Lw;")
    public static class38 field109 = class35.method219("Hunter Training", true);

    @OriginalMember(owner = "mapview!ha", name = "m", descriptor = "Lw;")
    public static class38 field120 = class35.method219("sprites", true);

    @OriginalMember(owner = "mapview!ha", name = "q", descriptor = "Lw;")
    public static class38 field124 = class35.method219("Dairy Churn", true);

    @OriginalMember(owner = "mapview!ha", name = "t", descriptor = "Lw;")
    public static class38 field127 = class35.method219("underlay)3dat", true);

    @OriginalMember(owner = "mapview!ha", name = "w", descriptor = "Lw;")
    public static class38 field130 = class35.method219("Saw Mill", true);

    @OriginalMember(owner = "mapview!ha", name = "v", descriptor = "Lw;")
    public static class38 field129 = class35.method219("Chainmail Shop", true);

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "mapview!ha", name = "o", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "mapview!ha", name = "x", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "mapview!ha", name = "k", descriptor = "Lj;")
    private class16 field118;

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "Lka;")
    public static class19 field116;

    @OriginalMember(owner = "mapview!ha", name = "r", descriptor = "Lb;")
    public static class3 field125;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "[I")
    private int[] field108;

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "[I")
    private int[] field111;

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "[I")
    public int[] field114;

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "[I")
    private int[] field115;

    @OriginalMember(owner = "mapview!ha", name = "l", descriptor = "[I")
    private int[] field119;

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "[Lj;")
    private class16[] field117;

    @OriginalMember(owner = "mapview!ha", name = "n", descriptor = "[Ljava/lang/Object;")
    public Object[] field121;

    @OriginalMember(owner = "mapview!ha", name = "p", descriptor = "[[I")
    private int[][] field123;

    @OriginalMember(owner = "mapview!ha", name = "u", descriptor = "[[I")
    private int[][] field128;

    @OriginalMember(owner = "mapview!ha", name = "s", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field126;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(II)V", line = 5)
    private final void method53(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field117 = null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "([BI)V", line = 16)
    public final void method54(byte[] arg0, int arg1) {
        this.field112 = mapview.method152(arg0.length, 0, arg0);
        class18 var3 = new class18(class3.method10(arg0, 0));
        int var4 = var3.method103(arg1 ^ 0xFFFFFF01);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method103(255);
        this.field131 = var3.method107(-5286);
        if (arg1 != -2) {
            this.field131 = 85;
        }
        this.field114 = new int[this.field131];
        int var6 = -1;
        int var7 = 0;
        for (int var8 = 0; var8 < this.field131; var8++) {
            this.field114[var8] = var7 += var3.method107(-5286);
            if (this.field114[var8] > var6) {
                var6 = this.field114[var8];
            }
        }
        this.field111 = new int[var6 + 1];
        this.field126 = new Object[var6 + 1][];
        this.field121 = new Object[var6 + 1];
        this.field115 = new int[var6 + 1];
        this.field108 = new int[var6 + 1];
        this.field128 = new int[var6 + 1][];
        if (var5 != 0) {
            this.field119 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field131; var9++) {
                this.field119[this.field114[var9]] = var3.method113((byte) 58);
            }
            this.field118 = new class16(this.field119);
        }
        for (int var10 = 0; var10 < this.field131; var10++) {
            this.field115[this.field114[var10]] = var3.method113((byte) 100);
        }
        for (int var11 = 0; var11 < this.field131; var11++) {
            this.field111[this.field114[var11]] = var3.method113((byte) 124);
        }
        for (int var12 = 0; var12 < this.field131; var12++) {
            this.field108[this.field114[var12]] = var3.method107(-5286);
        }
        for (int var13 = 0; var13 < this.field131; var13++) {
            int var14 = this.field114[var13];
            int var15 = 0;
            int var16 = this.field108[var14];
            int var17 = -1;
            this.field128[var14] = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                int var19 = this.field128[var14][var18] = var15 += var3.method107(-5286);
                if (var19 > var17) {
                    var17 = var19;
                }
            }
            this.field126[var14] = new Object[var17 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field123 = new int[var6 + 1][];
        this.field117 = new class16[var6 + 1];
        for (int var20 = 0; var20 < this.field131; var20++) {
            int var21 = this.field114[var20];
            int var22 = this.field108[var21];
            this.field123[var21] = new int[this.field126[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field123[var21][this.field128[var21][var23]] = var3.method113((byte) 53);
            }
            this.field117[var21] = new class16(this.field123[var21]);
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)V", line = 173)
    public static void method55(int arg0) {
        field116 = null;
        field124 = null;
        field125 = null;
        if (arg0 != 100) {
            method60((byte) -13, null);
        }
        field109 = null;
        field127 = null;
        field129 = null;
        field120 = null;
        field130 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)B", line = 190)
    public static final byte method56(byte arg0) {
        if (arg0 < 16) {
            field124 = null;
        }
        return class12.field107 == null ? 0 : class12.field107[mapview.field257];
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[IB)Z", line = 207)
    private final boolean method57(int arg0, int[] arg1, byte arg2) {
        if (this.field121[arg0] == null) {
            return false;
        }
        int var4 = this.field108[arg0];
        int[] var5 = this.field128[arg0];
        boolean var6 = true;
        if (arg2 != 115) {
            method56((byte) -53);
        }
        Object[] var7 = this.field126[arg0];
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
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = class3.method9(false, this.field121[arg0], 0);
        } else {
            var9 = class3.method9(true, this.field121[arg0], 0);
            class18 var10 = new class18(var9);
            var10.method105(5, arg2 ^ 0xFFFFFF8C, var10.field183.length, arg1);
        }
        byte[] var11;
        try {
            var11 = class3.method10(var9, 0);
        } catch (RuntimeException var28) {
            throw class3.method12(var28, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + mapview.method152(var9.length, arg2 ^ 0x73, var9) + "," + mapview.method152(var9.length - 2, 0, var9) + "," + this.field115[arg0] + "," + this.field112);
        }
        if (this.field110) {
            this.field121[arg0] = null;
        }
        if (var4 <= 1) {
            var7[var5[0]] = class5.method18(false, var11, 48);
        } else {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            int var15 = var29 - var14 * 4 * var4;
            class18 var16 = new class18(var11);
            int[] var17 = new int[var4];
            var16.field186 = var15;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var16.method113((byte) 99);
                    var17[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var17[var22]];
                var17[var22] = 0;
            }
            var16.field186 = var15;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var16.method113((byte) 61);
                    class2.method5(var11, var23, var21[var26], var17[var26], var25);
                    var17[var26] += var25;
                    var23 += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                var7[var5[var27]] = class5.method18(false, var21[var27], class34.method204(arg2, 11));
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(III)[B", line = 362)
    public final byte[] method58(int arg0, int arg1, int arg2) {
        int var4 = -123 / ((arg0 + 53) / 40);
        return this.method59(arg1, null, arg2, true);
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[IIZ)[B", line = 383)
    private final byte[] method59(int arg0, int[] arg1, int arg2, boolean arg3) {
        if (arg2 < 0 || arg2 >= this.field126.length || this.field126[arg2] == null || arg0 < 0 || arg0 >= this.field126[arg2].length) {
            return null;
        }
        if (this.field126[arg2][arg0] == null) {
            boolean var5 = this.method57(arg2, arg1, (byte) 115);
            if (!var5) {
                this.method53(0, arg2);
                boolean var6 = this.method57(arg2, arg1, (byte) 115);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class3.method9(false, this.field126[arg2][arg0], 0);
        if (this.field113) {
            this.field126[arg2][arg0] = null;
        }
        return arg3 ? var7 : (byte[]) null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(BLjava/lang/String;)Lw;", line = 425)
    public static final class38 method60(byte arg0, String arg1) {
        if (arg0 > -105) {
            method55(-43);
        }
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class38 var4 = new class38();
        var4.field502 = 0;
        var4.field503 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field502++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(ILw;)I", line = 464)
    public final int method61(int arg0, class38 arg1) {
        class38 var3 = arg1.method240((byte) -37);
        return arg0 <= 1 ? -82 : this.field118.method85(var3.method249((byte) 125), (byte) 100);
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Lw;BLw;)[B", line = 485)
    public final byte[] method62(class38 arg0, byte arg1, class38 arg2) {
        class38 var4 = arg2.method240((byte) -37);
        class38 var5 = arg0.method240((byte) -37);
        int var6 = this.field118.method85(var4.method249((byte) -89), (byte) 100);
        int var7 = this.field117[var6].method85(var5.method249((byte) 79), (byte) 100);
        if (arg1 <= 15) {
            this.field119 = null;
        }
        return this.method58(-3, var7, var6);
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IBLw;)I", line = 523)
    public final int method63(int arg0, byte arg1, class38 arg2) {
        int var4 = -59 / ((74 - arg1) / 41);
        class38 var5 = arg2.method240((byte) -37);
        return this.field117[arg0].method85(var5.method249((byte) -61), (byte) 100);
    }

    @OriginalMember(owner = "mapview!ha", name = "<init>", descriptor = "(ZZ)V", line = 548)
    public class13(boolean arg0, boolean arg1) {
        this.field110 = arg0;
        this.field113 = arg1;
    }
}
