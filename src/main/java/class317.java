import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class317 extends class299 implements class425 {

    @OriginalMember(owner = "client!un", name = "x", descriptor = "Lfs;")
    public class349 field4626;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "Z")
    private boolean field4640;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "I")
    public static int field4628 = -1;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "Z")
    public static boolean field4638 = false;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "Z")
    public static boolean field4643 = false;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field4634 = new String[100];

    @OriginalMember(owner = "client!un", name = "S", descriptor = "F")
    public static float field4647 = 1024.0F;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!un", name = "R", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "[I")
    public static int[] field4644;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)I", line = 5)
    public final int method120(int arg0) {
        if (arg0 != 25940) {
            return -33;
        } else {
            ++field4630;
            return this.field4626.field5074;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(Lii;I)Leb;", line = 16)
    public final class382 method117(class405 arg0, int arg1) {
        ++field4633;
        class375 var3 = this.field4626.method2300(arg1, true, super.field4374, 1024, arg0, super.field4380, false);
        if (var3 == null) {
            return null;
        } else {
            class177 var4 = arg0.method1735();
            var4.method985(super.field4383 + super.field4374, super.field4377, super.field4381 + super.field4380);
            class382 var5 = null;
            if (this.field4640) {
                var5 = class397.method2554(1, ~arg1);
            }
            if (this.field4626.field5070 != null) {
                class352 var6 = this.field4626.field5070.method35();
                arg0.method1653(var3, var6, var4, var5 == null ? null : var5.field5543[0], 0);
            } else {
                var3.method1601(var4, var5 != null ? var5.field5543[0] : null, 0);
            }
            this.field4626.method2295(false, super.field4380 >> 7, true, super.field4374 >> 7, super.field4374 >> 7, var3, super.field4380 >> 7, arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)I", line = 49)
    public static final int method2138(int arg0, int arg1) {
        ++field4625;
        class373 var2 = class16.method97(arg1, (byte) 112);
        if (arg0 != 65536) {
            method2141(-67, (byte) -10);
        }
        int var3 = var2.field5431;
        int var4 = var2.field5420;
        int var5 = var2.field5427;
        int var6 = class125.field1753[-var4 + var5];
        return var6 & class191.field2561[var3] >> var4;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILii;Lps;)V", line = 70)
    public static final void method2139(int arg0, class405 arg1, class394 arg2) {
        class313.method2125(2, 0, 0, arg1, arg2);
        if (arg0 != 1068069799) {
            field4643 = false;
        }
        ++field4636;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILii;I)Ldc;", line = 81)
    public final class375 method111(int arg0, class405 arg1, int arg2) {
        if (arg2 < 27) {
            field4628 = -71;
        }
        ++field4631;
        return this.field4626.method2300(-1, false, 0, arg0, arg1, 0, false);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V", line = 93)
    public final void method112(byte arg0) {
        ++field4637;
        if (arg0 > -108) {
            this.method120(21);
        }
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V", line = 110)
    public static void method2140(int arg0) {
        if (arg0 == -31510) {
            field4634 = null;
            field4644 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BLii;)V", line = 121)
    public final void method102(byte arg0, class405 arg1) {
        this.field4626.method2290((byte) 74, arg1);
        if (arg0 == 76) {
            ++field4632;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lii;I)V", line = 133)
    public final void method118(class405 arg0, int arg1) {
        this.field4626.method2294(1, arg0);
        if (arg1 != 22295) {
            this.field4626 = null;
        }
        ++field4639;
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(I)I", line = 147)
    public final int method110(int arg0) {
        if (arg0 != 0) {
            this.method105(55);
        }
        ++field4627;
        return this.field4626.method2293((byte) 98);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)I", line = 158)
    public final int method121(int arg0) {
        if (arg0 != -15123) {
            this.field4640 = false;
        }
        ++field4635;
        return this.field4626.field5038;
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(I)I", line = 170)
    public final int method105(int arg0) {
        ++field4624;
        return arg0 > -4 ? -24 : this.field4626.field5059;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIZLii;)Z", line = 184)
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        ++field4641;
        class375 var5 = this.field4626.method2300(-1, false, super.field4374, 65536, arg3, super.field4380, arg2);
        if (var5 == null) {
            return false;
        } else {
            class177 var6 = arg3.method1735();
            var6.method985(super.field4383 + super.field4374, super.field4377, super.field4380 - -super.field4381);
            return var5.method1594(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)V", line = 206)
    public static final void method2141(int arg0, byte arg1) {
        class449.field6577 = 3;
        class372.field5415 = -1;
        if (arg1 != -4) {
            method2139(-66, (class405) null, (class394) null);
        }
        ++field4645;
        class319.field4665 = arg0;
        class249.field3365 = 100;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lii;Lge;IIIIIIIZIIII)V", line = 220)
    public class317(class405 arg0, class104 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class362.method2366(arg3, (byte) -114, arg2));
        this.field4626 = new class349(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field4640 = ~arg1.field1455 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Z", line = 230)
    public final boolean method114(int arg0) {
        if (arg0 != 30582) {
            this.method111(-41, (class405) null, 43);
        }
        ++field4642;
        return this.field4626.method2297(-111);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILii;)V", line = 242)
    public final void method103(int arg0, class405 arg1) {
        ++field4629;
        if (arg0 <= 102) {
            this.method117((class405) null, 77);
        }
        class375 var3 = this.field4626.method2300(-1, true, super.field4374, 131072, arg1, super.field4380, false);
        if (var3 != null) {
            this.field4626.method2295(false, super.field4380 >> 7, false, super.field4374 >> 7, super.field4374 >> 7, var3, super.field4380 >> 7, arg1);
        }
    }
}
