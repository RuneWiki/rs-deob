import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class135 extends class211 {

    @OriginalMember(owner = "client!ae", name = "zb", descriptor = "F")
    public static float field1886 = 1024.0F;

    @OriginalMember(owner = "client!ae", name = "Hb", descriptor = "I")
    public static int field1894 = 0;

    @OriginalMember(owner = "client!ae", name = "Pb", descriptor = "I")
    public static int field1902 = 0;

    @OriginalMember(owner = "client!ae", name = "Lb", descriptor = "Lpg;")
    public static class435 field1898 = new class435(0, 0);

    @OriginalMember(owner = "client!ae", name = "yb", descriptor = "I")
    private int field1885;

    @OriginalMember(owner = "client!ae", name = "Ab", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!ae", name = "Bb", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ae", name = "Cb", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ae", name = "Db", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ae", name = "Fb", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ae", name = "Gb", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ae", name = "Ib", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ae", name = "Jb", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ae", name = "Kb", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ae", name = "Mb", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ae", name = "Nb", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ae", name = "Ob", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ae", name = "Qb", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ae", name = "Eb", descriptor = "Ldk;")
    private class298 field1891;

    @OriginalMember(owner = "client!ae", name = "xb", descriptor = "Lms;")
    public static class451 field1884;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V", line = 4)
    public static final void method805(boolean arg0) {
        ++field1903;
        int var1 = class268.field3775.method1748(class326.field4582, -106);
        for (class159 var2 = (class159) class32.field301.method1124(-1); var2 != null; var2 = (class159) class32.field301.method1119(false)) {
            int var6 = class270.method1717(var2, -1003);
            if (~var1 > ~var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class433.field6324 * 16 + 21;
        int var4 = -(var1 / 2) + class57.field654;
        if (var1 + var4 > class38.field389) {
            var4 = class38.field389 - var1;
        }
        if (~var4 > -1) {
            var4 = 0;
        }
        int var5 = class48.field562;
        if (~(var5 - -var3) < ~class222.field3039) {
            var5 = -var3 + class222.field3039;
        }
        class162.field2286 = var4;
        if (~var5 > -1) {
            var5 = 0;
        }
        class119.field1595 = var1;
        class149.field2094 = (!class94.field1041 ? 22 : 26) + class433.field6324 * 16;
        class428.field6219 = var5;
        class81.field903 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "(I)V", line = 52)
    public static final void method806(int arg0) {
        class435.field6384 = -1;
        class19.field204 = -1;
        ++field1900;
        if (arg0 != -11784) {
            method805(false);
        }
        class450.field6576 = -1;
        class114.field1318 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLjf;)V", line = 67)
    public static final void method807(byte arg0, class119 arg1) {
        if (arg0 != 75) {
            method812((Component) null, (byte) -44);
        }
        ++field1888;
        int var2 = arg1.field1538;
        if (~var2 == -325) {
            if (~class70.field784 == 0) {
                class329.field4709 = arg1.field1598;
                class70.field784 = arg1.field1530;
            }
            if (!class239.field3245.field1369) {
                arg1.field1530 = class329.field4709;
            } else {
                arg1.field1530 = class70.field784;
            }
        } else if (var2 == 325) {
            if (~class70.field784 == 0) {
                class329.field4709 = arg1.field1598;
                class70.field784 = arg1.field1530;
            }
            if (class239.field3245.field1369) {
                arg1.field1530 = class329.field4709;
            } else {
                arg1.field1530 = class70.field784;
            }
        } else if (~var2 == -328) {
            arg1.field1439 = 150;
            arg1.field1522 = 16383 & (int) (Math.sin((double) class221.field3033 / 40.0D) * 256.0D);
            arg1.field1520 = -1;
            arg1.field1571 = 5;
        } else if (~var2 == -329) {
            if (class390.field5715.field1847 == null) {
                arg1.field1520 = 0;
                arg1.field1569 = 0;
            } else {
                arg1.field1439 = 150;
                arg1.field1522 = 2047 & (int) (256.0D * Math.sin((double) class221.field3033 / 40.0D));
                arg1.field1571 = 5;
                arg1.field1520 = 2047;
                arg1.field1569 = class97.method522(class390.field5715.field1847, (byte) -81);
                arg1.field1561 = class390.field5715.field6255;
                arg1.field1441 = class390.field5715.field6265;
                arg1.field1470 = class390.field5715.field6296;
                arg1.field1447 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([II)V", line = 148)
    public final void method808(int[] arg0, int arg1) {
        this.field1891 = new class298(arg0);
        if (arg1 != -7) {
            this.method808((int[]) null, 33);
        }
        ++field1896;
    }

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "(II)V", line = 160)
    public final void method809(int arg0, int arg1) {
        ++field1897;
        super.field2867[super.field2888++] = (byte) (this.field1891.method1881(class97.method519(arg1, -28043)) + arg0);
        if (arg1 != -28022) {
            field1894 = -57;
        }
    }

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "(I)V", line = 176)
    public final void method810(int arg0) {
        if (arg0 != -1) {
            this.method814((byte) 22, 82);
        }
        super.field2888 = (this.field1885 - -7) / 8;
        ++field1889;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "([BIII)V", line = 189)
    public final void method811(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field1895;
        for (int var5 = 0; var5 < arg3; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field2867[super.field2888++] + -this.field1891.method1881(255));
        }
        int var6 = 73 % ((62 - arg1) / 62);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 207)
    public static final void method812(Component arg0, byte arg1) {
        if (arg1 != -59) {
            field1894 = -44;
        }
        ++field1901;
        arg0.removeKeyListener(class406.field5896);
        arg0.removeFocusListener(class406.field5896);
        class444.field6490 = -1;
    }

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "(B)V", line = 221)
    public final void method813(byte arg0) {
        ++field1887;
        int var2 = -112 / ((60 - arg0) / 60);
        this.field1885 = super.field2888 * 8;
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(BI)I", line = 233)
    public final int method814(byte arg0, int arg1) {
        if (arg0 != -97) {
            field1884 = null;
        }
        ++field1890;
        return arg1 * 8 + -this.field1885;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V", line = 247)
    public class135(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "(B)V", line = 257)
    public static void method815(byte arg0) {
        if (arg0 != -126) {
            method812((Component) null, (byte) -94);
        }
        field1898 = null;
        field1884 = null;
    }

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "(I)I", line = 272)
    public final int method816(int arg0) {
        int var2 = -73 / (-arg0 / 43);
        ++field1893;
        return super.field2867[super.field2888++] + -this.field1891.method1881(255) & 255;
    }

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "(II)I", line = 285)
    public final int method817(int arg0, int arg1) {
        ++field1892;
        int var3 = this.field1885 >> 3;
        int var4 = -(7 & this.field1885) + 8;
        int var5 = 0;
        this.field1885 += arg1;
        int var6 = -36 / ((-52 - arg0) / 61);
        while (~arg1 < ~var4) {
            var5 += (class136.field1913[var4] & super.field2867[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 != var4) {
            var7 = (super.field2867[var3] >> -arg1 + var4 & class136.field1913[arg1]) + var5;
        } else {
            var7 = (super.field2867[var3] & class136.field1913[var4]) + var5;
        }
        return var7;
    }
}
