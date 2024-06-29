import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class310 extends class256 {

    @OriginalMember(owner = "client!rl", name = "sc", descriptor = "S")
    public static short field4986 = 256;

    @OriginalMember(owner = "client!rl", name = "Ac", descriptor = "[I")
    public static int[] field4994 = new int[5];

    @OriginalMember(owner = "client!rl", name = "Dc", descriptor = "I")
    public static int field4997 = 0;

    @OriginalMember(owner = "client!rl", name = "rc", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!rl", name = "tc", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!rl", name = "uc", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!rl", name = "vc", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!rl", name = "wc", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!rl", name = "xc", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!rl", name = "yc", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!rl", name = "Bc", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!rl", name = "Cc", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!rl", name = "Ec", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!rl", name = "Fc", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!rl", name = "Gc", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!rl", name = "zc", descriptor = "Lda;")
    public class211 field4993;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)V")
    public static void method2102(byte arg0) {
        field4994 = null;
        if (arg0 != 120) {
            field4986 = 20;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIII)V")
    public final void method7(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4996;
        if (this.field4993 != null) {
            if (!super.field4114) {
                class195 var6 = super.field4133 != -1 && ~super.field4107 == -1 ? class280.method1815(super.field4133, -53) : null;
                class195 var7 = super.field4102 == -1 || super.field4102 == this.method1685(0).field1201 && var6 != null ? null : class280.method1815(super.field4102, 79);
                class94 var8 = this.field4993.method1321(super.field4112, super.field4080, var7, super.field4072, 122, super.field4128, super.field4099, var6, super.field4110, super.field4087);
                if (var8 == null) {
                    return;
                }
                this.method1671(var8, (class94) null, 4285);
            }
            if (super.field4041 != null) {
                super.field4041.method1442(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()I")
    public final int method9() {
        ++field4998;
        return super.field4126;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIIJILte;)V")
    public final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class220 arg10) {
        ++field4985;
        if (this.field4993 != null) {
            class195 var13 = ~super.field4133 != 0 && super.field4107 == 0 ? class280.method1815(super.field4133, 110) : null;
            class195 var14 = ~super.field4102 == 0 || super.field4102 == this.method1685(0).field1201 && var13 != null ? null : class280.method1815(super.field4102, -24);
            class94 var15 = this.field4993.method1321(super.field4112, super.field4080, var14, super.field4072, 127, super.field4128, super.field4099, var13, super.field4110, super.field4087);
            if (var15 != null) {
                super.field4126 = var15.method9();
                class211 var16 = this.field4993;
                if (var16.field3173 != null) {
                    var16 = var16.method1316((byte) -90);
                }
                if (class68.field959 && var16.field3193) {
                    class94 var17 = class183.method1165(this.field4993.field3122, this.field4993.field3164, (byte) -73, this.field4993.field3133, var14 != null ? super.field4128 : super.field4099, this.field4993.field3191, super.field4081, super.field4124, this.field4993.field3126, arg0, var15, super.field4105, var14 == null ? var13 : var14, super.field4140);
                    var17.method11(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field4041);
                }
                this.method1682(var15, false);
                this.method1684(2, var15, arg0);
                class94 var18 = null;
                if (super.field4073 != -1 && super.field4086 != -1) {
                    class167 var19 = class291.method1952(0, super.field4073);
                    var18 = var19.method1072(super.field4086, 1, super.field4116, super.field4123);
                    if (var18 != null) {
                        var18.method409(0, -super.field4098, 0);
                        if (var19.field2385) {
                            if (~class56.field781 != -1) {
                                var18.method413(class56.field781);
                            }
                            if (~class205.field3063 != -1) {
                                var18.method414(class205.field3063);
                            }
                            if (class107.field1531 != 0) {
                                var18.method409(0, class107.field1531, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class66) var15).method430(var18);
                }
                this.method1671(var15, var18, 4285);
                if (~this.field4993.field3122 == -2) {
                    var15.field1366 = true;
                }
                var15.method11(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4041);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)I")
    public final int method1673(byte arg0) {
        ++field4987;
        if (this.field4993.field3173 != null) {
            class211 var2 = this.field4993.method1316((byte) -114);
            if (var2 != null && ~var2.field3165 != 0) {
                return var2.field3165;
            }
        }
        int var3 = -93 / ((-88 - arg0) / 38);
        return ~this.field4993.field3165 != 0 ? this.field4993.field3165 : super.method1673((byte) -127);
    }

    @OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field4999;
        if (super.field4041 != null) {
            super.field4041.method1444();
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)I")
    public final int method1670(byte arg0) {
        ++field5000;
        int var2 = 54 % ((32 - arg0) / 58);
        if (this.field4993.field3173 != null) {
            class211 var3 = this.field4993.method1316((byte) 116);
            if (var3 != null && ~var3.field3156 != 0) {
                return var3.field3156;
            }
        }
        return this.field4993.field3156;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lda;B)V")
    public final void method2103(class211 arg0, byte arg1) {
        int var3 = -88 / ((-73 - arg1) / 40);
        this.field4993 = arg0;
        if (super.field4041 != null) {
            super.field4041.method1438();
        }
        ++field4989;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)I")
    public final int method1668(byte arg0) {
        ++field4992;
        if (arg0 > -42) {
            return -97;
        } else {
            if (this.field4993.field3173 != null) {
                class211 var2 = this.field4993.method1316((byte) -96);
                if (var2 != null && ~var2.field3137 != 0) {
                    return var2.field3137;
                }
            }
            return super.field4062;
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)Z")
    public final boolean method1679(byte arg0) {
        ++field4991;
        if (this.field4993 == null) {
            return false;
        } else {
            if (arg0 >= -126) {
                this.field4993 = null;
            }
            return true;
        }
    }
}
