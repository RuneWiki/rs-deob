import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class91 {

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    private int field1251 = -1;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Z")
    private boolean field1259 = true;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[Lu;")
    private class186[] field1249;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "[Lu;")
    private class186[] field1267;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lu;")
    private class186 field1250;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lwe;")
    public static class24 field1252 = new class24(4);

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Z")
    public static boolean field1254 = false;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Z")
    public static boolean field1263 = true;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Lqa;")
    private class243 field1262;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILnr;)Z")
    public final boolean method561(int arg0, int arg1, class437 arg2) {
        field1269++;
        if (this.field1251 != arg0) {
            this.field1251 = arg0;
            int var4 = class8.method64(1388313616, arg0);
            if (var4 > arg0) {
                var4 = class34.method278(arg0, (byte) 78);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field1264 != var4) {
                this.field1264 = var4;
                this.field1262 = null;
            }
            if (this.field1249 != null) {
                this.field1268 = 0;
                int[] var5 = new int[this.field1249.length];
                for (int var6 = 0; var6 < this.field1249.length; var6++) {
                    class186 var7 = this.field1249[var6];
                    if (var7.method1155(this.field1256, this.field1253, this.field1258, this.field1251)) {
                        var5[this.field1268] = var7.field2534;
                        this.field1267[this.field1268++] = var7;
                    }
                }
                class244.method1506(this.field1268 - 1, var5, this.field1267, 0, 116);
            }
            this.field1259 = true;
        }
        boolean var8 = false;
        if (this.field1259) {
            this.field1259 = false;
            for (int var9 = this.field1268 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field1267[var9].method1162(arg2, this.field1250);
                this.field1259 |= !var10;
                var8 |= var10;
            }
        }
        if (arg1 != -18995) {
            method569(-55);
        }
        return var8;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static final void method562(byte arg0) {
        if (arg0 != -58) {
            return;
        }
        field1271++;
        for (int var1 = 0; var1 < 5; var1++) {
            class408.field6122[var1] = false;
        }
        class244.field3405 = class179.field2364;
        class104.field1402 = -1;
        class108.field1476 = class265.field3878;
        class153.field1997 = class130.field1745;
        class323.field4620 = class50.field698;
        class274.field4035 = 0;
        class100.field1358 = 0;
        class168.field2210 = class237.field3326;
        class5.field48 = 5;
        class384.field5751 = class7.field71;
        class125.field1667 = -1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method563(int arg0, boolean arg1, int arg2) {
        if (arg0 < 68) {
            return null;
        } else {
            field1261++;
            return arg1 && arg2 >= 0 ? class93.method572(arg2, arg1, 10, (byte) -124) : Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILnr;)V")
    public static final void method564(int arg0, class437 arg1) {
        if (class446.field6493) {
            class306.method1923((byte) 67, arg1);
        } else {
            class52.method354(-1, arg1);
        }
        if (arg0 >= -94) {
            method569(118);
        }
        field1270++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V")
    public static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1255++;
        for (int var6 = arg1; var6 < arg1 + arg2; var6++) {
            for (int var9 = arg5; var9 < arg5 + arg0; var9++) {
                if (var9 >= 0 && var9 < class324.field4652 && var6 >= 0 && var6 < class336.field4964) {
                    class128.field1703[arg4][var9][var6] = arg4 <= 0 ? 0 : class128.field1703[arg4 - 1][var9][var6] - 240;
                }
            }
        }
        if (arg5 > 0 && class324.field4652 > arg5) {
            for (int var7 = arg1 + 1; var7 < arg1 + arg2; var7++) {
                if (var7 >= 0 && class336.field4964 > var7) {
                    class128.field1703[arg4][arg5][var7] = class128.field1703[arg4][arg5 - 1][var7];
                }
            }
        }
        if (arg3 != -22467) {
            method563(-11, false, 91);
        }
        if (arg1 > 0 && class336.field4964 > arg1) {
            for (int var8 = arg5 + 1; var8 < (arg0 + arg5); var8++) {
                if (var8 >= 0 && class324.field4652 > var8) {
                    class128.field1703[arg4][var8][arg1] = class128.field1703[arg4][var8][arg1 - 1];
                }
            }
        }
        if (arg5 < 0 || arg1 < 0 || arg5 >= class324.field4652 || arg1 >= class336.field4964) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 > 0 && class128.field1703[arg4][arg5 - 1][arg1] != 0) {
                class128.field1703[arg4][arg5][arg1] = class128.field1703[arg4][arg5 - 1][arg1];
                return;
            }
            if (arg1 > 0 && class128.field1703[arg4][arg5][arg1 - 1] != 0) {
                class128.field1703[arg4][arg5][arg1] = class128.field1703[arg4][arg5][arg1 - 1];
                return;
            }
            if (arg5 > 0 && arg1 > 0 && class128.field1703[arg4][arg5 - 1][arg1 - 1] != 0) {
                class128.field1703[arg4][arg5][arg1] = class128.field1703[arg4][arg5 - 1][arg1 - 1];
                return;
            }
        } else if (arg5 <= 0 || class128.field1703[arg4 - 1][arg5 - 1][arg1] == class128.field1703[arg4][arg5 - 1][arg1]) {
            if (arg1 > 0 && class128.field1703[arg4][arg5][arg1 - 1] != class128.field1703[arg4 - 1][arg5][arg1 - 1]) {
                class128.field1703[arg4][arg5][arg1] = class128.field1703[arg4][arg5][arg1 - 1];
                return;
            }
            if (arg5 > 0 && arg1 > 0 && class128.field1703[arg4 - 1][arg5 - 1][arg1 - 1] != class128.field1703[arg4][arg5 - 1][arg1 - 1]) {
                class128.field1703[arg4][arg5][arg1] = class128.field1703[arg4][arg5 - 1][arg1 - 1];
                return;
            }
            return;
        } else {
            class128.field1703[arg4][arg5][arg1] = class128.field1703[arg4][arg5 - 1][arg1];
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public final void method566(int arg0) {
        field1257++;
        if (this.field1249 != null) {
            for (int var2 = 0; var2 < this.field1249.length; var2++) {
                this.field1249[var2].method1159();
            }
        }
        this.field1262 = null;
        if (arg0 < 99) {
            field1254 = false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILnr;IIIIIIII)V")
    public final void method567(int arg0, class437 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1260++;
        int var11 = arg3 + arg5 & 0x3FFF;
        if (this.field1266 == -1) {
            arg1.method2188(arg7, arg4, arg8, arg9, arg6, 0);
        } else {
            class175 var12 = class281.field4136.method1760(arg0 ^ 0x2B3C, this.field1266);
            if (this.field1262 == null && class281.field4136.method1756(false, this.field1266)) {
                int[] var13 = var12.field2274 ? class281.field4136.method1757(0.7F, this.field1264, this.field1266, this.field1264, false, false) : class281.field4136.method1758(this.field1264, this.field1266, false, -11047, 0.7F, this.field1264);
                this.field1262 = arg1.method2158(var13, 0, this.field1264, this.field1264, this.field1264);
            }
            if (!var12.field2274) {
                arg1.method2188(arg7, arg4, arg8, arg9, arg6, 0);
            }
            if (this.field1262 != null) {
                int var14 = var12.field2274 ? 0 : 1;
                int var15 = arg2 * arg9 / -4096;
                int var16;
                for (var16 = arg9 * var11 / 4096 + (arg8 - arg9) / 2; var16 > arg9; var16 -= arg9) {
                }
                while (var16 < 0) {
                    var16 += arg9;
                }
                while (arg9 < var15) {
                    var15 -= arg9;
                }
                while (var15 < 0) {
                    var15 += arg9;
                }
                for (int var17 = var16 - arg9; var17 < arg8; var17 += arg9) {
                    for (int var18 = var15 - arg9; var18 < arg9; var18 += arg9) {
                        this.field1262.method32(var17 + arg7, arg4 + var18, arg9, arg9, 0, 0, var14);
                    }
                }
            }
        }
        if (arg0 != -26367) {
            method565(-37, -47, 22, -98, 67, 79);
        }
        for (int var19 = this.field1268 - 1; var19 >= 0; var19--) {
            this.field1267[var19].method1157(arg1, arg7, arg4, arg8, arg9, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public static void method568(byte arg0) {
        field1252 = null;
        if (arg0 > -24) {
            field1252 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static final void method569(int arg0) {
        if (arg0 != 2) {
            field1248 = 84;
        }
        field1247++;
        class114.field1556.method761(115);
        int var1 = class114.field1556.method763(8, false);
        if (var1 < class191.field2662) {
            for (int var2 = var1; var2 < class191.field2662; var2++) {
                class188.field2557[class122.field1630++] = class416.field6202[var2];
            }
        }
        if (class191.field2662 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class191.field2662 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class416.field6202[var3];
            class129 var5 = class23.field408[var4];
            int var6 = class114.field1556.method763(1, false);
            if (var6 == 0) {
                class416.field6202[class191.field2662++] = var4;
                var5.field260 = class50.field698;
            } else {
                int var7 = class114.field1556.method763(2, false);
                if (var7 == 0) {
                    class416.field6202[class191.field2662++] = var4;
                    var5.field260 = class50.field698;
                    class159.field2085[class439.field6430++] = var4;
                } else if (var7 == 1) {
                    class416.field6202[class191.field2662++] = var4;
                    var5.field260 = class50.field698;
                    int var8 = class114.field1556.method763(3, false);
                    var5.method135(var8, true, 1);
                    int var9 = class114.field1556.method763(1, false);
                    if (var9 == 1) {
                        class159.field2085[class439.field6430++] = var4;
                    }
                } else if (var7 == 2) {
                    class416.field6202[class191.field2662++] = var4;
                    var5.field260 = class50.field698;
                    if (class114.field1556.method763(1, false) == 1) {
                        int var11 = class114.field1556.method763(3, false);
                        var5.method135(var11, true, 2);
                        int var12 = class114.field1556.method763(3, false);
                        var5.method135(var12, true, 2);
                    } else {
                        int var10 = class114.field1556.method763(3, false);
                        var5.method135(var10, true, 0);
                    }
                    int var13 = class114.field1556.method763(1, false);
                    if (var13 == 1) {
                        class159.field2085[class439.field6430++] = var4;
                    }
                } else if (var7 == 3) {
                    class188.field2557[class122.field1630++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[Lu;IIII)V")
    public class91(int arg0, class186[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1266 = arg0;
        this.field1256 = arg3;
        this.field1249 = arg1;
        this.field1253 = arg4;
        this.field1258 = arg5;
        if (arg1 == null) {
            this.field1250 = null;
            this.field1267 = null;
        } else {
            this.field1267 = new class186[arg1.length];
            this.field1250 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
