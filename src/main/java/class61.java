import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class61 {

    @OriginalMember(owner = "client!e", name = "f", descriptor = "[I")
    private int[] field986 = new int[5];

    @OriginalMember(owner = "client!e", name = "i", descriptor = "[I")
    private int[] field989 = new int[5];

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    private int field982 = 0;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public int field992 = 500;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public int field993 = 0;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "[I")
    private int[] field991 = new int[5];

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    private int field1000 = 100;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "[I")
    private static int[] field996 = new int[32768];

    @OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
    private static int[] field985;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "[I")
    private static int[] field988;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "[I")
    private static int[] field998;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "[I")
    private static int[] field999;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "[I")
    private static int[] field1004;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "[I")
    private static int[] field1003;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "[I")
    private static int[] field1005;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lvb;")
    private class56 field997;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lbi;")
    private class88 field1001;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Lbi;")
    private class88 field1002;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lbi;")
    private class88 field981;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lbi;")
    private class88 field983;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lbi;")
    private class88 field984;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lbi;")
    private class88 field987;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lbi;")
    private class88 field990;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Lbi;")
    private class88 field994;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lbi;")
    private class88 field995;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Llb;)V")
    public final void method406(class121 arg0) {
        this.field994 = new class88();
        this.field994.method672(arg0);
        this.field1001 = new class88();
        this.field1001.method672(arg0);
        int var2 = arg0.method897(111);
        if (var2 != 0) {
            arg0.field2026--;
            this.field990 = new class88();
            this.field990.method672(arg0);
            this.field987 = new class88();
            this.field987.method672(arg0);
        }
        int var3 = arg0.method897(109);
        if (var3 != 0) {
            arg0.field2026--;
            this.field995 = new class88();
            this.field995.method672(arg0);
            this.field1002 = new class88();
            this.field1002.method672(arg0);
        }
        int var4 = arg0.method897(110);
        if (var4 != 0) {
            arg0.field2026--;
            this.field981 = new class88();
            this.field981.method672(arg0);
            this.field983 = new class88();
            this.field983.method672(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method877((byte) -91);
            if (var6 == 0) {
                break;
            }
            this.field991[var5] = var6;
            this.field986[var5] = arg0.method902((byte) 84);
            this.field989[var5] = arg0.method877((byte) -85);
        }
        this.field982 = arg0.method877((byte) -82);
        this.field1000 = arg0.method877((byte) -102);
        this.field992 = arg0.method876(false);
        this.field993 = arg0.method876(false);
        this.field997 = new class56();
        this.field984 = new class88();
        this.field997.method361(arg0, this.field984);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I")
    public final int[] method407(int arg0, int arg1) {
        class256.method1745(field988, 0, arg0);
        if (arg1 < 10) {
            return field988;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field994.method669();
        this.field1001.method669();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field990 != null) {
            this.field990.method669();
            this.field987.method669();
            var5 = (int) ((double) (this.field990.field1464 - this.field990.field1469) * 32.768D / var3);
            var6 = (int) ((double) this.field990.field1469 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field995 != null) {
            this.field995.method669();
            this.field1002.method669();
            var8 = (int) ((double) (this.field995.field1464 - this.field995.field1469) * 32.768D / var3);
            var9 = (int) ((double) this.field995.field1469 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field991[var11] != 0) {
                field1004[var11] = 0;
                field999[var11] = (int) ((double) this.field989[var11] * var3);
                field998[var11] = (this.field991[var11] << 14) / 100;
                field1003[var11] = (int) ((double) (this.field994.field1464 - this.field994.field1469) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field986[var11]) / var3);
                field1005[var11] = (int) ((double) this.field994.field1469 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field994.method670(arg0);
            int var40 = this.field1001.method670(arg0);
            if (this.field990 != null) {
                int var41 = this.field990.method670(arg0);
                int var42 = this.field987.method670(arg0);
                var39 += this.method408(var7, var42, this.field990.field1468) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field995 != null) {
                int var43 = this.field995.method670(arg0);
                int var44 = this.field1002.method670(arg0);
                var40 = var40 * ((this.method408(var10, var44, this.field995.field1468) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field991[var45] != 0) {
                    int var46 = field999[var45] + var12;
                    if (var46 < arg0) {
                        field988[var46] += this.method408(field1004[var45], field998[var45] * var40 >> 15, this.field994.field1468);
                        field1004[var45] += (field1003[var45] * var39 >> 16) + field1005[var45];
                    }
                }
            }
        }
        if (this.field981 != null) {
            this.field981.method669();
            this.field983.method669();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field981.method670(arg0);
                int var18 = this.field983.method670(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field981.field1464 - this.field981.field1469) * var17 >> 8) + this.field981.field1469;
                } else {
                    var19 = ((this.field981.field1464 - this.field981.field1469) * var18 >> 8) + this.field981.field1469;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field988[var16] = 0;
                }
            }
        }
        if (this.field982 > 0 && this.field1000 > 0) {
            int var20 = (int) ((double) this.field982 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field988[var21] += field988[var21 - var20] * this.field1000 / 100;
            }
        }
        if (this.field997.field943[0] > 0 || this.field997.field943[1] > 0) {
            this.field984.method669();
            int var22 = this.field984.method670(arg0 + 1);
            int var23 = this.field997.method364(0, (float) var22 / 65536.0F);
            int var24 = this.field997.method364(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field988[var23 + var25] * (long) class56.field945 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field988[var23 + var25 - var36 - 1] * (long) class56.field947[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field988[var25 - var37 - 1] * (long) class56.field947[1][var37] >> 16);
                    }
                    field988[var25] = var35;
                    var22 = this.field984.method670(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field988[var23 + var25] * (long) class56.field945 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field988[var23 + var25 - var33 - 1] * (long) class56.field947[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field988[var25 - var34 - 1] * (long) class56.field947[1][var34] >> 16);
                        }
                        field988[var25] = var32;
                        var22 = this.field984.method670(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field988[var23 + var25 - var29 - 1] * (long) class56.field947[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field988[var25 - var30 - 1] * (long) class56.field947[1][var30] >> 16);
                            }
                            field988[var25] = var28;
                            this.field984.method670(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field997.method364(0, (float) var22 / 65536.0F);
                    var24 = this.field997.method364(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field988[var38] < -32768) {
                field988[var38] = -32768;
            }
            if (field988[var38] > 32767) {
                field988[var38] = 32767;
            }
        }
        return field988;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)I")
    private final int method408(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field985[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field996[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
    public static void method409() {
        field988 = null;
        field996 = null;
        field985 = null;
        field1004 = null;
        field999 = null;
        field998 = null;
        field1003 = null;
        field1005 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field996[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field985 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field985[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field988 = new int[220500];
        field998 = new int[5];
        field999 = new int[5];
        field1004 = new int[5];
        field1003 = new int[5];
        field1005 = new int[5];
    }
}
