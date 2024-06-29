import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class16 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field376 = 0;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Z")
    public static boolean field375 = false;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field396 = 0;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "J")
    private long field379;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "J")
    private long field387;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Ljc;")
    public static class85 field378;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Z")
    public boolean field380;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
    private int[] field382;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "[I")
    private int[] field394;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lab;B)V")
    public final void method170(class3 arg0, byte arg1) {
        field390++;
        arg0.method66(2, this.field380 ? 1 : 0);
        int var3 = 0;
        if (arg1 < 87) {
            return;
        }
        while (var3 < 7) {
            int var5 = this.field382[class143.field3068[var3]];
            if ((Integer.MIN_VALUE & var5) == 0) {
                arg0.method62(65535, (byte) 113);
            } else {
                arg0.method62(var5 & 0x3FFFFFFF, (byte) -128);
            }
            var3++;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method66(2, this.field394[var4]);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    public final void method171(int arg0, int arg1, int arg2) {
        int var4 = class143.field3068[arg2];
        field383++;
        if (this.field382[var4] == 0 || class74.method680(arg0, 3) == null) {
            return;
        }
        if (arg1 < 39) {
            this.method180(-11, 44, false);
        }
        this.field382[var4] = class202.method1332(arg0, Integer.MIN_VALUE);
        this.method172(-58);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    private final void method172(int arg0) {
        field392++;
        if (arg0 >= -38) {
            return;
        }
        long var2 = this.field379;
        long[] var4 = class5.field137;
        this.field379 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field379 = var4[(int) (((long) (this.field382[var5] >> 24) ^ this.field379) & 0xFFL)] ^ this.field379 >>> 8;
            this.field379 = this.field379 >>> 8 ^ var4[(int) (((long) (this.field382[var5] >> 16) ^ this.field379) & 0xFFL)];
            this.field379 = this.field379 >>> 8 ^ var4[(int) ((this.field379 ^ (long) (this.field382[var5] >> 8)) & 0xFFL)];
            this.field379 = this.field379 >>> 8 ^ var4[(int) ((this.field379 ^ (long) this.field382[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field379 = this.field379 >>> 8 ^ var4[(int) (((long) this.field394[var6] ^ this.field379) & 0xFFL)];
        }
        this.field379 = this.field379 >>> 8 ^ var4[(int) ((this.field379 ^ (long) (this.field380 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field379 != var2) {
            class174.field3575.method286(var2, 1);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static void method173(int arg0) {
        field378 = null;
        if (arg0 > -4) {
            method179(99);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILah;I)Ldf;")
    public final class36 method174(int arg0, class9 arg1, int arg2) {
        field385++;
        if (this.field398 != -1) {
            return class140.method1007(-201, this.field398).method269(arg1, 0, arg0);
        }
        class36 var4 = (class36) class140.field3010.method289(this.field379, -130079263);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field382[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class74.method680(var15 & 0x3FFFFFFF, 3).method1211((byte) -121)) {
                        var5 = true;
                    }
                } else if (!class59.method554(var15 & 0x3FFFFFFF, 13319).method806(13734, this.field380)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class92[] var7 = new class92[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field382[var9];
                if ((var12 & 0x40000000) != 0) {
                    class92 var13 = class59.method554(var12 & 0x3FFFFFFF, 13319).method819(this.field380, (byte) -80);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class92 var14 = class74.method680(var12 & 0x3FFFFFFF, 3).method1219(43);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class92 var10 = new class92(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field394[var11] < class71.field1793[var11].length) {
                    var10.method785(class65.field1650[var11], class71.field1793[var11][this.field394[var11]]);
                }
                if (class35.field826[var11].length > this.field394[var11]) {
                    var10.method785(class174.field3583[var11], class35.field826[var11][this.field394[var11]]);
                }
            }
            var4 = var10.method798(64, 768, -50, -10, -50, true, true);
            class140.field3010.method293(false, this.field379, var4);
        }
        if (arg1 != null) {
            var4 = arg1.method124(-65536, arg0, var4);
        }
        return arg2 >= -77 ? null : var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)V")
    public final void method175(byte arg0, int arg1, int arg2) {
        field399++;
        if (arg0 > -8) {
            field396 = -62;
        }
        this.field394[arg1] = arg2;
        this.method172(-42);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB[Lgg;)Lgg;")
    public static final class63 method176(int arg0, int arg1, byte arg2, class63[] arg3) {
        if (arg2 >= -116) {
            method179(-86);
        }
        int var4 = 0;
        field384++;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg0 + var5] == null) {
                arg3[arg0 + var5] = class140.field2999;
            }
            var4 += arg3[arg0 + var5].field1628;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg1; var8++) {
            class63 var10 = arg3[arg0 + var8];
            class102.method847(var10.field1602, 0, var7, var6, var10.field1628);
            var6 += var10.field1628;
        }
        class63 var9 = new class63();
        var9.field1628 = var4;
        var9.field1602 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([IZ[III)V")
    public final void method177(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class57.field1497; var7++) {
                    class184 var8 = class74.method680(var7, 3);
                    if (var8 != null && !var8.field3737 && (arg1 ? 7 : 0) + var6 == var8.field3727) {
                        arg0[class143.field3068[var6]] = class202.method1332(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field394 = arg2;
        this.field398 = arg3;
        if (arg4 != 7) {
            this.method181(false, -50);
        }
        field381++;
        this.field380 = arg1;
        this.field382 = arg0;
        this.method172(-59);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BZ)V")
    public final void method178(byte arg0, boolean arg1) {
        field395++;
        if (arg1 != this.field380) {
            int var3 = -15 / ((-arg0 - 26) / 54);
            this.method177(null, arg1, this.field394, -1, 7);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
    public static final void method179(int arg0) {
        if (arg0 != -8495) {
            field396 = 70;
        }
        try {
            if (class110.field2483 == null) {
                class110.field2483 = new class175(class79.field1924, class89.method772((byte) 66, new class63[] { class108.field2443, class151.field3178, class108.field2445 }).method571(0));
            } else {
                byte[] var1 = class110.field2483.method1163(false);
                if (var1 != null) {
                    class3 var2 = new class3(var1);
                    class9.field182 = var2.method46((byte) 65);
                    class47.field1111 = new class69[class9.field182];
                    for (int var3 = 0; var3 < class9.field182; var3++) {
                        class69 var4 = class47.field1111[var3] = new class69();
                        int var5 = var2.method46((byte) 65);
                        var4.field1728 = (var5 & 0x8000) != 0;
                        var4.field1722 = var5 & 0x7FFF;
                        var4.field1719 = var2.method28(-1);
                        var4.field1727 = var2.method25(arg0 + 8495);
                        var4.field1718 = var3;
                        var4.field1720 = class169.method1142(var4.field1719, arg0 + 8398);
                    }
                    class40.method365(class47.field1111.length - 1, class177.field3630, class47.field1111, class104.field2388, 0, 5);
                    class110.field2483 = null;
                    class88.field2081 = true;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class110.field2483 = null;
        }
        field377++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZ)V")
    public final void method180(int arg0, int arg1, boolean arg2) {
        field391++;
        if (arg1 == 1 && this.field380) {
            return;
        }
        int var4 = this.field382[class143.field3068[arg1]];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 & 0x3FFFFFFF;
        class184 var6;
        do {
            if (arg2) {
                var5++;
                if (var5 >= class57.field1497) {
                    var5 = 0;
                }
            } else {
                var5--;
                if (var5 < 0) {
                    var5 = class57.field1497 - 1;
                }
            }
            var6 = class74.method680(var5, 3);
        } while (var6 == null || var6.field3737 || var6.field3727 != arg1 + (this.field380 ? 7 : 0));
        if (arg0 > -114) {
            method173(104);
        }
        this.field382[class143.field3068[arg1]] = class202.method1332(Integer.MIN_VALUE, var5);
        this.method172(-92);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
    public final void method181(boolean arg0, int arg1) {
        if (arg1 == 12) {
            this.field380 = arg0;
            field393++;
            this.method172(arg1 - 69);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I")
    public final int method182(byte arg0) {
        field389++;
        if (arg0 != -128) {
            this.method171(122, -61, 20);
        }
        return this.field398 == -1 ? (this.field394[4] << 20) + (this.field394[0] << 25) + (this.field382[11] << 5) + (this.field382[0] << 15) + (this.field382[8] << 10) + this.field382[1] : class140.method1007(-201, this.field398).field666 + 305419896;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZBI)V")
    public final void method183(boolean arg0, byte arg1, int arg2) {
        field388++;
        int var4 = this.field394[arg2];
        if (arg1 >= -64) {
            method179(83);
        }
        if (arg0) {
            var4++;
            if (class71.field1793[arg2].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class71.field1793[arg2].length - 1;
            }
        }
        this.field394[arg2] = var4;
        this.method172(-102);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lah;ILah;II)Ldf;")
    public final class36 method184(class9 arg0, int arg1, class9 arg2, int arg3, int arg4) {
        field397++;
        if (arg3 != 9420) {
            return null;
        } else if (this.field398 == -1) {
            long var6 = this.field379;
            int[] var8 = this.field382;
            if (arg2 != null && (arg2.field214 >= 0 || arg2.field204 >= 0)) {
                var8 = new int[12];
                for (int var9 = 0; var9 < 12; var9++) {
                    var8[var9] = this.field382[var9];
                }
                if (arg2.field214 >= 0) {
                    if (arg2.field214 == 65535) {
                        var6 ^= 0xFFFFFFFF00000000L;
                        var8[5] = 0;
                    } else {
                        var8[5] = class202.method1332(1073741824, arg2.field214);
                        var6 ^= (long) var8[5] << 32;
                    }
                }
                if (arg2.field204 >= 0) {
                    if (arg2.field204 == 65535) {
                        var6 ^= 0xFFFFFFFFL;
                        var8[3] = 0;
                    } else {
                        var8[3] = class202.method1332(1073741824, arg2.field204);
                        var6 ^= var8[3];
                    }
                }
            }
            class36 var10 = (class36) class174.field3575.method289(var6, arg3 - 130088683);
            if (var10 == null) {
                boolean var11 = false;
                for (int var12 = 0; var12 < 12; var12++) {
                    int var21 = var8[var12];
                    if ((var21 & 0x40000000) == 0) {
                        if ((Integer.MIN_VALUE & var21) != 0 && !class74.method680(var21 & 0x3FFFFFFF, 3).method1216(false)) {
                            var11 = true;
                        }
                    } else if (!class59.method554(var21 & 0x3FFFFFFF, 13319).method815(7114, this.field380)) {
                        var11 = true;
                    }
                }
                if (var11) {
                    if (this.field387 != -1L) {
                        var10 = (class36) class174.field3575.method289(this.field387, -130079263);
                    }
                    if (var10 == null) {
                        return null;
                    }
                }
                if (var10 == null) {
                    class92[] var13 = new class92[12];
                    int var14 = 0;
                    for (int var15 = 0; var15 < 12; var15++) {
                        int var18 = var8[var15];
                        if ((var18 & 0x40000000) != 0) {
                            class92 var20 = class59.method554(var18 & 0x3FFFFFFF, arg3 ^ 0x10CB).method812((byte) 118, this.field380);
                            if (var20 != null) {
                                var13[var14++] = var20;
                            }
                        } else if ((Integer.MIN_VALUE & var18) != 0) {
                            class92 var19 = class74.method680(var18 & 0x3FFFFFFF, arg3 ^ 0x24CF).method1217((byte) 127);
                            if (var19 != null) {
                                var13[var14++] = var19;
                            }
                        }
                    }
                    class92 var16 = new class92(var13, var14);
                    for (int var17 = 0; var17 < 5; var17++) {
                        if (class71.field1793[var17].length > this.field394[var17]) {
                            var16.method785(class65.field1650[var17], class71.field1793[var17][this.field394[var17]]);
                        }
                        if (this.field394[var17] < class35.field826[var17].length) {
                            var16.method785(class174.field3583[var17], class35.field826[var17][this.field394[var17]]);
                        }
                    }
                    var10 = var16.method798(64, 850, -30, -50, -30, true, true);
                    class174.field3575.method293(false, var6, var10);
                    this.field387 = var6;
                }
            }
            if (arg2 == null && arg0 == null) {
                return var10;
            }
            class36 var22;
            if (arg2 != null && arg0 != null) {
                var22 = arg2.method119(arg0, arg4, arg1, var10, -1);
            } else if (arg2 == null) {
                var22 = arg0.method128(arg4, var10, 14);
            } else {
                var22 = arg2.method128(arg1, var10, 45);
            }
            return var22;
        } else {
            return class140.method1007(arg3 ^ 0xFFFFDBFB, this.field398).method275(arg2, arg1, arg4, arg0, arg3 - 9356);
        }
    }
}
