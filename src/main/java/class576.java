import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class576 extends class177 implements class258 {

    @OriginalMember(owner = "client!uo", name = "V", descriptor = "Z")
    private boolean field7911;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "Z")
    private boolean field7902;

    @OriginalMember(owner = "client!uo", name = "bb", descriptor = "Z")
    private boolean field7917;

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "B")
    private byte field7908;

    @OriginalMember(owner = "client!uo", name = "db", descriptor = "S")
    private short field7919;

    @OriginalMember(owner = "client!uo", name = "ab", descriptor = "Z")
    private boolean field7916;

    @OriginalMember(owner = "client!uo", name = "fb", descriptor = "Lka;")
    private class472 field7921;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "Lr;")
    private class184 field7904;

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
    public static int field7899 = 0;

    @OriginalMember(owner = "client!uo", name = "T", descriptor = "[I")
    public static int[] field7909 = new int[5];

    @OriginalMember(owner = "client!uo", name = "jb", descriptor = "I")
    public static int field7925 = 1;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!uo", name = "W", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!uo", name = "X", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!uo", name = "Y", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!uo", name = "Z", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!uo", name = "cb", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!uo", name = "eb", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!uo", name = "gb", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!uo", name = "hb", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!uo", name = "ib", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!uo", name = "kb", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!uo", name = "mb", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!uo", name = "nb", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!uo", name = "ob", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!uo", name = "lb", descriptor = "Lhw;")
    private class132 field7927;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)V", line = 3)
    public static void method3319(byte arg0) {
        if (arg0 != 3) {
            field7909 = null;
        }
        field7909 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lha;IZLga;IBI)V", line = 13)
    public final void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6) {
        ++field7898;
        if (arg5 > -106) {
            method3321(-5, (byte) 56);
        }
        if (arg3 instanceof class576) {
            class576 var8 = (class576) arg3;
            if (this.field7921 != null && var8.field7921 != null) {
                this.field7921.method490(var8.field7921, arg6, arg1, arg4, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "(I)I", line = 32)
    public final int method37(int arg0) {
        ++field7928;
        if (arg0 != -25675) {
            return -120;
        } else {
            return this.field7921 == null ? 0 : this.field7921.method513();
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lha;I)V", line = 44)
    public final void method591(class59 arg0, int arg1) {
        ++field7923;
        if (arg1 != -14218) {
            this.method3323((class59) null, -47, 49);
        }
        Object var3 = null;
        class184 var5;
        if (this.field7904 == null && this.field7916) {
            class351 var4 = this.method3320(arg0, 262144, true, 22);
            var5 = var4 == null ? null : var4.field4889;
        } else {
            var5 = this.field7904;
            this.field7904 = null;
        }
        if (var5 != null) {
            class166.method1249(var5, super.field5921, super.field5922, super.field5933, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lha;IZI)Lak;", line = 75)
    private final class351 method3320(class59 arg0, int arg1, boolean arg2, int arg3) {
        ++field7913;
        if (arg3 != 22) {
            this.method3323((class59) null, -21, -25);
        }
        class99 var5 = class76.field1366.method1680(0, this.field7919 & 65535);
        class281 var6;
        class281 var7;
        if (this.field7911) {
            var6 = class344.field4822[super.field5921];
            var7 = class465.field6517[0];
        } else {
            var6 = class465.field6517[super.field5921];
            if (super.field5921 < 3) {
                var7 = class465.field6517[super.field5921 + 1];
            } else {
                var7 = null;
            }
        }
        return var5.method921(arg0, var7, 22, arg1, super.field5922, arg2, var6, super.field5927, super.field5933, this.field7908, 128);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)Z", line = 107)
    public static final boolean method3321(int arg0, byte arg1) {
        ++field7922;
        if (arg1 >= -52) {
            return true;
        } else {
            return ~arg0 == -5 || arg0 == 8 || ~arg0 == -12;
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V", line = 118)
    public final void method44(boolean arg0) {
        ++field7900;
        if (arg0) {
            this.field7917 = false;
            if (this.field7921 != null) {
                this.field7921.method484(-65537 & this.field7921.method527());
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)I", line = 134)
    public final int method589(int arg0) {
        ++field7897;
        return arg0 >= -62 ? -1 : this.field7919 & 65535;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(ILha;)Ljda;", line = 152)
    public final class228 method41(int arg0, class59 arg1) {
        ++field7918;
        if (this.field7921 == null) {
            return null;
        } else {
            class661 var3 = arg1.method322();
            var3.method744(super.field5922, super.field5927, super.field5933);
            class228 var4 = class345.method2171(arg0, this.field7902, false);
            if (class458.field6459) {
                this.field7921.method497(var3, var4.field3313[0], class58.field1146, 0);
            } else {
                this.field7921.method521(var3, var4.field3313[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Z", line = 180)
    public final boolean method584(int arg0) {
        if (arg0 != -18443) {
            this.field7927 = null;
        }
        ++field7930;
        return this.field7916;
    }

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "(I)Z", line = 195)
    public final boolean method35(int arg0) {
        if (arg0 > -65) {
            return true;
        } else {
            ++field7906;
            return this.field7917;
        }
    }

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)Z", line = 208)
    public final boolean method45(int arg0) {
        if (arg0 >= -12) {
            this.method44(true);
        }
        ++field7903;
        if (this.field7921 != null) {
            return !this.field7921.method522();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(Z)I", line = 226)
    public final int method38(boolean arg0) {
        ++field7907;
        if (!arg0) {
            this.method584(-4);
        }
        return this.field7921 != null ? this.field7921.method486() : 0;
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)I", line = 238)
    public final int method588(int arg0) {
        ++field7929;
        if (arg0 != -32228) {
            this.method38(false);
        }
        return this.field7908;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII)V", line = 249)
    public static final void method3322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7905;
        if (arg4 != 19206) {
            method3321(-3, (byte) 46);
        }
        class741[] var7 = class55.field1118;
        for (int var8 = 0; ~var7.length < ~var8; ++var8) {
            class741 var9 = var7[var8];
            if (var9 != null && var9.field9982 == 2) {
                class583.method3339(arg3 >> 1, var9.field9981 * 2, 0, arg6, arg5 >> 1, var9.field9980, var9.field9974, arg1, var9.field9977);
                if (~class339.field4768[0] < 0 && class641.field8810 % 20 < 10) {
                    class496 var10 = class280.field3932[var9.field9973];
                    int var11 = arg0 - -class339.field4768[0] + -12;
                    int var12 = arg2 - -class339.field4768[1] - 28;
                    var10.method2925(var11, var12);
                    class546.method3152(-5590, var11, var11 - -var10.method1618(), var12, var10.method1614() + var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V", line = 289)
    public final void method582(int arg0) {
        if (arg0 == -12031) {
            ++field7910;
            if (this.field7921 != null) {
                this.field7921.method507();
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)Z", line = 309)
    public final boolean method49(byte arg0) {
        if (arg0 != 122) {
            this.method582(3);
        }
        ++field7901;
        return this.field7921 == null ? false : this.field7921.method488();
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILha;)V", line = 325)
    public final void method583(int arg0, class59 arg1) {
        ++field7914;
        Object var3 = null;
        class184 var5;
        if (this.field7904 == null && this.field7916) {
            class351 var4 = this.method3320(arg1, 262144, true, 22);
            var5 = var4 == null ? null : var4.field4889;
        } else {
            var5 = this.field7904;
            this.field7904 = null;
        }
        if (var5 != null) {
            class491.method2900(var5, super.field5921, super.field5922, super.field5933, (boolean[]) null);
        }
        if (arg0 != 836) {
            this.field7919 = 86;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lha;III)Z", line = 357)
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            field7925 = -51;
        }
        ++field7924;
        class472 var5 = this.method3323(arg0, 69, 131072);
        if (var5 != null) {
            class661 var6 = arg0.method322();
            var6.method744(super.field5922, super.field5927, super.field5933);
            return class458.field6459 ? var5.method492(arg2, arg1, var6, false, 0, class58.field1146) : var5.method503(arg2, arg1, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lha;II)Lka;", line = 381)
    private final class472 method3323(class59 arg0, int arg1, int arg2) {
        ++field7912;
        int var4 = 65 / ((-34 - arg1) / 53);
        if (this.field7921 != null && arg0.method343(this.field7921.method527(), arg2) == 0) {
            return this.field7921;
        } else {
            class351 var5 = this.method3320(arg0, arg2, false, 22);
            return var5 != null ? var5.field4890 : null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lha;Liv;IIIIIZIZ)V", line = 400)
    public class576(class59 arg0, class99 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field1765);
        this.field7911 = arg7;
        this.field7902 = ~arg1.field1709 != -1 && !arg7;
        super.field5933 = arg6;
        this.field7917 = arg9;
        super.field5922 = arg4;
        this.field7908 = (byte) arg8;
        this.field7919 = (short) arg1.field1776;
        this.field7916 = arg0.method263() && arg1.field1729 && !this.field7911 && ~class693.field9368.field4435.method421(-32350) != -1;
        int var11 = 2048;
        if (this.field7917) {
            var11 |= 65536;
        }
        class351 var12 = this.method3320(arg0, var11, this.field7916, 22);
        if (var12 != null) {
            this.field7921 = var12.field4890;
            this.field7904 = var12.field4889;
            if (this.field7917) {
                this.field7921 = this.field7921.method504((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(Lha;I)Lhw;", line = 435)
    public final class132 method40(class59 arg0, int arg1) {
        if (this.field7927 == null) {
            this.field7927 = class689.method3846(super.field5922, this.method3323(arg0, 86, 0), super.field5933, super.field5927, arg1 ^ 5);
        }
        if (arg1 != 7) {
            return null;
        } else {
            ++field7926;
            return this.field7927;
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(Lha;I)V", line = 449)
    public final void method31(class59 arg0, int arg1) {
        if (arg1 >= -125) {
            this.field7911 = false;
        }
        ++field7915;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)I", line = 460)
    public final int method594(int arg0) {
        int var2 = -125 % ((arg0 - -91) / 35);
        ++field7920;
        return 22;
    }
}
