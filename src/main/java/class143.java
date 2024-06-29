import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class143 extends class312 {

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "[I")
    private int[] field2279;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "[I")
    private int[] field2276;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "Ltj;")
    private class273 field2267;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "Ltj;")
    private class273 field2270;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "Ltj;")
    private class273 field2271;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "[Ltj;")
    private class273[] field2277;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public static int field2278 = 0;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2265 = "Allocating memory";

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "Lwf;")
    public static class306 field2262;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "Lwf;")
    public static class306 field2275;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lwf;ZIZDILpi;I)[I", line = 4)
    public final int[] method996(class306 arg0, boolean arg1, int arg2, boolean arg3, double arg4, int arg5, class239 arg6, int arg7) {
        class286.method1870((byte) -62, arg4);
        class85.field1290 = arg0;
        field2260++;
        class35.field446 = arg6;
        class269.method1782(0, arg7, arg5);
        if (arg2 != -17998) {
            this.field2271 = (class273) null;
        }
        for (int var10 = 0; var10 < this.field2277.length; var10++) {
            this.field2277[var10].method1794(true, arg7, arg5);
        }
        int[] var11 = new int[arg5 * arg7];
        byte var12;
        int var13;
        int var14;
        if (arg3) {
            var14 = -1;
            var12 = -1;
            var13 = arg7 - 1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg7;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field2270.field4194) {
                int[] var17 = this.field2270.method331(var16, arg2 + 3348);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field2270.method170(var16, (byte) 68);
                var20 = var21[1];
                var19 = var21[2];
                var18 = var21[0];
            }
            for (int var22 = var13; var22 != var14; var22 += var12) {
                int var23 = var18[var22] >> 4;
                int var24 = var20[var22] >> 4;
                int var25 = var19[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class150.field2362[var24];
                int var27 = class150.field2362[var25];
                int var28 = class150.field2362[var23];
                var11[var15++] = (var26 << 8) + (var28 << 16) + var27;
                if (arg1) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field2277.length; var29++) {
            this.field2277[var29].method1417(4387);
        }
        return var11;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILpi;BDLwf;Z)[I", line = 152)
    public final int[] method997(int arg0, int arg1, class239 arg2, byte arg3, double arg4, class306 arg5, boolean arg6) {
        class286.method1870((byte) -84, arg4);
        class35.field446 = arg2;
        class85.field1290 = arg5;
        field2268++;
        class269.method1782(0, arg0, arg1);
        int[] var9 = new int[arg0 * arg1 * 4];
        for (int var10 = 0; var10 < this.field2277.length; var10++) {
            this.field2277[var10].method1794(true, arg0, arg1);
        }
        if (arg3 >= -79) {
            method1003(31, (byte) 119, -116, 98, 50);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg6) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field2270.field4194) {
                int[] var17 = this.field2270.method331(var12, -14650);
                var14 = var17;
                var15 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field2270.method170(var12, (byte) 68);
                var14 = var13[0];
                var15 = var13[2];
                var16 = var13[1];
            }
            int[] var18;
            if (this.field2271.field4194) {
                var18 = this.field2271.method331(var12, -14650);
            } else {
                var18 = this.field2271.method170(var12, (byte) 68)[0];
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                int var21 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = var16[var19] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class150.field2362[var20];
                if (var22 > 255) {
                    var22 = 255;
                }
                int var24 = class150.field2362[var21];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class150.field2362[var22];
                int var26;
                if (var23 == 0 && var25 == 0 && var24 == 0) {
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
                var9[var11++] = (var25 << 8) + (var23 << 16) + (var26 << 24) + var24;
                if (arg6) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field2277.length; var27++) {
            this.field2277[var27].method1417(4387);
        }
        return var9;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBDZLpi;Lwf;I)Lti;", line = 289)
    public final class135 method998(int arg0, byte arg1, double arg2, boolean arg3, class239 arg4, class306 arg5, int arg6) {
        field2272++;
        class286.method1870((byte) -51, arg2);
        class35.field446 = arg4;
        class85.field1290 = arg5;
        class269.method1782(0, arg0, arg6);
        class135 var9 = new class135(arg0, arg6);
        for (int var10 = 0; var10 < this.field2277.length; var10++) {
            this.field2277[var10].method1794(true, arg0, arg6);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field2270.field4194) {
                int[] var13 = this.field2270.method331(var12, -14650);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field2270.method170(var12, (byte) 68);
                var16 = var17[2];
                var14 = var17[0];
                var15 = var17[1];
            }
            if (arg3) {
                var11 = var12 << 2;
            }
            int[] var18;
            if (this.field2271.field4194) {
                var18 = this.field2271.method331(var12, arg1 - 14677);
            } else {
                var18 = this.field2271.method170(var12, (byte) 68)[0];
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                int var21 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = class150.field2362[var20];
                int var23 = var16[var19] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class150.field2362[var23];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var25 = class150.field2362[var21];
                int var26;
                if (var25 == 0 && var22 == 0 && var24 == 0) {
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
                var9.field2734[var11++] = (var22 << 8) + var24 + (var25 << 16) + (var26 << 24);
                if (arg3) {
                    var11 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field2277.length; var27++) {
            this.field2277[var27].method1417(4387);
        }
        if (arg1 == 27) {
            return var9;
        } else {
            return (class135) null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V", line = 425)
    public static final void method999(int arg0, boolean arg1) {
        field2269++;
        byte var2;
        byte[][] var3;
        if (class333.field5166 && arg1) {
            var2 = 1;
            var3 = class305.field4775;
        } else {
            var3 = class151.field2380;
            var2 = 4;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class233.method1592(true);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class212.field3362[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x33C9BE0) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 14 & 0x3FF;
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = (var7 & 0x3FF9) >> 3;
                            int var12 = (var9 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class121.field1865.length; var13++) {
                                if (class121.field1865[var13] == var12 && var3[var13] != null) {
                                    class204.method1368(var10, var8, var3[var13], var4, (var11 & 0x7) * 8, (var9 & 0x7) * 8, class33.field425, arg1, var5 * 8, arg0 ^ 0xFCC3522F, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 54303712) {
            method1005((int[]) null, (Object[]) null, -59);
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)V", line = 506)
    public static void method1000(byte arg0) {
        field2275 = null;
        if (arg0 <= -31) {
            field2265 = null;
            field2262 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZDIBLwf;Lpi;)Ln;", line = 518)
    public final class178 method1001(int arg0, boolean arg1, double arg2, int arg3, byte arg4, class306 arg5, class239 arg6) {
        if (arg4 >= -31) {
            field2261 = 18;
        }
        field2281++;
        class286.method1870((byte) -25, arg2);
        class85.field1290 = arg5;
        class35.field446 = arg6;
        class269.method1782(0, arg0, arg3);
        class178 var9 = new class178(arg0, arg3);
        for (int var10 = 0; var10 < this.field2277.length; var10++) {
            this.field2277[var10].method1794(true, arg0, arg3);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg1) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field2270.field4194) {
                int[] var17 = this.field2270.method331(var12, -14650);
                var15 = var17;
                var16 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field2270.method170(var12, (byte) 68);
                var14 = var13[2];
                var15 = var13[1];
                var16 = var13[0];
            }
            for (int var18 = 0; var18 != arg0; var18++) {
                int var19 = var16[var18] >> 4;
                int var20 = var14[var18] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var15[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = class150.field2362[var21];
                if (var19 < 0) {
                    var19 = 0;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var23 = class150.field2362[var20];
                int var24 = class150.field2362[var19];
                var9.field2734[var11++] = (var22 << 8) + (var24 << 16) + var23;
                if (arg1) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var25 = 0; var25 < this.field2277.length; var25++) {
            this.field2277[var25].method1417(4387);
        }
        return var9;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lpi;Lwf;I)Z", line = 634)
    public final boolean method1002(class239 arg0, class306 arg1, int arg2) {
        field2273++;
        if (class204.field3084 <= arg2) {
            for (int var4 = 0; var4 < this.field2276.length; var4++) {
                if (!arg1.method2093(arg2 - 89, this.field2276[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2276.length; var5++) {
                if (!arg1.method2100(this.field2276[var5], true, class204.field3084)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2279.length; var6++) {
            if (!arg0.method1567((byte) 25, this.field2279[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBIII)V", line = 686)
    public static final void method1003(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2280++;
        int var5 = -13 % ((36 - arg1) / 61);
        int var6 = 0;
        class253.method1704(arg4 - arg3, arg3 + arg4, arg2, class175.field2675[arg0], 7);
        int var7 = arg3;
        int var8 = -arg3;
        int var9 = -1;
        while (var6 < var7) {
            var9 += 2;
            var8 += var9;
            var6++;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int[] var10 = class175.field2675[arg0 + var7];
                int[] var11 = class175.field2675[arg0 - var7];
                int var12 = arg4 - var6;
                int var13 = arg4 + var6;
                class253.method1704(var12, var13, arg2, var10, 7);
                class253.method1704(var12, var13, arg2, var11, 7);
            }
            int var14 = arg4 + var7;
            int[] var15 = class175.field2675[arg0 + var6];
            int var16 = arg4 - var7;
            int[] var17 = class175.field2675[arg0 - var6];
            class253.method1704(var16, var14, arg2, var15, 7);
            class253.method1704(var16, var14, arg2, var17, 7);
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V", line = 740)
    public static final void method1004(int arg0) {
        int var1 = class112.method750(true);
        if (arg0 >= -29) {
            field2262 = (class306) null;
        }
        field2274++;
        if (var1 == 0) {
            class97.field1512 = (byte[][][]) null;
            class222.method1486(0, 31544);
        } else if (var1 == 1) {
            class285.method1861((byte) 0, (byte) 99);
            class222.method1486(512, 31544);
            if (class305.field4784 != null) {
                class177.method1204(104);
            }
        } else {
            class285.method1861((byte) (class19.field260 - 4 & 0xFF), (byte) 99);
            class222.method1486(2, 31544);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([I[Ljava/lang/Object;I)V", line = 774)
    public static final void method1005(int[] arg0, Object[] arg1, int arg2) {
        field2263++;
        if (arg2 > -67) {
            method1005((int[]) null, (Object[]) null, -3);
        }
        class318.method2160(arg0, arg1, false, arg0.length - 1, 0);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILwf;ZLpi;I)[F", line = 801)
    public final float[] method1006(int arg0, int arg1, class306 arg2, boolean arg3, class239 arg4, int arg5) {
        class85.field1290 = arg2;
        class35.field446 = arg4;
        class269.method1782(arg0 ^ arg0, arg1, arg5);
        float[] var7 = new float[arg1 * arg5 * 4];
        for (int var8 = 0; var8 < this.field2277.length; var8++) {
            this.field2277[var8].method1794(true, arg1, arg5);
        }
        int var9 = 0;
        field2266++;
        for (int var10 = 0; var10 < arg5; var10++) {
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field2270.field4194) {
                int[] var11 = this.field2270.method331(var10, -14650);
                var12 = var11;
                var13 = var11;
                var14 = var11;
            } else {
                int[][] var15 = this.field2270.method170(var10, (byte) 68);
                var13 = var15[2];
                var12 = var15[0];
                var14 = var15[1];
            }
            int[] var16;
            if (this.field2271.field4194) {
                var16 = this.field2271.method331(var10, arg0 + 13249);
            } else {
                var16 = this.field2271.method170(var10, (byte) 68)[0];
            }
            int[] var17;
            if (this.field2267.field4194) {
                var17 = this.field2267.method331(var10, -14650);
            } else {
                var17 = this.field2267.method170(var10, (byte) 68)[0];
            }
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = var19;
                if (arg3) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field2277.length; var21++) {
            this.field2277[var21].method1417(4387);
        }
        return var7;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 904)
    public class143() {
        this.field2279 = new int[0];
        this.field2276 = new int[0];
        this.field2267 = new class194(0);
        this.field2267.field4190 = 1;
        this.field2270 = new class194();
        this.field2270.field4190 = 1;
        this.field2271 = new class194();
        this.field2277 = new class273[] { this.field2270, this.field2271, this.field2267 };
        this.field2271.field4190 = 1;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lgn;)V", line = 920)
    public class143(class303 arg0) {
        int var2 = arg0.method2043((byte) -126);
        this.field2277 = new class273[var2];
        int[][] var3 = new int[var2][];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class273 var7 = class249.method1691(arg0, (byte) 35);
            if (var7.method1412((byte) -107) >= 0) {
                var4++;
            }
            if (var7.method1773(14980) >= 0) {
                var5++;
            }
            int var8 = var7.field4201.length;
            var3[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var3[var6][var9] = arg0.method2043((byte) -110);
            }
            this.field2277[var6] = var7;
        }
        this.field2279 = new int[var5];
        int var10 = 0;
        this.field2276 = new int[var4];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class273 var13 = this.field2277[var12];
            int var14 = var13.field4201.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4201[var15] = this.field2277[var3[var12][var15]];
            }
            int var16 = var13.method1412((byte) -107);
            int var17 = var13.method1773(14980);
            if (var16 > 0) {
                this.field2276[var11++] = var16;
            }
            if (var17 > 0) {
                this.field2279[var10++] = var17;
            }
            var3[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field2270 = this.field2277[arg0.method2043((byte) -106)];
        this.field2271 = this.field2277[arg0.method2043((byte) -124)];
        this.field2267 = this.field2277[arg0.method2043((byte) -113)];
    }
}
