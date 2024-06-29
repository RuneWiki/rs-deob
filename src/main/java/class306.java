import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class306 extends class324 {

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "Loj;")
    private class321 field4515;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "Lad;")
    private class362 field4516;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "Lpf;")
    private class506 field4504;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    private int field4508;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    private int field4506;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
    private int field4512;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    private int field4493;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "[[F")
    private float[][] field4514;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "[[F")
    private float[][] field4500;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "[[F")
    private float[][] field4507;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "Lbo;")
    private class632 field4511;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "Lgr;")
    private class371 field4494;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "Lil;")
    private class7 field4495;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "Lgr;")
    private class371 field4510;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "Lrt;")
    private class194 field4496;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "Lvw;")
    private class257 field4498;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "Lsd;")
    private class80 field4497;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    private int field4501;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public static int field4499 = 0;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    private int field4502;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBIIIII)V", line = 15)
    private final void method2037(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4509++;
        long var8 = -1L;
        int var10 = (arg5 << this.field4504.field1663) + arg0;
        int var11 = (arg4 << this.field4504.field1663) + arg6;
        int var12 = this.field4504.method249(var10, var11);
        if ((arg0 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class324 var13 = this.field4497.method524((byte) 101, var8);
            if (var13 != null) {
                this.method2040(((class173) var13).field2118, -1);
                return;
            }
        }
        short var14 = (short) (this.field4502++);
        if (var8 != -1L) {
            this.field4497.method520((byte) -118, new class173(var14), var8);
        }
        if (arg1 < 74) {
            this.field4497 = null;
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg6 == 0) {
            var15 = this.field4500[arg2][arg3];
            var16 = this.field4507[arg2][arg3];
            var17 = this.field4514[arg2][arg3];
        } else if (this.field4504.field1662 == arg0 && arg6 == 0) {
            var17 = this.field4514[arg2 + 1][arg3];
            var16 = this.field4507[arg2 + 1][arg3];
            var15 = this.field4500[arg2 + 1][arg3];
        } else if (this.field4504.field1662 == arg0 && this.field4504.field1662 == arg6) {
            var16 = this.field4507[arg2 + 1][arg3 + 1];
            var17 = this.field4514[arg2 + 1][arg3 + 1];
            var15 = this.field4500[arg2 + 1][arg3 + 1];
        } else if (arg0 == 0 && this.field4504.field1662 == arg6) {
            var15 = this.field4500[arg2][arg3 + 1];
            var17 = this.field4514[arg2][arg3 + 1];
            var16 = this.field4507[arg2][arg3 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field4504.field1662;
            float var19 = (float) arg6 / (float) this.field4504.field1662;
            float var20 = this.field4507[arg2][arg3];
            float var21 = this.field4500[arg2][arg3];
            float var22 = this.field4514[arg2][arg3];
            float var23 = this.field4507[arg2 + 1][arg3];
            float var24 = this.field4500[arg2 + 1][arg3];
            float var25 = (this.field4507[arg2][arg3 + 1] - var20) * var18 + var20;
            float var26 = this.field4514[arg2 + 1][arg3];
            float var27 = (this.field4500[arg2 + 1][arg3 + 1] - var24) * var18 + var24;
            float var28 = (this.field4514[arg2][arg3 + 1] - var22) * var18 + var22;
            float var29 = (this.field4500[arg2][arg3 + 1] - var21) * var18 + var21;
            float var30 = (this.field4507[arg2 + 1][arg3 + 1] - var23) * var18 + var23;
            var16 = (var30 - var25) * var19 + var25;
            var15 = (var27 - var29) * var19 + var29;
            float var31 = (this.field4514[arg2 + 1][arg3 + 1] - var26) * var18 + var26;
            var17 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field4515.method2093((byte) -110) - var10);
        float var33 = (float) (this.field4515.method2097((byte) -97) - var12);
        float var34 = (float) (this.field4515.method2095(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field4515.method2094(0);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var39 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field4515.method2098((byte) 89);
        int var45 = (int) ((float) ((var44 & 0xFFCB6C) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field4516.field5468) {
            this.field4498.method1716((float) var10, -87);
            this.field4498.method1716((float) var12, -101);
            this.field4498.method1716((float) var11, -107);
        } else {
            this.field4498.method1715((float) var10, (byte) -6);
            this.field4498.method1715((float) var12, (byte) -6);
            this.field4498.method1715((float) var11, (byte) -6);
        }
        this.field4498.method1205((byte) -69, var45);
        this.field4498.method1205((byte) -69, var46);
        this.field4498.method1205((byte) -69, var47);
        this.field4498.method1205((byte) -69, 255);
        this.method2040(var14, -1);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)Z", line = 184)
    public static final boolean method2038(int arg0, int arg1, int arg2) {
        field4505++;
        if (((arg0 & 0x10000) != 0 | class449.method2785(arg0, -21297, arg1)) || class41.method218(arg0, 88, arg1)) {
            return true;
        } else {
            int var3 = 43 / ((-arg2 - 53) / 40);
            return (arg1 & 0x37) == 0 && class251.method1654(arg1, arg0, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II[[ZII)V", line = 201)
    public final void method2039(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        field4492++;
        if (this.field4495 == null || arg0 + arg4 < this.field4508 || (arg4 - arg0) > this.field4506 || this.field4512 > (arg0 + arg1) || (arg1 - arg0) > this.field4493) {
            return;
        }
        if (arg3 != 0) {
            this.field4506 = 59;
        }
        for (int var6 = this.field4512; var6 <= this.field4493; var6++) {
            for (int var7 = this.field4508; var7 <= this.field4506; var7++) {
                int var8 = var7 - arg4;
                int var9 = var6 - arg1;
                if (var8 > (-arg0) && arg0 > var8 && -arg0 < var9 && arg0 > var9 && arg2[arg0 + var8][arg0 + var9]) {
                    this.field4516.method2300((byte) 123, (int) (this.field4515.method2091(-918913433) * 255.0F) << 24);
                    this.field4516.method2255(this.field4494, (byte) 4, null, this.field4510, null);
                    this.field4516.method2263(0, this.field4501, 4, (byte) -67, this.field4495);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(SI)V", line = 259)
    private final void method2040(short arg0, int arg1) {
        if (this.field4516.field5468) {
            this.field4496.method1229(arg0, arg1 + 30365);
        } else {
            this.field4496.method1185(arg0, 1616065864);
        }
        field4503++;
        this.field4501++;
        if (arg1 != -1) {
            this.method2037(58, (byte) -96, 42, -101, -74, 28, 71);
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lad;Lpf;Loj;[I)V", line = 287)
    public class306(class362 arg0, class506 arg1, class321 arg2, int[] arg3) {
        this.field4515 = arg2;
        this.field4516 = arg0;
        this.field4504 = arg1;
        int var5 = this.field4515.method2094(0) - (arg1.field1662 >> 1);
        this.field4508 = this.field4515.method2093((byte) -121) - var5 >> arg1.field1663;
        this.field4506 = this.field4515.method2093((byte) -101) + var5 >> arg1.field1663;
        this.field4512 = this.field4515.method2095(true) - var5 >> arg1.field1663;
        this.field4493 = this.field4515.method2095(true) + var5 >> arg1.field1663;
        int var6 = this.field4506 + 1 - this.field4508;
        int var7 = this.field4493 + 1 - this.field4512;
        this.field4514 = new float[var6 + 1][var7 + 1];
        this.field4500 = new float[var6 + 1][var7 + 1];
        this.field4507 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var26 = var8 + this.field4512;
            if (var26 > 0 && this.field4504.field1660 - 1 > var26) {
                for (int var27 = 0; var27 <= var6; var27++) {
                    int var28 = this.field4508 + var27;
                    if (var28 > 0 && var28 < (this.field4504.field1656 - 1)) {
                        int var29 = arg1.method259(var28 + 1, var26) - arg1.method259(var28 - 1, var26);
                        int var30 = arg1.method259(var28, var26 + 1) - arg1.method259(var28, var26 - 1);
                        float var31 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var30 * var30 + 65536)));
                        this.field4507[var27][var8] = (float) var29 * var31;
                        this.field4500[var27][var8] = var31 * -256.0F;
                        this.field4514[var27][var8] = (float) var30 * var31;
                    }
                }
            }
        }
        byte var9 = 0;
        int var10 = 0;
        for (int var11 = this.field4512; var11 <= this.field4493; var11++) {
            if (var11 >= 0 && var11 < arg1.field1660) {
                for (int var22 = this.field4508; var22 <= this.field4506; var22++) {
                    if (var22 >= 0 && arg1.field1656 > var22) {
                        int var23 = arg3[var10];
                        int[] var24 = arg1.field7338[var22][var11];
                        if (var24 != null && var23 != 0) {
                            if (var23 == 1) {
                                int var25 = 0;
                                while (var25 < var24.length) {
                                    if (var24[var25++] != -1 && var24[var25++] != -1 && var24[var25++] != -1) {
                                        this.field4501 += 3;
                                    }
                                }
                            } else {
                                this.field4501 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field4506 - this.field4508;
            }
        }
        if (var9 <= 0) {
            this.field4511 = null;
            this.field4494 = null;
            this.field4495 = null;
            this.field4510 = null;
        } else {
            this.field4496 = new class194(var9 * 2);
            this.field4498 = new class257(var9 * 16);
            this.field4497 = new class80(class367.method2354(-224121456, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field4512; var14 <= this.field4493; var14++) {
                if (var14 >= 0 && var14 < arg1.field1660) {
                    int var15 = 0;
                    for (int var16 = this.field4508; var16 <= this.field4506; var16++) {
                        if (var16 >= 0 && var16 < arg1.field1656) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field7338[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    int[] var19 = arg1.field7322[var16][var14];
                                    int[] var20 = arg1.field7321[var16][var14];
                                    int var21 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var18.length <= var21) {
                                                break label111;
                                            }
                                            if (var18[var21] == -1 || var18[var21 + 1] == -1 || var18[var21 + 2] == -1) {
                                                var21 += 3;
                                            } else {
                                                this.method2037(var19[var21], (byte) 77, var15, var12, var14, var16, var20[var21]);
                                                var21++;
                                                this.method2037(var19[var21], (byte) 125, var15, var12, var14, var16, var20[var21]);
                                                var21++;
                                                this.method2037(var19[var21], (byte) 116, var15, var12, var14, var16, var20[var21]);
                                                var21++;
                                            }
                                        }
                                    }
                                } else if (var17 == 3) {
                                    this.method2037(0, (byte) 112, var15, var12, var14, var16, 0);
                                    this.method2037(arg1.field1662, (byte) 108, var15, var12, var14, var16, 0);
                                    this.method2037(0, (byte) 120, var15, var12, var14, var16, arg1.field1662);
                                } else if (var17 == 2) {
                                    this.method2037(arg1.field1662, (byte) 110, var15, var12, var14, var16, 0);
                                    this.method2037(arg1.field1662, (byte) 113, var15, var12, var14, var16, arg1.field1662);
                                    this.method2037(0, (byte) 125, var15, var12, var14, var16, 0);
                                } else if (var17 == 5) {
                                    this.method2037(arg1.field1662, (byte) 103, var15, var12, var14, var16, arg1.field1662);
                                    this.method2037(0, (byte) 119, var15, var12, var14, var16, arg1.field1662);
                                    this.method2037(arg1.field1662, (byte) 87, var15, var12, var14, var16, 0);
                                } else if (var17 == 4) {
                                    this.method2037(0, (byte) 119, var15, var12, var14, var16, arg1.field1662);
                                    this.method2037(0, (byte) 95, var15, var12, var14, var16, 0);
                                    this.method2037(arg1.field1662, (byte) 91, var15, var12, var14, var16, arg1.field1662);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field4506 - this.field4508;
                }
                var12++;
            }
            this.field4495 = this.field4516.method2270(this.field4496.field2622, this.field4496.field2610, 5123, (byte) 9, false);
            this.field4511 = this.field4516.method2317(16, true, false, this.field4498.field2610, this.field4498.field2622);
            this.field4494 = new class371(this.field4511, 5126, 3, 0);
            this.field4510 = new class371(this.field4511, 5121, 4, 12);
        }
        this.field4498 = null;
        this.field4496 = null;
        this.field4497 = null;
        this.field4507 = this.field4500 = this.field4514 = null;
    }
}
