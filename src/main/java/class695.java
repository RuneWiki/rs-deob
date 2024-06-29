import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class695 extends class516 implements class392 {

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "Z")
    private boolean field9729;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "Z")
    private boolean field9724;

    @OriginalMember(owner = "client!ua", name = "lb", descriptor = "B")
    private byte field9743;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "S")
    private short field9732;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "B")
    private byte field9738;

    @OriginalMember(owner = "client!ua", name = "nb", descriptor = "Z")
    private boolean field9745;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "Z")
    private boolean field9731;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "Lka;")
    public class500 field9742;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "Lr;")
    private class195 field9734;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "[F")
    public static float[] field9735 = new float[2];

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "Ldha;")
    public static class84 field9727 = new class84();

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
    public static int field9739 = 0;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field9720;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field9733;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!ua", name = "mb", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!ua", name = "ob", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!ua", name = "pb", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!ua", name = "qb", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!ua", name = "rb", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!ua", name = "sb", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!ua", name = "tb", descriptor = "I")
    public static int field9751;

    @OriginalMember(owner = "client!ua", name = "vb", descriptor = "I")
    public static int field9753;

    @OriginalMember(owner = "client!ua", name = "ub", descriptor = "Lel;")
    private class574 field9752;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)Z")
    public final boolean method19(int arg0) {
        ++field9744;
        if (arg0 >= -87) {
            this.method33(53, -86, 22, (class65) null);
        }
        if (this.field9742 != null) {
            return !this.field9742.method317();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "(I)Z")
    public final boolean method59(int arg0) {
        ++field9720;
        if (arg0 != -1) {
            this.method34((class65) null, -116);
        }
        return this.field9745;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I")
    public final int method18(int arg0) {
        ++field9737;
        return arg0 != -10908 ? 30 : this.field9738;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I")
    public final int method17(int arg0) {
        if (arg0 != -2132) {
            this.method17(22);
        }
        ++field9725;
        return this.field9743;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method33(int arg0, int arg1, int arg2, class65 arg3) {
        if (arg0 != 4161) {
            field9751 = -1;
        }
        ++field9749;
        class500 var5 = this.method3844(131072, arg3, 0);
        if (var5 != null) {
            class303 var6 = arg3.method450();
            var6.method981(super.field2257, super.field2246, super.field2259);
            return class200.field2658 ? var5.method311(arg2, arg1, var6, false, 0, class330.field4773) : var5.method291(arg2, arg1, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "(I)I")
    public final int method28(int arg0) {
        ++field9748;
        if (arg0 != -13878) {
            return -111;
        } else {
            return this.field9742 != null ? this.field9742.method339() : 0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lha;Lwea;ZIIII)V")
    public final void method60(class65 arg0, class167 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9741;
        if (arg3 > -16) {
            this.method22(96, (class65) null);
        }
        if (!(arg1 instanceof class695)) {
            if (arg1 instanceof class382) {
                class382 var8 = (class382) arg1;
                if (this.field9742 != null && var8.field5579 != null) {
                    this.field9742.method297(var8.field5579, arg4, arg5, arg6, arg2);
                    return;
                }
            }
        } else {
            class695 var9 = (class695) arg1;
            if (this.field9742 == null || var9.field9742 == null) {
                return;
            }
            this.field9742.method297(var9.field9742, arg4, arg5, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)Z")
    public final boolean method30(int arg0) {
        if (arg0 < 59) {
            return false;
        } else {
            ++field9730;
            return this.field9731;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lha;I)V")
    public final void method34(class65 arg0, int arg1) {
        ++field9753;
        Object var3 = null;
        class195 var5;
        if (this.field9734 == null && this.field9731) {
            class218 var4 = this.method3841(60, 262144, arg0, true);
            var5 = var4 != null ? var4.field2908 : null;
        } else {
            var5 = this.field9734;
            this.field9734 = null;
        }
        if (arg1 != -4351) {
            this.field9732 = 55;
        }
        if (var5 != null) {
            class786.method4347(var5, super.field2244, super.field2257, super.field2259, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lha;B)Lel;")
    public final class574 method27(class65 arg0, byte arg1) {
        if (arg1 != -126) {
            this.method18(126);
        }
        ++field9736;
        if (this.field9752 == null) {
            this.field9752 = class321.method2038(-23545, this.method3844(0, arg0, 0), super.field2259, super.field2257, super.field2246);
        }
        return this.field9752;
    }

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "(I)I")
    public final int method24(int arg0) {
        ++field9726;
        if (arg0 != 748449288) {
            return -112;
        } else {
            return this.field9742 != null ? this.field9742.method335() : 0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Lha;I)V")
    public final void method20(class65 arg0, int arg1) {
        ++field9750;
        Object var3 = null;
        class195 var5;
        if (this.field9734 == null && this.field9731) {
            class218 var4 = this.method3841(arg1 ^ -4962, 262144, arg0, true);
            var5 = var4 != null ? var4.field2908 : null;
        } else {
            var5 = this.field9734;
            this.field9734 = null;
        }
        if (arg1 != -4947) {
            this.method20((class65) null, -58);
        }
        if (var5 != null) {
            class167.method1203(var5, super.field2244, super.field2257, super.field2259, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILha;Z)Lhi;")
    private final class218 method3841(int arg0, int arg1, class65 arg2, boolean arg3) {
        ++field9719;
        class589 var5 = class350.field5132.method3732((byte) 82, 65535 & this.field9732);
        if (arg0 < 48) {
            this.field9724 = true;
        }
        class296 var6;
        class296 var7;
        if (!this.field9729) {
            var6 = class412.field5933[super.field2244];
            if (~super.field2244 <= -4) {
                var7 = null;
            } else {
                var7 = class412.field5933[super.field2244 - -1];
            }
        } else {
            var6 = class538.field7317[super.field2244];
            var7 = class412.field5933[0];
        }
        return var5.method3279(super.field2246, var7, this.field9743, var6, (class596) null, this.field9738, arg1, arg3, super.field2257, (byte) 53, super.field2259, arg2);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lha;Lpu;IIIIIZIIZ)V")
    public class695(class65 arg0, class589 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class288.method1832(-2, arg9, arg8));
        this.field9729 = arg7;
        this.field9724 = arg1.field7933 != 0 && !arg7;
        this.field9743 = (byte) arg9;
        this.field9732 = (short) arg1.field7856;
        super.field2259 = arg6;
        super.field2257 = arg4;
        this.field9738 = (byte) arg8;
        this.field9745 = arg10;
        this.field9731 = arg0.method484() && arg1.field7942 && !this.field9729 && class712.field9959.field1319.method2854(51) != 0;
        int var12 = 2048;
        if (this.field9745) {
            var12 |= 65536;
        }
        class218 var13 = this.method3841(60, var12, arg0, this.field9731);
        if (var13 != null) {
            this.field9742 = var13.field2909;
            this.field9734 = var13.field2908;
            if (this.field9745) {
                this.field9742 = this.field9742.method298((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public final void method25(int arg0) {
        if (this.field9742 != null) {
            this.field9742.method337();
        }
        if (arg0 == 14667) {
            ++field9722;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILha;)Ldfa;")
    public final class176 method22(int arg0, class65 arg1) {
        ++field9733;
        if (this.field9742 == null) {
            return null;
        } else {
            if (arg0 != -10) {
                this.method21(-107);
            }
            class303 var3 = arg1.method450();
            var3.method981(super.field2257, super.field2246, super.field2259);
            class176 var4 = class567.method3167(this.field9724, arg0 + 10, 1);
            if (!class200.field2658) {
                this.field9742.method292(var3, var4.field2345[0], 0);
            } else {
                this.field9742.method300(var3, var4.field2345[0], class330.field4773, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "(I)V")
    public static void method3842(int arg0) {
        field9727 = null;
        if (arg0 != 0) {
            field9739 = 36;
        }
        field9735 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/io/File;BI)[B")
    public static final byte[] method3843(File arg0, byte arg1, int arg2) {
        ++field9746;
        if (arg1 >= -92) {
            method3843((File) null, (byte) -55, -88);
        }
        try {
            byte[] var3 = new byte[arg2];
            class625.method3421(arg0, arg2, var3, -365);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)I")
    public final int method31(int arg0) {
        if (arg0 != -23356) {
            return 114;
        } else {
            ++field9723;
            return this.field9732 & 65535;
        }
    }

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "(I)Z")
    public final boolean method21(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field9728;
            return this.field9742 == null ? false : this.field9742.method326();
        }
    }

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "(I)V")
    public final void method66(int arg0) {
        this.field9745 = false;
        ++field9740;
        if (arg0 != -13514) {
            this.method20((class65) null, 75);
        }
        if (this.field9742 != null) {
            this.field9742.method295(-65537 & this.field9742.method325());
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILha;I)Lka;")
    private final class500 method3844(int arg0, class65 arg1, int arg2) {
        ++field9721;
        if (this.field9742 != null && arg1.method517(this.field9742.method325(), arg0) == 0) {
            return this.field9742;
        } else {
            class218 var4 = this.method3841(arg2 + 64, arg0, arg1, false);
            if (arg2 != 0) {
                this.method32((byte) 5, (class65) null);
            }
            return var4 != null ? var4.field2909 : null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLha;)V")
    public final void method32(byte arg0, class65 arg1) {
        if (arg0 < 69) {
            this.method3841(-47, -10, (class65) null, true);
        }
        ++field9747;
    }
}
