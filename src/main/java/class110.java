import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class110 extends class434 {

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
    private int field1776 = -32768;

    @OriginalMember(owner = "client!nr", name = "P", descriptor = "I")
    private int field1786 = 0;

    @OriginalMember(owner = "client!nr", name = "R", descriptor = "I")
    private int field1788 = -1;

    @OriginalMember(owner = "client!nr", name = "U", descriptor = "Z")
    public boolean field1791 = false;

    @OriginalMember(owner = "client!nr", name = "V", descriptor = "I")
    private int field1792 = 0;

    @OriginalMember(owner = "client!nr", name = "cb", descriptor = "I")
    private int field1799 = 0;

    @OriginalMember(owner = "client!nr", name = "S", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
    private int field1781;

    @OriginalMember(owner = "client!nr", name = "Z", descriptor = "I")
    private int field1796;

    @OriginalMember(owner = "client!nr", name = "Y", descriptor = "Ljp;")
    private class55 field1795;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!nr", name = "Q", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!nr", name = "T", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!nr", name = "W", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!nr", name = "X", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!nr", name = "ab", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!nr", name = "bb", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!nr", name = "db", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "Lki;")
    public static class231 field1782;

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "Lbv;")
    private class471 field1784;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)I")
    public final int method836(int arg0) {
        if (arg0 != -32768) {
            this.method158(1, (byte) -119, 28, (class295) null);
        }
        ++field1798;
        return this.field1776;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Llb;IZIBILza;)V")
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        ++field1785;
        if (arg4 < 54) {
            this.method837(-99, (byte) -105);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)Z")
    public final boolean method169(int arg0) {
        ++field1777;
        if (arg0 != -28206) {
            this.method161((class186) null, -83, false, 92, (byte) 21, 19, (class295) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(Lza;I)V")
    public final void method166(class295 arg0, int arg1) {
        ++field1778;
        class285 var3 = this.method842(0, arg0, (byte) -83, this.field1781);
        if (var3 != null) {
            this.method841(var3, (byte) 114, arg0);
        }
        if (arg1 < 7) {
            this.method161((class186) null, 77, true, 22, (byte) 17, 36, (class295) null);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBILza;)Z")
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        ++field1794;
        return arg1 < 58;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field1789 = arg1 + arg2;
        this.field1799 = arg12;
        this.field1781 = arg0;
        this.field1796 = arg4;
        class350 var14 = class316.field4288.method2651((byte) 59, this.field1781);
        int var15 = var14.field5089;
        if (var15 == -1) {
            this.field1791 = true;
        } else {
            this.field1795 = class50.field716.method831(var15, (byte) 54);
            this.field1791 = false;
        }
        if (~this.field1789 == ~arg2) {
            class196.method1286(this.field1795, super.field6287, false, (byte) 1, super.field6279, super.field6284, this.field1786);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLza;)Lql;")
    public final class121 method171(byte arg0, class295 arg1) {
        if (arg0 != -96) {
            return null;
        } else {
            ++field1787;
            class285 var3 = this.method842(2048 | (this.field1799 == 0 ? 0 : 5), arg1, (byte) -121, this.field1781);
            if (var3 == null) {
                return null;
            } else {
                if (this.field1799 != 0) {
                    var3.method704(this.field1799 * 2048);
                }
                class512 var4 = arg1.method541();
                var4.method955(super.field6284, super.field6281, super.field6287);
                if (this.field1784 != null) {
                    class334 var5 = this.field1784.method2731();
                    arg1.method553(var3, var5, var4, (class305) null, 0);
                } else {
                    var3.method701(var4, (class305) null, 0);
                }
                this.field1776 = var3.method670();
                this.method841(var3, (byte) 110, arg1);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field1784 != null) {
            this.field1784.method2732();
        }
        ++field1780;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)V")
    public final void method837(int arg0, byte arg1) {
        ++field1774;
        if (!this.field1791) {
            this.field1792 += arg0;
            if (arg1 > -120) {
                field1775 = 87;
            }
            while (this.field1795.field788[this.field1786] < this.field1792) {
                this.field1792 -= this.field1795.field788[this.field1786];
                ++this.field1786;
                if (this.field1786 >= this.field1795.field796.length) {
                    this.field1791 = true;
                    break;
                }
            }
            if (!this.field1791) {
                class196.method1286(this.field1795, super.field6287, false, (byte) 1, super.field6279, super.field6284, this.field1786);
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
    public static void method838(byte arg0) {
        if (arg0 != -114) {
            method840(12, 111);
        }
        field1782 = null;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
    public final void method839(byte arg0) {
        ++field1783;
        if (this.field1784 != null) {
            this.field1784.method2732();
        }
        if (arg0 != -98) {
            this.method171((byte) -25, (class295) null);
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)I")
    public static final int method840(int arg0, int arg1) {
        ++field1779;
        return arg0 <= 40 ? -3 : 255 & arg1;
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)V")
    public final void method168(int arg0) {
        ++field1793;
        int var2 = -122 % ((43 - arg0) / 56);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Le;BLza;)V")
    private final void method841(class285 arg0, byte arg1, class295 arg2) {
        ++field1790;
        class51[] var4 = arg0.method715();
        if (arg1 < 43) {
            this.method166((class295) null, -94);
        }
        class502[] var5 = arg0.method709();
        if ((this.field1784 == null || this.field1784.field6785) && (var4 != null || var5 != null)) {
            this.field1784 = new class471(class28.field417);
        }
        if (this.field1784 != null) {
            this.field1784.method2738(arg2, (long) class28.field417, var4, var5, false);
            this.field1784.method2734(super.field6279, super.field6290, super.field6288, super.field6277, super.field6282);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILza;BI)Le;")
    private final class285 method842(int arg0, class295 arg1, byte arg2, int arg3) {
        ++field1800;
        class350 var5 = class316.field4288.method2651((byte) 59, arg3);
        if (arg2 > -54) {
            return null;
        } else {
            class11 var6 = class348.field5000[super.field6279];
            class11 var7 = this.field1796 >= 3 ? null : class348.field5000[this.field1796 - -1];
            return this.field1791 ? var5.method2099(var6, 0, 8224, super.field6281, -1, arg0, var7, arg1, -1, class50.field716, super.field6287, super.field6284, true) : var5.method2099(var6, this.field1792, 8224, super.field6281, this.field1788, arg0, var7, arg1, this.field1786, class50.field716, super.field6287, super.field6284, true);
        }
    }
}
