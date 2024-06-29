import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class269 {

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public int field4068 = 500;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public int field4070 = 0;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "[I")
    private int[] field4071 = new int[5];

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "[I")
    private int[] field4066 = new int[5];

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "[I")
    private int[] field4075 = new int[5];

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    private int field4085 = 0;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    private int field4087 = 100;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "[I")
    private static int[] field4064 = new int[32768];

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "[I")
    private static int[] field4078;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "[I")
    private static int[] field4065;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "[I")
    private static int[] field4083;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "[I")
    private static int[] field4081;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "[I")
    private static int[] field4088;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "[I")
    private static int[] field4086;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "[I")
    private static int[] field4082;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "Lkv;")
    private class178 field4074;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Lcs;")
    private class228 field4067;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Lcs;")
    private class228 field4069;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "Lcs;")
    private class228 field4072;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Lcs;")
    private class228 field4073;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Lcs;")
    private class228 field4076;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "Lcs;")
    private class228 field4077;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "Lcs;")
    private class228 field4079;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "Lcs;")
    private class228 field4080;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "Lcs;")
    private class228 field4084;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4064[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4078 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4078[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4065 = new int[220500];
        field4083 = new int[5];
        field4081 = new int[5];
        field4088 = new int[5];
        field4086 = new int[5];
        field4082 = new int[5];
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)I", line = 21)
    private final int method1707(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4078[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4064[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[I", line = 42)
    public final int[] method1708(int arg0, int arg1) {
        class394.method2452(field4065, 0, arg0);
        if (arg1 < 10) {
            return field4065;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4069.method1512();
        this.field4067.method1512();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4076 != null) {
            this.field4076.method1512();
            this.field4072.method1512();
            var5 = (int) ((double) (this.field4076.field3543 - this.field4076.field3542) * 32.768D / var3);
            var6 = (int) ((double) this.field4076.field3542 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4073 != null) {
            this.field4073.method1512();
            this.field4077.method1512();
            var8 = (int) ((double) (this.field4073.field3543 - this.field4073.field3542) * 32.768D / var3);
            var9 = (int) ((double) this.field4073.field3542 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4066[var11] != 0) {
                field4082[var11] = 0;
                field4083[var11] = (int) ((double) this.field4075[var11] * var3);
                field4088[var11] = (this.field4066[var11] << 14) / 100;
                field4081[var11] = (int) ((double) (this.field4069.field3543 - this.field4069.field3542) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4071[var11]) / var3);
                field4086[var11] = (int) ((double) this.field4069.field3542 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4069.method1510(arg0);
            int var40 = this.field4067.method1510(arg0);
            if (this.field4076 != null) {
                int var41 = this.field4076.method1510(arg0);
                int var42 = this.field4072.method1510(arg0);
                var39 += this.method1707(var7, var42, this.field4076.field3545) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4073 != null) {
                int var43 = this.field4073.method1510(arg0);
                int var44 = this.field4077.method1510(arg0);
                var40 = var40 * ((this.method1707(var10, var44, this.field4073.field3545) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4066[var45] != 0) {
                    int var46 = field4083[var45] + var12;
                    if (var46 < arg0) {
                        field4065[var46] += this.method1707(field4082[var45], field4088[var45] * var40 >> 15, this.field4069.field3545);
                        field4082[var45] += (field4081[var45] * var39 >> 16) + field4086[var45];
                    }
                }
            }
        }
        if (this.field4079 != null) {
            this.field4079.method1512();
            this.field4084.method1512();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4079.method1510(arg0);
                int var18 = this.field4084.method1510(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4079.field3543 - this.field4079.field3542) * var17 >> 8) + this.field4079.field3542;
                } else {
                    var19 = ((this.field4079.field3543 - this.field4079.field3542) * var18 >> 8) + this.field4079.field3542;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4065[var16] = 0;
                }
            }
        }
        if (this.field4085 > 0 && this.field4087 > 0) {
            int var20 = (int) ((double) this.field4085 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4065[var21] += field4065[var21 - var20] * this.field4087 / 100;
            }
        }
        if (this.field4074.field2876[0] > 0 || this.field4074.field2876[1] > 0) {
            this.field4080.method1512();
            int var22 = this.field4080.method1510(arg0 + 1);
            int var23 = this.field4074.method1221(0, (float) var22 / 65536.0F);
            int var24 = this.field4074.method1221(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4065[var23 + var25] * (long) class178.field2879 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4065[var23 + var25 - var36 - 1] * (long) class178.field2878[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4065[var25 - var37 - 1] * (long) class178.field2878[1][var37] >> 16);
                    }
                    field4065[var25] = var35;
                    var22 = this.field4080.method1510(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4065[var23 + var25] * (long) class178.field2879 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4065[var23 + var25 - var33 - 1] * (long) class178.field2878[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4065[var25 - var34 - 1] * (long) class178.field2878[1][var34] >> 16);
                        }
                        field4065[var25] = var32;
                        var22 = this.field4080.method1510(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4065[var23 + var25 - var29 - 1] * (long) class178.field2878[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4065[var25 - var30 - 1] * (long) class178.field2878[1][var30] >> 16);
                            }
                            field4065[var25] = var28;
                            this.field4080.method1510(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4074.method1221(0, (float) var22 / 65536.0F);
                    var24 = this.field4074.method1221(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4065[var38] < -32768) {
                field4065[var38] = -32768;
            }
            if (field4065[var38] > 32767) {
                field4065[var38] = 32767;
            }
        }
        return field4065;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "()V", line = 335)
    public static void method1709() {
        field4065 = null;
        field4064 = null;
        field4078 = null;
        field4082 = null;
        field4083 = null;
        field4088 = null;
        field4081 = null;
        field4086 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lnn;)V", line = 398)
    public final void method1710(class289 arg0) {
        this.field4069 = new class228();
        this.field4069.method1511(arg0);
        this.field4067 = new class228();
        this.field4067.method1511(arg0);
        int var2 = arg0.method1858(-3256);
        if (var2 != 0) {
            arg0.field4399--;
            this.field4076 = new class228();
            this.field4076.method1511(arg0);
            this.field4072 = new class228();
            this.field4072.method1511(arg0);
        }
        int var3 = arg0.method1858(-3256);
        if (var3 != 0) {
            arg0.field4399--;
            this.field4073 = new class228();
            this.field4073.method1511(arg0);
            this.field4077 = new class228();
            this.field4077.method1511(arg0);
        }
        int var4 = arg0.method1858(-3256);
        if (var4 != 0) {
            arg0.field4399--;
            this.field4079 = new class228();
            this.field4079.method1511(arg0);
            this.field4084 = new class228();
            this.field4084.method1511(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1825((byte) -114);
            if (var6 == 0) {
                break;
            }
            this.field4066[var5] = var6;
            this.field4071[var5] = arg0.method1818(255);
            this.field4075[var5] = arg0.method1825((byte) -114);
        }
        this.field4085 = arg0.method1825((byte) -114);
        this.field4087 = arg0.method1825((byte) -114);
        this.field4068 = arg0.method1841((byte) -119);
        this.field4070 = arg0.method1841((byte) -125);
        this.field4074 = new class178();
        this.field4080 = new class228();
        this.field4074.method1220(arg0, this.field4080);
    }
}
