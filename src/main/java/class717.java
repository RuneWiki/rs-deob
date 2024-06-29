import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class717 extends class69 {

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[I")
    public int[] field9937 = new int[] { -1 };

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "[I")
    public int[] field9935 = new int[1];

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lhba;")
    public static class719 field9934 = new class719();

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Lqk;")
    public static class1 field9938 = new class1(35, 7);

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field9936;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field9939;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLpfa;ILgf;ZIIILha;I)Lka;")
    public final class231 method4008(byte arg0, class247 arg1, int arg2, class73 arg3, boolean arg4, int arg5, int arg6, int arg7, class473 arg8, int arg9) {
        field9939++;
        class231 var11 = null;
        int var12 = arg9;
        class148 var13 = null;
        if (arg5 != -1) {
            var13 = class671.field9419.method2879((byte) -113, arg5);
        }
        int[] var14 = this.field9937;
        if (var13 != null && var13.field1926 != null) {
            var14 = new int[var13.field1926.length];
            for (int var15 = 0; var15 < var13.field1926.length; var15++) {
                int var16 = var13.field1926[var15];
                if (var16 >= 0 && var16 < this.field9937.length) {
                    var14[var15] = this.field9937[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        if (arg0 != 82) {
            return null;
        }
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class146 var24 = null;
        class146 var25 = null;
        if (arg3 != null) {
            var12 = arg9 | 0x20;
            int var26 = arg3.field816[arg2];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class571.field8029.method3694(var27, arg0 ^ 0xE24);
            if (var24 != null) {
                var18 |= var24.method971(var21, 0);
                var17 |= var24.method974(15333, var21);
                var20 |= var24.method972(var21, 0);
                var19 |= arg3.field819;
            }
            if ((arg3.field804 || class738.field10171) && arg6 != -1 && arg6 < arg3.field816.length) {
                var23 = arg3.field817[arg2];
                int var28 = arg3.field816[arg6];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class571.field8029.method3694(var22 >>> 16, arg0 ^ 0xE24);
                }
                if (var25 != null) {
                    var18 |= var25.method971(var22, 0);
                    var17 |= var25.method974(arg0 + 15251, var22);
                    var20 |= var25.method972(var22, 0);
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
        long var30 = this.method4009(255, arg5, arg1 == null ? null : arg1.field3679, var14, arg4);
        if (class482.field6661 != null) {
            var11 = (class231) class482.field6661.method312(0, var30);
        }
        if (var11 == null || arg8.method188(var11.method1587(), var12) != 0) {
            if (var11 != null) {
                var12 = arg8.method198(var12, var11.method1587());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class35.field367.method3051((byte) -20, var14[var34]).method3405(null, arg4, 0)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class534[] var35 = new class534[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class35.field367.method3051((byte) -20, var14[var36]).method3403(null, arg4, 52);
                }
            }
            if (var13 != null && var13.field1899 != null) {
                for (int var37 = 0; var37 < var13.field1899.length; var37++) {
                    if (var13.field1899[var37] != null && var35[var37] != null) {
                        int var38 = var13.field1899[var37][0];
                        int var39 = var13.field1899[var37][1];
                        int var40 = var13.field1899[var37][2];
                        int var41 = var13.field1899[var37][3];
                        int var42 = var13.field1899[var37][4];
                        int var43 = var13.field1899[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3165((byte) 64, var43, var41, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3171(true, var40, var39, var38);
                        }
                    }
                }
            }
            class534 var44 = new class534(var35, var35.length);
            if (arg1 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg8.method231(var44, var32, class585.field8268, 64, 850);
            if (arg1 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class140.field1791.length; var46++) {
                        if (class140.field1791[var46][var45].length > arg1.field3679[var45]) {
                            var11.method1552(class472.field6536[var46][var45], class140.field1791[var46][var45][arg1.field3679[var45]]);
                        }
                    }
                }
            }
            if (class482.field6661 != null) {
                var11.method1548(var12);
                class482.field6661.method305(var11, var30, arg0 ^ 0x47C2);
            }
        }
        if (arg3 == null || var24 == null) {
            return var11;
        } else {
            class231 var47 = var11.method1584((byte) 1, var12, true);
            var47.method1538(0, var21, var23, var22, -127, var24, arg7 - 1, var25, arg3.field819);
            return var47;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[I[IZ)J")
    private final long method4009(int arg0, int arg1, int[] arg2, int[] arg3, boolean arg4) {
        field9936++;
        long[] var6 = class701.field9771;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((long) arg0 & ((long) (arg1 >> 8) ^ var7))];
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg1) & 0xFFL)];
        for (int var13 = 0; var13 < arg3.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg3[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg3[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg3[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) (((long) arg3[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg2[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var6[(int) ((var11 ^ (long) (arg4 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([Loq;II)V")
    public static final void method4010(class230[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class230 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field3471;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field3471 < (var7 & 0x1) + var6) {
                class230 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method4010(arg0, arg1, var4 - 1);
        method4010(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method4011(byte arg0) {
        if (arg0 != -102) {
            method4011((byte) -112);
        }
        field9938 = null;
        field9934 = null;
    }
}
