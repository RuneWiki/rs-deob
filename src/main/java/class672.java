import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class672 {

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "[B")
    private byte[] field9419;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "[I")
    private int[] field9415;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
    private int[] field9417;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lke;")
    public static class622 field9418 = new class622(49, 3);

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "[Z")
    public static boolean[] field9422 = new boolean[8];

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field9423 = 2;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field9413;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field9421;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static final void method3806(int arg0) {
        field9421++;
        if (!class533.field7529) {
            class533.field7529 = true;
            int var1 = -113 / ((-arg0 - 69) / 41);
            class243.field3478 += (12.0F - class243.field3478) / 2.0F;
            class452.field6508 = true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BIB[BI)I")
    public final int method3807(int arg0, byte[] arg1, int arg2, byte arg3, byte[] arg4, int arg5) {
        field9420++;
        int var7 = 0;
        int var8 = arg2 << 3;
        int var9 = arg0 + arg5;
        if (arg3 != 71) {
            method3806(-63);
        }
        while (arg5 < var9) {
            int var10 = arg1[arg5] & 0xFF;
            int var11 = this.field9415[var10];
            byte var12 = this.field9419[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class281.method1904(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILha;Lco;IIIIIIIIILka;)Lka;")
    public static final class495 method3808(int arg0, int arg1, class66 arg2, class129 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class495 arg13) {
        field9413++;
        if (arg13 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg3 != null) {
            int var15 = var14 | arg3.method934(-1, 256, arg12, false);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg6 << 32) + ((long) arg5 << 48) + (long) ((arg10 << 16) + arg0 - -(arg9 << 24));
        class387 var18 = class583.field8255;
        class495 var19;
        synchronized (class583.field8255) {
            var19 = (class495) class583.field8255.method2373(var16, arg1 ^ 0xFFFFFF98);
        }
        if (var19 == null || arg2.method451(var19.method113(), var14) != 0) {
            if (var19 != null) {
                var14 = arg2.method421(var14, var19.method113());
            }
            byte var20;
            if (arg0 == 1) {
                var20 = 9;
            } else if (arg0 == 2) {
                var20 = 12;
            } else if (arg0 == 3) {
                var20 = 15;
            } else if (arg0 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class229 var23 = new class229(var20 * var21 + 1, var20 * var21 * 2 + -var20, 0);
            int var24 = var23.method1593(0, 0, 87, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class601.field8476[var30] * var27 >> 14;
                    int var32 = class601.field8473[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method1593(var32, var31, arg1 + 65, 0);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg9 * var34 + arg10 * var35 >> 8);
                short var37 = (short) (((arg5 & 0xFC00) * var34 + (arg6 & 0xFC00) * var35 & 0xFC0000) + ((arg5 & 0x380) * var34 + (arg6 & 0x380) * var35 & 0x38000) + ((arg5 & 0x7F) * var34 + (arg6 & 0x7F) * var35 & 0x7F00) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method1591((byte) 28, var36, (short) -1, var24, (byte) -1, var25[0][(var38 + 1) % var20], var37, var25[0][var38], (byte) 1);
                    } else {
                        var23.method1591((byte) 71, var36, (short) -1, var25[var33 - 1][var38], (byte) -1, var25[var33 - 1][(var38 + 1) % var20], var37, var25[var33][(var38 + 1) % var20], (byte) 1);
                        var23.method1591((byte) 99, var36, (short) -1, var25[var33 - 1][var38], (byte) -1, var25[var33][(var38 + 1) % var20], var37, var25[var33][var38], (byte) 1);
                    }
                }
            }
            var19 = arg2.method420(var23, var14, class651.field9175, 64, 768);
            class387 var39 = class583.field8255;
            synchronized (class583.field8255) {
                class583.field8255.method2362(var19, arg1 + 1, var16);
            }
        }
        int var40 = arg13.method97();
        int var41 = arg13.method79();
        int var42 = arg13.method80();
        int var43 = arg13.method115();
        class520 var44 = null;
        if (arg3 != null) {
            int var45 = arg3.field1684[arg12];
            var44 = class203.field2975.method1935(984, var45 >> 16);
            arg12 = var45 & 0xFFFF;
        }
        class495 var46;
        if (var44 == null) {
            var46 = var19.method81((byte) 3, var14, true);
            var46.method98(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method70(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method81((byte) 3, var14, true);
            var46.method98(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method70(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method2896(arg12, (byte) -98, var44);
        }
        if (~arg7 != arg1) {
            var46.method114(arg7);
        }
        if (arg8 != 0) {
            var46.method59(arg8);
        }
        if (arg4 != 0) {
            var46.method70(0, arg4, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZ[Lwq;II)V")
    public static final void method3809(int arg0, int arg1, boolean arg2, class176[] arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class176 var7 = arg3[var6];
            if (var7 != null && var7.field2661 == arg5) {
                class260.method1711(false, arg2, arg1, arg0, var7);
                class584.method3390(var7, arg1, arg0, 3);
                if ((var7.field2629 - var7.field2673) < var7.field2620) {
                    var7.field2620 = var7.field2629 - var7.field2673;
                }
                if (var7.field2508 > (var7.field2542 - var7.field2664)) {
                    var7.field2508 = var7.field2542 - var7.field2664;
                }
                if (var7.field2620 < 0) {
                    var7.field2620 = 0;
                }
                if (var7.field2508 < 0) {
                    var7.field2508 = 0;
                }
                if (var7.field2560 == 0) {
                    class493.method2885(arg2, var7, (byte) -75);
                }
            }
        }
        if (arg4 != 24729) {
            method3808(1, -68, null, null, -103, 77, 125, -126, -113, -7, -27, -55, -65, null);
        }
        field9416++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BII[BI)I")
    public final int method3810(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field9414++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        if (arg0 <= 38) {
            return -10;
        }
        int var8 = arg3 + arg5;
        int var9 = arg2;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var7 = this.field9417[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field9417[var7]) < 0) {
                arg4[arg5++] = (byte) (~var11);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field9417[var7];
            }
            int var12;
            if ((var12 = this.field9417[var7]) < 0) {
                arg4[arg5++] = (byte) (~var12);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field9417[var7];
            }
            int var13;
            if ((var13 = this.field9417[var7]) < 0) {
                arg4[arg5++] = (byte) (~var13);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field9417[var7];
            }
            int var14;
            if ((var14 = this.field9417[var7]) < 0) {
                arg4[arg5++] = (byte) (~var14);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field9417[var7];
            }
            int var15;
            if ((var15 = this.field9417[var7]) < 0) {
                arg4[arg5++] = (byte) (~var15);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field9417[var7];
            }
            int var16;
            if ((var16 = this.field9417[var7]) < 0) {
                arg4[arg5++] = (byte) (~var16);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field9417[var7];
            }
            int var17;
            if ((var17 = this.field9417[var7]) < 0) {
                arg4[arg5++] = (byte) (~var17);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field9417[var7];
            }
            int var18;
            if ((var18 = this.field9417[var7]) < 0) {
                arg4[arg5++] = (byte) (~var18);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method3811(int arg0) {
        field9422 = null;
        if (arg0 == -715915472) {
            field9418 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([B)V")
    public class672(byte[] arg0) {
        int var2 = arg0.length;
        this.field9419 = arg0;
        this.field9415 = new int[var2];
        this.field9417 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field9415[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class281.method1904(var10, var11);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field9417[var14] == 0) {
                            this.field9417[var14] = var4;
                        }
                        var14 = this.field9417[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field9417.length) {
                        int[] var18 = new int[this.field9417.length * 2];
                        for (int var19 = 0; var19 < this.field9417.length; var19++) {
                            var18[var19] = this.field9417[var19];
                        }
                        this.field9417 = var18;
                    }
                }
                this.field9417[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
