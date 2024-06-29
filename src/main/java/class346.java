import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class346 extends class456 {

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    private int field5270 = -1;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "Lsh;")
    public static class472 field5277 = new class472(16, 6);

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field5284 = 0;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public static int field5287 = -1;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "Lct;")
    public static class285 field5285 = new class285(3, -1);

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "Lsh;")
    public static class472 field5289 = new class472(75, 10);

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public int field5271;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public int field5273;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "Z")
    public static boolean field5283;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "[I")
    public int[] field5276;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "[I")
    public static int[] field5288;

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 3)
    public class346() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([[[Lke;I)V", line = 9)
    public static final void method2131(class337[][][] arg0, int arg1) {
        ++field5281;
        if (arg1 >= -85) {
            field5289 = null;
        }
        for (int var2 = 0; ~arg0.length < ~var2; ++var2) {
            class337[][] var3 = arg0[var2];
            for (int var4 = 0; var3.length > var4; ++var4) {
                for (int var5 = 0; var5 < var3[var4].length; ++var5) {
                    class337 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field5063 instanceof class218) {
                            ((class218) var6.field5063).method247(false);
                        }
                        if (var6.field5058 instanceof class218) {
                            ((class218) var6.field5058).method247(false);
                        }
                        if (var6.field5050 instanceof class218) {
                            ((class218) var6.field5050).method247(false);
                        }
                        if (var6.field5044 instanceof class218) {
                            ((class218) var6.field5044).method247(false);
                        }
                        if (var6.field5047 instanceof class218) {
                            ((class218) var6.field5047).method247(false);
                        }
                        for (class448 var7 = var6.field5054; var7 != null; var7 = var7.field6340) {
                            class305 var8 = var7.field6343;
                            if (var8 instanceof class218) {
                                ((class218) var8).method247(false);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)Z", line = 82)
    public final boolean method2132(int arg0) {
        if (arg0 <= 24) {
            field5277 = null;
        }
        ++field5278;
        if (this.field5276 != null) {
            return true;
        } else if (this.field5270 >= 0) {
            class368 var2 = class182.field2693 < 0 ? class368.method2272(class105.field1480, this.field5270) : class368.method2265(class105.field1480, class182.field2693, this.field5270);
            var2.method2267();
            this.field5276 = var2.method2276();
            this.field5273 = var2.field5561;
            this.field5271 = var2.field5559;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZ)V", line = 110)
    public static final void method2133(int arg0, int arg1, int arg2, boolean arg3) {
        if (~arg0 == -1) {
            ++class191.field2924;
            class378.method2320(class310.field4687, (byte) 119);
        }
        ++field5274;
        if (~arg0 == -2) {
            class378.method2320(class155.field2163, (byte) 119);
            ++class198.field2973;
        }
        class230.field3390.method2624((byte) -3, class68.field922 + arg2);
        class230.field3390.method2607(!class296.field4445.method1100(false, 82) ? 0 : 1, (byte) 110);
        class230.field3390.method2624((byte) -3, class468.field6588 + arg1);
        class105.field1482 = arg3;
        class106.field1483 = arg1;
        class37.field492 = arg2;
        class228.method1482((byte) -52);
    }

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)[Lj;", line = 137)
    public static final class240[] method2134(int arg0) {
        if (arg0 != -1) {
            return null;
        } else {
            ++field5282;
            return new class240[] { class229.field3369, class161.field2221, class332.field4966, class306.field4556, class262.field3900, class493.field6935, class331.field4958, class327.field4920, class72.field969, class220.field3247, class193.field2936, class253.field3631, class150.field2115, class459.field6502, class252.field3623 };
        }
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)V", line = 148)
    public final void method626(int arg0) {
        ++field5286;
        super.method626(arg0);
        this.field5276 = null;
    }

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "(I)V", line = 162)
    public static void method2135(int arg0) {
        field5285 = null;
        field5277 = null;
        int var1 = -108 / ((-21 - arg0) / 42);
        field5288 = null;
        field5289 = null;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)V", line = 182)
    public static final void method2136(int arg0, int arg1) {
        class38.field528 = arg0;
        ++field5279;
        class400 var2 = class475.field6651;
        synchronized (class475.field6651) {
            class475.field6651.method2401((byte) -85);
        }
        if (arg1 != -6768) {
            method2135(90);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBLre;)V", line = 200)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        ++field5280;
        if (arg1 == 55) {
            if (~arg0 == -1) {
                this.field5270 = arg2.method2631(2530);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)[[I", line = 213)
    public int[][] method212(int arg0, int arg1) {
        ++field5272;
        int[][] var3 = super.field6468.method1090(-2, arg1);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field6468.field2227 && this.method2132(arg0 ^ 40)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = (class487.field6842 == this.field5271 ? arg1 : this.field5271 * arg1 / class487.field6842) * this.field5273;
                if (~class156.field2169 != ~this.field5273) {
                    for (int var8 = 0; ~var8 > ~class156.field2169; ++var8) {
                        int var9 = this.field5273 * var8 / class156.field2169;
                        int var10 = this.field5276[var7 - -var9];
                        var6[var8] = class412.method2463(255, var10) << 4;
                        var5[var8] = class412.method2463(var10 >> 4, 4080);
                        var4[var8] = class412.method2463(16711680, var10) >> 12;
                    }
                } else {
                    for (int var11 = 0; class156.field2169 > var11; ++var11) {
                        int var12 = this.field5276[var7++];
                        var6[var11] = class412.method2463(var12, 255) << 4;
                        var5[var11] = class412.method2463(4080, var12 >> 4);
                        var4[var11] = class412.method2463(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)I", line = 283)
    public final int method2137(int arg0) {
        ++field5275;
        return arg0 != 1 ? 62 : this.field5270;
    }
}
