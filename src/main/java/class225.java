import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class225 {

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Z")
    private boolean field3543 = false;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    private int field3545 = 32;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "J")
    private long field3538 = class338.method2339((byte) -120);

    @OriginalMember(owner = "client!og", name = "H", descriptor = "J")
    private long field3569 = 0L;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    private int field3563 = 0;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    private int field3564 = 0;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "[Laj;")
    private class198[] field3570 = new class198[8];

    @OriginalMember(owner = "client!og", name = "J", descriptor = "[Laj;")
    private class198[] field3571 = new class198[8];

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    private int field3568 = 0;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "J")
    private long field3565 = 0L;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "Z")
    private boolean field3566 = true;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    private int field3560 = 0;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field3555 = 0;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    private int field3562;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "Laj;")
    private class198 field3552;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[I")
    public int[] field3540;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "[Loj;")
    public static class283[] field3554;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 4)
    public static void method1487(int arg0) {
        if (arg0 != -24718) {
            field3554 = (class283[]) null;
        }
        field3554 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I[BBI)I", line = 18)
    public static final int method1488(int arg0, byte[] arg1, byte arg2, int arg3) {
        field3559++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = class321.field4892[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        if (arg2 >= -127) {
            method1489(true, (byte) -109);
        }
        return var6;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZB)V", line = 40)
    public static final void method1489(boolean arg0, byte arg1) {
        if (arg0 && class104.field1803 != null) {
            class41.field786 = class104.field1803.field5017;
        } else {
            class41.field786 = -1;
        }
        class118.field2065 = null;
        class313.field4764 = (byte[][][]) null;
        class104.field1803 = null;
        class103.field1781 = (byte[][][]) null;
        class336.field5155 = (int[][][]) null;
        class190.field3085 = (int[][][]) null;
        class51.field1021 = (byte[][][]) null;
        field3542++;
        class196.field3152 = 0;
        class169.field2704 = (byte[][][]) null;
        class97.field1721 = (byte[][][]) null;
        class94.field1686 = null;
        class183.field2927 = (int[][][]) null;
        class46.field943.method432(59);
        class305.field4612 = null;
        class71.field1493 = null;
        class345.field5353 = -1;
        class250.field3932 = null;
        class197.field3163 = null;
        class328.field5036 = null;
        class74.field1518 = null;
        if (arg1 != -54) {
            method1487(126);
        }
        class334.field5118 = null;
        class68.field1461 = null;
        class27.field527 = null;
        class344.field5341 = null;
        class336.field5148 = -1;
        class222.field3517 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V", line = 82)
    private final void method1490(int arg0, boolean arg1) {
        this.field3560 -= arg0;
        field3536++;
        if (this.field3560 < 0) {
            this.field3560 = 0;
        }
        if (this.field3552 != null) {
            this.field3552.method1228(arg0);
        }
        if (!arg1) {
            this.method1492((byte) -4, (class198) null);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V", line = 99)
    public void method936() throws Exception {
        field3550++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II[[FIII[[FIFIZ[[III[[F[[ILml;I)I", line = 106)
    public static final int method1491(int arg0, int arg1, float[][] arg2, int arg3, int arg4, int arg5, float[][] arg6, int arg7, float arg8, int arg9, boolean arg10, int[][] arg11, int arg12, int arg13, float[][] arg14, int[][] arg15, class16 arg16, int arg17) {
        if (arg17 == 1) {
            int var18 = arg7;
            arg7 = arg3;
            arg3 = 128 - var18;
        } else if (arg17 == 2) {
            arg7 = 128 - arg7;
            arg3 = 128 - arg3;
        } else if (arg17 == 3) {
            int var19 = arg7;
            arg7 = 128 - arg3;
            arg3 = var19;
        }
        field3547++;
        if (arg9 != 256) {
            method1491(10, 91, (float[][]) ((float[][]) null), 111, 90, 0, (float[][]) ((float[][]) null), 83, -1.1935942F, 33, true, (int[][]) ((int[][]) null), -71, -118, (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (class16) null, -113);
        }
        float var20;
        float var21;
        float var22;
        int var23;
        if (arg7 == 0 && arg3 == 0) {
            var20 = arg2[arg0][arg5];
            var21 = arg6[arg0][arg5];
            var22 = arg14[arg0][arg5];
            var23 = arg13;
        } else if (arg7 == 128 && arg3 == 0) {
            var21 = arg6[arg0 + 1][arg5];
            var22 = arg14[arg0 + 1][arg5];
            var23 = arg1;
            var20 = arg2[arg0 + 1][arg5];
        } else if (arg7 == 128 && arg3 == 128) {
            var20 = arg2[arg0 + 1][arg5 + 1];
            var23 = arg12;
            var21 = arg6[arg0 + 1][arg5 + 1];
            var22 = arg14[arg0 + 1][arg5 + 1];
        } else if (arg7 == 0 && arg3 == 128) {
            var21 = arg6[arg0][arg5 + 1];
            var22 = arg14[arg0][arg5 + 1];
            var23 = arg4;
            var20 = arg2[arg0][arg5 + 1];
        } else {
            float var24 = arg14[arg0][arg5];
            float var25 = arg6[arg0][arg5];
            float var26 = arg2[arg0][arg5];
            float var27 = (float) arg7 / 128.0F;
            float var28 = (arg14[arg0 + 1][arg5] - var24) * var27 + var24;
            float var29 = (arg2[arg0 + 1][arg5] - var26) * var27 + var26;
            float var30 = (float) arg3 / 128.0F;
            float var31 = arg6[arg0][arg5 + 1];
            float var32 = (arg6[arg0 + 1][arg5 + 1] - var31) * var27 + var31;
            float var33 = arg2[arg0][arg5 + 1];
            float var34 = (arg2[arg0 + 1][arg5 + 1] - var33) * var27 + var33;
            float var35 = arg14[arg0][arg5 + 1];
            float var36 = (arg14[arg0 + 1][arg5 + 1] - var35) * var27 + var35;
            float var37 = (arg6[arg0 + 1][arg5] - var25) * var27 + var25;
            var22 = (var36 - var28) * var30 + var28;
            int var38 = class276.method1850(arg1, (byte) -118, arg7, arg13);
            var21 = (var32 - var37) * var30 + var37;
            int var39 = class276.method1850(arg12, (byte) 33, arg7, arg4);
            var23 = class276.method1850(var39, (byte) -116, arg3, var38);
            var20 = (var34 - var29) * var30 + var29;
        }
        int var40 = (arg0 << 7) + arg7;
        int var41 = class150.method978(arg0, arg7, (byte) 122, arg5, arg3, arg11);
        int var42 = (arg5 << 7) + arg3;
        return arg16.method117(var40, var41, var42, var20, var21, var22, arg10 ? var23 & 0xFFFFFF00 : var23, arg15 == null ? 0.0F : (float) (var41 - class150.method978(arg0, arg7, (byte) 107, arg5, arg3, arg15)) / arg8);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLaj;)V", line = 218)
    public final synchronized void method1492(byte arg0, class198 arg1) {
        field3557++;
        this.field3552 = arg1;
        int var3 = -102 / ((-arg0 - 77) / 33);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 231)
    public final synchronized void method1493(byte arg0) {
        field3541++;
        this.field3566 = true;
        try {
            this.method935();
        } catch (Exception var3) {
            this.method931();
            this.field3569 = class338.method2339((byte) -120) + 2000L;
        }
        if (arg0 != 12) {
            this.field3552 = (class198) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([II)V", line = 251)
    private final void method1494(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class119.field2071) {
            var3 = arg1 << 1;
        }
        class129.method855(arg0, 0, var3);
        this.field3560 -= arg1;
        if (this.field3552 != null && this.field3560 <= 0) {
            this.field3560 += class303.field4596 >> 4;
            class244.method1621(0, this.field3552);
            this.method1498(this.field3552.method1266(), this.field3552, 109);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class198 var10 = null;
                        class198 var11 = this.field3571[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class161 var12 = var11.field3177;
                                if (var12 == null || var12.field2610 <= var8) {
                                    var11.field3176 = true;
                                    int var13 = var11.method1233();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2610 += var13;
                                    }
                                    if (var4 >= this.field3545) {
                                        break label105;
                                    }
                                    class198 var14 = var11.method1234();
                                    if (var14 != null) {
                                        int var15 = var11.field3179;
                                        while (var14 != null) {
                                            this.method1498(var15 * var14.method1266() >> 8, var14, 68);
                                            var14 = var11.method1235();
                                        }
                                    }
                                    class198 var16 = var11.field3178;
                                    var11.field3178 = null;
                                    if (var10 == null) {
                                        this.field3571[var7] = var16;
                                    } else {
                                        var10.field3178 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3570[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3178;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class198 var18 = this.field3571[var17];
                this.field3571[var17] = this.field3570[var17] = null;
                while (var18 != null) {
                    class198 var19 = var18.field3178;
                    var18.field3178 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3560 < 0) {
            this.field3560 = 0;
        }
        if (this.field3552 != null) {
            this.field3552.method1227(arg0, 0, arg1);
        }
        this.field3538 = class338.method2339((byte) -120);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I", line = 417)
    public static final int method1495(int arg0, int arg1) {
        field3551++;
        if (class177.field2860 != null) {
            class177.field2860.method607((byte) -76);
            class177.field2860 = null;
        }
        class125.field2175++;
        if (class125.field2175 > 4) {
            class125.field2174 = 0;
            class125.field2175 = 0;
            return arg0;
        } else if (arg1 > -125) {
            return -108;
        } else {
            class125.field2174 = 0;
            if (class267.field4119 == class151.field2469) {
                class151.field2469 = class97.field1722;
            } else {
                class151.field2469 = class267.field4119;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()I", line = 453)
    public int method934() throws Exception {
        field3539++;
        return this.field3561;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 461)
    public void method933(Component arg0) throws Exception {
        field3546++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V", line = 476)
    public final synchronized void method1496(boolean arg0) {
        if (class307.field4656 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class307.field4656.field2616[var3] == this) {
                    class307.field4656.field2616[var3] = null;
                }
                if (class307.field4656.field2616[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class307.field4656.field2613 = true;
                while (class307.field4656.field2615) {
                    class127.method843(-29, 50L);
                }
                class307.field4656 = null;
            }
        }
        this.method931();
        this.field3543 = true;
        field3549++;
        this.field3540 = null;
        if (arg0) {
            this.field3565 = 88L;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V", line = 522)
    public final void method1497(int arg0) {
        field3558++;
        int var2 = 55 % ((arg0 + 28) / 58);
        this.field3566 = true;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILaj;I)V", line = 536)
    private final void method1498(int arg0, class198 arg1, int arg2) {
        int var4 = arg0 >> 5;
        class198 var5 = this.field3570[var4];
        field3548++;
        if (var5 == null) {
            this.field3571[var4] = arg1;
        } else {
            var5.field3178 = arg1;
        }
        if (arg2 < 54) {
            this.method1496(false);
        }
        this.field3570[var4] = arg1;
        arg1.field3179 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V", line = 557)
    public final synchronized void method1499(byte arg0) {
        field3556++;
        int var2 = 94 / ((27 - arg0) / 60);
        if (this.field3543) {
            return;
        }
        long var3 = class338.method2339((byte) -120);
        try {
            if ((this.field3538 + 500000L) < var3) {
                this.field3538 = var3 - 500000L;
            }
            while (this.field3538 + 5000L < var3) {
                this.method1490(256, true);
                this.field3538 += (long) (256000 / class303.field4596);
            }
        } catch (Exception var10) {
            this.field3538 = var3;
        }
        if (this.field3540 == null) {
            return;
        }
        try {
            if (this.field3569 != 0L) {
                if (this.field3569 > var3) {
                    return;
                }
                this.method932(this.field3561);
                this.field3569 = 0L;
                this.field3566 = true;
            }
            int var6 = this.method934();
            if ((this.field3564 - var6) > this.field3563) {
                this.field3563 = this.field3564 - var6;
            }
            int var7 = this.field3567 + this.field3562;
            if ((var7 + 256) > 16384) {
                var7 = 16128;
            }
            if (var7 + 256 > this.field3561) {
                this.field3561 += 1024;
                var6 = 0;
                if (this.field3561 > 16384) {
                    this.field3561 = 16384;
                }
                this.method931();
                this.method932(this.field3561);
                if (var7 + 256 > this.field3561) {
                    var7 = this.field3561 - 256;
                    this.field3562 = var7 - this.field3567;
                }
                this.field3566 = true;
            }
            while (var6 < var7) {
                var6 += 256;
                this.method1494(this.field3540, 256);
                this.method936();
            }
            if (this.field3565 < var3) {
                if (this.field3566) {
                    this.field3566 = false;
                } else if (this.field3563 == 0 && this.field3568 == 0) {
                    this.method931();
                    this.field3569 = var3 + 2000L;
                    return;
                } else {
                    this.field3562 = Math.min(this.field3568, this.field3563);
                    this.field3568 = this.field3563;
                }
                this.field3563 = 0;
                this.field3565 = var3 + 2000L;
            }
            this.field3564 = var6;
        } catch (Exception var9) {
            this.method931();
            this.field3569 = var3 + 2000L;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V", line = 678)
    public void method932(int arg0) throws Exception {
        field3537++;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "()V", line = 688)
    public void method935() throws Exception {
        field3544++;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "()V", line = 697)
    public void method931() {
        field3553++;
    }
}
