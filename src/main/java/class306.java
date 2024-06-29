import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class306 {

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "[I")
    private int[] field4348;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "[B")
    private byte[] field4347;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "[I")
    private int[] field4350;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "Lus;")
    public static class1 field4345 = new class1(90, 1);

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "Lus;")
    public static class1 field4354 = new class1(93, 8);

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "Lus;")
    public static class1 field4355 = new class1(84, 8);

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4358 = new String[8];

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "[I")
    public static int[] field4360 = new int[50];

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "Lb;")
    public static class201 field4359;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "Lpc;")
    public static class438 field4363;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "[Ltr;")
    public static class176[] field4362;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([BI[BIII)I")
    public final int method1892(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field4356++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg4 + arg5;
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var7 = this.field4350[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field4350[var7]) < 0) {
                arg2[arg5++] = (byte) (~var11);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field4350[var7];
            }
            int var12;
            if ((var12 = this.field4350[var7]) < 0) {
                arg2[arg5++] = (byte) (~var12);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field4350[var7];
            }
            int var13;
            if ((var13 = this.field4350[var7]) < 0) {
                arg2[arg5++] = (byte) (~var13);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field4350[var7];
            }
            int var14;
            if ((var14 = this.field4350[var7]) < 0) {
                arg2[arg5++] = (byte) (~var14);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field4350[var7];
            }
            int var15;
            if ((var15 = this.field4350[var7]) < 0) {
                arg2[arg5++] = (byte) (~var15);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field4350[var7];
            }
            int var16;
            if ((var16 = this.field4350[var7]) < 0) {
                arg2[arg5++] = (byte) (~var16);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field4350[var7];
            }
            int var17;
            if ((var17 = this.field4350[var7]) < 0) {
                arg2[arg5++] = (byte) (~var17);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field4350[var7];
            }
            int var18;
            if ((var18 = this.field4350[var7]) < 0) {
                arg2[arg5++] = (byte) (~var18);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg1 != 27864) {
            field4357 = -69;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public static void method1893(byte arg0) {
        if (arg0 <= 42) {
            method1895(119, -6, -122, (class364) null, (class364) null);
        }
        field4355 = null;
        field4358 = null;
        field4354 = null;
        field4363 = null;
        field4345 = null;
        field4359 = null;
        field4360 = null;
        field4362 = null;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "([B)V")
    public class306(byte[] arg0) {
        int var2 = arg0.length;
        this.field4348 = new int[var2];
        this.field4347 = arg0;
        int[] var3 = new int[33];
        this.field4350 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4348[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class248.method1549(var12, var11);
                    }
                    var9 = var7 | var8;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field4350[var14] == 0) {
                            this.field4350[var14] = var4;
                        }
                        var14 = this.field4350[var14];
                    }
                    if (this.field4350.length <= var14) {
                        int[] var17 = new int[this.field4350.length * 2];
                        for (int var18 = 0; var18 < this.field4350.length; var18++) {
                            var17[var18] = this.field4350[var18];
                        }
                        this.field4350 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field4350[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIILdt;Lnp;BLsm;)V")
    public static final void method1894(int arg0, int arg1, int arg2, int arg3, int arg4, class145 arg5, class313 arg6, byte arg7, class171 arg8) {
        field4346++;
        class19 var9 = class251.field3705.method490(36, arg4);
        if (var9 != null && var9.field265 && var9.method129((byte) 112, class140.field1859)) {
            if (var9.field235 != null) {
                int[] var10 = new int[var9.field235.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var13;
                    if (class136.field1807 == 4) {
                        var13 = (int) class157.field2346 & 0x3FFF;
                    } else {
                        var13 = (int) class157.field2346 + class84.field1032 & 0x3FFF;
                    }
                    int var14 = class53.field727[var13];
                    int var15 = class53.field726[var13];
                    if (class136.field1807 != 4) {
                        var15 = var15 * 256 / (class216.field3251 + 256);
                        var14 = var14 * 256 / (class216.field3251 + 256);
                    }
                    var10[var11 * 2] = ((var9.field235[var11 * 2 + 1] * 4 + arg3) * var14 + ((var9.field235[var11 * 2] * 4 + arg0) * var15) >> 15) + arg1 + (arg5.field2010 / 2);
                    var10[var11 * 2 + 1] = arg2 - (((var9.field235[var11 * 2 + 1] * 4 + arg3) * var15 - ((arg0 + (var9.field235[var11 * 2] * 4)) * var14) >> 15) - (arg5.field2021 / 2));
                }
                class316.method2023(arg6, var10, var9.field231, arg5.field2043, arg5.field2064);
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    arg6.method676(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 2 + 1], var9.field258, 1, arg8, arg1, arg2);
                }
                arg6.method676(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field258, 1, arg8, arg1, arg2);
            }
            class176 var16 = null;
            if (var9.field227 != -1) {
                var16 = var9.method132(1, false, arg6);
                if (var16 != null) {
                    class55.method343(arg3, var16, arg1, (byte) 92, arg8, arg0, arg2, arg5);
                }
            }
            if (var9.field236 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method521();
                }
                class256 var18 = class453.field6355;
                class135 var19 = class293.field4252;
                if (var9.field250 == 1) {
                    var18 = class92.field1166;
                    var19 = class252.field3717;
                }
                if (var9.field250 == 2) {
                    var18 = class491.field6928;
                    var19 = class37.field488;
                }
                class22.method158(arg3, arg2, var17, var18, 2, arg1, var9.field251, arg0, arg5, arg8, var19, var9.field236);
            }
        }
        if (arg7 != -46) {
            method1894(98, -28, 93, 98, -14, (class145) null, (class313) null, (byte) 121, (class171) null);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILwm;Lwm;)V")
    public static final void method1895(int arg0, int arg1, int arg2, class364 arg3, class364 arg4) {
        class88 var5 = class257.method1605(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field1087 = arg3;
            var5.field1066 = arg4;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)V")
    public static final void method1896(int arg0, byte arg1) {
        if (arg1 == -118) {
            class240.field3604 = arg0;
            field4349++;
            class51.field698.method1478((byte) -86);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII[B[B)I")
    public final int method1897(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        if (arg2 != 1) {
            field4355 = null;
        }
        field4352++;
        int var7 = 0;
        int var8 = arg1 << 3;
        int var9 = arg0 + arg3;
        while (arg3 < var9) {
            int var10 = arg4[arg3] & 0xFF;
            int var11 = this.field4348[var10];
            byte var12 = this.field4347[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class248.method1549(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg3++;
        }
        return (var8 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Loh;ILjava/lang/String;Z)V")
    public static final void method1898(class256 arg0, int arg1, String arg2, boolean arg3) {
        field4353++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class252.field3717.method852((class176[]) null, arg2, 250, arg1 - 921);
        int var8 = class252.field3717.method855(arg2, (class176[]) null, 250, false) * 13;
        class141.field1878.method650(var5 - var4, var6 - var4, var7 + var4 + var4, var4 + var8 + var4, -16777216, 0);
        class141.field1878.method641(var5 - var4, -var4 + var6, var4 + var4 + var7, var8 - -var4 - -var4, -1, 0);
        arg0.method1598(var6, (class171) null, 1, 1, 0, false, -1, 0, -1, (int[]) null, var8, var5, var7, arg2, 0, (class176[]) null);
        class382.method2306(var6 - var4, arg1 ^ arg1, var5 - var4, var7 - (-var4 - var4), var4 + var4 + var8);
        if (arg3) {
            class141.field1878.method622();
        }
    }
}
