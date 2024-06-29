import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class198 extends class104 {

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "[I")
    private int[] field2822;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "[I")
    private int[] field2829;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "Lda;")
    private class128 field2839;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "Lda;")
    private class128 field2832;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "Lda;")
    private class128 field2831;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "[Lda;")
    private class128[] field2826;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "F")
    public static float field2828;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "Lbh;")
    public static class288 field2840;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILqb;)V", line = 7)
    public static final void method1360(int arg0, class109 arg1) {
        if (arg0 != -1) {
            return;
        }
        class298 var2 = (class298) class120.field1695.method1537(class48.method285((byte) -90, arg1.field1496), -22708);
        if (var2 == null) {
            class300.method2116(arg1.field2403[0], arg0 + 28, arg1, (class184) null, 0, arg1.field2359[0], (class238) null, class138.field1940);
        } else {
            var2.method2107(12295);
        }
        field2838++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLt;ZILlc;ZDI)[I", line = 28)
    public final int[] method1361(byte arg0, class268 arg1, boolean arg2, int arg3, class175 arg4, boolean arg5, double arg6, int arg7) {
        int[] var10 = new int[arg3 * arg7];
        field2835++;
        class90.method529(-19027, arg6);
        class109.field1517 = arg4;
        class235.field3422 = arg1;
        class224.method1542((byte) -124, arg3, arg7);
        for (int var11 = 0; var11 < this.field2826.length; var11++) {
            this.field2826[var11].method859(arg3, arg7, -256);
        }
        int var12;
        int var13;
        byte var14;
        if (arg5) {
            var13 = -1;
            var12 = arg7 - 1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = arg7;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field2832.field1753) {
                int[] var21 = this.field2832.method126((byte) 118, var16);
                var19 = var21;
                var20 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field2832.method102(var16, 5110);
                var18 = var17[0];
                var19 = var17[1];
                var20 = var17[2];
            }
            for (int var22 = var12; var22 != var13; var22 += var14) {
                int var23 = var19[var22] >> 4;
                int var24 = var18[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var20[var22] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class60.field740[var24];
                int var27 = class60.field740[var25];
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var28 = class60.field740[var23];
                var10[var15++] = (var28 << 8) + (var26 << 16) + var27;
                if (arg2) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field2826.length; var29++) {
            this.field2826[var29].method852(-781218450);
        }
        if (arg0 != -113) {
            this.method1361((byte) -2, (class268) null, true, -22, (class175) null, true, -1.1449762260011835D, 0);
        }
        return var10;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V", line = 160)
    public static final void method1362(int arg0) {
        field2842++;
        if (class286.method2045(110) != 2) {
            return;
        }
        byte var1 = (byte) (class262.field3962 - 4 & 0xFF);
        int var2 = class262.field3962 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class15.field215[var3][var2][var4] = var1;
            }
        }
        if (class138.field1940 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class322.field4946[var5] = -1000000;
            class158.field2178[var5] = 1000000;
            class259.field3931[var5] = 0;
            class312.field4829[var5] = 1000000;
            class309.field4785[var5] = 0;
        }
        if (arg0 >= -107) {
            field2828 = 0.50968313F;
        }
        if (class118.field1671 != 1) {
            int var6 = class184.method1278(class138.field1940, -13660, class109.field1506, class130.field1792);
            if ((var6 - class301.field4704) < 800 && (class264.field4163[class138.field1940][class130.field1792 >> 7][class109.field1506 >> 7] & 0x4) != 0) {
                class243.method1753(false, class158.field2184, class130.field1792 >> 7, 1, 22290, class109.field1506 >> 7);
            }
            return;
        }
        if ((class264.field4163[class138.field1940][class118.field1664.field2392 >> 7][class118.field1664.field2357 >> 7] & 0x4) != 0) {
            class243.method1753(false, class158.field2184, class118.field1664.field2392 >> 7, 0, 22290, class118.field1664.field2357 >> 7);
        }
        if (class30.field380 >= 310) {
            return;
        }
        int var7 = class130.field1792 >> 7;
        int var8 = class109.field1506 >> 7;
        int var9 = class118.field1664.field2392 >> 7;
        int var10 = class118.field1664.field2357 >> 7;
        int var11;
        if (var7 >= var9) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        int var12;
        if (var10 <= var8) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        if (var11 == 0 && var12 == 0 || var11 <= -104 || var11 >= 104 || var12 <= -104 || var12 >= 104) {
            class42.method245("RC: " + var7 + "," + var8 + " " + var9 + "," + var10 + " " + class142.field1992 + "," + class118.field1668, 1, (Throwable) null);
            return;
        }
        if (var12 < var11) {
            int var15 = var12 * 65536 / var11;
            int var16 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class264.field4163[class138.field1940][var7][var8] & 0x4) != 0) {
                    class243.method1753(false, class158.field2184, var7, 1, 22290, var8);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var8 < var10) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    var16 -= 65536;
                    if ((class264.field4163[class138.field1940][var7][var8] & 0x4) != 0) {
                        class243.method1753(false, class158.field2184, var7, 1, 22290, var8);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var11 * 65536 / var12;
        int var14 = 32768;
        while (var8 != var10) {
            if (var10 > var8) {
                var8++;
            } else if (var10 < var8) {
                var8--;
            }
            if ((class264.field4163[class138.field1940][var7][var8] & 0x4) != 0) {
                class243.method1753(false, class158.field2184, var7, 1, 22290, var8);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                var14 -= 65536;
                if ((class264.field4163[class138.field1940][var7][var8] & 0x4) != 0) {
                    class243.method1753(false, class158.field2184, var7, 1, 22290, var8);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIBI)V", line = 357)
    public static final void method1363(int arg0, int arg1, byte arg2, int arg3) {
        class96 var4 = class141.method935(arg3, 9, 45);
        if (arg2 != -77) {
            field2828 = -0.60997725F;
        }
        field2825++;
        var4.method581((byte) -120);
        var4.field1243 = arg1;
        var4.field1246 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILt;ZDLlc;I)Lqi;", line = 373)
    public final class317 method1364(int arg0, int arg1, class268 arg2, boolean arg3, double arg4, class175 arg5, int arg6) {
        class90.method529(-19027, arg4);
        class109.field1517 = arg5;
        field2833++;
        class235.field3422 = arg2;
        class224.method1542((byte) -63, arg0, arg1);
        class317 var9 = new class317(arg1, arg0);
        for (int var10 = 0; var10 < this.field2826.length; var10++) {
            this.field2826[var10].method859(arg0, arg1, -256);
        }
        int var11 = 0;
        if (arg6 > -5) {
            this.field2832 = (class128) null;
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg3) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field2832.field1753) {
                int[] var17 = this.field2832.method126((byte) 114, var12);
                var16 = var17;
                var15 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field2832.method102(var12, 5110);
                var14 = var13[0];
                var15 = var13[1];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field2831.field1753) {
                var18 = this.field2831.method126((byte) 116, var12);
            } else {
                var18 = this.field2831.method102(var12, 5110)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                int var21 = var15[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = class60.field740[var21];
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class60.field740[var20];
                int var25 = class60.field740[var22];
                int var26;
                if (var24 == 0 && var23 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field2717[var11++] = (var23 << 8) + var25 + (var24 << 16) + (var26 << 24);
                if (arg3) {
                    var11 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field2826.length; var27++) {
            this.field2826[var27].method852(-781218450);
        }
        return var9;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([I[I[IILhc;)V", line = 510)
    public static final void method1365(int[] arg0, int[] arg1, int[] arg2, int arg3, class184 arg4) {
        for (int var5 = arg3; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg4.field2364.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field2364[var9] = null;
                    } else {
                        class247 var10 = class185.method1289(var6, (byte) 124);
                        int var11 = var10.field3729;
                        class204 var12 = arg4.field2364[var9];
                        if (var12 != null) {
                            if (var12.field2870 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field2364[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2863 = 0;
                                    var12.field2866 = 0;
                                    var12.field2865 = 1;
                                    var12.field2861 = 0;
                                    var12.field2858 = var8;
                                    class337.method2329(false, var10, (byte) -97, arg4.field2392, arg4.field2357, 0);
                                } else if (var11 == 2) {
                                    var12.field2861 = 0;
                                }
                            } else if (var10.field3740 >= class185.method1289(var12.field2870, (byte) 106).field3740) {
                                var12 = arg4.field2364[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class204 var13 = arg4.field2364[var9] = new class204();
                            var13.field2858 = var8;
                            var13.field2861 = 0;
                            var13.field2870 = var6;
                            var13.field2863 = 0;
                            var13.field2866 = 0;
                            var13.field2865 = 1;
                            class337.method2329(false, var10, (byte) -97, arg4.field2392, arg4.field2357, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field2837++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lt;ILlc;)Z", line = 606)
    public final boolean method1366(class268 arg0, int arg1, class175 arg2) {
        field2824++;
        if (class93.field1158 <= 0) {
            for (int var4 = 0; var4 < this.field2829.length; var4++) {
                if (!arg2.method1194(this.field2829[var4], (byte) 126)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2829.length; var5++) {
                if (!arg2.method1185(this.field2829[var5], -2, class93.field1158)) {
                    return false;
                }
            }
        }
        int var6 = 0;
        if (arg1 != 1) {
            method1371(-93, -79, -34, -80, 66);
        }
        while (this.field2822.length > var6) {
            if (!arg0.method521(this.field2822[var6], (byte) 110)) {
                return false;
            }
            var6++;
        }
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 658)
    public static final void method1367(int arg0, int arg1, int arg2) {
        class283.field4449 = true;
        class238.field3512 = arg0;
        class115.field1632 = arg1;
        class267.field4207 = arg2;
        class298.field4658 = -1;
        class62.field785 = -1;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V", line = 667)
    public static void method1368(int arg0) {
        if (arg0 >= -56) {
            method1373(-81, 82, true, -108);
        }
        field2840 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BDLlc;Lt;IIZ)Laf;", line = 684)
    public final class189 method1369(byte arg0, double arg1, class175 arg2, class268 arg3, int arg4, int arg5, boolean arg6) {
        field2827++;
        class90.method529(-19027, arg1);
        class235.field3422 = arg3;
        class109.field1517 = arg2;
        class224.method1542((byte) -92, arg5, arg4);
        class189 var9 = new class189(arg4, arg5);
        for (int var10 = 0; var10 < this.field2826.length; var10++) {
            this.field2826[var10].method859(arg5, arg4, -256);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg6) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field2832.field1753) {
                int[] var17 = this.field2832.method126((byte) 106, var12);
                var15 = var17;
                var16 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field2832.method102(var12, 5110);
                var14 = var13[1];
                var15 = var13[2];
                var16 = var13[0];
            }
            for (int var18 = 0; var18 != arg4; var18++) {
                int var19 = var16[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                int var20 = class60.field740[var19];
                int var21 = var15[var18] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var14[var18] >> 4;
                int var23 = class60.field740[var21];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class60.field740[var22];
                var9.field2717[var11++] = (var20 << 16) + var23 + (var24 << 8);
                if (arg6) {
                    var11 += arg4 - 1;
                }
            }
        }
        if (arg0 <= 85) {
            return (class189) null;
        } else {
            for (int var25 = 0; var25 < this.field2826.length; var25++) {
                this.field2826[var25].method852(-781218450);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lt;IILlc;ZI)[F", line = 796)
    public final float[] method1370(class268 arg0, int arg1, int arg2, class175 arg3, boolean arg4, int arg5) {
        class235.field3422 = arg0;
        if (arg5 != -1) {
            this.field2831 = (class128) null;
        }
        class109.field1517 = arg3;
        float[] var7 = new float[arg1 * arg2 * 4];
        field2830++;
        class224.method1542((byte) -86, arg1, arg2);
        for (int var8 = 0; var8 < this.field2826.length; var8++) {
            this.field2826[var8].method859(arg1, arg2, -256);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            if (arg4) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field2832.field1753) {
                int[] var15 = this.field2832.method126((byte) 114, var10);
                var14 = var15;
                var12 = var15;
                var13 = var15;
            } else {
                int[][] var11 = this.field2832.method102(var10, arg5 + 5111);
                var12 = var11[0];
                var13 = var11[1];
                var14 = var11[2];
            }
            int[] var16;
            if (this.field2831.field1753) {
                var16 = this.field2831.method126((byte) 108, var10);
            } else {
                var16 = this.field2831.method102(var10, 5110)[0];
            }
            int[] var17;
            if (this.field2839.field1753) {
                var17 = this.field2839.method126((byte) 123, var10);
            } else {
                var17 = this.field2839.method102(var10, 5110)[0];
            }
            for (int var18 = arg2 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = var19;
                if (arg4) {
                    var9 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field2826.length; var21++) {
            this.field2826[var21].method852(-781218450);
        }
        return var7;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)V", line = 905)
    public static final void method1371(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class308.field4765 = -1;
        class184.field2663 = class308.field4766 * arg2 / arg3;
        class231.field3373 = class291.field4574 * arg0 / arg1;
        class30.field383 = -1;
        if (arg4 != 20196) {
            field2828 = 0.3371913F;
        }
        field2836++;
        class106.method617(-8915);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(DLt;BIILlc;Z)[I", line = 926)
    public final int[] method1372(double arg0, class268 arg1, byte arg2, int arg3, int arg4, class175 arg5, boolean arg6) {
        field2823++;
        class90.method529(-19027, arg0);
        class235.field3422 = arg1;
        class109.field1517 = arg5;
        int[] var9 = new int[arg3 * arg4 * 4];
        class224.method1542((byte) -116, arg4, arg3);
        if (arg2 <= 51) {
            this.field2832 = (class128) null;
        }
        for (int var10 = 0; var10 < this.field2826.length; var10++) {
            this.field2826[var10].method859(arg4, arg3, -256);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            if (arg6) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field2832.field1753) {
                int[] var17 = this.field2832.method126((byte) 115, var12);
                var14 = var17;
                var15 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field2832.method102(var12, 5110);
                var14 = var13[2];
                var15 = var13[0];
                var16 = var13[1];
            }
            int[] var18;
            if (this.field2831.field1753) {
                var18 = this.field2831.method126((byte) 110, var12);
            } else {
                var18 = this.field2831.method102(var12, 5110)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                int var21 = var16[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = class60.field740[var21];
                int var23 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class60.field740[var20];
                int var25 = class60.field740[var23];
                int var26;
                if (var24 == 0 && var22 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (var26 << 24) + (var22 << 8) + (var24 << 16) + var25;
                if (arg6) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field2826.length; var27++) {
            this.field2826[var27].method852(-781218450);
        }
        return var9;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 1067)
    public class198() {
        this.field2822 = new int[0];
        this.field2829 = new int[0];
        this.field2839 = new class148(0);
        this.field2839.field1751 = 1;
        this.field2832 = new class148();
        this.field2832.field1751 = 1;
        this.field2831 = new class148();
        this.field2831.field1751 = 1;
        this.field2826 = new class128[] { this.field2832, this.field2831, this.field2839 };
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lp;)V", line = 1082)
    public class198(class107 arg0) {
        int var2 = 0;
        int var3 = arg0.method661(-1);
        this.field2826 = new class128[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class128 var7 = class67.method420(1, arg0);
            if (var7.method860(-6967) >= 0) {
                var4++;
            }
            if (var7.method856(121) >= 0) {
                var2++;
            }
            int var8 = var7.field1762.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method661(-1);
            }
            this.field2826[var6] = var7;
        }
        this.field2829 = new int[var4];
        int var10 = 0;
        this.field2822 = new int[var2];
        int var11 = 0;
        for (int var12 = 0; var12 < var3; var12++) {
            class128 var13 = this.field2826[var12];
            int var14 = var13.field1762.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field1762[var15] = this.field2826[var5[var12][var15]];
            }
            int var16 = var13.method860(-6967);
            int var17 = var13.method856(108);
            if (var16 > 0) {
                this.field2829[var10++] = var16;
            }
            if (var17 > 0) {
                this.field2822[var11++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field2832 = this.field2826[arg0.method661(-1)];
        this.field2831 = this.field2826[arg0.method661(-1)];
        this.field2839 = this.field2826[arg0.method661(-1)];
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZI)V", line = 1170)
    public static final void method1373(int arg0, int arg1, boolean arg2, int arg3) {
        String var4 = "::tele " + arg3 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
        if (arg2) {
            field2834++;
            System.out.println(var4);
            class322.method2241(12, var4);
        }
    }
}
