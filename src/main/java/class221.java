import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class221 extends class701 implements class614 {

    @OriginalMember(owner = "client!cca", name = "T", descriptor = "Z")
    private boolean field3113;

    @OriginalMember(owner = "client!cca", name = "P", descriptor = "Z")
    private boolean field3109;

    @OriginalMember(owner = "client!cca", name = "Q", descriptor = "B")
    private byte field3110;

    @OriginalMember(owner = "client!cca", name = "V", descriptor = "S")
    private short field3115;

    @OriginalMember(owner = "client!cca", name = "M", descriptor = "Z")
    private boolean field3106;

    @OriginalMember(owner = "client!cca", name = "fb", descriptor = "Z")
    private boolean field3125;

    @OriginalMember(owner = "client!cca", name = "D", descriptor = "Lha;")
    private class54 field3099;

    @OriginalMember(owner = "client!cca", name = "ab", descriptor = "Lda;")
    private class55 field3120;

    @OriginalMember(owner = "client!cca", name = "H", descriptor = "[I")
    public static int[] field3103 = new int[25];

    @OriginalMember(owner = "client!cca", name = "A", descriptor = "Lnea;")
    public static class664 field3096 = new class664(5, -2);

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!cca", name = "B", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!cca", name = "C", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!cca", name = "E", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!cca", name = "F", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!cca", name = "G", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!cca", name = "J", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!cca", name = "K", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!cca", name = "N", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!cca", name = "O", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!cca", name = "R", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!cca", name = "S", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!cca", name = "U", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!cca", name = "W", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!cca", name = "X", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!cca", name = "Y", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!cca", name = "bb", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!cca", name = "cb", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!cca", name = "db", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!cca", name = "eb", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!cca", name = "gb", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!cca", name = "Z", descriptor = "Lnu;")
    private class548 field3119;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(ILr;)Lnu;")
    public final class548 method1183(int arg0, class166 arg1) {
        if (arg0 != 6433) {
            return null;
        } else {
            if (this.field3119 == null) {
                this.field3119 = class149.method1060(super.field3029, super.field3024, this.method1452(arg1, (byte) -120, 0), false, super.field3018);
            }
            ++field3126;
            return this.field3119;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lr;BI)Lda;")
    private final class55 method1452(class166 arg0, byte arg1, int arg2) {
        if (arg1 >= -70) {
            this.field3099 = null;
        }
        ++field3122;
        if (this.field3120 != null && ~arg0.method172(this.field3120.method517(), arg2) == -1) {
            return this.field3120;
        } else {
            class336 var4 = this.method1454(-95, false, arg0, arg2);
            return var4 == null ? null : var4.field4961;
        }
    }

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "(I)I")
    public final int method1182(int arg0) {
        ++field3108;
        if (arg0 != -32768) {
            this.method1185(-28, -117, (class166) null, 54);
        }
        return this.field3120 != null ? this.field3120.method488() : 0;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lr;I)V")
    public final void method1172(class166 arg0, int arg1) {
        ++field3118;
        Object var3 = null;
        class54 var5;
        if (this.field3099 == null && this.field3125) {
            class336 var4 = this.method1454(-86, true, arg0, 262144);
            var5 = var4 != null ? var4.field4963 : null;
        } else {
            var5 = this.field3099;
            this.field3099 = null;
        }
        if (var5 != null) {
            class320.method2005(var5, super.field3023, super.field3024, super.field3029, (boolean[]) null);
        }
        if (arg1 <= 26) {
            this.field3115 = -16;
        }
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(Lr;Z)Lkq;")
    public final class549 method1173(class166 arg0, boolean arg1) {
        ++field3104;
        if (this.field3120 == null) {
            return null;
        } else {
            class391 var3 = arg0.method130();
            if (!arg1) {
                this.method1171((byte) -92);
            }
            var3.method252(super.field3024, super.field3018, super.field3029);
            class549 var4 = null;
            if (this.field3113) {
                var4 = class26.method321(1, 0);
            }
            if (!class676.field9574) {
                this.field3120.method513(var3, var4 != null ? var4.field7711[0] : null, 0);
            } else {
                this.field3120.method495(var3, var4 != null ? var4.field7711[0] : null, class341.field5008, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZLr;Lrga;IIZ)V")
    public final void method953(int arg0, boolean arg1, class166 arg2, class215 arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 instanceof class221) {
            class221 var8 = (class221) arg3;
            if (this.field3120 != null && var8.field3120 != null) {
                this.field3120.method539(var8.field3120, arg4, arg0, arg5, arg1);
            }
        }
        ++field3097;
        if (!arg6) {
            this.field3099 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lr;Z)V")
    public final void method1176(class166 arg0, boolean arg1) {
        ++field3124;
        Object var3 = null;
        class54 var5;
        if (this.field3099 == null && this.field3125) {
            class336 var4 = this.method1454(-118, true, arg0, 262144);
            var5 = var4 != null ? var4.field4963 : null;
        } else {
            var5 = this.field3099;
            this.field3099 = null;
        }
        if (var5 != null) {
            class409.method2472(var5, super.field3023, super.field3024, super.field3029, (boolean[]) null);
        }
        if (arg1) {
            this.method1452((class166) null, (byte) 13, 113);
        }
    }

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "(I)Z")
    public final boolean method951(int arg0) {
        if (arg0 > -26) {
            this.method1177(-60, (class166) null);
        }
        ++field3100;
        return this.field3106;
    }

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "(I)Z")
    public final boolean method1184(int arg0) {
        int var2 = 87 / ((arg0 - -1) / 59);
        ++field3121;
        return this.field3120 == null ? false : this.field3120.method545();
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIII)V")
    public static final void method1453(int arg0, int arg1, int arg2, int arg3) {
        class40 var4 = class153.field2210[arg0][arg1][arg2];
        if (var4 != null) {
            class126 var5 = var4.field665;
            class126 var6 = var4.field662;
            if (var5 != null) {
                var5.field1887 = (short) (var5.field1887 * arg3 / (16 << class310.field4593 - 7));
                var5.field1880 = (short) (var5.field1880 * arg3 / (16 << class310.field4593 - 7));
            }
            if (var6 != null) {
                var6.field1887 = (short) (var6.field1887 * arg3 / (16 << class310.field4593 - 7));
                var6.field1880 = (short) (var6.field1880 * arg3 / (16 << class310.field4593 - 7));
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lr;Let;IIIIIZIZ)V")
    public class221(class166 arg0, class550 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field7775);
        this.field3113 = ~arg1.field7746 != -1 && !arg7;
        super.field3024 = arg4;
        super.field3029 = arg6;
        this.field3109 = arg7;
        this.field3110 = (byte) arg8;
        this.field3115 = (short) arg1.field7783;
        this.field3106 = arg9;
        this.field3125 = arg0.method104() && arg1.field7759 && !this.field3109 && ~class287.field4270.method1625(-101, class328.field4859) != -1;
        int var11 = 2048;
        if (this.field3106) {
            var11 |= 65536;
        }
        class336 var12 = this.method1454(-109, this.field3125, arg0, var11);
        if (var12 != null) {
            this.field3099 = var12.field4963;
            this.field3120 = var12.field4961;
            if (this.field3106) {
                this.field3120 = this.field3120.method532((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)I")
    public final int method1171(byte arg0) {
        if (arg0 < 39) {
            return -3;
        } else {
            ++field3123;
            return this.field3120 != null ? this.field3120.method525() : 0;
        }
    }

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "(I)Z")
    public final boolean method1180(int arg0) {
        if (arg0 <= 100) {
            return true;
        } else {
            ++field3111;
            return this.field3125;
        }
    }

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)V")
    public final void method1174(int arg0) {
        if (this.field3120 != null) {
            this.field3120.method530();
        }
        if (arg0 != -24082) {
            this.field3106 = false;
        }
        ++field3101;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILr;)V")
    public final void method1177(int arg0, class166 arg1) {
        if (arg0 != 0) {
            this.field3109 = true;
        }
        ++field3095;
    }

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "(I)Z")
    public final boolean method1181(int arg0) {
        ++field3117;
        if (arg0 != -1) {
            this.field3109 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)I")
    public final int method1186(int arg0) {
        ++field3105;
        if (arg0 != -9960) {
            this.field3115 = -123;
        }
        return 22;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)I")
    public final int method1179(boolean arg0) {
        ++field3112;
        return !arg0 ? 51 : this.field3115 & 65535;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)I")
    public final int method1175(int arg0) {
        ++field3107;
        return arg0 != 24563 ? -74 : this.field3110;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZLr;I)Lpa;")
    private final class336 method1454(int arg0, boolean arg1, class166 arg2, int arg3) {
        ++field3102;
        class550 var5 = class101.field1572.method2617((byte) -118, 65535 & this.field3115);
        if (arg0 > -83) {
            this.method1177(-58, (class166) null);
        }
        class37 var6;
        class37 var7;
        if (this.field3109) {
            var6 = class499.field7071[super.field3023];
            var7 = class420.field6108[0];
        } else {
            var6 = class420.field6108[super.field3023];
            if (super.field3023 >= 3) {
                var7 = null;
            } else {
                var7 = class420.field6108[super.field3023 + 1];
            }
        }
        return var5.method3111(var6, super.field3018, 3, 22, arg2, arg1, super.field3024, arg3, this.field3110, var7, super.field3029);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method1185(int arg0, int arg1, class166 arg2, int arg3) {
        if (arg0 != -26798) {
            this.method1184(37);
        }
        ++field3116;
        class55 var5 = this.method1452(arg2, (byte) -87, 131072);
        if (var5 != null) {
            class391 var6 = arg2.method130();
            var6.method252(super.field3024, super.field3018, super.field3029);
            return !class676.field9574 ? var5.method529(arg3, arg1, var6, false) : var5.method492(arg3, arg1, var6, false, class341.field5008);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "(I)V")
    public final void method947(int arg0) {
        this.field3106 = false;
        ++field3114;
        if (this.field3120 != null) {
            this.field3120.method536(-65537 & this.field3120.method517());
        }
        int var2 = -100 % ((-44 - arg0) / 42);
    }

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "(B)V")
    public static void method1455(byte arg0) {
        field3103 = null;
        int var1 = -110 % ((arg0 - 57) / 33);
        field3096 = null;
    }
}
