import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class304 extends class390 {

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "[I")
    public int[] field4198 = new int[] { -1 };

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[I")
    public int[] field4194 = new int[1];

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field4190 = 0;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lbj;")
    public static class131 field4200 = new class131(64);

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "[I")
    public static int[] field4203 = new int[2];

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "F")
    public static float field4196;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4191;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "[I")
    public static int[] field4195;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "[Z")
    public static boolean[] field4201;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 4)
    public static void method1959(int arg0) {
        field4191 = null;
        if (arg0 != -431360888) {
            method1963(61);
        }
        field4203 = null;
        field4200 = null;
        field4195 = null;
        field4201 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[IZ[II)J", line = 25)
    private final long method1960(int arg0, int[] arg1, boolean arg2, int[] arg3, int arg4) {
        field4192++;
        long[] var6 = class343.field4679;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg0 >> 8) ^ var7) & 0xFFL)];
        long var11 = var6[(int) (((long) arg0 ^ var9) & (long) arg4)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)];
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)];
        }
        if (arg3 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg3[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg2 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lms;I)Lms;", line = 69)
    public static final class453 method1961(class453 arg0, int arg1) {
        field4193++;
        if (arg0.field6470 != -1) {
            return class442.method2767(arg0.field6470, -1229996208);
        }
        int var2 = arg0.field6314 >>> 16;
        class264 var3 = new class264(class454.field6477);
        if (arg1 != -2115346128) {
            method1963(104);
        }
        for (class26 var4 = (class26) var3.method1727(0); var4 != null; var4 = (class26) var3.method1725(arg1 + 2115346019)) {
            if (var4.field463 == var2) {
                return class442.method2767((int) var4.field5600, -1229996208);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILnj;Ljm;IIIIZLuo;I)Lmj;", line = 108)
    public final class394 method1962(int arg0, class133 arg1, class411 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class345 arg8, int arg9) {
        field4197++;
        class394 var11 = null;
        int var12 = arg5;
        class428 var13 = null;
        if (arg9 != -1) {
            var13 = class155.method1041((byte) -72, arg9);
        }
        int[] var14 = this.field4198;
        if (var13 != null && var13.field6022 != null) {
            var14 = new int[var13.field6022.length];
            for (int var15 = 0; var15 < var13.field6022.length; var15++) {
                int var16 = var13.field6022[var15];
                if (var16 >= 0 && var16 < this.field4198.length) {
                    var14[var15] = this.field4198[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        if (arg0 > -107) {
            method1961((class453) null, 90);
        }
        class386 var23 = null;
        class386 var24 = null;
        if (arg2 != null) {
            int var25 = arg2.field5824[arg3];
            var12 = arg5 | 0x20;
            int var26 = var25 >>> 16;
            var20 = var25 & 0xFFFF;
            var23 = class171.method1127(var26, false);
            if (var23 != null) {
                var18 |= var23.method2444(var20, -92);
                var17 |= var23.method2443(var20, (byte) -109);
                var19 |= arg2.field5829;
            }
            if ((arg2.field5838 || class40.field589) && arg6 != -1 && arg6 < arg2.field5824.length) {
                var22 = arg2.field5819[arg3];
                int var27 = arg2.field5824[arg6];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class171.method1127(var21 >>> 16, false);
                }
                if (var24 != null) {
                    var18 |= var24.method2444(var21, 101);
                    var17 |= var24.method2443(var21, (byte) -109);
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
        }
        long var29 = this.method1960(arg9, var14, arg7, arg1 == null ? null : arg1.field1893, 255);
        if (class243.field3449 != null) {
            var11 = (class394) class243.field3449.method904(false, var29);
        }
        if (var11 == null || arg8.method139(var11.method1424(), var12) != 0) {
            if (var11 != null) {
                var12 = arg8.method108(var12, var11.method1424());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class51.method433((byte) 87, var14[var33]).method2301(0, arg7)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class223[] var34 = new class223[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class51.method433((byte) 87, var14[var35]).method2316(arg7, (byte) 13);
                }
            }
            if (var13 != null && var13.field6038 != null) {
                for (int var36 = 0; var36 < var13.field6038.length; var36++) {
                    if (var13.field6038[var36] != null && var34[var36] != null) {
                        int var37 = var13.field6038[var36][0];
                        int var38 = var13.field6038[var36][1];
                        int var39 = var13.field6038[var36][2];
                        int var40 = var13.field6038[var36][3];
                        int var41 = var13.field6038[var36][4];
                        int var42 = var13.field6038[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method1485(var41, (byte) 103, var40, var42);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method1484(var38, var39, 0, var37);
                        }
                    }
                }
            }
            class223 var43 = new class223(var34, var34.length);
            if (arg1 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg8.method62(var43, var31, class348.field4780, 64, 850);
            if (arg1 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class157.field2219[var44].length > arg1.field1893[var44]) {
                        var11.method1460(class192.field2639[var44], class157.field2219[var44][arg1.field1893[var44]]);
                    }
                    if (arg1.field1893[var44] < class447.field6275[var44].length) {
                        var11.method1460(class432.field6112[var44], class447.field6275[var44][arg1.field1893[var44]]);
                    }
                }
            }
            if (class243.field3449 != null) {
                var11.method1453(var12);
                class243.field3449.method902(var29, (byte) 112, var11);
            }
        }
        if (arg2 == null || var23 == null) {
            return var11;
        } else {
            class394 var45 = var11.method1430((byte) 1, var12, true);
            var45.method2495(var21, var23, arg2.field5829, var20, (byte) 36, var24, 0, var22, arg4 - 1);
            return var45;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)[Ldp;", line = 344)
    public static final class2[] method1963(int arg0) {
        if (class59.field789 == null) {
            class2[] var1 = client.method1092((byte) 117, class241.field3426);
            class2[] var2 = new class2[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class2 var8 = var1[var4];
                if ((var8.field26 <= 0 || var8.field26 >= 24) && var8.field22 >= 800 && var8.field20 >= 600 && (class445.field6242 >= 96 || class326.field4462 != 0 || var8.field22 <= 1024 && var8.field20 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class2 var10 = var2[var9];
                        if (var8.field22 == var10.field22 && var8.field20 == var10.field20) {
                            if (var8.field26 > var10.field26) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class59.field789 = new class2[var3];
            class36.method343(var2, 0, class59.field789, 0, var3);
            int[] var5 = new int[class59.field789.length];
            for (int var6 = 0; var6 < class59.field789.length; var6++) {
                class2 var7 = class59.field789[var6];
                var5[var6] = var7.field22 * var7.field20;
            }
            class83.method601(var5, class59.field789, -1);
        }
        field4199++;
        if (arg0 != -1) {
            field4201 = null;
        }
        return class59.field789;
    }
}
