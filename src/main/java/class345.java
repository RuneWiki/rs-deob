import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class345 extends class599 implements class670 {

    @OriginalMember(owner = "client!dda", name = "L", descriptor = "Z")
    private boolean field4495;

    @OriginalMember(owner = "client!dda", name = "w", descriptor = "S")
    private short field4481;

    @OriginalMember(owner = "client!dda", name = "z", descriptor = "B")
    private byte field4484;

    @OriginalMember(owner = "client!dda", name = "T", descriptor = "B")
    private byte field4503;

    @OriginalMember(owner = "client!dda", name = "I", descriptor = "B")
    private byte field4492;

    @OriginalMember(owner = "client!dda", name = "E", descriptor = "Z")
    private boolean field4488;

    @OriginalMember(owner = "client!dda", name = "P", descriptor = "Z")
    private boolean field4499;

    @OriginalMember(owner = "client!dda", name = "K", descriptor = "Lw;")
    private class269 field4494;

    @OriginalMember(owner = "client!dda", name = "U", descriptor = "Lba;")
    private class350 field4504;

    @OriginalMember(owner = "client!dda", name = "Z", descriptor = "Lpr;")
    public static class407 field4509 = new class407(92, 14);

    @OriginalMember(owner = "client!dda", name = "x", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!dda", name = "y", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!dda", name = "A", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!dda", name = "D", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!dda", name = "F", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!dda", name = "G", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!dda", name = "H", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!dda", name = "J", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!dda", name = "M", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!dda", name = "O", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!dda", name = "Q", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!dda", name = "R", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!dda", name = "S", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!dda", name = "V", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!dda", name = "W", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!dda", name = "X", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!dda", name = "Y", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!dda", name = "bb", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!dda", name = "ab", descriptor = "Ljo;")
    public static class303 field4510;

    @OriginalMember(owner = "client!dda", name = "N", descriptor = "Lgr;")
    private class396 field4497;

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Loa;Lbfa;IIIIZIIIII)V", line = 3)
    public class345(class635 arg0, class335 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class680.method3798(116, arg10, arg11));
        this.field4495 = arg1.field4407 != 0 && !arg6;
        this.field4481 = (short) arg1.field4324;
        this.field4484 = (byte) arg11;
        this.field4503 = (byte) arg10;
        this.field4492 = (byte) arg2;
        super.field8515 = arg3;
        this.field4488 = arg6;
        super.field8506 = arg5;
        this.field4499 = arg0.method316() && arg1.field4349 && !this.field4488 && class601.field8530.method1317((byte) -120, class150.field1711) != 0;
        class671 var13 = this.method1920(this.field4499, (byte) -41, 2048, arg0);
        if (var13 != null) {
            this.field4494 = var13.field9533;
            this.field4504 = var13.field9536;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Loa;I)V", line = 34)
    public final void method456(class635 arg0, int arg1) {
        ++field4489;
        Object var3 = null;
        class269 var5;
        if (this.field4494 == null && this.field4499) {
            class671 var4 = this.method1920(true, (byte) -41, 262144, arg0);
            var5 = var4 != null ? var4.field9533 : null;
        } else {
            var5 = this.field4494;
            this.field4494 = null;
        }
        if (arg1 > 97) {
            if (var5 != null) {
                class461.method2625(var5, this.field4492, super.field8515, super.field8506, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILoa;)Lgr;", line = 61)
    public final class396 method450(int arg0, class635 arg1) {
        ++field4501;
        int var3 = 21 / ((arg0 - 47) / 34);
        if (this.field4497 == null) {
            this.field4497 = class426.method2298(super.field8515, this.method1922(arg1, -15760, 0), 12409, super.field8506, super.field8508);
        }
        return this.field4497;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Loa;B)V", line = 79)
    public final void method446(class635 arg0, byte arg1) {
        ++field4486;
        if (arg1 >= -126) {
            this.method446((class635) null, (byte) -15);
        }
        Object var3 = null;
        class269 var5;
        if (this.field4494 == null && this.field4499) {
            class671 var4 = this.method1920(true, (byte) -41, 262144, arg0);
            var5 = var4 != null ? var4.field9533 : null;
        } else {
            var5 = this.field4494;
            this.field4494 = null;
        }
        if (var5 != null) {
            class533.method3038(var5, this.field4492, super.field8515, super.field8506, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)I", line = 108)
    public final int method443(byte arg0) {
        ++field4482;
        int var2 = 47 % ((-82 - arg0) / 37);
        return this.field4484;
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(Loa;I)V", line = 120)
    public final void method451(class635 arg0, int arg1) {
        if (arg1 == 31055) {
            ++field4511;
        }
    }

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "(B)V", line = 130)
    public static void method1918(byte arg0) {
        field4510 = null;
        int var1 = -26 / ((-79 - arg0) / 33);
        field4509 = null;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V", line = 142)
    public final void method452(int arg0) {
        if (arg0 != 29877) {
            this.field4492 = 69;
        }
        if (this.field4504 != null) {
            this.field4504.method888();
        }
        ++field4505;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BI)V", line = 156)
    public static final void method1919(byte arg0, int arg1) {
        ++field4490;
        if (~class433.field5705 != ~arg1) {
            class399.field5338 = class349.field4567 = class390.field5212[arg1];
            class295.method1678((byte) -66);
            class451.field6202 = new int[class399.field5338][class349.field4567];
            class115.field1339 = new int[class399.field5338][class349.field4567];
            class4.field30 = new int[4][class399.field5338 >> 3][class349.field4567 >> 3];
            for (int var2 = 0; var2 < 4; ++var2) {
                class475.field6919[var2] = class289.method1633(class349.field4567, true, class399.field5338);
            }
            if (arg0 <= -44) {
                class242.field3146 = new byte[4][class399.field5338][class349.field4567];
                class313.method1769(4, class349.field4567, 111, class399.field5338);
                class195.method1131(16624, class349.field4567 >> 3, class399.field5338 >> 3, class453.field6284);
                class433.field5705 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)I", line = 188)
    public final int method447(byte arg0) {
        if (arg0 != -91) {
            this.field4484 = 93;
        }
        ++field4483;
        return this.field4503;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZBILoa;)Lau;", line = 202)
    private final class671 method1920(boolean arg0, byte arg1, int arg2, class635 arg3) {
        ++field4498;
        if (arg1 != -41) {
            this.field4503 = -6;
        }
        class335 var5 = class195.field2339.method3729(this.field4481 & 65535, (byte) 109);
        class137 var6;
        class137 var7;
        if (this.field4488) {
            var6 = class591.field8415[this.field4492];
            var7 = class275.field3477[0];
        } else {
            var6 = class275.field3477[this.field4492];
            if (this.field4492 < 3) {
                var7 = class275.field3477[this.field4492 + 1];
            } else {
                var7 = null;
            }
        }
        return var5.method1882(arg3, var6, super.field8506, super.field8508, this.field4484, super.field8515, arg0, arg2, this.field4503, (byte) -72, var7);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)I", line = 232)
    public final int method444(byte arg0) {
        ++field4508;
        int var2 = 10 / ((arg0 - 7) / 46);
        return this.field4481 & 65535;
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)[Lgs;", line = 243)
    public static final class41[] method1921(int arg0) {
        ++field4485;
        return arg0 != 18570 ? null : new class41[] { class553.field7884, class680.field9644, class223.field2811, class156.field1739, class137.field1564, class463.field6433 };
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IILoa;I)Z", line = 254)
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        ++field4507;
        class350 var5 = this.method1922(arg2, -15760, 131072);
        if (arg1 != 1) {
            this.field4504 = null;
        }
        if (var5 != null) {
            class389 var6 = arg2.method297();
            var6.method228(super.field8515, super.field8508, super.field8506);
            return var5.method910(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Loa;II)Lba;", line = 276)
    private final class350 method1922(class635 arg0, int arg1, int arg2) {
        if (arg1 != -15760) {
            field4510 = null;
        }
        ++field4491;
        if (this.field4504 != null && arg0.method312(this.field4504.method902(), arg2) == 0) {
            return this.field4504;
        } else {
            class671 var4 = this.method1920(false, (byte) -41, arg2, arg0);
            return var4 == null ? null : var4.field9536;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z", line = 296)
    public final boolean method454(int arg0) {
        ++field4500;
        return arg0 <= 49 ? true : this.field4499;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Loa;I)Lok;", line = 318)
    public final class231 method442(class635 arg0, int arg1) {
        ++field4487;
        if (this.field4504 == null) {
            return null;
        } else {
            class389 var3 = arg0.method297();
            var3.method228(super.field8519 + super.field8515, super.field8508, super.field8518 + super.field8506);
            class231 var4 = null;
            if (this.field4495) {
                var4 = class526.method2993(1, arg1 + 32671);
            }
            this.field4504.method904(var3, var4 == null ? null : var4.field2947[0], arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)I", line = 346)
    public final int method1923(boolean arg0) {
        if (!arg0) {
            return 30;
        } else {
            ++field4502;
            return this.field4504 == null ? 0 : this.field4504.method864();
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IILoa;)Lba;", line = 358)
    public final class350 method455(int arg0, int arg1, class635 arg2) {
        ++field4506;
        return arg1 > -20 ? null : this.method1922(arg2, -15760, arg0);
    }
}
