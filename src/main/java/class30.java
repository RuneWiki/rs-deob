import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class30 extends class34 {

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    private int field453 = 1024;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    private int field449 = 0;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    private int field455 = 409;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    private int field450 = 1024;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    private int field459 = 1024;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    private int field463 = 819;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    private int field461 = 0;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    private int field466 = 1024;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    private int field465 = 2048;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "Lkc;")
    public static class157 field457 = new class157("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field451;
        int[] var3 = super.field537.method1780(arg0, (byte) 45);
        if (super.field537.field4191) {
            int[][] var4 = super.field537.method1781(false);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class383.field5502 * this.field453 >> 12;
            int var15 = class383.field5502 * this.field465 >> 12;
            int var16 = class494.field7150 * this.field455 >> 12;
            int var17 = class494.field7150 * this.field463 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            }
            this.field464 = class383.field5502 / 8 * this.field450 >> 12;
            int var18 = 1 - -(class383.field5502 / var14);
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field461);
            label128: while (true) {
                while (true) {
                    int var22 = var14 - -class322.method1908(var15 - var14, -128, var21);
                    int var23 = var16 + class322.method1908(-var16 + var17, -128, var21);
                    int var24 = var8 + var22;
                    if (~var24 < ~class383.field5502) {
                        var22 = class383.field5502 - var8;
                        var24 = class383.field5502;
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
                            var28 += class383.field5502;
                        }
                        if (class383.field5502 < var28) {
                            var28 -= class383.field5502;
                        }
                        var29 = var26[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (~var30[0] >= ~var28 && var30[1] >= var28) {
                                if (var9 != var25) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class383.field5502;
                                    }
                                    if (var31 > class383.field5502) {
                                        var31 -= class383.field5502;
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
                                            if (var31 >= var28) {
                                                if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class383.field5502;
                                                } else {
                                                    var39 = Math.min(var28, var37);
                                                    var38 = 0;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            }
                                            this.method223(-var38 + var39, var4, var21, true, var35, -var35 + var29, var38 - -var7);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var25;
                            if (var25 >= var12) {
                                var25 = 0;
                            }
                            ++var27;
                        }
                    }
                    if (var29 - -var23 <= class494.field7150) {
                        var10 = false;
                    } else {
                        var23 = -var29 + class494.field7150;
                    }
                    if (class383.field5502 == var24) {
                        this.method223(var22, var4, var21, true, var29, var23, var6 + var8);
                        if (var10) {
                            break label128;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[2] = var23 + var29;
                        var41[0] = var8;
                        var41[1] = var24;
                        int[][] var42 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var42;
                        var7 = var6;
                        var13 = 0;
                        var6 = class322.method1908(class383.field5502, -126, var21);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var43 = var5;
                        if (~var5 > -1) {
                            var43 = class383.field5502 + var5;
                        }
                        if (~class383.field5502 > ~var43) {
                            var43 -= class383.field5502;
                        }
                        var9 = 0;
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var43 >= var44[0] && ~var43 >= ~var44[1]) {
                                var11 = false;
                                break;
                            }
                            ++var9;
                            if (var12 <= var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[0] = var8;
                        var45[1] = var24;
                        var45[2] = var23 + var29;
                        this.method223(var22, var4, var21, true, var29, var23, var6 + var8);
                        var8 = var24;
                    }
                }
            }
        }
        int var46 = 68 % (arg1 / 50);
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field459 = arg0.method1844(-121);
                                        }
                                    } else {
                                        this.field466 = arg0.method1844(-104);
                                    }
                                } else {
                                    this.field449 = arg0.method1869(-66);
                                }
                            } else {
                                this.field450 = arg0.method1844(-113);
                            }
                        } else {
                            this.field463 = arg0.method1844(-116);
                        }
                    } else {
                        this.field455 = arg0.method1844(-116);
                    }
                } else {
                    this.field465 = arg0.method1844(-108);
                }
            } else {
                this.field453 = arg0.method1844(-120);
            }
        } else {
            this.field461 = arg0.method1869(-100);
        }
        ++field454;
        if (arg1 < 16) {
            this.method146((byte) -62);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lsv;Lor;II)V")
    public static final void method220(class319 arg0, class173 arg1, int arg2, int arg3) {
        ++field458;
        class140 var4 = new class140();
        var4.field2087 = arg0.method1869(-102);
        var4.field2097 = arg0.method1863(-1);
        var4.field2093 = new int[var4.field2087];
        var4.field2089 = new int[var4.field2087];
        var4.field2092 = new int[var4.field2087];
        var4.field2096 = new class464[var4.field2087];
        var4.field2100 = new class464[var4.field2087];
        if (arg3 <= 85) {
            field457 = null;
        }
        var4.field2090 = new byte[var4.field2087][][];
        for (int var5 = 0; var4.field2087 > var5; ++var5) {
            try {
                int var6 = arg0.method1869(-69);
                if (~var6 != -1 && var6 != 1 && ~var6 != -3) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var7 = arg0.method1871(94);
                        String var8 = arg0.method1871(70);
                        int var9 = arg0.method1869(-90);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var9 > var11; ++var11) {
                            var10[var11] = arg0.method1871(34);
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; var13 < var9; ++var13) {
                                int var14 = arg0.method1863(-1);
                                var12[var13] = new byte[var14];
                                arg0.method1887(0, var12[var13], var14, true);
                            }
                        }
                        var4.field2093[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; var9 > var16; ++var16) {
                            var15[var16] = class72.method571(8, var10[var16]);
                        }
                        var4.field2100[var5] = arg1.method1201(var8, class72.method571(8, var7), 0, var15);
                        var4.field2090[var5] = var12;
                    }
                } else {
                    String var17 = arg0.method1871(103);
                    String var18 = arg0.method1871(100);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method1863(-1);
                    }
                    var4.field2093[var5] = var6;
                    var4.field2092[var5] = var19;
                    var4.field2096[var5] = arg1.method1185(124, var18, class72.method571(8, var17));
                }
            } catch (ClassNotFoundException var20) {
                var4.field2089[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2089[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2089[var5] = -3;
            } catch (Exception var23) {
                var4.field2089[var5] = -4;
            } catch (Throwable var24) {
                var4.field2089[var5] = -5;
            }
        }
        class71.field1020.method3139(0, var4);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIIIII)V")
    public static final void method221(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field456;
        int var9 = arg1 + 1;
        class188.method1259(arg4, (byte) 27, arg3, arg2, class42.field626[arg1]);
        int var10 = arg5 - 1;
        class188.method1259(arg4, (byte) 27, arg3, arg2, class42.field626[arg5]);
        if (arg0 != -82) {
            field457 = null;
        }
        for (int var6 = var9; var6 <= var10; ++var6) {
            int[] var7 = class42.field626[var6];
            var7[arg4] = var7[arg3] = arg2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
    public static final void method222(int arg0, int arg1, int arg2) {
        ++field452;
        if (arg1 >= -8) {
            field457 = null;
        }
        class314 var3 = class177.method1213(false, 14, arg2);
        var3.method1808(-7412);
        var3.field4253 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[[ILjava/util/Random;ZIII)V")
    private final void method223(int arg0, int[][] arg1, Random arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field462;
        int var8 = this.field459 <= 0 ? 4096 : 4096 + -class322.method1908(this.field459, -127, arg2);
        int var9 = this.field466 * this.field464 >> 12;
        if (!arg3) {
            this.field450 = 119;
        }
        int var10 = this.field464 + -(~var9 < -1 ? class322.method1908(var9, -126, arg2) : 0);
        if (arg6 >= class383.field5502) {
            arg6 -= class383.field5502;
        }
        if (var10 <= 0) {
            if (~class383.field5502 <= ~(arg0 + arg6)) {
                for (int var11 = 0; var11 < arg5; ++var11) {
                    class57.method370(arg1[arg4 + var11], arg6, arg0, var8);
                }
            } else {
                int var12 = -arg6 + class383.field5502;
                for (int var13 = 0; var13 < arg5; ++var13) {
                    int[] var14 = arg1[arg4 - -var13];
                    class57.method370(var14, arg6, var12, var8);
                    class57.method370(var14, 0, -var12 + arg0, var8);
                }
            }
        } else if (~arg5 < -1 && ~arg0 < -1) {
            int var15 = arg0 / 2;
            int var16 = arg5 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = ~var10 >= ~var16 ? var10 : var16;
            int var19 = arg6 + var17;
            int var20 = -(var17 * 2) + arg0;
            for (int var21 = 0; arg5 > var21; ++var21) {
                int[] var22 = arg1[arg4 + var21];
                if (~var21 > ~var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field449 == 0) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class375.method2245(class120.field1872, arg6 + var24)] = var22[class375.method2245(-var24 + arg6 - (-arg0 - -1), class120.field1872)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class375.method2245(class120.field1872, arg6 + var26)] = var22[class375.method2245(arg0 + arg6 - var26 + -1, class120.field1872)] = ~var23 < ~var28 ? var28 : var23;
                        }
                    }
                    if (~(var19 - -var20) >= ~class383.field5502) {
                        class57.method370(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class383.field5502;
                        class57.method370(var22, var19, var27, var23);
                        class57.method370(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = arg5 - var21 + -1;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field449 == -1) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class375.method2245(arg6 + var31, class120.field1872)] = var22[class375.method2245(class120.field1872, arg0 + arg6 + -var31 + -1)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class375.method2245(class120.field1872, arg6 + var33)] = var22[class375.method2245(class120.field1872, -var33 + -1 + arg0 + arg6)] = var30 <= var35 ? var30 : var35;
                            }
                        }
                        if (class383.field5502 < var19 + var20) {
                            int var34 = -var19 + class383.field5502;
                            class57.method370(var22, var19, var34, var30);
                            class57.method370(var22, 0, -var34 + var20, var30);
                        } else {
                            class57.method370(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class375.method2245(class120.field1872, arg6 - -var36)] = var22[class375.method2245(class120.field1872, -var36 + arg0 + arg6 + -1)] = var8 * var36 / var17;
                        }
                        if (~(var19 + var20) >= ~class383.field5502) {
                            class57.method370(var22, var19, var20, var8);
                        } else {
                            int var37 = class383.field5502 - var19;
                            class57.method370(var22, var19, var37, var8);
                            class57.method370(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
    public final void method146(byte arg0) {
        if (arg0 > -84) {
            this.field464 = 46;
        }
        ++field460;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
    public static void method224(boolean arg0) {
        if (!arg0) {
            field457 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class30() {
        super(0, true);
    }

    static {
        new class157("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
    }
}
