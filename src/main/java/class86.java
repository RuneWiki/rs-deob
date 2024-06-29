import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class86 implements Runnable {

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "Lsk;")
    public static class452 field1050 = new class452(1);

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "Lba;")
    private class661 field1054;

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field1051;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "Z")
    private volatile boolean field1049;

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "[I")
    public static int[] field1055;

    @OriginalMember(owner = "client!cga", name = "l", descriptor = "[Lab;")
    private class316[] field1057;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)Lab;")
    public final class316 method470(int arg0, int arg1) {
        field1056++;
        if (arg0 == 0) {
            return this.field1057 == null || arg1 < 0 || this.field1057.length <= arg1 ? null : this.field1057[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IBLwv;I)V")
    private static final void method471(int arg0, byte arg1, class423 arg2, int arg3) {
        if (arg1 != 30) {
            method471(36, (byte) -32, null, 127);
        }
        field1046++;
        class596 var4 = arg2.method2383(arg1 - 31, class146.field1963);
        if (var4 == null) {
            return;
        }
        class146.field1963.method1042(arg3, arg0, arg3 + arg2.field5561, arg2.field5672 + arg0);
        if (class657.field9361 < 3) {
            class274.field3655.method2994((float) arg2.field5561 / 2.0F + (float) arg3, (float) arg2.field5672 / 2.0F + (float) arg0, 4096, ((int) (-class565.field7707) & 0x3FFF) << 2, var4, arg3, arg0);
        } else {
            class146.field1963.method1095(-16777216, var4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
    public static void method472(int arg0) {
        field1055 = null;
        if (arg0 != 0) {
            method471(-101, (byte) 124, null, -85);
        }
        field1050 = null;
    }

    @OriginalMember(owner = "client!cga", name = "run", descriptor = "()V")
    public final void run() {
        field1048++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field1054.field9421));
            String var2 = var1.readLine();
            class454 var3 = class262.method1579(1);
            while (var2 != null) {
                var3.method2554(var2, (byte) -30);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method2556(0);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field1057 = new class316[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field1057[var5 / 3] = new class316(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field1049 = true;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIIII[Lwv;III)V")
    public static final void method473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class423[] arg6, int arg7, int arg8, int arg9) {
        field1047++;
        class146.field1963.method1042(arg0, arg7, arg3, arg2);
        if (arg8 != 32092) {
            return;
        }
        for (int var10 = 0; var10 < arg6.length; var10++) {
            class423 var11 = arg6[var10];
            if (var11 != null && (var11.field5585 == arg4 || arg4 == -1412584499 && class85.field1028 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class680.field9648[class629.field8707].setBounds(var11.field5570 + arg5, var11.field5654 + arg1, var11.field5561, var11.field5672);
                    var12 = class629.field8707++;
                } else {
                    var12 = arg9;
                }
                var11.field5708 = class327.field4404;
                var11.field5604 = var12;
                if (!client.method3855(var11)) {
                    if (var11.field5619 != 0) {
                        class208.method1323((byte) -109, var11);
                    }
                    int var13 = var11.field5570 + arg5;
                    int var14 = var11.field5654 + arg1;
                    int var15 = var11.field5608;
                    if (class452.field5967 && (client.method3858(var11).field48 != 0 || var11.field5598 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class85.field1028 == var11) {
                        if (arg4 != -1412584499 && (class590.field8142 == var11.field5691 || class242.field3189 == var11.field5691)) {
                            class609.field8465 = arg1;
                            class502.field6924 = arg6;
                            class138.field1877 = arg5;
                            continue;
                        }
                        if (class371.field4945 && class606.field8447) {
                            int var16 = class409.field5387.method1890(16777215);
                            int var17 = class409.field5387.method1893((byte) 112);
                            int var18 = var16 - class287.field3789;
                            int var19 = var17 - class366.field4832;
                            if (var18 < class664.field9452) {
                                var18 = class664.field9452;
                            }
                            if (var19 < class460.field6026) {
                                var19 = class460.field6026;
                            }
                            if ((class664.field9452 + class342.field4584.field5561) < (var11.field5561 + var18)) {
                                var18 = class664.field9452 + class342.field4584.field5561 - var11.field5561;
                            }
                            var13 = var18;
                            if ((var11.field5672 + var19) > (class460.field6026 + class342.field4584.field5672)) {
                                var19 = class460.field6026 + class342.field4584.field5672 - var11.field5672;
                            }
                            var14 = var19;
                        }
                        if (class242.field3189 == var11.field5691) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field5598 == 2) {
                        var20 = arg7;
                        var21 = arg3;
                        var22 = arg2;
                        var23 = arg0;
                    } else {
                        int var24 = var11.field5561 + var13;
                        int var25 = var11.field5672 + var14;
                        var23 = arg0 >= var13 ? arg0 : var13;
                        var20 = var14 > arg7 ? var14 : arg7;
                        if (var11.field5598 == 9) {
                            var25++;
                            var24++;
                        }
                        var22 = arg2 > var25 ? var25 : arg2;
                        var21 = arg3 > var24 ? var24 : arg3;
                    }
                    if (var21 > var23 && var22 > var20) {
                        if (var11.field5619 != 0) {
                            if (class651.field9031 == var11.field5619 || class309.field4185 == var11.field5619) {
                                class205.method1309(class309.field4185 == var11.field5619, var11.field5672, var11.field5561, var13, 124, var14);
                                class325.field4383[var12] = true;
                                class146.field1963.method1042(arg0, arg7, arg3, arg2);
                                continue;
                            }
                            if (class116.field1490 == var11.field5619) {
                                if (var11.method2383(-1, class146.field1963) != null) {
                                    class276.method1656(-896460184);
                                    class622.method3457(var11, class146.field1963, var13, arg8 ^ 0x2DFF, var14);
                                    class13.field166[var12] = true;
                                    class146.field1963.method1042(arg0, arg7, arg3, arg2);
                                }
                                continue;
                            }
                            if (class679.field9641 == var11.field5619) {
                                if (var11.method2383(arg8 - 32093, class146.field1963) != null) {
                                    method471(var14, (byte) 30, var11, var13);
                                    class13.field166[var12] = true;
                                    class146.field1963.method1042(arg0, arg7, arg3, arg2);
                                }
                                continue;
                            }
                            if (class508.field7014 == var11.field5619) {
                                class381.method2182(class146.field1963, var14, arg8 ^ 0xFFFF82DC, var11.field5672, var13, var11.field5561, class315.field4225);
                                class325.field4383[var12] = true;
                                class146.field1963.method1042(arg0, arg7, arg3, arg2);
                                continue;
                            }
                            if (class208.field2782 == var11.field5619) {
                                class535.method3002(var11.field5561, class146.field1963, var14, var11.field5672, var13, 5);
                                class325.field4383[var12] = true;
                                class146.field1963.method1042(arg0, arg7, arg3, arg2);
                                continue;
                            }
                            if (class545.field7459 == var11.field5619) {
                                if (!class559.field7627 && !class619.field8595) {
                                    continue;
                                }
                                int var26 = var11.field5561 + var13;
                                int var27 = var14 + 15;
                                if (class559.field7627) {
                                    int var28 = -256;
                                    if (class91.field1119 < 20) {
                                        var28 = -65536;
                                    }
                                    class401.field5319.method2324(var28, -1, (byte) 115, "Fps:" + class91.field1119, var27, var26);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                        if (class124.field1737) {
                                            class119.method694(-127);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class642.method3555((byte) -101, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 4);
                                            }
                                        }
                                    }
                                    class401.field5319.method2324(var31, -1, (byte) 115, "Mem:" + var30 + "k", var27, var26);
                                    var27 += 15;
                                    class401.field5319.method2324(-256, -1, (byte) 115, "In:" + class100.field1205 + "B/s Out:" + class648.field8950 + "B/s", var27, var26);
                                    var27 += 15;
                                    int var33 = class146.field1963.method1137() / 1024;
                                    class401.field5319.method2324(var33 > 65536 ? -65536 : -256, -1, (byte) 115, "Offheap:" + var33 + "k", var27, var26);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 35; var37++) {
                                        if (class244.field3196[var37] != null) {
                                            var34 += class244.field3196[var37].method3583(-87);
                                            var35 += class244.field3196[var37].method3574((byte) -50);
                                            var36 += class244.field3196[var37].method3582(98);
                                        }
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class191.method1255((long) var39, -125, 0, true, 2) + "% (" + var38 + "%)";
                                    class399.field5300.method2324(-256, -1, (byte) 115, var40, var27, var26);
                                    var27 += 12;
                                }
                                if (class125.field1752 > 0) {
                                    class399.field5300.method2324(-256, -1, (byte) 115, "Particles: " + class275.field3658 + " / " + class125.field1752, var27, var26);
                                }
                                var27 += 12;
                                if (class619.field8595) {
                                    class399.field5300.method2324(-256, -1, (byte) 115, "Polys: " + class146.field1963.method1119() + " Models: " + class146.field1963.method1062(), var27, var26);
                                    var27 += 12;
                                    class399.field5300.method2324(-256, -1, (byte) 115, "Ls: " + class227.field2945 + " La: " + class366.field4830 + " NPC: " + class366.field4831 + " Pl: " + class113.field1441, var27, var26);
                                    var27 += 12;
                                    class284.method1681(-23711);
                                }
                                class325.field4383[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field5598 == 0) {
                            if (class338.field4557 == var11.field5619 && class146.field1963.method1098()) {
                                class146.field1963.method1140(var13, var14, var11.field5561, var11.field5672);
                            }
                            method473(var23, var14 - var11.field5640, var22, var21, var11.field5685, var13 - var11.field5550, arg6, var20, 32092, var12);
                            if (var11.field5647 != null) {
                                method473(var23, var14 - var11.field5640, var22, var21, var11.field5685, var13 - var11.field5550, var11.field5647, var20, 32092, var12);
                            }
                            class137 var41 = (class137) class152.field2079.method3057(1, (long) var11.field5685);
                            if (var41 != null) {
                                class564.method3129((byte) -119, var22, var14, var21, var13, var12, var23, var41.field1870, var20);
                            }
                            if (class338.field4557 == var11.field5619 && class146.field1963.method1098()) {
                                class146.field1963.method1061();
                            }
                            class146.field1963.method1042(arg0, arg7, arg3, arg2);
                        }
                        if (class14.field174[var12] || class220.field2869 > 1) {
                            if (var11.field5598 == 3) {
                                if (var15 == 0) {
                                    if (var11.field5556) {
                                        class146.field1963.method1113(var13, var14, var11.field5561, var11.field5672, var11.field5664, 0);
                                    } else {
                                        class146.field1963.method1121(var13, var14, var11.field5561, var11.field5672, var11.field5664, 0);
                                    }
                                } else if (var11.field5556) {
                                    class146.field1963.method1113(var13, var14, var11.field5561, var11.field5672, var11.field5664 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class146.field1963.method1121(var13, var14, var11.field5561, var11.field5672, 255 - (var15 & 0xFF) << 24 | var11.field5664 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field5598 == 4) {
                                class409 var42 = var11.method2399(class146.field1963, (byte) -125);
                                if (var42 != null) {
                                    int var43 = var11.field5664;
                                    String var44 = var11.field5704;
                                    if (var11.field5552 != -1) {
                                        class584 var45 = class87.field1058.method1394(-122, var11.field5552);
                                        var44 = var45.field8032;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field8034 == 1 || var11.field5557 != 1) && var11.field5557 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class252.method1529(var11.field5557, false);
                                        }
                                    }
                                    if (class495.field6823 == var11) {
                                        var44 = class371.field4910.method2141(class422.field5539, true);
                                        var43 = var11.field5664;
                                    }
                                    if (class650.field8973) {
                                        class146.field1963.method1077(var13, var14, var11.field5561 + var13, var11.field5672 + var14);
                                    }
                                    var42.method2325(var11.field5667, null, 0, 0, 255 - (var15 & 0xFF) << 24 | var43, false, var44, var11.field5701, class369.field4849, var14, var11.field5672, null, var13, var11.field5561, var11.field5670, var11.field5567 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field5580);
                                    if (class650.field8973) {
                                        class146.field1963.method1042(arg0, arg7, arg3, arg2);
                                    }
                                } else if (class181.field2534) {
                                    class552.method3091(var11, 12618);
                                }
                            } else if (var11.field5598 == 5) {
                                if (var11.field5689 < 0) {
                                    class532 var47;
                                    if (var11.field5552 == -1) {
                                        var47 = var11.method2387(-124, class146.field1963);
                                    } else {
                                        class321 var46 = var11.field5651 ? class408.field5369.field7810 : null;
                                        var47 = class87.field1058.method1402(var11.field5552, var11.field5642, var11.field5557, class146.field1963, var11.field5663, (byte) -3, var11.field5671 | 0xFF000000, var46);
                                    }
                                    if (var47 != null) {
                                        int var48 = var47.method523();
                                        int var49 = var47.method532();
                                        int var50 = (var11.field5664 == 0 ? 16777215 : var11.field5664 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field5661) {
                                            class146.field1963.method1077(var13, var14, var11.field5561 + var13, var11.field5672 + var14);
                                            if (var11.field5617 != 0) {
                                                int var51 = (var48 + var11.field5561 - 1) / var48;
                                                int var52 = (var49 - (1 - var11.field5672)) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field5664 == 0) {
                                                            var47.method2989((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field5617);
                                                        } else {
                                                            var47.method2984((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field5617, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field5664 == 0 && var15 == 0) {
                                                var47.method2992(var13, var14, var11.field5561, var11.field5672);
                                            } else {
                                                var47.method531(var13, var14, var11.field5561, var11.field5672, 0, var50, 1);
                                            }
                                            class146.field1963.method1042(arg0, arg7, arg3, arg2);
                                        } else if (var11.field5664 == 0 && var15 == 0) {
                                            if (var11.field5617 != 0) {
                                                var47.method2989((float) var11.field5561 / 2.0F + (float) var13, (float) var11.field5672 / 2.0F + (float) var14, var11.field5561 * 4096 / var48, var11.field5617);
                                            } else if (var11.field5561 == var48 && var11.field5672 == var49) {
                                                var47.method2990(var13, var14);
                                            } else {
                                                var47.method2993(var13, var14, var11.field5561, var11.field5672);
                                            }
                                        } else if (var11.field5617 != 0) {
                                            var47.method2984((float) var11.field5561 / 2.0F + (float) var13, (float) var11.field5672 / 2.0F + (float) var14, var11.field5561 * 4096 / var48, var11.field5617, 0, var50, 1);
                                        } else if (var11.field5561 == var48 && var11.field5672 == var49) {
                                            var47.method217(var13, var14, 0, var50, 1);
                                        } else {
                                            var47.method2991(var13, var14, var11.field5561, var11.field5672, 0, var50, 1);
                                        }
                                    } else if (class181.field2534) {
                                        class552.method3091(var11, 12618);
                                    }
                                } else {
                                    var11.method2393((byte) -64, class400.field5313, class579.field7919).method3248(var11.field5672, -24009, var13, var11.field5678 << 3, 0, 0, class146.field1963, var11.field5641 << 3, var11.field5561, var14);
                                }
                            } else if (var11.field5598 == 6) {
                                class95.method540(-200);
                                class470 var55 = null;
                                int var56 = 0;
                                if (var11.field5552 != -1) {
                                    class584 var57 = class87.field1058.method1394(-115, var11.field5552);
                                    if (var57 != null) {
                                        class584 var58 = var57.method3235(arg8 - 31981, var11.field5557);
                                        class186 var59 = var11.field5627 == -1 ? null : class423.field5620.method1707(var11.field5627, arg8 ^ 0xFFFF82D0);
                                        class321 var60 = var11.field5651 ? class408.field5369.field7810 : null;
                                        var55 = var58.method3231(var11.field5572, 128, var59, 1, 2048, var60, var11.field5555, var11.field5680, class146.field1963);
                                        if (var55 == null) {
                                            class552.method3091(var11, arg8 - 19474);
                                        } else {
                                            var56 = -var55.method613() >> 1;
                                        }
                                    }
                                } else if (var11.field5558 == 5) {
                                    int var61 = var11.field5643;
                                    if (var61 >= 0 && var61 < 2048) {
                                        class573 var62 = class513.field7145[var61];
                                        class186 var63 = var11.field5627 == -1 ? null : class423.field5620.method1707(var11.field5627, 98);
                                        if (var62 != null && (class423.field5702 == var61 || class287.method1701(var62.field7791, (byte) -7) == var11.field5551)) {
                                            var55 = var62.field7810.method1862(class423.field5620, var63, class146.field1963, 0, null, 2048, null, var11.field5680, -1, class564.field7696, var11.field5572, class159.field2282, class440.field5847, 0, true, (byte) 76, var11.field5555, class516.field7170, class87.field1058);
                                        }
                                    }
                                } else if (var11.field5558 == 8 || var11.field5558 == 9) {
                                    class16 var65 = class351.method2078(0, false, var11.field5643);
                                    class186 var66 = var11.field5627 == -1 ? null : class423.field5620.method1707(var11.field5627, 98);
                                    if (var65 != null) {
                                        class321 var67 = var11.field5651 ? class408.field5369.field7810 : null;
                                        var55 = var65.method105(var66, var11.field5555, class146.field1963, var11.field5551, 2048, 0, var11.field5680, var11.field5572, var11.field5558 == 9, var67);
                                    }
                                } else if (var11.field5627 == -1) {
                                    var55 = var11.method2400(class146.field1963, 0, null, class408.field5369.field7810, (byte) -77, class87.field1058, -1, class423.field5620, class159.field2282, class564.field7696, -1, 2048, class440.field5847, class516.field7170);
                                    if (var55 == null && class181.field2534) {
                                        class552.method3091(var11, 12618);
                                    }
                                } else {
                                    class186 var64 = class423.field5620.method1707(var11.field5627, 100);
                                    var55 = var11.method2400(class146.field1963, var11.field5680, var64, class408.field5369.field7810, (byte) 15, class87.field1058, var11.field5555, class423.field5620, class159.field2282, class564.field7696, var11.field5572, 2048, class440.field5847, class516.field7170);
                                    if (var55 == null && class181.field2534) {
                                        class552.method3091(var11, 12618);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field5638 > 0) {
                                        var68 = (var11.field5561 << 9) / var11.field5638;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69;
                                    if (var11.field5709 > 0) {
                                        var69 = (var11.field5672 << 9) / var11.field5709;
                                    } else {
                                        var69 = 512;
                                    }
                                    int var70 = var13 + (var11.field5561 / 2);
                                    int var71 = var11.field5672 / 2 + var14;
                                    if (!var11.field5612) {
                                        var70 += var11.field5548 * var68 >> 9;
                                        var71 += var11.field5633 * var69 >> 9;
                                    }
                                    class546.field7466.method352();
                                    class146.field1963.method1123(class546.field7466);
                                    class146.field1963.method1088(var70, var71, var68, var69);
                                    class146.field1963.method1147();
                                    if (var11.field5676) {
                                        class146.field1963.method1091(false);
                                    }
                                    if (var11.field5612) {
                                        class38.field510.method361(var11.field5711);
                                        class38.field510.method349(var11.field5630);
                                        class38.field510.method348(var11.field5648);
                                        class38.field510.method356(var11.field5548, var11.field5633, var11.field5705);
                                    } else {
                                        int var72 = (var11.field5623 << 2) * class240.field3176[var11.field5711 << 3] >> 14;
                                        int var73 = (var11.field5623 << 2) * class240.field3177[var11.field5711 << 3] >> 14;
                                        class38.field510.method354(-var11.field5648 << 3);
                                        class38.field510.method349(var11.field5630 << 3);
                                        class38.field510.method356(var11.field5649 << 2, var72 + (var11.field5699 << 2) + var56, (var11.field5699 << 2) + var73);
                                        class38.field510.method364(var11.field5711 << 3);
                                    }
                                    var11.method2385(class146.field1963, var55, class327.field4404, 16449, class38.field510);
                                    if (class650.field8973) {
                                        class146.field1963.method1077(var13, var14, var11.field5561 + var13, var11.field5672 + var14);
                                    }
                                    if (var11.field5612) {
                                        if (var11.field5714) {
                                            var55.method648(class38.field510, null, var11.field5623, 1);
                                        } else {
                                            var55.method625(class38.field510, null, 1);
                                            if (var11.field5563 != null) {
                                                class146.field1963.method1096(var11.field5563.method2914());
                                            }
                                        }
                                    } else if (var11.field5714) {
                                        var55.method648(class38.field510, null, var11.field5623 << 2, 1);
                                    } else {
                                        var55.method625(class38.field510, null, 1);
                                        if (var11.field5563 != null) {
                                            class146.field1963.method1096(var11.field5563.method2914());
                                        }
                                    }
                                    if (class650.field8973) {
                                        class146.field1963.method1042(arg0, arg7, arg3, arg2);
                                    }
                                    if (var11.field5676) {
                                        class146.field1963.method1091(true);
                                    }
                                }
                            } else if (var11.field5598 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field5669) {
                                    var75 = var13 + var11.field5561;
                                    var74 = var14;
                                    var76 = var13;
                                    var77 = var14 + var11.field5672;
                                } else {
                                    var74 = var11.field5672 + var14;
                                    var75 = var13 + var11.field5561;
                                    var76 = var13;
                                    var77 = var14;
                                }
                                if (var11.field5677 == 1) {
                                    class146.field1963.method1101(var76, var77, var75, var74, var11.field5664, 0);
                                } else {
                                    class146.field1963.method1046(var76, var77, var75, var74, var11.field5664, var11.field5677, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)Z")
    public final boolean method474(boolean arg0) {
        if (arg0) {
            method471(85, (byte) 49, null, 4);
        }
        field1052++;
        if (this.field1049) {
            return true;
        }
        if (this.field1054 == null) {
            try {
                int var2 = class480.field6673 == class180.field2522 ? 80 : class625.field8660.field3769 + 7000;
                this.field1054 = class312.field4206.method2230(true, new URL("http://" + class625.field8660.field3772 + ":" + var2 + "/news.ws?game=" + class508.field7015.field8976));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field1054 == null || this.field1054.field9420 == 2) {
            return true;
        } else if (this.field1054.field9420 == 1) {
            if (this.field1051 == null) {
                this.field1051 = new Thread(this);
                this.field1051.start();
            }
            return this.field1049;
        } else {
            return false;
        }
    }
}
