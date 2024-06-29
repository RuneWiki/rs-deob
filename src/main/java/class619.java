import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class619 extends class569 implements class602 {

    @OriginalMember(owner = "client!et", name = "hb", descriptor = "Z")
    private boolean field8383;

    @OriginalMember(owner = "client!et", name = "T", descriptor = "B")
    private byte field8369;

    @OriginalMember(owner = "client!et", name = "V", descriptor = "Z")
    private boolean field8371;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "B")
    private byte field8360;

    @OriginalMember(owner = "client!et", name = "ab", descriptor = "S")
    private short field8376;

    @OriginalMember(owner = "client!et", name = "W", descriptor = "Z")
    private boolean field8372;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "Lka;")
    private class497 field8358;

    @OriginalMember(owner = "client!et", name = "I", descriptor = "Lr;")
    private class195 field8359;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!et", name = "N", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!et", name = "P", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!et", name = "R", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!et", name = "S", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!et", name = "U", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!et", name = "X", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!et", name = "Y", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!et", name = "Z", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!et", name = "bb", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!et", name = "cb", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!et", name = "db", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!et", name = "eb", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!et", name = "fb", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!et", name = "gb", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!et", name = "ib", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!et", name = "jb", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "Lln;")
    private class398 field8363;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I", line = 5)
    public final int method1748(int arg0) {
        if (arg0 != 5875) {
            this.field8372 = false;
        }
        ++field8361;
        return this.field8376 & 65535;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Lha;B)V", line = 16)
    public final void method1752(class66 arg0, byte arg1) {
        ++field8373;
        if (arg1 > -17) {
            this.field8372 = false;
        }
        Object var3 = null;
        class195 var5;
        if (this.field8359 == null && this.field8372) {
            class786 var4 = this.method3431(true, -8419, 262144, arg0);
            var5 = var4 != null ? var4.field10801 : null;
        } else {
            var5 = this.field8359;
            this.field8359 = null;
        }
        if (var5 != null) {
            class384.method2380(var5, super.field2809, super.field2802, super.field2810, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(Lha;B)Lln;", line = 46)
    public final class398 method119(class66 arg0, byte arg1) {
        if (arg1 > -35) {
            this.field8369 = -19;
        }
        if (this.field8363 == null) {
            this.field8363 = class122.method882(this.method3430(0, arg0, -111), super.field2810, super.field2802, super.field2815, -123);
        }
        ++field8368;
        return this.field8363;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILha;II)Z", line = 67)
    public final boolean method122(int arg0, class66 arg1, int arg2, int arg3) {
        ++field8384;
        if (arg2 != 6238) {
            return false;
        } else {
            class497 var5 = this.method3430(131072, arg1, -85);
            if (var5 != null) {
                class109 var6 = arg1.method475();
                var6.method814(super.field2802, super.field2815, super.field2810);
                return class408.field5786 ? var5.method245(arg0, arg3, var6, false, 0, class72.field972) : var5.method248(arg0, arg3, var6, false, 0);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I[B)V", line = 89)
    public static final void method3428(int arg0, byte[] arg1) {
        ++field8382;
        class254 var2 = new class254(arg1);
        if (arg0 != 3) {
            field8375 = -98;
        }
        while (true) {
            while (true) {
                while (true) {
                    int var3 = var2.method1731((byte) 64);
                    if (var3 == 0) {
                        return;
                    }
                    if (~var3 != -2) {
                        if (~var3 == -5) {
                            int var4 = var2.method1731((byte) 64);
                            class777.field10683 = new int[var4];
                            for (int var5 = 0; ~var5 > ~var4; ++var5) {
                                class777.field10683[var5] = var2.method1728((byte) 12);
                                if (~class777.field10683[var5] == -65536) {
                                    class777.field10683[var5] = -1;
                                }
                            }
                        } else if (~var3 == -6) {
                            int var6 = var2.method1731((byte) 64);
                            class157.field2113 = new int[var6];
                            for (int var7 = 0; var6 > var7; ++var7) {
                                class157.field2113[var7] = var2.method1728((byte) 16);
                                if (~class157.field2113[var7] == -65536) {
                                    class157.field2113[var7] = -1;
                                }
                            }
                        }
                    } else {
                        int[] var8 = class90.field1265 = new int[6];
                        var8[0] = var2.method1728((byte) 118);
                        var8[1] = var2.method1728((byte) 56);
                        var8[2] = var2.method1728((byte) 110);
                        var8[3] = var2.method1728((byte) 122);
                        var8[4] = var2.method1728((byte) 11);
                        var8[5] = var2.method1728((byte) 32);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lha;Llp;IIIIIZIIII)V", line = 170)
    public class619(class66 arg0, class412 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field8383 = arg1.field5905 != 0 && !arg7;
        this.field8369 = (byte) arg10;
        this.field8371 = arg7;
        this.field8360 = (byte) arg11;
        super.field2802 = arg4;
        this.field8376 = (short) arg1.field5850;
        super.field2810 = arg6;
        this.field8372 = arg0.method538() && arg1.field5927 && !this.field8371 && class125.field1721.field5156.method159(43) != 0;
        class786 var13 = this.method3431(this.field8372, -8419, 2048, arg0);
        if (var13 != null) {
            this.field8358 = var13.field10802;
            this.field8359 = var13.field10801;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V", line = 194)
    public final void method1745(boolean arg0) {
        ++field8381;
        if (arg0) {
            if (this.field8358 != null) {
                this.field8358.method274();
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(B)I", line = 207)
    public final int method774(byte arg0) {
        ++field8377;
        if (arg0 != 115) {
            return -107;
        } else {
            return this.field8358 == null ? 0 : this.field8358.method265();
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lha;B)V", line = 222)
    public final void method1742(class66 arg0, byte arg1) {
        ++field8378;
        if (arg1 < 68) {
            this.field8358 = null;
        }
        Object var3 = null;
        class195 var5;
        if (this.field8359 == null && this.field8372) {
            class786 var4 = this.method3431(true, -8419, 262144, arg0);
            var5 = var4 != null ? var4.field10801 : null;
        } else {
            var5 = this.field8359;
            this.field8359 = null;
        }
        if (var5 != null) {
            class526.method3052(var5, super.field2809, super.field2802, super.field2810, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Z", line = 250)
    public final boolean method1747(byte arg0) {
        int var2 = -61 % ((arg0 - -41) / 60);
        ++field8379;
        return this.field8372;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III)I", line = 260)
    public static final int method3429(int arg0, int arg1, int arg2) {
        ++field8357;
        if (arg1 != 1 && arg1 != 3) {
            if (arg2 >= -43) {
                method3428(96, (byte[]) null);
            }
            return class4.field30[3 & arg0];
        } else {
            return class24.field242[3 & arg0];
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILha;I)Lka;", line = 275)
    private final class497 method3430(int arg0, class66 arg1, int arg2) {
        int var4 = -48 % ((arg2 - 24) / 61);
        ++field8362;
        if (this.field8358 != null && ~arg1.method520(this.field8358.method260(), arg0) == -1) {
            return this.field8358;
        } else {
            class786 var5 = this.method3431(false, -8419, arg0, arg1);
            return var5 != null ? var5.field10802 : null;
        }
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)I", line = 298)
    public final int method1750(int arg0) {
        ++field8365;
        if (arg0 != 29244) {
            this.field8372 = false;
        }
        return this.field8369;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZIILha;)Lsw;", line = 309)
    private final class786 method3431(boolean arg0, int arg1, int arg2, class66 arg3) {
        if (arg1 != -8419) {
            field8375 = 20;
        }
        ++field8367;
        class412 var5 = class210.field2705.method1362(0, this.field8376 & 65535);
        class295 var6;
        class295 var7;
        if (!this.field8371) {
            if (~super.field2809 > -4) {
                var6 = class648.field8748[super.field2809 - -1];
            } else {
                var6 = null;
            }
            var7 = class648.field8748[super.field2809];
        } else {
            var7 = class737.field10008[super.field2809];
            var6 = class648.field8748[0];
        }
        return var5.method2475(super.field2802, var6, this.field8369, arg2, arg0, arg3, (byte) -104, var7, (class711) null, super.field2815, this.field8360, super.field2810);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)I", line = 339)
    public final int method1744(int arg0) {
        if (arg0 != 21215) {
            this.method122(-85, (class66) null, 86, 23);
        }
        ++field8374;
        return this.field8360;
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(I)Z", line = 350)
    public final boolean method769(int arg0) {
        ++field8370;
        if (arg0 > -70) {
            this.field8383 = false;
        }
        if (this.field8358 == null) {
            return true;
        } else {
            return !this.field8358.method285();
        }
    }

    @OriginalMember(owner = "client!et", name = "i", descriptor = "(I)Z", line = 370)
    public final boolean method777(int arg0) {
        int var2 = -62 / ((-34 - arg0) / 59);
        ++field8385;
        return this.field8358 != null ? this.field8358.method272() : false;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(Lha;B)Lpia;", line = 384)
    public final class104 method114(class66 arg0, byte arg1) {
        if (arg1 != 115) {
            method3428(-58, (byte[]) null);
        }
        ++field8364;
        if (this.field8358 == null) {
            return null;
        } else {
            class109 var3 = arg0.method475();
            var3.method814(super.field7762 + super.field2802, super.field2815, super.field7765 + super.field2810);
            class104 var4 = class568.method3241(1, (byte) -62, this.field8383);
            if (class408.field5786) {
                this.field8358.method258(var3, var4.field1479[0], class72.field972, 0);
            } else {
                this.field8358.method254(var3, var4.field1479[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)I", line = 410)
    public final int method767(boolean arg0) {
        if (arg0) {
            return 7;
        } else {
            ++field8366;
            return this.field8358 == null ? 0 : this.field8358.method264();
        }
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(Lha;B)V", line = 423)
    public final void method131(class66 arg0, byte arg1) {
        ++field8380;
        if (arg1 != 53) {
            this.method3430(114, (class66) null, 95);
        }
    }
}
