import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ACLAPANL")
public class class2 {

    @OriginalMember(owner = "ACLAPANL", name = "j", descriptor = "[I")
    private int[] field22 = new int[5];

    @OriginalMember(owner = "ACLAPANL", name = "k", descriptor = "[I")
    private int[] field23 = new int[5];

    @OriginalMember(owner = "ACLAPANL", name = "l", descriptor = "[I")
    private int[] field24 = new int[5];

    @OriginalMember(owner = "ACLAPANL", name = "n", descriptor = "I")
    private int field26 = 100;

    @OriginalMember(owner = "ACLAPANL", name = "q", descriptor = "I")
    public int field29 = 500;

    @OriginalMember(owner = "ACLAPANL", name = "v", descriptor = "[I")
    private static int[] field34 = new int[5];

    @OriginalMember(owner = "ACLAPANL", name = "w", descriptor = "[I")
    private static int[] field35 = new int[5];

    @OriginalMember(owner = "ACLAPANL", name = "x", descriptor = "[I")
    private static int[] field36 = new int[5];

    @OriginalMember(owner = "ACLAPANL", name = "y", descriptor = "[I")
    private static int[] field37 = new int[5];

    @OriginalMember(owner = "ACLAPANL", name = "z", descriptor = "[I")
    private static int[] field38 = new int[5];

    @OriginalMember(owner = "ACLAPANL", name = "a", descriptor = "I")
    private static int field13;

    @OriginalMember(owner = "ACLAPANL", name = "m", descriptor = "I")
    private int field25;

    @OriginalMember(owner = "ACLAPANL", name = "r", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "ACLAPANL", name = "o", descriptor = "LFCAOQJWY;")
    private class20 field27;

    @OriginalMember(owner = "ACLAPANL", name = "b", descriptor = "LBJPHZZMM;")
    private class5 field14;

    @OriginalMember(owner = "ACLAPANL", name = "c", descriptor = "LBJPHZZMM;")
    private class5 field15;

    @OriginalMember(owner = "ACLAPANL", name = "d", descriptor = "LBJPHZZMM;")
    private class5 field16;

    @OriginalMember(owner = "ACLAPANL", name = "e", descriptor = "LBJPHZZMM;")
    private class5 field17;

    @OriginalMember(owner = "ACLAPANL", name = "f", descriptor = "LBJPHZZMM;")
    private class5 field18;

    @OriginalMember(owner = "ACLAPANL", name = "g", descriptor = "LBJPHZZMM;")
    private class5 field19;

    @OriginalMember(owner = "ACLAPANL", name = "h", descriptor = "LBJPHZZMM;")
    private class5 field20;

    @OriginalMember(owner = "ACLAPANL", name = "i", descriptor = "LBJPHZZMM;")
    private class5 field21;

    @OriginalMember(owner = "ACLAPANL", name = "p", descriptor = "LBJPHZZMM;")
    private class5 field28;

    @OriginalMember(owner = "ACLAPANL", name = "s", descriptor = "[I")
    private static int[] field31;

    @OriginalMember(owner = "ACLAPANL", name = "t", descriptor = "[I")
    private static int[] field32;

    @OriginalMember(owner = "ACLAPANL", name = "u", descriptor = "[I")
    private static int[] field33;

    @OriginalMember(owner = "ACLAPANL", name = "a", descriptor = "()V")
    public static final void method7() {
        field32 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field32[var0] = 1;
            } else {
                field32[var0] = -1;
            }
        }
        field33 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field33[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field31 = new int[220500];
    }

    @OriginalMember(owner = "ACLAPANL", name = "a", descriptor = "(II)[I")
    public final int[] method8(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field31[var3] = 0;
        }
        if (arg1 < 10) {
            return field31;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field14.method32(field13);
        this.field15.method32(field13);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field16 != null) {
            this.field16.method32(field13);
            this.field17.method32(field13);
            var6 = (int) ((double) (this.field16.field61 - this.field16.field60) * 32.768D / var4);
            var7 = (int) ((double) this.field16.field60 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field18 != null) {
            this.field18.method32(field13);
            this.field19.method32(field13);
            var9 = (int) ((double) (this.field18.field61 - this.field18.field60) * 32.768D / var4);
            var10 = (int) ((double) this.field18.field60 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field22[var12] != 0) {
                field34[var12] = 0;
                field35[var12] = (int) ((double) this.field24[var12] * var4);
                field36[var12] = (this.field22[var12] << 14) / 100;
                field37[var12] = (int) ((double) (this.field14.field61 - this.field14.field60) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field23[var12]) / var4);
                field38[var12] = (int) ((double) this.field14.field60 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field14.method33(true, arg0);
            int var42 = this.field15.method33(true, arg0);
            if (this.field16 != null) {
                int var43 = this.field16.method33(true, arg0);
                int var44 = this.field17.method33(true, arg0);
                var41 += this.method9(-730, var8, this.field16.field62, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field18 != null) {
                int var45 = this.field18.method33(true, arg0);
                int var46 = this.field19.method33(true, arg0);
                var42 = var42 * ((this.method9(-730, var11, this.field18.field62, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field22[var47] != 0) {
                    int var48 = field35[var47] + var13;
                    if (var48 < arg0) {
                        field31[var48] += this.method9(-730, field34[var47], this.field14.field62, field36[var47] * var42 >> 15);
                        field34[var47] += (field37[var47] * var41 >> 16) + field38[var47];
                    }
                }
            }
        }
        if (this.field20 != null) {
            this.field20.method32(field13);
            this.field21.method32(field13);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field20.method33(true, arg0);
                int var19 = this.field21.method33(true, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field20.field61 - this.field20.field60) * var18 >> 8) + this.field20.field60;
                } else {
                    var20 = ((this.field20.field61 - this.field20.field60) * var19 >> 8) + this.field20.field60;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field31[var17] = 0;
                }
            }
        }
        if (this.field25 > 0 && this.field26 > 0) {
            int var21 = (int) ((double) this.field25 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field31[var22] += field31[var22 - var21] * this.field26 / 100;
            }
        }
        if (this.field27.field693[0] > 0 || this.field27.field693[1] > 0) {
            this.field28.method32(field13);
            int var23 = this.field28.method33(true, arg0 + 1);
            int var24 = this.field27.method227((float) var23 / 65536.0F, 0, true);
            int var25 = this.field27.method227((float) var23 / 65536.0F, 1, true);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field31[var24 + var26] * (long) class20.field700 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field31[var24 + var26 - var38 - 1] * (long) class20.field698[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field31[var26 - var39 - 1] * (long) class20.field698[1][var39] >> 16);
                    }
                    field31[var26] = var37;
                    var23 = this.field28.method33(true, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field31[var24 + var26] * (long) class20.field700 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field31[var24 + var26 - var35 - 1] * (long) class20.field698[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field31[var26 - var36 - 1] * (long) class20.field698[1][var36] >> 16);
                        }
                        field31[var26] = var34;
                        var23 = this.field28.method33(true, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field31[var24 + var26 - var31 - 1] * (long) class20.field698[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field31[var26 - var32 - 1] * (long) class20.field698[1][var32] >> 16);
                            }
                            field31[var26] = var30;
                            this.field28.method33(true, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field27.method227((float) var23 / 65536.0F, 0, true);
                    var25 = this.field27.method227((float) var23 / 65536.0F, 1, true);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field31[var40] < -32768) {
                field31[var40] = -32768;
            }
            if (field31[var40] > 32767) {
                field31[var40] = 32767;
            }
        }
        return field31;
    }

    @OriginalMember(owner = "ACLAPANL", name = "a", descriptor = "(IIII)I")
    private final int method9(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 0) {
            return field13;
        } else if (arg2 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg2 == 2) {
            return field33[arg1 & 0x7FFF] * arg3 >> 14;
        } else if (arg2 == 3) {
            return ((arg1 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg2 == 4) {
            return field32[arg1 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "ACLAPANL", name = "a", descriptor = "(BLXOUQUKZW;)V")
    public final void method10(byte arg0, class62 arg1) {
        this.field14 = new class5();
        this.field14.method30((byte) 5, arg1);
        this.field15 = new class5();
        this.field15.method30((byte) 5, arg1);
        int var3 = arg1.method521();
        if (var3 != 0) {
            arg1.field1579--;
            this.field16 = new class5();
            this.field16.method30((byte) 5, arg1);
            this.field17 = new class5();
            this.field17.method30((byte) 5, arg1);
        }
        int var4 = arg1.method521();
        if (var4 != 0) {
            arg1.field1579--;
            this.field18 = new class5();
            this.field18.method30((byte) 5, arg1);
            this.field19 = new class5();
            this.field19.method30((byte) 5, arg1);
        }
        int var5 = arg1.method521();
        if (var5 != 0) {
            arg1.field1579--;
            this.field20 = new class5();
            this.field20.method30((byte) 5, arg1);
            this.field21 = new class5();
            this.field21.method30((byte) 5, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method535();
            if (var7 == 0) {
                break;
            }
            this.field22[var6] = var7;
            this.field23[var6] = arg1.method534();
            this.field24[var6] = arg1.method535();
        }
        this.field25 = arg1.method535();
        this.field26 = arg1.method535();
        this.field29 = arg1.method523();
        this.field30 = arg1.method523();
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        this.field27 = new class20();
        this.field28 = new class5();
        this.field27.method228(this.field28, arg1, (byte) -14);
    }
}
