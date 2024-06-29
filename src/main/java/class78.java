import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class78 {

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    private int field1301 = -1;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    private int field1306 = 0;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Loj;")
    private class246 field1295 = new class246();

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Z")
    public boolean field1313 = false;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    private int field1304;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "[[I")
    private int[][] field1303;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "[Luj;")
    private class280[] field1296;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field1298 = 0;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lqd;")
    public static class173 field1297 = new class173(64);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Llj;")
    public static class25 field1293;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "Lfm;")
    public static class93 field1311;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "[Lbl;")
    public static class146[] field1312;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldk;II)Ltc;")
    public static final class266 method527(class251 arg0, int arg1, int arg2) {
        field1294++;
        if (arg2 == -2) {
            byte[] var3 = arg0.method1689(arg1, -126);
            return var3 == null ? null : new class266(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBLag;)Ljava/lang/String;")
    public static final String method528(int arg0, byte arg1, class211 arg2) {
        if (arg1 != 95) {
            return null;
        }
        field1309++;
        if (!client.method2015(arg2).method1527(true, arg0) && arg2.field3377 == null) {
            return null;
        } else if (arg2.field3368 == null || arg0 >= arg2.field3368.length || arg2.field3368[arg0] == null || arg2.field3368[arg0].trim().length() == 0) {
            return class176.field2877 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field3368[arg0];
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIZZIIII)V")
    public static final void method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        if (!arg7) {
            field1293 = null;
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class193.field3135[var12][var36] = 0;
                class117.field1887[var12][var36] = 99999999;
            }
        }
        class193.field3135[arg8][arg2] = 99;
        field1292++;
        class117.field1887[arg8][arg2] = 0;
        int var13 = arg8;
        int var14 = arg2;
        byte var15 = 0;
        class163.field2645[var15] = arg8;
        int var37 = var15 + 1;
        class155.field2425[var15] = arg2;
        int var16 = 0;
        boolean var17 = false;
        int[][] var18 = class131.field2065[class56.field941].field728;
        label317: while (var37 != var16) {
            var13 = class163.field2645[var16];
            var14 = class155.field2425[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg9 == var13 && arg10 == var14) {
                var17 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class131.field2065[class56.field941].method309(arg10, var13, var14, arg9, arg11 - 1, arg5, arg1, -1)) {
                    var17 = true;
                    break;
                }
                if (arg11 < 10 && class131.field2065[class56.field941].method296(arg9, var14, var13, (byte) -94, arg10, arg5, arg1, arg11 - 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg4 != 0 && class131.field2065[class56.field941].method298(arg9, arg3, arg4, arg5, var13, arg10, var14, 127, arg0)) {
                var17 = true;
                break;
            }
            int var27 = class117.field1887[var13][var14] + 1;
            if (var13 > 0 && class193.field3135[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x2C010E) == 0 && (var18[var13 - 1][var14 + arg5 - 1] & 0x2C0138) == 0) {
                int var28 = 1;
                while (true) {
                    if (var28 >= arg5 - 1) {
                        class163.field2645[var37] = var13 - 1;
                        class155.field2425[var37] = var14;
                        var37 = var37 + 1 & 0xFFF;
                        class193.field3135[var13 - 1][var14] = 2;
                        class117.field1887[var13 - 1][var14] = var27;
                        break;
                    }
                    if ((var18[var13 - 1][var14 + var28] & 0x2C013E) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var13 < 102 && class193.field3135[var13 + 1][var14] == 0 && (var18[arg5 + var13][var14] & 0x2C0183) == 0 && (var18[arg5 + var13][arg5 + var14 - 1] & 0x2C01E0) == 0) {
                int var29 = 1;
                while (true) {
                    if (var29 >= (arg5 - 1)) {
                        class163.field2645[var37] = var13 + 1;
                        class155.field2425[var37] = var14;
                        var37 = var37 + 1 & 0xFFF;
                        class193.field3135[var13 + 1][var14] = 8;
                        class117.field1887[var13 + 1][var14] = var27;
                        break;
                    }
                    if ((var18[arg5 + var13][var14 + var29] & 0x2C01E3) != 0) {
                        break;
                    }
                    var29++;
                }
            }
            if (var14 > 0 && class193.field3135[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x2C010E) == 0 && (var18[var13 + arg5 - 1][var14 - 1] & 0x2C0183) == 0) {
                int var30 = 1;
                while (true) {
                    if (var30 >= arg5 - 1) {
                        class163.field2645[var37] = var13;
                        class155.field2425[var37] = var14 - 1;
                        class193.field3135[var13][var14 - 1] = 1;
                        class117.field1887[var13][var14 - 1] = var27;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[var13 + var30][var14 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var30++;
                }
            }
            if (var14 < 102 && class193.field3135[var13][var14 + 1] == 0 && (var18[var13][arg5 + var14] & 0x2C0138) == 0 && (var18[var13 + arg5 - 1][arg5 + var14] & 0x2C01E0) == 0) {
                int var31 = 1;
                while (true) {
                    if (var31 >= (arg5 - 1)) {
                        class163.field2645[var37] = var13;
                        class155.field2425[var37] = var14 + 1;
                        class193.field3135[var13][var14 + 1] = 4;
                        var37 = var37 + 1 & 0xFFF;
                        class117.field1887[var13][var14 + 1] = var27;
                        break;
                    }
                    if ((var18[var13 + var31][arg5 + var14] & 0x2C01F8) != 0) {
                        break;
                    }
                    var31++;
                }
            }
            if (var13 > 0 && var14 > 0 && class193.field3135[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x2C010E) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= arg5) {
                        class163.field2645[var37] = var13 - 1;
                        class155.field2425[var37] = var14 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class193.field3135[var13 - 1][var14 - 1] = 3;
                        class117.field1887[var13 - 1][var14 - 1] = var27;
                        break;
                    }
                    if ((var18[var13 - 1][var32 + var14 - 1] & 0x2C013E) != 0 || (var18[var13 + var32 - 1][var14 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var13 < 102 && var14 > 0 && class193.field3135[var13 + 1][var14 - 1] == 0 && (var18[arg5 + var13][var14 - 1] & 0x2C0183) == 0) {
                int var33 = 1;
                while (true) {
                    if (arg5 <= var33) {
                        class163.field2645[var37] = var13 + 1;
                        class155.field2425[var37] = var14 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class193.field3135[var13 + 1][var14 - 1] = 9;
                        class117.field1887[var13 + 1][var14 - 1] = var27;
                        break;
                    }
                    if ((var18[arg5 + var13][var14 + var33 - 1] & 0x2C01E3) != 0 || (var18[var13 + var33][var14 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var13 > 0 && var14 < 102 && class193.field3135[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][arg5 + var14] & 0x2C0138) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg5 <= var34) {
                        class163.field2645[var37] = var13 - 1;
                        class155.field2425[var37] = var14 + 1;
                        class193.field3135[var13 - 1][var14 + 1] = 6;
                        var37 = var37 + 1 & 0xFFF;
                        class117.field1887[var13 - 1][var14 + 1] = var27;
                        break;
                    }
                    if ((var18[var13 - 1][var14 + var34] & 0x2C013E) != 0 || (var18[var13 + var34 - 1][var14 + arg5] & 0x2C01F8) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var13 < 102 && var14 < 102 && class193.field3135[var13 + 1][var14 + 1] == 0 && (var18[arg5 + var13][var14 + arg5] & 0x2C01E0) == 0) {
                for (int var35 = 1; var35 < arg5; var35++) {
                    if ((var18[var13 + var35][arg5 + var14] & 0x2C01F8) != 0 || (var18[arg5 + var13][var14 + var35] & 0x2C01E3) != 0) {
                        continue label317;
                    }
                }
                class163.field2645[var37] = var13 + 1;
                class155.field2425[var37] = var14 + 1;
                class193.field3135[var13 + 1][var14 + 1] = 12;
                class117.field1887[var13 + 1][var14 + 1] = var27;
                var37 = var37 + 1 & 0xFFF;
            }
        }
        if (!var17) {
            if (!arg6) {
                return;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg9 - var21; var22 <= arg9 + var21; var22++) {
                for (int var23 = arg10 - var21; var23 <= (arg10 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class117.field1887[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var22 < arg9) {
                            var24 = arg9 - var22;
                        } else if (var22 > arg9 + arg3 - 1) {
                            var24 = var22 + 1 - arg9 - arg3;
                        }
                        if (arg10 > var23) {
                            var25 = arg10 - var23;
                        } else if (var23 > (arg10 + arg4 - 1)) {
                            var25 = var23 + 1 - arg4 - arg10;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var20 > var26 || var20 == var26 && class117.field1887[var22][var23] < var19) {
                            var19 = class117.field1887[var22][var23];
                            var14 = var23;
                            var20 = var26;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return;
            }
            if (arg8 == var13 && arg2 == var14) {
                return;
            }
        }
        class86.field1418 = var14;
        class130.field2033 = false;
        class237.field3804 = var13;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static final void method530(boolean arg0) {
        class71.field1202.method1257(6);
        field1299++;
        if (!arg0) {
            method537(76);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[I")
    public final int[] method531(int arg0, byte arg1) {
        if (arg1 < 53) {
            this.method531(-6, (byte) 0);
        }
        field1300++;
        if (this.field1308 == this.field1304) {
            this.field1313 = this.field1296[arg0] == null;
            this.field1296[arg0] = class158.field2445;
            return this.field1303[arg0];
        } else if (this.field1308 == 1) {
            this.field1313 = this.field1301 != arg0;
            this.field1301 = arg0;
            return this.field1303[0];
        } else {
            class280 var3 = this.field1296[arg0];
            if (var3 == null) {
                this.field1313 = true;
                if (this.field1306 >= this.field1308) {
                    class280 var4 = (class280) this.field1295.method1640((byte) -124);
                    var3 = new class280(arg0, var4.field4488);
                    this.field1296[var4.field4489] = null;
                    var4.method913(-3542);
                } else {
                    var3 = new class280(arg0, this.field1306);
                    this.field1306++;
                }
                this.field1296[arg0] = var3;
            } else {
                this.field1313 = false;
            }
            this.field1295.method1645(55, var3);
            return this.field1303[var3.field4488];
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)[[I")
    public final int[][] method532(byte arg0) {
        field1291++;
        if (arg0 != -10) {
            return null;
        } else if (this.field1308 == this.field1304) {
            for (int var2 = 0; var2 < this.field1308; var2++) {
                this.field1296[var2] = class158.field2445;
            }
            return this.field1303;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public static void method533(boolean arg0) {
        if (arg0) {
            field1293 = null;
            field1311 = null;
            field1297 = null;
            field1312 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldk;I)V")
    public static final void method534(class251 arg0, int arg1) {
        field1307++;
        class137.field2168 = class310.method2070(class163.field2634, arg0, -24240);
        class101.field1633 = new int[256];
        for (int var2 = arg1; var2 < 3; var2++) {
            float var4 = (float) ((class307.field4896[var2] & 0xFF0000) >> 16);
            int var5 = (class307.field4896[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            int var7 = class307.field4896[var2 + 1] >> 8 & 0xFF;
            float var8 = (float) ((class307.field4896[var2] & 0xFF00) >> 8);
            float var9 = (float) (class307.field4896[var2] & 0xFF);
            int var10 = class307.field4896[var2 + 1] & 0xFF;
            float var11 = ((float) var7 - var8) / 64.0F;
            float var12 = ((float) var10 - var9) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class101.field1633[var2 * 64 + var13] = class173.method1263((int) var9, class173.method1263((int) var8 << 8, (int) var4 << 16));
                var9 += var12;
                var4 += var6;
                var8 += var11;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class101.field1633[var3] = class307.field4896[3];
        }
        class224.field3642 = new int[32768];
        class23.field293 = new int[32768];
        class282.method1891((class260) null, 9479);
        class241.field3843 = new int[32768];
        class282.field4509 = new int[32768];
        class46.field780 = new class232(128, 254);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
    public final void method535(byte arg0) {
        for (int var2 = 0; var2 < this.field1308; var2++) {
            this.field1303[var2] = null;
        }
        if (arg0 != 26) {
            this.method532((byte) -103);
        }
        field1305++;
        this.field1296 = null;
        this.field1303 = null;
        this.field1295.method1650((byte) -119);
        this.field1295 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method536(boolean arg0, String arg1, int arg2) {
        String var3 = arg1.toLowerCase();
        field1290++;
        int var4 = 0;
        int var5 = arg0 ? 32768 : 0;
        int var6 = var5 + (arg0 ? class146.field2299 : class281.field4491);
        short[] var7 = new short[16];
        if (arg2 != -51) {
            field1297 = null;
        }
        for (int var8 = var5; var8 < var6; var8++) {
            class87 var11 = class46.method330((byte) 94, var8);
            if (var11.field1423 && var11.method598(true).toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 50) {
                    class136.field2148 = null;
                    class177.field2900 = -1;
                    return;
                }
                if (var4 >= var7.length) {
                    short[] var12 = new short[var7.length * 2];
                    for (int var13 = 0; var13 < var4; var13++) {
                        var12[var13] = var7[var13];
                    }
                    var7 = var12;
                }
                var7[var4++] = (short) var8;
            }
        }
        class119.field1910 = 0;
        class177.field2900 = var4;
        class136.field2148 = var7;
        String[] var9 = new String[class177.field2900];
        for (int var10 = 0; var10 < class177.field2900; var10++) {
            var9[var10] = class46.method330((byte) 109, var7[var10]).method598(true);
        }
        class249.method1657(class136.field2148, var9, arg2 + 167);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static final void method537(int arg0) {
        class188.field3056 = arg0;
        for (int var1 = 0; var1 < class96.field1548; var1++) {
            for (int var2 = 0; var2 < class59.field972; var2++) {
                if (class218.field3584[arg0][var1][var2] == null) {
                    class218.field3584[arg0][var1][var2] = new class151(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class96.field1548 * 128) {
            arg0 = class96.field1548 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class59.field972 * 128) {
            arg2 = class59.field972 * 128 - 1;
        }
        class108.field1729 = class302.field4823[arg3];
        class285.field4524 = class302.field4824[arg3];
        class264.field4230 = class302.field4823[arg4];
        class69.field1140 = class302.field4824[arg4];
        class100.field1626 = arg0;
        class241.field3841 = arg1;
        class238.field3823 = arg2;
        class39.field562 = arg0 / 128;
        class39.field576 = arg2 / 128;
        class308.field4924 = class39.field562 - class209.field3307;
        if (class308.field4924 < 0) {
            class308.field4924 = 0;
        }
        class52.field874 = class39.field576 - class209.field3307;
        if (class52.field874 < 0) {
            class52.field874 = 0;
        }
        class189.field3060 = class39.field562 + class209.field3307;
        if (class189.field3060 > class96.field1548) {
            class189.field3060 = class96.field1548;
        }
        class107.field1711 = class39.field576 + class209.field3307;
        if (class107.field1711 > class59.field972) {
            class107.field1711 = class59.field972;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class209.field3307 + class209.field3307 + 2; var16++) {
            for (int var19 = 0; var19 < class209.field3307 + class209.field3307 + 2; var19++) {
                int var20 = (var16 - class209.field3307 << 7) - (class100.field1626 & 0x7F);
                int var21 = (var19 - class209.field3307 << 7) - (class238.field3823 & 0x7F);
                int var22 = class39.field562 + var16 - class209.field3307;
                int var23 = class39.field576 + var19 - class209.field3307;
                if (var22 >= 0 && var23 >= 0 && var22 < class96.field1548 && var23 < class59.field972) {
                    int var24;
                    if (class26.field324 == null) {
                        var24 = class148.field2320[0][var22][var23] + 128 - class241.field3841;
                    } else {
                        var24 = class26.field324[0][var22][var23] + 128 - class241.field3841;
                    }
                    int var25 = class148.field2320[3][var22][var23] - class241.field3841 - 1000;
                    client.field4858[var16][var19] = class64.method447(var20, var25, var24, var21, var15);
                } else {
                    client.field4858[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class209.field3307 + class209.field3307 + 1; var17++) {
            for (int var18 = 0; var18 < class209.field3307 + class209.field3307 + 1; var18++) {
                class203.field3245[var17][var18] = client.field4858[var17][var18] || client.field4858[var17 + 1][var18] || client.field4858[var17][var18 + 1] || client.field4858[var17 + 1][var18 + 1];
            }
        }
        class174.field2849 = arg6;
        class198.field3190 = arg7;
        class149.field2336 = arg8;
        class105.field1672 = arg9;
        class267.field4305 = arg10;
        class294.method1955();
        if (class267.field4301 != null) {
            class188.method1344(true);
            class75.method505(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class188.method1344(false);
        }
        class75.method505(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(III)V")
    public class78(int arg0, int arg1, int arg2) {
        this.field1304 = arg1;
        this.field1308 = arg0;
        this.field1303 = new int[this.field1308][arg2];
        this.field1296 = new class280[this.field1304];
    }
}
