import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class50 extends class89 {

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field829 = 0;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "Z")
    public static boolean field833 = false;

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    public static int field837 = 0;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    private int field836;

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V")
    private class50(int arg0) {
        super(0, false);
        this.method315(-4916, arg0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([IIIIII)V")
    public static final void method314(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class3 var6 = class235.field4101[arg3][arg4][arg5];
        if (var6 != null) {
            class147 var7 = var6.field45;
            if (var7 == null) {
                class111 var10 = var6.field44;
                if (var10 != null) {
                    int var11 = var10.field1956;
                    int var12 = var10.field1963;
                    int var13 = var10.field1957;
                    int var14 = var10.field1970;
                    int[] var15 = class160.field2810[var11];
                    int[] var16 = class255.field4498[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field2572;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
    private final void method315(int arg0, int arg1) {
        this.field836 = arg1 >> 4 & 4080;
        ++field830;
        this.field834 = (arg1 & 255) << 4;
        this.field832 = 4080 & arg1 >> 12;
        if (arg0 != -4916) {
            field829 = -38;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field831;
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class65.field1070 < ~var7; ++var7) {
                var4[var7] = this.field832;
                var5[var7] = this.field836;
                var6[var7] = this.field834;
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (~arg2 == -1) {
            this.method315(-4916, arg1.method598(124));
        }
        if (arg0 != -20503) {
            field833 = false;
        }
        ++field827;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBI[Lcg;[BIZ)V")
    public static final void method316(int arg0, int arg1, byte arg2, int arg3, class118[] arg4, byte[] arg5, int arg6, boolean arg7) {
        int var8 = -66 / ((-72 - arg2) / 36);
        ++field828;
        byte var9;
        if (arg7) {
            var9 = 1;
        } else {
            var9 = 4;
        }
        if (!arg7) {
            for (int var10 = 0; ~var10 > -5; ++var10) {
                for (int var11 = 0; var11 < 64; ++var11) {
                    for (int var12 = 0; var12 < 64; ++var12) {
                        if (~(arg0 + var11) < -1 && ~(arg0 - -var11) > -104 && ~(arg3 + var12) < -1 && ~(arg3 + var12) > -104) {
                            arg4[var10].field2094[arg0 + var11][arg3 - -var12] = class19.method98(arg4[var10].field2094[arg0 + var11][arg3 - -var12], -16777217);
                        }
                    }
                }
            }
        }
        class85 var13 = new class85(arg5);
        for (int var14 = 0; var9 > var14; ++var14) {
            for (int var15 = 0; ~var15 > -65; ++var15) {
                for (int var16 = 0; ~var16 > -65; ++var16) {
                    class197.method1286(arg6, arg3 + var16, var13, -58, arg1, arg0 + var15, arg7, var14, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class50() {
        this(0);
    }
}
