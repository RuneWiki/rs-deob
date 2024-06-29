import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field981 = 0;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    private int field982 = 0;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public int field985 = 500;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    private int field990 = 100;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[I")
    private int[] field988 = new int[5];

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
    private int[] field992 = new int[5];

    @OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
    private int[] field1000 = new int[5];

    @OriginalMember(owner = "client!f", name = "l", descriptor = "[I")
    private static int[] field991 = new int[32768];

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
    private static int[] field984;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "[I")
    private static int[] field994;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "[I")
    private static int[] field999;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
    private static int[] field997;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "[I")
    private static int[] field998;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "[I")
    private static int[] field1002;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "[I")
    private static int[] field1004;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Lia;")
    private class57 field1001;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "Lia;")
    private class57 field1003;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lia;")
    private class57 field980;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lia;")
    private class57 field983;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lia;")
    private class57 field986;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lia;")
    private class57 field987;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lia;")
    private class57 field989;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Lia;")
    private class57 field993;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Lia;")
    private class57 field996;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lmf;")
    private class89 field995;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
    private final int method271(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field984[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field991[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    public static void method272() {
        field994 = null;
        field991 = null;
        field984 = null;
        field998 = null;
        field997 = null;
        field1004 = null;
        field999 = null;
        field1002 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
    public final int[] method273(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field994[var3] = 0;
        }
        if (arg1 < 10) {
            return field994;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field980.method441();
        this.field986.method441();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field993 != null) {
            this.field993.method441();
            this.field983.method441();
            var6 = (int) ((double) (this.field993.field1479 - this.field993.field1478) * 32.768D / var4);
            var7 = (int) ((double) this.field993.field1478 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field996 != null) {
            this.field996.method441();
            this.field987.method441();
            var9 = (int) ((double) (this.field996.field1479 - this.field996.field1478) * 32.768D / var4);
            var10 = (int) ((double) this.field996.field1478 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1000[var12] != 0) {
                field998[var12] = 0;
                field997[var12] = (int) ((double) this.field988[var12] * var4);
                field1004[var12] = (this.field1000[var12] << 14) / 100;
                field999[var12] = (int) ((double) (this.field980.field1479 - this.field980.field1478) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field992[var12]) / var4);
                field1002[var12] = (int) ((double) this.field980.field1478 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field980.method444(arg0);
            int var41 = this.field986.method444(arg0);
            if (this.field993 != null) {
                int var42 = this.field993.method444(arg0);
                int var43 = this.field983.method444(arg0);
                var40 += this.method271(var8, var43, this.field993.field1475) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field996 != null) {
                int var44 = this.field996.method444(arg0);
                int var45 = this.field987.method444(arg0);
                var41 = var41 * ((this.method271(var11, var45, this.field996.field1475) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field1000[var46] != 0) {
                    int var47 = field997[var46] + var13;
                    if (var47 < arg0) {
                        field994[var47] += this.method271(field998[var46], field1004[var46] * var41 >> 15, this.field980.field1475);
                        field998[var46] += (field999[var46] * var40 >> 16) + field1002[var46];
                    }
                }
            }
        }
        if (this.field989 != null) {
            this.field989.method441();
            this.field1001.method441();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field989.method444(arg0);
                int var19 = this.field1001.method444(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field989.field1479 - this.field989.field1478) * var18 >> 8) + this.field989.field1478;
                } else {
                    var20 = ((this.field989.field1479 - this.field989.field1478) * var19 >> 8) + this.field989.field1478;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field994[var17] = 0;
                }
            }
        }
        if (this.field982 > 0 && this.field990 > 0) {
            int var21 = (int) ((double) this.field982 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field994[var22] += field994[var22 - var21] * this.field990 / 100;
            }
        }
        if (this.field995.field2080[0] > 0 || this.field995.field2080[1] > 0) {
            this.field1003.method441();
            int var23 = this.field1003.method444(arg0 + 1);
            int var24 = this.field995.method637(0, (float) var23 / 65536.0F);
            int var25 = this.field995.method637(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field994[var24 + var26] * (long) class89.field2081 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field994[var24 + var26 - var37 - 1] * (long) class89.field2084[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field994[var26 - var38 - 1] * (long) class89.field2084[1][var38] >> 16);
                    }
                    field994[var26] = var36;
                    var23 = this.field1003.method444(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field994[var24 + var26] * (long) class89.field2081 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field994[var24 + var26 - var34 - 1] * (long) class89.field2084[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field994[var26 - var35 - 1] * (long) class89.field2084[1][var35] >> 16);
                        }
                        field994[var26] = var33;
                        var23 = this.field1003.method444(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field994[var24 + var26 - var30 - 1] * (long) class89.field2084[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field994[var26 - var31 - 1] * (long) class89.field2084[1][var31] >> 16);
                            }
                            field994[var26] = var29;
                            this.field1003.method444(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field995.method637(0, (float) var23 / 65536.0F);
                    var25 = this.field995.method637(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field994[var39] < -32768) {
                field994[var39] = -32768;
            }
            if (field994[var39] > 32767) {
                field994[var39] = 32767;
            }
        }
        return field994;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lwb;)V")
    public final void method274(class148 arg0) {
        this.field980 = new class57();
        this.field980.method442(arg0);
        this.field986 = new class57();
        this.field986.method442(arg0);
        int var2 = arg0.method1137(255);
        if (var2 != 0) {
            arg0.field3601--;
            this.field993 = new class57();
            this.field993.method442(arg0);
            this.field983 = new class57();
            this.field983.method442(arg0);
        }
        int var3 = arg0.method1137(255);
        if (var3 != 0) {
            arg0.field3601--;
            this.field996 = new class57();
            this.field996.method442(arg0);
            this.field987 = new class57();
            this.field987.method442(arg0);
        }
        int var4 = arg0.method1137(255);
        if (var4 != 0) {
            arg0.field3601--;
            this.field989 = new class57();
            this.field989.method442(arg0);
            this.field1001 = new class57();
            this.field1001.method442(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1144(-124);
            if (var6 == 0) {
                break;
            }
            this.field1000[var5] = var6;
            this.field992[var5] = arg0.method1148(255);
            this.field988[var5] = arg0.method1144(-127);
        }
        this.field982 = arg0.method1144(-126);
        this.field990 = arg0.method1144(-128);
        this.field985 = arg0.method1140(-1);
        this.field981 = arg0.method1140(-1);
        this.field995 = new class89();
        this.field1003 = new class57();
        this.field995.method638(arg0, this.field1003);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field991[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field984 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field984[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field994 = new int[220500];
        field999 = new int[5];
        field997 = new int[5];
        field998 = new int[5];
        field1002 = new int[5];
        field1004 = new int[5];
    }
}
