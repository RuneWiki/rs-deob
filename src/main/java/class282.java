import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class282 extends class303 implements class149 {

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "B")
    private byte field4530;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "Z")
    private boolean field4524;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "B")
    private byte field4521;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "S")
    private short field4526;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Z")
    private boolean field4518;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "B")
    private byte field4515;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "Z")
    private boolean field4538;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "Lid;")
    private class348 field4522;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Las;")
    private class84 field4519;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "Lbd;")
    public static class37 field4527 = new class37();

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field4535 = 0;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "[I")
    public static int[] field4532 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "[I")
    public static int[] field4541 = new int[3];

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Lmo;")
    public static class447 field4531;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Le;B)V", line = 3)
    public final void method199(class312 arg0, byte arg1) {
        ++field4529;
        Object var3 = null;
        class84 var5;
        if (this.field4519 == null && this.field4538) {
            class230 var4 = this.method1926(131072, (byte) 50, arg0, true);
            var5 = var4 != null ? var4.field3834 : null;
        } else {
            var5 = this.field4519;
            this.field4519 = null;
        }
        if (arg1 == -22) {
            if (var5 != null) {
                class120.method866(var5, this.field4530, super.field4787, super.field4786, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)I", line = 38)
    public final int method183(byte arg0) {
        ++field4513;
        int var2 = 80 / ((49 - arg0) / 47);
        return this.field4521;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)I", line = 49)
    public final int method197(boolean arg0) {
        ++field4517;
        return !arg0 ? -23 : this.field4526 & 65535;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)V", line = 61)
    public static void method1922(byte arg0) {
        field4531 = null;
        if (arg0 != 107) {
            method1922((byte) 38);
        }
        field4532 = null;
        field4527 = null;
        field4541 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Le;IB)Lid;", line = 87)
    public final class348 method200(class312 arg0, int arg1, byte arg2) {
        ++field4537;
        if (arg2 != -52) {
            this.method1925(93);
        }
        return this.method1924(121, arg0, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Le;Z)Lum;", line = 98)
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field4534;
        if (this.field4522 == null) {
            return null;
        } else {
            class435 var3 = arg0.method713();
            if (!arg1) {
                this.method195(-28);
            }
            var3.method1984(super.field4787 - -super.field4801, super.field4791, super.field4794 + super.field4786);
            class306 var4 = null;
            if (this.field4524) {
                var4 = class203.method1443(-78, 1);
            }
            this.field4522.method26(var3, var4 != null ? var4.field4856[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIIIB)V", line = 127)
    public static final void method1923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        ++field4523;
        if (class178.method1225(47, arg2)) {
            client.method1153(class203.field3266[arg2], -1, arg1, arg5, arg6, arg4, arg8, arg0, arg7, arg3);
            if (arg9 != -79) {
                method1923(-75, 96, -82, 52, -49, 120, 94, -108, -76, (byte) 25);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)I", line = 141)
    public final int method195(int arg0) {
        ++field4520;
        return arg0 != 3076 ? -96 : this.field4515;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Le;B)V", line = 153)
    public final void method196(class312 arg0, byte arg1) {
        if (arg1 > -66) {
            this.field4518 = false;
        }
        ++field4536;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Le;Lfa;IIIIZIIIII)V", line = 165)
    public class282(class312 arg0, class127 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class173.method1211(arg10, true, arg11));
        this.field4530 = (byte) arg2;
        super.field4787 = (short) arg3;
        super.field4786 = (short) arg5;
        this.field4524 = arg1.field2021 != 0 && !arg6;
        this.field4521 = (byte) arg11;
        this.field4526 = (short) arg1.field2016;
        this.field4518 = arg6;
        this.field4515 = (byte) arg10;
        this.field4538 = arg0.method565() && arg1.field1991 && !this.field4518 && class299.field4755 != 0;
        class230 var13 = this.method1926(1024, (byte) 50, arg0, this.field4538);
        if (var13 != null) {
            this.field4522 = var13.field3831;
            this.field4519 = var13.field3834;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILe;I)Lid;", line = 198)
    private final class348 method1924(int arg0, class312 arg1, int arg2) {
        if (arg0 <= 88) {
            this.method190((byte) 19);
        }
        ++field4516;
        if (this.field4522 != null && ~arg1.method579(this.field4522.method44(), arg2) == -1) {
            return this.field4522;
        } else {
            class230 var4 = this.method1926(arg2, (byte) 50, arg1, false);
            return var4 == null ? null : var4.field3831;
        }
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I", line = 230)
    public final int method1925(int arg0) {
        ++field4512;
        if (arg0 != -9990) {
            return -18;
        } else {
            return this.field4522 == null ? 0 : this.field4522.method57();
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILe;)Z", line = 243)
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field4525;
        class348 var5 = this.method1924(114, arg3, arg1);
        if (var5 != null) {
            class435 var6 = arg3.method713();
            var6.method1984(super.field4787, super.field4791, super.field4786);
            return var5.method39(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)Z", line = 264)
    public final boolean method190(byte arg0) {
        if (arg0 > -126) {
            return true;
        } else {
            ++field4533;
            return this.field4538;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Le;I)V", line = 275)
    public final void method194(class312 arg0, int arg1) {
        int var3 = -91 / ((arg1 - -19) / 62);
        ++field4528;
        Object var4 = null;
        class84 var6;
        if (this.field4519 == null && this.field4538) {
            class230 var5 = this.method1926(131072, (byte) 50, arg0, true);
            var6 = var5 == null ? null : var5.field3834;
        } else {
            var6 = this.field4519;
            this.field4519 = null;
        }
        if (var6 != null) {
            class98.method740(var6, this.field4530, super.field4787, super.field4786, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLe;Z)Lns;", line = 308)
    private final class230 method1926(int arg0, byte arg1, class312 arg2, boolean arg3) {
        ++field4514;
        class127 var5 = class137.method1003(this.field4526 & 65535, -30796);
        class129 var6;
        class129 var7;
        if (this.field4518) {
            var6 = class181.field2961[0];
            var7 = class364.field5542[this.field4530];
        } else {
            if (~this.field4530 > -4) {
                var6 = class181.field2961[this.field4530 + 1];
            } else {
                var6 = null;
            }
            var7 = class181.field2961[this.field4530];
        }
        return arg1 != 50 ? null : var5.method949(var7, arg3, this.field4521, arg2, var6, this.field4515, arg1 + -8, super.field4786, super.field4787, super.field4791, arg0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 338)
    public final void method198(int arg0) {
        ++field4539;
        if (arg0 != -32289) {
            this.field4538 = false;
        }
        if (this.field4522 != null) {
            this.field4522.method17();
        }
    }
}
