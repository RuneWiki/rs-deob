import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 extends class207 {

    @OriginalMember(owner = "client!we", name = "qc", descriptor = "Laf;")
    public static class68 field260 = new class68(64);

    @OriginalMember(owner = "client!we", name = "jc", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!we", name = "kc", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!we", name = "lc", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!we", name = "mc", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!we", name = "nc", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!we", name = "pc", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!we", name = "rc", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!we", name = "sc", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!we", name = "oc", descriptor = "Ltf;")
    public class107 field258;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ltf;B)V")
    public final void method114(class107 arg0, byte arg1) {
        ++field253;
        if (arg1 >= 90) {
            this.field258 = arg0;
            if (super.field3384 != null) {
                super.field3384.method923();
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)I")
    public final int method115(int arg0) {
        ++field255;
        if (arg0 != 0) {
            field260 = null;
        }
        if (~class111.field1837 != -1 && this.field258.field1716 != null) {
            class107 var2 = this.field258.method775(false);
            if (var2 != null && ~var2.field1769 != 0) {
                return var2.field1769;
            }
        }
        return super.field3349;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V")
    public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field256;
        if (this.field258 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIIJILlb;)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class130 arg10) {
        ++field259;
        if (this.field258 != null) {
            class181 var13 = ~super.field3378 != 0 && ~super.field3406 == -1 ? class49.method384(super.field3378, 124) : null;
            class181 var14 = super.field3338 == -1 || super.field3338 == this.method1435(0).field3988 && var13 != null ? null : class49.method384(super.field3338, 35);
            class80 var15 = this.field258.method785(var14, super.field3334, super.field3318, super.field3387, false, super.field3363, super.field3354, super.field3386, var13, super.field3331);
            if (var15 != null) {
                super.field3388 = var15.method119();
                class107 var16 = this.field258;
                if (var16.field1716 != null) {
                    var16 = var16.method775(false);
                }
                if (class78.field1254 && var16.field1712) {
                    class80 var17 = class98.method723(this.field258.field1722, super.field3341, this.field258.field1730, var15, super.field3396, var14 != null ? var14 : var13, super.field3389, this.field258.field1731, arg0, 104, var14 == null ? super.field3386 : super.field3331, super.field3350, this.field258.field1754, this.field258.field1756);
                    var17.method117(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field3384);
                }
                this.method1434(2, var15);
                class80 var18 = null;
                this.method1436(arg0, false, var15);
                if (~super.field3352 != 0 && ~super.field3366 != 0) {
                    class188 var19 = class277.method1862(super.field3352, 82);
                    var18 = var19.method1283(super.field3347, true, super.field3366, super.field3323);
                    if (var18 != null) {
                        var18.method568(0, -super.field3410, 0);
                        if (var19.field3046) {
                            if (class155.field2512 != 0) {
                                var18.method565(class155.field2512);
                            }
                            if (~class87.field1390 != -1) {
                                var18.method577(class87.field1390);
                            }
                            if (class193.field3093 != 0) {
                                var18.method568(0, class193.field3093, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class187) var15).method1270(var18);
                }
                if (~this.field258.field1731 == -2) {
                    var15.field1270 = true;
                }
                var15.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field3384);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        if (arg0 != 125) {
            return true;
        } else {
            ++field262;
            return this.field258 != null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()I")
    public final int method119() {
        ++field254;
        return super.field3388;
    }

    @OriginalMember(owner = "client!we", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field257;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
    public static void method120(byte arg0) {
        int var1 = -88 % ((-36 - arg0) / 46);
        field260 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIBI)I")
    public static final int method121(int arg0, int arg1, byte arg2, int arg3) {
        ++field261;
        if (arg1 > 243) {
            arg0 >>= 4;
        } else if (~arg1 >= -218) {
            if (~arg1 < -193) {
                arg0 >>= 2;
            } else if (~arg1 < -180) {
                arg0 >>= 1;
            }
        } else {
            arg0 >>= 3;
        }
        int var4 = -96 % ((arg2 - 45) / 35);
        return (arg3 >> 2 << 10) + (arg1 >> 1) - -(arg0 >> 5 << 7);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIILik;JZ)V")
    public static final void method122(int arg0, int arg1, int arg2, int arg3, class260 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class42 var8 = new class42();
            var8.field789 = arg4;
            var8.field787 = arg1 * 128 + 64;
            var8.field788 = arg2 * 128 + 64;
            var8.field783 = arg3;
            var8.field786 = arg5;
            if (class288.field4563[arg0][arg1][arg2] == null) {
                class288.field4563[arg0][arg1][arg2] = new class134(arg0, arg1, arg2);
            }
            class288.field4563[arg0][arg1][arg2].field2140 = var8;
        }
    }
}
