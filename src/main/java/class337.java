import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class337 extends class577 implements class281 {

    @OriginalMember(owner = "client!vu", name = "jb", descriptor = "Z")
    private boolean field4346;

    @OriginalMember(owner = "client!vu", name = "db", descriptor = "B")
    private byte field4340;

    @OriginalMember(owner = "client!vu", name = "N", descriptor = "S")
    private short field4324;

    @OriginalMember(owner = "client!vu", name = "fb", descriptor = "Z")
    private boolean field4342;

    @OriginalMember(owner = "client!vu", name = "hb", descriptor = "B")
    private byte field4344;

    @OriginalMember(owner = "client!vu", name = "ab", descriptor = "Z")
    private boolean field4337;

    @OriginalMember(owner = "client!vu", name = "ob", descriptor = "Lr;")
    private class182 field4351;

    @OriginalMember(owner = "client!vu", name = "X", descriptor = "Lka;")
    private class470 field4334;

    @OriginalMember(owner = "client!vu", name = "Y", descriptor = "Ldh;")
    public static class320 field4335 = new class320(11, 4);

    @OriginalMember(owner = "client!vu", name = "P", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!vu", name = "Q", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!vu", name = "R", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!vu", name = "S", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!vu", name = "T", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!vu", name = "U", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!vu", name = "V", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!vu", name = "W", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!vu", name = "Z", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!vu", name = "bb", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!vu", name = "cb", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!vu", name = "eb", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!vu", name = "gb", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!vu", name = "ib", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!vu", name = "kb", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!vu", name = "lb", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!vu", name = "mb", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!vu", name = "nb", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!vu", name = "L", descriptor = "Lafa;")
    public static class344 field4323;

    @OriginalMember(owner = "client!vu", name = "O", descriptor = "Llca;")
    private class642 field4325;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILha;)V", line = 3)
    public final void method1244(int arg0, class58 arg1) {
        ++field4329;
        Object var3 = null;
        if (arg0 != 17513) {
            this.method2002(-89, (class58) null, 85, true);
        }
        class182 var5;
        if (this.field4351 == null && this.field4337) {
            class42 var4 = this.method2002(81, arg1, 262144, true);
            var5 = var4 != null ? var4.field474 : null;
        } else {
            var5 = this.field4351;
            this.field4351 = null;
        }
        if (var5 != null) {
            class663.method3772(var5, super.field4633, super.field4635, super.field4629, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)Z", line = 31)
    public final boolean method1239(boolean arg0) {
        if (!arg0) {
            field4335 = null;
        }
        ++field4347;
        return this.field4337;
    }

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "(B)V", line = 42)
    public static void method2001(byte arg0) {
        field4323 = null;
        if (arg0 >= 49) {
            field4335 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLha;)Llba;", line = 55)
    public final class547 method994(byte arg0, class58 arg1) {
        ++field4341;
        if (this.field4334 == null) {
            return null;
        } else {
            if (arg0 != -112) {
                this.field4325 = null;
            }
            class165 var3 = arg1.method422();
            var3.method1019(super.field8155 + super.field4635, super.field4627, super.field8149 + super.field4629);
            class547 var4 = class652.method3702(this.field4346, -9477, 1);
            if (class626.field8994) {
                this.field4334.method188(var3, var4.field7870[0], class586.field8268, 0);
            } else {
                this.field4334.method228(var3, var4.field7870[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)I", line = 83)
    public final int method1243(byte arg0) {
        ++field4339;
        return arg0 != 117 ? 66 : this.field4340;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lha;I)V", line = 96)
    public final void method990(class58 arg0, int arg1) {
        ++field4326;
        int var3 = 1 % ((arg1 - -2) / 62);
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V", line = 105)
    public final void method1237(byte arg0) {
        if (this.field4334 != null) {
            this.field4334.method223();
        }
        ++field4350;
        if (arg0 > -68) {
            this.method1236((byte) 99);
        }
    }

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "(I)I", line = 118)
    public final int method985(int arg0) {
        ++field4328;
        if (arg0 != 4) {
            this.method1238((class58) null, (byte) -108);
        }
        return this.field4334 == null ? 0 : this.field4334.method190();
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILha;IZ)Lbt;", line = 129)
    private final class42 method2002(int arg0, class58 arg1, int arg2, boolean arg3) {
        ++field4345;
        class316 var5 = class445.field6442.method3972((byte) 100, 65535 & this.field4324);
        if (arg0 < 41) {
            return null;
        } else {
            class278 var6;
            class278 var7;
            if (this.field4342) {
                var6 = class11.field88[0];
                var7 = class159.field1758[super.field4633];
            } else {
                if (~super.field4633 <= -4) {
                    var6 = null;
                } else {
                    var6 = class11.field88[super.field4633 + 1];
                }
                var7 = class11.field88[super.field4633];
            }
            return var5.method1894(this.field4340, -65, arg2, var6, arg3, super.field4629, arg1, super.field4627, this.field4344, var7, super.field4635);
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lha;Lvc;IIIIIZIIII)V", line = 163)
    public class337(class58 arg0, class316 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field4635 = arg4;
        this.field4346 = arg1.field4001 != 0 && !arg7;
        this.field4340 = (byte) arg11;
        this.field4324 = (short) arg1.field3962;
        super.field4629 = arg6;
        this.field4342 = arg7;
        this.field4344 = (byte) arg10;
        this.field4337 = arg0.method376() && arg1.field4029 && !this.field4342 && class654.field9334.field9856.method2185(124) != 0;
        class42 var13 = this.method2002(55, arg0, 2048, this.field4337);
        if (var13 != null) {
            this.field4351 = var13.field474;
            this.field4334 = var13.field475;
        }
    }

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "(Z)I", line = 188)
    public final int method992(boolean arg0) {
        ++field4338;
        if (arg0) {
            method2001((byte) -123);
        }
        return this.field4334 == null ? 0 : this.field4334.method217();
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Z", line = 201)
    public final boolean method986(int arg0) {
        ++field4349;
        int var2 = 62 % ((arg0 - -50) / 60);
        if (this.field4334 != null) {
            return !this.field4334.method202();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILha;I)Z", line = 215)
    public final boolean method995(int arg0, int arg1, class58 arg2, int arg3) {
        ++field4327;
        class470 var5 = this.method2004(131072, arg3 ^ 127, arg2);
        if (var5 != null) {
            class165 var6 = arg2.method422();
            var6.method1019(super.field4635, super.field4627, super.field4629);
            return !class626.field8994 ? var5.method227(arg0, arg1, var6, false, 0) : var5.method191(arg0, arg1, var6, false, 0, class586.field8268);
        } else {
            if (arg3 != -1) {
                this.field4337 = true;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZI)Z", line = 243)
    public static final boolean method2003(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return false;
        } else {
            ++field4330;
            return class551.method3233(-23949, arg2, arg0) || class599.method3409(arg0, arg2, 55);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lha;B)V", line = 261)
    public final void method1238(class58 arg0, byte arg1) {
        ++field4336;
        Object var3 = null;
        class182 var5;
        if (this.field4351 == null && this.field4337) {
            class42 var4 = this.method2002(107, arg0, 262144, true);
            var5 = var4 == null ? null : var4.field474;
        } else {
            var5 = this.field4351;
            this.field4351 = null;
        }
        if (arg1 < -15) {
            if (var5 != null) {
                class158.method979(var5, super.field4633, super.field4635, super.field4629, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "(I)Z", line = 288)
    public final boolean method989(int arg0) {
        if (arg0 > -112) {
            this.field4324 = -106;
        }
        ++field4333;
        return this.field4334 == null ? false : this.field4334.method197();
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(B)I", line = 307)
    public final int method1236(byte arg0) {
        ++field4348;
        if (arg0 != -78) {
            method2001((byte) -94);
        }
        return this.field4344;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(ILha;)Llca;", line = 318)
    public final class642 method983(int arg0, class58 arg1) {
        ++field4343;
        if (arg0 != 0) {
            this.method1238((class58) null, (byte) 13);
        }
        if (this.field4325 == null) {
            this.field4325 = class191.method1161(super.field4629, this.method2004(0, -56, arg1), super.field4635, super.field4627, 4371);
        }
        return this.field4325;
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(B)I", line = 332)
    public final int method1241(byte arg0) {
        if (arg0 != 99) {
            return 116;
        } else {
            ++field4331;
            return this.field4324 & 65535;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILha;)Lka;", line = 344)
    private final class470 method2004(int arg0, int arg1, class58 arg2) {
        ++field4332;
        if (this.field4334 != null && ~arg2.method418(this.field4334.method213(), arg0) == -1) {
            return this.field4334;
        } else {
            class42 var4 = this.method2002(79, arg2, arg0, false);
            if (arg1 > -52) {
                return null;
            } else {
                return var4 == null ? null : var4.field475;
            }
        }
    }
}
