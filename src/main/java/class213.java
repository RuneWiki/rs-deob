import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class213 extends class96 {

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lid;")
    private static class149 field3768 = class60.method382(" ", (byte) 40);

    @OriginalMember(owner = "client!pa", name = "qb", descriptor = "[Lid;")
    public static class149[] field3771 = new class149[200];

    @OriginalMember(owner = "client!pa", name = "ub", descriptor = "Lid;")
    public static class149 field3775 = field3768;

    @OriginalMember(owner = "client!pa", name = "yb", descriptor = "I")
    public static int field3779 = 7759444;

    @OriginalMember(owner = "client!pa", name = "Ab", descriptor = "Lid;")
    public static class149 field3781 = class60.method382("null", (byte) 64);

    @OriginalMember(owner = "client!pa", name = "zb", descriptor = "[I")
    public static int[] field3780 = new int[32];

    @OriginalMember(owner = "client!pa", name = "rb", descriptor = "I")
    public static int field3772 = 0;

    @OriginalMember(owner = "client!pa", name = "ob", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!pa", name = "pb", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!pa", name = "sb", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!pa", name = "vb", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!pa", name = "tb", descriptor = "Z")
    public static boolean field3774;

    @OriginalMember(owner = "client!pa", name = "wb", descriptor = "[I")
    public static int[] field3777;

    @OriginalMember(owner = "client!pa", name = "xb", descriptor = "[Lec;")
    public static class23[] field3778;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)V")
    public static void method1443(int arg0) {
        field3768 = null;
        if (arg0 == 115) {
            field3777 = null;
            field3771 = null;
            field3778 = null;
            field3775 = null;
            field3780 = null;
            field3781 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(II)I")
    public static final int method1444(int arg0, int arg1) {
        ++field3773;
        if (arg1 != 23614) {
            field3774 = false;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(II)Z")
    public static final boolean method1445(int arg0, int arg1) {
        ++field3769;
        if (~arg0 <= -98 && ~arg0 >= -123) {
            return true;
        } else if (arg0 >= 65 && ~arg0 >= -91) {
            return true;
        } else if (~arg0 <= -49 && ~arg0 >= -58) {
            return true;
        } else {
            if (arg1 != 5) {
                field3777 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIILug;IJIIII)Z")
    public static final boolean method1446(int arg0, int arg1, int arg2, int arg3, class199 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class175.method1243(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field3632.method965(arg1, 73);
            if (super.field3632.field2550 && this.method698(-21347)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field1682 * super.field1682;
                for (int var8 = 0; ~class137.field2515 < ~var8; ++var8) {
                    int var9 = super.field1706[var7 - -(var8 % super.field1705)];
                    var6[var8] = class136.method953(var9 << 4, 4080);
                    var5[var8] = class136.method953(var9, 65280) >> 4;
                    var4[var8] = class136.method953(4080, var9 >> 12);
                }
            }
            ++field3770;
            return var3;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Laj;IZII)V")
    public static final void method1447(class47 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        int var5 = arg0.field722;
        int var6 = arg0.field727;
        if (arg0.field701 != 0) {
            if (arg0.field701 != 1) {
                if (arg0.field701 != 2) {
                    if (~arg0.field701 == -4) {
                        if (~arg0.field760 == -3) {
                            arg0.field727 = arg0.field732 * 32 - -((arg0.field732 + -1) * arg0.field746);
                        } else if (arg0.field760 == 7) {
                            arg0.field727 = arg0.field732 * 12 - -((arg0.field732 - 1) * arg0.field746);
                        }
                    }
                } else {
                    arg0.field727 = arg0.field732 * arg3 >> 14;
                }
            } else {
                arg0.field727 = -arg0.field732 + arg3;
            }
        } else {
            arg0.field727 = arg0.field732;
        }
        if (~arg0.field743 == -1) {
            arg0.field722 = arg0.field726;
        } else if (arg0.field743 != 1) {
            if (arg0.field743 == 2) {
                arg0.field722 = arg0.field726 * arg1 >> 14;
            } else if (arg0.field743 == 3) {
                if (arg0.field760 != 2) {
                    if (~arg0.field760 == -8) {
                        arg0.field722 = arg0.field726 * 115 - -((arg0.field726 + -1) * arg0.field859);
                    }
                } else {
                    arg0.field722 = (arg0.field726 - 1) * arg0.field859 + arg0.field726 * 32;
                }
            }
        } else {
            arg0.field722 = -arg0.field726 + arg1;
        }
        if (arg0.field743 == 4) {
            arg0.field722 = arg0.field748 * arg0.field727 / arg0.field794;
        }
        if (~arg0.field701 == -5) {
            arg0.field727 = arg0.field794 * arg0.field722 / arg0.field748;
        }
        if (class38.field563 && (client.method1104(arg0).field2992 != 0 || ~arg0.field760 == -1)) {
            if (~arg0.field727 > -6 && ~arg0.field722 > -6) {
                arg0.field727 = 5;
                arg0.field722 = 5;
            } else {
                if (arg0.field727 <= 0) {
                    arg0.field727 = 5;
                }
                if (arg0.field722 <= 0) {
                    arg0.field722 = 5;
                }
            }
        }
        if (arg4 != 2) {
            method1445(-94, -72);
        }
        ++field3776;
        if (~arg0.field820 == -1338) {
            class7.field86 = arg0;
        }
        if (arg2 && arg0.field806 != null) {
            if (arg0.field722 != var5 || ~arg0.field727 != ~var6) {
                class1 var7 = new class1();
                var7.field13 = arg0;
                var7.field17 = arg0.field806;
                class258.field4506.method1131(var7, false);
            }
        }
    }
}
