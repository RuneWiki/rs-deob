import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class224 extends class186 {

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public int field4140 = 0;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public int field4151 = 0;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "B")
    public byte field4139 = 0;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "Z")
    private boolean field4159 = false;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public int field4158;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "[I")
    public int[] field4131;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "[I")
    public int[] field4132;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "[I")
    public int[] field4142;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "[I")
    private int[] field4137;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "[I")
    public int[] field4135;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "[I")
    public int[] field4141;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[I")
    public int[] field4122;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "[B")
    public byte[] field4127;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "[B")
    public byte[] field4138;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "[B")
    public byte[] field4146;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "[I")
    private int[] field4169;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "[S")
    public short[] field4133;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "[B")
    public byte[] field4165;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[S")
    public short[] field4124;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "[B")
    public byte[] field4152;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "[S")
    public short[] field4157;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "[S")
    public short[] field4134;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "[S")
    public short[] field4160;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "[S")
    private short[] field4150;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "[S")
    private short[] field4145;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "[S")
    private short[] field4168;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[B")
    private byte[] field4126;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "[B")
    private byte[] field4144;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "[B")
    private byte[] field4153;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "[B")
    private byte[] field4155;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "[B")
    private byte[] field4163;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "[[I")
    public int[][] field4166;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "[[I")
    public int[][] field4164;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "[Lni;")
    public class150[] field4167;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "[Lk;")
    public class108[] field4147;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "[Lni;")
    public class150[] field4154;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "S")
    public short field4149;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "S")
    public short field4123;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "[I")
    private static int[] field4125 = class27.field600;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    private static int field4136 = 0;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "[I")
    private static int[] field4130 = class27.field612;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "[I")
    private static int[] field4143 = new int[10000];

    @OriginalMember(owner = "client!v", name = "X", descriptor = "[I")
    private static int[] field4156 = new int[10000];

    @OriginalMember(owner = "client!v", name = "u", descriptor = "S")
    private short field4128;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "S")
    private short field4129;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "S")
    private short field4148;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "S")
    private short field4161;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "S")
    private short field4162;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "S")
    private short field4170;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([[IIIIZIZ)Lv;")
    public final class224 method1450(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        this.method1462();
        int var8 = this.field4129 + arg1;
        int var9 = this.field4161 + arg1;
        int var10 = this.field4162 + arg3;
        int var11 = this.field4148 + arg3;
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
        class224 var16;
        if (arg4) {
            var16 = new class224();
            var16.field4151 = this.field4151;
            var16.field4140 = this.field4140;
            var16.field4158 = this.field4158;
            var16.field4131 = this.field4131;
            var16.field4142 = this.field4142;
            var16.field4135 = this.field4135;
            var16.field4141 = this.field4141;
            var16.field4122 = this.field4122;
            var16.field4127 = this.field4127;
            var16.field4138 = this.field4138;
            var16.field4146 = this.field4146;
            var16.field4165 = this.field4165;
            var16.field4124 = this.field4124;
            var16.field4133 = this.field4133;
            var16.field4139 = this.field4139;
            var16.field4152 = this.field4152;
            var16.field4157 = this.field4157;
            var16.field4134 = this.field4134;
            var16.field4160 = this.field4160;
            var16.field4150 = this.field4150;
            var16.field4145 = this.field4145;
            var16.field4168 = this.field4168;
            var16.field4126 = this.field4126;
            var16.field4144 = this.field4144;
            var16.field4153 = this.field4153;
            var16.field4155 = this.field4155;
            var16.field4163 = this.field4163;
            var16.field4137 = this.field4137;
            var16.field4169 = this.field4169;
            var16.field4166 = this.field4166;
            var16.field4164 = this.field4164;
            var16.field4149 = this.field4149;
            var16.field4123 = this.field4123;
            var16.field4167 = this.field4167;
            var16.field4147 = this.field4147;
            var16.field4154 = this.field4154;
            var16.field4132 = new int[var16.field4151];
        } else {
            var16 = this;
        }
        if (arg5 == 0) {
            for (int var17 = 0; var17 < var16.field4151; var17++) {
                int var18 = this.field4131[var17] + arg1;
                int var19 = this.field4142[var17] + arg3;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg0[var22][var23] + arg0[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg0[var22][var23 + 1] + arg0[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                var16.field4132[var17] = this.field4132[var17] + var26 - arg2;
            }
        } else {
            for (int var27 = 0; var27 < var16.field4151; var27++) {
                int var28 = (this.field4132[var27] << 16) / this.field4170;
                if (var28 < arg5) {
                    int var29 = this.field4131[var27] + arg1;
                    int var30 = this.field4142[var27] + arg3;
                    int var31 = var29 & 0x7F;
                    int var32 = var30 & 0x7F;
                    int var33 = var29 >> 7;
                    int var34 = var30 >> 7;
                    int var35 = (128 - var31) * arg0[var33][var34] + arg0[var33 + 1][var34] * var31 >> 7;
                    int var36 = (128 - var31) * arg0[var33][var34 + 1] + arg0[var33 + 1][var34 + 1] * var31 >> 7;
                    int var37 = (128 - var32) * var35 + var32 * var36 >> 7;
                    var16.field4132[var27] = (var37 - arg2) * (arg5 - var28) / arg5 + this.field4132[var27];
                } else {
                    var16.field4132[var27] = this.field4132[var27];
                }
            }
        }
        if (arg6) {
            var16.method1455();
        } else {
            this.field4159 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
    public final void method1451(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4151; var4++) {
            this.field4131[var4] += arg0;
            this.field4132[var4] += arg1;
            this.field4142[var4] += arg2;
        }
        this.method1455();
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()V")
    public final void method1452() {
        for (int var1 = 0; var1 < this.field4151; var1++) {
            int var2 = this.field4142[var1];
            this.field4142[var1] = this.field4131[var1];
            this.field4131[var1] = -var2;
        }
        this.method1455();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)Lsi;")
    public final class203 method1453(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class203(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()Lv;")
    public final class224 method1454() {
        class224 var1 = new class224();
        if (this.field4127 != null) {
            var1.field4127 = new byte[this.field4140];
            for (int var2 = 0; var2 < this.field4140; var2++) {
                var1.field4127[var2] = this.field4127[var2];
            }
        }
        var1.field4151 = this.field4151;
        var1.field4140 = this.field4140;
        var1.field4158 = this.field4158;
        var1.field4131 = this.field4131;
        var1.field4132 = this.field4132;
        var1.field4142 = this.field4142;
        var1.field4135 = this.field4135;
        var1.field4141 = this.field4141;
        var1.field4122 = this.field4122;
        var1.field4138 = this.field4138;
        var1.field4146 = this.field4146;
        var1.field4165 = this.field4165;
        var1.field4124 = this.field4124;
        var1.field4133 = this.field4133;
        var1.field4139 = this.field4139;
        var1.field4152 = this.field4152;
        var1.field4157 = this.field4157;
        var1.field4134 = this.field4134;
        var1.field4160 = this.field4160;
        var1.field4150 = this.field4150;
        var1.field4145 = this.field4145;
        var1.field4168 = this.field4168;
        var1.field4126 = this.field4126;
        var1.field4144 = this.field4144;
        var1.field4153 = this.field4153;
        var1.field4155 = this.field4155;
        var1.field4163 = this.field4163;
        var1.field4137 = this.field4137;
        var1.field4169 = this.field4169;
        var1.field4166 = this.field4166;
        var1.field4164 = this.field4164;
        var1.field4167 = this.field4167;
        var1.field4147 = this.field4147;
        var1.field4149 = this.field4149;
        var1.field4123 = this.field4123;
        return var1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()V")
    private final void method1455() {
        this.field4167 = null;
        this.field4154 = null;
        this.field4147 = null;
        this.field4159 = false;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()Z")
    public final boolean method1261() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(SS)V")
    public final void method1456(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4140; var3++) {
            if (this.field4124[var3] == arg0) {
                this.field4124[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([B)V")
    private final void method1457(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var4.field3432 = arg0.length - 18;
        int var9 = var4.method1252(2);
        int var10 = var4.method1252(2);
        int var11 = var4.method1243(3);
        int var12 = var4.method1243(3);
        int var13 = var4.method1243(3);
        int var14 = var4.method1243(3);
        int var15 = var4.method1243(3);
        int var16 = var4.method1243(3);
        int var17 = var4.method1252(2);
        int var18 = var4.method1252(2);
        int var19 = var4.method1252(2);
        int var20 = var4.method1252(2);
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
        this.field4151 = var9;
        this.field4140 = var10;
        this.field4158 = var11;
        this.field4131 = new int[var9];
        this.field4132 = new int[var9];
        this.field4142 = new int[var9];
        this.field4135 = new int[var10];
        this.field4141 = new int[var10];
        this.field4122 = new int[var10];
        if (var11 > 0) {
            this.field4152 = new byte[var11];
            this.field4157 = new short[var11];
            this.field4134 = new short[var11];
            this.field4160 = new short[var11];
        }
        if (var16 == 1) {
            this.field4137 = new int[var9];
        }
        if (var12 == 1) {
            this.field4127 = new byte[var10];
            this.field4165 = new byte[var10];
            this.field4133 = new short[var10];
        }
        if (var13 == 255) {
            this.field4138 = new byte[var10];
        } else {
            this.field4139 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4146 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4169 = new int[var10];
        }
        this.field4124 = new short[var10];
        var4.field3432 = var21;
        var5.field3432 = var36;
        var6.field3432 = var38;
        var7.field3432 = var40;
        var8.field3432 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1243(3);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1224(true);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1224(true);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1224(true);
            }
            this.field4131[var46] = var43 + var63;
            this.field4132[var46] = var44 + var64;
            this.field4142[var46] = var45 + var65;
            var43 = this.field4131[var46];
            var44 = this.field4132[var46];
            var45 = this.field4142[var46];
            if (var16 == 1) {
                this.field4137[var46] = var8.method1243(3);
            }
        }
        var4.field3432 = var32;
        var5.field3432 = var28;
        var6.field3432 = var26;
        var7.field3432 = var30;
        var8.field3432 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field4124[var47] = (short) var4.method1252(2);
            if (var12 == 1) {
                int var61 = var5.method1243(3);
                if ((var61 & 0x1) == 1) {
                    this.field4127[var47] = 1;
                    var2 = true;
                } else {
                    this.field4127[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field4165[var47] = (byte) (var61 >> 2);
                    this.field4133[var47] = this.field4124[var47];
                    this.field4124[var47] = 127;
                    if (this.field4133[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field4165[var47] = -1;
                    this.field4133[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field4138[var47] = var6.method1204(false);
            }
            if (var14 == 1) {
                this.field4146[var47] = var7.method1204(false);
            }
            if (var15 == 1) {
                this.field4169[var47] = var8.method1243(3);
            }
        }
        var4.field3432 = var25;
        var5.field3432 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1243(3);
            if (var57 == 1) {
                var48 = var4.method1224(true) + var51;
                var49 = var4.method1224(true) + var48;
                var50 = var4.method1224(true) + var49;
                var51 = var50;
                this.field4135[var52] = var48;
                this.field4141[var52] = var49;
                this.field4122[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1224(true) + var51;
                var51 = var50;
                this.field4135[var52] = var48;
                this.field4141[var52] = var49;
                this.field4122[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1224(true) + var51;
                var51 = var50;
                this.field4135[var52] = var48;
                this.field4141[var52] = var49;
                this.field4122[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1224(true) + var51;
                var51 = var50;
                this.field4135[var52] = var48;
                this.field4141[var52] = var60;
                this.field4122[var52] = var50;
            }
        }
        var4.field3432 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field4152[var53] = 0;
            this.field4157[var53] = (short) var4.method1252(2);
            this.field4134[var53] = (short) var4.method1252(2);
            this.field4160[var53] = (short) var4.method1252(2);
        }
        if (this.field4165 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field4165[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field4157[var56] & 0xFFFF) == this.field4135[var55] && (this.field4134[var56] & 0xFFFF) == this.field4141[var55] && (this.field4160[var56] & 0xFFFF) == this.field4122[var55]) {
                        this.field4165[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field4165 = null;
            }
        }
        if (!var3) {
            this.field4133 = null;
        }
        if (!var2) {
            this.field4127 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Leh;II)Lv;")
    public static final class224 method1458(class52 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method342(arg2, arg1, (byte) -42);
        return var3 == null ? null : new class224(var3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lrb;IIIZ)V")
    public final void method1259(class186 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class224 var6 = (class224) arg0;
        var6.method1462();
        var6.method1466();
        field4136++;
        int var7 = 0;
        int[] var8 = var6.field4131;
        int var9 = var6.field4151;
        for (int var10 = 0; var10 < this.field4151; var10++) {
            class150 var13 = this.field4167[var10];
            if (var13.field2704 != 0) {
                int var14 = this.field4132[var10] - arg2;
                if (var14 >= var6.field4170 && var14 <= var6.field4128) {
                    int var15 = this.field4131[var10] - arg1;
                    if (var15 >= var6.field4129 && var15 <= var6.field4161) {
                        int var16 = this.field4142[var10] - arg3;
                        if (var16 >= var6.field4162 && var16 <= var6.field4148) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class150 var18 = var6.field4167[var17];
                                if (var8[var17] == var15 && var6.field4142[var17] == var16 && var6.field4132[var17] == var14 && var18.field2704 != 0) {
                                    if (this.field4154 == null) {
                                        this.field4154 = new class150[this.field4151];
                                    }
                                    if (var6.field4154 == null) {
                                        var6.field4154 = new class150[var9];
                                    }
                                    class150 var19 = this.field4154[var10];
                                    if (var19 == null) {
                                        var19 = this.field4154[var10] = new class150(var13);
                                    }
                                    class150 var20 = var6.field4154[var17];
                                    if (var20 == null) {
                                        var20 = var6.field4154[var17] = new class150(var18);
                                    }
                                    var19.field2694 += var18.field2694;
                                    var19.field2702 += var18.field2702;
                                    var19.field2710 += var18.field2710;
                                    var19.field2704 += var18.field2704;
                                    var20.field2694 += var13.field2694;
                                    var20.field2702 += var13.field2702;
                                    var20.field2710 += var13.field2710;
                                    var20.field2704 += var13.field2704;
                                    var7++;
                                    field4156[var10] = field4136;
                                    field4143[var17] = field4136;
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
        for (int var11 = 0; var11 < this.field4140; var11++) {
            if (field4156[this.field4135[var11]] == field4136 && field4156[this.field4141[var11]] == field4136 && field4156[this.field4122[var11]] == field4136) {
                if (this.field4127 == null) {
                    this.field4127 = new byte[this.field4140];
                }
                this.field4127[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field4140; var12++) {
            if (field4143[var6.field4135[var12]] == field4136 && field4143[var6.field4141[var12]] == field4136 && field4143[var6.field4122[var12]] == field4136) {
                if (var6.field4127 == null) {
                    var6.field4127 = new byte[var6.field4140];
                }
                var6.field4127[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(III)V")
    public final void method1459(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4151; var4++) {
            this.field4131[var4] = this.field4131[var4] * arg0 / 128;
            this.field4132[var4] = this.field4132[var4] * arg1 / 128;
            this.field4142[var4] = this.field4142[var4] * arg2 / 128;
        }
        this.method1455();
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()V")
    public final void method1460() {
        for (int var1 = 0; var1 < this.field4151; var1++) {
            this.field4142[var1] = -this.field4142[var1];
        }
        for (int var2 = 0; var2 < this.field4140; var2++) {
            int var3 = this.field4135[var2];
            this.field4135[var2] = this.field4122[var2];
            this.field4122[var2] = var3;
        }
        this.method1455();
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(IIIII)Lgj;")
    public final class75 method1461(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class203(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Lrb;")
    public final class186 method1260(int arg0, int arg1, int arg2) {
        return this.method1461(this.field4149, this.field4123, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "()V")
    private final void method1462() {
        if (this.field4159) {
            return;
        }
        this.field4159 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field4151; var7++) {
            int var8 = this.field4131[var7];
            int var9 = this.field4132[var7];
            int var10 = this.field4142[var7];
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
        this.field4129 = (short) var1;
        this.field4161 = (short) var4;
        this.field4170 = (short) var2;
        this.field4128 = (short) var5;
        this.field4162 = (short) var3;
        this.field4148 = (short) var6;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "([B)V")
    private final void method1463(byte[] arg0) {
        class185 var2 = new class185(arg0);
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var2.field3432 = arg0.length - 23;
        int var9 = var2.method1252(2);
        int var10 = var2.method1252(2);
        int var11 = var2.method1243(3);
        int var12 = var2.method1243(3);
        int var13 = var2.method1243(3);
        int var14 = var2.method1243(3);
        int var15 = var2.method1243(3);
        int var16 = var2.method1243(3);
        int var17 = var2.method1243(3);
        int var18 = var2.method1252(2);
        int var19 = var2.method1252(2);
        int var20 = var2.method1252(2);
        int var21 = var2.method1252(2);
        int var22 = var2.method1252(2);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field4152 = new byte[var11];
            var2.field3432 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field4152[var26] = var2.method1204(false);
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
        this.field4151 = var9;
        this.field4140 = var10;
        this.field4158 = var11;
        this.field4131 = new int[var9];
        this.field4132 = new int[var9];
        this.field4142 = new int[var9];
        this.field4135 = new int[var10];
        this.field4141 = new int[var10];
        this.field4122 = new int[var10];
        if (var17 == 1) {
            this.field4137 = new int[var9];
        }
        if (var12 == 1) {
            this.field4127 = new byte[var10];
        }
        if (var13 == 255) {
            this.field4138 = new byte[var10];
        } else {
            this.field4139 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4146 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4169 = new int[var10];
        }
        if (var16 == 1) {
            this.field4133 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field4165 = new byte[var10];
        }
        this.field4124 = new short[var10];
        if (var11 > 0) {
            this.field4157 = new short[var11];
            this.field4134 = new short[var11];
            this.field4160 = new short[var11];
            if (var24 > 0) {
                this.field4150 = new short[var24];
                this.field4145 = new short[var24];
                this.field4168 = new short[var24];
                this.field4126 = new byte[var24];
                this.field4144 = new byte[var24];
                this.field4153 = new byte[var24];
            }
            if (var25 > 0) {
                this.field4155 = new byte[var25];
                this.field4163 = new byte[var25];
            }
        }
        var2.field3432 = var11;
        var3.field3432 = var44;
        var4.field3432 = var46;
        var5.field3432 = var48;
        var6.field3432 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method1243(3);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method1224(true);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method1224(true);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method1224(true);
            }
            this.field4131[var66] = var63 + var80;
            this.field4132[var66] = var64 + var81;
            this.field4142[var66] = var65 + var82;
            var63 = this.field4131[var66];
            var64 = this.field4132[var66];
            var65 = this.field4142[var66];
            if (var17 == 1) {
                this.field4137[var66] = var6.method1243(3);
            }
        }
        var2.field3432 = var42;
        var3.field3432 = var31;
        var4.field3432 = var34;
        var5.field3432 = var37;
        var6.field3432 = var35;
        var7.field3432 = var40;
        var8.field3432 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field4124[var67] = (short) var2.method1252(2);
            if (var12 == 1) {
                this.field4127[var67] = var3.method1204(false);
            }
            if (var13 == 255) {
                this.field4138[var67] = var4.method1204(false);
            }
            if (var14 == 1) {
                this.field4146[var67] = var5.method1204(false);
            }
            if (var15 == 1) {
                this.field4169[var67] = var6.method1243(3);
            }
            if (var16 == 1) {
                this.field4133[var67] = (short) (var7.method1252(2) - 1);
            }
            if (this.field4165 != null) {
                if (this.field4133[var67] == -1) {
                    this.field4165[var67] = -1;
                } else {
                    this.field4165[var67] = (byte) (var8.method1243(3) - 1);
                }
            }
        }
        var2.field3432 = var33;
        var3.field3432 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method1243(3);
            if (var75 == 1) {
                var68 = var2.method1224(true) + var71;
                var69 = var2.method1224(true) + var68;
                var70 = var2.method1224(true) + var69;
                var71 = var70;
                this.field4135[var72] = var68;
                this.field4141[var72] = var69;
                this.field4122[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method1224(true) + var71;
                var71 = var70;
                this.field4135[var72] = var68;
                this.field4141[var72] = var69;
                this.field4122[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method1224(true) + var71;
                var71 = var70;
                this.field4135[var72] = var68;
                this.field4141[var72] = var69;
                this.field4122[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method1224(true) + var71;
                var71 = var70;
                this.field4135[var72] = var68;
                this.field4141[var72] = var78;
                this.field4122[var72] = var70;
            }
        }
        var2.field3432 = var50;
        var3.field3432 = var52;
        var4.field3432 = var54;
        var5.field3432 = var56;
        var6.field3432 = var58;
        var7.field3432 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field4152[var73] & 0xFF;
            if (var74 == 0) {
                this.field4157[var73] = (short) var2.method1252(2);
                this.field4134[var73] = (short) var2.method1252(2);
                this.field4160[var73] = (short) var2.method1252(2);
            }
            if (var74 == 1) {
                this.field4157[var73] = (short) var3.method1252(2);
                this.field4134[var73] = (short) var3.method1252(2);
                this.field4160[var73] = (short) var3.method1252(2);
                this.field4150[var73] = (short) var4.method1252(2);
                this.field4145[var73] = (short) var4.method1252(2);
                this.field4168[var73] = (short) var4.method1252(2);
                this.field4126[var73] = var5.method1204(false);
                this.field4144[var73] = var6.method1204(false);
                this.field4153[var73] = var7.method1204(false);
            }
            if (var74 == 2) {
                this.field4157[var73] = (short) var3.method1252(2);
                this.field4134[var73] = (short) var3.method1252(2);
                this.field4160[var73] = (short) var3.method1252(2);
                this.field4150[var73] = (short) var4.method1252(2);
                this.field4145[var73] = (short) var4.method1252(2);
                this.field4168[var73] = (short) var4.method1252(2);
                this.field4126[var73] = var5.method1204(false);
                this.field4144[var73] = var6.method1204(false);
                this.field4153[var73] = var7.method1204(false);
                this.field4155[var73] = var7.method1204(false);
                this.field4163[var73] = var7.method1204(false);
            }
            if (var74 == 3) {
                this.field4157[var73] = (short) var3.method1252(2);
                this.field4134[var73] = (short) var3.method1252(2);
                this.field4160[var73] = (short) var3.method1252(2);
                this.field4150[var73] = (short) var4.method1252(2);
                this.field4145[var73] = (short) var4.method1252(2);
                this.field4168[var73] = (short) var4.method1252(2);
                this.field4126[var73] = var5.method1204(false);
                this.field4144[var73] = var6.method1204(false);
                this.field4153[var73] = var7.method1204(false);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "()V")
    public final void method1464() {
        this.field4137 = null;
        this.field4169 = null;
        this.field4166 = null;
        this.field4164 = null;
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "()V")
    public static void method1465() {
        field4156 = null;
        field4143 = null;
        field4130 = null;
        field4125 = null;
    }

    @OriginalMember(owner = "client!v", name = "j", descriptor = "()V")
    public final void method1466() {
        if (this.field4167 != null) {
            return;
        }
        this.field4167 = new class150[this.field4151];
        for (int var1 = 0; var1 < this.field4151; var1++) {
            this.field4167[var1] = new class150();
        }
        for (int var2 = 0; var2 < this.field4140; var2++) {
            int var3 = this.field4135[var2];
            int var4 = this.field4141[var2];
            int var5 = this.field4122[var2];
            int var6 = this.field4131[var4] - this.field4131[var3];
            int var7 = this.field4132[var4] - this.field4132[var3];
            int var8 = this.field4142[var4] - this.field4142[var3];
            int var9 = this.field4131[var5] - this.field4131[var3];
            int var10 = this.field4132[var5] - this.field4132[var3];
            int var11 = this.field4142[var5] - this.field4142[var3];
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
            if (this.field4127 == null) {
                var19 = 0;
            } else {
                var19 = this.field4127[var2];
            }
            if (var19 == 0) {
                class150 var20 = this.field4167[var3];
                var20.field2694 += var16;
                var20.field2702 += var17;
                var20.field2710 += var18;
                var20.field2704++;
                class150 var21 = this.field4167[var4];
                var21.field2694 += var16;
                var21.field2702 += var17;
                var21.field2710 += var18;
                var21.field2704++;
                class150 var22 = this.field4167[var5];
                var22.field2694 += var16;
                var22.field2702 += var17;
                var22.field2710 += var18;
                var22.field2704++;
            } else if (var19 == 1) {
                if (this.field4147 == null) {
                    this.field4147 = new class108[this.field4140];
                }
                class108 var23 = this.field4147[var2] = new class108();
                var23.field2015 = var16;
                var23.field2009 = var17;
                var23.field2014 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "k", descriptor = "()V")
    public final void method1467() {
        for (int var1 = 0; var1 < this.field4151; var1++) {
            int var2 = this.field4131[var1];
            this.field4131[var1] = this.field4142[var1];
            this.field4142[var1] = -var2;
        }
        this.method1455();
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(SS)V")
    public final void method1468(short arg0, short arg1) {
        if (this.field4133 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field4140; var3++) {
            if (this.field4133[var3] == arg0) {
                this.field4133[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()V")
    public final void method1469() {
        for (int var1 = 0; var1 < this.field4151; var1++) {
            this.field4131[var1] = -this.field4131[var1];
            this.field4142[var1] = -this.field4142[var1];
        }
        this.method1455();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()I")
    public final int method295() {
        if (!this.field4159) {
            this.method1462();
        }
        return this.field4170;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lv;I)I")
    private final int method1470(class224 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field4131[arg1];
        int var5 = arg0.field4132[arg1];
        int var6 = arg0.field4142[arg1];
        for (int var7 = 0; var7 < this.field4151; var7++) {
            if (this.field4131[var7] == var4 && this.field4132[var7] == var5 && this.field4142[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field4131[this.field4151] = var4;
            this.field4132[this.field4151] = var5;
            this.field4142[this.field4151] = var6;
            if (arg0.field4137 != null) {
                this.field4137[this.field4151] = arg0.field4137[arg1];
            }
            var3 = this.field4151++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "m", descriptor = "()V")
    public final void method1471() {
        int var10002;
        if (this.field4137 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field4151; var3++) {
                int var7 = this.field4137[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field4166 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field4166[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field4151) {
                int var6 = this.field4137[var5];
                this.field4166[var6][var1[var6]++] = var5++;
            }
            this.field4137 = null;
        }
        if (this.field4169 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4140; var10++) {
            int var14 = this.field4169[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field4164 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field4164[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field4140) {
            int var13 = this.field4169[var12];
            this.field4164[var13][var8[var13]++] = var12++;
        }
        this.field4169 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public final void method1472(int arg0) {
        int var2 = field4130[arg0];
        int var3 = field4125[arg0];
        for (int var4 = 0; var4 < this.field4151; var4++) {
            int var5 = this.field4142[var4] * var2 + this.field4131[var4] * var3 >> 16;
            this.field4142[var4] = this.field4142[var4] * var3 - this.field4131[var4] * var2 >> 16;
            this.field4131[var4] = var5;
        }
        this.method1455();
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    private class224() {
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "([B)V")
    private class224(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1463(arg0);
        } else {
            this.method1457(arg0);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "([Lv;I)V")
    public class224(class224[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field4151 = 0;
        this.field4140 = 0;
        this.field4158 = 0;
        this.field4139 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class224 var15 = arg0[var9];
            if (var15 != null) {
                this.field4151 += var15.field4151;
                this.field4140 += var15.field4140;
                this.field4158 += var15.field4158;
                if (var15.field4138 == null) {
                    if (this.field4139 == -1) {
                        this.field4139 = var15.field4139;
                    }
                    if (this.field4139 != var15.field4139) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field4127 != null;
                var5 |= var15.field4146 != null;
                var6 |= var15.field4169 != null;
                var7 |= var15.field4133 != null;
                var8 |= var15.field4165 != null;
            }
        }
        this.field4131 = new int[this.field4151];
        this.field4132 = new int[this.field4151];
        this.field4142 = new int[this.field4151];
        this.field4137 = new int[this.field4151];
        this.field4135 = new int[this.field4140];
        this.field4141 = new int[this.field4140];
        this.field4122 = new int[this.field4140];
        if (var3) {
            this.field4127 = new byte[this.field4140];
        }
        if (var4) {
            this.field4138 = new byte[this.field4140];
        }
        if (var5) {
            this.field4146 = new byte[this.field4140];
        }
        if (var6) {
            this.field4169 = new int[this.field4140];
        }
        if (var7) {
            this.field4133 = new short[this.field4140];
        }
        if (var8) {
            this.field4165 = new byte[this.field4140];
        }
        this.field4124 = new short[this.field4140];
        if (this.field4158 > 0) {
            this.field4152 = new byte[this.field4158];
            this.field4157 = new short[this.field4158];
            this.field4134 = new short[this.field4158];
            this.field4160 = new short[this.field4158];
            this.field4150 = new short[this.field4158];
            this.field4145 = new short[this.field4158];
            this.field4168 = new short[this.field4158];
            this.field4126 = new byte[this.field4158];
            this.field4144 = new byte[this.field4158];
            this.field4153 = new byte[this.field4158];
            this.field4155 = new byte[this.field4158];
            this.field4163 = new byte[this.field4158];
        }
        this.field4151 = 0;
        this.field4140 = 0;
        this.field4158 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class224 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field4140; var12++) {
                    if (var3 && var11.field4127 != null) {
                        this.field4127[this.field4140] = var11.field4127[var12];
                    }
                    if (var4) {
                        if (var11.field4138 == null) {
                            this.field4138[this.field4140] = var11.field4139;
                        } else {
                            this.field4138[this.field4140] = var11.field4138[var12];
                        }
                    }
                    if (var5 && var11.field4146 != null) {
                        this.field4146[this.field4140] = var11.field4146[var12];
                    }
                    if (var6 && var11.field4169 != null) {
                        this.field4169[this.field4140] = var11.field4169[var12];
                    }
                    if (var7) {
                        if (var11.field4133 == null) {
                            this.field4133[this.field4140] = -1;
                        } else {
                            this.field4133[this.field4140] = var11.field4133[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field4165 == null || var11.field4165[var12] == -1) {
                            this.field4165[this.field4140] = -1;
                        } else {
                            this.field4165[this.field4140] = (byte) (var11.field4165[var12] + this.field4158);
                        }
                    }
                    this.field4124[this.field4140] = var11.field4124[var12];
                    this.field4135[this.field4140] = this.method1470(var11, var11.field4135[var12]);
                    this.field4141[this.field4140] = this.method1470(var11, var11.field4141[var12]);
                    this.field4122[this.field4140] = this.method1470(var11, var11.field4122[var12]);
                    this.field4140++;
                }
                for (int var13 = 0; var13 < var11.field4158; var13++) {
                    byte var14 = this.field4152[this.field4158] = var11.field4152[var13];
                    if (var14 == 0) {
                        this.field4157[this.field4158] = (short) this.method1470(var11, var11.field4157[var13]);
                        this.field4134[this.field4158] = (short) this.method1470(var11, var11.field4134[var13]);
                        this.field4160[this.field4158] = (short) this.method1470(var11, var11.field4160[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field4157[this.field4158] = var11.field4157[var13];
                        this.field4134[this.field4158] = var11.field4134[var13];
                        this.field4160[this.field4158] = var11.field4160[var13];
                        this.field4150[this.field4158] = var11.field4150[var13];
                        this.field4145[this.field4158] = var11.field4145[var13];
                        this.field4168[this.field4158] = var11.field4168[var13];
                        this.field4126[this.field4158] = var11.field4126[var13];
                        this.field4144[this.field4158] = var11.field4144[var13];
                        this.field4153[this.field4158] = var11.field4153[var13];
                    }
                    if (var14 == 2) {
                        this.field4155[this.field4158] = var11.field4155[var13];
                        this.field4163[this.field4158] = var11.field4163[var13];
                    }
                    this.field4158++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lv;ZZZZ)V")
    public class224(class224 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field4151 = arg0.field4151;
        this.field4140 = arg0.field4140;
        this.field4158 = arg0.field4158;
        if (arg1) {
            this.field4131 = arg0.field4131;
            this.field4132 = arg0.field4132;
            this.field4142 = arg0.field4142;
        } else {
            this.field4131 = new int[this.field4151];
            this.field4132 = new int[this.field4151];
            this.field4142 = new int[this.field4151];
            for (int var6 = 0; var6 < this.field4151; var6++) {
                this.field4131[var6] = arg0.field4131[var6];
                this.field4132[var6] = arg0.field4132[var6];
                this.field4142[var6] = arg0.field4142[var6];
            }
        }
        if (arg2) {
            this.field4124 = arg0.field4124;
        } else {
            this.field4124 = new short[this.field4140];
            for (int var7 = 0; var7 < this.field4140; var7++) {
                this.field4124[var7] = arg0.field4124[var7];
            }
        }
        if (arg3 || arg0.field4133 == null) {
            this.field4133 = arg0.field4133;
        } else {
            this.field4133 = new short[this.field4140];
            for (int var8 = 0; var8 < this.field4140; var8++) {
                this.field4133[var8] = arg0.field4133[var8];
            }
        }
        if (arg4) {
            this.field4146 = arg0.field4146;
        } else {
            this.field4146 = new byte[this.field4140];
            if (arg0.field4146 == null) {
                for (int var9 = 0; var9 < this.field4140; var9++) {
                    this.field4146[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field4140; var10++) {
                    this.field4146[var10] = arg0.field4146[var10];
                }
            }
        }
        this.field4135 = arg0.field4135;
        this.field4141 = arg0.field4141;
        this.field4122 = arg0.field4122;
        this.field4127 = arg0.field4127;
        this.field4138 = arg0.field4138;
        this.field4165 = arg0.field4165;
        this.field4139 = arg0.field4139;
        this.field4152 = arg0.field4152;
        this.field4157 = arg0.field4157;
        this.field4134 = arg0.field4134;
        this.field4160 = arg0.field4160;
        this.field4150 = arg0.field4150;
        this.field4145 = arg0.field4145;
        this.field4168 = arg0.field4168;
        this.field4126 = arg0.field4126;
        this.field4144 = arg0.field4144;
        this.field4153 = arg0.field4153;
        this.field4155 = arg0.field4155;
        this.field4163 = arg0.field4163;
        this.field4137 = arg0.field4137;
        this.field4169 = arg0.field4169;
        this.field4166 = arg0.field4166;
        this.field4164 = arg0.field4164;
        this.field4167 = arg0.field4167;
        this.field4147 = arg0.field4147;
        this.field4154 = arg0.field4154;
        this.field4149 = arg0.field4149;
        this.field4123 = arg0.field4123;
    }
}
