import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class249 implements Runnable {

    @OriginalMember(owner = "client!en", name = "h", descriptor = "Lmk;")
    private class154 field3359 = new class154();

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field3354 = new Thread(this);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Lph;")
    public static class114 field3353 = new class114(50);

    @OriginalMember(owner = "client!en", name = "j", descriptor = "[Z")
    public static boolean[] field3361 = new boolean[112];

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public static int field3362 = 0;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3363 = "Allocating memory";

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILjava/lang/String;)Lmn;", line = 8)
    public final class77 method1323(int arg0, String arg1) {
        field3356++;
        if (this.field3354 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class77 var3 = new class77(arg1);
            if (arg0 < 77) {
                method1327(32, 35);
            }
            this.method1326(-113, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILvm;III[BZBI[Lqs;)[I", line = 31)
    public static final int[] method1324(int arg0, class322 arg1, int arg2, int arg3, int arg4, byte[] arg5, boolean arg6, byte arg7, int arg8, class438[] arg9) {
        field3355++;
        if (!arg6) {
            for (int var10 = 0; var10 < 4; var10++) {
                class438 var11 = arg9[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg4 + var12;
                        int var15 = arg0 + var13;
                        if (var14 >= 0 && var14 < class315.field4214 && var15 >= 0 && class340.field4549 > var15) {
                            var11.method2714(var14, var15, -10297);
                        }
                    }
                }
            }
        }
        class250 var16 = new class250(arg5);
        int var17 = arg8 + arg4;
        int var18 = arg0 + arg3;
        for (int var19 = 0; var19 < arg2; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class166.method885(0, var16, 0, arg6, 0, var17 + var55, arg4 + var55, true, var19, var18 + var56, false, arg0 + var56);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        while (var16.field3406.length > var16.field3389) {
            int var22 = var16.method1350(31351);
            if (var22 == 128) {
                class284.field3879[0] = var16.method1374(-2);
                class284.field3879[1] = var16.method1366((byte) 95);
                class284.field3879[2] = var16.method1366((byte) -97);
                class284.field3879[3] = var16.method1366((byte) -128);
                class284.field3879[4] = var16.method1374(-2);
                var20 = true;
            } else {
                if (var22 != 129) {
                    var16.field3389--;
                    break;
                }
                if (class271.field3670 == null) {
                    class271.field3670 = new byte[4][][];
                }
                for (int var40 = 0; var40 < 4; var40++) {
                    byte var41 = var16.method1363((byte) 111);
                    if (var41 == 0 && class271.field3670[var40] != null) {
                        int var42 = arg4;
                        int var43 = arg4 + 64;
                        int var44 = arg0;
                        if (arg4 < 0) {
                            var42 = 0;
                        } else if (arg4 >= class315.field4214) {
                            var42 = class315.field4214;
                        }
                        if (var43 < 0) {
                            var43 = 0;
                        } else if (class315.field4214 <= var43) {
                            var43 = class315.field4214;
                        }
                        int var45 = arg0 + 64;
                        if (arg0 < 0) {
                            var44 = 0;
                        } else if (class340.field4549 <= arg0) {
                            var44 = class340.field4549;
                        }
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 >= class340.field4549) {
                            var45 = class340.field4549;
                        }
                        while (var42 < var43) {
                            while (var45 > var44) {
                                class271.field3670[var40][var42][var44] = 0;
                                var44++;
                            }
                            var42++;
                        }
                    } else if (var41 == 1) {
                        if (class271.field3670[var40] == null) {
                            class271.field3670[var40] = new byte[class315.field4214 + 1][class340.field4549 + 1];
                        }
                        for (int var46 = 0; var46 < 64; var46 += 4) {
                            for (int var47 = 0; var47 < 64; var47 += 4) {
                                byte var48 = var16.method1363((byte) 117);
                                for (int var49 = arg4 + var46; var49 < (var46 + arg4 + 4); var49++) {
                                    for (int var50 = arg0 + var47; var50 < (arg0 + var47 + 4); var50++) {
                                        if (var49 >= 0 && class315.field4214 > var49 && var50 >= 0 && var50 < class340.field4549) {
                                            class271.field3670[var40][var49][var50] = var48;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var41 == 2) {
                        if (class271.field3670[var40] == null) {
                            class271.field3670[var40] = new byte[class315.field4214 + 1][class340.field4549 + 1];
                        }
                        if (var40 > 0) {
                            int var51 = arg4;
                            int var52 = arg4 + 64;
                            int var53 = arg0;
                            if (arg4 < 0) {
                                var51 = 0;
                            } else if (class315.field4214 <= arg4) {
                                var51 = class315.field4214;
                            }
                            if (arg0 < 0) {
                                var53 = 0;
                            } else if (class340.field4549 <= arg0) {
                                var53 = class340.field4549;
                            }
                            int var54 = arg0 + 64;
                            if (var52 < 0) {
                                var52 = 0;
                            } else if (class315.field4214 <= var52) {
                                var52 = class315.field4214;
                            }
                            if (var54 < 0) {
                                var54 = 0;
                            } else if (var54 >= class340.field4549) {
                                var54 = class340.field4549;
                            }
                            while (var52 > var51) {
                                while (var53 < var54) {
                                    class271.field3670[var40][var51][var53] = class271.field3670[var40 - 1][var51][var53];
                                    var53++;
                                }
                                var51++;
                            }
                        }
                    }
                }
                var21 = true;
            }
        }
        if (!arg6) {
            class89 var23 = null;
            while (true) {
                while (var16.field3406.length > var16.field3389) {
                    int var28 = var16.method1350(31351);
                    if (var28 == 0) {
                        var23 = new class89(var16);
                    } else if (var28 == 1) {
                        int var29 = var16.method1350(arg7 + 31350);
                        if (var29 > 0) {
                            for (int var30 = 0; var30 < var29; var30++) {
                                class106 var31 = new class106(var16);
                                if (var31.field1301 == 31) {
                                    class112 var32 = class305.method1796((byte) -58, var16.method1374(-2));
                                    var31.method564(var32.field1393, var32.field1399, 104, var32.field1396, var32.field1404);
                                }
                                var31.field4851 += arg0 << 7;
                                var31.field4853 += arg4 << 7;
                                int var33 = var31.field4853 >> 7;
                                int var34 = var31.field4851 >> 7;
                                if (var33 >= 0 && var34 >= 0 && class315.field4214 > var33 && var34 < class340.field4549) {
                                    var31.field4849 = class432.field6340[var31.field1309][var33][var34] - var31.field4849;
                                    if (arg1.method1590() > 0) {
                                        class376.method2256(var31);
                                    }
                                }
                            }
                        }
                    } else if (var28 == 2) {
                        if (var23 == null) {
                            var23 = new class89();
                        }
                        var23.method491(var16, 48);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var23 != null) {
                    for (int var24 = 0; var24 < 8; var24++) {
                        for (int var25 = 0; var25 < 8; var25++) {
                            int var26 = (arg4 >> 3) + var24;
                            int var27 = (arg0 >> 3) + var25;
                            if (var26 >= 0 && var26 < (class315.field4214 >> 3) && var27 >= 0 && class340.field4549 >> 3 > var27) {
                                class63.method343(var26, var27, var23, true);
                            }
                        }
                    }
                }
                break;
            }
        }
        if (arg7 != 1) {
            field3353 = null;
        }
        if (!var21 && class271.field3670 != null) {
            for (int var35 = 0; var35 < 4; var35++) {
                if (class271.field3670[var35] != null) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        for (int var37 = 0; var37 < 16; var37++) {
                            int var38 = (arg4 >> 2) + var36;
                            int var39 = (arg0 >> 2) + var37;
                            if (var38 >= 0 && var38 < 26 && var39 >= 0 && var39 < 26) {
                                class271.field3670[var35][var38][var39] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class284.field3879;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 470)
    public static void method1325(byte arg0) {
        field3353 = null;
        field3363 = null;
        int var1 = 48 % ((arg0 - 23) / 52);
        field3361 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILgl;)V", line = 482)
    private final void method1326(int arg0, class338 arg1) {
        field3357++;
        class154 var3 = this.field3359;
        synchronized (this.field3359) {
            this.field3359.method825(-70, arg1);
            if (arg0 > -110) {
                field3362 = -100;
            }
            this.field3359.notify();
        }
    }

    @OriginalMember(owner = "client!en", name = "run", descriptor = "()V", line = 502)
    public final void run() {
        field3358++;
        while (true) {
            class154 var1 = this.field3359;
            class77 var3;
            synchronized (this.field3359) {
                class338 var2;
                for (var2 = this.field3359.method815(12256); var2 == null; var2 = this.field3359.method815(12256)) {
                    try {
                        this.field3359.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class77)) {
                    return;
                }
                var3 = (class77) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field873).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field867 = var5;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V", line = 543)
    public static final void method1327(int arg0, int arg1) {
        class340.field4550 = 100;
        class205.field2768 = arg1;
        field3352++;
        if (arg0 == 601892515) {
            class435.field6352 = 3;
            class230.field3169 = -1;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V", line = 562)
    public final void method1328(byte arg0) {
        if (arg0 != 96) {
            this.method1323(-31, (String) null);
        }
        field3364++;
        if (this.field3354 == null) {
            return;
        }
        this.method1326(-125, new class338());
        try {
            this.field3354.join();
        } catch (InterruptedException var2) {
        }
        this.field3354 = null;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V", line = 595)
    public class249() {
        this.field3354.setDaemon(true);
        this.field3354.start();
    }
}
