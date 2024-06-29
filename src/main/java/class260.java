import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class260 {

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4249 = "Ok";

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "[I")
    public static int[] field4257 = new int[100];

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[[S")
    public static short[][] field4252 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field4264 = 0;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    private int field4245;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "J")
    private long field4246;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "J")
    private long field4261;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "Lek;")
    public static class206 field4265;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Z")
    public boolean field4255;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[I")
    public int[] field4256;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "[I")
    private int[] field4267;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "[[I")
    private int[][] field4266;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 5)
    private final void method1824(int arg0) {
        long var2 = this.field4261;
        this.field4261 = -1L;
        if (arg0 <= 126) {
            this.method1825((int[]) null, (int[]) null, -51, -21, false, -45);
        }
        long[] var4 = class250.field4086;
        this.field4261 = this.field4261 >>> 8 ^ var4[(int) (((long) (this.field4245 >> 8) ^ this.field4261) & 0xFFL)];
        field4262++;
        this.field4261 = this.field4261 >>> 8 ^ var4[(int) ((this.field4261 ^ (long) this.field4245) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4261 = this.field4261 >>> 8 ^ var4[(int) ((this.field4261 ^ (long) (this.field4267[var5] >> 24)) & 0xFFL)];
            this.field4261 = var4[(int) ((this.field4261 ^ (long) (this.field4267[var5] >> 16)) & 0xFFL)] ^ this.field4261 >>> 8;
            this.field4261 = var4[(int) (((long) (this.field4267[var5] >> 8) ^ this.field4261) & 0xFFL)] ^ this.field4261 >>> 8;
            this.field4261 = this.field4261 >>> 8 ^ var4[(int) (((long) this.field4267[var5] ^ this.field4261) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4261 = this.field4261 >>> 8 ^ var4[(int) (((long) this.field4256[var6] ^ this.field4261) & 0xFFL)];
        }
        this.field4261 = this.field4261 >>> 8 ^ var4[(int) ((this.field4261 ^ (long) (this.field4255 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field4261 != var2) {
            class300.field4865.method897(128, var2);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([I[IIIZI)V", line = 47)
    public final void method1825(int[] arg0, int[] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (this.field4245 != arg2) {
            this.field4266 = (int[][]) null;
            this.field4245 = arg2;
        }
        field4258++;
        if (arg3 != -1) {
            this.field4267 = (int[]) null;
        }
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class156.field2635; var8++) {
                    class158 var9 = class240.method1676(127, var8);
                    if (var9 != null && !var9.field2685 && var9.field2681 == (arg4 ? class110.field2015[var7] : class88.field1602[var7])) {
                        arg0[class303.field4933[var7]] = class287.method2034(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field4255 = arg4;
        this.field4256 = arg1;
        this.field4267 = arg0;
        this.field4248 = arg5;
        this.method1824(arg3 ^ 0xFFFFFF80);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BZ)V", line = 105)
    public static final void method1826(byte arg0, boolean arg1) {
        field4251++;
        for (class302 var2 = (class302) class232.field3798.method431(arg0 + 110); var2 != null; var2 = (class302) class232.field3798.method439(-28512)) {
            if (var2.field4921 != null) {
                class56.field1105.method1247(var2.field4921);
                var2.field4921 = null;
            }
            if (var2.field4920 != null) {
                class56.field1105.method1247(var2.field4920);
                var2.field4920 = null;
            }
            var2.method535(arg0 ^ 0xA9D);
        }
        if (arg0 != -110) {
            field4257 = (int[]) null;
        }
        if (!arg1) {
            return;
        }
        for (class302 var3 = (class302) class46.field931.method431(0); var3 != null; var3 = (class302) class46.field931.method439(-28512)) {
            if (var3.field4921 != null) {
                class56.field1105.method1247(var3.field4921);
                var3.field4921 = null;
            }
            var3.method535(arg0 ^ 0xA9D);
        }
        for (class302 var4 = (class302) class362.field5736.method2345((byte) -121); var4 != null; var4 = (class302) class362.field5736.method2336(arg0 ^ 0x27)) {
            if (var4.field4921 != null) {
                class56.field1105.method1247(var4.field4921);
                var4.field4921 = null;
            }
            var4.method535(arg0 ^ 0xA9D);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)I", line = 172)
    public static final int method1827(int arg0, int arg1, int arg2, int arg3) {
        field4263++;
        int var4 = class305.field4956[class95.method723(arg3, arg2)];
        if (arg0 >= -50) {
            field4264 = -82;
        }
        if (arg1 > 0) {
            int var5 = class305.field4968.method81(arg1 & 0xFFFF, -15915);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 <= 127) {
                    var6 = arg2 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00) * var5 + ((var4 & 0xFF00) * var8) & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class305.field4968.method61(arg1 & 0xFFFF, (byte) 16);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 >> 8 & 0xFF) * var9;
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                if (var11 > 65535) {
                    var11 = 65535;
                }
                var4 = (var12 >> 8) + ((var10 & 0xC100FF00) << 8) + (var11 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBI)V", line = 243)
    public final void method1828(int arg0, byte arg1, int arg2) {
        field4244++;
        if (arg1 > -107) {
            this.field4246 = 72L;
        }
        int var4 = class303.field4933[arg2];
        if (this.field4267[var4] != 0 && class240.method1676(126, arg0) != null) {
            this.field4267[var4] = class287.method2034(Integer.MIN_VALUE, arg0);
            this.method1824(127);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILjava/lang/String;Lje;ILg;IZI)V", line = 276)
    public static final void method1829(int arg0, int arg1, int arg2, String arg3, class84 arg4, int arg5, class181 arg6, int arg7, boolean arg8, int arg9) {
        field4253++;
        int var10;
        if (class69.field1280 == 4) {
            var10 = (int) class354.field5652 & 0x7FF;
        } else {
            var10 = (int) class354.field5652 + class192.field3253 & 0x7FF;
        }
        int var11 = Math.max(arg6.field3024 / 2, arg6.field2972 / 2) + 10;
        int var12 = arg2 * arg2 + arg7 * arg7;
        if (var11 * var11 < var12) {
            return;
        }
        int var13 = class305.field4959[var10];
        int var14 = class305.field4957[var10];
        if (class69.field1280 != 4) {
            var14 = var14 * 256 / (class292.field4726 + 256);
            var13 = var13 * 256 / (class292.field4726 + 256);
        }
        if (!arg8) {
            return;
        }
        int var15 = arg2 * var14 - arg7 * var13 >> 16;
        int var16 = arg2 * var13 + arg7 * var14 >> 16;
        int var17 = arg4.method647(arg3, 100);
        int var18 = arg4.method637(arg3, 100, 0);
        int var19 = var16 - var17 / 2;
        if (var19 < -arg6.field3024 || arg6.field3024 < var19 || (-arg6.field2972) > var15 || arg6.field2972 < var15) {
            return;
        }
        if (class241.field4016) {
            class337.method2381((class265) arg6.method1266(44, false));
        } else {
            class270.method1900(arg6.field3015, arg6.field2973);
        }
        arg4.method641(arg3, arg1 + var19 + (arg6.field3024 / 2), arg6.field2972 / 2 + (arg5 - (arg9 + var15 - -var18)), var17, 50, arg0, 0, 256, 1, 0, 0);
        if (class241.field4016) {
            class337.method2369();
        } else {
            class270.method1892();
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([Ljava/lang/Object;I[JII)V", line = 333)
    public static final void method1830(Object[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        field4269++;
        if (arg3 != 22598 || arg4 <= arg1) {
            return;
        }
        int var5 = arg1;
        int var6 = (arg1 + arg4) / 2;
        long var7 = arg2[var6];
        arg2[var6] = arg2[arg4];
        arg2[arg4] = var7;
        Object var9 = arg0[var6];
        arg0[var6] = arg0[arg4];
        arg0[arg4] = var9;
        for (int var10 = arg1; var10 < arg4; var10++) {
            if (((long) (var10 & 0x1) + var7) > arg2[var10]) {
                long var11 = arg2[var10];
                arg2[var10] = arg2[var5];
                arg2[var5] = var11;
                Object var13 = arg0[var10];
                arg0[var10] = arg0[var5];
                arg0[var5++] = var13;
            }
        }
        arg2[arg4] = arg2[var5];
        arg2[var5] = var7;
        arg0[arg4] = arg0[var5];
        arg0[var5] = var9;
        method1830(arg0, arg1, arg2, 22598, var5 - 1);
        method1830(arg0, var5 + 1, arg2, 22598, arg4);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIBILmi;)Lhb;", line = 393)
    public final class42 method1831(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class300 arg7) {
        field4270++;
        long var9 = (long) (arg1 << 16) | (long) arg3 << 32 | (long) arg4;
        class42 var11 = (class42) class97.field1764.method893(var9, 113);
        if (arg5 < 8) {
            method1829(-12, -104, -116, (String) null, (class84) null, -105, (class181) null, 36, true, -124);
        }
        if (var11 == null) {
            class48[] var12 = new class48[3];
            int var13 = 0;
            if (!class240.method1676(125, arg4).method1142(97) || !class240.method1676(123, arg1).method1142(97) || !class240.method1676(126, arg3).method1142(97)) {
                return null;
            }
            class48 var14 = class240.method1676(122, arg4).method1135(22334);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class48 var15 = class240.method1676(122, arg1).method1135(22334);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class48 var16 = class240.method1676(127, arg3).method1135(22334);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class48 var17 = new class48(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field4256[var18] < class273.field4446[var18].length) {
                    var17.method410(class336.field5343[var18], class273.field4446[var18][this.field4256[var18]]);
                }
                if (class68.field1255[var18].length > this.field4256[var18]) {
                    var17.method410(class213.field3525[var18], class68.field1255[var18][this.field4256[var18]]);
                }
            }
            var11 = var17.method424(64, 768, -50, -10, -50);
            class97.field1764.method888(var9, var11, 28);
        }
        if (arg7 != null) {
            var11 = arg7.method2144(arg6, var11, 0, arg2, arg0);
        }
        return var11;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V", line = 459)
    public final void method1832(int arg0, boolean arg1) {
        this.field4255 = arg1;
        this.method1824(127);
        if (arg0 != -22038) {
            this.method1828(29, (byte) -15, -104);
        }
        field4250++;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)I", line = 476)
    public final int method1833(int arg0) {
        if (arg0 < 71) {
            this.field4248 = -110;
        }
        field4247++;
        return this.field4248 == -1 ? (this.field4267[11] << 5) + (this.field4267[8] << 10) + (this.field4267[0] << 15) + (this.field4256[0] << 25) + (this.field4256[4] << 20) + this.field4267[1] : class133.method934(this.field4248, (byte) 120).field1557 + 305419896;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V", line = 494)
    public final void method1834(int arg0, int arg1, int arg2) {
        field4259++;
        this.field4256[arg1] = arg2;
        this.method1824(127);
        if (arg0 != -14010) {
            this.field4266 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZIB[Lgi;Lmi;Lmi;ZIIII)Lhb;", line = 513)
    public final class42 method1835(int arg0, boolean arg1, int arg2, byte arg3, class242[] arg4, class300 arg5, class300 arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field4268++;
        if (this.field4248 != -1) {
            return class133.method934(this.field4248, (byte) 120).method680(arg5, arg6, arg8, arg11, arg0, arg4, arg2, arg10, arg9, (byte) 115);
        }
        long var13 = this.field4261;
        int[] var15 = this.field4267;
        if (arg6 != null && (arg6.field4868 >= 0 || arg6.field4878 >= 0)) {
            var15 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var15[var16] = this.field4267[var16];
            }
            if (arg6.field4868 >= 0) {
                if (arg6.field4868 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var15[5] = 0;
                } else {
                    var15[5] = class287.method2034(arg6.field4868, 1073741824);
                    var13 ^= (long) var15[5] << 32;
                }
            }
            if (arg6.field4878 >= 0) {
                if (arg6.field4878 == 65535) {
                    var15[3] = 0;
                    var13 ^= 0xFFFFFFFFL;
                } else {
                    var15[3] = class287.method2034(1073741824, arg6.field4878);
                    var13 ^= (long) var15[3];
                }
            }
        }
        class42 var17 = (class42) class300.field4865.method893(var13, 64);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var20 = var15[var19];
                if ((var20 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var20) != 0 && !class240.method1676(126, var20 & 0x3FFFFFFF).method1133(0)) {
                        var18 = true;
                    }
                } else if (!class296.method2124(0, var20 & 0x3FFFFFFF).method119(-1, this.field4255)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field4246 != -1L) {
                    var17 = (class42) class300.field4865.method893(this.field4246, 98);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class48[] var21 = new class48[12];
                for (int var22 = 0; var22 < 12; var22++) {
                    int var23 = var15[var22];
                    if ((var23 & 0x40000000) != 0) {
                        class48 var24 = class296.method2124(0, var23 & 0x3FFFFFFF).method115(-9515, this.field4255);
                        if (var24 != null) {
                            var21[var22] = var24;
                        }
                    } else if ((var23 & Integer.MIN_VALUE) != 0) {
                        class48 var25 = class240.method1676(123, var23 & 0x3FFFFFFF).method1140(92);
                        if (var25 != null) {
                            var21[var22] = var25;
                        }
                    }
                }
                class5 var26 = null;
                if (this.field4245 != -1) {
                    var26 = class66.method523(-16711936, this.field4245);
                }
                if (var26 != null && var26.field77 != null) {
                    for (int var27 = 0; var27 < var26.field77.length; var27++) {
                        if (var26.field77[var27] != null && var21[var27] != null) {
                            int var28 = var26.field77[var27][1];
                            int var29 = var26.field77[var27][4];
                            int var30 = var26.field77[var27][2];
                            int var31 = var26.field77[var27][3];
                            int var32 = var26.field77[var27][5];
                            int var33 = var26.field77[var27][0];
                            if (this.field4266 == null) {
                                this.field4266 = new int[var26.field77.length][];
                            }
                            if (this.field4266[var27] == null) {
                                int[] var34 = this.field4266[var27] = new int[15];
                                if (var31 == 0 && var29 == 0 && var32 == 0) {
                                    var34[0] = var34[4] = var34[8] = 32768;
                                    var34[13] = -var28;
                                    var34[12] = -var33;
                                    var34[14] = -var30;
                                } else {
                                    int var35 = class305.field4957[var29] >> 1;
                                    int var36 = class305.field4957[var31] >> 1;
                                    int var37 = class305.field4957[var32] >> 1;
                                    int var38 = class305.field4959[var32] >> 1;
                                    int var39 = class305.field4959[var29] >> 1;
                                    int var40 = class305.field4959[var31] >> 1;
                                    int var41 = var37 * var40 + 16384 >> 15;
                                    var34[5] = -var40;
                                    var34[3] = var36 * var38 + 16384 >> 15;
                                    int var42 = var38 * var40 + 16384 >> 15;
                                    var34[2] = var36 * var39 + 16384 >> 15;
                                    var34[1] = var39 * var41 + -var38 * var35 + 16384 >> 15;
                                    var34[7] = -var38 * -var39 + var35 * var41 + 16384 >> 15;
                                    var34[4] = var36 * var37 + 16384 >> 15;
                                    var34[0] = var35 * var37 + (var39 * var42) + 16384 >> 15;
                                    var34[6] = -var39 * var37 + (var35 * var42) + 16384 >> 15;
                                    var34[8] = var35 * var36 + 16384 >> 15;
                                    var34[13] = var34[4] * -var28 + (var34[1] * -var33 + (var34[7] * -var30) + 16384) >> 15;
                                    var34[12] = var34[0] * -var33 + var34[6] * -var30 + var34[3] * -var28 + 16384 >> 15;
                                    var34[14] = var34[2] * -var33 - (-(var34[5] * -var28) - (var34[8] * -var30) - 16384) >> 15;
                                }
                                var34[11] = var30;
                                var34[10] = var28;
                                var34[9] = var33;
                            }
                            if (var31 != 0 || var29 != 0 || var32 != 0) {
                                var21[var27].method398(var31, var29, var32);
                            }
                            if (var33 != 0 || var28 != 0 || var30 != 0) {
                                var21[var27].method404(var33, var28, var30);
                            }
                        }
                    }
                }
                class48 var43 = new class48(var21, var21.length);
                for (int var44 = 0; var44 < 5; var44++) {
                    if (this.field4256[var44] < class273.field4446[var44].length) {
                        var43.method410(class336.field5343[var44], class273.field4446[var44][this.field4256[var44]]);
                    }
                    if (class68.field1255[var44].length > this.field4256[var44]) {
                        var43.method410(class213.field3525[var44], class68.field1255[var44][this.field4256[var44]]);
                    }
                }
                var17 = var43.method424(64, 850, -30, -50, -30);
                if (class241.field4016) {
                    ((class294) var17).method2098(false, false, true, true, false, false, true);
                }
                if (arg7) {
                    class300.field4865.method888(var13, var17, 87);
                    this.field4246 = var13;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg4 == null ? 0 : arg4.length;
        boolean var49 = false;
        for (int var50 = 0; var50 < var48; var50++) {
            if (arg4[var50] != null) {
                class300 var51 = class258.method1807(arg4[var50].field4045, 69);
                if (var51.field4885 != null) {
                    var46 = true;
                    class9.field283[var50] = var51;
                    int var52 = arg4[var50].field4041;
                    int var53 = var51.field4885[var52];
                    int var54 = arg4[var50].field4044;
                    class355.field5663[var50] = class198.method1354(var53 >>> 16, (byte) 74);
                    int var55 = var53 & 0xFFFF;
                    class94.field1650[var50] = var55;
                    if (class355.field5663[var50] != null) {
                        var49 |= class355.field5663[var50].method939(var55, 113);
                        var45 |= class355.field5663[var50].method936(21603, var55);
                        var47 |= var51.field4862;
                    }
                    if ((var51.field4859 || class139.field2362) && var54 != -1 && var54 < var51.field4885.length) {
                        class159.field2692[var50] = var51.field4877[var52];
                        class97.field1768[var50] = arg4[var50].field4046;
                        int var56 = var51.field4885[var54];
                        class213.field3520[var50] = class198.method1354(var56 >>> 16, (byte) 74);
                        int var57 = var56 & 0xFFFF;
                        class238.field3965[var50] = var57;
                        if (class213.field3520[var50] != null) {
                            var49 |= class213.field3520[var50].method939(var57, 112);
                            var45 |= class213.field3520[var50].method936(21603, var57);
                        }
                    } else {
                        class159.field2692[var50] = 0;
                        class97.field1768[var50] = 0;
                        class213.field3520[var50] = null;
                        class238.field3965[var50] = -1;
                    }
                }
            }
        }
        if (var46 || arg6 != null || arg5 != null) {
            int var58 = -1;
            int var59 = -1;
            int var60 = 0;
            class133 var61 = null;
            class133 var62 = null;
            if (arg6 != null) {
                int var63 = arg6.field4885[arg11];
                int var64 = var63 >>> 16;
                var58 = var63 & 0xFFFF;
                var61 = class198.method1354(var64, (byte) 74);
                if (var61 != null) {
                    var49 |= var61.method939(var58, 126);
                    var45 |= var61.method936(21603, var58);
                    var47 |= arg6.field4862;
                }
                if ((arg6.field4859 || class139.field2362) && arg10 != -1 && arg6.field4885.length > arg10) {
                    int var65 = arg6.field4885[arg10];
                    var60 = arg6.field4877[arg11];
                    int var66 = var65 >>> 16;
                    var59 = var65 & 0xFFFF;
                    if (var64 == var66) {
                        var62 = var61;
                    } else {
                        var62 = class198.method1354(var59 >>> 16, (byte) 74);
                    }
                    if (var62 != null) {
                        var49 |= var62.method939(var59, 126);
                        var45 |= var62.method936(21603, var59);
                    }
                }
            }
            int var67 = -1;
            int var68 = -1;
            int var69 = 0;
            if (arg3 > -6) {
                field4249 = (String) null;
            }
            class133 var70 = null;
            class133 var71 = null;
            if (arg5 != null) {
                int var72 = arg5.field4885[arg8];
                int var73 = var72 >>> 16;
                var70 = class198.method1354(var73, (byte) 74);
                var67 = var72 & 0xFFFF;
                if (var70 != null) {
                    var49 |= var70.method939(var67, 105);
                    var45 |= var70.method936(21603, var67);
                    var47 |= arg5.field4862;
                }
                if ((arg5.field4859 || class139.field2362) && arg2 != -1 && arg2 < arg5.field4885.length) {
                    var69 = arg5.field4877[arg8];
                    int var74 = arg5.field4885[arg2];
                    int var75 = var74 >>> 16;
                    var68 = var74 & 0xFFFF;
                    if (var73 == var75) {
                        var71 = var70;
                    } else {
                        var71 = class198.method1354(var68 >>> 16, (byte) 74);
                    }
                    if (var71 != null) {
                        var49 |= var71.method939(var68, 117);
                        var45 |= var71.method936(21603, var68);
                    }
                }
            }
            class42 var76 = var17.method349(!var45, !var49, !var47);
            int var77 = 0;
            int var78 = 1;
            while (var77 < var48) {
                if (class355.field5663[var77] != null) {
                    var76.method342(class355.field5663[var77], class94.field1650[var77], class213.field3520[var77], class238.field3965[var77], class97.field1768[var77] - 1, class159.field2692[var77], var78, class9.field283[var77].field4862, this.field4266[var77]);
                }
                var78 <<= 0x1;
                var77++;
            }
            if (var61 != null && var70 != null) {
                var76.method338(var61, var58, var62, var59, arg0 - 1, var60, var70, var67, var71, var68, arg9 - 1, var69, arg6.field4864, arg6.field4862 | arg5.field4862);
            } else if (var61 != null) {
                var76.method335(var61, var58, var62, var59, arg0 - 1, var60, arg6.field4862);
            } else if (var70 != null) {
                var76.method335(var70, var67, var71, var68, arg9 - 1, var69, arg5.field4862);
            }
            for (int var79 = 0; var79 < var48; var79++) {
                class355.field5663[var79] = null;
                class213.field3520[var79] = null;
                class9.field283[var79] = null;
            }
            return var76;
        } else if (arg1) {
            return var17.method349(false, false, false);
        } else {
            return var17;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 1002)
    public static void method1836(byte arg0) {
        field4249 = null;
        field4252 = (short[][]) null;
        if (arg0 < -31) {
            field4265 = null;
            field4257 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIBLmi;I)Lhb;", line = 1020)
    public final class42 method1837(int arg0, int arg1, byte arg2, class300 arg3, int arg4) {
        field4260++;
        if (this.field4248 != -1) {
            return class133.method934(this.field4248, (byte) 122).method675(arg3, arg0, arg1, arg2 - 20875, arg4);
        } else if (arg2 == 94) {
            class42 var6 = (class42) class97.field1764.method893(this.field4261, 74);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < 12; var8++) {
                    int var9 = this.field4267[var8];
                    if ((var9 & 0x40000000) == 0) {
                        if ((var9 & Integer.MIN_VALUE) != 0 && !class240.method1676(122, var9 & 0x3FFFFFFF).method1142(97)) {
                            var7 = true;
                        }
                    } else if (!class296.method2124(0, var9 & 0x3FFFFFFF).method108(8230, this.field4255)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class48[] var10 = new class48[12];
                int var11 = 0;
                for (int var12 = 0; var12 < 12; var12++) {
                    int var13 = this.field4267[var12];
                    if ((var13 & 0x40000000) != 0) {
                        class48 var15 = class296.method2124(0, var13 & 0x3FFFFFFF).method118(this.field4255, (byte) -42);
                        if (var15 != null) {
                            var10[var11++] = var15;
                        }
                    } else if ((var13 & Integer.MIN_VALUE) != 0) {
                        class48 var14 = class240.method1676(arg2 ^ 0x20, var13 & 0x3FFFFFFF).method1135(22334);
                        if (var14 != null) {
                            var10[var11++] = var14;
                        }
                    }
                }
                class48 var16 = new class48(var10, var11);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field4256[var17] < class273.field4446[var17].length) {
                        var16.method410(class336.field5343[var17], class273.field4446[var17][this.field4256[var17]]);
                    }
                    if (this.field4256[var17] < class68.field1255[var17].length) {
                        var16.method410(class213.field3525[var17], class68.field1255[var17][this.field4256[var17]]);
                    }
                }
                var6 = var16.method424(64, 768, -50, -10, -50);
                class97.field1764.method888(this.field4261, var6, arg2 - 40);
            }
            if (arg3 != null) {
                var6 = arg3.method2144(arg0, var6, 0, arg4, arg1);
            }
            return var6;
        } else {
            return (class42) null;
        }
    }
}
