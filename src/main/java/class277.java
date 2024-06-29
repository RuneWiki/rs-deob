import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class277 extends class69 {

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "[Lod;")
    public class244[] field4829;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "[I")
    private int[] field4819;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "[B")
    public byte[] field4818;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "[B")
    public byte[] field4820;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "[S")
    public short[] field4825;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "[Ldk;")
    public class224[] field4835;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "[B")
    public byte[] field4837;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public int field4836;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field4822 = 0;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field4821 = 0;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "Lha;")
    public static class46 field4830 = class271.method1828("Versteckt", -46);

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field4828 = 0;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "Lmi;")
    public static class81 field4824;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B[B[ILbl;)Z")
    public final boolean method1861(byte arg0, byte[] arg1, int[] arg2, class128 arg3) {
        field4833++;
        int var5 = 0;
        class224 var6 = null;
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var10 = this.field4819[var8];
                if (var10 != 0) {
                    if (var5 != var10) {
                        var5 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var6 = arg3.method992(var10 >> 2, arg2, (byte) 44);
                        } else {
                            var6 = arg3.method994((byte) 33, var10 >> 2, arg2);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field4835[var8] = var6;
                        this.field4819[var8] = 0;
                    }
                }
            }
        }
        int var9 = -128 % ((-arg0 - 1) / 41);
        return var7;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BJ)Lha;")
    public static final class46 method1862(byte arg0, long arg1) {
        field4823++;
        if (arg0 != -64) {
            return null;
        } else if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class54.field929[(int) (var8 - (arg1 * 37L))];
            }
            class46 var7 = new class46();
            var7.field768 = var6;
            var7.field762 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public static void method1863(int arg0) {
        field4824 = null;
        if (arg0 <= 64) {
            field4822 = -85;
        }
        field4830 = null;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
    public final void method1864(byte arg0) {
        if (arg0 != -42) {
            method1863(80);
        }
        field4834++;
        this.field4819 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZIIIZZI)Lhh;")
    public static final class263 method1865(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field4827++;
        class71 var8 = class80.method633(arg2, arg4 + 3);
        if (arg3 > 1 && var8.field1239 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg3 >= var8.field1265[var10] && var8.field1265[var10] != 0) {
                    var9 = var8.field1239[var10];
                }
            }
            if (var9 != -1) {
                var8 = class80.method633(var9, 0);
            }
        }
        class192 var11 = var8.method514((byte) 126);
        if (var11 == null) {
            return null;
        }
        class21 var12 = null;
        if (var8.field1222 != -1) {
            var12 = (class21) method1865(0, false, var8.field1260, 10, -3, true, true, 1);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field1279 != -1) {
            var12 = (class21) method1865(arg0, false, var8.field1287, arg3, arg4, true, false, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class262.field4564;
        int var14 = class262.field4561;
        int var15 = class262.field4560;
        if (arg4 != -3) {
            method1866((class154) null, -106, -45, -114, 38, -17, 47);
        }
        int[] var16 = new int[4];
        class262.method1770(var16);
        class21 var17 = new class21(36, 32);
        class262.method1755(var17.field277, 36, 32);
        class62.method438();
        class62.method431(16, 16);
        class62.field1047 = false;
        int var18 = var8.field1272;
        if (arg6) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg7 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class62.field1042[var8.field1234] * var18 >> 16;
        int var20 = class62.field1049[var8.field1234] * var18 >> 16;
        var11.method234(0, var8.field1212, var8.field1229, var8.field1234, var8.field1278, var8.field1225 + var19 - (var11.method183() / 2), var8.field1225 + var20);
        if (arg7 >= 1) {
            var17.method125(1);
            if (arg7 >= 2) {
                var17.method125(16777215);
            }
            class262.method1755(var17.field277, 36, 32);
        }
        if (arg0 != 0) {
            var17.method117(arg0);
        }
        if (var8.field1222 != -1) {
            var12.method119(0, 0);
        } else if (var8.field1279 != -1) {
            class262.method1755(var12.field277, 36, 32);
            var17.method119(0, 0);
            var17 = var12;
        }
        if (arg1 && (var8.field1226 == 1 || arg3 != 1) && arg3 != -1) {
            class161.field2840.method148(class23.method159(65, arg3), 0, 9, 16776960, 1);
        }
        class262.method1755(var13, var14, var15);
        class262.method1752(var16);
        class62.method438();
        class62.field1047 = true;
        return var17;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Luf;IIIIII)V")
    public static final void method1866(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4826++;
        if (arg1 != 2) {
            method1865(-7, false, -63, 82, 16, true, true, 83);
        }
        long var7 = 0L;
        if (arg6 == 0) {
            var7 = class264.method1779(arg2, arg4, arg5);
        } else if (arg6 == 1) {
            var7 = class142.method1073(arg2, arg4, arg5);
        } else if (arg6 == 2) {
            var7 = class99.method765(arg2, arg4, arg5);
        } else if (arg6 == 3) {
            var7 = class57.method397(arg2, arg4, arg5);
        }
        boolean var9 = false;
        int var10 = ((int) var7 & 0x3A7548) >> 20;
        boolean var11 = true;
        int var12 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class236 var13 = class157.method1158(var12, 120);
        if (var13.method1619(-113)) {
            class34.method217(var13, true, arg2, arg5, arg4);
        }
        boolean var14 = false;
        int var15 = ((int) var7 & 0x7CE37) >> 14;
        if (var7 == 0L) {
            return;
        }
        if (arg6 == 0) {
            class28.method196(arg2, arg4, arg5);
            if (var13.field4157 != 0) {
                arg0.method1123(var10, var13.field4139, arg5, arg4, var15, 24515);
                return;
            }
            return;
        }
        if (arg6 == 1) {
            class273.method1847(arg2, arg4, arg5);
            return;
        }
        if (arg6 != 2) {
            if (arg6 == 3) {
                class145.method1081(arg2, arg4, arg5);
                if (var13.field4157 == 1) {
                    arg0.method1130((byte) 94, arg4, arg5);
                    return;
                }
            }
            return;
        }
        class269.method1803(arg2, arg4, arg5);
        if (var13.field4157 != 0 && (var13.field4152 + arg4) < 104 && (var13.field4152 + arg5) < 104 && arg4 + var13.field4130 < 104 && var13.field4130 + arg5 < 104) {
            arg0.method1126((byte) 18, arg4, var13.field4139, var13.field4152, arg5, var13.field4130, var10);
            return;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
    public static final int method1867(int arg0, int arg1, int arg2) {
        if (arg1 > -2) {
            return -111;
        }
        field4831++;
        int var3 = (class275.method1856(arg0 + 45365, arg2 + 91923, (byte) -6, 4) + (class275.method1856(arg0 + 10294, arg2 - -37821, (byte) -6, 2) - 128 >> 1) + (class275.method1856(arg0, arg2, (byte) -6, 1) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class277() {
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "([B)V")
    public class277(byte[] arg0) {
        this.field4829 = new class244[128];
        this.field4819 = new int[128];
        this.field4818 = new byte[128];
        this.field4820 = new byte[128];
        this.field4825 = new short[128];
        this.field4835 = new class224[128];
        this.field4837 = new byte[128];
        class75 var2 = new class75(arg0);
        int var3;
        for (var3 = 0; var2.field1368[var2.field1380 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method569((byte) -110);
        }
        var2.field1380++;
        var3++;
        int var6 = var2.field1380;
        int var7 = 0;
        var2.field1380 += var3;
        while (var2.field1368[var2.field1380 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method569((byte) -110);
        }
        var7++;
        var2.field1380++;
        int var10 = 0;
        int var11 = var2.field1380;
        var2.field1380 += var7;
        while (var2.field1368[var2.field1380 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method569((byte) -110);
        }
        var2.field1380++;
        var10++;
        byte[] var14 = new byte[var10];
        int var16;
        if (var10 > 1) {
            int var15 = 1;
            var14[1] = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var2.method558(1);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var10;
        }
        class244[] var19 = new class244[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class244 var103 = var19[var20] = new class244();
            int var104 = var2.method558(1);
            if (var104 > 0) {
                var103.field4323 = new byte[var104 * 2];
            }
            int var105 = var2.method558(1);
            if (var105 > 0) {
                var103.field4324 = new byte[var105 * 2 + 2];
                var103.field4324[1] = 64;
            }
        }
        int var21 = var2.method558(1);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method558(1);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field1368[var2.field1380 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method569((byte) -110);
        }
        var2.field1380++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method558(1);
            this.field4825[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method558(1);
            this.field4825[var31] = (short) (this.field4825[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method585(64);
            }
            var32--;
            this.field4825[var35] = (short) (this.field4825[var35] + class50.method369(var34 - 1 << 14, 32768));
            this.field4819[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4819[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field1368[var6++] - 1;
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                var37--;
                this.field4818[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4819[var43] != 0) {
                if (var41 == 0) {
                    if (var8.length <= var42) {
                        var41 = -1;
                    } else {
                        var41 = var8[var42++];
                    }
                    var40 = var2.field1368[var11++] + 16 << 2;
                }
                var41--;
                this.field4820[var43] = (byte) var40;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class244 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4819[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field4829[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var50 < var26.length) {
                    var49 = var26[var50++];
                } else {
                    var49 = -1;
                }
                if (this.field4819[var51] > 0) {
                    var48 = var2.method558(1) + 1;
                }
            }
            var49--;
            this.field4837[var51] = (byte) var48;
        }
        this.field4836 = var2.method558(1) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class244 var100 = var19[var52];
            if (var100.field4323 != null) {
                for (int var101 = 1; var101 < var100.field4323.length; var101 += 2) {
                    var100.field4323[var101] = var2.method569((byte) -110);
                }
            }
            if (var100.field4324 != null) {
                for (int var102 = 3; var102 < var100.field4324.length - 2; var102 += 2) {
                    var100.field4324[var102] = var2.method569((byte) -110);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method569((byte) -110);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method569((byte) -110);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class244 var97 = var19[var55];
            if (var97.field4324 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field4324.length; var99 += 2) {
                    var98 += var2.method558(1) + 1;
                    var97.field4324[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class244 var94 = var19[var56];
            if (var94.field4323 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field4323.length; var96 += 2) {
                    var95 += var2.method558(1) + 1;
                    var94.field4323[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method558(1);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method558(1) + (var57 + 1);
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[1];
            byte var60 = var22[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field4837[var61] = (byte) (this.field4837[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                int var66 = (var65 - var60) / 2 + (var65 - var60) * var59;
                byte var67 = var22[var62 + 1];
                for (int var68 = var60; var68 < var65; var68++) {
                    int var69 = class263.method1774(var66, var65 - var60, 7422);
                    var66 += var67 - var59;
                    this.field4837[var68] = (byte) (this.field4837[var68] * var69 + 32 >> 6);
                }
                var59 = var67;
                var62 += 2;
                var60 = var65;
            }
            for (int var63 = var60; var63 < 128; var63++) {
                this.field4837[var63] = (byte) (this.field4837[var63] * var59 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method558(1);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method558(1) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4820[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4820[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class263.method1774(var81, var79 - var72, 7422);
                    var81 += var80 - var73;
                    int var84 = (this.field4820[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4820[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field4820[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4820[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field4327 = var2.method558(1);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class244 var93 = var19[var87];
            if (var93.field4323 != null) {
                var93.field4334 = var2.method558(1);
            }
            if (var93.field4324 != null) {
                var93.field4330 = var2.method558(1);
            }
            if (var93.field4327 > 0) {
                var93.field4341 = var2.method558(1);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field4338 = var2.method558(1);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class244 var92 = var19[var89];
            if (var92.field4338 > 0) {
                var92.field4325 = var2.method558(1);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class244 var91 = var19[var90];
            if (var91.field4325 > 0) {
                var91.field4333 = var2.method558(1);
            }
        }
        if (class237.field4218) {
        }
    }
}
