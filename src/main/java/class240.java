import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class240 extends class431 {

    @OriginalMember(owner = "client!du", name = "l", descriptor = "[I")
    public int[] field3829 = new int[1];

    @OriginalMember(owner = "client!du", name = "r", descriptor = "[I")
    public int[] field3835 = new int[] { -1 };

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public static int field3833 = 0;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "[I")
    public static int[] field3837 = new int[200];

    @OriginalMember(owner = "client!du", name = "m", descriptor = "Lkl;")
    public static class56 field3830 = new class56("WTI", 5);

    @OriginalMember(owner = "client!du", name = "u", descriptor = "[[S")
    public static short[][] field3838 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1651(int arg0, int arg1, int arg2, Class arg3) {
        class138 var4 = client.field3311[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class327 var5 = var4.field2118; var5 != null; var5 = var5.field4922) {
            class389 var6 = var5.field4921;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5836 == arg1 && var6.field5830 == arg2) {
                class216.method1497(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Led;ILsm;IIILya;IZI)Lt;")
    public final class475 method1652(class500 arg0, int arg1, class189 arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7, boolean arg8, int arg9) {
        field3836++;
        class475 var11 = null;
        int var12 = arg9;
        class376 var13 = null;
        if (arg4 != -1) {
            var13 = class138.field2094.method2808(arg4, 18334);
        }
        int[] var14 = this.field3835;
        if (var13 != null && var13.field5671 != null) {
            var14 = new int[var13.field5671.length];
            for (int var15 = 0; var15 < var13.field5671.length; var15++) {
                int var16 = var13.field5671[var15];
                if (var16 >= 0 && this.field3835.length > var16) {
                    var14[var15] = this.field3835[var16];
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
        int var23 = arg1;
        class22 var24 = null;
        class22 var25 = null;
        if (arg2 != null) {
            int var26 = arg2.field3181[arg3];
            var12 = arg9 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class242.field3846.method2239(var27, (byte) -38);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method165(var21, true);
                var17 |= var24.method166(arg1 + 14360, var21);
                var20 |= var24.method164(arg1 ^ 0x100, var21);
                var19 |= arg2.field3195;
            }
            if ((arg2.field3190 || class55.field685) && arg5 != -1 && arg2.field3181.length > arg5) {
                var23 = arg2.field3204[arg3];
                int var28 = arg2.field3181[arg5];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class242.field3846.method2239(var22 >>> 16, (byte) -119);
                }
                if (var25 != null) {
                    var18 |= var25.method165(var22, true);
                    var17 |= var25.method166(14360, var22);
                    var20 |= var25.method164(256, var22);
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
        long var30 = this.method1656(arg8, arg0 == null ? null : arg0.field7182, arg4, arg1 + 255, var14);
        if (class508.field7441 != null) {
            var11 = (class475) class508.field7441.method87(var30, arg1 ^ 0x851340C1);
        }
        if (var11 == null || arg6.method314(var11.method433(), var12) != 0) {
            if (var11 != null) {
                var12 = arg6.method317(var12, var11.method433());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class390.field5847.method467((byte) -101, var14[var34]).method3151(0, arg8)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class374[] var35 = new class374[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class390.field5847.method467((byte) -101, var14[var36]).method3148(0, arg8);
                }
            }
            if (var13 != null && var13.field5667 != null) {
                for (int var37 = 0; var37 < var13.field5667.length; var37++) {
                    if (var13.field5667[var37] != null && var35[var37] != null) {
                        int var38 = var13.field5667[var37][0];
                        int var39 = var13.field5667[var37][1];
                        int var40 = var13.field5667[var37][2];
                        int var41 = var13.field5667[var37][3];
                        int var42 = var13.field5667[var37][4];
                        int var43 = var13.field5667[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2342(var41, var42, var43, (byte) 16);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2352(var38, var40, arg1, var39);
                        }
                    }
                }
            }
            if (arg0 != null) {
                var32 = var12 | 0x4000;
            }
            class374 var44 = new class374(var35, var35.length);
            var11 = arg6.method330(var44, var32, class28.field335, 64, 850);
            if (arg0 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class239.field3824[var45].length > arg0.field7182[var45]) {
                        var11.method436(class18.field230[var45], class239.field3824[var45][arg0.field7182[var45]]);
                    }
                    if (arg0.field7182[var45] < class282.field4289[var45].length) {
                        var11.method436(class309.field4660[var45], class282.field4289[var45][arg0.field7182[var45]]);
                    }
                }
            }
            if (class508.field7441 != null) {
                var11.method435(var12);
                class508.field7441.method84(var30, var11, (byte) 27);
            }
        }
        if (arg2 == null || var24 == null) {
            return var11;
        } else {
            class475 var46 = var11.method449((byte) 1, var12, true);
            var46.method2860(var25, arg7 - 1, 0, (byte) 21, var23, arg2.field3195, var21, var22, var24);
            return var46;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I[Luq;I)V")
    public static final void method1653(int arg0, class114[] arg1, int arg2) {
        field3828++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class114 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1585 == 0) {
                    if (var4.field1660 != null) {
                        method1653(-114, var4.field1660, arg2);
                    }
                    class293 var5 = (class293) class70.field993.method2585((byte) 114, (long) var4.field1644);
                    if (var5 != null) {
                        class129.method944(var5.field4454, 1031, arg2);
                    }
                }
                if (arg2 == 0 && var4.field1616 != null) {
                    class405 var6 = new class405();
                    var6.field6004 = var4;
                    var6.field6008 = var4.field1616;
                    class192.method1356(var6);
                }
                if (arg2 == 1 && var4.field1663 != null) {
                    if (var4.field1630 >= 0) {
                        class114 var7 = class475.method2864(true, var4.field1644);
                        if (var7 == null || var7.field1660 == null || var4.field1630 >= var7.field1660.length || var7.field1660[var4.field1630] != var4) {
                            continue;
                        }
                    }
                    class405 var8 = new class405();
                    var8.field6008 = var4.field1663;
                    var8.field6004 = var4;
                    class192.method1356(var8);
                }
            }
        }
        if (arg0 >= -90) {
            method1654(34, 54, 16, -113);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIII)I")
    public static final int method1654(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -20665) {
            method1653(11, null, -52);
        }
        field3834++;
        if (class172.field2549 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg0 - class7.field106;
        int var7 = arg3 - class7.field103;
        for (class523 var8 = (class523) class7.field89.method1004((byte) -71); var8 != null; var8 = (class523) class7.field89.method996(1)) {
            if (var8.field7645 == arg2) {
                int var9 = var8.field7643;
                int var10 = var8.field7647;
                int var11 = var10 + class7.field103 | class7.field106 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lul;Lul;I)I")
    public static final int method1655(class406 arg0, class406 arg1, int arg2) {
        field3831++;
        int var3 = 121 / ((arg2 - 27) / 46);
        int var4 = 0;
        if (arg1.method2556((byte) 21, class299.field4546)) {
            var4++;
        }
        if (arg1.method2556((byte) 21, class309.field4661)) {
            var4++;
        }
        if (arg1.method2556((byte) 21, class460.field6695)) {
            var4++;
        }
        if (arg0.method2556((byte) 21, class299.field4546)) {
            var4++;
        }
        if (arg0.method2556((byte) 21, class309.field4661)) {
            var4++;
        }
        if (arg0.method2556((byte) 21, class460.field6695)) {
            var4++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z[III[I)J")
    private final long method1656(boolean arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        field3832++;
        long[] var6 = class111.field1546;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg2 >> 8)) & 0xFFL)];
        long var11 = var6[(int) ((long) arg3 & ((long) arg2 ^ var9))] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg4[var13] >> 16)) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg4[var13] >> 8)) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg4[var13]) & 0xFFL)];
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg1[var14]) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg0 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static void method1657(int arg0) {
        if (arg0 == 4626) {
            field3838 = null;
            field3837 = null;
            field3830 = null;
        }
    }
}
