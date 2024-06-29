import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class332 extends class493 implements class231 {

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lwca;")
    public class308 field4759;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Z")
    private boolean field4760;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Luaa;")
    public static class395 field4767 = new class395(4);

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Lfea;")
    public static class47 field4772 = new class47();

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Lkm;")
    private class120 field4771;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Loh;I)Loh;", line = 5)
    public static final class549 method2053(class549 arg0, int arg1) {
        ++field4774;
        class549 var2 = client.method3513(arg0);
        if (arg1 >= -67) {
            method2053((class549) null, 63);
        }
        if (var2 == null) {
            var2 = arg0.field7733;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILqa;Z)Lr;", line = 22)
    public final class519 method254(int arg0, class167 arg1, boolean arg2) {
        ++field4761;
        return arg2 ? null : this.field4759.method1908(arg0, -1, arg1, false, false, 0, 0);
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V", line = 34)
    public final void method867(int arg0) {
        ++field4769;
        if (arg0 < 12) {
            this.method270(-2);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I", line = 49)
    public final int method269(int arg0) {
        if (arg0 != -13265) {
            method2054(-61);
        }
        ++field4778;
        return this.field4759.field4433;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lqa;I)Lbi;", line = 60)
    public final class465 method267(class167 arg0, int arg1) {
        ++field4775;
        class519 var3 = this.field4759.method1908(2048, arg1 + -3, arg0, false, true, super.field6919, super.field6918);
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg0.method637();
            var4.method884(super.field6918, super.field6921, super.field6919);
            class465 var5 = null;
            if (this.field4760) {
                var5 = class603.method3437((byte) -22, 1);
            }
            if (this.field4759.field4460 == null) {
                var3.method1379(var4, var5 == null ? null : var5.field6707[0], 0);
            } else {
                class616 var6 = this.field4759.field4460.method3350();
                arg0.method553(var3, var6, var4, var5 == null ? null : var5.field6707[0], 0);
            }
            if (arg1 != 2) {
                this.field4760 = true;
            }
            if (this.field4771 != null) {
                class221.method1477(var3, this.field4771, super.field6919, super.field6918, -8040, super.field6921);
            } else {
                this.field4771 = class577.method3298(var3, super.field6918, super.field6919, (byte) 50, super.field6921);
            }
            int var7 = super.field6918 >> 7;
            int var8 = super.field6919 >> 7;
            this.field4759.method1907(var3, true, var8, arg0, 34165, var8, var7, var7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lqa;B)V", line = 105)
    public final void method266(class167 arg0, byte arg1) {
        ++field4764;
        if (arg1 != -40) {
            method2053((class549) null, -65);
        }
        class519 var3 = this.field4759.method1908(262144, -1, arg0, true, true, super.field6919, super.field6918);
        if (var3 != null) {
            int var4 = super.field6918 >> 7;
            int var5 = super.field6919 >> 7;
            this.field4759.method1907(var3, false, var5, arg0, 34165, var5, var4, var4);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I", line = 127)
    public final int method258(byte arg0) {
        ++field4779;
        if (arg0 != -36) {
            method2053((class549) null, -85);
        }
        return this.field4759.field4430;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 138)
    public final void method270(int arg0) {
        ++field4765;
        int var2 = 10 % ((-1 - arg0) / 47);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILqa;)V", line = 152)
    public final void method255(int arg0, class167 arg1) {
        this.field4759.method1919(-117, arg1);
        ++field4762;
        int var3 = 67 / ((-46 - arg0) / 42);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BZILqa;IILcea;)V", line = 167)
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        if (arg0 != -84) {
            this.field4760 = false;
        }
        ++field4766;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Z", line = 178)
    public final boolean method868(boolean arg0) {
        ++field4768;
        if (arg0) {
            this.method270(-85);
        }
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V", line = 191)
    public static void method2054(int arg0) {
        if (arg0 >= -59) {
            method2055(110, (byte) 29);
        }
        field4772 = null;
        field4767 = null;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)Z", line = 203)
    public final boolean method262(int arg0) {
        if (arg0 != -21131) {
            field4772 = null;
        }
        ++field4780;
        return this.field4759.method1910(-1);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I", line = 219)
    public final int method264(int arg0) {
        ++field4770;
        if (arg0 != -25792) {
            this.field4760 = true;
        }
        return this.field4759.field4455;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLqa;II)Z", line = 231)
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        ++field4777;
        class519 var5 = this.field4759.method1908(131072, arg0 + -30, arg1, false, false, super.field6919, super.field6918);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 != 29) {
                field4767 = null;
            }
            class105 var6 = arg1.method637();
            var6.method884(super.field6918, super.field6921, super.field6919);
            return var5.method1399(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLqa;)V", line = 252)
    public final void method268(boolean arg0, class167 arg1) {
        if (!arg0) {
            this.field4771 = null;
        }
        ++field4763;
        this.field4759.method1911(arg1, -8881);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Z", line = 263)
    public static final boolean method2055(int arg0, byte arg1) {
        ++field4776;
        if (arg1 <= 96) {
            field4767 = null;
        }
        return ~arg0 == -3 || arg0 == 3 || arg0 == 4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lqa;Ltk;IIIIIZII)V", line = 274)
    public class332(class167 arg0, class370 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field5306, arg1.field5264, arg1.field5297);
        this.field4759 = new class308(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field4760 = arg1.field5276 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILqa;)Lkm;", line = 284)
    public final class120 method260(int arg0, class167 arg1) {
        ++field4773;
        if (arg0 >= -50) {
            method2055(-61, (byte) -64);
        }
        return this.field4771;
    }
}
