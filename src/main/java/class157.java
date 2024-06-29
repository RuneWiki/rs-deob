import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class157 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Lgp;")
    public static class31 field2232;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lra;")
    public static class57 field2233;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[I")
    public static int[] field2227;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "[I")
    public static int[] field2234;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public static final void method1031(byte arg0) {
        field2225++;
        if (class442.field6457) {
            return;
        }
        class404.field5889 = true;
        class442.field6457 = true;
        int var1 = 36 / ((arg0 + 59) / 60);
        if (class291.field4173) {
            class135.field1886 = (float) ((int) class135.field1886 + 47 & 0xFFFFFFF0);
        } else {
            class102.field1155 += (12.0F - class102.field1155) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static final void method1032(int arg0) {
        field2226++;
        if (class221.field3025 < 0) {
            class221.field3025 = 0;
            class237.field3225 = -1;
            class342.field5027 = -1;
        }
        if (class221.field3025 > class106.field1223) {
            class237.field3225 = -1;
            class342.field5027 = -1;
            class221.field3025 = class106.field1223;
        }
        if (class356.field5214 < 0) {
            class237.field3225 = -1;
            class356.field5214 = 0;
            class342.field5027 = -1;
        }
        if (arg0 != -6600) {
            method1032(4);
        }
        if (class106.field1227 < class356.field5214) {
            class237.field3225 = -1;
            class342.field5027 = -1;
            class356.field5214 = class106.field1227;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILbq;)V")
    public static final void method1033(int arg0, class159 arg1) {
        field2231++;
        if (!class81.field903) {
            arg1.method2290((byte) 98);
            if (arg0 == 0) {
                class433.field6324--;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIILbo;I)V")
    public static final void method1034(int arg0, int arg1, int arg2, class433 arg3, int arg4) {
        field2229++;
        class270 var5 = arg3.method2697((byte) 93);
        int var6 = arg3.field6330 - arg3.field6289.field6517 & 0x3FFF;
        if (arg1 != -14337) {
            field2233 = null;
        }
        if (arg2 == -1) {
            if (var6 != 0 || arg3.field6257 > 25) {
                if (arg0 < 0 && var5.field3821 != -1) {
                    arg3.field6265 = var5.field3821;
                } else if (arg0 <= 0 || var5.field3836 == -1) {
                    arg3.field6265 = var5.field3795;
                } else {
                    arg3.field6265 = var5.field3836;
                }
                arg3.field6335 = false;
            } else if (!arg3.field6335 || !var5.method1718(arg3.field6265, true)) {
                arg3.field6265 = var5.method1713(true);
                arg3.field6335 = arg3.field6265 != -1;
            }
        } else if (arg3.field6334 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class433.field6283[arg4] - arg3.field6289.field6517 & 0x3FFF;
            if (arg2 == 2 && var5.field3798 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3835 != -1) {
                    arg3.field6265 = var5.field3835;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3822 != -1) {
                    arg3.field6265 = var5.field3822;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3815 == -1) {
                    arg3.field6265 = var5.field3798;
                } else {
                    arg3.field6265 = var5.field3815;
                }
            } else if (arg2 == 0 && var5.field3824 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3804 != -1) {
                    arg3.field6265 = var5.field3804;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3800 != -1) {
                    arg3.field6265 = var5.field3800;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3811 == -1) {
                    arg3.field6265 = var5.field3824;
                } else {
                    arg3.field6265 = var5.field3811;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field3797 != -1) {
                arg3.field6265 = var5.field3797;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field3810 != -1) {
                arg3.field6265 = var5.field3810;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field3805 == -1) {
                arg3.field6265 = var5.field3795;
            } else {
                arg3.field6265 = var5.field3805;
            }
            arg3.field6335 = false;
        } else if (var6 == 0 && arg3.field6257 <= 25) {
            if (arg2 == 2 && var5.field3798 != -1) {
                arg3.field6265 = var5.field3798;
            } else if (arg2 == 0 && var5.field3824 != -1) {
                arg3.field6265 = var5.field3824;
            } else {
                arg3.field6265 = var5.field3795;
            }
            arg3.field6335 = false;
        } else {
            if (arg2 == 2 && var5.field3798 != -1) {
                if (arg0 < 0 && var5.field3812 != -1) {
                    arg3.field6265 = var5.field3812;
                } else if (arg0 <= 0 || var5.field3806 == -1) {
                    arg3.field6265 = var5.field3798;
                } else {
                    arg3.field6265 = var5.field3806;
                }
            } else if (arg2 == 0 && var5.field3824 != -1) {
                if (arg0 < 0 && var5.field3818 != -1) {
                    arg3.field6265 = var5.field3818;
                } else if (arg0 <= 0 || var5.field3827 == -1) {
                    arg3.field6265 = var5.field3824;
                } else {
                    arg3.field6265 = var5.field3827;
                }
            } else if (arg0 < 0 && var5.field3793 != -1) {
                arg3.field6265 = var5.field3793;
            } else if (arg0 <= 0 || var5.field3802 == -1) {
                arg3.field6265 = var5.field3795;
            } else {
                arg3.field6265 = var5.field3802;
            }
            arg3.field6335 = false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
    public static void method1035(boolean arg0) {
        field2232 = null;
        field2234 = null;
        if (arg0) {
            method1035(false);
        }
        field2227 = null;
        field2233 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lnl;")
    public static final class327 method1036(int arg0, int arg1) {
        field2228++;
        class331 var2 = class139.field1976;
        class327 var3;
        synchronized (class139.field1976) {
            var3 = (class327) class139.field1976.method2049(-87, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class262.field3628.method361(class443.method2741(arg1, false), 123, class435.method2705((byte) 96, arg1));
        class327 var5 = new class327();
        var5.field4592 = arg1;
        if (var4 != null) {
            var5.method2026(new class211(var4), 0);
        }
        var5.method2024((byte) -58);
        if (var5.field4605) {
            var5.field4597 = false;
            var5.field4617 = 0;
        }
        if (!class281.field3962 && var5.field4664) {
            var5.field4650 = null;
            var5.field4671 = null;
        }
        class331 var6 = class139.field1976;
        synchronized (class139.field1976) {
            class139.field1976.method2046((long) arg1, arg0, var5);
            return var5;
        }
    }
}
