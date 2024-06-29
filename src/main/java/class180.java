import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class180 {

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3076 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Z")
    public static boolean field3093 = true;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "J")
    private long field3074;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "J")
    private long field3081;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Lmf;")
    public static class10 field3092;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Z")
    public boolean field3079;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "[I")
    private int[] field3078;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "[I")
    private int[] field3082;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "[Lqf;")
    public static class232[] field3094;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldb;III)V")
    public static final void method1232(class17 arg0, int arg1, int arg2, int arg3) {
        field3083++;
        if (arg0.field1056 == arg1 && arg1 != -1) {
            class106 var4 = class101.method704(1, arg1);
            int var5 = var4.field1852;
            if (var5 == 1) {
                arg0.field1044 = 0;
                arg0.field1053 = arg2;
                arg0.field1061 = 0;
                arg0.field1069 = 0;
                class163.method1080(var4, arg0.field1042, arg0.field1027, arg0.field1044, 21983, false);
            }
            if (var5 == 2) {
                arg0.field1061 = 0;
            }
        } else if (arg1 == -1 || arg0.field1056 == -1 || class101.method704(1, arg1).field1876 >= class101.method704(1, arg0.field1056).field1876) {
            arg0.field1063 = arg0.field1030;
            arg0.field1069 = 0;
            arg0.field1053 = arg2;
            arg0.field1044 = 0;
            arg0.field1056 = arg1;
            arg0.field1061 = 0;
            if (arg0.field1056 != -1) {
                class163.method1080(class101.method704(1, arg0.field1056), arg0.field1042, arg0.field1027, arg0.field1044, 21983, false);
            }
        }
        if (arg3 <= 104) {
            field3094 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILde;)Lwb;")
    public final class26 method1233(int arg0, int arg1, int arg2, int arg3, class106 arg4) {
        field3075++;
        long var6 = (long) (arg1 << 16) | (long) arg2 << 32 | (long) arg2;
        class26 var8 = (class26) class221.field3875.method1269(var6, (byte) 50);
        if (var8 == null) {
            int var9 = 0;
            class165[] var10 = new class165[2];
            if (!class211.method1453(false, arg2).method1056(2958) || !class211.method1453(false, arg1).method1056(2958)) {
                return null;
            }
            class165 var11 = class211.method1453(false, arg2).method1058((byte) -83);
            if (var11 != null) {
                var10[var9++] = var11;
            }
            class165 var12 = class211.method1453(false, arg1).method1058((byte) -31);
            if (var12 != null) {
                var10[var9++] = var12;
            }
            class165 var13 = new class165(var10, var9);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field3078[var14] < class177.field3034[var14].length) {
                    var13.method1113(class268.field4764[var14], class177.field3034[var14][this.field3078[var14]]);
                }
                if (class34.field502[var14].length > this.field3078[var14]) {
                    var13.method1113(class168.field2895[var14], class34.field502[var14][this.field3078[var14]]);
                }
            }
            var8 = var13.method1085(64, 768, -50, -10, -50);
            class221.field3875.method1271(-15561, var8, var6);
        }
        if (arg4 != null) {
            var8 = arg4.method730(-1092982864, arg0, var8);
        }
        if (arg3 != 828418928) {
            this.field3082 = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILde;)Lwb;")
    public final class26 method1234(byte arg0, int arg1, class106 arg2) {
        field3089++;
        if (arg0 != 108) {
            this.field3074 = 99L;
        }
        if (this.field3090 != -1) {
            return class55.method370(true, this.field3090).method1804(arg2, (byte) 10, arg1);
        }
        class26 var4 = (class26) class221.field3875.method1269(this.field3074, (byte) 118);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field3082[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class211.method1453(false, var15 & 0x3FFFFFFF).method1056(2958)) {
                        var5 = true;
                    }
                } else if (!class32.method221(11649, var15 & 0x3FFFFFFF).method410(this.field3079, (byte) 96)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class165[] var7 = new class165[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field3082[var9];
                if ((var12 & 0x40000000) != 0) {
                    class165 var13 = class32.method221(11649, var12 & 0x3FFFFFFF).method408(-3, this.field3079);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class165 var14 = class211.method1453(false, var12 & 0x3FFFFFFF).method1058((byte) -51);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class165 var10 = new class165(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class177.field3034[var11].length > this.field3078[var11]) {
                    var10.method1113(class268.field4764[var11], class177.field3034[var11][this.field3078[var11]]);
                }
                if (class34.field502[var11].length > this.field3078[var11]) {
                    var10.method1113(class168.field2895[var11], class34.field502[var11][this.field3078[var11]]);
                }
            }
            var4 = var10.method1085(64, 768, -50, -10, -50);
            class221.field3875.method1271(arg0 ^ 0xFFFFC35B, var4, this.field3074);
        }
        if (arg2 != null) {
            var4 = arg2.method730(-1092982864, arg1, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
    public final void method1235(int arg0, int arg1, int arg2) {
        field3087++;
        this.field3078[arg0] = arg1;
        this.method1242(arg2 ^ 0x35);
        if (arg2 != 0) {
            field3094 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIILqb;IZJ)Z")
    public static final boolean method1236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class56 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class245.field4193 == class135.field2348;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class122.field2140 || var24 >= class202.field3521) {
                    return false;
                }
                class208 var25 = class99.field1780[arg0][var15][var24];
                if (var25 != null && var25.field3646 >= 5) {
                    return false;
                }
            }
        }
        class213 var16 = new class213();
        var16.field3728 = arg11;
        var16.field3727 = arg0;
        var16.field3721 = arg5;
        var16.field3736 = arg6;
        var16.field3739 = arg7;
        var16.field3724 = arg8;
        var16.field3735 = arg9;
        var16.field3731 = arg1;
        var16.field3729 = arg2;
        var16.field3737 = arg1 + arg3 - 1;
        var16.field3722 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class99.field1780[var22][var17][var20] == null) {
                        class99.field1780[var22][var17][var20] = new class208(var22, var17, var20);
                    }
                }
                class208 var23 = class99.field1780[arg0][var17][var20];
                var23.field3650[var23.field3646] = var16;
                var23.field3636[var23.field3646] = var21;
                var23.field3638 |= var21;
                var23.field3646++;
                if (var13 && class82.field1484[var17][var20] != 0) {
                    var14 = class82.field1484[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class82.field1484[var18][var19] == 0) {
                        class82.field1484[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class111.field1946[class123.field2177++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lge;Z)V")
    public static final void method1237(class68 arg0, boolean arg1) {
        field3086++;
        class77.field1430 = arg0.method482(-111, class235.field4063);
        if (!arg1) {
            field3093 = false;
        }
        class97.field1753 = arg0.method482(-103, class162.field2788);
        class236.field4077 = arg0.method482(-120, class228.field3948);
        class182.field3110 = arg0.method482(-66, class71.field1325);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BZ)V")
    public final void method1238(byte arg0, boolean arg1) {
        this.field3079 = arg1;
        this.method1242(-127);
        int var3 = -2 % ((arg0 - 14) / 56);
        field3088++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ[II[I)V")
    public final void method1239(int arg0, boolean arg1, int[] arg2, int arg3, int[] arg4) {
        int var6 = 62 / ((arg3 + 64) / 40);
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var7 = 0; var7 < 7; var7++) {
                for (int var8 = 0; var8 < class95.field1742; var8++) {
                    class161 var9 = class211.method1453(false, var8);
                    if (var9 != null && !var9.field2774 && var7 + (arg1 ? 7 : 0) == var9.field2778) {
                        arg2[class140.field2416[var7]] = class75.method528(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        field3080++;
        this.field3078 = arg4;
        this.field3079 = arg1;
        this.field3082 = arg2;
        this.field3090 = arg0;
        this.method1242(-128);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
    public final void method1240(int arg0, int arg1, int arg2) {
        field3077++;
        int var4 = class140.field2416[arg2];
        if (this.field3082[var4] != arg0 && class211.method1453(false, arg1) != null) {
            this.field3082[var4] = class75.method528(arg1, Integer.MIN_VALUE);
            this.method1242(21);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method1241(byte arg0) {
        field3076 = null;
        field3094 = null;
        if (arg0 >= -112) {
            field3076 = null;
        }
        field3092 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    private final void method1242(int arg0) {
        long[] var2 = class106.field1865;
        field3085++;
        long var3 = this.field3074;
        this.field3074 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3074 = this.field3074 >>> 8 ^ var2[(int) ((this.field3074 ^ (long) (this.field3082[var5] >> 24)) & 0xFFL)];
            this.field3074 = var2[(int) (((long) (this.field3082[var5] >> 16) ^ this.field3074) & 0xFFL)] ^ this.field3074 >>> 8;
            this.field3074 = var2[(int) (((long) (this.field3082[var5] >> 8) ^ this.field3074) & 0xFFL)] ^ this.field3074 >>> 8;
            this.field3074 = var2[(int) ((this.field3074 ^ (long) this.field3082[var5]) & 0xFFL)] ^ this.field3074 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3074 = var2[(int) ((this.field3074 ^ (long) this.field3078[var6]) & 0xFFL)] ^ this.field3074 >>> 8;
        }
        int var7 = 64 / ((arg0 + 88) / 36);
        this.field3074 = this.field3074 >>> 8 ^ var2[(int) (((long) (this.field3079 ? 1 : 0) ^ this.field3074) & 0xFFL)];
        if (var3 != 0L && this.field3074 != var3) {
            class127.field2218.method1272(-8, var3);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lde;Lde;III)Lwb;")
    public final class26 method1243(class106 arg0, class106 arg1, int arg2, int arg3, int arg4) {
        field3091++;
        if (~this.field3090 != arg4) {
            return class55.method370(true, this.field3090).method1807(arg1, arg3, 28879, arg0, arg2);
        }
        long var6 = this.field3074;
        int[] var8 = this.field3082;
        if (arg1 != null && (arg1.field1871 >= 0 || arg1.field1874 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3082[var9];
            }
            if (arg1.field1871 >= 0) {
                if (arg1.field1871 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class75.method528(arg1.field1871, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg1.field1874 >= 0) {
                if (arg1.field1874 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class75.method528(1073741824, arg1.field1874);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class26 var10 = (class26) class127.field2218.method1269(var6, (byte) 86);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class211.method1453(false, var30 & 0x3FFFFFFF).method1061((byte) 42)) {
                        var11 = true;
                    }
                } else if (!class32.method221(11649, var30 & 0x3FFFFFFF).method416((byte) -128, this.field3079)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3081 != -1L) {
                    var10 = (class26) class127.field2218.method1269(this.field3081, (byte) 99);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class165[] var13 = new class165[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class165 var29 = class32.method221(11649, var27 & 0x3FFFFFFF).method404(85, this.field3079);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class165 var28 = class211.method1453(false, var27 & 0x3FFFFFFF).method1062(true);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class61 var17 = class32.method221(11649, var16 & 0x3FFFFFFF);
                    if (var17.field1090 != null) {
                        for (int var18 = 0; var18 < var17.field1090.length; var18++) {
                            if (var17.field1090[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field1090[var18][0];
                                int var20 = var17.field1090[var18][1];
                                int var21 = var17.field1090[var18][3];
                                int var22 = var17.field1090[var18][2];
                                int var23 = var17.field1090[var18][4];
                                int var24 = var17.field1090[var18][5];
                                var13[var18 + 1].method1114(var19, var20, var22);
                                var13[var18 + 1].method1100(var21, var23, var24);
                            }
                        }
                    }
                }
                class165 var25 = new class165(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (class177.field3034[var26].length > this.field3078[var26]) {
                        var25.method1113(class268.field4764[var26], class177.field3034[var26][this.field3078[var26]]);
                    }
                    if (this.field3078[var26] < class34.field502[var26].length) {
                        var25.method1113(class168.field2895[var26], class34.field502[var26][this.field3078[var26]]);
                    }
                }
                var10 = var25.method1085(64, 850, -30, -50, -30);
                class127.field2218.method1271(-15561, var10, var6);
                this.field3081 = var6;
            }
        }
        if (arg1 == null && arg0 == null) {
            return var10;
        }
        class26 var31;
        if (arg1 != null && arg0 != null) {
            var31 = arg1.method736(arg3, var10, arg0, arg4 ^ 0xFFFF, arg2);
        } else if (arg1 == null) {
            var31 = arg0.method733(var10, (byte) 69, arg3);
        } else {
            var31 = arg1.method733(var10, (byte) 69, arg2);
        }
        return var31;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)I")
    public final int method1244(int arg0) {
        if (arg0 != 0) {
            this.field3090 = -22;
        }
        field3084++;
        return this.field3090 == -1 ? (this.field3082[11] << 5) + (this.field3082[0] << 15) + (this.field3082[8] << 10) + this.field3082[1] + (this.field3078[4] << 20) + (this.field3078[0] << 25) : 305419896 - -class55.method370(true, this.field3090).field4669;
    }
}
