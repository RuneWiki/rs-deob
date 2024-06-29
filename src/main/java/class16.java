import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 extends class264 {

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    private int field212 = 1024;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    private int field220 = 409;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    private int field219 = 0;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    private int field213 = 819;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
    private int field225 = 0;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    private int field218 = 2048;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
    private int field228 = 1024;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    private int field215 = 1024;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    private int field222 = 1024;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "Lcf;")
    public static class93 field211 = class147.method1066("sch-Utteln:", -48);

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class16() {
        super(0, true);
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public static final void method76(int arg0) {
        ++field221;
        if (arg0 > -16) {
            field227 = -96;
        }
        for (class214 var1 = (class214) class255.field4610.method132((byte) 103); var1 != null; var1 = (class214) class255.field4610.method136(81)) {
            int var2 = var1.field3912;
            if (class146.method1062((byte) -103, var2)) {
                boolean var3 = true;
                class181[] var4 = class6.field82[var2];
                for (int var5 = 0; var5 < var4.length; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3307;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field4006;
                    class181 var7 = client.method1114(-20985, var6);
                    if (var7 != null) {
                        class254.method1731(var7, (byte) -113);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILjava/util/Random;IIB[[I)V")
    private final void method77(int arg0, int arg1, Random arg2, int arg3, int arg4, byte arg5, int[][] arg6) {
        int var8 = ~this.field222 < -1 ? -class42.method238(arg2, false, this.field222) + 4096 : 4096;
        ++field217;
        int var9 = this.field228 * this.field223 >> 12;
        int var10 = this.field223 - (~var9 >= -1 ? 0 : class42.method238(arg2, false, var9));
        if (~arg0 <= ~class176.field3060) {
            arg0 -= class176.field3060;
        }
        int var11 = 50 / ((87 - arg5) / 38);
        if (var10 <= 0) {
            if (~(arg0 - -arg4) < ~class176.field3060) {
                int var12 = -arg0 + class176.field3060;
                for (int var13 = 0; var13 < arg1; ++var13) {
                    int[] var14 = arg6[arg3 + var13];
                    class107.method773(var14, arg0, var12, var8);
                    class107.method773(var14, 0, arg4 - var12, var8);
                }
            } else {
                for (int var15 = 0; arg1 > var15; ++var15) {
                    class107.method773(arg6[arg3 + var15], arg0, arg4, var8);
                }
            }
        } else if (arg1 > 0 && arg4 > 0) {
            int var16 = arg4 / 2;
            int var17 = ~var10 < ~var16 ? var16 : var10;
            int var18 = arg0 + var17;
            int var19 = arg1 / 2;
            int var20 = var10 > var19 ? var19 : var10;
            int var21 = -(var17 * 2) + arg4;
            for (int var22 = 0; ~arg1 < ~var22; ++var22) {
                int[] var23 = arg6[var22 - -arg3];
                if (var20 > var22) {
                    int var24 = var8 * var22 / var20;
                    if (this.field219 != 0) {
                        for (int var25 = 0; var25 < var17; ++var25) {
                            int var26 = var8 * var25 / var17;
                            var23[class58.method333(class55.field910, arg0 + var25)] = var23[class58.method333(-var25 + arg4 + arg0 + -1, class55.field910)] = ~var26 <= ~var24 ? var24 : var26;
                        }
                    } else {
                        for (int var27 = 0; var17 > var27; ++var27) {
                            int var29 = var8 * var27 / var17;
                            var23[class58.method333(arg0 + var27, class55.field910)] = var23[class58.method333(arg0 + arg4 - (var27 - -1), class55.field910)] = var24 * var29 >> 12;
                        }
                    }
                    if (~class176.field3060 <= ~(var18 + var21)) {
                        class107.method773(var23, var18, var21, var24);
                    } else {
                        int var28 = -var18 + class176.field3060;
                        class107.method773(var23, var18, var28, var24);
                        class107.method773(var23, 0, -var28 + var21, var24);
                    }
                } else {
                    int var30 = arg1 + -1 + -var22;
                    if (var30 < var20) {
                        int var31 = var8 * var30 / var20;
                        if (this.field219 == 0) {
                            for (int var32 = 0; ~var32 > ~var17; ++var32) {
                                int var33 = var8 * var32 / var17;
                                var23[class58.method333(class55.field910, arg0 + var32)] = var23[class58.method333(class55.field910, arg4 + -1 + arg0 + -var32)] = var31 * var33 >> 12;
                            }
                        } else {
                            for (int var34 = 0; var34 < var17; ++var34) {
                                int var36 = var8 * var34 / var17;
                                var23[class58.method333(class55.field910, arg0 + var34)] = var23[class58.method333(arg0 + arg4 - (var34 - -1), class55.field910)] = ~var31 < ~var36 ? var36 : var31;
                            }
                        }
                        if (var18 + var21 <= class176.field3060) {
                            class107.method773(var23, var18, var21, var31);
                        } else {
                            int var35 = class176.field3060 - var18;
                            class107.method773(var23, var18, var35, var31);
                            class107.method773(var23, 0, var21 - var35, var31);
                        }
                    } else {
                        for (int var37 = 0; var17 > var37; ++var37) {
                            var23[class58.method333(class55.field910, arg0 + var37)] = var23[class58.method333(arg0 - -arg4 + -var37 + -1, class55.field910)] = var8 * var37 / var17;
                        }
                        if (var18 + var21 <= class176.field3060) {
                            class107.method773(var23, var18, var21, var8);
                        } else {
                            int var38 = class176.field3060 - var18;
                            class107.method773(var23, var18, var38, var8);
                            class107.method773(var23, 0, -var38 + var21, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field214;
        if (arg1 >= -83) {
            this.field219 = -68;
        }
        int[] var3 = super.field4716.method532((byte) 86, arg0);
        if (super.field4716.field1424) {
            int var4 = 0;
            int[][] var5 = super.field4716.method534(1);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class176.field3060 * this.field215 >> 12;
            int var15 = class176.field3060 * this.field218 >> 12;
            int var16 = class67.field1231 * this.field220 >> 12;
            int var17 = class67.field1231 * this.field213 >> 12;
            if (var17 <= 1) {
                return var5[arg0];
            } else {
                this.field223 = class176.field3060 / 8 * this.field212 >> 12;
                int var18 = class176.field3060 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field225);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class42.method238(var21, false, -var14 + var15);
                        int var23 = var16 - -class42.method238(var21, false, var17 - var16);
                        int var24 = var7 - -var22;
                        if (var24 > class176.field3060) {
                            var22 = -var7 + class176.field3060;
                            var24 = class176.field3060;
                        }
                        int var26;
                        if (var11) {
                            var26 = 0;
                        } else {
                            int[] var25 = var20[var8];
                            var26 = var25[2];
                            int var27 = var8;
                            int var28 = 0;
                            int var29 = var4 + var24;
                            if (~var29 > -1) {
                                var29 += class176.field3060;
                            }
                            if (~class176.field3060 > ~var29) {
                                var29 -= class176.field3060;
                            }
                            while (true) {
                                int[] var30 = var20[var27];
                                if (var30[0] <= var29 && ~var30[1] <= ~var29) {
                                    if (var8 != var27) {
                                        int var31 = var4 + var7;
                                        if (var31 < 0) {
                                            var31 += class176.field3060;
                                        }
                                        if (~class176.field3060 > ~var31) {
                                            var31 -= class176.field3060;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var8 + var32) % var12];
                                            var26 = Math.max(var26, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var28; ++var33) {
                                            int[] var34 = var20[(var8 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var26 != var35) {
                                                int var36 = var34[1];
                                                int var37 = var34[0];
                                                int var38;
                                                int var39;
                                                if (~var29 < ~var31) {
                                                    var38 = Math.max(var31, var37);
                                                    var39 = Math.min(var29, var36);
                                                } else if (var37 != 0) {
                                                    var38 = Math.max(var31, var37);
                                                    var39 = class176.field3060;
                                                } else {
                                                    var39 = Math.min(var29, var36);
                                                    var38 = 0;
                                                }
                                                this.method77(var9 + var38, var26 - var35, var21, var35, -var38 + var39, (byte) -64, var5);
                                            }
                                        }
                                    }
                                    var8 = var27;
                                    break;
                                }
                                int var10000 = ~var12;
                                ++var27;
                                if (var10000 >= ~var27) {
                                    var27 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (var23 + var26 <= class67.field1231) {
                            var10 = false;
                        } else {
                            var23 = -var26 + class67.field1231;
                        }
                        if (~class176.field3060 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var26;
                            var41[0] = var7;
                            var41[1] = var24;
                            this.method77(var6 + var7, var23, var21, var26, var22, (byte) -1, var5);
                            var7 = var24;
                        } else {
                            this.method77(var6 + var7, var23, var21, var26, var22, (byte) -60, var5);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            var11 = false;
                            int[] var42 = var19[var13++];
                            var42[1] = var24;
                            var42[2] = var23 + var26;
                            var8 = 0;
                            var42[0] = var7;
                            var9 = var6;
                            var6 = class42.method238(var21, false, class176.field3060);
                            int[][] var43 = var20;
                            var12 = var13;
                            var4 = -var9 + var6;
                            var20 = var19;
                            int var44 = var4;
                            var19 = var43;
                            if (~var4 > -1) {
                                var44 = class176.field3060 + var4;
                            }
                            var13 = 0;
                            if (class176.field3060 < var44) {
                                var44 -= class176.field3060;
                            }
                            var7 = 0;
                            while (true) {
                                int[] var45 = var20[var8];
                                if (var44 >= var45[0] && ~var45[1] <= ~var44) {
                                    break;
                                }
                                ++var8;
                                if (~var8 <= ~var12) {
                                    var8 = 0;
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

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 < 11) {
            this.method64(-79);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field222 = arg2.method1891(-116);
                                        }
                                    } else {
                                        this.field228 = arg2.method1891(-117);
                                    }
                                } else {
                                    this.field219 = arg2.method1907(16832);
                                }
                            } else {
                                this.field212 = arg2.method1891(-121);
                            }
                        } else {
                            this.field213 = arg2.method1891(-124);
                        }
                    } else {
                        this.field220 = arg2.method1891(-114);
                    }
                } else {
                    this.field218 = arg2.method1891(-119);
                }
            } else {
                this.field215 = arg2.method1891(-118);
            }
        } else {
            this.field225 = arg2.method1907(16832);
        }
        ++field210;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V")
    public static void method78(byte arg0) {
        if (arg0 <= 117) {
            field216 = 116;
        }
        field211 = null;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field224;
        if (arg0 != -3) {
            field211 = null;
        }
    }
}
