import java.awt.FontMetrics;
import java.awt.Graphics;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class85 extends class61 {

    @OriginalMember(owner = "client!oa", name = "Rb", descriptor = "Lmc;")
    public static class75 field2093 = class30.method234(true, " )2> @lre@");

    @OriginalMember(owner = "client!oa", name = "Lb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2087 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!oa", name = "ic", descriptor = "I")
    public static int field2110 = 0;

    @OriginalMember(owner = "client!oa", name = "jc", descriptor = "Lmc;")
    private static class75 field2111 = class30.method234(true, "Password: ");

    @OriginalMember(owner = "client!oa", name = "dc", descriptor = "Lmc;")
    public static class75 field2105 = field2111;

    @OriginalMember(owner = "client!oa", name = "Kb", descriptor = "I")
    private int field2086;

    @OriginalMember(owner = "client!oa", name = "Mb", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!oa", name = "Nb", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!oa", name = "Ob", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!oa", name = "Pb", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!oa", name = "Sb", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!oa", name = "Tb", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!oa", name = "Ub", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!oa", name = "Vb", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!oa", name = "Wb", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!oa", name = "Xb", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!oa", name = "Zb", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!oa", name = "bc", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!oa", name = "cc", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!oa", name = "gc", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!oa", name = "ac", descriptor = "Lud;")
    public static class121 field2102;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Lja;")
    public static class55 field2085;

    @OriginalMember(owner = "client!oa", name = "Qb", descriptor = "Ljb;")
    private class56 field2092;

    @OriginalMember(owner = "client!oa", name = "fc", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2107;

    @OriginalMember(owner = "client!oa", name = "ec", descriptor = "Z")
    public static boolean field2106;

    @OriginalMember(owner = "client!oa", name = "hc", descriptor = "[I")
    public static int[] field2109;

    @OriginalMember(owner = "client!oa", name = "Yb", descriptor = "[[[B")
    public static byte[][][] field2100;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(I)V", line = 4)
    public final void method702(int arg0) {
        if (arg0 > 39) {
            super.field1556 = (this.field2086 + 7) / 8;
            ++field2104;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILmc;Lmc;III)V", line = 18)
    public static final void method703(int arg0, int arg1, class75 arg2, class75 arg3, int arg4, int arg5, int arg6) {
        if (~class100.field2585 > -501) {
            if (arg2.method621(-19198) > 0) {
                class43.field1036[class100.field2585] = class69.method586(new class75[] { arg3, class5.field71, arg2 }, (byte) 123);
            } else {
                class43.field1036[class100.field2585] = arg3;
            }
            class1.field28[class100.field2585] = arg5;
            class38.field914[class100.field2585] = arg4;
            class126.field3073[class100.field2585] = arg0;
            class86.field2125[class100.field2585] = arg6;
            ++class100.field2585;
        }
        int var7 = 65 / ((arg1 - -15) / 51);
        ++field2089;
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "(I)V", line = 47)
    public static final void method704(int arg0) {
        ++field2096;
        try {
            if (arg0 == 20427) {
                Graphics var1 = class108.field2738.getGraphics();
                class104.field2638.method403(4, (byte) 75, var1, 4);
            }
        } catch (Exception var2) {
            class108.field2738.repaint();
        }
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(II)I", line = 65)
    public final int method705(int arg0, int arg1) {
        ++field2108;
        return arg0 != 10 ? 63 : arg1 * 8 + -this.field2086;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V", line = 76)
    public class85(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(I)V", line = 80)
    public static void method706(int arg0) {
        field2087 = null;
        field2105 = null;
        field2100 = null;
        field2093 = null;
        field2111 = null;
        int var1 = 21 % ((arg0 - 61) / 50);
        field2109 = null;
        field2102 = null;
        field2107 = null;
        field2085 = null;
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "(II)V", line = 103)
    public final void method707(int arg0, int arg1) {
        ++field2095;
        super.field1577[super.field1556++] = (byte) (arg1 + this.field2092.method457(0));
        int var3 = -86 % ((-65 - arg0) / 42);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z[I)V", line = 120)
    public final void method708(boolean arg0, int[] arg1) {
        this.field2092 = new class56(arg1);
        ++field2097;
        if (arg0) {
            this.method705(-122, -9);
        }
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "(II)I", line = 134)
    public final int method709(int arg0, int arg1) {
        ++field2091;
        if (arg0 > -125) {
            field2107 = null;
        }
        int var3 = this.field2086 >> 3;
        int var4 = -(this.field2086 & 7) + 8;
        this.field2086 += arg1;
        int var5 = 0;
        while (~arg1 < ~var4) {
            var5 += (class45.field1100[var4] & super.field1577[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field1577[var3] >> -arg1 + var4 & class45.field1100[arg1]) + var5;
        } else {
            var6 = (class45.field1100[var4] & super.field1577[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIII[B)V", line = 178)
    public static final void method710(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        ++field2098;
        int var5 = 107 % ((arg2 - 36) / 40);
        if (class37.field887 != null) {
            if (~class91.field2233 > -1) {
                if (~class74.field1848 != -1) {
                    class59.field1535 = arg0;
                    class55.field1390 = arg4;
                    class43.field1035 = arg3;
                } else {
                    class1.method1(arg0, (byte) -72, arg3, arg4);
                }
            } else {
                class68.field1728 = arg1;
                if (~class91.field2233 != -1) {
                    int var6 = class104.method858((byte) -115, class91.field2233);
                    int var7 = var6 - class31.field697;
                    class74.field1848 = (var7 - -3600) / arg1;
                    if (class74.field1848 < 1) {
                        class74.field1848 = 1;
                    }
                } else {
                    class74.field1848 = 1;
                }
                class59.field1535 = arg0;
                class43.field1035 = arg3;
                class55.field1390 = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "(I)V", line = 224)
    public final void method711(int arg0) {
        if (arg0 != -30816) {
            method713(-68, 126, 56, 17, -111);
        }
        ++field2103;
        this.field2086 = super.field1556 * 8;
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "(I)V", line = 243)
    public static final void method712(int arg0) {
        if (class70.field1795 != null) {
            class70.field1795.method756(-42);
            class70.field1795 = null;
        }
        if (arg0 != 10) {
            field2110 = 50;
        }
        ++field2099;
        class82.method691(-107);
        class107.field2679.method232();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class110.field2783[var1].method40(-100);
        }
        System.gc();
        class117.method931(553, 10);
        class70.field1776 = 0;
        class130.field3172 = -1;
        class71.method600(10721);
        class17.method121(10, arg0 ^ -9417);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)I", line = 274)
    public static final int method713(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2090;
        if (arg0 != -61323856) {
            return -22;
        } else {
            int var5 = 65536 - class49.field1194[arg2 * 1024 / arg3] >> 1;
            return ((-var5 + 65536) * arg1 >> 16) + (arg4 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "(B)I", line = 288)
    public final int method714(byte arg0) {
        ++field2094;
        if (arg0 != -91) {
            field2100 = null;
        }
        return super.field1577[super.field1556++] + -this.field2092.method457(0) & 255;
    }
}
