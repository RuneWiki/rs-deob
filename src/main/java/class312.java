import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class312 extends class114 {

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    private int field5012 = 0;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "I")
    private int field5017 = 1365;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    private int field5013 = 20;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "I")
    private int field5023 = 0;

    @OriginalMember(owner = "client!ik", name = "bb", descriptor = "Lee;")
    public static class74 field5026 = null;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "F")
    public static float field5016;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ik", name = "ab", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "Lnh;")
    public static class305 field5022;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLim;)V")
    public static final void method2108(boolean arg0, class178 arg1) {
        if (~class100.field1442 == ~arg1.field2704) {
            class274.field4355[arg1.field2540] = true;
        }
        if (arg0) {
            field5018 = -97;
        }
        ++field5019;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)V")
    public static final void method2109(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            field5014 = 22;
        }
        int var4 = class51.field716 * arg3 >> 8;
        ++field5020;
        if (~var4 != -1 && arg2 != -1) {
            class80.method510(class242.field3807, true, false, 0, var4, arg2);
            class137.field1876 = true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field5023 = arg0.method1379(-109);
                    }
                } else {
                    this.field5012 = arg0.method1379(arg2 ^ -12996);
                }
            } else {
                this.field5013 = arg0.method1379(-107);
            }
        } else {
            this.field5017 = arg0.method1379(-82);
        }
        ++field5011;
        if (arg2 != 12953) {
            field5026 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(II)V")
    public static final void method2110(int arg0, int arg1) {
        class39 var2 = class149.method935(arg1 ^ -103, arg0, arg1);
        ++field5021;
        var2.method268((byte) -19);
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class312() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)V")
    public static void method2111(int arg0) {
        field5022 = null;
        if (arg0 != 9401) {
            field5014 = 84;
        }
        field5026 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lnh;ZLnh;)V")
    public static final void method2112(class305 arg0, boolean arg1, class305 arg2) {
        class167.field2394 = arg0;
        if (!arg1) {
            method2111(63);
        }
        class38.field584 = arg2;
        ++field5024;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        if (arg1) {
            field5014 = 107;
        }
        int[] var3 = super.field1630.method302(arg0, -105);
        if (super.field1630.field710) {
            for (int var4 = 0; var4 < class145.field2009; ++var4) {
                int var5 = (class99.field1434[var4] << 12) / this.field5017 + this.field5012;
                int var6 = var5;
                int var7 = (class159.field2209[arg0] << 12) / this.field5017 + this.field5023;
                int var8 = var7;
                int var9 = var5;
                int var10 = var7;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                for (int var13 = var7 * var7 >> 12; ~(var11 + var13) > -16385 && var12 < this.field5013; var13 = var10 * var10 >> 12) {
                    ++var12;
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = var6 + var11 + -var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~(this.field5013 + -1) < ~var12 ? (var12 << 12) / this.field5013 : 0;
            }
        }
        ++field5025;
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIZII)V")
    public static final void method2113(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field5015;
        int var6 = arg1 - arg0;
        int var7 = arg5 - arg2;
        if (~var7 != -1) {
            if (var6 == 0) {
                class274.method1781(-114, arg5, arg2, arg4, arg0);
            } else {
                int var8 = (var6 << 12) / var7;
                int var9 = -(arg2 * var8 >> 12) + arg0;
                int var10;
                int var11;
                if (class261.field4204 <= arg5) {
                    if (class18.field310 < arg5) {
                        var10 = class18.field310;
                        var11 = (class18.field310 * var8 >> 12) + var9;
                    } else {
                        var10 = arg5;
                        var11 = arg1;
                    }
                } else {
                    var10 = class261.field4204;
                    var11 = (class261.field4204 * var8 >> 12) + var9;
                }
                if (arg3) {
                    field5022 = null;
                }
                int var12;
                int var13;
                if (~arg2 <= ~class261.field4204) {
                    if (class18.field310 < arg2) {
                        var12 = class18.field310;
                        var13 = (class18.field310 * var8 >> 12) + var9;
                    } else {
                        var13 = arg0;
                        var12 = arg2;
                    }
                } else {
                    var13 = (class261.field4204 * var8 >> 12) + var9;
                    var12 = class261.field4204;
                }
                if (var11 >= class271.field4322) {
                    if (~class311.field5001 > ~var11) {
                        var10 = (-var9 + class311.field5001 << 12) / var8;
                        var11 = class311.field5001;
                    }
                } else {
                    var11 = class271.field4322;
                    var10 = (-var9 + class271.field4322 << 12) / var8;
                }
                if (~var13 <= ~class271.field4322) {
                    if (~class311.field5001 > ~var13) {
                        var12 = (-var9 + class311.field5001 << 12) / var8;
                        var13 = class311.field5001;
                    }
                } else {
                    var12 = (class271.field4322 - var9 << 12) / var8;
                    var13 = class271.field4322;
                }
                class225.method1490(!arg3, var13, arg4, var11, var10, var12);
            }
        } else {
            if (var6 != 0) {
                class159.method993(arg1, arg2, arg0, arg4, 0);
            }
        }
    }
}
