import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class181 extends class40 {

    @OriginalMember(owner = "client!js", name = "V", descriptor = "I")
    private int field2559 = 2000;

    @OriginalMember(owner = "client!js", name = "T", descriptor = "I")
    private int field2557 = 4096;

    @OriginalMember(owner = "client!js", name = "Y", descriptor = "I")
    private int field2562 = 16;

    @OriginalMember(owner = "client!js", name = "U", descriptor = "I")
    private int field2558 = 0;

    @OriginalMember(owner = "client!js", name = "W", descriptor = "I")
    private int field2560 = 0;

    @OriginalMember(owner = "client!js", name = "X", descriptor = "Z")
    public static boolean field2561 = true;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!js", name = "P", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!js", name = "Q", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!js", name = "S", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "Ltj;")
    public static class108 field2548;

    @OriginalMember(owner = "client!js", name = "R", descriptor = "Lfa;")
    public static class128 field2555;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "(B)V", line = 3)
    public final void method39(byte arg0) {
        class187.method1341(true);
        ++field2549;
        if (arg0 != -23) {
            method1298(82);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([I[I[IILfa;)V", line = 14)
    public static final void method1294(int[] arg0, int[] arg1, int[] arg2, int arg3, class128 arg4) {
        for (int var5 = arg3; ~arg1.length < ~var5; ++var5) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && ~arg4.field4541.length < ~var9; ++var9) {
                if (~(1 & var7) != -1) {
                    if (~var6 == 0) {
                        arg4.field4541[var9] = null;
                    } else {
                        class183 var10 = class110.method671(-21965, var6);
                        int var11 = var10.field2592;
                        class142 var12 = arg4.field4541[var9];
                        if (var12 != null) {
                            if (var12.field2147 != var6) {
                                if (var10.field2583 >= class110.method671(-21965, var12.field2147).field2583) {
                                    var12 = arg4.field4541[var9] = null;
                                }
                            } else if (~var11 != -1) {
                                if (var11 == 1) {
                                    var12.field2148 = 0;
                                    var12.field2150 = var8;
                                    var12.field2152 = 0;
                                    var12.field2149 = 1;
                                    var12.field2155 = 0;
                                    class47.method311(arg4.field4463, arg4.field4466, 0, true, field2555 == arg4, var10);
                                } else if (var11 == 2) {
                                    var12.field2152 = 0;
                                }
                            } else {
                                var12 = arg4.field4541[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class142 var13 = arg4.field4541[var9] = new class142();
                            var13.field2150 = var8;
                            var13.field2147 = var6;
                            var13.field2149 = 1;
                            var13.field2155 = 0;
                            var13.field2148 = 0;
                            var13.field2152 = 0;
                            class47.method311(arg4.field4463, arg4.field4466, 0, true, field2555 == arg4, var10);
                        }
                    }
                }
                var7 >>>= 1;
            }
        }
        ++field2551;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIII)V", line = 105)
    public static final void method1295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2556;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg3 * arg3;
        if (arg0 == -19471) {
            int var9 = arg1 * arg1;
            int var10 = var9 << 1;
            int var11 = var8 << 1;
            int var12 = arg1 << 1;
            int var13 = (-var12 + 1) * var8 + var10;
            int var14 = var9 - (var12 + -1) * var11;
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) + 3) * var10;
            int var18 = ((arg1 << 1) - 3) * var11;
            int var19 = (var6 + 1) * var16;
            int var20 = (arg1 + -1) * var15;
            if (class245.field3659 <= arg2 && ~class240.field3547 <= ~arg2) {
                int var21 = class209.method1485(class231.field3415, 1667, class408.field5789, arg5 - -arg3);
                int var22 = class209.method1485(class231.field3415, 1667, class408.field5789, arg5 - arg3);
                class5.method17(class440.field6288[arg2], var21, arg4, (byte) 76, var22);
            }
            while (~var7 < -1) {
                if (~var13 > -1) {
                    while (var13 < 0) {
                        var14 += var19;
                        var13 += var17;
                        var17 += var16;
                        var19 += var16;
                        ++var6;
                    }
                }
                if (~var14 > -1) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    ++var6;
                    var19 += var16;
                }
                var14 += -var18;
                var13 += -var20;
                var20 -= var15;
                --var7;
                var18 -= var15;
                int var23 = arg2 - var7;
                int var24 = arg2 + var7;
                if (~class245.field3659 >= ~var24 && ~var23 >= ~class240.field3547) {
                    int var25 = class209.method1485(class231.field3415, arg0 + 21138, class408.field5789, arg5 + var6);
                    int var26 = class209.method1485(class231.field3415, 1667, class408.field5789, -var6 + arg5);
                    if (class245.field3659 <= var23) {
                        class5.method17(class440.field6288[var23], var25, arg4, (byte) 100, var26);
                    }
                    if (class240.field3547 >= var24) {
                        class5.method17(class440.field6288[var24], var25, arg4, (byte) 101, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZZ)V", line = 210)
    public static final void method1296(boolean arg0, boolean arg1) {
        ++field2553;
        if (class43.field584 != arg0) {
            class43.field584 = arg0;
            class411.method2602(125);
            if (!arg1) {
                field2561 = true;
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)[I", line = 225)
    public final int[] method44(byte arg0, int arg1) {
        ++field2552;
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            int var4 = this.field2557 >> 1;
            int[][] var5 = super.field551.method183(-105);
            Random var6 = new Random((long) this.field2558);
            for (int var7 = 0; ~this.field2559 < ~var7; ++var7) {
                int var8 = this.field2557 > 0 ? -var4 + this.field2560 + class445.method2775(var6, 31178, this.field2557) : this.field2560;
                int var9 = (4080 & var8) >> 4;
                int var10 = class445.method2775(var6, 31178, class410.field5886);
                int var11 = class445.method2775(var6, 31178, class440.field6297);
                int var12 = (class185.field2650[var9] * this.field2562 >> 12) + var10;
                int var13 = (class357.field5166[var9] * this.field2562 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class445.method2775(var6, 31178, 4096) >> 2) + 1024;
                    int var27 = ~var11 > ~var13 ? 1 : -1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = var28 & class84.field1067;
                        int var31 = class169.field2395 & var21;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        if (arg0 > -20) {
            field2554 = 23;
        }
        return var3;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIZZ)V", line = 360)
    public static final void method1297(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class394.field5548 = arg1;
        class407.field5751 = arg2;
        class150.field2249 = arg3;
        class401.field5633 = new class74[arg0][class394.field5548][class407.field5751];
        class126.field1734 = new class92[arg0];
        if (arg4) {
            class24.field306 = new class74[1][class394.field5548][class407.field5751];
            class25.field314 = new int[class394.field5548][class407.field5751];
            class241.field3567 = new class92[1];
        } else {
            class24.field306 = null;
            class25.field314 = null;
            class241.field3567 = null;
        }
        if (arg5) {
            class115.field1487 = new int[arg0][arg1][arg2];
            class282.field4039 = new class78[255];
            class433.field6194 = new boolean[255];
            class153.field2273 = 0;
        } else {
            class115.field1487 = null;
            class282.field4039 = null;
            class433.field6194 = null;
            class153.field2273 = 0;
        }
        class228.method1588(false);
        class204.field2875 = new class371[500];
        class10.field126 = 0;
        class114.field1474 = new class371[500];
        class435.field6217 = 0;
        class309.field4490 = new int[arg0][class394.field5548 + 1][class407.field5751 + 1];
        class448.field6398 = new class306[5000];
        class91.field1179 = 0;
        class9.field125 = new boolean[class150.field2249 + class150.field2249 + 1][class150.field2249 + class150.field2249 + 1];
        class213.field3013 = new boolean[class150.field2249 + class150.field2249 + 2][class150.field2249 + class150.field2249 + 2];
        class312.field4615 = null;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V", line = 410)
    public class181() {
        super(0, true);
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V", line = 414)
    public static void method1298(int arg0) {
        field2555 = null;
        field2548 = null;
        if (arg0 != 9020) {
            field2561 = false;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IILlf;)V", line = 440)
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (arg1 <= 79) {
            this.method43(-19, 106, (class130) null);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.field2557 = arg2.method798(false);
                        }
                    } else {
                        this.field2560 = arg2.method798(false);
                    }
                } else {
                    this.field2562 = arg2.method837(true);
                }
            } else {
                this.field2559 = arg2.method798(false);
            }
        } else {
            this.field2558 = arg2.method837(true);
        }
        ++field2550;
    }
}
