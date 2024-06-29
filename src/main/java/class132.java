import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class132 extends class295 {

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "[I")
    private int[] field1883;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "[I")
    private int[] field1894;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "Lnl;")
    private class145 field1890;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "Lnl;")
    private class145 field1892;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "Lnl;")
    private class145 field1880;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "[Lnl;")
    private class145[] field1878;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1876 = null;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "[I")
    public static int[] field1884 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1886 = "scroll:";

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "Z")
    public static boolean field1875 = false;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "Lrk;")
    public static class427 field1888;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V", line = 13)
    public static final void method1029(boolean arg0) {
        field1887++;
        if (!arg0) {
            field1876 = null;
        }
        if (class421.field5895 == 0 || class421.field5895 == 5) {
            return;
        }
        try {
            if (++class359.field4868 > 2000) {
                if (class105.field1540 != null) {
                    class105.field1540.method2736(5000);
                    class105.field1540 = null;
                }
                if (class173.field2558 >= 1) {
                    class421.field5895 = 0;
                    class368.field5051 = -5;
                    return;
                }
                if (class87.field1298 == class31.field518) {
                    class31.field518 = class416.field5816;
                } else {
                    class31.field518 = class87.field1298;
                }
                class359.field4868 = 0;
                class421.field5895 = 1;
                class173.field2558++;
            }
            if (class421.field5895 == 1) {
                class128.field1821 = class30.field502.method1955(class31.field518, class295.field3985, -120);
                class421.field5895 = 2;
            }
            if (class421.field5895 == 2) {
                if (class128.field1821.field3345 == 2) {
                    throw new IOException();
                }
                if (class128.field1821.field3345 != 1) {
                    return;
                }
                class105.field1540 = new class441((Socket) class128.field1821.field3341, class30.field502);
                class128.field1821 = null;
                long var1 = class77.field1155 = class14.method70((byte) 109, class163.field2415);
                class355.field4828.field3938 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class355.field4828.method1824(100, 14);
                class355.field4828.method1824(79, var3);
                class105.field1540.method2737(class355.field4828.field3882, 0, 2, -128);
                if (class76.field1136 != null) {
                    class76.field1136.method1563(123);
                }
                if (class365.field5037 != null) {
                    class365.field5037.method1563(125);
                }
                int var4 = class105.field1540.method2742(5000);
                if (class76.field1136 != null) {
                    class76.field1136.method1563(124);
                }
                if (class365.field5037 != null) {
                    class365.field5037.method1563(123);
                }
                if (var4 != 0) {
                    class421.field5895 = 0;
                    class368.field5051 = var4;
                    class105.field1540.method2736(5000);
                    class105.field1540 = null;
                    return;
                }
                class421.field5895 = 3;
            }
            if (class421.field5895 == 3) {
                if (class105.field1540.method2732(0) < 8) {
                    return;
                }
                class105.field1540.method2733(0, class417.field5851.field3882, 60, 8);
                class417.field5851.field3938 = 0;
                class241.field3329 = class417.field5851.method1879((byte) 122);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), 0, 0, (int) class241.field3329 };
                class355.field4828.field3938 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class241.field3329 >> 32);
                class355.field4828.method1824(109, 10);
                class355.field4828.method1854(var5[0], true);
                class355.field4828.method1854(var5[1], true);
                class355.field4828.method1854(var5[2], true);
                class355.field4828.method1854(var5[3], true);
                class355.field4828.method1866(-19069, class14.method70((byte) 77, class163.field2415));
                class355.field4828.method1827(0, class37.field570);
                class355.field4828.method1878(class340.field4635, 94, class38.field579);
                class348.field4717.field3938 = 0;
                if (class166.field2472 == 40) {
                    class348.field4717.method1824(48, 18);
                } else {
                    class348.field4717.method1824(84, 16);
                }
                class348.field4717.method1877(arg0, 161 - (-class355.field4828.field3938 - class408.method2528(-111, class301.field4042)));
                class348.field4717.method1854(555, true);
                class348.field4717.method1824(55, class312.field4224);
                class348.field4717.method1824(100, class76.method651(-43));
                class348.field4717.method1877(arg0, class249.field3414);
                class348.field4717.method1877(arg0, class258.field3488);
                class348.field4717.method1824(77, class31.field514);
                class1.method1(106, class348.field4717);
                class348.field4717.method1827(0, class301.field4042);
                class348.field4717.method1854(class346.field4689, arg0);
                class348.field4717.method1854(class262.method1688((byte) -101), true);
                class338.field4600 = true;
                class348.field4717.method1877(true, class69.field1040);
                class348.field4717.method1854(class105.field1544.method2652(21594), arg0);
                class348.field4717.method1854(class244.field3372.method2652(21594), true);
                class348.field4717.method1854(class396.field5548.method2652(21594), true);
                class348.field4717.method1854(class325.field4412.method2652(21594), true);
                class348.field4717.method1854(class332.field4515.method2652(21594), true);
                class348.field4717.method1854(class23.field417.method2652(21594), true);
                class348.field4717.method1854(class138.field1943.method2652(21594), arg0);
                class348.field4717.method1854(class204.field2875.method2652(21594), true);
                class348.field4717.method1854(class187.field2705.method2652(21594), true);
                class348.field4717.method1854(class266.field3568.method2652(21594), arg0);
                class348.field4717.method1854(class185.field2690.method2652(21594), arg0);
                class348.field4717.method1854(class227.field3137.method2652(21594), true);
                class348.field4717.method1854(class297.field4006.method2652(21594), true);
                class348.field4717.method1854(class49.field829.method2652(21594), true);
                class348.field4717.method1854(class166.field2467.method2652(21594), true);
                class348.field4717.method1854(class312.field4216.method2652(21594), arg0);
                class348.field4717.method1854(class43.field651.method2652(21594), true);
                class348.field4717.method1854(class209.field2904.method2652(21594), true);
                class348.field4717.method1854(class13.field102.method2652(21594), true);
                class348.field4717.method1854(class332.field4514.method2652(21594), true);
                class348.field4717.method1854(class417.field5833.method2652(21594), arg0);
                class348.field4717.method1854(class12.field92.method2652(21594), arg0);
                class348.field4717.method1854(class154.field2342.method2652(21594), true);
                class348.field4717.method1854(class23.field420.method2652(21594), arg0);
                class348.field4717.method1854(class312.field4222.method2652(21594), arg0);
                class348.field4717.method1854(class5.field40.method2652(21594), true);
                class348.field4717.method1854(class273.field3667.method2652(21594), arg0);
                class348.field4717.method1854(class446.field6405.method2652(21594), true);
                class348.field4717.method1854(class183.field2669.method2652(21594), true);
                class348.field4717.method1870(0, class355.field4828.field3882, class355.field4828.field3938, (byte) 102);
                class105.field1540.method2737(class348.field4717.field3882, 0, class348.field4717.field3938, -127);
                class355.field4828.method1802(var5, (byte) 77);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class417.field5851.method1802(var5, (byte) 82);
                class421.field5895 = 4;
            }
            if (class421.field5895 == 4) {
                if (class105.field1540.method2732(0) < 1) {
                    return;
                }
                int var7 = class105.field1540.method2742(5000);
                if (var7 == 21) {
                    class421.field5895 = 7;
                } else if (var7 == 29) {
                    class421.field5895 = 10;
                } else if (var7 == 1) {
                    class421.field5895 = 5;
                    class368.field5051 = var7;
                    return;
                } else if (var7 == 2) {
                    class421.field5895 = 8;
                } else if (var7 == 15) {
                    class421.field5895 = 0;
                    class368.field5051 = var7;
                    return;
                } else if (var7 == 23 && class173.field2558 < 1) {
                    class359.field4868 = 0;
                    class173.field2558++;
                    class421.field5895 = 1;
                    class105.field1540.method2736(5000);
                    class105.field1540 = null;
                    return;
                } else {
                    class368.field5051 = var7;
                    class421.field5895 = 0;
                    class105.field1540.method2736(5000);
                    class105.field1540 = null;
                    return;
                }
            }
            if (class421.field5895 == 6) {
                class355.field4828.field3938 = 0;
                class355.field4828.method1801(17, (byte) -106);
                class105.field1540.method2737(class355.field4828.field3882, 0, class355.field4828.field3938, -126);
                class421.field5895 = 4;
            } else if (class421.field5895 == 7) {
                if (class105.field1540.method2732(0) >= 1) {
                    class383.field5366 = (class105.field1540.method2742(5000) + 3) * 60;
                    class421.field5895 = 0;
                    class368.field5051 = 21;
                    class105.field1540.method2736(5000);
                    class105.field1540 = null;
                }
            } else if (class421.field5895 != 10) {
                if (class421.field5895 == 8) {
                    if (class105.field1540.method2732(0) < 14) {
                        return;
                    }
                    class105.field1540.method2733(0, class417.field5851.field3882, 73, 14);
                    class417.field5851.field3938 = 0;
                    class447.field6482 = class417.field5851.method1861((byte) -72);
                    class174.field2578 = class417.field5851.method1861((byte) -72);
                    class288.field3859 = class417.field5851.method1861((byte) -72) == 1;
                    class128.field1807 = class417.field5851.method1861((byte) -72) == 1;
                    class416.field5825 = class417.field5851.method1861((byte) -72) == 1;
                    class236.field3282 = class417.field5851.method1861((byte) -72) == 1;
                    class145.field2212 = class417.field5851.method1861((byte) -72) == 1;
                    class401.field5606 = class417.field5851.method1853(96);
                    class176.field2607 = class417.field5851.method1861((byte) -72) == 1;
                    class78.field1178 = class417.field5851.method1861((byte) -72) == 1;
                    class318.method2022(class78.field1178, (byte) -59);
                    class247.method1613(class78.field1178, -24410);
                    class187.method1353(class78.field1178, 5);
                    if ((!class288.field3859 || class416.field5825) && !class176.field2607) {
                        try {
                            class117.method936("unzap", true, class30.field502.field4117);
                        } catch (Throwable var10) {
                        }
                    } else {
                        try {
                            class117.method936("zap", true, class30.field502.field4117);
                        } catch (Throwable var9) {
                        }
                    }
                    if (class445.field6400 == 0) {
                        try {
                            class117.method936("loggedin", arg0, class30.field502.field4117);
                        } catch (Throwable var8) {
                        }
                    }
                    class363.field5019 = class417.field5851.method1800(arg0);
                    class213.field2961 = class417.field5851.method1853(117);
                    class421.field5895 = 9;
                }
                if (class421.field5895 == 9 && class105.field1540.method2732(0) >= class213.field2961) {
                    class417.field5851.field3938 = 0;
                    class105.field1540.method2733(0, class417.field5851.field3882, 77, class213.field2961);
                    class368.field5051 = 2;
                    class421.field5895 = 0;
                    class212.method1452(0);
                    class38.field578 = -1;
                    class388.method2400(false, -28390);
                    class363.field5019 = -1;
                }
            } else if (class105.field1540.method2732(0) >= 1) {
                class12.field87 = class105.field1540.method2742(5000);
                class368.field5051 = 29;
                class421.field5895 = 0;
                class105.field1540.method2736(5000);
                class105.field1540 = null;
            }
        } catch (IOException var11) {
            if (class105.field1540 != null) {
                class105.field1540.method2736(5000);
                class105.field1540 = null;
            }
            if (class173.field2558 < 1) {
                class359.field4868 = 0;
                class173.field2558++;
                class421.field5895 = 1;
                if (class87.field1298 == class31.field518) {
                    class31.field518 = class416.field5816;
                } else {
                    class31.field518 = class87.field1298;
                }
            } else {
                class368.field5051 = -4;
                class421.field5895 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILrk;BLpg;Z)[F", line = 394)
    public final float[] method1030(int arg0, int arg1, class427 arg2, byte arg3, class112 arg4, boolean arg5) {
        field1889++;
        class255.field3462 = arg4;
        class7.field45 = arg2;
        for (int var7 = 0; var7 < this.field1878.length; var7++) {
            this.field1878[var7].method1117((byte) -114, arg1, arg0);
        }
        class69.method597(arg1, arg0, -1);
        float[] var8 = new float[arg0 * arg1 * 4];
        int var9 = 0;
        int var10 = -56 / ((69 - arg3) / 51);
        for (int var11 = 0; var11 < arg1; var11++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1892.field2205) {
                int[] var17 = this.field1892.method3(var11, 65);
                var16 = var17;
                var15 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field1892.method4(true, var11);
                var14 = var13[1];
                var15 = var13[2];
                var16 = var13[0];
            }
            int[] var18;
            if (this.field1880.field2205) {
                var18 = this.field1880.method3(var11, -121);
            } else {
                var18 = this.field1880.method4(true, var11)[0];
            }
            if (arg5) {
                var9 = var11 << 2;
            }
            int[] var19;
            if (this.field1890.field2205) {
                var19 = this.field1890.method3(var11, 71);
            } else {
                var19 = this.field1890.method4(true, var11)[0];
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                float var21 = (float) var18[var20] / 4096.0F;
                float var22 = ((float) var19[var20] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var21 < 0.0F)) {
                    var21 = 0.0F;
                } else if (var21 > 1.0F) {
                    var21 = 1.0F;
                }
                var8[var9++] = (float) var16[var20] * var22;
                var8[var9++] = (float) var14[var20] * var22;
                var8[var9++] = (float) var15[var20] * var22;
                var8[var9++] = var21;
                if (arg5) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var12 = 0; var12 < this.field1878.length; var12++) {
            this.field1878[var12].method1118((byte) 66);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lpg;Lrk;I)Z", line = 503)
    public final boolean method1031(class112 arg0, class427 arg1, int arg2) {
        field1874++;
        if (class390.field5478 <= 0) {
            for (int var4 = 0; var4 < this.field1883.length; var4++) {
                if (!arg1.method2635(this.field1883[var4], (byte) 104)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1883.length; var5++) {
                if (!arg1.method2628((byte) 114, class390.field5478, this.field1883[var5])) {
                    return false;
                }
            }
        }
        if (arg2 <= 120) {
            this.field1880 = null;
        }
        for (int var6 = 0; var6 < this.field1894.length; var6++) {
            if (!arg0.method918(this.field1894[var6], -567)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIDILpg;Lrk;Z)[I", line = 554)
    public final int[] method1032(byte arg0, int arg1, double arg2, int arg3, class112 arg4, class427 arg5, boolean arg6) {
        class7.field45 = arg5;
        class255.field3462 = arg4;
        field1879++;
        int var9 = 0;
        if (arg0 <= 54) {
            this.method1038(-128, false, -0.07376420579991437D, true, (class427) null, (class112) null, -25, -50);
        }
        while (this.field1878.length > var9) {
            this.field1878[var9].method1117((byte) -104, arg3, arg1);
            var9++;
        }
        class249.method1623(arg2, true);
        class69.method597(arg3, arg1, -1);
        int[] var10 = new int[arg1 * arg3 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1892.field2205) {
                int[] var18 = this.field1892.method3(var12, -58);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field1892.method4(true, var12);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field1880.field2205) {
                var19 = this.field1880.method3(var12, 115);
            } else {
                var19 = this.field1880.method4(true, var12)[0];
            }
            if (arg6) {
                var11 = var12;
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class282.field3772[var22];
                int var25 = class282.field3772[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class282.field3772[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 16) + (var27 << 24) + (var24 << 8) + var26;
                if (arg6) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1878.length; var13++) {
            this.field1878[var13].method1118((byte) 66);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V", line = 690)
    public static final void method1033(int arg0) {
        class394.field5521++;
        field1877++;
        class355.field4828.method1801(74, (byte) -54);
        class355.field4828.method1824(95, class76.method651(-110));
        if (arg0 <= -33) {
            class355.field4828.method1877(true, class249.field3414);
            class355.field4828.method1877(true, class258.field3488);
            class355.field4828.method1824(110, class31.field514);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BII)V", line = 720)
    public static final void method1034(byte arg0, int arg1, int arg2) {
        field1882++;
        class167 var3 = class428.method2666(arg1, -32769);
        int var4 = var3.field2482;
        if (arg0 != 12) {
            method1035(-113, 65, 90);
        }
        int var5 = var3.field2483;
        int var6 = var3.field2478;
        int var7 = class221.field3054[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class267.method1716(0, var4, var8 & arg2 << var5 | ~var8 & class414.field5782[var4]);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V", line = 759)
    public static final void method1035(int arg0, int arg1, int arg2) {
        field1881++;
        class450 var3 = class59.method540(6, arg0, 1000);
        if (arg1 != 5203) {
            field1886 = null;
        }
        var3.method2800(256);
        var3.field6498 = arg2;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/lang/String;)I", line = 778)
    public static final int method1036(int arg0, String arg1) {
        if (arg0 >= -28) {
            method1035(-88, 41, -116);
        }
        field1885++;
        for (int var2 = 0; var2 < class130.field1844.length; var2++) {
            if (class130.field1844[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V", line = 803)
    public static void method1037(int arg0) {
        field1886 = null;
        field1884 = null;
        if (arg0 != -1) {
            method1036(105, (String) null);
        }
        field1888 = null;
        field1876 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZDZLrk;Lpg;II)[I", line = 817)
    public final int[] method1038(int arg0, boolean arg1, double arg2, boolean arg3, class427 arg4, class112 arg5, int arg6, int arg7) {
        class255.field3462 = arg5;
        class7.field45 = arg4;
        field1891++;
        for (int var10 = 0; var10 < this.field1878.length; var10++) {
            this.field1878[var10].method1117((byte) -113, arg7, arg6);
        }
        class249.method1623(arg2, true);
        class69.method597(arg7, arg6, -1);
        int[] var11 = new int[arg6 * arg7];
        int var12;
        byte var13;
        int var14;
        if (arg1) {
            var14 = -1;
            var13 = -1;
            var12 = arg6 - 1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg6;
        }
        if (arg0 >= -63) {
            method1036(117, (String) null);
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1892.field2205) {
                int[] var18 = this.field1892.method3(var16, -58);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1892.method4(true, var16);
                var20 = var22[1];
                var21 = var22[0];
                var19 = var22[2];
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class282.field3772[var24];
                int var28 = class282.field3772[var25];
                int var29 = class282.field3772[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg3) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1878.length; var17++) {
            this.field1878[var17].method1118((byte) 66);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 954)
    public class132() {
        this.field1883 = new int[0];
        this.field1894 = new int[0];
        this.field1890 = new class365(0);
        this.field1890.field2221 = 1;
        this.field1892 = new class365();
        this.field1892.field2221 = 1;
        this.field1880 = new class365();
        this.field1878 = new class145[] { this.field1892, this.field1880, this.field1890 };
        this.field1880.field2221 = 1;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lap;)V", line = 969)
    public class132(class289 arg0) {
        int var2 = arg0.method1861((byte) -72);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field1878 = new class145[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class145 var16 = class84.method756(arg0, -98);
            if (var16.method1120(3) >= 0) {
                var3++;
            }
            if (var16.method1115(false) >= 0) {
                var4++;
            }
            int var17 = var16.field2204.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1861((byte) -72);
            }
            this.field1878[var6] = var16;
        }
        this.field1883 = new int[var3];
        this.field1894 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class145 var11 = this.field1878[var9];
            int var12 = var11.field2204.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2204[var13] = this.field1878[var5[var9][var13]];
            }
            int var14 = var11.method1120(3);
            int var15 = var11.method1115(false);
            if (var14 > 0) {
                this.field1883[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1894[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1892 = this.field1878[arg0.method1861((byte) -72)];
        this.field1880 = this.field1878[arg0.method1861((byte) -72)];
        this.field1890 = this.field1878[arg0.method1861((byte) -72)];
        Object var10 = null;
    }
}
