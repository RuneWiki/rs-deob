import java.io.IOException;
import java.net.Socket;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class206 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
    public static int[] field2806 = new int[4096];

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2809 = new CRC32();

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lcq;")
    public static class273 field2812 = new class273(1, 2, 2, 0);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1322(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class622.method3583(arg2, -2);
        field2811++;
        int var7 = 0;
        int var8 = arg2 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class565.field8253[arg0];
        int var16 = arg4 - var8;
        class41.method235(arg4 - arg2, var15, 0, var16, arg1);
        int var17 = arg4 + var8;
        class41.method235(var16, var15, 0, var17, arg6);
        int var18 = -25 / ((-arg5 - 19) / 58);
        class41.method235(var17, var15, 0, arg4 + arg2, arg1);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class464.field6699[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var19 = class565.field8253[arg0 + var9];
                    int[] var20 = class565.field8253[arg0 - var9];
                    int var21 = class464.field6699[var9];
                    int var22 = arg4 + var7;
                    int var23 = arg4 - var7;
                    int var24 = arg4 + var21;
                    int var25 = arg4 - var21;
                    class41.method235(var23, var19, 0, var25, arg1);
                    class41.method235(var25, var19, 0, var24, arg6);
                    class41.method235(var24, var19, 0, var22, arg1);
                    class41.method235(var23, var20, 0, var25, arg1);
                    class41.method235(var25, var20, 0, var24, arg6);
                    class41.method235(var24, var20, 0, var22, arg1);
                } else {
                    int[] var26 = class565.field8253[arg0 + var9];
                    int[] var27 = class565.field8253[arg0 - var9];
                    int var28 = arg4 + var7;
                    int var29 = arg4 - var7;
                    class41.method235(var29, var26, 0, var28, arg1);
                    class41.method235(var29, var27, 0, var28, arg1);
                }
            }
            int[] var30 = class565.field8253[arg0 + var7];
            int[] var31 = class565.field8253[arg0 - var7];
            int var32 = arg4 + var9;
            int var33 = arg4 - var9;
            if (var7 >= var8) {
                class41.method235(var33, var30, 0, var32, arg1);
                class41.method235(var33, var31, 0, var32, arg1);
            } else {
                int var34 = var11 < var7 ? class464.field6699[var7] : var11;
                int var35 = arg4 + var34;
                int var36 = arg4 - var34;
                class41.method235(var33, var30, 0, var36, arg1);
                class41.method235(var36, var30, 0, var35, arg6);
                class41.method235(var35, var30, 0, var32, arg1);
                class41.method235(var33, var31, 0, var36, arg1);
                class41.method235(var36, var31, 0, var35, arg6);
                class41.method235(var35, var31, 0, var32, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method1323(int arg0) {
        if (arg0 != 5) {
            field2809 = null;
        }
        field2806 = null;
        field2812 = null;
        field2809 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1324(int arg0, byte arg1, int arg2) {
        if (arg1 != 70) {
            field2812 = null;
        }
        field2810++;
        return (class53.method313(122, arg2, arg0) | (arg0 & 0x2000) != 0 | class582.method3338(arg0, 13419, arg2)) & class446.method2640(arg2, (byte) -91, arg0);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static final void method1325(byte arg0) {
        field2807++;
        if (class175.field2458 == 0) {
            return;
        }
        try {
            if (++class622.field8997 > 2000) {
                if (class230.field3051 != null) {
                    class230.field3051.method1362((byte) -123);
                    class230.field3051 = null;
                }
                if (class399.field6018 >= 2) {
                    class43.field622 = -5;
                    class175.field2458 = 0;
                    return;
                }
                class584.field8491.method729(31292);
                class399.field6018++;
                class175.field2458 = 1;
                class622.field8997 = 0;
            }
            if (class175.field2458 == 1) {
                class165.field2318 = class584.field8491.method733(443, class61.field978);
                class175.field2458 = 2;
            }
            if (arg0 < -115) {
                if (class175.field2458 == 2) {
                    if (class165.field2318.field3311 == 2) {
                        throw new IOException();
                    }
                    if (class165.field2318.field3311 != 1) {
                        return;
                    }
                    class230.field3051 = class5.method24((Socket) class165.field2318.field3307, 7500, (byte) 9);
                    class165.field2318 = null;
                    class220.method1385(true);
                    class175.field2458 = 4;
                }
                if (class175.field2458 == 4) {
                    if (!class230.field3051.method1359(-89, 1)) {
                        return;
                    }
                    class230.field3051.method1356(false, 0, class389.field5816.field7952, 1);
                    int var1 = class389.field5816.field7952[0] & 0xFF;
                    if (var1 != 21) {
                        class175.field2458 = 0;
                        class43.field622 = var1;
                        class230.field3051.method1362((byte) 96);
                        class230.field3051 = null;
                        return;
                    }
                    class175.field2458 = 5;
                }
                if (class175.field2458 == 5) {
                    if (!class230.field3051.method1359(-112, 1)) {
                        return;
                    }
                    class230.field3051.method1356(false, 0, class389.field5816.field7952, 1);
                    class627.field9098 = new String[class389.field5816.field7952[0] & 0xFF];
                    class175.field2458 = 6;
                }
                if (class175.field2458 == 6 && class230.field3051.method1359(-108, class627.field9098.length * 8)) {
                    class389.field5816.field7956 = 0;
                    class230.field3051.method1356(false, 0, class389.field5816.field7952, class627.field9098.length * 8);
                    for (int var2 = 0; var2 < class627.field9098.length; var2++) {
                        class627.field9098[var2] = class444.method2626(-4943, class389.field5816.method3165(98));
                    }
                    class175.field2458 = 0;
                    class43.field622 = 21;
                    class230.field3051.method1362((byte) -115);
                    class230.field3051 = null;
                }
            }
        } catch (IOException var3) {
            if (class230.field3051 != null) {
                class230.field3051.method1362((byte) 31);
                class230.field3051 = null;
            }
            if (class399.field6018 < 2) {
                class584.field8491.method729(31292);
                class175.field2458 = 1;
                class622.field8997 = 0;
                class399.field6018++;
            } else {
                class175.field2458 = 0;
                class43.field622 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)I")
    public static final int method1326(int arg0, byte arg1) {
        field2808++;
        return arg1 < 74 ? -115 : arg0 >>> 10;
    }
}
