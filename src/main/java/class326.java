import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class326 {

    @OriginalMember(owner = "client!vea", name = "v", descriptor = "I")
    public int field4171 = -1;

    @OriginalMember(owner = "client!vea", name = "h", descriptor = "Lqia;")
    public static class547 field4157 = new class547();

    @OriginalMember(owner = "client!vea", name = "p", descriptor = "Lus;")
    public static class328 field4165 = new class328(79, 4);

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "Lsga;")
    public static class583 field4170 = new class583(16);

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
    private int field4152;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!vea", name = "i", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!vea", name = "j", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!vea", name = "k", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!vea", name = "l", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!vea", name = "m", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!vea", name = "n", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!vea", name = "o", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!vea", name = "q", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!vea", name = "s", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "J")
    private long field4150;

    @OriginalMember(owner = "client!vea", name = "r", descriptor = "J")
    private long field4167;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "Z")
    public boolean field4151;

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "[I")
    public int[] field4154;

    @OriginalMember(owner = "client!vea", name = "t", descriptor = "[I")
    private int[] field4169;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZB)V")
    public final void method1921(boolean arg0, byte arg1) {
        if (arg1 == -118) {
            this.field4151 = arg0;
            field4166++;
            this.method1922(0);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
    private final void method1922(int arg0) {
        field4153++;
        long[] var2 = class364.field5171;
        this.field4150 = -1L;
        this.field4150 = var2[(int) (((long) (this.field4152 >> 8) ^ this.field4150) & 0xFFL)] ^ this.field4150 >>> 8;
        this.field4150 = this.field4150 >>> 8 ^ var2[(int) ((this.field4150 ^ (long) this.field4152) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field4150 = this.field4150 >>> 8 ^ var2[(int) (((long) (this.field4169[var3] >> 24) ^ this.field4150) & 0xFFL)];
            this.field4150 = var2[(int) ((this.field4150 ^ (long) (this.field4169[var3] >> 16)) & 0xFFL)] ^ this.field4150 >>> 8;
            this.field4150 = var2[(int) (((long) (this.field4169[var3] >> 8) ^ this.field4150) & 0xFFL)] ^ this.field4150 >>> 8;
            this.field4150 = var2[(int) ((this.field4150 ^ (long) this.field4169[var3]) & 0xFFL)] ^ this.field4150 >>> 8;
        }
        for (int var4 = arg0; var4 < 5; var4++) {
            this.field4150 = var2[(int) ((this.field4150 ^ (long) this.field4154[var4]) & 0xFFL)] ^ this.field4150 >>> 8;
        }
        this.field4150 = var2[(int) (((long) (this.field4151 ? 1 : 0) ^ this.field4150) & 0xFFL)] ^ this.field4150 >>> 8;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lfg;III)V")
    public final void method1923(class418 arg0, int arg1, int arg2, int arg3) {
        field4168++;
        if (arg1 != 14651) {
            return;
        }
        int var5 = class421.field5994[arg3];
        if (arg0.method2485(arg1 ^ 0x393A, arg2) != null) {
            this.field4169[var5] = class216.method1308(Integer.MIN_VALUE, arg2);
            this.method1922(0);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "([I[IZIII)V")
    public final void method1924(int[] arg0, int[] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        this.field4151 = arg2;
        field4156++;
        if (this.field4152 != arg4) {
            this.field4152 = arg4;
        }
        this.field4169 = arg0;
        this.field4154 = arg1;
        int var7 = 32 / ((15 - arg5) / 38);
        this.field4171 = arg3;
        this.method1922(0);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V")
    public static final void method1925(byte arg0) {
        field4158++;
        int var1 = class274.field3466 * 512 + 256;
        int var2 = class692.field9814 * 512 + 256;
        int var3 = class592.method3287(false, var2, class223.field2946, var1) - class518.field7293;
        if (class185.field2425 >= 100) {
            class407.field5744 = class692.field9814 * 512 + 256;
            class505.field7134 = class274.field3466 * 512 + 256;
            class524.field7412 = class592.method3287(false, class407.field5744, class223.field2946, class505.field7134) - class518.field7293;
        } else {
            if (class505.field7134 < var1) {
                class505.field7134 += (var1 - class505.field7134) * class185.field2425 / 1000 + class223.field2943;
                if (class505.field7134 > var1) {
                    class505.field7134 = var1;
                }
            }
            if (class524.field7412 < var3) {
                class524.field7412 += (var3 - class524.field7412) * class185.field2425 / 1000 + class223.field2943;
                if (var3 < class524.field7412) {
                    class524.field7412 = var3;
                }
            }
            if (class505.field7134 > var1) {
                class505.field7134 -= class223.field2943 + ((class505.field7134 - var1) * class185.field2425 / 1000);
                if (class505.field7134 < var1) {
                    class505.field7134 = var1;
                }
            }
            if (var2 > class407.field5744) {
                class407.field5744 += (var2 - class407.field5744) * class185.field2425 / 1000 + class223.field2943;
                if (var2 < class407.field5744) {
                    class407.field5744 = var2;
                }
            }
            if (var3 < class524.field7412) {
                class524.field7412 -= class223.field2943 + ((class524.field7412 - var3) * class185.field2425 / 1000);
                if (var3 > class524.field7412) {
                    class524.field7412 = var3;
                }
            }
            if (var2 < class407.field5744) {
                class407.field5744 -= (class407.field5744 - var2) * class185.field2425 / 1000 + class223.field2943;
                if (var2 > class407.field5744) {
                    class407.field5744 = var2;
                }
            }
        }
        int var4 = class49.field728 * 512 + 256;
        int var5 = 73 / ((arg0 - 13) / 61);
        int var6 = class579.field8054 * 512 + 256;
        int var7 = class592.method3287(false, var6, class223.field2946, var4) - class223.field2945;
        int var8 = var4 - class505.field7134;
        int var9 = var7 - class524.field7412;
        int var10 = var6 - class407.field5744;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -2607.5945876176133D) & 0x3FFF;
        if (var12 < 1024) {
            var12 = 1024;
        }
        if (var12 > 3072) {
            var12 = 3072;
        }
        if (var12 > class411.field5801) {
            class411.field5801 += class654.field9000 + ((var12 - class411.field5801 >> 3) * class188.field2472 / 1000) << 3;
            if (class411.field5801 > var12) {
                class411.field5801 = var12;
            }
        }
        if (var12 < class411.field5801) {
            class411.field5801 -= (class411.field5801 - var12 >> 3) * class188.field2472 / 1000 + class654.field9000 << 3;
            if (var12 > class411.field5801) {
                class411.field5801 = var12;
            }
        }
        int var14 = var13 - class688.field9781;
        if (var14 > 8192) {
            var14 -= 16384;
        }
        if (var14 < -8192) {
            var14 += 16384;
        }
        int var15 = var14 >> 3;
        if (var15 > 0) {
            class688.field9781 += class188.field2472 * var15 / 1000 + class654.field9000 << 3;
            class688.field9781 &= 0x3FFF;
        }
        if (var15 < 0) {
            class688.field9781 -= class654.field9000 + (-var15 * class188.field2472 / 1000) << 3;
            class688.field9781 &= 0x3FFF;
        }
        int var16 = var13 - class688.field9781;
        if (var16 > 8192) {
            var16 -= 16384;
        }
        if (var16 < -8192) {
            var16 += 16384;
        }
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            class688.field9781 = var13;
        }
        class156.field1974 = 0;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILfg;IILha;IILnaa;ILrj;II)Lka;")
    public final class219 method1926(int arg0, class418 arg1, int arg2, int arg3, class454 arg4, int arg5, int arg6, class93 arg7, int arg8, class747 arg9, int arg10, int arg11) {
        field4161++;
        int var13 = arg6;
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg9.field10458[arg0];
            var13 = arg6 | 0x20;
            int var23 = var22 >>> 16;
            class555 var24 = arg7.method637((byte) -124, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3154(var25, (byte) 94);
                var14 |= var24.method3156(arg3 - 20105, var25);
                var17 |= var24.method3155(var25, (byte) 90);
                var16 |= arg9.field10459;
            }
            if ((arg9.field10436 || class322.field4112) && arg11 != -1 && arg9.field10458.length > arg11) {
                int var26 = arg9.field10458[arg11];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class555 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg7.method637((byte) -126, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method3154(var28, (byte) -91);
                    var14 |= var29.method3156(arg3 ^ 0x5299, var28);
                    var17 |= var29.method3155(var28, (byte) 88);
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
        long var30 = (long) (arg8 << 16) | (long) arg5 << 32 | (long) arg10;
        if (arg3 != -12041) {
            this.field4167 = 7L;
        }
        class114 var32 = class626.field8729;
        class219 var33;
        synchronized (class626.field8729) {
            var33 = (class219) class626.field8729.method778(var30, arg3 ^ 0xFFFFD096);
        }
        if (var33 == null || arg4.method135(var33.method1340(), var13) != 0) {
            if (var33 != null) {
                var13 = arg4.method100(var13, var33.method1340());
            }
            class415[] var35 = new class415[3];
            int var36 = 0;
            if (!arg1.method2485(1, arg10).method2590((byte) 44) || !arg1.method2485(arg3 + 12042, arg8).method2590((byte) 28) || !arg1.method2485(arg3 ^ 0xFFFFD0F6, arg5).method2590((byte) 107)) {
                return null;
            }
            class415 var37 = arg1.method2485(arg3 + 12042, arg10).method2591(-72);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class415 var38 = arg1.method2485(1, arg8).method2591(-57);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class415 var39 = arg1.method2485(1, arg5).method2591(-108);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class415 var40 = new class415(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg4.method150(var40, var41, class703.field9905, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class674.field9172.length; var43++) {
                    if (class674.field9172[var43][var42].length > this.field4154[var42]) {
                        var33.method1362(class58.field823[var43][var42], class674.field9172[var43][var42][this.field4154[var42]]);
                    }
                }
            }
            var33.method1327(var13);
            class114 var44 = class626.field8729;
            synchronized (class626.field8729) {
                class626.field8729.method774(var30, 87, var33);
            }
        }
        if (arg9 == null) {
            return var33;
        } else {
            class219 var45 = var33.method1337((byte) 4, var13, true);
            return arg9.method4175(arg0, var45, arg2, arg11, arg6, 102);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BLfg;ILrj;[III[Lfh;Lha;Lnaa;Liba;Lrj;ILqr;ZILdk;Lraa;III)Lka;")
    public final class219 method1927(byte arg0, class418 arg1, int arg2, class747 arg3, int[] arg4, int arg5, int arg6, class645[] arg7, class454 arg8, class93 arg9, class224 arg10, class747 arg11, int arg12, class713 arg13, boolean arg14, int arg15, class683 arg16, class487 arg17, int arg18, int arg19, int arg20) {
        field4159++;
        if (this.field4171 != -1) {
            return arg10.method1452(this.field4171, 64).method967(arg16, arg7, arg4, arg15, arg12, arg11, (byte) 118, arg2, arg5, arg18, arg3, arg9, arg17, arg6, arg20, arg19, arg8);
        }
        int var22 = arg2;
        long var23 = this.field4150;
        int[] var25 = this.field4169;
        if (arg3 != null && (arg3.field10432 >= 0 || arg3.field10461 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field4169[var26];
            }
            if (arg3.field10432 >= 0) {
                if (arg3.field10432 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class216.method1308(1073741824, arg3.field10432);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg3.field10461 >= 0) {
                if (arg3.field10461 == 65535) {
                    var23 ^= 0xFFFFFFFFL;
                    var25[3] = 0;
                } else {
                    var25[3] = class216.method1308(1073741824, arg3.field10461);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg3 != null || arg11 != null;
        int var31 = arg7 == null ? 0 : arg7.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class537.field7548[var32] = null;
            if (arg7[var32] != null) {
                class747 var33 = arg9.method643(arg7[var32].field8896, -98);
                if (var33.field10458 != null) {
                    class62.field836[var32] = var33;
                    var30 = true;
                    int var34 = arg7[var32].field8887;
                    int var35 = arg7[var32].field8889;
                    int var36 = var33.field10458[var34];
                    class537.field7548[var32] = arg9.method637((byte) -126, var36 >>> 16);
                    int var37 = var36 & 0xFFFF;
                    class513.field7233[var32] = var37;
                    if (class537.field7548[var32] != null) {
                        var28 |= class537.field7548[var32].method3154(var37, (byte) 124);
                        var27 |= class537.field7548[var32].method3156(-32146, var37);
                        var29 |= class537.field7548[var32].method3155(var37, (byte) -109);
                    }
                    if ((var33.field10436 || class322.field4112) && var35 != -1 && var33.field10458.length > var35) {
                        class288.field3668[var32] = var33.field10453[var34];
                        class17.field232[var32] = arg7[var32].field8890;
                        int var38 = var33.field10458[var35];
                        class447.field6291[var32] = arg9.method637((byte) -123, var38 >>> 16);
                        int var39 = var38 & 0xFFFF;
                        class747.field10450[var32] = var39;
                        if (class447.field6291[var32] != null) {
                            var28 |= class447.field6291[var32].method3154(var39, (byte) 96);
                            var27 |= class447.field6291[var32].method3156(-32146, var39);
                            var29 |= class447.field6291[var32].method3155(var39, (byte) -115);
                        }
                    } else {
                        class288.field3668[var32] = 0;
                        class17.field232[var32] = 0;
                        class447.field6291[var32] = null;
                        class747.field10450[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        int var43 = 16 % ((49 - arg0) / 56);
        class555 var44 = null;
        class555 var45 = null;
        int var46 = -1;
        int var47 = -1;
        int var48 = 0;
        class555 var49 = null;
        class555 var50 = null;
        if (var30) {
            var22 = arg2 | 0x20;
            if (arg3 != null) {
                int var51 = arg3.field10458[arg18];
                int var52 = var51 >>> 16;
                var44 = arg9.method637((byte) -125, var52);
                var40 = var51 & 0xFFFF;
                if (var44 != null) {
                    var28 |= var44.method3154(var40, (byte) -113);
                    var27 |= var44.method3156(-32146, var40);
                    var29 |= var44.method3155(var40, (byte) -71);
                }
                if ((arg3.field10436 || class322.field4112) && arg15 != -1 && arg3.field10458.length > arg15) {
                    var42 = arg3.field10453[arg18];
                    int var53 = arg3.field10458[arg15];
                    int var54 = var53 >>> 16;
                    var45 = var52 == var54 ? var44 : arg9.method637((byte) -126, var54);
                    var41 = var53 & 0xFFFF;
                    if (var45 != null) {
                        var28 |= var45.method3154(var41, (byte) -84);
                        var27 |= var45.method3156(-32146, var41);
                        var29 |= var45.method3155(var41, (byte) 125);
                    }
                }
            }
            if (arg11 != null) {
                int var55 = arg11.field10458[arg6];
                int var56 = var55 >>> 16;
                var46 = var55 & 0xFFFF;
                var49 = arg9.method637((byte) -124, var56);
                if (var49 != null) {
                    var28 |= var49.method3154(var46, (byte) -26);
                    var27 |= var49.method3156(-32146, var46);
                    var29 |= var49.method3155(var46, (byte) -97);
                }
                if ((arg11.field10436 || class322.field4112) && arg5 != -1 && arg11.field10458.length > arg5) {
                    var48 = arg11.field10453[arg6];
                    int var57 = arg11.field10458[arg5];
                    int var58 = var57 >>> 16;
                    var50 = var56 == var58 ? var49 : arg9.method637((byte) -126, var58);
                    var47 = var57 & 0xFFFF;
                    if (var50 != null) {
                        var28 |= var50.method3154(var47, (byte) 127);
                        var27 |= var50.method3156(-32146, var47);
                        var29 |= var50.method3155(var47, (byte) -87);
                    }
                }
            }
            if (var28) {
                var22 |= 0x80;
            }
            if (var27) {
                var22 |= 0x100;
            }
            if (var29) {
                var22 |= 0x400;
            }
        }
        class114 var59 = class124.field1474;
        class219 var60;
        synchronized (class124.field1474) {
            var60 = (class219) class124.field1474.method778(var23, -86);
        }
        class459 var61 = null;
        if (this.field4152 != -1) {
            var61 = arg17.method2848(-59, this.field4152);
        }
        if (var60 == null || arg8.method135(var60.method1340(), var22) != 0) {
            if (var60 != null) {
                var22 = arg8.method100(var22, var60.method1340());
            }
            boolean var63 = false;
            int var64 = 0;
            while (true) {
                if (var64 >= 12) {
                    if (var63) {
                        if (this.field4167 != -1L) {
                            class114 var66 = class124.field1474;
                            synchronized (class124.field1474) {
                                var60 = (class219) class124.field1474.method778(this.field4167, -3);
                            }
                        }
                        if (var60 == null || arg8.method135(var60.method1340(), var22) != 0) {
                            return null;
                        }
                    } else {
                        class415[] var67 = new class415[12];
                        for (int var68 = 0; var68 < 12; var68++) {
                            int var69 = var25[var68];
                            if ((var69 & 0x40000000) != 0) {
                                class415 var70 = arg13.method3944(256, var69 & 0x3FFFFFFF).method1052(false, this.field4151);
                                if (var70 != null) {
                                    var67[var68] = var70;
                                }
                            } else if ((Integer.MIN_VALUE & var69) != 0) {
                                class415 var71 = arg1.method2485(1, var69 & 0x3FFFFFFF).method2585((byte) -91);
                                if (var71 != null) {
                                    var67[var68] = var71;
                                }
                            }
                        }
                        if (var61 != null && var61.field6454 != null) {
                            for (int var72 = 0; var72 < var61.field6454.length; var72++) {
                                if (var67[var72] != null) {
                                    int var73 = 0;
                                    int var74 = 0;
                                    int var75 = 0;
                                    int var76 = 0;
                                    int var77 = 0;
                                    int var78 = 0;
                                    if (var61.field6454[var72] != null) {
                                        var78 = var61.field6454[var72][5] << 3;
                                        var74 = var61.field6454[var72][1];
                                        var76 = var61.field6454[var72][3] << 3;
                                        var77 = var61.field6454[var72][4] << 3;
                                        var73 = var61.field6454[var72][0];
                                        var75 = var61.field6454[var72][2];
                                    }
                                    if (var76 != 0 || var77 != 0 || var78 != 0) {
                                        var67[var72].method2467(var76, var78, -1001, var77);
                                    }
                                    if (var73 != 0 || var74 != 0 || var75 != 0) {
                                        var67[var72].method2459(var73, 19316, var74, var75);
                                    }
                                }
                            }
                        }
                        int var79 = var22 | 0x4000;
                        class415 var80 = new class415(var67, var67.length);
                        var60 = arg8.method150(var80, var79, class703.field9905, 64, 850);
                        for (int var81 = 0; var81 < 5; var81++) {
                            for (int var82 = 0; var82 < class674.field9172.length; var82++) {
                                if (class674.field9172[var82][var81].length > this.field4154[var81]) {
                                    var60.method1362(class58.field823[var82][var81], class674.field9172[var82][var81][this.field4154[var81]]);
                                }
                            }
                        }
                        if (arg14) {
                            var60.method1327(var22);
                            class114 var83 = class124.field1474;
                            synchronized (class124.field1474) {
                                class124.field1474.method774(var23, -31, var60);
                            }
                            this.field4167 = var23;
                        }
                    }
                    break;
                }
                int var65 = var25[var64];
                if ((var65 & 0x40000000) == 0) {
                    if ((var65 & Integer.MIN_VALUE) != 0 && !arg1.method2485(1, var65 & 0x3FFFFFFF).method2586(true)) {
                        var63 = true;
                    }
                } else if (!arg13.method3944(256, var65 & 0x3FFFFFFF).method1042(this.field4151, false)) {
                    var63 = true;
                }
                var64++;
            }
        }
        class219 var84 = var60.method1337((byte) 4, var22, true);
        boolean var85 = false;
        if (arg4 != null) {
            for (int var86 = 0; var86 < 12; var86++) {
                if (arg4[var86] != -1) {
                    var85 = true;
                }
            }
        }
        if (!var30 && !var85) {
            return var84;
        }
        class376[] var87 = null;
        if (var61 != null) {
            var87 = var61.method2689((byte) -80, arg8);
        }
        if (var85 && var87 != null) {
            for (int var88 = 0; var88 < 12; var88++) {
                if (var87[var88] != null) {
                    var84.method1325(var87[var88], 0x1 << var88, true);
                }
            }
        }
        int var89 = 0;
        int var90 = 1;
        while (var89 < var31) {
            if (class537.field7548[var89] != null) {
                var84.method1354(class288.field3668[var89], class513.field7233[var89], null, var90, true, class17.field232[var89] - 1, class747.field10450[var89], false, class447.field6291[var89], 0, class537.field7548[var89]);
            }
            var90 <<= 0x1;
            var89++;
        }
        if (var85) {
            for (int var91 = 0; var91 < 12; var91++) {
                if (arg4[var91] != -1) {
                    int var92 = arg4[var91] - arg19;
                    int var93 = var92 & 0x3FFF;
                    class376 var94 = arg8.method125();
                    var94.method1976(var93);
                    var84.method1325(var94, 0x1 << var91, false);
                }
            }
        }
        if (var85 && var87 != null) {
            for (int var95 = 0; var95 < 12; var95++) {
                if (var87[var95] != null) {
                    var84.method1325(var87[var95], 0x1 << var95, false);
                }
            }
        }
        if (var44 != null && var49 != null) {
            var84.method1346(var48, arg3.field10439, arg20 - 1, (byte) 78, var46, var40, var45, var41, var42, var50, arg12 - 1, false, var47, var49, var44);
        } else if (var44 != null) {
            var84.method1360(0, (byte) 63, var42, var45, false, var40, var41, var44, arg20 - 1);
        } else if (var49 != null) {
            var84.method1360(0, (byte) -102, var48, var50, false, var46, var47, var49, arg12 - 1);
        }
        for (int var96 = 0; var96 < var31; var96++) {
            class537.field7548[var96] = null;
            class447.field6291[var96] = null;
            class62.field836[var96] = null;
        }
        return var84;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lha;Lnaa;Ldk;Lfg;Lrj;IILqr;Liba;III)Lka;")
    public final class219 method1928(class454 arg0, class93 arg1, class683 arg2, class418 arg3, class747 arg4, int arg5, int arg6, class713 arg7, class224 arg8, int arg9, int arg10, int arg11) {
        field4164++;
        if (this.field4171 != -1) {
            return arg8.method1452(this.field4171, 64).method970(arg11, arg0, arg10, arg1, (byte) -121, arg2, arg9, arg5, arg4);
        }
        int var13 = arg9;
        if (arg4 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg4.field10458[arg10];
            var13 = arg9 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class555 var25 = arg1.method637((byte) -127, var23);
            if (var25 != null) {
                var15 |= var25.method3154(var24, (byte) -128);
                var14 |= var25.method3156(-32146, var24);
                var17 |= var25.method3155(var24, (byte) 70);
                var16 |= arg4.field10459;
            }
            if ((arg4.field10436 || class322.field4112) && arg5 != -1 && arg5 < arg4.field10458.length) {
                int var26 = arg4.field10458[arg5];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class555 var29 = var23 == var27 ? var25 : arg1.method637((byte) -124, var27);
                if (var29 != null) {
                    var15 |= var29.method3154(var28, (byte) -45);
                    var14 |= var29.method3156(-32146, var28);
                    var17 |= var29.method3155(var28, (byte) -125);
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
        class114 var30 = class626.field8729;
        class219 var31;
        synchronized (class626.field8729) {
            var31 = (class219) class626.field8729.method778(this.field4150, 105);
        }
        if (var31 == null || arg0.method135(var31.method1340(), var13) != 0) {
            if (var31 != null) {
                var13 = arg0.method100(var13, var31.method1340());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field4169[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg3.method2485(1, var35 & 0x3FFFFFFF).method2590((byte) 18)) {
                        var33 = true;
                    }
                } else if (!arg7.method3944(256, var35 & 0x3FFFFFFF).method1043(this.field4151, 0)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class415[] var36 = new class415[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field4169[var38];
                if ((var39 & 0x40000000) != 0) {
                    class415 var40 = arg7.method3944(arg6 ^ 0x40000100, var39 & 0x3FFFFFFF).method1046(-87, this.field4151);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class415 var41 = arg3.method2485(1, var39 & 0x3FFFFFFF).method2591(arg6 ^ 0xBFFFFF8F);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class415 var43 = new class415(var36, var37);
            var31 = arg0.method150(var43, var42, class703.field9905, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class674.field9172.length; var45++) {
                    if (class674.field9172[var45][var44].length > this.field4154[var44]) {
                        var31.method1362(class58.field823[var45][var44], class674.field9172[var45][var44][this.field4154[var44]]);
                    }
                }
            }
            var31.method1327(var13);
            class114 var46 = class626.field8729;
            synchronized (class626.field8729) {
                class626.field8729.method774(this.field4150, 121, var31);
            }
        }
        if (arg4 == null) {
            return var31;
        } else if (arg6 == 1073741824) {
            var31.method1337((byte) 4, var13, true);
            return arg4.method4175(arg10, var31, arg11, arg5, arg9, 98);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1929(String arg0, byte arg1) {
        field4163++;
        int var2 = 114 % ((arg1 + 37) / 40);
        for (int var3 = 0; var3 < class146.field1759.length; var3++) {
            if (class146.field1759[var3].equalsIgnoreCase(arg0)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILqr;IB)V")
    public final void method1930(int arg0, class713 arg1, int arg2, byte arg3) {
        field4162++;
        if (arg0 == -1) {
            this.field4169[arg2] = 0;
        } else if (arg1.method3944(256, arg0) == null) {
            return;
        } else {
            this.field4169[arg2] = class216.method1308(arg0, 1073741824);
            this.method1922(arg3 ^ 0x19);
        }
        if (arg3 != 25) {
            this.field4171 = -68;
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)V")
    public static void method1931(int arg0) {
        if (arg0 == -11378) {
            field4157 = null;
            field4170 = null;
            field4165 = null;
        }
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V")
    public static final void method1932(int arg0) {
        field4155++;
        class347.field4487.method3574(17291);
        class251.field3182.method633(true);
        class5.field52.method2484(1);
        class358.field5112.method887(1);
        class598.field8304.method1453(-115);
        class190.field2488.method3950(false);
        class646.field8903.method640(-1);
        class250.field3177.method3615(arg0 + arg0);
        class197.field2537.method2537(0);
        class348.field4512.method947(true);
        class190.field2501.method2853((byte) 10);
        class70.field946.method1485((byte) -84);
        class37.field551.method2770(-118);
        class223.field2925.method1248(-125);
        class188.field2466.method3446(true);
        class182.field2384.method2997(-2029);
        class696.field9859.method1178((byte) -122);
        class545.field7652.method433((byte) 114);
        class525.field7423.method207(true);
        class580.field8064.method1029((byte) 125);
        class398.field5521.method2712((byte) -120);
        class208.method1280(23676);
        class328.method1941(-97);
        class236.method1478(2);
        class548.method3128(arg0 + 110);
        if (class323.field4120 != class171.field2248) {
            for (int var1 = 0; var1 < class539.field7597.length; var1++) {
                class539.field7597[var1] = null;
            }
            class31.field493 = 0;
        }
        class443.method2610((byte) -30);
        class551.method3136((byte) 86);
        class346.method2030((byte) -103);
        class517.method2968(5121);
        class167.method1051((byte) 101);
        class445.field6276.method776((byte) 58);
        class458.field6407.method142();
        class440.method2597(8000);
        class283.method1703(-6);
        class562.field7865.method3835((byte) -106);
        class459.field6436.method3835((byte) -106);
        class565.field7911.method3835((byte) -106);
        class570.field7946.method3835((byte) -106);
        class1.field2.method3835((byte) -106);
        class541.field7613.method3835((byte) -106);
        class456.field6388.method3835((byte) -106);
        class426.field6058.method3835((byte) -106);
        class645.field8897.method3835((byte) -106);
        class399.field5523.method3835((byte) -106);
        class548.field7731.method3835((byte) -106);
        class487.field6937.method3835((byte) -106);
        class27.field446.method3835((byte) -106);
        class378.field5293.method3835((byte) -106);
        class107.field1327.method3835((byte) -106);
        class250.field3179.method3835((byte) -106);
        class274.field3470.method3835((byte) -106);
        class37.field544.method3835((byte) -106);
        class687.field9729.method3835((byte) -106);
        class438.field6162.method3835((byte) -106);
        class530.field7471.method3835((byte) -106);
        class394.field5493.method3835((byte) -106);
        class102.field1255.method3835((byte) -106);
        class250.field3180.method3835((byte) -106);
        class494.field6985.method3835((byte) -106);
        class505.field7136.method3835((byte) -106);
        class224.field2954.method3835((byte) -106);
        class322.field4109.method3835((byte) -106);
        class395.field5502.method3835((byte) -106);
        class603.field8364.method3835((byte) -106);
        class663.field9080.method3835((byte) -106);
        class447.field6293.method3835((byte) -106);
        class583.field8102.method3835((byte) -106);
        class504.field7104.method776((byte) 118);
        class645.field8893.method776((byte) 68);
        class229.field2992.method776((byte) -85);
        class576.field8038.method776((byte) 78);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)V")
    public final void method1933(int arg0, int arg1, int arg2) {
        field4160++;
        this.field4154[arg2] = arg0;
        this.method1922(0);
        if (arg1 != 128) {
            method1932(-67);
        }
    }
}
