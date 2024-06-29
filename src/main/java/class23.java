import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class23 extends class362 {

    @OriginalMember(owner = "client!qia", name = "z", descriptor = "I")
    private int field470 = 3072;

    @OriginalMember(owner = "client!qia", name = "E", descriptor = "I")
    private int field474 = 2048;

    @OriginalMember(owner = "client!qia", name = "K", descriptor = "I")
    private int field480 = 1024;

    @OriginalMember(owner = "client!qia", name = "G", descriptor = "[I")
    public static int[] field476 = new int[2];

    @OriginalMember(owner = "client!qia", name = "J", descriptor = "Lpja;")
    public static class43 field479 = new class43(5);

    @OriginalMember(owner = "client!qia", name = "y", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!qia", name = "A", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!qia", name = "B", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!qia", name = "C", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!qia", name = "F", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!qia", name = "H", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!qia", name = "I", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IB)[[I", line = 10)
    public final int[][] method153(int arg0, byte arg1) {
        if (arg1 < 57) {
            return null;
        } else {
            ++field469;
            int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
            if (super.field4938.field7848) {
                int[][] var4 = this.method2222(0, arg0, 28008);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class769.field10597 > var11; ++var11) {
                    var8[var11] = (var5[var11] * this.field474 >> 12) + this.field480;
                    var9[var11] = this.field480 - -(var6[var11] * this.field474 >> 12);
                    var10[var11] = (var7[var11] * this.field474 >> 12) + this.field480;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "()V", line = 249)
    public class23() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lfca;II)V", line = 61)
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field4929 = ~arg0.method793((byte) 21) == -2;
                }
            } else {
                this.field470 = arg0.method763(arg2 ^ -88);
            }
        } else {
            this.field480 = arg0.method763(arg2 + 88);
        }
        if (arg2 != -1) {
            method155(53);
        }
        ++field472;
    }

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)V", line = 109)
    public static final void method155(int arg0) {
        class366.method2232(40);
        ++field473;
        class11.field179 = 0;
        class445.field6088 = 0;
        class152.field2502 = null;
        class757.field10441 = null;
        class698.field9643 = null;
        class533.field7219 = null;
        class445.field6126 = 0;
        class262.field3679.field1442 = 0;
        class313.method1987(false);
        class317.method1996((byte) 127);
        for (int var1 = 0; var1 < 2048; ++var1) {
            class527.field7150[var1] = null;
        }
        class235.field3379 = null;
        for (int var2 = 0; ~var2 > ~class406.field5583; ++var2) {
            class666 var4 = class491.field6712[var2].field10414;
            if (var4 != null) {
                var4.field5286 = -1;
            }
        }
        class2.method16(0);
        class536.field7291 = 1;
        class100.field1626 = -1;
        class577.field8185 = -1;
        class139.method1142(2, 10);
        for (int var3 = 0; ~var3 > -101; ++var3) {
            class377.field5145[var3] = true;
        }
        if (arg0 != 8301) {
            method157(-15, (byte[]) null);
        }
        class402.method2404(-13113);
        class189.field2905 = 0L;
        class707.field9714 = null;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)[I", line = 166)
    public final int[] method156(int arg0, int arg1) {
        ++field478;
        if (arg0 != -2026769311) {
            method159((byte) 46);
        }
        int[] var3 = super.field4927.method808(-128, arg1);
        if (super.field4927.field1471) {
            int[] var4 = this.method2221(0, arg1, arg0 ^ -2026769382);
            for (int var5 = 0; ~var5 > ~class769.field10597; ++var5) {
                var3[var5] = (var4[var5] * this.field474 >> 12) + this.field480;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I[B)[B", line = 200)
    public static final byte[] method157(int arg0, byte[] arg1) {
        ++field477;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            if (arg0 <= 96) {
                return null;
            } else {
                class275.method1771(arg1, 0, var2, 0, arg1.length);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILkh;BI)V", line = 221)
    public static final void method158(int arg0, class17 arg1, byte arg2, int arg3) {
        class84.field1150 = arg0;
        class576.field8175 = arg1;
        if (arg2 <= -28) {
            class711.field9781 = arg3;
            ++field475;
        }
    }

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "(B)V", line = 236)
    public static void method159(byte arg0) {
        field479 = null;
        field476 = null;
        int var1 = 70 % ((arg0 - 21) / 34);
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V", line = 255)
    public final void method160(int arg0) {
        ++field471;
        this.field474 = -this.field480 + this.field470;
        if (arg0 != -996226836) {
            this.field470 = -34;
        }
    }
}
