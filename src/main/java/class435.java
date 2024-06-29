import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class435 extends class518 implements class83 {

    @OriginalMember(owner = "client!di", name = "B", descriptor = "Z")
    private boolean field6291;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "Z")
    private boolean field6293;

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "Z")
    private boolean field6321;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "B")
    private byte field6301;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "S")
    private short field6296;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "Z")
    private boolean field6312;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "Lha;")
    private class425 field6295;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "Lda;")
    private class395 field6316;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "Lifa;")
    private class62 field6307;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILr;ILcaa;ZII)V")
    public final void method311(int arg0, class98 arg1, int arg2, class538 arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 >= 24) {
            ++field6317;
            if (arg3 instanceof class435) {
                class435 var8 = (class435) arg3;
                if (this.field6316 != null && var8.field6316 != null) {
                    this.field6316.method1055(var8.field6316, arg2, arg0, arg6, arg4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lr;I)Lhr;")
    public final class218 method272(class98 arg0, int arg1) {
        ++field6303;
        if (this.field6316 == null) {
            return null;
        } else {
            if (arg1 != -1) {
                this.field6296 = -18;
            }
            class151 var3 = arg0.method682();
            var3.method883(super.field7895, super.field7894, super.field7896);
            class218 var4 = null;
            if (this.field6293) {
                var4 = class187.method1237(1, (byte) 126);
            }
            if (class384.field5767) {
                this.field6316.method1030(var3, var4 != null ? var4.field2902[0] : null, class515.field7222, 0);
            } else {
                this.field6316.method1054(var3, var4 == null ? null : var4.field2902[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)Z")
    public final boolean method266(int arg0) {
        if (arg0 != 28107) {
            this.method309(true);
        }
        ++field6311;
        return this.field6312;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZILr;I)Ldg;")
    private final class193 method2584(boolean arg0, int arg1, class98 arg2, int arg3) {
        ++field6299;
        class289 var5 = class60.field965.method2596(0, 65535 & this.field6296);
        if (arg3 != -1239) {
            this.method259((class98) null, -74);
        }
        class682 var6;
        class682 var7;
        if (!this.field6321) {
            var6 = class262.field3404[super.field7900];
            if (super.field7900 < 3) {
                var7 = class262.field3404[super.field7900 - -1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class383.field5753[super.field7900];
            var7 = class262.field3404[0];
        }
        return var5.method1781(this.field6301, var6, arg3 + 21125, arg1, var7, super.field7894, 22, super.field7896, arg0, arg2, super.field7895);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Lr;I)V")
    public final void method259(class98 arg0, int arg1) {
        if (arg1 == 11771) {
            ++field6319;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lr;II)Lda;")
    private final class395 method2585(class98 arg0, int arg1, int arg2) {
        ++field6294;
        if (arg1 != 0) {
            return null;
        } else if (this.field6316 != null && arg0.method706(this.field6316.method1027(), arg2) == 0) {
            return this.field6316;
        } else {
            class193 var4 = this.method2584(false, arg2, arg0, -1239);
            return var4 == null ? null : var4.field2594;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(Lr;I)Lifa;")
    public final class62 method268(class98 arg0, int arg1) {
        ++field6309;
        if (this.field6307 == null) {
            this.field6307 = class249.method1513(super.field7896, super.field7894, this.method2585(arg0, 0, 0), 2, super.field7895);
        }
        if (arg1 != 0) {
            this.field6291 = false;
        }
        return this.field6307;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
    public static final void method2586(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field6302 = 15;
        }
        ++field6313;
        if (~class338.field4909 != ~arg1) {
            class542.field8026 = new int[arg1];
            for (int var3 = 0; arg1 > var3; ++var3) {
                class542.field8026[var3] = (var3 << 12) / arg1;
            }
            class412.field6121 = arg1 + -1;
            class338.field4909 = arg1;
            class645.field9292 = arg1 * 32;
        }
        if (~class106.field1578 != ~arg2) {
            if (class338.field4909 == arg2) {
                class400.field6026 = class542.field8026;
            } else {
                class400.field6026 = new int[arg2];
                for (int var4 = 0; ~arg2 < ~var4; ++var4) {
                    class400.field6026[var4] = (var4 << 12) / arg2;
                }
            }
            class106.field1578 = arg2;
            class553.field8133 = arg2 + -1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public final void method276(int arg0) {
        if (arg0 <= 63) {
            this.method274(-91);
        }
        if (this.field6316 != null) {
            this.field6316.method1016();
        }
        ++field6318;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lr;Z)V")
    public final void method265(class98 arg0, boolean arg1) {
        ++field6292;
        if (arg1) {
            Object var3 = null;
            class425 var5;
            if (this.field6295 == null && this.field6312) {
                class193 var4 = this.method2584(true, 262144, arg0, -1239);
                var5 = var4 == null ? null : var4.field2595;
            } else {
                var5 = this.field6295;
                this.field6295 = null;
            }
            if (var5 != null) {
                class91.method508(var5, super.field7900, super.field7895, super.field7896, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)I")
    public final int method263(byte arg0) {
        if (arg0 <= 10) {
            this.method277((byte) -104);
        }
        ++field6298;
        return this.field6301;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V")
    public final void method315(byte arg0) {
        this.field6291 = false;
        if (arg0 >= 101) {
            ++field6304;
            if (this.field6316 != null) {
                this.field6316.method1017(-65537 & this.field6316.method1027());
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLr;)V")
    public final void method273(byte arg0, class98 arg1) {
        ++field6308;
        Object var3 = null;
        class425 var5;
        if (this.field6295 == null && this.field6312) {
            class193 var4 = this.method2584(true, 262144, arg1, -1239);
            var5 = var4 == null ? null : var4.field2595;
        } else {
            var5 = this.field6295;
            this.field6295 = null;
        }
        if (var5 != null) {
            class445.method2628(var5, super.field7900, super.field7895, super.field7896, (boolean[]) null);
        }
        int var6 = 7 % ((arg0 - 2) / 56);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)I")
    public final int method271(boolean arg0) {
        ++field6300;
        if (arg0) {
            return -110;
        } else {
            return this.field6316 != null ? this.field6316.method1007() : 0;
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(Z)Z")
    public final boolean method309(boolean arg0) {
        ++field6297;
        if (!arg0) {
            this.field6321 = false;
        }
        return this.field6291;
    }

    @OriginalMember(owner = "client!di", name = "h", descriptor = "(I)Z")
    public final boolean method270(int arg0) {
        ++field6305;
        return arg0 <= -42;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIZLr;)Z")
    public final boolean method261(int arg0, int arg1, boolean arg2, class98 arg3) {
        if (arg2) {
            return false;
        } else {
            ++field6314;
            class395 var5 = this.method2585(arg3, 0, 131072);
            if (var5 != null) {
                class151 var6 = arg3.method682();
                var6.method883(super.field7895, super.field7894, super.field7896);
                return class384.field5767 ? var5.method1022(arg0, arg1, var6, false, class515.field7222) : var5.method1026(arg0, arg1, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)I")
    public final int method258(int arg0) {
        if (arg0 != -1) {
            this.method270(90);
        }
        ++field6315;
        return this.field6316 == null ? 0 : this.field6316.method1018();
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)I")
    public final int method277(byte arg0) {
        ++field6310;
        return arg0 != 95 ? 72 : this.field6296 & 65535;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)I")
    public final int method264(int arg0) {
        ++field6320;
        if (arg0 != -5273) {
            this.method265((class98) null, true);
        }
        return 22;
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)Z")
    public final boolean method274(int arg0) {
        if (arg0 != -1510217528) {
            this.field6296 = 68;
        }
        ++field6306;
        return this.field6316 == null ? false : this.field6316.method1024();
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lr;Llt;IIIIIZIZ)V")
    public class435(class98 arg0, class289 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4230);
        super.field7896 = arg6;
        this.field6291 = arg9;
        super.field7895 = arg4;
        this.field6293 = arg1.field4250 != 0 && !arg7;
        this.field6321 = arg7;
        this.field6301 = (byte) arg8;
        this.field6296 = (short) arg1.field4224;
        this.field6312 = arg0.method671() && arg1.field4219 && !this.field6321 && class335.field4872.method3786(class62.field996, false) != 0;
        int var11 = 2048;
        if (this.field6291) {
            var11 |= 65536;
        }
        class193 var12 = this.method2584(this.field6312, var11, arg0, -1239);
        if (var12 != null) {
            this.field6295 = var12.field2595;
            this.field6316 = var12.field2594;
            if (this.field6291) {
                this.field6316 = this.field6316.method1038((byte) 0, var11, false);
                return;
            }
        }
    }
}
