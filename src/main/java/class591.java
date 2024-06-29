import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class591 {

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Leh;")
    private class544 field8508;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Ljj;")
    private class334 field8509;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public int field8507;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    private int field8513;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    private int field8512;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "[B")
    public byte[] field8516;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    private int field8502;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    private int field8517;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8520 = new String[] { method4371(method4370("y\u001e`\u00062")), method4371(method4370("y\u001e`\f2")), method4371(method4370("u\u000f\"#")), method4371(method4370("`T`ag")), method4371(method4370("y\u001e`\u000e2")), method4371(method4370("y\u001e`\b2")), method4371(method4370("y\u001e`ssu\u0013:q2")), method4371(method4370("y\u001e`\u00072")), method4371(method4370("y\u001e`\u000b2")), method4371(method4370("y\u001e`\t2")), method4371(method4370("y\u001e`\n2")), method4371(method4370("y\u001e`\r2")) };

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field8497 = new String[200];

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[Lel;")
    public static class585[] field8511 = new class585[16];

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field8499 = -1;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lwm;")
    public static class440 field8505;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lpc;")
    public static class632 field8501;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[[Laba;")
    private class29[][] field8515;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lr;III)V", line = 4)
    public final void method4361(class412 arg0, int arg1, int arg2, int arg3) {
        try {
            field8514++;
            class432 var5 = (class432) arg0;
            arg1 += var5.field6263 + 1;
            arg2 += var5.field6265 + 1;
            int var6 = arg1 + (this.field8507 * arg2);
            int var7 = 0;
            if (arg3 == -1436) {
                int var8 = var5.field6255;
                int var9 = var5.field6269;
                int var10 = this.field8507 - var9;
                int var11 = 0;
                if (arg2 <= 0) {
                    int var12 = 1 - arg2;
                    var7 += var9 * var12;
                    var8 -= var12;
                    var6 += this.field8507 * var12;
                    arg2 = 1;
                }
                if (this.field8513 <= arg2 + var8) {
                    int var13 = arg2 + var8 + 1 - this.field8513;
                    var8 -= var13;
                }
                if (arg1 <= 0) {
                    int var14 = 1 - arg1;
                    var10 += var14;
                    var11 += var14;
                    arg1 = 1;
                    var7 += var14;
                    var9 -= var14;
                    var6 += var14;
                }
                if ((arg1 + var9) >= this.field8507) {
                    int var15 = arg1 + var9 + 1 - this.field8507;
                    var11 += var15;
                    var10 += var15;
                    var9 -= var15;
                }
                if (var9 > 0 && var8 > 0) {
                    class727.method5295(var10, var11, var6, var8, var7, var5.field6259, var9, this.field8516, arg3 - 7559);
                    this.method4368(arg2, var9, -128, var8, arg1);
                }
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field8520[5] + (arg0 == null ? field8520[2] : field8520[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([[ZIIIZI)V", line = 76)
    public final void method4362(boolean[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        try {
            field8504++;
            this.field8509.method2647(false, 0);
            this.field8509.method2628(1, false);
            int var7 = 79 % ((arg5 - 25) / 46);
            this.field8509.method2619(1, 1);
            this.field8509.method2679(2, 1);
            this.field8509.method2664(false, false, 16, -2);
            float var8 = 1.0F / (float) (this.field8509.field4803 * 128);
            if (arg4) {
                for (int var27 = 0; var27 < this.field8517; var27++) {
                    int var28 = var27 << this.field8512;
                    int var29 = var27 + 1 << this.field8512;
                    label117: for (int var30 = 0; var30 < this.field8502; var30++) {
                        if (this.field8515[var30][var27] != null) {
                            int var31 = var30 << this.field8512;
                            int var32 = var30 + 1 << this.field8512;
                            for (int var33 = var31; var33 < var32; var33++) {
                                if (var33 - arg2 >= -arg1 && arg1 >= var33 - arg2) {
                                    for (int var34 = var28; var34 < var29; var34++) {
                                        if ((var34 - arg3) >= (-arg1) && var34 - arg3 <= arg1 && arg0[var33 + arg1 - arg2][arg1 + var34 - arg3]) {
                                            class639 var35 = this.field8509.method2642(true);
                                            var35.method4664(var8, 22931, 1.0F, var8);
                                            var35.method721(-var30, -var27, 0);
                                            this.field8509.method2650(class467.field6818, -89);
                                            this.field8515[var30][var27].method321((byte) 31);
                                            continue label117;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var9 = 0; var9 < this.field8517; var9++) {
                    int var10 = var9 << this.field8512;
                    int var11 = var9 + 1 << this.field8512;
                    for (int var12 = 0; var12 < this.field8502; var12++) {
                        class29 var13 = this.field8515[var12][var9];
                        if (var13 != null) {
                            class517 var14 = this.field8509.method2689(var13.field359 * 3, false);
                            Buffer var15 = var14.method2343((byte) 54, true);
                            if (var15 != null) {
                                Stream var16 = this.field8509.method2651(var15, 16);
                                int var17 = 0;
                                int var18 = var12 << this.field8512;
                                int var19 = var12 + 1 << this.field8512;
                                for (int var20 = var10; var20 < var11; var20++) {
                                    if ((-arg1) <= (var20 - arg3) && var20 - arg3 <= arg1) {
                                        int var21 = this.field8508.field10701 * var20 + var18;
                                        for (int var22 = var18; var22 < var19; var22++) {
                                            if (-arg1 <= var22 - arg2 && var22 - arg2 <= arg1 && arg0[arg1 + var22 - arg2][var20 + arg1 - arg3]) {
                                                short[] var23 = this.field8508.field7966[var21];
                                                if (var23 != null) {
                                                    if (Stream.method3200()) {
                                                        for (int var24 = 0; var24 < var23.length; var24++) {
                                                            var17++;
                                                            var16.method3195(var23[var24] & 0xFFFF);
                                                        }
                                                    } else {
                                                        for (int var25 = 0; var25 < var23.length; var25++) {
                                                            var17++;
                                                            var16.method3198(var23[var25] & 0xFFFF);
                                                        }
                                                    }
                                                }
                                            }
                                            var21++;
                                        }
                                    }
                                }
                                var16.method3199();
                                if (var14.method2339(true) && var17 > 0) {
                                    class639 var26 = this.field8509.method2642(true);
                                    var26.method4664(var8, 22931, 1.0F, var8);
                                    var26.method721(-var12, -var9, 0);
                                    this.field8509.method2650(class467.field6818, 54);
                                    var13.method325(var17 / 3, var14, (byte) 112);
                                }
                            }
                        }
                    }
                }
            }
            this.field8509.method2625(Integer.MAX_VALUE);
        } catch (RuntimeException var37) {
            throw class665.method4799(var37, field8520[10] + (arg0 == null ? field8520[2] : field8520[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V", line = 277)
    public final void method4363(int arg0) {
        try {
            if (arg0 != -1) {
                this.field8508 = null;
            }
            this.field8515 = new class29[this.field8502][this.field8517];
            field8503++;
            for (int var2 = 0; var2 < this.field8517; var2++) {
                for (int var3 = 0; var3 < this.field8502; var3++) {
                    this.field8515[var3][var2] = new class29(this.field8509, this, this.field8508, var3, var2, this.field8512, var3 * 128 + 1, var2 * 128 + 1);
                    if (this.field8515[var3][var2].field359 == 0) {
                        this.field8515[var3][var2] = null;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8520[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILr;IZ)V", line = 310)
    public final void method4364(int arg0, class412 arg1, int arg2, boolean arg3) {
        try {
            field8519++;
            class432 var5 = (class432) arg1;
            if (arg3) {
                field8506 = -71;
            }
            arg2 += var5.field6263 + 1;
            arg0 += var5.field6265 + 1;
            int var6 = arg2 + (this.field8507 * arg0);
            int var7 = 0;
            int var8 = var5.field6255;
            int var9 = var5.field6269;
            int var10 = this.field8507 - var9;
            if (arg0 <= 0) {
                int var11 = 1 - arg0;
                var7 += var9 * var11;
                arg0 = 1;
                var6 += this.field8507 * var11;
                var8 -= var11;
            }
            int var12 = 0;
            if (this.field8513 <= (arg0 + var8)) {
                int var13 = arg0 + var8 + 1 - this.field8513;
                var8 -= var13;
            }
            if (arg2 <= 0) {
                int var14 = 1 - arg2;
                var12 += var14;
                arg2 = 1;
                var10 += var14;
                var9 -= var14;
                var6 += var14;
                var7 += var14;
            }
            if (this.field8507 <= arg2 + var9) {
                int var15 = var9 + arg2 + 1 - this.field8507;
                var9 -= var15;
                var12 += var15;
                var10 += var15;
            }
            if (var9 > 0 && var8 > 0) {
                class627.method4605(var7, var8, var6, var5.field6259, (byte) -26, var10, this.field8516, var12, var9);
                this.method4368(arg0, var9, -128, var8, arg2);
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field8520[11] + arg0 + ',' + (arg1 == null ? field8520[2] : field8520[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 382)
    public static void method4365(int arg0) {
        try {
            field8511 = null;
            field8505 = null;
            field8497 = null;
            field8501 = null;
            if (arg0 != -19467) {
                field8497 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8520[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZILr;)Z", line = 395)
    public final boolean method4366(int arg0, boolean arg1, int arg2, class412 arg3) {
        try {
            if (!arg1) {
                this.method4366(29, true, -11, null);
            }
            field8498++;
            class432 var5 = (class432) arg3;
            arg0 += var5.field6263 + 1;
            arg2 += var5.field6265 + 1;
            int var6 = this.field8507 * arg2 + arg0;
            int var7 = var5.field6255;
            int var8 = var5.field6269;
            if (arg2 <= 0) {
                int var9 = 1 - arg2;
                arg2 = 1;
                var7 -= var9;
                var6 += this.field8507 * var9;
            }
            int var10 = this.field8507 - var8;
            if (this.field8513 <= (arg2 + var7)) {
                int var11 = arg2 - (this.field8513 - var7 - 1);
                var7 -= var11;
            }
            if (arg0 <= 0) {
                int var12 = 1 - arg0;
                arg0 = 1;
                var10 += var12;
                var8 -= var12;
                var6 += var12;
            }
            if (arg0 + var8 >= this.field8507) {
                int var13 = arg0 + var8 + 1 - this.field8507;
                var8 -= var13;
                var10 += var13;
            }
            if (var8 > 0 && var7 > 0) {
                byte var14 = 8;
                int var15 = (var14 - 1) * this.field8507 + var10;
                return class385.method3034(var8, var15, var7, var6, this.field8516, false, var14);
            } else {
                return false;
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field8520[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8520[2] : field8520[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V", line = 472)
    public static final void method4367(int arg0, int arg1) {
        try {
            field8510++;
            class147.field1894 = 3;
            class570.field8272 = -1;
            class426.field6140 = arg1;
            class230.field3330 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8520[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V", line = 490)
    private final void method4368(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field8518++;
            if (this.field8515 != null) {
                int var6 = arg4 - 1 >> 7;
                int var7 = arg1 + arg4 - 1 - 1 >> 7;
                if (arg2 >= -126) {
                    method4365(-42);
                }
                int var8 = arg0 - 1 >> 7;
                int var9 = arg0 - (1 - arg3) - 1 >> 7;
                for (int var10 = var6; var10 <= var7; var10++) {
                    class29[] var11 = this.field8515[var10];
                    for (int var12 = var8; var12 <= var9; var12++) {
                        if (var11[var12] != null) {
                            var11[var12].field374 = true;
                        }
                    }
                }
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field8520[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljj;Leh;)V", line = 549)
    public class591(class334 arg0, class544 arg1) {
        try {
            this.field8508 = arg1;
            this.field8509 = arg0;
            this.field8507 = (this.field8508.field10701 * this.field8508.field10690 >> this.field8509.field4773) + 2;
            this.field8513 = (this.field8508.field10703 * this.field8508.field10690 >> this.field8509.field4773) + 2;
            this.field8512 = this.field8509.field4773 + 7 - this.field8508.field10692;
            this.field8516 = new byte[this.field8513 * this.field8507];
            this.field8502 = this.field8508.field10701 >> this.field8512;
            this.field8517 = this.field8508.field10703 >> this.field8512;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8520[6] + (arg0 == null ? field8520[2] : field8520[3]) + ',' + (arg1 == null ? field8520[2] : field8520[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 564)
    public static final void method4369(int arg0) {
        try {
            for (int var1 = arg0; var1 < 100; var1++) {
                class752.field10742[var1] = true;
            }
            field8500++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8520[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4370(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4371(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 78;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 26;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
