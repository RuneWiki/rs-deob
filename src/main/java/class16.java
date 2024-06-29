import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class16 extends class45 {

    @OriginalMember(owner = "client!tda", name = "k", descriptor = "[I")
    public int[] field212 = new int[1];

    @OriginalMember(owner = "client!tda", name = "l", descriptor = "[I")
    public int[] field213 = new int[] { -1 };

    @OriginalMember(owner = "client!tda", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field216 = new String[100];

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "[I")
    public static int[] field218 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!tda", name = "m", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!tda", name = "n", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!tda", name = "p", descriptor = "Llfa;")
    public static class51 field217;

    @OriginalMember(owner = "client!tda", name = "j", descriptor = "Z")
    public static boolean field211;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "([IIZB[I)J")
    private final long method103(int[] arg0, int arg1, boolean arg2, byte arg3, int[] arg4) {
        field214++;
        if (arg3 > -21) {
            field217 = null;
        }
        long[] var6 = class702.field9873;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg1 >> 8) ^ var7) & 0xFFL)];
        long var11 = var6[(int) (((long) arg1 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg4[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) (((long) arg4[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg2 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V")
    public static void method104(byte arg0) {
        field216 = null;
        field217 = null;
        field218 = null;
        if (arg0 != -105) {
            field216 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lhca;ILr;IIIIIZLbl;)Lda;")
    public final class470 method105(class186 arg0, int arg1, class562 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class321 arg9) {
        field215++;
        class470 var11 = null;
        int var12 = arg4;
        class266 var13 = null;
        if (arg3 != -1) {
            var13 = class159.field2282.method3595(arg3, 90);
        }
        int[] var14 = this.field213;
        if (var13 != null && var13.field3468 != null) {
            var14 = new int[var13.field3468.length];
            for (int var15 = 0; var15 < var13.field3468.length; var15++) {
                int var16 = var13.field3468[var15];
                if (var16 >= 0 && this.field213.length > var16) {
                    var14[var15] = this.field213[var16];
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
        int var23 = arg5;
        class493 var24 = null;
        class493 var25 = null;
        if (arg0 != null) {
            int var26 = arg0.field2570[arg7];
            var12 = arg4 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class423.field5620.method1704(100, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method2812(var21, -126);
                var17 |= var24.method2815(-30011, var21);
                var20 |= var24.method2813(var21, false);
                var19 |= arg0.field2591;
            }
            if ((arg0.field2585 || class654.field9307) && arg1 != -1 && arg0.field2570.length > arg1) {
                var23 = arg0.field2595[arg7];
                int var28 = arg0.field2570[arg1];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class423.field5620.method1704(100, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method2812(var22, -94);
                    var17 |= var25.method2815(-30011, var22);
                    var20 |= var25.method2813(var22, false);
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
        long var30 = this.method103(arg9 == null ? null : arg9.field4295, arg3, arg8, (byte) -121, var14);
        if (class496.field6835 != null) {
            var11 = (class470) class496.field6835.method2176(arg5 - 127, var30);
        }
        if (var11 == null || arg2.method1053(var11.method604(), var12) != 0) {
            if (var11 != null) {
                var12 = arg2.method1080(var12, var11.method604());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class87.field1058.method1394(-66, var14[var34]).method3234(arg8, (byte) -88)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class250[] var35 = new class250[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class87.field1058.method1394(-85, var14[var36]).method3230(arg8, arg5 + 22886);
                }
            }
            if (var13 != null && var13.field3445 != null) {
                for (int var37 = 0; var37 < var13.field3445.length; var37++) {
                    if (var13.field3445[var37] != null && var35[var37] != null) {
                        int var38 = var13.field3445[var37][0];
                        int var39 = var13.field3445[var37][1];
                        int var40 = var13.field3445[var37][2];
                        int var41 = var13.field3445[var37][3];
                        int var42 = var13.field3445[var37][4];
                        int var43 = var13.field3445[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1523((byte) -119, var42, var43, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1511(var39, true, var40, var38);
                        }
                    }
                }
            }
            class250 var44 = new class250(var35, var35.length);
            if (arg9 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg2.method1089(var44, var32, class109.field1287, 64, 850);
            if (arg9 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class64.field806.length; var46++) {
                        if (class64.field806[var46][var45].length > arg9.field4295[var45]) {
                            var11.method638(class119.field1523[var46][var45], class64.field806[var46][var45][arg9.field4295[var45]]);
                        }
                    }
                }
            }
            if (class496.field6835 != null) {
                var11.method602(var12);
                class496.field6835.method2174(var11, var30, (byte) 8);
            }
        }
        if (arg0 == null || var24 == null) {
            return var11;
        } else {
            class470 var47 = var11.method649((byte) 1, var12, true);
            var47.method2714(arg0.field2591, -12224, arg6 - 1, var21, 0, var25, var24, var22, var23);
            return var47;
        }
    }
}
