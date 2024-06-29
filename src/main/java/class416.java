import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class416 {

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Lgs;")
    public static class439 field6029 = new class439();

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "Z")
    public static boolean field6037 = false;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "Z")
    public static boolean field6038 = false;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;ILsv;)I", line = 4)
    public static final int method2455(String arg0, int arg1, class319 arg2) {
        field6030++;
        int var3 = arg2.field4360;
        byte[] var4 = class355.method2126((byte) 81, arg0);
        arg2.method1875(false, var4.length);
        arg2.field4360 += class316.field4305.method2870(true, var4.length, var4, arg2.field4336, arg1, arg2.field4360);
        return arg2.field4360 - var3;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 22)
    public static void method2456(int arg0) {
        if (arg0 != 28205) {
            field6038 = false;
        }
        field6029 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Luj;BLuj;)V", line = 33)
    public static final void method2457(class476 arg0, byte arg1, class476 arg2) {
        if (arg0.field6879 != null) {
            arg0.method2791((byte) 112);
        }
        field6036++;
        arg0.field6879 = arg2.field6879;
        if (arg1 < 57) {
            field6037 = true;
        }
        arg0.field6884 = arg2;
        arg0.field6879.field6884 = arg0;
        arg0.field6884.field6879 = arg0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILjava/lang/String;)V", line = 51)
    public static final void method2458(int arg0, String arg1) {
        field6031++;
        if (!class375.field5390) {
            return;
        }
        boolean var2 = false;
        int var3 = -44 / ((50 - arg0) / 50);
        int var4 = class210.field3001;
        int[] var5 = class169.field2570;
        for (int var6 = 0; var6 < var4; var6++) {
            class487 var7 = class45.field642[var5[var6]];
            if (var7 != null && class81.field1158 != var7 && var7.field7036 != null && var7.field7036.equalsIgnoreCase(arg1)) {
                class172.field2599++;
                class274.method1602(14, class375.field5393);
                class17.field275.method1831(55750472, class168.field2567);
                class17.field275.method1872(128, 0);
                class17.field275.method1866(var5[var6], true);
                class17.field275.method1850(class478.field6914, -1822326824);
                class17.field275.method1884(class478.field6916, (byte) -114);
                class398.method2357(0, var7.field257[0], 0, -2, var7.method116(8569), var7.field263[0], 0, var7.method116(8569), true);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class35.method256((byte) 96, class450.field6605.method1126(class486.field6998, (byte) -19) + arg1);
        }
        if (class375.field5390) {
            class319.method1893(124);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V", line = 103)
    public static final void method2459(int arg0, int arg1) {
        field6034++;
        if (!class523.method3109((byte) -65, arg0)) {
            return;
        }
        int var2 = 35 % ((arg1 + 21) / 52);
        class444[] var3 = class505.field7387[arg0];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class444 var5 = var3[var4];
            if (var5 != null) {
                var5.field6479 = 1;
                var5.field6484 = 0;
                var5.field6492 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIBILpf;)V", line = 136)
    public static final void method2460(int arg0, int arg1, byte arg2, int arg3, class487 arg4) {
        int var5 = -77 % ((-arg3 - 42) / 47);
        field6035++;
        int var6 = arg4.field263[0];
        int var7 = arg4.field257[0];
        if (var6 < 0 || var6 >= class9.field111 || var7 < 0 || var7 >= class192.field2809 || arg1 < 0 || arg1 >= class9.field111 || arg0 < 0 || arg0 >= class192.field2809) {
            return;
        }
        int var8 = class295.method1710(var7, arg0, true, var6, class264.field3553[arg4.field6279], 0, class19.field284, 0, arg1, -4, 0, arg4.method116(8569), 0, -98, class104.field1707);
        if (var8 >= 1 && var8 <= 3) {
            for (int var9 = 0; var9 < (var8 - 1); var9++) {
                arg4.method2890(-13098, class104.field1707[var9], arg2, class19.field284[var9]);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILza;[[[BIIIIIIBI)V", line = 172)
    public static final void method2461(int arg0, int arg1, int arg2, class295 arg3, byte[][][] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11, int arg12) {
        field6028++;
        if (arg8 == 0 || arg9 == 0) {
            return;
        }
        if (arg11 != 70) {
            method2459(76, 84);
        }
        if (arg8 == 9) {
            arg8 = 1;
            arg12 = arg12 + 1 & 0x3;
        }
        if (arg8 == 10) {
            arg8 = 1;
            arg12 = arg12 + 3 & 0x3;
        }
        if (arg8 == 11) {
            arg12 = arg12 + 3 & 0x3;
            arg8 = 8;
        }
        arg3.method563(arg1, arg6, arg0, arg7, arg2, arg10, arg4[arg8 - 1][arg12], arg9, arg5);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIB[III)V", line = 209)
    public static final void method2462(int arg0, int arg1, int arg2, int arg3, byte arg4, int[] arg5, int arg6, int arg7) {
        field6033++;
        if (arg1 > 0 && !class113.method855(arg1, (byte) -103)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class113.method855(arg2, (byte) -103)) {
            throw new IllegalArgumentException("");
        } else if (arg6 == 32993) {
            if (arg4 > -31) {
                method2461(-29, 3, 50, null, null, 87, -45, -92, 10, 77, 101, (byte) 14, 47);
            }
            int var8 = 0;
            int var9 = arg1 < arg2 ? arg1 : arg2;
            int var10 = arg1 >> 1;
            int var11 = arg2 >> 1;
            int[] var12 = arg5;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var8, arg0, arg1, arg2, 0, arg6, arg7, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg1 + var15;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var12[var16++];
                        int var24 = var20 >> 16 & 0xFF;
                        int var25 = var20 & 0xFF;
                        int var26 = var20 >> 8 & 0xFF;
                        int var27 = var20 >> 24 & 0xFF;
                        int var28 = (var21 & 0xFF) + var25;
                        int var29 = (var21 >> 24 & 0xFF) + var27;
                        int var30 = (var21 >> 8 & 0xFF) + var26;
                        int var31 = (var21 >> 16 & 0xFF) + var24;
                        int var32 = (var22 & 0xFF) + var28;
                        int var33 = (var22 >> 24 & 0xFF) + var29;
                        int var34 = ((var22 & 0xFF967A) >> 16) + var31;
                        int var35 = ((var22 & 0xFFB2) >> 8) + var30;
                        int var36 = (var23 >> 16 & 0xFF) + var34;
                        int var37 = (var23 & 0xFF) + var32;
                        int var38 = (var23 >> 24 & 0xFF) + var33;
                        int var39 = (var23 >> 8 & 0xFF) + var35;
                        var13[var14++] = class219.method1367(class219.method1367(class375.method2245(var39, 1020) << 6, class219.method1367(class375.method2245(1020, var38) << 22, class375.method2245(var36, 1020) << 14)), class375.method2245(var37, 1020) >> 2);
                    }
                    var15 += arg1;
                    var16 += arg1;
                }
                var13 = var12;
                arg2 = var11;
                arg1 = var10;
                var12 = var17;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIZ[Lat;)V", line = 316)
    public static final void method2463(int arg0, int arg1, int arg2, int arg3, boolean arg4, class444[] arg5) {
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class444 var7 = arg5[var6];
            if (var7 != null && var7.field6515 == arg2) {
                class411.method2418(arg1, arg4, var7, arg0, -126);
                class157.method1124(arg1, var7, arg0, -1);
                if (var7.field6511 - var7.field6470 < var7.field6443) {
                    var7.field6443 = var7.field6511 - var7.field6470;
                }
                if (var7.field6443 < 0) {
                    var7.field6443 = 0;
                }
                if (var7.field6506 - var7.field6453 < var7.field6451) {
                    var7.field6451 = var7.field6506 - var7.field6453;
                }
                if (var7.field6451 < 0) {
                    var7.field6451 = 0;
                }
                if (var7.field6477 == 0) {
                    class345.method2078(arg4, var7, 0);
                }
            }
        }
        if (arg3 != 255) {
            field6029 = null;
        }
        field6032++;
    }
}
