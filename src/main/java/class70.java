import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class70 {

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lqp;")
    private class396 field785 = new class396();

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lro;")
    private class1 field793 = new class1();

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    private int field795;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    private int field791;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lcs;")
    private class189 field796;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field784 = -1;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field783 = 0;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lep;")
    public static class241 field797;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lra;")
    public static class57 field790;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[I")
    public static int[] field786;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([[BI[[B[B[I[III)I")
    public static final int method409(byte[][] arg0, int arg1, byte[][] arg2, byte[] arg3, int[] arg4, int[] arg5, int arg6, int arg7) {
        field792++;
        int var8 = arg4[arg7];
        int var9 = 14 % ((arg6 - 57) / 60);
        int var10 = var8 + arg5[arg7];
        int var11 = arg4[arg1];
        int var12 = var11 + arg5[arg1];
        int var13 = var8;
        if (var8 < var11) {
            var13 = var11;
        }
        int var14 = var10;
        if (var12 < var10) {
            var14 = var12;
        }
        int var15 = arg3[arg7] & 0xFF;
        if ((arg3[arg1] & 0xFF) < var15) {
            var15 = arg3[arg1] & 0xFF;
        }
        byte[] var16 = arg0[arg7];
        byte[] var17 = arg2[arg1];
        int var18 = var13 - var8;
        int var19 = var13 - var11;
        for (int var20 = var13; var20 < var14; var20++) {
            int var21 = var16[var18++] + var17[var19++];
            if (var15 > var21) {
                var15 = var21;
            }
        }
        return -var15;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BJ)Lqp;")
    public final class396 method410(byte arg0, long arg1) {
        field787++;
        class396 var4 = (class396) this.field796.method1204((byte) -65, arg1);
        if (var4 != null) {
            this.field793.method6(-106, var4);
        }
        return arg0 >= -2 ? null : var4;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIJ)V")
    public static final void method411(int arg0, String arg1, String arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        field799++;
        if (class81.field903 || class433.field6324 >= 500) {
            return;
        }
        if (arg4 != 0) {
            field783 = -92;
        }
        int var9 = arg3 == -1 ? class410.field5936 : arg3;
        class159 var10 = new class159(arg1, arg2, var9, arg0, arg7, arg5, arg6);
        class32.field301.method1125(~arg4, var10);
        class433.field6324++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIILdl;IIIIZ[II[I)I")
    public static final int method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int[] arg12, int arg13, int[] arg14) {
        field788++;
        if (arg1 > -44) {
            method413(-76);
        }
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class237.field3232[var15][var35] = 0;
                class119.field1540[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg2 == 1) {
            var16 = class217.method1424(arg9, arg5, arg13, arg8, -1056, arg6, arg0, arg7, arg10, arg4, arg3);
        } else if (arg2 == 2) {
            var16 = class152.method915(arg7, arg13, arg6, 1, arg3, arg8, arg10, arg9, arg4, arg5, arg0);
        } else {
            var16 = class262.method1677(arg5, arg0, arg3, arg4, arg13, arg8, 0, arg10, arg7, arg2, arg6, arg9);
        }
        int var17 = arg7 - 64;
        int var18 = arg13 - 64;
        int var19 = class297.field4243;
        int var20 = class356.field5222;
        if (!var16) {
            if (!arg11) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg8 - var23; var24 <= arg8 + var23; var24++) {
                for (int var25 = arg10 - var23; var25 <= arg10 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class119.field1540[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg8 > var24) {
                            var28 = arg8 - var24;
                        } else if (var24 > arg3 + arg8 - 1) {
                            var28 = var24 + 1 - (arg3 + arg8);
                        }
                        int var29 = 0;
                        if (var25 < arg10) {
                            var29 = arg10 - var25;
                        } else if ((arg5 + arg10 - 1) < var25) {
                            var29 = var25 + 1 - arg10 - arg5;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class119.field1540[var26][var27]) {
                            var22 = class119.field1540[var26][var27];
                            var21 = var30;
                            var20 = var25;
                            var19 = var24;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg7 == var19 && arg13 == var20) {
            return 0;
        }
        byte var31 = 0;
        class112.field1293[var31] = var19;
        int var37 = var31 + 1;
        class366.field5353[var31] = var20;
        int var32;
        int var33 = var32 = class237.field3232[var19 - var17][var20 - var18];
        while (arg7 != var19 || arg13 != var20) {
            if (var32 != var33) {
                class112.field1293[var37] = var19;
                var32 = var33;
                class366.field5353[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class237.field3232[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg12[var34] = class112.field1293[var37];
            arg14[var34++] = class366.field5353[var37];
            if (arg12.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method413(int arg0) {
        field786 = null;
        if (arg0 < 30) {
            field784 = 80;
        }
        field797 = null;
        field790 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lqp;BJ)V")
    public final void method414(class396 arg0, byte arg1, long arg2) {
        if (arg1 != 66) {
            field783 = 41;
        }
        field794++;
        if (this.field791 == 0) {
            class396 var5 = this.field793.method9(arg1 ^ 0xFFFFE67E);
            var5.method2290((byte) 98);
            var5.method2519(-2107);
            if (this.field785 == var5) {
                class396 var6 = this.field793.method9(-6596);
                var6.method2290((byte) 98);
                var6.method2519(-2107);
            }
        } else {
            this.field791--;
        }
        this.field796.method1202(-1, arg2, arg0);
        this.field793.method6(-67, arg0);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V")
    public class70(int arg0) {
        this.field795 = arg0;
        this.field791 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field796 = new class189(var2);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public final void method415(byte arg0) {
        this.field793.method1((byte) 105);
        field789++;
        this.field796.method1206(90);
        if (arg0 < -48) {
            this.field785 = new class396();
            this.field791 = this.field795;
        }
    }
}
