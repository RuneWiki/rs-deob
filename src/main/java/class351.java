import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class351 {

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public int field5132 = -1;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    private int field5126;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "J")
    private long field5131;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "J")
    private long field5133;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
    public boolean field5124;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "[I")
    public int[] field5136;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "[I")
    private int[] field5141;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[[I")
    private int[][] field5127;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2191(int arg0) {
        if (arg0 != -30333) {
            field5122 = 93;
        }
        field5130++;
        try {
            if (class369.field5301 == 1) {
                int var1 = class648.field9178.method311((byte) -127);
                if (var1 > 0 && class648.field9178.method314((byte) -112)) {
                    int var2 = var1 - class490.field6609;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class648.field9178.method346(2, var2);
                } else {
                    class648.field9178.method306(arg0 ^ 0x7616);
                    class648.field9178.method336(115);
                    class582.field8025 = null;
                    class86.field1056 = null;
                    if (class168.field2093 == null) {
                        class369.field5301 = 0;
                    } else {
                        class369.field5301 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class648.field9178.method306(-110);
            class86.field1056 = null;
            class582.field8025 = null;
            class168.field2093 = null;
            class369.field5301 = 0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIILwl;)V", line = 49)
    public final void method2192(int arg0, int arg1, int arg2, class30 arg3) {
        int var5 = 101 % ((-arg0 - 45) / 62);
        field5140++;
        int var6 = class587.field8068[arg2];
        if (this.field5141[var6] != 0 && arg3.method182(arg1, 7) != null) {
            this.field5141[var6] = class288.method1722(arg1, Integer.MIN_VALUE);
            this.method2194((byte) 77);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII)V", line = 69)
    public static final void method2193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5135++;
        if (class72.field935.field6512 != 0 && arg2 != 0 && class485.field6555 < 50 && arg1 != -1) {
            class658.field9278[class485.field6555++] = new class578((byte) 1, arg1, arg2, arg0, arg3, arg5);
        }
        if (arg4 != -796) {
            method2193(-114, -49, -73, 78, 82, -94);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 87)
    private final void method2194(byte arg0) {
        field5139++;
        this.field5131 = -1L;
        long[] var2 = class604.field8265;
        this.field5131 = this.field5131 >>> 8 ^ var2[(int) ((this.field5131 ^ (long) (this.field5126 >> 8)) & 0xFFL)];
        this.field5131 = var2[(int) ((this.field5131 ^ (long) this.field5126) & 0xFFL)] ^ this.field5131 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field5131 = this.field5131 >>> 8 ^ var2[(int) (((long) (this.field5141[var3] >> 24) ^ this.field5131) & 0xFFL)];
            this.field5131 = this.field5131 >>> 8 ^ var2[(int) ((this.field5131 ^ (long) (this.field5141[var3] >> 16)) & 0xFFL)];
            this.field5131 = this.field5131 >>> 8 ^ var2[(int) ((this.field5131 ^ (long) (this.field5141[var3] >> 8)) & 0xFFL)];
            this.field5131 = var2[(int) ((this.field5131 ^ (long) this.field5141[var3]) & 0xFFL)] ^ this.field5131 >>> 8;
        }
        int var4 = 0;
        if (arg0 < 48) {
            this.method2195((byte) -49, -94, 52);
        }
        while (var4 < 5) {
            this.field5131 = this.field5131 >>> 8 ^ var2[(int) (((long) this.field5136[var4] ^ this.field5131) & 0xFFL)];
            var4++;
        }
        this.field5131 = this.field5131 >>> 8 ^ var2[(int) ((this.field5131 ^ (long) (this.field5124 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)V", line = 125)
    public final void method2195(byte arg0, int arg1, int arg2) {
        this.field5136[arg1] = arg2;
        int var4 = 84 % ((36 - arg0) / 35);
        field5125++;
        this.method2194((byte) 115);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIILfq;Loa;Lwm;ILmo;Ldd;Lwl;Lqb;)Lba;", line = 140)
    public final class629 method2196(int arg0, int arg1, int arg2, int arg3, class463 arg4, class689 arg5, class129 arg6, int arg7, class618 arg8, class212 arg9, class30 arg10, class219 arg11) {
        field5129++;
        if (this.field5132 != -1) {
            return arg8.method3384((byte) 78, this.field5132).method1253(arg9, arg3, arg6, arg1, arg2 ^ 0xFFFF8B52, arg4, arg5, arg0, arg7);
        }
        int var13 = arg1;
        if (arg4 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg4.field6307[arg7];
            var13 = arg1 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class495 var24 = arg6.method774(var23, -120);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2792(0, var25);
                var14 |= var24.method2791(9675, var25);
                var17 |= var24.method2796(var25, (byte) 38);
                var16 |= arg4.field6335;
            }
            if ((arg4.field6327 || class425.field5919) && arg3 != -1 && arg3 < arg4.field6307.length) {
                int var26 = arg4.field6307[arg3];
                int var27 = var26 >>> 16;
                class495 var28 = var23 == var27 ? var24 : arg6.method774(var27, -122);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method2792(0, var29);
                    var14 |= var28.method2791(9675, var29);
                    var17 |= var28.method2796(var29, (byte) 38);
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
        class560 var30 = class31.field301;
        class629 var31;
        synchronized (class31.field301) {
            var31 = (class629) class31.field301.method3134(this.field5131, -20);
            if (arg2 != -29870) {
                method2193(-32, -127, -79, 59, -115, 54);
            }
        }
        if (var31 == null || arg5.method2007(var31.method688(), var13) != 0) {
            if (var31 != null) {
                var13 = arg5.method1987(var13, var31.method688());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field5141[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg10.method182(var35 & 0x3FFFFFFF, 7).method3417(arg2 ^ 0x74C7)) {
                        var33 = true;
                    }
                } else if (!arg11.method1349(arg2 + 29869, var35 & 0x3FFFFFFF).method3662(25905, this.field5124)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class238[] var36 = new class238[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field5141[var38];
                if ((var39 & 0x40000000) != 0) {
                    class238 var41 = arg11.method1349(-1, var39 & 0x3FFFFFFF).method3669(arg2 ^ 0x74A0, this.field5124);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class238 var40 = arg10.method182(var39 & 0x3FFFFFFF, 7).method3413(109);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class238 var42 = new class238(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg5.method1784(var42, var43, class224.field2919, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field5136[var44] < class628.field8544[var44].length) {
                    var31.method668(class454.field6199[var44], class628.field8544[var44][this.field5136[var44]]);
                }
                if (this.field5136[var44] < class333.field4860[var44].length) {
                    var31.method668(class428.field5944[var44], class333.field4860[var44][this.field5136[var44]]);
                }
            }
            var31.method655(var13);
            class560 var45 = class31.field301;
            synchronized (class31.field301) {
                class31.field301.method3130(this.field5131, true, var31);
            }
        }
        if (arg4 == null) {
            return var31;
        } else {
            var31.method659((byte) 4, var13, true);
            return arg4.method2624((byte) -113, var31, arg3, arg0, arg1, arg7);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[IZ[I)V", line = 332)
    public final void method2197(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int[] arg5) {
        if (this.field5126 != arg1) {
            this.field5126 = arg1;
            this.field5127 = null;
        }
        this.field5132 = arg2;
        this.field5124 = arg4;
        this.field5136 = arg5;
        this.field5141 = arg3;
        field5134++;
        this.method2194((byte) 89);
        if (arg0 != 19560) {
            this.method2198(null, 110, null, 99, -84, -114, 83, 81, -109, null, null, 38);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lfq;ILwl;IIIIIILwm;Loa;I)Lba;", line = 366)
    public final class629 method2198(class463 arg0, int arg1, class30 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class129 arg9, class689 arg10, int arg11) {
        field5138++;
        if (arg8 != -1) {
            this.method2200(null, -115, null, 85, (byte) 58, 94, null, null, null, null, null, null, -16, 112, 73, null, null, false, 24);
        }
        int var13 = arg6;
        if (arg0 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg6 | 0x20;
            int var21 = arg0.field6307[arg11];
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class495 var25 = arg9.method774(var23, arg8 - 127);
            if (var25 != null) {
                var15 |= var25.method2792(0, var24);
                var14 |= var25.method2791(9675, var24);
                var17 |= var25.method2796(var24, (byte) 38);
                var16 |= arg0.field6335;
            }
            if ((arg0.field6327 || class425.field5919) && arg3 != -1 && arg0.field6307.length > arg3) {
                int var26 = arg0.field6307[arg3];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class495 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg9.method774(var28 >>> 16, -123);
                }
                if (var29 != null) {
                    var15 |= var29.method2792(~arg8, var28);
                    var14 |= var29.method2791(9675, var28);
                    var17 |= var29.method2796(var28, (byte) 38);
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
        long var30 = (long) (arg7 << 16) | (long) arg4 << 32 | (long) arg5;
        class560 var32 = class31.field301;
        class629 var33;
        synchronized (class31.field301) {
            var33 = (class629) class31.field301.method3134(var30, arg8 - 45);
        }
        if (var33 == null || arg10.method2007(var33.method688(), var13) != 0) {
            if (var33 != null) {
                var13 = arg10.method1987(var13, var33.method688());
            }
            class238[] var35 = new class238[3];
            int var36 = 0;
            if (!arg2.method182(arg5, 7).method3417(-120) || !arg2.method182(arg7, 7).method3417(arg8 - 115) || !arg2.method182(arg4, arg8 ^ 0xFFFFFFF8).method3417(-107)) {
                return null;
            }
            class238 var37 = arg2.method182(arg5, arg8 ^ 0xFFFFFFF8).method3413(72);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class238 var38 = arg2.method182(arg7, 7).method3413(arg8 + 121);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class238 var39 = arg2.method182(arg4, 7).method3413(58);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class238 var41 = new class238(var35, var36);
            var33 = arg10.method1784(var41, var40, class224.field2919, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class628.field8544[var42].length > this.field5136[var42]) {
                    var33.method668(class454.field6199[var42], class628.field8544[var42][this.field5136[var42]]);
                }
                if (this.field5136[var42] < class333.field4860[var42].length) {
                    var33.method668(class428.field5944[var42], class333.field4860[var42][this.field5136[var42]]);
                }
            }
            var33.method655(var13);
            class560 var43 = class31.field301;
            synchronized (class31.field301) {
                class31.field301.method3130(var30, true, var33);
            }
        }
        if (arg0 == null) {
            return var33;
        } else {
            class629 var44 = var33.method659((byte) 4, var13, true);
            return arg0.method2624((byte) -102, var44, arg3, arg1, arg6, arg11);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BZ)V", line = 516)
    public final void method2199(byte arg0, boolean arg1) {
        field5128++;
        this.field5124 = arg1;
        int var3 = 45 / ((6 - arg0) / 45);
        this.method2194((byte) 114);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ldd;ILwm;IBILfq;[Luu;Lmo;Lwl;Loa;Lfq;IIILlq;Lqb;ZI)Lba;", line = 529)
    public final class629 method2200(class212 arg0, int arg1, class129 arg2, int arg3, byte arg4, int arg5, class463 arg6, class589[] arg7, class618 arg8, class30 arg9, class689 arg10, class463 arg11, int arg12, int arg13, int arg14, class311 arg15, class219 arg16, boolean arg17, int arg18) {
        field5137++;
        if (this.field5132 != -1) {
            return arg8.method3384((byte) 117, this.field5132).method1243(arg14, arg7, arg18, arg5, 229963619, arg15, arg11, arg2, arg0, arg1, arg6, arg12, arg13, arg10, arg3);
        }
        int var20 = arg13;
        long var21 = this.field5131;
        int[] var23 = this.field5141;
        if (arg11 != null && (arg11.field6321 >= 0 || arg11.field6308 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field5141[var24];
            }
            if (arg11.field6321 >= 0) {
                if (arg11.field6321 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class288.method1722(1073741824, arg11.field6321);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg11.field6308 >= 0) {
                if (arg11.field6308 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class288.method1722(1073741824, arg11.field6308);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg11 != null || arg6 != null;
        int var29 = arg7 == null ? 0 : arg7.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class170.field2119[var30] = null;
            if (arg7[var30] != null) {
                class463 var31 = arg2.method776(arg7[var30].field8091, (byte) -110);
                if (var31.field6307 != null) {
                    var28 = true;
                    class558.field7606[var30] = var31;
                    int var32 = arg7[var30].field8089;
                    int var33 = arg7[var30].field8088;
                    int var34 = var31.field6307[var32];
                    class170.field2119[var30] = arg2.method774(var34 >>> 16, -122);
                    int var35 = var34 & 0xFFFF;
                    class335.field4931[var30] = var35;
                    if (class170.field2119[var30] != null) {
                        var26 |= class170.field2119[var30].method2792(0, var35);
                        var25 |= class170.field2119[var30].method2791(9675, var35);
                        var27 |= class170.field2119[var30].method2796(var35, (byte) 38);
                    }
                    if ((var31.field6327 || class425.field5919) && var33 != -1 && var33 < var31.field6307.length) {
                        class662.field9388[var30] = var31.field6319[var32];
                        class403.field5712[var30] = arg7[var30].field8083;
                        int var36 = var31.field6307[var33];
                        class164.field2066[var30] = arg2.method774(var36 >>> 16, -127);
                        int var37 = var36 & 0xFFFF;
                        class218.field2829[var30] = var37;
                        if (class164.field2066[var30] != null) {
                            var26 |= class164.field2066[var30].method2792(0, var37);
                            var25 |= class164.field2066[var30].method2791(9675, var37);
                            var27 |= class164.field2066[var30].method2796(var37, (byte) 38);
                        }
                    } else {
                        class662.field9388[var30] = 0;
                        class403.field5712[var30] = 0;
                        class164.field2066[var30] = null;
                        class218.field2829[var30] = -1;
                    }
                }
            }
        }
        int var38 = -126 % ((arg4 - 26) / 41);
        int var39 = -1;
        int var40 = -1;
        int var41 = 0;
        class495 var42 = null;
        class495 var43 = null;
        int var44 = -1;
        int var45 = -1;
        int var46 = 0;
        class495 var47 = null;
        class495 var48 = null;
        if (var28) {
            if (arg11 != null) {
                int var49 = arg11.field6307[arg18];
                int var50 = var49 >>> 16;
                var42 = arg2.method774(var50, -118);
                var39 = var49 & 0xFFFF;
                if (var42 != null) {
                    var26 |= var42.method2792(0, var39);
                    var25 |= var42.method2791(9675, var39);
                    var27 |= var42.method2796(var39, (byte) 38);
                }
                if ((arg11.field6327 || class425.field5919) && arg5 != -1 && arg5 < arg11.field6307.length) {
                    var41 = arg11.field6319[arg18];
                    int var51 = arg11.field6307[arg5];
                    int var52 = var51 >>> 16;
                    var43 = var50 == var52 ? var42 : arg2.method774(var52, -118);
                    var40 = var51 & 0xFFFF;
                    if (var43 != null) {
                        var26 |= var43.method2792(0, var40);
                        var25 |= var43.method2791(9675, var40);
                        var27 |= var43.method2796(var40, (byte) 38);
                    }
                }
            }
            var20 = arg13 | 0x20;
            if (arg6 != null) {
                int var53 = arg6.field6307[arg12];
                int var54 = var53 >>> 16;
                var44 = var53 & 0xFFFF;
                var47 = arg2.method774(var54, -118);
                if (var47 != null) {
                    var26 |= var47.method2792(0, var44);
                    var25 |= var47.method2791(9675, var44);
                    var27 |= var47.method2796(var44, (byte) 38);
                }
                if ((arg6.field6327 || class425.field5919) && arg3 != -1 && arg3 < arg6.field6307.length) {
                    var46 = arg6.field6319[arg12];
                    int var55 = arg6.field6307[arg3];
                    int var56 = var55 >>> 16;
                    var48 = var54 == var56 ? var47 : arg2.method774(var56, -127);
                    var45 = var55 & 0xFFFF;
                    if (var48 != null) {
                        var26 |= var48.method2792(0, var45);
                        var25 |= var48.method2791(9675, var45);
                        var27 |= var48.method2796(var45, (byte) 38);
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
        class560 var57 = class445.field6125;
        class629 var58;
        synchronized (class445.field6125) {
            var58 = (class629) class445.field6125.method3134(var21, -26);
        }
        class334 var59 = null;
        if (this.field5126 != -1) {
            var59 = arg15.method1868(15624, this.field5126);
        }
        if (var58 == null || arg10.method2007(var58.method688(), var20) != 0 || var59 != null && var59.field4907 != null && this.field5127 == null) {
            if (var58 != null) {
                var20 = arg10.method1987(var20, var58.method688());
            }
            boolean var61 = false;
            int var62 = 0;
            while (true) {
                if (var62 >= 12) {
                    if (var61) {
                        if (this.field5133 != -1L) {
                            class560 var64 = class445.field6125;
                            synchronized (class445.field6125) {
                                var58 = (class629) class445.field6125.method3134(this.field5133, -74);
                            }
                        }
                        if (var58 == null || arg10.method2007(var58.method688(), var20) != 0 || var59 != null && var59.field4907 != null && this.field5127 == null) {
                            return null;
                        }
                    } else {
                        class238[] var65 = new class238[12];
                        for (int var66 = 0; var66 < 12; var66++) {
                            int var67 = var23[var66];
                            if ((var67 & 0x40000000) != 0) {
                                class238 var69 = arg16.method1349(-1, var67 & 0x3FFFFFFF).method3652(107, this.field5124);
                                if (var69 != null) {
                                    var65[var66] = var69;
                                }
                            } else if ((Integer.MIN_VALUE & var67) != 0) {
                                class238 var68 = arg9.method182(var67 & 0x3FFFFFFF, 7).method3416(false);
                                if (var68 != null) {
                                    var65[var66] = var68;
                                }
                            }
                        }
                        if (var59 != null && var59.field4907 != null) {
                            for (int var70 = 0; var70 < var59.field4907.length; var70++) {
                                if (var59.field4907[var70] != null && var65[var70] != null) {
                                    int var71 = var59.field4907[var70][0];
                                    int var72 = var59.field4907[var70][1];
                                    int var73 = var59.field4907[var70][2];
                                    int var74 = var59.field4907[var70][3] << 3;
                                    int var75 = var59.field4907[var70][4] << 3;
                                    int var76 = var59.field4907[var70][5] << 3;
                                    if (this.field5127 == null) {
                                        this.field5127 = new int[var59.field4907.length][];
                                    }
                                    if (this.field5127[var70] == null) {
                                        int[] var77 = this.field5127[var70] = new int[15];
                                        if (var74 == 0 && var75 == 0 && var76 == 0) {
                                            var77[12] = -var71;
                                            var77[0] = var77[4] = var77[8] = 32768;
                                            var77[13] = -var72;
                                            var77[14] = -var73;
                                        } else {
                                            int var78 = class654.field9260[var74];
                                            int var79 = class654.field9259[var74];
                                            int var80 = class654.field9260[var75];
                                            int var81 = class654.field9259[var75];
                                            int var82 = class654.field9260[var76];
                                            int var83 = class654.field9259[var76];
                                            int var84 = var79 * var82 + 8192 >> 14;
                                            int var85 = var79 * var83 + 8192 >> 14;
                                            var77[2] = var78 * var81 + 8192 >> 14;
                                            var77[4] = var78 * var82 + 8192 >> 14;
                                            var77[0] = var80 * var82 + var81 * var85 + 8192 >> 14;
                                            var77[5] = -var79;
                                            var77[7] = -var81 * -var83 + var80 * var84 + 8192 >> 14;
                                            var77[8] = var78 * var80 + 8192 >> 14;
                                            var77[1] = -var83 * var80 + var81 * var84 + 8192 >> 14;
                                            var77[6] = -var81 * var82 - (-(var80 * var85) - 8192) >> 14;
                                            var77[3] = var78 * var83 + 8192 >> 14;
                                            var77[13] = var77[4] * -var72 + var77[1] * -var71 + (var77[7] * -var73) + 8192 >> 14;
                                            var77[14] = var77[5] * -var72 + var77[2] * -var71 + (var77[8] * -var73) + 8192 >> 14;
                                            var77[12] = var77[6] * -var73 + (var77[3] * -var72 + var77[0] * -var71 + 8192) >> 14;
                                        }
                                        var77[11] = var73;
                                        var77[9] = var71;
                                        var77[10] = var72;
                                    }
                                    if (var74 != 0 || var75 != 0 || var76 != 0) {
                                        var65[var70].method1466(var76, var75, 256, var74);
                                    }
                                    if (var71 != 0 || var72 != 0 || var73 != 0) {
                                        var65[var70].method1468(var72, (byte) 67, var71, var73);
                                    }
                                }
                            }
                        }
                        int var86 = var20 | 0x4000;
                        class238 var87 = new class238(var65, var65.length);
                        var58 = arg10.method1784(var87, var86, class224.field2919, 64, 850);
                        for (int var88 = 0; var88 < 5; var88++) {
                            if (class628.field8544[var88].length > this.field5136[var88]) {
                                var58.method668(class454.field6199[var88], class628.field8544[var88][this.field5136[var88]]);
                            }
                            if (this.field5136[var88] < class333.field4860[var88].length) {
                                var58.method668(class428.field5944[var88], class333.field4860[var88][this.field5136[var88]]);
                            }
                        }
                        if (arg17) {
                            var58.method655(var20);
                            class560 var89 = class445.field6125;
                            synchronized (class445.field6125) {
                                class445.field6125.method3130(var21, true, var58);
                            }
                            this.field5133 = var21;
                        }
                    }
                    break;
                }
                int var63 = var23[var62];
                if ((var63 & 0x40000000) == 0) {
                    if ((var63 & Integer.MIN_VALUE) != 0 && !arg9.method182(var63 & 0x3FFFFFFF, 7).method3414(0)) {
                        var61 = true;
                    }
                } else if (!arg16.method1349(-1, var63 & 0x3FFFFFFF).method3661(this.field5124, -1076258878)) {
                    var61 = true;
                }
                var62++;
            }
        }
        class629 var90 = var58.method659((byte) 4, var20, true);
        if (!var28) {
            return var90;
        }
        int var91 = 0;
        int var92 = 1;
        while (var91 < var29) {
            if (class170.field2119[var91] != null) {
                var90.method3432(0, class218.field2829[var91], class335.field4931[var91], this.field5127 == null ? null : this.field5127[var91], class164.field2066[var91], false, class403.field5712[var91] - 1, class662.field9388[var91], var92, class170.field2119[var91], (byte) 9);
            }
            var92 <<= 0x1;
            var91++;
        }
        if (var42 != null && var47 != null) {
            var90.method3436(var47, arg1 - 1, arg11.field6311, -79, var39, var48, var45, var42, var44, var40, var41, var46, arg14 - 1, var43, false);
        } else if (var42 != null) {
            var90.method3437(0, var40, false, var41, arg14 - 1, var42, var43, false, var39);
        } else if (var47 != null) {
            var90.method3437(0, var45, false, var46, arg1 - 1, var47, var48, false, var44);
        }
        for (int var93 = 0; var93 < var29; var93++) {
            class170.field2119[var93] = null;
            class164.field2066[var93] = null;
            class558.field7606[var93] = null;
        }
        return var90;
    }
}
