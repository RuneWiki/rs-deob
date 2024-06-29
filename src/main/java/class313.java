import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class313 extends class607 {

    @OriginalMember(owner = "client!he", name = "s", descriptor = "F")
    private float field4582 = 0.0F;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lki;")
    private class616 field4580;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field4572 = 0;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field4578 = 0;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Z")
    public static final boolean method2061(int arg0, int arg1) {
        ++field4585;
        int var2 = 124 / ((arg0 - 15) / 36);
        for (class631 var3 = (class631) class436.field6487.method719(false); var3 != null; var3 = (class631) class436.field6487.method716(14)) {
            if (class288.method1864((byte) -64, var3.field9100) && (long) arg1 == var3.field9099) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZB)V")
    public final void method811(boolean arg0, byte arg1) {
        super.field8870.method1957(-2, 1);
        if (arg1 != 91) {
            this.field4582 = -0.45854616F;
        }
        ++field4576;
        super.field8870.method1912(class274.field3839, class107.field1276, 126);
        super.field8870.method1521(true, 0, false, class83.field935, false);
        super.field8870.method1907(class577.field8332, true, 0);
        super.field8870.method1507(14, 0);
        super.field8870.method1957(-2, 0);
        super.field8870.method1939(-16777216, true);
        super.field8870.method1907(class173.field2123, true, 0);
        this.method2065(true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLiu;)V")
    public final void method810(int arg0, byte arg1, class502 arg2) {
        if (arg1 >= -73) {
            this.method810(-106, (byte) -100, (class502) null);
        }
        super.field8870.method1971((byte) -108, arg2);
        ++field4577;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
    public final void method805(byte arg0) {
        ++field4583;
        super.field8870.method1957(-2, 1);
        super.field8870.method1912(class457.field6837, class457.field6837, -25);
        super.field8870.method1970(-105, class83.field935, 0);
        super.field8870.method1907(class83.field935, true, 0);
        super.field8870.method1507(14, 1);
        if (arg0 != -58) {
            field4572 = 76;
        }
        super.field8870.method1971((byte) -95, (class502) null);
        super.field8870.method1957(-2, 0);
        super.field8870.method1907(class83.field935, true, 0);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ltu;Lki;)V")
    public class313(class294 arg0, class616 arg1) {
        super(arg0);
        this.field4580 = arg1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
    public final void method808(int arg0, boolean arg1) {
        if (arg0 != 993) {
            this.field4580 = null;
        }
        ++field4581;
        super.field8870.method1912(class274.field3839, class457.field6837, 122);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
    public final void method815(int arg0, int arg1, int arg2) {
        super.field8870.method1957(-2, 1);
        ++field4579;
        if ((arg1 & 128) == 0) {
            if ((arg2 & 1) == 1) {
                if (this.field4580.field8956) {
                    this.field4582 = (float) (super.field8870.field4317 % 4000) / 4000.0F;
                    super.field8870.method1971((byte) -85, this.field4580.field8960);
                } else {
                    int var4 = super.field8870.field4317 % 4000 * 16 / 4000;
                    super.field8870.method1971((byte) -58, this.field4580.field8964[var4]);
                }
            } else if (!this.field4580.field8956) {
                super.field8870.method1971((byte) -57, this.field4580.field8964[0]);
            } else {
                super.field8870.method1971((byte) -89, this.field4580.field8960);
            }
        } else {
            super.field8870.method1971((byte) -105, (class502) null);
        }
        if (arg0 != 12868) {
            this.method814((byte) -112);
        }
        super.field8870.method1957(-2, 0);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ[Lqf;III)V")
    public static final void method2062(int arg0, boolean arg1, class593[] arg2, int arg3, int arg4, int arg5) {
        ++field4574;
        for (int var6 = arg3; var6 < arg2.length; ++var6) {
            class593 var7 = arg2[var6];
            if (var7 != null && var7.field8533 == arg4) {
                class496.method2973(arg0, false, arg1, arg5, var7);
                class641.method3655((byte) -75, var7, arg0, arg5);
                if (-var7.field8570 + var7.field8626 < var7.field8598) {
                    var7.field8598 = -var7.field8570 + var7.field8626;
                }
                if (~var7.field8598 > -1) {
                    var7.field8598 = 0;
                }
                if (var7.field8662 > -var7.field8518 + var7.field8549) {
                    var7.field8662 = -var7.field8518 + var7.field8549;
                }
                if (~var7.field8662 > -1) {
                    var7.field8662 = 0;
                }
                if (~var7.field8507 == -1) {
                    class471.method2880(arg1, var7, 10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Z")
    public final boolean method814(byte arg0) {
        if (arg0 != -97) {
            this.method2065(true);
        }
        ++field4584;
        return this.field4580.method3555((byte) 62);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLjava/lang/String;IBLjava/lang/String;)V")
    public static final void method2063(boolean arg0, String arg1, int arg2, byte arg3, String arg4) {
        ++field4575;
        int var5 = 94 % ((arg3 - 20) / 37);
        class239.method1597(-1, arg1, true, arg2, (byte) 110, arg0, arg4);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2064(int arg0, int arg1, int arg2, int arg3) {
        if (!class571.method3315(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class465.field6917;
            int var5 = arg2 << class465.field6917;
            int var6 = class435.field6449[arg0].method259(arg1, arg2) - 1;
            int var7 = var6 - (120 << class465.field6917 - 7);
            int var8 = var6 - (230 << class465.field6917 - 7);
            int var9 = var6 - (238 << class465.field6917 - 7);
            if (arg3 == 1) {
                if (var4 > class625.field9043) {
                    if (!class237.method1590(var4, var6, var5)) {
                        return false;
                    }
                    if (!class237.method1590(var4, var6, class170.field2095 + var5)) {
                        return false;
                    }
                    if (!class237.method1590(var4, var6, class193.field2559 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class237.method1590(var4, var7, var5)) {
                        return false;
                    }
                    if (!class237.method1590(var4, var7, class170.field2095 + var5)) {
                        return false;
                    }
                    if (!class237.method1590(var4, var7, class193.field2559 + var5)) {
                        return false;
                    }
                }
                if (!class237.method1590(var4, var8, var5)) {
                    return false;
                } else if (!class237.method1590(var4, var8, class170.field2095 + var5)) {
                    return false;
                } else {
                    return class237.method1590(var4, var8, class193.field2559 + var5);
                }
            } else if (arg3 == 2) {
                if (var5 < class560.field7982) {
                    if (!class237.method1590(var4, var6, class193.field2559 + var5)) {
                        return false;
                    }
                    if (!class237.method1590(class170.field2095 + var4, var6, class193.field2559 + var5)) {
                        return false;
                    }
                    if (!class237.method1590(class193.field2559 + var4, var6, class193.field2559 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class237.method1590(var4, var7, class193.field2559 + var5)) {
                        return false;
                    }
                    if (!class237.method1590(class170.field2095 + var4, var7, class193.field2559 + var5)) {
                        return false;
                    }
                    if (!class237.method1590(class193.field2559 + var4, var7, class193.field2559 + var5)) {
                        return false;
                    }
                }
                if (!class237.method1590(var4, var8, class193.field2559 + var5)) {
                    return false;
                } else if (!class237.method1590(class170.field2095 + var4, var8, class193.field2559 + var5)) {
                    return false;
                } else {
                    return class237.method1590(class193.field2559 + var4, var8, class193.field2559 + var5);
                }
            } else if (arg3 == 4) {
                if (var4 < class625.field9043) {
                    if (!class237.method1590(class193.field2559 + var4, var6, var5)) {
                        return false;
                    }
                    if (!class237.method1590(class193.field2559 + var4, var6, class170.field2095 + var5)) {
                        return false;
                    }
                    if (!class237.method1590(class193.field2559 + var4, var6, class193.field2559 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class237.method1590(class193.field2559 + var4, var7, var5)) {
                        return false;
                    }
                    if (!class237.method1590(class193.field2559 + var4, var7, class170.field2095 + var5)) {
                        return false;
                    }
                    if (!class237.method1590(class193.field2559 + var4, var7, class193.field2559 + var5)) {
                        return false;
                    }
                }
                if (!class237.method1590(class193.field2559 + var4, var8, var5)) {
                    return false;
                } else if (!class237.method1590(class193.field2559 + var4, var8, class170.field2095 + var5)) {
                    return false;
                } else {
                    return class237.method1590(class193.field2559 + var4, var8, class193.field2559 + var5);
                }
            } else if (arg3 == 8) {
                if (var5 > class560.field7982) {
                    if (!class237.method1590(var4, var6, var5)) {
                        return false;
                    }
                    if (!class237.method1590(class170.field2095 + var4, var6, var5)) {
                        return false;
                    }
                    if (!class237.method1590(class193.field2559 + var4, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class237.method1590(var4, var7, var5)) {
                        return false;
                    }
                    if (!class237.method1590(class170.field2095 + var4, var7, var5)) {
                        return false;
                    }
                    if (!class237.method1590(class193.field2559 + var4, var7, var5)) {
                        return false;
                    }
                }
                if (!class237.method1590(var4, var8, var5)) {
                    return false;
                } else if (!class237.method1590(class170.field2095 + var4, var8, var5)) {
                    return false;
                } else {
                    return class237.method1590(class193.field2559 + var4, var8, var5);
                }
            } else if (!class237.method1590(class170.field2095 + var4, var9, class170.field2095 + var5)) {
                return false;
            } else if (arg3 == 16) {
                return class237.method1590(var4, var8, class193.field2559 + var5);
            } else if (arg3 == 32) {
                return class237.method1590(class193.field2559 + var4, var8, class193.field2559 + var5);
            } else if (arg3 == 64) {
                return class237.method1590(class193.field2559 + var4, var8, var5);
            } else if (arg3 == 128) {
                return class237.method1590(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public final void method2065(boolean arg0) {
        if (~super.field8870.method1972(-18556) == -1) {
            class646 var2 = super.field8870.method1938((byte) 49);
            super.field8870.method1957(-2, 1);
            class646 var3 = super.field8870.method1930(1);
            var3.method2004(var2);
            var3.method3694(-42, 0.125F, 0.125F, 1.0F);
            var3.method3692(0.0F, 0.0F, this.field4582, 0);
            super.field8870.method1935(class281.field3918, true);
            super.field8870.method1957(-2, 0);
        }
        ++field4573;
        if (!arg0) {
            this.field4580 = null;
        }
    }
}
