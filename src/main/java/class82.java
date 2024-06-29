import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class82 extends class303 {

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1232 = null;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "[Lnl;")
    public static class30[] field1228 = new class30[2048];

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "[I")
    public static int[] field1231 = new int[128];

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "Lik;")
    public static class259 field1225 = new class259(32);

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lj;")
    public static class285 field1234 = new class285(64);

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1224++;
        if (arg2 != 4) {
            method590(-8, -104, -98, -11, -36, 108);
        }
        if (arg4 >= class319.field4965 && class116.field1888 >= arg5 && arg0 >= class188.field2995 && arg3 <= class195.field3108) {
            class226.method1632(arg3, arg0, arg1, arg5, arg4, arg2 - 5);
        } else {
            class280.method1997(arg0, arg5, arg1, arg3, arg4, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)I", line = 25)
    public static final int method591(int arg0, int arg1) {
        field1230++;
        if (arg1 != -3480) {
            field1225 = (class259) null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIIBII)V", line = 37)
    public static final void method592(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 73) {
            return;
        }
        field1226++;
        class160.field2521++;
        class203.method1467(-12436);
        if (arg0) {
            class104.method802((byte) -99, false, 0, false);
        } else {
            class189.method1408(0, 6);
            class104.method802((byte) -99, true, 0, false);
            if (class282.field4359 == 0) {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class104.method802((byte) -99, false, var6, false);
                    class104.method802((byte) -99, false, var6, true);
                    class189.method1408(var6, 6);
                }
            } else {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class189.method1408(var7, 6);
                    class104.method802((byte) -99, false, var7, false);
                    class104.method802((byte) -99, false, var7, true);
                }
            }
        }
        if (!arg0) {
            class220.method1593(arg3 + 11883);
        }
        class200.method1457(0);
        if (class265.field4126) {
            class170.method1239(arg3 ^ 0xFFFF8909, true, arg1, arg2, arg4, arg5);
            arg4 = class181.field2892;
            arg5 = class294.field4625;
            arg1 = class147.field2376;
            arg2 = class278.field4302;
        }
        if (class62.field960 == 1) {
            int var8 = class143.field2254;
            int var9 = class248.field3833 + class75.field1151 & 0x7FF;
            if ((class301.field4747 / 256) > var8) {
                var8 = class301.field4747 / 256;
            }
            if (class211.field3373[4] && var8 < class67.field1082[4] + 128) {
                var8 = class67.field1082[4] + 128;
            }
            class219.method1576(class48.method374(class19.field356.field1369, class19.field356.field1442, 105, class41.field734) - 50, class86.field1294, arg1, var8, class316.field4927, var9, var8 * 3 + 600, 38);
        }
        int var10 = class140.field2223;
        int var11 = class48.field801;
        int var12 = class312.field4904;
        int var13 = class181.field2891;
        int var14 = class103.field1746;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class211.field3373[var15]) {
                int var16 = (int) ((double) (-class162.field2546[var15]) + (double) (class162.field2546[var15] * 2 + 1) * Math.random() + Math.sin((double) class12.field236[var15] / 100.0D * (double) class261.field4047[var15]) * (double) class67.field1082[var15]);
                if (var15 == 2) {
                    class312.field4904 += var16;
                }
                if (var15 == 4) {
                    class181.field2891 += var16;
                    if (class181.field2891 < 128) {
                        class181.field2891 = 128;
                    }
                    if (class181.field2891 > 383) {
                        class181.field2891 = 383;
                    }
                }
                if (var15 == 3) {
                    class103.field1746 = class103.field1746 + var16 & 0x7FF;
                }
                if (var15 == 0) {
                    class140.field2223 += var16;
                }
                if (var15 == 1) {
                    class48.field801 += var16;
                }
            }
        }
        class92.method660(arg3 ^ 0x10049);
        if (class265.field4126) {
            class262.method1865(arg2, arg5, arg2 + arg4, arg1 + arg5);
            float var17 = (float) class181.field2891 * 0.17578125F;
            float var18 = (float) class103.field1746 * 0.17578125F;
            if (class62.field960 == 3) {
                var17 = class85.field1267 * 360.0F / 6.2831855F;
                var18 = class318.field4948 * 360.0F / 6.2831855F;
            }
            class265.method1895(arg2, arg5, arg4, arg1, arg4 / 2 + arg2, arg1 / 2 + arg5, var17, var18, class43.field757, class43.field757);
        } else {
            class182.method1358(arg2, arg5, arg2 + arg4, arg5 - -arg1);
            class174.method1292();
        }
        if (class243.field3754 || arg2 > class275.field4270 || (arg2 + arg4) <= class275.field4270 || arg5 > class138.field2198 || class138.field2198 >= (arg1 + arg5)) {
            class56.field903 = false;
            class55.field876 = 0;
        } else {
            class55.field876 = 0;
            int var19 = class328.field5079;
            int var20 = class190.field3029;
            int var21 = class96.field1577;
            class195.field3106 = (class275.field4270 - arg2) * (var20 - var19) / arg4 + var19;
            class56.field903 = true;
            int var22 = class116.field1891;
            class281.field4339 = (var22 - var21) * (class138.field2198 - arg5) / arg1 + var21;
        }
        class84.method605((byte) 52);
        byte var23 = class195.method1427(127) == 2 ? (byte) class160.field2521 : 1;
        if (class265.field4126) {
            class265.method1893();
            class265.method1905(true);
            class265.method1904(true);
            boolean var24 = false;
            int var25;
            if (class22.field394 == 10) {
                var25 = class147.method1141(class122.field1952, class329.field5093, class140.field2223 >> 10, 2, class312.field4904 >> 10);
            } else {
                var25 = class147.method1141(class122.field1952, class329.field5093, class19.field356.field1386[0] >> 3, 2, class19.field356.field1388[0] >> 3);
            }
            class38.method313(class205.field3252, !class29.field474);
            class265.method1896(var25);
            class55.method404(class140.field2223, class181.field2891, class312.field4904, class48.field801, (byte) -29, class103.field1746);
            class265.field4118 = class205.field3252;
            class9.method77(class140.field2223, class48.field801, class312.field4904, class181.field2891, class103.field1746, class212.field3381, class185.field2939, class259.field4019, class10.field169, class151.field2430, class74.field1140, class41.field734 + 1, var23, class19.field356.field1442 >> 7, class19.field356.field1369 >> 7);
            class121.field1939 = true;
            class38.method315();
            class55.method404(0, 0, 0, 0, (byte) 106, 0);
            class84.method605((byte) 52);
            class191.method1412();
            class94.method677(class43.field757, class43.field757, arg1, arg2, arg5, arg4, arg3 - 101);
            class108.method825(arg5, class43.field757, arg4, false, class43.field757, arg2, arg1);
        } else {
            class182.method1360(arg2, arg5, arg4, arg1, 0);
            class9.method77(class140.field2223, class48.field801, class312.field4904, class181.field2891, class103.field1746, class212.field3381, class185.field2939, class259.field4019, class10.field169, class151.field2430, class74.field1140, class41.field734 + 1, var23, class19.field356.field1442 >> 7, class19.field356.field1369 >> 7);
            class84.method605((byte) 52);
            class191.method1412();
            class94.method677(256, 256, arg1, arg2, arg5, arg4, -28);
            class108.method825(arg5, 256, arg4, false, 256, arg2, arg1);
        }
        ((class203) class174.field2734).method1480(class122.field1952, (byte) -38);
        class270.method1945(arg1, arg4, (byte) -71, arg5, arg2);
        class312.field4904 = var12;
        class103.field1746 = var14;
        class140.field2223 = var10;
        class48.field801 = var11;
        class181.field2891 = var13;
        if (class139.field2221 && class275.field4276.method690(arg3 ^ 0x36) == 0) {
            class139.field2221 = false;
        }
        if (class139.field2221) {
            if (class265.field4126) {
                class262.method1855(arg2, arg5, arg4, arg1, 0);
            } else {
                class182.method1360(arg2, arg5, arg4, arg1, 0);
            }
            class17.method144((byte) 41, class64.field1015, false);
        }
        if (!arg0 && !class139.field2221 && !class243.field3754 && class275.field4270 >= arg2 && arg2 + arg4 > class275.field4270 && arg5 <= class138.field2198 && arg1 + arg5 > class138.field2198) {
            class6.method24(arg5, class275.field4270, (byte) -110, arg4, class138.field2198, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 275)
    public class82() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V", line = 281)
    public static void method593(byte arg0) {
        int var1 = -52 / ((2 - arg0) / 39);
        field1234 = null;
        field1231 = null;
        field1232 = null;
        field1228 = null;
        field1225 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lkc;Lja;BLja;Lja;)Z", line = 293)
    public static final boolean method594(class36 arg0, class64 arg1, byte arg2, class64 arg3, class64 arg4) {
        class128.field2047 = arg1;
        class159.field2511 = arg3;
        class81.field1217 = arg4;
        field1227++;
        class45.field769 = arg0;
        return arg2 > -69 ? true : true;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)[I", line = 315)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 != -3) {
            field1232 = (String) null;
        }
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int[][] var4 = this.method2106(arg1, 0, 35);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class70.field1108; var8++) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        field1233++;
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([JI[Ljava/lang/Object;II)V", line = 356)
    public static final void method595(long[] arg0, int arg1, Object[] arg2, int arg3, int arg4) {
        if (arg1 < arg3) {
            int var5 = (arg1 + arg3) / 2;
            long var6 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var6;
            Object var8 = arg2[var5];
            int var9 = arg1;
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if ((long) (var10 & 0x1) + var6 > arg0[var10]) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var9];
                    arg0[var9] = var11;
                    Object var13 = arg2[var10];
                    arg2[var10] = arg2[var9];
                    arg2[var9++] = var13;
                }
            }
            arg0[arg3] = arg0[var9];
            arg0[var9] = var6;
            arg2[arg3] = arg2[var9];
            arg2[var9] = var8;
            method595(arg0, arg1, arg2, var9 - 1, -68);
            method595(arg0, var9 + 1, arg2, arg3, -96);
        }
        if (arg4 < -29) {
            field1229++;
        }
    }
}
