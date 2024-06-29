import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class754 extends class391 implements class466 {

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "Z")
    private boolean field10408;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "Z")
    private boolean field10388;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "B")
    private byte field10396;

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "Z")
    private boolean field10411;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "B")
    private byte field10402;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "S")
    private short field10405;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "Z")
    private boolean field10397;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "Lr;")
    private class113 field10390;

    @OriginalMember(owner = "client!ad", name = "tb", descriptor = "Lka;")
    public class231 field10416;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field10385;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field10386;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field10387;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field10389;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field10391;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field10392;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field10393;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    public static int field10394;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field10395;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
    public static int field10399;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "I")
    public static int field10400;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
    public static int field10401;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "I")
    public static int field10403;

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
    public static int field10404;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "I")
    public static int field10406;

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "I")
    public static int field10409;

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "I")
    public static int field10410;

    @OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
    public static int field10412;

    @OriginalMember(owner = "client!ad", name = "qb", descriptor = "I")
    public static int field10413;

    @OriginalMember(owner = "client!ad", name = "rb", descriptor = "I")
    public static int field10414;

    @OriginalMember(owner = "client!ad", name = "sb", descriptor = "I")
    public static int field10415;

    @OriginalMember(owner = "client!ad", name = "ub", descriptor = "I")
    public static int field10417;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "Ltja;")
    private class491 field10398;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)I", line = 4)
    public final int method78(byte arg0) {
        if (arg0 >= -31) {
            return -17;
        } else {
            ++field10386;
            return this.field10416 == null ? 0 : this.field10416.method1576();
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Lha;I)Ltja;", line = 16)
    public final class491 method72(class473 arg0, int arg1) {
        if (this.field10398 == null) {
            this.field10398 = class486.method2885(super.field3470, super.field3464, this.method4162((byte) 117, arg0, 0), super.field3460, arg1 + 34336);
        }
        if (arg1 != -5047) {
            return null;
        } else {
            ++field10417;
            return this.field10398;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I", line = 34)
    public static final int method4161(int arg0, int arg1) {
        ++field10415;
        byte var2;
        if (~arg1 < -12001) {
            class464.method2786(113);
            var2 = 4;
        } else if (arg1 <= 5000) {
            if (arg1 > 2000) {
                class637.method3660(-46);
                var2 = 2;
            } else {
                var2 = 1;
                class81.method582(true, (byte) 108);
            }
        } else {
            class50.method418((byte) -28);
            var2 = 3;
        }
        if (class688.field9602.field8517.method2604((byte) -98) != 2) {
            class688.field9602.method3503(class688.field9602.field8510, -127, 2);
            class532.method3154(2, false, arg0 + -1999);
        }
        class266.method1738(-106);
        return arg0 != 2000 ? 6 : var2;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V", line = 87)
    public final void method754(boolean arg0) {
        if (!arg0) {
            ++field10399;
            if (this.field10416 != null) {
                this.field10416.method1589();
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Z", line = 100)
    public final boolean method755(byte arg0) {
        ++field10406;
        if (arg0 != -111) {
            this.field10398 = null;
        }
        return this.field10397;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILha;II)Z", line = 112)
    public final boolean method88(int arg0, class473 arg1, int arg2, int arg3) {
        ++field10404;
        class231 var5 = this.method4162((byte) 109, arg1, 131072);
        if (var5 != null) {
            class12 var6 = arg1.method153();
            var6.method50(super.field3470, super.field3464, super.field3460);
            return class529.field7284 ? var5.method1570(arg0, arg3, var6, false, 0, class775.field10662) : var5.method1578(arg0, arg3, var6, false, 0);
        } else {
            if (arg2 != -31634) {
                this.method762(false);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)Z", line = 135)
    public final boolean method77(int arg0) {
        if (arg0 != 25833) {
            this.field10402 = 6;
        }
        ++field10400;
        if (this.field10416 == null) {
            return true;
        } else {
            return !this.field10416.method1563();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I", line = 150)
    public final int method756(byte arg0) {
        ++field10392;
        int var2 = -38 / ((48 - arg0) / 51);
        return this.field10396;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILha;)Lrk;", line = 165)
    public final class289 method74(int arg0, class473 arg1) {
        ++field10413;
        if (this.field10416 == null) {
            return null;
        } else {
            class12 var3 = arg1.method153();
            var3.method50(super.field3470, super.field3464, super.field3460);
            class289 var4 = class122.method863(1, (byte) 109, this.field10411);
            if (arg0 < 75) {
                return null;
            } else {
                if (class529.field7284) {
                    this.field10416.method1580(var3, var4.field4255[0], class775.field10662, 0);
                } else {
                    this.field10416.method1586(var3, var4.field4255[0], 0);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lha;I)V", line = 193)
    public final void method76(class473 arg0, int arg1) {
        ++field10401;
        int var3 = -59 % ((-30 - arg1) / 42);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lha;I)V", line = 202)
    public final void method757(class473 arg0, int arg1) {
        ++field10391;
        int var3 = -116 / ((arg1 - 13) / 37);
        Object var4 = null;
        class113 var6;
        if (this.field10390 == null && this.field10397) {
            class452 var5 = this.method4163(262144, arg0, true, 18836);
            var6 = var5 == null ? null : var5.field6302;
        } else {
            var6 = this.field10390;
            this.field10390 = null;
        }
        if (var6 != null) {
            class604.method3491(var6, super.field3469, super.field3470, super.field3460, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)I", line = 229)
    public final int method762(boolean arg0) {
        ++field10387;
        return !arg0 ? 38 : this.field10402;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V", line = 240)
    public final void method81(byte arg0) {
        ++field10410;
        this.field10408 = false;
        if (this.field10416 != null) {
            this.field10416.method1548(-65537 & this.field10416.method1587());
        }
        if (arg0 != 29) {
            this.method83(true);
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I", line = 259)
    public final int method89(int arg0) {
        ++field10389;
        int var2 = 31 / ((arg0 - 69) / 48);
        return this.field10416 == null ? 0 : this.field10416.method1539();
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Z", line = 270)
    public final boolean method80(int arg0) {
        ++field10414;
        if (arg0 < 63) {
            return true;
        } else {
            return this.field10416 == null ? false : this.field10416.method1575();
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lha;Lro;IIIIIZIIZ)V", line = 287)
    public class754(class473 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class203.method1305(-4, arg8, arg9));
        this.field10408 = arg10;
        this.field10388 = arg7;
        super.field3470 = arg4;
        this.field10396 = (byte) arg8;
        this.field10411 = arg1.field4137 != 0 && !arg7;
        this.field10402 = (byte) arg9;
        super.field3460 = arg6;
        this.field10405 = (short) arg1.field4124;
        this.field10397 = arg0.method206() && arg1.field4122 && !this.field10388 && class688.field9602.field8538.method2315((byte) -98) != 0;
        int var12 = 2048;
        if (this.field10408) {
            var12 |= 65536;
        }
        class452 var13 = this.method4163(var12, arg0, this.field10397, 18836);
        if (var13 != null) {
            this.field10390 = var13.field6302;
            this.field10416 = var13.field6304;
            if (this.field10408) {
                this.field10416 = this.field10416.method1584((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lha;Z)V", line = 322)
    public final void method763(class473 arg0, boolean arg1) {
        if (arg1) {
            this.method763((class473) null, true);
        }
        ++field10403;
        Object var3 = null;
        class113 var5;
        if (this.field10390 == null && this.field10397) {
            class452 var4 = this.method4163(262144, arg0, true, 18836);
            var5 = var4 != null ? var4.field6302 : null;
        } else {
            var5 = this.field10390;
            this.field10390 = null;
        }
        if (var5 != null) {
            class516.method3071(var5, super.field3469, super.field3470, super.field3460, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(Z)Z", line = 351)
    public final boolean method83(boolean arg0) {
        ++field10385;
        if (arg0) {
            this.field10402 = -95;
        }
        return this.field10408;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLha;I)Lka;", line = 362)
    private final class231 method4162(byte arg0, class473 arg1, int arg2) {
        ++field10393;
        if (arg0 <= 108) {
            this.method73((class230) null, -69, false, 70, (class473) null, -94, -125);
        }
        if (this.field10416 != null && ~arg1.method188(this.field10416.method1587(), arg2) == -1) {
            return this.field10416;
        } else {
            class452 var4 = this.method4163(arg2, arg1, false, 18836);
            return var4 == null ? null : var4.field6304;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I", line = 383)
    public final int method760(int arg0) {
        ++field10407;
        if (arg0 != -27640) {
            this.field10397 = false;
        }
        return this.field10405 & 65535;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILha;ZI)Luaa;", line = 395)
    private final class452 method4163(int arg0, class473 arg1, boolean arg2, int arg3) {
        ++field10394;
        if (arg3 != 18836) {
            return null;
        } else {
            class286 var5 = class390.field5558.method3065(62, this.field10405 & 65535);
            class418 var6;
            class418 var7;
            if (!this.field10388) {
                var6 = class95.field1115[super.field3469];
                if (~super.field3469 > -4) {
                    var7 = class95.field1115[super.field3469 + 1];
                } else {
                    var7 = null;
                }
            } else {
                var7 = class95.field1115[0];
                var6 = class594.field8355[super.field3469];
            }
            return var5.method1898(arg1, this.field10396, var7, super.field3460, arg2, false, super.field3470, super.field3464, this.field10402, arg0, (class413) null, var6);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Loq;IZILha;II)V", line = 429)
    public final void method73(class230 arg0, int arg1, boolean arg2, int arg3, class473 arg4, int arg5, int arg6) {
        if (arg0 instanceof class754) {
            class754 var8 = (class754) arg0;
            if (this.field10416 != null && var8.field10416 != null) {
                this.field10416.method1564(var8.field10416, arg1, arg3, arg5, arg2);
            }
        } else if (arg0 instanceof class368) {
            class368 var9 = (class368) arg0;
            if (this.field10416 != null && var9.field5314 != null) {
                this.field10416.method1564(var9.field5314, arg1, arg3, arg5, arg2);
            }
        }
        if (arg6 >= 96) {
            ++field10409;
        }
    }
}
