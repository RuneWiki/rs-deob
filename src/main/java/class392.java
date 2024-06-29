import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class392 extends class361 {

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    private int field5866 = -1;

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "I")
    private int field5882 = 0;

    @OriginalMember(owner = "client!jl", name = "bb", descriptor = "Z")
    public boolean field5888 = false;

    @OriginalMember(owner = "client!jl", name = "cb", descriptor = "I")
    private int field5889 = -32768;

    @OriginalMember(owner = "client!jl", name = "Y", descriptor = "I")
    private int field5885 = 0;

    @OriginalMember(owner = "client!jl", name = "db", descriptor = "I")
    public int field5890;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    private int field5868;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "Lqr;")
    private class15 field5877;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "S")
    public static short field5865 = 32767;

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
    public static int field5883 = 0;

    @OriginalMember(owner = "client!jl", name = "Z", descriptor = "Lwe;")
    public static class24 field5886 = new class24(64);

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!jl", name = "ab", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!jl", name = "eb", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!jl", name = "fb", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!jl", name = "gb", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!jl", name = "hb", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "Lqp;")
    private class279 field5871;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 3)
    public final void method2561(byte arg0) {
        ++field5891;
        if (this.field5871 != null) {
            this.field5871.method1789();
        }
        int var2 = -81 % ((31 - arg0) / 45);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)V", line = 16)
    public static final void method2562(byte arg0, int arg1, int arg2) {
        if (arg0 != -103) {
            field5865 = 58;
        }
        ++field5879;
        class256 var3 = class363.method2385(6, arg1, (byte) 1);
        var3.method1614(0);
        var3.field3756 = arg2;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method2563(boolean arg0) {
        ++field5880;
        class261 var1 = class114.field1551;
        synchronized (class114.field1551) {
            class114.field1551.method1633((byte) -86);
        }
        if (arg0) {
            field5865 = -111;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 48)
    public final void method163(int arg0) {
        if (arg0 == 0) {
            ++field5874;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)I", line = 60)
    public final int method194(int arg0) {
        ++field5884;
        if (arg0 > -7) {
            this.method145((class437) null, true);
        }
        return this.field5889;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILro;)V", line = 76)
    public static final void method2564(int arg0, class249 arg1) {
        ++field5870;
        if (arg0 >= -72) {
            field5883 = 125;
        }
        if (class394.field5913 == arg1.field3528) {
            class85.field1178[arg1.field3488] = true;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 110)
    public class392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field5890 = arg1 + arg2;
        this.field5868 = arg0;
        int var12 = class395.method2586(this.field5868, -6861).field4924;
        if (var12 == -1) {
            this.field5888 = true;
        } else {
            this.field5888 = false;
            this.field5877 = class391.method2551(var12, (byte) -108);
        }
        if (this.field5890 == arg2) {
            class277.method1770(super.field5284, 21155, false, this.field5882, super.field5298, this.field5877);
        }
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(B)Z", line = 98)
    public final boolean method151(byte arg0) {
        ++field5867;
        if (arg0 != -115) {
            this.method2568((class95) null, (class437) null, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Lnr;Z)Lg;", line = 138)
    public final class433 method145(class437 arg0, boolean arg1) {
        ++field5893;
        class95 var3 = this.method2565(arg0, -32768, 1024);
        if (var3 == null) {
            return null;
        } else {
            class116 var4 = arg0.method2026();
            var4.method809(super.field5284, super.field5297, super.field5298);
            if (this.field5871 == null) {
                var3.method602(var4, (class206) null, 0);
            } else {
                class125 var5 = this.field5871.method1783();
                arg0.method2162(var3, var5, var4, (class206) null, 0);
            }
            this.field5889 = var3.method597();
            this.method2568(var3, arg0, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lnr;II)Lqc;", line = 166)
    private final class95 method2565(class437 arg0, int arg1, int arg2) {
        ++field5873;
        if (arg1 != -32768) {
            field5886 = null;
        }
        class333 var4 = class395.method2586(this.field5868, arg1 + 25907);
        return this.field5888 ? var4.method2210(-1, -1, 0, -1, arg2, arg0) : var4.method2210(arg1 ^ 32767, this.field5882, this.field5885, this.field5866, arg2, arg0);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V", line = 183)
    public static void method2566(byte arg0) {
        if (arg0 < 116) {
            field5865 = -123;
        }
        field5886 = null;
    }

    @OriginalMember(owner = "client!jl", name = "finalize", descriptor = "()V", line = 205)
    protected final void finalize() {
        if (this.field5871 != null) {
            this.field5871.method1789();
        }
        ++field5881;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLnr;IIZLcb;I)V", line = 228)
    public final void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6) {
        ++field5875;
        if (arg0 >= -116) {
            this.method2565((class437) null, 93, -105);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)V", line = 241)
    public final void method2567(int arg0, byte arg1) {
        ++field5869;
        if (arg1 >= 58) {
            if (!this.field5888) {
                this.field5885 += arg0;
                while (~this.field5877.field164[this.field5882] > ~this.field5885) {
                    this.field5885 -= this.field5877.field164[this.field5882];
                    ++this.field5882;
                    if (~this.field5882 <= ~this.field5877.field150.length) {
                        this.field5888 = true;
                        break;
                    }
                }
                if (!this.field5888) {
                    class277.method1770(super.field5284, 21155, false, this.field5882, super.field5298, this.field5877);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lqc;Lnr;Z)V", line = 271)
    private final void method2568(class95 arg0, class437 arg1, boolean arg2) {
        ++field5878;
        class322[] var4 = arg0.method595();
        if (!arg2) {
            class145[] var5 = arg0.method607();
            if ((this.field5871 == null || this.field5871.field4091) && (var4 != null || var5 != null)) {
                this.field5871 = new class279(class50.field698);
            }
            if (this.field5871 != null) {
                this.field5871.method1790(arg1, (long) class50.field698, var4, var5, false);
                this.field5871.method1793(super.field5291, super.field5296, super.field5293, super.field5288, super.field5286);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILnr;II)Z", line = 296)
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        if (arg3 <= 12) {
            field5886 = null;
        }
        ++field5876;
        return false;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lnr;I)V", line = 314)
    public final void method161(class437 arg0, int arg1) {
        ++field5894;
        class95 var3 = this.method2565(arg0, -32768, arg1);
        if (var3 != null) {
            this.method2568(var3, arg0, false);
        }
    }
}
