import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class561 extends class451 {

    @OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
    private int field7835 = 0;

    @OriginalMember(owner = "client!ar", name = "Y", descriptor = "I")
    private int field7843 = -1;

    @OriginalMember(owner = "client!ar", name = "Z", descriptor = "I")
    private int field7844 = 0;

    @OriginalMember(owner = "client!ar", name = "kb", descriptor = "I")
    private int field7855 = 0;

    @OriginalMember(owner = "client!ar", name = "ab", descriptor = "Z")
    public boolean field7845 = false;

    @OriginalMember(owner = "client!ar", name = "nb", descriptor = "I")
    private int field7858 = 0;

    @OriginalMember(owner = "client!ar", name = "jb", descriptor = "I")
    private int field7854 = 0;

    @OriginalMember(owner = "client!ar", name = "lb", descriptor = "Z")
    private boolean field7856 = true;

    @OriginalMember(owner = "client!ar", name = "eb", descriptor = "I")
    private int field7849;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
    public int field7828;

    @OriginalMember(owner = "client!ar", name = "U", descriptor = "Lrj;")
    private class747 field7839;

    @OriginalMember(owner = "client!ar", name = "X", descriptor = "Z")
    public static boolean field7842 = false;

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "Lhb;")
    public static class534 field7832 = new class534();

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!ar", name = "R", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!ar", name = "S", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!ar", name = "T", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!ar", name = "V", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!ar", name = "W", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!ar", name = "bb", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!ar", name = "cb", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!ar", name = "db", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!ar", name = "fb", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!ar", name = "gb", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!ar", name = "hb", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!ar", name = "ib", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!ar", name = "mb", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!ar", name = "ob", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "Laj;")
    private class428 field7834;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lha;I)Lie;")
    public final class607 method509(class454 arg0, int arg1) {
        ++field7833;
        class219 var3 = this.method3168((this.field7854 != 0 ? 5 : 0) | 2048, arg0, this.field7849, (byte) -119);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field7854 != -1) {
                var3.method1358(this.field7854 * 2048);
            }
            if (arg1 != -8964) {
                this.field7828 = -72;
            }
            class376 var4 = arg0.method114();
            var4.method1963(super.field5790, super.field5791, super.field5784);
            this.method3169(var3, var4, arg1 ^ -9058, arg0);
            class607 var5 = class311.method1814(79, 1, false);
            if (class306.field3936) {
                var3.method1375(var4, var5.field8425[0], class468.field6738, 0);
            } else {
                var3.method1351(var4, var5.field8425[0], 0);
            }
            if (this.field7834 != null) {
                class603 var6 = this.field7834.method2540();
                if (!class306.field3936) {
                    arg0.method102(var6);
                } else {
                    arg0.method155(var6, class468.field6738);
                }
            }
            this.field7856 = var3.method1338();
            this.field7858 = var3.method1353();
            this.field7835 = var3.method1333();
            return var5;
        }
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)Z")
    public final boolean method516(byte arg0) {
        if (arg0 >= -67) {
            return false;
        } else {
            ++field7851;
            return false;
        }
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V")
    public final void method523(int arg0) {
        if (arg0 == 0) {
            ++field7853;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZILmb;Lha;III)V")
    public final void method514(boolean arg0, int arg1, class410 arg2, class454 arg3, int arg4, int arg5, int arg6) {
        ++field7830;
        if (arg1 == 12473) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
    public final void method3167(int arg0, int arg1) {
        if (arg1 >= 61) {
            ++field7848;
            if (!this.field7845) {
                this.field7844 += arg0;
                while (~this.field7839.field10453[this.field7855] > ~this.field7844) {
                    this.field7844 -= this.field7839.field10453[this.field7855];
                    ++this.field7855;
                    if (this.field7839.field10458.length <= this.field7855) {
                        this.field7845 = true;
                        break;
                    }
                }
                if (!this.field7845) {
                    class107.method729(this.field7855, this.field7839, this, -4855);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field7840;
        if (this.field7834 != null) {
            this.field7834.method2550();
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILha;IB)Lka;")
    private final class219 method3168(int arg0, class454 arg1, int arg2, byte arg3) {
        int var5 = 102 / ((-54 - arg3) / 43);
        ++field7857;
        class716 var6 = class250.field3177.method3616((byte) 101, arg2);
        class402 var7 = class716.field10106[super.field5779];
        class402 var8 = super.field5792 >= 3 ? null : class716.field10106[super.field5792 - -1];
        return !this.field7845 ? var6.method3976(super.field5791, this.field7855, arg1, 94, super.field5790, super.field5784, class646.field8903, var8, this.field7843, var7, arg0, true, this.field7844) : var6.method3976(super.field5791, -1, arg1, 87, super.field5790, super.field5784, class646.field8903, var8, -1, var7, arg0, true, 0);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(Lha;B)Lufa;")
    public final class152 method520(class454 arg0, byte arg1) {
        ++field7831;
        return arg1 <= 114 ? null : null;
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(B)Z")
    public final boolean method256(byte arg0) {
        int var2 = -120 / ((-1 - arg0) / 36);
        ++field7846;
        return this.field7856;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field7849 = arg0;
        this.field7828 = arg1 + arg2;
        this.field7854 = arg12;
        class716 var14 = class250.field3177.method3616((byte) 110, this.field7849);
        int var15 = var14.field10096;
        if (var15 == -1) {
            this.field7845 = true;
        } else {
            this.field7839 = class646.field8903.method643(var15, -98);
            this.field7845 = false;
        }
        if (~this.field7828 == ~arg2) {
            class107.method729(this.field7855, this.field7839, this, -4855);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIBLha;)Z")
    public final boolean method512(int arg0, int arg1, byte arg2, class454 arg3) {
        ++field7836;
        if (arg2 != -4) {
            this.method512(46, 58, (byte) -124, (class454) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lka;Lwc;ILha;)V")
    private final void method3169(class219 arg0, class376 arg1, int arg2, class454 arg3) {
        ++field7837;
        arg0.method1366(arg1);
        if (arg2 > 95) {
            class183[] var5 = arg0.method1332();
            class27[] var6 = arg0.method1335();
            if ((this.field7834 == null || this.field7834.field6072) && (var5 != null || var6 != null)) {
                this.field7834 = class428.method2544(class266.field3368, true);
            }
            if (this.field7834 != null) {
                this.field7834.method2541(arg3, (long) class266.field3368, var5, var6, false);
                this.field7834.method2551(super.field5779, super.field6321, super.field6322, super.field6328, super.field6324);
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public final void method3170(int arg0) {
        ++field7841;
        if (arg0 != 0) {
            this.method3167(78, 11);
        }
        if (this.field7834 != null) {
            this.field7834.method2550();
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZLha;)V")
    public final void method522(boolean arg0, class454 arg1) {
        ++field7847;
        if (!arg0) {
            class219 var3 = this.method3168(0, arg1, this.field7849, (byte) -124);
            if (var3 != null) {
                class376 var4 = arg1.method114();
                var4.method1963(super.field5790, super.field5791, super.field5784);
                this.method3169(var3, var4, 104, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(B)I")
    public final int method269(byte arg0) {
        if (arg0 != 30) {
            return -77;
        } else {
            ++field7850;
            return this.field7835;
        }
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)I")
    public final int method247(int arg0) {
        if (arg0 != 0) {
            this.method516((byte) -90);
        }
        ++field7829;
        return this.field7858;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Lida;")
    public static final class650 method3171(byte arg0) {
        if (arg0 <= 111) {
            method3171((byte) -29);
        }
        ++field7859;
        return ~class477.field6820 == -1 ? new class650() : class66.field878[--class477.field6820];
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
    public static void method3172(byte arg0) {
        if (arg0 < -61) {
            field7832 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(B)Z")
    public final boolean method265(byte arg0) {
        ++field7838;
        int var2 = -30 / ((61 - arg0) / 45);
        return false;
    }
}
