import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class335 {

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "Ld;")
    private class242 field5042 = new class242(128);

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "Ld;")
    public class242 field5053 = new class242(64);

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "Lum;")
    public class83 field5051;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "Lum;")
    private class83 field5046;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "Lpn;")
    public static class49 field5052 = new class49(32, 3);

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "Ltv;")
    public static class297 field5044;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI)V")
    public static final void method2178(byte arg0, int arg1) {
        class16.field169 = 1000 / arg1;
        int var2 = 74 % ((-arg0 - 28) / 35);
        field5050++;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
    public final void method2179(int arg0, int arg1) {
        field5047++;
        class242 var3 = this.field5042;
        synchronized (this.field5042) {
            this.field5042.method1631(arg0, (byte) -19);
        }
        if (arg1 != 16515072) {
            this.method2185(-111);
        }
        class242 var4 = this.field5053;
        synchronized (this.field5053) {
            this.field5053.method1631(arg0, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIB)V")
    public final void method2180(int arg0, int arg1, byte arg2) {
        if (arg2 <= 105) {
            method2184((byte) -33);
        }
        field5048++;
        this.field5042 = new class242(arg1);
        this.field5053 = new class242(arg0);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IILza;ILe;IILkt;IIIIIII)Le;")
    public static final class289 method2181(int arg0, int arg1, class299 arg2, int arg3, class289 arg4, int arg5, int arg6, class61 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field5049++;
        if (arg4 == null) {
            return null;
        }
        int var15 = 2055;
        int var16 = 61 / ((arg11 + 71) / 36);
        if (arg7 != null) {
            int var17 = var15 | arg7.method408(-1, arg10, false, -59);
            var15 = var17 & 0xFFFFFDFF;
        }
        long var18 = ((long) arg8 << 48) + ((long) arg1 << 32) + (long) ((arg9 << 24) + (arg14 << 16) + arg12);
        class242 var20 = class13.field144;
        class289 var21;
        synchronized (class13.field144) {
            var21 = (class289) class13.field144.method1634(var18, 64);
        }
        if (var21 == null || arg2.method589(var21.method679(), var15) != 0) {
            if (var21 != null) {
                var15 = arg2.method557(var15, var21.method679());
            }
            byte var22;
            if (arg12 == 1) {
                var22 = 9;
            } else if (arg12 == 2) {
                var22 = 12;
            } else if (arg12 == 3) {
                var22 = 15;
            } else if (arg12 == 4) {
                var22 = 18;
            } else {
                var22 = 21;
            }
            byte var23 = 3;
            int[] var24 = new int[] { 64, 96, 128 };
            class153 var25 = new class153(var22 * var23 + 1, var22 * var23 * 2 + -var22, 0);
            int var26 = var25.method1107(0, 0, 0, (byte) -124);
            int[][] var27 = new int[var23][var22];
            for (int var28 = 0; var28 < var23; var28++) {
                int var29 = var24[var28];
                int var30 = var24[var28];
                for (int var31 = 0; var31 < var22; var31++) {
                    int var32 = (var31 << 14) / var22;
                    int var33 = class58.field891[var32] * var29 >> 15;
                    int var34 = class58.field889[var32] * var30 >> 15;
                    var27[var28][var31] = var25.method1107(0, var34, var33, (byte) -124);
                }
            }
            for (int var35 = 0; var35 < var23; var35++) {
                int var36 = (var35 * 256 + 128) / var23;
                int var37 = 256 - var36;
                byte var38 = (byte) (arg9 * var36 + arg14 * var37 >> 8);
                short var39 = (short) (((arg1 & 0xFC00) * var37 + (arg8 & 0xFC00) * var36 & 0xFC0000) + ((arg1 & 0x7F) * var37 + (arg8 & 0x7F) * var36 & 0x7F00) + ((arg1 & 0x380) * var37 + (arg8 & 0x380) * var36 & 0x38000) >> 8);
                for (int var40 = 0; var40 < var22; var40++) {
                    if (var35 == 0) {
                        var25.method1114((byte) -1, var27[0][(var40 + 1) % var22], var27[0][var40], 0, var38, (short) -1, var26, var39, (byte) 1);
                    } else {
                        var25.method1114((byte) -1, var27[var35 - 1][(var40 + 1) % var22], var27[var35][(var40 + 1) % var22], 0, var38, (short) -1, var27[var35 - 1][var40], var39, (byte) 1);
                        var25.method1114((byte) -1, var27[var35][(var40 + 1) % var22], var27[var35][var40], 0, var38, (short) -1, var27[var35 - 1][var40], var39, (byte) 1);
                    }
                }
            }
            var21 = arg2.method554(var25, var15, class472.field6930, 64, 768);
            class242 var41 = class13.field144;
            synchronized (class13.field144) {
                class13.field144.method1623(var18, 17621, var21);
            }
        }
        int var42 = (arg12 << 6) - 1;
        int var43 = -var42;
        int var44 = -var42;
        int var45 = var42;
        int var46 = var42;
        if (arg3 != 0) {
            if ((arg3 & 0x1) != 0) {
                var46 = var42 + 128;
            }
            if ((arg3 & 0x4) != 0) {
                var45 = var42 + 128;
            }
            if ((arg3 & 0x2) != 0) {
                var44 -= 128;
            }
            if ((arg3 & 0x8) != 0) {
                var43 -= 128;
            }
        }
        int var47 = arg4.method674();
        int var48 = arg4.method624();
        int var49 = arg4.method630();
        int var50 = arg4.method652();
        if (var49 < var44) {
            var49 = var44;
        }
        if (var45 < var48) {
            var48 = var45;
        }
        if (var43 > var47) {
            var47 = var43;
        }
        if (var50 > var46) {
            var50 = var46;
        }
        class313 var51 = null;
        if (arg7 != null) {
            int var52 = arg7.field976[arg10];
            var51 = class393.field5735.method1542(0, var52 >> 16);
            arg10 = var52 & 0xFFFF;
        }
        class289 var53;
        if (var51 == null) {
            var53 = var21.method669((byte) 3, var15, true);
            var53.method676(var48 - var47 >> 1, 128, var50 - var49 >> 1);
            var53.method678(var47 + var48 >> 1, 0, var49 + var50 >> 1);
        } else {
            var53 = var21.method669((byte) 3, var15, true);
            var53.method676(var48 - var47 >> 1, 128, var50 - var49 >> 1);
            var53.method678(var47 + var48 >> 1, 0, var49 + var50 >> 1);
            var53.method1940(var51, (byte) 111, arg10);
        }
        if (arg13 != 0) {
            var53.method666(arg13);
        }
        if (arg6 != 0) {
            var53.method639(arg6);
        }
        if (arg0 != 0) {
            var53.method678(0, arg0, 0);
        }
        return var53;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)Lae;")
    public final class30 method2182(int arg0, byte arg1) {
        field5041++;
        class242 var3 = this.field5042;
        class30 var4;
        synchronized (this.field5042) {
            var4 = (class30) this.field5042.method1634((long) arg0, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field5046;
        byte[] var6;
        synchronized (this.field5046) {
            var6 = this.field5046.method731(0, arg0, 36);
        }
        if (arg1 != -42) {
            this.method2179(-4, -101);
        }
        class30 var7 = new class30();
        var7.field373 = arg0;
        var7.field362 = this;
        if (var6 != null) {
            var7.method178(new class194(var6), -1);
        }
        var7.method183(arg1 - 20312);
        class242 var8 = this.field5042;
        synchronized (this.field5042) {
            this.field5042.method1623((long) arg0, arg1 + 17663, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public final void method2183(byte arg0) {
        class242 var2 = this.field5042;
        synchronized (this.field5042) {
            this.field5042.method1637((byte) 13);
        }
        field5045++;
        if (arg0 != 126) {
            method2181(-77, -63, null, -98, null, 99, -89, null, -121, -91, -122, -28, -47, -4, -119);
        }
        class242 var3 = this.field5053;
        synchronized (this.field5053) {
            this.field5053.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
    public static void method2184(byte arg0) {
        field5044 = null;
        field5052 = null;
        if (arg0 != 51) {
            method2178((byte) 125, -74);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public final void method2185(int arg0) {
        field5043++;
        class242 var2 = this.field5042;
        synchronized (this.field5042) {
            if (arg0 != 6506) {
                this.field5053 = null;
            }
            this.field5042.method1630(arg0 - 6611);
        }
        class242 var3 = this.field5053;
        synchronized (this.field5053) {
            this.field5053.method1630(arg0 ^ 0xFFFFE6FD);
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lpt;ILum;Lum;)V")
    public class335(class308 arg0, int arg1, class83 arg2, class83 arg3) {
        this.field5051 = arg3;
        this.field5046 = arg2;
        this.field5046.method748(36, 12408);
    }
}
