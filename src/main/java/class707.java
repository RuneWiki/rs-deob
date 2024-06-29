import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class707 extends class50 implements class649 {

    @OriginalMember(owner = "client!ma", name = "lb", descriptor = "B")
    private byte field9882;

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "Z")
    private boolean field9877;

    @OriginalMember(owner = "client!ma", name = "nb", descriptor = "Z")
    private boolean field9884;

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "S")
    private short field9880;

    @OriginalMember(owner = "client!ma", name = "ob", descriptor = "Z")
    private boolean field9885;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "Z")
    private boolean field9858;

    @OriginalMember(owner = "client!ma", name = "pb", descriptor = "Lka;")
    private class283 field9886;

    @OriginalMember(owner = "client!ma", name = "mb", descriptor = "Lr;")
    private class706 field9883;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Z")
    public static boolean field9855 = false;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "I")
    public static int field9879;

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!ma", name = "qb", descriptor = "I")
    public static int field9887;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "Lgp;")
    private class551 field9867;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "[Lgs;")
    public static class743[] field9873;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)Z", line = 9)
    public final boolean method283(byte arg0) {
        ++field9878;
        if (arg0 > -33) {
            return true;
        } else {
            return this.field9886 != null ? this.field9886.method1130() : false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)I", line = 24)
    public final int method268(int arg0) {
        if (arg0 != -1) {
            return 47;
        } else {
            ++field9859;
            return this.field9886 != null ? this.field9886.method1120() : 0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(ILha;)Lgp;", line = 35)
    public final class551 method274(int arg0, class545 arg1) {
        ++field9879;
        if (arg0 != 0) {
            return null;
        } else {
            if (this.field9867 == null) {
                this.field9867 = class477.method2821(-1, super.field9489, this.method3976(arg1, arg0, 0), super.field9502, super.field9490);
            }
            return this.field9867;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)I", line = 53)
    public final int method275(int arg0) {
        ++field9875;
        return arg0 != 24263 ? 76 : this.field9880 & 65535;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lha;Lkha;IIIIIZIZ)V", line = 68)
    public class707(class545 arg0, class30 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field403);
        this.field9882 = (byte) arg8;
        super.field9490 = arg4;
        this.field9877 = arg1.field467 != 0 && !arg7;
        super.field9489 = arg6;
        this.field9884 = arg9;
        this.field9880 = (short) arg1.field442;
        this.field9885 = arg7;
        this.field9858 = arg0.method2086() && arg1.field439 && !this.field9885 && class674.field9500.field5151.method2364(0) != 0;
        int var11 = 2048;
        if (this.field9884) {
            var11 |= 65536;
        }
        class693 var12 = this.method3975(arg0, (byte) 51, this.field9858, var11);
        if (var12 != null) {
            this.field9886 = var12.field9689;
            this.field9883 = var12.field9692;
            if (this.field9884) {
                this.field9886 = this.field9886.method1147((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lha;BZI)Lws;", line = 103)
    private final class693 method3975(class545 arg0, byte arg1, boolean arg2, int arg3) {
        if (arg1 != 51) {
            field9873 = null;
        }
        ++field9876;
        class30 var5 = class264.field3604.method3188(65535 & this.field9880, (byte) -57);
        class339 var6;
        class339 var7;
        if (!this.field9885) {
            var6 = class155.field2126[super.field9495];
            if (~super.field9495 <= -4) {
                var7 = null;
            } else {
                var7 = class155.field2126[super.field9495 + 1];
            }
        } else {
            var7 = class155.field2126[0];
            var6 = class435.field5969[super.field9495];
        }
        return var5.method226(arg3, super.field9489, arg2, this.field9882, arg0, super.field9490, super.field9502, 22, var6, 0, var7);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lha;III)Z", line = 134)
    public final boolean method273(class545 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            method3977(-122);
        }
        ++field9857;
        class283 var5 = this.method3976(arg0, 0, 131072);
        if (var5 != null) {
            class723 var6 = arg0.method2087();
            var6.method848(super.field9490, super.field9502, super.field9489);
            return !class286.field3774 ? var5.method1155(arg1, arg2, var6, false, 0) : var5.method1151(arg1, arg2, var6, false, 0, class527.field7375);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Z", line = 161)
    public final boolean method373(byte arg0) {
        ++field9860;
        if (arg0 != -57) {
            method3977(19);
        }
        return this.field9884;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILha;)V", line = 172)
    public final void method272(int arg0, class545 arg1) {
        if (arg0 != 24139) {
            this.method274(0, (class545) null);
        }
        ++field9887;
        Object var3 = null;
        class706 var5;
        if (this.field9883 == null && this.field9858) {
            class693 var4 = this.method3975(arg1, (byte) 51, true, 262144);
            var5 = var4 != null ? var4.field9692 : null;
        } else {
            var5 = this.field9883;
            this.field9883 = null;
        }
        if (var5 != null) {
            class308.method1811(var5, super.field9495, super.field9490, super.field9489, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBZILha;ILig;)V", line = 201)
    public final void method365(int arg0, byte arg1, boolean arg2, int arg3, class545 arg4, int arg5, class674 arg6) {
        if (arg6 instanceof class707) {
            class707 var8 = (class707) arg6;
            if (this.field9886 != null && var8.field9886 != null) {
                this.field9886.method1152(var8.field9886, arg5, arg0, arg3, arg2);
            }
        }
        if (arg1 <= 76) {
            method3977(45);
        }
        ++field9869;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lha;I)Ljl;", line = 220)
    public final class596 method278(class545 arg0, int arg1) {
        ++field9881;
        if (arg1 != 2274) {
            return null;
        } else if (this.field9886 == null) {
            return null;
        } else {
            class723 var3 = arg0.method2087();
            var3.method848(super.field9490, super.field9502, super.field9489);
            class596 var4 = class589.method3502(1, this.field9877, 0);
            if (!class286.field3774) {
                this.field9886.method1168(var3, var4.field8579[0], 0);
            } else {
                this.field9886.method1164(var3, var4.field8579[0], class527.field7375, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)Z", line = 247)
    public final boolean method281(boolean arg0) {
        ++field9864;
        return !arg0 ? false : this.field9858;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(B)V", line = 258)
    public final void method380(byte arg0) {
        this.field9884 = false;
        int var2 = -45 / ((arg0 - -45) / 42);
        ++field9870;
        if (this.field9886 != null) {
            this.field9886.method1118(-65537 & this.field9886.method1135());
        }
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)I", line = 273)
    public final int method282(int arg0) {
        ++field9866;
        if (arg0 != -1) {
            this.field9858 = true;
        }
        return this.field9886 != null ? this.field9886.method1113() : 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lha;II)Lka;", line = 284)
    private final class283 method3976(class545 arg0, int arg1, int arg2) {
        ++field9865;
        if (this.field9886 != null && arg0.method2105(this.field9886.method1135(), arg2) == 0) {
            return this.field9886;
        } else if (arg1 != 0) {
            return null;
        } else {
            class693 var4 = this.method3975(arg0, (byte) 51, false, arg2);
            return var4 != null ? var4.field9689 : null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "(I)V", line = 307)
    public static void method3977(int arg0) {
        field9873 = null;
        if (arg0 != 23479) {
            field9873 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IB)Z", line = 319)
    public static final boolean method3978(int arg0, byte arg1) {
        if (arg1 >= -64) {
            field9855 = false;
        }
        ++field9868;
        return arg0 == 7 || ~arg0 == -10;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)Leaa;", line = 331)
    public static final class380 method3979(int arg0, int arg1) {
        ++field9856;
        class380[] var2 = class220.method1443(-22166);
        for (int var3 = arg0; var3 < var2.length; ++var3) {
            class380 var4 = var2[var3];
            if (var4.field5354 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lha;I)V", line = 355)
    public final void method270(class545 arg0, int arg1) {
        ++field9862;
        Object var3 = null;
        class706 var5;
        if (this.field9883 == null && this.field9858) {
            class693 var4 = this.method3975(arg0, (byte) 51, true, 262144);
            var5 = var4 != null ? var4.field9692 : null;
        } else {
            var5 = this.field9883;
            this.field9883 = null;
        }
        if (var5 != null) {
            class331.method1923(var5, super.field9495, super.field9490, super.field9489, (boolean[]) null);
        }
        if (arg1 != -6060) {
            this.field9883 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)I", line = 385)
    public final int method276(int arg0) {
        ++field9863;
        if (arg0 != -25963) {
            field9855 = true;
        }
        return 22;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 396)
    public final void method279(byte arg0) {
        if (arg0 <= -4) {
            if (this.field9886 != null) {
                this.field9886.method1112();
            }
            ++field9854;
        }
    }

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "(I)Z", line = 411)
    public final boolean method277(int arg0) {
        if (arg0 != 3) {
            this.field9867 = null;
        }
        ++field9861;
        if (this.field9886 != null) {
            return !this.field9886.method1140();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I", line = 426)
    public final int method269(int arg0) {
        if (arg0 != -17174) {
            return -7;
        } else {
            ++field9872;
            return this.field9882;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(ILha;)V", line = 438)
    public final void method271(int arg0, class545 arg1) {
        int var3 = 115 % ((arg0 - -15) / 57);
        ++field9871;
    }
}
