import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 extends class207 {

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    public int field428 = 0;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Luk;")
    public static class96 field411 = new class96(4);

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "Z")
    public static boolean field435 = false;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Ldh;")
    public class117 field413;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "Lbc;")
    public class170 field433;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Lgj;")
    public class224 field412;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "Lkc;")
    public class266 field420;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Lkc;")
    public class266 field424;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "Z")
    public boolean field427;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "[I")
    public int[] field431;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "[Lod;")
    public static class90[] field434;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZ[Lig;I[BIII)V")
    public static final void method101(int arg0, boolean arg1, class9[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        field419++;
        if (!arg1) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg5 + var9 > 0 && arg5 + var9 < 103 && arg7 + var10 > 0 && (arg7 + var10) < 103) {
                            arg2[var8].field300[arg5 + var9][arg7 + var10] = class1.method5(arg2[var8].field300[arg5 + var9][arg7 + var10], -16777217);
                        }
                    }
                }
            }
        }
        class200 var11 = new class200(arg4);
        byte var12;
        if (arg1) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        int var13 = 0;
        if (arg0 <= 88) {
            field434 = null;
        }
        while (var13 < var12) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class108.method768(arg5 + var14, var13, var11, arg6, arg3, arg1, 0, -123, var15 + arg7);
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLqk;)V")
    public static final void method102(byte arg0, class200 arg1) {
        if (arg0 >= -52) {
            return;
        }
        int var2 = class236.field4260 >> 1;
        byte[][] var3 = new byte[class263.field4668][class38.field894];
        field416++;
        int var4 = class68.field1343 >> 2 << 10;
        while (arg1.field3547.length > arg1.field3565) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg1.method1408((byte) -54) == 1) {
                var34 = arg1.method1408((byte) -106);
                var33 = true;
                var35 = arg1.method1408((byte) -28);
            }
            int var36 = arg1.method1408((byte) -107);
            int var37 = arg1.method1408((byte) -28);
            int var38 = var36 * 64 - class90.field1847;
            int var39 = class238.field4289 + (class38.field894 - 1) - var37 * 64;
            if (var38 >= 0 && (var39 - 63) >= 0 && (var38 + 63) < class263.field4668 && var39 < class38.field894) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var3[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || (var34 * 8) <= var40 && var40 < (var34 * 8 + 8) && var42 >= (var35 * 8) && var35 * 8 + 8 > var42) {
                            var41[var39 - var42] = arg1.method1412((byte) 126);
                        }
                    }
                }
            } else if (var33) {
                arg1.field3565 += 64;
            } else {
                arg1.field3565 += 4096;
            }
        }
        int var5 = class263.field4668;
        int var6 = class38.field894;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = var3[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class234 var29 = class217.method1532(var28 - 1, 117);
                        var7[var13] += var29.field4225;
                        var8[var13] += var29.field4227;
                        var9[var13] += var29.field4226;
                        var10[var13] += var29.field4240;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var3[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class234 var32 = class217.method1532(var31 - 1, -82);
                        var7[var13] -= var32.field4225;
                        var8[var13] -= var32.field4227;
                        var9[var13] -= var32.field4226;
                        var10[var13] -= var32.field4240;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class20.field528[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    int var22 = var20 - 5;
                    if (var21 < var6) {
                        var19 += var11[var21];
                        var18 += var8[var21];
                        var15 += var7[var21];
                        var17 += var10[var21];
                        var16 += var9[var21];
                    }
                    if (var22 >= 0) {
                        var17 -= var10[var22];
                        var18 -= var8[var22];
                        var19 -= var11[var22];
                        var16 -= var9[var22];
                        var15 -= var7[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var17 == 0 ? 0 : class168.method1210(3, var15 * 256 / var17, var16 / var19, var18 / var19);
                        if (var3[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var2;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var4 + var24 & 0xFC00) - (-(var24 & 0x380) - var25);
                            var23[class1.method5(var20 << 6, 4032) + class1.method5(var12, 63)] = class145.field2747[class195.method1360(-42, var26, 96)];
                        } else if (var23 != null) {
                            var23[(class1.method5(var20, 63) << 6) + class1.method5(var12, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
    public static void method103(int arg0) {
        field434 = null;
        field411 = null;
        if (arg0 != 5) {
            method101(-33, false, (class9[]) null, -16, (byte[]) null, -104, -49, -113);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public final void method104(byte arg0) {
        field421++;
        int var2 = this.field422;
        if (arg0 > -49) {
            method106(119L, (byte) 28);
        }
        if (this.field413 != null) {
            class117 var5 = this.field413.method840(-1);
            if (var5 == null) {
                this.field426 = 0;
                this.field418 = 0;
                this.field422 = -1;
                this.field430 = 0;
                this.field431 = null;
            } else {
                this.field430 = var5.field2242;
                this.field431 = var5.field2304;
                this.field422 = var5.field2255;
                this.field418 = var5.field2302;
                this.field426 = var5.field2293 * 128;
            }
        } else if (this.field433 != null) {
            int var3 = class162.method1178(this.field433, (byte) 55);
            if (var2 != var3) {
                this.field422 = var3;
                class11 var4 = this.field433.field3130;
                if (var4.field348 != null) {
                    var4 = var4.method87(true);
                }
                if (var4 == null) {
                    this.field426 = 0;
                } else {
                    this.field426 = var4.field389 * 128;
                }
            }
        } else if (this.field412 != null) {
            this.field422 = class114.method806(3, this.field412);
            this.field426 = this.field412.field4051 * 128;
        }
        if (this.field422 != var2 && this.field420 != null) {
            class2.field18.method366(this.field420);
            this.field420 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ldh;IILgj;IZLbc;I)V")
    public static final void method105(class117 arg0, int arg1, int arg2, class224 arg3, int arg4, boolean arg5, class170 arg6, int arg7) {
        class14 var8 = new class14();
        field410++;
        var8.field409 = arg1 * 128;
        var8.field429 = arg4;
        var8.field432 = arg7 * 128;
        if (arg5) {
            method103(-97);
        }
        if (arg0 != null) {
            var8.field426 = arg0.field2293 * 128;
            var8.field418 = arg0.field2302;
            var8.field431 = arg0.field2304;
            int var9 = arg0.field2307;
            var8.field422 = arg0.field2255;
            var8.field413 = arg0;
            int var10 = arg0.field2273;
            var8.field430 = arg0.field2242;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg0.field2307;
                var9 = arg0.field2273;
            }
            var8.field415 = (arg7 + var9) * 128;
            var8.field423 = (arg1 + var10) * 128;
            if (arg0.field2295 != null) {
                var8.field427 = true;
                var8.method104((byte) -87);
            }
            if (var8.field431 != null) {
                var8.field414 = var8.field430 + ((int) ((double) (var8.field418 - var8.field430) * Math.random()));
            }
            class258.field4574.method1731(-60, var8);
        } else if (arg6 != null) {
            var8.field433 = arg6;
            class11 var11 = arg6.field3130;
            if (var11.field348 != null) {
                var8.field427 = true;
                var11 = var11.method87(true);
            }
            if (var11 != null) {
                var8.field415 = (arg7 + var11.field333) * 128;
                var8.field423 = (var11.field333 + arg1) * 128;
                var8.field422 = class162.method1178(arg6, (byte) 55);
                var8.field426 = var11.field389 * 128;
            }
            class82.field1613.method1731(-127, var8);
        } else if (arg3 != null) {
            var8.field412 = arg3;
            var8.field415 = (arg7 + arg3.method240((byte) 104)) * 128;
            var8.field423 = (arg1 + arg3.method240((byte) 71)) * 128;
            var8.field422 = class114.method806(3, arg3);
            var8.field426 = arg3.field4051 * 128;
            class149.field2774.method1699(-28407, var8, arg3.field4029.method622(-2));
            return;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(JB)Ljd;")
    public static final class86 method106(long arg0, byte arg1) {
        if (arg1 == -54) {
            field425++;
            return class205.method1461(10, -3, false, arg0);
        } else {
            return null;
        }
    }
}
