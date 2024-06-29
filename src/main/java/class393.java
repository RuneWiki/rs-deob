import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class393 {

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field6011;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Ljava/io/File;")
    private File field6013;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "J")
    private long field6015;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "J")
    private long field6014;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "Lie;")
    public static class6 field6020;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "[I")
    public static int[] field6021;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method2527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field6009++;
        int var7 = class88.field1018;
        int[] var8 = class457.field6839;
        class224.field3166 = 0;
        int var9 = 0;
        if (arg6) {
            field6021 = null;
        }
        while ((class387.field5958 + var7) > var9) {
            label431: {
                class566 var32 = null;
                class191 var33;
                if (var7 <= var9) {
                    var33 = ((class411) class42.field456.method524((byte) 85, (long) class362.field5141[var9 - var7])).field6254;
                    var32 = ((class78) var33).field864;
                    if (var32.field8121 != null) {
                        var32 = var32.method3287(112, class23.field243);
                        if (var32 == null) {
                            break label431;
                        }
                    }
                } else {
                    var33 = class142.field1749[var8[var9]];
                }
                if (var33.field2511 >= 0 && (class23.field246 == var33.field2506 || class439.field6548.field1757 == var33.field1757)) {
                    class511.method3039(arg1 >> 1, (byte) 125, var33.method507(22), arg5, var33, arg2, arg3 >> 1);
                    if (class547.field7831[0] >= 0) {
                        if (var33.field2445 != null && (var9 >= var7 || class176.field2147 == 0 || class176.field2147 == 3 || class176.field2147 == 1 && class256.method1712(108, ((class655) var33).field9452)) && class594.field8674 > class224.field3166) {
                            class594.field8675[class224.field3166] = class281.field3921.method2554(var33.field2445, (byte) 0) / 2;
                            class594.field8672[class224.field3166] = class547.field7831[0];
                            class594.field8682[class224.field3166] = class547.field7831[1];
                            class594.field8677[class224.field3166] = var33.field2423;
                            class594.field8679[class224.field3166] = var33.field2447;
                            class594.field8681[class224.field3166] = var33.field2474;
                            class594.field8683[class224.field3166] = var33.field2445;
                            class224.field3166++;
                        }
                        int var34 = class547.field7831[1] + arg4;
                        int var45;
                        if (var33.field2448 || class287.field3982 >= var33.field2457) {
                            var45 = var34 - Math.max(class281.field3921.field6073, class98.field1156[0].method1576());
                        } else {
                            boolean var35 = true;
                            byte var36 = 1;
                            int var38;
                            if (var9 < var7) {
                                class655 var37 = class142.field1749[var8[var9]];
                                var38 = var33.method1158((byte) -127).field1882;
                                if (var37.field9476) {
                                    var36 = 2;
                                }
                            } else {
                                var38 = var32.field8094;
                                if (var38 == -1) {
                                    var38 = var33.method1158((byte) -126).field1882;
                                }
                            }
                            class433[] var39 = class98.field1156;
                            if (var38 != -1) {
                                class433[] var40 = (class433[]) class289.field3992.method1801(0, (long) var38);
                                if (var40 == null) {
                                    class372[] var41 = class372.method2393(class319.field4621, var38, 0);
                                    if (var41 != null) {
                                        var40 = new class433[var41.length];
                                        for (int var42 = 0; var42 < var41.length; var42++) {
                                            var40[var42] = class413.field6264.method388(var41[var42], true);
                                        }
                                        class289.field3992.method1808((long) var38, var40, (byte) -90);
                                    }
                                }
                                if (var40 != null && var40.length >= 2) {
                                    var39 = var40;
                                }
                            }
                            if (var39.length <= var36) {
                                var36 = 1;
                            }
                            class433 var43 = var39[0];
                            class433 var44 = var39[var36];
                            var45 = var34 - Math.max(class281.field3921.field6073, var43.method1576());
                            int var46 = arg0 - ((var43.method1570() >> 1) - class547.field7831[0]);
                            int var47 = var43.method1570() * var33.field2493 / 255;
                            if (var33.field2493 > 0 && var47 < 2) {
                                var47 = 2;
                            }
                            var43.method2706(var46, var45);
                            class413.field6264.method333(var46, var45, var46 + var47, var45 - -var43.method1576());
                            var44.method2706(var46, var45);
                            class413.field6264.method368(arg0, arg4, arg0 + arg1, arg3 + arg4);
                        }
                        var45 -= 2;
                        if (!var33.field2448) {
                            if (class287.field3982 < var33.field2438) {
                                class433 var48 = class206.field2768[var33.field2431 ? 2 : 0];
                                class433 var49 = class206.field2768[var33.field2431 ? 3 : 1];
                                boolean var50 = true;
                                int var51;
                                if (var33 instanceof class78) {
                                    var51 = var32.field8106;
                                    if (var51 == -1) {
                                        var51 = var33.method1158((byte) -126).field1911;
                                    }
                                } else {
                                    var51 = var33.method1158((byte) -127).field1911;
                                }
                                if (var51 != -1) {
                                    class433[] var52 = (class433[]) class613.field8910.method1801(0, (long) var51);
                                    if (var52 == null) {
                                        class372[] var53 = class372.method2393(class319.field4621, var51, 0);
                                        if (var53 != null) {
                                            var52 = new class433[var53.length];
                                            for (int var54 = 0; var54 < var53.length; var54++) {
                                                var52[var54] = class413.field6264.method388(var53[var54], true);
                                            }
                                            class613.field8910.method1808((long) var51, var52, (byte) -11);
                                        }
                                    }
                                    if (var52 != null && var52.length == 4) {
                                        var48 = var52[var33.field2431 ? 2 : 0];
                                        var49 = var52[var33.field2431 ? 3 : 1];
                                    }
                                }
                                int var55 = var33.field2438 - class287.field3982;
                                int var58;
                                if (var55 > var33.field2484) {
                                    int var56 = var55 - var33.field2484;
                                    int var57 = var33.field2480 == 0 ? 0 : (var33.field2500 - var56) / var33.field2480 * var33.field2480;
                                    var58 = var57 * var48.method1570() / var33.field2500;
                                } else {
                                    var58 = var48.method1570();
                                }
                                int var59 = var48.method1576();
                                var45 -= var59;
                                int var60 = class547.field7831[0] + arg0 - (var48.method1570() >> 1);
                                var48.method2706(var60, var45);
                                class413.field6264.method333(var60, var45, var58 + var60, var45 + var59);
                                var49.method2706(var60, var45);
                                var45 -= 2;
                                class413.field6264.method368(arg0, arg4, arg0 + arg1, arg3 + arg4);
                            }
                            if (var9 < var7) {
                                class655 var62 = (class655) var33;
                                if (var62.field9432 != -1) {
                                    var45 -= 25;
                                    class595.field8693[var62.field9432].method2706(arg0 - (12 - class547.field7831[0]), var45);
                                    var45 -= 2;
                                }
                                if (var62.field9465 != -1) {
                                    var45 -= 25;
                                    class349.field4999[var62.field9465].method2706(arg0 - (12 - class547.field7831[0]), var45);
                                    var45 -= 2;
                                }
                            } else if (var32.field8069 >= 0 && var32.field8069 < class349.field4999.length) {
                                class433 var61 = class349.field4999[var32.field8069];
                                var45 -= 25;
                                var61.method2706(class547.field7831[0] + arg0 - (var61.method1570() >> 1), var45);
                                var45 -= 2;
                            }
                        }
                        int var10000;
                        if (!(var33 instanceof class655)) {
                            int var63 = 0;
                            class360[] var64 = class13.field117;
                            for (int var65 = 0; var65 < var64.length; var65++) {
                                class360 var67 = var64[var65];
                                if (var67 != null && var67.field5102 == 1 && class362.field5141[var9 - var7] == var67.field5105) {
                                    class433 var68 = class633.field9109[var67.field5107];
                                    if (var63 < var68.method1576()) {
                                        var63 = var68.method1576();
                                    }
                                    if ((class287.field3982 % 20) < 10) {
                                        var68.method2706(class547.field7831[0] + arg0 - 12, var45 + -var68.method1576());
                                    }
                                }
                            }
                            if (var63 > 0) {
                                var10000 = var45 - (var63 + 2);
                            }
                        } else if (var9 >= 0) {
                            int var69 = 0;
                            class360[] var70 = class13.field117;
                            for (int var71 = 0; var71 < var70.length; var71++) {
                                class360 var73 = var70[var71];
                                if (var73 != null && var73.field5102 == 10 && var8[var9] == var73.field5105) {
                                    class433 var74 = class633.field9109[var73.field5107];
                                    if (var69 < var74.method1576()) {
                                        var69 = var74.method1576();
                                    }
                                    var74.method2706(class547.field7831[0] + arg0 - 12, var45 - var74.method1576());
                                }
                            }
                            if (var69 > 0) {
                                var10000 = var45 - (var69 + 2);
                            }
                        }
                        for (int var75 = 0; var75 < 4; var75++) {
                            if (class287.field3982 < var33.field2453[var75]) {
                                int var76 = var33.method507(21) / 2;
                                class511.method3039(arg1 >> 1, (byte) 110, var76, arg5, var33, arg2, arg3 >> 1);
                                if (class547.field7831[0] > -1) {
                                    int var77 = class485.field7097[var33.field2496[var75]].method1570();
                                    if (var75 == 1) {
                                        class547.field7831[1] -= 20;
                                    }
                                    if (var75 == 2) {
                                        class547.field7831[0] -= var77 - 9;
                                        class547.field7831[1] -= 10;
                                    }
                                    if (var75 == 3) {
                                        class547.field7831[0] += var77 - 9;
                                        class547.field7831[1] -= 10;
                                    }
                                    class485.field7097[var33.field2496[var75]].method2706(arg0 + class547.field7831[0] - (var77 >> 1), arg4 + -12 - -class547.field7831[1]);
                                    class280.field3903.method1031(-1, arg4 + class547.field7831[1] + 3, Integer.toString(var33.field2419[var75]), 0, 26404, arg0 + class547.field7831[0] - 1);
                                }
                            }
                        }
                    }
                }
            }
            var9++;
        }
        for (int var10 = 0; var10 < class646.field9357; var10++) {
            int var28 = class574.field8288[var10];
            class191 var29;
            if (var28 < 2048) {
                var29 = class142.field1749[var28];
            } else {
                var29 = ((class411) class42.field456.method524((byte) 116, (long) (var28 - 2048))).field6254;
            }
            int var30 = class110.field1352[var10];
            class191 var31;
            if (var30 < 2048) {
                var31 = class142.field1749[var30];
            } else {
                var31 = ((class411) class42.field456.method524((byte) 126, (long) (var30 - 2048))).field6254;
            }
            class543.method3154(var31, arg4, arg3, arg0, var29, (byte) 102, arg5, --var29.field2436, arg2, arg1);
        }
        int var11 = class281.field3921.field6077 + class281.field3921.field6073 + 2;
        for (int var12 = 0; var12 < class224.field3166; var12++) {
            int var13 = class594.field8672[var12];
            int var14 = class594.field8682[var12];
            int var15 = class594.field8675[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (class594.field8682[var27] - var11 < var14 + 2 && (class594.field8682[var27] + 2) > (var14 - var11) && class594.field8672[var27] + class594.field8675[var27] > -var15 + var13 && class594.field8672[var27] - class594.field8675[var27] < var13 + var15 && class594.field8682[var27] - var11 < var14) {
                        var16 = true;
                        var14 = class594.field8682[var27] - var11;
                    }
                }
            }
            class594.field8682[var12] = var14;
            String var17 = class594.field8683[var12];
            if (class270.field3791 == 0) {
                int var18 = 16776960;
                if (class594.field8677[var12] < 6) {
                    var18 = class429.field6364[class594.field8677[var12]];
                }
                if (class594.field8677[var12] == 6) {
                    var18 = (class23.field246 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class594.field8677[var12] == 7) {
                    var18 = class23.field246 % 20 >= 10 ? 65535 : 255;
                }
                if (class594.field8677[var12] == 8) {
                    var18 = (class23.field246 % 20) < 10 ? 45056 : 8454016;
                }
                if (class594.field8677[var12] == 9) {
                    int var19 = 150 - class594.field8681[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - ((var19 - 50) * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class594.field8677[var12] == 10) {
                    int var20 = 150 - class594.field8681[var12];
                    if (var20 < 50) {
                        var18 = (var20 * 5) + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 + 255 - ((var20 - 100) * 5) - 32768000;
                    }
                }
                if (class594.field8677[var12] == 11) {
                    int var21 = 150 - class594.field8681[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class594.field8679[var12] == 0) {
                    class472.field6992.method1031(var22, arg4 + var14, var17, -16777216, 26404, arg0 + var13);
                }
                if (class594.field8679[var12] == 1) {
                    class472.field6992.method1034(class23.field246, -100, var17, var22, -16777216, arg0 + var13, arg4 + var14);
                }
                if (class594.field8679[var12] == 2) {
                    class472.field6992.method1030(class23.field246, var17, arg0 + var13, arg4 - -var14, var22, arg6, -16777216);
                }
                if (class594.field8679[var12] == 3) {
                    class472.field6992.method1036(-1, class23.field246, arg0 + var13, -class594.field8681[var12] + 150, -16777216, arg4 + var14, var17, var22);
                }
                if (class594.field8679[var12] == 4) {
                    int var23 = (150 - class594.field8681[var12]) * (class281.field3921.method2554(var17, (byte) 0) + 100) / 150;
                    class413.field6264.method333(arg0 + var13 - 50, arg4, arg0 + var13 + 50, arg4 - -arg3);
                    class472.field6992.method1046(-8500, arg4 + var14, var17, var22, -16777216, arg0 - (var23 - var13 - 50));
                    class413.field6264.method368(arg0, arg4, arg0 + arg1, arg4 - -arg3);
                }
                if (class594.field8679[var12] == 5) {
                    int var24 = 150 - class594.field8681[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class281.field3921.field6077 + class281.field3921.field6073;
                    class413.field6264.method333(arg0, arg4 + var14 - var26 - 1, arg0 + arg1, arg4 + var14 + 5);
                    class472.field6992.method1031(var22, var14 + var25 + arg4, var17, -16777216, 26404, arg0 + var13);
                    class413.field6264.method368(arg0, arg4, arg0 + arg1, arg3 + arg4);
                }
            } else {
                class472.field6992.method1031(-256, arg4 + var14, var17, -16777216, 26404, arg0 + var13);
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
    public final void method2528(byte arg0) throws IOException {
        if (arg0 < 87) {
            field6020 = null;
        }
        if (this.field6011 != null) {
            this.field6011.close();
            this.field6011 = null;
        }
        field6012++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[BIZ)V")
    public final void method2529(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        field6018++;
        if (this.field6015 < ((long) arg0 + this.field6014)) {
            this.field6011.seek(this.field6015);
            this.field6011.write(1);
            throw new EOFException();
        }
        this.field6011.write(arg1, arg2, arg0);
        this.field6014 += arg0;
        if (!arg3) {
            this.method2530(true);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method2530(boolean arg0) {
        if (arg0) {
            this.method2530(true);
        }
        field6010++;
        return this.field6013;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[BII)I")
    public final int method2531(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6008++;
        if (arg2 != -14263) {
            field6020 = null;
        }
        int var5 = this.field6011.read(arg1, arg0, arg3);
        if (var5 > 0) {
            this.field6014 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IJ)V")
    public final void method2532(int arg0, long arg1) throws IOException {
        if (arg0 > -56) {
            this.field6013 = null;
        }
        field6019++;
        this.field6011.seek(arg1);
        this.field6014 = arg1;
    }

    @OriginalMember(owner = "client!wr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6016++;
        if (this.field6011 != null) {
            System.out.println("Warning! fileondisk " + this.field6013 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2528((byte) 105);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)J")
    public final long method2533(byte arg0) throws IOException {
        field6017++;
        return arg0 < 5 ? -63L : this.field6011.length();
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class393(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field6011 = new RandomAccessFile(arg0, arg1);
        this.field6013 = arg0;
        this.field6015 = arg2;
        this.field6014 = 0L;
        int var5 = this.field6011.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field6011.seek(0L);
            this.field6011.write(var5);
        }
        this.field6011.seek(0L);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method2534(int arg0) {
        field6021 = null;
        if (arg0 < -102) {
            field6020 = null;
        }
    }
}
