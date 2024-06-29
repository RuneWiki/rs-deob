import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class41 extends class394 implements class68 {

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "Lgs;")
    public class33 field602;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Z")
    private boolean field608;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Liv;")
    public static class65 field603 = new class65("runescape", 0);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field604 = 2;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "Lpa;")
    public static class254 field605 = new class254(4, 2);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "Luu;")
    public static class191 field612;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "Ldk;")
    public static class359 field606;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "[[Lga;")
    public static class282[][] field614;

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lqa;Lcd;IIIIIZII)V", line = 4)
    public class41(class165 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field2929, arg1.field2911, arg1.field2887);
        this.field602 = new class33(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field608 = ~arg1.field2930 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqa;I)V", line = 13)
    public final void method330(class165 arg0, int arg1) {
        if (arg1 != 14470) {
            field606 = null;
        }
        this.field602.method282(false, arg0);
        ++field594;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V", line = 24)
    public static final void method331(boolean arg0) {
        ++field596;
        class535.field7863.method1745(-93);
        if (arg0) {
            class296.field4379.method1745(-83);
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)I", line = 38)
    public final int method332(int arg0) {
        ++field610;
        if (arg0 != 6359) {
            this.method332(118);
        }
        return this.field602.field486;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLqa;)V", line = 53)
    public final void method333(boolean arg0, class165 arg1) {
        this.field602.method283(arg1, -118);
        ++field598;
        if (!arg0) {
            this.method333(false, (class165) null);
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V", line = 64)
    public final void method334(int arg0) {
        if (arg0 == 29893) {
            ++field600;
        }
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V", line = 74)
    public static void method335(int arg0) {
        if (arg0 != 14145) {
            method335(-12);
        }
        field605 = null;
        field612 = null;
        field614 = null;
        field606 = null;
        field603 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILa;IIILqa;Z)V", line = 88)
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        ++field597;
        if (arg2 > -4) {
            field614 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)I", line = 100)
    public final int method336(int arg0) {
        ++field593;
        return arg0 != -6130 ? -116 : this.field602.field492;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(ZLqa;)V", line = 112)
    public final void method135(boolean arg0, class165 arg1) {
        ++field607;
        class334 var3 = this.field602.method280((byte) -25, super.field6031, true, super.field6022, true, 262144, arg1);
        if (arg0) {
            this.method337(-94, (class165) null, 80);
        }
        if (var3 != null) {
            int var4 = super.field6022 >> 7;
            int var5 = super.field6031 >> 7;
            this.field602.method285(var5, var4, var5, arg1, false, var3, 0, var4);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILqa;I)Lka;", line = 137)
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        if (arg2 != 14221) {
            return null;
        } else {
            ++field590;
            return this.field602.method280((byte) -25, 0, false, 0, false, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)I", line = 153)
    public final int method338(int arg0) {
        if (arg0 <= 75) {
            return -13;
        } else {
            ++field613;
            return this.field602.field475;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)Z", line = 164)
    public final boolean method176(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field595;
            return false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 180)
    public final void method175(int arg0) {
        if (arg0 == 0) {
            ++field599;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILqa;)Lou;", line = 191)
    public final class437 method136(int arg0, class165 arg1) {
        ++field601;
        class334 var3 = this.field602.method280((byte) -25, super.field6031, false, super.field6022, true, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class14 var4 = arg1.method751();
            var4.method141(super.field6022, super.field6025, super.field6031);
            class437 var5 = null;
            if (this.field608) {
                var5 = class530.method3133(false, 1);
            }
            if (this.field602.field474 != null) {
                class137 var6 = this.field602.field474.method1533();
                arg1.method840(var3, var6, var4, var5 == null ? null : var5.field6608[0], 0);
            } else {
                var3.method53(var4, var5 != null ? var5.field6608[0] : null, 0);
            }
            int var7 = super.field6022 >> 7;
            int var8 = super.field6031 >> 7;
            this.field602.method285(var8, var7, var8, arg1, true, var3, arg0 + arg0, var7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BIILqa;)Z", line = 231)
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        ++field592;
        class334 var5 = this.field602.method280((byte) -25, super.field6031, false, super.field6022, false, 131072, arg3);
        if (var5 == null) {
            return false;
        } else if (arg0 < 121) {
            return false;
        } else {
            class14 var6 = arg3.method751();
            var6.method141(super.field6022, super.field6025, super.field6031);
            return var5.method68(arg2, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Z", line = 251)
    public final boolean method339(int arg0) {
        if (arg0 != 3583) {
            field611 = 121;
        }
        ++field609;
        return this.field602.method278(arg0 ^ -3584);
    }
}
