import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class388 extends class360 implements class231 {

    @OriginalMember(owner = "client!ul", name = "Z", descriptor = "B")
    private byte field5793;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "Z")
    private boolean field5776;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "S")
    private short field5781;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "Z")
    private boolean field5760;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "B")
    private byte field5783;

    @OriginalMember(owner = "client!ul", name = "Y", descriptor = "Z")
    private boolean field5792;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "B")
    private byte field5774;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "Z")
    private boolean field5762;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "Lk;")
    private class88 field5782;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Lr;")
    public class519 field5764;

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "Lbv;")
    public static class567 field5787 = new class567("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");

    @OriginalMember(owner = "client!ul", name = "X", descriptor = "[F")
    public static float[] field5791 = new float[16384];

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "[F")
    public static float[] field5790 = new float[16384];

    @OriginalMember(owner = "client!ul", name = "bb", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!ul", name = "cb", descriptor = "[I")
    public static int[] field5796;

    @OriginalMember(owner = "client!ul", name = "ab", descriptor = "Liu;")
    public static class517 field5794;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!ul", name = "V", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "Lkm;")
    private class120 field5772;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field5790[var2] = (float) Math.sin((double) var2 * var0);
            field5791[var2] = (float) Math.cos((double) var2 * var0);
        }
        field5795 = -1;
        field5796 = new int[32];
        field5794 = new class517(69, -2);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(ILqa;)Lkm;", line = 4)
    public final class120 method260(int arg0, class167 arg1) {
        ++field5788;
        if (arg0 > -50) {
            this.method268(true, (class167) null);
        }
        if (this.field5772 == null) {
            this.field5772 = class577.method3298(this.method2352(arg1, 0, 0), super.field5108, super.field5109, (byte) 89, super.field5111);
        }
        return this.field5772;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILqa;)V", line = 21)
    public final void method255(int arg0, class167 arg1) {
        ++field5775;
        int var3 = -107 % ((arg0 - -46) / 42);
        Object var4 = null;
        class88 var6;
        if (this.field5782 == null && this.field5762) {
            class380 var5 = this.method2353(true, 88, 262144, arg1);
            var6 = var5 == null ? null : var5.field5591;
        } else {
            var6 = this.field5782;
            this.field5782 = null;
        }
        if (var6 != null) {
            class371.method2255(var6, this.field5774, super.field5108, super.field5109, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLqa;)V", line = 48)
    public final void method268(boolean arg0, class167 arg1) {
        ++field5771;
        Object var3 = null;
        class88 var5;
        if (this.field5782 == null && this.field5762) {
            class380 var4 = this.method2353(true, 95, 262144, arg1);
            var5 = var4 == null ? null : var4.field5591;
        } else {
            var5 = this.field5782;
            this.field5782 = null;
        }
        if (!arg0) {
            this.method262(-49);
        }
        if (var5 != null) {
            class246.method1566(var5, this.field5774, super.field5108, super.field5109, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLqa;II)Z", line = 75)
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        if (arg0 != 29) {
            this.method2352((class167) null, -32, 8);
        }
        ++field5786;
        class519 var5 = this.method2352(arg1, 131072, 0);
        if (var5 != null) {
            class105 var6 = arg1.method637();
            var6.method884(super.field5108, super.field5111, super.field5109);
            return var5.method1399(arg2, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)Z", line = 97)
    public final boolean method262(int arg0) {
        ++field5770;
        if (arg0 != -21131) {
            field5796 = null;
        }
        return this.field5762;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lqa;B)V", line = 108)
    public final void method266(class167 arg0, byte arg1) {
        ++field5779;
        if (arg1 != -40) {
            this.method262(107);
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(Z)I", line = 118)
    public final int method2349(boolean arg0) {
        ++field5773;
        if (!arg0) {
            field5791 = null;
        }
        return this.field5764 != null ? this.field5764.method1382() / 4 : 15;
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V", line = 129)
    public static void method2350(int arg0) {
        field5790 = null;
        field5794 = null;
        if (arg0 != -1) {
            method2350(97);
        }
        field5796 = null;
        field5791 = null;
        field5787 = null;
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(B)V", line = 143)
    public static final void method2351(byte arg0) {
        ++field5766;
        if (~class23.field324 != -1) {
            try {
                if (++class98.field1708 > 2000) {
                    if (client.field8770 != null) {
                        client.field8770.method2743((byte) 8);
                        client.field8770 = null;
                    }
                    if (class617.field8731 >= 1) {
                        class551.field7801 = -5;
                        class23.field324 = 0;
                        return;
                    }
                    class23.field324 = 1;
                    class98.field1708 = 0;
                    class552.field7820.field3408 = !class552.field7820.field3408;
                    ++class617.field8731;
                }
                if (class23.field324 == 1) {
                    class384.field5720 = class270.field3976.method347(2471, class552.field7820.field3411, class552.field7820.method1517(-7005));
                    class23.field324 = 2;
                }
                if (~class23.field324 == -3) {
                    if (class384.field5720.field4739 == 2) {
                        throw new IOException();
                    }
                    if (class384.field5720.field4739 != 1) {
                        return;
                    }
                    client.field8770 = class449.method2656(5000, 95, (Socket) class384.field5720.field4737);
                    class384.field5720 = null;
                    client.field8770.method2733(3, class127.field2088.field3913, 0, class127.field2088.field3952);
                    class23.field324 = 4;
                }
                if (~class23.field324 == -5) {
                    if (!client.field8770.method2739(1, 544)) {
                        return;
                    }
                    client.field8770.method2741(-1, 0, 1, class52.field761.field3952);
                    int var1 = class52.field761.field3952[0] & 255;
                    if (~var1 != -22) {
                        class23.field324 = 0;
                        class551.field7801 = var1;
                        client.field8770.method2743((byte) -22);
                        client.field8770 = null;
                        return;
                    }
                    class23.field324 = 5;
                }
                if (class23.field324 == 5) {
                    if (!client.field8770.method2739(1, 544)) {
                        return;
                    }
                    client.field8770.method2741(-1, 0, 1, class52.field761.field3952);
                    class574.field8180 = new String[class52.field761.field3952[0] & 255];
                    class23.field324 = 6;
                }
                if (class23.field324 != 6) {
                    int var3 = -20 % ((arg0 - 64) / 51);
                } else if (client.field8770.method2739(class574.field8180.length * 8, 544)) {
                    class52.field761.field3913 = 0;
                    client.field8770.method2741(-1, 0, class574.field8180.length * 8, class52.field761.field3952);
                    for (int var2 = 0; ~var2 > ~class574.field8180.length; ++var2) {
                        class574.field8180[var2] = class555.method3108(class52.field761.method1690(false), 0);
                    }
                    class551.field7801 = 21;
                    class23.field324 = 0;
                    client.field8770.method2743((byte) -128);
                    client.field8770 = null;
                }
            } catch (IOException var4) {
                if (client.field8770 != null) {
                    client.field8770.method2743((byte) -111);
                    client.field8770 = null;
                }
                if (class617.field8731 >= 1) {
                    class23.field324 = 0;
                    class551.field7801 = -4;
                } else {
                    class23.field324 = 1;
                    ++class617.field8731;
                    class98.field1708 = 0;
                    class552.field7820.field3408 = !class552.field7820.field3408;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V", line = 286)
    public final void method867(int arg0) {
        ++field5777;
        this.field5792 = false;
        if (this.field5764 != null) {
            this.field5764.method1405(-65537 & this.field5764.method1373());
        }
        if (arg0 <= 12) {
            this.method263((byte) 13, (class167) null, 116, 61);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)Z", line = 302)
    public final boolean method868(boolean arg0) {
        ++field5763;
        return arg0 ? false : this.field5792;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lqa;Ltk;IIIIIZIIIIIIZ)V", line = 318)
    public class388(class167 arg0, class370 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5317 == 1, class35.method312(arg12, 119, arg13));
        this.field5793 = (byte) arg13;
        this.field5776 = ~arg1.field5276 != -1 && !arg7;
        this.field5781 = (short) arg1.field5335;
        this.field5760 = arg7;
        this.field5783 = (byte) arg12;
        this.field5792 = arg14;
        this.field5774 = (byte) arg3;
        this.field5762 = arg0.method594() && arg1.field5353 && !this.field5760 && class202.field2854.method3143(class646.field9388, 0) != 0;
        int var16 = 2048;
        if (this.field5792) {
            var16 |= 65536;
        }
        class380 var17 = this.method2353(this.field5762, 114, var16, arg0);
        if (var17 != null) {
            this.field5782 = var17.field5591;
            this.field5764 = var17.field5589;
            if (this.field5792) {
                this.field5764 = this.field5764.method765((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)I", line = 350)
    public final int method1175(boolean arg0) {
        ++field5769;
        if (arg0) {
            this.method266((class167) null, (byte) -49);
        }
        return this.field5764 == null ? 0 : this.field5764.method1390();
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I", line = 361)
    public final int method269(int arg0) {
        ++field5784;
        if (arg0 != -13265) {
            this.method2353(false, 66, -40, (class167) null);
        }
        return this.field5783;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lqa;II)Lr;", line = 374)
    private final class519 method2352(class167 arg0, int arg1, int arg2) {
        ++field5761;
        if (this.field5764 != null && arg0.method560(this.field5764.method1373(), arg1) == 0) {
            return this.field5764;
        } else {
            class380 var4 = this.method2353(false, arg2 ^ 116, arg1, arg0);
            if (arg2 != 0) {
                return null;
            } else {
                return var4 == null ? null : var4.field5589;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lqa;I)Lbi;", line = 408)
    public final class465 method267(class167 arg0, int arg1) {
        ++field5789;
        if (this.field5764 == null) {
            return null;
        } else {
            if (arg1 != 2) {
                this.method254(-68, (class167) null, true);
            }
            class105 var3 = arg0.method637();
            var3.method884(super.field5108, super.field5111, super.field5109);
            class465 var4 = null;
            if (this.field5776) {
                var4 = class603.method3437((byte) -22, 1);
            }
            this.field5764.method1379(var3, var4 != null ? var4.field6707[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)I", line = 435)
    public final int method264(int arg0) {
        ++field5778;
        return arg0 != -25792 ? -12 : 65535 & this.field5781;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V", line = 447)
    public final void method270(int arg0) {
        int var2 = 33 / ((arg0 - -1) / 47);
        if (this.field5764 != null) {
            this.field5764.method1357();
        }
        ++field5780;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I", line = 461)
    public final int method258(byte arg0) {
        if (arg0 != -36) {
            method2350(-72);
        }
        ++field5768;
        return this.field5793;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZIILqa;)Lep;", line = 474)
    private final class380 method2353(boolean arg0, int arg1, int arg2, class167 arg3) {
        ++field5765;
        if (arg1 < 77) {
            this.method263((byte) 33, (class167) null, -127, -80);
        }
        class370 var5 = class552.field7819.method2890(0, 65535 & this.field5781);
        class542 var6;
        class542 var7;
        if (!this.field5760) {
            var6 = class587.field8363[this.field5774];
            if (this.field5774 < 3) {
                var7 = class587.field8363[this.field5774 + 1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class73.field1360[this.field5774];
            var7 = class587.field8363[0];
        }
        return var5.method2246(92, this.field5783 != 11 ? this.field5783 : 10, var6, var7, ~this.field5783 == -12 ? this.field5793 + 4 : this.field5793, super.field5108, arg0, super.field5109, arg2, arg3, super.field5111);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILqa;Z)Lr;", line = 506)
    public final class519 method254(int arg0, class167 arg1, boolean arg2) {
        ++field5767;
        return arg2 ? null : this.method2352(arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BZILqa;IILcea;)V", line = 529)
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        ++field5785;
        if (arg6 instanceof class265) {
            class265 var8 = (class265) arg6;
            if (this.field5764 != null && var8.field3845 != null) {
                this.field5764.method1363(var8.field3845, arg4, arg2, arg5, arg1);
            }
        } else if (arg6 instanceof class388) {
            class388 var9 = (class388) arg6;
            if (this.field5764 != null && var9.field5764 != null) {
                this.field5764.method1363(var9.field5764, arg4, arg2, arg5, arg1);
            }
        }
        if (arg0 != -84) {
            this.method255(83, (class167) null);
        }
    }
}
