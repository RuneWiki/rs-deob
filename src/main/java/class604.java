import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class604 extends class384 {

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "Z")
    private boolean field8602 = false;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)V")
    public final void method24(boolean arg0, int arg1) {
        ++field8603;
        if (arg1 != -1) {
            method3434(-58, 97, 15, 77, -100, -48);
        }
        class460 var3 = super.field5349.method2238(1);
        if (var3 != null && arg0) {
            super.field5349.method2217(1, 91);
            super.field5349.method2207((byte) -61, var3);
            super.field5349.method2211(-13095, class389.field5381);
            super.field5349.method2217(1, 118);
            super.field5349.method2242(-106, class94.field989, class1.field4);
            super.field5349.method2318((byte) 100, false, true, 2, class324.field4136);
            super.field5349.method2268(0, 67, class169.field1881);
            class427 var4 = super.field5349.method2224((byte) 23);
            var4.method2655((byte) -76, super.field5349.method2236((byte) 124));
            super.field5349.method2226(class235.field2799, -101);
            super.field5349.method2217(0, arg1 + 6);
            this.field8602 = true;
        } else {
            super.field5349.method2268(0, 91, class169.field1881);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8599;
        int var7 = arg4 + arg6;
        int var8 = -arg6 + arg1;
        for (int var9 = arg4; var9 < var7; ++var9) {
            class223.method1297(class408.field5585[var9], -7, arg3, arg5, arg2);
        }
        int var10 = -arg6 + arg2;
        int var11 = arg3 - -arg6;
        int var12 = 97 / ((8 - arg0) / 55);
        for (int var13 = arg1; var13 > var8; --var13) {
            class223.method1297(class408.field5585[var13], -7, arg3, arg5, arg2);
        }
        for (int var14 = var7; var14 <= var8; ++var14) {
            int[] var15 = class408.field5585[var14];
            class223.method1297(var15, -7, arg3, arg5, var11);
            class223.method1297(var15, -7, var10, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method3430(int arg0, int arg1) {
        ++field8596;
        if (arg0 != -22671) {
            method3433(false);
        }
        return (arg1 >> 24 & 255) + "." + (255 & arg1 >> 16) + "." + (arg1 >> 8 & 255) + "." + (255 & arg1);
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lln;)V")
    public class604(class377 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)I")
    public static final int method3431(int arg0, int arg1) {
        ++field8600;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 + arg1;
        int var4 = 40960 - -(arg0 * var3 >> 12);
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IFFBFFFF)F")
    public static final float method3432(int arg0, float arg1, float arg2, byte arg3, float arg4, float arg5, float arg6, float arg7) {
        ++field8598;
        float var8 = 0.0F;
        float var9 = arg6 - arg7;
        float var10 = -arg5 + arg1;
        float var11 = arg2 - arg4;
        float var12 = 0.0F;
        float var13 = 0.0F;
        if (arg3 < 17) {
            method3431(89, 60);
        }
        float var14 = 0.0F;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg7;
            float var16 = var8 * var10 + arg5;
            float var17 = var8 * var11 + arg4;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (~var18 < -1 && ~var19 < -1 && ~var18 > ~class489.field6976 && ~class153.field1677 < ~var19) {
                int var20 = class90.field937.field4628;
                if (var20 < 3 && ~(class100.field1043[1][var18][var19] & 2) != -1) {
                    ++var20;
                }
                int var21 = class11.field88[var20].method1675((int) var17, (int) var15, 65286);
                if (var16 > (float) var21) {
                    if (arg0 >= 2) {
                        return 0.1F * method3432(arg0 + -1, var16, var17, (byte) 40, var14, var13, var15, var12) + var8 + -0.1F;
                    }
                    return var8;
                }
            }
            var14 = var17;
            var13 = var16;
            var12 = var15;
            var8 += 0.1F;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)V")
    public final void method30(boolean arg0, byte arg1) {
        if (arg1 >= 78) {
            ++field8594;
            super.field5349.method2242(-118, class94.field989, class372.field4752);
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z")
    public final boolean method26(int arg0) {
        if (arg0 != 13326) {
            return false;
        } else {
            ++field8604;
            return true;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
    public final void method31(byte arg0) {
        if (this.field8602) {
            super.field5349.method2217(1, 93);
            super.field5349.method2211(-13095, class451.field6502);
            super.field5349.method2242(-123, class372.field4752, class372.field4752);
            super.field5349.method2264(2, class58.field582, (byte) 60);
            super.field5349.method2268(0, 95, class424.field6157);
            super.field5349.method2248((byte) 119);
            super.field5349.method2207((byte) -61, (class596) null);
            super.field5349.method2217(0, 43);
            this.field8602 = false;
        } else {
            super.field5349.method2268(0, 92, class424.field6157);
        }
        ++field8606;
        super.field5349.method2242(-99, class372.field4752, class372.field4752);
        if (arg0 > -18) {
            this.field8602 = false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lke;BI)V")
    public final void method27(class596 arg0, byte arg1, int arg2) {
        ++field8595;
        super.field5349.method2207((byte) -61, arg0);
        if (arg1 == 123) {
            super.field5349.method2255(arg2, 15818);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
    public static final void method3433(boolean arg0) {
        ++field8605;
        if (!class498.field7026) {
            class319.field4068 += (-class319.field4068 + 12.0F) / 2.0F;
            if (arg0) {
                method3430(69, 22);
            }
            class217.field2521 = true;
            class498.field7026 = true;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIII)V")
    public static final void method3434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8601;
        int var6 = arg3 - arg4;
        int var7 = arg0 - arg5;
        if (var6 != 0) {
            if (var7 == 0) {
                class192.method1165(arg5, arg3, arg1, arg4, (byte) -105);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg4 * var8 >> 12) + arg5;
                int var10;
                int var11;
                if (~arg4 > ~class338.field4355) {
                    var10 = class338.field4355;
                    var11 = (class338.field4355 * var8 >> 12) + var9;
                } else if (arg4 <= class744.field10385) {
                    var11 = arg5;
                    var10 = arg4;
                } else {
                    var11 = (class744.field10385 * var8 >> 12) + var9;
                    var10 = class744.field10385;
                }
                int var12;
                int var13;
                if (~class338.field4355 >= ~arg3) {
                    if (arg3 <= class744.field10385) {
                        var12 = arg0;
                        var13 = arg3;
                    } else {
                        var13 = class744.field10385;
                        var12 = (class744.field10385 * var8 >> 12) + var9;
                    }
                } else {
                    var13 = class338.field4355;
                    var12 = (class338.field4355 * var8 >> 12) + var9;
                }
                if (class224.field2571 > var11) {
                    var11 = class224.field2571;
                    var10 = (-var9 + class224.field2571 << 12) / var8;
                } else if (~class578.field8182 > ~var11) {
                    var11 = class578.field8182;
                    var10 = (-var9 + class578.field8182 << 12) / var8;
                }
                int var14 = 6 % ((arg2 - -52) / 47);
                if (~class224.field2571 >= ~var12) {
                    if (class578.field8182 < var12) {
                        var13 = (-var9 + class578.field8182 << 12) / var8;
                        var12 = class578.field8182;
                    }
                } else {
                    var13 = (class224.field2571 - var9 << 12) / var8;
                    var12 = class224.field2571;
                }
                class619.method3533((byte) 75, var10, arg1, var12, var13, var11);
            }
        } else {
            if (var7 != 0) {
                class660.method3758(arg5, arg0, arg1, arg4, true);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIZ)V")
    public final void method32(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method27((class596) null, (byte) -45, -110);
        }
        ++field8597;
    }
}
