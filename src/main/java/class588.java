import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class588 {

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "I")
    private int field8288 = 100;

    @OriginalMember(owner = "client!rha", name = "m", descriptor = "[I")
    private int[] field8299 = new int[5];

    @OriginalMember(owner = "client!rha", name = "j", descriptor = "I")
    public int field8296 = 0;

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "[I")
    private int[] field8289 = new int[5];

    @OriginalMember(owner = "client!rha", name = "i", descriptor = "I")
    public int field8295 = 500;

    @OriginalMember(owner = "client!rha", name = "l", descriptor = "I")
    private int field8298 = 0;

    @OriginalMember(owner = "client!rha", name = "q", descriptor = "[I")
    private int[] field8303 = new int[5];

    @OriginalMember(owner = "client!rha", name = "o", descriptor = "[I")
    private static int[] field8301 = new int[32768];

    @OriginalMember(owner = "client!rha", name = "g", descriptor = "[I")
    private static int[] field8293;

    @OriginalMember(owner = "client!rha", name = "e", descriptor = "[I")
    private static int[] field8291;

    @OriginalMember(owner = "client!rha", name = "t", descriptor = "[I")
    private static int[] field8306;

    @OriginalMember(owner = "client!rha", name = "s", descriptor = "[I")
    private static int[] field8305;

    @OriginalMember(owner = "client!rha", name = "w", descriptor = "[I")
    private static int[] field8309;

    @OriginalMember(owner = "client!rha", name = "x", descriptor = "[I")
    private static int[] field8310;

    @OriginalMember(owner = "client!rha", name = "v", descriptor = "[I")
    private static int[] field8308;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "Lsc;")
    private class450 field8287;

    @OriginalMember(owner = "client!rha", name = "d", descriptor = "Lsc;")
    private class450 field8290;

    @OriginalMember(owner = "client!rha", name = "h", descriptor = "Lsc;")
    private class450 field8294;

    @OriginalMember(owner = "client!rha", name = "k", descriptor = "Lsc;")
    private class450 field8297;

    @OriginalMember(owner = "client!rha", name = "n", descriptor = "Lsc;")
    private class450 field8300;

    @OriginalMember(owner = "client!rha", name = "p", descriptor = "Lsc;")
    private class450 field8302;

    @OriginalMember(owner = "client!rha", name = "r", descriptor = "Lsc;")
    private class450 field8304;

    @OriginalMember(owner = "client!rha", name = "u", descriptor = "Lsc;")
    private class450 field8307;

    @OriginalMember(owner = "client!rha", name = "y", descriptor = "Lsc;")
    private class450 field8311;

    @OriginalMember(owner = "client!rha", name = "f", descriptor = "Lpo;")
    private class578 field8292;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(II)[I")
    public final int[] method3383(int arg0, int arg1) {
        class571.method3311(field8291, 0, arg0);
        if (arg1 < 10) {
            return field8291;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field8290.method2764();
        this.field8304.method2764();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field8307 != null) {
            this.field8307.method2764();
            this.field8300.method2764();
            var5 = (int) ((double) (this.field8307.field6559 - this.field8307.field6558) * 32.768D / var3);
            var6 = (int) ((double) this.field8307.field6558 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field8297 != null) {
            this.field8297.method2764();
            this.field8287.method2764();
            var8 = (int) ((double) (this.field8297.field6559 - this.field8297.field6558) * 32.768D / var3);
            var9 = (int) ((double) this.field8297.field6558 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field8303[var11] != 0) {
                field8305[var11] = 0;
                field8306[var11] = (int) ((double) this.field8299[var11] * var3);
                field8308[var11] = (this.field8303[var11] << 14) / 100;
                field8310[var11] = (int) ((double) (this.field8290.field6559 - this.field8290.field6558) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field8289[var11]) / var3);
                field8309[var11] = (int) ((double) this.field8290.field6558 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field8290.method2766(arg0);
            int var40 = this.field8304.method2766(arg0);
            if (this.field8307 != null) {
                int var41 = this.field8307.method2766(arg0);
                int var42 = this.field8300.method2766(arg0);
                var39 += this.method3386(var7, var42, this.field8307.field6556) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field8297 != null) {
                int var43 = this.field8297.method2766(arg0);
                int var44 = this.field8287.method2766(arg0);
                var40 = var40 * ((this.method3386(var10, var44, this.field8297.field6556) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field8303[var45] != 0) {
                    int var46 = field8306[var45] + var12;
                    if (var46 < arg0) {
                        field8291[var46] += this.method3386(field8305[var45], field8308[var45] * var40 >> 15, this.field8290.field6556);
                        field8305[var45] += (field8310[var45] * var39 >> 16) + field8309[var45];
                    }
                }
            }
        }
        if (this.field8302 != null) {
            this.field8302.method2764();
            this.field8294.method2764();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field8302.method2766(arg0);
                int var18 = this.field8294.method2766(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field8302.field6559 - this.field8302.field6558) * var17 >> 8) + this.field8302.field6558;
                } else {
                    var19 = ((this.field8302.field6559 - this.field8302.field6558) * var18 >> 8) + this.field8302.field6558;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field8291[var16] = 0;
                }
            }
        }
        if (this.field8298 > 0 && this.field8288 > 0) {
            int var20 = (int) ((double) this.field8298 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field8291[var21] += field8291[var21 - var20] * this.field8288 / 100;
            }
        }
        if (this.field8292.field8184[0] > 0 || this.field8292.field8184[1] > 0) {
            this.field8311.method2764();
            int var22 = this.field8311.method2766(arg0 + 1);
            int var23 = this.field8292.method3345(0, (float) var22 / 65536.0F);
            int var24 = this.field8292.method3345(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field8291[var23 + var25] * (long) class578.field8187 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field8291[var23 + var25 - var36 - 1] * (long) class578.field8183[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field8291[var25 - var37 - 1] * (long) class578.field8183[1][var37] >> 16);
                    }
                    field8291[var25] = var35;
                    var22 = this.field8311.method2766(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field8291[var23 + var25] * (long) class578.field8187 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field8291[var23 + var25 - var33 - 1] * (long) class578.field8183[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field8291[var25 - var34 - 1] * (long) class578.field8183[1][var34] >> 16);
                        }
                        field8291[var25] = var32;
                        var22 = this.field8311.method2766(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field8291[var23 + var25 - var29 - 1] * (long) class578.field8183[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field8291[var25 - var30 - 1] * (long) class578.field8183[1][var30] >> 16);
                            }
                            field8291[var25] = var28;
                            this.field8311.method2766(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field8292.method3345(0, (float) var22 / 65536.0F);
                    var24 = this.field8292.method3345(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field8291[var38] < -32768) {
                field8291[var38] = -32768;
            }
            if (field8291[var38] > 32767) {
                field8291[var38] = 32767;
            }
        }
        return field8291;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lofa;)V")
    public final void method3384(class301 arg0) {
        this.field8290 = new class450();
        this.field8290.method2763(arg0);
        this.field8304 = new class450();
        this.field8304.method2763(arg0);
        int var2 = arg0.method1987(-11);
        if (var2 != 0) {
            arg0.field4534--;
            this.field8307 = new class450();
            this.field8307.method2763(arg0);
            this.field8300 = new class450();
            this.field8300.method2763(arg0);
        }
        int var3 = arg0.method1987(-97);
        if (var3 != 0) {
            arg0.field4534--;
            this.field8297 = new class450();
            this.field8297.method2763(arg0);
            this.field8287 = new class450();
            this.field8287.method2763(arg0);
        }
        int var4 = arg0.method1987(-39);
        if (var4 != 0) {
            arg0.field4534--;
            this.field8302 = new class450();
            this.field8302.method2763(arg0);
            this.field8294 = new class450();
            this.field8294.method2763(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1968((byte) 127);
            if (var6 == 0) {
                break;
            }
            this.field8303[var5] = var6;
            this.field8289[var5] = arg0.method1985(-1189380592);
            this.field8299[var5] = arg0.method1968((byte) 59);
        }
        this.field8298 = arg0.method1968((byte) 49);
        this.field8288 = arg0.method1968((byte) 126);
        this.field8295 = arg0.method1989((byte) -45);
        this.field8296 = arg0.method1989((byte) -126);
        this.field8292 = new class578();
        this.field8311 = new class450();
        this.field8292.method3343(arg0, this.field8311);
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "()V")
    public static void method3385() {
        field8291 = null;
        field8301 = null;
        field8293 = null;
        field8305 = null;
        field8306 = null;
        field8308 = null;
        field8310 = null;
        field8309 = null;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(III)I")
    private final int method3386(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field8293[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field8301[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field8301[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field8293 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field8293[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field8291 = new int[220500];
        field8306 = new int[5];
        field8305 = new int[5];
        field8309 = new int[5];
        field8310 = new int[5];
        field8308 = new int[5];
    }
}
