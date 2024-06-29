import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class146 extends class469 implements class534 {

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "Lmu;")
    public class201 field2254;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "Z")
    private boolean field2250;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "Lqv;")
    public static class316 field2245 = new class316(107, 7);

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "Lem;")
    private class154 field2248;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "[Lo;")
    public static class24[] field2262;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)I")
    public final int method560(int arg0) {
        if (arg0 != -29863) {
            this.method561((byte) 24);
        }
        ++field2251;
        return this.field2254.field3090;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lqa;B)Lem;")
    public final class154 method562(class167 arg0, byte arg1) {
        if (arg1 >= -117) {
            this.field2248 = null;
        }
        ++field2252;
        return this.field2248;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        ++field2246;
        class336 var5 = this.field2254.method1361(131072, false, arg3, 92, super.field6806, false, super.field6807);
        if (var5 == null) {
            return false;
        } else {
            class15 var6 = arg3.method312();
            if (arg2 <= 42) {
                field2245 = null;
            }
            var6.method47(super.field6811 + super.field6807, super.field6801, super.field6806 - -super.field6812);
            return var5.method1131(arg1, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)I")
    public final int method559(byte arg0) {
        ++field2253;
        return arg0 < 3 ? -125 : this.field2254.field3066;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLqa;)V")
    public final void method557(byte arg0, class167 arg1) {
        this.field2254.method1362(arg1, -12);
        int var3 = -118 % ((arg0 - 13) / 59);
        ++field2247;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILqa;)Lnj;")
    public final class166 method554(int arg0, class167 arg1) {
        ++field2263;
        class336 var3 = this.field2254.method1361(2048, true, arg1, 114, super.field6806, false, super.field6807);
        if (var3 == null) {
            return null;
        } else {
            class15 var4 = arg1.method312();
            var4.method47(super.field6807 - -super.field6811, super.field6801, super.field6812 + super.field6806);
            class166 var5 = null;
            if (arg0 != 0) {
                this.method550(46, (class167) null, -72);
            }
            if (this.field2250) {
                var5 = class392.method2363(3317, 1);
            }
            if (this.field2254.field3070 == null) {
                var3.method1142(var4, var5 != null ? var5.field2497[0] : null, 0);
            } else {
                class300 var6 = this.field2254.field3070.method819();
                arg1.method332(var3, var6, var4, var5 != null ? var5.field2497[0] : null, 0);
            }
            if (this.field2248 == null) {
                this.field2248 = class332.method2104(super.field6801, var3, super.field6806, super.field6807, -111);
            } else {
                class192.method1311(super.field6807, 118, super.field6801, var3, this.field2248, super.field6806);
            }
            int var7 = super.field6807 >> 7;
            int var8 = super.field6806 >> 7;
            this.field2254.method1365(var3, var7, true, var8, var7, var8, arg1, (byte) 46);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILqa;I)Lka;")
    public final class336 method550(int arg0, class167 arg1, int arg2) {
        ++field2260;
        return arg0 != -14322 ? null : this.field2254.method1361(arg2, false, arg1, 105, 0, false, 0);
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
    public static void method1039(int arg0) {
        field2245 = null;
        if (arg0 != 0) {
            method1040(-66);
        }
        field2262 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)I")
    public final int method561(byte arg0) {
        ++field2257;
        return arg0 != -85 ? -93 : this.field2254.field3089;
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)I")
    public static final int method1040(int arg0) {
        ++field2256;
        class167 var1 = class76.field1256;
        int var2 = -103 % ((-54 - arg0) / 51);
        boolean var3 = false;
        if (~class74.field1211 != -1) {
            Canvas var4 = new Canvas();
            var4.setSize(100, 100);
            var3 = true;
            var1 = class167.method1196(0, (class16) null, (class411) null, var4, -32568, 0);
        }
        long var5 = class165.method1188((byte) 26);
        for (int var7 = 0; ~var7 > -10001; ++var7) {
            var1.method259(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var8 = (int) (-var5 + class165.method1188((byte) 26));
        var1.method1193(1, 0, 0, 100, 100, -16777216);
        if (var3) {
            var1.method1197((byte) -48);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public final void method548(int arg0) {
        int var2 = 79 % ((arg0 - -37) / 34);
        ++field2258;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lqa;I)V")
    public final void method551(class167 arg0, int arg1) {
        if (arg1 >= 62) {
            this.field2254.method1364(arg0, (byte) 79);
            ++field2255;
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)Z")
    public final boolean method547(int arg0) {
        int var2 = -11 % ((arg0 - -73) / 39);
        ++field2259;
        return this.field2254.method1366(-20486);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lqa;Lku;IIIIIZIIIIII)V")
    public class146(class167 arg0, class261 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class477.method2824(true, arg12, arg11));
        this.field2254 = new class201(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field2250 = ~arg1.field3872 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lqa;B)V")
    public final void method552(class167 arg0, byte arg1) {
        ++field2243;
        class336 var3 = this.field2254.method1361(262144, true, arg0, 106, super.field6806, false, super.field6807);
        if (var3 != null) {
            int var4 = super.field6807 >> 7;
            int var5 = super.field6806 >> 7;
            this.field2254.method1365(var3, var4, false, var5, var4, var5, arg0, (byte) 72);
        }
        if (arg1 > -119) {
            method1040(15);
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)I")
    public final int method910(int arg0) {
        if (arg0 != 8) {
            return 55;
        } else {
            ++field2249;
            return this.field2254.method1359(0);
        }
    }
}
