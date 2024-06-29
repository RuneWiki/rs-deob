import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class301 extends class739 {

    @OriginalMember(owner = "client!ofa", name = "E", descriptor = "I")
    private int field4122 = 4096;

    @OriginalMember(owner = "client!ofa", name = "D", descriptor = "[I")
    private int[] field4121 = new int[3];

    @OriginalMember(owner = "client!ofa", name = "B", descriptor = "I")
    private int field4119 = 4096;

    @OriginalMember(owner = "client!ofa", name = "K", descriptor = "I")
    private int field4127 = 4096;

    @OriginalMember(owner = "client!ofa", name = "L", descriptor = "I")
    private int field4128 = 409;

    @OriginalMember(owner = "client!ofa", name = "G", descriptor = "I")
    public static int field4124 = 0;

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ofa", name = "A", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ofa", name = "C", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!ofa", name = "I", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!ofa", name = "J", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!ofa", name = "N", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ofa", name = "F", descriptor = "Ltd;")
    public static class515 field4123;

    @OriginalMember(owner = "client!ofa", name = "M", descriptor = "Lha;")
    public static class543 field4129;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(II)[[I")
    public final int[][] method113(int arg0, int arg1) {
        if (arg1 != 8213) {
            this.field4121 = null;
        }
        ++field4120;
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int[][] var4 = this.method4124(arg0, 0, true);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class399.field5703 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4121[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field4128 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field4121[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field4128 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4121[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field4128 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4127 * var12 >> 12;
                            var9[var11] = this.field4122 * var14 >> 12;
                            var10[var11] = this.field4119 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "(Z)V")
    public static void method1885(boolean arg0) {
        field4129 = null;
        field4123 = null;
        if (arg0) {
            method1886(94, true, (byte) 82, -120, -120);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field4125;
        if (arg2 == 1) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 == -5) {
                                int var5 = arg0.method2865(255);
                                this.field4121[1] = class368.method2314(65280, var5) >> 4;
                                this.field4121[0] = class368.method2314(var5, 16711680) << 4;
                                this.field4121[2] = class368.method2314(255, var5) >> 12;
                            }
                        } else {
                            this.field4127 = arg0.method2882(-1);
                        }
                    } else {
                        this.field4122 = arg0.method2882(arg2 + -2);
                    }
                } else {
                    this.field4119 = arg0.method2882(-1);
                }
            } else {
                this.field4128 = arg0.method2882(-1);
            }
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IZBII)V")
    public static final void method1886(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        ++field4126;
        class50.method468(-72);
        class568.field8209 = 0L;
        if (arg2 > 56) {
            int var5 = class184.method1305(1);
            if (~arg4 == -4 || var5 == 3) {
                arg1 = true;
            }
            if (!class211.field3164.method255()) {
                arg1 = true;
            }
            class39.method416(arg1, var5, arg4, -26, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(III)B")
    public static final byte method1887(int arg0, int arg1, int arg2) {
        ++field4118;
        if (~arg2 != -10) {
            return 0;
        } else {
            if (arg1 != 2) {
                field4129 = null;
            }
            return (byte) (~(1 & arg0) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)V")
    public static final void method1888(int arg0) {
        ++field4130;
        if (arg0 != 4096) {
            field4123 = null;
        }
        for (class279 var1 = (class279) class154.field2233.method3565(arg0 ^ 4206); var1 != null; var1 = (class279) class154.field2233.method3561((byte) 77)) {
            if (var1.field3909 == -1) {
                var1.field3898 = 0;
                if (~var1.field3906 <= -1 && var1.field3901 >= 0 && class184.field2546 > var1.field3906 && var1.field3901 < class240.field3555) {
                    class616.method3576(arg0 + -28104, var1);
                }
            } else {
                var1.method2656((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "()V")
    public class301() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "(Z)V")
    public static final void method1889(boolean arg0) {
        ++field4117;
        if (!arg0) {
            method1888(-13);
        }
        if (class429.field6178 != null) {
            class255[] var1 = class429.field6178;
            for (int var2 = 0; ~var1.length < ~var2; ++var2) {
                class255 var3 = var1[var2];
                var3.method1337((byte) -45);
            }
        }
    }
}
