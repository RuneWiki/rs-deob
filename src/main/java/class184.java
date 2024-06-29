import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class184 extends class80 {

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "[Lqd;")
    public class182[] field2989;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "[S")
    public short[] field2990;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[B")
    public byte[] field2981;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "[B")
    public byte[] field2992;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "[I")
    private int[] field2983;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "[Lqi;")
    public class245[] field2984;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "[B")
    public byte[] field2994;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public int field2991;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lph;")
    private static class229 field2982 = class266.method1858("Loaded wordpack", 0);

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Lph;")
    public static class229 field2987 = field2982;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "Lph;")
    public static class229 field2988 = class266.method1858(" ", 0);

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field2996 = 127;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lvm;")
    public static class202 field2985 = new class202(32);

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "[Lri;")
    public static class301[] field2993;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([BILk;[I)Z", line = 8)
    public final boolean method1296(byte[] arg0, int arg1, class40 arg2, int[] arg3) {
        boolean var5 = true;
        field2995++;
        int var6 = arg1;
        class182 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2983[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method306(false, var9 >> 2, arg3);
                        } else {
                            var7 = arg2.method307(arg1 ^ 0x0, var9 >> 2, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2989[var8] = var7;
                        this.field2983[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 61)
    public static void method1297(byte arg0) {
        field2988 = null;
        field2985 = null;
        field2982 = null;
        field2987 = null;
        field2993 = null;
        if (arg0 < 10) {
            field2982 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIII)V", line = 75)
    public static final void method1298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2980++;
        if (class69.method542(arg6, -1)) {
            field2993 = null;
            if (arg3 < 4) {
                field2993 = (class301[]) null;
            }
            class169.method1239(arg1, arg5, arg0, arg4, -1, arg8, class37.field604[arg6], -1, arg7, arg2);
            if (field2993 != null) {
                class169.method1239(arg1, arg5, arg0, arg4, -1412584499, arg8, field2993, -1, class129.field2113, class235.field3866);
                field2993 = null;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class187.field3036[var9] = true;
            }
        } else {
            class187.field3036[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)Lmj;", line = 137)
    public static final class162 method1299(int arg0, int arg1, int arg2) {
        class72 var3 = class225.field3705[arg0][arg1][arg2];
        return var3 == null || var3.field1225 == null ? null : var3.field1225;
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V", line = 159)
    public final void method1300(int arg0) {
        if (arg0 != -1) {
            method1298(-84, 112, 14, -87, -104, 90, 97, -105, 86);
        }
        field2986++;
        this.field2983 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 176)
    public class184() {
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "([B)V", line = 181)
    public class184(byte[] arg0) {
        this.field2989 = new class182[128];
        this.field2990 = new short[128];
        this.field2981 = new byte[128];
        this.field2992 = new byte[128];
        this.field2983 = new int[128];
        this.field2984 = new class245[128];
        int var2 = 0;
        this.field2994 = new byte[128];
        class164 var3 = new class164(arg0);
        while (var3.field2668[var3.field2670 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1163(864348104);
        }
        var3.field2670++;
        int var6 = var3.field2670;
        var2++;
        var3.field2670 += var2;
        int var7;
        for (var7 = 0; var3.field2668[var3.field2670 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1163(864348104);
        }
        var7++;
        var3.field2670++;
        int var10 = 0;
        int var11 = var3.field2670;
        var3.field2670 += var7;
        while (var3.field2668[var3.field2670 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1163(864348104);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var3.field2670++;
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method1178(8);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        }
        class245[] var19 = new class245[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class245 var21 = var19[var20] = new class245();
            int var22 = var3.method1178(8);
            if (var22 > 0) {
                var21.field4036 = new byte[var22 * 2];
            }
            int var23 = var3.method1178(8);
            if (var23 > 0) {
                var21.field4040 = new byte[var23 * 2 + 2];
                var21.field4040[1] = 64;
            }
        }
        int var24 = var3.method1178(8);
        int var25 = 0;
        byte[] var26 = var24 > 0 ? new byte[var24 * 2] : null;
        int var27 = var3.method1178(8);
        while (var3.field2668[var3.field2670 + var25] != 0) {
            var25++;
        }
        byte[] var28 = var27 <= 0 ? null : new byte[var27 * 2];
        byte[] var29 = new byte[var25];
        for (int var30 = 0; var30 < var25; var30++) {
            var29[var30] = var3.method1163(864348104);
        }
        var25++;
        var3.field2670++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1178(8);
            this.field2990[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1178(8);
            this.field2990[var34] = (short) (this.field2990[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length <= var37) {
                    var35 = -1;
                } else {
                    var35 = var29[var37++];
                }
                var36 = var3.method1175(766301319);
            }
            this.field2990[var38] = (short) (this.field2990[var38] + class243.method1696(32768, var36 - 1 << 14));
            this.field2983[var38] = var36;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2983[var42] != 0) {
                if (var40 == 0) {
                    if (var4.length <= var39) {
                        var40 = -1;
                    } else {
                        var40 = var4[var39++];
                    }
                    var41 = var3.field2668[var6++] - 1;
                }
                var40--;
                this.field2994[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2983[var46] != 0) {
                if (var44 == 0) {
                    if (var43 < var8.length) {
                        var44 = var8[var43++];
                    } else {
                        var44 = -1;
                    }
                    var45 = var3.field2668[var11++] + 16 << 2;
                }
                this.field2981[var46] = (byte) var45;
                var44--;
            }
        }
        int var47 = 0;
        class245 var48 = null;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field2983[var50] != 0) {
                if (var47 == 0) {
                    var48 = var19[var14[var49]];
                    if (var49 >= var12.length) {
                        var47 = -1;
                    } else {
                        var47 = var12[var49++];
                    }
                }
                var47--;
                this.field2984[var50] = var48;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var53 == 0) {
                if (var51 < var29.length) {
                    var53 = var29[var51++];
                } else {
                    var53 = -1;
                }
                if (this.field2983[var54] > 0) {
                    var52 = var3.method1178(8) + 1;
                }
            }
            var53--;
            this.field2992[var54] = (byte) var52;
        }
        this.field2991 = var3.method1178(8) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class245 var56 = var19[var55];
            if (var56.field4036 != null) {
                for (int var57 = 1; var57 < var56.field4036.length; var57 += 2) {
                    var56.field4036[var57] = var3.method1163(864348104);
                }
            }
            if (var56.field4040 != null) {
                for (int var58 = 3; var58 < var56.field4040.length - 2; var58 += 2) {
                    var56.field4040[var58] = var3.method1163(864348104);
                }
            }
        }
        if (var26 != null) {
            for (int var59 = 1; var59 < var26.length; var59 += 2) {
                var26[var59] = var3.method1163(864348104);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method1163(864348104);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class245 var62 = var19[var61];
            if (var62.field4040 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field4040.length; var64 += 2) {
                    var63 = var3.method1178(8) + var63 + 1;
                    var62.field4040[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class245 var66 = var19[var65];
            if (var66.field4036 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field4036.length; var68 += 2) {
                    var67 = var67 + var3.method1178(8) + 1;
                    var66.field4036[var68] = (byte) var67;
                }
            }
        }
        if (var26 != null) {
            int var69 = var3.method1178(8);
            var26[0] = (byte) var69;
            for (int var70 = 2; var70 < var26.length; var70 += 2) {
                var69 = var69 + var3.method1178(8) + 1;
                var26[var70] = (byte) var69;
            }
            byte var71 = var26[0];
            byte var72 = var26[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field2992[var73] = (byte) (this.field2992[var73] * var72 + 32 >> 6);
            }
            for (int var74 = 2; var74 < var26.length; var74 += 2) {
                byte var75 = var26[var74 + 1];
                byte var76 = var26[var74];
                int var77 = (var76 - var71) / 2 + (var76 - var71) * var72;
                for (int var78 = var71; var78 < var76; var78++) {
                    int var79 = class285.method1962((byte) 115, var76 - var71, var77);
                    var77 += var75 - var72;
                    this.field2992[var78] = (byte) (this.field2992[var78] * var79 + 32 >> 6);
                }
                var71 = var76;
                var72 = var75;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field2992[var80] = (byte) (this.field2992[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var28 != null) {
            int var82 = var3.method1178(8);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 = var3.method1178(8) + var82 + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field2981[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field2981[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var28.length > var88) {
                byte var89 = var28[var88];
                int var90 = (var89 - var84) * var85 + ((var89 - var84) / 2);
                int var91 = var28[var88 + 1] << 1;
                var88 += 2;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class285.method1962((byte) 115, var89 - var84, var90);
                    int var94 = (this.field2981[var92] & 0xFF) + var93;
                    var90 += var91 - var85;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field2981[var92] = (byte) var94;
                }
                var85 = var91;
                var84 = var89;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field2981[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field2981[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field4047 = var3.method1178(8);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class245 var100 = var19[var99];
            if (var100.field4036 != null) {
                var100.field4046 = var3.method1178(8);
            }
            if (var100.field4040 != null) {
                var100.field4042 = var3.method1178(8);
            }
            if (var100.field4047 > 0) {
                var100.field4043 = var3.method1178(8);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field4037 = var3.method1178(8);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class245 var103 = var19[var102];
            if (var103.field4037 > 0) {
                var103.field4048 = var3.method1178(8);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class245 var105 = var19[var104];
            if (var105.field4048 > 0) {
                var105.field4045 = var3.method1178(8);
            }
        }
    }
}
