import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class293 extends class451 implements class559 {

    @OriginalMember(owner = "client!wia", name = "Q", descriptor = "B")
    private byte field3799;

    @OriginalMember(owner = "client!wia", name = "mb", descriptor = "Z")
    private boolean field3821;

    @OriginalMember(owner = "client!wia", name = "M", descriptor = "B")
    private byte field3795;

    @OriginalMember(owner = "client!wia", name = "bb", descriptor = "Z")
    private boolean field3810;

    @OriginalMember(owner = "client!wia", name = "eb", descriptor = "S")
    private short field3813;

    @OriginalMember(owner = "client!wia", name = "K", descriptor = "Z")
    private boolean field3793;

    @OriginalMember(owner = "client!wia", name = "ab", descriptor = "Z")
    private boolean field3809;

    @OriginalMember(owner = "client!wia", name = "fb", descriptor = "Lka;")
    public class219 field3814;

    @OriginalMember(owner = "client!wia", name = "Y", descriptor = "Lr;")
    private class108 field3807;

    @OriginalMember(owner = "client!wia", name = "U", descriptor = "Lmq;")
    public static class78 field3803 = new class78(115, 4);

    @OriginalMember(owner = "client!wia", name = "pb", descriptor = "[[I")
    public static int[][] field3824 = new int[128][128];

    @OriginalMember(owner = "client!wia", name = "J", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!wia", name = "L", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!wia", name = "N", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!wia", name = "P", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!wia", name = "R", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!wia", name = "S", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!wia", name = "T", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!wia", name = "W", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!wia", name = "X", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!wia", name = "Z", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!wia", name = "cb", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!wia", name = "db", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!wia", name = "gb", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!wia", name = "hb", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!wia", name = "ib", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!wia", name = "jb", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!wia", name = "kb", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!wia", name = "lb", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!wia", name = "nb", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!wia", name = "ob", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!wia", name = "qb", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!wia", name = "rb", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!wia", name = "sb", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!wia", name = "tb", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!wia", name = "V", descriptor = "Lufa;")
    private class152 field3804;

    @OriginalMember(owner = "client!wia", name = "O", descriptor = "[Lmb;")
    public static class410[] field3797;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)I", line = 3)
    public final int method731(int arg0) {
        int var2 = -92 % ((arg0 - 36) / 42);
        ++field3816;
        return this.field3799;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IIB)I", line = 15)
    public static final int method1754(int arg0, int arg1, byte arg2) {
        ++field3800;
        int var3 = arg0 >>> 31;
        int var4 = 85 / ((arg2 - 32) / 40);
        return (arg0 - -var3) / arg1 + -var3;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZILmb;Lha;III)V", line = 28)
    public final void method514(boolean arg0, int arg1, class410 arg2, class454 arg3, int arg4, int arg5, int arg6) {
        if (arg2 instanceof class651) {
            class651 var8 = (class651) arg2;
            if (this.field3814 != null && var8.field8966 != null) {
                this.field3814.method1329(var8.field8966, arg4, arg6, arg5, arg0);
            }
        } else if (arg2 instanceof class293) {
            class293 var9 = (class293) arg2;
            if (this.field3814 != null && var9.field3814 != null) {
                this.field3814.method1329(var9.field3814, arg4, arg6, arg5, arg0);
            }
        }
        if (arg1 != 12473) {
            field3815 = -124;
        }
        ++field3794;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IIBLha;)Z", line = 61)
    public final boolean method512(int arg0, int arg1, byte arg2, class454 arg3) {
        if (arg2 != -4) {
            return false;
        } else {
            ++field3811;
            class219 var5 = this.method1759(arg3, (byte) 37, 131072);
            if (var5 != null) {
                class376 var6 = arg3.method114();
                var6.method1963(super.field5790, super.field5791, super.field5784);
                return !class306.field3936 ? var5.method1378(arg0, arg1, var6, false, 0) : var5.method1357(arg0, arg1, var6, false, 0, class468.field6738);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)V", line = 82)
    public final void method736(byte arg0) {
        if (arg0 >= -123) {
            method1754(-7, 65, (byte) -30);
        }
        ++field3823;
        if (this.field3814 != null) {
            this.field3814.method1376();
        }
    }

    @OriginalMember(owner = "client!wia", name = "j", descriptor = "(I)V", line = 96)
    public static void method1755(int arg0) {
        field3803 = null;
        field3824 = null;
        field3797 = null;
        if (arg0 != -10313) {
            method1760((class451) null, false);
        }
    }

    @OriginalMember(owner = "client!wia", name = "f", descriptor = "(B)Z", line = 109)
    public final boolean method256(byte arg0) {
        int var2 = -102 / ((arg0 - -1) / 36);
        ++field3827;
        return this.field3814 != null ? this.field3814.method1338() : false;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZLha;)V", line = 123)
    public final void method522(boolean arg0, class454 arg1) {
        if (arg0) {
            this.field3804 = null;
        }
        ++field3825;
    }

    @OriginalMember(owner = "client!wia", name = "f", descriptor = "(I)I", line = 133)
    public final int method247(int arg0) {
        ++field3792;
        if (arg0 != 0) {
            return -75;
        } else {
            return this.field3814 == null ? 0 : this.field3814.method1353();
        }
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(I)I", line = 154)
    public final int method741(int arg0) {
        if (arg0 < 65) {
            return 61;
        } else {
            ++field3801;
            return this.field3795;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILha;)V", line = 167)
    public final void method732(int arg0, class454 arg1) {
        ++field3828;
        if (arg0 == -10891) {
            Object var3 = null;
            class108 var5;
            if (this.field3807 == null && this.field3809) {
                class239 var4 = this.method1756(262144, 0, arg1, true);
                var5 = var4 != null ? var4.field3082 : null;
            } else {
                var5 = this.field3807;
                this.field3807 = null;
            }
            if (var5 != null) {
                class586.method3264(var5, super.field5792, super.field5790, super.field5784, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(Lha;B)Lufa;", line = 195)
    public final class152 method520(class454 arg0, byte arg1) {
        ++field3805;
        if (this.field3804 == null) {
            this.field3804 = class517.method2966(super.field5790, this.method1759(arg0, (byte) 37, 0), super.field5784, 110, super.field5791);
        }
        if (arg1 <= 114) {
            this.method736((byte) -116);
        }
        return this.field3804;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IILha;Z)Lsca;", line = 210)
    private final class239 method1756(int arg0, int arg1, class454 arg2, boolean arg3) {
        ++field3819;
        class290 var5 = class358.field5112.method890(65535 & this.field3813, false);
        if (arg1 != 0) {
            method1760((class451) null, false);
        }
        class402 var6;
        class402 var7;
        if (!this.field3810) {
            if (super.field5792 < 3) {
                var6 = class716.field10106[super.field5792 - -1];
            } else {
                var6 = null;
            }
            var7 = class716.field10106[super.field5792];
        } else {
            var7 = class109.field1341[super.field5792];
            var6 = class716.field10106[0];
        }
        return var5.method1734(arg1 + 593, arg3, super.field5790, this.field3795 != 11 ? this.field3795 : 10, arg2, arg0, var6, super.field5791, ~this.field3795 == -12 ? 4 - -this.field3799 : this.field3799, var7, super.field5784);
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)Ljea;", line = 240)
    public static final class236 method1757(int arg0, int arg1) {
        ++field3806;
        class236 var2 = (class236) class190.field2493.method3597((long) arg1, 2087);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class27.field446.method3810(arg1, -23360, 0);
            if (var3 != null && var3.length > 1) {
                class236 var4;
                try {
                    var4 = class458.method2683(true, var3);
                    if (arg0 != 1) {
                        field3815 = -119;
                    }
                } catch (Exception var6) {
                    throw new RuntimeException(var6.getMessage() + " S: " + arg1);
                }
                class190.field2493.method3599(var4, 100, (long) arg1);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "(B)I", line = 272)
    public final int method269(byte arg0) {
        if (arg0 != 30) {
            return -76;
        } else {
            ++field3812;
            return this.field3814 == null ? 0 : this.field3814.method1333();
        }
    }

    @OriginalMember(owner = "client!wia", name = "k", descriptor = "(I)I", line = 284)
    public final int method1758(int arg0) {
        if (arg0 < 91) {
            this.method265((byte) 36);
        }
        ++field3802;
        return this.field3814 == null ? 15 : this.field3814.method1347() / 4;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lha;BI)Lka;", line = 295)
    private final class219 method1759(class454 arg0, byte arg1, int arg2) {
        ++field3798;
        if (arg1 != 37) {
            this.method741(-112);
        }
        if (this.field3814 != null && ~arg0.method135(this.field3814.method1340(), arg2) == -1) {
            return this.field3814;
        } else {
            class239 var4 = this.method1756(arg2, 0, arg0, false);
            return var4 != null ? var4.field3079 : null;
        }
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lha;Lqg;IIIIIZIIIIIIZ)V", line = 319)
    public class293(class454 arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field3777 == -2, class185.method1186(arg12, true, arg13));
        this.field3799 = (byte) arg13;
        this.field3821 = arg14;
        this.field3795 = (byte) arg12;
        this.field3810 = arg7;
        this.field3813 = (short) arg1.field3771;
        super.field5792 = (byte) arg3;
        this.field3793 = ~arg1.field3738 != -1 && !arg7;
        this.field3809 = arg0.method88() && arg1.field3739 && !this.field3810 && ~class223.field2944.field628.method1256((byte) -127) != -1;
        int var16 = 2048;
        if (this.field3821) {
            var16 |= 65536;
        }
        class239 var17 = this.method1756(var16, 0, arg0, this.field3809);
        if (var17 != null) {
            this.field3814 = var17.field3079;
            this.field3807 = var17.field3082;
            if (this.field3821) {
                this.field3814 = this.field3814.method1337((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(I)I", line = 354)
    public final int method735(int arg0) {
        ++field3826;
        return arg0 != 24123 ? 47 : this.field3813 & 65535;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lha;B)V", line = 371)
    public final void method740(class454 arg0, byte arg1) {
        ++field3808;
        Object var3 = null;
        class108 var5;
        if (this.field3807 == null && this.field3809) {
            class239 var4 = this.method1756(262144, 0, arg0, true);
            var5 = var4 == null ? null : var4.field3082;
        } else {
            var5 = this.field3807;
            this.field3807 = null;
        }
        if (arg1 > 16) {
            if (var5 != null) {
                class566.method3194(var5, super.field5792, super.field5790, super.field5784, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(B)Z", line = 401)
    public final boolean method516(byte arg0) {
        ++field3820;
        if (arg0 >= -67) {
            method1757(14, 26);
        }
        return this.field3821;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lha;I)Lie;", line = 412)
    public final class607 method509(class454 arg0, int arg1) {
        ++field3818;
        if (this.field3814 == null) {
            return null;
        } else {
            class376 var3 = arg0.method114();
            if (arg1 != -8964) {
                this.method509((class454) null, -3);
            }
            var3.method1963(super.field5790, super.field5791, super.field5784);
            class607 var4 = class311.method1814(arg1 ^ 9087, 1, this.field3793);
            if (!class306.field3936) {
                this.field3814.method1351(var3, var4.field8425[0], 0);
            } else {
                this.field3814.method1375(var3, var4.field8425[0], class468.field6738, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "(I)V", line = 439)
    public final void method523(int arg0) {
        this.field3821 = false;
        ++field3817;
        if (this.field3814 != null) {
            this.field3814.method1327(-65537 & this.field3814.method1340());
        }
        if (arg0 != 0) {
            this.field3814 = null;
        }
    }

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "(B)Z", line = 457)
    public final boolean method265(byte arg0) {
        ++field3822;
        int var2 = -28 % ((61 - arg0) / 45);
        if (this.field3814 != null) {
            return !this.field3814.method1342();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lrq;Z)V", line = 472)
    public static final void method1760(class451 arg0, boolean arg1) {
        for (int var2 = arg0.field6321; var2 <= arg0.field6322; ++var2) {
            for (int var3 = arg0.field6328; var3 <= arg0.field6324; ++var3) {
                class73 var4 = class495.field7002[arg0.field5779][var2][var3];
                if (var4 != null) {
                    class456 var5 = var4.field969;
                    class456 var6 = null;
                    while (var5 != null) {
                        if (var5.field6384 == arg0) {
                            if (var6 != null) {
                                var6.field6389 = var5.field6389;
                            } else {
                                var4.field969 = var5.field6389;
                            }
                            var5.method2673(-501);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field6389;
                    }
                }
            }
        }
        if (!arg1) {
            class142.method877(arg0);
        }
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)Z", line = 518)
    public final boolean method739(byte arg0) {
        ++field3796;
        int var2 = 94 / (arg0 / 32);
        return this.field3809;
    }
}
