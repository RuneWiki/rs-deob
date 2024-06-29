import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class263 extends class30 {

    @OriginalMember(owner = "client!wr", name = "V", descriptor = "I")
    private int field4238 = 1024;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
    private int field4230 = 0;

    @OriginalMember(owner = "client!wr", name = "Z", descriptor = "I")
    private int field4242 = 409;

    @OriginalMember(owner = "client!wr", name = "T", descriptor = "I")
    private int field4236 = 1024;

    @OriginalMember(owner = "client!wr", name = "S", descriptor = "I")
    private int field4235 = 819;

    @OriginalMember(owner = "client!wr", name = "W", descriptor = "I")
    private int field4239 = 0;

    @OriginalMember(owner = "client!wr", name = "bb", descriptor = "I")
    private int field4244 = 1024;

    @OriginalMember(owner = "client!wr", name = "fb", descriptor = "I")
    private int field4248 = 2048;

    @OriginalMember(owner = "client!wr", name = "hb", descriptor = "I")
    private int field4250 = 1024;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4231 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!wr", name = "ab", descriptor = "I")
    public static int field4243 = 0;

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "[[I")
    public static int[][] field4234 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!wr", name = "db", descriptor = "I")
    public static int field4246 = -9017772;

    @OriginalMember(owner = "client!wr", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field4249 = "Stellar Dawn is loading - please wait...";

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!wr", name = "Q", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!wr", name = "X", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!wr", name = "Y", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!wr", name = "cb", descriptor = "I")
    private int field4245;

    @OriginalMember(owner = "client!wr", name = "eb", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZB)V")
    public static final void method1801(boolean arg0, byte arg1) {
        ++field4233;
        if (arg1 >= -105) {
            method1804(-112);
        }
        byte var2;
        byte[][] var3;
        if (arg0) {
            var2 = 1;
            var3 = class376.field5690;
        } else {
            var3 = class254.field4123;
            var2 = 4;
        }
        int var4 = var3.length;
        for (int var5 = 0; var4 > var5; ++var5) {
            int[] var11 = null;
            byte[] var12 = var3[var5];
            int var13 = class52.field640[var5] >> 8;
            int var14 = 255 & class52.field640[var5];
            int var15 = var13 * 64 - class409.field6048;
            int var16 = var14 * 64 + -class444.field6481;
            if (var12 != null) {
                class409.method2566(true);
                var11 = class97.method729(arg0, 0, class162.field2547, var12, class444.field6481, class284.field4547, class409.field6048, var15, var16, var2);
            }
            if (!arg0 && class418.field6195 / 8 == var13 && class222.field3698 / 8 == var14) {
                if (var11 == null) {
                    class221.field3677 = null;
                } else {
                    class221.field3677 = class221.method1583(var11[0], var11[1], (byte) -2, var11[3], var11[2]);
                    class297.field4727 = var11[4];
                }
            }
        }
        for (int var6 = 0; ~var4 < ~var6; ++var6) {
            int var7 = (class52.field640[var6] >> 8) * 64 + -class409.field6048;
            int var8 = (255 & class52.field640[var6]) * 64 + -class444.field6481;
            byte[] var9 = var3[var6];
            if (var9 == null && ~class222.field3698 > -801) {
                class409.method2566(true);
                for (int var10 = 0; ~var10 > ~var2; ++var10) {
                    class183.method1250(var10, 64, true, 64, var8, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
    public class263() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIB[[ILjava/util/Random;II)V")
    private final void method1802(int arg0, int arg1, byte arg2, int[][] arg3, Random arg4, int arg5, int arg6) {
        ++field4229;
        int var8 = ~this.field4236 >= -1 ? 4096 : -class105.method797(arg4, -54, this.field4236) + 4096;
        int var9 = this.field4245 * this.field4244 >> 12;
        int var10 = this.field4245 + -(~var9 < -1 ? class105.method797(arg4, -23, var9) : 0);
        if (class369.field5610 <= arg1) {
            arg1 -= class369.field5610;
        }
        if (var10 > 0) {
            if (~arg0 >= -1 || ~arg6 >= -1) {
                return;
            }
            int var11 = arg6 / 2;
            int var12 = arg0 / 2;
            int var13 = var10 > var11 ? var11 : var10;
            int var14 = var10 <= var12 ? var10 : var12;
            int var15 = arg1 - -var13;
            int var16 = -(var13 * 2) + arg6;
            for (int var17 = 0; ~var17 > ~arg0; ++var17) {
                int[] var18 = arg3[arg5 + var17];
                if (~var17 > ~var14) {
                    int var19 = var8 * var17 / var14;
                    if (this.field4239 == 0) {
                        for (int var20 = 0; var13 > var20; ++var20) {
                            int var21 = var8 * var20 / var13;
                            var18[class37.method242(class106.field1492, arg1 + var20)] = var18[class37.method242(class106.field1492, -var20 + -1 + arg1 + arg6)] = var19 * var21 >> 12;
                        }
                    } else {
                        for (int var22 = 0; var22 < var13; ++var22) {
                            int var24 = var8 * var22 / var13;
                            var18[class37.method242(arg1 + var22, class106.field1492)] = var18[class37.method242(arg1 - 1 + arg6 + -var22, class106.field1492)] = ~var24 <= ~var19 ? var19 : var24;
                        }
                    }
                    if (var15 + var16 > class369.field5610) {
                        int var23 = -var15 + class369.field5610;
                        class408.method2558(var18, var15, var23, var19);
                        class408.method2558(var18, 0, -var23 + var16, var19);
                    } else {
                        class408.method2558(var18, var15, var16, var19);
                    }
                } else {
                    int var25 = -var17 + arg0 + -1;
                    if (~var25 > ~var14) {
                        int var26 = var8 * var25 / var14;
                        if (~this.field4239 == -1) {
                            for (int var27 = 0; ~var27 > ~var13; ++var27) {
                                int var28 = var8 * var27 / var13;
                                var18[class37.method242(class106.field1492, arg1 + var27)] = var18[class37.method242(class106.field1492, arg1 + arg6 - var27 + -1)] = var26 * var28 >> 12;
                            }
                        } else {
                            for (int var29 = 0; var29 < var13; ++var29) {
                                int var31 = var8 * var29 / var13;
                                var18[class37.method242(arg1 + var29, class106.field1492)] = var18[class37.method242(class106.field1492, -var29 + -1 + arg1 + arg6)] = ~var31 <= ~var26 ? var26 : var31;
                            }
                        }
                        if (class369.field5610 < var15 + var16) {
                            int var30 = -var15 + class369.field5610;
                            class408.method2558(var18, var15, var30, var26);
                            class408.method2558(var18, 0, -var30 + var16, var26);
                        } else {
                            class408.method2558(var18, var15, var16, var26);
                        }
                    } else {
                        for (int var32 = 0; var32 < var13; ++var32) {
                            var18[class37.method242(class106.field1492, arg1 + var32)] = var18[class37.method242(class106.field1492, arg1 + -1 - -arg6 - var32)] = var8 * var32 / var13;
                        }
                        if (~(var15 + var16) >= ~class369.field5610) {
                            class408.method2558(var18, var15, var16, var8);
                        } else {
                            int var33 = -var15 + class369.field5610;
                            class408.method2558(var18, var15, var33, var8);
                            class408.method2558(var18, 0, var16 - var33, var8);
                        }
                    }
                }
            }
        } else if (~class369.field5610 <= ~(arg1 + arg6)) {
            for (int var34 = 0; ~var34 > ~arg0; ++var34) {
                class408.method2558(arg3[arg5 - -var34], arg1, arg6, var8);
            }
        } else {
            int var35 = -arg1 + class369.field5610;
            for (int var36 = 0; ~arg0 < ~var36; ++var36) {
                int[] var38 = arg3[arg5 + var36];
                class408.method2558(var38, arg1, var35, var8);
                class408.method2558(var38, 0, -var35 + arg6, var8);
            }
        }
        int var37 = -10 / ((arg2 - -3) / 32);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field4232;
        int[] var3 = super.field371.method2367((byte) -111, arg0);
        if (super.field371.field5586) {
            int[][] var4 = super.field371.method2364(19215);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class369.field5610 * this.field4238 >> 12;
            int var15 = class369.field5610 * this.field4248 >> 12;
            int var16 = class312.field4921 * this.field4242 >> 12;
            int var17 = class312.field4921 * this.field4235 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            }
            this.field4245 = class369.field5610 / 8 * this.field4250 >> 12;
            int var18 = class369.field5610 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field4230);
            label126: while (true) {
                while (true) {
                    int var22 = class105.method797(var21, -122, -var14 + var15) + var14;
                    int var23 = class105.method797(var21, -35, -var16 + var17) + var16;
                    int var24 = var8 + var22;
                    if (var24 > class369.field5610) {
                        var22 = -var8 + class369.field5610;
                        var24 = class369.field5610;
                    }
                    int var29;
                    if (var11) {
                        var29 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var5 + var24;
                        if (var28 < 0) {
                            var28 += class369.field5610;
                        }
                        if (~var28 < ~class369.field5610) {
                            var28 -= class369.field5610;
                        }
                        var29 = var26[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (~var30[0] >= ~var28 && ~var30[1] <= ~var28) {
                                if (var9 != var25) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class369.field5610;
                                    }
                                    if (~class369.field5610 > ~var31) {
                                        var31 -= class369.field5610;
                                    }
                                    for (int var32 = 1; var27 >= var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; var33 <= var27; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var29 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var28 <= var31) {
                                                if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class369.field5610;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            }
                                            this.method1802(-var35 + var29, var7 + var38, (byte) 44, var4, var21, var35, var39 - var38);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var27;
                            int var10000 = ~var12;
                            ++var25;
                            if (var10000 >= ~var25) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~class312.field4921 > ~(var23 + var29)) {
                        var23 = class312.field4921 - var29;
                    } else {
                        var10 = false;
                    }
                    if (~class369.field5610 != ~var24) {
                        int[] var41 = var19[var13++];
                        var41[2] = var23 + var29;
                        var41[1] = var24;
                        var41[0] = var8;
                        this.method1802(var23, var6 + var8, (byte) -56, var4, var21, var29, var22);
                        var8 = var24;
                    } else {
                        this.method1802(var23, var8 - -var6, (byte) 38, var4, var21, var29, var22);
                        if (var10) {
                            break label126;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[1] = var24;
                        var42[0] = var8;
                        var42[2] = var23 + var29;
                        int[][] var43 = var20;
                        var20 = var19;
                        var19 = var43;
                        var12 = var13;
                        var7 = var6;
                        var13 = 0;
                        var6 = class105.method797(var21, -79, class369.field5610);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var44 = var5;
                        if (~var5 > -1) {
                            var44 = class369.field5610 + var5;
                        }
                        var9 = 0;
                        if (~class369.field5610 > ~var44) {
                            var44 -= class369.field5610;
                        }
                        while (true) {
                            int[] var45 = var20[var9];
                            if (~var45[0] >= ~var44 && ~var45[1] <= ~var44) {
                                var11 = false;
                                break;
                            }
                            ++var9;
                            if (~var9 <= ~var12) {
                                var9 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 < 49) {
            method1804(97);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V")
    public static final void method1803(int arg0) {
        for (class418 var1 = (class418) class86.field1089.method253((byte) -6); var1 != null; var1 = (class418) class86.field1089.method247((byte) -118)) {
            if (class212.method1494(var1.field6192, 953622695)) {
                class245.method1709((byte) 83, var1);
            }
        }
        if (arg0 < 12) {
            method1801(true, (byte) -110);
        }
        ++field4227;
        if (~class144.field2267 == -2) {
            class262.field4214 = false;
            class59.method389(class27.field315, class186.field3064, class75.field949, class427.field6299, (byte) -112);
        } else {
            class59.method389(class27.field315, class186.field3064, class75.field949, class427.field6299, (byte) -65);
            int var2 = class413.field6111.method2162(class343.field5291, -84);
            for (class418 var3 = (class418) class86.field1089.method253((byte) -6); var3 != null; var3 = (class418) class86.field1089.method247((byte) -120)) {
                int var4 = class41.method276(-11133, var3);
                if (~var2 > ~var4) {
                    var2 = var4;
                }
            }
            class186.field3064 = class144.field2267 * 16 - -(!class61.field786 ? 22 : 26);
            class427.field6299 = var2 + 8;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        ++field4247;
        if (arg1 == 6456) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (arg2 != 6) {
                                        if (~arg2 != -8) {
                                            if (~arg2 == -9) {
                                                this.field4236 = arg0.method1272((byte) -51);
                                            }
                                        } else {
                                            this.field4244 = arg0.method1272((byte) -61);
                                        }
                                    } else {
                                        this.field4239 = arg0.method1322(false);
                                    }
                                } else {
                                    this.field4250 = arg0.method1272((byte) -104);
                                }
                            } else {
                                this.field4235 = arg0.method1272((byte) -75);
                            }
                        } else {
                            this.field4242 = arg0.method1272((byte) -65);
                        }
                    } else {
                        this.field4248 = arg0.method1272((byte) -112);
                    }
                } else {
                    this.field4238 = arg0.method1272((byte) -106);
                }
            } else {
                this.field4230 = arg0.method1322(false);
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "(I)V")
    public static final void method1804(int arg0) {
        ++field4237;
        class52 var1 = class329.field5155;
        synchronized (class329.field5155) {
            class329.field5155.method335((byte) -60);
            if (arg0 > -124) {
                field4246 = 50;
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)V")
    public final void method111(byte arg0) {
        if (arg0 <= 90) {
            this.field4238 = -1;
        }
        ++field4228;
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(B)V")
    public static void method1805(byte arg0) {
        int var1 = -34 % ((arg0 - 33) / 38);
        field4231 = null;
        field4234 = null;
        field4249 = null;
    }
}
