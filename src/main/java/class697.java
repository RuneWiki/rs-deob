import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class697 extends class280 implements class392 {

    @OriginalMember(owner = "client!gba", name = "jb", descriptor = "Z")
    private boolean field9772;

    @OriginalMember(owner = "client!gba", name = "xb", descriptor = "S")
    private short field9786;

    @OriginalMember(owner = "client!gba", name = "T", descriptor = "Z")
    private boolean field9756;

    @OriginalMember(owner = "client!gba", name = "hb", descriptor = "B")
    private byte field9770;

    @OriginalMember(owner = "client!gba", name = "Z", descriptor = "B")
    private byte field9762;

    @OriginalMember(owner = "client!gba", name = "ab", descriptor = "Z")
    private boolean field9763;

    @OriginalMember(owner = "client!gba", name = "fb", descriptor = "Lr;")
    private class195 field9768;

    @OriginalMember(owner = "client!gba", name = "ub", descriptor = "Lka;")
    private class500 field9783;

    @OriginalMember(owner = "client!gba", name = "db", descriptor = "I")
    public static int field9766 = 0;

    @OriginalMember(owner = "client!gba", name = "ob", descriptor = "Z")
    public static boolean field9777 = false;

    @OriginalMember(owner = "client!gba", name = "wb", descriptor = "[B")
    public static byte[] field9785 = new byte[2048];

    @OriginalMember(owner = "client!gba", name = "sb", descriptor = "Z")
    public static boolean field9781 = false;

    @OriginalMember(owner = "client!gba", name = "U", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!gba", name = "V", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!gba", name = "W", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!gba", name = "X", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!gba", name = "Y", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!gba", name = "bb", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!gba", name = "cb", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!gba", name = "eb", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!gba", name = "gb", descriptor = "I")
    public static int field9769;

    @OriginalMember(owner = "client!gba", name = "ib", descriptor = "I")
    public static int field9771;

    @OriginalMember(owner = "client!gba", name = "kb", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!gba", name = "lb", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!gba", name = "mb", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!gba", name = "nb", descriptor = "I")
    public static int field9776;

    @OriginalMember(owner = "client!gba", name = "pb", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!gba", name = "qb", descriptor = "I")
    public static int field9779;

    @OriginalMember(owner = "client!gba", name = "rb", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!gba", name = "tb", descriptor = "I")
    public static int field9782;

    @OriginalMember(owner = "client!gba", name = "yb", descriptor = "I")
    public static int field9787;

    @OriginalMember(owner = "client!gba", name = "zb", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!gba", name = "Ab", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!gba", name = "vb", descriptor = "Lel;")
    private class574 field9784;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(BLha;)V")
    public final void method32(byte arg0, class65 arg1) {
        ++field9769;
        if (arg0 < 69) {
            this.method24(118);
        }
    }

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "(I)Z")
    public final boolean method30(int arg0) {
        ++field9759;
        return arg0 <= 59 ? false : this.field9763;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lha;B)Lel;")
    public final class574 method27(class65 arg0, byte arg1) {
        if (arg1 != -126) {
            this.field9763 = true;
        }
        if (this.field9784 == null) {
            this.field9784 = class321.method2038(-23545, this.method3848(6051, arg0, 0), super.field2259, super.field2257, super.field2246);
        }
        ++field9782;
        return this.field9784;
    }

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "(I)Z")
    public final boolean method21(int arg0) {
        if (arg0 != 0) {
            field9781 = true;
        }
        ++field9760;
        return this.field9783 == null ? false : this.field9783.method326();
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method3845(int arg0, int arg1, String arg2) {
        ++field9775;
        int var3 = class571.field7608;
        int[] var4 = class79.field1136;
        boolean var5 = false;
        int var6 = 107 % ((10 - arg1) / 50);
        for (int var7 = 0; var7 < var3; ++var7) {
            class73 var8 = class599.field8149[var4[var7]];
            if (var8 != null && class551.field7456 != var8 && var8.field1020 != null && var8.field1020.equalsIgnoreCase(arg2)) {
                var5 = true;
                if (arg0 == 1) {
                    ++class605.field8219;
                    class267 var9 = class545.method3099((byte) 112, class269.field3966, class245.field3311);
                    var9.field3938.method2363(29262, var4[var7]);
                    var9.field3938.method2374(128, 0);
                    class617.method3392(var9, true);
                } else if (~arg0 != -5) {
                    if (~arg0 != -6) {
                        if (arg0 != 6) {
                            if (arg0 != 7) {
                                if (arg0 == 9) {
                                    class267 var10 = class545.method3099((byte) 38, class269.field3966, class373.field5391);
                                    var10.field3938.method2415(false, var4[var7]);
                                    var10.field3938.method2352((byte) -52, 0);
                                    class617.method3392(var10, true);
                                }
                            } else {
                                ++class684.field9626;
                                class267 var11 = class545.method3099((byte) 44, class269.field3966, class561.field7535);
                                var11.field3938.method2380(65280, 0);
                                var11.field3938.method2363(29262, var4[var7]);
                                class617.method3392(var11, true);
                            }
                        } else {
                            ++class247.field3685;
                            class267 var12 = class545.method3099((byte) 84, class269.field3966, class731.field10130);
                            var12.field3938.method2380(65280, 0);
                            var12.field3938.method2363(29262, var4[var7]);
                            class617.method3392(var12, true);
                        }
                    } else {
                        ++class198.field2647;
                        class267 var13 = class545.method3099((byte) 71, class269.field3966, class676.field9480);
                        var13.field3938.method2380(65280, 0);
                        var13.field3938.method2415(false, var4[var7]);
                        class617.method3392(var13, true);
                    }
                } else {
                    ++class208.field2738;
                    class267 var14 = class545.method3099((byte) 106, class269.field3966, class24.field379);
                    var14.field3938.method2415(false, var4[var7]);
                    var14.field3938.method2352((byte) -52, 0);
                    class617.method3392(var14, true);
                }
                break;
            }
        }
        if (!var5) {
            class780.method4307((byte) 123, class474.field6560.method2780(108, class38.field589) + arg2, 4);
        }
    }

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "(B)V")
    public static void method3846(byte arg0) {
        if (arg0 != -109) {
            field9777 = true;
        }
        field9785 = null;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lha;ZBI)Lhi;")
    private final class218 method3847(class65 arg0, boolean arg1, byte arg2, int arg3) {
        if (arg2 <= 126) {
            field9781 = true;
        }
        ++field9787;
        class589 var5 = class350.field5132.method3732((byte) 48, this.field9786 & 65535);
        class296 var6;
        class296 var7;
        if (!this.field9756) {
            var6 = class412.field5933[super.field2244];
            if (~super.field2244 > -4) {
                var7 = class412.field5933[super.field2244 - -1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class412.field5933[0];
            var6 = class538.field7317[super.field2244];
        }
        return var5.method3279(super.field2246, var7, this.field9762, var6, (class596) null, this.field9770, arg3, arg1, super.field2257, (byte) 53, super.field2259, arg0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILha;I)Lka;")
    private final class500 method3848(int arg0, class65 arg1, int arg2) {
        if (arg0 != 6051) {
            return null;
        } else {
            ++field9761;
            if (this.field9783 != null && ~arg1.method517(this.field9783.method325(), arg2) == -1) {
                return this.field9783;
            } else {
                class218 var4 = this.method3847(arg1, false, (byte) 127, arg2);
                return var4 != null ? var4.field2909 : null;
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method33(int arg0, int arg1, int arg2, class65 arg3) {
        ++field9771;
        if (arg0 != 4161) {
            return false;
        } else {
            class500 var5 = this.method3848(6051, arg3, 131072);
            if (var5 != null) {
                class303 var6 = arg3.method450();
                var6.method981(super.field2257, super.field2246, super.field2259);
                return class200.field2658 ? var5.method311(arg2, arg1, var6, false, 0, class330.field4773) : var5.method291(arg2, arg1, var6, false, 0);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "(I)I")
    public final int method24(int arg0) {
        ++field9780;
        if (arg0 != 748449288) {
            this.field9762 = 122;
        }
        return this.field9783 != null ? this.field9783.method335() : 0;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lha;Lpu;IIIIIZIIII)V")
    public class697(class65 arg0, class589 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field2257 = arg4;
        this.field9772 = arg1.field7933 != 0 && !arg7;
        this.field9786 = (short) arg1.field7856;
        this.field9756 = arg7;
        super.field2259 = arg6;
        this.field9770 = (byte) arg10;
        this.field9762 = (byte) arg11;
        this.field9763 = arg0.method484() && arg1.field7942 && !this.field9756 && class712.field9959.field1319.method2854(27) != 0;
        class218 var13 = this.method3847(arg0, this.field9763, (byte) 127, 2048);
        if (var13 != null) {
            this.field9768 = var13.field2908;
            this.field9783 = var13.field2909;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILha;)Ldfa;")
    public final class176 method22(int arg0, class65 arg1) {
        if (arg0 != -10) {
            this.method19(29);
        }
        ++field9776;
        if (this.field9783 == null) {
            return null;
        } else {
            class303 var3 = arg1.method450();
            var3.method981(super.field4132 + super.field2257, super.field2246, super.field4134 + super.field2259);
            class176 var4 = class567.method3167(this.field9772, arg0 + 10, 1);
            if (class200.field2658) {
                this.field9783.method300(var3, var4.field2345[0], class330.field4773, 0);
            } else {
                this.field9783.method292(var3, var4.field2345[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lha;I)V")
    public final void method34(class65 arg0, int arg1) {
        if (arg1 != -4351) {
            this.method3848(-81, (class65) null, 117);
        }
        ++field9765;
        Object var3 = null;
        class195 var5;
        if (this.field9768 == null && this.field9763) {
            class218 var4 = this.method3847(arg0, true, (byte) 127, 262144);
            var5 = var4 != null ? var4.field2908 : null;
        } else {
            var5 = this.field9768;
            this.field9768 = null;
        }
        if (var5 != null) {
            class786.method4347(var5, super.field2244, super.field2257, super.field2259, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)Z")
    public static final boolean method3849(int arg0, byte arg1) {
        if (arg1 != -49) {
            return false;
        } else {
            ++field9778;
            return ~arg0 == -4 || arg0 == 5 || arg0 == 6;
        }
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V")
    public final void method25(int arg0) {
        if (arg0 == 14667) {
            if (this.field9783 != null) {
                this.field9783.method337();
            }
            ++field9758;
        }
    }

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "(I)I")
    public final int method31(int arg0) {
        if (arg0 != -23356) {
            this.field9770 = -82;
        }
        ++field9779;
        return this.field9786 & 65535;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(Lha;I)V")
    public final void method20(class65 arg0, int arg1) {
        ++field9773;
        Object var3 = null;
        class195 var5;
        if (this.field9768 == null && this.field9763) {
            class218 var4 = this.method3847(arg0, true, (byte) 127, 262144);
            var5 = var4 == null ? null : var4.field2908;
        } else {
            var5 = this.field9768;
            this.field9768 = null;
        }
        if (var5 != null) {
            class167.method1203(var5, super.field2244, super.field2257, super.field2259, (boolean[]) null);
        }
        if (arg1 != -4947) {
            field9766 = 93;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII)I")
    public static final int method3850(int arg0, int arg1, int arg2, int arg3) {
        ++field9757;
        int var4 = arg1 - arg3;
        int var5 = ((16711935 & arg0) * arg3 & -16711936 | 16711680 & (65280 & arg0) * arg3) >>> 8;
        return (((65280 & arg2) * var4 & 16711680 | (16711935 & arg2) * var4 & -16711936) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "(I)Z")
    public final boolean method19(int arg0) {
        ++field9789;
        if (arg0 > -87) {
            return false;
        } else if (this.field9783 == null) {
            return true;
        } else {
            return !this.field9783.method317();
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)I")
    public final int method17(int arg0) {
        if (arg0 != -2132) {
            this.field9770 = -40;
        }
        ++field9774;
        return this.field9762;
    }

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "(I)V")
    public static final void method3851(int arg0) {
        ++field9764;
        if (arg0 == 0) {
            if (class781.method4309((byte) 90)) {
                if (class257.field3837 == null) {
                    class158.method1163(true);
                }
                class718.field10016 = true;
                class583.field7786 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)I")
    public final int method18(int arg0) {
        ++field9788;
        if (arg0 != -10908) {
            this.field9772 = false;
        }
        return this.field9770;
    }

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "(I)I")
    public final int method28(int arg0) {
        if (arg0 != -13878) {
            return 39;
        } else {
            ++field9767;
            return this.field9783 == null ? 0 : this.field9783.method339();
        }
    }
}
