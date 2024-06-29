import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class683 extends class751 {

    @OriginalMember(owner = "client!kja", name = "P", descriptor = "I")
    private int field9708 = 0;

    @OriginalMember(owner = "client!kja", name = "B", descriptor = "[S")
    private short[] field9694 = new short[257];

    @OriginalMember(owner = "client!kja", name = "F", descriptor = "I")
    public static int field9698 = 0;

    @OriginalMember(owner = "client!kja", name = "I", descriptor = "[Leo;")
    public static class310[] field9701 = new class310[5];

    @OriginalMember(owner = "client!kja", name = "M", descriptor = "D")
    public static double field9705;

    @OriginalMember(owner = "client!kja", name = "A", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!kja", name = "C", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!kja", name = "D", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!kja", name = "G", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!kja", name = "J", descriptor = "I")
    public static int field9702;

    @OriginalMember(owner = "client!kja", name = "L", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!kja", name = "N", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!kja", name = "O", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!kja", name = "Q", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!kja", name = "E", descriptor = "[I")
    private int[] field9697;

    @OriginalMember(owner = "client!kja", name = "K", descriptor = "[I")
    private int[] field9703;

    @OriginalMember(owner = "client!kja", name = "H", descriptor = "[[I")
    private int[][] field9700;

    static {
        for (int var0 = 0; ~var0 > ~field9701.length; ++var0) {
            field9701[var0] = new class310();
        }
    }

    @OriginalMember(owner = "client!kja", name = "<init>", descriptor = "()V", line = 3)
    public class683() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(Liw;B)I", line = 8)
    public static final int method3857(class331 arg0, byte arg1) {
        ++field9699;
        int var2 = arg0.method2138(2, (byte) -105);
        if (arg1 != -22) {
            return -61;
        } else {
            int var3;
            if (~var2 == -1) {
                var3 = 0;
            } else if (~var2 == -2) {
                var3 = arg0.method2138(5, (byte) -105);
            } else if (var2 == 2) {
                var3 = arg0.method2138(8, (byte) -105);
            } else {
                var3 = arg0.method2138(11, (byte) -105);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(ILrv;I)V", line = 35)
    public final void method309(int arg0, class120 arg1, int arg2) {
        int var4 = 36 / ((arg0 - 25) / 63);
        if (~arg2 == -1) {
            this.field9708 = arg1.method842(2384);
            this.field9700 = new int[arg1.method842(2384)][2];
            for (int var5 = 0; ~this.field9700.length < ~var5; ++var5) {
                this.field9700[var5][0] = arg1.method898((byte) -123);
                this.field9700[var5][1] = arg1.method898((byte) -106);
            }
        }
        ++field9696;
    }

    @OriginalMember(owner = "client!kja", name = "c", descriptor = "(I)V", line = 65)
    public static void method3858(int arg0) {
        field9701 = null;
        if (arg0 != 0) {
            method3857((class331) null, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(Z)V", line = 76)
    private final void method3859(boolean arg0) {
        int var2 = this.field9708;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field9700.length - 1) < ~var5 && this.field9700[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field9700[var5 + -1];
                    int[] var7 = this.field9700[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class300.field4511[(8183 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field9694[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field9700.length + -1) && var13 >= this.field9700[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field9700[var14 + -1];
                    int[] var16 = this.field9700[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field9694[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field9700.length + -1 && ~var21 <= ~this.field9700[var22][0]; ++var22) {
                }
                int[] var23 = this.field9700[var22 + -1];
                int[] var24 = this.field9700[var22];
                int var25 = this.method3861(var22 - 2, 10268)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3861(var22 + 1, 10268)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var27 + var26 + -var25;
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - -var37 + var36 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field9694[var20] = (short) var38;
            }
        }
        ++field9702;
        if (!arg0) {
            method3858(106);
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(II)[I", line = 255)
    public final int[] method365(int arg0, int arg1) {
        if (arg1 != 4095) {
            this.field9703 = null;
        }
        ++field9707;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int[] var4 = this.method4173(arg0, (byte) -114, 0);
            for (int var5 = 0; var5 < class673.field9452; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field9694[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kja", name = "e", descriptor = "(B)V", line = 298)
    private final void method3860(byte arg0) {
        if (arg0 <= 118) {
            this.method3859(false);
        }
        ++field9693;
        int[] var2 = this.field9700[0];
        int[] var3 = this.field9700[1];
        int[] var4 = this.field9700[this.field9700.length - 2];
        int[] var5 = this.field9700[this.field9700.length + -1];
        this.field9703 = new int[] { var2[0] + var2[0] + -var3[0], var2[1] + var2[1] - var3[1] };
        this.field9697 = new int[] { var4[0] - (var5[0] + -var4[0]), var4[1] - (var5[1] + -var4[1]) };
    }

    @OriginalMember(owner = "client!kja", name = "b", descriptor = "(II)[I", line = 320)
    private final int[] method3861(int arg0, int arg1) {
        if (arg1 != 10268) {
            return null;
        } else {
            ++field9704;
            if (~arg0 > -1) {
                return this.field9703;
            } else {
                return ~arg0 <= ~this.field9700.length ? this.field9697 : this.field9700[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(B)V", line = 338)
    public final void method1454(byte arg0) {
        if (arg0 <= 123) {
            this.field9700 = null;
        }
        ++field9695;
        if (this.field9700 == null) {
            this.field9700 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field9700.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field9708 == 2) {
                this.method3860((byte) 125);
            }
            class55.method355((byte) -39);
            this.method3859(true);
        }
    }
}
