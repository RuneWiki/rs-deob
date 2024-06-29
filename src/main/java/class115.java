import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class115 extends class184 {

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    private int field1542 = 0;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    private int field1537 = 0;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    private int field1536 = 0;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lni;")
    public static class363 field1545 = new class363("WTQA", 2);

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "Z")
    public static boolean field1550 = false;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Ldq;")
    public static class493 field1549 = new class493(93, -1);

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(Z)V", line = 7)
    public static void method827(boolean arg0) {
        field1549 = null;
        if (arg0) {
            field1545 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIB)V", line = 18)
    private final void method828(int arg0, int arg1, int arg2, byte arg3) {
        ++field1543;
        if (arg3 >= 20) {
            int var5 = arg2 > arg0 ? arg2 : arg0;
            int var6 = ~arg0 < ~arg2 ? arg2 : arg0;
            int var7 = ~var5 > ~arg1 ? arg1 : var5;
            int var8 = ~arg1 <= ~var6 ? var6 : arg1;
            int var9 = var7 - var8;
            this.field1534 = (var7 + var8) / 2;
            if (~this.field1534 < -1 && ~this.field1534 > -4097) {
                this.field1539 = (var9 << 12) / (this.field1534 <= 2048 ? this.field1534 * 2 : -(this.field1534 * 2) + 8192);
            } else {
                this.field1539 = 0;
            }
            if (var9 <= 0) {
                this.field1532 = 0;
            } else {
                int var10 = (-arg2 + var7 << 12) / var9;
                int var11 = (-arg0 + var7 << 12) / var9;
                int var12 = (-arg1 + var7 << 12) / var9;
                if (~arg2 == ~var7) {
                    this.field1532 = arg0 == var8 ? var12 + 20480 : -var11 + 4096;
                } else if (~arg0 == ~var7) {
                    this.field1532 = ~arg1 == ~var8 ? var10 + 4096 : -var12 + 12288;
                } else {
                    this.field1532 = arg2 == var8 ? var11 + 12288 : -var10 + 20480;
                }
                this.field1532 /= 6;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)I", line = 76)
    public static final int method829(int arg0, int arg1) {
        if (arg0 != 255) {
            return -11;
        } else {
            ++field1541;
            return arg1 & 255;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 88)
    public class115() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BILfh;)V", line = 92)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        int var4 = 50 % ((arg0 - -13) / 51);
        ++field1547;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field1537 = (arg2.method2793(32767) << 12) / 100;
                }
            } else {
                this.field1542 = (arg2.method2793(32767) << 12) / 100;
            }
        } else {
            this.field1536 = arg2.method2791(true);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBII)V", line = 144)
    private final void method830(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = 95 / ((51 - arg1) / 40);
        ++field1535;
        int var6 = ~arg2 >= -2049 ? (4096 - -arg3) * arg2 >> 12 : arg2 + arg3 - (arg2 * arg3 >> 12);
        if (~var6 >= -1) {
            this.field1546 = this.field1538 = this.field1533 = arg2;
        } else {
            int var7 = arg0 * 6;
            int var8 = arg2 - -arg2 - var6;
            int var9 = (var6 - var8 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = -(var10 << 12) + var7;
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = -var14 + var6;
            if (var10 != 0) {
                if (~var10 != -2) {
                    if (var10 != 2) {
                        if (~var10 != -4) {
                            if (~var10 != -5) {
                                if (var10 == 5) {
                                    this.field1546 = var6;
                                    this.field1533 = var16;
                                    this.field1538 = var8;
                                }
                            } else {
                                this.field1533 = var6;
                                this.field1538 = var8;
                                this.field1546 = var15;
                            }
                        } else {
                            this.field1538 = var16;
                            this.field1546 = var8;
                            this.field1533 = var6;
                        }
                    } else {
                        this.field1546 = var8;
                        this.field1533 = var15;
                        this.field1538 = var6;
                    }
                } else {
                    this.field1538 = var6;
                    this.field1546 = var16;
                    this.field1533 = var8;
                }
            } else {
                this.field1538 = var15;
                this.field1546 = var6;
                this.field1533 = var8;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[[I", line = 261)
    public final int[][] method13(int arg0, int arg1) {
        ++field1544;
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field2416.method3031(-28526, arg0);
            if (super.field2416.field7271) {
                int[][] var4 = this.method1163(1, arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class245.field3167; ++var11) {
                    this.method828(var6[var11], var7[var11], var5[var11], (byte) 121);
                    this.field1539 += this.field1542;
                    this.field1534 += this.field1537;
                    for (this.field1532 += this.field1536; this.field1532 < 0; this.field1532 += 4096) {
                    }
                    while (~this.field1532 < -4097) {
                        this.field1532 -= 4096;
                    }
                    if (this.field1539 < 0) {
                        this.field1539 = 0;
                    }
                    if (~this.field1534 > -1) {
                        this.field1534 = 0;
                    }
                    if (this.field1539 > 4096) {
                        this.field1539 = 4096;
                    }
                    if (~this.field1534 < -4097) {
                        this.field1534 = 4096;
                    }
                    this.method830(this.field1532, (byte) -15, this.field1534, this.field1539);
                    var8[var11] = this.field1546;
                    var9[var11] = this.field1538;
                    var10[var11] = this.field1533;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([FIB)[F", line = 342)
    public static final float[] method831(float[] arg0, int arg1, byte arg2) {
        ++field1540;
        if (arg2 != 63) {
            method831((float[]) null, -67, (byte) 11);
        }
        float[] var3 = new float[arg1];
        class318.method1874(arg0, 0, var3, 0, arg1);
        return var3;
    }
}
