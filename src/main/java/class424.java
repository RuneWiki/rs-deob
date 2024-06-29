import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class424 extends class400 implements class56 {

    @OriginalMember(owner = "client!ur", name = "A", descriptor = "Lrg;")
    public class381 field6177;

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "Z")
    private boolean field6187;

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "Z")
    public static boolean field6183 = true;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field6188 = 0;

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "Luc;")
    public static class51 field6173 = new class51(64);

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!ur", name = "C", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!ur", name = "E", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!ur", name = "I", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "[I")
    public static int[] field6180;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)I")
    public final int method116(int arg0) {
        ++field6178;
        if (arg0 != 24186) {
            field6188 = 12;
        }
        return this.field6177.field5562;
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (arg0 != 2) {
            method2664((byte) -18);
        }
        ++field6182;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(B)V")
    public static void method2664(byte arg0) {
        field6180 = null;
        field6173 = null;
        if (arg0 < 2) {
            method2665(-92);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILtj;II)Z")
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        ++field6191;
        class257 var5 = this.field6177.method2477(false, arg1, super.field5863, false, super.field5860, 117, 65536);
        if (var5 == null) {
            return false;
        } else {
            class118 var6 = arg1.method519();
            var6.method274(super.field5863, super.field5857, super.field5860);
            return arg3 != 0 ? false : var5.method1698(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ltj;I)Lri;")
    public final class372 method118(class298 arg0, int arg1) {
        ++field6176;
        class257 var3 = this.field6177.method2477(false, arg0, super.field5863, true, super.field5860, arg1 ^ 18590, 1024);
        if (var3 == null) {
            return null;
        } else if (arg1 != 18630) {
            return null;
        } else {
            class118 var4 = arg0.method519();
            var4.method274(super.field5863, super.field5857, super.field5860);
            class372 var5 = null;
            if (this.field6187) {
                var5 = class384.method2492(1, (byte) 40);
            }
            if (this.field6177.field5588 != null) {
                class305 var6 = this.field6177.field5588.method2597();
                arg0.method453(var3, var6, var4, var5 == null ? null : var5.field5481[0], 0);
            } else {
                var3.method1661(var4, var5 != null ? var5.field5481[0] : null, 0);
            }
            this.field6177.method2484(super.field5863 >> 7, true, arg0, var3, super.field5860 >> 7, super.field5860 >> 7, 5915, super.field5863 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        ++field6171;
        return arg0 < 119;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILtj;BIZLkm;I)V")
    public final void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6) {
        int var8 = -61 / ((46 - arg2) / 45);
        ++field6189;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ltj;IB)Lqb;")
    public final class257 method117(class298 arg0, int arg1, byte arg2) {
        if (arg2 < 42) {
            field6188 = -109;
        }
        ++field6174;
        return this.field6177.method2477(false, arg0, 0, false, 0, -22, arg1);
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (arg0 < 26) {
            field6188 = 71;
        }
        ++field6172;
    }

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "(I)V")
    public static final void method2665(int arg0) {
        ++field6179;
        for (class316 var1 = (class316) class41.field625.method1575(arg0 + 1); var1 != null; var1 = (class316) class41.field625.method1573((byte) -128)) {
            if (var1.field4619 > 0) {
                --var1.field4619;
            }
            if (var1.field4619 == 0) {
                if (~var1.field4632 > -1 || class63.method556(var1.field4631, var1.field4632, (byte) -101)) {
                    class20.method145(var1.field4632, var1.field4622, 2, var1.field4635, var1.field4621, -1, var1.field4630, var1.field4628, var1.field4631);
                    var1.method2632(true);
                }
            } else {
                if (var1.field4629 > 0) {
                    --var1.field4629;
                }
                if (var1.field4629 == 0 && var1.field4628 >= 1 && var1.field4630 >= 1 && ~(class351.field5217 + -2) <= ~var1.field4628 && var1.field4630 <= class143.field1815 + -2 && (~var1.field4625 > -1 || class63.method556(var1.field4627, var1.field4625, (byte) -101))) {
                    class20.method145(var1.field4625, var1.field4622, 2, var1.field4633, var1.field4621, -1, var1.field4630, var1.field4628, var1.field4627);
                    var1.field4629 = -1;
                    if (var1.field4632 == var1.field4625 && ~var1.field4632 == 0) {
                        var1.method2632(true);
                    } else if (var1.field4632 == var1.field4625 && var1.field4635 == var1.field4633 && var1.field4631 == var1.field4627) {
                        var1.method2632(true);
                    }
                }
            }
        }
        if (arg0 != -1) {
            method2664((byte) 36);
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Ltj;Lqr;IIIIIIIZI)V")
    public class424(class298 arg0, class212 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class159.method1055(arg3, false, arg2));
        this.field6177 = new class381(arg0, arg1, arg2, arg3, arg4, arg5, super.field5863, super.field5860, arg9, arg10);
        this.field6187 = ~arg1.field2932 != -1;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)I")
    public final int method122(byte arg0) {
        ++field6175;
        if (arg0 > -103) {
            this.field6187 = false;
        }
        return this.field6177.field5589;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(ILtj;)V")
    public final void method108(int arg0, class298 arg1) {
        ++field6190;
        if (arg0 < -8) {
            this.field6177.method2478(-18021, arg1);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I")
    public final int method121(int arg0) {
        ++field6185;
        if (arg0 != 28024) {
            field6188 = 23;
        }
        return this.field6177.field5582;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILtj;)V")
    public final void method111(int arg0, class298 arg1) {
        if (arg0 >= -68) {
            field6180 = null;
        }
        ++field6184;
        this.field6177.method2485(arg1, 116);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)Z")
    public final boolean method125(int arg0) {
        if (arg0 > -112) {
            return true;
        } else {
            ++field6181;
            return this.field6177.method2482(true);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLtj;)V")
    public final void method126(byte arg0, class298 arg1) {
        if (arg0 != 50) {
            field6183 = false;
        }
        ++field6186;
        class257 var3 = this.field6177.method2477(true, arg1, super.field5863, true, super.field5860, 121, 131072);
        if (var3 != null) {
            this.field6177.method2484(super.field5863 >> 7, false, arg1, var3, super.field5860 >> 7, super.field5860 >> 7, 5915, super.field5863 >> 7);
        }
    }
}
