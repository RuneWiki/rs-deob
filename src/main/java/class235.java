import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class235 extends class559 implements class523 {

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "B")
    private byte field3753;

    @OriginalMember(owner = "client!pm", name = "vb", descriptor = "Z")
    private boolean field3786;

    @OriginalMember(owner = "client!pm", name = "qb", descriptor = "Z")
    private boolean field3781;

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "B")
    private byte field3763;

    @OriginalMember(owner = "client!pm", name = "mb", descriptor = "Z")
    private boolean field3777;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "S")
    private short field3757;

    @OriginalMember(owner = "client!pm", name = "tb", descriptor = "Z")
    private boolean field3784;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "Lka;")
    public class282 field3756;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "Lr;")
    private class706 field3761;

    @OriginalMember(owner = "client!pm", name = "ub", descriptor = "[Z")
    public static boolean[] field3785 = new boolean[5];

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!pm", name = "bb", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!pm", name = "db", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!pm", name = "eb", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!pm", name = "fb", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!pm", name = "gb", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!pm", name = "hb", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!pm", name = "ib", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!pm", name = "jb", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!pm", name = "kb", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!pm", name = "lb", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!pm", name = "nb", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!pm", name = "ob", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!pm", name = "pb", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!pm", name = "rb", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!pm", name = "sb", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!pm", name = "wb", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!pm", name = "ab", descriptor = "Lkn;")
    private class516 field3765;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "Lnha;")
    public static class686 field3754;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "(I)[Lhga;")
    public static final class300[] method1617(int arg0) {
        ++field3764;
        if (class679.field9567 == null) {
            class300[] var1 = class377.method2382(class706.field9962, arg0 ^ -29159);
            class300[] var2 = new class300[var1.length];
            int var3 = 0;
            int var4 = class654.field9289.field5407.method3284(3);
            label74: for (int var5 = 0; var1.length > var5; ++var5) {
                class300 var9 = var1[var5];
                if ((var9.field4526 <= 0 || var9.field4526 >= 24) && ~var9.field4523 <= -801 && var9.field4527 >= 600 && (var4 != 2 || var9.field4523 <= 800 && var9.field4527 <= 600) && (~var4 != -2 || var9.field4523 <= 1024 && ~var9.field4527 >= -769)) {
                    for (int var10 = 0; var3 > var10; ++var10) {
                        class300 var11 = var2[var10];
                        if (var9.field4523 == var11.field4523 && var9.field4527 == var11.field4527) {
                            if (var11.field4526 < var9.field4526) {
                                var2[var10] = var9;
                            }
                            continue label74;
                        }
                    }
                    var2[var3] = var9;
                    ++var3;
                }
            }
            class679.field9567 = new class300[var3];
            class571.method3310(var2, 0, class679.field9567, 0, var3);
            int[] var6 = new int[class679.field9567.length];
            for (int var7 = 0; var7 < class679.field9567.length; ++var7) {
                class300 var8 = class679.field9567[var7];
                var6[var7] = var8.field4527 * var8.field4523;
            }
            class710.method3933(var6, class679.field9567, (byte) 98);
        }
        if (arg0 != 600) {
            method1622(-104, 31, -53, true, 121L);
        }
        return class679.field9567;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)I")
    public final int method87(int arg0) {
        if (arg0 != 2836) {
            field3785 = null;
        }
        ++field3772;
        return this.field3757 & 65535;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lha;II)Lka;")
    private final class282 method1618(class544 arg0, int arg1, int arg2) {
        ++field3767;
        if (this.field3756 != null && ~arg0.method351(this.field3756.method1044(), arg1) == -1) {
            return this.field3756;
        } else if (arg2 != -1) {
            return null;
        } else {
            class321 var4 = this.method1621(22953, arg1, false, arg0);
            return var4 == null ? null : var4.field4754;
        }
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(B)V")
    public static void method1619(byte arg0) {
        field3754 = null;
        if (arg0 < 5) {
            field3785 = null;
        }
        field3785 = null;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(B)I")
    public final int method100(byte arg0) {
        ++field3770;
        int var2 = -124 / ((arg0 - 21) / 56);
        return this.field3756 == null ? 0 : this.field3756.method1033();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZILha;Lov;IIZ)V")
    public final void method104(boolean arg0, int arg1, class544 arg2, class668 arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 instanceof class496) {
            class496 var8 = (class496) arg3;
            if (this.field3756 != null && var8.field7194 != null) {
                this.field3756.method1031(var8.field7194, arg1, arg4, arg5, arg6);
            }
        } else if (arg3 instanceof class235) {
            class235 var9 = (class235) arg3;
            if (this.field3756 != null && var9.field3756 != null) {
                this.field3756.method1031(var9.field3756, arg1, arg4, arg5, arg6);
            }
        }
        if (arg0) {
            this.method93((class544) null, 109);
        }
        ++field3758;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Lha;I)V")
    public final void method97(class544 arg0, int arg1) {
        ++field3776;
        if (arg1 != -1) {
            this.field3761 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "(I)Z")
    public final boolean method86(int arg0) {
        if (arg0 != 0) {
            field3754 = null;
        }
        ++field3769;
        return this.field3756 != null ? this.field3756.method1048() : false;
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(B)I")
    public final int method1620(byte arg0) {
        ++field3779;
        if (arg0 != -32) {
            this.field3753 = 60;
        }
        return this.field3756 == null ? 15 : this.field3756.method999() / 4;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZLha;)Leo;")
    private final class321 method1621(int arg0, int arg1, boolean arg2, class544 arg3) {
        ++field3775;
        class595 var5 = class576.field8167.method3074(arg0 + -22953, this.field3757 & 65535);
        if (arg0 != 22953) {
            return null;
        } else {
            class339 var6;
            class339 var7;
            if (this.field3781) {
                var6 = class152.field2374[super.field9469];
                var7 = class121.field1867[0];
            } else {
                if (super.field9469 >= 3) {
                    var7 = null;
                } else {
                    var7 = class121.field1867[super.field9469 - -1];
                }
                var6 = class121.field1867[super.field9469];
            }
            return var5.method3416(super.field9477, super.field9474, (byte) 80, arg1, this.field3753 == 11 ? 10 : this.field3753, var7, var6, arg2, arg3, ~this.field3753 == -12 ? 4 - -this.field3763 : this.field3763, super.field9475);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lha;Z)V")
    public final void method91(class544 arg0, boolean arg1) {
        if (arg1) {
            ++field3759;
            Object var3 = null;
            class706 var5;
            if (this.field3761 == null && this.field3784) {
                class321 var4 = this.method1621(22953, 262144, true, arg0);
                var5 = var4 != null ? var4.field4753 : null;
            } else {
                var5 = this.field3761;
                this.field3761 = null;
            }
            if (var5 != null) {
                class569.method3302(var5, super.field9469, super.field9477, super.field9475, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLha;)V")
    public final void method96(byte arg0, class544 arg1) {
        ++field3780;
        Object var3 = null;
        class706 var5;
        if (this.field3761 == null && this.field3784) {
            class321 var4 = this.method1621(22953, 262144, true, arg1);
            var5 = var4 == null ? null : var4.field4753;
        } else {
            var5 = this.field3761;
            this.field3761 = null;
        }
        if (var5 != null) {
            class31.method162(var5, super.field9469, super.field9477, super.field9475, (boolean[]) null);
        }
        if (arg0 != 89) {
            this.field3784 = false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I")
    public final int method98(int arg0) {
        ++field3782;
        if (arg0 != -12194) {
            this.method87(-11);
        }
        return this.field3763;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lha;I)Lkn;")
    public final class516 method93(class544 arg0, int arg1) {
        ++field3771;
        if (this.field3765 == null) {
            this.field3765 = class100.method819(arg1 + 7, this.method1618(arg0, 0, arg1 ^ -2), super.field9474, super.field9475, super.field9477);
        }
        if (arg1 != 1) {
            this.method88((byte) -89);
        }
        return this.field3765;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)Z")
    public final boolean method88(byte arg0) {
        ++field3778;
        return arg0 < 44 ? false : this.field3784;
    }

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "(I)Z")
    public final boolean method95(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field3760;
            if (this.field3756 != null) {
                return !this.field3756.method1054();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)Z")
    public final boolean method92(int arg0) {
        ++field3774;
        return arg0 != 2 ? false : this.field3777;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method94(int arg0, int arg1, class544 arg2, int arg3) {
        int var5 = -104 % ((-80 - arg3) / 44);
        ++field3766;
        class282 var6 = this.method1618(arg2, 131072, -1);
        if (var6 != null) {
            class73 var7 = arg2.method343();
            var7.method675(super.field9477, super.field9474, super.field9475);
            return class141.field2211 ? var6.method1023(arg0, arg1, var7, false, 0, class106.field1553) : var6.method1010(arg0, arg1, var7, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "(I)I")
    public final int method89(int arg0) {
        int var2 = -56 / ((arg0 - 17) / 61);
        ++field3762;
        return this.field3756 != null ? this.field3756.method1013() : 0;
    }

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "(I)V")
    public final void method102(int arg0) {
        ++field3755;
        if (arg0 == 0) {
            this.field3777 = false;
            if (this.field3756 != null) {
                this.field3756.method1014(this.field3756.method1044() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lha;Ljl;IIIIIZIIIIIIZ)V")
    public class235(class544 arg0, class595 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field8352 == 1, class674.method3761(arg13, arg12, (byte) 113));
        this.field3753 = (byte) arg12;
        this.field3786 = ~arg1.field8426 != -1 && !arg7;
        this.field3781 = arg7;
        this.field3763 = (byte) arg13;
        super.field9469 = (byte) arg3;
        this.field3777 = arg14;
        this.field3757 = (short) arg1.field8386;
        this.field3784 = arg0.method220() && arg1.field8400 && !this.field3781 && class654.field9289.field5431.method2801(3) != 0;
        int var16 = 2048;
        if (this.field3777) {
            var16 |= 65536;
        }
        class321 var17 = this.method1621(22953, var16, this.field3784, arg0);
        if (var17 != null) {
            this.field3756 = var17.field4754;
            this.field3761 = var17.field4753;
            if (this.field3777) {
                this.field3756 = this.field3756.method1025((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)I")
    public final int method85(byte arg0) {
        if (arg0 != -72) {
            this.field3756 = null;
        }
        ++field3787;
        return this.field3753;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIZJ)Ljava/lang/String;")
    public static final String method1622(int arg0, int arg1, int arg2, boolean arg3, long arg4) {
        ++field3773;
        if (arg2 != -18764) {
            return null;
        } else {
            char var6 = ',';
            char var7 = '.';
            if (~arg1 == -1) {
                var6 = '.';
                var7 = ',';
            }
            if (arg1 == 2) {
                var7 = 160;
            }
            boolean var8 = false;
            if (~arg4 > -1L) {
                arg4 = -arg4;
                var8 = true;
            }
            StringBuffer var9 = new StringBuffer(26);
            if (arg0 > 0) {
                for (int var10 = 0; ~arg0 < ~var10; ++var10) {
                    int var11 = (int) arg4;
                    arg4 /= 10L;
                    var9.append((char) (var11 + 48 + -((int) arg4 * 10)));
                }
                var9.append(var6);
            }
            int var12 = 0;
            while (true) {
                int var13 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (48 - -var13 + -((int) arg4 * 10)));
                if (~arg4 == -1L) {
                    if (var8) {
                        var9.append('-');
                    }
                    return var9.reverse().toString();
                }
                if (arg3) {
                    ++var12;
                    if (~(var12 % 3) == -1) {
                        var9.append(var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(ILha;)Lgh;")
    public final class48 method103(int arg0, class544 arg1) {
        ++field3783;
        if (this.field3756 == null) {
            return null;
        } else {
            if (arg0 != 0) {
                this.field3761 = null;
            }
            class73 var3 = arg1.method343();
            var3.method675(super.field9477, super.field9474, super.field9475);
            class48 var4 = class331.method2130(1, (byte) 92, this.field3786);
            if (!class141.field2211) {
                this.field3756.method1007(var3, var4.field795[0], 0);
            } else {
                this.field3756.method1026(var3, var4.field795[0], class106.field1553, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (this.field3756 != null) {
            this.field3756.method1002();
        }
        ++field3768;
        if (arg0 != -17773) {
            this.method102(-104);
        }
    }
}
