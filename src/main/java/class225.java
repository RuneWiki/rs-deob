import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class225 {

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Llc;")
    public static class160 field3751 = new class160();

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Lok;")
    private static class146 field3753 = class235.method1724(-12908, "");

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lok;")
    public static class146 field3754 = field3753;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "Lok;")
    public static class146 field3757 = class235.method1724(-12908, "(U2");

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field3756 = -1;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field3758 = 0;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([[FLs;III[[I[[FI[ILhl;[[F)V", line = 8)
    public static final void method1660(float[][] arg0, class266 arg1, int arg2, int arg3, int arg4, int[][] arg5, float[][] arg6, int arg7, int[] arg8, class61 arg9, float[][] arg10) {
        int[] var11 = new int[arg8.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg8[var12 + var12];
            int var14 = arg8[var12 + var12 + 1];
            if (arg3 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg3 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg3 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg10[arg4][arg2];
                var18 = arg6[arg4][arg2];
                var19 = arg0[arg4][arg2];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg0[arg4 + 1][arg2];
                var17 = arg10[arg4 + 1][arg2];
                var18 = arg6[arg4 + 1][arg2];
            } else if (var13 == 128 && var14 == 128) {
                var19 = arg0[arg4 + 1][arg2 + 1];
                var18 = arg6[arg4 + 1][arg2 + 1];
                var17 = arg10[arg4 + 1][arg2 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg0[arg4][arg2 + 1];
                var18 = arg6[arg4][arg2 + 1];
                var17 = arg10[arg4][arg2 + 1];
            } else {
                float var20 = arg0[arg4][arg2];
                float var21 = arg6[arg4][arg2];
                float var22 = (float) var13 / 128.0F;
                float var23 = arg10[arg4][arg2];
                float var24 = (arg6[arg4 + 1][arg2] - var21) * var22 + var21;
                float var25 = (float) var14 / 128.0F;
                float var26 = arg10[arg4][arg2 + 1];
                float var27 = arg6[arg4][arg2 + 1];
                float var28 = (arg10[arg4 + 1][arg2 + 1] - var26) * var22 + var26;
                float var29 = (arg10[arg4 + 1][arg2] - var23) * var22 + var23;
                float var30 = (arg0[arg4 + 1][arg2] - var20) * var22 + var20;
                float var31 = arg0[arg4][arg2 + 1];
                float var32 = (arg0[arg4 + 1][arg2 + 1] - var31) * var22 + var31;
                var19 = (var32 - var30) * var25 + var30;
                var17 = (var28 - var29) * var25 + var29;
                float var33 = (arg6[arg4 + 1][arg2 + 1] - var27) * var22 + var27;
                var18 = (var33 - var24) * var25 + var24;
            }
            int var34 = (arg4 << 7) + var13;
            int var35 = class46.method323(arg5, arg4, -34, var13, arg2, var14);
            int var36 = (arg2 << 7) + var14;
            var11[var12] = arg9.method471(arg1, var34, var35, var36, var18, var17, var19);
        }
        if (arg7 != 1) {
            method1662(-89);
        }
        arg9.method468(var11);
        field3750++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 124)
    public static void method1661(int arg0) {
        field3753 = null;
        if (arg0 != 27635) {
            method1660((float[][]) ((float[][]) null), (class266) null, -42, -57, 31, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), -76, (int[]) null, (class61) null, (float[][]) ((float[][]) null));
        }
        field3751 = null;
        field3757 = null;
        field3754 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V", line = 139)
    public static final void method1662(int arg0) {
        if (class129.field2156.toLowerCase().indexOf("microsoft") == -1) {
            if (class129.field2170 == null) {
                class159.field2690[192] = 58;
                class159.field2690[222] = 59;
            } else {
                class159.field2690[192] = 28;
                class159.field2690[222] = 58;
                class159.field2690[520] = 59;
            }
            class159.field2690[91] = 42;
            class159.field2690[59] = 57;
            class159.field2690[46] = 72;
            class159.field2690[47] = 73;
            class159.field2690[44] = 71;
            class159.field2690[61] = 27;
            class159.field2690[93] = 43;
            class159.field2690[45] = 26;
            class159.field2690[92] = 74;
        } else {
            class159.field2690[220] = 74;
            class159.field2690[192] = 58;
            class159.field2690[187] = 27;
            class159.field2690[190] = 72;
            class159.field2690[188] = 71;
            class159.field2690[186] = 57;
            class159.field2690[191] = 73;
            class159.field2690[222] = 59;
            class159.field2690[223] = 28;
            class159.field2690[219] = 42;
            class159.field2690[189] = 26;
            class159.field2690[221] = 43;
        }
        field3749++;
        if (arg0 != 1) {
            field3751 = (class160) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZIILml;II)Ljava/awt/Frame;", line = 192)
    public static final Frame method1663(boolean arg0, int arg1, int arg2, class129 arg3, int arg4, int arg5) {
        if (!arg0) {
            field3751 = (class160) null;
        }
        field3746++;
        if (!arg3.method928(2)) {
            return null;
        }
        if (arg1 == 0) {
            class87[] var6 = class96.method661(arg3, -1);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1377 == arg2 && var6[var8].field1390 == arg5 && (arg4 == 0 || var6[var8].field1379 == arg4) && (!var7 || arg1 < var6[var8].field1393)) {
                    var7 = true;
                    arg1 = var6[var8].field1393;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class256 var9 = arg3.method915(-23272, arg5, arg1, arg2, arg4);
        while (var9.field4265 == 0) {
            class281.method2041((byte) 117, 10L);
        }
        Frame var10 = (Frame) var9.field4269;
        if (var10 == null) {
            return null;
        } else if (var9.field4265 == 2) {
            class71.method527((byte) -12, var10, arg3);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIII)V", line = 276)
    public static final void method1664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class15.method106(-107, arg1);
        int var7 = 0;
        int var8 = arg1;
        int var9 = arg1 - arg4;
        if (arg3 > var9) {
            var9 = 0;
        }
        field3747++;
        int var10 = -arg1;
        int var11 = -1;
        int var12 = var9;
        int[] var13 = class81.field1297[arg0];
        int var14 = -var9;
        int var15 = -1;
        int var16 = arg5 - var9;
        class40.method281(arg6, arg5 - arg1, var13, var16, 7);
        int var17 = arg5 + var9;
        class40.method281(arg2, var16, var13, var17, 7);
        class40.method281(arg6, var17, var13, arg5 + arg1, 7);
        while (var7 < var8) {
            var11 += 2;
            var15 += 2;
            var10 += var11;
            var14 += var15;
            if (var14 >= 0 && var12 >= 1) {
                class87.field1386[var12] = var7;
                var12--;
                var14 -= var12 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                if (var8 < var9) {
                    int var18 = class87.field1386[var8];
                    int[] var19 = class81.field1297[arg0 + var8];
                    int[] var20 = class81.field1297[arg0 - var8];
                    int var21 = arg5 + var7;
                    int var22 = arg5 - var7;
                    int var23 = arg5 + var18;
                    int var24 = arg5 - var18;
                    class40.method281(arg6, var22, var19, var24, 7);
                    class40.method281(arg2, var24, var19, var23, arg3 ^ 0x7);
                    class40.method281(arg6, var23, var19, var21, 7);
                    class40.method281(arg6, var22, var20, var24, 7);
                    class40.method281(arg2, var24, var20, var23, 7);
                    class40.method281(arg6, var23, var20, var21, arg3 + 7);
                } else {
                    int[] var25 = class81.field1297[arg0 - var8];
                    int[] var26 = class81.field1297[arg0 + var8];
                    int var27 = arg5 + var7;
                    int var28 = arg5 - var7;
                    class40.method281(arg6, var28, var26, var27, arg3 + 7);
                    class40.method281(arg6, var28, var25, var27, 7);
                }
                var10 -= var8 << 1;
            }
            int var29 = arg5 + var8;
            int[] var30 = class81.field1297[arg0 + var7];
            int[] var31 = class81.field1297[arg0 - var7];
            int var32 = arg5 - var8;
            if (var7 < var9) {
                int var33 = var12 >= var7 ? var12 : class87.field1386[var7];
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class40.method281(arg6, var32, var30, var35, 7);
                class40.method281(arg2, var35, var30, var34, 7);
                class40.method281(arg6, var34, var30, var29, 7);
                class40.method281(arg6, var32, var31, var35, 7);
                class40.method281(arg2, var35, var31, var34, 7);
                class40.method281(arg6, var34, var31, var29, 7);
            } else {
                class40.method281(arg6, var32, var30, var29, 7);
                class40.method281(arg6, var32, var31, var29, arg3 + 7);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V", line = 417)
    public static final void method1665(int arg0) {
        if (arg0 != -129) {
            field3753 = (class146) null;
        }
        while (client.field4080.method1650(arg0 ^ 0xFFFFFF7B, class46.field781) >= 27) {
            int var1 = client.field4080.method1659(15, false);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class173.field2906[var1] == null) {
                class173.field2906[var1] = new class282();
                var2 = true;
            }
            class282 var3 = class173.field2906[var1];
            class210.field3476[class151.field2574++] = var1;
            var3.field5440 = class203.field3385;
            if (var3.field4838 != null && var3.field4838.method2128(-1)) {
                class207.method1567(56, var3);
            }
            var3.method2044(class218.method1610(client.field4080.method1659(14, false), (byte) -33), (byte) 124);
            int var4 = client.field4080.method1659(1, false);
            int var5 = client.field4080.method1659(5, false);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = client.field4080.method1659(1, false);
            if (var6 == 1) {
                class228.field3809[class182.field3045++] = var1;
            }
            int var7 = class303.field5197[client.field4080.method1659(3, false)];
            if (var2) {
                var3.field5421 = var3.field5406 = var7;
            }
            int var8 = client.field4080.method1659(5, false);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method2216(var3.field4838.field5150, arg0 + 135);
            var3.field5381 = var3.field4838.field5107;
            var3.field5389 = var3.field4838.field5097;
            var3.field5398 = var3.field4838.field5105;
            var3.field5372 = var3.field4838.field5118;
            var3.field5418 = var3.field4838.field5139;
            var3.field5370 = var3.field4838.field5132;
            var3.field5433 = var3.field4838.field5108;
            var3.field5384 = var3.field4838.field5104;
            if (var3.field5418 == 0) {
                var3.field5406 = 0;
            }
            var3.method2215(class102.field1639.field5419[0] + var5, (byte) 70, var3.method1717(0), var4 == 1, class102.field1639.field5432[0] + var8);
            if (var3.field4838.method2128(-1)) {
                class62.method473(var3, class203.field3387, arg0 + 129, var3.field5419[0], 0, var3.field5432[0], (class5) null, (class234) null);
            }
        }
        client.field4080.method1655(false);
        field3748++;
    }
}
