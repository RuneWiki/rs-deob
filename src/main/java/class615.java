import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class615 {

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    private int field8578 = -1;

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "Z")
    public boolean field8589 = true;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "Lhea;")
    private class387 field8582;

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "Lwp;")
    private class163 field8587;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    private int field8580;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    private int field8586;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "Loi;")
    private class65 field8581;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    public int field8591;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    private int field8584;

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "I")
    private int field8588;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "Lrn;")
    private class241 field8585;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "F")
    public static float field8583;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
    private final void method3420(int arg0) {
        field8579++;
        if (!this.field8589) {
            return;
        }
        this.field8589 = false;
        byte[] var2 = this.field8587.field2334;
        int var3 = 0;
        int var4 = this.field8587.field2336;
        int var5 = this.field8587.field2336 * this.field8586 + this.field8580;
        if (arg0 < 78) {
            this.field8591 = -110;
        }
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field8581 != null && this.field8578 == var3) {
            this.field8589 = false;
            return;
        }
        this.field8578 = var3;
        int var7 = this.field8586 * var4 + this.field8580;
        int var8 = 0;
        if (!this.field8582.method1895(class218.field3050, true, class87.field1467)) {
            if (class86.field1408 == null) {
                class86.field1408 = new int[16384];
            }
            int[] var9 = class86.field1408;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var7] == 0) {
                        int var12 = 0;
                        if (var2[var7 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field8587.field2336 - 128;
            }
            if (this.field8581 == null) {
                this.field8581 = this.field8582.method2363(128, 0, false, class86.field1408, 128);
                this.field8581.method663((byte) -102, false, false);
            } else {
                this.field8581.method667(128, (byte) -64, 0, 0, 128, class86.field1408, 0, 128);
            }
            return;
        }
        if (class119.field1802 == null) {
            class119.field1802 = new byte[16384];
        }
        byte[] var13 = class119.field1802;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var7] == 0) {
                    int var16 = 0;
                    if (var2[var7 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var16++;
                    }
                    var13[var8++] = (byte) (var16 * 17);
                } else {
                    var13[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field8587.field2336 - 128;
        }
        if (this.field8581 == null) {
            this.field8581 = this.field8582.method2330(false, class87.field1467, 0, 128, class119.field1802, 128);
            this.field8581.method663((byte) -102, false, false);
        } else {
            this.field8581.method664(class87.field1467, 128, 128, true, 0, 0, 0, 128, class119.field1802);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIZ[ILcp;IZIIII[II)I")
    public static final int method3421(int arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, class674 arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class178.field2537[var15][var35] = 0;
                class226.field3183[var15][var35] = 99999999;
            }
        }
        field8593++;
        boolean var16;
        if (arg14 == 1) {
            var16 = class576.method3264(arg10, arg7, arg2, arg11, arg0, arg12, arg9, arg1, arg6, arg3, -1);
        } else if (arg14 == 2) {
            var16 = class191.method1287(arg1, arg11, 118, arg2, arg9, arg3, arg12, arg6, arg10, arg0, arg7);
        } else {
            var16 = class674.method3741(arg12, arg7, arg3, arg11, arg9, false, arg14, arg1, arg10, arg6, arg0, arg2);
        }
        if (arg4) {
            field8583 = 0.037963353F;
        }
        int var17 = arg0 - 64;
        int var18 = arg3 - 64;
        int var19 = class107.field1645;
        int var20 = class218.field3056;
        if (!var16) {
            if (!arg8) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg9 - var23; var24 <= (arg9 + var23); var24++) {
                for (int var25 = arg7 - var23; var25 <= arg7 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class226.field3183[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg9) {
                            var28 = arg9 - var24;
                        } else if ((arg9 + arg2 - 1) < var24) {
                            var28 = -arg9 - arg2 - (-1 - var24);
                        }
                        int var29 = 0;
                        if (arg7 > var25) {
                            var29 = arg7 - var25;
                        } else if ((arg7 + arg10 - 1) < var25) {
                            var29 = var25 + 1 - arg7 - arg10;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class226.field3183[var26][var27]) {
                            var20 = var25;
                            var19 = var24;
                            var22 = class226.field3183[var26][var27];
                            var21 = var30;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var19 && arg3 == var20) {
            return 0;
        }
        byte var31 = 0;
        class184.field2588[var31] = var19;
        int var37 = var31 + 1;
        class416.field6035[var31] = var20;
        int var32;
        int var33 = var32 = class178.field2537[var19 - var17][var20 - var18];
        while (arg0 != var19 || arg3 != var20) {
            if (var32 != var33) {
                class184.field2588[var37] = var19;
                var32 = var33;
                class416.field6035[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class178.field2537[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg13[var34] = class184.field2588[var37];
            arg5[var34++] = class416.field6035[var37];
            if (arg13.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V")
    public final void method3422(byte arg0) {
        if (arg0 <= 78) {
            this.field8589 = true;
        }
        field8590++;
        this.method3423(this.field8585, (byte) -116, this.field8591);
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lrn;BI)V")
    public final void method3423(class241 arg0, byte arg1, int arg2) {
        field8592++;
        int var4 = 30 / ((-arg1 - 25) / 53);
        if (arg2 > 0) {
            this.method3420(85);
            this.field8582.method2337(false, this.field8581);
            this.field8582.method1874(class80.field1355, arg2, this.field8588, true, arg0, this.field8584 + 1 - this.field8588, 0);
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lhea;Lwp;Lni;IIIII)V")
    public class615(class387 arg0, class163 arg1, class481 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8582 = arg0;
        this.field8587 = arg1;
        this.field8580 = arg6;
        this.field8586 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field631 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field6842[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field8581 = null;
            this.field8591 = 0;
        } else {
            this.field8584 = Integer.MIN_VALUE;
            this.field8588 = Integer.MAX_VALUE;
            this.field8585 = this.field8582.method1863((byte) 101, false);
            this.field8585.method1(116, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field8585.method5(true, 114);
                if (var15 != null) {
                    Stream var16 = this.field8582.method2381(0, var15);
                    if (Stream.method3483()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field631 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field6842[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field8584 < var22) {
                                            this.field8584 = var22;
                                        }
                                        if (var22 < this.field8588) {
                                            this.field8588 = var22;
                                        }
                                        var16.method3475(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field631 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field6842[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field8584 < var28) {
                                            this.field8584 = var28;
                                        }
                                        if (var28 < this.field8588) {
                                            this.field8588 = var28;
                                        }
                                        var16.method3472(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3471();
                    if (this.field8585.method2(-60)) {
                        break;
                    }
                }
            }
            this.field8591 = var10 / 3;
        }
    }
}
