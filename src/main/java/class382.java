import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class382 extends class319 implements class392 {

    @OriginalMember(owner = "client!eh", name = "wb", descriptor = "B")
    private byte field5592;

    @OriginalMember(owner = "client!eh", name = "Jb", descriptor = "Z")
    private boolean field5605;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "S")
    private short field5571;

    @OriginalMember(owner = "client!eh", name = "ub", descriptor = "Z")
    private boolean field5590;

    @OriginalMember(owner = "client!eh", name = "kb", descriptor = "Z")
    private boolean field5580;

    @OriginalMember(owner = "client!eh", name = "mb", descriptor = "B")
    private byte field5582;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "Z")
    private boolean field5569;

    @OriginalMember(owner = "client!eh", name = "jb", descriptor = "Lka;")
    public class500 field5579;

    @OriginalMember(owner = "client!eh", name = "xb", descriptor = "Lr;")
    private class195 field5593;

    @OriginalMember(owner = "client!eh", name = "sb", descriptor = "[I")
    public static int[] field5588 = new int[1024];

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
    public static int field5572 = 16777215;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!eh", name = "ib", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!eh", name = "lb", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!eh", name = "nb", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!eh", name = "ob", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!eh", name = "pb", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!eh", name = "qb", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!eh", name = "rb", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!eh", name = "tb", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!eh", name = "vb", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!eh", name = "zb", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!eh", name = "Ab", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!eh", name = "Bb", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!eh", name = "Cb", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!eh", name = "Db", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!eh", name = "Eb", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!eh", name = "Fb", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!eh", name = "Hb", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!eh", name = "Ib", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!eh", name = "Gb", descriptor = "Lcs;")
    public static class361 field5602;

    @OriginalMember(owner = "client!eh", name = "yb", descriptor = "Lel;")
    private class574 field5594;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
    public final void method25(int arg0) {
        if (arg0 == 14667) {
            ++field5574;
            if (this.field5579 != null) {
                this.field5579.method337();
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "(I)I")
    public final int method24(int arg0) {
        if (arg0 != 748449288) {
            this.field5571 = -44;
        }
        ++field5583;
        return this.field5579 != null ? this.field5579.method335() : 0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V")
    public static final void method2431(int arg0, int arg1, int arg2) {
        ++field5599;
        class16 var3 = class94.method753(13, 13175, (long) arg0);
        var3.method119(arg2 + -98);
        if (arg2 != 0) {
            field5602 = null;
        }
        var3.field237 = arg1;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method33(int arg0, int arg1, int arg2, class65 arg3) {
        ++field5598;
        class500 var5 = this.method2436(109, arg3, 131072);
        if (var5 != null) {
            class303 var6 = arg3.method450();
            var6.method981(super.field2257, super.field2246, super.field2259);
            return !class200.field2658 ? var5.method291(arg2, arg1, var6, false, 0) : var5.method311(arg2, arg1, var6, false, 0, class330.field4773);
        } else {
            if (arg0 != 4161) {
                this.field5582 = 81;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLha;)V")
    public final void method32(byte arg0, class65 arg1) {
        ++field5600;
        if (arg0 < 69) {
            this.method33(-97, -126, 96, (class65) null);
        }
    }

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "(I)I")
    public final int method28(int arg0) {
        ++field5575;
        if (arg0 != -13878) {
            method2437(126, true);
        }
        return this.field5579 == null ? 0 : this.field5579.method339();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
    public final int method18(int arg0) {
        if (arg0 != -10908) {
            return 26;
        } else {
            ++field5573;
            return this.field5582;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILha;Z)Lhi;")
    private final class218 method2432(int arg0, int arg1, class65 arg2, boolean arg3) {
        ++field5585;
        class589 var5 = class350.field5132.method3732((byte) 96, this.field5571 & 65535);
        class296 var6;
        class296 var7;
        if (!this.field5580) {
            if (super.field2244 >= 3) {
                var6 = null;
            } else {
                var6 = class412.field5933[super.field2244 + 1];
            }
            var7 = class412.field5933[super.field2244];
        } else {
            var7 = class538.field7317[super.field2244];
            var6 = class412.field5933[0];
        }
        return arg1 != -12 ? null : var5.method3279(super.field2246, var6, ~this.field5582 != -12 ? this.field5592 : this.field5592 + 4, var7, (class596) null, ~this.field5582 == -12 ? 10 : this.field5582, arg0, arg3, super.field2257, (byte) 53, super.field2259, arg2);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILha;)Ldfa;")
    public final class176 method22(int arg0, class65 arg1) {
        ++field5589;
        if (this.field5579 == null) {
            return null;
        } else {
            class303 var3 = arg1.method450();
            var3.method981(super.field2257, super.field2246, super.field2259);
            if (arg0 != -10) {
                return null;
            } else {
                class176 var4 = class567.method3167(this.field5590, 0, 1);
                if (class200.field2658) {
                    this.field5579.method300(var3, var4.field2345[0], class330.field4773, 0);
                } else {
                    this.field5579.method292(var3, var4.field2345[0], 0);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lha;I)V")
    public final void method34(class65 arg0, int arg1) {
        ++field5581;
        Object var3 = null;
        if (arg1 != -4351) {
            this.field5594 = null;
        }
        class195 var5;
        if (this.field5593 == null && this.field5569) {
            class218 var4 = this.method2432(262144, -12, arg0, true);
            var5 = var4 == null ? null : var4.field2908;
        } else {
            var5 = this.field5593;
            this.field5593 = null;
        }
        if (var5 != null) {
            class786.method4347(var5, super.field2244, super.field2257, super.field2259, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "(I)Z")
    public final boolean method59(int arg0) {
        if (arg0 != -1) {
            field5602 = null;
        }
        ++field5596;
        return this.field5605;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[B)Ljava/lang/String;")
    public static final String method2433(int arg0, byte[] arg1) {
        if (arg0 != 1) {
            method2431(-71, 108, -12);
        }
        ++field5587;
        return class349.method2203(arg1, 1958, 0, arg1.length);
    }

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "(I)V")
    public final void method66(int arg0) {
        ++field5595;
        this.field5605 = false;
        if (arg0 != -13514) {
            this.field5579 = null;
        }
        if (this.field5579 != null) {
            this.field5579.method295(this.field5579.method325() & -65537);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)I")
    public final int method17(int arg0) {
        if (arg0 != -2132) {
            this.field5582 = -82;
        }
        ++field5604;
        return this.field5592;
    }

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "(I)Z")
    public final boolean method21(int arg0) {
        ++field5591;
        if (this.field5579 != null) {
            return this.field5579.method326();
        } else {
            return arg0 != 0 ? false : false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Lha;I)V")
    public final void method20(class65 arg0, int arg1) {
        ++field5597;
        Object var3 = null;
        class195 var5;
        if (this.field5593 == null && this.field5569) {
            class218 var4 = this.method2432(262144, -12, arg0, true);
            var5 = var4 != null ? var4.field2908 : null;
        } else {
            var5 = this.field5593;
            this.field5593 = null;
        }
        if (var5 != null) {
            class167.method1203(var5, super.field2244, super.field2257, super.field2259, (boolean[]) null);
        }
        if (arg1 != -4947) {
            field5602 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "(I)V")
    public static void method2434(int arg0) {
        field5588 = null;
        if (arg0 == -65537) {
            field5602 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)Z")
    public final boolean method30(int arg0) {
        ++field5568;
        return arg0 <= 59 ? false : this.field5569;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lha;B)Lel;")
    public final class574 method27(class65 arg0, byte arg1) {
        ++field5576;
        if (this.field5594 == null) {
            this.field5594 = class321.method2038(-23545, this.method2436(-88, arg0, 0), super.field2259, super.field2257, super.field2246);
        }
        if (arg1 != -126) {
            field5572 = 25;
        }
        return this.field5594;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)I")
    public final int method2435(byte arg0) {
        ++field5584;
        if (arg0 >= -122) {
            return 48;
        } else {
            return this.field5579 == null ? 15 : this.field5579.method315() / 4;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lha;Lpu;IIIIIZIIIIIIZ)V")
    public class382(class65 arg0, class589 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field7897 == 1, class101.method787(arg12, arg13, (byte) -66));
        this.field5592 = (byte) arg13;
        this.field5605 = arg14;
        super.field2244 = (byte) arg3;
        this.field5571 = (short) arg1.field7856;
        this.field5590 = ~arg1.field7933 != -1 && !arg7;
        this.field5580 = arg7;
        this.field5582 = (byte) arg12;
        this.field5569 = arg0.method484() && arg1.field7942 && !this.field5580 && ~class712.field9959.field1319.method2854(56) != -1;
        int var16 = 2048;
        if (this.field5605) {
            var16 |= 65536;
        }
        class218 var17 = this.method2432(var16, -12, arg0, this.field5569);
        if (var17 != null) {
            this.field5579 = var17.field2909;
            this.field5593 = var17.field2908;
            if (this.field5605) {
                this.field5579 = this.field5579.method298((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILha;I)Lka;")
    private final class500 method2436(int arg0, class65 arg1, int arg2) {
        ++field5586;
        if (this.field5579 != null && arg1.method517(this.field5579.method325(), arg2) == 0) {
            return this.field5579;
        } else {
            int var4 = -21 % ((arg0 - -9) / 45);
            class218 var5 = this.method2432(arg2, -12, arg1, false);
            return var5 != null ? var5.field2909 : null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)I")
    public final int method31(int arg0) {
        ++field5603;
        return arg0 != -23356 ? 22 : this.field5571 & 65535;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lha;Lwea;ZIIII)V")
    public final void method60(class65 arg0, class167 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5578;
        if (arg3 < -16) {
            if (arg1 instanceof class695) {
                class695 var8 = (class695) arg1;
                if (this.field5579 != null && var8.field9742 != null) {
                    this.field5579.method297(var8.field9742, arg4, arg5, arg6, arg2);
                }
            } else {
                if (arg1 instanceof class382) {
                    class382 var9 = (class382) arg1;
                    if (this.field5579 != null && var9.field5579 != null) {
                        this.field5579.method297(var9.field5579, arg4, arg5, arg6, arg2);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(IZ)V")
    public static final void method2437(int arg0, boolean arg1) {
        ++field5570;
        class177.field2362 = arg0;
        if (!arg1) {
            method2434(-104);
        }
        class483.field6678.method1555((byte) -3);
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)Z")
    public final boolean method19(int arg0) {
        if (arg0 > -87) {
            this.method32((byte) -43, (class65) null);
        }
        ++field5601;
        if (this.field5579 != null) {
            return !this.field5579.method317();
        } else {
            return true;
        }
    }
}
