import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class209 extends class392 {

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2788 = null;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "Lbda;")
    public static class437 field2790;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "Lfa;")
    public static class522 field2794;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIB)V")
    public final void method211(int arg0, int arg1, int arg2, byte arg3) {
        super.field5246 = arg0;
        super.field5244 = arg1;
        if (arg3 != 79) {
            method1330(-52, 27, -59, 29, (class566) null, -70, -99, -75, 72, 1, 82, (class286) null);
        }
        ++field2793;
        super.field5237 = arg2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1326(int arg0, byte[] arg1) {
        ++field2797;
        class157 var2 = new class157(arg1);
        int var3 = var2.method930(arg0 ^ 255);
        int var4 = var2.method908(false);
        if (~var4 > -1 || class573.field7803 != 0 && ~var4 < ~class573.field7803) {
            throw new RuntimeException();
        } else if (arg0 == var3) {
            byte[] var8 = new byte[var4];
            var2.method962(var8, 92, var4, 0);
            return var8;
        } else {
            int var5 = var2.method908(false);
            if (var5 >= 0 && (class573.field7803 == 0 || class573.field7803 >= var5)) {
                byte[] var6 = new byte[var5];
                if (var3 != 1) {
                    class615 var7 = class108.field1274;
                    synchronized (class108.field1274) {
                        class108.field1274.method3402(var2, var6, (byte) 122);
                    }
                } else {
                    class331.method1930(var6, var5, arg1, var4, 9);
                }
                return var6;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILev;BIIII[IIIZII[I)I")
    public static final int method1327(int arg0, int arg1, class593 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, boolean arg11, int arg12, int arg13, int[] arg14) {
        for (int var15 = 0; var15 < 128; ++var15) {
            for (int var35 = 0; var35 < 128; ++var35) {
                class77.field913[var15][var35] = 0;
                class595.field8210[var15][var35] = 99999999;
            }
        }
        ++field2796;
        boolean var16;
        if (arg13 != 1) {
            if (arg13 == 2) {
                var16 = class5.method31(arg9, arg2, arg5, arg6, arg10, (byte) 7, arg12, arg7, arg1, arg4, arg0);
            } else {
                var16 = class54.method316(arg7, arg0, 5522, arg4, arg9, arg6, arg5, arg1, arg10, arg2, arg12, arg13);
            }
        } else {
            var16 = class12.method75(arg12, arg1, arg7, arg2, arg9, arg4, arg6, (byte) 75, arg0, arg10, arg5);
        }
        int var17 = arg0 - 64;
        int var18 = arg9 - 64;
        int var19 = class436.field5814;
        int var20 = class6.field61;
        if (arg3 < 119) {
            field2791 = 100;
        }
        if (!var16) {
            if (!arg11) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg5 - var23; var24 <= arg5 + var23; ++var24) {
                for (int var25 = -var23 + arg10; arg10 + var23 >= var25; ++var25) {
                    int var26 = -var17 + var24;
                    int var27 = -var18 + var25;
                    if (~var26 <= -1 && ~var27 <= -1 && var26 < 128 && var27 < 128 && ~class595.field8210[var26][var27] > -101) {
                        int var28 = 0;
                        if (~arg5 < ~var24) {
                            var28 = arg5 - var24;
                        } else if (var24 > arg6 + -1 + arg5) {
                            var28 = -arg5 + -arg6 + var24 + 1;
                        }
                        int var29 = 0;
                        if (var25 >= arg10) {
                            if (arg10 - 1 + arg4 < var25) {
                                var29 = -arg4 + -arg10 + var25 + 1;
                            }
                        } else {
                            var29 = arg10 - var25;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (~var30 > ~var21 || ~var21 == ~var30 && ~var22 < ~class595.field8210[var26][var27]) {
                            var20 = var25;
                            var21 = var30;
                            var19 = var24;
                            var22 = class595.field8210[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (~arg0 == ~var19 && ~arg9 == ~var20) {
            return 0;
        } else {
            byte var31 = 0;
            class310.field4191[var31] = var19;
            int var37 = var31 + 1;
            class585.field8082[var31] = var20;
            int var32;
            int var33 = var32 = class77.field913[-var17 + var19][var20 - var18];
            while (~arg0 != ~var19 || arg9 != var20) {
                if (~var32 != ~var33) {
                    class310.field4191[var37] = var19;
                    var32 = var33;
                    class585.field8082[var37++] = var20;
                }
                if ((1 & var33) != 0) {
                    ++var20;
                } else if ((var33 & 4) != 0) {
                    --var20;
                }
                if ((2 & var33) == 0) {
                    if ((8 & var33) != 0) {
                        --var19;
                    }
                } else {
                    ++var19;
                }
                var33 = class77.field913[-var17 + var19][-var18 + var20];
            }
            int var34 = 0;
            while (var37-- > 0) {
                arg14[var34] = class310.field4191[var37];
                arg8[var34++] = class585.field8082[var37];
                if (var34 >= arg14.length) {
                    break;
                }
            }
            return var34;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIIF)V")
    public class209(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public static void method1328(int arg0) {
        field2788 = null;
        field2794 = null;
        if (arg0 < -16) {
            field2790 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1329(int arg0, byte arg1, int arg2) {
        if (arg1 <= 54) {
            field2791 = -9;
        }
        ++field2795;
        return (arg2 & 65536) != 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(FI)V")
    public final void method212(float arg0, int arg1) {
        super.field5249 = arg0;
        ++field2789;
        if (arg1 != -25467) {
            field2790 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIILtl;IIIIIILfn;)V")
    public static final void method1330(int arg0, int arg1, int arg2, int arg3, class566 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class286 arg11) {
        class314.field4209 = arg0;
        class595.field8209 = arg7;
        class537.field7364 = arg8;
        class641.field8843 = arg3;
        class118.field1509 = arg9;
        class670.field9525 = arg1;
        class314.field4211 = arg5;
        class274.field3647 = arg6;
        class512.field7138 = arg11;
        class609.field8463 = arg10;
        if (arg2 != 6284) {
            method1327(71, 124, (class593) null, (byte) -90, 17, -49, -15, -16, (int[]) null, -21, 70, true, 62, 54, (int[]) null);
        }
        class592.field8154 = arg4;
        class404.field5344 = null;
        ++field2792;
        class559.field7626 = null;
        class441.field5859 = null;
        class255.method1541(false);
        class366.field4827 = true;
    }
}
