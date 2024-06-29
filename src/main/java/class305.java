import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class305 extends class180 implements class302 {

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "S")
    private short field4820;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "B")
    private byte field4804;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "Z")
    private boolean field4815;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "Z")
    private boolean field4816;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "B")
    private byte field4819;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "Z")
    private boolean field4814;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "Lha;")
    private class54 field4801;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "Lda;")
    private class55 field4812;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "[Lqg;")
    public static class428[] field4811 = new class428[14];

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "Lll;")
    private class334 field4805;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)I")
    public final int method393(int arg0) {
        if (arg0 != 0) {
            this.method406((byte) -77);
        }
        ++field4810;
        return this.field4812 == null ? 0 : this.field4812.method623();
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)I")
    public final int method401(byte arg0) {
        ++field4802;
        if (arg0 <= 50) {
            this.field4815 = true;
        }
        return this.field4804;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lr;Llr;IIIIIZIIII)V")
    public class305(class167 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field9696 = arg4;
        this.field4820 = (short) arg1.field9825;
        this.field4804 = (byte) arg11;
        super.field9705 = arg6;
        this.field4815 = arg7;
        this.field4816 = arg1.field9830 != 0 && !arg7;
        this.field4819 = (byte) arg10;
        this.field4814 = arg0.method262() && arg1.field9812 && !this.field4815 && ~class17.field282.method2133(true, class497.field7259) != -1;
        class564 var13 = this.method2116(2048, arg0, this.field4814, false);
        if (var13 != null) {
            this.field4801 = var13.field8103;
            this.field4812 = var13.field8102;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLr;)Lll;")
    public final class334 method408(byte arg0, class167 arg1) {
        ++field4798;
        if (arg0 != 111) {
            this.field4805 = null;
        }
        if (this.field4805 == null) {
            this.field4805 = class166.method1342(this.method2119(-1, arg1, 0), super.field9705, super.field9696, super.field9701, 30640);
        }
        return this.field4805;
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)Z")
    public final boolean method414(int arg0) {
        ++field4817;
        if (arg0 != 0) {
            this.field4812 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILr;ZZ)Lraa;")
    private final class564 method2116(int arg0, class167 arg1, boolean arg2, boolean arg3) {
        ++field4808;
        class698 var5 = class213.field3537.method94(this.field4820 & 65535, (byte) -42);
        if (arg3) {
            this.method392(true, 123, (class167) null, 5);
        }
        class37 var6;
        class37 var7;
        if (!this.field4815) {
            var6 = class491.field7187[super.field9703];
            if (~super.field9703 <= -4) {
                var7 = null;
            } else {
                var7 = class491.field7187[super.field9703 - -1];
            }
        } else {
            var6 = class493.field7208[super.field9703];
            var7 = class491.field7187[0];
        }
        return var5.method3933(super.field9696, var6, arg1, arg0, var7, this.field4804, -1, arg2, super.field9701, this.field4819, super.field9705);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lr;I)V")
    public final void method407(class167 arg0, int arg1) {
        ++field4800;
        Object var3 = null;
        class54 var5;
        if (this.field4801 == null && this.field4814) {
            class564 var4 = this.method2116(262144, arg0, true, false);
            var5 = var4 == null ? null : var4.field8103;
        } else {
            var5 = this.field4801;
            this.field4801 = null;
        }
        if (var5 != null) {
            class458.method2871(var5, super.field9703, super.field9696, super.field9705, (boolean[]) null);
        }
        int var6 = -109 % ((-10 - arg1) / 40);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static void method2117(boolean arg0) {
        field4811 = null;
        if (arg0) {
            field4811 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)I")
    public final int method413(byte arg0) {
        ++field4799;
        return arg0 != 11 ? 31 : this.field4819;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public final void method409(int arg0) {
        ++field4821;
        if (arg0 == -7728) {
            if (this.field4812 != null) {
                this.field4812.method626();
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I")
    public final int method394(byte arg0) {
        ++field4809;
        int var2 = 11 % ((arg0 - -14) / 51);
        return this.field4820 & 65535;
    }

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "(I)V")
    public static final void method2118(int arg0) {
        ++field4807;
        if (!class17.field282.method2089(class497.field7259, arg0) && ~class70.field887 != ~class423.field6439) {
            class234.method1696(false, 9085, class48.field641, 11, class456.field6843);
        } else {
            class418.method2669(class627.field8857, 256);
            if (class423.field6439 != class257.field4080) {
                class412.method2622(1);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(ILr;)Lod;")
    public final class468 method403(int arg0, class167 arg1) {
        ++field4818;
        if (this.field4812 == null) {
            return null;
        } else {
            if (arg0 >= -38) {
                field4811 = null;
            }
            class393 var3 = arg1.method339();
            var3.method503(super.field3027 + super.field9696, super.field9701, super.field3024 + super.field9705);
            class468 var4 = null;
            if (this.field4816) {
                var4 = class429.method2720(1, 0);
            }
            if (!class534.field7778) {
                this.field4812.method606(var3, var4 == null ? null : var4.field6948[0], 0);
            } else {
                this.field4812.method613(var3, var4 != null ? var4.field6948[0] : null, class609.field8652, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILr;I)Lda;")
    private final class55 method2119(int arg0, class167 arg1, int arg2) {
        ++field4806;
        if (this.field4812 != null && arg1.method323(this.field4812.method651(), arg2) == 0) {
            return this.field4812;
        } else if (arg0 != -1) {
            return null;
        } else {
            class564 var4 = this.method2116(arg2, arg1, false, false);
            return var4 != null ? var4.field8102 : null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lr;Z)V")
    public final void method412(class167 arg0, boolean arg1) {
        if (arg1) {
            this.method401((byte) 120);
        }
        ++field4813;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZILr;I)Z")
    public final boolean method392(boolean arg0, int arg1, class167 arg2, int arg3) {
        if (arg0) {
            this.field4815 = false;
        }
        ++field4822;
        class55 var5 = this.method2119(-1, arg2, 131072);
        if (var5 != null) {
            class393 var6 = arg2.method339();
            var6.method503(super.field9696, super.field9701, super.field9705);
            return class534.field7778 ? var5.method598(arg3, arg1, var6, false, class609.field8652) : var5.method648(arg3, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(B)I")
    public final int method406(byte arg0) {
        if (arg0 <= 108) {
            this.field4801 = null;
        }
        ++field4795;
        return this.field4812 == null ? 0 : this.field4812.method612();
    }

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "(I)Z")
    public final boolean method402(int arg0) {
        ++field4797;
        if (arg0 != 623404585) {
            this.field4815 = false;
        }
        return this.field4812 != null ? this.field4812.method614() : false;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Z")
    public final boolean method395(int arg0) {
        ++field4796;
        if (arg0 != -29400) {
            this.method409(-74);
        }
        return this.field4814;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILr;)V")
    public final void method396(int arg0, class167 arg1) {
        ++field4803;
        if (arg0 != -32646) {
            this.field4801 = null;
        }
        Object var3 = null;
        class54 var5;
        if (this.field4801 == null && this.field4814) {
            class564 var4 = this.method2116(262144, arg1, true, false);
            var5 = var4 == null ? null : var4.field8103;
        } else {
            var5 = this.field4801;
            this.field4801 = null;
        }
        if (var5 != null) {
            class143.method1214(var5, super.field9703, super.field9696, super.field9705, (boolean[]) null);
        }
    }
}
