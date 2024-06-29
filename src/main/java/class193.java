import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class193 extends class667 {

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    private int field2767 = 8;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    private int field2773 = 409;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    private int field2769 = 1024;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    private int field2764 = 4;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    private int field2763 = 81;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    private int field2768 = 204;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
    private int field2777 = 1024;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    private int field2771 = 0;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Lnga;")
    public static class510 field2760 = new class510(4);

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "Lpu;")
    public static class559 field2780 = new class559(12, 8);

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "[I")
    public static int[] field2783 = new int[14];

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    private int field2766;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    private int field2770;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    private int field2776;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "Lth;")
    public static class593 field2782;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "[I")
    private int[] field2779;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "[[I")
    private int[][] field2761;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "[[I")
    private int[][] field2774;

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 6)
    public class193() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)Z", line = 12)
    public static final boolean method1350(byte arg0) {
        ++field2781;
        class69 var1 = (class69) class406.field5655.method1522(true);
        if (var1 == null) {
            return false;
        } else {
            for (int var2 = 0; ~var1.field1240 < ~var2; ++var2) {
                if (var1.field1235[var2] != null && var1.field1235[var2].field9091 == 0) {
                    return false;
                }
                if (var1.field1242[var2] != null && ~var1.field1242[var2].field9091 == -1) {
                    return false;
                }
            }
            if (arg0 <= 17) {
                field2760 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZII)V", line = 66)
    public static final void method1351(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            class435.field6078 = new byte[arg0][arg3][arg2];
            ++field2775;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)V", line = 78)
    public final void method121(boolean arg0) {
        ++field2762;
        if (arg0) {
            this.field2773 = -105;
        }
        this.method1352((byte) -28);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lud;II)V", line = 92)
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (arg2 == 7) {
                                        this.field2769 = arg0.method253(-13900);
                                    }
                                } else {
                                    this.field2763 = arg0.method253(-13900);
                                }
                            } else {
                                this.field2771 = arg0.method253(arg1 ^ -13897);
                            }
                        } else {
                            this.field2777 = arg0.method253(-13900);
                        }
                    } else {
                        this.field2768 = arg0.method253(-13900);
                    }
                } else {
                    this.field2773 = arg0.method253(arg1 + -13903);
                }
            } else {
                this.field2767 = arg0.method273(arg1 ^ 252);
            }
        } else {
            this.field2764 = arg0.method273(255);
        }
        if (arg1 == 3) {
            ++field2772;
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V", line = 188)
    private final void method1352(byte arg0) {
        ++field2765;
        Random var2 = new Random((long) this.field2767);
        this.field2776 = 4096 / this.field2764;
        this.field2766 = this.field2763 / 2;
        this.field2770 = 4096 / this.field2767;
        int var3 = this.field2776 / 2;
        this.field2774 = new int[this.field2767][this.field2764];
        if (arg0 != -28) {
            this.method117((byte) -111, 0);
        }
        this.field2761 = new int[this.field2767][this.field2764 - -1];
        int var4 = this.field2770 / 2;
        this.field2779 = new int[this.field2767 + 1];
        this.field2779[0] = 0;
        for (int var5 = 0; var5 < this.field2767; ++var5) {
            if (var5 > 0) {
                int var6 = this.field2770;
                int var7 = (-2048 + class459.method2800(var2, 4096, (byte) -100)) * this.field2768 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2779[var5] = this.field2779[var5 + -1] + var8;
            }
            this.field2761[var5][0] = 0;
            for (int var9 = 0; ~this.field2764 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field2776;
                    int var11 = (class459.method2800(var2, 4096, (byte) -111) + -2048) * this.field2773 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2761[var5][var9] = this.field2761[var5][var9 + -1] + var12;
                }
                this.field2774[var5][var9] = this.field2769 > 0 ? -class459.method2800(var2, this.field2769, (byte) -87) + 4096 : 4096;
            }
            this.field2761[var5][this.field2764] = 4096;
        }
        this.field2779[this.field2767] = 4096;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 253)
    public static void method1353(int arg0) {
        field2780 = null;
        field2760 = null;
        field2782 = null;
        field2783 = null;
        if (arg0 < 22) {
            field2780 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)[I", line = 267)
    public final int[] method117(byte arg0, int arg1) {
        ++field2778;
        if (arg0 > -87) {
            this.field2769 = -3;
        }
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int var4 = 0;
            int var5;
            for (var5 = class385.field5384[arg1] + this.field2771; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field2767 && this.field2779[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field2779[var4];
            int var9 = this.field2779[var4 + -1];
            if (~(this.field2766 + var9) > ~var5 && ~var5 > ~(var8 - this.field2766)) {
                for (int var10 = 0; ~class77.field1455 < ~var10; ++var10) {
                    int var11 = !var7 ? -this.field2777 : this.field2777;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field2776 * var11 >> 12) + class20.field261[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field2764 < ~var12 && ~var13 <= ~this.field2761[var6][var12]) {
                        ++var12;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field2761[var6][var12];
                    int var16 = this.field2761[var6][var14];
                    if (this.field2766 + var16 < var13 && ~var13 > ~(var15 - this.field2766)) {
                        var3[var10] = this.field2774[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class622.method3592(var3, 0, class77.field1455, 0);
            }
        }
        return var3;
    }
}
