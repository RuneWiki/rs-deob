import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 extends class135 {

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "Z")
    public boolean field475 = false;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "Lcc;")
    private class209 field457;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "Z")
    private boolean field470;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "Z")
    private boolean field466;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "Ljava/lang/String;")
    public static String field469 = "glow3:";

    @OriginalMember(owner = "client!f", name = "P", descriptor = "F")
    private float field474;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "Ljava/lang/String;")
    public static String field465;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "[I")
    private int[] field464;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public static final void method278(int arg0) {
        field476++;
        if (class176.field2755 == null) {
            return;
        }
        int var1 = -90 / ((arg0 + 44) / 53);
        if (class30.field401 < 10) {
            if (!class84.field1312.method814(class176.field2755.field2513, true)) {
                class30.field401 = class252.field4030.method816(class176.field2755.field2513, (byte) 80) / 10;
                return;
            }
            class176.method1230(false);
            class30.field401 = 10;
        }
        if (class30.field401 == 10) {
            if (class176.field2755.field2515 == 37) {
                class7.field106 = 3.0F;
                class60.field842 = 3.0F;
            } else if (class176.field2755.field2515 == 50) {
                class7.field106 = 4.0F;
                class60.field842 = 4.0F;
            } else if (class176.field2755.field2515 == 75) {
                class7.field106 = 6.0F;
                class60.field842 = 6.0F;
            } else if (class176.field2755.field2515 == 100) {
                class7.field106 = 8.0F;
                class60.field842 = 8.0F;
            } else if (class176.field2755.field2515 == 200) {
                class7.field106 = 16.0F;
                class60.field842 = 16.0F;
            } else {
                class7.field106 = 8.0F;
                class60.field842 = 8.0F;
            }
            class120.field1751 = class176.field2755.field2529 >> 6 << 6;
            class47.field599 = class176.field2755.field2531 >> 6 << 6;
            class165.field2565 = (class176.field2755.field2512 >> 6 << 6) + 64 - class47.field599;
            int var2 = (class149.field2227.field1226 >> 7) + class126.field1869 - class47.field599;
            class104.field1611 = (class176.field2755.field2524 >> 6 << 6) + 64 - class120.field1751;
            int var3 = var2 + (int) (Math.random() * 10.0D) - 5;
            int var4 = class104.field1611 - (1 - class120.field1751) - ((class149.field2227.field1273 >> 7) + class246.field3943);
            int var5 = var4 + (int) (Math.random() * 10.0D) - 5;
            if (var3 >= 0 && var3 < class165.field2565 && var5 >= 0 && class104.field1611 > var5) {
                class158.field2435 = var5;
                class219.field3563 = var3;
            } else {
                class219.field3563 = class176.field2755.field2526 * 64 - class47.field599;
                class158.field2435 = class120.field1751 - (class176.field2755.field2525 * 64 - (class104.field1611 - 1));
            }
            class17.method117(13);
            int var6 = class170.field2664 >> 1;
            int var7 = class286.field4535 >> 2 << 10;
            class1.field13 = new int[class204.field3191 + 1];
            int var8 = class165.field2565 >> 6;
            int var9 = class104.field1611 >> 6;
            class173.field2711 = new byte[var8][var9][];
            class177.field2759 = new int[var8][var9][];
            class39.field537 = new int[var8][var9][];
            class126.field1868 = new byte[var8][var9][];
            class232.field3735 = new byte[var8][var9][];
            class181.field2833 = new int[var8][var9][];
            class92.field1435 = new byte[var8][var9][];
            class178.field2787 = new byte[var8][var9][];
            class125.method850(var7, -94, var6);
            class30.field401 = 20;
        } else if (class30.field401 == 20) {
            class86.method594(new class25(class84.field1312.method819("underlay", class176.field2755.field2513, -198)), (byte) 95);
            class30.field401 = 30;
            class224.method1524(true, 109);
            class236.method1601(true);
        } else if (class30.field401 == 30) {
            class178.method1240(67, new class25(class84.field1312.method819("overlay", class176.field2755.field2513, -198)));
            class30.field401 = 40;
            class236.method1601(true);
        } else if (class30.field401 == 40) {
            class38.method306(false, new class25(class84.field1312.method819("overlay2", class176.field2755.field2513, -198)));
            class30.field401 = 50;
            class236.method1601(true);
        } else if (class30.field401 == 50) {
            class82.method575(new class25(class84.field1312.method819("loc", class176.field2755.field2513, -198)), 114);
            class30.field401 = 60;
            class224.method1524(true, 104);
            class236.method1601(true);
        } else if (class30.field401 == 60) {
            if (class84.field1312.method821(112, class176.field2755.field2513 + "_labels")) {
                if (!class84.field1312.method814(class176.field2755.field2513 + "_labels", true)) {
                    return;
                }
                class107.field1644 = class182.method1273(class84.field1312, (byte) 122, class176.field2755.field2513 + "_labels");
            } else {
                class107.field1644 = new class78(0);
            }
            class30.field401 = 70;
            class236.method1601(true);
        } else if (class30.field401 == 70) {
            class285.field4519 = new class180(11, true, class86.field1364);
            class30.field401 = 73;
            class224.method1524(true, 127);
            class236.method1601(true);
        } else if (class30.field401 == 73) {
            class184.field2891 = new class180(12, true, class86.field1364);
            class30.field401 = 76;
            class224.method1524(true, 105);
            class236.method1601(true);
        } else if (class30.field401 == 76) {
            class192.field3039 = new class180(14, true, class86.field1364);
            class30.field401 = 79;
            class224.method1524(true, 122);
            class236.method1601(true);
        } else if (class30.field401 == 79) {
            class94.field1461 = new class180(17, true, class86.field1364);
            class30.field401 = 82;
            class224.method1524(true, 104);
            class236.method1601(true);
        } else if (class30.field401 == 82) {
            class37.field503 = new class180(19, true, class86.field1364);
            class30.field401 = 85;
            class224.method1524(true, 120);
            class236.method1601(true);
        } else if (class30.field401 == 85) {
            class253.field4043 = new class180(22, true, class86.field1364);
            class30.field401 = 88;
            class224.method1524(true, 107);
            class236.method1601(true);
        } else if (class30.field401 == 88) {
            class123.field1811 = new class180(26, true, class86.field1364);
            class30.field401 = 91;
            class224.method1524(true, 124);
            class236.method1601(true);
        } else {
            class35.field451 = new class180(30, true, class86.field1364);
            class30.field401 = 100;
            class224.method1524(true, 110);
            class236.method1601(true);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)V")
    public final void method279(byte arg0, int arg1) {
        field479++;
        if (this.field464 == null) {
            return;
        }
        if (this.field473 != 0 || this.field460 != 0) {
            if (class2.field24 == null || this.field464.length > class2.field24.length) {
                class2.field24 = new int[this.field464.length];
            }
            int var3 = this.field464.length;
            int var4 = this.field460 * arg1;
            int var5 = this.field464.length == 4096 ? 64 : 128;
            int var6 = var5 - 1;
            int var7 = var3 - 1;
            int var8 = arg1 * var5 * this.field473;
            for (int var9 = 0; var9 < var3; var9 += var5) {
                int var11 = var7 & var8 + var9;
                for (int var12 = 0; var12 < var5; var12++) {
                    int var13 = (var6 & var4 + var12) + var11;
                    int var14 = var9 + var12;
                    class2.field24[var14] = this.field464[var13];
                }
            }
            int[] var10 = this.field464;
            this.field464 = class2.field24;
            class2.field24 = var10;
        }
        if (arg0 >= -21) {
            method278(58);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
    public static final void method280(int arg0, int arg1) {
        field467++;
        class33 var2 = (class33) class82.field1233.method665((byte) -109, (long) arg0);
        if (var2 != null && arg1 == 64) {
            for (int var3 = 0; var3 < var2.field426.length; var3++) {
                var2.field426[var3] = -1;
                var2.field428[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILdl;Ldl;)I")
    public static final int method281(int arg0, class123 arg1, class123 arg2) {
        if (arg0 != 10) {
            field471 = -119;
        }
        field459++;
        int var3 = 0;
        if (arg1.method806(34, class102.field1589)) {
            var3++;
        }
        if (arg1.method806(42, class146.field2156)) {
            var3++;
        }
        if (arg1.method806(51, class232.field3727)) {
            var3++;
        }
        if (arg2.method806(arg0 ^ 0x68, class102.field1589)) {
            var3++;
        }
        if (arg2.method806(86, class146.field2156)) {
            var3++;
        }
        if (arg2.method806(126, class232.field3727)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIII)V")
    public static final void method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field462++;
        if (arg3 != 64) {
            method278(-105);
        }
        if (arg1 == arg4) {
            class86.method595(arg0, arg4, arg2, arg5, 61);
        } else if (arg2 - arg4 >= class51.field710 && arg2 + arg4 <= class96.field1484 && class110.field1669 <= arg5 - arg1 && (arg1 + arg5) <= class189.field2984) {
            class41.method321(arg2, arg0, arg1, arg4, arg5, 120);
        } else {
            class211.method1421(arg0, arg5, false, arg4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lie;ZBLdl;)[I")
    public final int[] method283(class32 arg0, boolean arg1, byte arg2, class123 arg3) {
        field461++;
        if (!this.field457.method1412(arg3, -1, arg0)) {
            return null;
        }
        if (arg2 != 78) {
            field471 = 109;
        }
        int var5 = arg1 ? 64 : 128;
        return this.field457.method1414(this.field466, arg0, var5, 1.0D, 0, false, var5, arg3);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIBII)V")
    public static final void method284(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        class98.field1527 = arg4;
        class3.field30 = arg1;
        class115.field1708 = arg5;
        field468++;
        class17.field200 = arg2;
        class178.field2784 = arg0;
        int var6 = 36 / ((36 - arg3) / 53);
        if (class98.field1527 >= 100) {
            int var7 = class115.field1708 * 128 + 64;
            int var8 = class178.field2784 * 128 + 64;
            int var9 = class99.method658(var8, class276.field4398, var7, -7185) - class3.field30;
            int var10 = var7 - class66.field918;
            int var11 = var8 - class54.field750;
            int var12 = var9 - class96.field1487;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class215.field3516 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
            class77.field1092 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class215.field3516 < 128) {
                class215.field3516 = 128;
            }
            if (class215.field3516 > 383) {
                class215.field3516 = 383;
            }
        }
        class278.field4414 = 2;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method285(boolean arg0, String arg1, boolean arg2) {
        String var3 = arg1.toLowerCase();
        if (!arg2) {
            field469 = null;
        }
        field478++;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class98.field1529; var6++) {
            class253 var9 = class162.method1112(var6, (byte) 108);
            if ((!arg0 || var9.field4087) && var9.field4032 == -1 && var9.field4050 == -1 && var9.field4070 == 0 && var9.field4035.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class93.field1448 = -1;
                    class86.field1363 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class149.field2226 = 0;
        class93.field1448 = var5;
        class86.field1363 = var4;
        String[] var7 = new String[class93.field1448];
        for (int var8 = 0; var8 < class93.field1448; var8++) {
            var7[var8] = class162.method1112(var4[var8], (byte) 116).field4035;
        }
        class161.method1104((byte) -97, class86.field1363, var7);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZFLie;ZLdl;)[I")
    public final int[] method286(boolean arg0, float arg1, class32 arg2, boolean arg3, class123 arg4) {
        if (arg0) {
            method285(false, (String) null, false);
        }
        field480++;
        if (this.field464 == null || this.field474 != arg1) {
            if (!this.field457.method1412(arg4, -1, arg2)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field464 = this.field457.method1414(this.field466, arg2, var6, (double) arg1, 0, true, var6, arg4);
            this.field474 = arg1;
            if (this.field470) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var12 = var6;
                int var13 = var6;
                int var14 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var13--;
                        int var35 = this.field464[var13];
                        var7[var34] += class224.method1526(var35, 16760107) >> 16;
                        var8[var34] += class224.method1526(65481, var35) >> 8;
                        var9[var34] += class224.method1526(255, var35);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var24 += var7[var25];
                        var22 += var8[var25];
                        var23 += var9[var25];
                        if (var25 == 0) {
                            var25 = var12;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        int var31 = var22 / 9;
                        var25--;
                        int var32 = var24 / 9;
                        int var33 = var23 / 9;
                        var21--;
                        var19--;
                        var10[var19] = class120.method787(var33, class120.method787(var31 << 8, var32 << 16));
                        var23 += var9[var25] - var9[var21];
                        var22 += var8[var25] - var8[var21];
                        var24 += var7[var25] - var7[var21];
                        if (var21 == 0) {
                            var21 = var12;
                        }
                        if (var25 == 0) {
                            var25 = var12;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var14--;
                        int var29 = this.field464[var14];
                        var13--;
                        int var30 = this.field464[var13];
                        var7[var28] += (class224.method1526(var30, 16769386) >> 16) - (class224.method1526(16764655, var29) >> 16);
                        var8[var28] += (class224.method1526(65324, var30) >> 8) - class224.method1526(var29 >> 8, 255);
                        var9[var28] += -class224.method1526(255, var29) + class224.method1526(255, var30);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field464 = var10;
            }
        }
        return this.field464;
    }

    @OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field472++;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)I")
    public static final int method287(boolean arg0) {
        field477++;
        if (!arg0) {
            method287(false);
        }
        return 6;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public static void method288(int arg0) {
        int var1 = 36 / ((17 - arg0) / 63);
        field465 = null;
        field469 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLie;Ldl;)Z")
    public final boolean method289(byte arg0, class32 arg1, class123 arg2) {
        field458++;
        return arg0 < 107 ? true : this.field457.method1412(arg2, -1, arg1);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Llj;)V")
    public class36(class25 arg0) {
        this.field457 = new class209(arg0);
        this.field470 = arg0.method201(255) == 1;
        this.field466 = arg0.method201(255) == 1;
        arg0.method201(255);
        arg0.method201(255);
        int var2 = arg0.method201(255) & 0x3;
        this.field460 = arg0.method188(-111);
        this.field473 = arg0.method188(-126);
        arg0.method201(255);
        arg0.method201(255);
    }
}
