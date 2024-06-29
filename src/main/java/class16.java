import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class16 {

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[[I")
    private int[][] field322;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lrc;")
    public static class105 field328 = class43.method374("redstone1", 0);

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field334 = 0;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lrc;")
    private static class105 field327 = class43.method374("Please remove ", 0);

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lrc;")
    public static class105 field324 = class43.method374("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>", 0);

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[I")
    public static int[] field337 = new int[2000];

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Z")
    public static boolean field340 = false;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field341 = -1;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lrc;")
    public static class105 field333 = class43.method374("Keine Antwort vom Server)3", 0);

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Lrc;")
    public static class105 field338 = class43.method374("redstone2", 0);

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lrc;")
    public static class105 field336 = field327;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lrc;")
    public static class105 field321 = field327;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lrc;")
    private static class105 field325 = class43.method374("Loaded fonts", 0);

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Lrc;")
    public static class105 field343 = field325;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field345 = 0;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lbd;")
    public static class11 field330;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I", line = 11)
    public final int method171(int arg0, int arg1) {
        int var3 = -106 / ((arg1 - 48) / 42);
        if (this.field322 != null) {
            arg0 = (int) ((long) this.field339 * (long) arg0 / (long) this.field342);
        }
        field335++;
        return arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 25)
    public static final void method172(int arg0) {
        field332++;
        class66.field1472.method781(215, (byte) -91);
        class109.field2500++;
        if (client.field424 != -1) {
            class118.method955(client.field424, 3819);
            class80.field1805 = true;
            class98.field2263 = true;
            class85.field1909 = -1;
            client.field424 = -1;
        }
        if (class1.field4 != -1) {
            class118.method955(class1.field4, 3819);
            class85.field1909 = -1;
            class90.field2064 = true;
            class1.field4 = -1;
        }
        if (class95.field2191 != -1) {
            class118.method955(class95.field2191, arg0 + 3820);
            class95.field2191 = -1;
            class136.method1069((byte) 45, 30);
        }
        if (class31.field746 != arg0) {
            class118.method955(class31.field746, 3819);
            class31.field746 = -1;
        }
        if (class18.field418 != -1) {
            class118.method955(class18.field418, arg0 + 3820);
            class85.field1909 = -1;
            class18.field418 = -1;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Z", line = 76)
    public static final boolean method173(int arg0, int arg1) {
        field346++;
        if (arg0 != -3) {
            field333 = null;
        }
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lte;I)Z", line = 90)
    public static final boolean method174(class119 arg0, int arg1) {
        field323++;
        int var2 = arg0.field2847;
        if (class88.field2006 == 2) {
            if (var2 == 201) {
                class90.field2064 = true;
                class85.field1901 = true;
                class43.field999 = class26.field604;
                class43.field1004 = class43.field992;
                class118.field2750 = 1;
                class98.field2257 = 0;
            }
            if (var2 == 202) {
                class43.field999 = class35.field819;
                class85.field1901 = true;
                class98.field2257 = 0;
                class43.field1004 = class43.field992;
                class118.field2750 = 2;
                class90.field2064 = true;
            }
        }
        if (var2 == 205) {
            class120.field2893 = 250;
            return true;
        } else if (arg1 == 1) {
            if (var2 == 501) {
                class43.field999 = class121.field2943;
                class98.field2257 = 0;
                class90.field2064 = true;
                class43.field1004 = class43.field992;
                class118.field2750 = 4;
                class85.field1901 = true;
            }
            if (var2 == 502) {
                class118.field2750 = 5;
                class43.field1004 = class43.field992;
                class85.field1901 = true;
                class43.field999 = class119.field2821;
                class98.field2257 = 0;
                class90.field2064 = true;
            }
            if (var2 >= 300 && var2 <= 313) {
                int var3 = (var2 - 300) / 2;
                int var4 = var2 & 0x1;
                class92.field2138.method151(var4 == 1, arg1 + 15, var3);
            }
            if (var2 >= 314 && var2 <= 323) {
                int var5 = (var2 - 314) / 2;
                int var6 = var2 & 0x1;
                class92.field2138.method141(var5, false, var6 == 1);
            }
            if (var2 == 324) {
                class92.field2138.method150(false, -1);
            }
            if (var2 == 325) {
                class92.field2138.method150(true, -1);
            }
            if (var2 == 326) {
                class66.field1472.method781(240, (byte) -29);
                class92.field2138.method144(class66.field1472, arg1 - 4722);
                class83.field1862++;
                return true;
            }
            if (var2 == 620) {
                class109.field2519 = !class109.field2519;
            }
            if (var2 >= 601 && var2 <= 613) {
                method172(-1);
                if (class43.field1008.method863(-125) > 0) {
                    class66.field1472.method781(112, (byte) -58);
                    class66.field1472.method64(class43.field1008.method828(455), -48);
                    class66.field1472.method102((byte) 123, var2 - 601);
                    class66.field1472.method102((byte) 123, class109.field2519 ? 1 : 0);
                    class41.field933++;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BI)[B", line = 213)
    public final byte[] method175(byte[] arg0, int arg1) {
        if (this.field322 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field339 / (long) this.field342) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field322[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field339 + var6;
                int var14 = var13 / this.field342;
                var4 += var14;
                var6 = var13 - this.field342 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field329++;
        return arg1 == 27285 ? arg0 : null;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)I", line = 303)
    public final int method176(int arg0, int arg1) {
        if (this.field322 != null) {
            arg0 = (int) ((long) this.field339 * (long) arg0 / (long) this.field342) + 6;
        }
        field331++;
        if (arg1 < 123) {
            field321 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILsb;IIIIBLkb;II)V", line = 322)
    public static final void method177(int arg0, class110 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class62 arg7, int arg8, int arg9) {
        field347++;
        int var10 = class9.field151[arg0][arg8][arg3];
        if (arg6 != -65) {
            return;
        }
        int var11 = class9.field151[arg0][arg8 + 1][arg3];
        int var12 = class9.field151[arg0][arg8 + 1][arg3 + 1];
        int var13 = class9.field151[arg0][arg8][arg3 + 1];
        int var14 = var11 + var13 + var10 + var12 >> 2;
        class121 var15 = class12.method149(arg9, (byte) 62);
        int var16 = (arg9 << 14) + (arg3 << 7) + arg8 + 1073741824;
        if (var15.field2948 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        int var17 = (arg5 << 6) + arg2;
        if (var15.field2910 == 1) {
            var17 += 256;
        }
        if (arg2 == 22) {
            class60 var18;
            if (var15.field2959 == -1 && var15.field2909 == null) {
                var18 = var15.method983(var12, var13, var11, var10, arg5, (byte) 80, 22);
            } else {
                var18 = new class67(arg9, 22, arg5, var10, var11, var12, var13, var15.field2959, true, null);
            }
            arg7.method518(arg4, arg8, arg3, var14, var18, var16, var17);
            if (var15.field2931 && var15.field2948 == 1) {
                arg1.method897(arg8, arg3, -125);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class60 var38;
            if (var15.field2959 == -1 && var15.field2909 == null) {
                var38 = var15.method983(var12, var13, var11, var10, arg5, (byte) 70, 10);
            } else {
                var38 = new class67(arg9, 10, arg5, var10, var11, var12, var13, var15.field2959, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg5 == 1 || arg5 == 3) {
                    var40 = var15.field2912;
                    var39 = var15.field2906;
                } else {
                    var39 = var15.field2912;
                    var40 = var15.field2906;
                }
                int var41 = 0;
                if (arg2 == 11) {
                    var41 += 256;
                }
                arg7.method523(arg4, arg8, arg3, var14, var40, var39, var38, var41, var16, var17);
            }
            if (var15.field2931) {
                arg1.method896(arg8, var15.field2912, var15.field2906, arg5, var15.field2960, true, arg3);
            }
        } else if (arg2 >= 12) {
            class60 var19;
            if (var15.field2959 == -1 && var15.field2909 == null) {
                var19 = var15.method983(var12, var13, var11, var10, arg5, (byte) 38, arg2);
            } else {
                var19 = new class67(arg9, arg2, arg5, var10, var11, var12, var13, var15.field2959, true, null);
            }
            arg7.method523(arg4, arg8, arg3, var14, 1, 1, var19, 0, var16, var17);
            if (var15.field2931) {
                arg1.method896(arg8, var15.field2912, var15.field2906, arg5, var15.field2960, true, arg3);
            }
        } else if (arg2 == 0) {
            class60 var20;
            if (var15.field2959 == -1 && var15.field2909 == null) {
                var20 = var15.method983(var12, var13, var11, var10, arg5, (byte) 18, 0);
            } else {
                var20 = new class67(arg9, 0, arg5, var10, var11, var12, var13, var15.field2959, true, null);
            }
            arg7.method542(arg4, arg8, arg3, var14, var20, null, class98.field2267[arg5], 0, var16, var17);
            if (var15.field2931) {
                arg1.method903(var15.field2960, arg2, arg8, (byte) -91, arg5, arg3);
            }
        } else if (arg2 == 1) {
            class60 var21;
            if (var15.field2959 == -1 && var15.field2909 == null) {
                var21 = var15.method983(var12, var13, var11, var10, arg5, (byte) 65, 1);
            } else {
                var21 = new class67(arg9, 1, arg5, var10, var11, var12, var13, var15.field2959, true, null);
            }
            arg7.method542(arg4, arg8, arg3, var14, var21, null, class100.field2289[arg5], 0, var16, var17);
            if (var15.field2931) {
                arg1.method903(var15.field2960, arg2, arg8, (byte) -33, arg5, arg3);
            }
        } else if (arg2 == 2) {
            int var22 = arg5 + 1 & 0x3;
            class60 var23;
            class60 var24;
            if (var15.field2959 == -1 && var15.field2909 == null) {
                var23 = var15.method983(var12, var13, var11, var10, arg5 + 4, (byte) 43, 2);
                var24 = var15.method983(var12, var13, var11, var10, var22, (byte) 34, 2);
            } else {
                var23 = new class67(arg9, 2, arg5 + 4, var10, var11, var12, var13, var15.field2959, true, null);
                var24 = new class67(arg9, 2, var22, var10, var11, var12, var13, var15.field2959, true, null);
            }
            arg7.method542(arg4, arg8, arg3, var14, var23, var24, class98.field2267[arg5], class98.field2267[var22], var16, var17);
            if (var15.field2931) {
                arg1.method903(var15.field2960, arg2, arg8, (byte) -46, arg5, arg3);
            }
        } else if (arg2 == 3) {
            class60 var25;
            if (var15.field2959 == -1 && var15.field2909 == null) {
                var25 = var15.method983(var12, var13, var11, var10, arg5, (byte) 20, 3);
            } else {
                var25 = new class67(arg9, 3, arg5, var10, var11, var12, var13, var15.field2959, true, null);
            }
            arg7.method542(arg4, arg8, arg3, var14, var25, null, class100.field2289[arg5], 0, var16, var17);
            if (var15.field2931) {
                arg1.method903(var15.field2960, arg2, arg8, (byte) -77, arg5, arg3);
            }
        } else if (arg2 == 9) {
            class60 var26;
            if (var15.field2959 == -1 && var15.field2909 == null) {
                var26 = var15.method983(var12, var13, var11, var10, arg5, (byte) 61, arg2);
            } else {
                var26 = new class67(arg9, arg2, arg5, var10, var11, var12, var13, var15.field2959, true, null);
            }
            arg7.method523(arg4, arg8, arg3, var14, 1, 1, var26, 0, var16, var17);
            if (var15.field2931) {
                arg1.method896(arg8, var15.field2912, var15.field2906, arg5, var15.field2960, true, arg3);
            }
        } else {
            if (var15.field2962) {
                if (arg5 == 1) {
                    int var30 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var30;
                } else if (arg5 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg5 == 3) {
                    int var27 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var27;
                }
            }
            if (arg2 == 4) {
                class60 var31;
                if (var15.field2959 == -1 && var15.field2909 == null) {
                    var31 = var15.method983(var12, var13, var11, var10, 0, (byte) 60, 4);
                } else {
                    var31 = new class67(arg9, 4, 0, var10, var11, var12, var13, var15.field2959, true, null);
                }
                arg7.method504(arg4, arg8, arg3, var14, var31, class98.field2267[arg5], arg5 * 512, 0, 0, var16, var17);
            } else if (arg2 == 5) {
                int var32 = 16;
                int var33 = arg7.method499(arg4, arg8, arg3);
                if (var33 > 0) {
                    var32 = class12.method149(var33 >> 14 & 0x7FFF, (byte) 62).field2922;
                }
                class60 var34;
                if (var15.field2959 == -1 && var15.field2909 == null) {
                    var34 = var15.method983(var12, var13, var11, var10, 0, (byte) 74, 4);
                } else {
                    var34 = new class67(arg9, 4, 0, var10, var11, var12, var13, var15.field2959, true, null);
                }
                arg7.method504(arg4, arg8, arg3, var14, var34, class98.field2267[arg5], arg5 * 512, class122.field3000[arg5] * var32, class129.field3130[arg5] * var32, var16, var17);
            } else if (arg2 == 6) {
                class60 var35;
                if (var15.field2959 == -1 && var15.field2909 == null) {
                    var35 = var15.method983(var12, var13, var11, var10, 0, (byte) 84, 4);
                } else {
                    var35 = new class67(arg9, 4, 0, var10, var11, var12, var13, var15.field2959, true, null);
                }
                arg7.method504(arg4, arg8, arg3, var14, var35, 256, arg5, 0, 0, var16, var17);
            } else if (arg2 == 7) {
                class60 var36;
                if (var15.field2959 == -1 && var15.field2909 == null) {
                    var36 = var15.method983(var12, var13, var11, var10, 0, (byte) 105, 4);
                } else {
                    var36 = new class67(arg9, 4, 0, var10, var11, var12, var13, var15.field2959, true, null);
                }
                arg7.method504(arg4, arg8, arg3, var14, var36, 512, arg5, 0, 0, var16, var17);
            } else if (arg2 == 8) {
                class60 var37;
                if (var15.field2959 == -1 && var15.field2909 == null) {
                    var37 = var15.method983(var12, var13, var11, var10, 0, (byte) 88, 4);
                } else {
                    var37 = new class67(arg9, 4, 0, var10, var11, var12, var13, var15.field2959, true, null);
                }
                arg7.method504(arg4, arg8, arg3, var14, var37, 768, arg5, 0, 0, var16, var17);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 632)
    public static void method178(int arg0) {
        field333 = null;
        field325 = null;
        field337 = null;
        field327 = null;
        field330 = null;
        field343 = null;
        field324 = null;
        field321 = null;
        field338 = null;
        field328 = null;
        field336 = null;
        int var1 = -46 % ((-arg0 - 38) / 57);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V", line = 673)
    public class16(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class18.method199((byte) 111, arg0, arg1);
            int var4 = arg1 / var3;
            this.field339 = var4;
            int var5 = arg0 / var3;
            this.field342 = var5;
            this.field322 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field322[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
