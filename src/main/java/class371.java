import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class371 extends class522 implements class41 {

    @OriginalMember(owner = "client!de", name = "E", descriptor = "B")
    private byte field4802;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "Z")
    private boolean field4817;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "S")
    private short field4798;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Z")
    private boolean field4800;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "Z")
    private boolean field4806;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "B")
    private byte field4799;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "Z")
    private boolean field4811;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "Lba;")
    private class264 field4819;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "Lt;")
    private class474 field4808;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "F")
    public static float field4795;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "[[Lqc;")
    public static class524[][] field4797;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(ILya;)V", line = 7)
    public final void method185(int arg0, class38 arg1) {
        ++field4809;
        Object var3 = null;
        if (arg0 == 15397) {
            class264 var5;
            if (this.field4819 == null && this.field4811) {
                class3 var4 = this.method2115(true, (byte) -42, arg1, 262144);
                var5 = var4 == null ? null : var4.field28;
            } else {
                var5 = this.field4819;
                this.field4819 = null;
            }
            if (var5 != null) {
                class481.method2933(var5, this.field4802, super.field7558, super.field7550, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 37)
    public final void method191(int arg0) {
        if (arg0 == 27223) {
            if (this.field4808 != null) {
                this.field4808.method439();
            }
            ++field4810;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)I", line = 51)
    public final int method178(boolean arg0) {
        ++field4796;
        if (!arg0) {
            this.field4800 = false;
        }
        return this.field4799;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILya;II)Z", line = 67)
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        ++field4803;
        if (arg0 <= 66) {
            this.field4798 = 126;
        }
        class474 var5 = this.method2116(-37, 131072, arg1);
        if (var5 != null) {
            class123 var6 = arg1.method369();
            var6.method229(super.field7558, super.field7552, super.field7550);
            return var5.method412(arg2, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 89)
    public final void method180(byte arg0) {
        this.field4806 = false;
        ++field4801;
        if (arg0 != -2) {
            this.method187(-125);
        }
        if (this.field4808 != null) {
            this.field4808.method442(this.field4808.method422() & -65537);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lya;Lho;IIIIZIZ)V", line = 104)
    public class371(class38 arg0, class102 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field1307, arg1.field1308);
        super.field7558 = arg3;
        super.field7550 = arg5;
        this.field4802 = (byte) arg2;
        this.field4817 = ~arg1.field1305 != -1 && !arg6;
        this.field4798 = (short) arg1.field1316;
        this.field4800 = arg6;
        this.field4806 = arg8;
        this.field4799 = (byte) arg7;
        this.field4811 = arg0.method281() && arg1.field1312 && !this.field4800 && class407.field5817.method1681(class377.field4959, -28198) != 0;
        int var10 = 2048;
        if (this.field4806) {
            var10 |= 65536;
        }
        class3 var11 = this.method2115(this.field4811, (byte) -42, arg0, var10);
        if (var11 != null) {
            this.field4819 = var11.field28;
            this.field4808 = var11.field26;
            if (this.field4806) {
                this.field4808 = this.field4808.method416((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ID)V", line = 138)
    public static final void method2113(int arg0, double arg1) {
        if (arg0 != -25529) {
            field4797 = null;
        }
        if (class291.field3707 != arg1) {
            for (int var3 = 0; var3 < 256; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg1));
                class79.field1022[var3] = ~var4 < -256 ? 255 : var4;
            }
            class291.field3707 = arg1;
        }
        ++field4818;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Z", line = 165)
    public final boolean method182(int arg0) {
        if (arg0 != -2286) {
            return true;
        } else {
            ++field4807;
            return this.field4811;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lya;I)V", line = 176)
    public final void method192(class38 arg0, int arg1) {
        ++field4812;
        if (arg1 != 1) {
            this.field4817 = true;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)Z", line = 189)
    public final boolean method194(byte arg0) {
        ++field4794;
        if (arg0 >= -72) {
            this.field4802 = 37;
        }
        return this.field4806;
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V", line = 200)
    public static void method2114(int arg0) {
        if (arg0 != 0) {
            field4795 = 0.6998288F;
        }
        field4797 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLya;)Llo;", line = 214)
    public final class531 method181(boolean arg0, class38 arg1) {
        ++field4814;
        if (this.field4808 == null) {
            return null;
        } else {
            class123 var3 = arg1.method369();
            if (!arg0) {
                return null;
            } else {
                var3.method229(super.field7558, super.field7552, super.field7550);
                class531 var4 = null;
                if (this.field4817) {
                    var4 = class119.method850(1, -117);
                }
                this.field4808.method415(var3, var4 != null ? var4.field7810[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lgg;IZIIILya;)V", line = 240)
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        int var8 = 33 % ((arg5 - 27) / 40);
        ++field4804;
        if (arg0 instanceof class371) {
            class371 var9 = (class371) arg0;
            if (this.field4808 != null && var9.field4808 != null) {
                this.field4808.method435(var9.field4808, arg1, arg4, arg3, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILya;)V", line = 260)
    public final void method184(int arg0, class38 arg1) {
        ++field4820;
        Object var3 = null;
        class264 var5;
        if (this.field4819 == null && this.field4811) {
            class3 var4 = this.method2115(true, (byte) -42, arg1, 262144);
            var5 = var4 != null ? var4.field28 : null;
        } else {
            var5 = this.field4819;
            this.field4819 = null;
        }
        if (arg0 != -5534) {
            this.method187(-103);
        }
        if (var5 != null) {
            class125.method880(var5, this.field4802, super.field7558, super.field7550, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZBLya;I)Ldp;", line = 291)
    private final class3 method2115(boolean arg0, byte arg1, class38 arg2, int arg3) {
        if (arg1 != -42) {
            this.method181(false, (class38) null);
        }
        ++field4815;
        class102 var5 = class315.field4017.method1958(-10091, 65535 & this.field4798);
        class143 var6;
        class143 var7;
        if (!this.field4800) {
            if (~this.field4802 <= -4) {
                var6 = null;
            } else {
                var6 = class531.field7811[this.field4802 + 1];
            }
            var7 = class531.field7811[this.field4802];
        } else {
            var7 = class140.field1808[this.field4802];
            var6 = class531.field7811[0];
        }
        return var5.method770(super.field7558, super.field7552, arg0, var6, 22, arg2, arg3, -64, var7, super.field7550, this.field4799);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILya;)Lt;", line = 321)
    public final class474 method179(int arg0, int arg1, class38 arg2) {
        ++field4805;
        if (arg1 < 72) {
            this.field4811 = false;
        }
        return this.method2116(-70, arg0, arg2);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IILya;)Lt;", line = 332)
    private final class474 method2116(int arg0, int arg1, class38 arg2) {
        ++field4816;
        if (this.field4808 != null && ~arg2.method307(this.field4808.method422(), arg1) == -1) {
            return this.field4808;
        } else {
            int var4 = 110 % ((arg0 - 25) / 35);
            class3 var5 = this.method2115(false, (byte) -42, arg2, arg1);
            return var5 == null ? null : var5.field26;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)I", line = 353)
    public final int method189(int arg0) {
        if (arg0 != 32725) {
            this.field4819 = null;
        }
        ++field4793;
        return 22;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)I", line = 364)
    public final int method187(int arg0) {
        ++field4813;
        return arg0 != 21067 ? 8 : 65535 & this.field4798;
    }
}
