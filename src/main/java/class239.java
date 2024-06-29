import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class239 {

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "[I")
    private int[] field4393;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "[B")
    private byte[] field4396;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
    private int[] field4387;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field4385 = 0;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field4392 = -1;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Ldc;")
    public static class37 field4398 = class185.method1233((byte) 86, "");

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field4397 = 5063219;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Ldc;")
    private static class37 field4401 = class185.method1233((byte) 86, " from your ignore list first)3");

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Ldc;")
    public static class37 field4400 = field4401;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field4389 = 0;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[Lji;")
    public static class106[] field4399;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public static void method1567(boolean arg0) {
        if (!arg0) {
            field4389 = -64;
        }
        field4399 = null;
        field4398 = null;
        field4401 = null;
        field4400 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[BIII[B)I")
    public final int method1568(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field4395++;
        if (arg4 < 26) {
            field4399 = null;
        }
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var8 = this.field4393[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field4393[var8]) < 0) {
                arg1[arg2++] = (byte) ~var11;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4393[var8];
            }
            int var12;
            if ((var12 = this.field4393[var8]) < 0) {
                arg1[arg2++] = (byte) ~var12;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4393[var8];
            }
            int var13;
            if ((var13 = this.field4393[var8]) < 0) {
                arg1[arg2++] = (byte) ~var13;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4393[var8];
            }
            int var14;
            if ((var14 = this.field4393[var8]) < 0) {
                arg1[arg2++] = (byte) ~var14;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4393[var8];
            }
            int var15;
            if ((var15 = this.field4393[var8]) < 0) {
                arg1[arg2++] = (byte) ~var15;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4393[var8];
            }
            int var16;
            if ((var16 = this.field4393[var8]) < 0) {
                arg1[arg2++] = (byte) ~var16;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4393[var8];
            }
            int var17;
            if ((var17 = this.field4393[var8]) < 0) {
                arg1[arg2++] = (byte) ~var17;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4393[var8];
            }
            int var18;
            if ((var18 = this.field4393[var8]) < 0) {
                arg1[arg2++] = (byte) ~var18;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static final void method1569(byte arg0) {
        field4391++;
        class82.field1454 &= 0x7FF;
        int var1 = class159.field3006 >> 7;
        int var2 = class3.field28 >> 7;
        if (class242.field4445 < 128) {
            class242.field4445 = 128;
        }
        if (class242.field4445 > 383) {
            class242.field4445 = 383;
        }
        int var3 = class145.method1008(class125.field2246, class159.field3006, class3.field28, (byte) 127);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class125.field2246;
                    if (var7 < 3 && (class193.field3602[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class39.field808[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = -8 % ((-arg0 - 21) / 50);
        int var10 = var4 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (var10 > class58.field1082) {
            class58.field1082 += (var10 - class58.field1082) / 24;
        } else if (class58.field1082 > var10) {
            class58.field1082 += (var10 - class58.field1082) / 80;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4394++;
        class11.method71(arg6, -109);
        int var7 = 0;
        int var8 = arg6 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -1;
        int var13 = -var8;
        int var14 = -1;
        int[] var15 = class11.field156[arg1];
        int var16 = -87 % ((arg4 - 44) / 52);
        int var17 = arg5 + var8;
        int var18 = arg5 - var8;
        class29.method242(var18, (byte) -30, arg2, var15, arg5 - arg6);
        class29.method242(var17, (byte) -30, arg3, var15, var18);
        class29.method242(arg5 + arg6, (byte) -30, arg2, var15, var17);
        while (var7 < var9) {
            var14 += 2;
            var13 += var14;
            if (var13 >= 0 && var11 >= 1) {
                class95.field1661[var11] = var7;
                var11--;
                var13 -= var11 << 1;
            }
            var12 += 2;
            var10 += var12;
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 >= var8) {
                    int[] var19 = class11.field156[arg1 + var9];
                    int[] var20 = class11.field156[arg1 - var9];
                    int var21 = arg5 - var7;
                    int var22 = arg5 + var7;
                    class29.method242(var22, (byte) -30, arg2, var19, var21);
                    class29.method242(var22, (byte) -30, arg2, var20, var21);
                } else {
                    int[] var23 = class11.field156[arg1 - var9];
                    int[] var24 = class11.field156[arg1 + var9];
                    int var25 = class95.field1661[var9];
                    int var26 = arg5 + var7;
                    int var27 = arg5 - var7;
                    int var28 = arg5 + var25;
                    int var29 = arg5 - var25;
                    class29.method242(var29, (byte) -30, arg2, var24, var27);
                    class29.method242(var28, (byte) -30, arg3, var24, var29);
                    class29.method242(var26, (byte) -30, arg2, var24, var28);
                    class29.method242(var29, (byte) -30, arg2, var23, var27);
                    class29.method242(var28, (byte) -30, arg3, var23, var29);
                    class29.method242(var26, (byte) -30, arg2, var23, var28);
                }
            }
            int[] var30 = class11.field156[arg1 + var7];
            int[] var31 = class11.field156[arg1 - var7];
            int var32 = arg5 - var9;
            int var33 = arg5 + var9;
            if (var7 < var8) {
                int var34 = var7 > var11 ? class95.field1661[var7] : var11;
                int var35 = arg5 + var34;
                int var36 = arg5 - var34;
                class29.method242(var36, (byte) -30, arg2, var30, var32);
                class29.method242(var35, (byte) -30, arg3, var30, var36);
                class29.method242(var33, (byte) -30, arg2, var30, var35);
                class29.method242(var36, (byte) -30, arg2, var31, var32);
                class29.method242(var35, (byte) -30, arg3, var31, var36);
                class29.method242(var33, (byte) -30, arg2, var31, var35);
            } else {
                class29.method242(var33, (byte) -30, arg2, var30, var32);
                class29.method242(var33, (byte) -30, arg2, var31, var32);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([B)V")
    public class239(byte[] arg0) {
        int var2 = arg0.length;
        this.field4393 = new int[8];
        this.field4396 = arg0;
        this.field4387 = new int[var2];
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field4387[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var4[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var4[var9] = var4[var9 - 1];
                            break;
                        }
                        var4[var9] = class138.method960(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var4[var6 - 1];
                }
                var4[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field4393[var14] == 0) {
                            this.field4393[var14] = var3;
                        }
                        var14 = this.field4393[var14];
                    }
                    if (this.field4393.length <= var14) {
                        int[] var17 = new int[this.field4393.length * 2];
                        for (int var18 = 0; var18 < this.field4393.length; var18++) {
                            var17[var18] = this.field4393[var18];
                        }
                        this.field4393 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field4393[var14] = ~var5;
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZIII)V")
    public static final void method1571(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4386++;
        if (!arg1) {
            return;
        }
        if (arg3 - arg0 >= class29.field536 && arg0 + arg3 <= class82.field1458 && arg4 - arg0 >= class198.field3697 && class199.field3712 >= arg4 + arg0) {
            class96.method640((byte) -116, arg3, arg0, arg2, arg4);
        } else {
            class241.method1577(arg3, arg2, (byte) -100, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BII[B)I")
    public final int method1572(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field4388++;
        int var7 = arg1 + arg3;
        int var8 = 0;
        int var9 = arg4 << 3;
        if (arg0 != -1323418753) {
            method1570(-70, -127, -102, -50, 5, -21, 0);
        }
        while (var7 > arg1) {
            int var10 = arg2[arg1] & 0xFF;
            int var11 = this.field4387[var10];
            byte var12 = this.field4396[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = (var12 + var14 - 1 >> 3) + var13;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var8 = class138.method960(var16, var11 >>> var17));
            if (var13 < var15) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var8 = var11 >>> var14);
                if (var15 > var13) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var15) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var8 = var11 >>> var14);
                        if (var15 > var13) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg4;
    }
}
