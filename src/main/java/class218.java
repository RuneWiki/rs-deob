import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class218 extends class39 implements class147 {

    @OriginalMember(owner = "client!dt", name = "E", descriptor = "Ls;")
    public class253 field3152;

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "Z")
    private boolean field3146;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!dt", name = "F", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!dt", name = "K", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!dt", name = "L", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!dt", name = "N", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!dt", name = "O", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!dt", name = "P", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!dt", name = "Q", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!dt", name = "M", descriptor = "Lac;")
    private class496 field3160;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLoa;)V")
    public final void method556(byte arg0, class638 arg1) {
        if (arg0 < 5) {
            this.field3152 = null;
        }
        this.field3152.method1568(true, arg1);
        ++field3147;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Loa;B)Lac;")
    public final class496 method551(class638 arg0, byte arg1) {
        if (arg1 > -62) {
            this.method550(125);
        }
        ++field3159;
        return this.field3160;
    }

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "(I)I")
    public final int method179(int arg0) {
        ++field3149;
        if (arg0 != -1) {
            this.method140(-52);
        }
        return this.field3152.method1559((byte) -126);
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Loa;Llt;IIIIIZIIIIIII)V")
    public class218(class638 arg0, class620 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field8652 == -2, class293.method1838(arg13, -48, arg12));
        this.field3152 = new class253(arg0, arg1, arg12, arg13, super.field520, arg3, arg4, arg6, arg7, arg14);
        this.field3146 = ~arg1.field8592 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)Z")
    public final boolean method140(int arg0) {
        if (arg0 != 0) {
            this.method559(31, -97, (class638) null, 45);
        }
        ++field3143;
        return false;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
    public final void method142(boolean arg0) {
        ++field3150;
        if (arg0) {
            this.method555(93, (class638) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
    public final void method550(int arg0) {
        if (arg0 < -4) {
            ++field3144;
        }
    }

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)I")
    public final int method560(int arg0) {
        ++field3154;
        if (arg0 != 15654) {
            this.field3152 = null;
        }
        return this.field3152.field3562;
    }

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)I")
    public final int method549(int arg0) {
        ++field3148;
        return arg0 != 12352 ? 50 : this.field3152.field3548;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(BLoa;)V")
    public final void method561(byte arg0, class638 arg1) {
        this.field3152.method1557(arg1, arg0 + 28282);
        if (arg0 != 111) {
            this.field3146 = true;
        }
        ++field3156;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLoa;)V")
    public final void method552(boolean arg0, class638 arg1) {
        ++field3162;
        class352 var3 = this.field3152.method1563(true, arg1, super.field509, arg0, super.field514, 262144, true);
        if (var3 != null) {
            class391 var4 = arg1.method401();
            var4.method1288(super.field509, super.field518, super.field514);
            this.field3152.method1565(super.field516, var4, arg1, super.field512, 0, super.field519, super.field517, false, var3);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILoa;)Lba;")
    public final class352 method548(int arg0, int arg1, class638 arg2) {
        ++field3158;
        if (arg0 != -585) {
            this.field3160 = null;
        }
        return this.field3152.method1563(true, arg2, 0, false, 0, arg1, false);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZI[Lfaa;I)V")
    public static final void method1409(int arg0, int arg1, boolean arg2, int arg3, class140[] arg4, int arg5) {
        ++field3163;
        for (int var6 = arg0; ~var6 > ~arg4.length; ++var6) {
            class140 var7 = arg4[var6];
            if (var7 != null && ~var7.field2054 == ~arg3) {
                class434.method2494(91, arg2, arg1, var7, arg5);
                class121.method865((byte) -109, arg1, var7, arg5);
                if (~var7.field2122 < ~(-var7.field2121 + var7.field2062)) {
                    var7.field2122 = -var7.field2121 + var7.field2062;
                }
                if (var7.field2122 < 0) {
                    var7.field2122 = 0;
                }
                if (~(-var7.field2082 + var7.field1961) > ~var7.field2073) {
                    var7.field2073 = -var7.field2082 + var7.field1961;
                }
                if (var7.field2073 < 0) {
                    var7.field2073 = 0;
                }
                if (~var7.field2023 == -1) {
                    class316.method1936(var7, arg2, (byte) 85);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "(I)V")
    public static final void method1410(int arg0) {
        ++field3161;
        if (!class417.field5880) {
            class586.field8200 = true;
            class417.field5880 = true;
            if (arg0 == 14715) {
                if (class274.field3872.field874) {
                    class646.field9167 = (float) ((int) class646.field9167 + -65 & -128);
                } else {
                    class149.field2221 += (-class149.field2221 + -24.0F) / 2.0F;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILgfa;IIZLoa;)V")
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        ++field3157;
        int var8 = -72 % (-arg3 / 54);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        if (arg1 != -8003) {
            this.method562(-62);
        }
        ++field3151;
        class352 var5 = this.field3152.method1563(true, arg2, super.field509, false, super.field514, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class391 var6 = arg2.method401();
            var6.method1288(super.field509, super.field518, super.field514);
            return var5.method237(arg0, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILoa;)Lwc;")
    public final class60 method555(int arg0, class638 arg1) {
        ++field3145;
        class352 var3 = this.field3152.method1563(true, arg1, super.field509, false, super.field514, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class391 var4 = arg1.method401();
            var4.method1288(super.field509, super.field518, super.field514);
            class60 var5 = null;
            if (this.field3146) {
                var5 = class450.method2583(1, false);
            }
            this.field3152.method1565(super.field516, var4, arg1, super.field512, arg0, super.field519, super.field517, true, var3);
            if (this.field3152.field3574 != null) {
                class281 var6 = this.field3152.field3574.method2288();
                arg1.method434(var3, var6, var4, var5 == null ? null : var5.field818[0], 0);
            } else {
                var3.method205(var4, var5 != null ? var5.field818[0] : null, 0);
            }
            if (this.field3160 != null) {
                class403.method2302(super.field514, false, super.field518, super.field509, this.field3160, var3);
            } else {
                this.field3160 = class687.method3783(super.field509, super.field518, var3, super.field514, -112);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)Z")
    public final boolean method562(int arg0) {
        ++field3155;
        if (arg0 != 29008) {
            this.field3146 = false;
        }
        return this.field3152.method1567((byte) -43);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)Z")
    public static final boolean method1411(byte arg0) {
        if (arg0 != 1) {
            return true;
        } else {
            ++field3153;
            return ~class268.field3802 != -1 ? true : class230.field3284.method2462(arg0 + -2086);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)I")
    public final int method554(int arg0) {
        ++field3164;
        return arg0 != -18971 ? 122 : this.field3152.field3569;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1412(int arg0, boolean arg1) {
        ++field3142;
        if (arg1) {
            return true;
        } else {
            return arg0 == 3 || ~arg0 == -5;
        }
    }
}
