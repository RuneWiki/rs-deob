import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class361 extends class222 implements class68 {

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "S")
    private short field5535;

    @OriginalMember(owner = "client!gq", name = "ab", descriptor = "B")
    private byte field5555;

    @OriginalMember(owner = "client!gq", name = "U", descriptor = "B")
    private byte field5549;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "Z")
    private boolean field5542;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "Z")
    private boolean field5541;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "B")
    private byte field5540;

    @OriginalMember(owner = "client!gq", name = "Y", descriptor = "Z")
    private boolean field5553;

    @OriginalMember(owner = "client!gq", name = "cb", descriptor = "Lka;")
    private class334 field5557;

    @OriginalMember(owner = "client!gq", name = "T", descriptor = "Lia;")
    private class423 field5548;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "[Lcp;")
    public static class519[] field5531 = new class519[8];

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    public static int field5539 = -1;

    @OriginalMember(owner = "client!gq", name = "db", descriptor = "[[S")
    public static short[][] field5558 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!gq", name = "Q", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!gq", name = "R", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!gq", name = "S", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!gq", name = "V", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!gq", name = "W", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!gq", name = "X", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!gq", name = "Z", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!gq", name = "bb", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!gq", name = "eb", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)I", line = 7)
    public final int method1497(int arg0) {
        if (arg0 < 61) {
            this.method332(0);
        }
        ++field5530;
        return this.field5557 != null ? this.field5557.method77() : 0;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(ILqa;I)Lka;", line = 18)
    private final class334 method2302(int arg0, class165 arg1, int arg2) {
        ++field5543;
        if (this.field5557 != null && ~arg1.method775(this.field5557.method46(), arg0) == -1) {
            return this.field5557;
        } else {
            int var4 = 13 % ((-84 - arg2) / 41);
            class404 var5 = this.method2304(arg1, false, (byte) -45, arg0);
            return var5 == null ? null : var5.field6128;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLqa;)V", line = 40)
    public final void method333(boolean arg0, class165 arg1) {
        ++field5538;
        if (!arg0) {
            this.field5548 = null;
        }
        Object var3 = null;
        class423 var5;
        if (this.field5548 == null && this.field5553) {
            class404 var4 = this.method2304(arg1, true, (byte) -45, 262144);
            var5 = var4 == null ? null : var4.field6124;
        } else {
            var5 = this.field5548;
            this.field5548 = null;
        }
        if (var5 != null) {
            class335.method2169(var5, this.field5555, super.field3087, super.field3091, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z", line = 69)
    public final boolean method339(int arg0) {
        ++field5536;
        if (arg0 != 3583) {
            this.method330((class165) null, -5);
        }
        return this.field5553;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BIILqa;)Z", line = 81)
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        ++field5550;
        class334 var5 = this.method2302(131072, arg3, -127);
        if (var5 != null) {
            class14 var6 = arg3.method751();
            var6.method141(super.field3087, super.field3095, super.field3091);
            return var5.method68(arg2, arg1, var6, false);
        } else {
            return arg0 <= 121 ? false : false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lqa;I)V", line = 104)
    public final void method330(class165 arg0, int arg1) {
        ++field5533;
        if (arg1 == 14470) {
            Object var3 = null;
            class423 var5;
            if (this.field5548 == null && this.field5553) {
                class404 var4 = this.method2304(arg0, true, (byte) -45, 262144);
                var5 = var4 != null ? var4.field6124 : null;
            } else {
                var5 = this.field5548;
                this.field5548 = null;
            }
            if (var5 != null) {
                class235.method1562(var5, this.field5555, super.field3087, super.field3091, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)I", line = 143)
    public final int method338(int arg0) {
        if (arg0 <= 75) {
            this.field5535 = -102;
        }
        ++field5545;
        return 65535 & this.field5535;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILqa;)Lou;", line = 157)
    public final class437 method136(int arg0, class165 arg1) {
        ++field5552;
        if (this.field5557 == null) {
            return null;
        } else {
            class14 var3 = arg1.method751();
            var3.method141(super.field3101 + super.field3087, super.field3095, super.field3105 + super.field3091);
            class437 var4 = null;
            if (this.field5542) {
                var4 = class530.method3133(false, 1);
            }
            this.field5557.method53(var3, var4 == null ? null : var4.field6608[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V", line = 182)
    public static final void method2303(byte arg0) {
        class77.field1118 = -1;
        class430.field6552 = null;
        if (arg0 != -4) {
            method2303((byte) -48);
        }
        ++field5532;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILqa;I)Lka;", line = 194)
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        ++field5556;
        if (arg2 != 14221) {
            this.field5535 = -9;
        }
        return this.method2302(arg0, arg1, arg2 ^ -14322);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(ZLqa;)V", line = 210)
    public final void method135(boolean arg0, class165 arg1) {
        if (arg0) {
            this.field5542 = true;
        }
        ++field5547;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)I", line = 221)
    public final int method332(int arg0) {
        if (arg0 != 6359) {
            method2306(47, -44, 47);
        }
        ++field5537;
        return this.field5549;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lqa;ZBI)Lkj;", line = 233)
    private final class404 method2304(class165 arg0, boolean arg1, byte arg2, int arg3) {
        ++field5546;
        if (arg2 != -45) {
            this.method2304((class165) null, false, (byte) 86, 77);
        }
        class209 var5 = class432.field6575.method1872(this.field5535 & 65535, false);
        class23 var6;
        class23 var7;
        if (this.field5541) {
            var6 = class71.field988[this.field5555];
            var7 = class414.field6317[0];
        } else {
            var6 = class414.field6317[this.field5555];
            if (this.field5555 >= 3) {
                var7 = null;
            } else {
                var7 = class414.field6317[this.field5555 + 1];
            }
        }
        return var5.method1446(var7, this.field5549, super.field3095, arg3, 262144, arg0, arg1, this.field5540, var6, super.field3091, super.field3087);
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V", line = 263)
    public final void method334(int arg0) {
        if (this.field5557 != null) {
            this.field5557.method83();
        }
        ++field5551;
        if (arg0 != 29893) {
            this.method338(-105);
        }
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(Z)V", line = 284)
    public static void method2305(boolean arg0) {
        field5531 = null;
        if (!arg0) {
            field5558 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lqa;Lcd;IIIIZIIIII)V", line = 298)
    public class361(class165 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class92.method622(-29424, arg11, arg10));
        this.field5535 = (short) arg1.field2936;
        this.field5555 = (byte) arg2;
        this.field5549 = (byte) arg11;
        this.field5542 = arg1.field2930 != 0 && !arg6;
        this.field5541 = arg6;
        this.field5540 = (byte) arg10;
        super.field3087 = arg3;
        super.field3091 = arg5;
        this.field5553 = arg0.method786() && arg1.field2889 && !this.field5541 && ~class203.field2716.method552(-4, class378.field5771) != -1;
        class404 var13 = this.method2304(arg0, this.field5553, (byte) -45, 2048);
        if (var13 != null) {
            this.field5557 = var13.field6128;
            this.field5548 = var13.field6124;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z", line = 323)
    public static final boolean method2306(int arg0, int arg1, int arg2) {
        ++field5559;
        if (arg0 != -23496) {
            return true;
        } else {
            return (2048 & arg1) != 0;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)I", line = 336)
    public final int method336(int arg0) {
        ++field5554;
        return arg0 != -6130 ? 59 : this.field5540;
    }
}
