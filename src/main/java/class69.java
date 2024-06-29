import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class69 extends class33 {

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "Lrd;")
    public static class173 field1324 = class133.method843("Bitte geben Sie Ihr Passwort ein)3", -96);

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "Llc;")
    public static class112 field1329 = new class112(4096);

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "[Z")
    public static boolean[] field1331 = new boolean[100];

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "Lrd;")
    public static class173 field1332 = class133.method843("Fertigkeit)2", 120);

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 < -99) {
            ++field1325;
            if (arg0 == 0) {
                super.field729 = arg2.method751((byte) 122) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)I")
    public static final int method424(byte arg0) {
        int var1 = 3;
        ++field1323;
        if (~class186.field3635 > -311) {
            int var2 = class62.field1225 >> 7;
            int var3 = class97.field1778 >> 7;
            int var4 = class175.field3447.field2820 >> 7;
            if ((4 & class21.field462[class172.field3347][var2][var3]) != 0) {
                var1 = class172.field3347;
            }
            int var5;
            if (var2 >= var4) {
                var5 = -var4 + var2;
            } else {
                var5 = var4 - var2;
            }
            int var6 = class175.field3447.field2801 >> 7;
            int var7;
            if (var6 <= var3) {
                var7 = -var6 + var3;
            } else {
                var7 = -var3 + var6;
            }
            if (var5 <= var7) {
                int var8 = var5 * 65536 / var7;
                int var9 = 32768;
                while (~var3 != ~var6) {
                    if (~var6 < ~var3) {
                        ++var3;
                    } else if (~var6 > ~var3) {
                        --var3;
                    }
                    if ((4 & class21.field462[class172.field3347][var2][var3]) != 0) {
                        var1 = class172.field3347;
                    }
                    var9 += var8;
                    if (~var9 <= -65537) {
                        var9 -= 65536;
                        if (~var2 > ~var4) {
                            ++var2;
                        } else if (var4 < var2) {
                            --var2;
                        }
                        if ((4 & class21.field462[class172.field3347][var2][var3]) != 0) {
                            var1 = class172.field3347;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var5;
                int var11 = 32768;
                while (var2 != var4) {
                    var11 += var10;
                    if (~var2 <= ~var4) {
                        if (var2 > var4) {
                            --var2;
                        }
                    } else {
                        ++var2;
                    }
                    if ((class21.field462[class172.field3347][var2][var3] & 4) != 0) {
                        var1 = class172.field3347;
                    }
                    if (~var11 <= -65537) {
                        var11 -= 65536;
                        if (var3 < var6) {
                            ++var3;
                        } else if (~var3 < ~var6) {
                            --var3;
                        }
                        if (~(class21.field462[class172.field3347][var2][var3] & 4) != -1) {
                            var1 = class172.field3347;
                        }
                    }
                }
            }
        }
        if ((class21.field462[class172.field3347][class175.field3447.field2820 >> 7][class175.field3447.field2801 >> 7] & 4) != 0) {
            var1 = class172.field3347;
        }
        if (arg0 >= -6) {
            method426((byte) -127);
        }
        return var1;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class69() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(II)V")
    public static final void method425(int arg0, int arg1) {
        ++field1327;
        int var2 = 60 % ((-24 - arg0) / 41);
        class67.field1312 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V")
    public static void method426(byte arg0) {
        if (arg0 == -128) {
            field1332 = null;
            field1329 = null;
            field1324 = null;
            field1331 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field1326;
        int[][] var3 = super.field731.method1340(106, arg1);
        if (arg0 < 112) {
            field1332 = null;
        }
        if (super.field731.field3925) {
            int[] var4 = this.method262(arg1, 111, 2);
            int[][] var5 = this.method259(0, -9, arg1);
            int[][] var6 = this.method259(1, -9, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class117.field2173 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field1330;
        int var3 = -26 / ((arg1 - -65) / 60);
        int[] var4 = super.field718.method514(arg0, -45);
        if (super.field718.field1615) {
            int[] var5 = this.method262(arg0, -104, 0);
            int[] var6 = this.method262(arg0, -111, 1);
            int[] var7 = this.method262(arg0, -105, 2);
            for (int var8 = 0; ~var8 > ~class117.field2173; ++var8) {
                int var9 = var7[var8];
                if (var9 != 4096) {
                    if (~var9 == -1) {
                        var4[var8] = var6[var8];
                    } else {
                        var4[var8] = (-var9 + 4096) * var6[var8] + var5[var8] * var9 >> 12;
                    }
                } else {
                    var4[var8] = var5[var8];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[BI)I")
    public static final int method427(int arg0, byte[] arg1, int arg2) {
        ++field1322;
        return arg0 != -16747 ? 94 : class157.method1035(-119, 0, arg2, arg1);
    }
}
