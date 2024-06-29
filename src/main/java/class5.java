import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class5 extends class748 {

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    private int field24 = 0;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    private int field22 = 4;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "I")
    private int field33 = 204;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    private int field31 = 1024;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "I")
    private int field28 = 8;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "I")
    private int field36 = 81;

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "I")
    private int field43 = 1024;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
    private int field40 = 409;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "[I")
    public static int[] field27 = new int[2];

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "B")
    public static byte field37;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "[I")
    private int[] field29;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "[[I")
    private int[][] field30;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "[[I")
    private int[][] field34;

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "[[[S")
    public static short[][][] field44;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILhg;I)V", line = 7)
    public static final void method19(int arg0, class584 arg1, int arg2) {
        if (arg0 != -1430) {
            field27 = null;
        }
        ++field35;
        int var3 = -1;
        int var4 = 0;
        if (class245.field3409 < arg1.field8388) {
            class42.method288(arg1, (byte) -85);
        } else if (~arg1.field8402 > ~class245.field3409) {
            class749.method4164(-20, arg1, false);
            var4 = class118.field1642;
            var3 = class749.field10431;
        } else {
            class542.method3225(arg1, (byte) -104);
        }
        if (arg1.field9490 < 512 || arg1.field9489 < 512 || ~arg1.field9490 <= ~(class514.field7179 * 512 + -512) || arg1.field9489 >= class456.field6281 * 512 + -512) {
            var3 = -1;
            arg1.field8317 = -1;
            arg1.field8393 = -1;
            arg1.field8402 = 0;
            arg1.field8348 = null;
            arg1.field8388 = 0;
            var4 = 0;
            arg1.field8313 = -1;
            arg1.field9490 = arg1.field8421[0] * 512 - -(arg1.method3470(-1) * 256);
            arg1.field9489 = arg1.field8414[0] * 512 - -(arg1.method3470(-1) * 256);
            arg1.method3476(false);
        }
        if (class473.field6483 == arg1 && (~arg1.field9490 > -6145 || ~arg1.field9489 > -6145 || class514.field7179 * 512 + -6144 <= arg1.field9490 || arg1.field9489 >= class456.field6281 * 512 + -6144)) {
            arg1.field8393 = -1;
            arg1.field8317 = -1;
            arg1.field8402 = 0;
            var4 = 0;
            arg1.field8313 = -1;
            var3 = -1;
            arg1.field8348 = null;
            arg1.field8388 = 0;
            arg1.field9490 = arg1.field8421[0] * 512 + arg1.method3470(-1) * 256;
            arg1.field9489 = arg1.field8414[0] * 512 - -(256 * arg1.method3470(-1));
            arg1.method3476(false);
        }
        int var5 = class641.method3722((byte) 120, arg1);
        class614.method3598(arg1, 0);
        class389.method2363(var5, arg0 + 1306, var4, arg1, var3);
        class423.method2580((byte) -110, arg1, var3);
        class223.method1454((byte) 78, arg1);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZLvj;)V", line = 83)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (arg1) {
            this.field29 = null;
        }
        ++field45;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field43 = arg2.method193(2);
                                    }
                                } else {
                                    this.field36 = arg2.method193(2);
                                }
                            } else {
                                this.field24 = arg2.method193(2);
                            }
                        } else {
                            this.field31 = arg2.method193(2);
                        }
                    } else {
                        this.field33 = arg2.method193(2);
                    }
                } else {
                    this.field40 = arg2.method193(2);
                }
            } else {
                this.field28 = arg2.method194((byte) 119);
            }
        } else {
            this.field22 = arg2.method194((byte) 119);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIILep;IIZ[I)Ldd;", line = 169)
    public static final class146 method21(int arg0, int arg1, int arg2, class371 arg3, int arg4, int arg5, boolean arg6, int[] arg7) {
        if (arg2 != 3553) {
            method22();
        }
        ++field25;
        if (!arg3.field4991 && (!class447.method2664(0, arg5) || !class447.method2664(arg2 + -3553, arg4))) {
            return !arg3.field5001 ? new class146(arg3, arg5, arg4, class670.method3834(arg5, 23538), class670.method3834(arg4, 23538), arg7) : new class146(arg3, 34037, arg5, arg4, arg6, arg7, arg0, arg1);
        } else {
            return new class146(arg3, 3553, arg5, arg4, arg6, arg7, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 420)
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()V", line = 201)
    public static final void method22() {
        for (int var0 = 0; var0 < class354.field4557; ++var0) {
            class743 var1 = class707.field9873[var0];
            class374.method2256(var1, true);
            class707.field9873[var0] = null;
        }
        class354.field4557 = 0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 225)
    public final void method23(byte arg0) {
        if (arg0 != 67) {
            method19(5, (class584) null, 87);
        }
        this.method26((byte) -124);
        ++field39;
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V", line = 237)
    public static void method24(int arg0) {
        field27 = null;
        field44 = null;
        if (arg0 != 6668) {
            method27(101, true);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I", line = 253)
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            ++field41;
            int[] var3 = super.field10407.method3873(0, arg0);
            if (super.field10407.field9527) {
                int var4 = 0;
                int var5;
                for (var5 = class370.field4727[arg0] + this.field24; ~var5 > -1; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (this.field28 > var4 && ~var5 <= ~this.field29[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(var4 & 1) == -1;
                int var8 = this.field29[var4];
                int var9 = this.field29[var4 + -1];
                if (var5 > this.field23 + var9 && ~(-this.field23 + var8) < ~var5) {
                    for (int var10 = 0; var10 < class424.field5889; ++var10) {
                        int var11 = 0;
                        int var12 = var7 ? this.field31 : -this.field31;
                        int var13;
                        for (var13 = (this.field26 * var12 >> 12) + class237.field3298[var10]; ~var13 > -1; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (var11 < this.field22 && this.field30[var6][var11] <= var13) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field30[var6][var11];
                        int var16 = this.field30[var6][var14];
                        if (~(this.field23 + var16) > ~var13 && -this.field23 + var15 > var13) {
                            var3[var10] = this.field34[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class34.method240(var3, 0, class424.field5889, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V", line = 353)
    private final void method26(byte arg0) {
        ++field32;
        Random var2 = new Random((long) this.field28);
        this.field23 = this.field36 / 2;
        if (arg0 > -122) {
            this.method25(-72, -90);
        }
        this.field26 = 4096 / this.field22;
        this.field38 = 4096 / this.field28;
        int var3 = this.field26 / 2;
        this.field29 = new int[this.field28 + 1];
        this.field30 = new int[this.field28][this.field22 + 1];
        this.field34 = new int[this.field28][this.field22];
        int var4 = this.field38 / 2;
        this.field29[0] = 0;
        for (int var5 = 0; var5 < this.field28; ++var5) {
            if (var5 > 0) {
                int var6 = this.field38;
                int var7 = (class99.method676(4096, var2, -120) - 2048) * this.field33 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field29[var5] = this.field29[var5 + -1] + var8;
            }
            this.field30[var5][0] = 0;
            for (int var9 = 0; var9 < this.field22; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field26;
                    int var11 = (-2048 + class99.method676(4096, var2, -52)) * this.field40 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field30[var5][var9] = this.field30[var5][var9 + -1] + var12;
                }
                this.field34[var5][var9] = this.field43 <= 0 ? 4096 : 4096 - class99.method676(this.field43, var2, -98);
            }
            this.field30[var5][this.field22] = 4096;
        }
        this.field29[this.field28] = 4096;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V", line = 424)
    public static final void method27(int arg0, boolean arg1) {
        ++field21;
        class282.method1685((byte) -90);
        if (arg1) {
            method21(29, 64, -38, (class371) null, 94, -107, true, (int[]) null);
        }
        int var2 = class410.field5694.method3706(110, arg0).field751;
        if (var2 != 0) {
            int var3 = class554.field7826.field10302[arg0];
            if (~var2 == -7) {
                class577.field8261 = var3;
            }
            if (~var2 == -6) {
                class536.field7507 = var3;
            }
        }
    }
}
