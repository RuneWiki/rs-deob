import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class380 extends class626 {

    @OriginalMember(owner = "client!es", name = "i", descriptor = "[I")
    public int[] field5295 = new int[] { -1 };

    @OriginalMember(owner = "client!es", name = "l", descriptor = "[I")
    public int[] field5298 = new int[1];

    @OriginalMember(owner = "client!es", name = "h", descriptor = "Lmp;")
    public static class758 field5294 = new class758(8);

    @OriginalMember(owner = "client!es", name = "o", descriptor = "Lqaa;")
    public static class27 field5301 = new class27(71, 8);

    @OriginalMember(owner = "client!es", name = "q", descriptor = "[B")
    public static byte[] field5303 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BZ[II[I)J", line = 3)
    private final long method2378(byte arg0, boolean arg1, int[] arg2, int arg3, int[] arg4) {
        field5302++;
        long[] var6 = class674.field9468;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg3 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg2[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) ((var17 ^ (long) (arg2[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg2[var13] >> 8)) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg2[var13] ^ var21) & 0xFFL)];
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg4[var14]) & 0xFFL)];
            }
        }
        long var15 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
        return arg0 == -112 ? var15 : 37L;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILha;Lnt;BI)V", line = 47)
    public static final void method2379(int arg0, class58 arg1, class220 arg2, byte arg3, int arg4) {
        field5297++;
        class353.field4969.method1530((byte) 89);
        if (class698.field9814) {
            return;
        }
        for (class541 var5 = (class541) arg2.method1522(true); var5 != null; var5 = (class541) arg2.method1527((byte) 55)) {
            class524 var6 = class542.field7614.method2641(var5.field7608, 117);
            if (class612.method3524((byte) 112, var6)) {
                boolean var7 = class537.method3148(arg0, arg4, Integer.MAX_VALUE, var6, arg1, var5);
                if (var7) {
                    class414.method2518(var6, 83, arg1, var5);
                }
            }
        }
        if (arg3 > -46) {
            field5301 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V", line = 84)
    public static void method2380(boolean arg0) {
        if (!arg0) {
            field5301 = null;
            field5294 = null;
            field5303 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZIILha;Lin;ILhn;I)Lka;", line = 116)
    public final class469 method2381(int arg0, int arg1, boolean arg2, int arg3, int arg4, class58 arg5, class90 arg6, int arg7, class718 arg8, int arg9) {
        field5299++;
        class469 var11 = null;
        if (arg0 != -241) {
            return null;
        }
        int var12 = arg7;
        class500 var13 = null;
        if (arg4 != -1) {
            var13 = class675.field9475.method1251(arg4, -104);
        }
        int[] var14 = this.field5295;
        if (var13 != null && var13.field7122 != null) {
            var14 = new int[var13.field7122.length];
            for (int var15 = 0; var15 < var13.field7122.length; var15++) {
                int var16 = var13.field7122[var15];
                if (var16 >= 0 && this.field5295.length > var16) {
                    var14[var15] = this.field5295[var16];
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
        class755 var24 = null;
        class755 var25 = null;
        if (arg8 != null) {
            int var26 = arg8.field10053[arg3];
            var12 = arg7 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class698.field9806.method856(var27, 2);
            if (var24 != null) {
                var18 |= var24.method4192(100, var21);
                var17 |= var24.method4195(-27751, var21);
                var20 |= var24.method4194(8243, var21);
                var19 |= arg8.field10040;
            }
            if ((arg8.field10069 || class712.field9957) && arg9 != -1 && arg9 < arg8.field10053.length) {
                int var28 = arg8.field10053[arg9];
                var23 = arg8.field10048[arg3];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class698.field9806.method856(var22 >>> 16, arg0 + 243);
                }
                if (var25 != null) {
                    var18 |= var25.method4192(100, var22);
                    var17 |= var25.method4195(-27751, var22);
                    var20 |= var25.method4194(8243, var22);
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
        long var30 = this.method2378((byte) -112, arg2, var14, arg4, arg6 == null ? null : arg6.field1596);
        if (class2.field16 != null) {
            var11 = (class469) class2.field16.method3054((byte) -124, var30);
        }
        if (var11 == null || arg5.method611(var11.method361(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method614(var12, var11.method361());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class558.field7942.method721(-116, var14[var34]).method1731(-61, arg2)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class729[] var35 = new class729[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class558.field7942.method721(arg0 + 345, var14[var36]).method1724((byte) -49, arg2);
                }
            }
            if (var13 != null && var13.field7113 != null) {
                for (int var37 = 0; var37 < var13.field7113.length; var37++) {
                    if (var13.field7113[var37] != null && var35[var37] != null) {
                        int var38 = var13.field7113[var37][0];
                        int var39 = var13.field7113[var37][1];
                        int var40 = var13.field7113[var37][2];
                        int var41 = var13.field7113[var37][3];
                        int var42 = var13.field7113[var37][4];
                        int var43 = var13.field7113[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method4057(var43, var41, 317187278, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method4056(arg0 ^ 0xCE, var40, var39, var38);
                        }
                    }
                }
            }
            class729 var44 = new class729(var35, var35.length);
            if (arg6 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg5.method646(var44, var32, class16.field222, 64, 850);
            if (arg6 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class487.field6892.length; var46++) {
                        if (class487.field6892[var46][var45].length > arg6.field1596[var45]) {
                            var11.method359(class681.field9588[var46][var45], class487.field6892[var46][var45][arg6.field1596[var45]]);
                        }
                    }
                }
            }
            if (class2.field16 != null) {
                var11.method347(var12);
                class2.field16.method3047(false, var11, var30);
            }
        }
        if (arg8 == null || var24 == null) {
            return var11;
        } else {
            class469 var47 = var11.method325((byte) 1, var12, true);
            var47.method2844(arg8.field10040, var24, var21, 0, var22, 8985, arg1 - 1, var25, var23);
            return var47;
        }
    }
}
