import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class242 extends class176 {

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public int field4021 = 0;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Z")
    private boolean field4019 = false;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    public int field4048 = 0;

    @OriginalMember(owner = "client!he", name = "ib", descriptor = "B")
    public byte field4054 = 0;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[I")
    public int[] field4009;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "[I")
    public int[] field4008;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "[I")
    public int[] field4041;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "[I")
    public int[] field4018;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "[I")
    public int[] field4044;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "[I")
    public int[] field4027;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "[I")
    public int[] field4046;

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "[B")
    public byte[] field4052;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "[B")
    public byte[] field4012;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "[B")
    public byte[] field4033;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "[S")
    public short[] field4040;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "[S")
    public short[] field4013;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "[B")
    public byte[] field4011;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "[I")
    public int[] field4017;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "[B")
    public byte[] field4035;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "[S")
    public short[] field4037;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "[S")
    public short[] field4025;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "[S")
    public short[] field4010;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "[S")
    public short[] field4036;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "[S")
    public short[] field4045;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "[S")
    public short[] field4023;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "[B")
    public byte[] field4032;

    @OriginalMember(owner = "client!he", name = "hb", descriptor = "[B")
    public byte[] field4053;

    @OriginalMember(owner = "client!he", name = "jb", descriptor = "[B")
    public byte[] field4055;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "[B")
    public byte[] field4022;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "[B")
    public byte[] field4031;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "[[I")
    public int[][] field4042;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "[[I")
    public int[][] field4029;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "[Lac;")
    public class293[] field4007;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "[Lpk;")
    public class254[] field4034;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "[Lac;")
    public class293[] field4015;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "S")
    public short field4026;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "S")
    public short field4028;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    private static int field4039 = 0;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "[I")
    private static int[] field4038 = new int[10000];

    @OriginalMember(owner = "client!he", name = "db", descriptor = "[I")
    private static int[] field4049 = class298.field5094;

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "[I")
    private static int[] field4051 = new int[10000];

    @OriginalMember(owner = "client!he", name = "X", descriptor = "[I")
    private static int[] field4043 = class298.field5095;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "S")
    private short field4014;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "S")
    private short field4016;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "S")
    private short field4024;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "S")
    private short field4030;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "S")
    private short field4047;

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "S")
    private short field4050;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lhe;I)I", line = 4)
    private final int method1696(class242 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field4009[arg1];
        int var5 = arg0.field4008[arg1];
        int var6 = arg0.field4041[arg1];
        for (int var7 = 0; var7 < this.field4048; var7++) {
            if (this.field4009[var7] == var4 && this.field4008[var7] == var5 && this.field4041[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field4009[this.field4048] = var4;
            this.field4008[this.field4048] = var5;
            this.field4041[this.field4048] = var6;
            if (arg0.field4018 != null) {
                this.field4018[this.field4048] = arg0.field4018[arg1];
            }
            var3 = this.field4048++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()I", line = 40)
    public final int method152() {
        if (!this.field4019) {
            this.method1707();
        }
        return this.field4016;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIBSB)I", line = 47)
    public final int method1697(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field4044[this.field4021] = arg0;
        this.field4027[this.field4021] = arg1;
        this.field4046[this.field4021] = arg2;
        this.field4052[this.field4021] = arg3;
        this.field4011[this.field4021] = -1;
        this.field4040[this.field4021] = arg4;
        this.field4013[this.field4021] = -1;
        this.field4033[this.field4021] = arg5;
        return this.field4021++;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()Z", line = 58)
    public final boolean method1310() {
        return true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Lfg;", line = 65)
    public final class176 method1309(int arg0, int arg1, int arg2) {
        return this.method1702(this.field4026, this.field4028, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([B)V", line = 69)
    private final void method1698(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class170 var4 = new class170(arg0);
        class170 var5 = new class170(arg0);
        class170 var6 = new class170(arg0);
        class170 var7 = new class170(arg0);
        class170 var8 = new class170(arg0);
        var4.field2787 = arg0.length - 18;
        int var9 = var4.method1214(-18254);
        int var10 = var4.method1214(-18254);
        int var11 = var4.method1221(81);
        int var12 = var4.method1221(117);
        int var13 = var4.method1221(103);
        int var14 = var4.method1221(102);
        int var15 = var4.method1221(126);
        int var16 = var4.method1221(98);
        int var17 = var4.method1214(-18254);
        int var18 = var4.method1214(-18254);
        int var19 = var4.method1214(-18254);
        int var20 = var4.method1214(-18254);
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
        this.field4048 = var9;
        this.field4021 = var10;
        this.field4020 = var11;
        this.field4009 = new int[var9];
        this.field4008 = new int[var9];
        this.field4041 = new int[var9];
        this.field4044 = new int[var10];
        this.field4027 = new int[var10];
        this.field4046 = new int[var10];
        if (var11 > 0) {
            this.field4035 = new byte[var11];
            this.field4037 = new short[var11];
            this.field4025 = new short[var11];
            this.field4010 = new short[var11];
        }
        if (var16 == 1) {
            this.field4018 = new int[var9];
        }
        if (var12 == 1) {
            this.field4052 = new byte[var10];
            this.field4011 = new byte[var10];
            this.field4013 = new short[var10];
        }
        if (var13 == 255) {
            this.field4012 = new byte[var10];
        } else {
            this.field4054 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4033 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4017 = new int[var10];
        }
        this.field4040 = new short[var10];
        var4.field2787 = var21;
        var5.field2787 = var36;
        var6.field2787 = var38;
        var7.field2787 = var40;
        var8.field2787 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method1221(80);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method1232((byte) -125);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method1232((byte) -121);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method1232((byte) -100);
            }
            this.field4009[var46] = var43 + var48;
            this.field4008[var46] = var44 + var49;
            this.field4041[var46] = var45 + var50;
            var43 = this.field4009[var46];
            var44 = this.field4008[var46];
            var45 = this.field4041[var46];
            if (var16 == 1) {
                this.field4018[var46] = var8.method1221(72);
            }
        }
        var4.field2787 = var32;
        var5.field2787 = var28;
        var6.field2787 = var26;
        var7.field2787 = var30;
        var8.field2787 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field4040[var51] = (short) var4.method1214(-18254);
            if (var12 == 1) {
                int var52 = var5.method1221(104);
                if ((var52 & 0x1) == 1) {
                    this.field4052[var51] = 1;
                    var2 = true;
                } else {
                    this.field4052[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field4011[var51] = (byte) (var52 >> 2);
                    this.field4013[var51] = this.field4040[var51];
                    this.field4040[var51] = 127;
                    if (this.field4013[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field4011[var51] = -1;
                    this.field4013[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field4012[var51] = var6.method1205(-1);
            }
            if (var14 == 1) {
                this.field4033[var51] = var7.method1205(-1);
            }
            if (var15 == 1) {
                this.field4017[var51] = var8.method1221(117);
            }
        }
        var4.field2787 = var25;
        var5.field2787 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method1221(89);
            if (var58 == 1) {
                var53 = var4.method1232((byte) -118) + var56;
                var54 = var4.method1232((byte) 25) + var53;
                var55 = var4.method1232((byte) -110) + var54;
                var56 = var55;
                this.field4044[var57] = var53;
                this.field4027[var57] = var54;
                this.field4046[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method1232((byte) -112) + var56;
                var56 = var55;
                this.field4044[var57] = var53;
                this.field4027[var57] = var54;
                this.field4046[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method1232((byte) -117) + var56;
                var56 = var55;
                this.field4044[var57] = var53;
                this.field4027[var57] = var54;
                this.field4046[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method1232((byte) 24) + var56;
                var56 = var55;
                this.field4044[var57] = var53;
                this.field4027[var57] = var61;
                this.field4046[var57] = var55;
            }
        }
        var4.field2787 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field4035[var62] = 0;
            this.field4037[var62] = (short) var4.method1214(-18254);
            this.field4025[var62] = (short) var4.method1214(-18254);
            this.field4010[var62] = (short) var4.method1214(-18254);
        }
        if (this.field4011 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field4011[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field4037[var65] & 0xFFFF) == this.field4044[var64] && (this.field4025[var65] & 0xFFFF) == this.field4027[var64] && (this.field4010[var65] & 0xFFFF) == this.field4046[var64]) {
                        this.field4011[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field4011 = null;
            }
        }
        if (!var3) {
            this.field4013 = null;
        }
        if (!var2) {
            this.field4052 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([[III)I", line = 415)
    private static final int method1699(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V", line = 433)
    public final void method1700() {
        this.field4018 = null;
        this.field4017 = null;
        this.field4042 = (int[][]) null;
        this.field4029 = (int[][]) null;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()V", line = 446)
    public final void method1701() {
        for (int var1 = 0; var1 < this.field4048; var1++) {
            this.field4009[var1] = -this.field4009[var1];
            this.field4041[var1] = -this.field4041[var1];
        }
        this.method1713();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lfg;IIIZ)V", line = 460)
    public final void method1307(class176 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class242 var6 = (class242) arg0;
        var6.method1707();
        var6.method1723();
        field4039++;
        int var7 = 0;
        int[] var8 = var6.field4009;
        int var9 = var6.field4048;
        for (int var10 = 0; var10 < this.field4048; var10++) {
            class293 var11 = this.field4007[var10];
            if (var11.field5009 != 0) {
                int var12 = this.field4008[var10] - arg2;
                if (var12 >= var6.field4016 && var12 <= var6.field4014) {
                    int var13 = this.field4009[var10] - arg1;
                    if (var13 >= var6.field4050 && var13 <= var6.field4024) {
                        int var14 = this.field4041[var10] - arg3;
                        if (var14 >= var6.field4030 && var14 <= var6.field4047) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class293 var16 = var6.field4007[var15];
                                if (var8[var15] == var13 && var6.field4041[var15] == var14 && var6.field4008[var15] == var12 && var16.field5009 != 0) {
                                    if (this.field4015 == null) {
                                        this.field4015 = new class293[this.field4048];
                                    }
                                    if (var6.field4015 == null) {
                                        var6.field4015 = new class293[var9];
                                    }
                                    class293 var17 = this.field4015[var10];
                                    if (var17 == null) {
                                        var17 = this.field4015[var10] = new class293(var11);
                                    }
                                    class293 var18 = var6.field4015[var15];
                                    if (var18 == null) {
                                        var18 = var6.field4015[var15] = new class293(var16);
                                    }
                                    var17.field5006 += var16.field5006;
                                    var17.field5011 += var16.field5011;
                                    var17.field5000 += var16.field5000;
                                    var17.field5009 += var16.field5009;
                                    var18.field5006 += var11.field5006;
                                    var18.field5011 += var11.field5011;
                                    var18.field5000 += var11.field5000;
                                    var18.field5009 += var11.field5009;
                                    var7++;
                                    field4038[var10] = field4039;
                                    field4051[var15] = field4039;
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
        for (int var19 = 0; var19 < this.field4021; var19++) {
            if (field4038[this.field4044[var19]] == field4039 && field4038[this.field4027[var19]] == field4039 && field4038[this.field4046[var19]] == field4039) {
                if (this.field4052 == null) {
                    this.field4052 = new byte[this.field4021];
                }
                this.field4052[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field4021; var20++) {
            if (field4051[var6.field4044[var20]] == field4039 && field4051[var6.field4027[var20]] == field4039 && field4051[var6.field4046[var20]] == field4039) {
                if (var6.field4052 == null) {
                    var6.field4052 = new byte[var6.field4021];
                }
                var6.field4052[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)Lca;", line = 578)
    public final class57 method1702(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class55.field815) {
            class267 var6 = new class267(this, arg0, arg1, true);
            var6.method1855();
            return var6;
        } else {
            return new class258(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II[[I[[IIIIZZ)Lhe;", line = 593)
    public final class242 method1703(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1707();
        int var10 = this.field4050 + arg4;
        int var11 = this.field4024 + arg4;
        int var12 = this.field4030 + arg6;
        int var13 = this.field4047 + arg6;
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
        class242 var18;
        if (arg7) {
            var18 = new class242();
            var18.field4048 = this.field4048;
            var18.field4021 = this.field4021;
            var18.field4020 = this.field4020;
            var18.field4044 = this.field4044;
            var18.field4027 = this.field4027;
            var18.field4046 = this.field4046;
            var18.field4052 = this.field4052;
            var18.field4012 = this.field4012;
            var18.field4033 = this.field4033;
            var18.field4011 = this.field4011;
            var18.field4040 = this.field4040;
            var18.field4013 = this.field4013;
            var18.field4054 = this.field4054;
            var18.field4035 = this.field4035;
            var18.field4037 = this.field4037;
            var18.field4025 = this.field4025;
            var18.field4010 = this.field4010;
            var18.field4036 = this.field4036;
            var18.field4045 = this.field4045;
            var18.field4023 = this.field4023;
            var18.field4032 = this.field4032;
            var18.field4053 = this.field4053;
            var18.field4055 = this.field4055;
            var18.field4022 = this.field4022;
            var18.field4031 = this.field4031;
            var18.field4018 = this.field4018;
            var18.field4017 = this.field4017;
            var18.field4042 = this.field4042;
            var18.field4029 = this.field4029;
            var18.field4026 = this.field4026;
            var18.field4028 = this.field4028;
            var18.field4007 = this.field4007;
            var18.field4034 = this.field4034;
            var18.field4015 = this.field4015;
            if (arg0 == 3) {
                var18.field4009 = class37.method248(this.field4009, 126);
                var18.field4008 = class37.method248(this.field4008, 127);
                var18.field4041 = class37.method248(this.field4041, 124);
            } else {
                var18.field4009 = this.field4009;
                var18.field4008 = new int[var18.field4048];
                var18.field4041 = this.field4041;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field4048; var19++) {
                int var20 = this.field4009[var19] + arg4;
                int var21 = this.field4041[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field4008[var19] = this.field4008[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field4048; var29++) {
                int var30 = (this.field4008[var29] << 16) / this.field4016;
                if (var30 < arg1) {
                    int var31 = this.field4009[var29] + arg4;
                    int var32 = this.field4041[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field4008[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field4008[var29];
                } else {
                    var18.field4008[var29] = this.field4008[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1714(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field4014 - this.field4016;
            for (int var43 = 0; var43 < this.field4048; var43++) {
                int var44 = this.field4009[var43] + arg4;
                int var45 = this.field4041[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field4008[var43] = var52 + this.field4008[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field4014 - this.field4016;
            for (int var54 = 0; var54 < this.field4048; var54++) {
                int var55 = this.field4009[var54] + arg4;
                int var56 = this.field4041[var54] + arg6;
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
                var18.field4008[var54] = ((this.field4008[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1713();
        } else {
            this.field4019 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 1977)
    private class242() {
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V", line = 1979)
    private class242(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1722(arg0);
        } else {
            this.method1698(arg0);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(III)V", line = 1986)
    public class242(int arg0, int arg1, int arg2) {
        this.field4009 = new int[arg0];
        this.field4008 = new int[arg0];
        this.field4041 = new int[arg0];
        this.field4018 = new int[arg0];
        this.field4044 = new int[arg1];
        this.field4027 = new int[arg1];
        this.field4046 = new int[arg1];
        this.field4052 = new byte[arg1];
        this.field4012 = new byte[arg1];
        this.field4033 = new byte[arg1];
        this.field4040 = new short[arg1];
        this.field4013 = new short[arg1];
        this.field4011 = new byte[arg1];
        this.field4017 = new int[arg1];
        if (arg2 > 0) {
            this.field4035 = new byte[arg2];
            this.field4037 = new short[arg2];
            this.field4025 = new short[arg2];
            this.field4010 = new short[arg2];
            this.field4036 = new short[arg2];
            this.field4045 = new short[arg2];
            this.field4023 = new short[arg2];
            this.field4032 = new byte[arg2];
            this.field4053 = new byte[arg2];
            this.field4055 = new byte[arg2];
            this.field4022 = new byte[arg2];
            this.field4031 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([Lhe;I)V", line = 2018)
    public class242(class242[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field4048 = 0;
        this.field4021 = 0;
        this.field4020 = 0;
        this.field4054 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class242 var10 = arg0[var9];
            if (var10 != null) {
                this.field4048 += var10.field4048;
                this.field4021 += var10.field4021;
                this.field4020 += var10.field4020;
                if (var10.field4012 == null) {
                    if (this.field4054 == -1) {
                        this.field4054 = var10.field4054;
                    }
                    if (this.field4054 != var10.field4054) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field4052 != null;
                var5 |= var10.field4033 != null;
                var6 |= var10.field4017 != null;
                var7 |= var10.field4013 != null;
                var8 |= var10.field4011 != null;
            }
        }
        this.field4009 = new int[this.field4048];
        this.field4008 = new int[this.field4048];
        this.field4041 = new int[this.field4048];
        this.field4018 = new int[this.field4048];
        this.field4044 = new int[this.field4021];
        this.field4027 = new int[this.field4021];
        this.field4046 = new int[this.field4021];
        if (var3) {
            this.field4052 = new byte[this.field4021];
        }
        if (var4) {
            this.field4012 = new byte[this.field4021];
        }
        if (var5) {
            this.field4033 = new byte[this.field4021];
        }
        if (var6) {
            this.field4017 = new int[this.field4021];
        }
        if (var7) {
            this.field4013 = new short[this.field4021];
        }
        if (var8) {
            this.field4011 = new byte[this.field4021];
        }
        this.field4040 = new short[this.field4021];
        if (this.field4020 > 0) {
            this.field4035 = new byte[this.field4020];
            this.field4037 = new short[this.field4020];
            this.field4025 = new short[this.field4020];
            this.field4010 = new short[this.field4020];
            this.field4036 = new short[this.field4020];
            this.field4045 = new short[this.field4020];
            this.field4023 = new short[this.field4020];
            this.field4032 = new byte[this.field4020];
            this.field4053 = new byte[this.field4020];
            this.field4055 = new byte[this.field4020];
            this.field4022 = new byte[this.field4020];
            this.field4031 = new byte[this.field4020];
        }
        this.field4048 = 0;
        this.field4021 = 0;
        this.field4020 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class242 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field4021; var13++) {
                    if (var3 && var12.field4052 != null) {
                        this.field4052[this.field4021] = var12.field4052[var13];
                    }
                    if (var4) {
                        if (var12.field4012 == null) {
                            this.field4012[this.field4021] = var12.field4054;
                        } else {
                            this.field4012[this.field4021] = var12.field4012[var13];
                        }
                    }
                    if (var5 && var12.field4033 != null) {
                        this.field4033[this.field4021] = var12.field4033[var13];
                    }
                    if (var6 && var12.field4017 != null) {
                        this.field4017[this.field4021] = var12.field4017[var13];
                    }
                    if (var7) {
                        if (var12.field4013 == null) {
                            this.field4013[this.field4021] = -1;
                        } else {
                            this.field4013[this.field4021] = var12.field4013[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field4011 == null || var12.field4011[var13] == -1) {
                            this.field4011[this.field4021] = -1;
                        } else {
                            this.field4011[this.field4021] = (byte) (var12.field4011[var13] + this.field4020);
                        }
                    }
                    this.field4040[this.field4021] = var12.field4040[var13];
                    this.field4044[this.field4021] = this.method1696(var12, var12.field4044[var13]);
                    this.field4027[this.field4021] = this.method1696(var12, var12.field4027[var13]);
                    this.field4046[this.field4021] = this.method1696(var12, var12.field4046[var13]);
                    this.field4021++;
                }
                for (int var14 = 0; var14 < var12.field4020; var14++) {
                    byte var15 = this.field4035[this.field4020] = var12.field4035[var14];
                    if (var15 == 0) {
                        this.field4037[this.field4020] = (short) this.method1696(var12, var12.field4037[var14]);
                        this.field4025[this.field4020] = (short) this.method1696(var12, var12.field4025[var14]);
                        this.field4010[this.field4020] = (short) this.method1696(var12, var12.field4010[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field4037[this.field4020] = var12.field4037[var14];
                        this.field4025[this.field4020] = var12.field4025[var14];
                        this.field4010[this.field4020] = var12.field4010[var14];
                        this.field4036[this.field4020] = var12.field4036[var14];
                        this.field4045[this.field4020] = var12.field4045[var14];
                        this.field4023[this.field4020] = var12.field4023[var14];
                        this.field4032[this.field4020] = var12.field4032[var14];
                        this.field4053[this.field4020] = var12.field4053[var14];
                        this.field4055[this.field4020] = var12.field4055[var14];
                    }
                    if (var15 == 2) {
                        this.field4022[this.field4020] = var12.field4022[var14];
                        this.field4031[this.field4020] = var12.field4031[var14];
                    }
                    this.field4020++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lhe;ZZZZ)V", line = 2227)
    public class242(class242 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field4048 = arg0.field4048;
        this.field4021 = arg0.field4021;
        this.field4020 = arg0.field4020;
        if (arg1) {
            this.field4009 = arg0.field4009;
            this.field4008 = arg0.field4008;
            this.field4041 = arg0.field4041;
        } else {
            this.field4009 = new int[this.field4048];
            this.field4008 = new int[this.field4048];
            this.field4041 = new int[this.field4048];
            for (int var6 = 0; var6 < this.field4048; var6++) {
                this.field4009[var6] = arg0.field4009[var6];
                this.field4008[var6] = arg0.field4008[var6];
                this.field4041[var6] = arg0.field4041[var6];
            }
        }
        if (arg2) {
            this.field4040 = arg0.field4040;
        } else {
            this.field4040 = new short[this.field4021];
            for (int var7 = 0; var7 < this.field4021; var7++) {
                this.field4040[var7] = arg0.field4040[var7];
            }
        }
        if (arg3 || arg0.field4013 == null) {
            this.field4013 = arg0.field4013;
        } else {
            this.field4013 = new short[this.field4021];
            for (int var8 = 0; var8 < this.field4021; var8++) {
                this.field4013[var8] = arg0.field4013[var8];
            }
        }
        if (arg4) {
            this.field4033 = arg0.field4033;
        } else {
            this.field4033 = new byte[this.field4021];
            if (arg0.field4033 == null) {
                for (int var9 = 0; var9 < this.field4021; var9++) {
                    this.field4033[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field4021; var10++) {
                    this.field4033[var10] = arg0.field4033[var10];
                }
            }
        }
        this.field4044 = arg0.field4044;
        this.field4027 = arg0.field4027;
        this.field4046 = arg0.field4046;
        this.field4052 = arg0.field4052;
        this.field4012 = arg0.field4012;
        this.field4011 = arg0.field4011;
        this.field4054 = arg0.field4054;
        this.field4035 = arg0.field4035;
        this.field4037 = arg0.field4037;
        this.field4025 = arg0.field4025;
        this.field4010 = arg0.field4010;
        this.field4036 = arg0.field4036;
        this.field4045 = arg0.field4045;
        this.field4023 = arg0.field4023;
        this.field4032 = arg0.field4032;
        this.field4053 = arg0.field4053;
        this.field4055 = arg0.field4055;
        this.field4022 = arg0.field4022;
        this.field4031 = arg0.field4031;
        this.field4018 = arg0.field4018;
        this.field4017 = arg0.field4017;
        this.field4042 = arg0.field4042;
        this.field4029 = arg0.field4029;
        this.field4007 = arg0.field4007;
        this.field4034 = arg0.field4034;
        this.field4015 = arg0.field4015;
        this.field4026 = arg0.field4026;
        this.field4028 = arg0.field4028;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IIIII)Lil;", line = 866)
    public final class258 method1704(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class258(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "()V", line = 871)
    public final void method1705() {
        for (int var1 = 0; var1 < this.field4048; var1++) {
            int var2 = this.field4009[var1];
            this.field4009[var1] = this.field4041[var1];
            this.field4041[var1] = -var2;
        }
        this.method1713();
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "()V", line = 884)
    public static void method1706() {
        field4038 = null;
        field4051 = null;
        field4043 = null;
        field4049 = null;
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "()V", line = 890)
    private final void method1707() {
        if (this.field4019) {
            return;
        }
        this.field4019 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field4048; var7++) {
            int var8 = this.field4009[var7];
            int var9 = this.field4008[var7];
            int var10 = this.field4041[var7];
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
        this.field4050 = (short) var1;
        this.field4024 = (short) var4;
        this.field4016 = (short) var2;
        this.field4014 = (short) var5;
        this.field4030 = (short) var3;
        this.field4047 = (short) var6;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(III)V", line = 948)
    public final void method1708(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4048; var4++) {
            this.field4009[var4] += arg0;
            this.field4008[var4] += arg1;
            this.field4041[var4] += arg2;
        }
        this.method1713();
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(III)I", line = 962)
    public final int method1709(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4048; var4++) {
            if (this.field4009[var4] == arg0 && this.field4008[var4] == arg1 && this.field4041[var4] == arg2) {
                return var4;
            }
        }
        this.field4009[this.field4048] = arg0;
        this.field4008[this.field4048] = arg1;
        this.field4041[this.field4048] = arg2;
        return this.field4048++;
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "()V", line = 978)
    public final void method1710() {
        for (int var1 = 0; var1 < this.field4048; var1++) {
            this.field4041[var1] = -this.field4041[var1];
        }
        for (int var2 = 0; var2 < this.field4021; var2++) {
            int var3 = this.field4044[var2];
            this.field4044[var2] = this.field4046[var2];
            this.field4046[var2] = var3;
        }
        this.method1713();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(SS)V", line = 998)
    public final void method1711(short arg0, short arg1) {
        if (this.field4013 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field4021; var3++) {
            if (this.field4013[var3] == arg0) {
                this.field4013[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 1016)
    private final void method1712(int arg0) {
        int var2 = field4043[arg0];
        int var3 = field4049[arg0];
        for (int var4 = 0; var4 < this.field4048; var4++) {
            int var5 = this.field4008[var4] * var3 - this.field4041[var4] * var2 >> 16;
            this.field4041[var4] = this.field4041[var4] * var3 + this.field4008[var4] * var2 >> 16;
            this.field4008[var4] = var5;
        }
        this.method1713();
    }

    @OriginalMember(owner = "client!he", name = "i", descriptor = "()V", line = 1034)
    private final void method1713() {
        this.field4007 = null;
        this.field4015 = null;
        this.field4034 = null;
        this.field4019 = false;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([[IIIIII)V", line = 1046)
    private final void method1714(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1699(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1699(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1699(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1699(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1712(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1720(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1708(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!he", name = "j", descriptor = "()V", line = 1116)
    public final void method1715() {
        int var10002;
        if (this.field4018 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field4048; var3++) {
                int var4 = this.field4018[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field4042 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field4042[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field4048) {
                int var7 = this.field4018[var6];
                this.field4042[var7][var1[var7]++] = var6++;
            }
            this.field4018 = null;
        }
        if (this.field4017 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4021; var10++) {
            int var11 = this.field4017[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field4029 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field4029[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field4021) {
            int var14 = this.field4017[var13];
            this.field4029[var14][var8[var14]++] = var13++;
        }
        this.field4017 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lme;II)Lhe;", line = 1209)
    public static final class242 method1716(class295 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2042(arg1, arg2, (byte) -125);
        return var3 == null ? null : new class242(var3);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 1218)
    public final void method1717(int arg0) {
        int var2 = field4043[arg0];
        int var3 = field4049[arg0];
        for (int var4 = 0; var4 < this.field4048; var4++) {
            int var5 = this.field4041[var4] * var2 + this.field4009[var4] * var3 >> 16;
            this.field4041[var4] = this.field4041[var4] * var3 - this.field4009[var4] * var2 >> 16;
            this.field4009[var4] = var5;
        }
        this.method1713();
    }

    @OriginalMember(owner = "client!he", name = "k", descriptor = "()V", line = 1243)
    public final void method1718() {
        for (int var1 = 0; var1 < this.field4048; var1++) {
            int var2 = this.field4041[var1];
            this.field4041[var1] = this.field4009[var1];
            this.field4009[var1] = -var2;
        }
        this.method1713();
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(III)V", line = 1256)
    public final void method1719(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field4043[arg2];
            int var5 = field4049[arg2];
            for (int var6 = 0; var6 < this.field4048; var6++) {
                int var7 = this.field4009[var6] * var5 + this.field4008[var6] * var4 >> 16;
                this.field4008[var6] = this.field4008[var6] * var5 - this.field4009[var6] * var4 >> 16;
                this.field4009[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field4043[arg0];
            int var9 = field4049[arg0];
            for (int var10 = 0; var10 < this.field4048; var10++) {
                int var11 = this.field4008[var10] * var9 - this.field4041[var10] * var8 >> 16;
                this.field4041[var10] = this.field4041[var10] * var9 + this.field4008[var10] * var8 >> 16;
                this.field4008[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field4043[arg1];
        int var13 = field4049[arg1];
        for (int var14 = 0; var14 < this.field4048; var14++) {
            int var15 = this.field4041[var14] * var12 + this.field4009[var14] * var13 >> 16;
            this.field4041[var14] = this.field4041[var14] * var13 - this.field4009[var14] * var12 >> 16;
            this.field4009[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 1319)
    private final void method1720(int arg0) {
        int var2 = field4043[arg0];
        int var3 = field4049[arg0];
        for (int var4 = 0; var4 < this.field4048; var4++) {
            int var5 = this.field4009[var4] * var3 + this.field4008[var4] * var2 >> 16;
            this.field4008[var4] = this.field4008[var4] * var3 - this.field4009[var4] * var2 >> 16;
            this.field4009[var4] = var5;
        }
        this.method1713();
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(III)V", line = 1353)
    public final void method1721(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4048; var4++) {
            this.field4009[var4] = this.field4009[var4] * arg0 / 128;
            this.field4008[var4] = this.field4008[var4] * arg1 / 128;
            this.field4041[var4] = this.field4041[var4] * arg2 / 128;
        }
        this.method1713();
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "([B)V", line = 1374)
    private final void method1722(byte[] arg0) {
        class170 var2 = new class170(arg0);
        class170 var3 = new class170(arg0);
        class170 var4 = new class170(arg0);
        class170 var5 = new class170(arg0);
        class170 var6 = new class170(arg0);
        class170 var7 = new class170(arg0);
        class170 var8 = new class170(arg0);
        var2.field2787 = arg0.length - 23;
        int var9 = var2.method1214(-18254);
        int var10 = var2.method1214(-18254);
        int var11 = var2.method1221(118);
        int var12 = var2.method1221(82);
        int var13 = var2.method1221(80);
        int var14 = var2.method1221(88);
        int var15 = var2.method1221(121);
        int var16 = var2.method1221(119);
        int var17 = var2.method1221(126);
        int var18 = var2.method1214(-18254);
        int var19 = var2.method1214(-18254);
        int var20 = var2.method1214(-18254);
        int var21 = var2.method1214(-18254);
        int var22 = var2.method1214(-18254);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field4035 = new byte[var11];
            var2.field2787 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field4035[var26] = var2.method1205(-1);
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
        this.field4048 = var9;
        this.field4021 = var10;
        this.field4020 = var11;
        this.field4009 = new int[var9];
        this.field4008 = new int[var9];
        this.field4041 = new int[var9];
        this.field4044 = new int[var10];
        this.field4027 = new int[var10];
        this.field4046 = new int[var10];
        if (var17 == 1) {
            this.field4018 = new int[var9];
        }
        if (var12 == 1) {
            this.field4052 = new byte[var10];
        }
        if (var13 == 255) {
            this.field4012 = new byte[var10];
        } else {
            this.field4054 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4033 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4017 = new int[var10];
        }
        if (var16 == 1) {
            this.field4013 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field4011 = new byte[var10];
        }
        this.field4040 = new short[var10];
        if (var11 > 0) {
            this.field4037 = new short[var11];
            this.field4025 = new short[var11];
            this.field4010 = new short[var11];
            if (var24 > 0) {
                this.field4036 = new short[var24];
                this.field4045 = new short[var24];
                this.field4023 = new short[var24];
                this.field4032 = new byte[var24];
                this.field4053 = new byte[var24];
                this.field4055 = new byte[var24];
            }
            if (var25 > 0) {
                this.field4022 = new byte[var25];
                this.field4031 = new byte[var25];
            }
        }
        var2.field2787 = var11;
        var3.field2787 = var44;
        var4.field2787 = var46;
        var5.field2787 = var48;
        var6.field2787 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var67 = var2.method1221(96);
            int var68 = 0;
            if ((var67 & 0x1) != 0) {
                var68 = var3.method1232((byte) 58);
            }
            int var69 = 0;
            if ((var67 & 0x2) != 0) {
                var69 = var4.method1232((byte) 57);
            }
            int var70 = 0;
            if ((var67 & 0x4) != 0) {
                var70 = var5.method1232((byte) -106);
            }
            this.field4009[var66] = var63 + var68;
            this.field4008[var66] = var64 + var69;
            this.field4041[var66] = var65 + var70;
            var63 = this.field4009[var66];
            var64 = this.field4008[var66];
            var65 = this.field4041[var66];
            if (var17 == 1) {
                this.field4018[var66] = var6.method1221(82);
            }
        }
        var2.field2787 = var42;
        var3.field2787 = var31;
        var4.field2787 = var34;
        var5.field2787 = var37;
        var6.field2787 = var35;
        var7.field2787 = var40;
        var8.field2787 = var39;
        for (int var71 = 0; var71 < var10; var71++) {
            this.field4040[var71] = (short) var2.method1214(-18254);
            if (var12 == 1) {
                this.field4052[var71] = var3.method1205(-1);
            }
            if (var13 == 255) {
                this.field4012[var71] = var4.method1205(-1);
            }
            if (var14 == 1) {
                this.field4033[var71] = var5.method1205(-1);
            }
            if (var15 == 1) {
                this.field4017[var71] = var6.method1221(75);
            }
            if (var16 == 1) {
                this.field4013[var71] = (short) (var7.method1214(-18254) - 1);
            }
            if (this.field4011 != null) {
                if (this.field4013[var71] == -1) {
                    this.field4011[var71] = -1;
                } else {
                    this.field4011[var71] = (byte) (var8.method1221(81) - 1);
                }
            }
        }
        var2.field2787 = var33;
        var3.field2787 = var30;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        for (int var76 = 0; var76 < var10; var76++) {
            int var77 = var3.method1221(71);
            if (var77 == 1) {
                var72 = var2.method1232((byte) 77) + var75;
                var73 = var2.method1232((byte) 93) + var72;
                var74 = var2.method1232((byte) 34) + var73;
                var75 = var74;
                this.field4044[var76] = var72;
                this.field4027[var76] = var73;
                this.field4046[var76] = var74;
            }
            if (var77 == 2) {
                var73 = var74;
                var74 = var2.method1232((byte) 32) + var75;
                var75 = var74;
                this.field4044[var76] = var72;
                this.field4027[var76] = var73;
                this.field4046[var76] = var74;
            }
            if (var77 == 3) {
                var72 = var74;
                var74 = var2.method1232((byte) 107) + var75;
                var75 = var74;
                this.field4044[var76] = var72;
                this.field4027[var76] = var73;
                this.field4046[var76] = var74;
            }
            if (var77 == 4) {
                int var80 = var72;
                var72 = var73;
                var73 = var80;
                var74 = var2.method1232((byte) 26) + var75;
                var75 = var74;
                this.field4044[var76] = var72;
                this.field4027[var76] = var80;
                this.field4046[var76] = var74;
            }
        }
        var2.field2787 = var50;
        var3.field2787 = var52;
        var4.field2787 = var54;
        var5.field2787 = var56;
        var6.field2787 = var58;
        var7.field2787 = var60;
        for (int var81 = 0; var81 < var11; var81++) {
            int var82 = this.field4035[var81] & 0xFF;
            if (var82 == 0) {
                this.field4037[var81] = (short) var2.method1214(-18254);
                this.field4025[var81] = (short) var2.method1214(-18254);
                this.field4010[var81] = (short) var2.method1214(-18254);
            }
            if (var82 == 1) {
                this.field4037[var81] = (short) var3.method1214(-18254);
                this.field4025[var81] = (short) var3.method1214(-18254);
                this.field4010[var81] = (short) var3.method1214(-18254);
                this.field4036[var81] = (short) var4.method1214(-18254);
                this.field4045[var81] = (short) var4.method1214(-18254);
                this.field4023[var81] = (short) var4.method1214(-18254);
                this.field4032[var81] = var5.method1205(-1);
                this.field4053[var81] = var6.method1205(-1);
                this.field4055[var81] = var7.method1205(-1);
            }
            if (var82 == 2) {
                this.field4037[var81] = (short) var3.method1214(-18254);
                this.field4025[var81] = (short) var3.method1214(-18254);
                this.field4010[var81] = (short) var3.method1214(-18254);
                this.field4036[var81] = (short) var4.method1214(-18254);
                this.field4045[var81] = (short) var4.method1214(-18254);
                this.field4023[var81] = (short) var4.method1214(-18254);
                this.field4032[var81] = var5.method1205(-1);
                this.field4053[var81] = var6.method1205(-1);
                this.field4055[var81] = var7.method1205(-1);
                this.field4022[var81] = var7.method1205(-1);
                this.field4031[var81] = var7.method1205(-1);
            }
            if (var82 == 3) {
                this.field4037[var81] = (short) var3.method1214(-18254);
                this.field4025[var81] = (short) var3.method1214(-18254);
                this.field4010[var81] = (short) var3.method1214(-18254);
                this.field4036[var81] = (short) var4.method1214(-18254);
                this.field4045[var81] = (short) var4.method1214(-18254);
                this.field4023[var81] = (short) var4.method1214(-18254);
                this.field4032[var81] = var5.method1205(-1);
                this.field4053[var81] = var6.method1205(-1);
                this.field4055[var81] = var7.method1205(-1);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "l", descriptor = "()V", line = 1794)
    public final void method1723() {
        if (this.field4007 != null) {
            return;
        }
        this.field4007 = new class293[this.field4048];
        for (int var1 = 0; var1 < this.field4048; var1++) {
            this.field4007[var1] = new class293();
        }
        for (int var2 = 0; var2 < this.field4021; var2++) {
            int var3 = this.field4044[var2];
            int var4 = this.field4027[var2];
            int var5 = this.field4046[var2];
            int var6 = this.field4009[var4] - this.field4009[var3];
            int var7 = this.field4008[var4] - this.field4008[var3];
            int var8 = this.field4041[var4] - this.field4041[var3];
            int var9 = this.field4009[var5] - this.field4009[var3];
            int var10 = this.field4008[var5] - this.field4008[var3];
            int var11 = this.field4041[var5] - this.field4041[var3];
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
            if (this.field4052 == null) {
                var19 = 0;
            } else {
                var19 = this.field4052[var2];
            }
            if (var19 == 0) {
                class293 var20 = this.field4007[var3];
                var20.field5006 += var16;
                var20.field5011 += var17;
                var20.field5000 += var18;
                var20.field5009++;
                class293 var21 = this.field4007[var4];
                var21.field5006 += var16;
                var21.field5011 += var17;
                var21.field5000 += var18;
                var21.field5009++;
                class293 var22 = this.field4007[var5];
                var22.field5006 += var16;
                var22.field5011 += var17;
                var22.field5000 += var18;
                var22.field5009++;
            } else if (var19 == 1) {
                if (this.field4034 == null) {
                    this.field4034 = new class254[this.field4021];
                }
                class254 var23 = this.field4034[var2] = new class254();
                var23.field4210 = var16;
                var23.field4214 = var17;
                var23.field4222 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "m", descriptor = "()Lhe;", line = 1894)
    public final class242 method1724() {
        class242 var1 = new class242();
        if (this.field4052 != null) {
            var1.field4052 = new byte[this.field4021];
            for (int var2 = 0; var2 < this.field4021; var2++) {
                var1.field4052[var2] = this.field4052[var2];
            }
        }
        var1.field4048 = this.field4048;
        var1.field4021 = this.field4021;
        var1.field4020 = this.field4020;
        var1.field4009 = this.field4009;
        var1.field4008 = this.field4008;
        var1.field4041 = this.field4041;
        var1.field4044 = this.field4044;
        var1.field4027 = this.field4027;
        var1.field4046 = this.field4046;
        var1.field4012 = this.field4012;
        var1.field4033 = this.field4033;
        var1.field4011 = this.field4011;
        var1.field4040 = this.field4040;
        var1.field4013 = this.field4013;
        var1.field4054 = this.field4054;
        var1.field4035 = this.field4035;
        var1.field4037 = this.field4037;
        var1.field4025 = this.field4025;
        var1.field4010 = this.field4010;
        var1.field4036 = this.field4036;
        var1.field4045 = this.field4045;
        var1.field4023 = this.field4023;
        var1.field4032 = this.field4032;
        var1.field4053 = this.field4053;
        var1.field4055 = this.field4055;
        var1.field4022 = this.field4022;
        var1.field4031 = this.field4031;
        var1.field4018 = this.field4018;
        var1.field4017 = this.field4017;
        var1.field4042 = this.field4042;
        var1.field4029 = this.field4029;
        var1.field4007 = this.field4007;
        var1.field4034 = this.field4034;
        var1.field4026 = this.field4026;
        var1.field4028 = this.field4028;
        return var1;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(SS)V", line = 1952)
    public final void method1725(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4021; var3++) {
            if (this.field4040[var3] == arg0) {
                this.field4040[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIJ)V", line = 1967)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }
}
