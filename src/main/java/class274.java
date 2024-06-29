import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class274 extends class334 {

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "Lhi;")
    public static class465 field3846;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V", line = 3)
    public static void method1741(byte arg0) {
        field3846 = null;
        if (arg0 != 94) {
            method1742(68, 41, 69, -24, -126, -27, 96, false, -85, -97);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[I", line = 13)
    public final int[] method28(int arg0, int arg1) {
        ++field3844;
        if (arg1 != -22563988) {
            method1741((byte) 43);
        }
        int[] var3 = super.field4743.method1027((byte) -106, arg0);
        if (super.field4743.field1993) {
            int[] var4 = this.method2052(0, 0, arg0);
            for (int var5 = 0; ~class439.field6099 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIZII)V", line = 46)
    public static final void method1742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (!arg7) {
            field3843 = 71;
        }
        ++field3840;
        if (~arg3 == ~arg5 && arg1 == arg2 && ~arg6 == ~arg8 && ~arg0 == ~arg9) {
            class695.method3905(arg8, arg9, arg4, arg3, false, arg1);
        } else {
            int var10 = arg3;
            int var11 = arg1;
            int var12 = arg3 * 3;
            int var13 = arg1 * 3;
            int var14 = arg5 * 3;
            int var15 = arg2 * 3;
            int var16 = arg6 * 3;
            int var17 = arg0 * 3;
            int var18 = -var16 + var14 + -arg3 + arg8;
            int var19 = arg9 + var15 + -arg1 + -var17;
            int var20 = -var14 + var16 - var14 - -var12;
            int var21 = -var15 + var17 - (var15 - var13);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg3;
                int var34 = (var28 + var30 + var32 >> 12) + arg1;
                class695.method3905(var33, var34, arg4, var10, false, var11);
                var10 = var33;
                var11 = var34;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([Luf;II)V", line = 121)
    public static final void method1743(class519[] arg0, int arg1, int arg2) {
        if (arg1 != 6680) {
            method1743((class519[]) null, 9, 91);
        }
        for (int var3 = 0; ~var3 > ~arg0.length; ++var3) {
            class519 var4 = arg0[var3];
            if (var4 != null) {
                if (~var4.field7190 == -1) {
                    if (var4.field7170 != null) {
                        method1743(var4.field7170, 6680, arg2);
                    }
                    class27 var5 = (class27) class37.field437.method4253((long) var4.field7247, -1);
                    if (var5 != null) {
                        class411.method2416(var5.field284, arg2, (byte) -49);
                    }
                }
                if (~arg2 == -1 && var4.field7245 != null) {
                    class511 var6 = new class511();
                    var6.field7023 = var4;
                    var6.field7021 = var4.field7245;
                    class46.method357(var6);
                }
                if (arg2 == 1 && var4.field7281 != null) {
                    if (~var4.field7193 <= -1) {
                        class519 var7 = class604.method3506(var4.field7247, 255);
                        if (var7 == null || var7.field7170 == null || ~var4.field7193 <= ~var7.field7170.length || var7.field7170[var4.field7193] != var4) {
                            continue;
                        }
                    }
                    class511 var8 = new class511();
                    var8.field7021 = var4.field7281;
                    var8.field7023 = var4;
                    class46.method357(var8);
                }
            }
        }
        ++field3842;
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V", line = 192)
    public static final void method1744(int arg0) {
        if (~class761.field10553 > -1) {
            class761.field10553 = 0;
            class414.field5684 = -1;
            class630.field8932 = -1;
        }
        ++field3847;
        if (~class751.field10441 > ~class761.field10553) {
            class630.field8932 = -1;
            class761.field10553 = class751.field10441;
            class414.field5684 = -1;
        }
        if (~class488.field6705 > -1) {
            class488.field6705 = 0;
            class630.field8932 = -1;
            class414.field5684 = -1;
        }
        if (class488.field6705 > class751.field10452) {
            class488.field6705 = class751.field10452;
            class630.field8932 = -1;
            class414.field5684 = -1;
        }
        if (arg0 != 1) {
            field3843 = -107;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 234)
    public class274() {
        super(1, false);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)[[I", line = 241)
    public final int[][] method283(boolean arg0, int arg1) {
        ++field3841;
        if (!arg0) {
            field3846 = null;
        }
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (super.field4734.field425) {
            int[][] var4 = this.method2053(1, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class439.field6099 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZLol;)V", line = 288)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (!arg1) {
            ++field3845;
            if (~arg0 == -1) {
                super.field4747 = arg2.method2557(14929) == 1;
            }
        }
    }
}
