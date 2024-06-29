import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class238 extends class86 implements class147 {

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "Ls;")
    public class253 field3427;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "Z")
    private boolean field3431;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lfc;")
    public static class235 field3421 = new class235(47, 4);

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "Lhs;")
    public static class295 field3435 = new class295(5, 1);

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Lac;")
    private class496 field3416;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLoa;)V")
    public final void method552(boolean arg0, class638 arg1) {
        ++field3430;
        class352 var3 = this.field3427.method1563(arg0, arg1, super.field1178, true, super.field1183, 262144, true);
        if (var3 != null) {
            int var4 = super.field1178 >> 9;
            int var5 = super.field1183 >> 9;
            class391 var6 = arg1.method401();
            var6.method1288(super.field1178, super.field1182, super.field1183);
            this.field3427.method1565(var4, var6, arg1, var5, 0, var5, var4, false, var3);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
    public final int method554(int arg0) {
        if (arg0 != -18971) {
            field3421 = null;
        }
        ++field3417;
        return this.field3427.field3569;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public final void method550(int arg0) {
        if (arg0 < -4) {
            ++field3418;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIBLoa;)V")
    public static final void method1501(int arg0, int arg1, int arg2, int arg3, byte arg4, class638 arg5) {
        ++field3434;
        arg5.method442(arg2, arg1, arg2 - -arg0, arg1 + arg3);
        arg5.method3558((byte) 57, arg1, -16777216, arg0, arg3, arg2);
        if (class160.field2400 >= 100) {
            float var6 = (float) class148.field2213 / (float) class148.field2209;
            int var7 = arg0;
            int var8 = arg3;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg0 * var6);
            } else {
                var7 = (int) ((float) arg3 / var6);
            }
            int var9 = (-var7 + arg0) / 2 + arg2;
            int var10 = (-var8 + arg3) / 2 + arg1;
            if (class232.field3303 == null || arg0 != class232.field3303.method31() || ~class232.field3303.method26() != ~arg3) {
                class148.method1023(class148.field2208, class148.field2213 + class148.field2206, class148.field2209 + class148.field2208, class148.field2206, var9, var10, var7 + var9, var10 - -var8);
                class148.method1028(arg5);
                class232.field3303 = arg5.method420(var9, var10, var7, var8, false);
            }
            class232.field3303.method2660(var9, var10);
            int var11 = class313.field4640 * var7 / class148.field2209;
            int var12 = -122 % ((arg4 - 63) / 56);
            int var13 = class674.field9483 * var8 / class148.field2213;
            int var14 = var9 - -(class679.field9576 * var7 / class148.field2209);
            int var15 = var10 - (class663.field9359 * var8 / class148.field2213 + -var8) + -var13;
            int var16 = -1996554240;
            if (class350.field5045 == class158.field2374) {
                var16 = -1996488705;
            }
            arg5.method472(var14, var15, var11, var13, var16, 1);
            arg5.method399(var14, var15, var11, var13, var16, 0);
            if (class669.field9441 > 0) {
                int var17;
                if (~class126.field1759 >= -51) {
                    var17 = class126.field1759 * 5;
                } else {
                    var17 = -(class126.field1759 * 5) + 500;
                }
                for (class209 var18 = (class209) class148.field2193.method1270((byte) -25); var18 != null; var18 = (class209) class148.field2193.method1282(0)) {
                    class307 var19 = class148.field2180.method2872((byte) 117, var18.field3086);
                    if (class345.method2055(var19, (byte) 101)) {
                        if (class351.field5051 == var18.field3086) {
                            int var20 = var18.field3081 * var7 / class148.field2209 + var9;
                            int var21 = (-var18.field3085 + class148.field2213) * var8 / class148.field2213 + var10;
                            arg5.method3558((byte) 119, var21 - 2, 16776960 | var17 << 24, 4, 4, var20 - 2);
                        } else if (class648.field9186 != -1 && ~class648.field9186 == ~var19.field4527) {
                            int var22 = var18.field3081 * var7 / class148.field2209 + var9;
                            int var23 = (-var18.field3085 + class148.field2213) * var8 / class148.field2213 + var10;
                            arg5.method3558((byte) 65, var23 + -2, 16776960 | var17 << 24, 4, 4, var22 + -2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)Z")
    public final boolean method140(int arg0) {
        ++field3420;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Loa;Llt;IIIIIZIII)V")
    public class238(class638 arg0, class620 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class479.method2719(arg8, 1, arg9));
        this.field3427 = new class253(arg0, arg1, arg8, arg9, arg2, arg3, super.field1178, super.field1183, arg7, arg10);
        this.field3431 = arg1.field8592 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(BLoa;)V")
    public final void method561(byte arg0, class638 arg1) {
        ++field3437;
        this.field3427.method1557(arg1, 28393);
        if (arg0 != 111) {
            this.field3427 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Loa;B)Lac;")
    public final class496 method551(class638 arg0, byte arg1) {
        ++field3425;
        if (arg1 > -62) {
            this.method554(112);
        }
        return this.field3416;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILoa;)Lba;")
    public final class352 method548(int arg0, int arg1, class638 arg2) {
        if (arg0 != -585) {
            this.field3416 = null;
        }
        ++field3423;
        return this.field3427.method1563(true, arg2, 0, false, 0, arg1, false);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Z")
    public final boolean method562(int arg0) {
        ++field3433;
        return arg0 != 29008 ? true : this.field3427.method1567((byte) -44);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        if (arg1 != -8003) {
            return true;
        } else {
            ++field3419;
            class352 var5 = this.field3427.method1563(true, arg2, super.field1178, false, super.field1183, 131072, false);
            if (var5 == null) {
                return false;
            } else {
                class391 var6 = arg2.method401();
                var6.method1288(super.field1178, super.field1182, super.field1183);
                return var5.method237(arg0, arg3, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILgfa;IIZLoa;)V")
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        int var8 = -41 % (-arg3 / 54);
        ++field3422;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)I")
    public final int method560(int arg0) {
        if (arg0 != 15654) {
            return -110;
        } else {
            ++field3429;
            return this.field3427.field3562;
        }
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
    public static void method1502(int arg0) {
        field3421 = null;
        field3435 = null;
        if (arg0 != 4) {
            method1501(76, 37, -42, 103, (byte) -91, (class638) null);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    public final void method142(boolean arg0) {
        if (arg0) {
            field3435 = null;
        }
        ++field3426;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILoa;)Lwc;")
    public final class60 method555(int arg0, class638 arg1) {
        ++field3424;
        class352 var3 = this.field3427.method1563(true, arg1, super.field1178, false, super.field1183, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class391 var4 = arg1.method401();
            var4.method1288(super.field1178, super.field1182, super.field1183);
            class60 var5 = null;
            if (this.field3431) {
                var5 = class450.method2583(1, false);
            }
            int var6 = super.field1178 >> 9;
            int var7 = super.field1183 >> 9;
            this.field3427.method1565(var6, var4, arg1, var7, arg0, var7, var6, true, var3);
            if (this.field3427.field3574 == null) {
                var3.method205(var4, var5 != null ? var5.field818[0] : null, 0);
            } else {
                class281 var8 = this.field3427.field3574.method2288();
                arg1.method434(var3, var8, var4, var5 != null ? var5.field818[0] : null, 0);
            }
            if (this.field3416 != null) {
                class403.method2302(super.field1183, false, super.field1182, super.field1178, this.field3416, var3);
            } else {
                this.field3416 = class687.method3783(super.field1178, super.field1182, var3, super.field1183, arg0 ^ -93);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)I")
    public final int method549(int arg0) {
        ++field3428;
        if (arg0 != 12352) {
            this.method562(58);
        }
        return this.field3427.field3548;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLoa;)V")
    public final void method556(byte arg0, class638 arg1) {
        ++field3432;
        if (arg0 < 5) {
            this.field3416 = null;
        }
        this.field3427.method1568(true, arg1);
    }
}
