import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class357 extends class373 implements class237 {

    @OriginalMember(owner = "client!rd", name = "rb", descriptor = "B")
    private byte field4897;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "Z")
    private boolean field4873;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "Z")
    private boolean field4867;

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "S")
    private short field4886;

    @OriginalMember(owner = "client!rd", name = "nb", descriptor = "B")
    private byte field4893;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "Z")
    private boolean field4877;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "Z")
    private boolean field4882;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "Lka;")
    public class499 field4879;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "Lr;")
    private class196 field4872;

    @OriginalMember(owner = "client!rd", name = "hb", descriptor = "[J")
    public static long[] field4887 = new long[100];

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "Lfja;")
    public static class783 field4864 = new class783(24, 8);

    @OriginalMember(owner = "client!rd", name = "qb", descriptor = "Lvl;")
    public static class15 field4896 = new class15(80, -1);

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!rd", name = "kb", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!rd", name = "lb", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!rd", name = "mb", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!rd", name = "ob", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!rd", name = "pb", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!rd", name = "jb", descriptor = "Ldg;")
    private class435 field4889;

    @OriginalMember(owner = "client!rd", name = "sb", descriptor = "Lgj;")
    public static class662 field4898;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V", line = 3)
    public final void method1037(int arg0) {
        if (this.field4879 != null) {
            this.field4879.method294();
        }
        ++field4878;
        if (arg0 != -1114) {
            this.field4867 = false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z", line = 18)
    public static final boolean method2201(int arg0, int arg1) {
        ++field4865;
        if (arg1 != 5) {
            method2201(-68, -16);
        }
        return arg0 == 1 || ~arg0 == -4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)Z", line = 29)
    public final boolean method904(int arg0) {
        ++field4876;
        if (arg0 != 0) {
            this.field4877 = true;
        }
        return this.field4867;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(BLha;)Lhga;", line = 40)
    public final class186 method898(byte arg0, class66 arg1) {
        ++field4883;
        if (this.field4879 == null) {
            return null;
        } else {
            class650 var3 = arg1.method533();
            var3.method1868(super.field7396, super.field7405, super.field7398);
            if (arg0 < 123) {
                this.field4886 = 99;
            }
            class186 var4 = class174.method1320(1, this.field4873, 17832);
            if (!class507.field6967) {
                this.field4879.method301(var3, var4.field2877[0], 0);
            } else {
                this.field4879.method310(var3, var4.field2877[0], class90.field1369, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBZLha;)Lcb;", line = 70)
    private final class548 method2202(int arg0, byte arg1, boolean arg2, class66 arg3) {
        ++field4884;
        class445 var5 = class414.field5670.method2319(65535 & this.field4886, false);
        if (arg1 != 127) {
            this.method2202(126, (byte) 103, true, (class66) null);
        }
        class296 var6;
        class296 var7;
        if (this.field4877) {
            var6 = class178.field2805[super.field7404];
            var7 = class142.field2418[0];
        } else {
            var6 = class142.field2418[super.field7404];
            if (super.field7404 < 3) {
                var7 = class142.field2418[super.field7404 + 1];
            } else {
                var7 = null;
            }
        }
        return var5.method2579(4, this.field4897, super.field7398, arg0, arg2, arg3, super.field7405, this.field4893, var7, var6, (class326) null, super.field7396);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)Z", line = 108)
    public final boolean method910(boolean arg0) {
        ++field4875;
        if (arg0) {
            this.field4873 = false;
        }
        return this.field4879 == null ? false : this.field4879.method327();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)I", line = 123)
    public final int method1032(boolean arg0) {
        if (arg0) {
            return 64;
        } else {
            ++field4885;
            return 65535 & this.field4886;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I", line = 136)
    public final int method1033(int arg0) {
        ++field4862;
        if (arg0 > -12) {
            field4864 = null;
        }
        return this.field4893;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lha;Lcn;IIBZI)V", line = 147)
    public final void method903(class66 arg0, class543 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        ++field4866;
        if (!(arg1 instanceof class357)) {
            if (arg1 instanceof class142) {
                class142 var8 = (class142) arg1;
                if (this.field4879 != null && var8.field2381 != null) {
                    this.field4879.method281(var8.field2381, arg2, arg6, arg3, arg5);
                }
            }
        } else {
            class357 var9 = (class357) arg1;
            if (this.field4879 != null && var9.field4879 != null) {
                this.field4879.method281(var9.field4879, arg2, arg6, arg3, arg5);
            }
        }
        if (arg4 < 41) {
            this.field4877 = false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "(I)V", line = 178)
    public static void method2203(int arg0) {
        field4898 = null;
        if (arg0 != 24) {
            method2205(-48);
        }
        field4887 = null;
        field4896 = null;
        field4864 = null;
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)I", line = 192)
    public final int method900(int arg0) {
        ++field4880;
        if (arg0 != 0) {
            this.method1033(-33);
        }
        return this.field4879 == null ? 0 : this.field4879.method298();
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I", line = 208)
    public final int method907(int arg0) {
        if (arg0 != -20425) {
            return -72;
        } else {
            ++field4870;
            return this.field4879 != null ? this.field4879.method276() : 0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lha;B)V", line = 219)
    public final void method1040(class66 arg0, byte arg1) {
        if (arg1 != 55) {
            this.field4897 = 11;
        }
        ++field4891;
        Object var3 = null;
        class196 var5;
        if (this.field4872 == null && this.field4882) {
            class548 var4 = this.method2202(262144, (byte) 127, true, arg0);
            var5 = var4 != null ? var4.field7448 : null;
        } else {
            var5 = this.field4872;
            this.field4872 = null;
        }
        if (var5 != null) {
            class335.method2099(var5, super.field7404, super.field7396, super.field7398, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lha;B)Ldg;", line = 249)
    public final class435 method894(class66 arg0, byte arg1) {
        if (arg1 >= -38) {
            this.field4877 = true;
        }
        ++field4894;
        if (this.field4889 == null) {
            this.field4889 = class538.method3042(super.field7398, super.field7396, (byte) -47, this.method2204(0, arg0, -3403), super.field7405);
        }
        return this.field4889;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILha;I)Lka;", line = 264)
    private final class499 method2204(int arg0, class66 arg1, int arg2) {
        ++field4881;
        if (this.field4879 != null && ~arg1.method482(this.field4879.method300(), arg0) == -1) {
            return this.field4879;
        } else {
            class548 var4 = this.method2202(arg0, (byte) 127, false, arg1);
            if (arg2 != -3403) {
                this.method2202(80, (byte) 89, true, (class66) null);
            }
            return var4 == null ? null : var4.field7450;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lha;I)V", line = 286)
    public final void method1039(class66 arg0, int arg1) {
        ++field4874;
        if (arg1 >= 81) {
            Object var3 = null;
            class196 var5;
            if (this.field4872 == null && this.field4882) {
                class548 var4 = this.method2202(262144, (byte) 127, true, arg0);
                var5 = var4 == null ? null : var4.field7448;
            } else {
                var5 = this.field4872;
                this.field4872 = null;
            }
            if (var5 != null) {
                class622.method3511(var5, super.field7404, super.field7396, super.field7398, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I", line = 314)
    public final int method1034(int arg0) {
        ++field4869;
        return arg0 >= -125 ? 47 : this.field4897;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lha;III)Z", line = 326)
    public final boolean method908(class66 arg0, int arg1, int arg2, int arg3) {
        ++field4871;
        class499 var5 = this.method2204(arg2, arg0, -3403);
        if (var5 != null) {
            class650 var6 = arg0.method533();
            var6.method1868(super.field7396, super.field7405, super.field7398);
            return !class507.field6967 ? var5.method290(arg1, arg3, var6, false, 0) : var5.method286(arg1, arg3, var6, false, 0, class90.field1369);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V", line = 356)
    public final void method905(int arg0) {
        this.field4867 = false;
        ++field4895;
        if (this.field4879 != null) {
            this.field4879.method303(this.field4879.method300() & -65537);
        }
        if (arg0 != -16665) {
            this.field4873 = true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "(I)[Laca;", line = 373)
    public static final class758[] method2205(int arg0) {
        ++field4863;
        return arg0 != 21959 ? null : new class758[] { class325.field4443, class538.field7311, class492.field6767, class571.field8132, class768.field10593, class518.field7041, class673.field9342, class502.field6861, class500.field6845, class564.field7991 };
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLha;)V", line = 384)
    public final void method901(byte arg0, class66 arg1) {
        ++field4890;
        if (arg0 < 114) {
            this.field4882 = true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lha;Lij;IIIIIZIIZ)V", line = 395)
    public class357(class66 arg0, class445 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class130.method1099(arg9, arg8, 2));
        this.field4897 = (byte) arg8;
        super.field7398 = arg6;
        this.field4873 = arg1.field6050 != 0 && !arg7;
        this.field4867 = arg10;
        this.field4886 = (short) arg1.field6104;
        this.field4893 = (byte) arg9;
        super.field7396 = arg4;
        this.field4877 = arg7;
        this.field4882 = arg0.method479() && arg1.field6125 && !this.field4877 && ~class111.field1911.field6717.method3695((byte) 106) != -1;
        int var12 = 2048;
        if (this.field4867) {
            var12 |= 65536;
        }
        class548 var13 = this.method2202(var12, (byte) 127, this.field4882, arg0);
        if (var13 != null) {
            this.field4879 = var13.field7450;
            this.field4872 = var13.field7448;
            if (this.field4867) {
                this.field4879 = this.field4879.method324((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "(I)Z", line = 434)
    public final boolean method902(int arg0) {
        ++field4888;
        if (arg0 != 0) {
            field4898 = null;
        }
        if (this.field4879 == null) {
            return true;
        } else {
            return !this.field4879.method326();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Z", line = 455)
    public final boolean method1036(byte arg0) {
        ++field4868;
        return arg0 > -44 ? true : this.field4882;
    }
}
