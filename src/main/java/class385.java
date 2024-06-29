import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class385 extends class149 implements class559 {

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "S")
    private short field5368;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "B")
    private byte field5354;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "Z")
    private boolean field5372;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "Z")
    private boolean field5366;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "B")
    private byte field5351;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Z")
    private boolean field5355;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "Lr;")
    private class108 field5373;

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "Lka;")
    private class219 field5374;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "Lufa;")
    private class152 field5361;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
    public final int method735(int arg0) {
        ++field5375;
        if (arg0 != 24123) {
            this.method739((byte) 87);
        }
        return 65535 & this.field5368;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)I")
    public final int method269(byte arg0) {
        if (arg0 != 30) {
            this.field5373 = null;
        }
        ++field5360;
        return this.field5374 != null ? this.field5374.method1333() : 0;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)I")
    public final int method741(int arg0) {
        ++field5370;
        if (arg0 < 65) {
            this.field5368 = -44;
        }
        return this.field5351;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lha;I)Lie;")
    public final class607 method509(class454 arg0, int arg1) {
        ++field5364;
        if (this.field5374 == null) {
            return null;
        } else {
            if (arg1 != -8964) {
                this.method741(26);
            }
            class376 var3 = arg0.method114();
            var3.method1963(super.field1810 + super.field5790, super.field5791, super.field1805 + super.field5784);
            class607 var4 = class311.method1814(-125, 1, this.field5366);
            if (!class306.field3936) {
                this.field5374.method1351(var3, var4.field8425[0], 0);
            } else {
                this.field5374.method1375(var3, var4.field8425[0], class468.field6738, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)V")
    public static final void method2312(int arg0, byte arg1) {
        ++field5371;
        class548 var2 = class696.method3872(arg0, 3, -1633381944);
        int var3 = -13 % ((5 - arg1) / 63);
        var2.method3127((byte) 122);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLha;)V")
    public final void method522(boolean arg0, class454 arg1) {
        ++field5376;
        if (arg0) {
            this.field5361 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(B)Z")
    public final boolean method256(byte arg0) {
        ++field5353;
        int var2 = -109 / ((arg0 - -1) / 36);
        return this.field5374 != null ? this.field5374.method1338() : false;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILha;)V")
    public final void method732(int arg0, class454 arg1) {
        if (arg0 == -10891) {
            ++field5367;
            Object var3 = null;
            class108 var5;
            if (this.field5373 == null && this.field5355) {
                class239 var4 = this.method2313(true, (byte) 104, arg1, 262144);
                var5 = var4 == null ? null : var4.field3082;
            } else {
                var5 = this.field5373;
                this.field5373 = null;
            }
            if (var5 != null) {
                class586.method3264(var5, super.field5792, super.field5790, super.field5784, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIBLha;)Z")
    public final boolean method512(int arg0, int arg1, byte arg2, class454 arg3) {
        ++field5363;
        if (arg2 != -4) {
            return false;
        } else {
            class219 var5 = this.method2314(arg3, 131072, (byte) 35);
            if (var5 != null) {
                class376 var6 = arg3.method114();
                var6.method1963(super.field5790, super.field5791, super.field5784);
                return !class306.field3936 ? var5.method1378(arg0, arg1, var6, false, 0) : var5.method1357(arg0, arg1, var6, false, 0, class468.field6738);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZBLha;I)Lsca;")
    private final class239 method2313(boolean arg0, byte arg1, class454 arg2, int arg3) {
        ++field5356;
        class290 var5 = class358.field5112.method890(this.field5368 & 65535, false);
        if (arg1 <= 89) {
            return null;
        } else {
            class402 var6;
            class402 var7;
            if (!this.field5372) {
                var6 = class716.field10106[super.field5792];
                if (~super.field5792 > -4) {
                    var7 = class716.field10106[super.field5792 + 1];
                } else {
                    var7 = null;
                }
            } else {
                var7 = class716.field10106[0];
                var6 = class109.field1341[super.field5792];
            }
            return var5.method1734(593, arg0, super.field5790, this.field5351, arg2, arg3, var7, super.field5791, this.field5354, var6, super.field5784);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lha;B)V")
    public final void method740(class454 arg0, byte arg1) {
        ++field5357;
        Object var3 = null;
        class108 var5;
        if (this.field5373 == null && this.field5355) {
            class239 var4 = this.method2313(true, (byte) 117, arg0, 262144);
            var5 = var4 == null ? null : var4.field3082;
        } else {
            var5 = this.field5373;
            this.field5373 = null;
        }
        if (var5 != null) {
            class566.method3194(var5, super.field5792, super.field5790, super.field5784, (boolean[]) null);
        }
        if (arg1 <= 16) {
            this.method735(112);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
    public final int method731(int arg0) {
        int var2 = -32 / ((arg0 - 36) / 42);
        ++field5358;
        return this.field5354;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Z")
    public final boolean method739(byte arg0) {
        int var2 = -15 % (arg0 / 32);
        ++field5369;
        return this.field5355;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lha;Lqg;IIIIIZIIII)V")
    public class385(class454 arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field5368 = (short) arg1.field3771;
        this.field5354 = (byte) arg11;
        super.field5790 = arg4;
        this.field5372 = arg7;
        this.field5366 = ~arg1.field3738 != -1 && !arg7;
        super.field5784 = arg6;
        this.field5351 = (byte) arg10;
        this.field5355 = arg0.method88() && arg1.field3739 && !this.field5372 && class223.field2944.field628.method1256((byte) -125) != 0;
        class239 var13 = this.method2313(this.field5355, (byte) 111, arg0, 2048);
        if (var13 != null) {
            this.field5373 = var13.field3082;
            this.field5374 = var13.field3079;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lha;B)Lufa;")
    public final class152 method520(class454 arg0, byte arg1) {
        if (this.field5361 == null) {
            this.field5361 = class517.method2966(super.field5790, this.method2314(arg0, 0, (byte) 85), super.field5784, 126, super.field5791);
        }
        if (arg1 < 114) {
            this.field5373 = null;
        }
        ++field5362;
        return this.field5361;
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)I")
    public final int method247(int arg0) {
        ++field5359;
        if (arg0 != 0) {
            return -19;
        } else {
            return this.field5374 != null ? this.field5374.method1353() : 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)Z")
    public final boolean method265(byte arg0) {
        int var2 = 49 / ((arg0 - 61) / 45);
        ++field5350;
        if (this.field5374 == null) {
            return true;
        } else {
            return !this.field5374.method1342();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lha;IB)Lka;")
    private final class219 method2314(class454 arg0, int arg1, byte arg2) {
        ++field5352;
        if (this.field5374 != null && arg0.method135(this.field5374.method1340(), arg1) == 0) {
            return this.field5374;
        } else {
            class239 var4 = this.method2313(false, (byte) 117, arg0, arg1);
            if (arg2 <= 1) {
                this.field5366 = false;
            }
            return var4 != null ? var4.field3079 : null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public final void method736(byte arg0) {
        ++field5365;
        if (arg0 < -123) {
            if (this.field5374 != null) {
                this.field5374.method1376();
            }
        }
    }
}
