import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class369 extends class55 {

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "[I")
    public int[] field5171 = new int[1];

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "[I")
    public int[] field5172 = new int[] { -1 };

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field5173 = 0;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lgaa;IIZLtfa;IIIBLha;)Lka;")
    public final class472 method2187(class300 arg0, int arg1, int arg2, boolean arg3, class34 arg4, int arg5, int arg6, int arg7, byte arg8, class60 arg9) {
        field5174++;
        class472 var11 = null;
        int var12 = arg6;
        class351 var13 = null;
        if (arg5 != -1) {
            var13 = class137.field1743.method1346(false, arg5);
        }
        int[] var14 = this.field5172;
        if (var13 != null && var13.field4669 != null) {
            var14 = new int[var13.field4669.length];
            for (int var15 = 0; var15 < var13.field4669.length; var15++) {
                int var16 = var13.field4669[var15];
                if (var16 >= 0 && var16 < this.field5172.length) {
                    var14[var15] = this.field5172[var16];
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
        class452 var24 = null;
        class452 var25 = null;
        if (arg8 > -43) {
            this.method2187(null, 78, 100, false, null, 112, 24, -42, (byte) 36, null);
        }
        if (arg0 != null) {
            var12 = arg6 | 0x20;
            int var26 = arg0.field4042[arg2];
            int var27 = var26 >>> 16;
            var24 = class460.field6365.method1091(2, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method2529(var21, 31239);
                var17 |= var24.method2527(false, var21);
                var20 |= var24.method2525(var21, false);
                var19 |= arg0.field4040;
            }
            if ((arg0.field4051 || class686.field9625) && arg7 != -1 && arg0.field4042.length > arg7) {
                var23 = arg0.field4033[arg2];
                int var28 = arg0.field4042[arg7];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class460.field6365.method1091(2, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method2529(var22, 31239);
                    var17 |= var25.method2527(false, var22);
                    var20 |= var25.method2525(var22, false);
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
        long var30 = this.method2188(arg5, arg3, var14, arg4 == null ? null : arg4.field362, -29509);
        if (class322.field4321 != null) {
            var11 = (class472) class322.field4321.method1571(-120, var30);
        }
        if (var11 == null || arg9.method396(var11.method225(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method389(var12, var11.method225());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class761.field10628.method4169(var14[var34], (byte) -123).method3937(0, arg3)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class446[] var35 = new class446[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class761.field10628.method4169(var14[var36], (byte) -116).method3945(arg3, 109);
                }
            }
            if (var13 != null && var13.field4655 != null) {
                for (int var37 = 0; var37 < var13.field4655.length; var37++) {
                    if (var13.field4655[var37] != null && var35[var37] != null) {
                        int var38 = var13.field4655[var37][0];
                        int var39 = var13.field4655[var37][1];
                        int var40 = var13.field4655[var37][2];
                        int var41 = var13.field4655[var37][3];
                        int var42 = var13.field4655[var37][4];
                        int var43 = var13.field4655[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2510(var43, var41, (byte) -128, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2507(var40, var38, (byte) 108, var39);
                        }
                    }
                }
            }
            if (arg4 != null) {
                var32 = var12 | 0x4000;
            }
            class446 var44 = new class446(var35, var35.length);
            var11 = arg9.method407(var44, var32, class125.field1630, 64, 850);
            if (arg4 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class237.field3103.length; var46++) {
                        if (class237.field3103[var46][var45].length > arg4.field362[var45]) {
                            var11.method195(class576.field8092[var46][var45], class237.field3103[var46][var45][arg4.field362[var45]]);
                        }
                    }
                }
            }
            if (class322.field4321 != null) {
                var11.method202(var12);
                class322.field4321.method1574(var30, var11, (byte) -80);
            }
        }
        if (arg0 == null || var24 == null) {
            return var11;
        } else {
            class472 var47 = var11.method241((byte) 1, var12, true);
            var47.method2659(arg1 - 1, var24, var21, var25, arg0.field4040, 0, -104, var23, var22);
            return var47;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ[I[II)J")
    private final long method2188(int arg0, boolean arg1, int[] arg2, int[] arg3, int arg4) {
        field5175++;
        long[] var6 = class723.field10105;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg0 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) (((long) arg0 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var6[(int) (((long) (arg2[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg2[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg2[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) (((long) arg2[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg3 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg3[var14] ^ var11) & 0xFFL)];
            }
        }
        return arg4 == -29509 ? var6[(int) (((long) (arg1 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8 : -33L;
    }
}
