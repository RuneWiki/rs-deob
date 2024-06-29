import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class411 extends class601 {

    @OriginalMember(owner = "client!we", name = "I", descriptor = "[S")
    private short[] field5700 = new short[257];

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    private int field5705 = 0;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "Lhda;")
    public static class752 field5698 = new class752(117, -2);

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "Lhda;")
    public static class752 field5708 = new class752(63, 3);

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "Lkk;")
    public static class192 field5709;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "Lup;")
    public static class278 field5711;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "Ljava/lang/Object;")
    public static Object field5710;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "[I")
    private int[] field5699;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "[I")
    private int[] field5707;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "[[I")
    private int[][] field5695;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 3)
    public class411() {
        super(1, true);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[I", line = 6)
    private final int[] method2396(int arg0, int arg1) {
        if (arg1 > -68) {
            this.method6((class677) null, (byte) 28, 48);
        }
        ++field5706;
        if (arg0 < 0) {
            return this.field5707;
        } else {
            return ~arg0 <= ~this.field5695.length ? this.field5699 : this.field5695[arg0];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)[I", line = 24)
    public final int[] method5(byte arg0, int arg1) {
        ++field5697;
        if (arg0 != -40) {
            field5708 = null;
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int[] var4 = this.method3266((byte) 64, arg1, 0);
            for (int var5 = 0; class171.field2624 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field5700[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 67)
    public final void method108(int arg0) {
        if (this.field5695 == null) {
            this.field5695 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field5702;
        if (~this.field5695.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field5705 == 2) {
                this.method2397(true);
            }
            class564.method3118(true);
            if (arg0 != 8351) {
                this.field5700 = null;
            }
            this.method2398((byte) 41);
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(Z)V", line = 92)
    private final void method2397(boolean arg0) {
        ++field5701;
        int[] var2 = this.field5695[0];
        int[] var3 = this.field5695[1];
        if (!arg0) {
            this.method2398((byte) -21);
        }
        int[] var4 = this.field5695[this.field5695.length + -2];
        int[] var5 = this.field5695[this.field5695.length - 1];
        this.field5699 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + var4[1] - var5[1] };
        this.field5707 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (var3[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 112)
    private final void method2398(byte arg0) {
        if (arg0 > 0) {
            int var2 = this.field5705;
            if (var2 != 2) {
                if (~var2 == -2) {
                    for (int var3 = 0; ~var3 > -258; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; this.field5695.length + -1 > var5 && ~this.field5695[var5][0] >= ~var4; ++var5) {
                        }
                        int[] var6 = this.field5695[var5 - 1];
                        int[] var7 = this.field5695[var5];
                        int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                        int var9 = 4096 - class379.field5284[var8 >> 5 & 255] >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (~var11 >= 32767) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field5700[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; ~var12 > -258; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; ~(this.field5695.length + -1) < ~var14 && ~this.field5695[var14][0] >= ~var13; ++var14) {
                        }
                        int[] var15 = this.field5695[var14 + -1];
                        int[] var16 = this.field5695[var14];
                        int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                        if (var19 <= -32768) {
                            var19 = -32767;
                        }
                        if (var19 >= 32768) {
                            var19 = 32767;
                        }
                        this.field5700[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; var20 < 257; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; var22 < this.field5695.length + -1 && this.field5695[var22][0] <= var21; ++var22) {
                    }
                    int[] var23 = this.field5695[var22 + -1];
                    int[] var24 = this.field5695[var22];
                    int var25 = this.method2396(var22 - 2, -89)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method2396(var22 - -1, -97)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var25 + var28 - var27 + var26;
                    int var32 = -var26 + var25 + -var31;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var26 + var37 + var35 + var36;
                    if (var38 <= -32768) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field5700[var20] = (short) var38;
                }
            }
            ++field5704;
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(Z)V", line = 298)
    public static void method2399(boolean arg0) {
        field5711 = null;
        field5710 = null;
        field5709 = null;
        field5708 = null;
        field5698 = null;
        if (!arg0) {
            field5711 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V", line = 324)
    public static final void method2400(boolean arg0, int arg1) {
        class675.method3762(32280, class443.field6101, class228.field3251, class199.field2993, arg0);
        if (arg1 >= -32) {
            method2399(false);
        }
        ++field5696;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lee;BI)V", line = 340)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field5705 = arg0.method3821((byte) -88);
            this.field5695 = new int[arg0.method3821((byte) 70)][2];
            for (int var4 = 0; this.field5695.length > var4; ++var4) {
                this.field5695[var4][0] = arg0.method3807(arg1 + 60);
                this.field5695[var4][1] = arg0.method3807(arg1 + 60);
            }
        }
        if (arg1 != -61) {
            field5709 = null;
        }
        ++field5703;
    }
}
