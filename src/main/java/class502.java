import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class502 extends class440 {

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    private int field7095 = 0;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    private int field7096 = 1;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "[B")
    private byte[] field7101 = new byte[512];

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    private int field7097 = 2048;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "[S")
    private short[] field7102 = new short[512];

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    private int field7098 = 2;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    private int field7104 = 5;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    private int field7106 = 5;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "Llca;")
    public static class597 field7105 = new class597(3);

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lnea;")
    public static class664 field7108 = new class664(86, 8);

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "Lhga;")
    public static class157 field7109 = new class157(16);

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "Lkda;")
    public static class353 field7110 = new class353();

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "Lkea;")
    public static class213 field7111 = new class213(16);

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "[I")
    public static int[] field7112 = new int[8];

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 3)
    public final void method230(int arg0) {
        this.field7101 = class605.method3403(arg0 ^ -248, this.field7095);
        if (arg0 != -9) {
            this.method230(-59);
        }
        ++field7094;
        this.method2895(-12232);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 16)
    public static void method2893(byte arg0) {
        field7111 = null;
        field7110 = null;
        field7109 = null;
        field7108 = null;
        field7112 = null;
        if (arg0 < 67) {
            method2894((int[]) null, -105, 49, 29, -90, -126, 45, 117);
        }
        field7105 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIIIIIII)Z", line = 31)
    public static final boolean method2894(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~class235.field3639 > ~arg3) {
            arg3 = class235.field3639;
        }
        ++field7099;
        if (arg5 < 0) {
            arg5 = 0;
        }
        if (arg3 <= arg5) {
            return true;
        } else {
            int var8 = arg5 * arg6 + arg2;
            int var9 = arg5 + -1 + arg1;
            int var10 = -arg5 + arg3 >> 2;
            int var10000;
            if (~class498.field7067 == -2) {
                class416.field6031 += var10;
                label86: while (true) {
                    --var10;
                    if (~var10 > -1) {
                        int var11 = -arg5 + arg3 & 3;
                        while (true) {
                            --var11;
                            if (~var11 > -1) {
                                break label86;
                            }
                            ++var9;
                            if (~arg0[var9] < ~var8) {
                                arg0[var9] = var8;
                            }
                            var8 += arg6;
                        }
                    }
                    var10000 = ~var8;
                    ++var9;
                    if (var10000 > ~arg0[var9]) {
                        arg0[var9] = var8;
                    }
                    int var12 = arg6 + var8;
                    ++var9;
                    if (arg0[var9] > var12) {
                        arg0[var9] = var12;
                    }
                    int var13 = arg6 + var12;
                    ++var9;
                    if (var13 < arg0[var9]) {
                        arg0[var9] = var13;
                    }
                    int var14 = arg6 + var13;
                    ++var9;
                    if (var14 < arg0[var9]) {
                        arg0[var9] = var14;
                    }
                    var8 = arg6 + var14;
                }
            } else {
                var8 -= 15360;
                label75: while (true) {
                    --var10;
                    if (~var10 > -1) {
                        int var15 = 3 & -arg5 + arg3;
                        while (true) {
                            --var15;
                            if (~var15 > -1) {
                                break label75;
                            }
                            ++var9;
                            if (var8 < arg0[var9]) {
                                return false;
                            }
                            var8 += arg6;
                        }
                    }
                    ++var9;
                    if (arg0[var9] > var8) {
                        return false;
                    }
                    int var17 = arg6 + var8;
                    ++var9;
                    if (arg0[var9] > var17) {
                        return false;
                    }
                    int var18 = arg6 + var17;
                    var10000 = ~var18;
                    ++var9;
                    if (var10000 > ~arg0[var9]) {
                        return false;
                    }
                    int var19 = arg6 + var18;
                    var10000 = ~var19;
                    ++var9;
                    if (var10000 > ~arg0[var9]) {
                        return false;
                    }
                    var8 = arg6 + var19;
                }
            }
            int var16 = 63 / ((-34 - arg7) / 38);
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[I", line = 127)
    public final int[] method229(byte arg0, int arg1) {
        ++field7100;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int var4 = class418.field6099[arg1] * this.field7104 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class549.field7715; ++var7) {
                class506.field7162 = Integer.MAX_VALUE;
                class602.field8509 = Integer.MAX_VALUE;
                class293.field4319 = Integer.MAX_VALUE;
                class204.field2887 = Integer.MAX_VALUE;
                int var8 = class499.field7073[var7] * this.field7106 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field7101[(var11 >= this.field7104 ? var11 - this.field7104 : var11) & 255];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (this.field7101[var13 + (var14 >= this.field7106 ? -this.field7106 + var14 : var14) & 255] & 255);
                        int var28 = var15 + 1;
                        int var16 = -this.field7102[var15] - ((var14 << 12) - var8);
                        int var17 = var4 - ((var11 << 12) + this.field7102[var28]);
                        int var18 = this.field7096;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var16 < 0 ? -var16 : var16) + (var17 < 0 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = ~var25 >= ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (~class204.field2887 >= ~var19) {
                            if (~class293.field4319 >= ~var19) {
                                if (~var19 <= ~class602.field8509) {
                                    if (~var19 > ~class506.field7162) {
                                        class506.field7162 = var19;
                                    }
                                } else {
                                    class506.field7162 = class602.field8509;
                                    class602.field8509 = var19;
                                }
                            } else {
                                class506.field7162 = class602.field8509;
                                class602.field8509 = class293.field4319;
                                class293.field4319 = var19;
                            }
                        } else {
                            class506.field7162 = class602.field8509;
                            class602.field8509 = class293.field4319;
                            class293.field4319 = class204.field2887;
                            class204.field2887 = var19;
                        }
                    }
                }
                int var12 = this.field7098;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = class293.field4319 - class204.field2887;
                                }
                            } else {
                                var3[var7] = class506.field7162;
                            }
                        } else {
                            var3[var7] = class602.field8509;
                        }
                    } else {
                        var3[var7] = class293.field4319;
                    }
                } else {
                    var3[var7] = class204.field2887;
                }
            }
        }
        int var27 = 102 / ((-56 - arg0) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 377)
    public class502() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V", line = 344)
    private final void method2895(int arg0) {
        ++field7107;
        if (arg0 != -12232) {
            this.field7097 = -18;
        }
        Random var2 = new Random((long) this.field7095);
        this.field7102 = new short[512];
        if (this.field7097 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field7102[var3] = (short) class311.method1976(-1, this.field7097, var2);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILmo;I)V", line = 396)
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field7103;
        if (arg0 != 5) {
            this.method229((byte) 69, 67);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field7104 = arg1.method3826(false);
                                }
                            } else {
                                this.field7106 = arg1.method3826(false);
                            }
                        } else {
                            this.field7096 = arg1.method3826(false);
                        }
                    } else {
                        this.field7098 = arg1.method3826(false);
                    }
                } else {
                    this.field7097 = arg1.method3847((byte) 118);
                }
            } else {
                this.field7095 = arg1.method3826(false);
            }
        } else {
            this.field7106 = this.field7104 = arg1.method3826(false);
        }
    }
}
