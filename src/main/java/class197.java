import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class197 extends class249 implements class246 {

    @OriginalMember(owner = "client!pw", name = "I", descriptor = "Lej;")
    public class438 field2579;

    @OriginalMember(owner = "client!pw", name = "E", descriptor = "Z")
    private boolean field2575;

    @OriginalMember(owner = "client!pw", name = "v", descriptor = "Lvt;")
    public static class344 field2566 = new class344("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!pw", name = "M", descriptor = "[I")
    public static int[] field2583 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!pw", name = "s", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!pw", name = "t", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!pw", name = "u", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!pw", name = "w", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!pw", name = "x", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!pw", name = "y", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!pw", name = "B", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!pw", name = "C", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!pw", name = "D", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!pw", name = "F", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!pw", name = "G", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!pw", name = "H", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!pw", name = "J", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!pw", name = "K", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!pw", name = "L", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!pw", name = "A", descriptor = "Lud;")
    private class119 field2571;

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lqa;Lbu;IIIIIZII)V")
    public class197(class167 arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field1677, arg1.field1735, arg1.field1667);
        this.field2579 = new class438(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field2575 = ~arg1.field1749 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        int var3 = 81 / ((-30 - arg0) / 63);
        ++field2577;
        class521 var4 = this.field2579.method2548(super.field3122, (byte) 107, true, false, super.field3126, 2048, arg1);
        if (var4 == null) {
            return null;
        } else {
            class105 var5 = arg1.method964();
            var5.method361(super.field3126, super.field3132, super.field3122);
            class541 var6 = null;
            if (this.field2575) {
                var6 = class296.method1818(16711680, 1);
            }
            if (this.field2579.field5950 == null) {
                var4.method1595(var5, var6 != null ? var6.field7564[0] : null, 0);
            } else {
                class174 var7 = this.field2579.field5950.method1864();
                arg1.method947(var4, var7, var5, var6 != null ? var6.field7564[0] : null, 0);
            }
            if (this.field2571 == null) {
                this.field2571 = class82.method459(var4, super.field3122, super.field3132, super.field3126, (byte) -101);
            } else {
                class504.method2818(this.field2571, super.field3126, var4, super.field3132, super.field3122, (byte) 105);
            }
            int var8 = super.field3126 >> 9;
            int var9 = super.field3122 >> 9;
            this.field2579.method2555(var4, var9, true, var8, var9, var8, -1, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(B)Z")
    public static final boolean method1261(byte arg0) {
        if (arg0 <= 106) {
            return true;
        } else {
            ++field2576;
            return class126.field1564;
        }
    }

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        int var2 = 84 / ((arg0 - -4) / 41);
        ++field2574;
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        ++field2570;
        int var3 = -86 % ((4 - arg0) / 47);
        return this.field2571;
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)I")
    public final int method52(int arg0) {
        ++field2582;
        if (arg0 != -17817) {
            this.method58(-11, (class167) null);
        }
        return this.field2579.field5966;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lqa;I)V")
    public final void method61(class167 arg0, int arg1) {
        ++field2573;
        if (arg1 != -9785) {
            this.field2579 = null;
        }
        this.field2579.method2552((byte) 11, arg0);
    }

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        ++field2564;
        if (arg0 != -1) {
            this.field2571 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        ++field2563;
        if (arg0 != -29185) {
            this.method59((byte) -120, (class167) null);
        }
        return this.field2579.field5949;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IILqa;)Lr;")
    public final class521 method53(int arg0, int arg1, class167 arg2) {
        ++field2581;
        if (arg1 != 30307) {
            field2583 = null;
        }
        return this.field2579.method2548(0, (byte) 11, false, false, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public final void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6) {
        if (arg1 < 67) {
            field2566 = null;
        }
        ++field2565;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "(I)V")
    public static void method1262(int arg0) {
        field2566 = null;
        if (arg0 != 22) {
            method1261((byte) -60);
        }
        field2583 = null;
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        ++field2580;
        class521 var3 = this.field2579.method2548(super.field3122, (byte) 118, true, true, super.field3126, 262144, arg0);
        if (var3 != null) {
            int var4 = super.field3126 >> 9;
            int var5 = super.field3122 >> 9;
            this.field2579.method2555(var3, var5, false, var4, var5, var4, ~arg1, arg0);
        }
        if (arg1 != 0) {
            this.method56((byte) -13);
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        if (arg0 == 52) {
            ++field2578;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)Z")
    public final boolean method55(byte arg0) {
        int var2 = -41 % ((-20 - arg0) / 32);
        ++field2567;
        return this.field2579.method2553((byte) -73);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        ++field2568;
        class521 var5 = this.field2579.method2548(super.field3122, (byte) -70, false, false, super.field3126, 131072, arg2);
        if (var5 == null) {
            return false;
        } else {
            if (arg3 >= -35) {
                this.method54(-114, -25, 88, (class167) null, -72, false, (class239) null);
            }
            class105 var6 = arg2.method964();
            var6.method361(super.field3126, super.field3132, super.field3122);
            return var5.method1598(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != 1901) {
            return -35;
        } else {
            ++field2572;
            return this.field2579.field5980;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILqa;)V")
    public final void method62(int arg0, class167 arg1) {
        this.field2579.method2544(arg1, true);
        if (arg0 != 22132) {
            method1261((byte) -25);
        }
        ++field2569;
    }
}
