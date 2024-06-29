import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class598 extends class337 implements class559 {

    @OriginalMember(owner = "client!via", name = "pb", descriptor = "Z")
    private boolean field8317;

    @OriginalMember(owner = "client!via", name = "V", descriptor = "Z")
    private boolean field8297;

    @OriginalMember(owner = "client!via", name = "gb", descriptor = "Z")
    private boolean field8308;

    @OriginalMember(owner = "client!via", name = "Q", descriptor = "B")
    private byte field8292;

    @OriginalMember(owner = "client!via", name = "R", descriptor = "S")
    private short field8293;

    @OriginalMember(owner = "client!via", name = "db", descriptor = "Z")
    private boolean field8305;

    @OriginalMember(owner = "client!via", name = "mb", descriptor = "Lka;")
    private class219 field8314;

    @OriginalMember(owner = "client!via", name = "N", descriptor = "Lr;")
    private class108 field8289;

    @OriginalMember(owner = "client!via", name = "S", descriptor = "I")
    public static int field8294 = 0;

    @OriginalMember(owner = "client!via", name = "jb", descriptor = "S")
    public static short field8311 = 320;

    @OriginalMember(owner = "client!via", name = "J", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!via", name = "L", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!via", name = "M", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!via", name = "O", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!via", name = "P", descriptor = "I")
    public static int field8291;

    @OriginalMember(owner = "client!via", name = "T", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!via", name = "U", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!via", name = "W", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!via", name = "X", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!via", name = "Z", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!via", name = "ab", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!via", name = "bb", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!via", name = "eb", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!via", name = "fb", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!via", name = "hb", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!via", name = "ib", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!via", name = "kb", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!via", name = "lb", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!via", name = "nb", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!via", name = "ob", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!via", name = "Y", descriptor = "Lufa;")
    private class152 field8300;

    @OriginalMember(owner = "client!via", name = "cb", descriptor = "Liba;")
    public static class224 field8304;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(ILha;B)Lka;")
    private final class219 method3300(int arg0, class454 arg1, byte arg2) {
        ++field8315;
        if (this.field8314 != null && arg1.method135(this.field8314.method1340(), arg0) == 0) {
            return this.field8314;
        } else {
            if (arg2 <= 58) {
                this.field8292 = 20;
            }
            class239 var4 = this.method3301(false, (byte) -88, arg1, arg0);
            return var4 != null ? var4.field3079 : null;
        }
    }

    @OriginalMember(owner = "client!via", name = "e", descriptor = "(B)I")
    public final int method269(byte arg0) {
        ++field8295;
        if (arg0 != 30) {
            return -42;
        } else {
            return this.field8314 == null ? 0 : this.field8314.method1333();
        }
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(I)I")
    public final int method735(int arg0) {
        ++field8298;
        if (arg0 != 24123) {
            this.method735(-4);
        }
        return 65535 & this.field8293;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IIBLha;)Z")
    public final boolean method512(int arg0, int arg1, byte arg2, class454 arg3) {
        ++field8301;
        class219 var5 = this.method3300(131072, arg3, (byte) 72);
        if (arg2 != -4) {
            this.field8292 = -22;
        }
        if (var5 != null) {
            class376 var6 = arg3.method114();
            var6.method1963(super.field5790, super.field5791, super.field5784);
            return class306.field3936 ? var5.method1357(arg0, arg1, var6, false, 0, class468.field6738) : var5.method1378(arg0, arg1, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(ZILmb;Lha;III)V")
    public final void method514(boolean arg0, int arg1, class410 arg2, class454 arg3, int arg4, int arg5, int arg6) {
        if (arg2 instanceof class598) {
            class598 var8 = (class598) arg2;
            if (this.field8314 != null && var8.field8314 != null) {
                this.field8314.method1329(var8.field8314, arg4, arg6, arg5, arg0);
            }
        }
        if (arg1 != 12473) {
            this.method509((class454) null, 34);
        }
        ++field8307;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(ZBLha;I)Lsca;")
    private final class239 method3301(boolean arg0, byte arg1, class454 arg2, int arg3) {
        ++field8290;
        if (arg1 > -76) {
            return null;
        } else {
            class290 var5 = class358.field5112.method890(this.field8293 & 65535, false);
            class402 var6;
            class402 var7;
            if (this.field8297) {
                var6 = class109.field1341[super.field5792];
                var7 = class716.field10106[0];
            } else {
                var6 = class716.field10106[super.field5792];
                if (super.field5792 >= 3) {
                    var7 = null;
                } else {
                    var7 = class716.field10106[super.field5792 + 1];
                }
            }
            return var5.method1734(593, arg0, super.field5790, 22, arg2, arg3, var7, super.field5791, this.field8292, var6, super.field5784);
        }
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(I)I")
    public final int method741(int arg0) {
        ++field8303;
        return arg0 <= 65 ? 62 : 22;
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(B)Z")
    public final boolean method516(byte arg0) {
        if (arg0 >= -67) {
            this.method739((byte) -31);
        }
        ++field8287;
        return this.field8308;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lha;I)Lie;")
    public final class607 method509(class454 arg0, int arg1) {
        ++field8302;
        if (this.field8314 == null) {
            return null;
        } else if (arg1 != -8964) {
            return null;
        } else {
            class376 var3 = arg0.method114();
            var3.method1963(super.field5790, super.field5791, super.field5784);
            class607 var4 = class311.method1814(arg1 ^ -9019, 1, this.field8317);
            if (class306.field3936) {
                this.field8314.method1375(var3, var4.field8425[0], class468.field6738, 0);
            } else {
                this.field8314.method1351(var3, var4.field8425[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lha;Lqg;IIIIIZIZ)V")
    public class598(class454 arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field3745);
        this.field8317 = arg1.field3738 != 0 && !arg7;
        super.field5790 = arg4;
        this.field8297 = arg7;
        this.field8308 = arg9;
        super.field5784 = arg6;
        this.field8292 = (byte) arg8;
        this.field8293 = (short) arg1.field3771;
        this.field8305 = arg0.method88() && arg1.field3739 && !this.field8297 && class223.field2944.field628.method1256((byte) -125) != 0;
        int var11 = 2048;
        if (this.field8308) {
            var11 |= 65536;
        }
        class239 var12 = this.method3301(this.field8305, (byte) -78, arg0, var11);
        if (var12 != null) {
            this.field8314 = var12.field3079;
            this.field8289 = var12.field3082;
            if (this.field8308) {
                this.field8314 = this.field8314.method1337((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(Lha;B)Lufa;")
    public final class152 method520(class454 arg0, byte arg1) {
        if (this.field8300 == null) {
            this.field8300 = class517.method2966(super.field5790, this.method3300(0, arg0, (byte) 111), super.field5784, 113, super.field5791);
        }
        ++field8291;
        if (arg1 < 114) {
            this.method522(true, (class454) null);
        }
        return this.field8300;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(I)I")
    public final int method731(int arg0) {
        int var2 = 85 / ((arg0 - 36) / 42);
        ++field8316;
        return this.field8292;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(ZLha;)V")
    public final void method522(boolean arg0, class454 arg1) {
        if (arg0) {
            method3302(-115);
        }
        ++field8312;
    }

    @OriginalMember(owner = "client!via", name = "d", descriptor = "(B)Z")
    public final boolean method265(byte arg0) {
        int var2 = -24 % ((arg0 - 61) / 45);
        ++field8313;
        if (this.field8314 == null) {
            return true;
        } else {
            return !this.field8314.method1342();
        }
    }

    @OriginalMember(owner = "client!via", name = "e", descriptor = "(I)V")
    public final void method523(int arg0) {
        this.field8308 = false;
        if (arg0 != 0) {
            this.field8317 = false;
        }
        ++field8288;
        if (this.field8314 != null) {
            this.field8314.method1327(-65537 & this.field8314.method1340());
        }
    }

    @OriginalMember(owner = "client!via", name = "k", descriptor = "(I)V")
    public static void method3302(int arg0) {
        field8304 = null;
        int var1 = -37 / ((arg0 - 42) / 59);
    }

    @OriginalMember(owner = "client!via", name = "f", descriptor = "(I)I")
    public final int method247(int arg0) {
        ++field8299;
        if (arg0 != 0) {
            this.field8297 = false;
        }
        return this.field8314 != null ? this.field8314.method1353() : 0;
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(B)Z")
    public final boolean method739(byte arg0) {
        int var2 = -102 / (arg0 / 32);
        ++field8286;
        return this.field8305;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lha;B)V")
    public final void method740(class454 arg0, byte arg1) {
        if (arg1 < 16) {
            this.method512(-60, 40, (byte) -95, (class454) null);
        }
        ++field8309;
        Object var3 = null;
        class108 var5;
        if (this.field8289 == null && this.field8305) {
            class239 var4 = this.method3301(true, (byte) -101, arg0, 262144);
            var5 = var4 == null ? null : var4.field3082;
        } else {
            var5 = this.field8289;
            this.field8289 = null;
        }
        if (var5 != null) {
            class566.method3194(var5, super.field5792, super.field5790, super.field5784, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!via", name = "f", descriptor = "(B)Z")
    public final boolean method256(byte arg0) {
        int var2 = -105 % ((-1 - arg0) / 36);
        ++field8296;
        return this.field8314 != null ? this.field8314.method1338() : false;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V")
    public final void method736(byte arg0) {
        if (this.field8314 != null) {
            this.field8314.method1376();
        }
        if (arg0 > -123) {
            this.method509((class454) null, -28);
        }
        ++field8306;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(ILha;)V")
    public final void method732(int arg0, class454 arg1) {
        ++field8310;
        Object var3 = null;
        if (arg0 != -10891) {
            this.field8297 = false;
        }
        class108 var5;
        if (this.field8289 == null && this.field8305) {
            class239 var4 = this.method3301(true, (byte) -128, arg1, 262144);
            var5 = var4 == null ? null : var4.field3082;
        } else {
            var5 = this.field8289;
            this.field8289 = null;
        }
        if (var5 != null) {
            class586.method3264(var5, super.field5792, super.field5790, super.field5784, (boolean[]) null);
        }
    }
}
