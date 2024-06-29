import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class370 {

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    private int field5293 = 0;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "[I")
    private int[] field5299 = new int[5];

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    private int field5288 = 100;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public int field5295 = 0;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "[I")
    private int[] field5291 = new int[5];

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "[I")
    private int[] field5302 = new int[5];

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public int field5310 = 500;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "[I")
    private static int[] field5303 = new int[32768];

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[I")
    private static int[] field5292;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[I")
    private static int[] field5290;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "[I")
    private static int[] field5309;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "[I")
    private static int[] field5306;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "[I")
    private static int[] field5307;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "[I")
    private static int[] field5305;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "[I")
    private static int[] field5308;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lng;")
    private class123 field5286;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lng;")
    private class123 field5287;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lng;")
    private class123 field5289;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Lng;")
    private class123 field5294;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Lng;")
    private class123 field5296;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lng;")
    private class123 field5297;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Lng;")
    private class123 field5300;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lng;")
    private class123 field5301;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Lng;")
    private class123 field5304;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lk;")
    private class316 field5298;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
    public final int[] method2237(int arg0, int arg1) {
        class268.method1623(field5290, 0, arg0);
        if (arg1 < 10) {
            return field5290;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5287.method592();
        this.field5289.method592();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5296 != null) {
            this.field5296.method592();
            this.field5286.method592();
            var5 = (int) ((double) (this.field5296.field1522 - this.field5296.field1524) * 32.768D / var3);
            var6 = (int) ((double) this.field5296.field1524 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5297 != null) {
            this.field5297.method592();
            this.field5304.method592();
            var8 = (int) ((double) (this.field5297.field1522 - this.field5297.field1524) * 32.768D / var3);
            var9 = (int) ((double) this.field5297.field1524 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5302[var11] != 0) {
                field5306[var11] = 0;
                field5309[var11] = (int) ((double) this.field5299[var11] * var3);
                field5308[var11] = (this.field5302[var11] << 14) / 100;
                field5305[var11] = (int) ((double) (this.field5287.field1522 - this.field5287.field1524) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5291[var11]) / var3);
                field5307[var11] = (int) ((double) this.field5287.field1524 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field5287.method591(arg0);
            int var40 = this.field5289.method591(arg0);
            if (this.field5296 != null) {
                int var41 = this.field5296.method591(arg0);
                int var42 = this.field5286.method591(arg0);
                var39 += this.method2240(var7, var42, this.field5296.field1525) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field5297 != null) {
                int var43 = this.field5297.method591(arg0);
                int var44 = this.field5304.method591(arg0);
                var40 = var40 * ((this.method2240(var10, var44, this.field5297.field1525) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field5302[var45] != 0) {
                    int var46 = field5309[var45] + var12;
                    if (var46 < arg0) {
                        field5290[var46] += this.method2240(field5306[var45], field5308[var45] * var40 >> 15, this.field5287.field1525);
                        field5306[var45] += (field5305[var45] * var39 >> 16) + field5307[var45];
                    }
                }
            }
        }
        if (this.field5301 != null) {
            this.field5301.method592();
            this.field5300.method592();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field5301.method591(arg0);
                int var18 = this.field5300.method591(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field5301.field1522 - this.field5301.field1524) * var17 >> 8) + this.field5301.field1524;
                } else {
                    var19 = ((this.field5301.field1522 - this.field5301.field1524) * var18 >> 8) + this.field5301.field1524;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field5290[var16] = 0;
                }
            }
        }
        if (this.field5293 > 0 && this.field5288 > 0) {
            int var20 = (int) ((double) this.field5293 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field5290[var21] += field5290[var21 - var20] * this.field5288 / 100;
            }
        }
        if (this.field5298.field4621[0] > 0 || this.field5298.field4621[1] > 0) {
            this.field5294.method592();
            int var22 = this.field5294.method591(arg0 + 1);
            int var23 = this.field5298.method1952(0, (float) var22 / 65536.0F);
            int var24 = this.field5298.method1952(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field5290[var23 + var25] * (long) class316.field4618 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field5290[var23 + var25 - var36 - 1] * (long) class316.field4617[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field5290[var25 - var37 - 1] * (long) class316.field4617[1][var37] >> 16);
                    }
                    field5290[var25] = var35;
                    var22 = this.field5294.method591(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field5290[var23 + var25] * (long) class316.field4618 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field5290[var23 + var25 - var33 - 1] * (long) class316.field4617[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field5290[var25 - var34 - 1] * (long) class316.field4617[1][var34] >> 16);
                        }
                        field5290[var25] = var32;
                        var22 = this.field5294.method591(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field5290[var23 + var25 - var29 - 1] * (long) class316.field4617[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field5290[var25 - var30 - 1] * (long) class316.field4617[1][var30] >> 16);
                            }
                            field5290[var25] = var28;
                            this.field5294.method591(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field5298.method1952(0, (float) var22 / 65536.0F);
                    var24 = this.field5298.method1952(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field5290[var38] < -32768) {
                field5290[var38] = -32768;
            }
            if (field5290[var38] > 32767) {
                field5290[var38] = 32767;
            }
        }
        return field5290;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
    public static void method2238() {
        field5290 = null;
        field5303 = null;
        field5292 = null;
        field5306 = null;
        field5309 = null;
        field5308 = null;
        field5305 = null;
        field5307 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lvt;)V")
    public final void method2239(class179 arg0) {
        this.field5287 = new class123();
        this.field5287.method594(arg0);
        this.field5289 = new class123();
        this.field5289.method594(arg0);
        int var2 = arg0.method895((byte) -83);
        if (var2 != 0) {
            arg0.field2206--;
            this.field5296 = new class123();
            this.field5296.method594(arg0);
            this.field5286 = new class123();
            this.field5286.method594(arg0);
        }
        int var3 = arg0.method895((byte) -127);
        if (var3 != 0) {
            arg0.field2206--;
            this.field5297 = new class123();
            this.field5297.method594(arg0);
            this.field5304 = new class123();
            this.field5304.method594(arg0);
        }
        int var4 = arg0.method895((byte) -82);
        if (var4 != 0) {
            arg0.field2206--;
            this.field5301 = new class123();
            this.field5301.method594(arg0);
            this.field5300 = new class123();
            this.field5300.method594(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method885(true);
            if (var6 == 0) {
                break;
            }
            this.field5302[var5] = var6;
            this.field5291[var5] = arg0.method931(116);
            this.field5299[var5] = arg0.method885(true);
        }
        this.field5293 = arg0.method885(true);
        this.field5288 = arg0.method885(true);
        this.field5310 = arg0.method916(21933);
        this.field5295 = arg0.method916(21933);
        this.field5298 = new class316();
        this.field5294 = new class123();
        this.field5298.method1950(arg0, this.field5294);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
    private final int method2240(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5292[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5303[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5303[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5292 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5292[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5290 = new int[220500];
        field5309 = new int[5];
        field5306 = new int[5];
        field5307 = new int[5];
        field5305 = new int[5];
        field5308 = new int[5];
    }
}
