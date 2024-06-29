import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class326 extends class522 implements class401 {

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "B")
    private byte field5086;

    @OriginalMember(owner = "client!wk", name = "ab", descriptor = "Z")
    private boolean field5101;

    @OriginalMember(owner = "client!wk", name = "eb", descriptor = "B")
    private byte field5105;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "B")
    private byte field5075;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "Z")
    private boolean field5093;

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "S")
    private short field5099;

    @OriginalMember(owner = "client!wk", name = "cb", descriptor = "Z")
    private boolean field5103;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "Z")
    private boolean field5078;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "Lt;")
    public class398 field5098;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "Lba;")
    private class502 field5089;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "Luv;")
    public static class2 field5082 = new class2(8, 18);

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!wk", name = "Z", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!wk", name = "bb", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!wk", name = "db", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lya;Lpf;IIIIIZIIIIIIZ)V")
    public class326(class11 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field7147 == 1, class259.method1622(-109, arg12, arg13));
        this.field5086 = (byte) arg13;
        this.field5101 = arg1.field7230 != 0 && !arg7;
        this.field5105 = (byte) arg3;
        this.field5075 = (byte) arg12;
        this.field5093 = arg7;
        this.field5099 = (short) arg1.field7207;
        this.field5103 = arg14;
        this.field5078 = arg0.method77() && arg1.field7152 && !this.field5093 && class454.field6661.method509(class113.field1723, -2) != 0;
        int var16 = 2048;
        if (this.field5103) {
            var16 |= 65536;
        }
        class126 var17 = this.method2030((byte) 69, this.field5078, var16, arg0);
        if (var17 != null) {
            this.field5098 = var17.field1903;
            this.field5089 = var17.field1897;
            if (this.field5103) {
                this.field5098 = this.field5098.method610((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(B)I")
    public final int method2026(byte arg0) {
        if (arg0 <= 117) {
            method2029(false);
        }
        ++field5080;
        return this.field5098 != null ? this.field5098.method611() / 4 : 15;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lya;I)V")
    public final void method234(class11 arg0, int arg1) {
        ++field5104;
        if (arg1 != 28007) {
            field5082 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V")
    public final void method229(boolean arg0) {
        if (this.field5098 != null) {
            this.field5098.method624();
        }
        ++field5081;
        if (arg0) {
            this.method233(-44, (class11) null, -39, -19);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)Z")
    public static final boolean method2027(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2029(true);
        }
        ++field5088;
        return ~(2048 & arg0) != -1;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
    public final void method239(int arg0) {
        this.field5103 = false;
        if (arg0 > -38) {
            this.field5101 = true;
        }
        ++field5097;
        if (this.field5098 != null) {
            this.field5098.method602(-65537 & this.field5098.method626());
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
    public final int method223(int arg0) {
        ++field5085;
        if (arg0 != -19634) {
            this.method233(81, (class11) null, -93, 126);
        }
        return this.field5086;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lya;B)V")
    public final void method225(class11 arg0, byte arg1) {
        ++field5095;
        Object var3 = null;
        class502 var5;
        if (this.field5089 == null && this.field5078) {
            class126 var4 = this.method2030((byte) 82, true, 262144, arg0);
            var5 = var4 != null ? var4.field1897 : null;
        } else {
            var5 = this.field5089;
            this.field5089 = null;
        }
        if (var5 != null) {
            class489.method2918(var5, this.field5105, super.field7681, super.field7671, (boolean[]) null);
        }
        int var6 = 84 / ((42 - arg1) / 36);
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "(I)V")
    public static void method2028(int arg0) {
        field5082 = null;
        if (arg0 != 262144) {
            field5082 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
    public final int method222(byte arg0) {
        if (arg0 >= -99) {
            this.field5099 = -3;
        }
        ++field5083;
        return this.field5075;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILya;I)Lt;")
    public final class398 method241(int arg0, class11 arg1, int arg2) {
        ++field5102;
        int var4 = -80 % ((arg2 - 62) / 42);
        return this.method2031(arg1, arg0, -1477);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)Z")
    public final boolean method232(boolean arg0) {
        ++field5084;
        if (arg0) {
            this.field5099 = -120;
        }
        return this.field5078;
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)I")
    public final int method236(int arg0) {
        ++field5092;
        if (arg0 != 0) {
            return 67;
        } else {
            return this.field5098 == null ? 0 : this.field5098.method635();
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(Z)V")
    public static final void method2029(boolean arg0) {
        ++field5076;
        if (class280.field4227) {
            class280.field4227 = arg0;
            class482.field7121 = null;
            class525.field7771 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BZILya;)Lro;")
    private final class126 method2030(byte arg0, boolean arg1, int arg2, class11 arg3) {
        if (arg0 <= 17) {
            this.field5078 = false;
        }
        ++field5100;
        class486 var5 = class119.field1824.method248(65535 & this.field5099, 30);
        class337 var6;
        class337 var7;
        if (!this.field5093) {
            var6 = class213.field3048[this.field5105];
            if (this.field5105 < 3) {
                var7 = class213.field3048[this.field5105 - -1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class420.field6281[this.field5105];
            var7 = class213.field3048[0];
        }
        return var5.method2900(arg2, arg1, super.field7689, ~this.field5075 != -12 ? this.field5086 : this.field5086 + 4, super.field7681, arg3, var6, ~this.field5075 == -12 ? 10 : this.field5075, var7, true, super.field7671);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lya;II)Lt;")
    private final class398 method2031(class11 arg0, int arg1, int arg2) {
        ++field5079;
        if (this.field5098 != null && arg0.method160(this.field5098.method626(), arg1) == 0) {
            return this.field5098;
        } else {
            class126 var4 = this.method2030((byte) 125, false, arg1, arg0);
            if (arg2 != -1477) {
                this.field5078 = true;
            }
            return var4 == null ? null : var4.field1903;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLya;)V")
    public final void method231(byte arg0, class11 arg1) {
        ++field5090;
        if (arg0 != 33) {
            this.method222((byte) 43);
        }
        Object var3 = null;
        class502 var5;
        if (this.field5089 == null && this.field5078) {
            class126 var4 = this.method2030((byte) 31, true, 262144, arg1);
            var5 = var4 != null ? var4.field1897 : null;
        } else {
            var5 = this.field5089;
            this.field5089 = null;
        }
        if (var5 != null) {
            class174.method1197(var5, this.field5105, super.field7681, super.field7671, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lya;IIILqj;IZ)V")
    public final void method224(class11 arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, boolean arg6) {
        ++field5096;
        int var8 = 110 % ((24 - arg5) / 62);
        if (arg4 instanceof class53) {
            class53 var9 = (class53) arg4;
            if (this.field5098 != null && var9.field688 != null) {
                this.field5098.method604(var9.field688, arg2, arg1, arg3, arg6);
            }
        } else {
            if (arg4 instanceof class326) {
                class326 var10 = (class326) arg4;
                if (this.field5098 != null && var10.field5098 != null) {
                    this.field5098.method604(var10.field5098, arg2, arg1, arg3, arg6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)I")
    public final int method240(int arg0) {
        ++field5094;
        if (arg0 != -15578) {
            this.method2026((byte) 49);
        }
        return this.field5099 & 65535;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        ++field5087;
        if (arg2 != 2) {
            this.field5098 = null;
        }
        class398 var5 = this.method2031(arg1, 131072, -1477);
        if (var5 != null) {
            class511 var6 = arg1.method66();
            var6.method1307(super.field7681, super.field7689, super.field7671);
            return var5.method655(arg0, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Lya;I)Lmo;")
    public final class268 method238(class11 arg0, int arg1) {
        ++field5077;
        if (this.field5098 == null) {
            return null;
        } else {
            class511 var3 = arg0.method66();
            var3.method1307(super.field7681, super.field7689, super.field7671);
            class268 var4 = null;
            if (arg1 != -1) {
                return null;
            } else {
                if (this.field5101) {
                    var4 = class281.method1757(0, 1);
                }
                this.field5098.method640(var3, var4 != null ? var4.field3992[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)Z")
    public final boolean method230(int arg0) {
        if (arg0 != -22611) {
            return false;
        } else {
            ++field5091;
            return this.field5103;
        }
    }
}
