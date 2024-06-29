import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class261 {

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[I")
    private int[] field4490;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[B")
    private byte[] field4488;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[I")
    private int[] field4487;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lcd;")
    public static class64 field4484 = class44.method335((byte) 71, "; Expires=");

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field4486 = 0;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lcd;")
    private static class64 field4482 = class44.method335((byte) 71, " ");

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lcd;")
    public static class64 field4492 = class44.method335((byte) 71, "hitmarks");

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field4491 = 0;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Lcd;")
    public static class64 field4493 = field4482;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "[I")
    public static int[] field4496 = new int[32];

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Lja;")
    public static class60 field4497 = null;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field4495;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4496[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([BII[BII)I", line = 18)
    public final int method1837(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field4495++;
        if (arg4 >= -46) {
            this.method1837((byte[]) null, 117, 15, (byte[]) null, -5, 30);
        }
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg1 + arg2;
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field4487[var8];
            }
            int var11;
            if ((var11 = this.field4487[var8]) < 0) {
                arg3[arg1++] = (byte) (~var11);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4487[var8];
            }
            int var12;
            if ((var12 = this.field4487[var8]) < 0) {
                arg3[arg1++] = (byte) (~var12);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4487[var8];
            }
            int var13;
            if ((var13 = this.field4487[var8]) < 0) {
                arg3[arg1++] = (byte) (~var13);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4487[var8];
            }
            int var14;
            if ((var14 = this.field4487[var8]) < 0) {
                arg3[arg1++] = (byte) (~var14);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4487[var8];
            }
            int var15;
            if ((var15 = this.field4487[var8]) < 0) {
                arg3[arg1++] = (byte) (~var15);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4487[var8];
            }
            int var16;
            if ((var16 = this.field4487[var8]) < 0) {
                arg3[arg1++] = (byte) (~var16);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4487[var8];
            }
            int var17;
            if ((var17 = this.field4487[var8]) < 0) {
                arg3[arg1++] = (byte) (~var17);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4487[var8];
            }
            int var18;
            if ((var18 = this.field4487[var8]) < 0) {
                arg3[arg1++] = (byte) (~var18);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ldh;BLd;)Lfg;", line = 170)
    public static final class204 method1838(class159 arg0, byte arg1, class135 arg2) {
        long var3 = ((long) arg2.field2408 << 56) + ((long) arg2.field2391 << 32) - (long) (-(arg2.field2403 + 1 << 16) - arg2.field2400);
        field4485++;
        class204 var5 = (class204) arg0.method1151(var3, 0);
        if (arg1 != -105) {
            return (class204) null;
        }
        if (var5 == null) {
            var5 = new class204(arg2.field2403, (float) arg2.field2400, true, false, arg2.field2391);
            arg0.method1149(var5, var3, -54);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 195)
    public static void method1839(int arg0) {
        field4482 = null;
        field4493 = null;
        field4497 = null;
        field4496 = null;
        field4484 = null;
        if (arg0 == -1) {
            field4492 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 210)
    public static final void method1840(int arg0) {
        if (arg0 != 10) {
            return;
        }
        class146.field2574.method1187(arg0 - 10);
        field4483++;
        class211.field3558.method1187(0);
        class142.field2496.method1187(0);
        class97.field1784.method1187(0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIIII)V", line = 227)
    public static final void method1841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg3 - arg1;
        int var12 = arg2 - arg8;
        field4489++;
        boolean var13;
        if (class200.field3434 > 0 && class200.field3434 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg10;
        int var15 = 983040 / arg4;
        for (int var16 = -var15; var16 < (var12 + var15); var16++) {
            int var17 = arg4 * var16 + arg9 >> 16;
            int var18 = arg9 + ((var16 + 1) * arg4) >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var10000 = arg0 + var18;
                int var21 = arg0 + var17;
                int var22 = var16 + arg8 >> 6;
                if (var22 >= 0 && class62.field1209.length - 1 >= var22) {
                    int[][] var23 = class62.field1209[var22];
                    for (int var24 = -var14; var24 < var11 + var14; var24++) {
                        int var25 = arg10 * var24 + arg5 >> 16;
                        int var26 = arg5 + ((var24 + 1) * arg10) >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            int var28 = arg1 + var24 >> 6;
                            int var29 = arg7 + var25;
                            var10000 = arg7 + var26;
                            if (var28 >= 0 && var28 <= var23.length - 1 && var23[var28] != null) {
                                int var31 = ((arg1 + var24 & 0x3F) << 6) + (arg8 + var16 & 0x3F);
                                int var32 = var23[var28][var31];
                                if (var32 != 0) {
                                    class290 var33 = class172.method1207(var32 - 1, -125);
                                    if (var13 && class278.field4795 == var33.field5007) {
                                        class27 var34 = new class27();
                                        var34.field437 = var33.field5007;
                                        var34.field444 = var29;
                                        var34.field440 = var21;
                                        class241.field4135.method781(var34, 10751);
                                    }
                                    class313.field5317[var33.field5007].method306(var21 - 7, var29 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg6 != -1839311386) {
            return;
        }
        for (class27 var35 = (class27) class241.field4135.method778(0); var35 != null; var35 = (class27) class241.field4135.method775(arg6 + 1839337903)) {
            class313.field5317[var35.field437].method306(var35.field440 - 7, var35.field444 + -7);
            class210.method1463(var35.field440, var35.field444, 15, 16776960, 128);
            class210.method1463(var35.field440, var35.field444, 7, 16777215, 256);
        }
        class241.field4135.method776((byte) 113);
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([B)V", line = 339)
    public class261(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field4490 = new int[var3];
        int var4 = 0;
        this.field4488 = arg0;
        this.field4487 = new int[8];
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field4490[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class11.method91(var12, var11);
                    }
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field4487[var14] == 0) {
                            this.field4487[var14] = var4;
                        }
                        var14 = this.field4487[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field4487.length) {
                        int[] var18 = new int[this.field4487.length * 2];
                        for (int var19 = 0; var19 < this.field4487.length; var19++) {
                            var18[var19] = this.field4487[var19];
                        }
                        this.field4487 = var18;
                    }
                }
                this.field4487[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[BIBI[B)I", line = 487)
    public final int method1842(int arg0, byte[] arg1, int arg2, byte arg3, int arg4, byte[] arg5) {
        field4494++;
        int var7 = arg0 + arg2;
        int var8 = 0;
        int var9 = arg4 << 3;
        if (arg3 < 83) {
            return -105;
        }
        while (var7 > arg2) {
            int var10 = arg5[arg2] & 0xFF;
            int var11 = this.field4490[var10];
            byte var12 = this.field4488[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var12 + var14 - 1 >> 3) + var13;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class11.method91(var16, var11 >>> var17));
            if (var15 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var8 = var11 >>> var14);
                if (var15 > var13) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var15) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg2++;
        }
        return (var9 + 7 >> 3) - arg4;
    }
}
