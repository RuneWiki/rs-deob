import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class128 extends class177 {

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "Z")
    public boolean field2109 = false;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    private int field2113 = 0;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    private int field2121 = 0;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    private int field2119 = -32768;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public int field2103;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    private int field2108;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "Ln;")
    private class271 field2122;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lve;")
    public static class255 field2102 = class87.method607(94, ")1o");

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lve;")
    private static class255 field2105 = class87.method607(61, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Lve;")
    public static class255 field2110 = field2105;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "Lve;")
    public static class255 field2124 = class87.method607(49, "::serverjs5drop");

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "[Z")
    public static boolean[] field2114 = new boolean[112];

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 4)
    public static final void method947(int arg0) {
        if (arg0 >= -58) {
            field2102 = (class255) null;
        }
        class231 var1 = class107.field1810;
        synchronized (class107.field1810) {
            class235.field3871 = class43.field672;
            class265.field4491++;
            class2.field31 = class221.field3727;
            class67.field994 = class82.field1343;
            class119.field1994 = class181.field2937;
            class184.field2973 = class77.field1258;
            class115.field1953 = class266.field4513;
            class206.field3542 = class93.field1594;
            class181.field2937 = 0;
        }
        field2107++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILce;Z)V", line = 37)
    public static final void method948(int arg0, int arg1, int arg2, class236 arg3, boolean arg4) {
        field2115++;
        if (arg4) {
            method948(115, -35, 71, (class236) null, false);
        }
        if (class136.field2272 >= 400) {
            return;
        }
        if (arg3.field3893 != null) {
            arg3 = arg3.method1628(116);
        }
        if (arg3 == null || !arg3.field3888) {
            return;
        }
        class255 var5 = arg3.field3882;
        if (arg3.field3926 != 0) {
            var5 = class3.method14(new class255[] { var5, class111.method846(class276.field4742.field4074, 50, arg3.field3926), class199.field3422, class210.field3581, class215.method1532(arg3.field3926, !arg4), class172.field2844 }, (byte) -55);
        }
        if (class72.field1182 == 1) {
            class186.method1298((short) 38, class3.method14(new class255[] { class123.field2044, class25.field382, var5 }, (byte) -56), arg0, (byte) 67, (long) arg1, class33.field527, arg2);
            class231.field3839++;
        } else if (!class42.field653) {
            class255[] var6 = arg3.field3924;
            class16.field227++;
            if (class212.field3618) {
                var6 = class248.method1713(false, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class245.field4123 != 0 || !var6[var7].method1779(-112, class275.field4729))) {
                        class231.field3823++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 8;
                        }
                        if (var7 == 1) {
                            var8 = 47;
                        }
                        if (var7 == 2) {
                            var8 = 41;
                        }
                        if (var7 == 3) {
                            var8 = 1;
                        }
                        if (var7 == 4) {
                            var8 = 16;
                        }
                        class186.method1298(var8, class3.method14(new class255[] { class206.field3540, var5 }, (byte) -121), arg0, (byte) 67, (long) arg1, var6[var7], arg2);
                    }
                }
            }
            if (class245.field4123 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1779(6, class275.field4729)) {
                        class17.field257++;
                        short var10 = 0;
                        if (arg3.field3926 > class276.field4742.field4074) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 8;
                        }
                        if (var9 == 1) {
                            var11 = 47;
                        }
                        if (var9 == 2) {
                            var11 = 41;
                        }
                        if (var9 == 3) {
                            var11 = 1;
                        }
                        if (var9 == 4) {
                            var11 = 16;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class186.method1298(var11, class3.method14(new class255[] { class206.field3540, var5 }, (byte) -88), arg0, (byte) 67, (long) arg1, var6[var9], arg2);
                    }
                }
            }
            class186.method1298((short) 1006, class3.method14(new class255[] { class206.field3540, var5 }, (byte) -85), arg0, (byte) 67, (long) arg1, class196.field3226, arg2);
        } else if ((class41.field645 & 0x2) == 2) {
            class210.field3592++;
            class186.method1298((short) 59, class3.method14(new class255[] { class254.field4285, class25.field382, var5 }, (byte) -78), arg0, (byte) 67, (long) arg1, class82.field1342, arg2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V", line = 182)
    public final void method949(int arg0, int arg1) {
        field2120++;
        if (arg0 != 41) {
            this.field2106 = 56;
        }
        if (this.field2109) {
            return;
        }
        this.field2113 += arg1;
        while (this.field2113 > this.field2122.field4680[this.field2121]) {
            this.field2113 -= this.field2122.field4680[this.field2121];
            this.field2121++;
            if (this.field2121 >= this.field2122.field4667.length) {
                this.field2109 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)Lof;", line = 215)
    private final class227 method950(byte arg0) {
        field2117++;
        class87 var2 = class232.method1611(this.field2108, (byte) -119);
        if (arg0 >= -83) {
            method948(-119, 82, 55, (class236) null, true);
        }
        class227 var3;
        if (this.field2109) {
            var3 = var2.method609(-1, -57);
        } else {
            var3 = var2.method609(this.field2121, -27);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIIJ)V", line = 252)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2104++;
        class227 var11 = this.method950((byte) -113);
        if (var11 != null) {
            var11.method168(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2119 = var11.method176();
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()I", line = 269)
    public final int method176() {
        field2123++;
        return this.field2119;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIII)V", line = 319)
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2116 = arg4;
        this.field2103 = arg1;
        this.field2118 = arg3;
        this.field2112 = arg2;
        this.field2108 = arg0;
        this.field2106 = arg5 + arg6;
        int var8 = class232.method1611(this.field2108, (byte) -104).field1420;
        if (var8 == -1) {
            this.field2109 = true;
        } else {
            this.field2109 = false;
            this.field2122 = class181.method1269(99, var8);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V", line = 304)
    public static void method951(byte arg0) {
        field2114 = null;
        field2102 = null;
        if (arg0 == 3) {
            field2124 = null;
            field2110 = null;
            field2105 = null;
        }
    }
}
