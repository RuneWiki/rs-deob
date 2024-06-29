import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class191 {

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "Lkm;")
    private class241 field2565 = null;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "Lnu;")
    private class426 field2545;

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "Z")
    private boolean field2567;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    public int field2559;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!uu", name = "y", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "[Ljava/lang/Object;")
    private Object[] field2554;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2562;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1265(String arg0, int arg1) {
        field2558++;
        if (!this.method1291((byte) 125)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 < 40) {
            this.method1282(false, -69);
        }
        int var4 = this.field2565.field3395.method1576(class410.method2529(256, var3), 108);
        return this.method1282(true, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIB)Z")
    private final boolean method1266(int arg0, int arg1, byte arg2) {
        field2573++;
        if (!this.method1291((byte) 121)) {
            return false;
        } else if (arg2 != -62) {
            return true;
        } else if (arg1 >= 0 && arg0 >= 0 && this.field2565.field3378.length > arg1 && this.field2565.field3378[arg1] > arg0) {
            return true;
        } else if (class112.field1562) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)V")
    public final void method1267(int arg0, boolean arg1) {
        field2571++;
        if (this.method1282(arg1, arg0) && this.field2562 != null) {
            this.field2562[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Z")
    public final boolean method1268(int arg0, int arg1) {
        field2564++;
        if (!this.method1282(true, arg1)) {
            return false;
        } else if (this.field2554[arg1] != null) {
            return true;
        } else if (arg0 >= -72) {
            return false;
        } else {
            this.method1272((byte) -74, arg1);
            return this.field2554[arg1] != null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public final void method1269(int arg0) {
        if (this.field2562 != null) {
            for (int var2 = 0; var2 < this.field2562.length; var2++) {
                this.field2562[var2] = null;
            }
        }
        if (arg0 <= 97) {
            this.field2567 = true;
        }
        field2569++;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method1270(int arg0, String arg1, String arg2) {
        field2560++;
        if (!this.method1291((byte) 119)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field2565.field3395.method1576(class410.method2529(256, var4), 84);
        if (!this.method1282(true, var6)) {
            return null;
        }
        if (arg0 >= -119) {
            this.method1274(null, 86);
        }
        int var7 = this.field2565.field3381[var6].method1576(class410.method2529(256, var5), 92);
        return this.method1281(var6, var7, 97);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Z")
    public final boolean method1271(int arg0, int arg1, int arg2) {
        field2583++;
        if (!this.method1266(arg0, arg1, (byte) -62)) {
            return false;
        } else if (this.field2562[arg1] != null && this.field2562[arg1][arg0] != null) {
            return true;
        } else if (this.field2554[arg1] == null) {
            this.method1272((byte) -97, arg1);
            if (this.field2554[arg1] == null) {
                if (arg2 != -15606) {
                    this.method1268(94, -13);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)V")
    private final void method1272(byte arg0, int arg1) {
        int var3 = 2 % ((-arg0 - 17) / 49);
        field2550++;
        if (this.field2567) {
            this.field2554[arg1] = this.field2545.method2602(arg1, 0);
        } else {
            this.field2554[arg1] = class240.method1577(false, 35, this.field2545.method2602(arg1, 0));
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)I")
    private final int method1273(int arg0, int arg1) {
        if (arg1 != 0) {
            return 51;
        }
        field2548++;
        if (this.method1282(true, arg0)) {
            return this.field2554[arg0] == null ? this.field2545.method2603(arg0, (byte) -118) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public final void method1274(String arg0, int arg1) {
        field2580++;
        if (this.method1291((byte) -64) && arg1 == 0) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field2565.field3395.method1576(class410.method2529(256, var3), 57);
            this.method1284(false, var4);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public final boolean method1275(String arg0, String arg1, byte arg2) {
        field2551++;
        int var4 = 62 / ((70 - arg2) / 46);
        if (!this.method1291((byte) 118)) {
            return false;
        }
        String var5 = arg0.toLowerCase();
        String var6 = arg1.toLowerCase();
        int var7 = this.field2565.field3395.method1576(class410.method2529(256, var5), 104);
        if (this.method1282(true, var7)) {
            int var8 = this.field2565.field3381[var7].method1576(class410.method2529(256, var6), 85);
            return this.method1271(var8, var7, -15606);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
    public final void method1276(int arg0) {
        field2553++;
        if (arg0 != 0) {
            this.field2545 = null;
        }
        if (this.field2554 != null) {
            for (int var2 = 0; var2 < this.field2554.length; var2++) {
                this.field2554[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIZI)I")
    public static final int method1277(int arg0, int arg1, boolean arg2, int arg3) {
        field2582++;
        class94 var4 = class402.method2483(arg2, (byte) -97, arg0);
        if (var4 == null) {
            return 0;
        } else if (~arg1 <= arg3 && arg1 < var4.field1377.length) {
            return var4.field1377[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(Ljava/lang/String;I)I")
    public final int method1278(String arg0, int arg1) {
        field2544++;
        if (!this.method1291((byte) 124)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field2565.field3395.method1576(class410.method2529(arg1 + 256, var3), arg1 + 77);
        if (arg1 != 0) {
            this.field2567 = false;
        }
        return this.method1273(var4, 0);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZZ)V")
    public final void method1279(int arg0, boolean arg1, boolean arg2) {
        field2549++;
        if (!this.method1291((byte) -31)) {
            return;
        }
        if (arg2) {
            this.field2565.field3395 = null;
            this.field2565.field3389 = null;
        }
        if (arg0 != 0) {
            this.field2562 = null;
        }
        if (arg1) {
            this.field2565.field3381 = null;
            this.field2565.field3385 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)I")
    public final int method1280(int arg0) {
        field2552++;
        if (!this.method1291((byte) 127)) {
            throw new IllegalStateException("");
        }
        int var2 = 23 / ((-arg0 - 17) / 39);
        return this.field2565.field3379;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)[B")
    public final byte[] method1281(int arg0, int arg1, int arg2) {
        field2563++;
        if (arg2 < 59) {
            this.method1269(72);
        }
        return this.method1296(null, arg0, arg1, -3);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZI)Z")
    private final boolean method1282(boolean arg0, int arg1) {
        field2574++;
        if (!arg0) {
            return false;
        } else if (!this.method1291((byte) -119)) {
            return false;
        } else if (arg1 >= 0 && this.field2565.field3378.length > arg1 && this.field2565.field3378[arg1] != 0) {
            return true;
        } else if (class112.field1562) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)I")
    public final int method1283(byte arg0) {
        field2577++;
        if (!this.method1291((byte) 4)) {
            return 0;
        }
        int var2 = 0;
        int var3 = -91 / ((79 - arg0) / 40);
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2554.length; var5++) {
            if (this.field2565.field3386[var5] > 0) {
                var2 += 100;
                var4 += this.method1273(var5, 0);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var4 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(ZI)V")
    private final void method1284(boolean arg0, int arg1) {
        this.field2545.method2599(arg1, -2);
        field2576++;
        if (arg0) {
            this.field2567 = false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1285(String arg0, int arg1) {
        field2572++;
        if (!this.method1291((byte) -25)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 1) {
            this.method1291((byte) 7);
        }
        int var4 = this.field2565.field3395.method1576(class410.method2529(256, var3), 96);
        return this.method1268(-126, var4);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1286(int arg0, String arg1) {
        field2579++;
        if (!this.method1291((byte) -34)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2565.field3395.method1576(class410.method2529(256, var3), 70);
        if (var4 < 0) {
            return false;
        } else {
            if (arg0 != 0) {
                this.field2562 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I[III)Z")
    private final boolean method1287(int arg0, int[] arg1, int arg2, int arg3) {
        field2555++;
        if (!this.method1282(true, arg0)) {
            return false;
        } else if (this.field2554[arg0] == null) {
            return false;
        } else {
            int var5 = this.field2565.field3386[arg0];
            int[] var6 = this.field2565.field3397[arg0];
            if (this.field2562[arg0] == null) {
                this.field2562[arg0] = new Object[this.field2565.field3378[arg0]];
            }
            Object[] var7 = this.field2562[arg0];
            boolean var8 = true;
            if (arg3 > -33) {
                this.method1285(null, -124);
            }
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var11 = class250.method1620(this.field2554[arg0], (byte) 105, true);
                class164 var12 = new class164(var11);
                var12.method1060((byte) -28, 5, arg1, var12.field2219.length);
            } else {
                var11 = class250.method1620(this.field2554[arg0], (byte) 51, false);
            }
            byte[] var13;
            try {
                var13 = class221.method1492(-93, var11);
            } catch (RuntimeException var49) {
                throw class165.method1118(var49, "T3 - " + (arg1 != null) + "," + arg0 + "," + var11.length + "," + class408.method2520(8679, var11.length, var11) + "," + class408.method2520(8679, var11.length - 2, var11) + "," + this.field2565.field3380[arg0] + "," + this.field2565.field3379);
            }
            if (this.field2567) {
                this.field2554[arg0] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field2559 == 0) {
                    var7[var48] = class240.method1577(false, 35, var13);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field2559 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * 4 * var32;
                class164 var34 = new class164(var13);
                int var35 = 0;
                int var36 = 0;
                var34.field2185 = var33;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method1099(91);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg2 == var40) {
                            var36 = var40;
                            var35 += var38;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                var34.field2185 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method1099(-119);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg2 == var47) {
                            class192.method1299(var13, var43, var41, var42, var45);
                            var42 += var45;
                        }
                        var43 += var45;
                    }
                }
                var7[var36] = var41;
            } else {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var16 * 4 * var5;
                class164 var18 = new class164(var13);
                var18.field2185 = var17;
                int[] var19 = new int[var5];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method1099(110);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field2185 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method1099(-113);
                        class192.method1299(var13, var25, var23[var28], var19[var28], var27);
                        var25 += var27;
                        var19[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field2559 == 0) {
                        var7[var30] = class240.method1577(false, 35, var23[var29]);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)Z")
    public final boolean method1288(int arg0, int arg1) {
        if (arg1 != 18555) {
            this.method1270(-81, null, null);
        }
        field2557++;
        if (!this.method1291((byte) 126)) {
            return false;
        } else if (this.field2565.field3378.length == 1) {
            return this.method1271(arg0, 0, arg1 - 34161);
        } else if (!this.method1282(true, arg0)) {
            return false;
        } else if (this.field2565.field3378[arg0] == 1) {
            return this.method1271(0, arg0, -15606);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(II)[B")
    public final byte[] method1289(int arg0, int arg1) {
        field2556++;
        if (!this.method1291((byte) 124)) {
            return null;
        } else if (this.field2565.field3378.length == 1) {
            return this.method1281(0, arg0, 77);
        } else if (!this.method1282(true, arg0)) {
            return null;
        } else if (this.field2565.field3378[arg0] == 1) {
            return this.method1281(arg0, 0, 120);
        } else {
            if (arg1 < 92) {
                this.field2562 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(ZI)I")
    public final int method1290(boolean arg0, int arg1) {
        field2561++;
        if (this.method1282(true, arg1)) {
            if (arg0) {
                this.method1278(null, -65);
            }
            return this.field2565.field3378[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)Z")
    private final boolean method1291(byte arg0) {
        int var2 = -111 / ((arg0 - 71) / 45);
        field2568++;
        if (this.field2565 == null) {
            this.field2565 = this.field2545.method2600((byte) -102);
            if (this.field2565 == null) {
                return false;
            }
            this.field2554 = new Object[this.field2565.field3388];
            this.field2562 = new Object[this.field2565.field3388][];
        }
        return true;
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(II)I")
    public final int method1292(int arg0, int arg1) {
        if (arg1 > -46) {
            return 119;
        }
        field2581++;
        if (this.method1291((byte) -40)) {
            int var3 = this.field2565.field3395.method1576(arg0, 121);
            return this.method1282(true, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "(II)[I")
    public final int[] method1293(int arg0, int arg1) {
        field2570++;
        if (!this.method1282(true, arg0)) {
            return null;
        }
        int[] var3 = this.field2565.field3397[arg0];
        if (var3 == null) {
            var3 = new int[this.field2565.field3386[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        if (arg1 != 20938) {
            field2578 = 30;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)I")
    public final int method1294(int arg0) {
        field2575++;
        if (this.method1291((byte) 126)) {
            if (arg0 != -1) {
                this.field2559 = -38;
            }
            return this.field2565.field3378.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)Z")
    public final boolean method1295(int arg0) {
        field2546++;
        if (!this.method1291((byte) 21)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 >= -28) {
            return false;
        }
        for (int var3 = 0; var3 < this.field2565.field3390.length; var3++) {
            int var4 = this.field2565.field3390[var3];
            if (this.field2554[var4] == null) {
                this.method1272((byte) 118, var4);
                if (this.field2554[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "([IIII)[B")
    public final byte[] method1296(int[] arg0, int arg1, int arg2, int arg3) {
        field2547++;
        if (!this.method1266(arg2, arg1, (byte) -62)) {
            return null;
        }
        if (this.field2562[arg1] == null || this.field2562[arg1][arg2] == null) {
            boolean var5 = this.method1287(arg1, arg0, arg2, -126);
            if (!var5) {
                this.method1272((byte) 71, arg1);
                boolean var6 = this.method1287(arg1, arg0, arg2, -79);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg3 != -3) {
            this.method1288(106, 98);
        }
        byte[] var7 = class250.method1620(this.field2562[arg1][arg2], (byte) 34, false);
        if (this.field2559 == 1) {
            this.field2562[arg1][arg2] = null;
            if (this.field2565.field3378[arg1] == 1) {
                this.field2562[arg1] = null;
            }
        } else if (this.field2559 == 2) {
            this.field2562[arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lnu;ZI)V")
    public class191(class426 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field2545 = arg0;
        this.field2567 = arg1;
        this.field2559 = arg2;
    }
}
