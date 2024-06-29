import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class213 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[I")
    private int[] field3973 = new int[5];

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "[I")
    private int[] field3984 = new int[5];

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public int field3980 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "[I")
    private int[] field3979 = new int[5];

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    private int field3987 = 100;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    private int field3985 = 0;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public int field3988 = 500;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "[I")
    private static int[] field3982 = new int[32768];

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "[I")
    private static int[] field3990;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "[I")
    private static int[] field3975;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "[I")
    private static int[] field3991;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "[I")
    private static int[] field3993;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "[I")
    private static int[] field3992;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "[I")
    private static int[] field3994;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "[I")
    private static int[] field3995;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Lcd;")
    private class27 field3978;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lja;")
    private class98 field3971;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lja;")
    private class98 field3972;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lja;")
    private class98 field3974;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lja;")
    private class98 field3976;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lja;")
    private class98 field3977;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lja;")
    private class98 field3981;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Lja;")
    private class98 field3983;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lja;")
    private class98 field3986;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "Lja;")
    private class98 field3989;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lce;)V")
    public final void method1411(class28 arg0) {
        this.field3986 = new class98();
        this.field3986.method654(arg0);
        this.field3977 = new class98();
        this.field3977.method654(arg0);
        int var2 = arg0.method215(-1797813752);
        if (var2 != 0) {
            arg0.field526--;
            this.field3983 = new class98();
            this.field3983.method654(arg0);
            this.field3974 = new class98();
            this.field3974.method654(arg0);
        }
        int var3 = arg0.method215(-1797813752);
        if (var3 != 0) {
            arg0.field526--;
            this.field3989 = new class98();
            this.field3989.method654(arg0);
            this.field3972 = new class98();
            this.field3972.method654(arg0);
        }
        int var4 = arg0.method215(-1797813752);
        if (var4 != 0) {
            arg0.field526--;
            this.field3971 = new class98();
            this.field3971.method654(arg0);
            this.field3976 = new class98();
            this.field3976.method654(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method186((byte) 29);
            if (var6 == 0) {
                break;
            }
            this.field3973[var5] = var6;
            this.field3979[var5] = arg0.method213(true);
            this.field3984[var5] = arg0.method186((byte) 19);
        }
        this.field3985 = arg0.method186((byte) 40);
        this.field3987 = arg0.method186((byte) 113);
        this.field3988 = arg0.method230((byte) -127);
        this.field3980 = arg0.method230((byte) -98);
        this.field3978 = new class27();
        this.field3981 = new class98();
        this.field3978.method179(arg0, this.field3981);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
    private final int method1412(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3990[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3982[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I")
    public final int[] method1413(int arg0, int arg1) {
        class4.method33(field3975, 0, arg0);
        if (arg1 < 10) {
            return field3975;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3986.method653();
        this.field3977.method653();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3983 != null) {
            this.field3983.method653();
            this.field3974.method653();
            var5 = (int) ((double) (this.field3983.field1706 - this.field3983.field1709) * 32.768D / var3);
            var6 = (int) ((double) this.field3983.field1709 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3989 != null) {
            this.field3989.method653();
            this.field3972.method653();
            var8 = (int) ((double) (this.field3989.field1706 - this.field3989.field1709) * 32.768D / var3);
            var9 = (int) ((double) this.field3989.field1709 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3973[var11] != 0) {
                field3992[var11] = 0;
                field3991[var11] = (int) ((double) this.field3984[var11] * var3);
                field3994[var11] = (this.field3973[var11] << 14) / 100;
                field3995[var11] = (int) ((double) (this.field3986.field1706 - this.field3986.field1709) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3979[var11]) / var3);
                field3993[var11] = (int) ((double) this.field3986.field1709 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3986.method655(arg0);
            int var40 = this.field3977.method655(arg0);
            if (this.field3983 != null) {
                int var41 = this.field3983.method655(arg0);
                int var42 = this.field3974.method655(arg0);
                var39 += this.method1412(var7, var42, this.field3983.field1711) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3989 != null) {
                int var43 = this.field3989.method655(arg0);
                int var44 = this.field3972.method655(arg0);
                var40 = var40 * ((this.method1412(var10, var44, this.field3989.field1711) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3973[var45] != 0) {
                    int var46 = field3991[var45] + var12;
                    if (var46 < arg0) {
                        field3975[var46] += this.method1412(field3992[var45], field3994[var45] * var40 >> 15, this.field3986.field1711);
                        field3992[var45] += (field3995[var45] * var39 >> 16) + field3993[var45];
                    }
                }
            }
        }
        if (this.field3971 != null) {
            this.field3971.method653();
            this.field3976.method653();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3971.method655(arg0);
                int var18 = this.field3976.method655(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3971.field1706 - this.field3971.field1709) * var17 >> 8) + this.field3971.field1709;
                } else {
                    var19 = ((this.field3971.field1706 - this.field3971.field1709) * var18 >> 8) + this.field3971.field1709;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3975[var16] = 0;
                }
            }
        }
        if (this.field3985 > 0 && this.field3987 > 0) {
            int var20 = (int) ((double) this.field3985 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3975[var21] += field3975[var21 - var20] * this.field3987 / 100;
            }
        }
        if (this.field3978.field462[0] > 0 || this.field3978.field462[1] > 0) {
            this.field3981.method653();
            int var22 = this.field3981.method655(arg0 + 1);
            int var23 = this.field3978.method176(0, (float) var22 / 65536.0F);
            int var24 = this.field3978.method176(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3975[var23 + var25] * (long) class27.field463 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3975[var23 + var25 - var36 - 1] * (long) class27.field459[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3975[var25 - var37 - 1] * (long) class27.field459[1][var37] >> 16);
                    }
                    field3975[var25] = var35;
                    var22 = this.field3981.method655(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3975[var23 + var25] * (long) class27.field463 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3975[var23 + var25 - var33 - 1] * (long) class27.field459[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3975[var25 - var34 - 1] * (long) class27.field459[1][var34] >> 16);
                        }
                        field3975[var25] = var32;
                        var22 = this.field3981.method655(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3975[var23 + var25 - var29 - 1] * (long) class27.field459[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3975[var25 - var30 - 1] * (long) class27.field459[1][var30] >> 16);
                            }
                            field3975[var25] = var28;
                            this.field3981.method655(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3978.method176(0, (float) var22 / 65536.0F);
                    var24 = this.field3978.method176(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3975[var38] < -32768) {
                field3975[var38] = -32768;
            }
            if (field3975[var38] > 32767) {
                field3975[var38] = 32767;
            }
        }
        return field3975;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
    public static void method1414() {
        field3975 = null;
        field3982 = null;
        field3990 = null;
        field3992 = null;
        field3991 = null;
        field3994 = null;
        field3995 = null;
        field3993 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3982[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3990 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3990[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3975 = new int[220500];
        field3991 = new int[5];
        field3993 = new int[5];
        field3992 = new int[5];
        field3994 = new int[5];
        field3995 = new int[5];
    }
}
