import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class331 extends class179 {

    @OriginalMember(owner = "client!ve", name = "Rb", descriptor = "Lpn;")
    public static class72 field4764 = new class72(43, -1);

    @OriginalMember(owner = "client!ve", name = "Wb", descriptor = "Lgl;")
    public static class365 field4769 = null;

    @OriginalMember(owner = "client!ve", name = "Sb", descriptor = "Lug;")
    public static class349 field4765 = new class349();

    @OriginalMember(owner = "client!ve", name = "Zb", descriptor = "I")
    public static int field4772 = 0;

    @OriginalMember(owner = "client!ve", name = "Gb", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ve", name = "Hb", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ve", name = "Ib", descriptor = "I")
    private int field4755;

    @OriginalMember(owner = "client!ve", name = "Jb", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ve", name = "Lb", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ve", name = "Mb", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ve", name = "Nb", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ve", name = "Ob", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ve", name = "Pb", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ve", name = "Qb", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ve", name = "Ub", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!ve", name = "Vb", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!ve", name = "Xb", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ve", name = "Yb", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!ve", name = "Tb", descriptor = "Lua;")
    public static class188 field4766;

    @OriginalMember(owner = "client!ve", name = "Kb", descriptor = "Lgg;")
    private class335 field4757;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V", line = 3)
    public static final void method2003(int arg0, int arg1, int arg2) {
        ++field4754;
        if (arg1 != -1977337177) {
            field4769 = null;
        }
        class89 var3 = class146.method695(1, arg0, (byte) -36);
        var3.method449(true);
        var3.field1106 = arg2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([BIIZ)V", line = 18)
    public final void method2004(byte[] arg0, int arg1, int arg2, boolean arg3) {
        int var5 = 0;
        if (arg3) {
            while (~arg1 < ~var5) {
                arg0[arg2 + var5] = (byte) (super.field2159[super.field2206++] + -this.field4757.method2034((byte) -37));
                ++var5;
            }
            ++field4767;
        }
    }

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "(II)V", line = 41)
    public static final void method2005(int arg0, int arg1) {
        class486.field6898 = arg1;
        ++field4761;
        class325.field4690 = -1;
        if (arg0 <= 1) {
            method2005(40, 48);
        }
        class104.field1260 = -1;
        class184.method1003(-67);
    }

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "(B)V", line = 55)
    public final void method2006(byte arg0) {
        ++field4760;
        int var2 = 70 / ((-1 - arg0) / 63);
        super.field2206 = (this.field4755 + 7) / 8;
    }

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "(I)V", line = 70)
    public static void method2007(int arg0) {
        if (arg0 != -1) {
            method2014(60, false);
        }
        field4766 = null;
        field4764 = null;
        field4769 = null;
        field4765 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IB)V", line = 84)
    public final void method2008(int arg0, byte arg1) {
        ++field4753;
        if (arg1 != -2) {
            method2014(45, false);
        }
        super.field2159[super.field2206++] = (byte) (arg0 + this.field4757.method2034((byte) -113));
    }

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "(I)Z", line = 95)
    public final boolean method2009(int arg0) {
        ++field4770;
        int var2 = super.field2159[super.field2206] + -this.field4757.method2035(-32435) & arg0;
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "(I)I", line = 111)
    public final int method2010(int arg0) {
        ++field4762;
        int var2 = super.field2159[super.field2206++] - this.field4757.method2034((byte) -63) & 255;
        if (~var2 > -129) {
            return var2;
        } else {
            return arg0 != -128 ? 125 : (var2 + -128 << 8) + (255 & super.field2159[super.field2206++] + -this.field4757.method2034((byte) -90));
        }
    }

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "(II)I", line = 128)
    public final int method2011(int arg0, int arg1) {
        ++field4771;
        if (arg0 != -6750) {
            field4772 = 120;
        }
        return arg1 * 8 + -this.field4755;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIII)V", line = 144)
    public static final void method2012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class85 var7 = new class85();
        var7.field1028 = arg1 >> class482.field6812;
        var7.field1049 = arg2 >> class482.field6812;
        var7.field1037 = arg3 >> class482.field6812;
        var7.field1042 = arg4 >> class482.field6812;
        var7.field1040 = arg0;
        var7.field1047 = arg1;
        var7.field1027 = arg2;
        var7.field1041 = arg3;
        var7.field1034 = arg4;
        var7.field1036 = arg5;
        var7.field1025 = arg6;
        class334.field4806[class87.field1086++] = var7;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([IB)V", line = 161)
    public final void method2013(int[] arg0, byte arg1) {
        ++field4759;
        if (arg1 != -14) {
            this.method2009(-30);
        }
        this.field4757 = new class335(arg0);
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(IZ)V", line = 173)
    public static final void method2014(int arg0, boolean arg1) {
        ++field4768;
        class353.field5070 = arg0;
        class360.field5194 = 0;
        class84.method426(-32665);
        class314.method1941(arg1, -32768);
        class357.method2182((byte) 101);
        for (int var2 = 0; class353.field5070 > var2; ++var2) {
            int var4 = class73.field880[var2];
            if (class204.field2796 != class448.field6366[var4].field2489) {
                if (class448.field6366[var4].field1643.method2819(0)) {
                    class413.method2447(class448.field6366[var4], (byte) -57);
                }
                class448.field6366[var4].method651((byte) 123, (class476) null);
                class448.field6366[var4] = null;
            }
        }
        if (~class361.field5203 != ~class79.field939.field2206) {
            throw new RuntimeException("gnp1 pos:" + class79.field939.field2206 + " psize:" + class361.field5203);
        } else {
            for (int var3 = 0; ~var3 > ~class356.field5112; ++var3) {
                if (class448.field6366[class25.field353[var3]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class356.field5112);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(BI)V", line = 226)
    public static final void method2015(byte arg0, int arg1) {
        class328.method1990((byte) 7);
        ++field4756;
        class458.method2697((byte) -91);
        class63.method322(arg1, false, true);
        class182.method992(class231.field3205, (byte) 60, class171.field2022, class39.field470);
        if (arg0 != -128) {
            method2014(59, false);
        }
        class403.method2409(class171.field2022, -48, class231.field3205);
        class404.method2412(arg0 ^ 55, class83.field1014);
        class35.method178(true);
        class415.method2469((byte) 121);
        if (~class453.field6415 == -11) {
            class171.method842(-1, false);
        } else {
            if (~class453.field6415 != -31) {
                if (class453.field6415 == 5) {
                    class36.method184(class231.field3205, class171.field2022, 2);
                    return;
                }
            } else {
                class404.method2413(false, 25);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "(I)V", line = 258)
    public final void method2016(int arg0) {
        this.field4755 = super.field2206 * 8;
        if (arg0 < 80) {
            method2005(57, -13);
        }
        ++field4763;
    }

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "(II)I", line = 274)
    public final int method2017(int arg0, int arg1) {
        ++field4758;
        if (arg0 > 0) {
            this.method2006((byte) -124);
        }
        int var3 = this.field4755 >> 3;
        int var4 = -(this.field4755 & 7) + 8;
        int var5 = 0;
        this.field4755 += arg1;
        while (~arg1 < ~var4) {
            var5 += (class193.field2652[var4] & super.field2159[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 != ~var4) {
            var6 = (super.field2159[var3] >> -arg1 + var4 & class193.field2652[arg1]) + var5;
        } else {
            var6 = (class193.field2652[var4] & super.field2159[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V", line = 314)
    public class331(int arg0) {
        super(arg0);
    }
}
