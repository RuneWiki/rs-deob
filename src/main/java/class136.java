import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 extends class156 {

    @OriginalMember(owner = "client!td", name = "xb", descriptor = "B")
    private byte field3193 = 0;

    @OriginalMember(owner = "client!td", name = "Pb", descriptor = "I")
    private int field3211 = 0;

    @OriginalMember(owner = "client!td", name = "Ob", descriptor = "Z")
    private boolean field3210 = false;

    @OriginalMember(owner = "client!td", name = "ec", descriptor = "I")
    private int field3226 = 0;

    @OriginalMember(owner = "client!td", name = "lc", descriptor = "I")
    private int field3233;

    @OriginalMember(owner = "client!td", name = "Ib", descriptor = "[I")
    private int[] field3204;

    @OriginalMember(owner = "client!td", name = "Ub", descriptor = "[I")
    private int[] field3216;

    @OriginalMember(owner = "client!td", name = "mc", descriptor = "[I")
    private int[] field3234;

    @OriginalMember(owner = "client!td", name = "Lb", descriptor = "[I")
    private int[] field3207;

    @OriginalMember(owner = "client!td", name = "sb", descriptor = "[I")
    private int[] field3188;

    @OriginalMember(owner = "client!td", name = "kc", descriptor = "[I")
    private int[] field3232;

    @OriginalMember(owner = "client!td", name = "Wb", descriptor = "[I")
    private int[] field3218;

    @OriginalMember(owner = "client!td", name = "Rb", descriptor = "[B")
    private byte[] field3213;

    @OriginalMember(owner = "client!td", name = "Yb", descriptor = "[B")
    private byte[] field3220;

    @OriginalMember(owner = "client!td", name = "cc", descriptor = "[B")
    private byte[] field3224;

    @OriginalMember(owner = "client!td", name = "Nb", descriptor = "[I")
    private int[] field3209;

    @OriginalMember(owner = "client!td", name = "fc", descriptor = "[S")
    private short[] field3227;

    @OriginalMember(owner = "client!td", name = "zb", descriptor = "[B")
    private byte[] field3195;

    @OriginalMember(owner = "client!td", name = "Xb", descriptor = "[S")
    private short[] field3219;

    @OriginalMember(owner = "client!td", name = "Kb", descriptor = "[B")
    private byte[] field3206;

    @OriginalMember(owner = "client!td", name = "Tb", descriptor = "[S")
    private short[] field3215;

    @OriginalMember(owner = "client!td", name = "Db", descriptor = "[S")
    private short[] field3199;

    @OriginalMember(owner = "client!td", name = "Bb", descriptor = "[S")
    private short[] field3197;

    @OriginalMember(owner = "client!td", name = "yb", descriptor = "[S")
    private short[] field3194;

    @OriginalMember(owner = "client!td", name = "bc", descriptor = "[S")
    private short[] field3223;

    @OriginalMember(owner = "client!td", name = "ic", descriptor = "[S")
    private short[] field3230;

    @OriginalMember(owner = "client!td", name = "ub", descriptor = "[S")
    private short[] field3190;

    @OriginalMember(owner = "client!td", name = "Hb", descriptor = "[B")
    private byte[] field3203;

    @OriginalMember(owner = "client!td", name = "Cb", descriptor = "[S")
    private short[] field3198;

    @OriginalMember(owner = "client!td", name = "Vb", descriptor = "[S")
    private short[] field3217;

    @OriginalMember(owner = "client!td", name = "gc", descriptor = "[[I")
    private int[][] field3228;

    @OriginalMember(owner = "client!td", name = "dc", descriptor = "[[I")
    private int[][] field3225;

    @OriginalMember(owner = "client!td", name = "Sb", descriptor = "[Lt;")
    private class132[] field3214;

    @OriginalMember(owner = "client!td", name = "Ab", descriptor = "[Lg;")
    private class43[] field3196;

    @OriginalMember(owner = "client!td", name = "hc", descriptor = "[Lt;")
    private class132[] field3229;

    @OriginalMember(owner = "client!td", name = "Zb", descriptor = "S")
    public short field3221;

    @OriginalMember(owner = "client!td", name = "Qb", descriptor = "S")
    public short field3212;

    @OriginalMember(owner = "client!td", name = "tb", descriptor = "[I")
    private static int[] field3189 = new int[10000];

    @OriginalMember(owner = "client!td", name = "Jb", descriptor = "[I")
    private static int[] field3205 = new int[10000];

    @OriginalMember(owner = "client!td", name = "ac", descriptor = "I")
    private static int field3222 = 0;

    @OriginalMember(owner = "client!td", name = "Gb", descriptor = "[I")
    private static int[] field3202 = class114.field2557;

    @OriginalMember(owner = "client!td", name = "wb", descriptor = "[I")
    private static int[] field3192 = class114.field2564;

    @OriginalMember(owner = "client!td", name = "vb", descriptor = "I")
    private int field3191;

    @OriginalMember(owner = "client!td", name = "Eb", descriptor = "I")
    private int field3200;

    @OriginalMember(owner = "client!td", name = "Fb", descriptor = "I")
    private int field3201;

    @OriginalMember(owner = "client!td", name = "Mb", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!td", name = "jc", descriptor = "I")
    private int field3231;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)Llb;")
    public final class78 method1096(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1110();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class78 var8 = new class78();
        var8.field1700 = new int[this.field3226];
        var8.field1718 = new int[this.field3226];
        var8.field1706 = new int[this.field3226];
        if (this.field3233 > 0 && this.field3195 != null) {
            int[] var9 = new int[this.field3233];
            for (int var10 = 0; var10 < this.field3226; ++var10) {
                if (this.field3195[var10] != -1) {
                    ++var9[this.field3195[var10] & 255];
                }
            }
            var8.field1694 = 0;
            for (int var11 = 0; var11 < this.field3233; ++var11) {
                if (var9[var11] > 0 && this.field3206[var11] == 0) {
                    ++var8.field1694;
                }
            }
            var8.field1696 = new int[var8.field1694];
            var8.field1703 = new int[var8.field1694];
            var8.field1710 = new int[var8.field1694];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field3233; ++var13) {
                if (var9[var13] > 0 && this.field3206[var13] == 0) {
                    var8.field1696[var12] = this.field3215[var13] & 65535;
                    var8.field1703[var12] = this.field3199[var13] & 65535;
                    var8.field1710[var12] = this.field3197[var13] & 65535;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1690 = new byte[this.field3226];
            for (int var14 = 0; var14 < this.field3226; ++var14) {
                if (this.field3195[var14] != -1) {
                    var8.field1690[var14] = (byte) var9[this.field3195[var14] & 255];
                } else {
                    var8.field1690[var14] = -1;
                }
            }
        }
        for (int var15 = 0; var15 < this.field3226; ++var15) {
            byte var16;
            if (this.field3213 == null) {
                var16 = 0;
            } else {
                var16 = this.field3213[var15];
            }
            byte var17;
            if (this.field3224 == null) {
                var17 = 0;
            } else {
                var17 = this.field3224[var15];
            }
            short var18;
            if (this.field3227 == null) {
                var18 = -1;
            } else {
                var18 = this.field3227[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 != 0) {
                    if (var16 == 1) {
                        class43 var26 = this.field3196[var15];
                        int var27 = (var26.field793 * arg4 + var26.field800 * arg3 + var26.field796 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field1700[var15] = method1114(this.field3219[var15] & 65535, var27);
                        var8.field1706[var15] = -1;
                    } else if (var16 == 3) {
                        var8.field1700[var15] = 128;
                        var8.field1706[var15] = -1;
                    } else {
                        var8.field1706[var15] = -2;
                    }
                } else {
                    int var19 = this.field3219[var15] & 65535;
                    class132 var20;
                    if (this.field3229 != null && this.field3229[this.field3188[var15]] != null) {
                        var20 = this.field3229[this.field3188[var15]];
                    } else {
                        var20 = this.field3214[this.field3188[var15]];
                    }
                    int var21 = (var20.field3080 * arg4 + var20.field3095 * arg2 + var20.field3054 * arg3) / (var20.field3092 * var7) + arg0;
                    var8.field1700[var15] = method1114(var19, var21);
                    class132 var22;
                    if (this.field3229 != null && this.field3229[this.field3232[var15]] != null) {
                        var22 = this.field3229[this.field3232[var15]];
                    } else {
                        var22 = this.field3214[this.field3232[var15]];
                    }
                    int var23 = (var22.field3080 * arg4 + var22.field3095 * arg2 + var22.field3054 * arg3) / (var22.field3092 * var7) + arg0;
                    var8.field1718[var15] = method1114(var19, var23);
                    class132 var24;
                    if (this.field3229 != null && this.field3229[this.field3218[var15]] != null) {
                        var24 = this.field3229[this.field3218[var15]];
                    } else {
                        var24 = this.field3214[this.field3218[var15]];
                    }
                    int var25 = (var24.field3080 * arg4 + var24.field3095 * arg2 + var24.field3054 * arg3) / (var24.field3092 * var7) + arg0;
                    var8.field1706[var15] = method1114(var19, var25);
                }
            } else if (var16 != 0) {
                if (var16 == 1) {
                    class43 var34 = this.field3196[var15];
                    int var35 = (var34.field793 * arg4 + var34.field800 * arg3 + var34.field796 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1700[var15] = method1104(var35);
                    var8.field1706[var15] = -1;
                } else {
                    var8.field1706[var15] = -2;
                }
            } else {
                class132 var28;
                if (this.field3229 != null && this.field3229[this.field3188[var15]] != null) {
                    var28 = this.field3229[this.field3188[var15]];
                } else {
                    var28 = this.field3214[this.field3188[var15]];
                }
                int var29 = (var28.field3080 * arg4 + var28.field3095 * arg2 + var28.field3054 * arg3) / (var28.field3092 * var7) + arg0;
                var8.field1700[var15] = method1104(var29);
                class132 var30;
                if (this.field3229 != null && this.field3229[this.field3232[var15]] != null) {
                    var30 = this.field3229[this.field3232[var15]];
                } else {
                    var30 = this.field3214[this.field3232[var15]];
                }
                int var31 = (var30.field3080 * arg4 + var30.field3095 * arg2 + var30.field3054 * arg3) / (var30.field3092 * var7) + arg0;
                var8.field1718[var15] = method1104(var31);
                class132 var32;
                if (this.field3229 != null && this.field3229[this.field3218[var15]] != null) {
                    var32 = this.field3229[this.field3218[var15]];
                } else {
                    var32 = this.field3214[this.field3218[var15]];
                }
                int var33 = (var32.field3080 * arg4 + var32.field3095 * arg2 + var32.field3054 * arg3) / (var32.field3092 * var7) + arg0;
                var8.field1706[var15] = method1104(var33);
            }
        }
        this.method1099();
        var8.field1695 = this.field3211;
        var8.field1712 = this.field3204;
        var8.field1691 = this.field3216;
        var8.field1704 = this.field3234;
        var8.field1708 = this.field3226;
        var8.field1698 = this.field3188;
        var8.field1707 = this.field3232;
        var8.field1717 = this.field3218;
        var8.field1709 = this.field3220;
        var8.field1727 = this.field3224;
        var8.field1711 = this.field3193;
        var8.field1716 = this.field3228;
        var8.field1692 = this.field3225;
        var8.field1705 = this.field3227;
        return var8;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
    private final void method1097() {
        this.field3214 = null;
        this.field3229 = null;
        this.field3196 = null;
        this.field3210 = false;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
    public final void method1098(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3211; ++var4) {
            this.field3204[var4] = this.field3204[var4] * arg0 / 128;
            this.field3216[var4] = this.field3216[var4] * arg1 / 128;
            this.field3234[var4] = this.field3234[var4] * arg2 / 128;
        }
        this.method1097();
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()V")
    private final void method1099() {
        int var10002;
        if (this.field3207 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3211; ++var3) {
                int var7 = this.field3207[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3228 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field3228[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3211) {
                int var6 = this.field3207[var5];
                this.field3228[var6][var1[var6]++] = var5++;
            }
            this.field3207 = null;
        }
        if (this.field3209 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field3226; ++var10) {
                int var14 = this.field3209[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field3225 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field3225[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field3226) {
                int var13 = this.field3209[var12];
                this.field3225[var13][var8[var13]++] = var12++;
            }
            this.field3209 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()Ltd;")
    public final class136 method1100() {
        class136 var1 = new class136();
        if (this.field3213 != null) {
            var1.field3213 = new byte[this.field3226];
            for (int var2 = 0; var2 < this.field3226; ++var2) {
                var1.field3213[var2] = this.field3213[var2];
            }
        }
        var1.field3211 = this.field3211;
        var1.field3226 = this.field3226;
        var1.field3233 = this.field3233;
        var1.field3204 = this.field3204;
        var1.field3216 = this.field3216;
        var1.field3234 = this.field3234;
        var1.field3188 = this.field3188;
        var1.field3232 = this.field3232;
        var1.field3218 = this.field3218;
        var1.field3220 = this.field3220;
        var1.field3224 = this.field3224;
        var1.field3195 = this.field3195;
        var1.field3219 = this.field3219;
        var1.field3227 = this.field3227;
        var1.field3193 = this.field3193;
        var1.field3206 = this.field3206;
        var1.field3215 = this.field3215;
        var1.field3199 = this.field3199;
        var1.field3197 = this.field3197;
        var1.field3194 = this.field3194;
        var1.field3223 = this.field3223;
        var1.field3230 = this.field3230;
        var1.field3190 = this.field3190;
        var1.field3203 = this.field3203;
        var1.field3198 = this.field3198;
        var1.field3217 = this.field3217;
        var1.field3207 = this.field3207;
        var1.field3209 = this.field3209;
        var1.field3228 = this.field3228;
        var1.field3225 = this.field3225;
        var1.field3214 = this.field3214;
        var1.field3196 = this.field3196;
        var1.field3221 = this.field3221;
        var1.field3212 = this.field3212;
        return var1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([B)V")
    private final void method1101(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class86 var4 = new class86(arg0);
        class86 var5 = new class86(arg0);
        class86 var6 = new class86(arg0);
        class86 var7 = new class86(arg0);
        class86 var8 = new class86(arg0);
        var4.field1924 = arg0.length - 18;
        int var9 = var4.method632((byte) -80);
        int var10 = var4.method632((byte) -80);
        int var11 = var4.method646(-15447);
        int var12 = var4.method646(-15447);
        int var13 = var4.method646(-15447);
        int var14 = var4.method646(-15447);
        int var15 = var4.method646(-15447);
        int var16 = var4.method646(-15447);
        int var17 = var4.method632((byte) -80);
        int var18 = var4.method632((byte) -80);
        int var19 = var4.method632((byte) -80);
        int var20 = var4.method632((byte) -80);
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
        this.field3211 = var9;
        this.field3226 = var10;
        this.field3233 = var11;
        this.field3204 = new int[var9];
        this.field3216 = new int[var9];
        this.field3234 = new int[var9];
        this.field3188 = new int[var10];
        this.field3232 = new int[var10];
        this.field3218 = new int[var10];
        if (var11 > 0) {
            this.field3206 = new byte[var11];
            this.field3215 = new short[var11];
            this.field3199 = new short[var11];
            this.field3197 = new short[var11];
        }
        if (var16 == 1) {
            this.field3207 = new int[var9];
        }
        if (var12 == 1) {
            this.field3213 = new byte[var10];
            this.field3195 = new byte[var10];
            this.field3227 = new short[var10];
        }
        if (var13 == 255) {
            this.field3220 = new byte[var10];
        } else {
            this.field3193 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3224 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3209 = new int[var10];
        }
        this.field3219 = new short[var10];
        var4.field1924 = var21;
        var5.field1924 = var36;
        var6.field1924 = var38;
        var7.field1924 = var40;
        var8.field1924 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method646(-15447);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method641(107);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method641(88);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method641(-85);
            }
            this.field3204[var46] = var43 + var63;
            this.field3216[var46] = var44 + var64;
            this.field3234[var46] = var45 + var65;
            var43 = this.field3204[var46];
            var44 = this.field3216[var46];
            var45 = this.field3234[var46];
            if (var16 == 1) {
                this.field3207[var46] = var8.method646(-15447);
            }
        }
        var4.field1924 = var32;
        var5.field1924 = var28;
        var6.field1924 = var26;
        var7.field1924 = var30;
        var8.field1924 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field3219[var47] = (short) var4.method632((byte) -80);
            if (var12 == 1) {
                int var61 = var5.method646(-15447);
                if ((var61 & 1) == 1) {
                    this.field3213[var47] = 1;
                    var2 = true;
                } else {
                    this.field3213[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field3195[var47] = (byte) (var61 >> 2);
                    this.field3227[var47] = this.field3219[var47];
                    this.field3219[var47] = 127;
                    if (this.field3227[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3195[var47] = -1;
                    this.field3227[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3220[var47] = var6.method667(-1);
            }
            if (var14 == 1) {
                this.field3224[var47] = var7.method667(-1);
            }
            if (var15 == 1) {
                this.field3209[var47] = var8.method646(-15447);
            }
        }
        var4.field1924 = var25;
        var5.field1924 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method646(-15447);
            if (var57 == 1) {
                var48 = var4.method641(76) + var51;
                var49 = var4.method641(109) + var48;
                var50 = var4.method641(-119) + var49;
                var51 = var50;
                this.field3188[var52] = var48;
                this.field3232[var52] = var49;
                this.field3218[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method641(-118) + var51;
                var51 = var50;
                this.field3188[var52] = var48;
                this.field3232[var52] = var49;
                this.field3218[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method641(114) + var51;
                var51 = var50;
                this.field3188[var52] = var48;
                this.field3232[var52] = var49;
                this.field3218[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method641(-88) + var51;
                var51 = var50;
                this.field3188[var52] = var48;
                this.field3232[var52] = var60;
                this.field3218[var52] = var50;
            }
        }
        var4.field1924 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field3206[var53] = 0;
            this.field3215[var53] = (short) var4.method632((byte) -80);
            this.field3199[var53] = (short) var4.method632((byte) -80);
            this.field3197[var53] = (short) var4.method632((byte) -80);
        }
        if (this.field3195 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field3195[var55] & 255;
                if (var56 != 255) {
                    if ((this.field3215[var56] & 65535) == this.field3188[var55] && (this.field3199[var56] & 65535) == this.field3232[var55] && (this.field3197[var56] & 65535) == this.field3218[var55]) {
                        this.field3195[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3195 = null;
            }
        }
        if (!var3) {
            this.field3227 = null;
        }
        if (!var2) {
            this.field3213 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
    public final void method1102() {
        for (int var1 = 0; var1 < this.field3211; ++var1) {
            int var2 = this.field3234[var1];
            this.field3234[var1] = this.field3204[var1];
            this.field3204[var1] = -var2;
        }
        this.method1097();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ltd;Ltd;IIIZ)V")
    public static final void method1103(class136 arg0, class136 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1107();
        arg0.method1110();
        arg1.method1107();
        arg1.method1110();
        ++field3222;
        int var6 = 0;
        int[] var7 = arg1.field3204;
        int var8 = arg1.field3211;
        for (int var9 = 0; var9 < arg0.field3211; ++var9) {
            class132 var12 = arg0.field3214[var9];
            if (var12.field3092 != 0) {
                int var13 = arg0.field3216[var9] - arg3;
                if (var13 <= arg1.field3200) {
                    int var14 = arg0.field3204[var9] - arg2;
                    if (var14 >= arg1.field3201 && var14 <= arg1.field3208) {
                        int var15 = arg0.field3234[var9] - arg4;
                        if (var15 >= arg1.field3231 && var15 <= arg1.field3191) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class132 var17 = arg1.field3214[var16];
                                if (var7[var16] == var14 && arg1.field3234[var16] == var15 && arg1.field3216[var16] == var13 && var17.field3092 != 0) {
                                    if (arg0.field3229 == null) {
                                        arg0.field3229 = new class132[arg0.field3211];
                                    }
                                    if (arg1.field3229 == null) {
                                        arg1.field3229 = new class132[var8];
                                    }
                                    class132 var18 = arg0.field3229[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field3229[var9] = new class132(var12);
                                    }
                                    class132 var19 = arg1.field3229[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field3229[var16] = new class132(var17);
                                    }
                                    var18.field3095 += var17.field3095;
                                    var18.field3054 += var17.field3054;
                                    var18.field3080 += var17.field3080;
                                    var18.field3092 += var17.field3092;
                                    var19.field3095 += var12.field3095;
                                    var19.field3054 += var12.field3054;
                                    var19.field3080 += var12.field3080;
                                    var19.field3092 += var12.field3092;
                                    ++var6;
                                    field3189[var9] = field3222;
                                    field3205[var16] = field3222;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field3226; ++var10) {
                if (field3189[arg0.field3188[var10]] == field3222 && field3189[arg0.field3232[var10]] == field3222 && field3189[arg0.field3218[var10]] == field3222) {
                    if (arg0.field3213 == null) {
                        arg0.field3213 = new byte[arg0.field3226];
                    }
                    arg0.field3213[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field3226; ++var11) {
                if (field3205[arg1.field3188[var11]] == field3222 && field3205[arg1.field3232[var11]] == field3222 && field3205[arg1.field3218[var11]] == field3222) {
                    if (arg1.field3213 == null) {
                        arg1.field3213 = new byte[arg1.field3226];
                    }
                    arg1.field3213[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)I")
    private static final int method1104(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "()V")
    public final void method1105() {
        for (int var1 = 0; var1 < this.field3211; ++var1) {
            this.field3204[var1] = -this.field3204[var1];
            this.field3234[var1] = -this.field3234[var1];
        }
        this.method1097();
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "()V")
    public final void method1106() {
        for (int var1 = 0; var1 < this.field3211; ++var1) {
            int var2 = this.field3204[var1];
            this.field3204[var1] = this.field3234[var1];
            this.field3234[var1] = -var2;
        }
        this.method1097();
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "()V")
    private final void method1107() {
        if (!this.field3210) {
            super.field3593 = 0;
            this.field3200 = 0;
            this.field3201 = 999999;
            this.field3208 = -999999;
            this.field3191 = -99999;
            this.field3231 = 99999;
            for (int var1 = 0; var1 < this.field3211; ++var1) {
                int var2 = this.field3204[var1];
                int var3 = this.field3216[var1];
                int var4 = this.field3234[var1];
                if (var2 < this.field3201) {
                    this.field3201 = var2;
                }
                if (var2 > this.field3208) {
                    this.field3208 = var2;
                }
                if (var4 < this.field3231) {
                    this.field3231 = var4;
                }
                if (var4 > this.field3191) {
                    this.field3191 = var4;
                }
                if (-var3 > super.field3593) {
                    super.field3593 = -var3;
                }
                if (var3 > this.field3200) {
                    this.field3200 = var3;
                }
            }
            this.field3210 = true;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lsf;II)Ltd;")
    public static final class136 method1108(class131 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1023(arg2, arg1, (byte) -35);
        return var3 == null ? null : new class136(var3);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([B)V")
    private final void method1109(byte[] arg0) {
        class86 var2 = new class86(arg0);
        class86 var3 = new class86(arg0);
        class86 var4 = new class86(arg0);
        class86 var5 = new class86(arg0);
        class86 var6 = new class86(arg0);
        class86 var7 = new class86(arg0);
        class86 var8 = new class86(arg0);
        var2.field1924 = arg0.length - 23;
        int var9 = var2.method632((byte) -80);
        int var10 = var2.method632((byte) -80);
        int var11 = var2.method646(-15447);
        int var12 = var2.method646(-15447);
        int var13 = var2.method646(-15447);
        int var14 = var2.method646(-15447);
        int var15 = var2.method646(-15447);
        int var16 = var2.method646(-15447);
        int var17 = var2.method646(-15447);
        int var18 = var2.method632((byte) -80);
        int var19 = var2.method632((byte) -80);
        int var20 = var2.method632((byte) -80);
        int var21 = var2.method632((byte) -80);
        int var22 = var2.method632((byte) -80);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3206 = new byte[var11];
            var2.field1924 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field3206[var26] = var2.method667(-1);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
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
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field3211 = var9;
        this.field3226 = var10;
        this.field3233 = var11;
        this.field3204 = new int[var9];
        this.field3216 = new int[var9];
        this.field3234 = new int[var9];
        this.field3188 = new int[var10];
        this.field3232 = new int[var10];
        this.field3218 = new int[var10];
        if (var17 == 1) {
            this.field3207 = new int[var9];
        }
        if (var12 == 1) {
            this.field3213 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3220 = new byte[var10];
        } else {
            this.field3193 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3224 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3209 = new int[var10];
        }
        if (var16 == 1) {
            this.field3227 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3195 = new byte[var10];
        }
        this.field3219 = new short[var10];
        if (var11 > 0) {
            this.field3215 = new short[var11];
            this.field3199 = new short[var11];
            this.field3197 = new short[var11];
            if (var24 > 0) {
                this.field3194 = new short[var24];
                this.field3223 = new short[var24];
                this.field3230 = new short[var24];
                this.field3190 = new short[var24];
                this.field3203 = new byte[var24];
                this.field3198 = new short[var24];
            }
            if (var25 > 0) {
                this.field3217 = new short[var25];
            }
        }
        var2.field1924 = var11;
        var3.field1924 = var44;
        var4.field1924 = var46;
        var5.field1924 = var48;
        var6.field1924 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method646(-15447);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method641(-106);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method641(-114);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method641(105);
            }
            this.field3204[var67] = var64 + var82;
            this.field3216[var67] = var65 + var83;
            this.field3234[var67] = var66 + var84;
            var64 = this.field3204[var67];
            var65 = this.field3216[var67];
            var66 = this.field3234[var67];
            if (var17 == 1) {
                this.field3207[var67] = var6.method646(-15447);
            }
        }
        var2.field1924 = var42;
        var3.field1924 = var31;
        var4.field1924 = var34;
        var5.field1924 = var37;
        var6.field1924 = var35;
        var7.field1924 = var40;
        var8.field1924 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field3219[var68] = (short) var2.method632((byte) -80);
            if (var12 == 1) {
                this.field3213[var68] = var3.method667(-1);
            }
            if (var13 == 255) {
                this.field3220[var68] = var4.method667(-1);
            }
            if (var14 == 1) {
                this.field3224[var68] = var5.method667(-1);
            }
            if (var15 == 1) {
                this.field3209[var68] = var6.method646(-15447);
            }
            if (var16 == 1) {
                this.field3227[var68] = (short) (var7.method632((byte) -80) - 1);
            }
            if (this.field3195 != null && this.field3227[var68] != -1) {
                this.field3195[var68] = (byte) (var8.method646(-15447) - 1);
            }
        }
        var2.field1924 = var33;
        var3.field1924 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method646(-15447);
            if (var77 == 1) {
                var69 = var2.method641(-123) + var72;
                var70 = var2.method641(123) + var69;
                var71 = var2.method641(-121) + var70;
                var72 = var71;
                this.field3188[var73] = var69;
                this.field3232[var73] = var70;
                this.field3218[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method641(-111) + var72;
                var72 = var71;
                this.field3188[var73] = var69;
                this.field3232[var73] = var70;
                this.field3218[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method641(-78) + var72;
                var72 = var71;
                this.field3188[var73] = var69;
                this.field3232[var73] = var70;
                this.field3218[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method641(-118) + var72;
                var72 = var71;
                this.field3188[var73] = var69;
                this.field3232[var73] = var80;
                this.field3218[var73] = var71;
            }
        }
        var2.field1924 = var50;
        var3.field1924 = var52;
        var4.field1924 = var54;
        var5.field1924 = var56;
        var6.field1924 = var58;
        var7.field1924 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field3206[var74] & 255;
            if (var76 == 0) {
                this.field3215[var74] = (short) var2.method632((byte) -80);
                this.field3199[var74] = (short) var2.method632((byte) -80);
                this.field3197[var74] = (short) var2.method632((byte) -80);
            }
            if (var76 == 1) {
                this.field3215[var74] = (short) var3.method632((byte) -80);
                this.field3199[var74] = (short) var3.method632((byte) -80);
                this.field3197[var74] = (short) var3.method632((byte) -80);
                this.field3194[var74] = (short) var4.method632((byte) -80);
                this.field3223[var74] = (short) var4.method632((byte) -80);
                this.field3230[var74] = (short) var4.method632((byte) -80);
                this.field3190[var74] = (short) var5.method632((byte) -80);
                this.field3203[var74] = var6.method667(-1);
                this.field3198[var74] = (short) var7.method632((byte) -80);
            }
            if (var76 == 2) {
                this.field3215[var74] = (short) var3.method632((byte) -80);
                this.field3199[var74] = (short) var3.method632((byte) -80);
                this.field3197[var74] = (short) var3.method632((byte) -80);
                this.field3194[var74] = (short) var4.method632((byte) -80);
                this.field3223[var74] = (short) var4.method632((byte) -80);
                this.field3230[var74] = (short) var4.method632((byte) -80);
                this.field3190[var74] = (short) var5.method632((byte) -80);
                this.field3203[var74] = var6.method667(-1);
                this.field3198[var74] = (short) var7.method632((byte) -80);
                this.field3217[var74] = (short) var7.method632((byte) -80);
            }
            if (var76 == 3) {
                this.field3215[var74] = (short) var3.method632((byte) -80);
                this.field3199[var74] = (short) var3.method632((byte) -80);
                this.field3197[var74] = (short) var3.method632((byte) -80);
                this.field3194[var74] = (short) var4.method632((byte) -80);
                this.field3223[var74] = (short) var4.method632((byte) -80);
                this.field3230[var74] = (short) var4.method632((byte) -80);
                this.field3190[var74] = (short) var5.method632((byte) -80);
                this.field3203[var74] = var6.method667(-1);
                this.field3198[var74] = (short) var7.method632((byte) -80);
            }
        }
        var2.field1924 = var62;
        int var75 = var2.method646(-15447);
        if (var75 != 0) {
            new class155();
            var2.method632((byte) -80);
            var2.method632((byte) -80);
            var2.method632((byte) -80);
            var2.method666(1183700424);
        }
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "()V")
    public final void method1110() {
        if (this.field3214 == null) {
            this.field3214 = new class132[this.field3211];
            for (int var1 = 0; var1 < this.field3211; ++var1) {
                this.field3214[var1] = new class132();
            }
            for (int var2 = 0; var2 < this.field3226; ++var2) {
                int var3 = this.field3188[var2];
                int var4 = this.field3232[var2];
                int var5 = this.field3218[var2];
                int var6 = this.field3204[var4] - this.field3204[var3];
                int var7 = this.field3216[var4] - this.field3216[var3];
                int var8 = this.field3234[var4] - this.field3234[var3];
                int var9 = this.field3204[var5] - this.field3204[var3];
                int var10 = this.field3216[var5] - this.field3216[var3];
                int var11 = this.field3234[var5] - this.field3234[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field3213 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field3213[var2];
                }
                if (var19 == 0) {
                    class132 var20 = this.field3214[var3];
                    var20.field3095 += var16;
                    var20.field3054 += var17;
                    var20.field3080 += var18;
                    ++var20.field3092;
                    class132 var21 = this.field3214[var4];
                    var21.field3095 += var16;
                    var21.field3054 += var17;
                    var21.field3080 += var18;
                    ++var21.field3092;
                    class132 var22 = this.field3214[var5];
                    var22.field3095 += var16;
                    var22.field3054 += var17;
                    var22.field3080 += var18;
                    ++var22.field3092;
                } else if (var19 == 1) {
                    if (this.field3196 == null) {
                        this.field3196 = new class43[this.field3226];
                    }
                    class43 var23 = this.field3196[var2] = new class43();
                    var23.field796 = var16;
                    var23.field800 = var17;
                    var23.field793 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(SS)V")
    public final void method1111(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3226; ++var3) {
            if (this.field3219[var3] == arg0) {
                this.field3219[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(SS)V")
    public final void method1112(short arg0, short arg1) {
        if (this.field3227 != null) {
            for (int var3 = 0; var3 < this.field3226; ++var3) {
                if (this.field3227[var3] == arg0) {
                    this.field3227[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
    public final void method1113(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3211; ++var4) {
            this.field3204[var4] += arg0;
            this.field3216[var4] += arg1;
            this.field3234[var4] += arg2;
        }
        this.method1097();
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)I")
    private static final int method1114(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
    public final void method1115(int arg0) {
        int var2 = field3192[arg0];
        int var3 = field3202[arg0];
        for (int var4 = 0; var4 < this.field3211; ++var4) {
            int var5 = this.field3234[var4] * var2 + this.field3204[var4] * var3 >> 16;
            this.field3234[var4] = this.field3234[var4] * var3 - this.field3204[var4] * var2 >> 16;
            this.field3204[var4] = var5;
        }
        this.method1097();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([[IIIIZI)Ltd;")
    public final class136 method1116(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1107();
        int var7 = this.field3201 + arg1;
        int var8 = this.field3208 + arg1;
        int var9 = this.field3231 + arg3;
        int var10 = this.field3191 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class136 var15;
                if (arg4) {
                    var15 = new class136();
                    var15.field3211 = this.field3211;
                    var15.field3226 = this.field3226;
                    var15.field3233 = this.field3233;
                    var15.field3204 = this.field3204;
                    var15.field3234 = this.field3234;
                    var15.field3188 = this.field3188;
                    var15.field3232 = this.field3232;
                    var15.field3218 = this.field3218;
                    var15.field3213 = this.field3213;
                    var15.field3220 = this.field3220;
                    var15.field3224 = this.field3224;
                    var15.field3195 = this.field3195;
                    var15.field3219 = this.field3219;
                    var15.field3227 = this.field3227;
                    var15.field3193 = this.field3193;
                    var15.field3206 = this.field3206;
                    var15.field3215 = this.field3215;
                    var15.field3199 = this.field3199;
                    var15.field3197 = this.field3197;
                    var15.field3194 = this.field3194;
                    var15.field3223 = this.field3223;
                    var15.field3230 = this.field3230;
                    var15.field3190 = this.field3190;
                    var15.field3203 = this.field3203;
                    var15.field3198 = this.field3198;
                    var15.field3217 = this.field3217;
                    var15.field3207 = this.field3207;
                    var15.field3209 = this.field3209;
                    var15.field3228 = this.field3228;
                    var15.field3225 = this.field3225;
                    var15.field3221 = this.field3221;
                    var15.field3212 = this.field3212;
                    var15.field3216 = new int[var15.field3211];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field3211; ++var16) {
                        int var17 = this.field3204[var16] + arg1;
                        int var18 = this.field3234[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field3216[var16] = this.field3216[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field3211; ++var26) {
                        int var27 = (-this.field3216[var26] << 16) / super.field3593;
                        if (var27 < arg5) {
                            int var28 = this.field3204[var26] + arg1;
                            int var29 = this.field3234[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field3216[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field3216[var26];
                        }
                    }
                }
                var15.method1097();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ltd;I)I")
    private final int method1117(class136 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3204[arg1];
        int var5 = arg0.field3216[arg1];
        int var6 = arg0.field3234[arg1];
        for (int var7 = 0; var7 < this.field3211; ++var7) {
            if (this.field3204[var7] == var4 && this.field3216[var7] == var5 && this.field3234[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3204[this.field3211] = var4;
            this.field3216[this.field3211] = var5;
            this.field3234[this.field3211] = var6;
            if (arg0.field3207 != null) {
                this.field3207[this.field3211] = arg0.field3207[arg1];
            }
            var3 = this.field3211++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "()V")
    public final void method1118() {
        for (int var1 = 0; var1 < this.field3211; ++var1) {
            this.field3234[var1] = -this.field3234[var1];
        }
        for (int var2 = 0; var2 < this.field3226; ++var2) {
            int var3 = this.field3188[var2];
            this.field3188[var2] = this.field3218[var2];
            this.field3218[var2] = var3;
        }
        this.method1097();
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "()V")
    public static void method1119() {
        field3189 = null;
        field3205 = null;
        field3192 = null;
        field3202 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    private class136() {
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
    private class136(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1109(arg0);
        } else {
            this.method1101(arg0);
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([Ltd;I)V")
    public class136(class136[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3211 = 0;
        this.field3226 = 0;
        this.field3233 = 0;
        this.field3193 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class136 var15 = arg0[var9];
            if (var15 != null) {
                this.field3211 += var15.field3211;
                this.field3226 += var15.field3226;
                this.field3233 += var15.field3233;
                if (var15.field3220 != null) {
                    var4 = true;
                } else {
                    if (this.field3193 == -1) {
                        this.field3193 = var15.field3193;
                    }
                    if (this.field3193 != var15.field3193) {
                        var4 = true;
                    }
                }
                var3 |= var15.field3213 != null;
                var5 |= var15.field3224 != null;
                var6 |= var15.field3209 != null;
                var7 |= var15.field3227 != null;
                var8 |= var15.field3195 != null;
            }
        }
        this.field3204 = new int[this.field3211];
        this.field3216 = new int[this.field3211];
        this.field3234 = new int[this.field3211];
        this.field3207 = new int[this.field3211];
        this.field3188 = new int[this.field3226];
        this.field3232 = new int[this.field3226];
        this.field3218 = new int[this.field3226];
        if (var3) {
            this.field3213 = new byte[this.field3226];
        }
        if (var4) {
            this.field3220 = new byte[this.field3226];
        }
        if (var5) {
            this.field3224 = new byte[this.field3226];
        }
        if (var6) {
            this.field3209 = new int[this.field3226];
        }
        if (var7) {
            this.field3227 = new short[this.field3226];
        }
        if (var8) {
            this.field3195 = new byte[this.field3226];
        }
        this.field3219 = new short[this.field3226];
        if (this.field3233 > 0) {
            this.field3206 = new byte[this.field3233];
            this.field3215 = new short[this.field3233];
            this.field3199 = new short[this.field3233];
            this.field3197 = new short[this.field3233];
            this.field3194 = new short[this.field3233];
            this.field3223 = new short[this.field3233];
            this.field3230 = new short[this.field3233];
            this.field3190 = new short[this.field3233];
            this.field3203 = new byte[this.field3233];
            this.field3198 = new short[this.field3233];
            this.field3217 = new short[this.field3233];
        }
        this.field3211 = 0;
        this.field3226 = 0;
        this.field3233 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class136 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3226; ++var12) {
                    if (var3 && var11.field3213 != null) {
                        this.field3213[this.field3226] = var11.field3213[var12];
                    }
                    if (var4) {
                        if (var11.field3220 != null) {
                            this.field3220[this.field3226] = var11.field3220[var12];
                        } else {
                            this.field3220[this.field3226] = var11.field3193;
                        }
                    }
                    if (var5 && var11.field3224 != null) {
                        this.field3224[this.field3226] = var11.field3224[var12];
                    }
                    if (var6 && var11.field3209 != null) {
                        this.field3209[this.field3226] = var11.field3209[var12];
                    }
                    if (var7) {
                        if (var11.field3227 != null) {
                            this.field3227[this.field3226] = var11.field3227[var12];
                        } else {
                            this.field3227[this.field3226] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field3195 != null && var11.field3195[var12] != -1) {
                            this.field3195[this.field3226] = (byte) (var11.field3195[var12] + this.field3233);
                        } else {
                            this.field3195[this.field3226] = -1;
                        }
                    }
                    this.field3219[this.field3226] = var11.field3219[var12];
                    this.field3188[this.field3226] = this.method1117(var11, var11.field3188[var12]);
                    this.field3232[this.field3226] = this.method1117(var11, var11.field3232[var12]);
                    this.field3218[this.field3226] = this.method1117(var11, var11.field3218[var12]);
                    ++this.field3226;
                }
                for (int var13 = 0; var13 < var11.field3233; ++var13) {
                    byte var14 = this.field3206[this.field3233] = var11.field3206[var13];
                    if (var14 == 0) {
                        this.field3215[this.field3233] = (short) this.method1117(var11, var11.field3215[var13]);
                        this.field3199[this.field3233] = (short) this.method1117(var11, var11.field3199[var13]);
                        this.field3197[this.field3233] = (short) this.method1117(var11, var11.field3197[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field3215[this.field3233] = var11.field3215[var13];
                        this.field3199[this.field3233] = var11.field3199[var13];
                        this.field3197[this.field3233] = var11.field3197[var13];
                        this.field3194[this.field3233] = var11.field3194[var13];
                        this.field3223[this.field3233] = var11.field3223[var13];
                        this.field3230[this.field3233] = var11.field3230[var13];
                        this.field3190[this.field3233] = var11.field3190[var13];
                        this.field3203[this.field3233] = var11.field3203[var13];
                        this.field3198[this.field3233] = var11.field3198[var13];
                    }
                    if (var14 == 2) {
                        this.field3217[this.field3233] = var11.field3217[var13];
                    }
                    ++this.field3233;
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ltd;ZZZZ)V")
    public class136(class136 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3211 = arg0.field3211;
        this.field3226 = arg0.field3226;
        this.field3233 = arg0.field3233;
        if (arg1) {
            this.field3204 = arg0.field3204;
            this.field3216 = arg0.field3216;
            this.field3234 = arg0.field3234;
        } else {
            this.field3204 = new int[this.field3211];
            this.field3216 = new int[this.field3211];
            this.field3234 = new int[this.field3211];
            for (int var6 = 0; var6 < this.field3211; ++var6) {
                this.field3204[var6] = arg0.field3204[var6];
                this.field3216[var6] = arg0.field3216[var6];
                this.field3234[var6] = arg0.field3234[var6];
            }
        }
        if (arg2) {
            this.field3219 = arg0.field3219;
        } else {
            this.field3219 = new short[this.field3226];
            for (int var7 = 0; var7 < this.field3226; ++var7) {
                this.field3219[var7] = arg0.field3219[var7];
            }
        }
        if (!arg3 && arg0.field3227 != null) {
            this.field3227 = new short[this.field3226];
            for (int var8 = 0; var8 < this.field3226; ++var8) {
                this.field3227[var8] = arg0.field3227[var8];
            }
        } else {
            this.field3227 = arg0.field3227;
        }
        if (arg4) {
            this.field3224 = arg0.field3224;
        } else {
            this.field3224 = new byte[this.field3226];
            if (arg0.field3224 == null) {
                for (int var9 = 0; var9 < this.field3226; ++var9) {
                    this.field3224[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3226; ++var10) {
                    this.field3224[var10] = arg0.field3224[var10];
                }
            }
        }
        this.field3188 = arg0.field3188;
        this.field3232 = arg0.field3232;
        this.field3218 = arg0.field3218;
        this.field3213 = arg0.field3213;
        this.field3220 = arg0.field3220;
        this.field3195 = arg0.field3195;
        this.field3193 = arg0.field3193;
        this.field3206 = arg0.field3206;
        this.field3215 = arg0.field3215;
        this.field3199 = arg0.field3199;
        this.field3197 = arg0.field3197;
        this.field3194 = arg0.field3194;
        this.field3223 = arg0.field3223;
        this.field3230 = arg0.field3230;
        this.field3190 = arg0.field3190;
        this.field3203 = arg0.field3203;
        this.field3198 = arg0.field3198;
        this.field3217 = arg0.field3217;
        this.field3207 = arg0.field3207;
        this.field3209 = arg0.field3209;
        this.field3228 = arg0.field3228;
        this.field3225 = arg0.field3225;
        this.field3214 = arg0.field3214;
        this.field3196 = arg0.field3196;
        this.field3229 = arg0.field3229;
        this.field3221 = arg0.field3221;
        this.field3212 = arg0.field3212;
    }
}
