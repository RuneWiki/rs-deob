import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public abstract class class4 {

    @OriginalMember(owner = "mapview!ba", name = "k", descriptor = "Z")
    private boolean field43;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Z")
    private boolean field35;

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Ld;")
    public static class7 field34 = class37.method242("Key", 1333943984);

    @OriginalMember(owner = "mapview!ba", name = "n", descriptor = "[I")
    public static int[] field46 = new int[256];

    @OriginalMember(owner = "mapview!ba", name = "s", descriptor = "Ld;")
    public static class7 field51;

    @OriginalMember(owner = "mapview!ba", name = "v", descriptor = "Ld;")
    public static class7 field54;

    @OriginalMember(owner = "mapview!ba", name = "u", descriptor = "Ld;")
    public static class7 field53;

    @OriginalMember(owner = "mapview!ba", name = "y", descriptor = "Ld;")
    public static class7 field57;

    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "I")
    private int field42;

    @OriginalMember(owner = "mapview!ba", name = "l", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "mapview!ba", name = "t", descriptor = "Lr;")
    public static class32 field52;

    @OriginalMember(owner = "mapview!ba", name = "o", descriptor = "Lt;")
    private class34 field47;

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "Lb;")
    public static class3 field40;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "[I")
    private int[] field33;

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "[I")
    private int[] field36;

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "[I")
    private int[] field37;

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "[I")
    public int[] field38;

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "[I")
    private int[] field39;

    @OriginalMember(owner = "mapview!ba", name = "w", descriptor = "[I")
    public static int[] field55;

    @OriginalMember(owner = "mapview!ba", name = "q", descriptor = "[Lt;")
    private class34[] field49;

    @OriginalMember(owner = "mapview!ba", name = "p", descriptor = "[[B")
    public byte[][] field48;

    @OriginalMember(owner = "mapview!ba", name = "x", descriptor = "[[B")
    public static byte[][] field56;

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "[[I")
    private int[][] field41;

    @OriginalMember(owner = "mapview!ba", name = "r", descriptor = "[[I")
    private int[][] field50;

    @OriginalMember(owner = "mapview!ba", name = "m", descriptor = "[[[B")
    private byte[][][] field45;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(BILd;)I", line = 23)
    public final int method25(byte arg0, int arg1, class7 arg2) {
        if (arg0 != -30) {
            this.method26((byte) 45, null, -21);
        }
        class7 var4 = arg2.method73((byte) 12);
        return this.field49[arg1].method229(arg0 + 29, var4.method56((byte) -18));
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B[II)Z", line = 58)
    private final boolean method26(byte arg0, int[] arg1, int arg2) {
        if (this.field48[arg2] == null) {
            return false;
        }
        int var4 = this.field33[arg2];
        if (arg0 <= 9) {
            this.method32(116, 47);
        }
        int[] var5 = this.field50[arg2];
        boolean var6 = true;
        byte[][] var7 = this.field45[arg2];
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
            var9 = this.field48[arg2];
        } else {
            var9 = new byte[this.field48[arg2].length];
            class19.method136(this.field48[arg2], 0, var9, 0, var9.length);
            class37 var10 = new class37(var9);
            var10.method246(var10.field505.length, arg1, 5, (byte) 47);
        }
        byte[] var11;
        try {
            var11 = class34.method228((byte) 60, var9);
        } catch (RuntimeException var26) {
            throw class24.method158(var26, "T3 - " + (arg1 != null) + "," + arg2 + "," + var9.length + "," + class14.method104(false, var9.length, var9) + "," + class14.method104(false, var9.length - 2, var9) + "," + this.field39[arg2] + "," + this.field42);
        }
        if (this.field43) {
            this.field48[arg2] = null;
        }
        if (var4 <= 1) {
            var7[var5[0]] = var11;
        } else {
            int var13 = var11.length;
            int var27 = var13 - 1;
            int var14 = var11[var27] & 0xFF;
            int var15 = var27 - var4 * var14 * 4;
            class37 var16 = new class37(var11);
            var16.field509 = var15;
            int[] var17 = new int[var4];
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var16.method244((byte) 117);
                    var17[var20] += var19;
                }
            }
            for (int var21 = 0; var21 < var4; var21++) {
                if (var7[var5[var21]] == null) {
                    var7[var5[var21]] = new byte[var17[var21]];
                }
                var17[var21] = 0;
            }
            var16.field509 = var15;
            int var22 = 0;
            for (int var23 = 0; var23 < var14; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var4; var25++) {
                    var24 += var16.method244((byte) 117);
                    class19.method136(var11, var22, var7[var5[var25]], var17[var25], var24);
                    var17[var25] += var24;
                    var22 += var24;
                }
            }
        }
        return true;
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
            field46[var0] = var1;
        }
        field51 = class37.method242("Transportation", 1333943984);
        field54 = class37.method242("", 1333943984);
        field53 = class37.method242("Staff Shop", 1333943984);
        field57 = class37.method242("Slayer Master", 1333943984);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(ZLd;)I", line = 215)
    public final int method27(boolean arg0, class7 arg1) {
        class7 var3 = arg1.method73((byte) 12);
        return arg0 ? 71 : this.field47.method229(-1, var3.method56((byte) 126));
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(III)[B", line = 230)
    public final byte[] method28(int arg0, int arg1, int arg2) {
        return arg2 == 25019 ? this.method33(arg0, null, 0, arg1) : (byte[]) null;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V", line = 242)
    public static void method29(int arg0) {
        field52 = null;
        field46 = null;
        field54 = null;
        field51 = null;
        field56 = null;
        field57 = null;
        field53 = null;
        field40 = null;
        field34 = null;
        field55 = null;
        if (arg0 != 1) {
            field56 = null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I[B)V", line = 276)
    public final void method30(int arg0, byte[] arg1) {
        if (arg0 != 8) {
            field46 = null;
        }
        this.field42 = class14.method104(false, arg1.length, arg1);
        class37 var3 = new class37(class34.method228((byte) 60, arg1));
        int var4 = var3.method237(91);
        if (var4 != 5) {
            return;
        }
        int var5 = -1;
        int var6 = 0;
        int var7 = var3.method237(-124);
        this.field44 = var3.method243((byte) -117);
        this.field38 = new int[this.field44];
        for (int var8 = 0; var8 < this.field44; var8++) {
            this.field38[var8] = var6 += var3.method243((byte) -123);
            if (var5 < this.field38[var8]) {
                var5 = this.field38[var8];
            }
        }
        this.field45 = new byte[var5 + 1][][];
        this.field39 = new int[var5 + 1];
        this.field48 = new byte[var5 + 1][];
        this.field37 = new int[var5 + 1];
        this.field33 = new int[var5 + 1];
        this.field50 = new int[var5 + 1][];
        if (var7 != 0) {
            this.field36 = new int[var5 + 1];
            for (int var9 = 0; var9 < this.field44; var9++) {
                this.field36[this.field38[var9]] = var3.method244((byte) 117);
            }
            this.field47 = new class34(this.field36);
        }
        for (int var10 = 0; var10 < this.field44; var10++) {
            this.field39[this.field38[var10]] = var3.method244((byte) 117);
        }
        for (int var11 = 0; var11 < this.field44; var11++) {
            this.field37[this.field38[var11]] = var3.method244((byte) 117);
        }
        for (int var12 = 0; var12 < this.field44; var12++) {
            this.field33[this.field38[var12]] = var3.method243((byte) -119);
        }
        for (int var13 = 0; var13 < this.field44; var13++) {
            int var14 = 0;
            int var15 = this.field38[var13];
            int var16 = -1;
            int var17 = this.field33[var15];
            this.field50[var15] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                int var19 = this.field50[var15][var18] = var14 += var3.method243((byte) -126);
                if (var16 < var19) {
                    var16 = var19;
                }
            }
            this.field45[var15] = new byte[var16 + 1][];
        }
        if (var7 == 0) {
            return;
        }
        this.field41 = new int[var5 + 1][];
        this.field49 = new class34[var5 + 1];
        for (int var20 = 0; var20 < this.field44; var20++) {
            int var21 = this.field38[var20];
            int var22 = this.field33[var21];
            this.field41[var21] = new int[this.field45[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field41[var21][this.field50[var21][var23]] = var3.method244((byte) 117);
            }
            this.field49[var21] = new class34(this.field41[var21]);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ld;Ld;I)[B", line = 429)
    public final byte[] method31(class7 arg0, class7 arg1, int arg2) {
        class7 var4 = arg0.method73((byte) 12);
        class7 var5 = arg1.method73((byte) 12);
        int var6 = this.field47.method229(~arg2, var4.method56((byte) 38));
        int var7 = this.field49[var6].method229(arg2 - 1, var5.method56((byte) -111));
        if (arg2 != 0) {
            this.method27(false, null);
        }
        return this.method28(var7, var6, 25019);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(II)V", line = 452)
    private final void method32(int arg0, int arg1) {
        if (arg0 != 5) {
            this.method27(true, null);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "(ZZ)V", line = 496)
    public class4(boolean arg0, boolean arg1) {
        this.field43 = arg0;
        this.field35 = arg1;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I[III)[B", line = 506)
    private final byte[] method33(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 > arg3 || this.field45.length <= arg3 || this.field45[arg3] == null || arg0 < 0 || this.field45[arg3].length <= arg0) {
            return null;
        }
        if (this.field45[arg3][arg0] == null) {
            boolean var5 = this.method26((byte) 107, arg1, arg3);
            if (!var5) {
                this.method32(5, arg3);
                boolean var6 = this.method26((byte) 89, arg1, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = this.field45[arg3][arg0];
        if (this.field35) {
            this.field45[arg3][arg0] = null;
        }
        return var7;
    }
}
