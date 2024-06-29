import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class585 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    private int field8040 = 100;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "[I")
    private int[] field8047 = new int[5];

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public int field8046 = 0;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    private int field8045 = 0;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public int field8051 = 500;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "[I")
    private int[] field8053 = new int[5];

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "[I")
    private int[] field8062 = new int[5];

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "[I")
    private static int[] field8054 = new int[32768];

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "[I")
    private static int[] field8056;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "[I")
    private static int[] field8050;

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "[I")
    private static int[] field8059;

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "[I")
    private static int[] field8058;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "[I")
    private static int[] field8063;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "[I")
    private static int[] field8061;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "[I")
    private static int[] field8064;

    @OriginalMember(owner = "client!gs", name = "r", descriptor = "Ldq;")
    private class113 field8057;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "Ltu;")
    private class510 field8041;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Ltu;")
    private class510 field8042;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "Ltu;")
    private class510 field8043;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Ltu;")
    private class510 field8044;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "Ltu;")
    private class510 field8048;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "Ltu;")
    private class510 field8049;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "Ltu;")
    private class510 field8052;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "Ltu;")
    private class510 field8055;

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "Ltu;")
    private class510 field8060;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)I")
    private final int method3273(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field8056[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field8054[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I")
    public final int[] method3274(int arg0, int arg1) {
        class657.method3638(field8050, 0, arg0);
        if (arg1 < 10) {
            return field8050;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field8060.method2885();
        this.field8041.method2885();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field8049 != null) {
            this.field8049.method2885();
            this.field8042.method2885();
            var5 = (int) ((double) (this.field8049.field6879 - this.field8049.field6880) * 32.768D / var3);
            var6 = (int) ((double) this.field8049.field6880 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field8055 != null) {
            this.field8055.method2885();
            this.field8052.method2885();
            var8 = (int) ((double) (this.field8055.field6879 - this.field8055.field6880) * 32.768D / var3);
            var9 = (int) ((double) this.field8055.field6880 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field8053[var11] != 0) {
                field8059[var11] = 0;
                field8064[var11] = (int) ((double) this.field8062[var11] * var3);
                field8061[var11] = (this.field8053[var11] << 14) / 100;
                field8058[var11] = (int) ((double) (this.field8060.field6879 - this.field8060.field6880) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field8047[var11]) / var3);
                field8063[var11] = (int) ((double) this.field8060.field6880 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field8060.method2886(arg0);
            int var40 = this.field8041.method2886(arg0);
            if (this.field8049 != null) {
                int var41 = this.field8049.method2886(arg0);
                int var42 = this.field8042.method2886(arg0);
                var39 += this.method3273(var7, var42, this.field8049.field6877) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field8055 != null) {
                int var43 = this.field8055.method2886(arg0);
                int var44 = this.field8052.method2886(arg0);
                var40 = var40 * ((this.method3273(var10, var44, this.field8055.field6877) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field8053[var45] != 0) {
                    int var46 = field8064[var45] + var12;
                    if (var46 < arg0) {
                        field8050[var46] += this.method3273(field8059[var45], field8061[var45] * var40 >> 15, this.field8060.field6877);
                        field8059[var45] += (field8058[var45] * var39 >> 16) + field8063[var45];
                    }
                }
            }
        }
        if (this.field8048 != null) {
            this.field8048.method2885();
            this.field8043.method2885();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field8048.method2886(arg0);
                int var18 = this.field8043.method2886(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field8048.field6879 - this.field8048.field6880) * var17 >> 8) + this.field8048.field6880;
                } else {
                    var19 = ((this.field8048.field6879 - this.field8048.field6880) * var18 >> 8) + this.field8048.field6880;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field8050[var16] = 0;
                }
            }
        }
        if (this.field8045 > 0 && this.field8040 > 0) {
            int var20 = (int) ((double) this.field8045 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field8050[var21] += field8050[var21 - var20] * this.field8040 / 100;
            }
        }
        if (this.field8057.field1373[0] > 0 || this.field8057.field1373[1] > 0) {
            this.field8044.method2885();
            int var22 = this.field8044.method2886(arg0 + 1);
            int var23 = this.field8057.method632(0, (float) var22 / 65536.0F);
            int var24 = this.field8057.method632(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field8050[var23 + var25] * (long) class113.field1372 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field8050[var23 + var25 - var36 - 1] * (long) class113.field1376[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field8050[var25 - var37 - 1] * (long) class113.field1376[1][var37] >> 16);
                    }
                    field8050[var25] = var35;
                    var22 = this.field8044.method2886(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field8050[var23 + var25] * (long) class113.field1372 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field8050[var23 + var25 - var33 - 1] * (long) class113.field1376[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field8050[var25 - var34 - 1] * (long) class113.field1376[1][var34] >> 16);
                        }
                        field8050[var25] = var32;
                        var22 = this.field8044.method2886(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field8050[var23 + var25 - var29 - 1] * (long) class113.field1376[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field8050[var25 - var30 - 1] * (long) class113.field1376[1][var30] >> 16);
                            }
                            field8050[var25] = var28;
                            this.field8044.method2886(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field8057.method632(0, (float) var22 / 65536.0F);
                    var24 = this.field8057.method632(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field8050[var38] < -32768) {
                field8050[var38] = -32768;
            }
            if (field8050[var38] > 32767) {
                field8050[var38] = 32767;
            }
        }
        return field8050;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ldga;)V")
    public final void method3275(class138 arg0) {
        this.field8060 = new class510();
        this.field8060.method2884(arg0);
        this.field8041 = new class510();
        this.field8041.method2884(arg0);
        int var2 = arg0.method957((byte) -81);
        if (var2 != 0) {
            arg0.field1745--;
            this.field8049 = new class510();
            this.field8049.method2884(arg0);
            this.field8042 = new class510();
            this.field8042.method2884(arg0);
        }
        int var3 = arg0.method957((byte) -108);
        if (var3 != 0) {
            arg0.field1745--;
            this.field8055 = new class510();
            this.field8055.method2884(arg0);
            this.field8052 = new class510();
            this.field8052.method2884(arg0);
        }
        int var4 = arg0.method957((byte) -67);
        if (var4 != 0) {
            arg0.field1745--;
            this.field8048 = new class510();
            this.field8048.method2884(arg0);
            this.field8043 = new class510();
            this.field8043.method2884(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method914(61);
            if (var6 == 0) {
                break;
            }
            this.field8053[var5] = var6;
            this.field8047[var5] = arg0.method931(-123);
            this.field8062[var5] = arg0.method914(79);
        }
        this.field8045 = arg0.method914(64);
        this.field8040 = arg0.method914(75);
        this.field8051 = arg0.method922((byte) -123);
        this.field8046 = arg0.method922((byte) -125);
        this.field8057 = new class113();
        this.field8044 = new class510();
        this.field8057.method635(arg0, this.field8044);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "()V")
    public static void method3276() {
        field8050 = null;
        field8054 = null;
        field8056 = null;
        field8059 = null;
        field8064 = null;
        field8061 = null;
        field8058 = null;
        field8063 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field8054[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field8056 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field8056[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field8050 = new int[220500];
        field8059 = new int[5];
        field8058 = new int[5];
        field8063 = new int[5];
        field8061 = new int[5];
        field8064 = new int[5];
    }
}
