import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class163 {

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "Lni;")
    private class481 field2340;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "Lhea;")
    private class387 field2344;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public int field2336;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    private int field2348;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "[B")
    public byte[] field2334;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    private int field2347;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    private int field2338;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "Z")
    public static boolean field2333 = true;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "F")
    public static float field2350 = 0.25F;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Lpu;")
    public static class522 field2332;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "[[Lica;")
    private class615[][] field2346;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILha;IB)Z")
    public final boolean method1118(int arg0, class54 arg1, int arg2, byte arg3) {
        field2341++;
        class348 var5 = (class348) arg1;
        int var6 = -11 / ((-arg3 - 24) / 55);
        int var7 = var5.field5049 + arg0 + 1;
        int var8 = var5.field5045 + arg2 + 1;
        int var9 = var8 + (this.field2336 * var7);
        int var10 = var5.field5051;
        int var11 = var5.field5050;
        int var12 = this.field2336 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += this.field2336 * var13;
            var7 = 1;
            var10 -= var13;
        }
        if (this.field2348 <= var7 + var10) {
            int var14 = var7 + var10 + 1 - this.field2348;
            var10 -= var14;
        }
        if (var8 <= 0) {
            int var15 = 1 - var8;
            var12 += var15;
            var9 += var15;
            var11 -= var15;
            var8 = 1;
        }
        if (var8 + var11 >= this.field2336) {
            int var16 = var11 + var8 + 1 - this.field2336;
            var12 += var16;
            var11 -= var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field2336 + var12;
            return class588.method3331(var17, var10, var11, var18, (byte) -101, var9, this.field2334);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(ILha;IB)V")
    public final void method1119(int arg0, class54 arg1, int arg2, byte arg3) {
        field2349++;
        class348 var5 = (class348) arg1;
        int var6 = var5.field5049 + arg0 + 1;
        int var7 = var5.field5045 + arg2 + 1;
        int var8 = var7 + (this.field2336 * var6);
        int var9 = 0;
        if (arg3 > -98) {
            this.field2336 = -36;
        }
        int var10 = var5.field5051;
        int var11 = var5.field5050;
        int var12 = this.field2336 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += this.field2336 * var14;
            var9 += var11 * var14;
            var10 -= var14;
        }
        if (this.field2348 <= (var6 + var10)) {
            int var15 = var6 + var10 - (this.field2348 + -1);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var13 += var16;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
            var7 = 1;
        }
        if (var7 + var11 >= this.field2336) {
            int var17 = var11 + var7 + 1 - this.field2336;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class638.method3547(var9, var11, var12, var5.field5054, var8, var13, this.field2334, var10, 75);
            this.method1120((byte) 105, var11, var7, var6, var10);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BIIII)V")
    private final void method1120(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2343++;
        if (this.field2346 == null) {
            return;
        }
        if (arg0 <= 91) {
            this.method1123(-78, true, null, -96, -79, -101);
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg1 - 2 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class615[] var11 = this.field2346[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field8589 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public final void method1121(int arg0) {
        this.field2346 = new class615[this.field2345][this.field2338];
        if (arg0 < 47) {
            this.method1119(-68, null, 119, (byte) 84);
        }
        field2335++;
        for (int var2 = 0; var2 < this.field2338; var2++) {
            for (int var3 = 0; var3 < this.field2345; var3++) {
                this.field2346[var3][var2] = new class615(this.field2344, this, this.field2340, var3, var2, this.field2347, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field2346[var3][var2].field8591 == 0) {
                    this.field2346[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
    public static final void method1122(int arg0) {
        class535.field7508 = -1;
        class674.field9547 = -1;
        class581.field8187 = arg0;
        class293.field4323 = -1;
        field2339++;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IZ[[ZIII)V")
    public final void method1123(int arg0, boolean arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        this.field2344.method2318((byte) -24, false);
        field2337++;
        this.field2344.method2369((byte) 71, false);
        this.field2344.method2326(true, 1);
        this.field2344.method2308(-1, 1);
        this.field2344.method2389(false, false, -2, false);
        float var7 = 1.0F / (float) (this.field2344.field5655 * 128);
        if (arg1) {
            for (int var26 = 0; var26 < this.field2338; var26++) {
                int var27 = var26 << this.field2347;
                int var28 = var26 + 1 << this.field2347;
                label91: for (int var29 = 0; var29 < this.field2345; var29++) {
                    if (this.field2346[var29][var26] != null) {
                        int var30 = var29 << this.field2347;
                        int var31 = var29 + 1 << this.field2347;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if (var32 - arg4 >= -arg5 && (var32 - arg4) <= arg5) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if (-arg5 <= var33 - arg0 && arg5 >= (var33 - arg0) && arg2[arg5 + var32 - arg4][arg5 + var33 - arg0]) {
                                        class21 var34 = this.field2344.method2327(true);
                                        var34.method242(1.0F, var7, var7, (byte) -63);
                                        var34.method270(-var29, -var26, 0);
                                        this.field2344.method2356(arg3 + 1, class266.field4017);
                                        this.field2346[var29][var26].method3422((byte) 93);
                                        continue label91;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2338; var8++) {
                int var9 = var8 << this.field2347;
                int var10 = var8 + 1 << this.field2347;
                for (int var11 = 0; var11 < this.field2345; var11++) {
                    class615 var12 = this.field2346[var11][var8];
                    if (var12 != null) {
                        class241 var13 = this.field2344.method2370(var12.field8591 * 3, arg3 - 12028);
                        Buffer var14 = var13.method5(true, 86);
                        if (var14 != null) {
                            Stream var15 = this.field2344.method2381(0, var14);
                            int var16 = 0;
                            int var17 = var11 << this.field2347;
                            int var18 = var11 + 1 << this.field2347;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if (-arg5 <= var19 - arg0 && arg5 >= var19 - arg0) {
                                    int var21 = this.field2340.field631 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if ((-arg5) <= (var22 - arg4) && (var22 - arg4) <= arg5 && arg2[var22 + arg5 - arg4][var19 + arg5 - arg0]) {
                                            short[] var23 = this.field2340.field6842[var21];
                                            if (var23 != null) {
                                                if (Stream.method3483()) {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var15.method3475(var23[var25] & 0xFFFF);
                                                        var16++;
                                                    }
                                                } else {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var15.method3472(var23[var24] & 0xFFFF);
                                                        var16++;
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3471();
                            if (var13.method2(-45) && var16 > 0) {
                                class21 var20 = this.field2344.method2327(true);
                                var20.method242(1.0F, var7, var7, (byte) -108);
                                var20.method270(-var11, -var8, 0);
                                this.field2344.method2356(0, class266.field4017);
                                var12.method3423(var13, (byte) -90, var16 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field2344.method2358(arg3);
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V")
    public static void method1124(int arg0) {
        field2332 = null;
        if (arg0 < 13) {
            method1124(22);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lhea;Lni;)V")
    public class163(class387 arg0, class481 arg1) {
        this.field2340 = arg1;
        this.field2344 = arg0;
        this.field2336 = (this.field2340.field631 * this.field2340.field629 >> this.field2344.field5682) + 2;
        this.field2348 = (this.field2340.field632 * this.field2340.field629 >> this.field2344.field5682) + 2;
        this.field2334 = new byte[this.field2348 * this.field2336];
        this.field2347 = this.field2344.field5682 + 7 - this.field2340.field625;
        this.field2345 = this.field2340.field631 >> this.field2347;
        this.field2338 = this.field2340.field632 >> this.field2347;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lha;III)V")
    public final void method1125(class54 arg0, int arg1, int arg2, int arg3) {
        field2342++;
        class348 var5 = (class348) arg0;
        int var6 = var5.field5045 + arg1 + 1;
        int var7 = var5.field5049 + arg3 + 1;
        int var8 = this.field2336 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field5051;
        int var11 = var5.field5050;
        if (arg2 != -26199) {
            this.field2334 = null;
        }
        int var12 = this.field2336 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var9 += var11 * var14;
            var7 = 1;
            var8 += this.field2336 * var14;
        }
        if ((var7 + var10) >= this.field2348) {
            int var15 = var7 + var10 + 1 - this.field2348;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var8 += var16;
            var6 = 1;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var11 >= this.field2336) {
            int var17 = var6 + var11 + 1 - this.field2336;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class273.method1799(var9, var5.field5054, var8, var12, var11, this.field2334, (byte) 8, var10, var13);
            this.method1120((byte) 98, var11, var6, var7, var10);
        }
    }
}
