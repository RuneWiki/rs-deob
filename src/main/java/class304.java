import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class304 extends class42 {

    @OriginalMember(owner = "client!st", name = "t", descriptor = "[I")
    public int[] field4510 = new int[1];

    @OriginalMember(owner = "client!st", name = "p", descriptor = "[I")
    public int[] field4506 = new int[] { -1 };

    @OriginalMember(owner = "client!st", name = "u", descriptor = "Z")
    public static volatile boolean field4511 = true;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "F")
    public static float field4505;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!st", name = "v", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIZILkg;IIBLqa;Lgv;)Lka;", line = 4)
    public final class336 method1940(int arg0, int arg1, boolean arg2, int arg3, class183 arg4, int arg5, int arg6, byte arg7, class167 arg8, class58 arg9) {
        field4509++;
        class336 var11 = null;
        int var12 = arg5;
        class236 var13 = null;
        if (arg0 != -1) {
            var13 = class147.field2266.method1253(arg0, -1065652600);
        }
        int[] var14 = this.field4506;
        if (var13 != null && var13.field3523 != null) {
            var14 = new int[var13.field3523.length];
            for (int var15 = 0; var15 < var13.field3523.length; var15++) {
                int var16 = var13.field3523[var15];
                if (var16 >= 0 && this.field4506.length > var16) {
                    var14[var15] = this.field4506[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class543 var24 = null;
        class543 var25 = null;
        if (arg4 != null) {
            int var26 = arg4.field2692[arg6];
            var12 = arg5 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class96.field1526.method2714(var27, (byte) 114);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method3188(var21, -1);
                var17 |= var24.method3184((byte) 116, var21);
                var20 |= var24.method3182(var21, -76);
                var19 |= arg4.field2690;
            }
            if ((arg4.field2703 || class89.field1441) && arg3 != -1 && arg4.field2692.length > arg3) {
                int var28 = arg4.field2692[arg3];
                var23 = arg4.field2713[arg6];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class96.field1526.method2714(var22 >>> 16, (byte) 102);
                }
                if (var25 != null) {
                    var18 |= var25.method3188(var22, -1);
                    var17 |= var25.method3184((byte) 116, var22);
                    var20 |= var25.method3182(var22, 55);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method1941((byte) -90, arg2, var14, arg0, arg9 == null ? null : arg9.field1043);
        if (class126.field1984 != null) {
            var11 = (class336) class126.field1984.method2982(0, var30);
        }
        if (arg7 <= 78) {
            return null;
        }
        if (var11 == null || arg8.method252(var11.method1166(), var12) != 0) {
            if (var11 != null) {
                var12 = arg8.method217(var12, var11.method1166());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class58.field1052.method1646(21708, var14[var34]).method837(arg2, (byte) 119)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class330[] var35 = new class330[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class58.field1052.method1646(21708, var14[var36]).method840(0, arg2);
                }
            }
            if (var13 != null && var13.field3529 != null) {
                for (int var37 = 0; var37 < var13.field3529.length; var37++) {
                    if (var13.field3529[var37] != null && var35[var37] != null) {
                        int var38 = var13.field3529[var37][0];
                        int var39 = var13.field3529[var37][1];
                        int var40 = var13.field3529[var37][2];
                        int var41 = var13.field3529[var37][3];
                        int var42 = var13.field3529[var37][4];
                        int var43 = var13.field3529[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2085(var43, (byte) -50, var41, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2091(var39, var40, -11480, var38);
                        }
                    }
                }
            }
            class330 var44 = new class330(var35, var35.length);
            if (arg9 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg8.method225(var44, var32, class332.field4921, 64, 850);
            if (arg9 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (arg9.field1043[var45] < class117.field1805[var45].length) {
                        var11.method1163(class289.field4275[var45], class117.field1805[var45][arg9.field1043[var45]]);
                    }
                    if (arg9.field1043[var45] < class87.field1414[var45].length) {
                        var11.method1163(class23.field330[var45], class87.field1414[var45][arg9.field1043[var45]]);
                    }
                }
            }
            if (class126.field1984 != null) {
                var11.method1133(var12);
                class126.field1984.method2981(var11, 116, var30);
            }
        }
        if (arg4 == null || var24 == null) {
            return var11;
        } else {
            class336 var46 = var11.method1154((byte) 1, var12, true);
            var46.method2131(var22, (byte) -98, 0, var23, arg1 - 1, var24, arg4.field2690, var25, var21);
            return var46;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BZ[II[I)J", line = 244)
    private final long method1941(byte arg0, boolean arg1, int[] arg2, int arg3, int[] arg4) {
        field4512++;
        long[] var6 = class539.field7928;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)];
        long var11 = var6[(int) (((long) arg3 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg2[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg2[var13] >> 16)) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg2[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg2[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg0 > -69) {
            method1942(-49, null, null, -91, -6, -119, (byte) 28);
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg4[var14]) & 0xFFL)];
            }
        }
        return var6[(int) (((long) (arg1 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILl;Lqa;IIIB)V", line = 289)
    public static final void method1942(int arg0, class16 arg1, class167 arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (class421.field5973 < 100) {
            class33.method214(arg2, arg1, (byte) -9);
        }
        field4507++;
        arg2.method345(arg4, arg5, arg0 + arg4, arg3 + arg5);
        if (class421.field5973 < 100) {
            byte var7 = 20;
            int var8 = arg4 + (arg0 / 2);
            int var9 = arg3 / 2 + (arg5 - 18) - var7;
            arg2.method215(arg4, arg5, arg0, arg3, -16777216, 0);
            arg2.method327(var8 - 152, var9, 304, 34, class276.field4118[class275.field4114].getRGB(), 0);
            arg2.method215(var8 - 150, var9 + 2, class421.field5973 * 3, 30, class28.field392[class275.field4114].getRGB(), 0);
            class270.field4072.method1746(false, class83.field1318[class275.field4114].getRGB(), var8, var7 + var9, class451.field6591.method426(class503.field7255, 102), -1);
            return;
        }
        int var10 = class70.field1149 - ((int) ((float) arg0 / class382.field5457));
        int var11 = class388.field5514 + ((int) ((float) arg3 / class382.field5457));
        int var12 = (int) ((float) arg0 / class382.field5457) + class70.field1149;
        class298.field4453 = (int) ((float) (arg3 * 2) / class382.field5457);
        class45.field886 = class388.field5514 - ((int) ((float) arg3 / class382.field5457));
        if (arg6 <= 66) {
            return;
        }
        int var13 = class388.field5514 - ((int) ((float) arg3 / class382.field5457));
        class14.field164 = class70.field1149 - ((int) ((float) arg0 / class382.field5457));
        class446.field6369 = (int) ((float) (arg0 * 2) / class382.field5457);
        class382.method2331(class382.field5467 + var10, class382.field5469 + var11, class382.field5467 + var12, var13 - -class382.field5469, arg4, arg5, arg0 + arg4, arg5 - -arg3 - -1);
        class382.method2336(arg2);
        class118 var14 = class382.method2318(arg2);
        class415.method2483(arg2, 0, var14, 114, 0);
        if (class288.field4266 > 0) {
            class446.field6368--;
            if (class446.field6368 == 0) {
                class288.field4266--;
                class446.field6368 = 20;
            }
        }
        if (!class350.field5134) {
            return;
        }
        int var15 = arg0 + arg4 - 5;
        int var16 = arg5 + arg3 - 8;
        class406.field5775.method1733("Fps:" + class264.field3984, -1, (byte) 114, var16, 16776960, var15);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class406.field5775.method1733("Mem:" + var18 + "k", -1, (byte) 114, var20, var19, var15);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)Lbl;", line = 374)
    public static final class468 method1943(int arg0, int arg1, int arg2) {
        class188 var3 = class461.field6675[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2751;
    }
}
