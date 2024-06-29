import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class241 {

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public int field3219;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field3221 = 0;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lqt;")
    public class449 field3220;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[I")
    public int[] field3211;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
    public int[] field3213;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "[I")
    public int[] field3215;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "[I")
    public int[] field3218;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "[I")
    public int[] field3225;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "[I")
    public int[] field3226;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "[Lqt;")
    public class449[] field3222;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[Lf;")
    public static class529[] field3210;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[[I")
    public int[][] field3212;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "[[I")
    public int[][] field3228;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I", line = 6)
    public static final int method1483(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field3224++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else if (arg0 == -30927) {
            return 7 - arg3;
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 30)
    public static void method1484(byte arg0) {
        if (arg0 < 3) {
            field3221 = -70;
        }
        field3210 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BIIII)V", line = 52)
    public static final void method1485(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 62) {
            return;
        }
        field3217++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class99.method710(arg2 + arg4, (byte) -29, class71.field1077, class308.field4055);
        int var10 = class99.method710(arg2 - arg4, (byte) -29, class71.field1077, class308.field4055);
        class427.method2465(class457.field6299[arg1], var9, var10, arg0 - 69, arg3);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (var12 >= class353.field4777 && var11 <= class300.field3971) {
                    int var13 = class99.method710(arg2 + var5, (byte) -29, class71.field1077, class308.field4055);
                    int var14 = class99.method710(arg2 - var5, (byte) -29, class71.field1077, class308.field4055);
                    if (var12 <= class300.field3971) {
                        class427.method2465(class457.field6299[var12], var13, var14, arg0 - 69, arg3);
                    }
                    if (var11 >= class353.field4777) {
                        class427.method2465(class457.field6299[var11], var13, var14, -7, arg3);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (var16 >= class353.field4777 && var15 <= class300.field3971) {
                int var17 = class99.method710(arg2 + var6, (byte) -29, class71.field1077, class308.field4055);
                int var18 = class99.method710(arg2 - var6, (byte) -29, class71.field1077, class308.field4055);
                if (var16 <= class300.field3971) {
                    class427.method2465(class457.field6299[var16], var17, var18, -7, arg3);
                }
                if (var15 >= class353.field4777) {
                    class427.method2465(class457.field6299[var15], var17, var18, -7, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([BB)V", line = 130)
    private final void method1486(byte[] arg0, byte arg1) {
        field3216++;
        class379 var3 = new class379(class265.method1596((byte) -8, arg0));
        int var4 = var3.method2238(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3227 = var3.method2232((byte) 127);
        } else {
            this.field3227 = 0;
        }
        int var5 = var3.method2238(255);
        this.field3223 = var3.method2212((byte) 83);
        int var6 = 0;
        int var7 = -1;
        this.field3225 = new int[this.field3223];
        for (int var8 = 0; var8 < this.field3223; var8++) {
            this.field3225[var8] = var6 += var3.method2212((byte) 83);
            if (var7 < this.field3225[var8]) {
                var7 = this.field3225[var8];
            }
        }
        this.field3214 = var7 + 1;
        this.field3211 = new int[this.field3214];
        this.field3213 = new int[this.field3214];
        if (arg1 != 118) {
            this.field3213 = null;
        }
        this.field3215 = new int[this.field3214];
        this.field3228 = new int[this.field3214][];
        this.field3218 = new int[this.field3214];
        if (var5 != 0) {
            this.field3226 = new int[this.field3214];
            for (int var9 = 0; var9 < this.field3214; var9++) {
                this.field3226[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3223; var10++) {
                this.field3226[this.field3225[var10]] = var3.method2232((byte) 127);
            }
            this.field3220 = new class449(this.field3226);
        }
        for (int var11 = 0; var11 < this.field3223; var11++) {
            this.field3215[this.field3225[var11]] = var3.method2232((byte) 126);
        }
        for (int var12 = 0; var12 < this.field3223; var12++) {
            this.field3211[this.field3225[var12]] = var3.method2232((byte) 127);
        }
        for (int var13 = 0; var13 < this.field3223; var13++) {
            this.field3213[this.field3225[var13]] = var3.method2212((byte) 83);
        }
        for (int var14 = 0; var14 < this.field3223; var14++) {
            int var21 = this.field3225[var14];
            int var22 = this.field3213[var21];
            int var23 = 0;
            this.field3228[var21] = new int[var22];
            int var24 = -1;
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field3228[var21][var25] = var23 += var3.method2212((byte) 83);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field3218[var21] = var24 + 1;
            if (var24 + 1 == var22) {
                this.field3228[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3222 = new class449[var7 + 1];
        this.field3212 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field3223; var15++) {
            int var16 = this.field3225[var15];
            int var17 = this.field3213[var16];
            this.field3212[var16] = new int[this.field3218[var16]];
            for (int var18 = 0; var18 < this.field3218[var16]; var18++) {
                this.field3212[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3228[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3228[var16][var19];
                }
                this.field3212[var16][var20] = var3.method2232((byte) 124);
            }
            this.field3222[var16] = new class449(this.field3212[var16]);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([BI)V", line = 303)
    public class241(byte[] arg0, int arg1) {
        this.field3219 = class42.method303((byte) 103, arg0.length, arg0);
        if (this.field3219 != arg1) {
            throw new RuntimeException();
        }
        this.method1486(arg0, (byte) 118);
    }
}
