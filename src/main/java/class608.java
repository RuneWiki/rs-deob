import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class608 {

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "B")
    public byte field8259 = 0;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    private int field8257 = 0;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    private int field8263 = 128;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
    public int field8277 = -1;

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "Z")
    public boolean field8278 = false;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "I")
    private int field8272 = -1;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
    private int field8280 = 128;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    private int field8262 = 0;

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
    private int field8269 = 0;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "I")
    public static int field8273 = 0;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
    public int field8270;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
    private int field8271;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "Lnfa;")
    public class709 field8275;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "[S")
    private short[] field8255;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "[S")
    private short[] field8261;

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "[S")
    private short[] field8268;

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "[S")
    private short[] field8279;

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "[[[J")
    public static long[][][] field8264;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljp;BI)V", line = 11)
    private final void method3362(class376 arg0, byte arg1, int arg2) {
        int var4 = -39 / ((-arg1 - 20) / 52);
        if (arg2 == 1) {
            this.field8271 = arg0.method2359(-1);
        } else if (arg2 == 2) {
            this.field8277 = arg0.method2359(-1);
        } else if (arg2 == 4) {
            this.field8280 = arg0.method2359(-1);
        } else if (arg2 == 5) {
            this.field8263 = arg0.method2359(-1);
        } else if (arg2 == 6) {
            this.field8269 = arg0.method2359(-1);
        } else if (arg2 == 7) {
            this.field8257 = arg0.method2398(-1372747256);
        } else if (arg2 == 8) {
            this.field8262 = arg0.method2398(-1372747256);
        } else if (arg2 == 9) {
            this.field8259 = 3;
            this.field8272 = 8224;
        } else if (arg2 == 10) {
            this.field8278 = true;
        } else if (arg2 == 11) {
            this.field8259 = 1;
        } else if (arg2 == 12) {
            this.field8259 = 4;
        } else if (arg2 == 13) {
            this.field8259 = 5;
        } else if (arg2 == 14) {
            this.field8259 = 2;
            this.field8272 = arg0.method2398(-1372747256) * 256;
        } else if (arg2 == 15) {
            this.field8259 = 3;
            this.field8272 = arg0.method2359(-1);
        } else if (arg2 == 16) {
            this.field8259 = 3;
            this.field8272 = arg0.method2384(108);
        } else if (arg2 == 40) {
            int var5 = arg0.method2398(-1372747256);
            this.field8279 = new short[var5];
            this.field8268 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field8279[var6] = (short) arg0.method2359(-1);
                this.field8268[var6] = (short) arg0.method2359(-1);
            }
        } else if (arg2 == 41) {
            int var7 = arg0.method2398(-1372747256);
            this.field8261 = new short[var7];
            this.field8255 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field8255[var8] = (short) arg0.method2359(-1);
                this.field8261[var8] = (short) arg0.method2359(-1);
            }
        }
        field8267++;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BZIIIIIILuaa;Ls;ILs;Lha;)Lka;", line = 133)
    public final class500 method3363(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class127 arg8, class296 arg9, int arg10, class296 arg11, class65 arg12) {
        int var14 = 7 / ((-arg0 - 40) / 49);
        field8256++;
        return this.method3364(-14, arg8, arg11, arg5, arg6, arg12, arg7, arg2, arg1, arg4, arg3, (byte) 2, arg9, arg10);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILuaa;Ls;IILha;IIZIIBLs;I)Lka;", line = 152)
    private final class500 method3364(int arg0, class127 arg1, class296 arg2, int arg3, int arg4, class65 arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, byte arg11, class296 arg12, int arg13) {
        field8254++;
        int var15 = arg10;
        class489 var16 = this.field8277 == -1 || arg6 == -1 ? null : arg1.method1034(this.field8277, arg0 ^ 0xFFFFFFF2);
        boolean var17 = arg8 & this.field8259 != 0;
        if (arg0 != -14) {
            return null;
        }
        if (var16 != null) {
            var15 = arg10 | var16.method2843(false, arg4, 27123, arg6);
        }
        if (var17) {
            var15 |= this.field8259 == 3 ? 7 : 2;
        }
        if (this.field8263 != 128) {
            var15 |= 0x2;
        }
        if (this.field8280 != 128 || this.field8269 != 0) {
            var15 |= 0x5;
        }
        class239 var18 = this.field8275.field9943;
        class500 var19;
        synchronized (this.field8275.field9943) {
            var19 = (class500) this.field8275.field9943.method1541(arg0 + 4, (long) (this.field8270 |= arg5.field913 << 29));
        }
        if (var19 == null || arg5.method517(var19.method325(), var15) != 0) {
            if (var19 != null) {
                var15 = arg5.method498(var15, var19.method325());
            }
            int var20 = var15;
            if (this.field8279 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field8255 != null) {
                var20 |= 0x8000;
            }
            class782 var21 = class558.method3142(arg0 ^ 0x83ADF802, this.field8275.field9931, this.field8271, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field10787 < 13) {
                var21.method4317(17496, 2);
            }
            var19 = arg5.method510(var21, var20, this.field8275.field9944, this.field8257 + 64, this.field8262 + 850);
            if (this.field8279 != null) {
                for (int var22 = 0; var22 < this.field8279.length; var22++) {
                    var19.method306(this.field8279[var22], this.field8268[var22]);
                }
            }
            if (this.field8255 != null) {
                for (int var23 = 0; var23 < this.field8255.length; var23++) {
                    var19.method299(this.field8255[var23], this.field8261[var23]);
                }
            }
            var19.method295(var15);
            class239 var24 = this.field8275.field9943;
            synchronized (this.field8275.field9943) {
                this.field8275.field9943.method1544(true, var19, (long) (this.field8270 |= arg5.field913 << 29));
            }
        }
        class500 var25 = var16 == null ? var19.method298(arg11, var15, true) : var16.method2842(var15, arg4, arg9, arg11, var19, 256, 0, arg6);
        if (this.field8280 != 128 || this.field8263 != 128) {
            var25.method318(this.field8280, this.field8263, this.field8280);
        }
        if (this.field8269 != 0) {
            if (this.field8269 == 90) {
                var25.method329(4096);
            }
            if (this.field8269 == 180) {
                var25.method329(8192);
            }
            if (this.field8269 == 270) {
                var25.method329(12288);
            }
        }
        if (var17) {
            var25.method321(this.field8259, this.field8272, arg12, arg2, arg3, arg7, arg13);
        }
        var25.method295(arg10);
        return var25;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V", line = 275)
    public static final void method3365(byte arg0) {
        field8253++;
        class24.field378 = -2;
        class674.field9468 = 0;
        class415.field5957 = -2;
        if (arg0 != -109) {
            method3368(-55);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljp;Z)V", line = 290)
    public final void method3366(class376 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                if (!arg1) {
                    this.field8261 = null;
                }
                field8258++;
                return;
            }
            this.method3362(arg0, (byte) -88, var3);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 314)
    public static final void method3367(String arg0, int arg1) {
        field8252++;
        if (!class497.field6870 || (class344.field5067 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        if (arg1 != 24) {
            field8273 = -47;
        }
        int var3 = class571.field7608;
        int[] var4 = class79.field1136;
        for (int var5 = 0; var5 < var3; var5++) {
            class73 var6 = class599.field8149[var4[var5]];
            if (var6.field1020 != null && var6.field1020.equalsIgnoreCase(arg0) && (class551.field7456 == var6 && (class344.field5067 & 0x10) != 0 || var6 != null && (class344.field5067 & 0x8) != 0)) {
                class301.field4351++;
                class267 var7 = class545.method3099((byte) 37, class269.field3966, class290.field4249);
                var7.field3938.method2361(arg1 - 863996016, class372.field5384);
                var7.field3938.method2362((byte) -114, class121.field1770);
                var7.field3938.method2362((byte) -111, var4[var5]);
                var7.field3938.method2382(-25724, class167.field2258);
                var7.field3938.method2380(65280, 0);
                class617.method3392(var7, true);
                class77.method672(0, var6.method655(-126), -2, (byte) -26, var6.field1884[0], var6.field1890[0], var6.method655(-128), 0, true);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class780.method4307((byte) 113, class474.field6560.method2780(arg1 + 75, class38.field589) + arg0, 4);
        }
        if (class497.field6870) {
            class701.method3909(0);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V", line = 371)
    public static final void method3368(int arg0) {
        if (class127.field1916 == null) {
            class127.field1916 = class21.method169(6);
            class292.field4270 = class127.field1916[0];
            class28.field410 = class302.method1910(0);
        }
        field8276++;
        if (class209.field2778 == null) {
            class134.method1058(0);
        }
        class21 var1 = class292.field4270;
        if (arg0 >= -121) {
            method3368(-54);
        }
        int var2 = class288.method1831((byte) -108);
        if (class292.field4270 == var1) {
            class275.field4088 = class292.field4270.field304.method2780(107, class38.field589);
            if (class292.field4270.field307) {
                class741.field10232 = (class292.field4270.field299 - class292.field4270.field309) * var2 / 100 + class292.field4270.field309;
            }
            if (class292.field4270.field303) {
                class275.field4088 = class275.field4088 + class741.field10232 + "%";
            }
        } else if (class292.field4270 == class21.field331) {
            class209.field2778 = null;
            class300.method1901(3, 2);
        } else {
            class275.field4088 = var1.field312.method2780(119, class38.field589);
            if (class292.field4270.field303) {
                class275.field4088 = class275.field4088 + var1.field299 + "%";
            }
            class741.field10232 = var1.field299;
            if (class292.field4270.field307 || var1.field307) {
                class28.field410 = class302.method1910(0);
            }
        }
        if (class209.field2778 == null) {
            return;
        }
        class209.field2778.method4272(0, class275.field4088, class292.field4270, class741.field10232, class28.field410);
        if (class273.field4059 == null) {
            return;
        }
        for (int var3 = class156.field2147 + 1; var3 < class273.field4059.length; var3++) {
            if (class273.field4059[var3].method69(-31784) >= 100 && var3 - 1 == class156.field2147 && class458.field6355 >= 1 && class209.field2778.method4263((byte) -121)) {
                try {
                    class273.field4059[var3].method76(true);
                } catch (Exception var4) {
                    class273.field4059 = null;
                    return;
                }
                class209.field2778.method4261(class273.field4059[var3], (byte) 80);
                class156.field2147++;
                if (class156.field2147 >= class273.field4059.length - 1 && class273.field4059.length > 1) {
                    class156.field2147 = class457.field6338.method2568(23382) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBLha;IILuaa;II)Lka;", line = 474)
    public final class500 method3369(int arg0, byte arg1, class65 arg2, int arg3, int arg4, class127 arg5, int arg6, int arg7) {
        if (arg0 == 0) {
            field8266++;
            return this.method3364(-14, arg5, null, 0, arg4, arg2, arg3, 0, false, arg7, arg6, arg1, null, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)V", line = 492)
    public static void method3370(byte arg0) {
        field8264 = null;
        if (arg0 != 7) {
            method3371(79, null, 68, 2, false, null);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILjava/lang/String;IIZ[B)I", line = 503)
    public static final int method3371(int arg0, String arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
        field8265++;
        if (arg4) {
            return -59;
        }
        int var6 = arg0 - arg2;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg3 + var7] = -97;
            } else {
                arg5[arg3 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILha;ILuaa;III)Lka;", line = 642)
    public final class500 method3372(int arg0, class65 arg1, int arg2, class127 arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 0) {
            method3365((byte) -127);
        }
        field8260++;
        return this.method3364(-14, arg3, null, 0, arg6, arg1, arg2, 0, false, arg4, arg0, (byte) 2, null, 0);
    }
}
