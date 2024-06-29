import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class177 {

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "[Lmi;")
    private class259[] field3237;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    private int field3224;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lcc;")
    private static class209 field3227 = class95.method669(125, "glow2:");

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lcc;")
    public static class209 field3231 = field3227;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lcc;")
    public static class209 field3236 = field3227;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Ljj;")
    public static class104 field3230 = new class104();

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lcc;")
    public static class209 field3238 = class95.method669(96, "Chargement en cours)3)3)3");

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "[J")
    public static long[] field3240 = new long[100];

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "J")
    private long field3225;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lmi;")
    private class259 field3233;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Lji;")
    public static class42 field3239;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
    public static final int method1219(int arg0, int arg1) {
        double var2 = (double) ((arg0 & 0xFFE0) >> 8) / 256.0D;
        double var4 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        if (arg1 != -1636) {
            return 73;
        }
        field3229++;
        double var6 = var4;
        double var8 = (double) (arg0 & 0xFF) / 256.0D;
        if (var4 > var2) {
            var6 = var2;
        }
        if (var8 < var6) {
            var6 = var8;
        }
        double var10 = 0.0D;
        double var12 = var4;
        if (var2 > var4) {
            var12 = var2;
        }
        if (var12 < var8) {
            var12 = var8;
        }
        double var14 = (var6 + var12) / 2.0D;
        double var16 = 0.0D;
        if (var6 != var12) {
            if (var14 < 0.5D) {
                var16 = (var12 - var6) / (var6 + var12);
            }
            if (var14 >= 0.5D) {
                var16 = (var12 - var6) / (2.0D - var12 - var6);
            }
            if (var4 == var12) {
                var10 = (var2 - var8) / (var12 - var6);
            } else if (var2 == var12) {
                var10 = (var8 - var4) / (var12 - var6) + 2.0D;
            } else if (var8 == var12) {
                var10 = (var4 - var2) / (var12 - var6) + 4.0D;
            }
        }
        double var18 = var10 / 6.0D;
        int var20 = (int) (var16 * 256.0D);
        int var21 = (int) (var18 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var20 >>= 0x4;
        } else if (var22 > 217) {
            var20 >>= 0x3;
        } else if (var22 > 192) {
            var20 >>= 0x2;
        } else if (var22 > 179) {
            var20 >>= 0x1;
        }
        return (var20 >> 5 << 7) + ((var21 >> 2 << 10) + (var22 >> 1));
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lmi;IJ)V")
    public final void method1220(class259 arg0, int arg1, long arg2) {
        field3234++;
        if (arg0.field4668 != null) {
            arg0.method1796(-42);
        }
        class259 var5 = this.field3237[(int) (arg2 & (long) (this.field3224 - 1))];
        arg0.field4674 = var5;
        if (arg1 >= -25) {
            field3240 = null;
        }
        arg0.field4668 = var5.field4668;
        arg0.field4681 = arg2;
        arg0.field4668.field4674 = arg0;
        arg0.field4674.field4668 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZJ)Lmi;")
    public final class259 method1221(boolean arg0, long arg1) {
        this.field3225 = arg1;
        if (arg0) {
            field3227 = null;
        }
        field3232++;
        class259 var4 = this.field3237[(int) ((long) (this.field3224 - 1) & arg1)];
        for (this.field3233 = var4.field4674; this.field3233 != var4; this.field3233 = this.field3233.field4674) {
            if (this.field3233.field4681 == arg1) {
                class259 var5 = this.field3233;
                this.field3233 = this.field3233.field4674;
                return var5;
            }
        }
        this.field3233 = null;
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILji;)I")
    public static final int method1222(int arg0, int arg1, class42 arg2) {
        field3228++;
        if (arg2.field855 == null || arg1 >= arg2.field855.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg2.field855[arg1];
            int var5 = arg0;
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                byte var8 = 0;
                int var9 = var4[var5++];
                if (var9 == 0) {
                    return var3;
                }
                if (var9 == 15) {
                    var8 = 1;
                }
                if (var9 == 1) {
                    var7 = class170.field3116[var4[var5++]];
                }
                if (var9 == 16) {
                    var8 = 2;
                }
                if (var9 == 2) {
                    var7 = class198.field3548[var4[var5++]];
                }
                if (var9 == 3) {
                    var7 = class104.field2011[var4[var5++]];
                }
                if (var9 == 17) {
                    var8 = 3;
                }
                if (var9 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class42 var12 = class247.method1719(var11, -8667);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class249.method1728(var13, true).field1578 || class90.field1761)) {
                        for (int var14 = 0; var14 < var12.field778.length; var14++) {
                            if ((var13 + 1) == var12.field778[var14]) {
                                var7 += var12.field856[var14];
                            }
                        }
                    }
                }
                if (var9 == 5) {
                    var7 = class38.field647[var4[var5++]];
                }
                if (var9 == 6) {
                    var7 = class184.field3315[class198.field3548[var4[var5++]] - 1];
                }
                if (var9 == 7) {
                    var7 = class38.field647[var4[var5++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var7 = class223.field4069.field2171;
                }
                if (var9 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class122.field2409[var15]) {
                            var7 += class198.field3548[var15];
                        }
                    }
                }
                if (var9 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class42 var18 = class247.method1719(var17, arg0 - 8667);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class249.method1728(var19, true).field1578 || class90.field1761)) {
                        for (int var20 = 0; var20 < var18.field778.length; var20++) {
                            if (var19 + 1 == var18.field778[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var7 = class109.field2192;
                }
                if (var9 == 12) {
                    var7 = class117.field2339;
                }
                if (var9 == 13) {
                    int var21 = class38.field647[var4[var5++]];
                    int var22 = var4[var5++];
                    var7 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var23 = var4[var5++];
                    var7 = method1223(var23, false);
                }
                if (var9 == 18) {
                    var7 = (class223.field4069.field1571 >> 7) + class174.field3178;
                }
                if (var9 == 19) {
                    var7 = (class223.field4069.field1534 >> 7) + class245.field4444;
                }
                if (var9 == 20) {
                    var7 = var4[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var3 += var7;
                    }
                    if (var6 == 1) {
                        var3 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var6 == 3) {
                        var3 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)I")
    public static final int method1223(int arg0, boolean arg1) {
        field3235++;
        class197 var2 = class37.method277(arg0, 50);
        int var3 = var2.field3526;
        if (arg1) {
            method1222(-79, -17, (class42) null);
        }
        int var4 = var2.field3532;
        int var5 = var2.field3527;
        int var6 = class197.field3535[var5 - var3];
        return class38.field647[var4] >> var3 & var6;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Lmi;")
    public final class259 method1224(byte arg0) {
        field3226++;
        if (this.field3233 == null) {
            return null;
        }
        class259 var2 = this.field3237[(int) ((long) (this.field3224 - 1) & this.field3225)];
        while (this.field3233 != var2) {
            if (this.field3233.field4681 == this.field3225) {
                class259 var3 = this.field3233;
                this.field3233 = this.field3233.field4674;
                return var3;
            }
            this.field3233 = this.field3233.field4674;
        }
        if (arg0 != -95) {
            method1223(-58, true);
        }
        this.field3233 = null;
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static void method1225(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3240 = null;
        field3227 = null;
        field3231 = null;
        field3238 = null;
        field3236 = null;
        field3230 = null;
        field3239 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I)V")
    public class177(int arg0) {
        this.field3237 = new class259[arg0];
        this.field3224 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class259 var3 = this.field3237[var2] = new class259();
            var3.field4674 = var3;
            var3.field4668 = var3;
        }
    }
}
