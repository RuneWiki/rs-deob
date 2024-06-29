import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class275 extends class361 {

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    private int field3611 = 0;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lbi;")
    private class334 field3624 = new class334();

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(ILht;)V", line = 7)
    public final void method1042(int arg0, class409 arg1) {
        if (arg0 == 0) {
            ++field3613;
            super.field4873[super.field4879] = 21;
            super.field4874[super.field4879] = arg1;
            ++super.field4879;
            if (~super.field4879 <= -5001) {
                super.field4879 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 23)
    public final void method1044(int arg0) {
        if (arg0 == 0) {
            ++field3618;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILht;)V", line = 37)
    public final void method1046(int arg0, class409 arg1) {
        super.field4873[super.field4879] = 20;
        ++field3617;
        super.field4874[super.field4879] = arg1;
        ++super.field4879;
        if (arg0 != 29736) {
            method1645((byte) -115, -1, (int[]) null, 76, -58, 64, 15, -88);
        }
        if (super.field4879 >= 5000) {
            super.field4879 = 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IFZLna;I)V", line = 54)
    public final void method1047(int arg0, float arg1, boolean arg2, class35 arg3, int arg4) {
        super.field4873[super.field4879] = (byte) (!arg2 ? arg0 + 30 : arg0 + 40);
        ++field3620;
        super.field4874[super.field4879] = arg3;
        if (arg4 != 0) {
            this.field3624 = null;
        }
        super.field4872[super.field4879] = arg1;
        ++super.field4879;
        if (~super.field4879 <= -5001) {
            super.field4879 = 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V", line = 72)
    public static final void method1644(byte arg0) {
        class306.field4038.method176(-1);
        ++field3619;
        if (arg0 != 42) {
            method1645((byte) -82, -38, (int[]) null, 110, 39, -81, -117, -81);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)V", line = 85)
    public final void method1038(int arg0, byte arg1) {
        super.field4873[super.field4879] = (byte) arg0;
        ++field3614;
        ++super.field4879;
        if (super.field4879 >= 5000) {
            super.field4879 = 0;
        }
        if (arg1 != -110) {
            this.field3611 = -125;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 105)
    public final void method1039(byte arg0) {
        while (super.field4879 != super.field4875) {
            this.method1647(-12531);
        }
        ++field3623;
        if (arg0 <= 68) {
            method1645((byte) -7, -16, (int[]) null, -96, 113, -43, -126, 81);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI[IIIIII)V", line = 118)
    public static final void method1645(byte arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3616;
        if (arg1 > 0 && !class227.method1418((byte) 114, arg1)) {
            throw new IllegalArgumentException("");
        } else if (~arg7 < -1 && !class227.method1418((byte) 69, arg7)) {
            throw new IllegalArgumentException("");
        } else if (arg6 != 32993) {
            throw new IllegalArgumentException("");
        } else {
            int var8 = 0;
            int var9 = ~arg1 <= ~arg7 ? arg7 : arg1;
            int var10 = arg1 >> 1;
            int var11 = 96 % ((-31 - arg0) / 35);
            int var12 = arg7 >> 1;
            int[] var13 = arg2;
            int[] var14 = new int[var10 * var12];
            while (true) {
                OpenGL.glTexImage2Di(arg5, var8, arg3, arg1, arg7, 0, arg6, arg4, var13, 0);
                if (~var9 >= -2) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = arg1 + var16;
                for (int var18 = 0; var18 < var12; ++var18) {
                    for (int var20 = 0; ~var20 > ~var10; ++var20) {
                        int var21 = var13[var16++];
                        int var22 = var13[var17++];
                        int var23 = var13[var16++];
                        int var24 = 255 & var21 >> 16;
                        int var25 = var13[var17++];
                        int var26 = var21 >> 24 & 255;
                        int var27 = var21 & 255;
                        int var28 = (65324 & var21) >> 8;
                        int var29 = (255 & var23 >> 16) + var24;
                        int var30 = (255 & var23 >> 8) + var28;
                        int var31 = (var23 >> 24 & 255) + var26;
                        int var32 = (var23 & 255) + var27;
                        int var33 = (var22 & 255) + var32;
                        int var34 = (255 & var22 >> 24) + var31;
                        int var35 = ((var22 & 16715260) >> 16) + var29;
                        int var36 = ((65341 & var22) >> 8) + var30;
                        int var37 = (255 & var25 >> 24) + var34;
                        int var38 = (255 & var25) + var33;
                        int var39 = (var25 >> 8 & 255) + var36;
                        int var40 = ((var25 & 16720208) >> 16) + var35;
                        var14[var15++] = class191.method1230(class191.method1230(class494.method2839(var39, 1020) << 6, class191.method1230(class494.method2839(1020, var37) << 22, class494.method2839(var40 << 14, 16711680))), class494.method2839(255, var38 >> 2));
                    }
                    var16 += arg1;
                    var17 += arg1;
                }
                int[] var19 = var14;
                var14 = var13;
                arg7 = var12;
                arg1 = var10;
                var13 = var19;
                ++var8;
                var12 >>= 1;
                var9 >>= 1;
                var10 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lht;I)V", line = 226)
    public final void method1041(class409 arg0, int arg1) {
        --super.field4875;
        ++field3612;
        if (arg1 > super.field4875) {
            super.field4875 = 4999;
        }
        super.field4873[super.field4875] = 21;
        super.field4874[super.field4875] = arg0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lcr;I)V", line = 241)
    public static final void method1646(class403 arg0, int arg1) {
        ++field3615;
        class403 var2 = class298.method1744((byte) -111, arg0);
        int var3;
        int var4;
        if (var2 != null) {
            var3 = var2.field5450;
            var4 = var2.field5404;
        } else {
            var3 = class149.field2132;
            var4 = class175.field2555;
        }
        class203.method1304(false, var4, arg0, var3, (byte) 111);
        class74.method479(arg0, var4, -1, var3);
        if (arg1 != 29958) {
            method1644((byte) 87);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V", line = 270)
    public final void method1048(int arg0, int arg1) {
        if (arg1 < -57) {
            ++field3621;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 286)
    private final void method1647(int arg0) {
        ++field3622;
        int var2 = super.field4875++;
        if (super.field4875 >= 5000) {
            super.field4875 = 0;
        }
        this.field3611 = super.field4873[var2];
        if (arg0 == -12531) {
            Object var3 = super.field4874[var2];
            super.field4874[var2] = null;
            if (this.field3611 == 21) {
                class96.method689(this.field3624, (class409) var3);
            } else if (this.field3611 != 20) {
                if (~this.field3611 <= -31 && this.field3611 <= 33) {
                    class280.field3693.method568(3000.0F, super.field4872[var2] * 1.5F);
                    ((class35) var3).method270(class95.field1428, class259.field3429, class22.field388, class461.field6365, ~(this.field3611 + -30) == -1);
                } else if (~this.field3611 <= -41 && ~this.field3611 >= -44) {
                    class280.field3693.method568(3000.0F, super.field4872[var2] * 1.5F);
                    ((class35) var3).method270(class95.field1428, class259.field3429, class22.field388, class245.field3273, this.field3611 + -40 == 0);
                } else {
                    if (this.field3611 != 22) {
                        if (this.field3611 == 23) {
                            class280.field3693.method536();
                            return;
                        }
                        if (~this.field3611 == -25) {
                            class280.field3693.method609(0, (class451[]) null);
                            return;
                        }
                    } else {
                        class280.field3693.method521(-1, 1583160, 40, 127);
                    }
                }
            } else {
                class409 var4 = (class409) var3;
                if (var4.field5627 != null) {
                    var4.field5627.method334(class280.field3693, true);
                }
                if (var4.field5607 != null) {
                    var4.field5607.method334(class280.field3693, true);
                }
                if (var4.field5625 != null) {
                    var4.field5625.method334(class280.field3693, true);
                }
                if (var4.field5628 != null) {
                    var4.field5628.method334(class280.field3693, true);
                }
                if (var4.field5618 != null) {
                    var4.field5618.method334(class280.field3693, true);
                }
                for (class165 var5 = var4.field5630; var5 != null; var5 = var5.field2400) {
                    var5.field2402.method334(class280.field3693, true);
                }
            }
        }
    }
}
