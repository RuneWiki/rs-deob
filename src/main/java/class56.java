import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class56 extends class144 {

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    private int field644 = 0;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    private int field640 = -32768;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    private int field648 = 0;

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "I")
    private int field660 = -1;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "I")
    private int field654 = 0;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "Z")
    public boolean field651 = false;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "I")
    private int field658;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "Lhi;")
    private class177 field638;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field656 = 1401;

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "I")
    public static int field663 = -1;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!dl", name = "bb", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "Lkw;")
    private class211 field639;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "[J")
    public static long[] field655;

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 4)
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field662 = arg0;
        this.field644 = arg12;
        this.field641 = arg1 + arg2;
        this.field658 = arg4;
        class576 var14 = class141.field1735.method3667(false, this.field662);
        int var15 = var14.field8318;
        if (var15 != -1) {
            this.field638 = class259.field3686.method2961(var15, 8);
            this.field651 = false;
        } else {
            this.field651 = true;
        }
        if (~this.field641 == ~arg2) {
            class405.method2571(false, super.field1764, -59, super.field1768, super.field1757, this.field638, this.field648);
        }
    }

    @OriginalMember(owner = "client!dl", name = "finalize", descriptor = "()V", line = 37)
    protected final void finalize() {
        if (this.field639 != null) {
            this.field639.method1344();
        }
        ++field645;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Loa;B)Laca;", line = 49)
    public final class630 method88(class605 arg0, byte arg1) {
        ++field642;
        class327 var3 = this.method411(this.field662, 3, 2048 | (~this.field644 == -1 ? 0 : 5), arg0);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field644 != -1) {
                var3.method1385(this.field644 * 2048);
            }
            class364 var4 = arg0.method342();
            var4.method2014(super.field1764, super.field1769, super.field1768);
            if (arg1 >= -127) {
                field656 = 76;
            }
            this.method416(var3, 0, arg0, var4);
            if (this.field639 != null) {
                class33 var5 = this.field639.method1334();
                arg0.method307(var3, var5, var4, (class219) null, 0);
            } else {
                var3.method1380(var4, (class219) null, 0);
            }
            this.field640 = var3.method1379();
            return null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIILoa;)Lba;", line = 84)
    private final class327 method411(int arg0, int arg1, int arg2, class605 arg3) {
        ++field657;
        class576 var5 = class141.field1735.method3667(false, arg0);
        class132 var6 = class544.field7780[super.field1757];
        class132 var7 = arg1 <= this.field658 ? null : class544.field7780[this.field658 + 1];
        return this.field651 ? var5.method3344((byte) 2, var6, class259.field3686, arg2, super.field1764, 0, -1, -1, arg3, true, var7, super.field1768, super.field1769) : var5.method3344((byte) 2, var6, class259.field3686, arg2, super.field1764, this.field654, this.field660, this.field648, arg3, true, var7, super.field1768, super.field1769);
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)Z", line = 100)
    public final boolean method84(int arg0) {
        if (arg0 != 1630) {
            this.finalize();
        }
        ++field653;
        return false;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V", line = 112)
    public final void method412(int arg0, boolean arg1) {
        if (!arg1) {
            field663 = 107;
        }
        ++field637;
        if (!this.field651) {
            this.field654 += arg0;
            while (~this.field638.field2150[this.field648] > ~this.field654) {
                this.field654 -= this.field638.field2150[this.field648];
                ++this.field648;
                if (this.field638.field2181.length <= this.field648) {
                    this.field651 = true;
                    break;
                }
            }
            if (!this.field651) {
                class405.method2571(false, super.field1764, 120, super.field1768, super.field1757, this.field638, this.field648);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)I", line = 145)
    public final int method413(byte arg0) {
        ++field664;
        if (arg0 != 58) {
            this.method84(-53);
        }
        return this.field640;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(B)V", line = 156)
    public static void method414(byte arg0) {
        if (arg0 != 20) {
            field655 = null;
        }
        field655 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 172)
    public final void method415(int arg0) {
        if (arg0 == -1533) {
            ++field650;
            if (this.field639 != null) {
                this.field639.method1344();
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lba;ILoa;Lq;)V", line = 188)
    private final void method416(class327 arg0, int arg1, class605 arg2, class364 arg3) {
        ++field647;
        arg0.method1371(arg3);
        if (arg1 == 0) {
            class75[] var5 = arg0.method1353();
            class522[] var6 = arg0.method1348();
            if ((this.field639 == null || this.field639.field2798) && (var5 != null || var6 != null)) {
                this.field639 = class211.method1337(class287.field3982, true);
            }
            if (this.field639 != null) {
                this.field639.method1343(arg2, (long) class287.field3982, var5, var6, false);
                this.field639.method1332(super.field1757, super.field1773, super.field1762, super.field1758, super.field1761);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Loa;I)V", line = 213)
    public final void method90(class605 arg0, int arg1) {
        ++field659;
        class327 var3 = this.method411(this.field662, 3, 0, arg0);
        if (var3 != null) {
            class364 var4 = arg0.method342();
            var4.method2014(super.field1764, super.field1769, super.field1768);
            this.method416(var3, 0, arg0, var4);
        }
        if (arg1 != -5) {
            this.method413((byte) -77);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Loa;I)Lew;", line = 238)
    public final class425 method100(class605 arg0, int arg1) {
        ++field649;
        return arg1 != 28286 ? null : null;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V", line = 252)
    public final void method96(byte arg0) {
        ++field643;
        if (arg0 == -76) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILoa;II)V", line = 268)
    public static final void method417(int arg0, class605 arg1, int arg2, int arg3) {
        class108.field1302 = arg1;
        class316.field4605 = new class636[arg0][arg2];
        ++field661;
        if (class244.field3461 != null) {
            class266.field3755 = class82.method545(class244.field3461[2], arg3 + 8, class244.field3461[4], class244.field3461[5], class244.field3461[3], class244.field3461[0], class244.field3461[1]);
        }
        class158.field1958 = new class636();
        class171.method983(arg3 + -133);
        if (arg3 != 5) {
            method414((byte) 5);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIILva;Loa;ZI)V", line = 293)
    public final void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6) {
        ++field646;
        if (arg0 != 7) {
            this.field658 = -16;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILoa;I)Z", line = 306)
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        if (arg0 != -10503) {
            this.field638 = null;
        }
        ++field652;
        return false;
    }
}
