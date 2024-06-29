import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class431 extends class621 implements class238 {

    @OriginalMember(owner = "client!rm", name = "S", descriptor = "B")
    private byte field5672;

    @OriginalMember(owner = "client!rm", name = "eb", descriptor = "B")
    private byte field5684;

    @OriginalMember(owner = "client!rm", name = "cb", descriptor = "S")
    private short field5682;

    @OriginalMember(owner = "client!rm", name = "mb", descriptor = "Z")
    private boolean field5692;

    @OriginalMember(owner = "client!rm", name = "W", descriptor = "Z")
    private boolean field5676;

    @OriginalMember(owner = "client!rm", name = "db", descriptor = "Z")
    private boolean field5683;

    @OriginalMember(owner = "client!rm", name = "ub", descriptor = "Z")
    private boolean field5700;

    @OriginalMember(owner = "client!rm", name = "bb", descriptor = "Lka;")
    public class498 field5681;

    @OriginalMember(owner = "client!rm", name = "ib", descriptor = "Lr;")
    private class196 field5688;

    @OriginalMember(owner = "client!rm", name = "T", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!rm", name = "U", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!rm", name = "X", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!rm", name = "Y", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!rm", name = "Z", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!rm", name = "fb", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!rm", name = "gb", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!rm", name = "hb", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!rm", name = "jb", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!rm", name = "kb", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!rm", name = "lb", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!rm", name = "nb", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!rm", name = "ob", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!rm", name = "pb", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!rm", name = "qb", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!rm", name = "rb", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!rm", name = "sb", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!rm", name = "tb", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!rm", name = "wb", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!rm", name = "xb", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!rm", name = "vb", descriptor = "Loba;")
    private class276 field5701;

    @OriginalMember(owner = "client!rm", name = "ab", descriptor = "Lft;")
    public static class4 field5680;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)Z", line = 3)
    public final boolean method504(byte arg0) {
        ++field5679;
        if (arg0 != -24) {
            field5680 = null;
        }
        return this.field5681 == null ? false : this.field5681.method380();
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(Z)V", line = 20)
    public final void method530(boolean arg0) {
        ++field5699;
        this.field5692 = arg0;
        if (this.field5681 != null) {
            this.field5681.method378(-65537 & this.field5681.method396());
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Lha;I)V", line = 35)
    public final void method500(class66 arg0, int arg1) {
        ++field5695;
        if (arg1 != -1) {
            this.field5676 = false;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)I", line = 46)
    public final int method929(byte arg0) {
        ++field5694;
        if (arg0 != -45) {
            field5680 = null;
        }
        return this.field5672;
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(Z)Z", line = 57)
    public final boolean method503(boolean arg0) {
        if (arg0) {
            this.field5684 = -68;
        }
        ++field5677;
        if (this.field5681 == null) {
            return true;
        } else {
            return !this.field5681.method391();
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLha;)Loba;", line = 73)
    public final class276 method507(boolean arg0, class66 arg1) {
        ++field5703;
        if (arg0) {
            return null;
        } else {
            if (this.field5701 == null) {
                this.field5701 = class792.method4369(super.field809, super.field823, this.method2557(0, arg1, 92), (byte) -5, super.field813);
            }
            return this.field5701;
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)Z", line = 88)
    public final boolean method935(int arg0) {
        if (arg0 != 25271) {
            method2556(false, -64);
        }
        ++field5690;
        return this.field5700;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lha;IIZ)Lwv;", line = 99)
    private final class37 method2554(class66 arg0, int arg1, int arg2, boolean arg3) {
        ++field5702;
        if (arg2 <= 28) {
            method2555(122);
        }
        class174 var5 = class379.field4811.method4192(27324, this.field5682 & 65535);
        class296 var6;
        class296 var7;
        if (!this.field5683) {
            if (super.field811 >= 3) {
                var6 = null;
            } else {
                var6 = class707.field9933[super.field811 + 1];
            }
            var7 = class707.field9933[super.field811];
        } else {
            var7 = class704.field9910[super.field811];
            var6 = class707.field9933[0];
        }
        return var5.method1181(super.field823, super.field813, var7, arg0, (byte) 105, var6, arg1, (class481) null, arg3, this.field5672, this.field5684, super.field809);
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)I", line = 131)
    public final int method508(int arg0) {
        ++field5697;
        if (arg0 != -4798) {
            this.field5683 = true;
        }
        return this.field5681 == null ? 0 : this.field5681.method394();
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBILha;)Z", line = 144)
    public final boolean method501(int arg0, byte arg1, int arg2, class66 arg3) {
        ++field5673;
        class498 var5 = this.method2557(131072, arg3, 113);
        if (var5 != null) {
            class778 var6 = arg3.method576();
            var6.method130(super.field823, super.field809, super.field813);
            return !class502.field7084 ? var5.method363(arg0, arg2, var6, false, 0) : var5.method379(arg0, arg2, var6, false, 0, class621.field8528);
        } else {
            return arg1 <= 19;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILha;)V", line = 166)
    public final void method930(int arg0, class66 arg1) {
        ++field5691;
        Object var3 = null;
        class196 var5;
        if (this.field5688 == null && this.field5700) {
            class37 var4 = this.method2554(arg1, 262144, 117, true);
            var5 = var4 != null ? var4.field550 : null;
        } else {
            var5 = this.field5688;
            this.field5688 = null;
        }
        if (var5 != null) {
            class793.method4371(var5, super.field811, super.field823, super.field813, (boolean[]) null);
        }
        if (arg0 != 14353) {
            this.field5681 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "(I)V", line = 194)
    public static void method2555(int arg0) {
        if (arg0 == 0) {
            field5680 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)V", line = 204)
    public static final void method2556(boolean arg0, int arg1) {
        ++field5689;
        class170.method1163(-20072);
        int var2 = class116.field1481.method2618(arg1, -111).field2045;
        if (var2 != 0) {
            int var3 = class2.field30.field8010[arg1];
            if (!arg0) {
                method2556(true, -103);
            }
            if (~var2 == -7) {
                class87.field1158 = var3;
            }
            if (var2 == 5) {
                class25.field373 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lgda;Lha;IIZII)V", line = 230)
    public final void method524(class61 arg0, class66 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 instanceof class431) {
            class431 var8 = (class431) arg0;
            if (this.field5681 != null && var8.field5681 != null) {
                this.field5681.method384(var8.field5681, arg5, arg3, arg2, arg4);
            }
        } else if (arg0 instanceof class419) {
            class419 var9 = (class419) arg0;
            if (this.field5681 != null && var9.field5460 != null) {
                this.field5681.method384(var9.field5460, arg5, arg3, arg2, arg4);
            }
        }
        ++field5687;
        if (arg6 >= -6) {
            this.method929((byte) 119);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I", line = 263)
    public final int method927(int arg0) {
        if (arg0 != -24482) {
            this.method927(79);
        }
        ++field5675;
        return this.field5682 & 65535;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V", line = 276)
    public final void method936(boolean arg0) {
        if (this.field5681 != null) {
            this.field5681.method392();
        }
        ++field5698;
        if (arg0) {
            this.method935(-5);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(ILha;)Lrk;", line = 290)
    public final class35 method502(int arg0, class66 arg1) {
        ++field5696;
        if (this.field5681 == null) {
            return null;
        } else {
            int var3 = -26 % ((arg0 - 47) / 63);
            class778 var4 = arg1.method576();
            var4.method130(super.field823, super.field809, super.field813);
            class35 var5 = class415.method2476(1, (byte) -83, this.field5676);
            if (!class502.field7084) {
                this.field5681.method355(var4, var5.field537[0], 0);
            } else {
                this.field5681.method388(var4, var5.field537[0], class621.field8528, 0);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "(I)I", line = 316)
    public final int method509(int arg0) {
        int var2 = 32 % ((arg0 - -38) / 56);
        ++field5685;
        return this.field5681 == null ? 0 : this.field5681.method404();
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILha;I)Lka;", line = 326)
    private final class498 method2557(int arg0, class66 arg1, int arg2) {
        if (arg2 < 80) {
            this.field5682 = 27;
        }
        ++field5678;
        if (this.field5681 != null && ~arg1.method620(this.field5681.method396(), arg0) == -1) {
            return this.field5681;
        } else {
            class37 var4 = this.method2554(arg1, arg0, 82, false);
            return var4 != null ? var4.field549 : null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(Z)Z", line = 350)
    public final boolean method531(boolean arg0) {
        ++field5674;
        if (arg0) {
            this.field5672 = -106;
        }
        return this.field5692;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lha;I)V", line = 364)
    public final void method931(class66 arg0, int arg1) {
        ++field5686;
        Object var3 = null;
        int var4 = -86 % ((28 - arg1) / 63);
        class196 var6;
        if (this.field5688 == null && this.field5700) {
            class37 var5 = this.method2554(arg0, 262144, 65, true);
            var6 = var5 != null ? var5.field550 : null;
        } else {
            var6 = this.field5688;
            this.field5688 = null;
        }
        if (var6 != null) {
            class418.method2496(var6, super.field811, super.field823, super.field813, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lha;Ltba;IIIIIZIIZ)V", line = 391)
    public class431(class66 arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class438.method2585(arg8, (byte) 127, arg9));
        this.field5672 = (byte) arg8;
        this.field5684 = (byte) arg9;
        this.field5682 = (short) arg1.field2166;
        super.field823 = arg4;
        this.field5692 = arg10;
        this.field5676 = ~arg1.field2171 != -1 && !arg7;
        this.field5683 = arg7;
        super.field813 = arg6;
        this.field5700 = arg0.method646() && arg1.field2141 && !this.field5683 && class118.field1503.field10672.method4113(0) != 0;
        int var12 = 2048;
        if (this.field5692) {
            var12 |= 65536;
        }
        class37 var13 = this.method2554(arg0, var12, 51, this.field5700);
        if (var13 != null) {
            this.field5681 = var13.field549;
            this.field5688 = var13.field550;
            if (this.field5692) {
                this.field5681 = this.field5681.method364((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)I", line = 427)
    public final int method928(int arg0) {
        if (arg0 != 13272) {
            this.field5701 = null;
        }
        ++field5693;
        return this.field5684;
    }
}
