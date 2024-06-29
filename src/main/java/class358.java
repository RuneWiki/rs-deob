import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class358 {

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    private int field5154 = 0;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lfg;")
    private class128 field5155 = null;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    private int field5160 = 0;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    private int field5166 = 0;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lpg;")
    private class333 field5156;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lrk;")
    private class339 field5146;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "[Ltt;")
    private class246[] field5161;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Lqm;")
    public class280 field5151;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Lrb;")
    public static class283 field5150 = new class283(18, -1);

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field5165 = -1;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field5167 = -1;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Ldk;")
    public static class421 field5162;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lor;II)I")
    public static final int method2130(class173 arg0, int arg1, int arg2) {
        if (arg1 != Integer.MIN_VALUE) {
            method2135(null, -34);
        }
        field5164++;
        return -1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZIZII)V")
    public final void method2131(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        boolean var7 = arg3 & this.field5156.method564();
        field5149++;
        int var8 = -57 / ((-arg0 - 64) / 33);
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg4 = arg5;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg1) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field5166 != arg2) {
            if (this.field5166 != 0) {
                this.field5161[this.field5166 & Integer.MAX_VALUE].method739(114);
            }
            if (arg2 != 0) {
                this.field5161[Integer.MAX_VALUE & arg2].method743(arg1, (byte) 121);
                this.field5161[arg2 & Integer.MAX_VALUE].method740(arg1, 26715);
                this.field5161[arg2 & Integer.MAX_VALUE].method744((byte) 53, arg5, arg4);
            }
            this.field5166 = arg2;
            this.field5155 = null;
            this.field5160 = arg4;
            this.field5154 = arg5;
        } else if (this.field5166 != 0) {
            this.field5161[Integer.MAX_VALUE & this.field5166].method740(arg1, 26715);
            if (this.field5154 != arg5 || this.field5160 != arg4) {
                this.field5161[Integer.MAX_VALUE & this.field5166].method744((byte) 53, arg5, arg4);
                this.field5160 = arg4;
                this.field5154 = arg5;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lfg;IB)Z")
    public final boolean method2132(class128 arg0, int arg1, byte arg2) {
        field5159++;
        if (arg2 <= 116) {
            return false;
        } else if (this.field5166 == 0) {
            return false;
        } else {
            if (this.field5155 != arg0) {
                this.field5161[Integer.MAX_VALUE & this.field5166].method742(4, arg0, arg1);
                this.field5155 = arg0;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static final void method2133(byte arg0) {
        class17.field275.method1858(class63.field914.method2508(4), (byte) -20);
        field5158++;
        class17.field275.method1858(class306.field4155.method2508(4), (byte) -118);
        class17.field275.method1858(class503.field7358.method2508(4), (byte) -20);
        class17.field275.method1858(class468.field6768.method2508(arg0 ^ 0xFFFFFFE9), (byte) -99);
        class17.field275.method1858(class481.field6956.method2508(4), (byte) -13);
        class17.field275.method1858(class103.field1618.method2508(arg0 + 23), (byte) -75);
        class17.field275.method1858(class437.field6309.method2508(4), (byte) -24);
        class17.field275.method1858(class91.field1457.method2508(arg0 + 23), (byte) -93);
        class17.field275.method1858(class509.field7453.method2508(4), (byte) -34);
        class17.field275.method1858(class515.field7535.method2508(arg0 ^ 0xFFFFFFE9), (byte) -25);
        class17.field275.method1858(class387.field5570.method2508(arg0 ^ 0xFFFFFFE9), (byte) -110);
        class17.field275.method1858(class206.field2965.method2508(arg0 ^ 0xFFFFFFE9), (byte) -102);
        class17.field275.method1858(field5162.method2508(4), (byte) -6);
        class17.field275.method1858(class300.field4107.method2508(arg0 + 23), (byte) -55);
        class17.field275.method1858(class383.field5505.method2508(4), (byte) -123);
        class17.field275.method1858(class297.field4083.method2508(4), (byte) -118);
        class17.field275.method1858(class77.field1099.method2508(arg0 + 23), (byte) -71);
        class17.field275.method1858(class457.field6656.method2508(arg0 ^ 0xFFFFFFE9), (byte) -111);
        class17.field275.method1858(class63.field923.method2508(4), (byte) -72);
        if (arg0 != -19) {
            return;
        }
        class17.field275.method1858(class40.field597.method2508(4), (byte) -58);
        class17.field275.method1858(class286.field3880.method2508(4), (byte) -123);
        class17.field275.method1858(class96.field1552.method2508(4), (byte) -106);
        class17.field275.method1858(class215.field3057.method2508(4), (byte) -69);
        class17.field275.method1858(class315.field4271.method2508(4), (byte) -13);
        class17.field275.method1858(class392.field5667.method2508(4), (byte) -25);
        class17.field275.method1858(class119.field1862.method2508(arg0 + 23), (byte) -69);
        class17.field275.method1858(class455.field6646.method2508(4), (byte) -121);
        class17.field275.method1858(class355.field5129.method2508(arg0 + 23), (byte) -112);
        class17.field275.method1858(class411.field5838.method2508(arg0 + 23), (byte) -44);
        class17.field275.method1858(class310.field4218.method2508(arg0 ^ 0xFFFFFFE9), (byte) -58);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method2134(boolean arg0) {
        field5150 = null;
        if (!arg0) {
            field5162 = null;
        }
        field5162 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ldc;I)V")
    public static final void method2135(class16 arg0, int arg1) {
        field5157++;
        if (arg0 instanceof class209) {
            class209 var2 = (class209) arg0;
            if (var2.field2976 != null) {
                class371.method2215(arg1 - 2147483647, var2, class81.field1158.field6279 != var2.field6279);
            }
        } else if (arg0 instanceof class487) {
            class487 var3 = (class487) arg0;
            class292.method1694(true, var3, class81.field1158.field6279 != var3.field6279);
        }
        if (arg1 != Integer.MAX_VALUE) {
            method2138((byte) -15);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)Z")
    public final boolean method2136(int arg0, byte arg1) {
        int var3 = 8 % ((-arg1 - 2) / 55);
        field5147++;
        return this.field5161[arg0].method738((byte) 100);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBI)I")
    public static final int method2137(int arg0, byte arg1, int arg2) {
        if (arg1 != 1) {
            method2137(104, (byte) 69, 99);
        }
        field5152++;
        return arg0 == 1 || arg0 == 3 ? class185.field2742[arg2 & 0x3] : class274.field3714[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
    public static final void method2138(byte arg0) {
        if (arg0 != -11) {
            method2133((byte) -99);
        }
        field5153++;
        class166.field2543.method2764(-769);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lpg;)V")
    public class358(class333 arg0) {
        this.field5156 = arg0;
        this.field5146 = new class339(arg0);
        this.field5161 = new class246[10];
        this.field5161[1] = new class169(arg0);
        this.field5161[2] = new class203(arg0, this.field5146);
        this.field5161[4] = new class317(arg0, this.field5146);
        this.field5161[5] = new class402(arg0, this.field5146);
        this.field5161[6] = new class90(arg0);
        this.field5161[7] = new class188(arg0);
        this.field5161[3] = this.field5151 = new class280(arg0);
        this.field5161[8] = new class383(arg0, this.field5146);
        this.field5161[9] = new class422(arg0, this.field5146);
        if (!this.field5161[8].method738((byte) 109)) {
            this.field5161[8] = this.field5161[4];
        }
        if (!this.field5161[9].method738((byte) 114)) {
            this.field5161[9] = this.field5161[8];
        }
    }
}
