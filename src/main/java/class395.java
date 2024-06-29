import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class395 extends class694 {

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    private int field5497 = 0;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    private int field5495 = 4096;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "Lpj;")
    public static class132 field5501;

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V", line = 5)
    public class395() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(II)[[I", line = 11)
    public final int[][] method15(int arg0, int arg1) {
        ++field5499;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738) {
            int[][] var4 = this.method3812(arg1, 0, -14032);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class465.field6544 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field5497 <= var12) {
                    if (this.field5495 >= var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field5495;
                    }
                } else {
                    var8[var11] = this.field5497;
                }
                if (~var13 > ~this.field5497) {
                    var9[var11] = this.field5497;
                } else if (~var13 >= ~this.field5495) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field5495;
                }
                if (~this.field5497 < ~var14) {
                    var10[var11] = this.field5497;
                } else if (~this.field5495 <= ~var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field5495;
                }
            }
        }
        if (arg0 != -22151) {
            this.field5497 = -15;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILjr;B)V", line = 87)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field5498;
        int var4 = -6 / ((arg2 - 58) / 63);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field9744 = ~arg1.method718(78) == -2;
                }
            } else {
                this.field5495 = arg1.method743((byte) -47);
            }
        } else {
            this.field5497 = arg1.method743((byte) -42);
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)V", line = 129)
    public static void method2249(boolean arg0) {
        if (!arg0) {
            field5501 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(III)I", line = 144)
    public static final int method2250(int arg0, int arg1, int arg2) {
        ++field5496;
        if (arg0 != 1) {
            method2251((byte) -19, 12, -44);
        }
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 255;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)[I", line = 164)
    public final int[] method39(int arg0, int arg1) {
        ++field5502;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int[] var4 = this.method3809(0, arg1, (byte) 35);
            for (int var5 = 0; ~var5 > ~class465.field6544; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field5497) {
                    var3[var5] = this.field5497;
                } else if (~var6 >= ~this.field5495) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field5495;
                }
            }
        }
        if (arg0 <= 112) {
            field5501 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BII)Z", line = 208)
    public static final boolean method2251(byte arg0, int arg1, int arg2) {
        ++field5500;
        if (arg0 != -63) {
            field5501 = null;
        }
        return ~(2048 & arg1) != -1;
    }
}
