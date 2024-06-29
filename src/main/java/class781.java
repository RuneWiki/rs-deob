import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class781 extends class377 implements class238 {

    @OriginalMember(owner = "client!hda", name = "eb", descriptor = "B")
    private byte field10772;

    @OriginalMember(owner = "client!hda", name = "rb", descriptor = "S")
    private short field10785;

    @OriginalMember(owner = "client!hda", name = "X", descriptor = "Z")
    private boolean field10765;

    @OriginalMember(owner = "client!hda", name = "gb", descriptor = "Z")
    private boolean field10774;

    @OriginalMember(owner = "client!hda", name = "ob", descriptor = "B")
    private byte field10782;

    @OriginalMember(owner = "client!hda", name = "lb", descriptor = "Z")
    private boolean field10779;

    @OriginalMember(owner = "client!hda", name = "I", descriptor = "Lka;")
    private class498 field10758;

    @OriginalMember(owner = "client!hda", name = "ab", descriptor = "Lr;")
    private class196 field10768;

    @OriginalMember(owner = "client!hda", name = "qb", descriptor = "I")
    public static int field10784 = 1409;

    @OriginalMember(owner = "client!hda", name = "R", descriptor = "I")
    public static int field10759;

    @OriginalMember(owner = "client!hda", name = "S", descriptor = "I")
    public static int field10760;

    @OriginalMember(owner = "client!hda", name = "T", descriptor = "I")
    public static int field10761;

    @OriginalMember(owner = "client!hda", name = "U", descriptor = "I")
    public static int field10762;

    @OriginalMember(owner = "client!hda", name = "V", descriptor = "I")
    public static int field10763;

    @OriginalMember(owner = "client!hda", name = "W", descriptor = "I")
    public static int field10764;

    @OriginalMember(owner = "client!hda", name = "Y", descriptor = "I")
    public static int field10766;

    @OriginalMember(owner = "client!hda", name = "Z", descriptor = "I")
    public static int field10767;

    @OriginalMember(owner = "client!hda", name = "bb", descriptor = "I")
    public static int field10769;

    @OriginalMember(owner = "client!hda", name = "cb", descriptor = "I")
    public static int field10770;

    @OriginalMember(owner = "client!hda", name = "db", descriptor = "I")
    public static int field10771;

    @OriginalMember(owner = "client!hda", name = "fb", descriptor = "I")
    public static int field10773;

    @OriginalMember(owner = "client!hda", name = "hb", descriptor = "I")
    public static int field10775;

    @OriginalMember(owner = "client!hda", name = "ib", descriptor = "I")
    public static int field10776;

    @OriginalMember(owner = "client!hda", name = "jb", descriptor = "I")
    public static int field10777;

    @OriginalMember(owner = "client!hda", name = "mb", descriptor = "I")
    public static int field10780;

    @OriginalMember(owner = "client!hda", name = "nb", descriptor = "I")
    public static int field10781;

    @OriginalMember(owner = "client!hda", name = "pb", descriptor = "I")
    public static int field10783;

    @OriginalMember(owner = "client!hda", name = "kb", descriptor = "Loba;")
    private class276 field10778;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)I")
    public final int method508(int arg0) {
        ++field10775;
        if (arg0 != -4798) {
            field10784 = 31;
        }
        return this.field10758 == null ? 0 : this.field10758.method394();
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)I")
    public final int method927(int arg0) {
        if (arg0 != -24482) {
            this.method4329(-122, false, (class66) null, false);
        }
        ++field10780;
        return 65535 & this.field10785;
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(Z)Z")
    public final boolean method503(boolean arg0) {
        if (arg0) {
            this.field10765 = false;
        }
        ++field10776;
        if (this.field10758 == null) {
            return true;
        } else {
            return !this.field10758.method391();
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(ILha;)Lrk;")
    public final class35 method502(int arg0, class66 arg1) {
        ++field10762;
        if (this.field10758 == null) {
            return null;
        } else {
            class778 var3 = arg1.method576();
            int var4 = -51 / ((47 - arg0) / 63);
            var3.method130(super.field823 - -super.field4765, super.field809, super.field4767 + super.field813);
            class35 var5 = class415.method2476(1, (byte) -90, this.field10774);
            if (!class502.field7084) {
                this.field10758.method355(var3, var5.field537[0], 0);
            } else {
                this.field10758.method388(var3, var5.field537[0], class621.field8528, 0);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IZLha;Z)Lwv;")
    private final class37 method4329(int arg0, boolean arg1, class66 arg2, boolean arg3) {
        if (!arg1) {
            this.field10772 = -50;
        }
        ++field10770;
        class174 var5 = class379.field4811.method4192(27324, 65535 & this.field10785);
        class296 var6;
        class296 var7;
        if (!this.field10765) {
            if (~super.field811 <= -4) {
                var6 = null;
            } else {
                var6 = class707.field9933[super.field811 + 1];
            }
            var7 = class707.field9933[super.field811];
        } else {
            var7 = class704.field9910[super.field811];
            var6 = class707.field9933[0];
        }
        return var5.method1181(super.field823, super.field813, var7, arg2, (byte) 118, var6, arg0, (class481) null, arg3, this.field10772, this.field10782, super.field809);
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lha;Ltba;IIIIIZIIII)V")
    public class781(class66 arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field813 = arg6;
        this.field10772 = (byte) arg10;
        super.field823 = arg4;
        this.field10785 = (short) arg1.field2166;
        this.field10765 = arg7;
        this.field10774 = arg1.field2171 != 0 && !arg7;
        this.field10782 = (byte) arg11;
        this.field10779 = arg0.method646() && arg1.field2141 && !this.field10765 && ~class118.field1503.field10672.method4113(0) != -1;
        class37 var13 = this.method4329(2048, true, arg0, this.field10779);
        if (var13 != null) {
            this.field10758 = var13.field549;
            this.field10768 = var13.field550;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)V")
    public final void method936(boolean arg0) {
        if (this.field10758 != null) {
            this.field10758.method392();
        }
        ++field10760;
        if (arg0) {
            this.field10758 = null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lha;I)V")
    public final void method931(class66 arg0, int arg1) {
        ++field10766;
        int var3 = 80 % ((28 - arg1) / 63);
        Object var4 = null;
        class196 var6;
        if (this.field10768 == null && this.field10779) {
            class37 var5 = this.method4329(262144, true, arg0, true);
            var6 = var5 != null ? var5.field550 : null;
        } else {
            var6 = this.field10768;
            this.field10768 = null;
        }
        if (var6 != null) {
            class418.method2496(var6, super.field811, super.field823, super.field813, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "(B)Z")
    public final boolean method504(byte arg0) {
        ++field10763;
        if (arg0 != -24) {
            return false;
        } else {
            return this.field10758 == null ? false : this.field10758.method380();
        }
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)Z")
    public final boolean method935(int arg0) {
        ++field10771;
        if (arg0 != 25271) {
            this.method930(117, (class66) null);
        }
        return this.field10779;
    }

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "(I)I")
    public final int method509(int arg0) {
        ++field10764;
        int var2 = -66 % ((arg0 - -38) / 56);
        return this.field10758 == null ? 0 : this.field10758.method404();
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)I")
    public final int method929(byte arg0) {
        ++field10769;
        if (arg0 != -45) {
            this.method931((class66) null, -80);
        }
        return this.field10772;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lha;IB)Lka;")
    private final class498 method4330(class66 arg0, int arg1, byte arg2) {
        ++field10777;
        if (this.field10758 != null && arg0.method620(this.field10758.method396(), arg1) == 0) {
            return this.field10758;
        } else if (arg2 != -82) {
            return null;
        } else {
            class37 var4 = this.method4329(arg1, true, arg0, false);
            return var4 == null ? null : var4.field549;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IBLjava/awt/Canvas;I)Lnda;")
    public static final class584 method4331(int arg0, byte arg1, Canvas arg2, int arg3) {
        ++field10767;
        int var4 = -32 % ((arg1 - -26) / 39);
        try {
            Class var5 = Class.forName("cia");
            class584 var6 = (class584) var5.newInstance();
            var6.method1869(arg2, (byte) 115, arg0, arg3);
            return var6;
        } catch (Throwable var8) {
            class317 var7 = new class317();
            var7.method1869(arg2, (byte) 109, arg0, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IBILha;)Z")
    public final boolean method501(int arg0, byte arg1, int arg2, class66 arg3) {
        ++field10759;
        if (arg1 <= 19) {
            this.field10765 = false;
        }
        class498 var5 = this.method4330(arg3, 131072, (byte) -82);
        if (var5 != null) {
            class778 var6 = arg3.method576();
            var6.method130(super.field823, super.field809, super.field813);
            return !class502.field7084 ? var5.method363(arg0, arg2, var6, false, 0) : var5.method379(arg0, arg2, var6, false, 0, class621.field8528);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(Lha;I)V")
    public final void method500(class66 arg0, int arg1) {
        if (arg1 != -1) {
            this.field10778 = null;
        }
        ++field10761;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)I")
    public final int method928(int arg0) {
        if (arg0 != 13272) {
            return 95;
        } else {
            ++field10783;
            return this.field10782;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZLha;)Loba;")
    public final class276 method507(boolean arg0, class66 arg1) {
        ++field10781;
        if (arg0) {
            this.method507(false, (class66) null);
        }
        if (this.field10778 == null) {
            this.field10778 = class792.method4369(super.field809, super.field823, this.method4330(arg1, 0, (byte) -82), (byte) -5, super.field813);
        }
        return this.field10778;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILha;)V")
    public final void method930(int arg0, class66 arg1) {
        ++field10773;
        Object var3 = null;
        if (arg0 == 14353) {
            class196 var5;
            if (this.field10768 == null && this.field10779) {
                class37 var4 = this.method4329(262144, true, arg1, true);
                var5 = var4 != null ? var4.field550 : null;
            } else {
                var5 = this.field10768;
                this.field10768 = null;
            }
            if (var5 != null) {
                class793.method4371(var5, super.field811, super.field823, super.field813, (boolean[]) null);
            }
        }
    }
}
