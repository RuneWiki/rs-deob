import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class174 {

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "Ll;")
    private class260 field2578 = null;

    @OriginalMember(owner = "client!dp", name = "D", descriptor = "Lia;")
    private class362 field2592;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "Z")
    private boolean field2583;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field2567 = 0;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
    public static int field2587 = 0;

    @OriginalMember(owner = "client!dp", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field2594 = null;

    @OriginalMember(owner = "client!dp", name = "C", descriptor = "I")
    public static int field2591 = 0;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!dp", name = "A", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!dp", name = "B", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!dp", name = "E", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!dp", name = "G", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!dp", name = "H", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!dp", name = "J", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!dp", name = "K", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!dp", name = "L", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!dp", name = "M", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!dp", name = "N", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!dp", name = "O", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!dp", name = "P", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!dp", name = "Q", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!dp", name = "R", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!dp", name = "I", descriptor = "[Ljava/lang/Object;")
    private Object[] field2597;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2569;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)I")
    public final int method1325(int arg0) {
        field2573++;
        if (this.method1350(2)) {
            return arg0 > -52 ? 122 : this.field2578.field3922.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)V")
    private final void method1326(int arg0, byte arg1) {
        if (arg1 != -17) {
            this.method1356((String) null, (byte) -86);
        }
        this.field2592.method2319(arg0, (byte) -78);
        field2606++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)I")
    public final int method1327(byte arg0) {
        field2586++;
        if (!this.method1350(2)) {
            throw new IllegalStateException("");
        }
        if (arg0 >= -93) {
            this.field2592 = null;
        }
        return this.field2578.field3918;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
    public final byte[] method1328(String arg0, byte arg1, String arg2) {
        field2570++;
        if (!this.method1350(2)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field2578.field3929.method1158(-1, class418.method2624(var4, true));
        if (arg1 >= -58) {
            return null;
        } else if (this.method1344(var6, 37)) {
            int var7 = this.field2578.field3923[var6].method1158(-1, class418.method2624(var5, true));
            return this.method1355(var7, -12607, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1329(String arg0, int arg1) {
        field2590++;
        if (!this.method1350(2)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 == 0) {
            int var4 = this.field2578.field3929.method1158(~arg1, class418.method2624(var3, true));
            return this.method1357(var4, (byte) 17);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)I")
    private final int method1330(int arg0, int arg1) {
        field2565++;
        if (!this.method1344(arg0, arg1 - 126)) {
            return 0;
        } else if (this.field2597[arg0] == null) {
            if (arg1 != -1) {
                this.field2564 = -54;
            }
            return this.field2592.method2317(arg0, 528);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method1331(boolean arg0, String arg1) {
        field2572++;
        if (this.method1350(2)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2578.field3929.method1158(-1, class418.method2624(var3, arg0));
            this.method1326(var4, (byte) -17);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZI)I")
    public static final int method1332(int arg0, boolean arg1, int arg2) {
        field2584++;
        if (arg1) {
            return 41;
        } else if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)I")
    public final int method1333(int arg0, int arg1) {
        field2574++;
        if (this.method1344(arg1, 22)) {
            if (arg0 != 0) {
                this.method1343(-91);
            }
            return this.field2578.field3922[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lja;BLdp;)V")
    public static final void method1334(class90 arg0, byte arg1, class174 arg2) {
        if (arg1 != -12) {
            return;
        }
        field2593++;
        class344[] var3 = class344.method2211(arg2, class451.field6552, 0);
        class333.field4784 = new class421[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class333.field4784[var4] = arg0.method734(var3[var4], true);
        }
        class344[] var5 = class344.method2211(arg2, class268.field4012, 0);
        class140.field2223 = new class421[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class140.field2223[var6] = arg0.method734(var5[var6], true);
        }
        class344[] var7 = class344.method2211(arg2, class362.field5161, 0);
        class52.field856 = new class421[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class52.field856[var8] = arg0.method734(var7[var8], true);
        }
        class344[] var9 = class344.method2211(arg2, class206.field3014, 0);
        class210.field3088 = new class421[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class210.field3088[var10] = arg0.method734(var9[var10], true);
        }
        class344[] var11 = class344.method2211(arg2, class27.field405, 0);
        class186.field2739 = new class421[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class186.field2739[var12] = arg0.method734(var11[var12], true);
        }
        class344[] var13 = class344.method2211(arg2, class452.field6583, 0);
        class277.field4169 = new class421[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class277.field4169[var14] = arg0.method734(var13[var14], true);
        }
        class344[] var15 = class344.method2211(arg2, class58.field934, 0);
        class139.field2210 = new class421[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class139.field2210[var16] = arg0.method734(var15[var16], true);
        }
        class344[] var17 = class344.method2211(arg2, class107.field1764, 0);
        class179.field2669 = new class421[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class179.field2669[var18] = arg0.method734(var17[var18], true);
        }
        class344[] var19 = class344.method2211(arg2, class73.field1218, 0);
        class387.field5545 = new class421[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class387.field5545[var20] = arg0.method734(var19[var20], true);
        }
        class344[] var21 = class344.method2211(arg2, class109.field1785, 0);
        class200.field2924 = new class421[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class200.field2924[var22] = arg0.method734(var21[var22], true);
        }
        class344[] var23 = class344.method2211(arg2, class26.field392, 0);
        class121.field1899 = new class421[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class121.field1899[var24] = arg0.method734(var23[var24], true);
        }
        class344[] var25 = class344.method2211(arg2, class136.field2174, 0);
        class171.field2548 = new class421[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class171.field2548[var26] = arg0.method734(var25[var26], true);
        }
        class344[] var27 = class344.method2211(arg2, class252.field3633, 0);
        class6.field56 = new class421[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class6.field56[var28] = arg0.method734(var27[var28], true);
        }
        class443.field6423 = arg0.method734(class344.method2217(arg2, class157.field2382, 0), true);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II[IB)Z")
    private final boolean method1335(int arg0, int arg1, int[] arg2, byte arg3) {
        field2576++;
        if (!this.method1344(arg0, 78)) {
            return false;
        } else if (this.field2597[arg0] == null) {
            return false;
        } else {
            int var5 = this.field2578.field3928[arg0];
            int[] var6 = this.field2578.field3931[arg0];
            if (arg3 != -112) {
                this.method1351(59, 67);
            }
            if (this.field2569[arg0] == null) {
                this.field2569[arg0] = new Object[this.field2578.field3922[arg0]];
            }
            Object[] var7 = this.field2569[arg0];
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
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var11 = class6.method36(true, this.field2597[arg0], -119);
                class37 var12 = new class37(var11);
                var12.method314(5, var12.field578.length, (byte) -32, arg2);
            } else {
                var11 = class6.method36(false, this.field2597[arg0], 124);
            }
            byte[] var13;
            try {
                var13 = class315.method2127(25055, var11);
            } catch (RuntimeException var49) {
                throw class362.method2321(var49, "T3 - " + (arg2 != null) + "," + arg0 + "," + var11.length + "," + class15.method92((byte) 85, var11.length, var11) + "," + class15.method92((byte) 85, var11.length - 2, var11) + "," + this.field2578.field3925[arg0] + "," + this.field2578.field3918);
            }
            if (this.field2583) {
                this.field2597[arg0] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field2564 == 0) {
                    var7[var48] = class264.method1885(true, false, var13);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field2564 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * var32 * 4;
                class37 var34 = new class37(var13);
                int var35 = 0;
                int var36 = 0;
                var34.field565 = var33;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method278(arg3 + 131);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg1 == var40) {
                            var36 = var40;
                            var35 += var38;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                int var42 = 0;
                var34.field565 = var33;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method278(-124);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg1 == var47) {
                            class82.method637(var13, var43, var41, var42, var45);
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
                class37 var18 = new class37(var13);
                var18.field565 = var17;
                int[] var19 = new int[var5];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method278(-18);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field565 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method278(arg3 ^ 0xFFFFFFA7);
                        class82.method637(var13, var25, var23[var28], var19[var28], var27);
                        var19[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field2564 == 0) {
                        var7[var30] = class264.method1885(true, false, var23[var29]);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(II)[B")
    public final byte[] method1336(int arg0, int arg1) {
        field2577++;
        if (!this.method1350(2)) {
            return null;
        }
        if (arg0 >= -82) {
            this.method1331(true, (String) null);
        }
        if (this.field2578.field3922.length == 1) {
            return this.method1355(arg1, -12607, 0);
        } else if (!this.method1344(arg1, -128)) {
            return null;
        } else if (this.field2578.field3922[arg1] == 1) {
            return this.method1355(0, -12607, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z")
    public final boolean method1337(String arg0, String arg1, boolean arg2) {
        field2582++;
        if (!this.method1350(2)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        if (arg2) {
            this.field2569 = null;
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field2578.field3929.method1158(-1, class418.method2624(var4, true));
        if (this.method1344(var6, -126)) {
            int var7 = this.field2578.field3923[var6].method1158(-1, class418.method2624(var5, true));
            return this.method1358(var6, -114, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method1338(int arg0, String arg1) {
        field2589++;
        if (!this.method1350(2)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != -4342) {
            this.field2569 = null;
        }
        int var4 = this.field2578.field3929.method1158(arg0 ^ 0x10F5, class418.method2624(var3, true));
        return this.method1330(var4, -1);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public final void method1339(int arg0) {
        field2595++;
        if (arg0 != 0) {
            this.field2592 = null;
        }
        if (this.field2597 != null) {
            for (int var2 = 0; var2 < this.field2597.length; var2++) {
                this.field2597[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZIZ)V")
    public final void method1340(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != -1) {
            this.field2597 = null;
        }
        field2579++;
        if (!this.method1350(2)) {
            return;
        }
        if (arg0) {
            this.field2578.field3921 = null;
            this.field2578.field3929 = null;
        }
        if (arg2) {
            this.field2578.field3924 = null;
            this.field2578.field3923 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(II)V")
    public final void method1341(int arg0, int arg1) {
        field2588++;
        if (arg1 != 0) {
            method1334((class90) null, (byte) 37, (class174) null);
        }
        if (this.method1344(arg0, 4) && this.field2569 != null) {
            this.field2569[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III[I)[B")
    public final byte[] method1342(int arg0, int arg1, int arg2, int[] arg3) {
        field2566++;
        if (!this.method1354(0, arg0, arg2)) {
            return null;
        }
        if (this.field2569[arg2] == null || this.field2569[arg2][arg0] == null) {
            boolean var5 = this.method1335(arg2, arg0, arg3, (byte) -112);
            if (!var5) {
                this.method1346(arg2, (byte) -89);
                boolean var6 = this.method1335(arg2, arg0, arg3, (byte) -112);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class6.method36(false, this.field2569[arg2][arg0], -40);
        if (arg1 > -96) {
            field2567 = 44;
        }
        if (this.field2564 == 1) {
            this.field2569[arg2][arg0] = null;
            if (this.field2578.field3922[arg2] == 1) {
                this.field2569[arg2] = null;
            }
        } else if (this.field2564 == 2) {
            this.field2569[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V")
    public final void method1343(int arg0) {
        if (arg0 > -66) {
            return;
        }
        field2568++;
        if (this.field2569 != null) {
            for (int var2 = 0; var2 < this.field2569.length; var2++) {
                this.field2569[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "(II)Z")
    private final boolean method1344(int arg0, int arg1) {
        field2605++;
        int var3 = -121 % ((-arg1 - 58) / 62);
        if (!this.method1350(2)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field2578.field3922.length && this.field2578.field3922[arg0] != 0) {
            return true;
        } else if (class129.field2108) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)Z")
    public final boolean method1345(byte arg0) {
        field2596++;
        if (!this.method1350(2)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 <= 16) {
            this.method1343(-84);
        }
        for (int var3 = 0; var3 < this.field2578.field3926.length; var3++) {
            int var4 = this.field2578.field3926[var3];
            if (this.field2597[var4] == null) {
                this.method1346(var4, (byte) -89);
                if (this.field2597[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(IB)V")
    private final void method1346(int arg0, byte arg1) {
        if (this.field2583) {
            this.field2597[arg0] = this.field2592.method2322(arg0, -1400);
        } else {
            this.field2597[arg0] = class264.method1885(true, false, this.field2592.method2322(arg0, -1400));
        }
        field2581++;
        if (arg1 != -89) {
            field2594 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)I")
    public final int method1347(byte arg0) {
        field2563++;
        if (!this.method1350(2)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -50) {
            this.field2569 = null;
        }
        for (int var4 = 0; var4 < this.field2597.length; var4++) {
            if (this.field2578.field3928[var4] > 0) {
                var3 += this.method1330(var4, -1);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "(II)Z")
    public final boolean method1348(int arg0, int arg1) {
        field2585++;
        if (!this.method1350(2)) {
            return false;
        } else if (this.field2578.field3922.length == 1) {
            return this.method1358(0, -114, arg1);
        } else if (!this.method1344(arg1, 123)) {
            return false;
        } else if (this.field2578.field3922[arg1] == 1) {
            return this.method1358(arg1, -29, 0);
        } else {
            if (arg0 != 255) {
                this.method1342(106, 74, -76, (int[]) null);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(IB)[I")
    public final int[] method1349(int arg0, byte arg1) {
        field2599++;
        if (!this.method1344(arg0, -121)) {
            return null;
        }
        int[] var3 = this.field2578.field3931[arg0];
        if (var3 == null) {
            var3 = new int[this.field2578.field3928[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        if (arg1 < 67) {
            this.method1357(70, (byte) -113);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)Z")
    private final boolean method1350(int arg0) {
        field2602++;
        if (arg0 != 2) {
            return true;
        }
        if (this.field2578 == null) {
            this.field2578 = this.field2592.method2320(8658);
            if (this.field2578 == null) {
                return false;
            }
            this.field2597 = new Object[this.field2578.field3915];
            this.field2569 = new Object[this.field2578.field3915][];
        }
        return true;
    }

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "(II)I")
    public final int method1351(int arg0, int arg1) {
        field2601++;
        if (this.method1350(2)) {
            int var3 = this.field2578.field3929.method1158(arg1, arg0);
            return this.method1344(var3, -126) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(B)V")
    public static final void method1352(byte arg0) {
        if (class124.field2028 != null) {
            class124.field2028.method1654(-21013);
            class124.field2028 = null;
        }
        field2571++;
        class403.method2556(0);
        class73.method580();
        for (int var1 = 0; var1 < 4; var1++) {
            class322.field4646[var1].method1249(67);
        }
        class51.method404(false, 64);
        System.gc();
        class294.method2058(2, true);
        class387.field5546 = false;
        class86.field1402 = -1;
        class267.method1907(true, (byte) 0);
        class322.field4650 = false;
        class294.field4362 = 0;
        class231.field3378 = 0;
        class135.field2160 = 0;
        class379.field5384 = 0;
        for (int var2 = 0; var2 < class431.field6220.length; var2++) {
            class431.field6220[var2] = null;
        }
        class156.field2376 = 0;
        class21.field317 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class367.field5225[var3] = null;
            class329.field4742[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class447.field6512[var4] = null;
        }
        int var5 = 120 / ((49 - arg0) / 43);
        class186.field2728.method1228(-30653);
        class416.method2604((byte) -125);
        class51.field826 = 0;
        class73.method582(false);
        class210.method1579((byte) 77);
        class333.method2177((byte) 76);
        class183.method1420(true, -1);
        try {
            class412.method2587(class188.field2783.field2639, -74, "loggedout");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "(I)V")
    public static void method1353(int arg0) {
        if (arg0 >= 32) {
            field2594 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Z")
    private final boolean method1354(int arg0, int arg1, int arg2) {
        field2600++;
        if (!this.method1350(2)) {
            return false;
        } else if (arg2 >= arg0 && arg1 >= 0 && this.field2578.field3922.length > arg2 && arg1 < this.field2578.field3922[arg2]) {
            return true;
        } else if (class129.field2108) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(III)[B")
    public final byte[] method1355(int arg0, int arg1, int arg2) {
        field2604++;
        if (arg1 != -12607) {
            field2567 = 85;
        }
        return this.method1342(arg0, arg1 + 12497, arg2, (int[]) null);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1356(String arg0, byte arg1) {
        field2580++;
        if (!this.method1350(2)) {
            return false;
        }
        if (arg1 < 58) {
            this.field2569 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field2578.field3929.method1158(-1, class418.method2624(var3, true));
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(IB)Z")
    public final boolean method1357(int arg0, byte arg1) {
        if (arg1 != 17) {
            return false;
        }
        field2603++;
        if (!this.method1344(arg0, -128)) {
            return false;
        } else if (this.field2597[arg0] == null) {
            this.method1346(arg0, (byte) -89);
            return this.field2597[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lia;ZI)V")
    public class174(class362 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field2592 = arg0;
        this.field2564 = arg2;
        this.field2583 = arg1;
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(III)Z")
    public final boolean method1358(int arg0, int arg1, int arg2) {
        field2598++;
        if (!this.method1354(0, arg2, arg0)) {
            return false;
        } else if (this.field2569[arg0] != null && this.field2569[arg0][arg2] != null) {
            return true;
        } else if (this.field2597[arg0] == null) {
            int var4 = 85 % ((arg1 + 74) / 38);
            this.method1346(arg0, (byte) -89);
            return this.field2597[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method1359(int arg0, String arg1) {
        field2575++;
        if (!this.method1350(2)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2578.field3929.method1158(-1, class418.method2624(var3, true));
        if (arg0 < 49) {
            return -55;
        } else if (this.method1344(var4, -121)) {
            return var4;
        } else {
            return -1;
        }
    }
}
