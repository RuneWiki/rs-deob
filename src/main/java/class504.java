import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class504 {

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public int field7405;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "Lfg;")
    public static class83 field7411 = new class83("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "Lff;")
    public static class9 field7413 = new class9(4);

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "Ljm;")
    public static class485 field7414 = new class485(47, 15);

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "[I")
    public static int[] field7417 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "[I")
    public static int[] field7415 = new int[2];

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public int field7398;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public int field7399;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public int field7400;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "Lhm;")
    public static class146 field7419;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "Ljp;")
    public static class236 field7416;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "Lqt;")
    public class450 field7406;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "[I")
    public int[] field7393;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "[I")
    public int[] field7397;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "[I")
    public int[] field7401;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "[I")
    public int[] field7407;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "[I")
    public int[] field7408;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "[I")
    public int[] field7409;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "[Lqt;")
    public class450[] field7412;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "[Lf;")
    public static class529[] field7418;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "[[I")
    public int[][] field7396;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "[[I")
    public int[][] field7402;

    static {
        new class83(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        field7420 = 0;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z[B)V", line = 6)
    private final void method2960(boolean arg0, byte[] arg1) {
        field7394++;
        class365 var3 = new class365(class254.method1493(!arg0, arg1));
        int var4 = var3.method2099(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field7400 = 0;
        } else {
            this.field7400 = var3.method2056((byte) -47);
        }
        int var5 = var3.method2099(255);
        this.field7398 = var3.method2062((byte) 14);
        int var6 = 0;
        this.field7397 = new int[this.field7398];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field7398; var8++) {
            this.field7397[var8] = var6 += var3.method2062((byte) 14);
            if (this.field7397[var8] > var7) {
                var7 = this.field7397[var8];
            }
        }
        this.field7399 = var7 + 1;
        this.field7402 = new int[this.field7399][];
        this.field7401 = new int[this.field7399];
        this.field7393 = new int[this.field7399];
        this.field7407 = new int[this.field7399];
        this.field7408 = new int[this.field7399];
        if (!arg0) {
            return;
        }
        if (var5 != 0) {
            this.field7409 = new int[this.field7399];
            for (int var9 = 0; var9 < this.field7399; var9++) {
                this.field7409[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field7398; var10++) {
                this.field7409[this.field7397[var10]] = var3.method2056((byte) -86);
            }
            this.field7406 = new class450(this.field7409);
        }
        for (int var11 = 0; var11 < this.field7398; var11++) {
            this.field7393[this.field7397[var11]] = var3.method2056((byte) 87);
        }
        for (int var12 = 0; var12 < this.field7398; var12++) {
            this.field7408[this.field7397[var12]] = var3.method2056((byte) 101);
        }
        for (int var13 = 0; var13 < this.field7398; var13++) {
            this.field7401[this.field7397[var13]] = var3.method2062((byte) 14);
        }
        for (int var14 = 0; var14 < this.field7398; var14++) {
            int var21 = this.field7397[var14];
            int var22 = this.field7401[var21];
            int var23 = 0;
            int var24 = -1;
            this.field7402[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field7402[var21][var25] = var23 += var3.method2062((byte) 14);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field7407[var21] = var24 + 1;
            if ((var24 + 1) == var22) {
                this.field7402[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field7412 = new class450[var7 + 1];
        this.field7396 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field7398; var15++) {
            int var16 = this.field7397[var15];
            int var17 = this.field7401[var16];
            this.field7396[var16] = new int[this.field7407[var16]];
            for (int var18 = 0; var18 < this.field7407[var16]; var18++) {
                this.field7396[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field7402[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field7402[var16][var19];
                }
                this.field7396[var16][var20] = var3.method2056((byte) 97);
            }
            this.field7412[var16] = new class450(this.field7396[var16]);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 178)
    public static void method2961(int arg0) {
        field7419 = null;
        if (arg0 != 26662) {
            field7413 = null;
        }
        field7413 = null;
        field7414 = null;
        field7415 = null;
        field7417 = null;
        field7416 = null;
        field7418 = null;
        field7411 = null;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V", line = 199)
    public static final void method2962(int arg0) {
        class356.method1978((byte) 114, class526.field7717);
        field7404++;
        class116.field1569++;
        if (arg0 == 13227) {
            class244.field3395.method2070(81954016, class514.field7551);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 216)
    public static final void method2963(boolean arg0) {
        field7410++;
        int var1 = class350.field4790 * 128 + 64;
        int var2 = class34.field485 * 128 + 64;
        int var3 = class186.method1118(var1, var2, 12840, class400.field5571) - class463.field6721;
        if (class13.field151 < 100) {
            if (var1 > class132.field1901) {
                class132.field1901 += class226.field3179 + ((var1 - class132.field1901) * class13.field151 / 1000);
                if (var1 < class132.field1901) {
                    class132.field1901 = var1;
                }
            }
            if (var1 < class132.field1901) {
                class132.field1901 -= (class132.field1901 - var1) * class13.field151 / 1000 + class226.field3179;
                if (var1 > class132.field1901) {
                    class132.field1901 = var1;
                }
            }
            if (class526.field7729 < var3) {
                class526.field7729 += (var3 - class526.field7729) * class13.field151 / 1000 + class226.field3179;
                if (var3 < class526.field7729) {
                    class526.field7729 = var3;
                }
            }
            if (class526.field7729 > var3) {
                class526.field7729 -= (class526.field7729 - var3) * class13.field151 / 1000 + class226.field3179;
                if (class526.field7729 < var3) {
                    class526.field7729 = var3;
                }
            }
            if (class310.field4240 < var2) {
                class310.field4240 += class226.field3179 + ((var2 - class310.field4240) * class13.field151 / 1000);
                if (var2 < class310.field4240) {
                    class310.field4240 = var2;
                }
            }
            if (class310.field4240 > var2) {
                class310.field4240 -= (class310.field4240 - var2) * class13.field151 / 1000 + class226.field3179;
                if (class310.field4240 < var2) {
                    class310.field4240 = var2;
                }
            }
        } else {
            class132.field1901 = class350.field4790 * 128 + 64;
            class310.field4240 = class34.field485 * 128 + 64;
            class526.field7729 = class186.method1118(class132.field1901, class310.field4240, 12840, class400.field5571) - class463.field6721;
        }
        if (arg0) {
            field7414 = null;
        }
        int var4 = class412.field6044 * 128 + 64;
        int var5 = class133.field1934 * 128 + 64;
        int var6 = class186.method1118(var4, var5, 12840, class400.field5571) - class477.field6983;
        int var7 = var4 - class132.field1901;
        int var8 = var6 - class526.field7729;
        int var9 = var5 - class310.field4240;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class476.field6958) {
            class476.field6958 += class485.field7106 + ((var11 - class476.field6958 >> 3) * class330.field4501 / 1000) << 3;
            if (var11 < class476.field6958) {
                class476.field6958 = var11;
            }
        }
        if (class476.field6958 > var11) {
            class476.field6958 -= (class476.field6958 - var11 >> 3) * class330.field4501 / 1000 + class485.field7106 << 3;
            if (var11 > class476.field6958) {
                class476.field6958 = var11;
            }
        }
        int var13 = var12 - class208.field2951;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class208.field2951 += class330.field4501 * var14 / 1000 + class485.field7106 << 3;
            class208.field2951 &= 0x3FFF;
        }
        if (var14 < 0) {
            class208.field2951 -= -var14 * class330.field4501 / 1000 + class485.field7106 << 3;
            class208.field2951 &= 0x3FFF;
        }
        int var15 = var12 - class208.field2951;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class250.field3483 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class208.field2951 = var12;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIBIZII)V", line = 383)
    public static final void method2964(boolean arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 < arg3) {
            int var7 = (arg3 + arg5) / 2;
            int var8 = arg5;
            class320 var9 = class1.field10[var7];
            class1.field10[var7] = class1.field10[arg3];
            class1.field10[arg3] = var9;
            for (int var10 = arg5; var10 < arg3; var10++) {
                if (class388.method2233(var9, class1.field10[var10], arg4, arg0, arg6, 376, arg1) <= 0) {
                    class320 var11 = class1.field10[var10];
                    class1.field10[var10] = class1.field10[var8];
                    class1.field10[var8++] = var11;
                }
            }
            class1.field10[arg3] = class1.field10[var8];
            class1.field10[var8] = var9;
            method2964(arg0, arg1, (byte) -70, var8 - 1, arg4, arg5, arg6);
            method2964(arg0, arg1, (byte) -81, arg3, arg4, var8 + 1, arg6);
        }
        field7395++;
        if (arg2 >= -8) {
            field7419 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "([BI)V", line = 429)
    public class504(byte[] arg0, int arg1) {
        this.field7405 = class287.method1636(arg0.length, arg0, -8849);
        if (this.field7405 != arg1) {
            throw new RuntimeException();
        }
        this.method2960(true, arg0);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILkj;)I", line = 454)
    public static final int method2965(int arg0, int arg1, class397 arg2) {
        if (arg0 > -57) {
            method2964(false, -89, (byte) -114, -8, true, 84, 1);
        }
        field7403++;
        return -1;
    }
}
