import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class14 extends class7 {

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "I")
    private int field254 = 409;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    private int field243 = 0;

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
    private int field260 = 0;

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "I")
    private int field259 = 2048;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    private int field247 = 1024;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
    private int field251 = 1024;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
    private int field258 = 1024;

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
    private int field257 = 1024;

    @OriginalMember(owner = "client!bc", name = "ob", descriptor = "I")
    private int field265 = 819;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "Z")
    public static boolean field250 = false;

    @OriginalMember(owner = "client!bc", name = "lb", descriptor = "[Log;")
    public static class146[] field262 = new class146[2048];

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "Lob;")
    public static class141 field245 = class175.method1195(40, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!bc", name = "mb", descriptor = "I")
    public static int field263 = 255;

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
    public static int field256 = 0;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!bc", name = "nb", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(BI)[B")
    public static final byte[] method87(byte arg0, int arg1) {
        if (arg0 != -43) {
            return null;
        } else {
            class163 var2 = (class163) class98.field1940.method1383((long) arg1, (byte) -74);
            ++field264;
            if (var2 == null) {
                Random var3 = new Random((long) arg1);
                byte[] var4 = new byte[512];
                for (int var5 = 0; ~var5 > -256; ++var5) {
                    var4[var5] = (byte) var5;
                }
                for (int var6 = 0; ~var6 > -256; ++var6) {
                    int var7 = 255 - var6;
                    int var8 = class209.method1367((byte) 87, var3, var7);
                    byte var9 = var4[var8];
                    var4[var8] = var4[var7];
                    var4[var7] = var4[-var6 + 511] = var9;
                }
                var2 = new class163(var4);
                class98.field1940.method1378(var2, (byte) -88, (long) arg1);
            }
            return var2.field3159;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        int[] var3 = super.field100.method842(arg1, 12);
        if (arg0 < 13) {
            field246 = 83;
        }
        ++field252;
        if (super.field100.field2534) {
            int[][] var4 = super.field100.method845(2);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = class117.field2272 * this.field258 >> 12;
            int var12 = 0;
            int var13 = 0;
            int var14 = class60.field1174 * this.field254 >> 12;
            boolean var15 = true;
            int var16 = class117.field2272 * this.field259 >> 12;
            int var17 = class60.field1174 * this.field265 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field242 = class117.field2272 / 8 * this.field251 >> 12;
                int var18 = 1 - -(class117.field2272 / var11);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field243);
                while (true) {
                    while (true) {
                        int var22 = var11 + class209.method1367((byte) 122, var21, -var11 + var16);
                        int var23 = class209.method1367((byte) 126, var21, -var14 + var17) + var14;
                        int var24 = var7 + var22;
                        if (~var24 < ~class117.field2272) {
                            var24 = class117.field2272;
                            var22 = -var7 + class117.field2272;
                        }
                        int var29;
                        if (var15) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int var26 = var24 - -var5;
                            if (~var26 > -1) {
                                var26 += class117.field2272;
                            }
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            if (~class117.field2272 > ~var26) {
                                var26 -= class117.field2272;
                            }
                            var29 = var27[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (var26 >= var30[0] && ~var30[1] <= ~var26) {
                                    if (var9 != var25) {
                                        int var31 = var5 + var7;
                                        if (~var31 > -1) {
                                            var31 += class117.field2272;
                                        }
                                        if (class117.field2272 < var31) {
                                            var31 -= class117.field2272;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var13];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; var28 >= var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var13];
                                            int var35 = var34[2];
                                            if (var29 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 >= var26) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class117.field2272;
                                                    } else {
                                                        var39 = Math.min(var26, var37);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var26, var37);
                                                }
                                                this.method92(var21, var29 - var35, var35, var4, var8 + var38, (byte) -36, -var38 + var39);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (~var25 <= ~var13) {
                                    var25 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~class60.field1174 > ~(var23 + var29)) {
                            var23 = class60.field1174 - var29;
                        } else {
                            var10 = false;
                        }
                        if (class117.field2272 != var24) {
                            int[] var41 = var19[var12++];
                            var41[0] = var7;
                            var41[2] = var29 - -var23;
                            var41[1] = var24;
                            this.method92(var21, var23, var29, var4, var6 + var7, (byte) -36, var22);
                            var7 = var24;
                        } else {
                            this.method92(var21, var23, var29, var4, var7 - -var6, (byte) -36, var22);
                            if (var10) {
                                return var3;
                            }
                            var9 = 0;
                            var10 = true;
                            var8 = var6;
                            int[][] var42 = var20;
                            int[] var43 = var19[var12++];
                            var43[1] = var24;
                            var20 = var19;
                            var43[0] = var7;
                            var43[2] = var23 + var29;
                            var19 = var42;
                            var15 = false;
                            var13 = var12;
                            var7 = 0;
                            var12 = 0;
                            var6 = class209.method1367((byte) 114, var21, class117.field2272);
                            var5 = -var8 + var6;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class117.field2272 + var5;
                            }
                            if (~var44 < ~class117.field2272) {
                                var44 -= class117.field2272;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var45[0] >= ~var44 && ~var45[1] <= ~var44) {
                                    break;
                                }
                                ++var9;
                                if (var13 <= var9) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = -80 % ((66 - arg1) / 57);
        ++field248;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field257 = arg2.method1007(67);
                                        }
                                    } else {
                                        this.field247 = arg2.method1007(60);
                                    }
                                } else {
                                    this.field260 = arg2.method991(255);
                                }
                            } else {
                                this.field251 = arg2.method1007(39);
                            }
                        } else {
                            this.field265 = arg2.method1007(113);
                        }
                    } else {
                        this.field254 = arg2.method1007(89);
                    }
                } else {
                    this.field259 = arg2.method1007(76);
                }
            } else {
                this.field258 = arg2.method1007(118);
            }
        } else {
            this.field243 = arg2.method991(255);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public static void method88(byte arg0) {
        field245 = null;
        field262 = null;
        if (arg0 != 119) {
            field263 = -19;
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        ++field244;
        if (arg0 != 1) {
            this.field265 = -37;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lse;")
    public static final class184 method89(Throwable arg0, String arg1) {
        ++field261;
        class184 var2;
        if (arg0 instanceof class184) {
            var2 = (class184) arg0;
            var2.field3599 = var2.field3599 + ' ' + arg1;
        } else {
            var2 = new class184(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lpe;Lpe;B)V")
    public static final void method90(class154 arg0, class154 arg1, byte arg2) {
        class187.field3628 = arg0;
        class181.field3548 = arg1;
        ++field255;
        if (arg2 > -84) {
            method89((Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "(I)V")
    public static final void method91(int arg0) {
        if (arg0 != 0) {
            field245 = null;
        }
        ++field253;
        try {
            if (class202.field3820 == 1) {
                int var1 = class85.field1690.method477(-76);
                if (~var1 < -1 && class85.field1690.method460(arg0 ^ 125)) {
                    int var2 = var1 - class22.field398;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class85.field1690.method493(-111, var2);
                } else {
                    class85.field1690.method472((byte) 64);
                    class85.field1690.method466(-82);
                    class39.field788 = null;
                    if (class119.field2322 == null) {
                        class202.field3820 = 0;
                    } else {
                        class202.field3820 = 2;
                    }
                    class172.field3420 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class85.field1690.method472((byte) 64);
            class39.field788 = null;
            class172.field3420 = null;
            class202.field3820 = 0;
            class119.field2322 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/util/Random;II[[IIBI)V")
    private final void method92(Random arg0, int arg1, int arg2, int[][] arg3, int arg4, byte arg5, int arg6) {
        ++field249;
        int var8 = this.field257 > 0 ? 4096 - class209.method1367((byte) 121, arg0, this.field257) : 4096;
        int var9 = this.field247 * this.field242 >> 12;
        if (arg5 != -36) {
            method90((class154) null, (class154) null, (byte) 28);
        }
        int var10 = this.field242 + -(~var9 >= -1 ? 0 : class209.method1367((byte) 87, arg0, var9));
        if (arg4 >= class117.field2272) {
            arg4 -= class117.field2272;
        }
        if (var10 > 0) {
            if (arg1 > 0 && arg6 > 0) {
                int var11 = arg6 / 2;
                int var12 = arg1 / 2;
                int var13 = ~var11 <= ~var10 ? var10 : var11;
                int var14 = arg4 + var13;
                int var15 = ~var10 < ~var12 ? var12 : var10;
                int var16 = -(var13 * 2) + arg6;
                for (int var17 = 0; ~arg1 < ~var17; ++var17) {
                    int[] var18 = arg3[arg2 + var17];
                    if (var17 < var15) {
                        int var19 = var8 * var17 / var15;
                        if (this.field260 != 0) {
                            for (int var20 = 0; ~var20 > ~var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class15.method94(arg4 - -var20, class106.field2030)] = var18[class15.method94(class106.field2030, -var20 + arg4 + arg6 + -1)] = var21 < var19 ? var21 : var19;
                            }
                        } else {
                            for (int var22 = 0; ~var13 < ~var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class15.method94(arg4 + var22, class106.field2030)] = var18[class15.method94(arg6 - var22 + arg4 + -1, class106.field2030)] = var19 * var24 >> 12;
                            }
                        }
                        if (class117.field2272 < var14 + var16) {
                            int var23 = -var14 + class117.field2272;
                            class149.method1040(var18, var14, var23, var19);
                            class149.method1040(var18, 0, -var23 + var16, var19);
                        } else {
                            class149.method1040(var18, var14, var16, var19);
                        }
                    } else {
                        int var25 = arg1 + -1 + -var17;
                        if (var15 > var25) {
                            int var26 = var8 * var25 / var15;
                            if (~this.field260 == -1) {
                                for (int var27 = 0; ~var27 > ~var13; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class15.method94(class106.field2030, arg4 + var27)] = var18[class15.method94(class106.field2030, arg4 + arg6 + -var27 + -1)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class15.method94(arg4 + var29, class106.field2030)] = var18[class15.method94(-var29 + -1 + arg4 + arg6, class106.field2030)] = ~var26 >= ~var31 ? var26 : var31;
                                }
                            }
                            if (~class117.field2272 <= ~(var14 + var16)) {
                                class149.method1040(var18, var14, var16, var26);
                            } else {
                                int var30 = -var14 + class117.field2272;
                                class149.method1040(var18, var14, var30, var26);
                                class149.method1040(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var13 > var32; ++var32) {
                                var18[class15.method94(arg4 + var32, class106.field2030)] = var18[class15.method94(-var32 + arg4 - 1 + arg6, class106.field2030)] = var8 * var32 / var13;
                            }
                            if (~(var14 + var16) >= ~class117.field2272) {
                                class149.method1040(var18, var14, var16, var8);
                            } else {
                                int var33 = class117.field2272 - var14;
                                class149.method1040(var18, var14, var33, var8);
                                class149.method1040(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (class117.field2272 >= arg4 - -arg6) {
            for (int var34 = 0; var34 < arg1; ++var34) {
                class149.method1040(arg3[arg2 + var34], arg4, arg6, var8);
            }
        } else {
            int var35 = -arg4 + class117.field2272;
            for (int var36 = 0; ~arg1 < ~var36; ++var36) {
                int[] var37 = arg3[arg2 + var36];
                class149.method1040(var37, arg4, var35, var8);
                class149.method1040(var37, 0, -var35 + arg6, var8);
            }
        }
    }
}
