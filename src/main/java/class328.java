import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class328 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public int field4365 = -1;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Luc;")
    private class58 field4371;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Ljava/lang/String;")
    private String field4364;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Ljava/lang/String;")
    private String field4369;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "[I")
    private int[] field4367;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
    private int[] field4368;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "[I")
    private int[] field4372;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[I")
    private int[] field4373;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[I")
    private int[] field4374;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "[I")
    private int[] field4377;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[I")
    private int[] field4378;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "[I")
    private int[] field4382;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field4366;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field4385;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[[I")
    private int[][] field4375;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "[[I")
    private int[][] field4383;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "[[I")
    private int[][] field4384;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public final void method1878(byte arg0) {
        int var2 = -11 / ((20 - arg0) / 50);
        if (this.field4369 == null) {
            this.field4369 = this.field4364;
        }
        field4386++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IILtq;)V")
    private final void method1879(int arg0, int arg1, class250 arg2) {
        field4370++;
        int var4 = -74 % ((-arg1 - 33) / 60);
        if (arg0 == 1) {
            this.field4364 = arg2.method1361(16405);
        } else if (arg0 == 2) {
            this.field4369 = arg2.method1361(16405);
        } else if (arg0 == 3) {
            int var5 = arg2.method1350(31351);
            this.field4384 = new int[var5][3];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4384[var6][0] = arg2.method1374(-2);
                this.field4384[var6][1] = arg2.method1359(255);
                this.field4384[var6][2] = arg2.method1359(255);
            }
        } else if (arg0 == 4) {
            int var7 = arg2.method1350(31351);
            this.field4375 = new int[var7][3];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4375[var8][0] = arg2.method1374(-2);
                this.field4375[var8][1] = arg2.method1359(255);
                this.field4375[var8][2] = arg2.method1359(255);
            }
        } else if (arg0 == 5) {
            arg2.method1374(-2);
        } else if (arg0 == 6) {
            arg2.method1350(31351);
        } else if (arg0 == 7) {
            arg2.method1350(31351);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg2.method1350(31351);
                return;
            }
            if (arg0 == 10) {
                int var9 = arg2.method1350(31351);
                this.field4367 = new int[var9];
                for (int var10 = 0; var10 < var9; var10++) {
                    this.field4367[var10] = arg2.method1359(255);
                }
                return;
            }
            if (arg0 == 12) {
                arg2.method1359(255);
                return;
            }
            if (arg0 != 13) {
                if (arg0 == 14) {
                    int var11 = arg2.method1350(31351);
                    this.field4383 = new int[var11][2];
                    for (int var12 = 0; var12 < var11; var12++) {
                        this.field4383[var12][0] = arg2.method1350(31351);
                        this.field4383[var12][1] = arg2.method1350(31351);
                    }
                    return;
                }
                if (arg0 == 15) {
                    arg2.method1374(-2);
                    return;
                }
                if (arg0 == 17) {
                    this.field4365 = arg2.method1374(-2);
                    return;
                }
                if (arg0 != 18) {
                    if (arg0 == 19) {
                        int var19 = arg2.method1350(31351);
                        this.field4377 = new int[var19];
                        this.field4378 = new int[var19];
                        this.field4374 = new int[var19];
                        this.field4366 = new String[var19];
                        for (int var20 = 0; var20 < var19; var20++) {
                            this.field4378[var20] = arg2.method1359(255);
                            this.field4374[var20] = arg2.method1359(255);
                            this.field4377[var20] = arg2.method1359(255);
                            this.field4366[var20] = arg2.method1349(-1754884856);
                        }
                    } else if (arg0 == 249) {
                        int var13 = arg2.method1350(31351);
                        if (this.field4371 == null) {
                            int var14 = class322.method1853(103, var13);
                            this.field4371 = new class58(var14);
                        }
                        for (int var15 = 0; var15 < var13; var15++) {
                            boolean var16 = arg2.method1350(31351) == 1;
                            int var17 = arg2.method1372(-2);
                            class338 var18;
                            if (var16) {
                                var18 = new class195(arg2.method1349(-1754884856));
                            } else {
                                var18 = new class310(arg2.method1359(255));
                            }
                            this.field4371.method314((long) var17, var18, 7079);
                        }
                        return;
                    }
                    return;
                }
                int var21 = arg2.method1350(31351);
                this.field4382 = new int[var21];
                this.field4368 = new int[var21];
                this.field4373 = new int[var21];
                this.field4385 = new String[var21];
                for (int var22 = 0; var22 < var21; var22++) {
                    this.field4382[var22] = arg2.method1359(255);
                    this.field4368[var22] = arg2.method1359(255);
                    this.field4373[var22] = arg2.method1359(255);
                    this.field4385[var22] = arg2.method1349(-1754884856);
                }
                return;
            }
            int var23 = arg2.method1350(31351);
            this.field4372 = new int[var23];
            for (int var24 = 0; var24 < var23; var24++) {
                this.field4372[var24] = arg2.method1374(-2);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILtq;)V")
    public final void method1880(int arg0, class250 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1350(31351);
            if (var3 == 0) {
                field4379++;
                return;
            }
            this.method1879(var3, 73, arg1);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z")
    public static final boolean method1881(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class68.field706; var3++) {
            class427 var4 = class176.field2208[var3];
            if (var4.field6278 == 1) {
                int var5 = var4.field6256 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field6273 * var5 >> 8) + var4.field6254;
                    int var7 = (var4.field6270 * var5 >> 8) + var4.field6261;
                    int var8 = (var4.field6266 * var5 >> 8) + var4.field6265;
                    int var9 = (var4.field6257 * var5 >> 8) + var4.field6271;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field6278 == 2) {
                int var10 = arg0 - var4.field6256;
                if (var10 > 0) {
                    int var11 = (var4.field6273 * var10 >> 8) + var4.field6254;
                    int var12 = (var4.field6270 * var10 >> 8) + var4.field6261;
                    int var13 = (var4.field6266 * var10 >> 8) + var4.field6265;
                    int var14 = (var4.field6257 * var10 >> 8) + var4.field6271;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field6278 == 3) {
                int var15 = var4.field6254 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field6267 * var15 >> 8) + var4.field6256;
                    int var17 = (var4.field6277 * var15 >> 8) + var4.field6272;
                    int var18 = (var4.field6266 * var15 >> 8) + var4.field6265;
                    int var19 = (var4.field6257 * var15 >> 8) + var4.field6271;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field6278 == 4) {
                int var20 = arg2 - var4.field6254;
                if (var20 > 0) {
                    int var21 = (var4.field6267 * var20 >> 8) + var4.field6256;
                    int var22 = (var4.field6277 * var20 >> 8) + var4.field6272;
                    int var23 = (var4.field6266 * var20 >> 8) + var4.field6265;
                    int var24 = (var4.field6257 * var20 >> 8) + var4.field6271;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field6278 == 5) {
                int var25 = arg1 - var4.field6265;
                if (var25 > 0) {
                    int var26 = (var4.field6267 * var25 >> 8) + var4.field6256;
                    int var27 = (var4.field6277 * var25 >> 8) + var4.field6272;
                    int var28 = (var4.field6273 * var25 >> 8) + var4.field6254;
                    int var29 = (var4.field6270 * var25 >> 8) + var4.field6261;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class125.method677((byte) 119, arg4);
        field4380++;
        int var7 = 0;
        int var8 = arg4 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg6 > -18) {
            method1881(-101, -97, -80);
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class153.field1932[arg5];
        int var16 = arg2 - var8;
        class296.method1740(arg2 - arg4, var15, (byte) 81, arg0, var16);
        int var17 = arg2 + var8;
        class296.method1740(var16, var15, (byte) 81, arg3, var17);
        class296.method1740(var17, var15, (byte) 81, arg0, arg2 + arg4);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class427.field6263[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var18 = class153.field1932[arg5 + var9];
                    int[] var19 = class153.field1932[arg5 - var9];
                    int var20 = class427.field6263[var9];
                    int var21 = arg2 + var7;
                    int var22 = arg2 - var7;
                    int var23 = arg2 + var20;
                    int var24 = arg2 - var20;
                    class296.method1740(var22, var18, (byte) 81, arg0, var24);
                    class296.method1740(var24, var18, (byte) 81, arg3, var23);
                    class296.method1740(var23, var18, (byte) 81, arg0, var21);
                    class296.method1740(var22, var19, (byte) 81, arg0, var24);
                    class296.method1740(var24, var19, (byte) 81, arg3, var23);
                    class296.method1740(var23, var19, (byte) 81, arg0, var21);
                } else {
                    int[] var25 = class153.field1932[arg5 + var9];
                    int[] var26 = class153.field1932[arg5 - var9];
                    int var27 = arg2 + var7;
                    int var28 = arg2 - var7;
                    class296.method1740(var28, var25, (byte) 81, arg0, var27);
                    class296.method1740(var28, var26, (byte) 81, arg0, var27);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class153.field1932[arg5 + var7];
            int[] var30 = class153.field1932[arg5 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var7 < var8) {
                int var33 = var11 >= var7 ? var11 : class427.field6263[var7];
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class296.method1740(var32, var29, (byte) 81, arg0, var35);
                class296.method1740(var35, var29, (byte) 81, arg3, var34);
                class296.method1740(var34, var29, (byte) 81, arg0, var31);
                class296.method1740(var32, var30, (byte) 81, arg0, var35);
                class296.method1740(var35, var30, (byte) 81, arg3, var34);
                class296.method1740(var34, var30, (byte) 81, arg0, var31);
            } else {
                class296.method1740(var32, var29, (byte) 81, arg0, var31);
                class296.method1740(var32, var30, (byte) 81, arg0, var31);
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static final void method1883(int arg0) {
        field4381++;
        if (class88.field1003 != null) {
            class171.field2154.method989(1);
            class380.method2330();
            class116.method630((byte) -60);
            class206.method1116((byte) -59);
            class341.method1992(-111);
            class57.method303((byte) 82);
            if (class318.field4233 != null) {
                class318.field4233.method1188((byte) 126);
            }
            class18.method85(-2720);
            class80.method443(23574);
            class88.method485(17802);
            class208.method1127(false, -121);
            class38.method184((byte) 21);
            for (int var1 = 0; var1 < 2048; var1++) {
                class158 var5 = class85.field957[var1];
                if (var5 != null) {
                    var5.field6114 = null;
                    for (int var6 = 0; var6 < var5.field6120.length; var6++) {
                        var5.field6120[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class38.field397.length; var2++) {
                class91 var3 = class38.field397[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field6120.length; var4++) {
                        var3.field6120[var4] = null;
                    }
                }
            }
            class88.field1003.method1855((byte) 122);
            class88.field1003 = null;
        }
        if (arg0 <= 83) {
            method1881(-36, 117, 108);
        }
    }
}
