import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class78 {

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public int field1164 = -1;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "[F")
    public static float[] field1169 = new float[4];

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Lss;")
    public static class213 field1157 = new class213(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field1176 = 0;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "J")
    private long field1168;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "J")
    private long field1170;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Z")
    public boolean field1159;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[I")
    private int[] field1165;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "[I")
    public int[] field1172;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[[I")
    private int[][] field1155;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ[I[IBI)V")
    public final void method557(int arg0, boolean arg1, int[] arg2, int[] arg3, byte arg4, int arg5) {
        if (this.field1171 != arg0) {
            this.field1155 = null;
            this.field1171 = arg0;
        }
        field1161++;
        this.field1165 = arg2;
        this.field1172 = arg3;
        if (arg4 == -12) {
            this.field1159 = arg1;
            this.field1164 = arg5;
            this.method558((byte) -107);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    private final void method558(byte arg0) {
        field1173++;
        long[] var2 = class150.field2013;
        this.field1168 = -1L;
        this.field1168 = this.field1168 >>> 8 ^ var2[(int) (((long) (this.field1171 >> 8) ^ this.field1168) & 0xFFL)];
        this.field1168 = this.field1168 >>> 8 ^ var2[(int) (((long) this.field1171 ^ this.field1168) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field1168 = var2[(int) (((long) (this.field1165[var3] >> 24) ^ this.field1168) & 0xFFL)] ^ this.field1168 >>> 8;
            this.field1168 = var2[(int) ((this.field1168 ^ (long) (this.field1165[var3] >> 16)) & 0xFFL)] ^ this.field1168 >>> 8;
            this.field1168 = this.field1168 >>> 8 ^ var2[(int) ((this.field1168 ^ (long) (this.field1165[var3] >> 8)) & 0xFFL)];
            this.field1168 = this.field1168 >>> 8 ^ var2[(int) ((this.field1168 ^ (long) this.field1165[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field1168 = this.field1168 >>> 8 ^ var2[(int) (((long) this.field1172[var4] ^ this.field1168) & 0xFFL)];
        }
        if (arg0 >= -57) {
            this.field1165 = null;
        }
        this.field1168 = this.field1168 >>> 8 ^ var2[(int) ((this.field1168 ^ (long) (this.field1159 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V")
    public final void method559(boolean arg0, int arg1) {
        if (arg1 >= -89) {
            field1156 = -35;
        }
        field1167++;
        this.field1159 = arg0;
        this.method558((byte) -75);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
    public final void method560(int arg0, int arg1, int arg2) {
        this.field1172[arg2] = arg0;
        field1175++;
        this.method558((byte) -98);
        if (arg1 != -1) {
            this.field1168 = -111L;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([IB[III)V")
    public static final void method561(int[] arg0, byte arg1, int[] arg2, int arg3, int arg4) {
        if (arg1 != 21) {
            field1157 = null;
        }
        field1162++;
        if (arg4 >= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg4;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        int var8 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg4; var10 < arg3; var10++) {
            if (arg0[var10] < ((var10 & var9) + var7)) {
                int var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                int var12 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6++] = var12;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg2[arg3] = arg2[var6];
        arg2[var6] = var8;
        method561(arg0, (byte) 21, arg2, var6 - 1, arg4);
        method561(arg0, (byte) 21, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILmr;I)V")
    public final void method562(int arg0, int arg1, class163 arg2, int arg3) {
        field1174++;
        int var5 = class390.field5934[arg1];
        if (this.field1165[var5] != 0 && arg2.method1028((byte) 124, arg0) != null) {
            this.field1165[var5] = class410.method2621(arg0, arg3);
            this.method558((byte) -69);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILwp;Lfk;ILrd;Ldk;ILza;Lhg;ILmr;I)Le;")
    public final class536 method563(int arg0, class310 arg1, class244 arg2, int arg3, class353 arg4, class483 arg5, int arg6, class497 arg7, class363 arg8, int arg9, class163 arg10, int arg11) {
        field1158++;
        if (this.field1164 != -1) {
            return arg5.method2977(this.field1164, 50).method1196(arg0, arg3, arg6, 255, arg7, arg8, arg2, arg4, arg9);
        }
        int var13 = arg3;
        if (arg8 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg8.field5623[arg9];
            Object var22 = null;
            var13 = arg3 | 0x20;
            int var23 = var21 >>> 16;
            class249 var24 = arg2.method1695(var23, true);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method1726(var25, 65280);
                var14 |= var24.method1721(var25, 110);
                var17 |= var24.method1720((byte) -10, var25);
                var16 |= arg8.field5614;
            }
            if ((arg8.field5598 || class84.field1230) && arg6 != -1 && arg8.field5623.length > arg6) {
                int var26 = arg8.field5623[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class249 var29 = var23 == var27 ? var24 : arg2.method1695(var27, true);
                if (var29 != null) {
                    var15 |= var29.method1726(var28, 65280);
                    var14 |= var29.method1721(var28, -103);
                    var17 |= var29.method1720((byte) -3, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class328 var30 = class524.field7739;
        class536 var31;
        synchronized (class524.field7739) {
            var31 = (class536) class524.field7739.method2191((byte) -73, this.field1168);
            if (arg11 >= -104) {
                this.method560(-15, 30, 39);
            }
        }
        if (var31 == null || arg7.method1299(var31.method308(), var13) != 0) {
            if (var31 != null) {
                var13 = arg7.method1294(var13, var31.method308());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field1165[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg10.method1028((byte) 127, var35 & 0x3FFFFFFF).method1780(5)) {
                        var33 = true;
                    }
                } else if (!arg1.method2077((byte) -65, var35 & 0x3FFFFFFF).method1351(this.field1159, -67)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class438[] var36 = new class438[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field1165[var38];
                if ((var39 & 0x40000000) != 0) {
                    class438 var41 = arg1.method2077((byte) -65, var39 & 0x3FFFFFFF).method1346(this.field1159, (byte) 49);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class438 var40 = arg10.method1028((byte) 114, var39 & 0x3FFFFFFF).method1778((byte) -42);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class438 var42 = new class438(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg7.method1337(var42, var43, class298.field4688, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field1172[var44] < class284.field4477[var44].length) {
                    var31.method309(class295.field4661[var44], class284.field4477[var44][this.field1172[var44]]);
                }
                if (class187.field2725[var44].length > this.field1172[var44]) {
                    var31.method309(class81.field1200[var44], class187.field2725[var44][this.field1172[var44]]);
                }
            }
            var31.method290(var13);
            class328 var45 = class524.field7739;
            synchronized (class524.field7739) {
                class524.field7739.method2188(-126, this.field1168, var31);
            }
        }
        if (arg8 == null) {
            return var31;
        } else {
            var31.method329((byte) 4, var13, true);
            return arg8.method2389(arg0, arg3, arg6, arg9, var31, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V")
    public static final void method564(byte arg0, int arg1) {
        class503.field7532 = -1;
        class186.field2709 = -1;
        class328.field5138 = false;
        if (arg0 != 14) {
            return;
        }
        class174.field2565 = 1;
        class73.field1106 = null;
        class210.field3273 = arg1;
        class170.field2489 = 0;
        field1160++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lfk;IIIIIILza;Lmr;IILhg;)Le;")
    public final class536 method565(class244 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class497 arg7, class163 arg8, int arg9, int arg10, class363 arg11) {
        field1166++;
        int var13 = arg10;
        if (arg11 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg10 | 0x20;
            int var21 = arg11.field5623[arg6];
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class249 var25 = arg0.method1695(var23, true);
            if (var25 != null) {
                var15 |= var25.method1726(var24, 65280);
                var14 |= var25.method1721(var24, arg9 - 1349653554);
                var17 |= var25.method1720((byte) -62, var24);
                var16 |= arg11.field5614;
            }
            if ((arg11.field5598 || class84.field1230) && arg5 != -1 && arg5 < arg11.field5623.length) {
                int var26 = arg11.field5623[arg5];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class249 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg0.method1695(var28 >>> 16, true);
                }
                if (var29 != null) {
                    var15 |= var29.method1726(var28, 65280);
                    var14 |= var29.method1721(var28, arg9 ^ 0xAF8DEB39);
                    var17 |= var29.method1720((byte) -76, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg1 << 32 | (long) (arg3 << 16) | (long) arg2;
        class328 var32 = class524.field7739;
        class536 var33;
        synchronized (class524.field7739) {
            var33 = (class536) class524.field7739.method2191((byte) -73, var30);
        }
        if (var33 == null || arg7.method1299(var33.method308(), var13) != 0) {
            if (var33 != null) {
                var13 = arg7.method1294(var13, var33.method308());
            }
            class438[] var35 = new class438[3];
            int var36 = 0;
            if (!arg8.method1028((byte) 99, arg2).method1780(5) || !arg8.method1028((byte) 90, arg3).method1780(5) || !arg8.method1028((byte) 96, arg1).method1780(5)) {
                return null;
            }
            class438 var37 = arg8.method1028((byte) 120, arg2).method1778((byte) -42);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class438 var38 = arg8.method1028((byte) 112, arg3).method1778((byte) -42);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class438 var39 = arg8.method1028((byte) 127, arg1).method1778((byte) -42);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class438 var41 = new class438(var35, var36);
            var33 = arg7.method1337(var41, var40, class298.field4688, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field1172[var42] < class284.field4477[var42].length) {
                    var33.method309(class295.field4661[var42], class284.field4477[var42][this.field1172[var42]]);
                }
                if (class187.field2725[var42].length > this.field1172[var42]) {
                    var33.method309(class81.field1200[var42], class187.field2725[var42][this.field1172[var42]]);
                }
            }
            var33.method290(var13);
            class328 var43 = class524.field7739;
            synchronized (class524.field7739) {
                class524.field7739.method2188(-125, var30, var33);
            }
        }
        if (arg11 == null) {
            return var33;
        }
        if (arg9 != 1349653680) {
            this.method559(true, 46);
        }
        class536 var44 = var33.method329((byte) 4, var13, true);
        return arg11.method2389(arg4, arg10, arg5, arg6, var44, (byte) 1);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lhg;Lwp;Ldk;Lhg;BIZLvq;Lza;IIIILmr;II[Lgg;Lfk;Lrd;)Le;")
    public final class536 method566(class363 arg0, class310 arg1, class483 arg2, class363 arg3, byte arg4, int arg5, boolean arg6, class346 arg7, class497 arg8, int arg9, int arg10, int arg11, int arg12, class163 arg13, int arg14, int arg15, class75[] arg16, class244 arg17, class353 arg18) {
        field1163++;
        if (this.field1164 != -1) {
            return arg2.method2977(this.field1164, 50).method1198(arg0, arg14, arg15, arg3, arg8, false, arg5, arg9, arg10, arg11, arg7, arg17, arg12, arg18, arg16);
        }
        int var20 = arg10;
        long var21 = this.field1168;
        int[] var23 = this.field1165;
        if (arg3 != null && (arg3.field5603 >= 0 || arg3.field5607 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field1165[var24];
            }
            if (arg3.field5603 >= 0) {
                if (arg3.field5603 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class410.method2621(arg3.field5603, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg3.field5607 >= 0) {
                if (arg3.field5607 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class410.method2621(arg3.field5607, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg3 != null || arg0 != null;
        int var29 = arg16 == null ? 0 : arg16.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class73.field1107[var30] = null;
            if (arg16[var30] != null) {
                class363 var31 = arg17.method1703(arg16[var30].field1120, -12536);
                if (var31.field5623 != null) {
                    var28 = true;
                    class301.field4731[var30] = var31;
                    int var32 = arg16[var30].field1122;
                    int var33 = arg16[var30].field1118;
                    int var34 = var31.field5623[var32];
                    class73.field1107[var30] = arg17.method1695(var34 >>> 16, true);
                    int var35 = var34 & 0xFFFF;
                    class481.field7329[var30] = var35;
                    if (class73.field1107[var30] != null) {
                        var26 |= class73.field1107[var30].method1726(var35, 65280);
                        var25 |= class73.field1107[var30].method1721(var35, 125);
                        var27 |= class73.field1107[var30].method1720((byte) -101, var35);
                    }
                    if ((var31.field5598 || class84.field1230) && var33 != -1 && var33 < var31.field5623.length) {
                        class463.field7112[var30] = var31.field5599[var32];
                        class156.field2151[var30] = arg16[var30].field1114;
                        int var36 = var31.field5623[var33];
                        class215.field3656[var30] = arg17.method1695(var36 >>> 16, true);
                        int var37 = var36 & 0xFFFF;
                        class260.field4198[var30] = var37;
                        if (class215.field3656[var30] != null) {
                            var26 |= class215.field3656[var30].method1726(var37, 65280);
                            var25 |= class215.field3656[var30].method1721(var37, -38);
                            var27 |= class215.field3656[var30].method1720((byte) -96, var37);
                        }
                    } else {
                        class463.field7112[var30] = 0;
                        class156.field2151[var30] = 0;
                        class215.field3656[var30] = null;
                        class260.field4198[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class249 var41 = null;
        class249 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class249 var46 = null;
        class249 var47 = null;
        if (var28) {
            if (arg3 != null) {
                int var48 = arg3.field5623[arg9];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg17.method1695(var49, true);
                if (var41 != null) {
                    var26 |= var41.method1726(var38, 65280);
                    var25 |= var41.method1721(var38, -16);
                    var27 |= var41.method1720((byte) -50, var38);
                }
                if ((arg3.field5598 || class84.field1230) && arg11 != -1 && arg11 < arg3.field5623.length) {
                    int var50 = arg3.field5623[arg11];
                    var40 = arg3.field5599[arg9];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg17.method1695(var51, true);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method1726(var39, 65280);
                        var25 |= var42.method1721(var39, 124);
                        var27 |= var42.method1720((byte) -12, var39);
                    }
                }
            }
            var20 = arg10 | 0x20;
            if (arg0 != null) {
                int var52 = arg0.field5623[arg5];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg17.method1695(var53, true);
                if (var46 != null) {
                    var26 |= var46.method1726(var43, 65280);
                    var25 |= var46.method1721(var43, -48);
                    var27 |= var46.method1720((byte) -109, var43);
                }
                if ((arg0.field5598 || class84.field1230) && arg12 != -1 && arg12 < arg0.field5623.length) {
                    var45 = arg0.field5599[arg5];
                    int var54 = arg0.field5623[arg12];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg17.method1695(var55, true);
                    if (var47 != null) {
                        var26 |= var47.method1726(var44, 65280);
                        var25 |= var47.method1721(var44, 37);
                        var27 |= var47.method1720((byte) -9, var44);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class328 var56 = class211.field3462;
        class536 var57;
        synchronized (class211.field3462) {
            var57 = (class536) class211.field3462.method2191((byte) -73, var21);
        }
        class289 var58 = null;
        if (this.field1171 != -1) {
            var58 = arg7.method2294(this.field1171, 1);
        }
        if (var57 == null || arg8.method1299(var57.method308(), var20) != 0 || var58 != null && var58.field4520 != null && this.field1155 == null) {
            if (var57 != null) {
                var20 = arg8.method1294(var20, var57.method308());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg13.method1028((byte) 95, var62 & 0x3FFFFFFF).method1774((byte) 86)) {
                        var60 = true;
                    }
                } else if (!arg1.method2077((byte) -65, var62 & 0x3FFFFFFF).method1349(this.field1159, true)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field1170 != -1L) {
                    class328 var88 = class211.field3462;
                    synchronized (class211.field3462) {
                        var57 = (class536) class211.field3462.method2191((byte) -73, this.field1170);
                    }
                }
                if (var57 == null || arg8.method1299(var57.method308(), var20) != 0 || var58 != null && var58.field4520 != null && this.field1155 == null) {
                    return null;
                }
            } else {
                class438[] var63 = new class438[12];
                for (int var64 = 0; var64 < 12; var64++) {
                    int var65 = var23[var64];
                    if ((var65 & 0x40000000) != 0) {
                        class438 var67 = arg1.method2077((byte) -65, var65 & 0x3FFFFFFF).method1348(-124, this.field1159);
                        if (var67 != null) {
                            var63[var64] = var67;
                        }
                    } else if ((Integer.MIN_VALUE & var65) != 0) {
                        class438 var66 = arg13.method1028((byte) 122, var65 & 0x3FFFFFFF).method1776(13640);
                        if (var66 != null) {
                            var63[var64] = var66;
                        }
                    }
                }
                if (var58 != null && var58.field4520 != null) {
                    for (int var68 = 0; var68 < var58.field4520.length; var68++) {
                        if (var58.field4520[var68] != null && var63[var68] != null) {
                            int var69 = var58.field4520[var68][0];
                            int var70 = var58.field4520[var68][1];
                            int var71 = var58.field4520[var68][2];
                            int var72 = var58.field4520[var68][3] << 3;
                            int var73 = var58.field4520[var68][4] << 3;
                            int var74 = var58.field4520[var68][5] << 3;
                            if (this.field1155 == null) {
                                this.field1155 = new int[var58.field4520.length][];
                            }
                            if (this.field1155[var68] == null) {
                                int[] var75 = this.field1155[var68] = new int[15];
                                if (var72 == 0 && var73 == 0 && var74 == 0) {
                                    var75[13] = -var70;
                                    var75[12] = -var69;
                                    var75[0] = var75[4] = var75[8] = 32768;
                                    var75[14] = -var71;
                                } else {
                                    int var76 = class147.field1986[var72];
                                    int var77 = class147.field1988[var72];
                                    int var78 = class147.field1986[var73];
                                    int var79 = class147.field1988[var73];
                                    int var80 = class147.field1986[var74];
                                    int var81 = class147.field1988[var74];
                                    int var82 = var77 * var80 + 16384 >> 15;
                                    int var83 = var77 * var81 + 16384 >> 15;
                                    var75[7] = -var79 * -var81 + var78 * var82 + 16384 >> 15;
                                    var75[2] = var76 * var79 + 16384 >> 15;
                                    var75[1] = -var81 * var78 + var79 * var82 + 16384 >> 15;
                                    var75[4] = var76 * var80 + 16384 >> 15;
                                    var75[0] = var78 * var80 + var79 * var83 + 16384 >> 15;
                                    var75[3] = var76 * var81 + 16384 >> 15;
                                    var75[5] = -var77;
                                    var75[6] = -var79 * var80 - (-(var78 * var83) - 16384) >> 15;
                                    var75[8] = var76 * var78 + 16384 >> 15;
                                    var75[14] = var75[5] * -var70 + var75[8] * -var71 + var75[2] * -var69 + 16384 >> 15;
                                    var75[12] = var75[6] * -var71 + var75[0] * -var69 + (var75[3] * -var70) + 16384 >> 15;
                                    var75[13] = var75[7] * -var71 + var75[4] * -var70 + var75[1] * -var69 + 16384 >> 15;
                                }
                                var75[9] = var69;
                                var75[10] = var70;
                                var75[11] = var71;
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var63[var68].method2769(var73, (byte) 123, var72, var74);
                            }
                            if (var69 != 0 || var70 != 0 || var71 != 0) {
                                var63[var68].method2785(var71, var69, -19721, var70);
                            }
                        }
                    }
                }
                class438 var84 = new class438(var63, var63.length);
                int var85 = var20 | 0x4000;
                var57 = arg8.method1337(var84, var85, class298.field4688, 64, 850);
                for (int var86 = 0; var86 < 5; var86++) {
                    if (class284.field4477[var86].length > this.field1172[var86]) {
                        var57.method309(class295.field4661[var86], class284.field4477[var86][this.field1172[var86]]);
                    }
                    if (this.field1172[var86] < class187.field2725[var86].length) {
                        var57.method309(class81.field1200[var86], class187.field2725[var86][this.field1172[var86]]);
                    }
                }
                if (arg6) {
                    var57.method290(var20);
                    class328 var87 = class211.field3462;
                    synchronized (class211.field3462) {
                        class211.field3462.method2188(-123, var21, var57);
                    }
                    this.field1170 = var21;
                }
            }
        }
        class536 var89 = var57.method329((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class73.field1107[var90] != null) {
                var89.method3177(class156.field2151[var90] - 1, var91, class73.field1107[var90], this.field1155 == null ? null : this.field1155[var90], (byte) -92, class215.field3656[var90], false, class463.field7112[var90], class260.field4198[var90], 0, class481.field7329[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (arg4 < 13) {
            this.field1164 = -108;
        }
        if (var41 != null && var46 != null) {
            var89.method3173(arg14 - 1, arg15 - 1, false, var39, var45, var38, var46, var47, var43, var42, var41, (byte) -88, arg3.field5619, var40, var44);
        } else if (var41 != null) {
            var89.method3181(0, var38, var39, 100, var42, var40, false, arg14 - 1, var41);
        } else if (var46 != null) {
            var89.method3181(0, var43, var44, 101, var47, var45, false, arg15 - 1, var46);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class73.field1107[var92] = null;
            class215.field3656[var92] = null;
            class301.field4731[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method567(int arg0) {
        field1157 = null;
        field1169 = null;
        if (arg0 != 6311) {
            method561(null, (byte) 83, null, -47, -29);
        }
    }
}
