import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class283 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field4410 = -1;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "F")
    public static float field4400 = 0.0F;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "F")
    public static float field4422;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public int field4402;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public int field4418;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public int field4419;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lti;")
    public class197 field4398;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[I")
    public int[] field4401;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "[I")
    public int[] field4405;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "[I")
    public static int[] field4409;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "[I")
    public int[] field4411;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "[I")
    public int[] field4413;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "[I")
    public int[] field4414;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "[I")
    public int[] field4421;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "[Lti;")
    public class197[] field4412;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "[[I")
    public int[][] field4408;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "[[I")
    public int[][] field4416;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[[[I")
    public static int[][][] field4396;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1955(boolean arg0) {
        class64.field862.method752(false);
        class157.field2383.method752(false);
        field4407++;
        class170.field2752.method752(arg0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 21)
    public static final void method1956(byte arg0) {
        if (arg0 != 109) {
            method1964(-54, 65, 15, -5, (class110) null, (class110) null, 34, -109, 71, 23, -72L);
        }
        class330.field5072.method752(false);
        field4415++;
        class121.field1862.method752(false);
        class91.field1321.method752(false);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljd;I)V", line = 37)
    public static final void method1957(class95 arg0, int arg1) {
        field4399++;
        if (class343.field5307) {
            return;
        }
        if (class73.field1058) {
            class175.method1326();
        } else {
            class287.method1992();
        }
        class279.field4329 = class49.method373((byte) 91, arg0, class65.field948);
        int var2 = class215.field3300;
        if (arg1 >= -1) {
            return;
        }
        int var3 = var2 * 956 / 503;
        class279.field4329.method132((class151.field2281 - var3) / 2, 0, var3, var2);
        class111.field1679 = class293.method2027(128, class223.field3395, arg0);
        class111.field1679.method322(class151.field2281 / 2 - (class111.field1679.field5047 / 2), 18);
        class343.field5307 = true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBI)I", line = 68)
    public static final int method1958(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -115) {
            return -90;
        }
        int var4 = arg1 & 0x3;
        field4403++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([BB)V", line = 94)
    private final void method1959(byte[] arg0, byte arg1) {
        class254 var3 = new class254(class267.method1875(82, arg0));
        field4420++;
        if (arg1 >= -63) {
            return;
        }
        int var4 = var3.method1774((byte) -91);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4418 = 0;
        } else {
            this.field4418 = var3.method1741(-32769);
        }
        int var5 = var3.method1774((byte) 18);
        int var6 = 0;
        this.field4419 = var3.method1755(false);
        int var7 = -1;
        this.field4405 = new int[this.field4419];
        for (int var8 = 0; var8 < this.field4419; var8++) {
            this.field4405[var8] = var6 += var3.method1755(false);
            if (this.field4405[var8] > var7) {
                var7 = this.field4405[var8];
            }
        }
        this.field4402 = var7 + 1;
        this.field4421 = new int[this.field4402];
        this.field4401 = new int[this.field4402];
        this.field4414 = new int[this.field4402];
        this.field4411 = new int[this.field4402];
        this.field4408 = new int[this.field4402][];
        if (var5 != 0) {
            this.field4413 = new int[this.field4402];
            for (int var9 = 0; var9 < this.field4402; var9++) {
                this.field4413[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4419; var10++) {
                this.field4413[this.field4405[var10]] = var3.method1741(-32769);
            }
            this.field4398 = new class197(this.field4413);
        }
        for (int var11 = 0; var11 < this.field4419; var11++) {
            this.field4421[this.field4405[var11]] = var3.method1741(-32769);
        }
        for (int var12 = 0; var12 < this.field4419; var12++) {
            this.field4411[this.field4405[var12]] = var3.method1741(-32769);
        }
        for (int var13 = 0; var13 < this.field4419; var13++) {
            this.field4401[this.field4405[var13]] = var3.method1755(false);
        }
        for (int var14 = 0; var14 < this.field4419; var14++) {
            int var15 = 0;
            int var16 = this.field4405[var14];
            int var17 = this.field4401[var16];
            this.field4408[var16] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field4408[var16][var19] = var15 += var3.method1755(false);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field4414[var16] = var18 + 1;
            if ((var18 + 1) == var17) {
                this.field4408[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4416 = new int[var7 + 1][];
        this.field4412 = new class197[var7 + 1];
        for (int var21 = 0; var21 < this.field4419; var21++) {
            int var22 = this.field4405[var21];
            int var23 = this.field4401[var22];
            this.field4416[var22] = new int[this.field4414[var22]];
            for (int var24 = 0; var24 < this.field4414[var22]; var24++) {
                this.field4416[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field4408[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field4408[var22][var25];
                }
                this.field4416[var22][var26] = var3.method1741(-32769);
            }
            this.field4412[var22] = new class197(this.field4416[var22]);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lmi;", line = 269)
    public static final class219 method1960(int arg0, int arg1) {
        field4406++;
        class219 var2 = (class219) class302.field4627.method747((long) arg0, (byte) 91);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class98.field1415.method696(arg0, (byte) 125, arg1);
        class219 var4 = new class219();
        if (var3 != null) {
            var4.method1559(arg1, arg0, new class254(var3));
        }
        class302.field4627.method744(var4, -15692, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 295)
    public static void method1961(int arg0) {
        field4396 = (int[][][]) null;
        if (arg0 != 6) {
            field4409 = (int[]) null;
        }
        field4409 = null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V", line = 310)
    public static final void method1962(boolean arg0) {
        field4404++;
        for (int var1 = -1; var1 < class234.field3563; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class291.field4475[var1];
            }
            class270 var3 = class201.field3096[var2];
            if (var3 != null && var3.field4678 > 0) {
                var3.field4678--;
                if (var3.field4678 == 0) {
                    var3.field4762 = null;
                }
            }
        }
        if (arg0) {
            method1955(false);
        }
        for (int var4 = 0; var4 < class52.field702; var4++) {
            int var5 = class272.field4252[var4];
            class76 var6 = class264.field4064[var5];
            if (var6 != null && var6.field4678 > 0) {
                var6.field4678--;
                if (var6.field4678 == 0) {
                    var6.field4762 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 369)
    public static final void method1963(int arg0) {
        class40.field586.method750((byte) 88);
        field4417++;
        if (arg0 <= 98) {
            field4396 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILfc;Lfc;IIIIJ)V", line = 382)
    public static final void method1964(int arg0, int arg1, int arg2, int arg3, class110 arg4, class110 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class158 var12 = new class158();
        var12.field2400 = arg10;
        var12.field2394 = arg1 * 128 + 64;
        var12.field2409 = arg2 * 128 + 64;
        var12.field2410 = arg3;
        var12.field2402 = arg4;
        var12.field2398 = arg5;
        var12.field2407 = arg6;
        var12.field2406 = arg7;
        var12.field2401 = arg8;
        var12.field2396 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class213.field3262[var13][arg1][arg2] == null) {
                class213.field3262[var13][arg1][arg2] = new class79(var13, arg1, arg2);
            }
        }
        class213.field3262[arg0][arg1][arg2].field1175 = var12;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "([BI)V", line = 410)
    public class283(byte[] arg0, int arg1) {
        this.field4397 = class309.method2120(arg0, arg0.length, 200);
        if (this.field4397 != arg1) {
            throw new RuntimeException();
        }
        this.method1959(arg0, (byte) -122);
    }
}
