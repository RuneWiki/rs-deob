import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class216 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "[Z")
    public static boolean[] field3518 = new boolean[100];

    @OriginalMember(owner = "client!td", name = "q", descriptor = "[I")
    public static int[] field3528 = new int[1000];

    @OriginalMember(owner = "client!td", name = "m", descriptor = "[Lse;")
    public static class91[] field3524 = new class91[100];

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "J")
    private long field3525;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "J")
    private long field3531;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Z")
    public boolean field3521;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[I")
    private int[] field3515;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "[I")
    private int[] field3520;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[[Lvk;")
    public static class192[][] field3514;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lug;IBII)Lfc;", line = 5)
    public final class152 method1493(class190 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3513++;
        if (arg2 > -14) {
            this.method1503(-42, -54, 81);
        }
        long var6 = (long) arg3 | (long) arg3 << 32 | (long) (arg4 << 16);
        class152 var8 = (class152) class291.field4883.method1424(var6, (byte) 93);
        if (var8 == null) {
            int var9 = 0;
            class208[] var10 = new class208[2];
            if (!class51.method285(arg3, true).method2040((byte) -118) || !class51.method285(arg4, true).method2040((byte) -123)) {
                return null;
            }
            class208 var11 = class51.method285(arg3, true).method2045(false);
            if (var11 != null) {
                var10[var9++] = var11;
            }
            class208 var12 = class51.method285(arg4, true).method2045(false);
            if (var12 != null) {
                var10[var9++] = var12;
            }
            class208 var13 = new class208(var10, var9);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class101.field1573[var14].length > this.field3515[var14]) {
                    var13.method1457(class62.field823[var14], class101.field1573[var14][this.field3515[var14]]);
                }
                if (class204.field3351[var14].length > this.field3515[var14]) {
                    var13.method1457(class296.field5006[var14], class204.field3351[var14][this.field3515[var14]]);
                }
            }
            var8 = var13.method1446(64, 768, -50, -10, -50);
            class291.field4883.method1430(var8, var6, 13487);
        }
        if (arg0 != null) {
            var8 = arg0.method1339(var8, arg1, 1978883312);
        }
        return var8;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V", line = 71)
    public static void method1494(boolean arg0) {
        if (arg0) {
            method1502(52, -3, -69);
        }
        field3524 = null;
        field3518 = null;
        field3514 = (class192[][]) null;
        field3528 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 84)
    public static final void method1495(int arg0, int arg1) {
        field3530++;
        class291.field4895 = arg1;
        class148.field2293 = -1;
        class238.field3846 = -1;
        int var2 = -58 % ((-arg0 - 25) / 56);
        class162.method1145((byte) -122);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I", line = 97)
    public final int method1496(int arg0) {
        if (arg0 != 2) {
            field3518 = (boolean[]) null;
        }
        field3519++;
        return this.field3522 == -1 ? (this.field3520[8] << 10) + (this.field3520[0] << 15) + (this.field3515[4] << 20) + ((this.field3520[11] << 5) + (this.field3515[0] << 25) - -this.field3520[1]) : class19.method87((byte) -49, this.field3522).field3210 + 305419896;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 117)
    private final void method1497(byte arg0) {
        long[] var2 = class132.field2068;
        long var3 = this.field3531;
        field3512++;
        this.field3531 = -1L;
        if (arg0 <= 65) {
            this.method1496(-94);
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3531 = this.field3531 >>> 8 ^ var2[(int) ((this.field3531 ^ (long) (this.field3520[var5] >> 24)) & 0xFFL)];
            this.field3531 = var2[(int) (((long) (this.field3520[var5] >> 16) ^ this.field3531) & 0xFFL)] ^ this.field3531 >>> 8;
            this.field3531 = var2[(int) (((long) (this.field3520[var5] >> 8) ^ this.field3531) & 0xFFL)] ^ this.field3531 >>> 8;
            this.field3531 = this.field3531 >>> 8 ^ var2[(int) (((long) this.field3520[var5] ^ this.field3531) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3531 = var2[(int) (((long) this.field3515[var6] ^ this.field3531) & 0xFFL)] ^ this.field3531 >>> 8;
        }
        this.field3531 = this.field3531 >>> 8 ^ var2[(int) ((this.field3531 ^ (long) (this.field3521 ? 1 : 0)) & 0xFFL)];
        if (var3 != 0L && this.field3531 != var3) {
            class256.field4359.method1426(var3, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lug;IZILug;)Lfc;", line = 158)
    public final class152 method1498(class190 arg0, int arg1, boolean arg2, int arg3, class190 arg4) {
        field3532++;
        if (this.field3522 != -1) {
            return class19.method87((byte) 72, this.field3522).method1386(arg3, arg0, arg4, arg1, (byte) 124);
        }
        long var6 = this.field3531;
        int[] var8 = this.field3520;
        if (arg4 != null && (arg4.field3093 >= 0 || arg4.field3082 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3520[var9];
            }
            if (arg4.field3093 >= 0) {
                if (arg4.field3093 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class80.method492(arg4.field3093, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg4.field3082 >= 0) {
                if (arg4.field3082 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class80.method492(arg4.field3082, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class152 var10 = (class152) class256.field4359.method1424(var6, (byte) 77);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var8[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var13) != 0 && !class51.method285(var13 & 0x3FFFFFFF, true).method2039(-119)) {
                        var11 = true;
                    }
                } else if (!class284.method1963((byte) 107, var13 & 0x3FFFFFFF).method1606(this.field3521, 3584)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3525 != -1L) {
                    var10 = (class152) class256.field4359.method1424(this.field3525, (byte) 110);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var14 = 0;
                class208[] var15 = new class208[12];
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var8[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class208 var19 = class284.method1963((byte) 111, var17 & 0x3FFFFFFF).method1600((byte) -92, this.field3521);
                        if (var19 != null) {
                            var15[var14++] = var19;
                        }
                    } else if ((var17 & Integer.MIN_VALUE) != 0) {
                        class208 var18 = class51.method285(var17 & 0x3FFFFFFF, true).method2044((byte) -109);
                        if (var18 != null) {
                            var15[var14++] = var18;
                        }
                    }
                }
                int var20 = var8[0];
                if ((var20 & 0x40000000) != 0) {
                    class238 var21 = class284.method1963((byte) -123, var20 & 0x3FFFFFFF);
                    if (var21.field3854 != null) {
                        for (int var22 = 0; var22 < var21.field3854.length; var22++) {
                            if (var21.field3854[var22] != null && var15[var22 + 1] != null) {
                                int var23 = var21.field3854[var22][0];
                                int var24 = var21.field3854[var22][2];
                                int var25 = var21.field3854[var22][1];
                                int var26 = var21.field3854[var22][3];
                                int var27 = var21.field3854[var22][4];
                                int var28 = var21.field3854[var22][5];
                                var15[var22 + 1].method1460(var23, var25, var24);
                                var15[var22 + 1].method1455(var26, var27, var28);
                            }
                        }
                    }
                }
                class208 var29 = new class208(var15, var14);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (this.field3515[var30] < class101.field1573[var30].length) {
                        var29.method1457(class62.field823[var30], class101.field1573[var30][this.field3515[var30]]);
                    }
                    if (class204.field3351[var30].length > this.field3515[var30]) {
                        var29.method1457(class296.field5006[var30], class204.field3351[var30][this.field3515[var30]]);
                    }
                }
                var10 = var29.method1446(64, 850, -30, -50, -30);
                ((class93) var10).method696(false, false, true, true, false, false, true);
                class256.field4359.method1430(var10, var6, 13487);
                this.field3525 = var6;
            }
        }
        if (arg4 == null && arg0 == null) {
            return var10;
        }
        class152 var31;
        if (arg4 != null && arg0 != null) {
            var31 = arg4.method1345(var10, arg1, arg0, arg3, (byte) -69);
        } else if (arg4 == null) {
            var31 = arg0.method1337(var10, (byte) 69, arg1);
        } else {
            var31 = arg4.method1337(var10, (byte) 69, arg3);
        }
        return arg2 ? (class152) null : var31;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V", line = 387)
    public final void method1499(int arg0, boolean arg1) {
        field3523++;
        this.field3521 = arg1;
        if (arg0 <= 34) {
            this.method1497((byte) 112);
        }
        this.method1497((byte) 114);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILug;B)Lfc;", line = 405)
    public final class152 method1500(int arg0, class190 arg1, byte arg2) {
        field3527++;
        int var4 = -45 % ((-arg2 - 44) / 34);
        if (this.field3522 != -1) {
            return class19.method87((byte) -72, this.field3522).method1378(arg1, arg0, -82);
        }
        class152 var5 = (class152) class291.field4883.method1424(this.field3531, (byte) 127);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < 12; var7++) {
                int var8 = this.field3520[var7];
                if ((var8 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var8) != 0 && !class51.method285(var8 & 0x3FFFFFFF, true).method2040((byte) -116)) {
                        var6 = true;
                    }
                } else if (!class284.method1963((byte) -109, var8 & 0x3FFFFFFF).method1619(this.field3521, -16084)) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            class208[] var9 = new class208[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = this.field3520[var11];
                if ((var12 & 0x40000000) != 0) {
                    class208 var13 = class284.method1963((byte) -57, var12 & 0x3FFFFFFF).method1602((byte) -82, this.field3521);
                    if (var13 != null) {
                        var9[var10++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class208 var14 = class51.method285(var12 & 0x3FFFFFFF, true).method2045(false);
                    if (var14 != null) {
                        var9[var10++] = var14;
                    }
                }
            }
            class208 var15 = new class208(var9, var10);
            for (int var16 = 0; var16 < 5; var16++) {
                if (this.field3515[var16] < class101.field1573[var16].length) {
                    var15.method1457(class62.field823[var16], class101.field1573[var16][this.field3515[var16]]);
                }
                if (class204.field3351[var16].length > this.field3515[var16]) {
                    var15.method1457(class296.field5006[var16], class204.field3351[var16][this.field3515[var16]]);
                }
            }
            var5 = var15.method1446(64, 768, -50, -10, -50);
            class291.field4883.method1430(var5, this.field3531, 13487);
        }
        if (arg1 != null) {
            var5 = arg1.method1339(var5, arg0, 1978883312);
        }
        return var5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([IZ[IIZ)V", line = 523)
    public final void method1501(int[] arg0, boolean arg1, int[] arg2, int arg3, boolean arg4) {
        field3529++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class217.field3541; var7++) {
                    class298 var8 = class51.method285(var7, true);
                    if (var8 != null && !var8.field5037 && ((arg4 ? 7 : 0) + var6) == var8.field5036) {
                        arg2[class231.field3720[var6]] = class80.method492(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field3515 = arg0;
        this.field3521 = arg4;
        this.field3522 = arg3;
        this.field3520 = arg2;
        if (!arg1) {
            method1495(-125, 33);
        }
        this.method1497((byte) 85);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I", line = 586)
    public static final int method1502(int arg0, int arg1, int arg2) {
        field3526++;
        int var3 = 0;
        while (arg0 > 0) {
            arg0--;
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
        }
        return arg1 <= 68 ? 3 : var3;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V", line = 612)
    public final void method1503(int arg0, int arg1, int arg2) {
        if (arg2 == 1073741823) {
            field3516++;
            this.field3515[arg1] = arg0;
            this.method1497((byte) 120);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)V", line = 629)
    public final void method1504(int arg0, int arg1, byte arg2) {
        int var4 = 53 / ((-arg2 - 43) / 45);
        int var5 = class231.field3720[arg1];
        field3517++;
        if (this.field3520[var5] != 0 && class51.method285(arg0, true) != null) {
            this.field3520[var5] = class80.method492(arg0, Integer.MIN_VALUE);
            this.method1497((byte) 105);
        }
    }
}
