import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class160 extends class273 {

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "[I")
    private int[] field2482 = new int[3];

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "I")
    private int field2493 = 409;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    private int field2489 = 4096;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    private int field2479 = 4096;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "I")
    private int field2495 = 4096;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field2486 = 0;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "[I")
    public static int[] field2488 = new int[32];

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field2490 = 0;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "[[[I")
    public static int[][][] field2484;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BILgn;)V", line = 14)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg0 <= 27) {
            this.method167((byte) -45, 35, (class303) null);
        }
        field2485++;
        if (arg1 == 0) {
            this.field2493 = arg2.method1994(false);
        } else if (arg1 == 1) {
            this.field2489 = arg2.method1994(false);
        } else if (arg1 == 2) {
            this.field2479 = arg2.method1994(false);
        } else if (arg1 == 3) {
            this.field2495 = arg2.method1994(false);
        } else if (arg1 == 4) {
            int var5 = arg2.method2059(255);
            this.field2482[0] = class311.method2135(16711680, var5) << 4;
            this.field2482[1] = class311.method2135(65280, var5) >> 4;
            this.field2482[2] = class311.method2135(var5, 255) >> 12;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZB)V", line = 80)
    public static final void method1104(boolean arg0, byte arg1) {
        if (arg1 != -29) {
            return;
        }
        field2480++;
        if (arg0 != class44.field622) {
            class44.field622 = arg0;
            class242.method1647(1082299393);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III[[[BIBII)V", line = 94)
    public static final void method1105(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class329.field5085++;
        class63.field889 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class83.field1249; var12 < class322.field5024; var12++) {
            class174[][] var13 = class90.field1375[var12];
            for (int var14 = class43.field607; var14 < class194.field2929; var14++) {
                for (int var15 = class96.field1468; var15 < class272.field4184; var15++) {
                    class174 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class131.field2057[var14 + class50.field712 - class77.field1151][var15 + class50.field712 - class335.field5208] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field2663 = true;
                            var16.field2643 = true;
                            if (var16.field2655 > 0) {
                                var16.field2653 = true;
                            } else {
                                var16.field2653 = false;
                            }
                            class63.field889++;
                        } else {
                            var16.field2663 = false;
                            var16.field2643 = false;
                            var16.field2669 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field2672 != null) {
                                    class157 var17 = var16.field2672;
                                    var17.field2454.method113(0, var12, var17.field2456, var17.field2452, var17.field2458);
                                    if (var17.field2451 != null) {
                                        var17.field2451.method113(0, var12, var17.field2456, var17.field2452, var17.field2458);
                                    }
                                }
                                if (var16.field2650 != null) {
                                    class152 var18 = var16.field2650;
                                    var18.field2405.method113(var18.field2390, var12, var18.field2393, var18.field2398, var18.field2396);
                                    if (var18.field2406 != null) {
                                        var18.field2406.method113(var18.field2390, var12, var18.field2393, var18.field2398, var18.field2396);
                                    }
                                }
                                if (var16.field2667 != null) {
                                    class23 var19 = var16.field2667;
                                    var19.field285.method113(0, var12, var19.field299, var19.field295, var19.field286);
                                }
                                if (var16.field2671 != null) {
                                    for (int var20 = 0; var20 < var16.field2655; var20++) {
                                        class272 var21 = var16.field2671[var20];
                                        var21.field4173.method113(var21.field4168, var12, var21.field4179, var21.field4176, var21.field4174);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = client.field2034 == class46.field655;
        if (class333.field5166) {
            GL var23 = class333.field5160;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class161.method1111();
                class174.method1179(3, -1, (byte) 77);
                class165.field2535 = true;
                class321.method2175();
                class90.field1379 = -1;
                class26.field341 = -1;
                for (int var24 = 0; var24 < class136.field2118[0].length; var24++) {
                    class217 var25 = class136.field2118[0][var24];
                    float var26 = 251.5F - (var25.field3428 ? 1.0F : 0.5F);
                    if (class90.field1379 != var25.field3415) {
                        class90.field1379 = var25.field3415;
                        class40.method290(16743972, var25.field3415);
                        class326.method2209(class124.method840((byte) 117));
                    }
                    var25.method1452(class90.field1375, var26, false);
                }
                class321.method2177();
            } else {
                int var27 = class83.field1249;
                while (true) {
                    if (var27 >= class322.field5024) {
                        class147.method1026(class77.field1151, class335.field5208, class90.field1375);
                        break;
                    }
                    for (int var28 = 0; var28 < class136.field2118[var27].length; var28++) {
                        class217 var29 = class136.field2118[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3428 ? 1.0F : 0.5F);
                        if (var29.field3416 != -1 && class64.method459(class12.field126.method472(false, var29.field3416), false) && class297.field4556) {
                            class40.method290(16743972, var29.field3415);
                        }
                        var29.method1452(class90.field1375, var30, false);
                    }
                    if (var27 == 0 && class90.field1382 > 0) {
                        class333.method2305(101.5F);
                        class11.method71(class77.field1151, class335.field5208, class50.field712, arg1, class131.field2057, client.field2034[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class83.field1249; var31 < class322.field5024; var31++) {
            class174[][] var32 = class90.field1375[var31];
            for (int var33 = -class50.field712; var33 <= 0; var33++) {
                int var34 = class77.field1151 + var33;
                int var35 = class77.field1151 - var33;
                if (var34 >= class43.field607 || var35 < class194.field2929) {
                    for (int var36 = -class50.field712; var36 <= 0; var36++) {
                        int var37 = class335.field5208 + var36;
                        int var38 = class335.field5208 - var36;
                        if (var34 >= class43.field607) {
                            if (var37 >= class96.field1468) {
                                class174 var39 = var32[var34][var37];
                                if (var39 != null && var39.field2663) {
                                    class64.method461(var39, true);
                                }
                            }
                            if (var38 < class272.field4184) {
                                class174 var40 = var32[var34][var38];
                                if (var40 != null && var40.field2663) {
                                    class64.method461(var40, true);
                                }
                            }
                        }
                        if (var35 < class194.field2929) {
                            if (var37 >= class96.field1468) {
                                class174 var41 = var32[var35][var37];
                                if (var41 != null && var41.field2663) {
                                    class64.method461(var41, true);
                                }
                            }
                            if (var38 < class272.field4184) {
                                class174 var42 = var32[var35][var38];
                                if (var42 != null && var42.field2663) {
                                    class64.method461(var42, true);
                                }
                            }
                        }
                        if (class63.field889 == 0) {
                            if (!var22) {
                                class230.field3717 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class83.field1249; var43 < class322.field5024; var43++) {
            class174[][] var44 = class90.field1375[var43];
            for (int var45 = -class50.field712; var45 <= 0; var45++) {
                int var46 = class77.field1151 + var45;
                int var47 = class77.field1151 - var45;
                if (var46 >= class43.field607 || var47 < class194.field2929) {
                    for (int var48 = -class50.field712; var48 <= 0; var48++) {
                        int var49 = class335.field5208 + var48;
                        int var50 = class335.field5208 - var48;
                        if (var46 >= class43.field607) {
                            if (var49 >= class96.field1468) {
                                class174 var51 = var44[var46][var49];
                                if (var51 != null && var51.field2663) {
                                    class64.method461(var51, false);
                                }
                            }
                            if (var50 < class272.field4184) {
                                class174 var52 = var44[var46][var50];
                                if (var52 != null && var52.field2663) {
                                    class64.method461(var52, false);
                                }
                            }
                        }
                        if (var47 < class194.field2929) {
                            if (var49 >= class96.field1468) {
                                class174 var53 = var44[var47][var49];
                                if (var53 != null && var53.field2663) {
                                    class64.method461(var53, false);
                                }
                            }
                            if (var50 < class272.field4184) {
                                class174 var54 = var44[var47][var50];
                                if (var54 != null && var54.field2663) {
                                    class64.method461(var54, false);
                                }
                            }
                        }
                        if (class63.field889 == 0) {
                            if (!var22) {
                                class230.field3717 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class230.field3717 = false;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 463)
    public class160() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)[[I", line = 467)
    public final int[][] method170(int arg0, byte arg1) {
        field2481++;
        int[][] var3 = this.field4200.method539(arg1 + 84, arg0);
        if (this.field4200.field1147) {
            int[][] var4 = this.method1795(arg0, -124, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class27.field346; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field2482[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field2493 < var13) {
                    var10[var11] = var12;
                    var6[var11] = var7[var11];
                    var9[var11] = var8[var11];
                } else {
                    int var14 = var7[var11];
                    int var15 = var14 - this.field2482[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field2493) {
                        var10[var11] = var12;
                        var6[var11] = var14;
                        var9[var11] = var8[var11];
                    } else {
                        int var16 = var8[var11];
                        int var17 = var16 - this.field2482[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field2493) {
                            var10[var11] = this.field2495 * var12 >> 12;
                            var6[var11] = this.field2479 * var14 >> 12;
                            var9[var11] = this.field2489 * var16 >> 12;
                        } else {
                            var10[var11] = var12;
                            var6[var11] = var14;
                            var9[var11] = var16;
                        }
                    }
                }
            }
        }
        return arg1 == 68 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)Lhd;", line = 570)
    public static final class291 method1106(int arg0, int arg1) {
        field2487++;
        class291 var2 = (class291) class276.field4262.method1294((long) arg0, 116);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class80.field1193.method2103(0, class166.method1133(arg0, 161862696), class6.method33(arg0, true));
        class291 var4 = new class291();
        var4.field4480 = arg0;
        if (var3 != null) {
            var4.method1890((byte) 72, new class303(var3));
        }
        var4.method1901((byte) 57);
        if (var4.field4432 != -1) {
            var4.method1899((byte) -8, method1106(var4.field4432, 24), method1106(var4.field4466, 127));
        }
        if (var4.field4483 != -1) {
            var4.method1900(method1106(var4.field4493, -112), (byte) -79, method1106(var4.field4483, -127));
        }
        if (!class213.field3378 && var4.field4467) {
            var4.field4451 = 0;
            var4.field4482 = false;
            var4.field4441 = class63.field883;
            var4.field4468 = class231.field3723;
            var4.field4431 = class126.field1974;
        }
        class276.field4262.method1292((long) arg0, 61, var4);
        int var5 = -5 / ((-arg1 - 29) / 35);
        return var4;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V", line = 616)
    public static void method1107(byte arg0) {
        field2488 = null;
        if (arg0 > -120) {
            field2484 = (int[][][]) ((int[][][]) null);
        }
        field2484 = (int[][][]) null;
    }
}
