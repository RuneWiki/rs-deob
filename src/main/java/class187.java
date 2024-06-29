import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class187 extends class264 {

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field2808 = 0;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "Lga;")
    public static class420 field2806 = new class420();

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lbg;I[[B)V", line = 3)
    public static final void method1384(class487 arg0, int arg1, byte[][] arg2) {
        ++field2810;
        if (arg1 == 126) {
            for (int var3 = 0; var3 < arg0.field5736; ++var3) {
                class84.method611(-37);
                for (int var4 = 0; class109.field1314 >> 3 > var4; ++var4) {
                    for (int var5 = 0; ~var5 > ~(class760.field10479 >> 3); ++var5) {
                        int var6 = class626.field8833[var3][var4][var5];
                        if (~var6 != 0) {
                            int var7 = (var6 & 65787190) >> 24;
                            if (!arg0.field5741 || ~var7 == -1) {
                                int var8 = (6 & var6) >> 1;
                                int var9 = 1023 & var6 >> 14;
                                int var10 = var6 >> 3 & 2047;
                                int var11 = (var9 / 8 << 8) + var10 / 8;
                                for (int var12 = 0; ~class96.field1236.length < ~var12; ++var12) {
                                    if (~class96.field1236[var12] == ~var11 && arg2[var12] != null) {
                                        arg0.method2841(arg2[var12], var8, var5 * 8, var7, (var9 & 7) * 8, -1, (var10 & 7) * 8, var3, class234.field3394, var4 * 8, class638.field8979);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)I", line = 76)
    public final int method666(byte arg0, int arg1) {
        if (arg0 != 112) {
            field2806 = null;
        }
        ++field2801;
        if (super.field3731.method3633(78)) {
            return 3;
        } else {
            return super.field3731.method3639(true) == class234.field3384 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)Z", line = 95)
    public final boolean method1385(int arg0) {
        ++field2799;
        if (super.field3731.method3633(86)) {
            return false;
        } else if (arg0 != 14996) {
            return true;
        } else {
            return super.field3731.method3639(true) == class234.field3384;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(ILmfa;)V", line = 113)
    public class187(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(BI)V", line = 118)
    public final void method659(byte arg0, int arg1) {
        if (arg0 < -114) {
            ++field2807;
            super.field3733 = arg1;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lmfa;)V", line = 129)
    public class187(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)I", line = 132)
    public final int method663(byte arg0) {
        ++field2804;
        return arg0 != -38 ? 66 : 1;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V", line = 144)
    public static void method1386(int arg0) {
        field2806 = null;
        if (arg0 > -127) {
            method1388(113, -82, 36);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)I", line = 154)
    public final int method1387(byte arg0) {
        if (arg0 >= -31) {
            this.method659((byte) 124, 88);
        }
        ++field2802;
        return super.field3733;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)I", line = 169)
    public static final int method1388(int arg0, int arg1, int arg2) {
        int var3 = (127 & arg1) * arg0 >> 7;
        ++field2803;
        if (~var3 > -3) {
            var3 = 2;
        } else if (~var3 < -127) {
            var3 = 126;
        }
        if (arg2 != 1023) {
            method1386(84);
        }
        return (65408 & arg1) + var3;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V", line = 188)
    public static final void method1389(int arg0, int arg1) {
        if (arg1 > 108) {
            ++field2809;
            class678 var2 = class630.method3597(29636, 4, (long) arg0);
            var2.method3836((byte) -43);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 203)
    public final void method660(int arg0) {
        ++field2805;
        if (super.field3731.method3639(true) != class234.field3384) {
            super.field3733 = 1;
        } else if (super.field3731.method3633(98)) {
            super.field3733 = 0;
        }
        int var2 = -111 / ((arg0 - 1) / 41);
        if (super.field3733 != 0 && super.field3733 != 1) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)V", line = 226)
    public static final void method1390(int arg0, int arg1) {
        ++field2800;
        class678 var2 = class630.method3597(29636, arg1, (long) arg0);
        var2.method3836((byte) -109);
    }
}
