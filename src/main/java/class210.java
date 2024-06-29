import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class210 extends class206 {

    @OriginalMember(owner = "client!wfa", name = "t", descriptor = "[I")
    private int[] field3214;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "[S")
    public short[] field3215;

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "[Lhha;")
    public class545[] field3222;

    @OriginalMember(owner = "client!wfa", name = "q", descriptor = "[B")
    public byte[] field3223;

    @OriginalMember(owner = "client!wfa", name = "u", descriptor = "[B")
    public byte[] field3219;

    @OriginalMember(owner = "client!wfa", name = "s", descriptor = "[Lps;")
    public class105[] field3218;

    @OriginalMember(owner = "client!wfa", name = "r", descriptor = "[B")
    public byte[] field3217;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!wfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3224 = new String[] { method1852(method1851("\b)e\u001dE")), method1852(method1851("\u001dr'_")), method1852(method1851("\u0004a*\u001d\u0004\u001ai\"G\u0006[")), method1852(method1851("\u0004a*\u001dz[")), method1852(method1851("\u0004a*\u001d{[")), method1852(method1851("\u0004a*\u001dy[")), method1852(method1851("\u0004a*\u001d|[")) };

    @OriginalMember(owner = "client!wfa", name = "m", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!wfa", name = "p", descriptor = "Lda;")
    public static class67 field3216;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1847(boolean arg0) {
        try {
            field3216 = null;
            if (arg0) {
                method1847(false);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3224[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V", line = 17)
    public static final void method1848(int arg0) {
        try {
            field3212++;
            for (int var1 = arg0; var1 < class86.field958; var1++) {
                class305 var2 = class534.field7826[var1];
                if (var2.field4768 == 3) {
                    if (var2.field4759 == null) {
                        var2.field4762 = Integer.MIN_VALUE;
                    } else {
                        class594.field8714.method4980(var2.field4759);
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3224[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V", line = 43)
    public final void method1849(int arg0) {
        try {
            field3220++;
            this.field3214 = null;
            int var2 = 16 % ((arg0 - 35) / 59);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3224[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "([II[BLfia;)Z", line = 57)
    public final boolean method1850(int[] arg0, int arg1, byte[] arg2, class601 arg3) {
        try {
            field3221++;
            boolean var5 = true;
            int var6 = 0;
            class105 var7 = null;
            for (int var8 = arg1; var8 < 128; var8++) {
                if (arg2 == null || arg2[var8] != 0) {
                    int var9 = this.field3214[var8];
                    if (var9 != 0) {
                        if (var6 != var9) {
                            var6 = var9--;
                            if ((var9 & 0x1) == 0) {
                                var7 = arg3.method4467(var9 >> 2, arg0, 8731);
                            } else {
                                var7 = arg3.method4463(var9 >> 2, arg0, (byte) -79);
                            }
                            if (var7 == null) {
                                var5 = false;
                            }
                        }
                        if (var7 != null) {
                            this.field3218[var8] = var7;
                            this.field3214[var8] = 0;
                        }
                    }
                }
            }
            return var5;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field3224[5] + (arg0 == null ? field3224[1] : field3224[0]) + ',' + arg1 + ',' + (arg2 == null ? field3224[1] : field3224[0]) + ',' + (arg3 == null ? field3224[1] : field3224[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "()V", line = 119)
    public class210() {
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "([B)V", line = 121)
    public class210(byte[] arg0) {
        try {
            this.field3214 = new int[128];
            this.field3215 = new short[128];
            this.field3222 = new class545[128];
            this.field3223 = new byte[128];
            this.field3219 = new byte[128];
            this.field3218 = new class105[128];
            this.field3217 = new byte[128];
            class163 var2 = new class163(arg0);
            int var3;
            for (var3 = 0; var2.field2209[var2.field2201 + var3] != 0; var3++) {
            }
            byte[] var4 = new byte[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var4[var5] = var2.method1414(1);
            }
            var3++;
            var2.field2201++;
            int var6 = var2.field2201;
            var2.field2201 += var3;
            int var7;
            for (var7 = 0; var2.field2209[var2.field2201 + var7] != 0; var7++) {
            }
            byte[] var8 = new byte[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var8[var9] = var2.method1414(1);
            }
            var7++;
            var2.field2201++;
            int var10 = var2.field2201;
            var2.field2201 += var7;
            int var11;
            for (var11 = 0; var2.field2209[var2.field2201 + var11] != 0; var11++) {
            }
            byte[] var12 = new byte[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                var12[var13] = var2.method1414(1);
            }
            var11++;
            var2.field2201++;
            byte[] var14 = new byte[var11];
            int var15;
            if (var11 <= 1) {
                var15 = var11;
            } else {
                var14[1] = 1;
                int var16 = 1;
                var15 = 2;
                for (int var17 = 2; var17 < var11; var17++) {
                    int var18 = var2.method1455((byte) 62);
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
            class545[] var19 = new class545[var15];
            for (int var20 = 0; var20 < var19.length; var20++) {
                class545 var21 = var19[var20] = new class545();
                int var22 = var2.method1455((byte) 62);
                if (var22 > 0) {
                    var21.field8136 = new byte[var22 * 2];
                }
                int var23 = var2.method1455((byte) 62);
                if (var23 > 0) {
                    var21.field8139 = new byte[var23 * 2 + 2];
                    var21.field8139[1] = 64;
                }
            }
            int var24 = var2.method1455((byte) 62);
            byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
            int var26 = var2.method1455((byte) 62);
            byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
            int var28;
            for (var28 = 0; var2.field2209[var2.field2201 + var28] != 0; var28++) {
            }
            byte[] var29 = new byte[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var29[var30] = var2.method1414(1);
            }
            var28++;
            var2.field2201++;
            int var31 = 0;
            for (int var32 = 0; var32 < 128; var32++) {
                var31 += var2.method1455((byte) 62);
                this.field3215[var32] = (short) var31;
            }
            int var33 = 0;
            for (int var34 = 0; var34 < 128; var34++) {
                var33 += var2.method1455((byte) 62);
                this.field3215[var34] = (short) (this.field3215[var34] + (var33 << 8));
            }
            int var35 = 0;
            int var36 = 0;
            int var37 = 0;
            for (int var38 = 0; var38 < 128; var38++) {
                if (var35 == 0) {
                    if (var36 < var29.length) {
                        var35 = var29[var36++];
                    } else {
                        var35 = -1;
                    }
                    var37 = var2.method1424(false);
                }
                this.field3215[var38] = (short) (this.field3215[var38] + (class291.method2359(2, var37 - 1) << 14));
                this.field3214[var38] = var37;
                var35--;
            }
            int var39 = 0;
            int var40 = 0;
            int var41 = 0;
            for (int var42 = 0; var42 < 128; var42++) {
                if (this.field3214[var42] != 0) {
                    if (var39 == 0) {
                        if (var4.length > var40) {
                            var39 = var4[var40++];
                        } else {
                            var39 = -1;
                        }
                        var41 = var2.field2209[var6++] - 1;
                    }
                    var39--;
                    this.field3217[var42] = (byte) var41;
                }
            }
            int var43 = 0;
            int var44 = 0;
            int var45 = 0;
            for (int var46 = 0; var46 < 128; var46++) {
                if (this.field3214[var46] != 0) {
                    if (var44 == 0) {
                        var45 = var2.field2209[var10++] + 16 << 2;
                        if (var8.length > var43) {
                            var44 = var8[var43++];
                        } else {
                            var44 = -1;
                        }
                    }
                    this.field3223[var46] = (byte) var45;
                    var44--;
                }
            }
            int var47 = 0;
            int var48 = 0;
            class545 var49 = null;
            for (int var50 = 0; var50 < 128; var50++) {
                if (this.field3214[var50] != 0) {
                    if (var48 == 0) {
                        var49 = var19[var14[var47]];
                        if (var12.length > var47) {
                            var48 = var12[var47++];
                        } else {
                            var48 = -1;
                        }
                    }
                    var48--;
                    this.field3222[var50] = var49;
                }
            }
            int var51 = 0;
            int var52 = 0;
            int var53 = 0;
            for (int var54 = 0; var54 < 128; var54++) {
                if (var51 == 0) {
                    if (var52 >= var29.length) {
                        var51 = -1;
                    } else {
                        var51 = var29[var52++];
                    }
                    if (this.field3214[var54] > 0) {
                        var53 = var2.method1455((byte) 62) + 1;
                    }
                }
                this.field3219[var54] = (byte) var53;
                var51--;
            }
            this.field3213 = var2.method1455((byte) 62) + 1;
            for (int var55 = 0; var55 < var15; var55++) {
                class545 var56 = var19[var55];
                if (var56.field8136 != null) {
                    for (int var57 = 1; var57 < var56.field8136.length; var57 += 2) {
                        var56.field8136[var57] = var2.method1414(1);
                    }
                }
                if (var56.field8139 != null) {
                    for (int var58 = 3; var58 < (var56.field8139.length - 2); var58 += 2) {
                        var56.field8139[var58] = var2.method1414(1);
                    }
                }
            }
            if (var25 != null) {
                for (int var59 = 1; var59 < var25.length; var59 += 2) {
                    var25[var59] = var2.method1414(1);
                }
            }
            if (var27 != null) {
                for (int var60 = 1; var60 < var27.length; var60 += 2) {
                    var27[var60] = var2.method1414(1);
                }
            }
            for (int var61 = 0; var61 < var15; var61++) {
                class545 var62 = var19[var61];
                if (var62.field8139 != null) {
                    int var63 = 0;
                    for (int var64 = 2; var64 < var62.field8139.length; var64 += 2) {
                        var63 += var2.method1455((byte) 62) + 1;
                        var62.field8139[var64] = (byte) var63;
                    }
                }
            }
            for (int var65 = 0; var65 < var15; var65++) {
                class545 var66 = var19[var65];
                if (var66.field8136 != null) {
                    int var67 = 0;
                    for (int var68 = 2; var68 < var66.field8136.length; var68 += 2) {
                        var67 = var67 + var2.method1455((byte) 62) + 1;
                        var66.field8136[var68] = (byte) var67;
                    }
                }
            }
            if (var25 != null) {
                int var69 = var2.method1455((byte) 62);
                var25[0] = (byte) var69;
                for (int var70 = 2; var70 < var25.length; var70 += 2) {
                    var69 = var69 + var2.method1455((byte) 62) + 1;
                    var25[var70] = (byte) var69;
                }
                byte var71 = var25[0];
                byte var72 = var25[1];
                for (int var73 = 0; var73 < var71; var73++) {
                    this.field3219[var73] = (byte) (this.field3219[var73] * var72 + 32 >> 6);
                }
                int var74 = 2;
                while (var25.length > var74) {
                    byte var75 = var25[var74];
                    byte var76 = var25[var74 + 1];
                    int var77 = (var75 - var71) * var72 + ((var75 - var71) / 2);
                    for (int var78 = var71; var78 < var75; var78++) {
                        int var79 = class80.method696(var75 - var71, -1, var77);
                        this.field3219[var78] = (byte) (this.field3219[var78] * var79 + 32 >> 6);
                        var77 += var76 - var72;
                    }
                    var72 = var76;
                    var74 += 2;
                    var71 = var75;
                }
                Object var80 = null;
                for (int var81 = var71; var81 < 128; var81++) {
                    this.field3219[var81] = (byte) (this.field3219[var81] * var72 + 32 >> 6);
                }
            }
            if (var27 != null) {
                int var82 = var2.method1455((byte) 62);
                var27[0] = (byte) var82;
                for (int var83 = 2; var83 < var27.length; var83 += 2) {
                    var82 += var2.method1455((byte) 62) + 1;
                    var27[var83] = (byte) var82;
                }
                byte var84 = var27[0];
                int var85 = var27[1] << 1;
                for (int var86 = 0; var86 < var84; var86++) {
                    int var87 = (this.field3223[var86] & 0xFF) + var85;
                    if (var87 < 0) {
                        var87 = 0;
                    }
                    if (var87 > 128) {
                        var87 = 128;
                    }
                    this.field3223[var86] = (byte) var87;
                }
                int var88 = 2;
                while (var88 < var27.length) {
                    byte var89 = var27[var88];
                    int var90 = var27[var88 + 1] << 1;
                    int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                    for (int var92 = var84; var92 < var89; var92++) {
                        int var93 = class80.method696(var89 - var84, -1, var91);
                        int var94 = (this.field3223[var92] & 0xFF) + var93;
                        if (var94 < 0) {
                            var94 = 0;
                        }
                        if (var94 > 128) {
                            var94 = 128;
                        }
                        this.field3223[var92] = (byte) var94;
                        var91 += var90 - var85;
                    }
                    var88 += 2;
                    var84 = var89;
                    var85 = var90;
                }
                Object var95 = null;
                for (int var96 = var84; var96 < 128; var96++) {
                    int var97 = (this.field3223[var96] & 0xFF) + var85;
                    if (var97 < 0) {
                        var97 = 0;
                    }
                    if (var97 > 128) {
                        var97 = 128;
                    }
                    this.field3223[var96] = (byte) var97;
                }
            }
            for (int var98 = 0; var98 < var15; var98++) {
                var19[var98].field8148 = var2.method1455((byte) 62);
            }
            for (int var99 = 0; var99 < var15; var99++) {
                class545 var100 = var19[var99];
                if (var100.field8136 != null) {
                    var100.field8144 = var2.method1455((byte) 62);
                }
                if (var100.field8139 != null) {
                    var100.field8142 = var2.method1455((byte) 62);
                }
                if (var100.field8148 > 0) {
                    var100.field8141 = var2.method1455((byte) 62);
                }
            }
            for (int var101 = 0; var101 < var15; var101++) {
                var19[var101].field8140 = var2.method1455((byte) 62);
            }
            for (int var102 = 0; var102 < var15; var102++) {
                class545 var103 = var19[var102];
                if (var103.field8140 > 0) {
                    var103.field8137 = var2.method1455((byte) 62);
                }
            }
            for (int var104 = 0; var104 < var15; var104++) {
                class545 var105 = var19[var104];
                if (var105.field8137 > 0) {
                    var105.field8145 = var2.method1455((byte) 62);
                }
            }
        } catch (RuntimeException var107) {
            throw class759.method5498(var107, field3224[2] + (arg0 == null ? field3224[1] : field3224[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!wfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1851(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1852(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 115;
                    break;
                case 1:
                    var10005 = 7;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
