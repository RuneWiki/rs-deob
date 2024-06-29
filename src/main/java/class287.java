import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class287 extends class656 {

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "[I")
    public int[] field4063 = new int[1];

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "[I")
    public int[] field4061 = new int[] { -1 };

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field4064 = 0;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "J")
    public static long field4059;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lwu;")
    public static class376 field4058;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIILla;IILuea;Lha;IZ)Lka;", line = 7)
    public final class475 method1777(int arg0, int arg1, int arg2, class456 arg3, int arg4, int arg5, class320 arg6, class59 arg7, int arg8, boolean arg9) {
        field4062++;
        class475 var11 = null;
        int var12 = arg1;
        class98 var13 = null;
        if (arg4 != -1) {
            var13 = class372.field5174.method3205(-20408, arg4);
        }
        int[] var14 = this.field4061;
        if (var13 != null && var13.field1224 != null) {
            var14 = new int[var13.field1224.length];
            for (int var15 = 0; var15 < var13.field1224.length; var15++) {
                int var16 = var13.field1224[var15];
                if (var16 >= 0 && this.field4061.length > var16) {
                    var14[var15] = this.field4061[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        if (arg5 != -24182968) {
            method1781(43);
        }
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class37 var24 = null;
        class37 var25 = null;
        if (arg3 != null) {
            int var26 = arg3.field6229[arg0];
            var12 = arg1 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class509.field6780.method661(arg5 + 24182888, var27);
            if (var24 != null) {
                var18 |= var24.method296(var21, -34);
                var17 |= var24.method301(arg5 ^ 0xFE8EFF49, var21);
                var20 |= var24.method298(1, var21);
                var19 |= arg3.field6228;
            }
            if ((arg3.field6227 || class37.field529) && arg8 != -1 && arg3.field6229.length > arg8) {
                var23 = arg3.field6225[arg0];
                int var28 = arg3.field6229[arg8];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class509.field6780.method661(arg5 + 24182939, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method296(var22, -43);
                    var17 |= var25.method301(1, var22);
                    var20 |= var25.method298(1, var22);
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
        long var30 = this.method1779(var14, arg4, 0, arg9, arg6 == null ? null : arg6.field4578);
        if (class490.field6652 != null) {
            var11 = (class475) class490.field6652.method552(4, var30);
        }
        if (var11 == null || arg7.method405(var11.method214(), var12) != 0) {
            if (var11 != null) {
                var12 = arg7.method410(var12, var11.method214());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class77.field948.method1165((byte) 126, var14[var34]).method3243(true, arg9)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class538[] var35 = new class538[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class77.field948.method1165((byte) 95, var14[var36]).method3245(15580, arg9);
                }
            }
            if (var13 != null && var13.field1238 != null) {
                for (int var37 = 0; var37 < var13.field1238.length; var37++) {
                    if (var13.field1238[var37] != null && var35[var37] != null) {
                        int var38 = var13.field1238[var37][0];
                        int var39 = var13.field1238[var37][1];
                        int var40 = var13.field1238[var37][2];
                        int var41 = var13.field1238[var37][3];
                        int var42 = var13.field1238[var37][4];
                        int var43 = var13.field1238[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2990(12, var43, var42, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2981(var38, var39, 0, var40);
                        }
                    }
                }
            }
            class538 var44 = new class538(var35, var35.length);
            if (arg6 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg7.method401(var44, var32, class393.field5487, 64, 850);
            if (arg6 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class445.field6119.length; var46++) {
                        if (class445.field6119[var46][var45].length > arg6.field4578[var45]) {
                            var11.method206(class434.field5978[var46][var45], class445.field6119[var46][var45][arg6.field4578[var45]]);
                        }
                    }
                }
            }
            if (class490.field6652 != null) {
                var11.method190(var12);
                class490.field6652.method556((byte) 0, var30, var11);
            }
        }
        if (arg3 == null || var24 == null) {
            return var11;
        } else {
            class475 var47 = var11.method171((byte) 1, var12, true);
            var47.method2675(-97, var24, arg3.field6228, var22, var23, var21, 0, arg2 - 1, var25);
            return var47;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I", line = 257)
    public static final int method1778(byte arg0) {
        field4060++;
        if (arg0 != 106) {
            field4064 = -58;
        }
        return class269.field3759;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([IIIZ[I)J", line = 269)
    private final long method1779(int[] arg0, int arg1, int arg2, boolean arg3, int[] arg4) {
        field4065++;
        long[] var6 = class534.field7035;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg1 >> 8)) & 0xFFL)];
        long var11 = var6[(int) (((long) arg1 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = arg2; var13 < arg0.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg0[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var6[(int) (((long) (arg0[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg0[var13]) & 0xFFL)];
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg4[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg3 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIIIZ)Z", line = 311)
    public static final boolean method1780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field4066++;
        if (!arg8) {
            method1778((byte) 99);
        }
        if (arg6 + arg5 > arg7 && arg0 + arg7 > arg6) {
            return arg3 + arg1 > arg2 && arg3 < arg2 + arg4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 338)
    public static void method1781(int arg0) {
        field4058 = null;
        if (arg0 != 255) {
            field4058 = null;
        }
    }
}
