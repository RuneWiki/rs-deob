import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public abstract class class5 {

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "Z")
    private boolean field103;

    @OriginalMember(owner = "mapview!c", name = "w", descriptor = "Z")
    private boolean field113;

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "Lba;")
    public static class4 field94 = class14.method105((byte) -70, "Staff Shop");

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "Lba;")
    public static class4 field91 = class14.method105((byte) -72, "Windmill");

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "Lba;")
    public static class4 field102 = class14.method105((byte) -125, "Platebody Shop");

    @OriginalMember(owner = "mapview!c", name = "r", descriptor = "I")
    public static int field108 = 500;

    @OriginalMember(owner = "mapview!c", name = "x", descriptor = "[I")
    public static int[] field114 = new int[128];

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "I")
    public static volatile int field95 = 0;

    @OriginalMember(owner = "mapview!c", name = "v", descriptor = "Lba;")
    public static class4 field112 = class14.method105((byte) -87, "world");

    @OriginalMember(owner = "mapview!c", name = "s", descriptor = "Lba;")
    public static class4 field109 = class14.method105((byte) -85, "labels)3dat");

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "mapview!c", name = "q", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "mapview!c", name = "y", descriptor = "Lg;")
    private class13 field115;

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "[I")
    private int[] field100;

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "[I")
    private int[] field101;

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "[I")
    public static int[] field104;

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "[I")
    private int[] field105;

    @OriginalMember(owner = "mapview!c", name = "t", descriptor = "[I")
    private int[] field110;

    @OriginalMember(owner = "mapview!c", name = "u", descriptor = "[I")
    public int[] field111;

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "[Lg;")
    private class13[] field93;

    @OriginalMember(owner = "mapview!c", name = "A", descriptor = "[[B")
    public byte[][] field117;

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "[[I")
    private int[][] field98;

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "[[I")
    private int[][] field99;

    @OriginalMember(owner = "mapview!c", name = "z", descriptor = "[[[B")
    private byte[][][] field116;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)V", line = 18)
    public static final void method52(int arg0) {
        if (class17.field212 != null) {
            class1 var1 = class17.field212;
            synchronized (class17.field212) {
                class17.field212 = null;
            }
        }
        int var3 = 70 / ((arg0 + 76) / 49);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([BB)V", line = 47)
    public static final void method53(byte[] arg0, byte arg1) {
        class20 var2 = new class20(arg0);
        var2.field224 = arg0.length - 2;
        field107 = var2.method140(-120);
        field104 = new int[field107];
        class23.field281 = new int[field107];
        class29.field370 = new int[field107];
        class9.field149 = new byte[field107][];
        class24.field291 = new int[field107];
        var2.field224 = arg0.length - field107 * 8 - 7;
        class31.field392 = var2.method140(-64);
        field96 = var2.method140(-77);
        int var3 = (var2.method143(-3695) & 0xFF) + 1;
        for (int var4 = 0; var4 < field107; var4++) {
            class23.field281[var4] = var2.method140(-40);
        }
        for (int var5 = 0; var5 < field107; var5++) {
            class24.field291[var5] = var2.method140(-71);
        }
        for (int var6 = 0; var6 < field107; var6++) {
            field104[var6] = var2.method140(-42);
        }
        for (int var7 = 0; var7 < field107; var7++) {
            class29.field370[var7] = var2.method140(arg1 + 9);
        }
        var2.field224 = arg0.length - field107 * 8 - (var3 + -1) * 3 - 7;
        class22.field274 = new int[var3];
        int var8 = 1;
        if (arg1 != -46) {
            return;
        }
        while (var8 < var3) {
            class22.field274[var8] = var2.method139(-1);
            if (class22.field274[var8] == 0) {
                class22.field274[var8] = 1;
            }
            var8++;
        }
        var2.field224 = 0;
        for (int var9 = 0; var9 < field107; var9++) {
            int var10 = field104[var9];
            int var11 = class29.field370[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class9.field149[var9] = var13;
            int var14 = var2.method143(-3695);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method141(21992);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method141(arg1 + 22038);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IB)Lba;", line = 167)
    public static final class4 method54(int arg0, byte arg1) {
        class4 var2 = new class4();
        var2.field82 = new byte[arg0];
        var2.field84 = 0;
        if (arg1 <= 102) {
            method54(-34, (byte) 68);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IBLba;)I", line = 193)
    public final int method55(int arg0, byte arg1, class4 arg2) {
        class4 var4 = arg2.method47((byte) 109);
        if (arg1 > -104) {
            this.field93 = null;
        }
        return this.field93[arg0].method99(var4.method50(-11), -1);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(II)V", line = 210)
    private final void method56(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field101 = null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IBI)[B", line = 228)
    public final byte[] method57(int arg0, byte arg1, int arg2) {
        if (arg1 != 112) {
            this.method63(74, null, 60, -71);
        }
        return this.method63(arg0, null, arg1 ^ 0xFFFFFFD0, arg2);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I[B)V", line = 239)
    public final void method58(int arg0, byte[] arg1) {
        this.field92 = class36.method228(arg1.length, -4, arg1);
        class20 var3 = new class20(class16.method119(-20736, arg1));
        int var4 = var3.method143(-3695);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method143(-3695);
        if (arg0 <= 51) {
            this.method63(125, null, 58, -90);
        }
        this.field97 = var3.method140(-111);
        this.field111 = new int[this.field97];
        int var6 = -1;
        int var7 = 0;
        for (int var8 = 0; var8 < this.field97; var8++) {
            this.field111[var8] = var7 += var3.method140(-119);
            if (this.field111[var8] > var6) {
                var6 = this.field111[var8];
            }
        }
        this.field110 = new int[var6 + 1];
        this.field100 = new int[var6 + 1];
        this.field117 = new byte[var6 + 1][];
        this.field98 = new int[var6 + 1][];
        this.field116 = new byte[var6 + 1][][];
        this.field105 = new int[var6 + 1];
        if (var5 != 0) {
            this.field101 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field97; var9++) {
                this.field101[this.field111[var9]] = var3.method134((byte) -7);
            }
            this.field115 = new class13(this.field101);
        }
        for (int var10 = 0; var10 < this.field97; var10++) {
            this.field105[this.field111[var10]] = var3.method134((byte) 115);
        }
        for (int var11 = 0; var11 < this.field97; var11++) {
            this.field110[this.field111[var11]] = var3.method134((byte) -37);
        }
        for (int var12 = 0; var12 < this.field97; var12++) {
            this.field100[this.field111[var12]] = var3.method140(-102);
        }
        for (int var13 = 0; var13 < this.field97; var13++) {
            int var14 = 0;
            int var15 = this.field111[var13];
            int var16 = -1;
            int var17 = this.field100[var15];
            this.field98[var15] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                int var19 = this.field98[var15][var18] = var14 += var3.method140(-120);
                if (var16 < var19) {
                    var16 = var19;
                }
            }
            this.field116[var15] = new byte[var16 + 1][];
        }
        if (var5 == 0) {
            return;
        }
        this.field93 = new class13[var6 + 1];
        this.field99 = new int[var6 + 1][];
        for (int var20 = 0; var20 < this.field97; var20++) {
            int var21 = this.field111[var20];
            int var22 = this.field100[var21];
            this.field99[var21] = new int[this.field116[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field99[var21][this.field98[var21][var23]] = var3.method134((byte) 112);
            }
            this.field93[var21] = new class13(this.field99[var21]);
        }
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(I)V", line = 397)
    public static void method59(int arg0) {
        field114 = null;
        if (arg0 != 1) {
            return;
        }
        field91 = null;
        field104 = null;
        field109 = null;
        field102 = null;
        field112 = null;
        field94 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Lba;Lba;I)[B", line = 418)
    public final byte[] method60(class4 arg0, class4 arg1, int arg2) {
        if (arg2 != 0) {
            return (byte[]) null;
        }
        class4 var4 = arg1.method47((byte) 109);
        class4 var5 = arg0.method47((byte) 109);
        int var6 = this.field115.method99(var4.method50(-11), -1);
        int var7 = this.field93[var6].method99(var5.method50(-11), ~arg2);
        return this.method57(var7, (byte) 112, var6);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([IIB)Z", line = 449)
    private final boolean method61(int[] arg0, int arg1, byte arg2) {
        if (arg2 < 30) {
            return true;
        } else if (this.field117[arg1] == null) {
            return false;
        } else {
            int var4 = this.field100[arg1];
            int[] var5 = this.field98[arg1];
            byte[][] var6 = this.field116[arg1];
            boolean var7 = true;
            for (int var8 = 0; var8 < var4; var8++) {
                if (var6[var5[var8]] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var9;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var9 = this.field117[arg1];
            } else {
                var9 = new byte[this.field117[arg1].length];
                class18.method127(this.field117[arg1], 0, var9, 0, var9.length);
                class20 var10 = new class20(var9);
                var10.method137(5, true, var10.field236.length, arg0);
            }
            byte[] var11;
            try {
                var11 = class16.method119(-20736, var9);
            } catch (RuntimeException var26) {
                throw class3.method26(var26, "T3 - " + (arg0 != null) + "," + arg1 + "," + var9.length + "," + class36.method228(var9.length, 125, var9) + "," + class36.method228(var9.length - 2, 1, var9) + "," + this.field105[arg1] + "," + this.field92);
            }
            if (this.field103) {
                this.field117[arg1] = null;
            }
            if (var4 <= 1) {
                var6[var5[0]] = var11;
            } else {
                int var13 = var11.length;
                int var27 = var13 - 1;
                int var14 = var11[var27] & 0xFF;
                int[] var15 = new int[var4];
                int var16 = var27 - var4 * var14 * 4;
                class20 var17 = new class20(var11);
                var17.field224 = var16;
                for (int var18 = 0; var18 < var14; var18++) {
                    int var19 = 0;
                    for (int var20 = 0; var20 < var4; var20++) {
                        var19 += var17.method134((byte) 109);
                        var15[var20] += var19;
                    }
                }
                for (int var21 = 0; var21 < var4; var21++) {
                    if (var6[var5[var21]] == null) {
                        var6[var5[var21]] = new byte[var15[var21]];
                    }
                    var15[var21] = 0;
                }
                int var22 = 0;
                var17.field224 = var16;
                for (int var23 = 0; var23 < var14; var23++) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < var4; var25++) {
                        var24 += var17.method134((byte) -120);
                        class18.method127(var11, var22, var6[var5[var25]], var15[var25], var24);
                        var22 += var24;
                        var15[var25] += var24;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Lba;I)I", line = 598)
    public final int method62(class4 arg0, int arg1) {
        class4 var3 = arg0.method47((byte) 109);
        if (arg1 != -25493) {
            method54(-121, (byte) -10);
        }
        return this.field115.method99(var3.method50(-11), arg1 ^ 0x6394);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I[III)[B", line = 615)
    private final byte[] method63(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 < 0 || this.field116.length <= arg3 || this.field116[arg3] == null || arg0 < 0 || arg0 >= this.field116[arg3].length) {
            return null;
        }
        if (this.field116[arg3][arg0] == null) {
            boolean var5 = this.method61(arg1, arg3, (byte) 41);
            if (!var5) {
                this.method56(arg3, 1);
                boolean var6 = this.method61(arg1, arg3, (byte) 122);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = this.field116[arg3][arg0];
        if (this.field113) {
            this.field116[arg3][arg0] = null;
        }
        if (arg2 >= -92) {
            this.method55(-118, (byte) 126, null);
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "(ZZ)V", line = 647)
    public class5(boolean arg0, boolean arg1) {
        this.field103 = arg0;
        this.field113 = arg1;
    }
}
