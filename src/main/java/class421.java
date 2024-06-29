import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class421 {

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Llf;")
    private class513 field6095 = null;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "Z")
    private boolean field6115;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public int field6093;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "Lar;")
    private class3 field6103;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "Z")
    public static boolean field6110 = false;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "Lkc;")
    public static class157 field6097 = new class157("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "Len;")
    public static class356 field6120;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "[Ljava/lang/Object;")
    private Object[] field6107;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6091;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static final void method2487(int arg0) {
        if (arg0 == 0) {
            class228.field3204.method505(class189.field2780, class257.field3497, class315.field4275);
            field6123++;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public final int method2488(String arg0, boolean arg1) {
        field6127++;
        if (this.method2520(arg1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6095.field7510.method1800(18257, class504.method2992(var3, true));
            return this.method2507(var4, 119) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Z")
    public final boolean method2489(int arg0, byte arg1) {
        field6126++;
        if (!this.method2507(arg0, -114)) {
            return false;
        }
        int var3 = -27 / ((arg1 + 41) / 47);
        if (this.field6107[arg0] == null) {
            this.method2504(arg0, false);
            return this.field6107[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method2490(int arg0, String arg1, String arg2) {
        field6119++;
        if (arg0 != 1) {
            this.method2494(null, -44);
        }
        if (!this.method2520(false)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field6095.field7510.method1800(arg0 + 18256, class504.method2992(var4, true));
        if (this.method2507(var6, 15)) {
            int var7 = this.field6095.field7519[var6].method1800(18257, class504.method2992(var5, true));
            return this.method2512(var6, (byte) -93, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2491(String arg0, int arg1) {
        field6100++;
        if (!this.method2520(false)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 255) {
            field6120 = null;
        }
        int var4 = this.field6095.field7510.method1800(18257, class504.method2992(var3, true));
        return this.method2489(var4, (byte) 53);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II[IZ)[B")
    public final byte[] method2492(int arg0, int arg1, int[] arg2, boolean arg3) {
        field6092++;
        if (!arg3) {
            method2487(91);
        }
        if (!this.method2519((byte) 105, arg0, arg1)) {
            return null;
        }
        if (this.field6091[arg1] == null || this.field6091[arg1][arg0] == null) {
            boolean var5 = this.method2500(arg2, arg1, arg0, -72);
            if (!var5) {
                this.method2504(arg1, false);
                boolean var6 = this.method2500(arg2, arg1, arg0, 99);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class234.method1428(this.field6091[arg1][arg0], false, false);
        if (this.field6093 == 1) {
            this.field6091[arg1][arg0] = null;
            if (this.field6095.field7508[arg1] == 1) {
                this.field6091[arg1] = null;
            }
        } else if (this.field6093 == 2) {
            this.field6091[arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)I")
    public final int method2493(byte arg0) {
        field6116++;
        if (arg0 != -41) {
            this.method2491(null, 84);
        }
        return this.method2520(false) ? this.field6095.field7508.length : -1;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method2494(String arg0, int arg1) {
        if (arg1 != 19857) {
            this.method2498(-123, -2, -56);
        }
        field6117++;
        if (this.method2520(false)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6095.field7510.method1800(18257, class504.method2992(var3, true));
            return this.method2505(-27504, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
    public final void method2495(int arg0, int arg1) {
        field6098++;
        if (this.method2507(arg0, 59)) {
            if (this.field6091 != null) {
                this.field6091[arg0] = null;
            }
            int var3 = 43 / ((arg1 - 7) / 57);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[B")
    public final byte[] method2496(int arg0, int arg1) {
        field6104++;
        if (!this.method2520(false)) {
            return null;
        } else if (this.field6095.field7508.length == 1) {
            return this.method2512(0, (byte) -93, arg0);
        } else if (!this.method2507(arg0, -93)) {
            return null;
        } else if (this.field6095.field7508[arg0] == 1) {
            return this.method2512(arg0, (byte) -93, 0);
        } else {
            int var3 = -77 % ((arg1 + 62) / 47);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z")
    public final boolean method2497(int arg0) {
        field6102++;
        if (!this.method2520(false)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field6095.field7509.length; var3++) {
            int var4 = this.field6095.field7509[var3];
            if (this.field6107[var4] == null) {
                this.method2504(var4, false);
                if (this.field6107[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
    public final boolean method2498(int arg0, int arg1, int arg2) {
        field6106++;
        if (!this.method2519((byte) 105, arg2, arg1)) {
            return false;
        }
        if (arg0 > -102) {
            this.method2505(74, 33);
        }
        if (this.field6091[arg1] != null && this.field6091[arg1][arg2] != null) {
            return true;
        } else if (this.field6107[arg1] == null) {
            this.method2504(arg1, false);
            return this.field6107[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(II)[I")
    public final int[] method2499(int arg0, int arg1) {
        field6105++;
        if (!this.method2507(arg1, 109)) {
            return null;
        } else if (arg0 == 0) {
            int[] var3 = this.field6095.field7515[arg1];
            if (var3 == null) {
                var3 = new int[this.field6095.field7507[arg1]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([IIII)Z")
    private final boolean method2500(int[] arg0, int arg1, int arg2, int arg3) {
        field6108++;
        if (!this.method2507(arg1, -123)) {
            return false;
        } else if (this.field6107[arg1] == null) {
            return false;
        } else {
            int var5 = this.field6095.field7507[arg1];
            int[] var6 = this.field6095.field7515[arg1];
            if (this.field6091[arg1] == null) {
                this.field6091[arg1] = new Object[this.field6095.field7508[arg1]];
            }
            Object[] var7 = this.field6091[arg1];
            boolean var8 = true;
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
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var11 = class234.method1428(this.field6107[arg1], false, true);
                class319 var12 = new class319(var11);
                var12.method1867(5, arg0, -257354528, var12.field4336.length);
            } else {
                var11 = class234.method1428(this.field6107[arg1], false, false);
            }
            byte[] var14;
            try {
                int var13 = 6 / ((31 - arg3) / 58);
                var14 = class486.method2875(var11, (byte) 26);
            } catch (RuntimeException var50) {
                throw class16.method109(var50, "T3 - " + (arg0 != null) + "," + arg1 + "," + var11.length + "," + class163.method1143(var11, var11.length, 0) + "," + class163.method1143(var11, var11.length - 2, 0) + "," + this.field6095.field7517[arg1] + "," + this.field6095.field7521);
            }
            if (this.field6115) {
                this.field6107[arg1] = null;
            }
            if (var5 <= 1) {
                int var49;
                if (var6 == null) {
                    var49 = 0;
                } else {
                    var49 = var6[0];
                }
                if (this.field6093 == 0) {
                    var7[var49] = class394.method2336(false, var14, false);
                } else {
                    var7[var49] = var14;
                }
            } else if (this.field6093 == 2) {
                int var16 = var14.length;
                int var51 = var16 - 1;
                int var17 = var14[var51] & 0xFF;
                int var18 = var51 - var5 * var17 * 4;
                class319 var19 = new class319(var14);
                int var20 = 0;
                var19.field4360 = var18;
                int var21 = 0;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method1863(-1);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg2 == var25) {
                            var21 = var25;
                            var20 += var23;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                int var27 = 0;
                var19.field4360 = var18;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method1863(-1);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg2 == var32) {
                            class57.method372(var14, var28, var26, var27, var30);
                            var27 += var30;
                        }
                        var28 += var30;
                    }
                }
                var7[var21] = var26;
            } else {
                int var33 = var14.length;
                int var52 = var33 - 1;
                int var34 = var14[var52] & 0xFF;
                int var35 = var52 - var5 * var34 * 4;
                class319 var36 = new class319(var14);
                int[] var37 = new int[var5];
                var36.field4360 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method1863(-1);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field4360 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method1863(-1);
                        class57.method372(var14, var43, var41[var46], var37[var46], var45);
                        var37[var46] += var45;
                        var43 += var45;
                    }
                }
                for (int var47 = 0; var47 < var5; var47++) {
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (this.field6093 == 0) {
                        var7[var48] = class394.method2336(false, var41[var47], false);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    public static void method2501(int arg0) {
        if (arg0 == 0) {
            field6097 = null;
            field6120 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lsv;II)Ljava/lang/String;")
    public static final String method2502(class319 arg0, int arg1, int arg2) {
        field6085++;
        try {
            int var3 = arg0.method1877(122);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg0.field4360 += class316.field4305.method2869(arg0.field4336, var3, 0, arg0.field4360, 1, var4);
            int var5 = -122 % ((arg1 - 48) / 37);
            return class313.method1804(var3, 0, true, var4);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V")
    public final void method2503(int arg0) {
        if (arg0 != -3) {
            return;
        }
        field6118++;
        if (this.field6091 != null) {
            for (int var2 = 0; var2 < this.field6091.length; var2++) {
                this.field6091[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V")
    private final void method2504(int arg0, boolean arg1) {
        field6125++;
        if (arg1) {
            return;
        }
        if (this.field6115) {
            this.field6107[arg0] = this.field6103.method22(arg0, (byte) -91);
        } else {
            this.field6107[arg0] = class394.method2336(false, this.field6103.method22(arg0, (byte) 9), false);
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(II)I")
    private final int method2505(int arg0, int arg1) {
        field6121++;
        if (arg0 != -27504) {
            return 107;
        } else if (this.method2507(arg1, -107)) {
            return this.field6107[arg1] == null ? this.field6103.method24(48, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)V")
    public static final void method2506(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -7 % ((arg2 - 68) / 56);
        field6124++;
        class314 var5 = class177.method1213(false, 11, arg3);
        var5.method1808(-7412);
        var5.field4259 = arg1;
        var5.field4253 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(II)Z")
    private final boolean method2507(int arg0, int arg1) {
        field6122++;
        if (!this.method2520(false)) {
            return false;
        }
        int var3 = 78 % ((-arg1 - 21) / 36);
        if (arg0 >= 0 && this.field6095.field7508.length > arg0 && this.field6095.field7508[arg0] != 0) {
            return true;
        } else if (class497.field7270) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)I")
    public final int method2508(int arg0) {
        if (arg0 != 4) {
            this.field6095 = null;
        }
        field6087++;
        if (!this.method2520(false)) {
            throw new IllegalStateException("");
        }
        return this.field6095.field7521;
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(II)I")
    public final int method2509(int arg0, int arg1) {
        field6090++;
        if (this.method2507(arg1, arg0 ^ 0xFFFFFFB5)) {
            return arg0 == 0 ? this.field6095.field7508[arg1] : 46;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2510(String arg0, int arg1) {
        if (arg1 != 11) {
            field6110 = true;
        }
        field6101++;
        if (this.method2520(false)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6095.field7510.method1800(18257, class504.method2992(var3, true));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BZZ)V")
    public final void method2511(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 != 120) {
            field6110 = true;
        }
        field6094++;
        if (!this.method2520(false)) {
            return;
        }
        if (arg2) {
            this.field6095.field7520 = null;
            this.field6095.field7510 = null;
        }
        if (arg1) {
            this.field6095.field7519 = null;
            this.field6095.field7514 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBI)[B")
    public final byte[] method2512(int arg0, byte arg1, int arg2) {
        if (arg1 != -93) {
            method2501(114);
        }
        field6114++;
        return this.method2492(arg2, arg0, null, true);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)I")
    public final int method2513(byte arg0) {
        if (arg0 >= -30) {
            field6120 = null;
        }
        field6113++;
        if (!this.method2520(false)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6107.length; var4++) {
            if (this.field6095.field7507[var4] > 0) {
                var3 += this.method2505(-27504, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method2514(String arg0, int arg1, String arg2) {
        field6088++;
        if (!this.method2520(false)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        if (arg1 <= 111) {
            method2506(94, 121, -128, -125);
        }
        String var5 = arg2.toLowerCase();
        int var6 = this.field6095.field7510.method1800(18257, class504.method2992(var4, true));
        if (this.method2507(var6, 93)) {
            int var7 = this.field6095.field7519[var6].method1800(18257, class504.method2992(var5, true));
            return this.method2498(-104, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)I")
    public final int method2515(byte arg0, int arg1) {
        field6112++;
        if (arg0 != 119) {
            this.method2498(7, -100, -7);
        }
        if (this.method2520(false)) {
            int var3 = this.field6095.field7510.method1800(18257, arg1);
            return this.method2507(var3, 89) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(Ljava/lang/String;I)V")
    public final void method2516(String arg0, int arg1) {
        field6109++;
        if (!this.method2520(false)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 5464) {
            field6120 = null;
        }
        int var4 = this.field6095.field7510.method1800(18257, class504.method2992(var3, true));
        this.method2518(12289, var4);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IB)Z")
    public final boolean method2517(int arg0, byte arg1) {
        field6086++;
        if (!this.method2520(false)) {
            return false;
        } else if (this.field6095.field7508.length == 1) {
            return this.method2498(-109, 0, arg0);
        } else {
            if (arg1 >= -14) {
                this.method2504(-45, true);
            }
            if (!this.method2507(arg0, 44)) {
                return false;
            } else if (this.field6095.field7508[arg0] == 1) {
                return this.method2498(-117, arg0, 0);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(II)V")
    private final void method2518(int arg0, int arg1) {
        if (arg0 != 12289) {
            this.field6093 = -123;
        }
        field6096++;
        this.field6103.method19(arg1, (byte) 97);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BII)Z")
    private final boolean method2519(byte arg0, int arg1, int arg2) {
        field6111++;
        if (!this.method2520(false)) {
            return false;
        } else if (arg0 != 105) {
            return true;
        } else if (arg2 >= 0 && arg1 >= 0 && arg2 < this.field6095.field7508.length && this.field6095.field7508[arg2] > arg1) {
            return true;
        } else if (class497.field7270) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lar;ZI)V")
    public class421(class3 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6115 = arg1;
        this.field6093 = arg2;
        this.field6103 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)Z")
    private final boolean method2520(boolean arg0) {
        field6099++;
        if (arg0) {
            field6120 = null;
        }
        if (this.field6095 == null) {
            this.field6095 = this.field6103.method20((byte) 66);
            if (this.field6095 == null) {
                return false;
            }
            this.field6091 = new Object[this.field6095.field7512][];
            this.field6107 = new Object[this.field6095.field7512];
        }
        return true;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V")
    public final void method2521(byte arg0) {
        field6128++;
        if (arg0 < -62 && this.field6107 != null) {
            for (int var2 = 0; var2 < this.field6107.length; var2++) {
                this.field6107[var2] = null;
            }
        }
    }
}
