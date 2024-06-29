import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class335 {

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Z")
    private boolean field4648 = false;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    private int field4654 = -1;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "Z")
    private boolean field4667 = false;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    private int field4646 = -32768;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    private int field4651 = -1;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public int field4672;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public int field4668;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "B")
    private byte field4640;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    private int field4661;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    private int field4662;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public int field4650;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "B")
    private byte field4658;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Z")
    private boolean field4657;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "Z")
    public static boolean field4647 = false;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    private int field4643;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    private int field4653;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    private int field4669;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    private int field4673;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Lao;")
    public class189 field4660;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Lba;")
    private class263 field4645;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Llp;")
    private class267 field4642;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "Lqt;")
    public static class449 field4664;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Lt;")
    private class471 field4652;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[Z")
    private boolean[] field4649;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "[[Luu;")
    public static class188[][] field4671;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method2040(int arg0) {
        field4664 = null;
        if (arg0 >= 96) {
            field4671 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILfs;I)Lqh;")
    public static final class49 method2041(int arg0, class387 arg1, int arg2) {
        field4674++;
        byte[] var3 = arg1.method2381(arg0, -1);
        if (arg2 == 0) {
            return var3 == null ? null : new class49(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZLya;IIBZ)Lt;")
    public final class471 method2042(int arg0, boolean arg1, class38 arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        field4644++;
        class222 var8 = class384.field5645.method786(this.field4668, 0);
        if (var8.field3233 != null) {
            var8 = var8.method1509(class253.field3739, (byte) 124);
        }
        if (var8 == null) {
            this.method2052(true, arg2);
            this.field4654 = -1;
            this.field4651 = this.field4653;
            return null;
        }
        if (!this.field4648 && this.field4654 != var8.field3217) {
            this.field4652 = null;
            this.method2043(-1, (byte) 21);
        }
        this.method2049(-90, arg0, arg3);
        boolean var9 = arg1 & this.field4657 & class478.field7044.method1536(class65.field802, (byte) -28) != 0;
        boolean var10 = var9 & (this.field4654 != var8.field3217 || (this.field4653 != this.field4651 || this.field4642 != null && (this.field4642.field3920 || class447.field6599) && this.field4673 != this.field4653) && class478.field7044.method1536(class65.field802, (byte) -28) >= 2);
        if (arg6 && !var10) {
            this.field4651 = this.field4653;
            this.field4654 = var8.field3217;
            return null;
        }
        if (var10) {
            class465.method2785(this.field4645, this.field4658, this.field4661, this.field4662, this.field4649);
        }
        class142 var11 = class131.field1899[this.field4658];
        class142 var12;
        if (this.field4667) {
            var12 = class283.field4115[0];
        } else {
            var12 = this.field4658 < 3 ? class131.field1899[this.field4658 + 1] : null;
        }
        class471 var13 = null;
        if (this.field4642 != null) {
            if (var10) {
                arg4 |= 0x40000;
            }
            var13 = var8.method1519((byte) -78, this.field4650 == 11 ? 10 : this.field4650, var11.method426(this.field4661, this.field4662), this.field4643, this.field4653, arg2, this.field4642, this.field4673, this.field4661, this.field4650 == 11 ? this.field4672 + 4 : this.field4672, this.field4662, arg4, var12, var11);
            if (var13 == null) {
                this.field4645 = null;
                this.field4649 = null;
                this.field4646 = 0;
            } else {
                if (var10) {
                    if (this.field4649 == null) {
                        this.field4649 = new boolean[4];
                    }
                    this.field4645 = var13.method449(this.field4645);
                    class452.method2728(this.field4645, this.field4658, arg3, arg0, this.field4649);
                }
                this.field4646 = var13.method463();
            }
            this.field4652 = null;
        } else if (this.field4652 != null && arg4 == (this.field4652.method459() & arg4) && this.field4654 == var8.field3217) {
            var13 = this.field4652;
        } else {
            if (this.field4652 != null) {
                arg4 |= this.field4652.method459();
            }
            class101 var14 = var8.method1514(arg2, this.field4661, 3, arg4, var11.method426(this.field4661, this.field4662), var10, this.field4650 == 11 ? this.field4672 + 4 : this.field4672, var12, this.field4662, this.field4650 == 11 ? 10 : this.field4650, var11);
            if (var14 == null) {
                this.field4646 = 0;
                this.field4649 = null;
                this.field4652 = null;
                this.field4645 = null;
            } else {
                var13 = var14.field1418;
                this.field4652 = var14.field1418;
                if (var10) {
                    this.field4649 = null;
                    this.field4645 = var14.field1416;
                    class452.method2728(this.field4645, this.field4658, arg3, arg0, null);
                }
                this.field4646 = var13.method463();
            }
        }
        if (arg5 <= 117) {
            return null;
        }
        this.field4654 = var8.field3217;
        this.field4661 = arg3;
        this.field4651 = this.field4653;
        this.field4662 = arg0;
        return var13;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
    private final void method2043(int arg0, byte arg1) {
        field4655++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class222 var5 = class384.field5645.method786(this.field4668, 0);
            class222 var6 = var5;
            if (var5.field3233 != null) {
                var5 = var5.method1509(class253.field3739, (byte) 99);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3196 != null) {
                if (this.field4642 != null && var5.method1508(0, this.field4642.field3937)) {
                    return;
                }
                var3 = var5.method1513((byte) -59);
                if (this.field4654 != var5.field3217) {
                    var4 = var5.field3232;
                }
            } else if (var5.field3247 == -1) {
                if (var6 != null && var6.field3196 != null) {
                    if (this.field4642 != null && var6.method1508(arg1 - 21, this.field4642.field3937)) {
                        return;
                    }
                    var3 = var6.method1513((byte) -113);
                    if (this.field4654 != var6.field3217) {
                        var4 = var6.field3232;
                    }
                } else if (var6 != null && var6.field3247 != -1 && this.field4654 != var6.field3217) {
                    var3 = var6.field3247;
                    var4 = var6.field3232;
                }
            } else if (this.field4654 != var5.field3217) {
                var3 = var5.field3247;
                var4 = var5.field3232;
            }
        }
        if (var3 == -1) {
            this.field4642 = null;
            return;
        }
        this.field4652 = null;
        if (this.field4642 == null || this.field4642.field3937 != var3) {
            this.field4642 = class153.field2169.method1585(arg1 - 18, var3);
        } else if (this.field4642.field3932 == 0) {
            return;
        }
        if (this.field4642.field3919 == null) {
            this.field4642 = null;
            return;
        }
        if (var4) {
            this.field4653 = (int) ((double) this.field4642.field3919.length * Math.random());
            this.field4643 = ((int) (Math.random() * (double) this.field4642.field3940[this.field4653])) + 1;
        } else {
            this.field4643 = 1;
            this.field4653 = 0;
        }
        this.field4673 = this.field4653 + 1;
        if (arg1 != 21) {
            this.field4667 = true;
        }
        if (this.field4673 < 0 || this.field4642.field3919.length <= this.field4673) {
            this.field4673 = -1;
        }
        this.field4669 = class263.field3867 - this.field4643;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
    public final int method2044(byte arg0) {
        int var2 = -37 % ((arg0 + 51) / 47);
        field4656++;
        return this.field4646;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BF)F")
    public static final float method2045(byte arg0, float arg1) {
        field4637++;
        return arg0 == 126 ? arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F) : -0.04606044F;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILya;)V")
    public final void method2046(int arg0, class38 arg1) {
        field4665++;
        this.method2042(this.field4662, true, arg1, this.field4661, arg0, (byte) 119, true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lr;I)V")
    public static final void method2047(class121 arg0, int arg1) {
        field4666++;
        int var2 = arg0.field1692 - class263.field3867;
        int var3 = arg0.field1726 * 128 + arg0.method963((byte) 127) * 64;
        int var4 = arg0.field1735 * 128 + (arg0.method963((byte) 127) * 64);
        arg0.field6334 += (var4 - arg0.field6334) / var2;
        arg0.field1775 = 0;
        arg0.field6335 += (var3 - arg0.field6335) / var2;
        if (arg0.field1724 == 0) {
            arg0.method955(8192, false);
        }
        if (arg0.field1724 == 1) {
            arg0.method955(12288, false);
        }
        if (arg1 != 24068) {
            method2040(-81);
        }
        if (arg0.field1724 == 2) {
            arg0.method955(0, false);
        }
        if (arg0.field1724 == 3) {
            arg0.method955(4096, false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z")
    public final boolean method2048(int arg0) {
        if (arg0 != -1) {
            this.field4654 = 58;
        }
        field4639++;
        return this.field4657;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
    private final void method2049(int arg0, int arg1, int arg2) {
        if (arg0 > -87) {
            this.method2044((byte) -45);
        }
        field4641++;
        label92: while (true) {
            if (this.field4642 == null) {
                if (this.field4648) {
                    return;
                }
                this.method2043(-1, (byte) 21);
                if (this.field4642 == null) {
                    return;
                }
            }
            int var4 = class263.field3867 - this.field4669;
            if (var4 > 100 && this.field4642.field3926 > 0) {
                int var5 = this.field4642.field3919.length - this.field4642.field3926;
                while (var5 > this.field4653 && var4 > this.field4642.field3940[this.field4653]) {
                    var4 -= this.field4642.field3940[this.field4653];
                    this.field4653++;
                }
                if (this.field4653 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4642.field3919.length; var7++) {
                        var6 += this.field4642.field3940[var7];
                    }
                    var4 %= var6;
                }
                this.field4673 = this.field4653 + 1;
                if (this.field4642.field3919.length <= this.field4673) {
                    this.field4673 -= this.field4642.field3926;
                    if (this.field4673 < 0 || this.field4642.field3919.length <= this.field4673) {
                        this.field4673 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field4642.field3940[this.field4653]) {
                            this.field4643 = var4;
                            this.field4669 = class263.field3867 - var4;
                            return;
                        }
                        class20.method183(arg2, this.field4653, this.field4640, arg1, true, this.field4642, false);
                        var4 -= this.field4642.field3940[this.field4653];
                        this.field4653++;
                        if (this.field4653 >= this.field4642.field3919.length) {
                            this.field4653 -= this.field4642.field3926;
                            if (this.field4653 < 0 || this.field4653 >= this.field4642.field3919.length) {
                                this.field4642 = null;
                                continue label92;
                            }
                        }
                        this.field4673 = this.field4653 + 1;
                    } while (this.field4642.field3919.length > this.field4673);
                    this.field4673 -= this.field4642.field3926;
                } while (this.field4673 >= 0 && this.field4642.field3919.length > this.field4673);
                this.field4673 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIILt;ILya;II)V")
    public final void method2050(boolean arg0, int arg1, int arg2, class471 arg3, int arg4, class38 arg5, int arg6, int arg7) {
        field4670++;
        class17[] var9 = arg3.method454();
        if (arg2 != 28146) {
            this.method2046(-15, null);
        }
        class410[] var10 = arg3.method444();
        if ((this.field4660 == null || this.field4660.field2781) && (var9 != null || var10 != null)) {
            class222 var11 = class384.field5645.method786(this.field4668, 0);
            if (var11.field3233 != null) {
                var11 = var11.method1509(class253.field3739, (byte) -29);
            }
            if (var11 != null) {
                this.field4660 = new class189(class263.field3867);
            }
        }
        if (this.field4660 == null) {
            return;
        }
        if (arg0) {
            this.field4660.method1329(arg5, (long) class263.field3867, var9, var10, false);
        } else {
            this.field4660.method1328((long) class263.field3867);
        }
        this.field4660.method1334(this.field4640, arg7, arg4, arg1, arg6);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
    public final void method2051(int arg0, int arg1) {
        field4638++;
        this.field4648 = true;
        this.method2043(arg0, (byte) 21);
        if (arg1 != 8192) {
            this.field4661 = 53;
        }
    }

    @OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field4660 != null) {
            this.field4660.method1326();
        }
        field4659++;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lya;Lrd;IIIIIIZI)V")
    public class335(class38 arg0, class222 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field4672 = arg3;
        this.field4668 = arg1.field3217;
        this.field4667 = arg8;
        this.field4640 = (byte) arg4;
        this.field4661 = arg6;
        this.field4662 = arg7;
        this.field4650 = arg2;
        this.field4658 = (byte) arg5;
        this.field4657 = arg0.method297() && arg1.field3193 && !this.field4667;
        if (arg9 != -1) {
            this.field4648 = true;
        }
        this.method2043(arg9, (byte) 21);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLya;)V")
    public final void method2052(boolean arg0, class38 arg1) {
        field4663++;
        if (this.field4645 != null) {
            class465.method2785(this.field4645, this.field4658, this.field4661, this.field4662, this.field4649);
            this.field4645 = null;
            this.field4649 = null;
        }
        if (!arg0) {
            this.field4648 = true;
        }
    }
}
