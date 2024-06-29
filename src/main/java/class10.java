import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 extends class235 {

    @OriginalMember(owner = "client!ai", name = "rb", descriptor = "I")
    public int field165 = 0;

    @OriginalMember(owner = "client!ai", name = "wb", descriptor = "I")
    public int field170 = 0;

    @OriginalMember(owner = "client!ai", name = "Fb", descriptor = "Z")
    private boolean field179 = false;

    @OriginalMember(owner = "client!ai", name = "Rb", descriptor = "B")
    public byte field191 = 0;

    @OriginalMember(owner = "client!ai", name = "Sb", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "client!ai", name = "sb", descriptor = "[I")
    public int[] field166;

    @OriginalMember(owner = "client!ai", name = "nb", descriptor = "[I")
    public int[] field161;

    @OriginalMember(owner = "client!ai", name = "Gb", descriptor = "[I")
    public int[] field180;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "[I")
    private int[] field149;

    @OriginalMember(owner = "client!ai", name = "ib", descriptor = "[I")
    public int[] field156;

    @OriginalMember(owner = "client!ai", name = "jb", descriptor = "[I")
    public int[] field157;

    @OriginalMember(owner = "client!ai", name = "zb", descriptor = "[I")
    public int[] field173;

    @OriginalMember(owner = "client!ai", name = "Tb", descriptor = "[B")
    public byte[] field193;

    @OriginalMember(owner = "client!ai", name = "xb", descriptor = "[B")
    public byte[] field171;

    @OriginalMember(owner = "client!ai", name = "mb", descriptor = "[B")
    public byte[] field160;

    @OriginalMember(owner = "client!ai", name = "Mb", descriptor = "[I")
    private int[] field186;

    @OriginalMember(owner = "client!ai", name = "kb", descriptor = "[S")
    public short[] field158;

    @OriginalMember(owner = "client!ai", name = "Bb", descriptor = "[B")
    public byte[] field175;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "[S")
    public short[] field151;

    @OriginalMember(owner = "client!ai", name = "Wb", descriptor = "[B")
    public byte[] field196;

    @OriginalMember(owner = "client!ai", name = "Jb", descriptor = "[S")
    public short[] field183;

    @OriginalMember(owner = "client!ai", name = "Cb", descriptor = "[S")
    public short[] field176;

    @OriginalMember(owner = "client!ai", name = "Db", descriptor = "[S")
    public short[] field177;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "[S")
    private short[] field150;

    @OriginalMember(owner = "client!ai", name = "lb", descriptor = "[S")
    private short[] field159;

    @OriginalMember(owner = "client!ai", name = "Ob", descriptor = "[S")
    private short[] field188;

    @OriginalMember(owner = "client!ai", name = "Ib", descriptor = "[B")
    private byte[] field182;

    @OriginalMember(owner = "client!ai", name = "pb", descriptor = "[B")
    private byte[] field163;

    @OriginalMember(owner = "client!ai", name = "Xb", descriptor = "[B")
    private byte[] field197;

    @OriginalMember(owner = "client!ai", name = "Nb", descriptor = "[B")
    private byte[] field187;

    @OriginalMember(owner = "client!ai", name = "Kb", descriptor = "[B")
    private byte[] field184;

    @OriginalMember(owner = "client!ai", name = "qb", descriptor = "[[I")
    public int[][] field164;

    @OriginalMember(owner = "client!ai", name = "Ab", descriptor = "[[I")
    public int[][] field174;

    @OriginalMember(owner = "client!ai", name = "yb", descriptor = "[Lcd;")
    public class27[] field172;

    @OriginalMember(owner = "client!ai", name = "ob", descriptor = "[Lje;")
    public class102[] field162;

    @OriginalMember(owner = "client!ai", name = "Eb", descriptor = "[Lcd;")
    public class27[] field178;

    @OriginalMember(owner = "client!ai", name = "ub", descriptor = "S")
    public short field168;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "S")
    public short field153;

    @OriginalMember(owner = "client!ai", name = "Hb", descriptor = "[I")
    private static int[] field181 = class61.field1208;

    @OriginalMember(owner = "client!ai", name = "vb", descriptor = "[I")
    private static int[] field169 = class61.field1191;

    @OriginalMember(owner = "client!ai", name = "Lb", descriptor = "I")
    private static int field185 = 0;

    @OriginalMember(owner = "client!ai", name = "Ub", descriptor = "[I")
    private static int[] field194 = new int[10000];

    @OriginalMember(owner = "client!ai", name = "Vb", descriptor = "[I")
    private static int[] field195 = new int[10000];

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "S")
    private short field152;

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "S")
    private short field154;

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "S")
    private short field155;

    @OriginalMember(owner = "client!ai", name = "tb", descriptor = "S")
    private short field167;

    @OriginalMember(owner = "client!ai", name = "Pb", descriptor = "S")
    private short field189;

    @OriginalMember(owner = "client!ai", name = "Qb", descriptor = "S")
    private short field190;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "()V")
    public final void method54() {
        for (int var1 = 0; var1 < this.field165; var1++) {
            this.field180[var1] = -this.field180[var1];
        }
        for (int var2 = 0; var2 < this.field170; var2++) {
            int var3 = this.field156[var2];
            this.field156[var2] = this.field173[var2];
            this.field173[var2] = var3;
        }
        this.method73();
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "()V")
    public final void method55() {
        for (int var1 = 0; var1 < this.field165; var1++) {
            this.field166[var1] = -this.field166[var1];
            this.field180[var1] = -this.field180[var1];
        }
        this.method73();
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "()V")
    public final void method56() {
        for (int var1 = 0; var1 < this.field165; var1++) {
            int var2 = this.field166[var1];
            this.field166[var1] = this.field180[var1];
            this.field180[var1] = -var2;
        }
        this.method73();
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "()V")
    public final void method57() {
        this.field149 = null;
        this.field186 = null;
        this.field164 = null;
        this.field174 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)Lbf;")
    public final class18 method58(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class76(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
    public final void method59(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field165; var4++) {
            this.field166[var4] += arg0;
            this.field161[var4] += arg1;
            this.field180[var4] += arg2;
        }
        this.method73();
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public final void method60(int arg0) {
        int var2 = field169[arg0];
        int var3 = field181[arg0];
        for (int var4 = 0; var4 < this.field165; var4++) {
            int var5 = this.field180[var4] * var2 + this.field166[var4] * var3 >> 16;
            this.field180[var4] = this.field180[var4] * var3 - this.field166[var4] * var2 >> 16;
            this.field166[var4] = var5;
        }
        this.method73();
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "()V")
    private final void method61() {
        if (this.field179) {
            return;
        }
        this.field179 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field165; var7++) {
            int var8 = this.field166[var7];
            int var9 = this.field161[var7];
            int var10 = this.field180[var7];
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
        this.field154 = (short) var1;
        this.field190 = (short) var4;
        this.field152 = (short) var2;
        this.field155 = (short) var5;
        this.field189 = (short) var3;
        this.field167 = (short) var6;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([B)V")
    private final void method62(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class229 var4 = new class229(arg0);
        class229 var5 = new class229(arg0);
        class229 var6 = new class229(arg0);
        class229 var7 = new class229(arg0);
        class229 var8 = new class229(arg0);
        var4.field4101 = arg0.length - 18;
        int var9 = var4.method1490((byte) 73);
        int var10 = var4.method1490((byte) 73);
        int var11 = var4.method1475(255);
        int var12 = var4.method1475(255);
        int var13 = var4.method1475(255);
        int var14 = var4.method1475(255);
        int var15 = var4.method1475(255);
        int var16 = var4.method1475(255);
        int var17 = var4.method1490((byte) 73);
        int var18 = var4.method1490((byte) 73);
        int var19 = var4.method1490((byte) 73);
        int var20 = var4.method1490((byte) 73);
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
        this.field165 = var9;
        this.field170 = var10;
        this.field192 = var11;
        this.field166 = new int[var9];
        this.field161 = new int[var9];
        this.field180 = new int[var9];
        this.field156 = new int[var10];
        this.field157 = new int[var10];
        this.field173 = new int[var10];
        if (var11 > 0) {
            this.field196 = new byte[var11];
            this.field183 = new short[var11];
            this.field176 = new short[var11];
            this.field177 = new short[var11];
        }
        if (var16 == 1) {
            this.field149 = new int[var9];
        }
        if (var12 == 1) {
            this.field193 = new byte[var10];
            this.field175 = new byte[var10];
            this.field158 = new short[var10];
        }
        if (var13 == 255) {
            this.field171 = new byte[var10];
        } else {
            this.field191 = (byte) var13;
        }
        if (var14 == 1) {
            this.field160 = new byte[var10];
        }
        if (var15 == 1) {
            this.field186 = new int[var10];
        }
        this.field151 = new short[var10];
        var4.field4101 = var21;
        var5.field4101 = var36;
        var6.field4101 = var38;
        var7.field4101 = var40;
        var8.field4101 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1475(255);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1470(55);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1470(45);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1470(56);
            }
            this.field166[var46] = var43 + var63;
            this.field161[var46] = var44 + var64;
            this.field180[var46] = var45 + var65;
            var43 = this.field166[var46];
            var44 = this.field161[var46];
            var45 = this.field180[var46];
            if (var16 == 1) {
                this.field149[var46] = var8.method1475(255);
            }
        }
        var4.field4101 = var32;
        var5.field4101 = var28;
        var6.field4101 = var26;
        var7.field4101 = var30;
        var8.field4101 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field151[var47] = (short) var4.method1490((byte) 73);
            if (var12 == 1) {
                int var61 = var5.method1475(255);
                if ((var61 & 0x1) == 1) {
                    this.field193[var47] = 1;
                    var2 = true;
                } else {
                    this.field193[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field175[var47] = (byte) (var61 >> 2);
                    this.field158[var47] = this.field151[var47];
                    this.field151[var47] = 127;
                    if (this.field158[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field175[var47] = -1;
                    this.field158[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field171[var47] = var6.method1457(-2);
            }
            if (var14 == 1) {
                this.field160[var47] = var7.method1457(-2);
            }
            if (var15 == 1) {
                this.field186[var47] = var8.method1475(255);
            }
        }
        var4.field4101 = var25;
        var5.field4101 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1475(255);
            if (var57 == 1) {
                var48 = var4.method1470(110) + var51;
                var49 = var4.method1470(29) + var48;
                var50 = var4.method1470(34) + var49;
                var51 = var50;
                this.field156[var52] = var48;
                this.field157[var52] = var49;
                this.field173[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1470(92) + var51;
                var51 = var50;
                this.field156[var52] = var48;
                this.field157[var52] = var49;
                this.field173[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1470(46) + var51;
                var51 = var50;
                this.field156[var52] = var48;
                this.field157[var52] = var49;
                this.field173[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1470(101) + var51;
                var51 = var50;
                this.field156[var52] = var48;
                this.field157[var52] = var60;
                this.field173[var52] = var50;
            }
        }
        var4.field4101 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field196[var53] = 0;
            this.field183[var53] = (short) var4.method1490((byte) 73);
            this.field176[var53] = (short) var4.method1490((byte) 73);
            this.field177[var53] = (short) var4.method1490((byte) 73);
        }
        if (this.field175 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field175[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field183[var56] & 0xFFFF) == this.field156[var55] && (this.field176[var56] & 0xFFFF) == this.field157[var55] && (this.field177[var56] & 0xFFFF) == this.field173[var55]) {
                        this.field175[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field175 = null;
            }
        }
        if (!var3) {
            this.field158 = null;
        }
        if (!var2) {
            this.field193 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)V")
    public final void method63(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field165; var4++) {
            this.field166[var4] = this.field166[var4] * arg0 / 128;
            this.field161[var4] = this.field161[var4] * arg1 / 128;
            this.field180[var4] = this.field180[var4] * arg2 / 128;
        }
        this.method73();
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "()V")
    public static void method64() {
        field194 = null;
        field195 = null;
        field169 = null;
        field181 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([[IIIIZIZ)Lai;")
    public final class10 method65(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        this.method61();
        int var8 = this.field154 + arg1;
        int var9 = this.field190 + arg1;
        int var10 = this.field189 + arg3;
        int var11 = this.field167 + arg3;
        if (var8 < 0 || var9 + 128 >> 7 >= arg0.length || var10 < 0 || var11 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var12 = var8 >> 7;
        int var13 = var9 + 127 >> 7;
        int var14 = var10 >> 7;
        int var15 = var11 + 127 >> 7;
        if (arg0[var12][var14] == arg2 && arg0[var13][var14] == arg2 && arg0[var12][var15] == arg2 && arg0[var13][var15] == arg2) {
            return this;
        }
        class10 var16;
        if (arg4) {
            var16 = new class10();
            var16.field165 = this.field165;
            var16.field170 = this.field170;
            var16.field192 = this.field192;
            var16.field166 = this.field166;
            var16.field180 = this.field180;
            var16.field156 = this.field156;
            var16.field157 = this.field157;
            var16.field173 = this.field173;
            var16.field193 = this.field193;
            var16.field171 = this.field171;
            var16.field160 = this.field160;
            var16.field175 = this.field175;
            var16.field151 = this.field151;
            var16.field158 = this.field158;
            var16.field191 = this.field191;
            var16.field196 = this.field196;
            var16.field183 = this.field183;
            var16.field176 = this.field176;
            var16.field177 = this.field177;
            var16.field150 = this.field150;
            var16.field159 = this.field159;
            var16.field188 = this.field188;
            var16.field182 = this.field182;
            var16.field163 = this.field163;
            var16.field197 = this.field197;
            var16.field187 = this.field187;
            var16.field184 = this.field184;
            var16.field149 = this.field149;
            var16.field186 = this.field186;
            var16.field164 = this.field164;
            var16.field174 = this.field174;
            var16.field168 = this.field168;
            var16.field153 = this.field153;
            var16.field172 = this.field172;
            var16.field162 = this.field162;
            var16.field178 = this.field178;
            var16.field161 = new int[var16.field165];
        } else {
            var16 = this;
        }
        if (arg5 == 0) {
            for (int var17 = 0; var17 < var16.field165; var17++) {
                int var18 = this.field166[var17] + arg1;
                int var19 = this.field180[var17] + arg3;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg0[var22][var23] + arg0[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg0[var22][var23 + 1] + arg0[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                var16.field161[var17] = this.field161[var17] + var26 - arg2;
            }
        } else {
            for (int var27 = 0; var27 < var16.field165; var27++) {
                int var28 = (this.field161[var27] << 16) / this.field152;
                if (var28 < arg5) {
                    int var29 = this.field166[var27] + arg1;
                    int var30 = this.field180[var27] + arg3;
                    int var31 = var29 & 0x7F;
                    int var32 = var30 & 0x7F;
                    int var33 = var29 >> 7;
                    int var34 = var30 >> 7;
                    int var35 = (128 - var31) * arg0[var33][var34] + arg0[var33 + 1][var34] * var31 >> 7;
                    int var36 = (128 - var31) * arg0[var33][var34 + 1] + arg0[var33 + 1][var34 + 1] * var31 >> 7;
                    int var37 = (128 - var32) * var35 + var32 * var36 >> 7;
                    var16.field161[var27] = (var37 - arg2) * (arg5 - var28) / arg5 + this.field161[var27];
                } else {
                    var16.field161[var27] = this.field161[var27];
                }
            }
        }
        if (arg6) {
            var16.method73();
        } else {
            this.field179 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(SS)V")
    public final void method66(short arg0, short arg1) {
        if (this.field158 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field170; var3++) {
            if (this.field158[var3] == arg0) {
                this.field158[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lsd;II)Lai;")
    public static final class10 method67(class192 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1208(arg2, (byte) -80, arg1);
        return var3 == null ? null : new class10(var3);
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "()V")
    public final void method68() {
        if (this.field172 != null) {
            return;
        }
        this.field172 = new class27[this.field165];
        for (int var1 = 0; var1 < this.field165; var1++) {
            this.field172[var1] = new class27();
        }
        for (int var2 = 0; var2 < this.field170; var2++) {
            int var3 = this.field156[var2];
            int var4 = this.field157[var2];
            int var5 = this.field173[var2];
            int var6 = this.field166[var4] - this.field166[var3];
            int var7 = this.field161[var4] - this.field161[var3];
            int var8 = this.field180[var4] - this.field180[var3];
            int var9 = this.field166[var5] - this.field166[var3];
            int var10 = this.field161[var5] - this.field161[var3];
            int var11 = this.field180[var5] - this.field180[var3];
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
            if (this.field193 == null) {
                var19 = 0;
            } else {
                var19 = this.field193[var2];
            }
            if (var19 == 0) {
                class27 var20 = this.field172[var3];
                var20.field576 += var16;
                var20.field574 += var17;
                var20.field568 += var18;
                var20.field580++;
                class27 var21 = this.field172[var4];
                var21.field576 += var16;
                var21.field574 += var17;
                var21.field568 += var18;
                var21.field580++;
                class27 var22 = this.field172[var5];
                var22.field576 += var16;
                var22.field574 += var17;
                var22.field568 += var18;
                var22.field580++;
            } else if (var19 == 1) {
                if (this.field162 == null) {
                    this.field162 = new class102[this.field170];
                }
                class102 var23 = this.field162[var2] = new class102();
                var23.field1842 = var16;
                var23.field1843 = var17;
                var23.field1846 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "()Lai;")
    public final class10 method69() {
        class10 var1 = new class10();
        if (this.field193 != null) {
            var1.field193 = new byte[this.field170];
            for (int var2 = 0; var2 < this.field170; var2++) {
                var1.field193[var2] = this.field193[var2];
            }
        }
        var1.field165 = this.field165;
        var1.field170 = this.field170;
        var1.field192 = this.field192;
        var1.field166 = this.field166;
        var1.field161 = this.field161;
        var1.field180 = this.field180;
        var1.field156 = this.field156;
        var1.field157 = this.field157;
        var1.field173 = this.field173;
        var1.field171 = this.field171;
        var1.field160 = this.field160;
        var1.field175 = this.field175;
        var1.field151 = this.field151;
        var1.field158 = this.field158;
        var1.field191 = this.field191;
        var1.field196 = this.field196;
        var1.field183 = this.field183;
        var1.field176 = this.field176;
        var1.field177 = this.field177;
        var1.field150 = this.field150;
        var1.field159 = this.field159;
        var1.field188 = this.field188;
        var1.field182 = this.field182;
        var1.field163 = this.field163;
        var1.field197 = this.field197;
        var1.field187 = this.field187;
        var1.field184 = this.field184;
        var1.field149 = this.field149;
        var1.field186 = this.field186;
        var1.field164 = this.field164;
        var1.field174 = this.field174;
        var1.field172 = this.field172;
        var1.field162 = this.field162;
        var1.field168 = this.field168;
        var1.field153 = this.field153;
        return var1;
    }

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "()V")
    public final void method70() {
        for (int var1 = 0; var1 < this.field165; var1++) {
            int var2 = this.field180[var1];
            this.field180[var1] = this.field166[var1];
            this.field166[var1] = -var2;
        }
        this.method73();
    }

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "()V")
    public final void method71() {
        int var10002;
        if (this.field149 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field165; var3++) {
                int var7 = this.field149[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field164 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field164[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field165) {
                int var6 = this.field149[var5];
                this.field164[var6][var1[var6]++] = var5++;
            }
            this.field149 = null;
        }
        if (this.field186 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field170; var10++) {
            int var14 = this.field186[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field174 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field174[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field170) {
            int var13 = this.field186[var12];
            this.field174[var13][var8[var13]++] = var12++;
        }
        this.field186 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "()V")
    private final void method73() {
        this.field172 = null;
        this.field178 = null;
        this.field162 = null;
        this.field179 = false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()I")
    public final int method74() {
        if (!this.field179) {
            this.method61();
        }
        return this.field152;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()Z")
    public final boolean method75() {
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(SS)V")
    public final void method76(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field170; var3++) {
            if (this.field151[var3] == arg0) {
                this.field151[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lwg;IIIZ)V")
    public final void method77(class235 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class10 var6 = (class10) arg0;
        var6.method61();
        var6.method68();
        field185++;
        int var7 = 0;
        int[] var8 = var6.field166;
        int var9 = var6.field165;
        for (int var10 = 0; var10 < this.field165; var10++) {
            class27 var13 = this.field172[var10];
            if (var13.field580 != 0) {
                int var14 = this.field161[var10] - arg2;
                if (var14 >= var6.field152 && var14 <= var6.field155) {
                    int var15 = this.field166[var10] - arg1;
                    if (var15 >= var6.field154 && var15 <= var6.field190) {
                        int var16 = this.field180[var10] - arg3;
                        if (var16 >= var6.field189 && var16 <= var6.field167) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class27 var18 = var6.field172[var17];
                                if (var8[var17] == var15 && var6.field180[var17] == var16 && var6.field161[var17] == var14 && var18.field580 != 0) {
                                    if (this.field178 == null) {
                                        this.field178 = new class27[this.field165];
                                    }
                                    if (var6.field178 == null) {
                                        var6.field178 = new class27[var9];
                                    }
                                    class27 var19 = this.field178[var10];
                                    if (var19 == null) {
                                        var19 = this.field178[var10] = new class27(var13);
                                    }
                                    class27 var20 = var6.field178[var17];
                                    if (var20 == null) {
                                        var20 = var6.field178[var17] = new class27(var18);
                                    }
                                    var19.field576 += var18.field576;
                                    var19.field574 += var18.field574;
                                    var19.field568 += var18.field568;
                                    var19.field580 += var18.field580;
                                    var20.field576 += var13.field576;
                                    var20.field574 += var13.field574;
                                    var20.field568 += var13.field568;
                                    var20.field580 += var13.field580;
                                    var7++;
                                    field194[var10] = field185;
                                    field195[var17] = field185;
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
        for (int var11 = 0; var11 < this.field170; var11++) {
            if (field194[this.field156[var11]] == field185 && field194[this.field157[var11]] == field185 && field194[this.field173[var11]] == field185) {
                if (this.field193 == null) {
                    this.field193 = new byte[this.field170];
                }
                this.field193[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field170; var12++) {
            if (field195[var6.field156[var12]] == field185 && field195[var6.field157[var12]] == field185 && field195[var6.field173[var12]] == field185) {
                if (var6.field193 == null) {
                    var6.field193 = new byte[var6.field170];
                }
                var6.field193[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIIII)Lh;")
    public final class76 method78(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class76(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lai;I)I")
    private final int method79(class10 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field166[arg1];
        int var5 = arg0.field161[arg1];
        int var6 = arg0.field180[arg1];
        for (int var7 = 0; var7 < this.field165; var7++) {
            if (this.field166[var7] == var4 && this.field161[var7] == var5 && this.field180[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field166[this.field165] = var4;
            this.field161[this.field165] = var5;
            this.field180[this.field165] = var6;
            if (arg0.field149 != null) {
                this.field149[this.field165] = arg0.field149[arg1];
            }
            var3 = this.field165++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "([B)V")
    private final void method80(byte[] arg0) {
        class229 var2 = new class229(arg0);
        class229 var3 = new class229(arg0);
        class229 var4 = new class229(arg0);
        class229 var5 = new class229(arg0);
        class229 var6 = new class229(arg0);
        class229 var7 = new class229(arg0);
        class229 var8 = new class229(arg0);
        var2.field4101 = arg0.length - 23;
        int var9 = var2.method1490((byte) 73);
        int var10 = var2.method1490((byte) 73);
        int var11 = var2.method1475(255);
        int var12 = var2.method1475(255);
        int var13 = var2.method1475(255);
        int var14 = var2.method1475(255);
        int var15 = var2.method1475(255);
        int var16 = var2.method1475(255);
        int var17 = var2.method1475(255);
        int var18 = var2.method1490((byte) 73);
        int var19 = var2.method1490((byte) 73);
        int var20 = var2.method1490((byte) 73);
        int var21 = var2.method1490((byte) 73);
        int var22 = var2.method1490((byte) 73);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field196 = new byte[var11];
            var2.field4101 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field196[var26] = var2.method1457(-2);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field165 = var9;
        this.field170 = var10;
        this.field192 = var11;
        this.field166 = new int[var9];
        this.field161 = new int[var9];
        this.field180 = new int[var9];
        this.field156 = new int[var10];
        this.field157 = new int[var10];
        this.field173 = new int[var10];
        if (var17 == 1) {
            this.field149 = new int[var9];
        }
        if (var12 == 1) {
            this.field193 = new byte[var10];
        }
        if (var13 == 255) {
            this.field171 = new byte[var10];
        } else {
            this.field191 = (byte) var13;
        }
        if (var14 == 1) {
            this.field160 = new byte[var10];
        }
        if (var15 == 1) {
            this.field186 = new int[var10];
        }
        if (var16 == 1) {
            this.field158 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field175 = new byte[var10];
        }
        this.field151 = new short[var10];
        if (var11 > 0) {
            this.field183 = new short[var11];
            this.field176 = new short[var11];
            this.field177 = new short[var11];
            if (var24 > 0) {
                this.field150 = new short[var24];
                this.field159 = new short[var24];
                this.field188 = new short[var24];
                this.field182 = new byte[var24];
                this.field163 = new byte[var24];
                this.field197 = new byte[var24];
            }
            if (var25 > 0) {
                this.field187 = new byte[var25];
                this.field184 = new byte[var25];
            }
        }
        var2.field4101 = var11;
        var3.field4101 = var44;
        var4.field4101 = var46;
        var5.field4101 = var48;
        var6.field4101 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var81 = var2.method1475(255);
            int var82 = 0;
            if ((var81 & 0x1) != 0) {
                var82 = var3.method1470(42);
            }
            int var83 = 0;
            if ((var81 & 0x2) != 0) {
                var83 = var4.method1470(49);
            }
            int var84 = 0;
            if ((var81 & 0x4) != 0) {
                var84 = var5.method1470(100);
            }
            this.field166[var67] = var64 + var82;
            this.field161[var67] = var65 + var83;
            this.field180[var67] = var66 + var84;
            var64 = this.field166[var67];
            var65 = this.field161[var67];
            var66 = this.field180[var67];
            if (var17 == 1) {
                this.field149[var67] = var6.method1475(255);
            }
        }
        var2.field4101 = var42;
        var3.field4101 = var31;
        var4.field4101 = var34;
        var5.field4101 = var37;
        var6.field4101 = var35;
        var7.field4101 = var40;
        var8.field4101 = var39;
        for (int var68 = 0; var68 < var10; var68++) {
            this.field151[var68] = (short) var2.method1490((byte) 73);
            if (var12 == 1) {
                this.field193[var68] = var3.method1457(-2);
            }
            if (var13 == 255) {
                this.field171[var68] = var4.method1457(-2);
            }
            if (var14 == 1) {
                this.field160[var68] = var5.method1457(-2);
            }
            if (var15 == 1) {
                this.field186[var68] = var6.method1475(255);
            }
            if (var16 == 1) {
                this.field158[var68] = (short) (var7.method1490((byte) 73) - 1);
            }
            if (this.field175 != null) {
                if (this.field158[var68] == -1) {
                    this.field175[var68] = -1;
                } else {
                    this.field175[var68] = (byte) (var8.method1475(255) - 1);
                }
            }
        }
        var2.field4101 = var33;
        var3.field4101 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; var73++) {
            int var77 = var3.method1475(255);
            if (var77 == 1) {
                var69 = var2.method1470(52) + var72;
                var70 = var2.method1470(80) + var69;
                var71 = var2.method1470(60) + var70;
                var72 = var71;
                this.field156[var73] = var69;
                this.field157[var73] = var70;
                this.field173[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method1470(93) + var72;
                var72 = var71;
                this.field156[var73] = var69;
                this.field157[var73] = var70;
                this.field173[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method1470(88) + var72;
                var72 = var71;
                this.field156[var73] = var69;
                this.field157[var73] = var70;
                this.field173[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method1470(62) + var72;
                var72 = var71;
                this.field156[var73] = var69;
                this.field157[var73] = var80;
                this.field173[var73] = var71;
            }
        }
        var2.field4101 = var50;
        var3.field4101 = var52;
        var4.field4101 = var54;
        var5.field4101 = var56;
        var6.field4101 = var58;
        var7.field4101 = var60;
        for (int var74 = 0; var74 < var11; var74++) {
            int var76 = this.field196[var74] & 0xFF;
            if (var76 == 0) {
                this.field183[var74] = (short) var2.method1490((byte) 73);
                this.field176[var74] = (short) var2.method1490((byte) 73);
                this.field177[var74] = (short) var2.method1490((byte) 73);
            }
            if (var76 == 1) {
                this.field183[var74] = (short) var3.method1490((byte) 73);
                this.field176[var74] = (short) var3.method1490((byte) 73);
                this.field177[var74] = (short) var3.method1490((byte) 73);
                this.field150[var74] = (short) var4.method1490((byte) 73);
                this.field159[var74] = (short) var4.method1490((byte) 73);
                this.field188[var74] = (short) var4.method1490((byte) 73);
                this.field182[var74] = var5.method1457(-2);
                this.field163[var74] = var6.method1457(-2);
                this.field197[var74] = var7.method1457(-2);
            }
            if (var76 == 2) {
                this.field183[var74] = (short) var3.method1490((byte) 73);
                this.field176[var74] = (short) var3.method1490((byte) 73);
                this.field177[var74] = (short) var3.method1490((byte) 73);
                this.field150[var74] = (short) var4.method1490((byte) 73);
                this.field159[var74] = (short) var4.method1490((byte) 73);
                this.field188[var74] = (short) var4.method1490((byte) 73);
                this.field182[var74] = var5.method1457(-2);
                this.field163[var74] = var6.method1457(-2);
                this.field197[var74] = var7.method1457(-2);
                this.field187[var74] = var7.method1457(-2);
                this.field184[var74] = var7.method1457(-2);
            }
            if (var76 == 3) {
                this.field183[var74] = (short) var3.method1490((byte) 73);
                this.field176[var74] = (short) var3.method1490((byte) 73);
                this.field177[var74] = (short) var3.method1490((byte) 73);
                this.field150[var74] = (short) var4.method1490((byte) 73);
                this.field159[var74] = (short) var4.method1490((byte) 73);
                this.field188[var74] = (short) var4.method1490((byte) 73);
                this.field182[var74] = var5.method1457(-2);
                this.field163[var74] = var6.method1457(-2);
                this.field197[var74] = var7.method1457(-2);
            }
        }
        var2.field4101 = var62;
        int var75 = var2.method1475(255);
        if (var75 != 0) {
            var2.method1490((byte) 73);
            var2.method1490((byte) 73);
            var2.method1490((byte) 73);
            var2.method1437(425528536);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)Lwg;")
    public final class235 method81(int arg0, int arg1, int arg2) {
        return this.method58(this.field168, this.field153, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    private class10() {
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([B)V")
    private class10(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method80(arg0);
        } else {
            this.method62(arg0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([Lai;I)V")
    public class10(class10[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field165 = 0;
        this.field170 = 0;
        this.field192 = 0;
        this.field191 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class10 var15 = arg0[var9];
            if (var15 != null) {
                this.field165 += var15.field165;
                this.field170 += var15.field170;
                this.field192 += var15.field192;
                if (var15.field171 == null) {
                    if (this.field191 == -1) {
                        this.field191 = var15.field191;
                    }
                    if (this.field191 != var15.field191) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field193 != null;
                var5 |= var15.field160 != null;
                var6 |= var15.field186 != null;
                var7 |= var15.field158 != null;
                var8 |= var15.field175 != null;
            }
        }
        this.field166 = new int[this.field165];
        this.field161 = new int[this.field165];
        this.field180 = new int[this.field165];
        this.field149 = new int[this.field165];
        this.field156 = new int[this.field170];
        this.field157 = new int[this.field170];
        this.field173 = new int[this.field170];
        if (var3) {
            this.field193 = new byte[this.field170];
        }
        if (var4) {
            this.field171 = new byte[this.field170];
        }
        if (var5) {
            this.field160 = new byte[this.field170];
        }
        if (var6) {
            this.field186 = new int[this.field170];
        }
        if (var7) {
            this.field158 = new short[this.field170];
        }
        if (var8) {
            this.field175 = new byte[this.field170];
        }
        this.field151 = new short[this.field170];
        if (this.field192 > 0) {
            this.field196 = new byte[this.field192];
            this.field183 = new short[this.field192];
            this.field176 = new short[this.field192];
            this.field177 = new short[this.field192];
            this.field150 = new short[this.field192];
            this.field159 = new short[this.field192];
            this.field188 = new short[this.field192];
            this.field182 = new byte[this.field192];
            this.field163 = new byte[this.field192];
            this.field197 = new byte[this.field192];
            this.field187 = new byte[this.field192];
            this.field184 = new byte[this.field192];
        }
        this.field165 = 0;
        this.field170 = 0;
        this.field192 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class10 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field170; var12++) {
                    if (var3 && var11.field193 != null) {
                        this.field193[this.field170] = var11.field193[var12];
                    }
                    if (var4) {
                        if (var11.field171 == null) {
                            this.field171[this.field170] = var11.field191;
                        } else {
                            this.field171[this.field170] = var11.field171[var12];
                        }
                    }
                    if (var5 && var11.field160 != null) {
                        this.field160[this.field170] = var11.field160[var12];
                    }
                    if (var6 && var11.field186 != null) {
                        this.field186[this.field170] = var11.field186[var12];
                    }
                    if (var7) {
                        if (var11.field158 == null) {
                            this.field158[this.field170] = -1;
                        } else {
                            this.field158[this.field170] = var11.field158[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field175 == null || var11.field175[var12] == -1) {
                            this.field175[this.field170] = -1;
                        } else {
                            this.field175[this.field170] = (byte) (var11.field175[var12] + this.field192);
                        }
                    }
                    this.field151[this.field170] = var11.field151[var12];
                    this.field156[this.field170] = this.method79(var11, var11.field156[var12]);
                    this.field157[this.field170] = this.method79(var11, var11.field157[var12]);
                    this.field173[this.field170] = this.method79(var11, var11.field173[var12]);
                    this.field170++;
                }
                for (int var13 = 0; var13 < var11.field192; var13++) {
                    byte var14 = this.field196[this.field192] = var11.field196[var13];
                    if (var14 == 0) {
                        this.field183[this.field192] = (short) this.method79(var11, var11.field183[var13]);
                        this.field176[this.field192] = (short) this.method79(var11, var11.field176[var13]);
                        this.field177[this.field192] = (short) this.method79(var11, var11.field177[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field183[this.field192] = var11.field183[var13];
                        this.field176[this.field192] = var11.field176[var13];
                        this.field177[this.field192] = var11.field177[var13];
                        this.field150[this.field192] = var11.field150[var13];
                        this.field159[this.field192] = var11.field159[var13];
                        this.field188[this.field192] = var11.field188[var13];
                        this.field182[this.field192] = var11.field182[var13];
                        this.field163[this.field192] = var11.field163[var13];
                        this.field197[this.field192] = var11.field197[var13];
                    }
                    if (var14 == 2) {
                        this.field187[this.field192] = var11.field187[var13];
                        this.field184[this.field192] = var11.field184[var13];
                    }
                    this.field192++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lai;ZZZZ)V")
    public class10(class10 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field165 = arg0.field165;
        this.field170 = arg0.field170;
        this.field192 = arg0.field192;
        if (arg1) {
            this.field166 = arg0.field166;
            this.field161 = arg0.field161;
            this.field180 = arg0.field180;
        } else {
            this.field166 = new int[this.field165];
            this.field161 = new int[this.field165];
            this.field180 = new int[this.field165];
            for (int var6 = 0; var6 < this.field165; var6++) {
                this.field166[var6] = arg0.field166[var6];
                this.field161[var6] = arg0.field161[var6];
                this.field180[var6] = arg0.field180[var6];
            }
        }
        if (arg2) {
            this.field151 = arg0.field151;
        } else {
            this.field151 = new short[this.field170];
            for (int var7 = 0; var7 < this.field170; var7++) {
                this.field151[var7] = arg0.field151[var7];
            }
        }
        if (arg3 || arg0.field158 == null) {
            this.field158 = arg0.field158;
        } else {
            this.field158 = new short[this.field170];
            for (int var8 = 0; var8 < this.field170; var8++) {
                this.field158[var8] = arg0.field158[var8];
            }
        }
        if (arg4) {
            this.field160 = arg0.field160;
        } else {
            this.field160 = new byte[this.field170];
            if (arg0.field160 == null) {
                for (int var9 = 0; var9 < this.field170; var9++) {
                    this.field160[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field170; var10++) {
                    this.field160[var10] = arg0.field160[var10];
                }
            }
        }
        this.field156 = arg0.field156;
        this.field157 = arg0.field157;
        this.field173 = arg0.field173;
        this.field193 = arg0.field193;
        this.field171 = arg0.field171;
        this.field175 = arg0.field175;
        this.field191 = arg0.field191;
        this.field196 = arg0.field196;
        this.field183 = arg0.field183;
        this.field176 = arg0.field176;
        this.field177 = arg0.field177;
        this.field150 = arg0.field150;
        this.field159 = arg0.field159;
        this.field188 = arg0.field188;
        this.field182 = arg0.field182;
        this.field163 = arg0.field163;
        this.field197 = arg0.field197;
        this.field187 = arg0.field187;
        this.field184 = arg0.field184;
        this.field149 = arg0.field149;
        this.field186 = arg0.field186;
        this.field164 = arg0.field164;
        this.field174 = arg0.field174;
        this.field172 = arg0.field172;
        this.field162 = arg0.field162;
        this.field178 = arg0.field178;
        this.field168 = arg0.field168;
        this.field153 = arg0.field153;
    }
}
