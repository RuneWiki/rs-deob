import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class291 {

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    private int field5183 = 0;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    private int field5184 = 100;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "[I")
    private int[] field5186 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public int field5188 = 0;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "[I")
    private int[] field5192 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "[I")
    private int[] field5193 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public int field5197 = 500;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "[I")
    private static int[] field5195 = new int[32768];

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "[I")
    private static int[] field5190;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[I")
    private static int[] field5179;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "[I")
    private static int[] field5199;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "[I")
    private static int[] field5200;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "[I")
    private static int[] field5201;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "[I")
    private static int[] field5198;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "[I")
    private static int[] field5202;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Lkd;")
    private class76 field5178;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lkd;")
    private class76 field5180;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Lkd;")
    private class76 field5182;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Lkd;")
    private class76 field5185;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "Lkd;")
    private class76 field5187;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "Lkd;")
    private class76 field5189;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "Lkd;")
    private class76 field5191;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "Lkd;")
    private class76 field5194;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "Lkd;")
    private class76 field5196;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Lwl;")
    private class89 field5181;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V", line = 12)
    public static void method2075() {
        field5179 = null;
        field5195 = null;
        field5190 = null;
        field5199 = null;
        field5200 = null;
        field5201 = null;
        field5198 = null;
        field5202 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)I", line = 28)
    private final int method2076(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5190[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5195[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lvh;)V", line = 65)
    public final void method2077(class53 arg0) {
        this.field5196 = new class76();
        this.field5196.method649(arg0);
        this.field5180 = new class76();
        this.field5180.method649(arg0);
        int var2 = arg0.method483(-114);
        if (var2 != 0) {
            arg0.field1142--;
            this.field5194 = new class76();
            this.field5194.method649(arg0);
            this.field5178 = new class76();
            this.field5178.method649(arg0);
        }
        int var3 = arg0.method483(-124);
        if (var3 != 0) {
            arg0.field1142--;
            this.field5191 = new class76();
            this.field5191.method649(arg0);
            this.field5187 = new class76();
            this.field5187.method649(arg0);
        }
        int var4 = arg0.method483(-127);
        if (var4 != 0) {
            arg0.field1142--;
            this.field5189 = new class76();
            this.field5189.method649(arg0);
            this.field5182 = new class76();
            this.field5182.method649(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method472((byte) 80);
            if (var6 == 0) {
                break;
            }
            this.field5192[var5] = var6;
            this.field5193[var5] = arg0.method492(28129);
            this.field5186[var5] = arg0.method472((byte) 75);
        }
        this.field5183 = arg0.method472((byte) 110);
        this.field5184 = arg0.method472((byte) 85);
        this.field5197 = arg0.method468(28214);
        this.field5188 = arg0.method468(28214);
        this.field5181 = new class89();
        this.field5185 = new class76();
        this.field5181.method768(arg0, this.field5185);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[I", line = 125)
    public final int[] method2078(int arg0, int arg1) {
        class25.method222(field5179, 0, arg0);
        if (arg1 < 10) {
            return field5179;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5196.method646();
        this.field5180.method646();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5194 != null) {
            this.field5194.method646();
            this.field5178.method646();
            var5 = (int) ((double) (this.field5194.field1478 - this.field5194.field1480) * 32.768D / var3);
            var6 = (int) ((double) this.field5194.field1480 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5191 != null) {
            this.field5191.method646();
            this.field5187.method646();
            var8 = (int) ((double) (this.field5191.field1478 - this.field5191.field1480) * 32.768D / var3);
            var9 = (int) ((double) this.field5191.field1480 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5192[var11] != 0) {
                field5199[var11] = 0;
                field5200[var11] = (int) ((double) this.field5186[var11] * var3);
                field5201[var11] = (this.field5192[var11] << 14) / 100;
                field5198[var11] = (int) ((double) (this.field5196.field1478 - this.field5196.field1480) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5193[var11]) / var3);
                field5202[var11] = (int) ((double) this.field5196.field1480 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field5196.method648(arg0);
            int var14 = this.field5180.method648(arg0);
            if (this.field5194 != null) {
                int var15 = this.field5194.method648(arg0);
                int var16 = this.field5178.method648(arg0);
                var13 += this.method2076(var7, var16, this.field5194.field1482) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field5191 != null) {
                int var17 = this.field5191.method648(arg0);
                int var18 = this.field5187.method648(arg0);
                var14 = var14 * ((this.method2076(var10, var18, this.field5191.field1482) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field5192[var19] != 0) {
                    int var20 = field5200[var19] + var12;
                    if (var20 < arg0) {
                        field5179[var20] += this.method2076(field5199[var19], field5201[var19] * var14 >> 15, this.field5196.field1482);
                        field5199[var19] += (field5198[var19] * var13 >> 16) + field5202[var19];
                    }
                }
            }
        }
        if (this.field5189 != null) {
            this.field5189.method646();
            this.field5182.method646();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field5189.method648(arg0);
                int var26 = this.field5182.method648(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field5189.field1478 - this.field5189.field1480) * var25 >> 8) + this.field5189.field1480;
                } else {
                    var27 = ((this.field5189.field1478 - this.field5189.field1480) * var26 >> 8) + this.field5189.field1480;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field5179[var24] = 0;
                }
            }
        }
        if (this.field5183 > 0 && this.field5184 > 0) {
            int var28 = (int) ((double) this.field5183 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field5179[var29] += field5179[var29 - var28] * this.field5184 / 100;
            }
        }
        if (this.field5181.field1690[0] > 0 || this.field5181.field1690[1] > 0) {
            this.field5185.method646();
            int var30 = this.field5185.method648(arg0 + 1);
            int var31 = this.field5181.method770(0, (float) var30 / 65536.0F);
            int var32 = this.field5181.method770(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field5179[var31 + var33] * (long) class89.field1684 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field5179[var31 + var33 - var36 - 1] * (long) class89.field1686[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field5179[var33 - var37 - 1] * (long) class89.field1686[1][var37] >> 16);
                    }
                    field5179[var33] = var35;
                    var30 = this.field5185.method648(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field5179[var31 + var33] * (long) class89.field1684 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field5179[var31 + var33 - var40 - 1] * (long) class89.field1686[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field5179[var33 - var41 - 1] * (long) class89.field1686[1][var41] >> 16);
                        }
                        field5179[var33] = var39;
                        var30 = this.field5185.method648(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field5179[var31 + var33 - var43 - 1] * (long) class89.field1686[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field5179[var33 - var44 - 1] * (long) class89.field1686[1][var44] >> 16);
                            }
                            field5179[var33] = var42;
                            this.field5185.method648(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field5181.method770(0, (float) var30 / 65536.0F);
                    var32 = this.field5181.method770(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field5179[var46] < -32768) {
                field5179[var46] = -32768;
            }
            if (field5179[var46] > 32767) {
                field5179[var46] = 32767;
            }
        }
        return field5179;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5195[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5190 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5190[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5179 = new int[220500];
        field5199 = new int[5];
        field5200 = new int[5];
        field5201 = new int[5];
        field5198 = new int[5];
        field5202 = new int[5];
    }
}
