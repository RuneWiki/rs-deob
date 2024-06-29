import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class363 extends class296 {

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "Lnj;")
    public static class415 field4685 = new class415(29, 8);

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "J")
    public static long field4686;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "Lpe;")
    public static class615 field4688;

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class363(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLcda;IILdg;)V", line = 6)
    public static final void method2076(byte arg0, class534 arg1, int arg2, int arg3, class193 arg4) {
        ++field4689;
        if (~(arg3 & 2048) != -1) {
            arg4.field3017 = arg1.method2394(4);
            if (arg4.field3017.charAt(0) == '~') {
                arg4.field3017 = arg4.field3017.substring(1);
                class495.method2696(-1, 0, arg4.method1274(-1, false), 2, arg4.field2473, arg4.field3017, arg4.method1270((byte) -116, true));
            } else if (class233.field3130 == arg4) {
                class495.method2696(-1, 0, arg4.method1274(-1, false), 2, arg4.field2473, arg4.field3017, arg4.method1270((byte) -116, true));
            }
            arg4.field2967 = 0;
            arg4.field2999 = 150;
            arg4.field2957 = 0;
        }
        byte var5 = -1;
        if (arg0 > -42) {
            method2077((byte) -113, true);
        }
        if (~(131072 & arg3) != -1) {
            arg4.field2978 = arg1.method2387((byte) 104);
            arg4.field2950 = arg1.method2384(32767);
            arg4.field2997 = arg1.method2375(-8643);
            arg4.field3027 = (byte) arg1.method2363(-109);
            arg4.field2948 = class424.field5503 + arg1.method2379((byte) -105);
            arg4.field2989 = class424.field5503 - -arg1.method2379((byte) -103);
        }
        if (~(65536 & arg3) != -1) {
            int var6 = class424.field5503;
            int var7 = arg1.method2400((byte) 36);
            int var8 = arg1.method2396(-116);
            arg4.method1425(var8, var6, false, var7);
        }
        if ((arg3 & 16) != 0) {
            arg4.field2506 = arg1.method2379((byte) -125);
            if (arg4.field3038 == 0) {
                arg4.method1429(arg4.field2506, (byte) -84);
                arg4.field2506 = -1;
            }
        }
        if (~(arg3 & 8) != -1) {
            int var9 = arg1.method2399(true);
            if (var9 == 65535) {
                var9 = -1;
            }
            arg4.field3001 = var9;
        }
        if (~(arg3 & 128) != -1) {
            int var10 = arg1.method2400((byte) 36);
            int var11 = arg1.method2363(126);
            arg4.method1425(var11, class424.field5503, false, var10);
            arg4.field3016 = class424.field5503 + 300;
            arg4.field2996 = arg1.method2396(-128);
        }
        if (~(arg3 & 32) != -1) {
            class324.field4210[arg2] = arg1.method2381(-114);
        }
        if ((arg3 & 32768) != 0) {
            int var12 = arg1.method2413((byte) -113);
            int[] var13 = new int[var12];
            int[] var14 = new int[var12];
            int[] var15 = new int[var12];
            for (int var16 = 0; ~var16 > ~var12; ++var16) {
                int var17 = arg1.method2390((byte) 124);
                if (~var17 == -65536) {
                    var17 = -1;
                }
                var13[var16] = var17;
                var14[var16] = arg1.method2413((byte) -123);
                var15[var16] = arg1.method2399(true);
            }
            class374.method2149(var14, var15, arg4, (byte) 36, var13);
        }
        if (~(8192 & arg3) != -1) {
            int var18 = arg1.method2393(-30727);
            arg4.field3002 = arg1.method2413((byte) -117);
            arg4.field2951 = arg1.method2363(-123);
            arg4.field3005 = 32767 & var18;
            arg4.field2982 = (32768 & var18) != 0;
            arg4.field3012 = arg4.field3005 + arg4.field3002 + class424.field5503;
        }
        if (~(16384 & arg3) != -1) {
            arg4.field3024 = arg1.method2384(32767);
            arg4.field2964 = arg1.method2387((byte) 127);
            arg4.field3013 = arg1.method2381(1);
            arg4.field2959 = arg1.method2381(91);
            arg4.field2973 = arg1.method2390((byte) 94) - -class424.field5503;
            arg4.field3000 = arg1.method2393(-30727) + class424.field5503;
            arg4.field2953 = arg1.method2413((byte) -107);
            if (!arg4.field2512) {
                arg4.field2959 += arg4.field3039[0];
                arg4.field3013 += arg4.field3030[0];
                arg4.field2964 += arg4.field3039[0];
                arg4.field3024 += arg4.field3030[0];
                arg4.field3038 = 1;
            } else {
                arg4.field2964 += arg4.field2514;
                arg4.field3024 += arg4.field2518;
                arg4.field2959 += arg4.field2514;
                arg4.field3013 += arg4.field2518;
                arg4.field3038 = 0;
            }
            arg4.field3037 = 0;
        }
        if ((arg3 & 1) != 0) {
            int[] var19 = new int[4];
            for (int var20 = 0; ~var20 > -5; ++var20) {
                var19[var20] = arg1.method2390((byte) 114);
                if (~var19[var20] == -65536) {
                    var19[var20] = -1;
                }
            }
            int var21 = arg1.method2413((byte) -120);
            class370.method2136(var19, arg4, var21, (byte) 42);
        }
        if (~(1024 & arg3) != -1) {
            int var22 = arg1.method2390((byte) 113);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = arg1.method2406((byte) 40);
            int var24 = arg1.method2413((byte) -121);
            arg4.method1432(1, true, var22, var24, var23);
        }
        if (~(256 & arg3) != -1) {
            var5 = arg1.method2387((byte) 94);
        }
        if (~(4096 & arg3) != -1) {
            arg4.field2500 = arg1.method2363(89) == 1;
        }
        if ((arg3 & 64) != 0) {
            int var25 = arg1.method2390((byte) 107);
            int var26 = arg1.method2402(-1028506808);
            if (~var25 == -65536) {
                var25 = -1;
            }
            int var27 = arg1.method2405((byte) 126);
            arg4.method1432(1, false, var25, var27, var26);
        }
        if (~(4 & arg3) != -1) {
            int var28 = arg1.method2363(-121);
            byte[] var29 = new byte[var28];
            class418 var30 = new class418(var29);
            arg1.method2398(var29, 0, 98, var28);
            class122.field1564[arg2] = var30;
            arg4.method1275(var30, 0);
        }
        if (arg4.field2512) {
            if (~var5 == -128) {
                arg4.method1263(arg4.field2518, (byte) 126, arg4.field2514);
            } else {
                byte var31;
                if (var5 != -1) {
                    var31 = var5;
                } else {
                    var31 = class324.field4210[arg2];
                }
                arg4.method1267(var31, arg4.field2514, -2, arg4.field2518);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(FI)V", line = 272)
    public final void method1308(float arg0, int arg1) {
        ++field4690;
        super.field3873 = arg0;
        if (arg1 < 35) {
            field4685 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BZ)I", line = 285)
    public static final int method2077(byte arg0, boolean arg1) {
        ++field4692;
        if (class220.field2886 == null) {
            return 0;
        } else if (!arg1 && class550.field7145 != null) {
            return class220.field2886.length * 2;
        } else {
            int var2 = 0;
            if (arg0 < 67) {
                return -89;
            } else {
                for (int var3 = 0; class220.field2886.length > var3; ++var3) {
                    int var4 = class220.field2886[var3];
                    if (class284.field3695.method3362(var4, -128)) {
                        ++var2;
                    }
                    if (class169.field2101.method3362(var4, -106)) {
                        ++var2;
                    }
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(III)Z", line = 327)
    public static final boolean method2078(int arg0, int arg1, int arg2) {
        ++field4684;
        boolean var3 = (arg0 & 55) != arg1 ? class688.method3755(arg1 ^ 4218, arg2, arg0) : class314.method1832(arg0, arg2, true);
        return var3 | class216.method1380(arg0, true, arg2) | ~(arg2 & 65536) != -1;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([BILjava/io/File;I)V", line = 339)
    public static final void method2079(byte[] arg0, int arg1, File arg2, int arg3) throws IOException {
        ++field4691;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg0, 0, arg3);
            int var5 = 97 / ((arg1 - -17) / 36);
        } catch (EOFException var6) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BIII)V", line = 358)
    public final void method1309(byte arg0, int arg1, int arg2, int arg3) {
        ++field4687;
        super.field3880 = arg3;
        if (arg0 > 106) {
            super.field3878 = arg1;
            super.field3876 = arg2;
        }
    }

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "(I)V", line = 371)
    public static void method2080(int arg0) {
        field4688 = null;
        if (arg0 == -1) {
            field4685 = null;
        }
    }
}
