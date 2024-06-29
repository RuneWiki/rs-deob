import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 extends class75 {

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public int field84 = 0;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "Z")
    private boolean field111 = false;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public int field99 = 0;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "B")
    public byte field114 = 0;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "[I")
    public int[] field76;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "[I")
    public int[] field94;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "[I")
    public int[] field103;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "[I")
    private int[] field113;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "[I")
    public int[] field86;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "[I")
    public int[] field118;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "[I")
    public int[] field105;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "[B")
    public byte[] field79;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "[B")
    public byte[] field104;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "[B")
    public byte[] field120;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "[S")
    public short[] field98;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "[S")
    public short[] field117;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "[B")
    public byte[] field112;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "[I")
    private int[] field80;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "[B")
    public byte[] field109;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "[S")
    public short[] field82;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "[S")
    public short[] field77;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "[S")
    public short[] field81;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "[S")
    private short[] field83;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "[S")
    private short[] field122;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "[S")
    private short[] field110;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "[B")
    private byte[] field91;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "[B")
    private byte[] field88;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "[B")
    private byte[] field107;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "[B")
    private byte[] field97;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "[B")
    private byte[] field115;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "[[I")
    public int[][] field92;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "[[I")
    public int[][] field106;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "[Lug;")
    public class263[] field96;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "[Ll;")
    public class253[] field85;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "[Lug;")
    public class263[] field100;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "S")
    public short field119;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "S")
    public short field102;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "[I")
    private static int[] field89 = class167.field3112;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "[I")
    private static int[] field108 = new int[10000];

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "[I")
    private static int[] field87 = new int[10000];

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    private static int field116 = 0;

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "[I")
    private static int[] field121 = class167.field3110;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "S")
    private short field101;

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "S")
    private short field123;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "S")
    private short field124;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "S")
    private short field78;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "S")
    private short field93;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "S")
    private short field95;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([B)V")
    private final void method36(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class118 var4 = new class118(arg0);
        class118 var5 = new class118(arg0);
        class118 var6 = new class118(arg0);
        class118 var7 = new class118(arg0);
        class118 var8 = new class118(arg0);
        var4.field2155 = arg0.length - 18;
        int var9 = var4.method827(255);
        int var10 = var4.method827(255);
        int var11 = var4.method867(false);
        int var12 = var4.method867(false);
        int var13 = var4.method867(false);
        int var14 = var4.method867(false);
        int var15 = var4.method867(false);
        int var16 = var4.method867(false);
        int var17 = var4.method827(255);
        int var18 = var4.method827(255);
        int var19 = var4.method827(255);
        int var20 = var4.method827(255);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field84 = var9;
        this.field99 = var10;
        this.field90 = var11;
        this.field76 = new int[var9];
        this.field94 = new int[var9];
        this.field103 = new int[var9];
        this.field86 = new int[var10];
        this.field118 = new int[var10];
        this.field105 = new int[var10];
        if (var11 > 0) {
            this.field109 = new byte[var11];
            this.field82 = new short[var11];
            this.field77 = new short[var11];
            this.field81 = new short[var11];
        }
        if (var16 == 1) {
            this.field113 = new int[var9];
        }
        if (var12 == 1) {
            this.field79 = new byte[var10];
            this.field112 = new byte[var10];
            this.field117 = new short[var10];
        }
        if (var13 == 255) {
            this.field104 = new byte[var10];
        } else {
            this.field114 = (byte) var13;
        }
        if (var14 == 1) {
            this.field120 = new byte[var10];
        }
        if (var15 == 1) {
            this.field80 = new int[var10];
        }
        this.field98 = new short[var10];
        var4.field2155 = var21;
        var5.field2155 = var36;
        var6.field2155 = var38;
        var7.field2155 = var40;
        var8.field2155 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method867(false);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method824((byte) 115);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method824((byte) 43);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method824((byte) 32);
            }
            this.field76[var46] = var43 + var63;
            this.field94[var46] = var44 + var64;
            this.field103[var46] = var45 + var65;
            var43 = this.field76[var46];
            var44 = this.field94[var46];
            var45 = this.field103[var46];
            if (var16 == 1) {
                this.field113[var46] = var8.method867(false);
            }
        }
        var4.field2155 = var32;
        var5.field2155 = var28;
        var6.field2155 = var26;
        var7.field2155 = var30;
        var8.field2155 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field98[var47] = (short) var4.method827(255);
            if (var12 == 1) {
                int var61 = var5.method867(false);
                if ((var61 & 0x1) == 1) {
                    this.field79[var47] = 1;
                    var2 = true;
                } else {
                    this.field79[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field112[var47] = (byte) (var61 >> 2);
                    this.field117[var47] = this.field98[var47];
                    this.field98[var47] = 127;
                    if (this.field117[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field112[var47] = -1;
                    this.field117[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field104[var47] = var6.method838(1275919136);
            }
            if (var14 == 1) {
                this.field120[var47] = var7.method838(1275919136);
            }
            if (var15 == 1) {
                this.field80[var47] = var8.method867(false);
            }
        }
        var4.field2155 = var25;
        var5.field2155 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method867(false);
            if (var57 == 1) {
                var48 = var4.method824((byte) 57) + var51;
                var49 = var4.method824((byte) 97) + var48;
                var50 = var4.method824((byte) 76) + var49;
                var51 = var50;
                this.field86[var52] = var48;
                this.field118[var52] = var49;
                this.field105[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method824((byte) 65) + var51;
                var51 = var50;
                this.field86[var52] = var48;
                this.field118[var52] = var49;
                this.field105[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method824((byte) 111) + var51;
                var51 = var50;
                this.field86[var52] = var48;
                this.field118[var52] = var49;
                this.field105[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method824((byte) 68) + var51;
                var51 = var50;
                this.field86[var52] = var48;
                this.field118[var52] = var60;
                this.field105[var52] = var50;
            }
        }
        var4.field2155 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field109[var53] = 0;
            this.field82[var53] = (short) var4.method827(255);
            this.field77[var53] = (short) var4.method827(255);
            this.field81[var53] = (short) var4.method827(255);
        }
        if (this.field112 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field112[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field82[var56] & 0xFFFF) == this.field86[var55] && (this.field77[var56] & 0xFFFF) == this.field118[var55] && (this.field81[var56] & 0xFFFF) == this.field105[var55]) {
                        this.field112[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field112 = null;
            }
        }
        if (!var3) {
            this.field117 = null;
        }
        if (!var2) {
            this.field79 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()V")
    public final void method37() {
        for (int var1 = 0; var1 < this.field84; var1++) {
            this.field103[var1] = -this.field103[var1];
        }
        for (int var2 = 0; var2 < this.field99; var2++) {
            int var3 = this.field86[var2];
            this.field86[var2] = this.field105[var2];
            this.field105[var2] = var3;
        }
        this.method45();
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()Lqc;")
    public final class4 method38() {
        class4 var1 = new class4();
        if (this.field79 != null) {
            var1.field79 = new byte[this.field99];
            for (int var2 = 0; var2 < this.field99; var2++) {
                var1.field79[var2] = this.field79[var2];
            }
        }
        var1.field84 = this.field84;
        var1.field99 = this.field99;
        var1.field90 = this.field90;
        var1.field76 = this.field76;
        var1.field94 = this.field94;
        var1.field103 = this.field103;
        var1.field86 = this.field86;
        var1.field118 = this.field118;
        var1.field105 = this.field105;
        var1.field104 = this.field104;
        var1.field120 = this.field120;
        var1.field112 = this.field112;
        var1.field98 = this.field98;
        var1.field117 = this.field117;
        var1.field114 = this.field114;
        var1.field109 = this.field109;
        var1.field82 = this.field82;
        var1.field77 = this.field77;
        var1.field81 = this.field81;
        var1.field83 = this.field83;
        var1.field122 = this.field122;
        var1.field110 = this.field110;
        var1.field91 = this.field91;
        var1.field88 = this.field88;
        var1.field107 = this.field107;
        var1.field97 = this.field97;
        var1.field115 = this.field115;
        var1.field113 = this.field113;
        var1.field80 = this.field80;
        var1.field92 = this.field92;
        var1.field106 = this.field106;
        var1.field96 = this.field96;
        var1.field85 = this.field85;
        var1.field119 = this.field119;
        var1.field102 = this.field102;
        return var1;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
    public final void method39(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field84; var4++) {
            this.field76[var4] += arg0;
            this.field94[var4] += arg1;
            this.field103[var4] += arg2;
        }
        this.method45();
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "()V")
    public final void method40() {
        this.field113 = null;
        this.field80 = null;
        this.field92 = null;
        this.field106 = null;
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "()V")
    private final void method41() {
        if (this.field111) {
            return;
        }
        this.field111 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field84; var7++) {
            int var8 = this.field76[var7];
            int var9 = this.field94[var7];
            int var10 = this.field103[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field93 = (short) var1;
        this.field78 = (short) var4;
        this.field101 = (short) var2;
        this.field123 = (short) var5;
        this.field124 = (short) var3;
        this.field95 = (short) var6;
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "()V")
    public final void method42() {
        for (int var1 = 0; var1 < this.field84; var1++) {
            this.field76[var1] = -this.field76[var1];
            this.field103[var1] = -this.field103[var1];
        }
        this.method45();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    private final void method43(int arg0) {
        int var2 = field121[arg0];
        int var3 = field89[arg0];
        for (int var4 = 0; var4 < this.field84; var4++) {
            int var5 = this.field94[var4] * var2 + this.field76[var4] * var3 >> 16;
            this.field94[var4] = this.field94[var4] * var3 - this.field76[var4] * var2 >> 16;
            this.field76[var4] = var5;
        }
        this.method45();
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    private final void method44(int arg0) {
        int var2 = field121[arg0];
        int var3 = field89[arg0];
        for (int var4 = 0; var4 < this.field84; var4++) {
            int var5 = this.field94[var4] * var3 - this.field103[var4] * var2 >> 16;
            this.field103[var4] = this.field94[var4] * var2 + this.field103[var4] * var3 >> 16;
            this.field94[var4] = var5;
        }
        this.method45();
    }

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "()V")
    private final void method45() {
        this.field96 = null;
        this.field100 = null;
        this.field85 = null;
        this.field111 = false;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
    public final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[[I[[IIIIZZ)Lqc;")
    public final class4 method47(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method41();
        int var10 = this.field93 + arg4;
        int var11 = this.field78 + arg4;
        int var12 = this.field124 + arg6;
        int var13 = this.field95 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class4 var18;
        if (arg7) {
            var18 = new class4();
            var18.field84 = this.field84;
            var18.field99 = this.field99;
            var18.field90 = this.field90;
            var18.field86 = this.field86;
            var18.field118 = this.field118;
            var18.field105 = this.field105;
            var18.field79 = this.field79;
            var18.field104 = this.field104;
            var18.field120 = this.field120;
            var18.field112 = this.field112;
            var18.field98 = this.field98;
            var18.field117 = this.field117;
            var18.field114 = this.field114;
            var18.field109 = this.field109;
            var18.field82 = this.field82;
            var18.field77 = this.field77;
            var18.field81 = this.field81;
            var18.field83 = this.field83;
            var18.field122 = this.field122;
            var18.field110 = this.field110;
            var18.field91 = this.field91;
            var18.field88 = this.field88;
            var18.field107 = this.field107;
            var18.field97 = this.field97;
            var18.field115 = this.field115;
            var18.field113 = this.field113;
            var18.field80 = this.field80;
            var18.field92 = this.field92;
            var18.field106 = this.field106;
            var18.field119 = this.field119;
            var18.field102 = this.field102;
            var18.field96 = this.field96;
            var18.field85 = this.field85;
            var18.field100 = this.field100;
            if (arg0 == 3) {
                var18.field76 = class181.method1281(-20207, this.field76);
                var18.field94 = class181.method1281(-20207, this.field94);
                var18.field103 = class181.method1281(-20207, this.field103);
            } else {
                var18.field76 = this.field76;
                var18.field94 = new int[var18.field84];
                var18.field103 = this.field103;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field84; var19++) {
                int var20 = this.field76[var19] + arg4;
                int var21 = this.field103[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field94[var19] = this.field94[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field84; var29++) {
                int var30 = (this.field94[var29] << 16) / this.field101;
                if (var30 < arg1) {
                    int var31 = this.field76[var29] + arg4;
                    int var32 = this.field103[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field94[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field94[var29];
                } else {
                    var18.field94[var29] = this.field94[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method67(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field123 - this.field101;
            for (int var43 = 0; var43 < this.field84; var43++) {
                int var44 = this.field76[var43] + arg4;
                int var45 = this.field103[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field94[var43] = var52 + this.field94[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field123 - this.field101;
            for (int var54 = 0; var54 < this.field84; var54++) {
                int var55 = this.field76[var54] + arg4;
                int var56 = this.field103[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field94[var54] = ((this.field94[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method45();
        } else {
            this.field111 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class16 arg10) {
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(SS)V")
    public final void method49(short arg0, short arg1) {
        if (this.field117 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field99; var3++) {
            if (this.field117[var3] == arg0) {
                this.field117[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field84; var4++) {
            this.field76[var4] = this.field76[var4] * arg0 / 128;
            this.field94[var4] = this.field94[var4] * arg1 / 128;
            this.field103[var4] = this.field103[var4] * arg2 / 128;
        }
        this.method45();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)Lbb;")
    public final class75 method51(int arg0, int arg1, int arg2) {
        return this.method64(this.field119, this.field102, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(III)I")
    public final int method52(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field84; var4++) {
            if (this.field76[var4] == arg0 && this.field94[var4] == arg1 && this.field103[var4] == arg2) {
                return var4;
            }
        }
        this.field76[this.field84] = arg0;
        this.field94[this.field84] = arg1;
        this.field103[this.field84] = arg2;
        return this.field84++;
    }

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "()V")
    public static void method53() {
        field87 = null;
        field108 = null;
        field121 = null;
        field89 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lqc;IS)I")
    private final int method54(class4 arg0, int arg1, short arg2) {
        int var4 = arg0.field76[arg1];
        int var5 = arg0.field94[arg1];
        int var6 = arg0.field103[arg1];
        for (int var7 = 0; var7 < this.field84; var7++) {
            if (this.field76[var7] == var4 && this.field94[var7] == var5 && this.field103[var7] == var6) {
                return var7;
            }
        }
        this.field76[this.field84] = var4;
        this.field94[this.field84] = var5;
        this.field103[this.field84] = var6;
        if (arg0.field113 != null) {
            this.field113[this.field84] = arg0.field113[arg1];
        }
        return this.field84++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIBSB)I")
    public final int method55(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field86[this.field99] = arg0;
        this.field118[this.field99] = arg1;
        this.field105[this.field99] = arg2;
        this.field79[this.field99] = arg3;
        this.field112[this.field99] = -1;
        this.field98[this.field99] = arg4;
        this.field117[this.field99] = -1;
        this.field120[this.field99] = arg5;
        return this.field99++;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(SS)V")
    public final void method56(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field99; var3++) {
            if (this.field98[var3] == arg0) {
                this.field98[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public final void method57(int arg0) {
        int var2 = field121[arg0];
        int var3 = field89[arg0];
        for (int var4 = 0; var4 < this.field84; var4++) {
            int var5 = this.field76[var4] * var3 + this.field103[var4] * var2 >> 16;
            this.field103[var4] = this.field103[var4] * var3 - this.field76[var4] * var2 >> 16;
            this.field76[var4] = var5;
        }
        this.method45();
    }

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "()V")
    public final void method58() {
        if (this.field96 != null) {
            return;
        }
        this.field96 = new class263[this.field84];
        for (int var1 = 0; var1 < this.field84; var1++) {
            this.field96[var1] = new class263();
        }
        for (int var2 = 0; var2 < this.field99; var2++) {
            int var3 = this.field86[var2];
            int var4 = this.field118[var2];
            int var5 = this.field105[var2];
            int var6 = this.field76[var4] - this.field76[var3];
            int var7 = this.field94[var4] - this.field94[var3];
            int var8 = this.field103[var4] - this.field103[var3];
            int var9 = this.field76[var5] - this.field76[var3];
            int var10 = this.field94[var5] - this.field94[var3];
            int var11 = this.field103[var5] - this.field103[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field79 == null) {
                var19 = 0;
            } else {
                var19 = this.field79[var2];
            }
            if (var19 == 0) {
                class263 var20 = this.field96[var3];
                var20.field4666 += var16;
                var20.field4672 += var17;
                var20.field4671 += var18;
                var20.field4669++;
                class263 var21 = this.field96[var4];
                var21.field4666 += var16;
                var21.field4672 += var17;
                var21.field4671 += var18;
                var21.field4669++;
                class263 var22 = this.field96[var5];
                var22.field4666 += var16;
                var22.field4672 += var17;
                var22.field4671 += var18;
                var22.field4669++;
            } else if (var19 == 1) {
                if (this.field85 == null) {
                    this.field85 = new class253[this.field99];
                }
                class253 var23 = this.field85[var2] = new class253();
                var23.field4499 = var16;
                var23.field4493 = var17;
                var23.field4501 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "()V")
    public final void method59() {
        for (int var1 = 0; var1 < this.field84; var1++) {
            int var2 = this.field103[var1];
            this.field103[var1] = this.field76[var1];
            this.field76[var1] = -var2;
        }
        this.method45();
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIIII)Lwi;")
    public final class222 method60(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class222(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "()V")
    public final void method61() {
        for (int var1 = 0; var1 < this.field84; var1++) {
            int var2 = this.field76[var1];
            this.field76[var1] = this.field103[var1];
            this.field103[var1] = -var2;
        }
        this.method45();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()I")
    public final int method62() {
        if (!this.field111) {
            this.method41();
        }
        return this.field101;
    }

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "()V")
    public final void method63() {
        int var10002;
        if (this.field113 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field84; var3++) {
                int var7 = this.field113[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field92 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field92[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field84) {
                int var6 = this.field113[var5];
                this.field92[var6][var1[var6]++] = var5++;
            }
            this.field113 = null;
        }
        if (this.field80 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field99; var10++) {
            int var14 = this.field80[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field106 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field106[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field99) {
            int var13 = this.field80[var12];
            this.field106[var13][var8[var13]++] = var12++;
        }
        this.field80 = null;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(IIIII)Lic;")
    public final class98 method64(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class222(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()Z")
    public final boolean method65() {
        return true;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "([B)V")
    private final void method66(byte[] arg0) {
        class118 var2 = new class118(arg0);
        class118 var3 = new class118(arg0);
        class118 var4 = new class118(arg0);
        class118 var5 = new class118(arg0);
        class118 var6 = new class118(arg0);
        class118 var7 = new class118(arg0);
        class118 var8 = new class118(arg0);
        var2.field2155 = arg0.length - 23;
        int var9 = var2.method827(255);
        int var10 = var2.method827(255);
        int var11 = var2.method867(false);
        int var12 = var2.method867(false);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method867(false);
        int var16 = var2.method867(false);
        int var17 = var2.method867(false);
        int var18 = var2.method867(false);
        int var19 = var2.method867(false);
        int var20 = var2.method827(255);
        int var21 = var2.method827(255);
        int var22 = var2.method827(255);
        int var23 = var2.method827(255);
        int var24 = var2.method827(255);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field109 = new byte[var11];
            var2.field2155 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field109[var28] = var2.method838(1275919136);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field84 = var9;
        this.field99 = var10;
        this.field90 = var11;
        this.field76 = new int[var9];
        this.field94 = new int[var9];
        this.field103 = new int[var9];
        this.field86 = new int[var10];
        this.field118 = new int[var10];
        this.field105 = new int[var10];
        if (var19 == 1) {
            this.field113 = new int[var9];
        }
        if (var13) {
            this.field79 = new byte[var10];
        }
        if (var15 == 255) {
            this.field104 = new byte[var10];
        } else {
            this.field114 = (byte) var15;
        }
        if (var16 == 1) {
            this.field120 = new byte[var10];
        }
        if (var17 == 1) {
            this.field80 = new int[var10];
        }
        if (var18 == 1) {
            this.field117 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field112 = new byte[var10];
        }
        this.field98 = new short[var10];
        if (var11 > 0) {
            this.field82 = new short[var11];
            this.field77 = new short[var11];
            this.field81 = new short[var11];
            if (var26 > 0) {
                this.field83 = new short[var26];
                this.field122 = new short[var26];
                this.field110 = new short[var26];
                this.field91 = new byte[var26];
                this.field88 = new byte[var26];
                this.field107 = new byte[var26];
            }
            if (var27 > 0) {
                this.field97 = new byte[var27];
                this.field115 = new byte[var27];
            }
        }
        var2.field2155 = var11;
        var3.field2155 = var46;
        var4.field2155 = var48;
        var5.field2155 = var50;
        var6.field2155 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var84 = var2.method867(false);
            int var85 = 0;
            if ((var84 & 0x1) != 0) {
                var85 = var3.method824((byte) 109);
            }
            int var86 = 0;
            if ((var84 & 0x2) != 0) {
                var86 = var4.method824((byte) 68);
            }
            int var87 = 0;
            if ((var84 & 0x4) != 0) {
                var87 = var5.method824((byte) 106);
            }
            this.field76[var69] = var66 + var85;
            this.field94[var69] = var67 + var86;
            this.field103[var69] = var68 + var87;
            var66 = this.field76[var69];
            var67 = this.field94[var69];
            var68 = this.field103[var69];
            if (var19 == 1) {
                this.field113[var69] = var6.method867(false);
            }
        }
        var2.field2155 = var44;
        var3.field2155 = var33;
        var4.field2155 = var36;
        var5.field2155 = var39;
        var6.field2155 = var37;
        var7.field2155 = var42;
        var8.field2155 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field98[var70] = (short) var2.method827(255);
            if (var13) {
                this.field79[var70] = var3.method838(1275919136);
            }
            if (var15 == 255) {
                this.field104[var70] = var4.method838(1275919136);
            }
            if (var16 == 1) {
                this.field120[var70] = var5.method838(1275919136);
            }
            if (var17 == 1) {
                this.field80[var70] = var6.method867(false);
            }
            if (var18 == 1) {
                this.field117[var70] = (short) (var7.method827(255) - 1);
            }
            if (this.field112 != null) {
                if (this.field117[var70] == -1) {
                    this.field112[var70] = -1;
                } else {
                    this.field112[var70] = (byte) (var8.method867(false) - 1);
                }
            }
        }
        var2.field2155 = var35;
        var3.field2155 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var80 = var3.method867(false);
            if (var80 == 1) {
                var71 = var2.method824((byte) 24) + var74;
                var72 = var2.method824((byte) 37) + var71;
                var73 = var2.method824((byte) 103) + var72;
                var74 = var73;
                this.field86[var75] = var71;
                this.field118[var75] = var72;
                this.field105[var75] = var73;
            }
            if (var80 == 2) {
                var72 = var73;
                var73 = var2.method824((byte) 73) + var74;
                var74 = var73;
                this.field86[var75] = var71;
                this.field118[var75] = var72;
                this.field105[var75] = var73;
            }
            if (var80 == 3) {
                var71 = var73;
                var73 = var2.method824((byte) 34) + var74;
                var74 = var73;
                this.field86[var75] = var71;
                this.field118[var75] = var72;
                this.field105[var75] = var73;
            }
            if (var80 == 4) {
                int var83 = var71;
                var71 = var72;
                var72 = var83;
                var73 = var2.method824((byte) 29) + var74;
                var74 = var73;
                this.field86[var75] = var71;
                this.field118[var75] = var83;
                this.field105[var75] = var73;
            }
        }
        var2.field2155 = var52;
        var3.field2155 = var54;
        var4.field2155 = var56;
        var5.field2155 = var58;
        var6.field2155 = var60;
        var7.field2155 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var79 = this.field109[var76] & 0xFF;
            if (var79 == 0) {
                this.field82[var76] = (short) var2.method827(255);
                this.field77[var76] = (short) var2.method827(255);
                this.field81[var76] = (short) var2.method827(255);
            }
            if (var79 == 1) {
                this.field82[var76] = (short) var3.method827(255);
                this.field77[var76] = (short) var3.method827(255);
                this.field81[var76] = (short) var3.method827(255);
                this.field83[var76] = (short) var4.method827(255);
                this.field122[var76] = (short) var4.method827(255);
                this.field110[var76] = (short) var4.method827(255);
                this.field91[var76] = var5.method838(1275919136);
                this.field88[var76] = var6.method838(1275919136);
                this.field107[var76] = var7.method838(1275919136);
            }
            if (var79 == 2) {
                this.field82[var76] = (short) var3.method827(255);
                this.field77[var76] = (short) var3.method827(255);
                this.field81[var76] = (short) var3.method827(255);
                this.field83[var76] = (short) var4.method827(255);
                this.field122[var76] = (short) var4.method827(255);
                this.field110[var76] = (short) var4.method827(255);
                this.field91[var76] = var5.method838(1275919136);
                this.field88[var76] = var6.method838(1275919136);
                this.field107[var76] = var7.method838(1275919136);
                this.field97[var76] = var7.method838(1275919136);
                this.field115[var76] = var7.method838(1275919136);
            }
            if (var79 == 3) {
                this.field82[var76] = (short) var3.method827(255);
                this.field77[var76] = (short) var3.method827(255);
                this.field81[var76] = (short) var3.method827(255);
                this.field83[var76] = (short) var4.method827(255);
                this.field122[var76] = (short) var4.method827(255);
                this.field110[var76] = (short) var4.method827(255);
                this.field91[var76] = var5.method838(1275919136);
                this.field88[var76] = var6.method838(1275919136);
                this.field107[var76] = var7.method838(1275919136);
            }
        }
        if (!var14) {
            return;
        }
        var2.field2155 = var64;
        int var77 = var2.method867(false);
        if (var77 > 0) {
            var2.field2155 += var77 * 4;
        }
        int var78 = var2.method867(false);
        if (var78 > 0) {
            var2.field2155 += var78 * 4;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([[IIIIII)V")
    private final void method67(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method69(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method69(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method69(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method69(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method44(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method43(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method39(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lhi;II)Lqc;")
    public static final class4 method68(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1688(0, arg2, arg1);
        return var3 == null ? null : new class4(var3);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([[III)I")
    private static final int method69(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    private class4() {
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B)V")
    private class4(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method66(arg0);
        } else {
            this.method36(arg0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lbb;IIIZ)V")
    public final void method70(class75 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class4 var6 = (class4) arg0;
        var6.method41();
        var6.method58();
        field116++;
        int var7 = 0;
        int[] var8 = var6.field76;
        int var9 = var6.field84;
        for (int var10 = 0; var10 < this.field84; var10++) {
            class263 var13 = this.field96[var10];
            if (var13.field4669 != 0) {
                int var14 = this.field94[var10] - arg2;
                if (var14 >= var6.field101 && var14 <= var6.field123) {
                    int var15 = this.field76[var10] - arg1;
                    if (var15 >= var6.field93 && var15 <= var6.field78) {
                        int var16 = this.field103[var10] - arg3;
                        if (var16 >= var6.field124 && var16 <= var6.field95) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class263 var18 = var6.field96[var17];
                                if (var8[var17] == var15 && var6.field103[var17] == var16 && var6.field94[var17] == var14 && var18.field4669 != 0) {
                                    if (this.field100 == null) {
                                        this.field100 = new class263[this.field84];
                                    }
                                    if (var6.field100 == null) {
                                        var6.field100 = new class263[var9];
                                    }
                                    class263 var19 = this.field100[var10];
                                    if (var19 == null) {
                                        var19 = this.field100[var10] = new class263(var13);
                                    }
                                    class263 var20 = var6.field100[var17];
                                    if (var20 == null) {
                                        var20 = var6.field100[var17] = new class263(var18);
                                    }
                                    var19.field4666 += var18.field4666;
                                    var19.field4672 += var18.field4672;
                                    var19.field4671 += var18.field4671;
                                    var19.field4669 += var18.field4669;
                                    var20.field4666 += var13.field4666;
                                    var20.field4672 += var13.field4672;
                                    var20.field4671 += var13.field4671;
                                    var20.field4669 += var13.field4669;
                                    var7++;
                                    field87[var10] = field116;
                                    field108[var17] = field116;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field99; var11++) {
            if (field87[this.field86[var11]] == field116 && field87[this.field118[var11]] == field116 && field87[this.field105[var11]] == field116) {
                if (this.field79 == null) {
                    this.field79 = new byte[this.field99];
                }
                this.field79[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field99; var12++) {
            if (field108[var6.field86[var12]] == field116 && field108[var6.field118[var12]] == field116 && field108[var6.field105[var12]] == field116) {
                if (var6.field79 == null) {
                    var6.field79 = new byte[var6.field99];
                }
                var6.field79[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(III)V")
    public class4(int arg0, int arg1, int arg2) {
        this.field76 = new int[arg0];
        this.field94 = new int[arg0];
        this.field103 = new int[arg0];
        this.field113 = new int[arg0];
        this.field86 = new int[arg1];
        this.field118 = new int[arg1];
        this.field105 = new int[arg1];
        this.field79 = new byte[arg1];
        this.field104 = new byte[arg1];
        this.field120 = new byte[arg1];
        this.field98 = new short[arg1];
        this.field117 = new short[arg1];
        this.field112 = new byte[arg1];
        this.field80 = new int[arg1];
        if (arg2 > 0) {
            this.field109 = new byte[arg2];
            this.field82 = new short[arg2];
            this.field77 = new short[arg2];
            this.field81 = new short[arg2];
            this.field83 = new short[arg2];
            this.field122 = new short[arg2];
            this.field110 = new short[arg2];
            this.field91 = new byte[arg2];
            this.field88 = new byte[arg2];
            this.field107 = new byte[arg2];
            this.field97 = new byte[arg2];
            this.field115 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([Lqc;I)V")
    public class4(class4[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field84 = 0;
        this.field99 = 0;
        this.field90 = 0;
        boolean var9 = false;
        boolean var10 = false;
        this.field114 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class4 var20 = arg0[var11];
            if (var20 != null) {
                this.field84 += var20.field84;
                this.field99 += var20.field99;
                this.field90 += var20.field90;
                if (var20.field104 == null) {
                    if (this.field114 == -1) {
                        this.field114 = var20.field114;
                    }
                    if (this.field114 != var20.field114) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var20.field79 != null;
                var5 |= var20.field120 != null;
                var6 |= var20.field80 != null;
                var7 |= var20.field117 != null;
                var8 |= var20.field112 != null;
            }
        }
        this.field76 = new int[this.field84];
        this.field94 = new int[this.field84];
        this.field103 = new int[this.field84];
        this.field113 = new int[this.field84];
        this.field86 = new int[this.field99];
        this.field118 = new int[this.field99];
        this.field105 = new int[this.field99];
        if (var3) {
            this.field79 = new byte[this.field99];
        }
        if (var4) {
            this.field104 = new byte[this.field99];
        }
        if (var5) {
            this.field120 = new byte[this.field99];
        }
        if (var6) {
            this.field80 = new int[this.field99];
        }
        if (var7) {
            this.field117 = new short[this.field99];
        }
        if (var8) {
            this.field112 = new byte[this.field99];
        }
        this.field98 = new short[this.field99];
        if (this.field90 > 0) {
            this.field109 = new byte[this.field90];
            this.field82 = new short[this.field90];
            this.field77 = new short[this.field90];
            this.field81 = new short[this.field90];
            this.field83 = new short[this.field90];
            this.field122 = new short[this.field90];
            this.field110 = new short[this.field90];
            this.field91 = new byte[this.field90];
            this.field88 = new byte[this.field90];
            this.field107 = new byte[this.field90];
            this.field97 = new byte[this.field90];
            this.field115 = new byte[this.field90];
        }
        this.field84 = 0;
        this.field99 = 0;
        this.field90 = 0;
        boolean var12 = false;
        boolean var13 = false;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var15 = (short) (0x1 << var14);
            class4 var16 = arg0[var14];
            if (var16 != null) {
                for (int var17 = 0; var17 < var16.field99; var17++) {
                    if (var3 && var16.field79 != null) {
                        this.field79[this.field99] = var16.field79[var17];
                    }
                    if (var4) {
                        if (var16.field104 == null) {
                            this.field104[this.field99] = var16.field114;
                        } else {
                            this.field104[this.field99] = var16.field104[var17];
                        }
                    }
                    if (var5 && var16.field120 != null) {
                        this.field120[this.field99] = var16.field120[var17];
                    }
                    if (var6 && var16.field80 != null) {
                        this.field80[this.field99] = var16.field80[var17];
                    }
                    if (var7) {
                        if (var16.field117 == null) {
                            this.field117[this.field99] = -1;
                        } else {
                            this.field117[this.field99] = var16.field117[var17];
                        }
                    }
                    if (var8) {
                        if (var16.field112 == null || var16.field112[var17] == -1) {
                            this.field112[this.field99] = -1;
                        } else {
                            this.field112[this.field99] = (byte) (var16.field112[var17] + this.field90);
                        }
                    }
                    this.field98[this.field99] = var16.field98[var17];
                    this.field86[this.field99] = this.method54(var16, var16.field86[var17], var15);
                    this.field118[this.field99] = this.method54(var16, var16.field118[var17], var15);
                    this.field105[this.field99] = this.method54(var16, var16.field105[var17], var15);
                    this.field99++;
                }
                for (int var18 = 0; var18 < var16.field90; var18++) {
                    byte var19 = this.field109[this.field90] = var16.field109[var18];
                    if (var19 == 0) {
                        this.field82[this.field90] = (short) this.method54(var16, var16.field82[var18], var15);
                        this.field77[this.field90] = (short) this.method54(var16, var16.field77[var18], var15);
                        this.field81[this.field90] = (short) this.method54(var16, var16.field81[var18], var15);
                    }
                    if (var19 >= 1 && var19 <= 3) {
                        this.field82[this.field90] = var16.field82[var18];
                        this.field77[this.field90] = var16.field77[var18];
                        this.field81[this.field90] = var16.field81[var18];
                        this.field83[this.field90] = var16.field83[var18];
                        this.field122[this.field90] = var16.field122[var18];
                        this.field110[this.field90] = var16.field110[var18];
                        this.field91[this.field90] = var16.field91[var18];
                        this.field88[this.field90] = var16.field88[var18];
                        this.field107[this.field90] = var16.field107[var18];
                    }
                    if (var19 == 2) {
                        this.field97[this.field90] = var16.field97[var18];
                        this.field115[this.field90] = var16.field115[var18];
                    }
                    this.field90++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lqc;ZZZZ)V")
    public class4(class4 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field84 = arg0.field84;
        this.field99 = arg0.field99;
        this.field90 = arg0.field90;
        if (arg1) {
            this.field76 = arg0.field76;
            this.field94 = arg0.field94;
            this.field103 = arg0.field103;
        } else {
            this.field76 = new int[this.field84];
            this.field94 = new int[this.field84];
            this.field103 = new int[this.field84];
            for (int var6 = 0; var6 < this.field84; var6++) {
                this.field76[var6] = arg0.field76[var6];
                this.field94[var6] = arg0.field94[var6];
                this.field103[var6] = arg0.field103[var6];
            }
        }
        if (arg2) {
            this.field98 = arg0.field98;
        } else {
            this.field98 = new short[this.field99];
            for (int var7 = 0; var7 < this.field99; var7++) {
                this.field98[var7] = arg0.field98[var7];
            }
        }
        if (arg3 || arg0.field117 == null) {
            this.field117 = arg0.field117;
        } else {
            this.field117 = new short[this.field99];
            for (int var8 = 0; var8 < this.field99; var8++) {
                this.field117[var8] = arg0.field117[var8];
            }
        }
        if (arg4) {
            this.field120 = arg0.field120;
        } else {
            this.field120 = new byte[this.field99];
            if (arg0.field120 == null) {
                for (int var9 = 0; var9 < this.field99; var9++) {
                    this.field120[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field99; var10++) {
                    this.field120[var10] = arg0.field120[var10];
                }
            }
        }
        this.field86 = arg0.field86;
        this.field118 = arg0.field118;
        this.field105 = arg0.field105;
        this.field79 = arg0.field79;
        this.field104 = arg0.field104;
        this.field112 = arg0.field112;
        this.field114 = arg0.field114;
        this.field109 = arg0.field109;
        this.field82 = arg0.field82;
        this.field77 = arg0.field77;
        this.field81 = arg0.field81;
        this.field83 = arg0.field83;
        this.field122 = arg0.field122;
        this.field110 = arg0.field110;
        this.field91 = arg0.field91;
        this.field88 = arg0.field88;
        this.field107 = arg0.field107;
        this.field97 = arg0.field97;
        this.field115 = arg0.field115;
        this.field113 = arg0.field113;
        this.field80 = arg0.field80;
        this.field92 = arg0.field92;
        this.field106 = arg0.field106;
        this.field96 = arg0.field96;
        this.field85 = arg0.field85;
        this.field100 = arg0.field100;
        this.field119 = arg0.field119;
        this.field102 = arg0.field102;
    }
}
