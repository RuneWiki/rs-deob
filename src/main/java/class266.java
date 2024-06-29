import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class266 {

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
    private int[] field4058 = new int[5];

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public int field4069 = 0;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    private int field4075 = 0;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field4061 = 500;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "[I")
    private int[] field4076 = new int[5];

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    private int field4072 = 100;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "[I")
    private int[] field4077 = new int[5];

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[I")
    private static int[] field4063 = new int[32768];

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "[I")
    private static int[] field4064;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "[I")
    private static int[] field4074;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[I")
    private static int[] field4079;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "[I")
    private static int[] field4080;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[I")
    private static int[] field4082;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
    private static int[] field4081;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[I")
    private static int[] field4078;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lvk;")
    private class386 field4059;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lvk;")
    private class386 field4060;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lvk;")
    private class386 field4062;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lvk;")
    private class386 field4065;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lvk;")
    private class386 field4066;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lvk;")
    private class386 field4067;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lvk;")
    private class386 field4068;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Lvk;")
    private class386 field4071;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lvk;")
    private class386 field4073;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "Lur;")
    private class563 field4070;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4063[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4064 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4064[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4074 = new int[220500];
        field4079 = new int[5];
        field4080 = new int[5];
        field4082 = new int[5];
        field4081 = new int[5];
        field4078 = new int[5];
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lib;)V", line = 10)
    public final void method2218(class163 arg0) {
        this.field4068 = new class386();
        this.field4068.method3082(arg0);
        this.field4071 = new class386();
        this.field4071.method3082(arg0);
        int var2 = arg0.method1455((byte) 62);
        if (var2 != 0) {
            arg0.field2201--;
            this.field4065 = new class386();
            this.field4065.method3082(arg0);
            this.field4060 = new class386();
            this.field4060.method3082(arg0);
        }
        int var3 = arg0.method1455((byte) 62);
        if (var3 != 0) {
            arg0.field2201--;
            this.field4059 = new class386();
            this.field4059.method3082(arg0);
            this.field4067 = new class386();
            this.field4067.method3082(arg0);
        }
        int var4 = arg0.method1455((byte) 62);
        if (var4 != 0) {
            arg0.field2201--;
            this.field4062 = new class386();
            this.field4062.method3082(arg0);
            this.field4073 = new class386();
            this.field4073.method3082(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1425(100);
            if (var6 == 0) {
                break;
            }
            this.field4058[var5] = var6;
            this.field4076[var5] = arg0.method1407((byte) -42);
            this.field4077[var5] = arg0.method1425(14);
        }
        this.field4075 = arg0.method1425(11);
        this.field4072 = arg0.method1425(114);
        this.field4061 = arg0.method1445((byte) 114);
        this.field4069 = arg0.method1445((byte) 109);
        this.field4070 = new class563();
        this.field4066 = new class386();
        this.field4070.method4207(arg0, this.field4066);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 87)
    public static void method2219() {
        field4074 = null;
        field4063 = null;
        field4064 = null;
        field4081 = null;
        field4078 = null;
        field4079 = null;
        field4080 = null;
        field4082 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[I", line = 101)
    public final int[] method2220(int arg0, int arg1) {
        class467.method3557(field4074, 0, arg0);
        if (arg1 < 10) {
            return field4074;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4068.method3085();
        this.field4071.method3085();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4065 != null) {
            this.field4065.method3085();
            this.field4060.method3085();
            var5 = (int) ((double) (this.field4065.field5832 - this.field4065.field5829) * 32.768D / var3);
            var6 = (int) ((double) this.field4065.field5829 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4059 != null) {
            this.field4059.method3085();
            this.field4067.method3085();
            var8 = (int) ((double) (this.field4059.field5832 - this.field4059.field5829) * 32.768D / var3);
            var9 = (int) ((double) this.field4059.field5829 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4058[var11] != 0) {
                field4081[var11] = 0;
                field4078[var11] = (int) ((double) this.field4077[var11] * var3);
                field4079[var11] = (this.field4058[var11] << 14) / 100;
                field4080[var11] = (int) ((double) (this.field4068.field5832 - this.field4068.field5829) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4076[var11]) / var3);
                field4082[var11] = (int) ((double) this.field4068.field5829 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4068.method3083(arg0);
            int var40 = this.field4071.method3083(arg0);
            if (this.field4065 != null) {
                int var41 = this.field4065.method3083(arg0);
                int var42 = this.field4060.method3083(arg0);
                var39 += this.method2221(var7, var42, this.field4065.field5831) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4059 != null) {
                int var43 = this.field4059.method3083(arg0);
                int var44 = this.field4067.method3083(arg0);
                var40 = var40 * ((this.method2221(var10, var44, this.field4059.field5831) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4058[var45] != 0) {
                    int var46 = field4078[var45] + var12;
                    if (var46 < arg0) {
                        field4074[var46] += this.method2221(field4081[var45], field4079[var45] * var40 >> 15, this.field4068.field5831);
                        field4081[var45] += (field4080[var45] * var39 >> 16) + field4082[var45];
                    }
                }
            }
        }
        if (this.field4062 != null) {
            this.field4062.method3085();
            this.field4073.method3085();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4062.method3083(arg0);
                int var18 = this.field4073.method3083(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4062.field5832 - this.field4062.field5829) * var17 >> 8) + this.field4062.field5829;
                } else {
                    var19 = ((this.field4062.field5832 - this.field4062.field5829) * var18 >> 8) + this.field4062.field5829;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4074[var16] = 0;
                }
            }
        }
        if (this.field4075 > 0 && this.field4072 > 0) {
            int var20 = (int) ((double) this.field4075 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4074[var21] += field4074[var21 - var20] * this.field4072 / 100;
            }
        }
        if (this.field4070.field8361[0] > 0 || this.field4070.field8361[1] > 0) {
            this.field4066.method3085();
            int var22 = this.field4066.method3083(arg0 + 1);
            int var23 = this.field4070.method4205(0, (float) var22 / 65536.0F);
            int var24 = this.field4070.method4205(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4074[var23 + var25] * (long) class563.field8359 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4074[var23 + var25 - var36 - 1] * (long) class563.field8358[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4074[var25 - var37 - 1] * (long) class563.field8358[1][var37] >> 16);
                    }
                    field4074[var25] = var35;
                    var22 = this.field4066.method3083(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4074[var23 + var25] * (long) class563.field8359 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4074[var23 + var25 - var33 - 1] * (long) class563.field8358[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4074[var25 - var34 - 1] * (long) class563.field8358[1][var34] >> 16);
                        }
                        field4074[var25] = var32;
                        var22 = this.field4066.method3083(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4074[var23 + var25 - var29 - 1] * (long) class563.field8358[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4074[var25 - var30 - 1] * (long) class563.field8358[1][var30] >> 16);
                            }
                            field4074[var25] = var28;
                            this.field4066.method3083(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4070.method4205(0, (float) var22 / 65536.0F);
                    var24 = this.field4070.method4205(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4074[var38] < -32768) {
                field4074[var38] = -32768;
            }
            if (field4074[var38] > 32767) {
                field4074[var38] = 32767;
            }
        }
        return field4074;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I", line = 382)
    private final int method2221(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4064[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4063[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
