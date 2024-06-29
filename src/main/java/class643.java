import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class643 extends class599 implements class57 {

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "Ltj;")
    public class170 field9258;

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "Z")
    private boolean field9271;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "[I")
    public static int[] field9254 = new int[4];

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "Lfea;")
    public static class123 field9259 = new class123();

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
    public static int field9270;

    @OriginalMember(owner = "client!wo", name = "N", descriptor = "I")
    public static int field9272;

    @OriginalMember(owner = "client!wo", name = "P", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "Lew;")
    private class425 field9266;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field9268;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)Z")
    public final boolean method84(int arg0) {
        ++field9270;
        if (arg0 != 1630) {
            field9268 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)I")
    public final int method95(int arg0) {
        ++field9253;
        int var2 = -80 % ((14 - arg0) / 33);
        return this.field9258.field2098;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)I")
    public static final int method3657(int arg0, int arg1) {
        if (arg0 != 4) {
            return -123;
        } else {
            int var2 = (arg1 >>> 1 & 1431655765) + (1431655765 & arg1);
            ++field9252;
            int var3 = (var2 >>> 2 & -1288490189) + (var2 & 858993459);
            int var4 = (var3 >>> 4) + var3 & 252645135;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return 255 & var6;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIILva;Loa;ZI)V")
    public final void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6) {
        if (arg0 != 7) {
            field9268 = null;
        }
        ++field9264;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)I")
    public final int method92(int arg0) {
        if (arg0 != 9812) {
            return -109;
        } else {
            ++field9256;
            return this.field9258.field2087;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(Loa;I)Lew;")
    public final class425 method100(class605 arg0, int arg1) {
        if (arg1 != 28286) {
            this.method84(-82);
        }
        ++field9273;
        return this.field9266;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Z")
    public final boolean method93(int arg0) {
        ++field9263;
        return arg0 != -23445 ? false : this.field9258.method979(1597);
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V")
    public static void method3658(byte arg0) {
        field9259 = null;
        field9268 = null;
        if (arg0 < 24) {
            method3657(-75, 96);
        }
        field9254 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Loa;I)V")
    public final void method90(class605 arg0, int arg1) {
        if (arg1 != -5) {
            field9268 = null;
        }
        ++field9260;
        class327 var3 = this.field9258.method981(super.field8751, true, super.field8747, 96, 262144, arg0, true);
        if (var3 != null) {
            int var4 = super.field8751 >> 9;
            int var5 = super.field8747 >> 9;
            class364 var6 = arg0.method342();
            var6.method2014(super.field8751, super.field8755, super.field8747);
            this.field9258.method976(var6, (byte) 87, var3, var4, false, var5, var4, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZLoa;)Lba;")
    public final class327 method94(int arg0, boolean arg1, class605 arg2) {
        ++field9267;
        if (arg1) {
            this.field9266 = null;
        }
        return this.field9258.method981(0, false, 0, 98, arg0, arg2, false);
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)I")
    public static int method3659(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Loa;Lqd;IIIIIZIII)V")
    public class643(class605 arg0, class385 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class403.method2568(64, arg9, arg8));
        this.field9258 = new class170(arg0, arg1, arg8, arg9, arg2, arg3, super.field8751, super.field8747, arg7, arg10);
        this.field9271 = arg1.field5806 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILoa;Leea;I)V")
    public static final void method3660(int arg0, int arg1, class605 arg2, class114 arg3, int arg4) {
        ++field9257;
        class501.field7292.method718(arg4 ^ -112);
        if (arg4 != 0) {
            field9259 = null;
        }
        if (!class629.field9078) {
            for (class480 var5 = (class480) arg3.method719(false); var5 != null; var5 = (class480) arg3.method716(14)) {
                class431 var6 = class182.field2242.method1014(var5.field7060, 5187);
                if (class599.method3481(var6, 10)) {
                    boolean var7 = class238.method1591(1, arg1, arg2, arg0, var6, var5);
                    if (var7) {
                        class454.method2809(arg2, var6, var5, -65);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Loa;B)Laca;")
    public final class630 method88(class605 arg0, byte arg1) {
        ++field9251;
        class327 var3 = this.field9258.method981(super.field8751, true, super.field8747, 101, 2048, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            class364 var4 = arg0.method342();
            var4.method2014(super.field8751, super.field8755, super.field8747);
            class630 var5 = null;
            if (this.field9271) {
                var5 = class471.method2882(-125, 1);
            }
            int var6 = super.field8751 >> 9;
            int var7 = super.field8747 >> 9;
            this.field9258.method976(var4, (byte) 114, var3, var6, true, var7, var6, arg0, var7);
            if (this.field9258.field2075 != null) {
                class33 var8 = this.field9258.field2075.method1334();
                arg0.method307(var3, var8, var4, var5 != null ? var5.field9084[0] : null, 0);
            } else {
                var3.method1380(var4, var5 != null ? var5.field9084[0] : null, 0);
            }
            if (arg1 > -127) {
                field9254 = null;
            }
            if (this.field9266 == null) {
                this.field9266 = class645.method3676(super.field8747, super.field8755, (byte) -41, super.field8751, var3);
            } else {
                class27.method158(super.field8747, this.field9266, (byte) 118, var3, super.field8751, super.field8755);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLoa;)V")
    public final void method102(byte arg0, class605 arg1) {
        if (arg0 >= -54) {
            this.method102((byte) 118, (class605) null);
        }
        ++field9261;
        this.field9258.method975(262144, arg1);
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
    public final void method87(int arg0) {
        if (arg0 != 7511) {
            this.field9271 = true;
        }
        ++field9269;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        ++field9265;
        class327 var5 = this.field9258.method981(super.field8751, false, super.field8747, 123, 131072, arg2, false);
        if (var5 == null) {
            return false;
        } else {
            class364 var6 = arg2.method342();
            if (arg0 != -10503) {
                method3660(-70, -102, (class605) null, (class114) null, -84);
            }
            var6.method2014(super.field8751, super.field8755, super.field8747);
            return var5.method1381(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
    public final void method96(byte arg0) {
        ++field9272;
        if (arg0 != -76) {
            this.method88((class605) null, (byte) -45);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILoa;)V")
    public final void method98(int arg0, class605 arg1) {
        this.field9258.method972(arg1, -22979);
        ++field9262;
        if (arg0 != 16343) {
            field9254 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)I")
    public final int method89(int arg0) {
        ++field9255;
        int var2 = 118 / ((arg0 - 11) / 51);
        return this.field9258.field2079;
    }
}
