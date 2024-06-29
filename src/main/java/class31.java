import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 extends class157 {

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    private int field556 = 0;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    private int field565 = 0;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    private int field571 = 0;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "Lta;")
    public static class255 field554 = new class255(32);

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    public static int field570 = 0;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "[Z")
    public static boolean[] field562 = new boolean[100];

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        ++field560;
        if (arg0 != 1) {
            this.field567 = -89;
        }
        int[][] var3 = super.field2872.method533(arg1, arg0 + 2);
        if (super.field2872.field1434) {
            int[][] var4 = this.method1093(arg1, 0, 64);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class226.field4124; ++var11) {
                this.method251(var6[var11], var5[var11], -649582004, var7[var11]);
                this.field566 += this.field571;
                this.field561 += this.field556;
                if (~this.field561 > -1) {
                    this.field561 = 0;
                }
                if (~this.field561 < -4097) {
                    this.field561 = 4096;
                }
                this.field555 += this.field565;
                if (this.field566 < 0) {
                    this.field566 = 0;
                }
                if (this.field566 > 4096) {
                    this.field566 = 4096;
                }
                while (~this.field555 > -1) {
                    this.field555 += 4096;
                }
                while (~this.field555 < -4097) {
                    this.field555 -= 4096;
                }
                this.method252(this.field555, this.field566, 23234, this.field561);
                var8[var11] = this.field558;
                var10[var11] = this.field564;
                var9[var11] = this.field567;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field563;
        if (arg1 > -29) {
            this.method1(65, (byte) -13, (class106) null);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field556 = (arg2.method777(106) << 12) / 100;
                }
            } else {
                this.field571 = (arg2.method777(69) << 12) / 100;
            }
        } else {
            this.field565 = arg2.method738(255);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
    private final void method251(int arg0, int arg1, int arg2, int arg3) {
        ++field559;
        int var5 = ~arg1 < ~arg0 ? arg1 : arg0;
        int var6 = arg3 > var5 ? arg3 : var5;
        int var7 = arg1 < arg0 ? arg1 : arg0;
        int var8 = var7 <= arg3 ? var7 : arg3;
        if (arg2 == -649582004) {
            this.field561 = (var8 - -var6) / 2;
            int var9 = -var8 + var6;
            if (var9 <= 0) {
                this.field555 = 0;
            } else {
                int var10 = (-arg1 + var6 << 12) / var9;
                int var11 = (-arg3 + var6 << 12) / var9;
                int var12 = (var6 - arg0 << 12) / var9;
                if (~arg1 != ~var6) {
                    if (arg0 != var6) {
                        this.field555 = arg1 == var8 ? 12288 - -var12 : 20480 - var10;
                    } else {
                        this.field555 = arg3 != var8 ? -var11 + 12288 : var10 + 4096;
                    }
                } else {
                    this.field555 = arg0 == var8 ? var11 + 20480 : -var12 + 4096;
                }
                this.field555 /= 6;
            }
            if (this.field561 > 0 && ~this.field561 > -4097) {
                this.field566 = (var9 << 12) / (this.field561 > 2048 ? -(this.field561 * 2) + 8192 : this.field561 * 2);
            } else {
                this.field566 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class31() {
        super(1, false);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IIII)V")
    private final void method252(int arg0, int arg1, int arg2, int arg3) {
        ++field569;
        int var5 = ~arg3 < -2049 ? -(arg1 * arg3 >> 12) + arg1 + arg3 : (4096 - -arg1) * arg3 >> 12;
        if (var5 > 0) {
            int var6 = arg3 - -arg3 - var5;
            int var7 = (var5 - var6 << 12) / var5;
            int var8 = arg0 * 6;
            int var9 = var8 >> 12;
            int var10 = -(var9 << 12) + var8;
            int var12 = var7 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var6 + var13;
            int var15 = var5 - var13;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field564 = var6;
                                    this.field567 = var15;
                                    this.field558 = var5;
                                }
                            } else {
                                this.field567 = var5;
                                this.field558 = var14;
                                this.field564 = var6;
                            }
                        } else {
                            this.field567 = var5;
                            this.field564 = var15;
                            this.field558 = var6;
                        }
                    } else {
                        this.field558 = var6;
                        this.field567 = var14;
                        this.field564 = var5;
                    }
                } else {
                    this.field564 = var5;
                    this.field558 = var15;
                    this.field567 = var6;
                }
            } else {
                this.field567 = var6;
                this.field558 = var5;
                this.field564 = var14;
            }
        } else {
            this.field558 = this.field564 = this.field567 = arg3;
        }
        if (arg2 != 23234) {
            field568 = 37;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)I")
    public static final int method253(int arg0, int arg1) {
        ++field572;
        if (arg0 != -1102430612) {
            method255(105);
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 + -61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IIIIII)V")
    public static final void method254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 90 / ((-57 - arg1) / 63);
        int var7 = -arg4 + arg0;
        int var8 = -arg5 + arg2;
        ++field557;
        if (~var7 != -1) {
            if (var8 == 0) {
                class235.method1631(arg3, -38, arg4, arg5, arg0);
            } else {
                int var9 = (var8 << 12) / var7;
                int var10 = arg5 - (arg4 * var9 >> 12);
                int var11;
                int var12;
                if (class262.field4723 > arg4) {
                    var11 = (class262.field4723 * var9 >> 12) + var10;
                    var12 = class262.field4723;
                } else if (~class230.field4184 <= ~arg4) {
                    var12 = arg4;
                    var11 = arg5;
                } else {
                    var11 = (class230.field4184 * var9 >> 12) + var10;
                    var12 = class230.field4184;
                }
                int var13;
                int var14;
                if (~arg0 > ~class262.field4723) {
                    var13 = (class262.field4723 * var9 >> 12) + var10;
                    var14 = class262.field4723;
                } else if (class230.field4184 < arg0) {
                    var13 = var10 - -(class230.field4184 * var9 >> 12);
                    var14 = class230.field4184;
                } else {
                    var14 = arg0;
                    var13 = arg2;
                }
                if (var13 < class102.field1957) {
                    var14 = (-var10 + class102.field1957 << 12) / var9;
                    var13 = class102.field1957;
                } else if (var13 > class155.field2847) {
                    var14 = (-var10 + class155.field2847 << 12) / var9;
                    var13 = class155.field2847;
                }
                if (~class102.field1957 >= ~var11) {
                    if (class155.field2847 < var11) {
                        var12 = (class155.field2847 - var10 << 12) / var9;
                        var11 = class155.field2847;
                    }
                } else {
                    var11 = class102.field1957;
                    var12 = (-var10 + class102.field1957 << 12) / var9;
                }
                class137.method955(true, var11, var12, arg3, var13, var14);
            }
        } else {
            if (~var8 != -1) {
                class116.method821(arg2, arg3, arg5, 12, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "h", descriptor = "(I)V")
    public static void method255(int arg0) {
        field562 = null;
        field554 = null;
        if (arg0 != -1) {
            method253(17, -69);
        }
    }
}
